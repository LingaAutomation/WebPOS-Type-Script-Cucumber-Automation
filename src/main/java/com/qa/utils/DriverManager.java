package com.qa.utils;



import java.io.IOException;
import java.net.URL;

public class DriverManager {
//    private static ThreadLocal<AppiumDriver> driver = new ThreadLocal<>();
//    TestUtils utils = new TestUtils();
//
//    public AppiumDriver getDriver(){
//        return driver.get();
//    }
//
//    public void setDriver(AppiumDriver driver2){
//        driver.set(driver2);
//    }
//
//    public void initializeDriver() throws Exception {
//        AppiumDriver driver = null;
//        GlobalParams params = new GlobalParams();
//        PropertyManager props = new PropertyManager();
//
//        if(driver == null){
//            try{
//                utils.log().info("initializing Appium driver");
//                switch(params.getPlatformName()){
//                    case "Android":
//                        driver = new AndroidDriver(new ServerManager().getServer().getUrl(), new CapabilitiesManager().getCaps());
//                        break;
//                    case "iOS":
////                        driver = new IOSDriver<>(new ServerManager().getServer().getUrl(), new CapabilitiesManager().getCaps());
//                        driver = new IOSDriver<>(new URL("http://0.0.0.0:4727/wd/hub"),new CapabilitiesManager().getCaps());
//                        break;
//                }
//                if(driver == null){
//                    throw new Exception("driver is null. ABORT!!!");
//                }
//                utils.log().info("Driver is initialized");
//                this.driver.set(driver);
//            } catch (IOException e) {
//                e.printStackTrace();
////                utils.log().fatal("Driver initialization failure. ABORT !!!!" + e.toString());
//                throw e;
//            }
//        }
//
//    }

}
