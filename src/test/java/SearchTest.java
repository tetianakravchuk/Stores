import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SearchTest extends BaseUI {
    String currentSearchURL;


    @Test
    public void testSearch(){
        driver.findElement(Locators.SEARCH_HOME_PAGE).click();
        currentSearchURL = driver.getCurrentUrl();
        System.out.println(currentSearchURL);
        Assert.assertEquals(currentSearchURL, Data.expectedSearchURL);

    }


    public void validateAssertions(){
        Assert.assertEquals("web","Web is ");
        Assert.assertTrue(driver.findElement(By.xpath("//a")).isSelected(), "Element is not displayed");
        Assert.fail("Element is not displayed");
    }



}
