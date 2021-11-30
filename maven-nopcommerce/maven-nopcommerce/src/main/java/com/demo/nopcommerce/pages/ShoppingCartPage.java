package com.demo.nopcommerce.pages;

import org.openqa.selenium.By;

public class ShoppingCartPage extends HomePage{
    By shoppingCartDisplayMessage = By.xpath("//h1[contains(text(),'Shopping cart')]");
    By termsAndConditionsBox = By.xpath("//input[@id='termsofservice']");
    By checkoutButton = By.xpath("//button[@id='checkout']");
    By quantityBox = By.xpath("//input[@class='qty-input']");
    By updateShoppingCart = By.xpath("//div[@class='common-buttons']/child::button[1]");
    By totalAmount = By.xpath("//span[@class='product-subtotal']");
    By tAndCBox = By.id("termsofservice");

    public String getTextFromDisplayMessage() {
        return doGetTextFromElement(shoppingCartDisplayMessage);
    }

    public void verifyTheShoppingCartDisplayMessage() {
        String expectedMessage = "Shopping cart";
        String actualMessage = getTextFromDisplayMessage();
        doVerifyElements(expectedMessage, actualMessage, "Shopping Cart Message is displayed incorrectly");
    }

    public void clickOnTermsAndConditionsAgreeBox() {
        doClickOnElement(termsAndConditionsBox);
    }

    public void clickOnCheckoutButton() {
        doClickOnElement(checkoutButton);
    }

    public void clearTheQuantityField() {
        driver.findElement(quantityBox).clear();
    }

    public void updateTheQuantityField(String quantity) {
        doSendTextToElement(quantityBox, quantity);
    }

    public void clickOnUpdateShoppingCart(){
        doClickOnElement(updateShoppingCart);
    }

    public String getTextFromAmountElement(){
        return doGetTextFromElement(totalAmount);
    }

    public void verifyTotalAmount(String enterExpectedAmount){
        String expectedAmount = enterExpectedAmount;
        String actualAmount = getTextFromAmountElement();
        doVerifyElements(expectedAmount, actualAmount, "Amount does not match");
    }

    public void agreeWithTermsAndConditions(){
        doClickOnElement(tAndCBox);
    }

}
