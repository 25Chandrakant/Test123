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
import com.kms.katalon.entity.global.GlobalVariableEntity as GlobalVariableEntity
import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil
import org.openqa.selenium.Keys as Keys
import org.openqa.selenium.By as By
import org.openqa.selenium.WebElement as WebElement
import java.net.URL as URL

try {
    CustomKeywords.'com.application.DateTime.startTime'()

    CustomKeywords.'com.application.DPOSCustomKeyword.needSomeHelpCloseButton'()
 
    WebUI.delay(2)
 
    WebUI.click(findTestObject('Object Repository/SelfPay/Common Functionality/tile_ClubCentralClick'))

    WebUI.delay(2)
 
    WebUI.click(findTestObject('Object Repository/SelfPay/Common Functionality/popup_CloseSelfPaySettingsPopup'))

    WebUI.delay(2)
 
    WebUI.click(findTestObject('Object Repository/SelfPay/Common Functionality/tile_MembershipManagementClick'))

    WebUI.delay(2)

    CustomKeywords.'com.application.DPOSCustomKeyword.needSomeHelpCloseButton'()

    WebUI.delay(2)
 
    WebUI.click(findTestObject('Object Repository/SelfPay/Add Membership/button_AddNewMembers'))

    WebUI.delay(5)

    CustomKeywords.'com.application.DPOSCustomKeyword.needSomeHelpCloseButton'()

    WebUI.delay(5)
 
    ' Enter ValidName  And  ValidMemberID'

    WebUI.click(findTestObject('Object Repository/SelfPay/Add Membership/No,Dual_ReinstateMember/input__Search_LastName'))

    WebUI.delay(2)

    WebUI.setText(findTestObject('Object Repository/SelfPay/Add Membership/No,Dual_ReinstateMember/input__Search_LastName'), 
		GlobalVariable.TestData['LastNameV'])

    WebUI.delay(2)

    WebUI.click(findTestObject('Object Repository/SelfPay/Add Membership/No,Dual_ReinstateMember/input__Search_EmailORMemberID'))

    WebUI.delay(2)
 
    WebUI.setText(findTestObject('Object Repository/SelfPay/Add Membership/No,Dual_ReinstateMember/input__Search_EmailORMemberID'), 
        GlobalVariable.TestData['MemberIdV'])

    WebUI.delay(2)
 
    WebUI.click(findTestObject('Object Repository/SelfPay/button_Search'))

    WebUI.delay(2)

   // String validationMessage = WebUI.getText(findTestObject('Object Repository/ClubCentral/Add_Membership/No, Dual_Reinstated Member/div_validation_The member was not found'))
 
   if (WebUI.verifyElementVisible(findTestObject('Object Repository/SelfPay/Add Membership/No,Dual_ReinstateMember/div_MemberRenewalUnavailable'))) {

       WebUI.delay(2)

       WebUI.click(findTestObject('Object Repository/SelfPay/Add Membership/No,Dual_ReinstateMember/a_Cancel'))

        GlobalVariable.vartestresult = 'PASS'
 
        GlobalVariable.varpassremarks = 'User has paid for both the periods.'
    } else {
        GlobalVariable.vartestresult = 'FAIL'
 
        GlobalVariable.varfailremarks = 'User has not paid for both periods.'
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


