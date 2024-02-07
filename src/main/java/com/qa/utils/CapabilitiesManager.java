package com.qa.utils;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import static com.qa.utils.TestUtils.*;


public class CapabilitiesManager {



    public void setup() throws InterruptedException {
        System.out.println("Driver");
        //Call the chrome driver
//    System.setProperty("webdriver.chrome.driver","C:\\Automation\\WebPos\\Automation Driver\\chromedriver-win64\\chromedriver.exe");
        System.setProperty("webdriver.chrome.driver", "/Users/shaunmatthew/Downloads/chromedriver");
        //Open the Chrome window
        driver1 = new ChromeDriver();
        //Wait for 30 seconds
        driver1.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        //Maximize the Firefox window
        driver1.manage().window().maximize();
        //launch the URL
        Thread.sleep(5000);
        //Launch the URL
        driver1.get("https://staging-webpos-india.lingapos.com/#/auth/login");
        Thread.sleep(8000);

        driver1.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

        Thread.sleep(10000);
        try
        {
            if(driver1.findElement(By.xpath("//span[contains(.,'Continue Without Plugin')]/..")).isDisplayed())
            {
                driver1.findElement(By.xpath("//span[contains(.,'Continue Without Plugin')]/..")).click();
            }
        }
        catch(Exception fd)
        {

        }
        Thread.sleep(2000);
//        Clear the text from the user name text box
        driver1.findElement(By.xpath("//input[@name='email']")).clear();
        //Enter the user name
        driver1.findElement(By.xpath("//input[@name='email']")).sendKeys("appiumusdstore1@mail.com");
        //Clear the password from the password text box
        driver1.findElement(By.xpath("//input[@name='password']")).clear();
        //Enter the password
        driver1.findElement(By.xpath("//input[@name='password']")).sendKeys("auto1234");
        Thread.sleep(5000);
        //Click the login button
        driver1.findElement(By.xpath("//ion-button[@type='submit']")).click();

        driver1.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver1.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));
        Thread.sleep(2000);

    }

    public void setup1() throws InterruptedException {
        System.out.println("Driver2");
        //Call the chrome driver
//    System.setProperty("webdriver.chrome.driver","C:\\Automation\\WebPos\\Automation Driver\\chromedriver-win64\\chromedriver.exe");
        System.setProperty("webdriver.chrome.driver", "/Users/shaunmatthew/Downloads/chromedriver");
        //Open the Chrome window
        driver2 = new ChromeDriver();
        //Wait for 30 seconds
        driver2.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        //Maximize the Firefox window
        driver2.manage().window().maximize();
        //launch the URL
        Thread.sleep(5000);
        //Launch the URL
        driver2.get("https://staging-webpos-india.lingapos.com/#/auth/login");
        Thread.sleep(8000);
        driver2.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

        Thread.sleep(10000);
        try
        {
            if(driver2.findElement(By.xpath("//span[contains(.,'Continue Without Plugin')]/..")).isDisplayed())
            {
                driver2.findElement(By.xpath("//span[contains(.,'Continue Without Plugin')]/..")).click();
            }
        }
        catch(Exception fd)
        {

        }
        Thread.sleep(2000);
        //Clear the text from the user name text box
        driver2.findElement(By.xpath("//input[@name='email']")).clear();
        //Enter the user name
        driver2.findElement(By.xpath("//input[@name='email']")).sendKeys("appiumusdstore1@mail.com");
        //Clear the password from the password text box
        driver2.findElement(By.xpath("//input[@name='password']")).clear();
        //Enter the password
        driver2.findElement(By.xpath("//input[@name='password']")).sendKeys("auto1234");
        Thread.sleep(5000);
        //Click the login button
        driver2.findElement(By.xpath("//ion-button[@type='submit']")).click();

        driver2.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver2.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));
        Thread.sleep(2000);

    }



}
