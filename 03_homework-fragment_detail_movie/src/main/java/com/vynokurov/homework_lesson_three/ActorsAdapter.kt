package com.vynokurov.homework_lesson_three

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import com.vynokurov.homework_lesson_three.data.ActorEntity
import kotlinx.android.synthetic.main.actor_item.view.*
import kotlinx.android.synthetic.main.fragment_movie_details.view.*

class ActorsAdapter(
    private val context: Context,
    private val movies: List<ActorEntity>
) :
    RecyclerView.Adapter<ActorsAdapter.ActorsViewHolder>() {

    override fun getItemCount(): Int {
        return movies.size
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ActorsViewHolder {
        return ActorsViewHolder(LayoutInflater.from(context).inflate(R.layout.actor_item, parent, false))
    }

    override fun onBindViewHolder(moviesViewHolder: ActorsViewHolder, position: Int) {
        moviesViewHolder.bind(movies[position])
    }

    inner class ActorsViewHolder(private val view: View) : RecyclerView.ViewHolder(view) {

        fun bind(actor: ActorEntity) {
            with(view) {
                nameActor.text = actor.name
                actorPhoto.background =  ContextCompat.getDrawable(context, actor.background)
            }
        }
    }
}
