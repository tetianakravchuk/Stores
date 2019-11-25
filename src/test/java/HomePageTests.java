import org.testng.annotations.Test;

public class HomePageTests extends BaseUI {

    String currentShopPeapodDeliveryURL;


    @Test
    public void clickOnHomePageLogo(){
        homePage.navigateToHomePage();

    }

    @Test
    public void checkSavingsMenu(){
        homePage.navigateToHomePage();
        homePage.clickSavingsDigitalCoupons();
        homePage.clickSavingsWeeklyCircular();
        homePage.clickSavingsRewardsAndProgram();
    }

    @Test
    public void checkShopMenu(){
        homePage.clickShopPeapodDelivery();
        homePage.clickShopCatering();
        homePage.clickShopGiftCards();
        homePage.clickShopFloral();
        homePage.clickShopPrivateBrands();


    }

    @Test
    public void checkSavoryMenu(){
        //homePage.clickSavorySavory();
       // homePage.clickSavoryBrowse();
        //homePage.clickSavoryMagazine();
        //homePage.clickSavoryFavorites();
    }

    @Test
    public void signInCouponPopUpWindow(){
        homePage.signInPopUpWindow();
    }

    @Test
    public void viewAllCouponsHomePage(){
        homePage.signInPopUpWindow();
        homePage.viewAllCouponsHomePage();
    }

    @Test
    public void shopOnlinePeapod(){
        homePage.peapodShopOnlineLink();
    }

    @Test
    public void learnMorePeapod(){
        homePage.learnMorePeapodLink();
    }

    @Test
    public void signInUnlockSavingsTest(){
        homePage.signInUnlockExclusiveSavingWindow();
    }

    @Test
    public void explorePrivateBrandsLinkTest(){
        homePage.explorePrivateBrandLink();

    }
    @Test
    public void aboutStopAndShopLinksTest(){
        homePage.ourStoryLink();
        homePage.privateBrandsLink();
        homePage.freshStoriesLink();
        homePage.storeDepartmentsLink();
        homePage.newsAndMediaLink();
        homePage.communityLink();

    }

    @Test
    public void customerSupportLinksTest(){
        homePage.contactUsLink();
        homePage.fAQLink();
        homePage.couponPolicyLink();
        homePage.foodSafetyLink();
        homePage.productRecallsLink();

    }

    @Test
    public void companyLinks(){
        homePage.careersLink();
        homePage.associateConnectLink();
        homePage.newsAndMediaLink();

    }

    @Test
    public void socialNetworkLinksTest(){
        homePage.socialNetworkLinks();
    }

    @Test
    public void termsAndConditionTest(){
        homePage.termsLink();
    }

    @Test
    public void apStoresTest(){
        homePage.appStoresLinks();

    }
    @Test
    public void checkLinks(){
        homePage.verifyLinkActive("https://stopandshop.com/");
    }
}
