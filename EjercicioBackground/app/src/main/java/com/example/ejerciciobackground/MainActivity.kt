package com.example.ejerciciobackground

import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        var btnCambiar: Button = findViewById<Button>(R.id.button)
        var fondo: View = findViewById(R.id.view)
        btnCambiar.setOnClickListener{
            val randomDouble = Math.random()
            val randomInt = (randomDouble * 6).toInt() + 1
            when (randomInt) {
                1 -> fondo.setBackgroundColor(Color.RED)
                2 -> fondo.setBackgroundColor(Color.GREEN)
                3 -> fondo.setBackgroundColor(Color.BLUE)
                4 -> fondo.setBackgroundColor(Color.YELLOW)
                5 -> fondo.setBackgroundColor(Color.MAGENTA)
                6 -> fondo.setBackgroundColor(Color.CYAN)
            }
        }
    }
}