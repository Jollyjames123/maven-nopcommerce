package com.demo.nopcommerce.pages;

import org.openqa.selenium.By;

public class WelcomeToOurStorePage extends HomePage{
    By welcomeToStoreMessage = By.xpath("//h2[contains(text(),'Welcome to our store')]");
    By logOutLink = By.xpath("//a[contains(text(),'Log out')]");

    public String getTextFromWelcomeToStoreMessage(){
        return doGetTextFromElement(welcomeToStoreMessage);

    }

    public void verifyTheWelcomeToStoreDisplayMessage(){
        String expectedMessage = "Welcome to our store";
        String actualMessage = getTextFromWelcomeToStoreMessage();
        doVerifyElements(expectedMessage, actualMessage, "Welcome to our store Message is displayed incorrectly");
    }

    public void clickOnLogOutLink(){
        doClickOnElement(logOutLink);
    }
}
