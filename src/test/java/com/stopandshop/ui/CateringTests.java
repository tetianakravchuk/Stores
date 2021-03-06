package com.stopandshop.ui;

import com.stopandshop.ui.BaseUI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class CateringTests extends BaseUI {

    @Test
    public void selectRandomDropDownList() {
        driver.findElement(Locators.LINK_SHOP).click();
        driver.findElement(Locators.LINK_SHOP_CATERING).click();
        WebElement element = driver.findElement(By.xpath("//iframe[@src='/onlinestore/storeSelect.htm?md=jb&eoid&vid=20060501001']"));
        driver.switchTo().frame(element);
        mainPage.getDropDownListByText(Locators.DROPDOWN_CHOOSE_STATE, "MA");
        //mainPage.getDropDownListByText(com.stopandshop.ui.Locators.DROPDOWN_CHOOSE_STATE, "NJ");

        //mainPage.getDropDownListByText(com.stopandshop.ui.Locators.DROPDOWN_CHOOSE_CITY, "Acton");

       }
       @Test
       public void getAllStates() {
        driver.findElement(Locators.LINK_SHOP).click();
        driver.findElement(Locators.LINK_SHOP_CATERING).click();
        WebElement element = driver.findElement(By.xpath("//iframe[@src='/onlinestore/storeSelect.htm?md=jb&eoid&vid=20060501001']"));
        driver.switchTo().frame(element);
        cateringPage.getStateCount();


       }

   // public void sizeDropDonList() {
       // mainPage.getToSearchPeoplePage();
       // int elements = howWeWorkPage.getSizeDropDownList(com.stopandshop.ui.Locators.DROPDOWNLIST_AGE_MAX);
       // for (int i = 0; i < elements; i++) {
        //    mainPage.selectItemDropDownRandomOption(com.stopandshop.ui.Locators.DROPDOWNLIST_AGE_MAX, "Max age");
        //}

   // }
   @Test
   public void statesCount(){
       mainPage.getToCateringPage();
       WebElement element = driver.findElement(By.xpath("//iframe[@src='/onlinestore/storeSelect.htm?md=jb&eoid&vid=20060501001']"));
       driver.switchTo().frame(element);
       cateringPage.getStateCount();
       cateringPage.sizeDropDonStateList();
   }

    @Test

    public void sizeDropDownStateListState() throws InterruptedException {



            mainPage.getToCateringPage();
            WebElement element = driver.findElement(By.xpath("//iframe[@src='/onlinestore/storeSelect.htm?md=jb&eoid&vid=20060501001']"));
            driver.switchTo().frame(element);
            cateringPage.getSizeDropDownList(Locators.DROPDOWN_CHOOSE_STATE);

            cateringPage.selectStateDropDownOptionByName();
            cateringPage.selectCityDropDownOptionByName();


            //for (int i = 0; i < elements; i++){
            // mainPage.clickOptions();
            //wait.until(ExpectedConditions.stalenessOf(element));
            cateringPage.selectStateDropDownOptionByName();
            //wait.until(ExpectedConditions.stalenessOf(c));
            cateringPage.selectCityDropDownOptionByName();


        }

    }








