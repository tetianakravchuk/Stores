import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CateringPage extends BaseActions {
    public CateringPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }
    String currentCateringURL;

    public String verifyCateringURL(){
        driver.findElement(Locators.LINK_SHOP_CATERING).click();
        currentCateringURL = driver.getCurrentUrl();
        return currentCateringURL;
    }

    public void selectStateDropDown(){
        driver.findElement(Locators.DROPDOWN_CHOOSE_STATE).click();

    }
    //public String selectStateDropDownRandomOption(Loactors.DROP_DOWN_STATE_LIST, "Select State")
}
