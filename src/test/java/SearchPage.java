import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SearchPage extends BaseUI {
    String currentSearchURL;

    public SearchPage(WebDriver driver, WebDriverWait wait) {

    }


    @Test
    public void testSearch(){
        Assert.assertTrue(driver.findElement(Locators.SEARCH_HOME_PAGE).isDisplayed(), "Element is not found ");
        driver.findElement(Locators.SEARCH_HOME_PAGE).click();

        currentSearchURL = driver.getCurrentUrl();
        System.out.println(currentSearchURL);
        //Assert.assertEquals(currentSearchURL, Data.expectedSearchURL);
        softAssert.assertEquals(currentSearchURL, Data.expectedSearchURL, "URL is wrong");


    }


    public void validateAssertions(){
        Assert.assertEquals("web","Web is ");
        Assert.assertTrue(driver.findElement(By.xpath("//a")).isSelected(), "Element is not displayed");
        Assert.fail("Element is not displayed");
    }



}
