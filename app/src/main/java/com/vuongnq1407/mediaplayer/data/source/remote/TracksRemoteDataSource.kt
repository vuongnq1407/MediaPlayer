package com.vuongnq1407.mediaplayer.data.source.remote

import com.vuongnq1407.mediaplayer.data.model.Track
import com.vuongnq1407.mediaplayer.data.source.TracksDataSource
import com.vuongnq1407.mediaplayer.ui.OnDataLoadedListener

class TracksRemoteDataSource : TracksDataSource.Remote {

    override fun getTracksRemote(
        genre: String,
        callback: OnDataLoadedListener<List<Track>>
    ) {
        TracksAsyncTask(callback).execute(genre)
    }

    override fun searchTracksRemote(
        searchKey: String,
        callback: OnDataLoadedListener<List<Track>>
    ) {

    }

    companion object {

        private var INSTANCE: TracksRemoteDataSource? = null

        fun getInstance() = INSTANCE ?: synchronized(this) {
            INSTANCE ?: TracksRemoteDataSource().also { INSTANCE = it }
        }
    }
}
