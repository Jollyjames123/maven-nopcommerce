package com.demo.nopcommerce.pages;

import org.openqa.selenium.By;

public class SignInPage extends HomePage{
    By signInPageWelcomeMessage = By.xpath("//h1[contains(text(),'Welcome, Please Sign In!')]");
    By registerTab = By.xpath("//button[contains(text(),'Register')]");
    By checkOutAsGuest = By.xpath("//button[contains(text(),'Checkout as Guest')]");


    public String getTextFromWelcomeMessage(){
        return doGetTextFromElement(signInPageWelcomeMessage);

    }

    public void verifyTheSignInDisplayMessage(){
        String expectedMessage = "Welcome, Please Sign In!";
        String actualMessage = getTextFromWelcomeMessage();
        doVerifyElements(expectedMessage, actualMessage, "Sign In Message is displayed incorrectly");
    }

    public void clickOnRegisterTab(){
        doClickOnElement(registerTab);
    }

    public void clickOnCheckOutAsAGuestTab(){
        doClickOnElement(checkOutAsGuest);
    }
}
