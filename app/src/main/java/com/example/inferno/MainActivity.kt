package com.example.inferno

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.system.exitProcess

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        StartGame.setOnClickListener() {
            val intent = Intent(applicationContext, StoryActivity::class.java)
            startActivity(intent)
        }

        //есть баг, не всегда работает корректно.
        //может отказаться от этой кнопки? в современных приложениях почти не встречал такого.
        Exit.setOnClickListener() {
            finish()
            exitProcess(0)
        }

        Developers.setOnClickListener() {
            val intent = Intent(applicationContext, DevelopersActivity::class.java)
            startActivity(intent)
        }

    }
}
