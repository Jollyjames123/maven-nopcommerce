package com.demo.nopcommerce.pages;

import org.openqa.selenium.By;

public class ConfirmOrderPage extends HomePage{
    By creditCard = By.xpath("//span[contains(text(),'Credit Card')]");
    By shippingMethod = By.cssSelector("li[class='shipping-method'] span[class='value']");
    By totalAmount = By.xpath("//span[contains(text(),'$698.00')]");
    By totalAmountComputers = By.xpath("//span[contains(text(),'$2,950.00')]");
    By confirmButton = By.xpath("//button[contains(text(),'Confirm')]");




    public String getTextFromPaymentMethodText(){
        return doGetTextFromElement(creditCard);
    }

    public void verifyPaymentMethodOption(String paymentOption){
        String expectedMessage = paymentOption;
        String actualMessage = getTextFromPaymentMethodText();
        doVerifyElements(expectedMessage, actualMessage, "Credit Card Option is displayed incorrectly");
    }
    public String getTextFromShippingMethodText(){
        return doGetTextFromElement(shippingMethod);
    }

    public void verifyShippingMethodOption(String shippingOption){
        String expectedMessage = shippingOption;
        String actualMessage = getTextFromShippingMethodText();
        doVerifyElements(expectedMessage, actualMessage, "Shipping Option is displayed incorrectly");
    }

    public String getTextFromTotalAmountField(){

        return doGetTextFromElement(totalAmount);
    }

    public void verifyTotalAmountField(String total){
        String expectedMessage = total;
        String actualMessage = getTextFromTotalAmountField();
        doVerifyElements(expectedMessage, actualMessage, "Total amount is displayed incorrectly");
    }

    public String getTextFromTotalAmountComputersField(){

        return doGetTextFromElement(totalAmountComputers);
    }

    public void verifyTotalAmountComputersField(String total){
        String expectedMessage = total;
        String actualMessage = getTextFromTotalAmountComputersField();
        doVerifyElements(expectedMessage, actualMessage, "Total amount is displayed incorrectly");
    }

    public void clickOnConfirmButton(){
        doClickOnElement(confirmButton);
    }
}
