package com.demo.nopcommerce.pages;

import org.openqa.selenium.By;

public class CheckoutPage extends HomePage{
    By firstName = By.xpath("//input[@id='BillingNewAddress_FirstName']");
    By lastName = By.xpath("//input[@id='BillingNewAddress_LastName']");
    By email = By.cssSelector("#BillingNewAddress_Email");

    By country = By.xpath("//select[@id='BillingNewAddress_CountryId']");
    By city = By.cssSelector("#BillingNewAddress_City");
    By address1 = By.cssSelector("#BillingNewAddress_Address1");
    By zipPostalCode = By.cssSelector("#BillingNewAddress_ZipPostalCode");
    By phoneNumber = By.xpath("//input[@id='BillingNewAddress_PhoneNumber']");
    By continueButton = By.xpath("//button[@onclick='Billing.save()']");

    public void selectDataFromCountryDropDown(int index){
        doSelectByIndexFromDropDown(country, index);
    }

    public void enterDataInTheCityField(String cityName){
        doSendTextToElement(city, cityName);
    }

    public void enterDataInTheAddress1Field(String add1){
        doSendTextToElement(address1, add1);
    }

    public void enterDataInTheZipPostalCodeField(String pCode){
        doSendTextToElement(zipPostalCode, pCode);
    }

    public void enterDataInTheMobileNumberField(String mobile){
        doSendTextToElement(phoneNumber, mobile);
    }

    public void clickOnContinueButton(){
        doClickOnElement(continueButton);
    }

    public void enterNameInTheFirstNameField(String name){
        doSendTextToElement(firstName, name);

    }

    public void enterLastNameInTheLastNameField(String lastname){
        doSendTextToElement(lastName, lastname);

    }

    public void enterRandomEmailInTheEmailField(){
        doSendTextToElement(email, doRandomEmailGenerator());
    }


}
