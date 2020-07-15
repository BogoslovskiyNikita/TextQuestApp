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
        startService(Intent(this, MyService::class.java))
        StartGame.setOnClickListener() {
            stopService(Intent(this, MyService::class.java))
            val intent = Intent(applicationContext, StoryActivity::class.java)
            startActivity(intent)
            finish()
        }

        button.setOnClickListener() {
            stopService(Intent(this, MyService::class.java))
            val intent = Intent(applicationContext, RockPaperScissorsActivity::class.java)
            startActivity(intent)
        }

        Exit.setOnClickListener() {
            stopService(Intent(this, MyService::class.java))
            finish()
        }

        Developers.setOnClickListener() {
            val intent = Intent(applicationContext, DevelopersActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}
