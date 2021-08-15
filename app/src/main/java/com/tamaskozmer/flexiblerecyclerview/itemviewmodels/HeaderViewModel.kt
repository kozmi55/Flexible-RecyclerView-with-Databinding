package com.tamaskozmer.flexiblerecyclerview.itemviewmodels

import com.tamaskozmer.flexiblerecyclerview.CarListViewModel
import com.tamaskozmer.flexiblerecyclerview.ItemViewModel
import com.tamaskozmer.flexiblerecyclerview.R

class HeaderViewModel(val title: String) : ItemViewModel {

    override val layoutId: Int = R.layout.item_header

    override val viewType: Int = CarListViewModel.HEADER_ITEM
}