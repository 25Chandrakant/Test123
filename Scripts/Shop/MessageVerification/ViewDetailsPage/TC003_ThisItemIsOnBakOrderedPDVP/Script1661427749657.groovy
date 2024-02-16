import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.configuration.RunConfiguration as RunConfiguration
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.util.internal.PathUtil as PathUtil
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil
import org.openqa.selenium.Keys as Keys
import org.openqa.selenium.By as By
import org.openqa.selenium.WebElement as WebElement
import java.net.MalformedURLException as MalformedURLException
import java.net.URL as URL
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW

try {
    CustomKeywords.'com.application.DateTime.startTime'()

    'Click on Shop link'
    WebUI.click(findTestObject('Object Repository/Shop/VerifyMessage/Page_Toastmasters International -Shop/span_Shop'))

    'Search product Item'
    WebUI.sendKeys(findTestObject('Object Repository/Shop/VerifyMessage/Page_Toastmasters International -Shop/input_Browse Products_txtKeyword'), 
        GlobalVariable.TestData['ThisItemBackOrdered'])

    WebUI.click(findTestObject('Object Repository/Shop/VerifyMessage/Page_Toastmasters International -Shop/button_Search'))

    'Click on View details button'
    WebUI.mouseOver(findTestObject('Object Repository/Shop/VerifyMessage/Page_Toastmasters International -Shop/span_View Details'))

    WebUI.click(findTestObject('Object Repository/Shop/VerifyMessage/Page_Toastmasters International -Shop/span_View Details'))

    String thisItemOnBackOrdered = WebUI.getText(findTestObject('Object Repository/Shop/VerifyMessage/Page_Toastmasters International -Shop/span_This item is on backorder'))

    if (WebUI.verifyElementVisible(findTestObject('Object Repository/Shop/VerifyMessage/Page_Toastmasters International -Shop/span_This item is on backorder'))) {
        GlobalVariable.vartestresult = 'PASS'

        GlobalVariable.varpassremarks = ('Successfully display message on product details view page like' + thisItemOnBackOrdered)
    } else {
        GlobalVariable.vartestresult = 'FAIL'

        GlobalVariable.varfailremarks = ('Not display message on product details view page like.' + thisItemOnBackOrdered)
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