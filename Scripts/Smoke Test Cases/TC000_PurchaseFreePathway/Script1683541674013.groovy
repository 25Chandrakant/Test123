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

	CustomKeywords.'com.application.DPOSCustomKeyword.needSomeHelpCloseButton'()

      'Click on Language Dropdown'
	  
	WebUI.waitForElementClickable(findTestObject('Object Repository/Pathway/tile_LearningHub'), 120)
	  
    WebUI.click(findTestObject('Object Repository/Pathway/tile_LearningHub'))
	  
	WebUI.delay(2)

	WebUI.click(findTestObject('Object Repository/Pathway/tile_ChoosePath_20'))
	  
	WebUI.delay(10)
	
	WebUI.click(findTestObject('Object Repository/Pathway/Select_Printed_PathWay/select_LangDropdwn'))
	
	WebUI.delay(2)

    WebUI.sendKeys(findTestObject('Object Repository/Pathway/select_pathwayLanguage'), GlobalVariable.TestData["PathwayLanguage"])

    WebUI.delay(3)

    WebUI.click(findTestObject('Object Repository/Pathway/div_Select Digital Resources'))
	
	WebUI.delay(2)

    WebUI.click(findTestObject('Object Repository/Pathway/div_View Path Options'))
	
	WebUI.delay(2)

    WebUI.click(findTestObject('Object Repository/Pathway/button_Continue'))
	
	WebUI.delay(5)

    if (WebUI.verifyElementVisible(findTestObject('Object Repository/Pathway/Select_Printed_PathWay/span_Select Presentation Mastery'))) {
		
        WebUI.click(findTestObject('Object Repository/Pathway/Select_Printed_PathWay/span_Select Presentation Mastery'))
		
		WebUI.delay(2)
		
    } else if (WebUI.verifyElementVisible(findTestObject('Object Repository/Pathway/Select_DigitalPathways/div_SelectEngagingHumor'))) {
	
        WebUI.click(findTestObject('Object Repository/Pathway/Select_DigitalPathways/div_SelectEngagingHumor'))
		
		WebUI.delay(2)
		
	} else if (WebUI.verifyElementVisible(findTestObject('Object Repository/Pathway/Select_DigitalPathways/div_Select Innovative Planning'))) {
	
		WebUI.click(findTestObject('Object Repository/Pathway/Select_DigitalPathways/div_Select Innovative Planning'))
		
		WebUI.delay(2)
		
    } else if (WebUI.verifyElementVisible(findTestObject('Object Repository/Pathway/Select_Printed_PathWay/span_Select Leadership Development'))) {
	
        WebUI.click(findTestObject('Object Repository/Pathway/Select_Printed_PathWay/span_Select Leadership Development'))
		
		WebUI.delay(2)
		
	} else if (WebUI.verifyElementVisible(findTestObject('Object Repository/Pathway/Select_DigitalPathways/div_Select Motivational Strategies'))) {
	
		WebUI.click(findTestObject('Object Repository/Pathway/Select_DigitalPathways/div_Select Motivational Strategies'))
		
		WebUI.delay(2)
		
	} else if (WebUI.verifyElementVisible(findTestObject('Object Repository/Pathway/Select_DigitalPathways/div_Select Persuasive Influence'))) {
	
		WebUI.click(findTestObject('Object Repository/Pathway/Select_DigitalPathways/div_Select Persuasive Influence'))
		
		WebUI.delay(2)
		
		
    } else if (WebUI.verifyElementVisible(findTestObject('Object Repository/Pathway/Select_Printed_PathWay/span_Select Strategic Relationships'))) {
	
        WebUI.click(findTestObject('Object Repository/Pathway/Select_Printed_PathWay/span_Select Strategic Relationships'))
		
		WebUI.delay(2)
		
    } else if (WebUI.verifyElementVisible(findTestObject('Object Repository/Pathway/Select_Printed_PathWay/span_Select Team Collaboration'))) {
	
        WebUI.click(findTestObject('Object Repository/Pathway/Select_Printed_PathWay/span_Select Team Collaboration'))
		
		WebUI.delay(2)
		
    } else {
    }
    
    WebUI.click(findTestObject('Object Repository/Pathway/Select_Printed_PathWay/button_ContinueForSelectedPathway'))
	
	WebUI.delay(6)

    WebUI.click(findTestObject('Object Repository/Pathway/Select_Printed_PathWay/button_ContinueForSelectedPathway'))
	
	WebUI.delay(6)

    /*if (WebUI.verifyElementVisible(findTestObject('Object Repository/Pathway/Page_Checkout/button_Checkout_Yes'), FailureHandling.OPTIONAL)) {
		
        WebUI.click(findTestObject('Object Repository/Pathway/Page_Checkout/button_Checkout_Yes'))
    } else {
    }*/
    
	
	
	'Click on Next button of  Shipping Address'
	WebUI.waitForElementVisible(findTestObject('My Home/My Downloads/a_Next'), 120)
	
	WebUI.click(findTestObject('My Home/My Downloads/a_Next'))
	
	WebUI.delay(5)
	
	'Click on Continue button for Address '
	WebUI.click(findTestObject('My Home/My Downloads/a_Continue'))
	
	WebUI.delay(5)
	
	WebUI.click(findTestObject('My Home/My Downloads/a_Close'))
	
	WebUI.delay(5)
	
	'Click on Next button of Shipping Method'
	WebUI.waitForElementVisible(findTestObject('My Home/My Downloads/a_Next'), 120)
	
	WebUI.click(findTestObject('My Home/My Downloads/a_Next'))
	
	WebUI.delay(5)
	
	CustomKeywords.'com.application.submitpayment.shopPayment'()
	
	WebUI.delay(4)
	
	WebUI.waitForElementVisible(findTestObject('My Home/My Downloads/a_NextButtonOfPayment'), 120)
	
	WebUI.click(findTestObject('My Home/My Downloads/a_NextButtonOfPayment'))
	
	WebUI.delay(10)
	
	'Click on place order button'
	WebUI.waitForElementVisible(findTestObject('My Home/My Downloads/a_PlaceYourOrder'), 120)
	
	WebUI.click(findTestObject('My Home/My Downloads/a_PlaceYourOrder'))
	
	WebUI.delay(10)

    if (WebUI.waitForElementVisible(findTestObject('Object Repository/Pathway/Page_Checkout/h2_Order Reference SO-000000002397'), 
        500)) {
	
        String digitalOrderNumber = WebUI.getText(findTestObject('Object Repository/Pathway/Page_Checkout/h2_Order Reference SO-000000002397'))

        String digitalOnlyNumber = digitalOrderNumber.substring(17)

        GlobalVariable.DigitalPrintedPathWayOrderNumber = digitalOnlyNumber
		
		WebUI.delay(3)

        String digitalOrderValue = WebUI.getText(findTestObject('Object Repository/Pathway/Page_Checkout/td_48.49'))

        GlobalVariable.DigitalPrintedPathwayOrderValue = digitalOrderValue
		
		WebUI.delay(2)

        WebUI.mouseOver(findTestObject('My Profile/a_mouseHoverWelcome'))

        WebUI.delay(2)

        WebUI.click(findTestObject('My Profile/text_dropdownWelCome'))
		
		WebUI.delay(3)

        WebUI.click(findTestObject('My Profile/tile_OrderHistory'))
		
		WebUI.delay(3)

        WebUI.sendKeys(findTestObject('My Profile/OrderHistory/input_search'), digitalOnlyNumber)
		
		WebUI.delay(3)

        String digitalordernumber = WebUI.getText(findTestObject('My Profile/OrderHistory/td_orderNumber'))

        String digitalordervalue = WebUI.getText(findTestObject('My Profile/OrderHistory/td_orderValue'))

        if ((digitalordernumber == GlobalVariable.PrintedPathWayOrderNumber) && (digitalordervalue == GlobalVariable.PrintedPathwayOrderValue)) {
			
            println('PASS...............................................................')
			
			WebUI.delay(7)
			
			if (WebUI.verifyElementVisible(findTestObject('My Profile/a_mouseHoverWelcome'))) {
				
				WebUI.mouseOver(findTestObject('My Profile/a_mouseHoverWelcome'))
				
				WebUI.delay(2)
		
				WebUI.click(findTestObject('Object Repository/Login/a_Logout'))
				
			} else {
			}
			
			WebUI.delay(2)
        } else {
            println('FAIL...............................................................')
        }
        
        GlobalVariable.vartestresult = 'PASS'

        GlobalVariable.varpassremarks = 'Successfully buy digital pathway and display order details into order history page'
		
    } else if (WebUI.verifyElementVisible(findTestObject('Object Repository/Pathway/Page_Checkout/h1_Order Failure'))) {
	
        GlobalVariable.vartestresult = 'FAIL'

        GlobalVariable.varfailremarks = 'Order Fail.'
    } else {
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