import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
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

    'Click on My Proxies'
    WebUI.click(findTestObject('Object Repository/ClubProxy/a_My Proxies'))
	
	WebUI.delay(2)

    'Click on Unaccepted ( Votes)'
    WebUI.click(findTestObject('Object Repository/ClubProxy/a_Unaccepted (2 votes)'))

    Thread.sleep(1000)
	
    'Click on View Details'
    WebUI.click(findTestObject('Object Repository/ClubProxy/a_View Details'))
	
	WebUI.delay(2)
	
 	if(WebUI.verifyElementVisible( findTestObject('Object Repository/ClubProxy/checkBox_IntendToVote') )) {
   
	 'check to the Intend to vote box'
    WebUI.click(findTestObject('Object Repository/ClubProxy/checkBox_IntendToVote'))
	
	WebUI.delay(2)

    WebUI.click(findTestObject('Object Repository/ClubProxy/button_AcceptProxyVote'))
	
	WebUI.delay(2)

    WebUI.click(findTestObject('Object Repository/ClubProxy/button_Ok'))
	
	WebUI.delay(2)

	}
	else {
		'Click on Close pop up box'
		WebUI.click( findTestObject('Object Repository/ClubProxy/svg') )
		
		WebUI.delay(2)
	}
    //WebUI.click(findTestObject('Object Repository/ClubProxy/svg'))
    'Click on Accepted (0 vote)'
    WebUI.click(findTestObject('Object Repository/ClubProxy/a_Accepted (0 vote)'))

    Thread.sleep(1000)

    'Click on Instructions '
    WebDriver driver = DriverFactory.getWebDriver()

    //JavascriptExecutor js = ((driver) as JavascriptExecutor)
    //js.executeScript('window.scrollBy(0,250)', '')
        ((driver) as JavascriptExecutor).executeScript('window.scrollTo(document.body.scrollHeight, 0)')

    WebUI.click(findTestObject('Object Repository/ClubProxy/a_Instructions'))

    'Click on Internation Officers (click to expand)'
    WebUI.click(findTestObject('Object Repository/ClubProxy/a_International Officers (click to expand)'))

    Thread.sleep(1000)
	
    'Click on Internation Directors (click to expand)'
    WebUI.click(findTestObject('Object Repository/ClubProxy/a_International Directors (click to expand)'))

    Thread.sleep(1000)

    String internationDirectors = WebUI.getAttribute(findTestObject('Object Repository/ClubProxy/a_International Directors (click to expand)'), 
        'aria-expanded')

    WebUI.verifyMatch(internationDirectors, 'true', false)

    'Click on Proposals (click to expand)'
    WebUI.click(findTestObject('Object Repository/ClubProxy/a_Proposals (click to expand)'))

    String proposals = WebUI.getAttribute(findTestObject('Object Repository/ClubProxy/a_Proposals (click to expand)'), 'aria-expanded')
	WebUI.verifyMatch(proposals, 'true', false)
	
	'Click on Proposal A link'
	WebUI.click(findTestObject('Object Repository/ClubProxy/link_proposalA') )
	
    if (WebUI.getUrl()=='https://www.toastmasters.org/about/board-of-directors/2022-proposals#proposal-a') {
		
        WebUI.back()
		
		WebUI.back()
		
        GlobalVariable.vartestresult = 'PASS'

        GlobalVariable.varpassremarks = 'Successfully working all functionality on My votes and instruction page.'
    } else {
        WebUI.back()

        GlobalVariable.vartestresult = 'FAIL'

        GlobalVariable.varfailremarks = 'Not working all functionality on My votes and instruction page.'
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