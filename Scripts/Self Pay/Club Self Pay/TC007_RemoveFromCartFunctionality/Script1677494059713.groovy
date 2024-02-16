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
import org.openqa.selenium.Keys as Keys
import org.openqa.selenium.By as By
import org.openqa.selenium.WebElement as WebElement
import java.net.URL as URL
 
try {
	CustomKeywords.'com.application.DateTime.startTime'()

	CustomKeywords.'com.application.DPOSCustomKeyword.needSomeHelpCloseButton'()
 
	WebUI.delay(2)
 
	WebUI.click(findTestObject('Object Repository/SelfPay/Common Functionality/tile_ClubCentralClick'))

	WebUI.delay(2)
 
	WebUI.click(findTestObject('Object Repository/SelfPay/Common Functionality/popup_CloseSelfPaySettingsPopup'))

	WebUI.delay(2)

	WebUI.click(findTestObject('Object Repository/SelfPay/Common Functionality/tile_MembershipManagementClick'))

	WebUI.delay(2)
 
	CustomKeywords.'com.application.DPOSCustomKeyword.needSomeHelpCloseButton'()

	WebUI.delay(2)
 
	WebUI.click(findTestObject('Object Repository/SelfPay/Common Functionality/card_MouseHover'))

	WebUI.delay(2)

	WebUI.click(findTestObject('Object Repository/SelfPay/Common Functionality/btn_CardAddtoCartButtonClick'))

	WebUI.delay(2)

	WebUI.click(findTestObject('Object Repository/SelfPay/Club Self Pay/Pay for Future Membership/dropdown_RenewPeriodClick'))

	WebUI.delay(2)
	
	WebUI.click(findTestObject('Object Repository/SelfPay/Club Self Pay/Pay for Future Membership/dropdown_RenewalPeriodValueEnter'))
	
	WebUI.delay(2)

	WebUI.click(findTestObject('Object Repository/SelfPay/Club Self Pay/Renew Membership For Unpaid Member/btn_ClickPopupAddtoCartBtn'))

	WebUI.delay(2)

	WebUI.click(findTestObject('Object Repository/SelfPay/Common Functionality/btn_ClickOnMembershipCartBtn'))

	WebUI.delay(3)

	CustomKeywords.'com.application.DPOSCustomKeyword.needSomeHelpCloseButton'()

	WebUI.delay(2)

	WebUI.click(findTestObject('Object Repository/SelfPay/Common Functionality/btn_RemoveFromCart'))

	WebUI.delay(2)

   if (WebUI.verifyElementVisible(findTestObject('Object Repository/SelfPay/Common Functionality/text_VerifyMembershipManagementPage'))) {

	   WebUI.delay(2)

		GlobalVariable.vartestresult = 'PASS'
 
		GlobalVariable.varpassremarks = 'User has successfully removed from the cart.'
	} else {
		GlobalVariable.vartestresult = 'FAIL'
 
		GlobalVariable.varfailremarks = 'User is unable to remove member from the cart.'
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

