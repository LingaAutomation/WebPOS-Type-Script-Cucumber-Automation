package com.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TGglobalElement {

    String secondBarTabCheck = "(//XCUIElementTypeStaticText[@name=\"Test Automation\"])[1]";
    //Discount
    String discountPercentage = "//XCUIElementTypeStaticText[@name=\"10%\"]";
    String checkBasedDiscountBeforeTaxWithOpenItem = "CB-BeforeTax-FreeItem";
    //    String checkBasedDiscountBeforeTaxWithOpenItem = "//XCUIElementTypeStaticText[@name=\"CB-BeforeTax-FreeItem\"]";
    String itemBasedDiscountAfterTaxAsAmount = "IB-AfterTax-Amount";
    //    String itemBasedDiscountAfterTaxAsAmount = "//XCUIElementTypeStaticText[@name=\"IB-AfterTax-Amount\"]";
    String itemDiscountTab = "Item Discount";
    //    String itemDiscountTab = "//XCUIElementTypeStaticText[@name=\"Item Discount\"]";
    String itemDiscount = "All days - Item Discount";
    //    String itemDiscount = "//XCUIElementTypeStaticText[@name=\"All days - Item Discount\"]"; //it should be accessibility-id
    String itemDiscountAmount = "//XCUIElementTypeStaticText[@name=\"5,00\"]"; //it should be accessibility-id
    String discountOption = "Discount";
    String checkDiscountOption = "Check Discount";
    //    String checkDiscountOption = "//XCUIElementTypeStaticText[@name=\"Check Discount\"]";
    String itemBasedDiscountOption = "Item-Based Discount";
//    String itemBasedDiscountOption = "//XCUIElementTypeStaticText[@name=\"Item-Based Discount\"]";

    String backButton = "Back";
//    String backButton = "//XCUIElementTypeStaticText[@name=\"Back\"]";

    String itemBasedDiscount = "//XCUIElementTypeStaticText[@name=\"5,00\"]";
    String itemBasedDiscountAmountOnBill = "//XCUIElementTypeStaticText[@name=\"TL 5,00\"]";
    String totalDiscount = "(//XCUIElementTypeStaticText[@name=\"5,00\"])[1]";

    String checkBasedDiscount = "Check-Based Discount";
//    String checkBasedDiscount = "//XCUIElementTypeStaticText[@name=\"Check-Based Discount\"]";

    String discountWithAmount = "ItemBased with Amount";
//    String discountWithAmount = "//XCUIElementTypeStaticText[@name=\"ItemBased with Amount\"]";

    String discountWithAmountPrice = "(//XCUIElementTypeStaticText[@name=\"1.000,00\"])[2]";


    String discountWithPercentage = "ItemBased with Percentage";

    String discountBackButton = "Back";
//    String discountBackButton = "//XCUIElementTypeStaticText[@name=\"Back\"]";

    String freeItemOption = "Free Item";

    String checkBasedAmount = "Check Based Amount";
//    String checkBasedAmount = "//XCUIElementTypeStaticText[@name=\"Check Based Amount\"]";

    String checkBasedPercentage = "Check-Based Percentage";
//    String checkBasedPercentage = "//XCUIElementTypeStaticText[@name=\"Check-Based Percentage\"]";

    String checkBasedFreeOption = "Check Based Free";
//    String checkBasedFreeOption = "//XCUIElementTypeStaticText[@name=\"Check Based Free\"]";


    String checkBasedFreeOptionAfterApplied = "Check Based Free";

    String checkBasedSetPriceOption = "Check Based Set Price";
//    String checkBasedSetPriceOption = "//XCUIElementTypeStaticText[@name=\"Check Based Set Price\"]";

    String itemBasedWithAmount = "ItemBased with Amount";
//    String itemBasedWithAmount = "//XCUIElementTypeStaticText[@name=\"ItemBased with Amount\"]";

    String itemBasedWithPercentage = "ItemBased with Percentage";
//    String itemBasedWithPercentage = "//XCUIElementTypeStaticText[@name=\"ItemBased with Percentage\"]";

    String itemBasedWithFree = "Item-Based with Free";
//    String itemBasedWithFree = "//XCUIElementTypeStaticText[@name=\"Item-Based with Free\"]";

    String emptyDiscountOption = "//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeCollectionView";

    String itemBasedDiscountAfterTax = "IB-DiscountAfterTax";
//    String itemBasedDiscountAfterTax = "//XCUIElementTypeStaticText[@name=\"IB-DiscountAfterTax\"]";

    String itemBasedDiscountAfterTaxDayRestrict = "After Tax Day Restriction";
//    String itemBasedDiscountAfterTaxDayRestrict = "//XCUIElementTypeStaticText[@name=\"After Tax Day Restriction\"]";

    String itemBasedDiscountBeforeTaxRoleRestrict = "BeforeTaxRoleRestriction";
//    String itemBasedDiscountBeforeTaxRoleRestrict = "//XCUIElementTypeStaticText[@name=\"BeforeTaxRoleRestriction\"]";

    String itemBasedDiscountAfterTaxRoleRestrict = "AfterTax-RoleRestriction";
//    String itemBasedDiscountAfterTaxRoleRestrict = "//XCUIElementTypeStaticText[@name=\"AfterTax-RoleRestriction\"]";

    String checkBasedDiscountAfterTax = "CB-PercentageAfterTax";
//    String checkBasedDiscountAfterTax = "//XCUIElementTypeStaticText[@name=\"CB-PercentageAfterTax\"]";

    String itemBasedDiscountBeforeTaxRestrictDay = "BeforeTaxDayRestriction";
//    String itemBasedDiscountBeforeTaxRestrictDay = "//XCUIElementTypeStaticText[@name=\"BeforeTaxDayRestriction\"]";

    String afterTaxDayRestrictDiscountTitle = "Discount";
//    String afterTaxDayRestrictDiscountTitle = "//XCUIElementTypeStaticText[@name=\"Discount\"]";

    String afterTaxDayRestrictDiscountAmount = "//XCUIElementTypeStaticText[@name=\"TL 0,50\"]";

    String beforeTaxDayRestrictDiscountTitle = "Discount";
//    String beforeTaxDayRestrictDiscountTitle = "//XCUIElementTypeStaticText[@name=\"Discount\"]";


    String beforeTaxDayRestrictDiscountAmount = "//XCUIElementTypeStaticText[@name=\"TL 0,50\"]";

    String AfterTaxDayRestrictWarningText = "Paid amount exceeds the sale amount";
//    String AfterTaxDayRestrictWarningText = "//XCUIElementTypeTextView[@name=\"Paid amount exceeds the sale amount\"]";

    String doneButton = "//button[contains(.,'Done')]";
//    String doneButton = "//XCUIElementTypeStaticText[@name=\"Done\"]";

    String checkBasedBeforeTax = "CheckBased-BeforeTax";
//    String checkBasedBeforeTax = "//XCUIElementTypeStaticText[@name=\"CheckBased-BeforeTax\"]";

    String checkBasedBeforeTaxText = "//div[@class='discount-section']//div[contains(.,'CheckBased-BeforeTax')]";
//    String checkBasedBeforeTaxText = "//XCUIElementTypeStaticText[@name=\"CheckBased-BeforeTax\"]";

    String checkBasedDiscountBeforeTaxDayRestrict = "CB-AfterTax-RestrictDay";
//    String checkBasedDiscountBeforeTaxDayRestrict = "//XCUIElementTypeStaticText[@name=\"CB-AfterTax-RestrictDay\"]";

    String checkBasedDiscountBeforeTaxDayRestrictText = "CB-AfterTax-RestrictDay";
//    String checkBasedDiscountBeforeTaxDayRestrictText = "//XCUIElementTypeStaticText[@name=\"CB-AfterTax-RestrictDay\"]";

    String checkBasedDiscountBeforeTaxRoleRestrict = "//div[@class='discount-section']//div[contains(.,'CB-AfterTax-RestrictRole')]";
//    String checkBasedDiscountBeforeTaxRoleRestrict = "//XCUIElementTypeStaticText[@name=\"CB-AfterTax-RestrictRole\"]";

    String checkBasedDiscountBeforeTaxRoleRestrictText = "CB-AfterTax-RestrictRole";
//    String checkBasedDiscountBeforeTaxRoleRestrictText = "//XCUIElementTypeStaticText[@name=\"CB-AfterTax-RestrictRole\"]";

    String checkBasedDiscountAfterTaxOpenItem = "CB-AfterTax-OpenItem";
//    String checkBasedDiscountAfterTaxOpenItem = "//XCUIElementTypeStaticText[@name=\"CB-AfterTax-OpenItem\"]";


    String numberOne = "//button[.='1']";

    String numberOne1 = "1";
//    String numberOne1 = "//XCUIElementTypeStaticText[@name=\"1\"]";

    String numberFive = "//button[.='5']";
//    String numberFive = "//XCUIElementTypeStaticText[@name=\"5\"]";

    String numberDoubleZero = "//button[.='00']";
//    String numberDoubleZero = "//XCUIElementTypeStaticText[@name=\"00\"]";

    String continueButton = "//button[contains(.,' Process Payment ')]";
//    String continueButton = "//XCUIElementTypeStaticText[@name=\"Continue\"]";

    String itemBasedFreeDiscountOptionWhichHasBeforeTax = "IB-FreeDiscountBeforeTax";
//    String itemBasedFreeDiscountOptionWhichHasBeforeTax = "//XCUIElementTypeStaticText[@name=\"IB-FreeDiscountBeforeTax\"]";

    String checkBasedPercentageDiscountOptionWhichHasAfterTax = "CB-PercentageAfterTax";
//    String checkBasedPercentageDiscountOptionWhichHasAfterTax = "//XCUIElementTypeStaticText[@name=\"CB-PercentageAfterTax\"]";

    String checkBasedAmountDiscountOptionWhichHasAfterTax = "CheckBasedAmountAfterTax";
//    String checkBasedAmountDiscountOptionWhichHasAfterTax = "//XCUIElementTypeStaticText[@name=\"CheckBasedAmountAfterTax\"]";

    String checkBasedPercentageBeforeTax = "CB-PercentageBeforeTax";
//    String checkBasedPercentageBeforeTax = "//XCUIElementTypeStaticText[@name=\"CB-PercentageBeforeTax\"]";

    String checkBasedAmountBeforeTax = "CB-Amount-BeforeTax";
//    String checkBasedAmountBeforeTax = "//XCUIElementTypeStaticText[@name=\"CB-Amount-BeforeTax\"]";

    String checkBasedSetPriceBeforeTax = "CB-SetPriceBeforeTax";
//    String checkBasedSetPriceBeforeTax = "//XCUIElementTypeStaticText[@name=\"CB-SetPriceBeforeTax\"]";


    String checkBasedFreeBeforeTax = "CB-Free-BeforeTax";
//    String checkBasedFreeBeforeTax = "//XCUIElementTypeStaticText[@name=\"CB-Free-BeforeTax\"]";

    String checkBasedFreeAfterTax = "Check Based Free";
//    String checkBasedFreeAfterTax = "//XCUIElementTypeStaticText[@name=\"Check Based Free\"]";

    String openDiscountAmountTexBox = "//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeTextField";

    String openDiscountAfterTaxOption = "After";
//    String openDiscountAfterTaxOption = "//XCUIElementTypeStaticText[@name=\"After\"]";

    String openCheckDiscountAmountOnOrderSide = "100,05";
//    String openCheckDiscountAmountOnOrderSide = "//XCUIElementTypeStaticText[@name=\"100,05\"]";

    String openCheckDiscountAmountOnPriceSide = "TL 100,05";
//    String openCheckDiscountAmountOnPriceSide = "//XCUIElementTypeStaticText[@name=\"TL 100,05\"]";

    String openDiscountPercentageTexBox = "//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeTextField";

    String openDiscountBeforeTaxOption = "Before";
//    String openDiscountBeforeTaxOption = "//XCUIElementTypeStaticText[@name=\"Before\"]";

    String openDiscountAmountTextBox = "//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeTextField";

    String openCheckDiscountPercentageOnOrderSide = "50,00";
//    String openCheckDiscountPercentageOnOrderSide = "//XCUIElementTypeStaticText[@name=\"50,00\"]";

    String openCheckDiscountPercentageOnOrderSideForMargarita = "100,00";
//    String openCheckDiscountPercentageOnOrderSideForMargarita = "//XCUIElementTypeStaticText[@name=\"100,00\"]";

    String openCheckDiscountPercentageOnPriceSideForMargarita = "TL 1.110,00";
//    String openCheckDiscountPercentageOnPriceSideForMargarita = "//XCUIElementTypeStaticText[@name=\"TL 1.110,00\"]";

    String openCheckDiscountPercentageOnPriceSide = "TL 549,51";
//    String openCheckDiscountPercentageOnPriceSide = "//XCUIElementTypeStaticText[@name=\"TL 549,51\"]";

    String openCheckDiscountAmountAfterTaxOnOrderSide = "115,00";
//    String openCheckDiscountAmountAfterTaxOnOrderSide = "//XCUIElementTypeStaticText[@name=\"115,00\"]";

    String openCheckDiscountAmountAfterTaxOnOrderSideForMargarita = "TL 1.199,95";
//    String openCheckDiscountAmountAfterTaxOnOrderSideForMargarita = "//XCUIElementTypeStaticText[@name=\"TL 1.199,95\"]";

    String openCheckDiscountAmountAfterTaxOnPriceSideForMargarita = "TL 1,109,95";
//    String openCheckDiscountAmountAfterTaxOnPriceSideForMargarita = "//XCUIElementTypeStaticText[@name=\"TL 1,109,95\"]";

    String openCheckDiscountAmountAfterTaxOnPriceSide = "TL 15,00";
//    String openCheckDiscountAmountAfterTaxOnPriceSide = "//XCUIElementTypeStaticText[@name=\"TL 15,00\"]";

    String itemBasedDiscountBeforeTaxAsAmount = "//div[@class='discount-section']//div[contains(.,'IB-BeforeTax-Amount')]";
//    String itemBasedDiscountBeforeTaxAsAmount = "//XCUIElementTypeStaticText[@name=\"IB-BeforeTax-Amount\"]";

    String itemBasedDiscountAfterTaxAsSetPrice = "//div[@class='discount-section']//div[contains(.,'IB-AfterTax-SetPrice')]";
//    String itemBasedDiscountAfterTaxAsSetPrice = "//XCUIElementTypeStaticText[@name=\"IB-AfterTax-SetPrice\"]";

    String itemBasedDiscountBeforeTaxAsSetPrice = "//div[@class='discount-section']//div[contains(.,'IB-BeforeTax-SetPrice')]";
//    String itemBasedDiscountBeforeTaxAsSetPrice = "//XCUIElementTypeStaticText[@name=\"IB-BeforeTax-SetPrice\"]";

    String itemBasedDiscountAfterTaxAsFreeItem = "//div[@class='discount-section']//div[contains(.,'IB-AfterTax-FreeItem')]";
//    String itemBasedDiscountAfterTaxAsFreeItem = "//XCUIElementTypeStaticText[@name=\"IB-AfterTax-FreeItem\"]";

    String itemBasedDiscountBeforeTaxAsFreeItem = "//div[@class='discount-section']//div[contains(.,'IB-BeforeTax-FreeItem')]";
//    String itemBasedDiscountBeforeTaxAsFreeItem = "//XCUIElementTypeStaticText[@name=\"IB-BeforeTax-FreeItem\"]";

    String itemBasedDiscountBeforeTaxAsPercentage = "//div[@class='discount-section']//div[contains(.,'IB-BeforeTax-Percentage')]";
//    String itemBasedDiscountBeforeTaxAsPercentage = "//XCUIElementTypeStaticText[@name=\"IB-BeforeTax-Percentage\"]";

    String itemBasedDiscountAfterTaxAsPercentage = "//div[@class='discount-section']//div[contains(.,'IB-AfterTax-Percentage')]";
//    String itemBasedDiscountAfterTaxAsPercentage = "//XCUIElementTypeStaticText[@name=\"IB-AfterTax-Percentage\"]";

    String checkBasedDiscountAfterTaxAsPercentage = "//div[@class='discount-section']//div[contains(.,'CB-PercentageAfterTax')]";
//    String checkBasedDiscountAfterTaxAsPercentage = "//XCUIElementTypeStaticText[@name=\"CB-PercentageAfterTax\"]";

    String checkBasedDiscountBeforeTaxAsPercentage = "//div[@class='discount-section']//div[contains(.,'CB-PercentageBeforeTax')]";
//    String checkBasedDiscountBeforeTaxAsPercentage = "//XCUIElementTypeStaticText[@name=\"CB-PercentageBeforeTax\"]";

    String checkBasedDiscountBeforeTaxAsAmount = "//div[@class='discount-section']//div[contains(.,'CB-AmountBeforeTax')]";
//    String checkBasedDiscountBeforeTaxAsAmount = "//XCUIElementTypeStaticText[@name=\"CB-AmountBeforeTax\"]";

    String checkBasedDiscountBeforeTaxAsSetPrice = "//div[@class='discount-section']//div[contains(.,'CB-BeforeTax-SetPrice')]";
//    String checkBasedDiscountBeforeTaxAsSetPrice = "//XCUIElementTypeStaticText[@name=\"CB-BeforeTax-SetPrice\"]";

    String checkBasedDiscountAfterTaxAsSetPrice = "//div[@class='discount-section']//div[contains(.,'CB-AfterTax-SetPrice')]";
//    String checkBasedDiscountAfterTaxAsSetPrice = "//XCUIElementTypeStaticText[@name=\"CB-AfterTax-SetPrice\"]";

    String checkBasedDiscountAfterTaxAsAmount = "//div[@class='discount-section']//div[contains(.,'CheckBasedAmountAfterTax')]";
//    String checkBasedDiscountAfterTaxAsAmount = "//XCUIElementTypeStaticText[@name=\"CheckBasedAmountAfterTax\"]";

    String checkBasedDiscountAfterTaxAsFreeItem = "//div[@class='discount-section']//div[contains(.,'CB-AfterTax-FreeItem')]";
//    String checkBasedDiscountAfterTaxAsFreeItem = "//XCUIElementTypeStaticText[@name=\"CB-AfterTax-FreeItem\"]";

    String checkBasedDiscountBeforeTaxAsFreeItem = "//div[@class='discount-section']//div[contains(.,'CB-BeforeTax-FreeItem')]";
//    String checkBasedDiscountBeforeTaxAsFreeItem = "//XCUIElementTypeStaticText[@name=\"CB-BeforeTax-FreeItem\"]";

    String itemBasedDiscountBeforeTaxWithPercentage = "//div[@class='discount-section']//div[contains(.,'IB-BeforeTax-Percentage')]";
//    String itemBasedDiscountBeforeTaxWithPercentage = "//XCUIElementTypeStaticText[@name=\"IB-BeforeTax-Percentage\"]";

    String itemBasedDiscountBeforeTaxWithAmount = "//div[@class='discount-section']//div[contains(.,'IB-BeforeTax-Amount')]";
//    String itemBasedDiscountBeforeTaxWithAmount = "//XCUIElementTypeStaticText[@name=\"IB-BeforeTax-Amount\"]";

    String itemBasedDiscountAfterTaxWithAmount = "//div[@class='discount-section']//div[contains(.,'IB-DiscountAfterTax')]";
//    String itemBasedDiscountAfterTaxWithAmount = "//XCUIElementTypeStaticText[@name=\"IB-DiscountAfterTax\"]";

    //Payment


    String paidCheckPopupInfo = "Payment(s) made on this check,Can you return this to Test Automation";
//    String paidCheckPopupInfo = "//XCUIElementTypeTextView[@name=\"Payment(s) made on this check,Can you return this to Test Automation\"]";

    String cashButton = "//span[contains(.,' Cash ')]";
    String submitButton = "//button[@id='ps_submit']";

    String allOptions = "//button[@id='os_all']";
//    String allOptions = "//XCUIElementTypeStaticText[@name=\"All\"]\n";

    String closedButton = "Closed";
//    String closedButton = "//XCUIElementTypeStaticText[@name=\"Closed\"]";

    String checkDetails = "CheckDetialsIcon";
//    String checkDetails = "//XCUIElementTypeButton[@name=\"CheckDetialsIcon\"]";

    String orderSummary = "//ion-label[contains(.,'ORDER SUMMARY')]";
//    String orderSummary = "//XCUIElementTypeStaticText[@name=\"ORDER SUMMARY\"]";

    String cancel = "Cancel";
//    String cancel = "//XCUIElementTypeStaticText[@name=\"Cancel\"]";

    String cashTab = "Cash";
//    String cashTab = "//XCUIElementTypeStaticText[@name=\"Cash\"]";

    String totalAmount = "";
//    String totalAmount = "";

    String enter = "";
//    String enter = "";

    String payCheckButton = "//span[contains(.,' Pay Check ')]";
//    String payCheckButton = "//XCUIElementTypeStaticText[@name=\"Pay Check\"]";

    String selectedTable = "T1";
//    String selectedTable = "//XCUIElementTypeStaticText[@name=\"T1\"]";

    String cashPaymentTab = "//XCUIElementTypeButton[@name=\"Cash\"]/XCUIElementTypeStaticText";

    String currentCheck = "2-003";
//    String currentCheck = "//XCUIElementTypeStaticText[@name=\"2-003\"]";

    String nextCheck = "2-004";
//    String nextCheck = "//XCUIElementTypeStaticText[@name=\"2-004\"]";

    String paidCheckAmount = "";

    //    String splitButtonOnCalculator = "Split";
    String splitButtonOnCalculator = "//XCUIElementTypeStaticText[@name=\"Split\"]";

    String splitType = "1/2";
//    String splitType = "//XCUIElementTypeStaticText[@name=\"1/2\"]";

    String cashButtonOnPayment = "//span[contains(.,' Cash ')]";

    String paidAmount = "5,00";
//    String paidAmount = "//XCUIElementTypeStaticText[@name=\"5,00\"]";

    String balance = "//XCUIElementTypeImage[@name=\"/var/mobile/Containers/Data/Application/F94EBD4C-87E3-4B36-8223-A9903E9F40F2/Documents//5f1ae54dc9d0cd00010e97f4/FoodGallery/Categories/5f1ae54dc9d0cd00010e9833.png\"]";

    String voidAfterPaymentPopupInfo = "//XCUIElementTypeStaticText[@name=\"Payment(s) made on this check,Can you return this to Walkin";
//    String voidAfterPaymentPopupInfo = "//XCUIElementTypeStaticText[@name=\"Payment(s) made on this check,Can you return this to Walkin\"]";


    String exitButtonOnPayment = "//button[contains(.,'Exit')]";

    String paymentMethodTitle = "Select Payment Method";
//    String paymentMethodTitle = "//XCUIElementTypeStaticText[@name=\"Select Payment Method\"]";


    String paidOrder = "(//ion-row//ion-col[contains(.,' Success')])[3]";

    String deleteButtonOnPayment = "//button[contains(@id,'ps_delete')]";

    @FindBy( xpath = "//button[contains(.,'Cash')]")
    private WebElement Cash;

    @FindBy ( xpath = "//button[contains(.,'Exact')]")
    private WebElement Exact;

    @FindBy (xpath = "//button[contains(.,'Enter')]")
    private WebElement Enter;

    String exactButton = "//button[contains(.,'Exact')]";
//    String exactButton = "//XCUIElementTypeStaticText[@name=\"Exact\"]";

    String receiptPrinter = "Receipt Printer";
//    String receiptPrinter = "//XCUIElementTypeStaticText[@name=\"Receipt Printer\"]";

    String receiptPrinterOkButton = "OK";
//    String receiptPrinterOkButton = "//XCUIElementTypeButton[@name=\"OK\"]";

    String emptyPayment = "(//XCUIElementTypeTable[@name=\"Empty list\"])[5]";

    String paymentStatusSuccess = "(//ion-row//ion-col[contains(.,' Success')])[3]";
//    String paymentStatusSuccess = "//XCUIElementTypeStaticText[@name=\"Success\"]";

    String creditCardOption = "Credit Card";

    String giftCardOption = "//span[contains(.,' Gift Card ')]";

    String giftCardNumber = "0000  0000  0000  0000";
//    String giftCardNumber = "//XCUIElementTypeButton[@name=\"0000  0000  0000  0000\"]";


    String giveXCardNumberOnPayment = "//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeTextField";
    String giftCardName = "//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[3]/XCUIElementTypeTextField";
    String giftExpireDate = "//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[4]/XCUIElementTypeTextField[1]";
    String giftCVV = "//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[4]/XCUIElementTypeTextField[2]";
    String giftZipCode = "//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[4]/XCUIElementTypeTextField[3]";

    String giftProcessButton = "(//button[.=' Process '])[2]";
//    String giftProcessButton = "//XCUIElementTypeStaticText[@name=\"Process\"]";

    String manuelButton = "(//button[.=' Manual '])[2]";
//    String manuelButton = "//XCUIElementTypeStaticText[@name=\"Manual\"]";

    String LoyaltyPaymentButton = "//XCUIElementTypeButton[contains(@name, 'Loyalty')]";

    String PaidMethodWithLoyalty = "1. Loyalty(#1)";

    String othersCardType = "Others";
//    String othersCardType = "//XCUIElementTypeStaticText[@name=\"Others\"]";

    String okButton = "Ok";
//    String okButton = "//XCUIElementTypeStaticText[@name=\"Ok\"]";

    String customButton = "Custom TL";
//    String customButton = "//XCUIElementTypeStaticText[@name=\"Custom TL\"]";

    String applyTip = "Apply Tip";
//    String applyTip = "//XCUIElementTypeStaticText[@name=\"Apply Tip\"]";

    String tipAmount = "//XCUIElementTypeStaticText[contains(@name, \"10,00\")]";


    String CCSideTitle = "//XCUIElementTypeStaticText[@name=\"1. CC Side(#1)\"]";
    String sideCCTitle = "(//ion-col[contains(.,'Side CC(#1)')])[3]";

    String ccSidePaymentOption = "//span[.='Payment methods']/../ion-grid/ion-row/ion-col/button/span[contains(.,' Side CC ')]";
//    String ccSidePaymentOption = "//XCUIElementTypeStaticText[@name=\"Side CC\"]";

    String noTipButton = "//button[contains(.,' No Tip ')]";
//    String noTipButton = "//XCUIElementTypeStaticText[@name=\"No Tip\"]";

    String partialPaymentForTenPrice = "TL 10";
//    String partialPaymentForTenPrice = "//XCUIElementTypeStaticText[@name=\"TL 10\"]";

    String partialPaymentPriceSummary = "/html/body/div/div[2]/div/mat-dialog-container/app-payment/ion-content/ion-grid/ion-row/ion-col[1]/div[2]/ion-grid/ion-row[2]/ion-col/ion-list/ion-item-sliding/ion-item/ion-row/ion-col[3]";

    String adjustButton = "Adjust";

    String paymentTextBox = "//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeTextField[2]";

    String halfSplitOption = "1/2";
//    String halfSplitOption = "//XCUIElementTypeStaticText[@name=\"1/2\"]";

    String balanceDue = "//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeTextField[1]";
    String secondSplitPaidDescription = "//XCUIElementTypeStaticText[@name=\"2. Cash(#1)\"]";
    String splitAmount = "(//XCUIElementTypeStaticText[@name=\"16,50\"])[2]";

    String noDueTextBox = "No Due";
    //    String noDueTextBox = "//XCUIElementTypeStaticText[@name=\"No Due\"]";

    String clearButtonOnCalculator = "C";
//    String clearButtonOnCalculator = "//XCUIElementTypeStaticText[@name=\"C\"]";

    String shortChangedPopup = "Please pay TL 33,00";
//    String shortChangedPopup = "//XCUIElementTypeTextView[@name=\"Please pay TL 33,00\"]";

    String noMorePaymentPopup = "No More payments Needed";
//    String noMorePaymentPopup = "//XCUIElementTypeTextView[@name=\"No More payments Needed\"]";

    String selectPaymentTryAgainWarningPopup = "Select a Payment and try again!";
//    String selectPaymentTryAgainWarningPopup = "//XCUIElementTypeTextView[@name=\"Select a Payment and try again!\"]";


    String emptyPaidOrder = "(//XCUIElementTypeTable[@name=\"Empty list\"])[5]";

    String receiptPrinterPopup = "Receipt Printer";
//    String receiptPrinterPopup = "//XCUIElementTypeStaticText[@name=\"Receipt Printer\"]";

    String taxExemptOption = "//label[contains(.,'Tax Exempt')]";
//    String taxExemptOption = "//XCUIElementTypeStaticText[@name=\"Tax Exempt\"]";


    String clearGiftCardInfo = "Clear";

    String giftCardPaymentSummary = "//XCUIElementTypeStaticText[@name=\"1. Gift Card(#1)\"]";

    String successPaymentStatus = "Success";
//    String successPaymentStatus = "//XCUIElementTypeStaticText[@name=\"Success\"]";

    String noThanksOption = "No Thanks";
//    String noThanksOption = "//XCUIElementTypeStaticText[@name=\"No Thanks\"]";

    String remainderSplitAmount = "550,00";
//    String remainderSplitAmount = "//XCUIElementTypeStaticText[@name=\"600,00\"]";

    String creditCardPaymentMethod = "Credit Card";
//    String creditCardPaymentMethod = "//XCUIElementTypeStaticText[@name=\"Credit Card\"]";


    String firstTipOption = "//p[contains(.,'$ 10.00')]";
    String creditCardNumber = "//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeTextField";
    String creditCardCVVInfo = "//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[4]/XCUIElementTypeTextField[2]";
    String creditCardExpireDate = "//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[4]/XCUIElementTypeTextField[1]";
    String firstEnteredTip = "//p[contains(.,'$ 10.00')]";
    String CCSidePaymentDetail = "//XCUIElementTypeStaticText[@name=\"1. Side CC(#1)\"]";
    String CCSidePaymentDetailForBarTab = "//XCUIElementTypeStaticText[@name=\"1. Side CC\"]";

    String CCSidePaymentAmountWithItemBasedDiscountAfterTaxAsPercentage = "1.100,01+100,00";
//    String CCSidePaymentAmountWithItemBasedDiscountAfterTaxAsPercentage = "//XCUIElementTypeStaticText[@name=\"1.100,01+100,00\"]";

    String CCSidePaymentAmountWithItemBasedDiscountBeforeTaxAsPercentage = "1.080,00+100,00";
//    String CCSidePaymentAmountWithItemBasedDiscountBeforeTaxAsPercentage = "//XCUIElementTypeStaticText[@name=\"1.080,00+100,00\"]";

    String CCSidePaymentAmountWithItemBasedDiscountAfterTaxAsAmount = "1.190,00+100,00";
//    String CCSidePaymentAmountWithItemBasedDiscountAfterTaxAsAmount = "//XCUIElementTypeStaticText[@name=\"1.190,00+100,00\"]";

    String CCSidePaymentAmountWithItemBasedDiscountBeforeTaxAsAmount = "1.659,89+100,00";
//    String CCSidePaymentAmountWithItemBasedDiscountBeforeTaxAsAmount = "//XCUIElementTypeStaticText[@name=\"1.659,89+100,00\"]";

    String CCSidePaymentAmountWithItemBasedDiscountAfterTaxAsSetPrice = "1.463,59+100,00";
//    String CCSidePaymentAmountWithItemBasedDiscountAfterTaxAsSetPrice = "//XCUIElementTypeStaticText[@name=\"1.463,59+100,00\"]";

    String CCSidePaymentAmountWithItemBasedDiscountAfterTaxAsFreeItem = "1.200,00+100,00";
//    String CCSidePaymentAmountWithItemBasedDiscountAfterTaxAsFreeItem = "//XCUIElementTypeStaticText[@name=\"1.200,00+100,00\"]";

    String CCSidePaymentAmountWithItemBasedDiscountBeforeTaxAsFreeItem = "1.212,00+100,00";
//    String CCSidePaymentAmountWithItemBasedDiscountBeforeTaxAsFreeItem = "//XCUIElementTypeStaticText[@name=\"1.296,00+100,00\"]";

    String CCSidePaymentAmountWithItemBasedDiscountBeforeTaxAsSetPrice = "1.200,00+100,00";
//    String CCSidePaymentAmountWithItemBasedDiscountBeforeTaxAsSetPrice = "//XCUIElementTypeStaticText[@name=\"1.200,00+100,00\"]";

    String ccSidePaymentDetailAmount = "1.200,00+100,00";
//    String ccSidePaymentDetailAmount = "//XCUIElementTypeStaticText[@name=\"1.200,00+100,00\"]";

    String ccSidePaymentDetailAmountWithCheckBasedDiscountBeforeTaxAsPercentage = "1.080,00+100,00";
//    String ccSidePaymentDetailAmountWithCheckBasedDiscountBeforeTaxAsPercentage = "//XCUIElementTypeStaticText[@name=\"1.080,00+100,00\"]";

    String ccSidePaymentDetailAmountWithCheckBasedDiscountBeforeTaxAsAmount = "1.194,00+100,00";
//    String ccSidePaymentDetailAmountWithCheckBasedDiscountBeforeTaxAsAmount = "//XCUIElementTypeStaticText[@name=\"1.194,00+100,00\"]";

    String ccSidePaymentDetailAmountWithCheckBasedDiscountAfterTaxAsSetPrice = "230,00+100,00";
//    String ccSidePaymentDetailAmountWithCheckBasedDiscountAfterTaxAsSetPrice = "//XCUIElementTypeStaticText[@name=\"230,00+100,00\"]";

    String ccSidePaymentDetailAmountWithCheckBasedDiscountBeforeTaxAsSetPrice = "36,00+100,00";
//    String ccSidePaymentDetailAmountWithCheckBasedDiscountBeforeTaxAsSetPrice = "//XCUIElementTypeStaticText[@name=\"36,00+100,00\"]";

    String ccSidePaymentDetailAmountWithCheckBasedDiscountAfterTaxAsAmount = "1.195,00+100,00";
//    String ccSidePaymentDetailAmountWithCheckBasedDiscountAfterTaxAsAmount = "//XCUIElementTypeStaticText[@name=\"1.195,00+100,00\"]";

    String ccSidePaymentDetailAmountWithCheckBasedDiscountAfterTaxAsPercentage = "27,57+100,00";
//    String ccSidePaymentDetailAmountWithCheckBasedDiscountAfterTaxAsPercentage = "//XCUIElementTypeStaticText[@name=\"27,57+100,00\"]";

    String ccSidePaymentDetailAmountWithCheckBasedDiscountAfterTaxAsFreeItem = "810,01+100,00";
//    String ccSidePaymentDetailAmountWithCheckBasedDiscountAfterTaxAsFreeItem = "//XCUIElementTypeStaticText[@name=\"810,01+100,00\"]";

    String ccSidePaymentDetailAmountWithCheckBasedDiscountAfterTaxAsFreeItemForSandwich = "810,01+100,00";
//    String ccSidePaymentDetailAmountWithCheckBasedDiscountAfterTaxAsFreeItemForSandwich = "//XCUIElementTypeStaticText[@name=\"810,01+100,00\"]";

    String ccSidePaymentDetailAmountWithCheckBasedDiscountAfterTaxAsFreeItemForSandwiches = "1.200,00+100,00";
//    String ccSidePaymentDetailAmountWithCheckBasedDiscountAfterTaxAsFreeItemForSandwiches = "//XCUIElementTypeStaticText[@name=\"1.200,00+100,00\"]";

    String ccSidePaymentDetailAmountWithCheckBasedDiscountBeforeTaxAsFreeItem = "1.200,00+100,00";
//    String ccSidePaymentDetailAmountWithCheckBasedDiscountBeforeTaxAsFreeItem = "//XCUIElementTypeStaticText[@name=\"1.200,00+100,00\"]";

    String ccSidePaymentDetailAmountWithCheckBasedDiscountBeforeTaxAsFreeItemForSandwich = "2.211,06+100,00";
//    String ccSidePaymentDetailAmountWithCheckBasedDiscountBeforeTaxAsFreeItemForSandwich = "//XCUIElementTypeStaticText[@name=\"2.211,06+100,00\"]";

    String ccSidePaymentDetailAmountWithCheckBasedDiscountBeforeTaxForSandwiches = "2.211,06+100,00";
//    String ccSidePaymentDetailAmountWithCheckBasedDiscountBeforeTaxForSandwiches = "//XCUIElementTypeStaticText[@name=\"2.211,06+100,00\"]";

    String ccSidePaymentDetailAmountWithCheckBasedDiscountBeforeTaxAsFreeItemForSandwiches = "1.200,00+100,00";
//    String ccSidePaymentDetailAmountWithCheckBasedDiscountBeforeTaxAsFreeItemForSandwiches = "//XCUIElementTypeStaticText[@name=\"1.200,00+100,00\"]";

    String CCSideOpenItemPaymentDetailForBarTab = "//XCUIElementTypeStaticText[@name=\"1. Side CC(#1)\"]";
    String ccSidePaymentMethod = "//XCUIElementTypeStaticText[@name=\"1. Side CC\"]";

    String ccSidePaymentDetailAmountWithOpenItemDiscountAfterTax = "2.211,06+100,00";
//    String ccSidePaymentDetailAmountWithOpenItemDiscountAfterTax = "//XCUIElementTypeStaticText[@name=\"2.211,06+100,00\"]";

    String ccSidePaymentDetailAmountWithOpenItemDiscountBeforeTaxWithNonDecimalValue = "2.211,06+100,00";
//    String ccSidePaymentDetailAmountWithOpenItemDiscountBeforeTaxWithNonDecimalValue = "//XCUIElementTypeStaticText[@name=\"2.211,06+100,00\"]";

    String ccSidePaymentDetailAmountWithOpenCheckDiscountAfterTaxWithPercentage = "1.000,01+100,00";
//    String ccSidePaymentDetailAmountWithOpenCheckDiscountAfterTaxWithPercentage = "//XCUIElementTypeStaticText[@name=\"1.100,01+100,00\"]";

    String ccSidePaymentDetailAmountWithOpenCheckDiscountBeforeTaxWithPercentage = "990,00+100,00";
//    String ccSidePaymentDetailAmountWithOpenCheckDiscountBeforeTaxWithPercentage = "//XCUIElementTypeStaticText[@name=\"1.080,00+100,00\"]";

    String ccSidePaymentDetailAmountWithOpenCheckDiscountAfterTaxWithAmount = "50,00+100,00";
//    String ccSidePaymentDetailAmountWithOpenCheckDiscountAfterTaxWithAmount = "//XCUIElementTypeStaticText[@name=\"50,00+100,00\"]";

    String ccSidePaymentDetailAmountWithOpenCheckDiscountAfterTaxWithAmountForMargarita = "TL 10,00";
//    String ccSidePaymentDetailAmountWithOpenCheckDiscountAfterTaxWithAmountForMargarita = "//XCUIElementTypeStaticText[@name=\"TL 10,00\"]";

    String ccSidePaymentDetailAmountWithOpenCheckDiscountAfterTaxWithAmountAndTipForMargarita = "1.100,00+100,00";
//    String ccSidePaymentDetailAmountWithOpenCheckDiscountAfterTaxWithAmountAndTipForMargarita = "//XCUIElementTypeStaticText[@name=\"1.100,00+100,00\"]";

    String ccSidePaymentDetailAmountWithOpenCheckDiscountBeforeTaxWithAmount = "1.097,75+100,00";
//    String ccSidePaymentDetailAmountWithOpenCheckDiscountBeforeTaxWithAmount = "//XCUIElementTypeStaticText[@name=\"1.097,75+100,00\"]";

    String ccSidePaymentDetailAmountWithOpenCheckDiscountAfterTaxWithNonDecimalAmount = "1.098,95+100,00";
//    String ccSidePaymentDetailAmountWithOpenCheckDiscountAfterTaxWithNonDecimalAmount = "//XCUIElementTypeStaticText[@name=\"1.098,95+100,00\"]";

    String ccSidePaymentDetailAmountWithGratuityFixAndWithTips = "917,99+100,00";
//    String ccSidePaymentDetailAmountWithGratuityFixAndWithTips = "//XCUIElementTypeStaticText[@name=\"917,99+100,00\"]";

    String ccSidePaymentDetailAmountWithGratuityVaryingAndWithTips = "900,00+100,00";
//    String ccSidePaymentDetailAmountWithGratuityVaryingAndWithTips = "//XCUIElementTypeStaticText[@name=\"900,00+100,00\"]";

    String ccSidePaymentDetailAmountWithTaxExemptAndWithTips = "599,90+100,00";
//    String ccSidePaymentDetailAmountWithTaxExemptAndWithTips = "//XCUIElementTypeStaticText[@name=\"599,90+100,00\"]";

    String ccSidePaymentDetailAmountWithTaxExemptAndWithTipsWithNotSelectedCustomer = "599,90+100,00";
//    String ccSidePaymentDetailAmountWithTaxExemptAndWithTipsWithNotSelectedCustomer = "//XCUIElementTypeStaticText[@name=\"599,90+100,00\"]";

    String ccSidePaymentDetailAmountWithTaxExemptAndWithTipsWithPreDefinedCustomer = "30,00+100,00";
//    String ccSidePaymentDetailAmountWithTaxExemptAndWithTipsWithPreDefinedCustomer = "//XCUIElementTypeStaticText[@name=\"30,00+100,00\"]";

    String ccSidePaymentDetailAmountWithUpchargeOrderAndWithTips = "12,00+100,00";
//    String ccSidePaymentDetailAmountWithUpchargeOrderAndWithTips = "//XCUIElementTypeStaticText[@name=\"12,00+100,00\"]";

    String ccSidePaymentDetailAmountWithoutTip = "1.100,00";
//    String ccSidePaymentDetailAmountWithoutTip = "//XCUIElementTypeStaticText[@name=\"1.200,00\"]";

    String ccSidePaymentDetailAmountWithTip = "1.100,00+100,00";
//    String ccSidePaymentDetailAmountWithTip = "//XCUIElementTypeStaticText[@name=\"1.200,00+100,00\"]";

    String ccSidePaymentDetailAmountWithTipForBarTab = "1.100,00+100,00";
//    String ccSidePaymentDetailAmountWithTipForBarTab = "//XCUIElementTypeStaticText[@name=\"1.200,00+100,00\"]";

    String itemBasedDiscountAfterTaxWithPercentagePaymentDetailAmountWithTip = "555,01+100,00";
//    String itemBasedDiscountAfterTaxWithPercentagePaymentDetailAmountWithTip = "//XCUIElementTypeStaticText[@name=\"555,01+100,00\"]";

    String itemBasedDiscountBeforeTaxWithPercentagePaymentDetailAmountWithTip = "126,00+100,00";
//    String itemBasedDiscountBeforeTaxWithPercentagePaymentDetailAmountWithTip = "//XCUIElementTypeStaticText[@name=\"126,00+100,00\"]";

    String itemBasedDiscountBeforeTaxWithAmountPaymentDetailAmountWithTip = "1.617,90+100,00";
//    String itemBasedDiscountBeforeTaxWithAmountPaymentDetailAmountWithTip = "//XCUIElementTypeStaticText[@name=\"1.617,90+100,00\"]";

    String itemBasedDiscountBeforeTaxWithAmountPaymentDetailAmountWithTipForMargarita = "1.089,00+100,00";
//    String itemBasedDiscountBeforeTaxWithAmountPaymentDetailAmountWithTipForMargarita = "//XCUIElementTypeStaticText[@name=\"1.089,00+100,00\"]";

    String itemBasedDiscountAfterTaxWithAmountPaymentDetailAmountWithTip = "20,00+100,00";
//    String itemBasedDiscountAfterTaxWithAmountPaymentDetailAmountWithTip = "//XCUIElementTypeStaticText[@name=\"20,00+100,00\"]";

    String printerOkButton = "OK";
//    String printerOkButton = "//XCUIElementTypeButton[@name=\"OK\"]";

    String itemBasedDiscountAfterTaxWithFreeItemPaymentDetailForChickenSchinitzel = "605,01+100,00";
//    String itemBasedDiscountAfterTaxWithFreeItemPaymentDetailForChickenSchinitzel = "//XCUIElementTypeStaticText[@name=\"605,01+100,00\"]";

    String itemBasedDiscountBeforeTaxWithFreeItemPaymentDetailForChickenSchinitzel = "638,01+100,00";
//    String itemBasedDiscountBeforeTaxWithFreeItemPaymentDetailForChickenSchinitzel = "//XCUIElementTypeStaticText[@name=\"638,01+100,00\"]";

    String ccSidePaymentDetailAmountWithCheckBasedDiscountAfterTaxAsPercentageForSandwiches = "1.100,01+100,00";
//    String ccSidePaymentDetailAmountWithCheckBasedDiscountAfterTaxAsPercentageForSandwiches = "//XCUIElementTypeStaticText[@name=\"1.100,01+100,00\"]";

    String ccSidePaymentDetailAmountWithItemBasedDiscountAfterTaxAsPercentageForChickenSchinitzel = "787,90+100,00";
//    String ccSidePaymentDetailAmountWithItemBasedDiscountAfterTaxAsPercentageForChickenSchinitzel = "//XCUIElementTypeStaticText[@name=\"787,90+100,00\"]";

    String ccSidePaymentDetailAmountWithItemBasedDiscountAfterTaxAsSetPriceForChickenSchinitzel = "2.187,90+100,00";
//    String ccSidePaymentDetailAmountWithItemBasedDiscountAfterTaxAsSetPriceForChickenSchinitzel = "//XCUIElementTypeStaticText[@name=\"2.187,90+100,00\"]";

    String ccSidePaymentDetailAmountWithItemBasedDiscountAfterTaxAsSetPriceForPizzaRomano = "657,90+100,00";
//    String ccSidePaymentDetailAmountWithItemBasedDiscountAfterTaxAsSetPriceForPizzaRomano = "//XCUIElementTypeStaticText[@name=\"657,90+100,00\"]";

    String ccSidePaymentDetailAmountWithItemBasedDiscountBeforeTaxAsSetPriceForChickenSchinitzel = "121,00+100,00";
//    String ccSidePaymentDetailAmountWithItemBasedDiscountBeforeTaxAsSetPriceForChickenSchinitzel = "//XCUIElementTypeStaticText[@name=\"121,00+100,00\"]";

    String ccSidePaymentDetailAmountWithOpenItemDiscountAfterTaxForSandwiches = "810,02+100,00";
//    String ccSidePaymentDetailAmountWithOpenItemDiscountAfterTaxForSandwiches = "//XCUIElementTypeStaticText[@name=\"810,02+100,00\"]";

    String ccSidePaymentDetailAmountWithOpenItemDiscountAfterTaxPercentageForSandwiches = "810,02+100,00";
//    String ccSidePaymentDetailAmountWithOpenItemDiscountAfterTaxPercentageForSandwiches = "//XCUIElementTypeStaticText[@name=\"810,02+100,00\"]";

    String ccSidePaymentDetailAmountWithOpenCheckDiscountAfterTaxForSandwiches = "750,02+100,00";
//    String ccSidePaymentDetailAmountWithOpenCheckDiscountAfterTaxForSandwiches = "//XCUIElementTypeStaticText[@name=\"750,02+100,00\"]";

    String ccSidePaymentDetailAmountWithOpenCheckDiscountBeforeTaxForSandwiches = "743,41+100,00";
//    String ccSidePaymentDetailAmountWithOpenCheckDiscountBeforeTaxForSandwiches = "//XCUIElementTypeStaticText[@name=\"743,41+100,00\"]";

    String ccSidePaymentDetailAmountWithOpenCheckDiscountBeforeTaxForMargarita = "1.199,95+100,00";
//    String ccSidePaymentDetailAmountWithOpenCheckDiscountBeforeTaxForMargarita = "//XCUIElementTypeStaticText[@name=\"1.199,95+100,00\"]";

    String ccSidePaymentDetailAmountWithOpenCheckDiscountWithNonDecimalValueAfterTaxForMargarita = "1.321,00+100,00";
//    String ccSidePaymentDetailAmountWithOpenCheckDiscountWithNonDecimalValueAfterTaxForMargarita = "//XCUIElementTypeStaticText[@name=\"1.321,00+100,00\"]";

    String ccSidePaymentDetailAmountWithOpenCheckDiscountWithNonDecimalValueBeforeTaxForMargarita = "1.198,90+100,00";
//    String ccSidePaymentDetailAmountWithOpenCheckDiscountWithNonDecimalValueBeforeTaxForMargarita = "//XCUIElementTypeStaticText[@name=\"1.198,90+100,00\"]";

    String ccSidePaymentAmountWithTipsAndVaryingGratuityForSandwiches = "1.299,99+100,00";
//    String ccSidePaymentAmountWithTipsAndVaryingGratuityForSandwiches = "//XCUIElementTypeStaticText[@name=\"1.299,99+100,00\"]";

    String ccSidePaymentAmountWithTipsAndTaxExemptForSandwiches = "999,90+100,00";
//    String ccSidePaymentAmountWithTipsAndTaxExemptForSandwiches = "//XCUIElementTypeStaticText[@name=\"999,90+100,00\"]";

    String ccSidePaymentAmountWithoutTipsAndTaxExemptForSandwiches = "999,90";
//    String ccSidePaymentAmountWithoutTipsAndTaxExemptForSandwiches = "//XCUIElementTypeStaticText[@name=\"999,90\"]";

    String ccSidePaymentAmountWithTipsAndItemBasedDiscountAfterTaxAsPercentageWithTaxExemptForSandwiches = "499,91";
//    String ccSidePaymentAmountWithTipsAndItemBasedDiscountAfterTaxAsPercentageWithTaxExemptForSandwiches = "//XCUIElementTypeStaticText[@name=\"499,91\"]";

    String ccSidePaymentAmountWithTipsAndItemBasedDiscountBeforeTaxAsPercentageWithTaxExemptForSandwiches = "499,90";
//    String ccSidePaymentAmountWithTipsAndItemBasedDiscountBeforeTaxAsPercentageWithTaxExemptForSandwiches = "//XCUIElementTypeStaticText[@name=\"499,90\"]";

    String ccSidePaymentAmountWithTipsAndItemBasedDiscountAfterTaxAsAmountWithTaxExemptForSandwiches = "599,30";
//    String ccSidePaymentAmountWithTipsAndItemBasedDiscountAfterTaxAsAmountWithTaxExemptForSandwiches = "//XCUIElementTypeStaticText[@name=\"599,30\"]";

    String ccSidePaymentAmountWithTipsAndItemBasedDiscountBeforeTaxAsAmountWithTaxExemptForSandwiches = "539,90";
//    String ccSidePaymentAmountWithTipsAndItemBasedDiscountBeforeTaxAsAmountWithTaxExemptForSandwiches = "//XCUIElementTypeStaticText[@name=\"539,90\"]";

    String ccSidePaymentAmountWithTipsAndItemBasedDiscountAfterTaxAsSetPriceWithTaxExemptForSandwiches = "29,90";
//    String ccSidePaymentAmountWithTipsAndItemBasedDiscountAfterTaxAsSetPriceWithTaxExemptForSandwiches = "//XCUIElementTypeStaticText[@name=\"29,90\"]";

    String ccSidePaymentAmountWithTipsAndItemBasedDiscountBeforeTaxAsSetPriceWithTaxExemptForSandwiches = "29,90+100,00";
//    String ccSidePaymentAmountWithTipsAndItemBasedDiscountBeforeTaxAsSetPriceWithTaxExemptForSandwiches = "//XCUIElementTypeStaticText[@name=\"29,90+100,00\"]";

    String ccSidePaymentAmountWithTipsAndItemBasedDiscountAfterTaxAsFreeItemWithTaxExemptForSandwiches = "599,90";
//    String ccSidePaymentAmountWithTipsAndItemBasedDiscountAfterTaxAsFreeItemWithTaxExemptForSandwiches = "//XCUIElementTypeStaticText[@name=\"599,90\"]";

    String ccSidePaymentAmountWithTipsAndItemBasedDiscountBeforeTaxAsFreeItemWithTaxExemptForSandwiches = "629,90";
//    String ccSidePaymentAmountWithTipsAndItemBasedDiscountBeforeTaxAsFreeItemWithTaxExemptForSandwiches = "//XCUIElementTypeStaticText[@name=\"629,90\"]";

    String ccSidePaymentAmountWithTipsAndFixGratuityForSandwiches = "1.299,99+100,00";
//    String ccSidePaymentAmountWithTipsAndFixGratuityForSandwiches = "//XCUIElementTypeStaticText[@name=\"1.299,99+100,00\"]";

    String cashOnMenuItemPage = "//button[contains(.,'Cash')]";
//    String cashOnMenuItemPage = "//XCUIElementTypeStaticText[@name=\"Cash\"]";

    String giveXPaymentMethod = "GiveX";
//    String giveXPaymentMethod = "//XCUIElementTypeStaticText[@name=\"GiveX\"]";

    String numberZero = "//button[.='0']";
//    String numberZero = "//XCUIElementTypeStaticText[@name=\"0\"]";

    String numberTwo = "//button[.='2']";
//    String numberTwo = "//XCUIElementTypeStaticText[@name=\"2\"]";

    String numberThree = "//button[.='3']";
//    String numberThree = "//XCUIElementTypeStaticText[@name=\"3\"]";

    String numberFour = "//button[.='4']";
//    String numberFour = "//XCUIElementTypeStaticText[@name=\"4\"]";

    String numberSix = "//button[.='6']";
//    String numberSix = "//XCUIElementTypeStaticText[@name=\"6\"]";

    String numberSeven = "//button[.='7']";
//    String numberSeven = "//XCUIElementTypeStaticText[@name=\"7\"]";

    String numberEight = "//button[.='8']";
//    String numberEight = "//XCUIElementTypeStaticText[@name=\"8\"]";

    String numberNine = "9";
//    String numberNine = "//XCUIElementTypeStaticText[@name=\"9\"]";

    String giveXCardNumberText = "0000 0000 0000 0000";
//    String giveXCardNumberText = "//XCUIElementTypeButton[@name=\"0000 0000 0000 0000\"]";


    String giveXChargeAmountText = "//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther[4]/XCUIElementTypeOther/XCUIElementTypeTextField";

    String continueGiftCart = "//button[.=' Continue ']";
//    String continueGiftCart = "//XCUIElementTypeStaticText[@name=\"Continue\"]";

    String forceRedemption = "Force Redemption";
//    String forceRedemption = "//XCUIElementTypeStaticText[@name=\"Force Redemption\"]";

    String receiptPrinterTitle = "Receipt Printer";
//    String receiptPrinterTitle = "//XCUIElementTypeStaticText[@name=\"Receipt Printer\"]";


    String giveXPaymentMethodDiyez = "//XCUIElementTypeStaticText[@name=\"1. GiveX(#1)\"]";
    String cashPaymentMethodDiyez = "(//ion-content//ion-col[contains(.,'Cash(#1)')])[3]";
    String paymentAmountForHamburger = "(//XCUIElementTypeStaticText[@name=\"1.000,00\"])[2]";

    String tunaTacosTotalPriceForVoidAction = "33,00+10,00";
//    String tunaTacosTotalPriceForVoidAction = "//XCUIElementTypeStaticText[@name=\"1.743,18+10,00\"]";

    String tunaTacosTotalPrice = "1.243,18+10,00";
//    String tunaTacosTotalPrice = "//XCUIElementTypeStaticText[@name=\"1.243,18+10,00\"]";

    String sandwichesPricePayWithCash = "1.100,00";
//    String sandwichesPricePayWithCash = "//XCUIElementTypeStaticText[@name=\"1.200,00\"]";

    String coctailAmount = "2.033,50";
//    String coctailAmount = "//XCUIElementTypeStaticText[@name=\"2.033,50\"]";

    //    String voidSandwichesAmount = "//XCUIElementTypeStaticText[@name=\"1.200,00\"]";

    String giveXButton = "GiveX";
//    String giveXButton = "//XCUIElementTypeStaticText[@name=\"GiveX\"]";

    String sideCCForSandwich = "1.100,00+100,00";
//    String sideCCForSandwich = "//XCUIElementTypeStaticText[@name=\"1.200,00+100,00\"]";

    String sideCCPaymentWithTipsAndWithoutServiceCharge = "1.100,00+100,00";
//    String sideCCPaymentWithTipsAndWithoutServiceCharge = "//XCUIElementTypeStaticText[@name=\"1.200,00+100,00\"]";

    String sideCCPaymentWithTipsAndWithServiceCharge = "2.033,50+100,00";
//    String sideCCPaymentWithTipsAndWithServiceCharge = "//XCUIElementTypeStaticText[@name=\"2.033,50+100,00\"]";

    String sideCCPaymentWithoutTipsAndWithServiceCharge = "140,80";
//    String sideCCPaymentWithoutTipsAndWithServiceCharge = "//XCUIElementTypeStaticText[@name=\"140,80\"]";

    String partialPaymentAmount = "TL 20";
//    String partialPaymentAmount = "//XCUIElementTypeButton[@name=\"TL 20\"]";

    String partialPaidAmountWithGiftCard = "20,00+10,00";
//    String partialPaidAmountWithGiftCard = "//XCUIElementTypeStaticText[@name=\"20,00+10,00\"]";

    //Batch Tip Adjustment


    String merchantDeviceTypeSelectionArrow = "(//XCUIElementTypeButton[@name=\"Down Arrow Black\"])[1]";

    String ccSideDeviceType = "Side CC";
//    String ccSideDeviceType = "//XCUIElementTypeStaticText[@name=\"Side CC\"]";


    String ccSidePaymentOptionTable = "(//XCUIElementTypeStaticText[@name=\"T1\"])[last()]";

    String clearNumberPad = "C";
//    String clearNumberPad = "//XCUIElementTypeStaticText[@name=\"C\"]";

    String lastCcSidePaymentOption = "(//XCUIElementTypeStaticText[@name=\"Side CC - Others\"])[last()]";
    String lastModifiedTip = "(//XCUIElementTypeStaticText[@name=\"50,00\"])[last()]";

    String operationMenuIcon = "//linga-icon[@symbol='menuIcon']";
//    String operationMenuIcon = "//XCUIElementTypeButton[@name=\"ToggleIcon\"]";

    String posOption = "(//span[contains(.,'POS')])[1]";
//    String posOption = "//XCUIElementTypeStaticText[@name=\"POS\"]";

    String selectDeviceTypeListbox = "(//XCUIElementTypeButton[@name=\"Down Arrow Black\"])[1]";
    String OrderWithCCSideDevice = "(//XCUIElementTypeStaticText[@name=\"Side CC - Others\"])[last()]";

    // Cash

    String enterButton = "//button[contains(.,'Enter')]";
//    String enterButton = "//XCUIElementTypeStaticText[@name=\"Enter\"]";

    String exceedCashAmountPopup = "//p[.='Cash amount has exceeded the limit.Please make a drop now.']";
//    String exceedCashAmountPopup = "//XCUIElementTypeStaticText[@name=\"Cash amount has exceeded the limit.Please make a drop now\"]";

    String yesButton = "//button[.=' Yes ']";
//    String yesButton = "//XCUIElementTypeButton[@name=\"Yes\"]";

    //Check Option


    String checkOptionTitle = "Check Options";
//    String checkOptionTitle = "//XCUIElementTypeStaticText[@name=\"Check Options\"]";

    String discount = "Discount";
//    String discount = "//XCUIElementTypeStaticText[@name=\"Discount\"]";

    String checkDiscount = "Check Discount";
//    String checkDiscount = "//XCUIElementTypeStaticText[@name=\"Check Discount\"]";

    String percentageDiscount = "10%";
//    String percentageDiscount = "//XCUIElementTypeStaticText[@name=\"10%\"]";

    String openCheckDiscountOption = "Open Check Discount";
//    String openCheckDiscountOption = "//XCUIElementTypeStaticText[@name=\"Open Check Discount\"]";

    String percentageChargeType = "Percentage";
//    String percentageChargeType = "//XCUIElementTypeStaticText[@name=\"Percentage\"]";

    String percentageOpenDiscountTextbox = "//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeTextField";

    String numberFiveOnCalculator = "5";
//    String numberFiveOnCalculator = "//XCUIElementTypeStaticText[@name=\"5\"]";

    String numberDoubleZeroOnCalculator = "00";
//    String numberDoubleZeroOnCalculator = "//XCUIElementTypeStaticText[@name=\"00\"]";

    String numberOneOnCalculator = "1";

    String numberZeroOnCalculator = "0";
//    String numberZeroOnCalculator = "//XCUIElementTypeStaticText[@name=\"0\"]";

    String numberTwoOnCalculator = "2";
//    String numberTwoOnCalculator = "//XCUIElementTypeStaticText[@name=\"2\"]";

    String continueOnCalculator = "Continue";
//    String continueOnCalculator = "//XCUIElementTypeStaticText[@name=\"Continue\"]";

    String afterTaxType = "After";
//    String afterTaxType = "//XCUIElementTypeStaticText[@name=\"After\"]";

    String applyButtonOnOpenDiscount = "Apply";
//    String applyButtonOnOpenDiscount = "//XCUIElementTypeStaticText[@name=\"Apply\"]";


    String openDiscountReason = "//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeTextView";
    String closeKeyboard = "(//XCUIElementTypeButton[@name=\" Back \"])[2]";

    String gratuityOption = "//label[contains(.,'Gratuity')]";
//    String gratuityOption = "//XCUIElementTypeStaticText[@name=\"Gratuity\"]";

    String gratuityTitle = "//ion-title[contains(.,'Add Gratuity')]";
//    String gratuityTitle = "Add Gratuity";


    String fixedGratuity = "//button[.=' Fixed Gratuity ']";
//    String fixedGratuity = "//XCUIElementTypeStaticText[@name=\"Fixed Gratuity\"]";

    String varyingGratuity = "//button[.=' Varying Gratuity ']";
//    String varyingGratuity = "//XCUIElementTypeStaticText[@name=\"Varying Gratuity\"]";


    String varyingPercentageTextBox = "//input[contains(@placeholder,'Enter value between 10.0-100.0')]";

    String varyingApplyButton = "//button[contains(.,' Apply ')]";
//    String varyingApplyButton = "//XCUIElementTypeStaticText[@name=\"Apply\"]";

    String varyingContinueButton = "//span[contains(.,'Continue')]";
//    String varyingContinueButton = "//XCUIElementTypeStaticText[@name=\"Continue\"]";


    String varyingOneButton = "1";

    String varyingZeroButton = "0";
//    String varyingZeroButton = "//XCUIElementTypeStaticText[@name=\"0\"]";

    String varyingFiveButton = "//ion-col[contains(@class,'quantity_grid-row-col')]//button[contains(.,'5')]";
//    String varyingFiveButton = "//XCUIElementTypeStaticText[@name=\"5\"]";

    String fireCoursingButton = "//label[contains(.,'fireCoursing')]";
//    String fireCoursingButton = "//XCUIElementTypeStaticText[@name=\"Fire Coursing\"]";

    String ToBePreparedOrder = "ENTREE";
    String fireCoursingTitle = "Fire Coursing";

    String emptyFireList = "//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[3]/XCUIElementTypeCollectionView";

    String serviceExempt = "//span[.='Service Exempt']";
//    String serviceExempt = "//XCUIElementTypeStaticText[@name=\"Service Exempt\"]";

    String cashDrawer = "//span[.='Open Cash Drawer']";
    //    String cashDrawer = "//XCUIElementTypeStaticText[@name=\"Open Cash Drawer\"]";
    String menuItemTitle = "//p[@class='hasMenuItem']";

    String openItemOption = "//label[contains(.,'Open Item')]";
    //    String openItemOption = "//XCUIElementTypeStaticText[@name=\"Open Item\"]";
    String coursingItemNameTextBox = "//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[3]/XCUIElementTypeTextField[2]";
    String coursingPriceTextBox = "//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[3]/XCUIElementTypeTextField[3]";

    //    String defaultCoursingTaxOption = "Zero Tax";
    String defaultCoursingTaxOption = "//XCUIElementTypeStaticText[@name=\"Zero Tax\"]";

    String coursingDoneButton = "Done";
//    String coursingDoneButton = "//XCUIElementTypeStaticText[@name=\"Done\"]";

    String checkOptionBackButton = "//span[contains(.,'Cancel')]";

    String entreeCoursingOption = "";
//    String entreeCoursingOption = "";

    String entreeCoursingName = "//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[3]/XCUIElementTypeTextField[1]";
    String doneButtonForSelectCourse = "(//XCUIElementTypeButton[@name=\"Done\"])[2]";

    String taxExemptType = "Charity";
//    String taxExemptType = "//XCUIElementTypeStaticText[@name=\"Charity\"]";


    String chargeTypeWithAmount = "(//XCUIElementTypeStaticText[@name=\"Amount\"])[1]";

    String applyTaxForOpenDiscount = "After";
//    String applyTaxForOpenDiscount = "//XCUIElementTypeStaticText[@name=\"After\"]";

    String applyButtonForOpenDiscount = "Apply";
//    String applyButtonForOpenDiscount = "//XCUIElementTypeStaticText[@name=\"Apply\"]";

    String itemDiscountOption = "Item Discount";
//    String itemDiscountOption = "//XCUIElementTypeStaticText[@name=\"Item Discount\"]";

    String autoDiscount = "Auto Discount";
//    String autoDiscount = "//XCUIElementTypeStaticText[@name=\"Auto Discount\"]";


    String taxExemptRemovedText = "//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeTextView";
    String suspendAccount = "//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther[4]/XCUIElementTypeSwitch";
    String activateAccount = "//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther[4]/XCUIElementTypeSwitch";

    String holdCheckOption = "//label[.='Hold']";
//    String holdCheckOption = "//XCUIElementTypeStaticText[@name=\"Hold\"]";

    String checkOptionPageTitle = "//p[contains(.,'Check Option')]";
//    String checkOptionPageTitle = "//XCUIElementTypeStaticText[@name=\"Check Options\"]";

    String openItemCoursingName = "//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[3]/XCUIElementTypeTextField[1]";
    String openItemsItemName = "//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[3]/XCUIElementTypeTextField[2]";
    String openItemPrice = "//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[3]/XCUIElementTypeTextField[3]";
    String coursingNameForAfterTaxWithOpenItem = "//XCUIElementTypeStaticText[@name=\"ENTREE \"]";
    String itemNameForAfterTaxWithOpenItem = "//XCUIElementTypeStaticText[@name=\"Test Automation \"]";

    String minMaxGratuityValueWarningPopup = "//p[contains(.,'Please enter value from 10.0 - 100.0')]";
//    String minMaxGratuityValueWarningPopup = "//XCUIElementTypeTextView[@name=\"Enter Value from 10.0 - 100.0\"]";

    String beforeTaxForOpenItem = "BeforeTaxAmount-OpenItem";
//    String beforeTaxForOpenItem = "//XCUIElementTypeStaticText[@name=\"BeforeTaxAmount-OpenItem\"]";


    String coursingNameListBox = "//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[3]/XCUIElementTypeTable[1]/XCUIElementTypeCell[18]";
    String percentageTextField = "//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeTextField";
    String amountTextField = "//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeTextField";

    String applyVaryingGratuity = "//button[contains(.,' Apply ')]";
//    String applyVaryingGratuity = "//XCUIElementTypeStaticText[@name=\"Apply\"]";


    String coursingNameTextBox = "//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[3]/XCUIElementTypeTextField[1]";

    String openItemDoneButton = "Done";
    //    String openItemDoneButton = "//XCUIElementTypeStaticText[@name=\"Done\"]";
    String combinationDiscountWarningText = "//XCUIElementTypeTextView[@name=\"Combined with other discounts is disabled for Item-Based Discount\"]";

    String voidReasonFOrGiftCard = "//button[contains(.,' Ordered Wrongly ')]";
//    String voidReasonFOrGiftCard = "//XCUIElementTypeStaticText[@name=\"Mistake\"]";

    String voidItemMenuOption = "Void Item";
//    String voidItemMenuOption = "//XCUIElementTypeStaticText[@name=\"Void Item\"]";

    //Check Status

    //Check Status Nov 24

    String qsrButton = "(//XCUIElementTypeStaticText[@name=\"QSR\"])[2]";

    String barTabChoice = "BARTAB";
//    String barTabChoice = "//XCUIElementTypeStaticText[@name=\"BARTAB\"]";

    String checkStatusTab = "//span[contains(.,' Check Status ')]";
//    String checkStatusTab = "//XCUIElementTypeStaticText[@name=\"Check Stats\"]";

    //    String activeCheck = "//XCUIElementTypeStaticText[@name=\"Active\"]";
    String activeCheck = "//span[contains(.,' Active ')]";

    String barTabType = "//span[contains(.,' BarTab ')]";

    //    String closedChecks = "//XCUIElementTypeStaticText[@name=\"Closed\"]";
    String closedChecks = "//span[contains(.,' Closed ')]";

    //public  By orderSummary = "//XCUIElementTypeStaticText[@name=\"ORDER SUMMARY\"]";
    //String checkDetails = "//XCUIElementTypeButton[@name=\"CheckDetialsIcon\"]";

    //    String backToChecks = "//XCUIElementTypeStaticText[@name=\"Back To Checks\"]";
    String backToChecks = "Back To Checks";

    String voidTab = "Void";
//    String voidTab = "//XCUIElementTypeStaticText[@name=\"Void\"]";

    //    String voidCauseType = "//XCUIElementTypeStaticText[@name=\"Cold Food\"]";
    String voidCauseType = "Wrong Check";

    //    String addVoidTypeButton = "//XCUIElementTypeButton[@name=\"Add\"]";
    String addVoidTypeButton = "Add";

    //    String voidChecksTab = "//XCUIElementTypeStaticText[@name=\"Void\"]";
    String voidChecksTab = "//span[contains(.,' Void ')]";

    String voidCheckDetails = "(//XCUIElementTypeButton[@name=\"CheckDetialsIcon\"])[10]";

    String voidCause = "//XCUIElementTypeStaticText[@name=\"*Cold Food\"]";

    //    String futureCheckTab = "//XCUIElementTypeStaticText[@name=\"Future\"]";
    String futureCheckTab = "Future";

    //String receiptPrinterPopup = "//XCUIElementTypeStaticText[@name=\"Receipt Printer\"]";
//    String receiptPrinterDoneButton = "//XCUIElementTypeButton[@name=\"Done\"]";
    String receiptPrinterDoneButton = "Done";

    //    String firstVoidReason = "//XCUIElementTypeStaticText[@name=\"Cold Food\"]";
    String firstVoidReason = "//button[contains(.,' Ordered Wrongly ')]";

    String checkTotalOnVoidTab = "(//XCUIElementTypeStaticText[@name=\"10,00\"])[9]";
    String tableOfTabOnClosedCheck = "QSR";

    //    String reopenCheck = "//XCUIElementTypeStaticText[@name=\"Re-open Check\"]";
    String reopenCheck = "//span[contains(.,' Re-Open Check ')]";
    //String noMorePaymentPopup= "No More Payment need";

    //    String noMorePaymentPopupDoneButton = "//XCUIElementTypeStaticText[@name=\"Done\"]";
    String noMorePaymentPopupDoneButton = "Done";

    String openCheckButton = "Open Check";
    String qsrOptionOnCheckStatus = "";
//    String qsrOptionOnCheckStatus = "//XCUIElementTypeStaticText[@name=\"QSR\"]";

    //    String subTotalOnOrderSummary = "//XCUIElementTypeStaticText[@name=\"Sub-Total :\"]";
    String subTotalOnOrderSummary = "Sub-Total :";

    String subTotalBalanceOnOrderSummary = "(//XCUIElementTypeStaticText[@name=\"TL0,00\"])[1]";

    //    String barTabButton = "//XCUIElementTypeStaticText[@name=\"Bar Tab\"]";
    String barTabButton = "Bar Tab";

    //    String qsrOrderType = "//XCUIElementTypeStaticText[@name=\"QSR\"]";
    String qsrOrderType = "//button[@id='os_tableMenu']//span[.=' QSR ']";

    String lastBarTabOrder = "//XCUIElementTypeStaticText[@name=\"Bar Tab\"])[last()]";
    String closedCheckDetailIcon = "(//XCUIElementTypeButton[@name=\"CheckDetialsIcon\"])[last()]";
    String voidedCheckOnBarTab = "(//XCUIElementTypeStaticText[@name=\"Bar Tab\"])[last()]";
    String closedOrderDetailInfoIcon = "(//XCUIElementTypeButton[@name=\"CheckDetialsIcon\"])[last()]";

    String giveXCardNumberOnMenuItemPage = "//XCUIElementTypeStaticText[@name=\"GC-603628394562001380850 \"]";
    String giveXCardNumberOnOrderSummary = "(//XCUIElementTypeStaticText[@name=\"GCX-603628394562001380850 \"])[2]";

    //    String giveXChargeAmount = "//XCUIElementTypeStaticText[@name=\"1.000,00\"]";
    String giveXChargeAmount = "1.000,00";

    String voidedPhoneTOGoOrder = "(//XCUIElementTypeStaticText[@name=\"Phone To Go\"])[last()]";
    String voidedPhoneToGoOrderCheckTotal = "(//XCUIElementTypeStaticText[@name=\"0,00\"])[(last)]";


    //Customer Profile

    //Customer Profile

    String saveBtn = "//button[contains(.,' Save ')]";
    //String saveBtn = "Save";
    //    String selectedCustomerName = "//XCUIElementTypeButton[contains(@name,'Engin')]";
    String selectedCustomerName = "//XCUIElementTypeButton[contains(@name,'Engin')]";
    String firstName = "//input[(@id='firstNameInputBox')]";
    String lastName = "//input[(@formcontrolname='lastName')]";
    String addPhoneNumberButton = "(//button[(@id='addPhnNo')])[1]";
    String savePhoneNumberButton = "(//XCUIElementTypeStaticText[@name=\"Save\"])[1]";
    String phoneNumberTextBox = "//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeTextField[5]";
    String addCustomerAddressButton = "(//XCUIElementTypeStaticText[@name=\"Add\"])[2]";
    String addressSearchBox = "(//XCUIElementTypeSearchField[@name=\"Search\"])[1]";
    String firstSearchedResult = "(//XCUIElementTypeStaticText[@name=\"Flora Residence\"])[1]";
    String enterCityTextBox = "//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeTextField[3]";
    String saveCustomerAddress = "(//XCUIElementTypeStaticText[@name=\"Save\"])[2]";
    //String closeKeyboard = "(//XCUIElementTypeButton[@name=\"Save\"])[1]";
//    String searchTextBox1 = "//XCUIElementTypeSearchField[@name=\"Search\"]";
    String searchTextBox1 = "Search";
    String searchTextBox = "//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeTextField";
    String addressSearchTextBox = "(//XCUIElementTypeSearchField[@name=\"Search\"])[1]";
    String searchedCustomer = "(//XCUIElementTypeStaticText[@name=\"Test Automation\"])[1]";
    //    String customerProfileTitle = "//XCUIElementTypeStaticText[@name=\"Customer Profile\"]";
    String customerProfileTitle = "Customer Profile";
    String selectedCustomerPhone = "Test Automation 1234567890";
    String customerEmailAddressTextBox = "//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeTextField[7]";
    //    String hideKeyboard = "//XCUIElementTypeButton[@name=\"Hide keyboard\"]";
    String hideKeyboard = "Hide keyboard";
    String closeButtonForMobile = "Customer MobileNo close";
    String mobilePhoneEmailPopup = "Enter Email Id or Mobile Number";
    //    String warningDoneButton = "//XCUIElementTypeStaticText[@name=\"Done\"]";
    String warningDoneButton = "Done";
    String customerAddressDropDownIcon = "(//XCUIElementTypeButton[@name=\"CustomerProfile DownArrow\"])[2]";
    //    String emptyAddressList = "Empty list";
    String emptyAddressList = "//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeTable[@name=\"Empty list\"]";
    String customer = "(//XCUIElementTypeStaticText[@name=\"Test Automation\"])[last()]";
    //    String customerPlanButton = "//XCUIElementTypeStaticText[@name=\"Customer Plan\"]";
    String customerPlanButton = "Customer Plan";
    String accountType = "//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTextField[1]";
    //    String updateButton = "//XCUIElementTypeSearchField[@name=\"Update\"]";
    String updateButton = "Update";
    String rechargeTextField = "//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTextField[3]";
    //    String rechargeAmount = "//XCUIElementTypeStaticText[@name=\"1,000,00\"]";
    String rechargeAmount = "1,000,00";
    String houseAccountCardNumberTextField = "//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTextField[2]";
    String limitToggle = "//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeSwitch[1]";
    //    String limitText = "//XCUIElementTypeStaticText[@name=\"Limit\"]";
    String limitText = "Limit";
    String limitTextField = "//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTextField[4]";
    String maxLimitText = "//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTextField[5]";
    String maxLimitToggle = "//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeSwitch[2]";
    String searchedCustomerOnCustomerProfile = "//XCUIElementTypeStaticText[@name=\"Test Automation 1234567890 \"]";

    // Gift Card
//    String recurringAmount = "";
    String recurringAmount = "";
    //    String beginningAmount = "";
    String beginningAmount = "";
    //    String giveXactivateMessage = "//XCUIElementTypeTextView[@name=\"Cert already active on 2021-09-23\"]";
    String giveXactivateMessage = "Cert already active on 2021-09-23";
    String giveXHeader = "(//XCUIElementTypeStaticText[@name=\"GiveX\"])[2]";
    String giftCardScreenTitle = "//ion-title[.='Gift Card']";
    //    String disableGiveX = "//XCUIElementTypeStaticText[@name=\"GiveX\"]";
    String disableGiveX = "(//div[.=' GiveX '])[2]";
    //    String giftCardDoneButton = "//XCUIElementTypeStaticText[@name=\"Done\"]";
    String giftCardDoneButton = "Done";
    //    String missingGiftCardNumber = "//XCUIElementTypeTextView[@name=\"Enter gift card number\"]";
    String missingGiftCardNumber = "Enter gift card number";
    //    String missingChargeAmountWarning = "//XCUIElementTypeTextView[@name=\"Enter charge amount\"]";
    String missingChargeAmountWarning = "Enter charge amount";
    //    String warningPopupDoneButton = "//XCUIElementTypeStaticText[@name=\"Done\"]";
    String warningPopupDoneButton = "Done";
    String giftCardChargeAmountText = "//div[@class='gcard-recharge__grid_row_col_inpt']";

    //    String giftCardCancelButton = "//XCUIElementTypeStaticText[@name=\"Cancel\"]";
    String giftCardCancelButton = "//span[.=' Cancel ']";
    //    String giftCardChargeBalance = "//XCUIElementTypeStaticText[@name=\"10,00\"]";
    String giftCardChargeBalance = "10,00";
    //    String giftCardCardNumberText = "//XCUIElementTypeButton[@name=\"0000  0000  0000  0000\"]";
    String giftCardCardNumberText = "//p[.=' 0000 0000 0000 0000 ']";
    String giftCardNumberTextField = "//input[@placeholder='XXXXXXXXXXXXXXXX']";
    //    String giftCardInactivateText = "//XCUIElementTypeTextView[@name=\"Gift card inactivated successfully\"]";
    String giftCardInactivateText = "Gift card inactivated successfully";
    //    String inactivateGiftCardDoneButton = "//XCUIElementTypeStaticText[@name=\"Done\"]";
    String inactivateGiftCardDoneButton = "Done";
    //    String giftCardActivateText = "//XCUIElementTypeTextView[@name=\"Gift card activated successfully\"]";
    String giftCardActivateText = "Gift card activated successfully";
    String giftCardNumberTextOnCheckOption = "//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther[4]";
    String suspendAccountToggle = "//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther[4]/XCUIElementTypeSwitch";
    String activateAccountToggle = "//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther[4]/XCUIElementTypeSwitch";
    //    String activateAccountToggleText = "//XCUIElementTypeStaticText[@name=\"Activate Account\"]";
    String activateAccountToggleText = "Activate Account";
    String giftActivateInactivateToggle = "//ion-toggle[@mode='ios']";
    //    String suspendAccountToggleText = "//XCUIElementTypeStaticText[@name=\"Suspend Account\"]";
    String suspendAccountToggleText = "//p[.=' Suspend Account ']";
    //String giveXCardNumberText = "//XCUIElementTypeButton[@name=\"0000  0000  0000  0000\"]";
    String giveXCardNumberTextOnPayment = "//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeTextField";
    //String giveXChargeAmountText = "//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther[4]/XCUIElementTypeOther/XCUIElementTypeTextField";
//    String recurringBalanceText = "//XCUIElementTypeStaticText[@name=\"Recurring Balance :\"]";
    String recurringBalanceText = "Recurring Balance :";
    //    String recurringBalanceAmount = "//XCUIElementTypeStaticText[@name=\"TL 2.000,00\"]";
    String recurringBalanceAmount = "TL 2.000,00";
    //    String recurringBalanceAmountAfterRecharge = "//XCUIElementTypeStaticText[@name=\"TL 3.000,00\"]";
    String recurringBalanceAmountAfterRecharge = "TL 3.000,00";
    //    String beginningBalanceTex = "//XCUIElementTypeStaticText[@name=\"Beginning Balance :\"]";
    String beginningBalanceTex = "Beginning Balance :";
    String beginningBalanceAmount = "(//XCUIElementTypeStaticText[@name=\"TL 0,00\"])[1]";
    //    String newRecurringBalanceAmountAfterRecharge = "//XCUIElementTypeStaticText[@name=\"TL 3.000,00\"]";
    String newRecurringBalanceAmountAfterRecharge = "TL 3.000,00";
    String previousBeginningBalanceAmount = "(//XCUIElementTypeStaticText[@name=\"TL 1.256,74\"])[1]";
    //    String activatedSuccessfullyInfoPopup = "//XCUIElementTypeTextView[@name=\"Cert already active on 2021-06-01\"]";
    String activatedSuccessfullyInfoPopup = "Cert already active on 2021-06-01";
    //    String enterChargeAmountWarningPopup = "//XCUIElementTypeTextView[@name=\"Enter charge amount\"]";
    String enterChargeAmountWarningPopup = "//p[.='Enter charge amount']";
    //    String giveXCardNumberTextField = "//XCUIElementTypeButton[@name=\"0000  0000  0000  0000\"]";
    String giveXCardNumberTextField = "0000  0000  0000  0000";


    //Hold Screen
//    String holdManualOption = "//XCUIElementTypeStaticText[@name=\"Manual\"]";
    String holdManualOption = "//span[.=' Manual ']";
    //    String holdManuelDoneButton = "//XCUIElementTypeStaticText[@name=\"Done\"]";
    String holdManuelDoneButton = "//span[.='Done']";

    //Menu Item Page

    String phoneDeliveryOrderOption = "Delivery";
//    String phoneDeliveryOrderOption = "//XCUIElementTypeStaticText[@name=\"Delivery\"]";

    String phoneOrderOrderOption = "To Go";
//    String phoneOrderOrderOption = "//XCUIElementTypeStaticText[@name=\"To Go\"]";

    String barTabOrderOption = "Bar Tab";
//    String barTabOrderOption = "//XCUIElementTypeStaticText[@name=\"Bar Tab\"]";

    String forHereOrderOption = "For Here";
//    String forHereOrderOption = "//XCUIElementTypeStaticText[@name=\"For Here\"]";


    String ojCoctailModifier = "//button[contains(.,'O.J.')]";

    String bbqSource = "//span[contains(.,'4 BBQ')]";
//    String bbqSource = "//XCUIElementTypeStaticText[@name=\"4 BBQ\"]";
    //String allOptions = "//XCUIElementTypeStaticText[@name=\"All\"]\n";

    String tableLayout = "//span[contains(.,' Table layout ')]";
//    String tableLayout = "//XCUIElementTypeStaticText[@name=\"Table Layout\"]";

    String newCheckTab = "//span[contains(.,' New Check ')]";
//    String newCheckTab = "//XCUIElementTypeStaticText[@name=\"New Check\"]";

    String firstTable = "(//label[.='T22'])[1]";
//    String firstTable = "//XCUIElementTypeStaticText[@name=\"T1\"]";

    String secondTable = "(//p[contains(.,'T20')])[1]";
//    String secondTable = "//XCUIElementTypeStaticText[@name=\"T2\"]";

    String seatNum = "//span[.='1']";

    String continued = "//span[.=' Continue ']";
//    String continued = "//XCUIElementTypeStaticText[@name=\"Continue\"]";

    String dineIn = "Dine In";
//    String dineIn = "//XCUIElementTypeStaticText[@name=\"Dine In\"]";

    //String qsrButton = "(//XCUIElementTypeButton[@name=\"QSR\"])[2]";

    String mergeButton = "//div[.='Merge']";
//    String mergeButton = "//XCUIElementTypeStaticText[@name=\"Merge\"]";

    String transferButton = "//div[.='Transfer']";
//    String transferButton = "//XCUIElementTypeStaticText[@name=\"Transfer\"]";

    String transferToTableOption = "//p[.='Transfer to Table']";
//    String transferToTableOption = "/XCUIElementTypeStaticText[@name=\"Transfer to Table\"]";

    String transferItemOption = "//p[.='Transfer item']";
//    String transferItemOption = "//XCUIElementTypeStaticText[@name=\"Transfer Item\"]";

    String transferedFromTable = "Floor 1-T3";
//    String transferedFromTable = "//XCUIElementTypeStaticText[@name=\"Floor 1-T3\"]";

    String transferedToTable = "Transfer to Table";
//    String transferedToTable = "//XCUIElementTypeStaticText[@name=\"Transfer to Table\"]";

    String transferToServer = "//p[.='Transfer to Server']";
//    String transferToServer = "//XCUIElementTypeStaticText[@name=\"Transfer to Server\"]";


    String willBeTransferedCheck = "(//XCUIElementTypeStaticText[@name=\"Walkin\"])[5]";

    String willBeTransferredTable = "Floor 1-T1";
//    String willBeTransferredTable = "//XCUIElementTypeStaticText[@name=\"Floor 1-T1\"]";

    //String doneButton = "//XCUIElementTypeStaticText[@name=\"Done\"]";

    String mergedChecked = "Linga";
//    String mergedChecked = "//XCUIElementTypeStaticText[@name=\"Linga\"]";

    String splitButton = "//button[contains(.,'Split')]";
//    String splitButton = "//XCUIElementTypeStaticText[@name=\"Split\"]";

    String splitCheckOption = "(//span[contains(.,' Split Check ')])";
//    String splitCheckOption = "//XCUIElementTypeStaticText[@name=\"Split Check\"]";

    String splitBySeatOption = "(//div[(.='Split By Seat')])";
//    String splitBySeatOption = "//XCUIElementTypeStaticText[@name=\"Split by seat\"]";

    String checkFirstItem = "(//XCUIElementTypeTable[@name=\"Empty list\"])[7]";
    String emtyCheck = "(//XCUIElementTypeTable[@name=\"Empty list\"])[9]";

    String saveSplitedCheck = "Save & Close";
//    String saveSplitedCheck = "//XCUIElementTypeStaticText[@name=\"Save & Close\"]";

    String foodTab = "//div[contains(@class,'center-name category-container')]/div[contains(.,'FOOD')]";
//    String foodTab = "//XCUIElementTypeStaticText[@name=\"FOOD\"]";

    String firstMenuItem = "(//button[contains(@class,'menu-btn subCategoryBtn')]/div[contains(.,'SANDWICHES')])[1]";

    String orderButton = "//ion-row/button[contains(.,'Order')]";
//    String orderButton = "//XCUIElementTypeStaticText[@name=\"Order\"]";

    String allButton = "All";
//    String allButton = "//XCUIElementTypeStaticText[@name=\"All\"]";

    //String cashTab = "//XCUIElementTypeStaticText[@name=\"Cash\"]";

    String optionTab = "//linga-icon/../div[contains(.,'Option')]";
//    String optionTab = "//XCUIElementTypeStaticText[@name=\"Option\"]";

    String mergedCheckButton = "Merge";
//    String mergedCheckButton = "//XCUIElementTypeImage[@name=\"Merge\"]";

    String selectTable = "T1";
//    String selectTable = "//XCUIElementTypeStaticText[@name=\"T1\"]";

    String addSplitCheckButton = "";
//    String addSplitCheckButton = "";

    String newSplitCheck = "";
//    String newSplitCheck = "";

    String transferDone = "";
//    String transferDone = "";

    String successPopup = "Done";
//    String successPopup = "//XCUIElementTypeButton[@name=\"Done\"]";
    //String payCheckButton = "//XCUIElementTypeStaticText[@name=\"Pay Check\"]";

    String selectPayCheck = "T1";
//    String selectPayCheck = "//XCUIElementTypeStaticText[@name=\"T1\"]";

    String arrowDown = "(//XCUIElementTypeButton[@name=\"arrow down\"])[1]";
    String firstCategory = "(//XCUIElementTypeStaticText[@name=\"FOOD\"])[1]";
    String firstCategoryOnPopup = "(//XCUIElementTypeStaticText[@name=\"FOOD\"])[2]";

    String addSeat = "ADD";
//    String addSeat = "//XCUIElementTypeButton[@name=\"ADD\"]";

    String currentSeat = "1";
//    String currentSeat = "//XCUIElementTypeStaticText[@name=\"1\"]";

    String addedSeat = "//button[@id='2']";
//    String addedSeat = "//XCUIElementTypeStaticText[@name=\"2\"]";

    String customerButton = "//button[@id='os_customer']";
//    String customerButton = "//XCUIElementTypeButton[@name=\"New Customer\"]";

    String addNewCustomer = "Add New";
//    String addNewCustomer = "//XCUIElementTypeStaticText[@name=\"Add New\"]";

    //String selectedCustomerName = "//XCUIElementTypeButton[contains(@name,'Engin')]";

    String deleteSeat = "edit DeleteSeats";
//    String deleteSeat = "//XCUIElementTypeButton[@name=\"edit DeleteSeats\"]";

    String editDoneButton = "done DeleteSeats";
//    String editDoneButton = "done DeleteSeats";

    String dineInOption = "DINEIN";
//    String dineInOption = "//XCUIElementTypeStaticText[@name=\"DINEIN\"]";
//    String dineInOption = "//XCUIElementTypeStaticText[@name=\"DINEIN\"]";

//    String dineInOptions = "//XCUIElementTypeStaticText[@name=\"DINEIN\"]";

    String dineInOptions = "DineIn";
//    String dineInOptions = "//XCUIElementTypeStaticText[@name=\"DineIn\"]";

    String finishButton = "//button[(@id='os_finish')]";
//    String finishButton = "//XCUIElementTypeStaticText[@name=\"finish\"]";

    String splitCheckOptionButton = "//button[@id='os_splitCheck']";
//    String splitCheckOptionButton = "//XCUIElementTypeStaticText[@name=\"SPLIT CHECK\"]";

    String splitBySeatOptionOnMenuItemPage = "//button[@id='os_splitSeat']";
//    String splitBySeatOptionOnMenuItemPage = "//XCUIElementTypeStaticText[@name=\"SPLIT BY SEAT\"]";

    String splitButtonOnMenuItem = "//button[@id='os_split']";
//    String splitButtonOnMenuItem = "//XCUIElementTypeButton[@name=\"Split\"]";

    //    String paymentButtonOnMenuItemPage = "Payment";
    String paymentButtonOnMenuItemPage = "//ion-row/button[contains(.,'Payment')]";

    String voidButton = "//linga-icon/../div[contains(.,'Void')]";
//    String voidButton = "//XCUIElementTypeStaticText[@name=\"Void\"]";

    String doneVoidInfoPopup = "//button[contains(.,'Done')]";
//    String doneVoidInfoPopup = "//XCUIElementTypeStaticText[@name=\"Done\"]";

    String emptyCheck = "//p[@class='message']";
//    String emptyCheck = "//XCUIElementTypeStaticText[@name=\"empty set detail label\"]";

    String cashButtonOnMenuItem = "//button[contains(.,'Cash')]";
//    String cashButtonOnMenuItem = "//XCUIElementTypeButton[@name=\"Cash\"]";

    String firstSeatOnMenuItem = "//button[@id='1']";
//    String firstSeatOnMenuItem = "//XCUIElementTypeStaticText[@name=\"1\"]";


    String qsrOption = "//button[contains(@id,'os_menu')]";

    String qsrOption1 = "//button[@id='os_tableMenu']//span[.=' QSR ']";
    //String discountOption = "//XCUIElementTypeStaticText[@name=\"Discount\"]";

    String openCheckDiscountAmount = "1,15";
//    String openCheckDiscountAmount = "//XCUIElementTypeStaticText[@name=\"1,15\"]";

    String openCheckDiscountTitle = "Open Check Discount";
//    String openCheckDiscountTitle = "//XCUIElementTypeStaticText[@name=\"Open Check Discount\"]";

    String discountAmountForOpenCheck = "0,50";
//    String discountAmountForOpenCheck = "//XCUIElementTypeStaticText[@name=\"0,50\"]";

    String entreeTitleOnMenuItemPage = "ENTREE";
//    String entreeTitleOnMenuItemPage = "ENTREE";


    String emptyCheckPopup = "//p[contains(.,'You need to order before paying')]";

    String emptyCheckDoneButton = "//button[contains(.,'Done')]";
//    String emptyCheckDoneButton = "//XCUIElementTypeStaticText[@name=\"Done\"]";

    String secondSeatOnMenuItem = "//button[@id='2']";

    String firstOrderWithModifier = "(//button[contains(@class,'menu-btn subCategoryBtn')]/div[contains(.,'Cheesy Bacon Fries')])[1]";
//    String firstOrderWithModifier = "//XCUIElementTypeStaticText[@name=\"Cheesy Bacon Fries\"]";

    String modifierDone = "//mat-dialog-actions//button[contains(.,' Done ')]";
//    String modifierDone = "//XCUIElementTypeStaticText[@name=\"Done\"]";

    String modifyButton = "Modify";
//    String modifyButton = "//XCUIElementTypeButton[@name=\"Modify\"]";

    String selectedOrderWithModifier = "(//div[@class='menu-section orderlist-flex ']//div[contains(@class,'p-col-4 orderlist-menuname')])";

    String addedModifier = "Penne";
//    String addedModifier = "Penne";

    String maximumCountPopup = "//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeTextView";

    String addMaximumCountModifier = "1/2 Romano";
//    String addMaximumCountModifier = "//XCUIElementTypeStaticText[@name=\"1/2 Romano\"]";

    String orderedAfterModifyPopup = "//p[contains(.,'Cannot add modifiers, item already send to kitchen')]";
//    String orderedAfterModifyPopup = "Cannot add modifiers, item already send to kitchen";

    String orderedAfterModifyPopupDoneButton = "//button[contains(.,' Done ')]";
//    String orderedAfterModifyPopupDoneButton = "//XCUIElementTypeStaticText[@name=\"Done\"]";

    String gratuityAmountTitle = "//div[@id='os_gratuityAmountStr']//input";
//    String gratuityAmountTitle = "Gratuity";

    String fixGratuityAmount = "TL 99,99";
//    String fixGratuityAmount = "TL 99,99";

    String varyingGratuityAmount = "TL 149,99";
//    String varyingGratuityAmount = "TL 149,99";


    String subtotalAmount = "//div[@id='os_subTotalStr']//input";

    String totalAmountWithTax = "TL 1.100,00";
//    String totalAmountWithTax = "//XCUIElementTypeStaticText[@name=\"TL 1.200,00\"]";

    String totalAmountWithoutTax = "TL 999,90";
//    String totalAmountWithoutTax = "//XCUIElementTypeStaticText[@name=\"TL 999,90\"]";

    String totalAmountWithoutGratuity = "TL 810,01";
//    String totalAmountWithoutGratuity = "//XCUIElementTypeStaticText[@name=\"TL 810,01\"]";

    String serviceCharge = "Service Charge";
//    String serviceCharge = "Service Charge";

    String serviceChargeAmount = "TL 1,00";
//    String serviceChargeAmount = "TL 1,00";

    String totalAmountWithServiceCharge = "TL 11,00";
//    String totalAmountWithServiceCharge = "TL 11,00";

    String serviceChargeRemoveMessage = "Service Charge removed successfully";
//    String serviceChargeRemoveMessage = "Service Charge removed successfully";

    String serviceChargeRemoveDoneButton = "Done";
//    String serviceChargeRemoveDoneButton = "//XCUIElementTypeStaticText[@name=\"Done\"]";

    String searchItemOption = "Search Item";
//    String searchItemOption = "//XCUIElementTypeStaticText[@name=\"Search Item\"]";

    //String searchTextBox = "//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeTextField";
    String customerSearchTextBoxForBarTab = "//input[@placeholder='Name']";

    String customerSearchTextBoxDoneButton = "Ok";
//    String customerSearchTextBoxDoneButton = "//XCUIElementTypeStaticText[@name=\"Ok\"]";

    String searchResultHasMenuItem = "SANDWICHES";
//    String searchResultHasMenuItem = "SANDWICHES";

    String searchResultHasNoMenuItem = "//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeStaticText";
    String upchargeWithoutModifierMenuItem = "(//button[contains(@class,'menu-btn subCategoryBtn')]/div[contains(.,'SANDWICHES')])[1]";


    String upchargeWithoutModifierPrice = "40,00";

    String upchargeWithModifierMenuItem = "(//button[contains(@class,'menu-btn subCategoryBtn')]/div[contains(.,'Sandwiches Upcharge Add Modifier')])[1]";
//    String upchargeWithModifierMenuItem = "//XCUIElementTypeStaticText[@name=\"Sandwiches Upcharge Add Modifier\"]";


    String upchargeWithModifierPrice = "70,00";

    String addNewCustomerIcon = "New Customer";
//    String addNewCustomerIcon = "//XCUIElementTypeButton[@name=\"New Customer\"]";

    String selectedCustomer = "Test Automation";
//    String selectedCustomer = "//XCUIElementTypeButton[@name=\"Test Automation\"]";

    String addedCustomer = "Test A";
//    String addedCustomer = "Test A";

    String tillManagementButton = "Counting Machine";
//    String tillManagementButton = "//XCUIElementTypeButton[@name=\"Counting Machine\"]";

    String settingIcon = "(//linga-icon[@symbol='operationGear'])[1]";
//    String settingIcon = "//XCUIElementTypeButton[@name=\"Settings 1\"]";

    String operationMenuTitle = "(//label[contains(.,'Operation')])[1]";
//    String operationMenuTitle = "//XCUIElementTypeStaticText[@name=\"Operation\"]";

    String syncIcon = "//button[@class='mat-focus-indicator ion-text-center mat-button mat-button-base _mat-animation-noopable ng-star-inserted'][1]";
//    String syncIcon = "//XCUIElementTypeButton[@name=\"Sync\"]";

    String syncInfo = "Your iPad is up to date";
//    String syncInfo = "//XCUIElementTypeStaticText[@name=\"Your iPad is up to date\"]";


    String logOffButton = "//button[@id='os_logOff']";

    String freeMenuItem = "//div[@class='free-section']//div[contains(@class,'p-col-4 discount-section-name disc-padding')]";
//    String freeMenuItem = "//XCUIElementTypeStaticText[@name=\"(F) Garlic Bread EACH\"]";

    String openItem = "Test Automation";
//    String openItem = "Test Automation";

    String taxName = "Tax";
//    String taxName = "//XCUIElementTypeStaticText[@name=\"Tax\"]";

    String taxAmount = "TL 2,70";
//    String taxAmount = "//XCUIElementTypeStaticText[@name=\"TL 2,70\"]";

    String checkBasedAmountTitle = "Check Based Amount";
//    String checkBasedAmountTitle = "//XCUIElementTypeStaticText[@name=\"Check Based Amount\"]";

    String checkBasedDiscountAmount = "10,00";
//    String checkBasedDiscountAmount = "//XCUIElementTypeStaticText[@name=\"10,00\"]";

    String checkBasedPercentageTitle = "Check-Based Percentage";
//    String checkBasedPercentageTitle = "//XCUIElementTypeStaticText[@name=\"Check-Based Percentage\"]";

    String checkBasedDiscountPercentageAmount = "TL 460,00";
//    String checkBasedDiscountPercentageAmount = "//XCUIElementTypeStaticText[@name=\"TL 460,00\"]";

    String checkBasedFreeTitle = "Check Based Free";
//    String checkBasedFreeTitle = "//XCUIElementTypeStaticText[@name=\"Check Based Free\"]";

    String checkBasedDiscountFreeAmount = "0,00";
//    String checkBasedDiscountFreeAmount = "//XCUIElementTypeStaticText[@name=\"0,00\"]";

    String checkBasedSetPriceTitle = "Check Based Set Price";
//    String checkBasedSetPriceTitle = "//XCUIElementTypeStaticText[@name=\"Check Based Set Price\"]";

    String checkBasedSetPriceAmount = "20,00";
//    String checkBasedSetPriceAmount = "//XCUIElementTypeStaticText[@name=\"20,00\"]";

    String itemBasedAmountTitle = "//div[@class='discount-section']//div[contains(.,'ItemBased with Amount')]";
//    String itemBasedAmountTitle = "//XCUIElementTypeStaticText[@name=\"ItemBased with Amount\"]";

    String itemBasedAmount = "500,00";
//    String itemBasedAmount = "//XCUIElementTypeStaticText[@name=\"500,00\"]";

    String itemBasedPercentageTitle = "//div[@class='discount-section']//div[contains(.,'ItemBased with Percentage')]";
//    String itemBasedPercentageTitle = "//XCUIElementTypeStaticText[@name=\"ItemBased with Percentage\"]";

    String itemBasedPercentageText = "//div[@class='discount-section']//div[contains(.,'IB-AfterTax-Percentage')]";
//    String itemBasedPercentageText = "//XCUIElementTypeStaticText[@name=\"IB-AfterTax-Percentage\"]";

    String itemBasedBeforeTaxPercentageText = "//div[@class='discount-section']//div[contains(.,'IB-BeforeTax-Percentage')]";
//    String itemBasedBeforeTaxPercentageText = "//XCUIElementTypeStaticText[@name=\"IB-BeforeTax-Percentage\"]";

    String itemBasedBeforeTaxAmountText = "//div[@class='discount-section']//div[contains(.,'IB-BeforeTax-Amount')]";
//    String itemBasedBeforeTaxAmountText = "//XCUIElementTypeStaticText[@name=\"IB-BeforeTax-Amount\"]";

    String itemBasedPercentageAmount = "3,00";
//    String itemBasedPercentageAmount = "//XCUIElementTypeStaticText[@name=\"3,00\"]";

    String itemBasedFreeTitle = "Item-Based with Free";
//    String itemBasedFreeTitle = "//XCUIElementTypeStaticText[@name=\"Item-Based with Free\"]";

    String itemBasedFreeAmount = "0,00";
//    String itemBasedFreeAmount = "//XCUIElementTypeStaticText[@name=\"0,00\"]";

    String autoDiscountMenuItem = "Little Coke";
//    String autoDiscountMenuItem = "//XCUIElementTypeStaticText[@name=\"Little Coke\"]";

    String autoDiscountAmountOnList = "400,00";
    //    String autoDiscountAmountOnList = "//XCUIElementTypeStaticText[@name=\"400,00\"]";
    String autoDiscountAmountOnBill = "(//XCUIElementTypeStaticText[@name=\"Discount\"])[1]";
    String discountAmountForAutoDiscount = "(//XCUIElementTypeStaticText[@name=\"TL 400,00\"])[1]";

    String tableLast = "";
    //    String tableLast = "";
    String downArrowIcon = "(//XCUIElementTypeButton[@name=\"arrow down\"])[1]";

    String toBeDeletedSeat = "Delete_Seats";
//    String toBeDeletedSeat = "//XCUIElementTypeImage[@name=\"Delete_Seats\"]";

    String upArrowIcon = "arrow up";
//    String upArrowIcon = "//XCUIElementTypeButton[@name=\"arrow up\"]";

    String editSeatButton = "edit DeleteSeats";
//    String editSeatButton = "//XCUIElementTypeButton[@name=\"edit DeleteSeats\"]";


    String taxTitle = "Tax";

    String inclusiveTaxAmount = "TL 210,11";
//    String inclusiveTaxAmount = "//XCUIElementTypeStaticText[@name=\"TL 210,11\"]";

    String deliveryOption = "DELIVERY";
//    String deliveryOption = "DELIVERY";

    String exclusiveTaxAmount = "TL 210,11";
//    String exclusiveTaxAmount = "TL 210,11";

    String quantityTaxAmount = "TL 210,11";
//    String quantityTaxAmount = "//XCUIElementTypeStaticText[@name=\"TL 210,11\"]";

    String barTabOption = "BarTab";
//    String barTabOption = "//XCUIElementTypeStaticText[@name=\"BarTab\"]";

    String OverWriteCCOption = "OVERWRITE CC SETTING";
//    String OverWriteCCOption = "//XCUIElementTypeStaticText[@name=\"OVERWRITE CC SETTING\"]";

    String selectedBarTabOption = "(//XCUIElementTypeStaticText[@name=\"BarTab\"])[2]";

    String newlyAddedCustomer = "Test A";
//    String newlyAddedCustomer = "//XCUIElementTypeButton[@name=\"Test A\"]";

    String removeCustomerButton = "Remove";
//    String removeCustomerButton = "//XCUIElementTypeStaticText[@name=\"Remove\"]";

    String existingCustomer = "(//XCUIElementTypeStaticText[@name=\"Test Automation\"])[5]";

    String closeSaleInfoPopUp = "//mat-dialog-content[contains(.,'close the sale')]";
    String  closeYourSaleTxt = "//mat-dialog-content[contains(.,'Close Your Sale')]";

    String  closeTheSaleTxt = "//mat-dialog-content[contains(.,'close the sale')]";
    String syncInfoPopUp = "//p[contains(.,'Please close the sale to sync the data')]";
//    String syncInfoPopUp = "Please close the sale to sync the data";

    String serviceTypeButton = "//button[contains(@id,'os_menu')]";
    String searchCategoryInfoMessage = "//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeStaticText";

    String firstAddedCustomer = "Test Automation";
//    String firstAddedCustomer = "Test Automation";

    String selectFirstCustomer = "Test";
//    String selectFirstCustomer = "//XCUIElementTypeButton[@name=\"Test\"]";

    String firstCustomer = "Test A";
//    String firstCustomer = "//XCUIElementTypeButton[@name=\"Test A\"]";

    String editedCustomer = "Test";
//    String editedCustomer = "//XCUIElementTypeButton[@name=\"Test\"]";

    String forHereServiceType = "FORHERE";
//    String forHereServiceType = "//XCUIElementTypeStaticText[@name=\"FORHERE\"]";

    String selectedForHereServiceType = "FORHERE";
//    String selectedForHereServiceType = "//XCUIElementTypeStaticText[@name=\"FORHERE\"]";

    String deleteLastSeat = "Delete_Seats";
//    String deleteLastSeat = "//XCUIElementTypeImage[@name=\"Delete_Seats\"]";

    String lastSeat = "//button[.=' 2 ']";
//    String lastSeat = "//XCUIElementTypeStaticText[@name=\"2\"]";

    String selectedPhoneToGo = "ToGo";
//    String selectedPhoneToGo = "//XCUIElementTypeStaticText[@name=\"ToGo\"]";

    String selectedPhoneDelivery = "DELIVERY";
//    String selectedPhoneDelivery = "//XCUIElementTypeStaticText[@name=\"DELIVERY\"]";

    String selectedDelivery = "DELIVERY";
//    String selectedDelivery = "//XCUIElementTypeStaticText[@name=\"DELIVERY\"]";

    String noSelectedCustomer = "Walkin";
//    String noSelectedCustomer = "//XCUIElementTypeButton[@name=\"Walkin\"]";

    String firstOrderedMenuItem = "//XCUIElementTypeStaticText[@name=\"SANDWICHES \"]";
    String repeatedMenuItem = "(//div[contains(@class,'menu-section orderlist-flex ')]//div[contains(.,'SANDWICHES')])[2]";


    String quantityOfOrder = "/html/body/app-root/app-dashboard-container/ion-app/ion-content/ion-grid/ion-row/ion-col[1]/app-order-list-container/ion-app/ion-content/div/app-ordered-list/ion-app/ion-content/div/div/div/div[2]/div/div/div[3]";
//    String quantityOfOrder = "//XCUIElementTypeStaticText[@name=\"2\"]";

    String quantityOfOrderAfterDecrease = "/html/body/app-root/app-dashboard-container/ion-app/ion-content/ion-grid/ion-row/ion-col[1]/app-order-list-container/ion-app/ion-content/div/app-ordered-list/ion-app/ion-content/div/div/div/div[2]/div/div/div[3]";
//    String quantityOfOrderAfterDecrease = "//XCUIElementTypeStaticText[@name=\"1\"]";

    String fourthMenuItem = "(//button[contains(@class,'menu-btn subCategoryBtn')]/div[contains(.,'Fried Crab Cakes')])[1]";
//    String fourthMenuItem = "//XCUIElementTypeStaticText[@name=\"Fried Crab Cakes\"]";

    String secondItemThirdModifier = "//span[contains(.,'Wheat Bread')]";
//    String secondItemThirdModifier = "//XCUIElementTypeStaticText[@name=\"Wheat Bread\"]";


    String secondOrderThirdModifier = "//div[@class='modifier-section']//div[contains(.,'Wheat Bread')]";

    String emptyOrderList = "empty set title";
//    String emptyOrderList = "//XCUIElementTypeStaticText[@name=\"empty set title\"]";


    String firstModifierOfFirstItemName = "//div[@class='modifier-section']//div[contains(.,'1/2 Romano')]";

    String firstModifierOfFirstOrderName = "//span[contains(.,'1/2 Romano')]";
//    String firstModifierOfFirstOrderName = "//XCUIElementTypeStaticText[@name=\"1/2 Romano\"]";

    String firstModifierOfThirdMenuItem = "//span[contains(.,'1/2 Romano')]";
//    String firstModifierOfThirdMenuItem = "//XCUIElementTypeStaticText[@name=\"1/2 Romano\"]";

    String firstModifierOfFirstItemBalance = "//div[@class='modifier-section']//div[(@class='p-col-3 text-pos-end qsr-mod-padding ')]";
//    String firstModifierOfFirstItemBalance = "//XCUIElementTypeStaticText[@name=\"9,00\"]";

    String firstModifierOfFirstItemAmount = "//div[@class='modifier-section']//div[contains(.,'2')]";
    String secondModifierOfFirstItemAmount = "(//div[@class='modifier-section']//div[contains(.,'1')])[1]";

    String deleteModifier = "Delete";
//    String deleteModifier = "//XCUIElementTypeStaticText[@name=\"Delete\"]";

    String removedTaxExempt = "(//XCUIElementTypeStaticText[@name=\"TL 0,00\"])[1]";

    String totalBalanceWithTaxExempt = "TL 33,00";
//    String totalBalanceWithTaxExempt = "//XCUIElementTypeStaticText[@name=\"TL 33,00\"]";

    String secondMenuItemHasModifier = "(//button[contains(@class,'menu-btn subCategoryBtn')]/div[contains(.,'Fried Crab Cakes')])[1]";
//    String secondMenuItemHasModifier = "//XCUIElementTypeStaticText[@name=\"Fried Crab Cakes\"]";

    String maximumCountText = "//mat-dialog-content[(@id='alert-done-popup')]";
//    String maximumCountText = "//XCUIElementTypeTextView[@name=\"You reached the maximum count\"]";

    String firstModifierForSecondMenuItem = "//span[contains(.,'RYE BREAD')]";
//    String firstModifierForSecondMenuItem = "//XCUIElementTypeStaticText[@name=\"RYE BREAD\"]";

    String addVoidReasonButton = "(//button[contains(.,' Add ')])[2]";
//    String addVoidReasonButton = "//XCUIElementTypeStaticText[@name=\"Add\"]";

    String voidReceiptPrinterDoneButton = "Done";
//    String voidReceiptPrinterDoneButton = "//XCUIElementTypeStaticText[@name=\"Done\"]";


    String firstOrderMenuItem = "//XCUIElementTypeStaticText[@name=\"SANDWICHES \"]";
    String barTabCustomerNameText = "//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeTextField";

    String BarTabCustomerNameTitle = "//ion-label[contains(.,'Enter the Customer Name')]";
//    String BarTabCustomerNameTitle = "//XCUIElementTypeStaticText[@name=\"Enter the Customer Name\"]";

    String thirdMenuItem = "(//button[contains(@class,'menu-btn subCategoryBtn')]/div[contains(.,'Cheesy Bacon Fries')])[1]";
//    String thirdMenuItem = "//XCUIElementTypeStaticText[@name=\"Cheesy Bacon Fries\"]";

    String modifierDoneButton = "//button[contains(.,'Done')]";
//    String modifierDoneButton = "Done";

    String mandatoryWarningPopup = "You need to pick at least 1 modifiers from this Group";
//    String mandatoryWarningPopup = "//XCUIElementTypeTextView[@name=\"You need to pick at least 1 modifiers from this Group\"]";

    String mandatoryModifierWarningDoneButton = "Done";
//    String mandatoryModifierWarningDoneButton = "//XCUIElementTypeStaticText[@name=\"Done\"]";


    String fourthMenuItemOrder = "//XCUIElementTypeStaticText[@name=\"Fried Crab Cakes \"]";

    String barTabOrderTypeButton = "//span[contains(.,' BarTab ')]";
//    String barTabOrderTypeButton = "//XCUIElementTypeStaticText[@name=\"Bar Tab\"]";

    String pizzaTab = "PIZZA";
//    String pizzaTab = "//XCUIElementTypeStaticText[@name=\"PIZZA\"]";

    String thirdModifierOfSecondPizzaMenuItem = "//button[contains(.,'Bacon')]";
//    String thirdModifierOfSecondPizzaMenuItem = "//XCUIElementTypeStaticText[@name=\"Bacon\"]";

    String secondModifierPrefix = "//span[.=' Extra ']";
//    String secondModifierPrefix = "//XCUIElementTypeStaticText[@name=\"Extra\"]";

    String garlicBread = "(//button[contains(@class,'menu-btn subCategoryBtn')]/div[contains(.,'Garlic Bread')])[1]";
//    String garlicBread = "//XCUIElementTypeStaticText[@name=\"Garlic Bread\"]";

    String optionalModifier = "Well done";
//    String optionalModifier = "//XCUIElementTypeStaticText[@name=\"Well done\"]";

    String optionalModifierInOrderList = "//XCUIElementTypeStaticText[@name=\" WELL DONE\"]";

    String fifthMenuItemOfFood = "(//button[contains(@class,'menu-btn subCategoryBtn')]/div[contains(.,'B.I. Wings')])[1]";
//    String fifthMenuItemOfFood = "//XCUIElementTypeStaticText[@name=\"B.I. Wings\"]";

    String firstModifierOfFifthMenuItem = "//span[contains(.,'Asparagus')]";
//    String firstModifierOfFifthMenuItem = "//XCUIElementTypeStaticText[@name=\"Asparagus\"]";


    String firstModifierOfFifthMenuItemInOrderList = "//XCUIElementTypeStaticText[@name=\" Asparagus\"]";
    String firstModifierOfThirdMenuItemInOrderList = "//XCUIElementTypeStaticText[@name=\" 1/2 Romano\"]";

    String secondMenuItem = "Onion Rings";
//    String secondMenuItem = "//XCUIElementTypeStaticText[@name=\"Onion Rings\"]";


    String inclusiveTaxAmountForModifier = "(//XCUIElementTypeStaticText[@name=\"TL 0,00\"])[1]";

    String firstModifierPrefixOfSeventhMenuItem = "4 bbq";
//    String firstModifierPrefixOfSeventhMenuItem = "//XCUIElementTypeStaticText[@name=\"4 bbq\"]";

    String menuItemHasExclusiveTax = "Hot Wings";
//    String menuItemHasExclusiveTax = "//XCUIElementTypeStaticText[@name=\"Hot Wings\"]";

    String eachOptionForHotWings = "EACH";
//    String eachOptionForHotWings = "//XCUIElementTypeStaticText[@name=\"EACH\"]";

    String firstModifierForMenuItemHasExclusiveTax = "Anchovy";
//    String firstModifierForMenuItemHasExclusiveTax = "//XCUIElementTypeStaticText[@name=\"Anchovy\"]";

    String exlusiveTaxAmount = "TL 210,11";
//    String exlusiveTaxAmount = "//XCUIElementTypeStaticText[@name=\"TL 210,11\"]";

    String noneOptionForFourthMenuItem = "//span[contains(.,'None')]";
//    String noneOptionForFourthMenuItem = "//XCUIElementTypeStaticText[@name=\"None\"]";

    String secondMenuItemOfPizza = "(//button[contains(@class,'menu-btn subCategoryBtn')]/div[contains(.,'Pizza Rucola')])[1]";
//    String secondMenuItemOfPizza = "//XCUIElementTypeStaticText[@name=\"Pizza Rucola\"]";


    String firstModifierPrefixOfSeventhMenuItemOnOrderList = "//XCUIElementTypeStaticText[@name=\" 4 BBQ\"]";

    String itemBasedAfterTaxDiscountTitle = "Discount";
    //    String itemBasedAfterTaxDiscountTitle = "//XCUIElementTypeStaticText[@name=\"Discount\"]";
    String itemBasedAfterTaxDiscountAmount = "(//XCUIElementTypeStaticText[@name=\"1.000,00\"])[1]";

    String BlackBluPizza = "(//button[contains(@class,'menu-btn subCategoryBtn')]/div[contains(.,'Black and Blu Pizza')])[1]";
//    String BlackBluPizza = "//XCUIElementTypeStaticText[@name=\"Black and Blu Pizza\"]";

    String PizzaRomano = "(//button[contains(@class,'menu-btn subCategoryBtn')]/div[contains(.,'Pizza Romano')])[1]";
//    String PizzaRomano = "//XCUIElementTypeStaticText[@name=\"Pizza Romano\"]";

    String PizzaRucola = "(//button[contains(@class,'menu-btn subCategoryBtn')]/div[contains(.,'Pizza Rucola')])[1]";
//    String PizzaRucola = "//XCUIElementTypeStaticText[@name=\"Pizza Rucola\"]";

    String PizzaLasagna = "(//button[contains(@class,'menu-btn subCategoryBtn')]/div[contains(.,'Pizza Lasagna')])[1]";
//    String PizzaLasagna = "//XCUIElementTypeStaticText[@name=\"Pizza Lasagna\"]";

    String checkBasedAfterTaxTitle = "CheckBased-AfterTax";
//    String checkBasedAfterTaxTitle = "//XCUIElementTypeStaticText[@name=\"CheckBased-AfterTax\"]";

    String checkBasedAfterTaxAmount = "1.000,00";
//    String checkBasedAfterTaxAmount = "//XCUIElementTypeStaticText[@name=\"1.000,00\"]";

    String itemBasedBeforeTaxTitle = "IB-DiscountBeforeTax";
//    String itemBasedBeforeTaxTitle = "//XCUIElementTypeStaticText[@name=\"IB-DiscountBeforeTax\"]";

    String itemBasedBeforeTaxAmount = "//div[@class='discount-section']//div[contains(.,'IB-DiscountAfterTax')]";

    String itemBasedRestrictRoleTitle = "BeforeTaxRoleRestriction";
//    String itemBasedRestrictRoleTitle = "//XCUIElementTypeStaticText[@name=\"BeforeTaxRoleRestriction\"]";

    String itemBasedRestrictDayAmount = "10,00";
//    String itemBasedRestrictDayAmount = "//XCUIElementTypeStaticText[@name=\"10,00\"]";

    String itemBasedAfterTaxRestrictRoleTitle = "AfterTax-RoleRestriction";
//    String itemBasedAfterTaxRestrictRoleTitle = "//XCUIElementTypeStaticText[@name=\"AfterTax-RoleRestriction\"]";

    String itemBasedAfterTaxRestrictRoleAmount = "10,00";
//    String itemBasedAfterTaxRestrictRoleAmount = "//XCUIElementTypeStaticText[@name=\"10,00\"]";

    String checkBasedAfterTaxOpenItem =  "//div[@class='discount-section']//div[contains(.,'CB-AfterTax-OpenItem')]";
//    String checkBasedAfterTaxOpenItem = "//XCUIElementTypeStaticText[@name=\"CB-AfterTax-OpenItem\"]";

    String checkBasedBeforeTaxAutoDiscountText = "CheckBased-BeforeTax-Auto";
//    String checkBasedBeforeTaxAutoDiscountText = "//XCUIElementTypeStaticText[@name=\"CheckBased-BeforeTax-Auto\"]";

    String totalAmountWithGratuityAmount = "TL 917,99";
//    String totalAmountWithGratuityAmount = "//XCUIElementTypeStaticText[@name=\"TL 917,99\"]";

    String totalAmountWithoutTaxAndGratuity = "TL 810,01";
//    String totalAmountWithoutTaxAndGratuity = "//XCUIElementTypeStaticText[@name=\"TL 810,01\"]";

    String onionRings = "Onion Rings";
//    String onionRings = "//XCUIElementTypeStaticText[@name=\"Onion Rings\"]";

    String cheesePizza = "Cheese Pizza";
//    String cheesePizza = "//XCUIElementTypeStaticText[@name=\"Cheese Pizza\"]";

    String margarita = "(//button[contains(@class,'menu-btn subCategoryBtn')]/div[contains(.,'**Margarita**')])[1]";

    String pizzaTomBasil = "(//button[contains(@class,'menu-btn subCategoryBtn')]/div[contains(.,'Pizza Tom Basil')])[1]";
//    String pizzaTomBasil = "//XCUIElementTypeStaticText[@name=\"Pizza Tom Basil\"]";

    String pizzaMel = "(//button[contains(@class,'menu-btn subCategoryBtn')]/div[contains(.,'Pizza Mel')])[1]";
//    String pizzaMel = "//XCUIElementTypeStaticText[@name=\"Pizza Mel\"]";

    String defaultTaxAmountOnPizzaMel = "TL 357,00";
//    String defaultTaxAmountOnPizzaMel = "//XCUIElementTypeStaticText[@name=\"TL 357,00\"]";

    String quantityBasedTaxAmountOnOnionRings = "TL 25,00";
//    String quantityBasedTaxAmountOnOnionRings = "//XCUIElementTypeStaticText[@name=\"TL 25,00\"]";

    String inclusiveTaxAmountOnCheesePizza = "TL 120,13";
//    String inclusiveTaxAmountOnCheesePizza = "//XCUIElementTypeStaticText[@name=\"TL 120,13\"]";

    String checkBasedTaxWithoutSubtotalAmountOnMargarita = "TL 357,00";
//    String checkBasedTaxWithoutSubtotalAmountOnMargarita = "//XCUIElementTypeStaticText[@name=\"TL 357,00\"]";

    String checkBasedTaxWithSubtotalAmountOnPizzaTomBasili = "TL 487,90";
    //    String checkBasedTaxWithSubtotalAmountOnPizzaTomBasili = "//XCUIElementTypeStaticText[@name=\"TL 487,90\"]";
    String bigSizeOfTomBasilPizza = "//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeCollectionView/XCUIElementTypeCell[3]/XCUIElementTypeStaticText";

    String californiaPizza = "California Pizza";
//    String californiaPizza = "//XCUIElementTypeStaticText[@name=\"California Pizza\"]";

    String taxOnItemTaxForInclusiveTaxTextOnPizzaTomBasili = "TL 1,00";
//    String taxOnItemTaxForInclusiveTaxTextOnPizzaTomBasili = "//XCUIElementTypeStaticText[@name=\"TL 1,00\"]";

    String neapolitanPizza = "Neapolitan Pizza";
//    String neapolitanPizza = "//XCUIElementTypeStaticText[@name=\"Neapolitan Pizza\"]";

    String taxOnItemTaxForInclusiveTaxTextOnNeapolitanPizza = "TL 210,00";
//    String taxOnItemTaxForInclusiveTaxTextOnNeapolitanPizza = "//XCUIElementTypeStaticText[@name=\"TL 210,00\"]";


    String discountText = "(//XCUIElementTypeStaticText[@name=\"Discount\"])[1]";

    String itemBasedFreeDiscountBeforeTaxAmount = "TL 500,00";
//    String itemBasedFreeDiscountBeforeTaxAmount = "//XCUIElementTypeStaticText[@name=\"TL 500,00\"]";

    String checkBasedPercentageDiscountWithAfterTaxAmount = "TL 460,00";
//    String checkBasedPercentageDiscountWithAfterTaxAmount = "//XCUIElementTypeStaticText[@name=\"TL 460,00\"]";

    String checkBasedPercentageDiscountWithAfterTaxAmountAndFreeItem = "TL 459,99";
//    String checkBasedPercentageDiscountWithAfterTaxAmountAndFreeItem = "//XCUIElementTypeStaticText[@name=\"TL 459,99\"]";

    String checkBasedAmountDiscountWithAfterTaxAmount = "TL 405,00";
//    String checkBasedAmountDiscountWithAfterTaxAmount = "//XCUIElementTypeStaticText[@name=\"TL 405,00\"]";

    String checkBasedSetPriceDiscountWithAfterTaxAmount = "TL 990,00";
//    String checkBasedSetPriceDiscountWithAfterTaxAmount = "//XCUIElementTypeStaticText[@name=\"TL 990,00\"]";

    String checkBasedFreeDiscountAfterTaxAmount = "400,00";
//    String checkBasedFreeDiscountAfterTaxAmount = "//XCUIElementTypeStaticText[@name=\"400,00\"]";

    String checkBasedAmountDiscountWithBeforeTaxAmount = "TL 410,00";
    //String checkBasedAmountDiscountWithBeforeTaxAmount = "//XCUIElementTypeStaticText[@name=\"TL 410,00\"]";

    String checkBasedSetPriceDiscountWithBeforeTaxAmount = "TL 995,00";
//    String checkBasedSetPriceDiscountWithBeforeTaxAmount = "//XCUIElementTypeStaticText[@name=\"TL 995,00\"]";

    String checkBasedFreeDiscountWithBeforeTaxAmount = "0,00";
//    String checkBasedFreeDiscountWithBeforeTaxAmount = "//XCUIElementTypeStaticText[@name=\"0,00\"]";

    String chickenSchnitzel = "Chicken Schnitzel";
//    String chickenSchnitzel = "//XCUIElementTypeStaticText[@name=\"Chicken Schnitzel\"]";

    String openCheckDiscountAsAmountAmountOnOrderSide = "128,55";
//    String openCheckDiscountAsAmountAmountOnOrderSide = "//XCUIElementTypeStaticText[@name=\"128,55\"]";

    String openCheckDiscountAsAmountAmountOnOrderSideForMargarita = "100,05";
//    String openCheckDiscountAsAmountAmountOnOrderSideForMargarita = "//XCUIElementTypeStaticText[@name=\"100,05\"]";

    String openCheckDiscountAsAmountAmountOnPriceSide = "TL 588,36";
//    String openCheckDiscountAsAmountAmountOnPriceSide = "//XCUIElementTypeStaticText[@name=\"TL 588,36\"]";

    String openCheckDiscountAsAmountAmountOnPriceSideForMargarita = "TL 1.198,00";
//    String openCheckDiscountAsAmountAmountOnPriceSideForMargarita = "//XCUIElementTypeStaticText[@name=\"TL 1.198,00\"]";

    String polloParm = "Pollo Parm";
//    String polloParm = "//XCUIElementTypeStaticText[@name=\"Pollo Parm\"]";

    String sandwiches = "(//button[contains(@class,'menu-btn subCategoryBtn')]/div[contains(.,'SANDWICHES')])[1]";
//    String sandwiches = "//XCUIElementTypeStaticText[@name=\"SANDWICHES\"]";

    String sandwichesTaxAmount = "TL 210,11";
//    String sandwichesTaxAmount = "//XCUIElementTypeStaticText[@name=\"TL 210,11\"]";



    //    String exlusiveTaxAmountForHotWings = "//XCUIElementTypeStaticText[@name=\"TL 122,21\"]";
    String exlusiveTaxAmountForHotWings = "TL 122,21";
    String addedLastCustomer = "(//XCUIElementTypeStaticText[@name=\"Test Automation\"])[last]";
    //    String selectedCustomerForBarTab = "//XCUIElementTypeButton[@name=\"Test Automation\"]";
    String selectedCustomerForBarTab = "Test Automation";
    //    String foodCategoryOption = "//XCUIElementTypeStaticText[@name=\"FOOD\"]";
    String foodCategoryOption = "FOOD";
    String foodCategoryTitle = "//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeStaticText";
    String deleteAddedSeat = "//XCUIElementTypeImage[@name=\"Delete_Seats\"]";
    String deleteTheSeat = "(//XCUIElementTypeStaticText[@name=\"2\"])[2]";
    //    String deleteAddedSeat = "Delete_Seats";
    //    String dineInOrderType = "//XCUIElementTypeStaticText[@name=\"Dine In\"]";
    String dineInOrderType = "//span[contains(.,' DINE IN ')]";
    String wellDoneOptionalModifierOnOrderList = "//div[@class='modifier-section']//div[contains(.,'WELL DONE')]";
    //    String wellDoneOptionalModifier = "//XCUIElementTypeStaticText[@name=\"WELL DONE\"]";
    String wellDoneOptionalModifier = "//span[contains(.,'WELL DONE')]";
    //    String extraPrefixForAnchovyModifier = "//XCUIElementTypeStaticText[@name=\"Extra\"]";
    String extraPrefixForAnchovyModifier = "//span[contains(.,'Extra')]";
    //    String extraPrefixForAnchovyModifierOnOrderList = "//XCUIElementTypeStaticText[@name=\"Extra Anchovy\"]";
    String extraPrefixForAnchovyModifierOnOrderList = "//span[contains(.,'Extra Anchovy')]";
    //    String taxAmountForSandwiches = "//XCUIElementTypeStaticText[@name=\"TL 1.200,00\"]";
    String taxAmountForSandwiches = "TL 1.100,00";
    //    String itemBasedDiscountAfterTaxPercentageAmountOnOrderList = "//XCUIElementTypeStaticText[@name=\"99,99\"]";
    String itemBasedDiscountAfterTaxPercentageAmountOnOrderList = "99,99";
    //    String dietCokeFreeMenuItemWithSandwiches = "//XCUIElementTypeStaticText[@name=\"(F) Diet Coke EACH\"]";
    String dietCokeFreeMenuItemWithSandwiches = "(F) Diet Coke EACH";
    //    String freeMenuItemAmountWithSandwiches = "//XCUIElementTypeStaticText[@name=\"TL 599,90\"]";
    String freeMenuItemAmountWithSandwiches = "TL 599,90";
    //    String freeMenuItemAmountWithSandwich = "//XCUIElementTypeStaticText[@name=\"TL 629,90\"]";
    String freeMenuItemAmountWithSandwich = "TL 629,90";
    //    String tunaTacosFreeMenuItemWithSandwiches = "//XCUIElementTypeStaticText[@name=\"(F) Tuna Tacos EACH\"]";
    String tunaTacosFreeMenuItemWithSandwiches = "(F) Tuna Tacos EACH";
    //    String beforeTaxAsSetPriceForSandwiches = "//XCUIElementTypeStaticText[@name=\"IB-BeforeTax-SetPrice\"]";
    String beforeTaxAsSetPriceForSandwiches = "//div[@class='discount-section']//div[contains(.,'IB-BeforeTax-SetPrice')]";
    //    String beforeTaxAsSetPriceAmountForSandwiches = "//XCUIElementTypeStaticText[@name=\"TL 1.200,00\"]";
    String beforeTaxAsSetPriceAmountForSandwiches = "TL 1.200,00";
    //    String checkBasedAfterTaxPercentageWithSandwiches = "//XCUIElementTypeStaticText[@name=\"CB-PercentageAfterTax\"]";
    String checkBasedAfterTaxPercentageWithSandwiches = "//div[@class='discount-section']//div[contains(.,'CB-PercentageAfterTax')]";
    //    String checkBasedAfterTaxAsPercentageAmountForSandwiches = "//XCUIElementTypeStaticText[@name=\"TL 100,00\"]";
    String checkBasedAfterTaxAsPercentageAmountForSandwiches = "TL 100,00";
    //    String checkBasedAfterTaxAsPercentageAmountForSandwiches1 = "//XCUIElementTypeStaticText[@name=\"99,99\"]";
    String checkBasedAfterTaxAsPercentageAmountForSandwiches1 = "99,99";
    //    String checkBasedAfterTaxAsPercentageAmountForSandwich = "//XCUIElementTypeStaticText[@name=\"TL 99,99\"]";
    String checkBasedAfterTaxAsPercentageAmountForSandwich = "TL 99,99";
    //    String checkBasedBeforeTaxPercentageWithSandwiches = "//XCUIElementTypeStaticText[@name=\"CB-PercentageBeforeTax\"]";
    String checkBasedBeforeTaxPercentageWithSandwiches = "//div[@class='discount-section']//div[contains(.,'CB-PercentageBeforeTax')]";
    //    String checkBasedBeforeTaxAsPercentageAmountForSandwiches = "//XCUIElementTypeStaticText[@name=\"100,00\"]";
    String checkBasedBeforeTaxAsPercentageAmountForSandwiches = "100,00";
    //    String checkBasedBeforeTaxAmountWithSandwiches = "//XCUIElementTypeStaticText[@name=\"CB-AmountBeforeTax\"]";
    String checkBasedBeforeTaxAmountWithSandwiches = "//div[@class='discount-section']//div[contains(.,'CB-AmountBeforeTax')]";
    //    String checkBasedBeforeTaxAsAmountForSandwichesAmount = "//XCUIElementTypeStaticText[@name=\"5,00\"]";
    String checkBasedBeforeTaxAsAmountForSandwichesAmount = "5,00";
    //    String checkBasedAfterTaxSetPriceWithSandwiches = "//XCUIElementTypeStaticText[@name=\"CB-AfterTax-SetPrice\"]";
    String checkBasedAfterTaxSetPriceWithSandwiches = "//div[@class='discount-section']//div[contains(.,'CB-AfterTax-SetPrice')]";
    //    String checkBasedAfterTaxSetPriceAmountWithSandwiches = "//XCUIElementTypeStaticText[@name=\"970,00\"]";
    String checkBasedAfterTaxSetPriceAmountWithSandwiches = "970,00";
    //    String checkBasedBeforeTaxSetPriceWithSandwiches = "//XCUIElementTypeStaticText[@name=\"CB-BeforeTax-SetPrice\"]";
    String checkBasedBeforeTaxSetPriceWithSandwiches = "//div[@class='discount-section']//div[contains(.,'CB-BeforeTax-SetPrice')]";
    //    String checkBasedBeforeTaxSetPriceAmountWithSandwiches = "//XCUIElementTypeStaticText[@name=\"970,00\"]";
    String checkBasedBeforeTaxSetPriceAmountWithSandwiches = "970,00";
    //    String checkBasedAfterTaxAsAmountWithSandwiches = "//XCUIElementTypeStaticText[@name=\"CheckBasedAmountAfterTax\"]";
    String checkBasedAfterTaxAsAmountWithSandwiches = "//div[@class='discount-section']//div[contains(.,'CheckBasedAmountAfterTax')]";
    //    String checkBasedAfterTaxAmountAsAmountWithSandwiches = "//XCUIElementTypeStaticText[@name=\"5,00\"]";
    String checkBasedAfterTaxAmountAsAmountWithSandwiches = "5,00";
    //    String checkBasedAfterTaxAsFreeItemWithSandwiches = "//XCUIElementTypeStaticText[@name=\"CB-AfterTax-FreeItem\"]";
    String checkBasedAfterTaxAsFreeItemWithSandwiches = "//div[@class='discount-section']//div[contains(.,'CB-AfterTax-FreeItem')]";
    //    String checkBasedAfterTaxAmountAsFreeItemWithSandwiches = "//XCUIElementTypeStaticText[@name=\"0,00\"]";
    String checkBasedAfterTaxAmountAsFreeItemWithSandwiches = "0,00";
    //    String checkBasedAfterTaxAsFreeItemMenuItemWithSandwiches = "//XCUIElementTypeStaticText[@name=\"(F) Little Coke EACH\"]";
    String checkBasedAfterTaxAsFreeItemMenuItemWithSandwiches = "(F)Little Coke EACH";
    //    String checkBasedBeforeTaxAsFreeItemWithSandwiches = "//XCUIElementTypeStaticText[@name=\"CB-BeforeTax-FreeItem\"]";
    String checkBasedBeforeTaxAsFreeItemWithSandwiches = "//div[@class='discount-section']//div[contains(.,'CB-BeforeTax-FreeItem')]";
    //    String checkBasedBeforeTaxAmountAsFreeItemWithSandwiches = "//XCUIElementTypeStaticText[@name=\"0,00\"]";
    String checkBasedBeforeTaxAmountAsFreeItemWithSandwiches = "0,00";
    //    String checkBasedBeforeTaxAsFreeItemMenuItemWithSandwiches = "//XCUIElementTypeStaticText[@name=\"(F) Little Coke EACH\"]";
    String checkBasedBeforeTaxAsFreeItemMenuItemWithSandwiches = "(F) Little Coke EACH";
    //    String openCheckDiscountText = "//XCUIElementTypeStaticText[@name=\"Open Check Discount\"]";
    String openCheckDiscountText = "Open Check Discount";


    String openCheckDiscountWithAfterTaxAsAmountForPolloParm = "120,00";
//    String openCheckDiscountWithAfterTaxAsAmountForPolloParm = "//XCUIElementTypeStaticText[@name=\"120,00\"]";

    String openCheckDiscountWithBeforeTaxAsAmountForPolloParm = "TL 1.097,75";
//    String openCheckDiscountWithBeforeTaxAsAmountForPolloParm = "//XCUIElementTypeStaticText[@name=\"TL 1.097,75\"]";

    String openCheckDiscountWithBeforeTaxAsAmountForMargarita = "120,05";
    //    String openCheckDiscountWithBeforeTaxAsAmountForMargarita = "//XCUIElementTypeStaticText[@name=\"120,05\"]";

    String openCheckDiscountWithAfterTaxAsNonDecimalAmountForPolloParm = "120,05";
//    String openCheckDiscountWithAfterTaxAsNonDecimalAmountForPolloParm = "//XCUIElementTypeStaticText[@name=\"120,05\"]";

    String openCheckDiscountWithAfterTaxAsNonDecimalAmountForMargarita = "TL 1.099,00";
//    String openCheckDiscountWithAfterTaxAsNonDecimalAmountForMargarita = "//XCUIElementTypeStaticText[@name=\"TL 1.101,00\"]";

    String openCheckDiscountWithAfterTaxAsNonDecimalAmountForMargaritaForDecimalValue = "TL 1.098,95";
//    String openCheckDiscountWithAfterTaxAsNonDecimalAmountForMargaritaForDecimalValue = "//XCUIElementTypeStaticText[@name=\"TL 1.098,95\"]";

    String upchargeSandwiches = "Sandwiches Upcharge Add Modifier";
//    String upchargeSandwiches = "//XCUIElementTypeStaticText[@name=\"Sandwiches Upcharge Add Modifier\"]";

    String totalAmountWithoutTaxForUpchargeSandwiches = "TL 12,00";
    //String totalAmountWithoutTaxForUpchargeSandwiches = "//XCUIElementTypeStaticText[@name=\"TL 12,00\"]";

    String menuItemListTitle = "//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeStaticText";

    String subtotalAmountWithTaxExempt = "";
//    String subtotalAmountWithTaxExempt = "//XCUIElementTypeStaticText[@name=\"TL 999,90\"]";

    String totalAmountWithTaxExempt = "TL 999,90";
//    String totalAmountWithTaxExempt = "//XCUIElementTypeStaticText[@name=\"TL 999,90\"]";

    String itemBasedDiscountAfterTaxWithPercentage = "IB-AfterTax-Percentage";
//    String itemBasedDiscountAfterTaxWithPercentage = "//XCUIElementTypeStaticText[@name=\"IB-AfterTax-Percentage\"]";


    //String itemBasedDiscountBeforeTaxWithPercentage = "//XCUIElementTypeStaticText[@name=\"IB-BeforeTax-Percentage\"]";
//    String itemBasedAfterTaxAsPercentageDiscountAmountForSandwiches = "//XCUIElementTypeStaticText[@name=\"TL 555,01\"]";
    String itemBasedAfterTaxAsPercentageDiscountAmountForSandwiches = "TL 555,01";
    //    String itemBasedBeforeTaxAsPercentageDiscountAmountForSandwiches = "//XCUIElementTypeStaticText[@name=\"TL 14,00\"]";
    String itemBasedBeforeTaxAsPercentageDiscountAmountForSandwiches = "TL 14,00";
    //    String itemBasedBeforeTaxAsPercentageDiscountAmountForMargarita = "//XCUIElementTypeStaticText[@name=\"TL 100,00\"]";
    String itemBasedBeforeTaxAsPercentageDiscountAmountForMargarita = "TL 100,00";
    //String itemBasedDiscountBeforeTaxWithAmount = "//XCUIElementTypeStaticText[@name=\"IB-BeforeTax-Amount\"]";
//    String itemBasedDiscountAfterTaxWithAmounts = "//XCUIElementTypeStaticText[@name=\"IB-AfterTax-Amount\"]";
    String itemBasedDiscountAfterTaxWithAmounts = "IB-AfterTax-Amount";
    //    String itemBasedBeforeTaxAsAmountDiscountAmountForSandwiches = "//XCUIElementTypeStaticText[@name=\"TL 1.000,00\"]";
    String itemBasedBeforeTaxAsAmountDiscountAmountForSandwiches = "TL 1.000,00";
    //    String itemBasedDiscountBeforeTaxWithAmountForSandwiches = "//XCUIElementTypeStaticText[@name=\"TL 1.569,11\"]";
    String itemBasedDiscountBeforeTaxWithAmountForSandwiches = "TL 1.569,11";
    //String itemBasedDiscountAfterTaxWithAmount = "//XCUIElementTypeStaticText[@name=\"IB-DiscountAfterTax\"]";
//    String itemBasedAfterTaxWithAmount = "//XCUIElementTypeStaticText[@name=\"IB-AfterTax-Amount\"]";
    String itemBasedAfterTaxWithAmount = "IB-AfterTax-Amount";
    //    String itemBasedAfterTaxAsAmountDiscountAmountForSandwiches = "//XCUIElementTypeStaticText[@name=\"TL 1.400,00\"]";
    String itemBasedAfterTaxAsAmountDiscountAmountForSandwiches = "TL 1.400,00";
    //    String itemBasedDiscountAfterTaxSetPrice = "//XCUIElementTypeStaticText[@name=\"IB-AfterTax-SetPrice\"]";
    String itemBasedDiscountAfterTaxSetPrice = "IB-AfterTax-SetPrice";
    //    String itemBasedAfterTaxAsSetPriceDiscountAmountForSandwiches = "//XCUIElementTypeStaticText[@name=\"TL 20,00\"]";
    String itemBasedAfterTaxAsSetPriceDiscountAmountForSandwiches = "TL 20,00";
    //    String itemBasedDiscountBeforeTaxSetPrice = "//XCUIElementTypeStaticText[@name=\"IB-BeforeTax-SetPrice\"]";
    String itemBasedDiscountBeforeTaxSetPrice = "//div[@class='discount-section']//div[contains(.,'IB-BeforeTax-SetPrice')]";
    //    String itemBasedBeforeTaxAsSetPriceDiscountAmountForSandwiches = "//XCUIElementTypeStaticText[@name=\"TL 20,00\"]";
    String itemBasedBeforeTaxAsSetPriceDiscountAmountForSandwiches = "//div[@id='os_discountAmountStr']//input";
    //    String customerNameOkButton = "//XCUIElementTypeStaticText[@name=\"Ok\"]";
    String customerNameOkButton = "//button[contains(.,' Ok ')]";
    //    String itemBasedAfterTaxAsSetPriceDiscountAmountForChickenSchnitzel = "//XCUIElementTypeStaticText[@name=\"TL 400,00\"]";
    String itemBasedAfterTaxAsSetPriceDiscountAmountForChickenSchnitzel = "TL 400,00";
    //    String itemBasedBeforeTaxAsSetPriceDiscountAmountForChickenSchnitzel = "//XCUIElementTypeStaticText[@name=\"TL 20,00\"]";
    String itemBasedBeforeTaxAsSetPriceDiscountAmountForChickenSchnitzel = "TL 20,00";
    //    String voidCheckInfo = "//XCUIElementTypeTextView[@name=\"All orders are voided\"]";
    String voidCheckInfo = "All orders are voided";
    //    String closeVoidCheckInfoPopup = "//XCUIElementTypeStaticText[@name=\"Done\"]";
    String closeVoidCheckInfoPopup = "Done";
    String firstOrderOnSeatOne = "(//XCUIElementTypeStaticText[@name=\"SANDWICHES \"])[1]";
    //    String seatOne = "//XCUIElementTypeStaticText[@name=\"Seat 1\"]";
    String seatOne = "Seat 1";
    //    String seatTwo = "//XCUIElementTypeStaticText[@name=\"Seat 2\"]";
    String seatTwo = "Seat 2";
    String splitedOrderPrice = "(//XCUIElementTypeStaticText[@name=\"15,00\"])[1]";
    //    String totalPriceOfSplitedOrder = "//XCUIElementTypeStaticText[@name=\"TL 33,00\"]";
    String totalPriceOfSplitedOrder = "TL 33,00";
    //    String openItemPriceTitle = "//XCUIElementTypeStaticText[@name=\"Test Automation\"]";
    String openItemPriceTitle = "Test Automation";
    //    String openItemPriceAsDecimal = "//XCUIElementTypeStaticText[@name=\"0,01\"]";
    String openItemPriceAsDecimal = "0,01";
    //String openItemPrice = "//XCUIElementTypeStaticText[@name=\"10,05\"]";
//    String beforeTaxRoleRestrictionOnMenuItemPage = "//XCUIElementTypeStaticText[@name=\"BeforeTaxRoleRestriction\"]";
    String beforeTaxRoleRestrictionOnMenuItemPage = "BeforeTaxRoleRestriction";
    //    String beforeTaxRoleRestrictionPrice = "//XCUIElementTypeStaticText[@name=\"100,00\"]";
    String beforeTaxRoleRestrictionPrice = "100,00";
    //    String varyingGratuityDiscountPriceForSandwiches = "//XCUIElementTypeStaticText[@name=\"TL 99,99\"]";
    String varyingGratuityDiscountPriceForSandwiches = "TL 99,99";
    //    String subTotalTitle = "//XCUIElementTypeStaticText[@name=\"Subtotal\"]";
    String subTotalTitle = "Subtotal";
    //    String subTotalPriceWithVaryingGratuityForSandwiches = "//XCUIElementTypeStaticText[@name=\"TL 1.000,00\"]";
    String subTotalPriceWithVaryingGratuityForSandwiches = "TL 1.000,00";
    //    String totalTitle = "//XCUIElementTypeStaticText[@name=\"Total\"]";
    String totalTitle = "Total";
    //    String totalPriceWithVaryingGratuityForSandwiches = "//XCUIElementTypeStaticText[@name=\"TL 1.299,99\"]";
    String totalPriceWithVaryingGratuityForSandwiches = "TL 1.299,99";
    //    String totalPriceOfItemBasedDiscountAfterTaxAsPercentageWithTaxExemptForSandwiches = "//XCUIElementTypeStaticText[@name=\"TL 499,91\"]";
    String totalPriceOfItemBasedDiscountAfterTaxAsPercentageWithTaxExemptForSandwiches = "TL 499,91";
    //    String totalPriceOfItemBasedDiscountBeforeTaxAsPercentageWithTaxExemptForSandwiches = "//XCUIElementTypeStaticText[@name=\"TL 499,90\"]";
    String totalPriceOfItemBasedDiscountBeforeTaxAsPercentageWithTaxExemptForSandwiches = "TL 499,90";
    //    String totalPriceOfItemBasedDiscountAfterTaxAsAmountWithTaxExemptForSandwiches = "//XCUIElementTypeStaticText[@name=\"TL 599,30\"]";
    String totalPriceOfItemBasedDiscountAfterTaxAsAmountWithTaxExemptForSandwiches = "TL 599,30";
    //    String totalPriceOfItemBasedDiscountBeforeTaxAsAmountWithTaxExemptForSandwiches = "//XCUIElementTypeStaticText[@name=\"TL 539,90\"]";
    String totalPriceOfItemBasedDiscountBeforeTaxAsAmountWithTaxExemptForSandwiches = "TL 539,90";
    //    String totalPriceOfItemBasedDiscountAfterTaxAsSetPriceWithTaxExemptForSandwiches = "//XCUIElementTypeStaticText[@name=\"TL 169,90\"]";
    String totalPriceOfItemBasedDiscountAfterTaxAsSetPriceWithTaxExemptForSandwiches = "TL 169,90";
    //    String totalPriceOfItemBasedDiscountBeforeTaxAsSetPriceWithTaxExemptForSandwiches = "//XCUIElementTypeStaticText[@name=\"TL 99,90\"]";
    String totalPriceOfItemBasedDiscountBeforeTaxAsSetPriceWithTaxExemptForSandwiches = "TL 99,90";
    //    String fixGratuityAmountPrice = "//XCUIElementTypeStaticText[@name=\"TL 99,99\"]";
    String fixGratuityAmountPrice = "TL 99,99";
    //    String subTotalPriceWithFixGratuityForSandwiches = "//XCUIElementTypeStaticText[@name=\"TL 1.000,00\"]";
    String subTotalPriceWithFixGratuityForSandwiches = "TL 1.000,00";
    //    String totalPriceWithFixGratuityForSandwiches = "//XCUIElementTypeStaticText[@name=\"TL 1.299,99\"]";
    String totalPriceWithFixGratuityForSandwiches = "TL 1.299,99";
    //    String addNewCustomerButton = "//XCUIElementTypeStaticText[@name=\"Add New\"]";
    String addNewCustomerButton = "Add New";
    //    String splitNotAllowPaymentPopupText = "//XCUIElementTypeTextView[@name=\"Split is not allowed, payment(s) has been made in this check\"]";
    String splitNotAllowPaymentPopupText = "Split is not allowed, payment(s) has been made in this check";





    // Nov 24 start

    //String giveXCardNumberOnMenuItemPage = "//XCUIElementTypeStaticText[@name=\"GCX-603628394562001380850 \"]";
//    String giveXAmountOnMenuItemPage = "//XCUIElementTypeStaticText[@name=\"1.000,00\"]";
    String giveXAmountOnMenuItemPage = "1.000,00";

    //    String giveXRechargeAmountOnMenuItemPage = "//XCUIElementTypeStaticText[@name=\"500,00\"]";
    String giveXRechargeAmountOnMenuItemPage = "500,00";

    //    String tunaTacosMenuItem = "//XCUIElementTypeStaticText[@name=\"Tuna Tacos\"]";
    String tunaTacosMenuItem = "Tuna Tacos";

    //    String giveXRechargeSuccessPopup = "//XCUIElementTypeStaticText[@name=\"GiveX\"]";
    String giveXRechargeSuccessPopup = "GiveX";

    //    String giveXRechargeSuccessPopupInfo = "//XCUIElementTypeTextView[@name=\"Recharge Success\"]";
    String giveXRechargeSuccessPopupInfo = "Recharge Success";

    //    String parmesanModifier = "//XCUIElementTypeStaticText[@name=\"Parmesan\"]";
    String parmesanModifier = "Parmesan";

    //    String itemBasedAfterTaxAsAmountText = "//XCUIElementTypeStaticText[@name=\"IB-AfterTax-Amount\"]";
    String itemBasedAfterTaxAsAmountText = "//div[@class='discount-section']//div[contains(.,'IB-AfterTax-Amount')]";

    //    String itemBasedAfterTaxAsAmountPrice = "//XCUIElementTypeStaticText[@name=\"170,00\"]";
    String itemBasedAfterTaxAsAmountPrice = "170,00";

    //    String brushettaMenuItem = "//XCUIElementTypeStaticText[@name=\"BRUSHETTA\"]";
    String brushettaMenuItem = "BRUSHETTA";

    //    String drinksCategory = "//XCUIElementTypeStaticText[@name=\"DRINKS\"]";
    String drinksCategory = "//div[contains(@class,'center-name category-container')]/div[contains(.,'DRINKS')]";

    //    String cocktailMenuItem = "//XCUIElementTypeStaticText[@name=\"COCKTAIL\"]";
    String cocktailMenuItem = "(//button[contains(@class,'menu-btn subCategoryBtn')]/div[contains(.,'COCKTAIL')])[1]";

    //    String serviceChargeText = "//XCUIElementTypeStaticText[@name=\"Service Charge\"]";
    String serviceChargeText = "Service Charge";

    //    String serviceChargeAmountPrice = "//XCUIElementTypeStaticText[@name=\"TL 9,00\"]";
    String serviceChargeAmountPrice = "TL 9,00";

    //    String itemBasedDiscountAsPercentageAmountForBruchetta = "//XCUIElementTypeStaticText[@name=\"50,00\"]";
    String itemBasedDiscountAsPercentageAmountForBruchetta = "50,00";

    //    String itemBasedDiscountAsPercentageTitle = "//XCUIElementTypeStaticText[@name=\"IB-AfterTax-Percentage\"]";
    String itemBasedDiscountAsPercentageTitle = "IB-AfterTax-Percentage";

    //    String itemBasedBeforeTaxAsPercentageTitle = "//XCUIElementTypeStaticText[@name=\"IB-BeforeTax-Percentage\"]";
    String itemBasedBeforeTaxAsPercentageTitle = "IB-BeforeTax-Percentage";

    //    String itemBasedDiscountAsAmountPriceForBruchetta = "//XCUIElementTypeStaticText[@name=\"170,00\"]";
    String itemBasedDiscountAsAmountPriceForBruchetta = "170,00";

    //    String itemBasedAfterTaxAsSetPriceTitle = "//XCUIElementTypeStaticText[@name=\"IB-AfterTax-SetPrice\"]";
    String itemBasedAfterTaxAsSetPriceTitle = "IB-AfterTax-SetPrice";

    //    String itemBasedBeforeTaxAmountTitle = "//XCUIElementTypeStaticText[@name=\"IB-BeforeTax-Amount\"]";
    String itemBasedBeforeTaxAmountTitle = "IB-BeforeTax-Amount";

    //    String itemBasedDiscountAsSetPriceAmountForBruchetta = "//XCUIElementTypeStaticText[@name=\"400,00\"]";
    String itemBasedDiscountAsSetPriceAmountForBruchetta = "400,00";

    //    String itemBasedAfterTaxAsFreeItemTitle = "//XCUIElementTypeStaticText[@name=\"IB-AfterTax-FreeItem\"]";
    String itemBasedAfterTaxAsFreeItemTitle = "//div[@class='discount-section']//div[contains(.,'IB-AfterTax-FreeItem')]";

    //    String itemBasedBeforeTaxAsFreeItemTitle = "//XCUIElementTypeStaticText[@name=\"IB-BeforeTax-FreeItem\"]";
    String itemBasedBeforeTaxAsFreeItemTitle = "//div[@class='discount-section']//div[contains(.,'IB-BeforeTax-FreeItem')]";

    //    String itemBasedBeforeTaxAsSetPriceTitle = "//XCUIElementTypeStaticText[@name=\"IB-BeforeTax-SetPrice\"]";
    String itemBasedBeforeTaxAsSetPriceTitle = "//div[@class='discount-section']//div[contains(.,'IB-BeforeTax-SetPrice')]";

    //    String itemBasedDiscountAsFreeItemPriceForBruchetta = "//XCUIElementTypeStaticText[@name=\"0,00\"]";
    String itemBasedDiscountAsFreeItemPriceForBruchetta = "0,00";

    //    String itemBasedDiscountPriceForSetPriceForBruchetta = "//XCUIElementTypeStaticText[@name=\"400,00\"]";
    String itemBasedDiscountPriceForSetPriceForBruchetta = "400,00";

    //    String checkBasedPercentageAfterTaxTitle = "//XCUIElementTypeStaticText[@name=\"CB-PercentageAfterTax\"]";
    String checkBasedPercentageAfterTaxTitle = "//div[@class='discount-section']//div[contains(.,'CB-PercentageAfterTax')]";

    //    String checkBasedPercentageAfterTaxForBruchetta = "//XCUIElementTypeStaticText[@name=\"50,00\"]";
    String checkBasedPercentageAfterTaxForBruchetta = "50,00";

    //    String checkBasedAmountAfterTaxTitle = "//XCUIElementTypeStaticText[@name=\"CheckBasedAmountAfterTax\"]";
    String checkBasedAmountAfterTaxTitle = "//div[@class='discount-section']//div[contains(.,'CheckBasedAmountAfterTax')]";

    //    String checkBasedAmountAfterTaxForBruchetta = "//XCUIElementTypeStaticText[@name=\"5,00\"]";
    String checkBasedAmountAfterTaxForBruchetta = "5,00";

    //    String checkBasedAfterTaxAsSetPriceTitle = "//XCUIElementTypeStaticText[@name=\"CB-AfterTax-SetPrice\"]";
    String checkBasedAfterTaxAsSetPriceTitle = "//div[@class='discount-section']//div[contains(.,'CB-AfterTax-SetPrice')]";

    //    String checkBasedAfterTaxWithSetPriceAmountForBruchetta = "//XCUIElementTypeStaticText[@name=\"470,00\"]";
    String checkBasedAfterTaxWithSetPriceAmountForBruchetta = "470,00";

    //    String checkBasedAfterTaxWithFreeItemTitle = "//XCUIElementTypeStaticText[@name=\"CB-AfterTax-FreeItem\"]";
    String checkBasedAfterTaxWithFreeItemTitle = "//div[@class='discount-section']//div[contains(.,'CB-AfterTax-FreeItem')]";

    //    String checkBasedBeforeTaxWithFreeItemTitle = "//XCUIElementTypeStaticText[@name=\"CB-BeforeTax-FreeItem\"]";
    String checkBasedBeforeTaxWithFreeItemTitle = "//div[@class='discount-section']//div[contains(.,'CB-BeforeTax-FreeItem')]";

    //    String checkBasedAfterTaxWithFreeItemAmountForBruchetta = "//XCUIElementTypeStaticText[@name=\"0,00\"]";
    String checkBasedAfterTaxWithFreeItemAmountForBruchetta = "0,00";

    //    String checkBasedBeforeTaxWithPercentageTitle = "//XCUIElementTypeStaticText[@name=\"CB-PercentageBeforeTax\"]";
    String checkBasedBeforeTaxWithPercentageTitle = "//div[@class='discount-section']//div[contains(.,'CB-PercentageBeforeTax')]";

    //    String checkBasedBeforeTaxWithPercentageAmountForBruchetta = "//XCUIElementTypeStaticText[@name=\"50,00\"]";
    String checkBasedBeforeTaxWithPercentageAmountForBruchetta = "50,00";

    //    String checkBasedBeforeTaxWithAmountTitle = "//XCUIElementTypeStaticText[@name=\"CB-AmountBeforeTax\"]";
    String checkBasedBeforeTaxWithAmountTitle = "//div[@class='discount-section']//div[contains(.,'CB-AmountBeforeTax')]";

    //    String checkBasedBeforeTaxWithAmountForBruchetta = "//XCUIElementTypeStaticText[@name=\"5,00\"]";
    String checkBasedBeforeTaxWithAmountForBruchetta = "5,00";

    //    String checkBasedBeforeTaxWithSetPriceTitle = "//XCUIElementTypeStaticText[@name=\"CB-BeforeTax-SetPrice\"]";
    String checkBasedBeforeTaxWithSetPriceTitle = "//div[@class='discount-section']//div[contains(.,'CB-BeforeTax-SetPrice')]";

    //    String checkBasedBeforeTaxWithSetPriceForBruchetta = "//XCUIElementTypeStaticText[@name=\"470,00\"]";
    String checkBasedBeforeTaxWithSetPriceForBruchetta = "470,00";

    //    String checkBasedBeforeTaxWithFreeItemForBruchetta = "//XCUIElementTypeStaticText[@name=\"0,00\"]";
    String checkBasedBeforeTaxWithFreeItemForBruchetta = "0,00";

    //    String checkBasedBeforeTaxWithOpenItemForBruchetta = "//XCUIElementTypeStaticText[@name=\"9,69\"]";
    String checkBasedBeforeTaxWithOpenItemForBruchetta = "9,69";

    //    String checkBasedBeforeTaxWithOpenItemForBruchettas = "//XCUIElementTypeStaticText[@name=\"9,70\"]";
    String checkBasedBeforeTaxWithOpenItemForBruchettas = "9,70";

    //    String checkBasedBeforeTaxWithOpenItemTitle = "//XCUIElementTypeStaticText[@name=\"CB-AfterTax-OpenItem\"]";
    String checkBasedBeforeTaxWithOpenItemTitle = "//div[@class='discount-section']//div[contains(.,'CB-BeforeTax-OpenItem')]";


    String checkBasedAfterTaxWithOpenItemTitle = "//div[@class='discount-section']//div[contains(.,'CB-AfterTax-OpenItem')]";

    //    String checkBasedPercentageDiscountWithAfterTaxAmountAppliedOpenItem = "//XCUIElementTypeStaticText[@name=\"59,99\"]";
    String checkBasedPercentageDiscountWithAfterTaxAmountAppliedOpenItem = "59,99";

    //    String cokeMenuItem = "//XCUIElementTypeStaticText[@name=\"COKE\"]";
    String cokeMenuItem = "COKE";

    //    String totalText = "//XCUIElementTypeStaticText[@name=\"Total\"]";
    String totalText = "//div[@id='os_totalAmountStr']//input";

    //    String pizzaMelTotalPrice = "//XCUIElementTypeStaticText[@name=\"TL 2.057,00\"]";
    String pizzaMelTotalPrice = "//div[@id='os_totalAmountStr']//input";

    //    String pizzaMargaritaTotalPrice = "//XCUIElementTypeStaticText[@name=\"TL 3.267,00\"]";
    String pizzaMargaritaTotalPrice = "TL 3.267,00";

    String autoDiscountText = "(//XCUIElementTypeStaticText[@name=\"Discount\"])[1]";

    //    String autoDiscountPrice = "//XCUIElementTypeStaticText[@name=\"TL 400,00\"]";
    String autoDiscountPrice = "TL 400,00";

    String pizzaMelTotalPriceWithTaxExempt = "(//XCUIElementTypeStaticText[@name=\"TL 1.700,00\"])[2]";

    String pizzaMargaritaTotalPriceWithTaxExempt = "(//XCUIElementTypeStaticText[@name=\"TL 1.000,00\"])[2]";

    //    String gratuityText = "//XCUIElementTypeStaticText[@name=\"Gratuity\"]";
    String gratuityText = "Gratuity";

    //    String brushettaFixGratuityPrice = "//XCUIElementTypeStaticText[@name=\"TL 99,99\"]";
    String brushettaFixGratuityPrice = "//div[@id='os_gratuityAmountStr']//input";

    //    String brushettaVaryingGratuityPrice = "//XCUIElementTypeStaticText[@name=\"TL 50,00\"]";
    String brushettaVaryingGratuityPrice = "TL 50,00";

    //    String hamburgerMenuItem = "//XCUIElementTypeStaticText[@name=\"HAMBURGER\"]";
    String hamburgerMenuItem = "(//button[contains(@class,'menu-btn subCategoryBtn')]/div[contains(.,'HAMBURGER')])[1]";

    //    String plusIconForAddSeat = "//XCUIElementTypeButton[@name=\"ADD\"]";
    String plusIconForAddSeat = "ADD";

    //    String baconOmeletMenuItem = "//XCUIElementTypeStaticText[@name=\"Bacon Omelet Senior\"]";
    String baconOmeletMenuItem = "Bacon Omelet Senior";

    //    String baconOmeletTotalPriceWithExclusiveTax = "//XCUIElementTypeStaticText[@name=\"TL 105,00\"]";
    String baconOmeletTotalPriceWithExclusiveTax = "TL 105,00";

    //    String mantiMenuItem = "//XCUIElementTypeStaticText[@name=\"MANTI\"]";
    String mantiMenuItem = "MANTI";

    //    String mantiTotalPriceWithInclusiveTax = "//XCUIElementTypeStaticText[@name=\"TL 50,06\"]";
    String mantiTotalPriceWithInclusiveTax = "TL 50,06";

    //    String selectedCustomerNameForBarTab = "//XCUIElementTypeButton[@name=\"Test A\"]";
    String selectedCustomerNameForBarTab = "Test A";

    //    String selectedCustomerForHouseAccount = "//XCUIElementTypeButton[@name=\"Test A\"]";
    String selectedCustomerForHouseAccount = "Test A";

    //    String voidReasonForHA = "//XCUIElementTypeStaticText[@name=\"Ordered Wrongly\"]";
    String voidReasonForHA = "Ordered Wrongly";

    //    String newCustomerForHouseAccount = "//XCUIElementTypeButton[@name=\"Test A\"]";
    String newCustomerForHouseAccount = "Test A";

    //    String toGoOrderType = "//XCUIElementTypeStaticText[@name=\"To Go\"]";
    String toGoOrderType = "To Go";

    //    String phoneOrderType = "//XCUIElementTypeStaticText[@name=\"PHONE\"]";
    String phoneOrderType = "PHONE";

    //    String spPaxPreAuthTitle = "//XCUIElementTypeStaticText[@name=\"SP Pax PreAuth\"]";
    String spPaxPreAuthTitle = "SP Pax PreAuth";

    //    String exitButtonForSpPaxPreAuth = "//XCUIElementTypeStaticText[@name=\"Exit\"]";
    String exitButtonForSpPaxPreAuth = "Exit";

    //    String customerNamePopupTitle = "//XCUIElementTypeStaticText[@name=\"Enter the Customer Name\"]";
    String customerNamePopupTitle = "Enter the Customer Name";
    // Nov 24 End


    //Menu Option

    //    String repeatMenuOption = "//XCUIElementTypeStaticText[@name=\"Repeat\"]";
    String repeatMenuOption = "//label[contains(.,'Repeat')]";
    //    String quantityMenuOption = "//XCUIElementTypeStaticText[@name=\"Quantity\"]";
    String quantityMenuOption = "//label[contains(.,'Quantity')]";
    //    String calculatorNumberTwo = "//XCUIElementTypeButton[@name=\"2\"]";
    String calculatorNumberTwo = "//ion-col[@class='quantity_grid-row-col md hydrated']//span[contains(.,'2')]";
    //    String continueForCalculator = "//XCUIElementTypeStaticText[@name=\"Continue\"]";
    String continueForCalculator = "//span[contains(.,'Continue')]";
    //    String holdMenuOption = "//XCUIElementTypeStaticText[@name=\"Hold\"]";
    String holdMenuOption = "//label[contains(.,'Hold')]";
    String holdHeaderText = "//ion-col[.='Hold']";
    //    String holdAutomationButton = "//XCUIElementTypeStaticText[@name=\"Automatic\"]";
    String holdAutomationButton = "//span[.=' Automatic ']";
    //    String holdManuelButton = "//XCUIElementTypeStaticText[@name=\"Manual\"]";
    String holdManuelButton = "//span[.=' Manual ']";
    //    String fireMenuOption = "//XCUIElementTypeStaticText[@name=\"Fire\"]";
    String fireMenuOption = "//label[.='Fire']";
    //String firstMenuItem = "(//XCUIElementTypeTable[@name=\"Empty list\"])[4]";
    //String repeatedMenuItem = "(//XCUIElementTypeTable[@name=\"Empty list\"])[6]";
    //String quantityOfOrder = "//XCUIElementTypeStaticText[@name=\"2\"]";
//    String attachMenuOption = "//XCUIElementTypeStaticText[@name=\"Attach\"]";
    String attachMenuOption = "//label[.='Attach']";
    //    String attachNoteTitle = "//XCUIElementTypeStaticText[@name=\"Add Notes\"]";
    String attachNoteTitle = "Add Notes";
    //    String firstAttachNote = "//XCUIElementTypeStaticText[@name=\"Toasted\"]";
    String firstAttachNote = "Toasted";
    //    String addAttachNoteButton = "//XCUIElementTypeStaticText[@name=\"Add\"]";
    String addAttachNoteButton = "Add";
    //    String attachedNotesOnOrder = "//XCUIElementTypeStaticText[@name=\"Toasted\"]";
    String attachedNotesOnOrder = "Toasted";
    //    String ToGoMenuOption = "//XCUIElementTypeStaticText[@name=\"TOGO\"]";
    String ToGoMenuOption = "//label[.='TOGO']";

    // Merge Page

    //String firstTable = "//XCUIElementTypeStaticText[@name=\"T1\"]";

    // Modifier Page

    String firstItemsFirstModifier = "//XCUIElementTypeStaticText[@name=\"Penne\"][1]";
    String selectedModifier = "//XCUIElementTypeStaticText[@name=\"Penne\"][2]";
    String modifierOkButton = "Ok";
    String modifierCancelButton = "//div[@class='modifier-decision']//span[contains(.,' Cancel ')]";

    //Operation Pge

    //String posOption = "//XCUIElementTypeStaticText[@name=\"POS\"]";
//    String operationTitle = "//XCUIElementTypeStaticText[@name=\"Operation\"]";
    String operationTitle = "(//label[contains(.,'Operation')])[1]";
    //    String batchTipAdjustmentTab = "//XCUIElementTypeStaticText[@name=\"Batch/Tip Adjustment\"]";
    String batchTipAdjustmentTab = "Batch/Tip Adjustment";
    //    String posSettings = "//XCUIElementTypeStaticText[@name=\"POS Settings\"]";
    String posSettings = "(//label[contains(.,'POS Settings')])[1]";
    //    String operationMenuIcon  = "//XCUIElementTypeButton[@name=\"ToggleIcon\"]";
//    String tillManagementTab = "//XCUIElementTypeStaticText[@name=\"Till Management\"]";
    String tillManagementTab = "(//label[contains(.,'Till Management')])[1]";

    // Order Type

    //    String deliveryButton = "//XCUIElementTypeStaticText[@name=\"Delivery\"]";
    String deliveryButton = "Delivery";
    String nowDeliveryOption = "(//XCUIElementTypeButton[@name=\"Button\"])[1]";
    //    String orderTypeDoneButton = "//XCUIElementTypeStaticText[@name=\"Done\"]";
    String orderTypeDoneButton = "Done";
    String laterDeliveryOption = "(//XCUIElementTypeButton[@name=\"Button\"])[2]";
    String deliveryTimeDoneButton = "(//XCUIElementTypeButton[@name=\"Done\"])[1]";
    //    String printerButton = "//XCUIElementTypeStaticText[@name=\"Print\"]";
    String printerButton = "Print";
    //    String cancelOrderButton = "//XCUIElementTypeStaticText[@name=\"Cancel Order\"]";
    String cancelOrderButton = "Cancel Order";
    //    String futureButton = "//XCUIElementTypeStaticText[@name=\"Future\"]";
    String futureButton = "Future";
    //    String paymentMadeOnMessage = "//XCUIElementTypeTextView[@name=\"Payment(s) made on this check,Can you return this to Test A\"]";
    String paymentMadeOnMessage = "Payment(s) made on this check,Can you return this to Test A";
    //String doneButton = "//XCUIElementTypeStaticText[@name=\"Done\"]";

    // Phone Order

    //    String completedPhoneOrder = "//XCUIElementTypeStaticText[@name=\"Complete\"]";
    String completedPhoneOrder = "Complete";
    String lastOrderType = "(//XCUIElementTypeStaticText[@name=\"FORHERE\"])[4]";
    //    String futurePhoneOrder = "//XCUIElementTypeStaticText[@name=\"Future\"]";
    String futurePhoneOrder = "Future";
    //    String newTabPhoneOrder = "//XCUIElementTypeStaticText[@name=\"New\"]";
    String newTabPhoneOrder = "New";
    String firstActiveDriver = "//XCUIElementTypeStaticText[@name=\"Automation T\"][last()]";
    //    String departureButton = "//XCUIElementTypeStaticText[@name=\"Departure\"]";
    String departureButton = "Departure";
    //    String outTabPhoneOrder = "//XCUIElementTypeStaticText[@name=\"Out\"]";
    String outTabPhoneOrder = "Out";
    //    String arrivalButton = "//XCUIElementTypeStaticText[@name=\"Arrival\"]";
    String arrivalButton = "Arrival";
    String fastCashScreen = "//XCUIElementTypeStaticText[@name=\" Cash\"]";
    //    String noDriver = "//XCUIElementTypeTable[@name=\"Empty list\"]";
    String noDriver = "Empty list";
    //    String driverColumn = "//XCUIElementTypeStaticText[@name=\"Driver\"]";
    String driverColumn = "Driver";
    //    String ordersDriver = "//XCUIElementTypeStaticText[@name=\"Automation\"]";
    String ordersDriver = "Automation";
    //    String assignedDriverOrder = "//XCUIElementTypeStaticText[@name=\"STORE DELIVERY\"]";
    String assignedDriverOrder = "STORE DELIVERY";
    //    String passiveDriver = "//XCUIElementTypeStaticText[@name=\"Automation T\"]";
    String passiveDriver = "Automation T";
    //    String passiveDriverPopup = "//XCUIElementTypeStaticText[@name=\"Linga\"]";
    String passiveDriverPopup = "Linga";
    String assignedLastDriver = "//XCUIElementTypeStaticText[@name=\"Test\"][last()]";
    String forHereOrderType = "(//XCUIElementTypeStaticText[@name=\"FORHERE\"])[25]";
    //    String passiveDriverNoButton = "//XCUIElementTypeButton[@name=\"No\"]";
    String passiveDriverNoButton = "No";
    String lastForHereOrderType = "(//XCUIElementTypeStaticText[@name=\"For Here\"])[last()]";

    // POS Settings

    //    String posSettingHeader = "//XCUIElementTypeStaticText[@name=\"Till Settings\"]";
    String posSettingHeader = "(//p[contains(.,'Till Settings')])[1]";
    //String barTabOption = "//XCUIElementTypeStaticText[@name=\"BarTab\"]";
    String askCustomerNameToggle = "//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeScrollView/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeOther[11]/XCUIElementTypeSwitch";
    //    String saveChangesButton = "//XCUIElementTypeStaticText[@name=\"Save Changes\"]";
    String saveChangesButton = "Save Changes";
    //    String successUpdatePopup = "//XCUIElementTypeStaticText[@name=\"Done\"]";
    String successUpdatePopup = "Done";
    //String operationMenuIcon = "//XCUIElementTypeButton[@name=\"ToggleIcon\"]";
//    String posTab = "//XCUIElementTypeStaticText[@name=\"POS\"]";
    String posTab = "POS";
    String enableCashDropToggle = "//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeScrollView/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeSwitch";

    // Split Check

    //    String addNewSeatForSplit = "//XCUIElementTypeStaticText[@name=\"Add\"]";
    String addNewSeatForSplit = "Add";
    String selectItemInCheck = "(//XCUIElementTypeStaticText[@name=\"SANDWICHES \"])[1]";
    //    String splitEvenly = "//XCUIElementTypeStaticText[@name=\"Split Evenly\"]";
    String splitEvenly = "//div[.='Split Evenly']";
    String firstTotalAmount = "(//XCUIElementTypeStaticText[@name=\"TL 10,00\"])[4]";
    String secondTotalAmount = "(//XCUIElementTypeStaticText[@name=\"TL 5,00\"])[2]";
    //    String separateItemButton = "//XCUIElementTypeStaticText[@name=\"Seperate Item\"]";
    String separateItemButton = "//div[.='Separate item']";
    String firstOrderItem = "(//XCUIElementTypeStaticText[@name=\"SANDWICHES \"])[3]";
    //    String separatedFirstItemAmount = "(//XCUIElementTypeStaticText[@name=\"5,00\"])[1]";
//    String separatedSecondItemAmount = "(//XCUIElementTypeStaticText[@name=\"5,00\"])[2]";
    String splitCheckItem = "(//XCUIElementTypeTable[@name=\"Empty list\"])[9]";
    String emptySeat = "(//XCUIElementTypeTable[@name=\"Empty list\"])[11]";
    String firstSplitedItem = "(//XCUIElementTypeStaticText[@name=\"SANDWICHES \"])[4]";
    String firstItemOnFirstSeat = "(//XCUIElementTypeStaticText[@name=\"SANDWICHES \"])[2]";
    String separateItemNumber = "//XCUIElementTypeButton[@name=\"2\"]";
    //    String separateItemNumber = "2";
    //    String separateContinueButton = "//XCUIElementTypeStaticText[@name=\"Continue\"]";
    String separateContinueButton = "Continue";
    //    String selectOrderWarning = "//XCUIElementTypeStaticText[@name=\"Select the Order to Proceed\"]";
    String selectOrderWarning = "Select the Order to Proceed";
    //    String selectOrderWarningDoneButton = "//XCUIElementTypeStaticText[@name=\"Done\"]";
    String selectOrderWarningDoneButton = "Done";
    //    String firstSeatTitle = "//XCUIElementTypeStaticText[@name=\"Seat 1\"]";
    String secondSeatTitle = "(//XCUIElementTypeStaticText[@name=\"Seat 2\"])[2]";
    String payButtonOnSplitSeat = "//div[.='Pay']";
    //    String payButtonOnSplitSeat = "Pay";
    //    String groupSeatButton = "//XCUIElementTypeStaticText[@name=\"Group Seats\"]";
    String groupSeatButton = "//div[.='Group Seats']";
    //    String mergeSeatWarningPopup = "//XCUIElementTypeTextView[@name=\"Select the seats to Merge\"]";
    String mergeSeatWarningPopup = "Select the seats to Merge";
    String firstSeatTotalAmountTitle = "(//XCUIElementTypeStaticText[@name=\"Total\"])[2]";
    String firstSeatTotalAmountTitle1 = "//XCUIElementTypeStaticText[@name=\"Seat 1\"]";
    String secondSeatTotalAmountTitle2 = "(//XCUIElementTypeStaticText[@name=\"Seat 2\"])[2]";

    String secondSeatTotalAmountTitle = "(//XCUIElementTypeStaticText[@name=\"Total\"])[3]";
    String firstSeatTotalAmount = "(//XCUIElementTypeStaticText[@name=\"TL 0,00\"])[2]";
    String secondSeatTotalAmount = "(//XCUIElementTypeStaticText[@name=\"TL 0,00\"])[5]";
    //String splitButton = "Split";
    //String splitCheckOption = "(//XCUIElementTypeStaticText[@name=\"Split Check\"])";
//    String saveAndCloseButton = "//XCUIElementTypeStaticText[@name=\"Save & Close\"]";
    String saveAndCloseButton = "(//button[contains(.,' Save & Close ')])";
    String seatOneOnSplitSeatPage = "(//XCUIElementTypeStaticText[@name=\"Seat 1\"])[2]";
    String seatTwoOnSplitSeatPage = "(//XCUIElementTypeStaticText[@name=\"Seat 2\"])[2]";
    //    String groupBySeatButton = "//XCUIElementTypeStaticText[@name=\"Group Seats\"]";
    String groupBySeatButton = "Group Seats";
    //    String orderWillBeSplited = "//XCUIElementTypeStaticText[@name=\"T1\"]";
    String orderWillBeSplited = "T1";
    String splitedOrderItem = "(//XCUIElementTypeStaticText[@name=\"SANDWICHES \"])[3]";
    String splitedOrderForFirstCheck = "(//XCUIElementTypeStaticText[@name=\"SANDWICHES \"])[3]";
    String splitedOrderForSecondCheck = "(//XCUIElementTypeStaticText[@name=\"SANDWICHES \"])[4]";
    //    String addButtonForSplit = "//XCUIElementTypeStaticText[@name=\"Add\"]";
    String addButtonForSplit = "//button[@class='add-seat']";
    String firstOrderForSplit = "(//XCUIElementTypeStaticText[@name=\"HAMBURGER \"])[2]";
    String seatForSplit = "(//XCUIElementTypeStaticText[@name=\"Seat 1\"])[3]";
    //    String hamburgerPrice = "//XCUIElementTypeStaticText[@name=\"1.500,00\"]";
    String hamburgerPrice = "1.500,00";
    //    String subTotalForSplitedSeat = "//XCUIElementTypeStaticText[@name=\"TL 1.500,00\"]";
    String subTotalForSplitedSeat = "TL 1.500,00";
    String selectFirstItemToSplit = "//XCUIElementTypeStaticText[@name=\"HAMBURGER \"]";
    //    String splitBySeatButton = "//XCUIElementTypeStaticText[@name=\"Split by seat\"]";
    String splitBySeatButton = "Split by seat";
    //    String separatedHamburgerPrice = "//XCUIElementTypeStaticText[@name=\"750,00\"]";
    String separatedHamburgerPrice = "750,00";
    String subtotalForSeatOne = "//div[@id='os_subTotalStr']//input";
    //    String subtotalForSeatOne = "TL 1.000,00";
    String subtotalForSeatTwo = "(//XCUIElementTypeStaticText[@name=\"TL 1.000,00\"])[2]";
    //    String subtotalForSeatTwo = "TL 1.000,00";
    String seatOneForGroupSeat = "(//XCUIElementTypeStaticText[@name=\"Seat 1\"])[2]";
    //    String seatTwoForGroupSeat = "//XCUIElementTypeStaticText[@name=\"Seat 2\"]";
//    String subtotalForSeatOneAfterMerge = "//XCUIElementTypeStaticText[@name=\"2.000,00\"]";
    String subtotalForSeatOneAfterMerge = "2.000,00";
    //    String subtotalForSeatTwoAfterMerge = "//XCUIElementTypeStaticText[@name=\"TL 0,00\"]";
    String subtotalForSeatTwoAfterMerge = "TL 0,00";

    // Table Layout

    String firstMergedCheck = "(//XCUIElementTypeStaticText[@name=\"T1\"])[1]";
    String firstActiveTable = "(//XCUIElementTypeStaticText[@name=\"T1\"])[1]";
    String secondActiveTable = "(//XCUIElementTypeStaticText[@name=\"T1\"])[2]";
    //String splitButton = "//XCUIElementTypeStaticText[@name=\"Split\"]";
    //String splitCheckOption = "//XCUIElementTypeStaticText[@name=\"Split Check\"]";
    //String firstTable = "//XCUIElementTypeStaticText[@name=\"T1\"]";
    //String tableLayout = "//XCUIElementTypeStaticText[@name=\"Table Layout\"]";
//    String splitBySeatButtonOnTableLayout = "//XCUIElementTypeStaticText[@name=\"Split By Seat\"]";
    String splitBySeatButtonOnTableLayout = "//button[contains(.,' Split By Seat ')]";
    String firstNumberForSeatOnCalculator = "";
    //String emptyCheck = "//XCUIElementTypeStaticText[@name=\"empty set detail label\"]";
    String printerPopupInfo = "Select the Receipt Printer in Operations/Hard ware Settings";
    //String receiptPrinterDoneButton = "//XCUIElementTypeButton[@name=\"Done\"]";
    //String secondTable = "//XCUIElementTypeStaticText[@name=\"T5\"]";
    //String mergeButton = "//XCUIElementTypeStaticText[@name=\"Merge\"]";
//    String mergeDoneButton = "//XCUIElementTypeStaticText[@name=\"Done\"]";
    String mergeDoneButton = "//button[.=' Done ']";
    String mergedTablesPopup = "//XCUIElementTypeStaticText[contains(@name, 'are merged')]";
    String operationButton = "//span[contains(.,'Operation')]";
    //    String doneMergeButton = "//XCUIElementTypeStaticText[@name=\"Done\"]";
    String doneMergeButton = "Done";
    //String payCheckButton = "//XCUIElementTypeStaticText[@name=\"Pay Check\"]";
//    String tableNoTwo = "//XCUIElementTypeStaticText[@name=\"T2\"]";
    String tableNoTwo = "T2";
    //    String calculatorContinueButton = "//XCUIElementTypeStaticText[@name=\"Continue\"]";
    String calculatorContinueButton = "Continue";
    String tableHasMoreThanOneSeat = "(//XCUIElementTypeStaticText[@name=\"Walkin\"])[1]";

    //Tax Exempt

    //    String firstTaxExemptType = "//XCUIElementTypeStaticText[@name=\"Charity\"]";
    String firstTaxExemptType = "Charity";
    //    String taxExemptPaidAmountWarningText = "//XCUIElementTypeTextView[@name=\"Paid amount exceeds the sale amount\"]";
    String taxExemptPaidAmountWarningText = "Paid amount exceeds the sale amount";

    // Till Management

    //    String tillNumberFive = "//XCUIElementTypeStaticText[@name=\"5\"]";
    String tillNumberFive = "5";
    //    String tillNumberDoubleZero = "//XCUIElementTypeStaticText[@name=\"00\"]";
    String tillNumberDoubleZero = "00";
    //    String tillContinueButton = "//XCUIElementTypeStaticText[@name=\"Continue\"]";
    String tillContinueButton = "Continue";
    //    String tillBalanceTitle = "//XCUIElementTypeStaticText[@name=\"Till Balance\"]";
    String tillBalanceTitle = "Till Balance";
    String tillBalanceAmount = "TL 100,00";
    //    String closeTillButton = "//XCUIElementTypeStaticText[@name=\"Close Till\"]";
    String closeTillButton = "Close Till";
    //    String yesOption = "//XCUIElementTypeButton[@name=\"Yes\"]";
    String yesOption = "Yes";
    String expectedCashAmount = "(//XCUIElementTypeStaticText[@name=\"500,00\"])[3]";
    String endingCashAmount = "(//XCUIElementTypeStaticText[@name=\"500,00\"])[4]";
    //    String tillSubmitButton = "//XCUIElementTypeStaticText[@name=\"Submit\"]";
    String tillSubmitButton = "Submit";
    //    String setTillButton = "//XCUIElementTypeStaticText[@name=\"Set Till\"]";
    String setTillButton = "Set Till";
    //    String openTillHeader = "//XCUIElementTypeStaticText[@name=\"Open Till\"]";
    String openTillHeader = "Open Till";
    //String numberOne = "//XCUIElementTypeStaticText[@name=\"1\"]";
    //String numberDoubleZero = "//XCUIElementTypeStaticText[@name=\"00\"]";
//    String tillBalanceText = "//XCUIElementTypeStaticText[@name=\"Till Balance\"]";
    String tillBalanceText = "Till Balance";
    //    String newTillBalance = "//XCUIElementTypeStaticText[@name=\"TL 100,00\"]";
    String newTillBalance = "TL 100,00";
    String globalTillToggle = "//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeSwitch";
    //    String payInButton = "//XCUIElementTypeStaticText[@name=\"Pay In\"]";
    String payInButton = "Pay In";
    String paidByTextBox = "//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeTextField";
    //String continueButton = "//XCUIElementTypeStaticText[@name=\"Continue\"]";
//    String paidInReason = "//XCUIElementTypeStaticText[@name=\"Paid In\"]";
    String paidInReason = "Paid In";
    //    String successPainInPopup = "//XCUIElementTypeTextView[@name=\"Paid In Successfully\"]";
    String successPainInPopup = "Paid In Successfully";
    //    String successPaidOutPopup = "//XCUIElementTypeTextView[@name=\"Paid Out Successfully\"]";
    String successPaidOutPopup = "Paid Out Successfully";
    //    String payOutTab = "//XCUIElementTypeStaticText[@name=\"Pay Out\"]";
    String payOutTab = "Pay Out";
    String paidToTextBox = "//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeTextField";
    String paidOutReason = "Paid Out";
    //    String activeTillButton = "//XCUIElementTypeStaticText[@name=\"Active Till\"]";
    String activeTillButton = "Active Till";
    String tillList = "//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther[3]/XCUIElementTypeTable";
    //    String yesOptionOnPopup = "//XCUIElementTypeButton[@name=\"Yes\"]";
    String yesOptionOnPopup = "Yes";
    //    String cancelButton = "//XCUIElementTypeButton[@name=\"Cancel\"]";
    String cancelButton = "Cancel";
    //    String globalTillToggleText = "//XCUIElementTypeStaticText[@name=\"Global Till\"]";
    String globalTillToggleText = "Global Till";
    //    String cashDropTab = "//XCUIElementTypeStaticText[@name=\"Cash Drop\"]";
    String cashDropTab = "Cash Drop";
    //    String cashDropSuccessPopup = "//XCUIElementTypeTextView[@name=\"Cash Drop Successfully\"]";
    String cashDropSuccessPopup = "Cash Drop Successfully";
    //    String activeTill = "//XCUIElementTypeStaticText[@name=\"GöknurB\"]";
    String activeTill = "GöknurB";
    //    String overShortageTitle = "//XCUIElementTypeStaticText[@name=\"OVER SHORTAGE\"]";
    String overShortageTitle = "OVER SHORTAGE";
    String discrepancyNotes = "//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeTextView";

    // Transfer Page

    //    String transferToServerButton = "//XCUIElementTypeStaticText[@name=\"Transfer to Server\"]";
    String transferToServerButton = "//p[.='Transfer to Server']";
    //    String transferItemButton = "//XCUIElementTypeStaticText[@name=\"Transfer Item\"]";
    String transferItemButton = "//p[.='Transfer item']";
    String serverOne = "(//XCUIElementTypeStaticText[@name=\"auto c\"])[1]";
    String checkWillBeTransferredOnBarTab = "(//XCUIElementTypeStaticText[@name=\"BarTab\"])[1]";
    String serverTwo = "(//XCUIElementTypeStaticText[@name=\"Karthick T\"])[2]";
    //String yesButton = "//XCUIElementTypeButton[@name=\"Yes\"]";
//    String transferSuccessMessage = "//XCUIElementTypeTextView[@name=\"Transferred Successfully\"]";
    String transferSuccessMessage = "//p[.='Transferred Successfully']";
    //String doneButton = "//XCUIElementTypeStaticText[@name=\"Done\"]";
//    String barTabOrderForTransfer = "//XCUIElementTypeStaticText[@name=\"0-012 - BarTab\"]";
    String barTabOrderForTransfer = "0-012 - BarTab";
    String menuItemForTransfer = "//ion-col[@class='menu-name ion-text-left md hydrated']";
    //    String barTabWillBeTransferTo = "//XCUIElementTypeStaticText[@name=\"0-013 - BarTab\"]";
    String barTabWillBeTransferTo = "//*[@id='mat-tab-content-13-1']/div/app-transfer-detail-content/ion-grid/ion-row/ion-col[3]/ul/div[4]/div/div";
    //    String transferToTableButton = "//XCUIElementTypeStaticText[@name=\"Transfer to Table\"]";
    String transferToTableButton = "//p[.='Transfer to Table']";
    //    String tableWillBeTransferFrom = "//XCUIElementTypeStaticText[@name=\"Floor 1-T1\"]";
    String tableWillBeTransferFrom = "Floor 1-T1";
    String tableWillBeTransferTo = "(//XCUIElementTypeStaticText[@name=\"Walkin\"])[1]";

    // Customer Profile Page

    String randomPhoneNumberText = "//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeTextField[5]";

    String autoDiscountItem = "EGG SANDWICHES";
    //    String calculatorNumberOne = "//XCUIElementTypeButton[@name=\"1\"]";
    String calculatorNumberOne = "//ion-col[@class='quantity_grid-row-col md hydrated']//span[contains(.,'1')]";
    //    String itemBasedATRestrictRoleTitle = "//XCUIElementTypeStaticText[@name=\"AfterTax-RoleRestriction\"]";
    String itemBasedATRestrictRoleTitle = "//div[@class='discount-section']//div[contains(.,'AfterTax-RoleRestriction')]";
    //    String itemBasedDiscountBRestrictDay = "//XCUIElementTypeStaticText[@name=\"BeforeTaxDayRestriction\"]";
    String itemBasedDiscountBRestrictDay = "//div[@class='discount-section']//div[contains(.,'BeforeTaxDayRestriction')]";
    //    String itemBasedDiscountBTRoleRestrict = "//XCUIElementTypeStaticText[@name=\"BeforeTaxRoleRestriction\"]";
    String itemBasedDiscountBTRoleRestrict = "//div[@class='discount-section']//div[contains(.,'BeforeTaxRoleRestriction')]";
    //    String checkBasedATTitle = "//XCUIElementTypeStaticText[@name=\"CB-PercentageAfterTax\"]";
    String checkBasedATTitle = "//div[@class='discount-section']//div[contains(.,'CB-PercentageAfterTax')]";
    //    String checkBasedATAmount = "//XCUIElementTypeStaticText[@name=\"171,70\"]";
    String checkBasedATAmount = "171,70";
    //    String itemBasedFreeDiscountBTAmount = "//XCUIElementTypeStaticText[@name=\"TL 100,00\"]";
    String itemBasedFreeDiscountBTAmount = "TL 100,00";
    //    String checkBasedFreeDiscountATAmount = "//XCUIElementTypeStaticText[@name=\"0,00\"]";
    String checkBasedFreeDiscountATAmount = "0,00";
    //    String checkBasedPercentageDiscountWithATAmount = "//XCUIElementTypeStaticText[@name=\"TL 100,00\"]";
    String checkBasedPercentageDiscountWithATAmount = "TL 100,00";
    //    String checkBasedSetPriceDiscountWithBTAmount = "//XCUIElementTypeStaticText[@name=\"TL 995,00\"]";
    String checkBasedSetPriceDiscountWithBTAmount = "TL 995,00";
    //    String checkBasedAmountDiscountWithBTAmount = "//XCUIElementTypeStaticText[@name=\"TL 10,00\"]";
    String checkBasedAmountDiscountWithBTAmount = "TL 10,00";
    //    String openCheckDiscountAmountATOnPriceSide = "//XCUIElementTypeStaticText[@name=\"TL 5,00\"]";
    String openCheckDiscountAmountATOnPriceSide = "TL 5,00";
    //    String openCheckDiscountAmountATOnOrderSideForMargarita = "//XCUIElementTypeStaticText[@name=\"TL 5,00\"]";
    String openCheckDiscountAmountATOnOrderSideForMargarita = "TL 5,00";
    //    String openCheckDiscountPercentageOnPriceForMargarita = "//XCUIElementTypeStaticText[@name=\"TL 202,00\"]";
    String openCheckDiscountPercentageOnPriceForMargarita = "TL 202,00";
    //    String openCheckDiscountAsAmountOnPriceSideForMargarita = "//XCUIElementTypeStaticText[@name=\"TL 5,00\"]";
    String openCheckDiscountAsAmountOnPriceSideForMargarita = "TL 5,00";
    //    String openCheckDiscountAsAmountOnPriceSide = "//XCUIElementTypeStaticText[@name=\"TL 5,00\"]";
    String openCheckDiscountAsAmountOnPriceSide = "TL 5,00";
    //    String openCheckDiscountPercentage = "//XCUIElementTypeStaticText[@name=\"24,00\"]";
    String openCheckDiscountPercentage = "24,00";
    //    String exlusiveTaxAmountHotWings = "//XCUIElementTypeStaticText[@name=\"TL 20,11\"]";
    String exlusiveTaxAmountHotWings = "TL 20,11";
    //    String sandwicheTaxAmount = "//XCUIElementTypeStaticText[@name=\"TL 200,10\"]";
    String sandwicheTaxAmount = "TL 100,10";
    //    String itemBasedDiscountATWithPercentage = "//XCUIElementTypeStaticText[@name=\"IB-AfterTax-Percentage\"]";
    String itemBasedDiscountATWithPercentage = "//div[@class='discount-section']//div[contains(.,'IB-AfterTax-Percentage')]";
    //    String itemBasedATAsPercentageDiscountAmountForSandwiches = "//XCUIElementTypeStaticText[@name=\"TL 12,00\"]";
    String itemBasedATAsPercentageDiscountAmountForSandwiches = "TL 12,00";
    //    String CCSidePaymentDetailBarTab = "//XCUIElementTypeStaticText[@name=\"1. Side CC(#1)\"]";
    String CCSidePaymentDetailBarTab = "(//ion-col[contains(.,'Side CC(#1)')])[3]";
    //String itemBasedDiscountATWithPercentagePaymentDetailAmountWithTip = "//XCUIElementTypeStaticText[@name=\"132,00+100,00\"]";
//    String itemBasedDiscountBTWithPercentage = "//XCUIElementTypeStaticText[@name=\"IB-BeforeTax-Percentage\"]";
    String itemBasedDiscountBTWithPercentage = "//div[@class='discount-section']//div[contains(.,'IB-BeforeTax-Percentage')]";
    //    String itemBasedDiscountATWithPercentagePaymentDetailAmountWithTip = "//XCUIElementTypeStaticText[@name=\"132,00+100,00\"]";
    String itemBasedDiscountATWithPercentagePaymentDetailAmountWithTip = "132,00+100,00";
    //    String itemBasedBTAsPercentageDiscountAmountForMargarita = "//XCUIElementTypeStaticText[@name=\"TL 101,00\"]";
    String itemBasedBTAsPercentageDiscountAmountForMargarita = "TL 101,00";
    //    String itemBasedDiscountBTWithAmountPaymentDetailAmountWithTipForMargarita = "//XCUIElementTypeStaticText[@name=\"999,90+100,00\"]";
    String itemBasedDiscountBTWithAmountPaymentDetailAmountWithTipForMargarita = "999,90+100,00";
    //    String ccSidePaymentDetailAmountWithItemBasedDiscountATAsPercentageForChickenSchinitzel = "//XCUIElementTypeStaticText[@name=\"780,59+100,00\"]";
    String ccSidePaymentDetailAmountWithItemBasedDiscountATAsPercentageForChickenSchinitzel = "780,59+100,00";
    //    String ccSidePaymentDetailAmountWithItemBasedDiscountATAsSetPriceForPizzaRomano = "//XCUIElementTypeStaticText[@name=\"1.463,59+100,00\"]";
    String ccSidePaymentDetailAmountWithItemBasedDiscountATAsSetPriceForPizzaRomano = "1.463,59+100,00";
    //    String itemBasedBTAsSetPriceDiscountAmountForChickenSchnitzel = "//XCUIElementTypeStaticText[@name=\"TL -880,00\"]";
    String itemBasedBTAsSetPriceDiscountAmountForChickenSchnitzel = "TL -880,00";
    //    String ccSidePaymentDetailAmountWithItemBasedDiscountBTAsSetPriceForChickenSchinitzel = "//XCUIElementTypeStaticText[@name=\"1.200,00+100,00\"]";
    String ccSidePaymentDetailAmountWithItemBasedDiscountBTAsSetPriceForChickenSchinitzel = "1.200,00+100,00";
    //    String itemBasedDiscountBTWithFreeItemPaymentDetailForChickenSchinitzel = "//XCUIElementTypeStaticText[@name=\"144,00+100,00\"]";
    String itemBasedDiscountBTWithFreeItemPaymentDetailForChickenSchinitzel = "144,00+100,00";
    //    String itemBasedDiscountATWithFreeItemPaymentDetailForChickenSchinitzel = "//XCUIElementTypeStaticText[@name=\"240,00+100,00\"]";
    String itemBasedDiscountATWithFreeItemPaymentDetailForChickenSchinitzel = "240,00+100,00";
    //    String checkBasedATAsPercentageAmountForSandwiches = "//XCUIElementTypeStaticText[@name=\"TL 99,99\"]";
    String checkBasedATAsPercentageAmountForSandwiches = "TL 99,99";
    //    String ccSidePaymentDetailAmountWithCheckBasedDiscountATAsPercentageForSandwiches = "//XCUIElementTypeStaticText[@name=\"1.100,01+100,00\"]";
    String ccSidePaymentDetailAmountWithCheckBasedDiscountATAsPercentageForSandwiches = "1.000,01+100,00";
    //    String checkBasedBTaxAsPercentageAmountForSandwiches = "//XCUIElementTypeStaticText[@name=\"100,00\"]";
    String checkBasedBTaxAsPercentageAmountForSandwiches = "100,00";
    //    String ccSidePaymentDetailAmountWithCheckBasedDiscountBTAsPercentage = "//XCUIElementTypeStaticText[@name=\"1.080,00+100,00\"]";
    String ccSidePaymentDetailAmountWithCheckBasedDiscountBTAsPercentage = "1.080,00+100,00";
    //    String checkBasedATAmountAsAmountWithSandwiches = "//XCUIElementTypeStaticText[@name=\"5,00\"]";
    String checkBasedATAmountAsAmountWithSandwiches = "5,00";
    //    String ccSidePaymentDetailAmountWithCheckBasedDiscountATAsAmount = "//XCUIElementTypeStaticText[@name=\"1.195,00+100,00\"]";
    String ccSidePaymentDetailAmountWithCheckBasedDiscountATAsAmount = "1.195,00+100,00";
    //    String sidePaymentDetailAmountWithCheckBasedDiscountBeforeTaxAsFreeItem = "//XCUIElementTypeStaticText[@name=\"1.201,10+100,00\"]";
    String sidePaymentDetailAmountWithCheckBasedDiscountBeforeTaxAsFreeItem = "1.201,10+100,00";
    //    String ccSidePaymentDetailAmountWithOpenItemDiscountATPercentageForSandwiches = "//XCUIElementTypeStaticText[@name=\"1.201,10+100,00\"]";
    String ccSidePaymentDetailAmountWithOpenItemDiscountATPercentageForSandwiches = "1.101,10+100,00";
    //    String ccSidePaymentDetailAmountWithOpenItemDiscountATForSandwiches = "//XCUIElementTypeStaticText[@name=\"1.201,10+100,00\"]";
    String ccSidePaymentDetailAmountWithOpenItemDiscountATForSandwiches = "1.101,10+100,00";
    //    String ccSidePaymentDetailAmountWithOpenCheckDiscountATForSandwiches = "//XCUIElementTypeStaticText[@name=\"1.000,02+100,00\"]";
    String ccSidePaymentDetailAmountWithOpenCheckDiscountATForSandwiches = "900,02+100,00";
    //    String ccSidePaymentDetailAmountWithOpenCheckDiscountBTForSandwiches = "//XCUIElementTypeStaticText[@name=\"960,00+100,00\"]";
    String ccSidePaymentDetailAmountWithOpenCheckDiscountBTForSandwiches = "960,00+100,00";
    //    String sidePaymentDetailAmountWithOpenCheckDiscountAmountBeforeTaxForSandwiches = "//XCUIElementTypeStaticText[@name=\"1.106,00+100,00\"]";
    String sidePaymentDetailAmountWithOpenCheckDiscountAmountBeforeTaxForSandwiches = "1.106,00+100,00";
    //    String ccSidePaymentDetailAmountWithOpenCheckDiscountBTForMargarita = "//XCUIElementTypeStaticText[@name=\"1.105,50+100,00\"]";
    String ccSidePaymentDetailAmountWithOpenCheckDiscountBTForMargarita = "1.105,50+100,00";
    //    String ccSidePaymentDetailAmountWithOpenCheckDiscountWithNonDecimalValueATForMargarita = "//XCUIElementTypeStaticText[@name=\"1.101,00+100,00\"]";
    String ccSidePaymentDetailAmountWithOpenCheckDiscountWithNonDecimalValueATForMargarita = "1.101,00+100,00";
    //    String ccSidePaymentDetailAmountWithOpenCheckDiscountWithNonDecimalValueBTForMargarita = "//XCUIElementTypeStaticText[@name=\"1.100,00+100,00\"]";
    String ccSidePaymentDetailAmountWithOpenCheckDiscountWithNonDecimalValueBTForMargarita = "1.100,00+100,00";
    //    String ccSidePaymentAmountWithTipsAndItemBasedDiscountATAsPercentageWithTaxExemptForSandwiches = "//XCUIElementTypeStaticText[@name=\"899,91+100,00\"]";
    String ccSidePaymentAmountWithTipsAndItemBasedDiscountATAsPercentageWithTaxExemptForSandwiches = "899,91+100,00";
    //    String ccSidePaymentAmountWithTipsAndItemBasedDiscountBTAsPercentageWithTaxExemptForSandwiches = "//XCUIElementTypeStaticText[@name=\"899,90+100,00\"]";
    String ccSidePaymentAmountWithTipsAndItemBasedDiscountBTAsPercentageWithTaxExemptForSandwiches = "899,90+100,00";
    //    String ccSidePaymentAmountWithTipsAndItemBasedDiscountATAsAmountWithTaxExemptForSandwiches = "//XCUIElementTypeStaticText[@name=\"994,90+100,00\"]";
    String ccSidePaymentAmountWithTipsAndItemBasedDiscountATAsAmountWithTaxExemptForSandwiches = "994,90+100,00";
    //    String ccSidePaymentAmountWithTipsAndItemBasedDiscountATAsSetPriceWithTaxExemptForSandwiches = "//XCUIElementTypeStaticText[@name=\"29,90+100,00\"]";
    String ccSidePaymentAmountWithTipsAndItemBasedDiscountATAsSetPriceWithTaxExemptForSandwiches = "29,90+100,00";
    //    String itemBasedDiscountAsAmountPriceBruchetta = "//XCUIElementTypeStaticText[@name=\"10,00\"]";
    String itemBasedDiscountAsAmountPriceBruchetta = "10,00";
    //    String itemBasedDiscountAsSetPriceAmountBruchetta = "//XCUIElementTypeStaticText[@name=\"-500,00\"]";
    String itemBasedDiscountAsSetPriceAmountBruchetta = "-500,00";
    //    String checkBasedBeforeTaxWithOpenItemBruchetta = "//XCUIElementTypeStaticText[@name=\"TL 10,00\"]";
    String checkBasedBeforeTaxWithOpenItemBruchetta = "TL 10,00";
    //    String checkBasedBeforeTaxWithOpenItemBruchettas = "//XCUIElementTypeStaticText[@name=\"9,71\"]";
    String checkBasedBeforeTaxWithOpenItemBruchettas = "9,71";
    String firstModifier = "//div[@class='modifier-section']//div[contains(.,'Add Veggies')]";
    String selectedModifierInOrderPage = "Add Veggies";
    //    String addedModifierOfFirstItemName = "//XCUIElementTypeStaticText[@name=\" 1/2 Romano\"]";
    String addedModifierOfFirstItemName = " 1/2 Romano";
    //    String seatTwoTotal = "//XCUIElementTypeStaticText[@name=\"TL 2.400,00\"]";
    String seatTwoTotal = "TL 2.200,00";
    //    String checkBasedDiscountPercentage = "//XCUIElementTypeStaticText[@name=\"TL 100,00\"]";
    String checkBasedDiscountPercentage = "TL 100,00";
    //    String withoutGratuityTotalAmount = "//XCUIElementTypeStaticText[@name=\"TL 1.200,00\"]";
    String withoutGratuityTotalAmount = "//div[@id='os_totalAmountStr']//input";
    //    String totalAmountWithGratuity = "//XCUIElementTypeStaticText[@name=\"TL 1.299,99\"]";
    String totalAmountWithGratuity = "//div[@id='os_totalAmountStr']//input";
    //    String sideCCPaymentDetailAmountWithGratuityFixAndWithTips = "//XCUIElementTypeStaticText[@name=\"1.299,99+100,00\"]";
    String sideCCPaymentDetailAmountWithGratuityFixAndWithTips = "/html/body/div/div[2]/div/mat-dialog-container/app-payment/ion-content/ion-grid/ion-row/ion-col[1]/div[2]/ion-grid/ion-row[2]/ion-col/ion-list/ion-item-sliding/ion-item/ion-row/ion-col[3]";
    //    String sideCCPaymentDetailAmountWithGratuityVaryingAndWithTips = "//XCUIElementTypeStaticText[@name=\"1.349,99+100,00\"]";
    String sideCCPaymentDetailAmountWithGratuityVaryingAndWithTips = "/html/body/div/div[2]/div/mat-dialog-container/app-payment/ion-content/ion-grid/ion-row/ion-col[1]/div[2]/ion-grid/ion-row[2]/ion-col/ion-list/ion-item-sliding/ion-item/ion-row/ion-col[3]";
    //    String addNewCustomerTab = "//XCUIElementTypeButton[@name=\"Add New\"]";
    String addNewCustomerTab = "Add New";
    //    String numberoneinHA = "//XCUIElementTypeButton[@name=\"1\"]";
    String numberoneinHA = "1";
    //    String numberZeroInHa = "//XCUIElementTypeButton[@name=\"0\"]";
    String numberZeroInHa = "0";
    //    String numberDoubleZeroInHa = "//XCUIElementTypeButton[@name=\"00\"]";
    String numberDoubleZeroInHa = "00";
    //    String numberTwoInHa = "//XCUIElementTypeButton[@name=\"2\"]";
    String numberTwoInHa = "2";
    String rechargeTxtFieldInHa = "//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTextField[3]";
    //    String existingCustomerName = "//XCUIElementTypeButton[@name=\"goknur b\"]";
    String existingCustomerName = "goknur b";
    String addedModifierInMenuItemPage = "(//div[@class='modifier-section']//div[contains(.,'Add Veggies')])[2]";
    //    String addedModifierInMenuItemPage = " Add Veggies";
//    String fourthModifierForSecondMenuItem = "//XCUIElementTypeStaticText[@name=\"1/2 Mel\"]";
    String fourthModifierForSecondMenuItem = "1/2 Mel";
    //    String activeDriver = "//XCUIElementTypeStaticText[@name=\"john\"]";
    String activeDriver = "john";
    //    String totalPriceOfItemBasedDiscountATAsPercentageWithTaxExemptForSandwiches = "//XCUIElementTypeStaticText[@name=\"TL 899,91\"]";
    String totalPriceOfItemBasedDiscountATAsPercentageWithTaxExemptForSandwiches = "TL 899,91";
    //    String ccSidePaymentAmountWithTipsAndItemBasedDiscountATAsPercentageWithTaxExemptForSandwiches1 = "//XCUIElementTypeStaticText[@name=\"899,91\"]";
    String ccSidePaymentAmountWithTipsAndItemBasedDiscountATAsPercentageWithTaxExemptForSandwiches1 = "/html/body/div/div[2]/div/mat-dialog-container/app-payment/ion-content/ion-grid/ion-row/ion-col[1]/div[2]/ion-grid/ion-row[2]/ion-col/ion-list/ion-item-sliding/ion-item/ion-row/ion-col[3]";
    //    String totalPriceOfItemBasedDiscountBTAsPercentageWithTaxExemptForSandwiches = "//XCUIElementTypeStaticText[@name=\"TL 899,90\"]";
    String totalPriceOfItemBasedDiscountBTAsPercentageWithTaxExemptForSandwiches = "TL 899,90";
    //    String ccSidePaymentAmountWithTipsAndItemBasedDiscountBTAsPercentageWithTaxExemptForSandwiches1 = "//XCUIElementTypeStaticText[@name=\"899,90\"]";
    String ccSidePaymentAmountWithTipsAndItemBasedDiscountBTAsPercentageWithTaxExemptForSandwiches1 = "/html/body/div/div[2]/div/mat-dialog-container/app-payment/ion-content/ion-grid/ion-row/ion-col[1]/div[2]/ion-grid/ion-row[2]/ion-col/ion-list/ion-item-sliding/ion-item/ion-row/ion-col[3]";
    //    String totalPriceOfItemBasedDiscountATAsAmountWithTaxExemptForSandwiches = "//XCUIElementTypeStaticText[@name=\"TL 989,90\"]";
    String totalPriceOfItemBasedDiscountATAsAmountWithTaxExemptForSandwiches = "TL 989,90";
    //    String ccSidePaymentAmountWithTipsAndItemBasedDiscountATAsAmountWithTaxExemptForSandwiches1 = "//XCUIElementTypeStaticText[@name=\"989,90\"]";
    String ccSidePaymentAmountWithTipsAndItemBasedDiscountATAsAmountWithTaxExemptForSandwiches1 = "989,90";
    //    String totalPriceOfItemBasedDiscountATAsSetPriceWithTaxExemptForSandwiches = "//XCUIElementTypeStaticText[@name=\"TL 999,90\"]";
    String totalPriceOfItemBasedDiscountATAsSetPriceWithTaxExemptForSandwiches = "TL 999,90";
    //    String ccSidePaymentAmountWithTipsAndItemBasedDiscountATAsSetPriceWithTaxExemptForSandwiches1 = "//XCUIElementTypeStaticText[@name=\"999,90\"]";
    String ccSidePaymentAmountWithTipsAndItemBasedDiscountATAsSetPriceWithTaxExemptForSandwiches1 = "999,90";
    //    String totalPriceOfItemBasedDiscountBTAsSetPriceWithTaxExemptForSandwiches = "//XCUIElementTypeStaticText[@name=\"TL 999,90\"]";
    String totalPriceOfItemBasedDiscountBTAsSetPriceWithTaxExemptForSandwiches = "TL 999,90";
    //    String freeMenuItemAmountWithSandwich1 = "//XCUIElementTypeStaticText[@name=\"TL 1.079,90\"]";
    String freeMenuItemAmountWithSandwich1 = "TL 1.079,90";
    //    String ccSidePaymentAmountWithTipsAndItemBasedDiscountBTAsFreeItemWithTaxExemptForSandwiches = "//XCUIElementTypeStaticText[@name=\"1.079,90\"]";
    String ccSidePaymentAmountWithTipsAndItemBasedDiscountBTAsFreeItemWithTaxExemptForSandwiches = "1.079,90";
    //    String ccSidePaymentDetailAmountWithCheckBasedDiscountBTAsFreeItem = "//XCUIElementTypeStaticText[@name=\"2.211,00+100,00\"]";
    String ccSidePaymentDetailAmountWithCheckBasedDiscountBTAsFreeItem = "2.211,00+100,00";
    //    String hideKeyboardBack = "//XCUIElementTypeButton[@name=\"Hide keyboard\"]";
    String hideKeyboardBack = "Hide keyboard";

    //nov 11
//    String inclusiveTaxAmount1 = "//XCUIElementTypeStaticText[@name=\"TL 200,10\"]";
    String inclusiveTaxAmount1 = "TL 100,10";
    String exclusiveTaxAmount1 = "TL 200,10";
    //    String quantityBasedTaxAmountOnOnionRings1 = "//XCUIElementTypeStaticText[@name=\"TL 33,00\"]";
    String quantityBasedTaxAmountOnOnionRings1 = "TL 33,00";
    //    String inclusiveTaxAmountOnCheesePizza1 = "//XCUIElementTypeStaticText[@name=\"TL 0,12\"]";
    String inclusiveTaxAmountOnCheesePizza1 = "TL 0,12";
    //    String checkBasedTaxWithoutSubtotalAmountOnMargarita1 = "//XCUIElementTypeStaticText[@name=\"TL 171,70\"]";
    String checkBasedTaxWithoutSubtotalAmountOnMargarita1 = "TL 171,70";

    //    String checkBasedTaxWithSubtotalAmountOnPizzaTomBasili1 = "//XCUIElementTypeStaticText[@name=\"TL 463,59\"]";
    String checkBasedTaxWithSubtotalAmountOnPizzaTomBasili1 = "TL 463,59";
    //    String taxOnItemTaxForInclusiveTaxTextOnNeapolitanPizza1 = "//XCUIElementTypeStaticText[@name=\"TL 101,00\"]";
    String taxOnItemTaxForInclusiveTaxTextOnNeapolitanPizza1 = "TL 101,00";
    //    String baconOmeletTotalPriceWithExclusiveTax1 = "//XCUIElementTypeStaticText[@name=\"TL 0,06\"]";
    String baconOmeletTotalPriceWithExclusiveTax1 = "TL 0,06";
    //    String mantiTotalPriceWithInclusiveTax1 = "//XCUIElementTypeStaticText[@name=\"TL 0,05\"]";
    String mantiTotalPriceWithInclusiveTax1 = "TL 0,05";
    //    String ccSidePaymentAmountWithTipsAndItemBasedDiscountATAsSetPriceWithTaxExemptForSandwiches2 = "//XCUIElementTypeStaticText[@name=\"999,90+100,00\"]";
    String ccSidePaymentAmountWithTipsAndItemBasedDiscountATAsSetPriceWithTaxExemptForSandwiches2 = "/html/body/div/div[2]/div/mat-dialog-container/app-payment/ion-content/ion-grid/ion-row/ion-col[1]/div[2]/ion-grid/ion-row[2]/ion-col/ion-list/ion-item-sliding/ion-item/ion-row/ion-col[3]";
    //    String selectedCustomerNameForBarTab1 = "//XCUIElementTypeButton[@name=\"john k\"]";
    String selectedCustomerNameForBarTab1 = "john k";
    //    String ccSidePaymentDetailAmountWithTaxExemptAndWithTipsWithPreDefinedCustomer1 = "//XCUIElementTypeStaticText[@name=\"999,90+100,00\"]";
    String ccSidePaymentDetailAmountWithTaxExemptAndWithTipsWithPreDefinedCustomer1 = "999,90+100,00";
    //    String voidSandwichesAmount1 = "//XCUIElementTypeStaticText[@name=\"1.200,00\"]";
    String voidSandwichesAmount1 = "(//ion-col[contains(.,'1.00')])[4]";
    String fourthMenuItem1 = "(//div[(@class='p-col-4 orderlist-menuname')])[2]";
    //    String exlusiveTaxAmount1 = "//XCUIElementTypeStaticText[@name=\"TL 26,71\"]";
    String exlusiveTaxAmount1 = "TL 26,71";
    //    String paymentMadeOnMessage1 = "//XCUIElementTypeTextView[@name=\"Payment(s) made on this check,Can you return this to thomas\"]";
    String paymentMadeOnMessage1 = "Payment(s) made on this check,Can you return this to thomas";
    //    String selectTable1 = "//XCUIElementTypeStaticText[@name=\"T19\"]";
    String selectTable1 = "T19";
    // Added Nov 16
//    String subtotalAmountWithTaxExempt1 = "//XCUIElementTypeStaticText[@name=\"TL 1.999,80\"]";
    String subtotalAmountWithTaxExempt1 = "TL 1.999,80";
    //    String totalAmountWithTaxExempt1 = "//XCUIElementTypeStaticText[@name=\"TL 1.979,80\"]";
    String totalAmountWithTaxExempt1 = "TL 1.979,80";
    String fixGratuityAmount1 = "TL 197,98";

    // add new element
//    String splitCheckPageTitle = "//XCUIElementTypeStaticText[@name=\"Split Check\"]";
    String splitCheckPageTitle = "(//p[(.=' Split Check ')])";
    String seperatedItem = "//XCUIElementTypeStaticText[@name=\"SANDWICHES \"]";
    //    String splitCheckOnMenuItemPage = "//XCUIElementTypeStaticText[@name=\"SPLIT CHECK\"]";
    String splitCheckOnMenuItemPage = "SPLIT CHECK";
    //    String cashPaymentWithoutMethodDiyez = "//XCUIElementTypeStaticText[@name=\"1. Cash\"]";
    String cashPaymentWithoutMethodDiyez = "1. Cash";

    //add new xpath
//    String customerProfileClosedButton = "//XCUIElementTypeButton[@name=\"CustomerProfile Close\"]";
    String customerProfileClosedButton = "CustomerProfile Close";
    //    String editBtnOnPhoneOrderTab = "//XCUIElementTypeButton[@name=\"Edit\"]";
    String editBtnOnPhoneOrderTab = "Edit";
    String firstOrderForSeparate = "(//XCUIElementTypeStaticText[@name=\"SANDWICHES \"])[1]";

    //edit element
    String firstSeatTitle = "//XCUIElementTypeStaticText[@name=\"Seat 1\"]";
    String seatTwoForGroupSeat = "(//ion-col[contains(.,'Seat 2')])[2]";
    //    String voidSandwichesAmount = "//XCUIElementTypeStaticText[@name=\"2.420,02\"]";
    String voidSandwichesAmount = "2.420,02";
    String separatedFirstItemAmount = "(//XCUIElementTypeStaticText[@name=\"500,00\"])[1]";
    String separatedSecondItemAmount = "(//XCUIElementTypeStaticText[@name=\"500,00\"])[2]";
    //nov 17
//    String checkBasedBeforeTaxWithOpenItemBruchettas1 = "//XCUIElementTypeStaticText[@name=\"9,86\"]";
    String checkBasedBeforeTaxWithOpenItemBruchettas1 = "9,86";
    //    String checkBasedAmountAfterTaxForBruchetta1 = "//XCUIElementTypeStaticText[@name=\"100,00\"]";
    String checkBasedAmountAfterTaxForBruchetta1 = "100,00";
    //    String checkBasedAfterTaxWithSetPriceAmountForBruchetta1 = "//XCUIElementTypeStaticText[@name=\"TL 970,00\"]";
    String checkBasedAfterTaxWithSetPriceAmountForBruchetta1 = "TL 970,00";
    //    String itemBasedDiscountBeforeTaxAsAmount1 = "//XCUIElementTypeStaticText[@name=\"IB-AfterTax-Amount\"]";
    String itemBasedDiscountBeforeTaxAsAmount1 = "//div[@class='discount-section']//div[contains(.,'IB-AfterTax-Amount')]";
    //    String itemBasedDiscountAsSetPriceAmountBruchetta1 = "//XCUIElementTypeStaticText[@name=\"0,00\"]";
    String itemBasedDiscountAsSetPriceAmountBruchetta1 = "0,00";
    //    String sidePaymentDetailAmountWithCheckBasedDiscountBeforeTaxAsFreeItem1 = "//XCUIElementTypeStaticText[@name=\"1.200,00+100,00\"]";
    String sidePaymentDetailAmountWithCheckBasedDiscountBeforeTaxAsFreeItem1 = "1.200,00+100,00";
    //    String openCheckDiscountPercentage1 = "//XCUIElementTypeStaticText[@name=\"5,00\"]";
    String openCheckDiscountPercentage1 = "5,00";
    String openCheckDiscountPercentageOnOrderSide1 = "24,00";
    //    String checkBasedPercentageDiscountWithAfterTaxAmountAppliedOpenItem1 = "//XCUIElementTypeStaticText[@name=\"99,99\"]";
    String checkBasedPercentageDiscountWithAfterTaxAmountAppliedOpenItem1 = "99,99";
    //    String checkBasedAmountDiscountWithAfterTaxAmount1 = "//XCUIElementTypeStaticText[@name=\"TL 5,00\"]";
    String checkBasedAmountDiscountWithAfterTaxAmount1 = "TL 5,00";
    //    String afterTaxDayRestrictDiscountAmount1 = "//XCUIElementTypeStaticText[@name=\"TL 1,00\"]";
    String afterTaxDayRestrictDiscountAmount1 = "TL 1,00";
    //    String itemBasedDiscountBeforeTaxRestrictDay1 = "//XCUIElementTypeStaticText[@name=\"After Tax Day Restriction\"]";
    String itemBasedDiscountBeforeTaxRestrictDay1 = "//div[@class='discount-section']//div[contains(.,'After Tax Day Restriction')]";
    //    String checkBasedDiscountBeforeTaxDayRestrict1 = "//XCUIElementTypeStaticText[@name=\"CB-BeforeTax-RestrictDay\"]";
    String checkBasedDiscountBeforeTaxDayRestrict1 = "CB-BeforeTax-RestrictDay";
    //    String subtotalAmountWithTaxExempt2 = "//XCUIElementTypeStaticText[@name=\"TL 1.999,80\"]";
    String subtotalAmountWithTaxExempt2 = "TL 1.999,80";
    //    String totalAmountWithTaxExempt2 = "//XCUIElementTypeStaticText[@name=\"TL 1.979,80\"]";
    String totalAmountWithTaxExempt2 = "TL 1.979,80";
    String BtnNumberOne = "//button[.='1']";
    //    String editDoneButton = "done DeleteSeats";
//    String giftCardDone = "//XCUIElementTypeButton[@name=\"Done\"]";
    String giftCardDone = "Done";
    String giftCardNumberSix = "//button[.='6']";
    //    String partialPaidAmountWithGiftCard1 = "//XCUIElementTypeStaticText[@name=\"20,00\"]";
    String partialPaidAmountWithGiftCard1 = "/html/body/div/div[2]/div/mat-dialog-container/app-payment/ion-content/ion-grid/ion-row/ion-col[1]/div[2]/ion-grid/ion-row[2]/ion-col/ion-list/ion-item-sliding/ion-item/ion-row/ion-col[3]";

    //    String partialPaidAmountWithGiftCard2 = "//XCUIElementTypeStaticText[@name=\"20,00+10,00\"]";
    String partialPaidAmountWithGiftCard2 = "/html/body/div/div[2]/div/mat-dialog-container/app-payment/ion-content/ion-grid/ion-row/ion-col[1]/div[2]/ion-grid/ion-row[2]/ion-col/ion-list/ion-item-sliding/ion-item/ion-row/ion-col[3]";
    //    String orderWillBeSplited1 = "//XCUIElementTypeStaticText[@name=\"T23\"]";
    String orderWillBeSplited1 = "T23";
    String giveXCardNumberOnMenuItemPage1 = "(//XCUIElementTypeStaticText[@name=\"GCX-603628237912001380863 \"])[2]";
    //    String giveXCardNumberOnMenuItemPage2 = "(//XCUIElementTypeStaticText[@name=\"GCX-603628237912001380863\"])[2]";
    String firstTable1 = "//XCUIElementTypeStaticText[@name=\"T25\"]";
    String firstTable11 = "//XCUIElementTypeStaticText[@name=\"T20\"]";

    //    String firstTable1 = "T25";
    String cardNumberTxtField = "//input[@placeholder='XXXXXXXXXXXXXXXX']";
    //    String selectTable2 = "//XCUIElementTypeStaticText[@name=\"T23\"]";
    String selectTable2 = "T23";
    String btnMerge = "//span[contains(.,'Merge')]";
    //    String firstTable2 = "//XCUIElementTypeStaticText[@name=\"T10\"]";
    String firstTable2 = "T10";
    //    String secondTable2 = "//XCUIElementTypeStaticText[@name=\"T12\"]";
    String secondTable2 = "T12";
    //    String splitBySeatOption1 = "//XCUIElementTypeStaticText[@name=\"Split by seat\"]";
    String splitBySeatOption1 = "Split by seat";

    //    Nov 19
//    String splitBySeatButtonOnTableLayout1 = "//XCUIElementTypeStaticText[@name=\"Split by seat\"]";
    String splitBySeatButtonOnTableLayout1 = "Split by seat";
    //    String tableNoSix = "//XCUIElementTypeStaticText[@name=\"T6\"]";
    String tableNoSix = "T17";
    String splitedOrderForFirstCheck1 = "(//XCUIElementTypeStaticText[@name=\"SANDWICHES \"])[1]";
    String splitedOrderForSecondCheck1 = "(//XCUIElementTypeStaticText[@name=\"SANDWICHES \"])[2]";
    String separateItemNumber1 = "(//XCUIElementTypeStaticText[@name=\"2\"])[2]";
    String firstSeatTitle1 = "(//XCUIElementTypeStaticText[@name=\"Seat 1\"])[2]";
    //    String pizzaMargaritaTotalPrice1 = "//XCUIElementTypeStaticText[@name=\"TL 2.999,70\"]";
    String pizzaMargaritaTotalPrice1 = "";
    String seatTwoForGroupSeat1 = "Seat 2";
    //    String seatOneForGroupSeat1 = "//XCUIElementTypeStaticText[@name=\"Seat 1\"]";
    String seatOneForGroupSeat1 = "(//ion-col[contains(.,'Seat 1')])[2]";

    // nov 29
    String ccSidePaymentDetailAmountWithOpenCheckDiscountAfterTaxWithAmountForMargarita1= "1.099,00+10,00";


    // 04 July 2022
    String allTabInQSR = "//XCUIElementTypeButton[@name=\"All\"]";
    String tableLayoutTab = "//XCUIElementTypeButton[@name=\"Table Layout\"]";
    String tables = "//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeScrollView/XCUIElementTypeOther[1]/XCUIElementTypeButton";
    String selectTheNumberOfTable = "//XCUIElementTypeButton[@name=\"1\"]";
    String transferBtn = "Transfer";
    String transferToServerBtn = "Transfer to Server";
    String transferToTableBtn = "Transfer to Table";
    String transferItemBtn = "Transfer Item";
    String transferFromTble = "Transfer From";
    String transferToTble = "Transfer To";
    String firstElementOfTransferFromTable = "//XCUIElementTypeStaticText[@name=\"Transfer From\"]/../XCUIElementTypeTable//XCUIElementTypeCell[1]/XCUIElementTypeStaticText[1]";
    String secElementOfTransferFromTable = "//XCUIElementTypeStaticText[@name=\"Transfer From\"]/../XCUIElementTypeTable//XCUIElementTypeCell[2]/XCUIElementTypeStaticText[1]";
    String thirdElementOfTransferFromTable = "//XCUIElementTypeStaticText[@name=\"Transfer From\"]/../XCUIElementTypeTable//XCUIElementTypeCell[3]/XCUIElementTypeStaticText[1]";
    //XCUIElementTypeApplication[@name="Linga POS"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeTable/XCUIElementTypeCell
    String firstIteminMenuItemTable = "//XCUIElementTypeStaticText[@name=\"Menu Item\"]/../XCUIElementTypeTable//XCUIElementTypeCell[1]//XCUIElementTypeStaticText[1]";
    String secIteminMenuItemTable = "//XCUIElementTypeStaticText[@name=\"Menu Item\"]/../XCUIElementTypeTable//XCUIElementTypeCell[2]//XCUIElementTypeStaticText[1]";
    String thirdIteminMenuItemTable = "//XCUIElementTypeStaticText[@name=\"Menu Item\"]/../XCUIElementTypeTable//XCUIElementTypeCell[3]//XCUIElementTypeStaticText[1]";
    String firstCheckInChecksTable = "";
    String secondCheckInChecksTable = "//XCUIElementTypeStaticText[@name=\"Checks\"]/../XCUIElementTypeCollectionView/XCUIElementTypeCell[2]";
    String thirdCheckInChecksTable = "//XCUIElementTypeStaticText[@name=\"Checks\"]/../XCUIElementTypeCollectionView/XCUIElementTypeCell[3]";
    String firstElementOfTransferToTable = "//XCUIElementTypeStaticText[@name=\"Transfer To\"]/../XCUIElementTypeTable//XCUIElementTypeCell[1]/XCUIElementTypeStaticText[1]";
    String secElementOfTransferToTable = "//XCUIElementTypeStaticText[@name=\"Transfer To\"]/../XCUIElementTypeTable//XCUIElementTypeCell[2]/XCUIElementTypeStaticText[1]";
    String thirdElementOfTransferToTable = "//XCUIElementTypeStaticText[@name=\"Transfer To\"]/../XCUIElementTypeTable//XCUIElementTypeCell[3]/XCUIElementTypeStaticText[1]";
    String doneBtnInTransferWindow = "//XCUIElementTypeStaticText[@name=\"Done\"]";
    String successmessageOfTransfer = "Transferred check success.";
    String successmessageOfCheckTransfer = "Transferred Successfully";
    String finishbtnInOrderScreen = "finish";
    String checkStatstab = "Check Stats";
    String activeChecksDetailsIcon = "//XCUIElementTypeButton[@name=\"CheckDetialsIconDisable\"]";
    String openCheckbuttonInCheckStatsScreen = "openCheck";
    String tableNameInTheFirstCheckAndTheCheckInChecksTable = "//XCUIElementTypeStaticText[@name=\"Checks\"]/../XCUIElementTypeCollectionView/XCUIElementTypeCell[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeStaticText[1]";
    String serverNameInTheFirstCheckAndTheCheckInChecksTable="//XCUIElementTypeStaticText[@name=\"Checks\"]/../XCUIElementTypeCollectionView/XCUIElementTypeCell[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeStaticText[3]";
    String closeBtnFromChecksPopup = "//XCUIElementTypeStaticText[@name=\"X\"]";
    String offlineServerTransactionConfirmation = "//p[.='Employee is offline, Still Do you want to continue']";









}