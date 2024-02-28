
Feature: Order Types

#1


  Scenario:BarTab login as initial screen
    Given I'm logged in for BarTab
    Then I should see that BarTab is open
#    And I click QSR tab
    #Scenario:  Table layout user
#    And I click All
    And I click Table Layout tab
    Then I should get back to the Table Layout tab
    And I click power button
    #Scenario:BarTab login from operation screen
    When I login after I click BarTab button
    And I click the BarTab button from clock in screen
    Then I should see that BarTab is open
#    And I click All
    And I click power button

#2
  @Ordertype012
  Scenario Outline: Log-OFF Each Sale
    Given I'm logged in for Each sale
    And I close the order type window
    And I select category as "Pasta"
    And I select menu item as "<menu_item>"
    And I select modifier as "<modifier>"
    And I click Done to get back
    And I click Payment button in the Order Management Screen
    And I click cash button from the payment method popup
    And I click Submit button on the Payment Window
    #Scenario Outline: Change Service Type as DineIn
    Given I'm logged in
    And I close the order type window
#    And I click QSR tab
    And I tap QSR button to open the order types combo
    And I select order type as "<order_type>"
    And I select table as "<table_no>"
    Then I should see service type as "<order_type>"
    And I select service type as "<order_type>" on the order screen
    And I select order type as "QSR"
    And I click log off button in order screen
    Examples:
      | menu_item | modifier | order_type | table_no |
      | Ravioli | Butter | DINE IN | T2 |

 #3

  Scenario Outline:Cancel - Dine in Service type
    Given I'm logged in
    And I close the order type window
    And I tap QSR button to open the order types combo
    And I select order type as "<order_type>"
    And I click cancel button on the table layout screen
    Then I Should get back to the Order Screen
#    And I tap QSR button to open the order types combo
    And I select order type as QSR in order screen
  # And I click log off button in order screen
   #Scenario Outline:Selecting FORHEREOrder Type
   # And I'm logged in
#    And I click QSR tab
    And I select the order type FORHERE in dropdown
    And I click Add Customer Button
    And I search for "<customer_name>"
    When I click "<customer_name>" to select customer for the seat
#    And I click the Save button
    Then I Should get back to the Order Screen
    And I select order type as "<order_type>" method
    And I select order type as "<order_type1>"
    And I select order type as QSR in order screen
  #  And I click log off button in order screen
   #Scenario Outline:Selecting TOGO Order Type
   # Given I'm logged in
    And I select the TOGO order type
   # When I click Done button to select the order type
   # Then I should see the Customer Profile page with title "<title>"
    #And I select search
    #And I click the customer name on the order screen
    #And I select the customer
    #And I click the Save button
    And I select order type as "<order_type>" method
    And I select order type as "<order_type1>"
    And I select order type as QSR in order screen
   # And I click log off button in order screen
   #Scenario Outline:Selecting Delivery Order Type
   # Given I'm logged in
    And I select the DELIVERY order type
   # When I click Done button to select the order type
    #Then I should see the Customer Profile page with title "<title>"
    #And I select search
    #And I click the customer name on the order screen
    #And I select the customer
    And I search for "<customer_name>"
    When I click "<customer_name>" to select customer for the seat
    And I click the Save button
    And I click the customer name on the order screen
    And I click the Save button
    And I select order type as "<order_type>" method
    And I select order type as "<order_type1>"
    And I select order type as QSR in order screen
   # And I click log off button in order screen
   #Scenario Outline:Selecting PHONE TOGO Order Type
   # Given I'm logged in
    And I select the Phone To Go Service type

   #When I click Done button to select the order type
    #Then I should see the Customer Profile page with title "<title>"
    #And I select search
    #And I click the customer name on the order screen
    #And I select the customer
    #And I click the Save button
    And I select order type as "<order_type>" method
    And I select order type as "<order_type1>"
    And I select order type as QSR in order screen
   # And I click log off button in order screen
    #Scenario Outline:Selecting PHONE DELIVERY Order Type
  #  Given I'm logged in
    And I select the Phone Delivery Service type

  #  When I click Done button to select the order type
   # Then I should see the Customer Profile page with title "<title>"
    #And I select search
    #And I click the customer name on the order screen
    #And I select the customer
    And I search for "<customer_name>"
    When I click "<customer_name>" to select customer for the seat
    And I click the Save button
    And I click the customer name on the order screen
    And I click the Save button
    And I select order type as "<order_type>" method
    And I select order type as "<order_type1>"
    And I click Add Customer Button
    And I click remove button
    And I click on the cross buttin in the customer profile screen
    And I click log off button in order screen
    Examples:
      | order_type |order_type1 | title |customer_name|
      | DINE IN | QSR          | Customer Profile |Auto ragav|

#4

  Scenario Outline:Selecting QSR order type from combo and placing an order
    Given I'm logged in
    And I close the order type window
#    And I tap QSR button to open the order types combo
    And I select category as "FOOD"
    And I select menu item as "<menu_item>"
    And I select modifier as "<modifier>"
    And I click Done to get back
    And I should see that "<menu_item>" and "<modifier>" are added to the check
    And I click Order button in the order management screen
    And I click modifier as "<modifier>" on the order screen
    Then I should see Already sent to Kitchen warning pop-up
    And I click Done button on the Popup
    And I click Payment button in the Order Management Screen
    And I select Cash as payment method
    And I click Submit button on the Payment Window
    And I close the order type window
    And I click All
    Then I should see check stats Screen
#    And I select Closed Tab
    And I click QSR tab
    Then I should see the order type window
  #Scenario Outline:Selecting DINEIN order type from combo and placing an order
    And I close the order type window
    And I tap QSR button to open the order types combo
    And I select order type as "<order_type>"
    And I select table as "<table_no>"
    And I select category as "FOOD"
    And I select menu item as "<menu_item>"
    And I select modifier as "<modifier>"
    And I click Done to get back
    And I should see that "<menu_item>" and "<modifier>" are added to the check
    And I click Order button in the order management screen
    And I click modifier as "<modifier>" on the order screen
    Then I should see Already sent to Kitchen warning pop-up
    And I click Done button on the Popup
    When I click Finish button
    Then I should get back to the Table Layout tab and see the table as seated by one
    And I select table as "<table_no>"
    Then I Should get back to the Order Screen
    And I click Void button on order management screen
    Then I should see the void reason popup
    And I click void Reason on the void popup
    And I click Add Button on the void reason popup
#    Then I should see Receipt Printer popup
#    And I click Done button on the Popup
    Then I should get back to the Table Layout tab
    And I click QSR tab
    Then I should see the order type window
    And I closed the order type window
    #Scenario Outline:Selecting TOGO order type from combo and placing an order
    And I tap QSR button to open the order types combo
    And I select order type as "TOGO"
    And I click Add Customer Button
    And I search for "<customer_name>"
    When I click "<customer_name>" to select customer for the seat
#    And I click the Save button
    And I select category as "FOOD"
    And I select menu item as "<menu_item>"
    And I select modifier as "<modifier>"
    And I click Done to get back
    And I should see that "<menu_item>" and "<modifier>" are added to the check
    And I click Order button in the order management screen
    And I click modifier as "<modifier>" on the order screen
    Then I should see Already sent to Kitchen warning pop-up
    And I click Done button on the Popup
    And I click Payment button in the Order Management Screen
    And I select Cash as payment method
    And I click Submit button on the Payment Window
    And I select order type as "QSR" in phoneorderscreen
     #Scenario Outline:Selecting FORHERE order type from combo and placing an order
    And I close the order type window
    And I tap QSR button to open the order types combo
    And I select order type as "FORHERE"
    And I click Add Customer Button
    And I search for "<customer_name>"
    When I click "<customer_name>" to select customer for the seat
#    And I click the Save button
    And I select category as "FOOD"
    And I select menu item as "<menu_item>"
    And I select modifier as "<modifier>"
    And I click Done to get back
    And I should see that "<menu_item>" and "<modifier>" are added to the check
    And I click Order button in the order management screen
    And I click modifier as "<modifier>" on the order screen
    Then I should see Already sent to Kitchen warning pop-up
    And I click Done button on the Popup
    And I click Payment button in the Order Management Screen
    And I select Cash as payment method
    When I click Submit button on the Payment Window
    Then I should see the Phone Order tab
    And I click Complete tab
    #And I should see the STORE ToGo order's check is closed
    And I select order type as "QSR" in phoneorderscreen

#  Scenario Outline:Selecting Delivery order type from combo and placing an order
#    Given I'm logged in
    And I close the order type window
    And I tap QSR button to open the order types combo
    And I select order type as "DELIVERY" in order screen
    And I search for "<customer_name>"
    When I click "<customer_name>" to select customer for the seat
    And I click the Save button
    Then I Should get back to the Order Screen
    And I get check number
    And I select category as "FOOD"
    And I select menu item as "<menu_item>"
    And I should see that "<menu_item>" is added to the check
    When I click Finish button
    Then I should see the Phone Order tab

    And I click the Closed check in new tab window
    And I click edit button in phone order tab
    Then I Should get back to the Order Screen
    And I click Void button on order management screen
    Then I should see the void reason popup
    And I click void Reason on the void popup
    And I click Add Button on the void reason popup
#    Then I should see Receipt Printer popup
#    And I click Done button on the Popup
    And I select order type as "QSR" in phoneorderscreen


  #Scenario Outline: Selecting PHONE TOGO order type from combo and placing an order
    And I close the order type window
    And I tap QSR button to open the order types combo
    And I select order type as "TOGO"
    And I click Add Customer Button
    And I search for "<customer_name>"
    When I click "<customer_name>" to select customer for the seat
#    And I click the Save button
    And I select category as "FOOD"
    And I select menu item as "<menu_item>"
    And I select modifier as "<modifier>"
    And I click Done to get back
    And I should see that "<menu_item>" and "<modifier>" are added to the check
    And I click Order button in the order management screen
    And I click modifier as "<modifier>" on the order screen
    Then I should see Already sent to Kitchen warning pop-up
    And I click Done button on the Popup
    And I click Payment button in the Order Management Screen
    And I select Cash as payment method
    And I click Submit button on the Payment Window
   # Then I should see the print or send receipt
    And I select order type as "QSR" in phoneorderscreen
  #Scenario Outline:Selecting PHONE DELIVERY order type from combo and placing an order
    And I close the order type window
    And I tap QSR button to open the order types combo
    And I select order type as "DELIVERY" in order screen
    And I search for "<customer_name>"
    When I click "<customer_name>" to select customer for the seat
    And I click the Save button
    Then I Should get back to the Order Screen
    And I select category as "FOOD"
    And I select menu item as "<menu_item>"
    And I select modifier as "<modifier>"
    And I click Done to get back
    And I should see that "<menu_item>" and "<modifier>" are added to the check
    And I click Order button in the order management screen
    And I click modifier as "<modifier>" on the order screen
    Then I should see Already sent to Kitchen warning pop-up
    And I click Done button on the Popup
    And I click Void button on order management screen
    Then I should see the void reason popup
    And I click void Reason on the void popup
    And I click Add Button on the void reason popup
#    Then I should see Receipt Printer popup
#    And I click Done button on the Popup
    Then I should see the Phone Order tab
   # And I click QSR tab
    And I click power button
    # And I click the "Power button" in the close the day screen "click Power button"

    Examples:
      | order_type | table_no | menu_item     | modifier |customer_name|
      | DINE IN    | T11      | French Friese | Tomato   |Auto ragav   |
#5

    #6
 # Scenario Outline: Merge scripts For BarTab Layout
  #  Given I'm logged in
   # And I close the order type window
    #And I click All
    #And I click BarTab Layout
    #And I click NewTab from BarTab Layout
    #And I click the Exit to close the preauth window
    #And I click on "Cancel" for closing order screen popup "Click cancel button"
    #And I select category as "FOOD"
    #And I select menu item as "<Menu_Item>"
    #And I select modifier as "<Modifier>"
    #And I click Done to get back
    #And I click Finish Order button
    #And I click NewTab from BarTab Layout
    #And I select category as "FOOD"
    #And I select menu item as "<Menu_Item>"
    #And I select modifier as "<Modifier>"
    #And I click Done to get back
    #And I click Finish Order button
    #And I click Merge button
    #And I click the active check1 from Bartab Layout
    #And I click the active check2 from Bartab Layout
    #And I click already selected Active Check
    #Then I should see Check already added pop-up message
    #And I click Done button on the Popup
    #Then I click Done button to merge checks
    #And I click Done button on the Popup
    #And I click the active check1 from Bartab Layout
    #Then I Should get back to the Order Screen
    #And I click Void button on order management screen
    #Then I should see the void reason popup
    #And I click void Reason on the void popup
    #And I click Add Button on the void reason popup
    #Then I should see Receipt Printer popup
    #And I click Done button on the Popup
    #And I click the "Power button" in the close the day screen "click Power button"

    #Examples:
     # | Menu_Item | Modifier |
     # | Garlic Bread | 4 BBQ |

    #7

  Scenario Outline: Verify whether IPad allow the user to billing option through NMI without selecting customer
    Given I'm logged in
    And I close the order type window
    And I select category as "FOOD"
    And I select menu item as "<Menu_Item>"
    And I select modifier as "<Modifier>"
    And I click Done to get back
    And I click Payment button in the Order Management Screen
#    And I scroll the close the day "Others" "scroll close the day"
#    And I click NMI payment button in the payment window
#    Then I should see No NMI sim cards available for walkin
#    And I click Done button on the Popup
    And I click Exit to return to Order Management Screen
    And I click Void button on order management screen
    Then I should see All orders are voided
    And I click Done button on the Popup
    And I click log off button in order screen

    Examples:
      | Menu_Item | Modifier |
      | Garlic Bread | 4 BBQ |

#8

  Scenario Outline: Service Type changing Table Layout To For Here Screen
    Given I login after I click BarTab button
    And I click the BarTab button from clock in screen
    And I click New Tab in the Bar Tab Screen
    And I click the Exit to close the preauth window
    And I click All
    And I click Table Layout tab
    And I click new check button on the Table layout screen
    And I select table as "<table_no>"
    And I select the number of seats as "<number_of_seats>"
    And I tap Continue to finish selecting the number of seats
    And I click Add Customer Button
    And I search for "<customer_name>"
    When I click "<customer_name>" to select customer for the seat
    Then I should see customer as "<customer>" added on order screen
    And I select category as "FOOD"
    And I select menu item as "<Menu_Item>"
    And I select modifier as "<Modifier>"
    And I click Done to get back
    And I select order type as "<order_type>" method
    And I select order type as "<order_type>"
    Then I should see service type as "<order_type>"
    And I click Cash button for Complete Sale
    And I click Exact button on the cash pop-up
    And I click Enter Button on the cash pop-up
    Then I should see the Phone Order tab
    And I click BarTab Layout
  #Scenario Outline: Service Type changing Bar TaB To For Here Screen
    And I click NewTab from BarTab Layout
    And I click the Exit to close the preauth window
   # And I click on "Cancel" for closing order screen popup "Click cancel button"
    Then I Should get back to the Order Screen
    And I click Add Customer Button
    And I search for "<customer_name>"
    When I click "<customer_name>" to select customer for the seat
    Then I should see customer as "<customer>" added on order screen
    And I select category as "FOOD"
    And I select menu item as "<Menu_Item>"
    And I select modifier as "<Modifier>"
    And I click Done to get back
    And I select order type as "<order_type>" method
    And I select order type as "<order_type>"
    Then I should see service type as "<order_type>"
    And I click Cash button for Complete Sale
    And I click Exact button on the cash pop-up
    And I click Enter Button on the cash pop-up
    Then I should see the Phone Order tab
   # And I click the "Power button" in the close the day screen "click Power button"
    #And I click QSR tab
    And I click power button

    Examples:
      | order_type | table_no | number_of_seats | Menu_Item  | Modifier | customer_name | customer |
      | FORHERE   | T13      |1                | French Friese    | Steak   | Auto ragav | Auto r |

  #9

  Scenario Outline: Service Type changing ToGo To For Here screen
    Given I'm logged in
    And I select the "TOGO" order type popup
    When I click Done button to select the order type
    And I click Add Customer Button
    And I search for "<customer_name>"
    When I click "<customer_name>" to select customer for the seat
    Then I should see customer as "<customer>" added on order screen
    Then I Should get back to the Order Screen
    And I select category as "FOOD"
    And I select menu item as "<Menu_Item>"
    And I select modifier as "<Modifier>"
    And I click Done to get back
    And I select order type as "<order_type>" method
    And I select order type as "<order_type>"
    Then I should see service type as "<order_type>"
    And I click Cash button for Complete Sale
    And I click Exact button on the cash pop-up
    And I click Enter Button on the cash pop-up
    Then I should see the Phone Order tab
    And I select order type as "QSR" in phoneorderscreen
 # Scenario Outline: Service Type changing Phone ToGo To For Here screen
    Then I should see the order type window
    And I closed the order type window
    And I select order type as QSR in order screen
    And I select the Phone To Go Service type
   # When I click Done button to select the order type
    And I click Add Customer Button
    And I search for "<customer_name>"
    When I click "<customer_name>" to select customer for the seat
    Then I should see customer as "<customer>" added on order screen
    Then I Should get back to the Order Screen
    And I select category as "FOOD"
    And I select menu item as "<Menu_Item>"
    And I select modifier as "<Modifier>"
    And I click Done to get back
    And I select order type as "<order_type>" method
    And I select order type as "<order_type>"
    Then I should see service type as "<order_type>"
    And I click Cash button for Complete Sale
    And I click Exact button on the cash pop-up
    And I click Enter Button on the cash pop-up
    Then I should see the Phone Order tab
    And I select order type as "QSR" in phoneorderscreen
 # Scenario Outline: ForHere check with cash payment from phone order  tab screen
    And I close the order type window
    And I tap QSR button to open the order types combo
    And I select order type as "<order_type>"
    And I click Add Customer Button
    And I search for "<customer_name>"
    When I click "<customer_name>" to select customer for the seat
    Then I should see customer as "<customer>" added on order screen
    Then I Should get back to the Order Screen
    And I get check number
    And I select category as "FOOD"
    And I select menu item as "<Menu_Item>"
    And I select modifier as "<Modifier>"
    And I click Done to get back
    And I click Finish button
    Then I should see the Phone Order tab
    And I click the Closed check in new tab window
    And I click Pay Check button
    Then I should see the Payment window
    And I click cash button from the payment method popup
    And I click Submit button on the Payment Window
    Then I should see the Phone Order tab
    And I select order type as "QSR" in phoneorderscreen
  #Scenario Outline: ForHere check with fast cash payment
    And I close the order type window
    And I tap QSR button to open the order types combo
    And I select order type as "<order_type>"
    And I click Add Customer Button
    And I search for "<customer_name>"
    When I click "<customer_name>" to select customer for the seat
    Then I should see customer as "<customer>" added on order screen
    Then I Should get back to the Order Screen
    And I select category as "FOOD"
    And I select menu item as "<Menu_Item>"
    And I select modifier as "<Modifier>"
    And I click Done to get back
    And I click Cash button for Complete Sale
    And I click Exact button on the cash pop-up
    And I click Enter Button on the cash pop-up
    Then I should see the Phone Order tab
    And I select order type as "QSR" in phoneorderscreen
  #Scenario Outline: Verify whether able to edit the Forhere check from phone order tab screen
    And I close the order type window
    And I tap QSR button to open the order types combo
    And I select order type as "<order_type>"
    And I click Add Customer Button
    And I search for "<customer_name>"
    When I click "<customer_name>" to select customer for the seat
    Then I should see customer as "<customer>" added on order screen
    Then I Should get back to the Order Screen
    And I get check number
    And I select category as "FOOD"
    And I select menu item as "<Menu_Item>"
    And I select modifier as "<Modifier>"
    And I click Done to get back
    And I click Finish button
    Then I should see the Phone Order tab
    And I click the Closed check in new tab window
    And I click edit button in phone order tab
    Then I Should get back to the Order Screen
    And I select category as "FOOD"
    And I select menu item as "<Menu_Item1>"
    And I select modifier as "<Modifier1>"
    And I click Done to get back
    And I click Cash button for Complete Sale
    And I click Exact button on the cash pop-up
    And I click Enter Button on the cash pop-up
    Then I should see the Phone Order tab
    And I select order type as "QSR" in phoneorderscreen
  #Scenario Outline: Verify whether FOR Here order menu item able to cancel the order from Phone order screen
    #Given I'm logged in
    And I close the order type window
    And I tap QSR button to open the order types combo
    And I select order type as "<order_type>"
    And I click Add Customer Button
    And I search for "<customer_name>"
    When I click "<customer_name>" to select customer for the seat
    Then I should see customer as "<customer>" added on order screen
    Then I Should get back to the Order Screen
    And I get check number
    And I select category as "FOOD"
    And I select menu item as "<Menu_Item>"
    And I select modifier as "<Modifier>"
    And I click Done to get back
    And I click Finish button
    Then I should see the Phone Order tab
    And I click the Closed check in new tab window
    And I click cancel order button in phone order screen
    Then I should see the void reason popup
    And I click void Reason on the void popup
    And I click Add Button on the void reason popup
#    Then I should see Receipt Printer popup
#    And I click Done button on the Popup
    Then I should see the Phone Order tab
    And I select order type as "QSR" in phoneorderscreen
   # Scenario Outline:Verify whether application print the check order from Phone order screen#Given I'm logged in
   #Given I'm logged in
    And I close the order type window
    And I tap QSR button to open the order types combo
    And I select order type as "<order_type>"
    And I click Add Customer Button
    And I search for "<customer_name>"
    When I click "<customer_name>" to select customer for the seat
    Then I should see customer as "<customer>" added on order screen
    Then I Should get back to the Order Screen
    And I get check number
    And I select category as "FOOD"
    And I select menu item as "<Menu_Item>"
    And I select modifier as "<Modifier>"
    And I click Done to get back
    And I click Finish button
    Then I should see the Phone Order tab
    And I click the Closed check in new tab window
#    And I click Print in phone order tab
#    Then I should see Receipt Printer popup
#    And I click Done button on the Popup
    And I click out tab in phone order screen
    And I click BarTab Layout
    And I click phone order tab
    And I click the Closed check in new tab window
    And I click cancel order button in phone order screen
    Then I should see the void reason popup
    And I click void Reason on the void popup
    And I click Add Button on the void reason popup
#    Then I should see Receipt Printer popup
#    And I click Done button on the Popup
    Then I should see the Phone Order tab
    And I select order type as "QSR" in phoneorderscreen
  #Scenario Outline: Verify whether application allow the user to filter the check by click For Here from Phone order check status screen
    And I close the order type window
    And I tap QSR button to open the order types combo
    And I select order type as "<order_type>"
    And I click Add Customer Button
    And I search for "<customer_name>"
    When I click "<customer_name>" to select customer for the seat
    Then I should see customer as "<customer>" added on order screen
    Then I Should get back to the Order Screen
    And I get check number
    And I select category as "FOOD"
    And I select menu item as "<Menu_Item>"
    And I select modifier as "<Modifier>"
    And I click Done to get back
    And I click Finish button
    Then I should see the Phone Order tab
#    And I click for here button in phone order tab
    And I click the Closed check in new tab window
    And I click cancel order button in phone order screen
    Then I should see the void reason popup
    And I click void Reason on the void popup
    And I click Add Button on the void reason popup
#    Then I should see Receipt Printer popup
#    And I click Done button on the Popup
    Then I should see the Phone Order tab
    And I select order type as "QSR" in phoneorderscreen
  #Scenario Outline: ToGo check with cash payment from phone order  tab screen
    And I closed the order type window
    And I select order type as QSR in order screen
    And I select order type as "PHONE TOGO"
    #When I click Done button to select the order type
    And I click Add Customer Button
    And I search for "<customer_name>"
    When I click "<customer_name>" to select customer for the seat
    Then I should see customer as "<customer>" added on order screen
    Then I Should get back to the Order Screen
    And I get check number
    And I select category as "FOOD"
    And I select menu item as "<Menu_Item>"
    And I select modifier as "<Modifier>"
    And I click Done to get back
    And I click Finish button
    Then I should see the Phone Order tab
    And I click the Closed check in new tab window
    And I click Pay Check button
    Then I should see the Payment window
    And I click cash button from the payment method popup
    And I click Submit button on the Payment Window
    Then I should see the Phone Order tab
    And I select order type as "QSR" in phoneorderscreen
  #Scenario Outline:  ToGo check with fast cash payment
    And I closed the order type window
    And I select order type as QSR in order screen
    And I select order type as "PHONE TOGO"
   # When I click Done button to select the order type
    And I click Add Customer Button
    And I search for "<customer_name>"
    When I click "<customer_name>" to select customer for the seat
    Then I should see customer as "<customer>" added on order screen
    Then I Should get back to the Order Screen
    And I get check number
    And I select category as "FOOD"
    And I select menu item as "<Menu_Item>"
    And I select modifier as "<Modifier>"
    And I click Done to get back
    And I click Cash button for Complete Sale
    And I click Exact button on the cash pop-up
    And I click Enter Button on the cash pop-up
    Then I should see the Phone Order tab
    And I select order type as "QSR" in phoneorderscreen
    And I closed the order type window
    And I select order type as QSR in order screen
  #Scenario Outline: Verify whether able to edit the ToGo check from phone order tab screen
    And I select the TOGO order type
  #  When I click Done button to select the order type
    And I click Add Customer Button
    And I search for "<customer_name>"
    When I click "<customer_name>" to select customer for the seat
    Then I should see customer as "<customer>" added on order screen
    Then I Should get back to the Order Screen
    And I get check number
    And I select category as "FOOD"
    And I select menu item as "<Menu_Item>"
    And I select modifier as "<Modifier>"
    And I click Done to get back
    And I click Finish button
    Then I should see the Phone Order tab
    And I click the Closed check in new tab window
    And I click edit button in phone order tab
    Then I Should get back to the Order Screen
    Then I should see Tick mark in the Menu item
    And I select category as "FOOD"
    And I select menu item as "Onion Rings"
    And I click Void button on order management screen
    Then I should see the void reason popup
    And I click void Reason on the void popup
    And I click Add Button on the void reason popup
#    Then I should see Receipt Printer popup
#    And I click Done button on the Popup
    Then I should see the Phone Order tab
    And I select order type as "QSR" in phoneorderscreen
    And I closed the order type window
    And I select order type as QSR in order screen
  #Scenario Outline: Verify whether able to cancel the order from Phone order screen
    And I select the TOGO order type
    #When I click Done button to select the order type
    And I click Add Customer Button
    And I search for "<customer_name>"
    When I click "<customer_name>" to select customer for the seat
    Then I should see customer as "<customer>" added on order screen
    Then I Should get back to the Order Screen
    And I get check number
    And I select category as "FOOD"
    And I select menu item as "<Menu_Item>"
    And I select modifier as "<Modifier>"
    And I click Done to get back
    And I click Finish button
    Then I should see the Phone Order tab
    And I click the Closed check in new tab window
    And I click cancel order button in phone order screen
    Then I should see the void reason popup
    And I click void Reason on the void popup
    And I click Add Button on the void reason popup
#    Then I should see Receipt Printer popup
#    And I click Done button on the Popup
    Then I should see the Phone Order tab
   # And I click QSR tab
    And I click power button
    #And I click the "Power button" in the close the day screen "click Power button"
    Examples:
      | order_type  | Menu_Item | Modifier | customer_name | customer | Menu_Item1 | Modifier1 |
      | FORHERE  | Garlic Bread | 4 BBQ | Auto ragav      | Auto r   |French Friese | Steak   |

  #10
  @Ordertype0123
  Scenario Outline:Verify whether application TOGO menu items print the check order from Phone order screen
    Given I'm logged in
    And I select the "TOGO" order type popup
    When I click Done button to select the order type
    And I click Add Customer Button
    And I search for "<customer_name>"
    When I click "<customer_name>" to select customer for the seat
    Then I should see customer as "<customer>" added on order screen
    Then I Should get back to the Order Screen
    And I get check number
    And I select category as "FOOD"
    And I select menu item as "<Menu_Item>"
    And I select modifier as "<Modifier>"
    And I click Done to get back
    And I click Finish button
    Then I should see the Phone Order tab
    And I click the Closed check in new tab window
#    And I click Print in phone order tab
#    Then I should see Receipt Printer popup
#    And I click Done button on the Popup
    And I click out tab in phone order screen
    And I click BarTab Layout
    And I click phone order tab
    And I click the Closed check in new tab window
    And I click cancel order button in phone order screen
    Then I should see the void reason popup
    And I click void Reason on the void popup
    And I click Add Button on the void reason popup
#    Then I should see Receipt Printer popup
#    And I click Done button on the Popup
    And I click QSR tab
  #And I click log off button in order screen
#Scenario Outline: Verify whether application allow the user to filter the check by click ToGo from Phone order check status screen
 # Given I'm logged in
    And I select the "TOGO" order type popup
    When I click Done button to select the order type
    And I click Add Customer Button
    And I search for "<customer_name>"
    When I click "<customer_name>" to select customer for the seat
    Then I should see customer as "<customer>" added on order screen
    Then I Should get back to the Order Screen
    And I get check number
    And I select category as "FOOD"
    And I select menu item as "<Menu_Item>"
    And I select modifier as "<Modifier>"
    And I click Done to get back
    And I click Finish button
    Then I should see the Phone Order tab
#    And I click TOGO button in phone order tab
    And I click the Closed check in new tab window
    And I click cancel order button in phone order screen
    Then I should see the void reason popup
    And I click void Reason on the void popup
    And I click Add Button on the void reason popup
#    Then I should see Receipt Printer popup
#    And I click Done button on the Popup
    Then I should see the Phone Order tab
    And I select order type as "QSR" in phoneorderscreen
  #Scenario Outline: Verify whether application display warning popup message if user select off line driver
    #Given I'm logged in
    And I select the DELIVERY order type
    When I click Done button to select the order type
    And I search for "<customer_name>"
    When I click "<customer_name>" to select customer for the seat
    And I click the Save button
    Then I Should get back to the Order Screen
    Then I should see customer as "<customer>" added on order screen
    Then I should see Delivery charge added to orderscreen
    Then I should see subtotal should not change when added delivery charge
    And I get check number
    And I select category as "FOOD"
    And I select menu item as "<Menu_Item>"
    And I select modifier as "<Modifier>"
    And I click Done to get back
    And I click Finish button
    Then I should see the Phone Order tab
    And I click the Closed check in new tab window
    And I click active driver as "<Driver>"
    And I click No button on is offline popup
    And I click out tab in phone order screen
    And I click BarTab Layout
    And I click phone order tab
    And I click the Closed check in new tab window
    And I click cancel order button in phone order screen
    Then I should see the void reason popup
    And I click void Reason on the void popup
    And I click Add Button on the void reason popup
#    Then I should see Receipt Printer popup
#    And I click Done button on the Popup
    Then I should see the Phone Order tab
    And I select order type as "QSR" in phoneorderscreen
  #Scenario Outline: Verify whether application automatically add delivery charge in order screen and total amount
    And I select the DELIVERY order type
    When I click Done button to select the order type
    And I search for "<customer_name>"
    When I click "<customer_name>" to select customer for the seat
    And I click the Save button
    Then I Should get back to the Order Screen
    Then I should see customer as "<customer>" added on order screen
    Then I should see Delivery charge added to orderscreen
    Then I should see subtotal should not change when added delivery charge
    And I get check number
    And I select category as "FOOD"
    And I select menu item as "<Menu_Item>"
    And I select modifier as "<Modifier>"
    And I click Done to get back
    And I click Finish button
    Then I should see the Phone Order tab
    And I click the Closed check in new tab window
    And I click cancel order button in phone order screen
    Then I should see the void reason popup
    And I click void Reason on the void popup
    And I click Add Button on the void reason popup
#    Then I should see Receipt Printer popup
#    And I click Done button on the Popup
    Then I should see the Phone Order tab
    And I select order type as "QSR" in phoneorderscreen

#  Scenario Outline: Verify whether application allow the user to Delivery check with fast cash payment
#    Given I'm logged in
    And I select the DELIVERY order type
    When I click Done button to select the order type
    And I search for "<customer_name>"
    When I click "<customer_name>" to select customer for the seat
    And I click the Save button
    Then I Should get back to the Order Screen
    Then I should see customer as "<customer>" added on order screen
    Then I should see Delivery charge added to orderscreen
    Then I should see subtotal should not change when added delivery charge
    And I get check number
    And I select category as "FOOD"
    And I select menu item as "<Menu_Item>"
    And I select modifier as "<Modifier>"
    And I click Done to get back
    Then I should see cash button is enable or not
    And I click Finish button
    Then I should see the Phone Order tab
    And I click the Closed check in new tab window
    And I click Pay Check button
    Then I should see the Payment window
    And I click cash button from the payment method popup
    And I click Exit to return to Order Management Screen
    And I click Void button on order management screen
    Then I should see payment made on this check popup message for Phone order
    And I click Done button on the Popup
    And I click payment in the payment window
    And I click Delete button on the payment window
#    And I click Ok button in receipt printer popup
    And I click Exit to return to Order Management Screen
    And I click Void button on order management screen
    Then I should see the void reason popup
    And I click void Reason on the void popup
    And I click Add Button on the void reason popup
#    Then I should see Receipt Printer popup
#    And I click Done button on the Popup
    Then I should see the Phone Order tab
    And I select order type as "QSR" in phoneorderscreen
  #Scenario Outline: Verify whether application allow the user to pay check from phone order check status screen
    And I select the DELIVERY order type
    When I click Done button to select the order type
    And I search for "<customer_name>"
    When I click "<customer_name>" to select customer for the seat
    And I click the Save button
    Then I Should get back to the Order Screen
    Then I should see customer as "<customer>" added on order screen
    Then I should see Delivery charge added to orderscreen
    Then I should see subtotal should not change when added delivery charge
    And I get check number
    And I select category as "FOOD"
    And I select menu item as "<Menu_Item>"
    And I select modifier as "<Modifier>"
    And I click Done to get back
    And I click Finish button
    Then I should see the Phone Order tab
    And I click the Closed check in new tab window
    And I click Pay Check button
    Then I should see the Payment window
    And I click cash button from the payment method popup
    And I click Exit to return to Order Management Screen
    And I click Void button on order management screen
    Then I should see payment made on this check popup message for Phone order
    And I click Done button on the Popup
    And I click payment in the payment window
    And I click Delete button on the payment window
    And I click Ok button in receipt printer popup
    And I click Exit to return to Order Management Screen
    And I click Void button on order management screen
    Then I should see the void reason popup
    And I click void Reason on the void popup
    And I click Add Button on the void reason popup
#    Then I should see Receipt Printer popup
#    And I click Done button on the Popup
    Then I should see the Phone Order tab
    And I select order type as "QSR" in phoneorderscreen
 # Scenario Outline: Verify whether application allow the user to close the check after payment without departure and arrival
    #Given I'm logged in
    And I select the DELIVERY order type
    When I click Done button to select the order type
    And I search for "<customer_name>"
    When I click "<customer_name>" to select customer for the seat
    And I click the Save button
    Then I Should get back to the Order Screen
    Then I should see customer as "<customer>" added on order screen
    Then I should see Delivery charge added to orderscreen
    Then I should see subtotal should not change when added delivery charge
    And I get check number
    And I select category as "FOOD"
    And I select menu item as "<Menu_Item>"
    And I select modifier as "<Modifier>"
    And I click Done to get back
    And I click Finish button
    Then I should see the Phone Order tab
    And I click the Closed check in new tab window
    #And I click "<Back>" button in the keyboard "Click Back button"
    And I click Pay Check button
    Then I should see the Payment window
    And I click cash button from the payment method popup
    And I click Submit button on the Payment Window
    Then I should see delivery orders cannot submitted here warning message
    And I click Done button on the Popup
    And I click Exit to return to Order Management Screen
    And I click Void button on order management screen
    Then I should see payment made on this check popup message for Phone order
    And I click Done button on the Popup
    And I click payment in the payment window
    And I click Delete button on the payment window
    And I click Ok button in receipt printer popup
    And I click Exit to return to Order Management Screen
    And I click Void button on order management screen
    Then I should see the void reason popup
    And I click void Reason on the void popup
    And I click Add Button on the void reason popup
#    Then I should see Receipt Printer popup
#    And I click Done button on the Popup
    Then I should see the Phone Order tab
    And I select order type as "QSR" in phoneorderscreen
  #Scenario Outline: Verify whether able to edit the Delivery check from phone order tab screen
   # Given I'm logged in
    And I select the DELIVERY order type
    When I click Done button to select the order type
    And I search for "<customer_name>"
    When I click "<customer_name>" to select customer for the seat
    And I click the Save button
    Then I Should get back to the Order Screen
    Then I should see customer as "<customer>" added on order screen
    Then I should see Delivery charge added to orderscreen
    Then I should see subtotal should not change when added delivery charge
    And I get check number
    And I select category as "FOOD"
    And I select menu item as "<Menu_Item>"
    And I select modifier as "<Modifier>"
    And I click Done to get back
    And I click Finish button
    Then I should see the Phone Order tab
    And I click the Closed check in new tab window
    And I click edit button in phone order tab
    Then I Should get back to the Order Screen
    And I select category as "FOOD"
    And I select menu item as "Onion Rings"
    And I click Void button on order management screen
    Then I should see the void reason popup
    And I click void Reason on the void popup
    And I click Add Button on the void reason popup
#    Then I should see Receipt Printer popup
#    And I click Done button on the Popup
    Then I should see the Phone Order tab
    And I select order type as "QSR" in phoneorderscreen
  #Scenario Outline: Verify whether able Delivery order type to cancel the order from Phone order screen
    And I select the DELIVERY order type
    When I click Done button to select the order type
    And I search for "<customer_name>"
    When I click "<customer_name>" to select customer for the seat
    And I click the Save button
    Then I Should get back to the Order Screen
    Then I should see customer as "<customer>" added on order screen
    Then I should see Delivery charge added to orderscreen
    Then I should see subtotal should not change when added delivery charge
    And I get check number
    And I select category as "FOOD"
    And I select menu item as "<Menu_Item>"
    And I select modifier as "<Modifier>"
    And I click Done to get back
    And I click Finish button
    Then I should see the Phone Order tab
    And I click the Closed check in new tab window
    And I click cancel order button in phone order screen
    Then I should see the void reason popup
    And I click void Reason on the void popup
    And I click Add Button on the void reason popup
#    Then I should see Receipt Printer popup
#    And I click Done button on the Popup
    Then I should see the Phone Order tab
    And I select order type as "QSR" in phoneorderscreen
  #Scenario Outline: Verify whether application allow the user to select driver for the check
    And I select the DELIVERY order type
    When I click Done button to select the order type
    And I search for "<customer_name>"
    When I click "<customer_name>" to select customer for the seat
    And I click the Save button
    Then I Should get back to the Order Screen
    Then I should see customer as "<customer>" added on order screen
    Then I should see Delivery charge added to orderscreen
    Then I should see subtotal should not change when added delivery charge
    And I get check number
    And I select category as "FOOD"
    And I select menu item as "<Menu_Item>"
    And I select modifier as "<Modifier>"
    And I click Done to get back
    And I click Finish button
    Then I should see the Phone Order tab
    And I click the Closed check in new tab window
    And I click active driver as "<Driver>"
    Then I should see driver is offline popup
    And I click Yes button on driver is offline popup
    And I click out tab in phone order screen
    And I click BarTab Layout
    And I click phone order tab
    And I click the Closed check in new tab window
    And I click cancel order button in phone order screen
    Then I should see the void reason popup
    And I click void Reason on the void popup
    And I click Add Button on the void reason popup
#    Then I should see Receipt Printer popup
#    And I click Done button on the Popup
    Then I should see the Phone Order tab
    And I select order type as "QSR" in phoneorderscreen
  #Scenario Outline: Verify whether application displaying the selected driver name for corresponding check
    And I select the DELIVERY order type
    When I click Done button to select the order type
    And I search for "<customer_name>"
    When I click "<customer_name>" to select customer for the seat
    And I click the Save button
    Then I Should get back to the Order Screen
    Then I should see customer as "<customer>" added on order screen
    Then I should see Delivery charge added to orderscreen
    Then I should see subtotal should not change when added delivery charge
    And I get check number
    And I select category as "FOOD"
    And I select menu item as "<Menu_Item>"
    And I select modifier as "<Modifier>"
    And I click Done to get back
    And I click Finish button
    Then I should see the Phone Order tab
    And I click the Closed check in new tab window
    And I click active driver as "<Driver>"
    Then I should see driver is offline popup
    And I click Yes button on driver is offline popup
    And I click active driver as "<Driver>" in the Phone Order Screen
    And I click out tab in phone order screen
    And I click BarTab Layout
    And I click phone order tab
    And I click the Closed check in new tab window
    And I click cancel order button in phone order screen
    Then I should see the void reason popup
    And I click void Reason on the void popup
    And I click Add Button on the void reason popup
#    Then I should see Receipt Printer popup
#    And I click Done button on the Popup
    Then I should see the Phone Order tab
    And I select order type as "QSR" in phoneorderscreen
  #Scenario Outline: Verify whether application allow the user to departure the check by selecting driver and departure
    And I select the DELIVERY order type
    When I click Done button to select the order type
    And I search for "<customer_name>"
    When I click "<customer_name>" to select customer for the seat
    And I click the Save button
    Then I Should get back to the Order Screen
    Then I should see customer as "<customer>" added on order screen
    Then I should see Delivery charge added to orderscreen
    Then I should see subtotal should not change when added delivery charge
    And I get check number
    And I select category as "FOOD"
    And I select menu item as "<Menu_Item>"
    And I select modifier as "<Modifier>"
    And I click Done to get back
    And I click Finish button
    Then I should see the Phone Order tab
    And I click the Closed check in new tab window
    And I click active driver as "<Driver>"
    Then I should see driver is offline popup
    And I click Yes button on driver is offline popup
    And I click active driver as "<Driver>" in the Phone Order Screen
    And I click departure button
    And I click out tab in phone order screen
    And I click the Closed check in out tab
    And I click Arrival button in phone order screen
    And I click Exact button on the cash pop-up
    And I click Enter Button on the cash pop-up
    Then I should see the Phone Order tab
    And I select order type as "QSR" in phoneorderscreen
    And I select the DELIVERY order type
    When I click Done button to select the order type
    And I search for "<customer_name>"
    When I click "<customer_name>" to select customer for the seat
    And I click the Save button
    Then I Should get back to the Order Screen
    Then I should see customer as "<customer>" added on order screen
    Then I should see Delivery charge added to orderscreen
    Then I should see subtotal should not change when added delivery charge
    And I get check number
    And I select category as "FOOD"
    And I select menu item as "<Menu_Item>"
    And I select modifier as "<Modifier>"
    And I click Done to get back
    And I click Finish button
    Then I should see the Phone Order tab
    And I click the Closed check in new tab window
    And I click active driver as "<Driver>"
    Then I should see driver is offline popup
    And I click Yes button on driver is offline popup
    And I click active driver as "<Driver>" in the Phone Order Screen
    And I click departure button
    And I click out tab in phone order screen
    And I click the Closed check in new tab window
    And I click Arrival button in phone order screen
    And I click Exact button on the cash pop-up
    And I click Enter Button on the cash pop-up
    Then I should see the Phone Order tab
    And I select order type as "QSR" in phoneorderscreen
  #Scenario Outline:  Verify whether application allow the user to select driver for the check in out tab
  # Given I'm logged in
    And I select the DELIVERY order type
    When I click Done button to select the order type
    And I search for "<customer_name>"
    When I click "<customer_name>" to select customer for the seat
    And I click the Save button
    Then I Should get back to the Order Screen
    Then I should see customer as "<customer>" added on order screen
    Then I should see Delivery charge added to orderscreen
    Then I should see subtotal should not change when added delivery charge
    And I get check number
    And I select category as "FOOD"
    And I select menu item as "<Menu_Item>"
    And I select modifier as "<Modifier>"
    And I click Done to get back
    And I click Finish button
    Then I should see the Phone Order tab
    And I click the Closed check in new tab window
    And I click active driver as "<Driver>"
    Then I should see driver is offline popup
    And I click Yes button on driver is offline popup
    And I click active driver as "<Driver>" in the Phone Order Screen
    And I click departure button
    And I click out tab in phone order screen
    And I click the Closed check in out tab
#    And I click active driver as "<Driver1>"
#    Then I should see driver is offline popup
#    And I click Yes button on driver is offline popup
#    Then I should see driver as "<driver1>" is added
    And I click phone order tab

    And I click out tab in phone order screen
    And I click the Closed check in out tab
    And I click Arrival button in phone order screen
    And I click Exact button on the cash pop-up
    And I click Enter Button on the cash pop-up
    Then I should see the Phone Order tab
    And I select order type as "QSR" in phoneorderscreen
  #Scenario Outline: Verify whether application displaying the selected driver name for corresponding check in out tab
    And I select the DELIVERY order type
    When I click Done button to select the order type
    And I search for "<customer_name>"
    When I click "<customer_name>" to select customer for the seat
    And I click the Save button
    Then I Should get back to the Order Screen
    Then I should see customer as "<customer>" added on order screen
    Then I should see Delivery charge added to orderscreen
    Then I should see subtotal should not change when added delivery charge
    And I get check number
    And I select category as "FOOD"
    And I select menu item as "<Menu_Item>"
    And I select modifier as "<Modifier>"
    And I click Done to get back
    And I click Finish button
    Then I should see the Phone Order tab
    And I click the Closed check in new tab window
    And I click active driver as "<Driver>"
    Then I should see driver is offline popup
    And I click Yes button on driver is offline popup
    And I click active driver as "<Driver>" in the Phone Order Screen
    And I click departure button
    And I click out tab in phone order screen
    And I click the Closed check in out tab
#    And I click active driver as "<Driver1>"
#    Then I should see driver is offline popup
#    And I click Yes button on driver is offline popup
#    Then I should see driver as "<driver1>" is added
    And I click phone order tab
    And I click out tab in phone order screen
    And I click the Closed check in out tab
    And I click Arrival button in phone order screen
    And I click Exact button on the cash pop-up
    And I click Enter Button on the cash pop-up
    Then I should see the Phone Order tab
    And I select order type as "QSR" in phoneorderscreen
  #Scenario Outline: Verify whether application allow the user to arrival the check by selecting check and clicking arrival button
    And I select the DELIVERY order type
    When I click Done button to select the order type
    And I search for "<customer_name>"
    When I click "<customer_name>" to select customer for the seat
    And I click the Save button
    Then I Should get back to the Order Screen
    Then I should see customer as "<customer>" added on order screen
    Then I should see Delivery charge added to orderscreen
    Then I should see subtotal should not change when added delivery charge
    And I get check number
    And I select category as "FOOD"
    And I select menu item as "<Menu_Item>"
    And I select modifier as "<Modifier>"
    And I click Done to get back
    And I click Finish button
    Then I should see the Phone Order tab
    And I click the Closed check in new tab window
    And I click active driver as "<Driver>"
    Then I should see driver is offline popup
    And I click Yes button on driver is offline popup
    And I click active driver as "<Driver>" in the Phone Order Screen
    And I click departure button
    And I click out tab in phone order screen
    And I click the Closed check in out tab
#    And I click active driver as "<Driver1>"
#    Then I should see driver is offline popup
#    And I click Yes button on driver is offline popup
#    Then I should see driver as "<driver1>" is added
    And I click phone order tab
    And I click out tab in phone order screen
    And I click the Closed check in new tab window
    And I click Arrival button in phone order screen
    And I click Exact button on the cash pop-up
    And I click Enter Button on the cash pop-up
    Then I should see the Phone Order tab
   # And I click QSR tab
    And I click power button
    #And I click the "Power button" in the close the day screen "click Power button"
    Examples:
      | order_type  | Menu_Item    | Modifier | customer_name   | customer | Driver | driver  | Driver1 | driver1|
      | Store To Go | Garlic Bread | 4 BBQ    | Auto ragav      | Auto r   |auto l  |  auto   |Auto D   |Auto    |

    #11
#
#  Scenario Outline: Verify whether application move the check to complete tab after successfully arrived
#    Given I'm logged in
#    And I select the DELIVERY order type
#    When I click Done button to select the order type
#    And I search for "<customer_name>"
#    When I click "<customer_name>" to select customer for the seat
#    And I click the Save button
#    Then I Should get back to the Order Screen
#    Then I should see customer as "<customer>" added on order screen
#    Then I should see Delivery charge added to orderscreen
#    Then I should see subtotal should not change when added delivery charge
#    And I get check number
#    And I select category as "FOOD"
#    And I select menu item as "<Menu_Item>"
#    And I select modifier as "<Modifier>"
#    And I click Done to get back
#    And I click Finish button
#    Then I should see the Phone Order tab
#    And I click the Closed check in new tab window
#    And I click active driver as "<Driver>"
#    Then I should see driver is offline popup
#    And I click Yes button on driver is offline popup
#    And I click active driver as "<Driver>" in the Phone Order Screen
#    And I click departure button
#    And I click out tab in phone order screen
#    And I click the Closed check in out tab
##    And I click active driver as "<Driver1>"
##    Then I should see driver is offline popup
##    And I click Yes button on driver is offline popup
##    Then I should see driver as "<driver1>" is added
#    And I click BarTab Layout
#    And I click phone order tab
#    And I click out tab in phone order screen
#    And I click the Closed check in out tab
#    And I click Arrival button in phone order screen
#    And I click Exact button on the cash pop-up
#    And I click Enter Button on the cash pop-up
#    Then I should see the Phone Order tab
#    And I click Complete tab
#    And I click out tab in phone order screen
#    And I click Complete tab
#    Then I should see closed check in complete tab
#    And I select order type as "QSR" in phoneorderscreen
#  #Scenario Outline: Normal check with Other payments
#    And I select the DELIVERY order type
#    When I click Done button to select the order type
#    And I search for "<customer_name>"
#    When I click "<customer_name>" to select customer for the seat
#    And I click the Save button
#    Then I Should get back to the Order Screen
#    Then I should see customer as "<customer>" added on order screen
#    Then I should see Delivery charge added to orderscreen
#    Then I should see subtotal should not change when added delivery charge
#    And I get check number
#    And I select category as "FOOD"
#    And I select menu item as "<Menu_Item>"
#    And I select modifier as "<Modifier>"
#    And I click Done to get back
#    And I click Payment button in the Order Management Screen
#    And I click other button from the payment method popup
#    And I click the Exit button in the payment window
#    And I click Finish button
#    Then I should see the Phone Order tab
#    And I click the Closed check in new tab window
#    And I click active driver as "<Driver>"
#    Then I should see driver is offline popup
#    And I click Yes button on driver is offline popup
#    And I click active driver as "<Driver>" in the Phone Order Screen
#    And I click departure button
#    And I click out tab in phone order screen
#    And I click the Closed check in out tab
##    And I click active driver as "<Driver1>"
##    Then I should see driver is offline popup
##    And I click Yes button on driver is offline popup
##    Then I should see driver as "<driver1>" is added
#    And I click BarTab Layout
#    And I click phone order tab
#    And I click out tab in phone order screen
#    And I click the Closed check in out tab
#    And I click Arrival button in phone order screen
#    Then I should see the Phone Order tab
#    And I select order type as "QSR" in phoneorderscreen
#  #Scenario Outline: Verify whether application allow the user to create check delivery time with later from current Ipad time
#    And I select the DELIVERY order type
#    And I click Later check box
#    And I click done button in the order type window
#    When I click Done button to select the order type
#    And I search for "<customer_name>"
#    When I click "<customer_name>" to select customer for the seat
#    And I click the Save button
#    Then I Should get back to the Order Screen
#    Then I should see customer as "<customer>" added on order screen
#    Then I should see Delivery charge added to orderscreen
#    Then I should see subtotal should not change when added delivery charge
#    And I get check number
#    And I select category as "FOOD"
#    And I select menu item as "<Menu_Item>"
#    And I select modifier as "<Modifier>"
#    And I click Done to get back
#    And I click Finish button
#    Then I should see the Phone Order tab
#    And I click future tab
#    And I click the Closed check in new tab window
#    And I click cancel order button in phone order screen
##    And I click Finish button
#    Then I should see the Phone Order tab
#    #And I click the "Power button" in the close the day screen "click Power button"
#   # And I click QSR tab
#    And I click power button in the All Orders screen
#
#    Examples:
#      | customer_name |customer | order_type    | Menu_Item    | Modifier | Driver | driver | Driver1 | driver1 |
#      | Auto ragav    | Auto r  |Store Delivery | Garlic Bread | 4 BBQ    | auto l | auto   | Auto D  | Auto    |
#
##12
#  @PaymentOO123
#  Scenario Outline: Verify whether application allow edit the future order check
#    Given I'm logged in
#    And I select the DELIVERY order type
#    And I click Later check box
#    And I click done button in the order type window
#    When I click Done button to select the order type
#    And I search for "<customer_name>"
#    When I click "<customer_name>" to select customer for the seat
#    And I click the Save button
#    Then I Should get back to the Order Screen
#    Then I should see customer as "<customer>" added on order screen
#    Then I should see Delivery charge added to orderscreen
#    Then I should see subtotal should not change when added delivery charge
#    And I get check number
#    And I select category as "FOOD"
#    And I select menu item as "<Menu_Item>"
#    And I select modifier as "<Modifier>"
#    And I click Done to get back
#    And I click Finish button
#    Then I should see the Phone Order tab
#    And I click future tab
#    And I click the Closed check in future tab
#    And I click edit button in phone order tab
#    Then I Should get back to the Order Screen
#    And I select category as "FOOD"
#    And I select menu item as "<Menu_Item1>"
#    And I click Finish button
#    Then I should see the Phone Order tab
#    And I click future tab
#    And I click the Closed check in future tab
#    And I click cancel order button in phone order screen
#    Then I should see the Phone Order tab
#    And I select order type as "QSR" in phoneorderscreen
#  #Scenario Outline: Verify whether application allow to cancel the future order check without payment
#    And I select the DELIVERY order type
#    And I click Later check box
#    And I click done button in the order type window
#    When I click Done button to select the order type
#    And I search for "<customer_name>"
#    When I click "<customer_name>" to select customer for the seat
#    And I click the Save button
#    Then I Should get back to the Order Screen
#    Then I should see customer as "<customer>" added on order screen
#    Then I should see Delivery charge added to orderscreen
#    Then I should see subtotal should not change when added delivery charge
#    And I get check number
#    And I select category as "FOOD"
#    And I select menu item as "<Menu_Item>"
#    And I select modifier as "<Modifier>"
#    And I click Done to get back
#    And I click Finish button
#    Then I should see the Phone Order tab
#    And I click future tab
#    And I click the Closed check in future tab
#    And I click cancel order button in phone order screen
#    Then I should see the Phone Order tab
#    And I select order type as "QSR" in phoneorderscreen
#  #Scenario Outline:  Verify whether application allow to cancel the future order check with payment
#   # Given I'm logged in
#   # And I select the DELIVERY order type
#   # And I click Later check box
#   # And I click done button in the order type window
#   # When I click Done button to select the order type
#   # Then I should see the customer profile window
#   # And I select search
#   # And I click the customer name on the order screen
#   # And I select the customer
#   # And I click the Save button
#   # Then I Should get back to the Order Screen
#   # Then I should see customer as "<customer>" added on order screen
#   # Then I should see Delivery charge added to orderscreen
#   # Then I should see subtotal should not change when added delivery charge
#   # And I get check number
#   # And I select category as "FOOD"
#   # And I select menu item as "<Menu_Item>"
#   # And I select modifier as "<Modifier>"
#   # And I click Done to get back
#   # And I click Payment button in the Order Management Screen
#   # Then I should see the Payment window
#   # And I click cash button from the payment method popup
#   # Then I should see cash payment is added in payment window
#   # And I click the Exit button in the payment window
#   # Then I Should get back to the Order Screen
#    #And I click Finish button
#    #Then I should see the Phone Order tab
#    #And I click future tab
#    #And I click the Closed check in future tab
#    #And I click cancel order button in phone order screen
#    #Then I should see payment made on this check popup message for Phone order
#    #And I click Done button on the Popup
#    #And I click payment in the payment window
#    #And I click Delete button on the payment window
#    #And I click Ok button in receipt printer popup
#    #And I click the Exit button in the payment window
#    #Then I Should get back to the Order Screen
#    #And I click Finish button
#    #Then I should see the Phone Order tab
#    #And I click future tab
#    #And I click the Closed check in future tab
#    #And I click cancel order button in phone order screen
#    #Then I should see the Phone Order tab
#    #And I select order type as "QSR"
#
# # Scenario Outline: Verify whether application allow the user to print future order check
#  #  Given I'm logged in
#    And I select the DELIVERY order type
#    And I click Later check box
#    And I click done button in the order type window
#    When I click Done button to select the order type
#    And I search for "<customer_name>"
#    When I click "<customer_name>" to select customer for the seat
#    And I click the Save button
#    Then I Should get back to the Order Screen
#    Then I should see customer as "<customer>" added on order screen
#    Then I should see Delivery charge added to orderscreen
#    Then I should see subtotal should not change when added delivery charge
#    And I get check number
#    And I select category as "FOOD"
#    And I select menu item as "<Menu_Item>"
#    And I select modifier as "<Modifier>"
#    And I click Done to get back
#    And I click Finish button
#    Then I should see the Phone Order tab
#    And I click future tab
#    And I click the Closed check in future tab
##    And I click Print in phone order tab
##    Then I should see Receipt Printer popup
##    And I click Done button on the Popup
#    And I click phone order tab
#    And I click future tab
#    And I click the Closed check in future tab
#    And I click cancel order button in phone order screen
#    Then I should see the Phone Order tab
#    And I select order type as "QSR" in phoneorderscreen
#  #Scenario Outline: Verify whether application allow to Pay the future order check
#    And I select the DELIVERY order type
#    And I click Later check box
#    And I click done button in the order type window
#    When I click Done button to select the order type
#    And I search for "<customer_name>"
#    When I click "<customer_name>" to select customer for the seat
#    And I click the Save button
#    Then I Should get back to the Order Screen
#    Then I should see customer as "<customer>" added on order screen
#    Then I should see Delivery charge added to orderscreen
#    Then I should see subtotal should not change when added delivery charge
#    And I get check number
#    And I select category as "FOOD"
#    And I select menu item as "<Menu_Item>"
#    And I select modifier as "<Modifier>"
#    And I click Done to get back
#    And I click Finish button
#    Then I should see the Phone Order tab
#    And I click future tab
#    And I click the Closed check in future tab
#    And I click Pay Check button
#    Then I should see the Payment window
#    And I click cash button from the payment method popup
#    And I click the Exit button in the payment window
#    Then I Should get back to the Order Screen
#    And I click Finish button
#    Then I should see the Phone Order tab
#    And I click future tab
#    And I click the Closed check in future tab
#    And I click cancel order button in phone order screen
#    Then I should see payment made on this check popup message for Phone order
#    And I click Done button on the Popup
#    And I click payment in the payment window
#    And I click Delete button on the payment window
##    And I click Ok button in receipt printer popup
#    And I click the Exit button in the payment window
#    Then I Should get back to the Order Screen
#    And I click Finish button
#    Then I should see the Phone Order tab
#    And I click future tab
#    And I click the Closed check in future tab
#    And I click cancel order button in phone order screen
#    Then I should see the Phone Order tab
#    And I select order type as "QSR" in phoneorderscreen
#  #Scenario Outline: Normal Check with cash payment - Deliver service type
#    #Given I'm logged in
#    And I select the DELIVERY order type
#    When I click Done button to select the order type
#    And I search for "<customer_name>"
#    When I click "<customer_name>" to select customer for the seat
#    And I click the Save button
#    Then I Should get back to the Order Screen
#    Then I should see customer as "<customer>" added on order screen
#    Then I should see Delivery charge added to orderscreen
#    Then I should see subtotal should not change when added delivery charge
#    And I get check number
#    And I select category as "FOOD"
#    And I select menu item as "<Menu_Item>"
#    And I select modifier as "<Modifier>"
#    And I click Done to get back
#    And I click Payment button in the Order Management Screen
#    And I click cash button from the payment method popup
#    And I click the Exit button in the payment window
#    And I click Finish button
#    Then I should see the Phone Order tab
#    And I click the Closed check in new tab window
#    And I click active driver as "<Driver>"
#    Then I should see driver is offline popup
#    And I click Yes button on driver is offline popup
#    And I click active driver as "<Driver>" in the Phone Order Screen
#    And I click departure button
#    And I click out tab in phone order screen
#    And I click the Closed check in out tab
#    And I click Arrival button in phone order screen
#    Then I should see the Phone Order tab
#    And I select order type as "QSR" in phoneorderscreen
#  #Scenario Outline: Normal check with CC payment - Delivery service type
#    And I select the DELIVERY order type
#    When I click Done button to select the order type
#    And I search for "<customer_name>"
#    When I click "<customer_name>" to select customer for the seat
#    And I click the Save button
#    Then I Should get back to the Order Screen
#    Then I should see customer as "<customer>" added on order screen
#    Then I should see Delivery charge added to orderscreen
#    Then I should see subtotal should not change when added delivery charge
#    And I get check number
#    And I select category as "FOOD"
#    And I select menu item as "<Menu_Item>"
#    And I select modifier as "<Modifier>"
#    And I click Done to get back
#    And I click Payment button in the Order Management Screen
#    And I click credit card payment on payment window
#    #Then I should see card type window
#    #And I click visa card type as "<card_type>"
#    #And I click ok button in card type window
#    Then I should see total screen
#    And I click the Continue button on the Total screen
#    Then I should see your order card screen
#    And I click manual button on the your order screen
#    And I pass the card number as "<card_number>"
#    And I pass card name as "<card_name>"
#    And I pass expire date as "<expire_date>"
#    And I click Process button on card screen
#    And I click Ok button in receipt printer popup
#    #Then I should see signature pad screen
#    #And I click tick mark button
#   # Then I should see the print or send receipt
#    #And I click No thanks Button on the print receipt
#    And I click the Exit button in the payment window
#    And I click Finish button
#    Then I should see the Phone Order tab
#    And I click the Closed check in new tab window
#    And I click active driver as "<Driver>"
#    Then I should see driver is offline popup
#    And I click Yes button on driver is offline popup
#    Then I should see driver as "<driver>" is added
#    And I click active driver as "<Driver>"
#    And I click departure button
#    And I click out tab in phone order screen
#    And I click the Closed check in out tab
#    And I click Arrival button in phone order screen
#    Then I should see the Phone Order tab
#    And I select order type as "QSR"
#  #Scenario Outline: Normal check with CC payment with tips and without service charge - Delivery charge
#    And I select the DELIVERY order type
#    When I click Done button to select the order type
#    Then I should see the customer profile window
#    And I select search
#    And I click the customer name on the order screen
#    And I select the customer
#    And I click the Save button
#    Then I Should get back to the Order Screen
#    Then I should see customer as "<customer>" added on order screen
#    Then I should see Delivery charge added to orderscreen
#    Then I should see subtotal should not change when added delivery charge
#    And I get check number
#    And I select category as "FOOD"
#    And I select menu item as "<Menu_Item>"
#    And I select modifier as "<Modifier>"
#    And I click Done to get back
#    And I click Payment button in the Order Management Screen
#    And I click credit card payment on payment window
#   # Then I should see card type window
#    #And I click visa card type as "<card_type>"
#    #And I click ok button in card type window
#    Then I should see total screen
#    And I click the Continue button on the Total screen
#    Then I should see your order card screen
#    And I click manual button on the your order screen
#    And I pass the card number as "<card_number>"
#    And I pass card name as "<card_name>"
#    And I pass expire date as "<expire_date>"
#    And I click Process button on card screen
#    And I click Ok button in receipt printer popup
#    #Then I should see signature pad screen
#    #And I click tick mark button
#   # Then I should see the print or send receipt
#    #And I click No thanks Button on the print receipt
#    And I click the Exit button in the payment window
#    And I click Finish button
#    Then I should see the Phone Order tab
#    And I click the Closed check in new tab window
#    And I click active driver as "<Driver>"
#    Then I should see driver is offline popup
#    And I click Yes button on driver is offline popup
#    Then I should see driver as "<driver>" is added
#    And I click active driver as "<Driver>"
#    And I click departure button
#    And I click out tab in phone order screen
#    And I click the Closed check in out tab
#    And I click Arrival button in phone order screen
#    Then I should see the Phone Order tab
#    And I select order type as "QSR"
#  #   Normal check with CC payment with tips and with service charge - Delivery charge
#
#    And I select the DELIVERY order type
#    When I click Done button to select the order type
#    Then I should see the customer profile window
#    And I select search
#    And I click the customer name on the order screen
#    And I select the customer
#    And I click the Save button
#    Then I Should get back to the Order Screen
#    Then I should see customer as "<customer>" added on order screen
#    Then I should see Delivery charge added to orderscreen
#    Then I should see subtotal should not change when added delivery charge
#    And I get check number
#    And I select category as "FOOD"
#    And I select menu item as "<Menu_Item>"
#    And I select modifier as "<Modifier>"
#    And I click Done to get back
#    And I click Payment button in the Order Management Screen
#    And I click credit card payment on payment window
#    #Then I should see card type window
#    #And I click visa card type as "<card_type1>"
#    #And I click ok button in card type window
#    Then I should see total screen
#    And I click the Continue button on the Total screen
#    Then I should see your order card screen
#    And I click manual button on the your order screen
#    And I pass the Amex card number as "<card_number1>"
#    And I pass card name as "<card_name1>"
#    And I pass expire date as "<expire_date1>"
#    And I click Process button on card screen
#    And I click Ok button in receipt printer popup
#    #Then I should see signature pad screen
#    #And I click tick mark button
#    #Then I should see the print or send receipt
#   # And I click No thanks Button on the print receipt
#    And I click the Exit button in the payment window
#    And I click Finish button
#    Then I should see the Phone Order tab
#    And I click the Closed check in new tab window
#    And I click active driver as "<Driver>"
#    Then I should see driver is offline popup
#    And I click Yes button on driver is offline popup
#    Then I should see driver as "<driver>" is added
#    And I click active driver as "<Driver>"
#    And I click departure button
#    And I click out tab in phone order screen
#    And I click the Closed check in out tab
#    And I click Arrival button in phone order screen
#    Then I should see the Phone Order tab
#    And I select order type as "QSR"
#  #Scenario Outline: Normal check with HA payment - Delivery service type
#   # Given I'm logged in
#    And I select the DELIVERY order type
#    When I click Done button to select the order type
#    Then I should see the customer profile window
#    And I select search
#    And I click the customer name on the order screen
#    And I select the customer
#    And I click the Save button
#    Then I Should get back to the Order Screen
#    Then I should see customer as "<customer>" added on order screen
#    Then I should see Delivery charge added to orderscreen
#    Then I should see subtotal should not change when added delivery charge
#    And I get check number
#    And I select category as "FOOD"
#    And I select menu item as "<Menu_Item>"
#    And I select modifier as "<Modifier>"
#    And I click Done to get back
#    And I click Payment button in the Order Management Screen
#    And I click house payment from the payment method popup
#    Then I should see total screen
#    And I click the Continue button on the Total screen
#    Then I should see your order card screen
#    And I click Process button on card screen
#    And I click Ok button in receipt printer popup
#    And I click the Exit button in the payment window
#    And I click Finish button
#    Then I should see the Phone Order tab
#    And I click the Closed check in new tab window
#    And I click active driver as "<Driver>"
#    Then I should see driver is offline popup
#    And I click Yes button on driver is offline popup
#    Then I should see driver as "<driver>" is added
#    And I click active driver as "<Driver>"
#    And I click departure button
#    And I click out tab in phone order screen
#    And I click the Closed check in out tab
#    And I click Arrival button in phone order screen
#    Then I should see the Phone Order tab
#    And I select order type as "QSR"
##  Scenario Outline:Normal check with HA payment with tips
# #   Given I'm logged in
#    And I select the DELIVERY order type
#    When I click Done button to select the order type
#    Then I should see the customer profile window
#    And I select search
#    And I click the customer name on the order screen
#    And I select the customer
#    And I click the Save button
#    Then I Should get back to the Order Screen
#    Then I should see customer as "<customer>" added on order screen
#    Then I should see Delivery charge added to orderscreen
#    Then I should see subtotal should not change when added delivery charge
#    And I get check number
#    And I select category as "FOOD"
#    And I select menu item as "<Menu_Item>"
#    And I select modifier as "<Modifier>"
#    And I click Done to get back
#    And I click Payment button in the Order Management Screen
#    And I click house payment from the payment method popup
#    Then I should see total screen
#    And I click custom for tip adjustment
#    Then I should see tip is added with menu total as "$ 31.70"
#    And I click the Continue button on the Total screen
#    Then I should see your order card screen
#    And I click Process button on card screen
#    And I click Ok button in receipt printer popup
#    And I click the Exit button in the payment window
#    And I click Finish button
#    Then I should see the Phone Order tab
#    And I click the Closed check in new tab window
#    And I click active driver as "<Driver>"
#    Then I should see driver is offline popup
#    And I click Yes button on driver is offline popup
#    Then I should see driver as "<driver>" is added
#    And I click active driver as "<Driver>"
#    And I click departure button
#    And I click out tab in phone order screen
#    And I click the Closed check in out tab
#    And I click Arrival button in phone order screen
#    Then I should see the Phone Order tab
#    And I select order type as "QSR"
#  #Scenario Outline:  Normal check with Side CC payment - Delivery service type
#   # Given I'm logged in
#    And I select the DELIVERY order type
#    When I click Done button to select the order type
#    Then I should see the customer profile window
#    And I select search
#    And I click the customer name on the order screen
#    And I select the customer
#    And I click the Save button
#    Then I Should get back to the Order Screen
#    Then I should see customer as "<customer>" added on order screen
#    Then I should see Delivery charge added to orderscreen
#    Then I should see subtotal should not change when added delivery charge
#    And I get check number
#    And I select category as "FOOD"
#    And I select menu item as "<Menu_Item>"
#    And I select modifier as "<Modifier>"
#    And I click Done to get back
#    And I click Payment button in the Order Management Screen
#    And I click side cc button in the payment window
#   # Then I should see card type window
#    #And I click visa card type as "<card_type>"
#    #And I click ok button in card type window
#    Then I should see total screen
#    And I click the Continue button on the Total screen
#    Then I should see the Payment window
#   # Then I should see payment as "<Cash>" is applied in payment window
#    And I click the Exit button in the payment window
#    And I click Finish button
#    Then I should see the Phone Order tab
#    And I click the Closed check in new tab window
#    And I click active driver as "<Driver>"
#    Then I should see driver is offline popup
#    And I click Yes button on driver is offline popup
#    Then I should see driver as "<driver>" is added
#    And I click active driver as "<Driver>"
#    And I click departure button
#    And I click out tab in phone order screen
#    And I click the Closed check in out tab
#    And I click Arrival button in phone order screen
#    Then I should see the Phone Order tab
#    And I select order type as "QSR"
#  #Scenario Outline: Normal check with Side CC payment with tips and without service charge - delivery service type
#    And I select the DELIVERY order type
#    When I click Done button to select the order type
#    Then I should see the customer profile window
#    And I select search
#    And I click the customer name on the order screen
#    And I select the customer
#    And I click the Save button
#    Then I Should get back to the Order Screen
#    Then I should see customer as "<customer>" added on order screen
#    Then I should see Delivery charge added to orderscreen
#    Then I should see subtotal should not change when added delivery charge
#    And I get check number
#    And I select category as "FOOD"
#    And I select menu item as "<Menu_Item>"
#    And I select modifier as "<Modifier>"
#    And I click Done to get back
#    And I click Payment button in the Order Management Screen
#    And I click side cc button in the payment window
#  #  Then I should see card type window
#   # And I click visa card type as "<card_type>"
#    #And I click ok button in card type window
#    Then I should see total screen
#    And I click tip as 10
#    Then I should see tip is added with menu total as "$ 31.70"
#    Then I should see total amount as "$ 41.70" on total screen
#    And I click the Continue button on the Total screen
#    Then I should see the Payment window
#    #Then I should see payment as "<Cash>" is applied in payment window
#    And I click the Exit button in the payment window
#    And I click Finish button
#    Then I should see the Phone Order tab
#    And I click the Closed check in new tab window
#    And I click active driver as "<Driver>"
#    Then I should see driver is offline popup
#    And I click Yes button on driver is offline popup
#    Then I should see driver as "<driver>" is added
#    And I click active driver as "<Driver>"
#    And I click departure button
#    And I click out tab in phone order screen
#    And I click the Closed check in out tab
#    And I click Arrival button in phone order screen
#    Then I should see the Phone Order tab
#    And I select order type as "QSR"
# # Scenario Outline: Normal check with Side CC payment with tips and also with service charge - Delivery service type
#  #  Given I'm logged in
#    And I select the DELIVERY order type
#    When I click Done button to select the order type
#    Then I should see the customer profile window
#    And I select search
#    And I click the customer name on the order screen
#    And I select the customer
#    And I click the Save button
#    Then I Should get back to the Order Screen
#    Then I should see customer as "<customer>" added on order screen
#    Then I should see Delivery charge added to orderscreen
#    Then I should see subtotal should not change when added delivery charge
#    And I get check number
#    And I select category as "FOOD"
#    And I select menu item as "<Menu_Item>"
#    And I select modifier as "<Modifier>"
#    And I click Done to get back
#    And I click Payment button in the Order Management Screen
#    And I click side cc button in the payment window
#    #Then I should see card type window
#    #And I click visa card type as "<card_type1>"
#    #And I click ok button in card type window
#    Then I should see total screen
#    And I click tip as 10
#    Then I should see tip is added with menu total as "$ 31.70"
#    Then I should see total amount as "$ 41.70" on total screen
#    And I click the Continue button on the Total screen
#    Then I should see the Payment window
#    #Then I should see payment as "<Cash>" is applied in payment window
#    And I click the Exit button in the payment window
#    And I click Finish button
#    Then I should see the Phone Order tab
#    And I click the Closed check in new tab window
#    And I click active driver as "<Driver>"
#    Then I should see driver is offline popup
#    And I click Yes button on driver is offline popup
#    Then I should see driver as "<driver>" is added
#    And I click active driver as "<Driver>"
#    And I click departure button
#    And I click out tab in phone order screen
#    And I click the Closed check in out tab
#    And I click Arrival button in phone order screen
#    Then I should see the Phone Order tab
#    And I select order type as "QSR"
#
# # Scenario Outline: Phone order Delivery sale
#    #Then I Should get back to the Order Screen
#    And I select the Phone Delivery order type
#    When I click Done button to select the order type
#    Then I should see the customer profile window
#    And I select search
#    And I click the customer name on the order screen
#    And I select the customer
#    And I click the Save button
#    Then I Should get back to the Order Screen
#    Then I should see customer as "<customer>" added on order screen
#    Then I should see Delivery charge added to orderscreen
#    Then I should see subtotal should not change when added delivery charge
#    And I get check number
#    And I select category as "FOOD"
#    And I select menu item as "<Menu_Item>"
#    And I select modifier as "<Modifier>"
#    And I click Done to get back
#    And I click Finish button
#    Then I should see the Phone Order tab
#    And I click the Closed check in new tab window
#    And I click active driver as "<Driver>"
#    Then I should see driver is offline popup
#    And I click Yes button on driver is offline popup
#    Then I should see driver as "<driver>" is added
#    And I click active driver as "<Driver>"
#    And I click departure button
#    And I click out tab in phone order screen
#    And I click the Closed check in out tab
#    And I click Arrival button in phone order screen
#    And I click Exact button on the cash pop-up
#    And I click Enter Button on the cash pop-up
#    Then I should see the Phone Order tab
#    And I select order type as "QSR"
#  #Scenario Outline: Normal Check With NMI Payment - Delivery Service type
#   # Given I'm logged in
#    And I select the DELIVERY order type
#    When I click Done button to select the order type
#    Then I should see the customer profile window
#    And I select search
#    And I click the customer name on the order screen
#    And I select the customer
#    And I click the Save button
#    Then I Should get back to the Order Screen
#    Then I should see customer as "<customer>" added on order screen
#    Then I should see Delivery charge added to orderscreen
#    Then I should see subtotal should not change when added delivery charge
#    And I get check number
#    And I select category as "FOOD"
#    And I select menu item as "<Menu_Item>"
#    And I select modifier as "<Modifier>"
#    And I click Done to get back
#    And I click Payment button in the Order Management Screen
#    Then I should see the Payment window
#    And I scroll the close the day "Others" "scroll close the day"
#    And I click NMI payment button in the payment window
#   # Then I should see card type window
#    #And I click visa card type as "<card_type>"
#    #And I click ok button in card type window
#    Then I should see total screen
#    And I click the Continue button on the Total screen
#    Then I should see choose card window
#    And I select credit card from choose card window
#    And I click pay button in choose card window
#    And I click Ok button in receipt printer popup
#    #Then I should see signature pad screen
#    #And I click tick mark button
#   # Then I should see the print or send receipt
#    #And I click No thanks Button on the print receipt
#    And I click the Exit button in the payment window
#    Then I Should get back to the Order Screen
#    And I click Finish button
#    Then I should see the Phone Order tab
#    And I click the Closed check in new tab window
#    And I click active driver as "<Driver>"
#    Then I should see driver is offline popup
#    And I click Yes button on driver is offline popup
#    Then I should see driver as "<driver>" is added
#    And I click active driver as "<Driver>"
#    And I click departure button
#    And I click out tab in phone order screen
#    And I click the Closed check in out tab
#    And I click Arrival button in phone order screen
#    Then I should see the Phone Order tab
#    And I select order type as "QSR"
#  #Scenario Outline: Normal check with Gift card - delivery Service Type
#   # Given I'm logged in
#    And I close the order type window
#    And I click Options button
#    And I click Gift card Button
#    Then I should see Gift card window
#    And I enter gift card number
#    And I click charge amount field and pass the amount
#    And I click Done button on the Popup
#    Then I should see gift card amount add up into order screen
#    And I click Cash button for Complete Sale
#    And I click Exact button on the cash pop-up
#    And I click Enter Button on the cash pop-up
#    #Then I should see the print or send receipt
#    #And I click No thanks Button on the print receipt
#    And I select the DELIVERY order type
#    When I click Done button to select the order type
#    Then I should see the customer profile window
#    And I select search
#    And I click the customer name on the order screen
#    And I select the customer
#    And I click the Save button
#    Then I Should get back to the Order Screen
#    Then I should see customer as "<customer>" added on order screen
#    Then I should see Delivery charge added to orderscreen
#    Then I should see subtotal should not change when added delivery charge
#    And I get check number
#    And I select category as "FOOD"
#    And I select menu item as "<Menu_Item>"
#    And I select modifier as "<Modifier>"
#    And I click Done to get back
#    And I click Payment button in the Order Management Screen
#    Then I should see the Payment window
#    And I click Gift card payment in payment window
#    And I click the Continue button on the Total screen
#    Then I should see your order card screen
#    And I click manual button on the your order screen
#    And I pass the Gift card number as "1111"
#    And I pass card name as "Gift Card"
#    And I pass expire date as "1224"
#    And I click Process button on card screen
#    And I click Ok button in receipt printer popup
#    And I click the Exit button in the payment window
#    Then I Should get back to the Order Screen
#    And I click Finish button
#    Then I should see the Phone Order tab
#    And I click the Closed check in out tab
#    And I click active driver as "<Driver>"
#    Then I should see driver is offline popup
#    And I click Yes button on driver is offline popup
#    Then I should see driver as "<driver>" is added
#    And I click active driver as "<Driver>"
#    And I click departure button
#    And I click out tab in phone order screen
#    And I click the Closed check in out tab
#    And I click Arrival button in phone order screen
#    Then I should see the Phone Order tab
#    And I select order type as "QSR"
#  #Scenario Outline:Phone order ToGo sale
#   # Given I'm logged in
#    Then I should see the order type window
#    And I select the Phone To Go order type
#    When I click Done button to select the order type
#    Then I should see the customer profile window
#    And I select search
#    And I click the customer name on the order screen
#    And I select the customer
#    And I click the Save button
#    Then I Should get back to the Order Screen
#    Then I should see customer as "<customer>" added on order screen
#    Then I should see subtotal should not change when added delivery charge
#    And I get check number
#    And I select category as "FOOD"
#    And I select menu item as "<Menu_Item>"
#    And I select modifier as "<Modifier>"
#    And I click Done to get back
#    And I click Cash button for Complete Sale
#    And I click Exact button on the cash pop-up
#    And I click Enter Button on the cash pop-up
#   # Then I should see the print or send receipt
#    #And I click No thanks Button on the print receipt
#    Then I should see the Phone Order tab
#    And I select order type as "QSR"
#
#  #Scenario Outline: Future Order - Verify whether application moves the new tab after reach the Print Future Order Before  time
#  #Given I'm logged in
#    And I select the DELIVERY order type
#    And I click Later check box
#    And I click done button in the order type window
#    When I click Done button to select the order type
#    Then I should see the customer profile window
#    And I select search
#    And I click the customer name on the order screen
#    And I select the customer
#    And I click the Save button
#    Then I Should get back to the Order Screen
#    Then I should see customer as "<customer>" added on order screen
#    Then I should see Delivery charge added to orderscreen
#    Then I should see subtotal should not change when added delivery charge
#    And I get check number
#    And I select category as "FOOD"
#    And I select menu item as "<Menu_Item>"
#    And I select modifier as "<Modifier>"
#    And I click Done to get back
#    And I click Finish button
#    Then I should see the Phone Order tab
#    And I click future tab
#    Then I should see closed check in future tab
#    And I click new tab button after click Future tab
#    And I click phone order tab
#    And I click the Closed check in new tab window
#    And I click cancel order button in phone order screen
#    Then I should see the void reason popup
#    And I click void Reason on the void popup
#    And I click Add Button on the void reason popup
##    Then I should see Receipt Printer popup
##    And I click Done button on the Popup
#    Then I should see the Phone Order tab
#    And I select order type as "QSR"
#  #Scenario Outline: Normal check with cash payment - made cash payment on Out tab
#    And I select the DELIVERY order type
#    When I click Done button to select the order type
#    Then I should see the customer profile window
#    And I select search
#    And I click the customer name on the order screen
#    And I select the customer
#    And I click the Save button
#    Then I Should get back to the Order Screen
#    Then I should see customer as "<customer>" added on order screen
#    Then I should see Delivery charge added to orderscreen
#    Then I should see subtotal should not change when added delivery charge
#    And I get check number
#    And I select category as "FOOD"
#    And I select menu item as "<Menu_Item>"
#    And I select modifier as "<Modifier>"
#    And I click Done to get back
#    And I click Finish button
#    Then I should see the Phone Order tab
#    And I click the Closed check in new tab window
#    And I click active driver as "<Driver>"
#    Then I should see driver is offline popup
#    And I click Yes button on driver is offline popup
#    Then I should see driver as "<driver>" is added
#    And I click active driver as "<Driver>"
#    And I click departure button
#    And I click out tab in phone order screen
#    And I click the Closed check in out tab
#    And I click Pay Check button
#    Then I should see the Payment window
#    And I click cash button from the payment method popup
#    And I click the Exit button in the payment window
#    Then I Should get back to the Order Screen
#    And I click Finish button
#    Then I should see the Phone Order tab
#    And I click out tab in phone order screen
#    And I click the Closed check in out tab
#    And I click Arrival button in phone order screen
#    Then I should see the Phone Order tab
#    And I select order type as "QSR"
#  #Scenario Outline:Normal check with CC payment - Make CC payment through Out Tab
#   # Given I'm logged in
#    And I select the DELIVERY order type
#    When I click Done button to select the order type
#    Then I should see the customer profile window
#    And I select search
#    And I click the customer name on the order screen
#    And I select the customer
#    And I click the Save button
#    Then I Should get back to the Order Screen
#    Then I should see customer as "<customer>" added on order screen
#    Then I should see Delivery charge added to orderscreen
#    Then I should see subtotal should not change when added delivery charge
#    And I get check number
#    And I select category as "FOOD"
#    And I select menu item as "<Menu_Item>"
#    And I select modifier as "<Modifier>"
#    And I click Done to get back
#    And I click Finish button
#    Then I should see the Phone Order tab
#    And I click the Closed check in new tab window
#    And I click active driver as "<Driver>"
#    Then I should see driver is offline popup
#    And I click Yes button on driver is offline popup
#    Then I should see driver as "<driver>" is added
#    And I click active driver as "<Driver>"
#    And I click departure button
#    And I click out tab in phone order screen
#    And I click the Closed check in out tab
#    And I click Pay Check button
#    Then I should see the Payment window
#    And I click credit card payment on payment window
#    #Then I should see card type window
#  #  And I click visa card type as "<card_type>"
#   # And I click ok button in card type window
#    Then I should see total screen
#    And I click the Continue button on the Total screen
#    Then I should see your order card screen
#    And I click manual button on the your order screen
#    And I pass the card number as "<card_number>"
#    And I pass card name as "<card_name>"
#    And I pass expire date as "<expire_date>"
#    And I click Process button on card screen
#    And I click Ok button in receipt printer popup
#    #Then I should see signature pad screen
#    #And I click tick mark button
#  #  Then I should see the print or send receipt
#   # And I click No thanks Button on the print receipt
#    And I click the Exit button in the payment window
#    Then I Should get back to the Order Screen
#    And I click Finish button
#    Then I should see the Phone Order tab
#    And I click out tab in phone order screen
#    And I click the Closed check in out tab
#    And I click Arrival button in phone order screen
#    Then I should see the Phone Order tab
#    And I select order type as "QSR"
#  #Scenario Outline: Normal check with CC payment with tips and without service charge - make cc with Tip
#    And I select the DELIVERY order type
#    When I click Done button to select the order type
#    Then I should see the customer profile window
#    And I select search
#    And I click the customer name on the order screen
#    And I select the customer
#    And I click the Save button
#    Then I Should get back to the Order Screen
#    Then I should see customer as "<customer>" added on order screen
#    Then I should see Delivery charge added to orderscreen
#    Then I should see subtotal should not change when added delivery charge
#    And I get check number
#    And I select category as "FOOD"
#    And I select menu item as "<Menu_Item>"
#    And I select modifier as "<Modifier>"
#    And I click Done to get back
#    And I click Finish button
#    Then I should see the Phone Order tab
#    And I click the Closed check in new tab window
#    And I click active driver as "<Driver>"
#    Then I should see driver is offline popup
#    And I click Yes button on driver is offline popup
#    Then I should see driver as "<driver>" is added
#    And I click active driver as "<Driver>"
#    And I click departure button
#    And I click out tab in phone order screen
#    And I click the Closed check in out tab
#    And I click Pay Check button
#    Then I should see the Payment window
#    And I click credit card payment on payment window
#    #Then I should see card type window
#   # And I click visa card type as "<card_type>"
#    #And I click ok button in card type window
#    Then I should see total screen
#    And I click tip as 10
#    And I click the Continue button on the Total screen
#    Then I should see your order card screen
#    And I click manual button on the your order screen
#    And I pass the card number as "<card_number>"
#    And I pass card name as "<card_name>"
#    And I pass expire date as "<expire_date>"
#    And I click Process button on card screen
#    And I click Ok button in receipt printer popup
##    Then I should see signature pad screen
##    And I click tick mark button
#  #  Then I should see the print or send receipt
#   # And I click No thanks Button on the print receipt
#    And I click the Exit button in the payment window
#    Then I Should get back to the Order Screen
#    And I click Finish button
#    Then I should see the Phone Order tab
#    And I click out tab in phone order screen
#    And I click the Closed check in out tab
#    And I click Arrival button in phone order screen
#    Then I should see the Phone Order tab
# #   And I click QSR tab
#    And I click power button
#   # And I click the "Power button" in the close the day screen "click Power button"
#
#    Examples:
#      | customer_name |customer | order_type    | Menu_Item    | Modifier | Menu_Item1 |Driver | driver |card_type | card_number | expire_date | card_name |card_type1 | card_number1 | expire_date1 | card_name1 |Cash |
#      | Auto ragav    | Auto r  |Store Delivery | Garlic Bread | 4 BBQ    | Onion Rings |auto l | auto   |JCB      | 3530111333300000 | 1224   | JCB        |Amex      | 371449635398431 | 1224   | Amex |1. Side CC(#1)|
#
#  #13
#  Scenario Outline: Normal check with CC payment with tips and also with service charge - Make CC with tip and service charge
#    Given I'm logged in
#    And I select the DELIVERY order type
#    When I click Done button to select the order type
#    Then I should see the customer profile window
#    And I select search
#    And I click the customer name on the order screen
#    And I select the customer
#    And I click the Save button
#    Then I Should get back to the Order Screen
#    Then I should see customer as "<customer>" added on order screen
#    Then I should see Delivery charge added to orderscreen
#    Then I should see subtotal should not change when added delivery charge
#    And I get check number
#    And I select category as "FOOD"
#    And I select menu item as "<Menu_Item>"
#    And I select modifier as "<Modifier>"
#    And I click Done to get back
#    And I click Finish button
#    Then I should see the Phone Order tab
#    And I click the Closed check in new tab window
#    And I click active driver as "<Driver>"
#    Then I should see driver is offline popup
#    And I click Yes button on driver is offline popup
#    Then I should see driver as "<driver>" is added
#    And I click active driver as "<Driver>"
#    And I click departure button
#    And I click out tab in phone order screen
#    And I click the Closed check in out tab
#    And I click Pay Check button
#    Then I should see the Payment window
#    And I click credit card payment on payment window
# #Then I should see card type window
# #And I click visa card type as "<card_type>"
# #And I click ok button in card type window
#    Then I should see total screen
#    And I click tip as 10
#    And I click the Continue button on the Total screen
#    Then I should see your order card screen
#    And I click manual button on the your order screen
#    And I pass the Amex card number as "<card_number>"
#    And I pass card name as "<card_name>"
#    And I pass expire date as "<expire_date>"
#    And I click Process button on card screen
#    And I click Ok button in receipt printer popup
## Then I should see signature pad screen
# #And I click tick mark button
## Then I should see the print or send receipt
# #And I click No thanks Button on the print receipt
#    And I click the Exit button in the payment window
#    Then I Should get back to the Order Screen
#    And I click Finish button
#    Then I should see the Phone Order tab
#    And I click out tab in phone order screen
#    And I click the Closed check in out tab
#    And I click Arrival button in phone order screen
#    Then I should see the Phone Order tab
#    And I select order type as "QSR"
##Scenario Outline: Normal check with HA payment - Make HA via out tab
# # Given I'm logged in
#    And I select the DELIVERY order type
#    When I click Done button to select the order type
#    Then I should see the customer profile window
#    And I select search
#    And I click the customer name on the order screen
#    And I select the customer
#    And I click the Save button
#    Then I Should get back to the Order Screen
#    Then I should see customer as "<customer>" added on order screen
#    Then I should see Delivery charge added to orderscreen
#    Then I should see subtotal should not change when added delivery charge
#    And I get check number
#    And I select category as "FOOD"
#    And I select menu item as "<Menu_Item>"
#    And I select modifier as "<Modifier>"
#    And I click Done to get back
#    And I click Finish button
#    Then I should see the Phone Order tab
#    And I click the Closed check in new tab window
#    And I click active driver as "<Driver>"
#    Then I should see driver is offline popup
#    And I click Yes button on driver is offline popup
#    Then I should see driver as "<driver>" is added
#    And I click active driver as "<Driver>"
#    And I click departure button
#    And I click out tab in phone order screen
#    And I click the Closed check in out tab
#    And I click Pay Check button
#    Then I should see the Payment window
#    And I click house payment from the payment method popup
#    Then I should see total screen
#    And I click the Continue button on the Total screen
#    Then I should see your order card screen
#    And I click Process button on card screen
#    And I click Ok button in receipt printer popup
#    And I click the Exit button in the payment window
#    Then I Should get back to the Order Screen
#    And I click Finish button
#    Then I should see the Phone Order tab
#    And I click out tab in phone order screen
#    And I click the Closed check in out tab
#    And I click Arrival button in phone order screen
#    Then I should see the Phone Order tab
#    And I select order type as "QSR"
## Scenario Outline: Normal check with HA payment with tips - Make HA with tips via Out tab Pay check
# # Given I'm logged in
#    And I select the DELIVERY order type
#    When I click Done button to select the order type
#    Then I should see the customer profile window
#    And I select search
#    And I click the customer name on the order screen
#    And I select the customer
#    And I click the Save button
#    Then I Should get back to the Order Screen
#    Then I should see customer as "<customer>" added on order screen
#    Then I should see Delivery charge added to orderscreen
#    Then I should see subtotal should not change when added delivery charge
#    And I get check number
#    And I select category as "FOOD"
#    And I select menu item as "<Menu_Item>"
#    And I select modifier as "<Modifier>"
#    And I click Done to get back
#    And I click Finish button
#    Then I should see the Phone Order tab
#    And I click the Closed check in new tab window
#    And I click active driver as "<Driver>"
#    Then I should see driver is offline popup
#    And I click Yes button on driver is offline popup
#    Then I should see driver as "<driver>" is added
#    And I click active driver as "<Driver>"
#    And I click departure button
#    And I click out tab in phone order screen
#    And I click the Closed check in out tab
#    And I click Pay Check button
#    Then I should see the Payment window
#    And I click house payment from the payment method popup
#    Then I should see total screen
#    And I click custom for tip adjustment
#    Then I should see tip is added with menu total as "$ 25.00"
#    And I click the Continue button on the Total screen
#    Then I should see your order card screen
#    And I click Process button on card screen
#    And I click Ok button in receipt printer popup
#    And I click the Exit button in the payment window
#    Then I Should get back to the Order Screen
#    And I click Finish button
#    Then I should see the Phone Order tab
#    And I click out tab in phone order screen
#    And I click the Closed check in out tab
#    And I click Arrival button in phone order screen
#    Then I should see the Phone Order tab
#    And I select order type as "QSR"
## Scenario Outline: Normal check with Side CC payment - Make Side cc via Out tab
# #  Given I'm logged in
#    And I select the DELIVERY order type
#    When I click Done button to select the order type
#    Then I should see the customer profile window
#    And I select search
#    And I click the customer name on the order screen
#    And I select the customer
#    And I click the Save button
#    Then I Should get back to the Order Screen
#    Then I should see customer as "<customer>" added on order screen
#    Then I should see Delivery charge added to orderscreen
#    Then I should see subtotal should not change when added delivery charge
#    And I get check number
#    And I select category as "FOOD"
#    And I select menu item as "<Menu_Item>"
#    And I select modifier as "<Modifier>"
#    And I click Done to get back
#    And I click Finish button
#    Then I should see the Phone Order tab
#    And I click the Closed check in new tab window
#    And I click active driver as "<Driver>"
#    Then I should see driver is offline popup
#    And I click Yes button on driver is offline popup
#    Then I should see driver as "<driver>" is added
#    And I click active driver as "<Driver>"
#    And I click departure button
#    And I click out tab in phone order screen
#    And I click the Closed check in out tab
#    And I click Pay Check button
#    Then I should see the Payment window
#    And I click side cc button in the payment window
#  # Then I should see card type window
#   #And I click visa card type as "<card_type>"
#   #And I click ok button in card type window
#    Then I should see total screen
#    And I click the Continue button on the Total screen
#    Then I should see the Payment window
#   #Then I should see payment as "<Cash>" is applied in payment window
#    And I click the Exit button in the payment window
#    Then I Should get back to the Order Screen
#    And I click Finish button
#    Then I should see the Phone Order tab
#    And I click out tab in phone order screen
#    And I click the Closed check in out tab
#    And I click Arrival button in phone order screen
#    Then I should see the Phone Order tab
#    And I select order type as "QSR"
## Scenario Outline: Normal check with Side CC payment with tips and without service charge - Make Side CC via Out tab
# #  Given I'm logged in
#    And I select the DELIVERY order type
#    When I click Done button to select the order type
#    Then I should see the customer profile window
#    And I select search
#    And I click the customer name on the order screen
#    And I select the customer
#    And I click the Save button
#    Then I Should get back to the Order Screen
#    Then I should see customer as "<customer>" added on order screen
#    Then I should see Delivery charge added to orderscreen
#    Then I should see subtotal should not change when added delivery charge
#    And I get check number
#    And I select category as "FOOD"
#    And I select menu item as "<Menu_Item>"
#    And I select modifier as "<Modifier>"
#    And I click Done to get back
#    And I click Finish button
#    Then I should see the Phone Order tab
#    And I click the Closed check in new tab window
#    And I click active driver as "<Driver>"
#    Then I should see driver is offline popup
#    And I click Yes button on driver is offline popup
#    Then I should see driver as "<driver>" is added
#    And I click active driver as "<Driver>"
#    And I click departure button
#    And I click out tab in phone order screen
#    And I click the Closed check in out tab
#    And I click Pay Check button
#    Then I should see the Payment window
#    And I click side cc button in the payment window
#  # Then I should see card type window
#   #And I click visa card type as "<card_type>"
#   #And I click ok button in card type window
#    Then I should see total screen
#    And I click tip as 10
#    Then I should see tip is added with menu total as "$ 25.00"
#    Then I should see total amount as "$ 35.00" on total screen
#    And I click the Continue button on the Total screen
#    Then I should see the Payment window
#   #Then I should see payment as "<Cash>" is applied in payment window
#    And I click the Exit button in the payment window
#    Then I Should get back to the Order Screen
#    And I click Finish button
#    Then I should see the Phone Order tab
#    And I click out tab in phone order screen
#    And I click the Closed check in out tab
#    And I click Arrival button in phone order screen
#    Then I should see the Phone Order tab
#    And I select order type as "QSR"
#   #Scenario Outline: Normal check with Side CC payment with tips and also with service charge - Make Side cc via out tab
#    And I select the DELIVERY order type
#    When I click Done button to select the order type
#    Then I should see the customer profile window
#    And I select search
#    And I click the customer name on the order screen
#    And I select the customer
#    And I click the Save button
#    Then I Should get back to the Order Screen
#    Then I should see customer as "<customer>" added on order screen
#    Then I should see Delivery charge added to orderscreen
#    Then I should see subtotal should not change when added delivery charge
#    And I get check number
#    And I select category as "FOOD"
#    And I select menu item as "<Menu_Item>"
#    And I select modifier as "<Modifier>"
#    And I click Done to get back
#    And I click Finish button
#    Then I should see the Phone Order tab
#    And I click the Closed check in new tab window
#    And I click active driver as "<Driver>"
#    Then I should see driver is offline popup
#    And I click Yes button on driver is offline popup
#    Then I should see driver as "<driver>" is added
#    And I click active driver as "<Driver>"
#    And I click departure button
#    And I click out tab in phone order screen
#    And I click the Closed check in out tab
#    And I click Pay Check button
#    Then I should see the Payment window
#    And I click side cc button in the payment window
# #  Then I should see card type window
# #  And I click visa card type as "<card_type>"
#  # And I click ok button in card type window
#    Then I should see total screen
#    And I click tip as 10
#    Then I should see tip is added with menu total as "$ 25.00"
#    Then I should see total amount as "$ 35.00" on total screen
#    And I click the Continue button on the Total screen
#    Then I should see the Payment window
#   #Then I should see payment as "<Cash>" is applied in payment window
#    And I click the Exit button in the payment window
#    Then I Should get back to the Order Screen
#    And I click Finish button
#    Then I should see the Phone Order tab
#    And I click out tab in phone order screen
#    And I click the Closed check in out tab
#    And I click Arrival button in phone order screen
#    Then I should see the Phone Order tab
#    And I select order type as "QSR"
##Scenario Outline: Normal check with other payment - Make Payment through Out tab
# #  Given I'm logged in
#    And I select the DELIVERY order type
#    When I click Done button to select the order type
#    Then I should see the customer profile window
#    And I select search
#    And I click the customer name on the order screen
#    And I select the customer
#    And I click the Save button
#    Then I Should get back to the Order Screen
#    Then I should see customer as "<customer>" added on order screen
#    Then I should see Delivery charge added to orderscreen
#    Then I should see subtotal should not change when added delivery charge
#    And I get check number
#    And I select category as "FOOD"
#    And I select menu item as "<Menu_Item>"
#    And I select modifier as "<Modifier>"
#    And I click Done to get back
#    And I click Finish button
#    Then I should see the Phone Order tab
#    And I click the Closed check in new tab window
#    And I click active driver as "<Driver>"
#    Then I should see driver is offline popup
#    And I click Yes button on driver is offline popup
#    Then I should see driver as "<driver>" is added
#    And I click active driver as "<Driver>"
#    And I click departure button
#    And I click out tab in phone order screen
#    And I click the Closed check in out tab
#    And I click Pay Check button
#    Then I should see the Payment window
#    And I click other button from the payment method popup
#    And I click the Exit button in the payment window
#    Then I Should get back to the Order Screen
#    And I click Finish button
#    Then I should see the Phone Order tab
#    And I click out tab in phone order screen
#    And I click the Closed check in out tab
#    And I click Arrival button in phone order screen
#    Then I should see the Phone Order tab
#    And I select order type as "QSR"
#  #Scenario Outline: Normal Check With NMI Payment - make Payment via Out tab
#    And I select the DELIVERY order type
#    When I click Done button to select the order type
#    Then I should see the customer profile window
#    And I select search
#    And I click the customer name on the order screen
#    And I select the customer
#    And I click the Save button
#    Then I Should get back to the Order Screen
#    Then I should see customer as "<customer>" added on order screen
#    Then I should see Delivery charge added to orderscreen
#    Then I should see subtotal should not change when added delivery charge
#    And I get check number
#    And I select category as "FOOD"
#    And I select menu item as "<Menu_Item>"
#    And I select modifier as "<Modifier>"
#    And I click Done to get back
#    And I click Finish button
#    Then I should see the Phone Order tab
#    And I click the Closed check in new tab window
#    And I click active driver as "<Driver>"
#    Then I should see driver is offline popup
#    And I click Yes button on driver is offline popup
#    Then I should see driver as "<driver>" is added
#    And I click active driver as "<Driver>"
#    And I click departure button
#    And I click out tab in phone order screen
#    And I click the Closed check in out tab
#    And I click Pay Check button
#    Then I should see the Payment window
#    And I scroll the close the day "Others" "scroll close the day"
#    And I click NMI payment button in the payment window
#  # Then I should see card type window
#   # And I click visa card type as "<card_type>"
#   # And I click ok button in card type window
#    Then I should see total screen
#    And I click the Continue button on the Total screen
#    Then I should see choose card window
#    And I select credit card from choose card window
#    And I click pay button in choose card window
#    And I click Ok button in receipt printer popup
##    Then I should see signature pad screen
##    And I click tick mark button
#   # Then I should see the print or send receipt
#    #And I click No thanks Button on the print receipt
#    And I click the Exit button in the payment window
#    Then I Should get back to the Order Screen
#    And I click Finish button
#    Then I should see the Phone Order tab
#    And I click out tab in phone order screen
#    And I click the Closed check in out tab
#    And I click Arrival button in phone order screen
#    Then I should see the Phone Order tab
#    And I select order type as "QSR"
#  #Scenario Outline: Normal check with Gift card - Make Payment via Out Tab
#  #  Given I'm logged in
#    And I close the order type window
#    And I click Options button
#    And I click Gift card Button
#    Then I should see Gift card window
#    And I enter gift card number
#    And I click charge amount field and pass the amount
#    And I click Done button on the Popup
#    Then I should see gift card amount add up into order screen
#    And I click Cash button for Complete Sale
#    And I click Exact button on the cash pop-up
#    And I click Enter Button on the cash pop-up
#   # Then I should see the print or send receipt
#    #And I click No thanks Button on the print receipt
#    And I select the DELIVERY order type
#    When I click Done button to select the order type
#    Then I should see the customer profile window
#    And I select search
#    And I click the customer name on the order screen
#    And I select the customer
#    And I click the Save button
#    Then I Should get back to the Order Screen
#    Then I should see customer as "<customer>" added on order screen
#    Then I should see Delivery charge added to orderscreen
#    Then I should see subtotal should not change when added delivery charge
#    And I get check number
#    And I select category as "FOOD"
#    And I select menu item as "<Menu_Item>"
#    And I select modifier as "<Modifier>"
#    And I click Done to get back
#    And I click Finish button
#    Then I should see the Phone Order tab
#    And I click the Closed check in new tab window
#    And I click active driver as "<Driver>"
#    Then I should see driver is offline popup
#    And I click Yes button on driver is offline popup
#    Then I should see driver as "<driver>" is added
#    And I click active driver as "<Driver>"
#    And I click departure button
#    And I click out tab in phone order screen
#    And I click the Closed check in out tab
#    And I click Pay Check button
#    Then I should see the Payment window
#    And I click Gift card payment in payment window
#    And I click the Continue button on the Total screen
#    Then I should see your order card screen
#    And I click manual button on the your order screen
#    And I pass the Gift card number as "<card_number1>"
#    And I pass card name as "<card_name1>"
#    And I pass expire date as "<expire_date1>"
#    And I click Process button on card screen
#    And I click Ok button in receipt printer popup
#    And I click the Exit button in the payment window
#    Then I Should get back to the Order Screen
#    And I click Finish button
#    Then I should see the Phone Order tab
#    And I click out tab in phone order screen
#    And I click the Closed check in out tab
#    And I click Arrival button in phone order screen
#    Then I should see the Phone Order tab
#    And I select order type as "QSR"
## Scenario Outline: Future order - Verify whether application allow the user to select driver for the check
# #  Given I'm logged in
#    And I select the DELIVERY order type
#    And I click Later check box
#    And I click done button in the order type window
#    When I click Done button to select the order type
#    Then I should see the customer profile window
#    And I select search
#    And I click the customer name on the order screen
#    And I select the customer
#    And I click the Save button
#    Then I Should get back to the Order Screen
#    Then I should see customer as "<customer>" added on order screen
#    Then I should see Delivery charge added to orderscreen
#    Then I should see subtotal should not change when added delivery charge
#    And I get check number
#    And I select category as "FOOD"
#    And I select menu item as "<Menu_Item>"
#    And I select modifier as "<Modifier>"
#    And I click Done to get back
#    And I click Finish button
#    Then I should see the Phone Order tab
#    And I click future tab
#    And I click the Closed check in future tab
#    And I click new tab button after click Future tab
#    And I click phone order tab
#    And I click the Closed check in new tab window
#    And I click active driver as "<Driver>"
#    Then I should see driver is offline popup
#    And I click Yes button on driver is offline popup
#    And I click out tab in phone order screen
#    And I click BarTab Layout
#    And I click phone order tab
#    And I click the Closed check in new tab window
#    And I click cancel order button in phone order screen
#    Then I should see the void reason popup
#    And I click void Reason on the void popup
#    And I click Add Button on the void reason popup
##    Then I should see Receipt Printer popup
##    And I click Done button on the Popup
#    Then I should see the Phone Order tab
#    And I select order type as "QSR"
# #Scenario Outline: Future order - Verify whether application display warning popup message if user select off line driver
# #Given I'm logged in
#    And I select the DELIVERY order type
#    And I click Later check box
#    And I click done button in the order type window
#    When I click Done button to select the order type
#    Then I should see the customer profile window
#    And I select search
#    And I click the customer name on the order screen
#    And I select the customer
#    And I click the Save button
#    Then I Should get back to the Order Screen
#    Then I should see customer as "<customer>" added on order screen
#    Then I should see Delivery charge added to orderscreen
#    Then I should see subtotal should not change when added delivery charge
#    And I get check number
#    And I select category as "FOOD"
#    And I select menu item as "<Menu_Item>"
#    And I select modifier as "<Modifier>"
#    And I click Done to get back
#    And I click Finish button
#    Then I should see the Phone Order tab
#    And I click future tab
#    And I click the Closed check in future tab
#    And I click new tab button after click Future tab
#    And I click phone order tab
#    And I click the Closed check in new tab window
#    And I click active driver as "<Driver>"
#    Then I should see driver is offline popup
#    And I click No button on driver is offline popup
#    And I click out tab in phone order screen
#    And I click BarTab Layout
#    And I click phone order tab
#    And I click the Closed check in new tab window
#    And I click cancel order button in phone order screen
#    Then I Should get back to the Order Screen
#    Then I should see the void reason popup
#    And I click void Reason on the void popup
#    And I click Add Button on the void reason popup
##    Then I should see Receipt Printer popup
##    And I click Done button on the Popup
#    Then I should see the Phone Order tab
#    And I select order type as "QSR"
# #Scenario Outline: Future order-Verify whether application displaying the selected driver name for corresponding check
#    And I select the DELIVERY order type
#    And I click Later check box
#    And I click done button in the order type window
#    When I click Done button to select the order type
#    Then I should see the customer profile window
#    And I select search
#    And I click the customer name on the order screen
#    And I select the customer
#    And I click the Save button
#    Then I Should get back to the Order Screen
#    Then I should see customer as "<customer>" added on order screen
#    Then I should see Delivery charge added to orderscreen
#    Then I should see subtotal should not change when added delivery charge
#    And I get check number
#    And I select category as "FOOD"
#    And I select menu item as "<Menu_Item>"
#    And I select modifier as "<Modifier>"
#    And I click Done to get back
#    And I click Finish button
#    Then I should see the Phone Order tab
#    And I click future tab
#    And I click the Closed check in future tab
#    And I click new tab button after click Future tab
#    And I click phone order tab
#    And I click the Closed check in new tab window
#    And I click active driver as "<Driver>"
#    Then I should see driver is offline popup
#    And I click No button on driver is offline popup
#    And I click out tab in phone order screen
#    And I click BarTab Layout
#    And I click phone order tab
#    And I click the Closed check in new tab window
#    And I click cancel order button in phone order screen
#    Then I should see the void reason popup
#    And I click void Reason on the void popup
#    And I click Add Button on the void reason popup
##    Then I should see Receipt Printer popup
##    And I click Done button on the Popup
#    Then I should see the Phone Order tab
#    And I select order type as "QSR"
# #Scenario Outline: Future order - Verify whether application allow the user to departure the check by selecting driver and departure
#    And I select the DELIVERY order type
#    And I click Later check box
#    And I click done button in the order type window
#    When I click Done button to select the order type
#    Then I should see the customer profile window
#    And I select search
#    And I click the customer name on the order screen
#    And I select the customer
#    And I click the Save button
#    Then I Should get back to the Order Screen
#    Then I should see customer as "<customer>" added on order screen
#    Then I should see Delivery charge added to orderscreen
#    Then I should see subtotal should not change when added delivery charge
#    And I get check number
#    And I select category as "FOOD"
#    And I select menu item as "<Menu_Item>"
#    And I select modifier as "<Modifier>"
#    And I click Done to get back
#    And I click Finish button
#    Then I should see the Phone Order tab
#    And I click future tab
#    And I click the Closed check in future tab
#    And I click new tab button after click Future tab
#    And I click phone order tab
#    And I click the Closed check in new tab window
#    And I click active driver as "<Driver>"
#    Then I should see driver is offline popup
#    And I click Yes button on driver is offline popup
#    Then I should see driver as "<driver>" is added
#    And I click active driver as "<Driver>"
#    And I click departure button
#    And I click out tab in phone order screen
#    And I click the Closed check in out tab
#    And I click Arrival button in phone order screen
#    And I click Exact button on the cash pop-up
#    And I click Enter Button on the cash pop-up
#    Then I should see the Phone Order tab
#    And I select order type as "QSR"
##Scenario Outline: Future order - Verify whether application move the check to out tab after departure
#    And I select the DELIVERY order type
#    And I click Later check box
#    And I click done button in the order type window
#    When I click Done button to select the order type
#    Then I should see the customer profile window
#    And I select search
#    And I click the customer name on the order screen
#    And I select the customer
#    And I click the Save button
#    Then I Should get back to the Order Screen
#    Then I should see customer as "<customer>" added on order screen
#    Then I should see Delivery charge added to orderscreen
#    Then I should see subtotal should not change when added delivery charge
#    And I get check number
#    And I select category as "FOOD"
#    And I select menu item as "<Menu_Item>"
#    And I select modifier as "<Modifier>"
#    And I click Done to get back
#    And I click Finish button
#    Then I should see the Phone Order tab
#    And I click future tab
#
#    And I click the Closed check in future tab
#    And I click new tab button after click Future tab
#    And I click phone order tab
#    And I click the Closed check in new tab window
#    And I click active driver as "<Driver>"
#    Then I should see driver is offline popup
#    And I click Yes button on driver is offline popup
#    Then I should see driver as "<driver>" is added
#    And I click active driver as "<Driver>"
#    And I click departure button
#    And I click out tab in phone order screen
#    And I click the Closed check in out tab
#    And I click Arrival button in phone order screen
#    And I click Exact button on the cash pop-up
#    And I click Enter Button on the cash pop-up
#    Then I should see the Phone Order tab
#    And I select order type as "QSR"
## Scenario Outline: Future Order - Verify whether application allow the user to select driver for the check in out tab
# #  Given I'm logged in
#    And I select the DELIVERY order type
#    And I click Later check box
#    And I click done button in the order type window
#    When I click Done button to select the order type
#    Then I should see the customer profile window
#    And I select search
#    And I click the customer name on the order screen
#    And I select the customer
#    And I click the Save button
#    Then I Should get back to the Order Screen
#    Then I should see customer as "<customer>" added on order screen
#    Then I should see Delivery charge added to orderscreen
#    Then I should see subtotal should not change when added delivery charge
#    And I get check number
#    And I select category as "FOOD"
#    And I select menu item as "<Menu_Item>"
#    And I select modifier as "<Modifier>"
#    And I click Done to get back
#    And I click Finish button
#    Then I should see the Phone Order tab
#    And I click future tab
#    And I click the Closed check in future tab
#    And I click new tab button after click Future tab
#    And I click phone order tab
#    And I click the Closed check in new tab window
#    And I click active driver as "<Driver>"
#    Then I should see driver is offline popup
#    And I click Yes button on driver is offline popup
#    Then I should see driver as "<driver>" is added
#    And I click active driver as "<Driver>"
#    And I click departure button
#    And I click out tab in phone order screen
#    And I click the Closed check in out tab
#    And I click active driver as "Auto D"
#    Then I should see driver is offline popup
#    And I click Yes button on driver is offline popup
#    And I click out tab in phone order screen
#    And I click the Closed check in out tab
#    And I click Arrival button in phone order screen
#    And I click Exact button on the cash pop-up
#    And I click Enter Button on the cash pop-up
#    Then I should see the Phone Order tab
#    And I select order type as "QSR"
# #Scenario Outline: Future Order - Verify whether application allow the user to arrival the check by selecting check and clicking arrival button
# #Given I'm logged in
#    And I select the DELIVERY order type
#    And I click Later check box
#    And I click done button in the order type window
#    When I click Done button to select the order type
#    Then I should see the customer profile window
#    And I select search
#    And I click the customer name on the order screen
#    And I select the customer
#    And I click the Save button
#    Then I Should get back to the Order Screen
#    Then I should see customer as "<customer>" added on order screen
#    Then I should see Delivery charge added to orderscreen
#    Then I should see subtotal should not change when added delivery charge
#    And I get check number
#    And I select category as "FOOD"
#    And I select menu item as "<Menu_Item>"
#    And I select modifier as "<Modifier>"
#    And I click Done to get back
#    And I click Finish button
#    Then I should see the Phone Order tab
#    And I click future tab
#    And I click the Closed check in future tab
#    And I click new tab button after click Future tab
#    And I click phone order tab
#    And I click the Closed check in new tab window
#    And I click active driver as "<Driver>"
#    Then I should see driver is offline popup
#    And I click Yes button on driver is offline popup
#    Then I should see driver as "<driver>" is added
#    And I click active driver as "<Driver>"
#    And I click departure button
#    And I click out tab in phone order screen
#    And I click the Closed check in out tab
#    And I click active driver as "Auto D"
#    Then I should see driver is offline popup
#    And I click Yes button on driver is offline popup
#    Then I should see driver as "Auto" is added
#    And I click BarTab Layout
#    And I click phone order tab
#    And I click out tab in phone order screen
#    And I click the Closed check in out tab
#    And I click Arrival button in phone order screen
#    And I click Exact button on the cash pop-up
#    And I click Enter Button on the cash pop-up
#    Then I should see the Phone Order tab
#    And I select order type as "QSR"
# #Scenario Outline: Future order - Verify whether application move the check to complete tab after successfully arrived
# #Given I'm logged in
#    And I select the DELIVERY order type
#    And I click Later check box
#    And I click done button in the order type window
#    When I click Done button to select the order type
#    Then I should see the customer profile window
#    And I select search
#    And I click the customer name on the order screen
#    And I select the customer
#    And I click the Save button
#    Then I Should get back to the Order Screen
#    And I get check number
#    Then I should see customer as "<customer>" added on order screen
#    Then I should see Delivery charge added to orderscreen
#    Then I should see subtotal should not change when added delivery charge
#    And I select category as "FOOD"
#    And I select menu item as "<Menu_Item>"
#    And I select modifier as "<Modifier>"
#    And I click Done to get back
#    And I click Finish button
#    Then I should see the Phone Order tab
#    And I click future tab
#    And I click the Closed check in future tab
#    And I click new tab button after click Future tab
#    And I click phone order tab
#    And I click the Closed check in new tab window
#    And I click active driver as "<Driver>"
#    Then I should see driver is offline popup
#    And I click Yes button on driver is offline popup
#    Then I should see driver as "<driver>" is added
#    And I click active driver as "<Driver>"
#    And I click departure button
#    And I click out tab in phone order screen
#    And I click the Closed check in out tab
#    And I click active driver as "Auto D"
#    Then I should see driver is offline popup
#    And I click Yes button on driver is offline popup
#    Then I should see driver as "Auto" is added
#    And I click BarTab Layout
#    And I click phone order tab
#    And I click out tab in phone order screen
#    And I click the Closed check in out tab
#    And I click Arrival button in phone order screen
#    And I click Exact button on the cash pop-up
#    And I click Enter Button on the cash pop-up
#    Then I should see the Phone Order tab
#    And I click Complete tab
#    Then I should see closed check in complete tab
#   # And I click QSR tab
#    And I click power button
#    #And I click the "Power button" in the close the day screen "click Power button"
#
#
#    Examples:
#      | customer_name |customer | order_type    | Menu_Item    | Modifier | Driver | driver | card_type | card_number | expire_date | card_name | Total |Cash |  card_type  |card_number1 | card_name1 | expire_date1 |
#      | Auto ragav    | Auto r  |Store Delivery | French Friese | Steak     | auto l | auto   |Amex      | 371449635398431 | 1224   | Amex       | TL 65,00 |1. CC Side | JCB |1111        | Gift Card | 1224        |



  #Scenario Outline: Quick bar
  #  Given I'm logged in
    #And I close the order type window
    #And I click the Settings button
    #And I click the POS settings from Toggle
    #And I click the Quick Bar Icon
    #And I click the Toggle Icon button
    #And I click POS Icon from Toggle
    #And I close the order type window
    #And I tap QSR button to open the order types combo
    #And I select order type as "<order_type>"
    #And I click the Exit to close the preauth window
    #And I get check number
    #And I select category as "FOOD"
    #And I select menu item as "<menu_item>"
    #And I select modifier as "<modifier>"
    #And I should see that "<menu_item>" and "<modifier>" are added to the check
    #And I click Done to get back
    #When I click Finish button
   # And I click on "Cancel" for closing order screen popup "Click cancel button"
    #Then I should see the bar tab screen
    #And I click the Settings button
    #And I click the POS settings from Toggle
    #And I click the Quick Bar Icon
    #And I click the Toggle Icon button
    #And I click POS Icon from Toggle
    #And I close the order type window
    #And I click All
    #And I click BarTab Layout
    #And I click the active check from bar tab
    #Then I Should get back to the Order Screen
    #And I click Void button on order management screen
    #Then I should see the void reason popup
    #And I click void Reason on the void popup
    #And I click Add Button on the void reason popup
   # Then I should see Receipt Printer popup
  #  And I click Done button on the Popup
   # And I click QSR tab
   # And I click the "Power button" in the close the day screen "click Power button"
#Scenario Outline: Service Type changing  Delivery To For Here Screen
   # And I select the DELIVERY order type
    #When I click Done button to select the order type
    #Then I should see the customer profile window
    #And I select search
    #And I click the customer name on the order screen
    #And I select the customer
    #And I click the Save button
    #Then I Should get back to the Order Screen
    #Then I should see customer as "<customer>" added on order screen
    #And I select category as "FOOD"
    #And I select menu item as "<menu_item>"
    #And I select modifier as "<modifier>"
    #And I click Done to get back
    #And I tap Delivery to open the order type
    #And I select order type as "For Here"
    #Then I should see service type as "For Here"
    #And I click Cash button for Complete Sale
    #And I click Exact button on the cash pop-up
    #And I click Enter Button on the cash pop-up
   # Then I should see the print or send receipt
    #And I click No thanks Button on the print receipt
    #Then I should see the Phone Order tab
    #And I select order type as "QSR"
  #Scenario Outline: Service Type changing Phone Delivery To For Here Screen
    #And I select the Phone Delivery order type
    #When I click Done button to select the order type
    #Then I should see the customer profile window
    #And I select search
    #And I click the customer name on the order screen
    #And I select the customer
    #And I click the Save button
    #Then I Should get back to the Order Screen
    #Then I should see customer as "<customer>" added on order screen
    #And I select category as "FOOD"
    #And I select menu item as "<menu_item>"
    #And I select modifier as "<modifier>"
    #And I click Done to get back
    #And I tap Delivery to open the order type
    #And I select order type as "For Here"
    #Then I should see service type as "For Here"
    #And I click Cash button for Complete Sale
    #And I click Exact button on the cash pop-up
    #And I click Enter Button on the cash pop-up
   # Then I should see the print or send receipt
   # And I click No thanks Button on the print receipt
    #Then I should see the Phone Order tab
    #And I click QSR tab
    # Scenario Outline:Selecting BarTab order type from combo and placing an order
  #  Given I'm logged in
    #And I close the order type window
    #And I tap QSR button to open the order types combo
    #And I select order type as "Bar Tab"
    #And I click the Exit to close the preauth window
    #And I click on "Cancel" for closing order screen popup "Click cancel button"
   # And I get check number
  #  And I select category as "FOOD"
   # And I select menu item as "Onion Rings"
   # And I should see that "Onion Rings" is added to the check
   # When I click Finish button
    #Then I should see the bar tab screen
    #And I click the active check from bar tab
    #Then I Should get back to the Order Screen
    #And I click Void button on order management screen
   # Then I should see the void reason popup
   # And I click void Reason on the void popup
   # And I click Add Button on the void reason popup
   # Then I should see Receipt Printer popup
   # And I click Done button on the Popup
   # And I select order type as "QSR"
   # And I click power button

   # Examples:
   #   | order_type | menu_item | modifier |customer_name | customer|
   #   | Bar Tab | French Friese   | Tomato|Auto ragav    |Auto r   |











