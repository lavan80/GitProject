package com.test.gitproject

import android.graphics.drawable.AnimationDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.AnimationUtils
import android.widget.Button

class ViewBackgroundAnimationActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view_background_animation)
        val button = findViewById<Button>(R.id.bt_start)
        val animationDrawable = button.background as AnimationDrawable
            button.setOnClickListener {
                animationDrawable.start()
                //branch2 change 1
                //branch2 change 2
        }
    }
}