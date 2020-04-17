package com.dragonforest.study.jetpackstudy

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.dragonforest.study.jetpackstudy.fragments.lifecircle.FgLifecircle
import com.dragonforest.study.jetpackstudy.fragments.livedata.FgLiveData
import com.dragonforest.study.jetpackstudy.fragments.viewmodel.FgViewMode
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initView()
    }

    private fun initView() {

        var adapter = MainFragmentAdapter(supportFragmentManager, 0)
        var fgs: MutableList<Fragment> = arrayListOf()
        var titles: MutableList<String> = arrayListOf()
        getFragmentsAndTitles(fgs, titles)
        adapter.fragments = fgs
        adapter.titles = titles
        viewpager.adapter = adapter
        ct_tablayout.setUpWithViewPager(viewpager)
    }

    fun getFragmentsAndTitles(fgs: MutableList<Fragment>, titles: MutableList<String>) {
        fgs.add(FgViewMode())
        titles.add("数据绑定dataBinding")
        fgs.add(FgLifecircle("https://developer.android.google.cn/topic/libraries/architecture/lifecycle#kotlin"))
        titles.add("LifeCircle")
        fgs.add(FgLiveData(""))
        titles.add("LiveData")
    }
}
