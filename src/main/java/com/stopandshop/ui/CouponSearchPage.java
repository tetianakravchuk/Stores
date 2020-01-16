package com.stopandshop.ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class CouponSearchPage extends BaseActions {
    public CouponSearchPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    //methods sort
    //methods filter
    //method search
    //method remove all
    //method click search arrow
    public void navigateToAvailableCoupons() {
        driver.findElement(Locators.LINK_SAVINGS).click();
        driver.findElement(Locators.LINK_DIGITAL_COUPONS).click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);


    }

    public void refineBarClick() {
        driver.findElement(Locators.REFINE_AVAILABLE_COUPONS).click();

    }

    public void sortOptionClick() {
        Select sortSelect = new Select((driver.findElement(By.name("group1"))));
        List<WebElement> sortCount = sortSelect.getOptions();
        int sortSize = sortCount.size();

        for (int i = 0; i < sortSize; i++) {
            String sValue = sortCount.get(i).getText();
            System.out.println(sValue);

        }


    }

    public void refineSortRedeemByDate() {
        //driver.findElement(By.xpath("//div[@class ='l-utility-bar-container has-filters']")).click();
        WebElement checkBox = driver.findElement(By.id("rb1"));
            checkBox.click();
            System.out.println(checkBox.isSelected());

        }
        //driver.findElement(Locators.SORT_REDEEM_BY_DATE).click();
        //isElementPresent(Locators.REDEEM_BY_DATE_LABEL);
        //assertTrue(isElementPresent(Locators.REDEEM_BY_DATE_LABEL);

    }


