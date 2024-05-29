package com.mobile.driverhandler;

import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class IOSSimulatorBrowserDriver implements DriverConfig {

  /**
   * Creates an iOS Driver to run a test on a mobile web browser in an iOS simulator.
   * This method initializes the iOS Driver for test automation in a mobile web browser on an iOS simulator.
   *
   * @return An iOSDriver instance set up for testing in the specified mobile web browser on the specified iOS simulator.
   * @throws Exception If there are any errors during the driver initialization.
   */
  @SneakyThrows
  @Override
  public void setup() {

  }
}
