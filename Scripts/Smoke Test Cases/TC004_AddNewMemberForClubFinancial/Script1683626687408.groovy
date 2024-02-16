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
import com.github.javafaker.Faker as Faker
import java.net.URL as URL
import org.openqa.selenium.Keys as Keys
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

try {
	CustomKeywords.'com.application.DateTime.startTime'()

	CustomKeywords.'com.application.DPOSCustomKeyword.needSomeHelpCloseButton'()

	Faker faker1 = new Faker()

	String name = faker1.name().fullName()

	String firstName = faker1.name().firstName()

	GlobalVariable.firstName = firstName

	String middleName = faker1.name().nameWithMiddle()

	GlobalVariable.middleName = middleName

	String lastName = faker1.name().lastName()

	GlobalVariable.lastNames = lastName

	String mobileNumber = faker1.phoneNumber().cellPhone()

	GlobalVariable.mobileNumber = mobileNumber

	String emailId = faker1.internet().emailAddress()

	String emailId1 = faker1.internet().safeEmailAddress(firstName + lastName)

	GlobalVariable.emailId1 = emailId1 

	String emailId2 = faker1.internet().safeEmailAddress(lastName)

	GlobalVariable.emailId2 = emailId2

	String streetAddress = faker1.address().fullAddress()

	GlobalVariable.streetAddress = streetAddress

	String city = faker1.address().city()

	GlobalVariable.city = city

	String state = faker1.address().state()

	GlobalVariable.state = state

	String country = faker1.address().country()

	GlobalVariable.CountryName = country

	String zipCode = faker1.address().zipCode()

	GlobalVariable.zipCode = zipCode
	
	WebUI.waitForElementVisible(findTestObject('Object Repository/SelfPay/tile_ClubCentral'), 120)

	WebUI.click(findTestObject('Object Repository/SelfPay/tile_ClubCentral'))

	WebUI.delay(2)

	WebUI.click(findTestObject('Object Repository/SelfPay/Add Membership/button-ClosePopUp'))

	WebUI.delay(2)

	WebUI.click(findTestObject('Object Repository/SelfPay/Add Membership/div_MembershipManagement'))

	WebUI.delay(2)

	CustomKeywords.'com.application.DPOSCustomKeyword.needSomeHelpCloseButton'()

	WebUI.delay(2)

	WebUI.click(findTestObject('Object Repository/SelfPay/Add Membership/button_AddNewMembers'))

	WebUI.delay(5)

	CustomKeywords.'com.application.DPOSCustomKeyword.needSomeHelpCloseButton'()

	WebUI.delay(5)

	WebUI.click(findTestObject('Object Repository/SelfPay/Yes,NewMember/input_Yes,NewMember'))

	WebUI.delay(2)

	CustomKeywords.'com.application.DPOSCustomKeyword.needSomeHelpCloseButton'()

	WebUI.sendKeys(findTestObject('Object Repository/SelfPay/Yes,NewMember/input_LastName'), GlobalVariable.lastNames)

	WebUI.delay(2)

	WebUI.sendKeys(findTestObject('Object Repository/SelfPay/Yes,NewMember/input_FirstName'), GlobalVariable.firstName)

	WebUI.delay(2)
	
	String fullName = GlobalVariable.firstName + GlobalVariable.lastNames
	
	println(fullName)
	
	WebUI.delay(2)
	
	GlobalVariable.FullName = fullName

	WebUI.click(findTestObject('Object Repository/SelfPay/Yes,NewMember/input_FemaleGender'))

	WebUI.delay(2)

	WebUI.click(findTestObject('Object Repository/SelfPay/Yes,NewMember/input-PrimaryEmail'))

	WebUI.sendKeys(findTestObject('Object Repository/SelfPay/Yes,NewMember/input-PrimaryEmail'), GlobalVariable.emailId1)

	WebUI.delay(2)

	WebUI.click(findTestObject('Object Repository/SelfPay/Yes,NewMember/dropdown_Country'))

	WebUI.sendKeys(findTestObject('Object Repository/SelfPay/Yes,NewMember/dropdown_Country'), GlobalVariable.CountryName)

	WebUI.delay(2)

	WebUI.sendKeys(findTestObject('Object Repository/SelfPay/Yes,NewMember/input_Address'), GlobalVariable.streetAddress)

	WebUI.delay(2)

	WebUI.click(findTestObject('Object Repository/SelfPay/Yes,NewMember/input_MobilePhone'))

	//WebUI.sendKeys(findTestObject('Object Repository/SelfPay/Yes,NewMember/div_MobileCountry'), GlobalVariable.CountryName)

	//WebUI.delay(2)

	//WebUI.sendKeys(findTestObject('Object Repository/SelfPay/Yes,NewMember/div_MobileCountry'), Keys.chord(Keys.ENTER))

	WebUI.delay(2)

	WebUI.sendKeys(findTestObject('Object Repository/SelfPay/Yes,NewMember/input_MobilePhone'), '+12125888601')

	WebUI.sendKeys(findTestObject('Object Repository/SelfPay/Yes,NewMember/input_MobilePhone'), Keys.chord(Keys.ENTER))

	WebUI.delay(2)

	WebUI.click(findTestObject('Object Repository/SelfPay/Yes,NewMember/input_City'))

	WebUI.delay(2)

	WebUI.sendKeys(findTestObject('Object Repository/SelfPay/Yes,NewMember/input_City'), GlobalVariable.city)

	WebUI.delay(2)

	WebUI.click(findTestObject('Object Repository/SelfPay/Yes,NewMember/input_State'))

	WebUI.sendKeys(findTestObject('Object Repository/SelfPay/Yes,NewMember/input_State'), GlobalVariable.state)

	WebUI.delay(2)

	WebUI.click(findTestObject('Object Repository/SelfPay/Yes,NewMember/input_PostalCode'))

	WebUI.sendKeys(findTestObject('Object Repository/SelfPay/Yes,NewMember/input_PostalCode'), GlobalVariable.zipCode)

	WebUI.delay(2)

	WebUI.click(findTestObject('Object Repository/SelfPay/Yes,NewMember/input_MembershipPayment'))

	WebUI.delay(2)

	WebUI.click(findTestObject('Object Repository/SelfPay/Yes,NewMember/input_Confirm'))

	WebUI.delay(4)

	WebUI.click(findTestObject('Object Repository/SelfPay/Yes,NewMember/button_SaveMembershipSubmit'))

	WebUI.delay(2)

	CustomKeywords.'com.application.DPOSCustomKeyword.needSomeHelpCloseButton'()

	WebUI.delay(2)

	WebUI.click(findTestObject('SelfPay/Membership Cart/button_BeginDateDropdown'))

	WebUI.delay(2)

	WebUI.mouseOver(findTestObject('SelfPay/Membership Cart/button_BeginDateDropdown'))

	WebUI.delay(2)

	WebUI.click(findTestObject('Object Repository/SelfPay/Add Membership/No,Dual_ReinstateMember/dropdown_SelectBeginDate'))

	WebUI.delay(2)

	WebUI.click(findTestObject('SelfPay/Membership Cart/button_EndDateDropDown'))

	WebUI.delay(2)

	WebUI.click(findTestObject('Object Repository/SelfPay/Add Membership/No,Dual_ReinstateMember/dropdown_EnterEndDate'))

	WebUI.delay(2)

	WebUI.click(findTestObject('SelfPay/Membership Cart/a_MembershipOrder'))

	WebUI.delay(2)

	CustomKeywords.'com.application.DPOSCustomKeyword.needSomeHelpCloseButton'()

	WebUI.delay(2)

	WebUI.click(findTestObject('Object Repository/SelfPay/Review Order/a_ContinueToPayment'))

	WebUI.delay(2)

	CustomKeywords.'com.application.DPOSCustomKeyword.needSomeHelpCloseButton'()

	WebUI.delay(2)

	CustomKeywords.'com.application.submitpayment.payment'()

	WebUI.delay(4)

	WebUI.click(findTestObject('Object Repository/SelfPay/Common Functionality/btn_SubmitPaymentClubSelfPay'))

	WebUI.delay(4)

	if (WebUI.verifyElementVisible(findTestObject('Object Repository/SelfPay/Common Functionality/text_MembershipPaymentId'))) {

		WebUI.delay(2)

		String membershipPaymenytId = WebUI.getText(findTestObject('Object Repository/SelfPay/Common Functionality/text_MembershipPaymentId'))

		WebUI.delay(2)

		println(membershipPaymenytId)

		WebUI.delay(2)

		GlobalVariable.vartestresult = 'PASS'

		GlobalVariable.varpassremarks = 'User can successfully add new member.'
		
	} else {
		GlobalVariable.vartestresult = 'FAIL'

		GlobalVariable.varfailremarks = 'User not able to add new member.'
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

