package com.example.herupu

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnLogin: Button = findViewById<Button>(R.id.btnLogin)
        val email = findViewById<EditText>(R.id.txtEmail)
        val senha = findViewById<EditText>(R.id.txtSenha)

        btnLogin.setOnClickListener {
            val newtela = Intent(this, DashboardActivity::class.java)
            startActivity(newtela)
        }
    }
}