package com.demo.nopcommerce.pages;

public class ElectronicsPage extends HomePage{
    public String getElectronicsPageWelcomeText(){

        return doGetTextFromElement(electronicsMenu);
    }
}
