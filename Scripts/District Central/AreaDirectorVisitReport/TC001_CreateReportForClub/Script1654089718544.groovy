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

	'Select Club'

	WebUI.click(findTestObject('Object Repository/District Central/Area Director Visit Reports/span_Select a Club') )
	WebUI.click(findTestObject('District Central/Area Director Visit Reports/a_ClubSelect1'))

	WebUI.delay(2)
	WebUI.click(findTestObject('Object Repository/District Central/Area Director Visit Reports/button_Create')  )

	'Create Club Report'
	WebUI.delay(2)
	WebUI.clearText(findTestObject('Object Repository/District Central/Area Director Visit Reports/a_schaduleDate'))

	Date todaysDate = new Date();
	def formattedDate = todaysDate.format("MM-dd-yyyy");

	WebUI.click(findTestObject('Object Repository/District Central/Area Director Visit Reports/a_schaduleDate'))
	WebUI.sendKeys(findTestObject('Object Repository/District Central/Area Director Visit Reports/a_schaduleDate'), formattedDate)

	WebUI.delay(2)

	WebUI.click(findTestObject('Object Repository/District Central/Area Director Visit Reports/button_Create Report'))

	WebUI.delay(2)

	if(WebUI.verifyElementVisible(findTestObject('Object Repository/District Central/Area Director Visit Reports/error_ADVRalreadyPresent')))
	{
		WebUI.click(findTestObject('Object Repository/District Central/Area Director Visit Reports/error_PopUpClose'))
		WebUI.delay(2)
		WebUI.click(findTestObject('Object Repository/District Central/Area Director Visit Reports/dropdown_EditADVRreportBtn'))
		WebUI.delay(2)
		WebUI.click(findTestObject('Object Repository/District Central/Area Director Visit Reports/btn_DeleteADVRReportBtn'))
		WebUI.delay(2)
		WebUI.click(findTestObject('Object Repository/District Central/Area Director Visit Reports/btn_DeleteReportBtn'))
		WebUI.delay(2)

		'Select Club'

		WebUI.click(findTestObject('Object Repository/District Central/Area Director Visit Reports/span_Select a Club') )
		WebUI.click(findTestObject('District Central/Area Director Visit Reports/a_ClubSelect1'))

		WebUI.delay(2)
		WebUI.click(findTestObject('Object Repository/District Central/Area Director Visit Reports/button_Create'))

		'Create Club Report'
		WebUI.delay(2)
		WebUI.clearText(findTestObject('Object Repository/District Central/Area Director Visit Reports/a_schaduleDate'))

		Date todaysDate2 = new Date();
		def formattedDate2 = todaysDate2.format("MM-dd-yyyy");

		WebUI.click(findTestObject('Object Repository/District Central/Area Director Visit Reports/a_schaduleDate'))
		WebUI.sendKeys(findTestObject('Object Repository/District Central/Area Director Visit Reports/a_schaduleDate'), formattedDate2)

		WebUI.delay(2)

		WebUI.click(findTestObject('Object Repository/District Central/Area Director Visit Reports/button_Create Report'))

		WebUI.delay(2)
	}

	WebUI.click(findTestObject('Object Repository/District Central/Area Director Visit Reports/button_Create Report'))

	WebUI.delay(2)


	'OverView' //Update Area Visit Reports

	WebUI.click(findTestObject('Object Repository/District Central/Area Director Visit Reports/button_Review and Confirm'))
	WebUI.delay(2)

	'Meeting Observation' //Moment of Truth

	WebUI.click( findTestObject('Object Repository/District Central/Area Director Visit Reports/button_Review and Confirm'))

	'Meeting Observation' //How well did the club exemplify the qualities of First Impressions?

	WebUI.click(findTestObject('Object Repository/District Central/Area Director Visit Reports/i_ratingStar_FirstImpressions'))
	WebUI.delay(2)
	WebUI.click(findTestObject('Object Repository/District Central/Area Director Visit Reports/textarea_Please note suggestions for the club'))
	WebUI.delay(2)
	WebUI.sendKeys(findTestObject('Object Repository/District Central/Area Director Visit Reports/textarea_Please note suggestions for the club'), 'Testing ADVR Report by Automation')
	WebUI.delay(4)
	WebUI.click( findTestObject('Object Repository/District Central/Area Director Visit Reports/button_Save and Continue (1)'))
	
	'Meeting Observation' //Were elements of Membership Orientation present during the meeting?

	WebUI.click(findTestObject('Object Repository/District Central/Area Director Visit Reports/input_MembershipOrientationPresent_Yes'))
	WebUI.delay(2)
	WebUI.click(findTestObject('Object Repository/District Central/Area Director Visit Reports/i_ratingStar_How well did the club apply these qualities'))
	WebUI.delay(2)
	WebUI.click(findTestObject('Object Repository/District Central/Area Director Visit Reports/textarea_Please note suggestions for the club (1)'))
	WebUI.delay(2)
	WebUI.sendKeys( findTestObject('Object Repository/District Central/Area Director Visit Reports/textarea_Please note suggestions for the club (1)'), 'Testing ADVR Report by Automation')
	WebUI.delay(2)
	WebUI.click( findTestObject('Object Repository/District Central/Area Director Visit Reports/button_Save and Continue (2)'))
	WebUI.delay(2)
	
	'Meeting Observation' //How well did the club apply the qualities of Fellowship, Variety, and Communication?

	WebUI.click(findTestObject('Object Repository/District Central/Area Director Visit Reports/i_ratingStart_qualities_of_Fellowship_Variety_Communication'))
	WebUI.delay(2)
	WebUI.click(findTestObject('Object Repository/District Central/Area Director Visit Reports/textarea_Please note suggestions for the club (2)'))
	WebUI.delay(2)
	WebUI.sendKeys(findTestObject('Object Repository/District Central/Area Director Visit Reports/textarea_Please note suggestions for the club (2)') ,'Testing ADVR Report by Automation')
	WebUI.delay(2)
	WebUI.click(findTestObject('Object Repository/District Central/Area Director Visit Reports/button_Save and Continue (3)'))
	WebUI.delay(2)
	
	'Meeting Observation' //How well did the club apply the qualities of Program Planning and Meeting Organization?

	WebUI.click(findTestObject('Object Repository/District Central/Area Director Visit Reports/i_ratingStart_qualitites_of_Program_Planning_Meeting'))
	WebUI.delay(2)
	WebUI.click(findTestObject('Object Repository/District Central/Area Director Visit Reports/textarea_Please note suggestions for the club (3)'))
	WebUI.delay(2)
	WebUI.sendKeys(findTestObject('Object Repository/District Central/Area Director Visit Reports/textarea_Please note suggestions for the club (3)'),'Testing ADVR Report by Automation')
	WebUI.delay(2)
	WebUI.click(findTestObject('Object Repository/District Central/Area Director Visit Reports/button_Save and Continue (4)'))
	WebUI.delay(2)
	
	'Meeting Observation' // How well did the club apply the qualities of Membership Strength?

	WebUI.click(findTestObject('Object Repository/District Central/Area Director Visit Reports/i_ratingStar_qualitites_Membership_Strengh'))
	WebUI.delay(2)
	WebUI.click(findTestObject('Object Repository/District Central/Area Director Visit Reports/textarea_Please note suggestions for the club (4)'))
	WebUI.delay(2)
	WebUI.sendKeys( findTestObject('Object Repository/District Central/Area Director Visit Reports/textarea_Please note suggestions for the club (4)'),'Testing ADVR Report by Automation')
	WebUI.delay(2)
	WebUI.click(findTestObject('Object Repository/District Central/Area Director Visit Reports/button_Save and Continue (5)'))
	WebUI.delay(2)
	
	'Meeting Observation' // How well did the club apply the qualities of Achievement Recognition?

	WebUI.click(findTestObject('Object Repository/District Central/Area Director Visit Reports/i_ratingStar_qualities_of_Achievement_Recognition'))
	WebUI.delay(2)
	WebUI.click(findTestObject('Object Repository/District Central/Area Director Visit Reports/textarea_Please note suggestions for the club (5)'))
	WebUI.delay(2)
	WebUI.sendKeys(findTestObject('Object Repository/District Central/Area Director Visit Reports/textarea_Please note suggestions for the club (5)'),'Testing ADVR Report by Automation')
	WebUI.delay(2)
	WebUI.click(findTestObject('Object Repository/District Central/Area Director Visit Reports/button_Save and Continue (6)'))
	WebUI.delay(2)
	
	'Meeting Observation' // Thank you for completing the Meeting Observation portion of the Area Director Visit Report.

	WebUI.click( findTestObject('Object Repository/District Central/Area Director Visit Reports/button_Review and Confirm (2)'))
	WebUI.delay(2)
	
	'Club Experience' // Overview

	WebUI.click( findTestObject('Object Repository/District Central/Area Director Visit Reports/button_Review and Confirm (1)'))
	WebUI.delay(2)
	
	'Club Experience' //How well did the club adhere to its meeting agenda, including the start and end times specified for the meeting?

	WebUI.click(findTestObject('Object Repository/District Central/Area Director Visit Reports/i_ratingStar_MeetingAgenda_StartAndEndTime'))
	WebUI.delay(2)
	WebUI.click(findTestObject('Object Repository/District Central/Area Director Visit Reports/button_Save and Continue (1)'))
	WebUI.delay(2)
	
	'Club Experience' // Is the club's meeting information on "Find a Club" out-of-date?

	WebUI.click( findTestObject('Object Repository/District Central/Area Director Visit Reports/input_ Find a Club_out-of-date_Yes'))
	WebUI.delay(2)
	
	'Club Experience' // Did you express the importance of having their meeting information up to date?

	WebUI.click( findTestObject('Object Repository/District Central/Area Director Visit Reports/input_Did you express the importance of having their meeting information_Yes'))
	WebUI.delay(2)
	WebUI.click(findTestObject('Object Repository/District Central/Area Director Visit Reports/button_Save and Continue (2)'))
	WebUI.delay(2)
	
	'Club Experience' // Overall, how would you rate this club meeting?

	WebUI.click(findTestObject('Object Repository/District Central/Area Director Visit Reports/i_ratingStar_rate_this_ClubMeeting'))
	WebUI.delay(2)
	WebUI.click(findTestObject('Object Repository/District Central/Area Director Visit Reports/textarea_What suggestions,do you have'))
	WebUI.delay(2)
	WebUI.sendKeys( findTestObject('Object Repository/District Central/Area Director Visit Reports/textarea_What suggestions,do you have') ,'Testing ADVR Report by Automation')
	WebUI.delay(2)
	WebUI.click(findTestObject('Object Repository/District Central/Area Director Visit Reports/button_Save and Continue (3)'))
	WebUI.delay(2)
	
	'Club Experience' // Thank you for completing the Club Experience portion of the Area Director Visit Report.

	WebUI.click( findTestObject('Object Repository/District Central/Area Director Visit Reports/button_Review and Confirm (2)'))
	WebUI.delay(2)
	
	'Club Support' // Overview

	WebUI.click( findTestObject('Object Repository/District Central/Area Director Visit Reports/button_Review and Confirm (1)'))
	WebUI.delay(2)
	
	'Club Support' // How well has the club defined and adhered to the educational goals of its Club Success Plan?

	WebUI.click(  findTestObject('Object Repository/District Central/Area Director Visit Reports/i_ratingStar_EducationGoals'))
	WebUI.delay(2)
	WebUI.click( findTestObject('Object Repository/District Central/Area Director Visit Reports/button_Save and Continue (1)'))
	WebUI.delay(2)
	
	'Club Support' // How well has the club defined and adhered to the membership goals of its Club Success Plan?

	WebUI.click( findTestObject('Object Repository/District Central/Area Director Visit Reports/i_ratingStart_MembershipGoal'))
	WebUI.delay(2)
	WebUI.click( findTestObject('Object Repository/District Central/Area Director Visit Reports/button_Save and Continue (2)'))
	WebUI.delay(2)
	
	'Club Support' // How well has the club defined and adhered to the training goals of its Club Success Plan?

	WebUI.click( findTestObject('Object Repository/District Central/Area Director Visit Reports/i_ratingStar_TraningGoals'))
	WebUI.delay(2)
	WebUI.click( findTestObject('Object Repository/District Central/Area Director Visit Reports/button_Save and Continue (3)'))
	WebUI.delay(2)
	
	'Club Support' // How well has the club defined and adhered to the administration goals of its Club Success Plan?

	WebUI.click( findTestObject('Object Repository/District Central/Area Director Visit Reports/i_ratingStar-AdministrationGoals'))
	WebUI.delay(2)
	WebUI.click( findTestObject('Object Repository/District Central/Area Director Visit Reports/button_Save and Continue (4)'))
	WebUI.delay(2)
	
	'Club Support' // Are there any additional goals which have been set by the club?

	WebUI.click(findTestObject('Object Repository/District Central/Area Director Visit Reports/input_AdditionalGoals_Yes'))
	WebUI.delay(2)
	WebUI.click(findTestObject('Object Repository/District Central/Area Director Visit Reports/input_What are these goals'))
	WebUI.delay(2)
	WebUI.sendKeys(findTestObject('Object Repository/District Central/Area Director Visit Reports/input_What are these goals') , 'Testing ADVR Report by Automation')
	WebUI.delay(2)
	WebUI.click(findTestObject('Object Repository/District Central/Area Director Visit Reports/button_Save and Continue (5)')  )
	WebUI.delay(2)
	WebUI.click( findTestObject('Object Repository/District Central/Area Director Visit Reports/i_ratingStar_Club defined_And_Adhered'))
	WebUI.delay(2)
	WebUI.click(findTestObject('Object Repository/District Central/Area Director Visit Reports/button_Save and Continue (5)'))
	WebUI.delay(2)
	
	'Club Support' // What are the club’s top goals or milestones to achieve during the next six months, or before the next Area Director club visit?
	
	WebUI.click(findTestObject('Object Repository/District Central/Area Director Visit Reports/textarea_GoalOrMilestones'))
	WebUI.delay(2)
	WebUI.sendKeys(findTestObject('Object Repository/District Central/Area Director Visit Reports/textarea_GoalOrMilestones') , 'Testing ADVR Report by Automation')
	WebUI.delay(2)
	WebUI.click(findTestObject('Object Repository/District Central/Area Director Visit Reports/button_Save and Continue (6)'))
	WebUI.delay(2)
	
	'Club Support' //  Does the club have any events planned?

	WebUI.click(findTestObject('Object Repository/District Central/Area Director Visit Reports/input_Event_Planne_Yes'))
	WebUI.delay(2)
	WebUI.click( findTestObject('Object Repository/District Central/Area Director Visit Reports/input_checkbox_OpenHouse'))
	WebUI.click(findTestObject('Object Repository/District Central/Area Director Visit Reports/input_Event Name'))
	WebUI.delay(2)
	WebUI.sendKeys(findTestObject('Object Repository/District Central/Area Director Visit Reports/input_Event Name') , 'Stand Up Comedy')
	WebUI.delay(2)
	WebUI.click(findTestObject('Object Repository/District Central/Area Director Visit Reports/input_Event Date'))
	WebUI.sendKeys(findTestObject('Object Repository/District Central/Area Director Visit Reports/input_Event Date') , '03/06/2023')
	WebUI.delay(2)

//	WebUI.click( findTestObject('Object Repository/District Central/Area Director Visit Reports/input_checkbox_Speechcraft')  )
//	WebUI.sendKeys( findTestObject('Object Repository/District Central/Area Director Visit Reports/input_Speechcraft_Event Name') , GlobalVariable.TestData["SpeechcraftEventName"])
//	WebUI.sendKeys( findTestObject('Object Repository/District Central/Area Director Visit Reports/input_Speechcraft_EventDate') , GlobalVariable.TestData["SpeechcraftEventDate"])
//
//	WebUI.click( findTestObject('Object Repository/District Central/Area Director Visit Reports/input_checkbox_Speakathon')  )
//	WebUI.sendKeys( findTestObject('Object Repository/District Central/Area Director Visit Reports/input_Speakathon_EventName') , GlobalVariable.TestData["SpeakathonEventName"])
//	WebUI.sendKeys( findTestObject('Object Repository/District Central/Area Director Visit Reports/input_Speakathon_EventDate') , GlobalVariable.TestData["SpeakathonEventDate"])
//
//	WebUI.click( findTestObject('Object Repository/District Central/Area Director Visit Reports/input_checkbox_OtherEvent')  )
//	WebUI.sendKeys( findTestObject('Object Repository/District Central/Area Director Visit Reports/input_Other_EventName') , GlobalVariable.TestData["OtherEventName"])
//	WebUI.sendKeys( findTestObject('Object Repository/District Central/Area Director Visit Reports/input_Other_EventDate') , GlobalVariable.TestData["OtherEventDate"])
	
	WebUI.click(  findTestObject('Object Repository/District Central/Area Director Visit Reports/button_Save and Continue (7)'))
	WebUI.delay(2)
	
	'Club Support' //  Are there any members interested in serving as future club officers or District leaders

	WebUI.click( findTestObject('Object Repository/District Central/Area Director Visit Reports/input_FutureClubOfficer_Yes'))
	WebUI.delay(2)
	WebUI.click(findTestObject('Object Repository/District Central/Area Director Visit Reports/input_Member1'))
	WebUI.delay(2)
	WebUI.sendKeys( findTestObject('Object Repository/District Central/Area Director Visit Reports/select_Select Position1') , "District Leader")
	WebUI.delay(2)
	WebUI.click(findTestObject('Object Repository/District Central/Area Director Visit Reports/input_Member2'))
	WebUI.delay(2)
	WebUI.sendKeys( findTestObject('Object Repository/District Central/Area Director Visit Reports/select_Select Position2') , "Club Officer")
	WebUI.delay(2)
	WebUI.click(findTestObject('Object Repository/District Central/Area Director Visit Reports/input_Member3'))
	WebUI.delay(2)
	WebUI.sendKeys( findTestObject('Object Repository/District Central/Area Director Visit Reports/select_Select Position3') , "Both")
	WebUI.delay(2)
	WebUI.click(  findTestObject('Object Repository/District Central/Area Director Visit Reports/button_Save and Continue (8)'))
	WebUI.delay(2)
	
	'Club Support' // Please list any specific challenges or areas of additional support that the club needs from the District or Area Director which have not already been stated.
	
	WebUI.click( findTestObject('Object Repository/District Central/Area Director Visit Reports/textarea_SpecificChallengesOrAreaOfAdditional'))
	WebUI.delay(2)
	WebUI.sendKeys( findTestObject('Object Repository/District Central/Area Director Visit Reports/textarea_SpecificChallengesOrAreaOfAdditional') ,'Testing ADVR Report by Automation')
	WebUI.delay(2)
	WebUI.click(findTestObject('Object Repository/District Central/Area Director Visit Reports/button_Save and Continue (9)'))
	WebUI.delay(2)
	
	'Club Support' //Thank you for completing the Club Support portion of the Area Director Visit Report.

	WebUI.click( findTestObject('Object Repository/District Central/Area Director Visit Reports/button_Review and Confirm (2)'))
	WebUI.delay(2)
	
	'Club Concerns' // Overview

	WebUI.click(findTestObject('Object Repository/District Central/Area Director Visit Reports/button_Review and Confirm (1)'))
	WebUI.delay(2)
	
	'Club Concerns' // Are there any member-to-member concerns which should be addressed?

	WebUI.click(findTestObject('Object Repository/District Central/Area Director Visit Reports/input_member-to-member concerns_Yes'))
	WebUI.delay(2)
	WebUI.click(findTestObject('Object Repository/District Central/Area Director Visit Reports/textarea_Please specify'))
	WebUI.delay(2)
	WebUI.sendKeys( findTestObject('Object Repository/District Central/Area Director Visit Reports/textarea_Please specify'),'Testing ADVR Report by Automation')
	WebUI.delay(2)
	WebUI.click(findTestObject('Object Repository/District Central/Area Director Visit Reports/button_Save and Continue (1)'))
	WebUI.delay(2)
	
	// Are there any concerns regarding a club officer which should be addressed?
	
	WebUI.click(findTestObject('Object Repository/District Central/Area Director Visit Reports/input_concerns regarding a club officer_Yes'))
	WebUI.delay(2)
	
	'Club Concerns'
	
	WebUI.click(findTestObject('Object Repository/District Central/Area Director Visit Reports/textarea_Please specify (1)'))
	WebUI.delay(2)
	WebUI.sendKeys(findTestObject('Object Repository/District Central/Area Director Visit Reports/textarea_Please specify (1)'), 'Testing ADVR Report by Automation')
	WebUI.delay(2)
	WebUI.click(findTestObject('Object Repository/District Central/Area Director Visit Reports/input_anticipate_concerns independently_Yes'))
	WebUI.delay(2)
	WebUI.click(findTestObject('Object Repository/District Central/Area Director Visit Reports/input_ Area Director_Yes'))
	WebUI.delay(2)
	WebUI.click(findTestObject('Object Repository/District Central/Area Director Visit Reports/button_Save and Continue (2)'))
	WebUI.delay(2)
	
	'Club Concerns'	// The following information will not be provided to the club.

	WebUI.click( findTestObject('Object Repository/District Central/Area Director Visit Reports/button_Review and Confirm (2)'))
	WebUI.delay(2)
	
	"Review and Submit your Area Director Visit Report"

	WebUI.click( findTestObject('Object Repository/District Central/Area Director Visit Reports/button_Expand All')  )
	WebUI.click( findTestObject('Object Repository/District Central/Area Director Visit Reports/button_Collapse All')  )

	"Submit Report"
	WebUI.click( findTestObject('Object Repository/District Central/Area Director Visit Reports/button_Submit Report')  )

	"Download Report"

	WebUI.click( findTestObject('Object Repository/District Central/Page_Toastmasters International -Club Visit Report/button_Download report')  )

	"Close and Exit"
	WebUI.click(findTestObject('Object Repository/District Central/Page_Toastmasters International -Club Visit Report/button_Close and exit')  )




	if (WebUI.verifyElementVisible( findTestObject('Object Repository/District Central/Area Director Visit Reports/h1_Area Director Visit Reports'))) {
		GlobalVariable.vartestresult = 'PASS'

		GlobalVariable.varpassremarks = 'User Successfully Add details.'
	} else {
		print('FAIL...............................')

		GlobalVariable.vartestresult = 'FAIL'

		GlobalVariable.varfailremarks = 'User unable add details.'
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