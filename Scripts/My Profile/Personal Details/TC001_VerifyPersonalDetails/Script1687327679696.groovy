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
import org.openqa.selenium.By as By
import org.openqa.selenium.WebElement as WebElement
import java.net.URL as URL
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.interactions.Actions as Actions
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import org.openqa.selenium.JavascriptExecutor as JavascriptExecutor

try {
    CustomKeywords.'com.application.DateTime.startTime'()
	
	CustomKeywords.'com.application.DPOSCustomKeyword.needSomeHelpCloseButton'()
	
	WebUI.delay(5)

    'Click on Personal Details expand button'
    String personalDetailsCollaspe = WebUI.getAttribute(findTestObject('My Profile/tile_PersonalDetails'), 'aria-expanded')
    
	if (personalDetailsCollaspe == 'true') {
		print('........................Already Expand Address section')

    } else {
    WebUI.click(findTestObject('My Profile/Personal Details/text-PersonalDetails'))

    print('.........................   Successfully click on Expand button')
    }

    WebUI.delay(5)

    //WebDriver driver = DriverFactory.getWebDriver()

       // ((driver) as JavascriptExecutor).executeScript('window.scrollTo(document.body.scrollHeight, 250)')

    'Click on Edit button'
    WebUI.click(findTestObject('My Profile/Personal Details/button_Edit'))

    WebUI.delay(5)
	
	WebUI.click(findTestObject('My Profile/Value_FirstName'))
	
	WebUI.delay(5)
	
	WebUI.clearText(findTestObject('My Profile/Value_FirstName'))
	
	WebUI.delay(5)
	
	WebUI.sendKeys(findTestObject('My Profile/Value_FirstName'), 'Lorri')
	
	WebUI.delay(5)
	
	WebUI.click(findTestObject('My Profile/Personal Details/Value_MiddleName'))
	
	WebUI.clearText(findTestObject('My Profile/Personal Details/Value_MiddleName'))
	
	WebUI.delay(5)
	
	WebUI.sendKeys(findTestObject('My Profile/Personal Details/Value_MiddleName'), 'A.')
	
	WebUI.delay(5)
	
	WebUI.click(findTestObject('My Profile/Value_LastName'))
	
	WebUI.delay(5)
	
	WebUI.clearText(findTestObject('My Profile/Value_LastName'))
	
	WebUI.delay(5)
	
	WebUI.sendKeys(findTestObject('My Profile/Value_LastName'), 'Andersen')
	
	WebUI.delay(5)
	
	WebUI.click(findTestObject('My Profile/Personal Details/dropdown_ChangeNameReason'))
	
	WebUI.delay(5)
	
	WebUI.sendKeys(findTestObject('My Profile/Personal Details/dropdown_ChangeNameReason'), 'Marital Status')
	
	WebUI.delay(5)
	
	WebUI.sendKeys(findTestObject('My Profile/Personal Details/dropdown_ChangeNameReason'), Keys.chord(Keys.ENTER))
	
	WebUI.delay(5)
	
	WebUI.click(findTestObject('My Profile/Personal Details/dropdown_Gender'))
	
	WebUI.delay(5)
	
	WebUI.sendKeys(findTestObject('My Profile/Personal Details/dropdown_Gender'), 'Female')
	
	WebUI.delay(5)
	
	WebUI.sendKeys(findTestObject('My Profile/Personal Details/dropdown_Gender'), Keys.chord(Keys.ENTER))
	
	WebUI.delay(5)
	
	WebUI.click(findTestObject('My Profile/Personal Details/MobilePhone_SelectCountry'))
	
	WebUI.delay(5)
	
	WebUI.sendKeys(findTestObject('My Profile/Personal Details/MobilePhone_SelectCountry'), 'United States')
	
	WebUI.delay(5)
	
	WebUI.sendKeys(findTestObject('My Profile/Personal Details/MobilePhone_SelectCountry'), Keys.chord(Keys.ENTER))
	
	WebUI.delay(5)
	
	WebUI.click(findTestObject('My Profile/Personal Details/TextBox_MobilePhone'))
	
	WebUI.delay(5)
	
	WebUI.clearText(findTestObject('My Profile/Personal Details/TextBox_MobilePhone'))
	
	WebUI.delay(5)
	
	WebUI.sendKeys(findTestObject('My Profile/Personal Details/TextBox_MobilePhone'), '(503) 970-4534')
	
	WebUI.delay(5)
	
	WebUI.click(findTestObject('My Profile/Personal Details/HomePhone_SelectCountry'))
	
	WebUI.delay(5)
	
	WebUI.sendKeys(findTestObject('My Profile/Personal Details/HomePhone_SelectCountry'), 'United States')
	
	WebUI.delay(5)
	
	WebUI.sendKeys(findTestObject('My Profile/Personal Details/HomePhone_SelectCountry'), Keys.chord(Keys.ENTER))
	
	WebUI.delay(5)
	
	WebUI.click(findTestObject('My Profile/Personal Details/TextBox_HomePhone'))
	
	WebUI.delay(5)
	
	WebUI.clearText(findTestObject('My Profile/Personal Details/TextBox_HomePhone'))
	
	WebUI.delay(5)
	
	WebUI.sendKeys(findTestObject('My Profile/Personal Details/TextBox_HomePhone'), '(201) 555-0123')
	
	WebUI.delay(5)
	
	WebUI.click(findTestObject('My Profile/Personal Details/TextBox_PrimaryEmail'))
	
	WebUI.delay(5)
	
	WebUI.clearText(findTestObject('My Profile/Personal Details/TextBox_PrimaryEmail'))
	
	WebUI.delay(5)
	
	WebUI.sendKeys(findTestObject('My Profile/Personal Details/TextBox_PrimaryEmail'), 'lorriandersen@gmail.com')
	
	WebUI.delay(10)
	
	WebUI.click(findTestObject('My Profile/Personal Details/button_SaveContactInformation'))
	
    String getUrl = WebUI.getUrl()

    if (getUrl == 'My Profile') {
		
        GlobalVariable.vartestresult = 'PASS'

        GlobalVariable.varpassremarks = ('User are able to click on Save and Continue button and URL is:' + getUrl)
    } else {
        GlobalVariable.vartestresult = 'FAIL'

        GlobalVariable.varfailremarks = 'User not able to click on Save and  Continue button.'

        WebUI.back()
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