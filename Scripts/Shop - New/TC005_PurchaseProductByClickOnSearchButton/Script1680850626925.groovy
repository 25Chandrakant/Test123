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
import org.junit.After
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
	
	CustomKeywords.'com.application.DPOSCustomKeyword.needSomeHelpCloseButton'()
	
	WebUI.delay(2)

    WebUI.click(findTestObject('Shop/Page_Toastmasters International -Welcome/span_Shop1'))

    'Click on Search '
    WebUI.click(findTestObject('Object Repository/Shop - New/input_Search'))

    WebUI.delay(2)

    WebUI.sendKeys(findTestObject('Object Repository/Shop - New/input_Search'), 'B2')
	
	WebUI.delay(4)
	
	WebUI.sendKeys(findTestObject('Object Repository/Shop - New/input_Search'), Keys.chord(Keys.ENTER))
	
	WebUI.delay(2)
	
	if (WebUI.verifyElementVisible(findTestObject('Object Repository/Shop - New/a_BookName'))){
		
		WebUI.delay(1)
		
		WebUI.click(findTestObject('Object Repository/Shop - New/span_AddToCartForBook'))
		
	}
	
	WebUI.delay(2)
	
    WebUI.click(findTestObject('Object Repository/Shop - New/a_AddToCartForBook2'))

    WebUI.delay(2)

    WebUI.click(findTestObject('Object Repository/Shop - New/a_ViewCartAndCheckout'))

    WebUI.delay(2)
	
	CustomKeywords.'com.application.DPOSCustomKeyword.needSomeHelpCloseButton'()
	
	WebUI.delay(2)

    WebUI.click(findTestObject('Object Repository/Shop - New/button_SecureCheckout'))
	
	WebUI.delay(2)

    WebUI.click(findTestObject('Object Repository/Shop - New/a_MySelf'))
	
	WebUI.delay(5)

    CustomKeywords.'com.application.DPOSCustomKeyword.needSomeHelpCloseButton'()

    WebUI.delay(2)
	
	WebUI.click(findTestObject('Object Repository/Shop - New/a_Next'))
	
	WebUI.delay(2)
	
	if (WebUI.verifyElementVisible(findTestObject('Object Repository/Shop - New/a_Continue'))){
		
		WebUI.click(findTestObject('Object Repository/Shop - New/a_Continue'))
		
		WebUI.delay(3)
		
		WebUI.click(findTestObject('Object Repository/Shop - New/a_Close'))
	}
	
	WebUI.delay(2)
	
	WebUI.click(findTestObject('Object Repository/Shop - New/a_Next'))
	
	'Click on Next button of Shipping Method'
	
	WebUI.click(findTestObject('Object Repository/Shop - New/a_Next1'))
	
	WebUI.delay(2)

    'Enter Payment details'
    WebUI.waitForElementVisible(findTestObject('Object Repository/Shop - New/input_CardNumber'), 120)
	
	WebUI.click(findTestObject('Object Repository/Shop - New/input_CardNumber'))
	
	WebUI.delay(2)
	
    WebUI.setText(findTestObject('Object Repository/Shop - New/input_CardNumber'), '4032 0334 6824 8120')
	
	WebUI.delay(2)
	
	WebUI.click(findTestObject('Object Repository/Shop - New/input_ExpirationDate'))
	
	WebUI.delay(2)

    WebUI.setText(findTestObject('Object Repository/Shop/Page_Checkout/input__expiration'), '09/2024')
	
	WebUI.delay(2)
	
	WebUI.click(findTestObject('Object Repository/Shop - New/input_SecurityCode'))
	
	WebUI.delay(2)

    WebUI.setText(findTestObject('Object Repository/Shop - New/input_SecurityCode'), '123')
	
	WebUI.delay(2)

    'Click on Next for payment details '
    WebUI.click(findTestObject('Object Repository/Shop - New/a_Next2'))
	
	WebUI.delay(2)

    'Click on place order button'
    WebUI.waitForElementClickable(findTestObject('Object Repository/Shop - New/a_PlaceYourOrder'), 120)

    WebUI.click(findTestObject('Object Repository/Shop - New/a_PlaceYourOrder'))
	
	WebUI.delay(2)

    if (WebUI.verifyElementVisible(findTestObject('Object Repository/Shop/Page_Receipt/h2_Order Reference SO-000000002151'))) {
		
        String Orderid = WebUI.getText(findTestObject('Object Repository/Shop/Page_Receipt/h2_Order Reference SO-000000002151'))

        String substring = Orderid.substring(17)

        println('.......................................' + substring)

        GlobalVariable.OrderID = substring

        println('.......................................' + Orderid)

        GlobalVariable.vartestresult = 'PASS'

        GlobalVariable.varpassremarks = ('Order Created  successfully by searching Product Id : ' + Orderid)
    } else {
        GlobalVariable.vartestresult = 'FAIL'

        GlobalVariable.varfailremarks = 'Order is not created by searching Product Id.'
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