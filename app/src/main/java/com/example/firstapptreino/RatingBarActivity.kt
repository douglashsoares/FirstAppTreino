package com.example.firstapptreino

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.RatingBar
import android.widget.TextView

class RatingBarActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_rating_bar)

        var ratingB = findViewById<RatingBar>(R.id.ratingBar)
        var txtBar = findViewById<TextView>(R.id.txtRatingBar)

        ratingB.setOnRatingBarChangeListener(object : RatingBar.OnRatingBarChangeListener{
            override fun onRatingChanged(ratingBar: RatingBar?, rating: Float, fromUser: Boolean) {

                txtBar.text = rating.toString()

            }

        })
    }
}
