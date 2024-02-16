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
  
	WebUI.selectOptionByLabel( findTestObject('Object Repository/ATO/Payment/address/select_SelectCountry') , GlobalVariable.TestData["CountryName"], false)
	
	GlobalVariable.countrySA = GlobalVariable.TestData["CountryName"]
	
	WebUI.delay(2)
	
 	WebUI.setText(  findTestObject('Object Repository/ATO/Payment/address/input__.Address1') ,GlobalVariable.TestData["Address"])
	 
	GlobalVariable.addressSA = GlobalVariable.TestData["Address"]
	
	WebUI.delay(2)
	
 	WebUI.setText( findTestObject('Object Repository/ATO/Payment/address/input__City')  ,GlobalVariable.TestData["City"])
	 
	GlobalVariable.citySA = GlobalVariable.TestData["City"]
	
	WebUI.delay(2)
	
	WebUI.selectOptionByLabel( findTestObject('Object Repository/ATO/Payment/address/select_SelectStates') , GlobalVariable.TestData["States"], false)
	
	GlobalVariable.statesSA = GlobalVariable.TestData["States"]
	
	WebUI.delay(2)
	
 	WebUI.setText(  findTestObject('Object Repository/ATO/Payment/address/div_ZIPPostalCode') ,GlobalVariable.TestData["PostalCode"])
	 
	GlobalVariable.postalcodeSA = GlobalVariable.TestData["PostalCode"]
	
	WebUI.delay(2)
	
	String CharterFee = WebUI.getText(findTestObject('Object Repository/ATO/Payment/address/Verify_CharterFee') )
	
	GlobalVariable.charterFee = CharterFee
	
	WebUI.delay(2)
	
	String Tax = WebUI.getText( findTestObject('Object Repository/ATO/Payment/address/Verify_Tax'))
	
	GlobalVariable.Tax = Tax
	
	WebUI.delay(2)
	
	String TotalOrder= WebUI.getText( findTestObject('Object Repository/ATO/Payment/address/Verify_TotalOrder'))
	
	GlobalVariable.TotalOrder = TotalOrder
	
	WebUI.delay(2)
	
	WebUI.click(findTestObject('Object Repository/ATO/Payment/button_Validate Address'))
	
	Thread.sleep(1000)
	
	WebUI.click(findTestObject('Object Repository/ATO/Payment/a_ConfirmAddress') )
	
	WebUI.delay(3)
	
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

	WebUI.setText(findTestObject('Object Repository/ATO/Payment/input__NameOnCard'), GlobalVariable.TestData['CardName'])

	WebUI.delay(2)
	
	// "John carry")
	WebUI.click(findTestObject('Object Repository/Common/Payment_CreditCard/button_Select Country'))
	
	WebUI.delay(2)
	
	WebUI.click(findTestObject('Object Repository/ATO/span_Country'))
	
	//WebUI.sendKeys(findTestObject('Object Repository/Common/Payment_CreditCard/button_Select Country'), 'United States')
	
	//WebUI.delay(1)
	
	//WebUI.sendKeys(findTestObject('Object Repository/Common/Payment_CreditCard/button_Select Country'),Keys.chord(Keys.ENTER))

	//WebUI.click(findTestObject('Object Repository/Common/Payment_CreditCard/a_United States'))
	
	WebUI.delay(2)

	WebUI.click(findTestObject('Object Repository/Common/Payment_CreditCard/button_Select States'))
	
	WebUI.delay(2)

	WebUI.click(findTestObject('Object Repository/Common/Payment_CreditCard/a_California'))
	
	WebUI.delay(2)

	WebUI.setText(findTestObject('Object Repository/Common/Payment_CreditCard/input__Address1'), GlobalVariable.TestData[
		'Address'])

	//"31441 Santa Margarita Pkwy Suite N")
	WebUI.setText(findTestObject('Object Repository/Common/Payment_CreditCard/input__City'), GlobalVariable.TestData['City'])

	// "Ranhco Santa Margarita ")
	WebUI.setText(findTestObject('Object Repository/Common/Payment_CreditCard/input__PostalCode'), GlobalVariable.TestData[
		'PostalCode'])

	// "92688")
	WebUI.click(findTestObject('Object Repository/Common/Payment_CreditCard/button_Submit'))
	
	//Thread.sleep(1000)
	
	WebUI.delay(5)

	if (WebUI.verifyElementVisible(findTestObject('Object Repository/ATO/Payment/button__Print'))) {
		
		WebUI.delay(2)
		
		//WebUI.click(findTestObject('Object Repository/ATO/a_Logout'))
		
		//WebUI.delay(2)
		
		GlobalVariable.vartestresult = 'PASS'

		GlobalVariable.varpassremarks = 'User successfully do payment and go to Next step page'
	} else {
		GlobalVariable.vartestresult = 'FAIL'

		GlobalVariable.varfailremarks = 'User is unbale to complete the payment.'

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
