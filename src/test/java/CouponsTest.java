import org.testng.annotations.Test;

public class CouponsTest extends BaseUI {

    String currentBrowseCouponsURL;
    String currentLoadedCouponsURL;
    String currentOrderOnlineURL;


    @Test
    public void addCouponsTest(){
        homePage.signInPopUpWindow();
        homePage.viewAllCouponsHomePage();
        couponsPage.loadCoupons();

    }
}
