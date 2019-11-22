package com.vuongnq1407.mediaplayer.ui

interface OnDataLoadedListener<T> {

    fun onSuccess(data: T)
    fun onFailed(exception: Exception)
}
