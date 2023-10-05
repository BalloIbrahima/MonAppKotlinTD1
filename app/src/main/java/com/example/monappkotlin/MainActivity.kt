package com.example.monappkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonClicquerMoi = findViewById<Button>(R.id.buttonClickMoi)

        buttonClicquerMoi.setOnClickListener {
            val message = "Bouton cliqué!"
            Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
        }
    }
}