package com.example.shelf.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.example.shelf.R
import com.example.shelf.data.Movie
import com.example.shelf.databinding.CardshelfBinding


class MovieAdapter(private val childData: List<Movie>?) : RecyclerView.Adapter<MovieAdapter.ViewHolder>() {

    inner class ViewHolder(private val itemView: View,val binding: CardshelfBinding) :
        RecyclerView.ViewHolder(itemView)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = DataBindingUtil.inflate(LayoutInflater.from(parent.context),
            R.layout.cardshelf, parent, false) as CardshelfBinding
        return ViewHolder(binding.root, binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        if ((childData?.size ?: 0) > position)
            holder.binding.data = childData?.get(position)
        holder.binding.executePendingBindings()
    }

    override fun getItemCount() = childData?.size ?: 0
}