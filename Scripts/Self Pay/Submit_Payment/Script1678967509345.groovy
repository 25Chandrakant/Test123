import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

public class Submit_Payment{
	
	def void submitpayment() {
		
		WebUI.click(findTestObject('Object Repository/SelfPay/Common Functionality/textbox_ClickOnCardName'))
		
		WebUI.delay(2)
	
		WebUI.sendKeys(findTestObject('Object Repository/SelfPay/Common Functionality/textbox_ClickOnCardName'), GlobalVariable.TestData['cardNumber'])
		
		WebUI.delay(2)
	
		WebUI.sendKeys(findTestObject('Object Repository/SelfPay/Common Functionality/textbox_ClickOnCardName'), Keys.chord(Keys.CONTROL,'a'))
		
		WebUI.delay(2)
		
		WebUI.sendKeys(findTestObject('Object Repository/SelfPay/Common Functionality/textbox_ClickOnCardName'), Keys.chord(Keys.CONTROL,'x'))
		
		WebUI.delay(2)
		
		WebUI.click(findTestObject('Object Repository/SelfPay/Common Functionality/checkbox_AddAddress'))
		
		WebUI.delay(2)
		
		WebUI.click(findTestObject('Object Repository/SelfPay/Common Functionality/textbox_SelectCardField'))
		
		WebUI.delay(2)
		
		WebUI.sendKeys(findTestObject('Object Repository/SelfPay/Common Functionality/textbox_SelectCardField'), Keys.chord(Keys.CONTROL, 'v'))
		
		WebUI.delay(2)
		
		WebUI.click(findTestObject('Object Repository/SelfPay/Common Functionality/dropdown_SelectCardExpiryDate'))
		
		WebUI.delay(2)
		
		WebUI.sendKeys(findTestObject('Object Repository/SelfPay/Common Functionality/dropdown_SelectCardExpiryDate'),GlobalVariable.TestData['ExpireMonth'])
		
		WebUI.delay(2)
		
		WebUI.click(findTestObject('Object Repository/SelfPay/Common Functionality/dropdown_CardExpiryYearSelection'))
		
		WebUI.delay(2)
		
		WebUI.sendKeys(findTestObject('Object Repository/SelfPay/Common Functionality/dropdown_CardExpiryYearSelection'),GlobalVariable.TestData['ExpireYear'])
		
		WebUI.delay(2)
	}
}