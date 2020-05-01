package com.example.mvpdemo.base.mvp

import io.reactivex.disposables.CompositeDisposable
import io.reactivex.disposables.Disposable

abstract class BaseModel :IModel{
    private var mCompositeDisposable: CompositeDisposable? = null

    override fun addDisposable(disposable: Disposable) {
        if (mCompositeDisposable == null) {
            mCompositeDisposable = CompositeDisposable()
        }
        disposable?.let { mCompositeDisposable?.add(it) }
    }

    override fun onDetach() {
        unDispose()
    }

    private fun unDispose() {
        mCompositeDisposable?.clear()  // 保证Activity结束时取消
        mCompositeDisposable = null
    }
}