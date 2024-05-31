import com.mobile.driverhandler.DriverFactory;
import com.mobile.driverhandler.Server;
import io.appium.java_client.AppiumBy;
import org.testng.annotations.Test;

public class DemoTest {

  @Test(enabled = false)
  public void demoAndroidTest() {
    DriverFactory.getDriverInstance("androidEmulator").setup();
    Server.getDriver().findElement(AppiumBy.accessibilityId("App")).click();
  }

  @Test
  public void demoIOSTest() {
    DriverFactory.getDriverInstance("iOSSimulator").setup();
  }
}
