package com.demo.nopcommerce.pages;

import com.demo.nopcommerce.utility.Utility;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DesktopPage extends Utility {

    By sortByZToA = By.xpath("//select[@id='products-orderby']");
    By sortByAToZ = By.xpath("//select[@id='products-orderby']");
    By sortBox = By.xpath("//h2[@class='product-title']");
    By addToCart = By.xpath("(//button[@type='button'][normalize-space()='Add to cart'])[1]");

    public void selectSortByZToAFromDropDownMenu(String option) {
        doSelectByVisibleTextFromDropDown(sortByZToA, option);
    }
    public void selectSortByAToZFromDropDownMenu(String option) {
        doSelectByVisibleTextFromDropDown(sortByAToZ, option);
    }

    public void verifyProductsArrangedInAlphabeticallyDescendingOrder() throws InterruptedException {
        List<WebElement> originalList = driver.findElements(sortBox);
        List<String> originalProductNameList = new ArrayList<>();
        for (WebElement product : originalList) {
            originalProductNameList.add(product.getText());
        }
        Collections.sort(originalProductNameList, Collections.reverseOrder());
        Thread.sleep(2500);

        List<WebElement> afterSortingList = driver.findElements(By.xpath("//h2[@class='product-title']"));
        List<String> afterSortingProductName = new ArrayList<>();
        for (WebElement product1 : afterSortingList) {
            afterSortingProductName.add(product1.getText());
        }
        Assert.assertEquals("Product not sorted", originalProductNameList, afterSortingProductName);
    }

    public void clickOnAddToCartForBuildYourOwnComputer(){
        doClickOnElement(addToCart);
    }
}
