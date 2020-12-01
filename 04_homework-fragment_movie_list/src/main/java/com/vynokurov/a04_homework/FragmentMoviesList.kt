package com.vynokurov.a04_homework

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragment_movies_list.*

class FragmentMoviesList : Fragment(R.layout.fragment_movies_list)  {

    private var listener: TransactionsFragmentClicks? = null

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        movieItem.setOnClickListener { listener?.addFragment() }
    }

    fun setClickListener(l: TransactionsFragmentClicks) {
        listener = l
    }

    interface TransactionsFragmentClicks {
        fun addFragment()
    }

}