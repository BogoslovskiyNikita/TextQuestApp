package com.example.inferno

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import com.example.inferno.choose_logic.Replica
import com.example.inferno.choose_logic.Replics
import kotlinx.android.synthetic.main.activity_reserve_story.*

class ReserveStoryActivity : AppCompatActivity() {
    var storage = Replics()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_reserve_story)

        update(storage.replics[1]!!)
    }

    //проверка на концовку/мини игру
    fun check() {
    }



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


    }
}
