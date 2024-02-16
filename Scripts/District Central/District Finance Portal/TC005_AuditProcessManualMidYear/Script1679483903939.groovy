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

	'Click on Audit Process tile'
	WebUI.click(findTestObject('Object Repository/District Central/District Finance Portal/div_Audit Process'))

	WebUI.delay(2)

	if(!(WebUI.verifyElementVisible(findTestObject('Object Repository/District Central/District Finance Portal/verify_ElementVisibleMidYear'))))
	{

		WebUI.delay(2)
		
		WebUI.click(findTestObject('Object Repository/District Central/District Finance Portal/select_SelectTimeframe'))
		
		WebUI.delay(2)

		'Select manual year audit'
		WebUI.sendKeys(findTestObject('Object Repository/District Central/District Finance Portal/select_SelectTimeframe'),'Mid-Year Audit')

		WebUI.delay(2)

		'Select manual method'
		WebUI.sendKeys(findTestObject('Object Repository/District Central/District Finance Portal/select_SelectSubmissionMethod'),'Manual')

		WebUI.delay(2)

		Date todaysDate = new Date();
		def formattedDate = todaysDate.format("MM-dd-yyyy");

		WebUI.sendKeys(findTestObject('Object Repository/District Central/District Finance Portal/date_MailInDate'), formattedDate)

		WebUI.delay(2)
		
		WebUI.sendKeys(findTestObject('Object Repository/District Central/District Finance Portal/date_MailInDate'), Keys.chord(Keys.ENTER))

		WebUI.delay(2)
		
		WebUI.click(findTestObject('Object Repository/District Central/District Finance Portal/Courier_Servies'))
		
		WebUI.delay(2)
		
		WebUI.sendKeys(findTestObject('Object Repository/District Central/District Finance Portal/Courier_Servies'), 'SpeedPost')
		
		WebUI.delay(2)
		
		WebUI.click(findTestObject('Object Repository/District Central/District Finance Portal/Tracking_Information'))

		WebUI.delay(2)

		WebUI.sendKeys(findTestObject('Object Repository/District Central/District Finance Portal/Tracking_Information'), '06202022')

		WebUI.delay(2)
		
		WebUI.click(findTestObject('Object Repository/District Central/District Finance Portal/textarea_Supporting Documentation_comments'))
		
		WebUI.delay(2)

		WebUI.sendKeys(findTestObject('Object Repository/District Central/District Finance Portal/textarea_Supporting Documentation_comments'), CustomKeywords.'com.application.submitpayment.randomString'(20))

		WebUI.delay(2)

		CustomKeywords.'com.application.DPOSCustomKeyword.needSomeHelpCloseButton'()

		'Click on Submit button'
		WebUI.click(findTestObject('Object Repository/District Central/District Finance Portal/button_Submit'))

		WebUI.delay(4)

		if (WebUI.verifyElementVisible(findTestObject('Object Repository/District Central/District Finance Portal/text_AuditSubmitSuccess')))
		{

			WebUI.delay(2)

			print('PASS...............................')

			GlobalVariable.vartestresult = 'PASS'

			GlobalVariable.varpassremarks = 'Mid-Year Audit Updated Successfully'
		}

		else
		{
			print('FAIL...............................')

			GlobalVariable.vartestresult = 'FAIL'

			GlobalVariable.varfailremarks = 'Mid-Year Audit was not uploaded'
		}


	}
	else
	{
		GlobalVariable.vartestresult = 'FAIL'

		GlobalVariable.varfailremarks = 'Mid-Year Audit for this District is already submitted'

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