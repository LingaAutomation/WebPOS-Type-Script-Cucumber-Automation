package com.qa.pages;

import com.qa.utils.TestUtils;
import org.openqa.selenium.WebElement;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.junit.Assert;
import org.openqa.selenium.By;

import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;

public class TGCustomerProfilePage extends BasePage {



//    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Customer Profile\"]")
//    private WebElement titleTxt;

    public By titleTxt = By.id("Customer Profile");

    public By phoneAsterisk = By.xpath("(//XCUIElementTypeStaticText[@name=\"*\"])[1]");

//    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeStaticText[@name=\"*\"])[1]")
//    private WebElement phoneAsterisk;

    public By addressAsterisk = By.xpath("(//XCUIElementTypeStaticText[@name=\"*\"])[2]");

//    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeStaticText[@name=\"*\"])[2]")
//    private WebElement addressAsterisk;

    public By searchField = By.id("Search");


//    @iOSXCUITFindBy(xpath = "//XCUIElementTypeSearchField[@name=\"Search\"]")
//    private WebElement searchField;

    public By customerToSelect = By.xpath("//XCUIElementTypeStaticText[@name=\"Engin Başaran +905356641754 \"]");

    //    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Engin Başaran +905356641754 \"]")
//    private WebElement customerToSelect;
    private String orderTypeName;


    public TGCustomerProfilePage() {
    }


    public void  randomNumGen() {

        //Class Random
        Random rd = new Random();
        int rdNum;

        // 10 digit phone number
        String m[] = new String[10];

        for (int i = 0; i < 10; i++) {
            rdNum = rd.nextInt(10);
            m[i] = Integer.toString(rdNum);
        }
        //System.out.println(“The phone number is : ” +m[0]+m[1]+m[2]+m[3]+m[4]+m[5]+m[6]+m[7]+m[8]+m[9]);

        WebElement element = mergeAndFindMobileElement(randomPhoneNumberText);
        elementClick(element, "click randomPhoneNumberText ");
        element.sendKeys(m);
    }

    public void selectSearchedCustomer() {
        WebElement element = mergeAndFindMobileElement(searchedCustomer);
        element.isDisplayed();

        WebElement element1 = mergeAndFindMobileElement(saveBtn);
        elementClick(element1, "click saveBtn ");
    }

    public void clickTheSaveButtonForHouseAccount() {
        WebElement element1 = mergeAndFindMobileElement(saveBtn);
        elementClick(element1, "click saveBtn ");
    }

    public void openMaxLimitToggleIfItIsClosed() {
        WebElement element1 = mergeAndFindMobileElement(maxLimitToggle);
        String value=getAttribute(element1,"value");

        if (value.contains("0")) {
            WebElement element = mergeAndFindMobileElement(maxLimitToggle);
            elementClick(element, "click maxLimitToggle ");

        } else if (value.contains("1")) {
            WebElement element2 = mergeAndFindMobileElement(maxLimitText);
            String actualName=elementGetText(element2,"value");
            String expectedName = "Max Limit";

            Assert.assertEquals(actualName, expectedName);
        }
    }

    public void enterLimitAmountForHouseAccount() {
        WebElement element = mergeAndFindMobileElement(limitTextField);
        elementClick(element, "click limitTextField ");

//        WebElement element1 = mergeAndFindMobileElement(numberOne);
//        elementClick(element1, "click numberOne ");
//
//        WebElement element2 = mergeAndFindMobileElement(numberDoubleZero);
//        elementClick(element2, "click numberDoubleZero ");
//        elementClick(element2, "click numberDoubleZero ");
//
//        WebElement element3 = mergeAndFindMobileElement(numberZero);
//        elementClick(element3, "click numberZero ");
//
//        WebElement btnContinue = mergeAndFindMobileElement(continueButton);
//        elementClick(btnContinue, "click continueButton ");

    }
    public void enterPercentage(String pin1,String pin2,String pin0,String pin00){
        WebElement element1 = mergeAndFindMobileElement(numberTwoInHa);
        elementClick(element1, "click numberOne ");

        WebElement element2 = mergeAndFindMobileElement(numberDoubleZeroInHa);
        elementClick(element2, "click numberDoubleZero ");
        elementClick(element2, "click numberDoubleZero ");

        WebElement element3 = mergeAndFindMobileElement(numberZeroInHa);
        elementClick(element3, "click numberZero ");

        WebElement btnContinue = mergeAndFindMobileElement(numberZeroInHa);
        elementClick(btnContinue, "click continueButton ");

    }

    public void openLimitToggleIfItIsClosed() {
        WebElement element = mergeAndFindMobileElement(limitToggle);
        String value = getAttribute(element,"value");

        if (value.contains("0")) {
            WebElement element3 = mergeAndFindMobileElement(limitToggle);
            elementClick(element3, "click limitToggle ");

        } else if (value.contains("1")) {
            WebElement element1 = mergeAndFindMobileElement(limitText);
            String actualName = elementGetText(element1,"value");

            String expectedName = "Limit";

            Assert.assertEquals(actualName, expectedName);
        }
    }

//    public void enterHouseAccountCardNumber() {
//        WebElement element = mergeAndFindMobileElement(houseAccountCardNumberTextField);
//        elementClick(element, "click houseAccountCardNumberTextField ");
//        element.sendKeys("1234567890");
//    }

    public void enterHouseAccountCardNumber(String number) {
        WebElement element = mergeAndFindMobileElement(houseAccountCardNumberTextField);
//        elementClick(element, "click houseAccountCardNumberTextField ");
        element.sendKeys(new TestUtils().dateTimeNumber(),number);
    }

    public void verifyRechargedAmountOnHouseAccount() {
        WebElement element1 = mergeAndFindMobileElement(rechargeTextField);
        String actualName = elementGetText(element1,"value");
        String expectedName = "TL 1.000,00";

        Assert.assertEquals(actualName, expectedName);
    }

    public void enterRechargeAmountForHouseAccount() {
        WebElement element = mergeAndFindMobileElement(rechargeTxtFieldInHa);
        elementClick(element, "click rechargeTextField ");

//        WebElement element1 = mergeAndFindMobileElement(numberOne);
//        elementClick(element1, "click numberOne ");
//
//        WebElement element2 = mergeAndFindMobileElement(numberDoubleZero);
//        elementClick(element2, "click numberDoubleZero ");
//        elementClick(element2, "click numberDoubleZero ");
//
//        WebElement element3 = mergeAndFindMobileElement(numberZero);
//        elementClick(element3, "click numberZero ");
//
//        WebElement btnContinue = mergeAndFindMobileElement(continueButton);
//        elementClick(btnContinue, "click continueButton ");
    }

    public void clickTheUpdateButtonForHouseAccount() {
        WebElement element = mergeAndFindMobileElement(updateButton);
        elementClick(element, "click updateButton ");
    }

    public void verifyHouseAccountPage() {
        WebElement element = mergeAndFindMobileElement(accountType);
        String actualName=elementGetText(element,"verify accountType");
        String expectedName = "House Account";

        Assert.assertEquals(actualName, expectedName);
    }

    public void clickCustomerPlanButton() {
        WebElement element = mergeAndFindMobileElement(customerPlanButton);
        elementClick(element, "click customerPlanButton ");
    }

    public String getTitle() {
        WebElement element = mergeAndFindMobileElement(titleTxt);
        String value= elementGetText(element, "user login window's title is - ");
        return value;
    }

    public String getPhoneAsterisk() {
        WebElement element = mergeAndFindMobileElement(phoneAsterisk);
        String value= elementGetText(element, "* next to Phone field - ");
        return value;
//        return elementGetText(phoneAsterisk, "* next to Phone field - ");
    }

    public String getAddressAsterisk() {
        WebElement element = mergeAndFindMobileElement(addressAsterisk);
        String value= elementGetText(element, "* next to Phone field - ");
        return value;
//        return elementGetText(addressAsterisk, "* next to Phone field - ");
    }

    public void pressSearchField() {
        WebElement element = mergeAndFindMobileElement(searchField);
        elementClick(element, "Tapped search Phone");
//        elementClick(searchField, "Tapped search Phone");
    }

    public void sendCustomerName() {
        WebElement element = mergeAndFindMobileElement(searchField);
        element.sendKeys( "Engin Başaran", "Customer name is entered -");
    }

    public void selectCustomer() {
        WebElement element = mergeAndFindMobileElement(customerToSelect);
        elementClick(element, "Customer selected - ");
//        elementClick(customerToSelect, "Customer selected - ");
    }

    public void pressSaveBtn() {
        WebElement element1 = mergeAndFindMobileElement(saveBtn);
        elementClick(element1, "click saveBtn ");
    }

    public void verifySelectedCustomer() {
        WebElement element1 = mergeAndFindMobileElement(firstName);
        String actualName = elementGetText(element1,"verify firstName");
        WebElement element = mergeAndFindMobileElement(selectedCustomerName);
        String expectedName=elementGetText(element,"verify selectedCustomerName");

        Assert.assertEquals(actualName, expectedName);
    }

    public void enterFirstName() {
        WebElement element1 = mergeAndFindMobileElement(firstName);
        elementClick(element1, "click firstName ");
        element1.sendKeys("Test");
    }

    public void enterLastName() {
        WebElement element1 = mergeAndFindMobileElement(lastName);
        elementClick(element1, "click lastName ");
        element1.sendKeys("Automation");;
    }

    public void addPhoneNumberButton() {
        WebElement element1 = mergeAndFindMobileElement(addPhoneNumberButton);
        elementClick(element1, "click addPhoneNumberButton ");
    }

    public void savePhoneNumberButton() {
        WebElement element1 = mergeAndFindMobileElement(savePhoneNumberButton);
        elementClick(element1, "click savePhoneNumberButton ");
    }

    public long generateId() {
        ThreadLocalRandom random = ThreadLocalRandom.current();
        return random.nextLong(10_000_000_000L, 100_000_000_000L);
    }

    public void enterPhoneNumber() {
        //generateId();
        randomNumGen();

        /*driver.findElement(phoneNumberTextBox).isDisplayed();
        driver.findElement(phoneNumberTextBox).sendKeys("122456712309");*/
    }

    public void addCustomerAddressButton() {
        WebElement element1 = mergeAndFindMobileElement(addCustomerAddressButton);
        elementClick(element1, "click addCustomerAddressButton ");
    }

    public void searchAddress() {
        WebElement element1 = mergeAndFindMobileElement(addressSearchBox);
        elementClick(element1, "click addressSearchBox ");
        element1.sendKeys("Flora Residence");

        WebElement element = mergeAndFindMobileElement(firstSearchedResult);
        elementClick(element, "click firstSearchedResult ");
    }

    public void enterCity() {
        WebElement element = mergeAndFindMobileElement(enterCityTextBox);
        elementClick(element, "click enterCityTextBox ");
        element.sendKeys("Ataşehir");

        WebElement element1 = mergeAndFindMobileElement(hideKeyboardBack);
        elementClick(element1, "click closeKeyboard ");

        WebElement element2 = mergeAndFindMobileElement(saveCustomerAddress);
        elementClick(element2, "click saveCustomerAddress ");
    }

    public void searchCustomer() {
        WebElement element = mergeAndFindMobileElement(searchTextBox1);
        elementClick(element, "click searchTextBox ");
        element.sendKeys("1234567890");

        WebElement element1 = mergeAndFindMobileElement(searchedCustomerOnCustomerProfile);
        elementClick(element1, "click searchTextBox ");
    }

    public void verifyCustomerProfilePage() {
        WebElement element1 = mergeAndFindMobileElement(customerProfileTitle);
        String actualName=elementGetText(element1,"verify customerProfileTitle");
        String expectedName = "Customer Profile";

        Assert.assertEquals(actualName, expectedName);
    }

    public void enterCustomerPhoneToSearch() {
        WebElement element = mergeAndFindMobileElement(addressSearchTextBox);
        element.sendKeys("Test Automation");

        WebElement element1 = mergeAndFindMobileElement(selectedCustomerPhone);
        elementClick(element1, "click selectedCustomerPhone ");
    }

    public void enterEmail() {
        WebElement element1 = mergeAndFindMobileElement(customerEmailAddressTextBox);
        elementClick(element1, "click customerEmailAddressTextBox ");
        element1.sendKeys("testautomation@lingapos.com");

        WebElement element = mergeAndFindMobileElement(hideKeyboard);
        elementClick(element, "click hideKeyboard ");
    }

    public void closeButtonForMobile() {
        WebElement element = mergeAndFindMobileElement(closeButtonForMobile);
        elementClick(element, "click closeButtonForMobile ");
    }

//    public void verifyMobilePhoneEmailWarningPopup() {
//        WebElement element1 = mergeAndFindMobileElement(mobilePhoneEmailPopup);
//        String actualName=elementGetText(element1,"verify mobilePhoneEmailPopup");
//        String expectedName = "Enter Email Id or Mobile Number";
//
//        Assert.assertEquals(actualName, expectedName);
//
//        WebElement element = mergeAndFindMobileElement(warningDoneButton);
//        elementClick(element, "click warningDoneButton");
//    }

    public void verifyMobilePhoneEmailWarningPopup() {
        WebElement element1 = mergeAndFindMobileElement(mobilePhoneEmailPopup);
        String actualName=elementGetText(element1,"verify mobilePhoneEmailPopup");
        String expectedName = "Enter Email Id or Mobile Number";

        Assert.assertEquals(actualName, expectedName);

//        WebElement element = mergeAndFindMobileElement(warningDoneButton);
//        elementClick(element, "click warningDoneButton");
    }

    public void enterNewCustomerPhoneNumber() {
        WebElement element = mergeAndFindMobileElement(phoneNumberTextBox);
        element.sendKeys("135790246900");

        WebElement element1 = mergeAndFindMobileElement(savePhoneNumberButton);
        elementClick(element1, "click savePhoneNumberButton");
    }

    public void clickCustomerAddressDropDownIcon() {
        WebElement element1 = mergeAndFindMobileElement(customerAddressDropDownIcon);
        elementClick(element1, "click customerAddressDropDownIcon");;
    }

    public void verifyEmptyCustomerAddressList() {

        WebElement element1 = mergeAndFindMobileElement(emptyAddressList);
//        waitForVisibility(element1);
        String actualName=elementGetText(element1,"verify emptyAddressList");
        String expectedName ="Empty list";
        Assert.assertEquals(actualName, expectedName);
    }

    public void editCustomerFirstName() {
        WebElement element1 = mergeAndFindMobileElement(firstName);
        element1.clear();
        elementClick(element1, "click firstName ");
        element1.sendKeys("Test");

        WebElement element = mergeAndFindMobileElement(hideKeyboard);
        elementClick(element, "click hideKeyboard ");

        WebElement element2 = mergeAndFindMobileElement(saveBtn);
        elementClick(element2, "click saveBtn ");
    }

    public void selectLastAddedCustomer() {

        List<WebElement> phoneOrders = selectAndFindElements("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeTable");
        phoneOrders = selectAndFindElements("(//XCUIElementTypeStaticText[@name=\"Test Automation\"])[last()]");
        phoneOrders.get(phoneOrders.size() - 1).click();

//        List<WebElement> customers = (List<WebElement>) driver.findElements(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeTable"));
//
//        for (int index = 0; index < customers.size(); index++) {
//
//            customers = (List<WebElement>) driver.findElements(By.xpath("(//XCUIElementTypeStaticText[@name=\"Test Automation\"])[last()]"));
//
//            customers.get(customers.size() - 1).click();
//        }

    }

    public void swipeUntilLastAddedCustomer(String direction) throws Exception {

           /*direction = direction.toLowerCase();
           int i = 0;
           boolean found = false;

           while (i < 3) {
               try {
                   if (isElementExists()) {
                       found = true;
                       break;
                   } else {
                       scrollToElement(customer,direction);
                       i++;
                       continue;
                   }
               } catch (Exception e) {
                   scrollToElement(customer,direction);
                   i++;
                   if (i == 3)
                       Assert.fail(e.getMessage());
                   continue;
               }
           }*/
    }
    //add new method
    public void clickCloseButtonOnCustomerProfile(){
        WebElement element1 = mergeAndFindMobileElement(customerProfileClosedButton);
        elementClick(element1, "Click Close Button on Customer profile Page ");
    }
}


