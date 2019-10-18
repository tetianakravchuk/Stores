import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.math.BigInteger;


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
    public static String generateNewNumbers(String name, int lengh){
        return name + RandomStringUtils.random(lengh, "test133");
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
}
