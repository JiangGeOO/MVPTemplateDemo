package ${escapeKotlinIdentifiers(packageName)}.activity;
import ${superClassFqcn}

import ${packageName}.contract.${fragmentClass}Contract
import ${packageName}.presenter.${fragmentClass}Presenter
<#if (includeCppSupport!false) && generateLayout>
</#if>

class ${fragmentClass}:BaseMVPFragment<${fragmentClass}Contract.View,${fragmentClass}Contract.Presenter>(), ${fragmentClass}Contract.View{   
    override fun createPresenter(): ${fragmentClass}Contract.Presenter = ${fragmentClass}Presenter()

    override fun getLayoutResId(): Int = R.layout.${layoutName}

    override fun initData() {
        TODO("Not yet implemented")
    }

}

