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
	
	/*
	           // Team  Charter
	// Section 1
	WebUI.scrollToPosition(40, 50)
	WebUI.sendKeys( findTestObject('Object Repository/District Central/District Success Plan/Team Charter_Section1/textarea__DistrictCoreTeam') , "Name the members of the district’s core team.*")
	WebUI.sendKeys( findTestObject('Object Repository/District Central/District Success Plan/Team Charter_Section1/textarea__DistrictExtendedTeam'), "Name the members of the district’s extended team.*")
	
	WebUI.sendKeys( findTestObject('Object Repository/District Central/District Success Plan/Team Charter_Section1/textarea__WhatAreDistrictCoreValues'), "What are the district’s core values?*")
	WebUI.sendKeys( findTestObject('Object Repository/District Central/District Success Plan/Team Charter_Section1/textarea__TeamOperatingPrinciple') , "What principles does the team hold? (These principles might include trust, safe learning, collaboration, etc.)*")
	
	WebUI.sendKeys( findTestObject('Object Repository/District Central/District Success Plan/Team Charter_Section1/textarea__PotentialObstacles'), "What obstacles will the team have to consider when strategizing? (These might include conflicting personal commitments, distance, unresolved conflict, etc.)*")
	WebUI.sendKeys( findTestObject('Object Repository/District Central/District Success Plan/Team Charter_Section1/textarea__MeetingProtocol'), "In general, how will the team process tasks? (For example, consider how often to meet or call, what the team’s meeting practices will be, etc.)*")
	
	
	WebUI.sendKeys(findTestObject('Object Repository/District Central/District Success Plan/Team Charter_Section1/textarea__TeamInteractio9nAndBehavioralNorms') , "How will decisions be made?*")
	 
	WebUI.click(  findTestObject('Object Repository/District Central/District Success Plan/Team Charter_Section1/button_Save') )
	WebUI.delay(1)
	WebUI.waitForElementClickable( findTestObject('Object Repository/District Central/District Success Plan/Team Charter_Section1/button_Ok'), 20)
	 
	// Section 2
	WebUI.scrollToPosition(40, 50)
	WebUI.click( findTestObject('Object Repository/District Central/District Success Plan/Team Chater_Section2/a_Section 2')  )
	
    WebUI.sendKeys( findTestObject('Object Repository/District Central/District Success Plan/Team Chater_Section2/textarea__MethodOfCommunication') , "What will be the team’s method of communication? Determine the team’s first preference, second preference, and so on.*")
	WebUI.sendKeys( findTestObject('Object Repository/District Central/District Success Plan/Team Chater_Section2/textarea__CommunicationParametersBe') , "What will the communication parameters be? Parameters might include whether the team communicates by phone or email, whether the team sets up a weekly conference call, or how often team members can expect to communicate.*")
	 
	WebUI.sendKeys( findTestObject('Object Repository/District Central/District Success Plan/Team Chater_Section2/textarea__ResolveDifferentOfOpinion') , "How will the team resolve differences of opinion?*")
	WebUI.sendKeys( findTestObject('Object Repository/District Central/District Success Plan/Team Chater_Section2/textarea__TeamSuportOneAnother') , "How will the team support one another?*")
	 
	WebUI.sendKeys( findTestObject('Object Repository/District Central/District Success Plan/Team Chater_Section2/textarea__VCompletingActivities') , "How will the team ensure equitable participation when completing activities?*")
	WebUI.sendKeys( findTestObject('Object Repository/District Central/District Success Plan/Team Chater_Section2/textarea__AccountableResponsibilities') , "How will team members be held accountable for their responsibilities?*")
	 
	WebUI.sendKeys( findTestObject('Object Repository/District Central/District Success Plan/Team Chater_Section2/textarea__RecognizesForTheirEfforts') , "How will the core team and extended teams be recognized for their efforts?*")
	 
	WebUI.click(  findTestObject('Object Repository/District Central/District Success Plan/Team Charter_Section1/button_Save') )
	WebUI.delay(1)
	WebUI.waitForElementClickable( findTestObject('Object Repository/District Central/District Success Plan/Team Charter_Section1/button_Ok'), 20)

	
	 // Goals 
	WebUI.scrollToPosition(40, 50)
	WebUI.click(findTestObject('Object Repository/District Central/District Success Plan/Goals/a_Goals')  )
	 
	 // Goal 1: Membership Payments Growth 
	 
	WebUI.sendKeys( findTestObject('Object Repository/District Central/District Success Plan/Goals/textarea__SituationAnalysis') , "What is the current situation in the district")
	WebUI.sendKeys( findTestObject('Object Repository/District Central/District Success Plan/Goals/textarea__Strategy') , "What actions will the district take?")
	 
	WebUI.sendKeys( findTestObject('Object Repository/District Central/District Success Plan/Goals/input_Strategy_Action1') , "Action 1*")
	WebUI.sendKeys( findTestObject('Object Repository/District Central/District Success Plan/Goals/input_Strategy_Action2') , "Action 2*")
	WebUI.sendKeys( findTestObject('Object Repository/District Central/District Success Plan/Goals/input_Strategy_Action3') , "Action 3*")
	WebUI.sendKeys( findTestObject('Object Repository/District Central/District Success Plan/Goals/input_Strategy_Action4') , "Action 4*")
	WebUI.sendKeys( findTestObject('Object Repository/District Central/District Success Plan/Goals/input_Strategy_Action5') , "Action 5*")
	 
	 
	WebUI.sendKeys( findTestObject('Object Repository/District Central/District Success Plan/Goals/textarea__Resources') , "What people, equipment, meeting places, and money does the district have at its disposal?")
	WebUI.sendKeys( findTestObject('Object Repository/District Central/District Success Plan/Goals/textarea__Assignments') , "Who is in charge of each action? ")
	 
	WebUI.sendKeys( findTestObject('Object Repository/District Central/District Success Plan/Goals/input__AssignmentAction1') , "Action 1*")
	WebUI.sendKeys( findTestObject('Object Repository/District Central/District Success Plan/Goals/input__AssignmentAction2') , "Action 2*")
	WebUI.sendKeys( findTestObject('Object Repository/District Central/District Success Plan/Goals/input__AssignmentAction3') , "Action 3*")
	WebUI.sendKeys( findTestObject('Object Repository/District Central/District Success Plan/Goals/input__AssignmentAction4') , "Action 4*")
	WebUI.sendKeys( findTestObject('Object Repository/District Central/District Success Plan/Goals/input__AssignmentAction5') , "Action 5*")
	 
	 
	  
	WebUI.sendKeys( findTestObject('Object Repository/District Central/District Success Plan/Goals/textarea__TimeTable') , "When will each action item begin? When will each action item be complete? How will progress be tracked?*")
	 
	WebUI.sendKeys(  findTestObject('Object Repository/District Central/District Success Plan/Goals/input__TimeTableAction1'), "Action 1*")
	WebUI.sendKeys(  findTestObject('Object Repository/District Central/District Success Plan/Goals/input__TimeTableAction2'), "Action 2*")
	WebUI.sendKeys(  findTestObject('Object Repository/District Central/District Success Plan/Goals/input__TimeTableAction3') , "Action 3*")
	WebUI.sendKeys(  findTestObject('Object Repository/District Central/District Success Plan/Goals/input__TimeTableAction4') , "Action 4*")
	WebUI.sendKeys(  findTestObject('Object Repository/District Central/District Success Plan/Goals/input__TimeTableAction5'), "Action 5*")
	 
	WebUI.click(  findTestObject('Object Repository/District Central/District Success Plan/Team Charter_Section1/button_Save') )
	WebUI.delay(1)
	WebUI.waitForElementClickable( findTestObject('Object Repository/District Central/District Success Plan/Team Charter_Section1/button_Ok'), 20)

	 
	// Goal 2 : Club Growth
	WebUI.scrollToPosition(40, 50)
	WebUI.click(findTestObject('Object Repository/District Central/District Success Plan/Goals/a_Goal 2 Club Growth')  )
	
	  
	WebUI.sendKeys( findTestObject('Object Repository/District Central/District Success Plan/Goals/textarea__Goal_2_Club_Growth_SituationalAnalysis') , "Gloal 2 : Club Growth ,What is the current situation in the district?")
	WebUI.sendKeys( findTestObject('Object Repository/District Central/District Success Plan/Goals/textarea__Goal_2_Club_Growth_Strategy') , "Gloal 2 : Club Growth ,What actions will the district take?")
	  
	WebUI.sendKeys( findTestObject('Object Repository/District Central/District Success Plan/Goals/input__Goal_2_Club_Growth_Strategy_Action1') , "Gloal 2 : Club Growth ,Action 1*")
	WebUI.sendKeys( findTestObject('Object Repository/District Central/District Success Plan/Goals/input__Goal_2_Club_Growth_Strategy_Action2') , "Gloal 2 : Club Growth ,Action 2*")
	WebUI.sendKeys( findTestObject('Object Repository/District Central/District Success Plan/Goals/input_Goal_2_Club_Growth_Strategy_Action3') , "Gloal 2 : Club Growth ,Action 3*")
	WebUI.sendKeys( findTestObject('Object Repository/District Central/District Success Plan/Goals/input_Goal_2_Club_Growth_Strategy_Action4') , "Gloal 2 : Club Growth ,Action 4*")
	WebUI.sendKeys( findTestObject('Object Repository/District Central/District Success Plan/Goals/input_Goal_2_Club_Growth_Strategy_Action5') , "Gloal 2 : Club Growth ,Action 5*")
	  
	  
	  
	WebUI.sendKeys( findTestObject('Object Repository/District Central/District Success Plan/Goals/textarea__Goal_2_Club_Growth_Resources') , "Gloal 2 : Club Growth ,What people, equipment, meeting places, and money does the district have at its disposal? ")
	WebUI.sendKeys( findTestObject('Object Repository/District Central/District Success Plan/Goals/textarea__Goal_2_Club_Growth_Assignment') , "Gloal 2 : Club Growth ,Who is in charge of each action? ")
	  
	WebUI.sendKeys( findTestObject('Object Repository/District Central/District Success Plan/Goals/input__Goal_2_Club_Growth_Assignment_Action1') , "Gloal 2 : Club Growth ,Action 1*")
	WebUI.sendKeys( findTestObject('Object Repository/District Central/District Success Plan/Goals/input__Goal_2_Club_Growth_Assignment_Action2') , "Gloal 2 : Club Growth ,Action 2*")
	WebUI.sendKeys( findTestObject('Object Repository/District Central/District Success Plan/Goals/input_Goal_2_Club_Growth_Assignment_Action3')  , "Gloal 2 : Club Growth ,Action 3*")
	WebUI.sendKeys( findTestObject('Object Repository/District Central/District Success Plan/Goals/input_Goal_2_Club_Growth_Assignment_Action4')  , "Gloal 2 : Club Growth ,Action 4*")
	WebUI.sendKeys( findTestObject('Object Repository/District Central/District Success Plan/Goals/input_Goal_2_Club_Growth_Assignment_Action5') , "Gloal 2 : Club Growth ,Action 5*")
	  
	  
	WebUI.sendKeys( findTestObject('Object Repository/District Central/District Success Plan/Goals/Goals2/textarea_Goal_2_Club_Growth_Assignment_TimeTable') , "Gloal 2 : Club Growth ,When will each action item begin?")
	 	  
	WebUI.sendKeys( findTestObject('Object Repository/District Central/District Success Plan/Goals/Goals2/input_Goal_2_Club_Growth_Assignment_TimeTable_Action1') , "Gloal 2 : Club Growth ,Action 1*")
	WebUI.sendKeys( findTestObject('Object Repository/District Central/District Success Plan/Goals/Goals2/input_Goal_2_Club_Growth_Assignment_TimeTable_Action2') , "Gloal 2 : Club Growth ,Action 2*")
	WebUI.sendKeys( findTestObject('Object Repository/District Central/District Success Plan/Goals/Goals2/input_Goal_2_Club_Growth_Assignment_TimeTable_Action3') , "Gloal 2 : Club Growth ,Action 3*")
	WebUI.sendKeys( findTestObject('Object Repository/District Central/District Success Plan/Goals/Goals2/input_Goal_2_Club_Growth_Assignment_TimeTable_Action4') , "Gloal 2 : Club Growth ,Action 4*")
	WebUI.sendKeys( findTestObject('Object Repository/District Central/District Success Plan/Goals/Goals2/input_Goal_2_Club_Growth_Assignment_TimeTable_Action5') , "Gloal 2 : Club Growth ,Action 5*")
	  
	WebUI.click(  findTestObject('Object Repository/District Central/District Success Plan/Team Charter_Section1/button_Save') )
	WebUI.delay(1)
	WebUI.waitForElementClickable( findTestObject('Object Repository/District Central/District Success Plan/Team Charter_Section1/button_Ok'), 20)

	  // Goal 3 : Distinguished Clubs
	WebUI.scrollToPosition(40, 50)
	WebUI.click( findTestObject('Object Repository/District Central/District Success Plan/Goals/Goals2/a_Goal 3 Distinguished Clubs')  )
	  
	WebUI.sendKeys( findTestObject('Object Repository/District Central/District Success Plan/Goals/Goals2/textarea__Goal_3_Distinguished_Clubs_SituationsAnalysis'), "Goal 3 : Distinguished Clubs, What is the current situation in the district? ")   
	WebUI.sendKeys( findTestObject('Object Repository/District Central/District Success Plan/Goals/Goals2/textarea__Goal_3_Distinguished_Clubs_Strategy'), "Goal 3 : Distinguished Clubs, ")
	  
	WebUI.sendKeys( findTestObject('Object Repository/District Central/District Success Plan/Goals/Goals2/input__Goal_3_Distinguished_Clubs_Strategy_Action1') , "Goal 3 : Distinguished Clubs, Action 1*")
	WebUI.sendKeys( findTestObject('Object Repository/District Central/District Success Plan/Goals/Goals2/input__Goal_3_Distinguished_Clubs_Strategy_Action2'), "Goal 3 : Distinguished Clubs, Action 2*")
	WebUI.sendKeys( findTestObject('Object Repository/District Central/District Success Plan/Goals/Goals2/input__Goal_3_Distinguished_Clubs_Strategy_Action3'), "Goal 3 : Distinguished Clubs, Action 3*")
	WebUI.sendKeys( findTestObject('Object Repository/District Central/District Success Plan/Goals/Goals2/input__Goal_3_Distinguished_Clubs_Strategy_Action4'), "Goal 3 : Distinguished Clubs, Action 4*")
	WebUI.sendKeys( findTestObject('Object Repository/District Central/District Success Plan/Goals/Goals2/input__Goal_3_Distinguished_Clubs_Strategy_Action5'), "Goal 3 : Distinguished Clubs, Action 5*")
	  
	  
	WebUI.sendKeys(findTestObject('Object Repository/District Central/District Success Plan/Goals/Goals2/textarea__Goal_3_Distinguished_Clubs_Resources') , "Goal 3 : Distinguished Clubs, ")
	WebUI.sendKeys( findTestObject('Object Repository/District Central/District Success Plan/Goals/Goals2/textarea__Goal_3_Distinguished_Clubs_Assignment'), "Goal 3 : Distinguished Clubs, ")
	  
	WebUI.sendKeys( findTestObject('Object Repository/District Central/District Success Plan/Goals/Goals2/input__Goal_3_Distinguished_Clubs_Assignment_Action1'), "Goal 3 : Distinguished Clubs, Action 1*")
	WebUI.sendKeys( findTestObject('Object Repository/District Central/District Success Plan/Goals/Goals2/input__Goal_3_Distinguished_Clubs_Assignment_Action2'), "Goal 3 : Distinguished Clubs, Action 2*")
	WebUI.sendKeys( findTestObject('Object Repository/District Central/District Success Plan/Goals/Goals2/input__Goal_3_Distinguished_Clubs_Assignment_Action3'), "Goal 3 : Distinguished Clubs, Action 3*")
	WebUI.sendKeys( findTestObject('Object Repository/District Central/District Success Plan/Goals/Goals2/input__Goal_3_Distinguished_Clubs_Assignment_Action4'), "Goal 3 : Distinguished Clubs, Action 4*")
	WebUI.sendKeys( findTestObject('Object Repository/District Central/District Success Plan/Goals/Goals2/input__Goal_3_Distinguished_Clubs_Assignment_Action5'), "Goal 3 : Distinguished Clubs, Action 5*")
	  
	  
	WebUI.sendKeys(findTestObject('Object Repository/District Central/District Success Plan/Goals/Goals2/textarea__Goal_3_Distinguished_Clubs_TimeTable') , "Goal 3 : Distinguished Clubs, ")
	  
	WebUI.sendKeys( findTestObject('Object Repository/District Central/District Success Plan/Goals/Goals2/input__Goal_3_Distinguished_Clubs_TimeTable_Action1') , "Goal 3 : Distinguished Clubs, Action 1*")
	WebUI.sendKeys( findTestObject('Object Repository/District Central/District Success Plan/Goals/Goals2/input__Goal_3_Distinguished_Clubs_TimeTable_Action2') , "Goal 3 : Distinguished Clubs, Action 2*")
	WebUI.sendKeys( findTestObject('Object Repository/District Central/District Success Plan/Goals/Goals2/input__Goal_3_Distinguished_Clubs_TimeTable_Action3') , "Goal 3 : Distinguished Clubs, Action 3*")
	WebUI.sendKeys( findTestObject('Object Repository/District Central/District Success Plan/Goals/Goals2/input__Goal_3_Distinguished_Clubs_TimeTable_Action4') ,"Goal 3 : Distinguished Clubs, Action 4*")
	WebUI.sendKeys( findTestObject('Object Repository/District Central/District Success Plan/Goals/Goals2/input_Goal_3_Distinguished_Clubs_TimeTable_Action5') , "Goal 3 : Distinguished Clubs, Action 5*")
	  
	WebUI.click(  findTestObject('Object Repository/District Central/District Success Plan/Team Charter_Section1/button_Save') )
	WebUI.delay(1)
	WebUI.waitForElementClickable( findTestObject('Object Repository/District Central/District Success Plan/Team Charter_Section1/button_Ok'), 20)

	
	  // Additional Goals
	WebUI.scrollToPosition(40, 50)
	 WebUI.click( findTestObject('Object Repository/District Central/District Success Plan/AdditionalGoals/a_Additional Goals')  )
	
	 WebUI.sendKeys( findTestObject('Object Repository/District Central/District Success Plan/AdditionalGoals/textarea__ImproveentInTheDistrict') , "Additinal Goals , Answer the same types of questions to reach each additional district goal.") 
	 WebUI.sendKeys( findTestObject('Object Repository/District Central/District Success Plan/AdditionalGoals/textarea__SituationalAnaliysis') , "Additinal Goals , What is the current situation in the district? ")
	 WebUI.sendKeys( findTestObject('Object Repository/District Central/District Success Plan/AdditionalGoals/textarea__Strategy') , "Additinal Goals , What actions will the district take?")
	 
	 WebUI.sendKeys( findTestObject('Object Repository/District Central/District Success Plan/AdditionalGoals/input__Additional Goals_Strategy_Action1') , "Additinal Goals , Action 1*")
	 WebUI.sendKeys( findTestObject('Object Repository/District Central/District Success Plan/AdditionalGoals/input__Additional Goals_Strategy_Action2') , "Additinal Goals , Action 2*")
	 WebUI.sendKeys( findTestObject('Object Repository/District Central/District Success Plan/AdditionalGoals/input__Additional Goals_Strategy_Action3') , "Additinal Goals , Action 3*")
	 WebUI.sendKeys( findTestObject('Object Repository/District Central/District Success Plan/AdditionalGoals/input__Additional Goals_Strategy_Action4') , "Additinal Goals , Action 4*")
	 WebUI.sendKeys( findTestObject('Object Repository/District Central/District Success Plan/AdditionalGoals/input__Additional Goals_Strategy_Action5') , "Additinal Goals , Action 5*")
	 
	 
	 WebUI.sendKeys( findTestObject('Object Repository/District Central/District Success Plan/AdditionalGoals/textarea__Resources') , "Additinal Goals , What people, equipment, meeting places, and money does the district have at its disposal? ")
	 WebUI.sendKeys( findTestObject('Object Repository/District Central/District Success Plan/AdditionalGoals/textarea__Assignments') , "Additinal Goals , Who is in charge of each action? ")
	 
	 WebUI.sendKeys( findTestObject('Object Repository/District Central/District Success Plan/AdditionalGoals/input__Additional Goals_Assignments_Action1') , "Additinal Goals , Action 1*")
	 WebUI.sendKeys( findTestObject('Object Repository/District Central/District Success Plan/AdditionalGoals/input__Additional Goals_Assignments_Action2') , "Additinal Goals , Action 2*")
	 WebUI.sendKeys( findTestObject('Object Repository/District Central/District Success Plan/AdditionalGoals/input__Additional Goals_Assignments_Action3') , "Additinal Goals , Action 3*")
	 WebUI.sendKeys( findTestObject('Object Repository/District Central/District Success Plan/AdditionalGoals/input__Additional Goals_Assignments_Action4') , "Additinal Goals , Action 4*")
	 WebUI.sendKeys( findTestObject('Object Repository/District Central/District Success Plan/AdditionalGoals/input__Additional Goals_Assignments_Action5'), "Additinal Goals , Action 5*")
	 
	 WebUI.sendKeys(  findTestObject('Object Repository/District Central/District Success Plan/AdditionalGoals/textarea__TimeTable'), "Additinal Goals , When will each action item begin?")
	 
	 WebUI.sendKeys(  findTestObject('Object Repository/District Central/District Success Plan/AdditionalGoals/input__Additional Goals_TimeTable_Action1'), "Additinal Goals , Action 1*")
	 WebUI.sendKeys(  findTestObject('Object Repository/District Central/District Success Plan/AdditionalGoals/input__Additional Goals_TimeTable_Action2'), "Additinal Goals , Action 2*")
	 WebUI.sendKeys(  findTestObject('Object Repository/District Central/District Success Plan/AdditionalGoals/input__Additional Goals_TimeTable_Action3') , "Additinal Goals , Action 3*")
	 WebUI.sendKeys(  findTestObject('Object Repository/District Central/District Success Plan/AdditionalGoals/input__Additional Goals_TimeTable_Action4'), "Additinal Goals , Action 4*")
	 WebUI.sendKeys(  findTestObject('Object Repository/District Central/District Success Plan/AdditionalGoals/input__Additional Goals_TimeTable_Action5'), "Additinal Goals , Action 5*")
	 
	 
	 // Summary
	 
	 //  At a Glance
	 
	 //WebUI.click(findTestObject('Object Repository/District Central/District Success Plan/At a Glance/a_At a Glance')  )
	 
	// Membership Payment Growth
	 WebUI.sendKeys( findTestObject('Object Repository/District Central/District Success Plan/At a Glance/input_Membership Payments Growth_Goal_July') , "10")
	 WebUI.sendKeys( findTestObject('Object Repository/District Central/District Success Plan/At a Glance/input_Membership Payments Growth_Goal_August') , "20")
	 WebUI.sendKeys( findTestObject('Object Repository/District Central/District Success Plan/At a Glance/input_Membership Payments Growth_Goal_September') , "30")
	 WebUI.sendKeys( findTestObject('Object Repository/District Central/District Success Plan/At a Glance/input_Membership Payments Growth_Goal_October') , "40")
	 WebUI.sendKeys( findTestObject('Object Repository/District Central/District Success Plan/At a Glance/input_Membership Payments Growth_Goal_November') , "50")
	 WebUI.sendKeys( findTestObject('Object Repository/District Central/District Success Plan/At a Glance/input_Membership Payments Growth_Goal_December') , "60")
	 
	 WebUI.sendKeys( findTestObject('Object Repository/District Central/District Success Plan/At a Glance/input_Membership Payments Growth_Goal_January') , "70")
	 WebUI.sendKeys( findTestObject('Object Repository/District Central/District Success Plan/At a Glance/input_Membership Payments Growth_Goal_February') , "80")
	 WebUI.sendKeys( findTestObject('Object Repository/District Central/District Success Plan/At a Glance/input_Membership Payments Growth_Goal_March') , "90")
	 WebUI.sendKeys( findTestObject('Object Repository/District Central/District Success Plan/At a Glance/input_Membership Payments Growth_Goal_April') , "100")
	 WebUI.sendKeys( findTestObject('Object Repository/District Central/District Success Plan/At a Glance/input_Membership Payments Growth_Goal_May') , "110")
	 WebUI.sendKeys( findTestObject('Object Repository/District Central/District Success Plan/At a Glance/input_Membership Payments Growth_Goal_June') , "120")
	 
	 //Club Growth
	 
	 WebUI.sendKeys( findTestObject('Object Repository/District Central/District Success Plan/At a Glance/input_Club Growth_Goal_July') , "120")
	 WebUI.sendKeys( findTestObject('Object Repository/District Central/District Success Plan/At a Glance/input_Club Growth_Goal_August'), "110")
	 WebUI.sendKeys( findTestObject('Object Repository/District Central/District Success Plan/At a Glance/input_Club Growth_Goal_September') , "100")
	 WebUI.sendKeys( findTestObject('Object Repository/District Central/District Success Plan/At a Glance/input_Club Growth_Goal_October'), "90")
	 WebUI.sendKeys( findTestObject('Object Repository/District Central/District Success Plan/At a Glance/input_Club Growth_Goal_November'), "80")
	 WebUI.sendKeys( findTestObject('Object Repository/District Central/District Success Plan/At a Glance/input_Club Growth_Goal_December') , "70")
	 
	 WebUI.sendKeys( findTestObject('Object Repository/District Central/District Success Plan/At a Glance/input_Club Growth_Goal_January') , "60")
	 WebUI.sendKeys( findTestObject('Object Repository/District Central/District Success Plan/At a Glance/input_Club Growth_Goal_February') , "50")
	 WebUI.sendKeys( findTestObject('Object Repository/District Central/District Success Plan/At a Glance/input_Club Growth_Goal_March') , "40")
	 WebUI.sendKeys( findTestObject('Object Repository/District Central/District Success Plan/At a Glance/input_Club Growth_Goal_April') , "30")
	 WebUI.sendKeys( findTestObject('Object Repository/District Central/District Success Plan/At a Glance/input_Club Growth_Goal_May') , "20")
	 WebUI.sendKeys( findTestObject('Object Repository/District Central/District Success Plan/At a Glance/input_Club Growth_Goal_June') , "10")
	 
	 
	 // Distinguished Growth
	 
	 WebUI.sendKeys( findTestObject('Object Repository/District Central/District Success Plan/At a Glance/input_Distinguished Growth_Goal_July') , "50")
	 WebUI.sendKeys( findTestObject('Object Repository/District Central/District Success Plan/At a Glance/input_Distinguished Growth_Goal_August') , "60")
	 WebUI.sendKeys( findTestObject('Object Repository/District Central/District Success Plan/At a Glance/input_Distinguished Growth_Goal_September') , "70")
	 WebUI.sendKeys( findTestObject('Object Repository/District Central/District Success Plan/At a Glance/input_Distinguished Growth_Goal_October') , "80")
	 WebUI.sendKeys( findTestObject('Object Repository/District Central/District Success Plan/At a Glance/input_Distinguished Growth_Goal_November')  , "90")
	 WebUI.sendKeys( findTestObject('Object Repository/District Central/District Success Plan/At a Glance/input_Distinguished Growth_Goal_December') , "100")
	 
	 WebUI.sendKeys( findTestObject('Object Repository/District Central/District Success Plan/At a Glance/input_Distinguished Growth_Goal_January') , "10")
	 WebUI.sendKeys( findTestObject('Object Repository/District Central/District Success Plan/At a Glance/input_Distinguished Growth_Goal_February') , "20")
	 WebUI.sendKeys( findTestObject('Object Repository/District Central/District Success Plan/At a Glance/input_Distinguished Growth_Goal_March') , "30")
	 WebUI.sendKeys( findTestObject('Object Repository/District Central/District Success Plan/At a Glance/input_Distinguished Growth_Goal_April') , "40")
	 WebUI.sendKeys( findTestObject('Object Repository/District Central/District Success Plan/At a Glance/input_Distinguished Growth_Goal_May') , "50")
	 WebUI.sendKeys( findTestObject('Object Repository/District Central/District Success Plan/At a Glance/input_Distinguished Growth_Goal_June') , "60")
	 
	 
	 // Click on Add a Goal button
	 
	 //WebUI.click( findTestObject('Object Repository/District Central/District Success Plan/At a Glance/div_Add a goal')  )
	 
	 WebUI.sendKeys( findTestObject('Object Repository/District Central/District Success Plan/At a Glance/input_Additional_Goal_Value') , "Average Goals")
	 
	 
	 WebUI.sendKeys( findTestObject('Object Repository/District Central/District Success Plan/At a Glance/input_Additional_Goal_Value_July'), "11.11")
	 WebUI.sendKeys( findTestObject('Object Repository/District Central/District Success Plan/At a Glance/input_Additional_Goal_Value_August'), "12.12")
	 WebUI.sendKeys( findTestObject('Object Repository/District Central/District Success Plan/At a Glance/input_Additional_Goal_Value_September'), "13.13")
	 WebUI.sendKeys( findTestObject('Object Repository/District Central/District Success Plan/At a Glance/input_Additional_Goal_Value_October'), "14.14")
	 WebUI.sendKeys( findTestObject('Object Repository/District Central/District Success Plan/At a Glance/input_Additional_Goal_Value_November'), "15.15")
	 WebUI.sendKeys( findTestObject('Object Repository/District Central/District Success Plan/At a Glance/input_Additional_Goal_Value_December'), "16.16")
	 
	 
	 WebUI.sendKeys( findTestObject('Object Repository/District Central/District Success Plan/At a Glance/input_Additional_Goal_Value_January'), "17.17")
	 WebUI.sendKeys( findTestObject('Object Repository/District Central/District Success Plan/At a Glance/input_Additional_Goal_Value_February'), "18.18")
	 WebUI.sendKeys( findTestObject('Object Repository/District Central/District Success Plan/At a Glance/input_Additional_Goal_Value_March'), "19.19")
	 WebUI.sendKeys( findTestObject('Object Repository/District Central/District Success Plan/At a Glance/input_Additional_Goal_Value_April'), "20.20")
	 WebUI.sendKeys( findTestObject('Object Repository/District Central/District Success Plan/At a Glance/input_Additional_Goal_Value_May'), "21.21")
	 WebUI.sendKeys( findTestObject('Object Repository/District Central/District Success Plan/At a Glance/input_Additional_Goal_Value_June') , "22.22")
	 
	 
	 //Click on save button
	
	 WebUI.click(  findTestObject('Object Repository/District Central/District Success Plan/Team Charter_Section1/button_Save') ) 
	
	 WebUI.click( findTestObject('Object Repository/District Central/District Success Plan/Team Charter_Section1/button_Ok')  )
	 
	 // Click on Submit button
	
	  WebUI.click( findTestObject('Object Repository/District Central/District Success Plan/Team Charter_Section1/button_Submit')  )
	 
	  */
	  
	
	//WebUI.click( findTestObject('Object Repository/District Central/District Success Plan/years_DropDown') )
	  
	WebUI.click(findTestObject('Object Repository/District Central/District Success Plan/At a Glance/div_Add a goal'))
	
		WebUI.sendKeys(findTestObject('Object Repository/District Central/District Success Plan/At a Glance/input_Additional_Goal_Value'),
			'Average Goals')
	
		WebUI.sendKeys(findTestObject('Object Repository/District Central/District Success Plan/At a Glance/input_Additional_Goal_Value_July'),
			'11.11')
	
		WebUI.sendKeys(findTestObject('Object Repository/District Central/District Success Plan/At a Glance/input_Additional_Goal_Value_August'),
			'12.12')
	
		WebUI.sendKeys(findTestObject('Object Repository/District Central/District Success Plan/At a Glance/input_Additional_Goal_Value_September'),
			'13.13')
	
		WebUI.sendKeys(findTestObject('Object Repository/District Central/District Success Plan/At a Glance/input_Additional_Goal_Value_October'),
			'14.14')
	
		WebUI.sendKeys(findTestObject('Object Repository/District Central/District Success Plan/At a Glance/input_Additional_Goal_Value_November'),
			'15.15')
	
		WebUI.sendKeys(findTestObject('Object Repository/District Central/District Success Plan/At a Glance/input_Additional_Goal_Value_December'),
			'16.16')
	
		WebUI.sendKeys(findTestObject('Object Repository/District Central/District Success Plan/At a Glance/input_Additional_Goal_Value_January'),
			'17.17')
	
		WebUI.sendKeys(findTestObject('Object Repository/District Central/District Success Plan/At a Glance/input_Additional_Goal_Value_February'),
			'18.18')
	
		WebUI.sendKeys(findTestObject('Object Repository/District Central/District Success Plan/At a Glance/input_Additional_Goal_Value_March'),
			'19.19')
	
		WebUI.sendKeys(findTestObject('Object Repository/District Central/District Success Plan/At a Glance/input_Additional_Goal_Value_April'),
			'20.20')
	
		WebUI.sendKeys(findTestObject('Object Repository/District Central/District Success Plan/At a Glance/input_Additional_Goal_Value_May'),
			'21.21')
	
		WebUI.sendKeys(findTestObject('Object Repository/District Central/District Success Plan/At a Glance/input_Additional_Goal_Value_June'),
			'22.22')
	
	
	print("..................................Pass")
	 if ( validationmessage =="Please fill out this field."  ) {
		

        GlobalVariable.vartestresult = 'PASS'

        GlobalVariable.varpassremarks = 'User Successfully get Validation message.'
    } else {
        print('FAIL...............................')

        GlobalVariable.vartestresult = 'FAIL'

        GlobalVariable.varfailremarks = 'User not getting validation message.'
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