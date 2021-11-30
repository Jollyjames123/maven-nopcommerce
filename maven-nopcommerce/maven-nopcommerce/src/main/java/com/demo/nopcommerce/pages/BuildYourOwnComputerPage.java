package com.demo.nopcommerce.pages;

import org.openqa.selenium.By;

public class BuildYourOwnComputerPage extends HomePage{

    By buildYourOwnComputerMessage = By.xpath("//h1[contains(text(),'Build your own computer')]");
    By processor = By.xpath("//select[@id='product_attribute_1']");
    By ram = By.id("product_attribute_2");
    By hdd = By.id("product_attribute_3_7");
    By os = By.id("product_attribute_4_9");
    By softwareBox2 = By.id("product_attribute_5_12");
    By actualTotal = By.xpath("//span[@id='price-value-1']");
    By addToCartButton = By.id("add-to-cart-button-1");
    By productAddedMessage = By.xpath("//p[text()='The product has been added to your ']");
    By closingBarButton = By.xpath("//span[@title='Close']");
    By shoppingCartOption = By.cssSelector(".cart-label");
    By goToCartButton = By.cssSelector(".button-1.cart-button");

    public String getTextFromBuildYourOwnComputerMessage() {
        return doGetTextFromElement(buildYourOwnComputerMessage);
    }

    public void verifyTheBuildYourOwnComputerMessage() {
        String expectedMessage = "Build your own computer";
        String actualMessage = getTextFromBuildYourOwnComputerMessage();
        doVerifyElements(expectedMessage, actualMessage, "Build your own computer Message is not displayed correctly");
    }

    public void selectGhzIntelPentiumDualCore(String visibleText) {
        doSelectByVisibleTextFromDropDown(processor, visibleText);
    }

    public void selectRamAs8Gb(int index) {
        doSelectByIndexFromDropDown(ram, index);
    }

    public void selectHDDRadio() {
        doClickOnElement(hdd);
    }

    public void selectOSRadioButton() {
        doClickOnElement(os);
    }

    public void clickOnTotalCommander() {
        doClickOnElement(softwareBox2);
    }

    public void waitForElementToBeVisible(int time){
        doWaitUntilVisibilityOfElementLocated(softwareBox2, time );
    }

    public String getTextFromActualTotal(){
        return doGetTextFromElement(actualTotal);
    }

    public void verifyTotalAmount(){
        String expectedTotal = "$1,475.00";
        String actualTotal = getTextFromActualTotal();
        doVerifyElements(expectedTotal, actualTotal, "Total is displayed incorrectly");
    }

    public void clickOnAddToCartButton(){
        doClickOnElement(addToCartButton);
    }

    public String getTextFromProductHasBeenAddedToYourShoppingCart(){
        return doGetTextFromElement(productAddedMessage);
    }

    public void verifyProductHasBeenAddedToYourShoppingCartMessage(){
        String expectedMessage = "The product has been added to your shopping cart";
        String actualMessage = getTextFromProductHasBeenAddedToYourShoppingCart();
        doVerifyElements(expectedMessage, actualMessage, "Message displayed incorrectly");
    }

    public void closeTheBarByClickingOnCrossButton(){
        doClickOnElement(closingBarButton);
    }

    public void mouseHoverOnShoppingCart(){
        doMouseHoverAction(shoppingCartOption);
    }

    public void clickOnGoToCartButton(){
        doClickOnElement(goToCartButton);
    }
}
