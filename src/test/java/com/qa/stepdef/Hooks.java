package com.qa.stepdef;


import com.qa.pages.DriverSteup;
import com.qa.utils.*;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.ThreadContext;
import org.junit.Assume;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;
import java.io.IOException;
import com.qa.utils.TestUtils;
import java.security.PublicKey;

import static com.qa.utils.TestUtils.driver;

public class Hooks {

    //public AppiumDriver driver;

    public static int i;

    public static String ScenarioName;

    static TestUtils utils=new TestUtils();

    @Before
    public static void initialize(Scenario scenario) throws Exception {

        if(driver == null) {
            i=0;

            CapabilitiesManager setdf = new CapabilitiesManager();
            setdf.setup();
            ScenarioName = scenario.getName();
            utils.log().info("Start Scenario Name : " + ScenarioName);

        }
        i++;

    }

    @After
    public static void quit(Scenario scenario) throws IOException {

        if (scenario.isFailed() || i>29){
            ScenarioName = scenario.getName();
            utils.log().info("Failed Scenario Name : " + ScenarioName);
            File screenshot=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            byte[] fileContent = FileUtils.readFileToByteArray(screenshot);
            scenario.attach(fileContent, "image/png", "screenshot");
//            driver.close();
            driver = null;

        }

    }
    @Before("@skip_scenario")
    public void skip_scenario(Scenario scenario){
        Assume.assumeTrue(false);
    }
}


//package com.qa.stepdef;
//
//
//import com.qa.pages.DriverSteup;
//import org.openqa.selenium.WebDriver;
//import org.testng.Assert;
//import org.testng.annotations.Test;
//import com.qa.utils.DriverManager;
//import com.qa.utils.GlobalParams;
//import com.qa.utils.ServerManager;
//import com.qa.utils.TestUtils;
//import io.cucumber.java.After;
//import io.cucumber.java.Before;
//import io.cucumber.java.Scenario;
//import org.apache.commons.io.FileUtils;
//import org.apache.logging.log4j.ThreadContext;
//import org.junit.Assume;
//import org.openqa.selenium.OutputType;
//import org.openqa.selenium.TakesScreenshot;
//
//import java.io.File;
//import java.io.IOException;
//import com.qa.utils.TestUtils;
//import java.security.PublicKey;
//
//public class Hooks {
//    public static WebDriver driver;
//    //public AppiumDriver driver;
//
//    public static int i;
//
//    public static String ScenarioName;
//
//    static TestUtils utils=new TestUtils();
//
//    @Before
//    public static void initialize(Scenario scenario) throws Exception {
//
//        if(driver == null) {
//            i=0;
//
//            DriverSteup setdf = new DriverSteup(driver);
//            setdf.setup();
//
////            GlobalParams params = new GlobalParams();
////            params.initializeGlobalParams();
////
////            ThreadContext.put("ROUTINGKEY", params.getPlatformName() + "_"
////                    + params.getDeviceName());
////
////            new ServerManager().startServer();
////            new DriverManager().initializeDriver();
////
////            driver = new DriverManager().getDriver();
//
//            ScenarioName = scenario.getName();
//
//            utils.log().info("Start Scenario Name : " + ScenarioName);
//
//        }
//        i++;
//
//    }
//
//    @After
//    public static void quit(Scenario scenario) throws IOException {
//
//        if (scenario.isFailed() || i>29){
//            driver = null;
////            WebDriver currentDriver = new DriverManager().getDriver();
////            File screenshot = ((TakesScreenshot) currentDriver).getScreenshotAs(OutputType.FILE);
////            byte[] fileContent = FileUtils.readFileToByteArray(screenshot);
////            scenario.attach(fileContent, "image/png", "screenshot");
//            //scenario.getName();
//            ScenarioName = scenario.getName();
//            utils.log().info("Failed Scenario Name : " + ScenarioName);
//
//
////            DriverManager driverManager = new DriverManager();
////            if (driver != null) {
//////                driverManager.getDriver().closeApp();
//////                driverManager.getDriver().quit();
//////                driver.setDriver(null);
////            }
////            ServerManager serverManager = new ServerManager();
////            if (serverManager.getServer() != null) {
//////                serverManager.getServer().stop();
//
//            }
//
////        }
//    }
//    @Before("@skip_scenario")
//    public void skip_scenario(Scenario scenario){
//        Assume.assumeTrue(false);
//    }
//}
