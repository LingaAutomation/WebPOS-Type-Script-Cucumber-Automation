package com.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

public class DriverSteup {

    public static WebDriver driver;

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
    driver.get("https://staging-webpos-india.lingapos.com/#/auth/login");
    Thread.sleep(8000);
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    Thread.sleep(3000);
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
    driver.findElement(By.xpath("//input[@name='email']")).sendKeys("autotest2@mail.com");
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

}
