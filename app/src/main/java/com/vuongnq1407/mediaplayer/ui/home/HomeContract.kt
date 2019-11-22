package com.vuongnq1407.mediaplayer.ui.home

interface HomeContract {

    interface View {}

    interface Presenter {
        fun getTracksRemote (genre: String)
    }
}
