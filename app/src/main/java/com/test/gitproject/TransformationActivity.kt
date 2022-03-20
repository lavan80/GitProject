package com.test.gitproject

import android.graphics.Rect
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.transition.ChangeClipBounds
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import androidx.transition.ChangeImageTransform
import androidx.transition.ChangeTransform
import androidx.transition.TransitionManager

class TransformationActivity : AppCompatActivity() {
    lateinit var imageView: ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_transformation)
        findViewById<Button>(R.id.bt_start).setOnClickListener {
            onClick(it)
        }
        imageView = findViewById(R.id.imageView5)
    }

    private fun onClick(view: View) {
        /*TransitionManager
            .beginDelayedTransition(findViewById<ViewGroup>(R.id.parent), ChangeTransform())
        imageView.scaleX = 1.5f
        imageView.scaleY = 1.5f
        imageView.rotation = 45f*/
        /*TransitionManager
            .beginDelayedTransition(findViewById<ViewGroup>(R.id.parent), ChangeImageTransform())
        imageView.scaleType = ImageView.ScaleType.CENTER*/
        TransitionManager
            .beginDelayedTransition(findViewById<ViewGroup>(R.id.parent), ChangeClipBounds())

        imageView.clipBounds = Rect(20,300,500,400)
    }
}