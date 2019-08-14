import org.testng.annotations.Test;

public class HomePageTests extends BaseUI {


    @Test
    public void clickOnHomePageLogo(){
        homePage.navigateToHomePage();

    }

    @Test
    public void checkSavingsMenu(){
        homePage.navigateToHomePage();
        homePage.clickSavingsDigitalCoupons();
        //driver.navigate().to(mainUrl);
        homePage.clickSavingsWeeklyCircular();
        homePage.clickSavingsRewardsAndProgram();
    }

    @Test
    public void CheckShopMenu(){
        homePage.clickShopPeapodDelivery();
        homePage.clickShopCatering();
        homePage.clickShopGiftCards();
        homePage.clickShopFloral();
        homePage.clickShopPrivateBrands();
        //driver.navigate().to(mainUrl);

    }
}
