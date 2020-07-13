package com.example.inferno

import android.content.DialogInterface
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.AlertDialog

class StoryActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_story)
    }

    override fun onBackPressed() {
        val builder = AlertDialog.Builder(this)
        builder.setMessage("Если вы выйдете, весь текущий прогресс будет потерян.")
        builder.setCancelable(true)
        builder.setNegativeButton(
            "Нет, я еще останусь",
            DialogInterface.OnClickListener { dialog, which ->
                dialog.cancel()
            })
        builder.setPositiveButton(
            "Да, я наигрался",
            DialogInterface.OnClickListener { dialog, which -> 
                val intent = Intent(applicationContext, MainActivity::class.java)
                startActivity(intent)
                finish()})

        val alertDialog = builder.create()
        alertDialog.show()
    }
}
