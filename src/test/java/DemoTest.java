import java.util.Map;
import com.mobile.driverhandler.DriverFactory;
import com.mobile.driverhandler.Server;
import io.appium.java_client.AppiumBy;
import lombok.SneakyThrows;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.annotations.Test;

public class DemoTest {

  public static void dragAndDrop(RemoteWebElement source, RemoteWebElement destination) throws InterruptedException {
    Server.getDriver().executeScript("gesture: dragAndDrop",
        Map.of("sourceId", source.getId(), "destinationId", destination.getId()));
  }

  @Test
  public void demoAndroidTest() {
    DriverFactory.getDriverInstance("androidEmulator").setup();
    Server.getDriver().findElement(AppiumBy.accessibilityId("App")).click();
  }

  @Test(threadPoolSize = 3, invocationCount = 1, enabled = false)
  @SneakyThrows
  public void demoIOSTest1() {
    DriverFactory.getDriverInstance("iOSSimulator").setup();
    Thread.sleep(2000);
    Server.getDriver().findElement(AppiumBy.xpath("//XCUIElementTypeButton[@name=\"tab bar option cart\"]")).click();
    Thread.sleep(2000);
    Server.getDriver().findElement(AppiumBy.xpath("//XCUIElementTypeButton[@name=\"tab bar option catalog\"]")).click();
  }

  @Test(threadPoolSize = 3, invocationCount = 1, enabled = false)
  @SneakyThrows
  public void demoIOSTest2() {
    DriverFactory.getDriverInstance("iOSSimulator").setup();
    Thread.sleep(2000);
    Server.getDriver().findElement(AppiumBy.xpath("//XCUIElementTypeButton[@name=\"tab bar option cart\"]")).click();
    Thread.sleep(2000);
    Server.getDriver().findElement(AppiumBy.xpath("//XCUIElementTypeButton[@name=\"tab bar option catalog\"]")).click();
    Thread.sleep(2000);
    Server.getDriver().findElement(AppiumBy.xpath("//XCUIElementTypeButton[@name=\"tab bar option menu\"]")).click();
  }

  @Test(threadPoolSize = 3, invocationCount = 1, enabled = false)
  @SneakyThrows
  public void demoIOSTest3() {
    DriverFactory.getDriverInstance("iOSSimulator").setup();
    Thread.sleep(2000);
    Server.getDriver().findElement(AppiumBy.xpath("//XCUIElementTypeButton[@name=\"tab bar option cart\"]")).click();
    Thread.sleep(2000);
    Server.getDriver().findElement(AppiumBy.xpath("//XCUIElementTypeButton[@name=\"tab bar option catalog\"]")).click();
    Thread.sleep(2000);
    Server.getDriver().findElement(AppiumBy.xpath("//XCUIElementTypeButton[@name=\"tab bar option menu\"]")).click();
  }
}
