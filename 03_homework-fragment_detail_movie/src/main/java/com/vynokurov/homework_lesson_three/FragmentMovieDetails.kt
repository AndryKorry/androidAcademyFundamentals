package com.vynokurov.homework_lesson_three

import android.app.Activity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragment_movie_details.*

class FragmentMovieDetails : Fragment()  {

    private var listener: BackPressedClick? = null

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? = inflater.inflate(R.layout.fragment_movie_details, container, false)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        backButton.setOnClickListener {
            listener?.backClick()  }
    }

    fun setClickListener(l: BackPressedClick?) {
        listener = l
    }

    companion object {
        fun newInstance() = FragmentMovieDetails()
    }

    interface BackPressedClick {
        fun backClick()
    }
}