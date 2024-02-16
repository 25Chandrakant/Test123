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
import org.junit.After
import org.openqa.selenium.Capabilities as Capabilities
import org.openqa.selenium.Dimension as Dimension
import org.openqa.selenium.remote.RemoteWebDriver as RemoteWebDriver
import com.kms.katalon.core.webui.common.WebUICommonScripts as WebUICommonScripts
import com.kms.katalon.core.webui.common.WebUiCommonHelper as WebUiCommonHelper
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory

try {
	CustomKeywords.'com.application.DateTime.startTime'()
	CustomKeywords.'com.application.DPOSCustomKeyword.needSomeHelpCloseButton'()
	
	"Select President"
	WebUI.click(findTestObject('Object Repository/Club_Officer_Assigment/Future/select_President')  )
	WebUI.click(findTestObject('Object Repository/Club_Officer_Assigment/Future/select_President')  )
	 

	
	"Click on Save Button"
	
	WebUI.click( findTestObject('Object Repository/Club_Officer_Assigment/Future/input_Addendum of Standard Club Options_frmFutureSubmit')  ) 
 
	
	 

	if (WebUI.waitForElementVisible(  findTestObject('Object Repository/Club_Officer_Assigment/Future/validation_message')   ,
		150)) {
		print('PASS...............................')

		GlobalVariable.vartestresult = 'PASS'

		GlobalVariable.varpassremarks = 'User Successfully get validation message.'
	} else {
		print('FAIL...............................')

		GlobalVariable.vartestresult = 'FAIL'

		GlobalVariable.varfailremarks = 'User can not get validation message.'
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