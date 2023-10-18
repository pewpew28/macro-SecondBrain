package com.example.secondbrain.ui.note

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.secondbrain.R
import com.example.secondbrain.adapter.SubfolderAdapter
import com.example.secondbrain.model.SubfolderDataFactory

class FolderActivity : AppCompatActivity() {
    private lateinit var rvSubfolder: RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_folder)

        initRecycler()
    }
    private fun initRecycler() {
        rvSubfolder = findViewById(R.id.rv_subfolder)

        rvSubfolder.apply {
            layoutManager = LinearLayoutManager ( this@FolderActivity, RecyclerView.VERTICAL, false)
            adapter = SubfolderAdapter(SubfolderDataFactory.getParents(2))
        }
    }
}