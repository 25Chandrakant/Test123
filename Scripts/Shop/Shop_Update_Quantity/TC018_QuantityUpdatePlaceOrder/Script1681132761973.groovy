import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable

try
{
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

	'Click on Next button of Shipping Method'
	WebUI.waitForElementClickable(findTestObject('Object Repository/Shop/Page_Checkout/a_Next1'), 240)

	WebUI.click(findTestObject('Object Repository/Shop/Page_Checkout/a_Next1'))
	
	'Make Payment for the order'

	CustomKeywords.'com.application.submitpayment.shopPayment'()
	
	WebUI.click(findTestObject('Object Repository/Shop/btn_ClickNextBtn'))

	'Click on place order button'
	WebUI.waitForElementClickable(findTestObject('Object Repository/Shop/Page_Checkout/a_Place Your Order'), 120)

	WebUI.click(findTestObject('Object Repository/Shop/Page_Checkout/a_Place Your Order'))

	if (WebUI.verifyElementVisible(findTestObject('Object Repository/Shop/text_VerifyOrderRefNum')))
	{
		String orderId = WebUI.getText(findTestObject('Object Repository/Shop/text_VerifyOrderRefNum'))

		println('................................' + orderId)

		String QtyFinalOrderID = orderId.substring(17)

		GlobalVariable.OrderID = QtyFinalOrderID

		GlobalVariable.vartestresult = 'PASS'

		GlobalVariable.varfailremarks = 'Order is successfully created with Updated Quantity'
	}
	else
	{
		GlobalVariable.vartestresult = 'FAIL'

		GlobalVariable.varfailremarks = 'Order was not created Successfully.'
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