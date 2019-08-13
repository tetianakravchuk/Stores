import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CareersPage extends BaseActions { //Careers page methods to use
    //creating constructor for page
    public CareersPage(WebDriver driver, WebDriverWait wait){
        super(driver, wait);}



        String currentCareerURL;

        public String verifyCareerURL(){
            driver.findElement(Locators.CAREER_LINK).click();
            currentCareerURL = driver.getCurrentUrl();
            return currentCareerURL;

        }
    }


