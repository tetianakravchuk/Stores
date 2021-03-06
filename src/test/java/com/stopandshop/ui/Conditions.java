package com.stopandshop.ui;

import com.stopandshop.ui.BaseUI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Conditions extends BaseUI {

//    @Test
//    public void test() {
//        String fruit1 = "Kiwi";
//        String fruit2 = "Kiwi";
//
//        if (fruit1.contains("Kiwi") || fruit2.contains("Orange")) {
//            System.out.println("We can find our fruit1!");
//
//        } else {
//            Assert.fail("We cant find fruit2");
//
//        }
//    }

    @Test
    public void test2() {
        int number1 = 10;
        int number2 = 10;
        int sum;

        if (number1 == number2) {
            sum = 95 + 100;


        } else {
            sum = 100 - 95;


        }
        System.out.println(sum);


    }

    @Test
    public void test3() {
        boolean requirement = true;
        if (requirement) {
            System.out.println("Boolean is true");
        } else {
            Assert.fail("Boolean is false");
        }
        {

        }
    }

    @Test
    public void test4() {
        WebElement tabSearch = driver.findElement(Locators.SEARCH_HOME_PAGE);

        if (tabSearch.getText().contains("PRETTY WOMAN")) {
            tabSearch.click();
        } else {
            Assert.fail("We cannot find Pretty Woman tab");

        }

    }


    @Test
    public void test5() {
        WebElement tabSearch = driver.findElement(Locators.SEARCH_HOME_PAGE);

        if (tabSearch.isDisplayed()) {
            tabSearch.click();
        } else {
            Assert.fail("We cannot find Search");

        }

    }

    @Test
    public void test6() {
        List<String> testList = new ArrayList<String>(Arrays.asList("Orange", "Kiwi", "Melon"));
        String element = testList.get(0);
        System.out.println(element);
    }

    @Test
    public void test7() {
        List<Integer> testList = new ArrayList<Integer>(Arrays.asList(5, 6, 8));
        int sum = testList.get(1) + testList.get(2);
        System.out.println(sum);
    }

    @Test
    public void test8() {
        for (int i = 0; i < 80; i++) {
            System.out.println("hey, guys!");
        }

    }

    @Test
    public void homeShop() throws InterruptedException {
        String expectedTitleFloral = "Floral";
        String expectedTitleCatering = "Catering";
        String expectedTitlePeapodDelivery = "Peapod Delivery";
        String expectedTitlePrivateBrands = "Private Brands";
        String expectedTitleGiftCards = "Gift Cards";
        String expectedTitleSavory = "Savory";
        List<WebElement> links = driver.findElements(By.xpath("//ul[@class='c-primary-nav__list']//li"));
        System.out.println(links.size());

        for (int i = 0; i < links.size(); i++) {
            String info = links.get(i).getText();
            System.out.println(info);
            links.get(i).click();
            driver.get(Data.HomeURL);
            links = driver.findElements(By.xpath("//ul[@class='c-primary-nav__list']//li"));
            if(info.contains("Savory")){
                String actualTitle = driver.findElement(By.xpath("//a[@id='primary-nav-savory']")).getText();
                Assert.assertEquals(expectedTitleSavory,actualTitle);
                System.out.println(actualTitle);
            }
        }
    }

    @Test
    public void largeNavUtility() throws InterruptedException {
        String expectedTitlePharmacy = "Pharmacy";
        String expectedTitleWellness = "Wellness";
        String expectedTitleRegister = "Register";
        String expectedTitleFindAStore = "Find a Store";
        String expectedTitleSearch = "Search";
        String expectedTitleSignIn = "Sign In";
        List<WebElement> links = driver.findElements(By.xpath("//ul[@id=\"xlarge-utility-nav\"]//li"));
        System.out.println(links.size());

        for (int i = 0; i < links.size(); i++) {
            String info = links.get(i).getText();
            System.out.println(info);
            Thread.sleep(3000);
            links.get(i).click();
            driver.get(Data.HomeURL);
            links = driver.findElements(By.xpath("//ul[@id=\"xlarge-utility-nav\"]//li"));

            if(info.contains("Pharmacy")){
                String actualTitle = driver.findElement(By.xpath("//li[@class='c-utility-list-xlarge__item']//a[@href=\"/sns-rx\"]")).getText();
                Assert.assertEquals(expectedTitlePharmacy,actualTitle);
                System.out.println(actualTitle);

            }
            if(info.contains("Wellness")){
                String actualTitle = driver.findElement(By.xpath("//li[@class='c-utility-list-xlarge__item']//a[@href=\"/health-and-wellness\"]")).getText();
                Assert.assertEquals(expectedTitleWellness,actualTitle);
                System.out.println(actualTitle);

            }
            if(info.contains("Register")){
                String actualTitle = driver.findElement(By.xpath("//li[@class='c-utility-list-xlarge__item is-anonymous-xlarge -blue']//a[@href=\"/sign-up\"]")).getText();
                Assert.assertEquals(expectedTitleRegister,actualTitle);
                System.out.println(actualTitle);

            }





        }
    }


    @Test
    public void footerLinks() throws InterruptedException {
        String expectedTitleOurStory = "About Us";
        String expectedTitlePrivateBrands = "Private Brands";
        String actualTitle;
        String info;
        String actualFreshStoriesURL;
        String actualStoreDepartmentsURL;
        String actualNewsMediaURL;
        String actualCommunityURL;


        List<WebElement> links = driver.findElements(By.xpath("//div[@class ='c-footer__top is-visible-xlarge']//ul//li//a[@class = 'c-footer__section-link a-link']"));
        System.out.println(links.size());

        for (int i = 0; i < links.size(); i++) {
            info = links.get(i).getText();
            System.out.println(info);
            //Thread.sleep(3000);
            //links.get(i).click();
            //main.ajaxClick(driver.findElement(By.xpath("//hq")));

            if (info.contains("Our Story")) {
                actualTitle = driver.findElement((Locators.TITLE_OF_PAGE)).getText();
                //(//a[@href="/about"])[2]
                Assert.assertEquals(expectedTitleOurStory, actualTitle);
                System.out.println(actualTitle);

            }
            if (info.contains("Private Brands")) {
                actualTitle = driver.findElement(By.xpath("//a[@id='own-brands-link-qa']")).getText();
                Assert.assertEquals(expectedTitlePrivateBrands, actualTitle);
                System.out.println(actualTitle);

            }
            if (info.contains("Fresh from the local farm to our store")) {
                actualTitle = driver.findElement((Locators.TITLE_OF_PAGE)).getText();
                actualFreshStoriesURL = driver.getCurrentUrl();
                Assert.assertEquals(Data.expectedTitleFreshStories, actualTitle);
                System.out.println(actualTitle);
                Assert.assertEquals(actualFreshStoriesURL, Data.expectedFreshStoriesURL);
                driver.findElement(Locators.FRESH_STORIES_IMAGE).isDisplayed();


            }

            if (info.contains("Store Departments")) {
                Thread.sleep(3000);
                actualTitle = driver.findElement(Locators.TITLE_OF_PAGE).getText();
                actualStoreDepartmentsURL = driver.getCurrentUrl();
                Assert.assertEquals(Data.expectedTitleStoreDepartments, actualTitle);
                System.out.println(actualTitle);
                Thread.sleep(3000);
                Assert.assertEquals( actualStoreDepartmentsURL, Data.expectedStoreDepartmentsURL);
                driver.findElement(By.xpath("//img[@src= 'https://stopandshop.com/site/61/0/0/4/16e7c144-4a22-47bc-93cb-fc0a5ae334de.jpg']")).isDisplayed();
            }

            if (info.contains("News & Media")) {
                actualTitle = driver.findElement((Locators.TITLE_OF_PAGE)).getText();
                actualNewsMediaURL = driver.getCurrentUrl();
                Assert.assertEquals(Data.expectedTitleNewsMedia, actualTitle);
                System.out.println(actualTitle);
                Assert.assertEquals( actualNewsMediaURL, Data.expectedNewsMediaURL);


            }
            if (info.contains("Community")) {
                actualTitle = driver.findElement((Locators.TITLE_OF_PAGE)).getText();
                actualCommunityURL = driver.getCurrentUrl();
                Assert.assertEquals(Data.expectedTitleCommunity, actualTitle);
                System.out.println(actualTitle);
                Assert.assertEquals( actualCommunityURL, Data.expectedCommunityURL);
                driver.findElement(By.xpath("//img[@src='https://stopandshop.com/site/80/0/0/0/cf11fd8c-318c-4563-9780-86fe73bb6431.jpg']")).isDisplayed();

            }
            driver.get(Data.HomeURL);

            links = driver.findElements(By.xpath("//div[@class ='c-footer__top is-visible-xlarge']//ul//li//a[@class = 'c-footer__section-link a-link']"));


        }}


    @Test
    public void test10() {
        List<Integer> crunchifyList1 = new ArrayList<>(Arrays.asList(5, 10, 19));
        System.out.println(crunchifyList1.size());
        crunchifyList1.add(10);
        crunchifyList1.size();
        System.out.println(crunchifyList1.size());
        for (int i = 0; i < crunchifyList1.size(); i++) {
            int element = crunchifyList1.get(i);
            System.out.println(element);
        }


    }

    @Test
    public void test11() {
        String phrase = "Melon is inside list";
        List<String> crunchiList = new ArrayList<>(Arrays.asList("Apple", "Kiwi", "Orange", phrase));
        System.out.println(crunchiList.size());
        crunchiList.add("Melon");

        System.out.println(crunchiList.size());
        for (int i = 0; i < crunchiList.size(); i++) {
            String element = crunchiList.get(i);
            System.out.println(i + "iteration");

            if (element.contains("Me")) {
                System.out.println(phrase);
            }
            if (element.contains("Orange")) {
                System.out.println("Orange");
            }
            if (element.contains("Watermelon")) {
                System.out.println("Watermelon");
            } else {
                System.out.println("Bad loop");
            }
        }}


    @Test
    public void test22(){
      //  baseActions.performClick(com.stopandshop.ui.Locators.SEARCH_HOME_PAGE);

    }


}




  // @Test
   // public void test12(){
    // com.stopandshop.ui.BaseActions.performClick(com.stopandshop.ui.Locators.LINK_PHARMACY, index);

   // }


