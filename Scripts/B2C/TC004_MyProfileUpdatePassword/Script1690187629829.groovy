import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.configuration.RunConfiguration as RunConfiguration
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.util.internal.PathUtil as PathUtil
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil
import org.openqa.selenium.Keys as Keys
import org.openqa.selenium.By as By
import org.openqa.selenium.WebElement as WebElement
import java.net.MalformedURLException as MalformedURLException
import java.net.URL as URL

try {
    CustomKeywords.'com.application.DateTime.startTime'()

    'Click on Login button and verify mandatory field message'
	
	WebUI.click(findTestObject('Object Repository/Login/a_Login'))
	
	WebUI.delay(4)
	
    'Enter the valid username and password'
    WebUI.setText(findTestObject('B2C/input_B2CEmail'), GlobalVariable.TestData['B2CEmail'])
	
    WebUI.mouseOver(findTestObject('B2C/input_B2CPassword'))
	
    WebUI.setText(findTestObject('B2C/input_B2CPassword'), GlobalVariable.TestData['B2CPassword'])

    //Thread.sleep(1000)
    'Click on Login button'
    WebUI.click(findTestObject('Object Repository/B2C/button_LogIn'))

    Thread.sleep(200)
	
	'Click on Profile link'
	if (WebUI.verifyElementVisible(findTestObject('My Profile/a_mouseHoverWelcome'))) {
		
		WebUI.mouseOver(findTestObject('My Profile/a_mouseHoverWelcome'))
		
		WebUI.delay(2)

		WebUI.click(findTestObject('My Profile/a_Profile'))
		
	} else {
	}
	
	WebUI.delay(2)
	
	WebUI.click(findTestObject('Object Repository/B2C/div_Edit'))
	
	WebUI.delay(2)
	
	WebUI.click(findTestObject('Object Repository/B2C/a_UpdatePassword'))
	
	WebUI.delay(2)
	
	WebUI.setText(findTestObject('Object Repository/B2C/input_EmailForResetPass'),GlobalVariable.TestData['B2CEmail'] )
	
	WebUI.delay(2)
	
	WebUI.click(findTestObject('Object Repository/B2C/button_SendVerifCode'))
	
	WebUI.delay(2)
	
	String verifcode = WebUI.getText(findTestObject('Object Repository/B2C/div_VerifCodeSentMessage'))
	
	WebUI.delay(2)
	
    if (verifcode == 'Verification code has been sent. Please copy it to the input box below.') {
		
        GlobalVariable.vartestresult = 'PASS'

        GlobalVariable.varpassremarks = 'Validation message display on screen.'
    } else {
        GlobalVariable.vartestresult = 'FAIL'

        GlobalVariable.varfailremarks = 'Validation message not displayed on screen.'

        Thread.sleep(2000)
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