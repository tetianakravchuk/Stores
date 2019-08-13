import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage extends BaseActions {
    public HomePage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);}

        String currentHomeURL;
        String currentDigitalCouponsURL;
        String currentWeeklyCircularURL;
        String currentRewardsAndProgramURL;


        public void navigateToHomePage(){
            driver.findElement(Locators.LINK_HOME).click();
            currentHomeURL = driver.getCurrentUrl();

    }
    public String  clickSavingsDigitalCoupons(){
            driver.findElement(Locators.LINK_SAVINGS).click();
            driver.findElement(Locators.LINK_DIGITAL_COUPONS).click();
            currentWeeklyCircularURL = driver.getCurrentUrl();
            System.out.println(currentWeeklyCircularURL);
            return currentWeeklyCircularURL;
    }

    public String  clickRewardsAndProgram(){
        driver.findElement(Locators.LINK_SAVINGS).click();
        driver.findElement(Locators.LINK_REWARDS_AND_PROGRAM).click();
        currentRewardsAndProgramURL = driver.getCurrentUrl();
        System.out.println(currentRewardsAndProgramURL);
        return currentRewardsAndProgramURL;
    }

    public String  clickSavingsWeeklyCircular(){
        driver.findElement(Locators.LINK_SAVINGS).click();
        driver.findElement(Locators.LINK_WEEKLY_CIRCULAR).click();
        currentWeeklyCircularURL = driver.getCurrentUrl();
        System.out.println(currentDigitalCouponsURL);
        return currentDigitalCouponsURL;
    }
}
