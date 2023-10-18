package com.example.secondbrain.model

import java.util.Random

object NoteDataFactory {
    private val random = Random()
    private val titles = arrayListOf("Web Development", "Project Abc", "Project U", "Nomor Penting")

    private fun randomTitle() : String{
        val index = random.nextInt(titles.size)
        return titles[index]
    }

    fun getChildren (count : Int) : List<NoteModel>{
        val notes = mutableListOf<NoteModel>()
        repeat(count){
            val note = NoteModel(randomTitle())
            notes.add(note)
        }
        return notes
    }
}