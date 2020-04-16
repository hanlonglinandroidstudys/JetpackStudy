package com.dragonforest.study.jetpackstudy.fragments.viewmodel

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.dragonforest.study.jetpackstudy.R
import com.dragonforest.study.jetpackstudy.databinding.ActivityAcViewModelBinding
import com.dragonforest.study.jetpackstudy.fragments.viewmodel.model.User
import com.dragonforest.study.jetpackstudy.fragments.viewmodel.model.UserUtil
import kotlinx.android.synthetic.main.activity_ac_view_model.*

class AcViewModel : AppCompatActivity() {

    var data: User? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        var mBinding = DataBindingUtil.setContentView<ActivityAcViewModelBinding>(
            this,
            R.layout.activity_ac_view_model
        )
        data = UserUtil.getRandomUser()
        mBinding.user = data
        btn_operation.setOnClickListener {
            data?.age?.set(10)
            Log.e("e","data.age->")
        }
    }
}
