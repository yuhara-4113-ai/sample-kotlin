package com.example.sampleKotlin;

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val myTextView = findViewById<TextView>(R.id.myTextView)
        myTextView.text = "Hello, Again!"
    }
}