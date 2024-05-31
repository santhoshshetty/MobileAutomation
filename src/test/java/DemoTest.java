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

  @Test(enabled = false)
  @SneakyThrows
  public void demoIOSTest() {
    DriverFactory.getDriverInstance("iOSSimulator").setup();
    Server.getDriver().findElement(AppiumBy.accessibilityId("Drag")).click();
    Thread.sleep(5000);
    RemoteWebElement source = (RemoteWebElement) Server.getDriver().findElement(AppiumBy.accessibilityId("drag-l2"));
    RemoteWebElement target = (RemoteWebElement) Server.getDriver().findElement(AppiumBy.accessibilityId("drop-l2"));
    dragAndDrop(source, target);
  }
}
