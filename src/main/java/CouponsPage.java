import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class CouponsPage extends BaseActions {
    public CouponsPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }
  String currentBrowseCouponsURL;





    public void clickCouponSignIn(){
        driver.findElement(Locators.COUPONS_PLUS_CLICK_ONE).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    public void viewAllAvailableCoupons(){
        driver.findElement(Locators.VIEW_ALL_COUPONS_HOME_PAGE).click();
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

    public void viewAllCouponsHomePage(){
        driver.findElement(Locators.VIEW_ALL_COUPONS_HOME_PAGE).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        waitPageToLoad();
        //currentBrowseCouponsURL = driver.getCurrentUrl();
        //Assert.assertEquals(currentBrowseCouponsURL, Data.expectedBrowseCouponsURL);
        //System.out.println(currentBrowseCouponsURL);

    }


    public void loadCoupons(){
        List<WebElement> elementsxpath = driver.findElements(Locators.ADD_COUPONS_BROWSE_COUPONS_TAB);
        for(int i=0; i<elementsxpath .size(); i++) {
            System.out.println(elementsxpath);
        }
    }
}
