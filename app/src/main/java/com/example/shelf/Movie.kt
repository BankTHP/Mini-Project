package com.example.shelf

var movieList = mutableListOf<Movie>()
val MOVIE_ID_EXTRA = "movieExtra"
class Movie (
    var cover : Int,
    var moviename : String,
    var genres : String,
    var description: String,
    val id : Int? = movieList.size
)




