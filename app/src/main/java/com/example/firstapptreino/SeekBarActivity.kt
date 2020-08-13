package com.example.firstapptreino

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Size
import android.widget.ImageView
import android.widget.SeekBar
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_seek_bar.*
import android.widget.SeekBar.OnSeekBarChangeListener as SeekBarOnSeekBarChangeListener

class SeekBarActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_seek_bar)

        val cachoeira = findViewById<ImageView>(R.id.imgCachoeira)
        val seek = findViewById <SeekBar>(R.id.seekBar)


        seek.setOnSeekBarChangeListener( object :SeekBar.OnSeekBarChangeListener {
            override fun onProgressChanged(seekBar: SeekBar?, progress: Int, fromUser: Boolean) {

                //txtNumSeekBar.textSize = progress.toFloat()
                txtMostrarNumBar.text = progress.toString()


                if(progress > 90){

                    cachoeira.setImageResource(R.drawable.ic_launcher_birthcake)
                }

            }

            override fun onStartTrackingTouch(seekBar: SeekBar?) {

                Toast.makeText(this@SeekBarActivity, "Start", Toast.LENGTH_SHORT).show()
            }

            override fun onStopTrackingTouch(seekBar: SeekBar?) {
                Toast.makeText(this@SeekBarActivity, "Stop", Toast.LENGTH_SHORT).show()
            }

        })


    }


}


