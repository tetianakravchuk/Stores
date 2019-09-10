import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
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



    public void loadCoupons(){
        List<WebElement> elementsxpath = driver.findElements(Locators.BROWSE_COUPONS_LOADED_COUPONS);
        for(int i=0; i<elementsxpath .size(); i++) {
            System.out.println(elementsxpath);
        }
    }

    public void addVisibleCoupons(){
        List<WebElement> elements = driver.findElements((By.xpath("//button[@class ='c-coupon-small__button js-coremetrics-location js-load-to-card'")));
        java.util.Iterator<WebElement> i = elements.iterator();
        while(i.hasNext()) {
            WebElement element = i.next();
            if (element.isDisplayed()) {
                // Do something with the element
            }
        }
    }

    public void sumVisibleCoupons(){
        List<WebElement> CouponsTable = driver.findElements((By.xpath("//div[@class ='c-coupon__action']")));
        System.out.println("Number of links: " + CouponsTable.size());
        for(WebElement ele : CouponsTable){
            //ele.sendKeys("value");
            System.out.println(ele.getText());
            //System.out.println(ele.getAttribute("id"));
            //System.out.println(ele.getTagName());
        }


    }

    public void sizeCouponsList(){
        String selector = "//button[@class ='c-coupon__button a-button -red -grows -full-width js-load-to-card js-coremetrics-location']";
        int coupons = driver.findElements(By.xpath(selector)).size();
        System.out.println("Number of coupons: " + coupons);
        for (int i = 0; i < coupons; i++) {
            List<WebElement> CTable = driver.findElements(By.xpath(selector));
            WebElement client = CTable.get(i);
            System.out.println(client.getText().substring(0, 1000));
            client.click();

        }
    }


    public void couponsList(){
        //Identify the link
        WebElement selectLink = driver.findElement((By.xpath("//button[@class ='c-coupon__button a-button -red -grows -full-width js-load-to-card js-coremetrics-location']")));
        //Identify the individual links for each of the options in the simulated select
        List<WebElement> optionLinks = driver.findElements((By.xpath("//div[@class ='c-coupon__action']")));

    }

   public void addAllCoupons(){
        List<WebElement> allElements = driver.findElements(Locators.COUPONS_LOAD_TO_CARD_THREE);
        for (WebElement coupons:allElements){
            driver.findElement(Locators.COUPONS_LOAD_TO_CARD_THREE).click();
        }

   }

    //public void addCoupons(){
      //  driver.findElement(Locators.COUPONS_PLUS_CLICK_ONE).click();
       // driver.findElement(Locators.COUPONS_PLUS_CLICK_TWO).click();

    //}

    public void confirmAutoAddCoupons(){
        driver.findElement(Locators.COUPONS_LOAD_TO_CARD_ONE).click();
        driver.findElement(Locators.YES_AUTOMATICALLY_ADD).click();
    }

    public void addCoupons(){
        WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement coupons = wait.until(ExpectedConditions.elementToBeClickable(Locators.COUPONS_LOAD_TO_CARD_ONE));
        driver.findElement(Locators.COUPONS_LOAD_TO_CARD_ONE).click();
        //ajaxClick(Locators.COUPONS_PLUS_CLICK_ONE);
        driver.findElement(Locators.YES_AUTOMATICALLY_ADD).click();
        driver.findElement(Locators.COUPONS_LOAD_TO_CARD_TWO).click();

    }
    public void viewAllCouponsHomePage(){
        // driver.findElement(Locators.LINK_HOME).click();
        driver.findElement(Locators.VIEW_ALL_COUPONS_HOME_PAGE).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //waitPageToLoad();
        //currentBrowseCouponsURL = driver.getCurrentUrl();
        //Assert.assertEquals(currentBrowseCouponsURL, Data.expectedBrowseCouponsURL);
        //System.out.println(currentBrowseCouponsURL);


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

        public void firstTimeAddCouponsYes(){

        }
        public void firstTimeAddCouponsNo(){

    }
        }


