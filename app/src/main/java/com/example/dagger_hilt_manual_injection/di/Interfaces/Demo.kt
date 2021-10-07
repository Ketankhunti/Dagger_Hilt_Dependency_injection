package com.example.dagger_hilt_manual_injection.di.Interfaces

import android.util.Log
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Inject
import javax.inject.Singleton

interface DemoOne{
    fun demoOne()
}

class DemoOneImplementation @Inject constructor():DemoOne{

    override fun demoOne() {
        Log.d("main","this is demo one implementation")
    }
}

class DemoMain @Inject constructor(private val demoOne: DemoOne){
 fun main(){
     demoOne.demoOne()
 }
}

@Module
@InstallIn(SingletonComponent::class)
abstract class AppModule2{
    @Binds
    @Singleton
    abstract fun peovidesOne(demoOneImplementation: DemoOneImplementation):DemoOne
}