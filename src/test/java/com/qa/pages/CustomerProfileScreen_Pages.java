//package com.qa.pages;
//
//
//import com.qa.utils.TestUtils;
//import io.appium.java_client.MobileElement;
//import io.appium.java_client.pagefactory.iOSXCUITFindBy;
//import org.apache.commons.lang.RandomStringUtils;
//import org.openqa.selenium.By;
//
//import java.util.List;
//import java.util.Random;
//
//public class CustomerProfileScreen_Pages extends BasePage{
//
//    public String check = " ", fName = "", MobNum = "", Addr = "";
//
//    public int itemToSelect1;
//
//    @iOSXCUITFindBy(xpath ="(//XCUIElementTypeButton[@name=\"arrow down\"])[2]")
//    private MobileElement arrowDownForOtherMenuItems;
//
//    @iOSXCUITFindBy(accessibility = "CIMiniFood" )
//    private MobileElement saladCategoryBtn;
//
//    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeButton[@name=\"Done\"])[1]")
//    private MobileElement doneButton;
//
//    public CustomerProfileScreen_Pages() {
//    }
//
//    public void clickForHereInOrderTypePopup() throws InterruptedException {
//        Thread.sleep(500);
//        MobileElement element = mergeAndFindMobileElement(forHereOrderTypeFromPopup);
//        elementClick(element,"Click the For Here Order type from the Order Type Popup");
//    }
//
//    public void clickToGoInOrderTypePopup() throws InterruptedException {
//        Thread.sleep(500);
//        MobileElement element = mergeAndFindMobileElement(toGoOrderTypeFromPopup);
//        elementClick(element,"Click the To Go Order type from the Order Type Popup");
//    }
//
//    public void clickDeliveryInOrderTypePopup() throws InterruptedException {
//        Thread.sleep(500);
//        MobileElement element = mergeAndFindMobileElement(deliveryOrderTypeFromPopup);
//        elementClick(element,"Click the Delivery Order type from the Order Type Popup");
//    }
//
//    public void clickPhoneTogoInOrderTypePopup() throws InterruptedException {
//        Thread.sleep(500);
//        MobileElement element = mergeAndFindMobileElement(phoneToGoOrderTypeFromPopup);
//        elementClick(element,"Click the Phone To Go Order type from the Order Type Popup");
//    }
//
//    public void clickPhoneDeliveryInOrderTypePopup() throws InterruptedException {
//        Thread.sleep(500);
//        MobileElement element = mergeAndFindMobileElement(phoneDeliveryOrderTypeFromPopup);
//        elementClick(element,"Click the Phone Delivey Order type from the Order Type Popup");
//    }
//
//    public void clickCloseButn()
//    {
//        MobileElement element = mergeAndFindMobileElement(closeBtnOfCustomerProfile);
//        elementClick(element,"Click the Close button of Customer Profile Screen");
//    }
//
//    public void clickYesBtnInPopup()
//    {
//        MobileElement element = mergeAndFindMobileElement(yesBtnForShiftToQSR);
//        elementClick(element,"Click the Yes button in the Switch to QSR popup");
//    }
//
//    public void clickAllBtn()
//    {
//        MobileElement element = mergeAndFindMobileElement(allBtnQSROrderScreen);
//        elementClick(element,"Click the All button in the QSR order screen");
//    }
//
//    public void clickTheQSROption()
//    {
//        MobileElement element = mergeAndFindMobileElement(qsrInAllScreen);
//        elementClick(element,"Click the QSR button in the All Screen");
//    }
//
//    public void clickTheOperationBtn()
//    {
//        MobileElement element = mergeAndFindMobileElement(operationBtnQSROrderScreen);
//        elementClick(element,"Click the Operation button in the QSR Order Screen");
//    }
//
//    public void clickThePOSSettingsOption()
//    {
//        MobileElement element = mergeAndFindMobileElement(posSettingsInMenuList);
//        elementClick(element,"Click the POS Settings option from the List of options when user click the menu option in settings screen");
//    }
//
////    public void scrollDown()
////    {
////        Dimension dimension = DriverManager.getDriver().manage().window().getSize();
////
////        double starthieght = dimension.getHeight() * 0.5;
////        int scrollstart = (int) starthieght;
////
////        double endhieght = dimension.getHeight() * 0.5;
////        int scrollend = (int) endhieght;
////
////        new TouchAction((PerformsTouchActions)DriverManager.getDriver()).press(PointOption.point(0,scrollstart))
////                .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
////                .moveTo(PointOption.point(0,scrollend))
////                .release().perform();
////    }
////
////
////    public void enableTheToggleOfRequiredPhoneNumberForFORHEREOrder() throws Exception {
////        String ss = "//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeScrollView/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeOther[5]/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeSwitch";
////        List<MobileElement> elements = findElements(ss);
////
////        while (elements.size() == 0)
////        {
////            scrollToElementPayments();
////        }
////
////        MobileElement ele = mergeAndFindMobileElement(toggleBtnOfPhoneNumberRequiredForForHERE);
////        scrollToElement(ele,"up");
////
////        //MobileElement element = mergeAndFindMobileElement(toggleBtnOfPhoneNumberRequiredForForHERE);
////        String value=getAttribute(ele,"value");
////
////        if (value.contains("0")) {
////
////            elementClick(ele, "click the toggle to enable");
////        }
////
////   }
//
//    public void enableTheToggleOfRequiredPhoneNumberForFORHEREOrder() throws Exception {
//
//
//        //XCUIElementTypeApplication[@name="Linga POS"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeScrollView/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeOther[12]/XCUIElementTypeSwitch
//        MobileElement ele1 = (MobileElement) driver.findElementByXPath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeScrollView/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeOther[5]/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeSwitch");
//
//        //    scrollToElement(qsrPos,"up");
//        //   elementClick(qsrPos,"Qsr Selected");
//
//        try {
//            if(find(ele1,2)){
//                String value1 = getAttribute(ele1, "value");
//
//                if (value1.contains("0")) {
//                    elementClick(ele1, "click the toggle to disable");
//                }
//            }else {
//                scrollToElement(ele1,"up");
//                String value1 = getAttribute(ele1, "value");
//
//                if (value1.contains("0")) {
//                    elementClick(ele1, "click the toggle to disable");
//                }
//            }
//        }catch (Exception w){
//            scrollToElement(ele1,"up");
//            scrollToElement(ele1,"up");
//            String value1 = getAttribute(ele1, "value");
//
//            if (value1.contains("0")) {
//                elementClick(ele1, "click the toggle to disable");
//            }
//        }
//    }
//
//
//    public void disableTheToggleOfRequiredPhoneNumberForFORHEREOrder() throws Exception {
//
//
//        //XCUIElementTypeApplication[@name="Linga POS"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeScrollView/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeOther[12]/XCUIElementTypeSwitch
//        MobileElement ele1 = (MobileElement) driver.findElementByXPath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeScrollView/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeOther[5]/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeSwitch");
//
//        //    scrollToElement(qsrPos,"up");
//        //   elementClick(qsrPos,"Qsr Selected");
//
//        try {
//            if(find(ele1,2)){
//                String value1 = getAttribute(ele1, "value");
//
//                if (value1.contains("1")) {
//                    elementClick(ele1, "click the toggle to disable");
//                }
//            }else {
//                scrollToElement(ele1,"up");
//                String value1 = getAttribute(ele1, "value");
//
//                if (value1.contains("1")) {
//                    elementClick(ele1, "click the toggle to disable");
//                }
//            }
//        }catch (Exception w){
//            scrollToElement(ele1,"up");
//            scrollToElement(ele1,"up");
//            String value1 = getAttribute(ele1, "value");
//
//            if (value1.contains("1")) {
//                elementClick(ele1, "click the toggle to disable");
//            }
//        }
//    }
//
//    public void clickThemenuOptionInSettingsScreen()
//    {
//        MobileElement element = mergeAndFindMobileElement(menuOptionInSettingsScreen);
//        elementClick(element,"Click the Menu Option button");
//    }
//
//    public void clickThePhoneDeliveryFromDropDown()
//    {
//        MobileElement element = mergeAndFindMobileElement(phoneDeliveryOrderTypeDropDown);
//        elementClick(element,"Click the Phone Delivery Option from Drop Down");
//    }
//
//    public void clickTheDeliveryFromDropDown()
//    {
//        MobileElement element = mergeAndFindMobileElement(deliveryOrderTypeFromDropDown);
//        elementClick(element,"Click the Delivery Option from Drop Down");
//    }
//
//    public void clickTheForHereFromDropDown()
//    {
//        MobileElement element = mergeAndFindMobileElement(forHereOrderTypeFromDropDown);
//        elementClick(element,"Click the FOR HERE Option from Drop Down");
//    }
//
//    public void clickTheToGoFromDropDown()
//    {
//        MobileElement element = mergeAndFindMobileElement(toGoOrderTypeFromDropDown);
//        elementClick(element,"Click the TO GO Option from Drop Down");
//    }
//
//    public void clickThePhoneToGoFromDropDown()
//    {
//        MobileElement element = mergeAndFindMobileElement(phoneToGoOrderTypeFromDropDown);
//        elementClick(element,"Click the Phone To Go Option from Drop Down");
//    }
//
//    public void clickTheQSRFromDropDown()
//    {
//        MobileElement element = mergeAndFindMobileElement(qsrOrderTypeFromDropDown);
//        elementClick(element,"Click the QSR Option from Drop Down");
//    }
//
//    public void clickThePOSOption(String opt, String msg) throws InterruptedException {
//        Thread.sleep(500);
//        MobileElement element = mergeAndFindElement(opt, "", TestUtils.Accessibility);
//        elementClick(element,msg);
//    }
//
//    public String getCheckText() {
//        MobileElement element = mergeAndFindMobileElement(checkTextInQSRScreen);
//        return elementGetText(element,"Get the Text of Check from the QSR/Menu item screen");
//    }
//
//    public void clickTheCancelBtn(String cancel, String msg) throws InterruptedException {
//        Thread.sleep(500);
//        MobileElement element = mergeAndFindElement(cancel, "", TestUtils.Accessibility);
//        elementClick(element,msg);
//    }
//
//    public void enterTheCustomerPhoneNumberInTheSearchField(String phnNo) throws InterruptedException {
//        Thread.sleep(500);
//        sendKeys(mergeAndFindMobileElement(customerProfileSearchField),phnNo);
//    }
//
//    public void clickTheSearchBtn(){
//        elementClick(mergeAndFindMobileElement(searchBtn_CustomerProfileScreen),"Click the Search button in the Customer Profile Screen");
//    }
//
//    public String getTheCustomerName(){
//
//        //   return getAttribute(mergeAndFindMobileElement(firstName_CustomerProfileScreen),"Get the First name of the customer");
//        MobileElement firstName = (MobileElement) driver.findElement(firstName_CustomerProfileScreen);
//        return firstName.getText();
//    }
//
//    public  void clickTheFinishButton()
//    {
//        elementClick(mergeAndFindMobileElement(finishButton),"Click the finish button in the order screen");
//    }
//
//    public void clickTheQSRButton()
//    {
//        elementClick(mergeAndFindMobileElement(qsrInAllScreen),"Click the QSR option in the Check Stats screen");
//    }
//
//    public void enterTheFirstNameInTheCustomerProfileScreen() {
//        TestUtils.FName = RandomStringUtils.randomAlphabetic(8);
//        sendKeys(mergeAndFindMobileElement(firstName_CustomerProfileScreen), TestUtils.FName);
//    }
//    //String fname = TestUtils.FName;
//    public String getTheFirstNameInTheCustomerProfileScreen() {
//        return TestUtils.FName;
//    }
//
//    public void enterTheSecondNameInTheCustomerProfileScreen()
//    {
//        TestUtils.SName = RandomStringUtils.randomAlphabetic(8);
//        sendKeys(mergeAndFindMobileElement(secondName_CustomerProfileScreen),TestUtils.SName);
//
//        String sname = TestUtils.SName;
//    }
//
//    public void clickTheAddBtnOfMobileNumberInCustomerProfileScreen()
//    {
//        elementClick(mergeAndFindMobileElement(mobileAddBtn_CustomerProfileScreen),"Click the Add button of Mobile number field");
//    }
//
//    public void enterTheMobileNumberInTheCustomerProfileScreen()
//    {
//        TestUtils.MobileNum = RandomStringUtils.randomNumeric(10);
//        sendKeys(mergeAndFindMobileElement(mobileField_CustomerProfileScreen),TestUtils.MobileNum);
//        MobNum = TestUtils.MobileNum;
//    }
//
//    public String getTheMobileNumberInTheCustomerProfileScreen()
//    {
///*        MobileElement firstName = (MobileElement) driver.findElement(firstName_CustomerProfileScreen);
//        return firstName.getText();*/
//        return MobNum;
//    }
//
//    public void clickTheAddBtnOfAddressInCustomerProfileScreen()
//    {
//        elementClick(mergeAndFindMobileElement(addressaddBtn_CustomerProfileScreen),"Click the Add button of Address field");
//    }
//
//    public void clickTheEnterAddressBtnInTheCustomerProfileScreen()
//    {
//        elementClick(mergeAndFindMobileElement(EnterAddressBtnAfterClickingAddAddressBtn),"Click the Enter Address button");
//    }
//
//    public void enterTheAddressInTheCustomerProfileScreen() {
//        //Enter the Address line 1
//        TestUtils.Address1 = RandomStringUtils.randomAlphabetic(8);
//        sendKeys(mergeAndFindMobileElement(AddressLine1_AddAddressPopup),TestUtils.Address1 );
//
//        new CICloseDayScreen().commonAccessibilityId("Hide keyboard","Click the hide button in the Keyboard");
//
//        //Enter the Address line 2
//        sendKeys(mergeAndFindMobileElement(AddressLine2_AddAddressPopup),RandomStringUtils.randomAlphabetic(8));
//
//        new CICloseDayScreen().commonAccessibilityId("Hide keyboard","Click the hide button in the Keyboard");
//
//        //Enter the Zipcod
//        sendKeys(mergeAndFindMobileElement(zipCode_AddAddressPopup),"600006");
//
//        new CICloseDayScreen().commonAccessibilityId("Hide keyboard","Click the hide button in the Keyboard");
//
//        //Enter the Country Code
//        sendKeys(mergeAndFindMobileElement(country_AddAddressPopup),"India");
//
//        new CICloseDayScreen().commonAccessibilityId("Hide keyboard","Click the hide button in the Keyboard");
//
//        TestUtils.Address1 = Addr;
//
//    }
//
//    public String getTheAddressInTheCustomerProfileScreen() {
//        return Addr;
//    }
//
//    public String getTheCustomerNameInTheOrderScreen()
//    {
//        return getText(mergeAndFindMobileElement(customerNameInOrderScreen),"Get the text of Customer Name");
//    }
//
//    public void clickTheMobileFieldInTheCustomerProfileScreen()
//    {
//        elementClick(mergeAndFindMobileElement(mobileField_CustomerProfileScreen),"Click the Mobile Number field");
//    }
//
//    public String getTheAlreadySavedMobileNumberInTheCustomerProfileScreen()
//    {
//
//
///*        List<MobileElement> mob = (List<MobileElement>) driver.findElements(By.xpath("//XCUIElementTypeStaticText[@name=\"Search Phone\"]/../XCUIElementTypeTable/XCUIElementTypeCell/XCUIElementTypeStaticText"));
//        int count = mob.size();
//        String mobNum = "";
//        for(int i = 1; i <= count; i++)
//        {
//             mobNum = driver.findElement(By.xpath("//XCUIElementTypeStaticText[@name=\"Search Phone\"]/../XCUIElementTypeTable/XCUIElementTypeCell/XCUIElementTypeStaticText["+i+"]")).getText();
//
//            if(mobNum.equals(TestUtils.MobileNum))
//            {
//                break;
//            }
//        }*/
//        //return getText(mergeAndFindMobileElement(mobileField_CustomerProfileScreen),"Get the Text of Saved mobile number");
//        MobileElement firstName = (MobileElement) driver.findElement(mobileField_CustomerProfileScreen);
//        return firstName.getText();
//    }
//
//    public void clickTheAddressFieldInTheCustomerProfileScreen()
//    {
//        elementClick(mergeAndFindMobileElement(addressField_CustomerProfileScreen),"Click the Address field");
//    }
//
//    public String getTheAlreadySavedAddressInTheCustomerProfileScreen()
//    {
///*         List<MobileElement> addr = (List<MobileElement>) driver.findElements(By.xpath("//XCUIElementTypeStaticText[@name=\"Search Phone\"]/../XCUIElementTypeTable/XCUIElementTypeCell/XCUIElementTypeStaticText"));
//       int count = addr.size();
//        String addre = "";
//
//        for(int i = 1; i <= count; i++)
//        {
//            addre = driver.findElement(By.xpath("//XCUIElementTypeStaticText[@name=\"Search Phone\"]/../XCUIElementTypeTable/XCUIElementTypeCell/XCUIElementTypeStaticText["+i+"]")).getText();
//
//            if(addre.contains(TestUtils.Address1))
//            {
//                break;
//            }
//        }*/
//        // return getText(mergeAndFindMobileElement(addressField_CustomerProfileScreen),"Get the Text of Address");
//
//        MobileElement firstName = (MobileElement) driver.findElement(addressField_CustomerProfileScreen);
//        return firstName.getText();
//    }
//
//    public void clickTheCustomerPlanButtonInTheCustomerProfileScreen()
//    {
//        elementClick(mergeAndFindMobileElement(customerPlanBtn_CustomerProfileScreen),"Click the Customer Plan button in the Customer Profile Screen");
//    }
//
//    public String getTheAttributeValueOfAccountsType()
//    {
//        //return getAttribute(mergeAndFindMobileElement(AccountTypeAttributeTextInTheCustomerProfileScreen_CustomerPlan),"Get the value of Account Type");
//        MobileElement firstName = (MobileElement) driver.findElement(AccountTypeAttributeTextInTheCustomerProfileScreen_CustomerPlan);
//        return firstName.getText();
//    }
//
//    public String verifyTheHouseAccountsFields_AccountType()
//    {
//        return getText(mergeAndFindMobileElement(AccountTypeTextInTheCustomerProfileScreen_CustomerPlan),"Get the value of Account Type");
//    }
//
//    public String verifyTheHouseAccountsFields_Name()
//    {
//        return getText(mergeAndFindMobileElement(NameTextInTheCustomerProfileScreen_CustomerPlan),"Get the value of Name");
//    }
//
//    public String verifyTheHouseAccountsFields_Balance()
//    {
//        return getText(mergeAndFindMobileElement(BalanceTextInTheCustomerProfileScreen_CustomerPlan),"Get the value of Balance");
//    }
//
//    public String verifyTheHouseAccountsFields_CardNumber()
//    {
//        return getText(mergeAndFindMobileElement(CardNumberTextInTheCustomerProfileScreen_CustomerPlan),"Get the value of Card Number");
//    }
//
//    public String verifyTheHouseAccountsFields_Recharge()
//    {
//        return getText(mergeAndFindMobileElement(RechargeTextInTheCustomerProfileScreen_CustomerPlan),"Get the value of Recharge");
//    }
//
//    public String verifyTheHouseAccountsFields_Limit()
//    {
//        return getText(mergeAndFindMobileElement(LimitTextInTheCustomerProfileScreen_CustomerPlan),"Get the value of Limit");
//    }
//
//    public String verifyTheHouseAccountsFields_MaxLimit()
//    {
//        return  getText(mergeAndFindMobileElement(MaxLimitTextInTheCustomerProfileScreen_CustomerPlan),"Get the value of Max Limit");
//    }
//
//    public String verifyTheHouseAccountsFields_LimitPeriod()
//    {
//        return getText(mergeAndFindMobileElement(LimitPeriodTextInTheCustomerProfileScreen_CustomerPlan),"Get the value of Limit Period");
//    }
//
//    public String verifyTheHouseAccountsFields_AllowCredit()
//    {
//        return getText(mergeAndFindMobileElement(AllowCreditTextInTheCustomerProfileScreen_CustomerPlan),"Get the value of Allow Credit");
//    }
//
//    public void clickTheSearchedCustomer(String phnNo)
//    {
//        elementClick((MobileElement) driver.findElement(By.xpath("//XCUIElementTypeStaticText[contains(@name,\""+phnNo+"\")]")),"Click the searched customer");
//    }
//
//    public void clickDownArrowOfAccountTypesInTheCustomerProfileScreen()
//    {
//        elementClick(mergeAndFindMobileElement(downArrowOfAccountTypesField),"Click the Down Arrow of Account Types field");
//    }
//
//    public void clickTheMembershipOptionInAccountTypes()
//    {
//        elementClick(mergeAndFindMobileElement(MembershipTextInTheAccountTypesField),"Click the Membership option");
//    }
//
//    public String verifyTheMembershipFields_CardNumberOrResidentCode()
//    {
//        return getText(mergeAndFindMobileElement(CardNumberOrResidentCodeTextInTheCustomerProfileScreen_CustomerPlan),"Get the value of Card Number or Resident Code");
//    }
//
//    public String verifyTheMembershipFields_MembershipName()
//    {
//        return getText(mergeAndFindMobileElement(MembershipNameTextInTheCustomerProfileScreen_CustomerPlan),"Get the value of Membership Name");
//    }
//
//    public String verifyTheMembershipFields_MembershipType()
//    {
//        return getText(mergeAndFindMobileElement(MembershipTypeTextInTheCustomerProfileScreen_CustomerPlan),"Get the value of Membership Type");
//    }
//
//    public String verifyTheMembershipFields_IssueDate()
//    {
//        return getText(mergeAndFindMobileElement(IssueDateTextInTheCustomerProfileScreen_CustomerPlan),"Get the value of Issue Date");
//    }
//
//    public String verifyTheMembershipFields_ExpiryDate()
//    {
//        return getText(mergeAndFindMobileElement(ExpiryDateTextInTheCustomerProfileScreen_CustomerPlan),"Get the value of Expiry Date");
//    }
//
//    public void clickTheRechargeField()
//    {
//        elementClick(mergeAndFindMobileElement(rechargeFiled_AccountsType),"Click the recharge field");
//    }
//
//    public void enterTheRequiredRechargeAmount()
//    {
//        elementClick(mergeAndFindMobileElement(NumberTwoInTheNumpad),"Click the number 2");
//        elementClick(mergeAndFindMobileElement(NumberZeroZeroInTheNumpad),"Click the number 00");
//    }
//
//    public void clickTheUpdateButton()
//    {
//        elementClick(mergeAndFindMobileElement(updateButton),"Click the Update button");
//    }
//
//    public void clickTheCashTab()
//    {
//        elementClick(mergeAndFindMobileElement(cashTab),"Click the Cash option");
//    }
//
//    public void clickTheExactButtonOption()
//    {
//        elementClick(mergeAndFindMobileElement(exactButton),"Click the Exact button");
//    }
//
//    public void clickTheEnterButtonOption()
//    {
//        elementClick(mergeAndFindMobileElement(enterButton),"Click the Enter button");
//    }
//
//    public void pressArrowDown2 (){
//        elementClick(arrowDownForOtherMenuItems, "the rest of the categories is listed");
//    }
//
//    public void selectFoodCategory(){
//        pressArrowDown2();
//        elementClick(saladCategoryBtn, "Salad Category selected");
//    }
//
//    public void selectTheMenuRandomly()
//    {
//        MobileElement order = (MobileElement) driver.findElementByXPath("//XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeButton[1]/XCUIElementTypeStaticText[1]");
//        check = order.getText();
//        TestUtils.tableNumberof = check;
//        utils.log().info(check);
//
//        selectFoodCategory();
//
//        List<MobileElement> menuCollection = (List<MobileElement>) driver.findElementsByXPath("//XCUIElementTypeOther[2]/XCUIElementTypeCollectionView/XCUIElementTypeCell");
//        int count1 = menuCollection.size();
//        Random rand1 = new Random();
//
//        for (int j = 1; j <= 2; j++){
//            itemToSelect1 = rand1.nextInt(count1);
//
//            if (itemToSelect1 == 0) {
//                itemToSelect1 = 1;
//            }
//            utils.log().info(itemToSelect1);
//            MobileElement menu = (MobileElement) driver.findElementByXPath("//XCUIElementTypeOther[2]/XCUIElementTypeCollectionView/XCUIElementTypeCell[" + itemToSelect1 + "]/XCUIElementTypeStaticText[1]");
//            // utils.log().info(menu.getText());
//            elementClick(menu, "Tapped Menu - " +menu.getText());
//            try {
//                MobileElement mainModi = (MobileElement) driver.findElementByXPath("//XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeCollectionView/XCUIElementTypeCell[1]/XCUIElementTypeStaticText[1]");
//                if ((mainModi.isDisplayed())) {
//                    String mainModifier = mainModi.getText();
//                    elementClick(mainModi, mainModifier + " - Tapped Main Modifier");
//
//                    try {
//                        MobileElement remainingModi = mergeAndFindElement(" Remaining Modifiers  :", "", TestUtils.Accessibility);
//                        MobileElement subModi1 = (MobileElement) driver.findElementByXPath("//XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeCollectionView/XCUIElementTypeCell[1]/XCUIElementTypeStaticText[1]");
//                        MobileElement subModi2 = (MobileElement) driver.findElementByXPath("//XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeCollectionView/XCUIElementTypeCell[2]/XCUIElementTypeStaticText[1]");
//                        MobileElement subModi3 = (MobileElement) driver.findElementByXPath("//XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeCollectionView/XCUIElementTypeCell[1]/XCUIElementTypeStaticText[1]");
//                        if (remainingModi.isDisplayed()) {
//                            String SubModifier1 = subModi1.getText();
//                            elementClick(subModi1, SubModifier1 + " - SubModifier");
//                            String SubModifier2 = subModi2.getText();
//                            elementClick(subModi2, SubModifier2 + " - SubModifier");
//                            String SubModifier3 = subModi3.getText();
//                            elementClick(subModi3, SubModifier3 + " - SubModifier");
//                            elementClick(doneButton, "Tapped Done");
//
//                        }
//                    } catch (Exception h) {
//                        elementClick(doneButton, "Tapped Done");
//                    }
//                }
//
//            } catch (Exception x) {
//                try {
//                    MobileElement size1 = (MobileElement) driver.findElementByXPath("//XCUIElementTypeOther[2]/XCUIElementTypeCollectionView/XCUIElementTypeCell[1]//XCUIElementTypeStaticText[1]");
//                    MobileElement size2 = (MobileElement) driver.findElementByXPath("//XCUIElementTypeOther[2]/XCUIElementTypeCollectionView/XCUIElementTypeCell[1]");
//                    MobileElement minimum = (MobileElement) driver.findElementByXPath("//XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeTable/XCUIElementTypeCell[3]/XCUIElementTypeStaticText[1]");
//                    String mini = minimum.getText();
//                    if (find(size2, 1)) {
//                        String data = size1.getText();
//                        elementClick(size1, data + " - selected");
//                        MobileElement mainModi1 = (MobileElement) driver.findElementByXPath("//XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeCollectionView/XCUIElementTypeCell[1]//XCUIElementTypeStaticText[1]");
//                        String mainModi = mainModi1.getText();
//                        elementClick(mainModi1, mainModi + " - Tapped Main Modifier -2 ");
//                        elementClick(doneButton, "Tapped Done");
//                    } else if (find(minimum, 1)) {
//                        utils.log().info(mini + " - Additional Modifiers ");
//                        //             if (find(minimum, 2)) {
//                        MobileElement addMeats = (MobileElement) driver.findElementByXPath("//XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeTable/XCUIElementTypeCell[3]/XCUIElementTypeStaticText[2]");
//                        String modiname = addMeats.getText();
//                        elementClick(addMeats, "Modifier selected - " + modiname);
//                        elementClick(doneButton, "Tapped Done");
//                    }
//                } catch (Exception z) {
//
//                }
//            }
//        }
//    }
//
//    public String getTheTextOfPreviousOrderInTheCustomerProfileScreen()
//    {
//        return getText(mergeAndFindMobileElement(verifyThePreviousOrder),"Get the Text of Previous order in Customer Profile Screen");
//    }
//
//    public void clickThePreviouslyCompletedOrderFromPreviousOrderTable()
//    {
//        List<MobileElement> pre = (List<MobileElement>) driver.findElementsByXPath("//XCUIElementTypeTable/XCUIElementTypeCell");
//        int count = pre.size();
//        for(int i = 1; i <= count; i++)
//        {
//            String s = getText((MobileElement) driver.findElement(By.xpath("//XCUIElementTypeStaticText[@name=\"PREVIOUS ORDERS\"]/../XCUIElementTypeTable/XCUIElementTypeCell["+i+"]/XCUIElementTypeStaticText[1]")),"Get the text of Order Details");
//            if(s.contains("Membership-") || s.contains("HA-"))
//            {
//                utils.log().info("Membership recharge is done");
//            }
//            else
//            {
//                elementClick((MobileElement) driver.findElement(By.xpath("//XCUIElementTypeStaticText[@name=\"PREVIOUS ORDERS\"]/../XCUIElementTypeTable/XCUIElementTypeCell["+i+"]/XCUIElementTypeStaticText[1]")),"Click the Previous Order");
//                break;
//            }
//        }
//
//        //elementClick(mergeAndFindMobileElement(firstRowOfPreviousOrdersInCustomerProfileScreen), "Click the first row in the Previous order table");
//    }
//
//    public void clickTheRepeatOrderBtn()
//    {
//        elementClick(mergeAndFindMobileElement(repeatOrderBtn_CustomerProfileScreen),"Click the Repeat Order button");
//    }
//
//    public String getTheTextOfSeatsInOrderScreen()
//    {
//        return getText(mergeAndFindMobileElement(seatsTextInOrderScreen),"Get the text of Seats in Order Screen");
//    }
//
//    public void clickTheDisplayOrderBtn()
//    {
//        elementClick(mergeAndFindMobileElement(displayOrderBtn_CustomerProfileScreen),"Click the Display Order button");
//    }
//
//    public String getTheTextOfOrderSummaryText()
//    {
//        return getText(mergeAndFindMobileElement(orderSummaryTxt),"Get the text of order summary text");
//    }
//
//    public void clickTheBackButton()
//    {
//        elementClick(mergeAndFindMobileElement(backButton),"Click the Back button");
//    }
//
//    public void clickTheLoyaltyBtn()
//    {
//        elementClick(mergeAndFindMobileElement(loyaltyBtn_CustomerProfileScreen),"Click the Loyalty button");
//    }
//
//    public String getTheTextOfLoyaltyBalanceText()
//    {
//        return getText(mergeAndFindMobileElement(loyaltyBalanceTxt),"Get the text of Loyalty Balance");
//    }
//
//    public String getTheTextOfDate_LoyaltyBalance()
//    {
//        return getText(mergeAndFindMobileElement(date_loyaltyBalanceTxt),"Get the text of Date in Loyalty Balance window");
//    }
//
//    public String getTheTextOfCheckNumber_LoyaltyBalance()
//    {
//        return getText(mergeAndFindMobileElement(checkNumber_loyaltyBalanceTxt),"Get the text of Check Number in Loyalty Balance window");
//    }
//
//    public String getTheTextOfType_LoyaltyBalance()
//    {
//        return getText(mergeAndFindMobileElement(type_loyaltyBalanceTxt),"Get the text of Type in Loyalty Balance window");
//    }
//
//    public String getTheTextOfAmount_LoyaltyBalance()
//    {
//        return getText(mergeAndFindMobileElement(amount_loyaltyBalanceTxt),"Get the text of Amount in Loyalty Balance window");
//    }
//
//    public void clickTheCloseBtn_LoyaltyBalance()
//    {
//        elementClick(mergeAndFindMobileElement(closeBtn_loyaltyBalanceTxt),"Click the close button of Loyalty Balance window");
//    }
//
//    public void enableTheTaxExemptBtn()
//    {
//        MobileElement ele1 = (MobileElement) driver.findElement(taxExemptToggle_CustomerProfileScreen);
//
//        String value1 = getAttribute(ele1, "value");
//
//        if (value1.contains("0")) {
//            elementClick(ele1, "click the toggle");
//        }
////        String s = getAttribute(mergeAndFindMobileElement(taxExemptToggle_CustomerProfileScreen),"Get the attribute value of Tax Exempt");
////        if(s.equals("0"))
////        {
////            elementClick(mergeAndFindMobileElement(taxName),"Click the Tax Exempt toggle");
////        }
//    }
//
//    public void verifyTheTextOfTax()
//    {
//        try {
//            if(mergeAndFindMobileElement(taxName).isDisplayed())
//            {}
//        }catch(Exception e)
//        {
//            utils.log().info("Tax is not available in the Order Screen");
//        }
//    }
//
//    public void clickTheCheckStatsTab()
//    {
//        elementClick(mergeAndFindMobileElement(checkStatsTab),"Click the Check Stats tab");
//    }
//
//    public void clickTheClosedTab()
//    {
//        elementClick(mergeAndFindMobileElement(closedTab),"Click the Closed Tab");
//    }
//
//    public void clickTheRecentlyClosedTab() throws Exception {
//        List<MobileElement> check = (List<MobileElement>) driver.findElementsByXPath("//XCUIElementTypeTable/XCUIElementTypeCell");
//        int count1 = check.size();
//
//        MobileElement ele1 = (MobileElement) driver.findElementByXPath("//XCUIElementTypeTable/XCUIElementTypeCell["+count1+"]");
//
//        int sw = count1;
//        sw = sw / 10;
//        for(int i = 0; i <= sw; i++)
//        {
//            scrollToElementPayments("up");
//        }
//        Thread.sleep(6000);
//
//        elementClick(ele1,"Click the Recently Closed Check");
//    }
//
//    public void clickTheReopenCheckBtn()
//    {
//        elementClick(mergeAndFindMobileElement(reopenCheckBtn),"Click the Reopen Check button");
//    }
//
//    public void clickTheCustomerName()
//    {
//        elementClick(mergeAndFindMobileElement(customerNameInTheOrderScreen),"Click the Customer Name");
//    }
//
//    public void enterTheEmailIdInCustomerProfileScreen()
//    {
//        clear(mergeAndFindMobileElement(emailField_CustomerProfileScreen));
//        TestUtils.emailId = RandomStringUtils.randomAlphabetic(8);
//        sendKeys(mergeAndFindMobileElement(emailField_CustomerProfileScreen),TestUtils.emailId+"@mail.com");
//    }
//
//    public void enterTheVehicleNoOrLicensePlateTxt_CustomerProfileScreen()
//    {
//        clear(mergeAndFindMobileElement(vehicleNumOrLicensePlate_CustomerProfileScreen));
//        String s = RandomStringUtils.randomNumeric(12);
//        sendKeys(mergeAndFindMobileElement(vehicleNumOrLicensePlate_CustomerProfileScreen),s);
//    }
//
//    public void enterMakeTxt_CustomerProfileScreen()
//    {
//        clear(mergeAndFindMobileElement(makeField_CustomerProfileScreen));
//        sendKeys(mergeAndFindMobileElement(makeField_CustomerProfileScreen),"Test");
//    }
//
//    public void enterTheModelTxt_CustomerProfileScreen()
//    {
//        clear(mergeAndFindMobileElement(modelField_CustomerProfileScreen));
//        sendKeys(mergeAndFindMobileElement(modelField_CustomerProfileScreen),"BMW");
//    }
//
//    public void enterTheColorTxt_CustomerProfileScreen()
//    {
//        clear(mergeAndFindMobileElement(colorField_CustomerProfileScreen));
//        sendKeys(mergeAndFindMobileElement(colorField_CustomerProfileScreen),"Gray");
//    }
// /*   public String getTheCurbSideNotesTxt()
//    {
//        return getText(mergeAndFindMobileElement(curbSideNotesTxt_CustomerProfileScreen),"Get the text of Curb Side Notes");
//    }
//
//    public String getTheVehicleNoOrLicensePlateTxt()
//    {
//        return getText(mergeAndFindMobileElement(vehicleNoLicensePlateTxt_CustomerProfileScreen),"Get the text of Vehicle No / License Plate");
//    }
//
//    public String getTheMakeTxt()
//    {
//        return getText(mergeAndFindMobileElement(MakeTxt_CustomerProfileScreen),"Get the text of Make");
//    }
//
//    public String getTheModelTxt()
//    {
//        return getText(mergeAndFindMobileElement(ModelTxt_CustomerProfileScreen),"Get the text of Model");
//    }
//
//    public String getTheColorTxt()
//    {
//        return getText(mergeAndFindMobileElement(colorTxt_CustomerProfileScreen),"Get the text of Color");
//    }*/
//}
