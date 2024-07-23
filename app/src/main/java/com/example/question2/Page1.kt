package com.example.question2

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity


class Page1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.page1)

        val buttonBackToMain: Button = findViewById(R.id.buttonBackToMain)
        buttonBackToMain.setOnClickListener {
            onBackPressed()
        }
    }

}