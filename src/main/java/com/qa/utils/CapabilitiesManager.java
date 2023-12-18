package com.qa.utils;


import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

import static com.qa.utils.TestUtils.driver;

public class CapabilitiesManager {

    public void setup() throws InterruptedException {

        //Call the chrome driver
        System.setProperty("webdriver.chrome.driver","C:\\Automation\\WebPos\\Automation Driver\\chromedriver-win64\\chromedriver.exe");
        //Open the Chrome window
        driver = new ChromeDriver();
        //Wait for 30 seconds
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        //Maximize the Firefox window
        driver.manage().window().maximize();
        //launch the URL
        Thread.sleep(5000);
        //Launch the URL
        driver.get("https://staging-webpos-india.lingapos.com/");
        Thread.sleep(8000);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        Thread.sleep(5000);
        try
        {
            if(driver.findElement(By.xpath("//span[contains(.,'Continue Without Plugin')]/..")).isDisplayed())
            {
                driver.findElement(By.xpath("//span[contains(.,'Continue Without Plugin')]/..")).click();
            }
        }
        catch(Exception fd)
        {

        }
        Thread.sleep(2000);
        //Clear the text from the user name text box
        driver.findElement(By.xpath("//input[@name='email']")).clear();
        //Enter the user name
        driver.findElement(By.xpath("//input[@name='email']")).sendKeys("appiumusd@mail.com");
        //Clear the password from the password text box
        driver.findElement(By.xpath("//input[@name='password']")).clear();
        //Enter the password
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("welcome123");
        Thread.sleep(5000);
        //Click the login button
        driver.findElement(By.xpath("//ion-button[@type='submit']")).click();

        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        Thread.sleep(20000);

    }



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
