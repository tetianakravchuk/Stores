package com.stopandshop.ui;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.List;
import java.util.Objects;

public class SearchCouponsTests extends BaseUI {

    String currentAvailableCouponsUrl;


    @Test
    public void testSortOptions() {
        couponSearchPage.navigateToAvailableCoupons();
        couponSearchPage.refineBarClick();
        couponSearchPage.checkRefineDisplayed();
        couponSearchPage.refineRedeemByDate();
        couponSearchPage.refineValueLowToHigh();
        couponSearchPage.refineValueHighTOLow();
        couponSearchPage.refineBrand();
        couponSearchPage.refineRecommended();


    }

    @Test
    public void testAllFilerCheckBoxes() {
        couponSearchPage.navigateToAvailableCoupons();
        couponSearchPage.waitAndClickRefineBar();
        couponSearchPage.checkOutEachFilter();


    }

    @Test
    public void testAllFilterCheckBoxes2() {
        couponSearchPage.navigateToAvailableCoupons();
        couponSearchPage.waitAndClickRefineBar();
        couponSearchPage.checkAllFiltersCheckBoxes();


    }

    @Test
    public void checkFilterAndRemove() {
        couponSearchPage.navigateToAvailableCoupons();
        couponSearchPage.waitAndClickRefineBar();

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0, 900)");
        mainPage.javaWaitSec(1);
        WebElement bakery = driver.findElement(By.cssSelector("label.c-checkbox__label[for='Bakery']"));

        if (!bakery.isSelected())
            bakery.click();

        JavascriptExecutor jss = (JavascriptExecutor) driver;

        jss.executeScript("document.getElementById('Bakery').checked=false;");
        //Actions action = new Actions(driver);
        //mainPage.javaWait(2);
        //action.moveToElement(bakery).click().perform();


    }

    public static boolean updateValue(WebElement element, boolean value) {
        Objects.requireNonNull(element, "[element] must be non-null");

        String tagName = element.getTagName().toLowerCase();
        if ("input".equals(tagName) && "checkbox".equals(element.getAttribute("type"))) {
            if (element.isSelected() != value) {
                element.click();
                return true;
            } else {
                return false;
            }
        }

        return updateValue(element, value);
    }

    public void selectCheckBoxFilter() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0, 900)");
        WebElement chkBx = driver.findElement(By.xpath("//input[@id='Bakery']"));

        boolean flag2 = chkBx.isSelected();
        System.out.println(flag2);
        if (flag2)      //true
        {
            System.out.println("checkbox is already selected");
        } else  //false
        {
            System.out.println("select checkbox");
            chkBx.click();


        }
    }

    @Test
    public void testCheckBoxesRefines() {
        couponSearchPage.navigateToAvailableCoupons();
        couponSearchPage.refineBarClick();
        selectCheckBoxFilter();

    }

    String currentCheckboxText;
    By BUTTON_REFINE = By.cssSelector(".c-sort-filter.c-sort-filter--min-300");
    By CHECKBOX_FILTER = By.xpath("//div[@class='c-checkbox']//input");
    By SECTION_FILTER_RESULTS = By.xpath("//div[@class='c-xbubble']");

    @Test
    public void test1() {
        WebElement refineButton = driver.findElement(BUTTON_REFINE);
        mainPage.ajaxClick(refineButton);

        List<WebElement> checkboxes = driver.findElements(CHECKBOX_FILTER);
        for (int i = 0; i < checkboxes.size(); i++) {
            checkboxes = driver.findElements(CHECKBOX_FILTER);

            // mainPage.ajaxScroll(checkboxes.get(i));

            currentCheckboxText = checkboxes.get(i).getAttribute("id");
            System.out.println(currentCheckboxText);
            //Second option
            //сurrentCheckboxText = checkboxes.get(i).getAttribute("value");
            //System.out.println(currentCheckboxText);
            //Select check box. Refresh is required.           
            // mainPage.ajaxClick(checkboxes.get(i));
            //First element is Default, we need to use second one           
            // Assert.assertEquals(driver.findElements(SECTION_FILTER_RESULTS).get(1).getText(), currentCheckboxText);           
            // mainPage.javaWaitSec(3);           
            // checkboxes = driver.findElements(CHECKBOX_FILTER);                       
            // Uselect check box. Refresh is required.           
            // mainPage.ajaxClick(checkboxes.get(i));           
            // mainPage.javaWaitSec(3);           
            // System.out.println(i);
        }
    }


    @Test
    public void testBakeryFilter() {
        couponSearchPage.navigateToAvailableCoupons();
        couponSearchPage.filterBakery();
    }
    @Test
    public void testBabyAndChildCareFilter(){
        couponSearchPage.navigateToAvailableCoupons();
        couponSearchPage.filterBabyAndChildCare();
    }
    @Test
    public void testCondimentsAndSaucesFilter(){
        couponSearchPage.navigateToAvailableCoupons();
        couponSearchPage.filterCondimentsAndSauces();

    }
   @Test
   public void testBreakfastFilter(){
       couponSearchPage.navigateToAvailableCoupons();
       couponSearchPage.filterBreakfast();

   }
   @Test
   public void testFilterAndRemove(){
       couponSearchPage.navigateToAvailableCoupons();
       couponSearchPage.filterBakery();
       mainPage.javaWait(3);
       WebElement removeBakery = driver.findElement(Locators.FILTER_BAKERY_REMOVE);
       mainPage.ajaxClick(removeBakery);


   }

    @DataProvider(name = "Filters")
    public static Object[][] testRegistration2() {
        return new Object[][]{
                {"Baby & ChildCare"},
                {"Bakery"},
        };
    }

    @Test(dataProvider = "Filters")
    public void test2(String option) {
        WebElement refineButton = driver.findElement(BUTTON_REFINE);
        mainPage.ajaxClick(refineButton);
        WebElement checkbox = driver.findElement(By.xpath("//div[@class='c-checkbox']//input[@id='" + option + "']"));
        mainPage.ajaxScrollElement(checkbox);
        mainPage.ajaxClick(checkbox);
        Assert.assertEquals(driver.findElements(SECTION_FILTER_RESULTS).get(1).getText(), option);
    }
}










