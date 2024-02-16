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

    'Diners Credit Card'
    WebUI.selectOptionByLabel(findTestObject('Object Repository/Common/Payment_CreditCard/select_Month'), GlobalVariable.TestData[
        'ExpireMonth'], false)

     WebUI.selectOptionByLabel(findTestObject('Object Repository/Common/Payment_CreditCard/select_Year'), GlobalVariable.TestData[
        'ExpireYear'], false)

     WebUI.sendKeys(findTestObject('Object Repository/Common/Payment_CreditCard/input__NameOnCard'), GlobalVariable.TestData[
        'DinersCreditCard'])

     WebUI.sendKeys(findTestObject('Object Repository/Common/Payment_CreditCard/input__NameOnCard'), Keys.chord(Keys.CONTROL, 
            'a'))

    WebUI.sendKeys(findTestObject('Object Repository/Common/Payment_CreditCard/input__NameOnCard'), Keys.chord(Keys.CONTROL, 
            'x'))

    WebUI.sendKeys(findTestObject('Object Repository/Common/Payment_CreditCard/input__CreditCardNumber'), Keys.chord(Keys.CONTROL, 
            'v'))
    WebUI.click( findTestObject('Object Repository/ClubCentral/Submit Payment/checkBox_UseClubInformation')  )
	WebUI.click(findTestObject('Object Repository/ClubCentral/Submit Payment/input__place-order-button'))
	
	
    WebUI.verifyElementVisible( findTestObject('Object Repository/ClubCentral/Submit Payment/text_ValidationCreditCardDenied'))

    'Meastro Credit card'
	//WebUI.clearText( findTestObject('Object Repository/ATO/Payment/input__NameOnCard') )
	WebUI.sendKeys(findTestObject('Object Repository/Common/Payment_CreditCard/input__CreditCardNumber'), Keys.chord(Keys.CONTROL,
		'a'))
	WebUI.sendKeys(findTestObject('Object Repository/Common/Payment_CreditCard/input__CreditCardNumber'), Keys.chord(Keys
		.DELETE)  )
    WebUI.sendKeys(findTestObject('Object Repository/Common/Payment_CreditCard/input__NameOnCard'), GlobalVariable.TestData[
        'MeastroCreditCard'])

     WebUI.sendKeys(findTestObject('Object Repository/Common/Payment_CreditCard/input__NameOnCard'), Keys.chord(Keys.CONTROL, 
            'a'))

    WebUI.sendKeys(findTestObject('Object Repository/Common/Payment_CreditCard/input__NameOnCard'), Keys.chord(Keys.CONTROL, 
            'x'))

    WebUI.sendKeys(findTestObject('Object Repository/Common/Payment_CreditCard/input__CreditCardNumber'), Keys.chord(Keys.CONTROL, 
            'v'))

    WebUI.verifyElementVisible(findTestObject('Object Repository/ClubCentral/Submit Payment/text_ValidationCreditcardNumber'))

    'JCB Credit card'
	//WebUI.clearText( findTestObject('Object Repository/ATO/Payment/input__NameOnCard') )
	WebUI.sendKeys(findTestObject('Object Repository/Common/Payment_CreditCard/input__CreditCardNumber'), Keys.chord(Keys.CONTROL,
		'a'))
	WebUI.sendKeys( findTestObject('Object Repository/Common/Payment_CreditCard/input__CreditCardNumber'), Keys.chord(Keys
		.DELETE)  )
	
    WebUI.sendKeys(findTestObject('Object Repository/Common/Payment_CreditCard/input__NameOnCard'), GlobalVariable.TestData[
        'JCBCreditCard'])

     WebUI.sendKeys(findTestObject('Object Repository/Common/Payment_CreditCard/input__NameOnCard'), Keys.chord(Keys.CONTROL, 
            'a'))

    WebUI.sendKeys(findTestObject('Object Repository/Common/Payment_CreditCard/input__NameOnCard'), Keys.chord(Keys.CONTROL, 
            'x'))

    WebUI.sendKeys(findTestObject('Object Repository/Common/Payment_CreditCard/input__CreditCardNumber'), Keys.chord(Keys.CONTROL, 
            'v'))

    if (WebUI.verifyElementVisible( findTestObject('Object Repository/ClubCentral/Submit Payment/text_ValidationCreditCardDenied'))) {
 
        GlobalVariable.vartestresult = 'PASS'

        GlobalVariable.varpassremarks = 'Websit not accept other credit card.'
    } else {
        GlobalVariable.vartestresult = 'FAIL'

        GlobalVariable.varfailremarks = 'Website accept other credit card.'
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