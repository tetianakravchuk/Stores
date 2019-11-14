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

       // driver.findElement(Locators.DROPDOWN_CHOOSE_STATE).click();
        //Select drpState = new Select(driver.findElement(By.name("stateSelect")));
        //drpState.selectByVisibleText("MA");

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

    public void selectVisibleState(){
        Select state = new Select(driver.findElement(By.name("stateSelect")));
        state.selectByVisibleText("MA");
        state.selectByIndex(3);
    }

    public void getAllStates(){
        WebElement state_dropdown = driver.findElement(By.name("stateSelect"));
        Select state = new Select(state_dropdown);

        List<WebElement>dropdown = state.getOptions();

        for(int i=0;i<dropdown.size();i++){

            String drop_down_values = dropdown.get(i).getText();

            System.out.println("dropdown values are "+drop_down_values);

        }
    }

}
