package com.example.secondbrain.model

import java.util.Random

object SubfolderDataFactory {
    private val random = Random()
    private val titles = arrayListOf("Infinite Learning", "Himpunan", "Kuliah", "Pekerjaan")

    private fun randomNotes() : List<NoteModel> {
        return NoteDataFactory.getChildren(5)
    }

    fun getParents (count : Int) : List<SubfolderModel>{
        val subfolders = mutableListOf<SubfolderModel>()
        repeat(count){
            val subfolder = SubfolderModel(titles[it], randomNotes())
            subfolders.add(subfolder)
        }
        return subfolders
    }
}