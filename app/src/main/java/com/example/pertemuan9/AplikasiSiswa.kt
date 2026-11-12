package com.example.pertemuan9

import android.app.Application
import com.example.pertemuan9.repositori.ContainerApp
import com.example.pertemuan9.repositori.DefaultContainerApp

class AplikasiSiswa : Application() {

    lateinit var container: ContainerApp

    override fun onCreate() {
        super.onCreate()
        container = DefaultContainerApp(this)
    }
}
