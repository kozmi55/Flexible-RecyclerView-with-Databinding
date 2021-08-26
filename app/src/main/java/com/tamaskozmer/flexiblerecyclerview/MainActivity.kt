package com.tamaskozmer.flexiblerecyclerview

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import com.tamaskozmer.flexiblerecyclerview.databinding.ActivityMainBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    private val viewModel: CarListViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        binding.lifecycleOwner = this
        binding.viewModel = viewModel
        setContentView(binding.root)

        viewModel.events.observe(this, { event ->
            event.getContentIfNotHandled()?.let {
                handleAction(it)
            }
        })
    }

    private fun handleAction(carListEvent: CarListEvent) {
        when (carListEvent) {
            is CarListEvent.ShowSelectedCar -> showCarDetailsDialog(carListEvent.carDetails)
        }
    }

    private fun showCarDetailsDialog(carDetails: String) {
        AlertDialog.Builder(this)
            .setMessage(carDetails)
            .show()
    }
}