package com.vynokurov.step_first_lesson

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class FirstStepActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first)
        val next: TextView = findViewById(R.id.nextScreen)
        next.setOnClickListener {openNextScreen()}
    }

    private fun openNextScreen() {
        val intent = Intent(this, SecondActivity::class.java)
        intent.putExtra(TRANSMITTED_STRING, "Transmitted String")
        intent.putExtra(TRANSMITTED_INT, 12)
        intent.putExtra(TRANSMITTED_BOOLEAN, false)
        startActivity(intent)
    }

    companion object {

        @JvmStatic
        fun newIntent(context: Context): Intent =
            Intent(context, FirstStepActivity::class.java)

        const val TRANSMITTED_STRING = "transmittedString"
        const val TRANSMITTED_INT = "transmittedInt"
        const val TRANSMITTED_BOOLEAN = "transmittedBoolean"
    }

}