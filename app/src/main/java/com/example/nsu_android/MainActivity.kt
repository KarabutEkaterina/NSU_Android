package com.example.nsu_android

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mainLog("onCreate")

        val button = findViewById<Button>(R.id.mainButton)
        button.setOnClickListener {
            openList()
        }
    }

    override fun onStart() {
        super.onStart()

        mainLog("onStart")
    }

    override fun onResume() {
        super.onResume()

        mainLog("onResume")
    }

    override fun onStop() {
        super.onStop()

        mainLog("onStop")
    }

    override fun onPause() {
        super.onPause()

        mainLog("onPause")
    }

    override fun onDestroy() {
        super.onDestroy()

        mainLog("onDestroy")
    }

    private fun openList() {
        val openIntent = Intent(this, ListActivity::class.java)
        startActivity(openIntent)
    }

    private fun mainLog(method: String) {
        Log.d("Lifecycle", "Main Activity: $method")
    }
}