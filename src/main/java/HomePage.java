import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage extends BaseActions {
    public HomePage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);}

        String currentHomeURL;
        String currentDigitalCouponsURL;
        String currentWeeklyCircularURL;
        String currentRewardsAndProgramURL;

        String currentShopPeapodDeliveryURL;
        String currentShopCateringURL;
        String currentShopGiftCardsURL;
        String currentShopFloralURL;
        String currentShopPrivateBrandsURL;


        public void navigateToHomePage(){
            driver.findElement(Locators.LINK_HOME).click();
            currentHomeURL = driver.getCurrentUrl();

    }
    public String  clickSavingsDigitalCoupons(){
            driver.findElement(Locators.LINK_SAVINGS).click();
            driver.findElement(Locators.LINK_DIGITAL_COUPONS).click();
            currentWeeklyCircularURL = driver.getCurrentUrl();
            System.out.println(currentWeeklyCircularURL);
            return currentWeeklyCircularURL;
    }

    public String  clickSavingsRewardsAndProgram(){
        driver.findElement(Locators.LINK_SAVINGS).click();
        driver.findElement(Locators.LINK_REWARDS_AND_PROGRAM).click();
        currentRewardsAndProgramURL = driver.getCurrentUrl();
        System.out.println(currentRewardsAndProgramURL);
        return currentRewardsAndProgramURL;
    }

    public String clickSavingsWeeklyCircular(){
        driver.findElement(Locators.LINK_SAVINGS).click();
        driver.findElement(Locators.LINK_WEEKLY_CIRCULAR).click();
        currentWeeklyCircularURL = driver.getCurrentUrl();
        System.out.println(currentDigitalCouponsURL);
        return currentDigitalCouponsURL;
    }


    public String clickShopPeapodDelivery(){
        driver.findElement(Locators.LINK_SHOP).click();
        driver.findElement(Locators.LINK_SHOP_PEAPOD_DELIVERY).click();
        currentShopPeapodDeliveryURL = driver.getCurrentUrl();
        System.out.println(currentDigitalCouponsURL);
        return currentDigitalCouponsURL;
    }

    public String clickShopCatering(){
        driver.findElement(Locators.LINK_SHOP).click();
        driver.findElement(Locators.LINK_SHOP_CATERING).click();
        currentShopCateringURL = driver.getCurrentUrl();
        System.out.println(currentShopCateringURL);
        return currentShopCateringURL;
    }
    public String clickShopGiftCards(){
        driver.findElement(Locators.LINK_SHOP).click();
        driver.findElement(Locators.LINK_SHOP_GIFT_CARDS).click();
        currentShopGiftCardsURL = driver.getCurrentUrl();
        System.out.println(currentShopGiftCardsURL);
        return currentShopGiftCardsURL;
    }

    public String clickShopFloral(){
        driver.findElement(Locators.LINK_SHOP).click();
        driver.findElement(Locators.LINK_SHOP_FLORAL).click();
        currentShopFloralURL = driver.getCurrentUrl();
        System.out.println(currentShopFloralURL);
        return currentShopFloralURL;
    }

    public String clickShopPrivateBrands(){
        driver.findElement(Locators.LINK_SHOP).click();
        driver.findElement(Locators.LINK_SHOP_PRIVATE_BRANDS).click();
        currentShopPrivateBrandsURL = driver.getCurrentUrl();
        System.out.println(currentShopPrivateBrandsURL);
        return currentShopPrivateBrandsURL;
    }




}
