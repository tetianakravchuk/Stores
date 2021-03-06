package com.stopandshop.ui;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.asserts.SoftAssert;

import java.lang.reflect.Method;

public class BaseUI {
    WebDriver driver;
    WebDriverWait wait;
    String mainUrl = "https://stopandshop.com/";
    MainPage mainPage;
    SearchTest searchPage;
    //com.stopandshop.ui.BaseActions baseActions;
    CareersPage careersPage;
    HomePage homePage;
    CouponsPage couponsPage;
    SoftAssert softAssert = new SoftAssert();
    CateringPage cateringPage;
    ShoppingListPage shoppingListPage;
    RewardsAndPrograms rewardsAndPrograms;
    CouponSearchPage couponSearchPage;

    @BeforeMethod
    @Parameters("browser")

    public void setup(@Optional("chrome") String browser, Method method) {

        // Check if parameter passed from TestNG is 'firefox'
        if (browser.equalsIgnoreCase("firefox")) {
            // Create firefox instance
            System.setProperty("webdriver.gecko.driver", "/Users/nutxk18/Desktop/GitHub/Stores/Stores/geckodriver");
            driver = new FirefoxDriver();
        }
        // Check if parameter passed as 'chrome'
        else if (browser.equalsIgnoreCase("chrome")) {
            // Set path to chromedriver.exe
            System.setProperty("webdriver.chrome.driver", "/Users/nutxk18/Desktop/GitHub/Stores/Stores/chromedriver");
            driver = new ChromeDriver();
            driver.get("chrome://settings/clearBrowserData");
        } else if (browser.equalsIgnoreCase("IE")) {
            System.setProperty("webdriver.ie.driver", "IEDriverServer.exe");
            driver = new InternetExplorerDriver();
            driver.manage().deleteAllCookies();


        } else {
            System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
            driver = new ChromeDriver();
            driver.get("chrome://settings/clearBrowserData");


        }
        wait = new WebDriverWait(driver, 20);
        mainPage = new MainPage(driver, wait);
        searchPage = new SearchTest(driver, wait);
        homePage = new HomePage(driver, wait);
        couponsPage = new CouponsPage(driver, wait);
        careersPage = new CareersPage(driver, wait);
        cateringPage = new CateringPage(driver, wait);
        shoppingListPage = new ShoppingListPage(driver, wait);
        rewardsAndPrograms = new RewardsAndPrograms(driver, wait);
        couponSearchPage = new CouponSearchPage(driver, wait);
        driver.manage().window().maximize();
        driver.get(mainUrl);
    }


    @AfterMethod
    public void afterAction() {
        driver.quit();
        //stops

    }

    public static String generateNewNumber(String name, int length) {

        return name + RandomStringUtils.random(length, "172984757");
    }

    public static String generateEmail(String domain, int length) {
        return RandomStringUtils.random(length, "abcdefghijklmnopqrstuvwxyz") + "@" + domain;
    }

    public static String generateFirstName(String domain, int length) {
        return RandomStringUtils.random(length, "abcdefghijklmnopqrstuvwxyz");
    }

    public static String generateLastName(String domain, int length) {
        return RandomStringUtils.random(length, "abcdefghijklmnopqrstuvwxyz");
    }


}
