package com.vuongnq1407.mediaplayer.ui.home

import android.os.Bundle
import com.vuongnq1407.mediaplayer.R
import com.vuongnq1407.mediaplayer.base.BaseFragment
import com.vuongnq1407.mediaplayer.data.source.TracksRepository
import com.vuongnq1407.mediaplayer.data.source.local.TracksLocalDataSource
import com.vuongnq1407.mediaplayer.data.source.remote.TracksRemoteDataSource
import com.vuongnq1407.mediaplayer.util.Constants

class HomeFragment : BaseFragment(), HomeContract.View {

    private val tracksRepository: TracksRepository by lazy {
        TracksRepository(TracksRemoteDataSource.getInstance(), TracksLocalDataSource.getInstance())
    }
    private val homePresenter: HomePresenter by lazy { HomePresenter(tracksRepository, this) }

    override val layoutResId: Int get() = R.layout.fragment_home

    override fun initData(savedInstanceState: Bundle?) {
    }

    override fun initComponents() {
        homePresenter.getTracksRemote(Constants.Genre.GENRES_ALL_AUDIO)
    }
}
