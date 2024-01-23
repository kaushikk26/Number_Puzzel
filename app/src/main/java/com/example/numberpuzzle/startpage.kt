package com.example.numberpuzzle;

import android.app.Activity;
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity


class startpage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_startpage)

        val play: Button = findViewById(R.id.play)
        play.setOnClickListener {
            // Handle the button click - navigate to the main page
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

    }
}
