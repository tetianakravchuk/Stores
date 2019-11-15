import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MainPage extends BaseActions{
    public MainPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }
    String currentMainPageURL;


    public void getToCateringPage(){
        driver.findElement(Locators.LINK_SHOP).click();
        driver.findElement(Locators.LINK_SHOP_CATERING).click();

    }
}
