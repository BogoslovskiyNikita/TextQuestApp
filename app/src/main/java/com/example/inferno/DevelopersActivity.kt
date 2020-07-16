package com.example.inferno

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_developers.*

class DevelopersActivity : AppCompatActivity() {
    private var flag: Boolean = true
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_developers)

        ExitDevelopers.setOnClickListener {
            flag = false
            val intent = Intent(applicationContext, MainActivity::class.java)
            startActivity(intent)
            finish()
        }
    }

    override fun onBackPressed() {
        flag = false
        val intent = Intent(applicationContext, MainActivity::class.java)
        startActivity(intent)
        finish()
    }
    override fun onPause() {
        super.onPause()
        if(flag){
            stopService(Intent(this, MyService::class.java))
        }
    }

    override fun onResume() {
        flag = true
        super.onResume()
        startService(Intent(this, MyService::class.java))
    }
}
