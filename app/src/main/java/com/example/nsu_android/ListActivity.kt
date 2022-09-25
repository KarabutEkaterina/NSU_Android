package com.example.nsu_android

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.LinearLayout
import android.widget.LinearLayout.*
import android.widget.LinearLayout.LayoutParams.*
import android.widget.TextView

class ListActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list)

        listLog("onCreate")

        val listContent = findViewById<LinearLayout>(R.id.listContent)

        val range = 1..50 // [1, 2, ... 50]
        val data = range.map { index ->
            "Item $index"
        } // ["Item 1", "Item 2", ...]

        data.forEach { text ->
            val textView = TextView(this)
            textView.text = text
            textView.layoutParams = LayoutParams(MATCH_PARENT, WRAP_CONTENT)
            listContent.addView(textView)
        }
    }

    override fun onStart() {
        super.onStart()

        listLog("onStart")
    }

    override fun onResume() {
        super.onResume()

        listLog("onResume")
    }

    override fun onStop() {
        super.onStop()

        listLog("onStop")
    }

    override fun onPause() {
        super.onPause()

        listLog("onPause")
    }

    override fun onDestroy() {
        super.onDestroy()

        listLog("onDestroy")
    }



    private fun listLog(method: String) {
        Log.d("Lifecycle", "List Activity: $method")
    }
}