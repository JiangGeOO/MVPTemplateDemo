package com.example.mvpdemo.login.activity;

import androidx.appcompat.app.AppCompatActivity
import com.example.mvpdemo.R
import com.example.mvpdemo.base.BaseMVPFragment

import com.example.mvpdemo.login.contract.LoginContract
import com.example.mvpdemo.login.presenter.LoginPresenter

class Login : BaseMVPFragment<LoginContract.View, LoginContract.Presenter>(), LoginContract.View {
    override fun createPresenter(): LoginContract.Presenter = LoginPresenter()

    override fun getLayoutResId(): Int = R.layout.fragment_login

    override fun initData() {
        TODO("Not yet implemented")
    }

}

