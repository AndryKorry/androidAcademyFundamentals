package com.vynokurov.a04_homework.ui

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import com.vynokurov.a04_homework.R
import com.vynokurov.a04_homework.data.MovieEntity
import kotlinx.android.synthetic.main.movie_item.view.*

class MoviesAdapter(
    private val context: Context,
    private val movies: List<MovieEntity>,
    private val listener: Listener
) :
    RecyclerView.Adapter<MoviesAdapter.MoviesViewHolder>() {

    override fun getItemCount(): Int {
        return movies.size
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MoviesViewHolder {
        return MoviesViewHolder(LayoutInflater.from(context).inflate(R.layout.movie_item, parent, false))
    }

    override fun onBindViewHolder(moviesViewHolder: MoviesViewHolder, position: Int) {
        moviesViewHolder.bind(movies[position])
    }

    inner class MoviesViewHolder(private val view: View) : RecyclerView.ViewHolder(view) {

        fun bind(movieEntity: MovieEntity) {
            with(view) {
                nameMovie.text = movieEntity.name
                tagMovie.text = movieEntity.tag
                age.text = context.getString(R.string.age_restrictions, movieEntity.ageRestrictions)
                reviewersCounter.text = context.getString(R.string.reviewers_counter, movieEntity.reviewersCount)
                timing.text = context.getString(R.string.duration, movieEntity.duration)
                if (movieEntity.isLiked) like.background = ContextCompat.getDrawable(context, R.drawable.ic_like)
                backgroundMovie.background =  ContextCompat.getDrawable(context, movieEntity.background)
                setOnClickListener { listener.onItemClick(movieEntity) }
            }
        }
    }

    interface Listener {
        fun onItemClick(movieEntity: MovieEntity)
    }
}

private val RecyclerView.ViewHolder.context
    get() = this.itemView.context
