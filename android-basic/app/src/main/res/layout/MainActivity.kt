package com.sample.basic

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.btnHello).setOnClickListener {
            Toast.makeText(this, "xin chào", Toast.LENGTH_SHORT).show()
        }
    }
}
