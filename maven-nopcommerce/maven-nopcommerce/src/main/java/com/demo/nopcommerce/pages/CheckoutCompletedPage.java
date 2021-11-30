package com.demo.nopcommerce.pages;

import org.openqa.selenium.By;

public class CheckoutCompletedPage extends HomePage{
    By thankYouMessage = By.xpath("//h1[contains(text(),'Thank you')]");
    By successfulOrderMessage = By.xpath("//strong[contains(text(),'Your order has been successfully processed!')]");
    By continueButton = By.xpath("//button[contains(text(),'Continue')]");

    public String getTextFromThankYouMessage(){
        return doGetTextFromElement(thankYouMessage);
    }

    public void verifyThankYouMessage(){
        String expectedMessage = "Thank you";
        String actualMessage = getTextFromThankYouMessage();
        doVerifyElements(expectedMessage, actualMessage, "Thank You message is displayed incorrectly");
    }

    public String getTextFromOrderProcessedSuccessfullyMessage(){
        return doGetTextFromElement(successfulOrderMessage);
    }

    public void verifyOrderProcessedSuccessfullyMessage(){
        String expectedMessage = "Your order has been successfully processed!";
        String actualMessage = getTextFromOrderProcessedSuccessfullyMessage();
        doVerifyElements(expectedMessage, actualMessage, "Successfully processed message is displayed incorrectly");
    }

    public void clickOnContinueButton(){
        doClickOnElement(continueButton);
    }
}
