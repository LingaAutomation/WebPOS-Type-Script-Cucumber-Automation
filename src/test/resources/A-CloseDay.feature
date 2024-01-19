@Types2

# Close the day test cases
Feature: verify the close day screen

  Background:
    Given I'm logged in
    And I close the order type window
#    Given I enter the Pin number for login
#    And I click the operation button in the login screen
    And I click the Settings button
#    And I click the "Close Day" in the operation screen"click close day"
    And I click close day tab
    And I click close all cashier button
    When I verify the cannot close the shift, store have the active checks
#    And I click "Done" in the Gift Card Popup "Click Done button"
    When I click the Close the day button in the operation screen
    Then I should see do you want to close the day popup
    And I click yes button on the do you want close the day popup
    When I click the submit button the close the day checklist
    Then I should see close day performed successfully popup
#    And I click "No" in the close the day Popup window "click No button"
    And I click Done button on the Popup
    And I click the Toggle Icon button
    And I click POS Icon from Toggle
    And I close the order type window
    And I click log off button in order screen





  @Types
  #TA-I1245 1,01,1.1,1.12,1.16,1.2,1.34,1.37,1.39,1.41,1.43,1.45,1.47,1.53,1.56,1.58,1.62,1.65,1.67,1.05,1.09 "Yet to start sales popup not display"
  Scenario Outline: verify the values in closeday screen before creating a sales,netsale value,gross sale value,Cover count,creditcard,gross receipt,gross sale,netsale,netvoid,initialTaxExempt,initial grossvoid,
  initial taxAmount,initialGrandSales,initialPaidInVal,initialPaidOut,cashExpBf,overShortageInitialVal,current date,yet to start sales,print
    Given I enter the Pin number for login
    And I click the operation button in the login screen
    And I click close day tab
    And I click close all cashier button
    When I verify the cannot close the shift, store have the active checks
#    And I click "<btnNo>" in the close the day Popup window "click No button"
    Then I should verify the value Net Sale of "<totalNetSale>" "verify the 0.00value"
    And  I should verify the value of Gross Sale "<grossSale>" "Check gross sale value"
    And  I should verify the value of New Customer "<newCustomer>" "Check New customer value"
    And  I should verify the value of All Employees "<allEmployees>" "Check All employees value"
    Then I should verify the value of "<totalNetSale>" "verify the total net sale value"
    Then  I should verify the value of Gross Sale1 "<grossSale>" "Check gross sale value"
    Then I should see the close day with "<coverCount>"
    Then It should show the Gross Receipt as "<txtGrossReceipt>" "Verify Gross Receipt"
#    Then It should show the Gross Sale "<txtGrossSales>" as "Verify GrossSales"
#    Then It should show the Net Sale "<txtNetSales>" as "Verify NetSales"
    Then I should verify the value of the "<initialGrossVoid>" "Check gross void value"
    Then I should verify the net void in the sale recap after creating sale"<netVoidValue>" "Check net void value"
    Then I should verify the initial Gross sale value as"<initialGrandSales>" "Check gross sale value"
    And I should verify the current date is displayed
    And I click print button in the Close the day screen "Click the Print Button"
    And I click power button1


    Examples:
      |pin1 |pin2 |pin3 |pin4  |totalNetSale |grossSale | newCustomer | allEmployees |totalNetSale|coverCount|txtGrossReceipt|txtGrossSales|txtNetSales|netVoidValue|initialGrossVoid|initialGrandSales|chkCloseDay    |btnNo |
      |0    |9    |8    |7     | 0.00        | 0.00     | 0           | 0            |0.00        | 0        |0.00           |0.00         |0.00       |0.00        |0.00            |0.00             |Close The Day  |No    |

  @Types
  Scenario Outline: verify the initial creditCard ,paidIn ,paidOut,cashExp,overShortage,taxExpt,taxAmt
    #(taxexempt and amount are not displayed in the tsale recap report)
    Given I enter the Pin number for login
    And I click the operation button in the login screen
    And I click close day tab
    And I scroll the close the day "<creditCard>" "scroll close the day"
    Then  I should verify the value of Credit card as Zero "0.00"
    Then I should verify the value of Paid In amount in sale recap report "<initialPaidInVal>"
    Then I should verify the value of Paid Out amount in sale recap report "<initialPaidOut>"
#    And I scroll the close the day "<cashExpBf>" "scroll close the day"
    Then I scroll down to verify Cash Expected "<cashExpBf>"
    Then I should verify the over shortage in sale recap report "<overShortageInitialVal>"
    And I click power button1

    Examples:
      |pin1 |pin2 |pin3 |pin4  |creditCard |initialPaidInVal|initialPaidOut|cashExpBf    |overShortageInitialVal|
      |0    |9    |8    |7     |Credit Card|Paid In         |Paid Out      |Cash Expected|Over / Shortage       |

  #TA-I1251 1.02,1.40
  @Types
  Scenario Outline: verify the values in close day screen after creating sales,verify cashierout popup
    Given I'm logged in
    And I closed the order type window
   And I select category as "<category>"
    And I select menu item as "<itemMiniIdly>"
    And I click Payment button in the Order Management Screen
    Then I click cash button from the payment method popup
    And I click Submit button on the Payment Window "click submit button"
#    And I click Submit button on the Payment Window
    And I closed the order type window
   And I click the Settings button
    And I click close day tab
    Then I should verify the value Net Sale of "<totalNetSale>" "verify the 50.00value"
    Then I should verify the value of Gross Sale "<GrossSale>" "Check gross sale value"
    And I should verify the value of New Customer "<newCustomer>" "Check New customer value"
    And  I should verify the value of All Employees "<allEmployees>" "Check All employees value"
#    When I click close day tab
#    And I click close all cashier button
#    When I verify the cannot close the shift, store have the active checks
    When I click the Close the day button in the operation screen
    Then I should see do you want to close the day popup
    And I click yes button on the do you want close the day popup
    And I click Cashier text in the close the day checklist screen "Click the text cashier"
    And I click Goknur Bati in the active cashiers screen "Click the text goknur bati"
    When I click Cashier Out button "<btnChrOut>" in the active cashiers screen "Click the Cashier out button"
    Then I should not see open cashier in the close day checklist
#    And I click Cancel in the Active cashier screen "Click the Cancel button"
#    Then I should verify the "<youHave0OpenCashier>" "Verify the Zero open cashier's"
    And I click Cancel button in the close the day checklist Popup "click cancel button"
    And I click power button1

    Examples:
      |allEmployees | btnCash |category     |itemMiniIdly |pin1 |pin2 |pin3 |pin4  |totalNetSale |GrossSale |newCustomer |btnDropDown |chkCloseDay     |btnYes |btnChrOut  |
      |0            | Cash    |  CIMiniFood |Mini idly    |0    |9    |8    |7     |     7.14    | 8.00     |0           | arrow down |Close The Day   |Yes    |Cashier Out|

  @Types
 #TA-I1257 1.08,1.46,1.63,1.64,166,1.57,1.59,1.06,1.68,1.18 unable to print the sale recap report, #1.68 verify employee, #1.63 cash expected paid out,#1,64 cash expected paid in,#1,06 close the day
  Scenario Outline: Verify whether the system allow to sale recap after sale,grossvoid value,overshortage,cash record,verify employee,cashexpected paidout,paidin,close the day.
    Given I'm logged in
    And I closed the order type window
   And I select category as "<category>"
    And I select menu item as "<itemPoori>"
    And I click Payment button in the Order Management Screen
    Then I click cash button from the payment method popup
    And I click Submit button on the Payment Window "click submit button"
    And I closed the order type window
    And I click log off button in order screen
    Given I enter the Pin number for login
    And I click the operation button in the login screen
    And I click close day tab
    And I click print button in the Close the day screen "Click the Print Button"
    Then I should verify the Report of"<saleRecap>""verify sale recap report"
    Then I should verify the gross void value in the sale recap after creating sale"<grossVoidValue>" "Check gross Void value"
#    And I scroll the close the day "<cashVal>" "scroll close the day"
    Then I should verify the cash record in the sale recap after creating sale "<cashVal>"
#    And I scroll the close the day "<overShortageVal>" "scroll close the day"
    Then I should verify the over shortage in the sale recap after creating sale"<overShortageVal>" "<txtOverShortageVal>"
    And I click the "<DropDown>" in the operation screen employee "Click DropDown"
    Then I click the "<employees>" in the employees list "Select Karthick"
    Then I click generate button
    And I should verify employee "<txtEmployee>"
    And I click the Toggle Icon button
    And I click the Till Management "<btnTillManagement>" in the operation screen

#    And I click cancel button in open till popup
#    And I click "<btnCancel>" in the till management screen if it appears "click cancel button"
#

    Then I click on the paid out button in Till Management Screen
#    And I click on the form text field
    Then I enter the name to pay in as "<Name>"
#    And I click "<Back>" button in the keyboard "Click Back"
    And I enter the percentage2 as "1000"
#    Then I click "<btnContinue>" in the amount popup "Click Continue Button"
    And I click the reason as "Paid Out" in the Till Management
#    Then I click "<btnOk>" in the reason screen "Ok Button Clicked"
    And I click the Toggle Icon button
    And I click close day tab
#    And I scroll the close the day "<paidOutAft>" "scroll close the day"
    Then I verify the paid out value as "<paidOutVal>" "<paidOutAft>"
    Then I should scroll to verify cash expected "<cashExpPaidIn>" "-5.25"
    And I click the Toggle Icon button
    And I click the Till Management "<btnTillManagement>" in the operation screen
#    And I click cancel button in open till popup
#    And I click cancel button in the till management screen if it appears "click cancel button"

    Then I click on the paid in button in Till Management Screen
#    And I click on the form text field1
    Then I enter the name to pay1 in as "<Name>"
#    And I click "<Back>" button in the keyboard "Click Back"
#    And I enter the Pin number as "<pin1>","<pin0>","<pin0>","<pin0>"
#    Then I click "<btnContinue>" in the amount popup "Click Continue Button"
    And I enter the percentage2 as "1000"
#    And I click the "<btnPaidIn>" in the operation screen"click Paid In"
    And I click the reason as "Paid In" in the Till Management
#    Then I click "<btnOk>" in the reason screen "Ok Button Clicked"
    And I click the Toggle Icon button
#    And I click the "<btnToggleIcon>" in the operation screen"click Toggle Icon"
    And I click close day tab
#    And I scroll the close the day "<aftPaidIn>" "scroll close the day"
    Then I verify the paid in value as "<aftPaidInVal>" "<aftPaidIn>"
#    Then I scroll down to verify paid in after creating sale "<aftPaidIn>" "<aftPaidInVal>"
    Then I should scroll to verify cash expected "<cashExpPaidOut>" "4.75"

#    And I click the "<btnCloseAllCashier>" in the close the day screen "click close all cashier button"
    And I click close all cashier button
    When I verify the cannot close the shift, store have the active checks
    When I click the Close the day button in the operation screen
    Then I should see do you want to close the day popup
    And I click yes button on the do you want close the day popup
    When I click the submit button the close the day checklist
    Then I should see close day performed successfully popup
#    And I click "No" in the close the day Popup window "click No button"
    And I click Done button on the Popup
#    When I click the Close the day button in the operation screen "Close The Day" "Click Close the day Button"
#    And I click yes button on the do you want close the day popup
#    When I click the "<btnSubmit>" in the close the day screen "click submit button"
#    And I click "<btnNo>" in the close the day Popup window "click No button"
    And I click power button1
    Given I enter the Pin number for login
    And I click the operation button in the login screen
    And I click close day tab
    Then I should verify the value of "<totalNetSale>" "verify the 0.00value"
    And I click power button1

    Examples:
      |cashVal|txtEmployee|employees |totalNetSale |btnSubmit |btnPower     |btnNo | btnCash |category    |btnYes |pin1 |pin2 |pin3 |pin4  |saleRecap |  btnDropDown |itemPoori |grossVoidValue|btnTillManagement|    Name   |     Back      |  btnPaidOut   |btnPaidIn|btnToggleIcon|cashExpPaidIn |cashExpAft|btnOk|btnContinue|pin0|overShortageVal    |txtOverShortageVal|cashExpPaidOut|aftPaidIn|aftPaidInVal|paidOutAft|paidOutVal|btnCloseAllCashier  |btnGenerate|DropDown   |
      |Cash   |Admin U   |Admin u  |0.00         |Submit    |Power button |No    | Cash    | CIFOOD     |Yes    |1    |2    |3    |4     |SALES     | arrow down   |Poori     |0.00          |Till Management  | Karthick  | Hide keyboard | Paid Out      |Paid In  | ToggleIcon  |Cash Expected |10.00     | Ok  |  Continue |0   | Over / Shortage   |-4.75             |Cash Expected |Paid In  |10.00       |Paid Out  |10.00     | Close All Cashiers |Generate   | downarrow |


  #TA-I1264 1,11

  Scenario Outline: verify whether application shows net sale value after creating the sale
    Given I'm logged in
    And I closed the order type window

    And I select category as "<category>"
    And I select menu item as "<itemCI-Biriyani>"
    And I select menu item as "<itemParatha>"
#    And I click Void button on order management screen
    And I click menu item as "<itemCI-Biriyani>" to see Menu option screen
#    And I click the menu item for void the item "Click the text menu item for void the item"
    And I click void item on Menu option
#    And I click "<btnVoid>" in the order screen "Click void button"
    And I click Payment button in the Order Management Screen
    Then I click cash button from the payment method popup
    And I click Submit button on the Payment Window "click submit button"
    And I closed the order type window
    And I click log off button in order screen
    Given I'm logged in
    And I close the order type window
    And I click the Settings button
    And I click close day tab
    Then I should verify the value Net Sale of "<totalNetSale>" "verify the 35,00 value"
    And I click power button1

    Examples:
      |btnCash  |pin1 |pin2 |pin3 |pin4  | totalNetSale | category | itemParatha |itemCI-Biriyani|btnVoid    | btnDropDown |
      | Cash    |0    |9    |8    |7     | 7.14         | CIFOOD   |Paratha      |CI-Biriyani    | Void Item | arrow down  |


  #TA-I1287 Sheet No 1.24,1.26

#  Scenario Outline:verify discount,verfiy discount tax
#    Given I'm logged in
#    And I closed the order type window
#    And I select category as "<category>"
#    And I select menu item as "<itemNoodles>"
#
#    And I click Options button
#    And I click Discount as "<btnDiscount>"
#    And I click "<btnDiscount>" in the lower option screen"Discount button clicked"
#    And I click "<optOpenCheckDiscount>" in the discount screen "Click Open Check Discount"
#    And I click on the Text Field in the open discount screen "Text Field clicked"
#    And I enter the number as "<pin0>","<pin0>","<pin0>","<pin5>"
#    And I click "<btnContinue>" in the percentage apply screen "Click Continue"
#    And I click on the Reason Text Field in the open discount screen
#    Then I enter the reason as "<reason>" in the open check discount screen
#    And I click "<Back>" button in the keyboard "Click Back"
#    And I click "<btnApply>" in the open discount screen "Click Apply Button"
#    And I click Payment button in the Order Management Screen
#    Then I click cash button from the payment method popup
#    And I click Submit button on the Payment Window "click submit button"
#    And I closed the order type window
#    And I click log off button in order screen
#    Given I'm logged in
#    And I click operation button in the clock in screen
#    And I click close day tab
#    And I scroll the close the day "<Discount>" "scroll close the day"
#    Then It should Scroll down to discount and verify Discount "<Discount>"
#    Then It should Scroll down to discount tax "<discountTax>"
#    And I click power button
#
#    Examples:
#      | category | itemNoodles | btnOption | btnDiscount | optOpenCheckDiscount | pin5 | pin0 | reason    | Back          | btnApply | btnContinue | btnCash | pin1 | pin2 | pin3 | pin4 |Discount     | btnDropDown | discountTax|
#      | CIFOOD   | Noodles     | Option    | Discount    | Open Check Discount  |  5   |   0  | OpenCheck | Hide keyboard | Apply    | Continue    | Cash    |0     |9     |8     |7     |Discount Tax | arrow down  |Discount Tax|

  #TA-I1308 Sheet No 1.31

   @Types
  Scenario Outline: Verify the Gift Card Sold after creating sale
    Given I'm logged in
    And I closed the order type window
    And I click Options button
     And I click Gift card Button
     Then I should see Gift card window
#     And I enter gift card number
     And I enter gift card number1
     And I click charge amount field and pass the amount
     And I click Done button on the Popup
     Then I should see gift card amount add up into order screen1
     And I click Payment button in the Order Management Screen
#    And I click "<btnGiftCard>" in the lower option screen"Gift Card button clicked"
#    And I click on the gift card "<textField>" "Gift Card Text Field Clicked"
#    And I enter the giftcard number as "<pin1>","<pin2>","<pin3>","<pin4>","<pin5>"
#    And I click "<btnContinue>" in the number popup "Click Continue"
#    Then I click on the recharge text field
#    And I enter the recharge amount as "<pin1>","<pin0>","<pin0>","<pin00>"
#    And I click "<btnContinue>" in the number popup "Click Continue"
#    And I click "<btnDone>" in the Gift Card Popup "Click Done button"
#    And I click on "<btnPayment>" in the order screen for paying amount "Click on payment to pay partial amount"
    Then I click cash button from the payment method popup
    And I click Submit button on the Payment Window "click submit button"
    And I closed the order type window
    And I click log off button in order screen
    Given I enter the Pin number for login
     And I click the operation button in the login screen
#    And I click operation button in the clock in screen
    And I click close day tab
#    And I scroll the close the day "<giftCardSoldAft>" "scroll close the day"
    Then I scroll down to verify gift card sold "<giftCardSoldAft>"
    And I click power button1

    Examples:
      | btnOption | btnGiftCard | textField               | pin1 | pin2 | pin3 | pin4 | pin5 | pin0 | pin00 | btnContinue | btnDone | btnPayment | btnCash |giftCardSoldAft |
      | Option    | Gift Card   |  0000  0000  0000  0000 | 1    | 2    | 3    | 4    | 5    | 0    | 00    | Continue    | Done    | Payment    | Cash    |100.00 |

  #TA-I1312 1.33,1.28
  @Types
  Scenario Outline:verify Gratuity value,giftcard payment after sale
    Given I'm logged in
    And I closed the order type window
    And I select category as "<category>"
    And I select menu item as "<itemOnionDosa>"
    And I click Options button
    And I click Gratuity button
    Then I should see Add Gratuity screen
     # Gratuity - Fixed
    And I click Gratuity Fixed button
    Then I should return back to the order management screen and I should Gratuity is added
#    And User click finish button
#    And I click "<btnGratuity>" in the option screen"Gratuity button clicked"
#    And I select the "<btnFixedGratuity>" in the Tax exempt screen"Click Fixed Gratuity option"
    And I click Payment button in the Order Management Screen
    And User click gift card payment method
#    And I select "<btnGiftCard>" payment method "Gift card payment methods selected"
    Then I click the Continue button on the Total screen
    And I click manual button on the your order screen
    And I enter the Gift card number as "<card_number>"
#    And I click "<Back>" button in the keyboard "Click Back"
    And I click Process button on card screen
##    And I click "<btnOk>" in the receipt printer popup"Click ok button in the popup"
    And I closed the order type window
    And I click log off button in order screen
    Given I enter the Pin number for login
    And I click the operation button in the login screen
    And I click close day tab
#    And I scroll the close the day "<gratuityVal>" "scroll close the day"
    Then I should verify the gratuity value "0.89"
    And I click power button1

    Examples:
      |btnOk |btnProcess  |Back           |pin1    |pin2|pin3|pin4|category |itemOnionDosa |btnOption |btnGratuity |btnFixedGratuity |gratuityVal | btnDropDown |btnGiftCard|btnContinue|card_number|
      |   OK |Process     |Hide keyboard  |1       | 2  |3   |4   |CIFOOD   |OnionDosa144  |Option    |Gratuity    |Fixed Gratuity   |Gratuity    | arrow down  |Gift Card  |Continue   |12345      |


  #TA-I1316 Sheet No 1.38,1.13Cannot verify gross value as $20 as it shows mismatch value in close day
  Scenario Outline: Verify the Gross Sale value in sale recap, in mini dashboard after creating sale partial payment,
    Given I'm logged in
    And I closed the order type window
    And I select category as "<category>"
    And I select menu item as "<itemPoori>"
#    When I click the Drop down "<btnDropDown>" button in the order screen "click drop down button"
#    And I click "<category>" in the top order screen "Select Category as CIFOOD"
#    And I click "<itemPoori>" from the menu item "Click item as Poori"
    And I click Payment button in the Order Management Screen
    Then I click cash button from the payment method popup
    And I click Submit button on the Payment Window "click submit button"
    And I closed the order type window
    When I click All
    And I click Table Layout tab
    And I click new check button on the Table layout screen
    And I select table as "T17"
    And I select the number of seats as "1"
    And I tap Continue to finish selecting the number of seats
    And I get check number
    And I select category as "<category>"
    And I select menu item as "<itemCI-Biriyani>"
#    And I click "<itemCI-Biriyani>" from the menu item "Click item as Poori"
    And I click Payment button in the Order Management Screen
    Then I click cash button from the payment method popup
    And I click Submit button on the Payment Window "click submit button"
    And I click Check Stats tab
    Then I should see check stats Screen
    And I click Closed tab on the Check stats
    And I click the Closed check on check stats
    And I click reopen check button on the check stats screen
    And I click Payment button in the Order Management Screen
    And I click payment in the payment window
    When I click Delete button on the payment window
##    And I click "<btnOk>" in the receipt printer popup"Click ok button in the popup"
    When I click Exit to return to Order Management Screen
    And I click Void button on order management screen
    And I click void Reason on the void popup
    And I click Add Button on the void reason popup
    When I click QSR tab
    And I closed the order type window
    And I click Options button
    And I click Gift card Button
    Then I should see Gift card window
#     And I enter gift card number
    And I enter gift card number1
    And I click charge amount field and pass the amount
    And I click Done button on the Popup
    Then I should see gift card amount add up into order screen1
    And I click Payment button in the Order Management Screen
    Then I click cash button from the payment method popup
    And I click Submit button on the Payment Window "click submit button"
    And I closed the order type window
    And I click log off button in order screen
    Given I enter the Pin number for login
    And I click the operation button in the login screen
    And I click close day tab
    Then I should see gross sale value as "<grossSale>" in sale recap
    And I click power button1

    Examples:
      | pin1 | pin2 | pin3 | pin4 | pin0  | pin00 |pin5 | T2 |table_no | Number |  category | itemPoori | btnPayment | btnContinue | btnCash | btnOk | btnAll |  tabClosed | btnRe-openCheck   | btnVoid | btnAdd | grossSale | btnOption | btnGiftCard | btnDone | textField              | tabTableLayout | itemCI-Biriyani |btnWrong           |btnDropDown|btnQSR|
      | 1    | 2    | 3    | 4    | 0     | 00    | 5   | T2 | T2      | 1      | CIFOOD    |   Poori   | Payment    | Continue    | Cash    | OK    | All    | Closed     | reOpenCheck       | Void    | Add    | 15.75     | Option    | Gift Card   | Done    | 0000  0000  0000  0000 | Table Layout   | CI-Biriyani     |Wrong Item Ordered |arrow down |QSR   |

  #TA-I1315 1.4 ,1.42Verify whether application shows netsale record in sale recap after creating sale
  Scenario Outline:Verify whether application shows Net sale,net void record in sale recap after creating sale
    Given I'm logged in
    And I closed the order type window
    When I click All
    And I click Table Layout tab
    And I click new check button on the Table layout screen
    And I select table as "T17"
    And I select the number of seats as "1"
    And I tap Continue to finish selecting the number of seats
    And I get check number
    And I select category as "<category>"
    And I select menu item as "<itemCI-Biriyani>"
    And I click Payment button in the Order Management Screen
    Then I click cash button from the payment method popup
    And I click Submit button on the Payment Window "click submit button"
    And I click Table Layout tab
    And I click new check button on the Table layout screen
    And I select table as "T18"
    And I select the number of seats as "1"
    And I tap Continue to finish selecting the number of seats
    And I get check number1
    And I select category as "<category>"
    And I select menu item as "<itemParatha>"
    And I click Payment button in the Order Management Screen
    Then I click cash button from the payment method popup
    And I click Submit button on the Payment Window "click submit button"
    And I click QSR tab
    And I closed the order type window
    And I click All
    And I click Check Stats tab
    Then I should see check stats Screen
    And I click Closed tab on the Check stats
    And I click the Closed check on check stats
    And I click reopen check button on the check stats screen
    And I click Payment button in the Order Management Screen
    And I click payment in the payment window
    When I click Delete in the payment screen "click delete button"
#    And I click "<btnOk>" in the receipt printer popup"Click ok button in the popup"
    When I click Exit to return to Order Management Screen
    And I click menu item as "<itemCI-Biriyani>" to see Menu option screen
#    And I click the menu item for selecting the discount
    And I click Void button on order management screen
    And I click void Reason on the void popup
    And I click Add Button on the void reason popup
    And I click Done button on the Popup
    And I click the Operation button on the Table Layout
    And I click close day tab
    Then I should verify the net sale in the sale recap"<netSaleValue>" "verify netTotal Value"
#    And I scroll the close the day "TAXES" "scroll close the day"
#    Then I should verify the net void in the sale recap after creating sales"<netVoid>"
    Then I should verify the net void in the sale recap after creating sale"<netVoidValue>" "Check net void value"
    And I click power button1

    Examples:
      |netSaleValue|txtTable2|itemCI-Biriyani|itemParatha|btnCash |btnSeatOne| txtTable1|tabTableLayout| category| btnContinue  | tabAll | tabClosed | btnRe-openCheck | btnPayment  | btnOk | btnVoid | btnAdd |  btnDone | table_no |btnWrong            | btnDropDown |netVoidValue| netVoid |
      |7.14        |T3       |CI-Biriyani    |Paratha    |Cash    |  1       |   T4     |Table Layout  | CIFOOD  |Continue      |All     | Closed    | reOpenCheck     | Payment     | OK    | Void    | Add    |   Done   | T4       |Wrong Item Ordered  | arrow down  |10.00       |Net Void |

  @Types
  #TA-I1331 1,44   (test case fails because taxes not present in the sale recap report)
  Scenario Outline:Verify whether application shows Tax Excempt record in sale recap after creating sale
    Given I'm logged in
    And I closed the order type window
    And I get check number
    And I select category as "<category>"
    And I select menu item as "<itemPuri>"
#    And I click "<itemPuri>" from the menu item "Click item as Poori"
    And I click Options button
    And I click Tax Exempt Button
#    And I select the "<optCharity>" in the Tax exempt screen"Click charity option"
    And I click Payment button in the Order Management Screen
    Then I click cash button from the payment method popup
    And I click Submit button on the Payment Window "click submit button"
    And I closed the order type window
    And I click log off button in order screen
    Given I enter the Pin number for login
    And I click the operation button in the login screen
    And I click close day tab
#    And I scroll the close the day "<initialTaxExempt>" "scroll close the day"
    Then I should verify the Tax exempt amount in sale recap report "<initialTaxExempt>"
    And I click power button1

    Examples:
      |category |pin1 |pin2 |pin3 |pin4  |btnCash |optCharity |btnTaxExempt |btnOption |itemPuri        |initialTaxExempt | btnDropDown |
      |CIFOOD   |1    |2    |3    |4     |Cash    |Charity    |Tax Exempt   |Option    | Aaluparatha145 |Tax Exempt       | arrow down  |

  @Types1
  #TA-I1345 Sheet no 1,48 test case fails because the tax1 and tax2 values shows wrongly in the sale recap report
  Scenario Outline:Verify whether application shows the Tax Amount in sale recap report after creating sale
    Given I'm logged in
    And I closed the order type window
    And I get check number
    And I select category as "<category>"
    And I select menu item as "<itemMushroomNoodles>"
#    And I click "<itemMushroomNoodles>" from the menu item "Click item as Mushroom Noodles"
    And I click Payment button in the Order Management Screen
    Then I click cash button from the payment method popup
    And I click Submit button on the Payment Window "click submit button"
    And I closed the order type window
    And I click log off button in order screen
    Given I enter the Pin number for login
    And I click the operation button in the login screen
    And I click close day tab
#    And I scroll the close the day "TAXES" "scroll close the day"
    Then I should verify the Tax amount in the sale recap report after creating sale"<tenPercentTax>" "<twentyPercentTax>"
    And I click power button1

    Examples:
      |itemMushroomNoodles  |btnCash | pin1 |pin2 |pin3 |pin4  | category   |tenPercentTax |twentyPercentTax| btnDropDown |
      |Mushroom Noodles     | Cash   | 1    |2    |3    |4     | CIFOOD     |1.4545        |2.6667          | arrow down  |

  #TA-I1325 Sheet No 1.61

#  Scenario Outline: Verify total tip after creating sale
#    Given I'm logged in
#    And I closed the order type window
#    And I get check number
#    And I select category as "<category>"
#    And I select menu item as "<itemMiniIdly>"
##    And I click "<itemMiniIdly>" from the menu item "Click item as Mini idly"
#    And I click Payment button in the Order Management Screen
#    And I click credit card payment on payment window
#    And I click "<btnCustom$>" in the Tip popup "Custom Tip Clicked"
#    And I enter the Pin number as "<pin0>","<pin2>","<pin0>","<pin0>"
#    And I click "<btnApplyTip>" in the Tip popup "Apply Tip Clicked"
#    Then I click "<btnContinue>" in the tip popup "Click Continue Button"
#    And I click manual button on the your order screen
#    And I enter the card number as "<card_number>" "enter card number"
#    And I enter card name as "<card_name>" "enter card name"
#    And I enter expire date as "<expire_date>","<CVV>" "enter expire date and cvv"
#    And I click "<btnProcess>" in the Credit Card popup "Click Process button"
##    And I click "<btnOk>" in the receipt printer popup"Click ok button in the popup"
#    And I closed the order type window
#    And I click log off button in order screen
#    Given I'm logged in
#    And I click operation button in the clock in screen
#    And I click close day tab
#    And I scroll the close the day "<txtTotal>" "scroll close the day"
#    Then It should scroll down to verify Total Tip "<txtTotal>"
#    And I click power button
#
#    Examples:
#      | category     | itemMiniIdly | btnCustom$ | btnApplyTip | btnContinue | card_number      | card_name | expire_date | CVV | btnProcess | btnOk | pin0 | pin1 | pin2 | pin3 | pin4 |txtTotal | btnDropDown |
#      | CIMiniFood   | Mini idly    | Custom $   | Apply Tip   | Continue    | 4111111111111111 | John      | 0524        | 123 | Process    | OK    | 0    |  1   | 2    | 3    | 4    |Tip      | arrow down  |

  @Types
  #TA-I1288 Sheet No 1.69,1.15 verify whether application allow to show sale recap for each employee in FOH,#1.15 number of employees
  Scenario Outline:Verify whether application show the employees in the employees drop down list who have performed sales,verify the number of employees
    Given I enter the Pin number for login
    And I click the operation button in the login screen
    And I click close day tab
    And I click the "<btnDropDown>" in the operation screen employee "Click DropDown"
    Then I click the "<employees>" in the employees list "Select Kiosk U"
#    And I should verify employee "<txtEmployee>"
#    And I should verify the employee name "<txtEmployee>" "Employee verified"
    Then I click generate button
    Then I should verify the value Net Sale of "<totalNetSale>" "verify the 0.00value"
    And I click the "<btnDropDown>" in the operation screen employee "Click DropDown"
    Then I click the "<employee1>" in the employees list "Select Karthick T"
    And I click x button employee
    Then I click the "<employee2>" in the employees list "Select Karthick T"
    And I click x button employee
    And I click the "<employee3>" in the employees list "Select Kiosk U"
    And I click x button employee
    And I click the "<employee4>" in the employees list "Select Kiosk U"
    Then I click generate button
    And I should verify employee "<employeeNumber>"
#    Then It should show the "<employeeNumber>" as "Total Number of Employee 4"
    And I click power button1

    Examples:
      | pin1 | pin2 | pin3 | pin4 | btnDropDown | employees | txtEmployee | btnGenerate | totalNetSale |employee2|employee3    |employee4    |employeeNumber     |employee1|
      | 1    | 2    | 3    | 4    | downarrow   | Admin u   | Admin u     | Generate    |          0.00|bartab 0 |Cashier1 6   |auto l   | Multiple Employee  |Appium l  |

  @Types1
  #TA-I1290 1.71,1.7
  Scenario Outline: verify whether the user re-open a forced close check by clicking on the submit button,verfiy the force void check by clicking on void button
    Given I'm logged in
    And I closed the order type window
    And I click All
    And I click Table Layout tab
    And I click new check button on the Table layout screen
    And I select table as "T18"
    And I select the number of seats as "1"
    And I tap Continue to finish selecting the number of seats
    And I get check number
    And I select category as "<category>"
    And I select menu item as "<itemChappathi>"
    And I click Finish Order button
    And I click the Operation button on the Table Layout
    And I click close day tab
    And I click the Close the day button in the operation screen
    Then I should see do you want to close the day popup
    And I click yes button on the do you want close the day popup
    And I click the Active Check in the close the day checklist "Click the Active check"
    When I click "<btnPopupCash>" in the Active check popup"click void button"
    Then I should see the Active Check's as"<txtZeroActiveCheck>" "Check Active check value"
    And I click the cancel button close the day check checklist popup "Click the cancel Button"
    And I click the Toggle Icon button
    And I click POS Icon from Toggle
    And I closed the order type window
    And I click All
    And I click Check Stats tab
    And I click Closed tab on the Check stats
#    And I click the active check on check stats
    And I click the Closed check on check stats
    And I click reopen check button on the check stats screen
    And I click Payment button in the Order Management Screen
    And I click Submit button on the Payment Window "click submit button"
    And I click Check Stats tab
    Then I should see the Active tab with "<txtNoActiveChecks>" "Verify the active tab"
    And I click power button

    Examples:
      |chkCloseDay  |txtNoActiveChecks  |btnPayment|btnRe-openCheck|table_no |tabClosed |btnPopupCash |btnYes  | txtTable |itemChappathi  |tabTableLayout| category | btnContinue   | pin1 | btnDropDown |txtZeroActiveCheck       |
      |Close The Day|No active checks   |Payment   |reOpenCheck    | T4      | Closed   | Cash        |Yes     | T4       | Chappathi     |Table Layout  | CIFOOD   | Continue      | 1    | arrow down  |You have 0 Active check's|


  #TA-I1332 Sheet No 1.22,1.19,1.29 Cannot verify credit card value as $15 as it shows incorrect credit card value
#  Scenario Outline: Close - Verify the credit card value,cash record,giftcard value after creating sale partial payment
#    Given I'm logged in
#    And I closed the order type window
#    And I get check number
#    And I select category as "<category>"
#    And I select menu item as "<itemChappathi>"
#    And I click Payment button in the Order Management Screen
#    And I enter partial payment amount "<pin0>","<pin1>","<pin0>","<pin0>"
#    Then I click cash button from the payment method popup
#    And I enter partial payment amount "<pin0>","<pin1>","<pin0>","<pin0>"
#    And User click gift card payment method
#    And I click the Continue button on the Total screen
#    And User click manuel button
#    When User enter gift card number
#    Then User click process
##    Then I click on "<btnGiftCard>" to pay the Gift Card amount "Click on GiftCard for payment"
##    Then I click "<btnContinue>" in the tip popup "Click Continue Button"
##    And I click "<btnManual>" in the Gift Card Popup "Click Manual button"
##    And I enter the Gift Card Number as "<giftCardNumber>" "enter gift card number"
##    And I click "<Back>" button in the keyboard "Click Back"
##    And I click "<btnProcess>" in the Credit Card popup "Click Process button"
##    Then I click "<btnOk>" in the order screen "Click OK button"
#    And I click credit card payment on payment window
#    Then I click "<btnContinue>" in the tip popup "Click Continue Button"
#    And I click manual button on the your order screen
#    And I enter the card number as "<card_number>" "enter card number"
#    And I enter card name as "<card_name>" "enter card name"
#    And I enter expire date as "<expire_date>","<CVV>" "enter expire date and cvv"
#    And I click "<btnProcess>" in the Credit Card popup "Click Process button"
##    And I click "<btnOk>" in the receipt printer popup"Click ok button in the popup"
#    And I closed the order type window
#    And I click log off button in order screen
#    Given I'm logged in
#    And I click operation button in the clock in screen
#    And I click close day tab
#    And I scroll the close the day "<cashRecordPP>" "scroll close the day"
#    Then I should scroll down to verify Cash "<cashRecordPP>"
#    Then I should scroll down to verify gift card value after creating partial sale "<giftCardPP>" "<giftCardPPVal>"
#    Then I should scroll down to verify credit card value after sale of partial payment "<creditCardPP>" "<creditCardPPVal>"
#    And I click power button
#
#    Examples:
#      |      Back    |giftCardNumber |btnGiftCard   | pin1 | pin2 | pin3 | pin4 | pin0 | category | itemChappathi | btnCash | btnContinue | btnOk |  btnManual | card_number      | card_name | expire_date | CVV | btnProcess |creditCardPP |creditCardPPVal | btnDropDown |cashRecordPP|giftCardPP  |giftCardPPVal|
#      |Hide keyboard |12345          |Gift Card     | 1    | 2    | 3    | 4    | 0    | CIFOOD   | Paratha       | Cash    | Continue    | OK    | Manual     | 4111111111111111 | John      | 0524        | 123 | Process    |Credit Card  | 6.00           | arrow down  |Cash        |Gift Card   |1.00         |


  #TA-I1342 Sheet No 1.35,1.54 cannot do this payment as credit pays mismatch value it won't perform gift card payment and cannot verify value as $45 for Gross Receipt
#  Scenario Outline: Close - Verify the Gross Receipt,Grand salevalue after creating sale partial payment
#    Given I'm logged in
#    And I closed the order type window
#    When I click the Drop down "<btnDropDown>" button in the order screen "click drop down button"
#    And I click "<category>" in the top order screen "Select Category as CIFOOD"
#    And I click "<itemChappathi>" from the menu item "Click item as Chappathi"
#    And I click "<itemChappathi>" from the menu item "Click item as Poori"
#    And I click "<itemPoori>" from the menu item "Click item as Poori"
#    And I click Payment button in the Order Management Screen
#    And I enter the Pin number as "<pin0>","<pin2>","<pin0>","<pin0>"
#    Then I click cash button from the payment method popup
#    And I enter partial payment amount "<pin0>","<pin1>","<pin0>","<pin0>"
#    And I click credit card payment on payment window
#    Then I click "<btnContinue>" in the tip popup "Click Continue Button"
#    And I click manual button on the your order screen
#    And I enter the card number as "<card_number>" "enter card number"
#    And I enter card name as "<card_name>" "enter card name"
#    And I enter expire date as "<expire_date>","<CVV>" "enter expire date and cvv"
#    And I click "<btnProcess>" in the Credit Card popup "Click Process button"
##    And I click "<btnOk>" in the receipt printer popup"Click ok button in the popup"
#    Then I click on "<btnGiftCard>" to pay the Gift Card amount "Click on GiftCard for payment"
#    Then I click "<btnContinue>" in the tip popup "Click Continue Button"
#    And I click "<btnManual>" in the Gift Card Popup "Click Manual button"
#    And I enter the Gift Card Number as "<giftCardNumber>" "enter card number"
#    And I click "<Back>" button in the keyboard "Click Back"
#    And I click "<btnProcess>" in the Credit Card popup "Click Process button"
#    Then I click "<btnOk>" in the order screen "Click OK button"
#    And I closed the order type window
#    And I click log off button in order screen
#    Given I'm logged in
#    And I click operation button in the clock in screen
#    And I click close day tab
#    Then I should scroll down to verify Gross Receipt value "<grossReceiptAft>"
#    Then I should verify Grand Sale value "<grandSaleAft>" "<grandSaleAftVal>"
#    And I click power button
#
#    Examples:
#      |grandSaleAftVal |grandSaleAft    | pin1 | pin2 | pin3 | pin4 | pin0 | category | itemChappathi | itemPoori | btnCash | btnContinue | btnOk |  btnManual | card_number      | card_name | expire_date | CVV | btnProcess |  btnGiftCard | giftCardNumber | Back           |grossReceiptAft| btnDropDown |
#      |18.75           |Grand Sales     | 1    | 2    | 3    | 4    | 0    | CIFOOD   | Chappathi     |   Poori   | Cash    | Continue    | OK    |  Manual    | 4111111111111111 | John      | 0524        | 123 | Process    | Gift Card    | 12345          | Hide keyboard  |Gross Receipt  | arrow down  |


  #TA-I1314 Sheet No 1.36,155 Cannot verify gross Receipt value as $10 it fails as we cannot perform partial payment
#  Scenario Outline: Close - Verify the gross receipt,grand sale after creating sale
#    Given I'm logged in
#    And I closed the order type window
#    When I click the Drop down "<btnDropDown>" button in the order screen "click drop down button"
#    And I click "<category>" in the top order screen "Select Category as CIFOOD"
#    And I click "<itemChappathi>" from the menu item "Click item as Chappathi"
#    And I click Payment button in the Order Management Screen
#    And I enter partial payment amount "<pin0>","<pin1>","<pin0>","<pin0>"
#    Then I click cash button from the payment method popup
#    And I click credit card payment on payment window
#    Then I click "<btnContinue>" in the tip popup "Click Continue Button"
#    And I click manual button on the your order screen
#    And I enter the card number as "<card_number>" "enter card number"
#    And I enter card name as "<card_name>" "enter card name"
#    And I enter expire date as "<expire_date>","<CVV>" "enter expire date and cvv"
#    And I click "<btnProcess>" in the Credit Card popup "Click Process button"
##    And I click "<btnOk>" in the receipt printer popup"Click ok button in the popup"
#    And I closed the order type window
#    And I click log off button in order screen
#    Given I'm logged in
#    And I click operation button in the clock in screen
#    And I click close day tab
#    Then It should show the Gross Receipt after sale as "<grossReceipt>"
#    Then I should verify Grand Sale value of Partial pay "<grandSalePP>" "<grandSalePPVal>"
#    And I click power button
#
#    Examples:
#      | pin1 | pin2 | pin3 | pin4 | pin0 | category | itemChappathi | btnCash | btnContinue | btnOk | card_number      | card_name | expire_date | CVV | btnProcess | grossReceipt | btnDropDown |grandSalePP |grandSalePPVal|
#      | 1    | 2    | 3    | 4    | 0    |  CIFOOD  | Chappathi     | Cash    | Continue    | OK    | 4111111111111111 | John      | 0524        | 123 | Process    | 7.00         | arrow down  |Grand Sales | 7.00         |

