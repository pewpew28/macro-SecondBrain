package com.example.secondbrain.ui.note

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class NoteViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is Note Fragment"
    }
    val text: LiveData<String> = _text
}