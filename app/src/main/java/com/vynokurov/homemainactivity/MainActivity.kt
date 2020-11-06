package com.vynokurov.homemainactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.vynokurov.step_first_lesson.FirstStepActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        lessonFirst.setOnClickListener { openNextScreen() }
    }

    private fun openNextScreen() {
        val intent = Intent(this, FirstStepActivity::class.java)
        startActivity(intent)
    }
}