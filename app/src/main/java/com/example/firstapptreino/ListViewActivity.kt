package com.example.firstapptreino

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast

class ListViewActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_view)

        val lista = findViewById<ListView>(R.id.progList)
        val values =
            listOf("C", "C++", "Java", "Android", "C#", "Aseembly", "Python", "Ruby", "VB", "Scala")


        val arrayAdapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, values)

        lista.adapter = arrayAdapter
        
        lista.setOnItemClickListener { parent, view, position, id ->

            Toast.makeText(this,"Clicou em : "+" "+ values[position],Toast.LENGTH_SHORT).show()
        }
    }
}