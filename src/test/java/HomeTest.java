import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.TestNG;
import org.testng.annotations.Test;

import java.time.Duration;

public class HomeTest extends TestBase{


    HomePage homePage;
    @Test
    public void assertHomePage(){
        homePage=new HomePage(driver);


       WebDriverWait wait =new WebDriverWait(TestBase.driver, Duration.ofSeconds(300));
        wait.until(ExpectedConditions.visibilityOf(homePage.btngetpaid));
        homePage.clickOnGetPaidButton();
        Assert.assertEquals(driver.getTitle(), "Levelset | We Help You Get Paid On Construction Jobs");

    }
}
