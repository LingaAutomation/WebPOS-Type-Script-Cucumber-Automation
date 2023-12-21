package com.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


import java.time.Duration;
import java.util.concurrent.TimeUnit;
import static com.qa.utils.TestUtils.driver;
public class OrdersAndDriversListScreen extends BasePage {
    @FindBy(xpath = "//button[contains(.,' Table layout ')]")
    private WebElement tableLayoutTab;

    String checkStatsTab = "//button//span[text()=' Check Status ']";

    @FindBy(xpath = "//span[contains(.,' Check Status ')]")
    private WebElement checkStatsTab1;

    @FindBy(name = "Closed")
    private WebElement closedChecksLst;

    @FindBy(xpath = ("(//XCUIElementTypeStaticText[@name=\"T25\"])[1]"))
    private WebElement firstCheckForTable22;

    @FindBy(name = "reOpenCheck")
    private WebElement reOpenCheckButton;

    @FindBy(xpath = "//span[contains(.,' Re-Open Check ')]")
    private WebElement reOpenCheckStats;

    String TableLayout = "//button//span[text()=' Table layout ']";


    String TableLayout1 = "//button//span[text()=' Table layout ']";

    @FindBy(xpath = "(//XCUIElementTypeStaticText[@name=\"T1\"])")
    private WebElement closeCheckTableNo;

    @FindBy (xpath = "//span[contains(.,'Closed')]")
    private WebElement closedTab;

    /*** For select Closed check ****/

    public void verifyClosedCheck(){
        if(closeCheckTableNo.isDisplayed()){
            utils.log().info("Closed checks are visible");
        }else {
            utils.log().info("closed checks are not visible");
        }
    }

    public void selectTableLayoutTab() {
        elementClick(tableLayoutTab, "Tapped Table Layout Tab");
    }

    public void selectCheckStatsTab() throws InterruptedException {
        Thread.sleep(1200);

        elementClick(checkStatsTab1, "Tapped Check Stats Tab");
    }

    public void selectClosedChecksList(){
        elementClick(closedChecksLst, "Closed Checks list is tapped");
    }

    public void pressReopenCheckBtn(){
        elementClick(reOpenCheckButton, "Reopen button is tapped");
    }
    public void pressReopenCheckStatsBtn(){
        elementClick(reOpenCheckStats,"Tapped Reopen check stats button");
    }
    public void pressClosedCheck(){
        elementClick(closedTab,"Tapped closed Tab button");
    }

    public String verifyTableLayoutTab() throws InterruptedException {
        Thread.sleep(300);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        return getText(convertWebElement(TableLayout1),"Table layout screen is displayed - ");
        //   getText(TableLayout,"Table layout screen is displayed - ");
    }

    public String verifyCheckStatsScreen() throws InterruptedException {
        Thread.sleep(300);
        WebElement element = driver.findElement(By.xpath(checkStatsTab));
        utils.log().info(element.getText());
        return element.getText();

    }
}
