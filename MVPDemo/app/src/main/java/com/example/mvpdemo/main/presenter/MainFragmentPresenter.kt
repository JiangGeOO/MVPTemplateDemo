package com.example.mvpdemo.main.presenter

import com.example.mvpdemo.base.mvp.BasePresenter
import com.example.mvpdemo.main.contract.MainContract
import com.example.mvpdemo.main.contract.MainFragmentContract
import com.example.mvpdemo.main.model.MainFragmentModel
import com.example.mvpdemo.main.model.MainModel

class MainFragmentPresenter:BasePresenter<MainFragmentContract.Model,MainFragmentContract.View>(),
    MainFragmentContract.Presenter {
    override fun createModel(): MainFragmentContract.Model? = MainFragmentModel()
}