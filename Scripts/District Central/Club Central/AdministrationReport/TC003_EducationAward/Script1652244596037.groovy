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
 
	
     WebUI.selectOptionByLabel( findTestObject('Object Repository/ClubCentral/Administrative Reports/select_Select Report') , "Past and Present Education Awards", false)
	  
	 'Download Excel file'
	
	  WebUI.click(  findTestObject('Object Repository/ClubCentral/Administrative Reports/Education Award/a_Excel')  )
	 
	 WebUI.delay(3)
	 String educationMemberID = WebUI.getText(  findTestObject('Object Repository/ClubCentral/Administrative Reports/Education Award/td_MembeID')   )
	 
	 WebUI.sendKeys(  findTestObject('Object Repository/ClubCentral/Administrative Reports/Education Award/input_Search_form-control input-sm')  , educationMemberID)
	  
	 WebUI.sendKeys( findTestObject('Object Repository/ClubCentral/Administrative Reports/Education Award/input_Search_form-control input-sm')  , "523")
	 WebUI.delay(3)
	 
	 WebUI.clearText(  findTestObject('Object Repository/ClubCentral/Administrative Reports/Education Award/input_Search_form-control input-sm')  )
	 
	 WebUI.sendKeys( findTestObject('Object Repository/ClubCentral/Administrative Reports/Education Award/input_Search_form-control input-sm') , Keys.chord(Keys.ENTER))
	 
	 
     WebUI.click( findTestObject('Object Repository/ClubCentral/Administrative Reports/Education Award/th_Member ID') )
	 
	 String educationaward = WebUI.getAttribute( findTestObject('Object Repository/ClubCentral/Administrative Reports/Education Award/th_Member ID') , "aria-sort" )
	 if (  WebUI.verifyMatch(educationaward, 'descending', false)) {
        GlobalVariable.vartestresult = 'PASS'

        GlobalVariable.varpassremarks = 'Successfully working all functionality of Past and Present Education Awards'
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