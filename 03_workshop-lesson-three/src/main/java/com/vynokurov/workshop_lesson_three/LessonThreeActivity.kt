package com.vynokurov.workshop_lesson_three

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_lesson_three.*

class LessonThreeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lesson_three)
        linearButton.setOnClickListener { showView(R.layout.layout_w2) }
        constrainButton.setOnClickListener { showView(R.layout.layout_w3) }
    }

    private fun showView(layout: Int) {
        val view = layoutInflater.inflate(layout, null,false)
        container.addView(view)
    }

    companion object {
        @JvmStatic
        fun newIntent(context: Context): Intent =
            Intent(context, LessonThreeActivity::class.java)
    }
}

