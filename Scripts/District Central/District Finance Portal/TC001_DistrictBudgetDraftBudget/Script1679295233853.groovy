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
import com.kms.katalon.core.configuration.RunConfiguration
import org.apache.commons.lang.RandomStringUtils


try {
    CustomKeywords.'com.application.DateTime.startTime'()
	
	CustomKeywords.'com.application.DPOSCustomKeyword.needSomeHelpCloseButton'()
	
	WebUI.click( findTestObject('Object Repository/District Central/District Finance Portal/div_District Budget'))
	
	WebUI.delay(2)
	
	CustomKeywords.'com.application.DPOSCustomKeyword.needSomeHelpCloseButton'()
	
	String filePath = RunConfiguration.getProjectDir() + '\\External Files\\Eyeopeners_Club_2023_02_23.pdf'
	
	filePath = filePath.replace(/\//, '\\')
	
	WebUI.delay(2)
	
	CustomKeywords.'com.application.submitpayment.uploadFile'(findTestObject('Object Repository/District Central/District Finance Portal/upload_SubmitBudget'), filePath)
	
	WebUI.delay(2)
	
	WebUI.click(findTestObject('Object Repository/District Central/District Finance Portal/txtbox_AddCommentTextBox'))
	
	WebUI.delay(2)
	
	WebUI.sendKeys(findTestObject('Object Repository/District Central/District Finance Portal/txtbox_AddCommentTextBox'), CustomKeywords.'com.application.submitpayment.randomString'(20))
	
	WebUI.delay(2)
	
	WebUI.click(findTestObject('Object Repository/District Central/District Finance Portal/btn_ClickONSubmitBtn'))
	
	WebUI.delay(10)
	 
    if (WebUI.verifyElementVisible(findTestObject('Object Repository/District Central/District Finance Portal/txt_DraftBudgetSubmitted'))) 
	{
        WebUI.delay(4)

        GlobalVariable.vartestresult = 'PASS'
		
        GlobalVariable.varpassremarks = 'Draft Budget was submitted Successfully'
    } 
	else 
	{
		GlobalVariable.vartestresult = 'FAIL'

        GlobalVariable.varfailremarks = 'User was not ablel to submit the draft budget'
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
