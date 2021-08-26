package com.tamaskozmer.flexiblerecyclerview

sealed class CarListEvent {
    data class ShowSelectedCar(val carDetails: String) : CarListEvent()
}
