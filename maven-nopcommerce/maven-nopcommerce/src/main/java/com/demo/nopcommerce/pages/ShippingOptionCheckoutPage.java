package com.demo.nopcommerce.pages;

import org.openqa.selenium.By;

public class ShippingOptionCheckoutPage extends HomePage{
    By radioButton2ndDayAir = By.id("shippingoption_2");
    By radioButtonNextDayAir = By.id("shippingoption_1");
    By continueButton = By.xpath("//button[@class='button-1 shipping-method-next-step-button']");

    public void clickOnButton2ndDayAir(){
        doClickOnElement(radioButton2ndDayAir);
    }

    public void clickOnContinueButton(){
        doClickOnElement(continueButton);
    }

    public void clickOnNextDayAirButton(){
        doClickOnElement(radioButtonNextDayAir);
    }
}
