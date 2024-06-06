package com.mobile.driverhandler;

import java.net.URL;
import java.time.Duration;
import com.mobile.config.MobileConfig;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.aeonbits.owner.ConfigFactory;

@Slf4j
public class AndroidEmulatorAppDriver implements DriverConfig {

  /**
   * Creates an Android Driver to run a test for a mobile app in an Android emulator.
   * This method initializes the Android Driver for test automation of a mobile app within an Android emulator.
   *
   * @return An AndroidDriver instance set up for testing the specified app in the specified Android emulator.
   * @throws Exception If there are any errors during the driver initialization.
   */
  @Override
  @SneakyThrows
  public void setup() {
    MobileConfig config = ConfigFactory.create(MobileConfig.class);
    log.info("***** Android Emulator *****");
    String basePath = System.getProperty("user.dir");
    UiAutomator2Options options = new UiAutomator2Options();
    options.setPlatformName("android")
        .setDeviceName(config.androidDeviceName())
        .setAppPackage(config.appPackage())
        .setAppActivity(config.appActivity())
        .setApp(basePath.concat("/src/main/resources/app/").concat(config.appName()))
        .setUiautomator2ServerInstallTimeout(Duration.ofMillis(300000));
    Server.setDriver(new AndroidDriver(new URL("http://127.0.0.1:4723"), options));
  }
}
