package com.example.inferno

import android.content.DialogInterface
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_rock_paper_scissors.*
import kotlin.random.Random

class RockPaperScissorsActivity : AppCompatActivity() {

    var playerWon = false
    var flag = false;

    var dobryniaPoints = 0;
    var playerPoints = 0;

    var dobryniaChoice = 'b';
    var playerChoice = 'b';

    var replic = ""


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_rock_paper_scissors)

        val k: Int = Random.nextInt(3);
        var thing = "";
        if (k == 0) {
            dobryniaChoice = 'r'
            thing = " камень. \n"
        }
        if (k == 1) {
            dobryniaChoice = 'p'
            thing = " бумагу. \n"
        }
        if (k == 2) {
            dobryniaChoice = 's'
            thing = " ножницы. \n"
        }
        replic = getString(R.string.dobrynya_choose) + thing;


        rock.setOnClickListener() {
            playerChoice = 'r'
            if (dobryniaChoice == 'r') {
                replic = replic + getString(R.string.tie) + " " + dobryniaPoints + ":" + playerPoints

                dobryniaChoice = 's'
                thing = " ножницы.\n"

            } else {
                if (dobryniaChoice == 's') {
                    playerPoints++
                    replic = replic + getString(R.string.win) + " " + dobryniaPoints + ":" + playerPoints

                    dobryniaChoice = 'p'
                    thing = " бумагу.\n"

                } else {
                    dobryniaPoints++
                    replic = replic + getString(R.string.lose) + " " + dobryniaPoints + ":" + playerPoints

                    dobryniaChoice = 'r'
                    thing = " камень.\n"

                }
            }

            dobrynya_text.text = replic
            replic = getString(R.string.dobrynya_choose) + thing;


            if (dobryniaPoints >= 3 || playerPoints >= 3) {
                if (dobryniaPoints < playerPoints) playerWon = true;

                /*
                val wonIntent = Intent(this, EndStoryActivity::class.java)
                wonIntent.putExtra(EndStoryActivity.WON, playerWon)
                startActivity(wonIntent)

                 */
            }
        }

        paper.setOnClickListener() {
            playerChoice = 'p'

            if (dobryniaChoice == 'p') {
                replic = replic + getString(R.string.tie) + " " + dobryniaPoints + ":" + playerPoints

                dobryniaChoice = 'r'
                thing = " камень.\n"

            } else {
                if (dobryniaChoice == 'r') {
                    playerPoints++
                    replic = replic + getString(R.string.win) + " " + dobryniaPoints + ":" + playerPoints

                    dobryniaChoice = 's'
                    thing = " ножницы.\n"

                } else {
                    dobryniaPoints++
                    replic = replic + getString(R.string.lose) + " " + dobryniaPoints + ":" + playerPoints

                    dobryniaChoice = 'p'
                    thing = " бумагу.\n"

                }
            }

            dobrynya_text.text = replic;
            replic = getString(R.string.dobrynya_choose) + thing


            if (dobryniaPoints >= 3 || playerPoints >= 3) {
                if (dobryniaPoints < playerPoints) playerWon = true;

                /*
                val wonIntent = Intent(this, EndStoryActivity::class.java)
                wonIntent.putExtra(EndStoryActivity.WON, playerWon)
                startActivity(wonIntent)

                 */
            }

        }
        scissors.setOnClickListener() {
            playerChoice = 's'

            if (dobryniaChoice == 's') {
                replic = replic + getString(R.string.tie) + " " + dobryniaPoints + ":" + playerPoints

                dobryniaChoice = 'p'
                thing = " бумагу.\n"

            } else {
                if (dobryniaChoice == 'p') {
                    playerPoints++
                    replic = replic + getString(R.string.win) + " " + dobryniaPoints + ":" + playerPoints

                    dobryniaChoice = 'r'
                    thing = " камень.\n"

                } else {
                    dobryniaPoints++
                    replic = replic + getString(R.string.lose) + " " + dobryniaPoints + ":" + playerPoints

                    dobryniaChoice = 's'
                    thing = " ножницы.\n"

                }
            }

            dobrynya_text.text = replic
            replic = getString(R.string.dobrynya_choose) + thing;

            if (dobryniaPoints >= 3 || playerPoints >= 3) {
                if (dobryniaPoints < playerPoints) playerWon = true;

                /*
                val wonIntent = Intent(this, EndStoryActivity::class.java)
                wonIntent.putExtra(EndStoryActivity.WON, playerWon)
                startActivity(wonIntent)

                 */
            }
        }

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
            DialogInterface.OnClickListener { dialog, which -> finish()
                val intent = Intent(applicationContext, MainActivity::class.java)
                startActivity(intent)
                finish()})

        val alertDialog = builder.create()
        alertDialog.show()
    }
}
