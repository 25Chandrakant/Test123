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

    'Click on Profile link'
    WebUI.selectOptionByValue(findTestObject('Object Repository/Pathway/select_pathwayLanguage'), 'en-US', false)
	
	WebUI.delay(2)

    WebUI.click(findTestObject('Object Repository/Pathway/div_Select Digital Resources'))
	
	WebUI.delay(2)
	
	WebUI.click(findTestObject('Object Repository/Pathway/radiobutton_View All Options'))
	
	WebUI.delay(2)
	
	WebUI.click(findTestObject('Object Repository/Pathway/button_Continue'))
	
	WebUI.delay(2)

    WebUI.click(findTestObject('Object Repository/Pathway/div_Select Presentation Mastery'))
	
	WebUI.delay(2)

    WebUI.click(findTestObject('Object Repository/Pathway/button_Continue'))
	
	WebUI.delay(2)

    WebUI.verifyElementVisible(findTestObject('Object Repository/Pathway/h1_ConfirmYourPath'))
	
	WebUI.delay(2)

    WebUI.click(findTestObject('Object Repository/Pathway/Select_Printed_PathWay/button_ContinueForSelectedPathway'))
	
	WebUI.delay(2)
	
	WebUI.click(findTestObject('Object Repository/Pathway/button_AddressNext'))
	
	WebUI.delay(2)
	
	

    if (WebUI.verifyElementVisible(findTestObject('Object Repository/Pathway/text_Enroll_Successfully'))) {
        GlobalVariable.vartestresult = 'PASS'

        GlobalVariable.varpassremarks = 'Successfully display Confirm your path page'
    } else {
        GlobalVariable.vartestresult = 'FAIL'

        GlobalVariable.varfailremarks = 'Display error on Confirm your path page.'

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