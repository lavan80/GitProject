package com.test.gitproject.shared_elements

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.test.gitproject.R

class SecondSharedActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second_shared)
    }
}