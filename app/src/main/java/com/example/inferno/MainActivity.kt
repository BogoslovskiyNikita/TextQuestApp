package com.example.inferno

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        StartGame.setOnClickListener() {
            val intent = Intent(applicationContext, StoryActivity::class.java)
            startActivity(intent)
        }

        Exit.setOnClickListener() {
            finish()
            System.exit(0)
        }
    }
}
