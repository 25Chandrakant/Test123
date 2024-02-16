  package com.application

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.common.WebUiCommonHelper
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import org.openqa.selenium.Keys as Keys
import org.openqa.selenium.WebElement

import internal.GlobalVariable

import java.awt.Robot
import java.awt.Toolkit
import java.awt.datatransfer.StringSelection
import java.awt.event.KeyEvent
import com.kms.katalon.core.configuration.RunConfiguration

public class submitpayment {

	@Keyword
	def payment() {

		WebUI.click(findTestObject('Object Repository/SelfPay/Common Functionality/textbox_ClickOnCardName'))

		WebUI.delay(2)

		WebUI.sendKeys(findTestObject('Object Repository/SelfPay/Common Functionality/textbox_ClickOnCardName'), GlobalVariable.TestData['cardNumber'])

		WebUI.delay(2)

		WebUI.sendKeys(findTestObject('Object Repository/SelfPay/Common Functionality/textbox_ClickOnCardName'), Keys.chord(Keys.CONTROL,'a'))

		WebUI.delay(2)

		WebUI.sendKeys(findTestObject('Object Repository/SelfPay/Common Functionality/textbox_ClickOnCardName'), Keys.chord(Keys.CONTROL,'x'))

		WebUI.delay(2)

		WebUI.click(findTestObject('Object Repository/SelfPay/Common Functionality/checkbox_AddAddress'))

		WebUI.delay(2)

		WebUI.click(findTestObject('Object Repository/SelfPay/Common Functionality/textbox_SelectCardField'))

		WebUI.delay(2)

		WebUI.sendKeys(findTestObject('Object Repository/SelfPay/Common Functionality/textbox_SelectCardField'), Keys.chord(Keys.CONTROL, 'v'))

		WebUI.delay(2)

		WebUI.click(findTestObject('Object Repository/SelfPay/Common Functionality/dropdown_SelectCardExpiryDate'))

		WebUI.delay(2)

		WebUI.sendKeys(findTestObject('Object Repository/SelfPay/Common Functionality/dropdown_SelectCardExpiryDate'),GlobalVariable.TestData['ExpireMonth'])

		WebUI.delay(2)

		WebUI.sendKeys(findTestObject('Object Repository/SelfPay/Common Functionality/dropdown_SelectCardExpiryDate'), Keys.chord(Keys.ENTER))

		WebUI.delay(2)

		WebUI.click(findTestObject('Object Repository/SelfPay/Common Functionality/dropdown_CardExpiryYearSelection'))

		WebUI.delay(2)

		WebUI.sendKeys(findTestObject('Object Repository/SelfPay/Common Functionality/dropdown_CardExpiryYearSelection'),GlobalVariable.TestData['ExpireYear'])

		WebUI.delay(2)

		WebUI.sendKeys(findTestObject('Object Repository/SelfPay/Common Functionality/dropdown_CardExpiryYearSelection'), Keys.chord(Keys.ENTER))

		WebUI.delay(2)
	}

	@Keyword
	def uploadFile(TestObject to, String filePath) {


		WebUI.click(to)
		StringSelection ss = new StringSelection(filePath);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
	}

	@Keyword

	def randomString(int length) {

		String chars = 'abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ'

		Random rand = new Random();

		StringBuilder sb = new StringBuilder();

		for (int i=0; i<length; i++) {

			sb.append(chars.charAt(rand.nextInt(chars.length())));
		}

		return sb.toString();
	}

	@Keyword

	def shopPayment() {

		WebUI.click(findTestObject('Object Repository/Shop/textbox_EnterCardNumber'))

		WebUI.delay(2)

		WebUI.sendKeys(findTestObject('Object Repository/Shop/textbox_EnterCardNumber'), GlobalVariable.TestData['cardNumber'])

		WebUI.delay(2)

		WebUI.click(findTestObject('Object Repository/Shop/textbox_EnterCardExpriyDate'))

		WebUI.delay(2)

		WebUI.sendKeys(findTestObject('Object Repository/Shop/textbox_EnterCardExpriyDate'), '09/2024')

		WebUI.delay(2)

		WebUI.click(findTestObject('Object Repository/Shop/textbox_EntercvcNumber'))

		WebUI.delay(2)

		WebUI.sendKeys(findTestObject('Object Repository/Shop/textbox_EntercvcNumber'), '456')

		WebUI.delay(2)
	}
}

