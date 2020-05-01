package com.example.mvpdemo.login.contract

import com.example.mvpdemo.base.mvp.IModel
import com.example.mvpdemo.base.mvp.IPresenter
import com.example.mvpdemo.base.mvp.IView

public interface LoginContract {

    interface View : IView {

    }

    interface Model : IModel {

    }

    interface Presenter : IPresenter<View> {

    }


}