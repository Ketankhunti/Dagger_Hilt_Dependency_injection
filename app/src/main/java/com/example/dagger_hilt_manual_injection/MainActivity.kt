package com.example.dagger_hilt_manual_injection

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.dagger_hilt_manual_injection.di.Computer
import com.example.dagger_hilt_manual_injection.di.Interfaces.DemoMain
import com.example.dagger_hilt_manual_injection.di.Interfaces.ImplementOne
import com.example.dagger_hilt_manual_injection.di.Interfaces.Main
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
   // lateinit var baseApplication: BaseApplication
    @Inject
    lateinit var computer: Computer

    @Inject
    lateinit var demoMain: DemoMain
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

       computer.getComputer()
        computer.ram.getRam()

        demoMain.main()
        // Main(ImplementOne()).main()
        // BaseApplication().main.main()

     //   baseApplication = BaseApplication()

        //baseApplication.car.getCar()
    }
}