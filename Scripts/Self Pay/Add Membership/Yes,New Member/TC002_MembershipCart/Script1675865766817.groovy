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

	if(WebUI.verifyElementVisible((findTestObject('Object Repository/SelfPay/No,Dual_Reinstated Member/a-MembershipOrder'))))

	{
		WebUI.delay(2)

		WebUI.click(findTestObject('Object Repository/SelfPay/No,Dual_Reinstated Member/a-MembershipOrder'))

		WebUI.delay(8)

		WebUI.click(findTestObject('SelfPay/Membership Cart/button_BeginDateDropdown'))

		WebUI.delay(4)

		WebUI.sendKeys(findTestObject('SelfPay/Membership Cart/button_BeginDateDropdown'), 'April 01,2023')

		WebUI.delay(4)

		WebUI.sendKeys(findTestObject('Object Repository/SelfPay/Membership Cart/button_BeginDateDropdown'), Keys.chord(Keys.ENTER))

		WebUI.delay(2)

		WebUI.click(findTestObject('SelfPay/Membership Cart/button_EndDateDropDown'))

		WebUI.delay(4)

		WebUI.sendKeys(findTestObject('SelfPay/Membership Cart/button_EndDateDropDown'), 'September 30,2023')

		WebUI.delay(4)

		WebUI.sendKeys(findTestObject('Object Repository/SelfPay/Membership Cart/button_EndDateDropDown'), Keys.chord(Keys.ENTER))

		WebUI.delay(2)

		CustomKeywords.'com.application.DPOSCustomKeyword.needSomeHelpCloseButton'()

		WebUI.delay(2)

		WebUI.click(findTestObject('SelfPay/Membership Cart/a_MembershipOrder'))

		WebUI.delay(2)

		CustomKeywords.'com.application.DPOSCustomKeyword.needSomeHelpCloseButton'()

		WebUI.delay(2)

		WebUI.click(findTestObject('Object Repository/SelfPay/Review Order/a_ContinueToPayment'))

		WebUI.delay(2)

		CustomKeywords.'com.application.DPOSCustomKeyword.needSomeHelpCloseButton'()

		WebUI.delay(2)

		CustomKeywords.'com.application.submitpayment.payment'()

		WebUI.delay(4)
		
		WebUI.click(findTestObject('Object Repository/SelfPay/Common Functionality/btn_SubmitPaymentClubSelfPay'))
		
	    WebUI.delay(4)
	}
	else
	{

		WebUI.click(findTestObject('Object Repository/SelfPay/button_Confirm'))

		WebUI.delay(2)

		WebUI.click(findTestObject('Object Repository/SelfPay/Yes,NewMember/input_MembershipPayment'))

		WebUI.delay(2)

		WebUI.click(findTestObject('Object Repository/SelfPay/Add Membership/No,Dual_ReinstateMember/checkbox_TermsAndConditions'))

		WebUI.delay(2)

		WebUI.click(findTestObject('Object Repository/SelfPay/Yes,NewMember/button_SaveMembershipSubmit'))

		WebUI.delay(2)

		CustomKeywords.'com.application.DPOSCustomKeyword.needSomeHelpCloseButton'()

		WebUI.delay(2)

		WebUI.click(findTestObject('SelfPay/Membership Cart/button_BeginDateDropdown'))

		WebUI.delay(4)

		WebUI.click(findTestObject('Object Repository/SelfPay/Add Membership/No,Dual_ReinstateMember/dropdown_SelectBeginDate'))

		WebUI.delay(2)

		WebUI.click(findTestObject('SelfPay/Membership Cart/button_EndDateDropDown'))

		WebUI.delay(4)

		WebUI.click(findTestObject('Object Repository/SelfPay/Add Membership/No,Dual_ReinstateMember/dropdown_EnterEndDate'))

		WebUI.delay(2)

		WebUI.click(findTestObject('SelfPay/Membership Cart/a_MembershipOrder'))

		WebUI.delay(2)

		CustomKeywords.'com.application.DPOSCustomKeyword.needSomeHelpCloseButton'()

		WebUI.delay(2)

		WebUI.click(findTestObject('Object Repository/SelfPay/Review Order/a_ContinueToPayment'))

		WebUI.delay(2)

		CustomKeywords.'com.application.DPOSCustomKeyword.needSomeHelpCloseButton'()

		WebUI.delay(2)

		CustomKeywords.'com.application.submitpayment.payment'()

		WebUI.delay(4)

		WebUI.click(findTestObject('Object Repository/SelfPay/Common Functionality/btn_SubmitPaymentClubSelfPay'))

		WebUI.delay(4)
		
	}
	
	WebUI.waitForElementVisible(findTestObject('Object Repository/SelfPay/Common Functionality/text_MembershipPaymentId'), 240)

		if (WebUI.verifyElementVisible(findTestObject('Object Repository/SelfPay/Common Functionality/text_MembershipPaymentId'))) {

			WebUI.delay(2)

			String membershipPaymenytId = WebUI.getText(findTestObject('Object Repository/SelfPay/Common Functionality/text_MembershipPaymentId'))

			WebUI.delay(2)

			println(membershipPaymenytId)

			WebUI.delay(2)

			GlobalVariable.vartestresult = 'PASS'

			GlobalVariable.varpassremarks = ('User can successfully add new member.' + membershipPaymenytId)
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