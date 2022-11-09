package com.jakchang.data.datasource.database.bookmark_track

import com.jakchang.data.model.database.BookMarkTrackEntity
import kotlinx.coroutines.flow.Flow

interface BookMarkTrackDataSource {
    suspend fun selectBookMarkTrackList(): Flow<List<BookMarkTrackEntity>>

    suspend fun insertBookMarkTrack(track: BookMarkTrackEntity): Long

    suspend fun deleteBookMarkTrackById(trackId: Int): Int
}