package com.example.android.marsrealestate.overview

import android.app.Application
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import java.lang.IllegalArgumentException

class OverViewModelFactory(private val app:Application):ViewModelProvider.Factory{
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if(modelClass.isAssignableFrom(OverviewViewModel::class.java)){
            return OverviewViewModel(app) as T
        }
        throw IllegalArgumentException("Unknow viewmodel class")
    }
}