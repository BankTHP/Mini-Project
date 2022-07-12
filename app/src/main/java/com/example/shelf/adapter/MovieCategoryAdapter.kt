package com.example.shelf.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.example.shelf.R
import com.example.shelf.data.MovieCategory
import com.example.shelf.databinding.CardshelfparentItemBinding

class MovieCategoryAdapter (private val data: List<MovieCategory>) : RecyclerView.Adapter<MovieCategoryAdapter.ViewHolder>(){

    inner class ViewHolder(private val itemView : View,val binding: CardshelfparentItemBinding) : RecyclerView.ViewHolder(itemView){}

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = DataBindingUtil.inflate(LayoutInflater.from(parent.context),
            R.layout.cardshelfparent_item, parent, false) as CardshelfparentItemBinding
        return ViewHolder(binding.root, binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.binding.data = data[position]
        holder.binding.childrenRecyclerView.adapter = MovieAdapter(data[position].itemShelf)
        holder.binding.executePendingBindings()
    }

    override fun getItemCount() = data.size
}
