package com.test.gitproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import androidx.transition.Slide
import androidx.transition.TransitionManager

class SlideAnimationActivity : AppCompatActivity() {

    lateinit var imageView: ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_slide_animation)
        findViewById<Button>(R.id.button3).setOnClickListener {
            onClick(it as Button)
        }
        imageView = findViewById<ImageView>(R.id.imageView4)
    }

    private fun onClick(view: Button) {
        TransitionManager
            .beginDelayedTransition(findViewById<ViewGroup>(R.id.parent), Slide(Gravity.RIGHT))
        imageView.visibility = if (imageView.visibility == View.GONE)View.VISIBLE else View.GONE
    }
}