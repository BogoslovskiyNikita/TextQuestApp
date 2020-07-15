package com.example.inferno

import android.content.DialogInterface
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import androidx.appcompat.app.AlertDialog
import kotlinx.android.synthetic.main.activity_story.*

class StoryActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_story)

        intent = Intent(this, EndStoryActivity::class.java)

        //сделать поле ввода номера для теста вариативности текста концовки
        val idOfTheEnd = findViewById<EditText>(R.id.IDEndTextFieldTest)

        badEnd.setOnClickListener() {
            intent.putExtra("badEnd", Integer.parseInt(idOfTheEnd.text.toString()))
            startActivity(intent)
            finish()
        }

        goodEnd.setOnClickListener() {
            intent.putExtra("goodEnd", Integer.parseInt(idOfTheEnd.text.toString()))
            startActivity(intent)
            finish()
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