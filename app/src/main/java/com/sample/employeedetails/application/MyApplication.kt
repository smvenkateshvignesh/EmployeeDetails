package com.sample.employeedetails.application

import android.app.Application
import android.content.Context

class MyApplication: Application() {
    init {
        myApplication = this
    }
    //Vignesh new
    companion object {
        private lateinit var myApplication: Application
        fun getApplicationContext(): Context {
            return myApplication
        }
    }
}