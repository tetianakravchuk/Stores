import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class RewardsAndProgramTests extends BaseUI {
    String nameOfLink;
    String titleOfAboutStopAndShopLinks;
    String titleOfCustomerSupportLinks;
    String titleOfCompanyLinks;

    @Test
    public void testAboutStopAndShopLinksTitles() {
        mainPage.getToRewardsAndProgramPage(); // getting to the Rewards and Saving Page
        List<WebElement> linksAboutStopAndShop = driver.findElements(Locators.ABOUT_STOP_AND_SHOP_LINK_LIST); // getting (collect) all links to the list


        for (int i = 0; i < linksAboutStopAndShop.size(); i++) { // check each link and getting the size
            WebElement link = linksAboutStopAndShop.get(i); // create WebElement "Link" and put value in it
            nameOfLink = link.getText();
            System.out.println(i);// get text from this element
            if (i == 0) {
                continue;
            } else if (i == 1) {
                continue;
            } else if (i == 2) {
                continue;
            } else if (i == 3) {
                continue;
            } else if (i == 4) {
                continue;
            } else if (i == 5) {
                continue;
            }
            link.click(); // click on the element
            titleOfAboutStopAndShopLinks = rewardsAndPrograms.getAnyTitle(); // getting any title
            Assert.assertEquals(nameOfLink, titleOfAboutStopAndShopLinks); // compare links
            linksAboutStopAndShop = rewardsAndPrograms.collectLinksAboutStopAndShop();
        }

    }

    @Test
    public void testCustomerSupportLinksTitles() {
        mainPage.getToRewardsAndProgramPage(); // getting to the Rewards and Saving Page
        List<WebElement> linksCustomerSupport = driver.findElements(Locators.CUSTOMER_SUPPORT_LINKS); // getting (collect) all links to the list


        for (int i = 0; i < linksCustomerSupport.size(); i++) { // check each link and getting the size
            WebElement link = linksCustomerSupport.get(i); // create WebElement "Link" and put value in it
            nameOfLink = link.getText();
            System.out.println(i);// get text from this element
            if (i == 0) {
                continue;
            } else if (i == 1) {
                continue;
            } else if (i == 2) {
                continue;
            } else if (i == 3) {
                continue;
            } else if (i == 4) {
                continue;
            } else if (i == 5) {
                continue;
            }
            link.click(); // click on the element
            titleOfCustomerSupportLinks = rewardsAndPrograms.getAnyTitle(); // getting any title
            Assert.assertEquals(nameOfLink, titleOfAboutStopAndShopLinks); // compare links
            linksCustomerSupport = rewardsAndPrograms.collectLinksAboutStopAndShop();
        }

    }

    @Test
    public void testCompanyLinksTitles() {
        mainPage.getToRewardsAndProgramPage(); // getting to the Rewards and Saving Page
        List<WebElement> companyLinks = driver.findElements(Locators.COMPANY_LINKS); // getting all links to the list
        for (int i = 0; i < companyLinks.size(); i++) { // check all links
            WebElement links = companyLinks.get(i); // in links we put the value of 'i'
            nameOfLink = links.getText(); // getting the text from the link
            if (nameOfLink.contains("Careers")) {
                continue;
            } else if (nameOfLink.contains("Associate Connect")) {
                continue;
            } else if (nameOfLink.contains("New Suppliers")) {
                continue;
            } else {
                links.click(); // click on the element
                titleOfCompanyLinks = rewardsAndPrograms.getAnyTitle();
                Assert.assertEquals(nameOfLink, titleOfCompanyLinks);
                companyLinks = rewardsAndPrograms.collectCompanyLinks();


            }
        }

    }

}
