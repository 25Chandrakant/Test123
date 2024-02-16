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

    'Click on For You link Text'
    WebUI.click(findTestObject('Object Repository/Shop/k -Shop/a_ForYou'))

    CustomKeywords.'com.application.DPOSCustomKeyword.needSomeHelpCloseButton'()

    WebUI.waitForElementClickable(findTestObject('Object Repository/Shop/k -Shop/button_ForYourClub_AddToCart'), 120)

    WebUI.click(findTestObject('Object Repository/Shop/k -Shop/button_ForYourClub_AddToCart'))

    WebUI.waitForElementClickable(findTestObject('Object Repository/Shop/k -Shop/button_ForYourClub_AddToCart1'), 120)

    WebUI.click(findTestObject('Object Repository/Shop/k -Shop/button_ForYourClub_AddToCart1'))

    WebUI.waitForElementClickable(findTestObject('Object Repository/Shop/Page_Toastmasters International -/a_View Cart  Checkout'), 
        120)

    WebUI.click(findTestObject('Object Repository/Shop/Page_Toastmasters International -/a_View Cart  Checkout'))

    CustomKeywords.'com.application.DPOSCustomKeyword.needSomeHelpCloseButton'()

    WebUI.waitForElementClickable(findTestObject('Object Repository/Shop/Page_Shopping Cart/button_Secure Checkout'), 120)

    WebUI.click(findTestObject('Object Repository/Shop/Page_Shopping Cart/button_Secure Checkout'))

    if (WebUI.verifyElementVisible(findTestObject('Object Repository/Shop/a_MySelf'))) {
        WebUI.click(findTestObject('Object Repository/Shop/a_MySelf'))
    } else {
    }
	
	WebUI.delay(50)
	
	//WebUI.click(findTestObject('Object Repository/Shop/k -Shop/a_Edit'))
	
	//WebUI.delay(10)
    
   // if (WebUI.verifyElementVisible(findTestObject('Object Repository/Shop/k -Shop/button_yesForConsent'))) {
   //     WebUI.click(findTestObject('Object Repository/Shop/k -Shop/button_yesForConsent'))
   // }
	
	//WebUI.delay(10)
    
    'Click on Next button of  Shipping Address'
   if( WebUI.verifyElementVisible(findTestObject('Object Repository/Shop/Page_Checkout/a_Next1'))){
	   WebUI.click(findTestObject('Object Repository/Shop/Page_Checkout/a_Next1'))
	   }
   else{
	   }
	
	WebUI.delay(10)

    'Click on Continue button for Address '
    if (WebUI.verifyElementVisible(findTestObject('Object Repository/Shop/k -Shop/button_continue'))) {
        WebUI.click(findTestObject('Object Repository/Shop/k -Shop/button_continue'))

        WebUI.click(findTestObject('Object Repository/Shop/k -Shop/button_closeShippingModel'))
    }
	else{
	}
    
    'Click on Next button of Shipping Method'
    WebUI.waitForElementVisible(findTestObject('Object Repository/Shop/Page_Checkout/a_Next1'), 240)

    WebUI.click(findTestObject('Object Repository/Shop/Page_Checkout/a_Next1'))

    'Enter Payment details'
    WebUI.waitForElementVisible(findTestObject('Object Repository/Shop/Page_Checkout/input__number'), 120)
	
	WebUI.click(findTestObject('Object Repository/Shop/Page_Checkout/input__number'))
	
    WebUI.setText(findTestObject('Object Repository/Shop/Page_Checkout/input__number'), '4012 8888 8888 1881')
	
	WebUI.click(findTestObject('Object Repository/Shop/Page_Checkout/input__expiration'))

    WebUI.setText(findTestObject('Object Repository/Shop/Page_Checkout/input__expiration'), '09/2024')
	
	WebUI.click(findTestObject('Object Repository/Shop/Page_Checkout/input__cvc'))

    WebUI.setText(findTestObject('Object Repository/Shop/Page_Checkout/input__cvc'), '123')

    'Click on Next for payment details '
    WebUI.click(findTestObject('Object Repository/Shop/Page_Checkout/a_Next2'))

    'Click on place order button'
    WebUI.waitForElementClickable(findTestObject('Object Repository/Shop/Page_Checkout/a_Place Your Order'), 120)

    WebUI.click(findTestObject('Object Repository/Shop/Page_Checkout/a_Place Your Order'))

    if (WebUI.verifyElementVisible(findTestObject('Object Repository/Shop/Page_Receipt/H1_OrderFailure'))) {
        WebUI.click(findTestObject('Object Repository/Shop/VerifyMessage/Page_Toastmasters International -Shop/button_Cart'))

        WebUI.click(findTestObject('Object Repository/Shop/VerifyMessage/Page_Toastmasters International -Shop/button_Remove'))

        GlobalVariable.vartestresult = 'FAIL'

        GlobalVariable.varpassremarks = 'Order is Fail for MySelf.'
    } else if (WebUI.verifyElementVisible(findTestObject('Object Repository/Shop/Page_Receipt/h2_Order Reference SO-000000002151'))) {
        String Orderid = WebUI.getText(findTestObject('Object Repository/Shop/Page_Receipt/h2_Order Reference SO-000000002151'))

        String substring = Orderid.substring(17)

        println('.......................................' + substring)

        GlobalVariable.OrderID = substring

        println('.......................................' + Orderid)

        GlobalVariable.vartestresult = 'PASS'

        GlobalVariable.varpassremarks = ('Order Created  successfully for MySelf : ' + Orderid)
    } else {
        GlobalVariable.vartestresult = 'FAIL'

        GlobalVariable.varfailremarks = 'Order is not created for MySelf.'
    }
    
    /*
				 * String TotalOrder = WebUI.getText(findTestObject('Object Repository/Shop/k
				 * -Shop/text_OrderValue'))
				 * 
				 * GlobalVariable.ProductTotalValue = TotalOrder
				 * 
				 * WebUI.verifyElementText(findTestObject('Object
				 * Repository/Shop/Page_Receipt/p_Visa ending in 8120'), 'Visa ending in 8120')
				 * 
				 * if (WebUI.verifyElementVisible(findTestObject('Object
				 * Repository/Shop/Page_Receipt/h1_Your order request has been received
				 * suc_91da32'))) {
				 * 
				 * } else {
				 * 
				 * }
				 */
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