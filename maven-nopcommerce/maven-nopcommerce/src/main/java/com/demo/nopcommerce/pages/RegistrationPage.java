package com.demo.nopcommerce.pages;

import com.demo.nopcommerce.utility.Utility;
import org.openqa.selenium.By;

public class RegistrationPage extends HomePage {
    By registerMessage = By.xpath("//h1[contains(text(),'Register')]");
    By firstName = By.xpath("//input[@id='FirstName']");
    By lastName = By.xpath("//input[@id='LastName']");
    By randomEmail = By.cssSelector("#Email");
    By password = By.xpath("//input[@id='Password']");
    By confirmPassword = By.xpath("//input[@id='ConfirmPassword']");
    By registerButton = By.xpath("//button[@id='register-button']");


    public String getTextFromRegisterMessage(){
        return doGetTextFromElement(registerMessage);
    }

    public void verifyTheRegisterDisplayMessage(){
        String expectedMessage = "Register";
        String actualMessage = getTextFromRegisterMessage();
        doVerifyElements(expectedMessage, actualMessage, "Register Message is displayed incorrectly");
    }

    public void enterFirstName(String fName){
        doSendTextToElement(firstName, fName);
    }

    public void enterLastName(String lName){
        doSendTextToElement(lastName, lName);
    }

    public void enterEmail(){
        doSendTextToElement(randomEmail, doRandomEmailGenerator());
    }
    public void enterPassword(String pWord){
        doSendTextToElement(password, pWord);
    }
    public void enterConfirmPassword(String cPWord){
        doSendTextToElement(confirmPassword, cPWord);
    }

    public void clickOnRegisterButton(){
        doClickOnElement(registerButton);
    }
}
