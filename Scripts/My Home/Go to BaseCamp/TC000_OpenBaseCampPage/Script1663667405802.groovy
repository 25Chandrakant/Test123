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
	WebUI.delay(4)
    'Click on Go To Base Camp tile'
    WebUI.click(findTestObject('My Home/Go To BaseCamp/h2_GoToBaseCamp'))
	
	WebUI.delay(5)
    'Click on club'
//    if (WebUI.verifyElementVisible(findTestObject('My Home/Go To BaseCamp/div_ClubName'))) {
//		WebUI.delay(4)
        WebUI.click(findTestObject('My Home/Go To BaseCamp/div_ClubName'))
		//WebUI.waitForUrl('https://toastmasters-pilot.csod.com/LMS/catalog/Welcome.aspx?', 10);
//    } else { 
//    }
//	
	WebUI.delay(4)
//WebUI.waitForUrl('https://toastmasters-pilot.csod.com/LMS/catalog/Welcome.aspx?', 10);
    
    String currentUrl = WebUI.getUrl();

    if (currentUrl == "https://toastmasters-pilot.csod.com/LMS/catalog/Welcome.aspx?") {
        WebUI.back()

        //WebUI.back()
		WebUI.click(findTestObject('My Home/Go To BaseCamp/dropdown_login'))
		
		WebUI.delay(2)
		
		WebUI.click(findTestObject('My Home/Go To BaseCamp/div_Logout'))

 
        GlobalVariable.vartestresult = 'PASS'

        GlobalVariable.varpassremarks = ('Successfully open Go To Base Camp page:' + getUrl)
    } else {
 
        GlobalVariable.vartestresult = 'FAIL'

        GlobalVariable.varfailremarks = 'Not open Go To Base Camp page.'

        WebUI.back()

        WebUI.back()
    }
    
    CustomKeywords.'com.application.DPOSCustomKeyword.settestresult'(GlobalVariable.vartestresult, GlobalVariable.varpassremarks, 
        GlobalVariable.varfailremarks)

    CustomKeywords.'com.application.DateTime.endTime'()

    CustomKeywords.'com.application.DateTime.totalTime'()
//}else {
//	    }
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