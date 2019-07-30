import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Registration extends BaseUI{
    String currentSignUpUrl;
    String currentNeedsCardUrl;
    String currentFlexApplicationUrl;

    @Test
    public void loyaltyCardRegistration(){
        driver.findElement(Locators.LOYALTY_CARD_REGISTRATION).click();
        currentSignUpUrl = driver.getCurrentUrl();
        System.out.println(currentSignUpUrl);
        Assert.assertEquals(currentSignUpUrl, Data.expectedRegistrationUrl);
        driver.findElement(Locators.REGISTRATION_NEEDS_CARD_BUTTON).click();
        currentNeedsCardUrl = driver.getCurrentUrl();
        System.out.println(currentNeedsCardUrl);
        Assert.assertEquals(currentNeedsCardUrl, Data.expectedNeedsCardUrl);
        wait.until(ExpectedConditions.elementToBeClickable(Locators.TEXT_FIELD_FIRSTNAME));
        driver.findElement(Locators.TEXT_FIELD_FIRSTNAME).sendKeys(Data.firstName);
        driver.findElement(Locators.TEXT_FIELD_LASTNAME).sendKeys(Data.lastName);
        driver.findElement(Locators.TEXT_FIELD_EMAIL).sendKeys(generateEmail("gmail.com", 7));
        driver.findElement(Locators.TEXT_FIELD_PASSWORD).sendKeys(Data.passwordRegistration);
        driver.findElement(Locators.TEXT_FIELD_CONFIRM_PASSWORD).sendKeys(Data.confirmPassword);
        driver.findElement(Locators.TEXT_FIELD_ADDRESS).sendKeys(Data.address);
        driver.findElement(Locators.TEXT_FIELD_CITY).sendKeys(Data.city);
        driver.findElement((By.xpath("//div[@class ='chosen-container chosen-container-single']//a[@class ='chosen-single chosen-default']"))).click();
        driver.findElement(By.xpath("//li[@id ='state-Massachusetts']")).click();
        driver.findElement(Locators.TEXT_FIELD_ZIP).sendKeys(Data.zipCode);
        driver.findElement(Locators.TEXT_FIELD_PHONE).clear();
        driver.findElement(Locators.TEXT_FIELD_PHONE).sendKeys(generateNewNumber("",10));
        driver.findElement(By.id("checkbox-email-label")).click();
        driver.findElement(By.id("checkbox-sharing-label")).click();
        driver.findElement(By.id("checkbox-email-label")).click();
        driver.findElement(By.id("checkbox-sharing-label")).click();
        driver.findElement(By.xpath("//div[@class= \"chosen-drop\"]//ul[@id=\"storeNumber-list\"]"));
        driver.findElement(By.xpath("//label[@id =\"label-storeNumber_chosen\"]")).click();
        driver.findElement(By.xpath("//li[@id=\"storeNumber-160_Summer_Street__Kingston__MA_02364\"]")).click();
        driver.findElement(By.id("checkbox-agree-label")).click();
        driver.findElement(By.xpath("//input[@id =\"checkbox-agree\"]")).isSelected();
        driver.findElement(By.xpath("//button[@id ='registration-submit-button']")).click();
        //driver.findElement(Locators.NEXT_BUTTON_REGISTRATION).click();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        //wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//a[@id ='skipBtn']"))));
        currentFlexApplicationUrl = driver.getCurrentUrl();
        System.out.println(currentFlexApplicationUrl);
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//a[@id ='skipBtn']"))));
        //Assert.assertEquals(currentFlexApplicationUrl, Data.expectedFlexApplicationUrl);
    }

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





