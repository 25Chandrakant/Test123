import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil
import org.openqa.selenium.Keys as Keys
import org.openqa.selenium.By as By
import org.openqa.selenium.WebElement as WebElement
import org.stringtemplate.v4.compiler.STParser.ifstat_return as ifstat_return
import java.net.URL as URL

try {
    CustomKeywords.'com.application.DateTime.startTime'()

      'Click on Language Dropdown'
   
	WebUI.delay(3)
	
	WebUI.click(findTestObject('Object Repository/Pathway/Select_Printed_PathWay/select_LangDropdwn'))
	
	WebUI.delay(2)
	
	WebUI.sendKeys(findTestObject('Object Repository/Pathway/Select_Printed_PathWay/select_LangDropdwn') ,GlobalVariable.TestData["PathwayLanguage"])
	
	WebUI.sendKeys(findTestObject('Object Repository/Pathway/Select_Printed_PathWay/select_LangDropdwn'), Keys.chord(Keys.ENTER))
	
	WebUI.delay(3)

    WebUI.click(findTestObject('Object Repository/Pathway/Select_Printed_PathWay/div_Select Printed Materials'))
	
	WebUI.delay(3)

    WebUI.click(findTestObject('Object Repository/Pathway/button_Continue'))
	
	WebUI.delay(10)

    if (WebUI.verifyElementVisible(findTestObject('Object Repository/Pathway/Select_Printed_PathWay/span_Select Presentation Mastery'))) {
		
        WebUI.click(findTestObject('Object Repository/Pathway/Select_Printed_PathWay/span_Select Presentation Mastery'))
		
		WebUI.delay(3)
		
    } else if (WebUI.verifyElementVisible(findTestObject('Object Repository/Pathway/Select_Printed_PathWay/span_Select Dynamic Leadership'))) {
	
        WebUI.click(findTestObject('Object Repository/Pathway/Select_Printed_PathWay/span_Select Dynamic Leadership'))
		
		WebUI.delay(3)
		
    } else if (WebUI.verifyElementVisible(findTestObject('Object Repository/Pathway/Select_Printed_PathWay/span_Select Leadership Development'))) {
	
        WebUI.click(findTestObject('Object Repository/Pathway/Select_Printed_PathWay/span_Select Leadership Development'))
		
		WebUI.delay(3)
		
    } else if (WebUI.verifyElementVisible(findTestObject('Object Repository/Pathway/Select_Printed_PathWay/span_Select Strategic Relationships'))) {
	
        WebUI.click(findTestObject('Object Repository/Pathway/Select_Printed_PathWay/span_Select Strategic Relationships'))
		
		WebUI.delay(3)
		
    } else if (WebUI.verifyElementVisible(findTestObject('Object Repository/Pathway/Select_Printed_PathWay/span_Select Team Collaboration'))) {
	
        WebUI.click(findTestObject('Object Repository/Pathway/Select_Printed_PathWay/span_Select Team Collaboration'))
		
		WebUI.delay(3)
		
    } else {
    }
    
    WebUI.click(findTestObject('Object Repository/Pathway/Select_Printed_PathWay/button_ContinueForSelectedPathway'))
	
	WebUI.delay(5)

    WebUI.click(findTestObject('Object Repository/Pathway/Select_Printed_PathWay/button_ContinueForSelectedPathway'))
	
	WebUI.delay(5)

    WebUI.click(findTestObject('Object Repository/Pathway/Page_Checkout/button_Checkout_Yes'))
	
	WebUI.delay(3)
	
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

    if (WebUI.waitForElementVisible(findTestObject('Object Repository/Pathway/Page_Checkout/h2_Order Reference SO-000000002397'),500)) {
      
		
		String printedOrderNumber = WebUI.getText(findTestObject('Object Repository/Pathway/Page_Checkout/h2_Order Reference SO-000000002397'))

        String onlyPrintedNumber = printedOrderNumber.substring(17)

        GlobalVariable.PrintedPathWayOrderNumber = onlyPrintedNumber
		
        String printedOrderValue = WebUI.getText(findTestObject('Object Repository/Pathway/Page_Checkout/td_48.49'))

        GlobalVariable.PrintedPathwayOrderValue = printedOrderValue

        WebUI.mouseOver(findTestObject('My Profile/a_mouseHoverWelcome'))

        WebUI.delay(1)

        WebUI.click(findTestObject('My Profile/text_dropdownWelCome'))
		
		WebUI.delay(2)

        WebUI.click(findTestObject('My Profile/tile_OrderHistory'))
		
		WebUI.delay(2)

        WebUI.sendKeys(findTestObject('My Profile/OrderHistory/input_search'), onlyPrintedNumber)
		
		WebUI.delay(2)

        String printordernumber = WebUI.getText(findTestObject('My Profile/OrderHistory/td_orderNumber'))

        String printordervalue = WebUI.getText(findTestObject('My Profile/OrderHistory/td_orderValue'))

        if ((printordernumber == GlobalVariable.PrintedPathWayOrderNumber) && (printordervalue == GlobalVariable.PrintedPathwayOrderValue)) {
            println('PASS...............................................................')
        } else {
            println('FAIL...............................................................')
        }
		
		GlobalVariable.vartestresult = 'PASS'
		
	    GlobalVariable.varpassremarks = 'Successfully buy printed pathway and display orderdetails into order history page'
    } 
	
	 else if (WebUI.verifyElementVisible(  findTestObject('Object Repository/Pathway/Page_Checkout/h1_Order Failure')  )){
		 
		 GlobalVariable.vartestresult = 'FAIL'
		 
		 GlobalVariable.varfailremarks = 'Order Fail.'
	 }
	else {
        GlobalVariable.vartestresult = 'FAIL'

        GlobalVariable.varfailremarks = 'User getting error when user place order.'

        WebUI.back()
    }
    
    /*
    if (WebUI.verifyElementVisible(findTestObject('Object Repository/Pathway/text_Enroll_Successfully'))) {
        GlobalVariable.vartestresult = 'PASS'

        GlobalVariable.varpassremarks = 'Successfully display Confirm your path page'
    } else {
        GlobalVariable.vartestresult = 'FAIL'

        GlobalVariable.varfailremarks = 'Display error on Confirm your path page.'

        WebUI.back()
    }*/
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