import org.testng.annotations.Test;

public class HomePageTests extends BaseUI {


    @Test
    public void clickOnHomePageLogo(){
        homePage.navigateToHomePage();

    }

    @Test
    public void clickOnSavingsMenu(){
        homePage.navigateToHomePage();
        String clickSavingsDigitalCoupons = homePage.clickSavingsDigitalCoupons();
        //Assert.assertEquals(clickSavingsDigitalCoupons, Data.DigitalCouponsURL);
        driver.navigate().to(mainUrl);
        String clickSavingsWeeklyCircular = homePage.clickSavingsWeeklyCircular();
        //Assert.assertEquals(clickSavingsWeeklyCircular, Data.WeeklyCircularURL);
        homePage.clickRewardsAndProgram();
    }
}
