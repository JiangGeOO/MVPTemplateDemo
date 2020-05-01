package ${escapeKotlinIdentifiers(packageName)}.activity;
import ${superClassFqcn}

import ${packageName}.contract.${activityClass}Contract
import ${packageName}.presenter.${activityClass}Presenter
<#if (includeCppSupport!false) && generateLayout>
</#if>

class ${activityClass}:BaseMVPActivity<${activityClass}Contract.View,${activityClass}Contract.Presenter>(), ${activityClass}Contract.View{   
    override fun createPresenter(): ${activityClass}Contract.Presenter = ${activityClass}Presenter()

    override fun getLayoutResId(): Int = R.layout.${layoutName}

    override fun initData() {
        TODO("Not yet implemented")
    }

}
