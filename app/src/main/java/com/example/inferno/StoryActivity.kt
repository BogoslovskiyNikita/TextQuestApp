package com.example.inferno

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.annotation.RequiresApi
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_story.*




//D:\Java projects\PrntscBot\src\main\java\test\a1.txt

class StoryActivity : AppCompatActivity() {
    lateinit var storyData: MutableList<StoryItem>
    lateinit var adapter: StoryAdapter

    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_story)
        rvStory.layoutManager = LinearLayoutManager(this)
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
        rvStory.adapter = adapter
        //storyData.addAll(Parsing.storyItemFromLL(Parsing.getListOfReplics("text\\a1.txt")))
        //adapter.notifyItemRangeInserted(0, storyData.size - 1)
        //adapter.notifyDataSetChanged();

//        adapter.update(Parsing.storyItemFromLL(Parsing.getListOfReplics("raw\\a1.txt")))
        Parsing.getListOfReplics(getResources().openRawResource(R.raw.a1))
    }
}