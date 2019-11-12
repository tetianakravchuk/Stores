import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class CateringPage extends BaseActions {
    public CateringPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }
    String currentCateringURL;

    public String verifyCateringURL(){
        //driver.findElement(Locators.LINK_SHOP_CATERING).click();
        currentCateringURL = driver.getCurrentUrl();
        return currentCateringURL;
    }

    public void selectStateDropDownMAState(){

        driver.findElement(Locators.DROPDOWN_CHOOSE_STATE).click();
        Select drpState = new Select(driver.findElement(By.name("stateSelect")));
        drpState.selectByVisibleText("MA");

    }

    public void printAllStateOption(){
        Select stateSelect = new Select((driver.findElement(By.name("stateSelect"))));
        List<WebElement> elementCount = stateSelect.getOptions();
        int iSize = elementCount.size();

        for(int i = 0; i<iSize; i++){
            String sValue = elementCount.get(i).getText();
            System.out.println(sValue);
        }
    }
    //public String selectStateDropDownRandomOption(Loactors.DROP_DOWN_STATE_LIST, "Select State")
}
