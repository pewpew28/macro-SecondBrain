package com.example.secondbrain.model

import java.util.Random

object FolderDataFactory {
    private val random = Random()
    private val titles = arrayListOf("College", "Business", "Competition", "Daily Needs")

    private fun randomTitle() : String{
        val index = random.nextInt(titles.size)
        return titles[index]
    }

    fun getChildren (count : Int) : List<FolderModel>{
        val folders = mutableListOf<FolderModel>()
        repeat(count){
            val folder = FolderModel(randomTitle())
            folders.add(folder)
        }
        return folders
    }
}