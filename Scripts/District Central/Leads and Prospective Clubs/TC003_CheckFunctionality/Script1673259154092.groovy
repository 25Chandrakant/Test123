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
	

     WebUI.sendKeys( findTestObject('Object Repository/District Central/Leads_ProspectiveClub/Leads and Prospective Clubs/select_View All') , "Initial Contact")
    WebUI.click( findTestObject('Object Repository/District Central/Leads_ProspectiveClub/Leads and Prospective Clubs/button_Export') )
	
	WebUI.sendKeys( findTestObject('Object Repository/District Central/Leads_ProspectiveClub/Leads and Prospective Clubs/select_View All') , "Pending Intro Meeting")
	WebUI.click( findTestObject('Object Repository/District Central/Leads_ProspectiveClub/Leads and Prospective Clubs/button_Export') )
	
	WebUI.sendKeys( findTestObject('Object Repository/District Central/Leads_ProspectiveClub/Leads and Prospective Clubs/select_View All') , "Pending Demo Meeting")
	WebUI.click( findTestObject('Object Repository/District Central/Leads_ProspectiveClub/Leads and Prospective Clubs/button_Export') )
	
	WebUI.sendKeys( findTestObject('Object Repository/District Central/Leads_ProspectiveClub/Leads and Prospective Clubs/select_View All') , "Pending Application")
	WebUI.click( findTestObject('Object Repository/District Central/Leads_ProspectiveClub/Leads and Prospective Clubs/button_Export') )
	
	WebUI.sendKeys( findTestObject('Object Repository/District Central/Leads_ProspectiveClub/Leads and Prospective Clubs/select_View All') , "Closed")
	WebUI.click( findTestObject('Object Repository/District Central/Leads_ProspectiveClub/Leads and Prospective Clubs/button_Export') )
	
	WebUI.sendKeys( findTestObject('Object Repository/District Central/Leads_ProspectiveClub/Leads and Prospective Clubs/select_View All') , "Converted")
	WebUI.click( findTestObject('Object Repository/District Central/Leads_ProspectiveClub/Leads and Prospective Clubs/button_Export') )
	
	WebUI.sendKeys( findTestObject('Object Repository/District Central/Leads_ProspectiveClub/Leads and Prospective Clubs/select_View All') , "View All")
	WebUI.click( findTestObject('Object Repository/District Central/Leads_ProspectiveClub/Leads and Prospective Clubs/button_Export') )
 
	// Search 
	
	String setText = "Kishan Patel"
	WebUI.sendKeys  ( findTestObject('Object Repository/District Central/Leads_ProspectiveClub/Leads and Prospective Clubs/input_Search_form-control input-sm')  , setText) 
	
	String getText = WebUI.getText(findTestObject('Object Repository/District Central/Leads_ProspectiveClub/Leads and Prospective Clubs/td_PrimaryContact')  )
	WebUI.verifyMatch(setText, getText, false)
	WebUI.delay(3)
	WebUI.clearText( findTestObject('Object Repository/District Central/Leads_ProspectiveClub/Leads and Prospective Clubs/input_Search_form-control input-sm')  )
	
	WebUI.sendKeys( findTestObject('Object Repository/District Central/Leads_ProspectiveClub/Leads and Prospective Clubs/input_Search_form-control input-sm') , Keys.chord(Keys.ENTER))
	WebUI.delay(3)
	//Sort
	
	WebUI.click( findTestObject('Object Repository/District Central/Leads_ProspectiveClub/Leads and Prospective Clubs/td_Click_PrimaryContact')  )
	
	String attribute = WebUI.getAttribute(findTestObject('Object Repository/District Central/Leads_ProspectiveClub/Leads and Prospective Clubs/td_Click_PrimaryContact') , 'class' )
	
	WebUI.verifyMatch( attribute, "sorting_asc", false)
	
	WebUI.delay(3)
	
	WebUI.click(findTestObject('Object Repository/District Central/Leads_ProspectiveClub/Leads and Prospective Clubs/div_')  )
	WebUI.delay(3)
	WebUI.click( findTestObject('Object Repository/District Central/Leads_ProspectiveClub/Leads and Prospective Clubs/span_X')  )
	WebUI.delay(13)
	
	// delete leads
	
	WebUI.scrollToPosition(40, 50)
	//WebUI.scrollToElement( findTestObject('Object Repository/District Central/Leads_ProspectiveClub/Lead Record--Button/button_delete'), 1)
	WebUI.click( findTestObject('Object Repository/District Central/Leads_ProspectiveClub/Lead Record--Button/button_delete')  )
	WebUI.click( findTestObject('Object Repository/District Central/Leads_ProspectiveClub/Lead Record--Button/button_Countinue')  )
   
	WebUI.delay(5)
 	
	WebUI.sendKeys  ( findTestObject('Object Repository/District Central/Leads_ProspectiveClub/Leads and Prospective Clubs/input_Search_form-control input-sm')  , setText) 

		 if (WebUI.verifyElementVisible(  findTestObject('Object Repository/District Central/Leads_ProspectiveClub/Leads and Prospective Clubs/td_NO_RECORD_FOUND')  )) {
		

        GlobalVariable.vartestresult = 'PASS'

        GlobalVariable.varpassremarks = 'Successfully working all functionality .'
    } else {
        print('FAIL...............................')

        GlobalVariable.vartestresult = 'FAIL'

        GlobalVariable.varfailremarks = 'Not working some functionality.'
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