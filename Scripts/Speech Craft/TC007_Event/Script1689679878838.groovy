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
import java.text.SimpleDateFormat as SimpleDateFormat

try {
    CustomKeywords.'com.application.DateTime.startTime'()

    WebUI.delay(2)

    WebUI.click(findTestObject('Object Repository/Speech Craft/a_CreateNewEvent'))

    WebUI.delay(2)

   // WebUI.click(findTestObject('Object Repository/Speech Craft/select_ClubDropDown'))

   // WebUI.delay(2)
	
	WebUI.selectOptionByIndex(findTestObject('Object Repository/Speech Craft/select_ClubDropDown'), 2)

   // WebUI.click(findTestObject('Object Repository/Speech Craft/option_ClubName'))

    WebUI.delay(2)

    WebUI.click(findTestObject('Object Repository/Speech Craft/input_OrderNo'))

    WebUI.delay(2)

    WebUI.sendKeys(findTestObject('Object Repository/Speech Craft/input_OrderNo'), '9011638233')

    WebUI.delay(2)

    WebUI.click(findTestObject('Object Repository/Speech Craft/input_EventName'))

    WebUI.delay(2)

    WebUI.sendKeys(findTestObject('Object Repository/Speech Craft/input_EventName'), GlobalVariable.TestData['Event_Name'])

    WebUI.delay(2)

    WebUI.click(findTestObject('Object Repository/Speech Craft/input_RadionBtnForReady'))

    WebUI.delay(2)

    Date todaysDate = new Date()
    def formattedDate = todaysDate.format('MM-dd-yyyy')

    WebUI.sendKeys(findTestObject('Object Repository/Speech Craft/input_EStartDate'), formattedDate)

    WebUI.sendKeys(findTestObject('Object Repository/Speech Craft/input_EStartDate'), Keys.chord(Keys.ENTER))

    WebUI.delay(2)

    WebUI.click(findTestObject('Object Repository/Speech Craft/input_EStartTime'))

    WebUI.delay(2)

    WebUI.sendKeys(findTestObject('Object Repository/Speech Craft/input_EStartTime'), CustomKeywords.'com.application.DateTime.getCurrentTime'())

    WebUI.delay(2)

    SimpleDateFormat dateFormat = new SimpleDateFormat('MM/dd/yyyy')

    Calendar calendar = Calendar.getInstance()

    String currentDate = dateFormat.format(calendar.getTime())

    calendar.add(Calendar.MONTH, 1)

    String futureDate = dateFormat.format(calendar.getTime())

    long diff = dateFormat.parse(futureDate).getTime() - dateFormat.parse(currentDate).getTime()

    int randomFutureDays = (((Math.random() * diff) / (((1000 * 60) * 60) * 24)) as int)

    calendar.setTime(dateFormat.parse(currentDate))

    calendar.add(Calendar.DATE, randomFutureDays)

    String selectedFutureDate = dateFormat.format(calendar.getTime())

    WebUI.setText(findTestObject('Object Repository/Speech Craft/input_EEndDate'), selectedFutureDate)

     WebUI.delay(2)
	
	 WebUI.click(findTestObject('Object Repository/Speech Craft/input_EEndTime'))
	 
	 WebUI.sendKeys(findTestObject('Object Repository/Speech Craft/input_EStartTime'), CustomKeywords.'com.application.DateTime.getCurrentTime'())
	 
	 WebUI.delay(2)
	 
	 WebUI.click(findTestObject('Object Repository/Speech Craft/select_CurrencyDropDown'))
	 
	 WebUI.delay(2)
	 
	 WebUI.click(findTestObject('Object Repository/Speech Craft/option_LanguageSelect'))
	 
	 WebUI.delay(2)
	 
	 WebUI.click(findTestObject('Object Repository/Speech Craft/input_ChargePrice'))
	 
	 WebUI.sendKeys(findTestObject('Object Repository/Speech Craft/input_ChargePrice'), '50')
	 
	 WebUI.delay(2)
	 
	 WebUI.click(findTestObject('Object Repository/Speech Craft/input_Checkbox'))
	 
	 WebUI.delay(4)
	 
	 WebUI.click(findTestObject('Object Repository/Speech Craft/input_SubmitBtn'))
	 
	 WebUI.delay(5)
	 
    if (WebUI.verifyElementVisible(findTestObject('Object Repository/Speech Craft/span_SuccessText'))) {
		
        WebUI.delay(4)

        WebUI.click(findTestObject('Object Repository/Speech Craft/a_GoToEventDetails'))

        WebUI.delay(10)

        print('PASS...............................')

        GlobalVariable.vartestresult = 'PASS'

        GlobalVariable.varpassremarks = 'User Successfully create new event.'
    } else {
        print('FAIL...............................')

        GlobalVariable.vartestresult = 'FAIL'

        GlobalVariable.varfailremarks = 'User unable to create new event.'
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