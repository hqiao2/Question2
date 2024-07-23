package com.example.question2

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.question2.R

class ReceivingActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.receiving_data)

        val intent = intent
        val data = intent.getStringExtra("data")

        val textView: TextView = findViewById(R.id.textView)
        textView.text = data
    }
}