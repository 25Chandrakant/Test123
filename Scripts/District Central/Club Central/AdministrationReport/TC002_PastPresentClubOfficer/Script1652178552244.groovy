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
 
	
     WebUI.selectOptionByLabel( findTestObject('Object Repository/ClubCentral/Administrative Reports/select_Select Report') , "Past and Present Club Officers", false)
	 
	 WebUI.sendKeys( findTestObject('Object Repository/ClubCentral/Administrative Reports/Past_PresentClubOfficers/input_Term Start_TermStart') , "05/30/2021")
	
	 WebUI.sendKeys(  findTestObject('Object Repository/ClubCentral/Administrative Reports/Past_PresentClubOfficers/input_Term End_TermEnd') , "05/25/2022")
	 
	 WebUI.click( findTestObject('Object Repository/ClubCentral/Administrative Reports/Past_PresentClubOfficers/button_Submit')   )
	 
	 'DownLoad Excel File'
	 
	 WebUI.click(findTestObject('Object Repository/ClubCentral/Administrative Reports/Education Award/a_Excel')  )
	 
	 WebUI.delay(3)
	 String tdText = WebUI.getText(findTestObject('Object Repository/ClubCentral/Administrative Reports/Past_PresentClubOfficers/td_memberID')  )
	 
	 WebUI.sendKeys(  findTestObject('Object Repository/ClubCentral/Administrative Reports/Past_PresentClubOfficers/input_Search_form-control input-sm') , tdText)
	  
	 WebUI.sendKeys( findTestObject('Object Repository/ClubCentral/Administrative Reports/Past_PresentClubOfficers/input_Search_form-control input-sm') , "523")
	 WebUI.delay(3)
	 
	 WebUI.clearText( findTestObject('Object Repository/ClubCentral/Administrative Reports/Past_PresentClubOfficers/input_Search_form-control input-sm')  )
	 
	 WebUI.sendKeys( findTestObject('ClubCentral/Administrative Reports/CharterMembers/input_Search'), Keys.chord(Keys.ENTER))
	 
	 
	 WebUI.click( findTestObject('Object Repository/ClubCentral/Administrative Reports/Past_PresentClubOfficers/th_MemberID')  )
    
	 String Pastresent = WebUI.getAttribute( findTestObject('Object Repository/ClubCentral/Administrative Reports/Past_PresentClubOfficers/th_MemberID') , "aria-sort" )
	 if (  WebUI.verifyMatch(Pastresent, 'descending', false)) {
        GlobalVariable.vartestresult = 'PASS'

        GlobalVariable.varpassremarks = 'Successfully working all functionality of Past and Present Club Officers'
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