import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseUI {
    WebDriver driver;
    String mainUrl = "https://stopandshop.com/";

    @BeforeMethod
    public void setUp() {

        // hav to add drivers to any browser
        System.setProperty("webdriver.chrome.driver", "chromedriver");
        driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, 20);// opens your browser
        driver.manage().window().maximize();

        // first test case
        driver.get(mainUrl);// gets your URL

    }

    @AfterMethod
    public void afterAction() {
        driver.quit();
        //stops

    }
//    public static String generateNewNumber(String name, int length){
//        return name + RandomStringUtils.random(length, "");
//    }
}
