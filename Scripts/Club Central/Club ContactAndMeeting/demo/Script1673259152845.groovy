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

import cucumber.api.java.tlh.vaj
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

    String website = WebUI.getAttribute(findTestObject('Object Repository/Club Contact and Meeting Information/input_Website_Website'), 
        'value')

    String email = WebUI.getAttribute(findTestObject('Object Repository/Club Contact and Meeting Information/input_Email_Email'), 
        'value')

    String facebook = WebUI.getAttribute(findTestObject('Object Repository/Club Contact and Meeting Information/input_Facebook_Facebook'), 
        'value')

    String venueLine1 = WebUI.getAttribute(findTestObject('Object Repository/Club Contact and Meeting Information/input__PlaceOrVenue Line 1'), 
        'value')

    String venueLine2 = WebUI.getAttribute(findTestObject('Object Repository/Club Contact and Meeting Information/input_Place or Venue Line 2_PlaceOrVenueSecondary'), 
        'value')

    String address1 = WebUI.getAttribute(findTestObject('Object Repository/Club Contact and Meeting Information/input__Address1'), 
        'value')

    String address2 = WebUI.getAttribute(findTestObject('Object Repository/Club Contact and Meeting Information/input__Address2'), 
        'value')

    String city = WebUI.getAttribute(findTestObject('Object Repository/Club Contact and Meeting Information/input__City'), 
        'value')

    String postalCode = WebUI.getAttribute(findTestObject('Object Repository/Club Contact and Meeting Information/input__PostalCode'), 
        'value')

    String meetingDays = WebUI.getAttribute(findTestObject('Object Repository/Club Contact and Meeting Information/input__MeetingDays'), 
        'value')

    String time = WebUI.getAttribute(findTestObject('Object Repository/Club Contact and Meeting Information/input__MeetingTime'), 
        'value')

    if ((((((((((WebUI.verifyMatch(website, GlobalVariable.TestData['CCMI_Website'], false) && WebUI.verifyMatch(email, 
        GlobalVariable.TestData['CCMI_Email'], false)) && WebUI.verifyMatch(facebook, GlobalVariable.TestData['CCMI_Facebook'], 
        false)) && WebUI.verifyMatch(venueLine1, GlobalVariable.TestData['CCMI_VenueLine1'], false)) && WebUI.verifyMatch(venueLine2, 
        GlobalVariable.TestData['CCMI_VenueLine2'], false)) && WebUI.verifyMatch(address1, GlobalVariable.TestData['CCMI_Address1'], 
        false)) && WebUI.verifyMatch(address2, GlobalVariable.TestData['CCMI_Address2'], false)) && WebUI.verifyMatch(city, 
        GlobalVariable.TestData['CCMI_City'], false)) && WebUI.verifyMatch(postalCode, GlobalVariable.TestData['CCMI_PostalCode'], 
        false)) && WebUI.verifyMatch(meetingDays, GlobalVariable.TestData['CCMI_MeetingDays'], false)) && WebUI.verifyMatch(time, 
        GlobalVariable.TestData['CCMI_Time'], false)) {
        print('PASS...............................')

        GlobalVariable.vartestresult = 'PASS'

        GlobalVariable.varpassremarks = 'User Successfully save enter details.'
    } else {
        print('FAIL...............................')

        GlobalVariable.vartestresult = 'FAIL'

        GlobalVariable.varfailremarks = 'User can not save enter details.'
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