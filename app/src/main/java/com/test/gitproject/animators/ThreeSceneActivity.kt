package com.test.gitproject.animators

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.transition.Scene
import android.transition.TransitionInflater
import android.transition.TransitionSet
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import com.test.gitproject.R

class ThreeSceneActivity : AppCompatActivity() {
    private var transitionStarted: Boolean = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_three_scene)
        findViewById<Button>(R.id.login).setOnClickListener {
            onClick(it)
        }
        findViewById<Button>(R.id.signup).setOnClickListener {
            onClick(it)
        }
    }

    private fun onClick(view: View) {
        val root = findViewById<ViewGroup>(R.id.root)
        val transitionSet = TransitionInflater.from(this).inflateTransition(R.transition.my_transition) as TransitionSet;
        val transitionMgr = TransitionInflater.from(this).inflateTransitionManager(R.transition.transitiom_manager, root)
        when (view.id) {
            R.id.login -> if (!transitionStarted) {
                val loginScene = Scene.getSceneForLayout(root, R.layout.activity_three_scene2, this);
                transitionMgr.transitionTo(loginScene)
                transitionStarted = true
            }
            R.id.signup -> if (!transitionStarted) {
                val signupScene = Scene.getSceneForLayout(root, R.layout.activity_three_scene3, this);
                transitionMgr.transitionTo(signupScene)
                transitionStarted = true
            }
        }
    }

    override fun onBackPressed() {
        if(transitionStarted) {
            val root = findViewById<ViewGroup>(R.id.root)
            val transitionSet = TransitionInflater.from(this).inflateTransition(R.transition.my_transition) as TransitionSet
            val transitionMgr = TransitionInflater.from(this).inflateTransitionManager(R.transition.transitiom_manager, root)
            val mainScene = Scene.getSceneForLayout(root, R.layout.activity_three_scene, this);
            transitionMgr.transitionTo(mainScene);
            transitionStarted = false;

            //Note: We need to find buttons and set onClickListeners again
            findViewById<Button>(R.id.login).setOnClickListener {
                onClick(it)
            }
            findViewById<Button>(R.id.signup).setOnClickListener {
                onClick(it)
            }
        }
        else {
            super.onBackPressed();
        }
    }
}