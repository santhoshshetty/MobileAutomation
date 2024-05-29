package com.mobile.driverhandler;

import java.io.File;

public interface DriverConfig {

  /**
   * This File object stores the path to the resources folder where configuration files are located.
   */
  File directory = new File("src/main/resources/app/");

  /**
   * This interface is designed for driver object creation through the setup method.
   * Any new driver class should implement this interface to ensure consistency in driver object creation.
   */
  void setup();

}
