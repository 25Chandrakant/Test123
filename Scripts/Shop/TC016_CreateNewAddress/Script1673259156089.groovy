import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
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

try {
    CustomKeywords.'com.application.DateTime.startTime'()

    WebUI.click(findTestObject('Object Repository/s_N_Shop/Page_Checkout/a_(Select Another Address)'))

    WebUI.click(findTestObject('Object Repository/s_N_Shop/Page_Checkout/a_Create New Address'))

    WebUI.setText(findTestObject('Object Repository/s_N_Shop/Page_Checkout/input_CompanyIn Care Of_lAttentionLine'), '31441 Santa Margarita Pkwy Suite N')

    WebUI.setText(findTestObject('Object Repository/s_N_Shop/Page_Checkout/input__address'), '31441 Santa Margarita Pkwy Suite N')

    WebUI.click(findTestObject('s_N_Shop/Page_Checkout/ol_Full Name_065278'))

    WebUI.setText(findTestObject('Object Repository/s_N_Shop/Page_Checkout/input__city'), 'Ranhco Santa Margarita')
	WebUI.delay(2)
   
 	
    WebUI.click(findTestObject('Object Repository/s_N_Shop/Page_Checkout/input__zip'))

    WebUI.sendKeys(findTestObject('Object Repository/s_N_Shop/Page_Checkout/input__zip'), '92688')
	WebUI.selectOptionByLabel(findTestObject('Object Repository/s_N_Shop/Page_Checkout/select_AlabamaAlaskaAmerican SamoaArizonaAr_430fb7'),
		'California', false)

	WebUI.delay(2)
	WebUI.click(findTestObject('Object Repository/s_N_Shop/Page_Checkout/frame_Click')  )
	
	WebUI.delay(10)
    WebUI.click(findTestObject('Object Repository/s_N_Shop/Page_Checkout/a_Next'))

    WebUI.click(findTestObject('Object Repository/s_N_Shop/Page_Checkout/a_Save'))

    WebUI.click(findTestObject('Object Repository/s_N_Shop/Page_Checkout/div_Address'))

    WebUI.verifyElementPresent(findTestObject('Object Repository/s_N_Shop/Page_Checkout/div_Address successfully updated'), 
        0)

    WebUI.delay(10)

    if (WebUI.verifyElementVisible(findTestObject('Object Repository/s_N_Shop/Page_Checkout/div_Address successfully updated'))) {
        GlobalVariable.vartestresult = 'PASS'

        GlobalVariable.varpassremarks = 'Create new address Successfully'

        WebUI.click(findTestObject('Object Repository/s_N_Shop/Page_Checkout/i_My Addresses_fa fa-close'))

        WebUI.click(findTestObject('Object Repository/s_N_Shop/Page_Checkout/a_Next'))
    } else {
        GlobalVariable.vartestresult = 'FAIL'

        GlobalVariable.varfailremarks = 'Unable to create new address'

        Thread.sleep(2000)
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