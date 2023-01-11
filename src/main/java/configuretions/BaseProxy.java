package configuretions;

import net.lightbody.bmp.BrowserMobProxyServer;
import net.lightbody.bmp.core.har.Har;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import util.Screen;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class BaseProxy extends BaseClass {
    public static BrowserMobProxyServer serverBase;

    @BeforeClass
    static public void startProxy() {
        serverBase.newHar("youtube");
        ConfigUserAgens.createUserAgent(USERAGENT.ANDROIRU, serverBase);
    }

    @AfterClass
    static public void stopProxy() throws IOException {
        String timeStamp = new SimpleDateFormat("MMdd_HHmmss").format(Calendar.getInstance().getTime());
        Har har = serverBase.getHar();
        har.writeTo(new File("site" + timeStamp + ".har"));
        serverBase.stop();
        Screen.takeScreen(driver, "Screenshot "+timeStamp);
    }
}
