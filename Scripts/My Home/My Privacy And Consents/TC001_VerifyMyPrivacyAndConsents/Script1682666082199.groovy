import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import javax.media.PackageManager as PackageManager
import javax.naming.Context
import javax.servlet.annotation.WebInitParam

import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.webui.keyword.internal.WebUIAbstractKeyword as WebUIAbstractKeyword
import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil
import com.kms.katalon.core.util.internal.PathUtil as PathUtil
import org.openqa.selenium.By as By
import org.openqa.selenium.WebElement as WebElement
import java.net.MalformedURLException as MalformedURLException
import java.net.URL as URL
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.interactions.Actions as Actions
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import org.openqa.selenium.JavascriptExecutor as JavascriptExecutor
import org.openqa.selenium.Keys as Keys

try {
    CustomKeywords.'com.application.DateTime.startTime'()

    CustomKeywords.'com.application.DPOSCustomKeyword.needSomeHelpCloseButton'()

    WebUI.delay(30)
	
	WebUI.scrollToPosition(100, 100)

    'Click on Instructions '
    String myPrivacyCollaspe = WebUI.getAttribute(findTestObject('Object Repository/My Home/My Privacy And Consents/MyPrivacyAndConsents_Toggle'), 'aria-expanded')

    if (myPrivacyCollaspe == 'true') {
		
		print('........................Already Expanded My Privacy section')
		
    } else {
	
	   WebUI.delay(2)
	
        WebUI.click(findTestObject('Object Repository/My Home/My Privacy And Consents/MyPrivacyAndConsents_Toggle'))
		
		print('.........................   Successfully click on Expand button')
    }
    
    WebUI.delay(3)

    if (WebUI.verifyElementPresent(findTestObject('Object Repository/My Home/My Privacy And Consents/p_Edit'), 0)) {
		
		WebUI.delay(2)
		 
        WebUI.click(findTestObject('Object Repository/My Home/My Privacy And Consents/p_Edit'))
    } 
	else {}
	
	WebUI.delay(2)
    
     if (WebUI.verifyElementVisible(findTestObject('Object Repository/My Home/My Privacy And Consents/h4_Email'))){
		 
		 WebUI.delay(2)
		 
		 WebUI.click(findTestObject('Object Repository/My Home/My Privacy And Consents/Email_Yes'))
	 }
	 
	 else {}
	 
	 WebUI.delay(2)
	 
	 if (WebUI.verifyElementVisible(findTestObject('Object Repository/My Home/My Privacy And Consents/h4_Mail'))){
		 
		 WebUI.delay(2)
		 
		 WebUI.click(findTestObject('Object Repository/My Home/My Privacy And Consents/Mail_Yes'))
	 }
	 
	 else {}
	 
	 WebUI.delay(2)
	 
	 if (WebUI.verifyElementVisible(findTestObject('Object Repository/My Home/My Privacy And Consents/h4_ThirdParty'))){
		 
		 WebUI.delay(2)
		 
		 WebUI.click(findTestObject('Object Repository/My Home/My Privacy And Consents/ThirdParty_Yes'))
	 }
	 
	 else {}
	 
	 WebUI.delay(2)
	 
	 if (WebUI.verifyElementVisible(findTestObject('Object Repository/My Home/My Privacy And Consents/h4_Phone'))){
		 
		 WebUI.delay(2)
		 
		 WebUI.click(findTestObject('Object Repository/My Home/My Privacy And Consents/Phone_Yes'))
	 }
	 
	 else {}
	 
	 WebUI.delay(2)
	 
	 if (WebUI.verifyElementVisible(findTestObject('Object Repository/My Home/My Privacy And Consents/h4_NameOnPublicReports'))){
		 
		 WebUI.delay(2)
		 
		 WebUI.click(findTestObject('Object Repository/My Home/My Privacy And Consents/NameOnPublicReports_No'))
	 }
	 
	 else {}
	 
	 WebUI.delay(2)
	 
	 WebUI.click(findTestObject('Object Repository/My Home/My Privacy And Consents/button_SavePrivacyAndConsent'))
	 
	 WebUI.delay(2)

    //String myPrivacyText = WebUI.getText(findTestObject('Object Repository/My Home/My Privacy And Consents/div_MyPrivacyAndConsentsUpdatedSuccessfullyText'))
		
	//WebUI.delay(2)
	 
    if (WebUI.verifyElementVisible(findTestObject('Object Repository/My Home/My Privacy And Consents/div_TextConfirm')))
	 {
		 
		 WebUI.delay(5)
		 
		 print('...................................PASS................')
		 
			GlobalVariable.vartestresult = 'PASS'
		 
		    GlobalVariable.varpassremarks = 'My Privacy And Consents successfully updated '
    }
	
	else {
		
		   GlobalVariable.vartestresult = 'FAIL'
		
		   GlobalVariable.varfailremarks = 'My Privacy And Consents not updated '
		
		print('............................FAIL........................')
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