package com.mobile.driverhandler;

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

  }
}
