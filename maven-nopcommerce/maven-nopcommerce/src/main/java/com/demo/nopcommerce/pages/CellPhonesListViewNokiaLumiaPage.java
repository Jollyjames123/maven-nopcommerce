package com.demo.nopcommerce.pages;

import org.openqa.selenium.By;

public class CellPhonesListViewNokiaLumiaPage extends HomePage{
    By nokiaLumia1020DisplayText =By.xpath("//h1[contains(text(),'Nokia Lumia 1020')]");
    By nokiaLumia1020Price = By.xpath("//span[@id='price-value-20']");
    By nokiaLumia1020OldQuantity = By.id("product_enteredQuantity_20");
    By nokiaLumiaAddToCartButton = By.id("add-to-cart-button-20");
    By nokiaLumiaAddToCartGreenMessage = By.xpath("//p[@class='content']");
    By nokiaLumiaMessageClosingCrossButton = By.cssSelector("span[title='Close']");
    By nokiaLumiaShoppingCartButton = By.xpath("//span[text()='Shopping cart']");
    By nokiaLumiaShoppingCartButtonsGoToCartOption = By.xpath("//button[text()='Go to cart']");

    public String getTextFromNokiaLumiaDisplayText(){
        return doGetTextFromElement(nokiaLumia1020DisplayText);
    }

    public void verifyTheTextNokiaLumia(){
        String expectedMessage = "Nokia Lumia 1020";
        String actualMessage = getTextFromNokiaLumiaDisplayText();
        doVerifyElements(expectedMessage, actualMessage, "Nokia Lumia text is displayed incorrectly");
    }

    public String getTextFromNokiaLumiaPrice(){
        return doGetTextFromElement(nokiaLumia1020Price);
    }

    public void verifyNokiaLumiaPriceIsDisplayedCorrectly(){
        String expectedMessage = "$349.00";
        String actualMessage = getTextFromNokiaLumiaPrice();
        doVerifyElements(expectedMessage, actualMessage, "Nokia Lumia Price is displayed incorrectly");
    }

    public void clearTextFromTheNokiaLumiaQuantityField(){
        doFindElementAndClearText(nokiaLumia1020OldQuantity);
    }

    public void inputUpdatedQuantityForNokiaLumia1020(String quantity){
        doSendTextToElement(nokiaLumia1020OldQuantity, quantity);
    }

    public void clickOnNokiaLumiaAddToCartButton(){
        doClickOnElement(nokiaLumiaAddToCartButton);
    }

    public void verifyTheNokiaLumiaProductAddedToCartMessage(){
        String expectedMessage = "The product has been added to your shopping cart";
        String actualMessage = doGetTextFromElement(nokiaLumiaAddToCartGreenMessage);
        doVerifyElements(expectedMessage, actualMessage, "Add to Cart Message is not displayed correctly");
    }

    public void closeTheGreenBarByClickingTheCrossButton(){
        doClickOnElement(nokiaLumiaMessageClosingCrossButton);
    }

    public void mouseHoverOnNokiaLumiaShoppingCartButton(){
        doMouseHoverAction(nokiaLumiaShoppingCartButton);
    }

    public void clickOnNokiaLumiaGoToCartButton(){
        doClickOnElement(nokiaLumiaShoppingCartButtonsGoToCartOption);
    }
}
