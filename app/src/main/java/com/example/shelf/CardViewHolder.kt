package com.example.shelf

import androidx.recyclerview.widget.RecyclerView
import com.example.shelf.databinding.CardshelfBinding

class CardViewHolder (
    private val cardshelfBinding: CardshelfBinding,
    private val clickListener: MovieOnClickListener
        ) : RecyclerView.ViewHolder(cardshelfBinding.root)
{
    fun bindMovie(movie: Movie){
        cardshelfBinding.cover.setImageResource(movie.cover)
        cardshelfBinding.moviename.text = movie.moviename

        cardshelfBinding.cardView.setOnClickListener{
            clickListener.onClick(movie)
        }

    }
}