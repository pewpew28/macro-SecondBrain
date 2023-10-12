package com.example.secondbrain.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class User(
    val email : String,
    val pass: String
):Parcelable
