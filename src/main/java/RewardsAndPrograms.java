import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class RewardsAndPrograms extends BaseActions {
    public RewardsAndPrograms(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    public List<WebElement> collectLinksAboutStopAndShop() {

        List<WebElement> linksAboutStopAndShop = driver.findElements(Locators.ABOUT_STOP_AND_SHOP_LINK_LIST);
        return linksAboutStopAndShop;

        //for (int i = 0; i < linksAboutStopAndShop.size(); i++) {
        //  WebElement link = linksAboutStopAndShop.get(i);
        // String nameOfLink = link.getText();
        //link.click();
        // String titleOfAboutStopAndShopLinks = driver.findElement(Locators.H1_TITLE).getText();


    }
    public List<WebElement> collectCustomerSupportLinks(){
        List<WebElement> customerSupportLinks = driver.findElements(Locators.CUSTOMER_SUPPORT_LINKS);
        return customerSupportLinks;

    }

    public List<WebElement> collectCompanyLinks(){
        List<WebElement> companyLinks = driver.findElements(Locators.COMPANY_LINKS);
        return companyLinks;
    }
}

