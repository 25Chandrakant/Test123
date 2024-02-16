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

  if (WebUI.verifyElementVisible(findTestObject('ClubProxy/button_GoToDesignateProxyholder'))) {
	  
        WebUI.click(findTestObject('ClubProxy/button_GoToDesignateProxyholder'))
    } else {
    }
	
	 'Click on Login button and verify mandatory field message'
	WebUI.mouseOver(findTestObject('My Profile/a_mouseHoverWelcome'))
	
    WebUI.click(findTestObject('Object Repository/Login/a_Logout'), FailureHandling.OPTIONAL)

	
	WebUI.click(findTestObject('Object Repository/Login/a_Login'))
	
    'Enter the valid username and password'
    WebUI.setText(findTestObject('Object Repository/Login/input__UserName'), 'PN-05225256')//GlobalVariable.TestData['ClubPoxyUserID'])

    WebUI.mouseOver(findTestObject('Object Repository/Login/input__Password') )
	
    WebUI.setText(findTestObject('Object Repository/Login/input__Password'), 'password')// GlobalVariable.TestData['ClubProxyPassword'])

    //Thread.sleep(1000)
    'Click on Login button'
    WebUI.click(findTestObject('Object Repository/Login/input__btnLogin'))

    Thread.sleep(1000)

    //CustomKeywords.'com.application.DPOSCustomKeyword.privacyAndConsentCloseButton'()

   // Thread.sleep(1000)

   // WebUI.click(findTestObject('Object Repository/Login/a_Skip'), FailureHandling.OPTIONAL)

    if (WebUI.verifyElementVisible(findTestObject('Object Repository/Login/a_welcome'), FailureHandling.CONTINUE_ON_FAILURE)) {
		
        GlobalVariable.vartestresult = 'PASS'

        GlobalVariable.varpassremarks = 'User Successfully login and display logout link is visibale on screen.'
    } else {
        GlobalVariable.vartestresult = 'FAIL'

        GlobalVariable.varfailremarks = 'Login functionality not working with valid credential.'

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