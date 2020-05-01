package com.example.mvpdemo.main

import com.example.mvpdemo.R
import com.example.mvpdemo.base.BaseMVPFragment
import com.example.mvpdemo.main.contract.MainFragmentContract
import com.example.mvpdemo.main.presenter.MainFragmentPresenter

class MainFragment :BaseMVPFragment<MainFragmentContract.View,MainFragmentContract.Presenter>(),MainFragmentContract.View {
    override fun createPresenter(): MainFragmentContract.Presenter =MainFragmentPresenter()

    override fun getLayoutResId(): Int = R.layout.fragment_activity

    override fun initData() {
        TODO("Not yet implemented")
    }
}