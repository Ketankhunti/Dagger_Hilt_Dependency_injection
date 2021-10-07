package com.example.dagger_hilt_manual_injection.di

import android.util.Log

class Car constructor(private val engine: Engine , private val wheel: Wheel) {
    fun getCar(){
        Log.d("main","Car is running")
    }
}

class Engine {
    fun getEngine(){
        Log.d("main","Engine is running")
    }
}

class Wheel {
    fun getWheel(){
        Log.d("main","Wheel is running")
    }
}