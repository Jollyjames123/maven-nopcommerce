package com.demo.nopcommerce.pages;

import org.openqa.selenium.By;

public class GiftCardsPage extends HomePage{
    By giftCardsMenu = By.partialLinkText("Gift Cards");

    public String getGiftCardsPageWelcomeText(){
        return doGetTextFromElement(giftCardsMenu);
    }
}
