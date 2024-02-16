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
import org.openqa.selenium.remote.RemoteWebDriver as RemoteWebDriver
import com.kms.katalon.core.webui.common.WebUICommonScripts as WebUICommonScripts
import com.kms.katalon.core.webui.common.WebUiCommonHelper as WebUiCommonHelper
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory

try {
	CustomKeywords.'com.application.DateTime.startTime'()
	
	WebUI.click(findTestObject('My Home/Go To BaseCamp/dropdown_login'))
	
	WebUI.delay(5)
	
    WebUI.click(findTestObject('My Home/Go To BaseCamp/div_MyHome'))
	 
	WebUI.delay(10)

    WebUI.click(findTestObject('Object Repository/ClubCentral/Leadership-Home/a_Club Central'))

    if (WebUI.verifyElementVisible(findTestObject('Object Repository/ClubCentral/Leadership-Home/div_clubName'), FailureHandling.OPTIONAL)) {
        //String ClubName = WebUI.getText(findTestObject('Object Repository/ClubCentral/Leadership-Home/div_clubName'))
        //print('........................................', +(ClubName))
        WebUI.click(findTestObject('Object Repository/ClubCentral/Leadership-Home/div_clubName'))
    } else {
    }
    
    CustomKeywords.'com.application.DPOSCustomKeyword.needSomeHelpCloseButton'()

 
   // WebUI.click(findTestObject('Object Repository/ClubCentral/Leadership-Home/i_Club Success Plan_fa fa-close'))

    WebUI.click(findTestObject('Object Repository/Submit Education Awards/div_Submit Education Awards'))

    if (WebUI.verifyElementVisible(findTestObject('Object Repository/Submit Education Awards/h1_Submit Education Awards'))) {
        GlobalVariable.vartestresult = 'PASS'

        GlobalVariable.varpassremarks = 'User Successfully landing on Submit Education Award page.'
    } else {
        GlobalVariable.vartestresult = 'FAIL'

        GlobalVariable.varfailremarks = 'User unable go to Submit Education Award Page.'
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