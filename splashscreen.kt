package com.example.weatherconditions

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.content.Intent

class splashscreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splashscreen)



        val startButton: Button = findViewById(R.id.startButton)
        val exitButton: Button = findViewById(R.id.exitButton)

        startButton.setOnClickListener {
            // Start Mainscreen
            startActivity(Intent(this, Maiainscreen::class.java))
        }

        exitButton.setOnClickListener {
            // Exit the app
            finishAffinity()
        }
    }
}

class Maiainscreen {

}















