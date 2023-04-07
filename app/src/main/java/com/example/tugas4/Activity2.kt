package com.example.tugas4

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class Activity2 : AppCompatActivity(), View.OnClickListener {

    private lateinit var btnIntent : Button

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_2)

        btnIntent=findViewById(R.id.btnLogout)
        btnIntent.setOnClickListener(this)
    }

    override fun onClick(v: View?) {

        when(v?.id){
            R.id.btnLogout -> run {
                val intentback = Intent( this, MainActivity::class.java)
                startActivity(intentback)
            }
        }
    }
}