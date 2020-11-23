package com.example.timberdemo

import android.app.Application
import timber.log.Timber

class PushTimber : Application() {
    override fun onCreate() {
        super.onCreate()
        Timber.plant(Timber.DebugTree())
    }
}