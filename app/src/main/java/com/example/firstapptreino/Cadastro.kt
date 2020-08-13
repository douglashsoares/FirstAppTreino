package com.example.firstapptreino

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*
import kotlinx.android.synthetic.main.activity_cadastro.*

class Cadastro : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cadastro)



       // val nome: EditText = findViewById(R.id.edtNome)
        //val senha: EditText = findViewById(R.id.edtPassWord)
        val rg : RadioGroup = findViewById(R.id.radioGroup)

        btnAddConta.setOnClickListener{

//            if(rh.isChecked())
//            {
//                genero = "Homem"
//            }else
//            {
//                genero = "Mulher"
//            }

            val generoId = rg.checkedRadioButtonId
            val generoString = resources.getResourceEntryName(generoId)


            val getNome = edtNome.text.toString()
            val getPass = edtPassWord.text.toString()
            val getEmail = edtCreatEmail.text.toString()


            Toast.makeText(this,"Nome: $getNome \nSenha: $getPass \nGenero: "+generoString,Toast.LENGTH_LONG).show()

            val intent = Intent(this,ShowData::class.java)

            intent.putExtra("nome",getNome)
            intent.putExtra("email",getEmail)
            intent.putExtra("senha",getPass)
            intent.putExtra("genero",generoString)


            startActivity(intent)
        }
    }
}
