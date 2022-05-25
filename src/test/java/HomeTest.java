import io.netty.util.Timeout;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.TestNG;
import org.testng.annotations.Test;

import java.time.Duration;

public class HomeTest extends TestBase{


    HomePage homePage;
    NextPage nextPage;
    @Test
    public void assertHomePage(){
        homePage=new HomePage(driver);
        nextPage=new NextPage(driver);

       WebDriverWait wait =new WebDriverWait(TestBase.driver, Duration.ofSeconds(300));
        wait.until(ExpectedConditions.visibilityOf(homePage.btngetpaid));

        Assert.assertEquals(driver.getTitle(), "Levelset | We Help You Get Paid On Construction Jobs");
        homePage.clickOnGetPaidButton();



            nextPage=new NextPage(driver);
           wait.until(ExpectedConditions.visibilityOf(nextPage.assertNext));
            Assert.assertEquals(nextPage.assertNext.getText(),"Release a Lien");

            Assert.assertEquals(nextPage.priceElement.getText(),"$149");



        }



    }

