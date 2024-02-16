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
	
	WebUI.delay(3)
	
	WebUI.waitForElementVisible(findTestObject('Object Repository/District Central/District Success Plan/select_YearsDropDown'), 120)
	
	WebUI.click(findTestObject('Object Repository/District Central/District Success Plan/select_YearsDropDown'))
	
	WebUI.delay(2)

   /* WebUI.sendKeys(findTestObject('Object Repository/District Central/District Success Plan/years_DropDown'), '2020-2021 (Read Only)')
	
	WebUI.delay(2)

    String atrribute = WebUI.getAttribute(findTestObject('Object Repository/District Central/District Success Plan/Disable_Field'), 
        'disabled')

    WebUI.verifyMatch(atrribute, 'true', false)*/

    WebUI.sendKeys(findTestObject('Object Repository/District Central/District Success Plan/years_DropDown'), '2022-2023')

    // Team  Charter
    // Section 1
    WebUI.scrollToPosition(40, 50)
	
	WebUI.clearText(findTestObject('Object Repository/District Central/District Success Plan/Team Charter_Section1/textarea__DistrictCoreTeam'))
	
	WebUI.delay(2)

    WebUI.sendKeys(findTestObject('Object Repository/District Central/District Success Plan/Team Charter_Section1/textarea__DistrictCoreTeam'), 
       CustomKeywords.'com.application.submitpayment.randomString'(20) )
	
	WebUI.delay(2)
	
	WebUI.clearText(findTestObject('Object Repository/District Central/District Success Plan/Team Charter_Section1/textarea__DistrictExtendedTeam'))
	
	WebUI.delay(2)

    WebUI.sendKeys(findTestObject('Object Repository/District Central/District Success Plan/Team Charter_Section1/textarea__DistrictExtendedTeam'), 
        CustomKeywords.'com.application.submitpayment.randomString'(20))
	
	WebUI.delay(2)
	
	WebUI.clearText(findTestObject('Object Repository/District Central/District Success Plan/Team Charter_Section1/textarea__WhatAreDistrictCoreValues'))
	
	WebUI.delay(2)

    WebUI.sendKeys(findTestObject('Object Repository/District Central/District Success Plan/Team Charter_Section1/textarea__WhatAreDistrictCoreValues'), 
        CustomKeywords.'com.application.submitpayment.randomString'(20))
	
	WebUI.delay(2)
	
	WebUI.clearText(findTestObject('Object Repository/District Central/District Success Plan/Team Charter_Section1/textarea__TeamOperatingPrinciple'))
	
	WebUI.delay(2)

    WebUI.sendKeys(findTestObject('Object Repository/District Central/District Success Plan/Team Charter_Section1/textarea__TeamOperatingPrinciple'), 
        CustomKeywords.'com.application.submitpayment.randomString'(20))
	
	WebUI.delay(2)
	
	WebUI.clearText(findTestObject('Object Repository/District Central/District Success Plan/Team Charter_Section1/textarea__PotentialObstacles'))
	
	WebUI.delay(2)

    WebUI.sendKeys(findTestObject('Object Repository/District Central/District Success Plan/Team Charter_Section1/textarea__PotentialObstacles'), 
        CustomKeywords.'com.application.submitpayment.randomString'(20))
	
	WebUI.delay(2)
	
	WebUI.clearText(findTestObject('Object Repository/District Central/District Success Plan/Team Charter_Section1/textarea__MeetingProtocol'))
	
	WebUI.delay(2)

    WebUI.sendKeys(findTestObject('Object Repository/District Central/District Success Plan/Team Charter_Section1/textarea__MeetingProtocol'), 
        CustomKeywords.'com.application.submitpayment.randomString'(20))
	
	WebUI.delay(2)
	
	WebUI.clearText(findTestObject('Object Repository/District Central/District Success Plan/Team Charter_Section1/textarea__TeamInteractio9nAndBehavioralNorms'))
	
	WebUI.delay(2)

    WebUI.sendKeys(findTestObject('Object Repository/District Central/District Success Plan/Team Charter_Section1/textarea__TeamInteractio9nAndBehavioralNorms'), 
        CustomKeywords.'com.application.submitpayment.randomString'(20))
	
	WebUI.delay(2)

    WebUI.click(findTestObject('Object Repository/District Central/District Success Plan/Team Charter_Section1/button_Save'))

    WebUI.delay(3)

    WebUI.mouseOver(findTestObject('Object Repository/District Central/District Success Plan/Team Charter_Section1/button_Ok'))

    WebUI.click(findTestObject('Object Repository/District Central/District Success Plan/Team Charter_Section1/button_Ok'))
	
	WebUI.delay(2)

    // Section 2
    WebUI.scrollToPosition(40, 50)

    WebUI.click(findTestObject('Object Repository/District Central/District Success Plan/Team Chater_Section2/a_Section 2'))
	
	WebUI.delay(2)
	
	WebUI.clearText(findTestObject('Object Repository/District Central/District Success Plan/Team Chater_Section2/textarea__MethodOfCommunication'))
	
	WebUI.delay(2)

    WebUI.sendKeys(findTestObject('Object Repository/District Central/District Success Plan/Team Chater_Section2/textarea__MethodOfCommunication'), 
        CustomKeywords.'com.application.submitpayment.randomString'(20))
	
	WebUI.delay(2)
	
	WebUI.clearText(findTestObject('Object Repository/District Central/District Success Plan/Team Chater_Section2/textarea__CommunicationParametersBe'))
	
	WebUI.delay(2)

    WebUI.sendKeys(findTestObject('Object Repository/District Central/District Success Plan/Team Chater_Section2/textarea__CommunicationParametersBe'), 
        CustomKeywords.'com.application.submitpayment.randomString'(20))
	
	WebUI.delay(2) 
	
	WebUI.clearText(findTestObject('Object Repository/District Central/District Success Plan/Team Chater_Section2/textarea__ResolveDifferentOfOpinion'))
	
	WebUI.delay(2)

    WebUI.sendKeys(findTestObject('Object Repository/District Central/District Success Plan/Team Chater_Section2/textarea__ResolveDifferentOfOpinion'), 
        CustomKeywords.'com.application.submitpayment.randomString'(20))
	
	WebUI.delay(2)
	
	WebUI.clearText(findTestObject('Object Repository/District Central/District Success Plan/Team Chater_Section2/textarea__TeamSuportOneAnother'))
	
	WebUI.delay(2)

    WebUI.sendKeys(findTestObject('Object Repository/District Central/District Success Plan/Team Chater_Section2/textarea__TeamSuportOneAnother'), 
        CustomKeywords.'com.application.submitpayment.randomString'(20))
	
	WebUI.delay(2)
	
	WebUI.clearText(findTestObject('Object Repository/District Central/District Success Plan/Team Chater_Section2/textarea__VCompletingActivities'))
	
	WebUI.delay(2)

    WebUI.sendKeys(findTestObject('Object Repository/District Central/District Success Plan/Team Chater_Section2/textarea__VCompletingActivities'), 
       CustomKeywords.'com.application.submitpayment.randomString'(20))
	
	WebUI.delay(2)
	
	WebUI.clearText(findTestObject('Object Repository/District Central/District Success Plan/Team Chater_Section2/textarea__AccountableResponsibilities'))
	
	WebUI.delay(2)

    WebUI.sendKeys(findTestObject('Object Repository/District Central/District Success Plan/Team Chater_Section2/textarea__AccountableResponsibilities'), 
        CustomKeywords.'com.application.submitpayment.randomString'(20))
	
	WebUI.delay(2)
	
	WebUI.clearText(findTestObject('Object Repository/District Central/District Success Plan/Team Chater_Section2/textarea__RecognizesForTheirEfforts'))
	
	WebUI.delay(2)

    WebUI.sendKeys(findTestObject('Object Repository/District Central/District Success Plan/Team Chater_Section2/textarea__RecognizesForTheirEfforts'), 
        CustomKeywords.'com.application.submitpayment.randomString'(20))
	
	WebUI.delay(2)

    WebUI.click(findTestObject('Object Repository/District Central/District Success Plan/Team Charter_Section1/button_Save'))

    //WebUI.delay(1)

    //WebUI.mouseOver(findTestObject('Object Repository/District Central/District Success Plan/Team Charter_Section1/button_Ok'))

   // WebUI.click(findTestObject('Object Repository/District Central/District Success Plan/Team Charter_Section1/button_Ok'))
	
	WebUI.delay(2)

    if (WebUI.verifyElementVisible(findTestObject('Object Repository/District Central/District Success Plan/Team Charter_Section1/button_Ok'))) {
		
        WebUI.mouseOver(findTestObject('Object Repository/District Central/District Success Plan/Team Charter_Section1/button_Ok'))

        WebUI.click(findTestObject('Object Repository/District Central/District Success Plan/Team Charter_Section1/button_Ok'))

		//WebUI.back()
		
		//WebUI.click(findTestObject('Object Repository/ClubCentral/Leadership-Home/i_Club Success Plan_fa fa-close'), FailureHandling.OPTIONAL)
		
        GlobalVariable.vartestresult = 'PASS'

        GlobalVariable.varpassremarks = 'User Submits data for Section 1 and Section 2.'
    } else {
        print('FAIL...............................')

        GlobalVariable.vartestresult = 'FAIL'

        GlobalVariable.varfailremarks = 'User Unable to submit data for section 1 and section 2.'
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