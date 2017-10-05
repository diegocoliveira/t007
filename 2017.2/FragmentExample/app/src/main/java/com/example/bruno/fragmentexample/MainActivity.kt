package com.example.bruno.fragmentexample

import android.graphics.Point
import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val sizeDisplay = Point()
        val display = windowManager.defaultDisplay;
        display.getSize(sizeDisplay)

        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()

        val fragment = if( sizeDisplay.x > sizeDisplay.y) Fragment2() else Fragment1()
        fragmentTransaction.replace(android.R.id.content, fragment)
        fragmentTransaction.commit()

    }

}
