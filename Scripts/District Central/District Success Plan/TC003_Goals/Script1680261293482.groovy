import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable

try {
    CustomKeywords.'com.application.DateTime.startTime'()

    WebUI.delay(3)

    // Goals
    WebUI.scrollToPosition(40, 50)

    WebUI.click(findTestObject('Object Repository/District Central/District Success Plan/Goals/a_Goals'))

    WebUI.delay(2)

    // Goal 1: Membership Payments Growth
	WebUI.waitForElementVisible(findTestObject('Object Repository/District Central/District Success Plan/Goals/textarea__SituationAnalysis'), 120)
	
    WebUI.clearText(findTestObject('Object Repository/District Central/District Success Plan/Goals/textarea__SituationAnalysis'))

    WebUI.delay(2)

    WebUI.sendKeys(findTestObject('Object Repository/District Central/District Success Plan/Goals/textarea__SituationAnalysis'), 
        CustomKeywords.'com.application.submitpayment.randomString'(20))

    WebUI.delay(2)

    WebUI.clearText(findTestObject('Object Repository/District Central/District Success Plan/Goals/textarea__Strategy'))

    WebUI.delay(2)

    WebUI.sendKeys(findTestObject('Object Repository/District Central/District Success Plan/Goals/textarea__Strategy'), 
        CustomKeywords.'com.application.submitpayment.randomString'(20))

    WebUI.delay(2)

    WebUI.clearText(findTestObject('Object Repository/District Central/District Success Plan/Goals/input_Strategy_Action1'))

    WebUI.delay(2)

    WebUI.sendKeys(findTestObject('Object Repository/District Central/District Success Plan/Goals/input_Strategy_Action1'), 
        CustomKeywords.'com.application.submitpayment.randomString'(20))

    WebUI.delay(2)

    WebUI.clearText(findTestObject('Object Repository/District Central/District Success Plan/Goals/input_Strategy_Action2'))

    WebUI.delay(2)

    WebUI.sendKeys(findTestObject('Object Repository/District Central/District Success Plan/Goals/input_Strategy_Action2'), 
        CustomKeywords.'com.application.submitpayment.randomString'(20))

    WebUI.delay(2)

    WebUI.clearText(findTestObject('Object Repository/District Central/District Success Plan/Goals/input_Strategy_Action3'))

    WebUI.delay(2)

    WebUI.sendKeys(findTestObject('Object Repository/District Central/District Success Plan/Goals/input_Strategy_Action3'), 
        CustomKeywords.'com.application.submitpayment.randomString'(20))

    WebUI.delay(2)

    WebUI.clearText(findTestObject('Object Repository/District Central/District Success Plan/Goals/input_Strategy_Action4'))

    WebUI.delay(2)

    WebUI.sendKeys(findTestObject('Object Repository/District Central/District Success Plan/Goals/input_Strategy_Action4'), 
        CustomKeywords.'com.application.submitpayment.randomString'(20))

    WebUI.delay(2)

    WebUI.clearText(findTestObject('Object Repository/District Central/District Success Plan/Goals/input_Strategy_Action5'))

    WebUI.delay(2)

    WebUI.sendKeys(findTestObject('Object Repository/District Central/District Success Plan/Goals/input_Strategy_Action5'), 
        CustomKeywords.'com.application.submitpayment.randomString'(20))

    WebUI.delay(2)

    WebUI.clearText(findTestObject('Object Repository/District Central/District Success Plan/Goals/textarea__Resources'))

    WebUI.delay(2)

    WebUI.sendKeys(findTestObject('Object Repository/District Central/District Success Plan/Goals/textarea__Resources'), 
        CustomKeywords.'com.application.submitpayment.randomString'(20))

    WebUI.delay(2)

    WebUI.clearText(findTestObject('Object Repository/District Central/District Success Plan/Goals/textarea__Assignments'))

    WebUI.delay(2)

    WebUI.sendKeys(findTestObject('Object Repository/District Central/District Success Plan/Goals/textarea__Assignments'), 
        CustomKeywords.'com.application.submitpayment.randomString'(20))

    WebUI.delay(2)

    WebUI.clearText(findTestObject('Object Repository/District Central/District Success Plan/Goals/input__AssignmentAction1'))

    WebUI.delay(2)

    WebUI.sendKeys(findTestObject('Object Repository/District Central/District Success Plan/Goals/input__AssignmentAction1'), 
        CustomKeywords.'com.application.submitpayment.randomString'(20))

    WebUI.delay(2)

    WebUI.clearText(findTestObject('Object Repository/District Central/District Success Plan/Goals/input__AssignmentAction2'))

    WebUI.delay(2)

    WebUI.sendKeys(findTestObject('Object Repository/District Central/District Success Plan/Goals/input__AssignmentAction2'), 
        CustomKeywords.'com.application.submitpayment.randomString'(20))

    WebUI.delay(2)

    WebUI.clearText(findTestObject('Object Repository/District Central/District Success Plan/Goals/input__AssignmentAction3'))

    WebUI.delay(2)

    WebUI.sendKeys(findTestObject('Object Repository/District Central/District Success Plan/Goals/input__AssignmentAction3'), 
        CustomKeywords.'com.application.submitpayment.randomString'(20))

    WebUI.delay(2)

    WebUI.clearText(findTestObject('Object Repository/District Central/District Success Plan/Goals/input__AssignmentAction4'))

    WebUI.delay(2)

    WebUI.sendKeys(findTestObject('Object Repository/District Central/District Success Plan/Goals/input__AssignmentAction4'), 
        CustomKeywords.'com.application.submitpayment.randomString'(20))

    WebUI.delay(2)

    WebUI.clearText(findTestObject('Object Repository/District Central/District Success Plan/Goals/input__AssignmentAction5'))

    WebUI.delay(2)

    WebUI.sendKeys(findTestObject('Object Repository/District Central/District Success Plan/Goals/input__AssignmentAction5'), 
        CustomKeywords.'com.application.submitpayment.randomString'(20))

    WebUI.delay(2)

    WebUI.clearText(findTestObject('Object Repository/District Central/District Success Plan/Goals/textarea__TimeTable'))

    WebUI.delay(2)

    WebUI.sendKeys(findTestObject('Object Repository/District Central/District Success Plan/Goals/textarea__TimeTable'), 
        CustomKeywords.'com.application.submitpayment.randomString'(20))

    WebUI.delay(2)

    WebUI.clearText(findTestObject('Object Repository/District Central/District Success Plan/Goals/input__TimeTableAction1'))

    WebUI.delay(2)

    WebUI.sendKeys(findTestObject('Object Repository/District Central/District Success Plan/Goals/input__TimeTableAction1'), 
        CustomKeywords.'com.application.submitpayment.randomString'(20))

    WebUI.delay(2)

    WebUI.clearText(findTestObject('Object Repository/District Central/District Success Plan/Goals/input__TimeTableAction2'))

    WebUI.delay(2)

    WebUI.sendKeys(findTestObject('Object Repository/District Central/District Success Plan/Goals/input__TimeTableAction2'), 
        CustomKeywords.'com.application.submitpayment.randomString'(20))

    WebUI.delay(2)

    WebUI.clearText(findTestObject('Object Repository/District Central/District Success Plan/Goals/input__TimeTableAction3'))

    WebUI.delay(2)

    WebUI.sendKeys(findTestObject('Object Repository/District Central/District Success Plan/Goals/input__TimeTableAction3'), 
        CustomKeywords.'com.application.submitpayment.randomString'(20))

    WebUI.delay(2)

    WebUI.clearText(findTestObject('Object Repository/District Central/District Success Plan/Goals/input__TimeTableAction4'))

    WebUI.delay(2)

    WebUI.sendKeys(findTestObject('Object Repository/District Central/District Success Plan/Goals/input__TimeTableAction4'), 
        CustomKeywords.'com.application.submitpayment.randomString'(20))

    WebUI.delay(2)

    WebUI.clearText(findTestObject('Object Repository/District Central/District Success Plan/Goals/input__TimeTableAction5'))

    WebUI.delay(2)

    WebUI.sendKeys(findTestObject('Object Repository/District Central/District Success Plan/Goals/input__TimeTableAction5'), 
        CustomKeywords.'com.application.submitpayment.randomString'(20))

    WebUI.delay(2)

    WebUI.click(findTestObject('Object Repository/District Central/District Success Plan/Team Charter_Section1/button_Save'))

    WebUI.delay(1)

    WebUI.mouseOver(findTestObject('Object Repository/District Central/District Success Plan/Team Charter_Section1/button_Ok'))

    WebUI.click(findTestObject('Object Repository/District Central/District Success Plan/Team Charter_Section1/button_Ok'))

    WebUI.delay(2)

    // Goal 2 : Club Growth
    WebUI.scrollToPosition(40, 50)

    WebUI.click(findTestObject('Object Repository/District Central/District Success Plan/Goals/a_Goal 2 Club Growth'))

    WebUI.delay(2)

    WebUI.clearText(findTestObject('Object Repository/District Central/District Success Plan/Goals/textarea__Goal_2_Club_Growth_SituationalAnalysis'))

    WebUI.delay(2)

    WebUI.sendKeys(findTestObject('Object Repository/District Central/District Success Plan/Goals/textarea__Goal_2_Club_Growth_SituationalAnalysis'), 
        CustomKeywords.'com.application.submitpayment.randomString'(20))

    WebUI.delay(2)

    WebUI.clearText(findTestObject('Object Repository/District Central/District Success Plan/Goals/textarea__Goal_2_Club_Growth_Strategy'))

    WebUI.delay(2)

    WebUI.sendKeys(findTestObject('Object Repository/District Central/District Success Plan/Goals/textarea__Goal_2_Club_Growth_Strategy'), 
        CustomKeywords.'com.application.submitpayment.randomString'(20))

    WebUI.delay(2)

    WebUI.clearText(findTestObject('Object Repository/District Central/District Success Plan/Goals/input__Goal_2_Club_Growth_Strategy_Action1'))

    WebUI.delay(2)

    WebUI.sendKeys(findTestObject('Object Repository/District Central/District Success Plan/Goals/input__Goal_2_Club_Growth_Strategy_Action1'), 
        CustomKeywords.'com.application.submitpayment.randomString'(20))

    WebUI.delay(2)

    WebUI.clearText(findTestObject('Object Repository/District Central/District Success Plan/Goals/input__Goal_2_Club_Growth_Strategy_Action2'))

    WebUI.delay(2)

    WebUI.sendKeys(findTestObject('Object Repository/District Central/District Success Plan/Goals/input__Goal_2_Club_Growth_Strategy_Action2'), 
        CustomKeywords.'com.application.submitpayment.randomString'(20))

    WebUI.delay(2)

    WebUI.clearText(findTestObject('Object Repository/District Central/District Success Plan/Goals/input_Goal_2_Club_Growth_Strategy_Action3'))

    WebUI.delay(2)

    WebUI.sendKeys(findTestObject('Object Repository/District Central/District Success Plan/Goals/input_Goal_2_Club_Growth_Strategy_Action3'), 
        CustomKeywords.'com.application.submitpayment.randomString'(20))

    WebUI.delay(2)

    WebUI.clearText(findTestObject('Object Repository/District Central/District Success Plan/Goals/input_Goal_2_Club_Growth_Strategy_Action4'))

    WebUI.delay(2)

    WebUI.sendKeys(findTestObject('Object Repository/District Central/District Success Plan/Goals/input_Goal_2_Club_Growth_Strategy_Action4'), 
        CustomKeywords.'com.application.submitpayment.randomString'(20))

    WebUI.delay(2)

    WebUI.clearText(findTestObject('Object Repository/District Central/District Success Plan/Goals/input_Goal_2_Club_Growth_Strategy_Action5'))

    WebUI.delay(2)

    WebUI.sendKeys(findTestObject('Object Repository/District Central/District Success Plan/Goals/input_Goal_2_Club_Growth_Strategy_Action5'), 
        CustomKeywords.'com.application.submitpayment.randomString'(20))

    WebUI.delay(2)

    WebUI.clearText(findTestObject('Object Repository/District Central/District Success Plan/Goals/textarea__Goal_2_Club_Growth_Resources'))

    WebUI.delay(2)

    WebUI.sendKeys(findTestObject('Object Repository/District Central/District Success Plan/Goals/textarea__Goal_2_Club_Growth_Resources'), 
        CustomKeywords.'com.application.submitpayment.randomString'(20))

    WebUI.delay(2)

    WebUI.clearText(findTestObject('Object Repository/District Central/District Success Plan/Goals/textarea__Goal_2_Club_Growth_Assignment'))

    WebUI.delay(2)

    WebUI.sendKeys(findTestObject('Object Repository/District Central/District Success Plan/Goals/textarea__Goal_2_Club_Growth_Assignment'), 
        CustomKeywords.'com.application.submitpayment.randomString'(20))

    WebUI.delay(2)

    WebUI.sendKeys(findTestObject('Object Repository/District Central/District Success Plan/Goals/input__Goal_2_Club_Growth_Assignment_Action1'), 
        CustomKeywords.'com.application.submitpayment.randomString'(20))

    WebUI.delay(2)

    WebUI.clearText(findTestObject('Object Repository/District Central/District Success Plan/Goals/input__Goal_2_Club_Growth_Assignment_Action2'))

    WebUI.delay(2)

    WebUI.sendKeys(findTestObject('Object Repository/District Central/District Success Plan/Goals/input__Goal_2_Club_Growth_Assignment_Action2'), 
        CustomKeywords.'com.application.submitpayment.randomString'(20))

    WebUI.delay(2)

    WebUI.clearText(findTestObject('Object Repository/District Central/District Success Plan/Goals/input_Goal_2_Club_Growth_Assignment_Action3'))

    WebUI.delay(2)

    WebUI.sendKeys(findTestObject('Object Repository/District Central/District Success Plan/Goals/input_Goal_2_Club_Growth_Assignment_Action3'), 
        CustomKeywords.'com.application.submitpayment.randomString'(20))

    WebUI.delay(2)

    WebUI.clearText(findTestObject('Object Repository/District Central/District Success Plan/Goals/input_Goal_2_Club_Growth_Assignment_Action4'))

    WebUI.delay(2)

    WebUI.sendKeys(findTestObject('Object Repository/District Central/District Success Plan/Goals/input_Goal_2_Club_Growth_Assignment_Action4'), 
        CustomKeywords.'com.application.submitpayment.randomString'(20))

    WebUI.delay(2)

    WebUI.clearText(findTestObject('Object Repository/District Central/District Success Plan/Goals/input_Goal_2_Club_Growth_Assignment_Action5'))

    WebUI.delay(2)

    WebUI.sendKeys(findTestObject('Object Repository/District Central/District Success Plan/Goals/input_Goal_2_Club_Growth_Assignment_Action5'), 
        CustomKeywords.'com.application.submitpayment.randomString'(20))

    WebUI.delay(2)

    WebUI.clearText(findTestObject('Object Repository/District Central/District Success Plan/Goals/Goals2/textarea_Goal_2_Club_Growth_Assignment_TimeTable'))

    WebUI.delay(2)

    WebUI.sendKeys(findTestObject('Object Repository/District Central/District Success Plan/Goals/Goals2/textarea_Goal_2_Club_Growth_Assignment_TimeTable'), 
        CustomKeywords.'com.application.submitpayment.randomString'(20))

    WebUI.delay(2)

    WebUI.clearText(findTestObject('Object Repository/District Central/District Success Plan/Goals/Goals2/input_Goal_2_Club_Growth_Assignment_TimeTable_Action1'))

    WebUI.delay(2)

    WebUI.sendKeys(findTestObject('Object Repository/District Central/District Success Plan/Goals/Goals2/input_Goal_2_Club_Growth_Assignment_TimeTable_Action1'), 
        CustomKeywords.'com.application.submitpayment.randomString'(20))

    WebUI.delay(2)

    WebUI.clearText(findTestObject('Object Repository/District Central/District Success Plan/Goals/Goals2/input_Goal_2_Club_Growth_Assignment_TimeTable_Action2'))

    WebUI.delay(2)

    WebUI.sendKeys(findTestObject('Object Repository/District Central/District Success Plan/Goals/Goals2/input_Goal_2_Club_Growth_Assignment_TimeTable_Action2'), 
        CustomKeywords.'com.application.submitpayment.randomString'(20))

    WebUI.delay(2)

    WebUI.clearText(findTestObject('Object Repository/District Central/District Success Plan/Goals/Goals2/input_Goal_2_Club_Growth_Assignment_TimeTable_Action3'))

    WebUI.delay(2)

    WebUI.sendKeys(findTestObject('Object Repository/District Central/District Success Plan/Goals/Goals2/input_Goal_2_Club_Growth_Assignment_TimeTable_Action3'), 
        CustomKeywords.'com.application.submitpayment.randomString'(20))

    WebUI.delay(2)

    WebUI.clearText(findTestObject('Object Repository/District Central/District Success Plan/Goals/Goals2/input_Goal_2_Club_Growth_Assignment_TimeTable_Action4'))

    WebUI.delay(2)

    WebUI.sendKeys(findTestObject('Object Repository/District Central/District Success Plan/Goals/Goals2/input_Goal_2_Club_Growth_Assignment_TimeTable_Action4'), 
        CustomKeywords.'com.application.submitpayment.randomString'(20))

    WebUI.delay(2)

    WebUI.clearText(findTestObject('Object Repository/District Central/District Success Plan/Goals/Goals2/input_Goal_2_Club_Growth_Assignment_TimeTable_Action5'))

    WebUI.delay(2)

    WebUI.sendKeys(findTestObject('Object Repository/District Central/District Success Plan/Goals/Goals2/input_Goal_2_Club_Growth_Assignment_TimeTable_Action5'), 
        CustomKeywords.'com.application.submitpayment.randomString'(20))

    WebUI.delay(2)

    WebUI.click(findTestObject('Object Repository/District Central/District Success Plan/Team Charter_Section1/button_Save'))

    WebUI.delay(1)

    WebUI.mouseOver(findTestObject('Object Repository/District Central/District Success Plan/Team Charter_Section1/button_Ok'))

    WebUI.click(findTestObject('Object Repository/District Central/District Success Plan/Team Charter_Section1/button_Ok'))

    WebUI.delay(2)

    // Goal 3 : Distinguished Clubs
    WebUI.scrollToPosition(40, 50)

    WebUI.click(findTestObject('Object Repository/District Central/District Success Plan/Goals/Goals2/a_Goal 3 Distinguished Clubs'))

    WebUI.delay(2)

    WebUI.clearText(findTestObject('Object Repository/District Central/District Success Plan/Goals/Goals2/textarea__Goal_3_Distinguished_Clubs_SituationsAnalysis'))

    WebUI.delay(2)

    WebUI.sendKeys(findTestObject('Object Repository/District Central/District Success Plan/Goals/Goals2/textarea__Goal_3_Distinguished_Clubs_SituationsAnalysis'), 
        CustomKeywords.'com.application.submitpayment.randomString'(20))

    WebUI.delay(2)

    WebUI.clearText(findTestObject('Object Repository/District Central/District Success Plan/Goals/Goals2/textarea__Goal_3_Distinguished_Clubs_Strategy'))

    WebUI.delay(2)

    WebUI.sendKeys(findTestObject('Object Repository/District Central/District Success Plan/Goals/Goals2/textarea__Goal_3_Distinguished_Clubs_Strategy'), 
        CustomKeywords.'com.application.submitpayment.randomString'(20))

    WebUI.delay(2)

    WebUI.clearText(findTestObject('Object Repository/District Central/District Success Plan/Goals/Goals2/input__Goal_3_Distinguished_Clubs_Strategy_Action1'))

    WebUI.delay(2)

    WebUI.sendKeys(findTestObject('Object Repository/District Central/District Success Plan/Goals/Goals2/input__Goal_3_Distinguished_Clubs_Strategy_Action1'), 
        CustomKeywords.'com.application.submitpayment.randomString'(20))

    WebUI.delay(2)

    WebUI.clearText(findTestObject('Object Repository/District Central/District Success Plan/Goals/Goals2/input__Goal_3_Distinguished_Clubs_Strategy_Action2'))

    WebUI.delay(2)

    WebUI.sendKeys(findTestObject('Object Repository/District Central/District Success Plan/Goals/Goals2/input__Goal_3_Distinguished_Clubs_Strategy_Action2'), 
        CustomKeywords.'com.application.submitpayment.randomString'(20))

    WebUI.delay(2)

    WebUI.clearText(findTestObject('Object Repository/District Central/District Success Plan/Goals/Goals2/input__Goal_3_Distinguished_Clubs_Strategy_Action3'))

    WebUI.delay(2)

    WebUI.sendKeys(findTestObject('Object Repository/District Central/District Success Plan/Goals/Goals2/input__Goal_3_Distinguished_Clubs_Strategy_Action3'), 
        CustomKeywords.'com.application.submitpayment.randomString'(20))

    WebUI.delay(2)

    WebUI.clearText(findTestObject('Object Repository/District Central/District Success Plan/Goals/Goals2/input__Goal_3_Distinguished_Clubs_Strategy_Action4'))

    WebUI.delay(2)

    WebUI.sendKeys(findTestObject('Object Repository/District Central/District Success Plan/Goals/Goals2/input__Goal_3_Distinguished_Clubs_Strategy_Action4'), 
        CustomKeywords.'com.application.submitpayment.randomString'(20))

    WebUI.delay(2)

    WebUI.clearText(findTestObject('Object Repository/District Central/District Success Plan/Goals/Goals2/input__Goal_3_Distinguished_Clubs_Strategy_Action5'))

    WebUI.delay(2)

    WebUI.sendKeys(findTestObject('Object Repository/District Central/District Success Plan/Goals/Goals2/input__Goal_3_Distinguished_Clubs_Strategy_Action5'), 
        CustomKeywords.'com.application.submitpayment.randomString'(20))

    WebUI.delay(2)

    WebUI.clearText(findTestObject('Object Repository/District Central/District Success Plan/Goals/Goals2/textarea__Goal_3_Distinguished_Clubs_Resources'))

    WebUI.delay(2)

    WebUI.sendKeys(findTestObject('Object Repository/District Central/District Success Plan/Goals/Goals2/textarea__Goal_3_Distinguished_Clubs_Resources'), 
        CustomKeywords.'com.application.submitpayment.randomString'(20))

    WebUI.delay(2)

    WebUI.clearText(findTestObject('Object Repository/District Central/District Success Plan/Goals/Goals2/textarea__Goal_3_Distinguished_Clubs_Assignment'))

    WebUI.delay(2)

    WebUI.sendKeys(findTestObject('Object Repository/District Central/District Success Plan/Goals/Goals2/textarea__Goal_3_Distinguished_Clubs_Assignment'), 
        CustomKeywords.'com.application.submitpayment.randomString'(20))

    WebUI.delay(2)

    WebUI.clearText(findTestObject('Object Repository/District Central/District Success Plan/Goals/Goals2/input__Goal_3_Distinguished_Clubs_Assignment_Action1'))

    WebUI.delay(2)

    WebUI.sendKeys(findTestObject('Object Repository/District Central/District Success Plan/Goals/Goals2/input__Goal_3_Distinguished_Clubs_Assignment_Action1'), 
        CustomKeywords.'com.application.submitpayment.randomString'(20))

    WebUI.delay(2)

    WebUI.clearText(findTestObject('Object Repository/District Central/District Success Plan/Goals/Goals2/input__Goal_3_Distinguished_Clubs_Assignment_Action2'))

    WebUI.delay(2)

    WebUI.sendKeys(findTestObject('Object Repository/District Central/District Success Plan/Goals/Goals2/input__Goal_3_Distinguished_Clubs_Assignment_Action2'), 
        CustomKeywords.'com.application.submitpayment.randomString'(20))

    WebUI.delay(2)

    WebUI.clearText(findTestObject('Object Repository/District Central/District Success Plan/Goals/Goals2/input__Goal_3_Distinguished_Clubs_Assignment_Action3'))

    WebUI.delay(2)

    WebUI.sendKeys(findTestObject('Object Repository/District Central/District Success Plan/Goals/Goals2/input__Goal_3_Distinguished_Clubs_Assignment_Action3'), 
        CustomKeywords.'com.application.submitpayment.randomString'(20))

    WebUI.delay(2)

    WebUI.clearText(findTestObject('Object Repository/District Central/District Success Plan/Goals/Goals2/input__Goal_3_Distinguished_Clubs_Assignment_Action4'))

    WebUI.delay(2)

    WebUI.sendKeys(findTestObject('Object Repository/District Central/District Success Plan/Goals/Goals2/input__Goal_3_Distinguished_Clubs_Assignment_Action4'), 
        CustomKeywords.'com.application.submitpayment.randomString'(20))

    WebUI.delay(2)

    WebUI.clearText(findTestObject('Object Repository/District Central/District Success Plan/Goals/Goals2/input__Goal_3_Distinguished_Clubs_Assignment_Action5'))

    WebUI.delay(2)

    WebUI.sendKeys(findTestObject('Object Repository/District Central/District Success Plan/Goals/Goals2/input__Goal_3_Distinguished_Clubs_Assignment_Action5'), 
        CustomKeywords.'com.application.submitpayment.randomString'(20))

    WebUI.delay(2)

    WebUI.clearText(findTestObject('Object Repository/District Central/District Success Plan/Goals/Goals2/textarea__Goal_3_Distinguished_Clubs_TimeTable'))

    WebUI.delay(2)

    WebUI.sendKeys(findTestObject('Object Repository/District Central/District Success Plan/Goals/Goals2/textarea__Goal_3_Distinguished_Clubs_TimeTable'), 
        CustomKeywords.'com.application.submitpayment.randomString'(20))

    WebUI.delay(2)

    WebUI.clearText(findTestObject('Object Repository/District Central/District Success Plan/Goals/Goals2/input__Goal_3_Distinguished_Clubs_TimeTable_Action1'))

    WebUI.delay(2)

    WebUI.sendKeys(findTestObject('Object Repository/District Central/District Success Plan/Goals/Goals2/input__Goal_3_Distinguished_Clubs_TimeTable_Action1'), 
        CustomKeywords.'com.application.submitpayment.randomString'(20))

    WebUI.delay(2)

    WebUI.clearText(findTestObject('Object Repository/District Central/District Success Plan/Goals/Goals2/input__Goal_3_Distinguished_Clubs_TimeTable_Action2'))

    WebUI.delay(2)

    WebUI.sendKeys(findTestObject('Object Repository/District Central/District Success Plan/Goals/Goals2/input__Goal_3_Distinguished_Clubs_TimeTable_Action2'), 
        CustomKeywords.'com.application.submitpayment.randomString'(20))

    WebUI.delay(2)

    WebUI.clearText(findTestObject('Object Repository/District Central/District Success Plan/Goals/Goals2/input__Goal_3_Distinguished_Clubs_TimeTable_Action3'))

    WebUI.delay(2)

    WebUI.sendKeys(findTestObject('Object Repository/District Central/District Success Plan/Goals/Goals2/input__Goal_3_Distinguished_Clubs_TimeTable_Action3'), 
        CustomKeywords.'com.application.submitpayment.randomString'(20))

    WebUI.delay(2)

    WebUI.clearText(findTestObject('Object Repository/District Central/District Success Plan/Goals/Goals2/input__Goal_3_Distinguished_Clubs_TimeTable_Action4'))

    WebUI.delay(2)

    WebUI.sendKeys(findTestObject('Object Repository/District Central/District Success Plan/Goals/Goals2/input__Goal_3_Distinguished_Clubs_TimeTable_Action4'), 
        CustomKeywords.'com.application.submitpayment.randomString'(20))

    WebUI.delay(2)

    WebUI.clearText(findTestObject('Object Repository/District Central/District Success Plan/Goals/Goals2/input_Goal_3_Distinguished_Clubs_TimeTable_Action5'))

    WebUI.delay(2)

    WebUI.sendKeys(findTestObject('Object Repository/District Central/District Success Plan/Goals/Goals2/input_Goal_3_Distinguished_Clubs_TimeTable_Action5'), 
        CustomKeywords.'com.application.submitpayment.randomString'(20))

    WebUI.delay(2)

    WebUI.click(findTestObject('Object Repository/District Central/District Success Plan/Team Charter_Section1/button_Save'))

    WebUI.delay(1)

    WebUI.mouseOver(findTestObject('Object Repository/District Central/District Success Plan/Team Charter_Section1/button_Ok'))

    WebUI.click(findTestObject('Object Repository/District Central/District Success Plan/Team Charter_Section1/button_Ok'))

    WebUI.delay(2)

    // Additional Goals
   /* WebUI.scrollToPosition(40, 50)

    WebUI.click(findTestObject('Object Repository/District Central/District Success Plan/AdditionalGoals/a_Additional Goals'))

    WebUI.delay(2)

    WebUI.clearText(findTestObject('Object Repository/District Central/District Success Plan/AdditionalGoals/textarea__ImproveentInTheDistrict'))

    WebUI.delay(2)

    WebUI.sendKeys(findTestObject('Object Repository/District Central/District Success Plan/AdditionalGoals/textarea__ImproveentInTheDistrict'), 
        CustomKeywords.'com.application.submitpayment.randomString'(20))

    WebUI.delay(2)

    WebUI.clearText(findTestObject('Object Repository/District Central/District Success Plan/AdditionalGoals/textarea__SituationalAnaliysis'))

    WebUI.delay(2)

    WebUI.sendKeys(findTestObject('Object Repository/District Central/District Success Plan/AdditionalGoals/textarea__SituationalAnaliysis'), 
        CustomKeywords.'com.application.submitpayment.randomString'(20))

    WebUI.delay(2)

    WebUI.clearText(findTestObject('Object Repository/District Central/District Success Plan/AdditionalGoals/textarea__Strategy'))

    WebUI.delay(2)

    WebUI.sendKeys(findTestObject('Object Repository/District Central/District Success Plan/AdditionalGoals/textarea__Strategy'), 
        CustomKeywords.'com.application.submitpayment.randomString'(20))

    WebUI.delay(2)

    WebUI.clearText(findTestObject('Object Repository/District Central/District Success Plan/AdditionalGoals/input__Additional Goals_Strategy_Action1'))

    WebUI.delay(2)

    WebUI.sendKeys(findTestObject('Object Repository/District Central/District Success Plan/AdditionalGoals/input__Additional Goals_Strategy_Action1'), 
        CustomKeywords.'com.application.submitpayment.randomString'(20))

    WebUI.delay(2)

    WebUI.clearText(findTestObject('Object Repository/District Central/District Success Plan/AdditionalGoals/input__Additional Goals_Strategy_Action2'))

    WebUI.delay(2)

    WebUI.sendKeys(findTestObject('Object Repository/District Central/District Success Plan/AdditionalGoals/input__Additional Goals_Strategy_Action2'), 
        CustomKeywords.'com.application.submitpayment.randomString'(20))

    WebUI.delay(2)

    WebUI.clearText(findTestObject('Object Repository/District Central/District Success Plan/AdditionalGoals/input__Additional Goals_Strategy_Action3'))

    WebUI.delay(2)

    WebUI.sendKeys(findTestObject('Object Repository/District Central/District Success Plan/AdditionalGoals/input__Additional Goals_Strategy_Action3'), 
        CustomKeywords.'com.application.submitpayment.randomString'(20))

    WebUI.delay(2)

    WebUI.clearText(findTestObject('Object Repository/District Central/District Success Plan/AdditionalGoals/input__Additional Goals_Strategy_Action4'))

    WebUI.delay(2)

    WebUI.sendKeys(findTestObject('Object Repository/District Central/District Success Plan/AdditionalGoals/input__Additional Goals_Strategy_Action4'), 
        CustomKeywords.'com.application.submitpayment.randomString'(20))

    WebUI.delay(2)

    WebUI.clearText(findTestObject('Object Repository/District Central/District Success Plan/AdditionalGoals/input__Additional Goals_Strategy_Action5'))

    WebUI.delay(2)

    WebUI.sendKeys(findTestObject('Object Repository/District Central/District Success Plan/AdditionalGoals/input__Additional Goals_Strategy_Action5'), 
        CustomKeywords.'com.application.submitpayment.randomString'(20))

    WebUI.delay(2)

    WebUI.clearText(findTestObject('Object Repository/District Central/District Success Plan/AdditionalGoals/textarea__Resources'))

    WebUI.delay(2)

    WebUI.sendKeys(findTestObject('Object Repository/District Central/District Success Plan/AdditionalGoals/textarea__Resources'), 
        CustomKeywords.'com.application.submitpayment.randomString'(20))

    WebUI.delay(2)

    WebUI.clearText(findTestObject('Object Repository/District Central/District Success Plan/AdditionalGoals/textarea__Assignments'))

    WebUI.delay(2)

    WebUI.sendKeys(findTestObject('Object Repository/District Central/District Success Plan/AdditionalGoals/textarea__Assignments'), 
        CustomKeywords.'com.application.submitpayment.randomString'(20))

    WebUI.delay(2)

    WebUI.clearText(findTestObject('Object Repository/District Central/District Success Plan/AdditionalGoals/input__Additional Goals_Assignments_Action1'))

    WebUI.delay(2)

    WebUI.sendKeys(findTestObject('Object Repository/District Central/District Success Plan/AdditionalGoals/input__Additional Goals_Assignments_Action1'), 
        CustomKeywords.'com.application.submitpayment.randomString'(20))

    WebUI.delay(2)

    WebUI.clearText(findTestObject('Object Repository/District Central/District Success Plan/AdditionalGoals/input__Additional Goals_Assignments_Action2'))

    WebUI.delay(2)

    WebUI.sendKeys(findTestObject('Object Repository/District Central/District Success Plan/AdditionalGoals/input__Additional Goals_Assignments_Action2'), 
        CustomKeywords.'com.application.submitpayment.randomString'(20))

    WebUI.delay(2)

    WebUI.clearText(findTestObject('Object Repository/District Central/District Success Plan/AdditionalGoals/input__Additional Goals_Assignments_Action3'))

    WebUI.delay(2)

    WebUI.sendKeys(findTestObject('Object Repository/District Central/District Success Plan/AdditionalGoals/input__Additional Goals_Assignments_Action3'), 
        CustomKeywords.'com.application.submitpayment.randomString'(20))

    WebUI.delay(2)

    WebUI.clearText(findTestObject('Object Repository/District Central/District Success Plan/AdditionalGoals/input__Additional Goals_Assignments_Action4'))

    WebUI.delay(2)

    WebUI.sendKeys(findTestObject('Object Repository/District Central/District Success Plan/AdditionalGoals/input__Additional Goals_Assignments_Action4'), 
        CustomKeywords.'com.application.submitpayment.randomString'(20))

    WebUI.delay(2)

    WebUI.clearText(findTestObject('Object Repository/District Central/District Success Plan/AdditionalGoals/input__Additional Goals_Assignments_Action5'))

    WebUI.delay(2)

    WebUI.sendKeys(findTestObject('Object Repository/District Central/District Success Plan/AdditionalGoals/input__Additional Goals_Assignments_Action5'), 
        CustomKeywords.'com.application.submitpayment.randomString'(20))

    WebUI.delay(2)

    WebUI.clearText(findTestObject('Object Repository/District Central/District Success Plan/AdditionalGoals/textarea__TimeTable'))

    WebUI.delay(2)

    WebUI.sendKeys(findTestObject('Object Repository/District Central/District Success Plan/AdditionalGoals/textarea__TimeTable'), 
        CustomKeywords.'com.application.submitpayment.randomString'(20))

    WebUI.delay(2)

    WebUI.clearText(findTestObject('Object Repository/District Central/District Success Plan/AdditionalGoals/input__Additional Goals_TimeTable_Action1'))

    WebUI.delay(2)

    WebUI.sendKeys(findTestObject('Object Repository/District Central/District Success Plan/AdditionalGoals/input__Additional Goals_TimeTable_Action1'), 
        CustomKeywords.'com.application.submitpayment.randomString'(20))

    WebUI.delay(2)

    WebUI.clearText(findTestObject('Object Repository/District Central/District Success Plan/AdditionalGoals/input__Additional Goals_TimeTable_Action2'))

    WebUI.delay(2)

    WebUI.sendKeys(findTestObject('Object Repository/District Central/District Success Plan/AdditionalGoals/input__Additional Goals_TimeTable_Action2'), 
        CustomKeywords.'com.application.submitpayment.randomString'(20))

    WebUI.delay(2)

    WebUI.clearText(findTestObject('Object Repository/District Central/District Success Plan/AdditionalGoals/input__Additional Goals_TimeTable_Action3'))

    WebUI.delay(2)

    WebUI.sendKeys(findTestObject('Object Repository/District Central/District Success Plan/AdditionalGoals/input__Additional Goals_TimeTable_Action3'), 
        CustomKeywords.'com.application.submitpayment.randomString'(20))

    WebUI.delay(2)

    WebUI.clearText(findTestObject('Object Repository/District Central/District Success Plan/AdditionalGoals/input__Additional Goals_TimeTable_Action4'))

    WebUI.delay(2)

    WebUI.sendKeys(findTestObject('Object Repository/District Central/District Success Plan/AdditionalGoals/input__Additional Goals_TimeTable_Action4'), 
        CustomKeywords.'com.application.submitpayment.randomString'(20))

    WebUI.delay(2)

    WebUI.clearText(findTestObject('Object Repository/District Central/District Success Plan/AdditionalGoals/input__Additional Goals_TimeTable_Action5'))

    WebUI.delay(2)

    WebUI.sendKeys(findTestObject('Object Repository/District Central/District Success Plan/AdditionalGoals/input__Additional Goals_TimeTable_Action5'), 
        CustomKeywords.'com.application.submitpayment.randomString'(20))

    WebUI.delay(2)

    WebUI.click(findTestObject('Object Repository/District Central/District Success Plan/Team Charter_Section1/button_Save'))

    WebUI.delay(1)

    WebUI.mouseOver(findTestObject('Object Repository/District Central/District Success Plan/Team Charter_Section1/button_Ok'))

    WebUI.click(findTestObject('Object Repository/District Central/District Success Plan/Team Charter_Section1/button_Ok'))

    WebUI.delay(5)*/

    //  At a Glance
    /*WebUI.scrollToPosition(40, 50)

    WebUI.click(findTestObject('Object Repository/District Central/District Success Plan/At a Glance/a_At a Glance'))

    WebUI.delay(2)

    // Membership Payment Growth
    WebUI.clearText(findTestObject('Object Repository/District Central/District Success Plan/At a Glance/input_Membership Payments Growth_Goal_July'))

    WebUI.delay(2)

    WebUI.sendKeys(findTestObject('Object Repository/District Central/District Success Plan/At a Glance/input_Membership Payments Growth_Goal_July'), 
        CustomKeywords.'com.application.submitpayment.randomString'(20))

    WebUI.delay(2)

    WebUI.clearText(findTestObject('Object Repository/District Central/District Success Plan/At a Glance/input_Membership Payments Growth_Goal_August'))

    WebUI.delay(2)

    WebUI.sendKeys(findTestObject('Object Repository/District Central/District Success Plan/At a Glance/input_Membership Payments Growth_Goal_August'), 
        CustomKeywords.'com.application.submitpayment.randomString'(20))

    WebUI.delay(2)

    WebUI.clearText(findTestObject('Object Repository/District Central/District Success Plan/At a Glance/input_Membership Payments Growth_Goal_September'))

    WebUI.delay(2)

    WebUI.sendKeys(findTestObject('Object Repository/District Central/District Success Plan/At a Glance/input_Membership Payments Growth_Goal_September'), 
        CustomKeywords.'com.application.submitpayment.randomString'(20))

    WebUI.delay(2)

    WebUI.clearText(findTestObject('Object Repository/District Central/District Success Plan/At a Glance/input_Membership Payments Growth_Goal_October'))

    WebUI.delay(2)

    WebUI.sendKeys(findTestObject('Object Repository/District Central/District Success Plan/At a Glance/input_Membership Payments Growth_Goal_October'), 
        CustomKeywords.'com.application.submitpayment.randomString'(20))

    WebUI.delay(2)

    WebUI.clearText(findTestObject('Object Repository/District Central/District Success Plan/At a Glance/input_Membership Payments Growth_Goal_November'))

    WebUI.delay(2)

    WebUI.sendKeys(findTestObject('Object Repository/District Central/District Success Plan/At a Glance/input_Membership Payments Growth_Goal_November'), 
        CustomKeywords.'com.application.submitpayment.randomString'(20))

    WebUI.delay(2)

    WebUI.clearText(findTestObject('Object Repository/District Central/District Success Plan/At a Glance/input_Membership Payments Growth_Goal_December'))

    WebUI.delay(2)

    WebUI.sendKeys(findTestObject('Object Repository/District Central/District Success Plan/At a Glance/input_Membership Payments Growth_Goal_December'), 
        CustomKeywords.'com.application.submitpayment.randomString'(20))

    WebUI.delay(2)

    WebUI.clearText(findTestObject('Object Repository/District Central/District Success Plan/At a Glance/input_Membership Payments Growth_Goal_January'))

    WebUI.delay(2)

    WebUI.sendKeys(findTestObject('Object Repository/District Central/District Success Plan/At a Glance/input_Membership Payments Growth_Goal_January'), 
        CustomKeywords.'com.application.submitpayment.randomString'(20))

    WebUI.delay(2)

    WebUI.clearText(findTestObject('Object Repository/District Central/District Success Plan/At a Glance/input_Membership Payments Growth_Goal_February'))

    WebUI.delay(2)

    WebUI.sendKeys(findTestObject('Object Repository/District Central/District Success Plan/At a Glance/input_Membership Payments Growth_Goal_February'), 
        CustomKeywords.'com.application.submitpayment.randomString'(20))

    WebUI.delay(2)

    WebUI.clearText(findTestObject('Object Repository/District Central/District Success Plan/At a Glance/input_Membership Payments Growth_Goal_March'))

    WebUI.delay(2)

    WebUI.sendKeys(findTestObject('Object Repository/District Central/District Success Plan/At a Glance/input_Membership Payments Growth_Goal_March'), 
        CustomKeywords.'com.application.submitpayment.randomString'(20))

    WebUI.delay(2)

    WebUI.clearText(findTestObject('Object Repository/District Central/District Success Plan/At a Glance/input_Membership Payments Growth_Goal_April'))

    WebUI.delay(2)

    WebUI.sendKeys(findTestObject('Object Repository/District Central/District Success Plan/At a Glance/input_Membership Payments Growth_Goal_April'), 
        CustomKeywords.'com.application.submitpayment.randomString'(20))

    WebUI.delay(2)

    WebUI.clearText(findTestObject('Object Repository/District Central/District Success Plan/At a Glance/input_Membership Payments Growth_Goal_May'))

    WebUI.delay(2)

    WebUI.sendKeys(findTestObject('Object Repository/District Central/District Success Plan/At a Glance/input_Membership Payments Growth_Goal_May'), 
        CustomKeywords.'com.application.submitpayment.randomString'(20))

    WebUI.delay(2)

    WebUI.clearText(findTestObject('Object Repository/District Central/District Success Plan/At a Glance/input_Membership Payments Growth_Goal_June'))

    WebUI.delay(2)

    WebUI.sendKeys(findTestObject('Object Repository/District Central/District Success Plan/At a Glance/input_Membership Payments Growth_Goal_June'), 
        CustomKeywords.'com.application.submitpayment.randomString'(20))

    WebUI.delay(2)

    //Club Growth
    WebUI.sendKeys(findTestObject('Object Repository/District Central/District Success Plan/At a Glance/input_Club Growth_Goal_July'), 
        CustomKeywords.'com.application.submitpayment.randomString'(20))

    WebUI.delay(2)

    WebUI.sendKeys(findTestObject('Object Repository/District Central/District Success Plan/At a Glance/input_Club Growth_Goal_August'), 
        CustomKeywords.'com.application.submitpayment.randomString'(20))

    WebUI.delay(2)

    WebUI.sendKeys(findTestObject('Object Repository/District Central/District Success Plan/At a Glance/input_Club Growth_Goal_September'), 
        CustomKeywords.'com.application.submitpayment.randomString'(20))

    WebUI.delay(2)

    WebUI.sendKeys(findTestObject('Object Repository/District Central/District Success Plan/At a Glance/input_Club Growth_Goal_October'), 
        CustomKeywords.'com.application.submitpayment.randomString'(20))

    WebUI.delay(2)

    WebUI.sendKeys(findTestObject('Object Repository/District Central/District Success Plan/At a Glance/input_Club Growth_Goal_November'), 
        CustomKeywords.'com.application.submitpayment.randomString'(20))

    WebUI.delay(2)

    WebUI.sendKeys(findTestObject('Object Repository/District Central/District Success Plan/At a Glance/input_Club Growth_Goal_December'), 
        CustomKeywords.'com.application.submitpayment.randomString'(20))

    WebUI.delay(2)

    WebUI.sendKeys(findTestObject('Object Repository/District Central/District Success Plan/At a Glance/input_Club Growth_Goal_January'), 
        CustomKeywords.'com.application.submitpayment.randomString'(20))

    WebUI.delay(2)

    WebUI.sendKeys(findTestObject('Object Repository/District Central/District Success Plan/At a Glance/input_Club Growth_Goal_February'), 
        CustomKeywords.'com.application.submitpayment.randomString'(20))

    WebUI.delay(2)

    WebUI.sendKeys(findTestObject('Object Repository/District Central/District Success Plan/At a Glance/input_Club Growth_Goal_March'), 
        CustomKeywords.'com.application.submitpayment.randomString'(20))

    WebUI.delay(2)

    WebUI.sendKeys(findTestObject('Object Repository/District Central/District Success Plan/At a Glance/input_Club Growth_Goal_April'), 
        CustomKeywords.'com.application.submitpayment.randomString'(20))

    WebUI.delay(2)

    WebUI.sendKeys(findTestObject('Object Repository/District Central/District Success Plan/At a Glance/input_Club Growth_Goal_May'), 
        CustomKeywords.'com.application.submitpayment.randomString'(20))

    WebUI.delay(2)

    WebUI.sendKeys(findTestObject('Object Repository/District Central/District Success Plan/At a Glance/input_Club Growth_Goal_June'), 
        CustomKeywords.'com.application.submitpayment.randomString'(20))

    WebUI.delay(2)*/

    // Distinguished Growth
   /* WebUI.sendKeys(findTestObject('Object Repository/District Central/District Success Plan/At a Glance/input_Distinguished Growth_Goal_July'), 
        CustomKeywords.'com.application.submitpayment.randomString'(20))

    WebUI.delay(2)

    WebUI.sendKeys(findTestObject('Object Repository/District Central/District Success Plan/At a Glance/input_Distinguished Growth_Goal_August'), 
        CustomKeywords.'com.application.submitpayment.randomString'(20))

    WebUI.delay(2)

    WebUI.sendKeys(findTestObject('Object Repository/District Central/District Success Plan/At a Glance/input_Distinguished Growth_Goal_September'), 
        CustomKeywords.'com.application.submitpayment.randomString'(20))

    WebUI.delay(2)

    WebUI.sendKeys(findTestObject('Object Repository/District Central/District Success Plan/At a Glance/input_Distinguished Growth_Goal_October'), 
        CustomKeywords.'com.application.submitpayment.randomString'(20))

    WebUI.delay(2)

    WebUI.sendKeys(findTestObject('Object Repository/District Central/District Success Plan/At a Glance/input_Distinguished Growth_Goal_November'), 
        CustomKeywords.'com.application.submitpayment.randomString'(20))

    WebUI.delay(2)

    WebUI.sendKeys(findTestObject('Object Repository/District Central/District Success Plan/At a Glance/input_Distinguished Growth_Goal_December'), 
        CustomKeywords.'com.application.submitpayment.randomString'(20))

    WebUI.delay(2)

    WebUI.sendKeys(findTestObject('Object Repository/District Central/District Success Plan/At a Glance/input_Distinguished Growth_Goal_January'), 
        CustomKeywords.'com.application.submitpayment.randomString'(20))

    WebUI.delay(2)

    WebUI.sendKeys(findTestObject('Object Repository/District Central/District Success Plan/At a Glance/input_Distinguished Growth_Goal_February'), 
        CustomKeywords.'com.application.submitpayment.randomString'(20))

    WebUI.delay(2)

    WebUI.sendKeys(findTestObject('Object Repository/District Central/District Success Plan/At a Glance/input_Distinguished Growth_Goal_March'), 
        CustomKeywords.'com.application.submitpayment.randomString'(20))

    WebUI.delay(2)

    WebUI.sendKeys(findTestObject('Object Repository/District Central/District Success Plan/At a Glance/input_Distinguished Growth_Goal_April'), 
        CustomKeywords.'com.application.submitpayment.randomString'(20))

    WebUI.delay(2)

    WebUI.sendKeys(findTestObject('Object Repository/District Central/District Success Plan/At a Glance/input_Distinguished Growth_Goal_May'), 
        CustomKeywords.'com.application.submitpayment.randomString'(20))

    WebUI.delay(2)

    WebUI.sendKeys(findTestObject('Object Repository/District Central/District Success Plan/At a Glance/input_Distinguished Growth_Goal_June'), 
        CustomKeywords.'com.application.submitpayment.randomString'(20))

    WebUI.delay(2)*/

    // Click on Add a Goal button
    /*	WebUI.delay(8)

WebUI.mouseOver( findTestObject('Object Repository/District Central/District Success Plan/At a Glance/div_Add a goal')  )
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
*/
    /*WebUI.click(findTestObject('Object Repository/District Central/Division and Area Director Training/button_SaveButton'))

    WebUI.delay(2)*/
	
	if (WebUI.verifyElementVisible(findTestObject('Object Repository/District Central/District Success Plan/ThankYou_Message'))) {
		
		
		GlobalVariable.vartestresult = 'PASS'

		GlobalVariable.varpassremarks = 'User is able to submit the additional goals.'
	} else {
		print('FAIL...............................')

		GlobalVariable.vartestresult = 'FAIL'

		GlobalVariable.varfailremarks = 'User is Unable to submit additional goals.'
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