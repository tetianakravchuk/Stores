import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Conditions extends BaseUI{
    @Test
    public void test() {
        String fruit1 = "Kiwi";
        String fruit2 = "Kiwi";

        if (fruit1.contains("Kiwi") || fruit2.contains("Orange")) {
            System.out.println("We can find our fruit1!");

        } else {
            Assert.fail("We cant find fruit2");

        }
    }

    @Test
    public void test2() {
        int number1 = 10;
        int number2 = 10;
        int sum;

        if (number1 == number2) {
            sum = 95 + 100;


        } else {
            sum = 100 - 95;


        }
        System.out.println(sum);


    }

    @Test
    public void test3(){
        boolean requirement = true;
        if(requirement){
            System.out.println("Boolean is true");
        }else{
          Assert.fail("Boolean is false");
        }
        {

        }
    }

    @Test
    public void test4(){
        WebElement tabSearch = driver.findElement(Locators.SEARCH_HOME_PAGE);

        if(tabSearch.getText().contains("PRETTY WOMAN")) {
            tabSearch.click();
        }else{
            Assert.fail("We cannot find Pretty Woman tab");

        }

    }


    @Test
    public void test5(){
        WebElement tabSearch = driver.findElement(Locators.SEARCH_HOME_PAGE);

        if(tabSearch.isDisplayed()) {
            tabSearch.click();
        }else{
            Assert.fail("We cannot find Search");

        }

    }
    @Test
    public void test6(){
       List<String> testList = new ArrayList<String>(Arrays.asList("Orange", "Kiwi","Melon"));
       String element = testList.get(0);
        System.out.println(element);
    }

    @Test
    public void test7(){
        List<Integer> testList = new ArrayList<Integer>(Arrays.asList(5,6,8));
        int sum = testList.get(1) + testList.get(2);
        System.out.println(sum);
    }

    @Test
    public void test8(){
        for (int i= 0; i< 80; i++){
            System.out.println("hey, guys!");
        }

    }
    @Test
    public void test9(){
        List<WebElement> links = driver.findElements(By.xpath("//ul/li"));
        System.out.println(links.size());

        for (int i= 0; i< links.size(); i++){
          String info = links.get(i).getText();
            System.out.println(info);
            links.get(i).click();
            driver.get(Data.HomeURL);
            links = driver.findElements(By.xpath("//ul/li"));

        }

    }



}

