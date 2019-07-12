import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Registration extends BaseUI{
    String currentSignUpUrl;
    String currentNeedsCardUrl;

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
        driver.findElement(Locators.TEXT_FIELD_FIRSTNAME).sendKeys(Data.firstName);
        driver.findElement(Locators.TEXT_FIELD_LASTNAME).sendKeys(Data.lastName);
        driver.findElement(Locators.TEXT_FIELD_EMAIL).sendKeys(Data.emailRegistration);
        driver.findElement(Locators.TEXT_FIELD_PASSWORD).sendKeys(Data.passwordRegistration);
        driver.findElement(Locators.TEXT_FIELD_CONFIRM_PASSWORD).sendKeys(Data.confirmPassword);
        driver.findElement(Locators.TEXT_FIELD_ADDRESS).sendKeys(Data.address);
        driver.findElement(Locators.TEXT_FIELD_CITY).sendKeys(Data.city);
    }
}
