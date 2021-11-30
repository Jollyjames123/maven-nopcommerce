package com.demo.nopcommerce.pages;

import org.openqa.selenium.By;

public class JewelleryPage extends HomePage{
    By jewelryMenu = By.partialLinkText("Jewelry");

    public String getJewelryPageText(){
        return doGetTextFromElement(jewelryMenu);
    }
}
