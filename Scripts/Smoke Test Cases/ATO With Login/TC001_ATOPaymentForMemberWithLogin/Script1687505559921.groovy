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
import org.openqa.selenium.By as By
import org.openqa.selenium.WebElement as WebElement
import java.net.URL as URL

try {
    CustomKeywords.'com.application.DateTime.startTime'()
	
	CustomKeywords.'com.application.DPOSCustomKeyword.needSomeHelpCloseButton'()
 	
	WebUI.delay(4)
	
	WebUI.waitForElementVisible(findTestObject('Object Repository/ATO/Payment/button_Validate Address'), 120)
	
	WebUI.click(findTestObject('Object Repository/ATO/Payment/button_Validate Address'))
	
	WebUI.delay(10)
	
	WebUI.click(findTestObject('Object Repository/ATO/Payment/a_ConfirmAddress') )
	
	WebUI.delay(5)
	
	WebUI.click(findTestObject('Object Repository/ATO/a_CreditCard'))
	
	WebUI.delay(2) 
	
	WebUI.selectOptionByLabel(findTestObject('Object Repository/Common/Payment_CreditCard/select_Month'), GlobalVariable.TestData[
		'ExpireMonth'], false)
	
	WebUI.delay(2)

	// "09 - Sep", false)
	WebUI.selectOptionByLabel(findTestObject('Object Repository/Common/Payment_CreditCard/select_Year'), GlobalVariable.TestData[
		'ExpireYear'], false)
	
	WebUI.delay(2)

	//   , "2024", false )
	WebUI.sendKeys(findTestObject('Object Repository/Common/Payment_CreditCard/input__NameOnCard'), GlobalVariable.TestData[
		'cardNumber'])
	
	WebUI.delay(2)

	// "4032033468248120")
	WebUI.sendKeys(findTestObject('Object Repository/Common/Payment_CreditCard/input__NameOnCard'), Keys.chord(Keys.CONTROL,
			'a'))
	
	WebUI.delay(2)

	WebUI.sendKeys(findTestObject('Object Repository/Common/Payment_CreditCard/input__NameOnCard'), Keys.chord(Keys.CONTROL,
			'x'))
	
	WebUI.delay(2)

	WebUI.sendKeys(findTestObject('Object Repository/Common/Payment_CreditCard/input__CreditCardNumber'), Keys.chord(Keys.CONTROL,
			'v'))
	
	WebUI.delay(2)
	
	WebUI.click(findTestObject('Object Repository/ATO/input_Checkbox'))
	
	WebUI.delay(2)
	
	WebUI.click(findTestObject('Object Repository/Common/Payment_CreditCard/button_Submit'))
	
	Thread.sleep(1000)

	if (WebUI.verifyElementVisible(findTestObject('Object Repository/ATO/Payment/button__Print'))) {
		
		WebUI.delay(2)
		
		WebUI.mouseOver(findTestObject('My Profile/a_mouseHoverWelcome'))
		
		WebUI.delay(2)

		WebUI.click(findTestObject('Object Repository/My Profile/a_MyHome'))
		
		WebUI.delay(7)
		
		GlobalVariable.vartestresult = 'PASS'

		GlobalVariable.varpassremarks = 'User successfully do payment'
	} else {
		GlobalVariable.vartestresult = 'FAIL'

		GlobalVariable.varfailremarks = 'User is unable to complete the payment.'

		WebUI.back()
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
