package com.demo.nopcommerce.utility;

import com.demo.nopcommerce.drivermanager.DriverManager;
import net.bytebuddy.utility.RandomString;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;
import java.util.Random;

public class Utility extends DriverManager {
    public WebElement doWaitUntilVisibilityOfElementLocated(By by, int time ){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(time));
        return wait.until(ExpectedConditions.visibilityOfElementLocated(by));
    }

    public String doGetAttributeFromElement(By by, String attribute){
        return driver.findElement(by).getAttribute(attribute);

    }
    public String doRandomEmailGenerator() {
        String chars = "abcdefghijklmnopqrstuvwxyz1234567890";
        StringBuilder email = new StringBuilder();
        Random randomEmail = new Random();
        while (email.length() < 10) {
            int index = (int) (randomEmail.nextFloat() * chars.length());
            email.append(chars.charAt(index));
        }
        String saltStr = (email.toString() + "@gmail.com");
        return saltStr;
    }


    public void doVerifyElements(String expectedMessage, String actualMessage, String displayMessage) {
        Assert.assertEquals(displayMessage, expectedMessage, actualMessage);
    }
    /**
     * This method will find the element and clear all the data from it
     *
     * @param by
     */
    public void doFindElementAndClearText(By by) {
        WebElement loginlink = driver.findElement(by);
        loginlink.clear();
    }

    /**
     * this method will click on element
     *
     * @param by
     */
    public void doClickOnElement(By by) {
        WebElement loginLink = driver.findElement(by);
        loginLink.click();
    }

    /**
     * This method will get text from element
     *
     * @param by
     * @return
     */
    public String doGetTextFromElement(By by) {
        return driver.findElement(by).getText();
        /*WebElement message = driver.findElement(by);
        String actualMessage = message.getText();
        return actualMessage;*/
    }

    /**
     * This method will send text on element
     *
     * @param by
     * @param text
     */

    public void doSendTextToElement(By by, String text) {
        driver.findElement(by).sendKeys(text);
        //WebElement emailField = driver.findElement(by);//finding email field
        //emailField.sendKeys(text);//entering email
    }


    /**
     * This method will switch to an Alert from main window and
     * click on the 'OK' button of the alert(accept the alert)
     */
    public void doSwitchToAndAcceptAlert() {
        //driver.switchTo().alert().accept();
        Alert alert = driver.switchTo().alert();
        alert.accept();
    }

    /**
     * This method will switch to an alert from main window and
     * click on the 'Cancel' button of the alert
     */

    public void doSwitchToAndDismissAlert() {
        driver.switchTo().alert().dismiss();
    }

    /**
     * This method will switch to an alert from main window and capture text from it
     *
     * @return - String
     */

    public String doGetTextFromAlert() {
        Alert alert = driver.switchTo().alert();
        String alertMessage = alert.getText();
        return alertMessage;
    }

    /**
     * This method will send some String data to the alert box
     *
     * @param textToSend
     */
    public void doSendTextToAlert(String textToSend) {
        driver.switchTo().alert().sendKeys(textToSend);
    }

    /**
     * @param by
     * @param text
     */
    public void doSelectByVisibleTextFromDropDown(By by, String text) {
        WebElement dropDownOption = driver.findElement(by);
        Select select = new Select(dropDownOption);
        select.selectByVisibleText(text);
    }

    /**
     * This method selects the option whose value matches the specified parameter
     *
     * @param by
     * @param value
     */
    public void doSelectByValueFromDropDown(By by, String value) {
        WebElement dropDownOption = driver.findElement(by);
        Select select = new Select(dropDownOption);
        select.selectByValue(value);
    }

    /**
     * @param by
     * @param indexNum
     */
    public void doSelectByIndexFromDropDown(By by, int indexNum) {
        WebElement dropDownOption = driver.findElement(by); //locating the element
        Select select = new Select(dropDownOption); //obj creation
        //select by index
        select.selectByIndex(indexNum);
    }

    /**
     *
     * @param by
     * @param name
     */
    public void doSelectFromAllOptionsAndPrint(By by, String name) {
        //WebElement dropDownOption = driver.findElement(by);
        Select optionsSelect = new Select(driver.findElement(by));
        List<WebElement> allOptions = optionsSelect.getOptions();
        System.out.println(allOptions.size()); //number of countries in the list(dropdown)
        for (WebElement option : allOptions) {
            System.out.println(option.getText()); //prints text from allOptions
            if (option.getText().equalsIgnoreCase(name)) {
                option.click(); //choosing one option
            }
        }
    }

    /**
     * This method performs click and hold at the source location, moves to target location
     * and then releases the mouse
     * @param source
     * @param target
     */
    public void doDragAndDrop(By source, By target){
        Actions builder = new Actions(driver);
        WebElement draggable = driver.findElement(source);
        WebElement droppable = draggable.findElement(target);
        builder.dragAndDrop(draggable, droppable).build().perform();
    }

    /**
     * This method will perform mouse hover action
     *
     * @param by
     */

    public void doMouseHoverAction(By by) {
        Actions actions = new Actions(driver);
        WebElement hover = driver.findElement(by);
        actions.moveToElement(hover).build().perform();
    }

    /**
     * This method will perform mouse hover and click action
     *
     * @param by
     */

    public void doMouseHoverAndClickAction(By by) {
        Actions actions = new Actions(driver);
        WebElement hover = driver.findElement(by);
        actions.moveToElement(hover).click().build().perform();
    }
    public void doMouseHoverOnFirstThenSecondAndClick(By by1, By by2){
        Actions actions = new Actions(driver);
        WebElement hover1 = driver.findElement(by1);
        WebElement hover2 = driver.findElement(by2);
        actions.moveToElement(hover1).moveToElement(hover2).click().build().perform();

    }

    /**
     * This method will perform mouse right click action
     *
     * @param by
     */
    public void doMouseRightClickAction(By by) {
        Actions actions = new Actions(driver);
        WebElement button = driver.findElement(by);
        actions.contextClick().build().perform();
    }

    /**
     * This method will perform mouse slider action based on x and y value
     *
     * @param by
     * @param x
     * @param y
     */
    public void doSliderAction(By by, int x, int y) {
        Actions actions = new Actions(driver);
        WebElement slider = driver.findElement(by);
        actions.dragAndDropBy(slider, x, y).build().perform();
    }

      /**
    //  *
    // * @param displayErrorMessage
    //* @param expectedMessage
    //* @param by(actual message)
    //  */
       public void doAssertToVerifyElements(String displayErrorMessage, String expectedMessage, By by){
         String actualMessage = doGetTextFromElement(by);
        Assert.assertEquals(displayErrorMessage, expectedMessage, actualMessage);
    }

    //Random String Generation Method to use for email - emailString()+"gmail.com"
    public String emailString() {

        RandomString random = new RandomString(10);
        String randomString = random.nextString();
        return randomString;

    }

    /**
     * this method will click on element
     *
     * @param by
     */
    public void clickOnElement(By by) {
        WebElement loginLink = driver.findElement(by);
        loginLink.click();
    }

    /**
     * This method will get text from element
     *
     * @param by
     * @return
     */
    public String getTextFromElement(By by) {
        return driver.findElement(by).getText();
        /*WebElement message = driver.findElement(by);
        String actualMessage = message.getText();
        return actualMessage;*/
    }

    /**
     * This method will send text on element
     *
     * @param by
     * @param text
     */

    public void sendTextToElement(By by, String text) {
        driver.findElement(by).sendKeys(text);
        //WebElement emailField = driver.findElement(by);//finding email field
        //emailField.sendKeys(text);//entering email
    }

    public void acceptAlert() {
        Alert alert = driver.switchTo().alert();
        alert.accept();
    }

    public void dismissAlert() {
        Alert alert = driver.switchTo().alert();
        alert.dismiss();
    }

    public String getTextFromAlert() {
        Alert alert = driver.switchTo().alert();
        String alertMessage = alert.getText();
        return alertMessage;
    }

    public void selectByVisibleTextFromDropDown(By by, String text) {
        WebElement dropDown = driver.findElement(by);
        Select select = new Select(dropDown);
        select.selectByVisibleText(text);
    }

    public void selectByIndex(By by, int indexNum) {
        WebElement dropDown = driver.findElement(by); //locating the element
        Select select = new Select(dropDown); //obj creation
        //select by value
        select.selectByIndex(indexNum);
    }

    public void selectFromAllOptions(By by, String name) {
        WebElement dropDown = driver.findElement(by);
        Select select = new Select(dropDown);
        List<WebElement> allOptions = select.getOptions();
        System.out.println(allOptions.size()); //number of countries in the list(dropdown)
        for (WebElement option : allOptions) {
            System.out.println(option.getText());
            if (option.getText().equalsIgnoreCase(name)) {
                option.click();
            }
        }
    }
    public void usingAssertMethod(String displayMessage, By by, String expectedMessage){
        String actualMessage = getTextFromElement(by);
    }

}
