import org.testng.annotations.Test;

public class CareerTest extends BaseUI {

    String currentCareerURL;

    @Test
    public void navigateToCareerPage(){
        homePage.navigateToHomePage();
        String careerLink = careersPage.verifyCareerURL();
        //Assert.assertEquals(careerLink, Data.expectedCareerURL);
        driver.navigate().to(mainUrl);



    }

}
