package com.qa.utils;



import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.InputStream;
import java.text.DateFormat;
import java.text.MessageFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;


public class TestUtils {
    public static final long WAIT = 5;
    public static String globalCheckNumber=" ";
    public static String menu =" ";
    public static List<String> menuNames;
    public static String price=" ";
    public static String menuCount=" ";
    public static String loyaltyBalance=" ";
    public static final String XPath = "XPath";
    public static String tipTotal=" ";
    public static final String Accessibility = "Accessibility";
    public static final String Name = "Name";
    public static String globalCheckNumber1=" ";
    public static String fastCash= " ";
    public static String customerNotes=" ";
    public static String gratutiy= " ";
    public static final long driverWAIT = 5;
    public static String modifiers=" ";
    public static String tableNumberof = " ";
    public static String tableNumberof1 = " ";
    public static String amountTxt=" ";
    public static String cashTxt=" ";
    public static String balance= " ";
    public static String amountGivenTxt=" ";
    public static String cashOptionPaymentScreen= " ";
    public static String CashDiscountCalculation=" ";
    public static String cashOptionOrderScreen= " ";
    public static String cashOptionOrderScreen1= " ";
    public static String cashDiscountTxt1=" ";
    public static String BalanceCardAmount=" ";
    public static String lastNameCustomer=" ";
    public static String amountPayment= " ";
    public static String totalTxt1= " ";
    public static String firstNameCustomer=" ";
    public static String[] customerName;
    public static String MobileNumber = " ";
    public static String creditCardNumberCustomerProfile = " ";
    public static String NewCardNumber=" ";
    public static String expireNumber= " ";
    public static String emailCustomerDetailsScreen= " ";
    public static String percent = " ";
    public static String tipAmount = " ";
    public static String tipAmount1 = " ";
    public static String bussiness1 = " ";
    public static String tips = " ";
    public static String prefixModi= " ";
    public static String getValue= " ";
    public static String seatNumberOrderScreen = " ";
    public static String ActiveTill= " ";
    public static String GrossValue= " ";
    public static String subtotalTxt = " ";
    public static String taxTxt = " ";
    public static String serviceCharge= " ";
    public static String MergeTax = " ";
    public static String MergeTax1 = " ";
    public static String taxTxtSeat1= " ";
    public static String taxTxtSeat2= " ";
    public static String taxTxtGroup= " ";
    public static String totalTxt = " ";
    public static String paidAmount = " ";
    public static String subtotalTxt1 = " ";
    public static String taxTxt1 = " ";

    public static String paidAmount1 = " ";
    public static String discountTxt = " ";
    public static String discountTxt1 = " ";
    public static String cashDiscountTxt = " ";
    public static String refundAmountTxt = " ";
    public static String openItemValue = " ";
    public static String MenuItemPrice1 = " ";
    public static String MenuItemQuantity1 = " ";
    public static String MenuItemQuantity2= " ";
    public static String MenuItemQuantity3= " ";
    public static String subtotalAfterDiscount4 = "";
    public static String subtotalAfterDiscount8 = "";
    public static String subtotalAfterDiscount10 = "";
    public static String subtotalAfterDiscount12 = "";
   public static String menuNameSplitCheck = " ";
    public static String cashDropPoint = "";
    public static int seatCount;
    public static int seatCount1;
    public static String giveXvalue=" ";
    public static String seatNumber= " ";
    public static String[] SplitSeatMenus = {" "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "};
    public static String[] SplitSeatMenusPrize = {" "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "};
    public static String[] SplitSeatMenus2 = {" "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "};
    public static String[] SplitSeatMenusPrize2 = {" "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "};
    public static String[] ModifierName={" "," ", " "," "," "," "," "," "," "," "," "," "," "," "," "," "};
    public static String[] ModifierPrize={" "," ", " "," "," "," "," "," "," "," "," "," "," "," "," "," "};
    public static String[] ModifierName2={" "," ", " "," "," "," "," "," "," "," "," "," "," "," "," "," "};
    public static String[] ModifierPrize2={" "," ", " "," "," "," "," "," "," "," "," "," "," "," "," "," "};
    public static String[] MenuQuantity={" "," "," "," "," ", " "," "," "," "," "," "," "," "," "," "," "};
    public static String[] MenuQuantity2={" "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "};
    public static String[] ModifierQty={" "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "};
    public static String[] ModifierQty2={" "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," " };
    public static String[] orderMenuPrize2={" "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," " };
    public static String[] orderMenuName2={" "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," " };
    public static String[] orderMenuPrize={" "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," " };
    public static String[] orderMenuName={" "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," " };
    public static String[] modifier2={" "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," " };
    public static String[] modifier={" "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," " };
    public static String[] modifierPrize={" "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," " };
    public static String[] modifierPrize2={" "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," " };
    public static String[] discountName = {" "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "};
    public static String[] discountCount = {" "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "};
    public static String[] discountPrize = {" "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "};
    public static String[] discountName1 = {" "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "};
    public static String[] discountCount1 = {" "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "};
    public static String[] discountPrize1 = {" "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "};
    public static String FName=" ";
    public static String SName=" ";
    public static String MobileNum=" ";
    public static String Address1=" ";
    public static String emailId=" ";
    public static String subtotalTxtFirstTable=" ";
    public static String taxTxtFirstTable=" ";
    public static String paidAmountFirstTable=" ";
    public static String totalTxtFirstTable=" ";
    public static String GiveXCardNumber= " ";
    public static String Transfertable=" ";
    public static String TransferCheckNumber= " ";
    public static String taxTxtOfBeforeRound1 = " ";
    public static String taxTxtOfBeforeRound2 = " ";
    public static String cashRewardValue=" ";
    public static String cashier_Name1 = " ";
    public static String cashier_Name2 = " ";
    public static String cashier_Name3 = " ";
    public static String cashier_Name4 = " ";
    public static String cashier_Name5 = " ";
    public static String amountForSale=" ";
    public static String ServiceCharge= " ";
    public static String ServiceCharge1= " ";
    public static String payAmount=" ";
    public static String payAmount1=" ";
    public static String cardNumber= " ";
    public static String cardName= " ";
    public static String FirstTable = "", FirstMenuItem = "", SecondTable = "", FTable1 = "", FTable2 = "", ServerNamee = "", ServerName1 = "", ServerName2 = "",FirstTableName="";

    public static int itemToSelect1;
    public static WebDriver driver;
    public static String dateTimeFormatHour() {
        DateFormat dateFormat = new SimpleDateFormat("H");
        Date date = new Date();
        return dateFormat.format(date);
    }

    // For picker wheel selection movement
    public enum Order {
        NEXT,
        PREVIOUS;
    }


    public HashMap<String, String> parseStringXML(InputStream file) throws Exception{
        HashMap<String, String> stringMap = new HashMap<String, String>();
        //Get Document Builder
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();

        //Build Document
        Document document = builder.parse(file);

        //Normalize the XML Structure; It's just too important !!
        document.getDocumentElement().normalize();

        //Here comes the root node
        Element root = document.getDocumentElement();

        //Get all elements
        NodeList nList = document.getElementsByTagName("string");

        for (int temp = 0; temp < nList.getLength(); temp++)
        {
            Node node = nList.item(temp);
            if (node.getNodeType() == Node.ELEMENT_NODE)
            {
                Element eElement = (Element) node;
                // Store each element key value in map
                stringMap.put(eElement.getAttribute("name"), eElement.getTextContent());
            }
        }
        return stringMap;
    }

    public String dateTime() {
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd-HH-mm-ss");
        Date date = new Date();
        return dateFormat.format(date);
    }

    public String dateTimeNumber() {
        DateFormat dateFormat = new SimpleDateFormat("yyyyMMddHHmmss");
        Date date = new Date();
        return dateFormat.format(date);
    }


    public Logger log() {
        return (Logger) LogManager.getLogger(Thread.currentThread().getStackTrace()[2].getClassName());
    }


    public String dateTimeFormat() {
        DateFormat dateFormat = new SimpleDateFormat("dd-MMM-yyyy-HH");
        Date date = new Date();
        return dateFormat.format(date);
    }


    public String stringFormatInjector(String originalString,String injector) {
        String mergedString = "";
        if (injector == null && injector.isEmpty()) {
            mergedString = originalString;
        } else {
            mergedString = MessageFormat.format(originalString, injector);
        }
        return mergedString;
    }


}

