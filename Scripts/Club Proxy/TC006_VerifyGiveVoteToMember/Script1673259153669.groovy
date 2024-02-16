import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.configuration.RunConfiguration as RunConfiguration
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.util.internal.PathUtil as PathUtil
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil
import org.openqa.selenium.Keys as Keys
import org.openqa.selenium.By as By
import org.openqa.selenium.WebElement as WebElement
import java.net.MalformedURLException as MalformedURLException
import java.net.URL as URL
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.interactions.Actions as Actions
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import org.openqa.selenium.JavascriptExecutor as JavascriptExecutor

try {
    CustomKeywords.'com.application.DateTime.startTime'()

    CustomKeywords.'com.application.DPOSCustomKeyword.needSomeHelpCloseButton'()

    'click on Start button'
    if (WebUI.verifyElementVisible(findTestObject('Object Repository/ClubProxy/button_Start_DesignateVotingInstruction'))) {
        WebUI.click(findTestObject('Object Repository/ClubProxy/button_Start_DesignateVotingInstruction'))
    } else {
        WebUI.click(findTestObject('Object Repository/ClubProxy/button_Edit_DesignateVotingInstruction'))
    }
    
    Thread.sleep(1000)

    'Click on Instructions '
    WebDriver driver = DriverFactory.getWebDriver()

        ((driver) as JavascriptExecutor).executeScript('window.scrollTo(document.body.scrollHeight, 200)')

    'click on International Officer for section expand'
    WebUI.click(findTestObject('Object Repository/ClubProxy/a_DesignateVotingInstruction_InternationalOfficer_expand'))

    'Assign to vote for president member'
    WebUI.click(findTestObject('Object Repository/ClubProxy/vote_InterOfficer_President_Vote1'))

    'Assign to vote for first vice president member'
    WebUI.click(findTestObject('Object Repository/ClubProxy/vote_InterOfficer_firstvicePresident_Vote2'))

    'Assign to vote for second president member'
    WebUI.click(findTestObject('Object Repository/ClubProxy/vote_InterOfficer_secondvicePresident_1_Vote1'))

    WebUI.click(findTestObject('Object Repository/ClubProxy/vote_InterOfficer_secondvicePresident_2_Vote1'))

    //Thread.sleep(300000)
        ((driver) as JavascriptExecutor).executeScript('window.scrollTo(document.body.scrollHeight, 200)')

    'click on Internation District for section expand'
    WebUI.click(findTestObject('Object Repository/ClubProxy/a_DesignateVotingInstruction_InternationalDistrict_expand'))

    'click on Vote for Region 2'
    WebUI.click(findTestObject('Object Repository/ClubProxy/vote_InterDirector_Region2_1_vote1'))

    WebUI.click(findTestObject('Object Repository/ClubProxy/vote_InterDirector_Region2_2_vote1'))

    //WebUI.click(  )
    'click on Vote for Region 4'
    WebUI.click(findTestObject('Object Repository/ClubProxy/vote_InterDirector_Region4_1_vote2'))

    //WebUI.click(  )
    'click on Vote for Region 6'
    WebUI.click(findTestObject('Object Repository/ClubProxy/vote_InterDirector_Region6_1_vote1'))

    WebUI.click(findTestObject('Object Repository/ClubProxy/vote_InterDirector_Region6_3_vote1'))

    //WebUI.click(  )
    'click on Vote for Region 8'
    WebUI.click(findTestObject('Object Repository/ClubProxy/vote_InterDirector_Region8_1_vote2'))

    //WebUI.click(  )
    'click on Vote for Region 10'
    WebUI.click(findTestObject('Object Repository/ClubProxy/vote_InterDirector_Region10_1_vote1'))

    WebUI.click(findTestObject('Object Repository/ClubProxy/vote_InterDirector_Region10_2_vote1'))

    //WebUI.click(  )
    'click on Vote for Region 12'
    WebUI.click(findTestObject('Object Repository/ClubProxy/vote_InterDirector_Region12_1_vote2'))

    //WebUI.click(  )
    'click on Vote for Region 14'
    WebUI.click(findTestObject('Object Repository/ClubProxy/vote_InterDirector_Region14_1_vote2'))

    'click on Proposal for section expand'
    WebUI.click(findTestObject('Object Repository/ClubProxy/a_DesignateVotingInstruction_Proposal_expand'))

    'Vote for proposal A'
    WebUI.click(findTestObject('Object Repository/ClubProxy/vote_Proposal_A_No_vote1'))

    WebUI.click(findTestObject('Object Repository/ClubProxy/vote_Proposal_A_Yes_vote1'))

    'Vote for proposal B'
    WebUI.click(findTestObject('Object Repository/ClubProxy/vote_Proposal_B_No_vote2'))

    'Vote for proposal C'
    WebUI.click(findTestObject('Object Repository/ClubProxy/vote_Proposal_C_Yes_vote1'))

    WebUI.click(findTestObject('Object Repository/ClubProxy/vote_Proposal_C_No_vote1'))

    'Vote for proposal D'
    WebUI.click(findTestObject('Object Repository/ClubProxy/vote_Proposal_D_Yes_vote2'))

    'Vote for proposal E'
    WebUI.click(findTestObject('Object Repository/ClubProxy/vote_Proposal_E_No_vote1'))

    WebUI.click(findTestObject('Object Repository/ClubProxy/vote_Proposal_E_Yes_vote1'))

    'Vote for proposal F'
    WebUI.click(findTestObject('Object Repository/ClubProxy/vote_Proposal_F_No_vote2'))

    'Vote for proposal G'
    WebUI.click(findTestObject('Object Repository/ClubProxy/vote_Proposal_G_Yes_vote1'))

    WebUI.click(findTestObject('Object Repository/ClubProxy/vote_Proposal_G_No_vote1'))

    'Vote for proposal H'
    WebUI.click(findTestObject('Object Repository/ClubProxy/vote_Proposal_H_Yes_vote2'))

    'Vote for proposal I'
    WebUI.click(findTestObject('Object Repository/ClubProxy/vote_Proposal_I_Yes_vote1'))

    WebUI.click(findTestObject('Object Repository/ClubProxy/vote_Proposal_I_No_vote1'))

    'Vote for proposal J'
    WebUI.click(findTestObject('Object Repository/ClubProxy/vote_Proposal_J_No_vote2'))

    'Vote for proposal K'
    WebUI.click(findTestObject('Object Repository/ClubProxy/vote_Proposal_K_Yes_vote2'))

    'Vote for proposal L'
    WebUI.click(findTestObject('Object Repository/ClubProxy/vote_Proposal_L_No_vote1'))

    WebUI.click(findTestObject('Object Repository/ClubProxy/vote_Proposal_L_Yes_vote1'))

    'Click on Submit voting instructions button '
    WebUI.click(findTestObject('Object Repository/ClubProxy/button_SubmitVotingIntructions'))

    'Click on Ok button'
    WebUI.click(findTestObject('ClubProxy/button_GoToDesignateProxyholder'))

  
    
    Thread.sleep(1000)

    if (WebUI.verifyElementVisible(findTestObject('Object Repository/ClubProxy/button_Edit_DesignateVotingInstruction'))) {
        WebUI.back()

        print('.......................................................PASS')

        GlobalVariable.vartestresult = 'PASS'

        GlobalVariable.varpassremarks = 'Successfully working all functionality on Club Proxy and Voting Instruction page.'
    } else {
        WebUI.back()

        print('.......................................................FAIL')

        GlobalVariable.vartestresult = 'FAIL'

        GlobalVariable.varfailremarks = 'Not working all functionality on Club Proxy and Voting Instruction page.'
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