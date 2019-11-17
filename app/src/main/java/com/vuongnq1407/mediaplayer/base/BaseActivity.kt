package com.vuongnq1407.mediaplayer.base

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

abstract class BaseActivity: AppCompatActivity() {

    abstract val layoutResId: Int
    abstract fun initData(savedInstanceState: Bundle?)
    abstract fun initComponents()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(layoutResId)
        initData(savedInstanceState)
        initComponents()
    }
}
