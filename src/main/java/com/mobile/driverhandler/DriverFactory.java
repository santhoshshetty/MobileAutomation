package com.mobile.driverhandler;

import java.util.HashMap;
import java.util.function.Supplier;

public class DriverFactory {

  /**
   * This is a static utility HashMap for mapping platform types to driver objects.
   */
  static HashMap<String, Supplier<DriverConfig>> DRIVERMAP = new HashMap<>();

  /**
   * This static utility class manages and provides driver objects based on the specified platform.
   * It creates and returns a new driver object tailored to the given platform.
   * It caters to various platforms, including Android, iOS Real device, Emulator, Simulator, Sauce labs etc.,
   * * Naming convention followed is 'OS(Android/iOS)
   *   ProviderType(cloud provider if exists)
   *   DeviceType(if it's simulator/emulator;
   *   for real devices, no label is needed)Browser(if it's an app; do not include for other cases).'
   *   Example - androidSauce, androidSauceBrowser, androidSauceEmulator
   */
  static {
    //Android
    DRIVERMAP.put("android", () -> new AndroidDeviceAppDriver());
    DRIVERMAP.put("androidBrowser", () -> new AndroidDeviceBrowserDriver());
    //Emulator
    DRIVERMAP.put("androidEmulator", () -> new AndroidEmulatorAppDriver());
    DRIVERMAP.put("androidEmulatorBrowser", () -> new AndroidEmulatorBrowserDriver());
    //Android - Sauce
    DRIVERMAP.put("androidSauce", () -> new AndroidSauceAppDriver());
    DRIVERMAP.put("androidSauceBrowser", () -> new AndroidSauceBrowserDriver());
    //iOS
    DRIVERMAP.put("iOS", () -> new IOSDeviceAppDriver());
    DRIVERMAP.put("iOSBrowser", () -> new IOSDeviceBrowserDriver());
    //Simulator
    DRIVERMAP.put("iOSSimulator", () -> new IOSSimulatorAppDriver());
    DRIVERMAP.put("iOSSimulatorBrowser", () -> new IOSSimulatorBrowserDriver());
    //iOS - Sauce
    DRIVERMAP.put("iOSSauce", () -> new IOSSauceAppDriver());
    DRIVERMAP.put("iOSSauceBrowser", () -> new IOSSauceBrowserDriver());
  }

  /**
   * Returns the respective brand-new driver object
   *
   * @param platform
   * @return
   */
  public static DriverConfig getDriverInstance(String platform) {
    return DRIVERMAP.get(platform).get();
  }
}
