package com.vynokurov.homework_lesson_three

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MovieDetailsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_movie_details)
    }

    companion object {
        @JvmStatic
        fun newIntent(context: Context): Intent =
            Intent(context, MovieDetailsActivity::class.java)
    }
}