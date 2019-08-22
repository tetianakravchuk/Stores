import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

public class HomePage extends BaseActions {
    public HomePage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    String currentHomeURL;
    String currentDigitalCouponsURL;
    String currentWeeklyCircularURL;
    String currentRewardsAndProgramURL;
    //Saving Menu
    String currentSavingsDigitalCouponsURL;
    String currentSavingsWeeklyCircularURL;
    String currentSavingsRewardsAndProgramsURL;

    //Shop Menu
    String currentShopPeapodDeliveryURL;
    String currentShopCateringURL;
    String currentShopGiftCardsURL;
    String currentShopFloralURL;
    String currentShopPrivateBrandsURL;
    //Savory Menu
    String currentSavorySavoryURL;
    String currentSavoryBrowseURL;
    String currentSavoryMagazineURL;
    String currentSavorySeasonalURL;
    String currentSavoryFavoritesURL;
    //Coupons
    String currentBrowseCouponsURL;
    //Peapod
    String currentOrderOnlineURL;
    String currentShopOnlinePeapodURL;
    String currentLearnMorePeapodURL;


    public void navigateToHomePage() {
        driver.findElement(Locators.LINK_HOME).click();
        currentHomeURL = driver.getCurrentUrl();

    }

    public void goBackClick() {
        driver.navigate().back();
    }

    public String clickSavingsDigitalCoupons() {
        driver.findElement(Locators.LINK_SAVINGS).click();
        driver.findElement(Locators.LINK_DIGITAL_COUPONS).click();
        currentSavingsDigitalCouponsURL = driver.getCurrentUrl();
        System.out.println(currentSavingsDigitalCouponsURL);
        Assert.assertEquals(currentSavingsDigitalCouponsURL, Data.expectedSavingsDigitalCouponsURL);


        return currentSavingsDigitalCouponsURL;
    }

    public String clickSavingsRewardsAndProgram() {
        driver.findElement(Locators.LINK_SAVINGS).click();
        driver.findElement(Locators.LINK_REWARDS_AND_PROGRAM).click();
        currentSavingsRewardsAndProgramsURL = driver.getCurrentUrl();
        System.out.println(currentSavingsRewardsAndProgramsURL);
        Assert.assertEquals(currentSavingsRewardsAndProgramsURL, Data.expectedSavingsRewardsAndProgramURL);
        return currentSavingsRewardsAndProgramsURL;
    }

    public String clickSavingsWeeklyCircular() {
        driver.findElement(Locators.LINK_SAVINGS).click();
        driver.findElement(Locators.LINK_WEEKLY_CIRCULAR).click();
        currentSavingsWeeklyCircularURL = driver.getCurrentUrl();
        System.out.println(currentSavingsWeeklyCircularURL);
        Assert.assertEquals(currentSavingsWeeklyCircularURL, Data.expectedSavingsWeeklyCircularURL);

        return currentSavingsWeeklyCircularURL;
    }


    public String clickShopPeapodDelivery() {
        driver.findElement(Locators.LINK_SHOP).click();
        driver.findElement(Locators.LINK_SHOP_PEAPOD_DELIVERY).click();
        currentShopPeapodDeliveryURL = driver.getCurrentUrl();
        Assert.assertEquals(currentShopPeapodDeliveryURL, Data.expectedShopPeapodURL);
        System.out.println(currentShopPeapodDeliveryURL);
        driver.navigate().back();
        return currentDigitalCouponsURL;

    }

    public String clickShopCatering() {
        driver.findElement(Locators.LINK_SHOP).click();
        driver.findElement(Locators.LINK_SHOP_CATERING).click();
        currentShopCateringURL = driver.getCurrentUrl();
        Assert.assertEquals(currentShopCateringURL, Data.expectedShopCateringURL);
        System.out.println(currentShopCateringURL);
        return currentShopCateringURL;
    }

    public String clickShopGiftCards() {
        driver.findElement(Locators.LINK_SHOP).click();
        driver.findElement(Locators.LINK_SHOP_GIFT_CARDS).click();
        currentShopGiftCardsURL = driver.getCurrentUrl();
        Assert.assertEquals(currentShopGiftCardsURL, Data.expectedShopGiftCardsURL);
        System.out.println(currentShopGiftCardsURL);
        return currentShopGiftCardsURL;
    }

    public String clickShopFloral() {
        driver.findElement(Locators.LINK_SHOP).click();
        driver.findElement(Locators.LINK_SHOP_FLORAL).click();
        currentShopFloralURL = driver.getCurrentUrl();
        Assert.assertEquals(currentShopFloralURL, Data.expectedShopFloralURL);
        System.out.println(currentShopFloralURL);
        return currentShopFloralURL;
    }

    public String clickShopPrivateBrands() {
        driver.findElement(Locators.LINK_SHOP).click();
        driver.findElement(Locators.LINK_SHOP_PRIVATE_BRANDS).click();
        currentShopPrivateBrandsURL = driver.getCurrentUrl();
        Assert.assertEquals(currentShopPrivateBrandsURL, Data.expectedShopPrivateBrandsURL);
        System.out.println(currentShopPrivateBrandsURL);
        return currentShopPrivateBrandsURL;
    }

    public void clickSavoryMenu() {
        driver.findElement(Locators.LINK_SAVORY).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }


    public String clickSavorySavory() {
        clickSavoryMenu();
        driver.findElement(Locators.LINK_SAVORY_SAVORY).click();
        currentSavorySavoryURL = driver.getCurrentUrl();
        Assert.assertEquals(currentSavorySavoryURL, Data.expectedSavorySavoryURL);
        System.out.println(currentSavorySavoryURL);
        return currentSavorySavoryURL;

    }
    public String clickSavoryBrowse() {
        clickSavoryMenu();
        driver.findElement(Locators.LINK_SAVORY_SAVORY).click();
        currentSavoryBrowseURL = driver.getCurrentUrl();
        Assert.assertEquals(currentSavoryBrowseURL, Data.expectedSavoryBrowseURL);
        System.out.println(currentSavoryBrowseURL);
        return currentSavoryBrowseURL;

    }


    public String clickSavoryMagazine() {
        clickSavoryMenu();
        driver.findElement(Locators.LINK_SAVORY_MAGAZINE).click();
        currentSavoryMagazineURL = driver.getCurrentUrl();
        Assert.assertEquals(currentSavoryMagazineURL, Data.expectedSavoryMagazineURL);
        System.out.println(currentSavoryMagazineURL);
        return currentSavoryMagazineURL;

    }
    public String clickSavorySeasonal() {
        clickSavoryMenu();
        driver.findElement(Locators.LINK_SAVORY_SEASONAL).click();
        currentSavorySeasonalURL = driver.getCurrentUrl();
        Assert.assertEquals(currentSavorySeasonalURL, Data.expectedSavorySeasonalURL);
        System.out.println(currentSavorySeasonalURL);
        return currentSavorySeasonalURL;

    }

    public String clickSavoryFavorites() {
        clickSavoryMenu();
        driver.findElement(Locators.LINK_SAVORY_FAVORITES).click();
        currentSavoryFavoritesURL = driver.getCurrentUrl();
        Assert.assertEquals(currentSavoryFavoritesURL, Data.expectedSavoryFavoritesURL);
        System.out.println(currentSavoryFavoritesURL);
        return currentSavoryFavoritesURL;

    }
    public void clickCouponSignIn(){
        driver.findElement(Locators.COUPONS_PLUS_CLICK_ONE).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }


    public void signInPopUpWindow(){
        clickCouponSignIn();

        driver.findElement(Locators.USERNAME_SIGN_IN_POPUP_WINDOW).sendKeys(Data.email);
        driver.findElement(Locators.PASSWORD_SIGN_IN_POPUP_WINDOW).sendKeys(Data.password);
        driver.findElement(Locators.SIGN_IN_POPUP_WINDOW).click();
        //driver.findElement(Locators.CLOSE_SIGN_IN_POPUP_WINDOW_BUTTON).click();
        driver.navigate().refresh();
    }

    public void addCouponsPlusButton(){
        driver.findElement(Locators.COUPONS_PLUS_CLICK_ONE).click();
        driver.findElement(Locators.COUPONS_PLUS_CLICK_TWO).click();
        driver.findElement(Locators.COUPONS_PLUS_CLICK_THREE).click();
        driver.findElement(Locators.COUPONS_PLUS_CLICK_FOUR).click();
        driver.findElement(Locators.COUPONS_PLUS_CLICK_FIVE).click();

    }

    public void viewAllCouponsHomePage(){
       // driver.findElement(Locators.LINK_HOME).click();
        driver.findElement(Locators.VIEW_ALL_COUPONS_HOME_PAGE).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        waitPageToLoad();
        currentBrowseCouponsURL = driver.getCurrentUrl();
        Assert.assertEquals(currentBrowseCouponsURL, Data.expectedBrowseCouponsURL);
        System.out.println(currentBrowseCouponsURL);


    }

    public void orderTodayLink(){
        driver.findElement(Locators.ORDER_TODAY).click();
        currentOrderOnlineURL = driver.getCurrentUrl();
        Assert.assertEquals(currentOrderOnlineURL, Data.expectedOrderOnlineURL);
        System.out.println(currentOrderOnlineURL);



    }

    public void peapodShopOnlineLink(){
        driver.findElement(Locators.SHOP_ONLINE_WITH_PEAPOD).click();
        currentShopOnlinePeapodURL = driver.getCurrentUrl();
        Assert.assertEquals(currentShopOnlinePeapodURL, Data.expectedShopOnlinePeapodURL);
        System.out.println(currentShopOnlinePeapodURL);


    }
    public void learnMorePeapodLink(){
        driver.findElement(Locators.SHOP_ONLINE_WITH_PEAPOD).click();
        currentLearnMorePeapodURL = driver.getCurrentUrl();
        Assert.assertEquals(currentLearnMorePeapodURL, Data.expectedLearnMorePeapodURL);
        System.out.println(currentLearnMorePeapodURL);


    }


}
