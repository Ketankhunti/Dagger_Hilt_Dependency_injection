package com.example.dagger_hilt_manual_injection.di.Interfaces

import android.util.Log

interface One {
    fun One()
}

class ImplementOne:One{
    override fun One() {
        Log.d("main","One is calling...")
    }

}

class Main constructor(private val one: One){
    fun main(){
        one.One()
    }
}

object AppModule{
    val main = Main(ImplementOne())
}