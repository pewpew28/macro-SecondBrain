package com.example.secondbrain.ui.note

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.secondbrain.R

class FolderActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_folder)

//        initRecycler()
    }
//    private fun initRecycler() {
//        rvSubfolder = findViewById(R.id.rv_subfolder)
//
//        rvSubfolder.apply {
//            layoutManager = LinearLayoutManager ( this@FolderActivity, RecyclerView.VERTICAL, false)
//            adapter = SubfolderAdapter(SubfolderDataFactory.getParents(4))
//        }
//    }
}