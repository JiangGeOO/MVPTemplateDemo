package ${escapeKotlinIdentifiers(packageName)}.presenter

import ${packageName}.contract.${activityClass}Contract
import ${packageName}.model.${activityClass}Model

class ${activityClass}Presenter:BasePresenter<${activityClass}Contract.Model,${activityClass}Contract.View>(),${activityClass}Contract.Presenter{
    override fun createModel(): ${activityClass}Contract.Model? = ${activityClass}Model()
}