package com.example.myapplication14mhdi12also

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import androidx.lifecycle.viewmodel.viewModelFactory
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class MyViewModel: ViewModel() {
    private val Tag:String="jk"
    init {
        viewModelScope.launch {
            while (true) {
                delay(400)
                Log.d(Tag, "jajiKalyni")
            }
        }
    }
//        override fun onCleared(){
//            Log.d(Tag,"Destroyed")
//        }
}
