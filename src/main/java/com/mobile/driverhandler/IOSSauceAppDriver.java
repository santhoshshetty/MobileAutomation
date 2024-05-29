package com.mobile.driverhandler;

import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class IOSSauceAppDriver implements DriverConfig {

  /**
   * Creates an iOS Driver to run a test for a mobile app in an iOS emulator.
   * This method initializes the iOS Driver for test automation of a mobile app within an iOS simulator.
   *
   * @return An iOSDriver instance set up for testing the specified app in the specified iOS simulator.
   * @throws Exception If there are any errors during the driver initialization.
   */
  @Override
  @SneakyThrows
  public void setup() {

  }
}
