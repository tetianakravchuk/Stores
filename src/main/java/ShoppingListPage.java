import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class ShoppingListPage extends BaseActions {
    public ShoppingListPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    String currentShoppingListPage;

    public void clickCouponSignIn(){
        driver.findElement(Locators.COUPONS_PLUS_CLICK_ONE).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
    public void getToShoppingList(){
        clickCouponSignIn();
        driver.findElement(Locators.USERNAME_SIGN_IN_POPUP_WINDOW).sendKeys(Data.email);
        driver.findElement(Locators.PASSWORD_SIGN_IN_POPUP_WINDOW).sendKeys(Data.password);
        driver.findElement(Locators.SIGN_IN_POPUP_WINDOW).click();
        driver.findElement(Locators.SHOPPING_LIST_HOME_PAGE).click();


    }


}
