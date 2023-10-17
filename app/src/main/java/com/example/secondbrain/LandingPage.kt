package com.example.secondbrain

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import com.example.secondbrain.model.User

class LandingPage : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_landing_page)
        val btnLogin: Button = findViewById(R.id.login)
        btnLogin.setOnClickListener(this)
        val btnRegister : Button = findViewById(R.id.regis)
        btnRegister.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        when (v.id) {
            R.id.login -> {
                val intent = Intent(this@LandingPage, LoginActivity::class.java)
                startActivity(intent)
            }

            R.id.regis -> {
                val intent = Intent(this@LandingPage, RegisterActivity::class.java)
                startActivity(intent)
            }

        }
    }
}