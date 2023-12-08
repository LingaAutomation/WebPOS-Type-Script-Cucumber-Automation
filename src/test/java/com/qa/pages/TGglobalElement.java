package com.qa.pages;

import org.openqa.selenium.By;

public class TGglobalElement {

    public By secondBarTabCheck = By.xpath("(//XCUIElementTypeStaticText[@name=\"Test Automation\"])[1]");
    //Discount
    public By discountPercentage = By.xpath("//XCUIElementTypeStaticText[@name=\"10%\"]");
    public By checkBasedDiscountBeforeTaxWithOpenItem = By.id("CB-BeforeTax-FreeItem");
    //    public By checkBasedDiscountBeforeTaxWithOpenItem = By.xpath("//XCUIElementTypeStaticText[@name=\"CB-BeforeTax-FreeItem\"]");
    public By itemBasedDiscountAfterTaxAsAmount = By.id("IB-AfterTax-Amount");
    //    public By itemBasedDiscountAfterTaxAsAmount = By.xpath("//XCUIElementTypeStaticText[@name=\"IB-AfterTax-Amount\"]");
    public By itemDiscountTab = By.id("Item Discount");
    //    public By itemDiscountTab = By.xpath("//XCUIElementTypeStaticText[@name=\"Item Discount\"]");
    public By itemDiscount = By.id("All days - Item Discount");
    //    public By itemDiscount = By.xpath("//XCUIElementTypeStaticText[@name=\"All days - Item Discount\"]"); //it should be accessibility-id
    public By itemDiscountAmount = By.xpath("//XCUIElementTypeStaticText[@name=\"5,00\"]"); //it should be accessibility-id
    public By discountOption = By.id("Discount");
    public By checkDiscountOption = By.id("Check Discount");
    //    public By checkDiscountOption = By.xpath("//XCUIElementTypeStaticText[@name=\"Check Discount\"]");
    public By itemBasedDiscountOption = By.id("Item-Based Discount");
//    public By itemBasedDiscountOption = By.xpath("//XCUIElementTypeStaticText[@name=\"Item-Based Discount\"]");

    public By backButton = By.id("Back");
//    public By backButton = By.xpath("//XCUIElementTypeStaticText[@name=\"Back\"]");

    public By itemBasedDiscount = By.xpath("//XCUIElementTypeStaticText[@name=\"5,00\"]");
    public By itemBasedDiscountAmountOnBill = By.xpath("//XCUIElementTypeStaticText[@name=\"TL 5,00\"]");
    public By totalDiscount = By.xpath("(//XCUIElementTypeStaticText[@name=\"5,00\"])[1]");

    public By checkBasedDiscount = By.id("Check-Based Discount");
//    public By checkBasedDiscount = By.xpath("//XCUIElementTypeStaticText[@name=\"Check-Based Discount\"]");

    public By discountWithAmount = By.id("ItemBased with Amount");
//    public By discountWithAmount = By.xpath("//XCUIElementTypeStaticText[@name=\"ItemBased with Amount\"]");

    public By discountWithAmountPrice = By.xpath("(//XCUIElementTypeStaticText[@name=\"1.000,00\"])[2]");


    public By discountWithPercentage = By.id("ItemBased with Percentage");

    public By discountBackButton = By.id("Back");
//    public By discountBackButton = By.xpath("//XCUIElementTypeStaticText[@name=\"Back\"]");

    public By freeItemOption = By.id("Free Item");

    public By checkBasedAmount = By.id("Check Based Amount");
//    public By checkBasedAmount = By.xpath("//XCUIElementTypeStaticText[@name=\"Check Based Amount\"]");

    public By checkBasedPercentage = By.id("Check-Based Percentage");
//    public By checkBasedPercentage = By.xpath("//XCUIElementTypeStaticText[@name=\"Check-Based Percentage\"]");

    public By checkBasedFreeOption = By.id("Check Based Free");
//    public By checkBasedFreeOption = By.xpath("//XCUIElementTypeStaticText[@name=\"Check Based Free\"]");


    public By checkBasedFreeOptionAfterApplied = By.id("Check Based Free");

    public By checkBasedSetPriceOption = By.id("Check Based Set Price");
//    public By checkBasedSetPriceOption = By.xpath("//XCUIElementTypeStaticText[@name=\"Check Based Set Price\"]");

    public By itemBasedWithAmount = By.id("ItemBased with Amount");
//    public By itemBasedWithAmount = By.xpath("//XCUIElementTypeStaticText[@name=\"ItemBased with Amount\"]");

    public By itemBasedWithPercentage = By.id("ItemBased with Percentage");
//    public By itemBasedWithPercentage = By.xpath("//XCUIElementTypeStaticText[@name=\"ItemBased with Percentage\"]");

    public By itemBasedWithFree = By.id("Item-Based with Free");
//    public By itemBasedWithFree = By.xpath("//XCUIElementTypeStaticText[@name=\"Item-Based with Free\"]");

    public By emptyDiscountOption = By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeCollectionView");

    public By itemBasedDiscountAfterTax = By.id("IB-DiscountAfterTax");
//    public By itemBasedDiscountAfterTax = By.xpath("//XCUIElementTypeStaticText[@name=\"IB-DiscountAfterTax\"]");

    public By itemBasedDiscountAfterTaxDayRestrict = By.id("After Tax Day Restriction");
//    public By itemBasedDiscountAfterTaxDayRestrict = By.xpath("//XCUIElementTypeStaticText[@name=\"After Tax Day Restriction\"]");

    public By itemBasedDiscountBeforeTaxRoleRestrict = By.id("BeforeTaxRoleRestriction");
//    public By itemBasedDiscountBeforeTaxRoleRestrict = By.xpath("//XCUIElementTypeStaticText[@name=\"BeforeTaxRoleRestriction\"]");

    public By itemBasedDiscountAfterTaxRoleRestrict = By.id("AfterTax-RoleRestriction");
//    public By itemBasedDiscountAfterTaxRoleRestrict = By.xpath("//XCUIElementTypeStaticText[@name=\"AfterTax-RoleRestriction\"]");

    public By checkBasedDiscountAfterTax = By.id("CB-PercentageAfterTax");
//    public By checkBasedDiscountAfterTax = By.xpath("//XCUIElementTypeStaticText[@name=\"CB-PercentageAfterTax\"]");

    public By itemBasedDiscountBeforeTaxRestrictDay = By.id("BeforeTaxDayRestriction");
//    public By itemBasedDiscountBeforeTaxRestrictDay = By.xpath("//XCUIElementTypeStaticText[@name=\"BeforeTaxDayRestriction\"]");

    public By afterTaxDayRestrictDiscountTitle = By.id("Discount");
//    public By afterTaxDayRestrictDiscountTitle = By.xpath("//XCUIElementTypeStaticText[@name=\"Discount\"]");

    public By afterTaxDayRestrictDiscountAmount = By.xpath("//XCUIElementTypeStaticText[@name=\"TL 0,50\"]");

    public By beforeTaxDayRestrictDiscountTitle = By.id("Discount");
//    public By beforeTaxDayRestrictDiscountTitle = By.xpath("//XCUIElementTypeStaticText[@name=\"Discount\"]");


    public By beforeTaxDayRestrictDiscountAmount = By.xpath("//XCUIElementTypeStaticText[@name=\"TL 0,50\"]");

    public By AfterTaxDayRestrictWarningText = By.id("Paid amount exceeds the sale amount");
//    public By AfterTaxDayRestrictWarningText = By.xpath("//XCUIElementTypeTextView[@name=\"Paid amount exceeds the sale amount\"]");

    public By doneButton = By.id("Done");
//    public By doneButton = By.xpath("//XCUIElementTypeStaticText[@name=\"Done\"]");

    public By checkBasedBeforeTax = By.id("CheckBased-BeforeTax");
//    public By checkBasedBeforeTax = By.xpath("//XCUIElementTypeStaticText[@name=\"CheckBased-BeforeTax\"]");

    public By checkBasedBeforeTaxText = By.id("CheckBased-BeforeTax");
//    public By checkBasedBeforeTaxText = By.xpath("//XCUIElementTypeStaticText[@name=\"CheckBased-BeforeTax\"]");

    public By checkBasedDiscountBeforeTaxDayRestrict = By.id("CB-AfterTax-RestrictDay");
//    public By checkBasedDiscountBeforeTaxDayRestrict = By.xpath("//XCUIElementTypeStaticText[@name=\"CB-AfterTax-RestrictDay\"]");

    public By checkBasedDiscountBeforeTaxDayRestrictText = By.id("CB-AfterTax-RestrictDay");
//    public By checkBasedDiscountBeforeTaxDayRestrictText = By.xpath("//XCUIElementTypeStaticText[@name=\"CB-AfterTax-RestrictDay\"]");

    public By checkBasedDiscountBeforeTaxRoleRestrict = By.id("CB-AfterTax-RestrictRole");
//    public By checkBasedDiscountBeforeTaxRoleRestrict = By.xpath("//XCUIElementTypeStaticText[@name=\"CB-AfterTax-RestrictRole\"]");

    public By checkBasedDiscountBeforeTaxRoleRestrictText = By.id("CB-AfterTax-RestrictRole");
//    public By checkBasedDiscountBeforeTaxRoleRestrictText = By.xpath("//XCUIElementTypeStaticText[@name=\"CB-AfterTax-RestrictRole\"]");

    public By checkBasedDiscountAfterTaxOpenItem = By.id("CB-AfterTax-OpenItem");
//    public By checkBasedDiscountAfterTaxOpenItem = By.xpath("//XCUIElementTypeStaticText[@name=\"CB-AfterTax-OpenItem\"]");


    public By numberOne = By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeButton[@name=\"1\"]");

    public By numberOne1 = By.id("1");
//    public By numberOne1 = By.xpath("//XCUIElementTypeStaticText[@name=\"1\"]");

    public By numberFive = By.id("5");
//    public By numberFive = By.xpath("//XCUIElementTypeStaticText[@name=\"5\"]");

    public By numberDoubleZero = By.id("00");
//    public By numberDoubleZero = By.xpath("//XCUIElementTypeStaticText[@name=\"00\"]");

    public By continueButton = By.id("Continue");
//    public By continueButton = By.xpath("//XCUIElementTypeStaticText[@name=\"Continue\"]");

    public By itemBasedFreeDiscountOptionWhichHasBeforeTax = By.id("IB-FreeDiscountBeforeTax");
//    public By itemBasedFreeDiscountOptionWhichHasBeforeTax = By.xpath("//XCUIElementTypeStaticText[@name=\"IB-FreeDiscountBeforeTax\"]");

    public By checkBasedPercentageDiscountOptionWhichHasAfterTax = By.id("CB-PercentageAfterTax");
//    public By checkBasedPercentageDiscountOptionWhichHasAfterTax = By.xpath("//XCUIElementTypeStaticText[@name=\"CB-PercentageAfterTax\"]");

    public By checkBasedAmountDiscountOptionWhichHasAfterTax = By.id("CheckBasedAmountAfterTax");
//    public By checkBasedAmountDiscountOptionWhichHasAfterTax = By.xpath("//XCUIElementTypeStaticText[@name=\"CheckBasedAmountAfterTax\"]");

    public By checkBasedPercentageBeforeTax = By.id("CB-PercentageBeforeTax");
//    public By checkBasedPercentageBeforeTax = By.xpath("//XCUIElementTypeStaticText[@name=\"CB-PercentageBeforeTax\"]");

    public By checkBasedAmountBeforeTax = By.id("CB-Amount-BeforeTax");
//    public By checkBasedAmountBeforeTax = By.xpath("//XCUIElementTypeStaticText[@name=\"CB-Amount-BeforeTax\"]");

    public By checkBasedSetPriceBeforeTax = By.id("CB-SetPriceBeforeTax");
//    public By checkBasedSetPriceBeforeTax = By.xpath("//XCUIElementTypeStaticText[@name=\"CB-SetPriceBeforeTax\"]");


    public By checkBasedFreeBeforeTax = By.id("CB-Free-BeforeTax");
//    public By checkBasedFreeBeforeTax = By.xpath("//XCUIElementTypeStaticText[@name=\"CB-Free-BeforeTax\"]");

    public By checkBasedFreeAfterTax = By.id("Check Based Free");
//    public By checkBasedFreeAfterTax = By.xpath("//XCUIElementTypeStaticText[@name=\"Check Based Free\"]");

    public By openDiscountAmountTexBox = By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeTextField");

    public By openDiscountAfterTaxOption = By.id("After");
//    public By openDiscountAfterTaxOption = By.xpath("//XCUIElementTypeStaticText[@name=\"After\"]");

    public By openCheckDiscountAmountOnOrderSide = By.id("100,05");
//    public By openCheckDiscountAmountOnOrderSide = By.xpath("//XCUIElementTypeStaticText[@name=\"100,05\"]");

    public By openCheckDiscountAmountOnPriceSide = By.id("TL 100,05");
//    public By openCheckDiscountAmountOnPriceSide = By.xpath("//XCUIElementTypeStaticText[@name=\"TL 100,05\"]");

    public By openDiscountPercentageTexBox = By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeTextField");

    public By openDiscountBeforeTaxOption = By.id("Before");
//    public By openDiscountBeforeTaxOption = By.xpath("//XCUIElementTypeStaticText[@name=\"Before\"]");

    public By openDiscountAmountTextBox = By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeTextField");

    public By openCheckDiscountPercentageOnOrderSide = By.id("50,00");
//    public By openCheckDiscountPercentageOnOrderSide = By.xpath("//XCUIElementTypeStaticText[@name=\"50,00\"]");

    public By openCheckDiscountPercentageOnOrderSideForMargarita = By.id("100,00");
//    public By openCheckDiscountPercentageOnOrderSideForMargarita = By.xpath("//XCUIElementTypeStaticText[@name=\"100,00\"]");

    public By openCheckDiscountPercentageOnPriceSideForMargarita = By.id("TL 1.110,00");
//    public By openCheckDiscountPercentageOnPriceSideForMargarita = By.xpath("//XCUIElementTypeStaticText[@name=\"TL 1.110,00\"]");

    public By openCheckDiscountPercentageOnPriceSide = By.id("TL 549,51");
//    public By openCheckDiscountPercentageOnPriceSide = By.xpath("//XCUIElementTypeStaticText[@name=\"TL 549,51\"]");

    public By openCheckDiscountAmountAfterTaxOnOrderSide = By.id("115,00");
//    public By openCheckDiscountAmountAfterTaxOnOrderSide = By.xpath("//XCUIElementTypeStaticText[@name=\"115,00\"]");

    public By openCheckDiscountAmountAfterTaxOnOrderSideForMargarita = By.id("TL 1.199,95");
//    public By openCheckDiscountAmountAfterTaxOnOrderSideForMargarita = By.xpath("//XCUIElementTypeStaticText[@name=\"TL 1.199,95\"]");

    public By openCheckDiscountAmountAfterTaxOnPriceSideForMargarita = By.id("TL 1,109,95");
//    public By openCheckDiscountAmountAfterTaxOnPriceSideForMargarita = By.xpath("//XCUIElementTypeStaticText[@name=\"TL 1,109,95\"]");

    public By openCheckDiscountAmountAfterTaxOnPriceSide = By.id("TL 15,00");
//    public By openCheckDiscountAmountAfterTaxOnPriceSide = By.xpath("//XCUIElementTypeStaticText[@name=\"TL 15,00\"]");

    public By itemBasedDiscountBeforeTaxAsAmount = By.id("IB-BeforeTax-Amount");
//    public By itemBasedDiscountBeforeTaxAsAmount = By.xpath("//XCUIElementTypeStaticText[@name=\"IB-BeforeTax-Amount\"]");

    public By itemBasedDiscountAfterTaxAsSetPrice = By.id("IB-AfterTax-SetPrice");
//    public By itemBasedDiscountAfterTaxAsSetPrice = By.xpath("//XCUIElementTypeStaticText[@name=\"IB-AfterTax-SetPrice\"]");

    public By itemBasedDiscountBeforeTaxAsSetPrice = By.id("IB-BeforeTax-SetPrice");
//    public By itemBasedDiscountBeforeTaxAsSetPrice = By.xpath("//XCUIElementTypeStaticText[@name=\"IB-BeforeTax-SetPrice\"]");

    public By itemBasedDiscountAfterTaxAsFreeItem = By.id("IB-AfterTax-FreeItem");
//    public By itemBasedDiscountAfterTaxAsFreeItem = By.xpath("//XCUIElementTypeStaticText[@name=\"IB-AfterTax-FreeItem\"]");

    public By itemBasedDiscountBeforeTaxAsFreeItem = By.id("IB-BeforeTax-FreeItem");
//    public By itemBasedDiscountBeforeTaxAsFreeItem = By.xpath("//XCUIElementTypeStaticText[@name=\"IB-BeforeTax-FreeItem\"]");

    public By itemBasedDiscountBeforeTaxAsPercentage = By.id("IB-BeforeTax-Percentage");
//    public By itemBasedDiscountBeforeTaxAsPercentage = By.xpath("//XCUIElementTypeStaticText[@name=\"IB-BeforeTax-Percentage\"]");

    public By itemBasedDiscountAfterTaxAsPercentage = By.id("IB-AfterTax-Percentage");
//    public By itemBasedDiscountAfterTaxAsPercentage = By.xpath("//XCUIElementTypeStaticText[@name=\"IB-AfterTax-Percentage\"]");

    public By checkBasedDiscountAfterTaxAsPercentage = By.id("CB-PercentageAfterTax");
//    public By checkBasedDiscountAfterTaxAsPercentage = By.xpath("//XCUIElementTypeStaticText[@name=\"CB-PercentageAfterTax\"]");

    public By checkBasedDiscountBeforeTaxAsPercentage = By.id("CB-PercentageBeforeTax");
//    public By checkBasedDiscountBeforeTaxAsPercentage = By.xpath("//XCUIElementTypeStaticText[@name=\"CB-PercentageBeforeTax\"]");

    public By checkBasedDiscountBeforeTaxAsAmount = By.id("CB-AmountBeforeTax");
//    public By checkBasedDiscountBeforeTaxAsAmount = By.xpath("//XCUIElementTypeStaticText[@name=\"CB-AmountBeforeTax\"]");

    public By checkBasedDiscountBeforeTaxAsSetPrice = By.id("CB-BeforeTax-SetPrice");
//    public By checkBasedDiscountBeforeTaxAsSetPrice = By.xpath("//XCUIElementTypeStaticText[@name=\"CB-BeforeTax-SetPrice\"]");

    public By checkBasedDiscountAfterTaxAsSetPrice = By.id("CB-AfterTax-SetPrice");
//    public By checkBasedDiscountAfterTaxAsSetPrice = By.xpath("//XCUIElementTypeStaticText[@name=\"CB-AfterTax-SetPrice\"]");

    public By checkBasedDiscountAfterTaxAsAmount = By.id("CheckBasedAmountAfterTax");
//    public By checkBasedDiscountAfterTaxAsAmount = By.xpath("//XCUIElementTypeStaticText[@name=\"CheckBasedAmountAfterTax\"]");

    public By checkBasedDiscountAfterTaxAsFreeItem = By.id("CB-AfterTax-FreeItem");
//    public By checkBasedDiscountAfterTaxAsFreeItem = By.xpath("//XCUIElementTypeStaticText[@name=\"CB-AfterTax-FreeItem\"]");

    public By checkBasedDiscountBeforeTaxAsFreeItem = By.id("CB-BeforeTax-FreeItem");
//    public By checkBasedDiscountBeforeTaxAsFreeItem = By.xpath("//XCUIElementTypeStaticText[@name=\"CB-BeforeTax-FreeItem\"]");

    public By itemBasedDiscountBeforeTaxWithPercentage = By.id("IB-BeforeTax-Percentage");
//    public By itemBasedDiscountBeforeTaxWithPercentage = By.xpath("//XCUIElementTypeStaticText[@name=\"IB-BeforeTax-Percentage\"]");

    public By itemBasedDiscountBeforeTaxWithAmount = By.id("IB-BeforeTax-Amount");
//    public By itemBasedDiscountBeforeTaxWithAmount = By.xpath("//XCUIElementTypeStaticText[@name=\"IB-BeforeTax-Amount\"]");

    public By itemBasedDiscountAfterTaxWithAmount = By.id("IB-DiscountAfterTax");
//    public By itemBasedDiscountAfterTaxWithAmount = By.xpath("//XCUIElementTypeStaticText[@name=\"IB-DiscountAfterTax\"]");

    //Payment


    public By paidCheckPopupInfo = By.id("Payment(s) made on this check,Can you return this to Test Automation");
//    public By paidCheckPopupInfo = By.xpath("//XCUIElementTypeTextView[@name=\"Payment(s) made on this check,Can you return this to Test Automation\"]");

    public By cashButton = By.xpath("(//XCUIElementTypeStaticText[@name=\"Cash\"])[2]");
    public By submitButton = By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeButton[@name=\"  Submit\"]");

    public By allOptions = By.id("All");
//    public By allOptions = By.xpath("//XCUIElementTypeStaticText[@name=\"All\"]\n");

    public By closedButton = By.id("Closed");
//    public By closedButton = By.xpath("//XCUIElementTypeStaticText[@name=\"Closed\"]");

    public By checkDetails = By.id("CheckDetialsIcon");
//    public By checkDetails = By.xpath("//XCUIElementTypeButton[@name=\"CheckDetialsIcon\"]");

    public By orderSummary = By.id("ORDER SUMMARY");
//    public By orderSummary = By.xpath("//XCUIElementTypeStaticText[@name=\"ORDER SUMMARY\"]");

    public By cancel = By.id("Cancel");
//    public By cancel = By.xpath("//XCUIElementTypeStaticText[@name=\"Cancel\"]");

    public By cashTab = By.id("Cash");
//    public By cashTab = By.xpath("//XCUIElementTypeStaticText[@name=\"Cash\"]");

    public By totalAmount = By.id("");
//    public By totalAmount = By.xpath("");

    public By enter = By.id("");
//    public By enter = By.xpath("");

    public By payCheckButton = By.id("Pay Check");
//    public By payCheckButton = By.xpath("//XCUIElementTypeStaticText[@name=\"Pay Check\"]");

    public By selectedTable = By.id("T1");
//    public By selectedTable = By.xpath("//XCUIElementTypeStaticText[@name=\"T1\"]");

    public By cashPaymentTab = By.xpath("//XCUIElementTypeButton[@name=\"Cash\"]/XCUIElementTypeStaticText");

    public By currentCheck = By.id("2-003");
//    public By currentCheck = By.xpath("//XCUIElementTypeStaticText[@name=\"2-003\"]");

    public By nextCheck = By.id("2-004");
//    public By nextCheck = By.xpath("//XCUIElementTypeStaticText[@name=\"2-004\"]");

    public By paidCheckAmount = By.id("");

    //    public By splitButtonOnCalculator = By.id("Split");
    public By splitButtonOnCalculator = By.xpath("//XCUIElementTypeStaticText[@name=\"Split\"]");

    public By splitType = By.id("1/2");
//    public By splitType = By.xpath("//XCUIElementTypeStaticText[@name=\"1/2\"]");

    public By cashButtonOnPayment = By.xpath("(//XCUIElementTypeStaticText[@name=\"Cash\"])[2]");

    public By paidAmount = By.id("5,00");
//    public By paidAmount = By.xpath("//XCUIElementTypeStaticText[@name=\"5,00\"]");

    public By balance = By.xpath("//XCUIElementTypeImage[@name=\"/var/mobile/Containers/Data/Application/F94EBD4C-87E3-4B36-8223-A9903E9F40F2/Documents//5f1ae54dc9d0cd00010e97f4/FoodGallery/Categories/5f1ae54dc9d0cd00010e9833.png\"]");

    public By voidAfterPaymentPopupInfo = By.id("//XCUIElementTypeStaticText[@name=\"Payment(s) made on this check,Can you return this to Walkin");
//    public By voidAfterPaymentPopupInfo = By.xpath("//XCUIElementTypeStaticText[@name=\"Payment(s) made on this check,Can you return this to Walkin\"]");


    public By exitButtonOnPayment = By.xpath("//XCUIElementTypeButton[@name=\"  Exit\"]");

    public By paymentMethodTitle = By.id("Select Payment Method");
//    public By paymentMethodTitle = By.xpath("//XCUIElementTypeStaticText[@name=\"Select Payment Method\"]");


    public By paidOrder = By.id("Success");

    public By deleteButtonOnPayment = By.xpath("//XCUIElementTypeButton[@name=\"  Delete\"]");

    public By exactButton = By.id("Exact");
//    public By exactButton = By.xpath("//XCUIElementTypeStaticText[@name=\"Exact\"]");

    public By receiptPrinter = By.id("Receipt Printer");
//    public By receiptPrinter = By.xpath("//XCUIElementTypeStaticText[@name=\"Receipt Printer\"]");

    public By receiptPrinterOkButton = By.id("OK");
//    public By receiptPrinterOkButton = By.xpath("//XCUIElementTypeButton[@name=\"OK\"]");

    public By emptyPayment = By.xpath("(//XCUIElementTypeTable[@name=\"Empty list\"])[5]");

    public By paymentStatusSuccess = By.id("Success");
//    public By paymentStatusSuccess = By.xpath("//XCUIElementTypeStaticText[@name=\"Success\"]");

    public By creditCardOption = By.id("Credit Card");

    public By giftCardOption = By.id("Gift Card");

    public By giftCardNumber = By.id("0000  0000  0000  0000");
//    public By giftCardNumber = By.xpath("//XCUIElementTypeButton[@name=\"0000  0000  0000  0000\"]");


    public By giveXCardNumberOnPayment = By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeTextField");
    public By giftCardName = By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[3]/XCUIElementTypeTextField");
    public By giftExpireDate = By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[4]/XCUIElementTypeTextField[1]");
    public By giftCVV = By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[4]/XCUIElementTypeTextField[2]");
    public By giftZipCode = By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[4]/XCUIElementTypeTextField[3]");

    public By giftProcessButton = By.id("Process");
//    public By giftProcessButton = By.xpath("//XCUIElementTypeStaticText[@name=\"Process\"]");

    public By manuelButton = By.id("Manual");
//    public By manuelButton = By.xpath("//XCUIElementTypeStaticText[@name=\"Manual\"]");

    public By LoyaltyPaymentButton = By.xpath("//XCUIElementTypeButton[contains(@name, 'Loyalty')]");

    public By PaidMethodWithLoyalty = By.id("1. Loyalty(#1)");

    public By othersCardType = By.id("Others");
//    public By othersCardType = By.xpath("//XCUIElementTypeStaticText[@name=\"Others\"]");

    public By okButton = By.id("Ok");
//    public By okButton = By.xpath("//XCUIElementTypeStaticText[@name=\"Ok\"]");

    public By customButton = By.id("Custom TL");
//    public By customButton = By.xpath("//XCUIElementTypeStaticText[@name=\"Custom TL\"]");

    public By applyTip = By.id("Apply Tip");
//    public By applyTip = By.xpath("//XCUIElementTypeStaticText[@name=\"Apply Tip\"]");

    public By tipAmount = By.xpath("//XCUIElementTypeStaticText[contains(@name, \"10,00\")]");


    public By CCSideTitle = By.xpath("//XCUIElementTypeStaticText[@name=\"1. CC Side(#1)\"]");
    public By sideCCTitle = By.xpath("//XCUIElementTypeStaticText[@name=\"1. Side CC(#1)\"]");

    public By ccSidePaymentOption = By.id("Side CC");
//    public By ccSidePaymentOption = By.xpath("//XCUIElementTypeStaticText[@name=\"Side CC\"]");

    public By noTipButton = By.id("No Tip");
//    public By noTipButton = By.xpath("//XCUIElementTypeStaticText[@name=\"No Tip\"]");

    public By partialPaymentForTenPrice = By.id("TL 10");
//    public By partialPaymentForTenPrice = By.xpath("//XCUIElementTypeStaticText[@name=\"TL 10\"]");

    public By partialPaymentPriceSummary = By.id("990,00+10,00");

    public By adjustButton = By.id("Adjust");

    public By paymentTextBox = By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeTextField[2]");

    public By halfSplitOption = By.id("1/2");
//    public By halfSplitOption = By.xpath("//XCUIElementTypeStaticText[@name=\"1/2\"]");

    public By balanceDue = By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeTextField[1]");
    public By secondSplitPaidDescription = By.xpath("//XCUIElementTypeStaticText[@name=\"2. Cash(#1)\"]");
    public By splitAmount = By.xpath("(//XCUIElementTypeStaticText[@name=\"16,50\"])[2]");

    public By noDueTextBox = By.id("No Due");
    //    public By noDueTextBox = By.xpath("//XCUIElementTypeStaticText[@name=\"No Due\"]");

    public By clearButtonOnCalculator = By.id("C");
//    public By clearButtonOnCalculator = By.xpath("//XCUIElementTypeStaticText[@name=\"C\"]");

    public By shortChangedPopup = By.id("Please pay TL 33,00");
//    public By shortChangedPopup = By.xpath("//XCUIElementTypeTextView[@name=\"Please pay TL 33,00\"]");

    public By noMorePaymentPopup = By.id("No More payments Needed");
//    public By noMorePaymentPopup = By.xpath("//XCUIElementTypeTextView[@name=\"No More payments Needed\"]");

    public By selectPaymentTryAgainWarningPopup = By.id("Select a Payment and try again!");
//    public By selectPaymentTryAgainWarningPopup = By.xpath("//XCUIElementTypeTextView[@name=\"Select a Payment and try again!\"]");


    public By emptyPaidOrder = By.xpath("(//XCUIElementTypeTable[@name=\"Empty list\"])[5]");

    public By receiptPrinterPopup = By.id("Receipt Printer");
//    public By receiptPrinterPopup = By.xpath("//XCUIElementTypeStaticText[@name=\"Receipt Printer\"]");

    public By taxExemptOption = By.id("Tax Exempt");
//    public By taxExemptOption = By.xpath("//XCUIElementTypeStaticText[@name=\"Tax Exempt\"]");


    public By clearGiftCardInfo = By.id("Clear");

    public By giftCardPaymentSummary = By.xpath("//XCUIElementTypeStaticText[@name=\"1. Gift Card(#1)\"]");

    public By successPaymentStatus = By.id("Success");
//    public By successPaymentStatus = By.xpath("//XCUIElementTypeStaticText[@name=\"Success\"]");

    public By noThanksOption = By.id("No Thanks");
//    public By noThanksOption = By.xpath("//XCUIElementTypeStaticText[@name=\"No Thanks\"]");

    public By remainderSplitAmount = By.id("550,00");
//    public By remainderSplitAmount = By.xpath("//XCUIElementTypeStaticText[@name=\"600,00\"]");

    public By creditCardPaymentMethod = By.id("Credit Card");
//    public By creditCardPaymentMethod = By.xpath("//XCUIElementTypeStaticText[@name=\"Credit Card\"]");


    public By firstTipOption = By.xpath("(//XCUIElementTypeStaticText[@name=\"10,00\"])[1]");
    public By creditCardNumber = By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeTextField");
    public By creditCardCVVInfo = By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[4]/XCUIElementTypeTextField[2]");
    public By creditCardExpireDate = By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[4]/XCUIElementTypeTextField[1]");
    public By firstEnteredTip = By.xpath("(//XCUIElementTypeStaticText[@name=\"10,00\"])[1]");
    public By CCSidePaymentDetail = By.xpath("//XCUIElementTypeStaticText[@name=\"1. Side CC(#1)\"]");
    public By CCSidePaymentDetailForBarTab = By.xpath("//XCUIElementTypeStaticText[@name=\"1. Side CC\"]");

    public By CCSidePaymentAmountWithItemBasedDiscountAfterTaxAsPercentage = By.id("1.100,01+100,00");
//    public By CCSidePaymentAmountWithItemBasedDiscountAfterTaxAsPercentage = By.xpath("//XCUIElementTypeStaticText[@name=\"1.100,01+100,00\"]");

    public By CCSidePaymentAmountWithItemBasedDiscountBeforeTaxAsPercentage = By.id("1.080,00+100,00");
//    public By CCSidePaymentAmountWithItemBasedDiscountBeforeTaxAsPercentage = By.xpath("//XCUIElementTypeStaticText[@name=\"1.080,00+100,00\"]");

    public By CCSidePaymentAmountWithItemBasedDiscountAfterTaxAsAmount = By.id("1.190,00+100,00");
//    public By CCSidePaymentAmountWithItemBasedDiscountAfterTaxAsAmount = By.xpath("//XCUIElementTypeStaticText[@name=\"1.190,00+100,00\"]");

    public By CCSidePaymentAmountWithItemBasedDiscountBeforeTaxAsAmount = By.id("1.659,89+100,00");
//    public By CCSidePaymentAmountWithItemBasedDiscountBeforeTaxAsAmount = By.xpath("//XCUIElementTypeStaticText[@name=\"1.659,89+100,00\"]");

    public By CCSidePaymentAmountWithItemBasedDiscountAfterTaxAsSetPrice = By.id("1.463,59+100,00");
//    public By CCSidePaymentAmountWithItemBasedDiscountAfterTaxAsSetPrice = By.xpath("//XCUIElementTypeStaticText[@name=\"1.463,59+100,00\"]");

    public By CCSidePaymentAmountWithItemBasedDiscountAfterTaxAsFreeItem = By.id("1.200,00+100,00");
//    public By CCSidePaymentAmountWithItemBasedDiscountAfterTaxAsFreeItem = By.xpath("//XCUIElementTypeStaticText[@name=\"1.200,00+100,00\"]");

    public By CCSidePaymentAmountWithItemBasedDiscountBeforeTaxAsFreeItem = By.id("1.212,00+100,00");
//    public By CCSidePaymentAmountWithItemBasedDiscountBeforeTaxAsFreeItem = By.xpath("//XCUIElementTypeStaticText[@name=\"1.296,00+100,00\"]");

    public By CCSidePaymentAmountWithItemBasedDiscountBeforeTaxAsSetPrice = By.id("1.200,00+100,00");
//    public By CCSidePaymentAmountWithItemBasedDiscountBeforeTaxAsSetPrice = By.xpath("//XCUIElementTypeStaticText[@name=\"1.200,00+100,00\"]");

    public By ccSidePaymentDetailAmount = By.id("1.200,00+100,00");
//    public By ccSidePaymentDetailAmount = By.xpath("//XCUIElementTypeStaticText[@name=\"1.200,00+100,00\"]");

    public By ccSidePaymentDetailAmountWithCheckBasedDiscountBeforeTaxAsPercentage = By.id("1.080,00+100,00");
//    public By ccSidePaymentDetailAmountWithCheckBasedDiscountBeforeTaxAsPercentage = By.xpath("//XCUIElementTypeStaticText[@name=\"1.080,00+100,00\"]");

    public By ccSidePaymentDetailAmountWithCheckBasedDiscountBeforeTaxAsAmount = By.id("1.194,00+100,00");
//    public By ccSidePaymentDetailAmountWithCheckBasedDiscountBeforeTaxAsAmount = By.xpath("//XCUIElementTypeStaticText[@name=\"1.194,00+100,00\"]");

    public By ccSidePaymentDetailAmountWithCheckBasedDiscountAfterTaxAsSetPrice = By.id("230,00+100,00");
//    public By ccSidePaymentDetailAmountWithCheckBasedDiscountAfterTaxAsSetPrice = By.xpath("//XCUIElementTypeStaticText[@name=\"230,00+100,00\"]");

    public By ccSidePaymentDetailAmountWithCheckBasedDiscountBeforeTaxAsSetPrice = By.id("36,00+100,00");
//    public By ccSidePaymentDetailAmountWithCheckBasedDiscountBeforeTaxAsSetPrice = By.xpath("//XCUIElementTypeStaticText[@name=\"36,00+100,00\"]");

    public By ccSidePaymentDetailAmountWithCheckBasedDiscountAfterTaxAsAmount = By.id("1.195,00+100,00");
//    public By ccSidePaymentDetailAmountWithCheckBasedDiscountAfterTaxAsAmount = By.xpath("//XCUIElementTypeStaticText[@name=\"1.195,00+100,00\"]");

    public By ccSidePaymentDetailAmountWithCheckBasedDiscountAfterTaxAsPercentage = By.id("27,57+100,00");
//    public By ccSidePaymentDetailAmountWithCheckBasedDiscountAfterTaxAsPercentage = By.xpath("//XCUIElementTypeStaticText[@name=\"27,57+100,00\"]");

    public By ccSidePaymentDetailAmountWithCheckBasedDiscountAfterTaxAsFreeItem = By.id("810,01+100,00");
//    public By ccSidePaymentDetailAmountWithCheckBasedDiscountAfterTaxAsFreeItem = By.xpath("//XCUIElementTypeStaticText[@name=\"810,01+100,00\"]");

    public By ccSidePaymentDetailAmountWithCheckBasedDiscountAfterTaxAsFreeItemForSandwich = By.id("810,01+100,00");
//    public By ccSidePaymentDetailAmountWithCheckBasedDiscountAfterTaxAsFreeItemForSandwich = By.xpath("//XCUIElementTypeStaticText[@name=\"810,01+100,00\"]");

    public By ccSidePaymentDetailAmountWithCheckBasedDiscountAfterTaxAsFreeItemForSandwiches = By.id("1.200,00+100,00");
//    public By ccSidePaymentDetailAmountWithCheckBasedDiscountAfterTaxAsFreeItemForSandwiches = By.xpath("//XCUIElementTypeStaticText[@name=\"1.200,00+100,00\"]");

    public By ccSidePaymentDetailAmountWithCheckBasedDiscountBeforeTaxAsFreeItem = By.id("1.200,00+100,00");
//    public By ccSidePaymentDetailAmountWithCheckBasedDiscountBeforeTaxAsFreeItem = By.xpath("//XCUIElementTypeStaticText[@name=\"1.200,00+100,00\"]");

    public By ccSidePaymentDetailAmountWithCheckBasedDiscountBeforeTaxAsFreeItemForSandwich = By.id("2.211,06+100,00");
//    public By ccSidePaymentDetailAmountWithCheckBasedDiscountBeforeTaxAsFreeItemForSandwich = By.xpath("//XCUIElementTypeStaticText[@name=\"2.211,06+100,00\"]");

    public By ccSidePaymentDetailAmountWithCheckBasedDiscountBeforeTaxForSandwiches = By.id("2.211,06+100,00");
//    public By ccSidePaymentDetailAmountWithCheckBasedDiscountBeforeTaxForSandwiches = By.xpath("//XCUIElementTypeStaticText[@name=\"2.211,06+100,00\"]");

    public By ccSidePaymentDetailAmountWithCheckBasedDiscountBeforeTaxAsFreeItemForSandwiches = By.id("1.200,00+100,00");
//    public By ccSidePaymentDetailAmountWithCheckBasedDiscountBeforeTaxAsFreeItemForSandwiches = By.xpath("//XCUIElementTypeStaticText[@name=\"1.200,00+100,00\"]");

    public By CCSideOpenItemPaymentDetailForBarTab = By.xpath("//XCUIElementTypeStaticText[@name=\"1. Side CC(#1)\"]");
    public By ccSidePaymentMethod = By.xpath("//XCUIElementTypeStaticText[@name=\"1. Side CC\"]");

    public By ccSidePaymentDetailAmountWithOpenItemDiscountAfterTax = By.id("2.211,06+100,00");
//    public By ccSidePaymentDetailAmountWithOpenItemDiscountAfterTax = By.xpath("//XCUIElementTypeStaticText[@name=\"2.211,06+100,00\"]");

    public By ccSidePaymentDetailAmountWithOpenItemDiscountBeforeTaxWithNonDecimalValue = By.id("2.211,06+100,00");
//    public By ccSidePaymentDetailAmountWithOpenItemDiscountBeforeTaxWithNonDecimalValue = By.xpath("//XCUIElementTypeStaticText[@name=\"2.211,06+100,00\"]");

    public By ccSidePaymentDetailAmountWithOpenCheckDiscountAfterTaxWithPercentage = By.id("1.000,01+100,00");
//    public By ccSidePaymentDetailAmountWithOpenCheckDiscountAfterTaxWithPercentage = By.xpath("//XCUIElementTypeStaticText[@name=\"1.100,01+100,00\"]");

    public By ccSidePaymentDetailAmountWithOpenCheckDiscountBeforeTaxWithPercentage = By.id("990,00+100,00");
//    public By ccSidePaymentDetailAmountWithOpenCheckDiscountBeforeTaxWithPercentage = By.xpath("//XCUIElementTypeStaticText[@name=\"1.080,00+100,00\"]");

    public By ccSidePaymentDetailAmountWithOpenCheckDiscountAfterTaxWithAmount = By.id("50,00+100,00");
//    public By ccSidePaymentDetailAmountWithOpenCheckDiscountAfterTaxWithAmount = By.xpath("//XCUIElementTypeStaticText[@name=\"50,00+100,00\"]");

    public By ccSidePaymentDetailAmountWithOpenCheckDiscountAfterTaxWithAmountForMargarita = By.id("TL 10,00");
//    public By ccSidePaymentDetailAmountWithOpenCheckDiscountAfterTaxWithAmountForMargarita = By.xpath("//XCUIElementTypeStaticText[@name=\"TL 10,00\"]");

    public By ccSidePaymentDetailAmountWithOpenCheckDiscountAfterTaxWithAmountAndTipForMargarita = By.id("1.100,00+100,00");
//    public By ccSidePaymentDetailAmountWithOpenCheckDiscountAfterTaxWithAmountAndTipForMargarita = By.xpath("//XCUIElementTypeStaticText[@name=\"1.100,00+100,00\"]");

    public By ccSidePaymentDetailAmountWithOpenCheckDiscountBeforeTaxWithAmount = By.id("1.097,75+100,00");
//    public By ccSidePaymentDetailAmountWithOpenCheckDiscountBeforeTaxWithAmount = By.xpath("//XCUIElementTypeStaticText[@name=\"1.097,75+100,00\"]");

    public By ccSidePaymentDetailAmountWithOpenCheckDiscountAfterTaxWithNonDecimalAmount = By.id("1.098,95+100,00");
//    public By ccSidePaymentDetailAmountWithOpenCheckDiscountAfterTaxWithNonDecimalAmount = By.xpath("//XCUIElementTypeStaticText[@name=\"1.098,95+100,00\"]");

    public By ccSidePaymentDetailAmountWithGratuityFixAndWithTips = By.id("917,99+100,00");
//    public By ccSidePaymentDetailAmountWithGratuityFixAndWithTips = By.xpath("//XCUIElementTypeStaticText[@name=\"917,99+100,00\"]");

    public By ccSidePaymentDetailAmountWithGratuityVaryingAndWithTips = By.id("900,00+100,00");
//    public By ccSidePaymentDetailAmountWithGratuityVaryingAndWithTips = By.xpath("//XCUIElementTypeStaticText[@name=\"900,00+100,00\"]");

    public By ccSidePaymentDetailAmountWithTaxExemptAndWithTips = By.id("599,90+100,00");
//    public By ccSidePaymentDetailAmountWithTaxExemptAndWithTips = By.xpath("//XCUIElementTypeStaticText[@name=\"599,90+100,00\"]");

    public By ccSidePaymentDetailAmountWithTaxExemptAndWithTipsWithNotSelectedCustomer = By.id("599,90+100,00");
//    public By ccSidePaymentDetailAmountWithTaxExemptAndWithTipsWithNotSelectedCustomer = By.xpath("//XCUIElementTypeStaticText[@name=\"599,90+100,00\"]");

    public By ccSidePaymentDetailAmountWithTaxExemptAndWithTipsWithPreDefinedCustomer = By.id("30,00+100,00");
//    public By ccSidePaymentDetailAmountWithTaxExemptAndWithTipsWithPreDefinedCustomer = By.xpath("//XCUIElementTypeStaticText[@name=\"30,00+100,00\"]");

    public By ccSidePaymentDetailAmountWithUpchargeOrderAndWithTips = By.id("12,00+100,00");
//    public By ccSidePaymentDetailAmountWithUpchargeOrderAndWithTips = By.xpath("//XCUIElementTypeStaticText[@name=\"12,00+100,00\"]");

    public By ccSidePaymentDetailAmountWithoutTip = By.id("1.100,00");
//    public By ccSidePaymentDetailAmountWithoutTip = By.xpath("//XCUIElementTypeStaticText[@name=\"1.200,00\"]");

    public By ccSidePaymentDetailAmountWithTip = By.id("1.100,00+100,00");
//    public By ccSidePaymentDetailAmountWithTip = By.xpath("//XCUIElementTypeStaticText[@name=\"1.200,00+100,00\"]");

    public By ccSidePaymentDetailAmountWithTipForBarTab = By.id("1.100,00+100,00");
//    public By ccSidePaymentDetailAmountWithTipForBarTab = By.xpath("//XCUIElementTypeStaticText[@name=\"1.200,00+100,00\"]");

    public By itemBasedDiscountAfterTaxWithPercentagePaymentDetailAmountWithTip = By.id("555,01+100,00");
//    public By itemBasedDiscountAfterTaxWithPercentagePaymentDetailAmountWithTip = By.xpath("//XCUIElementTypeStaticText[@name=\"555,01+100,00\"]");

    public By itemBasedDiscountBeforeTaxWithPercentagePaymentDetailAmountWithTip = By.id("126,00+100,00");
//    public By itemBasedDiscountBeforeTaxWithPercentagePaymentDetailAmountWithTip = By.xpath("//XCUIElementTypeStaticText[@name=\"126,00+100,00\"]");

    public By itemBasedDiscountBeforeTaxWithAmountPaymentDetailAmountWithTip = By.id("1.617,90+100,00");
//    public By itemBasedDiscountBeforeTaxWithAmountPaymentDetailAmountWithTip = By.xpath("//XCUIElementTypeStaticText[@name=\"1.617,90+100,00\"]");

    public By itemBasedDiscountBeforeTaxWithAmountPaymentDetailAmountWithTipForMargarita = By.id("1.089,00+100,00");
//    public By itemBasedDiscountBeforeTaxWithAmountPaymentDetailAmountWithTipForMargarita = By.xpath("//XCUIElementTypeStaticText[@name=\"1.089,00+100,00\"]");

    public By itemBasedDiscountAfterTaxWithAmountPaymentDetailAmountWithTip = By.id("20,00+100,00");
//    public By itemBasedDiscountAfterTaxWithAmountPaymentDetailAmountWithTip = By.xpath("//XCUIElementTypeStaticText[@name=\"20,00+100,00\"]");

    public By printerOkButton = By.id("OK");
//    public By printerOkButton = By.xpath("//XCUIElementTypeButton[@name=\"OK\"]");

    public By itemBasedDiscountAfterTaxWithFreeItemPaymentDetailForChickenSchinitzel = By.id("605,01+100,00");
//    public By itemBasedDiscountAfterTaxWithFreeItemPaymentDetailForChickenSchinitzel = By.xpath("//XCUIElementTypeStaticText[@name=\"605,01+100,00\"]");

    public By itemBasedDiscountBeforeTaxWithFreeItemPaymentDetailForChickenSchinitzel = By.id("638,01+100,00");
//    public By itemBasedDiscountBeforeTaxWithFreeItemPaymentDetailForChickenSchinitzel = By.xpath("//XCUIElementTypeStaticText[@name=\"638,01+100,00\"]");

    public By ccSidePaymentDetailAmountWithCheckBasedDiscountAfterTaxAsPercentageForSandwiches = By.id("1.100,01+100,00");
//    public By ccSidePaymentDetailAmountWithCheckBasedDiscountAfterTaxAsPercentageForSandwiches = By.xpath("//XCUIElementTypeStaticText[@name=\"1.100,01+100,00\"]");

    public By ccSidePaymentDetailAmountWithItemBasedDiscountAfterTaxAsPercentageForChickenSchinitzel = By.id("787,90+100,00");
//    public By ccSidePaymentDetailAmountWithItemBasedDiscountAfterTaxAsPercentageForChickenSchinitzel = By.xpath("//XCUIElementTypeStaticText[@name=\"787,90+100,00\"]");

    public By ccSidePaymentDetailAmountWithItemBasedDiscountAfterTaxAsSetPriceForChickenSchinitzel = By.id("2.187,90+100,00");
//    public By ccSidePaymentDetailAmountWithItemBasedDiscountAfterTaxAsSetPriceForChickenSchinitzel = By.xpath("//XCUIElementTypeStaticText[@name=\"2.187,90+100,00\"]");

    public By ccSidePaymentDetailAmountWithItemBasedDiscountAfterTaxAsSetPriceForPizzaRomano = By.id("657,90+100,00");
//    public By ccSidePaymentDetailAmountWithItemBasedDiscountAfterTaxAsSetPriceForPizzaRomano = By.xpath("//XCUIElementTypeStaticText[@name=\"657,90+100,00\"]");

    public By ccSidePaymentDetailAmountWithItemBasedDiscountBeforeTaxAsSetPriceForChickenSchinitzel = By.id("121,00+100,00");
//    public By ccSidePaymentDetailAmountWithItemBasedDiscountBeforeTaxAsSetPriceForChickenSchinitzel = By.xpath("//XCUIElementTypeStaticText[@name=\"121,00+100,00\"]");

    public By ccSidePaymentDetailAmountWithOpenItemDiscountAfterTaxForSandwiches = By.id("810,02+100,00");
//    public By ccSidePaymentDetailAmountWithOpenItemDiscountAfterTaxForSandwiches = By.xpath("//XCUIElementTypeStaticText[@name=\"810,02+100,00\"]");

    public By ccSidePaymentDetailAmountWithOpenItemDiscountAfterTaxPercentageForSandwiches = By.id("810,02+100,00");
//    public By ccSidePaymentDetailAmountWithOpenItemDiscountAfterTaxPercentageForSandwiches = By.xpath("//XCUIElementTypeStaticText[@name=\"810,02+100,00\"]");

    public By ccSidePaymentDetailAmountWithOpenCheckDiscountAfterTaxForSandwiches = By.id("750,02+100,00");
//    public By ccSidePaymentDetailAmountWithOpenCheckDiscountAfterTaxForSandwiches = By.xpath("//XCUIElementTypeStaticText[@name=\"750,02+100,00\"]");

    public By ccSidePaymentDetailAmountWithOpenCheckDiscountBeforeTaxForSandwiches = By.id("743,41+100,00");
//    public By ccSidePaymentDetailAmountWithOpenCheckDiscountBeforeTaxForSandwiches = By.xpath("//XCUIElementTypeStaticText[@name=\"743,41+100,00\"]");

    public By ccSidePaymentDetailAmountWithOpenCheckDiscountBeforeTaxForMargarita = By.id("1.199,95+100,00");
//    public By ccSidePaymentDetailAmountWithOpenCheckDiscountBeforeTaxForMargarita = By.xpath("//XCUIElementTypeStaticText[@name=\"1.199,95+100,00\"]");

    public By ccSidePaymentDetailAmountWithOpenCheckDiscountWithNonDecimalValueAfterTaxForMargarita = By.id("1.321,00+100,00");
//    public By ccSidePaymentDetailAmountWithOpenCheckDiscountWithNonDecimalValueAfterTaxForMargarita = By.xpath("//XCUIElementTypeStaticText[@name=\"1.321,00+100,00\"]");

    public By ccSidePaymentDetailAmountWithOpenCheckDiscountWithNonDecimalValueBeforeTaxForMargarita = By.id("1.198,90+100,00");
//    public By ccSidePaymentDetailAmountWithOpenCheckDiscountWithNonDecimalValueBeforeTaxForMargarita = By.xpath("//XCUIElementTypeStaticText[@name=\"1.198,90+100,00\"]");

    public By ccSidePaymentAmountWithTipsAndVaryingGratuityForSandwiches = By.id("1.299,99+100,00");
//    public By ccSidePaymentAmountWithTipsAndVaryingGratuityForSandwiches = By.xpath("//XCUIElementTypeStaticText[@name=\"1.299,99+100,00\"]");

    public By ccSidePaymentAmountWithTipsAndTaxExemptForSandwiches = By.id("999,90+100,00");
//    public By ccSidePaymentAmountWithTipsAndTaxExemptForSandwiches = By.xpath("//XCUIElementTypeStaticText[@name=\"999,90+100,00\"]");

    public By ccSidePaymentAmountWithoutTipsAndTaxExemptForSandwiches = By.id("999,90");
//    public By ccSidePaymentAmountWithoutTipsAndTaxExemptForSandwiches = By.xpath("//XCUIElementTypeStaticText[@name=\"999,90\"]");

    public By ccSidePaymentAmountWithTipsAndItemBasedDiscountAfterTaxAsPercentageWithTaxExemptForSandwiches = By.id("499,91");
//    public By ccSidePaymentAmountWithTipsAndItemBasedDiscountAfterTaxAsPercentageWithTaxExemptForSandwiches = By.xpath("//XCUIElementTypeStaticText[@name=\"499,91\"]");

    public By ccSidePaymentAmountWithTipsAndItemBasedDiscountBeforeTaxAsPercentageWithTaxExemptForSandwiches = By.id("499,90");
//    public By ccSidePaymentAmountWithTipsAndItemBasedDiscountBeforeTaxAsPercentageWithTaxExemptForSandwiches = By.xpath("//XCUIElementTypeStaticText[@name=\"499,90\"]");

    public By ccSidePaymentAmountWithTipsAndItemBasedDiscountAfterTaxAsAmountWithTaxExemptForSandwiches = By.id("599,30");
//    public By ccSidePaymentAmountWithTipsAndItemBasedDiscountAfterTaxAsAmountWithTaxExemptForSandwiches = By.xpath("//XCUIElementTypeStaticText[@name=\"599,30\"]");

    public By ccSidePaymentAmountWithTipsAndItemBasedDiscountBeforeTaxAsAmountWithTaxExemptForSandwiches = By.id("539,90");
//    public By ccSidePaymentAmountWithTipsAndItemBasedDiscountBeforeTaxAsAmountWithTaxExemptForSandwiches = By.xpath("//XCUIElementTypeStaticText[@name=\"539,90\"]");

    public By ccSidePaymentAmountWithTipsAndItemBasedDiscountAfterTaxAsSetPriceWithTaxExemptForSandwiches = By.id("29,90");
//    public By ccSidePaymentAmountWithTipsAndItemBasedDiscountAfterTaxAsSetPriceWithTaxExemptForSandwiches = By.xpath("//XCUIElementTypeStaticText[@name=\"29,90\"]");

    public By ccSidePaymentAmountWithTipsAndItemBasedDiscountBeforeTaxAsSetPriceWithTaxExemptForSandwiches = By.id("29,90+100,00");
//    public By ccSidePaymentAmountWithTipsAndItemBasedDiscountBeforeTaxAsSetPriceWithTaxExemptForSandwiches = By.xpath("//XCUIElementTypeStaticText[@name=\"29,90+100,00\"]");

    public By ccSidePaymentAmountWithTipsAndItemBasedDiscountAfterTaxAsFreeItemWithTaxExemptForSandwiches = By.id("599,90");
//    public By ccSidePaymentAmountWithTipsAndItemBasedDiscountAfterTaxAsFreeItemWithTaxExemptForSandwiches = By.xpath("//XCUIElementTypeStaticText[@name=\"599,90\"]");

    public By ccSidePaymentAmountWithTipsAndItemBasedDiscountBeforeTaxAsFreeItemWithTaxExemptForSandwiches = By.id("629,90");
//    public By ccSidePaymentAmountWithTipsAndItemBasedDiscountBeforeTaxAsFreeItemWithTaxExemptForSandwiches = By.xpath("//XCUIElementTypeStaticText[@name=\"629,90\"]");

    public By ccSidePaymentAmountWithTipsAndFixGratuityForSandwiches = By.id("1.299,99+100,00");
//    public By ccSidePaymentAmountWithTipsAndFixGratuityForSandwiches = By.xpath("//XCUIElementTypeStaticText[@name=\"1.299,99+100,00\"]");

    public By cashOnMenuItemPage = By.id("Cash");
//    public By cashOnMenuItemPage = By.xpath("//XCUIElementTypeStaticText[@name=\"Cash\"]");

    public By giveXPaymentMethod = By.id("GiveX");
//    public By giveXPaymentMethod = By.xpath("//XCUIElementTypeStaticText[@name=\"GiveX\"]");

    public By numberZero = By.id("0");
//    public By numberZero = By.xpath("//XCUIElementTypeStaticText[@name=\"0\"]");

    public By numberTwo = By.id("2");
//    public By numberTwo = By.xpath("//XCUIElementTypeStaticText[@name=\"2\"]");

    public By numberThree = By.id("3");
//    public By numberThree = By.xpath("//XCUIElementTypeStaticText[@name=\"3\"]");

    public By numberFour = By.id("4");
//    public By numberFour = By.xpath("//XCUIElementTypeStaticText[@name=\"4\"]");

    public By numberSix = By.id("6");
//    public By numberSix = By.xpath("//XCUIElementTypeStaticText[@name=\"6\"]");

    public By numberSeven = By.id("7");
//    public By numberSeven = By.xpath("//XCUIElementTypeStaticText[@name=\"7\"]");

    public By numberEight = By.id("8");
//    public By numberEight = By.xpath("//XCUIElementTypeStaticText[@name=\"8\"]");

    public By numberNine = By.id("9");
//    public By numberNine = By.xpath("//XCUIElementTypeStaticText[@name=\"9\"]");

    public By giveXCardNumberText = By.id("0000 0000 0000 0000");
//    public By giveXCardNumberText = By.xpath("//XCUIElementTypeButton[@name=\"0000 0000 0000 0000\"]");


    public By giveXChargeAmountText = By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther[4]/XCUIElementTypeOther/XCUIElementTypeTextField");

    public By continueGiftCart = By.id("Continue");
//    public By continueGiftCart = By.xpath("//XCUIElementTypeStaticText[@name=\"Continue\"]");

    public By forceRedemption = By.id("Force Redemption");
//    public By forceRedemption = By.xpath("//XCUIElementTypeStaticText[@name=\"Force Redemption\"]");

    public By receiptPrinterTitle = By.id("Receipt Printer");
//    public By receiptPrinterTitle = By.xpath("//XCUIElementTypeStaticText[@name=\"Receipt Printer\"]");


    public By giveXPaymentMethodDiyez = By.xpath("//XCUIElementTypeStaticText[@name=\"1. GiveX(#1)\"]");
    public By cashPaymentMethodDiyez = By.xpath("//XCUIElementTypeStaticText[@name=\"1. Cash(#1)\"]");
    public By paymentAmountForHamburger = By.xpath("(//XCUIElementTypeStaticText[@name=\"1.000,00\"])[2]");

    public By tunaTacosTotalPriceForVoidAction = By.id("33,00+10,00");
//    public By tunaTacosTotalPriceForVoidAction = By.xpath("//XCUIElementTypeStaticText[@name=\"1.743,18+10,00\"]");

    public By tunaTacosTotalPrice = By.id("1.243,18+10,00");
//    public By tunaTacosTotalPrice = By.xpath("//XCUIElementTypeStaticText[@name=\"1.243,18+10,00\"]");

    public By sandwichesPricePayWithCash = By.id("1.100,00");
//    public By sandwichesPricePayWithCash = By.xpath("//XCUIElementTypeStaticText[@name=\"1.200,00\"]");

    public By coctailAmount = By.id("2.033,50");
//    public By coctailAmount = By.xpath("//XCUIElementTypeStaticText[@name=\"2.033,50\"]");

    //    public By voidSandwichesAmount = By.xpath("//XCUIElementTypeStaticText[@name=\"1.200,00\"]");

    public By giveXButton = By.id("GiveX");
//    public By giveXButton = By.xpath("//XCUIElementTypeStaticText[@name=\"GiveX\"]");

    public By sideCCForSandwich = By.id("1.100,00+100,00");
//    public By sideCCForSandwich = By.xpath("//XCUIElementTypeStaticText[@name=\"1.200,00+100,00\"]");

    public By sideCCPaymentWithTipsAndWithoutServiceCharge = By.id("1.100,00+100,00");
//    public By sideCCPaymentWithTipsAndWithoutServiceCharge = By.xpath("//XCUIElementTypeStaticText[@name=\"1.200,00+100,00\"]");

    public By sideCCPaymentWithTipsAndWithServiceCharge = By.id("2.033,50+100,00");
//    public By sideCCPaymentWithTipsAndWithServiceCharge = By.xpath("//XCUIElementTypeStaticText[@name=\"2.033,50+100,00\"]");

    public By sideCCPaymentWithoutTipsAndWithServiceCharge = By.id("140,80");
//    public By sideCCPaymentWithoutTipsAndWithServiceCharge = By.xpath("//XCUIElementTypeStaticText[@name=\"140,80\"]");

    public By partialPaymentAmount = By.id("TL 20");
//    public By partialPaymentAmount = By.xpath("//XCUIElementTypeButton[@name=\"TL 20\"]");

    public By partialPaidAmountWithGiftCard = By.id("20,00+10,00");
//    public By partialPaidAmountWithGiftCard = By.xpath("//XCUIElementTypeStaticText[@name=\"20,00+10,00\"]");

    //Batch Tip Adjustment


    public By merchantDeviceTypeSelectionArrow = By.xpath("(//XCUIElementTypeButton[@name=\"Down Arrow Black\"])[1]");

    public By ccSideDeviceType = By.id("Side CC");
//    public By ccSideDeviceType = By.xpath("//XCUIElementTypeStaticText[@name=\"Side CC\"]");


    public By ccSidePaymentOptionTable = By.xpath("(//XCUIElementTypeStaticText[@name=\"T1\"])[last()]");

    public By clearNumberPad = By.id("C");
//    public By clearNumberPad = By.xpath("//XCUIElementTypeStaticText[@name=\"C\"]");

    public By lastCcSidePaymentOption = By.xpath("(//XCUIElementTypeStaticText[@name=\"Side CC - Others\"])[last()]");
    public By lastModifiedTip = By.xpath("(//XCUIElementTypeStaticText[@name=\"50,00\"])[last()]");

    public By operationMenuIcon = By.id("ToggleIcon");
//    public By operationMenuIcon = By.xpath("//XCUIElementTypeButton[@name=\"ToggleIcon\"]");

    public By posOption = By.id("POS");
//    public By posOption = By.xpath("//XCUIElementTypeStaticText[@name=\"POS\"]");

    public By selectDeviceTypeListbox = By.xpath("(//XCUIElementTypeButton[@name=\"Down Arrow Black\"])[1]");
    public By OrderWithCCSideDevice = By.xpath("(//XCUIElementTypeStaticText[@name=\"Side CC - Others\"])[last()]");

    // Cash

    public By enterButton = By.id("Enter");
//    public By enterButton = By.xpath("//XCUIElementTypeStaticText[@name=\"Enter\"]");

    public By exceedCashAmountPopup = By.id("Cash amount has exceeded the limit.Please make a drop now");
//    public By exceedCashAmountPopup = By.xpath("//XCUIElementTypeStaticText[@name=\"Cash amount has exceeded the limit.Please make a drop now\"]");

    public By yesButton = By.id("Yes");
//    public By yesButton = By.xpath("//XCUIElementTypeButton[@name=\"Yes\"]");

    //Check Option


    public By checkOptionTitle = By.id("Check Options");
//    public By checkOptionTitle = By.xpath("//XCUIElementTypeStaticText[@name=\"Check Options\"]");

    public By discount = By.id("Discount");
//    public By discount = By.xpath("//XCUIElementTypeStaticText[@name=\"Discount\"]");

    public By checkDiscount = By.id("Check Discount");
//    public By checkDiscount = By.xpath("//XCUIElementTypeStaticText[@name=\"Check Discount\"]");

    public By percentageDiscount = By.id("10%");
//    public By percentageDiscount = By.xpath("//XCUIElementTypeStaticText[@name=\"10%\"]");

    public By openCheckDiscountOption = By.id("Open Check Discount");
//    public By openCheckDiscountOption = By.xpath("//XCUIElementTypeStaticText[@name=\"Open Check Discount\"]");

    public By percentageChargeType = By.id("Percentage");
//    public By percentageChargeType = By.xpath("//XCUIElementTypeStaticText[@name=\"Percentage\"]");

    public By percentageOpenDiscountTextbox = By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeTextField");

    public By numberFiveOnCalculator = By.id("5");
//    public By numberFiveOnCalculator = By.xpath("//XCUIElementTypeStaticText[@name=\"5\"]");

    public By numberDoubleZeroOnCalculator = By.id("00");
//    public By numberDoubleZeroOnCalculator = By.xpath("//XCUIElementTypeStaticText[@name=\"00\"]");

    public By numberOneOnCalculator = By.id("1");

    public By numberZeroOnCalculator = By.id("0");
//    public By numberZeroOnCalculator = By.xpath("//XCUIElementTypeStaticText[@name=\"0\"]");

    public By numberTwoOnCalculator = By.id("2");
//    public By numberTwoOnCalculator = By.xpath("//XCUIElementTypeStaticText[@name=\"2\"]");

    public By continueOnCalculator = By.id("Continue");
//    public By continueOnCalculator = By.xpath("//XCUIElementTypeStaticText[@name=\"Continue\"]");

    public By afterTaxType = By.id("After");
//    public By afterTaxType = By.xpath("//XCUIElementTypeStaticText[@name=\"After\"]");

    public By applyButtonOnOpenDiscount = By.id("Apply");
//    public By applyButtonOnOpenDiscount = By.xpath("//XCUIElementTypeStaticText[@name=\"Apply\"]");


    public By openDiscountReason = By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeTextView");
    public By closeKeyboard = By.xpath("(//XCUIElementTypeButton[@name=\" Back \"])[2]");

    public By gratuityOption = By.id("Gratuity");
//    public By gratuityOption = By.xpath("//XCUIElementTypeStaticText[@name=\"Gratuity\"]");

    public By gratuityTitle = By.id("Add Gratuity");
//    public By gratuityTitle = By.id("Add Gratuity");

    public By fixedGratuity = By.id("Fixed Gratuity");
//    public By fixedGratuity = By.xpath("//XCUIElementTypeStaticText[@name=\"Fixed Gratuity\"]");

    public By varyingGratuity = By.id("Varying Gratuity");
//    public By varyingGratuity = By.xpath("//XCUIElementTypeStaticText[@name=\"Varying Gratuity\"]");


    public By varyingPercentageTextBox = By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[3]/XCUIElementTypeOther[2]/XCUIElementTypeTextField");

    public By varyingApplyButton = By.id("Apply");
//    public By varyingApplyButton = By.xpath("//XCUIElementTypeStaticText[@name=\"Apply\"]");

    public By varyingContinueButton = By.id("Continue");
//    public By varyingContinueButton = By.xpath("//XCUIElementTypeStaticText[@name=\"Continue\"]");


    public By varyingOneButton = By.id("1");

    public By varyingZeroButton = By.id("0");
//    public By varyingZeroButton = By.xpath("//XCUIElementTypeStaticText[@name=\"0\"]");

    public By varyingFiveButton = By.id("5");
//    public By varyingFiveButton = By.xpath("//XCUIElementTypeStaticText[@name=\"5\"]");

    public By fireCoursingButton = By.id("Fire  Coursing");
//    public By fireCoursingButton = By.xpath("//XCUIElementTypeStaticText[@name=\"Fire Coursing\"]");

    public By ToBePreparedOrder = By.id("ENTREE");
    public By fireCoursingTitle = By.id("Fire Coursing");

    public By emptyFireList = By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[3]/XCUIElementTypeCollectionView");

    public By serviceExempt = By.id("Service Exempt");
//    public By serviceExempt = By.xpath("//XCUIElementTypeStaticText[@name=\"Service Exempt\"]");

    public By cashDrawer = By.id("Open Cash Drawer");
    //    public By cashDrawer = By.xpath("//XCUIElementTypeStaticText[@name=\"Open Cash Drawer\"]");
    public By menuItemTitle = By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeStaticText");

    public By openItemOption = By.id("Open Item");
    //    public By openItemOption = By.xpath("//XCUIElementTypeStaticText[@name=\"Open Item\"]");
    public By coursingItemNameTextBox = By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[3]/XCUIElementTypeTextField[2]");
    public By coursingPriceTextBox = By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[3]/XCUIElementTypeTextField[3]");

    //    public By defaultCoursingTaxOption = By.id("Zero Tax");
    public By defaultCoursingTaxOption = By.xpath("//XCUIElementTypeStaticText[@name=\"Zero Tax\"]");

    public By coursingDoneButton = By.id("Done");
//    public By coursingDoneButton = By.xpath("//XCUIElementTypeStaticText[@name=\"Done\"]");

    public By checkOptionBackButton = By.xpath("//XCUIElementTypeStaticText[@name=\" Back \"]");

    public By entreeCoursingOption = By.id("");
//    public By entreeCoursingOption = By.xpath("");

    public By entreeCoursingName = By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[3]/XCUIElementTypeTextField[1]");
    public By doneButtonForSelectCourse = By.xpath("(//XCUIElementTypeButton[@name=\"Done\"])[2]");

    public By taxExemptType = By.id("Charity");
//    public By taxExemptType = By.xpath("//XCUIElementTypeStaticText[@name=\"Charity\"]");


    public By chargeTypeWithAmount = By.xpath("(//XCUIElementTypeStaticText[@name=\"Amount\"])[1]");

    public By applyTaxForOpenDiscount = By.id("After");
//    public By applyTaxForOpenDiscount = By.xpath("//XCUIElementTypeStaticText[@name=\"After\"]");

    public By applyButtonForOpenDiscount = By.id("Apply");
//    public By applyButtonForOpenDiscount = By.xpath("//XCUIElementTypeStaticText[@name=\"Apply\"]");

    public By itemDiscountOption = By.id("Item Discount");
//    public By itemDiscountOption = By.xpath("//XCUIElementTypeStaticText[@name=\"Item Discount\"]");

    public By autoDiscount = By.id("Auto Discount");
//    public By autoDiscount = By.xpath("//XCUIElementTypeStaticText[@name=\"Auto Discount\"]");


    public By taxExemptRemovedText = By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeTextView");
    public By suspendAccount = By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther[4]/XCUIElementTypeSwitch");
    public By activateAccount = By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther[4]/XCUIElementTypeSwitch");

    public By holdCheckOption = By.id("Hold");
//    public By holdCheckOption = By.xpath("//XCUIElementTypeStaticText[@name=\"Hold\"]");

    public By checkOptionPageTitle = By.id("Check Options");
//    public By checkOptionPageTitle = By.xpath("//XCUIElementTypeStaticText[@name=\"Check Options\"]");

    public By openItemCoursingName = By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[3]/XCUIElementTypeTextField[1]");
    public By openItemsItemName = By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[3]/XCUIElementTypeTextField[2]");
    public By openItemPrice = By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[3]/XCUIElementTypeTextField[3]");
    public By coursingNameForAfterTaxWithOpenItem = By.xpath("//XCUIElementTypeStaticText[@name=\"ENTREE \"]");
    public By itemNameForAfterTaxWithOpenItem = By.xpath("//XCUIElementTypeStaticText[@name=\"Test Automation \"]");

    public By minMaxGratuityValueWarningPopup = By.id("Enter Value from 10.0 - 100.0");
//    public By minMaxGratuityValueWarningPopup = By.xpath("//XCUIElementTypeTextView[@name=\"Enter Value from 10.0 - 100.0\"]");

    public By beforeTaxForOpenItem = By.id("BeforeTaxAmount-OpenItem");
//    public By beforeTaxForOpenItem = By.xpath("//XCUIElementTypeStaticText[@name=\"BeforeTaxAmount-OpenItem\"]");


    public By coursingNameListBox = By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[3]/XCUIElementTypeTable[1]/XCUIElementTypeCell[18]");
    public By percentageTextField = By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeTextField");
    public By amountTextField = By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeTextField");

    public By applyVaryingGratuity = By.id("Apply");
//    public By applyVaryingGratuity = By.xpath("//XCUIElementTypeStaticText[@name=\"Apply\"]");


    public By coursingNameTextBox = By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[3]/XCUIElementTypeTextField[1]");

    public By openItemDoneButton = By.id("Done");
    //    public By openItemDoneButton = By.xpath("//XCUIElementTypeStaticText[@name=\"Done\"]");
    public By combinationDiscountWarningText = By.xpath("//XCUIElementTypeTextView[@name=\"Combined with other discounts is disabled for Item-Based Discount\"]");

    public By voidReasonFOrGiftCard = By.id("MISTAKE");
//    public By voidReasonFOrGiftCard = By.xpath("//XCUIElementTypeStaticText[@name=\"Mistake\"]");

    public By voidItemMenuOption = By.id("Void Item");
//    public By voidItemMenuOption = By.xpath("//XCUIElementTypeStaticText[@name=\"Void Item\"]");

    //Check Status

    //Check Status Nov 24

    public By qsrButton = By.xpath("(//XCUIElementTypeStaticText[@name=\"QSR\"])[2]");

    public By barTabChoice = By.id("BARTAB");
//    public By barTabChoice = By.xpath("//XCUIElementTypeStaticText[@name=\"BARTAB\"]");

    public By checkStatusTab = By.id("Check Stats");
//    public By checkStatusTab = By.xpath("//XCUIElementTypeStaticText[@name=\"Check Stats\"]");

    //    public By activeCheck = By.xpath("//XCUIElementTypeStaticText[@name=\"Active\"]");
    public By activeCheck = By.id("Active");

    public By barTabType = By.xpath("(//XCUIElementTypeStaticText[@name=\"Bar Tab\"])[1]");

    //    public By closedChecks = By.xpath("//XCUIElementTypeStaticText[@name=\"Closed\"]");
    public By closedChecks = By.id("Closed");

    //public  By orderSummary = By.xpath("//XCUIElementTypeStaticText[@name=\"ORDER SUMMARY\"]");
    //public By checkDetails = By.xpath("//XCUIElementTypeButton[@name=\"CheckDetialsIcon\"]");

    //    public By backToChecks = By.xpath("//XCUIElementTypeStaticText[@name=\"Back To Checks\"]");
    public By backToChecks = By.id("Back To Checks");

    public By voidTab = By.id("Void");
//    public By voidTab = By.xpath("//XCUIElementTypeStaticText[@name=\"Void\"]");

    //    public By voidCauseType = By.xpath("//XCUIElementTypeStaticText[@name=\"Cold Food\"]");
    public By voidCauseType = By.id("Wrong Check");

    //    public By addVoidTypeButton = By.xpath("//XCUIElementTypeButton[@name=\"Add\"]");
    public By addVoidTypeButton = By.id("Add");

    //    public By voidChecksTab = By.xpath("//XCUIElementTypeStaticText[@name=\"Void\"]");
    public By voidChecksTab = By.id("Void");

    public By voidCheckDetails = By.xpath("(//XCUIElementTypeButton[@name=\"CheckDetialsIcon\"])[10]");

    public By voidCause = By.xpath("//XCUIElementTypeStaticText[@name=\"*Cold Food\"]");

    //    public By futureCheckTab = By.xpath("//XCUIElementTypeStaticText[@name=\"Future\"]");
    public By futureCheckTab = By.id("Future");

    //public By receiptPrinterPopup = By.xpath("//XCUIElementTypeStaticText[@name=\"Receipt Printer\"]");
//    public By receiptPrinterDoneButton = By.xpath("//XCUIElementTypeButton[@name=\"Done\"]");
    public By receiptPrinterDoneButton = By.id("Done");

    //    public By firstVoidReason = By.xpath("//XCUIElementTypeStaticText[@name=\"Cold Food\"]");
    public By firstVoidReason = By.id("Wrong Item Ordered");

    public By checkTotalOnVoidTab = By.xpath("(//XCUIElementTypeStaticText[@name=\"10,00\"])[9]");
    public By tableOfTabOnClosedCheck = By.id("QSR");

    //    public By reopenCheck = By.xpath("//XCUIElementTypeStaticText[@name=\"Re-open Check\"]");
    public By reopenCheck = By.id("Re-Open Check");
    //public By noMorePaymentPopup= By.id("No More Payment need");

    //    public By noMorePaymentPopupDoneButton = By.xpath("//XCUIElementTypeStaticText[@name=\"Done\"]");
    public By noMorePaymentPopupDoneButton = By.id("Done");

    public By openCheckButton = By.id("Open Check");
    public By qsrOptionOnCheckStatus = By.id("QSR");
//    public By qsrOptionOnCheckStatus = By.xpath("//XCUIElementTypeStaticText[@name=\"QSR\"]");

    //    public By subTotalOnOrderSummary = By.xpath("//XCUIElementTypeStaticText[@name=\"Sub-Total :\"]");
    public By subTotalOnOrderSummary = By.id("Sub-Total :");

    public By subTotalBalanceOnOrderSummary = By.xpath("(//XCUIElementTypeStaticText[@name=\"TL0,00\"])[1]");

    //    public By barTabButton = By.xpath("//XCUIElementTypeStaticText[@name=\"Bar Tab\"]");
    public By barTabButton = By.id("Bar Tab");

    //    public By qsrOrderType = By.xpath("//XCUIElementTypeStaticText[@name=\"QSR\"]");
    public By qsrOrderType = By.id("QSR");

    public By lastBarTabOrder = By.xpath("//XCUIElementTypeStaticText[@name=\"Bar Tab\"])[last()]");
    public By closedCheckDetailIcon = By.xpath("(//XCUIElementTypeButton[@name=\"CheckDetialsIcon\"])[last()]");
    public By voidedCheckOnBarTab = By.xpath("(//XCUIElementTypeStaticText[@name=\"Bar Tab\"])[last()]");
    public By closedOrderDetailInfoIcon = By.xpath("(//XCUIElementTypeButton[@name=\"CheckDetialsIcon\"])[last()]");

    public By giveXCardNumberOnMenuItemPage = By.xpath("//XCUIElementTypeStaticText[@name=\"GC-603628394562001380850 \"]");
    public By giveXCardNumberOnOrderSummary = By.xpath("(//XCUIElementTypeStaticText[@name=\"GCX-603628394562001380850 \"])[2]");

    //    public By giveXChargeAmount = By.xpath("//XCUIElementTypeStaticText[@name=\"1.000,00\"]");
    public By giveXChargeAmount = By.id("1.000,00");

    public By voidedPhoneTOGoOrder = By.xpath("(//XCUIElementTypeStaticText[@name=\"Phone To Go\"])[last()]");
    public By voidedPhoneToGoOrderCheckTotal = By.xpath("(//XCUIElementTypeStaticText[@name=\"0,00\"])[(last)]");


    //Customer Profile

    //Customer Profile

    public By saveBtn = By.xpath("//XCUIElementTypeStaticText[@name=\"Save\"]");
    //public By saveBtn = By.id("Save");
    //    public By selectedCustomerName = By.xpath("//XCUIElementTypeButton[contains(@name,'Engin')]");
    public By selectedCustomerName = By.xpath("//XCUIElementTypeButton[contains(@name,'Engin')]");
    public By firstName = By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeTextField[1]");
    public By lastName = By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeTextField[2]");
    public By addPhoneNumberButton = By.xpath("(//XCUIElementTypeStaticText[@name=\"Add\"])[1]");
    public By savePhoneNumberButton = By.xpath("(//XCUIElementTypeStaticText[@name=\"Save\"])[1]");
    public By phoneNumberTextBox = By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeTextField[5]");
    public By addCustomerAddressButton = By.xpath("(//XCUIElementTypeStaticText[@name=\"Add\"])[2]");
    public By addressSearchBox = By.xpath("(//XCUIElementTypeSearchField[@name=\"Search\"])[1]");
    public By firstSearchedResult = By.xpath("(//XCUIElementTypeStaticText[@name=\"Flora Residence\"])[1]");
    public By enterCityTextBox = By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeTextField[3]");
    public By saveCustomerAddress = By.xpath("(//XCUIElementTypeStaticText[@name=\"Save\"])[2]");
    //public By closeKeyboard = By.xpath("(//XCUIElementTypeButton[@name=\"Save\"])[1]");
//    public By searchTextBox1 = By.xpath("//XCUIElementTypeSearchField[@name=\"Search\"]");
    public By searchTextBox1 = By.id("Search");
    public By searchTextBox = By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeTextField");
    public By addressSearchTextBox = By.xpath("(//XCUIElementTypeSearchField[@name=\"Search\"])[1]");
    public By searchedCustomer = By.xpath("(//XCUIElementTypeStaticText[@name=\"Test Automation\"])[1]");
    //    public By customerProfileTitle = By.xpath("//XCUIElementTypeStaticText[@name=\"Customer Profile\"]");
    public By customerProfileTitle = By.id("Customer Profile");
    public By selectedCustomerPhone = By.id("Test Automation 1234567890");
    public By customerEmailAddressTextBox = By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeTextField[7]");
    //    public By hideKeyboard = By.xpath("//XCUIElementTypeButton[@name=\"Hide keyboard\"]");
    public By hideKeyboard = By.id("Hide keyboard");
    public By closeButtonForMobile = By.id("Customer MobileNo close");
    public By mobilePhoneEmailPopup = By.id("Enter Email Id or Mobile Number");
    //    public By warningDoneButton = By.xpath("//XCUIElementTypeStaticText[@name=\"Done\"]");
    public By warningDoneButton = By.id("Done");
    public By customerAddressDropDownIcon = By.xpath("(//XCUIElementTypeButton[@name=\"CustomerProfile DownArrow\"])[2]");
    //    public By emptyAddressList = By.id("Empty list");
    public By emptyAddressList = By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeTable[@name=\"Empty list\"]");
    public By customer = By.xpath("(//XCUIElementTypeStaticText[@name=\"Test Automation\"])[last()]");
    //    public By customerPlanButton = By.xpath("//XCUIElementTypeStaticText[@name=\"Customer Plan\"]");
    public By customerPlanButton = By.id("Customer Plan");
    public By accountType = By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTextField[1]");
    //    public By updateButton = By.xpath("//XCUIElementTypeSearchField[@name=\"Update\"]");
    public By updateButton = By.id("Update");
    public By rechargeTextField = By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTextField[3]");
    //    public By rechargeAmount = By.xpath("//XCUIElementTypeStaticText[@name=\"1,000,00\"]");
    public By rechargeAmount = By.id("1,000,00");
    public By houseAccountCardNumberTextField = By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTextField[2]");
    public By limitToggle = By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeSwitch[1]");
    //    public By limitText = By.xpath("//XCUIElementTypeStaticText[@name=\"Limit\"]");
    public By limitText = By.id("Limit");
    public By limitTextField = By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTextField[4]");
    public By maxLimitText = By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTextField[5]");
    public By maxLimitToggle = By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeSwitch[2]");
    public By searchedCustomerOnCustomerProfile = By.xpath("//XCUIElementTypeStaticText[@name=\"Test Automation 1234567890 \"]");

    // Gift Card
//    public By recurringAmount = By.xpath("");
    public By recurringAmount = By.id("");
    //    public By beginningAmount = By.xpath("");
    public By beginningAmount = By.id("");
    //    public By giveXactivateMessage = By.xpath("//XCUIElementTypeTextView[@name=\"Cert already active on 2021-09-23\"]");
    public By giveXactivateMessage = By.id("Cert already active on 2021-09-23");
    public By giveXHeader = By.xpath("(//XCUIElementTypeStaticText[@name=\"GiveX\"])[2]");
    public By giftCardScreenTitle = By.xpath("(//XCUIElementTypeStaticText[@name=\"Gift Card\"])[1]");
    //    public By disableGiveX = By.xpath("//XCUIElementTypeStaticText[@name=\"GiveX\"]");
    public By disableGiveX = By.id("GiveX");
    //    public By giftCardDoneButton = By.xpath("//XCUIElementTypeStaticText[@name=\"Done\"]");
    public By giftCardDoneButton = By.id("Done");
    //    public By missingGiftCardNumber = By.xpath("//XCUIElementTypeTextView[@name=\"Enter gift card number\"]");
    public By missingGiftCardNumber = By.id("Enter gift card number");
    //    public By missingChargeAmountWarning = By.xpath("//XCUIElementTypeTextView[@name=\"Enter charge amount\"]");
    public By missingChargeAmountWarning = By.id("Enter charge amount");
    //    public By warningPopupDoneButton = By.xpath("//XCUIElementTypeStaticText[@name=\"Done\"]");
    public By warningPopupDoneButton = By.id("Done");
    public By giftCardChargeAmountText = By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther[4]/XCUIElementTypeOther/XCUIElementTypeTextField");

    //    public By giftCardCancelButton = By.xpath("//XCUIElementTypeStaticText[@name=\"Cancel\"]");
    public By giftCardCancelButton = By.id("Cancel");
    //    public By giftCardChargeBalance = By.xpath("//XCUIElementTypeStaticText[@name=\"10,00\"]");
    public By giftCardChargeBalance = By.id("10,00");
    //    public By giftCardCardNumberText = By.xpath("//XCUIElementTypeButton[@name=\"0000  0000  0000  0000\"]");
    public By giftCardCardNumberText = By.id("0000  0000  0000  0000");
    public By giftCardNumberTextField = By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeTextField");
    //    public By giftCardInactivateText = By.xpath("//XCUIElementTypeTextView[@name=\"Gift card inactivated successfully\"]");
    public By giftCardInactivateText = By.id("Gift card inactivated successfully");
    //    public By inactivateGiftCardDoneButton = By.xpath("//XCUIElementTypeStaticText[@name=\"Done\"]");
    public By inactivateGiftCardDoneButton = By.id("Done");
    //    public By giftCardActivateText = By.xpath("//XCUIElementTypeTextView[@name=\"Gift card activated successfully\"]");
    public By giftCardActivateText = By.id("Gift card activated successfully");
    public By giftCardNumberTextOnCheckOption = By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther[4]");
    public By suspendAccountToggle = By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther[4]/XCUIElementTypeSwitch");
    public By activateAccountToggle = By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther[4]/XCUIElementTypeSwitch");
    //    public By activateAccountToggleText = By.xpath("//XCUIElementTypeStaticText[@name=\"Activate Account\"]");
    public By activateAccountToggleText = By.id("Activate Account");
    public By giftActivateInactivateToggle = By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther[4]/XCUIElementTypeSwitch");
    //    public By suspendAccountToggleText = By.xpath("//XCUIElementTypeStaticText[@name=\"Suspend Account\"]");
    public By suspendAccountToggleText = By.id("Suspend Account");
    //public By giveXCardNumberText = By.xpath("//XCUIElementTypeButton[@name=\"0000  0000  0000  0000\"]");
    public By giveXCardNumberTextOnPayment = By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeTextField");
    //public By giveXChargeAmountText = By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther[4]/XCUIElementTypeOther/XCUIElementTypeTextField");
//    public By recurringBalanceText = By.xpath("//XCUIElementTypeStaticText[@name=\"Recurring Balance :\"]");
    public By recurringBalanceText = By.id("Recurring Balance :");
    //    public By recurringBalanceAmount = By.xpath("//XCUIElementTypeStaticText[@name=\"TL 2.000,00\"]");
    public By recurringBalanceAmount = By.id("TL 2.000,00");
    //    public By recurringBalanceAmountAfterRecharge = By.xpath("//XCUIElementTypeStaticText[@name=\"TL 3.000,00\"]");
    public By recurringBalanceAmountAfterRecharge = By.id("TL 3.000,00");
    //    public By beginningBalanceTex = By.xpath("//XCUIElementTypeStaticText[@name=\"Beginning Balance :\"]");
    public By beginningBalanceTex = By.id("Beginning Balance :");
    public By beginningBalanceAmount = By.xpath("(//XCUIElementTypeStaticText[@name=\"TL 0,00\"])[1]");
    //    public By newRecurringBalanceAmountAfterRecharge = By.xpath("//XCUIElementTypeStaticText[@name=\"TL 3.000,00\"]");
    public By newRecurringBalanceAmountAfterRecharge = By.id("TL 3.000,00");
    public By previousBeginningBalanceAmount = By.xpath("(//XCUIElementTypeStaticText[@name=\"TL 1.256,74\"])[1]");
    //    public By activatedSuccessfullyInfoPopup = By.xpath("//XCUIElementTypeTextView[@name=\"Cert already active on 2021-06-01\"]");
    public By activatedSuccessfullyInfoPopup = By.id("Cert already active on 2021-06-01");
    //    public By enterChargeAmountWarningPopup = By.xpath("//XCUIElementTypeTextView[@name=\"Enter charge amount\"]");
    public By enterChargeAmountWarningPopup = By.id("Enter charge amount");
    //    public By giveXCardNumberTextField = By.xpath("//XCUIElementTypeButton[@name=\"0000  0000  0000  0000\"]");
    public By giveXCardNumberTextField = By.id("0000  0000  0000  0000");


    //Hold Screen
//    public By holdManualOption = By.xpath("//XCUIElementTypeStaticText[@name=\"Manual\"]");
    public By holdManualOption = By.id("Manual");
    //    public By holdManuelDoneButton = By.xpath("//XCUIElementTypeStaticText[@name=\"Done\"]");
    public By holdManuelDoneButton = By.id("Done");

    //Menu Item Page

    public By phoneDeliveryOrderOption = By.id("Delivery");
//    public By phoneDeliveryOrderOption = By.xpath("//XCUIElementTypeStaticText[@name=\"Delivery\"]");

    public By phoneOrderOrderOption = By.id("To Go");
//    public By phoneOrderOrderOption = By.xpath("//XCUIElementTypeStaticText[@name=\"To Go\"]");

    public By barTabOrderOption = By.id("Bar Tab");
//    public By barTabOrderOption = By.xpath("//XCUIElementTypeStaticText[@name=\"Bar Tab\"]");

    public By forHereOrderOption = By.id("For Here");
//    public By forHereOrderOption = By.xpath("//XCUIElementTypeStaticText[@name=\"For Here\"]");


    public By ojCoctailModifier = By.xpath("//XCUIElementTypeStaticText[@name=\"O.J.\"]");

    public By bbqSource = By.id("4 BBQ");
//    public By bbqSource = By.xpath("//XCUIElementTypeStaticText[@name=\"4 BBQ\"]");
    //public By allOptions = By.xpath("//XCUIElementTypeStaticText[@name=\"All\"]\n");

    public By tableLayout = By.id("Table Layout");
//    public By tableLayout = By.xpath("//XCUIElementTypeStaticText[@name=\"Table Layout\"]");

    public By newCheckTab = By.id("New Check");
//    public By newCheckTab = By.xpath("//XCUIElementTypeStaticText[@name=\"New Check\"]");

    public By firstTable = By.id("T20");
//    public By firstTable = By.xpath("//XCUIElementTypeStaticText[@name=\"T1\"]");

    public By secondTable = By.id("T21");
//    public By secondTable = By.xpath("//XCUIElementTypeStaticText[@name=\"T2\"]");

    public By seatNum = By.xpath("(//XCUIElementTypeStaticText[@name=\"1\"])[1]");

    public By continued = By.id("Continue");
//    public By continued = By.xpath("//XCUIElementTypeStaticText[@name=\"Continue\"]");

    public By dineIn = By.id("Dine In");
//    public By dineIn = By.xpath("//XCUIElementTypeStaticText[@name=\"Dine In\"]");

    //public By qsrButton = By.xpath("(//XCUIElementTypeButton[@name=\"QSR\"])[2]");

    public By mergeButton = By.id("Merge");
//    public By mergeButton = By.xpath("//XCUIElementTypeStaticText[@name=\"Merge\"]");

    public By transferButton = By.id("Transfer");
//    public By transferButton = By.xpath("//XCUIElementTypeStaticText[@name=\"Transfer\"]");

    public By transferToTableOption = By.id("Transfer to Table");
//    public By transferToTableOption = By.xpath("/XCUIElementTypeStaticText[@name=\"Transfer to Table\"]");

    public By transferItemOption = By.id("Transfer Item");
//    public By transferItemOption = By.xpath("//XCUIElementTypeStaticText[@name=\"Transfer Item\"]");

    public By transferedFromTable = By.id("Floor 1-T3");
//    public By transferedFromTable = By.xpath("//XCUIElementTypeStaticText[@name=\"Floor 1-T3\"]");

    public By transferedToTable = By.id("Transfer to Table");
//    public By transferedToTable = By.xpath("//XCUIElementTypeStaticText[@name=\"Transfer to Table\"]");

    public By transferToServer = By.id("Transfer to Server");
//    public By transferToServer = By.xpath("//XCUIElementTypeStaticText[@name=\"Transfer to Server\"]");


    public By willBeTransferedCheck = By.xpath("(//XCUIElementTypeStaticText[@name=\"Walkin\"])[5]");

    public By willBeTransferredTable = By.id("Floor 1-T1");
//    public By willBeTransferredTable = By.xpath("//XCUIElementTypeStaticText[@name=\"Floor 1-T1\"]");

    //public By doneButton = By.xpath("//XCUIElementTypeStaticText[@name=\"Done\"]");

    public By mergedChecked = By.id("Linga");
//    public By mergedChecked = By.xpath("//XCUIElementTypeStaticText[@name=\"Linga\"]");

    public By splitButton = By.id("Split");
//    public By splitButton = By.xpath("//XCUIElementTypeStaticText[@name=\"Split\"]");

    public By splitCheckOption = By.id("Split Check");
//    public By splitCheckOption = By.xpath("//XCUIElementTypeStaticText[@name=\"Split Check\"]");

    public By splitBySeatOption = By.id("Split by seat");
//    public By splitBySeatOption = By.xpath("//XCUIElementTypeStaticText[@name=\"Split by seat\"]");

    public By checkFirstItem = By.xpath("(//XCUIElementTypeTable[@name=\"Empty list\"])[7]");
    public By emtyCheck = By.xpath("(//XCUIElementTypeTable[@name=\"Empty list\"])[9]");

    public By saveSplitedCheck = By.id("Save & Close");
//    public By saveSplitedCheck = By.xpath("//XCUIElementTypeStaticText[@name=\"Save & Close\"]");

    public By foodTab = By.id("FOOD");
//    public By foodTab = By.xpath("//XCUIElementTypeStaticText[@name=\"FOOD\"]");

    public By firstMenuItem = By.id("SANDWICHES");

    public By orderButton = By.id("Order");
//    public By orderButton = By.xpath("//XCUIElementTypeStaticText[@name=\"Order\"]");

    public By allButton = By.id("All");
//    public By allButton = By.xpath("//XCUIElementTypeStaticText[@name=\"All\"]");

    //public By cashTab = By.xpath("//XCUIElementTypeStaticText[@name=\"Cash\"]");

    public By optionTab = By.id("Option");
//    public By optionTab = By.xpath("//XCUIElementTypeStaticText[@name=\"Option\"]");

    public By mergedCheckButton = By.id("Merge");
//    public By mergedCheckButton = By.xpath("//XCUIElementTypeImage[@name=\"Merge\"]");

    public By selectTable = By.id("T1");
//    public By selectTable = By.xpath("//XCUIElementTypeStaticText[@name=\"T1\"]");

    public By addSplitCheckButton = By.id("");
//    public By addSplitCheckButton = By.xpath("");

    public By newSplitCheck = By.id("");
//    public By newSplitCheck = By.xpath("");

    public By transferDone = By.id("");
//    public By transferDone = By.xpath("");

    public By successPopup = By.id("Done");
//    public By successPopup = By.xpath("//XCUIElementTypeButton[@name=\"Done\"]");
    //public By payCheckButton = By.xpath("//XCUIElementTypeStaticText[@name=\"Pay Check\"]");

    public By selectPayCheck = By.id("T1");
//    public By selectPayCheck = By.xpath("//XCUIElementTypeStaticText[@name=\"T1\"]");

    public By arrowDown = By.xpath("(//XCUIElementTypeButton[@name=\"arrow down\"])[1]");
    public By firstCategory = By.xpath("(//XCUIElementTypeStaticText[@name=\"FOOD\"])[1]");
    public By firstCategoryOnPopup = By.xpath("(//XCUIElementTypeStaticText[@name=\"FOOD\"])[2]");

    public By addSeat = By.id("ADD");
//    public By addSeat = By.xpath("//XCUIElementTypeButton[@name=\"ADD\"]");

    public By currentSeat = By.id("1");
//    public By currentSeat = By.xpath("//XCUIElementTypeStaticText[@name=\"1\"]");

    public By addedSeat = By.id("2");
//    public By addedSeat = By.xpath("//XCUIElementTypeStaticText[@name=\"2\"]");

    public By customerButton = By.id("New Customer");
//    public By customerButton = By.xpath("//XCUIElementTypeButton[@name=\"New Customer\"]");

    public By addNewCustomer = By.id("Add New");
//    public By addNewCustomer = By.xpath("//XCUIElementTypeStaticText[@name=\"Add New\"]");

    //public By selectedCustomerName = By.xpath("//XCUIElementTypeButton[contains(@name,'Engin')]");

    public By deleteSeat = By.id("edit DeleteSeats");
//    public By deleteSeat = By.xpath("//XCUIElementTypeButton[@name=\"edit DeleteSeats\"]");

    public By editDoneButton = By.id("done DeleteSeats");
//    public By editDoneButton = By.id("done DeleteSeats");

    public By dineInOption = By.id("DINEIN");
//    public By dineInOption = By.xpath("//XCUIElementTypeStaticText[@name=\"DINEIN\"]");
//    public By dineInOption = By.xpath("//XCUIElementTypeStaticText[@name=\"DINEIN\"]");

//    public By dineInOptions = By.xpath("//XCUIElementTypeStaticText[@name=\"DINEIN\"]");

    public By dineInOptions = By.id("DineIn");
//    public By dineInOptions = By.xpath("//XCUIElementTypeStaticText[@name=\"DineIn\"]");

    public By finishButton = By.id("finish");
//    public By finishButton = By.xpath("//XCUIElementTypeStaticText[@name=\"finish\"]");

    public By splitCheckOptionButton = By.id("SPLIT CHECK");
//    public By splitCheckOptionButton = By.xpath("//XCUIElementTypeStaticText[@name=\"SPLIT CHECK\"]");

    public By splitBySeatOptionOnMenuItemPage = By.id("SPLIT BY SEAT");
//    public By splitBySeatOptionOnMenuItemPage = By.xpath("//XCUIElementTypeStaticText[@name=\"SPLIT BY SEAT\"]");

    public By splitButtonOnMenuItem = By.id("Split");
//    public By splitButtonOnMenuItem = By.xpath("//XCUIElementTypeButton[@name=\"Split\"]");

    //    public By paymentButtonOnMenuItemPage = By.id("Payment");
    public By paymentButtonOnMenuItemPage = By.xpath("//XCUIElementTypeStaticText[@name=\"Payment\"]");

    public By voidButton = By.id("Void");
//    public By voidButton = By.xpath("//XCUIElementTypeStaticText[@name=\"Void\"]");

    public By doneVoidInfoPopup = By.id("Done");
//    public By doneVoidInfoPopup = By.xpath("//XCUIElementTypeStaticText[@name=\"Done\"]");

    public By emptyCheck = By.id("empty set detail label");
//    public By emptyCheck = By.xpath("//XCUIElementTypeStaticText[@name=\"empty set detail label\"]");

    public By cashButtonOnMenuItem = By.id("Cash");
//    public By cashButtonOnMenuItem = By.xpath("//XCUIElementTypeButton[@name=\"Cash\"]");

    public By firstSeatOnMenuItem = By.id("1");
//    public By firstSeatOnMenuItem = By.xpath("//XCUIElementTypeStaticText[@name=\"1\"]");


    public By qsrOption = By.xpath("(//XCUIElementTypeStaticText[@name=\"QSR\"])[2]");

    //public By discountOption = By.xpath("//XCUIElementTypeStaticText[@name=\"Discount\"]");

    public By openCheckDiscountAmount = By.id("1,15");
//    public By openCheckDiscountAmount = By.xpath("//XCUIElementTypeStaticText[@name=\"1,15\"]");

    public By openCheckDiscountTitle = By.id("Open Check Discount");
//    public By openCheckDiscountTitle = By.xpath("//XCUIElementTypeStaticText[@name=\"Open Check Discount\"]");

    public By discountAmountForOpenCheck = By.id("0,50");
//    public By discountAmountForOpenCheck = By.xpath("//XCUIElementTypeStaticText[@name=\"0,50\"]");

    public By entreeTitleOnMenuItemPage = By.id("ENTREE");
//    public By entreeTitleOnMenuItemPage = By.id("ENTREE");


    public By emptyCheckPopup = By.id("Order Item Before Paying");

    public By emptyCheckDoneButton = By.id("Done");
//    public By emptyCheckDoneButton = By.xpath("//XCUIElementTypeStaticText[@name=\"Done\"]");

    public By secondSeatOnMenuItem = By.id("2");

    public By firstOrderWithModifier = By.id("Cheesy Bacon Fries");
//    public By firstOrderWithModifier = By.xpath("//XCUIElementTypeStaticText[@name=\"Cheesy Bacon Fries\"]");

    public By modifierDone = By.id("Done");
//    public By modifierDone = By.xpath("//XCUIElementTypeStaticText[@name=\"Done\"]");

    public By modifyButton = By.id("Modify");
//    public By modifyButton = By.xpath("//XCUIElementTypeButton[@name=\"Modify\"]");

    public By selectedOrderWithModifier = By.xpath("(//XCUIElementTypeStaticText[@name=\"Cheesy Bacon Fries \"])[1]");

    public By addedModifier = By.id("Penne");
//    public By addedModifier = By.id("Penne");

    public By maximumCountPopup = By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeTextView");

    public By addMaximumCountModifier = By.id("1/2 Romano");
//    public By addMaximumCountModifier = By.xpath("//XCUIElementTypeStaticText[@name=\"1/2 Romano\"]");

    public By orderedAfterModifyPopup = By.id("Cannot add modifiers, item already send to kitchen");
//    public By orderedAfterModifyPopup = By.id("Cannot add modifiers, item already send to kitchen");

    public By orderedAfterModifyPopupDoneButton = By.id("Done");
//    public By orderedAfterModifyPopupDoneButton = By.xpath("//XCUIElementTypeStaticText[@name=\"Done\"]");

    public By gratuityAmountTitle = By.id("Gratuity");
//    public By gratuityAmountTitle = By.id("Gratuity");

    public By fixGratuityAmount = By.id("TL 99,99");
//    public By fixGratuityAmount = By.id("TL 99,99");

    public By varyingGratuityAmount = By.id("TL 149,99");
//    public By varyingGratuityAmount = By.id("TL 149,99");


    public By subtotalAmount = By.xpath("(//XCUIElementTypeStaticText[@name=\"TL 1.000,00\"])[1]");

    public By totalAmountWithTax = By.id("TL 1.100,00");
//    public By totalAmountWithTax = By.xpath("//XCUIElementTypeStaticText[@name=\"TL 1.200,00\"]");

    public By totalAmountWithoutTax = By.id("TL 999,90");
//    public By totalAmountWithoutTax = By.xpath("//XCUIElementTypeStaticText[@name=\"TL 999,90\"]");

    public By totalAmountWithoutGratuity = By.id("TL 810,01");
//    public By totalAmountWithoutGratuity = By.xpath("//XCUIElementTypeStaticText[@name=\"TL 810,01\"]");

    public By serviceCharge = By.id("Service Charge");
//    public By serviceCharge = By.id("Service Charge");

    public By serviceChargeAmount = By.id("TL 1,00");
//    public By serviceChargeAmount = By.id("TL 1,00");

    public By totalAmountWithServiceCharge = By.id("TL 11,00");
//    public By totalAmountWithServiceCharge = By.id("TL 11,00");

    public By serviceChargeRemoveMessage = By.id("Service Charge removed successfully");
//    public By serviceChargeRemoveMessage = By.id("Service Charge removed successfully");

    public By serviceChargeRemoveDoneButton = By.id("Done");
//    public By serviceChargeRemoveDoneButton = By.xpath("//XCUIElementTypeStaticText[@name=\"Done\"]");

    public By searchItemOption = By.id("Search Item");
//    public By searchItemOption = By.xpath("//XCUIElementTypeStaticText[@name=\"Search Item\"]");

    //public By searchTextBox = By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeTextField");
    public By customerSearchTextBoxForBarTab = By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeTextField");

    public By customerSearchTextBoxDoneButton = By.id("Ok");
//    public By customerSearchTextBoxDoneButton = By.xpath("//XCUIElementTypeStaticText[@name=\"Ok\"]");

    public By searchResultHasMenuItem = By.id("SANDWICHES");
//    public By searchResultHasMenuItem = By.id("SANDWICHES");

    public By searchResultHasNoMenuItem = By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeStaticText");
    public By upchargeWithoutModifierMenuItem = By.xpath("//XCUIElementTypeStaticText[@name=\"SANDWICHES \"]");


    public By upchargeWithoutModifierPrice = By.id("40,00");

    public By upchargeWithModifierMenuItem = By.id("Sandwiches Upcharge Add Modifier");
//    public By upchargeWithModifierMenuItem = By.xpath("//XCUIElementTypeStaticText[@name=\"Sandwiches Upcharge Add Modifier\"]");


    public By upchargeWithModifierPrice = By.id("70,00");

    public By addNewCustomerIcon = By.id("New Customer");
//    public By addNewCustomerIcon = By.xpath("//XCUIElementTypeButton[@name=\"New Customer\"]");

    public By selectedCustomer = By.id("Test Automation");
//    public By selectedCustomer = By.id("//XCUIElementTypeButton[@name=\"Test Automation\"]");

    public By addedCustomer = By.id("Test A");
//    public By addedCustomer = By.id("Test A");

    public By tillManagementButton = By.id("Counting Machine");
//    public By tillManagementButton = By.xpath("//XCUIElementTypeButton[@name=\"Counting Machine\"]");

    public By settingIcon = By.id("Settings 1");
//    public By settingIcon = By.xpath("//XCUIElementTypeButton[@name=\"Settings 1\"]");

    public By operationMenuTitle = By.id("Operation");
//    public By operationMenuTitle = By.xpath("//XCUIElementTypeStaticText[@name=\"Operation\"]");

    public By syncIcon = By.id("Sync");
//    public By syncIcon = By.xpath("//XCUIElementTypeButton[@name=\"Sync\"]");

    public By syncInfo = By.id("Your iPad is up to date");
//    public By syncInfo = By.xpath("//XCUIElementTypeStaticText[@name=\"Your iPad is up to date\"]");


    public By logOffButton = By.id("logOff");

    public By freeMenuItem = By.id("(F) Garlic Bread EACH");
//    public By freeMenuItem = By.xpath("//XCUIElementTypeStaticText[@name=\"(F) Garlic Bread EACH\"]");

    public By openItem = By.id("Test Automation");
//    public By openItem = By.id("Test Automation");

    public By taxName = By.id("Tax");
//    public By taxName = By.xpath("//XCUIElementTypeStaticText[@name=\"Tax\"]");

    public By taxAmount = By.id("TL 2,70");
//    public By taxAmount = By.xpath("//XCUIElementTypeStaticText[@name=\"TL 2,70\"]");

    public By checkBasedAmountTitle = By.id("Check Based Amount");
//    public By checkBasedAmountTitle = By.xpath("//XCUIElementTypeStaticText[@name=\"Check Based Amount\"]");

    public By checkBasedDiscountAmount = By.id("10,00");
//    public By checkBasedDiscountAmount = By.xpath("//XCUIElementTypeStaticText[@name=\"10,00\"]");

    public By checkBasedPercentageTitle = By.id("Check-Based Percentage");
//    public By checkBasedPercentageTitle = By.xpath("//XCUIElementTypeStaticText[@name=\"Check-Based Percentage\"]");

    public By checkBasedDiscountPercentageAmount = By.id("TL 460,00");
//    public By checkBasedDiscountPercentageAmount = By.xpath("//XCUIElementTypeStaticText[@name=\"TL 460,00\"]");

    public By checkBasedFreeTitle = By.id("Check Based Free");
//    public By checkBasedFreeTitle = By.xpath("//XCUIElementTypeStaticText[@name=\"Check Based Free\"]");

    public By checkBasedDiscountFreeAmount = By.id("0,00");
//    public By checkBasedDiscountFreeAmount = By.xpath("//XCUIElementTypeStaticText[@name=\"0,00\"]");

    public By checkBasedSetPriceTitle = By.id("Check Based Set Price");
//    public By checkBasedSetPriceTitle = By.xpath("//XCUIElementTypeStaticText[@name=\"Check Based Set Price\"]");

    public By checkBasedSetPriceAmount = By.id("20,00");
//    public By checkBasedSetPriceAmount = By.xpath("//XCUIElementTypeStaticText[@name=\"20,00\"]");

    public By itemBasedAmountTitle = By.id("ItemBased with Amount");
//    public By itemBasedAmountTitle = By.xpath("//XCUIElementTypeStaticText[@name=\"ItemBased with Amount\"]");

    public By itemBasedAmount = By.id("500,00");
//    public By itemBasedAmount = By.xpath("//XCUIElementTypeStaticText[@name=\"500,00\"]");

    public By itemBasedPercentageTitle = By.id("ItemBased with Percentage");
//    public By itemBasedPercentageTitle = By.xpath("//XCUIElementTypeStaticText[@name=\"ItemBased with Percentage\"]");

    public By itemBasedPercentageText = By.id("IB-AfterTax-Percentage");
//    public By itemBasedPercentageText = By.xpath("//XCUIElementTypeStaticText[@name=\"IB-AfterTax-Percentage\"]");

    public By itemBasedBeforeTaxPercentageText = By.id("IB-BeforeTax-Percentage");
//    public By itemBasedBeforeTaxPercentageText = By.xpath("//XCUIElementTypeStaticText[@name=\"IB-BeforeTax-Percentage\"]");

    public By itemBasedBeforeTaxAmountText = By.id("IB-BeforeTax-Amount");
//    public By itemBasedBeforeTaxAmountText = By.xpath("//XCUIElementTypeStaticText[@name=\"IB-BeforeTax-Amount\"]");

    public By itemBasedPercentageAmount = By.id("3,00");
//    public By itemBasedPercentageAmount = By.xpath("//XCUIElementTypeStaticText[@name=\"3,00\"]");

    public By itemBasedFreeTitle = By.id("Item-Based with Free");
//    public By itemBasedFreeTitle = By.xpath("//XCUIElementTypeStaticText[@name=\"Item-Based with Free\"]");

    public By itemBasedFreeAmount = By.id("0,00");
//    public By itemBasedFreeAmount = By.xpath("//XCUIElementTypeStaticText[@name=\"0,00\"]");

    public By autoDiscountMenuItem = By.id("Little Coke");
//    public By autoDiscountMenuItem = By.xpath("//XCUIElementTypeStaticText[@name=\"Little Coke\"]");

    public By autoDiscountAmountOnList = By.id("400,00");
    //    public By autoDiscountAmountOnList = By.xpath("//XCUIElementTypeStaticText[@name=\"400,00\"]");
    public By autoDiscountAmountOnBill = By.xpath("(//XCUIElementTypeStaticText[@name=\"Discount\"])[1]");
    public By discountAmountForAutoDiscount = By.xpath("(//XCUIElementTypeStaticText[@name=\"TL 400,00\"])[1]");

    public By tableLast = By.id("");
    //    public By tableLast = By.xpath("");
    public By downArrowIcon = By.xpath("(//XCUIElementTypeButton[@name=\"arrow down\"])[1]");

    public By toBeDeletedSeat = By.id("Delete_Seats");
//    public By toBeDeletedSeat = By.xpath("//XCUIElementTypeImage[@name=\"Delete_Seats\"]");

    public By upArrowIcon = By.id("arrow up");
//    public By upArrowIcon = By.xpath("//XCUIElementTypeButton[@name=\"arrow up\"]");

    public By editSeatButton = By.id("edit DeleteSeats");
//    public By editSeatButton = By.xpath("//XCUIElementTypeButton[@name=\"edit DeleteSeats\"]");


    public By taxTitle = By.id("Tax");

    public By inclusiveTaxAmount = By.id("TL 210,11");
//    public By inclusiveTaxAmount = By.xpath("//XCUIElementTypeStaticText[@name=\"TL 210,11\"]");

    public By deliveryOption = By.id("DELIVERY");
//    public By deliveryOption = By.id("DELIVERY");

    public By exclusiveTaxAmount = By.id("TL 210,11");
//    public By exclusiveTaxAmount = By.id("TL 210,11");

    public By quantityTaxAmount = By.id("TL 210,11");
//    public By quantityTaxAmount = By.xpath("//XCUIElementTypeStaticText[@name=\"TL 210,11\"]");

    public By barTabOption = By.id("BarTab");
//    public By barTabOption = By.xpath("//XCUIElementTypeStaticText[@name=\"BarTab\"]");

    public By OverWriteCCOption = By.id("OVERWRITE CC SETTING");
//    public By OverWriteCCOption = By.xpath("//XCUIElementTypeStaticText[@name=\"OVERWRITE CC SETTING\"]");

    public By selectedBarTabOption = By.xpath("(//XCUIElementTypeStaticText[@name=\"BarTab\"])[2]");

    public By newlyAddedCustomer = By.id("Test A");
//    public By newlyAddedCustomer = By.xpath("//XCUIElementTypeButton[@name=\"Test A\"]");

    public By removeCustomerButton = By.id("Remove");
//    public By removeCustomerButton = By.xpath("//XCUIElementTypeStaticText[@name=\"Remove\"]");

    public By existingCustomer = By.xpath("(//XCUIElementTypeStaticText[@name=\"Test Automation\"])[5]");

    public By closeSaleInfoPopUp = By.id("Close your Sale");

    public By syncInfoPopUp = By.id("Please close the sale to sync the data");
//    public By syncInfoPopUp = By.id("Please close the sale to sync the data");

    public By serviceTypeButton = By.xpath("(//XCUIElementTypeButton[@name=\"QSR\"])[2]");
    public By searchCategoryInfoMessage = By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeStaticText");

    public By firstAddedCustomer = By.id("Test Automation");
//    public By firstAddedCustomer = By.id("Test Automation");

    public By selectFirstCustomer = By.id("Test");
//    public By selectFirstCustomer = By.xpath("//XCUIElementTypeButton[@name=\"Test\"]");

    public By firstCustomer = By.id("Test A");
//    public By firstCustomer = By.xpath("//XCUIElementTypeButton[@name=\"Test A\"]");

    public By editedCustomer = By.id("Test");
//    public By editedCustomer = By.xpath("//XCUIElementTypeButton[@name=\"Test\"]");

    public By forHereServiceType = By.id("FORHERE");
//    public By forHereServiceType = By.xpath("//XCUIElementTypeStaticText[@name=\"FORHERE\"]");

    public By selectedForHereServiceType = By.id("FORHERE");
//    public By selectedForHereServiceType = By.xpath("//XCUIElementTypeStaticText[@name=\"FORHERE\"]");

    public By deleteLastSeat = By.id("Delete_Seats");
//    public By deleteLastSeat = By.xpath("//XCUIElementTypeImage[@name=\"Delete_Seats\"]");

    public By lastSeat = By.id("2");
//    public By lastSeat = By.xpath("//XCUIElementTypeStaticText[@name=\"2\"]");

    public By selectedPhoneToGo = By.id("ToGo");
//    public By selectedPhoneToGo = By.xpath("//XCUIElementTypeStaticText[@name=\"ToGo\"]");

    public By selectedPhoneDelivery = By.id("DELIVERY");
//    public By selectedPhoneDelivery = By.xpath("//XCUIElementTypeStaticText[@name=\"DELIVERY\"]");

    public By selectedDelivery = By.id("DELIVERY");
//    public By selectedDelivery = By.xpath("//XCUIElementTypeStaticText[@name=\"DELIVERY\"]");

    public By noSelectedCustomer = By.id("Walkin");
//    public By noSelectedCustomer = By.xpath("//XCUIElementTypeButton[@name=\"Walkin\"]");

    public By firstOrderedMenuItem = By.xpath("//XCUIElementTypeStaticText[@name=\"SANDWICHES \"]");
    public By repeatedMenuItem = By.xpath("(//XCUIElementTypeStaticText[@name=\"SANDWICHES \"])[2]");


    public By quantityOfOrder = By.id("2");
//    public By quantityOfOrder = By.xpath("//XCUIElementTypeStaticText[@name=\"2\"]");

    public By quantityOfOrderAfterDecrease = By.id("1");
//    public By quantityOfOrderAfterDecrease = By.xpath("//XCUIElementTypeStaticText[@name=\"1\"]");

    public By fourthMenuItem = By.id("Fried Crab Cakes");
//    public By fourthMenuItem = By.xpath("//XCUIElementTypeStaticText[@name=\"Fried Crab Cakes\"]");

    public By secondItemThirdModifier = By.id("Wheat Bread");
//    public By secondItemThirdModifier = By.xpath("//XCUIElementTypeStaticText[@name=\"Wheat Bread\"]");


    public By secondOrderThirdModifier = By.xpath("//XCUIElementTypeStaticText[@name=\" Wheat Bread\"]");

    public By emptyOrderList = By.id("empty set title");
//    public By emptyOrderList = By.xpath("//XCUIElementTypeStaticText[@name=\"empty set title\"]");


    public By firstModifierOfFirstItemName = By.xpath("//XCUIElementTypeStaticText[@name=\" 1/2 Romano\"]");

    public By firstModifierOfFirstOrderName = By.id("1/2 Romano");
//    public By firstModifierOfFirstOrderName = By.xpath("//XCUIElementTypeStaticText[@name=\"1/2 Romano\"]");

    public By firstModifierOfThirdMenuItem = By.id("1/2 Romano");
//    public By firstModifierOfThirdMenuItem = By.xpath("//XCUIElementTypeStaticText[@name=\"1/2 Romano\"]");

    public By firstModifierOfFirstItemBalance = By.id("9,00");
//    public By firstModifierOfFirstItemBalance = By.xpath("//XCUIElementTypeStaticText[@name=\"9,00\"]");

    public By firstModifierOfFirstItemAmount = By.xpath("(//XCUIElementTypeStaticText[@name=\"2\"])[1]");
    public By secondModifierOfFirstItemAmount = By.xpath("(//XCUIElementTypeStaticText[@name=\"3\"])[1]");

    public By deleteModifier = By.id("Delete");
//    public By deleteModifier = By.xpath("//XCUIElementTypeStaticText[@name=\"Delete\"]");

    public By removedTaxExempt = By.xpath("(//XCUIElementTypeStaticText[@name=\"TL 0,00\"])[1]");

    public By totalBalanceWithTaxExempt = By.id("TL 33,00");
//    public By totalBalanceWithTaxExempt = By.xpath("//XCUIElementTypeStaticText[@name=\"TL 33,00\"]");

    public By secondMenuItemHasModifier = By.id("Fried Crab Cakes");
//    public By secondMenuItemHasModifier = By.xpath("//XCUIElementTypeStaticText[@name=\"Fried Crab Cakes\"]");

    public By maximumCountText = By.id("You reached the maximum count");
//    public By maximumCountText = By.xpath("//XCUIElementTypeTextView[@name=\"You reached the maximum count\"]");

    public By firstModifierForSecondMenuItem = By.id("RYE BREAD");
//    public By firstModifierForSecondMenuItem = By.xpath("//XCUIElementTypeStaticText[@name=\"RYE BREAD\"]");

    public By addVoidReasonButton = By.id("Add");
//    public By addVoidReasonButton = By.xpath("//XCUIElementTypeStaticText[@name=\"Add\"]");

    public By voidReceiptPrinterDoneButton = By.id("Done");
//    public By voidReceiptPrinterDoneButton = By.xpath("//XCUIElementTypeStaticText[@name=\"Done\"]");


    public By firstOrderMenuItem = By.xpath("//XCUIElementTypeStaticText[@name=\"SANDWICHES \"]");
    public By barTabCustomerNameText = By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeTextField");

    public By BarTabCustomerNameTitle = By.id("Enter the Customer Name");
//    public By BarTabCustomerNameTitle = By.xpath("//XCUIElementTypeStaticText[@name=\"Enter the Customer Name\"]");

    public By thirdMenuItem = By.id("Cheesy Bacon Fries");
//    public By thirdMenuItem = By.xpath("//XCUIElementTypeStaticText[@name=\"Cheesy Bacon Fries\"]");

    public By modifierDoneButton = By.id("Done");
//    public By modifierDoneButton = By.id("Done");

    public By mandatoryWarningPopup = By.id("You need to pick at least 1 modifiers from this Group");
//    public By mandatoryWarningPopup = By.xpath("//XCUIElementTypeTextView[@name=\"You need to pick at least 1 modifiers from this Group\"]");

    public By mandatoryModifierWarningDoneButton = By.id("Done");
//    public By mandatoryModifierWarningDoneButton = By.xpath("//XCUIElementTypeStaticText[@name=\"Done\"]");


    public By fourthMenuItemOrder = By.xpath("//XCUIElementTypeStaticText[@name=\"Fried Crab Cakes \"]");

    public By barTabOrderTypeButton = By.id("Bar Tab");
//    public By barTabOrderTypeButton = By.xpath("//XCUIElementTypeStaticText[@name=\"Bar Tab\"]");

    public By pizzaTab = By.id("PIZZA");
//    public By pizzaTab = By.xpath("//XCUIElementTypeStaticText[@name=\"PIZZA\"]");

    public By thirdModifierOfSecondPizzaMenuItem = By.id("Bacon");
//    public By thirdModifierOfSecondPizzaMenuItem = By.xpath("//XCUIElementTypeStaticText[@name=\"Bacon\"]");

    public By secondModifierPrefix = By.id("Extra");
//    public By secondModifierPrefix = By.xpath("//XCUIElementTypeStaticText[@name=\"Extra\"]");

    public By garlicBread = By.id("Garlic Bread");
//    public By garlicBread = By.xpath("//XCUIElementTypeStaticText[@name=\"Garlic Bread\"]");

    public By optionalModifier = By.id("Well done");
//    public By optionalModifier = By.xpath("//XCUIElementTypeStaticText[@name=\"Well done\"]");

    public By optionalModifierInOrderList = By.xpath("//XCUIElementTypeStaticText[@name=\" WELL DONE\"]");

    public By fifthMenuItemOfFood = By.id("B.I. Wings");
//    public By fifthMenuItemOfFood = By.xpath("//XCUIElementTypeStaticText[@name=\"B.I. Wings\"]");

    public By firstModifierOfFifthMenuItem = By.id("Asparagus");
//    public By firstModifierOfFifthMenuItem = By.xpath("//XCUIElementTypeStaticText[@name=\"Asparagus\"]");


    public By firstModifierOfFifthMenuItemInOrderList = By.xpath("//XCUIElementTypeStaticText[@name=\" Asparagus\"]");
    public By firstModifierOfThirdMenuItemInOrderList = By.xpath("//XCUIElementTypeStaticText[@name=\" 1/2 Romano\"]");

    public By secondMenuItem = By.id("Onion Rings");
//    public By secondMenuItem = By.xpath("//XCUIElementTypeStaticText[@name=\"Onion Rings\"]");


    public By inclusiveTaxAmountForModifier = By.xpath("(//XCUIElementTypeStaticText[@name=\"TL 0,00\"])[1]");

    public By firstModifierPrefixOfSeventhMenuItem = By.id("4 bbq");
//    public By firstModifierPrefixOfSeventhMenuItem = By.xpath("//XCUIElementTypeStaticText[@name=\"4 bbq\"]");

    public By menuItemHasExclusiveTax = By.id("Hot Wings");
//    public By menuItemHasExclusiveTax = By.xpath("//XCUIElementTypeStaticText[@name=\"Hot Wings\"]");

    public By eachOptionForHotWings = By.id("EACH");
//    public By eachOptionForHotWings = By.xpath("//XCUIElementTypeStaticText[@name=\"EACH\"]");

    public By firstModifierForMenuItemHasExclusiveTax = By.id("Anchovy");
//    public By firstModifierForMenuItemHasExclusiveTax = By.xpath("//XCUIElementTypeStaticText[@name=\"Anchovy\"]");

    public By exlusiveTaxAmount = By.id("TL 210,11");
//    public By exlusiveTaxAmount = By.xpath("//XCUIElementTypeStaticText[@name=\"TL 210,11\"]");

    public By noneOptionForFourthMenuItem = By.id("None");
//    public By noneOptionForFourthMenuItem = By.xpath("//XCUIElementTypeStaticText[@name=\"None\"]");

    public By secondMenuItemOfPizza = By.id("Pizza Rucola");
//    public By secondMenuItemOfPizza = By.xpath("//XCUIElementTypeStaticText[@name=\"Pizza Rucola\"]");


    public By firstModifierPrefixOfSeventhMenuItemOnOrderList = By.xpath("//XCUIElementTypeStaticText[@name=\" 4 BBQ\"]");

    public By itemBasedAfterTaxDiscountTitle = By.id("Discount");
    //    public By itemBasedAfterTaxDiscountTitle = By.xpath("//XCUIElementTypeStaticText[@name=\"Discount\"]");
    public By itemBasedAfterTaxDiscountAmount = By.xpath("(//XCUIElementTypeStaticText[@name=\"1.000,00\"])[1]");

    public By BlackBluPizza = By.id("Black and Blu Pizza");
//    public By BlackBluPizza = By.xpath("//XCUIElementTypeStaticText[@name=\"Black and Blu Pizza\"]");

    public By PizzaRomano = By.id("Pizza Romano");
//    public By PizzaRomano = By.xpath("//XCUIElementTypeStaticText[@name=\"Pizza Romano\"]");

    public By PizzaRucola = By.id("Pizza Rucola");
//    public By PizzaRucola = By.xpath("//XCUIElementTypeStaticText[@name=\"Pizza Rucola\"]");

    public By PizzaLasagna = By.id("Pizza Lasagna");
//    public By PizzaLasagna = By.xpath("//XCUIElementTypeStaticText[@name=\"Pizza Lasagna\"]");

    public By checkBasedAfterTaxTitle = By.id("CheckBased-AfterTax");
//    public By checkBasedAfterTaxTitle = By.xpath("//XCUIElementTypeStaticText[@name=\"CheckBased-AfterTax\"]");

    public By checkBasedAfterTaxAmount = By.id("1.000,00");
//    public By checkBasedAfterTaxAmount = By.xpath("//XCUIElementTypeStaticText[@name=\"1.000,00\"]");

    public By itemBasedBeforeTaxTitle = By.id("IB-DiscountBeforeTax");
//    public By itemBasedBeforeTaxTitle = By.xpath("//XCUIElementTypeStaticText[@name=\"IB-DiscountBeforeTax\"]");

    public By itemBasedBeforeTaxAmount = By.xpath("(//XCUIElementTypeStaticText[@name=\"1.000,00\"])[1]");

    public By itemBasedRestrictRoleTitle = By.id("BeforeTaxRoleRestriction");
//    public By itemBasedRestrictRoleTitle = By.xpath("//XCUIElementTypeStaticText[@name=\"BeforeTaxRoleRestriction\"]");

    public By itemBasedRestrictDayAmount = By.id("10,00");
//    public By itemBasedRestrictDayAmount = By.xpath("//XCUIElementTypeStaticText[@name=\"10,00\"]");

    public By itemBasedAfterTaxRestrictRoleTitle = By.id("AfterTax-RoleRestriction");
//    public By itemBasedAfterTaxRestrictRoleTitle = By.xpath("//XCUIElementTypeStaticText[@name=\"AfterTax-RoleRestriction\"]");

    public By itemBasedAfterTaxRestrictRoleAmount = By.id("10,00");
//    public By itemBasedAfterTaxRestrictRoleAmount = By.xpath("//XCUIElementTypeStaticText[@name=\"10,00\"]");

    public By checkBasedAfterTaxOpenItem = By.id("CB-AfterTax-OpenItem");
//    public By checkBasedAfterTaxOpenItem = By.xpath("//XCUIElementTypeStaticText[@name=\"CB-AfterTax-OpenItem\"]");

    public By checkBasedBeforeTaxAutoDiscountText = By.id("CheckBased-BeforeTax-Auto");
//    public By checkBasedBeforeTaxAutoDiscountText = By.xpath("//XCUIElementTypeStaticText[@name=\"CheckBased-BeforeTax-Auto\"]");

    public By totalAmountWithGratuityAmount = By.id("TL 917,99");
//    public By totalAmountWithGratuityAmount = By.xpath("//XCUIElementTypeStaticText[@name=\"TL 917,99\"]");

    public By totalAmountWithoutTaxAndGratuity = By.id("TL 810,01");
//    public By totalAmountWithoutTaxAndGratuity = By.xpath("//XCUIElementTypeStaticText[@name=\"TL 810,01\"]");

    public By onionRings = By.id("Onion Rings");
//    public By onionRings = By.xpath("//XCUIElementTypeStaticText[@name=\"Onion Rings\"]");

    public By cheesePizza = By.id("Cheese Pizza");
//    public By cheesePizza = By.xpath("//XCUIElementTypeStaticText[@name=\"Cheese Pizza\"]");

    public By margarita = By.xpath("//XCUIElementTypeStaticText[@name=\"**Margarita**\"]");

    public By pizzaTomBasil = By.id("Pizza Tom Basil");
//    public By pizzaTomBasil = By.xpath("//XCUIElementTypeStaticText[@name=\"Pizza Tom Basil\"]");

    public By pizzaMel = By.id("Pizza Mel");
//    public By pizzaMel = By.xpath("//XCUIElementTypeStaticText[@name=\"Pizza Mel\"]");

    public By defaultTaxAmountOnPizzaMel = By.id("TL 357,00");
//    public By defaultTaxAmountOnPizzaMel = By.xpath("//XCUIElementTypeStaticText[@name=\"TL 357,00\"]");

    public By quantityBasedTaxAmountOnOnionRings = By.id("TL 25,00");
//    public By quantityBasedTaxAmountOnOnionRings = By.xpath("//XCUIElementTypeStaticText[@name=\"TL 25,00\"]");

    public By inclusiveTaxAmountOnCheesePizza = By.id("TL 120,13");
//    public By inclusiveTaxAmountOnCheesePizza = By.xpath("//XCUIElementTypeStaticText[@name=\"TL 120,13\"]");

    public By checkBasedTaxWithoutSubtotalAmountOnMargarita = By.id("TL 357,00");
//    public By checkBasedTaxWithoutSubtotalAmountOnMargarita = By.xpath("//XCUIElementTypeStaticText[@name=\"TL 357,00\"]");

    public By checkBasedTaxWithSubtotalAmountOnPizzaTomBasili = By.id("TL 487,90");
    //    public By checkBasedTaxWithSubtotalAmountOnPizzaTomBasili = By.xpath("//XCUIElementTypeStaticText[@name=\"TL 487,90\"]");
    public By bigSizeOfTomBasilPizza = By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeCollectionView/XCUIElementTypeCell[3]/XCUIElementTypeStaticText");

    public By californiaPizza = By.id("California Pizza");
//    public By californiaPizza = By.xpath("//XCUIElementTypeStaticText[@name=\"California Pizza\"]");

    public By taxOnItemTaxForInclusiveTaxTextOnPizzaTomBasili = By.id("TL 1,00");
//    public By taxOnItemTaxForInclusiveTaxTextOnPizzaTomBasili = By.xpath("//XCUIElementTypeStaticText[@name=\"TL 1,00\"]");

    public By neapolitanPizza = By.id("Neapolitan Pizza");
//    public By neapolitanPizza = By.xpath("//XCUIElementTypeStaticText[@name=\"Neapolitan Pizza\"]");

    public By taxOnItemTaxForInclusiveTaxTextOnNeapolitanPizza = By.id("TL 210,00");
//    public By taxOnItemTaxForInclusiveTaxTextOnNeapolitanPizza = By.xpath("//XCUIElementTypeStaticText[@name=\"TL 210,00\"]");


    public By discountText = By.xpath("(//XCUIElementTypeStaticText[@name=\"Discount\"])[1]");

    public By itemBasedFreeDiscountBeforeTaxAmount = By.id("TL 500,00");
//    public By itemBasedFreeDiscountBeforeTaxAmount = By.xpath("//XCUIElementTypeStaticText[@name=\"TL 500,00\"]");

    public By checkBasedPercentageDiscountWithAfterTaxAmount = By.id("TL 460,00");
//    public By checkBasedPercentageDiscountWithAfterTaxAmount = By.xpath("//XCUIElementTypeStaticText[@name=\"TL 460,00\"]");

    public By checkBasedPercentageDiscountWithAfterTaxAmountAndFreeItem = By.id("TL 459,99");
//    public By checkBasedPercentageDiscountWithAfterTaxAmountAndFreeItem = By.xpath("//XCUIElementTypeStaticText[@name=\"TL 459,99\"]");

    public By checkBasedAmountDiscountWithAfterTaxAmount = By.id("TL 405,00");
//    public By checkBasedAmountDiscountWithAfterTaxAmount = By.xpath("//XCUIElementTypeStaticText[@name=\"TL 405,00\"]");

    public By checkBasedSetPriceDiscountWithAfterTaxAmount = By.id("TL 990,00");
//    public By checkBasedSetPriceDiscountWithAfterTaxAmount = By.xpath("//XCUIElementTypeStaticText[@name=\"TL 990,00\"]");

    public By checkBasedFreeDiscountAfterTaxAmount = By.id("400,00");
//    public By checkBasedFreeDiscountAfterTaxAmount = By.xpath("//XCUIElementTypeStaticText[@name=\"400,00\"]");

    public By checkBasedAmountDiscountWithBeforeTaxAmount = By.id("TL 410,00");
    //public By checkBasedAmountDiscountWithBeforeTaxAmount = By.xpath("//XCUIElementTypeStaticText[@name=\"TL 410,00\"]");

    public By checkBasedSetPriceDiscountWithBeforeTaxAmount = By.id("TL 995,00");
//    public By checkBasedSetPriceDiscountWithBeforeTaxAmount = By.xpath("//XCUIElementTypeStaticText[@name=\"TL 995,00\"]");

    public By checkBasedFreeDiscountWithBeforeTaxAmount = By.id("0,00");
//    public By checkBasedFreeDiscountWithBeforeTaxAmount = By.xpath("//XCUIElementTypeStaticText[@name=\"0,00\"]");

    public By chickenSchnitzel = By.id("Chicken Schnitzel");
//    public By chickenSchnitzel = By.xpath("//XCUIElementTypeStaticText[@name=\"Chicken Schnitzel\"]");

    public By openCheckDiscountAsAmountAmountOnOrderSide = By.id("128,55");
//    public By openCheckDiscountAsAmountAmountOnOrderSide = By.xpath("//XCUIElementTypeStaticText[@name=\"128,55\"]");

    public By openCheckDiscountAsAmountAmountOnOrderSideForMargarita = By.id("100,05");
//    public By openCheckDiscountAsAmountAmountOnOrderSideForMargarita = By.xpath("//XCUIElementTypeStaticText[@name=\"100,05\"]");

    public By openCheckDiscountAsAmountAmountOnPriceSide = By.id("TL 588,36");
//    public By openCheckDiscountAsAmountAmountOnPriceSide = By.xpath("//XCUIElementTypeStaticText[@name=\"TL 588,36\"]");

    public By openCheckDiscountAsAmountAmountOnPriceSideForMargarita = By.id("TL 1.198,00");
//    public By openCheckDiscountAsAmountAmountOnPriceSideForMargarita = By.xpath("//XCUIElementTypeStaticText[@name=\"TL 1.198,00\"]");

    public By polloParm = By.id("Pollo Parm");
//    public By polloParm = By.xpath("//XCUIElementTypeStaticText[@name=\"Pollo Parm\"]");

    public By sandwiches = By.id("SANDWICHES");
//    public By sandwiches = By.xpath("//XCUIElementTypeStaticText[@name=\"SANDWICHES\"]");

    public By sandwichesTaxAmount = By.id("TL 210,11");
//    public By sandwichesTaxAmount = By.xpath("//XCUIElementTypeStaticText[@name=\"TL 210,11\"]");



    //    public By exlusiveTaxAmountForHotWings = By.xpath("//XCUIElementTypeStaticText[@name=\"TL 122,21\"]");
    public By exlusiveTaxAmountForHotWings = By.id("TL 122,21");
    public By addedLastCustomer = By.xpath("(//XCUIElementTypeStaticText[@name=\"Test Automation\"])[last]");
    //    public By selectedCustomerForBarTab = By.xpath("//XCUIElementTypeButton[@name=\"Test Automation\"]");
    public By selectedCustomerForBarTab = By.id("Test Automation");
    //    public By foodCategoryOption = By.xpath("//XCUIElementTypeStaticText[@name=\"FOOD\"]");
    public By foodCategoryOption = By.id("FOOD");
    public By foodCategoryTitle = By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeStaticText");
    public By deleteAddedSeat = By.xpath("//XCUIElementTypeImage[@name=\"Delete_Seats\"]");
    public By deleteTheSeat = By.xpath("(//XCUIElementTypeStaticText[@name=\"2\"])[2]");
    //    public By deleteAddedSeat = By.id("Delete_Seats");
    //    public By dineInOrderType = By.xpath("//XCUIElementTypeStaticText[@name=\"Dine In\"]");
    public By dineInOrderType = By.id("Dine In");
    public By wellDoneOptionalModifierOnOrderList = By.xpath("//XCUIElementTypeStaticText[@name=\" WELL DONE\"]");
    //    public By wellDoneOptionalModifier = By.xpath("//XCUIElementTypeStaticText[@name=\"WELL DONE\"]");
    public By wellDoneOptionalModifier = By.id("WELL DONE");
    //    public By extraPrefixForAnchovyModifier = By.xpath("//XCUIElementTypeStaticText[@name=\"Extra\"]");
    public By extraPrefixForAnchovyModifier = By.id("Extra");
    //    public By extraPrefixForAnchovyModifierOnOrderList = By.xpath("//XCUIElementTypeStaticText[@name=\"Extra Anchovy\"]");
    public By extraPrefixForAnchovyModifierOnOrderList = By.id("Extra Anchovy");
    //    public By taxAmountForSandwiches = By.xpath("//XCUIElementTypeStaticText[@name=\"TL 1.200,00\"]");
    public By taxAmountForSandwiches = By.id("TL 1.100,00");
    //    public By itemBasedDiscountAfterTaxPercentageAmountOnOrderList = By.xpath("//XCUIElementTypeStaticText[@name=\"99,99\"]");
    public By itemBasedDiscountAfterTaxPercentageAmountOnOrderList = By.id("99,99");
    //    public By dietCokeFreeMenuItemWithSandwiches = By.xpath("//XCUIElementTypeStaticText[@name=\"(F) Diet Coke EACH\"]");
    public By dietCokeFreeMenuItemWithSandwiches = By.id("(F) Diet Coke EACH");
    //    public By freeMenuItemAmountWithSandwiches = By.xpath("//XCUIElementTypeStaticText[@name=\"TL 599,90\"]");
    public By freeMenuItemAmountWithSandwiches = By.id("TL 599,90");
    //    public By freeMenuItemAmountWithSandwich = By.xpath("//XCUIElementTypeStaticText[@name=\"TL 629,90\"]");
    public By freeMenuItemAmountWithSandwich = By.id("TL 629,90");
    //    public By tunaTacosFreeMenuItemWithSandwiches = By.xpath("//XCUIElementTypeStaticText[@name=\"(F) Tuna Tacos EACH\"]");
    public By tunaTacosFreeMenuItemWithSandwiches = By.id("(F) Tuna Tacos EACH");
    //    public By beforeTaxAsSetPriceForSandwiches = By.xpath("//XCUIElementTypeStaticText[@name=\"IB-BeforeTax-SetPrice\"]");
    public By beforeTaxAsSetPriceForSandwiches = By.id("IB-BeforeTax-SetPrice");
    //    public By beforeTaxAsSetPriceAmountForSandwiches = By.xpath("//XCUIElementTypeStaticText[@name=\"TL 1.200,00\"]");
    public By beforeTaxAsSetPriceAmountForSandwiches = By.id("TL 1.200,00");
    //    public By checkBasedAfterTaxPercentageWithSandwiches = By.xpath("//XCUIElementTypeStaticText[@name=\"CB-PercentageAfterTax\"]");
    public By checkBasedAfterTaxPercentageWithSandwiches = By.id("CB-PercentageAfterTax");
    //    public By checkBasedAfterTaxAsPercentageAmountForSandwiches = By.xpath("//XCUIElementTypeStaticText[@name=\"TL 100,00\"]");
    public By checkBasedAfterTaxAsPercentageAmountForSandwiches = By.id("TL 100,00");
    //    public By checkBasedAfterTaxAsPercentageAmountForSandwiches1 = By.xpath("//XCUIElementTypeStaticText[@name=\"99,99\"]");
    public By checkBasedAfterTaxAsPercentageAmountForSandwiches1 = By.id("99,99");
    //    public By checkBasedAfterTaxAsPercentageAmountForSandwich = By.xpath("//XCUIElementTypeStaticText[@name=\"TL 99,99\"]");
    public By checkBasedAfterTaxAsPercentageAmountForSandwich = By.id("TL 99,99");
    //    public By checkBasedBeforeTaxPercentageWithSandwiches = By.xpath("//XCUIElementTypeStaticText[@name=\"CB-PercentageBeforeTax\"]");
    public By checkBasedBeforeTaxPercentageWithSandwiches = By.id("CB-PercentageBeforeTax");
    //    public By checkBasedBeforeTaxAsPercentageAmountForSandwiches = By.xpath("//XCUIElementTypeStaticText[@name=\"100,00\"]");
    public By checkBasedBeforeTaxAsPercentageAmountForSandwiches = By.id("100,00");
    //    public By checkBasedBeforeTaxAmountWithSandwiches = By.xpath("//XCUIElementTypeStaticText[@name=\"CB-AmountBeforeTax\"]");
    public By checkBasedBeforeTaxAmountWithSandwiches = By.id("CB-AmountBeforeTax");
    //    public By checkBasedBeforeTaxAsAmountForSandwichesAmount = By.xpath("//XCUIElementTypeStaticText[@name=\"5,00\"]");
    public By checkBasedBeforeTaxAsAmountForSandwichesAmount = By.id("5,00");
    //    public By checkBasedAfterTaxSetPriceWithSandwiches = By.xpath("//XCUIElementTypeStaticText[@name=\"CB-AfterTax-SetPrice\"]");
    public By checkBasedAfterTaxSetPriceWithSandwiches = By.id("CB-AfterTax-SetPrice");
    //    public By checkBasedAfterTaxSetPriceAmountWithSandwiches = By.xpath("//XCUIElementTypeStaticText[@name=\"970,00\"]");
    public By checkBasedAfterTaxSetPriceAmountWithSandwiches = By.id("970,00");
    //    public By checkBasedBeforeTaxSetPriceWithSandwiches = By.xpath("//XCUIElementTypeStaticText[@name=\"CB-BeforeTax-SetPrice\"]");
    public By checkBasedBeforeTaxSetPriceWithSandwiches = By.id("CB-BeforeTax-SetPrice");
    //    public By checkBasedBeforeTaxSetPriceAmountWithSandwiches = By.xpath("//XCUIElementTypeStaticText[@name=\"970,00\"]");
    public By checkBasedBeforeTaxSetPriceAmountWithSandwiches = By.id("970,00");
    //    public By checkBasedAfterTaxAsAmountWithSandwiches = By.xpath("//XCUIElementTypeStaticText[@name=\"CheckBasedAmountAfterTax\"]");
    public By checkBasedAfterTaxAsAmountWithSandwiches = By.id("CheckBasedAmountAfterTax");
    //    public By checkBasedAfterTaxAmountAsAmountWithSandwiches = By.xpath("//XCUIElementTypeStaticText[@name=\"5,00\"]");
    public By checkBasedAfterTaxAmountAsAmountWithSandwiches = By.id("5,00");
    //    public By checkBasedAfterTaxAsFreeItemWithSandwiches = By.xpath("//XCUIElementTypeStaticText[@name=\"CB-AfterTax-FreeItem\"]");
    public By checkBasedAfterTaxAsFreeItemWithSandwiches = By.id("CB-AfterTax-FreeItem");
    //    public By checkBasedAfterTaxAmountAsFreeItemWithSandwiches = By.xpath("//XCUIElementTypeStaticText[@name=\"0,00\"]");
    public By checkBasedAfterTaxAmountAsFreeItemWithSandwiches = By.id("0,00");
    //    public By checkBasedAfterTaxAsFreeItemMenuItemWithSandwiches = By.xpath("//XCUIElementTypeStaticText[@name=\"(F) Little Coke EACH\"]");
    public By checkBasedAfterTaxAsFreeItemMenuItemWithSandwiches = By.id("(F) Little Coke EACH");
    //    public By checkBasedBeforeTaxAsFreeItemWithSandwiches = By.xpath("//XCUIElementTypeStaticText[@name=\"CB-BeforeTax-FreeItem\"]");
    public By checkBasedBeforeTaxAsFreeItemWithSandwiches = By.id("CB-BeforeTax-FreeItem");
    //    public By checkBasedBeforeTaxAmountAsFreeItemWithSandwiches = By.xpath("//XCUIElementTypeStaticText[@name=\"0,00\"]");
    public By checkBasedBeforeTaxAmountAsFreeItemWithSandwiches = By.id("0,00");
    //    public By checkBasedBeforeTaxAsFreeItemMenuItemWithSandwiches = By.xpath("//XCUIElementTypeStaticText[@name=\"(F) Little Coke EACH\"]");
    public By checkBasedBeforeTaxAsFreeItemMenuItemWithSandwiches = By.id("(F) Little Coke EACH");
    //    public By openCheckDiscountText = By.xpath("//XCUIElementTypeStaticText[@name=\"Open Check Discount\"]");
    public By openCheckDiscountText = By.id("Open Check Discount");


    public By openCheckDiscountWithAfterTaxAsAmountForPolloParm = By.id("120,00");
//    public By openCheckDiscountWithAfterTaxAsAmountForPolloParm = By.xpath("//XCUIElementTypeStaticText[@name=\"120,00\"]");

    public By openCheckDiscountWithBeforeTaxAsAmountForPolloParm = By.id("TL 1.097,75");
//    public By openCheckDiscountWithBeforeTaxAsAmountForPolloParm = By.xpath("//XCUIElementTypeStaticText[@name=\"TL 1.097,75\"]");

    public By openCheckDiscountWithBeforeTaxAsAmountForMargarita = By.id("120,05");
    //    public By openCheckDiscountWithBeforeTaxAsAmountForMargarita = By.xpath("//XCUIElementTypeStaticText[@name=\"120,05\"]");

    public By openCheckDiscountWithAfterTaxAsNonDecimalAmountForPolloParm = By.id("120,05");
//    public By openCheckDiscountWithAfterTaxAsNonDecimalAmountForPolloParm = By.xpath("//XCUIElementTypeStaticText[@name=\"120,05\"]");

    public By openCheckDiscountWithAfterTaxAsNonDecimalAmountForMargarita = By.id("TL 1.099,00");
//    public By openCheckDiscountWithAfterTaxAsNonDecimalAmountForMargarita = By.xpath("//XCUIElementTypeStaticText[@name=\"TL 1.101,00\"]");

    public By openCheckDiscountWithAfterTaxAsNonDecimalAmountForMargaritaForDecimalValue = By.id("TL 1.098,95");
//    public By openCheckDiscountWithAfterTaxAsNonDecimalAmountForMargaritaForDecimalValue = By.xpath("//XCUIElementTypeStaticText[@name=\"TL 1.098,95\"]");

    public By upchargeSandwiches = By.id("Sandwiches Upcharge Add Modifier");
//    public By upchargeSandwiches = By.xpath("//XCUIElementTypeStaticText[@name=\"Sandwiches Upcharge Add Modifier\"]");

    public By totalAmountWithoutTaxForUpchargeSandwiches = By.id("TL 12,00");
    //public By totalAmountWithoutTaxForUpchargeSandwiches = By.xpath("//XCUIElementTypeStaticText[@name=\"TL 12,00\"]");

    public By menuItemListTitle = By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeStaticText");

    public By subtotalAmountWithTaxExempt = By.id("TL 999,90");
//    public By subtotalAmountWithTaxExempt = By.xpath("//XCUIElementTypeStaticText[@name=\"TL 999,90\"]");

    public By totalAmountWithTaxExempt = By.id("TL 999,90");
//    public By totalAmountWithTaxExempt = By.xpath("//XCUIElementTypeStaticText[@name=\"TL 999,90\"]");

    public By itemBasedDiscountAfterTaxWithPercentage = By.id("IB-AfterTax-Percentage");
//    public By itemBasedDiscountAfterTaxWithPercentage = By.xpath("//XCUIElementTypeStaticText[@name=\"IB-AfterTax-Percentage\"]");


    //public By itemBasedDiscountBeforeTaxWithPercentage = By.xpath("//XCUIElementTypeStaticText[@name=\"IB-BeforeTax-Percentage\"]");
//    public By itemBasedAfterTaxAsPercentageDiscountAmountForSandwiches = By.xpath("//XCUIElementTypeStaticText[@name=\"TL 555,01\"]");
    public By itemBasedAfterTaxAsPercentageDiscountAmountForSandwiches = By.id("TL 555,01");
    //    public By itemBasedBeforeTaxAsPercentageDiscountAmountForSandwiches = By.xpath("//XCUIElementTypeStaticText[@name=\"TL 14,00\"]");
    public By itemBasedBeforeTaxAsPercentageDiscountAmountForSandwiches = By.id("TL 14,00");
    //    public By itemBasedBeforeTaxAsPercentageDiscountAmountForMargarita = By.xpath("//XCUIElementTypeStaticText[@name=\"TL 100,00\"]");
    public By itemBasedBeforeTaxAsPercentageDiscountAmountForMargarita = By.id("TL 100,00");
    //public By itemBasedDiscountBeforeTaxWithAmount = By.xpath("//XCUIElementTypeStaticText[@name=\"IB-BeforeTax-Amount\"]");
//    public By itemBasedDiscountAfterTaxWithAmounts = By.xpath("//XCUIElementTypeStaticText[@name=\"IB-AfterTax-Amount\"]");
    public By itemBasedDiscountAfterTaxWithAmounts = By.id("IB-AfterTax-Amount");
    //    public By itemBasedBeforeTaxAsAmountDiscountAmountForSandwiches = By.xpath("//XCUIElementTypeStaticText[@name=\"TL 1.000,00\"]");
    public By itemBasedBeforeTaxAsAmountDiscountAmountForSandwiches = By.id("TL 1.000,00");
    //    public By itemBasedDiscountBeforeTaxWithAmountForSandwiches = By.xpath("//XCUIElementTypeStaticText[@name=\"TL 1.569,11\"]");
    public By itemBasedDiscountBeforeTaxWithAmountForSandwiches = By.id("TL 1.569,11");
    //public By itemBasedDiscountAfterTaxWithAmount = By.xpath("//XCUIElementTypeStaticText[@name=\"IB-DiscountAfterTax\"]");
//    public By itemBasedAfterTaxWithAmount = By.xpath("//XCUIElementTypeStaticText[@name=\"IB-AfterTax-Amount\"]");
    public By itemBasedAfterTaxWithAmount = By.id("IB-AfterTax-Amount");
    //    public By itemBasedAfterTaxAsAmountDiscountAmountForSandwiches = By.xpath("//XCUIElementTypeStaticText[@name=\"TL 1.400,00\"]");
    public By itemBasedAfterTaxAsAmountDiscountAmountForSandwiches = By.id("TL 1.400,00");
    //    public By itemBasedDiscountAfterTaxSetPrice = By.xpath("//XCUIElementTypeStaticText[@name=\"IB-AfterTax-SetPrice\"]");
    public By itemBasedDiscountAfterTaxSetPrice = By.id("IB-AfterTax-SetPrice");
    //    public By itemBasedAfterTaxAsSetPriceDiscountAmountForSandwiches = By.xpath("//XCUIElementTypeStaticText[@name=\"TL 20,00\"]");
    public By itemBasedAfterTaxAsSetPriceDiscountAmountForSandwiches = By.id("TL 20,00");
    //    public By itemBasedDiscountBeforeTaxSetPrice = By.xpath("//XCUIElementTypeStaticText[@name=\"IB-BeforeTax-SetPrice\"]");
    public By itemBasedDiscountBeforeTaxSetPrice = By.id("IB-BeforeTax-SetPrice");
    //    public By itemBasedBeforeTaxAsSetPriceDiscountAmountForSandwiches = By.xpath("//XCUIElementTypeStaticText[@name=\"TL 20,00\"]");
    public By itemBasedBeforeTaxAsSetPriceDiscountAmountForSandwiches = By.id("TL 20,00");
    //    public By customerNameOkButton = By.xpath("//XCUIElementTypeStaticText[@name=\"Ok\"]");
    public By customerNameOkButton = By.id("Ok");
    //    public By itemBasedAfterTaxAsSetPriceDiscountAmountForChickenSchnitzel = By.xpath("//XCUIElementTypeStaticText[@name=\"TL 400,00\"]");
    public By itemBasedAfterTaxAsSetPriceDiscountAmountForChickenSchnitzel = By.id("TL 400,00");
    //    public By itemBasedBeforeTaxAsSetPriceDiscountAmountForChickenSchnitzel = By.xpath("//XCUIElementTypeStaticText[@name=\"TL 20,00\"]");
    public By itemBasedBeforeTaxAsSetPriceDiscountAmountForChickenSchnitzel = By.id("TL 20,00");
    //    public By voidCheckInfo = By.xpath("//XCUIElementTypeTextView[@name=\"All orders are voided\"]");
    public By voidCheckInfo = By.id("All orders are voided");
    //    public By closeVoidCheckInfoPopup = By.xpath("//XCUIElementTypeStaticText[@name=\"Done\"]");
    public By closeVoidCheckInfoPopup = By.id("Done");
    public By firstOrderOnSeatOne = By.xpath("(//XCUIElementTypeStaticText[@name=\"SANDWICHES \"])[1]");
    //    public By seatOne = By.xpath("//XCUIElementTypeStaticText[@name=\"Seat 1\"]");
    public By seatOne = By.id("Seat 1");
    //    public By seatTwo = By.xpath("//XCUIElementTypeStaticText[@name=\"Seat 2\"]");
    public By seatTwo = By.id("Seat 2");
    public By splitedOrderPrice = By.xpath("(//XCUIElementTypeStaticText[@name=\"15,00\"])[1]");
    //    public By totalPriceOfSplitedOrder = By.xpath("//XCUIElementTypeStaticText[@name=\"TL 33,00\"]");
    public By totalPriceOfSplitedOrder = By.id("TL 33,00");
    //    public By openItemPriceTitle = By.xpath("//XCUIElementTypeStaticText[@name=\"Test Automation\"]");
    public By openItemPriceTitle = By.id("Test Automation");
    //    public By openItemPriceAsDecimal = By.xpath("//XCUIElementTypeStaticText[@name=\"0,01\"]");
    public By openItemPriceAsDecimal = By.id("0,01");
    //public By openItemPrice = By.xpath("//XCUIElementTypeStaticText[@name=\"10,05\"]");
//    public By beforeTaxRoleRestrictionOnMenuItemPage = By.xpath("//XCUIElementTypeStaticText[@name=\"BeforeTaxRoleRestriction\"]");
    public By beforeTaxRoleRestrictionOnMenuItemPage = By.id("BeforeTaxRoleRestriction");
    //    public By beforeTaxRoleRestrictionPrice = By.xpath("//XCUIElementTypeStaticText[@name=\"100,00\"]");
    public By beforeTaxRoleRestrictionPrice = By.id("100,00");
    //    public By varyingGratuityDiscountPriceForSandwiches = By.xpath("//XCUIElementTypeStaticText[@name=\"TL 99,99\"]");
    public By varyingGratuityDiscountPriceForSandwiches = By.id("TL 99,99");
    //    public By subTotalTitle = By.xpath("//XCUIElementTypeStaticText[@name=\"Subtotal\"]");
    public By subTotalTitle = By.id("Subtotal");
    //    public By subTotalPriceWithVaryingGratuityForSandwiches = By.xpath("//XCUIElementTypeStaticText[@name=\"TL 1.000,00\"]");
    public By subTotalPriceWithVaryingGratuityForSandwiches = By.id("TL 1.000,00");
    //    public By totalTitle = By.xpath("//XCUIElementTypeStaticText[@name=\"Total\"]");
    public By totalTitle = By.id("Total");
    //    public By totalPriceWithVaryingGratuityForSandwiches = By.xpath("//XCUIElementTypeStaticText[@name=\"TL 1.299,99\"]");
    public By totalPriceWithVaryingGratuityForSandwiches = By.id("TL 1.299,99");
    //    public By totalPriceOfItemBasedDiscountAfterTaxAsPercentageWithTaxExemptForSandwiches = By.xpath("//XCUIElementTypeStaticText[@name=\"TL 499,91\"]");
    public By totalPriceOfItemBasedDiscountAfterTaxAsPercentageWithTaxExemptForSandwiches = By.id("TL 499,91");
    //    public By totalPriceOfItemBasedDiscountBeforeTaxAsPercentageWithTaxExemptForSandwiches = By.xpath("//XCUIElementTypeStaticText[@name=\"TL 499,90\"]");
    public By totalPriceOfItemBasedDiscountBeforeTaxAsPercentageWithTaxExemptForSandwiches = By.id("TL 499,90");
    //    public By totalPriceOfItemBasedDiscountAfterTaxAsAmountWithTaxExemptForSandwiches = By.xpath("//XCUIElementTypeStaticText[@name=\"TL 599,30\"]");
    public By totalPriceOfItemBasedDiscountAfterTaxAsAmountWithTaxExemptForSandwiches = By.id("TL 599,30");
    //    public By totalPriceOfItemBasedDiscountBeforeTaxAsAmountWithTaxExemptForSandwiches = By.xpath("//XCUIElementTypeStaticText[@name=\"TL 539,90\"]");
    public By totalPriceOfItemBasedDiscountBeforeTaxAsAmountWithTaxExemptForSandwiches = By.id("TL 539,90");
    //    public By totalPriceOfItemBasedDiscountAfterTaxAsSetPriceWithTaxExemptForSandwiches = By.xpath("//XCUIElementTypeStaticText[@name=\"TL 169,90\"]");
    public By totalPriceOfItemBasedDiscountAfterTaxAsSetPriceWithTaxExemptForSandwiches = By.id("TL 169,90");
    //    public By totalPriceOfItemBasedDiscountBeforeTaxAsSetPriceWithTaxExemptForSandwiches = By.xpath("//XCUIElementTypeStaticText[@name=\"TL 99,90\"]");
    public By totalPriceOfItemBasedDiscountBeforeTaxAsSetPriceWithTaxExemptForSandwiches = By.id("TL 99,90");
    //    public By fixGratuityAmountPrice = By.xpath("//XCUIElementTypeStaticText[@name=\"TL 99,99\"]");
    public By fixGratuityAmountPrice = By.id("TL 99,99");
    //    public By subTotalPriceWithFixGratuityForSandwiches = By.xpath("//XCUIElementTypeStaticText[@name=\"TL 1.000,00\"]");
    public By subTotalPriceWithFixGratuityForSandwiches = By.id("TL 1.000,00");
    //    public By totalPriceWithFixGratuityForSandwiches = By.xpath("//XCUIElementTypeStaticText[@name=\"TL 1.299,99\"]");
    public By totalPriceWithFixGratuityForSandwiches = By.id("TL 1.299,99");
    //    public By addNewCustomerButton = By.xpath("//XCUIElementTypeStaticText[@name=\"Add New\"]");
    public By addNewCustomerButton = By.id("Add New");
    //    public By splitNotAllowPaymentPopupText = By.xpath("//XCUIElementTypeTextView[@name=\"Split is not allowed, payment(s) has been made in this check\"]");
    public By splitNotAllowPaymentPopupText = By.id("Split is not allowed, payment(s) has been made in this check");





    // Nov 24 start

    //public By giveXCardNumberOnMenuItemPage = By.xpath("//XCUIElementTypeStaticText[@name=\"GCX-603628394562001380850 \"]");
//    public By giveXAmountOnMenuItemPage = By.xpath("//XCUIElementTypeStaticText[@name=\"1.000,00\"]");
    public By giveXAmountOnMenuItemPage = By.id("1.000,00");

    //    public By giveXRechargeAmountOnMenuItemPage = By.xpath("//XCUIElementTypeStaticText[@name=\"500,00\"]");
    public By giveXRechargeAmountOnMenuItemPage = By.id("500,00");

    //    public By tunaTacosMenuItem = By.xpath("//XCUIElementTypeStaticText[@name=\"Tuna Tacos\"]");
    public By tunaTacosMenuItem = By.id("Tuna Tacos");

    //    public By giveXRechargeSuccessPopup = By.xpath("//XCUIElementTypeStaticText[@name=\"GiveX\"]");
    public By giveXRechargeSuccessPopup = By.id("GiveX");

    //    public By giveXRechargeSuccessPopupInfo = By.xpath("//XCUIElementTypeTextView[@name=\"Recharge Success\"]");
    public By giveXRechargeSuccessPopupInfo = By.id("Recharge Success");

    //    public By parmesanModifier = By.xpath("//XCUIElementTypeStaticText[@name=\"Parmesan\"]");
    public By parmesanModifier = By.id("Parmesan");

    //    public By itemBasedAfterTaxAsAmountText = By.xpath("//XCUIElementTypeStaticText[@name=\"IB-AfterTax-Amount\"]");
    public By itemBasedAfterTaxAsAmountText = By.id("IB-AfterTax-Amount");

    //    public By itemBasedAfterTaxAsAmountPrice = By.xpath("//XCUIElementTypeStaticText[@name=\"170,00\"]");
    public By itemBasedAfterTaxAsAmountPrice = By.id("170,00");

    //    public By brushettaMenuItem = By.xpath("//XCUIElementTypeStaticText[@name=\"BRUSHETTA\"]");
    public By brushettaMenuItem = By.id("BRUSHETTA");

    //    public By drinksCategory = By.xpath("//XCUIElementTypeStaticText[@name=\"DRINKS\"]");
    public By drinksCategory = By.id("DRINKS");

    //    public By cocktailMenuItem = By.xpath("//XCUIElementTypeStaticText[@name=\"COCKTAIL\"]");
    public By cocktailMenuItem = By.id("COCKTAIL");

    //    public By serviceChargeText = By.xpath("//XCUIElementTypeStaticText[@name=\"Service Charge\"]");
    public By serviceChargeText = By.id("Service Charge");

    //    public By serviceChargeAmountPrice = By.xpath("//XCUIElementTypeStaticText[@name=\"TL 9,00\"]");
    public By serviceChargeAmountPrice = By.id("TL 9,00");

    //    public By itemBasedDiscountAsPercentageAmountForBruchetta = By.xpath("//XCUIElementTypeStaticText[@name=\"50,00\"]");
    public By itemBasedDiscountAsPercentageAmountForBruchetta = By.id("50,00");

    //    public By itemBasedDiscountAsPercentageTitle = By.xpath("//XCUIElementTypeStaticText[@name=\"IB-AfterTax-Percentage\"]");
    public By itemBasedDiscountAsPercentageTitle = By.id("IB-AfterTax-Percentage");

    //    public By itemBasedBeforeTaxAsPercentageTitle = By.xpath("//XCUIElementTypeStaticText[@name=\"IB-BeforeTax-Percentage\"]");
    public By itemBasedBeforeTaxAsPercentageTitle = By.id("IB-BeforeTax-Percentage");

    //    public By itemBasedDiscountAsAmountPriceForBruchetta = By.xpath("//XCUIElementTypeStaticText[@name=\"170,00\"]");
    public By itemBasedDiscountAsAmountPriceForBruchetta = By.id("170,00");

    //    public By itemBasedAfterTaxAsSetPriceTitle = By.xpath("//XCUIElementTypeStaticText[@name=\"IB-AfterTax-SetPrice\"]");
    public By itemBasedAfterTaxAsSetPriceTitle = By.id("IB-AfterTax-SetPrice");

    //    public By itemBasedBeforeTaxAmountTitle = By.xpath("//XCUIElementTypeStaticText[@name=\"IB-BeforeTax-Amount\"]");
    public By itemBasedBeforeTaxAmountTitle = By.id("IB-BeforeTax-Amount");

    //    public By itemBasedDiscountAsSetPriceAmountForBruchetta = By.xpath("//XCUIElementTypeStaticText[@name=\"400,00\"]");
    public By itemBasedDiscountAsSetPriceAmountForBruchetta = By.id("400,00");

    //    public By itemBasedAfterTaxAsFreeItemTitle = By.xpath("//XCUIElementTypeStaticText[@name=\"IB-AfterTax-FreeItem\"]");
    public By itemBasedAfterTaxAsFreeItemTitle = By.id("IB-AfterTax-FreeItem");

    //    public By itemBasedBeforeTaxAsFreeItemTitle = By.xpath("//XCUIElementTypeStaticText[@name=\"IB-BeforeTax-FreeItem\"]");
    public By itemBasedBeforeTaxAsFreeItemTitle = By.id("IB-BeforeTax-FreeItem");

    //    public By itemBasedBeforeTaxAsSetPriceTitle = By.xpath("//XCUIElementTypeStaticText[@name=\"IB-BeforeTax-SetPrice\"]");
    public By itemBasedBeforeTaxAsSetPriceTitle = By.id("IB-BeforeTax-SetPrice");

    //    public By itemBasedDiscountAsFreeItemPriceForBruchetta = By.xpath("//XCUIElementTypeStaticText[@name=\"0,00\"]");
    public By itemBasedDiscountAsFreeItemPriceForBruchetta = By.id("0,00");

    //    public By itemBasedDiscountPriceForSetPriceForBruchetta = By.xpath("//XCUIElementTypeStaticText[@name=\"400,00\"]");
    public By itemBasedDiscountPriceForSetPriceForBruchetta = By.id("400,00");

    //    public By checkBasedPercentageAfterTaxTitle = By.xpath("//XCUIElementTypeStaticText[@name=\"CB-PercentageAfterTax\"]");
    public By checkBasedPercentageAfterTaxTitle = By.id("CB-PercentageAfterTax");

    //    public By checkBasedPercentageAfterTaxForBruchetta = By.xpath("//XCUIElementTypeStaticText[@name=\"50,00\"]");
    public By checkBasedPercentageAfterTaxForBruchetta = By.id("50,00");

    //    public By checkBasedAmountAfterTaxTitle = By.xpath("//XCUIElementTypeStaticText[@name=\"CheckBasedAmountAfterTax\"]");
    public By checkBasedAmountAfterTaxTitle = By.id("CheckBasedAmountAfterTax");

    //    public By checkBasedAmountAfterTaxForBruchetta = By.xpath("//XCUIElementTypeStaticText[@name=\"5,00\"]");
    public By checkBasedAmountAfterTaxForBruchetta = By.id("5,00");

    //    public By checkBasedAfterTaxAsSetPriceTitle = By.xpath("//XCUIElementTypeStaticText[@name=\"CB-AfterTax-SetPrice\"]");
    public By checkBasedAfterTaxAsSetPriceTitle = By.id("CB-AfterTax-SetPrice");

    //    public By checkBasedAfterTaxWithSetPriceAmountForBruchetta = By.xpath("//XCUIElementTypeStaticText[@name=\"470,00\"]");
    public By checkBasedAfterTaxWithSetPriceAmountForBruchetta = By.id("470,00");

    //    public By checkBasedAfterTaxWithFreeItemTitle = By.xpath("//XCUIElementTypeStaticText[@name=\"CB-AfterTax-FreeItem\"]");
    public By checkBasedAfterTaxWithFreeItemTitle = By.id("CB-AfterTax-FreeItem");

    //    public By checkBasedBeforeTaxWithFreeItemTitle = By.xpath("//XCUIElementTypeStaticText[@name=\"CB-BeforeTax-FreeItem\"]");
    public By checkBasedBeforeTaxWithFreeItemTitle = By.id("CB-BeforeTax-FreeItem");

    //    public By checkBasedAfterTaxWithFreeItemAmountForBruchetta = By.xpath("//XCUIElementTypeStaticText[@name=\"0,00\"]");
    public By checkBasedAfterTaxWithFreeItemAmountForBruchetta = By.id("0,00");

    //    public By checkBasedBeforeTaxWithPercentageTitle = By.xpath("//XCUIElementTypeStaticText[@name=\"CB-PercentageBeforeTax\"]");
    public By checkBasedBeforeTaxWithPercentageTitle = By.id("CB-PercentageBeforeTax");

    //    public By checkBasedBeforeTaxWithPercentageAmountForBruchetta = By.xpath("//XCUIElementTypeStaticText[@name=\"50,00\"]");
    public By checkBasedBeforeTaxWithPercentageAmountForBruchetta = By.id("50,00");

    //    public By checkBasedBeforeTaxWithAmountTitle = By.xpath("//XCUIElementTypeStaticText[@name=\"CB-AmountBeforeTax\"]");
    public By checkBasedBeforeTaxWithAmountTitle = By.id("CB-AmountBeforeTax");

    //    public By checkBasedBeforeTaxWithAmountForBruchetta = By.xpath("//XCUIElementTypeStaticText[@name=\"5,00\"]");
    public By checkBasedBeforeTaxWithAmountForBruchetta = By.id("5,00");

    //    public By checkBasedBeforeTaxWithSetPriceTitle = By.xpath("//XCUIElementTypeStaticText[@name=\"CB-BeforeTax-SetPrice\"]");
    public By checkBasedBeforeTaxWithSetPriceTitle = By.id("CB-BeforeTax-SetPrice");

    //    public By checkBasedBeforeTaxWithSetPriceForBruchetta = By.xpath("//XCUIElementTypeStaticText[@name=\"470,00\"]");
    public By checkBasedBeforeTaxWithSetPriceForBruchetta = By.id("470,00");

    //    public By checkBasedBeforeTaxWithFreeItemForBruchetta = By.xpath("//XCUIElementTypeStaticText[@name=\"0,00\"]");
    public By checkBasedBeforeTaxWithFreeItemForBruchetta = By.id("0,00");

    //    public By checkBasedBeforeTaxWithOpenItemForBruchetta = By.xpath("//XCUIElementTypeStaticText[@name=\"9,69\"]");
    public By checkBasedBeforeTaxWithOpenItemForBruchetta = By.id("9,69");

    //    public By checkBasedBeforeTaxWithOpenItemForBruchettas = By.xpath("//XCUIElementTypeStaticText[@name=\"9,70\"]");
    public By checkBasedBeforeTaxWithOpenItemForBruchettas = By.id("9,70");

    //    public By checkBasedBeforeTaxWithOpenItemTitle = By.xpath("//XCUIElementTypeStaticText[@name=\"CB-AfterTax-OpenItem\"]");
    public By checkBasedBeforeTaxWithOpenItemTitle = By.id("CB-AfterTax-OpenItem");

    //    public By checkBasedPercentageDiscountWithAfterTaxAmountAppliedOpenItem = By.xpath("//XCUIElementTypeStaticText[@name=\"59,99\"]");
    public By checkBasedPercentageDiscountWithAfterTaxAmountAppliedOpenItem = By.id("59,99");

    //    public By cokeMenuItem = By.xpath("//XCUIElementTypeStaticText[@name=\"COKE\"]");
    public By cokeMenuItem = By.id("COKE");

    //    public By totalText = By.xpath("//XCUIElementTypeStaticText[@name=\"Total\"]");
    public By totalText = By.id("Total");

    //    public By pizzaMelTotalPrice = By.xpath("//XCUIElementTypeStaticText[@name=\"TL 2.057,00\"]");
    public By pizzaMelTotalPrice = By.id("TL 2.057,00");

    //    public By pizzaMargaritaTotalPrice = By.xpath("//XCUIElementTypeStaticText[@name=\"TL 3.267,00\"]");
    public By pizzaMargaritaTotalPrice = By.id("TL 3.267,00");

    public By autoDiscountText = By.xpath("(//XCUIElementTypeStaticText[@name=\"Discount\"])[1]");

    //    public By autoDiscountPrice = By.xpath("//XCUIElementTypeStaticText[@name=\"TL 400,00\"]");
    public By autoDiscountPrice = By.id("TL 400,00");

    public By pizzaMelTotalPriceWithTaxExempt = By.xpath("(//XCUIElementTypeStaticText[@name=\"TL 1.700,00\"])[2]");

    public By pizzaMargaritaTotalPriceWithTaxExempt = By.xpath("(//XCUIElementTypeStaticText[@name=\"TL 1.000,00\"])[2]");

    //    public By gratuityText = By.xpath("//XCUIElementTypeStaticText[@name=\"Gratuity\"]");
    public By gratuityText = By.id("Gratuity");

    //    public By brushettaFixGratuityPrice = By.xpath("//XCUIElementTypeStaticText[@name=\"TL 99,99\"]");
    public By brushettaFixGratuityPrice = By.id("TL 99,99");

    //    public By brushettaVaryingGratuityPrice = By.xpath("//XCUIElementTypeStaticText[@name=\"TL 50,00\"]");
    public By brushettaVaryingGratuityPrice = By.id("TL 50,00");

    //    public By hamburgerMenuItem = By.xpath("//XCUIElementTypeStaticText[@name=\"HAMBURGER\"]");
    public By hamburgerMenuItem = By.id("HAMBURGER");

    //    public By plusIconForAddSeat = By.xpath("//XCUIElementTypeButton[@name=\"ADD\"]");
    public By plusIconForAddSeat = By.id("ADD");

    //    public By baconOmeletMenuItem = By.xpath("//XCUIElementTypeStaticText[@name=\"Bacon Omelet Senior\"]");
    public By baconOmeletMenuItem = By.id("Bacon Omelet Senior");

    //    public By baconOmeletTotalPriceWithExclusiveTax = By.xpath("//XCUIElementTypeStaticText[@name=\"TL 105,00\"]");
    public By baconOmeletTotalPriceWithExclusiveTax = By.id("TL 105,00");

    //    public By mantiMenuItem = By.xpath("//XCUIElementTypeStaticText[@name=\"MANTI\"]");
    public By mantiMenuItem = By.id("MANTI");

    //    public By mantiTotalPriceWithInclusiveTax = By.xpath("//XCUIElementTypeStaticText[@name=\"TL 50,06\"]");
    public By mantiTotalPriceWithInclusiveTax = By.id("TL 50,06");

    //    public By selectedCustomerNameForBarTab = By.xpath("//XCUIElementTypeButton[@name=\"Test A\"]");
    public By selectedCustomerNameForBarTab = By.id("Test A");

    //    public By selectedCustomerForHouseAccount = By.xpath("//XCUIElementTypeButton[@name=\"Test A\"]");
    public By selectedCustomerForHouseAccount = By.id("Test A");

    //    public By voidReasonForHA = By.xpath("//XCUIElementTypeStaticText[@name=\"Ordered Wrongly\"]");
    public By voidReasonForHA = By.id("Ordered Wrongly");

    //    public By newCustomerForHouseAccount = By.xpath("//XCUIElementTypeButton[@name=\"Test A\"]");
    public By newCustomerForHouseAccount = By.id("Test A");

    //    public By toGoOrderType = By.xpath("//XCUIElementTypeStaticText[@name=\"To Go\"]");
    public By toGoOrderType = By.id("To Go");

    //    public By phoneOrderType = By.xpath("//XCUIElementTypeStaticText[@name=\"PHONE\"]");
    public By phoneOrderType = By.id("PHONE");

    //    public By spPaxPreAuthTitle = By.xpath("//XCUIElementTypeStaticText[@name=\"SP Pax PreAuth\"]");
    public By spPaxPreAuthTitle = By.id("SP Pax PreAuth");

    //    public By exitButtonForSpPaxPreAuth = By.xpath("//XCUIElementTypeStaticText[@name=\"Exit\"]");
    public By exitButtonForSpPaxPreAuth = By.id("Exit");

    //    public By customerNamePopupTitle = By.xpath("//XCUIElementTypeStaticText[@name=\"Enter the Customer Name\"]");
    public By customerNamePopupTitle = By.id("Enter the Customer Name");
    // Nov 24 End


    //Menu Option

    //    public By repeatMenuOption = By.xpath("//XCUIElementTypeStaticText[@name=\"Repeat\"]");
    public By repeatMenuOption = By.id("Repeat");
    //    public By quantityMenuOption = By.xpath("//XCUIElementTypeStaticText[@name=\"Quantity\"]");
    public By quantityMenuOption = By.id("Quantity");
    //    public By calculatorNumberTwo = By.xpath("//XCUIElementTypeButton[@name=\"2\"]");
    public By calculatorNumberTwo = By.id("2");
    //    public By continueForCalculator = By.xpath("//XCUIElementTypeStaticText[@name=\"Continue\"]");
    public By continueForCalculator = By.id("Continue");
    //    public By holdMenuOption = By.xpath("//XCUIElementTypeStaticText[@name=\"Hold\"]");
    public By holdMenuOption = By.id("Hold");
    public By holdHeaderText = By.xpath("(//XCUIElementTypeStaticText[@name=\"Hold\"])[1]");
    //    public By holdAutomationButton = By.xpath("//XCUIElementTypeStaticText[@name=\"Automatic\"]");
    public By holdAutomationButton = By.id("Automatic");
    //    public By holdManuelButton = By.xpath("//XCUIElementTypeStaticText[@name=\"Manual\"]");
    public By holdManuelButton = By.id("Manual");
    //    public By fireMenuOption = By.xpath("//XCUIElementTypeStaticText[@name=\"Fire\"]");
    public By fireMenuOption = By.id("Fire");
    //public By firstMenuItem = By.xpath("(//XCUIElementTypeTable[@name=\"Empty list\"])[4]");
    //public By repeatedMenuItem = By.xpath("(//XCUIElementTypeTable[@name=\"Empty list\"])[6]");
    //public By quantityOfOrder = By.xpath("//XCUIElementTypeStaticText[@name=\"2\"]");
//    public By attachMenuOption = By.xpath("//XCUIElementTypeStaticText[@name=\"Attach\"]");
    public By attachMenuOption = By.id("Attach");
    //    public By attachNoteTitle = By.xpath("//XCUIElementTypeStaticText[@name=\"Add Notes\"]");
    public By attachNoteTitle = By.id("Add Notes");
    //    public By firstAttachNote = By.xpath("//XCUIElementTypeStaticText[@name=\"Toasted\"]");
    public By firstAttachNote = By.id("Toasted");
    //    public By addAttachNoteButton = By.xpath("//XCUIElementTypeStaticText[@name=\"Add\"]");
    public By addAttachNoteButton = By.id("Add");
    //    public By attachedNotesOnOrder = By.xpath("//XCUIElementTypeStaticText[@name=\"Toasted\"]");
    public By attachedNotesOnOrder = By.id("Toasted");
    //    public By ToGoMenuOption = By.xpath("//XCUIElementTypeStaticText[@name=\"TOGO\"]");
    public By ToGoMenuOption = By.id("TOGO");

    // Merge Page

    //public By firstTable = By.xpath("//XCUIElementTypeStaticText[@name=\"T1\"]");

    // Modifier Page

    public By firstItemsFirstModifier = By.xpath("//XCUIElementTypeStaticText[@name=\"Penne\"][1]");
    public By selectedModifier = By.xpath("//XCUIElementTypeStaticText[@name=\"Penne\"][2]");
    public By modifierOkButton = By.id("Ok");
    public By modifierCancelButton = By.id("Cancel");

    //Operation Pge

    //public By posOption = By.xpath("//XCUIElementTypeStaticText[@name=\"POS\"]");
//    public By operationTitle = By.xpath("//XCUIElementTypeStaticText[@name=\"Operation\"]");
    public By operationTitle = By.id("Operation");
    //    public By batchTipAdjustmentTab = By.xpath("//XCUIElementTypeStaticText[@name=\"Batch/Tip Adjustment\"]");
    public By batchTipAdjustmentTab = By.id("Batch/Tip Adjustment");
    //    public By posSettings = By.xpath("//XCUIElementTypeStaticText[@name=\"POS Settings\"]");
    public By posSettings = By.id("POS Settings");
    //    public By operationMenuIcon  = By.xpath("//XCUIElementTypeButton[@name=\"ToggleIcon\"]");
//    public By tillManagementTab = By.xpath("//XCUIElementTypeStaticText[@name=\"Till Management\"]");
    public By tillManagementTab = By.id("Till Management");

    // Order Type

    //    public By deliveryButton = By.xpath("//XCUIElementTypeStaticText[@name=\"Delivery\"]");
    public By deliveryButton = By.id("Delivery");
    public By nowDeliveryOption = By.xpath("(//XCUIElementTypeButton[@name=\"Button\"])[1]");
    //    public By orderTypeDoneButton = By.xpath("//XCUIElementTypeStaticText[@name=\"Done\"]");
    public By orderTypeDoneButton = By.id("Done");
    public By laterDeliveryOption = By.xpath("(//XCUIElementTypeButton[@name=\"Button\"])[2]");
    public By deliveryTimeDoneButton = By.xpath("(//XCUIElementTypeButton[@name=\"Done\"])[1]");
    //    public By printerButton = By.xpath("//XCUIElementTypeStaticText[@name=\"Print\"]");
    public By printerButton = By.id("Print");
    //    public By cancelOrderButton = By.xpath("//XCUIElementTypeStaticText[@name=\"Cancel Order\"]");
    public By cancelOrderButton = By.id("Cancel Order");
    //    public By futureButton = By.xpath("//XCUIElementTypeStaticText[@name=\"Future\"]");
    public By futureButton = By.id("Future");
    //    public By paymentMadeOnMessage = By.xpath("//XCUIElementTypeTextView[@name=\"Payment(s) made on this check,Can you return this to Test A\"]");
    public By paymentMadeOnMessage = By.id("Payment(s) made on this check,Can you return this to Test A");
    //public By doneButton = By.xpath("//XCUIElementTypeStaticText[@name=\"Done\"]");

    // Phone Order

    //    public By completedPhoneOrder = By.xpath("//XCUIElementTypeStaticText[@name=\"Complete\"]");
    public By completedPhoneOrder = By.id("Complete");
    public By lastOrderType = By.xpath("(//XCUIElementTypeStaticText[@name=\"FORHERE\"])[4]");
    //    public By futurePhoneOrder = By.xpath("//XCUIElementTypeStaticText[@name=\"Future\"]");
    public By futurePhoneOrder = By.id("Future");
    //    public By newTabPhoneOrder = By.xpath("//XCUIElementTypeStaticText[@name=\"New\"]");
    public By newTabPhoneOrder = By.id("New");
    public By firstActiveDriver = By.xpath("//XCUIElementTypeStaticText[@name=\"Automation T\"][last()]");
    //    public By departureButton = By.xpath("//XCUIElementTypeStaticText[@name=\"Departure\"]");
    public By departureButton = By.id("Departure");
    //    public By outTabPhoneOrder = By.xpath("//XCUIElementTypeStaticText[@name=\"Out\"]");
    public By outTabPhoneOrder = By.id("Out");
    //    public By arrivalButton = By.xpath("//XCUIElementTypeStaticText[@name=\"Arrival\"]");
    public By arrivalButton = By.id("Arrival");
    public By fastCashScreen = By.xpath("//XCUIElementTypeStaticText[@name=\" Cash\"]");
    //    public By noDriver = By.xpath("//XCUIElementTypeTable[@name=\"Empty list\"]");
    public By noDriver = By.id("Empty list");
    //    public By driverColumn = By.xpath("//XCUIElementTypeStaticText[@name=\"Driver\"]");
    public By driverColumn = By.id("Driver");
    //    public By ordersDriver = By.xpath("//XCUIElementTypeStaticText[@name=\"Automation\"]");
    public By ordersDriver = By.id("Automation");
    //    public By assignedDriverOrder = By.xpath("//XCUIElementTypeStaticText[@name=\"STORE DELIVERY\"]");
    public By assignedDriverOrder = By.id("STORE DELIVERY");
    //    public By passiveDriver = By.xpath("//XCUIElementTypeStaticText[@name=\"Automation T\"]");
    public By passiveDriver = By.id("Automation T");
    //    public By passiveDriverPopup = By.xpath("//XCUIElementTypeStaticText[@name=\"Linga\"]");
    public By passiveDriverPopup = By.id("Linga");
    public By assignedLastDriver = By.xpath("//XCUIElementTypeStaticText[@name=\"Test\"][last()]");
    public By forHereOrderType = By.xpath("(//XCUIElementTypeStaticText[@name=\"FORHERE\"])[25]");
    //    public By passiveDriverNoButton = By.xpath("//XCUIElementTypeButton[@name=\"No\"]");
    public By passiveDriverNoButton = By.id("No");
    public By lastForHereOrderType = By.xpath("(//XCUIElementTypeStaticText[@name=\"For Here\"])[last()]");

    // POS Settings

    //    public By posSettingHeader = By.xpath("//XCUIElementTypeStaticText[@name=\"Till Settings\"]");
    public By posSettingHeader = By.id("Till Settings");
    //public By barTabOption = By.xpath("//XCUIElementTypeStaticText[@name=\"BarTab\"]");
    public By askCustomerNameToggle = By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeScrollView/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeOther[11]/XCUIElementTypeSwitch");
    //    public By saveChangesButton = By.xpath("//XCUIElementTypeStaticText[@name=\"Save Changes\"]");
    public By saveChangesButton = By.id("Save Changes");
    //    public By successUpdatePopup = By.xpath("//XCUIElementTypeStaticText[@name=\"Done\"]");
    public By successUpdatePopup = By.id("Done");
    //public By operationMenuIcon = By.xpath("//XCUIElementTypeButton[@name=\"ToggleIcon\"]");
//    public By posTab = By.xpath("//XCUIElementTypeStaticText[@name=\"POS\"]");
    public By posTab = By.id("POS");
    public By enableCashDropToggle = By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeScrollView/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeSwitch");

    // Split Check

    //    public By addNewSeatForSplit = By.xpath("//XCUIElementTypeStaticText[@name=\"Add\"]");
    public By addNewSeatForSplit = By.id("Add");
    public By selectItemInCheck = By.xpath("(//XCUIElementTypeStaticText[@name=\"SANDWICHES \"])[1]");
    //    public By splitEvenly = By.xpath("//XCUIElementTypeStaticText[@name=\"Split Evenly\"]");
    public By splitEvenly = By.id("Split Evenly");
    public By firstTotalAmount = By.xpath("(//XCUIElementTypeStaticText[@name=\"TL 10,00\"])[4]");
    public By secondTotalAmount = By.xpath("(//XCUIElementTypeStaticText[@name=\"TL 5,00\"])[2]");
    //    public By separateItemButton = By.xpath("//XCUIElementTypeStaticText[@name=\"Seperate Item\"]");
    public By separateItemButton = By.id("Seperate Item");
    public By firstOrderItem = By.xpath("(//XCUIElementTypeStaticText[@name=\"SANDWICHES \"])[3]");
    //    public By separatedFirstItemAmount = By.xpath("(//XCUIElementTypeStaticText[@name=\"5,00\"])[1]");
//    public By separatedSecondItemAmount = By.xpath("(//XCUIElementTypeStaticText[@name=\"5,00\"])[2]");
    public By splitCheckItem = By.xpath("(//XCUIElementTypeTable[@name=\"Empty list\"])[9]");
    public By emptySeat = By.xpath("(//XCUIElementTypeTable[@name=\"Empty list\"])[11]");
    public By firstSplitedItem = By.xpath("(//XCUIElementTypeStaticText[@name=\"SANDWICHES \"])[4]");
    public By firstItemOnFirstSeat = By.xpath("(//XCUIElementTypeStaticText[@name=\"SANDWICHES \"])[2]");
    public By separateItemNumber = By.xpath("//XCUIElementTypeButton[@name=\"2\"]");
    //    public By separateItemNumber = By.id("2");
    //    public By separateContinueButton = By.xpath("//XCUIElementTypeStaticText[@name=\"Continue\"]");
    public By separateContinueButton = By.id("Continue");
    //    public By selectOrderWarning = By.xpath("//XCUIElementTypeStaticText[@name=\"Select the Order to Proceed\"]");
    public By selectOrderWarning = By.id("Select the Order to Proceed");
    //    public By selectOrderWarningDoneButton = By.xpath("//XCUIElementTypeStaticText[@name=\"Done\"]");
    public By selectOrderWarningDoneButton = By.id("Done");
    //    public By firstSeatTitle = By.xpath("//XCUIElementTypeStaticText[@name=\"Seat 1\"]");
    public By secondSeatTitle = By.xpath("(//XCUIElementTypeStaticText[@name=\"Seat 2\"])[2]");
    public By payButtonOnSplitSeat = By.xpath("//XCUIElementTypeStaticText[@name=\"Pay\"]");
    //    public By payButtonOnSplitSeat = By.id("Pay");
    //    public By groupSeatButton = By.xpath("//XCUIElementTypeStaticText[@name=\"Group Seats\"]");
    public By groupSeatButton = By.id("Group Seats");
    //    public By mergeSeatWarningPopup = By.xpath("//XCUIElementTypeTextView[@name=\"Select the seats to Merge\"]");
    public By mergeSeatWarningPopup = By.id("Select the seats to Merge");
    public By firstSeatTotalAmountTitle = By.xpath("(//XCUIElementTypeStaticText[@name=\"Total\"])[2]");
    public By firstSeatTotalAmountTitle1 = By.xpath("//XCUIElementTypeStaticText[@name=\"Seat 1\"]");
    public By secondSeatTotalAmountTitle2 = By.xpath("(//XCUIElementTypeStaticText[@name=\"Seat 2\"])[2]");

    public By secondSeatTotalAmountTitle = By.xpath("(//XCUIElementTypeStaticText[@name=\"Total\"])[3]");
    public By firstSeatTotalAmount = By.xpath("(//XCUIElementTypeStaticText[@name=\"TL 0,00\"])[2]");
    public By secondSeatTotalAmount = By.xpath("(//XCUIElementTypeStaticText[@name=\"TL 0,00\"])[5]");
    //public By splitButton = By.id("Split");
    //public By splitCheckOption = By.xpath("(//XCUIElementTypeStaticText[@name=\"Split Check\"])");
//    public By saveAndCloseButton = By.xpath("//XCUIElementTypeStaticText[@name=\"Save & Close\"]");
    public By saveAndCloseButton = By.id("Save & Close");
    public By seatOneOnSplitSeatPage = By.xpath("(//XCUIElementTypeStaticText[@name=\"Seat 1\"])[2]");
    public By seatTwoOnSplitSeatPage = By.xpath("(//XCUIElementTypeStaticText[@name=\"Seat 2\"])[2]");
    //    public By groupBySeatButton = By.xpath("//XCUIElementTypeStaticText[@name=\"Group Seats\"]");
    public By groupBySeatButton = By.id("Group Seats");
    //    public By orderWillBeSplited = By.xpath("//XCUIElementTypeStaticText[@name=\"T1\"]");
    public By orderWillBeSplited = By.id("T1");
    public By splitedOrderItem = By.xpath("(//XCUIElementTypeStaticText[@name=\"SANDWICHES \"])[3]");
    public By splitedOrderForFirstCheck = By.xpath("(//XCUIElementTypeStaticText[@name=\"SANDWICHES \"])[3]");
    public By splitedOrderForSecondCheck = By.xpath("(//XCUIElementTypeStaticText[@name=\"SANDWICHES \"])[4]");
    //    public By addButtonForSplit = By.xpath("//XCUIElementTypeStaticText[@name=\"Add\"]");
    public By addButtonForSplit = By.id("Add");
    public By firstOrderForSplit = By.xpath("(//XCUIElementTypeStaticText[@name=\"HAMBURGER \"])[2]");
    public By seatForSplit = By.xpath("(//XCUIElementTypeStaticText[@name=\"Seat 1\"])[3]");
    //    public By hamburgerPrice = By.xpath("//XCUIElementTypeStaticText[@name=\"1.500,00\"]");
    public By hamburgerPrice = By.id("1.500,00");
    //    public By subTotalForSplitedSeat = By.xpath("//XCUIElementTypeStaticText[@name=\"TL 1.500,00\"]");
    public By subTotalForSplitedSeat = By.id("TL 1.500,00");
    public By selectFirstItemToSplit = By.xpath("//XCUIElementTypeStaticText[@name=\"HAMBURGER \"]");
    //    public By splitBySeatButton = By.xpath("//XCUIElementTypeStaticText[@name=\"Split by seat\"]");
    public By splitBySeatButton = By.id("Split by seat");
    //    public By separatedHamburgerPrice = By.xpath("//XCUIElementTypeStaticText[@name=\"750,00\"]");
    public By separatedHamburgerPrice = By.id("750,00");
    public By subtotalForSeatOne = By.xpath("(//XCUIElementTypeStaticText[@name=\"TL 1.000,00\"])[2]");
    //    public By subtotalForSeatOne = By.id("TL 1.000,00");
    public By subtotalForSeatTwo = By.xpath("(//XCUIElementTypeStaticText[@name=\"TL 1.000,00\"])[2]");
    //    public By subtotalForSeatTwo = By.id("TL 1.000,00");
    public By seatOneForGroupSeat = By.xpath("(//XCUIElementTypeStaticText[@name=\"Seat 1\"])[2]");
    //    public By seatTwoForGroupSeat = By.xpath("//XCUIElementTypeStaticText[@name=\"Seat 2\"]");
//    public By subtotalForSeatOneAfterMerge = By.xpath("//XCUIElementTypeStaticText[@name=\"2.000,00\"]");
    public By subtotalForSeatOneAfterMerge = By.id("2.000,00");
    //    public By subtotalForSeatTwoAfterMerge = By.xpath("//XCUIElementTypeStaticText[@name=\"TL 0,00\"]");
    public By subtotalForSeatTwoAfterMerge = By.id("TL 0,00");

    // Table Layout

    public By firstMergedCheck = By.xpath("(//XCUIElementTypeStaticText[@name=\"T1\"])[1]");
    public By firstActiveTable = By.xpath("(//XCUIElementTypeStaticText[@name=\"T1\"])[1]");
    public By secondActiveTable = By.xpath("(//XCUIElementTypeStaticText[@name=\"T1\"])[2]");
    //public By splitButton = By.xpath("//XCUIElementTypeStaticText[@name=\"Split\"]");
    //public By splitCheckOption = By.xpath("//XCUIElementTypeStaticText[@name=\"Split Check\"]");
    //public By firstTable = By.xpath("//XCUIElementTypeStaticText[@name=\"T1\"]");
    //public By tableLayout = By.xpath("//XCUIElementTypeStaticText[@name=\"Table Layout\"]");
//    public By splitBySeatButtonOnTableLayout = By.xpath("//XCUIElementTypeStaticText[@name=\"Split By Seat\"]");
    public By splitBySeatButtonOnTableLayout = By.id("Split By Seat");
    public By firstNumberForSeatOnCalculator = By.id("");
    //public By emptyCheck = By.xpath("//XCUIElementTypeStaticText[@name=\"empty set detail label\"]");
    public By printerPopupInfo = By.id("Select the Receipt Printer in Operations/Hard ware Settings");
    //public By receiptPrinterDoneButton = By.xpath("//XCUIElementTypeButton[@name=\"Done\"]");
    //public By secondTable = By.xpath("//XCUIElementTypeStaticText[@name=\"T5\"]");
    //public By mergeButton = By.xpath("//XCUIElementTypeStaticText[@name=\"Merge\"]");
//    public By mergeDoneButton = By.xpath("//XCUIElementTypeStaticText[@name=\"Done\"]");
    public By mergeDoneButton = By.id("Done");
    public By mergedTablesPopup = By.xpath("//XCUIElementTypeStaticText[contains(@name, 'are merged')]");
    public By operationButton = By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeButton[7]");
    //    public By doneMergeButton = By.xpath("//XCUIElementTypeStaticText[@name=\"Done\"]");
    public By doneMergeButton = By.id("Done");
    //public By payCheckButton = By.xpath("//XCUIElementTypeStaticText[@name=\"Pay Check\"]");
//    public By tableNoTwo = By.xpath("//XCUIElementTypeStaticText[@name=\"T2\"]");
    public By tableNoTwo = By.id("T2");
    //    public By calculatorContinueButton = By.xpath("//XCUIElementTypeStaticText[@name=\"Continue\"]");
    public By calculatorContinueButton = By.id("Continue");
    public By tableHasMoreThanOneSeat = By.xpath("(//XCUIElementTypeStaticText[@name=\"Walkin\"])[1]");

    //Tax Exempt

    //    public By firstTaxExemptType = By.xpath("//XCUIElementTypeStaticText[@name=\"Charity\"]");
    public By firstTaxExemptType = By.id("Charity");
    //    public By taxExemptPaidAmountWarningText = By.xpath("//XCUIElementTypeTextView[@name=\"Paid amount exceeds the sale amount\"]");
    public By taxExemptPaidAmountWarningText = By.id("Paid amount exceeds the sale amount");

    // Till Management

    //    public By tillNumberFive = By.xpath("//XCUIElementTypeStaticText[@name=\"5\"]");
    public By tillNumberFive = By.id("5");
    //    public By tillNumberDoubleZero = By.xpath("//XCUIElementTypeStaticText[@name=\"00\"]");
    public By tillNumberDoubleZero = By.id("00");
    //    public By tillContinueButton = By.xpath("//XCUIElementTypeStaticText[@name=\"Continue\"]");
    public By tillContinueButton = By.id("Continue");
    //    public By tillBalanceTitle = By.xpath("//XCUIElementTypeStaticText[@name=\"Till Balance\"]");
    public By tillBalanceTitle = By.id("Till Balance");
    public By tillBalanceAmount = By.id("TL 100,00");
    //    public By closeTillButton = By.xpath("//XCUIElementTypeStaticText[@name=\"Close Till\"]");
    public By closeTillButton = By.id("Close Till");
    //    public By yesOption = By.xpath("//XCUIElementTypeButton[@name=\"Yes\"]");
    public By yesOption = By.id("Yes");
    public By expectedCashAmount = By.xpath("(//XCUIElementTypeStaticText[@name=\"500,00\"])[3]");
    public By endingCashAmount = By.xpath("(//XCUIElementTypeStaticText[@name=\"500,00\"])[4]");
    //    public By tillSubmitButton = By.xpath("//XCUIElementTypeStaticText[@name=\"Submit\"]");
    public By tillSubmitButton = By.id("Submit");
    //    public By setTillButton = By.xpath("//XCUIElementTypeStaticText[@name=\"Set Till\"]");
    public By setTillButton = By.id("Set Till");
    //    public By openTillHeader = By.xpath("//XCUIElementTypeStaticText[@name=\"Open Till\"]");
    public By openTillHeader = By.id("Open Till");
    //public By numberOne = By.xpath("//XCUIElementTypeStaticText[@name=\"1\"]");
    //public By numberDoubleZero = By.xpath("//XCUIElementTypeStaticText[@name=\"00\"]");
//    public By tillBalanceText = By.xpath("//XCUIElementTypeStaticText[@name=\"Till Balance\"]");
    public By tillBalanceText = By.id("Till Balance");
    //    public By newTillBalance = By.xpath("//XCUIElementTypeStaticText[@name=\"TL 100,00\"]");
    public By newTillBalance = By.id("TL 100,00");
    public By globalTillToggle = By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeSwitch");
    //    public By payInButton = By.xpath("//XCUIElementTypeStaticText[@name=\"Pay In\"]");
    public By payInButton = By.id("Pay In");
    public By paidByTextBox = By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeTextField");
    //public By continueButton = By.xpath("//XCUIElementTypeStaticText[@name=\"Continue\"]");
//    public By paidInReason = By.xpath("//XCUIElementTypeStaticText[@name=\"Paid In\"]");
    public By paidInReason = By.id("Paid In");
    //    public By successPainInPopup = By.xpath("//XCUIElementTypeTextView[@name=\"Paid In Successfully\"]");
    public By successPainInPopup = By.id("Paid In Successfully");
    //    public By successPaidOutPopup = By.xpath("//XCUIElementTypeTextView[@name=\"Paid Out Successfully\"]");
    public By successPaidOutPopup = By.id("Paid Out Successfully");
    //    public By payOutTab = By.xpath("//XCUIElementTypeStaticText[@name=\"Pay Out\"]");
    public By payOutTab = By.id("Pay Out");
    public By paidToTextBox = By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeTextField");
    public By paidOutReason = By.id("Paid Out");
    //    public By activeTillButton = By.xpath("//XCUIElementTypeStaticText[@name=\"Active Till\"]");
    public By activeTillButton = By.id("Active Till");
    public By tillList = By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther[3]/XCUIElementTypeTable");
    //    public By yesOptionOnPopup = By.xpath("//XCUIElementTypeButton[@name=\"Yes\"]");
    public By yesOptionOnPopup = By.id("Yes");
    //    public By cancelButton = By.xpath("//XCUIElementTypeButton[@name=\"Cancel\"]");
    public By cancelButton = By.id("Cancel");
    //    public By globalTillToggleText = By.xpath("//XCUIElementTypeStaticText[@name=\"Global Till\"]");
    public By globalTillToggleText = By.id("Global Till");
    //    public By cashDropTab = By.xpath("//XCUIElementTypeStaticText[@name=\"Cash Drop\"]");
    public By cashDropTab = By.id("Cash Drop");
    //    public By cashDropSuccessPopup = By.xpath("//XCUIElementTypeTextView[@name=\"Cash Drop Successfully\"]");
    public By cashDropSuccessPopup = By.id("Cash Drop Successfully");
    //    public By activeTill = By.xpath("//XCUIElementTypeStaticText[@name=\"GöknurB\"]");
    public By activeTill = By.id("GöknurB");
    //    public By overShortageTitle = By.xpath("//XCUIElementTypeStaticText[@name=\"OVER SHORTAGE\"]");
    public By overShortageTitle = By.id("OVER SHORTAGE");
    public By discrepancyNotes = By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeTextView");

    // Transfer Page

    //    public By transferToServerButton = By.xpath("//XCUIElementTypeStaticText[@name=\"Transfer to Server\"]");
    public By transferToServerButton = By.id("Transfer to Server");
    //    public By transferItemButton = By.xpath("//XCUIElementTypeStaticText[@name=\"Transfer Item\"]");
    public By transferItemButton = By.id("Transfer Item");
    public By serverOne = By.xpath("(//XCUIElementTypeStaticText[@name=\"auto c\"])[1]");
    public By checkWillBeTransferredOnBarTab = By.xpath("(//XCUIElementTypeStaticText[@name=\"BarTab\"])[1]");
    public By serverTwo = By.xpath("(//XCUIElementTypeStaticText[@name=\"Karthick T\"])[2]");
    //public By yesButton = By.xpath("//XCUIElementTypeButton[@name=\"Yes\"]");
//    public By transferSuccessMessage = By.xpath("//XCUIElementTypeTextView[@name=\"Transferred Successfully\"]");
    public By transferSuccessMessage = By.id("Transferred Successfully");
    //public By doneButton = By.xpath("//XCUIElementTypeStaticText[@name=\"Done\"]");
//    public By barTabOrderForTransfer = By.xpath("//XCUIElementTypeStaticText[@name=\"0-012 - BarTab\"]");
    public By barTabOrderForTransfer = By.id("0-012 - BarTab");
    public By menuItemForTransfer = By.xpath("//XCUIElementTypeStaticText[@name=\"HAMBURGER \"]");
    //    public By barTabWillBeTransferTo = By.xpath("//XCUIElementTypeStaticText[@name=\"0-013 - BarTab\"]");
    public By barTabWillBeTransferTo = By.id("0-013 - BarTab");
    //    public By transferToTableButton = By.xpath("//XCUIElementTypeStaticText[@name=\"Transfer to Table\"]");
    public By transferToTableButton = By.id("Transfer to Table");
    //    public By tableWillBeTransferFrom = By.xpath("//XCUIElementTypeStaticText[@name=\"Floor 1-T1\"]");
    public By tableWillBeTransferFrom = By.id("Floor 1-T1");
    public By tableWillBeTransferTo = By.xpath("(//XCUIElementTypeStaticText[@name=\"Walkin\"])[1]");

    // Customer Profile Page

    public By randomPhoneNumberText = By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeTextField[5]");

    public By autoDiscountItem = By.id("EGG SANDWICHES");
    //    public By calculatorNumberOne = By.xpath("//XCUIElementTypeButton[@name=\"1\"]");
    public By calculatorNumberOne = By.id("1");
    //    public By itemBasedATRestrictRoleTitle = By.xpath("//XCUIElementTypeStaticText[@name=\"AfterTax-RoleRestriction\"]");
    public By itemBasedATRestrictRoleTitle = By.id("AfterTax-RoleRestriction");
    //    public By itemBasedDiscountBRestrictDay = By.xpath("//XCUIElementTypeStaticText[@name=\"BeforeTaxDayRestriction\"]");
    public By itemBasedDiscountBRestrictDay = By.id("BeforeTaxDayRestriction");
    //    public By itemBasedDiscountBTRoleRestrict = By.xpath("//XCUIElementTypeStaticText[@name=\"BeforeTaxRoleRestriction\"]");
    public By itemBasedDiscountBTRoleRestrict = By.id("BeforeTaxRoleRestriction");
    //    public By checkBasedATTitle = By.xpath("//XCUIElementTypeStaticText[@name=\"CB-PercentageAfterTax\"]");
    public By checkBasedATTitle = By.id("CB-PercentageAfterTax");
    //    public By checkBasedATAmount = By.xpath("//XCUIElementTypeStaticText[@name=\"171,70\"]");
    public By checkBasedATAmount = By.id("171,70");
    //    public By itemBasedFreeDiscountBTAmount = By.xpath("//XCUIElementTypeStaticText[@name=\"TL 100,00\"]");
    public By itemBasedFreeDiscountBTAmount = By.id("TL 100,00");
    //    public By checkBasedFreeDiscountATAmount = By.xpath("//XCUIElementTypeStaticText[@name=\"0,00\"]");
    public By checkBasedFreeDiscountATAmount = By.id("0,00");
    //    public By checkBasedPercentageDiscountWithATAmount = By.xpath("//XCUIElementTypeStaticText[@name=\"TL 100,00\"]");
    public By checkBasedPercentageDiscountWithATAmount = By.id("TL 100,00");
    //    public By checkBasedSetPriceDiscountWithBTAmount = By.xpath("//XCUIElementTypeStaticText[@name=\"TL 995,00\"]");
    public By checkBasedSetPriceDiscountWithBTAmount = By.id("TL 995,00");
    //    public By checkBasedAmountDiscountWithBTAmount = By.xpath("//XCUIElementTypeStaticText[@name=\"TL 10,00\"]");
    public By checkBasedAmountDiscountWithBTAmount = By.id("TL 10,00");
    //    public By openCheckDiscountAmountATOnPriceSide = By.xpath("//XCUIElementTypeStaticText[@name=\"TL 5,00\"]");
    public By openCheckDiscountAmountATOnPriceSide = By.id("TL 5,00");
    //    public By openCheckDiscountAmountATOnOrderSideForMargarita = By.xpath("//XCUIElementTypeStaticText[@name=\"TL 5,00\"]");
    public By openCheckDiscountAmountATOnOrderSideForMargarita = By.id("TL 5,00");
    //    public By openCheckDiscountPercentageOnPriceForMargarita = By.xpath("//XCUIElementTypeStaticText[@name=\"TL 202,00\"]");
    public By openCheckDiscountPercentageOnPriceForMargarita = By.id("TL 202,00");
    //    public By openCheckDiscountAsAmountOnPriceSideForMargarita = By.xpath("//XCUIElementTypeStaticText[@name=\"TL 5,00\"]");
    public By openCheckDiscountAsAmountOnPriceSideForMargarita = By.id("TL 5,00");
    //    public By openCheckDiscountAsAmountOnPriceSide = By.xpath("//XCUIElementTypeStaticText[@name=\"TL 5,00\"]");
    public By openCheckDiscountAsAmountOnPriceSide = By.id("TL 5,00");
    //    public By openCheckDiscountPercentage = By.xpath("//XCUIElementTypeStaticText[@name=\"24,00\"]");
    public By openCheckDiscountPercentage = By.id("24,00");
    //    public By exlusiveTaxAmountHotWings = By.xpath("//XCUIElementTypeStaticText[@name=\"TL 20,11\"]");
    public By exlusiveTaxAmountHotWings = By.id("TL 20,11");
    //    public By sandwicheTaxAmount = By.xpath("//XCUIElementTypeStaticText[@name=\"TL 200,10\"]");
    public By sandwicheTaxAmount = By.id("TL 100,10");
    //    public By itemBasedDiscountATWithPercentage = By.xpath("//XCUIElementTypeStaticText[@name=\"IB-AfterTax-Percentage\"]");
    public By itemBasedDiscountATWithPercentage = By.id("IB-AfterTax-Percentage");
    //    public By itemBasedATAsPercentageDiscountAmountForSandwiches = By.xpath("//XCUIElementTypeStaticText[@name=\"TL 12,00\"]");
    public By itemBasedATAsPercentageDiscountAmountForSandwiches = By.id("TL 12,00");
    //    public By CCSidePaymentDetailBarTab = By.xpath("//XCUIElementTypeStaticText[@name=\"1. Side CC(#1)\"]");
    public By CCSidePaymentDetailBarTab = By.id("1. Side CC(#1)");
    //public By itemBasedDiscountATWithPercentagePaymentDetailAmountWithTip = By.xpath("//XCUIElementTypeStaticText[@name=\"132,00+100,00\"]");
//    public By itemBasedDiscountBTWithPercentage = By.xpath("//XCUIElementTypeStaticText[@name=\"IB-BeforeTax-Percentage\"]");
    public By itemBasedDiscountBTWithPercentage = By.id("IB-BeforeTax-Percentage");
    //    public By itemBasedDiscountATWithPercentagePaymentDetailAmountWithTip = By.xpath("//XCUIElementTypeStaticText[@name=\"132,00+100,00\"]");
    public By itemBasedDiscountATWithPercentagePaymentDetailAmountWithTip = By.id("132,00+100,00");
    //    public By itemBasedBTAsPercentageDiscountAmountForMargarita = By.xpath("//XCUIElementTypeStaticText[@name=\"TL 101,00\"]");
    public By itemBasedBTAsPercentageDiscountAmountForMargarita = By.id("TL 101,00");
    //    public By itemBasedDiscountBTWithAmountPaymentDetailAmountWithTipForMargarita = By.xpath("//XCUIElementTypeStaticText[@name=\"999,90+100,00\"]");
    public By itemBasedDiscountBTWithAmountPaymentDetailAmountWithTipForMargarita = By.id("999,90+100,00");
    //    public By ccSidePaymentDetailAmountWithItemBasedDiscountATAsPercentageForChickenSchinitzel = By.xpath("//XCUIElementTypeStaticText[@name=\"780,59+100,00\"]");
    public By ccSidePaymentDetailAmountWithItemBasedDiscountATAsPercentageForChickenSchinitzel = By.id("780,59+100,00");
    //    public By ccSidePaymentDetailAmountWithItemBasedDiscountATAsSetPriceForPizzaRomano = By.xpath("//XCUIElementTypeStaticText[@name=\"1.463,59+100,00\"]");
    public By ccSidePaymentDetailAmountWithItemBasedDiscountATAsSetPriceForPizzaRomano = By.id("1.463,59+100,00");
    //    public By itemBasedBTAsSetPriceDiscountAmountForChickenSchnitzel = By.xpath("//XCUIElementTypeStaticText[@name=\"TL -880,00\"]");
    public By itemBasedBTAsSetPriceDiscountAmountForChickenSchnitzel = By.id("TL -880,00");
    //    public By ccSidePaymentDetailAmountWithItemBasedDiscountBTAsSetPriceForChickenSchinitzel = By.xpath("//XCUIElementTypeStaticText[@name=\"1.200,00+100,00\"]");
    public By ccSidePaymentDetailAmountWithItemBasedDiscountBTAsSetPriceForChickenSchinitzel = By.id("1.200,00+100,00");
    //    public By itemBasedDiscountBTWithFreeItemPaymentDetailForChickenSchinitzel = By.xpath("//XCUIElementTypeStaticText[@name=\"144,00+100,00\"]");
    public By itemBasedDiscountBTWithFreeItemPaymentDetailForChickenSchinitzel = By.id("144,00+100,00");
    //    public By itemBasedDiscountATWithFreeItemPaymentDetailForChickenSchinitzel = By.xpath("//XCUIElementTypeStaticText[@name=\"240,00+100,00\"]");
    public By itemBasedDiscountATWithFreeItemPaymentDetailForChickenSchinitzel = By.id("240,00+100,00");
    //    public By checkBasedATAsPercentageAmountForSandwiches = By.xpath("//XCUIElementTypeStaticText[@name=\"TL 99,99\"]");
    public By checkBasedATAsPercentageAmountForSandwiches = By.id("TL 99,99");
    //    public By ccSidePaymentDetailAmountWithCheckBasedDiscountATAsPercentageForSandwiches = By.xpath("//XCUIElementTypeStaticText[@name=\"1.100,01+100,00\"]");
    public By ccSidePaymentDetailAmountWithCheckBasedDiscountATAsPercentageForSandwiches = By.id("1.000,01+100,00");
    //    public By checkBasedBTaxAsPercentageAmountForSandwiches = By.xpath("//XCUIElementTypeStaticText[@name=\"100,00\"]");
    public By checkBasedBTaxAsPercentageAmountForSandwiches = By.id("100,00");
    //    public By ccSidePaymentDetailAmountWithCheckBasedDiscountBTAsPercentage = By.xpath("//XCUIElementTypeStaticText[@name=\"1.080,00+100,00\"]");
    public By ccSidePaymentDetailAmountWithCheckBasedDiscountBTAsPercentage = By.id("1.080,00+100,00");
    //    public By checkBasedATAmountAsAmountWithSandwiches = By.xpath("//XCUIElementTypeStaticText[@name=\"5,00\"]");
    public By checkBasedATAmountAsAmountWithSandwiches = By.id("5,00");
    //    public By ccSidePaymentDetailAmountWithCheckBasedDiscountATAsAmount = By.xpath("//XCUIElementTypeStaticText[@name=\"1.195,00+100,00\"]");
    public By ccSidePaymentDetailAmountWithCheckBasedDiscountATAsAmount = By.id("1.195,00+100,00");
    //    public By sidePaymentDetailAmountWithCheckBasedDiscountBeforeTaxAsFreeItem = By.xpath("//XCUIElementTypeStaticText[@name=\"1.201,10+100,00\"]");
    public By sidePaymentDetailAmountWithCheckBasedDiscountBeforeTaxAsFreeItem = By.id("1.201,10+100,00");
    //    public By ccSidePaymentDetailAmountWithOpenItemDiscountATPercentageForSandwiches = By.xpath("//XCUIElementTypeStaticText[@name=\"1.201,10+100,00\"]");
    public By ccSidePaymentDetailAmountWithOpenItemDiscountATPercentageForSandwiches = By.id("1.101,10+100,00");
    //    public By ccSidePaymentDetailAmountWithOpenItemDiscountATForSandwiches = By.xpath("//XCUIElementTypeStaticText[@name=\"1.201,10+100,00\"]");
    public By ccSidePaymentDetailAmountWithOpenItemDiscountATForSandwiches = By.id("1.101,10+100,00");
    //    public By ccSidePaymentDetailAmountWithOpenCheckDiscountATForSandwiches = By.xpath("//XCUIElementTypeStaticText[@name=\"1.000,02+100,00\"]");
    public By ccSidePaymentDetailAmountWithOpenCheckDiscountATForSandwiches = By.id("900,02+100,00");
    //    public By ccSidePaymentDetailAmountWithOpenCheckDiscountBTForSandwiches = By.xpath("//XCUIElementTypeStaticText[@name=\"960,00+100,00\"]");
    public By ccSidePaymentDetailAmountWithOpenCheckDiscountBTForSandwiches = By.id("960,00+100,00");
    //    public By sidePaymentDetailAmountWithOpenCheckDiscountAmountBeforeTaxForSandwiches = By.xpath("//XCUIElementTypeStaticText[@name=\"1.106,00+100,00\"]");
    public By sidePaymentDetailAmountWithOpenCheckDiscountAmountBeforeTaxForSandwiches = By.id("1.106,00+100,00");
    //    public By ccSidePaymentDetailAmountWithOpenCheckDiscountBTForMargarita = By.xpath("//XCUIElementTypeStaticText[@name=\"1.105,50+100,00\"]");
    public By ccSidePaymentDetailAmountWithOpenCheckDiscountBTForMargarita = By.id("1.105,50+100,00");
    //    public By ccSidePaymentDetailAmountWithOpenCheckDiscountWithNonDecimalValueATForMargarita = By.xpath("//XCUIElementTypeStaticText[@name=\"1.101,00+100,00\"]");
    public By ccSidePaymentDetailAmountWithOpenCheckDiscountWithNonDecimalValueATForMargarita = By.id("1.101,00+100,00");
    //    public By ccSidePaymentDetailAmountWithOpenCheckDiscountWithNonDecimalValueBTForMargarita = By.xpath("//XCUIElementTypeStaticText[@name=\"1.100,00+100,00\"]");
    public By ccSidePaymentDetailAmountWithOpenCheckDiscountWithNonDecimalValueBTForMargarita = By.id("1.100,00+100,00");
    //    public By ccSidePaymentAmountWithTipsAndItemBasedDiscountATAsPercentageWithTaxExemptForSandwiches = By.xpath("//XCUIElementTypeStaticText[@name=\"899,91+100,00\"]");
    public By ccSidePaymentAmountWithTipsAndItemBasedDiscountATAsPercentageWithTaxExemptForSandwiches = By.id("899,91+100,00");
    //    public By ccSidePaymentAmountWithTipsAndItemBasedDiscountBTAsPercentageWithTaxExemptForSandwiches = By.xpath("//XCUIElementTypeStaticText[@name=\"899,90+100,00\"]");
    public By ccSidePaymentAmountWithTipsAndItemBasedDiscountBTAsPercentageWithTaxExemptForSandwiches = By.id("899,90+100,00");
    //    public By ccSidePaymentAmountWithTipsAndItemBasedDiscountATAsAmountWithTaxExemptForSandwiches = By.xpath("//XCUIElementTypeStaticText[@name=\"994,90+100,00\"]");
    public By ccSidePaymentAmountWithTipsAndItemBasedDiscountATAsAmountWithTaxExemptForSandwiches = By.id("994,90+100,00");
    //    public By ccSidePaymentAmountWithTipsAndItemBasedDiscountATAsSetPriceWithTaxExemptForSandwiches = By.xpath("//XCUIElementTypeStaticText[@name=\"29,90+100,00\"]");
    public By ccSidePaymentAmountWithTipsAndItemBasedDiscountATAsSetPriceWithTaxExemptForSandwiches = By.id("29,90+100,00");
    //    public By itemBasedDiscountAsAmountPriceBruchetta = By.xpath("//XCUIElementTypeStaticText[@name=\"10,00\"]");
    public By itemBasedDiscountAsAmountPriceBruchetta = By.id("10,00");
    //    public By itemBasedDiscountAsSetPriceAmountBruchetta = By.xpath("//XCUIElementTypeStaticText[@name=\"-500,00\"]");
    public By itemBasedDiscountAsSetPriceAmountBruchetta = By.id("-500,00");
    //    public By checkBasedBeforeTaxWithOpenItemBruchetta = By.xpath("//XCUIElementTypeStaticText[@name=\"TL 10,00\"]");
    public By checkBasedBeforeTaxWithOpenItemBruchetta = By.id("TL 10,00");
    //    public By checkBasedBeforeTaxWithOpenItemBruchettas = By.xpath("//XCUIElementTypeStaticText[@name=\"9,71\"]");
    public By checkBasedBeforeTaxWithOpenItemBruchettas = By.id("9,71");
    public By firstModifier = By.xpath("(//XCUIElementTypeStaticText[@name=\"Add Veggies\"])[2]");
    public By selectedModifierInOrderPage = By.id("Add Veggies");
    //    public By addedModifierOfFirstItemName = By.xpath("//XCUIElementTypeStaticText[@name=\" 1/2 Romano\"]");
    public By addedModifierOfFirstItemName = By.id(" 1/2 Romano");
    //    public By seatTwoTotal = By.xpath("//XCUIElementTypeStaticText[@name=\"TL 2.400,00\"]");
    public By seatTwoTotal = By.id("TL 2.200,00");
    //    public By checkBasedDiscountPercentage = By.xpath("//XCUIElementTypeStaticText[@name=\"TL 100,00\"]");
    public By checkBasedDiscountPercentage = By.id("TL 100,00");
    //    public By withoutGratuityTotalAmount = By.xpath("//XCUIElementTypeStaticText[@name=\"TL 1.200,00\"]");
    public By withoutGratuityTotalAmount = By.id("TL 1.100,00");
    //    public By totalAmountWithGratuity = By.xpath("//XCUIElementTypeStaticText[@name=\"TL 1.299,99\"]");
    public By totalAmountWithGratuity = By.id("TL 1.199,99");
    //    public By sideCCPaymentDetailAmountWithGratuityFixAndWithTips = By.xpath("//XCUIElementTypeStaticText[@name=\"1.299,99+100,00\"]");
    public By sideCCPaymentDetailAmountWithGratuityFixAndWithTips = By.id("1.199,99+100,00");
    //    public By sideCCPaymentDetailAmountWithGratuityVaryingAndWithTips = By.xpath("//XCUIElementTypeStaticText[@name=\"1.349,99+100,00\"]");
    public By sideCCPaymentDetailAmountWithGratuityVaryingAndWithTips = By.id("1.249,99+100,00");
    //    public By addNewCustomerTab = By.xpath("//XCUIElementTypeButton[@name=\"Add New\"]");
    public By addNewCustomerTab = By.id("Add New");
    //    public By numberoneinHA = By.xpath("//XCUIElementTypeButton[@name=\"1\"]");
    public By numberoneinHA = By.id("1");
    //    public By numberZeroInHa = By.xpath("//XCUIElementTypeButton[@name=\"0\"]");
    public By numberZeroInHa = By.id("0");
    //    public By numberDoubleZeroInHa = By.xpath("//XCUIElementTypeButton[@name=\"00\"]");
    public By numberDoubleZeroInHa = By.id("00");
    //    public By numberTwoInHa = By.xpath("//XCUIElementTypeButton[@name=\"2\"]");
    public By numberTwoInHa = By.id("2");
    public By rechargeTxtFieldInHa = By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTextField[3]");
    //    public By existingCustomerName = By.xpath("//XCUIElementTypeButton[@name=\"goknur b\"]");
    public By existingCustomerName = By.id("goknur b");
    public By addedModifierInMenuItemPage = By.xpath("//XCUIElementTypeStaticText[@name=\" Add Veggies\"]");
    //    public By addedModifierInMenuItemPage = By.id(" Add Veggies");
//    public By fourthModifierForSecondMenuItem = By.xpath("//XCUIElementTypeStaticText[@name=\"1/2 Mel\"]");
    public By fourthModifierForSecondMenuItem = By.id("1/2 Mel");
    //    public By activeDriver = By.xpath("//XCUIElementTypeStaticText[@name=\"john\"]");
    public By activeDriver = By.id("john");
    //    public By totalPriceOfItemBasedDiscountATAsPercentageWithTaxExemptForSandwiches = By.xpath("//XCUIElementTypeStaticText[@name=\"TL 899,91\"]");
    public By totalPriceOfItemBasedDiscountATAsPercentageWithTaxExemptForSandwiches = By.id("TL 899,91");
    //    public By ccSidePaymentAmountWithTipsAndItemBasedDiscountATAsPercentageWithTaxExemptForSandwiches1 = By.xpath("//XCUIElementTypeStaticText[@name=\"899,91\"]");
    public By ccSidePaymentAmountWithTipsAndItemBasedDiscountATAsPercentageWithTaxExemptForSandwiches1 = By.id("899,91");
    //    public By totalPriceOfItemBasedDiscountBTAsPercentageWithTaxExemptForSandwiches = By.xpath("//XCUIElementTypeStaticText[@name=\"TL 899,90\"]");
    public By totalPriceOfItemBasedDiscountBTAsPercentageWithTaxExemptForSandwiches = By.id("TL 899,90");
    //    public By ccSidePaymentAmountWithTipsAndItemBasedDiscountBTAsPercentageWithTaxExemptForSandwiches1 = By.xpath("//XCUIElementTypeStaticText[@name=\"899,90\"]");
    public By ccSidePaymentAmountWithTipsAndItemBasedDiscountBTAsPercentageWithTaxExemptForSandwiches1 = By.id("899,90");
    //    public By totalPriceOfItemBasedDiscountATAsAmountWithTaxExemptForSandwiches = By.xpath("//XCUIElementTypeStaticText[@name=\"TL 989,90\"]");
    public By totalPriceOfItemBasedDiscountATAsAmountWithTaxExemptForSandwiches = By.id("TL 989,90");
    //    public By ccSidePaymentAmountWithTipsAndItemBasedDiscountATAsAmountWithTaxExemptForSandwiches1 = By.xpath("//XCUIElementTypeStaticText[@name=\"989,90\"]");
    public By ccSidePaymentAmountWithTipsAndItemBasedDiscountATAsAmountWithTaxExemptForSandwiches1 = By.id("989,90");
    //    public By totalPriceOfItemBasedDiscountATAsSetPriceWithTaxExemptForSandwiches = By.xpath("//XCUIElementTypeStaticText[@name=\"TL 999,90\"]");
    public By totalPriceOfItemBasedDiscountATAsSetPriceWithTaxExemptForSandwiches = By.id("TL 999,90");
    //    public By ccSidePaymentAmountWithTipsAndItemBasedDiscountATAsSetPriceWithTaxExemptForSandwiches1 = By.xpath("//XCUIElementTypeStaticText[@name=\"999,90\"]");
    public By ccSidePaymentAmountWithTipsAndItemBasedDiscountATAsSetPriceWithTaxExemptForSandwiches1 = By.id("999,90");
    //    public By totalPriceOfItemBasedDiscountBTAsSetPriceWithTaxExemptForSandwiches = By.xpath("//XCUIElementTypeStaticText[@name=\"TL 999,90\"]");
    public By totalPriceOfItemBasedDiscountBTAsSetPriceWithTaxExemptForSandwiches = By.id("TL 999,90");
    //    public By freeMenuItemAmountWithSandwich1 = By.xpath("//XCUIElementTypeStaticText[@name=\"TL 1.079,90\"]");
    public By freeMenuItemAmountWithSandwich1 = By.id("TL 1.079,90");
    //    public By ccSidePaymentAmountWithTipsAndItemBasedDiscountBTAsFreeItemWithTaxExemptForSandwiches = By.xpath("//XCUIElementTypeStaticText[@name=\"1.079,90\"]");
    public By ccSidePaymentAmountWithTipsAndItemBasedDiscountBTAsFreeItemWithTaxExemptForSandwiches = By.id("1.079,90");
    //    public By ccSidePaymentDetailAmountWithCheckBasedDiscountBTAsFreeItem = By.xpath("//XCUIElementTypeStaticText[@name=\"2.211,00+100,00\"]");
    public By ccSidePaymentDetailAmountWithCheckBasedDiscountBTAsFreeItem = By.id("2.211,00+100,00");
    //    public By hideKeyboardBack = By.xpath("//XCUIElementTypeButton[@name=\"Hide keyboard\"]");
    public By hideKeyboardBack = By.id("Hide keyboard");

    //nov 11
//    public By inclusiveTaxAmount1 = By.xpath("//XCUIElementTypeStaticText[@name=\"TL 200,10\"]");
    public By inclusiveTaxAmount1 = By.id("TL 100,10");
    public By exclusiveTaxAmount1 = By.id("TL 200,10");
    //    public By quantityBasedTaxAmountOnOnionRings1 = By.xpath("//XCUIElementTypeStaticText[@name=\"TL 33,00\"]");
    public By quantityBasedTaxAmountOnOnionRings1 = By.id("TL 33,00");
    //    public By inclusiveTaxAmountOnCheesePizza1 = By.xpath("//XCUIElementTypeStaticText[@name=\"TL 0,12\"]");
    public By inclusiveTaxAmountOnCheesePizza1 = By.id("TL 0,12");
    //    public By checkBasedTaxWithoutSubtotalAmountOnMargarita1 = By.xpath("//XCUIElementTypeStaticText[@name=\"TL 171,70\"]");
    public By checkBasedTaxWithoutSubtotalAmountOnMargarita1 = By.id("TL 171,70");

    //    public By checkBasedTaxWithSubtotalAmountOnPizzaTomBasili1 = By.xpath("//XCUIElementTypeStaticText[@name=\"TL 463,59\"]");
    public By checkBasedTaxWithSubtotalAmountOnPizzaTomBasili1 = By.id("TL 463,59");
    //    public By taxOnItemTaxForInclusiveTaxTextOnNeapolitanPizza1 = By.xpath("//XCUIElementTypeStaticText[@name=\"TL 101,00\"]");
    public By taxOnItemTaxForInclusiveTaxTextOnNeapolitanPizza1 = By.id("TL 101,00");
    //    public By baconOmeletTotalPriceWithExclusiveTax1 = By.xpath("//XCUIElementTypeStaticText[@name=\"TL 0,06\"]");
    public By baconOmeletTotalPriceWithExclusiveTax1 = By.id("TL 0,06");
    //    public By mantiTotalPriceWithInclusiveTax1 = By.xpath("//XCUIElementTypeStaticText[@name=\"TL 0,05\"]");
    public By mantiTotalPriceWithInclusiveTax1 = By.id("TL 0,05");
    //    public By ccSidePaymentAmountWithTipsAndItemBasedDiscountATAsSetPriceWithTaxExemptForSandwiches2 = By.xpath("//XCUIElementTypeStaticText[@name=\"999,90+100,00\"]");
    public By ccSidePaymentAmountWithTipsAndItemBasedDiscountATAsSetPriceWithTaxExemptForSandwiches2 = By.id("999,90+100,00");
    //    public By selectedCustomerNameForBarTab1 = By.xpath("//XCUIElementTypeButton[@name=\"john k\"]");
    public By selectedCustomerNameForBarTab1 = By.id("john k");
    //    public By ccSidePaymentDetailAmountWithTaxExemptAndWithTipsWithPreDefinedCustomer1 = By.xpath("//XCUIElementTypeStaticText[@name=\"999,90+100,00\"]");
    public By ccSidePaymentDetailAmountWithTaxExemptAndWithTipsWithPreDefinedCustomer1 = By.id("999,90+100,00");
    //    public By voidSandwichesAmount1 = By.xpath("//XCUIElementTypeStaticText[@name=\"1.200,00\"]");
    public By voidSandwichesAmount1 = By.id("1.100,00");
    public By fourthMenuItem1 = By.xpath("//XCUIElementTypeStaticText[@name=\"Fried Crab Cakes \"]");
    //    public By exlusiveTaxAmount1 = By.xpath("//XCUIElementTypeStaticText[@name=\"TL 26,71\"]");
    public By exlusiveTaxAmount1 = By.id("TL 26,71");
    //    public By paymentMadeOnMessage1 = By.xpath("//XCUIElementTypeTextView[@name=\"Payment(s) made on this check,Can you return this to thomas\"]");
    public By paymentMadeOnMessage1 = By.id("Payment(s) made on this check,Can you return this to thomas");
    //    public By selectTable1 = By.xpath("//XCUIElementTypeStaticText[@name=\"T19\"]");
    public By selectTable1 = By.id("T19");
    // Added Nov 16
//    public By subtotalAmountWithTaxExempt1 = By.xpath("//XCUIElementTypeStaticText[@name=\"TL 1.999,80\"]");
    public By subtotalAmountWithTaxExempt1 = By.id("TL 1.999,80");
    //    public By totalAmountWithTaxExempt1 = By.xpath("//XCUIElementTypeStaticText[@name=\"TL 1.979,80\"]");
    public By totalAmountWithTaxExempt1 = By.id("TL 1.979,80");
    public By fixGratuityAmount1 = By.id("TL 197,98");

    // add new element
//    public By splitCheckPageTitle = By.xpath("//XCUIElementTypeStaticText[@name=\"Split Check\"]");
    public By splitCheckPageTitle = By.id("Split Check");
    public By seperatedItem = By.xpath("//XCUIElementTypeStaticText[@name=\"SANDWICHES \"]");
    //    public By splitCheckOnMenuItemPage = By.xpath("//XCUIElementTypeStaticText[@name=\"SPLIT CHECK\"]");
    public By splitCheckOnMenuItemPage = By.id("SPLIT CHECK");
    //    public By cashPaymentWithoutMethodDiyez = By.xpath("//XCUIElementTypeStaticText[@name=\"1. Cash\"]");
    public By cashPaymentWithoutMethodDiyez = By.id("1. Cash");

    //add new xpath
//    public By customerProfileClosedButton = By.xpath("//XCUIElementTypeButton[@name=\"CustomerProfile Close\"]");
    public By customerProfileClosedButton = By.id("CustomerProfile Close");
    //    public By editBtnOnPhoneOrderTab = By.xpath("//XCUIElementTypeButton[@name=\"Edit\"]");
    public By editBtnOnPhoneOrderTab = By.id("Edit");
    public By firstOrderForSeparate = By.xpath("(//XCUIElementTypeStaticText[@name=\"SANDWICHES \"])[1]");

    //edit element
    public By firstSeatTitle = By.xpath("//XCUIElementTypeStaticText[@name=\"Seat 1\"]");
    public By seatTwoForGroupSeat = By.xpath("(//XCUIElementTypeStaticText[@name=\"Seat 2\"])[2]");
    //    public By voidSandwichesAmount = By.xpath("//XCUIElementTypeStaticText[@name=\"2.420,02\"]");
    public By voidSandwichesAmount = By.id("2.420,02");
    public By separatedFirstItemAmount = By.xpath("(//XCUIElementTypeStaticText[@name=\"500,00\"])[1]");
    public By separatedSecondItemAmount = By.xpath("(//XCUIElementTypeStaticText[@name=\"500,00\"])[2]");
    //nov 17
//    public By checkBasedBeforeTaxWithOpenItemBruchettas1 = By.xpath("//XCUIElementTypeStaticText[@name=\"9,86\"]");
    public By checkBasedBeforeTaxWithOpenItemBruchettas1 = By.id("9,86");
    //    public By checkBasedAmountAfterTaxForBruchetta1 = By.xpath("//XCUIElementTypeStaticText[@name=\"100,00\"]");
    public By checkBasedAmountAfterTaxForBruchetta1 = By.id("100,00");
    //    public By checkBasedAfterTaxWithSetPriceAmountForBruchetta1 = By.xpath("//XCUIElementTypeStaticText[@name=\"TL 970,00\"]");
    public By checkBasedAfterTaxWithSetPriceAmountForBruchetta1 = By.id("TL 970,00");
    //    public By itemBasedDiscountBeforeTaxAsAmount1 = By.xpath("//XCUIElementTypeStaticText[@name=\"IB-AfterTax-Amount\"]");
    public By itemBasedDiscountBeforeTaxAsAmount1 = By.id("IB-AfterTax-Amount");
    //    public By itemBasedDiscountAsSetPriceAmountBruchetta1 = By.xpath("//XCUIElementTypeStaticText[@name=\"0,00\"]");
    public By itemBasedDiscountAsSetPriceAmountBruchetta1 = By.id("0,00");
    //    public By sidePaymentDetailAmountWithCheckBasedDiscountBeforeTaxAsFreeItem1 = By.xpath("//XCUIElementTypeStaticText[@name=\"1.200,00+100,00\"]");
    public By sidePaymentDetailAmountWithCheckBasedDiscountBeforeTaxAsFreeItem1 = By.id("1.200,00+100,00");
    //    public By openCheckDiscountPercentage1 = By.xpath("//XCUIElementTypeStaticText[@name=\"5,00\"]");
    public By openCheckDiscountPercentage1 = By.id("5,00");
    public By openCheckDiscountPercentageOnOrderSide1 = By.id("24,00");
    //    public By checkBasedPercentageDiscountWithAfterTaxAmountAppliedOpenItem1 = By.xpath("//XCUIElementTypeStaticText[@name=\"99,99\"]");
    public By checkBasedPercentageDiscountWithAfterTaxAmountAppliedOpenItem1 = By.id("99,99");
    //    public By checkBasedAmountDiscountWithAfterTaxAmount1 = By.xpath("//XCUIElementTypeStaticText[@name=\"TL 5,00\"]");
    public By checkBasedAmountDiscountWithAfterTaxAmount1 = By.id("TL 5,00");
    //    public By afterTaxDayRestrictDiscountAmount1 = By.xpath("//XCUIElementTypeStaticText[@name=\"TL 1,00\"]");
    public By afterTaxDayRestrictDiscountAmount1 = By.id("TL 1,00");
    //    public By itemBasedDiscountBeforeTaxRestrictDay1 = By.xpath("//XCUIElementTypeStaticText[@name=\"After Tax Day Restriction\"]");
    public By itemBasedDiscountBeforeTaxRestrictDay1 = By.id("After Tax Day Restriction");
    //    public By checkBasedDiscountBeforeTaxDayRestrict1 = By.xpath("//XCUIElementTypeStaticText[@name=\"CB-BeforeTax-RestrictDay\"]");
    public By checkBasedDiscountBeforeTaxDayRestrict1 = By.id("CB-BeforeTax-RestrictDay");
    //    public By subtotalAmountWithTaxExempt2 = By.xpath("//XCUIElementTypeStaticText[@name=\"TL 1.999,80\"]");
    public By subtotalAmountWithTaxExempt2 = By.id("TL 1.999,80");
    //    public By totalAmountWithTaxExempt2 = By.xpath("//XCUIElementTypeStaticText[@name=\"TL 1.979,80\"]");
    public By totalAmountWithTaxExempt2 = By.id("TL 1.979,80");
    public By BtnNumberOne = By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeButton[@name=\"1\"]");
    //    public By editDoneButton = By.id("done DeleteSeats");
//    public By giftCardDone = By.xpath("//XCUIElementTypeButton[@name=\"Done\"]");
    public By giftCardDone = By.id("Done");
    public By giftCardNumberSix = By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeButton[@name=\"6\"]");
    //    public By partialPaidAmountWithGiftCard1 = By.xpath("//XCUIElementTypeStaticText[@name=\"20,00\"]");
    public By partialPaidAmountWithGiftCard1 = By.id("20,00");
    //    public By partialPaidAmountWithGiftCard2 = By.xpath("//XCUIElementTypeStaticText[@name=\"20,00+10,00\"]");
    public By partialPaidAmountWithGiftCard2 = By.id("20,00+10,00");
    //    public By orderWillBeSplited1 = By.xpath("//XCUIElementTypeStaticText[@name=\"T23\"]");
    public By orderWillBeSplited1 = By.id("T23");
    public By giveXCardNumberOnMenuItemPage1 = By.xpath("(//XCUIElementTypeStaticText[@name=\"GCX-603628237912001380863 \"])[2]");
    //    public By giveXCardNumberOnMenuItemPage2 = By.xpath("(//XCUIElementTypeStaticText[@name=\"GCX-603628237912001380863\"])[2]");
    public By firstTable1 = By.xpath("//XCUIElementTypeStaticText[@name=\"T25\"]");
    public By firstTable11 = By.xpath("//XCUIElementTypeStaticText[@name=\"T20\"]");
    //    public By firstTable1 = By.id("T25");
    String cardNumberTxtField = "//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeTextField";
    //    public By selectTable2 = By.xpath("//XCUIElementTypeStaticText[@name=\"T23\"]");
    public By selectTable2 = By.id("T23");
    public By btnMerge = By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeButton[3]");
    //    public By firstTable2 = By.xpath("//XCUIElementTypeStaticText[@name=\"T10\"]");
    public By firstTable2 = By.id("T10");
    //    public By secondTable2 = By.xpath("//XCUIElementTypeStaticText[@name=\"T12\"]");
    public By secondTable2 = By.id("T12");
    //    public By splitBySeatOption1 = By.xpath("//XCUIElementTypeStaticText[@name=\"Split by seat\"]");
    public By splitBySeatOption1 = By.id("Split by seat");

    //    Nov 19
//    public By splitBySeatButtonOnTableLayout1 = By.xpath("//XCUIElementTypeStaticText[@name=\"Split by seat\"]");
    public By splitBySeatButtonOnTableLayout1 = By.id("Split by seat");
    //    public By tableNoSix = By.xpath("//XCUIElementTypeStaticText[@name=\"T6\"]");
    public By tableNoSix = By.id("T17");
    public By splitedOrderForFirstCheck1 = By.xpath("(//XCUIElementTypeStaticText[@name=\"SANDWICHES \"])[1]");
    public By splitedOrderForSecondCheck1 = By.xpath("(//XCUIElementTypeStaticText[@name=\"SANDWICHES \"])[2]");
    public By separateItemNumber1 = By.xpath("(//XCUIElementTypeStaticText[@name=\"2\"])[2]");
    public By firstSeatTitle1 = By.xpath("(//XCUIElementTypeStaticText[@name=\"Seat 1\"])[2]");
    //    public By pizzaMargaritaTotalPrice1 = By.xpath("//XCUIElementTypeStaticText[@name=\"TL 2.999,70\"]");
    public By pizzaMargaritaTotalPrice1 = By.id("TL 2.999,70");
    public By seatTwoForGroupSeat1 = By.id("Seat 2");
    //    public By seatOneForGroupSeat1 = By.xpath("//XCUIElementTypeStaticText[@name=\"Seat 1\"]");
    public By seatOneForGroupSeat1 = By.id("Seat 1");

    // nov 29
    public By ccSidePaymentDetailAmountWithOpenCheckDiscountAfterTaxWithAmountForMargarita1= By.id("1.099,00+10,00");


    // 04 July 2022
    public By allTabInQSR = By.xpath("//XCUIElementTypeButton[@name=\"All\"]");
    public By tableLayoutTab = By.xpath("//XCUIElementTypeButton[@name=\"Table Layout\"]");
    public By tables = By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeScrollView/XCUIElementTypeOther[1]/XCUIElementTypeButton");
    public By selectTheNumberOfTable = By.xpath("//XCUIElementTypeButton[@name=\"1\"]");
    public By transferBtn = By.id("Transfer");
    public By transferToServerBtn = By.id("Transfer to Server");
    public By transferToTableBtn = By.id("Transfer to Table");
    public By transferItemBtn = By.id("Transfer Item");
    public By transferFromTble = By.id("Transfer From");
    public By transferToTble = By.id("Transfer To");
    public By firstElementOfTransferFromTable = By.xpath("//XCUIElementTypeStaticText[@name=\"Transfer From\"]/../XCUIElementTypeTable//XCUIElementTypeCell[1]/XCUIElementTypeStaticText[1]");
    public By secElementOfTransferFromTable = By.xpath("//XCUIElementTypeStaticText[@name=\"Transfer From\"]/../XCUIElementTypeTable//XCUIElementTypeCell[2]/XCUIElementTypeStaticText[1]");
    public By thirdElementOfTransferFromTable = By.xpath("//XCUIElementTypeStaticText[@name=\"Transfer From\"]/../XCUIElementTypeTable//XCUIElementTypeCell[3]/XCUIElementTypeStaticText[1]");
    //XCUIElementTypeApplication[@name="Linga POS"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeTable/XCUIElementTypeCell
    public By firstIteminMenuItemTable = By.xpath("//XCUIElementTypeStaticText[@name=\"Menu Item\"]/../XCUIElementTypeTable//XCUIElementTypeCell[1]//XCUIElementTypeStaticText[1]");
    public By secIteminMenuItemTable = By.xpath("//XCUIElementTypeStaticText[@name=\"Menu Item\"]/../XCUIElementTypeTable//XCUIElementTypeCell[2]//XCUIElementTypeStaticText[1]");
    public By thirdIteminMenuItemTable = By.xpath("//XCUIElementTypeStaticText[@name=\"Menu Item\"]/../XCUIElementTypeTable//XCUIElementTypeCell[3]//XCUIElementTypeStaticText[1]");
    public By firstCheckInChecksTable = By.xpath("//XCUIElementTypeStaticText[@name=\"Checks\"]/../XCUIElementTypeCollectionView/XCUIElementTypeCell[1]");
    public By secondCheckInChecksTable = By.xpath("//XCUIElementTypeStaticText[@name=\"Checks\"]/../XCUIElementTypeCollectionView/XCUIElementTypeCell[2]");
    public By thirdCheckInChecksTable = By.xpath("//XCUIElementTypeStaticText[@name=\"Checks\"]/../XCUIElementTypeCollectionView/XCUIElementTypeCell[3]");
    public By firstElementOfTransferToTable = By.xpath("//XCUIElementTypeStaticText[@name=\"Transfer To\"]/../XCUIElementTypeTable//XCUIElementTypeCell[1]/XCUIElementTypeStaticText[1]");
    public By secElementOfTransferToTable = By.xpath("//XCUIElementTypeStaticText[@name=\"Transfer To\"]/../XCUIElementTypeTable//XCUIElementTypeCell[2]/XCUIElementTypeStaticText[1]");
    public By thirdElementOfTransferToTable = By.xpath("//XCUIElementTypeStaticText[@name=\"Transfer To\"]/../XCUIElementTypeTable//XCUIElementTypeCell[3]/XCUIElementTypeStaticText[1]");
    public By doneBtnInTransferWindow = By.xpath("//XCUIElementTypeStaticText[@name=\"Done\"]");
    public By successmessageOfTransfer = By.id("Transferred check success.");
    public By successmessageOfCheckTransfer = By.id("Transferred Successfully");
    public By finishbtnInOrderScreen = By.id("finish");
    public By checkStatstab = By.id("Check Stats");
    public By activeChecksDetailsIcon = By.xpath("//XCUIElementTypeButton[@name=\"CheckDetialsIconDisable\"]");
    public By openCheckbuttonInCheckStatsScreen = By.id("openCheck");
    public By tableNameInTheFirstCheckAndTheCheckInChecksTable = By.xpath("//XCUIElementTypeStaticText[@name=\"Checks\"]/../XCUIElementTypeCollectionView/XCUIElementTypeCell[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeStaticText[1]");
    public By serverNameInTheFirstCheckAndTheCheckInChecksTable=By.xpath("//XCUIElementTypeStaticText[@name=\"Checks\"]/../XCUIElementTypeCollectionView/XCUIElementTypeCell[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeStaticText[3]");
    public By closeBtnFromChecksPopup = By.xpath("//XCUIElementTypeStaticText[@name=\"X\"]");
    public By offlineServerTransactionConfirmation = By.xpath("//XCUIElementTypeStaticText[@name=\"Employee is offline   Still Do you want to continue\"]");


}