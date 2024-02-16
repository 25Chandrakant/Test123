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
	  
	  WebUI.delay(2)

	 // Add Lead Button 
	 WebUI.click( findTestObject('Object Repository/District Central/Leads_ProspectiveClub/Leads and Prospective Clubs/a_Add Lead'))
	 
	 WebUI.delay(2)
     
	 // Select Assign Owner
	 WebUI.click(findTestObject('District Central/Leads_ProspectiveClub/Lead Record/select_AssignedOwner'))
	 
	 WebUI.delay(2)
	
	 //WebUI.sendKeys(  findTestObject('Object Repository/District Central/Leads_ProspectiveClub/Lead Record/input_SearchAssignOwner') , "Yvette C. Frontera")
	 WebUI.sendKeys(findTestObject('Object Repository/District Central/Leads_ProspectiveClub/Lead Record/input_SearchAssignOwner') ,  Keys.chord(  Keys.DOWN, Keys.ENTER))
	 
	 WebUI.delay(2)
	 
	                      //Stage	
	 //Initial  Contact (Qualifying)
	 WebUI.click(findTestObject('Object Repository/District Central/Leads_ProspectiveClub/Lead Record/label_Initial contact made'))
	 
	 WebUI.delay(2)
	 
	 WebUI.click(findTestObject('Object Repository/District Central/Leads_ProspectiveClub/Lead Record/label_Lead Qualified'))
	 
	 WebUI.delay(2)
	
	 WebUI.sendKeys( findTestObject('Object Repository/District Central/Leads_ProspectiveClub/Lead Record/input_Initial contact made_ClubLead.InitialContactMadeDate') , GlobalVariable.TestData["InitialContactMadeDate"])
	 
	 WebUI.delay(1)
	 
	 WebUI.sendKeys( findTestObject('Object Repository/District Central/Leads_ProspectiveClub/Lead Record/textarea_Notes_ClubLead.InitialContactNotes')  , GlobalVariable.TestData["InitialContactNotes"])
	 
	// WebUI.delay(1)
	 
	 // Pending Intro Meeting
	// WebUI.click(findTestObject('Object Repository/District Central/Leads_ProspectiveClub/Lead Record/label_Intro meeting date'))
	 
	 WebUI.delay(2)
	 
	 WebUI.click(findTestObject('Object Repository/District Central/Leads_ProspectiveClub/Lead Record/label_Skip meeting'))
	 
	 WebUI.delay(2)
	 
	// WebUI.sendKeys( findTestObject('Object Repository/District Central/Leads_ProspectiveClub/Lead Record/input_Intro meeting date_ClubLead.IntroMeetingScheduledDate') , GlobalVariable.TestData["IntroMeetingScheduledDate"])
	 
	// WebUI.delay(1)
	 
	 WebUI.sendKeys(findTestObject('Object Repository/District Central/Leads_ProspectiveClub/Lead Record/textarea_Notes_ClubLead.IntroMeetingNotes') , GlobalVariable.TestData["IntroMeetingNotes"])
	 
	 WebUI.delay(2)
	 
	 //Pending demo meeting
	 WebUI.click( findTestObject('Object Repository/District Central/Leads_ProspectiveClub/Lead Record/label_Demo meeting date'))
	 
	 WebUI.delay(2)
	 
	 WebUI.click( findTestObject('Object Repository/District Central/Leads_ProspectiveClub/Lead Record/checkbox_SkipMeetingForDemoMeeting'))
	 
	 WebUI.delay(2)
	 
	 WebUI.sendKeys( findTestObject('Object Repository/District Central/Leads_ProspectiveClub/Lead Record/input_Demo meeting date_ClubLead.DemoMeetingScheduledDate')  , GlobalVariable.TestData["DemoMeetingScheduledDate"])
	 
	 WebUI.delay(1)
	 
	 WebUI.sendKeys( findTestObject('Object Repository/District Central/Leads_ProspectiveClub/Lead Record/textarea_Notes_ClubLead.DemoMeetingNotes')  , GlobalVariable.TestData["DemoMeetingNotes"])
	 
	 WebUI.delay(2)
	 
	 //Pending  Application
	 WebUI.click(  findTestObject('Object Repository/District Central/Leads_ProspectiveClub/Lead Record/label_Application submitted'))
	 
	 WebUI.delay(2) 	
	 
	 WebUI.sendKeys(findTestObject('Object Repository/District Central/Leads_ProspectiveClub/Lead Record/input_Application submitted_ClubLead.ApplicationSubmittedDate')  , GlobalVariable.TestData["ApplicationSubmittedDate"])
	 
	 WebUI.delay(1)
	 
	 WebUI.sendKeys(findTestObject('Object Repository/District Central/Leads_ProspectiveClub/Lead Record/textarea_Notes_ClubLead.ApplicationSubmittedNotes')  , GlobalVariable.TestData["ApplicationSubmittedNotes"])
	 
	 WebUI.delay(2)
	 
	       // Contact Information
	//Primary Contact Information
	WebUI.sendKeys( findTestObject('Object Repository/District Central/Leads_ProspectiveClub/Lead Record/input_Contact First Name_ClubLead.Contact.FirstName') , GlobalVariable.TestData["ClubLeadFirstName"]) 
	
	WebUI.delay(2)

	WebUI.sendKeys( findTestObject('Object Repository/District Central/Leads_ProspectiveClub/Lead Record/input_Contact Last Name_ClubLead.Contact.LastName')  , GlobalVariable.TestData["ClubLeadastName"])
	
	WebUI.delay(2)
	
	WebUI.sendKeys( findTestObject('Object Repository/District Central/Leads_ProspectiveClub/Lead Record/input_land Islands_PrimaryPhone') , GlobalVariable.TestData["ClubLeadCompanyPhoneNumber"])
	
	WebUI.delay(2)
	
	//validation mesage verify 
	
	WebUI.click(  findTestObject('Object Repository/District Central/Leads_ProspectiveClub/Lead Record/button_Save'))
	
	WebUI.delay(2)
	
	// Enter Invalid email id
	WebUI.sendKeys( findTestObject('Object Repository/District Central/Leads_ProspectiveClub/Lead Record/input__ClubLead.Contact.Email'), "KPgmail.com")
	
	WebUI.delay(2)
	
	WebUI.verifyElementPresent(findTestObject('Object Repository/District Central/Leads_ProspectiveClub/Lead Record/validation_email') , 30)
	
	WebUI.delay(2)
	
	// Enter valid emai address
	WebUI.click(findTestObject('Object Repository/District Central/Leads_ProspectiveClub/Lead Record/input__ClubLead.Contact.Email'))
	
	WebUI.delay(2)
	
	WebUI.clearText( findTestObject('Object Repository/District Central/Leads_ProspectiveClub/Lead Record/input__ClubLead.Contact.Email'))
	
	WebUI.sendKeys( findTestObject('Object Repository/District Central/Leads_ProspectiveClub/Lead Record/input__ClubLead.Contact.Email')  , GlobalVariable.TestData["ClubLeadEmail"])
	
	WebUI.delay(2)
	
	//Secondary Contact Information
	WebUI.sendKeys( findTestObject('Object Repository/District Central/Leads_ProspectiveClub/Lead Record/input_Contact First Name_ClubLead.SecondaryContact.FirstName') , GlobalVariable.TestData["ClubLeadSecondryFirstName"])
	
	WebUI.delay(2)
	
	WebUI.sendKeys( findTestObject('Object Repository/District Central/Leads_ProspectiveClub/Lead Record/input_Contact Last Name_ClubLead.SecondaryContact.LastName') , GlobalVariable.TestData["ClubLeadSecondryLastName"])
	
	WebUI.delay(2)
    
	WebUI.sendKeys(findTestObject('Object Repository/District Central/Leads_ProspectiveClub/Lead Record/input_land Islands_SecondaryPhone') , GlobalVariable.TestData["ClubLeadSeconaryPhone"])
	
	WebUI.delay(2)
	
	WebUI.sendKeys( findTestObject('Object Repository/District Central/Leads_ProspectiveClub/Lead Record/input_Email_ClubLead.SecondaryContact.Email') , GlobalVariable.TestData["ClubLeadSecondEmail"])
	
	WebUI.delay(2)
	     // Club Information
	
	WebUI.click( findTestObject('Object Repository/District Central/Leads_ProspectiveClub/Lead Record/link_ClubInformation'))
	
	WebUI.delay(2)
	
	//Club Information
	WebUI.sendKeys( findTestObject('Object Repository/District Central/Leads_ProspectiveClub/Lead Record/select_ClubType') , GlobalVariable.TestData["ClubLeadClubType"])
	
	WebUI.delay(2)
	
	WebUI.sendKeys( findTestObject('Object Repository/District Central/Leads_ProspectiveClub/Lead Record/select_Select Country') , GlobalVariable.TestData["ClubLeadCountry"])
	
	WebUI.delay(2)
	
	WebUI.sendKeys(findTestObject('Object Repository/District Central/Leads_ProspectiveClub/Lead Record/input__MailingAddress.Address.Street')  , GlobalVariable.TestData["ClubLeadAddressStreet"])
	
	WebUI.delay(2)
	
	WebUI.sendKeys( findTestObject('Object Repository/District Central/Leads_ProspectiveClub/Lead Record/input__MailingAddress.Address.City') , GlobalVariable.TestData["ClubLeadAddressCity"])
	
	WebUI.delay(2)
	
	WebUI.sendKeys( findTestObject('Object Repository/District Central/Leads_ProspectiveClub/Lead Record/select_SelectStates') ,  GlobalVariable.TestData["ClubLeadState"])
	
	WebUI.delay(2)
	
	WebUI.sendKeys( findTestObject('Object Repository/District Central/Leads_ProspectiveClub/Lead Record/input__MailingAddress.Address.PostalCode') , GlobalVariable.TestData["ClubLeadPostalCode"])
	
	WebUI.delay(2)
	
	WebUI.sendKeys( findTestObject('Object Repository/District Central/Leads_ProspectiveClub/Lead Record/input_land Islands_txtClubPhone') , GlobalVariable.TestData["IslandPhone"])
	
	WebUI.delay(2)
	//Supporting Company/Organization Information
	
	WebUI.sendKeys( findTestObject('Object Repository/District Central/Leads_ProspectiveClub/Lead Record/input_Company Sponsor_ClubLead.CompanySponsorName') ,GlobalVariable.TestData["ClubLeadSponsorName"])
	
	WebUI.delay(2)
	
	WebUI.sendKeys( findTestObject('Object Repository/District Central/Leads_ProspectiveClub/Lead Record/input_Corporate Contact Name_ClubLead.CorporateChampionName') , GlobalVariable.TestData["CorporateChampionName"])
	
	WebUI.delay(2)
	
	WebUI.sendKeys( findTestObject('Object Repository/District Central/Leads_ProspectiveClub/Lead Record/input_Email_ClubLead.SponsorEmail'), GlobalVariable.TestData["ClubLeadSponsorEmail"])
	
	WebUI.delay(2)
	
	WebUI.sendKeys( findTestObject('Object Repository/District Central/Leads_ProspectiveClub/Lead Record/input_Website_ClubLead.CompanySponsorWebsite'), GlobalVariable.TestData["CompanySponsorName"])
	
	WebUI.delay(2)
	
	WebUI.sendKeys( findTestObject('Object Repository/District Central/Leads_ProspectiveClub/Lead Record/input_land Islands_CompanyPhone') ,  GlobalVariable.TestData["IslandCompanyPhone"])
	
	WebUI.delay(2)
	
	WebUI.sendKeys( findTestObject('Object Repository/District Central/Leads_ProspectiveClub/Lead Record/select_Restricted') ,  GlobalVariable.TestData["SelectRestricted"])
	
	WebUI.delay(2)
	
	WebUI.sendKeys( findTestObject('Object Repository/District Central/Leads_ProspectiveClub/Lead Record/textarea_Comments_ClubLead.Comments') , GlobalVariable.TestData["ClubLeadComments"])
	
	WebUI.delay(2)
	
	WebUI.waitForElementVisible(findTestObject('Object Repository/District Central/Leads_ProspectiveClub/Lead Record/button_Save'), 120)
	
	WebUI.click(findTestObject('Object Repository/District Central/Leads_ProspectiveClub/Lead Record/button_Save'))
	
	WebUI.delay(2)
	
	// Click on Close pop up button
	WebUI.click( findTestObject('Object Repository/District Central/Leads_ProspectiveClub/Lead Record--Button/i_Comments_fa fa-close'))
	
	WebUI.delay(2)
	
	// Click on Submit button
	
	WebUI.click( findTestObject('Object Repository/District Central/Leads_ProspectiveClub/Lead Record--Button/button_Form Submitted'))
	
	WebUI.delay(2)
	
	// Click on collaspe button
	
	WebUI.click( findTestObject('Object Repository/District Central/Leads_ProspectiveClub/Leads and Prospective Clubs/td_expandButton'))
	
	WebUI.delay(2)
	
	String cName =  WebUI.getText( findTestObject('Object Repository/District Central/Leads_ProspectiveClub/Leads and Prospective Clubs/td_companyName'))
	
	WebUI.delay(2)
	
	String cPhoneNumber = WebUI.getText( findTestObject('Object Repository/District Central/Leads_ProspectiveClub/Leads and Prospective Clubs/td_companyPhoneNumber'))
	
	WebUI.delay(2)
	
	print("..........................................."+ cName)
	
	print("..........................................."+ cPhoneNumber)
	
	WebUI.delay(2)
	
	if (cName == CompanyName && cPhoneNumber.contains(CompanyPhoneNumber)) {
		
		WebUI.delay(2)
		
		print("...........................................PASS")
		
        GlobalVariable.vartestresult = 'PASS'

        GlobalVariable.varpassremarks = 'User Successfully add new lead.'
    } else {
        print('FAIL...............................')

        GlobalVariable.vartestresult = 'FAIL'

        GlobalVariable.varfailremarks = 'User unable to add new lead.'
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