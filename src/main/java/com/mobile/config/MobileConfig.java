package com.mobile.config;

import org.aeonbits.owner.Config;

@Config.LoadPolicy(Config.LoadType.MERGE)
@Config.Sources({
  "system:properties",
  "system:env",
  "file:${user.dir}/src/main/resources/mobile-config.properties"
})
public interface MobileConfig extends Config {
  @Key("ANDROID_PLATFORM_VERSION")
  String androidPlatformVersion();

  @Key("ANDROID_DEVICE_NAME")
  String androidDeviceName();

  @Key("APP_PACKAGE")
  String appPackage();

  @Key("APP_ACTIVITY")
  String appActivity();

  @Key("APP_NAME")
  String appName();
}
