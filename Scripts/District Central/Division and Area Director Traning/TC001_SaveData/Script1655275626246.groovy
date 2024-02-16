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
	
	WebUI.delay(2)

    WebUI.sendKeys(findTestObject('Object Repository/District Central/Division and Area Director Training/select_Roles'), 
        'Area Director') // Division Director
        
    
	WebUI.delay(2)
	
    WebUI.sendKeys(findTestObject('Object Repository/District Central/Division and Area Director Training/select_Trained'), 
        'Trained') // Untrained
        

    //Sort  
    //Role
	
	WebUI.delay(2)
	
    WebUI.click(findTestObject('Object Repository/District Central/Division and Area Director Training/td_Role'))
	
	WebUI.delay(2)

    String Role = WebUI.getAttribute(findTestObject('Object Repository/District Central/Division and Area Director Training/td_Role'), 
        'aria-sort')

    WebUI.verifyMatch(Role, 'ascending', false)
	
	WebUI.delay(2)

    //Name
    WebUI.click(findTestObject('Object Repository/District Central/Division and Area Director Training/td_Name'))
	
	WebUI.delay(2)

    String Name = WebUI.getAttribute(findTestObject('Object Repository/District Central/Division and Area Director Training/td_Name'), 
        'aria-sort')

    WebUI.verifyMatch(Name, 'ascending', false)
	
	WebUI.delay(2)

    //Division & Area
    WebUI.click(findTestObject('Object Repository/District Central/Division and Area Director Training/td_Divisio_Area'))
	
	WebUI.delay(2)

    String DA = WebUI.getAttribute(findTestObject('Object Repository/District Central/Division and Area Director Training/td_Divisio_Area'), 
        'aria-sort')

    WebUI.verifyMatch(DA, 'ascending', false)
	
	WebUI.delay(2)

    //Date Trained
    WebUI.click(findTestObject('Object Repository/District Central/Division and Area Director Training/td_Date_Trained'))
	
	WebUI.delay(2)

    String Trained = WebUI.getAttribute(findTestObject('Object Repository/District Central/Division and Area Director Training/td_Date_Trained'), 
        'aria-sort')

    WebUI.verifyMatch(Trained, 'ascending', false)
	
	WebUI.delay(2)

    // Click on Save button 
    WebUI.click(findTestObject('Object Repository/District Central/Division and Area Director Training/button_Submit'))
	
	WebUI.delay(2)

    String message = WebUI.getText(findTestObject('Object Repository/District Central/Division and Area Director Training/text_SuccessMessage'))
	
	WebUI.delay(2)

    if (message == 'Record saved successfully') {
        GlobalVariable.vartestresult = 'PASS'

        GlobalVariable.varpassremarks = ' Successfully working all functionality .'
    } else {
        print('FAIL...............................')

        GlobalVariable.vartestresult = 'FAIL'

        GlobalVariable.varfailremarks = 'Some functionality not working.'
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