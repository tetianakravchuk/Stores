import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class MainPage {
    String mainUrl = "https://stopandshop.com/";
    WebDriver driver;
    String currentHomeUrl;
    String currentUrlPharmacy;
    String currentDigitalCouponsURL;
    String currentRegistrationUrl;
    String currentSavingsUrl;
    String currentWeeklyCircularUrl;
    String currentRewardsAndProgramUrl;
    String expectedHomeUrl = "https://stopandshop.com/";
    String expectedPharmacyUrl = "https://stopandshop.com/sns-rx/";
    String expectedRegistrationUrl = "https://stopandshop.com/sign-up/";
    String expectedDigitalCoupons = "https://stopandshop.com/coupons-weekly-circular/digital-coupons/#/available";
    String expectedWeeklyCircularUrl = "https://stopandshop.com/coupons-weekly-circular/weekly-circular/";
    String expectedRewardsAndProgram = "https://stopandshop.com/member-benefits/";
    By LINK_PHARMACY = By.xpath("//a[@id='utility-nav-pharmacy']");
    By LINK_HOME = By.xpath("//img[@id='logo']");
    By LINK_SIGN_IN = By.xpath("//a[@href='/sign-in']");
    By LINK_SAVINGS = By.xpath("//a[@id ='primary-nav-savings']");
    By LINK_DIGITAL_COUPONS = By.xpath("//li[@class =\"c-buckets__item\"]//a[@href=\"/coupons-weekly-circular/digital-coupons\"]");
    By LINK_WEEKLY_CIRCULAR = By.xpath("//li[@class = 'c-buckets__item']//a[@href='/coupons-weekly-circular/weekly-circular']");
    By LINK_REWARDS_AND_PROGRAM = By.xpath("//li[@class =\"c-buckets__item\"]//a[@href=\"/member-benefits\"]");
    By BUTTON_REGISTER = By.xpath("//p[@class=\"c-login__content\"]//a[@href=\"/sign-up\"]");
    By BUTTON_REGISTRATION_NEEDS_CARD = By.xpath("//a[@href=\"/sign-up/registration\"]");
    int indexLinkSignIn = 0;

//    String name = "Al";
//    By BUTTON_SUBMIT = By.xpath("//a");
//    int number = 8;
//    WebElement element = driver.findElement((BUTTON_SUBMIT)); // type of variables


    @BeforeMethod
    public void setUp() {

        // hav to add drivers to any browser
        System.setProperty("webdriver.chrome.driver", "chromedriver");
        driver = new ChromeDriver();// opens your browser
        driver.manage().window().maximize();
        // first test case
        driver.get(mainUrl);// gets your URL

    }

//    @Test
//
//    public void testHomePage() {
//        driver.findElement(LINK_HOME).click();
//        //driver.getCurrentUrl();
//        currentHomeUrl = driver.getCurrentUrl();
//        System.out.println(currentHomeUrl);
//        Assert.assertEquals(currentHomeUrl, expectedHomeUrl);
//
//
//    }

    @Test

    public void testSignIn() {
//        WebElement linkSignIn = driver.findElement(LINK_SIGN_IN);
//        linkSignIn.click();
        driver.findElement(LINK_SIGN_IN).click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.findElement(By.cssSelector("input#username")).sendKeys("cla@mailinator.com");
        driver.findElement(By.cssSelector("input#password")).sendKeys("Quincy2019");
        driver.findElement(By.xpath("//input[@id='login-submit-button']")).click();
        //driver.findElement(BUTTON_REGISTRATION).click();

    }


//    @Test
//
//    public void testPharmacyPage() {
//        driver.findElement(LINK_PHARMACY).click();
//        //driver.getCurrentUrl();
//        currentUrlPharmacy = driver.getCurrentUrl();
//        System.out.println(currentUrlPharmacy);
//        Assert.assertEquals(currentUrlPharmacy, expectedPharmacyUrl);
//
//
//    }

    @Test
    public void testSavingsMenu() {
        driver.findElement(LINK_SAVINGS).click();
        driver.findElement(LINK_DIGITAL_COUPONS).click();
        currentDigitalCouponsURL = driver.getCurrentUrl();
        System.out.println(currentDigitalCouponsURL);
        Assert.assertEquals(currentDigitalCouponsURL, expectedDigitalCoupons);
        driver.findElement(LINK_SAVINGS).click();
        driver.findElement(LINK_WEEKLY_CIRCULAR).click();
        WebDriverWait wait = new WebDriverWait(driver, 10);
        currentWeeklyCircularUrl = driver.getCurrentUrl();
        System.out.println(currentWeeklyCircularUrl);
        Assert.assertEquals(currentWeeklyCircularUrl, expectedWeeklyCircularUrl);
        driver.findElement(LINK_SAVINGS).click();
        driver.findElement(LINK_REWARDS_AND_PROGRAM).click();
        currentRewardsAndProgramUrl = driver.getCurrentUrl();
        System.out.println(currentRewardsAndProgramUrl);
        Assert.assertEquals(currentRewardsAndProgramUrl, expectedRewardsAndProgram);



    }

//    @Test
//        public void testRegisterNoCard() {
//        driver.findElement(LINK_SIGN_IN).click();
//        driver.findElement(By.cssSelector("#utility-nav-login")).click();
//        ajaxClick(driver.findElement(By.xpath("//div[@id='utility-nav-login-pane-dropdown']//a[@href='/sign-up']")));
//
//    }
//
//
//    public void ajaxClick(WebElement element){
//        WebDriverWait wait = new WebDriverWait(driver, 3);
//
//        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
//        wait.until(ExpectedConditions.elementToBeClickable(element));
//        element.click();
//
//        }


    @AfterMethod
    public void afterAction() {
        driver.quit();
        //stops

    }

}