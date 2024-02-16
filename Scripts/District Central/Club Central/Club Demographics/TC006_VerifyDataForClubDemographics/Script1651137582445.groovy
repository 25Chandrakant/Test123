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
import org.openqa.selenium.By as By
import org.openqa.selenium.support.ui.Select as Select

try {
    CustomKeywords.'com.application.DateTime.startTime'()
	
	List<WebElement> elements = WebUiCommonHelper.findWebElements( findTestObject('Object Repository/ClubCentral/Club Demographics/select_PrimaryContact')  , 30)
 	WebUI.comment("Found ${elements.size()} elements!")
	
	WebElement randomElement = elements.get(new Random().nextInt(elements.size()))
	
	println  ("............................................" +randomElement)
	
	
	

    Select select = new Select(DriverFactory.getWebDriver().findElement(By.xpath('//*[@id="ClubType"]')))
    String ClubType = select.getFirstSelectedOption().getText()

    WebUI.verifyMatch(ClubType, GlobalVariable.TestData["ClubType"], false)
    print(ClubType)

	
	///////////////////////////////
    Select select1 = new Select(DriverFactory.getWebDriver().findElement(By.xpath('//*[@id="ClubManualLanguage"]')))
    String ClubManualLanguage = select1.getFirstSelectedOption().getText()

    WebUI.verifyMatch(ClubManualLanguage, GlobalVariable.TestData["ClubManualLanguage"], false)

    print(ClubManualLanguage)
	
	///////////////////////////////
	Select select2 = new Select(DriverFactory.getWebDriver().findElement(By.xpath('//*[@id="RestrictionCode"]')))
	String RestrictionCode = select2.getFirstSelectedOption().getText()

	WebUI.verifyMatch(RestrictionCode, GlobalVariable.TestData["MembershipComposition"], false)

	print(RestrictionCode)
	
	///////////////////////////////
	//Select select = new Select(DriverFactory.getWebDriver().findElement(By.xpath('//*[@id="ClubMeetingFormat"]')))
	//String ClubMeetingFormat = select.getFirstSelectedOption().getText()

	//WebUI.verifyMatch(ClubMeetingFormat, GlobalVariable.TestData[''], false)

	//print(ClubMeetingFormat)
	
	///////////////////////////////
	//Select select = new Select(DriverFactory.getWebDriver().findElement(By.xpath('//*[@id="ClubOfficer"]')))
	//String ClubOfficer = select.getFirstSelectedOption().getText()

	//WebUI.verifyMatch(ClubOfficer, GlobalVariable.TestData[''], false)

	//print(ClubOfficer)

    if ((WebUI.verifyMatch(ClubType, GlobalVariable.TestData["ClubType"], false))&&(WebUI.verifyMatch(ClubManualLanguage, GlobalVariable.TestData["ClubManualLanguage"], false))&&(WebUI.verifyMatch(RestrictionCode, GlobalVariable.TestData["MembershipComposition"], false))) {
		
		print("......................................PASS")
        GlobalVariable.vartestresult = 'PASS'

        GlobalVariable.varpassremarks = 'User Successfully save new updated.'
    } else {
	    print("......................................FAIL")
        GlobalVariable.vartestresult = 'FAIL'

        GlobalVariable.varfailremarks = 'User can not save new update.'
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