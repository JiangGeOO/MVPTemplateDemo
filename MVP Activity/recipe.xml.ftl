<?xml version="1.0"?>
<#import "root://activities/common/kotlin_macros.ftl" as kt>
<recipe>
  

    <merge from="root/AndroidManifest.xml.ftl"
             to="${escapeXmlAttribute(manifestOut)}/AndroidManifest.xml" />

   
    <instantiate from="root/res/layout/activity_mvp.xml.ftl"
                   to="${escapeXmlAttribute(resOut)}/layout/${layoutName}.xml" />                 

    <@kt.addAllKotlinDependencies />
	<!--View-activity-->
    <instantiate from="root/src/app_package/MvpActivity.kt.ftl"
                   to="${escapeXmlAttribute(srcOut)}/view/${activityClass}.kt" />
	<!--Model-->
	<instantiate from="root/src/app_package/MvpModel.kt.ftl"
                   to="${escapeXmlAttribute(srcOut)}/model/${activityClass}Model.kt" />	
	<!--Contract-->
	<instantiate from="root/src/app_package/MvpContract.kt.ftl"
                   to="${escapeXmlAttribute(srcOut)}/contract/${activityClass}Contract.kt" />
	<!--Presenter-->
	<instantiate from="root/src/app_package/MvpPresenter.kt.ftl"
                   to="${escapeXmlAttribute(srcOut)}/presenter/${activityClass}Presenter.kt" />	   


    <open file="${escapeXmlAttribute(srcOut)}/activity/${activityClass}.kt" />         
</recipe>
