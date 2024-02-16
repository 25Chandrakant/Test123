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

	//CustomKeywords.'com.application.DPOSCustomKeyword.needSomeHelpCloseButton'()

	WebUI.delay(2)

	WebUI.click(findTestObject('Shop/Page_Toastmasters International -Welcome/span_Shop1'))

	'Click on For You link Text'
	WebUI.click(findTestObject('Object Repository/Shop/k -Shop/a_ForYou'))

	WebUI.delay(2)

	WebUI.click(findTestObject('Object Repository/Shop - New/a_Meetings'))

	WebUI.delay(3)

	WebUI.click(findTestObject('Object Repository/Shop - New/a_Awards'))

	WebUI.delay(2)

	WebUI.click(findTestObject('Object Repository/Shop/k -Shop/button_ForYourClub_AddToCart'))

	WebUI.waitForElementClickable(findTestObject('Object Repository/Shop/k -Shop/button_ForYourClub_AddToCart1'), 120)

	WebUI.click(findTestObject('Object Repository/Shop/k -Shop/button_ForYourClub_AddToCart1'))

	WebUI.waitForElementClickable(findTestObject('Object Repository/Shop/Page_Toastmasters International -/a_View Cart  Checkout'),
			120)

	WebUI.click(findTestObject('Object Repository/Shop/Page_Toastmasters International -/a_View Cart  Checkout'))

	WebUI.delay(3)

	CustomKeywords.'com.application.DPOSCustomKeyword.needSomeHelpCloseButton'()

	WebUI.waitForElementClickable(findTestObject('Object Repository/Shop - New/a_Engraving'), 120)

	WebUI.click(findTestObject('Object Repository/Shop - New/a_Engraving'))

	WebUI.delay(4)

	WebUI.click(findTestObject('Object Repository/Shop - New/input_Line1'))

	WebUI.delay(4)

	WebUI.sendKeys(findTestObject('Object Repository/Shop - New/input_Line1'), 'Hello')

	WebUI.delay(4)

	WebUI.click(findTestObject('Object Repository/Shop - New/a_SaveForEngraving'))

	WebUI.delay(5)

	WebUI.click(findTestObject('Object Repository/Shop - New/button_SecureCheckout'))

	WebUI.delay(4)

	WebUI.click(findTestObject('Object Repository/Shop - New/a_MySelf'))

	WebUI.delay(5)
	
	WebUI.waitForElementVisible(findTestObject('Object Repository/Shop - New/a_Next'), 240)

	WebUI.click(findTestObject('Object Repository/Shop - New/a_Next'))

	WebUI.delay(4)
	
	if (WebUI.verifyElementVisible(findTestObject('Object Repository/Shop - New/a_Continue'))){

		WebUI.click(findTestObject('Object Repository/Shop - New/a_Continue'))

		WebUI.delay(3)

		WebUI.click(findTestObject('Object Repository/Shop - New/a_Close'))
	}

	WebUI.delay(4)

	WebUI.click(findTestObject('Object Repository/Shop - New/a_Next'))

	//WebUI.delay(4)

	'Click on Next button of Shipping Method'
	
	WebUI.waitForElementVisible(findTestObject('Object Repository/Shop - New/a_Next1'), 240)

	WebUI.click(findTestObject('Object Repository/Shop - New/a_Next1'))

	WebUI.delay(3)

	'Enter Payment details'
	
	CustomKeywords.'com.application.submitpayment.shopPayment'()
	
	//WebUI.delay(2)
	
	WebUI.waitForElementVisible(findTestObject('Object Repository/Shop - New/a_Next2'), 240)
	
	WebUI.click(findTestObject('Object Repository/Shop - New/a_Next2'))

	WebUI.delay(4)

	'Click on place order button'
	 WebUI.waitForElementClickable(findTestObject('Object Repository/Shop - New/a_PlaceYourOrder'), 120)

	WebUI.delay(4)

	WebUI.click(findTestObject('Object Repository/Shop - New/a_PlaceYourOrder'))

	WebUI.delay(8)

	if (WebUI.verifyElementVisible(findTestObject('Object Repository/Shop/Page_Receipt/h2_Order Reference SO-000000002151'))) {
		
			String Orderid = WebUI.getText(findTestObject('Object Repository/Shop/Page_Receipt/h2_Order Reference SO-000000002151'))
	
			String substring = Orderid.substring(17)
	
			println('.......................................' + substring)
	
			GlobalVariable.OrderID = substring
	
			println('.......................................' + Orderid)
			
			WebUI.delay(4)
			
			if (WebUI.verifyElementVisible(findTestObject('My Profile/a_mouseHoverWelcome'))) {
				
				WebUI.mouseOver(findTestObject('My Profile/a_mouseHoverWelcome'))
				
				WebUI.delay(2)
		
				WebUI.click(findTestObject('Object Repository/My Profile/a_MyHome'))
				
			} else {
			}
	
			GlobalVariable.vartestresult = 'PASS'
	
			GlobalVariable.varpassremarks = ('Order Created  successfully for MySelf : ' + Orderid)
			
		} else {
		
			GlobalVariable.vartestresult = 'FAIL'
	
			GlobalVariable.varfailremarks = 'Order is not created for MySelf.'
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