package com.example.gobus

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_register.*

class RegisterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)
        supportActionBar?.hide()

        btnLogin1Listener()
        btnRegister1Listener()
    }

    private fun btnLogin1Listener() {
        btn_login1.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
        }
    }

    private fun btnRegister1Listener() {
        btn_daftar1.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
        }
    }
}