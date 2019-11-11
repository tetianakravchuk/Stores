import org.testng.annotations.Test;

public class CateringTests extends BaseUI {

    @Test
    public void selectRandomDropDownList() {
        driver.findElement(Locators.LINK_SHOP).click();
        driver.findElement(Locators.LINK_SHOP_CATERING);
        cateringPage.selectStateDropDown();
       // for (int i = 0; i < 20; i++) {

        //}

    }
}

