package com.qa.pages;

import com.qa.utils.TestUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class OrdersAndDriversListScreen extends BasePage {

    public WebDriver driver = TestUtils.driver;

    public OrdersAndDriversListScreen() {

        this.driver = TestUtils.driver;

        PageFactory.initElements(this.driver,this);
    }
    @FindBy(xpath = "//span[contains(.,'Table layout')]")
    private WebElement tableLayoutTab;

    @FindBy(xpath = "Check Stats")
    private WebElement checkStatsTab;

    @FindBy(xpath = "//button[contains(.,'Check Status')]")
    private WebElement checkStatsTab1;

    @FindBy(xpath = "Closed")
    private WebElement closedChecksLst;

    @FindBy(xpath = ("(//XCUIElementTypeStaticText[@name=\"T25\"])[1]"))
    private WebElement firstCheckForTable22;

    @FindBy(xpath = "reOpenCheck")
    private WebElement reOpenCheckButton;

    @FindBy(xpath = "//button[contains(.,'Re-Open Check')]")
    private WebElement reOpenCheckStats;

    @FindBy(xpath = "Table Layout")
    private WebElement TableLayout;

    @FindBy(xpath = "//button//span[contains(.,'Table layout')]")
    private WebElement TableLayout1;

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
        driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
        return elementGetText(TableLayout1,"Text");
        //   getText(TableLayout,"Table layout screen is displayed - ");
    }

    public String verifyCheckStatsScreen(){
        return elementGetText(checkStatsTab,"Text");
    }
}
