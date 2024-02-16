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
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords

try {
    CustomKeywords.'com.application.DateTime.startTime'()

    CustomKeywords.'com.application.DPOSCustomKeyword.needSomeHelpCloseButton'()

    WebDriver driver = DriverFactory.getWebDriver()

	List<WebElement> allLinks = driver.findElements(By.xpath('//button[@value=\'Quick View\']'))

	println('No. of rows: ' + allLinks.size())

	Thread.sleep(2000)
    def elements = WebUiBuiltInKeywords.findWebElements(findTestObject('Object Repository/ClubCentral/Club Financials/button_Quick View'), 
        5)

    println(elements.size())

    for (int i = 0; i < elements.size(); i++) {
        elements.get(i).click()

        //allLinks = driver.findElements(By.xpath('//*[@class=\'firstLevelMenu\']'))
        //allLinks.get(i).click()
        Thread.sleep(2000)
    }
    
    WebDriver driver = DriverFactory.getWebDriver()

    'To locate table'
    WebElement Table = driver.findElement(By.xpath('//table[@role=\'presentation\']'))

    'To locate rows of table it will Capture all the rows available in the table'
    List<WebElement> rows_table = Table.findElements(By.xpath('//table[@class="quick-receipt-table"]//tbody//tr'))

    'To calculate no of rows In table'
    int rows_count = rows_table.size()

    print(rows_count)

    Loop: for (int row = 0; row < rows_count; row++) {
        String CellData = rows_table.get(row).getText()

        print('...............................................................' + CellData)

        'Checking if Cell text is matching with the expected value'
        if (CellData.contains('Richard S. Donnell')&&CellData.contains('TI - Club Mbrship 01-Apr-2022 to 30-Sep-2022')&&CellData.contains('$45.00')) {
            'After getting the Expected value from Table we will Terminate the loop'
            print('...................................................................................PASS')

            Loop: break
        } else {
            print('...................................................................................FAIL')
        }
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