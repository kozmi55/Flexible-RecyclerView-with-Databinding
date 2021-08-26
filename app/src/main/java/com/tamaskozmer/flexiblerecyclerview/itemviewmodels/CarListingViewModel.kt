package com.tamaskozmer.flexiblerecyclerview.itemviewmodels

import com.tamaskozmer.flexiblerecyclerview.CarListViewModel
import com.tamaskozmer.flexiblerecyclerview.ItemViewModel
import com.tamaskozmer.flexiblerecyclerview.R

class CarListingViewModel(
    val make: String,
    val model: String,
    val price: String,
    private val onItemClick: (String) -> Unit
) : ItemViewModel {

    override val layoutId: Int = R.layout.item_car_listing

    override val viewType: Int = CarListViewModel.LISTING_ITEM

    fun onClick() {
        onItemClick("$make $model for $price")
    }
}