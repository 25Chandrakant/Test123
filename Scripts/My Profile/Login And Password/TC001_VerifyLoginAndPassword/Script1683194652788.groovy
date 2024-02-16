
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import javax.media.PackageManager as PackageManager
import javax.naming.Context as Context
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
import com.kms.katalon.core.util.internal.PathUtil as PathUtil
import org.openqa.selenium.By as By
import org.openqa.selenium.WebElement as WebElement
import java.net.MalformedURLException as MalformedURLException
import java.net.URL as URL
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.interactions.Actions as Actions
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import org.openqa.selenium.JavascriptExecutor as JavascriptExecutor

try {
    CustomKeywords.'com.application.DateTime.startTime'()

    CustomKeywords.'com.application.DPOSCustomKeyword.needSomeHelpCloseButton'()

    WebUI.delay(3)

    'Click on Instructions '
    String addressCollaspe = WebUI.getAttribute(findTestObject('My Profile/Login And Password/LoginAndPassword_Toggle'),'aria-expanded')
	
	if (addressCollaspe == 'true') {
		print('........................Already Expand Login And Password  section')
		
	} else {
		WebUI.click(findTestObject('My Profile/Login And Password/a_LoginAndPassword'))
		
		print('.........................   Successfully click on Expand button')
	}
	
	WebUI.delay(3)

    WebUI.click(findTestObject('My Profile/Login And Password/p-Edit'))
	
	WebUI.delay(20)

    if (WebUI.verifyElementPresent(findTestObject('My Profile/Login And Password/h5_Primary Email'), 0)) {
        String email = WebUI.getAttribute(findTestObject('My Profile/Login And Password/textBox_PrimaryEmail'), 
            'value')

        print('................................................' + email)

        print('...................................PASS')

        GlobalVariable.vartestresult = 'PASS'

        GlobalVariable.varpassremarks = 'Password is changed and login successfully. '
    } else {
        print('...................................FAIL')

        GlobalVariable.vartestresult = 'FAIL'

        GlobalVariable.varfailremarks = 'Application not open successfully.'
    }
    
    String email1 = WebUI.getAttribute(findTestObject('My Profile/LoginAndPassword/textBox_PrimaryEmail'), 
        'value')

    if (email1 == 'lorriandersen@gmail.com') {
        print('...........Successfully Matched.........')
    } else {
        print('.........................Failed.....................')
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