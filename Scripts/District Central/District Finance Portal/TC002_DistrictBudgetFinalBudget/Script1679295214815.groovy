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

try {
    CustomKeywords.'com.application.DateTime.startTime'()
	
	CustomKeywords.'com.application.DPOSCustomKeyword.needSomeHelpCloseButton'()
	
	WebUI.delay(2)
	
	WebUI.click( findTestObject('Object Repository/District Central/District Finance Portal/div_District Budget'))
	
	WebUI.delay(2)

	WebUI.click(findTestObject('Object Repository/District Central/District Finance Portal/radiobtn_DraftBudgetRadioBtn'))
	
	WebUI.delay(2)
		
	String filePath = RunConfiguration.getProjectDir() + '\\External Files\\Eyeopeners_Club_2023_02_23.pdf'
	
	filePath = filePath.replace(/\//, '\\')
	
	WebUI.delay(2)
	
	CustomKeywords.'com.application.submitpayment.uploadFile'(findTestObject('Object Repository/District Central/District Finance Portal/upload_SubmitBudget'), filePath)
	
	WebUI.delay(2)
	
	WebUI.click(findTestObject('Object Repository/District Central/District Finance Portal/radiobtn_FinalBudgetRadioBtn'))
	
	WebUI.delay(2)
	
	String filePaths = RunConfiguration.getProjectDir() + '\\External Files\\Eyeopeners_Club_2023_02_23.pdf'
	
	filePaths = filePaths.replace(/\//, '\\')
	
	WebUI.delay(2)
	
	println(filePaths)
	
	WebUI.delay(2)
	
	CustomKeywords.'com.application.submitpayment.uploadFile'(findTestObject('Object Repository/District Central/District Finance Portal/btn_SubmitFinalBudget'), filePaths)
	
	println(filePaths)
	
	WebUI.delay(2)
	
	WebUI.click(findTestObject('Object Repository/District Central/District Finance Portal/txtbox_AddCommentTextBox'))
	
	WebUI.delay(2)
	
	WebUI.sendKeys(findTestObject('Object Repository/District Central/District Finance Portal/txtbox_AddCommentTextBox'), 'Testing Final Budget Functionality')
	
	WebUI.delay(2) 
	
	WebUI.click(findTestObject('Object Repository/District Central/District Finance Portal/btn_ClickONSubmitBtn'))
	
	WebUI.delay(200)
	 
    if (WebUI.verifyElementVisible( findTestObject('Object Repository/District Central/District Finance Portal/h1_District Finance Portal'))) {
       
		WebUI.delay(4)

        GlobalVariable.vartestresult = 'PASS'
        GlobalVariable.varpassremarks = 'User Successfully landing on District Finance Portal Pages'
    } else {
       
		GlobalVariable.vartestresult = 'FAIL'

        GlobalVariable.varfailremarks = 'User unble to landing on District Finance Portal Pages'
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
