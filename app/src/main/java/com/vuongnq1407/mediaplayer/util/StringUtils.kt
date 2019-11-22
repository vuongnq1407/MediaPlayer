package com.vuongnq1407.mediaplayer.util

import com.vuongnq1407.mediaplayer.BuildConfig

object StringUtils {

    fun initGenreUrl(genre: String) =
        String.format(Constants.Url.BASE_GENRE_URL, genre, BuildConfig.CLIENT_ID)

    fun initSearchUrl(keySearch: String) =
        String.format(Constants.Url.BASE_SEARCH_URL, keySearch, BuildConfig.CLIENT_ID)

    fun initDownloadUrl(trackId: String) =
        String.format(Constants.Url.BASE_DOWNLOAD_URL, trackId, BuildConfig.CLIENT_ID)

    fun initStreamUrl(trackId: String) =
        String.format(Constants.Url.BASE_STREAM_URL, trackId, BuildConfig.CLIENT_ID)
}
