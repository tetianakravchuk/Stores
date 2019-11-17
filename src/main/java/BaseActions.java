import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.math.BigInteger;
import java.net.HttpURLConnection;
import java.net.URL;
import java.security.SecureRandom;
import java.util.List;


public class BaseActions{ //created class for simple actions what is not connected to the website
    protected WebDriver driver;
    protected WebDriverWait wait;
    public BaseActions(WebDriver driver, WebDriverWait wait){ //constructor for drivers
        this.driver = driver;
        this.wait = wait;

    }

    public static String generateRandomString(){

        return new BigInteger(120, new SecureRandom()).toString(32);
    }
    public static String generateNewNumbers(String name, int length){
        return name + RandomStringUtils.random(length, "test133");
    }

    public void selectItemDropDownRandomOption(By locator, String dropDownName) {
        try {
            WebElement element = driver.findElement(locator);
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
            Select select = new Select(driver.findElement(locator));
            select.selectByIndex((int) (Math.random() * (select.getOptions().size() - 1)) + 1);
            System.out.println(dropDownName + ";" + select.getFirstSelectedOption().getText());
        } catch (NoSuchElementException e) {

        }
    }
    public void checkLinksOnWebPage(String typeElement, String attribute){
        List<WebElement> links = driver.findElements(By.xpath(typeElement));
        System.out.println("I start taking attributes on page");
        for (int i = 0; i < links.size(); i++) {
            WebElement ele = links.get(i);
            String url = ele.getAttribute(attribute);
            verifyLinkActive(url);


        }
        System.out.println("Total links are " + links.size());
    }

    public void verifyLinkActive(String linkUrl){
        try {
            URL url = new URL(linkUrl);
            HttpURLConnection httpURLConnect = (HttpURLConnection) url.openConnection();
            httpURLConnect.setConnectTimeout(3000);
            httpURLConnect.connect();
            if (httpURLConnect.getResponseCode() == 200) {
                System.out.println(linkUrl + " - " + httpURLConnect.getResponseMessage());
            } else if (httpURLConnect.getResponseCode() >= 400 && httpURLConnect.getResponseCode() <= 504) {
                System.out.println(linkUrl + " - " + httpURLConnect.getResponseMessage() + " - " + httpURLConnect.getResponseMessage());
            }
        } catch (Exception e){
            e.printStackTrace();
        }
    }



    public void ajaxClick(By by, int index){
        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(by));
        wait.until(ExpectedConditions.elementToBeClickable(by));
        ajaxClick(driver.findElements(by).get(index));
    }


     public void ajaxFocus(){
         JavascriptExecutor jse = (JavascriptExecutor) driver;
         jse.executeScript("document.getElementById('elementid').focus();");
     }


    public void ajaxClick(WebElement element){
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true)", element);
        wait.until(ExpectedConditions.elementToBeClickable(element));
        element.click();
    }
    public void ajaxClick(By by){
        wait.until(ExpectedConditions.presenceOfElementLocated(by));
        wait.until(ExpectedConditions.elementToBeClickable(by));
        ajaxClick(driver.findElement(by));
    }
    public void scrollDownPage(){
        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("window.scrollBy(0,1000)", "");
    }
    public void performClick(By locator){
        WebElement element= driver.findElement(locator);
       // javaWaitSec(3);
        Actions actions = new Actions(driver);
        actions.moveToElement(element).perform();
        actions.click().build().perform();
    }
    public void navigateToLinkPage(By locator, String text){
        Select select = new Select(driver.findElement(locator));
        select.selectByVisibleText(text);

    }

    public void getDropDownListByText(By locator, String text){
        Select select = new Select(driver.findElement(locator));
        select.selectByVisibleText(text);
    }
    public void getDropDownListByIndex(By locator, int index){
        Select select = new Select(driver.findElement(locator));
        select.selectByIndex(index);
    }
    public void getDropDownListByValue(By locator, String value){
        Select select = new Select(driver.findElement(locator));
        select.selectByValue(value);
    }
    public void clickUnselectedCheckBox(By checkbox){
        WebElement currentCheckbox = driver.findElement(checkbox);
        if(!currentCheckbox.isSelected()){
            ajaxClick(currentCheckbox);
        }

    }
    public void performClick(WebElement element){
        Actions actions = new Actions(driver);
        actions.moveToElement(element).perform();
        actions.click().build().perform();
    }
    public void performClick(By locator, int index){
        WebElement element= driver.findElements(locator).get(index);
        Actions actions = new Actions(driver);
        actions.moveToElement(element).perform();
        actions.click().build().perform();
    }

    public void waitForLoad() {
        ExpectedCondition<Boolean> pageLoadCondition = new ExpectedCondition<Boolean>() {
                    public Boolean apply(WebDriver driver) {
                        return ((JavascriptExecutor)driver).executeScript("return document.readyState").equals("complete");
                    }
                };
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(pageLoadCondition);
    }

    public void waitPageToLoad(){
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("return document.readyState").toString().equals("complete");

    }
    public void javaWait(int ms){
        try {
            Thread.sleep(ms);
        } catch (InterruptedException e){
            e.printStackTrace();
        }
    }
    public void javaWaitSec(int sec){
        try {
            Thread.sleep(sec*1000);
        }
        catch (InterruptedException e){
            e.printStackTrace();
        }
    }

    public void ajaxSendKeys(WebElement element, String text){
        ((JavascriptExecutor)driver).executeScript("arguments[0].setAttribute('value', '" + text + "')",element);
    }

    public int getSizeDropDownList(By locator){
        try{
            WebElement element = driver.findElement(locator);
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
            Select select = new Select (driver.findElement(locator));
            return select.getOptions().size();

        }
        catch (java.util.NoSuchElementException e){
            System.out.println("getSizedropDownList error");
        }
        return 0;
    }

    public void getDropdownSelected(String dropDown, String elementID)throws Exception{

        JavascriptExecutor executor = (JavascriptExecutor)driver;
        String dropdownScript = "var select = window.document.getElementById('" +
                dropDown +
                "'); for(var i = 0; i < select.options.length; i++){if(select.options[i].text == '" +
                elementID +
                "'){ select.options[i].selected = true; } }";

        Thread.sleep(2000);
        executor.executeScript(dropdownScript);
        Thread.sleep(2000);

        String clickScript = "if ("+"\"createEvent\""+" in document) {var evt = document.createEvent("+"\"HTMLEvents\""+");     evt.initEvent("+"\"change\""+", false, true); " + dropDown + ".dispatchEvent(evt); } else " + dropDown + ".fireEvent("+"\"onchange\""+");";

        executor.executeScript(clickScript);

    }

    public void selectStateDropDownOptionByName(){
        Select state = new Select(driver.findElement(By.xpath("//form[@id ='chooseStore']//select[@name='stateSelect']")));
        state.selectByVisibleText("MA");
        //state.getFirstSelectedOption();
    }
    public void selectCityDropDownOptionByName(){
        Select city = new Select(driver.findElement(By.xpath("//form[@id ='chooseStore']//select[@name='citySelect']")));
        city.selectByVisibleText("Acton");
        //state.getFirstSelectedOption();
    }
}
