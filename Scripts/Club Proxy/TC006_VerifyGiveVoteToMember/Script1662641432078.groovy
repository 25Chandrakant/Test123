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

    'click on International Officers for section expand'
    WebUI.click(findTestObject('Object Repository/ClubProxy/a_DesignateVotingInstruction_InternationalOfficer_expand'))
	
	WebUI.delay(2)

    'Assign to vote for president member'
    WebUI.click(findTestObject('Object Repository/ClubProxy/vote_InterOfficer_President_Vote1'))
	
	WebUI.delay(2)

    'Assign to vote for first vice president member'
    WebUI.click(findTestObject('Object Repository/ClubProxy/vote_InterOfficer_firstvicePresident_Vote2'))
	
	WebUI.delay(2)

    'Assign to vote for second president member'
    WebUI.click(findTestObject('Object Repository/ClubProxy/vote_InterOfficer_secondvicePresident_1_Vote1'))
	
	WebUI.delay(2)

    WebUI.click(findTestObject('Object Repository/ClubProxy/vote_InterOfficer_secondvicePresident_2_Vote1'))
	
	WebUI.delay(2)

    //Thread.sleep(300000)
        ((driver) as JavascriptExecutor).executeScript('window.scrollTo(document.body.scrollHeight, 200)')

    'click on Internation Directors for section expand'
    WebUI.click(findTestObject('Object Repository/ClubProxy/a_DesignateVotingInstruction_InternationalDistrict_expand'))
	
	WebUI.delay(2)

    'click on Vote for Region 1'
    WebUI.click(findTestObject('Object Repository/ClubProxy/vote_InterDirector_Region2_1_vote1'))
	
	WebUI.delay(2)

    WebUI.click(findTestObject('Object Repository/ClubProxy/vote_InterDirector_Region2_2_vote1'))
	
	WebUI.delay(2)

    //WebUI.click(  )
    'click on Vote for Region 3'
    WebUI.click(findTestObject('Object Repository/ClubProxy/vote_InterDirector_Region4_1_vote2'))
	
	WebUI.delay(2)
	
	WebUI.click(findTestObject('Object Repository/ClubProxy/vote_InternationalDirector_Region3_2_vote1'))
	
	WebUI.delay(2)

    //WebUI.click(  )
    'click on Vote for Region 5'
    WebUI.click(findTestObject('Object Repository/ClubProxy/vote_InterDirector_Region6_1_vote1'))
	
	WebUI.delay(2)

    WebUI.click(findTestObject('Object Repository/ClubProxy/vote_InterDirector_Region6_3_vote1'))
	
	WebUI.delay(2)

    //WebUI.click(  )
    'click on Vote for Region 7'
    WebUI.click(findTestObject('Object Repository/ClubProxy/vote_InterDirector_Region8_1_vote2'))
	
	WebUI.delay(2)
	
	WebUI.click(findTestObject('Object Repository/ClubProxy/vote_InterDirector_Region7_2_vote1'))
	
	WebUI.delay(2)

    //WebUI.click(  )
    'click on Vote for Region 9'
    WebUI.click(findTestObject('Object Repository/ClubProxy/vote_InterDirector_Region10_1_vote1'))
	
	WebUI.delay(2)

    WebUI.click(findTestObject('Object Repository/ClubProxy/vote_InterDirector_Region10_2_vote1'))
	
	WebUI.delay(2)

    //WebUI.click(  )
    'click on Vote for Region 11'
    WebUI.click(findTestObject('Object Repository/ClubProxy/vote_InterDirector_Region12_1_vote2'))
	
	WebUI.delay(2)
	
	WebUI.click(findTestObject('Object Repository/ClubProxy/vote_InterDirector_Region11_2_vote1'))
	
	WebUI.delay(2)

    //WebUI.click(  )
    'click on Vote for Region 13'
    WebUI.click(findTestObject('Object Repository/ClubProxy/vote_InterDirector_Region14_1_vote2'))
	
	WebUI.delay(2)
	
	WebUI.click(findTestObject('Object Repository/ClubProxy/vote_InterDirector_Region13_2_vote1'))
	
	WebUI.delay(2) 
	
	WebUI.click(findTestObject('Object Repository/ClubProxy/button_SubmitVotingIntructions'))
	
	WebUI.delay(40)
    
    if (WebUI.verifyElementVisible(findTestObject('Object Repository/ClubProxy/a_CloseAndReturn'))) {
		
		WebUI.delay(2)
		
		WebUI.click(findTestObject('Object Repository/ClubProxy/a_CloseAndReturn'))
		
		WebUI.delay(3)

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