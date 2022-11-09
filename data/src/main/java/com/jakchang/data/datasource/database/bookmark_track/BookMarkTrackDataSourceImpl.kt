package com.jakchang.data.datasource.database.bookmark_track

import com.jakchang.data.dao.BookMarkTrackDao
import com.jakchang.data.model.database.BookMarkTrackEntity
import kotlinx.coroutines.flow.Flow

class BookMarkTrackDataSourceImpl(private val bookMarkTrackDao: BookMarkTrackDao) :
    BookMarkTrackDataSource {
    override suspend fun selectBookMarkTrackList(): Flow<List<BookMarkTrackEntity>> {
        return bookMarkTrackDao.selectBookMarkTrackList()
    }

    override suspend fun insertBookMarkTrack(track: BookMarkTrackEntity): Long {
        return bookMarkTrackDao.insertBookMarkTrack(track = track)
    }

    override suspend fun deleteBookMarkTrackById(trackId: Int): Int {
        return bookMarkTrackDao.deleteBookMarkTrackById(trackId = trackId)
    }
}