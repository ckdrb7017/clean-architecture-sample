package com.jakchang.data.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.jakchang.data.model.database.BookMarkTrackEntity
import kotlinx.coroutines.flow.Flow

@Dao
interface BookMarkTrackDao {
    @Query("select * from tb_bookmark_track")
    fun selectBookMarkTrackList(): Flow<List<BookMarkTrackEntity>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertBookMarkTrack(track: BookMarkTrackEntity): Long

    @Query("delete from tb_bookmark_track where track_id =:trackId")
    suspend fun deleteBookMarkTrackById(trackId: Int): Int
}