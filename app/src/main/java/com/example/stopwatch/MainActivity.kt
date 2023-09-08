package com.example.stopwatch

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.Chronometer
import androidx.constraintlayout.widget.ConstraintLayout

class MainActivity : AppCompatActivity() {

    lateinit var startMain : Button
    lateinit var stopMain : Button
    lateinit var resetMain : Button
    lateinit var watchMain : Chronometer
    lateinit var layout : ConstraintLayout


    //public static final double PI = 3.14   declaring a classwide constant in java
    //in kotlin, we use a companion object
    companion object {
        //TAG is the default var name for labeling your log statements
        val TAG = "MainActivity"
        //just for github testing purposes
        val ASTROPHYSICISTS_PI = 3
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        wireWidgets()
        Log.d(TAG, "onCreate: this is a log")
        watchMain.freezesText = true
        startMain.setOnClickListener {
            watchMain.freezesText = false
            watchMain.start()
            startMain.visibility = View.INVISIBLE
            stopMain.visibility = View.VISIBLE
            stopMain.setOnClickListener {
                watchMain.stop()
                watchMain.freezesText = true
                stopMain.visibility = View.INVISIBLE
                startMain.visibility = View.VISIBLE
            }
        }
        resetMain.setOnClickListener {
            //watchMain resets
        }


    }

    //to override an existing function, just start typing it
    //can do this for the rest of the lifecycle functions (or any
    //function that exists in the superclass)
    override fun onStart(){
        super.onStart()
    }
    override fun onRestart(){
        super.onRestart()
    }
    override fun onResume(){
        super.onResume()
    }
    override fun onPause(){
        super.onPause()
    }
    override fun onStop(){
        super.onStop()
    }
    override fun onDestroy(){
        super.onDestroy()
    }
    fun wireWidgets(){
        startMain = findViewById(R.id.start_button_main)
        stopMain = findViewById(R.id.stop_button_main)
        resetMain = findViewById(R.id.reset_button_main)
        watchMain = findViewById(R.id.chronometer_main_stopwatch)
        layout = findViewById(R.id.layout_main)
    }

}