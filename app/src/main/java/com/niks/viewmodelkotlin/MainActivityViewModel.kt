package com.niks.viewmodelkotlin

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainActivityViewModel : ViewModel() {

    //ViewModel
    //var count = 0
    //LiveData
    var count = MutableLiveData<Int>()

    init {
        count.value = 0
    }

    fun updateCount(){
        //ViewModel
        //++count
        //LiveData
        count.value = (count.value)?.plus(1)
    }
}