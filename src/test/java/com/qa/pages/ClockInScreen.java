package com.qa.pages;

import org.openqa.selenium.By;
import static com.qa.utils.TestUtils.driver1;

public class ClockInScreen extends SyncClass2{

    String pin4Time1 = "//button[.='4']";
    String pin3Time1 = "//button[.='3']";
    String pin2Time1 = "//button[.='2']";
    String pin1Time1 = "//button[.='1']";

    public void enterClockPinForPhone() throws InterruptedException {
        Thread.sleep(1500);
        elementClick1(pin1Time1,"Window 1 - Selected - 1");
        elementClick1(pin2Time1,"Window 1 - Selected - 2");
        elementClick1(pin3Time1,"Window 1 - Selected - 3");
        elementClick1(pin4Time1,"Window 1 - Selected - 4");
        elementClick1("//button[contains(.,'Login')]","Window 1 - Login");
    }

    public void enterClockPinForPhone1() throws InterruptedException {
        Thread.sleep(1500);
        elementClick2(pin1Time1,"Window 2 - Selected - 1");
        elementClick2(pin2Time1,"Window 2 - Selected - 2");
        elementClick2(pin3Time1,"Window 2 - Selected - 3");
        elementClick2(pin4Time1,"Window 2 - Selected - 4");
        elementClick2("//button[contains(.,'Login')]","Window 2 - Login");
    }



}
