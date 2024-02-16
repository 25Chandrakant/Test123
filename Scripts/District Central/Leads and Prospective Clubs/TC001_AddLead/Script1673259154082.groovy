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
	
	  String CompanyName =  "Kishan Comapny"
	  
	  String CompanyPhoneNumber = "76006 50347"

	 // Add Lead Button 
	 WebUI.click( findTestObject('Object Repository/District Central/Leads_ProspectiveClub/Leads and Prospective Clubs/a_Add Lead')  )
     
	 // Select Assign Owner
	 WebUI.click(findTestObject('District Central/Leads_ProspectiveClub/Lead Record/select_AssignedOwner')  )
	
	 //WebUI.sendKeys(  findTestObject('Object Repository/District Central/Leads_ProspectiveClub/Lead Record/input_SearchAssignOwner') , "Yvette C. Frontera")
	 WebUI.sendKeys(findTestObject('Object Repository/District Central/Leads_ProspectiveClub/Lead Record/input_SearchAssignOwner') ,  Keys.chord(  Keys.DOWN, Keys.ENTER))
	 
	                      //Stage	
	 //Initial  Contact (Qualifying)
	 WebUI.click(findTestObject('Object Repository/District Central/Leads_ProspectiveClub/Lead Record/label_Initial contact made')  )
	 WebUI.click(findTestObject('Object Repository/District Central/Leads_ProspectiveClub/Lead Record/label_Lead Qualified')  )
	
	 WebUI.sendKeys( findTestObject('Object Repository/District Central/Leads_ProspectiveClub/Lead Record/input_Initial contact made_ClubLead.InitialContactMadeDate') , GlobalVariable.TestData["InitialContactMadeDate"])
	 WebUI.sendKeys( findTestObject('Object Repository/District Central/Leads_ProspectiveClub/Lead Record/textarea_Notes_ClubLead.InitialContactNotes')  , GlobalVariable.TestData["InitialContactNotes"])
	 
	 // Pending Intro Meeting
	 WebUI.click(findTestObject('Object Repository/District Central/Leads_ProspectiveClub/Lead Record/label_Intro meeting date')  )
	 WebUI.click(findTestObject('Object Repository/District Central/Leads_ProspectiveClub/Lead Record/label_Skip meeting')  )
	 
	 WebUI.sendKeys( findTestObject('Object Repository/District Central/Leads_ProspectiveClub/Lead Record/input_Intro meeting date_ClubLead.IntroMeetingScheduledDate') , GlobalVariable.TestData["IntroMeetingScheduledDate"])
	 WebUI.sendKeys(findTestObject('Object Repository/District Central/Leads_ProspectiveClub/Lead Record/textarea_Notes_ClubLead.IntroMeetingNotes') , GlobalVariable.TestData["IntroMeetingNotes"])
	 
	 //Pending demo meeting
	 WebUI.click( findTestObject('Object Repository/District Central/Leads_ProspectiveClub/Lead Record/label_Demo meeting date')  )
	 WebUI.click( findTestObject('Object Repository/District Central/Leads_ProspectiveClub/Lead Record/checkbox_SkipMeetingForDemoMeeting')  )
	 
	 WebUI.sendKeys( findTestObject('Object Repository/District Central/Leads_ProspectiveClub/Lead Record/input_Demo meeting date_ClubLead.DemoMeetingScheduledDate')  , GlobalVariable.TestData["DemoMeetingScheduledDate"])
	 WebUI.sendKeys( findTestObject('Object Repository/District Central/Leads_ProspectiveClub/Lead Record/textarea_Notes_ClubLead.DemoMeetingNotes')  , GlobalVariable.TestData["DemoMeetingNotes"])
	 
	 //Pending  Application
	 WebUI.click(  findTestObject('Object Repository/District Central/Leads_ProspectiveClub/Lead Record/label_Application submitted') ) 	
	 
	 WebUI.sendKeys(findTestObject('Object Repository/District Central/Leads_ProspectiveClub/Lead Record/input_Application submitted_ClubLead.ApplicationSubmittedDate')  , GlobalVariable.TestData["ApplicationSubmittedDate"])
	 WebUI.sendKeys(findTestObject('Object Repository/District Central/Leads_ProspectiveClub/Lead Record/textarea_Notes_ClubLead.ApplicationSubmittedNotes')  , GlobalVariable.TestData["ApplicationSubmittedNotes"])
	 
	       // Contact Information
	//Primary Contact Information
	WebUI.sendKeys( findTestObject('Object Repository/District Central/Leads_ProspectiveClub/Lead Record/input_Contact First Name_ClubLead.Contact.FirstName') , GlobalVariable.TestData["ClubLeadFirstName"]) 
	WebUI.sendKeys( findTestObject('Object Repository/District Central/Leads_ProspectiveClub/Lead Record/input_Contact Last Name_ClubLead.Contact.LastName')  , GlobalVariable.TestData["ClubLeadastName"])
	
	WebUI.sendKeys( findTestObject('Object Repository/District Central/Leads_ProspectiveClub/Lead Record/input_land Islands_PrimaryPhone') , GlobalVariable.TestData["ClubLeadCompanyPhoneNumber"])
	
	//validation mesage verify 
	
	WebUI.click(  findTestObject('Object Repository/District Central/Leads_ProspectiveClub/Lead Record/button_Save')  )
	
	// Enter Invalid email id
	WebUI.sendKeys( findTestObject('Object Repository/District Central/Leads_ProspectiveClub/Lead Record/input__ClubLead.Contact.Email')  , "KPgmail.com")
	
	WebUI.verifyElementPresent(findTestObject('Object Repository/District Central/Leads_ProspectiveClub/Lead Record/validation_email') , 0)
	
	// Enter valid emai address
	WebUI.click(  findTestObject('Object Repository/District Central/Leads_ProspectiveClub/Lead Record/input__ClubLead.Contact.Email')  )
	WebUI.clearText(   findTestObject('Object Repository/District Central/Leads_ProspectiveClub/Lead Record/input__ClubLead.Contact.Email') )
	WebUI.sendKeys( findTestObject('Object Repository/District Central/Leads_ProspectiveClub/Lead Record/input__ClubLead.Contact.Email')  , GlobalVariable.TestData["ClubLeadEmail"])
	
	//Secondary Contact Information
	WebUI.sendKeys( findTestObject('Object Repository/District Central/Leads_ProspectiveClub/Lead Record/input_Contact First Name_ClubLead.SecondaryContact.FirstName') , GlobalVariable.TestData["ClubLeadSecondryFirstName"])
	WebUI.sendKeys( findTestObject('Object Repository/District Central/Leads_ProspectiveClub/Lead Record/input_Contact Last Name_ClubLead.SecondaryContact.LastName') , GlobalVariable.TestData["ClubLeadSecondryLastName"])
    
	WebUI.sendKeys(findTestObject('Object Repository/District Central/Leads_ProspectiveClub/Lead Record/input_land Islands_SecondaryPhone') , GlobalVariable.TestData["ClubLeadSeconaryPhone"])
	WebUI.sendKeys( findTestObject('Object Repository/District Central/Leads_ProspectiveClub/Lead Record/input_Email_ClubLead.SecondaryContact.Email') , GlobalVariable.TestData["ClubLeadSecondEmail"])
	
	
	     // Club Information
	
	WebUI.click( findTestObject('Object Repository/District Central/Leads_ProspectiveClub/Lead Record/link_ClubInformation')  )
	//Club Information
	WebUI.sendKeys( findTestObject('Object Repository/District Central/Leads_ProspectiveClub/Lead Record/select_ClubType') , GlobalVariable.TestData["ClubLeadClubType"])
	WebUI.sendKeys( findTestObject('Object Repository/District Central/Leads_ProspectiveClub/Lead Record/select_Select Country') , GlobalVariable.TestData["ClubLeadCountry"])
	
	WebUI.sendKeys(findTestObject('Object Repository/District Central/Leads_ProspectiveClub/Lead Record/input__MailingAddress.Address.Street')  , GlobalVariable.TestData["ClubLeadAddressStreet"])
	WebUI.sendKeys( findTestObject('Object Repository/District Central/Leads_ProspectiveClub/Lead Record/input__MailingAddress.Address.City') , GlobalVariable.TestData["ClubLeadAddressCity"])
	
	WebUI.sendKeys( findTestObject('Object Repository/District Central/Leads_ProspectiveClub/Lead Record/select_SelectStates') ,  GlobalVariable.TestData["ClubLeadState"])
	WebUI.sendKeys( findTestObject('Object Repository/District Central/Leads_ProspectiveClub/Lead Record/input__MailingAddress.Address.PostalCode') , GlobalVariable.TestData["ClubLeadPostalCode"])
	
	WebUI.sendKeys( findTestObject('Object Repository/District Central/Leads_ProspectiveClub/Lead Record/input_land Islands_txtClubPhone') , GlobalVariable.TestData["IslandPhone"])
	
	
	//Supporting Company/Organization Information
	
	WebUI.sendKeys( findTestObject('Object Repository/District Central/Leads_ProspectiveClub/Lead Record/input_Company Sponsor_ClubLead.CompanySponsorName') ,GlobalVariable.TestData["ClubLeadSponsorName"])
	WebUI.sendKeys( findTestObject('Object Repository/District Central/Leads_ProspectiveClub/Lead Record/input_Corporate Contact Name_ClubLead.CorporateChampionName') , GlobalVariable.TestData["CorporateChampionName"])
	
	WebUI.sendKeys( findTestObject('Object Repository/District Central/Leads_ProspectiveClub/Lead Record/input_Email_ClubLead.SponsorEmail'), GlobalVariable.TestData["ClubLeadSponsorEmail"])
	WebUI.sendKeys( findTestObject('Object Repository/District Central/Leads_ProspectiveClub/Lead Record/input_Website_ClubLead.CompanySponsorWebsite'), GlobalVariable.TestData["CompanySponsorName"])
	
	WebUI.sendKeys( findTestObject('Object Repository/District Central/Leads_ProspectiveClub/Lead Record/input_land Islands_CompanyPhone') ,  GlobalVariable.TestData["IslandCompanyPhone"])
	WebUI.sendKeys( findTestObject('Object Repository/District Central/Leads_ProspectiveClub/Lead Record/select_Restricted') ,  GlobalVariable.TestData["Other"])
	
	WebUI.sendKeys( findTestObject('Object Repository/District Central/Leads_ProspectiveClub/Lead Record/textarea_Comments_ClubLead.Comments') , GlobalVariable.TestData["ClubLeadComments"])
	
	WebUI.click(findTestObject('Object Repository/District Central/Leads_ProspectiveClub/Lead Record/button_Save')  )
	
	// Click on Close pop up button
	WebUI.click( findTestObject('Object Repository/District Central/Leads_ProspectiveClub/Lead Record--Button/i_Comments_fa fa-close')  )
	
	// Click on Submit button
	
	WebUI.click( findTestObject('Object Repository/District Central/Leads_ProspectiveClub/Lead Record--Button/button_Form Submitted')  )
	
	// Click on collaspe button
	
	WebUI.click( findTestObject('Object Repository/District Central/Leads_ProspectiveClub/Leads and Prospective Clubs/td_expandButton')  )
	
	String cName =  WebUI.getText( findTestObject('Object Repository/District Central/Leads_ProspectiveClub/Leads and Prospective Clubs/td_companyName')  )
	String cPhoneNumber = WebUI.getText( findTestObject('Object Repository/District Central/Leads_ProspectiveClub/Leads and Prospective Clubs/td_companyPhoneNumber')  )
	
	print("..........................................."+cName)
	print("..........................................."+cPhoneNumber)
	
	if (cName==CompanyName&&cPhoneNumber.contains(CompanyPhoneNumber)) {
		
		print("...........................................PASS")
        GlobalVariable.vartestresult = 'PASS'

        GlobalVariable.varpassremarks = 'User Successfully add new lead.'
    } else {
        print('FAIL...............................')

        GlobalVariable.vartestresult = 'FAIL'

        GlobalVariable.varfailremarks = 'User unable add new lead.'
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