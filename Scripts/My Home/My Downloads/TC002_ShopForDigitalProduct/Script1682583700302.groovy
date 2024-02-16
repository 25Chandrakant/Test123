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
	
	CustomKeywords.'com.application.DPOSCustomKeyword.needSomeHelpCloseButton'()
	
	WebUI.delay(2)

    WebUI.click(findTestObject('Shop/Page_Toastmasters International -Welcome/span_Shop1'))
	
	WebUI.delay(2)

    'Click on For You link Text'
    WebUI.click(findTestObject('My Home/My Downloads/a_ProgramsAndModules'))
	
    WebUI.delay(2)
	
    WebUI.click(findTestObject('My Home/My Downloads/a_AddToCart'))
	
	WebUI.delay(3)
	
	WebUI.click(findTestObject('My Home/My Downloads/a_AddToCart2'))
	
	WebUI.delay(4)

    WebUI.click(findTestObject('My Home/My Downloads/a_ViewCartandCheckout'))

    WebUI.delay(5)

    CustomKeywords.'com.application.DPOSCustomKeyword.needSomeHelpCloseButton'()
	
	WebUI.delay(2)
	
	WebUI.click(findTestObject('My Home/My Downloads/a_SecureCheckout'))
	
	WebUI.delay(4)
	
	'Click on Next button of  Shipping Address'
	WebUI.click(findTestObject('My Home/My Downloads/a_Next'))
	
	WebUI.delay(3)
	
	'Click on Continue button for Address '
	WebUI.click(findTestObject('My Home/My Downloads/a_Continue'))
	
	WebUI.delay(3)
	
	WebUI.click(findTestObject('My Home/My Downloads/a_Close'))
	
	WebUI.delay(3)
	
	'Click on Next button of Shipping Method'
	WebUI.click(findTestObject('My Home/My Downloads/a_Next'))
	
	WebUI.delay(4)
	
	CustomKeywords.'com.application.submitpayment.shopPayment'()
	
	WebUI.delay(4)
	
	WebUI.click(findTestObject('My Home/My Downloads/a_NextButtonOfPayment'))
	
	WebUI.delay(10)
	
	'Click on place order button'
	WebUI.click(findTestObject('My Home/My Downloads/a_PlaceYourOrder'))
	
	WebUI.delay(10)

    if (WebUI.verifyElementVisible(findTestObject('Object Repository/Shop/text_VerifyOrderRefNum')))
	{
		String trimOrderID = WebUI.getText(findTestObject('Object Repository/Shop/text_VerifyOrderRefNum'))
		
		println('.......................................' + trimOrderID)

		String finalOrderID = trimOrderID.substring(17)
		
		GlobalVariable.OrderID = finalOrderID

		GlobalVariable.vartestresult = 'PASS'

		GlobalVariable.varpassremarks = ('Order Created  successfully for Digital Product : ' + GlobalVariable.OrderID)

    } else {
	
        GlobalVariable.vartestresult = 'FAIL'

        GlobalVariable.varfailremarks = 'Digital Product is not purchased.'
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