package com.example.inferno

import android.content.Intent
import android.content.res.Resources
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.inferno.choose_logic.*
import com.example.inferno.player.*
import kotlinx.android.synthetic.main.activity_reserve_story.*

class ReserveStoryActivity : AppCompatActivity() {
    var storage = Replics()
    var player = Player(100);

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_reserve_story)

        update(storage.replics[1]!!)
        updateHp(0)

        leftHand.setImageResource(getResIDByItem(BloodyKnife()))

//        val intent = Intent(applicationContext, EndStoryActivity::class.java)
//        startActivity(intent)
//        intent.putExtra("goodEnd", 78)
    }

    //проверка на концовку/мини игру
    fun check() {
    }

    //обновление актуального хп и изображение
    fun updateHp(changeHp: Int) {
        player.changeHp(changeHp)
        hp.setImageResource(getResIDByName(player.hpPic))
    }

    fun updateItem(hand: String, item: Item) {
        player.addItem(item.name, hand)
        if (hand == "left" && player.leftHand != null) {
            leftHand.setImageResource(getResIDByItem(player.leftHand!!))
        }
        if (hand == "right" && player.rightHand != null) {
            leftHand.setImageResource(getResIDByItem(player.leftHand!!))
        }
    }

    //TODO: возможно, написать отдельную функцию для обновления кнопок.
    //TODO: проверка на концовку/мини игру в самом начале метода
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
                update(storage.replics[replica.fstLink]!!)
            }
        } else button3.setVisibility(View.GONE)

        textView.setText(replica.replicaText)
        if (replica is EndReplica) {
            val intent = Intent(applicationContext, EndStoryActivity::class.java)
            if (replica.isGoodEnd) {
                //TODO: какой конец хороший?
                intent.putExtra("goodEnd", 78)
            } else intent.putExtra("badEnd", replica.firstChoose)
            startActivity(intent)
        }

        if (replica is GameReplica) {
            if (replica.gameName == "tree") {
                var intent = Intent(applicationContext, TreeGameActivity::class.java)
            } else {
                var intent = Intent(applicationContext, RockPaperScissorsActivity::class.java)
            }
            startActivity(intent)
        }

        if (replica is CheckItemReplica) {

        }
        if (replica is HpChangingRepilca) {
            updateHp(replica.hpChange)
        }
        if (replica is ItemChangingReplica) {
            updateItem(replica.hand, replica.item)
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

}
