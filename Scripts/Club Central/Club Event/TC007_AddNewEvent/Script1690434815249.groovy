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

    WebUI.click(findTestObject('Object Repository/ClubCentral/Club_Event/Add Event/span_AddEvent'))

    WebUI.delay(3)
	
	WebUI.click(findTestObject('Object Repository/ClubCentral/Club_Event/Add Event/button_AddNewEvent'))
	
	WebUI.delay(3)
	
	WebUI.click(findTestObject('Object Repository/ClubCentral/Club_Event/Add Event/input_EventName'))
	
	WebUI.delay(2)
	
	WebUI.sendKeys(findTestObject('Object Repository/ClubCentral/Club_Event/Add Event/input_EventName'), 'Thunderstorm AB')
	
	WebUI.delay(4)
	
	WebUI.sendKeys(findTestObject('Object Repository/ClubCentral/Club_Event/Add Event/input_EventStartDate'), 'February 24, 2024')
	
	//WebUI.sendKeys(findTestObject('Object Repository/ClubCentral/Club_Event/Add Event/input_EventStartDate'), Keys.chord(Keys.ENTER))
	WebUI.click(findTestObject('Object Repository/ClubCentral/Club_Event/Add Event/div_SideElement'))
	
	WebUI.delay(3)
	WebUI.click(findTestObject('Object Repository/ClubCentral/Club_Event/Add Event/span_EventType'))
	
	WebUI.delay(3)
	
	
	WebUI.click(findTestObject('Object Repository/ClubCentral/Club_Event/Add Event/li_YouthLeaderPro'))
	
	WebUI.delay(3)
	
	WebUI.click(findTestObject('Object Repository/ClubCentral/Club_Event/Add Event/input_ClubTimeZone'))
	
	WebUI.delay(3)
	
	
	WebUI.click(findTestObject('Object Repository/ClubCentral/Club_Event/Add Event/li_DataID'))
	/*
	Date todaysDate1 = new Date()
	def formattedDate1 = todaysDate1.format('MM-dd-yyyy')
	
	WebUI.sendKeys(findTestObject('Object Repository/ClubCentral/Club_Event/Add Event/input_EventEndDate'), formattedDate1)
	
	WebUI.sendKeys(findTestObject('Object Repository/ClubCentral/Club_Event/Add Event/input_EventEndDate'), Keys.chord(Keys.ENTER))
	
	WebUI.delay(3)*/
	
	//WebUI.click()
	WebUI.delay(3)
	
	WebUI.click(findTestObject('Object Repository/ClubCentral/Club_Event/Add Event/i_StartTimeInHH'))
	
	WebUI.delay(1)
	
	WebUI.click(findTestObject('Object Repository/ClubCentral/Club_Event/Add Event/li_StartHH'))
	
	WebUI.delay(2)
	
	WebUI.click(findTestObject('Object Repository/ClubCentral/Club_Event/Add Event/i_StartTimeInMM'))
	
	WebUI.click(findTestObject('Object Repository/ClubCentral/Club_Event/Add Event/li_StartMin'))
	
	
	WebUI.delay(2)
	
	WebUI.click(findTestObject('Object Repository/ClubCentral/Club_Event/Add Event/i_StartTimeAM'))
	
	WebUI.click(findTestObject('Object Repository/ClubCentral/Club_Event/Add Event/li_StartAM'))
	
	
	WebUI.click(findTestObject('Object Repository/ClubCentral/Club_Event/Add Event/i_EndTimeInHH'))
	
	
	WebUI.click(findTestObject('Object Repository/ClubCentral/Club_Event/Add Event/li_EndHH'))
	
	
	WebUI.delay(2)
	
	WebUI.click(findTestObject('Object Repository/ClubCentral/Club_Event/Add Event/i_EndTimeInMM'))
	WebUI.click(findTestObject('Object Repository/ClubCentral/Club_Event/Add Event/li_EndMM'))
	
	WebUI.delay(2)
	
	WebUI.click(findTestObject('Object Repository/ClubCentral/Club_Event/Add Event/i_EntTimeAM'))
	WebUI.click(findTestObject('Object Repository/ClubCentral/Club_Event/Add Event/li_EndAM'))
	
	WebUI.delay(2)
	
	WebUI.click(findTestObject('Object Repository/ClubCentral/Club_Event/Add Event/button_MeetingType'))
	
	WebUI.delay(2)
	
	WebUI.click(findTestObject('Object Repository/ClubCentral/Club_Event/Add Event/li_Online'))
	
	WebUI.delay(2)
	
	WebUI.click(findTestObject('Object Repository/ClubCentral/Club_Event/Add Event/radio_ShowButton'))
	
	WebUI.delay(2)
	
	WebUI.click(findTestObject('Object Repository/ClubCentral/Club_Event/Add Event/button_Save'))
	
	WebUI.delay(2)
	
    if (WebUI.verifyElementVisible(findTestObject('Object Repository/ClubCentral/Club_Event/Add Event/div_SuccessfulMessage'))) {
     
        GlobalVariable.vartestresult = 'PASS'

        GlobalVariable.varpassremarks = 'User Successfully add new event.'
    } else {
        print('FAIL...............................')

        GlobalVariable.vartestresult = 'FAIL'

        GlobalVariable.varfailremarks = 'User unable to add new event.'
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