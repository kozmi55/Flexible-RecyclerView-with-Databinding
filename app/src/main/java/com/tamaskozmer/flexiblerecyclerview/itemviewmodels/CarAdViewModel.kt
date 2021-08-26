package com.tamaskozmer.flexiblerecyclerview.itemviewmodels

import android.graphics.Color
import androidx.databinding.BaseObservable
import androidx.databinding.Bindable
import com.tamaskozmer.flexiblerecyclerview.BR
import com.tamaskozmer.flexiblerecyclerview.CarListViewModel
import com.tamaskozmer.flexiblerecyclerview.ItemViewModel
import com.tamaskozmer.flexiblerecyclerview.R
import java.util.*

class CarAdViewModel(
    val make: String,
    val model: String,
    val price: String,
    @get:Bindable var borderColor: Int = Color.RED
) : BaseObservable(), ItemViewModel {

    override val layoutId: Int = R.layout.item_car_listing_ad

    override val viewType: Int = CarListViewModel.AD_ITEM

    fun onClick() {
        borderColor = getRandomColor()
        notifyPropertyChanged(BR.borderColor)
    }

    private fun getRandomColor(): Int {
        val rnd = Random()
        return Color.rgb(rnd.nextInt(256), rnd.nextInt(256), rnd.nextInt(256))
    }
}