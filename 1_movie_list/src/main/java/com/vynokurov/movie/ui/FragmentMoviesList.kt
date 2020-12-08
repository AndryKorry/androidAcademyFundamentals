package com.vynokurov.movie.ui

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import com.vynokurov.movie.R
import com.vynokurov.movie.data.MovieEntity
import com.vynokurov.movie.domain.MoviesDataSource
import kotlinx.android.synthetic.main.fragment_movies_list.listMovies

class FragmentMoviesList : Fragment(R.layout.fragment_movies_list),
    MoviesListAdapter.MoviesListener {

    private var listener: TransactionsFragmentClicks? = null

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initRecyclerView(MoviesDataSource().getMovies())
    }

    private fun initRecyclerView(users: List<MovieEntity>) {
        listMovies.layoutManager = GridLayoutManager(requireContext(), 2)
        listMovies.adapter = MoviesListAdapter(requireContext(), users, this)
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