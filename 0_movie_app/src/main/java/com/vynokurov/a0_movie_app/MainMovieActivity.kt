package com.vynokurov.a0_movie_app

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.vynokurov.a04_homework.FragmentMoviesList
import com.vynokurov.homework_lesson_three.FragmentMovieDetails

class MainMovieActivity : AppCompatActivity(), FragmentMoviesList.TransactionsFragmentClicks,
    FragmentMovieDetails.BackPressedClick {

    private var rootFragment =
        FragmentMoviesList().apply { setClickListener(this@MainMovieActivity) }

    private var detailFragment =
        FragmentMovieDetails().apply { setClickListener(this@MainMovieActivity) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.general_movie_layout)

        if (savedInstanceState == null) {
            rootFragment.apply {
                supportFragmentManager.beginTransaction()
                    .add(R.id.mainContainer, rootFragment, FRAGMENT_LIST)
                    .commit()
            }
        }
    }

    override fun addFragment() {
        replaceFragment(detailFragment, FRAGMENT_DETAIL)
    }

    private fun replaceFragment(fragment: Fragment, tag: String) {
        supportFragmentManager.beginTransaction()
            .apply {
                replace(R.id.mainContainer, fragment, tag)
                addToBackStack(tag)
                commit()
            }
    }

    companion object {
        const val FRAGMENT_LIST = "fragment_list"
        const val FRAGMENT_DETAIL = "fragment_detail"

        @JvmStatic
        fun newIntent(context: Context): Intent =
            Intent(context, MainMovieActivity::class.java)
    }

    override fun backClick() {
        onBackPressed()
    }
}

