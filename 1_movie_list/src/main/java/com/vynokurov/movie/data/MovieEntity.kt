package com.vynokurov.movie.data

data class MovieEntity(
    val name: String,
    val tag: String,
    val ageRestrictions: String,
    val reviewersCount: String,
    val duration: String,
    val background: Int,
    val isLiked: Boolean
)