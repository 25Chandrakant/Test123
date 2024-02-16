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
import com.kms.katalon.entity.global.GlobalVariableEntity as GlobalVariableEntity
import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil
import com.github.javafaker.Faker as Faker
import java.net.URL as URL
import org.openqa.selenium.Keys as Keys
 
try {
	CustomKeywords.'com.application.DateTime.startTime'()
 
	CustomKeywords.'com.application.DPOSCustomKeyword.needSomeHelpCloseButton'()

	WebUI.delay(5)

	WebUI.click(findTestObject('Object Repository/SelfPay/Member Self-pay/input_NameOnCard'))

	WebUI.sendKeys(findTestObject('Object Repository/SelfPay/Member Self-pay/input_NameOnCard'), GlobalVariable.TestData['cardNumber'])

	WebUI.delay(2)

	WebUI.sendKeys(findTestObject('Object Repository/SelfPay/Member Self-pay/input_NameOnCard'), Keys.chord(Keys.CONTROL,'a'))

	WebUI.sendKeys(findTestObject('Object Repository/SelfPay/Member Self-pay/input_NameOnCard'), Keys.chord(Keys.CONTROL,'x'))

	WebUI.delay(2)

	WebUI.click(findTestObject('Object Repository/SelfPay/Submit Payment/input_CreditCardNumber'))

	WebUI.delay(2)

	WebUI.sendKeys(findTestObject('Object Repository/SelfPay/Submit Payment/input_CreditCardNumber'), Keys.chord(Keys.CONTROL,'v'))

	WebUI.delay(2)

	WebUI.click(findTestObject('Object Repository/SelfPay/Submit Payment/select_MonthDropdown'))

	WebUI.delay(2)

	WebUI.sendKeys(findTestObject('Object Repository/SelfPay/Submit Payment/select_MonthDropdown'), GlobalVariable.TestData['ExpireMonth'])

	WebUI.delay(2)

	WebUI.sendKeys(findTestObject('Object Repository/SelfPay/Submit Payment/select_MonthDropdown'), Keys.chord(Keys.ENTER))

	WebUI.delay(2)

	WebUI.click(findTestObject('Object Repository/SelfPay/Submit Payment/select_ExpirationYear'))

	WebUI.delay(2)

	WebUI.sendKeys(findTestObject('Object Repository/SelfPay/Submit Payment/select_ExpirationYear'), GlobalVariable.TestData['ExpireYear'])

	WebUI.delay(2)

	WebUI.sendKeys(findTestObject('Object Repository/SelfPay/Submit Payment/select_ExpirationYear'), Keys.chord(Keys.ENTER))

	WebUI.delay(2)

	WebUI.click(findTestObject('Object Repository/SelfPay/Member Self-pay/input_NameOnCard'))

	WebUI.delay(2)

	WebUI.sendKeys(findTestObject('Object Repository/SelfPay/Member Self-pay/input_NameOnCard'), GlobalVariable.TestData['NameOnCard'])

	WebUI.delay(2)

	WebUI.sendKeys(findTestObject('Object Repository/SelfPay/Member Self-pay/input_NameOnCard'), Keys.chord(Keys.ENTER))

	WebUI.delay(2)

	WebUI.click(findTestObject('Object Repository/SelfPay/Yes,NewMember/dropdown_UserInfoCountry'))

	WebUI.delay(2)

	WebUI.sendKeys(findTestObject('Object Repository/SelfPay/Yes,NewMember/input_CountrySearchBox'), GlobalVariable.TestData['CountryName'])

	WebUI.delay(2)

	WebUI.sendKeys(findTestObject('Object Repository/SelfPay/Yes,NewMember/input_CountrySearchBox'), Keys.chord(Keys.ENTER))

	WebUI.delay(2)

	WebUI.click(findTestObject('Object Repository/SelfPay/Yes,NewMember/input_BillingAddress'))

	WebUI.delay(2)

	WebUI.sendKeys(findTestObject('Object Repository/SelfPay/Yes,NewMember/input_BillingAddress'), GlobalVariable.TestData['BillingAddress'])

	WebUI.delay(2)

	WebUI.sendKeys(findTestObject('Object Repository/SelfPay/Yes,NewMember/input_BillingAddress'), Keys.chord(Keys.ENTER))

	WebUI.delay(2)

	WebUI.click(findTestObject('Object Repository/SelfPay/Yes,NewMember/input_UserInfoCity'))

	WebUI.delay(2)

	WebUI.sendKeys(findTestObject('Object Repository/SelfPay/Yes,NewMember/input_UserInfoCity'), GlobalVariable.TestData['City'])

	WebUI.delay(2)

	WebUI.sendKeys(findTestObject('Object Repository/SelfPay/Yes,NewMember/input_UserInfoCity'), Keys.chord(Keys.ENTER))

	WebUI.delay(2)

	WebUI.click(findTestObject('Object Repository/SelfPay/Yes,NewMember/span_UserInfoState'))

	WebUI.delay(2)

	WebUI.sendKeys(findTestObject('Object Repository/SelfPay/Yes,NewMember/input_StateSearchBox'), GlobalVariable.TestData['State'])

	WebUI.delay(2)

	WebUI.sendKeys(findTestObject('Object Repository/SelfPay/Yes,NewMember/input_StateSearchBox'), Keys.chord(Keys.ENTER))

	WebUI.delay(2)

	WebUI.click(findTestObject('Object Repository/SelfPay/Yes,NewMember/input_UserInfoPostalCode'))

	WebUI.delay(2)

	WebUI.sendKeys(findTestObject('Object Repository/SelfPay/Yes,NewMember/input_UserInfoPostalCode'), GlobalVariable.TestData['PostalCode'])

	WebUI.delay(2)

	WebUI.sendKeys(findTestObject('Object Repository/SelfPay/Yes,NewMember/input_UserInfoPostalCode'), Keys.chord(Keys.ENTER))

	WebUI.delay(2)

	WebUI.click(findTestObject('Object Repository/SelfPay/Common Functionality/btn_FinalPaymentSubmitBtn'))

	WebUI.delay(4)

	if (WebUI.verifyElementVisible(findTestObject('Object Repository/SelfPay/Common Functionality/text_MembershipPaymentId'))) {

		WebUI.delay(2)

		String membershipPaymenytId = WebUI.getText(findTestObject('Object Repository/SelfPay/Common Functionality/text_MembershipPaymentId'))

		WebUI.delay(2)

		println(membershipPaymenytId)

		WebUI.delay(2)
 
		GlobalVariable.vartestresult = 'PASS'
 
		GlobalVariable.varpassremarks = ('Membership successfully paid with member address .' + membershipPaymenytId)
	} else {
		GlobalVariable.vartestresult = 'FAIL'
 
		GlobalVariable.varfailremarks = 'User not able to add new member.'
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

