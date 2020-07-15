package com.example.inferno

import android.content.Intent
import android.media.MediaPlayer
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_tree_game.*
import kotlin.random.Random


class TreeGameActivity : AppCompatActivity() {

    private var sound1: MediaPlayer? = null
    private var sound2: MediaPlayer? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tree_game)

        sound1 = MediaPlayer.create(this, R.raw.sirena)
        val sound1 = sound1 ?: return
        sound2 = MediaPlayer.create(this, R.raw.sound2)
        val sound2 = sound2 ?: return

        var count = 0
        var won = 0;
        var number = 0;

        user_choice.visibility = View.GONE
        //ded_say.text = getString(R.string.tree_begin1)
        btn_answer.visibility = View.GONE

        next_ded_say.setOnClickListener() {
            ded_say.text = getString(R.string.tree_begin2)
            btn_answer.visibility = View.VISIBLE
            next_ded_say.visibility = View.GONE
            user_choice.visibility = View.VISIBLE

        }


        btn_answer.setOnClickListener() {
            count++

            if (count in 1..4) {
                try {
                    number = Integer.parseInt(user_choice.text.toString())
                    if (number > 10 || number < 1) throw Exception()
                } catch (e : Exception) {
                    count--;
                    number = 0
                    Toast.makeText(this, getString(R.string.tree_err), Toast.LENGTH_LONG).show()
                }
            }

            if (number > 0) {
                when (count) {
                    1 -> {
                        ded_say.text = getString(R.string.tree_first, number)
                    }
                    2 -> {
                        ded_say.text = getString(R.string.tree_second)

                    }
                    3 -> {
                        ded_say.text = getString(R.string.tree_third, number)

                    }
                    4 -> {
                        /*Шанс победить 1 к 9 (сколько раз запускала (много), всегда проигрыш)*/

                        val dedNumber = Random.nextInt(10) + 1

                        if (number == dedNumber) {
                            sound1.start()
                            ded_say.text = getString(R.string.tree_won, number)
                            won = 1
                        } else {
                            sound2.start()
                            ded_say.text = getString(R.string.tree_lose)
                            won = 0
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
                            won = 1
                        } else {
                            ded_say.text = getString(R.string.tree_lose)
                            won = 0
                        }*/

                        btn_answer.text = getString(R.string.nextDedSay)
                        user_choice.visibility = View.GONE

                    }
                    5 -> {
                       /* val wonIntent = Intent(this, EndStoryActivity::class.java)
                        wonIntent.putExtra(EndStoryActivity.WON, won)
                        user_choice.visibility = View.GONE
                        startActivity(wonIntent)*/
                    }
                }
                user_choice.text.clear()

            }

        }
    }
}
