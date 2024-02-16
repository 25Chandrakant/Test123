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
	
	WebUI.delay(2)
	
	WebUI.waitForElementVisible(findTestObject('Object Repository/Speech Craft/a_AddAttendee'), 120)
	
	WebUI.click(findTestObject('Object Repository/Speech Craft/a_AddAttendee'))
		
	WebUI.delay(3)
	
	WebUI.click(findTestObject('Object Repository/Speech Craft/input_AttendeeLN'))
	
	WebUI.delay(1)
	
	WebUI.sendKeys(findTestObject('Object Repository/Speech Craft/input_AttendeeLN'), 'Shah')
	
	WebUI.delay(2)
	
	WebUI.click(findTestObject('Object Repository/Speech Craft/input_AttedeeEmail'))
	
	WebUI.delay(1)
	
	WebUI.sendKeys(findTestObject('Object Repository/Speech Craft/input_AttedeeEmail'), 'amitshah@orkut.com')
	
	WebUI.delay(2)
	
	WebUI.click(findTestObject('Object Repository/Speech Craft/button_SearchBtn'))
	
	//WebUI.delay(5)
	
	WebUI.waitForElementClickable(findTestObject('Object Repository/Speech Craft/button_AtndSubmitBtn'), 240)
	
	WebUI.click(findTestObject('Object Repository/Speech Craft/button_AtndSubmitBtn'))
	
	WebUI.delay(10)
	
	WebUI.waitForElementVisible(findTestObject('Object Repository/Speech Craft/a_AddNextAttendee'), 240)
	
	Thread.sleep(2000)

	WebUI.click(findTestObject('Object Repository/Speech Craft/a_AddNextAttendee'))
	
	WebUI.delay(3)
	
	WebUI.click(findTestObject('Object Repository/Speech Craft/input_AttendeeLN'))
	
	WebUI.delay(1)
	
	WebUI.sendKeys(findTestObject('Object Repository/Speech Craft/input_AttendeeLN'), 'Reigns')
	
	WebUI.delay(2)
	
	WebUI.click(findTestObject('Object Repository/Speech Craft/input_AttedeeEmail'))
	
	WebUI.delay(1)
	
	WebUI.sendKeys(findTestObject('Object Repository/Speech Craft/input_AttedeeEmail'), 'rr@gmail.com')
	
	WebUI.delay(2)
	
	WebUI.click(findTestObject('Object Repository/Speech Craft/button_SearchBtn'))
	
	WebUI.delay(5)
	
	WebUI.click(findTestObject('Object Repository/Speech Craft/button_AtndSubmitBtn'))
	
	WebUI.delay(5)
	
	WebUI.click(findTestObject('Object Repository/Speech Craft/a_AddNextAttendee'))
	
	WebUI.delay(3)
	
	WebUI.click(findTestObject('Object Repository/Speech Craft/input_AttendeeLN'))
	
	WebUI.delay(1)
	
	WebUI.sendKeys(findTestObject('Object Repository/Speech Craft/input_AttendeeLN'), 'Rathod')
	
	WebUI.delay(2)
	
	WebUI.click(findTestObject('Object Repository/Speech Craft/input_AttedeeEmail'))
	
	WebUI.delay(1)
	
	WebUI.sendKeys(findTestObject('Object Repository/Speech Craft/input_AttedeeEmail'), 'rathodakash.420@gmail.com')
	
	WebUI.delay(2)
	
	WebUI.click(findTestObject('Object Repository/Speech Craft/button_SearchBtn'))
	
	WebUI.delay(5)
	
	WebUI.click(findTestObject('Object Repository/Speech Craft/button_AtndSubmitBtn'))
	
	WebUI.delay(5)
	
	WebUI.click(findTestObject('Object Repository/Speech Craft/a_AddNextAttendee'))
	
	WebUI.delay(3)
	
	WebUI.click(findTestObject('Object Repository/Speech Craft/input_AttendeeLN'))
	
	WebUI.delay(1)
	
	WebUI.sendKeys(findTestObject('Object Repository/Speech Craft/input_AttendeeLN'), 'Mueller')
	
	WebUI.delay(2)
	
	WebUI.click(findTestObject('Object Repository/Speech Craft/input_AttedeeEmail'))
	
	WebUI.delay(1)
	
	WebUI.sendKeys(findTestObject('Object Repository/Speech Craft/input_AttedeeEmail'), 'Mueller@example.com')
	
	WebUI.delay(2)
	
	WebUI.click(findTestObject('Object Repository/Speech Craft/button_SearchBtn'))
	
	WebUI.delay(5)
	
	WebUI.click(findTestObject('Object Repository/Speech Craft/button_AtndSubmitBtn'))
	
	WebUI.delay(5)
	
	WebUI.click(findTestObject('Object Repository/Speech Craft/a_AddNextAttendee'))
	
	WebUI.delay(2)
	
	WebUI.click(findTestObject('Object Repository/Speech Craft/input_NewToToast'))
	
	WebUI.delay(2)
	
	WebUI.click(findTestObject('Object Repository/Speech Craft/input_LastNameForNewMem'))
	
	WebUI.delay(2)
	
	WebUI.click(findTestObject('Object Repository/Speech Craft/input_FirstNameForNewMem'))
	
	WebUI.delay(2)
	
	WebUI.click(findTestObject('Object Repository/Speech Craft/input_EmailForNewMem'))
	
	WebUI.delay(2)
	
	WebUI.click(findTestObject('Object Repository/Speech Craft/button_SubmitForNewMem'))
	
	WebUI.delay(5)
	
	WebUI.click(findTestObject('Object Repository/Speech Craft/a_RemoveBtn'))
	
	WebUI.delay(3)
	
	WebUI.click(findTestObject('Object Repository/Speech Craft/button_YesRemoveAttendee'))
	
	WebUI.delay(5)
	
    if (WebUI.verifyElementVisible(findTestObject('Object Repository/Speech Craft/a_RemoveBtn'))) {
		
		WebUI.delay(4)
		
        print('PASS...............................')

        GlobalVariable.vartestresult = 'PASS'

        GlobalVariable.varpassremarks = 'User Successfully add attendees.'
    } else {
        print('FAIL...............................')

        GlobalVariable.vartestresult = 'FAIL'

        GlobalVariable.varfailremarks = 'User unable to add attendees.'
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