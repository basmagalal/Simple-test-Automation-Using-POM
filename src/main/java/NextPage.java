import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NextPage extends  PageBase{
    public NextPage(WebDriver driver) {
        super(driver);
    }


    @FindBy(css = "div.step-title")
    WebElement assertNext;


    @FindBy(css="span.price-amount")
    WebElement priceElement;



}
