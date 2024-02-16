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

    WebUI.click(findTestObject('My Home/Go To BaseCamp/dropdown_login'))
	
	WebUI.delay(5)
	
    WebUI.click(findTestObject('My Home/Go To BaseCamp/div_MyHome'))
	 
	WebUI.delay(10)

    WebUI.click(findTestObject('ClubCentral/Leadership-Home/h2_Club Central'))

    if (WebUI.verifyElementVisible(findTestObject('Object Repository/ClubCentral/Leadership-Home/div_clubName'), FailureHandling.OPTIONAL)) {
        //String ClubName = WebUI.getText(findTestObject('Object Repository/ClubCentral/Leadership-Home/div_clubName'))
        //print('........................................', +(ClubName))
        WebUI.click(findTestObject('Object Repository/ClubCentral/Leadership-Home/div_clubName'))
    } else {
    }
    
    CustomKeywords.'com.application.DPOSCustomKeyword.needSomeHelpCloseButton'()

    WebUI.click(findTestObject('Object Repository/ClubCentral/Leadership-Home/i_Club Success Plan_fa fa-close'))

    WebUI.click(findTestObject('Object Repository/ClubCentral/Add_Membership/No, Dual_Reinstated Member/div_Add Membership'))

    'Verify disable search button'
    String searchButton = WebUI.getAttribute(findTestObject('Object Repository/ClubCentral/Add_Membership/No, Dual_Reinstated Member/button_Search'), 
        'class')

    WebUI.verifyMatch(searchButton, 'btn btn-primary pull-right disabled', false)

    WebUI.setText(findTestObject('Object Repository/ClubCentral/Add_Membership/No, Dual_Reinstated Member/input__Search_LastName'), 
        GlobalVariable.TestData['LastNameM'])

    //LastNameM LastNameE
    WebUI.setText(findTestObject('Object Repository/ClubCentral/Add_Membership/No, Dual_Reinstated Member/input__Search_EmailORMemberID'), 
        GlobalVariable.TestData['MemberID'])

    //String EmailM = GlobalVariable.TestData['LastNameM']

    //String emailIdM = faker2.internet().safeEmailAddress(EmailM)

    //MemberID MemberEmailID
    WebUI.click(findTestObject('Object Repository/ClubCentral/Add_Membership/No, Dual_Reinstated Member/button_Search'))


    if (WebUI.verifyElementVisible(findTestObject('Object Repository/ClubCentral/Add_Membership/No, Dual_Reinstated Member/button_Confirm'))) {
        WebUI.delay(1)

        WebUI.click(findTestObject('Object Repository/ClubCentral/Add_Membership/No, Dual_Reinstated Member/button_Confirm'))

        GlobalVariable.vartestresult = 'PASS'

        GlobalVariable.varpassremarks = 'User not getting negative data result -with InvalidName & MemberEmailID.'
    } else {
        GlobalVariable.vartestresult = 'FAIL'

        GlobalVariable.varfailremarks = 'User is able to view the invalid result.'
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