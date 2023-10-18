package com.example.secondbrain.model

data class CategoryModel(
    var title: String? = null,
    var folder: List<FolderModel>,
    var isExpandable : Boolean = false
)
