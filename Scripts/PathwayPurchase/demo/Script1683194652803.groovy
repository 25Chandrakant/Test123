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
import org.stringtemplate.v4.compiler.STParser.ifstat_return as ifstat_return
import java.net.URL as URL

 

    WebUI.sendKeys(findTestObject('My Profile/OrderHistory/input_search'), 'SO-000000002399')

	String ordernumber = WebUI.getText(  findTestObject('My Profile/OrderHistory/td_orderNumber')  )
	
	String ordervalue = WebUI.getText(  findTestObject('My Profile/OrderHistory/td_orderValue')  )
    
	
	if (ordernumber=="SO-000000002399"&&ordervalue=="\$48.49") {
	 
		println "PASS..............................................................."
		
			}
	else{
		
		println "FAIL..............................................................."
	}