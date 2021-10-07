package com.example.dagger_hilt_manual_injection.di

import android.util.Log
import javax.inject.Inject

class Computer @Inject constructor(val ram: Ram,val hardDisk: HardDisk) {
    fun getComputer(){
        ram.getRam()
        hardDisk.getHardDisk()
        Log.d("main","My Dell Laptop is running out of time")
    }
}
class Ram @Inject constructor() {
    fun getRam(){
        Log.d("main","My Dell Laptop is running out of time")
    }
}
class HardDisk @Inject constructor() {
    fun getHardDisk(){
        Log.d("main","My Dell Laptop is running out of time")
    }
}