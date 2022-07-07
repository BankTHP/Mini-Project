package com.example.shelf

var movieList = mutableListOf<Movie>()

class Movie (
    var cover : Int,
    var moviename : String,
    var genres : String,
    var description: String,
    val id : Int? = movieList.size
)




