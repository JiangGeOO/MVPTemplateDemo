package com.example.mvpdemo.main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.mvpdemo.R
import com.example.mvpdemo.base.BaseActtivity
import com.example.mvpdemo.base.BaseMVPActivity
import com.example.mvpdemo.base.BaseMVPFragment
import com.example.mvpdemo.main.contract.MainContract
import com.example.mvpdemo.main.presenter.MainPresenter

class MainActivity : BaseMVPActivity<MainContract.View,MainContract.Presenter>(),
MainContract.View{
    override fun createPresenter(): MainContract.Presenter =MainPresenter()

    override fun getLayoutResId(): Int = R.layout.activity_main

//    override fun initData() {
//        TODO("Not yet implemented")
//    }

}
