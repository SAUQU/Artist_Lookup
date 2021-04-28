package com.example.artistlookup.models

data class APIResponse(

    val cod: String?,
    val message: Int?,
    val cnt: Int?,
    val results: List<TrackDTO>
)