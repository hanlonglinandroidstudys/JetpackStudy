package com.dragonforest.study.jetpackstudy.fragments.lifecircle

import android.os.Bundle
import android.util.Log
import android.view.View
import com.dragonforest.study.jetpackstudy.BaseFragment
import com.dragonforest.study.jetpackstudy.R

/**
 *
 * author: DragonForest
 * time: 2020/4/17
 */
class FgLifecircle(mLink: String) : BaseFragment(mLink) {
    var TAG="FgLifecircle"
    override fun getCustomLayout(): Int {
        return R.layout.fg_lifecircle
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        lifecycle.addObserver(MyObserver())
    }

    override fun onResume() {
        super.onResume()
        Log.e(TAG,"onResume()")
    }

    override fun onPause() {
        super.onPause()
        Log.e(TAG,"onPause()")
    }
}