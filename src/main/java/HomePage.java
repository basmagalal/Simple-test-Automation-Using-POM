import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class HomePage  extends PageBase{

     Actions actions;
    static WebDriver webDriver;
    public HomePage(WebDriver driver) {
        super(driver);
        webDriver=driver;
    }

    @FindBy(partialLinkText = "Get paid")
    WebElement btngetpaid;

    @FindBy(css = "h1.text-blue-70.fw-900")
    WebElement assertHome;

    public void clickOnGetPaidButton(){
        actions=new Actions(webDriver);
        actions.doubleClick(btngetpaid).perform();


    }

}
