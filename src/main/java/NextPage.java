import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NextPage extends  PageBase{
    public NextPage(WebDriver driver) {
        super(driver);
    }

    private static final  String DocXpath="//div[@class='left' and contains( text() ,'Release a Lien')]";
    private  static  final String  btnXpath= DocXpath+"/following-sibling::div/child::span[@class=\"price-amount\"]" ;
    @FindBy(xpath = DocXpath)
    WebElement assertNext;


    @FindBy(xpath =btnXpath)
    WebElement priceElement;




}
