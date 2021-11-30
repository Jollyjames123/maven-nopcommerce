package com.demo.nopcommerce.pages;

import com.demo.nopcommerce.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class HomePage extends Utility {
    By topMenuNames = By.xpath("//ul[@class='top-menu notmobile']//li");
    By electronicsMenu = By.partialLinkText("Electronics");
    By cellPhones = By.xpath("//ul[@class='top-menu notmobile']//a[text()='Cell phones ']");
    By computerMenu = By.xpath("//ul[@class='top-menu notmobile']/child::li[1]");


    public List<WebElement> getTopMenuNames(String menu) {
        List<WebElement> names = driver.findElements(topMenuNames);
        return names;
    }

    public void mouseHoverOnElectronicsTabThenMouseHoverOnCellPhonesTabAndClick(){
        doMouseHoverAction(electronicsMenu);
        doMouseHoverAndClickAction(cellPhones);
    }

    public void verifyUrl() {
        String expectedUrl = "https://demo.nopcommerce.com/";
        String actualUrl = driver.getCurrentUrl();
        doVerifyElements(expectedUrl, actualUrl, "The URL is displayed incorrectly");

    }

    public void clickOnComputerMenu(){
        doClickOnElement(computerMenu);
    }


}
