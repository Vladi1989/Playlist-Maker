package com.spase_y.playlistmaker

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class Mediateka : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mediateka)
        val arrowBack = findViewById<ImageButton>(R.id.buttonBack)
        arrowBack.setOnClickListener {
            startActivity(Intent(this,MainActivity::class.java))
        }
    }
}
