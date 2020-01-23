package com.stopandshop.ui;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;
import java.util.stream.Collectors;

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
        List<WebElement> radioButtonList = driver.findElements(By.tagName("input"));
        //System.out.println(radioButton.size());
        //int a = driver.findElements(By.xpath("//input[@id ='rb1']")).size();
        //System.out.println(a);
        // Loops through all checkbox elements
        for (int i = 0; i < radioButtonList.size(); i++) {
            // Checking if the checkbox is a "Redeem by Date" or "Brand"
            if ((radioButtonList.get(i).getAttribute("value").trim()
                    .equalsIgnoreCase("Brand"))
                    || ((radioButtonList.get(i).getAttribute("value").trim()
                    .equalsIgnoreCase("Redeem by Date")))) {
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

        }
    }

    @Test
    public void refineSort() {
        couponSearchPage.navigateToAvailableCoupons();
        couponSearchPage.refineBarClick();
        driver.findElement(By.name("group1")).isDisplayed();
        WebElement checkBoxList = driver.findElement(By.name("group1"));
        System.out.println("Is checkbox displayed? " + checkBoxList.isDisplayed());

        WebElement redeemDate = driver.findElement(By.xpath("(//div[@class ='c-radio'])[1]"));
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

    }

    @Test
    public void refineFilterPartOne() {
        couponSearchPage.navigateToAvailableCoupons();
        couponSearchPage.refineBarClick();
        driver.findElement(By.name("group1")).isDisplayed();
        WebElement checkBoxList = driver.findElement(By.name("group1"));
        System.out.println("Is checkbox displayed? " + checkBoxList.isDisplayed());

        WebElement babyAndChildCare = driver.findElement(By.xpath("(//div[@class ='c-checkbox'])[1]"));
        Actions action = new Actions(driver);
        action.moveToElement(babyAndChildCare).click().perform();
        System.out.println(babyAndChildCare);

        WebElement bakery = driver.findElement(By.xpath("(//div[@class ='c-checkbox'])[2]"));
        Actions action2 = new Actions(driver);
        action2.moveToElement(bakery).click().perform();

        WebElement beverages = driver.findElement(By.xpath("(//div[@class ='c-checkbox'])[3]"));
        Actions action3 = new Actions(driver);
        action3.moveToElement(beverages).click().perform();

        WebElement breakfast = driver.findElement(By.xpath("(//div[@class ='c-checkbox'])[4]"));
        Actions action4 = new Actions(driver);
        action4.moveToElement(breakfast).click().perform();

        WebElement condimentsAndSauces = driver.findElement(By.xpath("(//div[@class ='c-checkbox'])[5]"));
        Actions action5 = new Actions(driver);
        action5.moveToElement(condimentsAndSauces).click().perform();

        WebElement dairy = driver.findElement(By.xpath("(//div[@class ='c-checkbox'])[6]"));
        Actions action6 = new Actions(driver);
        action6.moveToElement(dairy).click().perform();

        WebElement deli = driver.findElement(By.xpath("(//div[@class ='c-checkbox'])[7]"));
        Actions action7 = new Actions(driver);
        action7.moveToElement(deli).click().perform();

        WebElement ethnicProducts = driver.findElement(By.xpath("(//div[@class ='c-checkbox'])[8]"));
        Actions action8 = new Actions(driver);
        action8.moveToElement(ethnicProducts).click().perform();
    }

    @Test
    public void refineFilterPartTwo() {
        couponSearchPage.navigateToAvailableCoupons();
        couponSearchPage.refineBarClick();
        driver.findElement(By.name("group1")).isDisplayed();
        WebElement checkBoxList = driver.findElement(By.name("group1"));
        System.out.println("Is checkbox displayed? " + checkBoxList.isDisplayed());


        WebElement frozenFood = driver.findElement(By.xpath("(//div[@class ='c-checkbox'])[9]"));
        System.out.println(frozenFood.getText());
        Actions action9 = new Actions(driver);
        action9.moveToElement(frozenFood).click().perform();

        WebElement generalMerchandise = driver.findElement(By.xpath("(//div[@class ='c-checkbox'])[10]"));
        System.out.println(generalMerchandise.getText());
        Actions action10 = new Actions(driver);
        action10.moveToElement(generalMerchandise).click().perform();

        WebElement healthAndWellness = driver.findElement(By.xpath("(//div[@class ='c-checkbox'])[11]"));
        System.out.println(healthAndWellness.getText());
        Actions action11 = new Actions(driver);
        action11.moveToElement(healthAndWellness).click().perform();

        WebElement household = driver.findElement(By.xpath("(//div[@class ='c-checkbox'])[12]"));
        System.out.println(household.getText());
        Actions action12 = new Actions(driver);
        action12.moveToElement(household).click().perform();

        WebElement personalCare = driver.findElement(By.xpath("(//div[@class ='c-checkbox'])[13]"));
        System.out.println(personalCare.getText());
        Actions action13 = new Actions(driver);
        action13.moveToElement(personalCare).click().perform();

        WebElement petCare = driver.findElement(By.xpath("(//input[@class ='c-settings-form__filter-checkbox c-checkbox__input js-update-filter'])[14]"));
        System.out.println(petCare.getText());
        Actions action14 = new Actions(driver);
        action14.moveToElement(petCare).click().perform();

        WebElement snacks = driver.findElement(By.id("Snacks"));
        System.out.println(snacks.getText());
        Actions action15 = new Actions(driver);
        action15.moveToElement(snacks).click().perform();

    }

    @Test
    public void snackFilter() {
        couponSearchPage.navigateToAvailableCoupons();
        couponSearchPage.refineBarClick();
        driver.findElement(By.name("group1")).isDisplayed();
        WebElement checkBoxList = driver.findElement(By.name("group1"));
        System.out.println("Is checkbox displayed? " + checkBoxList.isDisplayed());

        WebElement snacks = driver.findElement(By.id("Snacks"));
        (new WebDriverWait(driver, 30)).until(ExpectedConditions
                .elementToBeClickable(snacks));
        // Create a boolean variable to store true/false
        Boolean isSnacksSelected = snacks.isSelected();

        if (isSnacksSelected == false) {
            Actions action15 = new Actions(driver);
            action15.moveToElement(snacks).click().perform();
            System.out.println("Test has selected Snacks checkbox");
        } else {
            System.out.println("Snack checkbox was selected on default");
        }

    }

    @Test
    public void checkAllFilters() throws InterruptedException {
        couponSearchPage.navigateToAvailableCoupons();
        couponSearchPage.refineBarClick();
        driver.findElement(By.name("group1")).isDisplayed();
        WebElement checkBoxList = driver.findElement(By.name("group1"));
        System.out.println("Is checkbox displayed? " + checkBoxList.isDisplayed());

        List<WebElement> checkBoxFiltersList = driver.findElements(By.xpath("//div[@class='c-checkbox']//input[@checked='true']"));
        for (WebElement checkBox : checkBoxFiltersList) {

            //mainPage.ajaxClick(checkBox);
            checkBox.click();
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='c-checkbox']//input[@checked='true']")));
            Thread.sleep(1000);
            //mainPage.javaWait(500);
            //mainPage.ajaxClick(checkBox);
        }
        // Assert if any checkbox left checked
        Assert.assertEquals(driver.findElements(By.cssSelector(".c-checkbox input[checked='true']")).size(),
                checkBoxFiltersList.size());

    }

    @Test
    public void testAllCheckBox() {
        couponSearchPage.navigateToAvailableCoupons();
        // waiting
        WebDriverWait wait = new WebDriverWait(driver, 10);
        // click Refine
        driver.findElement(By.cssSelector(".c-sort-filter")).click();
        // getting all checkboxes
        List <WebElement> checkboxes = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector(".c-checkbox label")));
        // getting names of checkboxes
        List <String> labels = checkboxes.stream().map(WebElement::getText).collect(Collectors.toList());

        for (String label : labels) {
            // clicking on each checkbox
            driver.findElement(By.cssSelector(String.format("label[for='%s']", label))).click();
            // wait until loading disappear
            wait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector(".c-spinner")));
            // check if input is selected
            wait.until(ExpectedConditions.elementToBeSelected(By.cssSelector(String.format("input[id='%s']", label))));
        }
        // check if input is selected by compare tags with checkboxes
        List<String> selectedFilters = driver.findElements(By.cssSelector(".divider-view-filters-list .c-xbubble")).stream().map(WebElement::getText).collect(Collectors.toList());
        Assert.assertEquals(selectedFilters, labels);


    }

    @Test
    public void checkAllCheckBoxes() {
        driver.navigate().to("https://stopandshop.com/coupons-weekly-circular/digital-coupons/#/available");
        WebElement refineButton = driver.findElement(By.cssSelector(".c-sort-filter.c-sort-filter--min-300"));
        refineButton.click();

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0, 900)");
        mainPage.javaWaitSec(1);

        List<WebElement> checkBoxFiltersList = driver.findElements(By.cssSelector(".c-settings-form__filter-checkbox.c-checkbox__input.js-update-filter"));
        System.out.println("Number of unchecked check boxes: " + checkBoxFiltersList.size());
        for (int i = 0; i < checkBoxFiltersList.size(); i++) {
            Actions action = new Actions(driver);
            action.moveToElement(checkBoxFiltersList.get(i)).click().perform();
            mainPage.javaWaitSec(1);
            js.executeScript("window.scrollBy(0, 500)");
            mainPage.javaWaitSec(1);
            checkBoxFiltersList = driver.findElements(By.cssSelector(".c-settings-form__filter-checkbox.c-checkbox__input.js-update-filter"));
        }
        // Assert if all checkboxes are checked       
        List<WebElement> checkBoxFiltersListChecked = driver.findElements(By.xpath("//div[@class='c-checkbox']//input[@checked='true']"));
        System.out.println("Number of checked check boxes: " + checkBoxFiltersList.size());
        Assert.assertEquals(checkBoxFiltersListChecked.size(), checkBoxFiltersList.size());
    }
}









