import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
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

    public void clickIfVisible(){
            //driver.get("https://stopandshop.com/");
            if(driver.findElement(Locators.VIEW_ALL_COUPONS_HOME_PAGE).isDisplayed()){

                System.out.println("Element is Present");
                driver.findElement(Locators.VIEW_ALL_COUPONS_HOME_PAGE).click();
                //driver.findElement(Locators.COUPONS_LOAD_TO_CARD_ONE).click();
                //driver.findElement(Locators.YES_AUTOMATICALLY_ADD).click();
                //driver.findElement(Locators.COUPONS_LOAD_TO_CARD_TWO).click();
                //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                //driver.findElement(Locators.USERNAME_SIGN_IN_POPUP_WINDOW).sendKeys(Data.email);
                //driver.findElement(Locators.PASSWORD_SIGN_IN_POPUP_WINDOW).sendKeys(Data.password);
                //driver.findElement(Locators.SIGN_IN_POPUP_WINDOW).click();
            }
            else{

                driver.findElement(Locators.COUPONS_PLUS_CLICK_ONE).click();
                driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                driver.findElement(Locators.USERNAME_SIGN_IN_POPUP_WINDOW).sendKeys(Data.email);
                driver.findElement(Locators.PASSWORD_SIGN_IN_POPUP_WINDOW).sendKeys(Data.password);
                driver.findElement(Locators.SIGN_IN_POPUP_WINDOW).click();
                driver.findElement(Locators.VIEW_ALL_COUPONS_HOME_PAGE).click();}


        }

    public void getToShoppingList(){
        driver.findElement(Locators.BUTTON_SIGN_IN_UNLOCK).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(Locators.USERNAME_SIGN_IN_POPUP_WINDOW).sendKeys(Data.email);
        driver.findElement(Locators.PASSWORD_SIGN_IN_POPUP_WINDOW).sendKeys(Data.password);
        driver.findElement(Locators.SIGN_IN_POPUP_WINDOW).click();
        driver.navigate().refresh();
        driver.findElement(Locators.SHOPPING_LIST_HOME_PAGE).click();


    }

    public void addFavoritesType(){
        driver.findElement(Locators.SHOPPING_LIST_FAVORITES_BUTTON).click();
        driver.findElement(Locators.SHOPPING_LIST_FAVORITES_FIELD).click();
        WebElement addItem = driver.findElement(Locators.SHOPPING_LIST_FAVORITES_FIELD);
        ajaxClick(addItem);

        addItem.click();
        addItem.sendKeys(Data.favoriteItemTwo);
        //driver.findElement(Locators.SHOPPING_LIST_FAVORITES_ADD_BUTTON).click();

    }


}
