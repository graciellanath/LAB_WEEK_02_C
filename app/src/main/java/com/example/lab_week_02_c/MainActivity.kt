package com.example.lab_week_02_c

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {   // ← ini sudah benar
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val root = findViewById<android.view.View>(R.id.main)
        ViewCompat.setOnApplyWindowInsetsListener(root) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val btnStandard = findViewById<Button>(R.id.button_standard)
        val btnSingleTop = findViewById<Button>(R.id.button_single_top)

        btnStandard.setOnClickListener {
            startActivity(Intent(this, StandardActivity::class.java))
        }

        btnSingleTop.setOnClickListener {
            startActivity(Intent(this, SingleTopActivity::class.java))
        }
    }
}
