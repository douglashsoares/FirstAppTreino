package com.example.firstapptreino

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        val inflater : MenuInflater = menuInflater
        inflater.inflate(R.menu.menu_main,menu)

        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {

        when(item.itemId){

            R.id.sobre -> Toast.makeText(this,"Clicou em Sobre",Toast.LENGTH_LONG).show()
            R.id.contato -> Toast.makeText(this,"Clicou em Contatos",Toast.LENGTH_LONG).show()
            R.id.config -> Toast.makeText(this,"Clicou em Configuração",Toast.LENGTH_LONG).show()
        }
        return super.onOptionsItemSelected(item)
    }

    override fun onStart() {
        super.onStart()

        btnFluxoNumero.setOnClickListener {

            val intent = Intent(this,Addtion::class.java)
            startActivity(intent)
        }

        btnFluxoCadastro.setOnClickListener{

            val intent = Intent(this,Cadastro::class.java)
            startActivity(intent)
        }

        btnFluxoVisibilidade.setOnClickListener {

            val intent = Intent (this, VisibilidadeActivity::class.java)
            startActivity(intent)
        }

        btnFluxoSeekBar.setOnClickListener {

            val intent = Intent (this, SeekBarActivity::class.java)
            startActivity(intent)
        }

        //Segunda fileira...

        btnFluxoRatingBar.setOnClickListener {

            val intent = Intent (this, RatingBarActivity :: class.java)
            startActivity(intent)
        }

        btnFluxoAlerta.setOnClickListener {

            val intent = Intent (this,AlertActivity::class.java)
            startActivity(intent)
        }

        btnFluxoMudarPagina.setOnClickListener {

            val intent = Intent(this,SegundaPagina::class.java)
            startActivity(intent)
        }
    }
}
