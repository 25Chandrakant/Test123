
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import javax.media.PackageManager as PackageManager
import javax.naming.Context
import javax.servlet.annotation.WebInitParam

import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.webui.keyword.internal.WebUIAbstractKeyword as WebUIAbstractKeyword
import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil
import com.kms.katalon.core.util.internal.PathUtil as PathUtil
import org.openqa.selenium.By as By
import org.openqa.selenium.WebElement as WebElement
import java.net.MalformedURLException as MalformedURLException
import java.net.URL as URL
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.interactions.Actions as Actions
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import org.openqa.selenium.JavascriptExecutor as JavascriptExecutor
import org.openqa.selenium.Keys as Keys

try {
    CustomKeywords.'com.application.DateTime.startTime'()

    WebUI.delay(30)

    'Click on Instructions '
    String addressCollaspe = WebUI.getAttribute(findTestObject('My Profile/Address/Address_Toggle'), 'aria-expanded')

    if (addressCollaspe == 'true') {
		print('........................Already Expand Address section')
		
    } else {
        WebUI.click(findTestObject('My Profile/Address/a_Address'))
		
		print('.........................   Successfully click on Expand button')
    }
    
    WebUI.delay(3)

    if (WebUI.verifyElementPresent(findTestObject('My Profile/Address/p_Edit'), 0)) {
		
        WebUI.click(findTestObject('My Profile/Address/p_Edit'))

        print('...................................PASS')

        GlobalVariable.vartestresult = 'PASS'

        GlobalVariable.varpassremarks = 'Address successfully updated '
    } else {
        print('...................................FAIL')

        GlobalVariable.vartestresult = 'FAIL'

        GlobalVariable.varfailremarks = 'Address successfully not updated.'
    }
    
    WebUI.click(findTestObject('My Profile/Address/dropdown_Country'))

    //WebUI.delay(20)
    WebUI.sendKeys(findTestObject('My Profile/Address/searchbox_Country'), 'United States')

    //WebUI.sendKeys(findTestObject('My Profile/Address/searchbox_Country'), Keys.chord(Keys.ARROW_DOWN))
    WebUI.sendKeys(findTestObject('My Profile/Address/searchbox_Country'), Keys.chord(Keys.ENTER))

    WebUI.delay(2)
	
    WebUI.click(findTestObject('My Profile/Address/searchbox_incareof'))
	
    WebUI.clearText(findTestObject('My Profile/Address/searchbox_incareof'))
	
    WebUI.delay(2)
	
    WebUI.sendKeys(findTestObject('My Profile/Address/searchbox_incareof'),'Google')
	
    WebUI.click(findTestObject('My Profile/Address/searchbox_address1'))

    WebUI.clearText(findTestObject('My Profile/Address/searchbox_address1'))

    WebUI.delay(2)

    WebUI.sendKeys(findTestObject('My Profile/Address/searchbox_address1'), '1138 Arron Smith Drive')

    String address1Text = WebUI.getAttribute(findTestObject('My Profile/Address/searchbox_address1'), 'value')

    print('........................' + address1Text + '..........')

    //WebUI.click(findTestObject('My Profile/Address/searchbox_address2'))
    //WebUI.clearText(findTestObject('My Profile/Address/searchbox_address2'))
    //WebUI.sendKeys(findTestObject('My Profile/Address/searchbox_address2'), 'Dattanagar')
    WebUI.click(findTestObject('My Profile/Address/searchbox_City'))

    WebUI.clearText(findTestObject('My Profile/Address/searchbox_City'))

    WebUI.delay(2)

    WebUI.sendKeys(findTestObject('My Profile/Address/searchbox_City'), 'Honolulu')

    WebUI.click(findTestObject('My Profile/Address/dropdown_State'))

    WebUI.sendKeys(findTestObject('My Profile/Address/searchbox_State'), 'Hawaii')

    WebUI.sendKeys(findTestObject('My Profile/Address/searchbox_State'), Keys.chord(Keys.ENTER))

    WebUI.click(findTestObject('My Profile/Address/searchbox_PostalCode'))

    WebUI.clearText(findTestObject('My Profile/Address/searchbox_PostalCode'))

    WebUI.delay(2)

    WebUI.sendKeys(findTestObject('My Profile/Address/searchbox_PostalCode'), '96819')

    WebUI.click(findTestObject('My Profile/Address/btn_SaveAddress'))

    WebUI.click(findTestObject('My Profile/Address/btn_Continue'))

    String addressText = WebUI.getText(findTestObject('My Profile/Address/a_AddressSuccessfullyUpdated'))
		
    if (addressText == ' Address successfully updated')
	 {
		print('................................ ADDRESS SUCCESSFULLY UPDATED ...........................' )
    }
	
	else {
		print('............................FAIL........................')
	}
	
    WebUI.delay(2)
	
	WebUI.click(findTestObject('My Profile/Address/btn_Close'))
	
	WebUI.delay(2)

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