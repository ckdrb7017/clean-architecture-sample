package com.jakchang.clean_architecture_sample.di

import com.jakchang.data.dao.BookMarkTrackDao
import com.jakchang.data.datasource.database.bookmark_track.BookMarkTrackDataSource
import com.jakchang.data.datasource.database.bookmark_track.BookMarkTrackDataSourceImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object DataSourceModule {

    @Provides
    @Singleton
    fun provideBookMarkTrackDataSource(bookMarkTrackDao: BookMarkTrackDao): BookMarkTrackDataSource {
        return BookMarkTrackDataSourceImpl(
            bookMarkTrackDao = bookMarkTrackDao
        )
    }
}