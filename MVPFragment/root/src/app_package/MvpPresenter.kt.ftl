package ${escapeKotlinIdentifiers(packageName)}.presenter

import ${packageName}.contract.${fragmentClass}Contract
import ${packageName}.model.${fragmentClass}Model

class ${fragmentClass}Presenter:BasePresenter<${fragmentClass}Contract.Model,${fragmentClass}Contract.View>(),${fragmentClass}Contract.Presenter{
    override fun createModel(): ${fragmentClass}Contract.Model? = ${fragmentClass}Model()
}