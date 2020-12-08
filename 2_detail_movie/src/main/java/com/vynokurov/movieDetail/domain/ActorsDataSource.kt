package com.vynokurov.movieDetail.domain

import com.vynokurov.movieDetail.R
import com.vynokurov.movieDetail.data.ActorEntity

class ActorsDataSource {
    fun getActors(): List<ActorEntity> {
        return listOf(
            ActorEntity("Avengers", R.drawable.ic_robert),
            ActorEntity("Tenet", R.drawable.ic_ruffalo),
            ActorEntity("Terry", R.drawable.ic_evans),
            ActorEntity("Tenet", R.drawable.ic_hemsworth)
        )
    }
}