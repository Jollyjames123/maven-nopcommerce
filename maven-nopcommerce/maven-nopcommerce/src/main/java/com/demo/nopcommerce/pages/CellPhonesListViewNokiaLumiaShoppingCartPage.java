package com.demo.nopcommerce.pages;

import org.openqa.selenium.By;

public class CellPhonesListViewNokiaLumiaShoppingCartPage extends HomePage{
    By shoppingCartDisplayMessage = By.xpath("//h1[contains(text(),'Shopping cart')]");
    By shoppingCartDisplayQuantity = By.xpath("//tbody/tr[1]/td[5]/input[1]");
    By shoppingCartTotalAmount = By.cssSelector(".product-subtotal");
    By shoppingCartTermsOfService = By.id("termsofservice");
    By shoppingCartCheckoutButton = By.id("checkout");

    public void verifyShoppingCartDisplayMessage() {
        String expectedMessage = "Shopping cart";
        String actualMessage = doGetTextFromElement(shoppingCartDisplayMessage);
        doVerifyElements(expectedMessage, actualMessage, "Shopping cart displayed incorrectly");
    }

    public String getAttributeFromQuantityField() {
        return doGetAttributeFromElement(shoppingCartDisplayQuantity, "value");
    }

    public void verifyShoppingCartQuantityMessage() {
        String expectedMessage = "2";
        String actualMessage = getAttributeFromQuantityField();
        doVerifyElements(expectedMessage, actualMessage, "Shopping cart quantity is displayed incorrectly");
    }

    public String getTextFromShoppingCartAmountTotal(){
        return doGetTextFromElement(shoppingCartTotalAmount);
    }

    public void verifyShoppingCartTotalAmount(){
        String expectedMessage = "$698.00";
        String actualMessage = getTextFromShoppingCartAmountTotal();
        doVerifyElements(expectedMessage, actualMessage, "Shopping cart amount is displayed incorrectly");
    }

    public void clickOnCheckBoxTermsOfService(){
        doClickOnElement(shoppingCartTermsOfService);
    }

    public void clickOnCheckout(){
        doClickOnElement(shoppingCartCheckoutButton);
    }

}
