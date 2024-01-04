@Regression

Feature: Check Options screen operations

  Background:
    Given I'm logged in
    And I closed the order type window
    And I click All
    And I click Table Layout tab


#  Scenario Outline: Option
#    #Open Cash Drawer
#    And I click new check button on the Table layout screen
#    And I select table as "<table_no>"
#    And I select the number of seats as "<number_of_seats>"
#    And I tap Continue to finish selecting the number of seats
#    And I get check number
#    And I select category as "FOOD"
#    And I select menu item as "<Menu_Item>"
#    And I select modifier as "<Modifier>"
#    And I click Done to get back
#    And I click Options button
#    Then I should see the Check Options screen
#    And I click open cash drawer Button
#    #Check Payment through CC and customer & Merchant copy enabled without tips
#    And I click Payment button in the Order Management Screen
#    And I click credit card payment on payment window
#    Then I should see total screen
#    And I click the Continue button on the Total screen
#    Then I should see your order card screen
#    And I click manual button on the your order screen
#    And I pass the card number as "<card_number>"
#    And I pass card name as "<card_name>"
#    And I pass expire date as "<expire_date>"
#    And I click Process button on card screen
##    And I click Ok button in receipt printer popup
#    Then I should get back to the Table Layout tab
#    #Void check CC payment without tips
#    And I click Check Stats tab
#    And I click Closed tab on the Check stats
#    And I click the Closed check on check stats
#    And I click reopen check button on the check stats screen
#    Then I Should get back to the Order Screen
#    And I click Payment button in the Order Management Screen
#    And I click payment in the payment window
#    And I click Delete button on the payment window
##    And I click Ok button in receipt printer popup
#    Then I should see transaction void successful popup
#    And I click Done button on the Popup
#    And I click Exit to return to Order Management Screen
#    And I click print button on the order screen
#    And I click Done button on the Popup
#    And I click Void button on order management screen
#    Then I should see the void reason popup
#    And I click void Reason on the void popup
#    And I click Add Button on the void reason popup
#    Then I should see Receipt Printer popup
#    And I click Done button on the Popup
#    Then I should see check stats Screen
#    And I click Table Layout tab
#    And I click power button
#    Examples:
#      | table_no | number_of_seats | Menu_Item | Modifier    |card_number     |card_name|expire_date|
#      | T9         |1              |  French Friese | Steak  |3530111333300000|JCB      |1224       |
#
#
#  Scenario Outline: Check Payment through CC and customer & Merchant copy enabled tips
#    And I click new check button on the Table layout screen
#    And I select table as "<table_no>"
#    And I select the number of seats as "<number_of_seats>"
#    And I tap Continue to finish selecting the number of seats
#    And I get check number
#    And I select category as "FOOD"
#    And I select menu item as "<Menu_Item>"
#    And I select modifier as "<Modifier>"
#    And I click Done to get back
#    And I click Payment button in the Order Management Screen
#    And I click credit card payment on payment window
#    Then I should see total screen
#    And I click tip as 10
#    Then I should see tip is added with menu total as "<Total>"
#    And I click the Continue button on the Total screen
#    Then I should see your order card screen
#    Then I should see tip added on order screen
#    And I click manual button on the your order screen
#    And I pass the card number as "<card_number>"
#    And I pass card name as "<card_name>"
#    And I pass expire date as "<expire_date>"
#    And I click Process button on card screen
##    And I click Ok button in receipt printer popup
#    Then I should get back to the Table Layout tab
#    # Void check CC payment with tips
#    And I click Check Stats tab
#    And I click Closed tab on the Check stats
#    And I click the Closed check on check stats
#    And I click reopen check button on the check stats screen
#    Then I Should get back to the Order Screen
#    And I click Payment button in the Order Management Screen
#    And I click payment in the payment window
#    And I click Delete button on the payment window
##    And I click Ok button in receipt printer popup
#    Then I should see transaction void successful popup
#    And I click Done button on the Popup
#    And I click Exit to return to Order Management Screen
#    And I click print button on the order screen
#    And I click Done button on the Popup
#    And I click Void button on order management screen
#    Then I should see the void reason popup
#    And I click void Reason on the void popup
#    And I click Add Button on the void reason popup
#    Then I should see Receipt Printer popup
#    And I click Done button on the Popup
#    Then I should get back to the Table Layout tab
#    And I click Table Layout tab
#    And I click power button
#    Examples:
#      | table_no | number_of_seats |  Menu_Item     | Modifier |   card_number      | expire_date | card_name | Total    |
#      | T14      |1                |  French Friese | Steak    |  3530111333300000  | 1224        | JCB       | $ 15.00  |



  Scenario Outline: Create House account for new customers
    And I click new check button on the Table layout screen
    And I select table as "<table_no>"
    And I select the number of seats as "<number_of_seats>"
    And I tap Continue to finish selecting the number of seats
    And I click Add Customer Button
    And I search for "<customer_name>"
    When I click "<customer_name>" to select customer for the seat
    Then I should see customer as "Auto r" added on order screen
    And I click the customer name on the order screen
    Then I should see the customer profile window
    And I click customer plan button
    Then I should see Account type screen
  #  And I click house account field and enter recharge amount
    And I click update button
#    And I click save button in the account type screen
    And I Should get back to the Order Screen

#    And I click Cash button for Complete Sale
#    And I click Exact button on the cash pop-up
#    And I click Enter Button on the cash pop-up
#    Then I should get back to the Table Layout tab
#    And I click new check button on the Table layout screen
#    And I select table as "<table_no>"
#    And I select the number of seats as "<number_of_seats>"
#    And I tap Continue to finish selecting the number of seats
#    And I click Add Customer Button
#    And I search for "<customer_name>"
#    When I click "<customer_name>" to select customer for the seat
    And I get check number
    And I select category as "FOOD"
    And I select menu item as "<Menu_Item>"
    And I select modifier as "<Modifier>"
    And I click Done to get back
    Then I should see orderscreen with menu item prize as "<SubTotal>"
    Then I should see orderscreen with menu item Total without Discount or Tax as "<Total>"
    And I click Payment button in the Order Management Screen
    And I click house payment from the payment method popup
    Then I should see total screen
    And I click the Continue button on the Total screen
    Then I should see your order card screen
    And I click Process button on card screen
##    And I click Ok button in receipt printer popup
    Then I should get back to the Table Layout tab
    # Void HA payment check and again add menu item & Payment through HA
    And I click Check Stats tab
    And I click Closed tab on the Check stats
    And I click the Closed check on check stats
    And I click reopen check button on the check stats screen
    Then I Should get back to the Order Screen
    And I click Void button on order management screen
    Then I should see payment made on this check popup message for house account
    And I click Done button on the Popup
    And I click payment in the payment window
    And I click Delete button on the payment window
#    And I click Ok button in receipt printer popup
    And I click Exit to return to Order Management Screen
    And I select category as "FOOD"
    And I select menu item as "<Menu_Item>"
    And I select modifier as "<Modifier>"
    And I click Done to get back
    And I click Payment button in the Order Management Screen
    And I click house payment from the payment method popup
    Then I should see total screen
    And I click the Continue button on the Total screen
    Then I should see your order card screen
    And I click Process button on card screen
#    And I click Ok button in receipt printer popup
    Then I should get back to the Table Layout tab
    And I click Table Layout tab
    And I click power button
    Examples:
      | table_no | number_of_seats | customer_name | Menu_Item      | Modifier   | SubTotal |  Total  |
      | T8       |1                |  Auto ragav   |  French Friese | Steak      | $ 15.00  | $ 15.00 |


  Scenario Outline: Hold on empty check
    And I click new check button on the Table layout screen
    And I select table as "<table_no>"
    And I select the number of seats as "<number_of_seats>"
    And I tap Continue to finish selecting the number of seats
    And I click Options button
    When I click Hold to put order on hold
    Then I should see warning popup Can't Hold on this time
    And I click Done button on the Popup
    And I click Back button on Check Options Screen1
    And I click All
    And I click Table Layout tab
    #Hold Automatic
   #And I select category as "<Appetizers
    #And I select menu item as "<Menu_Item>"
    #And I select modifier as "<Modifier>"
    #And I click Done to get back
    #And I click Options button
    #And I click Hold to put order on hold
    #And I click Automatic button on Hold popup
    #And I click Done in the hold window
    #And I click Back button on Check Options Screen
    #Then I should see that OrderScreen with modifiers as "<Modifier>"
    #Then I should see the hold icon over the order section
    #Then I should see hold Icon change to Tick Icon
    #And I click Payment button in the Order Management Screen
    #And I click cash button from the payment method popup
    #And I click Submit button on the Payment Window
#    Then I should see the print or send receipt
#    And I click No thanks Button on the print receipt
    Then I should get back to the Table Layout tab
    # Tax Exempt - Trying to exempt a check from tax after payment
    And I click new check button on the Table layout screen
    And I select table as "<table_no>"
    And I select the number of seats as "<number_of_seats>"
    And I tap Continue to finish selecting the number of seats
    And I select Salad as category
    And I select menu item as "<Menu_Item1>"
    And I select modifier as "<Modifier1>"
    And I click Done to get back
    And I click Payment button in the Order Management Screen
    And I click cash button from the payment method popup
    And I click Exit to return to Order Management Screen
    And I click Options button
    When I click Tax Exempt Button

#    Then I should see tax exempt reasons
#    When I select School as reason
    Then I should see Paid amount exceeds the sale amount popup
    And I click Done button on the Popup
#    And I click Back button on Tax Exempt window
#    And I click Back button on Check Options Screen
    And I should see the tax reflected to the check
    And I click Payment button in the Order Management Screen
    And I click Submit button on the Payment Window
#    Then I should see the print or send receipt
#    And I click No thanks Button on the print receipt
    Then I should get back to the Table Layout tab
    And I click Table Layout tab
    And I click power button
    Examples:
      | table_no | number_of_seats |Menu_Item1 | Modifier1 |
      | T20      | 1               | CAESAR    | Anchovy   |


  Scenario Outline: Hold AutoMatic/Manual Payment - Confirm Send Kitchen On Order Management Screen(Manual Hold)
    And I click new check button on the Table layout screen
    And I select table as "<table_no>"
    And I select the number of seats as "<number_of_seats>"
    And I tap Continue to finish selecting the number of seats
    And I get check number
    And I select category as "Appetizers"
    And I select menu item as "<Menu_Item>"
    And I select modifier as "<Modifier>"
    And I click Done to get back
    And I click Options button
    And I click Hold to put order on hold
    And I click Done in the hold window
    When I click Back to return to Order Management Screen
    Then I should see the hold icon over the order section
    When I click Finish button
    Then I should get back to the Table Layout tab
    And I click Pay Check button
    When I click the check from the table layout
#    When I select "<table_no>" to pay check
    Then I should see the Payment window
    When I click cash button from the payment method popup
    Then I should see the send to kitchen warning popup
    And I click No button on send to kitchen popup
    And I click Exit to return to Order Management Screen
    When I click Print
#    Then I should see the send to kitchen warning popup
#    And I click Yes button on send to kitchen popup
#    Then I should see Receipt Printer popup
#    And I click Done button on the Popup
    When I click Finish button
    Then I should get back to the Table Layout tab
    Then I should see check down is increased
    When I click the check from the table layout
    Then I Should get back to the Order Screen
    And I click Payment button in the Order Management Screen

    And I click Submit button on the Payment Window
    Then I should see hold item need to send to kitchen popup
    And I click Done button on the Popup
#    Then I should see the print or send receipt
#    And I click No thanks Button on the print receipt
#    Then I should get back to the Table Layout tab
    And I click payment in the payment window
    And I click Delete button on the payment window
    And I click Exit to return to Order Management Screen
    And I click Void button on order management screen
    And I click void Reason on the void popup
    And I click Add Button on the void reason popup
    Then I should get back to the Table Layout tab
    #Order - Menu Items on Hold

    And I click new check button on the Table layout screen
    And I select table as "<table_no>"
    And I select the number of seats as "<number_of_seats>"
    And I tap Continue to finish selecting the number of seats
    And I select category as "FOOD"
    And I select menu item as "<Menu_Item3>"
    And I select menu item as "<Menu_Item1>"
    And I select modifier as "<Modifier1>"
    And I click Done to get back
    And I select menu item as "<Menu_Item2>"
    And I select modifier as "<Modifier2>"
    And I click Done to get back
    And I click menu item as "<Menu_Item3>" to see Menu option screen
    And I click Hold to put order on hold
    And I click Done in the hold window
    And I click Order button in the order management screen
    Then I should see do you want to send hold menu items to kitchen popup message from the order screen
    And I click Yes button on the popup for Hold item
#    And I click Yes button on the popup for Hold item1
    Then I should see Tick mark in the Menu item
    And I click Payment button in the Order Management Screen
    And I click cash button from the payment method popup
    And I click Submit button on the Payment Window
#    Then I should see the print or send receipt
#    And I click No thanks Button on the print receipt
    Then I should get back to the Table Layout tab
    And I click Table Layout tab
    And I click power button

    Examples:
      | table_no | number_of_seats | Menu_Item  | Modifier |Menu_Item3  |Menu_Item1  |Modifier1 |Menu_Item2    |Modifier2|
      | T21      | 1               | MINESTRONE | Butter   |Onion Rings | Tuna Tacos | Croutons | Garlic Bread | 4 BBQ   |


  Scenario Outline: On Hold to Check Down - Do you want send Hold menu to Kitchen popup
    And I click new check button on the Table layout screen
    And I select table as "<table_no>"
    And I select the number of seats as "<number_of_seats>"
    And I tap Continue to finish selecting the number of seats
    And I select category as "Appetizers"
    And I select menu item as "<Menu_Item>"
    And I select modifier as "<Modifier>"
    And I click Done to get back
    When I click Options button
    Then I should see the Check Options screen
    And I click Hold to put order on hold
    And I click Done in the hold window
    When I click Back to return to Order Management Screen
    Then I should see the hold icon over the order section
    And I click Payment button in the Order Management Screen
    And I click cash button from the payment method popup
    Then I should see the send to kitchen warning popup
    And I click Yes button on send to kitchen popup
    And I click Submit button on the Payment Window
        # Then I should see the print or send receipt
         #And I click No thanks Button on the print receipt
    Then I should get back to the Table Layout tab

      # Hold AutoMatic/Manual Payment - Confirm Send Kitchen On Order Management Screen(Manual Hold)
    And I click new check button on the Table layout screen
    And I select table as "<table_no>"
    And I select the number of seats as "<number_of_seats>"
    And I tap Continue to finish selecting the number of seats
    And I get check number
    And I select category as "Appetizers"
    And I select menu item as "<Menu_Item>"
    And I select modifier as "<Modifier>"
    And I click Done to get back
    And I click Options button
    And I click Hold to put order on hold
    And I click Done in the hold window
    When I click Back to return to Order Management Screen
    Then I should see the hold icon over the order section
    When I click Finish button
    Then I should get back to the Table Layout tab
    And I click Pay Check button
    When I click the check from the table layout
    Then I should see the Payment window
    When I click cash button from the payment method popup
    Then I should see the send to kitchen warning popup
    And I click No button on send to kitchen popup
    And I click Exit to return to Order Management Screen
    When I click Print
#    Then I should see the send to kitchen warning popup
#    And I click Yes button on send to kitchen popup
#    Then I should see Receipt Printer popup
#    And I click Done button on the Popup
    When I click Finish button
    Then I should get back to the Table Layout tab
    Then I should see check down is increased
    When I click the check from the table layout
    Then I Should get back to the Order Screen
    And I click Payment button in the Order Management Screen

    And I click Submit button on the Payment Window
    Then I should see hold item need to send to kitchen popup
    And I click Done button on the Popup
#    Then I should see the print or send receipt
#    And I click No thanks Button on the print receipt
#    Then I should get back to the Table Layout tab
    And I click payment in the payment window
    And I click Delete button on the payment window
    And I click Exit to return to Order Management Screen
    And I click Void button on order management screen
    And I click void Reason on the void popup
    And I click Add Button on the void reason popup
    Then I should get back to the Table Layout tab
    # On Hold AutoMatic/Manual Payment - Items should not to kitchen should be on hold
    And I click new check button on the Table layout screen
    And I select table as "<table_no>"
    And I select the number of seats as "<number_of_seats>"
    And I tap Continue to finish selecting the number of seats
    And I get check number
    And I select category as "Appetizers"
    And I select menu item as "<Menu_Item>"
    And I select modifier as "<Modifier>"
    And I click Done to get back
    And I click Options button
    And I click Hold to put order on hold
    And I click Done in the hold window
    When I click Back to return to Order Management Screen
    Then I should see the hold icon over the order section
    And I click Payment button in the Order Management Screen
    And I click cash button from the payment method popup
    Then I should see the send to kitchen warning popup
    And I click No button on send to kitchen popup
    And I click the Exit button in the payment window
    Then I should see the hold icon over the order section
    And I click Payment button in the Order Management Screen
    And I click cash button from the payment method popup
    Then I should see No more payment needed popup from Payment window
    And I click Done button on the Popup

    And I click Submit button on the Payment Window
    Then I should see hold item need to send to kitchen popup
    And I click Done button on the Popup
    And I click Exit to return to Order Management Screen
    And I click Void button on order management screen
    Then I should see payment made on this check popup message
    And I click Done button on the Popup
    And I click payment in the payment window
    And I click Delete button on the payment window
    And I click Exit to return to Order Management Screen
    And I click Void button on order management screen
#    And I click Submit button on the Payment Window
    And I click void Reason on the void popup
    And I click Add Button on the void reason popup
    Then I should get back to the Table Layout tab
   # Then I should see the print or send receipt
    #And I click No thanks Button on the print receipt

#   Scenario Outline: Hold AutoMatic/Manual Payment - All Items Should be send to kitchen
    And I click new check button on the Table layout screen
    And I select table as "<table_no>"
    And I select the number of seats as "<number_of_seats>"
    And I tap Continue to finish selecting the number of seats
    And I get check number
    And I select category as "Appetizers"
    And I select menu item as "<Menu_Item>"
    And I select modifier as "<Modifier>"
    And I click Done to get back
    And I click Options button
    And I click Hold to put order on hold
    And I click Done in the hold window
    When I click Back to return to Order Management Screen
    Then I should see the hold icon over the order section
    And I click Payment button in the Order Management Screen
    And I click cash button from the payment method popup
    Then I should see do you want to send hold menu items to kitchen popup message2
    And I click Yes button on send to kitchen popup
    And I click Submit button on the Payment Window
   # Then I should see the print or send receipt
    #And I click No thanks Button on the print receipt
    Then I should get back to the Table Layout tab
   # Hold AutoMatic/Manual Payment - Hold Item should need to send to kitchen
    And I click new check button on the Table layout screen
    And I select table as "<table_no>"
    And I select the number of seats as "<number_of_seats>"
    And I tap Continue to finish selecting the number of seats
    And I get check number
    And I select category as "Appetizers"
    And I select menu item as "<Menu_Item>"
    And I select modifier as "<Modifier>"
    And I click Done to get back
    And I click Options button
    And I click Hold to put order on hold
    And I click Done in the hold window
    When I click Back button on Check Options Screen
    Then I should see the hold icon over the order section
    And I click Payment button in the Order Management Screen
    And I click cash button from the payment method popup
    Then I should see do you want to send hold menu items to kitchen popup message2
    And I click No button on send to kitchen popup
    And I click Submit button on the Payment Window
    Then I should see hold item need to send to kitchen popup
    And I click Done button on the Popup
    And I click cash button from the payment method popup
    Then I should see No more payment needed popup from Payment window
    And I click Done button on the Popup
    And I click payment in the payment window
    And I click Delete button on the payment window
    And I click Exit to return to Order Management Screen
    And I click Void button on order management screen
    And I click void Reason on the void popup
    And I click Add Button on the void reason popup
    Then I should get back to the Table Layout tab

  #  Then I should see the print or send receipt
   # And I click No thanks Button on the print receipt
    And I click power button
    Examples:
      | table_no | number_of_seats | Menu_Item  | Modifier |
      | T22      | 1               | MINESTRONE | Butter   |


  Scenario Outline: order menu Resend to kitchen
    And I click new check button on the Table layout screen
    And I select table as "<table_no>"
    And I select the number of seats as "<number_of_seats>"
    And I tap Continue to finish selecting the number of seats
    And I select category as "FOOD"
    And I select menu item as "<Menu_Item_1>"
    And I select menu item as "<Menu_Item_2>"
    And I select modifier as "<Modifier>"
    And I click Order button in the order management screen
    And I click Options button
    When I click resend to kitchen
    And I click Payment button in the Order Management Screen
    And I click cash button from the payment method popup
    And I click Submit button on the Payment Window
    Then I should get back to the Table Layout tab
    # unorder menu Resend to kitchen
    And I click new check button on the Table layout screen
    And I select table as "<table_no1>"
    And I select the number of seats as "<number_of_seats>"
    And I tap Continue to finish selecting the number of seats
    And I select category as "FOOD"
    And I select menu item as "<Menu_Item_1>"
    And I select menu item as "<Menu_Item_2>"
    And I select modifier as "<Modifier>"
    And I click Options button
    When I click resend to kitchen
    And I click Payment button in the Order Management Screen
    And I click cash button from the payment method popup
    And I click Submit button on the Payment Window
#    Then I should see the print or send receipt
#    And I click No thanks Button on the print receipt
    Then I should get back to the Table Layout tab
    And I click Table Layout tab
    And I click power button
    Examples:
      | table_no | number_of_seats | Menu_Item_1 | Menu_Item_2 | Modifier |table_no1|
      | T22      | 1               | Onion Rings | Tuna Tacos  | Croutons |T23      |


  Scenario Outline:Tax exempt should be cancelled when a customer is chosen
    #To Exempt a check from tax
    #Tax Exempt- From Order Screen/Payment Screen
    And I click new check button on the Table layout screen
    And I select table as "<table_no>"
    And I select the number of seats as "<number_of_seats>"
    And I tap Continue to finish selecting the number of seats
    And I select Salad as category
    And I select menu item as "<Menu_Item>"
    And I select modifier as "<Modifier>"

    Then I should see the tax amount reflected to the check as "<Tax>"
    Then I should see orderscreen with menu item prize as "<SubTotal>"
    Then I should see orderscreen with menu item Total without Discount or Tax as "<Total>"

    And I click Options button
    And I click Tax Exempt Button
    Then I should not see tax on the order screen
#    Then I should see tax exempt reasons
#    And  I select School as reason
#    And I should return back to the order management screen and I should not see the tax amount

#    Then I should see the tax reflected to the check
    Then I should see orderscreen with menu item prize as "<SubTotal1>"
    Then I should see orderscreen with menu item Total without Tax Exempt as "<Total1>"
    #Tax exempt should be cancelled when a customer is chosen
    And I click Add Customer Button
#    And I click Add new button
    And I search for "<customer_name>"
    When I click "<customer_name>" to select customer for the seat
    Then I should return back to the order management screen and I should not see the tax amount
    And I click Payment button in the Order Management Screen
    And I click cash button from the payment method popup
    And I click Submit button on the Payment Window
#    Then I should see the print or send receipt
#    And I click No thanks Button on the print receipt
    Then I should get back to the Table Layout tab
    And I click Table Layout tab
    And I click power button
    Examples:
      | table_no | number_of_seats | customer_name | Menu_Item | Modifier |    Tax  |SubTotal     |   Total   | SubTotal1   |Total1     |
      | T11      | 1               | tax exe       | CAESAR    | Anchovy  |$ 1.40   | $ 7.00      |$ 8.40     | $ 7.00      | $ 7.00    |


#  Scenario Outline: Tax Exempt- Reopened check Screen
#    And I click new check button on the Table layout screen
#    And I select table as "<table_no>"
#    And I select the number of seats as "<number_of_seats>"
#    And I tap Continue to finish selecting the number of seats
#    And I get check number
#    And I select Salad as category
#    And I select menu item as "<Menu_Item>"
#    And I select modifier as "<Modifier>"
#    And I click Done to get back
#    Then I should see the tax amount reflected to the check as "<Tax>"
#    Then I should see orderscreen with menu item prize as "<SubTotal>"
#    Then I should see orderscreen with menu item Total without Discount or Tax as "<Total>"
#    And I click Cash button for Complete Sale
#    And I click Exact button on the cash pop-up
#    And I click Enter Button on the cash pop-up
#    Then I should get back to the Table Layout tab
##    And I click Check Stats tab
##    And I click Closed tab on the Check stats
##    And I click the Closed check on check stats
##    And I click reopen check button on the check stats screen
##    Then I Should get back to the Order Screen
##    And I click Payment button in the Order Management Screen
##    Then I should see the Payment window
##    And I click Tax Exempt Button from the Payment Screen
##    Then I should see tax exempt reasons
##    When I select School as reason
##    Then I should see Paid amount exceeds the sale amount popup
##    And I click Done button on the Popup
##    And I click Back button on Tax Exempt window
##    And I click Back button on Check Options Screen
##    And I click Submit button on the Payment Window
##    Then I should get back to the Table Layout tab
##    And I click Table Layout tab
#
#    #Tax Exempt- Payment Screen
#    And I click new check button on the Table layout screen
#    And I select table as "<table_no>"
#    And I select the number of seats as "<number_of_seats>"
#    And I tap Continue to finish selecting the number of seats
#    And I select Salad as category
#    And I select menu item as "<Menu_Item>"
#    And I select modifier as "<Modifier>"
#    Then I should see the tax amount reflected to the check as "<Tax>"
#    Then I should see orderscreen with menu item prize as "<SubTotal>"
#    Then I should see orderscreen with menu item Total without Discount or Tax as "<Total>"
#    And I click Payment button in the Order Management Screen
#    Then I should see the Payment window
#    And I click Tax Exempt Button from the Payment Screen
##    Then I should see tax exempt reasons
##    When I select School as reason
#    Then I Should get back to the Order Screen
#    Then I should see orderscreen with menu item prize as "<SubTotal1>"
#    And I should see the tax reflected to the check
#    Then I should see orderscreen with menu item Total without Tax Exempt as "<Total1>"
#    And I click Void button on order management screen
#    Then I should see All orders are voided
#    And I click Done button on the Popup
#    And I click All
#    And I click Table Layout tab
#    And I click power button
#
#    Examples:
#      | table_no | number_of_seats | Menu_Item | Modifier | Tax     |   SubTotal | Total      |  SubTotal1  | Total1    |
#      | T15      | 1               | CAESAR    | Anchovy  |$ 1.40   | $ 7.00     |$ 8.40      | $ 7.00      | $ 7.00    |


  Scenario Outline: Tax Exempt- From Order Screen/Payment Screen - Paid amount Exceeding sale amount
    And I click new check button on the Table layout screen
    And I select table as "<table_no>"
    And I select the number of seats as "<number_of_seats>"
    And I tap Continue to finish selecting the number of seats
    And I select Salad as category
    And I select menu item as "<Menu_Item>"
    And I select modifier as "<Modifier>"
    And I click Done button on the Popup
    Then I should see the tax amount reflected to the check as "<Tax>"
    Then I should see orderscreen with menu item prize as "<SubTotal>"
    Then I should see orderscreen with menu item Total without Discount or Tax as "<Total>"
    And I click Payment button in the Order Management Screen
    Then I should see the Payment window
    And I click cash button from the payment method popup
    Then I should see cash payment is added in payment window
    And I click Exit to return to Order Management Screen
    And I click Options button
    And I click Tax Exempt Button
#    Then I should not see tax on the order screen
#    Then I should see tax exempt reasons
#    And  I select School as reason
    Then I should see Paid amount exceeds the sale amount popup
    And I click Done button on the Popup
#    And I click Back button on Tax Exempt window
#    And I click Back button on Check Options Screen
    And I click Payment button in the Order Management Screen
    Then I should see the Payment window
    And I click Submit button on the Payment Window
#     Then I should see the print or send receipt
#     And I click No thanks Button on the print receipt
    Then I should get back to the Table Layout tab

    And I click Table Layout tab
    And I click power button
    Examples:
      | table_no | number_of_seats | Menu_Item | Modifier | Tax     |   SubTotal | Total      |
      | T15      | 1               | CAESAR    | Anchovy  |$ 1.40   | $ 7.00     |$ 8.40      |


  Scenario Outline: Remove- Tax Exempt from Order Screen/Payment Screen.
    And I click new check button on the Table layout screen
    And I select table as "<table_no>"
    And I select the number of seats as "<number_of_seats>"
    And I tap Continue to finish selecting the number of seats
    And I select Salad as category
    And I select menu item as "<Menu_Item>"
    And I select modifier as "<Modifier>"
    And I click Options button
    And I click Tax Exempt Button
    Then I should not see tax on the order screen
#    Then I should see tax exempt reasons
#    And  I select School as reason
    And I click Payment button in the Order Management Screen
    And I click cash button from the payment method popup
    And I click Exit to return to Order Management Screen
    And I click Options button
    When I click Tax Exempt Button
    Then I should see the tax reflected to the check
#    Then I should see Tax Exempt removed successfully popup
#    And I click Done button on the Popup
    And I click Payment button in the Order Management Screen
    And I click cash button from the payment method popup
    And I click Submit button on the Payment Window
    Then I should get back to the Table Layout tab
    #Remove- Tax Exempt from Check Stats Screen.
    And I click new check button on the Table layout screen
    And I select table as "<table_no>"
    And I select the number of seats as "<number_of_seats>"
    And I tap Continue to finish selecting the number of seats
    And I get check number
    And I select Salad as category
    And I select menu item as "<Menu_Item>"
    And I select modifier as "<Modifier>"
    And I click Options button
    And I click Tax Exempt Button
    Then I should not see tax on the order screen
#    Then I should see tax exempt reasons
#    And  I select School as reason
    And I click Payment button in the Order Management Screen
    And I click cash button from the payment method popup
    And I select the payment
    And I click Submit button on the Payment Window
    Then I should get back to the Table Layout tab
    And I click Check Stats tab
    And I select Closed checks tab
    And I click the Closed check on check stats
    And I click reopen check button on the check stats screen
    Then I Should get back to the Order Screen
    And I click Options button
    When I click Tax Exempt Button
    Then I should see the tax reflected to the check
#    Then I should see Tax Exempt removed successfully popup
#    And I click Done button on the popup in check options page
    And I click Payment button in the Order Management Screen
    And I click cash button from the payment method popup
    And I click Submit button on the Payment Window
#    Then I should see the print or send receipt
#    And I click No thanks Button on the print receipt
    Then I should get back to the Table Layout tab
    And I click Table Layout tab
    And I click power button
    Examples:
      | table_no | number_of_seats | Menu_Item | Modifier |
      | T15      | 1               | CAESAR    | Anchovy  |


  Scenario Outline: Adding an open item to an existing check
    And I click new check button on the Table layout screen
    And I select table as "<table_no>"
    And I select the number of seats as "<number_of_seats>"
    And I tap Continue to finish selecting the number of seats
    And I click Options button
    And I click Open Item button

#
    Then I should see open item screen
    And I click Coursing Name text field for Menu option
#    And I swipe to "<course_name>" as Coursing Name
#    And I pass course name as "onion"
#    And I tap Price text field for menu option
#    And I enter the percentage1 as "3100"
#    And I click Done button on the open item window
#    Then I should navigate to Order Management screen and see the added open item as "onion"
#    And I select Discount on the Order screen
#    Then I should see Check Based Discount Screen
#    And I click Discount as "CB-AfterTax-OpenItem"
#    And I click Back button on Discount Screen


#    And I click Coursing Name text field
    And I swipe to "<course_name>" as Coursing Name
    And I enter course name as "<open_Item>" for check based open item
    And I tap Price text field
    And I enter the percentage1 as "10000"
    And I select the Tax
    And I click Done button on the open item window
#    When I click Back button on Check Options Screen
    Then I should navigate to Order Management screen and see the added open item1 as "<open_Item>"
    And I click All
    And I click Table Layout tab
    # Modify an Order in the Check Options Screen
    And I click new check button on the Table layout screen
    And I select table as "<table_no>"
    And I select the number of seats as "<number_of_seats>"
    And I tap Continue to finish selecting the number of seats
    And I select category as "FOOD"
    And I select menu item as "<Menu_Item>"
    And I select the serving size as "<Serving_Size>"
    And I select modifier as "<Modifier_1>"
    And I click Done to get back
    And I click Options button
    Then I should see the Check Options screen
    And I click Modify
    And I click modifier as "<Modifier_1>" on the order screen
    And I select modifier as "<Modifier_2>"
    When I click Done button to finish modifying
    Then I should return back to the order management screen and I should verify that the "<Modifier_1>" and "<Modifier_2>" are listed under the menu item
    And I click Void button on order management screen
    Then I should see All orders are voided
    And I click Done button on the Popup
    And I click All
    And I click Table Layout tab
    And I click power button
    Examples:
      | table_no | number_of_seats |open_Item | course_name |Menu_Item           |Serving_Size|Modifier_1  |Modifier_2     |
      | T13      | 1               | Tiramisu |DESSERT      |Pizza Rucola 12inch |DOUBLE      |Add Steak   |Add Chicken    |


  Scenario Outline: Gratuity - Should available based on the BO
    And I click new check button on the Table layout screen
    And I select table as "<table_no>"
    And I select the number of seats as "<number_of_seats>"
    And I tap Continue to finish selecting the number of seats
    And I select category as "FOOD"
    And I select menu item as "<Menu_Item>"
    And I select modifier as "<Modifier>"
    And I click Done to get back
    And I click Options button
    Then I should see the Check Options screen
    And I click Gratuity button
    Then I should see Add Gratuity screen

       # Gratuity - Fixed
    And I click Gratuity Fixed button
    Then I should return back to the order management screen and I should Gratuity is added
    And I click Void button on order management screen
    Then I should see All orders are voided
    And I click Done button on the Popup
      # Remove Gratuity- Gratuity value should be removed
    And I select category as "FOOD"
    And I select menu item as "<Menu_Item>"
    And I select modifier as "<Modifier>"
    And I click Done to get back
    And I click Options button
    Then I should see the Check Options screen
    And I click Gratuity button
    Then I should see Add Gratuity screen
    And I click Gratuity Fixed button
    Then I should return back to the order management screen and I should not see Gratuity is added
    And I click Void button on order management screen
    Then I should see All orders are voided
    And I click Done button on the Popup

      #Gratuity Varying - allow to apply gratuity
    And I select category as "FOOD"
    And I select menu item as "<Menu_Item>"
    And I select modifier as "<Modifier>"
    And I click Done to get back
    And I click Options button
    Then I should see the Check Options screen
    And I click Gratuity button
    Then I should see Add Gratuity screen
    And I click Gratuity varying button
    Then I should see enter Percentage popup
    And I pass the value and click Apply button as "<Percentage>"
    Then I should return back to the order management screen and I should Gratuity is added
    And I click Options button
    Then I should see the Check Options screen
    And I click Gratuity button
    Then I should see Add Gratuity screen
    And I click Gratuity varying button
    And I click Void button on order management screen
    Then I should see All orders are voided
    And I click Done button on the Popup

      # Gratuity Varying , Not allow to apply Gratuity
    And I select category as "FOOD"
    And I select menu item as "<Menu_Item>"
    And I select modifier as "<Modifier>"
    And I click Done to get back
    And I click Options button
    Then I should see the Check Options screen
    And I click Gratuity button
    Then I should see Add Gratuity screen
    And I click Gratuity varying button
    Then I should see enter Percentage popup
    And I pass the value and click Apply button as "<Percentage1>"
    Then I should see enter value according to BO
    And I click Done button on the Popup
    And I pass the value and click Apply button as "<Percentage>"
    Then I should return back to the order management screen and I should Gratuity is added
    And I click Options button
    Then I should see the Check Options screen
    And I click Gratuity button
    Then I should see Add Gratuity screen
    And I click Gratuity varying button
    And I click Void button on order management screen
    Then I should see All orders are voided
    And I click Done button on the Popup

      #Check with vary gratuity
    And I select Menu as category
    And I select menu item as "<Menu_Item1>"
    And I click Options button
    Then I should see the Check Options screen
    And I click Gratuity button
    Then I should see Add Gratuity screen
    And I click Gratuity varying button
    Then I should see enter Percentage popup
    And I pass the value and click Apply button as "<Percentage>"
    Then I Should get back to the Order Screen
    Then I should see orderscreen with menu item prize as "<SubTotal>"
    Then I should see the tax amount reflected to the check as "<Tax>"
    Then I should see the Gratuity amount reflected to the check as "<Gratuity>"
    Then I should see orderscreen with menu item Total as "<Total>"
    And I click Options button
    Then I should see the Check Options screen
    And I click Gratuity button
    Then I should see Add Gratuity screen
    And I click Gratuity varying button
    And I click Void button on order management screen
    Then I should see All orders are voided
    And I click Done button on the Popup
    And I click All
    And I click Table Layout tab

      #Check With Fixed Gratuity
    And I click new check button on the Table layout screen
    And I select table as "<table_no>"
    And I select the number of seats as "<number_of_seats>"
    And I tap Continue to finish selecting the number of seats
    And I select Menu as category
    And I select menu item as "<Menu_Item1>"
    And I click Options button
    Then I should see the Check Options screen
    And I click Gratuity button
    Then I should see Add Gratuity screen
    And I click Gratuity Fixed button
    Then I Should get back to the Order Screen
    Then I should see orderscreen with menu item prize as "<SubTotal1>"
    Then I should see the tax amount reflected to the check as "<Tax1>"
    Then I should see the Gratuity amount reflected to the check as "<Gratuity1>"
    Then I should see orderscreen with menu item Total as "<Total1>"
    And I click Cash button for Complete Sale
    And I click Exact button on the cash pop-up
    And I click Enter Button on the cash pop-up
#      Then I should see the print or send receipt
#      And I click No thanks Button on the print receipt
    Then I should get back to the Table Layout tab

#  Scenario Outline: Remove Gratuity - Paid Amount Exceeding sale amount
    And I click new check button on the Table layout screen
    And I select table as "<table_no>"
    And I select the number of seats as "<number_of_seats>"
    And I tap Continue to finish selecting the number of seats
    And I select category as "FOOD"
    And I select menu item as "<Menu_Item>"
    And I select modifier as "<Modifier>"
    And I click Done to get back
    And I click Options button
    Then I should see the Check Options screen
    And I click Gratuity button
    Then I should see Add Gratuity screen
    And I click Gratuity Fixed button
    Then I should return back to the order management screen and I should Gratuity is added
    And I click Payment button in the Order Management Screen
    And I click cash button from the payment method popup
    And I click the Exit button in the payment window
    And I click Options button
    Then I should see the Check Options screen
    And I click Gratuity button
    Then I should see Add Gratuity screen
    And I click Gratuity Fixed button
    #Then I should see gratuity cannot be removed for paid check popup
#    Then I should see gratuity cannot be removed for paid check popup
    And I should see Paid amount exceeding the sale amount popup

    And I click Done button on the Popup
#    And I click Back button on Tax Exempt window
#    And I click Back button on Check Options Screen
    And I click Payment button in the Order Management Screen
    And I click Submit button on the Payment Window
#      Then I should see the print or send receipt
#      And I click No thanks Button on the print receipt
    Then I should get back to the Table Layout tab
    And I click Table Layout tab
    And I click power button
    Examples:
      | table_no    | number_of_seats | Menu_Item      | Modifier |Percentage|Percentage1 |Menu_Item1|   SubTotal  | Tax      | Gratuity   |Total       |    SubTotal1  | Tax1      | Gratuity1   |Total1       |
      | T23         |1                |  French Friese | Steak    |8         |3           | Halwa    | $ 10.00     | $ 1.00   |  $ 0.80    | $ 11.80    | $ 10.00       | $ 1.00    |  $ 1.00     | $ 12.00     |


  Scenario Outline: Check - Reduce Gratuity
    And I click new check button on the Table layout screen
    And I select table as "<table_no>"
    And I select the number of seats as "<number_of_seats>"
    And I tap Continue to finish selecting the number of seats
    And I select category as "FOOD"
    And I select menu item as "<Menu_Item>"
    And I select modifier as "<Modifier>"
    And I click Done to get back
    And I click Options button
    Then I should see the Check Options screen
    And I click Gratuity button
    Then I should see Add Gratuity screen
    And I click Gratuity Fixed button
    Then I should return back to the order management screen and I should Gratuity is added
    And I click Payment button in the Order Management Screen
    And I click cash button from the payment method popup
    And I click the Exit button in the payment window
    And I click Options button
    Then I should see the Check Options screen
    And I click Gratuity button
    Then I should see Add Gratuity screen
    And I click Gratuity varying button
    Then I should see enter Percentage popup
    And I pass the value and click Apply button as "<Percentage>"
    Then I should see Paid amount exceeds the sale amount popup
    And I click Done button on the Popup
#    And I click Back button on Tax Exempt window
#    And I click Back button on Check Options Screen
    And I click Payment button in the Order Management Screen
    And I click Submit button on the Payment Window
    Then I should get back to the Table Layout tab
    And I click Table Layout tab
    And I click power button
    Examples:
      | table_no | number_of_seats | Menu_Item      | Modifier | Percentage |
      | T9       |1                |  French Friese | Steak    | 8          |


  Scenario Outline: Modify Cancel,Fire Coursing
     # Fire Coursing
    And I click new check button on the Table layout screen
    And I select table as "<table_no>"
    And I select the number of seats as "<number_of_seats>"
    And I tap Continue to finish selecting the number of seats
    And I select category as "FOOD"
    And I select menu item as "<Menu_Item>"
    And I select modifier as "<modifier>"
    And I click Done to get back
    And I click Order button in the order management screen
    And I click Options button
    Then I should see the Check Options screen
    And I select fire coursing Button
    Then I should see fire coursing
    And I click Coursing Name as "<Course>"
    And I click Back button on the Fire Coursing screen
    And I click Back button on Check Options Screen
    And I click Payment button in the Order Management Screen
    And I click cash button from the payment method popup
    And I click Submit button on the Payment Window
#    Then I should see the print or send receipt
#    And I click No thanks Button on the print receipt
    Then I should get back to the Table Layout tab
    # Modify Cancel #Modify - Delete Modifiers
    And I click new check button on the Table layout screen
    And I select table as "<table_no>"
    And I select the number of seats as "<number_of_seats>"
    And I tap Continue to finish selecting the number of seats
    And I select FOOD as category
    And I select menu item as "<Menu_Item>"
    And I select modifier as "<modifier>"
    And I click Done to get back
    And I click Options button
    Then I should see the Check Options screen
    And I click Modify
    And I click Order List with Menu item as "<Menu_Item>"
    Then I should see modifier screen
    And I click modifier as "<modifier1>" on modifier screen

    Then I should see modifiers added in the Selected modifiers as "<modifier1>"
#    And I touch and swipe the modifiers
    And I click Ok button on the modifier screen
    Then I should see modifier as "<modifier1>" applied on order screen
    And I click delete button for delete modifiers
    Then I should not see modifier as "<modifier1>" applied on order screen
    And I click Void button on order management screen
    And I click Done button on the Popup
    And I click All
    Then I should get back to the Table Layout tab
    # Modify - Application should allow to add modifiers at its maximum qty per item
    And I click new check button on the Table layout screen
    And I select table as "<table_no>"
    And I select the number of seats as "<number_of_seats>"
    And I tap Continue to finish selecting the number of seats
    And I select category as "FOOD"
    And I select menu item as "<Menu_Item>"
    And I select modifier as "<modifier>"
    And I click Done to get back
    And I click Options button
    Then I should see the Check Options screen
    And I click Modify
    And I click menu item as "<Menu_Item>" to see Menu option screen
#    And I click Order List with Menu item as "<Menu_Item>"
    Then I should see modifier screen
#    And I select modifier as "<Modifier>" from the modifier window
    And I click modifier as "<modifier1>" Maximum time
    Then I should see modifiers added in multi times the Selected modifiers as "<modifier1>"
    And I click Ok button on the modifier screen
    Then I should see that OrderScreen with modifiers as "<modifier1>"
    And I click Void button on order management screen
    Then I should see All orders are voided
    And I click Done button on the Popup
    And I click All
    And I click Table Layout tab
    # Modify - Should come back to order screen with selected modifiers
    And I click new check button on the Table layout screen
    And I select table as "<table_no>"
    And I select the number of seats as "<number_of_seats>"
    And I tap Continue to finish selecting the number of seats
    And I select category as "FOOD"
    And I select menu item as "<Menu_Item>"
    And I select modifier as "<modifier>"
    And I click Done to get back
    And I click Options button
    Then I should see the Check Options screen
    And I click Modify
    And I click menu item as "<Menu_Item>" to see Menu option screen
    Then I should see modifier screen
    And I click modifier as "<modifier1>" on modifier screen
    And I click Ok button on the modifier screen
    Then I should see that OrderScreen with modifiers as "<modifier1>"
    And I click Void button on order management screen
    Then I should see All orders are voided
    And I click Done button on the Popup
    And I click All
    And I click Table Layout tab
    And I click power button
    Examples:
      | table_no | number_of_seats | Menu_Item     | modifier | modifier1   |Course|
      | T10      |1                | French Friese | Steak    | Anchoives   |ENTREE|


  Scenario Outline: Verify whether application can allow to remove the applied Discount for the check when user click appliedDiscount from discount screen
    And I click new check button on the Table layout screen
    And I select table as "<table_no>"
    And I select the number of seats as "<number_of_seats>"
    And I tap Continue to finish selecting the number of seats
    And I select Menu as category
    And I select menu item as "<Menu_Item>"
    And I change the Quantity of menu Item as "7"
    And I select Discount on the Order screen
    Then I should see Check Based Discount Screen
    And I click Discount as "<Discount>"
    And I click Back button on Discount Screen
    Then I should see orderscreen with as "<Discount>"
    And I select Discount on the Order screen
    Then I should see Check Based Discount Screen
    And I click Discount1 as "<Discount>"
    And I click Back button on Discount Screen
    Then I should see orderscreen with as "<Discount>"
    #Discount
    And I select Discount on the Order screen
    Then I should see Check Based Discount Screen
    And I click Discount as "<Discount>"
    And I click Back button on Discount Screen
    Then I should see orderscreen with as "<Discount>"
    And I click Payment button in the Order Management Screen
    And I click cash button from the payment method popup
    And I click Submit button on the Payment Window
    Then I should get back to the Table Layout tab
    And I click power button
    Examples:
      | table_no | number_of_seats | Menu_Item  | Discount           |
      | T10      |1                | Halwa      | Check Based Amount |


  Scenario Outline: Check with discount(item based - Before tax) as percentage
    And I click new check button on the Table layout screen
    And I select table as "<table_no>"
    And I select the number of seats as "<number_of_seats>"
    And I tap Continue to finish selecting the number of seats
    And I select Pasta as category
    And I select menu item as "<Menu_Item>"
    And I select modifier as "<Modifier>"
    And I click Done to get back
    And I select Discount on the Order screen
    Then I should see Check Based Discount Screen
    And I click Discount as "<Discount>"
    And I click Back button on Discount Screen
    Then I should see orderscreen with menu item prize as "<SubTotal>"
    Then I should see the tax amount reflected to the check as "<Tax>"
    Then I should see the Discount amount reflected to the check as "<Discount1>"
    Then I should see orderscreen with menu item Total as "<Total>"
    And I click Cash button for Complete Sale
    And I click Exact button on the cash pop-up
    And I click Enter Button on the cash pop-up
#    Then I should see the print or send receipt
#    And I click No thanks Button on the print receipt
    Then I should get back to the Table Layout tab

   #Check with discount(item based - After tax) as percentage
    And I click new check button on the Table layout screen
    And I select table as "<table_no>"
    And I select the number of seats as "<number_of_seats>"
    And I tap Continue to finish selecting the number of seats
    And I select Pasta as category
    And I select menu item as "<Menu_Item>"
    And I select modifier as "<Modifier>"
    And I click Done to get back
    And I select Discount on the Order screen
    Then I should see Check Based Discount Screen
    And I click Discount as "<Discount2>"
    And I click Back button on Discount Screen
    Then I should see orderscreen with menu item prize as "<SubTotal1>"
    Then I should see the tax amount reflected to the check as "<Tax1>"
    Then I should see the Discount amount reflected to the check as "<txtDiscount2>"
    Then I should see orderscreen with menu item Total as "<Total1>"
    And I click Cash button for Complete Sale
    And I click Exact button on the cash pop-up
    And I click Enter Button on the cash pop-up
#    Then I should see the print or send receipt
#    And I click No thanks Button on the print receipt
    Then I should get back to the Table Layout tab

    #Check with discount(item based - After tax) as Amount 10
    And I click new check button on the Table layout screen
    And I select table as "<table_no>"
    And I select the number of seats as "<number_of_seats>"
    And I tap Continue to finish selecting the number of seats
    And I select Pasta as category
    And I select menu item as "<Menu_Item>"
    And I select modifier as "<Modifier>"
    And I click Done to get back
    And I select Discount on the Order screen
    Then I should see Check Based Discount Screen
    And I click Discount as "<Discount3>"
    And I click Back button on Discount Screen
    Then I should see orderscreen with menu item prize as "<SubTotal2>"
    Then I should see the tax amount reflected to the check as "<Tax2>"
    Then I should see the Discount amount reflected to the check as "<txtDiscount3>"
    Then I should see orderscreen with menu item Total as "<Total2>"
    And I click Cash button for Complete Sale
    And I click Exact button on the cash pop-up
    And I click Enter Button on the cash pop-up
    Then I should get back to the Table Layout tab
    #Check with discount(item based - Before tax) as Amount 10
    And I click new check button on the Table layout screen
    And I select table as "<table_no>"
    And I select the number of seats as "<number_of_seats>"
    And I tap Continue to finish selecting the number of seats
    And I select Pasta as category
    And I select menu item as "<Menu_Item>"
    And I select modifier as "<Modifier>"
    And I click Done to get back
    And I select Discount on the Order screen
    Then I should see Check Based Discount Screen
    And I click Discount as "<Discount4>"
    And I click Back button on Discount Screen
    Then I should see orderscreen with menu item prize as "<SubTotal3>"
    Then I should see the tax amount reflected to the check as "<Tax3>"
    Then I should see the Discount amount reflected to the check as "<txtDiscount4>"
    Then I should see orderscreen with menu item Total as "<Total3>"
    And I click Cash button for Complete Sale
    And I click Exact button on the cash pop-up
    And I click Enter Button on the cash pop-up
    Then I should get back to the Table Layout tab
    And I click Table Layout tab
    And I click power button
    Examples:
      | table_no | number_of_seats  |Menu_Item   | Modifier |Discount                 |Discount1  | SubTotal    | Tax       | Total   |Discount2               |txtDiscount2|  SubTotal1    |    Tax1  |Total1      |         Discount3          |txtDiscount3 |SubTotal2    |Tax2       |Total2       |Discount4           |txtDiscount4|  SubTotal3  |Tax3       |Total3      |
      | T12      |1                 | Ravioli    | Butter   | IB-BeforeTax-Percentage |$ 1.40     | $ 14.00     | $ 1.26    | $ 13.86 | IB-AfterTax-Percentage |$ 1.40      | $ 14.00       | $ 1.40   | $ 14.00    |   IB-AfterTax-Amount       |$ 1.00       | $ 14.00     | $ 1.40    | $ 14.40     |IB-BeforeTax-Amount |$ 1.00      | $ 14.00     | $ 1.30    | $ 14.30    |


  Scenario Outline: Check with discount(item based - After tax) as Set Price 500
    And I click new check button on the Table layout screen
    And I select table as "<table_no>"
    And I select the number of seats as "<number_of_seats>"
    And I tap Continue to finish selecting the number of seats
    And I select Pasta as category
    And I select menu item as "<Menu_Item>"
    And I select modifier as "<Modifier>"
    And I click Done to get back
    And I select Discount on the Order screen
    Then I should see Check Based Discount Screen
    And I click Discount as "<Discount>"
    And I click Back button on Discount Screen
    Then I should see orderscreen with menu item prize as "<SubTotal>"
    Then I should see the tax amount reflected to the check as "<Tax>"
    Then I should see the Discount amount reflected to the check as "<Discount1>"
    Then I should see orderscreen with menu item Total as "<Total>"
    And I click Cash button for Complete Sale
    And I click Exact button on the cash pop-up
    And I click Enter Button on the cash pop-up
#    Then I should see the print or send receipt
#    And I click No thanks Button on the print receipt
    Then I should get back to the Table Layout tab
      #Check with discount(item based - Before tax) as Set Price 500
    And I click new check button on the Table layout screen
    And I select table as "<table_no>"
    And I select the number of seats as "<number_of_seats>"
    And I tap Continue to finish selecting the number of seats
    And I select Pasta as category
    And I select menu item as "<Menu_Item>"
    And I select modifier as "<Modifier>"
    And I click Done to get back
    And I select Discount on the Order screen
    Then I should see Check Based Discount Screen
    And I click Discount as "<Discount2>"
    And I click Back button on Discount Screen
    Then I should see orderscreen with menu item prize as "<SubTotal1>"
    Then I should see the tax amount reflected to the check as "<Tax1>"
    Then I should see the Discount amount reflected to the check as "<txtDiscount2>"
    Then I should see orderscreen with menu item Total as "<Total1>"
    And I click Cash button for Complete Sale
    And I click Exact button on the cash pop-up
    And I click Enter Button on the cash pop-up
#    Then I should see the print or send receipt
#    And I click No thanks Button on the print receipt
    Then I should get back to the Table Layout tab
    #Check with discount(item based - Before tax) as Free Item
    And I click new check button on the Table layout screen
    And I select table as "<table_no>"
    And I select the number of seats as "<number_of_seats>"
    And I tap Continue to finish selecting the number of seats
    And I select Pasta as category
    And I select menu item as "<Menu_Item>"
    And I select modifier as "<Modifier>"
    And I click Done to get back
    And I select Discount on the Order screen
    Then I should see Check Based Discount Screen
    And I click Discount as "<Discount3>"
    And I click Back button on Discount Screen
    Then I should see orderscreen with as Onion Rings EACH
    Then I should see orderscreen with menu item prize as "<SubTotal2>"
    Then I should see the tax amount reflected to the check as "<Tax2>"
    Then I should see orderscreen with menu item Total without Discount or Tax as "<Total2>"
    And I click Cash button for Complete Sale
    And I click Exact button on the cash pop-up
    And I click Enter Button on the cash pop-up
#    Then I should see the print or send receipt
#    And I click No thanks Button on the print receipt
    Then I should get back to the Table Layout tab
    #Check with discount(item based - After tax) as Free Item
    And I click new check button on the Table layout screen
    And I select table as "<table_no>"
    And I select the number of seats as "<number_of_seats>"
    And I tap Continue to finish selecting the number of seats
    And I select Pasta as category
    And I select menu item as "<Menu_Item>"
    And I select modifier as "<Modifier>"
    And I click Done to get back
    And I select Discount on the Order screen
    Then I should see Check Based Discount Screen
    And I click Discount as "<Discount4>"
    And I click Back button on Discount Screen
    Then I should see orderscreen with as Onion Rings EACH
    Then I should see orderscreen with menu item prize as "<SubTotal3>"
    Then I should see the tax amount reflected to the check as "<Tax3>"
    Then I should see orderscreen with menu item Total without Discount or Tax as "<Total3>"
    And I click Cash button for Complete Sale
    And I click Exact button on the cash pop-up
    And I click Enter Button on the cash pop-up
#    Then I should see the print or send receipt
#    And I click No thanks Button on the print receipt
    Then I should get back to the Table Layout tab
    # Check with discount(item based - After tax) as Free Item Auto Discount
    And I click new check button on the Table layout screen
    And I select table as "<table_no>"
    And I select the number of seats as "<number_of_seats>"
    And I tap Continue to finish selecting the number of seats
    And I select Pasta as category
    And I select menu item as Ling Littlenck for free item auto Discount
    Then I should see orderscreen with as Onion Rings EACH
    Then I should see discount as "<Discount5>" on the order screen
    Then I should see orderscreen with menu item prize as "<SubTotal4>"
    Then I should see the tax amount reflected to the check as "<Tax4>"
    Then I should see orderscreen with menu item Total without Discount or Tax as "<Total4>"
    And I click Cash button for Complete Sale
    And I click Exact button on the cash pop-up
    And I click Enter Button on the cash pop-up
#    Then I should see the print or send receipt
#    And I click No thanks Button on the print receipt
    Then I should get back to the Table Layout tab

     #Check with discount(item based - Before tax) as Free Item Auto Discount
    And I click new check button on the Table layout screen
    And I select table as "<table_no>"
    And I select the number of seats as "<number_of_seats>"
    And I tap Continue to finish selecting the number of seats
    And I select Pasta as category
    And I select menu item as Ling Pes Shrimp for free item auto Discount
    And I select modifier as "<Modifier1>"
    Then I should see orderscreen with as Onion Rings EACH
    Then I should see discount as "<Discount6>" on the order screen
    Then I should see orderscreen with menu item prize as "<SubTotal5>"
    Then I should see the tax amount reflected to the check as "<Tax5>"
    Then I should see orderscreen with menu item Total without Discount or Tax as "<Total5>"
    And I click Cash button for Complete Sale
    And I click Exact button on the cash pop-up
    And I click Enter Button on the cash pop-up
#    Then I should see the print or send receipt
#    And I click No thanks Button on the print receipt
    Then I should get back to the Table Layout tab
    And I click power button
    Examples:
      | table_no | number_of_seats  |Menu_Item   | Modifier | Modifier1|Discount                |Discount1  | SubTotal    | Tax       | Total       |Discount2                 |txtDiscount2  | SubTotal1    | Tax1   | Total1    |Discount3               | SubTotal2   | Tax2       | Total2      |Discount4              | SubTotal3   | Tax3       | Total3      |Discount5                   | SubTotal4  | Tax4      | Total4       |Discount6                 | SubTotal5   | Tax5      | Total5      |
      | T12      |1                 | Ravioli    | Butter   | Penne    |IB-AfterTax-SetPrice500 |$ 12.50    | $ 14.00     | $ 1.40    | $ 2.90      | IB-BeforeTax-SetPrice500 |$ 13.00       | $ 14.00      | $ 0.10 | $ 1.10    |IB-BeforeTax-AsFreeItem | $ 15.00     | $ 1.50     | $ 16.50     |IB-AfterTax-AsFreeItem | $ 15.00     | $ 1.50     | $ 16.50     | IB-AfterTax-AsFreeAutoDis  | $ 103.00   | $ 10.30   | $ 113.30     |IB-BeforTax-AsFreeAutoDis | $ 105.00    | $ 10.50   | $ 115.50    |


  Scenario Outline: Check Based After Tax Discount as Percentage
    And I click new check button on the Table layout screen
    And I select table as "<table_no>"
    And I select the number of seats as "<number_of_seats>"
    And I tap Continue to finish selecting the number of seats
    And I select Pasta as category
    And I select menu item as "<Menu_Item>"
    And I select modifier as "<Modifier>"
    And I click Done to get back
 #   And I select Pasta as category
    And I select menu item as "<Menu_Item>"
    And I select modifier as "<Modifier>"
    And I click Done to get back
    And I select Discount on the Order screen
    Then I should see Check Based Discount Screen
    And I click Discount as "<Discount>"
    And I click Back button on Discount Screen
    Then I should see orderscreen with menu item prize as "<SubTotal>"
    Then I should see the tax amount reflected to the check as "<Tax>"
    Then I should see the Discount amount reflected to the check as "<Discount1>"
    Then I should see orderscreen with menu item Total as "<Total>"
    And I click Cash button for Complete Sale
    And I click Exact button on the cash pop-up
    And I click Enter Button on the cash pop-up
#    Then I should see the print or send receipt
#    And I click No thanks Button on the print receipt
    Then I should get back to the Table Layout tab

    #Check Based - After Tax Discount As Amount
    And I click new check button on the Table layout screen
    And I select table as "<table_no>"
    And I select the number of seats as "<number_of_seats>"
    And I tap Continue to finish selecting the number of seats
    And I select Menu as category
    And I select menu item as "<Menu_Item1>"
    And I select menu item as "<Menu_Item1>"
    And I select Discount on the Order screen
    Then I should see Check Based Discount Screen
    And I click Discount as "<Discount2>"
    And I click Back button on Discount Screen
    Then I should see orderscreen with menu item prize as "<SubTotal2>"
    Then I should see the tax amount reflected to the check as "<Tax2>"
    Then I should see the Discount amount reflected to the check as "<txtDiscount2>"
    Then I should see orderscreen with menu item Total as "<Total2>"
    And I click Cash button for Complete Sale
    And I click Exact button on the cash pop-up
    And I click Enter Button on the cash pop-up
    Then I should get back to the Table Layout tab

    #Check Based After Tax Discount as Set Price
    And I click new check button on the Table layout screen
    And I select table as "<table_no>"
    And I select the number of seats as "<number_of_seats>"
    And I tap Continue to finish selecting the number of seats
    And I select Menu as category
    And I select menu item as "<Menu_Item1>"
    And I select menu item as "<Menu_Item1>"
    And I select Discount on the Order screen
    Then I should see Check Based Discount Screen
    And I click Discount as "<Discount3>"
    And I click Back button on Discount Screen
    Then I should see orderscreen with menu item prize as "<SubTotal3>"
    Then I should see the tax amount reflected to the check as "<Tax3>"
    Then I should see the Discount amount reflected to the check as "<txtDiscount3>"
    Then I should see orderscreen with menu item Total as "<Total3>"
    And I click Cash button for Complete Sale
    And I click Exact button on the cash pop-up
    And I click Enter Button on the cash pop-up
    Then I should get back to the Table Layout tab

     #Check based After tax Discount as Free Item
    And I click new check button on the Table layout screen
    And I select table as "<table_no>"
    And I select the number of seats as "<number_of_seats>"
    And I tap Continue to finish selecting the number of seats
    And I select Desserts as category
    And I select menu item as "<Menu_Item2>"
    And I select Discount on the Order screen
    Then I should see Check Based Discount Screen
    And I click Discount as "<Discount4>"
    And I click Back button on Discount Screen
    Then I should see orderscreen with as Onion Rings EACH
    Then I should see orderscreen with menu item prize as "<SubTotal4>"
    Then I should see the tax amount reflected to the check as "<Tax4>"
    Then I should see orderscreen with menu item Total without Discount or Tax as "<Total4>"
    And I click Cash button for Complete Sale
    And I click Exact button on the cash pop-up
    And I click Enter Button on the cash pop-up
    Then I should get back to the Table Layout tab
    And I click power button
    Examples:
      | table_no | number_of_seats | Menu_Item | Modifier |Menu_Item1|Menu_Item2|Discount                 | SubTotal    | Tax       | Discount1 |Total     |Discount2                 | SubTotal2    | Tax2      | txtDiscount2 |Total2       |  Discount3               | SubTotal3   | Tax3      | txtDiscount3   |Total3    |  Discount4              | SubTotal4   | Tax4   |Total4   |
      | T12      | 1               | Ravioli | Butter     |cake      |Cheesecake|CB-AfterTax-Percentage10 | $ 28.00     | $ 2.80    | $ 2.80    | $ 28.00  |CB-AfterTax-Amount1000    | $ 16.00      | $ 1.60    | $ 1.00       | $ 16.60     | CB-AfterTaxSetPrice2500  | $ 16.00     | $ 1.60    | $ 0.56         | $ 17.04  |CB-AfterTax-Free300      | $ 17.00     | $ 1.70 | $ 18.70 |


  Scenario Outline: Check Based Before Tax Discount as Percentage
    And I click new check button on the Table layout screen
    And I select table as "<table_no>"
    And I select the number of seats as "<number_of_seats>"
    And I tap Continue to finish selecting the number of seats
    And I select Pasta as category
    And I select menu item as "<Menu_Item>"
    And I select modifier as "<Modifier>"
    And I click Done to get back
  #  And I select Pasta as category
    And I select menu item as "<Menu_Item>"
    And I select modifier as "<Modifier>"
    And I click Done to get back
    And I select Discount on the Order screen
    Then I should see Check Based Discount Screen
    And I click Discount as "<Discount>"
    And I click Back button on Discount Screen
    Then I should see orderscreen with menu item prize as "<SubTotal>"
    Then I should see the tax amount reflected to the check as "<Tax>"
    Then I should see the Discount amount reflected to the check as "<Discount1>"
    Then I should see orderscreen with menu item Total as "<Total>"
    And I click Cash button for Complete Sale
    And I click Exact button on the cash pop-up
    And I click Enter Button on the cash pop-up
#    Then I should see the print or send receipt
#    And I click No thanks Button on the print receipt
    Then I should get back to the Table Layout tab
    #Check Based Before Tax Discount As Amount
    And I click new check button on the Table layout screen
    And I select table as "<table_no>"
    And I select the number of seats as "<number_of_seats>"
    And I tap Continue to finish selecting the number of seats
    And I select Pasta as category
    And I select menu item as "<Menu_Item>"
    And I select modifier as "<Modifier>"
    And I click Done to get back
    And I select menu item as "<Menu_Item>"
    And I select modifier as "<Modifier>"
    And I click Done to get back
    And I select Discount on the Order screen
    Then I should see Check Based Discount Screen
    And I click Discount as "<Discount2>"
    And I click Back button on Discount Screen
    Then I should see orderscreen with menu item prize as "<SubTotal2>"
    Then I should see the tax amount reflected to the check as "<Tax2>"
    Then I should see the Discount amount reflected to the check as "<txtDiscount2>"
    Then I should see orderscreen with menu item Total as "<Total2>"
    And I click Cash button for Complete Sale
    And I click Exact button on the cash pop-up
    And I click Enter Button on the cash pop-up
#    Then I should see the print or send receipt
#    And I click No thanks Button on the print receipt
    Then I should get back to the Table Layout tab
    #Check Based Before Tax Discount as Set Price
    And I click new check button on the Table layout screen
    And I select table as "<table_no>"
    And I select the number of seats as "<number_of_seats>"
    And I tap Continue to finish selecting the number of seats
    And I select Menu as category
    And I select menu item as "<Menu_Item1>"
    And I change the Quantity of menu Item as "7"
    And I select Discount on the Order screen
    Then I should see Check Based Discount Screen
    And I click Discount as "<Discount3>"
    And I click Back button on Discount Screen
    Then I should see orderscreen with menu item prize as "<SubTotal3>"
    Then I should see the tax amount reflected to the check as "<Tax3>"
    Then I should see the Discount amount reflected to the check as "<txtDiscount3>"
    Then I should see orderscreen with menu item Total as "<Total3>"
    And I click Cash button for Complete Sale
    And I click Exact button on the cash pop-up
    And I click Enter Button on the cash pop-up
#    Then I should see the print or send receipt
#    And I click No thanks Button on the print receipt
    Then I should get back to the Table Layout tab
    #Check Based Before Tax Discount as Free Item
    And I click new check button on the Table layout screen
    And I select table as "<table_no>"
    And I select the number of seats as "<number_of_seats>"
    And I tap Continue to finish selecting the number of seats
    And I select Desserts as category
    And I select menu item as "<Menu_Item2>"
    And I select Discount on the Order screen
    Then I should see Check Based Discount Screen
    And I click Discount as "<Discount4>"
    And I click Back button on Discount Screen
    Then I should see orderscreen with as Onion Rings EACH
    Then I should see discount as "<Discount4>" on the order screen
    Then I should see orderscreen with menu item prize as "<SubTotal4>"
    Then I should see the tax amount reflected to the check as "<Tax4>"
    Then I should see orderscreen with menu item Total without Discount or Tax as "<Total4>"
    And I click Cash button for Complete Sale
    And I click Exact button on the cash pop-up
    And I click Enter Button on the cash pop-up
#    Then I should see the print or send receipt
#    And I click No thanks Button on the print receipt
    Then I should get back to the Table Layout tab
    And I click power button
    Examples:
      | table_no | number_of_seats | Menu_Item | Modifier |Menu_Item1 |Menu_Item2 |Discount                  | SubTotal    | Tax       | Discount1 |Total        |Discount2               | SubTotal2    | Tax2     | txtDiscount2 |Total2     |Discount3                 | SubTotal3    | Tax3     | txtDiscount3 |Total3     |Discount4             | SubTotal4    | Tax4   |Total4     |
      | T12      | 1               |  Ravioli  | Butter   |cake       |Cheesecake |CB-BeforeTax-Percentage10 | $ 28.00     | $ 2.52    | $ 2.80    | $ 27.72     |CB-BeforeTax-Amount1000 | $ 28.00      | $ 2.70   | $ 1.00       | $ 29.70   |CB-BeforeTax-SetPrice1000 | $ 56.00      | $ 1.00   | $ 46.00      | $ 11.00   |CB-BeforeTax-Free300  | $ 17.00      | $ 1.70 | $ 18.70   |


#  Scenario Outline: Check with open Check discount as amount and safety limit in whole value (After Tax)
#    And I click new check button on the Table layout screen
#    And I select table as "<table_no>"
#    And I select the number of seats as "<number_of_seats>"
#    And I tap Continue to finish selecting the number of seats
#    And I select Menu as category
#    And I select menu item as "<Menu_Item>"
#    And I change the Quantity of menu Item as "7"
#    And I click Options button
#    Then I should see the Check Options screen
#    And I click discount on check option screen
#    And I select open check discount
#    Then I should see Open discount Screen
#    And I pass the amount on open discount for open check discount safety percentage whole value as 20 for "<Discount1>"
#    Then I should see orderscreen with open check discount
#    Then I should see orderscreen with menu item prize as "<SubTotal>"
#    Then I should see the tax amount reflected to the check as "<Tax>"
#    Then I should see the Discount amount reflected to the check as "<Discount>"
#    Then I should see orderscreen with menu item Total as "<Total>"
#    And I click Cash button for Complete Sale
#    And I click Exact button on the cash pop-up
#    And I click Enter Button on the cash pop-up
#    Then I should get back to the Table Layout tab
#    #Check with open Check discount as amount and safety limit in decimal precision (After Tax)
#    And I click new check button on the Table layout screen
#    And I select table as "<table_no>"
#    And I select the number of seats as "<number_of_seats>"
#    And I tap Continue to finish selecting the number of seats
#    And I select Menu as category
#    And I select menu item as "<Menu_Item>"
#    And I change the Quantity of menu Item as "7"
#    And I click Options button
#    Then I should see the Check Options screen
#    And I click discount on check option screen
#    And I select open check discount
#    Then I should see Open discount Screen
#    And I pass the amount on open discount for open check discount safety limit percentage decimal precision as 20.50 for "<Discount2>"
#    Then I should see orderscreen with open check discount
#    Then I should see orderscreen with menu item prize as "<SubTotal2>"
#    Then I should see the tax amount reflected to the check as "<Tax2>"
#    Then I should see the Discount amount reflected to the check as "<txtDiscount2>"
#    Then I should see orderscreen with menu item Total as "<Total2>"
#    And I click Cash button for Complete Sale
#    And I click Exact button on the cash pop-up
#    And I click Enter Button on the cash pop-up
#    Then I should get back to the Table Layout tab
#    #Check with open Check discount as percentage (After Tax)
#    And I click new check button on the Table layout screen
#    And I select table as "<table_no>"
#    And I select the number of seats as "<number_of_seats>"
#    And I tap Continue to finish selecting the number of seats
#    And I select Menu as category
#    And I select menu item as "<Menu_Item>"
#    And I change the Quantity of menu Item as "7"
#    And I click Options button
#    Then I should see the Check Options screen
#    And I click discount on check option screen
#    And I select open check discount
#    Then I should see Open discount Screen
#    And I pass the amount on open discount for open check discount percentage as 20 for "<Discount3>"
#    Then I should see orderscreen with open check discount
#    Then I should see orderscreen with menu item prize as "<SubTotal3>"
#    Then I should see the tax amount reflected to the check as "<Tax3>"
#    Then I should see the Discount amount reflected to the check as "<txtDiscount3>"
#    Then I should see orderscreen with menu item Total as "<Total3>"
#    And I click Cash button for Complete Sale
#    And I click Exact button on the cash pop-up
#    And I click Enter Button on the cash pop-up
#    Then I should get back to the Table Layout tab
#
#    #Check with open Check discount as amount and safety limit in decimal precision(Before Tax)
#    And I click new check button on the Table layout screen
#    And I select table as "<table_no>"
#    And I select the number of seats as "<number_of_seats>"
#    And I tap Continue to finish selecting the number of seats
#    And I select Menu as category
#    And I select menu item as "<Menu_Item>"
#    And I change the Quantity of menu Item as "7"
#    And I click Options button
#    Then I should see the Check Options screen
#    And I click discount on check option screen
#    And I select open check discount
#    Then I should see Open discount Screen
#    And I pass the amount on open discount for open check discount safety limit percentage decimal precision as 20.50 for "<Discount4>"
#    Then I should see orderscreen with open check discount
#    Then I should see orderscreen with menu item prize as "<SubTotal4>"
#    Then I should see the tax amount reflected to the check as "<Tax4>"
#    Then I should see the Discount amount reflected to the check as "<txtDiscount4>"
#    Then I should see orderscreen with menu item Total as "<Total4>"
#    And I click Cash button for Complete Sale
#    And I click Exact button on the cash pop-up
#    And I click Enter Button on the cash pop-up
#    Then I should get back to the Table Layout tab
#    # Check with open Check discount as amount and safety limit in whole value (Before Tax)
#    And I click new check button on the Table layout screen
#    And I select table as "<table_no>"
#    And I select the number of seats as "<number_of_seats>"
#    And I tap Continue to finish selecting the number of seats
#    And I select Menu as category
#    And I select menu item as "<Menu_Item>"
#    And I change the Quantity of menu Item as "7"
#    And I click Options button
#    Then I should see the Check Options screen
#    And I click discount on check option screen
#    And I select open check discount
#    Then I should see Open discount Screen
#    And I pass the amount on open discount for open check discount safety percentage whole value as 20 for "<Discount5>"
#    Then I should see orderscreen with open check discount
#    Then I should see orderscreen with menu item prize as "<SubTotal5>"
#    Then I should see the tax amount reflected to the check as "<Tax5>"
#    Then I should see the Discount amount reflected to the check as "<txtDiscount5>"
#    Then I should see orderscreen with menu item Total as "<Total5>"
#    And I click Cash button for Complete Sale
#    And I click Exact button on the cash pop-up
#    And I click Enter Button on the cash pop-up
#    Then I should get back to the Table Layout tab
#    # Check with open Check discount as percentage (Before Tax)
#    And I click new check button on the Table layout screen
#    And I select table as "<table_no>"
#    And I select the number of seats as "<number_of_seats>"
#    And I tap Continue to finish selecting the number of seats
#    And I select Menu as category
#    And I select menu item as "<Menu_Item>"
#    And I change the Quantity of menu Item as "7"
#    And I click Options button
#    Then I should see the Check Options screen
#    And I click discount on check option screen
#    And I select open check discount
#    Then I should see Open discount Screen
#    And I pass the amount on open discount for open check discount percentage as 20 for "<Discount6>"
#    Then I should see orderscreen with open check discount
#    Then I should see orderscreen with menu item prize as "<SubTotal6>"
#    Then I should see the tax amount reflected to the check as "<Tax6>"
#    Then I should see the Discount amount reflected to the check as "<txtDiscount6>"
#    Then I should see orderscreen with menu item Total as "<Total6>"
#    And I click Cash button for Complete Sale
#    And I click Exact button on the cash pop-up
#    And I click Enter Button on the cash pop-up
#    Then I should get back to the Table Layout tab
#    And I click power button
#    Examples:
#      |table_no| number_of_seats |Menu_Item|  SubTotal | Tax      | Discount | Total      | Discount1 |SubTotal2  | Tax2     | txtDiscount2 | Total2   | Discount2 |SubTotal3  | Tax3     | txtDiscount3 | Total3       | Discount3 | SubTotal4 | Tax4    | txtDiscount4 | Total4  | Discount4 | SubTotal5 | Tax5     | txtDiscount5 | Total5   | Discount5 |SubTotal6  | Tax6     | txtDiscount6 | Total6  | Discount6 |
#      | T15     |1               |Halwa    |  $ 70.00  | $ 7.00   | $ 20.00  | $ 57.00    | After     |  $ 70.00  | $ 7.00   | $ 20.50      | $ 56.50  | After     |  $ 70.00  | $ 7.00   | $ 14.00      | $ 63.00      | After     |  $ 70.00  | $ 4.95  | $ 20.50      | $ 54.45 | Before    |  $ 70.00  | $ 5.00   | $ 20.00      | $ 55.00  | Before    |  $ 70.00  | $ 5.60   | $ 14.00      | $ 61.60 | Before    |


  Scenario Outline: Check with Mix&Match discount as Set Price as 600(After Tax)
    And I click new check button on the Table layout screen
    And I select table as "<table_no>"
    And I select the number of seats as "<number_of_seats>"
    And I tap Continue to finish selecting the number of seats
    And I select Menu as category
    And I select menu item as "<Menu_Item>"
    And I select menu item as "<Menu_Item>"
    And I select Discount on the Order screen
    Then I should see Check Based Discount Screen
    And I click Discount as "<Discount1>"
    And I click Back button on Discount Screen
    Then I should see orderscreen with menu item prize as "<SubTotal>"
    Then I should see the tax amount reflected to the check as "<Tax>"
    Then I should see the Discount amount reflected to the check as "<Discount>"
    Then I should see orderscreen with menu item Total as "<Total>"
    And I click Cash button for Complete Sale
    And I click Exact button on the cash pop-up
    And I click Enter Button on the cash pop-up
    Then I should get back to the Table Layout tab
    #Check with Mix&Match discount as Set Each Item Price as 800 (After Tax)
    And I click new check button on the Table layout screen
    And I select table as "<table_no>"
    And I select the number of seats as "<number_of_seats>"
    And I tap Continue to finish selecting the number of seats
    And I select Menu as category
    And I select menu item as "<Menu_Item>"
    And I select menu item as "<Menu_Item>"
    And I select Discount on the Order screen
    Then I should see Check Based Discount Screen
    And I click Discount as "<Discount2>"
    And I click Back button on Discount Screen
    Then I should see orderscreen with menu item prize as "<SubTotal2>"
    Then I should see the tax amount reflected to the check as "<Tax2>"
    Then I should see the Discount amount reflected to the check as "<txtDiscount2>"
    Then I should see orderscreen with menu item Total as "<Total2>"
    And I click Cash button for Complete Sale
    And I click Exact button on the cash pop-up
    And I click Enter Button on the cash pop-up
    Then I should get back to the Table Layout tab

#   Scenario Outline: Check with Mix&Match discount as Set Percentage(Most Expensive)(After tax)
    And I click new check button on the Table layout screen
    And I select table as "<table_no>"
    And I select the number of seats as "<number_of_seats>"
    And I tap Continue to finish selecting the number of seats
    And I select Menu as category
    And I select menu item as "<Menu_Item>"
    And I select menu item as "<Menu_Item1>"
    And I select Discount on the Order screen
    Then I should see Check Based Discount Screen
    And I click Discount as "<Discount3>"
    And I click Back button on Discount Screen
    And I compare menu price as "10.00" "8.00" and applied "<Discount3>" on "<expensive>" menu Item
    Then I should see orderscreen with menu item prize as "<SubTotal3>"
    Then I should see the tax amount reflected to the check as "<Tax3>"
    Then I should see the Discount amount reflected to the check as "<txtDiscount3>"
    Then I should see orderscreen with menu item Total as "<Total3>"
    And I click Cash button for Complete Sale
    And I click Exact button on the cash pop-up
    And I click Enter Button on the cash pop-up
    Then I should get back to the Table Layout tab

#   Scenario Outline: Check with Mix&Match discount as Set Percentage(Least Expensive)(After tax)
    And I click new check button on the Table layout screen
    And I select table as "<table_no>"
    And I select the number of seats as "<number_of_seats>"
    And I tap Continue to finish selecting the number of seats
    And I select Desserts as category
    And I select menu item as "<Menu_Ite2>"
    And I select menu item as "<Menu_Item3>"
    And I select Discount on the Order screen
    Then I should see Check Based Discount Screen
    And I click Discount as "<Discount4>"
    And I click Back button on Discount Screen
    And I compare menu price as "<price2>" "<price3>" and applied "<Discount4>" on "<expensive1>" menu Item
    Then I should see orderscreen with menu item prize as "<SubTotal4>"
    Then I should see the tax amount reflected to the check as "<Tax4>"
    Then I should see the Discount amount reflected to the check as "<txtDiscount4>"
    Then I should see orderscreen with menu item Total as "<Total4>"
    And I click Cash button for Complete Sale
    And I click Exact button on the cash pop-up
    And I click Enter Button on the cash pop-up
    Then I should get back to the Table Layout tab
    And I click power button
    Examples:
      |table_no| number_of_seats |Menu_Item| Menu_Item1 | Menu_Ite2  |Menu_Item3         |SubTotal  | Tax       | Discount | Total     |    Discount1           |SubTotal2 | Tax2      | txtDiscount2 | Total2    | Discount2                |price  |price1  | SubTotal3 | Tax3      | txtDiscount3   | Total3    | Discount3                    | expensive|price2 |price3|  SubTotal4  | Tax4      | txtDiscount4 | Total4    | Discount4                 | expensive1|
      | T15    |1                |  Halwa  | cake       | Cheesecake |Pumpkin Cheese Cake| $ 20.00  | $ 2.00    | $ 8.00   | $ 14.00   | CheckMixMatchSP(After) | $ 20.00  | $ 2.00    | $ 2.00       | $ 20.00   | CheckMixMatchSEIP(After) |10.00  |8.00    | $ 18.00   | $ 1.80    | $ 5.00         | $ 14.80   | CheckMixMatchSPerM(After)    |Most      |15.00  |11.00 | $ 26.00     | $ 2.60    | $ 5.50       | $ 23.10   | CheckMixMatchSPerL(After) | Least    |


  Scenario Outline: Check with Mix&Match discount as Set Price as 500(Before tax)
    And I click new check button on the Table layout screen
    And I select table as "<table_no>"
    And I select the number of seats as "<number_of_seats>"
    And I tap Continue to finish selecting the number of seats
    And I select Menu as category
    And I select menu item as "<Menu_Item>"
    And I select menu item as "<Menu_Item1>"
    And I select Discount on the Order screen
    Then I should see Check Based Discount Screen
    And I click Discount as "<Discount1>"
    And I click Back button on Discount Screen
    Then I should see discount as "<Discount1>" on the order screen
    Then I should see orderscreen with menu item prize as "<SubTotal>"
    Then I should see the tax amount reflected to the check as "<Tax>"
    Then I should see the Discount amount reflected to the check as "<Discount>"
    Then I should see orderscreen with menu item Total as "<Total>"
    And I click Cash button for Complete Sale
    And I click Exact button on the cash pop-up
    And I click Enter Button on the cash pop-up
    Then I should get back to the Table Layout tab
    #Check with Mix&Match discount as Set Each Item Price as 500(Before tax)
    And I click new check button on the Table layout screen
    And I select table as "<table_no>"
    And I select the number of seats as "<number_of_seats>"
    And I tap Continue to finish selecting the number of seats
    And I select Menu as category
    And I select menu item as "<Menu_Item>"
    And I select menu item as "<Menu_Item1>"
    And I select Discount on the Order screen
    Then I should see Check Based Discount Screen
    And I click Discount as "<Discount2>"
    And I click Back button on Discount Screen
    Then I should see discount as "<Discount2>" on the order screen
    Then I should see orderscreen with menu item prize as "<SubTotal2>"
    Then I should see the tax amount reflected to the check as "<Tax2>"
    Then I should see the Discount amount reflected to the check as "<txtDiscount2>"
    Then I should see orderscreen with menu item Total as "<Total2>"
    And I click Cash button for Complete Sale
    And I click Exact button on the cash pop-up
    And I click Enter Button on the cash pop-up
    Then I should get back to the Table Layout tab
    #Check with Mix&Match discount as Set Percentage Most Expensive (Before tax)
    And I click new check button on the Table layout screen
    And I select table as "<table_no>"
    And I select the number of seats as "<number_of_seats>"
    And I tap Continue to finish selecting the number of seats
    And I select Desserts as category
    And I select menu item as "<Menu_Item2>"
    And I select menu item as "<Menu_Item3>"
    And I select Discount on the Order screen
    Then I should see Check Based Discount Screen
    And I click Discount as "<Discount3>"
    And I click Back button on Discount Screen
    And I compare menu price as "<price>" "<price1>" and applied "<Discount3>" on "<expensive>" menu Item
    Then I should see orderscreen with menu item prize as "<SubTotal3>"
    Then I should see the tax amount reflected to the check as "<Tax3>"
    Then I should see the Discount amount reflected to the check as "<txtDiscount3>"
    Then I should see orderscreen with menu item Total as "<Total3>"
    And I click Cash button for Complete Sale
    And I click Exact button on the cash pop-up
    And I click Enter Button on the cash pop-up
    Then I should get back to the Table Layout tab
    #Check with Mix&Match discount as Set Percentage Least Expensive (Before tax)
    And I click new check button on the Table layout screen
    And I select table as "<table_no>"
    And I select the number of seats as "<number_of_seats>"
    And I tap Continue to finish selecting the number of seats
    And I select Desserts as category
    And I select menu item as "<Menu_Item2>"
    And I select menu item as "<Menu_Item3>"
    And I select Discount on the Order screen
    Then I should see Check Based Discount Screen
    And I click Discount as "<Discount4>"
    And I click Back button on Discount Screen
    And I compare menu price as "<price2>" "<price3>" and applied "<Discount4>" on "<expensive1>" menu Item
    Then I should see orderscreen with menu item prize as "<SubTotal4>"
    Then I should see the tax amount reflected to the check as "<Tax4>"
    Then I should see the Discount amount reflected to the check as "<txtDiscount4>"
    Then I should see orderscreen with menu item Total as "<Total4>"
    And I click Cash button for Complete Sale
    And I click Exact button on the cash pop-up
    And I click Enter Button on the cash pop-up
    Then I should get back to the Table Layout tab
    And I click power button
    Examples:
      |table_no| number_of_seats |Menu_Item | Menu_Item1 |  SubTotal  | Tax      | Discount  | Total   | Discount1               | SubTotal2   | Tax2      | txtDiscount2 | Total2   |    Discount2             | Menu_Item2 | Menu_Item3          |price |price1| SubTotal3  | Tax3     | txtDiscount3 | Total3    | Discount3                | expensive |price2 |price3| SubTotal4  | Tax4     | txtDiscount4 | Total4   | Discount4                | expensive1 |
      | T16    |1                | cake     | Halwa      |  $ 18.00   | $ 1.00   | $ 8.00    | $ 11.00 | CheckMixMatchSP(Before) |  $ 18.00    | $ 1.60    | $ 2.00       | $ 17.60  | CheckMixMatchSEIP(Before)|Cheesecake  | Pumpkin Cheese Cake |15.00 |11.00 |  $ 26.00   | $ 1.85   | $ 7.50       | $ 20.35   | CheckMixMatchSPerM(Befor)|Most       |15.00  |11.00 |  $ 26.00   | $ 2.05   | $ 5.50       | $ 22.55  | CheckMixMatchSPerL(Befor)| Least     |


  Scenario Outline: Check with tax exempt with customer
    And I click new check button on the Table layout screen
    And I select table as "<table_no>"
    And I select the number of seats as "<number_of_seats>"
    And I tap Continue to finish selecting the number of seats
    And I click Add Customer Button
    And I search for "<customer_name>"
    When I click "<customer_name>" to select customer for the seat
#    And I click the customer name on the order screen
#    Then I should see the customer profile window
#    And I select tax exempt on customer profile screen
#    And I not select tax exempt on customer profile screen
#    And I click the Save button
    And I select Menu as category
    And I select menu item as "<Menu_Item>"
    Then I should see orderscreen with menu item prize as "<SubTotal>"
    Then I should see the tax amount reflected to the check as "<Tax>"
    Then I should see orderscreen with menu item Total without Discount or Tax as "<Total>"
    And I click Options button
    Then I should see the Check Options screen
    And I click Tax Exempt Button

#    Then I should see tax exempt reasons
#    When I select School as reason
    Then I Should get back to the Order Screen
    Then I should see orderscreen with menu item prize as "<SubTotal>"
    Then I should not see tax on the order screen
    Then I should see orderscreen with menu item Total without Tax Exempt as "<Total1>"
    And I click Cash button for Complete Sale
    And I click Exact button on the cash pop-up
    And I click Enter Button on the cash pop-up
#    Then I should see the print or send receipt
#    And I click No thanks Button on the print receipt
    Then I should get back to the Table Layout tab

    #Check with tax exempt and without customer
    And I click new check button on the Table layout screen
    And I select table as "<table_no>"
    And I select the number of seats as "<number_of_seats>"
    And I tap Continue to finish selecting the number of seats
    And I select Menu as category
    And I select menu item as "<Menu_Item>"
    Then I should see orderscreen with menu item prize as "<SubTotal>"
    Then I should see the tax amount reflected to the check as "<Tax>"
    Then I should see orderscreen with menu item Total without Discount or Tax as "<Total>"
    And I click Options button
    Then I should see the Check Options screen
    And I click Tax Exempt Button
    Then I should not see tax on the order screen
#    Then I should see tax exempt reasons
#    When I select School as reason
    Then I Should get back to the Order Screen
    Then I should see orderscreen with menu item prize as "<SubTotal>"
#    And I should see the tax reflected to the check
    Then I should see orderscreen with menu item Total without Tax Exempt as "<Total1>"
    And I click Cash button for Complete Sale
    And I click Exact button on the cash pop-up
    And I click Enter Button on the cash pop-up
#    Then I should see the print or send receipt
#    And I click No thanks Button on the print receipt
    Then I should get back to the Table Layout tab
#    # Check with tax exempt and without customer through payment screen
#    And I click new check button on the Table layout screen
#    And I select table as "<table_no>"
#    And I select the number of seats as "<number_of_seats>"
#    And I tap Continue to finish selecting the number of seats
#    And I select Menu as category
#    And I select menu item as "<Menu_Item>"
#    Then I should see orderscreen with menu item prize as "<SubTotal>"
#    Then I should see the tax amount reflected to the check as "<Tax>"
#    Then I should see orderscreen with menu item Total without Discount or Tax as "<Total>"
#    And I click Payment button in the Order Management Screen
#    And I click Tax Exempt Button from the Payment Screen
##    Then I should see tax exempt reasons
##    When I select School as reason
#    Then I Should get back to the Order Screen
#    Then I should see orderscreen with menu item prize as "<SubTotal>"
#    And I should see the tax reflected to the check
#    Then I should see orderscreen with menu item Total without Tax Exempt as "<Total1>"
#    And I click Cash button for Complete Sale
#    And I click Exact button on the cash pop-up
#    And I click Enter Button on the cash pop-up
##    Then I should see the print or send receipt
##    And I click No thanks Button on the print receipt
#    Then I should get back to the Table Layout tab
    #Check with tax exempt for pre defined customer
    And I click new check button on the Table layout screen
    And I select table as "<table_no>"
    And I select the number of seats as "<number_of_seats>"
    And I tap Continue to finish selecting the number of seats
    And I click Add Customer Button
    And I search for "<customer_name>"
    When I click "<customer_name>" to select customer for the seat
    And I click the customer name on the order screen
    Then I should see the customer profile window
    And I select tax exempt on customer profile screen
    And I click the Save button
    Then I Should get back to the Order Screen
    And I select Menu as category
    And I select menu item as "<Menu_Item>"
    Then I should see orderscreen with menu item prize as "<SubTotal1>"
    And I should not see tax on the order screen
    Then I should see orderscreen with menu item Total without Tax Exempt as "<Total1>"
    And I click Cash button for Complete Sale
    And I click Exact button on the cash pop-up
    And I click Enter Button on the cash pop-up
    Then I should get back to the Table Layout tab
    And I click the Operation button on the Table Layout
    And I click POS Icon from Toggle
    And I close the order type window
    And I click Add Customer Button
    And I search for "<customer_name>"
    When I click "<customer_name>" to select customer for the seat
#    And I select the customer for tax exempt
    And I click the customer name on the order screen
    And I select tax exempt on customer profile screen
    And I click the Save button
    Then I Should get back to the Order Screen
    And I click All
    And I click Table Layout tab
    And I click power button
    Examples:
      | table_no | number_of_seats |customer_name| Menu_Item  |  SubTotal   | Tax       | Total       | Total1      |SubTotal1    |
      | T9       |1                | tax exe     | Halwa      | $ 10.00     | $ 1.00    | $ 11.00     | $ 10.00     | $ 10.00     |


#  Scenario Outline: Check with vary gratuity through Payment screen
#    And I click new check button on the Table layout screen
#    And I select table as "<table_no>"
#    And I select the number of seats as "<number_of_seats>"
#    And I tap Continue to finish selecting the number of seats
#    And I select Menu as category
#    And I select menu item as "<Menu_Item>"
#    And I click Payment button in the Order Management Screen
#    And I click add gratuity from Payment screen
#    Then I should see the Check Options screen
#    Then I should see Add Gratuity screen
#    And I click Gratuity varying button
#    Then I should see enter Percentage popup
#    And I enter the percentage1 as "800"
##    And I pass the value and click Apply button
#    Then I Should get back to the Order Screen
#    Then I should see orderscreen with menu item prize as "<SubTotal>"
#    Then I should see the tax amount reflected to the check as "<Tax>"
#    Then I should see the Gratuity amount reflected to the check as "<Gratuity>"
#    Then I should see orderscreen with menu item Total as "<Total>"
#    And I click Cash button for Complete Sale
#    And I click Exact button on the cash pop-up
#    And I click Enter Button on the cash pop-up
#    Then I should get back to the Table Layout tab
#    And I click power button
#    Examples:
#      | table_no | number_of_seats | Menu_Item   | SubTotal  | Tax       | Gratuity   |Total       |
#      | T9       |1                | Halwa       | $ 10.00   | $ 1.00    | $ 0.80     |$ 11.80     |


  Scenario Outline: Check With upcharge
    And I click new check button on the Table layout screen
    And I select table as "<table_no>"
    And I select the number of seats as "<number_of_seats>"
    And I tap Continue to finish selecting the number of seats
    And I select category as "FOOD"
    And I select menu item as "<Menu_Item>"
    And I select modifier as "<Modifier>"
    And I click Done to get back
    Then I should see menu with Upcharge amount on order list as "<amount>"
    And I click Cash button for Complete Sale
    And I click Exact button on the cash pop-up
    And I click Enter Button on the cash pop-up
#    Then I should see the print or send receipt
#    And I click No thanks Button on the print receipt
    Then I should get back to the Table Layout tab

    #Check Payment through side CC with Upcharge with tip
    And I click new check button on the Table layout screen
    And I select table as "<table_no>"
    And I select the number of seats as "<number_of_seats>"
    And I tap Continue to finish selecting the number of seats
    And I select category as "FOOD"
    And I select menu item as "<Menu_Item>"
    And I select modifier as "<Modifier>"
    And I click Done to get back
    Then I should see menu with Upcharge amount on order list as "<amount>"
    And I click Payment button in the Order Management Screen
    And I click side cc button in the payment window
    Then I should see total screen
    And I click custom for tip adjustment
    Then I should see tip is added with menu total as "<Total>"
    Then I should see total amount as "<total>" on total screen
    And I click the Continue button on the Total screen
    Then I should see the Payment window
    And I click Submit button on the Payment Window
    Then I should get back to the Table Layout tab

     #Check Payment through CC with Upcharge with tip
#    And I click new check button on the Table layout screen
#    And I select table as "<table_no>"
#    And I select the number of seats as "<number_of_seats>"
#    And I tap Continue to finish selecting the number of seats
#    And I select category as "FOOD"
#    And I select menu item as "<Menu_Item>"
#    And I select modifier as "<Modifier>"
#    And I click Done to get back
#    Then I should see menu with Upcharge amount on order list as "<Total>"
#    And I click Payment button in the Order Management Screen
#    And I click credit card payment on payment window
#    Then I should see total screen
#    And I click custom for tip adjustment
#    Then I should see tip is added with menu total as "<Total>"
#    Then I should see total amount as "<total>" on total screen
#    And I click the Continue button on the Total screen
#    Then I should see your order card screen
#    Then I should see tip added on order screen
#    And I click manual button on the your order screen
#    And I pass the card number as "<card_number>"
#    And I pass card name as "<card_name>"
#    And I pass expire date as "<expire_date>"
#    And I click Process button on card screen
##    And I click Ok button in receipt printer popup
#    Then I should get back to the Table Layout tab

    #Check Payment through other payment - Check With upcharge
    And I click new check button on the Table layout screen
    And I select table as "<table_no>"
    And I select the number of seats as "<number_of_seats>"
    And I tap Continue to finish selecting the number of seats
    And I select category as "FOOD"
    And I select menu item as "<Menu_Item>"
    And I select modifier as "<Modifier>"
    And I click Done to get back
    Then I should see menu with Upcharge amount on order list as "<amount>"
    And I click Payment button in the Order Management Screen
    And I click other button from the payment method popup
    And I click Submit button on the Payment Window
#    Then I should see the print or send receipt
#    And I click No thanks Button on the print receipt
    Then I should get back to the Table Layout tab


    #Check Payment through NMI with Upcharge with tip
#    And I click new check button on the Table layout screen
#    And I select table as "<table_no>"
#    And I select the number of seats as "<number_of_seats>"
#    And I tap Continue to finish selecting the number of seats
#    And I click Add Customer Button
#    And I search for "<customer_name>"
#    When I click "<customer_name>" to select customer for the seat
#    And I select category as "FOOD"
#    And I select menu item as "<Menu_Item>"
#    And I select modifier as "<Modifier>"
#    And I click Done to get back
#    Then I should see menu with Upcharge amount on order list as "<Total>"
#    And I click Payment button in the Order Management Screen
#    And I click NMI payment button in the payment window
#    Then I should see total screen
#    And I click custom for tip adjustment
#    Then I should see tip is added with menu total as "<Total>"
#    Then I should see total amount as "<total>" on total screen
#    And I click the Continue button on the Total screen
#    Then I should see choose card window
#    And I select credit card from choose card window
#    And I click pay button in choose card window
##    And I click Ok button in receipt printer popup
#    Then I should get back to the Table Layout tab

    And I click power button
    Examples:
      | table_no | number_of_seats | Menu_Item          | Modifier     | amount    | Total      | total      |customer_name |  card_number     | expire_date | card_name|
      | T7       |1                |  Fried Crab Cakes  | White Bread  | $ 18.50   | $ 18.70    |$ 28.70     | Auto ragav   | 3530111333300000 | 1224        | JCB      |


#  Scenario Outline: Verify the check in Batch/Tip Adjustment for Check Payment through CC enabled with tips
#    #Verify the check in Batch/Tip Adjustment for Check Payment through CC enabled with tips
#    #Verify merchant copy bill printout of CC payment with sign
#    And I click new check button on the Table layout screen
#    And I select table as "<table_no>"
#    And I select the number of seats as "<number_of_seats>"
#    And I tap Continue to finish selecting the number of seats
#    And I select category as "FOOD"
#    And I select menu item as "<Menu_Item>"
#    And I select modifier as "<Modifier>"
#    And I click Done to get back
#    And I click Payment button in the Order Management Screen
#    And I click credit card payment on payment window
#    Then I should see total screen
#    And I click custom for tip adjustment
#    Then I should see tip is added with menu total as "<Total>"
#    Then I should see total amount as "<total>" on total screen
#    And I click the Continue button on the Total screen
#    Then I should see your order card screen
#    Then I should see tip added on order screen
#    And I click manual button on the your order screen
#    And I pass the card number as "<card_number>"
#    And I pass card name as "<card_name>"
#    And I pass expire date as "<expire_date>"
#    And I click Process button on card screen
##    And I click Ok button in receipt printer popup
#    Then I should get back to the Table Layout tab
#    #Check With Exclusive Tax
#    And I click new check button on the Table layout screen
#    And I select table as "<table_no>"
#    And I select the number of seats as "<number_of_seats>"
#    And I tap Continue to finish selecting the number of seats
#    And I select Pasta as category
#    And I select menu item as Ravioli for Item Based Exclusive Tax
#    And I select modifier as "<Modifier1>"
#    And I click Done to get back
#    Then I should see orderscreen with menu item prize as "<SubTotal1>"
#    Then I should see the tax amount reflected to the check as "<Tax1>"
#    Then I should see orderscreen with menu item Total without Discount or Tax as "<Total1>"
#    And I click Cash button for Complete Sale
#    And I click Exact button on the cash pop-up
#    And I click Enter Button on the cash pop-up
#    Then I should get back to the Table Layout tab
#    And I click power button
#    Examples:
#      | table_no | number_of_seats |  Menu_Item    | Modifier |  Total   | card_number      | expire_date | card_name | total    |Modifier1 |     Tax1 | SubTotal1    | Total1     |
#      | T13      |1                | French Friese | Steak    | $ 15.00  | 3530111333300000 | 1224        | JCB       | $ 25.00  |Butter    |  $ 1.40  | $ 14.00      | $ 15.40    |
#
#
#  Scenario Outline: Check Payment through CC with discount(item based - After tax/Before) as percentage and with tip
#    And I click new check button on the Table layout screen
#    And I select table as "<table_no>"
#    And I select the number of seats as "<number_of_seats>"
#    And I tap Continue to finish selecting the number of seats
#    And I select Pasta as category
#    And I select menu item as "<Menu_Item>"
#    And I select modifier as "<Modifier>"
#    And I click Done to get back
#    And I select Discount on the Order screen
#    Then I should see Check Based Discount Screen
#    And I click Discount as "<Discount>"
#    And I click Back button on Discount Screen
#    And I select Discount on the Order screen
#    Then I should see Check Based Discount Screen
#    And I click Discount as "<Discount1>"
#    And I click Back button on Discount Screen
#    Then I should see orderscreen with menu item prize as "<SubTotal>"
#    Then I should see the tax amount reflected to the check as "<Tax>"
#    Then I should see the Discount amount reflected to the check as "<Discount2>"
#    Then I should see orderscreen with menu item Total as "<Total>"
#    And I click Payment button in the Order Management Screen
#    And I click credit card payment on payment window
#    Then I should see total screen
#    And I click custom for tip adjustment
#    Then I should see tip is added with menu total as "<Total>"
#    Then I should see total amount as "<total>" on total screen
#    And I click the Continue button on the Total screen
#    Then I should see your order card screen
#    Then I should see tip added on order screen
#    And I click manual button on the your order screen
#    And I pass the card number as "<card_number>"
#    And I pass card name as "<card_name>"
#    And I pass expire date as "<expire_date>"
#    And I click Process button on card screen
##    And I click Ok button in receipt printer popup
#    Then I should get back to the Table Layout tab
#
#    #Check Payment through CC with discount(item based - After tax/Before) as amount and with tip
#    And I click new check button on the Table layout screen
#    And I select table as "<table_no>"
#    And I select the number of seats as "<number_of_seats>"
#    And I tap Continue to finish selecting the number of seats
#    And I select Pasta as category
#    And I select menu item as "<Menu_Item>"
#    And I select modifier as "<Modifier>"
#    And I click Done to get back
#    And I select Discount on the Order screen
#    Then I should see Check Based Discount Screen
#    And I click Discount as "<Discount3>"
#    And I click Back button on Discount Screen
#    And I select Discount on the Order screen
#    Then I should see Check Based Discount Screen
#    And I click Discount as "<Discount4>"
#    And I click Back button on Discount Screen
#    Then I should see orderscreen with menu item prize as "<SubTotal3>"
#    Then I should see the tax amount reflected to the check as "<Tax3>"
#    Then I should see the Discount amount reflected to the check as "<txtDiscount3>"
#    Then I should see orderscreen with menu item Total as "<Total3>"
#    And I click Payment button in the Order Management Screen
#    And I click credit card payment on payment window
#    Then I should see total screen
#    And I click custom for tip adjustment
#    Then I should see tip is added with menu total as "<Total3>"
#    Then I should see total amount as "<total3>" on total screen
#    And I click the Continue button on the Total screen
#    Then I should see your order card screen
#    Then I should see tip added on order screen
#    And I click manual button on the your order screen
#    And I pass the card number as "<card_number>"
#    And I pass card name as "<card_name>"
#    And I pass expire date as "<expire_date>"
#    And I click Process button on card screen
##    And I click Ok button in receipt printer popup
#    Then I should get back to the Table Layout tab
#    And I click power button
#    Examples:
#      | table_no | number_of_seats |Menu_Item   | Modifier |Discount                |Discount1              |Discount2  | SubTotal    | Tax       | Total       | card_number      | expire_date | card_name | total       | Discount3           |Discount4         |txtDiscount3 | SubTotal3     | Tax3      | Total3       | total3    |
#      | T12      |1                | Ravioli    | Butter   | IB-AfterTax-Percentage |IB-BeforeTax-Percentage|$ 2.66     | $ 14.00     | $ 1.13    | $ 12.47     | 3530111333300000 | 1224        | JCB       | $ 22.47     | IB-AfterTax-Amount |IB-BeforeTax-Amount|$ 2.00       | $ 14.00       | $ 1.20    | $ 13.20      | $ 23.20   |
#
#
#  Scenario Outline: Check Payment through CC with discount(item based - After tax/Before) as set price and with tip
#    And I click new check button on the Table layout screen
#    And I select table as "<table_no>"
#    And I select the number of seats as "<number_of_seats>"
#    And I tap Continue to finish selecting the number of seats
#    And I select Pasta as category
#    And I select menu item as "<Menu_Item>"
#    And I select modifier as "<Modifier>"
#    And I click Done to get back
#    And I select Discount on the Order screen
#    Then I should see Check Based Discount Screen
#    And I click Discount as "<Discount>"
#    And I click Back button on Discount Screen
#    And I select Discount on the Order screen
#    Then I should see Check Based Discount Screen
#    And I click Discount as "<Discount1>"
#    And I click Back button on Discount Screen
#    Then I should see orderscreen with menu item prize as "<SubTotal>"
#    Then I should see the tax amount reflected to the check as "<Tax>"
#    Then I should see the Discount amount reflected to the check as "<Discount2>"
#    Then I should see orderscreen with menu item Total as "<Total>"
#    And I click Payment button in the Order Management Screen
#    And I click credit card payment on payment window
#    Then I should see total screen
#    And I click custom for tip adjustment
#    Then I should see tip is added with menu total as "<Total>"
#    Then I should see total amount as "<total>" on total screen
#    And I click the Continue button on the Total screen
#    Then I should see your order card screen
#    Then I should see tip added on order screen
#    And I click manual button on the your order screen
#    And I pass the card number as "<card_number>"
#    And I pass card name as "<card_name>"
#    And I pass expire date as "<expire_date>"
#    And I click Process button on card screen
##    And I click Ok button in receipt printer popup
#    Then I should get back to the Table Layout tab
#
#    #Check Payment through CC with discount(item based - After tax/Before) as Free item and with tip
#    And I click new check button on the Table layout screen
#    And I select table as "<table_no>"
#    And I select the number of seats as "<number_of_seats>"
#    And I tap Continue to finish selecting the number of seats
#    And I select Pasta as category
#    And I select menu item as "<Menu_Item>"
#    And I select modifier as "<Modifier>"
#    And I click Done to get back
#    And I select Discount on the Order screen
#    Then I should see Check Based Discount Screen
#    And I click Discount as "<Discount3>"
#    And I click Back button on Discount Screen
#    And I select Discount on the Order screen
#    Then I should see Check Based Discount Screen
#    And I click Discount as "<Discount4>"
#    And I click Back button on Discount Screen
#    Then I should see orderscreen with as Onion Rings EACH
#    Then I should see orderscreen with menu item prize as "<SubTotal3>"
#    Then I should see the tax amount reflected to the check as "<Tax3>"
#    Then I should see orderscreen with menu item Total without Discount or Tax as "<Total3>"
#    And I click Payment button in the Order Management Screen
#    And I click credit card payment on payment window
#    Then I should see total screen
#    And I click custom for tip adjustment
#    Then I should see tip is added with menu total as "<Total3>"
#    Then I should see total amount as "<total3>" on total screen
#    And I click the Continue button on the Total screen
#    Then I should see your order card screen
#    Then I should see tip added on order screen
#    And I click manual button on the your order screen
#    And I pass the card number as "<card_number>"
#    And I pass card name as "<card_name>"
#    And I pass expire date as "<expire_date>"
#    And I click Process button on card screen
##    And I click Ok button in receipt printer popup
#    Then I should get back to the Table Layout tab
#    And I click power button
#    Examples:
#      | table_no | number_of_seats  |Menu_Item | Modifier |     Discount            |  Discount1             | Discount2   |SubTotal     | Tax      | Total      |  card_number     | expire_date | card_name | total     |Discount3              | Discount4             | SubTotal3   | Tax3      | Total3     | total3     |
#      | T14      |1                 | Ravioli  | Butter   | IB-AfterTax-SetPrice500 |IB-BeforeTax-SetPrice500| $ 13.00     | $ 14.00     | $ 0.10   | $ 1.10     | 3530111333300000 | 1224        | JCB       | $ 11.10   |IB-AfterTax-AsFreeItem |IB-BeforeTax-AsFreeItem| $ 16.00     | $ 1.60    | $ 17.60    | $ 27.60    |
#
#
#  Scenario Outline: Check Payment through CC with discount(Check based - After tax/Before) as percentage and with tip
#    And I click new check button on the Table layout screen
#    And I select table as "<table_no>"
#    And I select the number of seats as "<number_of_seats>"
#    And I tap Continue to finish selecting the number of seats
#    And I select Pasta as category
#    And I select menu item as "<Menu_Item>"
#    And I select modifier as "<Modifier>"
#    And I click Done to get back
#   # And I select Pasta as category
#    And I select menu item as "<Menu_Item>"
#    And I select modifier as "<Modifier>"
#    And I click Done to get back
#    And I select Discount on the Order screen
#    Then I should see Check Based Discount Screen
#    And I click Discount as "<Discount>"
#    And I click Back button on Discount Screen
#    And I select Discount on the Order screen
#    Then I should see Check Based Discount Screen
#    And I click Discount as "<Discount1>"
#    And I click Back button on Discount Screen
#    Then I should see orderscreen with menu item prize as "<SubTotal>"
#    Then I should see the tax amount reflected to the check as "<Tax>"
#    Then I should see the Discount amount reflected to the check as "<Discount2>"
#    Then I should see orderscreen with menu item Total as "<Total>"
#    And I click Payment button in the Order Management Screen
#    And I click credit card payment on payment window
#    Then I should see total screen
#    And I click custom for tip adjustment
#    Then I should see tip is added with menu total as "<Total>"
#    Then I should see total amount as "<total>" on total screen
#    And I click the Continue button on the Total screen
#    Then I should see your order card screen
#    Then I should see tip added on order screen
#    And I click manual button on the your order screen
#    And I pass the card number as "<card_number>"
#    And I pass card name as "<card_name>"
#    And I pass expire date as "<expire_date>"
#    And I click Process button on card screen
##    And I click Ok button in receipt printer popup
#    Then I should get back to the Table Layout tab
#    #Check Payment through CC with discount(Check based - After tax/Before) as amount and with tip
#    And I click new check button on the Table layout screen
#    And I select table as "<table_no>"
#    And I select the number of seats as "<number_of_seats>"
#    And I tap Continue to finish selecting the number of seats
#    And I select Pasta as category
#    And I select menu item as "<Menu_Item>"
#    And I select modifier as "<Modifier>"
#    And I click Done to get back
#    And I select menu item as "<Menu_Item>"
#    And I select modifier as "<Modifier>"
#    And I click Done to get back
#    And I select Discount on the Order screen
#    Then I should see Check Based Discount Screen
#    And I click Discount as "<Discount3>"
#    And I click Back button on Discount Screen
#    And I select Discount on the Order screen
#    Then I should see Check Based Discount Screen
#    And I click Discount as "<Discount4>"
#    And I click Back button on Discount Screen
#    Then I should see orderscreen with menu item prize as "<SubTotal3>"
#    Then I should see the tax amount reflected to the check as "<Tax3>"
#    Then I should see the Discount amount reflected to the check as "<txtDiscount3>"
#    Then I should see orderscreen with menu item Total as "<Total3>"
#    And I click Payment button in the Order Management Screen
#    And I click credit card payment on payment window
#    Then I should see total screen
#    And I click custom for tip adjustment
#    Then I should see tip is added with menu total as "<Total3>"
#    Then I should see total amount as "<total3>" on total screen
#    And I click the Continue button on the Total screen
#    Then I should see your order card screen
#    Then I should see tip added on order screen
#    And I click manual button on the your order screen
#    And I pass the card number as "<card_number>"
#    And I pass card name as "<card_name>"
#    And I pass expire date as "<expire_date>"
#    And I click Process button on card screen
##    And I click Ok button in receipt printer popup
#    Then I should get back to the Table Layout tab
#    And I click power button
#    Examples:
#      | table_no | number_of_seats | Menu_Item | Modifier| Discount                |Discount1                 | SubTotal    | Tax       | Discount2  |Total        |  card_number     | expire_date   | card_name | total       |Discount3               |Discount4               | SubTotal3    | Tax3      | txtDiscount3   | Total3   | total3    |
#      | T12      | 1               |  Ravioli  | Butter  |CB-AfterTax-Percentage10 |CB-BeforeTax-Percentage10 | $ 28.00     | $ 2.27    | $ 5.32     | $ 24.95     | 3530111333300000 | 1224          | JCB       | $ 34.95     |CB-AfterTax-Amount1000  |CB-BeforeTax-Amount1000 | $ 28.00      | $ 2.60    | $ 2.00         | $ 28.60  | $ 38.60   |
#
#  @gi5
#  Scenario Outline: Check Payment through CC with discount(Check based - After tax/Before) as set price and with tip
#    And I click new check button on the Table layout screen
#    And I select table as "<table_no>"
#    And I select the number of seats as "<number_of_seats>"
#    And I tap Continue to finish selecting the number of seats
#    And I select Menu as category
#    And I select menu item as "<Menu_Item>"
#    And I select menu item as "<Menu_Item>"
#    And I select Discount on the Order screen
#    Then I should see Check Based Discount Screen
#    And I click Discount as "<Discount>"
#    And I click Back button on Discount Screen
#    And I select Discount on the Order screen
#    Then I should see Check Based Discount Screen
#    And I click Discount as "<Discount1>"
#    And I click Back button on Discount Screen
#    Then I should see orderscreen with menu item prize as "<SubTotal>"
#    Then I should see the tax amount reflected to the check as "<Tax>"
#    Then I should see the Discount amount reflected to the check as "<Discount2>"
#    Then I should see orderscreen with menu item Total as "<Total>"
#    And I click Payment button in the Order Management Screen
#    And I click credit card payment on payment window
#    Then I should see total screen
#    And I click custom for tip adjustment
#    Then I should see tip is added with menu total as "<Total>"
#    Then I should see total amount as "<total>" on total screen
#    And I click the Continue button on the Total screen
#    Then I should see your order card screen
#    Then I should see tip added on order screen
#    And I click manual button on the your order screen
#    And I pass the card number as "<card_number>"
#    And I pass card name as "<card_name>"
#    And I pass expire date as "<expire_date>"
#    And I click Process button on card screen
##    And I click Ok button in receipt printer popup
#    Then I should get back to the Table Layout tab
#    #Check Payment through CC with discount(Check based - After tax/Before) as Free item and with tip
#    And I click new check button on the Table layout screen
#    And I select table as "<table_no>"
#    And I select the number of seats as "<number_of_seats>"
#    And I tap Continue to finish selecting the number of seats
#    And I select Desserts as category
#    And I select menu item as "<Menu_Item1>"
#    And I select Discount on the Order screen
#    Then I should see Check Based Discount Screen
#    And I click Discount as "<Discount3>"
#    And I click Back button on Discount Screen
#    And I select Discount on the Order screen
#    Then I should see Check Based Discount Screen
#    And I click Discount as "<Discount4>"
#    And I click Back button on Discount Screen
#    Then I should see orderscreen with as Onion Rings EACH
#    Then I should see orderscreen with menu item prize as "<SubTotal3>"
#    Then I should see the tax amount reflected to the check as "<Tax3>"
#    Then I should see orderscreen with menu item Total without Discount or Tax as "<Total3>"
#    And I click Payment button in the Order Management Screen
#    And I click credit card payment on payment window
#    Then I should see total screen
#    And I click custom for tip adjustment
#    Then I should see tip is added with menu total as "<Total3>"
#    Then I should see total amount as "<total3>" on total screen
#    And I click the Continue button on the Total screen
#    Then I should see your order card screen
#    Then I should see tip added on order screen
#    And I click manual button on the your order screen
#    And I pass the card number as "<card_number>"
#    And I pass card name as "<card_name>"
#    And I pass expire date as "<expire_date>"
#    And I click Process button on card screen
##    And I click Ok button in receipt printer popup
#    Then I should get back to the Table Layout tab
#    And I click power button
#    Examples:
#      | table_no | number_of_seats | Menu_Item  |Discount                 |Discount1                | SubTotal    | Tax       | Discount2   |Total       |  card_number       | expire_date   | card_name | total    |Menu_Item1      |Discount3            |Discount4             | SubTotal3  | Tax3      | Total3    | total3     |
#      | T12      | 1               |  cake      |CB-AfterTaxSetPrice2500  |CB-BeforeTax-SetPrice1000| $ 16.00     | $ 1.00    | $ 6.00      | $ 11.00    |   3530111333300000 | 1224          | JCB       | $ 21.00  | Cheesecake     | CB-AfterTax-Free300 | CB-BeforeTax-Free300 | $ 17.00    | $ 1.70    | $ 18.70   | $ 28.70    |
#
#
#  Scenario Outline: Check Payment through CC with discount(Open Check - After tax/Before) as percentage and with tip
#    And I click new check button on the Table layout screen
#    And I select table as "<table_no>"
#    And I select the number of seats as "<number_of_seats>"
#    And I tap Continue to finish selecting the number of seats
#    And I select Menu as category
#    And I select menu item as "<Menu_Item>"
#    And I change the Quantity of menu Item as "7"
#    And I click Options button
#    Then I should see the Check Options screen
#    And I click discount on check option screen
#    And I select open check discount
#    Then I should see Open discount Screen
#    And I pass the amount on open discount for open check discount percentage as 20 for "<Discount1>"
#    Then I should see orderscreen with open check discount
#    Then I should see orderscreen with menu item prize as "<SubTotal>"
#    Then I should see the tax amount reflected to the check as "<Tax>"
#    Then I should see the Discount amount reflected to the check as "<Discount>"
#    Then I should see orderscreen with menu item Total as "<Total>"
#    And I click Payment button in the Order Management Screen
#    And I click credit card payment on payment window
#    Then I should see total screen
#    And I click custom for tip adjustment
#    Then I should see tip is added with menu total as "<Total>"
#    Then I should see total amount as "<total>" on total screen
#    And I click the Continue button on the Total screen
#    Then I should see your order card screen
#    Then I should see tip added on order screen
#    And I click manual button on the your order screen
#    And I pass the card number as "<card_number>"
#    And I pass card name as "<card_name>"
#    And I pass expire date as "<expire_date>"
#    And I click Process button on card screen
##    And I click Ok button in receipt printer popup
#    Then I should get back to the Table Layout tab
#
#    #Check Payment through CC with discount(Open check - After tax/Before) as amount & safety limit as decimal value and with tip
#    And I click new check button on the Table layout screen
#    And I select table as "<table_no>"
#    And I select the number of seats as "<number_of_seats>"
#    And I tap Continue to finish selecting the number of seats
#    And I select Menu as category
#    And I select menu item as "<Menu_Item>"
#    And I change the Quantity of menu Item as "7"
#    And I click Options button
#    Then I should see the Check Options screen
#    And I click discount on check option screen
#    And I select open check discount
#    Then I should see Open discount Screen
#    And I pass the amount on open discount for open check discount safety limit percentage decimal precision as 20.50 for "<Discount4>"
#    Then I should see orderscreen with open check discount
#    Then I should see orderscreen with menu item prize as "<SubTotal>"
#    Then I should see the tax amount reflected to the check as "<Tax>"
#    Then I should see the Discount amount reflected to the check as "<Discount3>"
#    Then I should see orderscreen with menu item Total as "<Total3>"
#    And I click Payment button in the Order Management Screen
#    And I click credit card payment on payment window
#    Then I should see total screen
#    And I click custom for tip adjustment
#    Then I should see tip is added with menu total as "<Total3>"
#    Then I should see total amount as "<total3>" on total screen
#    And I click the Continue button on the Total screen
#    Then I should see your order card screen
#    Then I should see tip added on order screen
#    And I click manual button on the your order screen
#    And I pass the card number as "<card_number>"
#    And I pass card name as "<card_name>"
#    And I pass expire date as "<expire_date>"
#    And I click Process button on card screen
##    And I click Ok button in receipt printer popup
#    Then I should get back to the Table Layout tab
#    And I click power button
#    Examples:
#      |table_no| number_of_seats |Menu_Item|  SubTotal   | Tax         | Discount   | Total     | Discount1 |  card_number     | expire_date | card_name | total     | Discount3  | Total3    | Discount4 | total3    |
#      | T15     |1               |Halwa    | $ 70.00     | $ 7.00      | $ 14.00    | $ 63.00   | After     | 3530111333300000 | 1224        | JCB       | $ 73.00   |$ 20.50     | $ 56.50   | After     | $ 66.50   |
#
#
#  Scenario Outline: Check Payment through CC with discount(Open check - After tax/Before) as amount & safety limit as non-decimal value and with tip
#    And I click new check button on the Table layout screen
#    And I select table as "<table_no>"
#    And I select the number of seats as "<number_of_seats>"
#    And I tap Continue to finish selecting the number of seats
#    And I select Menu as category
#    And I select menu item as "<Menu_Item>"
#    And I change the Quantity of menu Item as "7"
#    And I click Options button
#    Then I should see the Check Options screen
#    And I click discount on check option screen
#    And I select open check discount
#    Then I should see Open discount Screen
#    And I pass the amount on open discount for open check discount safety percentage whole value as 20 for "<Discount1>"
#    Then I should see orderscreen with open check discount
#    Then I should see orderscreen with menu item prize as "<SubTotal>"
#    Then I should see the tax amount reflected to the check as "<Tax>"
#    Then I should see the Discount amount reflected to the check as "<Discount>"
#    Then I should see orderscreen with menu item Total as "<Total>"
#    And I click Payment button in the Order Management Screen
#    And I click credit card payment on payment window
#    Then I should see total screen
#    And I click custom for tip adjustment
#    Then I should see tip is added with menu total as "<Total>"
#    Then I should see total amount as "<total>" on total screen
#    And I click the Continue button on the Total screen
#    Then I should see your order card screen
#    Then I should see tip added on order screen
#    And I click manual button on the your order screen
#    And I pass the card number as "<card_number>"
#    And I pass card name as "<card_name>"
#    And I pass expire date as "<expire_date>"
#    And I click Process button on card screen
##    And I click Ok button in receipt printer popup
#    Then I should get back to the Table Layout tab
#
#   #Check Payment through CC with discount(Mix&Match - After/before tax) as set price and with tip
#    And I click new check button on the Table layout screen
#    And I select table as "<table_no>"
#    And I select the number of seats as "<number_of_seats>"
#    And I tap Continue to finish selecting the number of seats
#    And I select Menu as category
#    And I select menu item as "<Menu_Item>"
#    And I select menu item as "<Menu_Item>"
#    And I select Discount on the Order screen
#    Then I should see Check Based Discount Screen
#    And I click Discount as "<Discount3>"
#    And I click Back button on Discount Screen
#    And I select Discount on the Order screen
#    Then I should see Check Based Discount Screen
#    And I click Discount as "<Discount4>"
#    And I click Back button on Discount Screen
#    Then I should see orderscreen with menu item prize as "<SubTotal3>"
#    Then I should see the tax amount reflected to the check as "<Tax3>"
#    Then I should see the Discount amount reflected to the check as "<txtDiscount3>"
#    Then I should see orderscreen with menu item Total as "<Total3>"
#    And I click Payment button in the Order Management Screen
#    And I click credit card payment on payment window
#    Then I should see total screen
#    And I click custom for tip adjustment
#    Then I should see tip is added with menu total as "<Total3>"
#    Then I should see total amount as "<total3>" on total screen
#    And I click the Continue button on the Total screen
#    Then I should see your order card screen
#    Then I should see tip added on order screen
#    And I click manual button on the your order screen
#    And I pass the card number as "<card_number>"
#    And I pass card name as "<card_name>"
#    And I pass expire date as "<expire_date>"
#    And I click Process button on card screen
##    And I click Ok button in receipt printer popup
#    Then I should get back to the Table Layout tab
#    And I click power button
#    Examples:
#      |table_no| number_of_seats|Menu_Item  |  SubTotal     | Tax         | Discount  | Total       | Discount1 |  card_number     | expire_date | card_name | total       | SubTotal3     | Tax3     | txtDiscount3 | Total3      | Discount3             |Discount4                | total3   |
#      | T15     |1              |Halwa      |   $ 70.00     | $ 7.00      | $ 20.00   | $ 57.00     | After     | 3530111333300000 | 1224        | JCB       | $ 67.00     | $ 20.00       | $ 0.20   | $ 18.00      | $ 2.20      | CheckMixMatchSP(After) | CheckMixMatchSP(Before)|$ 12.20   |
#
#  @gi5
#  Scenario Outline: Check Payment through CC with discount(Mix&Match - After/before tax) as set each item price and with tip
#    And I click new check button on the Table layout screen
#    And I select table as "<table_no>"
#    And I select the number of seats as "<number_of_seats>"
#    And I tap Continue to finish selecting the number of seats
#    And I select Menu as category
#    And I select menu item as "<Menu_Item>"
#    And I select menu item as "<Menu_Item>"
#    And I select Discount on the Order screen
#    Then I should see Check Based Discount Screen
#    And I click Discount as "<Discount1>"
#    And I click Back button on Discount Screen
#    And I select Discount on the Order screen
#    Then I should see Check Based Discount Screen
#    And I click Discount as "<Discount2>"
#    And I click Back button on Discount Screen
#    Then I should see orderscreen with menu item prize as "<SubTotal>"
#    Then I should see the tax amount reflected to the check as "<Tax>"
#    Then I should see the Discount amount reflected to the check as "<Discount>"
#    Then I should see orderscreen with menu item Total as "<Total>"
#    And I click Payment button in the Order Management Screen
#    And I click credit card payment on payment window
#    Then I should see total screen
#    And I click custom for tip adjustment
#    Then I should see tip is added with menu total as "<Total>"
#    Then I should see total amount as "<total>" on total screen
#    And I click the Continue button on the Total screen
#    Then I should see your order card screen
#    Then I should see tip added on order screen
#    And I click manual button on the your order screen
#    And I pass the card number as "<card_number>"
#    And I pass card name as "<card_name>"
#    And I pass expire date as "<expire_date>"
#    And I click Process button on card screen
##    And I click Ok button in receipt printer popup
#    Then I should get back to the Table Layout tab
#    #Check Payment through CC with discount(Mix&Match - After/before tax) as set price(Most Expensive) and with tip
#    And I click new check button on the Table layout screen
#    And I select table as "<table_no>"
#    And I select the number of seats as "<number_of_seats>"
#    And I tap Continue to finish selecting the number of seats
#    And I select Menu as category
#    And I select menu item as "<Menu_Item>"
#    And I select menu item as "<Menu_Item1>"
#    And I select Discount on the Order screen
#    Then I should see Check Based Discount Screen
#    And I click Discount as "<Discount3>"
#    And I click Back button on Discount Screen
#    And I select Discount on the Order screen
#    Then I should see Check Based Discount Screen
#    And I click Discount as "<Discount4>"
#    And I click Back button on Discount Screen
#    And I compare menu price as "<price>" "<price1>" and applied "<Discount3>" on "<expensive>" menu Item
#    And I compare menu price as "<price>" "<price1>" and applied "<Discount4>" on "<expensive>" menu Item
#    Then I should see orderscreen with menu item prize as "<SubTotal3>"
#    Then I should see the tax amount reflected to the check as "<Tax3>"
#    Then I should see the Discount amount reflected to the check as "<txtDiscount3>"
#    Then I should see orderscreen with menu item Total as "<Total3>"
#    And I click Payment button in the Order Management Screen
#    And I click credit card payment on payment window
#    Then I should see total screen
#    And I click custom for tip adjustment
#    Then I should see tip is added with menu total as "<Total3>"
#    Then I should see total amount as "<total3>" on total screen
#    And I click the Continue button on the Total screen
#    Then I should see your order card screen
#    Then I should see tip added on order screen
#    And I click manual button on the your order screen
#    And I pass the card number as "<card_number>"
#    And I pass card name as "<card_name>"
#    And I pass expire date as "<expire_date>"
#    And I click Process button on card screen
##    And I click Ok button in receipt printer popup
#    Then I should get back to the Table Layout tab
#
#    #Check Payment through CC with discount(Mix&Match - After/before tax) as set price(Least Expensive) and with tip
#    And I click new check button on the Table layout screen
#    And I select table as "<table_no>"
#    And I select the number of seats as "<number_of_seats>"
#    And I tap Continue to finish selecting the number of seats
#    And I select Desserts as category
#    And I select menu item as "<Menu_Item2>"
#    And I select menu item as "<Menu_Item3>"
#    And I select Discount on the Order screen
#    Then I should see Check Based Discount Screen
#    And I click Discount as "<Discount5>"
#    And I click Back button on Discount Screen
#    And I select Discount on the Order screen
#    Then I should see Check Based Discount Screen
#    And I click Discount as "<Discount6>"
#    And I click Back button on Discount Screen
#    And I compare menu price as "<price2>" "<price3>" and applied "<Discount5>" on "<expensive>" menu Item
#    And I compare menu price as "<price2>" "<price3>" and applied "<Discount6>" on "<expensive>" menu Item
#    Then I should see orderscreen with menu item prize as "<SubTotal5>"
#    Then I should see the tax amount reflected to the check as "<Tax5>"
#    Then I should see the Discount amount reflected to the check as "<txtDiscount5>"
#    Then I should see orderscreen with menu item Total as "<Total5>"
#    And I click Payment button in the Order Management Screen
#    And I click credit card payment on payment window
#    Then I should see total screen
#    And I click custom for tip adjustment
#    Then I should see tip is added with menu total as "<Total5>"
#    Then I should see total amount as "<total5>" on total screen
#    And I click the Continue button on the Total screen
#    Then I should see your order card screen
#    Then I should see tip added on order screen
#    And I click manual button on the your order screen
#    And I pass the card number as "<card_number>"
#    And I pass card name as "<card_name>"
#    And I pass expire date as "<expire_date>"
#    And I click Process button on card screen
##    And I click Ok button in receipt printer popup
#    Then I should get back to the Table Layout tab
#    And I click power button
#    Examples:
#      |table_no| number_of_seats |Menu_Item| Menu_Item1 | SubTotal     | Tax      | Discount     | Total     | Discount1                |Discount2                |  card_number     | expire_date | card_name | total      |      price    |price1  |  SubTotal3      | Tax3       | txtDiscount3    | Total3       | Discount3                 |        Discount4           | total3      | expensive|         Menu_Item2   |Menu_Item3        | price2   |price3   | SubTotal5    | Tax5       | txtDiscount5   | Total5      | Discount5                 | Discount6                  | total5    | expensive |
#      | T15     |1               |  Halwa  | cake       |  $ 20.00     | $ 1.40   | $ 6.00       | $ 15.40   | CheckMixMatchSEIP(After) |CheckMixMatchSEIP(Before)| 3530111333300000 | 1224        | JCB       |$ 25.40     |       10.00   |8.00    |    $ 18.00      | $ 0.80     | $ 10.00         | $ 8.80       | CheckMixMatchSPerM(After) |CheckMixMatchSPerM(Befor)   |$ 18.80      |Most      |        Cheesecake   |Pumpkin Cheese Cake|15.00     |11.00    |  $ 26.00     | $ 1.50     | $ 11.00        | $ 16.50     | CheckMixMatchSPerL(After) | CheckMixMatchSPerL(Befor)  |$ 26.50    |Least      |
#
#
#  Scenario Outline: Check Payment through CC with Gratuity(Fixed) and with tips
#    And I click new check button on the Table layout screen
#    And I select table as "<table_no>"
#    And I select the number of seats as "<number_of_seats>"
#    And I tap Continue to finish selecting the number of seats
#    And I select Menu as category
#    And I select menu item as "<Menu_Item>"
#    #And I change the Quantity of menu Item as "7"
#    And I click Options button
#    Then I should see the Check Options screen
#    And I click Gratuity button
#    Then I should see Add Gratuity screen
#    And I click Gratuity Fixed button
#    Then I Should get back to the Order Screen
#    Then I should see orderscreen with menu item prize as "<SubTotal>"
#    Then I should see the tax amount reflected to the check as "<Tax>"
#    Then I should see the Gratuity amount reflected to the check as "<Gratuity>"
#    Then I should see orderscreen with menu item Total as "<Total>"
#    And I click Payment button in the Order Management Screen
#    And I click credit card payment on payment window
#    Then I should see total screen
#    And I click custom for tip adjustment
#    Then I should see tip is added with menu total as "<Total>"
#    Then I should see total amount as "<total>" on total screen
#    And I click the Continue button on the Total screen
#    Then I should see your order card screen
#    Then I should see tip added on order screen
#    And I click manual button on the your order screen
#    And I pass the card number as "<card_number>"
#    And I pass card name as "<card_name>"
#    And I pass expire date as "<expire_date>"
#    And I click Process button on card screen
##    And I click Ok button in receipt printer popup
#    Then I should get back to the Table Layout tab
#    #Check Payment through CC with Gratuity(Varying) and with tips
#    And I click new check button on the Table layout screen
#    And I select table as "<table_no>"
#    And I select the number of seats as "<number_of_seats>"
#    And I tap Continue to finish selecting the number of seats
#    And I select Menu as category
#    And I select menu item as "<Menu_Item>"
#    And I click Options button
#    Then I should see the Check Options screen
#    And I click Gratuity button
#    Then I should see Add Gratuity screen
#    And I click Gratuity varying button
#    Then I should see enter Percentage popup
#    And I pass the value and click Apply button as "<Percentage>"
#    Then I Should get back to the Order Screen
#    Then I should see orderscreen with menu item prize as "<SubTotal>"
#    Then I should see the tax amount reflected to the check as "<Tax>"
#    Then I should see the Gratuity amount reflected to the check as "<Gratuity1>"
#    Then I should see orderscreen with menu item Total as "<Total1>"
#    And I click Payment button in the Order Management Screen
#    And I click credit card payment on payment window
#    Then I should see total screen
#    And I click custom for tip adjustment
#    Then I should see tip is added with menu total as "<Total1>"
#    Then I should see total amount as "<total1>" on total screen
#    And I click the Continue button on the Total screen
#    Then I should see your order card screen
#    Then I should see tip added on order screen
#    And I click manual button on the your order screen
#    And I pass the card number as "<card_number>"
#    And I pass card name as "<card_name>"
#    And I pass expire date as "<expire_date>"
#    And I click Process button on card screen
##    And I click Ok button in receipt printer popup
#    Then I should get back to the Table Layout tab
#    And I click power button
#    Examples:
#      | table_no | number_of_seats | Menu_Item |  SubTotal   | Tax       | Gratuity   | Total       |  card_number     | expire_date | card_name | total      |     Gratuity1     | Total1        | total1      |Percentage |
#      | T9         |1              |  Halwa    | $ 10.00     | $ 1.00    |  $ 1.00    | $ 12.00     | 3530111333300000 | 1224        | JCB       |$ 22.00     |     $ 0.80        | $ 11.80       |$ 21.80      |8          |


  Scenario Outline: Check Payment through Other payment - Check with discount(item based - After tax) as amount 10
    And I click new check button on the Table layout screen
    And I select table as "<table_no>"
    And I select the number of seats as "<number_of_seats>"
    And I tap Continue to finish selecting the number of seats
    And I select Pasta as category
    And I select menu item as "<Menu_Item>"
    And I select modifier as "<Modifier>"
    And I click Done to get back
    And I select Discount on the Order screen
    Then I should see Check Based Discount Screen
    And I click Discount as "<Discount>"
    And I click Back button on Discount Screen
    Then I should see orderscreen with menu item prize as "<SubTotal>"
    Then I should see the tax amount reflected to the check as "<Tax>"
    Then I should see the Discount amount reflected to the check as "<Discount1>"
    Then I should see orderscreen with menu item Total as "<Total>"
    And I click Payment button in the Order Management Screen
    And I click other button from the payment method popup
    And I click Submit button on the Payment Window
#    Then I should see the print or send receipt
#    And I click No thanks Button on the print receipt
    Then I should get back to the Table Layout tab
    #Check payment through other payment Check with discount(item based - After tax) as set Price 500
    And I click new check button on the Table layout screen
    And I select table as "<table_no>"
    And I select the number of seats as "<number_of_seats>"
    And I tap Continue to finish selecting the number of seats
    And I select Pasta as category
    And I select menu item as "<Menu_Item>"
    And I select modifier as "<Modifier>"
    And I click Done to get back
    And I select Discount on the Order screen
    Then I should see Check Based Discount Screen
    And I click Discount as "<Discount2>"
    And I click Back button on Discount Screen
    Then I should see orderscreen with menu item prize as "<SubTotal2>"
    Then I should see the tax amount reflected to the check as "<Tax2>"
    Then I should see the Discount amount reflected to the check as "<txtDiscount2>"
    Then I should see orderscreen with menu item Total as "<Total2>"
    And I click Payment button in the Order Management Screen
    And I click other button from the payment method popup
    And I click Submit button on the Payment Window
#    Then I should see the print or send receipt
#    And I click No thanks Button on the print receipt
    Then I should get back to the Table Layout tab

    # Check payment through others payment Check with discount(item based - After tax) as Free
    And I click new check button on the Table layout screen
    And I select table as "<table_no>"
    And I select the number of seats as "<number_of_seats>"
    And I tap Continue to finish selecting the number of seats
    And I select Pasta as category
    And I select menu item as "<Menu_Item>"
    And I select modifier as "<Modifier>"
    And I click Done to get back
    And I select Discount on the Order screen
    Then I should see Check Based Discount Screen
    And I click Discount as "<Discount3>"
    And I click Back button on Discount Screen
    Then I should see orderscreen with as Onion Rings EACH
    Then I should see orderscreen with menu item prize as "<SubTotal3>"
    Then I should see the tax amount reflected to the check as "<Tax3>"
    Then I should see orderscreen with menu item Total without Discount or Tax as "<Total3>"
    And I click Payment button in the Order Management Screen
    And I click other button from the payment method popup
    And I click Submit button on the Payment Window
#    Then I should see the print or send receipt
#    And I click No thanks Button on the print receipt
    Then I should get back to the Table Layout tab

    #Check Payment through others payment - Check with discount(Item based - After tax) as Percentage
    And I click new check button on the Table layout screen
    And I select table as "<table_no>"
    And I select the number of seats as "<number_of_seats>"
    And I tap Continue to finish selecting the number of seats
    And I select Pasta as category
    And I select menu item as "<Menu_Item>"
    And I select modifier as "<Modifier>"
    And I click Done to get back
    And I select Discount on the Order screen
    Then I should see Check Based Discount Screen
    And I click Discount as "<Discount4>"
    And I click Back button on Discount Screen
    Then I should see orderscreen with menu item prize as "<SubTotal4>"
    Then I should see the tax amount reflected to the check as "<Tax4>"
    Then I should see the Discount amount reflected to the check as "<txtDiscount4>"
    Then I should see orderscreen with menu item Total as "<Total4>"
    And I click Payment button in the Order Management Screen
    And I click other button from the payment method popup
    And I click Submit button on the Payment Window
    Then I should get back to the Table Layout tab
    And I click power button
    Examples:
      | table_no | number_of_seats  |Menu_Item | Modifier |Discount            |Discount1  | SubTotal    | Tax       | Total       |Discount2                |txtDiscount2  | SubTotal2    | Tax2       | Total2       |    Discount3           | SubTotal3    | Tax3       | Total3        |Discount4               |txtDiscount4  | SubTotal4    | Tax4      | Total4       |
      | T12      |1                 | Ravioli  | Butter   | IB-AfterTax-Amount |$ 1.00     | $ 14.00     | $ 1.40    | $ 14.40     | IB-AfterTax-SetPrice500 |$ 12.50       | $ 14.00      | $ 1.40     | $ 2.90       | IB-AfterTax-AsFreeItem | $ 15.00      | $ 1.50     | $ 16.50       | IB-AfterTax-Percentage |$ 1.40        | $ 14.00      | $ 1.40    | $ 14.00      |


  Scenario Outline: Check Payment through others payment - Check with discount(Item based - Before tax) as Percentage
    And I click new check button on the Table layout screen
    And I select table as "<table_no>"
    And I select the number of seats as "<number_of_seats>"
    And I tap Continue to finish selecting the number of seats
    And I select Pasta as category
    And I select menu item as "<Menu_Item>"
    And I select modifier as "<Modifier>"
    And I click Done to get back
    And I select Discount on the Order screen
    Then I should see Check Based Discount Screen
    And I click Discount as "<Discount>"
    And I click Back button on Discount Screen
    Then I should see orderscreen with menu item prize as "<SubTotal>"
    Then I should see the tax amount reflected to the check as "<Tax>"
    Then I should see the Discount amount reflected to the check as "<Discount1>"
    Then I should see orderscreen with menu item Total as "<Total>"
    And I click Payment button in the Order Management Screen
    And I click other button from the payment method popup
    And I click Submit button on the Payment Window
    Then I should get back to the Table Layout tab
    # Check Payment through Other payment - Check with discount(item based - Before tax) as amount 10
    And I click new check button on the Table layout screen
    And I select table as "<table_no>"
    And I select the number of seats as "<number_of_seats>"
    And I tap Continue to finish selecting the number of seats
    And I select Pasta as category
    And I select menu item as "<Menu_Item>"
    And I select modifier as "<Modifier>"
    And I click Done to get back
    And I select Discount on the Order screen
    Then I should see Check Based Discount Screen
    And I click Discount as "<Discount2>"
    And I click Back button on Discount Screen
    Then I should see orderscreen with menu item prize as "<SubTotal2>"
    Then I should see the tax amount reflected to the check as "<Tax2>"
    Then I should see the Discount amount reflected to the check as "<txtDiscount2>"
    Then I should see orderscreen with menu item Total as "<Total2>"
    And I click Payment button in the Order Management Screen
    And I click other button from the payment method popup
    And I click Submit button on the Payment Window
    Then I should get back to the Table Layout tab

    #Check Payment through Other payment - Check with discount(item based - Before tax) as Set Price 500
    And I click new check button on the Table layout screen
    And I select table as "<table_no>"
    And I select the number of seats as "<number_of_seats>"
    And I tap Continue to finish selecting the number of seats
    And I select Pasta as category
    And I select menu item as "<Menu_Item>"
    And I select modifier as "<Modifier>"
    And I click Done to get back
    And I select Discount on the Order screen
    Then I should see Check Based Discount Screen
    And I click Discount as "<Discount3>"
    And I click Back button on Discount Screen
    Then I should see orderscreen with menu item prize as "<SubTotal3>"
    Then I should see the tax amount reflected to the check as "<Tax3>"
    Then I should see the Discount amount reflected to the check as "<txtDiscount3>"
    Then I should see orderscreen with menu item Total as "<Total3>"
    And I click Payment button in the Order Management Screen
    And I click other button from the payment method popup
    And I click Submit button on the Payment Window
    Then I should get back to the Table Layout tab
    #Check Payment through Other payment -  Check with discount(item based - Before tax) as Free Item
    And I click new check button on the Table layout screen
    And I select table as "<table_no>"
    And I select the number of seats as "<number_of_seats>"
    And I tap Continue to finish selecting the number of seats
    And I select Pasta as category
    And I select menu item as "<Menu_Item>"
    And I select modifier as "<Modifier>"
    And I click Done to get back
    And I select Discount on the Order screen
    Then I should see Check Based Discount Screen
    And I click Discount as "<Discount4>"
    And I click Back button on Discount Screen
    Then I should see orderscreen with as Onion Rings EACH
    Then I should see orderscreen with menu item prize as "<SubTotal4>"
    Then I should see the tax amount reflected to the check as "<Tax4>"
    Then I should see orderscreen with menu item Total without Discount or Tax as "<Total4>"
    And I click Payment button in the Order Management Screen
    And I click other button from the payment method popup
    And I click Submit button on the Payment Window
    Then I should get back to the Table Layout tab
    And I click power button
    Examples:
      | table_no | number_of_seats  |Menu_Item | Modifier |Discount                 |Discount1  | SubTotal    | Tax       | Total       |Discount2            |txtDiscount2  | SubTotal2    | Tax2    | Total2      |Discount3                  |txtDiscount3  | SubTotal3    | Tax3    | Total3    |Discount4                  | SubTotal4   | Tax4       | Total4       |
      | T12      |1                 | Ravioli  | Butter   | IB-BeforeTax-Percentage |$ 1.40     | $ 14.00     | $ 1.26    | $ 13.86     |IB-BeforeTax-Amount  |$ 1.00        | $ 14.00      | $ 1.30  | $ 14.30     |IB-BeforeTax-SetPrice500   |$ 13.00       | $ 14.00      | $ 0.10  | $ 1.10    | IB-BeforeTax-AsFreeItem   | $ 15.00     | $ 1.50     | $ 16.50      |


  Scenario Outline: Check Payment through Other payment - Check with discount(check based - After tax) as percentage
    And I click new check button on the Table layout screen
    And I select table as "<table_no>"
    And I select the number of seats as "<number_of_seats>"
    And I tap Continue to finish selecting the number of seats
    And I select Pasta as category
    And I select menu item as "<Menu_Item>"
    And I select modifier as "<Modifier>"
    And I click Done to get back
    And I select Pasta as category
    And I select menu item as "<Menu_Item>"
    And I select modifier as "<Modifier>"
    And I click Done to get back
    And I select Discount on the Order screen
    Then I should see Check Based Discount Screen
    And I click Discount as "<Discount>"
    And I click Back button on Discount Screen
    Then I should see orderscreen with menu item prize as "<SubTotal>"
    Then I should see the tax amount reflected to the check as "<Tax>"
    Then I should see the Discount amount reflected to the check as "<Discount1>"
    Then I should see orderscreen with menu item Total as "<Total>"
    And I click Payment button in the Order Management Screen
    And I click other button from the payment method popup
    And I click Submit button on the Payment Window
    Then I should get back to the Table Layout tab
    #Check Payment through Other payment - Check with discount(check based - After tax) as Amount
    And I click new check button on the Table layout screen
    And I select table as "<table_no>"
    And I select the number of seats as "<number_of_seats>"
    And I tap Continue to finish selecting the number of seats
    And I select Menu as category
    And I select menu item as "<Menu_Item1>"
    And I select menu item as "<Menu_Item1>"
    And I select Discount on the Order screen
    Then I should see Check Based Discount Screen
    And I click Discount as "<Discount2>"
    And I click Back button on Discount Screen
    Then I should see orderscreen with menu item prize as "<SubTotal2>"
    Then I should see the tax amount reflected to the check as "<Tax2>"
    Then I should see the Discount amount reflected to the check as "<txtDiscount2>"
    Then I should see orderscreen with menu item Total as "<Total2>"
    And I click Payment button in the Order Management Screen
    And I click other button from the payment method popup
    And I click Submit button on the Payment Window
    Then I should get back to the Table Layout tab
    #Check Payment through Other payment - Check with discount(check based - After tax) as set price
    And I click new check button on the Table layout screen
    And I select table as "<table_no>"
    And I select the number of seats as "<number_of_seats>"
    And I tap Continue to finish selecting the number of seats
    And I select Menu as category
    And I select menu item as "<Menu_Item1>"
    And I select menu item as "<Menu_Item1>"
    And I select Discount on the Order screen
    Then I should see Check Based Discount Screen
    And I click Discount as "<Discount3>"
    And I click Back button on Discount Screen
    Then I should see orderscreen with menu item prize as "<SubTotal3>"
    Then I should see the tax amount reflected to the check as "<Tax3>"
    Then I should see the Discount amount reflected to the check as "<txtDiscount3>"
    Then I should see orderscreen with menu item Total as "<Total3>"
    And I click Payment button in the Order Management Screen
    And I click other button from the payment method popup
    And I click Submit button on the Payment Window
    Then I should get back to the Table Layout tab
    #Check Payment through Other payment - Check with discount(check based - After tax) as Free Item
    And I click new check button on the Table layout screen
    And I select table as "<table_no>"
    And I select the number of seats as "<number_of_seats>"
    And I tap Continue to finish selecting the number of seats
    And I select Desserts as category
    And I select menu item as "<Menu_Item2>"
    And I select Discount on the Order screen
    Then I should see Check Based Discount Screen
    And I click Discount as "<Discount4>"
    And I click Back button on Discount Screen
    Then I should see orderscreen with as Onion Rings EACH
    Then I should see orderscreen with menu item prize as "<SubTotal4>"
    Then I should see the tax amount reflected to the check as "<Tax4>"
    Then I should see orderscreen with menu item Total without Discount or Tax as "<Total4>"
    And I click Payment button in the Order Management Screen
    And I click other button from the payment method popup
    And I click Submit button on the Payment Window
    Then I should get back to the Table Layout tab
    And I click power button
    Examples:
      | table_no | number_of_seats | Menu_Item | Modifier |Discount                  | SubTotal    | Tax       | Discount1 |Total        |   Menu_Item1   |Discount2              | SubTotal2   | Tax2      | txtDiscount2 |Total2         |Discount3               | SubTotal3   | Tax3     | txtDiscount3 |Total3       |  Menu_Item2      |Discount4            | SubTotal4    | Tax4       | Total4    |
      | T12      | 1               | Ravioli   | Butter   |CB-AfterTax-Percentage10  | $ 28.00     | $ 2.80    | $ 2.80    | $ 28.00     | cake           |CB-AfterTax-Amount1000 | $ 16.00     | $ 1.60    | $ 1.00       | $ 16.60       |CB-AfterTaxSetPrice2500 | $ 16.00     | $ 1.60   | $ 0.56       | $ 17.04     |  Cheesecake      | CB-AfterTax-Free300 | $ 17.00      | $ 1.70     | $ 18.70   |


  Scenario Outline: Check Payment through Other payment - Check with discount(check based - Before tax) as Percentage
    And I click new check button on the Table layout screen
    And I select table as "<table_no>"
    And I select the number of seats as "<number_of_seats>"
    And I tap Continue to finish selecting the number of seats
    And I select Pasta as category
    And I select menu item as "<Menu_Item>"
    And I select modifier as "<Modifier>"
    And I click Done to get back
    And I select Pasta as category
    And I select menu item as "<Menu_Item>"
    And I select modifier as "<Modifier>"
    And I click Done to get back
    And I select Discount on the Order screen
    Then I should see Check Based Discount Screen
    And I click Discount as "<Discount>"
    And I click Back button on Discount Screen
    Then I should see orderscreen with menu item prize as "<SubTotal>"
    Then I should see the tax amount reflected to the check as "<Tax>"
    Then I should see the Discount amount reflected to the check as "<Discount1>"
    Then I should see orderscreen with menu item Total as "<Total>"
    And I click Payment button in the Order Management Screen
    And I click other button from the payment method popup
    And I click Submit button on the Payment Window
    Then I should get back to the Table Layout tab
    #Check Payment through Other payment - Check with discount(check based - Before tax) as Amount
    And I click new check button on the Table layout screen
    And I select table as "<table_no>"
    And I select the number of seats as "<number_of_seats>"
    And I tap Continue to finish selecting the number of seats
    And I select Pasta as category
    And I select menu item as "<Menu_Item>"
    And I select modifier as "<Modifier>"
    And I click Done to get back
    And I select menu item as "<Menu_Item>"
    And I select modifier as "<Modifier>"
    And I click Done to get back
    And I select Discount on the Order screen
    Then I should see Check Based Discount Screen
    And I click Discount as "<Discount2>"
    And I click Back button on Discount Screen
    Then I should see orderscreen with menu item prize as "<SubTotal2>"
    Then I should see the tax amount reflected to the check as "<Tax2>"
    Then I should see the Discount amount reflected to the check as "<txtDiscount2>"
    Then I should see orderscreen with menu item Total as "<Total2>"
    And I click Payment button in the Order Management Screen
    And I click other button from the payment method popup
    And I click Submit button on the Payment Window
    Then I should get back to the Table Layout tab
    #Check Payment through Other payment - Check with discount(check based - Before tax) as Set Price
    And I click new check button on the Table layout screen
    And I select table as "<table_no>"
    And I select the number of seats as "<number_of_seats>"
    And I tap Continue to finish selecting the number of seats
    And I select Menu as category
    And I select menu item as "<Menu_Item1>"
    And I select menu item as "<Menu_Item1>"
    And I select Discount on the Order screen
    Then I should see Check Based Discount Screen
    And I click Discount as "<Discount3>"
    And I click Back button on Discount Screen
    Then I should see orderscreen with menu item prize as "<SubTotal3>"
    Then I should see the tax amount reflected to the check as "<Tax3>"
    Then I should see the Discount amount reflected to the check as "<txtDiscount3>"
    Then I should see orderscreen with menu item Total as "<Total3>"
    And I click Payment button in the Order Management Screen
    And I click other button from the payment method popup
    And I click Submit button on the Payment Window
    Then I should get back to the Table Layout tab
    #Check Payment through Other payment - Check with discount(check based - Before tax) as Free Item
    And I click new check button on the Table layout screen
    And I select table as "<table_no>"
    And I select the number of seats as "<number_of_seats>"
    And I tap Continue to finish selecting the number of seats
    And I select Desserts as category
    And I select menu item as "<Menu_Item2>"
    And I select Discount on the Order screen
    Then I should see Check Based Discount Screen
    And I click Discount as "<Discount4>"
    And I click Back button on Discount Screen
    Then I should see orderscreen with as Onion Rings EACH
    Then I should see discount as "<Discount4>" on the order screen
    Then I should see orderscreen with menu item prize as "<SubTotal4>"
    Then I should see the tax amount reflected to the check as "<Tax4>"
    Then I should see orderscreen with menu item Total without Discount or Tax as "<Total4>"
    And I click Payment button in the Order Management Screen
    And I click other button from the payment method popup
    And I click Submit button on the Payment Window
    Then I should get back to the Table Layout tab
    And I click power button
    Examples:
      | table_no | number_of_seats | Menu_Item | Modifier |Discount                  | SubTotal    | Tax       | Discount1       |Total       |Discount2                  | SubTotal2    | Tax2       | txtDiscount2  |Total2       | Menu_Item1  |Discount3                    | SubTotal3    | Tax3       | txtDiscount3 |Total3       |Menu_Item2     |Discount4               | SubTotal4  | Tax4   | Total4  |
      | T12      | 1               |  Ravioli  | Butter   |CB-BeforeTax-Percentage10 | $ 28.00     | $ 2.52    | $ 2.80          | $ 27.72    |  CB-BeforeTax-Amount1000  | $ 28.00      | $ 2.70     | $ 1.00        |$ 29.70      |  cake       |CB-BeforeTax-SetPrice1000    | $ 16.00      | $ 1.00     | $ 6.00       | $ 11.00     |Cheesecake     |  CB-BeforeTax-Free300  | $ 17.00    | $ 1.70 | $ 18.70 |


#  Scenario Outline: Check Payment through Other Payment - Check with open check discount as amount and safety limit in Whole Value as 20(After Tax)
#    And I click new check button on the Table layout screen
#    And I select table as "<table_no>"
#    And I select the number of seats as "<number_of_seats>"
#    And I tap Continue to finish selecting the number of seats
#    And I select Menu as category
#    And I select menu item as "<Menu_Item>"
#    And I change the Quantity of menu Item as "7"
#    And I click Options button
#    Then I should see the Check Options screen
#    And I click discount on check option screen
#    And I select open check discount
#    Then I should see Open discount Screen
#    And I pass the amount on open discount for open check discount safety percentage whole value as 20 for "<Discount1>"
#    Then I should see orderscreen with open check discount
#    Then I should see orderscreen with menu item prize as "<SubTotal>"
#    Then I should see the tax amount reflected to the check as "<Tax>"
#    Then I should see the Discount amount reflected to the check as "<Discount>"
#    Then I should see orderscreen with menu item Total as "<Total>"
#    And I click Payment button in the Order Management Screen
#    And I click other button from the payment method popup
#    And I click Submit button on the Payment Window
#    Then I should get back to the Table Layout tab
#    #Check Payment through Other payment - Check with open Check discount as amount and safety limit in decimal precision (After Tax)
#    And I click new check button on the Table layout screen
#    And I select table as "<table_no>"
#    And I select the number of seats as "<number_of_seats>"
#    And I tap Continue to finish selecting the number of seats
#    And I select Menu as category
#    And I select menu item as "<Menu_Item>"
#    And I change the Quantity of menu Item as "7"
#    And I click Options button
#    Then I should see the Check Options screen
#    And I click discount on check option screen
#    And I select open check discount
#    Then I should see Open discount Screen
#    And I pass the amount on open discount for open check discount safety limit percentage decimal precision as 20.50 for "<Discount2>"
#    Then I should see orderscreen with open check discount
#    Then I should see orderscreen with menu item prize as "<SubTotal>"
#    Then I should see the tax amount reflected to the check as "<Tax>"
#    Then I should see the Discount amount reflected to the check as "<txtDiscount2>"
#    Then I should see orderscreen with menu item Total as "<Total2>"
#    And I click Payment button in the Order Management Screen
#    And I click other button from the payment method popup
#    And I click Submit button on the Payment Window
#    Then I should get back to the Table Layout tab
#    #Check Payment through Other payment - Check with open Check discount as percentage (After Tax)
#    And I click new check button on the Table layout screen
#    And I select table as "<table_no>"
#    And I select the number of seats as "<number_of_seats>"
#    And I tap Continue to finish selecting the number of seats
#    And I select Menu as category
#    And I select menu item as "<Menu_Item>"
#    And I change the Quantity of menu Item as "7"
#    And I click Options button
#    Then I should see the Check Options screen
#    And I click discount on check option screen
#    And I select open check discount
#    Then I should see Open discount Screen
#    And I pass the amount on open discount for open check discount percentage as 20 for "<Discount1>"
#    Then I should see orderscreen with open check discount
#    Then I should see orderscreen with menu item prize as "<SubTotal>"
#    Then I should see the tax amount reflected to the check as "<Tax>"
#    Then I should see the Discount amount reflected to the check as "<Discount3>"
#    Then I should see orderscreen with menu item Total as "<Total3>"
#    And I click Payment button in the Order Management Screen
#    And I click other button from the payment method popup
#    And I click Submit button on the Payment Window
#    Then I should get back to the Table Layout tab
#    And I click power button
#    Examples:
#      |table_no| number_of_seats |Menu_Item|  SubTotal  | Tax       | Discount | Total   | Discount1 |txtDiscount2 | Total2  | Discount2 | Discount3 | Total3    |
#      | T15    |1                |Halwa    |$ 70.00     | $ 7.00    | $ 20.00  | $ 57.00 | After     |$ 20.50      | $ 56.50 | After     |$ 14.00    | $ 63.00   |
#
#
#  Scenario Outline: Check Payment through Other payment - Check with open Check discount as amount and safety limit in decimal precision(Before Tax)
#    And I click new check button on the Table layout screen
#    And I select table as "<table_no>"
#    And I select the number of seats as "<number_of_seats>"
#    And I tap Continue to finish selecting the number of seats
#    And I select Menu as category
#    And I select menu item as "<Menu_Item>"
#    And I change the Quantity of menu Item as "7"
#    And I click Options button
#    Then I should see the Check Options screen
#    And I click discount on check option screen
#    And I select open check discount
#    Then I should see Open discount Screen
#    And I pass the amount on open discount for open check discount safety limit percentage decimal precision as 20.50 for "<Discount1>"
#    Then I should see orderscreen with open check discount
#    Then I should see orderscreen with menu item prize as "<SubTotal>"
#    Then I should see the tax amount reflected to the check as "<Tax>"
#    Then I should see the Discount amount reflected to the check as "<Discount>"
#    Then I should see orderscreen with menu item Total as "<Total>"
#    And I click Payment button in the Order Management Screen
#    And I click other button from the payment method popup
#    And I click Submit button on the Payment Window
#    Then I should get back to the Table Layout tab
#    #Check Payment through Other payment -  Check with open Check discount as amount and safety limit in whole value (Before Tax)
#    And I click new check button on the Table layout screen
#    And I select table as "<table_no>"
#    And I select the number of seats as "<number_of_seats>"
#    And I tap Continue to finish selecting the number of seats
#    And I select Menu as category
#    And I select menu item as "<Menu_Item>"
#    And I change the Quantity of menu Item as "7"
#    And I click Options button
#    Then I should see the Check Options screen
#    And I click discount on check option screen
#    And I select open check discount
#    Then I should see Open discount Screen
#    And I pass the amount on open discount for open check discount safety percentage whole value as 20 for "<Discount1>"
#    Then I should see orderscreen with open check discount
#    Then I should see orderscreen with menu item prize as "<SubTotal>"
#    Then I should see the tax amount reflected to the check as "<Tax2>"
#    Then I should see the Discount amount reflected to the check as "<txtDiscount2>"
#    Then I should see orderscreen with menu item Total as "<Total2>"
#    And I click Payment button in the Order Management Screen
#    And I click other button from the payment method popup
#    And I click Submit button on the Payment Window
#    Then I should get back to the Table Layout tab
#    #Check Payment through Other payment - Check with open Check discount as percentage (Before Tax)
#    And I click new check button on the Table layout screen
#    And I select table as "<table_no>"
#    And I select the number of seats as "<number_of_seats>"
#    And I tap Continue to finish selecting the number of seats
#    And I select Menu as category
#    And I select menu item as "<Menu_Item>"
#    And I change the Quantity of menu Item as "7"
#    And I click Options button
#    Then I should see the Check Options screen
#    And I click discount on check option screen
#    And I select open check discount
#    Then I should see Open discount Screen
#    And I pass the amount on open discount for open check discount percentage as 20 for "<Discount1>"
#    Then I should see orderscreen with open check discount
#    Then I should see orderscreen with menu item prize as "<SubTotal>"
#    Then I should see the tax amount reflected to the check as "<Tax3>"
#    Then I should see the Discount amount reflected to the check as "<txtDiscount3>"
#    Then I should see orderscreen with menu item Total as "<Total3>"
#    And I click Payment button in the Order Management Screen
#    And I click other button from the payment method popup
#    And I click Submit button on the Payment Window
#    Then I should get back to the Table Layout tab
#    And I click power button
#    Examples:
#      |table_no| number_of_seats |Menu_Item|  SubTotal  | Tax        | Discount  | Total       | Discount1 |  Tax2     | txtDiscount2 | Total2        |  Tax3     | txtDiscount3 | Total3  |
#      | T15     |1               |Halwa    |   $ 70.00  | $ 4.95     | $ 20.50   | $ 54.45     | Before    |$ 5.00     | $ 20.00      | $ 55.00       |  $ 5.60   | $ 14.00      | $ 61.60 |


  Scenario Outline: Check Payment through Other payment - Check with Mix&Match discount as Set Price(After Tax)
    And I click new check button on the Table layout screen
    And I select table as "<table_no>"
    And I select the number of seats as "<number_of_seats>"
    And I tap Continue to finish selecting the number of seats
    And I select Menu as category
    And I select menu item as "<Menu_Item>"
    And I select menu item as "<Menu_Item>"
    And I select Discount on the Order screen
    Then I should see Check Based Discount Screen
    And I click Discount as "<Discount1>"
    And I click Back button on Discount Screen
    Then I should see orderscreen with menu item prize as "<SubTotal>"
    Then I should see the tax amount reflected to the check as "<Tax>"
    Then I should see the Discount amount reflected to the check as "<Discount>"
    Then I should see orderscreen with menu item Total as "<Total>"
    And I click Payment button in the Order Management Screen
    And I click other button from the payment method popup
    And I click Submit button on the Payment Window
    Then I should get back to the Table Layout tab
    #Check Payment through Other payment - Check with Mix&Match discount as Set Each Item Price(After Tax)
    And I click new check button on the Table layout screen
    And I select table as "<table_no>"
    And I select the number of seats as "<number_of_seats>"
    And I tap Continue to finish selecting the number of seats
    And I select Menu as category
    And I select menu item as "<Menu_Item>"
    And I select menu item as "<Menu_Item>"
    And I select Discount on the Order screen
    Then I should see Check Based Discount Screen
    And I click Discount as "<Discount2>"
    And I click Back button on Discount Screen
    Then I should see orderscreen with menu item prize as "<SubTotal2>"
    Then I should see the tax amount reflected to the check as "<Tax2>"
    Then I should see the Discount amount reflected to the check as "<txtDiscount2>"
    Then I should see orderscreen with menu item Total as "<Total2>"
    And I click Payment button in the Order Management Screen
    And I click other button from the payment method popup
    And I click Submit button on the Payment Window
    Then I should get back to the Table Layout tab
    #Check Payment through Other payment - Check with Mix&Match discount as Set Percentage(Most Expensive)(After tax)
    And I click new check button on the Table layout screen
    And I select table as "<table_no>"
    And I select the number of seats as "<number_of_seats>"
    And I tap Continue to finish selecting the number of seats
    And I select Menu as category
    And I select menu item as "<Menu_Item>"
    And I select menu item as "<Menu_Item1>"
    And I select Discount on the Order screen
    Then I should see Check Based Discount Screen
    And I click Discount as "<Discount3>"
    And I click Back button on Discount Screen
    And I compare menu price as "<Menu>" "<Menu1>" and applied "<Discount3>" on "<expensive>" menu Item
    Then I should see orderscreen with menu item prize as "<SubTotal3>"
    Then I should see the tax amount reflected to the check as "<Tax3>"
    Then I should see the Discount amount reflected to the check as "<txtDiscount3>"
    Then I should see orderscreen with menu item Total as "<Total3>"
    And I click Payment button in the Order Management Screen
    And I click other button from the payment method popup
    And I click Submit button on the Payment Window
    Then I should get back to the Table Layout tab
    #Check Payment through Other payment - Check with Mix&Match discount as Set Percentage(Least Expensive)(After tax)
    And I click new check button on the Table layout screen
    And I select table as "<table_no>"
    And I select the number of seats as "<number_of_seats>"
    And I tap Continue to finish selecting the number of seats
    And I select Desserts as category
    And I select menu item as "<Menu_Item2>"
    And I select menu item as "<Menu_Item3>"
    And I select Discount on the Order screen
    Then I should see Check Based Discount Screen
    And I click Discount as "<Discount4>"
    And I click Back button on Discount Screen
    And I compare menu price as "<Menu2>" "<Menu3>" and applied "<Discount4>" on "<expensive1>" menu Item
    Then I should see orderscreen with menu item prize as "<SubTotal4>"
    Then I should see the tax amount reflected to the check as "<Tax4>"
    Then I should see the Discount amount reflected to the check as "<txtDiscount4>"
    Then I should see orderscreen with menu item Total as "<Total4>"
    And I click Payment button in the Order Management Screen
    And I click other button from the payment method popup
    And I click Submit button on the Payment Window
    Then I should get back to the Table Layout tab
    And I click power button
    Examples:
      |table_no| number_of_seats |Menu_Item|  SubTotal   | Tax       | Discount | Total   | Discount1              | SubTotal2  | Tax2     | txtDiscount2  | Total2        | Discount2                |  Menu_Item1 |Menu      |Menu1    |  SubTotal3     | Tax3       | txtDiscount3   | Total3       | Discount3                  | expensive |   Menu_Item2   |Menu_Item3         |Menu2   |Menu3 |  SubTotal4    | Tax4       | txtDiscount4   | Total4     | Discount4                 | expensive1 |
      | T15    |1                |  Halwa  |   $ 20.00   | $ 2.00    | $ 8.00   | $ 14.00 | CheckMixMatchSP(After) | $ 20.00    | $ 2.00   | $ 2.00        | $ 20.00       | CheckMixMatchSEIP(After) |  cake       |10.00     |8.00     | $ 18.00        | $ 1.80     | $ 5.00         | $ 14.80      | CheckMixMatchSPerM(After)   |Most      | Cheesecake     |Pumpkin Cheese Cake|  15.00 |11.00 |$ 26.00        | $ 2.60     | $ 5.50         | $ 23.10    | CheckMixMatchSPerL(After) |Least       |


 Scenario Outline: Check Payment through Other payment - Check with Mix&Match discount as Set Price as 500(Before tax)
    And I click new check button on the Table layout screen
    And I select table as "<table_no>"
    And I select the number of seats as "<number_of_seats>"
    And I tap Continue to finish selecting the number of seats
    And I select Menu as category
    And I select menu item as "<Menu_Item>"
    And I select menu item as "<Menu_Item1>"
    And I select Discount on the Order screen
    Then I should see Check Based Discount Screen
    And I click Discount as "<Discount1>"
    And I click Back button on Discount Screen
    Then I should see discount as "<Discount1>" on the order screen
    Then I should see orderscreen with menu item prize as "<SubTotal>"
    Then I should see the tax amount reflected to the check as "<Tax>"
    Then I should see the Discount amount reflected to the check as "<Discount>"
    Then I should see orderscreen with menu item Total as "<Total>"
    And I click Payment button in the Order Management Screen
    And I click other button from the payment method popup
    And I click Submit button on the Payment Window
    Then I should get back to the Table Layout tab
    #Check Payment through Other payment - Check with Mix&Match discount as Set Each Item Price as 500(Before tax)
    And I click new check button on the Table layout screen
    And I select table as "<table_no>"
    And I select the number of seats as "<number_of_seats>"
    And I tap Continue to finish selecting the number of seats
    And I select Menu as category
    And I select menu item as "<Menu_Item>"
    And I select menu item as "<Menu_Item1>"
    And I select Discount on the Order screen
    Then I should see Check Based Discount Screen
    And I click Discount as "<Discount2>"
    And I click Back button on Discount Screen
    Then I should see discount as "<Discount2>" on the order screen
    Then I should see orderscreen with menu item prize as "<SubTotal2>"
    Then I should see the tax amount reflected to the check as "<Tax2>"
    Then I should see the Discount amount reflected to the check as "<txtDiscount2>"
    Then I should see orderscreen with menu item Total as "<Total2>"
    And I click Payment button in the Order Management Screen
    And I click other button from the payment method popup
    And I click Submit button on the Payment Window
    Then I should get back to the Table Layout tab

#    Scenario Outline: Check Payment through Other payment - Check with Mix&Match discount as Set Percentage Most Expensive (Before tax)
    And I click new check button on the Table layout screen
    And I select table as "<table_no>"
    And I select the number of seats as "<number_of_seats>"
    And I tap Continue to finish selecting the number of seats
    And I select Menu as category
    And I select menu item as "<Menu_Item>"
    And I select menu item as "<Menu_Item1>"
    And I select Discount on the Order screen
    Then I should see Check Based Discount Screen
    And I click Discount as "<Discount3>"
    And I click Back button on Discount Screen
    And I compare menu price as "<Menu>" "<Menu1>" and applied "<Discount3>" on "<expensive>" menu Item
    Then I should see orderscreen with menu item prize as "<SubTotal3>"
    Then I should see the tax amount reflected to the check as "<Tax3>"
    Then I should see the Discount amount reflected to the check as "<txtDiscount3>"
    Then I should see orderscreen with menu item Total as "<Total3>"
    And I click Payment button in the Order Management Screen
    And I click other button from the payment method popup
    And I click Submit button on the Payment Window
    Then I should get back to the Table Layout tab
    #Check Payment through Other payment - Check with Mix&Match discount as Set Percentage Least Expensive (Before tax)
    And I click new check button on the Table layout screen
    And I select table as "<table_no>"
    And I select the number of seats as "<number_of_seats>"
    And I tap Continue to finish selecting the number of seats
    And I select Desserts as category
    And I select menu item as "<Menu_Item2>"
    And I select menu item as "<Menu_Item3>"
    And I select Discount on the Order screen
    Then I should see Check Based Discount Screen
    And I click Discount as "<Discount4>"
    And I click Back button on Discount Screen
    And I compare menu price as "<Menu2>" "<Menu3>" and applied "<Discount4>" on "<expensive1>" menu Item
    Then I should see orderscreen with menu item prize as "<SubTotal4>"
    Then I should see the tax amount reflected to the check as "<Tax4>"
    Then I should see the Discount amount reflected to the check as "<txtDiscount4>"
    Then I should see orderscreen with menu item Total as "<Total4>"
    And I click Payment button in the Order Management Screen
    And I click other button from the payment method popup
    And I click Submit button on the Payment Window
    Then I should get back to the Table Layout tab
    And I click power button

    Examples:
      |table_no| number_of_seats |Menu_Item | Menu_Item1|  SubTotal    | Tax       | Discount   | Total       | Discount1               |SubTotal2      | Tax2       | txtDiscount2   | Total2  | Discount2                 |  Menu     |Menu1      |  SubTotal3 | Tax3   | txtDiscount3 | Total3    | Discount3                  | expensive |Menu_Item2   | Menu_Item3          | Menu2 | Menu3 |expensive1| SubTotal4    | Tax4       | txtDiscount4   | Total4     | Discount4                 |
      | T16    |1                | cake     | Halwa     |  $ 18.00     | $ 1.00    | $ 8.00     | $ 11.00     | CheckMixMatchSP(Before) |  $ 18.00      | $ 1.60     | $ 2.00         | $ 17.60 | CheckMixMatchSEIP(Before) |    8.00  |10.00       | $ 18.00    | $ 1.30 | $ 5.00       | $ 14.30   | CheckMixMatchSPerM(Befor)  |Most       | Cheesecake  | Pumpkin Cheese Cake |15.00  |11.00  |Least    |  $ 26.00     | $ 2.05     | $ 5.50         | $ 22.55    | CheckMixMatchSPerL(Befor) |


  Scenario Outline: Check Payment through Other payment - Check with Exclusive Tax
    And I click new check button on the Table layout screen
    And I select table as "<table_no>"
    And I select the number of seats as "<number_of_seats>"
    And I tap Continue to finish selecting the number of seats
    And I select Pasta as category
    And I select menu item as Ravioli for Item Based Exclusive Tax
    And I select modifier as "<Modifier>"
    And I click Done to get back
    Then I should see orderscreen with menu item prize as "<SubTotal>"
    Then I should see the tax amount reflected to the check as "<Tax>"
    Then I should see orderscreen with menu item Total without Discount or Tax as "<Total>"
    And I click Payment button in the Order Management Screen
    And I click other button from the payment method popup
    And I click Submit button on the Payment Window
    Then I should get back to the Table Layout tab
    And I click power button
    Examples:
      | table_no | number_of_seats | Modifier | Tax      | SubTotal | Total   |
      | T18      |1                | Butter   | $ 1.40   | $ 14.00  | $ 15.40 |


  Scenario Outline: Check Payment through other payment - Check with tax exempt and with customer
    And I click new check button on the Table layout screen
    And I select table as "<table_no>"
    And I select the number of seats as "<number_of_seats>"
    And I tap Continue to finish selecting the number of seats
    And I click Add Customer Button
    And I search for "<customer_name>"
    When I click "<customer_name>" to select customer for the seat
    And I select Menu as category
    And I select menu item as "<Menu_Item>"
    Then I should see orderscreen with menu item prize as "<SubTotal>"
    Then I should see the tax amount reflected to the check as "<Tax>"
    Then I should see orderscreen with menu item Total without Discount or Tax as "<Total>"
    And I click Options button
    Then I should see the Check Options screen
    And I click Tax Exempt Button
#    Then I should see tax exempt reasons
#    When I select School as reason
    Then I Should get back to the Order Screen
    Then I should see orderscreen with menu item prize as "<SubTotal>"
    Then I should not see tax on the order screen
    Then I should see orderscreen with menu item Total without Tax Exempt as "<Total1>"
    And I click Payment button in the Order Management Screen
    And I click other button from the payment method popup
    And I click Submit button on the Payment Window
    Then I should get back to the Table Layout tab
    #Check Payment through other payment - Check with tax exempt and without customer
    And I click new check button on the Table layout screen
    And I select table as "<table_no>"
    And I select the number of seats as "<number_of_seats>"
    And I tap Continue to finish selecting the number of seats
    And I select Menu as category
    And I select menu item as "<Menu_Item>"
    Then I should see orderscreen with menu item prize as "<SubTotal>"
    Then I should see the tax amount reflected to the check as "<Tax>"
    Then I should see orderscreen with menu item Total without Discount or Tax as "<Total>"
    And I click Options button
    Then I should see the Check Options screen
    And I click Tax Exempt Button
#    Then I should see tax exempt reasons
#    When I select School as reason
    Then I Should get back to the Order Screen
    Then I should see orderscreen with menu item prize as "<SubTotal>"
#    And I should see the tax reflected to the check
    Then I should not see tax on the order screen
    Then I should see orderscreen with menu item Total without Tax Exempt as "<Total1>"
    And I click Payment button in the Order Management Screen
    And I click other button from the payment method popup
    And I click Submit button on the Payment Window
    Then I should get back to the Table Layout tab
    #Check Payment through other payment - Check with tax exempt and without customer through payment screen
#    And I click new check button on the Table layout screen
#    And I select table as "<table_no>"
#    And I select the number of seats as "<number_of_seats>"
#    And I tap Continue to finish selecting the number of seats
#    And I select Menu as category
#    And I select menu item as "<Menu_Item>"
#    Then I should see orderscreen with menu item prize as "<SubTotal>"
#    Then I should see the tax amount reflected to the check as "<Tax>"
#    Then I should see orderscreen with menu item Total without Discount or Tax as "<Total>"
#    And I click Payment button in the Order Management Screen
#    And I click Tax Exempt Button from the Payment Screen
##    Then I should see tax exempt reasons
##    When I select School as reason
#    Then I Should get back to the Order Screen
#    Then I should see orderscreen with menu item prize as "<SubTotal>"
#    And I should see the tax reflected to the check
#    Then I should see orderscreen with menu item Total without Tax Exempt as "<Total1>"
#    And I click Payment button in the Order Management Screen
#    And I click other button from the payment method popup
#    And I click Submit button on the Payment Window
#    Then I should get back to the Table Layout tab
    #Check Payment through other payment - Check with tax exempt for pre defined customer
    And I click new check button on the Table layout screen
    And I select table as "<table_no>"
    And I select the number of seats as "<number_of_seats>"
    And I tap Continue to finish selecting the number of seats
    And I click Add Customer Button
    And I search for "<customer_name>"
    When I click "<customer_name>" to select customer for the seat
    And I click the customer name on the order screen
    Then I should see the customer profile window
#    And I select the customer for tax exempt
    And I select tax exempt on customer profile screen
    And I click the Save button
    Then I Should get back to the Order Screen
    And I select Menu as category
    And I select menu item as "<Menu_Item>"
    Then I should see orderscreen with menu item prize as "<SubTotal>"
    And I should not see tax on the order screen
    Then I should see orderscreen with menu item Total without Tax Exempt as "<Total1>"
    And I click Payment button in the Order Management Screen
    And I click other button from the payment method popup
    And I click Submit button on the Payment Window
    Then I should get back to the Table Layout tab
    And I click the Operation button on the Table Layout
    And I click POS Icon from Toggle
    And I close the order type window
    And I click Add Customer Button
    And I search for "<customer_name>"
    When I click "<customer_name>" to select customer for the seat
    And I click the customer name on the order screen
    Then I should see the customer profile window
#    And I select the customer for tax exempt
    And I select tax exempt on customer profile screen
    And I click the Save button
    Then I Should get back to the Order Screen
    Then I should see the tax reflected to the check
    And I click All
    And I click Table Layout tab
    And I click power button
    Examples:
      | table_no | number_of_seats |customer_name| Menu_Item  |  SubTotal   | Tax       | Total       | Total1      |
      | T9       |1                | tax exe     | Halwa      | $ 10.00     | $ 1.00    | $ 11.00     | $ 10.00     |

#1
#  Scenario Outline:Check Payment through other payment - Check with vary gratuity through Payment screen
#    And I click new check button on the Table layout screen
#    And I select table as "<table_no>"
#    And I select the number of seats as "<number_of_seats>"
#    And I tap Continue to finish selecting the number of seats
#    And I select Menu as category
#    And I select menu item as "<Menu_Item>"
#    And I click Payment button in the Order Management Screen
#    And I click add gratuity from Payment screen
#    Then I should see the Check Options screen
#    Then I should see Add Gratuity screen
#    And I click Gratuity varying button
#    Then I should see enter Percentage popup
#    And I pass the value and click Apply button
#    And I pass the value and click Apply button as "8"
#    Then I Should get back to the Order Screen
#    Then I should see orderscreen with menu item prize as "<SubTotal>"
#    Then I should see the tax amount reflected to the check as "<Tax>"
#    Then I should see the Gratuity amount reflected to the check as "<Gratuity>"
#    Then I should see orderscreen with menu item Total as "<Total>"
#    And I click Payment button in the Order Management Screen
#    And I click other button from the payment method popup
#    And I click Submit button on the Payment Window
#    Then I should get back to the Table Layout tab
#    And I click power button
#    Examples:
#      | table_no | number_of_seats | Menu_Item   | SubTotal  | Tax      | Gratuity   |Total    |
#      | T9       |1                | Halwa       |$ 10.00    | $ 1.00   | $ 0.80     |$ 11.80  |


  Scenario Outline: Check Payment through side CC and customer & Merchant copy enabled without tips
    And I click new check button on the Table layout screen
    And I select table as "<table_no>"
    And I select the number of seats as "<number_of_seats>"
    And I tap Continue to finish selecting the number of seats
    And I get check number
    And I select category as "FOOD"
    And I select menu item as "<Menu_Item>"
    And I select modifier as "<Modifier>"
    And I click Done to get back
    And I click Payment button in the Order Management Screen
    And I click side cc button in the payment window
    Then I should see total screen
    And I click the Continue button on the Total screen
    Then I should see the Payment window
    And I click Submit button on the Payment Window
    Then I should get back to the Table Layout tab
    #Void check Side CC payment without tips
    And I click Check Stats tab
    And I click Closed tab on the Check stats
    And I click the Closed check on check stats
    And I click reopen check button on the check stats screen
    Then I Should get back to the Order Screen
    And I click Payment button in the Order Management Screen
    And I click payment in the payment window
    And I click Delete button on the payment window
#    And I click Ok button in receipt printer popup
    Then I should see transaction void successful popup
    And I click Done button on the Popup
    And I click Exit to return to Order Management Screen
    And I click print button on the order screen
    And I click Done button on the Popup
    And I click Void button on order management screen
    Then I should see the void reason popup
    And I click void Reason on the void popup
    And I click Add Button on the void reason popup
#    Then I should see Receipt Printer popup
#    And I click Done button on the Popup
    Then I should get back to the Table Layout tab
    And I click power button
    Examples:
      | table_no | number_of_seats |  Menu_Item     | Modifier |
      | T15      |1                |  French Friese | Steak    |


  Scenario Outline: Check Payment through Side CC and customer & Merchant copy enabled tips
    And I click new check button on the Table layout screen
    And I select table as "<table_no>"
    And I select the number of seats as "<number_of_seats>"
    And I tap Continue to finish selecting the number of seats
    And I get check number
    And I select category as "FOOD"
    And I select menu item as "<Menu_Item>"
    And I select modifier as "<Modifier>"
    And I click Done to get back
    And I click Payment button in the Order Management Screen
    And I click side cc button in the payment window
    Then I should see total screen
    And I click tip as 10
    Then I should see tip is added with menu total as "<Total>"
    Then I should see total amount as "<total>" on total screen
    And I click the Continue button on the Total screen
    Then I should see the Payment window
    And I click Submit button on the Payment Window
    Then I should get back to the Table Layout tab
    # Void check side CC payment with tips
    And I click Check Stats tab
    And I click Closed tab on the Check stats
    And I click the Closed check on check stats
    And I click reopen check button on the check stats screen
    Then I Should get back to the Order Screen
    And I click Payment button in the Order Management Screen
    And I click payment in the payment window
    And I click Delete button on the payment window
#    And I click Ok button in receipt printer popup
    Then I should see transaction void successful popup
    And I click Done button on the Popup
    And I click Exit to return to Order Management Screen
    And I click print button on the order screen
    And I click Done button on the Popup
    And I click Void button on order management screen
    Then I should see the void reason popup
    And I click void Reason on the void popup
    And I click Add Button on the void reason popup
#    Then I should see Receipt Printer popup
#    And I click Done button on the Popup
    Then I should get back to the Table Layout tab
    And I click power button
    Examples:
      | table_no | number_of_seats |  Menu_Item     | Modifier |Total     |total   |
      | T16      |1                |  French Friese | Steak    |  $ 15.00 |$ 25.00 |


  Scenario Outline: Verify the check in Batch/Tip Adjustment for Check Payment through Side CC enabled with tips
    #Verify the check in Batch/Tip Adjustment for Check Payment through Side CC enabled with tips
      #Verify merchant copy bill printout of side CC payment with sign
    And I click new check button on the Table layout screen
    And I select table as "<table_no>"
    And I select the number of seats as "<number_of_seats>"
    And I tap Continue to finish selecting the number of seats
    And I select category as "FOOD"
    And I select menu item as "<Menu_Item>"
    And I select modifier as "<Modifier>"
    And I click Done to get back
    And I click Payment button in the Order Management Screen
    And I click side cc button in the payment window
    Then I should see total screen
    And I click custom for tip adjustment
    Then I should see tip is added with menu total as "<Total>"
    Then I should see total amount as "<total>" on total screen
    And I click the Continue button on the Total screen
    Then I should see the Payment window
    And I click Submit button on the Payment Window
    Then I should get back to the Table Layout tab
    And I click power button
    Examples:
      | table_no | number_of_seats |  Menu_Item    | Modifier |  Total    | total     |
      | T17      |1                | French Friese | Steak    |  $ 15.00  |  $ 25.00  |


  Scenario Outline:  Check Payment through Side CC with discount(item based - After tax/Before) as percentage and with tip
    And I click new check button on the Table layout screen
    And I select table as "<table_no>"
    And I select the number of seats as "<number_of_seats>"
    And I tap Continue to finish selecting the number of seats
    And I select Pasta as category
    And I select menu item as "<Menu_Item>"
    And I select modifier as "<Modifier>"
    And I click Done to get back
    And I select Discount on the Order screen
    Then I should see Check Based Discount Screen
    And I click Discount as "<Discount>"
    And I click Back button on Discount Screen
    And I select Discount on the Order screen
    Then I should see Check Based Discount Screen
    And I click Discount as "<Discount1>"
    And I click Back button on Discount Screen
    Then I should see orderscreen with menu item prize as "<SubTotal>"
    Then I should see the tax amount reflected to the check as "<Tax>"
    Then I should see the Discount amount reflected to the check as "<Discount2>"
    Then I should see orderscreen with menu item Total as "<Total>"
    And I click Payment button in the Order Management Screen
    And I click side cc button in the payment window
    Then I should see total screen
    And I click custom for tip adjustment
    Then I should see tip is added with menu total as "<Total>"
    Then I should see total amount as "<total>" on total screen
    And I click the Continue button on the Total screen
    Then I should see the Payment window
    And I click Submit button on the Payment Window
    Then I should get back to the Table Layout tab
    #Check Payment through side CC with discount(item based - After tax/Before) as amount and with tip
    And I click new check button on the Table layout screen
    And I select table as "<table_no>"
    And I select the number of seats as "<number_of_seats>"
    And I tap Continue to finish selecting the number of seats
    And I select Pasta as category
    And I select menu item as "<Menu_Item>"
    And I select modifier as "<Modifier>"
    And I click Done to get back
    And I select Discount on the Order screen
    Then I should see Check Based Discount Screen
    And I click Discount as "<Discount3>"
    And I click Back button on Discount Screen
    And I select Discount on the Order screen
    Then I should see Check Based Discount Screen
    And I click Discount as "<Discount4>"
    And I click Back button on Discount Screen
    Then I should see orderscreen with menu item prize as "<SubTotal3>"
    Then I should see the tax amount reflected to the check as "<Tax3>"
    Then I should see the Discount amount reflected to the check as "<txtDiscount3>"
    Then I should see orderscreen with menu item Total as "<Total3>"
    And I click Payment button in the Order Management Screen
    And I click side cc button in the payment window
    Then I should see total screen
    And I click custom for tip adjustment
    Then I should see tip is added with menu total as "<Total3>"
    Then I should see total amount as "<total3>" on total screen
    And I click the Continue button on the Total screen
    Then I should see the Payment window
    And I click Submit button on the Payment Window
    Then I should get back to the Table Layout tab
    And I click power button
    Examples:
      | table_no | number_of_seats |Menu_Item   | Modifier |Discount                |  Discount1            |Discount2  | SubTotal    | Tax       | Total       |   total     |    Discount3           |Discount4          |txtDiscount3 | SubTotal3    | Tax3       | Total3         |  total3      |
      | T12      |1                | Ravioli    | Butter   | IB-AfterTax-Percentage |IB-BeforeTax-Percentage|$ 2.66     | $ 14.00     | $ 1.13    | $ 12.47     | $ 22.47     | IB-AfterTax-Amount     |IB-BeforeTax-Amount|$ 2.00       | $ 14.00      | $ 1.20     | $ 13.20        |  $ 23.20     |


  Scenario Outline: Check Payment through side CC with discount(item based - After tax/Before) as set price and with tip
    And I click new check button on the Table layout screen
    And I select table as "<table_no>"
    And I select the number of seats as "<number_of_seats>"
    And I tap Continue to finish selecting the number of seats
    And I select Pasta as category
    And I select menu item as "<Menu_Item>"
    And I select modifier as "<Modifier>"
    And I click Done to get back
    And I select Discount on the Order screen
    Then I should see Check Based Discount Screen
    And I click Discount as "<Discount>"
    And I click Back button on Discount Screen
    And I select Discount on the Order screen
    Then I should see Check Based Discount Screen
    And I click Discount as "<Discount1>"
    And I click Back button on Discount Screen
    Then I should see orderscreen with menu item prize as "<SubTotal>"
    Then I should see the tax amount reflected to the check as "<Tax>"
    Then I should see the Discount amount reflected to the check as "<Discount2>"
    Then I should see orderscreen with menu item Total as "<Total>"
    And I click Payment button in the Order Management Screen
    And I click side cc button in the payment window
    Then I should see total screen
    And I click custom for tip adjustment
    Then I should see tip is added with menu total as "<Total>"
    Then I should see total amount as "<total>" on total screen
    And I click the Continue button on the Total screen
    Then I should see the Payment window
    And I click Submit button on the Payment Window
    Then I should get back to the Table Layout tab
    #Check Payment through side CC with discount(item based - After tax/Before) as Free item and with tip
    And I click new check button on the Table layout screen
    And I select table as "<table_no>"
    And I select the number of seats as "<number_of_seats>"
    And I tap Continue to finish selecting the number of seats
    And I select Pasta as category
    And I select menu item as "<Menu_Item>"
    And I select modifier as "<Modifier>"
    And I click Done to get back
    And I select Discount on the Order screen
    Then I should see Check Based Discount Screen
    And I click Discount as "<Discount3>"
    And I click Back button on Discount Screen
    And I select Discount on the Order screen
    Then I should see Check Based Discount Screen
    And I click Discount as "<Discount4>"
    And I click Back button on Discount Screen
    Then I should see orderscreen with as Onion Rings EACH
    Then I should see orderscreen with menu item prize as "<SubTotal3>"
    Then I should see the tax amount reflected to the check as "<Tax3>"
    Then I should see orderscreen with menu item Total without Discount or Tax as "<Total3>"
    And I click Payment button in the Order Management Screen
    And I click side cc button in the payment window
    Then I should see total screen
    And I click custom for tip adjustment
    Then I should see tip is added with menu total as "<Total3>"
    Then I should see total amount as "<total3>" on total screen
    And I click the Continue button on the Total screen
    Then I should see the Payment window
    And I click Submit button on the Payment Window
    Then I should get back to the Table Layout tab
    And I click power button
    Examples:
      | table_no | number_of_seats|Menu_Item | Modifier |     Discount            |  Discount1               |Discount2    | SubTotal    | Tax       | Total      |  total     |   Discount3               |Discount4              | SubTotal3    | Tax3       | Total3    | total3     |
      | T14       |1              | Ravioli  | Butter   | IB-AfterTax-SetPrice500 |IB-BeforeTax-SetPrice500  |$ 13.00      | $ 14.00     | $ 0.10    | $ 1.10     |  $ 11.10   |   IB-AfterTax-AsFreeItem |IB-BeforeTax-AsFreeItem | $ 16.00      | $ 1.60     | $ 17.60   |  $ 27.60   |


  Scenario Outline: Check Payment through side CC with discount(Check based - After tax/Before) as percentage and with tip
    And I click new check button on the Table layout screen
    And I select table as "<table_no>"
    And I select the number of seats as "<number_of_seats>"
    And I tap Continue to finish selecting the number of seats
    And I select Pasta as category
    And I select menu item as "<Menu_Item>"
    And I select modifier as "<Modifier>"
    And I click Done to get back
    And I select Pasta as category
    And I select menu item as "<Menu_Item>"
    And I select modifier as "<Modifier>"
    And I click Done to get back
    And I select Discount on the Order screen
    Then I should see Check Based Discount Screen
    And I click Discount as "<Discount>"
    And I click Back button on Discount Screen
    And I select Discount on the Order screen
    Then I should see Check Based Discount Screen
    And I click Discount as "<Discount1>"
    And I click Back button on Discount Screen
    Then I should see orderscreen with menu item prize as "<SubTotal>"
    Then I should see the tax amount reflected to the check as "<Tax>"
    Then I should see the Discount amount reflected to the check as "<Discount2>"
    Then I should see orderscreen with menu item Total as "<Total>"
    And I click Payment button in the Order Management Screen
    And I click side cc button in the payment window
    Then I should see total screen
    And I click custom for tip adjustment
    Then I should see tip is added with menu total as "<Total>"
    Then I should see total amount as "<total>" on total screen
    And I click the Continue button on the Total screen
    Then I should see the Payment window
    And I click Submit button on the Payment Window
    Then I should get back to the Table Layout tab
    #Check Payment through side CC with discount(Check based - After tax/Before) as amount and with tip
    And I click new check button on the Table layout screen
    And I select table as "<table_no>"
    And I select the number of seats as "<number_of_seats>"
    And I tap Continue to finish selecting the number of seats
    And I select Pasta as category
    And I select menu item as "<Menu_Item>"
    And I select modifier as "<Modifier>"
    And I click Done to get back
    And I select menu item as "<Menu_Item>"
    And I select modifier as "<Modifier>"
    And I click Done to get back
    And I select Discount on the Order screen
    Then I should see Check Based Discount Screen
    And I click Discount as "<Discount3>"
    And I click Back button on Discount Screen
    And I select Discount on the Order screen
    Then I should see Check Based Discount Screen
    And I click Discount as "<Discount4>"
    And I click Back button on Discount Screen
    Then I should see orderscreen with menu item prize as "<SubTotal3>"
    Then I should see the tax amount reflected to the check as "<Tax3>"
    Then I should see the Discount amount reflected to the check as "<txtDiscount3>"
    Then I should see orderscreen with menu item Total as "<Total3>"
    And I click Payment button in the Order Management Screen
    And I click side cc button in the payment window
    Then I should see total screen
    And I click custom for tip adjustment
    Then I should see tip is added with menu total as "<Total3>"
    Then I should see total amount as "<total3>" on total screen
    And I click the Continue button on the Total screen
    Then I should see the Payment window
    And I click Submit button on the Payment Window
    Then I should get back to the Table Layout tab
    And I click power button
    Examples:
      | table_no | number_of_seats | Menu_Item | Modifier |Discount                 |Discount1                 | SubTotal    | Tax       | Discount2  |Total        | total      |     Discount3              |Discount4               | SubTotal3    | Tax3       | txtDiscount3   | Total3     | total3    |
      | T12      | 1               |  Ravioli  | Butter   |CB-AfterTax-Percentage10 |CB-BeforeTax-Percentage10 | $ 28.00     | $ 2.27    | $ 5.32     | $ 24.95     |  $ 34.95   |     CB-AfterTax-Amount1000 |CB-BeforeTax-Amount1000 | $ 28.00      | $ 2.60     | $ 2.00         | $ 28.60    | $ 38.60   |


  Scenario Outline: Check Payment through side CC with discount(Check based - After tax/Before) as set price and with tip
    And I click new check button on the Table layout screen
    And I select table as "<table_no>"
    And I select the number of seats as "<number_of_seats>"
    And I tap Continue to finish selecting the number of seats
    And I select Menu as category
    And I select menu item as "<Menu_Item>"
    And I select menu item as "<Menu_Item>"
    And I select Discount on the Order screen
    Then I should see Check Based Discount Screen
    And I click Discount as "<Discount>"
    And I click Back button on Discount Screen
    And I select Discount on the Order screen
    Then I should see Check Based Discount Screen
    And I click Discount as "<Discount1>"
    And I click Back button on Discount Screen
    Then I should see orderscreen with menu item prize as "<SubTotal>"
    Then I should see the tax amount reflected to the check as "<Tax>"
    Then I should see the Discount amount reflected to the check as "<Discount2>"
    Then I should see orderscreen with menu item Total as "<Total>"
    And I click Payment button in the Order Management Screen
    And I click side cc button in the payment window
    Then I should see total screen
    And I click custom for tip adjustment
    Then I should see tip is added with menu total as "<Total>"
    Then I should see total amount as "<total>" on total screen
    And I click the Continue button on the Total screen
    Then I should see the Payment window
    And I click Submit button on the Payment Window
    Then I should get back to the Table Layout tab
    #Check Payment through side CC with discount(Check based - After tax/Before) as Free item and with tip
    And I click new check button on the Table layout screen
    And I select table as "<table_no>"
    And I select the number of seats as "<number_of_seats>"
    And I tap Continue to finish selecting the number of seats
    And I select Desserts as category
    And I select menu item as "<Menu_Item1>"
    And I select Discount on the Order screen
    Then I should see Check Based Discount Screen
    And I click Discount as "<Discount3>"
    And I click Back button on Discount Screen
    And I select Discount on the Order screen
    Then I should see Check Based Discount Screen
    And I click Discount as "<Discount4>"
    And I click Back button on Discount Screen
    Then I should see orderscreen with as Onion Rings EACH
    Then I should see orderscreen with menu item prize as "<SubTotal3>"
    Then I should see the tax amount reflected to the check as "<Tax3>"
    Then I should see orderscreen with menu item Total without Discount or Tax as "<Total3>"
    And I click Payment button in the Order Management Screen
    And I click side cc button in the payment window
    Then I should see total screen
    And I click custom for tip adjustment
    Then I should see tip is added with menu total as "<Total3>"
    Then I should see total amount as "<total3>" on total screen
    And I click the Continue button on the Total screen
    Then I should see the Payment window
    And I click Submit button on the Payment Window
    Then I should get back to the Table Layout tab
    And I click power button
    Examples:
      | table_no | number_of_seats | Menu_Item |Discount                |Discount1                 | SubTotal    | Tax       | Discount2 |Total     | total       |  Menu_Item1      |Discount3           |Discount4             | SubTotal3  | Tax3      | Total3    |  total3    |
      | T12      | 1               |  cake     |CB-AfterTaxSetPrice2500 |CB-BeforeTax-SetPrice1000 | $ 16.00     | $ 1.00    | $ 6.00    | $ 11.00  | $ 21.00     |    Cheesecake    | CB-AfterTax-Free300| CB-BeforeTax-Free300 | $ 17.00    | $ 1.70    | $ 18.70   | $ 28.70    |


#  Scenario Outline: Check Payment through Side CC with discount(Open Check - After tax/Before) as percentage and with tip
#    And I click new check button on the Table layout screen
#    And I select table as "<table_no>"
#    And I select the number of seats as "<number_of_seats>"
#    And I tap Continue to finish selecting the number of seats
#    And I select Menu as category
#    And I select menu item as "<Menu_Item>"
#    And I change the Quantity of menu Item as "7"
#    And I click Options button
#    Then I should see the Check Options screen
#    And I click discount on check option screen
#    And I select open check discount
#    Then I should see Open discount Screen
#    And I pass the amount on open discount for open check discount percentage as 20 for "<Discount1>"
#    Then I should see orderscreen with open check discount
#    Then I should see orderscreen with menu item prize as "<SubTotal>"
#    Then I should see the tax amount reflected to the check as "<Tax>"
#    Then I should see the Discount amount reflected to the check as "<Discount>"
#    Then I should see orderscreen with menu item Total as "<Total>"
#    And I click Payment button in the Order Management Screen
#    And I click side cc button in the payment window
#    Then I should see total screen
#    And I click custom for tip adjustment
#    Then I should see tip is added with menu total as "<Total>"
#    Then I should see total amount as "<total>" on total screen
#    And I click the Continue button on the Total screen
#    Then I should see the Payment window
#    And I click Submit button on the Payment Window
#    Then I should get back to the Table Layout tab
#    #Check Payment through side CC with discount(Open check - After tax/Before) as amount & safety limit as decimal value and with tip
#    And I click new check button on the Table layout screen
#    And I select table as "<table_no>"
#    And I select the number of seats as "<number_of_seats>"
#    And I tap Continue to finish selecting the number of seats
#    And I select Menu as category
#    And I select menu item as "<Menu_Item>"
#    And I change the Quantity of menu Item as "7"
#    And I click Options button
#    Then I should see the Check Options screen
#    And I click discount on check option screen
#    And I select open check discount
#    Then I should see Open discount Screen
#    And I pass the amount on open discount for open check discount safety limit percentage decimal precision as 20.50 for "<Discount2>"
#    Then I should see orderscreen with open check discount
#    Then I should see orderscreen with menu item prize as "<SubTotal2>"
#    Then I should see the tax amount reflected to the check as "<Tax2>"
#    Then I should see the Discount amount reflected to the check as "<txtDiscount2>"
#    Then I should see orderscreen with menu item Total as "<Total2>"
#    And I click Payment button in the Order Management Screen
#    And I click side cc button in the payment window
#    Then I should see total screen
#    And I click custom for tip adjustment
#    Then I should see tip is added with menu total as "<Total2>"
#    Then I should see total amount as "<total2>" on total screen
#    And I click the Continue button on the Total screen
#    Then I should see the Payment window
#    And I click Submit button on the Payment Window
#    Then I should get back to the Table Layout tab
#    #Check Payment through side CC with discount(Open check - After tax/Before) as amount & safety limit as non-decimal value and with tip
#    And I click new check button on the Table layout screen
#    And I select table as "<table_no>"
#    And I select the number of seats as "<number_of_seats>"
#    And I tap Continue to finish selecting the number of seats
#    And I select Menu as category
#    And I select menu item as "<Menu_Item>"
#    And I change the Quantity of menu Item as "7"
#    And I click Options button
#    Then I should see the Check Options screen
#    And I click discount on check option screen
#    And I select open check discount
#    Then I should see Open discount Screen
#    And I pass the amount on open discount for open check discount safety percentage whole value as 20 for "<Discount3>"
#    Then I should see orderscreen with open check discount
#    Then I should see orderscreen with menu item prize as "<SubTotal3>"
#    Then I should see the tax amount reflected to the check as "<Tax3>"
#    Then I should see the Discount amount reflected to the check as "<txtDiscount3>"
#    Then I should see orderscreen with menu item Total as "<Total3>"
#    And I click Payment button in the Order Management Screen
#    And I click side cc button in the payment window
#    Then I should see total screen
#    And I click custom for tip adjustment
#    Then I should see tip is added with menu total as "<Total3>"
#    Then I should see total amount as "<total3>" on total screen
#    And I click the Continue button on the Total screen
#    Then I should see the Payment window
#    And I click Submit button on the Payment Window
#    Then I should get back to the Table Layout tab
#    And I click power button
#    Examples:
#      |table_no| number_of_seats |Menu_Item|  SubTotal   | Tax         | Discount   | Total     | Discount1 |  total     | SubTotal2  | Tax2     | txtDiscount2  | Total2    | Discount2   |   total2  |     SubTotal3  | Tax3         | txtDiscount3  | Total3    | Discount3  | total3   |
#      | T15     |1               |Halwa    | $ 70.00     | $ 7.00      | $ 14.00    | $ 63.00   | After     |  $ 73.00   |  $ 70.00   | $ 7.00   | $ 20.50       | $ 56.50   | After       | $ 66.50   |     $ 70.00    | $ 7.00       | $ 20.00       | $ 57.00   | After      | $ 67.00  |
#

  Scenario Outline: Check Payment through Side CC with discount(Mix&Match - After/before tax) as set price and with tip
    And I click new check button on the Table layout screen
    And I select table as "<table_no>"
    And I select the number of seats as "<number_of_seats>"
    And I tap Continue to finish selecting the number of seats
    And I select Menu as category
    And I select menu item as "<Menu_Item>"
    And I select menu item as "<Menu_Item>"
    And I select Discount on the Order screen
    Then I should see Check Based Discount Screen
    And I click Discount as "<Discount1>"
    And I click Back button on Discount Screen
    And I select Discount on the Order screen
    Then I should see Check Based Discount Screen
    And I click Discount as "<Discount2>"
    And I click Back button on Discount Screen
    Then I should see orderscreen with menu item prize as "<SubTotal>"
    Then I should see the tax amount reflected to the check as "<Tax>"
    Then I should see the Discount amount reflected to the check as "<Discount>"
    Then I should see orderscreen with menu item Total as "<Total>"
    And I click Payment button in the Order Management Screen
    And I click side cc button in the payment window
    Then I should see total screen
    And I click custom for tip adjustment
    Then I should see tip is added with menu total as "<Total>"
    Then I should see total amount as "<total>" on total screen
    And I click the Continue button on the Total screen
    Then I should see the Payment window
    And I click Submit button on the Payment Window
    Then I should get back to the Table Layout tab
    #Check Payment through side CC with discount(Mix&Match - After/before tax) as set each item price and with tip
    And I click new check button on the Table layout screen
    And I select table as "<table_no>"
    And I select the number of seats as "<number_of_seats>"
    And I tap Continue to finish selecting the number of seats
    And I select Menu as category
    And I select menu item as "<Menu_Item>"
    And I select menu item as "<Menu_Item>"
    And I select Discount on the Order screen
    Then I should see Check Based Discount Screen
    And I click Discount as "<Discount3>"
    And I click Back button on Discount Screen
    And I select Discount on the Order screen
    Then I should see Check Based Discount Screen
    And I click Discount as "<Discount4>"
    And I click Back button on Discount Screen
    Then I should see orderscreen with menu item prize as "<SubTotal3>"
    Then I should see the tax amount reflected to the check as "<Tax3>"
    Then I should see the Discount amount reflected to the check as "<txtDiscount3>"
    Then I should see orderscreen with menu item Total as "<Total3>"
    And I click Payment button in the Order Management Screen
    And I click side cc button in the payment window
    Then I should see total screen
    And I click custom for tip adjustment
    Then I should see tip is added with menu total as "<Total3>"
    Then I should see total amount as "<total3>" on total screen
    And I click the Continue button on the Total screen
    Then I should see the Payment window
    And I click Submit button on the Payment Window
    Then I should get back to the Table Layout tab
    And I click power button
    Examples:
      |table_no| number_of_seats |Menu_Item|  SubTotal   | Tax      | Discount  | Total  | Discount1              |Discount2              | total    |  SubTotal3  | Tax3    | txtDiscount3 | Total3    | Discount3                |Discount4                 |  total3    |
      | T15     |1               |  Halwa  |   $ 20.00   | $ 1.00   | $ 18.00   | $ 3.00 | CheckMixMatchSP(After) |CheckMixMatchSP(Before)| $ 12.20  |    $ 20.00  | $ 1.40  | $ 6.00       | $ 15.40   | CheckMixMatchSEIP(After) |CheckMixMatchSEIP(Before) |$ 25.40     |

  Scenario Outline: Check Payment through side CC with discount(Mix&Match - After/before tax) as set price(Most Expensive) and with tip
    And I click new check button on the Table layout screen
    And I select table as "<table_no>"
    And I select the number of seats as "<number_of_seats>"
    And I tap Continue to finish selecting the number of seats
    And I select Menu as category
    And I select menu item as "<Menu_Item>"
    And I select menu item as "<Menu_Item1>"
    And I select Discount on the Order screen
    Then I should see Check Based Discount Screen
    And I click Discount as "<Discount1>"
    And I click Back button on Discount Screen
    And I select Discount on the Order screen
    Then I should see Check Based Discount Screen
    And I click Discount as "<Discount2>"
    And I click Back button on Discount Screen
    And I compare menu price as "<price>" "<price1>" and applied "<Discount1>" on "<expensive>" menu Item
    And I compare menu price as "<price>" "<price1>" and applied "<Discount2>" on "<expensive>" menu Item
    Then I should see orderscreen with menu item prize as "<SubTotal>"
    Then I should see the tax amount reflected to the check as "<Tax>"
    Then I should see the Discount amount reflected to the check as "<Discount>"
    Then I should see orderscreen with menu item Total as "<Total>"
    And I click Payment button in the Order Management Screen
    And I click side cc button in the payment window
    Then I should see total screen
    And I click custom for tip adjustment
    Then I should see tip is added with menu total as "<Total>"
    Then I should see total amount as "<total>" on total screen
    And I click the Continue button on the Total screen
    Then I should see the Payment window
    And I click Submit button on the Payment Window
    Then I should get back to the Table Layout tab

#  Scenario Outline: Check Payment through side CC with discount(Mix&Match - After/before tax) as set price(Least Expensive) and with tip
    And I click new check button on the Table layout screen
    And I select table as "<table_no>"
    And I select the number of seats as "<number_of_seats>"
    And I tap Continue to finish selecting the number of seats
    And I select Desserts as category
    And I select menu item as "<Menu_Item2>"
    And I select menu item as "<Menu_Item3>"
    And I select Discount on the Order screen
    Then I should see Check Based Discount Screen
    And I click Discount as "<Discount3>"
    And I click Back button on Discount Screen
    And I select Discount on the Order screen
    Then I should see Check Based Discount Screen
    And I click Discount as "<Discount4>"
    And I click Back button on Discount Screen
    And I compare menu price as "<price2>" "<price3>" and applied "<Discount3>" on "<expensive1>" menu Item
    And I compare menu price as "<price2>" "<price3>" and applied "<Discount4>" on "<expensive1>" menu Item
    Then I should see orderscreen with menu item prize as "<SubTotal3>"
    Then I should see the tax amount reflected to the check as "<Tax3>"
    Then I should see the Discount amount reflected to the check as "<txtDiscount3>"
    Then I should see orderscreen with menu item Total as "<Total3>"
    And I click Payment button in the Order Management Screen
    And I click side cc button in the payment window
    Then I should see total screen
    And I click custom for tip adjustment
    Then I should see tip is added with menu total as "<Total3>"
    Then I should see total amount as "<total3>" on total screen
    And I click the Continue button on the Total screen
    Then I should see the Payment window
    And I click Submit button on the Payment Window
    Then I should get back to the Table Layout tab
    And I click power button
    Examples:
      |table_no| number_of_seats |Menu_Item|Menu_Item1 |price    |price1  |  SubTotal | Tax    | Discount  | Total  | Discount1                 |Discount2                 | total   | expensive|  Menu_Item2   |Menu_Item3         | price2   |price3   | SubTotal3    | Tax3    | txtDiscount3 | Total3  | Discount3                 | Discount4                  |  total3      | expensive1 |
      | T15     |1               |  Halwa  |cake       | 10.00   |8.00    |  $ 18.00  | $ 0.80 | $ 10.00   | $ 8.80 | CheckMixMatchSPerM(After) | CheckMixMatchSPerM(Befor)|$ 18.80  |Most      |   Cheesecake  |Pumpkin Cheese Cake|15.00     |11.00    |  $ 26.00     | $ 1.50  | $ 11.00      | $ 16.50 | CheckMixMatchSPerL(After) | CheckMixMatchSPerL(Befor)  | $ 26.50      |Least      |


  Scenario Outline: Check Payment through Side CC with Gratuity(Fixed) and with tips
    And I click new check button on the Table layout screen
    And I select table as "<table_no>"
    And I select the number of seats as "<number_of_seats>"
    And I tap Continue to finish selecting the number of seats
    And I select Menu as category
    And I select menu item as "<Menu_Item>"
    And I click Options button
    Then I should see the Check Options screen
    And I click Gratuity button
    Then I should see Add Gratuity screen
    And I click Gratuity Fixed button
    Then I Should get back to the Order Screen
    Then I should see orderscreen with menu item prize as "<SubTotal>"
    Then I should see the tax amount reflected to the check as "<Tax>"
    Then I should see the Gratuity amount reflected to the check as "<Gratuity>"
    Then I should see orderscreen with menu item Total as "<Total>"
    And I click Payment button in the Order Management Screen
    And I click side cc button in the payment window
    Then I should see total screen
    And I click custom for tip adjustment
    Then I should see tip is added with menu total as "<Total>"
    Then I should see total amount as "<total>" on total screen
    And I click the Continue button on the Total screen
    Then I should see the Payment window
    And I click Submit button on the Payment Window
    Then I should get back to the Table Layout tab
    #Check Payment through side CC with Gratuity(Varying) and with tips
    And I click new check button on the Table layout screen
    And I select table as "<table_no>"
    And I select the number of seats as "<number_of_seats>"
    And I tap Continue to finish selecting the number of seats
    And I select Menu as category
    And I select menu item as "<Menu_Item>"
    And I click Options button
    Then I should see the Check Options screen
    And I click Gratuity button
    Then I should see Add Gratuity screen
    And I click Gratuity varying button
    Then I should see enter Percentage popup
    And I pass the value and click Apply button as "<Percentage>"
    Then I Should get back to the Order Screen
    Then I should see orderscreen with menu item prize as "<SubTotal1>"
    Then I should see the tax amount reflected to the check as "<Tax1>"
    Then I should see the Gratuity amount reflected to the check as "<Gratuity1>"
    Then I should see orderscreen with menu item Total as "<Total1>"
    And I click Payment button in the Order Management Screen
    And I click side cc button in the payment window
    Then I should see total screen
    And I click custom for tip adjustment
    Then I should see tip is added with menu total as "<Total1>"
    Then I should see total amount as "<total1>" on total screen
    And I click the Continue button on the Total screen
    Then I should see the Payment window
    And I click Submit button on the Payment Window
    Then I should get back to the Table Layout tab
    And I click power button
    Examples:
      | table_no | number_of_seats | Menu_Item |  SubTotal   | Tax      | Gratuity | Total     | total    |    Percentage | SubTotal1  |    Tax1   | Gratuity1   | Total1    | total1   |
      | T9         |1              |  Halwa    | $ 10.00     | $ 1.00   |  $ 1.00  | $ 12.00   |$ 22.00   |     8         | $ 10.00    | $ 1.00    |  $ 0.80     | $ 11.80   |$ 21.80   |



#  Scenario Outline: Check Payment through NMI and customer & Merchant copy enabled without tips
#    And I click new check button on the Table layout screen
#    And I select table as "<table_no>"
#    And I select the number of seats as "<number_of_seats>"
#    And I tap Continue to finish selecting the number of seats
#    And I click Add Customer Button
#    And I search for "<customer_name>"
#    When I click "<customer_name>" to select customer for the seat
#    And I get check number
#    And I select category as "FOOD"
#    And I select menu item as "<Menu_Item>"
#    And I select modifier as "<Modifier>"
#    And I click Done to get back
#    And I click Payment button in the Order Management Screen
#    And I click NMI payment button in the payment window
#    Then I should see total screen
#    And I click the Continue button on the Total screen
#    Then I should see choose card window
#    And I select credit card from choose card window
#    And I click pay button in choose card window
##    And I click Ok button in receipt printer popup
#    Then I should get back to the Table Layout tab
#    # Void check NMI payment without tips
#    And I click Check Stats tab
#    And I click Closed tab on the Check stats
#    And I click the Closed check on check stats
#    And I click reopen check button on the check stats screen
#    Then I Should get back to the Order Screen
#    And I click Payment button in the Order Management Screen
#    And I click payment in the payment window
#    And I click Delete button on the payment window
##    And I click Ok button in receipt printer popup
#    Then I should see transaction void successful popup
#    And I click Done button on the Popup
#    And I click Exit to return to Order Management Screen
#    And I click print button on the order screen
#    And I click Done button on the Popup
#    And I click Void button on order management screen
#    Then I should see the void reason popup
#    And I click void Reason on the void popup
#    And I click Add Button on the void reason popup
##    Then I should see Receipt Printer popup
##    And I click Done button on the Popup
#    Then I should get back to the Table Layout tab
#    And I click power button
#    Examples:
#      | table_no | number_of_seats |  Menu_Item     | Modifier | customer_name |
#      | T15      |1                |  French Friese | Steak    | auto test     |
#
#
#  @nmi
#  Scenario Outline: Check Payment through NMI and customer & Merchant copy enabled tips
#    And I click new check button on the Table layout screen
#    And I select table as "<table_no>"
#    And I select the number of seats as "<number_of_seats>"
#    And I tap Continue to finish selecting the number of seats
#    And I click Add Customer Button
#    And I search for "<customer_name>"
#    When I click "<customer_name>" to select customer for the seat
#    And I get check number
#    And I select category as "FOOD"
#    And I select menu item as "<Menu_Item>"
#    And I select modifier as "<Modifier>"
#    And I click Done to get back
#    And I click Payment button in the Order Management Screen
#    And I click NMI payment button in the payment window
#    Then I should see total screen
#    And I click tip as 10
#    Then I should see tip is added with menu total as "<Total>"
#    Then I should see total amount as "<total>" on total screen
#    And I click the Continue button on the Total screen
#    Then I should see choose card window
#    And I select credit card from choose card window
#    And I click pay button in choose card window
##    And I click Ok button in receipt printer popup
#    Then I should get back to the Table Layout tab
#    #Void check NMI payment with tips
#    And I click Check Stats tab
#    And I click Closed tab on the Check stats
#    And I click the Closed check on check stats
#    And I click reopen check button on the check stats screen
#    Then I Should get back to the Order Screen
#    And I click Payment button in the Order Management Screen
#    And I click payment in the payment window
#    And I click Delete button on the payment window
##    And I click Ok button in receipt printer popup
#    Then I should see transaction void successful popup
#    And I click Done button on the Popup
#    And I click Exit to return to Order Management Screen
#    And I click print button on the order screen
#    And I click Done button on the Popup
#    And I click Void button on order management screen
#    Then I should see the void reason popup
#    And I click void Reason on the void popup
#    And I click Add Button on the void reason popup
##    Then I should see Receipt Printer popup
##    And I click Done button on the Popup
#    Then I should get back to the Table Layout tab
#    And I click power button
#    Examples:
#      | table_no | number_of_seats |  Menu_Item     | Modifier |Total    |total   | customer_name |
#      | T16      |1                |  French Friese | Steak    | $ 15.00 |$ 25.00 | auto test     |
#
#
#  @nmi
#  Scenario Outline: Verify the check in Batch/Tip Adjustment for Check Payment through NMI enabled with tips
#    #Verify merchant copy bill printout of NMI payment with sign
#    And I click new check button on the Table layout screen
#    And I select table as "<table_no>"
#    And I select the number of seats as "<number_of_seats>"
#    And I tap Continue to finish selecting the number of seats
#    And I click Add Customer Button
#    And I search for "<customer_name>"
#    When I click "<customer_name>" to select customer for the seat
#    And I select category as "FOOD"
#    And I select menu item as "<Menu_Item>"
#    And I select modifier as "<Modifier>"
#    And I click Done to get back
#    And I click Payment button in the Order Management Screen
#    And I click NMI payment button in the payment window
#    Then I should see total screen
#    And I click custom for tip adjustment
#    Then I should see tip is added with menu total as "<Total>"
#    Then I should see total amount as "<total>" on total screen
#    And I click the Continue button on the Total screen
#    Then I should see choose card window
#    And I select credit card from choose card window
#    And I click pay button in choose card window
##    And I click Ok button in receipt printer popup
#    Then I should get back to the Table Layout tab
#    And I click power button
#    Examples:
#      | table_no | number_of_seats |  Menu_Item    | Modifier |  Total    | total     | customer_name |
#      | T17      |1                | French Friese | Steak    |  $ 15.00  |  $ 25.00  | auto test     |
#
#
#  @nmi
#  Scenario Outline: Check Payment through NMI with discount(item based - After tax/Before) as percentage and with tip
#    And I click new check button on the Table layout screen
#    And I select table as "<table_no>"
#    And I select the number of seats as "<number_of_seats>"
#    And I tap Continue to finish selecting the number of seats
#    And I click Add Customer Button
#    And I search for "<customer_name>"
#    When I click "<customer_name>" to select customer for the seat
#    And I select Pasta as category
#    And I select menu item as "<Menu_Item>"
#    And I select modifier as "<Modifier>"
#    And I click Done to get back
#    And I select Discount on the Order screen
#    Then I should see Check Based Discount Screen
#    And I click Discount as "<Discount>"
#    And I click Back button on Discount Screen
#    And I select Discount on the Order screen
#    Then I should see Check Based Discount Screen
#    And I click Discount as "<Discount1>"
#    And I click Back button on Discount Screen
#    Then I should see orderscreen with menu item prize as "<SubTotal>"
#    Then I should see the tax amount reflected to the check as "<Tax>"
#    Then I should see the Discount amount reflected to the check as "<Discount2>"
#    Then I should see orderscreen with menu item Total as "<Total>"
#    And I click Payment button in the Order Management Screen
#    And I click NMI payment button in the payment window
#    Then I should see total screen
#    And I click custom for tip adjustment
#    Then I should see tip is added with menu total as "<Total>"
#    Then I should see total amount as "<total>" on total screen
#    And I click the Continue button on the Total screen
#    Then I should see choose card window
#    And I select credit card from choose card window
#    And I click pay button in choose card window
##    And I click Ok button in receipt printer popup
#    Then I should get back to the Table Layout tab
#    #Check Payment through NMI with discount(item based - After tax/Before) as amount and with tip
#    And I click new check button on the Table layout screen
#    And I select table as "<table_no>"
#    And I select the number of seats as "<number_of_seats>"
#    And I tap Continue to finish selecting the number of seats
#    And I click Add Customer Button
#    And I search for "<customer_name>"
#    When I click "<customer_name>" to select customer for the seat
#    And I select Pasta as category
#    And I select menu item as "<Menu_Item>"
#    And I select modifier as "<Modifier>"
#    And I click Done to get back
#    And I select Discount on the Order screen
#    Then I should see Check Based Discount Screen
#    And I click Discount as "<Discount3>"
#    And I click Back button on Discount Screen
#    And I select Discount on the Order screen
#    Then I should see Check Based Discount Screen
#    And I click Discount as "<Discount4>"
#    And I click Back button on Discount Screen
#    Then I should see orderscreen with menu item prize as "<SubTotal3>"
#    Then I should see the tax amount reflected to the check as "<Tax3>"
#    Then I should see the Discount amount reflected to the check as "<txtDiscount3>"
#    Then I should see orderscreen with menu item Total as "<Total3>"
#    And I click Payment button in the Order Management Screen
#    And I click NMI payment button in the payment window
#    Then I should see total screen
#    And I click custom for tip adjustment
#    Then I should see tip is added with menu total as "<Total3>"
#    Then I should see total amount as "<total3>" on total screen
#    And I click the Continue button on the Total screen
#    Then I should see choose card window
#    And I select credit card from choose card window
#    And I click pay button in choose card window
##    And I click Ok button in receipt printer popup
#    Then I should get back to the Table Layout tab
#    And I click power button
#    Examples:
#      | table_no | number_of_seats |Menu_Item   | Modifier |Discount                |  Discount1            |Discount2  | SubTotal    | Tax       | Total       |   total     | customer_name |        Discount3            |Discount4          |txtDiscount3 | SubTotal3    | Tax3       | Total3        |  total3       |
#      | T12      |1                | Ravioli    | Butter   | IB-AfterTax-Percentage |IB-BeforeTax-Percentage|$ 2.66     | $ 14.00     | $ 1.13    | $ 12.47     | $ 22.47    | auto test     |        IB-AfterTax-Amount   |IB-BeforeTax-Amount|$ 2.00       | $ 14.00      | $ 1.20     | $ 13.20       |  $ 23.20      |
#
#
#  @nmi
#  Scenario Outline: Check Payment through NMI with discount(item based - After tax/Before) as set price and with tip
#    And I click new check button on the Table layout screen
#    And I select table as "<table_no>"
#    And I select the number of seats as "<number_of_seats>"
#    And I tap Continue to finish selecting the number of seats
#    And I click Add Customer Button
#    And I search for "<customer_name>"
#    When I click "<customer_name>" to select customer for the seat
#    And I select Pasta as category
#    And I select menu item as "<Menu_Item>"
#    And I select modifier as "<Modifier>"
#    And I click Done to get back
#    And I select Discount on the Order screen
#    Then I should see Check Based Discount Screen
#    And I click Discount as "<Discount>"
#    And I click Back button on Discount Screen
#    And I select Discount on the Order screen
#    Then I should see Check Based Discount Screen
#    And I click Discount as "<Discount1>"
#    And I click Back button on Discount Screen
#    Then I should see orderscreen with menu item prize as "<SubTotal>"
#    Then I should see the tax amount reflected to the check as "<Tax>"
#    Then I should see the Discount amount reflected to the check as "<Discount2>"
#    Then I should see orderscreen with menu item Total as "<Total>"
#    And I click Payment button in the Order Management Screen
#    And I click NMI payment button in the payment window
#    Then I should see total screen
#    And I click custom for tip adjustment
#    Then I should see tip is added with menu total as "<Total>"
#    Then I should see total amount as "<total>" on total screen
#    And I click the Continue button on the Total screen
#    Then I should see choose card window
#    And I select credit card from choose card window
#    And I click pay button in choose card window
##    And I click Ok button in receipt printer popup
#    Then I should get back to the Table Layout tab
#    #Check Payment through NMI with discount(item based - After tax/Before) as Free item and with tip
#    And I click new check button on the Table layout screen
#    And I select table as "<table_no>"
#    And I select the number of seats as "<number_of_seats>"
#    And I tap Continue to finish selecting the number of seats
#    And I click Add Customer Button
#    And I search for "<customer_name>"
#    When I click "<customer_name>" to select customer for the seat
#    And I select Pasta as category
#    And I select menu item as "<Menu_Item>"
#    And I select modifier as "<Modifier>"
#    And I click Done to get back
#    And I select Discount on the Order screen
#    Then I should see Check Based Discount Screen
#    And I click Discount as "<Discount3>"
#    And I click Back button on Discount Screen
#    And I select Discount on the Order screen
#    Then I should see Check Based Discount Screen
#    And I click Discount as "<Discount4>"
#    And I click Back button on Discount Screen
#    Then I should see orderscreen with as Onion Rings EACH
#    Then I should see orderscreen with menu item prize as "<SubTotal3>"
#    Then I should see the tax amount reflected to the check as "<Tax3>"
#    Then I should see orderscreen with menu item Total without Discount or Tax as "<Total3>"
#    And I click Payment button in the Order Management Screen
#    And I click NMI payment button in the payment window
#    Then I should see total screen
#    And I click custom for tip adjustment
#    Then I should see tip is added with menu total as "<Total3>"
#    Then I should see total amount as "<total3>" on total screen
#    And I click the Continue button on the Total screen
#    Then I should see choose card window
#    And I select credit card from choose card window
#    And I click pay button in choose card window
##    And I click Ok button in receipt printer popup
#    Then I should get back to the Table Layout tab
#    And I click power button
#    Examples:
#      | table_no | number_of_seats|Menu_Item | Modifier |     Discount            |  Discount1               |Discount2    | SubTotal    | Tax       | Total      |  total     | customer_name |        Discount3                |Discount4              | SubTotal3    | Tax3      | Total3     | total3     |
#      | T14       |1              | Ravioli  | Butter   | IB-AfterTax-SetPrice500 |IB-BeforeTax-SetPrice500  |$ 13.00      | $ 14.00     | $ 0.10    | $ 1.10     |  $ 11.10   | auto test     |        IB-AfterTax-AsFreeItem   |IB-BeforeTax-AsFreeItem| $ 16.00      | $ 1.60    | $ 17.60    |  $ 27.60   |
#
#
#  @nmi
#  Scenario Outline: Check Payment through NMI with discount(Check based - After tax/Before) as percentage and with tip
#    And I click new check button on the Table layout screen
#    And I select table as "<table_no>"
#    And I select the number of seats as "<number_of_seats>"
#    And I tap Continue to finish selecting the number of seats
#    And I click Add Customer Button
#    And I search for "<customer_name>"
#    When I click "<customer_name>" to select customer for the seat
#    And I select Pasta as category
#    And I select menu item as "<Menu_Item>"
#    And I select modifier as "<Modifier>"
#    And I click Done to get back
#    And I select Pasta as category
#    And I select menu item as "<Menu_Item>"
#    And I select modifier as "<Modifier>"
#    And I click Done to get back
#    And I select Discount on the Order screen
#    Then I should see Check Based Discount Screen
#    And I click Discount as "<Discount>"
#    And I click Back button on Discount Screen
#    And I select Discount on the Order screen
#    Then I should see Check Based Discount Screen
#    And I click Discount as "<Discount1>"
#    And I click Back button on Discount Screen
#    Then I should see orderscreen with menu item prize as "<SubTotal>"
#    Then I should see the tax amount reflected to the check as "<Tax>"
#    Then I should see the Discount amount reflected to the check as "<Discount2>"
#    Then I should see orderscreen with menu item Total as "<Total>"
#    And I click Payment button in the Order Management Screen
#    And I click NMI payment button in the payment window
#    Then I should see total screen
#    And I click custom for tip adjustment
#    Then I should see tip is added with menu total as "<Total>"
#    Then I should see total amount as "<total>" on total screen
#    And I click the Continue button on the Total screen
#    Then I should see choose card window
#    And I select credit card from choose card window
#    And I click pay button in choose card window
##    And I click Ok button in receipt printer popup
#    Then I should get back to the Table Layout tab
#    #Check Payment through NMI with discount(Check based - After tax/Before) as amount and with tip
#    And I click new check button on the Table layout screen
#    And I select table as "<table_no>"
#    And I select the number of seats as "<number_of_seats>"
#    And I tap Continue to finish selecting the number of seats
#    And I click Add Customer Button
#    And I search for "<customer_name>"
#    When I click "<customer_name>" to select customer for the seat
#    And I select Pasta as category
#    And I select menu item as "<Menu_Item>"
#    And I select modifier as "<Modifier>"
#    And I click Done to get back
#    And I select menu item as "<Menu_Item>"
#    And I select modifier as "<Modifier>"
#    And I click Done to get back
#    And I select Discount on the Order screen
#    Then I should see Check Based Discount Screen
#    And I click Discount as "<Discount3>"
#    And I click Back button on Discount Screen
#    And I select Discount on the Order screen
#    Then I should see Check Based Discount Screen
#    And I click Discount as "<Discount4>"
#    And I click Back button on Discount Screen
#    Then I should see orderscreen with menu item prize as "<SubTotal3>"
#    Then I should see the tax amount reflected to the check as "<Tax3>"
#    Then I should see the Discount amount reflected to the check as "<txtDiscount3>"
#    Then I should see orderscreen with menu item Total as "<Total3>"
#    And I click Payment button in the Order Management Screen
#    And I click NMI payment button in the payment window
#    Then I should see total screen
#    And I click custom for tip adjustment
#    Then I should see tip is added with menu total as "<Total3>"
#    Then I should see total amount as "<total3>" on total screen
#    And I click the Continue button on the Total screen
#    Then I should see choose card window
#    And I select credit card from choose card window
#    And I click pay button in choose card window
##    And I click Ok button in receipt printer popup
#    Then I should get back to the Table Layout tab
#    And I click power button
#    Examples:
#      | table_no | number_of_seats | Menu_Item | Modifier |Discount                 |Discount1                 | SubTotal    | Tax       | Discount2  |Total        | total        | customer_name |   Discount3               |Discount4               | SubTotal3    | Tax3       | txtDiscount3   | Total3        | total3       |
#      | T12      | 1               |  Ravioli  | Butter   |CB-AfterTax-Percentage10 |CB-BeforeTax-Percentage10 | $ 28.00     | $ 2.27    | $ 5.32     | $ 24.95     |  $ 34.95     | auto test     |   CB-AfterTax-Amount1000  |CB-BeforeTax-Amount1000 | $ 28.00      | $ 2.60     | $ 2.00         | $ 28.60       | $ 38.60      |
#
#
#  @nmi
#  Scenario Outline: Check Payment through NMI with discount(Check based - After tax/Before) as set price and with tip
#    And I click new check button on the Table layout screen
#    And I select table as "<table_no>"
#    And I select the number of seats as "<number_of_seats>"
#    And I tap Continue to finish selecting the number of seats
#    And I click Add Customer Button
#    And I search for "<customer_name>"
#    When I click "<customer_name>" to select customer for the seat
#    And I select Menu as category
#    And I select menu item as "<Menu_Item>"
#    And I select menu item as "<Menu_Item>"
#    And I select Discount on the Order screen
#    Then I should see Check Based Discount Screen
#    And I click Discount as "<Discount>"
#    And I click Back button on Discount Screen
#    And I select Discount on the Order screen
#    Then I should see Check Based Discount Screen
#    And I click Discount as "<Discount1>"
#    And I click Back button on Discount Screen
#    Then I should see orderscreen with menu item prize as "<SubTotal>"
#    Then I should see the tax amount reflected to the check as "<Tax>"
#    Then I should see the Discount amount reflected to the check as "<Discount2>"
#    Then I should see orderscreen with menu item Total as "<Total>"
#    And I click Payment button in the Order Management Screen
#    And I click NMI payment button in the payment window
#    Then I should see total screen
#    And I click custom for tip adjustment
#    Then I should see tip is added with menu total as "<Total>"
#    Then I should see total amount as "<total>" on total screen
#    And I click the Continue button on the Total screen
#    Then I should see choose card window
#    And I select credit card from choose card window
#    And I click pay button in choose card window
##    And I click Ok button in receipt printer popup
#    Then I should get back to the Table Layout tab
#    # Check Payment through NMI with discount(Check based - After tax/Before) as Free item and with tip
#    And I click new check button on the Table layout screen
#    And I select table as "<table_no>"
#    And I select the number of seats as "<number_of_seats>"
#    And I tap Continue to finish selecting the number of seats
#    And I click Add Customer Button
#    And I search for "<customer_name>"
#    When I click "<customer_name>" to select customer for the seat
#    And I select Desserts as category
#    And I select menu item as "<Menu_Item1>"
#    And I select Discount on the Order screen
#    Then I should see Check Based Discount Screen
#    And I click Discount as "<Discount3>"
#    And I click Back button on Discount Screen
#    And I select Discount on the Order screen
#    Then I should see Check Based Discount Screen
#    And I click Discount as "<Discount4>"
#    And I click Back button on Discount Screen
#    Then I should see orderscreen with as Onion Rings EACH
#    Then I should see orderscreen with menu item prize as "<SubTotal3>"
#    Then I should see the tax amount reflected to the check as "<Tax3>"
#    Then I should see orderscreen with menu item Total without Discount or Tax as "<Total3>"
#    And I click Payment button in the Order Management Screen
#    And I click NMI payment button in the payment window
#    Then I should see total screen
#    And I click custom for tip adjustment
#    Then I should see tip is added with menu total as "<Total3>"
#    Then I should see total amount as "<total3>" on total screen
#    And I click the Continue button on the Total screen
#    Then I should see choose card window
#    And I select credit card from choose card window
#    And I click pay button in choose card window
##    And I click Ok button in receipt printer popup
#    Then I should get back to the Table Layout tab
#    And I click power button
#    Examples:
#      | table_no | number_of_seats | Menu_Item |Discount                 |Discount1                 | SubTotal    | Tax       | Discount2 |Total      | total     | customer_name |      Menu_Item1     |Discount3            |Discount4             | SubTotal3  | Tax3      | Total3      |  total3    |
#      | T12      | 1               |  cake     |CB-AfterTaxSetPrice2500  |CB-BeforeTax-SetPrice1000 | $ 16.00     | $ 1.00    | $ 6.00    | $ 11.00   | $ 21.00   | auto test     |      Cheesecake     | CB-AfterTax-Free300 | CB-BeforeTax-Free300 | $ 17.00    | $ 1.70    | $ 18.70     | $ 28.70    |
#
#
#  @nmi
#  Scenario Outline: Check Payment through NMI with discount(Open Check - After tax/Before) as percentage and with tip
#    And I click new check button on the Table layout screen
#    And I select table as "<table_no>"
#    And I select the number of seats as "<number_of_seats>"
#    And I tap Continue to finish selecting the number of seats
#    And I click Add Customer Button
#    And I search for "<customer_name>"
#    When I click "<customer_name>" to select customer for the seat
#    And I select Menu as category
#    And I select menu item as "<Menu_Item>"
#    And I change the Quantity of menu Item as "7"
#    And I click Options button
#    Then I should see the Check Options screen
#    And I click discount on check option screen
#    And I select open check discount
#    Then I should see Open discount Screen
#    And I pass the amount on open discount for open check discount percentage as 20 for "<Discount1>"
#    Then I should see orderscreen with open check discount
#    Then I should see orderscreen with menu item prize as "<SubTotal>"
#    Then I should see the tax amount reflected to the check as "<Tax>"
#    Then I should see the Discount amount reflected to the check as "<Discount>"
#    Then I should see orderscreen with menu item Total as "<Total>"
#    And I click Payment button in the Order Management Screen
#    And I click NMI payment button in the payment window
#    Then I should see total screen
#    And I click custom for tip adjustment
#    Then I should see tip is added with menu total as "<Total>"
#    Then I should see total amount as "<total>" on total screen
#    And I click the Continue button on the Total screen
#    Then I should see choose card window
#    And I select credit card from choose card window
#    And I click pay button in choose card window
##    And I click Ok button in receipt printer popup
#    Then I should get back to the Table Layout tab
#    #Check Payment through NMI with discount(Open check - After tax/Before) as amount & safety limit as decimal value and with tip
#    And I click new check button on the Table layout screen
#    And I select table as "<table_no>"
#    And I select the number of seats as "<number_of_seats>"
#    And I tap Continue to finish selecting the number of seats
#    And I click Add Customer Button
#    And I search for "<customer_name>"
#    When I click "<customer_name>" to select customer for the seat
#    And I select Menu as category
#    And I select menu item as "<Menu_Item>"
#    And I change the Quantity of menu Item as "7"
#    And I click Options button
#    Then I should see the Check Options screen
#    And I click discount on check option screen
#    And I select open check discount
#    Then I should see Open discount Screen
#    And I pass the amount on open discount for open check discount safety limit percentage decimal precision as 20.50 for "<Discount4>"
#    Then I should see orderscreen with open check discount
#    Then I should see orderscreen with menu item prize as "<SubTotal3>"
#    Then I should see the tax amount reflected to the check as "<Tax3>"
#    Then I should see the Discount amount reflected to the check as "<txtDiscount3>"
#    Then I should see orderscreen with menu item Total as "<Total3>"
#    And I click Payment button in the Order Management Screen
#    And I click NMI payment button in the payment window
#    Then I should see total screen
#    And I click custom for tip adjustment
#    Then I should see tip is added with menu total as "<Total3>"
#    Then I should see total amount as "<total3>" on total screen
#    And I click the Continue button on the Total screen
#    Then I should see choose card window
#    And I select credit card from choose card window
#    And I click pay button in choose card window
##    And I click Ok button in receipt printer popup
#    Then I should get back to the Table Layout tab
#    #Check Payment through NMI with discount(Open check - After tax/Before) as amount & safety limit as non-decimal value and with tip
#    And I click new check button on the Table layout screen
#    And I select table as "<table_no>"
#    And I select the number of seats as "<number_of_seats>"
#    And I tap Continue to finish selecting the number of seats
#    And I click Add Customer Button
#    And I search for "<customer_name>"
#    When I click "<customer_name>" to select customer for the seat
#    And I select Menu as category
#    And I select menu item as "<Menu_Item>"
#    And I change the Quantity of menu Item as "7"
#    And I click Options button
#    Then I should see the Check Options screen
#    And I click discount on check option screen
#    And I select open check discount
#    Then I should see Open discount Screen
#    And I pass the amount on open discount for open check discount safety percentage whole value as 20 for "<Discount6>"
#    Then I should see orderscreen with open check discount
#    Then I should see orderscreen with menu item prize as "<SubTotal5>"
#    Then I should see the tax amount reflected to the check as "<Tax5>"
#    Then I should see the Discount amount reflected to the check as "<txtDiscount5>"
#    Then I should see orderscreen with menu item Total as "<Total5>"
#    And I click Payment button in the Order Management Screen
#    And I click NMI payment button in the payment window
#    Then I should see total screen
#    And I click custom for tip adjustment
#    Then I should see tip is added with menu total as "<Total5>"
#    Then I should see total amount as "<total5>" on total screen
#    And I click the Continue button on the Total screen
#    Then I should see choose card window
#    And I select credit card from choose card window
#    And I click pay button in choose card window
##    And I click Ok button in receipt printer popup
#    Then I should get back to the Table Layout tab
#    And I click power button
#    Examples:
#      |table_no| number_of_seats |Menu_Item|  SubTotal   | Tax         | Discount   | Total     | Discount1 | total     | customer_name | SubTotal3   | Tax3       | txtDiscount3  | Total3    | Discount4 | total3     |SubTotal5   | Tax5     | txtDiscount5  | Total5   | Discount6  | total5    |
#      | T15     |1               |Halwa    | $ 70.00     | $ 7.00      | $ 14.00    | $ 63.00   | After     | $ 73.00   | auto test     | $ 70.00     | $ 7.00     | $ 20.50       | $ 56.50   | After     | $ 66.50    | $ 70.00    | $ 7.00   | $ 20.00       | $ 57.00  | After      | $ 67.00   |
#

#  @nmi
#  Scenario Outline: Check Payment through NMI with discount(Mix&Match - After/before tax) as set price and with tip
#    And I click new check button on the Table layout screen
#    And I select table as "<table_no>"
#    And I select the number of seats as "<number_of_seats>"
#    And I tap Continue to finish selecting the number of seats
#    And I click Add Customer Button
#    And I search for "<customer_name>"
#    When I click "<customer_name>" to select customer for the seat
#    And I select Menu as category
#    And I select menu item as "<Menu_Item>"
#    And I select menu item as "<Menu_Item>"
#    And I select Discount on the Order screen
#    Then I should see Check Based Discount Screen
#    And I click Discount as "<Discount1>"
#    And I click Back button on Discount Screen
#    And I select Discount on the Order screen
#    Then I should see Check Based Discount Screen
#    And I click Discount as "<Discount2>"
#    And I click Back button on Discount Screen
#    Then I should see orderscreen with menu item prize as "<SubTotal>"
#    Then I should see the tax amount reflected to the check as "<Tax>"
#    Then I should see the Discount amount reflected to the check as "<Discount>"
#    Then I should see orderscreen with menu item Total as "<Total>"
#    And I click Payment button in the Order Management Screen
#    And I click NMI payment button in the payment window
#    Then I should see total screen
#    And I click custom for tip adjustment
#    Then I should see tip is added with menu total as "<Total>"
#    Then I should see total amount as "<total>" on total screen
#    And I click the Continue button on the Total screen
#    Then I should see choose card window
#    And I select credit card from choose card window
#    And I click pay button in choose card window
##    And I click Ok button in receipt printer popup
#    Then I should get back to the Table Layout tab
#    #Check Payment through NMI with discount(Mix&Match - After/before tax) as set each item price and with tip
#    And I click new check button on the Table layout screen
#    And I select table as "<table_no>"
#    And I select the number of seats as "<number_of_seats>"
#    And I tap Continue to finish selecting the number of seats
#    And I click Add Customer Button
#    And I search for "<customer_name>"
#    When I click "<customer_name>" to select customer for the seat
#    And I select Menu as category
#    And I select menu item as "<Menu_Item>"
#    And I select menu item as "<Menu_Item>"
#    And I select Discount on the Order screen
#    Then I should see Check Based Discount Screen
#    And I click Discount as "<Discount3>"
#    And I click Back button on Discount Screen
#    And I select Discount on the Order screen
#    Then I should see Check Based Discount Screen
#    And I click Discount as "<Discount4>"
#    And I click Back button on Discount Screen
#    Then I should see orderscreen with menu item prize as "<SubTotal3>"
#    Then I should see the tax amount reflected to the check as "<Tax3>"
#    Then I should see the Discount amount reflected to the check as "<txtDiscount3>"
#    Then I should see orderscreen with menu item Total as "<Total3>"
#    And I click Payment button in the Order Management Screen
#    And I click NMI payment button in the payment window
#    Then I should see total screen
#    And I click custom for tip adjustment
#    Then I should see tip is added with menu total as "<Total3>"
#    Then I should see total amount as "<total3>" on total screen
#    And I click the Continue button on the Total screen
#    Then I should see choose card window
#    And I select credit card from choose card window
#    And I click pay button in choose card window
##    And I click Ok button in receipt printer popup
#    Then I should get back to the Table Layout tab
#    And I click Table Layout tab
#    And I click power button
#    Examples:
#      |table_no| number_of_seats |Menu_Item|  SubTotal     | Tax       | Discount     | Total     | Discount1              |Discount2              | total      | customer_name | SubTotal3     | Tax3       | txtDiscount3  | Total3       | Discount3                |Discount4                 | total3      |
#      | T15     |1               |  Halwa  |  $ 20.00      | $ 0.20    | $ 18.00      | $ 2.20    | CheckMixMatchSP(After) |CheckMixMatchSP(Before)| $ 12.20    | auto test     |   $ 20.00     | $ 1.40     | $ 6.00        | $ 15.40      | CheckMixMatchSEIP(After) |CheckMixMatchSEIP(Before) |$ 25.40      |
#
#
#  @nmi
#  Scenario Outline: Check Payment through NMI with discount(Mix&Match - After/before tax) as set price(Most Expensive) and with tip
#    And I click new check button on the Table layout screen
#    And I select table as "<table_no>"
#    And I select the number of seats as "<number_of_seats>"
#    And I tap Continue to finish selecting the number of seats
#    And I click Add Customer Button
#    And I search for "<customer_name>"
#    When I click "<customer_name>" to select customer for the seat
#    And I select Menu as category
#    And I select menu item as "<Menu_Item>"
#    And I select menu item as "<Menu_Item1>"
#    And I select Discount on the Order screen
#    Then I should see Check Based Discount Screen
#    And I click Discount as "<Discount1>"
#    And I click Back button on Discount Screen
#    And I select Discount on the Order screen
#    Then I should see Check Based Discount Screen
#    And I click Discount as "<Discount2>"
#    And I click Back button on Discount Screen
#    And I compare menu price as "<price>" "<price1>" and applied "<Discount1>" on "<expensive>" menu Item
#    And I compare menu price as "<price>" "<price1>" and applied "<Discount2>" on "<expensive>" menu Item
#    Then I should see orderscreen with menu item prize as "<SubTotal>"
#    Then I should see the tax amount reflected to the check as "<Tax>"
#    Then I should see the Discount amount reflected to the check as "<Discount>"
#    Then I should see orderscreen with menu item Total as "<Total>"
#    And I click Payment button in the Order Management Screen
#    And I click NMI payment button in the payment window
#    Then I should see total screen
#    And I click custom for tip adjustment
#    Then I should see tip is added with menu total as "<Total>"
#    Then I should see total amount as "<total>" on total screen
#    And I click the Continue button on the Total screen
#    Then I should see choose card window
#    And I select credit card from choose card window
#    And I click pay button in choose card window
##    And I click Ok button in receipt printer popup
#    Then I should get back to the Table Layout tab
#    #Check Payment through NMI with discount(Mix&Match - After/before tax) as set price(Least Expensive) and with tip
#    And I click new check button on the Table layout screen
#    And I select table as "<table_no>"
#    And I select the number of seats as "<number_of_seats>"
#    And I tap Continue to finish selecting the number of seats
#    And I click Add Customer Button
#    And I search for "<customer_name>"
#    When I click "<customer_name>" to select customer for the seat
#    And I select Desserts as category
#    And I select menu item as "<Menu_Item2>"
#    And I select menu item as "<Menu_Item3>"
#    And I select Discount on the Order screen
#    Then I should see Check Based Discount Screen
#    And I click Discount as "<Discount3>"
#    And I click Back button on Discount Screen
#    And I select Discount on the Order screen
#    Then I should see Check Based Discount Screen
#    And I click Discount as "<Discount4>"
#    And I click Back button on Discount Screen
#    And I compare menu price as "<price2>" "<price3>" and applied "<Discount3>" on "<expensive>" menu Item
#    And I compare menu price as "<price2>" "<price3>" and applied "<Discount4>" on "<expensive>" menu Item
#    Then I should see orderscreen with menu item prize as "<SubTotal3>"
#    Then I should see the tax amount reflected to the check as "<Tax3>"
#    Then I should see the Discount amount reflected to the check as "<txtDiscount3>"
#    Then I should see orderscreen with menu item Total as "<Total3>"
#    And I click Payment button in the Order Management Screen
#    And I click NMI payment button in the payment window
#    Then I should see total screen
#    And I click custom for tip adjustment
#    Then I should see tip is added with menu total as "<Total3>"
#    Then I should see total amount as "<total3>" on total screen
#    And I click the Continue button on the Total screen
#    Then I should see choose card window
#    And I select credit card from choose card window
#    And I click pay button in choose card window
##    And I click Ok button in receipt printer popup
#    Then I should get back to the Table Layout tab
#    And I click power button
#    Examples:
#      |table_no| number_of_seats |Menu_Item|Menu_Item1 |price    |price1  |  SubTotal   | Tax       | Discount   | Total     | Discount1                 |Discount2                 | total    | expensive| customer_name |       Menu_Item2   |Menu_Item3         | price2   |price3   | SubTotal3 | Tax3   | txtDiscount3 | Total3   | Discount3                 | Discount4                   |  total3     | expensive |
#      | T15     |1               |  Halwa  |cake       | 10.00   |8.00    |  $ 18.00    | $ 0.80    | $ 10.00    | $ 8.80   | CheckMixMatchSPerM(After)  | CheckMixMatchSPerM(Befor)|$ 18.80   |Most      | auto test     |       Cheesecake   |Pumpkin Cheese Cake|15.00     |11.00    |  $ 26.00  | $ 1.50 | $ 11.00      | $ 16.50  | CheckMixMatchSPerL(After) | CheckMixMatchSPerL(Befor)   | $ 26.50     |Least      |
#
#
#  @nmi
#  Scenario Outline: Check Payment through NMI with Gratuity(Fixed) and with tips
#    And I click new check button on the Table layout screen
#    And I select table as "<table_no>"
#    And I select the number of seats as "<number_of_seats>"
#    And I tap Continue to finish selecting the number of seats
#    And I click Add Customer Button
#    And I search for "<customer_name>"
#    When I click "<customer_name>" to select customer for the seat
#    And I select Menu as category
#    And I select menu item as "<Menu_Item>"
#    And I click Options button
#    Then I should see the Check Options screen
#    And I click Gratuity button
#    Then I should see Add Gratuity screen
#    And I click Gratuity Fixed button
#    Then I Should get back to the Order Screen
#    Then I should see orderscreen with menu item prize as "<SubTotal>"
#    Then I should see the tax amount reflected to the check as "<Tax>"
#    Then I should see the Gratuity amount reflected to the check as "<Gratuity>"
#    Then I should see orderscreen with menu item Total as "<Total>"
#    And I click Payment button in the Order Management Screen
#    And I click NMI payment button in the payment window
#    Then I should see total screen
#    And I click custom for tip adjustment
#    Then I should see tip is added with menu total as "<Total>"
#    Then I should see total amount as "<total>" on total screen
#    And I click the Continue button on the Total screen
#    Then I should see choose card window
#    And I select credit card from choose card window
#    And I click pay button in choose card window
##    And I click Ok button in receipt printer popup
#    Then I should get back to the Table Layout tab
#    #Check Payment through NMI with Gratuity(Varying) and with tips
#    And I click new check button on the Table layout screen
#    And I select table as "<table_no>"
#    And I select the number of seats as "<number_of_seats>"
#    And I tap Continue to finish selecting the number of seats
#    And I click Add Customer Button
#    And I search for "<customer_name>"
#    When I click "<customer_name>" to select customer for the seat
#    And I select Menu as category
#    And I select menu item as "<Menu_Item>"
#    And I click Options button
#    Then I should see the Check Options screen
#    And I click Gratuity button
#    Then I should see Add Gratuity screen
#    And I click Gratuity varying button
#    Then I should see enter Percentage popup
#    And I pass the value and click Apply button as "<Percentage>"
#    Then I Should get back to the Order Screen
#    Then I should see orderscreen with menu item prize as "<SubTotal1>"
#    Then I should see the tax amount reflected to the check as "<Tax1>"
#    Then I should see the Gratuity amount reflected to the check as "<Gratuity1>"
#    Then I should see orderscreen with menu item Total as "<Total1>"
#    And I click Payment button in the Order Management Screen
#    And I click NMI payment button in the payment window
#    Then I should see total screen
#    And I click custom for tip adjustment
#    Then I should see tip is added with menu total as "<Total1>"
#    Then I should see total amount as "<total1>" on total screen
#    And I click the Continue button on the Total screen
#    Then I should see choose card window
#    And I select credit card from choose card window
#    And I click pay button in choose card window
##    And I click Ok button in receipt printer popup
#    Then I should get back to the Table Layout tab
#    And I click power button
#    Examples:
#      | table_no | number_of_seats | Menu_Item |  SubTotal   | Tax    | Gratuity  | Total    | total   | customer_name |     Percentage | SubTotal1  |    Tax1  | Gratuity1  | Total1    | total1  |
#      | T9         |1              |  Halwa    | $ 10.00     | $ 1.00 | $ 1.00    | $ 12.00  |$ 22.00  | auto test     |       8        | $ 10.00    | $ 1.00   | $ 0.80     | $ 11.80   |$ 21.80  |

#  @nmi
#  Scenario Outline: Check Payment through CC with tax Exempt(Not select customer) and also with tip
#    And I click new check button on the Table layout screen
#    And I select table as "<table_no>"
#    And I select the number of seats as "<number_of_seats>"
#    And I tap Continue to finish selecting the number of seats
#    And I select Menu as category
#    And I select menu item as "<Menu_Item>"
#    Then I should see orderscreen with menu item prize as "<SubTotal>"
#    Then I should see the tax amount reflected to the check as "<Tax>"
#    Then I should see orderscreen with menu item Total without Discount or Tax as "<Total>"
#    And I click Options button
#    Then I should see the Check Options screen
#    And I click Tax Exempt Button
##    Then I should see tax exempt reasons
##    When I select School as reason
#    Then I Should get back to the Order Screen
#    Then I should see orderscreen with menu item prize as "<SubTotal>"
#    And I should see the tax reflected to the check
#    Then I should see orderscreen with menu item Total without Tax Exempt as "<Total1>"
#    And I click Payment button in the Order Management Screen
#    And I click credit card payment on payment window
#    Then I should see total screen
#    And I click custom for tip adjustment
#    Then I should see tip is added with menu total as "<Total1>"
#    Then I should see total amount as "<total>" on total screen
#    And I click the Continue button on the Total screen
#    Then I should see your order card screen
#    Then I should see tip added on order screen
#    And I click manual button on the your order screen
#    And I pass the card number as "<card_number>"
#    And I pass card name as "<card_name>"
#    And I pass expire date as "<expire_date>"
#    And I click Process button on card screen
##    And I click Ok button in receipt printer popup
#    Then I should get back to the Table Layout tab
#    # Check Payment through CC with tax Exempt(select customer) and also with tip
#    And I click new check button on the Table layout screen
#    And I select table as "<table_no>"
#    And I select the number of seats as "<number_of_seats>"
#    And I tap Continue to finish selecting the number of seats
#    And I click Add Customer Button
#    And I search for "<customer_name>"
#    When I click "<customer_name>" to select customer for the seat
#    And I select Menu as category
#    And I select menu item as "<Menu_Item>"
#    Then I should see orderscreen with menu item prize as "<SubTotal>"
#    Then I should see the tax amount reflected to the check as "<Tax>"
#    Then I should see orderscreen with menu item Total without Discount or Tax as "<Total>"
#    And I click Options button
#    Then I should see the Check Options screen
#    And I click Tax Exempt Button
##    Then I should see tax exempt reasons
##    When I select School as reason
#    Then I Should get back to the Order Screen
#    Then I should see orderscreen with menu item prize as "<SubTotal>"
#    And I should see the tax reflected to the check
#    Then I should see orderscreen with menu item Total without Tax Exempt as "<Total1>"
#    And I click Payment button in the Order Management Screen
#    And I click credit card payment on payment window
#    Then I should see total screen
#    And I click custom for tip adjustment
#    Then I should see tip is added with menu total as "<Total1>"
#    Then I should see total amount as "<total>" on total screen
#    And I click the Continue button on the Total screen
#    Then I should see your order card screen
#    Then I should see tip added on order screen
#    And I click manual button on the your order screen
#    And I pass the card number as "<card_number>"
#    And I pass card name as "<card_name>"
#    And I pass expire date as "<expire_date>"
#    And I click Process button on card screen
##    And I click Ok button in receipt printer popup
#    Then I should get back to the Table Layout tab
#    #Check Payment through CC with tax Exempt(Not select customer) in payment screen and also with tip
#    And I click new check button on the Table layout screen
#    And I select table as "<table_no>"
#    And I select the number of seats as "<number_of_seats>"
#    And I tap Continue to finish selecting the number of seats
#    And I select Menu as category
#    And I select menu item as "<Menu_Item>"
#    Then I should see orderscreen with menu item prize as "<SubTotal>"
#    Then I should see the tax amount reflected to the check as "<Tax>"
##    Then I should see orderscreen with menu item Total as "<Total>"
#    Then I should see orderscreen with menu item Total without Discount or Tax as "<Total>"
#    And I click Payment button in the Order Management Screen
#    And I click Tax Exempt Button from the Payment Screen
##    Then I should see tax exempt reasons
##    When I select School as reason
#    Then I Should get back to the Order Screen
#    Then I should see orderscreen with menu item prize as "<SubTotal>"
#    And I should see the tax reflected to the check
#    Then I should see orderscreen with menu item Total without Tax Exempt as "<Total1>"
#    And I click Payment button in the Order Management Screen
#    And I click credit card payment on payment window
#    Then I should see total screen
#    And I click custom for tip adjustment
#    Then I should see tip is added with menu total as "<Total1>"
#    Then I should see total amount as "<total>" on total screen
#    And I click the Continue button on the Total screen
#    Then I should see your order card screen
#    Then I should see tip added on order screen
#    And I click manual button on the your order screen
#    And I pass the card number as "<card_number>"
#    And I pass card name as "<card_name>"
#    And I pass expire date as "<expire_date>"
#    And I click Process button on card screen
##    And I click Ok button in receipt printer popup
#    Then I should get back to the Table Layout tab
#    #Check Payment through CC with tax Exempt(predefined customer) and also with tip
#    And I click new check button on the Table layout screen
#    And I select table as "<table_no>"
#    And I select the number of seats as "<number_of_seats>"
#    And I tap Continue to finish selecting the number of seats
#    And I click Add Customer Button
#    And I click Add new button
#    And I select search
#    And I enter an existing customer's name "<customer_name>"
#    And I select the customer for NMI
#    And I select tax exempt on customer profile screen
#    And I click the Save button
#    Then I Should get back to the Order Screen
#    And I select Menu as category
#    And I select menu item as "<Menu_Item>"
#    Then I should see orderscreen with menu item prize as "<SubTotal>"
#    And I should see the tax reflected to the check
#    Then I should see orderscreen with menu item Total without Tax Exempt as "<Total1>"
#    And I click Payment button in the Order Management Screen
#    And I click credit card payment on payment window
#    Then I should see total screen
#    And I click custom for tip adjustment
#    Then I should see tip is added with menu total as "<Total1>"
#    Then I should see total amount as "<total>" on total screen
#    And I click the Continue button on the Total screen
#    Then I should see your order card screen
#    Then I should see tip added on order screen
#    And I click manual button on the your order screen
#    And I pass the card number as "<card_number>"
#    And I pass card name as "<card_name>"
#    And I pass expire date as "<expire_date>"
#    And I click Process button on card screen
##    And I click Ok button in receipt printer popup
#    Then I should get back to the Table Layout tab
#    And I click the Operation button on the Table Layout
#    And I click POS Icon from Toggle
#    And I close the order type window
#    And I click Add Customer Button
#    And I click Add new button
#    And I select search
#    And I enter an existing customer's name "<customer_name>"
#    And I select the customer for NMI
#    And I select tax exempt on customer profile screen
#    And I click the Save button
#    Then I Should get back to the Order Screen
#    And I click All
#    And I click Table Layout tab
#    And I click power button
#    Examples:
#      | table_no | number_of_seats | Menu_Item  |  SubTotal   | Tax       | Total       | Total1    |  card_number     | expire_date | card_name | total      |customer_name|
#      | T10         |1             |Halwa       | $ 10.00     | $ 1.00    | $ 11.00     | $ 10.00   | 3530111333300000 | 1224        | JCB       |$ 20.00     |auto test    |
#
#
#  @nmi
#  Scenario Outline: Check Payment through NMI with tax Exempt(Not select customer) and also with tip
#    And I click new check button on the Table layout screen
#    And I select table as "<table_no>"
#    And I select the number of seats as "<number_of_seats>"
#    And I tap Continue to finish selecting the number of seats
#    And I select Menu as category
#    And I select menu item as "<Menu_Item>"
#    Then I should see orderscreen with menu item prize as "<SubTotal>"
#    Then I should see the tax amount reflected to the check as "<Tax>"
##    Then I should see orderscreen with menu item Total as "<Total>"
#    Then I should see orderscreen with menu item Total without Discount or Tax as "<Total>"
#    And I click Options button
#    Then I should see the Check Options screen
#    And I click Tax Exempt Button
##    Then I should see tax exempt reasons
##    When I select School as reason
#    Then I Should get back to the Order Screen
#    Then I should see orderscreen with menu item prize as "<SubTotal>"
#    And I should see the tax reflected to the check
#    Then I should see orderscreen with menu item Total without Tax Exempt as "<Total1>"
#    And I click Payment button in the Order Management Screen
#    And I click NMI payment button in the payment window
#    Then I should see No NMI sim cards available for walkin
#    And I click Done button on the Popup
#    And I click Exit to return to Order Management Screen
#    And I click Add Customer Button
#    And I search for "<customer_name>"
#    When I click "<customer_name>" to select customer for the seat
#    And I click Payment button in the Order Management Screen
#    And I click NMI payment button in the payment window
#    Then I should see total screen
#    And I click custom for tip adjustment
#    Then I should see tip is added with menu total as "$ 11.00"
#    Then I should see total amount as "$ 21.00" on total screen
#    And I click the Continue button on the Total screen
#    Then I should see choose card window
#    And I select credit card from choose card window
#    And I click pay button in choose card window
##    And I click Ok button in receipt printer popup
#    Then I should get back to the Table Layout tab
#    #Check Payment through NMI with tax Exempt(select customer) and also with tip
#    And I click new check button on the Table layout screen
#    And I select table as "<table_no>"
#    And I select the number of seats as "<number_of_seats>"
#    And I tap Continue to finish selecting the number of seats
#    And I click Add Customer Button
#    And I search for "<customer_name>"
#    When I click "<customer_name>" to select customer for the seat
#    And I select Menu as category
#    And I select menu item as "<Menu_Item>"
#    Then I should see orderscreen with menu item prize as "<SubTotal>"
#    Then I should see the tax amount reflected to the check as "<Tax>"
##    Then I should see orderscreen with menu item Total as "<Total>"
#    Then I should see orderscreen with menu item Total without Discount or Tax as "<Total>"
#    And I click Options button
#    Then I should see the Check Options screen
#    And I click Tax Exempt Button
##    Then I should see tax exempt reasons
##    When I select School as reason
#    Then I Should get back to the Order Screen
#    Then I should see orderscreen with menu item prize as "<SubTotal>"
#    And I should see the tax reflected to the check
#    Then I should see orderscreen with menu item Total without Tax Exempt as "<Total1>"
#    And I click Payment button in the Order Management Screen
#    And I click NMI payment button in the payment window
#    Then I should see total screen
#    And I click custom for tip adjustment
#    Then I should see tip is added with menu total as "<Total1>"
#    Then I should see total amount as "<total1>" on total screen
#    And I click the Continue button on the Total screen
#    Then I should see choose card window
#    And I select credit card from choose card window
#    And I click pay button in choose card window
##    And I click Ok button in receipt printer popup
#    Then I should get back to the Table Layout tab
#    #Check Payment through NMI with tax Exempt(Not select customer) in payment screen and also with tip
#    And I click new check button on the Table layout screen
#    And I select table as "<table_no>"
#    And I select the number of seats as "<number_of_seats>"
#    And I tap Continue to finish selecting the number of seats
#    And I click Add Customer Button
#    And I search for "<customer_name>"
#    When I click "<customer_name>" to select customer for the seat
#    And I select Menu as category
#    And I select menu item as "<Menu_Item>"
#    Then I should see orderscreen with menu item prize as "<SubTotal>"
#    Then I should see the tax amount reflected to the check as "<Tax>"
##    Then I should see orderscreen with menu item Total as "<Total>"
#    Then I should see orderscreen with menu item Total without Discount or Tax as "<Total>"
#    And I click Payment button in the Order Management Screen
#    And I click Tax Exempt Button from the Payment Screen
##    Then I should see tax exempt reasons
##    When I select School as reason
#    Then I Should get back to the Order Screen
#    Then I should see orderscreen with menu item prize as "<SubTotal>"
#    And I should see the tax reflected to the check
#    Then I should see orderscreen with menu item Total without Tax Exempt as "<Total1>"
#    And I click Payment button in the Order Management Screen
#    And I click NMI payment button in the payment window
#    Then I should see total screen
#    And I click custom for tip adjustment
#    Then I should see tip is added with menu total as "<Total1>"
#    Then I should see total amount as "<total1>" on total screen
#    And I click the Continue button on the Total screen
#    Then I should see choose card window
#    And I select credit card from choose card window
#    And I click pay button in choose card window
##    And I click Ok button in receipt printer popup
#    Then I should get back to the Table Layout tab
#    #Check Payment through NMI with tax Exempt(predefined customer) and also with tip
#    And I click new check button on the Table layout screen
#    And I select table as "<table_no>"
#    And I select the number of seats as "<number_of_seats>"
#    And I tap Continue to finish selecting the number of seats
#    And I click Add Customer Button
#    And I click Add new button
#    And I select search
#    And I enter an existing customer's name "<customer_name>"
#    And I select the customer for NMI
#    And I select tax exempt on customer profile screen
#    And I click the Save button
#    Then I Should get back to the Order Screen
#    And I select Menu as category
#    And I select menu item as "<Menu_Item>"
#    Then I should see orderscreen with menu item prize as "<SubTotal>"
#    And I should see the tax reflected to the check
#    Then I should see orderscreen with menu item Total without Tax Exempt as "<Total1>"
#    And I click Payment button in the Order Management Screen
#    And I click NMI payment button in the payment window
#    Then I should see total screen
#    And I click custom for tip adjustment
#    Then I should see tip is added with menu total as "<Total1>"
#    Then I should see total amount as "<total1>" on total screen
#    And I click the Continue button on the Total screen
#    Then I should see choose card window
#    And I select credit card from choose card window
#    And I click pay button in choose card window
##    And I click Ok button in receipt printer popup
#    Then I should get back to the Table Layout tab
#    And I click the Operation button on the Table Layout
#    And I click POS Icon from Toggle
#    And I close the order type window
#    And I click Add Customer Button
#    And I click Add new button
#    And I select search
#    And I enter an existing customer's name "<customer_name>"
#    And I select the customer for NMI
#    And I select tax exempt on customer profile screen
#    And I click the Save button
#    Then I Should get back to the Order Screen
#    And I click All
#    And I click Table Layout tab
#    And I click power button
#    Examples:
#      | table_no | number_of_seats | Menu_Item  |  SubTotal   | Tax       | Total       | Total1   | total      | customer_name |total1 |
#      | T10         |1             |Halwa       | $ 10.00     | $ 1.00    | $ 11.00     | $ 10.00  |$ 21.00     | auto test     |$ 20.00|



  Scenario Outline: Check Payment through side CC with tax Exempt(Not select customer) and also with tip
    And I click new check button on the Table layout screen
    And I select table as "<table_no>"
    And I select the number of seats as "<number_of_seats>"
    And I tap Continue to finish selecting the number of seats
    And I select Menu as category
    And I select menu item as "<Menu_Item>"
    Then I should see orderscreen with menu item prize as "<SubTotal>"
    Then I should see the tax amount reflected to the check as "<Tax>"
#    Then I should see orderscreen with menu item Total as "<Total>"
    Then I should see orderscreen with menu item Total without Discount or Tax as "<Total>"
    And I click Options button
    Then I should see the Check Options screen
    And I click Tax Exempt Button
#    Then I should see tax exempt reasons
#    When I select School as reason
    Then I Should get back to the Order Screen
    Then I should see orderscreen with menu item prize as "<SubTotal>"
    Then I should not see tax on the order screen
    Then I should see orderscreen with menu item Total without Tax Exempt as "<Total1>"
    And I click Payment button in the Order Management Screen
    And I click side cc button in the payment window
    Then I should see total screen
    And I click custom for tip adjustment
    Then I should see tip is added with menu total as "<Total1>"
    Then I should see total amount as "<total>" on total screen
    And I click the Continue button on the Total screen
    Then I should see the Payment window
    And I click Submit button on the Payment Window
    Then I should get back to the Table Layout tab
    # Check Payment through side CC with tax Exempt(select customer) and also with tip
    And I click new check button on the Table layout screen
    And I select table as "<table_no>"
    And I select the number of seats as "<number_of_seats>"
    And I tap Continue to finish selecting the number of seats
    And I click Add Customer Button
    And I search for "<customer_name>"
    When I click "<customer_name>" to select customer for the seat
    And I select Menu as category
    And I select menu item as "<Menu_Item>"
    Then I should see orderscreen with menu item prize as "<SubTotal>"
    Then I should see the tax amount reflected to the check as "<Tax>"
#    Then I should see orderscreen with menu item Total as "<Total>"
    Then I should see orderscreen with menu item Total without Discount or Tax as "<Total>"
    And I click Options button
    Then I should see the Check Options screen
    And I click Tax Exempt Button
#    Then I should see tax exempt reasons
#    When I select School as reason
    Then I Should get back to the Order Screen
    Then I should see orderscreen with menu item prize as "<SubTotal>"
    And I should not see tax on the order screen
    Then I should see orderscreen with menu item Total without Tax Exempt as "<Total1>"
    And I click Payment button in the Order Management Screen
    And I click side cc button in the payment window
    Then I should see total screen
    And I click custom for tip adjustment
    Then I should see tip is added with menu total as "<Total1>"
    Then I should see total amount as "<total>" on total screen
    And I click the Continue button on the Total screen
    Then I should see the Payment window
    And I click Submit button on the Payment Window
    Then I should get back to the Table Layout tab
    #Check Payment through side CC with tax Exempt(Not select customer) in payment screen and also with tip
#    And I click new check button on the Table layout screen
#    And I select table as "<table_no>"
#    And I select the number of seats as "<number_of_seats>"
#    And I tap Continue to finish selecting the number of seats
#    And I select Menu as category
#    And I select menu item as "<Menu_Item>"
#    Then I should see orderscreen with menu item prize as "<SubTotal>"
#    Then I should see the tax amount reflected to the check as "<Tax>"
##    Then I should see orderscreen with menu item Total as "<Total>"
#    Then I should see orderscreen with menu item Total without Discount or Tax as "<Total>"
#    And I click Payment button in the Order Management Screen
#    And I click Tax Exempt Button from the Payment Screen
##    Then I should see tax exempt reasons
##    When I select School as reason
#    Then I Should get back to the Order Screen
#    Then I should see orderscreen with menu item prize as "<SubTotal>"
#    And I should see the tax reflected to the check
#    Then I should see orderscreen with menu item Total without Tax Exempt as "<Total1>"
#    And I click Payment button in the Order Management Screen
#    And I click side cc button in the payment window
#    Then I should see total screen
#    And I click custom for tip adjustment
#    Then I should see tip is added with menu total as "<Total1>"
#    Then I should see total amount as "<total>" on total screen
#    And I click the Continue button on the Total screen
#    Then I should see the Payment window
#    And I click Submit button on the Payment Window
#    Then I should get back to the Table Layout tab
    # Check Payment through side CC with tax Exempt(predefined customer) and also with tip
    And I click new check button on the Table layout screen
    And I select table as "<table_no>"
    And I select the number of seats as "<number_of_seats>"
    And I tap Continue to finish selecting the number of seats
    And I click Add Customer Button
    And I search for "auto test"
    When I click "auto test" to select customer for the seat
    And I click the customer name on the order screen
    Then I should see the customer profile window
    And I select tax exempt on customer profile screen
    And I click the Save button
    Then I Should get back to the Order Screen
#  auto test
    And I select Menu as category
    And I select menu item as "<Menu_Item>"
    Then I should see orderscreen with menu item prize as "<SubTotal>"
    And I should not see tax on the order screen
    Then I should see orderscreen with menu item Total without Tax Exempt as "<Total1>"
    And I click Payment button in the Order Management Screen
    And I click side cc button in the payment window
    Then I should see total screen
    And I click custom for tip adjustment
    Then I should see tip is added with menu total as "<Total1>"
    Then I should see total amount as "<total>" on total screen
    And I click the Continue button on the Total screen
    Then I should see the Payment window
    And I click Submit button on the Payment Window
    Then I should get back to the Table Layout tab
    And I click the Operation button on the Table Layout
    And I click POS Icon from Toggle
    And I close the order type window
    And I click Add Customer Button
    And I search for "auto test"
    When I click "auto test" to select customer for the seat
    And I click the customer name on the order screen
    Then I should see the customer profile window
    And I select tax exempt on customer profile screen
    And I click the Save button
    Then I Should get back to the Order Screen
    Then I should see the tax reflected to the check
    And I click All
    And I click Table Layout tab
    And I click power button
    Examples:
      | table_no | number_of_seats | Menu_Item  |  SubTotal   | Tax       | Total       | Total1      | total      |customer_name|
      | T10         |1             |Halwa       | $ 10.00     | $ 1.00    | $ 11.00     | $ 10.00     |$ 20.00     |auto test    |


