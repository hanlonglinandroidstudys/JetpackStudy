package com.dragonforest.study.jetpackstudy.fragments.viewmodel.model

import androidx.databinding.ObservableInt

/**
 *
 * author: DragonForest
 * time: 2020/4/16
 */
object UserUtil {

    fun getRandomUser(): User {
        var seconds = System.currentTimeMillis() / 1000
        var id = seconds.toInt() % 10
        when (id) {
            0 -> {
                return User("韩龙林", ObservableInt(20),"打篮球")
            }
            1 -> {
                return User("李福傑", ObservableInt(30),"看书")
            }
            2 -> {
                return User("何鑫", ObservableInt(30),"玩手機")
            }
            3 -> {
                return User("鄭斌", ObservableInt(35),"工作")
            }
            4 -> {
                return User("李猛", ObservableInt(30),"看电影")
            }
            5 -> {
                return User("薛小龙", ObservableInt(26),"恋爱")
            }
            6 -> {
                return User("木血症", ObservableInt(32),"看孩子")
            }
            7 -> {
                return User("韩龙森", ObservableInt(32),"吃肉")
            }
            8 -> {
                return User("李云飞", ObservableInt(30),"滑雪")
            }
            9 -> {
                return User("刘凡", ObservableInt(30),"吃肉")
            }
            else -> {
                return User("我本人", ObservableInt(20),"什么都爱")
            }
        }
    }
}