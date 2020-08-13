package com.example.firstapptreino

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_addtion.*

class Addtion : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_addtion)

        var ett:EditText = findViewById(R.id.edtNum1)
        var et2:EditText = findViewById(R.id.edtNum2)
        var txt:TextView = findViewById(R.id.txtResult)

        btnAdd.setOnClickListener{
            var num1: Int = Integer.parseInt(ett.text.toString())
            var num2: Int = Integer.parseInt(et2.text.toString())

            var result = num1 + num2

            txt.text = result.toString()
        }

//    override fun onStart() {
//        super.onStart()
//
//        btnAdd.setOnClickListener{
//
//            var num1: Int = Integer.parseInt(ett.text.toString())
//            var num2: Int = Integer.parseInt(edtNum2.text.toString())
//
//            var result = num1 + num2
//
//
//            txtResult.text = result.toString()
//        }
    }
}
