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
	
	//WebUI.delay(2)
	
	//WebUI.verifyElementVisible(findTestObject('Object Repository/District Leader Assignment/button_SaveAndContinueForDistOff'))
		
	WebUI.delay(2)
	
	WebUI.click(findTestObject('Object Repository/District Leader Assignment/input_MemberNumForDD'))
	
	WebUI.clearText(findTestObject('Object Repository/District Leader Assignment/input_MemberNumForDD'))
	
	WebUI.delay(2)
	
	WebUI.sendKeys(findTestObject('Object Repository/District Leader Assignment/input_MemberNumForDD'), 'PN-06418680' )
		
	WebUI.delay(2)

    WebUI.click(findTestObject('Object Repository/District Leader Assignment/input_MemberNumForPQD'))
	
	WebUI.clearText(findTestObject('Object Repository/District Leader Assignment/input_MemberNumForPQD'))
	
	WebUI.delay(2)
	
	WebUI.sendKeys(findTestObject('Object Repository/District Leader Assignment/input_MemberNumForPQD'), 'PN-04057092')
	
	WebUI.delay(2)
	
	WebUI.click(findTestObject('Object Repository/District Leader Assignment/input_MemberNumForCGD'))
	
	WebUI.clearText(findTestObject('Object Repository/District Leader Assignment/input_MemberNumForCGD'))
	
	WebUI.delay(2)
	
	WebUI.sendKeys(findTestObject('Object Repository/District Leader Assignment/input_MemberNumForCGD'), 'PN-02591107')
	
	WebUI.delay(2)
	
	WebUI.click(findTestObject('Object Repository/District Leader Assignment/input_MemberNumForFM'))
	
	WebUI.clearText(findTestObject('Object Repository/District Leader Assignment/input_MemberNumForFM'))
	
	WebUI.delay(2)
	
	WebUI.sendKeys(findTestObject('Object Repository/District Leader Assignment/input_MemberNumForFM'), 'PN-04118766')
	
	WebUI.delay(2)
	
	WebUI.click(findTestObject('Object Repository/District Leader Assignment/input_MemberNumForAM'))
	
	WebUI.clearText(findTestObject('Object Repository/District Leader Assignment/input_MemberNumForAM'))
	
	WebUI.delay(2)
	
	WebUI.sendKeys(findTestObject('Object Repository/District Leader Assignment/input_MemberNumForAM'), 'PN-67538231')
	
	WebUI.delay(2)

    if (WebUI.verifyElementVisible(findTestObject('Object Repository/District Leader Assignment/button_SaveAndContinueForDistOff'))) {
		
		WebUI.delay(2)
		
		WebUI.click(findTestObject('Object Repository/District Leader Assignment/button_SaveAndContinueForDistOff'))
		
		WebUI.delay(2)
		
        GlobalVariable.vartestresult = 'PASS'

        GlobalVariable.varpassremarks = 'User Successfully landing on District Officers page.'
    } else {
        GlobalVariable.vartestresult = 'FAIL'

        GlobalVariable.varfailremarks = 'User unable go to District Officers page.'
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