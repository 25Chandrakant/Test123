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
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.By as By
import org.openqa.selenium.WebElement as WebElement
import java.net.URL as URL
import org.jsoup.Jsoup as Jsoup
import org.jsoup.nodes.Document as Document
import org.jsoup.nodes.Element as Element
import org.jsoup.select.Elements as Elements
import org.openqa.selenium.Capabilities as Capabilities
import org.openqa.selenium.Dimension as Dimension
import org.openqa.selenium.remote.RemoteWebDriver as RemoteWebDriver
import com.kms.katalon.core.webui.common.WebUICommonScripts as WebUICommonScripts
import com.kms.katalon.core.webui.common.WebUiCommonHelper as WebUiCommonHelper
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import java.text.SimpleDateFormat as SimpleDateFormat
import org.openqa.selenium.By
import org.openqa.selenium.support.ui.Select
import com.kms.katalon.core.webui.driver.DriverFactory

try {
    CustomKeywords.'com.application.DateTime.startTime'()

    WebUI.delay(4)

    WebUI.click(findTestObject('Object Repository/Speech Craft/img_EditDateTime'))

    WebUI.delay(2)

    SimpleDateFormat dateFormat = new SimpleDateFormat('MM/dd/yyyy')

    Calendar calendar = Calendar.getInstance()

    String currentDate = dateFormat.format(calendar.getTime())

    calendar.add(Calendar.MONTH, 1)

    String futureDate = dateFormat.format(calendar.getTime())

    long diff = dateFormat.parse(futureDate).getTime() - dateFormat.parse(currentDate).getTime()

    int randomFutureDays = (((Math.random() * diff) / (((1000 * 60) * 60) * 24)) as int)

    calendar.setTime(dateFormat.parse(currentDate))

    calendar.add(Calendar.DATE, randomFutureDays)

    String selectedFutureDate = dateFormat.format(calendar.getTime())

    WebUI.setText(findTestObject('Object Repository/Speech Craft/input_EStartDate'), selectedFutureDate)

    WebUI.delay(3)

    WebUI.click(findTestObject('Object Repository/Speech Craft/input_EStartTime'))

    WebUI.delay(2)

    WebUI.sendKeys(findTestObject('Object Repository/Speech Craft/input_EStartTime'), CustomKeywords.'com.application.DateTime.getCurrentTime'())

    WebUI.delay(2)
	
	SimpleDateFormat dateFormat1 = new SimpleDateFormat('MM/dd/yyyy')
	
		Calendar calendar1 = Calendar.getInstance()
	
		String currentDate1 = dateFormat1.format(calendar1.getTime())
	
		calendar1.add(Calendar.MONTH, 2)
	
		String futureDate1 = dateFormat1.format(calendar1.getTime())
	
		long diff1 = dateFormat1.parse(futureDate1).getTime() - dateFormat1.parse(currentDate1).getTime()
	
		int randomFutureDays1 = (((Math.random() * diff1) / (((1000 * 60) * 60) * 24)) as int)
	
		calendar1.setTime(dateFormat1.parse(currentDate1))
	
		calendar1.add(Calendar.DATE, randomFutureDays1)
	
		String selectedFutureDate1 = dateFormat1.format(calendar1.getTime())
		
		WebUI.setText(findTestObject('Object Repository/Speech Craft/input_EEndDate'), selectedFutureDate1)
		
		WebUI.delay(4)
		
		WebUI.click(findTestObject('Object Repository/Speech Craft/button_SubmitBtnForEditDT'))
		
		WebUI.delay(4)
		
		WebUI.click(findTestObject('Object Repository/Speech Craft/a_AssignNewCoordinator'))
		
		WebUI.delay(3)
		
		WebUI.click(findTestObject('Object Repository/Speech Craft/input_CoordinatorLN'))
		
		WebUI.delay(1)
		
		WebUI.sendKeys(findTestObject('Object Repository/Speech Craft/input_CoordinatorLN'), 'Khanna')
		
		WebUI.delay(2)
		
		WebUI.click(findTestObject('Object Repository/Speech Craft/input_CoordinatorEmail'))
		
		WebUI.delay(1)
		
		WebUI.sendKeys(findTestObject('Object Repository/Speech Craft/input_CoordinatorEmail'),'dkhanna01@yahoo.com')
		
		WebUI.delay(2)
		
		WebUI.click(findTestObject('Object Repository/Speech Craft/button_CoordinatorSearchBtn'))
		
		WebUI.delay(2)
		
		WebUI.click(findTestObject('Object Repository/Speech Craft/button_SelectCoordinator'))
		
		WebUI.delay(5)
		
		if (WebUI.verifyElementVisible(findTestObject('Object Repository/Speech Craft/div_WarningMessage'))){
			
			WebUI.delay(2)
			
			WebUI.click(findTestObject('Object Repository/Speech Craft/button_CoordinatorSubmitBtn'))
		}
		
		else {}
		
		Thread.sleep(1000)

 /*   if (WebUI.verifyElementVisible(findTestObject('Object Repository/Speech Craft/input_LogIn'))) {
		
        WebUI.delay(4)
		
        WebUI.click(findTestObject('Object Repository/Speech Craft/input_LogIn'))
		
		WebUI.delay(2)
		
    }
	
	else {}*/
		
		WebUI.click(findTestObject('Object Repository/Speech Craft/span_Login'))
		
		WebUI.delay(2)
		
		'Enter the valid username and password'
		WebUI.setText(findTestObject('Object Repository/Speech Craft/input_UserName'), 'dkhanna01@yahoo.com')
	
		WebUI.mouseOver(findTestObject('Object Repository/Speech Craft/input_Password'))
		
		WebUI.setText(findTestObject('Object Repository/Speech Craft/input_Password'), GlobalVariable.TestData['Password'])
	
		//Thread.sleep(1000)
		'Click on Login button'
		WebUI.click(findTestObject('Object Repository/Speech Craft/input_LogIn'))
		
		WebUI.delay(5)
		
		WebUI.click(findTestObject('Object Repository/Speech Craft/select_EventDrpDwn'))
		
		WebUI.delay(2)
		
		Date todaysDate2 = new Date()
		def formattedDate2 = todaysDate2.format('MM-dd-yyyy')
		
		String event = ('Prospective Club -' + GlobalVariable.TestData['Event_Name'] + ' - '+ formattedDate2)
		
		println(event)
		
		//WebUI.sendKeys(findTestObject('Object Repository/Speech Craft/select_EventDrpDwn'), event )
		
		//WebUI.sendKeys(findTestObject('Object Repository/Speech Craft/select_EventDrpDwn'), Keys.chord(Keys.ENTER))
		
		
	
			
			//WebUI.click(findTestObject('Object Repository/Speech Craft/select_EventDrpDwn'))
			
			String demo = WebUI.getText(findTestObject('Object Repository/Speech Craft/select_ValueInDrpDwn'))
			
			println(demo)
			
			WebUI.delay(3)
		
			Select select = new Select(DriverFactory.getWebDriver().(findTestObject('Object Repository/Speech Craft/select_ValueInDrpDwn')))
			
			def MyLabel = select.allSelectedOptions().size()
			for(int i=1;i<MyLabel;i++){
				String demo1 = WebUI.getText(findTestObject('Object Repository/Speech Craft/select_ValueInDrpDwn'))
				
				println(demo1)
			}
			
			println(MyLabel)
			
	
		WebUI.delay(7)
		
	if (WebUI.verifyElementVisible(findTestObject('Object Repository/Speech Craft/div_CoordinatorName'))) {
		
		WebUI.delay(4)

        print('PASS...............................')

        GlobalVariable.vartestresult = 'PASS'

        GlobalVariable.varpassremarks = 'User Successfully edited coordinator.'
    } else {
        print('FAIL...............................')

        GlobalVariable.vartestresult = 'FAIL'

        GlobalVariable.varfailremarks = 'User unable to edit coordinator.'
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