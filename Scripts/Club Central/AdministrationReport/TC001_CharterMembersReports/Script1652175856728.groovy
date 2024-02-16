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
import org.openqa.selenium.By as By
import org.openqa.selenium.WebElement as WebElement
import java.net.URL as URL

try {
    CustomKeywords.'com.application.DateTime.startTime'()
	
	CustomKeywords.'com.application.DPOSCustomKeyword.needSomeHelpCloseButton'()
	
     WebUI.selectOptionByLabel( findTestObject('Object Repository/ClubCentral/Administrative Reports/select_Select Report') , "Charter Members", false)
	 
	 WebUI.delay(3)
	 String dropdown = WebUI.getText( findTestObject('ClubCentral/Administrative Reports/CharterMembers/td_MemberID')) 
	 
	 WebUI.sendKeys( findTestObject('ClubCentral/Administrative Reports/CharterMembers/input_Search') , dropdown )
	 WebUI.delay(3)
	 WebUI.sendKeys( findTestObject('ClubCentral/Administrative Reports/CharterMembers/input_Search') , "523" )
	 
	 WebUI.clearText( findTestObject('ClubCentral/Administrative Reports/CharterMembers/input_Search')   )
	 
	 WebUI.sendKeys( findTestObject('ClubCentral/Administrative Reports/CharterMembers/input_Search'), Keys.chord(Keys.ENTER))
	 
	 WebUI.click( findTestObject('ClubCentral/Administrative Reports/CharterMembers/a_Excel')  )
	 
	 WebUI.click(findTestObject('ClubCentral/Administrative Reports/CharterMembers/th_Member ID')  )
	 
	 String  attribute = WebUI.getAttribute( findTestObject('ClubCentral/Administrative Reports/CharterMembers/th_Member ID'),  'class')
	 
	
	
	 
    if ( WebUI.verifyMatch(attribute, 'sorting_desc', false) ) {
        GlobalVariable.vartestresult = 'PASS'

        GlobalVariable.varpassremarks = 'Successfully working all functionality of charter member'
    } else {
        GlobalVariable.vartestresult = 'FAIL'

        GlobalVariable.varfailremarks = 'functionality not working.'

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