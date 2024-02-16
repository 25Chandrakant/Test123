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

    WebUI.click(findTestObject('Object Repository/District Central/District Success Plan/AdditionalGoals/a_Additional Goals'))

    WebUI.delay(2)

    WebUI.clearText(findTestObject('Object Repository/District Central/District Success Plan/AdditionalGoals/textarea__ImproveentInTheDistrict'))

    WebUI.delay(2)

    WebUI.sendKeys(findTestObject('Object Repository/District Central/District Success Plan/AdditionalGoals/textarea__ImproveentInTheDistrict'), 
        CustomKeywords.'com.application.submitpayment.randomString'(20))

    WebUI.delay(2)

    WebUI.clearText(findTestObject('Object Repository/District Central/District Success Plan/AdditionalGoals/textarea__SituationalAnaliysis'))

    WebUI.delay(2)

    WebUI.sendKeys(findTestObject('Object Repository/District Central/District Success Plan/AdditionalGoals/textarea__SituationalAnaliysis'), 
        CustomKeywords.'com.application.submitpayment.randomString'(20))

    WebUI.delay(2)

    WebUI.clearText(findTestObject('Object Repository/District Central/District Success Plan/AdditionalGoals/textarea__Strategy'))

    WebUI.delay(2)

    WebUI.sendKeys(findTestObject('Object Repository/District Central/District Success Plan/AdditionalGoals/textarea__Strategy'), 
        CustomKeywords.'com.application.submitpayment.randomString'(20))

    WebUI.delay(2)

    WebUI.clearText(findTestObject('Object Repository/District Central/District Success Plan/AdditionalGoals/input__Additional Goals_Strategy_Action1'))

    WebUI.delay(2)

    WebUI.sendKeys(findTestObject('Object Repository/District Central/District Success Plan/AdditionalGoals/input__Additional Goals_Strategy_Action1'), 
        CustomKeywords.'com.application.submitpayment.randomString'(20))

    WebUI.delay(2)

    WebUI.clearText(findTestObject('Object Repository/District Central/District Success Plan/AdditionalGoals/input__Additional Goals_Strategy_Action2'))

    WebUI.delay(2)

    WebUI.sendKeys(findTestObject('Object Repository/District Central/District Success Plan/AdditionalGoals/input__Additional Goals_Strategy_Action2'), 
        CustomKeywords.'com.application.submitpayment.randomString'(20))

    WebUI.delay(2)

    WebUI.clearText(findTestObject('Object Repository/District Central/District Success Plan/AdditionalGoals/input__Additional Goals_Strategy_Action3'))

    WebUI.delay(2)

    WebUI.sendKeys(findTestObject('Object Repository/District Central/District Success Plan/AdditionalGoals/input__Additional Goals_Strategy_Action3'), 
        CustomKeywords.'com.application.submitpayment.randomString'(20))

    WebUI.delay(2)

    WebUI.clearText(findTestObject('Object Repository/District Central/District Success Plan/AdditionalGoals/input__Additional Goals_Strategy_Action4'))

    WebUI.delay(2)

    WebUI.sendKeys(findTestObject('Object Repository/District Central/District Success Plan/AdditionalGoals/input__Additional Goals_Strategy_Action4'), 
        CustomKeywords.'com.application.submitpayment.randomString'(20))

    WebUI.delay(2)

    WebUI.clearText(findTestObject('Object Repository/District Central/District Success Plan/AdditionalGoals/input__Additional Goals_Strategy_Action5'))

    WebUI.delay(2)

    WebUI.sendKeys(findTestObject('Object Repository/District Central/District Success Plan/AdditionalGoals/input__Additional Goals_Strategy_Action5'), 
        CustomKeywords.'com.application.submitpayment.randomString'(20))

    WebUI.delay(2)

    WebUI.clearText(findTestObject('Object Repository/District Central/District Success Plan/AdditionalGoals/textarea__Resources'))

    WebUI.delay(2)

    WebUI.sendKeys(findTestObject('Object Repository/District Central/District Success Plan/AdditionalGoals/textarea__Resources'), 
        CustomKeywords.'com.application.submitpayment.randomString'(20))

    WebUI.delay(2)

    WebUI.clearText(findTestObject('Object Repository/District Central/District Success Plan/AdditionalGoals/textarea__Assignments'))

    WebUI.delay(2)

    WebUI.sendKeys(findTestObject('Object Repository/District Central/District Success Plan/AdditionalGoals/textarea__Assignments'), 
        CustomKeywords.'com.application.submitpayment.randomString'(20))

    WebUI.delay(2)

    WebUI.clearText(findTestObject('Object Repository/District Central/District Success Plan/AdditionalGoals/input__Additional Goals_Assignments_Action1'))

    WebUI.delay(2)

    WebUI.sendKeys(findTestObject('Object Repository/District Central/District Success Plan/AdditionalGoals/input__Additional Goals_Assignments_Action1'), 
        CustomKeywords.'com.application.submitpayment.randomString'(20))

    WebUI.delay(2)

    WebUI.clearText(findTestObject('Object Repository/District Central/District Success Plan/AdditionalGoals/input__Additional Goals_Assignments_Action2'))

    WebUI.delay(2)

    WebUI.sendKeys(findTestObject('Object Repository/District Central/District Success Plan/AdditionalGoals/input__Additional Goals_Assignments_Action2'), 
        CustomKeywords.'com.application.submitpayment.randomString'(20))

    WebUI.delay(2)

    WebUI.clearText(findTestObject('Object Repository/District Central/District Success Plan/AdditionalGoals/input__Additional Goals_Assignments_Action3'))

    WebUI.delay(2)

    WebUI.sendKeys(findTestObject('Object Repository/District Central/District Success Plan/AdditionalGoals/input__Additional Goals_Assignments_Action3'), 
        CustomKeywords.'com.application.submitpayment.randomString'(20))

    WebUI.delay(2)

    WebUI.clearText(findTestObject('Object Repository/District Central/District Success Plan/AdditionalGoals/input__Additional Goals_Assignments_Action4'))

    WebUI.delay(2)

    WebUI.sendKeys(findTestObject('Object Repository/District Central/District Success Plan/AdditionalGoals/input__Additional Goals_Assignments_Action4'), 
        CustomKeywords.'com.application.submitpayment.randomString'(20))

    WebUI.delay(2)

    WebUI.clearText(findTestObject('Object Repository/District Central/District Success Plan/AdditionalGoals/input__Additional Goals_Assignments_Action5'))

    WebUI.delay(2)

    WebUI.sendKeys(findTestObject('Object Repository/District Central/District Success Plan/AdditionalGoals/input__Additional Goals_Assignments_Action5'), 
        CustomKeywords.'com.application.submitpayment.randomString'(20))

    WebUI.delay(2)

    WebUI.clearText(findTestObject('Object Repository/District Central/District Success Plan/AdditionalGoals/textarea__TimeTable'))

    WebUI.delay(2)

    WebUI.sendKeys(findTestObject('Object Repository/District Central/District Success Plan/AdditionalGoals/textarea__TimeTable'), 
        CustomKeywords.'com.application.submitpayment.randomString'(20))

    WebUI.delay(2)

    WebUI.clearText(findTestObject('Object Repository/District Central/District Success Plan/AdditionalGoals/input__Additional Goals_TimeTable_Action1'))

    WebUI.delay(2)

    WebUI.sendKeys(findTestObject('Object Repository/District Central/District Success Plan/AdditionalGoals/input__Additional Goals_TimeTable_Action1'), 
        CustomKeywords.'com.application.submitpayment.randomString'(20))

    WebUI.delay(2)

    WebUI.clearText(findTestObject('Object Repository/District Central/District Success Plan/AdditionalGoals/input__Additional Goals_TimeTable_Action2'))

    WebUI.delay(2)

    WebUI.sendKeys(findTestObject('Object Repository/District Central/District Success Plan/AdditionalGoals/input__Additional Goals_TimeTable_Action2'), 
        CustomKeywords.'com.application.submitpayment.randomString'(20))

    WebUI.delay(2)

    WebUI.clearText(findTestObject('Object Repository/District Central/District Success Plan/AdditionalGoals/input__Additional Goals_TimeTable_Action3'))

    WebUI.delay(2)

    WebUI.sendKeys(findTestObject('Object Repository/District Central/District Success Plan/AdditionalGoals/input__Additional Goals_TimeTable_Action3'), 
        CustomKeywords.'com.application.submitpayment.randomString'(20))

    WebUI.delay(2)

    WebUI.clearText(findTestObject('Object Repository/District Central/District Success Plan/AdditionalGoals/input__Additional Goals_TimeTable_Action4'))

    WebUI.delay(2)

    WebUI.sendKeys(findTestObject('Object Repository/District Central/District Success Plan/AdditionalGoals/input__Additional Goals_TimeTable_Action4'), 
        CustomKeywords.'com.application.submitpayment.randomString'(20))

    WebUI.delay(2)

    WebUI.clearText(findTestObject('Object Repository/District Central/District Success Plan/AdditionalGoals/input__Additional Goals_TimeTable_Action5'))

    WebUI.delay(2)

    WebUI.sendKeys(findTestObject('Object Repository/District Central/District Success Plan/AdditionalGoals/input__Additional Goals_TimeTable_Action5'), 
        CustomKeywords.'com.application.submitpayment.randomString'(20))

    WebUI.delay(2)

    WebUI.click(findTestObject('Object Repository/District Central/District Success Plan/Team Charter_Section1/button_Save'))

    WebUI.delay(1)

    WebUI.mouseOver(findTestObject('Object Repository/District Central/District Success Plan/Team Charter_Section1/button_Ok'))

    WebUI.click(findTestObject('Object Repository/District Central/District Success Plan/Team Charter_Section1/button_Ok'))

    WebUI.delay(5)

    if (WebUI.verifyElementVisible(findTestObject('Object Repository/District Central/District Success Plan/Team Charter_Section1/button_Ok'))) {
		
        
        GlobalVariable.vartestresult = 'PASS'

        GlobalVariable.varpassremarks = 'User is able to submit the additional goals.'
    } else {
        print('FAIL...............................')

        GlobalVariable.vartestresult = 'FAIL'

        GlobalVariable.varfailremarks = 'User is Unable to submit additional goals.'
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