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
import org.junit.After
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

    
    WebUI.delay(3)

    WebUI.click(findTestObject('Object Repository/Submit Education Awards/span_Select Member'))

    WebUI.sendKeys(findTestObject('Object Repository/ClubCentral/Eligibility Assistant/input_searchBox'), "PN-07451980")

    WebUI.sendKeys(findTestObject('Object Repository/ClubCentral/Eligibility Assistant/input_searchBox'), Keys.chord(Keys.ENTER))

    WebUI.delay(3)

    WebUI.click(findTestObject('Object Repository/Submit Education Awards/span_Select Education Program'))

    WebUI.delay(3)

    'Pathway mentor award'
    if (WebUI.verifyElementVisible( findTestObject('Object Repository/Submit Education Awards/PathwayDTM_Option'))) {
        WebUI.click( findTestObject('Object Repository/Submit Education Awards/PathwayDTM_Option') )
		
		'Select First path'
		WebUI.sendKeys( findTestObject('Object Repository/Submit Education Awards/PD_SelectFirstPath') , Keys.chord(Keys.ARROW_DOWN))
		WebUI.delay(1)
		WebUI.sendKeys(null, Keys.chord(Keys.ENTER))
        //WebUI.sendKeys( findTestObject('Object Repository/Submit Education Awards/PD_SelectFirstPath'),  Keys.chord(Keys.ENTER))
		
		'Select Second path'
		WebUI.sendKeys( findTestObject('Object Repository/Submit Education Awards/PD_SelectSecondPath')  , Keys.chord(Keys.ARROW_DOWN))
		WebUI.delay(1)
		WebUI.sendKeys( findTestObject('Object Repository/Submit Education Awards/PD_SelectSecondPath') ,  Keys.chord(Keys.ENTER))
		
		'Enter date for Distringuished Toastmaster Project'
		WebUI.sendKeys( findTestObject('Object Repository/Submit Education Awards/Input_DateForDistringuishedToastmasterProject') , "7/17/2022")
		
		'Select Club Officer Role Completion'
		WebUI.sendKeys( findTestObject('Object Repository/Submit Education Awards/select_ClubOfficerRoleCompletion') , Keys.chord(Keys.ARROW_DOWN))
		WebUI.delay(1)
		WebUI.sendKeys(findTestObject('Object Repository/Submit Education Awards/select_ClubOfficerRoleCompletion')  ,  Keys.chord(Keys.ENTER))
		
		'Enter date for club success plan'
		WebUI.sendKeys( findTestObject('Object Repository/Submit Education Awards/Input_DateForClubSuccessPlan') , "7/17/2022")
		
		'Enter date for club officer training'
		WebUI.sendKeys( findTestObject('Object Repository/Submit Education Awards/Input_DateForClubOfficerTraining')  , "7/17/2022")
		
		'Enter data for Office Held'
		WebUI.sendKeys( findTestObject('Object Repository/Submit Education Awards/Input_OfficeHeld')  , "New Club Details")
		
		'Enter District Number'
		WebUI.sendKeys( findTestObject('Object Repository/Submit Education Awards/Input_DistrictNumber') , "DT-0016")
		
		'Enter Start date and End date'
		WebUI.clearText(findTestObject('Object Repository/Submit Education Awards/Input_FromPeriodDate')   )
		WebUI.sendKeys( findTestObject('Object Repository/Submit Education Awards/Input_FromPeriodDate') , "6/15/2022")
		WebUI.clearText(findTestObject('Object Repository/Submit Education Awards/Input_ToPeriodDate')  )
		WebUI.sendKeys( findTestObject('Object Repository/Submit Education Awards/Input_ToPeriodDate') , "6/25/2022")
        
		'Select Support Role'
		WebUI.sendKeys( findTestObject('Object Repository/Submit Education Awards/select_SupportRole') , Keys.chord(Keys.ARROW_DOWN))
		WebUI.delay(1)
		WebUI.sendKeys( findTestObject('Object Repository/Submit Education Awards/select_SupportRole'),  Keys.chord(Keys.ENTER))
		
		'Enter ClubName'
		WebUI.sendKeys( findTestObject('Object Repository/Submit Education Awards/Input_ClubName') , "Toastmaster CICMAC")
		
		'Enter Club No'
		WebUI.sendKeys( findTestObject('Object Repository/Submit Education Awards/Input_ClunNo') , "CB-07022094")
		 
		'Enter Appointed Date'
		WebUI.sendKeys( findTestObject('Object Repository/Submit Education Awards/Input_DateAppointed') , "7/17/2022")
		
		'Select club support for Club Sponsor'
		WebUI.sendKeys( findTestObject('Object Repository/Submit Education Awards/select_SupportRoleForClubSponsor') , Keys.chord(Keys.ARROW_DOWN))
		WebUI.delay(1)
		WebUI.sendKeys( findTestObject('Object Repository/Submit Education Awards/select_SupportRoleForClubSponsor'),  Keys.chord(Keys.ENTER))
		'Enter New Club Name'
		WebUI.sendKeys( findTestObject('Object Repository/Submit Education Awards/Input_NewClubName') , "A.C.T.S. Club")
		
		'Enter New Club Number'
		WebUI.sendKeys( findTestObject('Object Repository/Submit Education Awards/Input_NewClubNo') , "CB-00000416")
	
		'Enter Date Chartered'
		WebUI.sendKeys( findTestObject('Object Repository/Submit Education Awards/Input_DateChartered') , "7/15/2022")
		
		
			
		WebUI.click(findTestObject('Object Repository/Submit Education Awards/button_No'))
		
		WebUI.click(findTestObject('Object Repository/Submit Education Awards/button_ReviewAwardSubmit'))

        WebUI.click(findTestObject('Object Repository/Submit Education Awards/button_SubmitAward'))

        WebUI.click(findTestObject('Object Repository/Submit Education Awards/button_SubmitAnotherAwards'))
    }
    
    WebUI.click(findTestObject('Object Repository/Submit Education Awards/span_Select Member'))

    WebUI.sendKeys(findTestObject('Object Repository/ClubCentral/Eligibility Assistant/input_searchBox'),"PN-07451980")

    WebUI.sendKeys(findTestObject('Object Repository/ClubCentral/Eligibility Assistant/input_searchBox'), Keys.chord(Keys.ENTER))

    if (WebUI.verifyElementVisible(findTestObject('Object Repository/Submit Education Awards/Alert_Message'))) {
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