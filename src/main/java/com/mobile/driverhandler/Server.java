package com.mobile.driverhandler;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import io.appium.java_client.service.local.flags.GeneralServerFlag;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Server {

  public static AppiumDriverLocalService server;
  public static ThreadLocal<AppiumDriver> appiumDriver = new ThreadLocal<>();

  public Server() {
  }

  public static AppiumDriver getDriver() {
    return appiumDriver.get();
  }

  public static void setDriver(AppiumDriver driver) {
    appiumDriver.set(driver);
  }

  /**
   * set up the appium server instance
   */
  static void setInstance() {
    AppiumServiceBuilder builder = new AppiumServiceBuilder();
    builder
        .usingAnyFreePort()
        .withArgument(GeneralServerFlag.BASEPATH, "/")
        .withArgument(GeneralServerFlag.LOCAL_TIMEZONE)
        .withArgument(GeneralServerFlag.RELAXED_SECURITY);
    server = AppiumDriverLocalService.buildService(builder);
  }

  /**
   * return the appium server instance
   */
  static AppiumDriverLocalService getInstance() {
    if (server == null) {
      setInstance();
    }
    return server;
  }

  /**
   * Start the appium server
   */
  public static void startAppiumServer() {
    getInstance().start();
    System.out.println("---------- Starting Appium Server ----------");
    System.out.println("URL: " + server.getUrl());
    System.out.println("is Server Running: " + server.isRunning());
  }

  /**
   * Stop the appium server
   */
  public static void stopAppiumServer() {
    if (server != null) {
      getInstance().stop();
    }
    System.out.println("---- Stop Appium Server ----");
  }
}


