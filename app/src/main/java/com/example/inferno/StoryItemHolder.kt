package com.example.inferno

import android.opengl.Visibility
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.extensions.LayoutContainer
import kotlinx.android.synthetic.main.item_story.*

class StoryItemHolder(
    override val containerView: View,
    private val clickLambda: (StoryItem) -> Unit
) : RecyclerView.ViewHolder(containerView), LayoutContainer {

    fun bind(item : StoryItem) {
        // здесь бинд разных компонентов
        tv_phrase.text = item.phrase

        if (item.answer1 == null)
            btn_answer1.visibility = View.GONE
        else
            btn_answer1.text = item.answer1

        itemView.setOnClickListener { clickLambda(item) }
    }

    companion object {

        fun create(parent: ViewGroup, clickLambda: (StoryItem) -> Unit) =
            StoryItemHolder(
                LayoutInflater.from(parent.context).inflate(R.layout.item_story, parent, false),
                clickLambda
            )
    }
}