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
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.github.javafaker.Faker as Faker

try {
    Faker faker2 = new Faker()

    CustomKeywords.'com.application.DateTime.startTime'()

    CustomKeywords.'com.application.DPOSCustomKeyword.needSomeHelpCloseButton'()

    WebUI.setText(findTestObject('Object Repository/ClubCentral/Add_Membership/No, Dual_Reinstated Member/input__Search_LastName'), 
        GlobalVariable.TestData['LastNameM'])

    //LastNameM LastNameE
    WebUI.setText(findTestObject('Object Repository/ClubCentral/Add_Membership/No, Dual_Reinstated Member/input__Search_EmailORMemberID'), 
        GlobalVariable.TestData['MemberID'])

    String EmailM = GlobalVariable.TestData['LastNameM']

    String emailIdM = faker2.internet().safeEmailAddress(EmailM)

    //MemberID MemberEmailID
    WebUI.click(findTestObject('Object Repository/ClubCentral/Add_Membership/No, Dual_Reinstated Member/button_Search'))


    if (WebUI.verifyElementVisible(findTestObject('Object Repository/ClubCentral/Add_Membership/No, Dual_Reinstated Member/button_Confirm'))) {
        WebUI.delay(1)

        WebUI.click(findTestObject('Object Repository/ClubCentral/Add_Membership/No, Dual_Reinstated Member/button_Confirm'))

       
        GlobalVariable.vartestresult = 'PASS'

        GlobalVariable.varpassremarks = 'User successfully get valid member  .'
    } else {
        GlobalVariable.vartestresult = 'FAIL'

        GlobalVariable.varfailremarks = 'User can not get valid member.'
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