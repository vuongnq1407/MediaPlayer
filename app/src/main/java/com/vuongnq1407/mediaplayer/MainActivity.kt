package com.vuongnq1407.mediaplayer

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.app.ComponentActivity.ExtraData
import androidx.core.content.ContextCompat.getSystemService
import android.icu.lang.UCharacter.GraphemeClusterBreak.T
import com.vuongnq1407.mediaplayer.data.model.Track
import com.vuongnq1407.mediaplayer.data.source.TracksDataSource
import com.vuongnq1407.mediaplayer.data.source.TracksRepository
import com.vuongnq1407.mediaplayer.data.source.local.TracksLocalDataSource
import com.vuongnq1407.mediaplayer.data.source.remote.TracksRemoteDataSource
import com.vuongnq1407.mediaplayer.util.Constants
import java.io.BufferedInputStream
import java.io.Console
import java.net.HttpURLConnection
import java.net.URL


class MainActivity : AppCompatActivity() {

    private val tracksRemoteDataSource = TracksRemoteDataSource()
    private val tracksLocalDataSource = TracksLocalDataSource()
    private val tracksRepository = TracksRepository(tracksRemoteDataSource, tracksLocalDataSource)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        tracksRepository.getTracksRemote(Constants.Genre.GENRES_ALL_AUDIO,object : TracksDataSource.LoadTracksCallback{
            override fun onTracksLoaded(track: List<Track>) {
                TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
            }

            override fun onDataNotAvailable() {
                TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
            }
        })
    }
}

