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
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;


public class TestUtils {
    public static final long WAIT = 10;
    public static final long longWAIT = 180;
    public static String globalCheckNumber=" ";
    public static String loyaltyBalance=" ";
    public static String floorNumber=" ";
    public static String floorNumber1=" ";
    public static final String XPath = "XPath";
    public static final String Accessibility = "Accessibility";
    public static final String Name = "Name";
    public static String globalCheckNumber1=" ";
    public static final long driverWAIT = 10;
    public static String menu = " ";
    public static String modifiers=" ";
    public static String price=" ";
    public static String serverName= " ";
    public static String serverName1= " ";
    public static String tableNumberof= " ";
    public static String tableNumberof1= " ";
    public static String menu1= " ";
    public static String menu2= " ";
    public static String menu3= " ";
    public static String menu4= " ";
    public static String FirstMenuItem=" ";
    public static String Transfertable = " ";
    public static String TransferCheckNumber=" ";
    public static String subTotal= " ";

    public static int countOfMenuSeat1;
    public static ArrayList<String> menuNamesGroup;
    public static ArrayList<String> menuPrizeGroup;
    public static ArrayList<String> menuQtyGroup;


    public static ArrayList<String> menuName;
    public static ArrayList<String> menuNameSeat1;
    public static ArrayList<String> menuNameSeat2;
    public static ArrayList<String> menuPrizeSeat1;
    public static ArrayList<String> menuPrizeSeat2;
    public static ArrayList<String> menuQtySeat2;
    public static ArrayList<String> menuQtySeat1;
    public static ArrayList<String> modifierNameSeat1;
    public static ArrayList<String> modifierPrizeSeat1;
    public static ArrayList<String>  modifierQtySeat1;

    public static ArrayList<String> modifierNameGroup;
    public static ArrayList<String> modifierPrizeGroup;
    public static ArrayList<String>  modifierQtyGroup;
    public static ArrayList<String> modifierNameSeat2;
    public static ArrayList<String> modifierPrizeSeat2;
    public static ArrayList<String>  modifierQtySeat2;
    public static int countOfMenuSeat2;

    public static String tax= " ";
    public static String totalAmount= " ";
    public static String paidAmount= " ";
    public static String cashOptionAmount= " ";
    public static String cashOptionAmount1= " ";
    public static String seatNumber=" ";
    public static String subTotal1= " ";
    public static String tax1= " ";
    public static String totalAmount1= " ";
    public static String paidAmount1= " ";
    public static String seatNumber1=" ";
    public static String subtotalTxt1 = " ";
    public static String taxTxt1 = " ";
    public static String totalTxt1 = " ";
    public static String totalTxt = " ";
    public static String taxTxtOfBeforeRound1= " ";
    public static String taxTxtSeat1=" ";
    public static String subtotalSeat1=" ";

    public static String paidAmountSeat1= " ";
    public static String totalSeat1= " ";

    public static String taxTxtSeat2=" ";
    public static String subtotalSeat2=" ";

    public static String paidAmountSeat2= " ";
    public static String totalSeat2= " ";

    public static String taxTxtOfBeforeRound2= " ";

    public static String subtotalTxt=" ";
    public static String taxTxtGroup= " ";
    public static String subTotalTxtGroup= " ";
    public static String totalTxtGroup= " ";
    public static String paidAmountTxtGroup= " ";
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
    public static String[] modifieR2={" "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," " };
    public static String[] modifier={" "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," " };
    public static String[] modifierPrize={" "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," " };

    public static String[] modifier2={" "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," " };
    public static String subTotalFromSplitSeat2=" ";
    public static String taxFromSplitSeat2=" ";
    public static String totalAmountFromSplitSeat2=" ";
    public static String paidAmountFromSplitSeat2=" ";

    public static String subTotalFromSplitSeat1=" ";
    public static String taxFromSplitSeat1=" ";
    public static String totalAmountFromSplitSeat1=" ";
    public static String paidAmountFromSplitSeat1=" ";

    public static List<String> MenuCounts ;
    public static List<String> ModifierCounts;
    public static List<String> MenuCounts1 ;
    public static List<String> ModifierCounts1;
    public static List<String> menuName11;
    public static List<String> modifierName11;
    public static List<String> menuPrize11;

    public static List<String> menuQty11;
    public static List<String> modifierPrize11;

    public static List<String> menuName12;
    public static List<String> modifierName12;
    public static List<String> menuPrize12;

    public static List<String> menuQty12;
    public static List<String> modifierPrize12;
    public static List<String> menuName1;
    public static List<String> modifierName1;
    public static List<String> menuPrize1;
    public static List<String> modifierPrize1;

    public static List<String> menuName2;
    public static List<String> modifierName2;
    public static List<String> menuPrize2;
    public static List<String> modifierPrize2;
    public static List<String> MenusCountOnSplitSeat2Ipad2 ;
    public static List<String> ModifierCountsOnSplitSeat2Ipad2;
    public static List<String> MenuValuesOnSplitSeat2Ipad2 ;
    public static List<String> ModifierValuesOnSplitSeat2Ipad2;

    public static List<String> MenusCountOnSplitSeat1Ipad1 ;
    public static List<String> ModifierCountOnSplitSeat1Ipad1;
    public static List<String> MenuCountValueOnSplitSeat1Ipad1 ;
    public static List<String> MenuQuantityOnSplitSeat1Ipad1 ;
    public static List<String> ModifierCountValueOnSplitSeat1Ipad1;
    public static List<String> ModifierQuantityOnSplitSeat1Ipad1;

    public static List<String> MenusCountOnSplitSeat1Ipad2 ;
    public static List<String> ModifierCountOnSplitSeat1Ipad2;
    public static List<String> MenuCountValueOnSplitSeat1Ipad2 ;
    public static List<String> MenuQuantityOnSplitSeat1Ipad2 ;
    public static List<String> ModifierCountValueOnSplitSeat1Ipad2;
    public static List<String> ModifierQuantityOnSplitSeat1Ipad2;

    public static List<String> MenuCountOnSplitSeat2Ipad2 ;
    public static List<String> ModifierCountOnSplitSeat2Ipad2;
    public static List<String> MenuCountValueOnSplitSeat2Ipad2 ;
    public static List<String> MenuQuantityOnSplitSeat2Ipad2 ;
    public static List<String> ModifierCountValueOnSplitSeat2Ipad2;
    public static List<String> ModifierQuantityOnSplitSeat2Ipad2;

    public static List<String> MenusCountOnSplitSeat2Ipad1 ;
    public static List<String> ModifierCountOnSplitSeat2Ipad1;
    public static List<String> MenuCountValueOnSplitSeat2Ipad1 ;
    public static List<String> MenuQuantityOnSplitSeat2Ipad1 ;
    public static List<String> ModifierCountValueOnSplitSeat2Ipad1;
    public static List<String> ModifierQuantityOnSplitSeat2Ipad1;

    public static List<String> MenusCountOnOrderScreen2Ipad2 ;
    public static List<String> ModifierCountsOnOrderScreen2Ipad2;
    public static List<String> MenuValuesOnOrderScreen2Ipad2 ;
    public static List<String> ModifierValuesOnOrderScreen2Ipad2;

    public static List<String> MenuCountOrderScreenSeat1Ipad1;
    public static List<String> MenuCountValueOrderScreenSeat1iPad1;
    public static List<String> ModifierCountOrderScreenSeat1iPad1;
    public static List<String> ModifierCountValueOrderScreenSeat1iPad1;
    public static List<String> ModifierQuantityOrderScreenSeat1iPad1;

    public static List<String> MenuCountOrderScreenSeat2Ipad1;
    public static List<String> MenuCountValueOrderScreenSeat2iPad1;
    public static List<String> ModifierCountOrderScreenSeat2iPad1;
    public static List<String> ModifierCountValueOrderScreenSeat2iPad1;
    public static List<String> ModifierQuantityOrderScreenSeat2iPad1;

    public static int sizeOfSeat1;
    public static int sizeOfSeat2;
    public static String RepeatMenu= " ";
    public static String RepeatMenu1= " ";

    public static String subtotalOnSplitSeat1Ipad1=" ";
    public static String taxOnSplitSeat1Ipad1=" ";
    public static String paidAmountOnSplitSeat1Ipad1=" ";
    public static String totalOnSplitSeat1Ipad1=" ";

    public static String subtotalOnSplitSeat1Ipad2=" ";
    public static String taxOnSplitSeat1Ipad2=" ";
    public static String paidAmountOnSplitSeat1Ipad2=" ";
    public static String totalOnSplitSeat1Ipad2=" ";

    public static String subtotalOnSplitSeat2Ipad1=" ";
    public static String taxOnSplitSeat2Ipad1=" ";
    public static String paidAmountOnSplitSeat2Ipad1=" ";
    public static String totalOnSplitSeat2Ipad1=" ";

    public static String subtotalOnOrderScreenSeat1Ipad1=" ";
    public static String taxOnOrderScreenSeat1Ipad1=" ";
    public static String totalOnOrderScreenSeat1Ipad1=" ";
    public static String paidAmountOnOrderScreenSeat1Ipad1=" ";

    public static WebDriver driver2;
    public static WebDriver driver1;
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

