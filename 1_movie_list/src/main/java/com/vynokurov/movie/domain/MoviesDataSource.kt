package com.vynokurov.movie.domain

import com.vynokurov.movie.R
import com.vynokurov.movie.data.MovieEntity


class MoviesDataSource {
    fun getMovies(): List<MovieEntity> {
        return listOf(
            MovieEntity("Avengers: End Game", "Action, Adventure, Drama", "13", "125",
                "137" , R.drawable.background_movie, false),
            MovieEntity("Tenet", "Action, Sci-Fi, Thriller ", "16", "98",
                "97" , R.drawable.background_tenet, true),
            MovieEntity("Black Widow", "Action, Adventure, Sci-Fi", "13", "38",
                "102" , R.drawable.background_black_widow, false),
            MovieEntity("Wonder Woman 1984", "Action, Adventure, Fantasy", "13", "74",
                "120" , R.drawable.background_wonder_woman, false),
        )
    }
}