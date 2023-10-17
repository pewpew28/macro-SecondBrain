package com.example.secondbrain

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText

class RegisterActivity : AppCompatActivity(), View.OnClickListener {
    private lateinit var etUsername: EditText
    private lateinit var etPassword: EditText
    private lateinit var etConfirmPassword: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        etUsername = findViewById(R.id.emailEt)
        etPassword = findViewById(R.id.passET)
        etConfirmPassword = findViewById(R.id.confirmPassET)

        val btnRegister : Button = findViewById(R.id.btn_regis)
        btnRegister.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        when(v.id){
            R.id.btn_regis -> {

                val bundle = Bundle()
                bundle.putString("username",etUsername.text.toString())
                bundle.putString("password",etPassword.text.toString())

                val intent = Intent(this@RegisterActivity, LoginActivity::class.java)
                intent.putExtras(bundle)
                startActivity(intent)
            }
        }
    }
}