package com.example.dagger_hilt_manual_injection

import android.app.Application
import com.example.dagger_hilt_manual_injection.di.Car
import com.example.dagger_hilt_manual_injection.di.Engine
import com.example.dagger_hilt_manual_injection.di.Interfaces.AppModule
import com.example.dagger_hilt_manual_injection.di.Wheel
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class BaseApplication : Application() {
    val car = Car(Engine(), Wheel())
    val main = AppModule.main
}