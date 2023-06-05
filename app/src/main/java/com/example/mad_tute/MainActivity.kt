package com.example.mad_tute

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.widget.ButtonBarLayout

class MainActivity : AppCompatActivity() {

    lateinit var button : Button
    lateinit var text : TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button = findViewById(R.id.btnClick)
        text = findViewById(R.id.tvMessage)

        button.setOnClickListener {
            text.text = "Hello, User!"
        }


    }


}