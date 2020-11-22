package com.vynokurov.homework_lesson_three

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MovieDetailsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_movie_details)
        findViewById<TextView>(R.id.nameMovie).text = "Avengers:\nEnd Game"
    }

    companion object {
        @JvmStatic
        fun newIntent(context: Context): Intent =
            Intent(context, MovieDetailsActivity::class.java)
    }
}