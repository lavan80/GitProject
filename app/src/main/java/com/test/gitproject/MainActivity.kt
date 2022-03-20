package com.test.gitproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.transition.Fade
import androidx.transition.Transition
import androidx.transition.TransitionManager
import com.test.gitproject.animators.AnimatorsActivity
import com.test.gitproject.animators.SceneActivity
import com.test.gitproject.animators.ThreeSceneActivity
import com.test.gitproject.databinding.ActivityMainBinding
import com.test.gitproject.shared_elements.FirstSharedActivity

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btStart.setOnClickListener {
            //viewAnimations(it)
            //animators(it)
            sharedElements(it)
        }
    }

    fun sharedElements(view: View) {
        startNewActivity(FirstSharedActivity::class.java)

    }

    fun animators(view: View) {
        //startNewActivity(AnimatorsActivity::class.java)
        //startNewActivity(SceneActivity::class.java)
        startNewActivity(ThreeSceneActivity::class.java)
    }

    fun viewAnimations(view: View) {
        //fadeAnimation(it)
        //startNewActivity(ConstraintSetActivity::class.java)
        //startNewActivity(PlaceHolderActivity::class.java)
        //startNewActivity(ClassicAnimationActivity::class.java)
        //startNewActivity(TransitionActivityStart::class.java)
        //startNewActivity(ViewBackgroundAnimationActivity::class.java)
        //startNewActivity(SlideAnimationActivity::class.java)
        startNewActivity(TransformationActivity::class.java)
    }

    fun fadeAnimation(view: View) {
        binding.btStart.visibility = View.GONE
        val fade: Transition = Fade()
        fade.duration = 2000
        TransitionManager.beginDelayedTransition(binding.parent, fade)
        binding.group.visibility = View.VISIBLE
        //change 1
        //change 2 and 3 will rewrite
    }

    private fun<T : AppCompatActivity> startNewActivity(c : Class<T>) {
        startActivity(Intent(this@MainActivity, c))

    }
}