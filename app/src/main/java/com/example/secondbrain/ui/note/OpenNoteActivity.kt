package com.example.secondbrain.ui.note

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import com.example.secondbrain.R

class OpenNoteActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_open_note)

        val ivEdit = findViewById<ImageView>(R.id.iv_edit)
        ivEdit.setOnClickListener {
            val directory = findViewById<TextView>(R.id.tv_directory).text.toString()
            val pecahTeks = directory.split(" / ")
            val A = pecahTeks[0] // "Projects"
            val B = pecahTeks[1] // "Folder"
            val C =pecahTeks[2] // "Subfolder"

            val category = A
            val title = findViewById<TextView>(R.id.tv_noteTitle).text.toString()
            val note = findViewById<TextView>(R.id.tv_noteDesc).text.toString()
            val reminder = findViewById<TextView>(R.id.tv_reminderDate).text.toString()
            val folder = B
            val subfolder = C

            val intent = Intent(this, EditNoteActivity::class.java)
            intent.putExtra("category", category)
            intent.putExtra("title", title)
            intent.putExtra("note", note)
            intent.putExtra("reminder", reminder)
            intent.putExtra("folder", folder)
            intent.putExtra("subfolder", subfolder)
            startActivity(intent)
        }
    }
}