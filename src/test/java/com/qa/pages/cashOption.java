package com.qa.pages;

import com.qa.utils.TestUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormatSymbols;
import java.util.concurrent.TimeUnit;

import static com.qa.utils.TestUtils.driver;


public class cashOption extends TillManagementScreen{



    public String cashAmount = " ";
    public String balanceDueCardAmount = " ";


    public String getBalanceDueAmount(){
        WebElement balanceDueAmount =  driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeTextField[1]"));
        balanceDueCardAmount = balanceDueAmount.getText();
        TestUtils.BalanceCardAmount = balanceDueCardAmount;
        utils.log().info("Balance Due Amount in Payment Screen - "+balanceDueCardAmount);
        return balanceDueCardAmount;
    }
    public String getBalanceDueAndCashOptionAmount(){

        getBalanceDueAmount();
        WebElement cashoptionAmount =  driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeTextField[2]"));
        cashAmount = cashoptionAmount.getText();
        TestUtils.cashOptionPaymentScreen=cashAmount;
        utils.log().info("Cash Price Amount in Payment Screen - "+cashAmount);
        return cashAmount;
    }

    public void verifyCashOptionApplied(){
        WebElement cashOption =  driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell/XCUIElementTypeStaticText[3]"));
        String cashOptionTxt = cashOption.getText();
        WebElement noDue =  driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeTextField[1]"));
        String noDueTxt = noDue.getText();
        if(cashOptionTxt.equalsIgnoreCase(TestUtils.cashOptionPaymentScreen)){
            utils.log().info("Cash Price is Selected - "+cashOptionTxt+" No Due - "+noDueTxt);
        }else{
            utils.log().info("Cash Price is NOT Selected");
        }
    }

    public void verifyCardOptionApplied(){
        WebElement cashOption =  driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell/XCUIElementTypeStaticText[3]"));
        String cashOptionTxt = cashOption.getText();
        WebElement noDue =  driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeTextField[1]"));
        String noDueTxt = noDue.getText();
        if(cashOptionTxt.equalsIgnoreCase(TestUtils.BalanceCardAmount)){
            utils.log().info("Cash Price is Selected - "+cashOptionTxt+" No Due - "+noDueTxt);
        }else{
            utils.log().info("Cash Price is NOT Selected");
        }
    }
    public void verifyPaidAmountForCash(){
        WebElement paidAmount =  driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeStaticText[5]"));
        String paidAmountTxt = paidAmount.getText();
        if(paidAmountTxt.equalsIgnoreCase(TestUtils.cashOptionPaymentScreen)){
            utils.log().info("Paid Amount is same with Cash option Amount - "+paidAmountTxt);
        }else{
            utils.log().info("Paid Amount is same with Card Amount - "+paidAmountTxt);
        }

    }

    public void verifyPaidAmountForCard(){
        WebElement paidAmount =  driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeStaticText[4]"));
        String paidAmountTxt = paidAmount.getText();
        if(paidAmountTxt.equalsIgnoreCase(TestUtils.cashOptionPaymentScreen)){
            utils.log().info("Paid Amount is same with Cash option Amount - "+paidAmountTxt);
        }else{
            utils.log().info("Paid Amount is same with Card Amount - "+paidAmountTxt);
        }

    }

    public void verifyCashDiscount(){
        WebElement cashDiscount =  driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeStaticText[3]"));
        String cashDiscountTxt = cashDiscount.getText();

        if(cashDiscountTxt.equalsIgnoreCase(TestUtils.CashDiscountCalculation)) {

            utils.log().info("Cash Discount is - " + cashDiscountTxt);
        }else{
            utils.log().info("Cash Discount is NOT Applied ");
        }
    }

    public void getServiceCharge(){
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        WebElement subTotalOfMenu =  driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeStaticText[1]"));
        String subTotalOfMenuTxt = subTotalOfMenu.getText();
        WebElement tax =  driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeStaticText[2]"));
        String taxTxt = tax.getText();
        WebElement serviceCharge =  driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeStaticText[3]"));
        String serviceChargeTxt = serviceCharge.getText();
        WebElement Total =  driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeStaticText[4]"));
        String totalTxt = Total.getText();
        String serviceTax = subTotalOfMenuTxt.replaceAll("[$A-Z,.]","");

        double serviceTax1 = Double.parseDouble(serviceTax);

        double percentage = (serviceTax1*8)/100;

        String percentage1 = String.valueOf(percentage);
        String percentage2 = "$ "+percentage1;

        utils.log().info("Subtotal Of Menu - "+subTotalOfMenuTxt);
        utils.log().info("Tax Of Menu - "+taxTxt);
        utils.log().info("Expected Service Charge Of Menu - "+serviceChargeTxt);
        BigDecimal dd=new BigDecimal(percentage1).setScale(2, RoundingMode.HALF_UP);
        double a=dd.doubleValue();
        String numm = String.valueOf(a);

        if(serviceChargeTxt.equalsIgnoreCase(numm)){
            utils.log().info("Actual Service Charge Of Menu Without Tax -  "+numm);
        }else{
            utils.log().info("Actual Service Charge Of Menu is not Equal (Without Tax)  "+numm);
        }
        utils.log().info("Total of Menu - "+totalTxt);
        // int subtotal=subTotalOfMenuTxt.replace(".","");
    }

    public void getServiceChargeWithTax(){
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        WebElement subTotalOfMenu =  driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeStaticText[1]"));
        String subTotalOfMenuTxt = subTotalOfMenu.getText();
        WebElement tax =  driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeStaticText[2]"));
        String taxTxt = tax.getText();
        WebElement serviceCharge =  driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeStaticText[3]"));
        String serviceChargeTxt = serviceCharge.getText();
        WebElement Total =  driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"Linga POS\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeStaticText[4]"));
        String totalTxt = Total.getText();
        String serviceTax = subTotalOfMenuTxt.replaceAll("[$A-Z,.]","");

        double serviceTax1 = Double.parseDouble(serviceTax);

        double percentage = (serviceTax1*10)/100;

        String percentage1 = String.valueOf(percentage);

        String percentage2 = "$ "+percentage1;

        utils.log().info("Subtotal Of Menu - "+subTotalOfMenuTxt);

        double taxPercentage = (percentage*10)/100;

        double taxCalculation = taxPercentage+percentage;
        utils.log().info(" Divide 10 Percentage from service charge "+taxPercentage);
        String taxPercentageTxt = String.valueOf(taxCalculation);
        utils.log().info("Tax Percentage of Menu - $ "+taxPercentageTxt);
        //  utils.log().info("Tax Of Menu - "+taxTxt);
        utils.log().info("Expected Service Charge Of Menu - "+serviceChargeTxt);

        if(serviceChargeTxt.equalsIgnoreCase(percentage2)){
            utils.log().info("Actual Service Charge Of Menu (With Tax)-  "+percentage2);
        }else{
            utils.log().info("Actual Service Charge Of Menu is not Equal (With Tax)  "+percentage2);
        }
        utils.log().info("Total of Menu - "+totalTxt);


        // int subtotal=subTotalOfMenuTxt.replace(".","");
    }

    public void verifyTheBalanceDueAmountSameWithTipScreenAmountAfterSelectedTip(){
        String balanceAmount = TestUtils.BalanceCardAmount;
        utils.log().info("Balance Amount - "+balanceAmount);

        WebElement tipAmount =  driver.findElement(By.xpath("//XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeStaticText[6]"));
           String[] tipAmountTxt = tipAmount.getText().split("\\+");
           String exactTipAmount = tipAmountTxt[0];
           Assert.assertEquals(balanceAmount,exactTipAmount.replaceAll("[$ ]",""));
           utils.log().info("Tip Amount is Same With the Balance DUe - "+balanceAmount);

        WebElement tipTotalAmount =  driver.findElement(By.xpath("//XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeStaticText[2]"));
        TestUtils.tipTotal = tipTotalAmount.getText().replaceAll("[$ ]","");
    }

    public void verifyBalanceDueAmountSameWithAmount(){
        String balanceAmount = TestUtils.BalanceCardAmount;
        utils.log().info("Balance Amount - "+balanceAmount);
        WebElement totalAmount =  driver.findElement(By.xpath("//XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeStaticText[2]"));
        String totalAmountTxt = totalAmount.getText();
        utils.log().info(totalAmountTxt);
        if(balanceAmount.equals(totalAmountTxt)){
            utils.log().info("Balance Due Amount Same With Tip Screen Amount - "+ totalAmountTxt);
            TestUtils.tipTotal = totalAmountTxt;
        }else{
            utils.log().info("Balance Due Amount is NOT Same With Tip Screen Amount - "+ totalAmountTxt);
            int i = 1/0;
        }
    }

    public void verifyServiceChargeInCardScreen(){
        WebElement serviceCharge =  driver.findElement(By.xpath("//XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeOther[10]/XCUIElementTypeStaticText[2]"));
        String serviceChargeTxt = serviceCharge.getText();


        WebElement total =  driver.findElement(By.xpath("//XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeOther[12]/XCUIElementTypeStaticText[2]"));
        String totalTxt = total.getText();
        utils.log().info("Total - "+totalTxt);

        String charge = serviceChargeTxt.replaceAll("[A-Z,.$ ]","");
        String totalCharge = totalTxt.replaceAll("[$A-Z., ]","");
//        int totalChargeAmount = Integer.parseInt(totalCharge);

       double chargeDouble = Double.parseDouble(charge);
//
        double totalDouble = Double.parseDouble(totalCharge);


        double amount = (totalDouble*8)/100;
        String amountTxt = String.valueOf(amount).replaceAll("[., ]","");
        utils.log().info("Actual Service Charge - "+charge);
        utils.log().info("Expected Service Charge - "+amountTxt);
       // BigDecimal dd=new BigDecimal(amount).setScale(2, RoundingMode.HALF_UP);
      //  double a=dd.doubleValue();
        //  String percentageOfDiscount = String.valueOf(a);

        Assert.assertEquals(amountTxt,charge);
//        if(a==chargeDouble){
            utils.log().info("Service Charge is same -  "+amountTxt);
//        }else{
//            utils.log().info("Service charge is NOT same - $ "+a);
//        }

    }

    @FindBy(name = "Cannot apply tip for offline payment")
    private WebElement cannotApplyPayment;
    public void verifyCannotApplyTipPopup(){
        String cannotApplyPaymentTxt = cannotApplyPayment.getText();
        if(find(cannotApplyPayment,2)){
            utils.log().info(cannotApplyPaymentTxt+" - is Displayed");
        }else{
            utils.log().info(cannotApplyPaymentTxt+" - is NOT Displayed");
        }
    }
}
