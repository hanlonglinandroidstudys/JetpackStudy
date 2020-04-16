package com.dragonforest.study.jetpackstudy.fragments.livedata

import android.os.Bundle
import android.view.View
import com.dragonforest.study.jetpackstudy.BaseFragment
import com.dragonforest.study.jetpackstudy.R
import kotlinx.android.synthetic.main.fg_livedata.*

/**
 *
 * author: DragonForest
 * time: 2020/4/14
 */
class FgLiveData(mLink:String):BaseFragment(mLink) {
    override fun getCustomLayout(): Int {
        return R.layout.fg_livedata
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        btn_send.setOnClickListener {

        }
    }
}