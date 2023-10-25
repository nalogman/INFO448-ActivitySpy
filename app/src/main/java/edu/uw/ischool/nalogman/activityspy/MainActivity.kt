package edu.uw.ischool.nalogman.activityspy

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private val TAG = "MainActivity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.i(TAG, "onCreate event fired")
    }

    override fun onStart() {
        super.onStart()

        // Log onStart event
        Log.i(TAG, "onStart event fired")
    }

    override fun onResume() {
        super.onResume()

        // Log onResume event
        Log.i(TAG, "onResume event fired")
    }

    override fun onPause() {
        super.onPause()

        // Log onPause event
        Log.i(TAG, "onPause event fired")
    }

    override fun onStop() {
        super.onStop()

        // Log onStop event
        Log.i(TAG, "onStop event fired")
    }

    override fun onDestroy() {
        super.onDestroy()

        // Log onDestroy event
        Log.i(TAG, "onDestroy event fired")

        // Log an error message
        Log.e(TAG, "We're going down, Captain! --Star Trek")
    }
}