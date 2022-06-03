package com.example.gobus

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class TiketActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tiket)
        supportActionBar?.hide()
    }
}