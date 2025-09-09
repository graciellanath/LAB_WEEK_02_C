package com.example.lab_week_02_c

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity

class StandardActivity : AppCompatActivity() {
    companion object { private const val TAG = "StandardActivity" }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_standard)
        Log.d(TAG, "onCreate")
    }

    override fun onStart() { super.onStart(); Log.d(TAG, "onStart") }
    override fun onResume() { super.onResume(); Log.d(TAG, "onResume") }
    override fun onPause() { super.onPause(); Log.d(TAG, "onPause") }
    override fun onStop() { super.onStop(); Log.d(TAG, "onStop") }
    override fun onDestroy() { super.onDestroy(); Log.d(TAG, "onDestroy") }
}
