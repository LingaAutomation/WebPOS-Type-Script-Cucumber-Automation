
package com.qa.stepdef;


import com.qa.utils.CapabilitiesManager;

import com.qa.utils.TestUtils;
import static com.qa.utils.TestUtils.driver1;
import static com.qa.utils.TestUtils.driver2;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.apache.commons.io.FileUtils;
import org.junit.Assume;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;




public class Hooks {
    public static int Complete;
    public static int i;

    public static String ScenarioName;
    static TestUtils utils=new TestUtils();


    @Before
    public static void initialize(Scenario scenario) throws Exception {
        CapabilitiesManager setdf = new CapabilitiesManager();
        setdf.setup();


        setdf.setup1();
        utils.log().info("Start Scenario Name1 : " + scenario);
    }

    @After
    public void quit(Scenario scenario) throws IOException {

        if (scenario.isFailed() || i>29){
            ScenarioName = scenario.getName();
            utils.log().info("Failed Scenario Name : " + ScenarioName);
            File screenshot=((TakesScreenshot)driver1).getScreenshotAs(OutputType.FILE);
            byte[] fileContent = FileUtils.readFileToByteArray(screenshot);
            scenario.attach(fileContent, "image/png", "screenshot");
            driver1.close();
            File screenshot1=((TakesScreenshot)driver2).getScreenshotAs(OutputType.FILE);
            byte[] fileContent1 = FileUtils.readFileToByteArray(screenshot1);
            scenario.attach(fileContent1, "image/png", "screenshot");
            driver2.close();
            driver1=null;
            driver2=null;

        }

    }
    @Before("@skip_scenario")
    public void skip_scenario(Scenario scenario){
        Assume.assumeTrue(false);
    }
}

