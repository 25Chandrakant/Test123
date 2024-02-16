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

    WebUI.mouseOver(findTestObject('Object Repository/ClubCentral/Club Demographics/i_toolTip1'))

    String toolTip1 = WebUI.getText(findTestObject('Object Repository/ClubCentral/Club Demographics/i_toolTip1'))

    WebUI.mouseOver(findTestObject('Object Repository/ClubCentral/Club Demographics/i_toolTip2'))

    String toolTip2 = WebUI.getText(findTestObject('Object Repository/ClubCentral/Club Demographics/i_toolTip2'))

    WebUI.mouseOver(findTestObject('Object Repository/ClubCentral/Club Demographics/i_toolTip3'))

    String toolTip3 = WebUI.getText(findTestObject('Object Repository/ClubCentral/Club Demographics/i_toolTip3'))

    WebUI.mouseOver(findTestObject('Object Repository/ClubCentral/Club Demographics/i_toolTip4'))

    String toolTip4 = WebUI.getText(findTestObject('Object Repository/ClubCentral/Club Demographics/i_toolTip4'))

    WebUI.mouseOver(findTestObject('Object Repository/ClubCentral/Club Demographics/i_toolTip5'))

    String toolTip5 = WebUI.getText(findTestObject('Object Repository/ClubCentral/Club Demographics/i_toolTip5'))

    WebUI.mouseOver(findTestObject('Object Repository/ClubCentral/Club Demographics/i_toolTip6'))

    String toolTip6 = WebUI.getText(findTestObject('Object Repository/ClubCentral/Club Demographics/i_toolTip6'))

    WebUI.mouseOver(findTestObject('Object Repository/ClubCentral/Club Demographics/i_toolTip7'))

    String toolTip7 = WebUI.getAttribute(findTestObject('Object Repository/ClubCentral/Club Demographics/i_toolTip7'),"data-content")
	
	WebUI.delay(2)

    if (WebUI.verifyMatch(toolTip7,"To change the mailing address, please contact the club officer listed as Primary Contact and request that the officer update his or her shipping address.",false)){

		WebUI.delay(2)
		
        print('...................................................PASS')

        GlobalVariable.vartestresult = 'PASS'

        GlobalVariable.varpassremarks = 'User Successfully see tooltip text as per expected and match it.'
    } else {
        print('...................................................FAIL')

        GlobalVariable.vartestresult = 'FAIL'

        GlobalVariable.varfailremarks = 'User not getting tooltip text as per expected.'
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