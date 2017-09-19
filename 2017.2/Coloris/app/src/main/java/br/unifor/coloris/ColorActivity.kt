package br.unifor.coloris

import android.app.Activity
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.SeekBar

class ColorActivity : AppCompatActivity(), View.OnClickListener {

    lateinit var mSeekbarRed: SeekBar
    lateinit var mSeekbarGreen: SeekBar
    lateinit var mSeekbarBlue: SeekBar
    lateinit var mButtonBack: Button

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_color)

        mSeekbarRed = findViewById(R.id.color_seekbar_red) as SeekBar
        mSeekbarRed.progress = intent.getIntExtra("red", 0)

        mSeekbarGreen = findViewById(R.id.color_seekbar_green) as SeekBar
        mSeekbarGreen.progress = intent.getIntExtra("green", 0)

        mSeekbarBlue = findViewById(R.id.color_seekbar_blue) as SeekBar
        mSeekbarBlue.progress = intent.getIntExtra("blue", 0)

        mButtonBack = findViewById(R.id.color_button_back) as Button
        mButtonBack.setOnClickListener(this)

    }

    override fun onClick(view: View?) {

        when (view?.id) {
            R.id.color_button_back -> returnToMainActivity()
        }

    }

    private fun returnToMainActivity() {

        val backIntent:Intent = Intent()
        backIntent.putExtra("red", mSeekbarRed.progress)
        backIntent.putExtra("green", mSeekbarGreen.progress)
        backIntent.putExtra("blue", mSeekbarBlue.progress)

        setResult(Activity.RESULT_OK, backIntent)
        finish()

    }










}
