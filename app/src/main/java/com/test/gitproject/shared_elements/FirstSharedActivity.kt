package com.test.gitproject.shared_elements

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.core.app.ActivityOptionsCompat
import androidx.core.util.Pair
import com.test.gitproject.R

class FirstSharedActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first_shared)
        findViewById<ImageView>(R.id.img_start).setOnClickListener {
            val intent = Intent(this, SecondSharedActivity::class.java)
            val textView = findViewById<TextView>(R.id.text_anim)
            /*val activityOptionsCompat = ActivityOptionsCompat
                .makeSceneTransitionAnimation(this,(it as ImageView),"cofee")*/
            val activityOptionsCompat = ActivityOptionsCompat
                .makeSceneTransitionAnimation(this, Pair(it, "cofee"),Pair(textView, "text anim"))
            startActivity(intent, activityOptionsCompat.toBundle())
        }
    }
}