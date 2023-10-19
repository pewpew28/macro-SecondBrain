package com.example.secondbrain.ui.note

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import com.example.secondbrain.MainActivity
import com.example.secondbrain.R
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout

class EditNoteActivity : AppCompatActivity() {

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_edit_note)

        val category = intent.getStringExtra("category")
        val title = intent.getStringExtra("title")
        val note = intent.getStringExtra("note")
        val reminder = intent.getStringExtra("reminder")
        val folder = intent.getStringExtra("folder")
        val subfolder = intent.getStringExtra("subfolder")

        val etCategory = findViewById<TextInputEditText>(R.id.tietCategory)
        val etTitle = findViewById<TextInputEditText>(R.id.tietTitle)
        val etNote = findViewById<TextInputEditText>(R.id.tietNote)
        val etReminder = findViewById<EditText>(R.id.etReminder)
        val etFolder = findViewById<EditText>(R.id.etFolder)
        val etSubfolder = findViewById<EditText>(R.id.etSubfolder)

        etCategory.setText(category)
        etTitle.setText(title)
        etNote.setText(note)
        etReminder.setText(reminder)
        etFolder.setText(folder)
        etSubfolder.setText(subfolder)

        val fBtn = findViewById<FloatingActionButton>(R.id.btn_simpan)
        fBtn.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}