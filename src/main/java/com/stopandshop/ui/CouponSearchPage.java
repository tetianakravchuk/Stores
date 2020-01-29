package com.stopandshop.ui;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

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

    public void ajaxScroll(WebElement element) {
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
    }

    public void ajaxClick(WebElement element) {

        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
        wait.until(ExpectedConditions.elementToBeClickable(element));
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", element);
    }

    public void filterBakery() {
        driver.findElement(Locators.REFINE_AVAILABLE_COUPONS).click();
        WebElement checkbox = driver.findElement(Locators.FILTER_BAKERY);

        ajaxScroll(checkbox);
        ajaxClick(checkbox);

        Assert.assertEquals(driver.findElements(Locators.SECTION_FILTER_RESULTS).get(1).getText(), "Bakery");

    }
    public void filterBabyAndChildCare() {
        driver.findElement(Locators.REFINE_AVAILABLE_COUPONS).click();
        WebElement checkbox = driver.findElement(Locators.FILTER_BABY_AND_CHILDCARE);

        ajaxScroll(checkbox);
        ajaxClick(checkbox);

        Assert.assertEquals(driver.findElements(Locators.SECTION_FILTER_RESULTS).get(1).getText(), "Baby & ChildCare");

    }

    public void filterCondimentsAndSauces() {
        driver.findElement(Locators.REFINE_AVAILABLE_COUPONS).click();
        WebElement checkbox = driver.findElement(Locators.FILTER_CONDIMENTS_AND_SAUCES);

        ajaxScroll(checkbox);
        ajaxClick(checkbox);

        Assert.assertEquals(driver.findElements(Locators.SECTION_FILTER_RESULTS).get(1).getText(), "Condiments & Sauces");

    }

    public void filterBreakfast() {
        driver.findElement(Locators.REFINE_AVAILABLE_COUPONS).click();
        WebElement checkbox = driver.findElement(Locators.FILTER_BREAKFAST);

        ajaxScroll(checkbox);
        ajaxClick(checkbox);

        Assert.assertEquals(driver.findElements(Locators.SECTION_FILTER_RESULTS).get(1).getText(), "Breakfast");

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

    public void clickRedeemByDate(By locator) {
        ajaxClick(locator);
    }

    public void clickRedeemByDate(WebElement element) {
        ajaxClick(element);
        //div.c-radio:nth-child(2) > label:nth-child(2)
        ///html/body/div[1]/main/div[1]/div[6]/div[1]/div/div/form/fieldset[1]/div[1]/label
    }

    public void refineRedeemByDate() {
        WebElement redeemDate = driver.findElement(Locators.SORT_REDEEM_BY_DATE);
        Actions action = new Actions(driver);
        action.moveToElement(redeemDate).click().perform();

    }

    public void refineValueLowToHigh() {
        WebElement valueLowHigh = driver.findElement(Locators.SORT_VALUE_LOW_TO_HIGH);
        Actions action2 = new Actions(driver);
        action2.moveToElement(valueLowHigh).click().perform();

    }

    public void refineValueHighTOLow() {
        WebElement valueHighLow = driver.findElement(Locators.SORT_VALUE_HIGH_TO_LOW);
        Actions action3 = new Actions(driver);
        action3.moveToElement(valueHighLow).click().perform();

    }

    public void refineBrand() {
        WebElement brand = driver.findElement(Locators.SORT_BRAND);
        Actions action4 = new Actions(driver);
        action4.moveToElement(brand).click().perform();

    }

    public void refineRecommended() {

        WebElement recommended = driver.findElement(Locators.SORT_RECOMMENDED);
        Actions action5 = new Actions(driver);
        action5.moveToElement(recommended).click().perform();

    }

    public void checkRefineDisplayed() {
        driver.findElement(By.name("group1")).isDisplayed();
        WebElement checkBoxList = driver.findElement(By.name("group1"));
        System.out.println("Is checkbox displayed? " + checkBoxList.isDisplayed());
    }

    public void waitAndClickRefineBar() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        // click Refine
        driver.findElement(By.cssSelector(".c-sort-filter")).click();
    }

    public void checkOutEachFilter() {
        List<WebElement> checkboxes = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector(".c-checkbox label")));
        // getting names of checkboxes and collect them to the list
        List<String> labels = checkboxes.stream().map(WebElement::getText).collect(Collectors.toList());

        for (String label : labels) {
            // clicking on each checkbox, using % because we have many buttons/checkboxes
            driver.findElement(By.cssSelector(String.format("label[for='%s']", label))).click();
            // wait until loading disappear
            wait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector(".c-spinner")));
            // check if input is selected
            wait.until(ExpectedConditions.elementToBeSelected(By.cssSelector(String.format("input[id='%s']", label))));
        }
        // check if input is selected by compare tags with checkboxes
        List<String> selectedFilters = driver.findElements(By.cssSelector(".divider-view-filters-list .c-xbubble")).stream().map(WebElement::getText).collect(Collectors.toList());
        Assert.assertEquals(selectedFilters, labels);

        //driver.findElement(Locators.SORT_REDEEM_BY_DATE).click();
        //isElementPresent(Locators.REDEEM_BY_DATE_LABEL);
        //assertTrue(isElementPresent(Locators.REDEEM_BY_DATE_LABEL);

    }

    public void checkAllFiltersCheckBoxes() {
        List<WebElement> checkBoxFiltersList = driver.findElements(By.cssSelector(".c-settings-form__filter-checkbox.c-checkbox__input.js-update-filter"));
        System.out.println("Number of unchecked check boxes: " + checkBoxFiltersList.size());
        for (int i = 0; i < checkBoxFiltersList.size(); i++) {
            Actions action = new Actions(driver);
            action.moveToElement(checkBoxFiltersList.get(i)).click().perform();
            javaWaitSec(2);
            //mainPage.javaWaitSec(1);
            checkBoxFiltersList = driver.findElements(By.cssSelector(".c-settings-form__filter-checkbox.c-checkbox__input.js-update-filter"));
        }
        // Assert if all checkboxes are checked       
        List<WebElement> checkBoxFiltersListChecked = driver.findElements(By.xpath("//div[@class='c-checkbox']//input[@checked='true']"));
        System.out.println("Number of checked check boxes: " + checkBoxFiltersList.size());
        Assert.assertEquals(checkBoxFiltersListChecked.size(), checkBoxFiltersList.size());
    }


    public void safeJavaScriptClick(WebElement element) throws Exception {
        try {
            if (element.isEnabled() && element.isDisplayed()) {
                System.out.println("Clicking on element with using java script click");

                ((JavascriptExecutor) driver).executeScript("arguments[0].click();", element);
            } else {
                System.out.println("Unable to click on element");
            }
        } catch (StaleElementReferenceException e) {
            System.out.println("Element is not attached to the page document " + e.getStackTrace());
        } catch (NoSuchElementException e) {
            System.out.println("Element was not found in DOM " + e.getStackTrace());
        } catch (Exception e) {
            System.out.println("Unable to click on element " + e.getStackTrace());
        }
    }


}




