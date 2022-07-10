package com.example.shelf

var movieList = mutableListOf<Movie>()
val MOVIE_EXTRA_ID = "MOVIE_EXTRA_ID"

class Movie(
    var cover: Int,
    var moviename: String,
    var genres: String,
    var description: String,
    val id: Int? = movieList.size
)




