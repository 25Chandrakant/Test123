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
import net.bytebuddy.asm.Advice.Enter as Enter
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil
import org.openqa.selenium.Keys as Keys
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.By as By
import org.openqa.selenium.By.ByXPath as ByXPath
import org.openqa.selenium.WebElement as WebElement
import java.net.URL as URL
import org.openqa.selenium.remote.RemoteWebDriver as RemoteWebDriver
import com.kms.katalon.core.webui.common.WebUICommonScripts as WebUICommonScripts
import com.kms.katalon.core.webui.common.WebUiCommonHelper as WebUiCommonHelper
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory

try {
    CustomKeywords.'com.application.DateTime.startTime'()

    CustomKeywords.'com.application.DPOSCustomKeyword.needSomeHelpCloseButton'()

    WebUI.click(findTestObject('Object Repository/Submit Education Awards/span_Select Member'))
	
	WebUI.delay(5)
	
	//WebUI.click(findTestObject('Object Repository/ClubCentral/Eligibility Assistant/input_searchBox'))
	
	//WebUI.delay(2)

    WebUI.sendKeys(findTestObject('Object Repository/ClubCentral/Eligibility Assistant/input_searchBox'), 'PN-00736099')
	
	WebUI.delay(5)

    WebUI.sendKeys(findTestObject('Object Repository/ClubCentral/Eligibility Assistant/input_searchBox'), Keys.chord(Keys.ENTER))
	
	WebUI.delay(5)

    WebUI.click(findTestObject('Object Repository/Submit Education Awards/span_Select Education Program'))

    // Submit Education Award Level 01
    if (WebUI.verifyElementVisible(findTestObject('Object Repository/Submit Education Awards/leve01_Option1'))) {
        WebUI.click(findTestObject('Object Repository/Submit Education Awards/leve01_Option1'))
		
		WebUI.delay(5)
		
		WebUI.click(findTestObject('Submit Education Awards/button_ReviewAwardSubmission'))
		
		WebUI.delay(5)

        WebUI.click(findTestObject('Object Repository/Submit Education Awards/button_ReviewAwardSubmit'))
		
		WebUI.delay(5)

        WebUI.click(findTestObject('Object Repository/Submit Education Awards/button_SubmitAward'))
		
		WebUI.delay(5)

        WebUI.click(findTestObject('Object Repository/Submit Education Awards/button_ReturnToClubCentral'))
		
        //WebUI.verifyElementNotVisible(findTestObject('Object Repository/Submit Education Awards/leve01_Option1'), FailureHandling.STOP_ON_FAILURE)
    } else {
        //WebUI.verifyElementVisible(findTestObject('Object Repository/Submit Education Awards/leve01_Option1'), FailureHandling.STOP_ON_FAILURE)

       // GlobalVariable.varfailremarks = 'FAIL'
    }
    
    WebUI.delay(3)

//    WebUI.click(findTestObject('Object Repository/Submit Education Awards/span_Select Member'))

 //   WebUI.sendKeys(findTestObject('Object Repository/ClubCentral/Eligibility Assistant/input_searchBox'), GlobalVariable.TestData[
 //       'PathwayMemberID'])

 //   WebUI.sendKeys(findTestObject('Object Repository/ClubCentral/Eligibility Assistant/input_searchBox'), Keys.chord(Keys.ENTER))

 //   WebUI.delay(3)

 //   WebUI.click(findTestObject('Object Repository/Submit Education Awards/span_Select Education Program'))

 //   WebUI.delay(3)

 //   'Select Level 2 Option'
 //   if (WebUI.verifyElementVisible(findTestObject('Object Repository/Submit Education Awards/level02_Option'))) {
 //       WebUI.click(findTestObject('Object Repository/Submit Education Awards/level02_Option'))

 //       WebUI.click(findTestObject('Object Repository/Submit Education Awards/button_ReviewAwardSubmit'))

//        WebUI.click(findTestObject('Object Repository/Submit Education Awards/button_EditButton'))

 //       WebUI.verifyElementVisible(findTestObject('Object Repository/Submit Education Awards/span_Select Education Program'))

//        WebUI.click(findTestObject('Object Repository/Submit Education Awards/button_ReviewAwardSubmit'))

 //       WebUI.click(findTestObject('Object Repository/Submit Education Awards/button_SubmitAward'))

 //       WebUI.click(findTestObject('Object Repository/Submit Education Awards/button_SubmitAnotherAwards'))
 //   }
    
//    WebUI.delay(3)

//    WebUI.click(findTestObject('Object Repository/Submit Education Awards/span_Select Member'))

//    WebUI.sendKeys(findTestObject('Object Repository/ClubCentral/Eligibility Assistant/input_searchBox'), GlobalVariable.TestData[
//        'PathwayMemberID'])

//    WebUI.sendKeys(findTestObject('Object Repository/ClubCentral/Eligibility Assistant/input_searchBox'), Keys.chord(Keys.ENTER))

 //   WebUI.delay(3)

//    WebUI.click(findTestObject('Object Repository/Submit Education Awards/span_Select Education Program'))

//    WebUI.delay(3)

    'Select Level 3 Option'
//    if (WebUI.verifyElementVisible(findTestObject('Object Repository/Submit Education Awards/level03_Option'))) {
//        WebUI.click(findTestObject('Object Repository/Submit Education Awards/level03_Option'))

//        WebUI.scrollToPosition(99999, 99999)

//        WebUI.click(findTestObject('Object Repository/Submit Education Awards/button_Yes'))

//        WebUI.sendKeys(findTestObject('Object Repository/Submit Education Awards/input_employerName'), GlobalVariable.TestData[
 //           'PathwayMemberName'])

//        WebUI.sendKeys(findTestObject('Object Repository/Submit Education Awards/input_emailID'), GlobalVariable.TestData[
 //           'PathwayMemberEmail'])

//        WebUI.clearText(findTestObject('Object Repository/Submit Education Awards/input_employerName'))

//        WebUI.clearText(findTestObject('Object Repository/Submit Education Awards/input_emailID'))

//        WebUI.verifyElementVisible(findTestObject('Object Repository/Submit Education Awards/validation_Message'))

//        WebUI.sendKeys(findTestObject('Object Repository/Submit Education Awards/input_employerName'), GlobalVariable.TestData[
//            'PathwayMemberName'])

//        WebUI.sendKeys(findTestObject('Object Repository/Submit Education Awards/input_emailID'), GlobalVariable.TestData[
//            'PathwayMemberEmail'])

//        WebUI.click(findTestObject('Object Repository/Submit Education Awards/button_ReviewAwardSubmit'))

//        WebUI.click(findTestObject('Object Repository/Submit Education Awards/button_SubmitAward'))

//        WebUI.click(findTestObject('Object Repository/Submit Education Awards/button_SubmitAnotherAwards'))
//    }
    
//    WebUI.delay(3)

//    WebUI.click(findTestObject('Object Repository/Submit Education Awards/span_Select Member'))

//    WebUI.sendKeys(findTestObject('Object Repository/ClubCentral/Eligibility Assistant/input_searchBox'), GlobalVariable.TestData[
//        'PathwayMemberID'])

//    WebUI.sendKeys(findTestObject('Object Repository/ClubCentral/Eligibility Assistant/input_searchBox'), Keys.chord(Keys.ENTER))

//    WebUI.delay(3)

//    WebUI.click(findTestObject('Object Repository/Submit Education Awards/span_Select Education Program'))

//    WebUI.delay(3)

    'Select Level 4 Option'
//    if (WebUI.verifyElementVisible(findTestObject('Object Repository/Submit Education Awards/level04_Option'))) {
//        WebUI.click(findTestObject('Object Repository/Submit Education Awards/level04_Option'))

//        WebUI.scrollToPosition(99999, 99999)

//        WebUI.click(findTestObject('Object Repository/Submit Education Awards/button_No'))

//        WebUI.click(findTestObject('Object Repository/Submit Education Awards/button_ReviewAwardSubmit'))

//        WebUI.click(findTestObject('Object Repository/Submit Education Awards/button_SubmitAward'))

//        WebUI.click(findTestObject('Object Repository/Submit Education Awards/button_SubmitAnotherAwards'))
//    }
    
//    WebUI.delay(3)

//    WebUI.click(findTestObject('Object Repository/Submit Education Awards/span_Select Member'))

//    WebUI.sendKeys(findTestObject('Object Repository/ClubCentral/Eligibility Assistant/input_searchBox'), GlobalVariable.TestData[
//        'PathwayMemberID'])

//    WebUI.sendKeys(findTestObject('Object Repository/ClubCentral/Eligibility Assistant/input_searchBox'), Keys.chord(Keys.ENTER))

//    WebUI.delay(3)

//    WebUI.click(findTestObject('Object Repository/Submit Education Awards/span_Select Education Program'))

//    WebUI.delay(3)

    'Select Level 5 Option'
//    if (WebUI.verifyElementVisible(findTestObject('Object Repository/Submit Education Awards/level05_Option'))) {
//        WebUI.click(findTestObject('Object Repository/Submit Education Awards/level05_Option'))

 //       WebUI.scrollToPosition(99999, 99999)

 //       WebUI.click(findTestObject('Object Repository/Submit Education Awards/button_No'))

 //       WebUI.click(findTestObject('Object Repository/Submit Education Awards/button_ReviewAwardSubmit'))

//        WebUI.click(findTestObject('Object Repository/Submit Education Awards/button_SubmitAward'))

//        WebUI.click(findTestObject('Object Repository/Submit Education Awards/button_SubmitAnotherAwards'))
//    }
    
 //   WebUI.delay(3)

//    WebUI.click(findTestObject('Object Repository/Submit Education Awards/span_Select Member'))

 //   WebUI.sendKeys(findTestObject('Object Repository/ClubCentral/Eligibility Assistant/input_searchBox'), GlobalVariable.TestData[
  //      'PathwayMemberID'])	

//    WebUI.sendKeys(findTestObject('Object Repository/ClubCentral/Eligibility Assistant/input_searchBox'), Keys.chord(Keys.ENTER))

 //   WebUI.delay(3)

  //  WebUI.click(findTestObject('Object Repository/Submit Education Awards/span_Select Education Program'))

   /* WebUI.delay(3)

    'Pathway mentor award'
    if (WebUI.verifyElementVisible(findTestObject('Submit Education Awards/ClubCentral_Option'))) {
        WebUI.click(findTestObject('Submit Education Awards/ClubCentral_Option'))

        WebUI.click(findTestObject('Object Repository/Submit Education Awards/button_ReviewAwardSubmit'))

        WebUI.click(findTestObject('Object Repository/Submit Education Awards/button_SubmitAward'))

        WebUI.click(findTestObject('Object Repository/Submit Education Awards/button_SubmitAnotherAwards'))
    }
    
    WebUI.click(findTestObject('Object Repository/Submit Education Awards/span_Select Member'))

    WebUI.sendKeys(findTestObject('Object Repository/ClubCentral/Eligibility Assistant/input_searchBox'), GlobalVariable.TestData[
        'PathwayMemberID'])

    WebUI.sendKeys(findTestObject('Object Repository/ClubCentral/Eligibility Assistant/input_searchBox'), Keys.chord(Keys.ENTER))
	
	WebUI.click(findTestObject('Object Repository/Submit Education Awards/span_Select Education Program'))*/
	

    if (WebUI.verifyElementVisible(findTestObject('Submit Education Awards/ClubCentral_Option'))) {
        GlobalVariable.vartestresult = 'PASS'

        GlobalVariable.varpassremarks = 'User Successfully assign all level to member for one pathway.'
    } else {
        GlobalVariable.vartestresult = 'FAIL'

        GlobalVariable.varfailremarks = 'User unable assign education level to member.'
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