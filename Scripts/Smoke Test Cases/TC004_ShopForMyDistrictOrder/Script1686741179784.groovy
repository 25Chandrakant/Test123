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

	WebUI.click(findTestObject('Object Repository/Shop/k -Shop/a_ForYourDistrict'))

	CustomKeywords.'com.application.DPOSCustomKeyword.needSomeHelpCloseButton'()

	WebUI.waitForElementClickable(findTestObject('Object Repository/Shop/Shop_For_District/btn_AddItemToCart'), 20)

	WebUI.click(findTestObject('Object Repository/Shop/Shop_For_District/btn_AddItemToCart'))

	WebUI.delay(2)

	WebUI.click(findTestObject('Object Repository/Shop/Shop_For_District/btn_PopUpAddToCartBtn'))

	WebUI.waitForElementClickable(findTestObject('Object Repository/Shop/Shop_For_District/btn_ViewCartCheckoutBtn'),
			20)

	WebUI.click(findTestObject('Object Repository/Shop/Shop_For_District/btn_ViewCartCheckoutBtn'))

	CustomKeywords.'com.application.DPOSCustomKeyword.needSomeHelpCloseButton'()

	WebUI.delay(2)

	WebUI.click(findTestObject('Object Repository/Shop/Shop_For_District/btn_ClickToAddEngraving'))

	WebUI.delay(2)

	WebUI.click(findTestObject('Object Repository/Shop/Shop_For_District/textbox_LineOneAddText'))

	WebUI.sendKeys(findTestObject('Object Repository/Shop/Shop_For_District/textbox_LineOneAddText'), 'Hello')

	WebUI.delay(2)

	WebUI.click(findTestObject('Object Repository/Shop/Shop_For_District/textbox_LineTwoAddText'))

	WebUI.sendKeys(findTestObject('Object Repository/Shop/Shop_For_District/textbox_LineTwoAddText'), 'World')

	WebUI.delay(2)

	WebUI.click(findTestObject('Object Repository/Shop/Shop_For_District/btn_SaveEngravingBtn'))

	WebUI.delay(4)

	WebUI.click(findTestObject('Object Repository/Shop/Page_Shopping Cart/button_Secure Checkout'))

	if (WebUI.verifyElementVisible(findTestObject('Object Repository/Shop/a_District'))) {
		
		WebUI.click(findTestObject('Object Repository/Shop/a_District'))
		
	} else {
	}

	'Click on Next button of  Shipping Address'
	WebUI.waitForElementVisible(findTestObject('Object Repository/Shop/Page_Checkout/a_Next'),120)

	WebUI.click(findTestObject('Object Repository/Shop/Page_Checkout/a_Next'))

	'Click on Continue button for Address '
	//if (WebUI.verifyElementVisible(findTestObject('Object Repository/Shop/k -Shop/button_continue'))) {

	//	WebUI.click(findTestObject('Object Repository/Shop/k -Shop/button_continue'))

	//	WebUI.click(findTestObject('Object Repository/Shop/k -Shop/button_closeShippingModel'))
	//}
	
	WebUI.waitForElementVisible(findTestObject('Object Repository/Shop/Page_Checkout/a_Next'),120)
	
	WebUI.click(findTestObject('Object Repository/Shop/Page_Checkout/a_Next'))

	'Click on Next button of Shipping Method'
	WebUI.waitForElementClickable(findTestObject('Object Repository/Shop/Page_Checkout/a_Next1'), 240)

	WebUI.click(findTestObject('Object Repository/Shop/Page_Checkout/a_Next1'))
	
	'Click on Bill to District CheckBox'
	
	WebUI.waitForElementClickable(findTestObject('Object Repository/Shop/Shop_For_District/checkbox_ClickBillToDistrict'), 120)
	
	WebUI.click(findTestObject('Object Repository/Shop/Shop_For_District/checkbox_ClickBillToDistrict'))
	
	WebUI.waitForElementClickable(findTestObject('Object Repository/Shop/Shop_For_District/btn_ClickNextBtnDistrictBill'), 120)
	
	WebUI.click(findTestObject('Object Repository/Shop/Shop_For_District/btn_ClickNextBtnDistrictBill'))

	'Click on place order button'
	WebUI.waitForElementClickable(findTestObject('Object Repository/Shop/Page_Checkout/a_Place Your Order'),120)

	WebUI.click(findTestObject('Object Repository/Shop/Page_Checkout/a_Place Your Order'))
	
	WebUI.delay(4)


	if (WebUI.verifyElementVisible(findTestObject('Object Repository/Shop/text_VerifyOrderRefNum'))) 
	{
		String Orderid = WebUI.getText(findTestObject('Object Repository/Shop/text_VerifyOrderRefNum'))

		println('.............................' + Orderid)

		String subStringDistict = Orderid.substring(17)

		GlobalVariable.OrderIDDistrict = subStringDistict
		
		WebUI.delay(5)
		
		if (WebUI.verifyElementVisible(findTestObject('My Profile/a_mouseHoverWelcome'))) {
			
			WebUI.mouseOver(findTestObject('My Profile/a_mouseHoverWelcome'))
			
			WebUI.delay(2)
	
			WebUI.click(findTestObject('Object Repository/My Profile/a_MyHome'))
			
		} else {
		}

		GlobalVariable.vartestresult = 'PASS'

		GlobalVariable.varpassremarks = ('Order Created  successfully for MyDistrict: ' + GlobalVariable.OrderIDDistrict)
	}
	else
	{
		GlobalVariable.vartestresult = 'FAIL'

		GlobalVariable.varpassremarks = 'Display Order is Fail for District.'
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