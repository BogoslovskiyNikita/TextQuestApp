package com.example.inferno

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class StoryAdapter(
    private var dataSource: List<StoryItem>,
    private val clickLambda: (Int) -> Unit
) : RecyclerView.Adapter<StoryItemHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): StoryItemHolder =
        StoryItemHolder.create(parent, clickLambda)

    override fun getItemCount(): Int = dataSource.size

    override fun onBindViewHolder(holder: StoryItemHolder, position: Int) =
        holder.bind(dataSource[position])
}