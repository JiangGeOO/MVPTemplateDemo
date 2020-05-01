package com.example.mvpdemo.base.mvp

abstract class BasePresenter<M:IModel,V:IView> :IPresenter<V>{
    protected var mModel: M? = null
    protected var mView: V? = null


    /**
     * 创建 Model
     */
    abstract fun createModel(): M?

    private val isViewAttached: Boolean
        get() = mView != null

    override fun attachView(view: V) {
        this.mView=view
        mModel=createModel()
    }

    override fun detachView() {
        mModel?.let {
            it.onDetach()
        }
    }
}