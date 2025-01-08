package com.example.myapplication

import android.app.Application
import com.example.myapplication.di.AppContainer
import com.example.myapplication.di.MahasiswaContainer

class MahasiswaApplications: Application() {
    lateinit var container: MahasiswaContainer
    override fun onCreate() {
        super.onCreate()
        container= MahasiswaContainer()
    }
}