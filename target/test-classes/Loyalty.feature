@Payment0910
Feature: Loyalty


  Scenario Outline: Loyalty for new customer
    Given I'm logged in
    And I closed the order type window
    And I click All
    And I click Table Layout tab
    And I click new check button on the Table layout screen
    And I select table as "<table_no>"
    And I select the number of seats as "<number_of_seats>"
    And I tap Continue to finish selecting the number of seats
    And I click Add Customer Button
    And I search for "<customer_name>"
    When I click "<customer_name>" to select customer for the seat
    And I select category as "FOOD"
    And I select menu item as "<Menu_Item>"
    And I select modifier as "<Modifier>"
    And I click Done to get back
    And I click Payment button in the Order Management Screen
    And I click other button from the payment method popup
    And I click Submit button on the Payment Window
 #   Then I should see the print or send receipt
  #  And I click No thanks Button on the print receipt
    Then I should get back to the Table Layout tab
    And I click the Operation button on the Table Layout
    And I click POS Icon from Toggle
    And I close the order type window
    And I click Add Customer Button
    And I search for "<customer_name>"
    When I click "<customer_name>" to select customer for the seat
    And I click the customer name on the order screen
#    And I select the customer for loyalty
    And I click loyalty button on the customer profile window
    Then I should see loyalty balance window
    # Then I should see loyalty on the loyalty balance window
    And I close the loyalty balance window
    And I click the Save button
    And I click Add Customer Button
    And I click remove button
    And I click on the cross buttin in the customer profile screen
    And I click log off button in order screen
    Examples:
      | table_no | number_of_seats | Menu_Item | Modifier | customer_name |
      | T9         |1              |  French Friese | Steak  | auto loyaltytest |


  Scenario Outline: Loyalty For New Customer - Delivery Service Type
    Given I'm logged in
    And I select the DELIVERY order type
    When I click Done button to select the order type
#    Then I should see the customer profile window
    And I search for "<customer_name>"
    When I click "<customer_name>" to select customer for the seat
    And I click the Save button
    And I click the customer name on the order screen
    And I click the Save button
    Then I Should get back to the Order Screen
    And I get check number
    Then I should see customer as "<customer>" added on order screen
    Then I should see Delivery charge added to orderscreen for loyalty
    Then I should see subtotal should not change when added delivery charge
    And I select category as "FOOD"
    And I select menu item as "<Menu_Item>"
    And I select modifier as "<Modifier>"
    And I click Done to get back
    And I click Finish button
    Then I should see the Phone Order tab
    And I click the Closed check in new tab window
    And I click active driver as "cashier3 0"
    Then I should see driver is offline popup
    And I click Yes button on driver is offline popup
    And I click active driver as "cashier3 0" in the Phone Order Screen
    And I click departure button
    And I click out tab in phone order screen
    And I click the Closed check in out tab
    And I click Pay Check button
    Then I should see the Payment window
    And I click loyalty payment
    Then I should see loyalty balance after click loyalty payment in payment window
    And I click Exit to return to Order Management Screen
    And I click Finish button
    Then I should see the Phone Order tab
    And I click out tab in phone order screen
    And I click the Closed check in out tab
    And I click Arrival button in phone order screen
    And I click Complete tab
#    Then I should see closed check in complete tab
    And I click QSR tab
    And I closed the order type window
    And I click Add Customer Button
    And I search for "<customer_name>"
    When I click "<customer_name>" to select customer for the seat
    And I click the customer name on the order screen
#    And I select the customer for loyalty
    And I click loyalty button on the customer profile window
    Then I should see loyalty balance window
    # Then I should see loyalty on the loyalty balance window
    And I close the loyalty balance window
    And I click the Save button
    Then I Should get back to the Order Screen
    And I tap QSR button to open the order types combo

#
#  Scenario Outline: Loyalty Payment - Delivery Service Type
#    Given I'm logged in
#    And I closed the order type window
#    And I tap QSR button to open the order types combo
    And I select the DELIVERY order type
    And I search for "<customer_name>"
    When I click "<customer_name>" to select customer for the seat
    And I click the Save button
    Then I Should get back to the Order Screen
    And I get check number
    Then I should see customer as "<customer>" added on order screen
    Then I should see Delivery charge added to orderscreen for loyalty
    Then I should see subtotal should not change when added delivery charge
    And I select category as "FOOD"
    And I select menu item as "<Menu_Item>"
    And I select modifier as "<Modifier>"
    And I click Done to get back
    And I click Finish button
    Then I should see the Phone Order tab
    And I click the Closed check in new tab window
    And I click active driver as "Auto D"
    Then I should see driver is offline popup
    And I click Yes button on driver is offline popup
    And I click active driver as "Auto D" in the Phone Order Screen
    And I click departure button
    And I click out tab in phone order screen
    And I click the Closed check in out tab
    And I click Pay Check button
    Then I should see the Payment window
    And I click loyalty payment
    Then I should see loyalty balance after click loyalty payment in payment window
    And I click Exit to return to Order Management Screen
    And I click Finish button
    Then I should see the Phone Order tab
    And I click out tab in phone order screen
    And I click the Closed check in out tab
    And I click Arrival button in phone order screen
    And I click Complete tab
#    Then I should see closed check in complete tab
    And I click QSR tab


  #Scenario Outline:Loyalty payment by any payment
   # Given I'm logged in
    And I closed the order type window
    And I click Add Customer Button
    And I search for "<customer_name>"
    When I click "<customer_name>" to select customer for the seat
    And I click the customer name on the order screen
#    And I select the customer for loyalty
    And I click loyalty button on the customer profile window
    Then I should see loyalty balance window
    # Then I should see loyalty on the loyalty balance window
    And I close the loyalty balance window
    And I click the Save button
    And I get check number
    And I select category as "FOOD"
    And I select menu item as "<Menu_Item1>"
    And I select modifier as "<Modifier1>"
    And I click Done to get back
    And I click Payment button in the Order Management Screen
    And I click other button from the payment method popup
    And I click Submit button on the Payment Window
 #   Then I should see the print or send receipt
  #  And I click No thanks Button on the print receipt
    And I closed the order type window
    And I click Add Customer Button
    And I search for "<customer_name>"
    When I click "<customer_name>" to select customer for the seat
    And I click the customer name on the order screen
#    And I select the customer for loyalty
    And I click loyalty button on the customer profile window
    Then I should see loyalty balance window
    # Then I should see loyalty on the loyalty balance window
    And I close the loyalty balance window
    And I click the Save button
    Then I Should get back to the Order Screen

 # Scenario Outline: Loyalty payment by cash payment
   # Given I'm logged in
    #And I closed the order type window
    And I click Add Customer Button
    And I search for "<customer_name>"
    When I click "<customer_name>" to select customer for the seat
    And I click the customer name on the order screen
#    And I select the customer for loyalty
    And I click loyalty button on the customer profile window
    Then I should see loyalty balance window
    # Then I should see loyalty on the loyalty balance window
    And I close the loyalty balance window
    And I click the Save button
    And I get check number
    And I select category as "FOOD"
    And I select menu item as "<Menu_Item>"
    And I select modifier as "<Modifier>"
    And I click Done to get back
    And I click Payment button in the Order Management Screen
    And I click cash button from the payment method popup
    And I click Submit button on the Payment Window
  #  Then I should see the print or send receipt
   # And I click No thanks Button on the print receipt
    And I closed the order type window
    And I click Add Customer Button
    And I search for "<customer_name>"
    When I click "<customer_name>" to select customer for the seat
    And I click the customer name on the order screen
#    And I select the customer for loyalty
    And I click loyalty button on the customer profile window
    Then I should see loyalty balance window
    # Then I should see loyalty on the loyalty balance window
    And I close the loyalty balance window
    And I click the Save button
    Then I Should get back to the Order Screen

  #Scenario Outline: Loyalty point by doing menu item based
   # Given I'm logged in
   # And I closed the order type window
    And I click Add Customer Button
    And I search for "<customer_name>"
    When I click "<customer_name>" to select customer for the seat
    And I click the customer name on the order screen
#    And I select the customer for loyalty
    And I click loyalty button on the customer profile window
    Then I should see loyalty balance window
    # Then I should see loyalty on the loyalty balance window
    And I close the loyalty balance window
    And I click the Save button
    And I get check number
    And I select category as "Menu"
    And I select menu item as "<Menu_Item2>"
    And I select menu item as "<Menu_Item2>"
    And I click Payment button in the Order Management Screen
    And I click cash button from the payment method popup
    And I click Submit button on the Payment Window
 #   Then I should see the print or send receipt
  #  And I click No thanks Button on the print receipt
    And I closed the order type window
    And I click Add Customer Button
    And I search for "<customer_name>"
    When I click "<customer_name>" to select customer for the seat
    And I click the customer name on the order screen
#    And I select the customer for loyalty
    And I click loyalty button on the customer profile window
    Then I should see loyalty balance window
    # Then I should see loyalty on the loyalty balance window
    And I close the loyalty balance window
    And I click the Save button
    Then I Should get back to the Order Screen


  #Scenario Outline: Loyalty point for a minimum price of menu item
   # Given I'm logged in
   # And I closed the order type window
    And I click Add Customer Button
    And I search for "<customer_name>"
    When I click "<customer_name>" to select customer for the seat
    And I click the customer name on the order screen
#    And I select the customer for loyalty
    And I click loyalty button on the customer profile window
    Then I should see loyalty balance window
    # Then I should see loyalty on the loyalty balance window
    And I close the loyalty balance window
    And I click the Save button
    And I get check number
    And I select category as "FOOD"
    And I select menu item as "<Menu_Item3>"
    And I select menu item as "<Menu_Item3>"
    And I click Payment button in the Order Management Screen
    And I click other button from the payment method popup
    And I click Submit button on the Payment Window
 #   Then I should see the print or send receipt
  #  And I click No thanks Button on the print receipt
    And I closed the order type window
    And I click Add Customer Button
    And I search for "<customer_name>"
    When I click "<customer_name>" to select customer for the seat
    And I click the customer name on the order screen
#    And I select the customer for loyalty
    And I click loyalty button on the customer profile window
    Then I should see loyalty balance window
    # Then I should see loyalty on the loyalty balance window
    And I close the loyalty balance window
    And I click the Save button
    Then I Should get back to the Order Screen

 # Scenario Outline: Loyalty point by any menu item based
  #  Given I'm logged in
  #  And I closed the order type window
    And I click Add Customer Button
    And I search for "<customer_name>"
    When I click "<customer_name>" to select customer for the seat
    And I click the customer name on the order screen
#    And I select the customer for loyalty
    And I click loyalty button on the customer profile window
    Then I should see loyalty balance window
    # Then I should see loyalty on the loyalty balance window
    And I close the loyalty balance window
    And I click the Save button
    And I get check number
    And I select category as "FOOD"
    And I select menu item as "<Menu_Item3>"
    And I select menu item as "<Menu_Item3>"
    And I click Payment button in the Order Management Screen
    And I click other button from the payment method popup
    And I click Submit button on the Payment Window
 #   Then I should see the print or send receipt
  #  And I click No thanks Button on the print receipt
    And I closed the order type window
    And I click Add Customer Button
    And I search for "<customer_name>"
    When I click "<customer_name>" to select customer for the seat
    And I click the customer name on the order screen
#    And I select the customer for loyalty
    And I click loyalty button on the customer profile window
    Then I should see loyalty balance window
    # Then I should see loyalty on the loyalty balance window
    And I close the loyalty balance window
    And I click the Save button
    Then I Should get back to the Order Screen


 # Scenario Outline: Loyalty point by category based
   # Given I'm logged in
   # And I closed the order type window
    And I click Add Customer Button
    And I search for "<customer_name>"
    When I click "<customer_name>" to select customer for the seat
    And I click the customer name on the order screen
#    And I select the customer for loyalty
    And I click loyalty button on the customer profile window
    Then I should see loyalty balance window
    # Then I should see loyalty on the loyalty balance window
    And I close the loyalty balance window
    And I click the Save button
    And I get check number
    And I select category as "Salad"

    And I select menu item as "<Menu_Item4>"
    And I click Payment button in the Order Management Screen
    And I click other button from the payment method popup
    And I click Submit button on the Payment Window
 #   Then I should see the print or send receipt
  #  And I click No thanks Button on the print receipt
    And I closed the order type window
    And I click Add Customer Button
    And I search for "<customer_name>"
    When I click "<customer_name>" to select customer for the seat
    And I click the customer name on the order screen
#    And I select the customer for loyalty
    And I click loyalty button on the customer profile window
    Then I should see loyalty balance window
    # Then I should see loyalty on the loyalty balance window
    And I close the loyalty balance window
    And I click the Save button
    Then I Should get back to the Order Screen



  #Scenario Outline: Loyalty point by any category based
  #  Given I'm logged in
    #And I closed the order type window
    And I click Add Customer Button
    And I search for "<customer_name>"
    When I click "<customer_name>" to select customer for the seat
    And I click the customer name on the order screen
#    And I select the customer for loyalty
    And I click loyalty button on the customer profile window
    Then I should see loyalty balance window
    # Then I should see loyalty on the loyalty balance window
    And I close the loyalty balance window
    And I click the Save button
    And I get check number
    And I select category as "Menu"
    And I select menu item as "<Menu_Item2>"
    And I click Payment button in the Order Management Screen
    And I click other button from the payment method popup
    And I click Submit button on the Payment Window
 #   Then I should see the print or send receipt
  #  And I click No thanks Button on the print receipt
    And I closed the order type window
    And I click Add Customer Button
    And I search for "<customer_name>"
    When I click "<customer_name>" to select customer for the seat
    And I click the customer name on the order screen
#    And I select the customer for loyalty
    And I click loyalty button on the customer profile window
    Then I should see loyalty balance window
    # Then I should see loyalty on the loyalty balance window
    And I close the loyalty balance window
    And I click the Save button
    Then I Should get back to the Order Screen
    And I click log off button in order screen

    Examples:
      | customer_name       |customer  | Menu_Item    | Modifier | Driver | driver | Menu_Item1      | Modifier1 |Menu_Item2 |Menu_Item3 | Menu_Item4        |
      | auto loyaltytest    | auto l   | Garlic Bread | 4 BBQ    | Auto D | Auto   | French Friese   | Steak     | Dosa      | Onion Rings     | BLUE CHEESE      |


