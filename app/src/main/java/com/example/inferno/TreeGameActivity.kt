package com.example.inferno

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_tree_game.*
import kotlin.random.Random

class TreeGameActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tree_game)

        var count = -1
        var won = false;
        var number = 0;

        user_choice.visibility = View.GONE
        ded_say.text = getString(R.string.tree_begin1)



        btn_answer.setOnClickListener() {
            count++
            user_choice.visibility = View.VISIBLE


            if (count in 1..4) {
                try {
                    number = Integer.parseInt(user_choice.text.toString())
                    if (number > 10 || number < 1) throw Exception()
                } catch (e: Exception) {
                    count--;
                    number = 0
                    Toast.makeText(this, getString(R.string.tree_err), Toast.LENGTH_LONG).show()
                }
            }

            if (count == 0) {
                ded_say.text = getString(R.string.tree_begin2)
            }

            if (count == 1 && number > 0) {
                ded_say.text = getString(R.string.tree_first, number)
            }

            if (count == 2 && number > 0) {
                ded_say.text = getString(R.string.tree_second)
            }

            if (count == 3 && number > 0) {
                ded_say.text = getString(R.string.tree_third, number)
            }

            if (count == 4 && number > 0) {

                /*Шанс победить 1 к 9 (сколько раз запускала (много), всегда проигрыш)*/

                val dedNumber = Random.nextInt(10) + 1

                if (number == dedNumber) {
                    ded_say.text = getString(R.string.tree_won, number)
                    won = true
                } else {
                    ded_say.text = getString(R.string.tree_lose)
                    won = false
                }

                /*Шанс победить 1 к 1*/

                /*val dedNumber = Random.nextInt(1,3)

                if (number > 5) {
                    number = 2
                } else {
                    number = 1
                }

                if (number == dedNumber) {
                    ded_say.text = getString(R.string.tree_won, number)
                    won = true
                } else {
                    ded_say.text = getString(R.string.tree_lose)
                    won = false
                }*/

                user_choice.visibility = View.GONE
            }

            if (count == 5 && number > 0) {

                /*val wonIntent = Intent(this, EndStoryActivity::class.java)
                wonIntent.putExtra(EndStoryActivity.WON, won)
                user_choice.visibility = View.GONE
                startActivity(wonIntent)*/

            }


            user_choice.text.clear()

        }
    }
}
