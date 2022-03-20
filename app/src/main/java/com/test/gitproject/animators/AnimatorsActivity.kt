package com.test.gitproject.animators

import android.animation.*
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import com.test.gitproject.R
import com.test.gitproject.databinding.ActivityAnimatorsBinding

class AnimatorsActivity : AppCompatActivity() {
    private  lateinit var binding: ActivityAnimatorsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAnimatorsBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.button2.setOnClickListener {
            //scaleAnimWithRepeat
            //setAnimObjects(it as Button)
            //setAnimOnViewObject(it as Button)
            animFromResource(it as Button)
        }
    }

    private fun animFromResource(view: Button) {
        val animatorSet = AnimatorInflater.loadAnimator(this, R.animator.animatro_resource)
        animatorSet.setTarget(view)
        animatorSet.duration = 3000
        animatorSet.start()
    }

    private fun setAnimOnViewObject(view: Button) {
        view.animate().apply {
            duration = 3000
            scaleX(3f)
            translationY(300f)
            alpha(0.5f)
        }
    }

    private fun setAnimObjects(view: Button) {
        val objectTranslate = ObjectAnimator.ofFloat(view, "translationY", 300f)
        val objectScaleX = ObjectAnimator.ofFloat(view, "scaleX", 2f)
        val alpha = ObjectAnimator.ofObject(
            view,
            "textColor",
            ArgbEvaluator(),
            Color.CYAN, Color.DKGRAY
        )

        val animatorSet = AnimatorSet()
        //animatorSet.playTogether(objectTranslate, objectScaleX, alpha)
        animatorSet.playSequentially(objectTranslate, objectScaleX, alpha)
        animatorSet.duration =3000
        animatorSet.start()

    }

    private fun scaleAnimWithRepeat(view: View) {
        val objectAnimator = ObjectAnimator.ofFloat(view, "scaleX", 3f)
        objectAnimator.apply {
            repeatCount = ValueAnimator.INFINITE
            //repeatMode = ValueAnimator.RESTART
            repeatMode = ValueAnimator.REVERSE
            duration = 3000
        }
        objectAnimator.start()
    }
}