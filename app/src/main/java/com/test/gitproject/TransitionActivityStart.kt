package com.test.gitproject

import android.app.ActivityOptions
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Window
import android.widget.Button

class TransitionActivityStart : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_transition_start)
        findViewById<Button>(R.id.button).setOnClickListener {
            startActivity(Intent(this, TransitionActivityEnd::class.java))
            overridePendingTransition(R.anim.end_rigth_to_left, R.anim.start_right_to_left)
        }
    }
}