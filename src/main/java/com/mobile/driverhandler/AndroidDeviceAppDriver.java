package com.mobile.driverhandler;

import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class AndroidDeviceAppDriver implements DriverConfig {

  /**
   * Creates an Android Driver to run a mobile app test on a real device.
   * This method initializes the Android Driver for test automation on an Android mobile device.
   *
   * @return An AndroidDriver instance set up for testing on a real Android device.
   * @throws Exception If there are any errors during the driver initialization.
   */
  @SneakyThrows
  @Override
  public void setup() {

  }
}
