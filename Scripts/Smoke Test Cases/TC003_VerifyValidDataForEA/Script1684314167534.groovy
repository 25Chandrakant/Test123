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
	
	WebUI.delay(5)
	
	WebUI.waitForElementVisible(findTestObject('Object Repository/ClubCentral/Eligibility Assistant/input__memberID'), 30)
	
	/*WebUI.clearText( findTestObject('Object Repository/ClubCentral/Eligibility Assistant/input__memberID'))
	
	WebUI.delay(2)
	
	WebUI.clearText( findTestObject('Object Repository/ClubCentral/Eligibility Assistant/input__lastName')  )
	
	WebUI.delay(2)

    WebUI.sendKeys(findTestObject('Object Repository/ClubCentral/Eligibility Assistant/input__memberID'), GlobalVariable.TestData["EAMemberID"])
	
	WebUI.delay(2)

    WebUI.sendKeys(findTestObject('Object Repository/ClubCentral/Eligibility Assistant/input__lastName'), GlobalVariable.TestData["EALastName"])
	
	WebUI.delay(2)

    WebUI.click(findTestObject('Object Repository/ClubCentral/Eligibility Assistant/button_Search'))
	
	WebUI.delay(2)*/

    String memberID = WebUI.getText(findTestObject('Object Repository/ClubCentral/Eligibility Assistant/td_MemberID') )
	
	WebUI.delay(2)
	
	String memberLastName = WebUI.getText(  findTestObject('Object Repository/ClubCentral/Eligibility Assistant/td_LastName')  )

    if (memberID == GlobalVariable.TestData["UserName"] && memberLastName==GlobalVariable.TestData["EALastName"]  ) {
		
		WebUI.delay(2)
		
		println(GlobalVariable.TestData["UserName"] && memberLastName==GlobalVariable.TestData["EALastName"])
		
		
        print('PASS...............................')
		
		if (WebUI.verifyElementVisible(findTestObject('My Profile/a_mouseHoverWelcome'))) {
			
			WebUI.mouseOver(findTestObject('My Profile/a_mouseHoverWelcome'))
			
			WebUI.delay(2)
	
			WebUI.click(findTestObject('Object Repository/My Profile/a_MyHome'))
			
		} else {
		}

        GlobalVariable.vartestresult = 'PASS'

        GlobalVariable.varpassremarks = ' Invalid data result not found.'
    } else {
        print('FAIL...............................')

        GlobalVariable.vartestresult = 'FAIL'

        GlobalVariable.varfailremarks = 'Invalid data result found successfully.'
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