package com.example.inferno

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rv_story.layoutManager = LinearLayoutManager(this)
        rv_story.adapter = StoryAdapter(
            listOf(StoryStorage.getStorage()[0])
        ) { }
    }
}
