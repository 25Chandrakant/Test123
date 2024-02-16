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

	WebUI.delay(10)
	
	//When club is enrolled in Self-Pay
	
	if (WebUI.verifyElementVisible(findTestObject('Object Repository/SelfPay/p_SelfPayNotEnrolledNotificationText'))) {
		
		WebUI.delay(2)
		
		WebUI.click(findTestObject('Object Repository/SelfPay/u_SelfPaySettings'))
		
	} else {
	}
		
		WebUI.delay(5)
		
		CustomKeywords.'com.application.DPOSCustomKeyword.needSomeHelpCloseButton'()
		
		WebUI.delay(5)
		
		WebUI.scrollToElement(findTestObject('Object Repository/SelfPay/slider_SelfPayActive'), 30)
		
		WebUI.delay(2)
		
		WebUI.click(findTestObject('Object Repository/SelfPay/slider_SelfPayActive'))
		
		WebUI.delay(2)
		
		WebUI.click(findTestObject('Object Repository/SelfPay/button_SelfPayEnabled'))
		
		WebUI.delay(5)
		
		WebUI.scrollToElement(findTestObject('Object Repository/SelfPay/slider_SelfPayActive'), 30)
		
		WebUI.delay(5)
		
		WebUI.click(findTestObject('Object Repository/SelfPay/button_Submit'))
		
		WebUI.delay(10)
		
	if (WebUI.verifyElementVisible(findTestObject('Object Repository/SelfPay/div_SuccessfullyUpdatedInformation'))) {
	
        GlobalVariable.vartestresult = 'PASS'

        GlobalVariable.varpassremarks = 'Club is enrolled in self-pay.'
    } else {
        GlobalVariable.vartestresult = 'FAIL'

        GlobalVariable.varfailremarks = 'Club is not enrolled in self-pay.'
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