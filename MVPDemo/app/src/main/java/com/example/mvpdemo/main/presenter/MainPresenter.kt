package com.example.mvpdemo.main.presenter

import com.example.mvpdemo.base.mvp.BasePresenter
import com.example.mvpdemo.main.contract.MainContract
import com.example.mvpdemo.main.model.MainModel

class MainPresenter:BasePresenter<MainContract.Model,MainContract.View>(),MainContract.Presenter {
    override fun createModel(): MainContract.Model? = MainModel()
}