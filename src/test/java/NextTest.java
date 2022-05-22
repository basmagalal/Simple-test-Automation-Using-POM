import org.testng.Assert;
import org.testng.annotations.Test;

public class NextTest extends TestBase{

    NextPage nextPage;
    @Test
    public void assertPrice(){

        nextPage=new NextPage(driver);

        Assert.assertEquals(nextPage.assertNext.getText(),"What are you looking to do?");

        Assert.assertEquals(nextPage.priceElement.getText(),"$149");



    }
}
