package com.example.mvpdemo.base

import android.os.Bundle
import android.view.View
import com.example.mvpdemo.base.mvp.IPresenter
import com.example.mvpdemo.base.mvp.IView

abstract class BaseMVPFragment<in V:IView,P:IPresenter<V>>:BaseFragment(),IView{
    protected var mPresenter: P? = null



    protected abstract fun createPresenter(): P

    override fun initView(rootView: View, savedInstanceState: Bundle?) {
        mPresenter = createPresenter()
        mPresenter?.attachView(this as V)
    }


    override fun onDestroyView() {
        super.onDestroyView()
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

}