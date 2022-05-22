import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeTest;

public class TestBase {


    public  static WebDriver driver;

    @BeforeTest
    public  void setup(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();

        driver.get("https://www.levelset.com/");



    }


    @AfterSuite
    public void StopDriver() {
        driver.close();

    }


}
