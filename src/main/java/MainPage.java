import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MainPage extends BaseActions{
    public MainPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }
    String currentMainPageURL;
}
