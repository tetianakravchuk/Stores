import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class MainPageTests extends BaseUI {

    String currentHomeUrl;
    String currentUrlPharmacy;
    String currentDigitalCouponsURL;
    String currentRegistrationUrl;
    String currentSavingsUrl;
    String currentWeeklyCircularUrl;
    String currentRewardsAndProgramUrl;



   // int indexLinkSignIn = 0;

   // public MainPageTests(WebDriver driver, WebDriverWait wait) {

    //}

//    String name = "Al";
//    By BUTTON_SUBMIT = By.xpath("//a");
//    int number = 8;
//    WebElement element = driver.findElement((BUTTON_SUBMIT)); // type of variables


//    @Test
//
//    public void testHomePage() {
//
//        //drivedriver.findElement(LINK_HOME).click();r.getCurrentUrl();
//        currentHomeUrl = driver.getCurrentUrl();
//        System.out.println(currentHomeUrl);
//        Assert.assertEquals(currentHomeUrl, expectedHomeUrl);
//
//
//    }

    @Test

    public void testSignIn() {
        driver.findElement(Locators.LINK_SIGN_IN_PRIMARY).click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.findElement(Locators.TEXT_FIELD_USERNAME_PRIMARY).sendKeys(Data.email);
        driver.findElement(Locators.TEXT_FIELD_PASSWORD_PRIMARY).sendKeys(Data.password);
        driver.findElement(Locators.BUTTON_SIGN_IN_PRIMARY).click();
        //driver.findElement(BUTTON_REGISTRATION).click();

    }

    @Test
    public void checkLinkNames(){
        // Getting all links together into the list
        List<WebElement> homePageLinks = driver.findElements(By.xpath("//ul[@class ='c-primary-nav__list']//li"));

        // Printing how many links on the page
        System.out.println(homePageLinks.size());
        

        // Checking every link and getting its name
        for (int i = 0; i < homePageLinks.size(); i++) {
            String linkName = homePageLinks.get(i).getText();
            System.out.println(linkName);
            // Comparing links to what we need(names)
            if(homePageLinks.get(i).getText().contains("Shop")&& homePageLinks.get(i).getText().contains("Savings")){
                System.out.println("Test Passes");
            }

        }
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
        driver.findElement(Locators.LINK_SAVINGS).click();
        driver.findElement(Locators.LINK_DIGITAL_COUPONS).click();
        currentDigitalCouponsURL = driver.getCurrentUrl();
        System.out.println(currentDigitalCouponsURL);
        Assert.assertEquals(currentDigitalCouponsURL, Data.expectedDigitalCoupons);
        driver.findElement(Locators.LINK_SAVINGS).click();
        driver.findElement(Locators.LINK_WEEKLY_CIRCULAR).click();
        WebDriverWait wait = new WebDriverWait(driver, 10);
        currentWeeklyCircularUrl = driver.getCurrentUrl();
        System.out.println(currentWeeklyCircularUrl);
        Assert.assertEquals(currentWeeklyCircularUrl, Data.expectedWeeklyCircularUrl);
        driver.findElement(Locators.LINK_SAVINGS).click();
        driver.findElement(Locators.LINK_REWARDS_AND_PROGRAM).click();
        currentRewardsAndProgramUrl = driver.getCurrentUrl();
        System.out.println(currentRewardsAndProgramUrl);
        Assert.assertEquals(currentRewardsAndProgramUrl, Data.expectedRewardsAndProgram);


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
       @Test
        public void testLinkOnMainPage(){
        mainPage.checkLinksOnWebPage("//a", "href");
        mainPage.checkLinksOnWebPage("//imj", "src");
        driver.findElement(Locators.LINK_SAVINGS);
        mainPage.checkLinksOnWebPage("//a", "href");
        mainPage.checkLinksOnWebPage("//imj", "src");
        //a  href
}

    @Test
    public void selectRandomDropDownList(){
        driver.findElement(Locators.LINK_SAVINGS);

}}