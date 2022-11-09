package com.jakchang.data.model.database

data class TrackListRequest(
    val term: String,
    val entity: String,
    val limit: Int? = 0,
    val offset: Int? = 0
)

data class TrackListResponse(
    val resultCount: Int,
    val results: ArrayList<TrackModel>
)

data class TrackModel(
    val artistId: Int,
    val collectionId: Int,
    val trackId: Int,
    val artistName: String = "",
    val collectionName: String = "",
    val trackName: String = "",
    val artworkUrl100: String = "",
)