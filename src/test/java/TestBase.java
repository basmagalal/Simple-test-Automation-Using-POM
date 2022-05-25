import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

public class TestBase {


    public  static WebDriver driver;

    @BeforeTest
    public  void setup(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();

        driver.get("https://www.levelset.com/");
        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(300, TimeUnit.MILLISECONDS);

    }


   /* @AfterSuite
    public void StopDriver() {
        driver.close();

    }*/


}
