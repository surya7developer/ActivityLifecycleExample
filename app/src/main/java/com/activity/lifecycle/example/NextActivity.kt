package com.activity.lifecycle.example

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class NextActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_next)
        Log.d(Tag.TAG_PrintActivityState, Tag.TAG_NextActivity.plus(" onCreate()"))
    }

    override fun onStart() {
        super.onStart()
        Log.d(Tag.TAG_PrintActivityState, Tag.TAG_NextActivity.plus(" onStart()"))
    }

    override fun onResume() {
        super.onResume()
        Log.d(Tag.TAG_PrintActivityState, Tag.TAG_NextActivity.plus(" onResume()"))
    }

    override fun onPause() {
        super.onPause()
        Log.d(Tag.TAG_PrintActivityState, Tag.TAG_NextActivity.plus(" onPause()"))
    }

    override fun onStop() {
        super.onStop()
        Log.d(Tag.TAG_PrintActivityState, Tag.TAG_NextActivity.plus(" onStop()"))
    }

    override fun onRestart() {
        super.onRestart()
        Log.d(Tag.TAG_PrintActivityState, Tag.TAG_NextActivity.plus(" onRestart()"))
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(Tag.TAG_PrintActivityState, Tag.TAG_NextActivity.plus(" onDestroy()"))
    }

    override fun onBackPressed() {
        super.onBackPressed()
        Log.d(Tag.TAG_PrintActivityState, Tag.TAG_NextActivity.plus(" onBackPressed()"))
    }

}