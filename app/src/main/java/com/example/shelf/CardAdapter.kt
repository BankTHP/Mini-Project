package com.example.shelf

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.shelf.databinding.CardshelfBinding

class CardAdapter (
    private val movies : List<Movie>,
    private val clickListener: MovieOnClickListener
    ) : RecyclerView.Adapter<CardViewHolder>()
{
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardViewHolder {
        val from =LayoutInflater.from(parent.context)
        val binding = CardshelfBinding.inflate(from,parent,false)
        return CardViewHolder(binding,clickListener)
    }

    override fun onBindViewHolder(holder: CardViewHolder, position: Int) {
        holder.bindMovie(movies[position])
    }

    override fun getItemCount(): Int = movies.size

}