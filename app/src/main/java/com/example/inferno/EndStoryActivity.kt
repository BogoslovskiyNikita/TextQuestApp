package com.example.inferno

import android.content.Intent
import android.media.MediaPlayer
import android.media.MediaPlayer.OnCompletionListener
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_end_story.*
import java.util.*


class EndStoryActivity : AppCompatActivity() {
    private var player1: MediaPlayer? = null
    private var player2: MediaPlayer? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN
        actionBar?.hide()

        super.onCreate(savedInstanceState)

        val endTexts = HashMap<Int, String>()
        endTexts[0] =
            "Тебя встретили чуть дальше, ты даже не смог различить их силуэты, так непривычно было видеть яркий свет.\n\n" +
            "Спустя несколько десятков разнообразных вопросов об ощущениях, мотивах и действиях, тебя отпустили.\n\n" +
            "Отпустили с тысячей евро в руках. Супер!"

        endTexts[18] =
            "Друг мой. Слушать надо свой голос.\n\n" +
            "Человечек внутри тебя ничего плохого не скажет.\n\n" +
            "Но ты не послушал меня...\n\n" +
            "Ты испытал мое терпение.\n\n" +
            "И вот оно - оно кончилось.\n\n" +
            "Я покидаю тебя.\n\n" +
            "Теперь ты остаешься здесь один.\n\n" +
            "Как перед сном - один на один с собой и со своими мыслями."

        endTexts[34] =
            "Ты не заметил, как к тебе сзади подползла змея. Они же очень тихие, не правда ли?\n\n" +
            "Ты укушен.\n\n" +
            "Сломлен.\n\n" +
            "Разбит и подвален.\n\n" +
            "А еще ты проиграл."

        endTexts[46] =
            "Ты еле в потёмках нашел то место, но там не осталось даже табуретки.\n\n" +
                    "Ты присел на пол и заплакал.\n\n" +
                    "Горько заплакал.\n\n" +
                    "А еще проиграл."

        endTexts[60] =
            "Оно налетело на тебя так мгновенно, что ты ничего не успел предпринять, ты встрелил, но мимо.\n\n" +
                    "Последнее, что ты услышал, был звук отскакивающей от стены пули.\n\n" +
                    "Ты проиграл, навсегда проиграл."

        endTexts[62] =
            "Не происходит ровным счётом ничего. Животное всё также несется на тебя. Ты инстинктивно закрываешь лицо руками.\n\n" +
                    "А потом ты проигрываешь. Больно, очень больно проигрываешь."

        endTexts[75] =
            "Ты очень явно и громко бежал на них, сверкая своим мачете. Они не такие простаки, как ты, поэтому схватили свои аппараты, направили на тебя и...\n\n" +
                    "И игра закончилась.\n\n" +
                    "А финал был так близок..."

        endTexts[76] =
            "Нет, нет и еще раз нет. У тебя конечно ничего не вышло. Ты думаешь, что ты такой профи?\n\n" +
                    "По-моему, надо было развенчать этот миф еще в самом начале истории.\n\n" +
                    "Пока ты направлял свой пистолет на одного из них, ты уже падал на ледяной пол.\n\n" +
                    "Игра закончилась. Ты был так близок к финалу..."

        endTexts[78] =
            "Тебя встретили чуть дальше. Трясли за плечи и снова хохотали.\n\n" +
                    "Спустя несколько десятков разнообразных вопросов об ощущениях, мотивах и действиях, тебя отпустили.\n\n" +
                    "Отпустили с тысячей евро в руках. Класс! Оригинальность спасает иногда жизни."

        endTexts[1] =
            "Игра закончена. Ты был очень близок к выходу.\n\n" +
                    "Но такова жизнь. Таковы правила.\n\n" +
                    "Справедливости ради, ты был молодцом.\n\n" +
                    "Но как мал шанс прожить жизнь счастливым, так и мал был щанс выбраться из этого квеста (чёртовы психологи!).\n\n" +
                    "Надеюсь, что в жизни у тебя сложится намного лучше :)"

        val end = intent.extras
            if (end != null) {
            if (end["badEnd"] != null) {
                setContentView(R.layout.bad_end_of_the_story)
                val text = findViewById<View>(R.id.textStoryEnd) as TextView
                text.text = endTexts[end["badEnd"]]
            } else {
                setContentView(R.layout.activity_end_story)
                val text = findViewById<View>(R.id.textStoryEnd) as TextView
                text.text = endTexts[end["goodEnd"]]
            }
        }

        exitMainMenuFromEnd.setOnClickListener() {
            val intent = Intent(applicationContext, MainActivity::class.java)
            startActivity(intent)
            finish()
        }

        exitGameFromEnd.setOnClickListener() {
            finish()
        }
    }

    override fun onBackPressed() {
        val intent = Intent(applicationContext, MainActivity::class.java)
        startActivity(intent)
        finish()
    }

    override fun onPause() {
        super.onPause()
        player1!!.stop()
        player2!!.stop()
    }
    override fun onResume() {
        super.onResume()
        player1 = MediaPlayer.create(this, R.raw.inferno_end_1)
        player2 = MediaPlayer.create(this, R.raw.inferno_end_2)
        player2!!.isLooping = true
        player1!!.start()
        player1!!.setOnCompletionListener(MediaPlayer.OnCompletionListener {
            player2!!.start()
        })
    }
}