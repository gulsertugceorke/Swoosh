package com.example.swoosh.Controller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

open  class BaseActivity : AppCompatActivity() {

    val TAG = "lifeCycle"
    override fun onCreate(savedInstanceState: Bundle?) {
        Log.d(TAG,"${javaClass.simpleName} OnCreate" )

        super.onCreate(savedInstanceState)
    }

    override fun onStart() {
        Log.d(TAG,"${javaClass.simpleName} OnStart" )
        super.onStart()
    }

    override fun onResume() {
        Log.d(TAG,"${javaClass.simpleName} OnResume" )

        super.onResume()
    }

    override fun onRestart() {
        Log.d(TAG,"${javaClass.simpleName} Onrestart" )

        super.onRestart()
    }
    override fun onPause() {
        Log.d(TAG,"${javaClass.simpleName} Onpause" )

        super.onPause()
    }

    override fun onStop() {
        Log.d(TAG,"${javaClass.simpleName} Onstop" )

        super.onStop()
    }

    override fun onDestroy() {
        Log.d(TAG,"${javaClass.simpleName} Ondestroy" )

        super.onDestroy()
    }
}
