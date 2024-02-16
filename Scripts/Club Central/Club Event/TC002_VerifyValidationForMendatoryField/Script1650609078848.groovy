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

    WebUI.click( findTestObject('Object Repository/ClubCentral/Club_Event/input_Open House_Event') )

	WebUI.click( findTestObject('Object Repository/ClubCentral/Club_Event/input_Online_EventType')  )
	
	WebUI.click( findTestObject('Object Repository/ClubCentral/Club_Event/input__Coordinator')  )
	
	WebUI.click(findTestObject('Object Repository/ClubCentral/Club_Event/div_BoxEvent') )
	
	String validationVerify =  WebUI.getAttribute( findTestObject('Object Repository/ClubCentral/Club_Event/textbox_Validation') , 'class')
	
	if ( WebUI.verifyMatch(validationVerify, 'form-group has-error has-danger', false) ) {
 
		GlobalVariable.vartestresult = 'PASS'

		GlobalVariable.varpassremarks = 'User successfully see there highlight mendatory field .'
	} else {

		GlobalVariable.vartestresult = 'FAIL'

		GlobalVariable.varfailremarks = 'User not see any validation field.'
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