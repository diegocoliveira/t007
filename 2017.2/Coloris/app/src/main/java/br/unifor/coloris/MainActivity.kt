package br.unifor.coloris

import android.content.Intent
import android.graphics.Color
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity(), View.OnClickListener {

    val COLOR_ACTIVITY_ID = 1

    var red = 0
    var green = 0
    var blue = 0

    lateinit var mViewColor: View
    lateinit var mButtonGetColor: Button


    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mViewColor = findViewById(R.id.main_color_view) as View
        mViewColor.setBackgroundColor(Color.rgb(red, green, blue))

        mButtonGetColor = findViewById(R.id.main_button_get_color) as Button
        mButtonGetColor.setOnClickListener(this)

    }

    override fun onClick(view: View?) {

        when(view?.id){

            R.id.main_button_get_color -> callColorActivity()

        }

    }

    private fun callColorActivity() {

        val it = Intent(this, ColorActivity::class.java)
        it.putExtra("red", red)
        it.putExtra("green", green)
        it.putExtra("blue", blue)

        startActivityForResult(it, COLOR_ACTIVITY_ID)

    }

}
