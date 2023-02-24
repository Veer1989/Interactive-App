package com.example.interactivedarkandreadmodeapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val dark =findViewById<Button>(R.id.btnDark)
        val light = findViewById<Button>(R.id.btnRead)
        val layout = findViewById<LinearLayout>(R.id.lays)
        val window = findViewById<Button>(R.id.button)
        dark.setOnClickListener {

layout.setBackgroundResource(R.color.black)
            Toast.makeText(applicationContext,"Dark mode enabled",Toast.LENGTH_SHORT).show()

        }

        light.setOnClickListener {

            layout.setBackgroundResource(R.color.lightYellow)
            Toast.makeText(applicationContext,"Reading mode enabled",Toast.LENGTH_SHORT).show()

        }
        window.setOnClickListener {
            intent = Intent(applicationContext,MainActivity2 :: class.java)
        startActivity(intent)
        }
    }
}