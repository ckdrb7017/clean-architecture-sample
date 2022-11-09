package com.jakchang.clean_architecture_sample.di

import android.content.Context
import androidx.room.Room
import com.jakchang.data.dao.BookMarkTrackDao
import com.jakchang.data.datasource.database.AppDatabase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object LocalDBModule {

    @Singleton
    @Provides
    fun provideBookMarkTrackDao(
        database: AppDatabase
    ): BookMarkTrackDao {
        return database.bookMarkTrackDao()
    }

    @Singleton
    @Provides
    fun provideDataBase(@ApplicationContext context: Context): AppDatabase {
        return Room.databaseBuilder(
            context,
            AppDatabase::class.java,
            "clean_architecture_sample.db"
        ).build()
    }
}