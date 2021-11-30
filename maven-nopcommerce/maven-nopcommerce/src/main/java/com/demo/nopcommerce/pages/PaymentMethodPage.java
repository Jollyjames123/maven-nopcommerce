package com.demo.nopcommerce.pages;

import org.openqa.selenium.By;

public class PaymentMethodPage extends HomePage{
    By creditCardRadioButton = By.id("paymentmethod_1");

    By continueButton = By.xpath("//button[@name='save' and @class='button-1 payment-method-next-step-button']");


    public void clickOnCreditCardRadioButton(){
        doClickOnElement(creditCardRadioButton);
    }

    public void clickOnContinueButton(){
        doClickOnElement(continueButton);
    }
}
