package com.example.mvpdemo.login.presenter

import com.example.mvpdemo.base.mvp.BasePresenter
import com.example.mvpdemo.login.contract.LoginActivityContract
import com.example.mvpdemo.login.model.LoginActivityModel

class LoginActivityPresenter :
    BasePresenter<LoginActivityContract.Model, LoginActivityContract.View>(),
    LoginActivityContract.Presenter {
    override fun createModel(): LoginActivityContract.Model? = LoginActivityModel()
}