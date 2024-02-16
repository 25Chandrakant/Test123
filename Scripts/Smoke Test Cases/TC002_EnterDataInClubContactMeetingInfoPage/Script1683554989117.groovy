import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint

import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase

import static com.kms.katalon.core.testdata.TestDataFactory.findTestData

import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint

import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW

import com.kms.katalon.core.model.FailureHandling as FailureHandling

import com.kms.katalon.core.testcase.TestCase as TestCase

import com.kms.katalon.core.testdata.TestData as TestData

import com.kms.katalon.core.testobject.TestObject as TestObject

import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable as GlobalVariable

import com.kms.katalon.core.util.KeywordUtil as KeywordUtil

import org.openqa.selenium.Keys as Keys

import org.openqa.selenium.WebDriver as WebDriver

import org.openqa.selenium.By as By

import org.openqa.selenium.WebElement as WebElement

import java.net.URL as URL

import org.jsoup.Jsoup as Jsoup

import org.jsoup.nodes.Document as Document

import org.jsoup.nodes.Element as Element

import org.jsoup.select.Elements as Elements

import org.openqa.selenium.Capabilities as Capabilities

import org.openqa.selenium.Dimension as Dimension

import org.openqa.selenium.remote.RemoteWebDriver as RemoteWebDriver

import com.kms.katalon.core.webui.common.WebUICommonScripts as WebUICommonScripts

import com.kms.katalon.core.webui.common.WebUiCommonHelper as WebUiCommonHelper

import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory



try {
    CustomKeywords.'com.application.DateTime.startTime'()
	
	CustomKeywords.'com.application.DPOSCustomKeyword.needSomeHelpCloseButton'()
	
	//println(GlobalVariable.TestData["Website_CCMI"])
	
	WebUI.delay(2)
	
	WebUI.scrollToPosition(50, 60)
	
	//WebUI.click(findTestObject('Object Repository/Club Contact and Meeting Information/input_Website_Website'))
	
	WebUI.delay(2)
	
	WebUI.clearText(findTestObject('Object Repository/Club Contact and Meeting Information/input_Website_Website'))
	
	WebUI.delay(2)
   
    WebUI.sendKeys(findTestObject('Object Repository/Club Contact and Meeting Information/input_Website_Website'), GlobalVariable.TestData[
      'CCMI_Website'])
	
	//WebUI.sendKeys(findTestObject('Object Repository/Club Contact and Meeting Information/input_Website_Website'), 'wwww.google.com')
	
	WebUI.delay(2)
	
	WebUI.clearText(findTestObject('Object Repository/Club Contact and Meeting Information/input_Email_Email'))
	
	WebUI.delay(2)

    WebUI.sendKeys(findTestObject('Object Repository/Club Contact and Meeting Information/input_Email_Email'), GlobalVariable.TestData[
        'CCMI_Email'])
	
	WebUI.delay(2)
	
	WebUI.clearText(findTestObject('Object Repository/Club Contact and Meeting Information/input_Facebook_Facebook'))
	
	WebUI.delay(2)

    WebUI.sendKeys(findTestObject('Object Repository/Club Contact and Meeting Information/input_Facebook_Facebook'), GlobalVariable.TestData[
        'CCMI_Facebook'])
	
	WebUI.delay(2)
	
	WebUI.clearText(findTestObject('Object Repository/Club Contact and Meeting Information/input__PlaceOrVenue Line 1'))
	
	WebUI.delay(2)

    WebUI.sendKeys(findTestObject('Object Repository/Club Contact and Meeting Information/input__PlaceOrVenue Line 1'), 
        GlobalVariable.TestData['CCMI_VenueLine1'])
	
	WebUI.delay(2)
	
	WebUI.clearText(findTestObject('Object Repository/Club Contact and Meeting Information/input_Place or Venue Line 2_PlaceOrVenueSecondary'))
	
	WebUI.delay(2)

    WebUI.sendKeys(findTestObject('Object Repository/Club Contact and Meeting Information/input_Place or Venue Line 2_PlaceOrVenueSecondary'), 
        GlobalVariable.TestData['CCMI_VenueLine2'])
	
	WebUI.delay(2)

    WebUI.click(findTestObject('Object Repository/Club Contact and Meeting Information/span_CountryDropDown'))
	
	WebUI.delay(2)

    WebUI.click(findTestObject('Object Repository/Club Contact and Meeting Information/a_United States'))
	
	WebUI.delay(2)
	
	WebUI.clearText(findTestObject('Object Repository/Club Contact and Meeting Information/input__Address1'))
	
	WebUI.delay(2)

    WebUI.sendKeys(findTestObject('Object Repository/Club Contact and Meeting Information/input__Address1'), GlobalVariable.TestData[
        'CCMI_Address1'])
	
	WebUI.delay(2)
	
	WebUI.clearText(findTestObject('Object Repository/Club Contact and Meeting Information/input__Address2'))
	
	WebUI.delay(2)

    WebUI.sendKeys(findTestObject('Object Repository/Club Contact and Meeting Information/input__Address2'), GlobalVariable.TestData[
        'CCMI_Address2'])
	
	WebUI.delay(2)
	
	WebUI.clearText(findTestObject('Object Repository/Club Contact and Meeting Information/input__City'))
	
	WebUI.delay(2)

    WebUI.sendKeys(findTestObject('Object Repository/Club Contact and Meeting Information/input__City'), GlobalVariable.TestData[
        'CCMI_City'])
	
	WebUI.delay(2)
	
	WebUI.clearText(findTestObject('Object Repository/Club Contact and Meeting Information/input__MeetingDays'))
	
	WebUI.delay(2)

    WebUI.sendKeys(findTestObject('Object Repository/Club Contact and Meeting Information/input__MeetingDays'), GlobalVariable.TestData[
        'CCMI_MeetingDays'])
	
	WebUI.delay(2)
	
	WebUI.clearText(findTestObject('Object Repository/Club Contact and Meeting Information/input__MeetingTime'))
	
	WebUI.delay(2)

    WebUI.sendKeys(findTestObject('Object Repository/Club Contact and Meeting Information/input__MeetingTime'), GlobalVariable.TestData[
        'CCMI_Time'])
	
	WebUI.delay(2)
	
	WebUI.click(findTestObject('Object Repository/Club Contact and Meeting Information/select_Frequency'))
	
	WebUI.delay(2)

    WebUI.selectOptionByLabel(findTestObject('Object Repository/Club Contact and Meeting Information/select_Frequency'), 
        GlobalVariable.TestData['CCMI_Frequency'], false)
	
	WebUI.delay(2)

    WebUI.click(findTestObject('Object Repository/Club Contact and Meeting Information/input_Save'))
	
    WebUI.delay(5)

	if (WebUI.verifyElementVisible(findTestObject('Object Repository/Club Contact and Meeting Information/div_SuccessMessage'))) {
		
		WebUI.delay(2)
		
		print('PASS...............................')
		
		WebUI.delay(2)

		WebUI.click(findTestObject('Shop/Page_Toastmasters International -Welcome/span_Shop1'))
		
		WebUI.delay(2)

		GlobalVariable.vartestresult = 'PASS'

		GlobalVariable.varpassremarks = 'User Successfully save entered details.'
	} else {

		print('FAIL...............................')

		GlobalVariable.vartestresult = 'FAIL'

		GlobalVariable.varfailremarks = 'User can not save entered details.'
	}

	CustomKeywords.'com.application.DPOSCustomKeyword.settestresult'(GlobalVariable.vartestresult, GlobalVariable.varpassremarks,

			GlobalVariable.varfailremarks)

	CustomKeywords.'com.application.DateTime.endTime'()

	CustomKeywords.'com.application.DateTime.totalTime'()

}

catch (Exception e) {

	println(e)

	GlobalVariable.vartestresult = 'FAIL'

	GlobalVariable.varfailremarks = ('Exception: ' + e.getStackTrace().toString())

	CustomKeywords.'com.application.DPOSCustomKeyword.settestresult'(GlobalVariable.vartestresult, GlobalVariable.varpassremarks,

			GlobalVariable.varfailremarks)

	CustomKeywords.'com.application.DateTime.endTime'()

	CustomKeywords.'com.application.DateTime.totalTime'()

}