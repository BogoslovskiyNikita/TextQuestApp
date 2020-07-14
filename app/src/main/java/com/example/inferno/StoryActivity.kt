package com.example.inferno

import android.content.DialogInterface
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AlertDialog
import kotlinx.android.synthetic.main.activity_story.*

class StoryActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_story)

        intent = Intent(this, EndStoryActivity::class.java)

        badEnd.setOnClickListener() {
            intent.putExtra("badEnd", 76)
            startActivity(intent)
        }

        goodEnd.setOnClickListener() {
            intent.putExtra("goodEnd", 0)
            startActivity(intent)
        }

    }

    override fun onBackPressed() {
        val builder = AlertDialog.Builder(this)
        builder.setMessage("Если вы выйдите, весь текущий прогресс будет потерян.")
        builder.setCancelable(true)
        builder.setNegativeButton(
            "Нет, я еще останусь",
            DialogInterface.OnClickListener { dialog, which ->
                dialog.cancel()
            })
        builder.setPositiveButton(
            "Да, я наигрался",
            DialogInterface.OnClickListener { dialog, which -> finish()
                val intent = Intent(applicationContext, MainActivity::class.java)
                startActivity(intent)})

        val alertDialog = builder.create()
        alertDialog.show()
    }
}