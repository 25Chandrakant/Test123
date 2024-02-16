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

    WebUI.click(findTestObject('Object Repository/ClubCentral/Club_Event/a_ScheduledEvents'))

    WebUI.delay(3)
	
	WebUI.click(findTestObject('Object Repository/ClubCentral/Club_Event/Sort and Filter/span_SortAndFilter'))
	
   // WebUI.selectOptionByIndex(findTestObject('Object Repository/ClubCentral/Club_Event/EditEvent/button_EventType'), 2)
		
	WebUI.delay(2)
	
	WebUI.click(findTestObject('Object Repository/ClubCentral/Club_Event/Sort and Filter/input_SortAToZ'))
	
	WebUI.delay(2)
	
	WebUI.click(findTestObject('Object Repository/ClubCentral/Club_Event/Sort and Filter/button_FilterByEventStatus'))
	
	WebUI.delay(2)
	
	WebUI.click(findTestObject('Object Repository/ClubCentral/Club_Event/Sort and Filter/li_Completed'))
	
	WebUI.delay(3)
	
	WebUI.click(findTestObject('Object Repository/ClubCentral/Club_Event/Sort and Filter/button_EventType'))
	
	WebUI.delay(3)
	
	WebUI.click(findTestObject('Object Repository/ClubCentral/Club_Event/Sort and Filter/li_OpenHouse'))
	
	WebUI.delay(3)
	
	WebUI.click(findTestObject('Object Repository/ClubCentral/Club_Event/Sort and Filter/a_Apply'))
	
	WebUI.delay(5)
	
    if (WebUI.verifyElementVisible(findTestObject('Object Repository/ClubCentral/Club_Event/Sort and Filter/Completed'))) {
		
		WebUI.delay(2)
     
        GlobalVariable.vartestresult = 'PASS'

        GlobalVariable.varpassremarks = 'User Successfully apply filter.'
    } else {
        print('FAIL...............................')

        GlobalVariable.vartestresult = 'FAIL'

        GlobalVariable.varfailremarks = 'User unable to apply filter.'
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