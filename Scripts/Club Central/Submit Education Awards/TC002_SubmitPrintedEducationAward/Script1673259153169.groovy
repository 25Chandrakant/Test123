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
import org.junit.After as After
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

    
    WebUI.delay(3)
	
	WebUI.click(findTestObject('Object Repository/Submit Education Awards/div_Submit Education Awards'))
	
	WebUI.delay(3)

    WebUI.click(findTestObject('Object Repository/Submit Education Awards/span_Select Member'))

    WebUI.sendKeys(findTestObject('Object Repository/ClubCentral/Eligibility Assistant/input_searchBox'), GlobalVariable.TestData[
        'PathwayMemberID'])

    WebUI.sendKeys(findTestObject('Object Repository/ClubCentral/Eligibility Assistant/input_searchBox'), Keys.chord(Keys.ENTER))

    WebUI.delay(3)

    WebUI.click(findTestObject('Object Repository/Submit Education Awards/span_Select Education Program'))

    WebUI.delay(3)

    'Pathway DTM'
    if (WebUI.verifyElementVisible(findTestObject('Object Repository/Submit Education Awards/PathwayDTM_Option'))) {
        WebUI.click(findTestObject('Object Repository/Submit Education Awards/PathwayDTM_Option'))

        CustomKeywords.'com.application.DPOSCustomKeyword.needSomeHelpCloseButton'()

        'Verify Validation Message'
        WebUI.click(findTestObject('Object Repository/Submit Education Awards/button_ReviewAwardSubmit'))

        WebUI.verifyElementVisible(findTestObject('Object Repository/Submit Education Awards/Validation_PathwayDTM'))

        'Select First path'
        WebUI.click(findTestObject('Object Repository/Submit Education Awards/PD_SelectFirstPath'))

        WebUI.click(findTestObject('Object Repository/Submit Education Awards/click_SelectFirstPathwayFirstOption'), FailureHandling.OPTIONAL)

        'Select Second path'
        WebUI.click(findTestObject('Object Repository/Submit Education Awards/PD_SelectSecondPath'))

        WebUI.click(findTestObject('Object Repository/Submit Education Awards/select_SecondPathwayForFirstOption'), FailureHandling.OPTIONAL)

        'Enter date for Distringuished Toastmaster Project'
        WebUI.click(findTestObject('Object Repository/Submit Education Awards/Input_DateForDistringuishedToastmasterProject'))

        WebUI.sendKeys(findTestObject('Object Repository/Submit Education Awards/Input_DateForDistringuishedToastmasterProject'), 
            GlobalVariable.TestData['DistinguishedToastmasterProjectDate'], FailureHandling.OPTIONAL)

        'Enter Data For Club Officer Role Completion'
        WebUI.click(findTestObject('Object Repository/Submit Education Awards/Input_ClubOfficerRoleOfficeHeld'))

        WebUI.sendKeys(findTestObject('Object Repository/Submit Education Awards/Input_ClubOfficerRoleOfficeHeld'), GlobalVariable.TestData[
            'ClubOfficerRoleOfficeHeld'])

        'Club Officer Role Enter Club No'
        WebUI.sendKeys(findTestObject('Object Repository/Submit Education Awards/Input_ClubOfficerRoleClubNo'), GlobalVariable.TestData[
            'ClubOfficerRoleClubNo'])

        'Club Officer Role Period Start Date'
		 WebUI.click( findTestObject('Object Repository/Submit Education Awards/Input_ClubOfficerRoleStartPeriodClick')  )
         WebUI.waitForElementClickable( findTestObject('Object Repository/Submit Education Awards/Input_ClubOfficerRoleStartPeriod'),10  )
		 'Club Officer Role Period End date' 
		 WebUI.click(findTestObject('Object Repository/Submit Education Awards/Input_ClubOfficerRoleEndPeriodClick')    )
		 WebUI.waitForElementClickable(findTestObject('Object Repository/Submit Education Awards/Input_ClubOfficerRoleEndPeriod'),10   )
        
		 'Club Officer Role Helped Prepare Start Date'
         WebUI.click(findTestObject('Object Repository/Submit Education Awards/Input_ClubOfficerRoleHelpedPrepareStartDate'))

         'Club Officer Role Helped Prepare End Date'
         WebUI.click(findTestObject('Object Repository/Submit Education Awards/Input_ClubOfficerRoleHelpedPrepareEndDate'))

         'Enter date for club success plan'
         WebUI.click(findTestObject('Object Repository/Submit Education Awards/Input_DateForClubSuccessPlan'))

         WebUI.sendKeys(findTestObject('Object Repository/Submit Education Awards/Input_DateForClubSuccessPlan'), GlobalVariable.TestData[
            'ClubSuccessPlanDate'], FailureHandling.OPTIONAL)

        'Enter date for club officer training'
        WebUI.click(findTestObject('Object Repository/Submit Education Awards/Input_DateForClubOfficerTraining'))

        WebUI.sendKeys(findTestObject('Object Repository/Submit Education Awards/Input_DateForClubOfficerTraining'), GlobalVariable.TestData[
            'ClubOfficerTrainingDate'], FailureHandling.OPTIONAL)

        'Enter data for Office Held'
        WebUI.click(findTestObject('Object Repository/Submit Education Awards/Input_OfficeHeld'))

        WebUI.sendKeys(findTestObject('Object Repository/Submit Education Awards/Input_OfficeHeld'), GlobalVariable.TestData[
            'DistrictLeaderOfficeHeld'], FailureHandling.OPTIONAL)

        'Enter District Number'
        WebUI.sendKeys(findTestObject('Object Repository/Submit Education Awards/Input_DistrictNumber'), GlobalVariable.TestData[
            'DistrictLeaderDistrictNo'], FailureHandling.OPTIONAL)

        'Enter Start date and End date'
        WebUI.clearText(findTestObject('Object Repository/Submit Education Awards/Input_FromPeriodDate'))

        WebUI.sendKeys(findTestObject('Object Repository/Submit Education Awards/Input_FromPeriodDate'), GlobalVariable.TestData[
            'DistrictLeaderPeriodStartDate'], FailureHandling.OPTIONAL)

        WebUI.clearText(findTestObject('Object Repository/Submit Education Awards/Input_ToPeriodDate'))

        WebUI.sendKeys(findTestObject('Object Repository/Submit Education Awards/Input_ToPeriodDate'), GlobalVariable.TestData[
            'DistrictLeaderPeriodEndDate'], FailureHandling.OPTIONAL)

        'Select Support Role'
        WebUI.sendKeys(findTestObject('Object Repository/Submit Education Awards/select_SupportRole'), GlobalVariable.TestData[
            'ClubMentorSupportRole'], FailureHandling.OPTIONAL)

        //WebUI.click( findTestObject('Object Repository/Submit Education Awards/select_ClubMentorForFirstOption')  )
        'Enter ClubName'
        WebUI.sendKeys(findTestObject('Object Repository/Submit Education Awards/Input_ClubName'), GlobalVariable.TestData[
            'ClubMentorClubName'], FailureHandling.OPTIONAL)

        'Enter Club No'
        WebUI.sendKeys(findTestObject('Object Repository/Submit Education Awards/Input_ClunNo'), GlobalVariable.TestData[
            'ClubMentorClubNo'], FailureHandling.OPTIONAL)

        'Enter Appointed Date'
        WebUI.sendKeys(findTestObject('Object Repository/Submit Education Awards/Input_DateAppointed'), GlobalVariable.TestData[
            'ClubMentorAppointedDate'], FailureHandling.OPTIONAL)

        'Select club support for Club Sponsor'
        WebUI.sendKeys(findTestObject('Object Repository/Submit Education Awards/select_SupportRoleForClubSponsor'), GlobalVariable.TestData[
            'ClubSponsorSupportRole'], FailureHandling.OPTIONAL)

        //WebUI.click(  findTestObject('Object Repository/Submit Education Awards/select_ClubSponsorForFirstOption') )
        'Enter New Club Name'
        WebUI.sendKeys(findTestObject('Object Repository/Submit Education Awards/Input_NewClubName'), GlobalVariable.TestData[
            'ClubSponsorNewClubName'], FailureHandling.OPTIONAL)

        'Enter New Club Number'
        WebUI.sendKeys(findTestObject('Object Repository/Submit Education Awards/Input_NewClubNo'), GlobalVariable.TestData[
            'ClubSponsorNewClubNo'], FailureHandling.OPTIONAL)

        'Enter Date Chartered'
        WebUI.sendKeys(findTestObject('Object Repository/Submit Education Awards/Input_DateChartered'), GlobalVariable.TestData[
            'ClubSponsorDateChartered'], FailureHandling.OPTIONAL)

        WebUI.click(findTestObject('Object Repository/Submit Education Awards/button_No'), FailureHandling.OPTIONAL)

        WebUI.click(findTestObject('Object Repository/Submit Education Awards/button_ReviewAwardSubmit'), FailureHandling.OPTIONAL)

        WebUI.click(findTestObject('Object Repository/Submit Education Awards/button_SubmitAward'), FailureHandling.OPTIONAL)

        WebUI.waitForElementClickable(findTestObject('Object Repository/Submit Education Awards/button_SubmitAnotherAwards'), 
            60, FailureHandling.OPTIONAL)
    }
    
    WebUI.click(findTestObject('Object Repository/Submit Education Awards/span_Select Member'))

    WebUI.sendKeys(findTestObject('Object Repository/ClubCentral/Eligibility Assistant/input_searchBox'), GlobalVariable.TestData[
        'PathwayMemberID'], FailureHandling.OPTIONAL)

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