package com.vuongnq1407.mediaplayer.data.source

import com.vuongnq1407.mediaplayer.data.model.Track
import com.vuongnq1407.mediaplayer.data.source.local.TracksLocalDataSource
import com.vuongnq1407.mediaplayer.data.source.remote.TracksRemoteDataSource
import com.vuongnq1407.mediaplayer.ui.OnDataLoadedListener

class TracksRepository(
    private val remoteDataSource: TracksDataSource.Remote,
    private val localDataSource: TracksDataSource.Local
) : TracksDataSource.Remote, TracksDataSource.Local {

    override fun getTracksRemote(
        genre: String,
        callback: OnDataLoadedListener<List<Track>>
    ) {
        remoteDataSource.getTracksRemote(genre, callback)
    }

    override fun searchTracksRemote(
        searchKey: String,
        callback: OnDataLoadedListener<List<Track>>
    ) {
        remoteDataSource.searchTracksRemote(searchKey, callback)
    }

    companion object {
        private var INSTANCE: TracksRepository? = null
        fun getInstance(
            remoteDataSource: TracksRemoteDataSource,
            localDataSource: TracksLocalDataSource
        ) = INSTANCE ?: synchronized(this) {
            INSTANCE ?: TracksRepository(remoteDataSource, localDataSource).also { INSTANCE = it }
        }
    }
}
