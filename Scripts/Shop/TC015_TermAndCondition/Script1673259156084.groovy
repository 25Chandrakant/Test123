import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
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

try {
    CustomKeywords.'com.application.DateTime.startTime'()

    WebUI.click(findTestObject('Object Repository/Shop/Page_Shopping Cart/button_Secure Checkout'))

    if (WebUI.verifyElementVisible(findTestObject('Object Repository/Shop/a_MySelf'))) {
        WebUI.click(findTestObject('Object Repository/Shop/a_MySelf'))
    } else {
    }
    
    WebUI.delay(20)

    WebUI.verifyElementPresent(findTestObject('Object Repository/s_N_Shop/Page_Checkout/a_Edit'), 10)

    WebUI.scrollToPosition(10, 10)

    WebUI.click(findTestObject('Object Repository/s_N_Shop/Page_Checkout/a_Edit'))

    WebUI.verifyElementVisible(findTestObject('Object Repository/s_N_Shop/Page_Checkout/button_Yes'))

    WebUI.click(findTestObject('Object Repository/s_N_Shop/Page_Checkout/button_Yes'))

    WebUI.delay(10)

    if (WebUI.verifyElementPresent(findTestObject('Object Repository/Shop/k -Shop/text_consent'), 20)) {
        GlobalVariable.vartestresult = 'PASS'

        GlobalVariable.varpassremarks = 'Successfully Completed T&C'
    } else {
        GlobalVariable.vartestresult = 'FAIL'

        GlobalVariable.varfailremarks = 'UnSuccessfully Completed T&C'

        Thread.sleep(2000)
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