package com.example.firstapptreino

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.firstapptreino.ListView.ListViewActivity
import kotlinx.android.synthetic.main.activity_segunda_pagina.*

class SegundaPagina : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_segunda_pagina)

        btnListView.setOnClickListener {
            val intent = Intent(this, ListViewActivity::class.java)
            startActivity(intent)

        }
    }
}