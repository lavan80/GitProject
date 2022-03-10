package com.test.gitproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.OnBackPressedCallback

class TransitionActivityEnd : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_transition_end)
        //            overridePendingTransition(R.anim.end_left_to_right, R.anim.start_left_to_right)
        /*onBackPressedDispatcher.addCallback(object : OnBackPressedCallback(true){
            override fun handleOnBackPressed() {
            }
        })*/
    }

    override fun onBackPressed() {
        super.onBackPressed()
        overridePendingTransition(R.anim.start_left_to_right, R.anim.end_left_to_right)
        //changes in branch1
        //change 2 in branch1
    }


}