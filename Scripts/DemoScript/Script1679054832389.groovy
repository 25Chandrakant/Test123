import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable

'Open browser and navigate to given URL'

WebUI.openBrowser('file:///C:/Users/baps/Desktop/FileUpload.html')

WebUI.delay(4)

'Maximize the window\r\n'

WebUI.maximizeWindow()

WebUI.delay(4)

'Passing the path of the file'

WebUI.uploadFile(findTestObject('Object Repository/demo_UploadFile'), 'C:\\Users\\baps\\Downloads\\Eyeopeners_Club_2023_02_23.pdf')

WebUI.delay(10)
 
//'Capturing the file name after upload and storing it in a variable'

//FilePath = WebUI.getAttribute(findTestObject('Upload File'), 'value'