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
}
