package com.jakchang.data.model.database

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "tb_bookmark_track")
data class BookMarkTrackEntity(
    @PrimaryKey
    @ColumnInfo(name = "track_id") val trackId: Int,
    @ColumnInfo(name = "collection_id") val collectionId: Int,
    @ColumnInfo(name = "artist_id") val artistId: Int,
    @ColumnInfo(name = "track_name") val trackName: String? = "",
    @ColumnInfo(name = "collection_name") val collectionName: String? = "",
    @ColumnInfo(name = "artist_name") val artistName: String? = "",
    @ColumnInfo(name = "artwork_url") val artworkUrl: String? = "",
    @ColumnInfo(name = "created_date") val createdDate: String? = ""
)