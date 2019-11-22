package com.vuongnq1407.mediaplayer.data.source.local

import com.vuongnq1407.mediaplayer.data.source.TracksDataSource

class TracksLocalDataSource : TracksDataSource.Local {

    companion object {

        private var INSTANCE: TracksLocalDataSource? = null

        fun getInstance() = INSTANCE ?: synchronized(this) {
            INSTANCE ?: TracksLocalDataSource().also { INSTANCE = it }
        }
    }
}
