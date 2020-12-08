package com.vynokurov.homework_lesson_three.domain

import com.vynokurov.homework_lesson_three.R
import com.vynokurov.homework_lesson_three.data.ActorEntity

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