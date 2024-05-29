package com.mobile.driverhandler;

import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class AndroidSauceBrowserDriver implements DriverConfig {

  /**
   * Creates an Android Driver to run a test for a mobile web browser on Sauce Labs.
   * This method initializes the Android Driver for test automation of a mobile web browser on Sauce Labs,
   * a cloud-based testing platform.
   *
   * @throws Exception If there are any errors during the driver initialization or while interacting with Sauce Labs.
   */
  @Override
  @SneakyThrows
  public void setup() {

  }
}
