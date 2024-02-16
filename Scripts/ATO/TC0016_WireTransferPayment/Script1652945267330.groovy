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
import jdk.nashorn.internal.objects.Global as Global
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil
import org.openqa.selenium.Keys as Keys
import org.openqa.selenium.By as By
import org.openqa.selenium.WebElement as WebElement
import java.net.URL as URL

try {
    CustomKeywords.'com.application.DateTime.startTime'()

    Thread.sleep(1000)

    'Coordinator Information '
    CustomKeywords.'com.application.DPOSCustomKeyword.needSomeHelpCloseButton'()

    WebUI.click(findTestObject('Object Repository/ATO/button_Continue'))

    'Charter Agreement'
    CustomKeywords.'com.application.DPOSCustomKeyword.needSomeHelpCloseButton'()

    String countryname = GlobalVariable.TestData['CountryName']

    String city = GlobalVariable.TestData['City']

    String states = GlobalVariable.TestData['States']

    String postalcode = GlobalVariable.TestData['PostalCode']

    //Thread.sleep(2000)
    WebUI.selectOptionByLabel(findTestObject('Object Repository/ATO/Page_Toastmasters International -Chartering Application/select_SelectCountry'), 
        countryname, false)

    GlobalVariable.countryCH = countryname

    WebUI.setText(findTestObject('Object Repository/ATO/Page_Toastmasters International -Chartering Application/input_City'), 
        city)

    GlobalVariable.cityCH = city

    WebUI.waitForElementVisible(findTestObject('Object Repository/ATO/Page_Toastmasters International -Chartering Application/select_SelectStates'), 
        10)

    WebUI.selectOptionByLabel(findTestObject('Object Repository/ATO/Page_Toastmasters International -Chartering Application/select_SelectStates'), 
        states, false)

    GlobalVariable.statesCH = states

    WebUI.setText(findTestObject('Object Repository/ATO/Page_Toastmasters International -Chartering Application/input_ZIP'), 
        postalcode)

    GlobalVariable.PostalCode = postalcode

    WebUI.selectOptionByLabel(findTestObject('Object Repository/ATO/Page_Toastmasters International -Chartering Application/select_SelectClubType'), 
        'College', false)

    String clubtype = WebUI.getText(findTestObject('Object Repository/ATO/Page_Toastmasters International -Chartering Application/select_SelectClubType'))

    GlobalVariable.clubtypeCH = clubtype

    WebUI.selectOptionByLabel(findTestObject('Object Repository/ATO/Page_Toastmasters International -Chartering Application/select_SelectLanguage'), 
        'English', false)

    String language = WebUI.getText(findTestObject('Object Repository/ATO/Page_Toastmasters International -Chartering Application/select_SelectLanguage'))

    GlobalVariable.languageCH = language

    WebUI.click(findTestObject('Object Repository/ATO/button_Save and Continue'))

    Thread.sleep(1000)

    'Sponsor and Mentor Information'
    CustomKeywords.'com.application.DPOSCustomKeyword.needSomeHelpCloseButton'()

    WebUI.click(findTestObject('Object Repository/ATO/button_Save and Continue'))

    'Shipping Address'
    CustomKeywords.'com.application.DPOSCustomKeyword.needSomeHelpCloseButton'()

    WebUI.click(findTestObject('Object Repository/ATO/Payment/button_Validate Address'))

    Thread.sleep(1000)

    WebUI.click(findTestObject('Object Repository/ATO/Payment/a_ConfirmAddress'))

    'Click wire transfer button'
    WebUI.click(findTestObject('Object Repository/ATO/Wire_Transfer_Payment/a_Wire Transfer or Pay Later'))

    WebUI.click(findTestObject('Object Repository/ATO/Wire_Transfer_Payment/a_Download Wire Transfer Instructions'))

    Thread.sleep(2000)

    WebUI.switchToWindowIndex(0)

    WebUI.click(findTestObject('Object Repository/ATO/Wire_Transfer_Payment/a_CountinueWithOutPayment'))

    if (WebUI.waitForElementVisible(findTestObject('Object Repository/ATO/Wire_Transfer_Payment/text_paymentDueDate'), 150)) {
        String payLaterTotal = WebUI.getText(findTestObject('Object Repository/ATO/VerifyClubDetails/Payment/div_Order Total'))

        GlobalVariable.PayLaterTotal = payLaterTotal

        GlobalVariable.vartestresult = 'PASS'

        GlobalVariable.varpassremarks = 'Successfully work pay later mehthod.'
    } else {
        GlobalVariable.vartestresult = 'FAIL'

        GlobalVariable.varfailremarks = 'Display error message and not work pay later method.'
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