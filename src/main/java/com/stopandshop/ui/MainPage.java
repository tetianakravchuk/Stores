package com.stopandshop.ui;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class MainPage extends BaseActions {
    public MainPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    String currentMainPageURL;


    public void getToCateringPage() {
        driver.findElement(Locators.LINK_SHOP).click();
        driver.findElement(Locators.LINK_SHOP_CATERING).click();

    }
    public void javaWait(int ms){
        System.out.println("Child!!!");
        try {
            Thread.sleep(ms);
        } catch (InterruptedException e){
            e.printStackTrace();
        }
    }

    public void getToRewardsAndProgramPage() {
        driver.findElement(Locators.LINK_SAVINGS).click();
        driver.findElement(Locators.LINK_REWARDS_AND_PROGRAM).click();
    }

    public static String generateNewNumber(String name, int length) {

        return name + RandomStringUtils.random(length, "1729847579");
    }

    public static String generateMobileNumber2(String domain, int length) {

        return RandomStringUtils.random(length, "172984757");
    }


    public static String generateEmail(String domain, int length) {
        return RandomStringUtils.random(length, "abcdefghijklmnopqrstuvwxyz") + "@" + domain;
    }

    public void generateCellPhoneNumber(String name) {
        String randomNumbers = RandomStringUtils.randomNumeric(7);
        String phNo = 978 + randomNumbers;


    }


    public static String generateFirstName(String domain, int length) {
        return RandomStringUtils.random(length, "abcdefghijklmnopqrstuvwxyz");
    }

    public static String generateLastName(String domain, int length) {
        return RandomStringUtils.random(length, "abcdefghijklmnopqrstuvwxyz");
    }

    public void loyaltyUserRegistration() {
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
        //driver.findElement(com.stopandshop.ui.Locators.TEXT_FIELD_PHONE).sendKeys(com.stopandshop.ui.Data.phone);
        driver.findElement(Locators.TEXT_FIELD_PHONE).sendKeys(Data.phone);
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

    public void newUserNoCardRegistrationOne(String firstName, String lastName, String email, String password, String confirmPassword, String street, String city, String state, String zip) {
        driver.findElement(Locators.LOYALTY_CARD_REGISTRATION).click();
        driver.findElement(Locators.BUTTON_NEEDS_THE_CARD).click();
        wait.until(ExpectedConditions.elementToBeClickable(Locators.TEXT_FIELD_FIRSTNAME));
        driver.findElement(Locators.TEXT_FIELD_FIRSTNAME).sendKeys(firstName);
        driver.findElement(Locators.TEXT_FIELD_LASTNAME).sendKeys(lastName);
        driver.findElement(Locators.TEXT_FIELD_EMAIL).sendKeys(email);
        driver.findElement(Locators.TEXT_FIELD_PASSWORD).sendKeys(password);
        driver.findElement(Locators.TEXT_FIELD_CONFIRM_PASSWORD).sendKeys(confirmPassword);
        driver.findElement(Locators.TEXT_FIELD_ADDRESS).sendKeys(street);
        driver.findElement(Locators.TEXT_FIELD_CITY).sendKeys(city);

        driver.findElement(Locators.CHOOSE_THE_STATE_FIELD).click();
        clickValueOfList(Locators.CHOOSE_MA, state);

        driver.findElement(Locators.TEXT_FIELD_ZIP).sendKeys(zip);
        //Assert.assertEquals(currentFlexApplicationUrl, com.stopandshop.ui.Data.expectedFlexApplicationUrl);
    }

    public void newUserNoCardRegistrationTwo(String mobileNumber, String store) {
        driver.findElement(Locators.TEXT_FIELD_PHONE).clear();
        driver.findElement(Locators.TEXT_FIELD_PHONE).sendKeys(mobileNumber);
        driver.findElement(Locators.CHECKBOX_EMAIL_SUBSCRIPTIONS).click();
        driver.findElement(Locators.CHECKBOX_HOUSEHOLD_CARD_SHARING).click();
        driver.findElement(Locators.CHOOSE_A_STORE_LOCATION_ARROW);
        driver.findElement(Locators.CHOOSE_A_STORE_LOCATION_FIELD).click();
        clickValueOfList(Locators.CHOOSE_KINGSTON_MA, store);
        driver.findElement(Locators.CHECK_BOX_AGREE_TERMS_AND_CONDITIONS_CLICK).click();
        driver.findElement(Locators.CHECK_BOX_AGREE_TERMS_AND_CONDITIONS).isSelected();
        driver.findElement(Locators.BUTTON_NEXT).click();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//a[@id ='skipBtn']"))));

    }

}



