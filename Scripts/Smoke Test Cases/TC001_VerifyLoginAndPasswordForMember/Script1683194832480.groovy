
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import javax.media.PackageManager as PackageManager
import javax.naming.Context as Context
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

    WebUI.delay(4)
	
	'Click on Profile link'
	if (WebUI.verifyElementVisible(findTestObject('My Profile/a_mouseHoverWelcome'))) {
		
		WebUI.mouseOver(findTestObject('My Profile/a_mouseHoverWelcome'))
		
		WebUI.delay(2)

		WebUI.click(findTestObject('My Profile/a_Profile'))
		
		WebUI.delay(5)
		
	} else {
	}

    'Click on Instructions '
    String addressCollaspe = WebUI.getAttribute(findTestObject('My Profile/Login And Password/LoginAndPassword_Toggle'),'aria-expanded')
	
	if (addressCollaspe == 'true') {
		print('........................Already Expand Login And Password  section')
		
	} else {
	
		WebUI.click(findTestObject('My Profile/Login And Password/a_LoginAndPassword'))
		
		print('.........................   Successfully click on Expand button')
	}
	
	WebUI.delay(3)

    WebUI.click(findTestObject('My Profile/Login And Password/p-Edit'))
	
	WebUI.delay(20)

	'Enter Current Password'
	 WebUI.click(findTestObject('Object Repository/My Profile/Login And Password/input_CurrentPassword'))
			
	 WebUI.delay(2)
			
	 WebUI.sendKeys(findTestObject('Object Repository/My Profile/Login And Password/input_CurrentPassword'), 'password')
			
	 WebUI.delay(2)
			
	 WebUI.sendKeys(findTestObject('Object Repository/My Profile/Login And Password/input_CurrentPassword'), Keys.chord(Keys.ENTER))
			
	 WebUI.delay(2)
			
	 WebUI.click(findTestObject('Object Repository/My Profile/Login And Password/input_NewPassword'))
			
	 WebUI.delay(2)
			
	 WebUI.sendKeys(findTestObject('Object Repository/My Profile/Login And Password/input_NewPassword'), 'password')
			
	 WebUI.delay(2)
			
	 WebUI.sendKeys(findTestObject('Object Repository/My Profile/Login And Password/input_NewPassword'), Keys.chord(Keys.ENTER))
			
	 WebUI.delay(2)
			
	 WebUI.click(findTestObject('Object Repository/My Profile/Login And Password/input_ConfirmPassword'))
			
	 WebUI.delay(2)
			
	 WebUI.sendKeys(findTestObject('Object Repository/My Profile/Login And Password/input_ConfirmPassword'), 'password')
			
	 WebUI.delay(2)
			
	 WebUI.sendKeys(findTestObject('Object Repository/My Profile/Login And Password/input_ConfirmPassword'), Keys.chord(Keys.ENTER))
			
	 WebUI.delay(2)
	 
	 WebUI.click(findTestObject('Object Repository/My Profile/Login And Password/button_SaveLoginAndPassword'))
	 
	 WebUI.delay(3)
	 
	 if (WebUI.verifyElementVisible(findTestObject('Object Repository/My Profile/Login And Password/div_SuccessMessageForLogin'))) {

			GlobalVariable.vartestresult = 'PASS'

			GlobalVariable.varpassremarks = 'User can successfully change password .'
		} else {
			GlobalVariable.vartestresult = 'FAIL'

			GlobalVariable.varfailremarks = 'User not able to change the password.'
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