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
	
	WebUI.delay(20)
	
	'Click on My Home link'
	if (WebUI.verifyElementVisible(findTestObject('My Profile/a_mouseHoverWelcome'))) {
		
		WebUI.mouseOver(findTestObject('My Profile/a_mouseHoverWelcome'))
		
		WebUI.delay(2)

		WebUI.click(findTestObject('My Home/My Downloads/a_Myhome'))
		
		WebUI.delay(2)
		
	} else {
	}
	
	WebUI.scrollToPosition(110, 110)
	
	WebUI.delay(2)
	
	CustomKeywords.'com.application.DPOSCustomKeyword.needSomeHelpCloseButton'()
	
	WebUI.delay(2)

    WebUI.click(findTestObject('My Home/My Downloads/h3_MyDownloads'))

    WebUI.delay(5)
 
	 if (WebUI.verifyElementVisible(findTestObject('My Home/My Downloads/h1_MyDownloads'))) {
		 
		 WebUI.delay(3)

        GlobalVariable.vartestresult = 'PASS'

        GlobalVariable.varpassremarks = 'User Successfully landing on My Downloads Page'
		
    } else {
        print('FAIL...............................')

        GlobalVariable.vartestresult = 'FAIL'

        GlobalVariable.varfailremarks = 'User unble to landing on My Downloads Page'
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