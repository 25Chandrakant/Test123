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

    WebUI.click(findTestObject('Object Repository/SelfPay/No,Dual_Reinstated Member/a-MembershipOrder'))
    
	WebUI.delay(2)

    CustomKeywords.'com.application.DPOSCustomKeyword.needSomeHelpCloseButton'()
	
	WebUI.click(findTestObject('SelfPay/Membership Cart/button_BeginDateDropdown'))
	
	WebUI.delay(2)
	
	WebUI.click(findTestObject('SelfPay/Membership Cart/li_BeginOfMonth'))
	
	WebUI.delay(2)
	
	WebUI.click(findTestObject('SelfPay/Membership Cart/button_EndDateDropDown'))
	
	WebUI.delay(2)
	
	WebUI.click(findTestObject('Object Repository/SelfPay/Membership Cart/li_EndOfMonth'))
	
	WebUI.delay(2)
	
	WebUI.click(findTestObject('SelfPay/Membership Cart/a_MembershipOrder'))
	
	WebUI.delay(2)
	
	WebUI.click(findTestObject('Object Repository/SelfPay/Review Order/a_ContinueToPayment'))
	
	WebUI.delay(2)
	
	WebUI.click(findTestObject('Object Repository/SelfPay/Submit Payment/input_CreditCardNumber'))
	
	WebUI.delay(2)
	
	WebUI.setText(findTestObject('Object Repository/SelfPay/Submit Payment/input_CreditCardNumber'), '2223 0000 4840 0011')
	
	WebUI.delay(2)
	
	WebUI.click(findTestObject('Object Repository/SelfPay/Submit Payment/select_MonthDropdown'))
	
	WebUI.delay(2)
	
	WebUI.sendKeys(findTestObject('Object Repository/SelfPay/Submit Payment/select_MonthDropdown'), '01-Jan')
	
	WebUI.delay(2)
	
	WebUI.sendKeys(findTestObject('Object Repository/SelfPay/Submit Payment/select_MonthDropdown'), Keys.chord(Keys.ENTER))
	
	WebUI.delay(2)
	
	WebUI.click(findTestObject('Object Repository/SelfPay/Submit Payment/select_ExpirationYear'))
	
	WebUI.delay(2)
	
	WebUI.sendKeys(findTestObject('Object Repository/SelfPay/Submit Payment/select_ExpirationYear'), '2026')
	
	WebUI.delay(2)
	
	WebUI.sendKeys(findTestObject('Object Repository/SelfPay/Submit Payment/select_ExpirationYear'), Keys.chord(Keys.ENTER))
	
	WebUI.delay(2)
	
	WebUI.click(findTestObject('Object Repository/SelfPay/Submit Payment/input_UseClubInfoCheckBox'))
	
	WebUI.delay(2)
	
	WebUI.click(findTestObject('Object Repository/SelfPay/Submit Payment/button_SubmitPayment'))
	
	WebUI.delay(2)
	
    if (WebUI.verifyElementVisible(findTestObject('Object Repository/SelfPay/Submit Payment/h_Congratulations'))) {

        GlobalVariable.vartestresult = 'PASS'

        GlobalVariable.varpassremarks = 'User successfully submits the pending membership'
    } else {
        GlobalVariable.vartestresult = 'FAIL'

        GlobalVariable.varfailremarks = 'User not able to submit the pending membership'
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