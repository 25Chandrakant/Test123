
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

    //CustomKeywords.'com.application.DPOSCustomKeyword.needSomeHelpCloseButton'()

    WebUI.delay(5)

    'Click on Instructions '
    String addressCollaspe = WebUI.getAttribute(findTestObject('My Profile/Address/Address_Toggle'), 'aria-expanded')

    if (addressCollaspe == 'true') {
		print('........................Already Expand Address section')
		
    } else {
        WebUI.click(findTestObject('My Profile/Address/a_Address'))
		
		print('.........................   Successfully click on Expand button')
    }
    
    WebUI.delay(3)
		
        WebUI.click(findTestObject('My Profile/Address/p_Edit'))
		
		WebUI.delay(2)
		
		WebUI.click(findTestObject('Object Repository/My Profile/Address/dropdown_Country'))
		
		WebUI.delay(2)
		
		WebUI.sendKeys(findTestObject('Object Repository/My Profile/Address/dropdown_Country'), GlobalVariable.TestData['CountryName'])
		
		WebUI.delay(2)
		
		WebUI.sendKeys(findTestObject('Object Repository/My Profile/Address/dropdown_Country'), Keys.chord(Keys.ENTER))
		
		WebUI.delay(2)
		
		WebUI.click(findTestObject('Object Repository/My Profile/Address/searchbox_address1'))
		
		WebUI.delay(2)
		
		WebUI.clearText(findTestObject('Object Repository/My Profile/Address/searchbox_address1'))
		
		WebUI.delay(2)
		
		WebUI.sendKeys(findTestObject('Object Repository/My Profile/Address/searchbox_address1'), GlobalVariable.TestData['AddressUpdate'])
		
		WebUI.delay(2)
		
		WebUI.sendKeys(findTestObject('Object Repository/My Profile/Address/searchbox_address1'), Keys.chord(Keys.ENTER))
		
		WebUI.delay(2)
		
		WebUI.scrollToPosition(66666, 66666)
		
		WebUI.delay(2)
		
		WebUI.verifyElementVisible(findTestObject('Object Repository/My Profile/Address/h5_City'))
		
		WebUI.delay(2)
		
		WebUI.click(findTestObject('Object Repository/My Profile/Address/searchbox_City'))
		
		WebUI.delay(2)
		
		WebUI.clearText(findTestObject('Object Repository/My Profile/Address/searchbox_City'))
		
		WebUI.delay(2)
		
		WebUI.sendKeys(findTestObject('Object Repository/My Profile/Address/searchbox_City'), GlobalVariable.TestData['CityUpdate'])
		
		WebUI.delay(2)
		
		WebUI.sendKeys(findTestObject('Object Repository/My Profile/Address/searchbox_City'), Keys.chord(Keys.ENTER))
		
		WebUI.delay(2)
		
		WebUI.click(findTestObject('Object Repository/My Profile/Address/searchbox_PostalCode'))
		
		WebUI.delay(2)
		
		WebUI.clearText(findTestObject('Object Repository/My Profile/Address/searchbox_PostalCode'))
		
		WebUI.delay(2)
		
		WebUI.sendKeys(findTestObject('Object Repository/My Profile/Address/searchbox_PostalCode'), GlobalVariable.TestData['PostalCodeUpdate'])
		
		WebUI.delay(2)
		
		WebUI.click(findTestObject('Object Repository/My Profile/Address/btn_SaveAddress'))
		
		WebUI.delay(5)
		
		WebUI.click(findTestObject('Object Repository/My Profile/button_Continue'))
		
		WebUI.delay(2)
		
    if (WebUI.verifyElementVisible(findTestObject('Object Repository/My Profile/Address/div_AddressSuccessMesage')))
	 {
		 
		 WebUI.delay(2)
		 
		 WebUI.click(findTestObject('Object Repository/My Profile/Address/btn_Close'))
		 
		 WebUI.delay(5)
		 
		print('................................ ADDRESS SUCCESSFULLY UPDATED ...........................' )
    }
	
	else {
		print('........................... Address not updated ........................')
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