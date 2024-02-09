package com.qa.pages;

import com.qa.utils.TestUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;


public class BarTabScreen extends OrderManagementScreen{

    public BarTabScreen(WebDriver driver) {
        super(TestUtils.driver);
        this.driver =TestUtils.driver;
        PageFactory.initElements(this.driver,this);

    }

    @FindBy(xpath = "//button[contains(.,'BarTab')]")
    WebElement barTab;

    @FindBy(xpath = "New Tab")
    WebElement newTabBar;


    @FindBy(xpath="//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeCollectionView[2]/XCUIElementTypeCell[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]")
    WebElement barTab1;

    @FindBy (xpath = "//button[contains(.,'New Tab')]")
    WebElement newTab;

    @FindBy (xpath = "//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeCollectionView[2]/XCUIElementTypeCell[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]")
    WebElement Check1;

    @FindBy (xpath = "//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeCollectionView[2]/XCUIElementTypeCell[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]")
    WebElement Check2;

    @FindBy(xpath = "(//XCUIElementTypeStaticText[@name=\"Walkin\"])[1]")
    WebElement Barcheck1;

    @FindBy(xpath = "(//XCUIElementTypeStaticText[@name=\"Walkin\"])[2]")
    WebElement Barcheck2;

    @FindBy (xpath = "//linga-icon[@symbol='operationGear']")
    WebElement settings;

    @FindBy (xpath = "//button[.='POS Settings']")
    WebElement POSsettings;

    @FindBy (xpath = "//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeScrollView/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeOther[10]/XCUIElementTypeSwitch")
    WebElement QuickBar;

    @FindBy (xpath = "//linga-icon[@symbol='menuIcon']")
    WebElement ToggleIcon;

    @FindBy (xpath = "//label[.='POS']")
    WebElement POSIcon;

    @FindBy(xpath = "BarTab")
    WebElement barTabScreen;

    @FindBy(xpath = "//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeSearchField")
    WebElement searchFieldOnBarTab;




    public void verifyBarTabIsOpen(){
        if(newTabBar.isDisplayed()) {
            utils.log().info("BarTab is opened successfully");
        }
        else{
            utils.log().info("BarTab is not opened");
        }
    }

    public void verifyBarTab1(){
        if(barTab1.isDisplayed()){
            utils.log().info("BarTab is created successfully");
        }
        else
        {
            utils.log().info("BarTab is not created successfully");
        }
    }

    public void pressBarTabBtn() throws InterruptedException {
        Thread.sleep(1000);
        elementClick(barTab, "Tapped BarTab Layout"); }

    public void pressNewTabBtn(){ elementClick(newTab,"Tapped Newtab from BarTab Layout");}

    public void pressSettings(){elementClick(settings,"Tapped the settings button");}

    public void pressPOSset(){elementClick(POSsettings,"Tapped POS Setting");}

    public void pressQuickBar() throws Exception {
        new BasePage().click(driver.findElement(By.xpath("//button[contains(.,'BarTab')]")));
        utils.log().info("Tapped Quick bar Icon");
    }

    public void pressToggleBtn(){elementClick(ToggleIcon,"Tapped the Toggle Icon button");}

    public void pressPOSIcon(){elementClick(POSIcon,"Tapped POS Icon ");}

    public void verifyPOSIsEnableOrNot(){
        if(POSIcon.isSelected()){
            utils.log().info("POS is Enabled");
        }else{
            utils.log().info("POS is NOT Enabled");
        }
    }

    public void prsssCheck1(){elementClick(Barcheck1,"Tapped Active Check1 from BarTab Layout");}

    public void pressCheck2(){elementClick(Barcheck2,"Tapped Active Check2 from BarTab Layout");}

    //new (nov 12)
    public String verifyBarTabScreen(){

        String msg = "BarTab Screen is displayed - ";
        WebElement e = driver.findElement(By.xpath("//button[contains(.,'BarTab')]"));
        return getText(e,msg);
    }

    public void clickBarTabCheck(){
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        String globalCheckNumber= TestUtils.globalCheckNumber;
        searchFieldOnBarTab.sendKeys(globalCheckNumber);
        WebElement phoneOrders = mergeAndFindElement("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeCollectionView[2]/XCUIElementTypeCell[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]","",TestUtils.XPath) ;
        elementClick(phoneOrders,"Tapped Closed Check in New Tab - "+ globalCheckNumber);
    }

    public void verifyPreAuthWindow(){
        WebElement preAuth =  driver.findElement(By.xpath(""));
        if(preAuth.isDisplayed()){
            utils.log().info("Pre Auth window is Displayed");
        }else{
            utils.log().info("Pre Auth window is NOT Displayed");
        }
    }
    @FindBy(xpath = "No Device is connected to this iPad")
    WebElement noDeviceIsConnectedTxt;
    public String verifyNoDeviceIsConnected(){
        return getText(noDeviceIsConnectedTxt,"Device Txt is Displayed as - ");
    }

    public void clickSplitBtn(){
        WebElement splitBtn =  driver.findElement(By.xpath("//button[contains(.,'Split')]"));
        elementClick(splitBtn,"Split Btn Selected");
    }

    public void clickTheCheckFromTheBartabScreen() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        WebElement searchTabBarTab =  driver.findElement(By.xpath("//input[@placeholder='Search Name or Check Number']"));
        searchTabBarTab.clear();
        searchTabBarTab.sendKeys(TestUtils.globalCheckNumber);
        Thread.sleep(2000);
        WebElement tabCheck =  driver.findElement(By.xpath("//ion-content[contains(@class,'barTabContent')]/app-bar-tab/ion-grid/ion-row/ion-col[1]"));
        elementClick(tabCheck,"Tapped select check - ");
    }

    public void clickTheCheckFromTheBarTabScreenForMerge() throws InterruptedException {
        Thread.sleep(2000);
        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
  //      WebElement tabCheck =  driver.findElement(By.xpath()("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[4]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeCollectionView[2]/XCUIElementTypeCell[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]");
//        WebElement cancelBtn =  driver.findElement(By.xpath()("Clear text");
//        elementClick(cancelBtn,"Selected - "+cancelBtn.getText());

        //XCUIElementTypeApplication[@name="Linga POS"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[4]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeSearchField
        WebElement searchTabBarTab =  driver.findElement(By.xpath("//input[@placeholder='Search Name or Check Number']"));
        searchTabBarTab.sendKeys(TestUtils.globalCheckNumber);
        Thread.sleep(2000);
        WebElement tabCheck =  driver.findElement(By.xpath("//ion-content[contains(@class,'barTabContent')]/app-bar-tab/ion-grid/ion-row/ion-col[1]"));
        elementClick(tabCheck,"Tapped select check - "+TestUtils.globalCheckNumber);

    }
    public void clickTheCheckFromTheBartabScreenForMerge1() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        Thread.sleep(2000);
//        WebElement cancelBtn =  driver.findElement(By.xpath("//button[@class='searchbar-clear-button sc-ion-searchbar-md']//ion-icon[contains(@class,'searchbar-clear-icon')]"));
//        elementClick(cancelBtn,"Selected - "+cancelBtn.getText());

                                                                                          //XCUIElementTypeApplication[@name="Linga POS"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[4]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeSearchField
        WebElement searchTabBarTab =  driver.findElement(By.xpath("//input[@placeholder='Search Name or Check Number']"));
        searchTabBarTab.click();
        searchTabBarTab.clear();
        searchTabBarTab.sendKeys(TestUtils.globalCheckNumber1);
        Thread.sleep(2000);
        WebElement tabCheck =  driver.findElement(By.xpath("//ion-content[contains(@class,'barTabContent')]/app-bar-tab/ion-grid/ion-row/ion-col[1]"));
        elementClick(tabCheck,"Tapped select check - "+TestUtils.globalCheckNumber1);
    }
}
