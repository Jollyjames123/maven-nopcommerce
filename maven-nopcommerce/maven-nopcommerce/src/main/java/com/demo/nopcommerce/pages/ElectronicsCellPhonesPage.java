package com.demo.nopcommerce.pages;

import org.openqa.selenium.By;

public class ElectronicsCellPhonesPage extends HomePage{
    By cellPhonesPageText = By.xpath("//h1[contains(text(),'Cell phones')]");
    By listViewTab = By.xpath("//a[contains(text(),'List')]");

    public String getCellPhonesPageWelcomeText(){

        return doGetTextFromElement(cellPhonesPageText);
    }

    public void verifyCellPhonePageWelcomeTextIsDisplayedCorrectly(){
        String expectedMessage = "Cell phones";
        String actualMessage = getCellPhonesPageWelcomeText();
        doVerifyElements(expectedMessage, actualMessage, "Cell phones page is not displayed correctly");
    }

    public void clickOnTheListViewTab(){
        doClickOnElement(listViewTab);
    }

}
