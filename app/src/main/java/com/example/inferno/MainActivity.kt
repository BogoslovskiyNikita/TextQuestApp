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

        //todo: добавить finish() везде

        StartGame.setOnClickListener() {
            val intent = Intent(applicationContext, IntroductionActivity::class.java)
            startActivity(intent)
            finish()
        }

        //есть баг, не всегда работает корректно.
        //может отказаться от этой кнопки? в современных приложениях почти не встречал такого.
        Exit.setOnClickListener() {
            exitProcess(0)
        }

        Developers.setOnClickListener() {
            val intent = Intent(applicationContext, DevelopersActivity::class.java)
            startActivity(intent)
        }

    }
}
