package com.example.inferno

import android.content.DialogInterface
import android.content.Intent
import android.content.res.Resources
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AlertDialog
import com.example.inferno.choose_logic.*
import com.example.inferno.player.*
import kotlinx.android.synthetic.main.activity_reserve_story.*

class ReserveStoryActivity : AppCompatActivity() {
    var storage = Replics()
    var player = Player(100)
    private var player1: MediaPlayer? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN
        actionBar?.hide()

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_story)

        update(storage.replics[1]!!)
        updateHp(0)

    }


    //обновление актуального хп и изображения
    fun updateHp(changeHp: Int) {
        player.changeHp(changeHp)
        hp.setImageResource(getResIDByName(player.hpPic))
    }

    //обновление актуального предмета и изображения
    fun updateItem(hand: String, item: Item) {
        player.addItem(item.name, hand)
        if (hand == "left" && player.leftHand != null) {
            leftHand.setImageResource(getResIDByItem(player.leftHand!!))
        }
        if (hand == "right" && player.rightHand != null) {
            rightHand.setImageResource(getResIDByItem(player.rightHand!!))
        }
    }

    fun update(replica: Replica) {

        button.setText(replica.firstChoose)
        if (replica is GameReplica) {
            button.setOnClickListener() {
                if (replica.gameName == "tree") {
                    var intent = Intent(applicationContext, TreeGameActivity::class.java)
                    startActivity(intent)
                    finish()
                } else {
                    var intent = Intent(applicationContext, RockPaperScissorsActivity::class.java)
                    startActivity(intent)
                    finish()
                }
            }
        } else button.setOnClickListener() {
            update(storage.replics[replica.fstLink]!!)
        }

        if (replica.secondBtnIsVisible) {
            button2.setVisibility(View.VISIBLE)
            button2.setText(replica.secondChoose)
            button2.setOnClickListener() {
                update(storage.replics[replica.scndLink]!!)
            }
        } else button2.setVisibility(View.GONE)

        if (replica.thirdBtnIsVisible) {
            button3.setVisibility(View.VISIBLE)
            button3.setText(replica.thirdChoose)
            button3.setOnClickListener() {
                update(storage.replics[replica.thirdLink]!!)
            }
        } else button3.setVisibility(View.GONE)

        textView.setText(replica.replicaText)

        if (replica is EndReplica) {
            val intent = Intent(applicationContext, EndStoryActivity::class.java)
            button.setOnClickListener() {
                if (replica.isGoodEnd) {
                    intent.putExtra("goodEnd", 78)
                } else intent.putExtra("badEnd", replica.fstLink)
                startActivity(intent)
                finish()
            }
        }



        if (replica is CheckItemReplica) {
            button.setOnClickListener() {
                if (replica.expectItemName == "Knife") {
                    if (player.checkItem("BloodyKnife") || player.checkItem("Knife")) {
                        update(storage.replics[replica.fstLink]!!)
                    }
                }
                if (player.checkItem(replica.expectItemName)) {
                    update(storage.replics[replica.fstLink]!!)
                } else update(storage.replics[replica.thirdLink]!!)
            }
        }
        if (replica is HpChangingRepilca) {
            updateHp(replica.hpChange)
        }
        if (replica is ItemChangingReplica) {
            updateItem(replica.hand, replica.item)
        }
        if (replica is DisableHandReplica) {
            updateHp(replica.hpChange)
            updateItem("left", SickHand())
        }
    }


    private fun getResIDByItem(item: Item): Int {
        var resID: Int = getResources().getIdentifier(item.pic, "drawable", getPackageName())
        return resID
    }

    private fun getResIDByName(name: String): Int {
        var resID: Int = getResources().getIdentifier(name, "drawable", getPackageName())
        return resID
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
                finish()
            })

        val alertDialog = builder.create()
        alertDialog.show()
    }

    override fun onStop() {
        super.onStop()
        player1!!.stop()
    }

    override fun onResume() {
        super.onResume()
        player1 = MediaPlayer.create(this, R.raw.inferno_background)
        player1!!.isLooping = true
        player1!!.start()
    }

}
