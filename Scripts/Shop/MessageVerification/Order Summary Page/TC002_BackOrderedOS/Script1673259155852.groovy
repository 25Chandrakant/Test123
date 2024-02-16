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

    WebUI.click(findTestObject('Object Repository/Shop/VerifyMessage/Page_Toastmasters International -Shop/span_Shop'))

    'Search product Item'
    WebUI.sendKeys(findTestObject('Object Repository/Shop/VerifyMessage/Page_Toastmasters International -Shop/input_Browse Products_txtKeyword'), 
        GlobalVariable.TestData['CSP_MQBAPNC'])

    WebUI.click(findTestObject('Object Repository/Shop/VerifyMessage/Page_Toastmasters International -Shop/button_Search'))

    'Click on Add To Cart button'
    WebUI.mouseOver(findTestObject('Object Repository/Shop/VerifyMessage/Page_Toastmasters International -Shop/a_Add To Cart_SearchPage'))

    WebUI.click(findTestObject('Object Repository/Shop/VerifyMessage/Page_Toastmasters International -Shop/a_Add To Cart_SearchPage'))

    'Click on Add to Cart of Pop Up'
    WebUI.click(findTestObject('Object Repository/Shop/VerifyMessage/Page_Toastmasters International -Shop/a_Add To Cart_On_ViewProductListingPage_PopUp'))

    'Click on Checkout and ViewCart button'
    WebUI.click(findTestObject('Object Repository/Shop/VerifyMessage/Page_Toastmasters International -Shop/button_CheckOut_ViewCart'))

    CustomKeywords.'com.application.DPOSCustomKeyword.needSomeHelpCloseButton'()

    WebUI.clearText(findTestObject('Object Repository/Shop/VerifyMessage/Page_Toastmasters International -Shop/input_quantityOrderCartSummary'))

    WebUI.sendKeys(findTestObject('Object Repository/Shop/VerifyMessage/Page_Toastmasters International -Shop/input_quantityOrderCartSummary'), 
        '1000')

    WebUI.click(findTestObject('Object Repository/Shop/VerifyMessage/Page_Toastmasters International -Shop/button_Update'))

    'Click on Secure CheckOut button'
    WebUI.click(findTestObject('Object Repository/Shop/VerifyMessage/Page_Toastmasters International -Shop/button_SecureCheckout'))

    if (WebUI.verifyElementVisible(findTestObject('Object Repository/Shop/VerifyMessage/Page_Toastmasters International -Shop/button_MySelf'))) {
        WebUI.click(findTestObject('Object Repository/Shop/VerifyMessage/Page_Toastmasters International -Shop/button_MySelf'))
    }
    
    String backOrded = WebUI.getText(findTestObject('Object Repository/Shop/VerifyMessage/Page_Toastmasters International -Shop/p_Backordered'))

    if (WebUI.verifyElementVisible(findTestObject('Object Repository/Shop/VerifyMessage/Page_Toastmasters International -Shop/p_Backordered'))) {
        WebUI.click(findTestObject('Object Repository/Shop/VerifyMessage/Page_Toastmasters International -Shop/button_Cart'))

        WebUI.click(findTestObject('Object Repository/Shop/VerifyMessage/Page_Toastmasters International -Shop/button_RemoveAll'))

        GlobalVariable.vartestresult = 'PASS'

        GlobalVariable.varpassremarks = ('Successfully display message on order summary page like.' + backOrded)
    } else if (backOrded == null) {
        WebUI.click(findTestObject('Object Repository/Shop/VerifyMessage/Page_Toastmasters International -Shop/button_Cart'))

        if (WebUI.verifyElementVisible(findTestObject('Object Repository/Shop/VerifyMessage/Page_Toastmasters International -Shop/button_Remove'))) {
            WebUI.click(findTestObject('Object Repository/Shop/VerifyMessage/Page_Toastmasters International -Shop/button_Remove'))
        } else {
            WebUI.click(findTestObject('Object Repository/Shop/VerifyMessage/Page_Toastmasters International -Shop/button_RemoveAll'))
        }
        
        GlobalVariable.vartestresult = 'FAIL'

        GlobalVariable.varfailremarks = ('Not display message on order summary page because the value is.' + backOrded)
    } else {
        WebUI.click(findTestObject('Object Repository/Shop/VerifyMessage/Page_Toastmasters International -Shop/button_Cart'))

        if (WebUI.verifyElementVisible(findTestObject('Object Repository/Shop/VerifyMessage/Page_Toastmasters International -Shop/button_Remove'))) {
            WebUI.click(findTestObject('Object Repository/Shop/VerifyMessage/Page_Toastmasters International -Shop/button_Remove'))
        } else {
            WebUI.click(findTestObject('Object Repository/Shop/VerifyMessage/Page_Toastmasters International -Shop/button_RemoveAll'))
        }
        
        GlobalVariable.vartestresult = 'FAIL'

        GlobalVariable.varfailremarks = ('Not display message on order summary page like.' + backOrded)
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