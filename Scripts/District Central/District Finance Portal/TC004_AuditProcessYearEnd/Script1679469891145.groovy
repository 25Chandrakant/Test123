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
import com.kms.katalon.core.configuration.RunConfiguration

try {

	CustomKeywords.'com.application.DateTime.startTime'()

	CustomKeywords.'com.application.DPOSCustomKeyword.needSomeHelpCloseButton'()

	WebUI.delay(2)

	WebUI.click(findTestObject('Object Repository/District Central/District Finance Portal/div_Audit Process'))

	WebUI.delay(2)

	if(!(WebUI.verifyElementVisible(findTestObject('Object Repository/District Central/District Finance Portal/verify_ElementVisibleYearEnd'))))
	{

		WebUI.delay(2)

		WebUI.click(findTestObject('Object Repository/District Central/District Finance Portal/select_SelectTimeframe'))

		WebUI.delay(2)

		WebUI.sendKeys(findTestObject('Object Repository/District Central/District Finance Portal/select_SelectTimeframe'), 'Year-End Audit')

		WebUI.delay(2)

		WebUI.sendKeys(findTestObject('Object Repository/District Central/District Finance Portal/select_SelectSubmissionMethod'), 'Electronic')

		WebUI.delay(2)

		String filePath = RunConfiguration.getProjectDir() + '\\External Files\\Eyeopeners_Club_2023_02_23.pdf'

		filePath = filePath.replace(/\//, '\\')

		WebUI.delay(2)

		CustomKeywords.'com.application.submitpayment.uploadFile'(findTestObject('Object Repository/District Central/District Finance Portal/link_CompleteAuditGuidelinesClick'), filePath)

		WebUI.delay(4)

		CustomKeywords.'com.application.submitpayment.uploadFile'(findTestObject('Object Repository/District Central/District Finance Portal/link_CertificationPageUpload'), filePath)

		WebUI.delay(4)

		String filePaths = RunConfiguration.getProjectDir() + '\\External Files\\April Dues Renewal Status - District 05.zip'

		filePaths = filePaths.replace(/\//, '\\')

		CustomKeywords.'com.application.submitpayment.uploadFile'(findTestObject('Object Repository/District Central/District Finance Portal/link_SupportingDocumentUpload'), filePaths)

		WebUI.delay(4)

		CustomKeywords.'com.application.DPOSCustomKeyword.needSomeHelpCloseButton'()

		WebUI.click(findTestObject('Object Repository/District Central/District Finance Portal/text_AddCommentAudit'))

		WebUI.delay(2)

		WebUI.sendKeys(findTestObject('Object Repository/District Central/District Finance Portal/text_AddCommentAudit'), 'Audit Automation Testing')

		WebUI.delay(2)

		'Click on Submit button'
		WebUI.click(findTestObject('Object Repository/District Central/District Finance Portal/button_Submit'))

		WebUI.delay(4)

		if (WebUI.verifyElementVisible(findTestObject('Object Repository/District Central/District Finance Portal/text_AuditSubmitSuccess')))
		{

			WebUI.delay(2)

			print('PASS...............................')

			GlobalVariable.vartestresult = 'PASS'

			GlobalVariable.varpassremarks = 'Year-End Audit Updated Successfully'
		}

		else
		{
			print('FAIL...............................')

			GlobalVariable.vartestresult = 'FAIL'

			GlobalVariable.varfailremarks = 'Year-End Audit was not uploaded'
		}
	}
	else
	{
		GlobalVariable.vartestresult = 'FAIL'

		GlobalVariable.varfailremarks = 'Year-End Audit for this District is already submitted'

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