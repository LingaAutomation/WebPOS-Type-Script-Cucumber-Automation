package com.qa.pages;

import com.qa.utils.TestUtils;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.By;

public class TGOrderManagementScreen extends OrderTypeWindow{
//    @iOSXCUITFindBy(id = "Counting Machine" ) //id("Counting Machine").click();))
//    private WebElement countingMachineBtn;
    public By countingMachineBtn = By.id("Counting Machine");

//    @iOSXCUITFindBy(accessibility = "All" )
//    private WebElement allBtnMachineBtn;
    public By allBtnMachineBtn = By.id("All");

//    @iOSXCUITFindBy(xpath = "//*[@name='1']" ) //seat number1
//    private WebElement seat1;
    public By seat1 = By.id("1");


//    @iOSXCUITFindBy(xpath = "//*[@name='2']" ) //seat number2
//    private WebElement seat2;
    public By seat2 = By.id("2");

//    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeStaticText[@name=\"3\"])[2]" ) //seat number3 to be deleted
//    private WebElement seat3;
    public By seat3 = By.xpath("(//XCUIElementTypeStaticText[@name=\"3\"])[2]");

//    @iOSXCUITFindBy(accessibility = "PIZZA" )
//    private WebElement pizzaCategoryBtn;
    public By pizzaCategoryBtn = By.id("PIZZA");

//    @iOSXCUITFindBy(xpath ="(//XCUIElementTypeButton[@name='arrow down'])[2]")
//    private WebElement arrowDownForOtherMenuItems;
    public By arrowDownForOtherMenuItems = By.xpath("(//XCUIElementTypeButton[@name='arrow down'])[2]");

//    @iOSXCUITFindBy(xpath = "//*[@name='Meat Lovers Pizza']" )
//    private WebElement meatLoversPizzaBtn;
    public By meatLoversPizzaBtn = By.id("Meat Lovers Pizza");

//    @iOSXCUITFindBy(xpath = "//*[@name='Ham']" )
//    private WebElement hamBtn;
    public By hamBtn = By.id("Ham");

//    @iOSXCUITFindBy(xpath = "//*[@name='Feta Cheese']" )
//    private WebElement fetaCheeseBtn;
    public By fetaCheeseBtn = By.id("Feta Cheese");

//    @iOSXCUITFindBy(xpath = "//*[@name='Done']" )
//    private WebElement doneForThisMenuItem;
    public By doneForThisMenuItem = By.id("Done");

//    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeButton[@name='arrow down'])[1]" )
//    private WebElement arrowDownBtn1;
    public By arrowDownBtn1 = By.xpath("(//XCUIElementTypeButton[@name='arrow down'])[1]");

//    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeButton[@name='arrow down'])[2]" )
//    private WebElement arrowDownBtn2;
    public By arrowDownBtn2 = By.xpath("(//XCUIElementTypeButton[@name='arrow down'])[2]");

//    @iOSXCUITFindBy(accessibility = "Pasta" )
//    private WebElement pastaCategoryBtn;
    public By pastaCategoryBtn = By.id("Pasta");

//    @iOSXCUITFindBy(accessibility = "Ravioli" )
//    private WebElement ravioliBtn;
    public By ravioliBtn = By.id("Ravioli");

//    @iOSXCUITFindBy(accessibility = "NO EGGPLANT" )
//    private WebElement noEggPlantBtn;
    public By noEggPlantBtn = By.id("NO EGGPLANT");

//    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='finish']" )
//    private WebElement finishBtn;
    public By finishBtn = By.id("finish");

//    @iOSXCUITFindBy(accessibility = "ADD" )
//    private WebElement addSeatBtn;
    public By addSeatBtn = By.id("ADD");

//    @iOSXCUITFindBy(accessibility = "edit DeleteSeats" )
//    private WebElement editDeleteSeatsBtn;
    public By editDeleteSeatsBtn = By.id("edit DeleteSeats");

//    @iOSXCUITFindBy(accessibility = "done DeleteSeats" )
//    private WebElement doneDeleteSeatsBtn;
    public By doneDeleteSeatsBtn = By.id("done DeleteSeats");

//    @iOSXCUITFindBy(accessibility = "finish" )
//    private WebElement finishOrderBtn;
    public By finishOrderBtn = By.id("finish");

//    public TGOrderManagementScreen() {
//        super(TestUtils.driver);
//    }

    public TGTillManagementScreen pressCountingMachineBtn(){
        WebElement element=mergeAndFindMobileElement(countingMachineBtn);
        elementClick(element, "Counting Machine button pressed - ");
//        elementClick(countingMachineBtn, "Counting Machine button pressed - ");
        return  new TGTillManagementScreen();
    }

    public void pressArrowDown1 (){
        WebElement element=mergeAndFindMobileElement(arrowDownBtn1);
        elementClick(element, "ArrowDown Button 1 is tapped");
//        elementClick(arrowDownBtn1, "ArrowDown Button 1 is tapped");
    }

    public void pressArrowDown2 (){
        WebElement element=mergeAndFindMobileElement(arrowDownForOtherMenuItems);
        elementClick(element, "the rest of the categories is listed");

//        elementClick(arrowDownForOtherMenuItems, "the rest of the categories is listed");
    }

    public void checkNoOfSeats(String seatNo){
        if(find(By.xpath("//*[@name=\"" + seatNo + "\"]"),10)){
            utils.log().info("Seats are created correctly");
        }
        else
        {
            utils.log().info("Seats are not created correctly");
        }
    }

    public void addNewSeat(){
        WebElement element=mergeAndFindMobileElement(addSeatBtn);
        elementClick(element, "added a new seat to the table");
//        elementClick(addSeatBtn, "added a new seat to the table");
    }

    public void deleteSeat(){
        pressArrowDown1();
        WebElement element=mergeAndFindMobileElement(editDeleteSeatsBtn);
        elementClick(element, "editDeleteSeatsBtn is tapped");
//        elementClick(editDeleteSeatsBtn,"editDeleteSeatsBtn is tapped");
        WebElement element1=mergeAndFindMobileElement(seat3);
        elementClick(element1, "selected seat3 to be deleted");
//        elementClick(seat3,"selected seat3 to be deleted");
        WebElement element2=mergeAndFindMobileElement(doneDeleteSeatsBtn);
        elementClick(element2, "doneDeleteSeatsBtn is tapped");
//        elementClick(doneDeleteSeatsBtn,"doneDeleteSeatsBtn is tapped");
        pressArrowDown1();
    }

    public void selectSeat1(){

        WebElement element=mergeAndFindMobileElement(seat1);
        elementClick(element, "selected seat 1");
//        elementClick(seat1, "selected seat 1" );
    }

    public void selectSeat2(){
        WebElement element=mergeAndFindMobileElement(seat2);
        elementClick(element, "selected seat 2");
//        elementClick(seat2, "selected seat 2" );
    }

    /****** Select Categories ******/
    public void selectPizzaCategory(){
        WebElement element=mergeAndFindMobileElement(pizzaCategoryBtn);
        elementClick(element, "Pizza Category selected");
//        elementClick(pizzaCategoryBtn, "Pizza Category selected");
    }

    public void selectPastaCategory(){
        pressArrowDown2();
        WebElement element=mergeAndFindMobileElement(pastaCategoryBtn);
        elementClick(element, "Pizza Category selected");
//        elementClick(pastaCategoryBtn, "Pizza Category selected");
    }

    /****** Select Menu Items ******/
    public void selectMeatLoversPizza(){
        WebElement element=mergeAndFindMobileElement(meatLoversPizzaBtn);
        elementClick(element, "Meat Lovers Pizza selected");
//        elementClick(meatLoversPizzaBtn, "Meat Lovers Pizza selected");
    }

    public void selectRavioli(){
        WebElement element=mergeAndFindMobileElement(ravioliBtn);
        elementClick(element, "Ravioli selected");
//        elementClick(ravioliBtn,"Ravioli selected");
    }

    /****** Select Modifiers ******/

    public void selectHam(){
        WebElement element=mergeAndFindMobileElement(hamBtn);
        elementClick(element, "Ham selected");
//        elementClick(hamBtn, "Ham selected");
    }
    public void selectFetaCheese(){
        WebElement element=mergeAndFindMobileElement(fetaCheeseBtn);
        elementClick(element, "feta cheese selected");
//        elementClick(fetaCheeseBtn, "feta cheese selected");
    }

    public void selectNoEggPlant(){
        WebElement element=mergeAndFindMobileElement(noEggPlantBtn);
        elementClick(element, "No eggplant selected");
//        elementClick(noEggPlantBtn, "No eggplant selected");
    }

    public void doneForTheMenuItem(){
        WebElement element=mergeAndFindMobileElement(doneForThisMenuItem);
        elementClick(element, "done for the menu item");
//        elementClick(doneForThisMenuItem, "done for the menu item");
    }

    public void pressFinish(){
        WebElement element=mergeAndFindMobileElement(finishOrderBtn);
        elementClick(element, "finish button tapped");
//        elementClick(finishOrderBtn, "finish button tapped");
    }

}
