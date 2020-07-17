package com.example.inferno

import android.os.Build
import android.content.DialogInterface
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.annotation.RequiresApi
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_story.*




//D:\Java projects\PrntscBot\src\main\java\test\a1.txt
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import androidx.appcompat.app.AlertDialog
import kotlinx.android.synthetic.main.activity_story.*

class StoryActivity : AppCompatActivity() {
    lateinit var storyData: MutableList<StoryItem>
    lateinit var adapter: StoryAdapter

    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreate(savedInstanceState: Bundle?) {
        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN
                actionBar?.hide()

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_story)
        //rvStory.layoutManager = LinearLayoutManager(this)
        storyData = mutableListOf(
            StoryItem(
                "test", null, null, null
            )
        )

        adapter = StoryAdapter(storyData) {
            //var newElements = Parsing.storyItemFromLL(Parsing.getListOfReplics(Parsing.pathTemplate + it + ".txt"))
            //storyData.addAll( storyData.size - 1, newElements )
            //adapter.notifyItemRangeInserted(storyData.size - 1, newElements.size)

            //adapter.update( Parsing.storyItemFromLL(Parsing.getListOfReplics(Parsing.pathTemplate + it + ".txt")))
        }
        //rvStory.adapter = adapter
        //storyData.addAll(Parsing.storyItemFromLL(Parsing.getListOfReplics("text\\a1.txt")))
        //adapter.notifyItemRangeInserted(0, storyData.size - 1)
        //adapter.notifyDataSetChanged();

//        adapter.update(Parsing.storyItemFromLL(Parsing.getListOfReplics("raw\\a1.txt")))
//        Parsing.getListOfReplics(getResources().openRawResource(R.raw.a1))

        intent = Intent(this, EndStoryActivity::class.java)

        // For test
        /*val idOfTheEnd = findViewById<EditText>(R.id.IDEndTextFieldTest)*/

        val idOfTheEndText = 1

        // For test
        /*badEnd.setOnClickListener() {
            intent.putExtra("badEnd", idOfTheEndText)
            startActivity(intent)
            finish()
        }

        goodEnd.setOnClickListener() {
            intent.putExtra("goodEnd", idOfTheEndText)
            startActivity(intent)
            finish()
        }*/

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