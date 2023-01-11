import configuretions.BaseProxy;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.support.PageFactory;
import pageObject.YouTobePageObject;


public class TestProxyYoutube extends BaseProxy {
    static YouTobePageObject youTobePageObject = PageFactory.initElements(driver, YouTobePageObject.class);

    @BeforeClass
    public static void openPage() {
        driver.get("https://www.youtube.com/");
    }

    @Test
    public void test1() {
        youTobePageObject.sentInInputNoWar();
    }

}
