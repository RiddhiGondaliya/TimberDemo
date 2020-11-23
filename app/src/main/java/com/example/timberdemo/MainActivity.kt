package com.example.timberdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import timber.log.Timber

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onStart() {
        super.onStart()
       // Log.i("MainActivity", "onStart Called")
        // Timber library avoid all the unnecessary logs
        Timber.i("onStart Called")
    }

    override fun onResume() {
        super.onResume()
        Timber.i("onResumed called")
    }

    override fun onPause() {
        super.onPause()
        Timber.i("onpause called")
    }

    override fun onStop() {
        super.onStop()
        Timber.i("onstop called")
    }

    override fun onDestroy() {
        super.onDestroy()
        Timber.i("onDestroy called")
    }



}