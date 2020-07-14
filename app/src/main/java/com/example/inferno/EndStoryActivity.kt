package com.example.inferno

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class EndStoryActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val end = intent.extras
        if (end != null) {
            if (end["badEnd"] != null) {
                setContentView(R.layout.bad_end_of_the_story)
            } else {
                setContentView(R.layout.activity_end_story)
            }
        }
    }

    override fun onBackPressed() {
        val intent = Intent(applicationContext, MainActivity::class.java)
        startActivity(intent)
    }
}