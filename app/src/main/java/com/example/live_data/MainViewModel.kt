package com.example.live_data

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel: ViewModel() {
   private val factsLiveDataObject = MutableLiveData<String>("MUTABLE LIVE DATA")


    val factsLiveData : LiveData<String>
        get() = factsLiveDataObject


    fun updateLiveData(){
        factsLiveDataObject.value = "NIKAL BSDK"
    }
}