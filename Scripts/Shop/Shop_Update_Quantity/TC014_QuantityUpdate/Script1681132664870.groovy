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
import org.junit.After as After
import org.openqa.selenium.By as By
import org.openqa.selenium.WebElement as WebElement
import java.net.MalformedURLException as MalformedURLException
import java.net.URL as URL

try {
	CustomKeywords.'com.application.DateTime.startTime'()

	WebUI.click(findTestObject('Shop/Page_Toastmasters International -Welcome/span_Shop1'))

	WebUI.delay(2)

	CustomKeywords.'com.application.DPOSCustomKeyword.needSomeHelpCloseButton'()

	'Click on search box to find product'

	WebUI.click(findTestObject('Object Repository/Shop/Shop_Update_Qty/searchbox_ClickOnSearchBox'))

	WebUI.delay(2)

	WebUI.sendKeys(findTestObject('Object Repository/Shop/Shop_Update_Qty/searchbox_ClickOnSearchBox'), GlobalVariable.TestData['ProductID'])

	WebUI.sendKeys(findTestObject('Object Repository/Shop/Shop_Update_Qty/searchbox_ClickOnSearchBox'), Keys.chord(Keys.ENTER))

	WebUI.delay(2)

	WebUI.click(findTestObject('Object Repository/Shop/Shop_Update_Qty/btn_AddProductBtn'))

	WebUI.delay(2)

	WebUI.click(findTestObject('Object Repository/Shop/Shop_Update_Qty/btn_AddProductToCartBtn'))

	WebUI.delay(2)
	
	WebUI.click(findTestObject('Object Repository/Shop/Shop_For_You/btn_ViewCartCheckoutBtn'))
	
	WebUI.delay(2)

	WebUI.verifyElementPresent(findTestObject('Object Repository/s_N_Shop/Page_Shopping Cart/input_Quantity_quantityB57'),
			10)

	WebUI.setText(findTestObject('Object Repository/s_N_Shop/Page_Shopping Cart/input_Quantity_quantityB57'), '2')

	if (WebUI.verifyElementVisible(findTestObject('Object Repository/s_N_Shop/Page_Shopping Cart/a_Update')))
	{
		GlobalVariable.vartestresult = 'PASS'

		GlobalVariable.varpassremarks = 'Product Quantity Updated Successfully'

		WebUI.click(findTestObject('Object Repository/s_N_Shop/Page_Shopping Cart/a_Update'))

	}
	else
	{
		GlobalVariable.vartestresult = 'FAIL'

		GlobalVariable.varfailremarks = 'Product Quantity not updated'


		Thread.sleep(2)
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