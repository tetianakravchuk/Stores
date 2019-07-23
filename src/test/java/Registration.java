import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Registration extends BaseUI{
    String currentSignUpUrl;
    String currentNeedsCardUrl;
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
        JavascriptExecutor js = (JavascriptExecutor)driver;
        //Identify the WebElement which will appear after scrolling down
        WebElement state = driver.findElement(By.xpath("//li[@id ='state-Massachusetts']"));
        // now execute query which actually will scroll until that element is not appeared on page.
        js.executeScript("arguments[0].scrollIntoView(true);",state);
        driver.findElement(Locators.TEXT_FIELD_ZIP).sendKeys(Data.zipCode);
        driver.findElement(Locators.TEXT_FIELD_PHONE).sendKeys(Data.phone);
        if ( !driver.findElement(By.id("checkbox-email-label")).isSelected() )
        {
            driver.findElement(By.id("checkbox-email-label")).click();
        }
        if ( !driver.findElement(By.id("checkbox-sharing-label")).isSelected() )
        {
            driver.findElement(By.id("checkbox-sharing-label")).click();
        }

        JavascriptExecutor js2 = (JavascriptExecutor)driver;
        driver.findElement((By.xpath("//div[@class=\"chosen-container chosen-container-single has-tip top\"]//a[@class=\"chosen-single chosen-default\"]"))).click();
        js2.executeScript("window.scrollBy(0,500)");
        WebDriverWait wait = new WebDriverWait(driver, 5);// 1 minute
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[@id=\"storeNumber-160_Summer_Street__Kingston__MA_02364\"]")));

        //js2.executeScript("window.scrollBy(0,document.body.scrollHeight)");
        WebElement store = driver.findElement(By.xpath("//li[@id=\"storeNumber-160_Summer_Street__Kingston__MA_02364\"]"));
        js2.executeScript("arguments[0].scrollIntoView(true);",store);

//        public void registration(){
//            driver.findElement(By.cssSelector("#utility-nav-login")).click();
//            ajaxClick(driver.findElement(By.xpath("//div[@id='utility-nav-login-pane-dropdown']//a[@href='/sign-up']")));
//
//        }
//
//

//
//
//

    }
    public void ajaxClick(WebElement element){
        WebDriverWait wait = new WebDriverWait(driver, 3);
        JavascriptExecutor js = ((JavascriptExecutor) driver);

        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
        wait.until(ExpectedConditions.elementToBeClickable(element));

    }


}
