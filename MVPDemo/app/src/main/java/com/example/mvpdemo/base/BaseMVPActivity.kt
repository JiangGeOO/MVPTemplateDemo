package com.example.mvpdemo.base

import com.example.mvpdemo.base.mvp.IPresenter
import com.example.mvpdemo.base.mvp.IView

abstract class BaseMVPActivity<in V:IView,P:IPresenter<V>>:BaseActtivity(),IView {
    protected var mPresenter: P? = null


    override fun initView() {
        mPresenter=createPresenter()
        mPresenter?.attachView(this as V)
    }

    override fun onDestroy() {
        super.onDestroy()
        mPresenter?.detachView()
        this.mPresenter = null
    }

    override fun showLoading() {
    }

    override fun dismissLoading() {
    }

    override fun showError(errorMsg: String) {

    }


    override fun showMsg(msg: String) {

    }

    protected abstract fun createPresenter(): P


}