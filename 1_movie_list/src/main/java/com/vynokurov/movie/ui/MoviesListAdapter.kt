package com.vynokurov.movie.ui

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import com.vynokurov.movie.R
import com.vynokurov.movie.data.MovieEntity
import kotlinx.android.synthetic.main.movie_item.view.age
import kotlinx.android.synthetic.main.movie_item.view.backgroundMovie
import kotlinx.android.synthetic.main.movie_item.view.like
import kotlinx.android.synthetic.main.movie_item.view.nameMovie
import kotlinx.android.synthetic.main.movie_item.view.reviewersCounter
import kotlinx.android.synthetic.main.movie_item.view.tagMovie
import kotlinx.android.synthetic.main.movie_item.view.timing

class MoviesListAdapter(
    private val context: Context,
    private val movies: List<MovieEntity>,
    private val listener: MoviesListener
) : RecyclerView.Adapter<MoviesListAdapter.MoviesListViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) =
        MoviesListViewHolder(LayoutInflater.from(context).inflate(R.layout.movie_item, parent, false))

    override fun onBindViewHolder(holder: MoviesListViewHolder, position: Int) {
        holder.bind(movies[position])
    }

    override fun getItemCount() = movies.size

    inner class MoviesListViewHolder(private val view: View) : RecyclerView.ViewHolder(view) {

        fun bind(movieEntity: MovieEntity) {
            with(view) {
                nameMovie.text = movieEntity.name
                tagMovie.text = movieEntity.tag
                age.text = context.getString(R.string.age_restrictions, movieEntity.ageRestrictions)
                reviewersCounter.text = context.getString(R.string.reviewers_counter, movieEntity.reviewersCount)
                timing.text = context.getString(R.string.duration, movieEntity.duration)
                if (movieEntity.isLiked) like.background = ContextCompat.getDrawable(context, R.drawable.ic_like)
                backgroundMovie.background = ContextCompat.getDrawable(context, movieEntity.background)
                setOnClickListener { listener.onItemClick(movieEntity) }
            }
        }
    }

    interface MoviesListener {
        fun onItemClick(movieEntity: MovieEntity)
    }
}
