package com.baga.androidcommonbehaviours.activityLaunch

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.baga.androidcommonbehaviours.R

class Activity2 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_2)
        println("onCreate ${this.javaClass.name}")
    }

    override fun onStart() {
        super.onStart()
        println("onStart ${this.javaClass.name}")
    }

    override fun onResume() {
        super.onResume()
        println("onResume ${this.javaClass.name}")
    }

    override fun onPause() {
        super.onPause()
        println("onPause ${this.javaClass.name}")
    }

    override fun onStop() {
        super.onStop()
        println("onStop ${this.javaClass.name}")
    }

    override fun onDestroy() {
        super.onDestroy()
        println("onDestroy ${this.javaClass.name}")
    }
}