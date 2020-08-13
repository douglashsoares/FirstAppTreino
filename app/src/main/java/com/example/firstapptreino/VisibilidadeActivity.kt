package com.example.firstapptreino

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.core.view.isGone
import androidx.core.view.isVisible
import kotlinx.android.synthetic.main.activity_visibilidade.*

class VisibilidadeActivity : AppCompatActivity() {

    //val button1 : Button =  findViewById(R.id.btnButton1)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_visibilidade)

    }

    override fun onStart() {
        super.onStart()

        btnButton1.setOnClickListener {

           btnButton1.visibility = View.INVISIBLE
            btnButton2.visibility = View.VISIBLE
            btnButton3.visibility = View.VISIBLE

        }

        btnButton2.setOnClickListener{

            btnButton1.visibility = View.VISIBLE
            btnButton2.visibility = View.INVISIBLE
            btnButton3.visibility = View.VISIBLE
        }

        btnButton3.setOnClickListener {

            btnButton1.visibility = View.VISIBLE
            btnButton2.visibility = View.VISIBLE
            btnButton3.visibility = View.INVISIBLE
        }
    }
}
