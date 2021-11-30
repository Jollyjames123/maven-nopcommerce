package com.demo.nopcommerce.pages;

import org.openqa.selenium.By;

public class DigitalDownloadsPage extends HomePage{
    By digitalDownloadsMenu = By.partialLinkText("Digital downloads");

    public String getDigitalDownloadsPageWelcomeText(){
        return doGetTextFromElement(digitalDownloadsMenu);
    }
}
