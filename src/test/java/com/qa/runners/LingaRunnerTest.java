package com.qa.runners;

import com.qa.utils.DriverManager;
import com.qa.utils.GlobalParams;
import com.qa.utils.ServerManager;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.apache.logging.log4j.ThreadContext;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import static io.cucumber.junit.CucumberOptions.SnippetType.CAMELCASE;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty"
                , "html:target/cucumber/report.html"
                , "summary"
                ,"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
                , "de.monochromata.cucumber.report.PrettyReports:target/cucumber-html-reports"
                ,"json:target/cucumber.json"
        } // Summary to tell Cucumber to print code snippets for missing step definitions
        ,features = {"src/test/resources"}
        ,glue = {"com.qa.stepdef"}
        ,snippets = CAMELCASE //step definitions in CAMELCASE FORMAT
        ,dryRun = false     //to check whether all feature file steps have corresponding step definitions
        ,monochrome = true //console logs readable format
        ,strict = true //to skip undefined steps from execution
       ,tags = "@BarTab1"//filtering scenarios to run
)

public class LingaRunnerTest{
    /*@BeforeClass
    public static void initialize() throws Exception {
        GlobalParams params = new GlobalParams();
        params.initializeGlobalParams();

        ThreadContext.put("ROUTINGKEY", params.getPlatformName() + "_"
                + params.getDeviceName());

        new ServerManager().startServer();
        new DriverManager().initializeDriver();
    }

    @AfterClass
    public static void quit(){
        DriverManager driverManager = new DriverManager();
        if(driverManager.getDriver() != null){
            driverManager.getDriver().quit();
            driverManager.setDriver(null);
        }
        ServerManager serverManager = new ServerManager();
        if(serverManager.getServer() != null){
            serverManager.getServer().stop();
        }
    }*/

 }
