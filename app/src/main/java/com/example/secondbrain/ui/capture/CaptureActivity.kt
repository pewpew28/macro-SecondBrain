package com.example.secondbrain.ui.capture

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.secondbrain.MainActivity
import com.example.secondbrain.R
import com.example.secondbrain.ui.home.HomeFragment
import com.google.android.material.floatingactionbutton.FloatingActionButton

class CaptureActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_capture)

        val fab = findViewById<FloatingActionButton>(R.id.btn_simpan)
        fab.setOnClickListener {
            val intent = Intent(this@CaptureActivity, MainActivity::class.java )
            startActivity(intent)
        }
    }

}