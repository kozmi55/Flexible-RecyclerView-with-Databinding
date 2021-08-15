package com.tamaskozmer.flexiblerecyclerview

import androidx.annotation.LayoutRes

interface ItemViewModel {
    @get:LayoutRes
    val layoutId: Int
    val viewType: Int
        get() = 0
}