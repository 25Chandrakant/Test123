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
import java.net.URL
import javax.security.auth.login.FailedLoginException
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
	
	'Membership'

    WebUI.click(findTestObject('Object Repository/ClubCentral/Club Success Plan/The Plan/Membership/a_StartBtn'))
	
	WebUI.delay(2)
	
	WebUI.sendKeys(findTestObject('Object Repository/ClubCentral/Club Success Plan/The Plan/Membership/input_QualifyingRequiremt'), 'aghdxfhgmj')
	
	WebUI.delay(2)
	
	WebUI.sendKeys(findTestObject('Object Repository/ClubCentral/Club Success Plan/The Plan/Membership/textarea_StratAndTact1'), CustomKeywords.'com.application.submitpayment.randomString'(20))
	
	WebUI.delay(2)
	
	WebUI.sendKeys(findTestObject('Object Repository/ClubCentral/Club Success Plan/The Plan/Membership/textarea_StratAndTact2'), CustomKeywords.'com.application.submitpayment.randomString'(20))
   
	WebUI.delay(2)
	
	WebUI.click(findTestObject('Object Repository/ClubCentral/Club Success Plan/The Plan/Membership/button_AddActionItem'))
	
	WebUI.delay(2)
	
	WebUI.sendKeys(findTestObject('Object Repository/ClubCentral/Club Success Plan/The Plan/Membership/input_ActionItem'),CustomKeywords.'com.application.submitpayment.randomString'(20) )
	
	WebUI.delay(2)
	
	WebUI.selectOptionByIndex(findTestObject('Object Repository/ClubCentral/Club Success Plan/The Plan/Membership/select_ItemOwner'), 3)
	
	WebUI.delay(2)
	
	Date todaysDate = new Date()
	def formattedDate = todaysDate.format('MM-dd-yyyy')
	
	WebUI.sendKeys(findTestObject('Object Repository/ClubCentral/Club Success Plan/The Plan/Membership/input_StartDate'), formattedDate)
	
	WebUI.sendKeys(findTestObject('Object Repository/ClubCentral/Club Success Plan/The Plan/Membership/input_StartDate'), Keys.chord(Keys.ENTER))
	
	WebUI.delay(2)
	
	Date todaysDate1 = new Date()
	def formattedDate1 = todaysDate1.format('MM-dd-yyyy')
	
	WebUI.sendKeys(findTestObject('Object Repository/ClubCentral/Club Success Plan/The Plan/Membership/input_DueDate'), formattedDate1)
	
	WebUI.sendKeys(findTestObject('Object Repository/ClubCentral/Club Success Plan/The Plan/Membership/input_DueDate'), Keys.chord(Keys.ENTER))
	
	WebUI.delay(2)
	
	WebUI.sendKeys(findTestObject('Object Repository/ClubCentral/Club Success Plan/The Plan/Membership/textarea_Notes'), CustomKeywords.'com.application.submitpayment.randomString'(20))
	
	WebUI.delay(2)
	
	WebUI.click(findTestObject('Object Repository/ClubCentral/Club Success Plan/The Plan/Membership/button_SaveAndSubmit'))
	
	WebUI.delay(2)
	
	if (WebUI.verifyElementVisible(findTestObject('Object Repository/ClubCentral/Club Success Plan/The Plan/Membership/input_SaveAndCloseBtn'))) {
		
        WebUI.delay(2)
		
		WebUI.click(findTestObject('Object Repository/ClubCentral/Club Success Plan/The Plan/Membership/input_SaveAndCloseBtn'))
		
        GlobalVariable.vartestresult = 'PASS'

        GlobalVariable.varpassremarks = 'User Successfully enter values in Membership.'
    } else {
        GlobalVariable.vartestresult = 'FAIL'

        GlobalVariable.varfailremarks = 'User unble to enter values in Membership.'
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