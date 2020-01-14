package com.stopandshop.ui;

import com.stopandshop.ui.BaseUI;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class RegistrationTests extends BaseUI {
    String currentSignUpUrl;
    String currentNeedsCardUrl;
    String currentFlexApplicationUrl;


    @Test(dataProvider = "Registration", dataProviderClass = DataProviders.class)
    public void loyaltyCardRegistration(String password, String confirmPassword, String address, String city, String state, String zip, String store) {

        driver.findElement(Locators.LOYALTY_CARD_REGISTRATION).click();
        driver.findElement(Locators.BUTTON_NEEDS_THE_CARD).click();
        wait.until(ExpectedConditions.elementToBeClickable(Locators.TEXT_FIELD_FIRSTNAME));
        driver.findElement(Locators.TEXT_FIELD_FIRSTNAME).sendKeys(generateFirstName("dsfssd", 6));
        driver.findElement(Locators.TEXT_FIELD_LASTNAME).sendKeys(generateLastName("aasssd", 6));
        driver.findElement(Locators.TEXT_FIELD_EMAIL).sendKeys(generateEmail("gmail.com", 7));
        driver.findElement(Locators.TEXT_FIELD_PASSWORD).sendKeys(Data.passwordRegistration);
        driver.findElement(Locators.TEXT_FIELD_CONFIRM_PASSWORD).sendKeys(Data.confirmPassword);
        driver.findElement(Locators.TEXT_FIELD_ADDRESS).sendKeys(Data.address);
        driver.findElement(Locators.TEXT_FIELD_CITY).sendKeys(Data.city);
        driver.findElement(Locators.CHOOSE_THE_STATE_FIELD).click();
        driver.findElement(Locators.CHOOSE_MA).click();
        driver.findElement(Locators.TEXT_FIELD_ZIP).sendKeys(Data.zipCode);
        driver.findElement(Locators.TEXT_FIELD_PHONE).clear();
        driver.findElement(Locators.TEXT_FIELD_PHONE).sendKeys(generateNewNumber("", 10));
        driver.findElement(Locators.CHECKBOX_EMAIL_SUBSCRIPTIONS).click();
        driver.findElement(Locators.CHECKBOX_HOUSEHOLD_CARD_SHARING).click();
        //driver.findElement(By.id("checkbox-email-label")).click();
        //driver.findElement(By.id("checkbox-sharing-label")).click();
        driver.findElement(Locators.CHOOSE_A_STORE_LOCATION_ARROW);
        driver.findElement(Locators.CHOOSE_A_STORE_LOCATION_FIELD).click();
        driver.findElement(Locators.CHOOSE_KINGSTON_MA).click();
        driver.findElement(Locators.CHECK_BOX_AGREE_TERMS_AND_CONDITIONS_CLICK).click();
        driver.findElement(Locators.CHECK_BOX_AGREE_TERMS_AND_CONDITIONS).isSelected();
        driver.findElement(Locators.BUTTON_NEXT).click();
        //driver.findElement(com.stopandshop.ui.Locators.NEXT_BUTTON_REGISTRATION).click();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        //wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//a[@id ='skipBtn']"))));

        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//a[@id ='skipBtn']"))));
        //Assert.assertEquals(currentFlexApplicationUrl, com.stopandshop.ui.Data.expectedFlexApplicationUrl);
    }

    @Test
    public void registerUser() {
        mainPage.loyaltyUserRegistration();
    }

    @Test(dataProvider = "Registration", dataProviderClass = DataProviders.class)
    public void registerNewUSer(String firstName, String lastName, String passwordRegistration, String confirmPassword, String street, String city, String state,
                                String zipCode, String store) {
        mainPage.newUserNoCardRegistrationOne(firstName, lastName, mainPage.generateEmail("mailinator.com", 5), passwordRegistration, confirmPassword, street, city, state, zipCode);
        mainPage.newUserNoCardRegistrationTwo(mainPage.generateNewNumber("", 10), store);
    }

    @Test(dataProvider = "Registration2")
    public void registerNewUSer2(String firstName, String lastName, String passwordRegistration, String confirmPassword, String street, String city, String state,
                                 String zipCode, String store) {
        mainPage.newUserNoCardRegistrationOne(firstName, lastName, mainPage.generateEmail("mailinator.com", 5), passwordRegistration, confirmPassword, street, city, state, zipCode);
        mainPage.newUserNoCardRegistrationTwo(mainPage.generateNewNumber("", 10), store);
    }

}
//

//
//
//


//
//    public void ajaxClick(Select element){
//        WebDriverWait wait = new WebDriverWait(driver, 3);
//        JavascriptExecutor js = ((JavascriptExecutor) driver);
//        js.executeScript("arguments[0].scrollIntoView(true);", element);
//
//
//        //((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
//        wait.until(ExpectedConditions.elementToBeClickable(element));





