package com.test.gitproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.transition.Fade
import androidx.transition.TransitionManager
import com.test.gitproject.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btStart.setOnClickListener {
            fadeAnimation(it)
        }
    }

    fun fadeAnimation(view: View) {
        binding.btStart.visibility = View.GONE
        val fade = Fade()
        fade.duration = 2000
        TransitionManager.beginDelayedTransition(binding.parent, fade)
    }
}