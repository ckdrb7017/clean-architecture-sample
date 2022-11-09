package  com.jakchang.data.datasource.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.jakchang.data.dao.BookMarkTrackDao
import com.jakchang.data.model.database.BookMarkTrackEntity

@Database(entities = [BookMarkTrackEntity::class], version = 1, exportSchema = false)
abstract class AppDatabase : RoomDatabase() {

    abstract fun bookMarkTrackDao(): BookMarkTrackDao
}

