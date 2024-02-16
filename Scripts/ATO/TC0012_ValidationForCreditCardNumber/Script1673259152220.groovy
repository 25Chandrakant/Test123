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
	
    WebUI.click(findTestObject('Object Repository/ATO/Payment/a_Credit Card'))

  
	
	String chaterFee = WebUI.getText(findTestObject('Object Repository/ATO/PaymentGetText/text_chaterFee'))
    GlobalVariable.ChaterFee = chaterFee
	
    String taxFee = WebUI.getText(findTestObject('Object Repository/ATO/PaymentGetText/text_tax'))
	GlobalVariable.TaxFee = taxFee
	
    String orderTotalFee = WebUI.getText(findTestObject('Object Repository/ATO/PaymentGetText/text_orderTotal'))
	GlobalVariable.OrderTotalFee = orderTotalFee
   
	
	
	WebUI.click(findTestObject('Object Repository/ATO/Payment/button_FinalSubmit'))
	
	WebUI.delay(30)
	
	

    String validationMessage = WebUI.getText(findTestObject('Object Repository/ATO/a_ValidationMessageForCreditCardNumber'))

    print(validationMessage)

    if (validationMessage.contains('Please fill out this field.')) {
        GlobalVariable.vartestresult = 'PASS'

        GlobalVariable.varpassremarks = 'On Screen successfully display validation messasge'
    } else {
        GlobalVariable.vartestresult = 'Fail'

        GlobalVariable.varfailremarks = 'On screen not display any validation message'
    }
	
	WebUI.click(findTestObject('Object Repository/Login/Logout/Logout'))
    
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