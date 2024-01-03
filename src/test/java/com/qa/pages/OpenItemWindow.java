package com.qa.pages;

import com.qa.utils.TestUtils;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.time.Duration;
import java.util.List;


public class OpenItemWindow extends OrderManagementScreen{


    @FindBy(xpath = "/html/body/div[1]/div[2]/div/mat-dialog-container/app-open-item/ion-content/ion-grid/ion-row[1]/ion-col[2]/mat-form-field/div/div[1]/div/mat-select/div/div[2]")
    WebElement coursingNameTxt;

    @FindBy( xpath = "//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[3]/XCUIElementTypeTextField[1]" )
    WebElement CoursingNameTxtFld;

    //XCUIElementTypeApplication[@name="Linga POS"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[3]/XCUIElementTypeTextField[1]




    @FindBy( name = "1")
    WebElement price1Check;

    @FindBy(name = "0")
    WebElement price0;









    public void selectCoursingNameTextFld(){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        elementClick(coursingNameTxt, "Coursing Name text field is selected -");
    }



    public void swipeToDessert() throws InterruptedException {
        WebElement DatePickerWheel =(WebElement) driver.findElement(By.xpath("//XCUIElementTypePicker"));

        List<WebElement> course= DatePickerWheel.findElements(By.xpath("//XCUIElementTypePickerWheel"));

        course.get(0).sendKeys("DESSERT");
    }






    public void press1ForCheckOpenItem(){
        elementClick(price1Check,"Tapped 1 Button ");
    }

    public void press0(){
        elementClick( price0, "0 is selected - ");
    }




    public String getValueFromOpenItemFieldTxt1 = " ";
    public void getValueFromOpenItemScreen(){
        WebElement getValueFromOpenItemField = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeTextField"));
        String getValueFromOpenItemFieldTxt = getValueFromOpenItemField.getText();
          getValueFromOpenItemFieldTxt1 = getValueFromOpenItemFieldTxt.replaceAll("[A-Z$,. ]","");
          TestUtils.openItemValue = getValueFromOpenItemFieldTxt1;
          utils.log().info("Value From the Open Item Window - "+getValueFromOpenItemFieldTxt1);
      //  int getValueFromOpenItemFieldNumber = Integer.parseInt(getValueFromOpenItemFieldTxt1);


    }

    public void verifyOpenItemPriceWithOrderScreenPrice(){
        WebElement subTotal = (WebElement) driver.findElements(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeStaticText[1]"));
         String subTotalTxt = subTotal.getText();
        String subTotalTxt1 = subTotalTxt.replaceAll("[A-Z$,. ]","");
        Assert.assertEquals(TestUtils.openItemValue,subTotalTxt1);
        utils.log().info("Subtotal is Same - "+subTotalTxt1);

    }


}
