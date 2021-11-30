package com.demo.nopcommerce.pages;

import org.openqa.selenium.By;

public class CellPhonesListViewPage extends HomePage{
    By nokiaLumia1020 = By.cssSelector("div.master-wrapper-page:nth-child(6) div.master-wrapper-content div.master-column-wrapper div.center-2 div.page.category-page div.page-body div.products-container div.products-wrapper div.product-list div.item-grid div.item-box:nth-child(3) div.product-item div.details h2.product-title > a:nth-child(1)");

    public void clickOnNokiaLumiaLink() {
        doClickOnElement(nokiaLumia1020);
    }
}
