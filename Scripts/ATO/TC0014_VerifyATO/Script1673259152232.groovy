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
import org.fusesource.jansi.internal.Kernel32.CONSOLE_SCREEN_BUFFER_INFO as CONSOLE_SCREEN_BUFFER_INFO
import org.openqa.selenium.By as By
import org.openqa.selenium.WebElement as WebElement
import java.net.URL as URL

try {
    CustomKeywords.'com.application.DateTime.startTime'()
 
	 String chfee = WebUI.getText(  findTestObject('Object Repository/ATO/VerifyClubDetails/Payment/div_Charter Fee'))
	 
	 String tfee = WebUI.getText(findTestObject('Object Repository/ATO/VerifyClubDetails/Payment/div_Tax')  )
	 
	 String ordertotal = WebUI.getText(findTestObject('Object Repository/ATO/VerifyClubDetails/Payment/div_Order Total')  )

	 String paymentMethod = WebUI.getText( findTestObject('Object Repository/ATO/VerifyClubDetails/Payment/span_PaymentMethod')  )
	 
    if (chfee==GlobalVariable.ChaterFee&&tfee==GlobalVariable.TaxFee&&ordertotal==GlobalVariable.OrderTotalFee&&paymentMethod.contains("CC") ) {
         print('PASS......................>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>')

       
        GlobalVariable.vartestresult = 'PASS'

         GlobalVariable.varpassremarks = "Successfully Match payment details"
    } else {
        print('FAIL...................>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>')

        GlobalVariable.vartestresult = 'FAIL'

        GlobalVariable.varfailremarks = 'ATO is not Created Successfully with CreditCard'
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