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

try {
    CustomKeywords.'com.application.DateTime.startTime'()

    CustomKeywords.'com.application.DPOSCustomKeyword.needSomeHelpCloseButton'()

    WebUI.delay(3)

    WebUI.delay(3)

    WebUI.click(findTestObject('Object Repository/ClubCentral/Club_Roster/button_Edit'))

    WebUI.click(findTestObject('Object Repository/ClubCentral/Club_Roster/MemberInformation_Popup/dropdown_Country'))

    WebUI.sendKeys(findTestObject('Object Repository/ClubCentral/Club_Roster/MemberInformation_Popup/Search_Country'), GlobalVariable.TestData["CountryName"])

    WebUI.sendKeys(findTestObject('Object Repository/ClubCentral/Club_Roster/MemberInformation_Popup/Search_Country'), Keys.chord(Keys.ENTER))

    WebUI.clearText(findTestObject('Object Repository/ClubCentral/Club_Roster/MemberInformation_Popup/input__Address1'))
    WebUI.sendKeys(findTestObject('Object Repository/ClubCentral/Club_Roster/MemberInformation_Popup/input__Address1'), 
      GlobalVariable.TestData['Address'])
	
    WebUI.clearText(findTestObject('Object Repository/ClubCentral/Club_Roster/MemberInformation_Popup/input__City'))
    WebUI.sendKeys(findTestObject('Object Repository/ClubCentral/Club_Roster/MemberInformation_Popup/input__City'), GlobalVariable.TestData[
         'City'])
	
	WebUI.delay(2)
	
	WebUI.mouseOver(  findTestObject('Object Repository/ClubCentral/Club_Roster/MemberInformation_Popup/dropdown__city') )
    WebUI.click(findTestObject('Object Repository/ClubCentral/Club_Roster/MemberInformation_Popup/dropdown__city'))

    WebUI.sendKeys(findTestObject('Object Repository/ClubCentral/Club_Roster/MemberInformation_Popup/Search_States'), GlobalVariable.TestData["States"])
	WebUI.sendKeys(findTestObject('Object Repository/ClubCentral/Club_Roster/MemberInformation_Popup/Search_States'),Keys.chord(Keys.ENTER) )
 
    WebUI.clearText(findTestObject('Object Repository/ClubCentral/Club_Roster/MemberInformation_Popup/input__PostalCode'))

    WebUI.sendKeys(findTestObject('Object Repository/ClubCentral/Club_Roster/MemberInformation_Popup/input__PostalCode'), GlobalVariable.TestData['PostalCode'])
       

    'Select Country Phone Code'
    WebUI.click(findTestObject('Object Repository/ClubCentral/Club_Roster/MemberInformation_Popup/div_Home Phone_iti-arrow'))
    WebUI.click(findTestObject('Object Repository/ClubCentral/Club_Roster/MemberInformation_Popup/li__United States1'))

    WebUI.clearText(findTestObject('Object Repository/ClubCentral/Club_Roster/MemberInformation_Popup/input_HomePhone'))
    WebUI.sendKeys(findTestObject('Object Repository/ClubCentral/Club_Roster/MemberInformation_Popup/input_HomePhone'), 
      GlobalVariable.TestData['HomePhone'])
        
	WebUI.scrollToPosition(99999, 99999)
	
    if (WebUI.verifyElementVisible(findTestObject('Object Repository/ClubCentral/Club_Roster/MemberInformation_Popup/a_Add Another Phone Number')   )) {
    WebUI.click(findTestObject('Object Repository/ClubCentral/Club_Roster/MemberInformation_Popup/a_Add Another Phone Number')  )
	WebUI.click( findTestObject('Object Repository/ClubCentral/Club_Roster/MemberInformation_Popup/div_Mobile Phone_iti-arrow')  )
	WebUI.click(findTestObject('Object Repository/ClubCentral/Club_Roster/MemberInformation_Popup/li__United States1')  )
	WebUI.click( findTestObject('Object Repository/ClubCentral/Club_Roster/MemberInformation_Popup/input_MobilePhone') )
	WebUI.clearText(findTestObject('Object Repository/ClubCentral/Club_Roster/MemberInformation_Popup/input_MobilePhone'))
 	WebUI.sendKeys(findTestObject('Object Repository/ClubCentral/Club_Roster/MemberInformation_Popup/input_MobilePhone'), GlobalVariable.TestData["MobilePhone"])

    }
    
	//if() {
		
		
	//}
     
    if(WebUI.verifyElementVisible( findTestObject('Object Repository/ClubCentral/Club_Roster/MemberInformation_Popup/a_Add another email address') )) {
      WebUI.click(findTestObject('Object Repository/ClubCentral/Club_Roster/MemberInformation_Popup/a_Add another email address'))
    }
	 
	WebUI.clearText (findTestObject('Object Repository/ClubCentral/Club_Roster/MemberInformation_Popup/input__SecondaryEmail') )
	WebUI.sendKeys(findTestObject('Object Repository/ClubCentral/Club_Roster/MemberInformation_Popup/input__SecondaryEmail'), 
      GlobalVariable.TestData['SecondaryEmail'])
    
    WebUI.click(findTestObject('Object Repository/ClubCentral/Club_Roster/MemberInformation_Popup/button_Save'))
    String tx = WebUI.getText(findTestObject('Object Repository/ClubCentral/Club_Roster/text_address'))

    if (tx.contains(GlobalVariable.TestData['Address'])) {
        GlobalVariable.vartestresult = 'PASS'

        GlobalVariable.varpassremarks = 'User Successfully save new address.'
    } else {
        GlobalVariable.vartestresult = 'FAIL'

        GlobalVariable.varfailremarks = 'User can not save new address.'
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