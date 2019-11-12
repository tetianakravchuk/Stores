import org.testng.annotations.Test;

public class CateringTests extends BaseUI {

    @Test
    public void selectRandomDropDownList() {
        driver.findElement(Locators.LINK_SHOP).click();
        driver.findElement(Locators.LINK_SHOP_CATERING).click();
        //cateringPage.verifyCateringURL();
        //cateringPage.selectStateDropDownMAState();
        driver.findElement(Locators.DROPDOWN_CHOOSE_STATE).click();
       // cateringPage.printAllStateOption();

       // for (int i = 0; i < 20; i++) {

        //}

    }
}

