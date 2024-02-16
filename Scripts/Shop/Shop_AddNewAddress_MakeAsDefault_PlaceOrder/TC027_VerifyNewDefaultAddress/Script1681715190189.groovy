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
	
	WebUI.mouseOver(findTestObject('Object Repository/Login/a_welcome'))
	
	WebUI.delay(2)
	
	WebUI.mouseOver(findTestObject('Object Repository/Login/textlink_ClickOnMyProfile'))
	
	WebUI.click(findTestObject('Object Repository/Login/textlink_ClickOnMyProfile'))
	
	WebUI.delay(2)
	
	WebUI.click(findTestObject('Object Repository/Shop/Shop_DefaultAddress/btn_EditAddressMyProfile'))
	
	WebUI.delay(2)
	
	String CountryName = WebUI.getText(findTestObject('Object Repository/Shop/Shop_DefaultAddress/textbox_MailingAddressCountryMyProfile'))
	
	WebUI.delay(2)
	
	WebUI.click(findTestObject('Object Repository/Shop/Shop_DefaultAddress/textbox_MailingPostalCodeMyProfile'))
	
	WebUI.delay(2)
	
	String PostalCode = WebUI.getText(findTestObject('Object Repository/Shop/Shop_DefaultAddress/textbox_MailingPostalCodeMyProfile'))
	
	WebUI.delay(2)
	
    if (GlobalVariable.AddCountry == CountryName && GlobalVariable.AddZipCode == PostalCode) 
	{
        GlobalVariable.vartestresult = 'PASS'

        GlobalVariable.varpassremarks = 'Address was successfully set as default address for shipping'

    } 
	else 
	{
        GlobalVariable.vartestresult = 'FAIL'

        GlobalVariable.varfailremarks = 'Address failed to be set as default shipping address'

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