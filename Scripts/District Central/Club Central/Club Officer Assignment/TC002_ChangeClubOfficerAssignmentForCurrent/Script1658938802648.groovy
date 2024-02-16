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
import org.junit.After
import org.openqa.selenium.Capabilities as Capabilities
import org.openqa.selenium.Dimension as Dimension
import org.openqa.selenium.remote.RemoteWebDriver as RemoteWebDriver
import com.kms.katalon.core.webui.common.WebUICommonScripts as WebUICommonScripts
import com.kms.katalon.core.webui.common.WebUiCommonHelper as WebUiCommonHelper
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import org.openqa.selenium.support.ui.Select


try {
	CustomKeywords.'com.application.DateTime.startTime'()
	
	'Verify link page open'
	if(WebUI.verifyElementPresent( findTestObject('Object Repository/Club_Officer_Assigment/CurrentMember/link_ASCO')  , 30)) {
		
		WebUI.click(findTestObject('Object Repository/Club_Officer_Assigment/CurrentMember/link_ASCO')  )
		
		 if(WebUI.verifyElementVisible( findTestObject('Object Repository/ASCO/h1_Addendum of Standard Club Options') )) {
			 
			WebUI.back() 
		 }
		 else {
			 WebUI.back()
		 }
	}
	CustomKeywords.'com.application.DPOSCustomKeyword.needSomeHelpCloseButton'()
	
	'Verify Disable Button for all Start Date'
	
	WebUI.verifyElementVisible(findTestObject('Object Repository/Club_Officer_Assigment/CurrentMember/disableStartDate_President')  )
	WebUI.verifyElementVisible(findTestObject('Object Repository/Club_Officer_Assigment/CurrentMember/disableStartDate_VicePresidentEducation')  )
	WebUI.verifyElementVisible(findTestObject('Object Repository/Club_Officer_Assigment/CurrentMember/disableStartDate_VicePresidentMembership')  )
	WebUI.verifyElementVisible(findTestObject('Object Repository/Club_Officer_Assigment/CurrentMember/disableStartDate_VicePresidentPublicRelations')  )
	WebUI.verifyElementVisible(findTestObject('Object Repository/Club_Officer_Assigment/CurrentMember/disableStartDate_Secretary')  )
	WebUI.verifyElementVisible(findTestObject('Object Repository/Club_Officer_Assigment/CurrentMember/disableStartDate_Treasurer')  )
	WebUI.verifyElementVisible(findTestObject('Object Repository/Club_Officer_Assigment/CurrentMember/disableStartDate_SergentsAtAgent')  )
	
	
	
	'Verify for not save member select for President , Vice President Education , and Vice President Membership'
	WebDriver driver = DriverFactory.getWebDriver()
	Select president = new Select(driver.findElement(By.xpath("//select[@id='currentCPRESDropDown']")));
	String presidentName = president.getFirstSelectedOption().getText();
	
 	'Send same member to VP Education, Secretary'
	   'Get Text For Vice President Education'
	 WebDriver driver1 = DriverFactory.getWebDriver()
	 Select VPEducation = new Select(driver1.findElement(By.xpath("//select[@id='currentCVPEDropDown']")));
	 String VPEducationName = VPEducation.getFirstSelectedOption().getText();
    //
	 'Get Text For Vice President Membership'
	 WebDriver driver2 = DriverFactory.getWebDriver()
	 Select VPMembership = new Select(driver2.findElement(By.xpath("//select[@id='currentCVPEDropDown']")));
	 String VPMembershipName = VPMembership.getFirstSelectedOption().getText();

	 	 if (VPEducationName!=presidentName) {
		 WebUI.sendKeys(findTestObject('Object Repository/Club_Officer_Assigment/CurrentMember/select_VicePresidentEducation')   , presidentName)
		 WebUI.click(findTestObject('Object Repository/Club_Officer_Assigment/CurrentMember/select_MasterStartDate') )
	 }
    
	WebUI.sendKeys(findTestObject('Object Repository/Club_Officer_Assigment/CurrentMember/select_Secretary') , presidentName)
	WebUI.click( findTestObject('Object Repository/Club_Officer_Assigment/CurrentMember/select_MasterStartDate') )
	
	'Click on Save Button'
	WebUI.click( findTestObject('Object Repository/Club_Officer_Assigment/CurrentMember/input_Addendum of Standard Club Options_frmCurrentSubmit')  )
	
	
	'Verify it'
	if(WebUI.verifyElementVisible(findTestObject('Object Repository/Club_Officer_Assigment/CurrentMember/validatiion_assignADifferentMember')  )) {
		
		System.out.println("............................Element Successfully Visible.............................");
	}
	
	///////////////////////////////////////////////////////////////////////////////////////////////////
	
	
	
	
	"Select President"
	WebUI.click(findTestObject('Object Repository/Club_Officer_Assigment/CurrentMember/select_President')  )
	WebUI.click(findTestObject('Object Repository/Club_Officer_Assigment/CurrentMember/MemberOption/President_Option_1')  )
	'Select Date'
	WebUI.click( findTestObject('Object Repository/Club_Officer_Assigment/CurrentMember/select_MasterStartDate') ) 
	
	"Select Vice President Education"
	WebUI.click(findTestObject('Object Repository/Club_Officer_Assigment/CurrentMember/select_VicePresidentEducation')  )
	WebUI.click(findTestObject('Object Repository/Club_Officer_Assigment/CurrentMember/MemberOption/VicePresidentEducation_Option_1')  )
	'Select Date'
	WebUI.click( findTestObject('Object Repository/Club_Officer_Assigment/CurrentMember/select_MasterStartDate') ) 
	
	"Select Vice President Membership"
	WebUI.click( findTestObject('Object Repository/Club_Officer_Assigment/CurrentMember/select_VicePrisidentMembership')  )
	WebUI.click(findTestObject('Object Repository/Club_Officer_Assigment/CurrentMember/MemberOption/VicePresidentMembership_Option_1')  )
	'Select Date'
    WebUI.click( findTestObject('Object Repository/Club_Officer_Assigment/CurrentMember/select_MasterStartDate') ) 
	
	"Select Vice Pesident Public Relations"
	WebUI.click(findTestObject('Object Repository/Club_Officer_Assigment/CurrentMember/select_VicePresidentPublicRelations')  )
	WebUI.click(findTestObject('Object Repository/Club_Officer_Assigment/CurrentMember/MemberOption/VicePresidentPublicRelations_Option_1')  )
	'Select Date'
	WebUI.click( findTestObject('Object Repository/Club_Officer_Assigment/CurrentMember/select_MasterStartDate') ) 
	
	"Select Secretary"
	WebUI.click(findTestObject('Object Repository/Club_Officer_Assigment/CurrentMember/select_Secretary')  )
	WebUI.click(findTestObject('Object Repository/Club_Officer_Assigment/CurrentMember/MemberOption/Secretary_Option_1')  )
	'Select Date'
	WebUI.click( findTestObject('Object Repository/Club_Officer_Assigment/CurrentMember/select_MasterStartDate') ) 
	
	WebUI.scrollToPosition(99999, 99999)
	
	"Select Treasurer"
	WebUI.click(findTestObject('Object Repository/Club_Officer_Assigment/CurrentMember/select_Treasurer')  )
	WebUI.click(findTestObject('Object Repository/Club_Officer_Assigment/CurrentMember/MemberOption/Treasurer_Option_1')  )
	'Select Date'
	WebUI.click( findTestObject('Object Repository/Club_Officer_Assigment/CurrentMember/select_MasterStartDate') ) 
	
	"Select Sergeant at Arms"
	WebUI.click(findTestObject('Object Repository/Club_Officer_Assigment/CurrentMember/select_SergeantAtArms')  )
	WebUI.click(findTestObject('Object Repository/Club_Officer_Assigment/CurrentMember/MemberOption/SergeantAtarma_Option_1')  )
	'Select Date'
	WebUI.click(findTestObject('Object Repository/Club_Officer_Assigment/CurrentMember/select_MasterStartDate') ) 
	
	"Click on Save Button"
	
	WebUI.click( findTestObject('Object Repository/Club_Officer_Assigment/CurrentMember/input_Addendum of Standard Club Options_frmCurrentSubmit')  )
 
	if(WebUI.verifyElementVisible( findTestObject('Object Repository/Club_Officer_Assigment/CurrentMember/button_Yes') )) {
		WebUI.click( findTestObject('Object Repository/Club_Officer_Assigment/CurrentMember/button_Yes') )
	}
	
	 

	if (WebUI.verifyElementVisible( findTestObject('Object Repository/ClubCentral/Club Demographics/h1_Club Demographics'))) {
  
		GlobalVariable.vartestresult = 'PASS'

		GlobalVariable.varpassremarks = 'User Successfully change the club officer assignment.'
	} else {
 
		GlobalVariable.vartestresult = 'FAIL'

		GlobalVariable.varfailremarks = 'User unable to change the club officer assugnment.'
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