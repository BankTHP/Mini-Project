package com.example.shelf.factory

import com.example.shelf.data.Movie
import com.example.shelf.data.MovieCategory
import kotlin.random.Random

object Data {

    private val rand = Random(0)
    private val coverImage = listOf(
        "R.drawable.batman",
        "R.drawable.batman_beyond",
        "R.drawable.thebatman",
        "R.drawable.batmanofshanghai",
        "R.drawable.bewarethebatman",
        "R.drawable.batmantheanimatedseries",
        "R.drawable.thenewbatmanadventures",
        "R.drawable.theflash",
        "R.drawable.theflashchroniclesofcisco",
        "R.drawable.theboys"
    )
    private val movieName = listOf(
        "Batman",
        "Batman Beyond",
        "The Batman",
        "Batman of Shanghai",
        "Beware the Batman",
        "Batman: The Animated Series",
        "The New Batman Adventures",
        "The Flash",
        "The Flash: Chronicles of Cisco",
        "The Boys"

    )
    private val genres = listOf(
        "Action",
        "Science-Fiction",
        "Animation"
    )
    private val descriptions = listOf(
        "Lorem ipsum dolor sit amet, consectetur adipiscing elit.",
        "Pellentesque sagittis odio ut tincidunt scelerisque.",
        "Phasellus a neque consequat leo bibendum tempus.",
        "Quisque at enim id odio blandit imperdiet nec consequat augue.",
        "Cras iaculis lorem a dignissim egestas.",
        "Duis quis leo pharetra, vestibulum elit rhoncus, tempus ante.",
        "Duis ut lorem aliquet, lobortis massa a, fringilla velit.",
        "Fusce non ipsum sed augue gravida ullamcorper."
    )
    private val Category = listOf(
        "New Movie",
        "Best SoundTrack",
        "Anime",
        "Top Hits",
        "Old School Movie"
    )
    fun getParentList(): List<MovieCategory> {
        val list = ArrayList<MovieCategory>()
        for (i in 0..(Category.size-1)) {
            list.add(MovieCategory(
                Category[i], getChildList()
            ))
        }
        return list
    }
    private fun getChildList(): List<Movie> {
        val list = ArrayList<Movie>()
        for (i in 1..10) {
            list.add(getRandomChild())
        }
        return list
    }
    private fun getRandomChild(): Movie {
        return Movie(
            coverImage[rand.nextInt(coverImage.size)] ,
            movieName[rand.nextInt(movieName.size)],
            genres[rand.nextInt(genres.size)],
            descriptions[rand.nextInt(descriptions.size)]
        )
    }
}