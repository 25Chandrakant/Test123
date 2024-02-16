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
	 
	 
	 
	 //WebUI.click( findTestObject('Object Repository/ClubCentral/Submit Payment/button_CancelPendingOrder')  )
	 WebUI.delay(3)
	 WebUI.scrollToPosition(50, 60)
	 //WebUI.scrollToElement( findTestObject('Object Repository/ClubCentral/Submit Payment/button_RemoveOrder') , 10)
	
	 WebUI.click( findTestObject('Object Repository/ClubCentral/Submit Payment/button_RemoveOrder')   )
	
	 'Remove'
	 //WebUI.click( findTestObject('Object Repository/ClubCentral/Submit Payment/button_Remove') )
	 
	 'Remove Order'
	 //WebUI.click(  findTestObject('Object Repository/ClubCentral/Submit Payment/button_RemoveOrder')  )
	 
	 "Cancel to pending order"
	 WebUI.click( findTestObject('Object Repository/ClubCentral/Submit Payment/button_CancelPendingOrders')  )
	 
	 
	 
    if ( WebUI.verifyElementVisible( findTestObject('Object Repository/ClubCentral/Submit Payment/text_ValidationForCancelPendingOrder')  )) {
        WebUI.click( findTestObject('Object Repository/ClubCentral/Submit Payment/button_ReturnToPayment'))

        GlobalVariable.vartestresult = 'PASS'

        GlobalVariable.varpassremarks = 'User successfully Remove member payment order  .'
    } else {
        GlobalVariable.vartestresult = 'FAIL'

        GlobalVariable.varfailremarks = 'User can not remove member payment order .'
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