package com.vuongnq1407.mediaplayer.util

object Constants {

    object Url {
        const val BASE_GENRE_URL = "https://api-v2.soundcloud.com/charts?kind=top&genre=%s&client_id=%s&limit=10&offset=10"
        const val BASE_SEARCH_URL = "http://api.soundcloud.com/tracks?q=%s&client_id=%s&limit=10&offset=10"
        const val BASE_DOWNLOAD_URL = "https://api.soundcloud.com/tracks/%s/download?client_id=%s"
        const val BASE_STREAM_URL = "https://api.soundcloud.com/tracks/%s/stream?client_id=%s"
        const val BASE_TRENDING_URL = "https://api-v2.soundcloud.com/charts?kind=top&genre=soundcloud:genres:all-music&client_id=%s&limit=10&offset=10"
    }

    object Genre {
        const val GENRES_COUNTRY = "soundcloud:genres:country"
        const val GENRES_ALL_MUSIC = "soundcloud:genres:all-music"
        const val GENRES_ALL_AUDIO = "soundcloud:genres:all-audio"
        const val GENRES_ROCK = "soundcloud:genres:alternativerock"
        const val GENRES_AMBIENT = "soundcloud:genres:ambient"
        const val GENRES_CLASSICAL = "soundcloud:genres:classical"
    }

    object Track{
        const val COLLECTION = "collection"
        const val TRACK = "track"
        const val ID = "id"
        const val TITLE = "title"
        const val ARTWORK_URL = "artwork_url"
        const val DURATION = "duration"
        const val IS_DOWNLOAD = "downloadable"
        const val DOWNLOAD_URL = "download_url"
        const val PUBLISHER_METADATA = "publisher_metadata"
        const val STREAM_URL = "stream_url"
        const val ARTIST = "artist"
        const val USER = "user"
        const val USERNAME = "username"
        const val LIKE_COUNT = "likes_count"
        const val DESCRIPTION= "description"
    }
}
