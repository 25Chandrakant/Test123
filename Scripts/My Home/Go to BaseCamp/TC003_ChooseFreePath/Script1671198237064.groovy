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

    'Click on Choose Free Path'
    WebUI.click(findTestObject('My Home/Go To BaseCamp/h2_ChooseFreePath'))
	
	WebUI.delay(5)
	
	CustomKeywords.'com.application.DPOSCustomKeyword.needSomeHelpCloseButton'()

    'Select Path Language'
	WebUI.selectOptionByValue(findTestObject('My Home/Go To BaseCamp/dropdown_SelectLanguage'), 'en-US', false)
	
	WebUI.click(findTestObject('My Home/Go To BaseCamp/label_SelectDigitalResources'))
	
	WebUI.click(findTestObject('My Home/Go To BaseCamp/label_SelectPresentationMastery'))
	
	WebUI.click(findTestObject('My Home/Go To BaseCamp/span_ContinueButton'))
	
	WebUI.verifyElementVisible(findTestObject('My Home/Go To BaseCamp/h1_ConfirmYourSelection'))
	
	WebUI.click(findTestObject('My Home/Go To BaseCamp/button_ContinueYourSelection'))
	
	
    
    String getUrl = WebUI.getUrl()

    if (getUrl == 'https://toastmasters-pilot.csod.com/LMS/catalog/Welcome.aspx?') {
        WebUI.back()

        WebUI.back()

 
        GlobalVariable.vartestresult = 'PASS'

        GlobalVariable.varpassremarks = ('Successfully open Go To Base Camp page:' + getUrl)
    } else {
 
        GlobalVariable.vartestresult = 'FAIL'

        GlobalVariable.varfailremarks = 'Not open Go To Base Camp page.'

        WebUI.back()

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