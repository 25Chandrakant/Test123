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

    CustomKeywords.'com.application.DPOSCustomKeyword.needSomeHelpCloseButton'()

    'Download Proxy Assignment Summary'

    'Download A4 proxy'
    WebUI.click(findTestObject('Object Repository/ClubProxy/button_DownloadProxy'))

    WebUI.click(findTestObject('Object Repository/ClubProxy/download_proxyA4'))

    'Download Letter Summary'
    WebUI.click(findTestObject('Object Repository/ClubProxy/button_DownloadProxy'))

    WebUI.click(findTestObject('Object Repository/ClubProxy/download_proxyLetter'))

    'Designate ProxyHolder'
    if (WebUI.verifyElementVisible(findTestObject('Object Repository/ClubProxy/button_Edit_DesignateProxyHolder'))) {
        WebUI.click(findTestObject('Object Repository/ClubProxy/button_Edit_DesignateProxyHolder'))
    } else {
        WebUI.click(findTestObject('Object Repository/ClubProxy/button_Start_DesignateProxyHolder'))
    }
    
    if (WebUI.verifyElementVisible(findTestObject('Object Repository/ClubProxy/collapse_attribute'))) {
        WebUI.click(findTestObject('Object Repository/ClubProxy/button_EditProxy'))

        'Click on Member of Club '
        if (WebUI.verifyElementVisible(findTestObject('Object Repository/ClubProxy/checkBox_MemberOption'))) {
            WebUI.click(findTestObject('Object Repository/ClubProxy/checkBox_MemberOption'))

            Thread.sleep(1000)

            if (WebUI.verifyElementVisible(findTestObject('Object Repository/ClubProxy/dropDown_Member'))) {
                print('..............................................................PASS')
            } else {
                print('..............................................................FAIL')
            }
        } else {
        }
        
        'Click on District Director'
        if (WebUI.verifyElementVisible(findTestObject('Object Repository/ClubProxy/checkBox_Director'))) {
            WebUI.click(findTestObject('Object Repository/ClubProxy/checkBox_Director'))

            Thread.sleep(1000)

            if (WebUI.verifyElementVisible(findTestObject('Object Repository/ClubProxy/checkBox_IAgree_DistrictDirector'))) {
                print('..............................................................PASS')
            } else {
                print('..............................................................FAIL')
            }
        } else {
        }
        
        'Click on Other ToastMaster Member'
        if (WebUI.verifyElementVisible(findTestObject('Object Repository/ClubProxy/checkBox_OtherToastMasterMember'))) {
            WebUI.click(findTestObject('Object Repository/ClubProxy/checkBox_OtherToastMasterMember'))

            Thread.sleep(1000)

            if (WebUI.verifyElementVisible(findTestObject('Object Repository/ClubProxy/text_ValidatingMember'))) {
                print('..............................................................PASS')
            } else {
                print('..............................................................FAIL')
            }
        } else {
        }
        
        'Click on Member of Club '
        if (WebUI.verifyElementVisible(findTestObject('Object Repository/ClubProxy/checkBox_MemberOption'))) {
            WebUI.click(findTestObject('Object Repository/ClubProxy/checkBox_MemberOption'))

            Thread.sleep(1000)

            WebDriver driver = DriverFactory.getWebDriver()

            Select objSelect = new Select(driver.findElement(By.id('memberClub')))

            objSelect.selectByVisibleText('Ami Kotecha, PM2' // 'Ami Kotecha, PM2' GlobalVariable.TestData['MemberNameOfClub']
                )

            Thread.sleep(1000)

            WebUI.click(findTestObject('Object Repository/ClubProxy/button_save_MemberOfClub'))

            WebUI.click(findTestObject('Object Repository/ClubProxy/textBox_Signature'))

            WebUI.clearText(findTestObject('Object Repository/ClubProxy/textBox_Signature'))

            Thread.sleep(1000)

            WebUI.click(findTestObject('Object Repository/ClubProxy/textBox_Signature'))

            Thread.sleep(1000)

            WebUI.sendKeys(findTestObject('Object Repository/ClubProxy/textBox_Signature'), 'Kish Patel' //GlobalVariable.TestData['Signature'])
                )

            'Click on Electricl Signature check box'
            if (WebUI.verifyElementVisible(findTestObject('Object Repository/ClubProxy/button_disabled'))) {
                WebUI.click(findTestObject('Object Repository/ClubProxy/checkBox_Signature'))

                'Click on Club proxy holder'
                WebUI.click(findTestObject('Object Repository/ClubProxy/button_Confirmproxyholder'))

                'Download Club Proxy Asssignment Summary '
                CustomKeywords.'com.application.DPOSCustomKeyword.needSomeHelpCloseButton'()

                'Donwnload PDF A4'
                WebUI.click(findTestObject('Object Repository/ClubProxy/download_summary'))

                WebUI.click(findTestObject('Object Repository/ClubProxy/download_summaryPDF_A4'))

                'Donwnload PDF letter'
                WebUI.click(findTestObject('Object Repository/ClubProxy/download_summary'))

                WebUI.click(findTestObject('Object Repository/ClubProxy/download_summaryPDF_Letter'))

                'Click on Close and Return To OverView'
                WebUI.click(findTestObject('Object Repository/ClubProxy/a_CloseAndReturnToOverview' //WebUI.back()
                        ))
            } else {
            }
            
            print('..............................................................PASS')
        } else {
            print('..............................................................FAIL')
        }
    } else {
    }
    
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