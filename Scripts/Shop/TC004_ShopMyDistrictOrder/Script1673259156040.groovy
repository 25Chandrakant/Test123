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

    WebUI.click(findTestObject('Shop/Page_Toastmasters International -Welcome/span_Shop1'))

    WebUI.click(findTestObject('Object Repository/Shop/k -Shop/a_ForYourDistrict'))

    CustomKeywords.'com.application.DPOSCustomKeyword.needSomeHelpCloseButton'()

    WebUI.waitForElementClickable(findTestObject('Object Repository/Shop/k -Shop/button_ForYourClub_AddToCart'), 20)

    WebUI.click(findTestObject('Object Repository/Shop/k -Shop/button_ForYourClub_AddToCart'))

    WebUI.click(findTestObject('Object Repository/Shop/k -Shop/button_ForYourClub_AddToCart1'))

    WebUI.waitForElementClickable(findTestObject('Object Repository/Shop/Page_Toastmasters International -/a_View Cart  Checkout'), 
        20)

    WebUI.click(findTestObject('Object Repository/Shop/Page_Toastmasters International -/a_View Cart  Checkout'))

    if (WebUI.waitForElementVisible(findTestObject('Object Repository/Shop/k -Shop/button_Engraving'), 20)) {
        WebUI.click(findTestObject('Object Repository/Shop/k -Shop/button_Engraving'))

        WebUI.sendKeys(findTestObject('Object Repository/Shop/k -Shop/input_Engraving_Line1'), 'kishan patel District')

        WebUI.click(findTestObject('Object Repository/Shop/k -Shop/button_Engraving_Save'))
    } else {
    }
    
    CustomKeywords.'com.application.DPOSCustomKeyword.needSomeHelpCloseButton'()

    WebUI.click(findTestObject('Object Repository/Shop/Page_Shopping Cart/button_Secure Checkout'))

    if (WebUI.verifyElementVisible(findTestObject('Object Repository/Shop/a_District'))) {
        WebUI.click(findTestObject('Object Repository/Shop/a_District'))
    } else {
    }
    
    if (WebUI.verifyElementVisible(findTestObject('Object Repository/Shop/k -Shop/button_yesForConsent'))) {
        WebUI.click(findTestObject('Object Repository/Shop/k -Shop/button_yesForConsent'))
    }
    
    'Click on Next button of  Shipping Address'
    WebUI.waitForElementClickable(findTestObject('Object Repository/Shop/Page_Checkout/a_Next'), 120)

    WebUI.click(findTestObject('Object Repository/Shop/Page_Checkout/a_Next'))

    'Click on Continue button for Address '
    if (WebUI.verifyElementVisible(findTestObject('Object Repository/Shop/k -Shop/button_continue'))) {
        //, FailureHandling.OPTIONAL
        WebUI.click(findTestObject('Object Repository/Shop/k -Shop/button_continue'))

        WebUI.click(findTestObject('Object Repository/Shop/k -Shop/button_closeShippingModel'))
    }
    
    'Click on Next button of Shipping Method'
    WebUI.waitForElementClickable(findTestObject('Object Repository/Shop/Page_Checkout/a_Next1'), 240)

    WebUI.click(findTestObject('Object Repository/Shop/Page_Checkout/a_Next1'))

    'Click on Next for payment details '
    WebUI.waitForElementClickable(findTestObject('Object Repository/Shop/k -Shop/checkBox_PaymentMethod'), 120)

    WebUI.click(findTestObject('Object Repository/Shop/k -Shop/checkBox_PaymentMethod'))

    WebUI.click(findTestObject('Object Repository/Shop/Page_Checkout/a_Next1'))

    if (WebUI.verifyElementVisible(findTestObject('Object Repository/Shop/UnexpectedError_Text'))) {
        WebUI.refresh()

        WebUI.click(findTestObject('Object Repository/Shop/VerifyMessage/Page_Toastmasters International -Shop/button_Cart'))

        if (WebUI.verifyElementVisible(findTestObject('Object Repository/Shop/VerifyMessage/Page_Toastmasters International -Shop/button_Remove'))) {
            WebUI.click(findTestObject('Object Repository/Shop/VerifyMessage/Page_Toastmasters International -Shop/button_Remove'))
        } else {
            WebUI.click(findTestObject('Object Repository/Shop/VerifyMessage/Page_Toastmasters International -Shop/button_RemoveAll'))
        }
    }
    
	else if ( WebUI.verifyElementVisible(findTestObject('Object Repository/Shop/Page_Checkout/a_Place Your Order'))) {
		'Click on place order button'
		WebUI.click(findTestObject('Object Repository/Shop/Page_Checkout/a_Place Your Order'))
		
		if (WebUI.verifyElementVisible(findTestObject('Object Repository/Shop/Page_Receipt/H1_OrderFailure'))) {
			WebUI.click(findTestObject('Object Repository/Shop/VerifyMessage/Page_Toastmasters International -Shop/button_Cart'))
	
			WebUI.click(findTestObject('Object Repository/Shop/VerifyMessage/Page_Toastmasters International -Shop/button_Remove'))
	
			GlobalVariable.vartestresult = 'FAIL'
	
			GlobalVariable.varpassremarks = 'Display Order is Fail for District.'
		}
		
		else if (WebUI.verifyElementVisible(findTestObject('Object Repository/Shop/Page_Receipt/h2_Order Reference SO-000000002151'))) {
			String Orderid = WebUI.getText(findTestObject('Object Repository/Shop/Page_Receipt/h2_Order Reference SO-000000002151'))
	
			println('.............................' + Orderid)
	
			String subStringDistict = Orderid.substring(17)
	
			GlobalVariable.OrderIDDistrict = subStringDistict
	
			println('.............................' + subStringDistict)
	
			GlobalVariable.vartestresult = 'PASS'
	
			GlobalVariable.varpassremarks = ('Order Created  successfully for MyDistrict: ' + subStringDistict)
		}
		else {
			
		}
	}
	else {
		GlobalVariable.vartestresult = 'FAIL'

		GlobalVariable.varfailremarks = 'Order is not created for MyDistrict.'
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