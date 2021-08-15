package com.tamaskozmer.flexiblerecyclerview.itemviewmodels

import com.tamaskozmer.flexiblerecyclerview.CarListViewModel
import com.tamaskozmer.flexiblerecyclerview.ItemViewModel
import com.tamaskozmer.flexiblerecyclerview.R

class CarAdViewModel(val make: String, val model: String, val price: String) : ItemViewModel {

    override val layoutId: Int = R.layout.item_car_listing_ad

    override val viewType: Int = CarListViewModel.AD_ITEM
}