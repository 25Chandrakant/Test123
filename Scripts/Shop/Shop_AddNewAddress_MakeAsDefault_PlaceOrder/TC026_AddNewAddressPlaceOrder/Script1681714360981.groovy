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

	CustomKeywords.'com.application.DPOSCustomKeyword.needSomeHelpCloseButton'()

	WebUI.waitForElementClickable(findTestObject('Object Repository/Shop/Shop_CreateNewAddress/link_ClickOnShopLink'), 120)

	WebUI.click(findTestObject('Object Repository/Shop/Shop_CreateNewAddress/link_ClickOnShopLink'))

	WebUI.waitForElementClickable(findTestObject('Object Repository/Shop/Shop_CreateNewAddress/breadcrumb_MenuSelection'), 120)

	WebUI.click(findTestObject('Object Repository/Shop/Shop_CreateNewAddress/breadcrumb_MenuSelection'))

	WebUI.waitForElementClickable(findTestObject('Object Repository/Shop/Shop_CreateNewAddress/select_GiftsOptionInShop'), 120)

	WebUI.click(findTestObject('Object Repository/Shop/Shop_CreateNewAddress/select_GiftsOptionInShop'))

	WebUI.delay(2)

	CustomKeywords.'com.application.DPOSCustomKeyword.needSomeHelpCloseButton'()

	WebUI.waitForElementClickable(findTestObject('Object Repository/Shop/Shop_CreateNewAddress/btn_AddItemToCartBtn'), 120)

	WebUI.click(findTestObject('Object Repository/Shop/Shop_CreateNewAddress/btn_AddItemToCartBtn'))

	WebUI.waitForElementClickable(findTestObject('Object Repository/Shop/Shop_CreateNewAddress/btn_PopUpAddToCartBtn'), 120)

	WebUI.click(findTestObject('Object Repository/Shop/Shop_CreateNewAddress/btn_PopUpAddToCartBtn'))

	WebUI.waitForElementClickable(findTestObject('Object Repository/Shop/Shop_CreateNewAddress/btn_ViewCartAndCheckout'), 120)

	WebUI.click(findTestObject('Object Repository/Shop/Shop_CreateNewAddress/btn_ViewCartAndCheckout'))

	WebUI.waitForElementClickable(findTestObject('Object Repository/Shop/Shop_CreateNewAddress/btn_SecureCheckoutBtn'), 120)

	WebUI.click(findTestObject('Object Repository/Shop/Shop_CreateNewAddress/btn_SecureCheckoutBtn'))

	WebUI.click(findTestObject('Object Repository/s_N_Shop/Page_Checkout/a_(Select Another Address)'))

	WebUI.click(findTestObject('Object Repository/s_N_Shop/Page_Checkout/a_Create New Address'))

	WebUI.delay(2)

	CustomKeywords.'com.application.FakerFunctionality.FakerFunction'()

	WebUI.delay(4)

	WebUI.click(findTestObject('Object Repository/Shop/Shop_CreateNewAddress/checkbox_MarkAsDefaultAddress'))

	WebUI.delay(4)
	
	'Get Country name and Postal Code'
	GlobalVariable.AddCountry = WebUI.getText(findTestObject('Object Repository/Shop/Shop_CreateNewAddress/dropdown_SelectCountry'))
	
	WebUI.delay(4)
	
	GlobalVariable.AddZipCode = WebUI.getText(findTestObject('Object Repository/Shop/Shop_CreateNewAddress/textbox_EnterZipCode'))
	
	WebUI.delay(4)

	WebUI.click(findTestObject('Object Repository/s_N_Shop/Page_Checkout/a_Next'))

	WebUI.delay(4)

	if(WebUI.verifyElementVisible(findTestObject('Object Repository/s_N_Shop/Page_Checkout/a_Save')))
	{
		WebUI.click(findTestObject('Object Repository/s_N_Shop/Page_Checkout/a_Save'))

		WebUI.click(findTestObject('Object Repository/Shop/Shop_CreateNewAddress/btn_ClickOnCloseBtnValidAddress'))
	}
	else if(WebUI.verifyElementVisible(findTestObject('Object Repository/Shop/Shop_CreateNewAddress/btn_VerifyContinueBtnInvalidAddress')))
	{
		WebUI.click(findTestObject('Object Repository/Shop/Shop_CreateNewAddress/btn_VerifyContinueBtnInvalidAddress'))

		WebUI.click(findTestObject('Object Repository/Shop/Shop_CreateNewAddress/btn_CloseBtnInvalidAddress'))
	}
	else
	{
		print('Both Button are not visible')
	}

	'Click on Next button of  Shipping Address'
	WebUI.waitForElementClickable(findTestObject('Object Repository/Shop/Page_Checkout/a_Next'), 120)

	WebUI.click(findTestObject('Object Repository/Shop/Page_Checkout/a_Next'))

	'Click on Next button of Shipping Method'
	WebUI.waitForElementClickable(findTestObject('Object Repository/Shop/Page_Checkout/a_Next1'), 240)

	WebUI.click(findTestObject('Object Repository/Shop/Page_Checkout/a_Next1'))

	CustomKeywords.'com.application.submitpayment.shopPayment'()

	WebUI.click(findTestObject('Object Repository/Shop/btn_ClickNextBtn'))

	'Click on place order button'
	WebUI.waitForElementClickable(findTestObject('Object Repository/Shop/Page_Checkout/a_Place Your Order'), 120)

	WebUI.click(findTestObject('Object Repository/Shop/Page_Checkout/a_Place Your Order'))

	if (WebUI.verifyElementVisible(findTestObject('Object Repository/Shop/text_VerifyOrderRefNum')))
	{
		String NewAddressOrderId = WebUI.getText(findTestObject('Object Repository/Shop/text_VerifyOrderRefNum'))

		println('................................' + NewAddressOrderId)

		String FinalOrderID = NewAddressOrderId.substring(17)

		GlobalVariable.OrderID = FinalOrderID

		GlobalVariable.vartestresult = 'PASS'

		GlobalVariable.varfailremarks = 'Order is successfully created on New Address'
	}
	else
	{
		GlobalVariable.vartestresult = 'FAIL'

		GlobalVariable.varfailremarks = 'There was a Order Failure'
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