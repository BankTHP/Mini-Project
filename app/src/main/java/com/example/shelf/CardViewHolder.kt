package com.example.shelf

import androidx.recyclerview.widget.RecyclerView
import com.example.shelf.databinding.CardshelfBinding

class CardViewHolder (
    private val cardshelfBinding: CardshelfBinding,
    private val clickListener: MovieOnClickListener
        ) : RecyclerView.ViewHolder(cardshelfBinding.root)
{
    fun bindMovie(movie: Movie){
        cardshelfBinding.coverImageView.setImageResource(movie.cover)
        cardshelfBinding.movieNameTextView.text = movie.moviename
        cardshelfBinding.movieCardView.setOnClickListener{
            clickListener.onClick(movie)
        }

    }
}