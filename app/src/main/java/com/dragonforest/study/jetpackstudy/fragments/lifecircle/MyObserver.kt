package com.dragonforest.study.jetpackstudy.fragments.lifecircle

import android.util.Log
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleObserver
import androidx.lifecycle.OnLifecycleEvent

/**
 *
 * author: DragonForest
 * time: 2020/4/17
 */
class MyObserver : LifecycleObserver {

    var TAG = "MyObserver"
    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    fun connect() {
        Log.e(TAG, "开始连接")
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    fun disConnect(){
        Log.e(TAG, "断开连接")
    }
}