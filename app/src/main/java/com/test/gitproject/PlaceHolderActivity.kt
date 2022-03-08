package com.test.gitproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.animation.BounceInterpolator
import androidx.transition.ChangeBounds
import androidx.transition.TransitionManager
import com.test.gitproject.databinding.ActivityPlaceHolderBinding

class PlaceHolderActivity : AppCompatActivity() {
    private lateinit var binding: ActivityPlaceHolderBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPlaceHolderBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.imageView1.setOnClickListener {
            onClick(it)
        }
        binding.imageView2.setOnClickListener {
            onClick(it)
        }
        binding.imageView3.setOnClickListener {
            onClick(it)
        }
    }

    private fun onClick(view: View) {
        val transition = ChangeBounds().apply {
            interpolator = BounceInterpolator()
            duration = 2000
        }
        TransitionManager.beginDelayedTransition(binding.parentContainer, transition)
        binding.placeHolder.setContentId(view.id)
    }
}