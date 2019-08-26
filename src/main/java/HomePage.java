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
    //Private Brands
    String currentExplorePrivateBrandsURL;
    //Footer Links
    //About Stop and Shop
    String currentOurStoryURL;
    String currentPrivateBrandsURL;
    String currentFreshStoriesURL;
    String currentStoreDepartmentsURL;
    String currentNewAndMediaURL;
    String currentCommunityURL;
    //Customer Support
    String currentContactUsURL;
    String currentFAQURL;
    String currentCouponPolicyURL;
    String currentFoodSafetyURL;
    String currentProductRecallsURL;
    //Company
    String currentCareersURL;
    String currentAssociateConnectURL;
    String currentNewSuppliers;
    //App Store and Google Links
    String currentAppStoreURL;
    String currentGooglePlayURL;
    //Term and Conditions
    String currentTermsOfUseURL;
    String currentPrivatePoicy;
    //Social Network Links
    String currentFacebookURL;
    String currentPinterestURL;
    String currentTwitterURL;
    String currentYoutubeURL;
    String currentInstagramURL;




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
    public void signInUnlockExclusiveSavingWindow(){

        driver.findElement(Locators.SIGN_IN_UNLOCK_SAVINGS).click();
        driver.findElement(Locators.USERNAME_SIGN_IN_POPUP_WINDOW).sendKeys(Data.email);
        driver.findElement(Locators.PASSWORD_SIGN_IN_POPUP_WINDOW).sendKeys(Data.password);
        driver.findElement(Locators.SIGN_IN_POPUP_WINDOW).click();
        //driver.findElement(Locators.CLOSE_SIGN_IN_POPUP_WINDOW_BUTTON).click();
        driver.navigate().refresh();
    }

    public void explorePrivateBrandLink(){
        driver.findElement(Locators.EXPLORE_OUR_PRIVATE_BRANDS).click();
        currentExplorePrivateBrandsURL = driver.getCurrentUrl();
        Assert.assertEquals(currentExplorePrivateBrandsURL, Data.expectedExplorePrivateBrandsURL);
        System.out.println(currentExplorePrivateBrandsURL);
    }
    //Footer links
    public void ourStoryLink(){
        driver.findElement(Locators.OUR_STORY).click();
        currentOurStoryURL = driver.getCurrentUrl();
        Assert.assertEquals(currentOurStoryURL, Data.expectedOurStoryURL);
        System.out.println(currentOurStoryURL);
        goBackClick();

    }
    public void privateBrandsLink(){
        driver.findElement(Locators.PRIVATE_BRANDS).click();
        currentPrivateBrandsURL = driver.getCurrentUrl();
        Assert.assertEquals(currentPrivateBrandsURL, Data.expectedPrivateBrandsURL);
        System.out.println(currentPrivateBrandsURL);
        goBackClick();

    }
    public void freshStoriesLink(){
        driver.findElement(Locators.FRESH_STORIES).click();
        currentFreshStoriesURL = driver.getCurrentUrl();
        Assert.assertEquals(currentFreshStoriesURL, Data.expectedFreshStoriesURL);
        System.out.println(currentFreshStoriesURL);

    }
    public void storeDepartmentsLink(){
        driver.findElement(Locators.STORE_DEPARTMENTS).click();
        currentStoreDepartmentsURL = driver.getCurrentUrl();
        Assert.assertEquals(currentStoreDepartmentsURL, Data.expectedStoreDepartmentsURL);
        System.out.println(currentStoreDepartmentsURL);

    }
    public void newsAndMediaLink(){
        driver.findElement(Locators.NEWS_AND_MEDIA).click();
        currentNewAndMediaURL = driver.getCurrentUrl();
        Assert.assertEquals(currentNewAndMediaURL, Data.expectedNewsMediaURL);
        System.out.println(currentNewAndMediaURL);

    }
    public void communityLink(){
        driver.findElement(Locators.COMMUNITY).click();
        currentCommunityURL = driver.getCurrentUrl();
        Assert.assertEquals(currentCommunityURL, Data.expectedCommunityURL);
        System.out.println(currentCommunityURL);

    }

    //Customer Support Links
    public void contactUsLink(){
        driver.findElement(Locators.CONTACT_US).click();
        currentContactUsURL = driver.getCurrentUrl();
        Assert.assertEquals(currentContactUsURL, Data.expectedContactUsURL);
        System.out.println(currentContactUsURL);
        goBackClick();

    }

    public void fAQLink(){
        driver.findElement(Locators.FAQ).click();
        currentFAQURL = driver.getCurrentUrl();
        Assert.assertEquals(currentFAQURL, Data.expectedFAQURL);
        System.out.println(currentFAQURL);

    }
    public void couponPolicyLink(){
        driver.findElement(Locators.COUPON_POLICY).click();
        currentCouponPolicyURL = driver.getCurrentUrl();
        Assert.assertEquals(currentCouponPolicyURL, Data.expectedCouponPolicyURL);
        System.out.println(currentCouponPolicyURL);

    }
    public void foodSafetyLink(){
        driver.findElement(Locators.FOOD_SAFETY).click();
        currentFoodSafetyURL = driver.getCurrentUrl();
        Assert.assertEquals(currentFoodSafetyURL, Data.expectedFoodSafetyURL);
        System.out.println(currentFoodSafetyURL);

    }
    public void productRecallsLink(){
        driver.findElement(Locators.PRODUCT_RECALLS).click();
        currentProductRecallsURL = driver.getCurrentUrl();
        Assert.assertEquals(currentProductRecallsURL, Data.expectedProductRecallsURL);
        System.out.println(currentProductRecallsURL);

    }

    //Company Links
    public void careersLink(){
        driver.findElement(Locators.CAREER_LINK).click();
        currentCareersURL = driver.getCurrentUrl();
        Assert.assertEquals(currentCareersURL, Data.expectedCareersUrl);
        System.out.println(currentCareersURL);

    }
    public void associateConnectLink(){
        driver.findElement(Locators.ASSOCIATE_CONNECT).click();
        currentAssociateConnectURL = driver.getCurrentUrl();
        Assert.assertEquals(currentAssociateConnectURL, Data.expectedAssociateConnectUrl);
        System.out.println(currentAssociateConnectURL);
        goBackClick();

    }
    public void newSuppliersLink(){
        driver.findElement(Locators.ASSOCIATE_CONNECT).click();
        currentNewSuppliers = driver.getCurrentUrl();
        Assert.assertEquals(currentNewSuppliers, Data.expectedNewSuppliersUrl);
        System.out.println(currentNewSuppliers);

    }

    //App Stores and Google Play Links
    public void appStoreLink(){
        driver.findElement(Locators.APP_STORE).click();
        currentAppStoreURL = driver.getCurrentUrl();
        Assert.assertEquals(currentAppStoreURL, Data.expectedAppStoreURL);
        System.out.println(currentAppStoreURL);

    }

    public void googlePlayLink(){
        driver.findElement(Locators.GOOGLE_PLAY).click();
        currentGooglePlayURL = driver.getCurrentUrl();
        Assert.assertEquals(currentGooglePlayURL, Data.expectedGooglePlayURL);
        System.out.println(currentGooglePlayURL);

    }

    //Terms and Conditions

    public void termsLink(){
        driver.findElement(Locators.TERMS_OF_USE).click();
        currentTermsOfUseURL = driver.getCurrentUrl();
        Assert.assertEquals(currentTermsOfUseURL, Data.expectedTermsOfUseURL);
        System.out.println(currentTermsOfUseURL);

    }

    public void privacyPolicyLink(){
        driver.findElement(Locators.PRIVACY_POLICY).click();
        currentPrivatePoicy = driver.getCurrentUrl();
        Assert.assertEquals(currentPrivatePoicy, Data.expectedPrivacyPolicyURL);
        System.out.println(currentPrivatePoicy);

    }
    //Social Network Links
    public void socialNetworkLinks(){
        driver.findElement(Locators.FACEBOOK_HOMEPAGE_LINK).click();
        currentFacebookURL = driver.getCurrentUrl();
        Assert.assertEquals(currentFacebookURL, Data.expectedFacebookLURL);
        System.out.println(currentFacebookURL);
        goBackClick();

        driver.findElement(Locators.PINTEREST_HOMEPAGE_LINK).click();
        currentPinterestURL = driver.getCurrentUrl();
        Assert.assertEquals(currentPinterestURL, Data.expectedPinterestURL);
        System.out.println(currentPinterestURL);
        goBackClick();

        driver.findElement(Locators.TWITTER_HOMEPAGE_LINK).click();
        currentTwitterURL = driver.getCurrentUrl();
        Assert.assertEquals(currentTwitterURL, Data.expectedTwitterURL);
        System.out.println(currentTwitterURL);
        goBackClick();

        driver.findElement(Locators.YOUTUBE_HOMEPAGE_LINK).click();
        currentYoutubeURL = driver.getCurrentUrl();
        Assert.assertEquals(currentYoutubeURL, Data.expectedYoutubeURL);
        System.out.println(currentYoutubeURL);
        goBackClick();

        driver.findElement(Locators.INSTAGRAM_HOMEPAGE_LINK).click();
        currentInstagramURL = driver.getCurrentUrl();
        Assert.assertEquals(currentInstagramURL, Data.expectedInstagramURL);
        System.out.println(currentInstagramURL);
        goBackClick();

    }


    public void appStoresLinks(){
        driver.findElement(Locators.APP_STORE).click();
        currentAppStoreURL = driver.getCurrentUrl();
        Assert.assertEquals(currentAppStoreURL, Data.expectedAppStoreURL);
        System.out.println(currentAppStoreURL);
        goBackClick();

        driver.findElement(Locators.GOOGLE_PLAY).click();
        currentGooglePlayURL = driver.getCurrentUrl();
        Assert.assertEquals(currentGooglePlayURL, Data.expectedGooglePlayURL);
        System.out.println(currentGooglePlayURL);
        goBackClick();
}

}
