package com.stopandshop.ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class ShoppingListPage extends BaseActions {
    public ShoppingListPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    String currentShoppingListPage;

    public void clickCouponSignIn() {
        driver.findElement(Locators.COUPONS_PLUS_CLICK_ONE).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    public void clickIfVisible() {
        //driver.get("https://stopandshop.com/");
        if (driver.findElement(Locators.VIEW_ALL_COUPONS_HOME_PAGE).isDisplayed()) {

            System.out.println("Element is Present");
            driver.findElement(Locators.VIEW_ALL_COUPONS_HOME_PAGE).click();
            //driver.findElement(com.stopandshop.ui.Locators.COUPONS_LOAD_TO_CARD_ONE).click();
            //driver.findElement(com.stopandshop.ui.Locators.YES_AUTOMATICALLY_ADD).click();
            //driver.findElement(com.stopandshop.ui.Locators.COUPONS_LOAD_TO_CARD_TWO).click();
            //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            //driver.findElement(com.stopandshop.ui.Locators.USERNAME_SIGN_IN_POPUP_WINDOW).sendKeys(com.stopandshop.ui.Data.email);
            //driver.findElement(com.stopandshop.ui.Locators.PASSWORD_SIGN_IN_POPUP_WINDOW).sendKeys(com.stopandshop.ui.Data.password);
            //driver.findElement(com.stopandshop.ui.Locators.SIGN_IN_POPUP_WINDOW).click();
        } else {

            driver.findElement(Locators.COUPONS_PLUS_CLICK_ONE).click();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            driver.findElement(Locators.USERNAME_SIGN_IN_POPUP_WINDOW).sendKeys(Data.email);
            driver.findElement(Locators.PASSWORD_SIGN_IN_POPUP_WINDOW).sendKeys(Data.password);
            driver.findElement(Locators.SIGN_IN_POPUP_WINDOW).click();
            driver.findElement(Locators.VIEW_ALL_COUPONS_HOME_PAGE).click();
        }


    }

    public void getToShoppingList() {
        driver.findElement(Locators.BUTTON_SIGN_IN_UNLOCK).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(Locators.USERNAME_SIGN_IN_POPUP_WINDOW).sendKeys(Data.email);
        driver.findElement(Locators.PASSWORD_SIGN_IN_POPUP_WINDOW).sendKeys(Data.password);
        driver.findElement(Locators.SIGN_IN_POPUP_WINDOW).click();
        driver.navigate().refresh();
        driver.findElement(Locators.SHOPPING_LIST_HOME_PAGE).click();


    }

    public void addFavoritesType() {
        driver.findElement(Locators.SHOPPING_LIST_FAVORITES_BUTTON).click();
        driver.findElement(Locators.SHOPPING_LIST_FAVORITES_FIELD).click();
        WebElement addItemField = driver.findElement(Locators.SHOPPING_LIST_FAVORITES_FIELD);
        addItemField.click();
        WebElement itemOne = driver.findElement(By.id("new-favorite-input"));
        itemOne.click();
        itemOne.sendKeys("OneOne");
        driver.findElement(Locators.SHOPPING_LIST_FAVORITES_ADD_BUTTON).click();


    }

    public void addHundredFavoritesType(int X) {
        for (int i = 0; i < X; i++) {
            WebElement addItemField = driver.findElement(Locators.SHOPPING_LIST_FAVORITES_FIELD);
            addItemField.click();
            WebElement itemOne = driver.findElement(By.id("new-favorite-input"));
            itemOne.click();
            itemOne.sendKeys("Item " + i);
            driver.findElement(Locators.SHOPPING_LIST_FAVORITES_ADD_BUTTON).click();


        }

    }

    public void addFavoritesToShoppingList(){
        driver.findElement(Locators.SHOPPING_LIST_FAVORITES_BUTTON).click();
        driver.findElement(Locators.SHOPPING_LIST_FAVORITES_FIELD).click();
        WebElement addItemField = driver.findElement(Locators.SHOPPING_LIST_FAVORITES_FIELD);
        addItemField.click();
        WebElement itemOne = driver.findElement(By.id("new-favorite-input"));
        itemOne.click();
        itemOne.sendKeys("OneTwo");
        driver.findElement(Locators.SHOPPING_LIST_FAVORITES_ADD_BUTTON).click();
        driver.findElement(Locators.FAVORITES_ADD_TO_SHOPPING_LIST).click();


    }

    public  void clearAllFavorites(){
        driver.findElement(Locators.SHOPPING_LIST_FAVORITES_BUTTON).click();
        driver.findElement(Locators.FAVORITES_EDIT_LINK).click();
        List<WebElement> allElementsBuckets = driver.findElements(Locators.FAVORITES_REMOVE_BUCKET);
        for (WebElement items : allElementsBuckets){
            items.click();
        }

    }

    public void addToShoppingListType() throws InterruptedException {

        WebElement shopListItem = driver.findElement(By.xpath("//input[@id ='new-list-item']"));
        shopListItem.click();
        shopListItem.sendKeys("ShopOne");
        driver.findElement(By.xpath("//input[@id ='new-list-item-button']")).click();
        Thread.sleep(3000);

    }

    public void addHundredToShoppingList(int X) throws InterruptedException {
        for (int i = 0; i < X; i++) {
            WebElement shopListItem = driver.findElement(By.xpath("//input[@id ='new-list-item']"));
            shopListItem.click();
            shopListItem.sendKeys("ShopTwo " + i);
            driver.findElement(By.id("new-list-item-button")).submit();
            Thread.sleep(2000);




        }

    }

    public void clearTheShoppingList(){
        driver.findElement(By.xpath("//button[@id = 'list-menu-option8']")).click();
        driver.findElement(By.xpath("//button[@class= 'a-button -purple l-button-buddies__button js-confirm-remove qa-confirm-remove']")).click();


    }

    public void addLoadedCouponsTOShoppingList() throws InterruptedException {
        driver.findElement(Locators.BUTTON_SIGN_IN_UNLOCK).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(Locators.USERNAME_SIGN_IN_POPUP_WINDOW).sendKeys(Data.email);
        driver.findElement(Locators.PASSWORD_SIGN_IN_POPUP_WINDOW).sendKeys(Data.password);
        driver.findElement(Locators.SIGN_IN_POPUP_WINDOW).click();
        driver.navigate().refresh();
        driver.findElement(By.xpath("//a[@id ='primary-nav-savings']")).click();
        driver.findElement(By.xpath("//li[@class ='c-buckets__item']//a[@href='/coupons-weekly-circular/digital-coupons']")).click();
        Thread.sleep(1000);

        driver.findElement(By.xpath("//div[@class ='c-tabs__item']//div[@class ='c-tabs__text h-bold h-center']")).click();
        List <WebElement> allLoadedCoupons = driver.findElements(By.xpath("//button[@class= 'js-list-add a-font-size-14 h-bold h-purple']"));
        int size = allLoadedCoupons.size();
        System.out.println("Size of the list = " + size);
        for(WebElement items : allLoadedCoupons){
            items.click();
            Thread.sleep(2000);
        }
        allLoadedCoupons.size();
        System.out.println("Size of the list after " + size);



    }







}
