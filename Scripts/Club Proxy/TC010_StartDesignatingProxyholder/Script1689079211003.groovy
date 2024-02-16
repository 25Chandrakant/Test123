import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.configuration.RunConfiguration as RunConfiguration
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.util.internal.PathUtil as PathUtil
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil
import org.openqa.selenium.Keys as Keys
import org.openqa.selenium.By as By
import org.openqa.selenium.WebElement as WebElement
import java.net.MalformedURLException as MalformedURLException
import java.net.URL as URL
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.interactions.Actions as Actions
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import org.openqa.selenium.JavascriptExecutor as JavascriptExecutor
import org.openqa.selenium.support.ui.Select as Select

try {
    CustomKeywords.'com.application.DateTime.startTime'()

    'Designate ProxyHolder'
    if (WebUI.verifyElementVisible(findTestObject('Object Repository/ClubProxy/a_StartBtn'))) {
		
        WebUI.delay(2)

        WebUI.click(findTestObject('Object Repository/ClubProxy/a_StartBtn'))

        WebUI.delay(2)
		
    } else {
  
    }
    
	'Click on Member of Club '
    WebUI.delay(2)
	
    WebUI.click(findTestObject('Object Repository/ClubProxy/div_MemberOfClub'))

    WebUI.delay(2)

    WebUI.click(findTestObject('Object Repository/ClubProxy/a_ContinueMemOfClub'))

    WebUI.delay(2)

    WebUI.click(findTestObject('Object Repository/ClubProxy/select_ClubMemDrpDwn'))

    WebUI.delay(2)
	
	WebUI.selectOptionByIndex(findTestObject('Object Repository/ClubProxy/select_ClubMemDrpDwn'), 3)
	
	WebUI.delay(2)

    WebUI.click(findTestObject('Object Repository/ClubProxy/a_ContinueBtnForDesPro'))

    WebUI.delay(2)

    WebUI.click(findTestObject('Object Repository/ClubProxy/textBox_Signature'))

    WebUI.clearText(findTestObject('Object Repository/ClubProxy/textBox_Signature'))

    //Thread.sleep(1000)
    //WebUI.click(findTestObject('Object Repository/ClubProxy/textBox_Signature'))
    // Thread.sleep(1000)
    WebUI.delay(2)

    WebUI.sendKeys(findTestObject('Object Repository/ClubProxy/textBox_Signature'), 'A')//GlobalVariable.TestData['Signature'])
       

    WebUI.delay(5)

    WebUI.scrollToPosition(9000, 9000)

    WebUI.delay(5)

    'Click on Electricl Signature check box'
    WebUI.mouseOver(findTestObject('Object Repository/ClubProxy/checkBox_Signature'))

    WebUI.delay(2)

    WebUI.click(findTestObject('Object Repository/ClubProxy/checkBox_Signature'))

    WebUI.delay(2)

    'Click on Club proxy holder'
    WebUI.click(findTestObject('Object Repository/ClubProxy/button_Confirmproxyholder'))

    WebUI.delay(2)

    'Download Club Proxy Asssignment Summary '

    // CustomKeywords.'com.application.DPOSCustomKeyword.needSomeHelpCloseButton'()
    'Donwnload PDF A4'
    WebUI.click(findTestObject('Object Repository/ClubProxy/download_summary'))

    WebUI.delay(2)

    WebUI.click(findTestObject('Object Repository/ClubProxy/download_summaryPDF_A4'))

    WebUI.delay(2)

    'Donwnload PDF letter'
    WebUI.click(findTestObject('Object Repository/ClubProxy/download_summary'))

    WebUI.delay(2)

    WebUI.click(findTestObject('Object Repository/ClubProxy/download_summaryPDF_Letter'))

    WebUI.delay(2)

    'Click on Close and Return To OverView'
    WebUI.click(findTestObject('Object Repository/ClubProxy/a_CloseAndReturnToOverview') //WebUI.back()
        )

    WebUI.delay(2)

    // } else {
    //   }
    //  print('..............................................................PASS')
    //   } else {
    //      print('..............................................................FAIL')
    //    }
    if (WebUI.verifyElementVisible(findTestObject('Object Repository/ClubProxy/text_AcceptancePending'))) {
        GlobalVariable.vartestresult = 'PASS'

        GlobalVariable.varpassremarks = 'Successfully working all functionality on Club Proxy and Voting Instruction page.'
    } else {
        WebUI.back()

        GlobalVariable.vartestresult = 'FAIL'

        GlobalVariable.varfailremarks = 'Not working all functionality on Club Proxy and Voting Instruction page.'
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