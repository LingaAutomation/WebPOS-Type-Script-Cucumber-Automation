package com.qa.stepdef;


import com.qa.utils.CapabilitiesManager;
import com.qa.utils.TestUtils;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.apache.commons.io.FileUtils;
import org.junit.Assume;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;
import java.io.IOException;

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
//            utils.log().info("Start Scenario Name : " + ScenarioName);

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
            driver = null;

        }

    }
    @Before("@skip_scenario")
    public void skip_scenario(Scenario scenario){
        Assume.assumeTrue(false);
    }
}