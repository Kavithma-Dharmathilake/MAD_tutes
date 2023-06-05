package com.example.mad_tute

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val imgHome: ImageView = findViewById(R.id.imgHome)
        val imgUser: ImageView = findViewById(R.id.imgUser)
        val fragmentHome = HomeFragment()
        val fragmentUser = UserFragment()

        imgUser.setOnClickListener {
            imgHome.setImageResource(R.drawable.home)
            imgUser.setImageResource(R.drawable.active_user)
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.fragmentContainerView, fragmentUser)
                commit()
            }
        }

        imgHome.setOnClickListener {
            imgHome.setImageResource(R.drawable.active_home)
            imgUser.setImageResource(R.drawable.user)
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.fragmentContainerView, fragmentHome)
                commit()
            }
        }
    }
}

