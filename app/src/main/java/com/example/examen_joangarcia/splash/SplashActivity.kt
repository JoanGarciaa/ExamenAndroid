package com.example.examen_joangarcia.splash

import android.content.Intent
import android.os.Bundle
import com.example.examen_joangarcia.MainActivity
import com.example.examen_joangarcia.R

class SplashActivity : androidx.appcompat.app.AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        startActivity(Intent(this, MainActivity::class.java))
    }
}

