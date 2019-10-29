package com.example.responsi008

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class ActivityKedua : AppCompatActivity() {
    lateinit var hasil: String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kedua)

        var intent = intent
        var username = intent.getStringExtra("Username")
        var pasword = intent.getStringExtra("Pasword")

    }
}
