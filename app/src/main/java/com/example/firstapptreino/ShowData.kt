package com.example.firstapptreino

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_show_data.*

class ShowData : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_show_data)

        txtNomeInt.text = intent.getStringExtra("nome")
        txtEmailInt.text = intent.getStringExtra("email")
        txtPassInt.text = intent.getStringExtra("senha")


    }
}
