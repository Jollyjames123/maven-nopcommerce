package com.demo.nopcommerce.pages;

import org.openqa.selenium.By;

public class PaymentInfoPage extends HomePage{
    By creditCard = By.xpath("//select[@id='CreditCardType']");
    By cardHolderName = By.xpath("//input[@id='CardholderName']");
    By cardNumber = By.xpath("//input[@id='CardNumber']");
    By expiryMonth = By.xpath("//select[@id='ExpireMonth']");
    By expiryYear = By.xpath("//select[@id='ExpireYear']");
    By cardCode = By.xpath("//input[@id='CardCode']");
    By continueButton = By.xpath("//button[@class='button-1 payment-info-next-step-button']");

    public void selectCreditCardType(int index){
        doSelectByIndexFromDropDown(creditCard, index);
    }

    public void inputCardHoldersName(String name){
        doSendTextToElement(cardHolderName, name);
    }

    public void inputCardNumber(String num){
        doSendTextToElement(cardNumber, num);
    }

    public void inputExpireMonth(String mon){
        doSendTextToElement(expiryMonth, mon);
    }

    public void inputExpireYear(String yr){
        doSendTextToElement(expiryYear, yr);
    }

    public void inputCardCode(String code) {
        doSendTextToElement(cardCode, code);
    }

    public void clickOnContinueButton(){
        doClickOnElement(continueButton);
    }

}
