package com.tamaskozmer.flexiblerecyclerview.itemviewmodels

import android.view.View
import com.tamaskozmer.flexiblerecyclerview.CarListViewModel
import com.tamaskozmer.flexiblerecyclerview.ItemViewModel
import com.tamaskozmer.flexiblerecyclerview.R

class CarListingViewModel(
    val id: Long,
    val make: String,
    val model: String,
    val price: String,
    private val onItemClick: (String) -> Unit,
    private val onLongClick: () -> Unit
) : ItemViewModel {

    override val layoutId: Int = R.layout.item_car_listing

    override val viewType: Int = CarListViewModel.LISTING_ITEM

    fun onClick() {
        onItemClick("$make $model for $price")
    }

    fun onLongClick(view: View): Boolean {
        onLongClick()
        return true
    }

    override fun areItemsTheSame(other: ItemViewModel) = this === other

    override fun areContentsTheSame(other: ItemViewModel): Boolean {
        return if (other is CarAdViewModel) {
            other.id == id
        } else {
            false
        }
    }
}