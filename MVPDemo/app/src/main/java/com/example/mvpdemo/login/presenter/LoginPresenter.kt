package com.example.mvpdemo.login.presenter

import com.example.mvpdemo.base.mvp.BasePresenter
import com.example.mvpdemo.login.contract.LoginContract
import com.example.mvpdemo.login.model.LoginModel

class LoginPresenter : BasePresenter<LoginContract.Model, LoginContract.View>(),
    LoginContract.Presenter {
    override fun createModel(): LoginContract.Model? = LoginModel()
}