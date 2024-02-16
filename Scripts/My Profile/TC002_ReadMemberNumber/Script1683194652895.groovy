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
import org.junit.After as After
import org.openqa.selenium.By as By
import org.openqa.selenium.WebElement as WebElement
import java.net.URL as URL
import java.util.stream.Stream as Stream

try {
    CustomKeywords.'com.application.DateTime.startTime'()

    //Thread.sleep(2000)
    WebUI.mouseOver(findTestObject('My Profile/a_mouseHoverWelcome'))

    WebUI.click(findTestObject('My Profile/a_Profile'))

    WebUI.click(findTestObject('My Profile/button_personalEdit'))

    String attributLastName = WebUI.getAttribute(findTestObject('My Profile/input_LastName'), 'value')

	GlobalVariable.MemberLastName = attributLastName
    print(GlobalVariable.MemberLastName)

    String attributPrimaryEmailID = WebUI.getAttribute(findTestObject('My Profile/input_PrimaryEmailID'), 
        'value')

	GlobalVariable.MemberPrimaryEmailID = attributPrimaryEmailID
    print(GlobalVariable.MemberPrimaryEmailID)

    String MemberID = WebUI.getText(findTestObject('My Profile/div_MemberNumber'))

    println(MemberID)

    GlobalVariable.subMemberID = MemberID.substring(15, 26)

    println(GlobalVariable.subMemberID)

    Thread.sleep(1000)
	
	
	if (findTestObject('My Profile/symbole_ProfileSetting') ) {
		print('PASS...............................')

		GlobalVariable.vartestresult = 'PASS'

		GlobalVariable.varpassremarks = 'User Successfully read member data.'
	} else {
		print('FAIL...............................')

		GlobalVariable.vartestresult = 'FAIL'

		GlobalVariable.varfailremarks = 'User can not read member data.'
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