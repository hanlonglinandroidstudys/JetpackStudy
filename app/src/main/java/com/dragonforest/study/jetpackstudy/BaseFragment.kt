package com.dragonforest.study.jetpackstudy

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.ViewGroup.LayoutParams.MATCH_PARENT
import android.view.ViewGroup.LayoutParams.WRAP_CONTENT
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.fragment.app.Fragment

/**
 *
 * author: DragonForest
 * time: 2020/3/18
 */
abstract class BaseFragment() : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        var v: ViewGroup =
            LayoutInflater.from(container?.context).inflate(
                R.layout.fg_base,
                container,
                false
            ) as ViewGroup
        addCustomView(inflater, v)
        return v
    }


    private fun addCustomView(inflater: LayoutInflater, v: ViewGroup) {
        var content = v.findViewById<ConstraintLayout>(R.id.cl_content)
        content.removeAllViews()
        var lp: ViewGroup.LayoutParams = ViewGroup.LayoutParams(MATCH_PARENT, WRAP_CONTENT)
        var customView =
            inflater.inflate(getCustomLayout(), content, false)
        content.addView(customView, lp)
    }

    abstract fun getCustomLayout():Int
}