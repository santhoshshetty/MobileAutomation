package com.mobile.driverhandler;

import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class AndroidDeviceBrowserDriver implements DriverConfig {

  /**
   * Creates an Android Driver to run a test on a mobile web browser.
   * This method initializes the Android Driver for test automation in a mobile web browser on an Android device.
   *
   * @return An AndroidDriver instance set up for testing in the specified mobile web browser on an Android device.
   * @throws Exception If there are any errors during the driver initialization.
   */
  @SneakyThrows
  @Override
  public void setup() {

  }
}
