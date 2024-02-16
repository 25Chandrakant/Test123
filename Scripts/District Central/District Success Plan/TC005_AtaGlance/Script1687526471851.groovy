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
	
	WebUI.delay(3)
	
	WebUI.scrollToPosition(40, 50)

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
	
	WebUI.sendKeys(findTestObject('Object Repository/District Central/District Success Plan/At a Glance/input_Distinguished Growth_Goal_July'),
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

	WebUI.delay(2)
	
	WebUI.click(findTestObject('Object Repository/District Central/Division and Area Director Training/button_SaveButton'))
	
	WebUI.delay(2)

    if (WebUI.verifyElementVisible(findTestObject('Object Repository/District Central/Division and Area Director Training/button_SaveButton'))) {
		
        WebUI.delay(2)
		
        GlobalVariable.vartestresult = 'PASS'

        GlobalVariable.varpassremarks = 'User Submit District Success Plan.'
    } else {
        print('FAIL...............................')

        GlobalVariable.vartestresult = 'FAIL'

        GlobalVariable.varfailremarks = 'User Unable to Submit District Success Plan.'
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