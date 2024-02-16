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

    'Download Success Plan'
    WebUI.click(findTestObject('Object Repository/ClubCentral/Club Success Plan/a_Download Success Plan Template'))
	
	WebUI.delay(2)

    'Upload Plan button'
    WebUI.click(findTestObject('Object Repository/ClubCentral/Club Success Plan/input_Download Success Plan Template_upload-success-plan-button'))
	
	WebUI.delay(2)

    'Verify validation Message'
    WebUI.click(findTestObject('Object Repository/ClubCentral/Club Success Plan/input_Browse files to upload_upload-file-submit-button'))
	
	WebUI.delay(2)

    WebUI.verifyElementVisible(findTestObject('Object Repository/ClubCentral/Club Success Plan/text_FileValidationMessage'))

    WebUI.click(findTestObject('Object Repository/ClubCentral/Club Success Plan/i_Download File_fa fa-close'))
	
	WebUI.delay(2)

    'Upload Invalid File'
    WebUI.click(findTestObject('Object Repository/ClubCentral/Club Success Plan/input_Download Success Plan Template_upload-success-plan-button'))

    WebUI.sendKeys(findTestObject('Object Repository/ClubCentral/Club Success Plan/input_Browse files to upload_fileToUpload'), 
        'D://GitProject//Pending Task For Automation.xlsx' //D://GitProject
        )

	WebUI.click(findTestObject('Object Repository/ClubCentral/Club Success Plan/i_Download File_fa fa-close'))
	
    'Upload File'
    WebUI.click(findTestObject('Object Repository/ClubCentral/Club Success Plan/input_Download Success Plan Template_upload-success-plan-button'))

    WebUI.sendKeys(findTestObject('Object Repository/ClubCentral/Club Success Plan/input_Browse files to upload_fileToUpload'), 
        'D://GitProject//Meeting tools.docx' //D://GitProject
        )

    'Click on Submit Button'
    WebUI.click(findTestObject('Object Repository/ClubCentral/Club Success Plan/input_Browse files to upload_upload-file-submit-button'))

    if (WebUI.verifyElementVisible(findTestObject('Object Repository/ClubCentral/Club Success Plan/button_FileReplace_Yes'))) {
		
        WebUI.click(findTestObject('Object Repository/ClubCentral/Club Success Plan/button_FileReplace_Yes'))
    }
    
    if (WebUI.verifyElementVisible(findTestObject('Object Repository/ClubCentral/Club Success Plan/i_Download File_fa fa-close'))) {
		
        WebUI.click(findTestObject('Object Repository/ClubCentral/Club Success Plan/i_Download File_fa fa-close'))

        WebUI.delay(3)

        GlobalVariable.vartestresult = 'PASS'

        GlobalVariable.varpassremarks = 'User Successfully upload doc file'
    } else {
        GlobalVariable.vartestresult = 'FAIL'

        GlobalVariable.varfailremarks = 'User unble to upload doc file'
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