package com.stopandshop.ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.util.List;

public class SearchCouponsTests extends BaseUI {

    String currentAvailableCouponsUrl;


    @Test
    public void redeemByDate() {
        couponSearchPage.navigateToAvailableCoupons();
        couponSearchPage.refineBarClick();
        //driver.findElement(By.xpath("//div[@class = 'c-sort-filter c-sort-filter--min-300 is-open']")).click();
        // driver.findElement(By.xpath("//div[@class = 'l-utility-bar-row--bottom__group1']")).click();
        // Checking if a radio button/checkbox is displayed
        driver.findElement(By.name("group1")).isDisplayed();
        // Checking if a radio button/checkbox is enabled so that it can be selected
        WebElement checkBoxList = driver.findElement(By.name("group1"));
        System.out.println("Is checkbox displayed? " + checkBoxList.isDisplayed());
        // Check if checkBox is enabled to select

       // if (checkBox.isEnabled()) {
            // Check if enabled
            //checkBox.click();
       // } else {
            // Print message to console if disabled
           // System.out.println("Unable to select the checkbox");
       // }
        // Number of radio buttons in the list
        List <WebElement> radioButtonList = driver.findElements(By.tagName("input"));
        //System.out.println(radioButton.size());
        //int a = driver.findElements(By.xpath("//input[@id ='rb1']")).size();
        //System.out.println(a);
        // Loops through all checkbox elements
        for (int i = 0; i < radioButtonList.size() ; i++) {
            // Checking if the checkbox is a "Redeem by Date" or "Brand"
            if ((radioButtonList.get(i).getAttribute("value").trim()
            .equalsIgnoreCase("Brand"))
                ||((radioButtonList.get(i).getAttribute("value").trim()
                    .equalsIgnoreCase("Redeem by Date"))))
            {
                // Print selection status to console
                System.out.println("BEFORE: Is "
                + radioButtonList.get(i).getAttribute("value") + " selected? "
                + radioButtonList.get(i).isSelected());
                //Check is the checkbox is selected
                if (!(radioButtonList.get(i).isSelected())) {
                    //Click the checkbox
                    radioButtonList.get(i).click();
                    System.out.println("AFTER: Is "
                            + radioButtonList.get(i).getAttribute("value") + " selected? "
                            + radioButtonList.get(i).isSelected());
                } else {
                    // Uncheck the checkbox
                    radioButtonList.get(i).click();
                    System.out.println(" AFTER: Is "
                            + radioButtonList.get(i).getAttribute("value") + " selected? "
                            + radioButtonList.get(i).isSelected());
                }
                System.out.println("Next ...");
            }

        }}

@Test
    public void checkBoxSelect(){
    couponSearchPage.navigateToAvailableCoupons();
    couponSearchPage.refineBarClick();
    driver.findElement(By.name("group1")).isDisplayed();
    WebElement checkBoxList = driver.findElement(By.name("group1"));
    System.out.println("Is checkbox displayed? " + checkBoxList.isDisplayed());
    //couponSearchPage.clickRedeemByDate(By.xpath("(//div[@class ='c-radio'])[1]"));
   // driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    WebElement redeemDate = driver.findElement(By.xpath("(//div[@class ='c-radio'])[1]"));
    //couponSearchPage.clickRedeemByDate(redeemDate);
    Actions action = new Actions(driver);
    action.moveToElement(redeemDate).click().perform();

    WebElement valueLowHigh = driver.findElement(By.xpath("(//div[@class ='c-radio'])[2]"));
    Actions action2 = new Actions(driver);
    action2.moveToElement(valueLowHigh).click().perform();

    WebElement valueHighLow = driver.findElement(By.xpath("(//div[@class ='c-radio'])[3]"));
    Actions action3 = new Actions(driver);
    action3.moveToElement(valueHighLow).click().perform();

    WebElement brand = driver.findElement(By.xpath("(//div[@class ='c-radio'])[4]"));
    Actions action4 = new Actions(driver);
    action4.moveToElement(brand).click().perform();

    WebElement recommended = driver.findElement(By.xpath("(//div[@class ='c-radio'])[5]"));
    Actions action5 = new Actions(driver);
    action5.moveToElement(recommended).click().perform();



        //System.out.println("Selection: " + redeemDate.isSelected());
        }


}






