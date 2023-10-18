package com.example.secondbrain.model

import java.util.Random

object CategoryDataFactory {
    private val random = Random()
    private val titles = arrayListOf("Projects", "Areas", "Resources", "Archives")

    private fun randomFolders() : List<FolderModel> {
        return FolderDataFactory.getChildren(5)
    }

    fun getParents (count : Int) : List<CategoryModel>{
        val categories = mutableListOf<CategoryModel>()
        repeat(count){
            val category = CategoryModel(titles[it], randomFolders())
            categories.add(category)
        }
        return categories
    }
}