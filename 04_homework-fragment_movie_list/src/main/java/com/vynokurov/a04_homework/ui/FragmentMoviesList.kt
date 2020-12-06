package com.vynokurov.a04_homework.ui

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import com.vynokurov.a04_homework.R
import com.vynokurov.a04_homework.data.MovieEntity
import com.vynokurov.a04_homework.domain.MoviesDataSource
import kotlinx.android.synthetic.main.fragment_movies_list.*

class FragmentMoviesList : Fragment(R.layout.fragment_movies_list),
    MoviesAdapter.Listener {

    private var listener: TransactionsFragmentClicks? = null

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initRecyclerView(MoviesDataSource().getMovies())
    }

    private fun initRecyclerView(users: List<MovieEntity>) {
        listMovies.layoutManager = GridLayoutManager(requireContext(), 2)
        listMovies.adapter = MoviesAdapter(requireContext(), users, this)
    }

    fun setClickListener(l: TransactionsFragmentClicks) {
        listener = l
    }

    override fun onItemClick(movieEntity: MovieEntity) {
        listener?.addFragment(movieEntity)
    }

    interface TransactionsFragmentClicks {
        fun addFragment(movie: MovieEntity)
    }

}