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

	WebUI.delay(2)

	CustomKeywords.'com.application.DPOSCustomKeyword.needSomeHelpCloseButton'()

	WebUI.waitForElementClickable(findTestObject('Object Repository/Shop/Shop_DigitalProductOrder/link_ProgramAndModulesClick'), 120)
	
	WebUI.click(findTestObject('Object Repository/Shop/Shop_DigitalProductOrder/link_ProgramAndModulesClick'))
	
	WebUI.delay(2)
	
	//WebUI.scrollToElement(findTestObject('Object Repository/Shop/Shop_DigitalProductOrder/btn_SelectDigitalProduct'), 120)

	WebUI.waitForElementClickable(findTestObject('Object Repository/Shop/Shop_DigitalProductOrder/btn_SelectDigitalProduct'), 120)
	
	WebUI.click(findTestObject('Object Repository/Shop/Shop_DigitalProductOrder/btn_SelectDigitalProduct'))

	WebUI.waitForElementClickable(findTestObject('Object Repository/Shop/Shop_DigitalProductOrder/btn_AddItemToCartPopUp'), 120)

	WebUI.click(findTestObject('Object Repository/Shop/Shop_DigitalProductOrder/btn_AddItemToCartPopUp'))

	WebUI.waitForElementClickable(findTestObject('Object Repository/Shop/Shop_DigitalProductOrder/btn_ViewCartCheckout'), 120)
	
	WebUI.click(findTestObject('Object Repository/Shop/Shop_DigitalProductOrder/btn_ViewCartCheckout'))

	CustomKeywords.'com.application.DPOSCustomKeyword.needSomeHelpCloseButton'()

	WebUI.waitForElementClickable(findTestObject('Object Repository/Shop/Page_Shopping Cart/button_Secure Checkout'), 120)

	WebUI.click(findTestObject('Object Repository/Shop/Page_Shopping Cart/button_Secure Checkout'))

	'Click on Next button of  Shipping Address'
	WebUI.waitForElementClickable(findTestObject('Object Repository/Shop/Page_Checkout/a_Next'), 120)

	WebUI.click(findTestObject('Object Repository/Shop/Page_Checkout/a_Next'))

	'Click on Continue button for Address '
	if (WebUI.verifyElementVisible(findTestObject('Object Repository/Shop/k -Shop/button_continue'), FailureHandling.OPTIONAL)) {
		WebUI.click(findTestObject('Object Repository/Shop/k -Shop/button_continue'))

		WebUI.click(findTestObject('Object Repository/Shop/k -Shop/button_closeShippingModel'))
	}
	
	WebUI.delay(4)

	CustomKeywords.'com.application.submitpayment.shopPayment'()
	
	WebUI.click(findTestObject('Object Repository/Shop/Shop_DigitalProductOrder/btn_PaymentPageNextBtnDigitalOrder'))

	'Click on place order button'
	WebUI.waitForElementClickable(findTestObject('Object Repository/Shop/Page_Checkout/a_Place Your Order'), 120)

	WebUI.click(findTestObject('Object Repository/Shop/Page_Checkout/a_Place Your Order'))
	
	WebUI.delay(10)

	if (WebUI.verifyElementVisible(findTestObject('Object Repository/Shop/text_VerifyOrderRefNum')))
	{
		String orderId = WebUI.getText(findTestObject('Object Repository/Shop/text_VerifyOrderRefNum'))

		println('................................' + orderId)

		String DigitalOrderID = orderId.substring(17)

		GlobalVariable.OrderID = DigitalOrderID

		GlobalVariable.vartestresult = 'PASS'
		
		GlobalVariable.varfailremarks = 'Order is successfully created for Digital Product'
	}
	else
	{
		GlobalVariable.vartestresult = 'FAIL'

		GlobalVariable.varfailremarks = 'Order was not created'
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