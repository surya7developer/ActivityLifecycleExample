package com.activity.lifecycle.example

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import com.activity.lifecycle.example.Tag.TAG_MainActivity
import com.activity.lifecycle.example.Tag.TAG_PrintActivityState

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d(TAG_PrintActivityState,TAG_MainActivity.plus(" onCreate()"))
    }

    override fun onStart() {
        super.onStart()
        Log.d(TAG_PrintActivityState,TAG_MainActivity.plus(" onStart()"))
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG_PrintActivityState,TAG_MainActivity.plus(" onResume()"))
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG_PrintActivityState,TAG_MainActivity.plus(" onPause()"))
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG_PrintActivityState,TAG_MainActivity.plus(" onStop()"))
    }

    override fun onRestart() {
        super.onRestart()
        Log.d(TAG_PrintActivityState,TAG_MainActivity.plus(" onRestart()"))
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG_PrintActivityState,TAG_MainActivity.plus(" onDestroy()"))
    }

    override fun onBackPressed() {
        super.onBackPressed()
        Log.d(TAG_PrintActivityState,TAG_MainActivity.plus(" onBackPressed()"))
    }


    fun nextActivity(view: View) {
        startActivity(Intent(this,NextActivity::class.java))
    }
}