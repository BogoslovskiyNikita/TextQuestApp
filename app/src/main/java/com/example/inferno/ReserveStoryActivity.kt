package com.example.inferno

import android.content.DialogInterface
import android.content.Intent
import android.content.res.Resources
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AlertDialog
import com.example.inferno.choose_logic.*
import com.example.inferno.player.*
import kotlinx.android.synthetic.main.activity_reserve_story.*

//TODO: два "дальше" после яблока
//TODO: навести красоту, распихать по пакетам
//TODO: одно и то же в концовке
//TODO: проблема с SDK
//TODO: баг с собачьей игрушкой


class ReserveStoryActivity : AppCompatActivity() {
    var storage = Replics()
    var player = Player(100)

    override fun onCreate(savedInstanceState: Bundle?) {
        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN
        actionBar?.hide()

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_story)

        update(storage.replics[1]!!)
        updateHp(0)

        leftHand.setImageResource(getResIDByItem(BloodyKnife()))
    }


    //обновление актуального хп и изображения
    fun updateHp(changeHp: Int) {
        player.changeHp(changeHp)
        hp.setImageResource(getResIDByName(player.hpPic))
    }

    //обновление актуального предмета и изображения
    //TODO: здесь баг!!! (уже вроде нет)
    fun updateItem(hand: String, item: Item) {
        player.addItem(item.name, hand)
        if (hand == "left" && player.leftHand != null) {
            leftHand.setImageResource(getResIDByItem(player.leftHand!!))
        }
        if (hand == "right" && player.rightHand != null) {
            rightHand.setImageResource(getResIDByItem(player.rightHand!!))
        }
    }

    //TODO: возможно, написать отдельную функцию для обновления кнопок. (а может и не стоит)
    fun update(replica: Replica) {

        button.setText(replica.firstChoose)
        button.setOnClickListener() {
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
                    //TODO: какой конец хороший?
                    intent.putExtra("goodEnd", 78)
                } else intent.putExtra("badEnd", replica.fstLink)
                startActivity(intent)
            }
        }

        if (replica is GameReplica) {
            button.setOnClickListener() {
                if (replica.gameName == "tree") {
                    var intent = Intent(applicationContext, TreeGameActivity::class.java)
                } else {
                    var intent = Intent(applicationContext, RockPaperScissorsActivity::class.java)
                }
                startActivity(intent)
            }
        }

        if (replica is CheckItemReplica) {
            if (player.checkItem(replica.expectItemName)) {
                button.setOnClickListener() {
                    update(storage.replics[replica.fstLink]!!)
                }
            } else {
                button.setOnClickListener() {
                    update(storage.replics[replica.thirdLink]!!)
                }
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
                finish()})

        val alertDialog = builder.create()
        alertDialog.show()
    }

}
