package com.baga.androidcommonbehaviours.activityLaunch

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.appcompat.app.AppCompatActivity
import com.baga.androidcommonbehaviours.R

class Activity1 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_1)
        println("onCreate ${this.javaClass.name}")
    }

    override fun onStart() {
        super.onStart()
        println("onStart ${this.javaClass.name}")
    }

    override fun onResume() {
        super.onResume()
        println("onResume ${this.javaClass.name}")

        Handler(Looper.getMainLooper()).postDelayed({
            startActivity(
                Intent(
                    this,
                    Activity2::class.java
                )
            )
        },2000)
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