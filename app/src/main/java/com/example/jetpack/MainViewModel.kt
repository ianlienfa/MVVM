package com.example.jetpack

import androidx.lifecycle.MutableLiveData

class MainViewModel {
    var ani = MutableLiveData<Animal>()
    init {
        ani.value = Animal("", 0)
    }
    fun getShout(shout: Int)
    {
        ani.value!!.shoutct = shout
    }
}