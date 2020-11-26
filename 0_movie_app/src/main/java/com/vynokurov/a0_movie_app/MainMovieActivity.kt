package com.vynokurov.a0_movie_app

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.vynokurov.a04_homework.FragmentMoviesList
import com.vynokurov.homework_lesson_three.FragmentMovieDetails

class MainMovieActivity : AppCompatActivity(), FragmentMoviesList.TransactionsFragmentClicks {

    private val rootFragment =
        FragmentMoviesList().apply { setClickListener(this@MainMovieActivity) }

    private val secondFragment = FragmentMovieDetails()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.general_movie_layout)


        supportFragmentManager.beginTransaction()
            .apply {
                add(R.id.mainContainer, rootFragment)
                commit()
            }

    }

    override fun addFragment() {
        supportFragmentManager.beginTransaction()
            .apply {
                add(R.id.mainContainer, FragmentMovieDetails.newInstance())
                commit()
            }
    }

    companion object {
        @JvmStatic
        fun newIntent(context: Context): Intent =
            Intent(context, MainMovieActivity::class.java)
    }
}