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
import com.application.DPOSCustomKeyword as DPOSCustomKeyword

try {
    CustomKeywords.'com.application.DateTime.startTime'()

    'Click on Profile link'
    WebUI.click(findTestObject('My Profile/a_welcome'))

    CustomKeywords.'com.application.DPOSCustomKeyword.privacyAndConsentCloseButton'()

    CustomKeywords.'com.application.DPOSCustomKeyword.needSomeHelpCloseButton'()

    WebUI.mouseOver(findTestObject('My Profile/a_mouseHoverWelcome'))

    WebUI.click(findTestObject('My Profile/text_dropdownWelCome'))

    Thread.sleep(1000)

    WebUI.click(findTestObject('Object Repository/Login/a_Skip'), FailureHandling.OPTIONAL)

    CustomKeywords.'com.application.DPOSCustomKeyword.privacyAndConsentCloseButton'()

    CustomKeywords.'com.application.DPOSCustomKeyword.needSomeHelpCloseButton'()

    'Click  on Start a Club link'
    WebUI.click(findTestObject('Object Repository/ATO/a_Start a Club'))

	'Click on Application to start a organize button'
	WebUI.click(findTestObject('Object Repository/ATO/button_Application to Organize'))
	
    String ClubID = WebUI.getText(findTestObject('Object Repository/ATO/Page_Toastmasters International -Chartering Application/div_Your Club Number CB-07965620'))

    GlobalVariable.ClubIDs = ClubID

    String amountDue = WebUI.getText(findTestObject('Object Repository/ATO/text_ProfileATOAmountDue'))

    if (amountDue == '$0.00') {
        WebUI.click(findTestObject('Object Repository/ATO/Wire_Transfer_Payment/button_ATOSubmitPayment'))

        GlobalVariable.vartestresult = 'PASS'

        GlobalVariable.varpassremarks = ('Successfully match payment details for club number  ' + GlobalVariable.ClubIDs)
    } else {
        GlobalVariable.vartestresult = 'Fail'

        GlobalVariable.varfailremarks = 'Payment details not match.'
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