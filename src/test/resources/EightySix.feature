
@eighty
Feature: Verify the eighty six list


  #TA-I1397 sheet number : 16,18,19,30,31
  Scenario Outline: verify the 86 list will be displayed on the top of the login screen
    Given  I click 86List button in the login screen
    Then  I should verify the "<txtEightySix>" in the eighty six list popup "verify the 86 list popup"
    And I search the menu item as "<menuItem>" on the 86 list screen
#    And I click on the search field "<menuItem>" for searching the menu item "search menu item "
    Then I should verify the "<menuItem>" in the search list "verify the menu item"
    And I click search close on the 86 list screen
#    And I click close button in the eighty six list popup
#    And I click "<btnClose>" in the eighty six list popup "click close button"
#    Given  I click 86List button in the login screen
    And I search the menu item as "<itemIdly>" on the 86 list screen
#
    Then I should verify Eighty six list disable menu item are not displayed in the login screen eighty six list
#    And I click "<btnClose>" in the eighty six list popup "click close button"
#    Given  I click 86List button in the login screen
    And I search the menu item as "<itemPoori>" on the 86 list screen
#
    Then I should verify Eighty six list disable menu item are not displayed in the login screen eighty six list
#    And I click "<btnClose>" in the eighty six list popup "click close button"
#    Given I click 86List button in the login screen
#    And I click the menu item qty for editing in the eighty six list popup "click the menu item qty"
    Then I should verify the quantity button in login screen is not enabled "verfiy the qty button is eneble or not"
    And I search the menu item as "<menuItem>" on the 86 list screen
    Then I should verify the "<menuItem>" in the search list "verify the menu item"
#    And I should verify the close button "<btnClose>" in the eighty six list popup in the login screen "verify the close button"
    And I click close button in the eighty six list popup

    Examples:
      |btnEightySix|itemIdly| itemPoori|  Back        |btnEmptyList|btnClose |txtEightySix |menuItem        |
      |86 LIST         | Idly   |   Poori  |Hide keyboard |Empty list  |    X    | 86 List     |Chicken Biriyani|


  #TA-I1405 Sheet number :17,20,21,22,24,25,26,27
  Scenario Outline:Verify application allows to Enter the Qty directly for input field update.
    Given I enter the Pin number for login
    And I click the operation button in the login screen
#    Then  I should verify the "<btnEightySix>" in the operation screen "verify the 86 list in operation screen"
    And I click the 86 list button in the operation screen
    And I click on the search field "<menuItem>" for searching the menu item "search menu item "
    Then I should verify the "<menuItem>" in the search list "verify the menu item"
    Then I should verify that quantity is displayed "Verify Quantity"
#
    And I click the quantity txt field in the eighty six list popup "click qty txt field"
    And I enter the percentage2 as "12"
    And I click close button in the eighty six list popup1
#    And I enter the quantity value as "<pin0>","<pin0>","<pin1>","<pin2>"
#    Then I click "<btnContinue>" in the Quantity popup "Click Continue Button"
    And I click on the search field "<menuItem>" for searching the menu item "search menu item "
    Then I verify the quantity value as "<quantity>" "Verify Quantity"
    And I click the Toggle Icon button
   And I click POS Icon from Toggle
    And I closed the order type window
    And I click the Settings button
    And I click the 86 list button in the operation screen
    And I click on the search field "<menuItem>" for searching the menu item "search menu item "
    Then I verify the quantity value as "<quantity>" "Verify Quantity"
    And I click power button1
    Given I click 86List button in the login screen
    Then  I should verify the "86 List" in the eighty six list popup "verify the 86 list popup"
    And I search the menu item as "<menuItem>" on the 86 list screen
     Then I verify the quantity value as "<quantity>" "Verify Quantity"
    And I click close button in the eighty six list popup

    Examples:
      |pin1 | pin2 | pin3 | pin4 | pin0 | btnEightySix | menuItem         | Back          | quantity | btnContinue |btnToggle    |btnPos |btnCancel |btnSettings  |btnPower     |btnClose |btnEightySixList|
      | 1   | 2    | 3    | 4    | 0    | 86 LIST     | Chicken Biriyani | Hide keyboard |12        | Continue    |ToggleIcon   |POS    |  Cancel  | Settings 1  |Power button | X       |86              |


  #TA-I1409 Sheet number : 28,29
  Scenario Outline:Verify multiple menu's applied qty in '86 List' Operation screen & Changes in 86 List of Login screen,Verify edited menu's qty in '86 List' Operation screen & Changes in 86 List of Login screen..
    Given I enter clock in pin
    And I click the operation button in the login screen

    And I click the 86 list button in the operation screen
    And I click on the search field "<menuItem>" for searching the menu item "search menu item "
    Then I should verify the "<menuItem>" in the search list "verify the menu item"
    Then I should verify that quantity is displayed "Verify Quantity"
#
    And I click the quantity txt field in the eighty six list popup "click qty txt field"
    And I enter the percentage2 as "12"
    And I click close button in the eighty six list popup1
#    And I enter the quantity value as "<pin0>","<pin0>","<pin1>","<pin2>"
#    Then I click "<btnContinue>" in the Quantity popup "Click Continue Button"
    And I click on the search field "<menuItem>" for searching the menu item "search menu item "
    Then I verify the quantity value as "<quantity>" "Verify Quantity"
    And I click close button in the eighty six list popup1
    And I click on the search field "Chicken Noodles" for searching the menu item "search menu item "
    Then I should verify the "Chicken Noodles" in the search list "verify the menu item"
    Then I should verify that quantity is displayed "Verify Quantity"
#
    And I click the quantity txt field in the eighty six list popup "click qty txt field"
    And I enter the percentage2 as "12"
    And I click close button in the eighty six list popup1
#    And I enter the quantity value as "<pin0>","<pin0>","<pin1>","<pin2>"
#    Then I click "<btnContinue>" in the Quantity popup "Click Continue Button"
    And I click on the search field "Chicken Noodles" for searching the menu item "search menu item "
    Then I verify the quantity value as "<quantity>" "Verify Quantity"

    And I click power button1
    Given I click 86List button in the login screen
    And I search the menu item as "<menuItem>" on the 86 list screen
    Then I verify the quantity value as "<quantity>" "Verify Quantity"
    And I click search close on the 86 list screen
    When I search the menu item as "Chicken Noodles" on the 86 list screen
    Then I should verify the "Chicken Noodles" in the search list "verify the menu item"
    Then I verify the quantity value as "<quantity>" "Verify Quantity"
    And I click close button in the eighty six list popup

    Examples:
      |pin1 | pin2 | pin3 | pin4 | pin0 | btn86List | menuItem | quantity | Back        | btnContinue | btnPower     | btnEightySix|btnClose |
      | 1   | 2    | 3    | 4    | 0    | 86 LIST   | Chicken Biriyani  |12        |Hide keyboard| Continue    | Power button | 86          | X       |


  #TA-I1417 Sheet number : 36,37,38
  Scenario Outline:Verify Newly added menu item is available in 86 List in POS login screen and Operation Screen
    Given I click 86List button in the login screen
    When I search the menu item as "<menuItem>" on the 86 list screen
    Then I should verify the "<menuItem>" in the search list "verify the menu item"

    And I click search close on the 86 list screen
    When I search the menu item as "<menuItem1>" on the 86 list screen
    Then I should verify the "<menuItem1>" in the search list "verify the menu item"
    And I click search close on the 86 list screen
    When I search the menu item as "<itemIdly>" on the 86 list screen
    Then I should verify Eighty six list disable menu item as "<itemIdly>" are not displayed in the login screen eighty six list
    And I click close button in the eighty six list popup
    And I enter the Pin number for login
    And I click the operation button in the login screen
    And I click 86List button in the operation window
    And I click on the search field "<menuItem>" for searching the menu item "search menu item "

    Then I should verify the "<menuItem>" in the search list "verify the menu item"
    And I click close button in the eighty six list popup1
#    And I click the "<btn86List>" in the operation Screen "click 86 List"
    And I click on the search field "<menuItem1>" for searching the menu item "search menu item "

    Then I should verify the "<menuItem1>" in the search list "verify the menu item"
    And I click close button in the eighty six list popup1
#    And I click the "<btn86List>" in the operation Screen "click 86 List"
    And I click on the search field "<itemIdly>" for searching the menu item "search menu item"

    Then I should verify Eighty six list disable menu item as "<itemIdly>" are not displayed in the login screen eighty six list1
    And I click power button1

    Examples:
      | btnEightySix |pin1 | pin2 | pin3 | pin4 | btn86List | menuItem | Back | btnClose |menuItem1 |btnPower |itemIdly|btnEmptyList|btnToggle |
      |  86 LIST | 1  | 2 | 3 | 4 | 86 List | Chicken Biriyani |  Hide keyboard | X |Chicken Noodles |Power button |Idly     |Empty list  |ToggleIcon|



  #TA-I1441 sheet number : 55,58,61,80,81,83
  Scenario Outline: verify the available quantity decreased after ordering menu item in the order screen,Verify available qty is reduced when repeat order through menu option,Verify available qty is reduced when repeat order through Customer Profile screen
    Given I enter clock in pin
    And I click the operation button in the login screen
   And I click the 86 list button in the operation screen
    And I click on the search field "<menuItem>" for searching the menu item "search menu item"
    And I click the quantity txt field in the eighty six list popup "click qty txt field"
    And I enter the percentage2 as "10"
#    Then I click "<btnContinue>" in the Quantity popup "Click Continue Button"
    And I click the Toggle Icon button
    And I click POS Icon from Toggle
    And I closed the order type window
    And I get check number
    And I pass menu item as "<menuItem>" to search
#    And I get count of menu
    And I select 86 menu item as "<menuItem>"
   And I select category as "<category>"
    #Verify available qty is reduced after creating payment.

    Then I should verify the the quantity "<txtQty>" is displayed in the order screen is decreased after order placed "<menuItem>"
    And I click menu item as "<menuItem>" to see Menu option screen
    When I click Repeat on menu option
    #Verify available qty is reduced when repeat order through menu option
    Then I should verify the the quantity "<txtQty1>" is displayed in the order screen is decreased after order placed "<menuItem>"
#    And I click Void button on order management screen
#    And I click Done button on the Popup
    When I click Add Customer Button
    And I search for "<Customer>"
    When I click "<Customer>" to select customer for the seat
    And I click Payment button in the Order Management Screen
    And I click cash button from the payment method popup
    And I click Submit button on the Payment Window
    And I closed the order type window
    When I click Add Customer Button
    And I search for "<Customer>"
    When I click "<Customer>" to select customer for the seat
    And I click the customer name on the order screen
    Then I should see the customer profile window
#    And I enter the customer name as "<Customer>" in the notes field "Enter customer name"
#    And I select "<Customer>" as goknur loyalty "Select goknur loyalty"
#    When I click "<Customer>" in the order screen "Select Customer tab"
#    When I select the "<menuItem>" in the customer field "Select Chicken Rice"
    When I select the "<menuItem>" in the customer field "Select Chicken Rice"
    And I click repeat Order button on the customer profile window
    Then I Should get back to the Order Screen
    #Verify available qty is reduced when repeat order through Customer Profile screen
    Then I should verify the the quantity "<txtQty3>" is displayed in the order screen is decreased after order placed "<menuItem>"
    And I click Payment button in the Order Management Screen
    And I click cash button from the payment method popup
    And I click Submit button on the Payment Window
    And I closed the order type window
    And I select category as "<category>"
    And I select menu item as "<menuItem>"
    Then I should verify the the quantity "5" is displayed in the order screen is decreased after order placed "<menuItem>"
    Given User select QSR mode on menu item page
    When User select DineIn mode
    And I select table as "<txtTable>"
    And I select category as "<category>"
    #Verify qty is decreasing when place menu item and change the service type.
    Then I should verify the the quantity "5" is displayed in the order screen is decreased after order placed "<menuItem>"
    And I select category as "<category>"
    #Verify qty is reduced when open the active check which is placed after service type changes.
    Then I should verify the the quantity "5" is displayed in the order screen is decreased after order placed "<menuItem>"
    And I select category as "<category>"
    And I select menu item as "<menuItem>"
    And I select category as "<category>"

    #Verify qty is reduced when place menu item from One display group and verify in another display group.
    Then I should verify the the quantity "4" is displayed in the order screen is decreased after order placed "<menuItem>"
    And I click Payment button in the Order Management Screen
    And I click cash button from the payment method popup
    And I click Submit button on the Payment Window
    And I click power button

    Examples:
      |btnEightySix | pin0 |  pin1 | pin2 |pin3|pin4|  Back        | btnContinue |btnToggle  |btnPos |btnCancel|    category     |menuItem          |txtQty| txtQty1 |txtQty3|btnPayment|btnCash| btnDropDown |btnRepeat | tabCustomer | Customer      | btnRepeatOrder | btnQSR | btnDineIn | txtTable |  category2       |btnVoid |btnDone |btnPower     |
      |86 LIST      | 0    |  1    |  2   | 3  | 4  |Hide keyboard |Continue     |ToggleIcon |POS    |Cancel   |Ultimate Lunch  |Chicken Noodles  |9     | 8       |6     |Payment   |Cash   | arrow down  | Repeat   |New Customer | goknur bati    | Repeat Order   | QSR    | Dine In   | T5       | Ultimate Lunch 3 | Void   | Done   |Power button |


  #TA-I1442 sheet number : 56,57
  Scenario Outline: verify the available quantity reverted when place menu item and void it before send to the kitchen
    Given I enter clock in pin
    And I click the operation button in the login screen
   And I click the 86 list button in the operation screen
    And I click on the search field "<itemVegBiriyani>" for searching the menu item "search menu item"

    And I click the quantity txt field in the eighty six list popup "click qty txt field"
    And I enter the percentage2 as "10"
#    And I enter the percentage2 as "10"
#    Then I click "<btnContinue>" in the Quantity popup "Click Continue Button"
    And I click the Toggle Icon button
   And I click POS Icon from Toggle
    And I closed the order type window
   And I select category as "<category>"
  And I select menu item as "<itemVegBiriyani>"
    Then I should verify the the quantity "<txtQty1>" is displayed in the order screen is decreased after order "<itemVegBiriyani>"
    And I click menu item as "<itemVegBiriyani>" to see Menu option screen
    And I click void item on Menu option
    Then I should verify the the quantity "<txtQty2>" is displayed in the order screen reverted after void "<itemVegBiriyani>"
    And I select category as "<category>"
    And I select menu item as "<itemVegBiriyani>"
    And I click Options button
    And I click resend to kitchen
#    And I click "<btnKitchen>" in the Option Screen "click kitchen button"
    Then I should verify the the quantity "<txtQty1>" is displayed in the order screen is decreased after order "<itemVegBiriyani>"
    And I click menu item as "<itemVegBiriyani>" to see Menu option screen
    And I click void item on Menu option
    Then I should see the void reason popup
    And I click void Reason on the void popup
    And I click Add Button on the void reason popup
    And I select category as "<category>"
    #verify the available quantity reverted when place menu item and void it after send to the kitchen
    Then I should verify the the quantity "<txtQty2>" is displayed in the order screen reverted after void "<itemVegBiriyani>"
    And I click Void button on order management screen
    Then I should see the void reason popup
    And I click void Reason on the void popup
    And I click Add Button on the void reason popup
    And I closed the order type window
    #november 15 changes
    And I click log off button in order screen

    Examples:
      |btnEightySix     | pin0 |  pin1  | pin2 |pin3|pin4  |   Back       |btnContinue |btnToggle  |btnPos |btnCancel|    category   |itemVegBiriyani |txtQty1 |btnVoid   |btnVoidItem|btnDone|txtQty2| btnDropDown |btnOption |btnKitchen |btnWrong |btnAdd |btnLogOff|
      |86 LIST   | 0    |   1    |  2   |3   |4     |Hide keyboard |Continue  |ToggleIcon |POS    |Cancel   |Ultimate Lunch |Veg Biriyani    |9   |Void Item              |Void|Done   |10     | arrow down  |Option   |Resend To Kitchen |Wrong Item Ordered |Add |logOff   |


  #TA-I1445 Sheet number : 54,59,60,86,88
  Scenario Outline: Verify application allows to repeat order up to its maximum qty.
    Given I enter clock in pin
    And I click the operation button in the login screen
   And I click the 86 list button in the operation screen
    And I click on the search field "<menuItem>" for searching the menu item "search menu item "

    And I click the quantity txt field in the eighty six list popup "click qty txt field"
    And I enter the percentage2 as "2"
    And I click the Toggle Icon button
   And I click POS Icon from Toggle
    And I closed the order type window
   And I select category as "<category>"
   And I select menu item as "<menuItem>"
    Then I should verify the the quantity "<txtQty>" is displayed in the order screen is decreased after order placed "<menuItem>"
    And I click menu item as "<menuItem>" to see Menu option screen
    When I click Repeat on menu option
    Then I should verify the the quantity "<txtQty1>" is displayed in the order screen is decreased after order placed "<menuItem>"
    And I select menu item as "<menuItem>"
  #    And I click menu item as "<menuItem>" to see Menu option screen
#    When I click Repeat on menu option
    Then I should verify the "<insufficientPopUp>" in the order screen of eighty six list "Verify Insufficient pop up"
    And I click Done button on the Popup
    Then I should see "1" is Increased
    And I click "<pin1>" from the selected menu item quantity "Click item as Chicken Rice"
    Then I should verify the "<pin1>" is present not "<pin2>" in the order screen of added menu item in eighty six "Verify the quantity is not 2"
    And I click Payment button in the Order Management Screen
    Then I click cash button from the payment method popup
    And I click Submit button on the Payment Window
    And I closed the order type window
    And I select category as "<category>"

#    Then I should verify the "<menuItem>" in the order screen in the category "Verify Chicken Biriyani"
    Then I should verify the the quantity "<txtQty1>" is displayed in the order screen is decreased after order placed "<menuItem>"
    And I click log off button in order screen
    Examples:
      | btnEightySix | pin0 |  pin1 | pin2 |pin3|pin4|  Back        | btnContinue |btnToggle  |btnPos |btnCancel|    category   |menuItem | btnRepeat |btnCash|txtQty|txtQty1| btnDropDown |insufficientPopUp |btnLogOff|
      | 86 LIST   | 0    |   1   |  2   | 3  | 4  |Hide keyboard |  Continue | ToggleIcon | POS    |Cancel   |Ultimate Lunch | Chicken Rice    | Repeat |  Cash  |1   |0 | arrow down |Quantity is not enough. |logOff |


  #TA-I1448 sheet number : 62

  Scenario Outline: verify the available quantity when reopen the closed check from check stats
    Given I enter clock in pin
    And I click the operation button in the login screen
   And I click the 86 list button in the operation screen
    And I click on the search field "<itemVegBiriyani>" for searching the menu item "search menu item"

    And I click the quantity txt field in the eighty six list popup "click qty txt field"
    And I enter the percentage2 as "10"
    And I click the Toggle Icon button
   And I click POS Icon from Toggle
    And I closed the order type window
    When I get check number
    And I select category as "<category>"
   And I select menu item as "<itemVegBiriyani>"

    Then I should verify the the quantity "<txtQty>" is displayed in the order screen is decreased after order "<itemVegBiriyani>"
    And I click Payment button in the Order Management Screen
    Then I click cash button from the payment method popup
    And I click Submit button on the Payment Window
    And I closed the order type window
    And I click All
    And I click Check Stats tab
    And I click Closed tab on the Check stats
    And I click the Closed check on check stats
    And I click reopen check button on the check stats screen
    Then I Should get back to the Order Screen
    And I select category as "<category>"

    Then I should verify the the quantity "<txtQty>" is displayed in the order screen is decreased after order "<itemVegBiriyani>"
    And I click Payment button in the Order Management Screen
    And I click Submit button on the Payment Window
    And I closed the order type window
    And I click log off button in order screen
    Examples:
      |btnEightySix | pin0 |  pin1  | pin2 | pin3 | pin4  | Back          |btnContinue |btnToggle  |btnPos  |btnCancel   |    category   |itemVegBiriyani|btnCash|tabAll|tabClosed|btnRe-openCheck|txtQty| btnDropDown |btnLogOff|
      |86 LIST      | 0    |   1    |  2   |  3   |  4    | Hide keyboard |Continue    |ToggleIcon |POS     |Cancel      |Ultimate Lunch |Veg Biriyani   |Cash   | All  |Closed   |reOpenCheck   |9      | arrow down  |logOff   |


  #TA-I1449 sheet number : 63
  Scenario Outline: verify the available quantity when reopen the closed check and void item
    Given I enter clock in pin
    And I click the operation button in the login screen
   And I click the 86 list button in the operation screen
    And I click on the search field "<btnVegBiriyani>" for searching the menu item "search menu item"
    And I click the quantity txt field in the eighty six list popup "click qty txt field"
    And I enter the percentage2 as "10"
    And I click the Toggle Icon button
   And I click POS Icon from Toggle
    And I closed the order type window
    When I get check number
    And I select category as "<category>"
    And I select menu item as "<itemVegBiriyani>"
    Then I should verify the the quantity "<txtQty1>" is displayed in the order screen is decreased after order "<itemVegBiriyani>"
    And I click Payment button in the Order Management Screen
    Then I click cash button from the payment method popup
    And I click Submit button on the Payment Window
    And I closed the order type window
    And I click All
    And I click Check Stats tab
    And I click Closed tab on the Check stats
    And I click the Closed check on check stats
    And I click reopen check button on the check stats screen
    And I click Payment button in the Order Management Screen
    And I click payment in the payment window
    When I click Delete button on the payment window
#    And I click "<btnOK>" in the receipt printer popup"Click ok button in the popup"
    When I click Exit to return to Order Management Screen
    And I click Void button on order management screen
    Then I should see the void reason popup
    And I click void Reason on the void popup
    And I click Add Button on the void reason popup
    #nov 22
#    And I click "<btnDone>" in the order screen "Click Done button"
    And I closed the order type window
    And I select category as "<category>"
    Then I should verify the the available quantity "<txtQty2>" is displayed in the order screen "<itemVegBiriyani>"
    And I click log off button in order screen
    Examples:
      |btnEightySix | pin0 |  pin1  | pin2 |pin3|pin4|btnVegBiriyani |Back          |btnContinue |btnToggle  |btnPos  |btnCancel   |    category   |itemVegBiriyani|btnPayment|btnCash|tabAll|tabClosed|btnRe-openCheck|txtQty1|btnOK |btnVoid|btnAdd   |txtQty2|btnWrong| btnDropDown | btnLogOff |btnDone|
      |86 LIST      | 0    |   1    |  2   |3   |4   |Veg Biriyani   |Hide keyboard |Continue    |ToggleIcon |POS     |Cancel      |Ultimate Lunch |Veg Biriyani   |Payment   |Cash   | All  |Closed   |reOpenCheck    |9      |OK    |Void    |Add      |10      |Wrong Item Ordered| arrow down |logOff|Done|


  #TA-I1450 sheet number : 64,65
  Scenario Outline: verify the available quantity should not reduce again when reopen the closed check and submit it again
    Given I enter clock in pin
    And I click the operation button in the login screen
   And I click the 86 list button in the operation screen
    And I click on the search field "<btnVegBiriyani>" for searching the menu item "search menu item"

    And I click the quantity txt field in the eighty six list popup "click qty txt field"
    And I enter the percentage2 as "10"
    And I click the Toggle Icon button
   And I click POS Icon from Toggle
    And I closed the order type window
    When I get check number
    And I select category as "<category>"
    And I select menu item as "<itemVegBiriyani>"
#    And I select menu item as "<itemVegBiriyani>"
    Then I should verify the the quantity "<txtQty>" is displayed in the order screen is decreased after order "<itemVegBiriyani>"
    And I click Payment button in the Order Management Screen
    Then I click cash button from the payment method popup
    And I click Submit button on the Payment Window
    And I closed the order type window
    And I click All
     And I click Closed tab on the Check stats
    And I click the Closed check on check stats
    And I click reopen check button on the check stats screen
    And I click Payment button in the Order Management Screen
    And I click Submit button on the Payment Window
    And I closed the order type window
    And I select category as "<category>"

    Then I should verify the the quantity "<txtQty>" remains same when reopen and submit it "<itemVegBiriyani>"
    When I get check number
    And I select menu item as "<itemVegBiriyani>"
    Then I should verify the the quantity "<txtQty1>" is displayed in the order screen is decreased after order "<itemVegBiriyani>"
    And I click Payment button in the Order Management Screen
    Then I click cash button from the payment method popup
    And I click Submit button on the Payment Window
    And I closed the order type window
    And I click All
     And I click Closed tab on the Check stats
    And I click the Closed check on check stats
    And I click reopen check button on the check stats screen
    And I select category as "<category>"
    Then I should verify the the quantity "<txtQty1>" remains same when reopen and submit it "<itemVegBiriyani>"
#    And I select menu item as "<itemVegBiriyani>"
    And I select menu item as "<itemVegBiriyani>"
    And I click Payment button in the Order Management Screen
    Then I click cash button from the payment method popup
    And I click Submit button on the Payment Window
    And I closed the order type window
    And I select category as "<category>"
    Then I should verify the the quantity "<txtQty2>" is displayed in the order screen is decreased after order "<itemVegBiriyani>"
    And I click log off button in order screen
    Examples:
      |btnEightySix | pin0 |  pin1  | pin2 |pin3|pin4|btnVegBiriyani |Back          |btnContinue |btnToggle  |btnPos  |btnCancel   |    category   |itemVegBiriyani|btnPayment|btnCash|tabAll|tabClosed|btnRe-openCheck|txtQty  |txtQty1|txtQty2| btnDropDown |btnLogOff|
      |86 LIST      | 0    |   1    |  2   |3   |4   |Veg Biriyani   |Hide keyboard |Continue    |ToggleIcon |POS     |Cancel      |Ultimate Lunch |Veg Biriyani   |Payment   |Cash   | All  |Closed   |reOpenCheck    |9       |8      |7 | arrow down |logOff   |


  #TA-I1452 sheet number : 66

  Scenario Outline: verify the available quantity when reopen the closed check and void item and submit it
    Given I enter clock in pin
    And I click the operation button in the login screen
   And I click the 86 list button in the operation screen
    And I click on the search field "<btnVegBiriyani>" for searching the menu item "search menu item"

    And I click the quantity txt field in the eighty six list popup "click qty txt field"
    And I enter the percentage2 as "10"
    And I click the Toggle Icon button
   And I click POS Icon from Toggle
    And I closed the order type window
    When I get check number
    And I select category as "<category>"
    And I select menu item as "<itemVegBiriyani>"
    Then I should verify the the quantity "<txtQty1>" is displayed in the order screen is decreased after order "<itemVegBiriyani>"
    And I click Payment button in the Order Management Screen
    Then I click cash button from the payment method popup
    And I click Submit button on the Payment Window
    And I closed the order type window
    And I click All
     And I click Closed tab on the Check stats
    And I click the Closed check on check stats
    And I click reopen check button on the check stats screen
    And I click Payment button in the Order Management Screen
    And I click payment in the payment window
    When I click Delete button on the payment window
#    And I click "<btnOK>" in the receipt printer popup"Click ok button in the popup"
    When I click Exit to return to Order Management Screen
    And I click menu item as "<itemVegBiriyani>" to see Menu option screen
    And I click Void button on order management screen
    Then I should see the void reason popup
    And I click void Reason on the void popup
    And I click Add Button on the void reason popup
    And I closed the order type window
    And I select category as "<category>"
    Then I should verify the the quantity "<txtQty2>" remains same when reopen and submit it "<itemVegBiriyani>"
    And I click log off button in order screen
    Examples:
      |btnEightySix | pin0 |  pin1  | pin2 |pin3|pin4|btnVegBiriyani |Back          |btnContinue |btnToggle  |btnPos  |btnCancel   |    category   |itemVegBiriyani|btnPayment|btnCash|tabAll|tabClosed|btnRe-openCheck|txtQty1|btnOK |btnVoid |btnAdd|btnDone   |txtQty2|btnWrong| btnDropDown | btnLogOff|
      |86 LIST     | 0    |   1    |  2   |3   |4   |Veg Biriyani   |Hide keyboard |Continue    |ToggleIcon |POS     |Cancel      |Ultimate Lunch |Veg Biriyani   |Payment   |Cash   | All  |Closed   |reOpenCheck    |   9  |OK    |Void Item   |Add   |Done     |10   |Wrong Item Ordered| arrow down |logOff|


  #TA-I1453 sheet number : 67 & 68
  Scenario Outline: verify the applied quantity displayed on the menu name in order screen
    Given I enter clock in pin
    And I click the operation button in the login screen
   And I click the 86 list button in the operation screen
    And I click on the search field "<itemVegBiriyani>" for searching the menu item "search menu item"

    And I click the quantity txt field in the eighty six list popup "click qty txt field"
    And I enter the percentage2 as "10"
    And I click the Toggle Icon button
   And I click POS Icon from Toggle
    And I closed the order type window
    And I select category as "<category>"
    Then I should verify the the available quantity "<txtQty>" is displayed in the order screen "<itemVegBiriyani>"
    And I click log off button in order screen
    Examples:
      |btnEightySix  | pin0 |  pin1 | pin2 | pin3 | pin4 | itemVegBiriyani |  Back        |btnContinue |btnToggle  |btnPos |btnCancel|    category   |txtQty | btnDropDown | btnLogOff |
      |86 LIST       | 0   |   1    |  2   | 3    | 4    | Veg Biriyani    |Hide keyboard |Continue    |ToggleIcon |POS    |Cancel   |Ultimate Lunch |10     | arrow down  | logOff    |


  #TA-I1455 sheet number : 69
  Scenario Outline: verify the quantity of menu item changes when change the quantity in 86 list
    Given I enter clock in pin
    And I click the operation button in the login screen
   And I click the 86 list button in the operation screen
    And I click on the search field "<itemVegBiriyani>" for searching the menu item "search menu item"

    And I click the quantity txt field in the eighty six list popup "click qty txt field"
    And I enter the percentage2 as "10"
    And I click the Toggle Icon button
   And I click POS Icon from Toggle
    And I closed the order type window
     And I select category as "<category>"
    Then I should verify the the available quantity "<txtQty1>" is displayed in the order screen "<itemVegBiriyani>"
    And I click the Settings button
   And I click the 86 list button in the operation screen
    And I click on the search field "<itemVegBiriyani>" for searching the menu item "search menu item"
    And I click the quantity txt field in the eighty six list popup "click qty txt field"
    And I enter the percentage2 as "12"
    And I click the Toggle Icon button
   And I click POS Icon from Toggle
    And I closed the order type window
     And I select category as "<category>"
    Then I should verify the the available quantity "<txtQty2>" is displayed in the order screen "<itemVegBiriyani>"
    And I click log off button in order screen

    Examples:
      |btnEightySix  | pin0 |  pin1 | pin2 | pin3 | pin4 | itemVegBiriyani |  Back        |btnContinue |btnToggle  |btnPos |btnCancel|    category   |txtQty1 |btnSettings |txtQty2 | btnDropDown |btnLogOff |
      |86 LIST       | 0   |   1    |  2   | 3    | 4    | Veg Biriyani    |Hide keyboard |Continue    |ToggleIcon |POS    |Cancel   |Ultimate Lunch |10     |Settings 1   |12      | arrow down  |logOff    |


  #TA-I1456 sheet number : 70
  Scenario Outline: verify the quantity of menu item is reduces in login screen 86 list when place the order and close the sale
    Given I enter clock in pin
    And I click the operation button in the login screen
   And I click the 86 list button in the operation screen
    And I click on the search field "<itemVegBiriyani>" for searching the menu item "search menu item"
    And I click the quantity txt field in the eighty six list popup "click qty txt field"
    And I enter the percentage2 as "10"
    And I click the Toggle Icon button
   And I click POS Icon from Toggle
    And I closed the order type window
    And I select category as "<category>"
    Then I should verify the the available quantity "<txtQty1>" is displayed in the order screen "<itemVegBiriyani>"
    And I select menu item as "<itemVegBiriyani>"
    And I click Payment button in the Order Management Screen
    Then I click cash button from the payment method popup
    And I click Submit button on the Payment Window
    And I closed the order type window
    And I select category as "<category>"
    Then I should verify the the quantity "<txtQty2>" is displayed in the order screen is decreased after order "<itemVegBiriyani>"
    And I click log off button in order screen
    Given I click 86List button in the login screen
    When I search the menu item as "<itemVegBiriyani>" on the 86 list screen
    Then I should verify the "<itemVegBiriyani>" in the search list "verify the menu item"
    Then I verify the quantity value as "<txtQty2>" "Verify Quantity"
#    And I should verify the the applied quantity "<txtQty2>" reduces in login screen eighty six list after order "<itemVegBiriyani>"
    And I click close button in the eighty six list popup

    Examples:
      |btnEightySix   |  pin0 |  pin1 | pin2 |pin3|pin4|  Back         | btnContinue |btnToggle  |btnPos |btnCancel|    category   |itemVegBiriyani |btnCash|btnLogOff|txtQty1|txtQty2|btnEightySix1| btnDropDown |btnClose |
      |86 LIST        |  0    |   1    |  2   |3   |4   |Hide keyboard |Continue    |ToggleIcon |POS    |Cancel   |Ultimate Lunch |Veg Biriyani    |  Cash   |logOff  |10      |9      |86           | arrow down  | X       |


  #TA-I1458 Sheet number :72
  Scenario Outline: Verify Qty of menu item is reduces in Login screen 86 List, when place the menu item and click on All.
    Given I enter clock in pin
    And I click the operation button in the login screen
    When I click 86List button in the operation window
    And I click on the search field "<menuItem>" for searching the menu item "search menu item"

    And I click the quantity txt field in the eighty six list popup "click qty txt field"
    And I enter the percentage2 as "10"
    And I click the Toggle Icon button
   And I click POS Icon from Toggle
    And I closed the order type window
    When User click QSR on Menu Item page
    When User select DineIn mode
#    And I click the "Right" in the table layout screen1 "click right button"
#    And I select the "T16" in the Table layout screen1"click t4 table"
    And I select the "<txtTable>" in the Table layout screen"click T2 table"
  And I get check number
     And I select category as "<category>"
    And I select menu item as "<menuItem>"
    And I click Finish Order button
    And I click Table Layout tab
    And I click power button
    Given I click 86List button in the login screen
    When I search the menu item as "<menuItem>" on the 86 list screen
    Then I should verify the "<menuItem>" in the search list "verify the menu item"
    Then I verify the quantity value as "<quantity>" "Verify Quantity"
    And I click close button in the eighty six list popup
    And I'm logged in
    And I closed the order type window
    And I click All
    And I click Table Layout tab
    And I click the check from the table layout for merged
    And I click Void button on order management screen
    Then I should see the void reason popup
    And I click void Reason on the void popup
    And I click Add Button on the void reason popup
    And I click Table Layout tab
    And I click power button

    Examples:
      | btn86List | pin0 |  pin1 | pin2 |pin3|pin4|  Back        | btnContinue |btnToggle  |btnPos | btnCancel |btnQSR | btnDineIn | txtTable |    category   | menuItem | btnFinish | btnPower | btnEightySix | quantity | btnClose | tabAll | tabTableLayout | btnVoid | btnAdd |btnWrong | btnDropDown |btnDone|
      | 86 List   | 0    |   1   |  2   | 3  | 4  |Hide keyboard |  Continue | ToggleIcon | POS    | Cancel | QSR  | Dine In       | T2 |Ultimate Lunch | Chicken Noodles  | finish | Power button | 86 LIST    | 9     | X            | All    | Table Layout   | Void    | Add    |Wrong Item Ordered| arrow down |Done   |


  #TA-I1436 sheet no : 78 Completed but unable to do the BO related steps
  Scenario Outline: verify the quantity tool tip is disappear on the menu item in the order screen when disable the 86 list button in BO
    Given I'm logged in
    And I closed the order type window
     And I select category as "<category>"
    Then I should verify the quantity tool tip is disappear in the order screen for Eighty six list disabled menu item "Not Displayed"
    And I click log off button in order screen

    Examples:
      |btnCancel     |    category     | btnDropDown |btnLogOff|
      |Cancel        |     CIFOOD      | arrow down  |logOff   |


  #TA-I1400 Sheet number : 79
  Scenario Outline:Verify Qty is appear on the '86 List' menu item in Lite Mode.
    Given I enter the Pin number for login
    And I click the operation button in the login screen
   And I click the 86 list button in the operation screen
    And I click on the search field "<menuItem>" for searching the menu item "search menu item "

    And I click the quantity txt field in the eighty six list popup "click qty txt field"
    And I enter the percentage2 as "10"
    And I click the Toggle Icon button
#    When I click the POS settings from Toggle
##    When I click on the enable lite mode switch "Click Lite mode in Pos Settings"
#    And I click the Toggle Icon button
   And I click POS Icon from Toggle
    And I closed the order type window
     And I select category as "<category>"
    Then I should verify the the quantity "<txtQty>" is displayed in the order screen is decreased after order placed "<menuItem>"
    And I click log off button in order screen
#    Given I enter the Pin number for login
#    And I click the operation button in the login screen
#    When I click on the "<btnPosSettings>" in the operation screen "Click 86 List"
#    When I click on the enable lite mode switch "Click Lite mode in Pos Settings"
#    And I click power button

    Examples:
      | btnEightySix | pin0 |  pin1 | pin2 |pin3|pin4|  Back        | btnContinue |btnToggle  | btnPosSettings |btnPos |btnCancel|    category   |menuItem |txtQty|btnDropDown | btnPower |
      | 86 LIST   | 0    |   1   |  2   | 3  | 4  |Hide keyboard |  Continue | ToggleIcon  | POS Settings | POS    |Cancel   |Ultimate Lunch | Chicken Noodles     |10    | arrow down | Power button |


  #TA-I1414 Sheet number : 82
  Scenario Outline: Verify QTY is displays on the menu under display groups.
    Given I enter clock in pin
    And I click the operation button in the login screen
   And I click the 86 list button in the operation screen
    And I click on the search field "<menuItem>" for searching the menu item "search menu item "

    And I click the quantity txt field in the eighty six list popup "click qty txt field"
    And I enter the percentage2 as "10"
    And I click the Toggle Icon button
   And I click POS Icon from Toggle
    And I closed the order type window
     And I select category as "<category>"
    Then I should verify the the quantity "<txtQty>" is displayed in the order screen is decreased after order placed "<menuItem>"
    And I click log off button in order screen
    Examples:
      | btnEightySix | pin0 |  pin1 | pin2 |pin3|pin4|  Back        | btnContinue |btnToggle  |btnPos |btnCancel|    category   |menuItem |txtQty|btnDropDown | btnLogOff |
      | 86 LIST   | 0    |   1   |  2   | 3  | 4  |Hide keyboard |  Continue | ToggleIcon  | POS    |Cancel   |Ultimate Lunch  | Chicken Rice | 10 |arrow down|logOff|


  #TA-I1416 Sheet number : 84 serving size different
  Scenario Outline: verify the quantity of an item not depends on the serving size of an item
    Given I enter clock in pin
    And I click the operation button in the login screen
   And I click the 86 list button in the operation screen
    And I click on the search field "<itemLemonJuice>" for searching the menu item "search menu item"

    And I click the quantity txt field in the eighty six list popup "click qty txt field"
    And I enter the percentage2 as "10"

    And I click the Toggle Icon button
   And I click POS Icon from Toggle
    And I closed the order type window
    And I select category as "<category>"
    Then I should verify the the quantity "<txtQty1>" is displayed in the order screen is decreased after order"<itemLemonJuice>"
    And I select menu item as "<itemLemonJuice>"
#    And I click "<itemLemonJuice>" from the menu item "Click item as lemon juice"
    Then I should verify the the quantity "<txtQty2>" is displayed not depends on the serving size of an item "<itemLemonJuice>"
    And I click Void button on order management screen
    And I click Done button on the Popup
    And I click log off button in order screen
    Examples:
      |btnEightySix | pin0 |  pin1 | pin2 |pin3|pin4|  Back        | btnContinue |btnToggle  |btnPos |btnCancel|    category   |itemLemonJuice |txtQty1 |txtQty2|btnDropDown |btnVoid |btnLogOff |btnDone|
      |86 LIST        | 0   |   1    |  2   |3  |4  |Hide keyboard |Continue    |ToggleIcon  |POS    |Cancel   |    DRINKS     |Lemon Juice    | 10     | 9     |arrow down  |Void    |logOff    |Done   |


  #TA-I1421 sheet no : 98 test case fails because free item springrolls doesn't reduce after placing an order
  Scenario Outline: verify the discount free item count in 86 list
    Given I enter clock in pin
    And I click the operation button in the login screen
   And I click the 86 list button in the operation screen
    And I click on the search field "<itemVegBiriyani>" for searching the menu item "search menu item"

    And I click the quantity txt field in the eighty six list popup "click qty txt field"
    And I enter the percentage2 as "10"
    And I click the Toggle Icon button
   And I click POS Icon from Toggle
    And I closed the order type window
     And I select category as "<category>"
    Then I should verify the the free item quantity "<txtQty1>" is displayed in the order screen is decreased after order "<itemVegBiriyani>"
   And I select menu item as "<itemVegBiriyani>"
#    And I click "<itemVegBiriyani>" from the menu item "Click item as Poori"
    And I select Discount on the Order screen
    Then I should see Check Based Discount Screen
    And I click Discount as "<optFreeItemDiscount>"
    And I click Back button on Discount Screen
    Then I should verify the the free item quantity "<txtQty>" is displayed in the order screen is decreased after order "<itemVegBiriyani>"
    And I click Void button on order management screen
    And I click Done button on the Popup
    And I click log off button in order screen
    Examples:
      |btnEightySix | pin0 |  pin1  | pin2 |pin3|pin4|itemVegBiriyani |Back          |btnContinue |btnToggle  |btnPos  |btnCancel   |    category  |txtQty1   |txtQty|btnDiscount |optFreeItemDiscount|btnBack|btnDropDown |btnVoid |btnLogOff |btnDone|
      |86 LIST      | 0    |   1    |  2   |3   |4   |Veg Biriyani    |Hide keyboard |Continue    |ToggleIcon |POS     |Cancel      |Ultimate Lunch |10       |  9   |Discount    |Free Item 86 list  |Back   |arrow down  |Void    |logOff    |Done   |


  #TA-I1422 sheet no : 99 test case fails because free item springrolls doesn't reduce after placing an order
  Scenario Outline: verify the available quantity reverted when void the free item after applied free item discount
    Given I enter clock in pin
    And I click the operation button in the login screen
   And I click the 86 list button in the operation screen
    #Changes november 15
    And I click on the search field "<itemVegBiriyani>" for searching the menu item "search menu item"

    And I click the quantity txt field in the eighty six list popup "click qty txt field"
    And I enter the percentage2 as "10"
    And I click the Toggle Icon button
   And I click POS Icon from Toggle
    And I closed the order type window
    When I get check number
     And I select category as "<category>"
    Then I should verify the the free item quantity "<txtQty1>" is displayed in the order screen is decreased after order "<itemVegBiriyani>"
    And I select menu item as "<itemVegBiriyani>"
#    And I click "<itemVegBiriyani>" from the menu item "Click item as Poori"
    And I select Discount on the Order screen
    Then I should see Check Based Discount Screen
    And I click Discount as "<optFreeItemDiscount>"
    And I click Back button on Discount Screen
    Then I should verify the the free item quantity "<txtQty>" is displayed in the order screen is decreased after order "<itemVegBiriyani>"
    And I click Payment button in the Order Management Screen
    Then I click cash button from the payment method popup
    And I click Submit button on the Payment Window
    And I closed the order type window
    And I click All
     And I click Closed tab on the Check stats
    And I click the Closed check on check stats
    And I click reopen check button on the check stats screen
    And I click Payment button in the Order Management Screen
    And I click payment in the payment window
    When I click Delete button on the payment window
#    And I click "<btnOK>" in the receipt printer popup"Click ok button in the popup"
#    And I click the "<btnDone>" in the popup screen"click done button"
    When I click Exit to return to Order Management Screen
    And I click Void button on order management screen
    Then I should see the void reason popup
    And I click void Reason on the void popup
    And I click Add Button on the void reason popup
    And I closed the order type window
    And I select category as "<category>"
    Then I should verify the the free item quantity "<txtQty1>" is displayed in the order screen reverted after void"<itemVegBiriyani>"
    And I click log off button in order screen
    Examples:
      |btnEightySix | pin0 |  pin1  | pin2 |pin3|pin4|itemVegBiriyani |Back          |btnContinue |btnToggle  |btnPos  |btnCancel   |    category  |txtQty1 |btnVoid  |txtQty|btnDiscount |optFreeItemDiscount|btnBack|btnPayment |btnCash|tabAll|tabClosed|btnRe-openCheck |btnOK|btnAdd|btnDone|btnWrong |btnDropDown |btnLogOff |
      |86 LIST     | 0    |   1    |  2   |3   |4   |Veg Biriyani    |Hide keyboard |Continue    |ToggleIcon |POS     |Cancel      |Ultimate Lunch |10     |Void     |  9   |Discount    |Free Item 86 list  |Back   |Payment     |Cash   |All   |Closed      |reOpenCheck     | OK  |Add   |Done   |Wrong Item Ordered|arrow down|logOff|


    #TA-I1436 sheet no :42, 43 ,44,45,46,47 Completed but unable to do the BO related steps (test case  pass in the applicable time)
  Scenario Outline: verify applications displays the 86 list enabled menu items but applicable time applied menu item in login and operations screen
    Given I click 86List button in the login screen
    And I search the menu item as "<menuItem>" on the 86 list screen
#    And I click on the search field "<menuItem>" for searching the menu item "search menu item "
    Then I should verify the "<menuItem>" in the search list "verify the menu item"
    And I click search close on the 86 list screen
    And I search the menu item as "<menuItem1>" on the 86 list screen
#    And I click on the search field "<menuItem>" for searching the menu item "search menu item "
    Then I should verify the "<menuItem1>" in the search list "verify the menu item"
    And I click search close on the 86 list screen
    And I search the menu item as "<menuItem2>" on the 86 list screen
#    And I click on the search field "<menuItem>" for searching the menu item "search menu item "
    Then I should verify the "<menuItem2>" in the search list "verify the menu item"
    And I click search close on the 86 list screen
    And I click close button in the eighty six list popup
    Given I enter the Pin number for login
    And I click the operation button in the login screen
    And I click 86List button in the operation window
    And I click on the search field "<menuItem>" for searching the menu item "search menu item"
    Then I should verify the "<menuItem>" in the search list "verify the menu item"
    And I click close button in the eighty six list popup1
    And I click on the search field "<menuItem1>" for searching the menu item "search menu item"
    Then I should verify the "<menuItem1>" in the search list "verify the menu item"
    And I click close button in the eighty six list popup1
    And I click on the search field "<menuItem2>" for searching the menu item "search menu item"
    Then I should verify the "<menuItem2>" in the search list "verify the menu item"
    And I click power button1

    Examples:
      |btnEightySix|   Back       |      menuItem         |menuItem1|menuItem2|btnClose |pin1 |pin2|pin3 |pin4|btnEightySix2|btnPower |btnClearText|
      |86 LIST          |Hide keyboard |     Pasta applicable time   |Egg Fried Rice |Kashmiri Fried Rice  |    X    |1    |2   |3    |4   |86 List      |Power button |Clear text|


#    #TA-I1436 sheet no : 49,73, 90,91
#  Scenario Outline: Verify qty is available on the menu item in the order screen in Offline mode,Verify qty is reduced when place 86 List menu in Offline mode.
#    Given I enter clock in pin
#    And I click the operation button in the login screen
#   And I click the 86 list button in the operation screen
#    And I click on the search field "<itemVegBiriyani>" for searching the menu item "search menu item"
#
#    And I click the quantity txt field in the eighty six list popup "click qty txt field"
#    And I enter the percentage2 as "10"
#    And I should verify the "<txtQty1>" after edit the quantity in operation screen "<itemVegBiriyani>"
#    And I click the Toggle Icon button
#   And I click POS Icon from Toggle
#    And I closed the order type window
#     And I select category as "<category>"
#    And I select menu item as "<itemVegBiriyani>"
#   #Verify qty is available on the menu item in the order screen in Offline mode.
#    Then i should verify the quantity displayed in the order screen in offline mode "<itemVegBiriyani>"
#   #Verify qty is reduced when place 86 List menu in Offline mode.
#    Then I should verify the the quantity "<txtQty>" is displayed in the order screen is decreased after order "<itemVegBiriyani>"
#    #verify the available quantity decreased after placing menu item in the order screen in offline mode
#    Then I should verify the the quantity "<txtQty>" is displayed in the order screen is decreased after order "<itemVegBiriyani>"
#    And I click Void button on order management screen
#    And I click Done button on the Popup
#    And I click log off button in order screen
#
#    Examples:
#      |btnDone  |btnEightySix | pin0 |  pin1 | pin2 |pin3|pin4|  Back        | btnContinue |btnToggle  |btnPos |btnCancel|    category   |itemVegBiriyani |txtQty |txtQty1|btnDropDown|btnVoid |btnLogOff |
#      |Done  |86 LIST      | 0    |  1    |  2   | 3  | 4 |Hide keyboard |Continue    |ToggleIcon |POS    |Cancel     |Ultimate Lunch |Veg Biriyani     |9     |10|arrow down| Void    | logOff   |
#

