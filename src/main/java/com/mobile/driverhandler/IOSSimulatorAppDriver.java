package com.mobile.driverhandler;

import java.net.URL;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.options.XCUITestOptions;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class IOSSimulatorAppDriver implements DriverConfig {

  /**
   * Creates an iOS Driver to run a test for a mobile app in an iOS simulator.
   * This method initializes the iOS Driver for test automation of a mobile app within an iOS simulator.
   *
   * @return An iOsDriver instance set up for testing the specified app in the specified iOS emulator.
   * @throws Exception If there are any errors during the driver initialization.
   */
  @Override
  @SneakyThrows
  public void setup() {
    String basePath = System.getProperty("user.dir");
    log.info("***** Browser Testing On IOS Real Device  *****");
    XCUITestOptions options = new XCUITestOptions();
    options.setDeviceName("iPhone 14")
        .setApp(basePath.concat("/src/main/resources/app/").concat("bitbar-ios-sample.ipa"));
    Server.setDriver(new IOSDriver(new URL("http://127.0.0.1:4723"), options));
  }
}
