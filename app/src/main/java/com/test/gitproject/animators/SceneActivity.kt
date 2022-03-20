package com.test.gitproject.animators

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.transition.Fade
import android.transition.ChangeBounds
import android.transition.TransitionManager
import android.view.View
import android.view.ViewGroup
import android.view.animation.ScaleAnimation
import android.widget.Button
import android.transition.Scene
import com.test.gitproject.R

class SceneActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_scene)
        findViewById<Button>(R.id.bt_scene_start).setOnClickListener {
            scaleScene(it)
        }
    }

    private fun scaleScene(view: View){
        val scaleAnim = ChangeBounds()
        val viewGroup = findViewById<ViewGroup>(R.id.parent)
        val scene = Scene.getSceneForLayout(viewGroup, R.layout.activity_scene2, this)
        TransitionManager.go(scene, scaleAnim)
    }
}