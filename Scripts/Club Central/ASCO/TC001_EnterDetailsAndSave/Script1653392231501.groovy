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
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.By as By
import org.openqa.selenium.WebElement as WebElement
import java.net.URL as URL
import javax.xml.bind.annotation.XmlElementDecl.GLOBAL as GLOBAL
import org.jsoup.Jsoup as Jsoup
import org.jsoup.nodes.Document as Document
import org.jsoup.nodes.Element as Element
import org.jsoup.select.Elements as Elements
import org.openqa.selenium.Capabilities as Capabilities
import org.openqa.selenium.Dimension as Dimension
import org.openqa.selenium.remote.RemoteWebDriver as RemoteWebDriver
import com.kms.katalon.core.webui.common.WebUICommonScripts as WebUICommonScripts
import com.kms.katalon.core.webui.common.WebUiCommonHelper as WebUiCommonHelper
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactoryimport

try {
    CustomKeywords.'com.application.DateTime.startTime'()

   // WebDriver driver = DriverFactory.getWebDriver()

    'Download Historical Addendum'
   /* if (WebUI.verifyElementVisible(findTestObject('Object Repository/ASCO/Page_Toastmasters International -Club Visit Report/a_Download_Historical_Addendum'))) {
		
        WebUI.click(findTestObject('Object Repository/ASCO/Page_Toastmasters International -Club Visit Report/a_Download_Historical_Addendum'))
    }*/
    
    'Click on Access Form'
    WebUI.click(findTestObject('Object Repository/ASCO/button_Access Form'))
	
	'Verify Overview Page'
    WebUI.verifyElementVisible( findTestObject('Object Repository/ASCO/Page_Toastmasters International -Club Visit Report/h1_Overview') , FailureHandling.OPTIONAL)
   
	
	 'Click on Download Currenty Submitted Addendum in PDF'
    if (WebUI.verifyElementVisible(findTestObject('Object Repository/ASCO/Page_Toastmasters International -Club Visit Report/a_Download Currently Submitted Addendum in PDF'))) {
		
        WebUI.click(findTestObject('Object Repository/ASCO/Page_Toastmasters International -Club Visit Report/a_Download Currently Submitted Addendum in PDF'))

        WebUI.scrollToPosition(99999, 99999)

        'Click on Continue where I left off'
        WebUI.click(findTestObject('Object Repository/ASCO/Page_Toastmasters International -Club Visit Report/button_Continue where I left off'))
    }
    
	
	if(WebUI.verifyElementVisible(  findTestObject('Object Repository/ASCO/Page_Toastmasters International -Club Visit Report/button_back'), FailureHandling.OPTIONAL )) {
		WebUI.click(findTestObject('Object Repository/ASCO/Page_Toastmasters International -Club Visit Report/button_back') , FailureHandling.OPTIONAL)
		
		'Verify Overview Page'
		WebUI.verifyElementVisible( findTestObject('Object Repository/ASCO/Page_Toastmasters International -Club Visit Report/h1_Overview') , FailureHandling.OPTIONAL)
	
		'Click on Continue where I left off'
		WebUI.click(findTestObject('Object Repository/ASCO/Page_Toastmasters International -Club Visit Report/button_Continue where I left off'))

		
	}
    'Enter Club Name'
    if (WebUI.verifyElementVisible(findTestObject('Object Repository/ASCO/Page_Toastmasters International -Club Visit Report/Input_ClubName'))) {
		
		'Verify validation message'
		WebUI.clearText( findTestObject('Object Repository/ASCO/Page_Toastmasters International -Club Visit Report/Input_ClubName') )
		//WebUI.click( , FailureHandling.OPTIONAL)
		
		//WebUI.click(findTestObject('Object Repository/ASCO/Page_Toastmasters International -Club Visit Report/button_Continue1') , FailureHandling.OPTIONAL)
		//WebUI.verifyElementVisible( , FailureHandling.OPTIONAL)
		
		//WebUI.verifyElementVisible(findTestObject('Object Repository/ASCO/Page_Toastmasters International -Club Visit Report/validation_Message_name of your club') , FailureHandling.OPTIONAL)
		
		WebUI.delay(3)
		
		'Enter Club Name'
        WebUI.sendKeys(findTestObject('Object Repository/ASCO/Page_Toastmasters International -Club Visit Report/Input_ClubName'), 
            GlobalVariable.TestData['ASCOClubName'])

        'Click on Continue Button'
        WebUI.waitForElementClickable(findTestObject('Object Repository/ASCO/Page_Toastmasters International -Club Visit Report/button_Continue1'), 
            12)
    }
    
	
	WebUI.waitForElementNotVisible( findTestObject('Object Repository/ASCO/Page_Toastmasters International -Club Visit Report/input_Does your club have any restrictions on membership_MainQuestions0.Answer'), 10, FailureHandling.OPTIONAL)
    'Membership Composition'
    if (WebUI.verifyElementVisible(findTestObject('Object Repository/ASCO/Page_Toastmasters International -Club Visit Report/input_Does your club have any restrictions on membership_MainQuestions0.Answer'))) {
        // Click on Yes button 
        'Does your club have any restrictions on membership?'
        WebUI.click(findTestObject('Object Repository/ASCO/Page_Toastmasters International -Club Visit Report/input_Does your club have any restrictions on membership_MainQuestions0.Answer'), 
            FailureHandling.OPTIONAL)

        WebUI.scrollToPosition(99999, 99999)

        'Click on Continue button'
        WebUI.click(findTestObject('ASCO/Page_Toastmasters International -Club Visit Report/button_Continue1'), FailureHandling.OPTIONAL)
    }
    
    if (WebUI.verifyElementVisible(findTestObject('Object Repository/ASCO/Page_Toastmasters International -Club Visit Report/input_Academy  University_option1'))) {
       
		'Select Other radio option'
		WebUI.click( findTestObject('Object Repository/ASCO/Page_Toastmasters International -Club Visit Report/input_YesButton_Other') , FailureHandling.OPTIONAL)
		
		if( WebUI.verifyElementVisible( findTestObject('Object Repository/ASCO/Page_Toastmasters International -Club Visit Report/a_Explain_Other'), FailureHandling.OPTIONAL)){
		   WebUI.click( findTestObject('Object Repository/ASCO/Page_Toastmasters International -Club Visit Report/a_Explain_Other') , FailureHandling.OPTIONAL)
		   
		   WebUI.sendKeys( findTestObject('Object Repository/ASCO/Page_Toastmasters International -Club Visit Report/InputText_ExplainHere') , GlobalVariable.TestData['OtherExplainHere'])
		}
		
		 'Choose which membership restriction your club has:'
        WebUI.click(findTestObject('Object Repository/ASCO/Page_Toastmasters International -Club Visit Report/input_Academy  University_option1'), 
            FailureHandling.OPTIONAL)

        WebUI.scrollToPosition(99999, 99999)

        'Click on Continue Button'
        WebUI.click(findTestObject('ASCO/Page_Toastmasters International -Club Visit Report/button_Continue2'), FailureHandling.OPTIONAL)
    }
    
    if (WebUI.verifyElementVisible(findTestObject('Object Repository/ASCO/Page_Toastmasters International -Club Visit Report/input_Does your club allow honorary memberships_MainQuestions2.Answer'))) {
        //'Click on Yes button'
        'Does your club allow honorary memberships?'
        WebUI.click(findTestObject('Object Repository/ASCO/Page_Toastmasters International -Club Visit Report/input_Does your club allow honorary memberships_MainQuestions2.Answer'), 
            FailureHandling.OPTIONAL)

        WebUI.scrollToPosition(99999, 99999)

        WebUI.delay(3)

        'How many years does the honorary membership last?'
        WebUI.click(findTestObject('Object Repository/ASCO/Page_Toastmasters International -Club Visit Report/select_Select Length'))

        WebUI.click(findTestObject('Object Repository/ASCO/Page_Toastmasters International -Club Visit Report/select_membership_years'))

        WebUI.scrollToPosition(99999, 99999)

        'Click on Continue Button'
        WebUI.click(findTestObject('Object Repository/ASCO/Page_Toastmasters International -Club Visit Report/button_Continue3'), 
            FailureHandling.OPTIONAL)
    }
    
    if (WebUI.verifyElementVisible(findTestObject('Object Repository/ASCO/Page_Toastmasters International -Club Visit Report/select_Select Currency'))) {
        'Membership Dues and Fees'

        'What currency does your club collect dues and fees in?'
        WebUI.sendKeys(findTestObject('Object Repository/ASCO/Page_Toastmasters International -Club Visit Report/select_Select Currency'), 
            GlobalVariable.TestData['Currency'], FailureHandling.OPTIONAL)

        WebUI.scrollToPosition(99999, 99999)

        'Click on Continue Button'
        WebUI.click(findTestObject('Object Repository/ASCO/Page_Toastmasters International -Club Visit Report/button_Continue1'), 
            FailureHandling.OPTIONAL)
    }
    
    if (WebUI.verifyElementVisible(findTestObject('Object Repository/ASCO/Page_Toastmasters International -Club Visit Report/input_Does your club collect fees other than Toastmasters membership dues_MainQuestions1.Answer'))) {
        'Does your club collect fees other than Toastmasters membership dues?'
        WebUI.waitForElementClickable(findTestObject('Object Repository/ASCO/Page_Toastmasters International -Club Visit Report/input_Does your club collect fees other than Toastmasters membership dues_MainQuestions1.Answer'), 
            12, FailureHandling.OPTIONAL)

        WebUI.scrollToPosition(99999, 99999)

        'Click on Continue button'
        WebUI.click(findTestObject('Object Repository/ASCO/Page_Toastmasters International -Club Visit Report/button_Continue2'), 
            FailureHandling.OPTIONAL)
    }
    
    'Who gets charged additional fees? Select all that apply'
    if (driver.findElement(By.xpath('(//*[@id=\'option_2_\'])[1]')).isSelected()) {
        //select=="true"){
        print('Active member already selected')

        WebUI.click(findTestObject('Object Repository/ASCO/Page_Toastmasters International -Club Visit Report/button_Continue3'), 
            FailureHandling.OPTIONAL)
    } else {
        driver.findElement(By.xpath('(//*[@id=\'option_2_\'])[1]')).click()

        WebUI.click(findTestObject('Object Repository/ASCO/Page_Toastmasters International -Club Visit Report/button_Continue3'), 
            FailureHandling.OPTIONAL)

        print('Active member now  selected')
    }
    
    WebUI.delay(3)

    if (WebUI.verifyElementVisible(findTestObject('Object Repository/ASCO/Page_Toastmasters International -Club Visit Report/input_How much does your club collect per member_MainQuestions3.Answer'))) {
        'Enter amount of your club collect per member'
        WebUI.clearText(findTestObject('Object Repository/ASCO/Page_Toastmasters International -Club Visit Report/input_How much does your club collect per member_MainQuestions3.Answer'), 
            FailureHandling.OPTIONAL)

        WebUI.sendKeys(findTestObject('Object Repository/ASCO/Page_Toastmasters International -Club Visit Report/input_How much does your club collect per member_MainQuestions3.Answer'), 
            GlobalVariable.TestData['Amountofcollectmember'], FailureHandling.OPTIONAL)

        //'Click on Yes Button' 
        'Does the above fee include Toastmasters membership dues?'
        WebUI.click(findTestObject('Object Repository/ASCO/Page_Toastmasters International -Club Visit Report/input_Does the above fee include Toastmasters membership dues_MainQuestions4.Answer'), 
            FailureHandling.OPTIONAL)

        WebUI.scrollToPosition(99999, 99999)

        'Click on Continue button'
        WebUI.click(findTestObject('Object Repository/ASCO/Page_Toastmasters International -Club Visit Report/button_Continue4'), 
            FailureHandling.OPTIONAL)
    }
    
    if (WebUI.verifyElementVisible(findTestObject('Object Repository/ASCO/Page_Toastmasters International -Club Visit Report/input_How often does your club collect dues and fees_Monthly'))) {
        //'Click on monthly radio option'
        'How often does your club collect dues and fees?'
        WebUI.click(findTestObject('Object Repository/ASCO/Page_Toastmasters International -Club Visit Report/input_How often does your club collect dues and fees_Monthly'), 
            FailureHandling.OPTIONAL)

        'Select Month option'
        WebUI.sendKeys(findTestObject('Object Repository/ASCO/Page_Toastmasters International -Club Visit Report/select_Select Month'), 
            GlobalVariable.TestData['ASCOMonth'], FailureHandling.OPTIONAL)

        'Select date option'
        WebUI.sendKeys(findTestObject('Object Repository/ASCO/Page_Toastmasters International -Club Visit Report/select_Select Day'), 
            GlobalVariable.TestData['ASCODate'], FailureHandling.OPTIONAL)

        'Click on Continue button'
        WebUI.click(findTestObject('Object Repository/ASCO/Page_Toastmasters International -Club Visit Report/button_Continue5'), 
            FailureHandling.OPTIONAL)
    }
    
    if (WebUI.verifyElementPresent(findTestObject('Object Repository/ASCO/Page_Toastmasters International -Club Visit Report/a_Club Contact and Meeting Info'), 
        10)) {
        'Regular and Executive Committee Meetings'
        WebUI.scrollToPosition(99999, 99999)

        'Click on Continue button'
        WebUI.click(findTestObject('Object Repository/ASCO/Page_Toastmasters International -Club Visit Report/button_Continue1'), 
            FailureHandling.OPTIONAL)
    }
    
    if (WebUI.verifyElementVisible(findTestObject('Object Repository/ASCO/Page_Toastmasters International -Club Visit Report/input_How frequently does the Executive Committee meet_Weekly'))) {
        // 'select Weekly radio option'
        'How frequently does the Executive Committee meet? '
        WebUI.click(findTestObject('Object Repository/ASCO/Page_Toastmasters International -Club Visit Report/input_How frequently does the Executive Committee meet_Weekly'), 
            FailureHandling.OPTIONAL)

        'Click on Continue button'
        WebUI.click(findTestObject('Object Repository/ASCO/Page_Toastmasters International -Club Visit Report/button_Continue2'), 
            FailureHandling.OPTIONAL)
    }
    
    if (WebUI.verifyElementVisible(findTestObject('Object Repository/ASCO/Page_Toastmasters International -Club Visit Report/input_Does your club have any additional officer roles_Yes'))) {
        'Additional Officers and Terms of Office'

        // 'Click on Yes option'
        'Does your club have any additional officer roles?'
        WebUI.click(findTestObject('Object Repository/ASCO/Page_Toastmasters International -Club Visit Report/input_Does your club have any additional officer roles_Yes'), 
            FailureHandling.OPTIONAL)

        // 'Enter role for club'
        'What additional roles does your club have?'
        WebUI.sendKeys(findTestObject('Object Repository/ASCO/Page_Toastmasters International -Club Visit Report/input_What additional roles does your club have'), 
            GlobalVariable.TestData['AdditionalClubRols'], FailureHandling.OPTIONAL)

        WebUI.scrollToPosition(99999, 99999)

        'Click on Continue button'
        WebUI.click(findTestObject('Object Repository/ASCO/Page_Toastmasters International -Club Visit Report/button_Continue1'), 
            FailureHandling.OPTIONAL)
    }
    
    if (WebUI.verifyElementVisible(findTestObject('Object Repository/ASCO/Page_Toastmasters International -Club Visit Report/input_Full Year'))) {
        // 'What term length do officers serve?'
        'Select Full year option'
        WebUI.click(findTestObject('Object Repository/ASCO/Page_Toastmasters International -Club Visit Report/input_Full Year'), 
            FailureHandling.OPTIONAL)

        WebUI.scrollToPosition(99999, 99999)

        'Click on Continue button'
        WebUI.click(findTestObject('Object Repository/ASCO/Page_Toastmasters International -Club Visit Report/button_Continue2'), 
            FailureHandling.OPTIONAL)
    }
    
    //'What parliamentary procedure does this club follow?'
    'Rules of Order'
    WebUI.click(findTestObject('Object Repository/ASCO/Page_Toastmasters International -Club Visit Report/input_Robert, , s Rules'), 
        FailureHandling.OPTIONAL)

    'Click on Continue button'
    WebUI.click(findTestObject('Object Repository/ASCO/Page_Toastmasters International -Club Visit Report/button_Continue1'), 
        FailureHandling.OPTIONAL)

    'Review and Submit your Club’s Addendum'

    'Click on Expand button'
    WebUI.scrollToPosition(0, 0)

    WebUI.waitForElementClickable(findTestObject('Object Repository/ASCO/Page_Toastmasters International -Club Visit Report/button_Expand All'), 
        10, FailureHandling.OPTIONAL)

    'Click on Collapse button'
    WebUI.click(findTestObject('Object Repository/ASCO/Page_Toastmasters International -Club Visit Report/button_Collapse All'), 
        FailureHandling.OPTIONAL)

    'Click on Submit report'
    WebUI.click(findTestObject('Object Repository/ASCO/Page_Toastmasters International -Club Visit Report/button_Submit Report'), 
        FailureHandling.OPTIONAL)

    'Click on Download Copy button'
    WebUI.click(findTestObject('Object Repository/ASCO/Page_Toastmasters International -Club Visit Report/button_Download a copy'), 
        FailureHandling.OPTIONAL)

    'Click on Close and Exist button'
    WebUI.click(findTestObject('Object Repository/ASCO/Page_Toastmasters International -Club Visit Report/button_Close and exit'), 
        FailureHandling.OPTIONAL)

    if (WebUI.waitForElementVisible(findTestObject('Object Repository/ASCO/h1_Addendum of Standard Club Options'), 150)) {
        GlobalVariable.vartestresult = 'PASS'

        GlobalVariable.varpassremarks = 'User Successfully enter all details.'
    } else {
        GlobalVariable.vartestresult = 'FAIL'

        GlobalVariable.varfailremarks = 'User unable to add details and get error message'
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