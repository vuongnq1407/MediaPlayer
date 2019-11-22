package com.vuongnq1407.mediaplayer.ui.home

import com.vuongnq1407.mediaplayer.data.model.Track
import com.vuongnq1407.mediaplayer.data.source.TracksRepository
import com.vuongnq1407.mediaplayer.ui.OnDataLoadedListener

class HomePresenter(
    private val tracksRepository: TracksRepository,
    private val view: HomeContract.View
) : HomeContract.Presenter {

    override fun getTracksRemote(genre: String) {
        tracksRepository.getTracksRemote(genre, object :
            OnDataLoadedListener<List<Track>> {
            override fun onSuccess(data: List<Track>) {

            }

            override fun onFailed(exception: Exception) {

            }
        })
    }
}
