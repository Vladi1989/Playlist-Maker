package com.spase_y.playlistmaker

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val settings = findViewById<TextView>(R.id.setting)
        settings.setOnClickListener {
            startActivity(Intent(this, SettingsActivity::class.java))
        }
        val mediateka = findViewById<TextView>(R.id.mediateka)
        mediateka.setOnClickListener {
            startActivity(Intent(this, Mediateka::class.java))
        }
        val find = findViewById<TextView>(R.id.find)
        find.setOnClickListener {
            startActivity(Intent(this, Find::class.java))
//            val stat = 0
        }
    }
}



