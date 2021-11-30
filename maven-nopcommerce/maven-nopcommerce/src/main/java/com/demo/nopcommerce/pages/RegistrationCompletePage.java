package com.demo.nopcommerce.pages;

import org.openqa.selenium.By;

public class RegistrationCompletePage extends HomePage{
    By registrationCompleteMessage = By.xpath("//div[@class='result']");
    By continueTab = By.xpath("//a[contains(text(),'Continue')]");

    public String getTextFromRegisterationCompleteMessage() {
        return doGetTextFromElement(registrationCompleteMessage);

    }

    public void verifyTheRegisterationCompleteMessage() {
        String expectedMessage = "Your registration completed";
        String actualMessage = getTextFromRegisterationCompleteMessage();
        doVerifyElements(expectedMessage, actualMessage, "Register Message is displayed incorrectly");
    }

    public void clickOnTheContinueButton() {
        doClickOnElement(continueTab);
    }
}
