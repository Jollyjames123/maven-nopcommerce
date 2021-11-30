package com.demo.nopcommerce.testsuite;

import com.demo.nopcommerce.pages.*;
import com.demo.nopcommerce.testbase.TestBase;
import org.testng.annotations.Test;

public class ElectronicsTest extends TestBase {
    HomePage homePage = new HomePage();
    ElectronicsCellPhonesPage electronicsCellPhonesPage = new ElectronicsCellPhonesPage();
    CellPhonesListViewPage cellPhonesListViewPage = new CellPhonesListViewPage();
    CellPhonesListViewNokiaLumiaPage cellPhonesListViewNokiaLumiaPage = new CellPhonesListViewNokiaLumiaPage();
    CellPhonesListViewNokiaLumiaShoppingCartPage shoppingCartPage = new CellPhonesListViewNokiaLumiaShoppingCartPage();
    SignInPage signInPage = new SignInPage();
    RegistrationPage register = new RegistrationPage();
    RegistrationCompletePage registrationComplete = new RegistrationCompletePage();
    ShoppingCartPage shoppingCart = new ShoppingCartPage();
    CheckoutPage checkoutPage = new CheckoutPage();
    ShippingOptionCheckoutPage shippingOption = new ShippingOptionCheckoutPage();
    PaymentMethodPage paymentMethod = new PaymentMethodPage();
    PaymentInfoPage paymentInfo = new PaymentInfoPage();
    ConfirmOrderPage confirmOrder = new ConfirmOrderPage();
    CheckoutCompletedPage checkoutComplete = new CheckoutCompletedPage();
    WelcomeToOurStorePage welcomePage = new WelcomeToOurStorePage();


    @Test
    public void verifyUserShouldNavigateToCellPhonesPageSuccessfully() {

        /*Mouse Hover on “Electronics” Tab, Mouse Hover on “Cell phones” and click
        Verify the text “Cell phones”*/
        homePage.mouseHoverOnElectronicsTabThenMouseHoverOnCellPhonesTabAndClick();
        electronicsCellPhonesPage.verifyCellPhonePageWelcomeTextIsDisplayedCorrectly();
    }

    @Test
    public void verifyThatTheProductAddedSuccessfullyAndPlaceOrderSuccessfully() {

        verifyUserShouldNavigateToCellPhonesPageSuccessfully();
        electronicsCellPhonesPage.clickOnTheListViewTab();

        cellPhonesListViewPage.clickOnNokiaLumiaLink();

        cellPhonesListViewNokiaLumiaPage.verifyTheTextNokiaLumia();
        cellPhonesListViewNokiaLumiaPage.verifyNokiaLumiaPriceIsDisplayedCorrectly();
        cellPhonesListViewNokiaLumiaPage.clearTextFromTheNokiaLumiaQuantityField();
        cellPhonesListViewNokiaLumiaPage.inputUpdatedQuantityForNokiaLumia1020("2");
        cellPhonesListViewNokiaLumiaPage.clickOnNokiaLumiaAddToCartButton();
        cellPhonesListViewNokiaLumiaPage.verifyTheNokiaLumiaProductAddedToCartMessage();
        cellPhonesListViewNokiaLumiaPage.closeTheGreenBarByClickingTheCrossButton();
        cellPhonesListViewNokiaLumiaPage.mouseHoverOnNokiaLumiaShoppingCartButton();
        cellPhonesListViewNokiaLumiaPage.clickOnNokiaLumiaGoToCartButton();

        shoppingCartPage.verifyShoppingCartDisplayMessage();
        shoppingCartPage.verifyShoppingCartQuantityMessage();
        shoppingCartPage.verifyShoppingCartTotalAmount();
        shoppingCartPage.clickOnCheckBoxTermsOfService();
        shoppingCartPage.clickOnCheckout();

        signInPage.verifyTheSignInDisplayMessage();
        signInPage.clickOnRegisterTab();

        register.verifyTheRegisterDisplayMessage();
        register.enterFirstName("Jolly");
        register.enterLastName("James");
        register.enterEmail();
        register.enterPassword("asdfgh");
        register.enterConfirmPassword("asdfgh");
        register.clickOnRegisterButton();

        registrationComplete.verifyTheRegisterationCompleteMessage();
        registrationComplete.clickOnTheContinueButton();

        shoppingCart.verifyTheShoppingCartDisplayMessage();
        shoppingCart.clickOnTermsAndConditionsAgreeBox();
        shoppingCart.clickOnCheckoutButton();

        checkoutPage.selectDataFromCountryDropDown(5);
        checkoutPage.enterDataInTheCityField("London");
        checkoutPage.enterDataInTheAddress1Field("999 Prime Road");
        checkoutPage.enterDataInTheZipPostalCodeField("LL5 5LU");
        checkoutPage.enterDataInTheMobileNumberField("07905698312");
        checkoutPage.clickOnContinueButton();

        shippingOption.clickOnButton2ndDayAir();
        shippingOption.clickOnContinueButton();

        paymentMethod.clickOnCreditCardRadioButton();
        paymentMethod.clickOnContinueButton();

        paymentInfo.selectCreditCardType(0);
        paymentInfo.inputCardHoldersName("Jolly James");
        paymentInfo.inputCardNumber("4700 1234 5678 7840");
        paymentInfo.inputExpireMonth("01");
        paymentInfo.inputExpireYear("2022");
        paymentInfo.inputCardCode("999");
        paymentInfo.clickOnContinueButton();

        confirmOrder.verifyPaymentMethodOption("Credit Card");
        confirmOrder.verifyShippingMethodOption("2nd Day Air");
        confirmOrder.verifyTotalAmountField("$698.00");
        confirmOrder.clickOnConfirmButton();

        checkoutComplete.verifyThankYouMessage();
        checkoutComplete.verifyOrderProcessedSuccessfullyMessage();
        checkoutComplete.clickOnContinueButton();

        welcomePage.verifyTheWelcomeToStoreDisplayMessage();
        welcomePage.clickOnLogOutLink();

        homePage.verifyUrl();
    }
}
