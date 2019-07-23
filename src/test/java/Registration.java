import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Registration extends BaseUI{
    String currentSignUpUrl;
    String currentNeedsCardUrl;
    String currentFuelRewardsUrl;
    private boolean isChecked;
    private WebElement e;

    @Test
    public void loyaltyCardRegistration(){
        driver.findElement(Locators.LOYALTY_CARD_REGISTRATION).click();
        currentSignUpUrl = driver.getCurrentUrl();
        System.out.println(currentSignUpUrl);
        Assert.assertEquals(currentSignUpUrl, Data.expectedRegistrationUrl);
        //wait.until(ExpectedConditions.visibilityOf(Locators.REGISTRATION_NEEDS_CARD_BUTTON))
        driver.findElement(Locators.REGISTRATION_NEEDS_CARD_BUTTON).click();
        currentNeedsCardUrl = driver.getCurrentUrl();
        System.out.println(currentNeedsCardUrl);
        Assert.assertEquals(currentNeedsCardUrl, Data.expectedNeedsCardUrl);
        driver.findElement(Locators.TEXT_FIELD_FIRSTNAME).sendKeys(Data.firstName);
        driver.findElement(Locators.TEXT_FIELD_LASTNAME).sendKeys(Data.lastName);
        driver.findElement(Locators.TEXT_FIELD_EMAIL).sendKeys(Data.emailRegistration);
        driver.findElement(Locators.TEXT_FIELD_PASSWORD).sendKeys(Data.passwordRegistration);
        driver.findElement(Locators.TEXT_FIELD_CONFIRM_PASSWORD).sendKeys(Data.confirmPassword);
        driver.findElement(Locators.TEXT_FIELD_ADDRESS).sendKeys(Data.address);
        driver.findElement(Locators.TEXT_FIELD_CITY).sendKeys(Data.city);
         // Create instance of Javascript executor
        driver.findElement((By.xpath("//div[@class ='chosen-container chosen-container-single']//a[@class ='chosen-single chosen-default']"))).click();
        //select.selectByVisibleText("Massachusetts");
        //JavascriptExecutor js = (JavascriptExecutor)driver;
        //Identify the WebElement which will appear after scrolling down
//        WebDriverWait waitState = new WebDriverWait(driver, 10);
//        WebElement elementState = waitState.until(ExpectedConditions.visibilityOfElementLocated(By.id("state_chosen")));
//        elementState.click();
        selectFromDropDown(driver.findElement(By.xpath("//li[@id ='state-Massachusetts']")), "Massachusetts");
//         driver.findElement((By.xpath("//li[@id ='state-Massachusetts']")));
//         ajaxClick(selectState);
        // now execute query which actually will scroll until that element is not appeared on page.
        //js.executeScript("arguments[0].scrollIntoView(true);");
        driver.findElement(Locators.TEXT_FIELD_ZIP).sendKeys(Data.zipCode);
        driver.findElement(Locators.TEXT_FIELD_PHONE).sendKeys(Data.phone);
       //driver.findElement(By.id("checkbox-email-label")).isSelected();
        WebDriverWait waitEmail = new WebDriverWait(driver, 10);
        WebElement elementEmail = waitEmail.until(ExpectedConditions.visibilityOfElementLocated(By.id("checkbox-email-label")));
        elementEmail.click();
        WebDriverWait waitHouseHoldCard = new WebDriverWait(driver, 10);
        WebElement elementHouseHoldCard = waitHouseHoldCard.until(ExpectedConditions.visibilityOfElementLocated(By.id("checkbox-sharing-label")));
        elementHouseHoldCard.click();


        driver.findElement(By.id("checkbox-email-label")).click();
       // driver.findElement(By.id("checkbox-sharing-label")).isSelected();
        driver.findElement(By.id("checkbox-sharing-label")).click();


       driver.findElement(By.xpath("//div[@class= \"chosen-drop\"]//ul[@id=\"storeNumber-list\"]"));
        driver.findElement(By.xpath("//label[@id =\"label-storeNumber_chosen\"]")).click();
        driver.findElement(By.xpath("//li[@id=\"storeNumber-160_Summer_Street__Kingston__MA_02364\"]")).click();
        WebDriverWait wait = new WebDriverWait(driver, 2);
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("checkbox-agree-label")));
        element.click();
        driver.findElement(By.xpath("//input[@id =\"checkbox-agree\"]")).isSelected();
        driver.findElement(By.xpath("//button[@id ='registration-submit-button']")).click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//        currentFuelRewardsUrl = driver.getCurrentUrl();
//        System.out.println(currentFuelRewardsUrl);
//        Assert.assertEquals(currentFuelRewardsUrl, Data.expectedFuelRewardsUrl);
        driver.findElement(By.xpath("//a[@class =\"defer-link zeta a-link-blue\"]")).click();
            //driver.findElement(By.xpath("//input[@id =\"checkbox-agree\"]")).click();


        //js.executeScript("arguments[0].scrollIntoView(true);");

//        public void registration(){
//            driver.findElement(By.cssSelector("#utility-nav-login")).click();
//            ajaxClick(driver.findElement(By.xpath("//div[@id='utility-nav-login-pane-dropdown']//a[@href='/sign-up']")));
//
           }

         public void selectFromDropDown(WebElement element , String Visibletext){
          Select select = new Select(element);
          select.selectByVisibleText(Visibletext);
    }
//

//
//
//


//
//    public void ajaxClick(Select element){
//        WebDriverWait wait = new WebDriverWait(driver, 3);
//        JavascriptExecutor js = ((JavascriptExecutor) driver);
//        js.executeScript("arguments[0].scrollIntoView(true);", element);
//
//
//        //((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
//        wait.until(ExpectedConditions.elementToBeClickable(element));

    }



