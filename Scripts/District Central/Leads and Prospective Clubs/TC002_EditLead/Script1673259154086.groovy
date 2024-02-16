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
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.By as By
import org.openqa.selenium.WebElement as WebElement
import java.net.URL as URL
import org.jsoup.Jsoup as Jsoup
import org.jsoup.nodes.Document as Document
import org.jsoup.nodes.Element as Element
import org.jsoup.select.Elements as Elements
import org.openqa.selenium.Capabilities as Capabilities
import org.openqa.selenium.Dimension as Dimension
import org.openqa.selenium.remote.RemoteWebDriver as RemoteWebDriver
import com.kms.katalon.core.webui.common.WebUICommonScripts as WebUICommonScripts
import com.kms.katalon.core.webui.common.WebUiCommonHelper as WebUiCommonHelper
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory

try {
    CustomKeywords.'com.application.DateTime.startTime'()
	CustomKeywords.'com.application.DPOSCustomKeyword.needSomeHelpCloseButton'()
	
	
	// Search record
    WebUI.sendKeys(findTestObject('Object Repository/District Central/Leads_ProspectiveClub/Leads and Prospective Clubs/input_Search_form-control input-sm') , "KP@gmail.com")
    
	// Click on Edit button
	WebUI.click(  findTestObject('Object Repository/District Central/Leads_ProspectiveClub/Leads and Prospective Clubs/button_Edit') ) 
	
	// clear date inputbox
	WebUI.clearText( findTestObject('Object Repository/District Central/Leads_ProspectiveClub/Lead Record/input_Initial contact made_ClubLead.InitialContactMadeDate'), FailureHandling.OPTIONAL)
	WebUI.clearText( findTestObject('Object Repository/District Central/Leads_ProspectiveClub/Lead Record/input_Intro meeting date_ClubLead.IntroMeetingScheduledDate'), FailureHandling.OPTIONAL)
	WebUI.clearText( findTestObject('Object Repository/District Central/Leads_ProspectiveClub/Lead Record/input_Demo meeting date_ClubLead.DemoMeetingScheduledDate'), FailureHandling.OPTIONAL)
	WebUI.clearText( findTestObject('Object Repository/District Central/Leads_ProspectiveClub/Lead Record/input_Application submitted_ClubLead.ApplicationSubmittedDate') , FailureHandling.OPTIONAL)
	
	//Enter Date
	
	WebUI.sendKeys( findTestObject('Object Repository/District Central/Leads_ProspectiveClub/Lead Record/input_Initial contact made_ClubLead.InitialContactMadeDate') , "06/10/2022")
	WebUI.sendKeys( findTestObject('Object Repository/District Central/Leads_ProspectiveClub/Lead Record/input_Intro meeting date_ClubLead.IntroMeetingScheduledDate') , "06/11/2022")
	WebUI.sendKeys( findTestObject('Object Repository/District Central/Leads_ProspectiveClub/Lead Record/input_Demo meeting date_ClubLead.DemoMeetingScheduledDate') , "06/12/2022")
	WebUI.sendKeys( findTestObject('Object Repository/District Central/Leads_ProspectiveClub/Lead Record/input_Application submitted_ClubLead.ApplicationSubmittedDate') , "06/13/2022")
	
	// click on  save button
	WebUI.click( findTestObject('Object Repository/District Central/Leads_ProspectiveClub/Lead Record/button_Save')  )
	
	// Click on pop up close button
	CustomKeywords.'com.application.DPOSCustomKeyword.needSomeHelpCloseButton'()
	WebUI.delay(3)
	WebUI.click( findTestObject('Object Repository/District Central/Leads_ProspectiveClub/Lead Record--Button/i_Comments_fa fa-close'))
	
	// Click  on submit form
	WebUI.click( findTestObject('Object Repository/District Central/Leads_ProspectiveClub/Lead Record--Button/button_Form Submitted')  )
	
    if (WebUI.verifyElementVisible( findTestObject('Object Repository/District Central/Leads_ProspectiveClub/Leads and Prospective Clubs/select_View All'))  ) {
		
		print("successfully Pass test case.........................................")
		CustomKeywords.'com.application.DPOSCustomKeyword.needSomeHelpCloseButton'()
		
        GlobalVariable.vartestresult = 'PASS'

        GlobalVariable.varpassremarks = 'User Successfully landing on Leads and prospective clubs page.'
    } else {
        print('FAIL...............................')

        GlobalVariable.vartestresult = 'FAIL'

        GlobalVariable.varfailremarks = 'User unable go to Leads and prospective clubs page.'
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