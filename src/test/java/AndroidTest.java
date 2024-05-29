import com.mobile.driverhandler.DriverFactory;
import com.mobile.driverhandler.Server;
import io.appium.java_client.AppiumBy;
import org.testng.annotations.Test;

public class AndroidTest {

  @Test
  public void demoTest() {
    DriverFactory.getDriverInstance("androidEmulator").setup();
    Server.getDriver().findElement(AppiumBy.accessibilityId("App")).click();
  }
}
