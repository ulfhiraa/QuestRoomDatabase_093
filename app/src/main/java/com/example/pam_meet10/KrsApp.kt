package com.example.pam_meet10

import android.app.Application
import com.example.pam_meet10.dependenciesinjection.ContainerApp

class KrsApp : Application() {
    // fungsinya untuk menyimpan instance ContainerApp
    lateinit var containerApp: ContainerApp

    override fun onCreate() {
        super.onCreate()
        // membuat instance ContainerApp
        containerApp = ContainerApp(this)
        // instnace adalah object yang dibuat dari class
    }
}