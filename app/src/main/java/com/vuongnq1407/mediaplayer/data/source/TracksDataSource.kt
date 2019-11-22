package com.vuongnq1407.mediaplayer.data.source

import com.vuongnq1407.mediaplayer.data.model.Track
import com.vuongnq1407.mediaplayer.ui.OnDataLoadedListener

interface TracksDataSource {

    interface Remote {

        fun getTracksRemote(
            genre: String,
            callback: OnDataLoadedListener<List<Track>>
        )

        fun searchTracksRemote(
            searchKey: String,
            callback: OnDataLoadedListener<List<Track>>
        )
    }

    interface Local { }
}
