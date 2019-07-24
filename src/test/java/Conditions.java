import org.testng.Assert;
import org.testng.annotations.Test;


public class Conditions {
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
}
