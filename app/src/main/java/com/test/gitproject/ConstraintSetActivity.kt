package com.test.gitproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.animation.OvershootInterpolator
import android.widget.Button
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.constraintlayout.widget.ConstraintSet
import androidx.transition.ChangeBounds
import androidx.transition.Transition
import androidx.transition.TransitionManager

class ConstraintSetActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.constraintset_source)
        val btStart = findViewById<Button>(R.id.bt_start)
        btStart.setOnClickListener {
            constraintSetAnim(it)
        }
    }

    private fun constraintSetAnim(view: View) {
        val viewGroup = findViewById<ConstraintLayout>(R.id.parent)
        val cnstrSet = ConstraintSet()
        cnstrSet.clone(this, R.layout.constraint_set_destination)
        cnstrSet.applyTo(viewGroup)
        //Add intrpolator
        val transition = ChangeBounds()
        transition.interpolator = OvershootInterpolator()
        transition.duration = 3000
        //---
        TransitionManager.beginDelayedTransition(viewGroup,transition)
    }
}