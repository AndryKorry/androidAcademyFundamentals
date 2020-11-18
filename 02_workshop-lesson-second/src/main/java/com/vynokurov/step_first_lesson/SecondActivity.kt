package com.vynokurov.step_first_lesson

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val intentString = intent.getStringExtra(TRANSMITTED_STRING)
        val intentInt = intent.getIntExtra(TRANSMITTED_INT, 0)
        val intentBoolean = intent.getBooleanArrayExtra(TRANSMITTED_BOOLEAN)

        textViewInform.text = getString(R.string.text_info, intentString, intentInt.toString(), intentBoolean)
    }

    companion object {
        const val TRANSMITTED_STRING = "transmittedString"
        const val TRANSMITTED_INT = "transmittedInt"
        const val TRANSMITTED_BOOLEAN = "transmittedBoolean"
    }
}