package com.vynokurov.homemainactivity

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.vynokurov.step_first_lesson.FirstStepActivity
import com.vynokurov.workshop_lesson_three.LessonThreeActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        lessonFirst.setOnClickListener {
            startActivity(FirstStepActivity.newIntent(this))

        }
        openSecondLesson.setOnClickListener {
            startActivity(LessonThreeActivity.newIntent(this))
        }

    }
}