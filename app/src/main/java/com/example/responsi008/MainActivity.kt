package com.example.responsi008

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val username=findViewById<EditText>(R.id.username)
        val pasword=findViewById<EditText>(R.id.pasword)

        val btn=findViewById<Button>(R.id.btn_login)

        btn.setOnClickListener {
            val nnUsername=username.text.toString()
            val nnPasword=pasword.text.toString()

            val intent=Intent(this@MainActivity, ActivityKedua::class.java)

            intent.putExtra("Username",nnUsername)
            intent.putExtra("Pasword",nnPasword)
            startActivity(intent)
    }
    }
}
