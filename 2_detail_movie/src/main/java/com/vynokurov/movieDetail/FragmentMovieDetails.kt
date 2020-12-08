package com.vynokurov.movieDetail

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.vynokurov.movieDetail.data.ActorEntity
import com.vynokurov.movieDetail.domain.ActorsDataSource
import kotlinx.android.synthetic.main.fragment_movie_details.*

class FragmentMovieDetails : Fragment(R.layout.fragment_movie_details) {

    private var listener: BackPressedClick? = null

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        backButton.setOnClickListener {
            listener?.backClick()  }
        initRecyclerView(ActorsDataSource().getActors())
    }

    private fun initRecyclerView(users: List<ActorEntity>) {
        actorsList.layoutManager = LinearLayoutManager(context,  LinearLayoutManager.HORIZONTAL, false)
        actorsList.adapter = ActorsAdapter(requireContext(), users)
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