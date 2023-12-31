package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.junit.Assert;
import org.openqa.selenium.By;
import java.util.concurrent.TimeUnit;

public class TGPosSettingsPage extends BasePage {


    public void swipeUntilSaveChangesButton(String direction) throws Exception {
        direction = direction.toLowerCase();

        int i = 0;
        boolean found = false;

        while (i < 3) {
            try {
                if (isElementExists()) {
                    found = true;
                    break;
                } else {
                    scrollToElement(saveChangesButton, direction);
                    i++;
                    continue;
                }
            } catch (Exception e) {
                scrollToElement(saveChangesButton, direction);
                i++;
                if (i == 3)
                    Assert.fail(e.getMessage());
                continue;
            }
        }
    }

    public void closeAskCustomerNameOptionIfEnable(String direction, String direction1) throws Exception {
//        scrollToElement(posSettingHeader,direction1);

        WebElement element = mergeAndFindMobileElement(posSettingHeader);
        String actualName = elementGetText(element,"verify posSettingHeader");
        String expectedName = "Till Settings";

        Assert.assertEquals(actualName, expectedName);

        direction = direction.toLowerCase();
        direction1 = direction1.toLowerCase();

//        scrollToElement(barTabOption, direction);

        int i = 0;
        boolean found = false;

        while (i < 5) {
            try {
                if (isElementExists()) {
                    found = true;
                    break;
                } else {
                    scrollToElement(OverWriteCCOption, direction);
                    i++;
                    continue;
                }
            } catch (Exception e) {
                scrollToElement(OverWriteCCOption, direction);
                i++;
                if (i == 5)
                    Assert.fail(e.getMessage());
                continue;
            }
        }
        WebElement element1 = mergeAndFindMobileElement(askCustomerNameToggle);
        String value = getAttribute(element1,"value");

        if (value.contains("1")) {
            WebElement element2 = mergeAndFindMobileElement(askCustomerNameToggle);
            elementClick(element2, "click askCustomerNameToggle Button ");
            swipeUntilSaveChangesButton(direction1);
            WebElement element3 = mergeAndFindMobileElement(saveChangesButton);
            elementClick(element3, "click saveChangesButton Button ");
            WebElement element4 = mergeAndFindMobileElement(doneButton);
             elementClick(element4, "click saveChangesButton Button ");

        }
//        else if (value.contains("0")) {
//            WebElement menuIcon= mergeAndFindMobileElement(operationMenuIcon);
//            elementClick(menuIcon, "click operationMenuIcon ");
//
//            WebElement tabPos= mergeAndFindMobileElement(posTab);
//            elementClick(tabPos, "click operationMenuIcon ");
//        }
        WebElement menuIcon= mergeAndFindMobileElement(operationMenuIcon);
        elementClick(menuIcon, "click operationMenuIcon ");
//        elementClick(menuIcon, "click operationMenuIcon ");
//        WebElement tabPos= mergeAndFindMobileElement(posTab);
//        elementClick(tabPos, "click operationMenuIcon ");
    }


    public void closeEnableCashDropOptionIfEnable(String direction) throws Exception {
        direction = direction.toLowerCase();

        int i = 0;
        boolean found = false;

        while (i < 3) {
            try {
                if (isElementExists()) {
                    found = true;
                    break;
                } else {
                    scrollToElement(barTabOption, direction);
                    i++;
                    continue;
                }
            } catch (Exception e) {
                scrollToElement(barTabOption, direction);
                i++;
                if (i == 3)
                    Assert.fail(e.getMessage());
                continue;
            }
        }
        WebElement element1 = mergeAndFindMobileElement(enableCashDropToggle);
        String value = getAttribute(element1,"value");

        if (value.contains("0")) {
            WebElement menuIcon= mergeAndFindMobileElement(operationMenuIcon);
            elementClick(menuIcon, "click operationMenuIcon ");

            WebElement tabPos= mergeAndFindMobileElement(posTab);
            elementClick(tabPos, "click operationMenuIcon ");

        } else if (value.contains("1")) {
            WebElement element= mergeAndFindMobileElement(askCustomerNameToggle);
            elementClick(element, "click askCustomerNameToggle ");
            swipeUntilSaveChangesButton("down");

            WebElement element2= mergeAndFindMobileElement(saveChangesButton);
            elementClick(element2, "click saveChangesButton ");

            WebElement menuIcon= mergeAndFindMobileElement(operationMenuIcon);
            elementClick(menuIcon, "click operationMenuIcon ");

            WebElement tabPos= mergeAndFindMobileElement(posTab);
            elementClick(tabPos, "click operationMenuIcon ");
        }
    }

    public void openEnableCashDropOptionIfDisable(String direction) throws Exception {
//        direction = direction.toLowerCase();
//
//        int i = 0;
//        boolean found = false;
//
//        while (i < 3) {
//            try {
//                if (isElementExists()) {
//                    found = true;
//                    break;
//                } else {
//                    scrollToElement(barTabOption, direction);
//                    i++;
//                    continue;
//                }
//            } catch (Exception e) {
//                scrollToElement(barTabOption, direction);
//                i++;
//                if (i == 3)
//                    Assert.fail(e.getMessage());
//                continue;
//            }
//        }
        WebElement element1 = mergeAndFindMobileElement(enableCashDropToggle);
        String value = getAttribute(element1,"value");

        if (value.contains("0")) {
            WebElement element= mergeAndFindMobileElement(enableCashDropToggle);
            elementClick(element, "click askCustomerNameToggle ");
            swipeUntilSaveChangesButton("down");

            WebElement element2= mergeAndFindMobileElement(saveChangesButton);
            elementClick(element2, "click saveChangesButton ");

            WebElement element3= mergeAndFindMobileElement(doneButton);
            elementClick(element3, "click doneButton ");


            WebElement menuIcon= mergeAndFindMobileElement(operationMenuIcon);
            elementClick(menuIcon, "click operationMenuIcon ");

//            WebElement tabPos= mergeAndFindMobileElement(posTab);
//            elementClick(tabPos, "click operationMenuIcon ");


        } else if (value.contains("1")) {
            WebElement menuIcon= mergeAndFindMobileElement(operationMenuIcon);
            elementClick(menuIcon, "click operationMenuIcon ");

//            WebElement tabPos= mergeAndFindMobileElement(posTab);
//            elementClick(tabPos, "click operationMenuIcon ");
        }
    }

    public void openAskCustomerNameOptionIfDisable(String direction,String direction1) throws Exception {
        WebElement element= mergeAndFindMobileElement(posSettingHeader);
        String actualName=elementGetText(element,"verify posSettingHeader");

        String expectedName = "Till Settings";

        Assert.assertEquals(actualName, expectedName);

        direction = direction.toLowerCase();

        int i = 0;
        boolean found = false;

        while (i < 5) {
            try {
                if (isElementExists()) {
                    found = true;
                    break;
                } else {
                    scrollToElement(OverWriteCCOption, direction);
                    i++;
                    continue;
                }
            } catch (Exception e) {
                scrollToElement(OverWriteCCOption, direction);
                i++;
                if (i == 5)
                    Assert.fail(e.getMessage());
                continue;
            }
        }
        WebElement element2 = mergeAndFindMobileElement(askCustomerNameToggle);
        String value = getAttribute(element2,"value");

        if (value.contains("0")) {
            WebElement element1 = mergeAndFindMobileElement(askCustomerNameToggle);
            elementClick(element1, "click askCustomerNameToggle ");
            swipeUntilSaveChangesButton("down");

            WebElement element3 = mergeAndFindMobileElement(saveChangesButton);
            elementClick(element3, "click saveChangesButton ");



            WebElement element4 = mergeAndFindMobileElement(doneButton);
            elementClick(element4, "click Done Button ");

        }
//        } else if (value.contains("1")) {
//            WebElement menuIcon= mergeAndFindMobileElement(operationMenuIcon);
//            elementClick(menuIcon, "click operationMenuIcon ");
//
//            WebElement tabPos= mergeAndFindMobileElement(posTab);
//            elementClick(tabPos, "click operationMenuIcon ");
//        }
        WebElement menuIcon= mergeAndFindMobileElement(operationMenuIcon);
        elementClick(menuIcon, "click operationMenuIcon ");
//        elementClick(menuIcon, "click operationMenuIcon ");
//        WebElement tabPos= mergeAndFindMobileElement(posTab);
//        elementClick(tabPos, "click operationMenuIcon ");
    }
    public void closeEnableCashDropOptionIfDisable(String direction) throws Exception {
//        direction = direction.toLowerCase();
//
//        int i = 0;
//        boolean found = false;
//
//        while (i < 3) {
//            try {
//                if (isElementExists()) {
//                    found = true;
//                    break;
//                } else {
//                    scrollToElement(enableCashDropToggle, direction);
//                    i++;
//                    continue;
//                }
//            } catch (Exception e) {
//                scrollToElement(enableCashDropToggle, direction);
//                i++;
//                if (i == 3)
//                    Assert.fail(e.getMessage());
//                continue;
//            }
//        }
        WebElement element1 = mergeAndFindMobileElement(enableCashDropToggle);
        String value = getAttribute(element1,"value");

        if (value.contains("1")) {
            WebElement element= mergeAndFindMobileElement(enableCashDropToggle);
            elementClick(element, "click askCustomerNameToggle ");
//            swipeUntilSaveChangesButton("down");

            WebElement element2= mergeAndFindMobileElement(saveChangesButton);
            elementClick(element2, "click saveChangesButton ");

            WebElement element3= mergeAndFindMobileElement(doneButton);
            elementClick(element3, "click saveChangesButton ");

            WebElement menuIcon= mergeAndFindMobileElement(operationMenuIcon);
            elementClick(menuIcon, "click operationMenuIcon ");

            WebElement tabPos= mergeAndFindMobileElement(posTab);
//            elementClick(tabPos, "click operationMenuIcon ");

        } else if (value.contains("0")) {
            WebElement menuIcon= mergeAndFindMobileElement(operationMenuIcon);
            elementClick(menuIcon, "click operationMenuIcon ");

            WebElement tabPos= mergeAndFindMobileElement(posTab);
//            elementClick(tabPos, "click operationMenuIcon ");
        }
    }
}







