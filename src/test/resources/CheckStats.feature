
@CheckStats
Feature: Check Stats



  Scenario Outline: Operation on Check Stats Screen
    Given I'm logged in
    And I closed the order type window
    And I click All
    And I click Table Layout tab
    And I click Check Stats tab
    And I click the Operation button on the check stats
    Then I should see operation screen
    And I click POS Icon from Toggle
    And I closed the order type window
    And I click All
    And I click Table Layout tab
     # Active Checks
    And I click new check button on the Table layout screen
    And I select table as "<table_no>"
    And I select the number of seats as "<number_of_seats>"
    And I tap Continue to finish selecting the number of seats
    Then I Should get back to the Order Screen
    And I get check number
    And I select FOOD as category
    And I select menu item as "<Menu_Item>"
    And I select modifier as "<Modifier>"
    And I click Done to get back
    And I click Finish button
    Then I should get back to the Table Layout tab
    And I click Check Stats tab
    And I click the active check on check stats
    And I click open check button
    And I click Cash button for Complete Sale
    And I click Exact button on the cash pop-up
    And I click Enter Button on the cash pop-up
   # Then I should see the print or send receipt
    #And I click No thanks Button on the print receipt
    Then I should see table layout Screen
    And I click Table Layout tab
  # Pay check
    And I click new check button on the Table layout screen
    And I select table as "<table_no>"
    And I select the number of seats as "<number_of_seats>"
    And I tap Continue to finish selecting the number of seats
    Then I Should get back to the Order Screen
    And I get check number
    And I select FOOD as category
    And I select menu item as "<Menu_Item>"
    And I select modifier as "<Modifier>"
    And I click Done to get back
    And I click All
    Then I should get back to the Table Layout tab
    And I click Check Stats tab
    And I click the active check on check stats
    And I click Pay Check button
    Then I should see the Payment window
    And I click cash button from the payment method popup
    And I click Submit button on the Payment Window
   # Then I should see the print or send receipt
    #And I click No thanks Button on the print receipt
    Then I should see check stats Screen
    And I click Table Layout tab

 # Pay Check allow the user to Exit from Payment screen and Add new items
    And I click new check button on the Table layout screen
    And I select table as "<table_no>"
    And I select the number of seats as "<number_of_seats>"
    And I tap Continue to finish selecting the number of seats
    Then I Should get back to the Order Screen
    And I get check number
    And I select FOOD as category
    And I select menu item as "<Menu_Item>"
    And I select modifier as "<Modifier>"
    And I click Done to get back
    And I click All
    Then I should get back to the Table Layout tab
    And I click Check Stats tab
    And I click the active check on check stats
    And I click Pay Check button
    And I click cash button from the payment method popup
    And I click the Exit button in the payment window
    And I select FOOD as category
    And I select menu item as "<Menu_Item1>"
    And I select modifier as "<Modifier1>"
    And I click Done to get back
    Then I should see that OrderScreen with modifiers as "<Modifier1>"
    And I click Payment button in the Order Management Screen
    And I click cash button from the payment method popup
    And I click Submit button on the Payment Window
   # Then I should see the print or send receipt
    #And I click No thanks Button on the print receipt
    Then I should get back to the Table Layout tab
    And I click Table Layout tab
  # Open check
    And I click new check button on the Table layout screen
    And I select table as "<table_no>"
    And I select the number of seats as "<number_of_seats>"
    And I tap Continue to finish selecting the number of seats
    Then I Should get back to the Order Screen
    And I get check number
    And I select FOOD as category
    And I select menu item as "<Menu_Item>"
    And I select modifier as "<Modifier>"
    And I click Done to get back
    And I click All
    Then I should get back to the Table Layout tab
    And I click Check Stats tab
    And I click the active check on check stats
    And I click open check button
    Then I Should get back to the Order Screen
    And I select FOOD as category
    And I select menu item as "<Menu_Item1>"
    And I select modifier as "<Modifier1>"
    And I click Done to get back
    And I click Payment button in the Order Management Screen
    And I click cash button from the payment method popup
    And I click Submit button on the Payment Window
  #  Then I should see the print or send receipt
   # And I click No thanks Button on the print receipt
    Then I should see check stats Screen
    And I click Table Layout tab

 # Reprint Check
    And I click new check button on the Table layout screen
    And I select table as "<table_no>"
    And I select the number of seats as "<number_of_seats>"
    And I tap Continue to finish selecting the number of seats
    Then I Should get back to the Order Screen
    And I get check number
    And I select FOOD as category
    And I select menu item as "<Menu_Item>"
    And I select modifier as "<Modifier>"
    And I click Done to get back
    And I click All
    Then I should get back to the Table Layout tab
    And I click Check Stats tab
    And I click the active check on check stats
    And I click reprint Check button
#    Then I should see the Linga Popup
#    And I click Done button on the Popup
    And I click Pay Check button
    Then I should see the Payment window
    And I click cash button from the payment method popup
    And I click Submit button on the Payment Window
#    Then I should see the print or send receipt
#    And I click No thanks Button on the print receipt
    Then I should see check stats Screen
    And I click Table Layout tab

 # Close Checks
    And I click new check button on the Table layout screen
    And I select table as "<table_no>"
    And I select the number of seats as "<number_of_seats>"
    And I tap Continue to finish selecting the number of seats
    Then I Should get back to the Order Screen
    And I get check number
    And I select FOOD as category
    And I select menu item as "<Menu_Item>"
    And I select modifier as "<Modifier>"
    And I click Done to get back
    And I click Payment button in the Order Management Screen
    And I click cash button from the payment method popup
    And I click Submit button on the Payment Window
   # Then I should see the print or send receipt
    #And I click No thanks Button on the print receipt
    Then I should get back to the Table Layout tab
    And I click Check Stats tab
    And I click Closed tab on the Check stats
    Then I should see closed check in closed check tab
#    And I click the Closed check on check stats
    And I click Table Layout tab

  #Closed checks , should be moved Active to Closed
    And I click new check button on the Table layout screen
    And I select table as "<table_no>"
    And I select the number of seats as "<number_of_seats>"
    And I tap Continue to finish selecting the number of seats
    Then I Should get back to the Order Screen
    And I get check number
    And I select FOOD as category
    And I select menu item as "<Menu_Item>"
    And I select modifier as "<Modifier>"
    And I click Done to get back
    And I click All
    Then I should get back to the Table Layout tab
    And I click Check Stats tab
    And I click the active check on check stats
    And I click Pay Check button
    Then I should see the Payment window
    And I click cash button from the payment method popup
    And I click Submit button on the Payment Window
  #  Then I should see the print or send receipt
   # And I click No thanks Button on the print receipt
    And I click Check Stats tab
    Then I should see check stats Screen
    And I click Closed tab on the Check stats
    Then I should see closed check in closed check tab
    And I click Table Layout tab
  # void check
    And I click new check button on the Table layout screen
    And I select table as "<table_no>"
    And I select the number of seats as "<number_of_seats>"
    And I tap Continue to finish selecting the number of seats
    Then I Should get back to the Order Screen
    And I get check number
    And I select FOOD as category
    And I select menu item as "<Menu_Item>"
    And I select modifier as "<Modifier>"
    And I click Done to get back
    And I click All
    Then I should get back to the Table Layout tab
    And I click Check Stats tab
    And I click the active check on check stats
    And I click Pay Check button
    Then I should see the Payment window
    And I click cash button from the payment method popup
    And I click Submit button on the Payment Window
  #  Then I should see the print or send receipt
   # And I click No thanks Button on the print receipt
    And I click Check Stats tab
    Then I should see check stats Screen
    And I click Closed tab on the Check stats
    And I click the Closed check on check stats
    And I click reopen check button on the check stats screen
    Then I should see that OrderScreen with sales
    And I click Void button on order management screen
    Then I should see payment made on this check popup message
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
    Then I should get back to the Table Layout tab
    And I click power button
    Examples:
      | table_no | number_of_seats | Menu_Item | Modifier | Menu_Item1 | Modifier1 |
      | T24       |1             |  French Friese | Steak  | Garlic Bread | 4 BBQ  |


  @CheckStats
  Scenario:Verify Active Checks, Verify Closed Checks
    Given I'm logged in
    And I closed the order type window
    And I click All
    And I click Table Layout tab
    And I click new check button on the Table layout screen
    And I select table as "T22"
    And I select the number of seats as "1"
    And I tap Continue to finish selecting the number of seats
    Then I Should get back to the Order Screen
    And I get check number
    And I select category as "FOOD"
    And I select menu item as "SANDWICHES"
    And I click Finish button
    And I click Check Stats tab
    When User click Active Checks tabs in check status screen
    Then I click the active check on check stats
    Then I should see active check
#    Then I should see closed check in closed check tab
    And I click Table Layout tab
    When I click the check from the table layout
    When User click Cash Tab in check status screen
    Then User click exact option in check status screen
    And User click enter button in check status screen
    #Verify Closed Checks
    And I click Check Stats tab
    Then User click Closed Checks tabs in check status screen
    Then I should see closed check in closed check tab

    When I click QSR tab
    Then I closed the order type window
    And I get check number
    And I select category as "FOOD"
    And I select menu item as "SANDWICHES"
    When User click void button in check status screen
#    Then User select void reason in check status screen
#    And User click add void button in check status screen
    Then I click Done button on the Popup
#    Then I closed the order type window
    #Verify Void Checks
    And User take an order as "SANDWICHES"
    When I get check number
    Then User click payment button in check status screen
    And User click exact option in check status screen
    And USer click cash button in check status screen
    And I click payment in the payment window
    When I click Delete button on the payment window
#    And I click "OK" in the receipt printer popup in check status screen "Click ok button in the popup"
    When I click Exit to return to Order Management Screen
    When User click void button in check status screen
    Then User select void reason in check status screen
    And User click add void button in check status screen
    Then I click Done button on the Popup
#    And I closed the order type window
    And User click All button in check status screen
    And I click Check Stats tab
    And User click Void Checks tabs in check status screen
    Then I should see closed check in closed check tab
  And I click power button







