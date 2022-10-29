package com.example.foodapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class LoginActivity : AppCompatActivity() {
    lateinit var login: Button
    lateinit var registration: TextView
    lateinit var forgetPsd: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        login = findViewById(R.id.btnLogin)
        registration = findViewById(R.id.txtRegisterYourself)
        forgetPsd = findViewById(R.id.txtForgotPassword)

        registration.setOnClickListener(){
            startActivity(Intent(this,RegistrationActivity::class.java))
        }

        forgetPsd.setOnClickListener(){
            startActivity(Intent(this,ForgetPswActivity::class.java))
        }

        login.setOnClickListener(){
            startActivity(Intent(this,DashboardActivity::class.java))
        }
    }
}