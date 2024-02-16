package com.application

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.github.javafaker.Faker as Faker
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
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import internal.GlobalVariable

public class FakerFunctionality {

	@Keyword

	def FakerFunction() {

		Faker faker1 = new Faker()

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

		String mobileNumber = faker1.phoneNumber().cellPhone()

		GlobalVariable.mobileNumber = mobileNumber

		WebUI.click(findTestObject('Object Repository/Shop/Shop_CreateNewAddress/dropdown_SelectCountry'))

		WebUI.delay(2)

		WebUI.sendKeys(findTestObject('Object Repository/Shop/Shop_CreateNewAddress/dropdown_SelectCountry'), GlobalVariable.CountryName)

		WebUI.delay(2)

		WebUI.click(findTestObject('Object Repository/Shop/Shop_CreateNewAddress/textbox_AddAddressLine1'))

		WebUI.delay(2)

		WebUI.sendKeys(findTestObject('Object Repository/Shop/Shop_CreateNewAddress/textbox_AddAddressLine1'), GlobalVariable.streetAddress)

		WebUI.delay(2)

		if(WebUI.verifyElementVisible(findTestObject('Object Repository/Shop/Shop_CreateNewAddress/textbox_EnterCityName'), FailureHandling.OPTIONAL)) {

			WebUI.delay(2)

			WebUI.click(findTestObject('Object Repository/Shop/Shop_CreateNewAddress/textbox_EnterCityName'))

			WebUI.delay(2)

			WebUI.sendKeys(findTestObject('Object Repository/Shop/Shop_CreateNewAddress/textbox_EnterCityName'), GlobalVariable.city)
		}
		else {
			WebUI.delay(2)
		}

		if(WebUI.verifyElementVisible(findTestObject('Object Repository/Shop/Shop_CreateNewAddress/dropdown_SelectState'))) {
			WebUI.delay(2)

			WebUI.click(findTestObject('Object Repository/Shop/Shop_CreateNewAddress/dropdown_SelectState'))

			WebUI.delay(2)

			WebUI.sendKeys(findTestObject('Object Repository/Shop/Shop_CreateNewAddress/dropdown_SelectState'), GlobalVariable.state)
		}
		else {
			WebUI.delay(2)
		}

		if(WebUI.verifyElementVisible(findTestObject('Object Repository/Shop/Shop_CreateNewAddress/textbox_EnterZipCode'))) {
			WebUI.delay(2)

			WebUI.click(findTestObject('Object Repository/Shop/Shop_CreateNewAddress/textbox_EnterZipCode'))

			WebUI.delay(2)

			WebUI.sendKeys(findTestObject('Object Repository/Shop/Shop_CreateNewAddress/textbox_EnterZipCode'),GlobalVariable.zipCode)
		}
		else {
			WebUI.delay(2)
		}

		//		WebUI.click(findTestObject('Object Repository/Shop/Shop_CreateNewAddress/textbox_EnterContactNumber'))
		//
		//		WebUI.clearText(findTestObject('Object Repository/Shop/Shop_CreateNewAddress/textbox_EnterContactNumber'), FailureHandling.OPTIONAL)
		//
		//		WebUI.delay(2)
		//
		//		WebUI.sendKeys(findTestObject('Object Repository/Shop/Shop_CreateNewAddress/textbox_EnterContactNumber'), GlobalVariable.mobileNumber)
	}
}
