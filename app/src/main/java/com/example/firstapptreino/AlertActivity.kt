package com.example.firstapptreino

import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AlertDialog
import kotlinx.android.synthetic.main.activity_alert.*

class AlertActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_alert)

        val btnAlertaLogin = findViewById<Button>(R.id.btnContaAlertLogin)
        val btnAlertaSenha = findViewById<Button>(R.id.btnContaAlertaSenha)
        val btnAlertaSaldo = findViewById<Button>(R.id.btnContaAlertaSaldo)

        val txtAlertalogin = findViewById<TextView>(R.id.txtContaAlertLogin)
        val txtAlertaSenha = findViewById<TextView>(R.id.txtContaAlertSenha)
        val txtAlertaSaldo = findViewById<TextView>(R.id.txtContaAlertSaldo)

        btnAlertaLogin.setOnClickListener {
            txtAlertalogin.text = "Douglas"
        }

        btnAlertaSenha.setOnClickListener {
            txtAlertaSenha.text = "7778895"
        }

        btnAlertaSaldo.setOnClickListener {

             var builder = AlertDialog.Builder(this)

            builder.setMessage("Você tem certeza?")
                .setPositiveButton("Sim", object:DialogInterface.OnClickListener{
                override fun onClick(dialog: DialogInterface?, which: Int) {
                    txtAlertaSaldo.text = "R$3500,00"
                }
            })
                .setNegativeButton("Nao",null)

        builder.show()

         //val creatAlert : AlertDialog = builder.create()
         //   creatAlert.show()
        }


        btnContaAlertaSaldo2.setOnClickListener {

            val builder = AlertDialog.Builder(this)

            var view : View = LayoutInflater.from(this).inflate(R.layout.activity_demo_alert,null)
            val username : EditText = view.findViewById(R.id.edtAlertLogin)
            val password : EditText = view.findViewById(R.id.edtAlertSenha)

            builder.setMessage("Coloque seu Login")
                .setView(view)
                .setPositiveButton("Login", object:DialogInterface.OnClickListener {
                    override fun onClick(dialog: DialogInterface?, which: Int) {
                        
                        if(username.text.toString() == "admin" && password.text.toString() == "100"){

                            txtContaAlertSaldo2.text = "6000"
                        }else{

                            txtContaAlertSaldo2.text = "Senha Incorreta"
                        }
                    }
                })
                .setNegativeButton("Cancel", null)
            builder.show()

            }


        }
    }


