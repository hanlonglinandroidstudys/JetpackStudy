package com.dragonforest.study.jetpackstudy.fragments.viewmodel

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import com.dragonforest.study.jetpackstudy.R
import com.dragonforest.study.jetpackstudy.databinding.FgViewmodelBinding
import com.dragonforest.study.jetpackstudy.fragments.viewmodel.model.User
import com.dragonforest.study.jetpackstudy.fragments.viewmodel.model.UserUtil
import kotlinx.android.synthetic.main.fg_viewmodel.*

/**
 *
 * author: DragonForest
 * time: 2020/4/16
 */
class FgViewMode : Fragment() {
    var data: User?=null
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val mBinding = DataBindingUtil.inflate<FgViewmodelBinding>(
            inflater,
            R.layout.fg_viewmodel,
            container,
            false
        )
        var v = mBinding.root
        data=UserUtil.getRandomUser()
        mBinding.user = data
        return v
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        btn_operation.setOnClickListener {
            data = UserUtil.getRandomUser()
        }
        btn_ac_databinding.setOnClickListener {
            startActivity(Intent(context,AcViewModel::class.java))
        }
    }
}