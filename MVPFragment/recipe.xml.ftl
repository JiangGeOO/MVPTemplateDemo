<?xml version="1.0"?>
<#import "root://activities/common/kotlin_macros.ftl" as kt>
<recipe>
    <@kt.addAllKotlinDependencies />
    <dependency mavenUrl="com.android.support:support-v4:${buildApi}.+"/>
    <merge from="root/res/values/strings.xml" to="${escapeXmlAttribute(resOut)}/values/strings.xml" />

   
                
    <instantiate from="root/res/layout/fragment_blank.xml.ftl"
                   to="${escapeXmlAttribute(resOut)}/layout/${layoutName}.xml" /> 


    <!--View-activity-->
    <instantiate from="root/src/app_package/MvpFragment.kt.ftl"
                   to="${escapeXmlAttribute(srcOut)}/view/${fragmentClass}.kt" />
	<!--Model-->
	<instantiate from="root/src/app_package/MvpModel.kt.ftl"
                   to="${escapeXmlAttribute(srcOut)}/model/${fragmentClass}Model.kt" />	
	<!--Contract-->
	<instantiate from="root/src/app_package/MvpContract.kt.ftl"
                   to="${escapeXmlAttribute(srcOut)}/contract/${fragmentClass}Contract.kt" />
	<!--Presenter-->
	<instantiate from="root/src/app_package/MvpPresenter.kt.ftl"
                   to="${escapeXmlAttribute(srcOut)}/presenter/${fragmentClass}Presenter.kt" />	   


    <open file="${escapeXmlAttribute(srcOut)}/view/${fragmentClass}.kt" /> 

</recipe>
