package com.example.mvpdemo.main.contract

import com.example.mvpdemo.base.mvp.IModel
import com.example.mvpdemo.base.mvp.IPresenter
import com.example.mvpdemo.base.mvp.IView

interface MainFragmentContract {
    interface View: IView {}

    interface Presenter: IPresenter<View> {

    }

    interface Model: IModel {

    }
}