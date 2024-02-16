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
import org.apache.http.auth.UsernamePasswordCredentials as UsernamePasswordCredentials
import org.openqa.selenium.By as By
import org.openqa.selenium.WebElement as WebElement
import java.net.URL as URL

try {
    CustomKeywords.'com.application.DateTime.startTime'()

    'Click on Personal Details tile'
    WebUI.click(findTestObject('My Profile/tile_PersonalDetails'))

    WebUI.delay(3)

    /* 'Click On Edit button for Personal Detail'
    if (WebUI.verifyElementPresent(findTestObject('My Profile/button_Edit_PersonalDetails'),2)) {
        WebUI.click(findTestObject('My Profile/button_Edit_PersonalDetails'))
    } else {
    }*/
    'Get first name value'
    String userFirstName = WebUI.getAttribute(findTestObject('My Profile/Value_FirstName'), 'value')

    printf('.........................................................', userFirstName)

    'Get last LastName value'
    String userLastName = WebUI.getAttribute(findTestObject('My Profile/Value_LastName'), 'value')

    printf('.........................................................', userLastName)

    'Click on Delete account tile'
    WebUI.click(findTestObject('My Profile/tile_delete'))

    'Click on Delete Account link'
    WebUI.click(findTestObject('My Profile/a_DeleteAccount'))

    'Enter name into text box'
    WebUI.sendKeys(findTestObject('My Profile/input_Delete_TextBox'), userFirstName + userLastName)

    'Verify Delete My Account button is Disabled'
    String buttonDisabled = WebUI.getAttribute(findTestObject('My Profile/button_DeleteMyAccount'), 'class')

    WebUI.verifyMatch(buttonDisabled, 'btn btn-alternate disabled', false)

    'tick on Check box'
    WebUI.click(findTestObject('My Profile/checkBox_Delete'))

    'Verify element visible'
    if (WebUI.verifyElementPresent(findTestObject('My Profile/button_Please Keep My Account'), 2)) {
        printf('.........................................................PASS')

        GlobalVariable.vartestresult = 'PASS'

        GlobalVariable.varpassremarks = 'Successfully display Please keep my account button.'
    } else {
        printf('.........................................................PASS')

        GlobalVariable.vartestresult = 'FAIL'

        GlobalVariable.varfailremarks = ' Not display Please keep my account button.'
    }
    
    'Verify Delete my Account is disble'

    'Click on Delete My Account button'
    WebUI.click(findTestObject('My Profile/button_DeleteMyAccount'))

    if (WebUI.click(findTestObject('My Profile/h1_DeleteAccount'))) {
        GlobalVariable.vartestresult = 'PASS'

        GlobalVariable.varpassremarks = 'User successfully delete user account.'
    } else {
        GlobalVariable.vartestresult = 'FAIL'

        GlobalVariable.varfailremarks = 'User not able to delete user account.'

        WebUI.back()
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