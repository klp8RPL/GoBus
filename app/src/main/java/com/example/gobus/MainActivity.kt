package com.example.gobus

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ArrayAdapter
import android.widget.AutoCompleteTextView
import android.widget.Button

class MainActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var btnLogin : Button
    private lateinit var btnDaftar : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.hide()

        btnLogin = findViewById(R.id.btn_login)
        btnLogin.setOnClickListener(this)

        btnDaftar = findViewById(R.id.btn_daftar)
        btnDaftar.setOnClickListener(this)

        // get reference to the string array that we just created
        val melalui_atm = resources.getStringArray(R.array.melalui_atm)
        // create an array adapter and pass the required parameter
        // in our case pass the context, drop down layout , and array.
        val arrayAdapter = ArrayAdapter(this, R.layout.dropdown_item, melalui_atm)
        // get reference to the autocomplete text view
        val autocompleteTV = findViewById<AutoCompleteTextView>(R.id.autoCompleteTextView)
        // set adapter to the autocomplete tv to the arrayAdapter
        autocompleteTV.setAdapter(arrayAdapter)

    }

    override fun onClick(v: View) {
        when(v.id){
            R.id.btn_login -> {
                val intenLogin = Intent(this@MainActivity, HomeActivity::class.java)
                startActivity(intenLogin)
            }
        }

        when(v.id){
            R.id.btn_daftar -> {
                val intenDaftar = Intent(this@MainActivity, RegisterActivity::class.java)
                startActivity(intenDaftar)
            }
        }
    }
}