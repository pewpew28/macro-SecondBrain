package com.example.secondbrain.model

data class SubfolderModel(
    var title: String? = null,
    var folder: List<NoteModel>,
    var isExpandable : Boolean = false
)
