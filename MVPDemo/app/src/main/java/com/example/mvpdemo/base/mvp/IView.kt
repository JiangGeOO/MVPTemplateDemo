package com.example.mvpdemo.base.mvp

interface IView{
    /**
     * 显示加载
     */
    fun showLoading()

    /**
     * 隐藏加载
     */
    fun dismissLoading()

    fun showMsg(msg:String)

    fun showError(errorMsg:String)
}