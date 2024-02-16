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
import com.application.DPOSCustomKeyword as DPOSCustomKeyword
import com.github.javafaker.Faker as Faker
import groovy.time.TimeCategory as TimeCategory
import java.text.DateFormat as DateFormat
import java.text.SimpleDateFormat as SimpleDateFormat
import java.util.Date as Date

try {
	CustomKeywords.'com.application.DateTime.startTime'()
	
	CustomKeywords.'com.application.DPOSCustomKeyword.needSomeHelpCloseButton'()
	
	WebUI.delay(2)

	Faker faker = new Faker()

	String name = faker.name().fullName( // Miss Samanta Schmidt
		)

	String firstName = faker.name().firstName( // Emory
		)

	GlobalVariable.firstName = firstName

	String lastName = faker.name().lastName( // Barton
		)

	GlobalVariable.lastNames = lastName

	String emailid = faker.internet().safeEmailAddress(firstName)

	GlobalVariable.memberEmail = emailid

	String mobileNumber = faker.phoneNumber().cellPhone()

	GlobalVariable.PhoneNumber = mobileNumber

	String streetAddress = faker.address().streetAddress()

	GlobalVariable.streetAddress1 = streetAddress

	String city = faker.address().cityName()

	GlobalVariable.city1 = city

	//print(GlobalVariable.city1,GlobalVariable.streetAddress1)
	WebUI.sendKeys(findTestObject('Object Repository/ATO/input_FirstName'), firstName)
	
	WebUI.delay(2)

	WebUI.sendKeys(findTestObject('Object Repository/ATO/input_LastName'), lastName)
	
	WebUI.delay(2)

	WebUI.click(findTestObject('Object Repository/ATO/input_Female_Gender'))
	
	WebUI.delay(2)

	WebUI.click(findTestObject('Object Repository/ATO/flag_dropdown_mobile_phone'))
	
	WebUI.delay(2)

	WebUI.click(findTestObject('Object Repository/ATO/span_United States'))
	
	WebUI.delay(2)

	WebUI.sendKeys(findTestObject('Object Repository/ATO/input_MobilePhone'), mobileNumber)
	
	WebUI.delay(2)

	WebUI.sendKeys(findTestObject('Object Repository/ATO/input_PrimaryEmail'), emailid)
	
	WebUI.delay(2)

	WebUI.setText(findTestObject('Object Repository/ATO/input_Password'), GlobalVariable.TestData['Password'])
	
	WebUI.delay(2)

	WebUI.setText(findTestObject('Object Repository/ATO/input_Confirm_Password'), GlobalVariable.TestData['Password'])
	
	WebUI.delay(2)

	'Click on Save and Continue button'
	WebUI.click(findTestObject('Object Repository/ATO/button_Save and Continue'))
	
	WebUI.delay(5)

	String countryname = GlobalVariable.TestData['CountryName']

	String city1 = GlobalVariable.TestData['City']

	String states = GlobalVariable.TestData['States']

	String postalcode = GlobalVariable.TestData['PostalCode']

	//Thread.sleep(2000)
	WebUI.selectOptionByLabel(findTestObject('Object Repository/ATO/Page_Toastmasters International -Chartering Application/select_SelectCountry'),
		countryname, false)

	GlobalVariable.countryCH = countryname

	WebUI.setText(findTestObject('Object Repository/ATO/Page_Toastmasters International -Chartering Application/input_City'),
		city1)

	GlobalVariable.cityCH = city1

	WebUI.waitForElementVisible(findTestObject('Object Repository/ATO/Page_Toastmasters International -Chartering Application/select_SelectStates'),
		10)

	WebUI.selectOptionByLabel(findTestObject('Object Repository/ATO/Page_Toastmasters International -Chartering Application/select_SelectStates'),
		states, false)

	GlobalVariable.statesCH = states

	WebUI.setText(findTestObject('Object Repository/ATO/Page_Toastmasters International -Chartering Application/input_ZIP'),
		postalcode)

	GlobalVariable.PostalCode = postalcode
	
	WebUI.selectOptionByLabel(findTestObject('Object Repository/ATO/Page_Toastmasters International -Chartering Application/select_SelectClubType'),
		'College', false)

	String clubtype = WebUI.getText(findTestObject('Object Repository/ATO/Page_Toastmasters International -Chartering Application/select_SelectClubType'))

	GlobalVariable.clubtypeCH = clubtype
	
	WebUI.selectOptionByLabel(findTestObject('Object Repository/ATO/select_MeetingType'),'Online', false)

	String meetingtype = WebUI.getText(findTestObject('Object Repository/ATO/select_MeetingType'))

	GlobalVariable.languageCH = meetingtype
	
	WebUI.delay(3)
	
	WebUI.click(findTestObject('Object Repository/ATO/input_Yes'))
	
	WebUI.delay(3)

	WebUI.click(findTestObject('Object Repository/ATO/button_Save and Continue'))

	WebUI.delay(5)
	
	CustomKeywords.'com.application.DPOSCustomKeyword.needSomeHelpCloseButton'()
	
	WebUI.delay(2)
	
	WebUI.click(findTestObject('Object Repository/ATO/button_SaveAndContinueForSponcership'))
	
	Thread.sleep(1000)
	
	if (WebUI.waitForElementVisible(findTestObject('Object Repository/ATO/h2_Payment'),150)) {
	
		GlobalVariable.vartestresult = 'PASS'

		GlobalVariable.varpassremarks = 'User Successfully save CharterAgreement details.'
	} else {
		GlobalVariable.vartestresult = 'FAIL'

		GlobalVariable.varfailremarks = 'User not save charterAgreement details Or getting any error message.'
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