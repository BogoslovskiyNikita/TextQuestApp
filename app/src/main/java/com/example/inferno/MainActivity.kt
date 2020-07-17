package com.example.inferno

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private var flag: Boolean = true
    override fun onCreate(savedInstanceState: Bundle?) {
        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN
        actionBar?.hide()

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //todo: добавить finish() везде

        startService(Intent(this, MyService::class.java))
        StartGame.setOnClickListener() {
            val intent = Intent(applicationContext, IntroductionActivity::class.java)
            startActivity(intent)
            finish()
        }

//        button.setOnClickListener() {
//            val intent = Intent(applicationContext, RockPaperScissorsActivity::class.java)
//            startActivity(intent)
//        }

        Exit.setOnClickListener() {
            finish()
        }

        Developers.setOnClickListener() {
            flag = false
            val intent = Intent(applicationContext, DevelopersActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
    override fun onPause() {
        super.onPause()
        if(flag){
            stopService(Intent(this, MyService::class.java))
        }
    }

    override fun onBackPressed() {
        finish()
    }

    override fun onResume() {
        flag = true
        super.onResume()
        startService(Intent(this, MyService::class.java))
    }
}
