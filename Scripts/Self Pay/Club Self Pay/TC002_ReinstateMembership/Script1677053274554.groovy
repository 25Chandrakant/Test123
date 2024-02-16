import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import org.openqa.selenium.Keys as Keys
import org.openqa.selenium.WebElement as WebElement

import com.application.submitpayment
import com.kms.katalon.core.webui.common.WebUiCommonHelper
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable as GlobalVariable

try {
		
    CustomKeywords.'com.application.DateTime.startTime'()
	
	CustomKeywords.'com.application.DPOSCustomKeyword.needSomeHelpCloseButton'()
	
	WebUI.delay(2)
	
	WebUI.click(findTestObject('Object Repository/SelfPay/Common Functionality/tile_ClubCentralClick'))
	
	WebUI.delay(2)
	
	WebUI.click(findTestObject('SelfPay/Common Functionality/popup_CloseSelfPaySettingsPopup'))

	WebUI.delay(2)
	
	WebUI.click(findTestObject('Object Repository/SelfPay/Common Functionality/tile_MembershipManagementClick'))
	
	WebUI.delay(2)
	
	WebUI.click(findTestObject('Object Repository/SelfPay/Common Functionality/btn_ClickOnSortingBtn'))
	
	WebUI.delay(2)
	
	WebUI.click(findTestObject('Object Repository/SelfPay/Common Functionality/radiobtn_AtoZClickBtn'))
	
	WebUI.delay(2)
	
	WebUI.click(findTestObject('Object Repository/SelfPay/Common Functionality/dropdown_SortByPaymentOption'))
	
	WebUI.delay(2)
	
	WebUI.click(findTestObject('Object Repository/SelfPay/Common Functionality/dropdown_SelectSortingOption'))
	
	WebUI.delay(2)
	
	WebUI.click(findTestObject('Object Repository/SelfPay/Common Functionality/btn_ClickOnApplyFilter'))
	
	WebUI.delay(2)
	
	WebUI.mouseOver(findTestObject('Object Repository/SelfPay/Common Functionality/card_MouseHover'))
	
	WebUI.delay(2)
	
	WebUI.click(findTestObject('Object Repository/SelfPay/Common Functionality/btn_CardAddtoCartButtonClick'))
	
	WebUI.delay(2)
	
	WebUI.click(findTestObject('Object Repository/SelfPay/Common Functionality/dropdown_MembershipTypeSelectionClick'))
	
	WebUI.delay(2)
	
	WebUI.click(findTestObject('Object Repository/SelfPay/Common Functionality/dropdown_SelectMembershipTypeReinstate'))
	
	WebUI.delay(2)
	
	WebUI.click(findTestObject('Object Repository/SelfPay/Common Functionality/dropdown_ReinstateStartDateClick'))
	
	WebUI.delay(2)
	
	WebUI.click(findTestObject('Object Repository/SelfPay/Common Functionality/dropdown_EnterReinstateStartDate'))
	
	WebUI.delay(2)
	
	WebUI.click(findTestObject('Object Repository/SelfPay/Common Functionality/dropdown_ReinstateEndDateClick'))
	
	WebUI.delay(2)
	
	WebUI.click(findTestObject('Object Repository/SelfPay/Common Functionality/dropdown_EnterReinstateEndDate'))
	
	WebUI.delay(2)
	
	WebUI.click(findTestObject('Object Repository/SelfPay/Common Functionality/btn_CardAddtoCartButtonClick2'))
	
	WebUI.delay(2)
	
	WebUI.click(findTestObject('Object Repository/SelfPay/Common Functionality/btn_ClickOnMembershipCartBtn'))
	
	WebUI.delay(2)
	
	WebUI.click(findTestObject('Object Repository/SelfPay/Common Functionality/popup_ClosePopUpWidget'))
	
	WebUI.delay(2)
	
	WebUI.click(findTestObject('Object Repository/SelfPay/Common Functionality/btn_ContinueToMembershipOrder'))

	WebUI.delay(2)
	
	WebUI.click(findTestObject('Object Repository/SelfPay/Common Functionality/popup_ClosePopUpWidget'))
	
	WebUI.delay(2)
	
	WebUI.click(findTestObject('Object Repository/SelfPay/Common Functionality/btn_ContinueToPayment'))
	
	WebUI.delay(2)
	
	WebUI.click(findTestObject('Object Repository/SelfPay/Common Functionality/popup_ClosePopUpWidget'))
	
	WebUI.delay(2)
	
	CustomKeywords.'com.application.submitpayment.payment'()
	
	WebUI.delay(2)
		
	WebUI.scrollToPosition(9999999, 9999999)
	
	WebUI.delay(2)
	
	WebUI.click(findTestObject('Object Repository/SelfPay/Common Functionality/btn_SubmitPaymentClubSelfPay'))

	WebUI.delay(4)

	if (WebUI.verifyElementVisible(findTestObject('Object Repository/SelfPay/Common Functionality/text_MembershipPaymentId'))) {

		WebUI.delay(2)

		String membershipPaymenytId = WebUI.getText(findTestObject('Object Repository/SelfPay/Common Functionality/text_MembershipPaymentId'))

		WebUI.delay(2)

		println(membershipPaymenytId)

		WebUI.delay(2)
	
        GlobalVariable.vartestresult = 'PASS'

        GlobalVariable.varpassremarks = ('Successfully Membership Reinstated.' + membershipPaymenytId)
    } else {
        GlobalVariable.vartestresult = 'FAIL'

        GlobalVariable.varfailremarks = 'Officer was not able to Reinstate Membership.'
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

