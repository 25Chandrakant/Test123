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

import java.lang.invoke.Stable
import java.net.URL as URL
import java.util.concurrent.ConcurrentHashMap.KeySetView as KeySetView
import org.checkerframework.checker.index.qual.SubstringIndexFor as SubstringIndexFor
import org.junit.After as After
import org.openqa.selenium.Keys as Keys
import org.stringtemplate.v4.compiler.STParser.memberExpr_return as memberExpr_return
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

try {
    CustomKeywords.'com.application.DateTime.startTime'()

    CustomKeywords.'com.application.DPOSCustomKeyword.needSomeHelpCloseButton'()

    /*if (WebUI.verifyElementPresent(findTestObject('Object Repository/ClubCentral/Submit Payment/div_Member has a pending membership'),2 )) {
		WebUI.click( findTestObject('Object Repository/ClubCentral/Submit Payment/a_Submit Payment')  )
	
	}
	 
	else if (WebUI.verifyElementPresent(findTestObject('Object Repository/ClubCentral/Add_Membership/No, Dual_Reinstated Member/a_Submit Payment'),2 )) {
		WebUI.click( findTestObject('Object Repository/ClubCentral/Add_Membership/No, Dual_Reinstated Member/a_Submit Payment')  )
	
	}**/
   WebUI.click(findTestObject('Object Repository/ClubCentral/Add_Membership/No, Dual_Reinstated Member/a_Submit Payment'),FailureHandling.OPTIONAL  )
    String a = WebUI.getText(findTestObject('Object Repository/ClubCentral/Submit Payment/td_TypeReinstating Member'))

    println('get the value of Type ' + a)

    if (a == 'Renewal') {
        println('testing for the Renewal')

        CustomKeywords.'com.application.DPOSCustomKeyword.needSomeHelpCloseButton'()

        WebUI.click(findTestObject('Object Repository/ClubCentral/Submit Payment/button_Add to Cart')) //WebUI.selectOptionByIndex(findTestObject('Object Repository/ClubCentral/Submit Payment/select_Start Date'), 1 ,2)
                

        //WebUI.selectOptionBylabel(findTestObject('Object Repository/ClubCentral/Submit Payment/select_End Date'), 1 , false)
        //WebUI.click(findTestObject('Object Repository/ClubCentral/Submit Payment/button_Add to Cart'))
        WebUI.delay(10)

        WebUI.click(findTestObject('Object Repository/ClubCentral/Submit Payment/input_Contiunue to payment information'))

        WebUI.delay(10)

        String str = WebUI.getText(findTestObject('Object Repository/ClubCentral/Submit Payment/text_MemberNameCell'))

        String memberNameCell = str.substring(0, 6)

        GlobalVariable.MemberNameCell = memberNameCell

        print(memberNameCell)

        WebUI.delay(2)

        String memberStartDate = WebUI.getText(findTestObject('Object Repository/ClubCentral/Submit Payment/text_memberStartDate'))

        GlobalVariable.MemberStartDate = memberStartDate

        print(memberStartDate)

        String memberEndDate = WebUI.getText(findTestObject('Object Repository/ClubCentral/Submit Payment/text_memberEndDate'))

        GlobalVariable.MemberEndDate = memberEndDate

        print(memberEndDate)

        String totalAmountCell = WebUI.getText(findTestObject('Object Repository/ClubCentral/Submit Payment/text_AmountCell'))

        GlobalVariable.MemberAmountCell = totalAmountCell

        print(totalAmountCell)

        WebUI.delay(5) //WebUI.click(findTestObject('Object Repository/ClubCentral/Add_Membership/No, Dual_Reinstated Member/button_needHelp')   )
            
     
  } else {
        CustomKeywords.'com.application.DPOSCustomKeyword.needSomeHelpCloseButton'()

        WebUI.delay(2)
		
		"Verify DropDown Hightlight validation "
		WebUI.click(findTestObject('Object Repository/ClubCentral/Submit Payment/button_Add to Cart'))
		
		String startDate = WebUI.getAttribute( findTestObject('Object Repository/ClubCentral/Submit Payment/valdiation_BeginDate') , "class")
		
		WebUI.verifyMatch(startDate, "has-error", false)
		

        WebUI.click(findTestObject('Object Repository/ClubCentral/Submit Payment/select_Start Date'))

        WebUI.sendKeys(findTestObject('Object Repository/ClubCentral/Submit Payment/select_Start Date'), Keys.chord(Keys.ARROW_DOWN))

        WebUI.delay(1)

        WebUI.sendKeys(findTestObject('Object Repository/ClubCentral/Submit Payment/select_Start Date'), Keys.chord(Keys.ENTER))

        WebUI.delay(1)

        WebUI.click(findTestObject('Object Repository/ClubCentral/Submit Payment/select_End Date'))

        WebUI.sendKeys(findTestObject('Object Repository/ClubCentral/Submit Payment/select_End Date'), Keys.chord(Keys.ARROW_DOWN))

        WebUI.delay(1)

        WebUI.sendKeys(findTestObject('Object Repository/ClubCentral/Submit Payment/select_End Date'), Keys.chord(Keys.ENTER))

        WebUI.delay(2)

        WebUI.click(findTestObject('Object Repository/ClubCentral/Submit Payment/button_Add to Cart'))

        WebUI.delay(9)

        WebUI.click(findTestObject('Object Repository/ClubCentral/Submit Payment/input_Contiunue to payment information'))

        WebUI.delay(10)

        String str = WebUI.getText(findTestObject('Object Repository/ClubCentral/Submit Payment/text_MemberNameCell'))

        String memberNameCell = str.substring(0, 6)

        GlobalVariable.MemberNameCell = memberNameCell

        String memberStartDate = WebUI.getText(findTestObject('Object Repository/ClubCentral/Submit Payment/text_memberStartDate'))

        GlobalVariable.MemberStartDate = memberStartDate

        print(memberStartDate)

        String memberEndDate = WebUI.getText(findTestObject('Object Repository/ClubCentral/Submit Payment/text_memberEndDate'))

        GlobalVariable.MemberEndDate = memberEndDate

        print(memberEndDate)

        String totalAmountCell = WebUI.getText(findTestObject('Object Repository/ClubCentral/Submit Payment/text_AmountCell'))

        GlobalVariable.MemberAmountCell = totalAmountCell

        print(totalAmountCell)

        WebUI.delay(5)
    }
	
    if (WebUI.verifyElementVisible(findTestObject('Object Repository/ClubCentral/Submit Payment/TC_TexValue') )) {
		
		 String tax = WebUI.getText( findTestObject('Object Repository/ClubCentral/Submit Payment/TC_TexValue')   )
		
		  if (tax=="\$0.90"){
			  WebUI.click(findTestObject('Object Repository/ClubCentral/Submit Payment/input__place-order-button'))
				  
		  }
		 
 			 
        GlobalVariable.vartestresult = 'PASS'

        GlobalVariable.varpassremarks = 'Successfully tax match with address.'
    } else {
        GlobalVariable.vartestresult = 'FAIL'

        GlobalVariable.varfailremarks = 'Tax not match with address.'
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

    WebUI.acceptAlert()
}