package com.qa.utils;


import java.io.File;
import java.io.IOException;
import java.util.Properties;

public class CapabilitiesManager {
//    TestUtils utils = new TestUtils();
//
//    public DesiredCapabilities getCaps() throws IOException {
//        GlobalParams params = new GlobalParams();
//        Properties props = new PropertyManager().getProps();
//
//        try {
//            utils.log().info("getting capabilities...");
//            DesiredCapabilities caps = new DesiredCapabilities();
//            caps.setCapability(MobileCapabilityType.PLATFORM_NAME, params.getPlatformName());
//            caps.setCapability(MobileCapabilityType.UDID, params.getUDID());
//            caps.setCapability(MobileCapabilityType.DEVICE_NAME, params.getDeviceName());
//
//            switch (params.getPlatformName()) {
//                case "Android":
//                    caps.setCapability(MobileCapabilityType.AUTOMATION_NAME, props.getProperty("androidAutomationName"));
//                    caps.setCapability("appPackage", props.getProperty("androidAppPackage"));
//                    caps.setCapability("appActivity", props.getProperty("androidAppActivity"));
//                    caps.setCapability("systemPort", params.getSystemPort());
//                    caps.setCapability("chromeDriverPort", params.getChromeDriverPort());
//                    //String androidAppUrl = getClass().getResource(props.getProperty("androidAppLocation")).getFile();
//                    String androidAppUrl = System.getProperty("user.dir") + File.separator + "src" + File.separator + "Test"
//                            + File.separator + "resources" + File.separator + "app" + File.separator + "Android.SauceLabs.Mobile.Sample.app.2.3.0.apk";
//                    utils.log().info("appUrl is" + androidAppUrl);
//                    caps.setCapability("app", androidAppUrl);
//                    break;
//                case "iOS":
//                    caps.setCapability(MobileCapabilityType.AUTOMATION_NAME, props.getProperty("iOSAutomationName"));
//                    //String iOSAppUrl = getClass().getResource(props.getProperty("iOSAppLocation")).getFile();
//                    //utils.log().info("appUrl is" + iOSAppUrl);
//                    caps.setCapability("app", "com.benseron.lingapos");//iOSBundleId
//                    caps.setCapability("wdaLocalPort", params.getWdaLocalPort());
//                    caps.setCapability("appium:webkitDebugProxyPort", params.getWebkitDebugProxyPort());
//                    caps.setCapability("wdaStartupRetryInterval",30);
//                    caps.setCapability("wdaStartupRetries", 4);
//                    caps.setCapability("iosInstallPause",18000);
//                    caps.setCapability("showXcodeLog",true);
//                    //caps.setCapability("usePrebuiltWDA", false);
//                    caps.setCapability("xcodeOrgId", "V23JNQM2Z4");
//                    caps.setCapability("xcodeSigningId", "Apple Development");
//                    caps.setCapability(MobileCapabilityType.NO_RESET, false);
//                    caps.setCapability("sendKeyStrategy","setValue");
//                  //  caps.setCapability("newCommandTimeout", 60 * 5);
////                    caps.setCapability("autoDismissAlerts", true);
//                    break;
//            }
//            return caps;
//        }
//        catch(Exception e){
//            e.printStackTrace();
////            utils.log().fatal("Failed to load capabilities. ABORT!!!" + e.toString());
//            throw e;
//        }
//    }
}
