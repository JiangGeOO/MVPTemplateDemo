package com.example.mvpdemo.login.activity;


import com.example.mvpdemo.R
import com.example.mvpdemo.base.BaseMVPActivity
import com.example.mvpdemo.login.contract.LoginActivityContract
import com.example.mvpdemo.login.presenter.LoginActivityPresenter

class LoginActivity :
    BaseMVPActivity<LoginActivityContract.View, LoginActivityContract.Presenter>(),
    LoginActivityContract.View {
    override fun createPresenter(): LoginActivityContract.Presenter = LoginActivityPresenter()

    override fun getLayoutResId(): Int = R.layout.activity_login

    override fun initData() {

    }

}
