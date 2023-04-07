package com.example.tugas4

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var btnIntent : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnIntent = findViewById(R.id.btnPindah)
        btnIntent.setOnClickListener(this)
    }

        override fun onClick(v: View?) {
            when(v?.id){
                R.id.btnPindah -> run {
                    val intentActivity2 = Intent( this, Activity2::class.java)
                    startActivity(intentActivity2)
                }
            }
        }
    }