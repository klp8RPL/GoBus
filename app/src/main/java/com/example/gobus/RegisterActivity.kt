package com.example.gobus

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.gobus.databinding.ActivityRegisterBinding
import com.example.gobus.databinding.FragmentHomeBinding
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_register.*

class RegisterActivity : AppCompatActivity() {
    private lateinit var binding:ActivityRegisterBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRegisterBinding.inflate(layoutInflater)
        setContentView(binding.root)
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

    private fun initListener() = with(binding) {
        btn_daftar.setOnClickListener {
            android.util.Log.d("HomeFragment", "initListener: btn_daftar")
            startActivity(Intent(this@RegisterActivity, com.example.gobus.MainActivity::class.java))
        }
    }
}
