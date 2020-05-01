package com.example.mvpdemo.base.mvp

interface IPresenter<in V:IView> {
    fun attachView(view:V)

    fun detachView()
}