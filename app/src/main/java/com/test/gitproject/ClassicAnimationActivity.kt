package com.test.gitproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.animation.*
import com.test.gitproject.databinding.ActivityClassicAnimationBinding

class ClassicAnimationActivity : AppCompatActivity() {

    private lateinit var binding: ActivityClassicAnimationBinding
    private lateinit var animationSet: AnimationSet

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityClassicAnimationBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val translate = TranslateAnimation(0f,200f,0f,200f)
        val alphaAnimation = AlphaAnimation(1.0f, 0.2f)
        val scaleAnimation = ScaleAnimation(1f, 2f, 1f, 2f)
        val rotateAnimation = RotateAnimation(0f,180f)
        animationSet = AnimationSet(this, null)
        animationSet.apply {
            addAnimation(translate)
            addAnimation(alphaAnimation)
            addAnimation(scaleAnimation)
            addAnimation(rotateAnimation)
            duration = 3000
        }
        binding.btStart.setOnClickListener {
            onClick(it)
        }
    }

    private fun onClick(view: View){
        //view.animation = animationSet
        view.startAnimation(animationSet)
    }
}