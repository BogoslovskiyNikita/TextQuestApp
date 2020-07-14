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
    private val clickAnswerLambda: (Int) -> Unit
) : RecyclerView.ViewHolder(containerView), LayoutContainer {

    fun bind(item: StoryItem) {
        // здесь бинд разных компонентов
        if (item.phrase == null)
            tv_phrase.visibility = View.GONE
        else
            tv_phrase.text = item.phrase

        if (item.answer1 == null)
            btn_answer1.visibility = View.GONE
        else {
            var arr = item.answer1!!.split("[]")
            btn_answer1.text = arr[0]
            btn_answer1.setOnClickListener{
                clickAnswerLambda(arr[1].toInt())
            }
        }
    }

    companion object {

        fun create(parent: ViewGroup, clickAnswerLambda: (Int) -> Unit) =
            StoryItemHolder(
                LayoutInflater.from(parent.context).inflate(R.layout.item_story, parent, false),
                clickAnswerLambda
            )
    }
}