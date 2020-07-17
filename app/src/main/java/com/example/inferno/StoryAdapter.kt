package com.example.inferno

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class StoryAdapter(
    private var list: MutableList<StoryItem>,
    private val clickLambda: (Int) -> Unit
) : RecyclerView.Adapter<StoryItemHolder>(),
    IUpdatingAdapter<List<StoryItem>> {

    override fun update(data: List<StoryItem>?) {
        if (data == null) {
            return
        }
        list.clear()
        list.addAll(data)
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): StoryItemHolder =
        StoryItemHolder.create(parent)

    override fun getItemCount(): Int = list.size

    override fun onBindViewHolder(holder: StoryItemHolder, position: Int) {
        holder.bind(list[position], position, clickLambda)
    }
}

//class StoryAdapter(
//    private var dataSource: List<StoryItem>,
//    private val clickLambda: (Int) -> Unit
//) : RecyclerView.Adapter<StoryItemHolder>() {
//
//    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): StoryItemHolder =
//        StoryItemHolder.create(parent, clickLambda)
//
//    override fun getItemCount(): Int = dataSource.size
//
//    override fun onBindViewHolder(holder: StoryItemHolder, position: Int) =
//        holder.bind(dataSource[position])
//}