@Regression

Feature:Table Order Operations

  Background:
    Given I'm logged in
    And I close the order type window
    And I click All
    And I click Table Layout tab

  Scenario: Change Floors
    #Given I'm logged in
    #And I close the order type window
    #And I click All
    #And I click Table Layout tab
#    And I click right symbol
#    Then I should see next floor
#    And I click Left symbol
#    Then I should see previous floor

  #Scenario: Operation Table Layout
    And I click the Operation button on the Table Layout
    Then I should see operation screen
    And I click POS Icon from Toggle
    And I closed the order type window
    And I click All
    And I click Table Layout tab



 # Scenario: Types of checks should show on the Table Layout screen
#    Then I should see types of checks available on the Table layout screen
    And I click power button


  Scenario Outline: Merge Checks - Rare Scenarios
    And I click new check button on the Table layout screen
    And I select a table to be merged as "<first>"
    And I select the number of seats as "<number_of_seats>"
    And I tap Continue to finish selecting the number of seats
    And I get check number
    And I select FOOD as category
    And I select menu item as "<Menu_Item>"
    And I select modifier as "<Modifier>"
    And I click Done to get back
    And I click seat 2 for add menu item
    And I select FOOD as category
    And I select menu item as "<Menu_Item1>"
    And I select modifier as "<Modifier1>"
    And I click Done to get back
    And I click seat 3 for add menu item
    And I select FOOD as category
    And I select menu item as "<Menu_Item2>"
    And I select modifier as "<Modifier2>"
    And I click Done to get back
    And I click Finish Order button
    Then I should get back to the Table Layout tab
    And I click new check button on the Table layout screen
    And I select a table to be merged as "<second>"
    And I select the number of seats as "<number_of_seats>"
    And I tap Continue to finish selecting the number of seats
    And I get check number
    And I select FOOD as category
    And I select menu item as "<Menu_Item>"
    And I select modifier as "<Modifier>"
    And I click Done to get back
    And I click seat 2 for add menu item
    And I select FOOD as category
    And I select menu item as "<Menu_Item1>"
    And I select modifier as "<Modifier1>"
    And I click Done to get back
    And I click seat 3 for add menu item
    And I select FOOD as category
    And I select menu item as "<Menu_Item2>"
    And I select modifier as "<Modifier2>"
    And I click Done to get back
    And I click Finish Order button
    Then I should get back to the Table Layout tab
    And I click new check button on the Table layout screen
    And I select a table to be merged as "<third>"
    And I select the number of seats as "<number_of_seats>"
    And I tap Continue to finish selecting the number of seats
    And I get check number
    And I select FOOD as category
    And I select menu item as "<Menu_Item>"
    And I select modifier as "<Modifier>"
    And I click Done to get back
    And I click seat 2 for add menu item
    And I select FOOD as category
    And I select menu item as "<Menu_Item1>"
    And I select modifier as "<Modifier1>"
    And I click Done to get back
    And I click seat 3 for add menu item
    And I select FOOD as category
    And I select menu item as "<Menu_Item2>"
    And I select modifier as "<Modifier2>"
    And I click Done to get back
    And I click Finish Order button
    Then I should get back to the Table Layout tab
    And I click new check button on the Table layout screen
    And I select a table to be merged as "<four>"
    And I select the number of seats as "<number_of_seats>"
    And I tap Continue to finish selecting the number of seats
    And I get check number
    And I select FOOD as category
    And I select menu item as "<Menu_Item>"
    And I select modifier as "<Modifier>"
    And I click Done to get back
    And I click seat 2 for add menu item
    And I select FOOD as category
    And I select menu item as "<Menu_Item1>"
    And I select modifier as "<Modifier1>"
    And I click Done to get back
    And I click seat 3 for add menu item
    And I select FOOD as category
    And I select menu item as "<Menu_Item2>"
    And I select modifier as "<Modifier2>"
    And I click Done to get back
    And I click Finish Order button
    Then I should get back to the Table Layout tab
    And I click new check button on the Table layout screen
    And I select a table to be merged as "<five>"
    And I select the number of seats as "<number_of_seats>"
    And I tap Continue to finish selecting the number of seats
    And I get check number
    And I select FOOD as category
    And I select menu item as "<Menu_Item>"
    And I select modifier as "<Modifier>"
    And I click Done to get back
    And I click seat 2 for add menu item
    And I select FOOD as category
    And I select menu item as "<Menu_Item1>"
    And I select modifier as "<Modifier1>"
    And I click Done to get back
    And I click seat 3 for add menu item
    And I select FOOD as category
    And I select menu item as "<Menu_Item2>"
    And I select modifier as "<Modifier2>"
    And I click Done to get back
    And I click Finish Order button
    Then I should get back to the Table Layout tab
    And I click Merge button
    And I select a table to be merged as "<first>"
    And I select a table to be merged as "<second>"
    And I select a table to be merged as "<third>"
    And I select a table to be merged as "<four>"
    And I select a table to be merged as "<five>"
    And I click Done button on the pop-up to complete merging
    And I wait sometimes
#    Then I should see the Linga Popup
    And I click Done button on the Popup
    And I select a table to be merged as "<first>"
    Then I should see that OrderScreen with Merge seats as "<Merge_seat>"
    And I click Payment button in the Order Management Screen
    And I click cash button from the payment method popup
    And I click Submit button on the Payment Window
   #    Then I should see the print or send receipt
#    And I click No thanks Button on the print receipt
    Then I should get back to the Table Layout tab
    And I click power button
    Examples:
      | first |second |third | four | five | number_of_seats | Menu_Item   | Menu_Item1   | Menu_Item2 | Modifier | Modifier1 | Modifier2 | Merge_seat |
      | T1    | T2    |T3    | T4    | T5  | 3               |French Friese| Garlic Bread | Tuna Tacos |  Steak   | 4 BBQ     | Croutons  | 15         |


  Scenario Outline: Merge 5 check without pay
    And I click new check button on the Table layout screen
    And I select a table to be merged as "<first>"
    And I select the number of seats as "<number_of_seats>"
    And I tap Continue to finish selecting the number of seats
    And I get check number
    And I select FOOD as category
    And I select menu item as "<Menu_Item>"
    And I select modifier as "<Modifier>"
    And I click Done to get back
    And I select menu item as "<Menu_Item1>"
    And I select modifier as "<Modifier1>"
    And I click Done to get back
    And I select menu item as "<Menu_Item2>"
    And I select modifier as "<Modifier2>"
    And I click Done to get back
    And I select menu item as "<Menu_Item3>"
    And I select modifier as "<Modifier3>"
    And I click Done to get back
    And I select menu item as "<Menu_Item4>"
    And I select modifier as "<Modifier4>"
    And I click Done to get back
    And I click Finish Order button
    Then I should get back to the Table Layout tab
    And I click new check button on the Table layout screen
    And I select a table to be merged as "<second>"
    And I select the number of seats as "<number_of_seats>"
    And I tap Continue to finish selecting the number of seats
    And I get check number
    And I select FOOD as category
    And I select menu item as "<Menu_Item>"
    And I select modifier as "<Modifier>"
    And I click Done to get back
    And I select menu item as "<Menu_Item1>"
    And I select modifier as "<Modifier1>"
    And I click Done to get back
    And I select menu item as "<Menu_Item2>"
    And I select modifier as "<Modifier2>"
    And I click Done to get back
    And I select menu item as "<Menu_Item3>"
    And I select modifier as "<Modifier3>"
    And I click Done to get back
    And I select menu item as "<Menu_Item4>"
    And I select modifier as "<Modifier4>"
    And I click Done to get back
    And I click Finish Order button
    Then I should get back to the Table Layout tab
    And I click new check button on the Table layout screen
    And I select a table to be merged as "<third>"
    And I select the number of seats as "<number_of_seats>"
    And I tap Continue to finish selecting the number of seats
    And I get check number
    And I select FOOD as category
    And I select menu item as "<Menu_Item>"
    And I select modifier as "<Modifier>"
    And I click Done to get back
    And I select menu item as "<Menu_Item1>"
    And I select modifier as "<Modifier1>"
    And I click Done to get back
    And I select menu item as "<Menu_Item2>"
    And I select modifier as "<Modifier2>"
    And I click Done to get back
    And I select menu item as "<Menu_Item3>"
    And I select modifier as "<Modifier3>"
    And I click Done to get back
    And I select menu item as "<Menu_Item4>"
    And I select modifier as "<Modifier4>"
    And I click Done to get back
    And I click Finish Order button
    Then I should get back to the Table Layout tab
    And I click new check button on the Table layout screen
    And I select a table to be merged as "<Four>"
    And I select the number of seats as "<number_of_seats>"
    And I tap Continue to finish selecting the number of seats
    And I get check number
    And I select FOOD as category
    And I select menu item as "<Menu_Item>"
    And I select modifier as "<Modifier>"
    And I click Done to get back
    And I select menu item as "<Menu_Item1>"
    And I select modifier as "<Modifier1>"
    And I click Done to get back
    And I select menu item as "<Menu_Item2>"
    And I select modifier as "<Modifier2>"
    And I click Done to get back
    And I select menu item as "<Menu_Item3>"
    And I select modifier as "<Modifier3>"
    And I click Done to get back
    And I select menu item as "<Menu_Item4>"
    And I select modifier as "<Modifier4>"
    And I click Done to get back
    And I click Finish Order button
    Then I should get back to the Table Layout tab
    And I click new check button on the Table layout screen
    And I select a table to be merged as "<Five>"
    And I select the number of seats as "<number_of_seats>"
    And I tap Continue to finish selecting the number of seats
    And I get check number
    And I select FOOD as category
    And I select menu item as "<Menu_Item>"
    And I select modifier as "<Modifier>"
    And I click Done to get back
    And I select menu item as "<Menu_Item1>"
    And I select modifier as "<Modifier1>"
    And I click Done to get back
    And I select menu item as "<Menu_Item2>"
    And I select modifier as "<Modifier2>"
    And I click Done to get back
    And I select menu item as "<Menu_Item3>"
    And I select modifier as "<Modifier3>"
    And I click Done to get back
    And I select menu item as "<Menu_Item4>"
    And I select modifier as "<Modifier4>"
    And I click Done to get back
    And I click Finish Order button
    Then I should get back to the Table Layout tab
    And I click Merge button
    And I select a table to be merged as "<first>"
    And I select a table to be merged as "<second>"
    And I select a table to be merged as "<third>"
    And I select a table to be merged as "<Four>"
    And I select a table to be merged as "<Five>"
    And I click Done button on the pop-up to complete merging
    And I wait sometimes
#    Then I should see the Linga Popup
    And I click Done button on the Popup
    And I select a table to be merged as "<first>"
    Then I should see that OrderScreen with Merge seats as "<Merge_seat>"
    And I click Payment button in the Order Management Screen
    And I click cash button from the payment method popup
    And I click Submit button on the Payment Window
   #    Then I should see the print or send receipt
#    And I click No thanks Button on the print receipt
    Then I should get back to the Table Layout tab
#    And I click power button
#    Examples:
 #     | first |second |third | Four | Five | number_of_seats | Menu_Item | Menu_Item1 | Menu_Item2 | Menu_Item3 | Menu_Item4 | Modifier | Modifier1 | Modifier2 | Modifier3 | Modifier4 | Merge_seat |
 #     | T1    | T2   | T3   | T4  | T5  | 1               |French Friese | Garlic Bread | Tuna Tacos |Cheesy Bacon Fries | B.I. Wings | Steak | 4 BBQ | Croutons | 1/2 Cheese | Tomato    | 5        |

#  Scenario Outline: Merge 5 Checks without Pay (Print in Table Layout)
    And I click new check button on the Table layout screen
    And I select a table to be merged as "<first>"
    And I select the number of seats as "<number_of_seats>"
    And I tap Continue to finish selecting the number of seats
    And I get check number
    And I select FOOD as category
    And I select menu item as "<Menu_Item>"
    And I select modifier as "<Modifier>"
    And I click Done to get back
    And I select menu item as "<Menu_Item1>"
    And I select modifier as "<Modifier1>"
    And I click Done to get back
    And I select menu item as "<Menu_Item2>"
    And I select modifier as "<Modifier2>"
    And I click Done to get back
    And I select menu item as "<Menu_Item3>"
    And I select modifier as "<Modifier3>"
    And I click Done to get back
    And I select menu item as "<Menu_Item4>"
    And I select modifier as "<Modifier4>"
    And I click Done to get back
    And I click Finish Order button
    Then I should get back to the Table Layout tab
    And I click new check button on the Table layout screen
    And I select a table to be merged as "<second>"
    And I select the number of seats as "<number_of_seats>"
    And I tap Continue to finish selecting the number of seats
    And I get check number
    And I select FOOD as category
    And I select menu item as "<Menu_Item>"
    And I select modifier as "<Modifier>"
    And I click Done to get back
    And I select menu item as "<Menu_Item1>"
    And I select modifier as "<Modifier1>"
    And I click Done to get back
    And I select menu item as "<Menu_Item2>"
    And I select modifier as "<Modifier2>"
    And I click Done to get back
    And I select menu item as "<Menu_Item3>"
    And I select modifier as "<Modifier3>"
    And I click Done to get back
    And I select menu item as "<Menu_Item4>"
    And I select modifier as "<Modifier4>"
    And I click Done to get back
    And I click Finish Order button
    Then I should get back to the Table Layout tab
    And I click new check button on the Table layout screen
    And I select a table to be merged as "<third>"
    And I select the number of seats as "<number_of_seats>"
    And I tap Continue to finish selecting the number of seats
    And I get check number
    And I select FOOD as category
    And I select menu item as "<Menu_Item>"
    And I select modifier as "<Modifier>"
    And I click Done to get back
    And I select menu item as "<Menu_Item1>"
    And I select modifier as "<Modifier1>"
    And I click Done to get back
    And I select menu item as "<Menu_Item2>"
    And I select modifier as "<Modifier2>"
    And I click Done to get back
    And I select menu item as "<Menu_Item3>"
    And I select modifier as "<Modifier3>"
    And I click Done to get back
    And I select menu item as "<Menu_Item4>"
    And I select modifier as "<Modifier4>"
    And I click Done to get back
    And I click Finish Order button
    Then I should get back to the Table Layout tab
    And I click new check button on the Table layout screen
    And I select a table to be merged as "<Four>"
    And I select the number of seats as "<number_of_seats>"
    And I tap Continue to finish selecting the number of seats
    And I get check number
    And I select FOOD as category
    And I select menu item as "<Menu_Item>"
    And I select modifier as "<Modifier>"
    And I click Done to get back
    And I select menu item as "<Menu_Item1>"
    And I select modifier as "<Modifier1>"
    And I click Done to get back
    And I select menu item as "<Menu_Item2>"
    And I select modifier as "<Modifier2>"
    And I click Done to get back
    And I select menu item as "<Menu_Item3>"
    And I select modifier as "<Modifier3>"
    And I click Done to get back
    And I select menu item as "<Menu_Item4>"
    And I select modifier as "<Modifier4>"
    And I click Done to get back
    And I click Finish Order button
    Then I should get back to the Table Layout tab
    And I click new check button on the Table layout screen
    And I select a table to be merged as "<Five>"
    And I select the number of seats as "<number_of_seats>"
    And I tap Continue to finish selecting the number of seats
    And I get check number
    And I select FOOD as category
    And I select menu item as "<Menu_Item>"
    And I select modifier as "<Modifier>"
    And I click Done to get back
    And I select menu item as "<Menu_Item1>"
    And I select modifier as "<Modifier1>"
    And I click Done to get back
    And I select menu item as "<Menu_Item2>"
    And I select modifier as "<Modifier2>"
    And I click Done to get back
    And I select menu item as "<Menu_Item3>"
    And I select modifier as "<Modifier3>"
    And I click Done to get back
    And I select menu item as "<Menu_Item4>"
    And I select modifier as "<Modifier4>"
    And I click Done to get back
    And I click Finish Order button
    Then I should get back to the Table Layout tab
    And I click Merge button
    And I select a table to be merged as "<first>"
    And I select a table to be merged as "<second>"
    And I select a table to be merged as "<third>"
    And I select a table to be merged as "<Four>"
    And I select a table to be merged as "<Five>"
    And I click Done button on the pop-up to complete merging
#    Then I should see the Linga Popup
    And I wait sometimes
    And I click Done button on the Popup
    And I click Print on the table layout screen
    And I select a table to be merged as "<first>"
#    Then I should see Receipt Printer popup
#    And I click Done button on the Popup
    And I select a table to be merged as "<first>"
    Then I should see that OrderScreen with Merge seats as "<Merge_seat>"
    And I click Payment button in the Order Management Screen
    And I click cash button from the payment method popup
    And I click Submit button on the Payment Window
   #    Then I should see the print or send receipt
#    And I click No thanks Button on the print receipt
    Then I should get back to the Table Layout tab
   # And I click power button
  #  Examples:
  #    | first |second |third | Four | Five | number_of_seats | Menu_Item | Menu_Item1 | Menu_Item2 | Menu_Item3 | Menu_Item4 | Modifier | Modifier1 | Modifier2 | Modifier3 | Modifier4 | Merge_seat |
  #    | T1    | T2   | T3   | T4  | T5  | 1               |French Friese| Garlic Bread | Tuna Tacos |Cheesy Bacon Fries | B.I. Wings | Steak | 4 BBQ | Croutons | 1/2 Cheese | Tomato  | 5           |

  #Scenario Outline: Merge 5 Check without pay (print in Order Screen)
    And I click new check button on the Table layout screen
    And I select a table to be merged as "<first>"
    And I select the number of seats as "<number_of_seats>"
    And I tap Continue to finish selecting the number of seats
    And I get check number
    And I select FOOD as category
    And I select menu item as "<Menu_Item>"
    And I select modifier as "<Modifier>"
    And I click Done to get back
    And I select menu item as "<Menu_Item1>"
    And I select modifier as "<Modifier1>"
    And I click Done to get back
    And I select menu item as "<Menu_Item2>"
    And I select modifier as "<Modifier2>"
    And I click Done to get back
    And I select menu item as "<Menu_Item3>"
    And I select modifier as "<Modifier3>"
    And I click Done to get back
    And I select menu item as "<Menu_Item4>"
    And I select modifier as "<Modifier4>"
    And I click Done to get back
    And I click Finish Order button
    Then I should get back to the Table Layout tab
    And I click new check button on the Table layout screen
    And I select a table to be merged as "<second>"
    And I select the number of seats as "<number_of_seats>"
    And I tap Continue to finish selecting the number of seats
    And I get check number
    And I select FOOD as category
    And I select menu item as "<Menu_Item>"
    And I select modifier as "<Modifier>"
    And I click Done to get back
    And I select menu item as "<Menu_Item1>"
    And I select modifier as "<Modifier1>"
    And I click Done to get back
    And I select menu item as "<Menu_Item2>"
    And I select modifier as "<Modifier2>"
    And I click Done to get back
    And I select menu item as "<Menu_Item3>"
    And I select modifier as "<Modifier3>"
    And I click Done to get back
    And I select menu item as "<Menu_Item4>"
    And I select modifier as "<Modifier4>"
    And I click Done to get back
    And I click Finish Order button
    Then I should get back to the Table Layout tab
    And I click new check button on the Table layout screen
    And I select a table to be merged as "<third>"
    And I select the number of seats as "<number_of_seats>"
    And I tap Continue to finish selecting the number of seats
    And I get check number
    And I select FOOD as category
    And I select menu item as "<Menu_Item>"
    And I select modifier as "<Modifier>"
    And I click Done to get back
    And I select menu item as "<Menu_Item1>"
    And I select modifier as "<Modifier1>"
    And I click Done to get back
    And I select menu item as "<Menu_Item2>"
    And I select modifier as "<Modifier2>"
    And I click Done to get back
    And I select menu item as "<Menu_Item3>"
    And I select modifier as "<Modifier3>"
    And I click Done to get back
    And I select menu item as "<Menu_Item4>"
    And I select modifier as "<Modifier4>"
    And I click Done to get back
    And I click Finish Order button
    Then I should get back to the Table Layout tab
    And I click new check button on the Table layout screen
    And I select a table to be merged as "<Four>"
    And I select the number of seats as "<number_of_seats>"
    And I tap Continue to finish selecting the number of seats
    And I get check number
    And I select FOOD as category
    And I select menu item as "<Menu_Item>"
    And I select modifier as "<Modifier>"
    And I click Done to get back
    And I select menu item as "<Menu_Item1>"
    And I select modifier as "<Modifier1>"
    And I click Done to get back
    And I select menu item as "<Menu_Item2>"
    And I select modifier as "<Modifier2>"
    And I click Done to get back
    And I select menu item as "<Menu_Item3>"
    And I select modifier as "<Modifier3>"
    And I click Done to get back
    And I select menu item as "<Menu_Item4>"
    And I select modifier as "<Modifier4>"
    And I click Done to get back
    And I click Finish Order button
    Then I should get back to the Table Layout tab
    And I click new check button on the Table layout screen
    And I select a table to be merged as "<Five>"
    And I select the number of seats as "<number_of_seats>"
    And I tap Continue to finish selecting the number of seats
    And I get check number
    And I select FOOD as category
    And I select menu item as "<Menu_Item>"
    And I select modifier as "<Modifier>"
    And I click Done to get back
    And I select menu item as "<Menu_Item1>"
    And I select modifier as "<Modifier1>"
    And I click Done to get back
    And I select menu item as "<Menu_Item2>"
    And I select modifier as "<Modifier2>"
    And I click Done to get back
    And I select menu item as "<Menu_Item3>"
    And I select modifier as "<Modifier3>"
    And I click Done to get back
    And I select menu item as "<Menu_Item4>"
    And I select modifier as "<Modifier4>"
    And I click Done to get back
    And I click Finish Order button
    Then I should get back to the Table Layout tab
    And I click Merge button
    And I select a table to be merged as "<first>"
    And I select a table to be merged as "<second>"
    And I select a table to be merged as "<third>"
    And I select a table to be merged as "<Four>"
    And I select a table to be merged as "<Five>"
    And I click Done button on the pop-up to complete merging
    And I wait sometimes
#    Then I should see the Linga Popup
    And I click Done button on the Popup
    And I select a table to be merged as "<first>"
    Then I Should get back to the Order Screen
    And I click print button on the order screen
#    Then I should see Receipt Printer popup
#    And I click Done button on the Popup
#    And I select a table to be merged as "<first>"
    Then I should see that OrderScreen with Merge seats as "<Merge_seat>"
    And I click Payment button in the Order Management Screen
    And I click cash button from the payment method popup
    And I click Submit button on the Payment Window
   #    Then I should see the print or send receipt
#    And I click No thanks Button on the print receipt
    Then I should get back to the Table Layout tab
  #  And I click power button
   # Examples:
   #   | first |second |third | Four | Five | number_of_seats | Menu_Item | Menu_Item1 | Menu_Item2 | Menu_Item3 | Menu_Item4 | Modifier | Modifier1 | Modifier2 | Modifier3 | Modifier4 | Merge_seat |
   #   | T1    | T2   | T3   | T4  | T5  | 1               |French Friese| Garlic Bread | Tuna Tacos |Cheesy Bacon Fries | B.I. Wings | Steak | 4 BBQ | Croutons | 1/2 Cheese | Tomato    | 5         |


 # Scenario Outline: Merge 5 Check without pay (complete the Payment and Print)
    And I click new check button on the Table layout screen
    And I select a table to be merged as "<first>"
    And I select the number of seats as "<number_of_seats>"
    And I tap Continue to finish selecting the number of seats
    And I get check number
    And I select FOOD as category
    And I select menu item as "<Menu_Item>"
    And I select modifier as "<Modifier>"
    And I click Done to get back
    And I select menu item as "<Menu_Item1>"
    And I select modifier as "<Modifier1>"
    And I click Done to get back
    And I select menu item as "<Menu_Item2>"
    And I select modifier as "<Modifier2>"
    And I click Done to get back
    And I select menu item as "<Menu_Item3>"
    And I select modifier as "<Modifier3>"
    And I click Done to get back
    And I select menu item as "<Menu_Item4>"
    And I select modifier as "<Modifier4>"
    And I click Done to get back
    And I click Finish Order button
    Then I should get back to the Table Layout tab
    And I click new check button on the Table layout screen
    And I select a table to be merged as "<second>"
    And I select the number of seats as "<number_of_seats>"
    And I tap Continue to finish selecting the number of seats
    And I get check number
    And I select FOOD as category
    And I select menu item as "<Menu_Item>"
    And I select modifier as "<Modifier>"
    And I click Done to get back
    And I select menu item as "<Menu_Item1>"
    And I select modifier as "<Modifier1>"
    And I click Done to get back
    And I select menu item as "<Menu_Item2>"
    And I select modifier as "<Modifier2>"
    And I click Done to get back
    And I select menu item as "<Menu_Item3>"
    And I select modifier as "<Modifier3>"
    And I click Done to get back
    And I select menu item as "<Menu_Item4>"
    And I select modifier as "<Modifier4>"
    And I click Done to get back
    And I click Finish Order button
    Then I should get back to the Table Layout tab
    And I click new check button on the Table layout screen
    And I select a table to be merged as "<third>"
    And I select the number of seats as "<number_of_seats>"
    And I tap Continue to finish selecting the number of seats
    And I get check number
    And I select FOOD as category
    And I select menu item as "<Menu_Item>"
    And I select modifier as "<Modifier>"
    And I click Done to get back
    And I select menu item as "<Menu_Item1>"
    And I select modifier as "<Modifier1>"
    And I click Done to get back
    And I select menu item as "<Menu_Item2>"
    And I select modifier as "<Modifier2>"
    And I click Done to get back
    And I select menu item as "<Menu_Item3>"
    And I select modifier as "<Modifier3>"
    And I click Done to get back
    And I select menu item as "<Menu_Item4>"
    And I select modifier as "<Modifier4>"
    And I click Done to get back
    And I click Finish Order button
    Then I should get back to the Table Layout tab
    And I click new check button on the Table layout screen
    And I select a table to be merged as "<Four>"
    And I select the number of seats as "<number_of_seats>"
    And I tap Continue to finish selecting the number of seats
    And I get check number
    And I select FOOD as category
    And I select menu item as "<Menu_Item>"
    And I select modifier as "<Modifier>"
    And I click Done to get back
    And I select menu item as "<Menu_Item1>"
    And I select modifier as "<Modifier1>"
    And I click Done to get back
    And I select menu item as "<Menu_Item2>"
    And I select modifier as "<Modifier2>"
    And I click Done to get back
    And I select menu item as "<Menu_Item3>"
    And I select modifier as "<Modifier3>"
    And I click Done to get back
    And I select menu item as "<Menu_Item4>"
    And I select modifier as "<Modifier4>"
    And I click Done to get back
    And I click Finish Order button
    Then I should get back to the Table Layout tab
    And I click new check button on the Table layout screen
    And I select a table to be merged as "<Five>"
    And I select the number of seats as "<number_of_seats>"
    And I tap Continue to finish selecting the number of seats
    And I get check number
    And I select FOOD as category
    And I select menu item as "<Menu_Item>"
    And I select modifier as "<Modifier>"
    And I click Done to get back
    And I select menu item as "<Menu_Item1>"
    And I select modifier as "<Modifier1>"
    And I click Done to get back
    And I select menu item as "<Menu_Item2>"
    And I select modifier as "<Modifier2>"
    And I click Done to get back
    And I select menu item as "<Menu_Item3>"
    And I select modifier as "<Modifier3>"
    And I click Done to get back
    And I select menu item as "<Menu_Item4>"
    And I select modifier as "<Modifier4>"
    And I click Done to get back
    And I click Finish Order button
    Then I should get back to the Table Layout tab
    And I click Merge button
    And I select a table to be merged as "<first>"
    And I select a table to be merged as "<second>"
    And I select a table to be merged as "<third>"
    And I select a table to be merged as "<Four>"
    And I select a table to be merged as "<Five>"
    And I click Done button on the pop-up to complete merging
    And I wait sometimes
#    Then I should see the Linga Popup
    And I click Done button on the Popup
    And I select a table to be merged as "<first>"
    Then I should see that OrderScreen with Merge seats as "<Merge_seat>"
    And I click Payment button in the Order Management Screen
    And I click cash button from the payment method popup
    And I click Submit button on the Payment Window
   #    Then I should see the print or send receipt
#    And I click No thanks Button on the print receipt
    Then I should get back to the Table Layout tab
 #   And I click power button
  #  Examples:
  #    | first |second |third | Four | Five | number_of_seats | Menu_Item | Menu_Item1 | Menu_Item2 | Menu_Item3 | Menu_Item4 | Modifier | Modifier1 | Modifier2 | Modifier3 | Modifier4 | Merge_seat |
  #    | T1    | T2   | T3   | T4| T5  | 1               |French Friese| Garlic Bread | Tuna Tacos |Cheesy Bacon Fries | B.I. Wings | Steak| 4 BBQ | Croutons | 1/2 Cheese | Tomato    | 5            |

  #Scenario Outline: Merge 5 checks- Paid checks and Without paid check
    And I click new check button on the Table layout screen
    And I select a table to be merged as "<first>"
    And I select the number of seats as "<number_of_seats>"
    And I tap Continue to finish selecting the number of seats
    And I get check number
    And I select FOOD as category
    And I select menu item as "<Menu_Item>"
    And I select modifier as "<Modifier>"
    And I click Done to get back
    And I select menu item as "<Menu_Item1>"
    And I select modifier as "<Modifier1>"
    And I click Done to get back
    And I select menu item as "<Menu_Item2>"
    And I select modifier as "<Modifier2>"
    And I click Done to get back
    And I select menu item as "<Menu_Item3>"
    And I select modifier as "<Modifier3>"
    And I click Done to get back
    And I select menu item as "<Menu_Item4>"
    And I select modifier as "<Modifier4>"
    And I click Done to get back
    And I click Payment button in the Order Management Screen
    And I click cash button from the payment method popup
    And I click the Exit button in the payment window
    And I click Finish Order button
    Then I should get back to the Table Layout tab
    And I click new check button on the Table layout screen
    And I select a table to be merged as "<second>"
    And I select the number of seats as "<number_of_seats>"
    And I tap Continue to finish selecting the number of seats
    And I get check number
    And I select FOOD as category
    And I select menu item as "<Menu_Item>"
    And I select modifier as "<Modifier>"
    And I click Done to get back
    And I select menu item as "<Menu_Item1>"
    And I select modifier as "<Modifier1>"
    And I click Done to get back
    And I select menu item as "<Menu_Item2>"
    And I select modifier as "<Modifier2>"
    And I click Done to get back
    And I select menu item as "<Menu_Item3>"
    And I select modifier as "<Modifier3>"
    And I click Done to get back
    And I select menu item as "<Menu_Item4>"
    And I select modifier as "<Modifier4>"
    And I click Done to get back
    And I click Finish Order button
    Then I should get back to the Table Layout tab
    And I click new check button on the Table layout screen
    And I select a table to be merged as "<third>"
    And I select the number of seats as "<number_of_seats>"
    And I tap Continue to finish selecting the number of seats
    And I get check number
    And I select FOOD as category
    And I select menu item as "<Menu_Item>"
    And I select modifier as "<Modifier>"
    And I click Done to get back
    And I select menu item as "<Menu_Item1>"
    And I select modifier as "<Modifier1>"
    And I click Done to get back
    And I select menu item as "<Menu_Item2>"
    And I select modifier as "<Modifier2>"
    And I click Done to get back
    And I select menu item as "<Menu_Item3>"
    And I select modifier as "<Modifier3>"
    And I click Done to get back
    And I select menu item as "<Menu_Item4>"
    And I select modifier as "<Modifier4>"
    And I click Done to get back
    And I click Finish Order button
    Then I should get back to the Table Layout tab
    And I click new check button on the Table layout screen
    And I select a table to be merged as "<Four>"
    And I select the number of seats as "<number_of_seats>"
    And I tap Continue to finish selecting the number of seats
    And I get check number
    And I select FOOD as category
    And I select menu item as "<Menu_Item>"
    And I select modifier as "<Modifier>"
    And I click Done to get back
    And I select menu item as "<Menu_Item1>"
    And I select modifier as "<Modifier1>"
    And I click Done to get back
    And I select menu item as "<Menu_Item2>"
    And I select modifier as "<Modifier2>"
    And I click Done to get back
    And I select menu item as "<Menu_Item3>"
    And I select modifier as "<Modifier3>"
    And I click Done to get back
    And I select menu item as "<Menu_Item4>"
    And I select modifier as "<Modifier4>"
    And I click Done to get back
    And I click Payment button in the Order Management Screen
    And I click cash button from the payment method popup
    And I click the Exit button in the payment window
    And I click Finish Order button
    Then I should get back to the Table Layout tab
    And I click new check button on the Table layout screen
    And I select a table to be merged as "<Five>"
    And I select the number of seats as "<number_of_seats>"
    And I tap Continue to finish selecting the number of seats
    And I get check number
    And I select FOOD as category
    And I select menu item as "<Menu_Item>"
    And I select modifier as "<Modifier>"
    And I click Done to get back
    And I select menu item as "<Menu_Item1>"
    And I select modifier as "<Modifier1>"
    And I click Done to get back
    And I select menu item as "<Menu_Item2>"
    And I select modifier as "<Modifier2>"
    And I click Done to get back
    And I select menu item as "<Menu_Item3>"
    And I select modifier as "<Modifier3>"
    And I click Done to get back
    And I select menu item as "<Menu_Item4>"
    And I select modifier as "<Modifier4>"
    And I click Done to get back
    And I click Payment button in the Order Management Screen
    And I click cash button from the payment method popup
    And I click the Exit button in the payment window
    And I click Finish Order button
    Then I should get back to the Table Layout tab
    And I click Merge button
    And I select a table to be merged as "<first>"
    And I select a table to be merged as "<second>"
    And I select a table to be merged as "<third>"
    And I select a table to be merged as "<Four>"
    And I select a table to be merged as "<Five>"
    And I click Done button on the pop-up to complete merging
    And I wait sometimes
#    Then I should see the Linga Popup
    And I click Done button on the Popup
    And I select a table to be merged as "<first>"
    Then I should see that OrderScreen with Merge seats as "<Merge_seat>"
    And I click Payment button in the Order Management Screen
    And I click cash button from the payment method popup
    And I click Submit button on the Payment Window
   #    Then I should see the print or send receipt
#    And I click No thanks Button on the print receipt
    Then I should get back to the Table Layout tab
  #  And I click power button
  #  Examples:
  #    | first |second |third | Four | Five | number_of_seats | Menu_Item | Menu_Item1 | Menu_Item2 | Menu_Item3 | Menu_Item4 | Modifier | Modifier1 | Modifier2 | Modifier3 | Modifier4 | Merge_seat |
  #    | T1    | T2   | T3   | T4  | T5  | 1               |French Friese| Garlic Bread | Tuna Tacos |Cheesy Bacon Fries | B.I. Wings | Steak | 4 BBQ | Croutons | 1/2 Cheese | Tomato    | 5         |


 # Scenario Outline: Merge 5 checks- Paid checks and Without paid check(Print in Table Layout Screen)
    And I click new check button on the Table layout screen
    And I select a table to be merged as "<first>"
    And I select the number of seats as "<number_of_seats>"
    And I tap Continue to finish selecting the number of seats
    And I get check number
    And I select FOOD as category
    And I select menu item as "<Menu_Item>"
    And I select modifier as "<Modifier>"
    And I click Done to get back
    And I select menu item as "<Menu_Item1>"
    And I select modifier as "<Modifier1>"
    And I click Done to get back
    And I select menu item as "<Menu_Item2>"
    And I select modifier as "<Modifier2>"
    And I click Done to get back
    And I select menu item as "<Menu_Item3>"
    And I select modifier as "<Modifier3>"
    And I click Done to get back
    And I select menu item as "<Menu_Item4>"
    And I select modifier as "<Modifier4>"
    And I click Done to get back
    And I click Payment button in the Order Management Screen
    And I click cash button from the payment method popup
    And I click the Exit button in the payment window
    And I click Finish Order button
    Then I should get back to the Table Layout tab
    And I click new check button on the Table layout screen
    And I select a table to be merged as "<second>"
    And I select the number of seats as "<number_of_seats>"
    And I tap Continue to finish selecting the number of seats
    And I get check number
    And I select FOOD as category
    And I select menu item as "<Menu_Item>"
    And I select modifier as "<Modifier>"
    And I click Done to get back
    And I select menu item as "<Menu_Item1>"
    And I select modifier as "<Modifier1>"
    And I click Done to get back
    And I select menu item as "<Menu_Item2>"
    And I select modifier as "<Modifier2>"
    And I click Done to get back
    And I select menu item as "<Menu_Item3>"
    And I select modifier as "<Modifier3>"
    And I click Done to get back
    And I select menu item as "<Menu_Item4>"
    And I select modifier as "<Modifier4>"
    And I click Done to get back
    And I click Finish Order button
    Then I should get back to the Table Layout tab
    And I click new check button on the Table layout screen
    And I select a table to be merged as "<third>"
    And I select the number of seats as "<number_of_seats>"
    And I tap Continue to finish selecting the number of seats
    And I get check number
    And I select FOOD as category
    And I select menu item as "<Menu_Item>"
    And I select modifier as "<Modifier>"
    And I click Done to get back
    And I select menu item as "<Menu_Item1>"
    And I select modifier as "<Modifier1>"
    And I click Done to get back
    And I select menu item as "<Menu_Item2>"
    And I select modifier as "<Modifier2>"
    And I click Done to get back
    And I select menu item as "<Menu_Item3>"
    And I select modifier as "<Modifier3>"
    And I click Done to get back
    And I select menu item as "<Menu_Item4>"
    And I select modifier as "<Modifier4>"
    And I click Done to get back
    And I click Finish Order button
    Then I should get back to the Table Layout tab
    And I click new check button on the Table layout screen
    And I select a table to be merged as "<Four>"
    And I select the number of seats as "<number_of_seats>"
    And I tap Continue to finish selecting the number of seats
    And I get check number
    And I select FOOD as category
    And I select menu item as "<Menu_Item>"
    And I select modifier as "<Modifier>"
    And I click Done to get back
    And I select menu item as "<Menu_Item1>"
    And I select modifier as "<Modifier1>"
    And I click Done to get back
    And I select menu item as "<Menu_Item2>"
    And I select modifier as "<Modifier2>"
    And I click Done to get back
    And I select menu item as "<Menu_Item3>"
    And I select modifier as "<Modifier3>"
    And I click Done to get back
    And I select menu item as "<Menu_Item4>"
    And I select modifier as "<Modifier4>"
    And I click Done to get back
    And I click Payment button in the Order Management Screen
    And I click cash button from the payment method popup
    And I click the Exit button in the payment window
    And I click Finish Order button
    Then I should get back to the Table Layout tab
    And I click new check button on the Table layout screen
    And I select a table to be merged as "<Five>"
    And I select the number of seats as "<number_of_seats>"
    And I tap Continue to finish selecting the number of seats
    And I get check number
    And I select FOOD as category
    And I select menu item as "<Menu_Item>"
    And I select modifier as "<Modifier>"
    And I click Done to get back
    And I select menu item as "<Menu_Item1>"
    And I select modifier as "<Modifier1>"
    And I click Done to get back
    And I select menu item as "<Menu_Item2>"
    And I select modifier as "<Modifier2>"
    And I click Done to get back
    And I select menu item as "<Menu_Item3>"
    And I select modifier as "<Modifier3>"
    And I click Done to get back
    And I select menu item as "<Menu_Item4>"
    And I select modifier as "<Modifier4>"
    And I click Done to get back
    And I click Payment button in the Order Management Screen
    And I click cash button from the payment method popup
    And I click the Exit button in the payment window
    And I click Finish Order button
    Then I should get back to the Table Layout tab
    And I click Merge button
    And I select a table to be merged as "<first>"
    And I select a table to be merged as "<second>"
    And I select a table to be merged as "<third>"
    And I select a table to be merged as "<Four>"
    And I select a table to be merged as "<Five>"
    And I click Done button on the pop-up to complete merging
    And I wait sometimes
#    Then I should see the Linga Popup
    And I click Done button on the Popup
    And I click Print on the table layout screen
    And I select a table to be merged as "<first>"
#    Then I should see Receipt Printer popup
#    And I click Done button on the Popup
    And I select a table to be merged as "<first>"
    Then I should see that OrderScreen with Merge seats as "<Merge_seat>"
    And I click Payment button in the Order Management Screen
    And I click cash button from the payment method popup
    And I click Submit button on the Payment Window
   #    Then I should see the print or send receipt
#    And I click No thanks Button on the print receipt
    Then I should get back to the Table Layout tab
  #  And I click power button
   # Examples:
   #   | first |second |third | Four | Five | number_of_seats | Menu_Item | Menu_Item1 | Menu_Item2 | Menu_Item3 | Menu_Item4 | Modifier | Modifier1 | Modifier2 | Modifier3 | Modifier4 | Merge_seat |
   #   | T1    | T2   | T3   | T4  | T5  | 1               |French Friese| Garlic Bread | Tuna Tacos |Cheesy Bacon Fries | B.I. Wings | Steak | 4 BBQ | Croutons | 1/2 Cheese | Tomato  | 5           |

  #Scenario Outline: Merge 5 checks- Paid checks and Without paid check(Print in Order Layout Screen)
    And I click new check button on the Table layout screen
    And I select a table to be merged as "<first>"
    And I select the number of seats as "<number_of_seats>"
    And I tap Continue to finish selecting the number of seats
    And I get check number
    And I select FOOD as category
    And I select menu item as "<Menu_Item>"
    And I select modifier as "<Modifier>"
    And I click Done to get back
    And I select menu item as "<Menu_Item1>"
    And I select modifier as "<Modifier1>"
    And I click Done to get back
    And I select menu item as "<Menu_Item2>"
    And I select modifier as "<Modifier2>"
    And I click Done to get back
    And I select menu item as "<Menu_Item3>"
    And I select modifier as "<Modifier3>"
    And I click Done to get back
    And I select menu item as "<Menu_Item4>"
    And I select modifier as "<Modifier4>"
    And I click Done to get back
    And I click Payment button in the Order Management Screen
    And I click cash button from the payment method popup
    And I click the Exit button in the payment window
    And I click Finish Order button
    Then I should get back to the Table Layout tab
    And I click new check button on the Table layout screen
    And I select a table to be merged as "<second>"
    And I select the number of seats as "<number_of_seats>"
    And I tap Continue to finish selecting the number of seats
    And I get check number
    And I select FOOD as category
    And I select menu item as "<Menu_Item>"
    And I select modifier as "<Modifier>"
    And I click Done to get back
    And I select menu item as "<Menu_Item1>"
    And I select modifier as "<Modifier1>"
    And I click Done to get back
    And I select menu item as "<Menu_Item2>"
    And I select modifier as "<Modifier2>"
    And I click Done to get back
    And I select menu item as "<Menu_Item3>"
    And I select modifier as "<Modifier3>"
    And I click Done to get back
    And I select menu item as "<Menu_Item4>"
    And I select modifier as "<Modifier4>"
    And I click Done to get back
    And I click Finish Order button
    Then I should get back to the Table Layout tab
    And I click new check button on the Table layout screen
    And I select a table to be merged as "<third>"
    And I select the number of seats as "<number_of_seats>"
    And I tap Continue to finish selecting the number of seats
    And I get check number
    And I select FOOD as category
    And I select menu item as "<Menu_Item>"
    And I select modifier as "<Modifier>"
    And I click Done to get back
    And I select menu item as "<Menu_Item1>"
    And I select modifier as "<Modifier1>"
    And I click Done to get back
    And I select menu item as "<Menu_Item2>"
    And I select modifier as "<Modifier2>"
    And I click Done to get back
    And I select menu item as "<Menu_Item3>"
    And I select modifier as "<Modifier3>"
    And I click Done to get back
    And I select menu item as "<Menu_Item4>"
    And I select modifier as "<Modifier4>"
    And I click Done to get back
    And I click Finish Order button
    Then I should get back to the Table Layout tab
    And I click new check button on the Table layout screen
    And I select a table to be merged as "<Four>"
    And I select the number of seats as "<number_of_seats>"
    And I tap Continue to finish selecting the number of seats
    And I get check number
    And I select FOOD as category
    And I select menu item as "<Menu_Item>"
    And I select modifier as "<Modifier>"
    And I click Done to get back
    And I select menu item as "<Menu_Item1>"
    And I select modifier as "<Modifier1>"
    And I click Done to get back
    And I select menu item as "<Menu_Item2>"
    And I select modifier as "<Modifier2>"
    And I click Done to get back
    And I select menu item as "<Menu_Item3>"
    And I select modifier as "<Modifier3>"
    And I click Done to get back
    And I select menu item as "<Menu_Item4>"
    And I select modifier as "<Modifier4>"
    And I click Done to get back
    And I click Payment button in the Order Management Screen
    And I click cash button from the payment method popup
    And I click the Exit button in the payment window
    And I click Finish Order button
    Then I should get back to the Table Layout tab
    And I click new check button on the Table layout screen
    And I select a table to be merged as "<Five>"
    And I select the number of seats as "<number_of_seats>"
    And I tap Continue to finish selecting the number of seats
    And I get check number
    And I select FOOD as category
    And I select menu item as "<Menu_Item>"
    And I select modifier as "<Modifier>"
    And I click Done to get back
    And I select menu item as "<Menu_Item1>"
    And I select modifier as "<Modifier1>"
    And I click Done to get back
    And I select menu item as "<Menu_Item2>"
    And I select modifier as "<Modifier2>"
    And I click Done to get back
    And I select menu item as "<Menu_Item3>"
    And I select modifier as "<Modifier3>"
    And I click Done to get back
    And I select menu item as "<Menu_Item4>"
    And I select modifier as "<Modifier4>"
    And I click Done to get back
    And I click Payment button in the Order Management Screen
    And I click cash button from the payment method popup
    And I click the Exit button in the payment window
    And I click Finish Order button
    Then I should get back to the Table Layout tab
    And I click Merge button
    And I select a table to be merged as "<first>"
    And I select a table to be merged as "<second>"
    And I select a table to be merged as "<third>"
    And I select a table to be merged as "<Four>"
    And I select a table to be merged as "<Five>"
    And I click Done button on the pop-up to complete merging
    And I wait sometimes
#    Then I should see the Linga Popup
    And I click Done button on the Popup
    And I select a table to be merged as "<first>"
    Then I should see that OrderScreen with Merge seats as "<Merge_seat>"
    And I click print button on the order screen
#    Then I should see Receipt Printer popup
#    And I click Done button on the Popup
    And I click Payment button in the Order Management Screen
    And I click cash button from the payment method popup
    And I click Submit button on the Payment Window
   #    Then I should see the print or send receipt
#    And I click No thanks Button on the print receipt
    Then I should get back to the Table Layout tab
 #   And I click power button
 #   Examples:
 #     | first |second |third | Four | Five | number_of_seats | Menu_Item | Menu_Item1 | Menu_Item2 | Menu_Item3 | Menu_Item4 | Modifier | Modifier1 | Modifier2 | Modifier3 | Modifier4 | Merge_seat |
 #     | T1    | T2   | T3   | T4  | T5  | 1               |French Friese | Garlic Bread | Tuna Tacos |Cheesy Bacon Fries | B.I. Wings | Steak| 4 BBQ | Croutons | 1/2 Cheese | Tomato  | 5           |
  #Scenario Outline: Merge 5 checks with Paid checks
    And I click new check button on the Table layout screen
    And I select a table to be merged as "<first>"
    And I select the number of seats as "<number_of_seats>"
    And I tap Continue to finish selecting the number of seats
    And I get check number
    And I select FOOD as category
    And I select menu item as "<Menu_Item>"
    And I select modifier as "<Modifier>"
    And I click Done to get back
    And I select menu item as "<Menu_Item1>"
    And I select modifier as "<Modifier1>"
    And I click Done to get back
    And I select menu item as "<Menu_Item2>"
    And I select modifier as "<Modifier2>"
    And I click Done to get back
    And I select menu item as "<Menu_Item3>"
    And I select modifier as "<Modifier3>"
    And I click Done to get back
    And I select menu item as "<Menu_Item4>"
    And I select modifier as "<Modifier4>"
    And I click Done to get back
    And I click Payment button in the Order Management Screen
    And I click cash button from the payment method popup
    And I click the Exit button in the payment window
    And I click Finish Order button
    Then I should get back to the Table Layout tab
    And I click new check button on the Table layout screen
    And I select a table to be merged as "<second>"
    And I select the number of seats as "<number_of_seats>"
    And I tap Continue to finish selecting the number of seats
    And I get check number
    And I select FOOD as category
    And I select menu item as "<Menu_Item>"
    And I select modifier as "<Modifier>"
    And I click Done to get back
    And I select menu item as "<Menu_Item1>"
    And I select modifier as "<Modifier1>"
    And I click Done to get back
    And I select menu item as "<Menu_Item2>"
    And I select modifier as "<Modifier2>"
    And I click Done to get back
    And I select menu item as "<Menu_Item3>"
    And I select modifier as "<Modifier3>"
    And I click Done to get back
    And I select menu item as "<Menu_Item4>"
    And I select modifier as "<Modifier4>"
    And I click Done to get back
    And I click Payment button in the Order Management Screen
    And I click cash button from the payment method popup
    And I click the Exit button in the payment window
    And I click Finish Order button
    Then I should get back to the Table Layout tab
    And I click new check button on the Table layout screen
    And I select a table to be merged as "<third>"
    And I select the number of seats as "<number_of_seats>"
    And I tap Continue to finish selecting the number of seats
    And I get check number
    And I select FOOD as category
    And I select menu item as "<Menu_Item>"
    And I select modifier as "<Modifier>"
    And I click Done to get back
    And I select menu item as "<Menu_Item1>"
    And I select modifier as "<Modifier1>"
    And I click Done to get back
    And I select menu item as "<Menu_Item2>"
    And I select modifier as "<Modifier2>"
    And I click Done to get back
    And I select menu item as "<Menu_Item3>"
    And I select modifier as "<Modifier3>"
    And I click Done to get back
    And I select menu item as "<Menu_Item4>"
    And I select modifier as "<Modifier4>"
    And I click Done to get back
    And I click Payment button in the Order Management Screen
    And I click cash button from the payment method popup
    And I click the Exit button in the payment window
    And I click Finish Order button
    Then I should get back to the Table Layout tab
    And I click new check button on the Table layout screen
    And I select a table to be merged as "<Four>"
    And I select the number of seats as "<number_of_seats>"
    And I tap Continue to finish selecting the number of seats
    And I get check number
    And I select FOOD as category
    And I select menu item as "<Menu_Item>"
    And I select modifier as "<Modifier>"
    And I click Done to get back
    And I select menu item as "<Menu_Item1>"
    And I select modifier as "<Modifier1>"
    And I click Done to get back
    And I select menu item as "<Menu_Item2>"
    And I select modifier as "<Modifier2>"
    And I click Done to get back
    And I select menu item as "<Menu_Item3>"
    And I select modifier as "<Modifier3>"
    And I click Done to get back
    And I select menu item as "<Menu_Item4>"
    And I select modifier as "<Modifier4>"
    And I click Done to get back
    And I click Payment button in the Order Management Screen
    And I click cash button from the payment method popup
    And I click the Exit button in the payment window
    And I click Finish Order button
    Then I should get back to the Table Layout tab
    And I click new check button on the Table layout screen
    And I select a table to be merged as "<Five>"
    And I select the number of seats as "<number_of_seats>"
    And I tap Continue to finish selecting the number of seats
    And I get check number
    And I select FOOD as category
    And I select menu item as "<Menu_Item>"
    And I select modifier as "<Modifier>"
    And I click Done to get back
    And I select menu item as "<Menu_Item1>"
    And I select modifier as "<Modifier1>"
    And I click Done to get back
    And I select menu item as "<Menu_Item2>"
    And I select modifier as "<Modifier2>"
    And I click Done to get back
    And I select menu item as "<Menu_Item3>"
    And I select modifier as "<Modifier3>"
    And I click Done to get back
    And I select menu item as "<Menu_Item4>"
    And I select modifier as "<Modifier4>"
    And I click Done to get back
    And I click Payment button in the Order Management Screen
    And I click cash button from the payment method popup
    And I click the Exit button in the payment window
    And I click Finish Order button
    Then I should get back to the Table Layout tab
    And I click Merge button
    And I select a table to be merged as "<first>"
    And I select a table to be merged as "<second>"
    And I select a table to be merged as "<third>"
    And I select a table to be merged as "<Four>"
    And I select a table to be merged as "<Five>"
    And I click Done button on the pop-up to complete merging
    And I wait sometimes
#    Then I should see the Linga Popup
    And I click Done button on the Popup
    And I select a table to be merged as "<first>"
    Then I should see that OrderScreen with Merge seats as "<Merge_seat>"
    And I click print button on the order screen
#    Then I should see Receipt Printer popup
#    And I click Done button on the Popup
    And I click Payment button in the Order Management Screen
    And I click cash button from the payment method popup
    And I click Done button on the Popup
    And I click Submit button on the Payment Window
   #    Then I should see the print or send receipt
#    And I click No thanks Button on the print receipt
    Then I should get back to the Table Layout tab
  #  And I click power button
   # Examples:
   #   | first |second |third | Four | Five | number_of_seats | Menu_Item | Menu_Item1 | Menu_Item2 | Menu_Item3 | Menu_Item4 | Modifier | Modifier1 | Modifier2 | Modifier3 | Modifier4 | Merge_seat |
   #   | T1    | T2   | T3   | T4  | T5  | 1               |French Friese| Garlic Bread | Tuna Tacos |Cheesy Bacon Fries | B.I. Wings | Steak | 4 BBQ | Croutons | 1/2 Cheese | Tomato   | 5          |

 # Scenario Outline: Merge 5 checks with Paid checks(Print in Table Layout Screen)
    And I click new check button on the Table layout screen
    And I select a table to be merged as "<first>"
    And I select the number of seats as "<number_of_seats>"
    And I tap Continue to finish selecting the number of seats
    And I get check number
    And I select FOOD as category
    And I select menu item as "<Menu_Item>"
    And I select modifier as "<Modifier>"
    And I click Done to get back
    And I select menu item as "<Menu_Item1>"
    And I select modifier as "<Modifier1>"
    And I click Done to get back
    And I select menu item as "<Menu_Item2>"
    And I select modifier as "<Modifier2>"
    And I click Done to get back
    And I select menu item as "<Menu_Item3>"
    And I select modifier as "<Modifier3>"
    And I click Done to get back
    And I select menu item as "<Menu_Item4>"
    And I select modifier as "<Modifier4>"
    And I click Done to get back
    And I click Payment button in the Order Management Screen
    And I click cash button from the payment method popup
    And I click the Exit button in the payment window
    And I click Finish Order button
    Then I should get back to the Table Layout tab
    And I click new check button on the Table layout screen
    And I select a table to be merged as "<second>"
    And I select the number of seats as "<number_of_seats>"
    And I tap Continue to finish selecting the number of seats
    And I get check number
    And I select FOOD as category
    And I select menu item as "<Menu_Item>"
    And I select modifier as "<Modifier>"
    And I click Done to get back
    And I select menu item as "<Menu_Item1>"
    And I select modifier as "<Modifier1>"
    And I click Done to get back
    And I select menu item as "<Menu_Item2>"
    And I select modifier as "<Modifier2>"
    And I click Done to get back
    And I select menu item as "<Menu_Item3>"
    And I select modifier as "<Modifier3>"
    And I click Done to get back
    And I select menu item as "<Menu_Item4>"
    And I select modifier as "<Modifier4>"
    And I click Done to get back
    And I click Payment button in the Order Management Screen
    And I click cash button from the payment method popup
    And I click the Exit button in the payment window
    And I click Finish Order button
    Then I should get back to the Table Layout tab
    And I click new check button on the Table layout screen
    And I select a table to be merged as "<third>"
    And I select the number of seats as "<number_of_seats>"
    And I tap Continue to finish selecting the number of seats
    And I get check number
    And I select FOOD as category
    And I select menu item as "<Menu_Item>"
    And I select modifier as "<Modifier>"
    And I click Done to get back
    And I select menu item as "<Menu_Item1>"
    And I select modifier as "<Modifier1>"
    And I click Done to get back
    And I select menu item as "<Menu_Item2>"
    And I select modifier as "<Modifier2>"
    And I click Done to get back
    And I select menu item as "<Menu_Item3>"
    And I select modifier as "<Modifier3>"
    And I click Done to get back
    And I select menu item as "<Menu_Item4>"
    And I select modifier as "<Modifier4>"
    And I click Done to get back
    And I click Payment button in the Order Management Screen
    And I click cash button from the payment method popup
    And I click the Exit button in the payment window
    And I click Finish Order button
    Then I should get back to the Table Layout tab
    And I click new check button on the Table layout screen
    And I select a table to be merged as "<Four>"
    And I select the number of seats as "<number_of_seats>"
    And I tap Continue to finish selecting the number of seats
    And I get check number
    And I select FOOD as category
    And I select menu item as "<Menu_Item>"
    And I select modifier as "<Modifier>"
    And I click Done to get back
    And I select menu item as "<Menu_Item1>"
    And I select modifier as "<Modifier1>"
    And I click Done to get back
    And I select menu item as "<Menu_Item2>"
    And I select modifier as "<Modifier2>"
    And I click Done to get back
    And I select menu item as "<Menu_Item3>"
    And I select modifier as "<Modifier3>"
    And I click Done to get back
    And I select menu item as "<Menu_Item4>"
    And I select modifier as "<Modifier4>"
    And I click Done to get back
    And I click Payment button in the Order Management Screen
    And I click cash button from the payment method popup
    And I click the Exit button in the payment window
    And I click Finish Order button
    Then I should get back to the Table Layout tab
    And I click new check button on the Table layout screen
    And I select a table to be merged as "<Five>"
    And I select the number of seats as "<number_of_seats>"
    And I tap Continue to finish selecting the number of seats
    And I get check number
    And I select FOOD as category
    And I select menu item as "<Menu_Item>"
    And I select modifier as "<Modifier>"
    And I click Done to get back
    And I select menu item as "<Menu_Item1>"
    And I select modifier as "<Modifier1>"
    And I click Done to get back
    And I select menu item as "<Menu_Item2>"
    And I select modifier as "<Modifier2>"
    And I click Done to get back
    And I select menu item as "<Menu_Item3>"
    And I select modifier as "<Modifier3>"
    And I click Done to get back
    And I select menu item as "<Menu_Item4>"
    And I select modifier as "<Modifier4>"
    And I click Done to get back
    And I click Payment button in the Order Management Screen
    And I click cash button from the payment method popup
    And I click the Exit button in the payment window
    And I click Finish Order button
    Then I should get back to the Table Layout tab
    And I click Merge button
    And I select a table to be merged as "<first>"
    And I select a table to be merged as "<second>"
    And I select a table to be merged as "<third>"
    And I select a table to be merged as "<Four>"
    And I select a table to be merged as "<Five>"
    And I click Done button on the pop-up to complete merging
    And I wait sometimes
#    Then I should see the Linga Popup
    And I click Done button on the Popup
    And I click Print on the table layout screen
    And I select a table to be merged as "<first>"
#    Then I should see Receipt Printer popup
#    And I click Done button on the Popup
    And I select a table to be merged as "<first>"
    Then I should see that OrderScreen with Merge seats as "<Merge_seat>"
    And I click Payment button in the Order Management Screen
    And I click cash button from the payment method popup
    And I click Done button on the Popup
    And I click Submit button on the Payment Window
   #    Then I should see the print or send receipt
#    And I click No thanks Button on the print receipt
    Then I should get back to the Table Layout tab
  #  And I click power button
   # Examples:
   #   | first |second |third | Four | Five | number_of_seats | Menu_Item | Menu_Item1 | Menu_Item2 | Menu_Item3 | Menu_Item4 | Modifier | Modifier1 | Modifier2 | Modifier3 | Modifier4 | Merge_seat |
   #   | T1    | T2    | T3   | T4   | T5   | 1               |French Friese| Garlic Bread | Tuna Tacos |Cheesy Bacon Fries | B.I. Wings | Steak | 4 BBQ | Croutons | 1/2 Cheese | Tomato | 5            |

 # Scenario Outline: Merge 5 checks with Paid checks(Print Order Screen)
    And I click new check button on the Table layout screen
    And I select a table to be merged as "<first>"
    And I select the number of seats as "<number_of_seats>"
    And I tap Continue to finish selecting the number of seats
    And I get check number
    And I select FOOD as category
    And I select menu item as "<Menu_Item>"
    And I select modifier as "<Modifier>"
    And I click Done to get back
    And I select menu item as "<Menu_Item1>"
    And I select modifier as "<Modifier1>"
    And I click Done to get back
    And I select menu item as "<Menu_Item2>"
    And I select modifier as "<Modifier2>"
    And I click Done to get back
    And I select menu item as "<Menu_Item3>"
    And I select modifier as "<Modifier3>"
    And I click Done to get back
    And I select menu item as "<Menu_Item4>"
    And I select modifier as "<Modifier4>"
    And I click Done to get back
    And I click Payment button in the Order Management Screen
    And I click cash button from the payment method popup
    And I click the Exit button in the payment window
    And I click Finish Order button
    Then I should get back to the Table Layout tab
    And I click new check button on the Table layout screen
    And I select a table to be merged as "<second>"
    And I select the number of seats as "<number_of_seats>"
    And I tap Continue to finish selecting the number of seats
    And I get check number
    And I select FOOD as category
    And I select menu item as "<Menu_Item>"
    And I select modifier as "<Modifier>"
    And I click Done to get back
    And I select menu item as "<Menu_Item1>"
    And I select modifier as "<Modifier1>"
    And I click Done to get back
    And I select menu item as "<Menu_Item2>"
    And I select modifier as "<Modifier2>"
    And I click Done to get back
    And I select menu item as "<Menu_Item3>"
    And I select modifier as "<Modifier3>"
    And I click Done to get back
    And I select menu item as "<Menu_Item4>"
    And I select modifier as "<Modifier4>"
    And I click Done to get back
    And I click Payment button in the Order Management Screen
    And I click cash button from the payment method popup
    And I click the Exit button in the payment window
    And I click Finish Order button
    Then I should get back to the Table Layout tab
    And I click new check button on the Table layout screen
    And I select a table to be merged as "<third>"
    And I select the number of seats as "<number_of_seats>"
    And I tap Continue to finish selecting the number of seats
    And I get check number
    And I select FOOD as category
    And I select menu item as "<Menu_Item>"
    And I select modifier as "<Modifier>"
    And I click Done to get back
    And I select menu item as "<Menu_Item1>"
    And I select modifier as "<Modifier1>"
    And I click Done to get back
    And I select menu item as "<Menu_Item2>"
    And I select modifier as "<Modifier2>"
    And I click Done to get back
    And I select menu item as "<Menu_Item3>"
    And I select modifier as "<Modifier3>"
    And I click Done to get back
    And I select menu item as "<Menu_Item4>"
    And I select modifier as "<Modifier4>"
    And I click Done to get back
    And I click Payment button in the Order Management Screen
    And I click cash button from the payment method popup
    And I click the Exit button in the payment window
    And I click Finish Order button
    Then I should get back to the Table Layout tab
    And I click new check button on the Table layout screen
    And I select a table to be merged as "<Four>"
    And I select the number of seats as "<number_of_seats>"
    And I tap Continue to finish selecting the number of seats
    And I get check number
    And I select FOOD as category
    And I select menu item as "<Menu_Item>"
    And I select modifier as "<Modifier>"
    And I click Done to get back
    And I select menu item as "<Menu_Item1>"
    And I select modifier as "<Modifier1>"
    And I click Done to get back
    And I select menu item as "<Menu_Item2>"
    And I select modifier as "<Modifier2>"
    And I click Done to get back
    And I select menu item as "<Menu_Item3>"
    And I select modifier as "<Modifier3>"
    And I click Done to get back
    And I select menu item as "<Menu_Item4>"
    And I select modifier as "<Modifier4>"
    And I click Done to get back
    And I click Payment button in the Order Management Screen
    And I click cash button from the payment method popup
    And I click the Exit button in the payment window
    And I click Finish Order button
    Then I should get back to the Table Layout tab
    And I click new check button on the Table layout screen
    And I select a table to be merged as "<Five>"
    And I select the number of seats as "<number_of_seats>"
    And I tap Continue to finish selecting the number of seats
    And I get check number
    And I select FOOD as category
    And I select menu item as "<Menu_Item>"
    And I select modifier as "<Modifier>"
    And I click Done to get back
    And I select menu item as "<Menu_Item1>"
    And I select modifier as "<Modifier1>"
    And I click Done to get back
    And I select menu item as "<Menu_Item2>"
    And I select modifier as "<Modifier2>"
    And I click Done to get back
    And I select menu item as "<Menu_Item3>"
    And I select modifier as "<Modifier3>"
    And I click Done to get back
    And I select menu item as "<Menu_Item4>"
    And I select modifier as "<Modifier4>"
    And I click Done to get back
    And I click Payment button in the Order Management Screen
    And I click cash button from the payment method popup
    And I click the Exit button in the payment window
    And I click Finish Order button
    Then I should get back to the Table Layout tab
    And I click Merge button
    And I select a table to be merged as "<first>"
    And I select a table to be merged as "<second>"
    And I select a table to be merged as "<third>"
    And I select a table to be merged as "<Four>"
    And I select a table to be merged as "<Five>"
    And I click Done button on the pop-up to complete merging
    And I wait sometimes
#    Then I should see the Linga Popup
    And I click Done button on the Popup
    And I select a table to be merged as "<first>"
    Then I should see that OrderScreen with Merge seats as "<Merge_seat>"
    And I click print button on the order screen
#    Then I should see Receipt Printer popup
#    And I click Done button on the Popup
    And I click Payment button in the Order Management Screen
    And I click cash button from the payment method popup
    And I click Done button on the Popup
    And I click Submit button on the Payment Window
   #    Then I should see the print or send receipt
#    And I click No thanks Button on the print receipt
    Then I should get back to the Table Layout tab
    And I click power button
    Examples:
      | first |second |third | Four | Five | number_of_seats | Menu_Item   | Menu_Item1   | Menu_Item2 | Menu_Item3         | Menu_Item4 | Modifier | Modifier1 | Modifier2 | Modifier3  | Modifier4 | Merge_seat |
      | T1    | T2    | T3   | T4   | T5   | 1               |French Friese| Garlic Bread | Tuna Tacos | Cheesy Bacon Fries | B.I. Wings | Steak    | 4 BBQ     | Croutons  | 1/2 Cheese | Tomato    | 5          |


  Scenario Outline: Check whether the gratuity amount show correctly when both the seats are placed with inclusive tax menu items and gratuity applied
    And I click new check button on the Table layout screen
    And I select table as "<table_no>"
    And I select the number of seats as "<number_of_seats>"
    And I tap Continue to finish selecting the number of seats
    Then I Should get back to the Order Screen
    And I get check number
    And I select Pasta as category
    And I select menu item as RavioliPesto for Item Based Inclusive Tax
    And I select modifier as "<Modifier1>"
    And I click Done to get back
    And I click seat 2 for add menu item
    And I select Pasta as category
    And I select menu item as RavioliPesto for Item Based Inclusive Tax
    And I select modifier as "<Modifier1>"
    And I click Done to get back
    And I click table number on the Order Screen as "<table_no>"
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
    And I click Cash button for Complete Sale
    And I click Exact button on the cash pop-up
    And I click Enter Button on the cash pop-up
#    Then I should see the print or send receipt
#    And I click No thanks Button on the print receipt
    Then I should get back to the Table Layout tab
    #And I click power button
   # Examples:
    #  | table_no | number_of_seats | Modifier |SubTotal   |  Tax     | Gratuity | Total  |
     # | T6       | 2              | Butter    |TL 3.800,00|TL 345,46 |TL 345,46 | TL 4.145,46 |

  #Scenario Outline: Check whether the menu item are missing in the split screen or not
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
    And I click seat 2 for add menu item
    And I select FOOD as category
    And I select menu item as "<Menu_Item>"
    And I select modifier as "<Modifier>"
    And I click Done to get back
    And I click seat 3 for add menu item
    And I select FOOD as category
    And I select menu item as "<Menu_Item>"
    And I select modifier as "<Modifier>"
    And I click Done to get back
    And I click the split seat from Order screen

    Then I should see the Split Screen
    And I click seat one on the split screen
    And I click seat two on the split screen
    And I click Pay Button in Split Screen
    Then I should see Select any one seat/check for payment in popup
    And I click Done button on the Popup
    And I click the Group Seats button in the Split Seat
    Then I should see selected seat item should club into one seat
    And I click the save & close button on the split screen
    And I click Void button on order management screen
    Then I should see All orders are voided
    And I click Done button on the Popup
    And I click All
    And I click Table Layout tab
    And I click power button
    Examples:
      | table_no | number_of_seats |Menu_Item      | Modifier |  Modifier1 |SubTotal   |  Tax     | Gratuity | Total   |
      | T8       | 3               | French Friese | Steak    | Butter     |$ 30.00    |$ 2.72    |$ 2.72    | $ 32.72 |


  Scenario Outline: Replace Customers
    And I click new check button on the Table layout screen
    And I select table as "<table_no>"
    And I select the number of seats as "<number_of_seats>"
    And I tap Continue to finish selecting the number of seats
    And I get check number
    And I click Add Customer Button
    And I search for "<customer_name>"
    When I click "Ragavan P" to select customer for the seat
    Then I should see customer as "<customer>" added on order screen
    And I click Add Customer Button
    Then I should see the add customer window
    And I search for "<customer_name1>"
    When I click "<customer_name1>" to select customer for the seat
    Then I should see customer as "<customer1>" added on order screen
    And I click Add Customer Button
    And I click remove button
    Then I should see the add customer window
    And I click x button on the Add customer window
    And I click All
    And I click Table Layout tab
    #And I click power button
   # Examples:
    #  | table_no | number_of_seats |customer_name | customer| customer_name1 | customer1 |
     # | T6          |1              | Auto ragav  | Auto r  | auto number1  | auto n    |

 # Scenario Outline:Remove Customer
    And I click new check button on the Table layout screen
    And I select table as "<table_no>"
    And I select the number of seats as "<number_of_seats>"
    And I tap Continue to finish selecting the number of seats
    And I get check number
    And I click Add Customer Button
    And I search for "<customer_name>"
    When I click "Ragavan P" to select customer for the seat
    Then I should see customer as "<customer>" added on order screen
    And I click Add Customer Button
    Then I should see the add customer window
    And I click remove button
    And I click x button on the Add customer window
    Then I should see customer removed
    And I click All
    And I click Table Layout tab
    And I click power button
    Examples:
      | table_no | number_of_seats |customer_name  | customer   | customer_name1 | customer1 |
      | T6       |1                | Ragavan P     | Ragavan P  |  auto number1  | auto n    |


  Scenario Outline: Customer Profile From order screen
    And I click new check button on the Table layout screen
    And I select table as "<table_no>"
    And I select the number of seats as "<number_of_seats>"
    And I tap Continue to finish selecting the number of seats
    And I get check number
    And I click Add Customer Button
  Then I should see the add customer window
  And I click By Name Email Button
  And I click add customer button from the Add customer window
  Then I should see the customer profile window
  And I closed customer profile window1

#  When I click "Ragavan P" to select customer for the seat
#  Then I should see customer as "<customer>" added on order screen
#    And I click Add new button
#    Then I should see the customer profile window
#    And I click the Save button
#    Then I should see enter email or mobile number popup
#    And I click Done button on the Popup
#    And I closed customer profile window
    Then I Should get back to the Order Screen
    And I click All
    And I click Table Layout tab
   # And I click power button
   # Examples:
   #   | table_no | number_of_seats |
  #    | T6          |1             |

 # Scenario Outline: Table should not change into seated status
    And I click new check button on the Table layout screen
    And I select table as "<table_no>"
    And I select the number of seats as "<number_of_seats>"
    And I tap Continue to finish selecting the number of seats
    Then I Should get back to the Order Screen
    And I get check number
    When I click Finish button
    Then I should get back to the Table Layout tab
#    Then I should see seated status is not change
    And I click power button
    Examples:
      | table_no | number_of_seats |
      | T6       |1                |


  Scenario Outline: Check Down
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
    And I click Order button in the order management screen
    And I click print button on the order screen
#    Then I should see Receipt Printer popup
#    And I click Done button on the Popup
    When I click Finish button
    Then I should get back to the Table Layout tab
    Then I should see check down is increased
    And I select table as "<table_no>"
    Then I Should get back to the Order Screen
    And I click Void button on order management screen
    Then I should see the void reason popup
    And I click void Reason on the void popup
    And I click Add Button on the void reason popup
#    Then I should see Receipt Printer popup
#    And I click Done button on the Popup
    Then I should get back to the Table Layout tab
    And I click power button
    Examples:
      | table_no | number_of_seats | Menu_Item     | Modifier |
      | T6       |1                | French Friese | Tomato   |


  Scenario Outline: Print - Table Layout Screen
    And I click new check button on the Table layout screen
    And I select table as "<table_no>"
    And I select the number of seats as "<number_of_seats>"
    And I tap Continue to finish selecting the number of seats
    And I get check number
    And I select FOOD as category
    And I select menu item as "<Menu_Item>"
    And I select modifier as "<Modifier>"
    And I click Done to get back
    And I click Order button in the order management screen
    And I click Finish Order button
    Then I should get back to the Table Layout tab
    And I click Print on the table layout screen
    And I click the check from the table layout for merged
#    Then I should see Receipt Printer popup
#    And I click Done button on the Popup
##    And I click X Button
    And I click the check from the table layout for merged
    Then I Should get back to the Order Screen
    And I click Cash button for Complete Sale
    And I click Exact button on the cash pop-up
    And I click Enter Button on the cash pop-up
   #    Then I should see the print or send receipt
#    And I click No thanks Button on the print receipt
    Then I should get back to the Table Layout tab
    #And I click power button
    #Examples:
    #  | table_no | number_of_seats | Menu_Item | Modifier |
   #   | T8          |1              | French Friese | Tomato|

  #Scenario Outline: Print All Split Screen
    And I click new check button on the Table layout screen
    And I select table as "<table_no>"
    And I select the number of seats as "<number_of_seats>"
    And I tap Continue to finish selecting the number of seats
    And I get check number
    And I select FOOD as category
    And I select menu item as "<Menu_Item>"
    And I select modifier as "<Modifier>"
    And I click Done to get back
    And I click the split seat from Order screen
    Then I should see the Split Screen
    And I click Add Button to create Seat
    Then I should see created new seat
    And I click Split Evenly Button
    Then I should see menu items has to be sent to the kitchen
    And I click Yes button on send to kitchen popup
    Then I should see Seperate Item is Disable
    Then I should see the additional seat & Item on the Split Seat
    And I click print All button in the split seat screen
#    Then I should see Receipt Printer popup
#    And I click Done button on the Popup
    And I click the save & close button on the split screen
    Then I Should get back to the Order Screen
    And I click Cash button for Complete Sale
    And I click Exact button on the cash pop-up
    And I click Enter Button on the cash pop-up
   #    Then I should see the print or send receipt
#    And I click No thanks Button on the print receipt
    Then I should get back to the Table Layout tab
   # And I click power button
    #Examples:
     # | table_no | number_of_seats | Menu_Item | Modifier |
     # | T9         |1              | French Friese | Steak  |

  #Scenario Outline: Print one seat from Table layout screen
    And I click new check button on the Table layout screen
    And I select table as "<table_no>"
    And I select the number of seats as "<number_of_seats>"
    And I tap Continue to finish selecting the number of seats
    And I get check number
    And I select FOOD as category
    And I select menu item as "<Menu_Item>"
    And I select modifier as "<Modifier>"
    And I click Done to get back
    And I click the split seat from Order screen
    Then I should see the Split Screen
    And I click seat one on the split screen
    And I click print button in the split seat screen
    Then I should see item need to send to kitchen popup
    And I click Yes button on send to kitchen popup
#    Then I should see Receipt Printer popup
#    And I click Done button on the Popup
    And I click the save & close button on the split screen
    Then I Should get back to the Order Screen
    And I click Cash button for Complete Sale
    And I click Exact button on the cash pop-up
    And I click Enter Button on the cash pop-up
   #    Then I should see the print or send receipt
#    And I click No thanks Button on the print receipt
    Then I should get back to the Table Layout tab
    #And I click power button
    #Examples:
   #   | table_no | number_of_seats | Menu_Item     | Modifier |
  #    | T8       |2                | French Friese | Steak    |

 # Scenario Outline: Print Split screen, click Back on split screen
    And I click new check button on the Table layout screen
    And I select table as "<table_no>"
    And I select the number of seats as "<number_of_seats>"
    And I tap Continue to finish selecting the number of seats
    And I get check number
    And I select FOOD as category
    And I select menu item as "<Menu_Item>"
    And I select modifier as "<Modifier>"
    And I click Done to get back
    And I click the split seat from Order screen
    Then I should see the Split Screen
    And I click Add Button to create Seat
    Then I should see created new seat
    And I click Split Evenly Button
    Then I should see menu items has to be sent to the kitchen
    And I click Yes button on send to kitchen popup
    Then I should see Seperate Item is Disable
    Then I should see the additional seat & Item on the Split Seat
    And I click print All button in the split seat screen
#    Then I should see Receipt Printer popup
#    And I click Done button on the Popup
    And I click Start Over Button to come back original stage
    And I click the Back button on Split Screen
    Then I Should get back to the Order Screen
    And I click Cash button for Complete Sale
    And I click Exact button on the cash pop-up
    And I click Enter Button on the cash pop-up
   #    Then I should see the print or send receipt
#    And I click No thanks Button on the print receipt
    Then I should get back to the Table Layout tab
    And I click power button
    Examples:
      | table_no | number_of_seats | Menu_Item     | Modifier |
      | T28      |1                | French Friese | Tomato   |


  Scenario Outline: New Check
    And I click new check button on the Table layout screen
    And I select table as "<table_no>"
    And I select the number of seats as "<number_of_seats>"
    And I tap Continue to finish selecting the number of seats

    And I should see that OrderScreen
    And I get check number
    Then I should see as "<number_of_seats>" on the order screen
    And I click All
    And I click Table Layout tab
    #And I click power button
   # Examples:
    #  |table_no|number_of_seats|
   #   |T9      |2              |

  #Scenario Outline: Multiple checks
    And I click new check button on the Table layout screen
    And I select table as "<table_no>"
    And I select the number of seats as "<number_of_seats>"
    And I tap Continue to finish selecting the number of seats
    And I get check number
    And I select FOOD as category
    And I select menu item as "<Menu_Item>"
    And I select modifier as "<Modifier>"
    And I click Done to get back
    And I click Finish Order button
    Then I should get back to the Table Layout tab
    And I click new check button on the Table layout screen
    And I select table as "<table_no>"
    And I select the number of seats as "<number_of_seats>"
    And I tap Continue to finish selecting the number of seats
    And I get check number
    And I select FOOD as category
    And I select menu item as "<Menu_Item>"
    And I select modifier as "<Modifier>"
    And I click Done to get back
    And I click Payment button in the Order Management Screen
    And I click cash button from the payment method popup
    And I click the Exit button in the payment window
    And I click Finish Order button
    Then I should get back to the Table Layout tab and see the table as seated
    Then I should see mulitiple check change on Table layout screen
    And I click the check from the table layout for merged
    And I Should get back to the Order Screen
    And I click Payment button in the Order Management Screen
#    And I click cash button from the payment method popup
    And I click Submit button on the Payment Window
   #    Then I should see the print or send receipt
#    And I click No thanks Button on the print receipt
    Then I should get back to the Table Layout tab
#    And I select table as "<table_no>"
#    And I click Payment button in the Order Management Screen
#    And I click Submit button on the Payment Window
   #    Then I should see the print or send receipt
#    And I click No thanks Button on the print receipt
#    Then I should get back to the Table Layout tab
   # And I click power button
    #Examples:
  #    |table_no|number_of_seats| Menu_Item | Modifier |
   #   |T11      |1              | Garlic Bread | 4 BBQ |


 # Scenario Outline: Cash On - Empty Checks
    And I click new check button on the Table layout screen
    And I select table as "<table_no>"
    And I select the number of seats as "<number_of_seats>"
    And I tap Continue to finish selecting the number of seats
    And I get check number
    And I click Cash button for Complete Sale
    Then I should see You need to order before you paying popup
    And I click Done button on the Popup
    And I click All
    And I click Table Layout tab
    And I click power button
    Examples:
      |table_no|number_of_seats| Menu_Item    | Modifier|
      |T22     |1              | Garlic Bread | 4 BBQ   |


  Scenario Outline: Creating a table order for 2 and then add & delete a seat, select menu items to order for each seats and then finish order
    And I click new check button on the Table layout screen
    And I select table as "<table_no>"
    And I select the number of seats as "<number_of_seats>"
    And I tap Continue to finish selecting the number of seats
    And I get check number
    And I add a new seat
    And I delete the seat
    And I select seat one
    And I click Add Customer Button
    And I search for "<customer_name>"
    When I click "Ragavan P" to select customer for the seat
    And I select FOOD as category
    And I select menu item as "<menu_item_1>"
    And I select modifier as "<modifier_1>"
    And I select modifier as "<modifier_2>"
    And I click Done to get back
    And I select seat two
    And I select FOOD as category
    And I select menu item as "<menu_item_2>"
    And I select modifier as "<modifier_3>"
    And I click Done to get back
    When I click Finish Order button
    Then I should get back to the Table Layout tab
    When I click the check from the table layout
    Then I should see "<menu_item_1>" with modifiers "<modifier_1>" and "<modifier_2>" and "<menu_item_2>" with modifier "<modifier_3>"
    And I click Cash button for Complete Sale
    And I click Exact button on the cash pop-up
    And I click Enter Button on the cash pop-up
   #    Then I should see the print or send receipt
#    And I click No thanks Button on the print receipt
    Then I should get back to the Table Layout tab
    And I click power button
    Examples:
      | table_no | number_of_seats | customer_name | menu_item_1   | menu_item_2   | modifier_1 | modifier_2 | modifier_3 |
      | T13      | 2               | Ragavan P     | French Friese |  Garlic Bread | Steak      | Tomato     | 4 BBQ      |


  Scenario Outline: Creating another table order to be merged
    And I click new check button on the Table layout screen
    And I select table as "<table_no>"
    And I select the number of seats as "<number_of_seats>"
    And I tap Continue to finish selecting the number of seats
    And I get check number
    And I select FOOD as category
    And I select menu item as "<Menu_Item>"
    And I select modifier as "<Modifier>"
    And I click Done to get back
    When I click Finish Order button
    Then I should get back to the Table Layout tab
    When I click on table "<table_no>"
    And I click Cash button for Complete Sale
    And I click Exact button on the cash pop-up
    And I click Enter Button on the cash pop-up
   #    Then I should see the print or send receipt
#    And I click No thanks Button on the print receipt
    Then I should get back to the Table Layout tab
    And I click power button
    Examples:
      | table_no | number_of_seats | Menu_Item          | Modifier   |
      | T11      | 1               | Cheesy Bacon Fries | 1/2 Cheese |


  Scenario Outline: Create 2 Table Order then Merge and Click already selected Check to see "Check already added" pop-up
    And I click new check button on the Table layout screen
    And I select table as "<table_no>"
    And I select the number of seats as "<number_of_seats>"
    And I tap Continue to finish selecting the number of seats
    And I get check number
    And I select FOOD as category
    And I select menu item as "<Menu_Item>"
    And I select modifier as "<Modifier>"
    And I click Done to get back
    And I click Finish Order button
    Then I should get back to the Table Layout tab
    And I click new check button on the Table layout screen
    And I select second table to be merged as "<second_table>"
    And I select the number of seats as "<number_of_seats>"
    And I tap Continue to finish selecting the number of seats
    And I get check number1
    And I select FOOD as category
    And I select menu item as "<Menu_Item1>"
    And I select modifier as "<Modifier1>"
    And I click Done to get back
    And I click Finish Order button
    Then I should get back to the Table Layout tab
    And I click Merge button
#    And I select table as "<table_no>"
    And I click the check from the table layout for merged
#    And I select second table to be merged as "<second_table>"
    And I click the check from the table layout for merged1
    And I click the check from the table layout for merged
#    And I click already selected table as "<table_no>"
    Then I should see Check already added pop-up message
    And I click Done button on the Popup1
    And I click cancel button on the pop-up for disappear merge box
    And I select table as "<table_no>"
    And I click Cash button for Complete Sale
    And I click Exact button on the cash pop-up
    And I click Enter Button on the cash pop-up
   #    Then I should see the print or send receipt
#    And I click No thanks Button on the print receipt
    Then I should get back to the Table Layout tab
    And I select table as "<second_table>"
    And I click Cash button for Complete Sale
    And I click Exact button on the cash pop-up
    And I click Enter Button on the cash pop-up
   #    Then I should see the print or send receipt
#    And I click No thanks Button on the print receipt
    Then I should get back to the Table Layout tab
    And I click power button
    Examples:
      | table_no | number_of_seats | Menu_Item          | Modifier   |second_table  | number_of_seats | Menu_Item1   | Modifier1 |
      | T15      |1                | Cheesy Bacon Fries | 1/2 Cheese | T16          |1                | Garlic Bread | 4 BBQ     |


  Scenario Outline: Create 2 Table Order then Merge 1 Order click Done to see "Select Atleast 2 Check" pop-up
    And I click new check button on the Table layout screen
    And I select table as "<table_no>"
    And I select the number of seats as "<number_of_seats>"
    And I tap Continue to finish selecting the number of seats
    And I get check number
    And I select FOOD as category
    And I select menu item as "<Menu_Item>"
    And I select modifier as "<Modifier>"
    And I click Done to get back
    And I click Finish Order button
    Then I should get back to the Table Layout tab
    And I click new check button on the Table layout screen
    And I select second table to be merged as "<second_table>"
    And I select the number of seats as "<number_of_seats>"
    And I tap Continue to finish selecting the number of seats
    And I get check number1
    And I select FOOD as category
    And I select menu item as "<Menu_Item1>"
    And I select modifier as "<Modifier1>"
    And I click Done to get back
    And I click Finish Order button
    Then I should get back to the Table Layout tab
    And I click Merge button
    And I click the check from the table layout for merged
    And I click Done button on the pop-up to complete merging
    Then I should see select at least 2 checks
     And I click Done button on the Popup from Table Layout
    And I click cancel button on the table layout screen
    And I click the check from the table layout for merged
#    And I select table as "<table_no>"
    Then I Should get back to the Order Screen
    And I click Cash button for Complete Sale
    And I click Exact button on the cash pop-up
    And I click Enter Button on the cash pop-up
   #    Then I should see the print or send receipt
#    And I click No thanks Button on the print receipt
    Then I should get back to the Table Layout tab
    And I click the check from the table layout for merged1
#    And I select second table to be merged as "<second_table>"
    Then I Should get back to the Order Screen
    And I click Cash button for Complete Sale
    And I click Exact button on the cash pop-up
    And I click Enter Button on the cash pop-up
   #    Then I should see the print or send receipt
#    And I click No thanks Button on the print receipt
    Then I should get back to the Table Layout tab
    And I click power button
    Examples:
      | table_no | number_of_seats | Menu_Item  | Modifier | second_table | number_of_seats | Menu_Item1   | Modifier1 |
      | T8       |1                | B.I. Wings | Tomato   | T9           |1                | Garlic Bread | 4 BBQ     |


  Scenario Outline: Create 2 Table Order then Merge after that click Cancel button should merge box disappered
    And I click new check button on the Table layout screen
    And I select table as "<table_no>"
    And I select the number of seats as "<number_of_seats>"
    And I tap Continue to finish selecting the number of seats
    And I get check number
    And I select FOOD as category
    And I select menu item as "<Menu_Item>"
    And I select modifier as "<Modifier>"
    And I click Done to get back
    And I click Finish Order button
    Then I should get back to the Table Layout tab
    And I click new check button on the Table layout screen
    And I select second table to be merged as "<second_table>"
    And I select the number of seats as "<number_of_seats>"
    And I tap Continue to finish selecting the number of seats
    And I get check number1
    And I select FOOD as category
    And I select menu item as "<Menu_Item1>"
    And I select modifier as "<Modifier1>"
    And I click Done to get back
    And I click Finish Order button
    Then I should get back to the Table Layout tab
    And I click Merge button
    And I click the check from the table layout for merged
    And I click the check from the table layout for merged1
    Then I click cancel button on the pop-up for disappear merge box
    And I click the check from the table layout for merged
    And I click Cash button for Complete Sale
    And I click Exact button on the cash pop-up
    And I click Enter Button on the cash pop-up
   #    Then I should see the print or send receipt
#    And I click No thanks Button on the print receipt
    Then I should get back to the Table Layout tab
    And I click the check from the table layout for merged1
    Then I Should get back to the Order Screen
    And I click Cash button for Complete Sale
    And I click Exact button on the cash pop-up
    And I click Enter Button on the cash pop-up
   #    Then I should see the print or send receipt
#    And I click No thanks Button on the print receipt
    Then I should get back to the Table Layout tab
    And I click power button
    Examples:
      | table_no | number_of_seats | Menu_Item  | Modifier | second_table | number_of_seats | Menu_Item1   | Modifier1 |
      | T10      |1                | Tuna Tacos | Croutons | T11          |1                | Garlic Bread | 4 BBQ     |


  Scenario Outline: Create Sale in Table Layout Screen then click the Split to see Split Screen
    And I click new check button on the Table layout screen
    And I select table as "<table_no>"
    And I select the number of seats as "<number_of_seats>"
    And I tap Continue to finish selecting the number of seats
    And I get check number
    And I select FOOD as category
    And I select menu item as "<Menu_Item>"
    And I select modifier as "<Modifier>"
    And I click Done to get back
    And I click Finish Order button
    Then I should get back to the Table Layout tab
    And I click the Split Button from the Table Layout Screen
    When I click the Split By Seat on the Pop-up
    And I click the check from the table layout
    Then I should see the Split Screen
    And I click the save & close button on the split screen
    Then I Should get back to the Order Screen
    And I click Void button on order management screen
    And I click void Reason on the void popup
    And I click Add Button on the void reason popup
#    Then I should see Receipt Printer popup
#    And I click Done button on the Popup
    Then I should get back to the Table Layout tab
    And I click power button
    Examples:
      | table_no | number_of_seats | Menu_Item  | Modifier |
      | T17       |1                | B.I. Wings | Tomato   |



  Scenario Outline: Split Check Without Sale
    And I click new check button on the Table layout screen
    And I click the Split Button from the Table Layout Screen
    When I click the Split By Seat on the Pop-up
    And I click an unvalid check "T7"
    Then I should see select Valid Check pop-up
    And I click Done button on the Popup
    #And I click power button
   # Examples:
    #  | unvalid_check |
     # |T8            |

 # Scenario Outline: Split - Seperate Icon
    And I click new check button on the Table layout screen
    And I select table as "<table_no>"
    And I select the number of seats as "<number_of_seats>"
    And I tap Continue to finish selecting the number of seats
    And I get check number
    And I select FOOD as category
    And I select menu item as "<Menu_Item>"
    And I select modifier as "<Modifier>"
    And I click Done to get back
    And I click Finish Order button
    Then I should get back to the Table Layout tab
    And I click the Split Button from the Table Layout Screen
    When I click the Split By Seat on the Pop-up
    And I click the check from the table layout
    Then I should see the Split Screen
    And I click on item
    And I click Seperate item button
    And I select the number of split item "<number_of_split>"
    And I click the Continue button
    Then I Should see Split Evenly is Disable
    And I click the Back button on Split Screen
    Then I should see the Changes made in split save and close pop-up
    And I click Done button on the Popup
    And I click the save & close button on the split screen
    Then I Should get back to the Order Screen
    And I click Cash button for Complete Sale
    And I click Exact button on the cash pop-up
    And I click Enter Button on the cash pop-up
   #    Then I should see the print or send receipt
#    And I click No thanks Button on the print receipt
    Then I should get back to the Table Layout tab
    #And I click power button
   # Examples:
  #    | table_no | number_of_seats | Menu_Item | Modifier | number_of_split |
    #  | T10          |1              | French Friese | Steak  | 2          |

 # Scenario Outline: Split - Without Select item to Seperate Item
    And I click new check button on the Table layout screen
    And I select table as "<table_no>"
    And I select the number of seats as "<number_of_seats>"
    And I tap Continue to finish selecting the number of seats
    And I get check number
    And I select FOOD as category
    And I select menu item as "<Menu_Item>"
    And I select modifier as "<Modifier>"
    And I click Done to get back
    And I click Finish Order button
    Then I should get back to the Table Layout tab
    And I click the Split Button from the Table Layout Screen
    When I click the Split By Seat on the Pop-up
    And I click the check from the table layout
    Then I should see the Split Screen
    And I click Seperate item button
    Then I should see Select the Order to Proceed Popup
    And I click Done button on the Popup
    And I click the save & close button on the split screen
    Then I Should get back to the Order Screen
    And I click Cash button for Complete Sale
    And I click Exact button on the cash pop-up
    And I click Enter Button on the cash pop-up
   #    Then I should see the print or send receipt
#    And I click No thanks Button on the print receipt
    Then I should get back to the Table Layout tab
    #And I click power button
    #Examples:
    #  | table_no | number_of_seats | Menu_Item | Modifier |
   #   | T7          |1              | French Friese | Tomato |

  #Scenario Outline: Split-Add
    And I click new check button on the Table layout screen
    And I select table as "<table_no>"
    And I select the number of seats as "<number_of_seats>"
    And I tap Continue to finish selecting the number of seats
    And I get check number
    And I select FOOD as category
    And I select menu item as "<Menu_Item>"
    And I select modifier as "<Modifier>"
    And I click Done to get back
    And I click Finish Order button
    Then I should get back to the Table Layout tab
    And I click the Split Button from the Table Layout Screen
    When I click the Split By Seat on the Pop-up
    And I click the check from the table layout
    Then I should see the Split Screen
    And I click Add Button to create Seat
    Then I should see created new seat
    And I click the save & close button on the split screen
    Then I Should get back to the Order Screen
    And I click Cash button for Complete Sale
    And I click Exact button on the cash pop-up
    And I click Enter Button on the cash pop-up
   #    Then I should see the print or send receipt
#    And I click No thanks Button on the print receipt
    Then I should get back to the Table Layout tab
   # And I click power button
    #Examples:
     # | table_no | number_of_seats | Menu_Item | Modifier |
      #| T8          |1              | French Friese | Steak  |

 #Scenario Outline: Split Screen - Do Seperate Item, Split Evenly, Group Seats by click START OVER to should come back original stage of all scenarios
    And I click new check button on the Table layout screen
    And I select table as "<table_no>"
    And I select the number of seats as "<number_of_seats>"
    And I tap Continue to finish selecting the number of seats
    And I get check number
    And I select FOOD as category
    And I select menu item as "<Menu_Item>"
    And I select modifier as "<Modifier>"
    And I click Done to get back
    And I click Finish Order button
    Then I should get back to the Table Layout tab
    And I click the Split Button from the Table Layout Screen
    When I click the Split By Seat on the Pop-up
    #ok

    And I click the check from the table layout
    Then I should see the Split Screen
    And I click on item
    And I click Seperate item button
    And I select the number of split item "<number_of_split>"
    And I click the Continue button
    Then I Should see Split Evenly is Disable
    Then I click Start Over Button to come back original stage
    And I click Add Button to create Seat
    Then I should see created new seat
    And I click Split Evenly Button
    Then I should see Seperate Item is Disable
    Then I should see the additional seat & Item on the Split Seat
    Then I click Start Over Button to come back original stage
    And I click Add Button to create Seat
    Then I should see created new seat
    And I click Split Evenly Button
    Then I should see Seperate Item is Disable
    And I click seat to Group into one seat
    And I click another seat for Group
    And I click the Group Seats button in the Split Seat
    Then I should see selected seat item should club into one seat
    Then I click Start Over Button to come back original stage
    And I click the save & close button on the split screen
    Then I Should get back to the Order Screen
    And I click Cash button for Complete Sale
    And I click Exact button on the cash pop-up
    And I click Enter Button on the cash pop-up
   #    Then I should see the print or send receipt
#    And I click No thanks Button on the print receipt
    Then I should get back to the Table Layout tab
   # And I click power button
    #Examples:
    #  | table_no | number_of_seats | Menu_Item | Modifier | number_of_split |
     # | T9          |1              | French Friese | Tomato | 2               |

  #Scenario Outline: Back Split Screen - Click Back to get back OrderScreen
    And I click new check button on the Table layout screen
    And I select table as "<table_no>"
    And I select the number of seats as "<number_of_seats>"
    And I tap Continue to finish selecting the number of seats
    And I get check number
    And I select FOOD as category
    And I select menu item as "<Menu_Item>"
    And I select modifier as "<Modifier>"
    And I click Done to get back
    And I click Finish Order button
    Then I should get back to the Table Layout tab
    And I click the Split Button from the Table Layout Screen
    When I click the Split By Seat on the Pop-up
    And I click the check from the table layout
    Then I should see the Split Screen
    And I click the Back button on Split Screen
    And I click Cash button for Complete Sale
    And I click Exact button on the cash pop-up
    And I click Enter Button on the cash pop-up
   #    Then I should see the print or send receipt
#    And I click No thanks Button on the print receipt
    Then I should get back to the Table Layout tab
    #And I click power button
    #Examples:
     # | table_no | number_of_seats | Menu_Item | Modifier |
      #| T11          |1              | French Friese | Steak  |

 # Scenario Outline: Back Split Screen - click back to see "Changes made in split, save and close"
    And I click new check button on the Table layout screen
    And I select table as "<table_no>"
    And I select the number of seats as "<number_of_seats>"
    And I tap Continue to finish selecting the number of seats
    And I get check number
    And I select FOOD as category
    And I select menu item as "<Menu_Item>"
    And I select modifier as "<Modifier>"
    And I click Done to get back
    And I click Finish Order button
    Then I should get back to the Table Layout tab
    And I click the Split Button from the Table Layout Screen
    When I click the Split By Seat on the Pop-up
    And I click the check from the table layout
    Then I should see the Split Screen
    And I click on item
    And I click Seperate item button
    And I select the number of split item "<number_of_split>"
    And I click the Continue button
    Then I Should see Split Evenly is Disable
    And I click the Back button on Split Screen
    Then I should see the Changes made in split save and close pop-up
    And I click Done button on the Popup
    And I click the save & close button on the split screen
    Then I Should get back to the Order Screen
    And I click Cash button for Complete Sale
    And I click Exact button on the cash pop-up
    And I click Enter Button on the cash pop-up
   #    Then I should see the print or send receipt
#    And I click No thanks Button on the print receipt
    Then I should get back to the Table Layout tab
 #   And I click power button
  #  Examples:
   #   | table_no | number_of_seats | Menu_Item | Modifier | number_of_split |
    #  | T12          |1              | French Friese | Steak  | 2          |

 # Scenario Outline: Start Over - Click Back to see order screen when made some action
    And I click new check button on the Table layout screen
    And I select table as "<table_no>"
    And I select the number of seats as "<number_of_seats>"
    And I tap Continue to finish selecting the number of seats
    And I get check number
    And I select FOOD as category
    And I select menu item as "<Menu_Item>"
    And I select modifier as "<Modifier>"
    And I click Done to get back
    And I click Finish Order button
    Then I should get back to the Table Layout tab
    And I click the Split Button from the Table Layout Screen
    When I click the Split By Seat on the Pop-up
    And I click the check from the table layout
    Then I should see the Split Screen
    And I click on item
    And I click Seperate item button
    And I select the number of split item "<number_of_split>"
    And I click the Continue button
    Then I Should see Split Evenly is Disable
    Then I click Start Over Button to come back original stage
    And I click the Back button on Split Screen
    And I click Cash button for Complete Sale
    And I click Exact button on the cash pop-up
    And I click Enter Button on the cash pop-up
   #    Then I should see the print or send receipt
#    And I click No thanks Button on the print receipt
    Then I should get back to the Table Layout tab
    #And I click power button
   # Examples:
    #  | table_no | number_of_seats | Menu_Item | Modifier | number_of_split |
     # | T13          |1              | French Friese | Steak  | 2          |

  #Scenario Outline: Save & Close-Split Screen
    And I click new check button on the Table layout screen
    And I select table as "<table_no>"
    And I select the number of seats as "<number_of_seats>"
    And I tap Continue to finish selecting the number of seats
    And I get check number
    And I select FOOD as category
    And I select menu item as "<Menu_Item>"
    And I select modifier as "<Modifier>"
    And I click Done to get back
    And I click Finish Order button
    Then I should get back to the Table Layout tab
    And I click the Split Button from the Table Layout Screen
    When I click the Split By Seat on the Pop-up
    And I click the check from the table layout
    Then I should see the Split Screen
    And I click on item
    And I click Seperate item button
    And I select the number of split item "<number_of_split>"
    And I click the Continue button
    And I click the save & close button on the split screen
    Then I Should get back to the Order Screen
    And I click Finish Order button
    Then I should get back to the Table Layout tab
    And I click the Split Button from the Table Layout Screen
    When I click the Split By Seat on the Pop-up
    And I click the check from the table layout
    Then I should see the Split Screen
    And I click the save & close button on the split screen
    Then I Should get back to the Order Screen
    And I click Cash button for Complete Sale
    And I click Exact button on the cash pop-up
    And I click Enter Button on the cash pop-up
   #    Then I should see the print or send receipt
#    And I click No thanks Button on the print receipt
    Then I should get back to the Table Layout tab
    #And I click power button
   # Examples:
   #   | table_no | number_of_seats | Menu_Item | Modifier | number_of_split |
  #    | T10          |1              | French Friese | Steak  | 2          |

 # Scenario Outline: Split - Split Evently
    And I click new check button on the Table layout screen
    And I select table as "<table_no>"
    And I select the number of seats as "<number_of_seats>"
    And I tap Continue to finish selecting the number of seats
    And I get check number
    And I select FOOD as category
    And I select menu item as "<Menu_Item>"
    And I select modifier as "<Modifier>"
    And I click Done to get back
    And I click Finish Order button
    Then I should get back to the Table Layout tab
    And I click the Split Button from the Table Layout Screen
    When I click the Split By Seat on the Pop-up
    And I click the check from the table layout
    Then I should see the Split Screen
    And I click Add Button to create Seat
    Then I should see created new seat
    And I click Split Evenly Button
    Then I should see Seperate Item is Disable
    Then I should see the additional seat & Item on the Split Seat
    And I click the Back button on Split Screen
    Then I should see the Changes made in split save and close pop-up
    And I click Done button on the Popup
    And I click the save & close button on the split screen
    Then I Should get back to the Order Screen
    And I click Cash button for Complete Sale
    And I click Exact button on the cash pop-up
    And I click Enter Button on the cash pop-up
   #    Then I should see the print or send receipt
#    And I click No thanks Button on the print receipt
    Then I should get back to the Table Layout tab
    #And I click power button
    #Examples:
   #   | table_no | number_of_seats | Menu_Item | Modifier |
  #    | T14          |1              | French Friese | Steak  |

 # Scenario Outline: Split - Group Seats by Without selecting seats
    And I click new check button on the Table layout screen
    And I select table as "<table_no>"
    And I select the number of seats as "<number_of_seats>"
    And I tap Continue to finish selecting the number of seats
    And I get check number
    And I select FOOD as category
    And I select menu item as "<Menu_Item>"
    And I select modifier as "<Modifier>"
    And I click Done to get back
    And I click Finish Order button
    Then I should get back to the Table Layout tab
    And I click the Split Button from the Table Layout Screen
    When I click the Split By Seat on the Pop-up
    And I click the check from the table layout
    Then I should see the Split Screen
    And I click the Group Seats button in the Split Seat
    Then I should see the Select the Seats to Merge Popup message
    And I click Done button on the Popup
    And I click the save & close button on the split screen
    Then I Should get back to the Order Screen
    And I click Cash button for Complete Sale
    And I click Exact button on the cash pop-up
    And I click Enter Button on the cash pop-up
   #    Then I should see the print or send receipt
#    And I click No thanks Button on the print receipt
    Then I should get back to the Table Layout tab
    #And I click power button
  #  Examples:
   #   | table_no | number_of_seats | Menu_Item | Modifier |
    #  | T18          |1              | French Friese | Steak   |

 # Scenario Outline: Split - Group Seats
    And I click new check button on the Table layout screen
    And I select table as "<table_no>"
    And I select the number of seats as "<number_of_seats2>"
    And I tap Continue to finish selecting the number of seats
    And I get check number
    And I select FOOD as category
    And I select menu item as "<Menu_Item>"
    And I select modifier as "<Modifier>"
    And I click Done to get back
    And I click seat 2 for add menu item
    And I select FOOD as category
    And I select menu item as "<Menu_Item1>"
    And I select modifier as "<Modifier1>"
    And I click Done to get back
    And I click Finish Order button
    Then I should get back to the Table Layout tab
    And I click the Split Button from the Table Layout Screen
    When I click the Split By Seat on the Pop-up
    And I click the check from the table layout
    Then I should see the Split Screen
    And I click seat to Group into one seat
    And I click another seat for Group
    And I click the Group Seats button in the Split Seat
    Then I should see selected seat item should club into one seat
    And I click the Back button on Split Screen
    Then I should see the Changes made in split save and close pop-up
    And I click Done button on the Popup
    And I click the save & close button on the split screen
    Then I Should get back to the Order Screen
    And I click Cash button for Complete Sale
    And I click Exact button on the cash pop-up
    And I click Enter Button on the cash pop-up
   #    Then I should see the print or send receipt
#    And I click No thanks Button on the print receipt
    Then I should get back to the Table Layout tab
    And I click power button
    Examples:
      | table_no |number_of_seats| number_of_seats2 | Menu_Item     | Modifier | Menu_Item1   | Modifier1 | number_of_split |
      | T15      | 1             |2                 | French Friese | Tomato   | Garlic Bread | 4 BBQ     | 2               |



  Scenario Outline: Print Split Screen for Without Select seat
    And I click new check button on the Table layout screen
    And I select table as "<table_no>"
    And I select the number of seats as "<number_of_seats>"
    And I tap Continue to finish selecting the number of seats
    And I get check number
    And I select FOOD as category
    And I select menu item as "<Menu_Item>"
    And I select modifier as "<Modifier>"
    And I click Done to get back
    And I click Finish Order button
    Then I should get back to the Table Layout tab
    And I click the Split Button from the Table Layout Screen
    When I click the Split By Seat on the Pop-up
    And I click the check from the table layout
    Then I should see the Split Screen
    And I click print button in the split seat screen
    Then I should see select the seat to print popup
    And I click Done button on the Popup
    And I click the save & close button on the split screen
    Then I Should get back to the Order Screen
    And I click Cash button for Complete Sale
    And I click Exact button on the cash pop-up
    And I click Enter Button on the cash pop-up
   #    Then I should see the print or send receipt
#    And I click No thanks Button on the print receipt
    Then I should get back to the Table Layout tab
   # And I click power button
    #Examples:
     # | table_no | number_of_seats | Menu_Item | Modifier |
      #| T11          |1              | French Friese | Steak  |

  #Scenario Outline: Print-Split Screen Click Print button to get Receipt Printer for Selected seat & "item(s) need to send Kitchen" pop up
    And I click new check button on the Table layout screen
    And I select table as "<table_no>"
    And I select the number of seats as "<number_of_seats>"
    And I tap Continue to finish selecting the number of seats
    And I get check number
    And I select FOOD as category
    And I select menu item as "<Menu_Item>"
    And I select modifier as "<Modifier>"
    And I click Done to get back
    And I click Finish Order button
    Then I should get back to the Table Layout tab
    And I click the Split Button from the Table Layout Screen
    When I click the Split By Seat on the Pop-up
    And I click the check from the table layout
    Then I should see the Split Screen
    And I click seat one on the split screen
    And I click print button in the split seat screen
#    Then I should see Receipt Printer popup
#    And I click Done button on the Popup
    And I click the save & close button on the split screen
    Then I Should get back to the Order Screen
    And I click Cash button for Complete Sale
    And I click Exact button on the cash pop-up
    And I click Enter Button on the cash pop-up
   #    Then I should see the print or send receipt
#    And I click No thanks Button on the print receipt
    Then I should get back to the Table Layout tab
  #  And I click power button
   # Examples:
    #  | table_no | number_of_seats | Menu_Item | Modifier |
     # | T8          |1              | French Friese | Tomato  |

  #Scenario Outline: Print Split Screen, when Select Multi seat for Print should see Select any one seat/check for print
    And I click new check button on the Table layout screen
    And I select table as "<table_no>"
    And I select the number of seats as "<number_of_seats>"
    And I tap Continue to finish selecting the number of seats
    And I get check number
    And I select FOOD as category
    And I select menu item as "<Menu_Item>"
    And I select modifier as "<Modifier>"
    And I click Done to get back
    And I click Finish Order button
    Then I should get back to the Table Layout tab
    And I click the Split Button from the Table Layout Screen
    When I click the Split By Seat on the Pop-up
    And I click the check from the table layout
    Then I should see the Split Screen
    And I click Add Button to create Seat
    Then I should see created new seat
    And I click Split Evenly Button
    Then I should see Seperate Item is Disable
    Then I should see the additional seat & Item on the Split Seat
    And I click seat one on the split screen
    And I click seat two on the split screen
    And I click print button in the split seat screen
    Then I should see select any one seat/check for print popup
    And I click Done button on the Popup
    And I click the save & close button on the split screen
    Then I Should get back to the Order Screen
    And I click Cash button for Complete Sale
    And I click Exact button on the cash pop-up
    And I click Enter Button on the cash pop-up
   #    Then I should see the print or send receipt
#    And I click No thanks Button on the print receipt
    Then I should get back to the Table Layout tab
  #  And I click power button
   # Examples:
    #  | table_no | number_of_seats | Menu_Item | Modifier |
     # | T7         |1              | French Friese | Steak  |

 # Scenario Outline: Print split screen- when Print the Empty seat, nothing should happen
    And I click new check button on the Table layout screen
    And I select table as "<table_no>"
    And I select the number of seats as "<number_of_seats>"
    And I tap Continue to finish selecting the number of seats
    And I get check number
    And I select FOOD as category
    And I select menu item as "<Menu_Item>"
    And I select modifier as "<Modifier>"
    And I click Done to get back
    And I click Finish Order button
    Then I should get back to the Table Layout tab
    And I click the Split Button from the Table Layout Screen
    When I click the Split By Seat on the Pop-up
    And I click the check from the table layout
    Then I should see the Split Screen
    And I click Add Button to create Seat
    Then I should see created new seat
    And I click seat two on the split screen
    And I click print button in the split seat screen
#    Then I should see Receipt Printer popup
#    And I click Done button on the Popup
    And I click the save & close button on the split screen
    Then I Should get back to the Order Screen
    And I click Cash button for Complete Sale
    And I click Exact button on the cash pop-up
    And I click Enter Button on the cash pop-up
   #    Then I should see the print or send receipt
#    And I click No thanks Button on the print receipt
    Then I should get back to the Table Layout tab
    And I click power button
    Examples:
      | table_no | number_of_seats | Menu_Item     | Modifier |
      | T22       |1                | French Friese | Tomato   |



  Scenario Outline: Print All Split Screen,when click Print All application should as Items need to send kitchen
    And I click new check button on the Table layout screen
    And I select table as "<table_no>"
    And I select the number of seats as "<number_of_seats>"
    And I tap Continue to finish selecting the number of seats
    And I get check number
    And I select FOOD as category
    And I select menu item as "<Menu_Item>"
    And I select modifier as "<Modifier>"
    And I click Done to get back
    And I click Finish Order button
    Then I should get back to the Table Layout tab
    And I click the Split Button from the Table Layout Screen
    When I click the Split By Seat on the Pop-up
    And I click the check from the table layout
    Then I should see the Split Screen
    And I click seat one on the split screen
    And I click print All button in the split seat screen
#    Then I should see Receipt Printer popup
#    And I click Done button on the Popup
    And I click the save & close button on the split screen
    Then I Should get back to the Order Screen
    And I click Cash button for Complete Sale
    And I click Exact button on the cash pop-up
    And I click Enter Button on the cash pop-up
   #    Then I should see the print or send receipt
#    And I click No thanks Button on the print receipt
    Then I should get back to the Table Layout tab
  #  And I click power button
   # Examples:
    #  | table_no | number_of_seats | Menu_Item | Modifier |
     # | T10          |1              | French Friese | Steak  |

  #Scenario Outline: Print All Split Screen, Receipt Print Should come for the all the seats seperately at single shot
    And I click new check button on the Table layout screen
    And I select table as "<table_no>"
    And I select the number of seats as "<number_of_seats>"
    And I tap Continue to finish selecting the number of seats
    And I get check number
    And I select FOOD as category
    And I select menu item as "<Menu_Item>"
    And I select modifier as "<Modifier>"
    And I click Done to get back
    And I click Finish Order button
    Then I should get back to the Table Layout tab
    And I click the Split Button from the Table Layout Screen
    When I click the Split By Seat on the Pop-up
    And I click the check from the table layout
    Then I should see the Split Screen
    And I click seat one on the split screen
    And I click print All button in the split seat screen
#    Then I should see Receipt Printer popup
#    And I click Done button on the Popup
    And I click the save & close button on the split screen
    Then I Should get back to the Order Screen
    And I click Cash button for Complete Sale
    And I click Exact button on the cash pop-up
    And I click Enter Button on the cash pop-up
   #    Then I should see the print or send receipt
#    And I click No thanks Button on the print receipt
    Then I should get back to the Table Layout tab
   # And I click power button
    #Examples:
     # | table_no | number_of_seats | Menu_Item | Modifier |
      #| T7          |1              | French Friese | Tomato|

 # Scenario Outline: Print All split Screen,when Select Multi seat for Print All receipt should come & click Start Over, everything should be undo
    And I click new check button on the Table layout screen
    And I select table as "<table_no>"
    And I select the number of seats as "<number_of_seats>"
    And I tap Continue to finish selecting the number of seats
    And I get check number
    And I select FOOD as category
    And I select menu item as "<Menu_Item>"
    And I select modifier as "<Modifier>"
    And I click Done to get back
    And I click Finish Order button
    Then I should get back to the Table Layout tab
    And I click the Split Button from the Table Layout Screen
    When I click the Split By Seat on the Pop-up
    And I click the check from the table layout
    Then I should see the Split Screen
    And I click Add Button to create Seat
    Then I should see created new seat
    And I click Split Evenly Button
    Then I should see Seperate Item is Disable
    Then I should see the additional seat & Item on the Split Seat
    And I click seat one on the split screen
    And I click seat two on the split screen
    And I click print All button in the split seat screen
#    Then I should see Receipt Printer popup
#    And I click Done button on the Popup
    Then I click Start Over Button to come back original stage
    Then I should see Seat 2 is hide
    And I click the save & close button on the split screen
    Then I Should get back to the Order Screen
    And I click Cash button for Complete Sale
    And I click Exact button on the cash pop-up
    And I click Enter Button on the cash pop-up
   #    Then I should see the print or send receipt
#    And I click No thanks Button on the print receipt
    Then I should get back to the Table Layout tab
    And I click power button
    Examples:
      | table_no | number_of_seats | Menu_Item     | Modifier |
      | T23       |1                | French Friese | Steak    |



  Scenario Outline: Pay-Split Screen, When click Pay Button application should navigate to the order screen
    And I click new check button on the Table layout screen
    And I select table as "<table_no>"
    And I select the number of seats as "<number_of_seats>"
    And I tap Continue to finish selecting the number of seats
    And I get check number
    And I select FOOD as category
    And I select menu item as "<Menu_Item>"
    And I select modifier as "<Modifier>"
    And I click Done to get back
    And I click Finish Order button
    Then I should get back to the Table Layout tab
    And I click the Split Button from the Table Layout Screen
    When I click the Split By Seat on the Pop-up
    And I click the check from the table layout for merged
    Then I should see the Split Screen
    And I click seat one on the split screen
    And I click Pay Button in Split Screen
    Then I should see the Payment window
    And I click cash button from the payment method popup
    And I click Submit button on the Payment Window
   #    Then I should see the print or send receipt
#    And I click No thanks Button on the print receipt
    Then I should get back to the Table Layout tab
   # And I click power button
   # Examples:
    #  | table_no | number_of_seats | Menu_Item | Modifier |
     # | 2          |1              | French Friese | Tomato|

 # Scenario Outline: Pay-Split Screen, When click Pay Button without select Seat
    And I click new check button on the Table layout screen
    And I select table as "<table_no>"
    And I select the number of seats as "<number_of_seats>"
    And I tap Continue to finish selecting the number of seats
    And I get check number
    And I select FOOD as category
    And I select menu item as "<Menu_Item>"
    And I select modifier as "<Modifier>"
    And I click Done to get back
    And I click Finish Order button
    Then I should get back to the Table Layout tab
    And I click the Split Button from the Table Layout Screen
    When I click the Split By Seat on the Pop-up
    And I click the check from the table layout for merged
    Then I should see the Split Screen
    And I click Pay Button in Split Screen
    Then I should see Select the seat to pay in popup
    And I click Done button on the Popup
    And I click the save & close button on the split screen
    Then I Should get back to the Order Screen
    And I click Cash button for Complete Sale
    And I click Exact button on the cash pop-up
    And I click Enter Button on the cash pop-up
   #    Then I should see the print or send receipt
#    And I click No thanks Button on the print receipt
    Then I should get back to the Table Layout tab
   # And I click power button
  #  Examples:
   #   | table_no | number_of_seats | Menu_Item | Modifier |
    #  | T8         |1              | French Friese | Steak  |

 # Scenario Outline: Pay-Split Screen, When click Pay Button with multi Seat
    And I click new check button on the Table layout screen
    And I select table as "<table_no>"
    And I select the number of seats as "<number_of_seats>"
    And I tap Continue to finish selecting the number of seats
    And I get check number
    And I select FOOD as category
    And I select menu item as "<Menu_Item>"
    And I select modifier as "<Modifier>"
    And I click Done to get back
    And I click Finish Order button
    Then I should get back to the Table Layout tab
    And I click the Split Button from the Table Layout Screen
    When I click the Split By Seat on the Pop-up
    And I click the check from the table layout for merged
    Then I should see the Split Screen
    And I click Add Button to create Seat
    Then I should see created new seat
    And I click Split Evenly Button
    Then I should see Seperate Item is Disable
    Then I should see the additional seat & Item on the Split Seat
    And I click seat one on the split screen
    And I click seat two on the split screen
    And I click Pay Button in Split Screen
    Then I should see Select any one seat/check for payment in popup
    And I click Done button on the Popup
    And I click the save & close button on the split screen
    Then I Should get back to the Order Screen
    And I click Cash button for Complete Sale
    And I click Exact button on the cash pop-up
    And I click Enter Button on the cash pop-up
   #    Then I should see the print or send receipt
#    And I click No thanks Button on the print receipt
    Then I should get back to the Table Layout tab
    And I click power button
    Examples:
      | table_no | number_of_seats | Menu_Item     | Modifier |
      | T11      |1                | French Friese | Tomato   |



  Scenario Outline: Touch & Paste on Split Screen
    And I click new check button on the Table layout screen
    And I select table as "<table_no>"
    And I select the number of seats as "<number_of_seats3>"
    And I tap Continue to finish selecting the number of seats
    And I get check number
    And I select FOOD as category
    And I select menu item as "<Menu_Item>"
    And I select modifier as "<Modifier>"
    And I click Done to get back
    And I click seat 2 for add menu item
    And I select FOOD as category
    And I select menu item as "<Menu_Item1>"
    And I select modifier as "<Modifier1>"
    And I click Done to get back
    And I click seat 3 for add menu item
    And I select FOOD as category
    And I select menu item as "<Menu_Item2>"
    And I select modifier as "<Modifier2>"
    And I click Done to get back
    And I click Finish Order button
    Then I should get back to the Table Layout tab
    And I click the Split Button from the Table Layout Screen
    When I click the Split By Seat on the Pop-up
    And I click the check from the table layout for merged
    Then I should see the Split Screen
    And I click on item
    And I click seat two on the split screen
    Then I should see selected seat item should club into seat two
    And I click the save & close button on the split screen
    Then I Should get back to the Order Screen
    And I click Cash button for Complete Sale
    And I click Exact button on the cash pop-up
    And I click Enter Button on the cash pop-up
   #    Then I should see the print or send receipt
#    And I click No thanks Button on the print receipt
    Then I should get back to the Table Layout tab
   # And I click power button
   # Examples:
    #  | table_no | number_of_seats | Menu_Item | Modifier | Menu_Item1 | Modifier1 | Menu_Item2 | Modifier2 |
     # | T6          |3             | French Friese | Tomato| Garlic Bread | 4 BBQ    | B.I. Wings | Tomato  |

  #Scenario Outline: Split screen from Order screen, should navigate to Split Screen from order Screen
    And I click new check button on the Table layout screen
    And I select table as "<table_no1>"
    And I select the number of seats as "<number_of_seats>"
    And I tap Continue to finish selecting the number of seats
    And I get check number
    And I select FOOD as category
    And I select menu item as "<Menu_Item>"
    And I select modifier as "<Modifier>"
    And I click Done to get back
    And I click the split seat from Order screen
    Then I should see the Split Screen
    And I click the save & close button on the split screen
    Then I Should get back to the Order Screen
    And I click Cash button for Complete Sale
    And I click Exact button on the cash pop-up
    And I click Enter Button on the cash pop-up
   #    Then I should see the print or send receipt
#    And I click No thanks Button on the print receipt
    Then I should get back to the Table Layout tab
    #And I click power button
   # Examples:
    #  | table_no | number_of_seats | Menu_Item | Modifier |
     # | T7         |1              | French Friese | Tomato|

 # Scenario Outline: Split screen from Order Screen, Should see Split is not allowed, no order in this Check
    And I click new check button on the Table layout screen
    And I select table as "<table_no>"
    And I select the number of seats as "<number_of_seats>"
    And I tap Continue to finish selecting the number of seats
    And I get check number
    And I click the split seat from Order screen
    Then I should see Split is not allowed no orders in this check
    And I click Done button on the Popup
    And I click All
    And I click Table Layout tab
    #And I click power button
    #Examples:
    #  | table_no | number_of_seats |
     # | T17         |1              |

#  Scenario Outline: Split screen From order Screen, Should see Split is not allow, payment in this check
    And I click new check button on the Table layout screen
    And I select table as "<table_no1>"
    And I select the number of seats as "<number_of_seats>"
    And I tap Continue to finish selecting the number of seats
    And I get check number
    And I select FOOD as category
    And I select menu item as "<Menu_Item>"
    And I select modifier as "<Modifier>"
    And I click Done to get back
    And I click table number on the Order Screen as "<table_no1>"
    And I click Payment button in the Order Management Screen
    And I click cash button from the payment method popup
    And I click Exit to return to Order Management Screen
    And I click the split seat from Order screen
    Then I should see Split is not allowed payment in this check
    And I click Done button on the Popup
    And I click Payment button in the Order Management Screen
    Then I should see the Payment window
    And I click Submit button on the Payment Window
   #    Then I should see the print or send receipt
#    And I click No thanks Button on the print receipt
    Then I should get back to the Table Layout tab
    And I click Table Layout tab
    And I click power button
    Examples:
      | table_no | number_of_seats | Menu_Item     | Modifier |  number_of_seats3 | Menu_Item     | Modifier | Menu_Item1   | Modifier1 | Menu_Item2 | Modifier2 |table_no1|
      | T17      |1                | French Friese | Tomato   | 3                 | French Friese | Tomato   | Garlic Bread | 4 BBQ     | B.I. Wings | Tomato    |T15      |


  Scenario Outline: Pay Check-Table Layout, Should navigate to Payment Window
    And I click new check button on the Table layout screen
    And I select table as "<table_no>"
    And I select the number of seats as "<number_of_seats>"
    And I tap Continue to finish selecting the number of seats
    And I get check number
    And I select FOOD as category
    And I select menu item as "<Menu_Item>"
    And I select modifier as "<Modifier>"
    And I click Done to get back
    And I click Finish Order button
    Then I should get back to the Table Layout tab
    And I click Pay Check button
    And I click the check from the table layout for merged
    Then I should see the Payment window
    And I click cash button from the payment method popup
    And I click Submit button on the Payment Window
   #    Then I should see the print or send receipt
#    And I click No thanks Button on the print receipt
    Then I should get back to the Table Layout tab
    And I click Table Layout tab
   # And I click power button
    #Examples:
     # | table_no | number_of_seats | Menu_Item | Modifier |
      #| T9         |1              | French Friese | Steak  |

  #Scenario Outline: Pay check-Table layout, see select valid check
    And I click new check button on the Table layout screen
    And I click Pay Check button

    And I select table as "<table_no>"
    Then I should see select Valid Check pop-up
    And I click Done button on the Popup
    And I click power button
    Examples:
      | table_no | number_of_seats | Menu_Item     | Modifier |
      | T23      |1                | French Friese | Steak    |


  Scenario Outline: Print Table Layout, see Receipt printer without order
    And I click new check button on the Table layout screen
    And I select table as "<table_no>"
    And I select the number of seats as "<number_of_seats>"
    And I tap Continue to finish selecting the number of seats
    And I get check number
    And I select FOOD as category
    And I select menu item as "<Menu_Item>"
    And I select modifier as "<Modifier>"
    And I click Done to get back
    And I click Finish Order button
    Then I should get back to the Table Layout tab
    And I click Print on the table layout screen
    And I click the check from the table layout for merged
#    Then I should see Receipt Printer popup
#    And I click Done button on the Popup
#    And I click X Button
    And I click the check from the table layout for merged
    Then I Should get back to the Order Screen
    And I click Cash button for Complete Sale
    And I click Exact button on the cash pop-up
    And I click Enter Button on the cash pop-up
   #    Then I should see the print or send receipt
#    And I click No thanks Button on the print receipt
    Then I should get back to the Table Layout tab
    And I click Table Layout tab
   # And I click power button
    #Examples:
     # | table_no | number_of_seats | Menu_Item | Modifier |
      #| T14         |1              | French Friese | Tomato|

 # Scenario Outline: Print Table Layout, see Receipt printer with order
    And I click new check button on the Table layout screen
    And I select table as "<table_no>"
    And I select the number of seats as "<number_of_seats>"
    And I tap Continue to finish selecting the number of seats
    And I get check number
    And I select FOOD as category
    And I select menu item as "<Menu_Item>"
    And I select modifier as "<Modifier>"
    And I click Done to get back
    And I click Order button in the order management screen
    And I click Finish Order button
    Then I should get back to the Table Layout tab
    And I click Print on the table layout screen
    And I click the check from the table layout for merged
#    Then I should see Receipt Printer popup
#    And I click Done button on the Popup
#    And I click X Button
    And I click the check from the table layout for merged
    Then I Should get back to the Order Screen
    And I click Cash button for Complete Sale
    And I click Exact button on the cash pop-up
    And I click Enter Button on the cash pop-up
   #    Then I should see the print or send receipt
#    And I click No thanks Button on the print receipt
    Then I should get back to the Table Layout tab
    And I click Table Layout tab
   # And I click power button
    #Examples:
    #  | table_no | number_of_seats | Menu_Item | Modifier |
    #  | T16         |1              | French Friese | Tomato|

  #Scenario Outline: Open the Created Sales
    And I click new check button on the Table layout screen
    And I select table as "<table_no>"
    And I select the number of seats as "<number_of_seats>"
    And I tap Continue to finish selecting the number of seats
    And I get check number
    And I select FOOD as category
    And I select menu item as "<Menu_Item>"
    And I select modifier as "<Modifier1>"
    And I click Done to get back
    And I click Finish Order button
    Then I should get back to the Table Layout tab
    And I click the check from the table layout for merged
    Then I Should get back to the Order Screen
    And I click Cash button for Complete Sale
    And I click Exact button on the cash pop-up
    And I click Enter Button on the cash pop-up
   #    Then I should see the print or send receipt
#    And I click No thanks Button on the print receipt
    Then I should get back to the Table Layout tab
    And I click Table Layout tab
    And I click power button
    Examples:
      | table_no | number_of_seats | Menu_Item     | Modifier1 | Modifier |
      | T17      |1                | French Friese | Steak     |  Tomato  |


  Scenario Outline: Void - Before Order
    And I click new check button on the Table layout screen
    And I select table as "<table_no>"
    And I select the number of seats as "<number_of_seats>"
    And I tap Continue to finish selecting the number of seats
    And I get check number
    And I select FOOD as category
    And I select menu item as "<Menu_Item>"
    And I select modifier as "<Modifier>"
    And I click Done to get back
    And I click Void button on order management screen
    Then I should see All orders are voided
    And I click Done button on the Popup
    And I click All
    And I click Table Layout tab
   # And I click power button
    #Examples:
     # | table_no | number_of_seats | Menu_Item | Modifier |
     # | T19         |1              | French Friese | Steak  |

  #Scenario Outline: Void - After Order
    And I click new check button on the Table layout screen
    And I select table as "<table_no>"
    And I select the number of seats as "<number_of_seats>"
    And I tap Continue to finish selecting the number of seats
    And I get check number
    And I select FOOD as category
    And I select menu item as "<Menu_Item>"
    And I select modifier as "<Modifier>"
    And I click Done to get back
    And I click Order button in the order management screen
    And I click Void button on order management screen
    And I click void Reason on the void popup
    And I click Add Button on the void reason popup
#    Then I should see Receipt Printer popup
#    And I click Done button on the Popup
    Then I should get back to the Table Layout tab
   # And I click power button

    #Examples:
    #  | table_no | number_of_seats | Menu_Item | Modifier |
     # | T17         |1              | French Friese | Steak  |

 # Scenario Outline: Void - After Payment
    And I click new check button on the Table layout screen
    And I select table as "<table_no>"
    And I select the number of seats as "<number_of_seats>"
    And I tap Continue to finish selecting the number of seats
    And I get check number
    And I select FOOD as category
    And I select menu item as "<Menu_Item>"
    And I select modifier as "<Modifier>"
    And I click Done to get back
    And I click Payment button in the Order Management Screen
    And I click cash button from the payment method popup
    And I click Exit to return to Order Management Screen
    And I click Void button on order management screen
    Then I should see payment made on this check popup message
    And I click Done button on the Popup
    And I click Submit button on the Payment Window
   #    Then I should see the print or send receipt
#    And I click No thanks Button on the print receipt
    Then I should get back to the Table Layout tab
   # And I click power button
   # Examples:
    #  | table_no | number_of_seats | Menu_Item | Modifier |
     # | T22          |1              | French Friese | Steak  |

 # Scenario Outline: Search
    And I click new check button on the Table layout screen
    And I select table as "<table_no>"
    And I select the number of seats as "<number_of_seats>"
    And I tap Continue to finish selecting the number of seats
    And I get check number
    And I click Search Button on the Order Screen
    Then I should see search field on the Order screen
    And I pass menu item to search and click the menu item as "<Menu_item1>"
    Then I should see menu item added into Order list
    And I click Void button on order management screen
    Then I should see All orders are voided
    And I click Done button on the Popup
    And I click All
    And I click Table Layout tab
   # And I click power button
    #Examples:
     # | table_no | number_of_seats | Menu_item1 | Menu_Item | Modifier |
     # | T7      | 1               | Onion Rings |French Friese | Steak  |

 # Scenario Outline: When Order,Tick Mark Shown
    And I click new check button on the Table layout screen
    And I select table as "<table_no>"
    And I select the number of seats as "<number_of_seats>"
    And I tap Continue to finish selecting the number of seats
    And I get check number
    And I select FOOD as category
    And I select menu item as "<Menu_Item>"
    And I select modifier as "<Modifier1>"
    And I click Done to get back
    And I click Order button in the order management screen
    Then I Should get back to the Order Screen
    Then I should see Tick mark in the Menu item
    And I click Cash button for Complete Sale
    And I click Exact button on the cash pop-up
    And I click Enter Button on the cash pop-up
   #    Then I should see the print or send receipt
#    And I click No thanks Button on the print receipt
    Then I should get back to the Table Layout tab
    And I click power button
    Examples:
      | table_no | number_of_seats | Menu_Item     | Modifier1 | Menu_item1 | Modifier |
      | T10      |1                | French Friese | Tomato    |Onion Rings | Steak    |


  Scenario Outline: Cash (Paid Exact Amount)
    And I click new check button on the Table layout screen
    And I select table as "<table_no>"
    And I select the number of seats as "<number_of_seats>"
    And I tap Continue to finish selecting the number of seats
    And I get check number
    And I select FOOD as category
    And I select menu item as "<Menu_Item>"
    And I select modifier as "<Modifier>"
    And I click Done to get back
    And I click Cash button for Complete Sale
    And I click Exact button on the cash pop-up
    And I click Enter Button on the cash pop-up
   #    Then I should see the print or send receipt
#    And I click No thanks Button on the print receipt
    Then I should get back to the Table Layout tab
    #And I click power button
    #Examples:
    #  | table_no | number_of_seats | Menu_Item | Modifier |
    #  | T7         |1              | French Friese | Tomato|

  #Scenario Outline: Cash (Paid Huge Amount then Get Change Duo Popup)
    And I click new check button on the Table layout screen
    And I select table as "<table_no>"
    And I select the number of seats as "<number_of_seats>"
    And I tap Continue to finish selecting the number of seats
    And I get check number
    And I select FOOD as category
    And I select menu item as "<Menu_Item>"
    And I select modifier as "<Modifier>"
    And I click Done to get back
    And I click Cash button for Complete Sale
    And I click huge amount for complete sale
    And I click Enter Button on the cash pop-up
    Then I should see change Due popup
    And I click Done button on the Popup
    #And I click No thanks Button on the print receipt
    Then I should get back to the Table Layout tab
  #  And I click power button
   # Examples:
   #   | table_no | number_of_seats | Menu_Item | Modifier |
   #   | T8         |1              | Garlic Bread | 4 BBQ|

  #Scenario Outline: Cash - No more payment need Popup
    And I click new check button on the Table layout screen
    And I select table as "<table_no>"
    And I select the number of seats as "<number_of_seats>"
    And I tap Continue to finish selecting the number of seats
    And I get check number
    And I select FOOD as category
    And I select menu item as "<Menu_Item>"
    And I select modifier as "<Modifier>"
    And I click Done to get back
    And I click Payment button in the Order Management Screen
    And I click cash button from the payment method popup
    And I click the Exit button in the payment window
#    And I wait sometimes
    And I click Cash button for Complete Sale
#    Then I should see No more payment needed popup
#    And I click Done button on the Popup
    Then I Should get back to the Order Screen
    And I click Payment button in the Order Management Screen
    And I click Submit button on the Payment Window
   #    Then I should see the print or send receipt
#    And I click No thanks Button on the print receipt
    Then I should get back to the Table Layout tab
  #  And I click power button
   # Examples:
    #  | table_no | number_of_seats | Menu_Item | Modifier |
    #  | T13         |1              | French Friese | Steak  |

 # Scenario Outline: Cash Reopen check After Payment
    And I click new check button on the Table layout screen
    And I select table as "<table_no>"
    And I select the number of seats as "<number_of_seats>"
    And I tap Continue to finish selecting the number of seats
    And I get check number
    And I select FOOD as category
    And I select menu item as "<Menu_Item>"
    And I select modifier as "<Modifier>"
    And I click Done to get back
    And I click Payment button in the Order Management Screen
    And I click cash button from the payment method popup
    And I click Submit button on the Payment Window
   #    Then I should see the print or send receipt
#    And I click No thanks Button on the print receipt
    Then I should get back to the Table Layout tab
    And I click Check Stats tab
    And I click Closed tab on the Check stats
    And I click the Closed check on check stats
    And I click reopen check button on the check stats screen
    Then I Should get back to the Order Screen
    And I click Cash button for Complete Sale
#    Then I should see No more payment needed popup
#    And I click Done button on the Popup
    And I click Payment button in the Order Management Screen
    And I click Submit button on the Payment Window
   #    Then I should see the print or send receipt
#    And I click No thanks Button on the print receipt
    Then I should get back to the Table Layout tab
    And I click Table Layout tab
    And I click power button
    Examples:
      | table_no | number_of_seats | Menu_Item     | Modifier |
      | T12      |1                | French Friese | Steak    |


  Scenario Outline: Payment -Adjust Payment Should not Allow Except cash payment
    And I click new check button on the Table layout screen
    And I select table as "<table_no>"
    And I select the number of seats as "<number_of_seats>"
    And I tap Continue to finish selecting the number of seats
    And I get check number
    And I select FOOD as category
    And I select menu item as "<Menu_Item>"
    And I select modifier as "<Modifier>"
    And I click Done to get back
    And I click Payment button in the Order Management Screen
    And I click cash button from the payment method popup
    And I click payment in the payment window
    And I click Delete button on the payment window
#    And I click Ok button in receipt printer popup
    And I click cash button from the payment method popup
    And I click payment in the payment window
    And I click Adjust button in the payment window after Payment
    And I click the Exit button in the payment window
    Then I Should get back to the Order Screen
    And I click Payment button in the Order Management Screen
    And I click Submit button on the Payment Window
   #    Then I should see the print or send receipt
#    And I click No thanks Button on the print receipt
    Then I should get back to the Table Layout tab
   # And I click power button
   # Examples:
   #   | table_no | number_of_seats | Menu_Item | Modifier |
    #  | T7         |1              | French Friese | Steak  |

  #Scenario Outline: Delete payment - Payment should be deleted
    And I click new check button on the Table layout screen
    And I select table as "<table_no>"
    And I select the number of seats as "<number_of_seats>"
    And I tap Continue to finish selecting the number of seats
    And I get check number
    And I select FOOD as category
    And I select menu item as "<Menu_Item>"
    And I select modifier as "<Modifier>"
    And I click Done to get back
    And I click Payment button in the Order Management Screen
    And I click cash button from the payment method popup
    And I click payment in the payment window
    And I click Delete button on the payment window
    And I click Ok button in receipt printer popup
    Then I should see Cash payment is deleted
    And I click cash button from the payment method popup
    And I click Submit button on the Payment Window
   #    Then I should see the print or send receipt
#    And I click No thanks Button on the print receipt
    Then I should get back to the Table Layout tab
    #And I click power button
   # Examples:
    #  | table_no | number_of_seats | Menu_Item | Modifier |
     # | T16         |1              | French Friese | Steak   |

 # Scenario Outline: Delete Payment - select payment and try again
    And I click new check button on the Table layout screen
    And I select table as "<table_no>"
    And I select the number of seats as "<number_of_seats>"
    And I tap Continue to finish selecting the number of seats
    And I get check number
    And I select FOOD as category
    And I select menu item as "<Menu_Item>"
    And I select modifier as "<Modifier>"
    And I click Done to get back
    And I click Payment button in the Order Management Screen
    And I click Delete button on the payment window
    Then I should see select payment and try again popup
    And I click Done button on the Popup
    And I click cash button from the payment method popup
    And I click payment in the payment window
    And I click Submit button on the Payment Window
   #    Then I should see the print or send receipt
#    And I click No thanks Button on the print receipt
    Then I should get back to the Table Layout tab
    #And I click power button
    #Examples:
     # | table_no | number_of_seats | Menu_Item | Modifier |
      #| T7         |1              | French Friese | Steak   |

  #Scenario Outline: Payment- Balance Due should be changed
    And I click new check button on the Table layout screen
    And I select table as "<table_no>"
    And I select the number of seats as "<number_of_seats>"
    And I tap Continue to finish selecting the number of seats
    And I get check number
    And I select FOOD as category
    And I select menu item as "<Menu_Item>"
    And I select modifier as "<Modifier>"
    And I click Done to get back
    And I click Payment button in the Order Management Screen
    Then I should see Balance Due on the payment window
    And I click Exact button on the cash pop-up
    And I click cash button from the payment method popup
    Then I should see No Due on the Payment window
    And I click Submit button on the Payment Window
   #    Then I should see the print or send receipt
#    And I click No thanks Button on the print receipt
    Then I should get back to the Table Layout tab
  #  And I click power button
   # Examples:
    #  | table_no | number_of_seats | Menu_Item | Modifier |
    #  | T16         |1              | French Friese | Steak   |

 # Scenario Outline: Payment - When enter amount Manually
    And I click new check button on the Table layout screen
    And I select table as "<table_no>"
    And I select the number of seats as "<number_of_seats>"
    And I tap Continue to finish selecting the number of seats
    And I get check number
    And I select FOOD as category
    And I select menu item as "<Menu_Item>"
    And I select modifier as "<Modifier>"
    And I click Done to get back
    And I click Payment button in the Order Management Screen
    Then I should see Balance Due on the payment window
    And I click amount by manually
    And I click cash button from the payment method popup
    Then I should see No Due on the Payment window
    And I click Done button on the Popup
    And I click Submit button on the Payment Window
   #    Then I should see the print or send receipt
#    And I click No thanks Button on the print receipt
    Then I should get back to the Table Layout tab
   # And I click power button
   # Examples:
    #  | table_no | number_of_seats | Menu_Item | Modifier |
     # | T9         |1              | French Friese | Steak  |

  #Scenario Outline: Payment - when do partial payment to get Please pay balance amount popup
    And I click new check button on the Table layout screen
    And I select table as "<table_no>"
    And I select the number of seats as "<number_of_seats>"
    And I tap Continue to finish selecting the number of seats
    And I get check number
    And I select FOOD as category
    And I select menu item as "<Menu_Item>"
    And I select modifier as "<Modifier>"
    And I click Done to get back
    And I click Payment button in the Order Management Screen
    And I click partial amount from the payment window
    And I click cash button from the payment method popup
    And I click Submit button on the Payment Window
    Then I should see please pay amount
    And I click Done button on the Popup
    And I click Exact button on the cash pop-up
    And I click cash button from the payment method popup
    And I click Submit button on the Payment Window
   #    Then I should see the print or send receipt
#    And I click No thanks Button on the print receipt
    Then I should get back to the Table Layout tab
 #   And I click power button
  #  Examples:
   #   | table_no | number_of_seats | Menu_Item | Modifier |
    #  | T10         |1              | French Friese | Steak |

  #Scenario Outline: Payment - Create multi seat and do partial payment to get Please pay balance amount popup for multi seat
    And I click new check button on the Table layout screen
    And I select table as "<table_no>"
    And I select the number of seats as "<number_of_seats2>"
    And I tap Continue to finish selecting the number of seats
    And I get check number
    And I select FOOD as category
    And I select menu item as "<Menu_Item>"
    And I select modifier as "<Modifier>"
    And I click Done to get back
    And I click seat 2 for add menu item
    And I select FOOD as category
    And I select menu item as "<Menu_Item>"
    And I select modifier as "<Modifier>"
    And I click Done to get back
    And I click Payment button in the Order Management Screen
    And I click cash button from the payment method popup
    And I click Submit button on the Payment Window
    Then I should see please pay amount for One seat
    And I click Done button on the Popup
    And I click the Exit button in the payment window
    And I should see that OrderScreen with sales
    And I click table number on the Order Screen as "<table_no>"
    And I click Payment button in the Order Management Screen
    And I click cash button from the payment method popup
    And I click Submit button on the Payment Window
   #    Then I should see the print or send receipt
#    And I click No thanks Button on the print receipt
    Then I should get back to the Table Layout tab
  #  And I click power button
   # Examples:
   #   | table_no | number_of_seats | Menu_Item | Modifier |
   #   | T7        |2              | French Friese | Steak  |

  #Scenario Outline: Payment - Checks Should be Closed
    And I click new check button on the Table layout screen
    And I select table as "<table_no>"
    And I select the number of seats as "<number_of_seats>"
    And I tap Continue to finish selecting the number of seats
    And I get check number
    And I select FOOD as category
    And I select menu item as "<Menu_Item>"
    And I select modifier as "<Modifier>"
    And I click Done to get back
    And I click Payment button in the Order Management Screen
    And I click cash button from the payment method popup
    And I click Submit button on the Payment Window
   #    Then I should see the print or send receipt
#    And I click No thanks Button on the print receipt
    Then I should get back to the Table Layout tab
   # And I click power button
   # Examples:
   #   | table_no | number_of_seats | Menu_Item | Modifier |
    #  | T7        |1              | French Friese | Tomato|

  #Scenario Outline: Payment - No more payment needed
    And I click new check button on the Table layout screen
    And I select table as "<table_no>"
    And I select the number of seats as "<number_of_seats>"
    And I tap Continue to finish selecting the number of seats
    And I get check number
    And I select FOOD as category
    And I select menu item as "<Menu_Item>"
    And I select modifier as "<Modifier>"
    And I click Done to get back
    And I click Payment button in the Order Management Screen
    And I click cash button from the payment method popup
    And I click the Exit button in the payment window
    And I click Cash button for Complete Sale
#    Then I should see No more payment needed popup
#    And I click Done button on the Popup
    And I click Payment button in the Order Management Screen
    And I click Submit button on the Payment Window
   #    Then I should see the print or send receipt
#    And I click No thanks Button on the print receipt
    Then I should get back to the Table Layout tab
    And I click power button
    Examples:
      | table_no | number_of_seats|number_of_seats2 | Menu_Item    | Modifier |
      | T7       |1               | 2               |French Friese | Steak    |


  Scenario Outline: Cash reopen check After Payment for 2 checks
    And I click new check button on the Table layout screen
    And I select table as "<table_no>"
    And I select the number of seats as "<number_of_seats>"
    And I tap Continue to finish selecting the number of seats
    And I get check number
    And I select FOOD as category
    And I select menu item as "<Menu_Item>"
    And I select modifier as "<Modifier>"
    And I click Done to get back
    And I click seat 2 for add menu item
    And I select FOOD as category
    And I select menu item as "<Menu_Item>"
    And I select modifier as "<Modifier>"
    And I click Done to get back
    And I click table number on the Order Screen as "<table_no>"
    And I click Payment button in the Order Management Screen
    And I click cash button from the payment method popup
    And I click Submit button on the Payment Window
   #    Then I should see the print or send receipt
#    And I click No thanks Button on the print receipt
    Then I should get back to the Table Layout tab
    And I click Check Stats tab
    And I click Closed tab on the Check stats
    And I click the Closed check on check stats
    And I click reopen check button on the check stats screen
    Then I Should get back to the Order Screen
    And I click Cash button for Complete Sale
#    Then I should see No more payment needed popup
#    And I click Done button on the Popup
    And I click Payment button in the Order Management Screen
    And I click Submit button on the Payment Window
   #    Then I should see the print or send receipt
#    And I click No thanks Button on the print receipt
    Then I should get back to the Table Layout tab
    And I click power button
    Examples:
      | table_no | number_of_seats | Menu_Item     | Modifier |
      | T13      |2                | French Friese | Steak    |


  Scenario Outline: Adjust Payment- Select payment and try again
    And I click new check button on the Table layout screen
    And I select table as "<table_no>"
    And I select the number of seats as "<number_of_seats1>"
    And I tap Continue to finish selecting the number of seats
    And I get check number
    And I select FOOD as category
    And I select menu item as "<Menu_Item>"
    And I select modifier as "<Modifier>"
    And I click Done to get back
    And I click Payment button in the Order Management Screen
    And I click Adjust button in the payment window
    Then I should see select payment and try again popup
    And I click Done button on the Popup
    And I click cash button from the payment method popup
    And I click Submit button on the Payment Window
   #    Then I should see the print or send receipt
#    And I click No thanks Button on the print receipt
    Then I should get back to the Table Layout tab
  #  And I click power button
   # Examples:
   #   | table_no | number_of_seats | Menu_Item | Modifier |
   #   | T7        |1              | French Friese | Tomato|

#  Scenario Outline: Adjust Payment Balance Due field Box should be changed according to adjusted amount.
    And I click new check button on the Table layout screen
    And I select table as "<table_no>"
    And I select the number of seats as "<number_of_seats1>"
    And I tap Continue to finish selecting the number of seats
    And I get check number
    And I select FOOD as category
    And I select menu item as "<Menu_Item>"
    And I select modifier as "<Modifier>"
    And I click Done to get back
    And I click Payment button in the Order Management Screen
    Then I should see Balance Due on the payment window
    And I click cash button from the payment method popup
    And I click payment in the payment window
    And I click Adjust button in the payment window after Payment
    And I click huge amount for complete payment by manually
    And I click cash button from the payment method popup
    Then I should see change Due popup
    And I click Done button on the Popup
    Then I should see No Due on the Payment window
    And I click Submit button on the Payment Window
   #    Then I should see the print or send receipt
#    And I click No thanks Button on the print receipt
    Then I should get back to the Table Layout tab
   # And I click power button
    #Examples:
    #  | table_no | number_of_seats | Menu_Item | Modifier |
    #  | T7        |1              | French Friese | Steak  |

 # Scenario Outline: Adjust payment - create a sale with 2 seat to see balance duo becomes No due and change duo popup should not come
    And I click new check button on the Table layout screen
    And I select table as "<table_no>"
    And I select the number of seats as "<number_of_seats2>"
    And I tap Continue to finish selecting the number of seats
    And I get check number
    And I select FOOD as category
    And I select menu item as "<Menu_Item>"
    And I select modifier as "<Modifier>"
    And I click Done to get back
    And I click Payment button in the Order Management Screen
    And I click cash button from the payment method popup
    And I click the Exit button in the payment window
    And I click seat 2 for add menu item
    And I select FOOD as category
    And I select menu item as "<Menu_Item>"
    And I select modifier as "<Modifier>"
    And I click Done to get back
    And I click table number on the Order Screen as "<table_no>"
    And I click Payment button in the Order Management Screen
    And I click cash button from the payment method popup
    And I click payment for all seat in the payment window
    And I click Adjust button in the payment window after Payment
    And I click total payment by manually 2 seat
    And I click Submit button on the Payment Window
   #    Then I should see the print or send receipt
#    And I click No thanks Button on the print receipt
    Then I should get back to the Table Layout tab
  #  And I click power button
   # Examples:
   #   | table_no | number_of_seats | Menu_Item | Modifier |
   #   | T7        |2              | French Friese | Steak |

#  Scenario Outline: Adjust Payment - Create a sale with 3 seat to see change due popup should not come
    And I click new check button on the Table layout screen
    And I select table as "<table_no>"
    And I select the number of seats as "<number_of_seats3>"
    And I tap Continue to finish selecting the number of seats
    And I get check number
    And I select FOOD as category
    And I select menu item as "<Menu_Item>"
    And I select modifier as "<Modifier>"
    And I click Done to get back
    And I click the split seat from Order screen
    Then I should see the Split Screen
    And I click Split Evenly Button
    And I click Yes button on send to kitchen popup
    Then I should see the additional seat & Item on the Split Seat
    And I click seat to Group into one seat
    And I click the save & close button on the split screen
    Then I Should get back to the Order Screen
#    And I click seat 1 for add menu item
#    And I click Pay Button in Split Screen
#    Then I should see the Payment window
    And I click Payment button in the Order Management Screen
    And I click cash button from the payment method popup
    And I click the Exit button in the payment window
#    And I click the save & close button on the split screen
    Then I Should get back to the Order Screen
#    And I click seat 2 for add menu item

    And I click table number on the Order Screen as "<table_no>"
    And I click Payment button in the Order Management Screen
#    And I click cash button from the payment method popup
    And I click payment for all seat in the payment window
    And I click Adjust button in the payment window after Payment
    And I click total payment by manually 3 seat
    And I click cash button from the payment method popup
    And I click Submit button on the Payment Window
   #    Then I should see the print or send receipt
#    And I click No thanks Button on the print receipt
    Then I should get back to the Table Layout tab
    And I click power button
    Examples:
      | table_no |number_of_seats1|number_of_seats2| number_of_seats3 | Menu_Item     | Modifier |
      | T8       |1               |2               |3                 | French Friese | Steak    |


  Scenario Outline: Exit Payment , Finish - In Table layout screen, color of the table should be changed to seated color
    And I click new check button on the Table layout screen
    And I select table as "<table_no>"
    And I select the number of seats as "<number_of_seats>"
    And I tap Continue to finish selecting the number of seats
    And I get check number
    And I select FOOD as category
    And I select menu item as "<Menu_Item>"
    And I select modifier as "<Modifier>"
    And I click Done to get back
    And I click Payment button in the Order Management Screen
    And I click cash button from the payment method popup
    And I click Exit to return to Order Management Screen
    Then I Should get back to the Order Screen
    And I click Payment button in the Order Management Screen
    And I click Submit button on the Payment Window
   #    Then I should see the print or send receipt
#    And I click No thanks Button on the print receipt
    Then I should get back to the Table Layout tab
   # And I click power button
    #Examples:
    #  | table_no | number_of_seats | Menu_Item | Modifier |
    #  | T8        |1              | French Friese | Steak  |


  #Scenario Outline: Finish - In Table layout screen, color of the table should be changed to seated color
    And I click new check button on the Table layout screen
    And I select table as "<table_no>"
    And I select the number of seats as "<number_of_seats>"
    And I tap Continue to finish selecting the number of seats
    And I get check number
    And I select FOOD as category
    And I select menu item as "<Menu_Item>"
    And I select modifier as "<Modifier>"
    And I click Done to get back
    And I click Finish Order button
    Then I should get back to the Table Layout tab
    And I select table as "<table_no>"
    And I click Payment button in the Order Management Screen
    And I click cash button from the payment method popup
    And I click Submit button on the Payment Window
   #    Then I should see the print or send receipt
#    And I click No thanks Button on the print receipt
    Then I should get back to the Table Layout tab
    And I click power button
    Examples:
      | table_no | number_of_seats | Menu_Item     | Modifier |
      | T19       |1                | French Friese | Steak    |


  Scenario Outline: Create 2 Table order then Merge after that click Arrow to see Merge box Hide
    And I click new check button on the Table layout screen
    And I select table as "<table_no>"
    And I select the number of seats as "<number_of_seats>"
    And I tap Continue to finish selecting the number of seats
    And I get check number
    And I select FOOD as category
    And I select menu item as "<Menu_Item>"
    And I select modifier as "<Modifier>"
    And I click Done to get back
    And I click Finish Order button
    Then I should get back to the Table Layout tab
    And I click new check button on the Table layout screen
    And I select second table to be merged as "<second_table>"
    And I select the number of seats as "<number_of_seats>"
    And I tap Continue to finish selecting the number of seats
    And I get check number1
    And I select FOOD as category
    And I select menu item as "<Menu_Item1>"
    And I select modifier as "<Modifier1>"
    And I click Done to get back
    And I click Finish Order button
    Then I should get back to the Table Layout tab
    And I click Merge button
    And I click the check from the table layout for merged
    And I click the check from the table layout for merged1
    And I click the arrow button in the Merge Box
#    Then I should see merge box is hide
    And I click the arrow button in the Merge Box1
    And I click Done button to merge checks
#    Then I should see the Linga Popup
    And I click Done button on the Popup
    And I click the check from the table layout for merged
    Then I Should get back to the Order Screen
    And I click Payment button in the Order Management Screen
    And I click cash button from the payment method popup
    And I click Submit button on the Payment Window
   #    Then I should see the print or send receipt
#    And I click No thanks Button on the print receipt
    Then I should get back to the Table Layout tab
    And I click power button
    Examples:
      | table_no | number_of_seats | Menu_Item     | Modifier | second_table | number_of_seats | Menu_Item1   | Modifier1 |
      | T20      |1                | French Friese | Steak    | T19          |1                | Garlic Bread | 4 BBQ     |


  Scenario Outline: Void - Reopen Check
    And I click new check button on the Table layout screen
    And I select table as "<table_no>"
    And I select the number of seats as "<number_of_seats>"
    And I tap Continue to finish selecting the number of seats
    And I get check number
    And I select FOOD as category
    And I select menu item as "<Menu_Item>"
    And I select modifier as "<Modifier>"
    And I click Done to get back
    And I click Payment button in the Order Management Screen
    And I click cash button from the payment method popup
    And I click Submit button on the Payment Window
   #    Then I should see the print or send receipt
#    And I click No thanks Button on the print receipt
    Then I should get back to the Table Layout tab
    And I click Check Stats tab
    And I click Closed tab on the Check stats
    And I click the Closed check on check stats
    And I click reopen check button on the check stats screen
    Then I Should get back to the Order Screen
    And I click Void button on order management screen
    Then I should see payment made on this check popup message
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
    Then I should get back to the Table Layout tab
    And I click power button
    Examples:
      | table_no | number_of_seats | Menu_Item     | Modifier |
      | T14      |1                | French Friese | Steak    |


  Scenario Outline: Normal check with cash payment,Normal check with CC payment, Normal check with CC payment with tips and without service charge
    And I click new check button on the Table layout screen
    And I select table as "<table_no>"
    And I select the number of seats as "<number_of_seats>"
    And I tap Continue to finish selecting the number of seats
    And I get check number
    And I select FOOD as category
    And I select menu item as "<Menu_Item>"
    And I select modifier as "<Modifier>"
    And I click Done to get back
    And I click Cash button for Complete Sale
    And I click Exact button on the cash pop-up
    And I click Enter Button on the cash pop-up
   #    Then I should see the print or send receipt
#    And I click No thanks Button on the print receipt
    Then I should get back to the Table Layout tab
    And I click Table Layout tab
   # And I click power button
   # Examples:
    #  | table_no | number_of_seats | Menu_Item | Modifier |
    #  | T14         |1              | French Friese | Steak  |

  #Scenario Outline: Normal check with CC payment
    And I click new check button on the Table layout screen
    And I select table as "<table_no>"
    And I select the number of seats as "<number_of_seats>"
    And I tap Continue to finish selecting the number of seats
    And I get check number
    And I select FOOD as category
    And I select menu item as "<Menu_Item>"
    And I select modifier as "<Modifier>"
    And I click Done to get back
    And I click Payment button in the Order Management Screen
    And I click side cc button in the payment window
   # Then I should see card type window
    #And I click visa card type as "<card_type>"
    #And I click ok button in card type window
    Then I should see total screen
    And I click tip as 10
    Then I should see tip is added with menu total as "<Total>"
    And I click the Continue button on the Total screen
    And I click Submit button on the Payment Window
   #    Then I should see the print or send receipt
#    And I click No thanks Button on the print receipt
    Then I should get back to the Table Layout tab
    And I click Table Layout tab
  #  And I click power button
   # Examples:
    #  | table_no | number_of_seats |  Menu_Item | Modifier | card_type |  Total |
     # | T13       |1              |  French Friese | Steak |  JCB      |TL 65,00 |

  #Scenario Outline: Normal check with CC payment with tips and without service charge
#    And I click new check button on the Table layout screen
#    And I select table as "<table_no>"
#    And I select the number of seats as "<number_of_seats>"
#    And I tap Continue to finish selecting the number of seats
#    And I get check number
#    And I select FOOD as category
#    And I select menu item as "<Menu_Item>"
#    And I select modifier as "<Modifier>"
#    And I click Done to get back
#    And I click Payment button in the Order Management Screen
#    And I click credit card payment on payment window
#   # Then I should see card type window
#    #And I click visa card type as "<card_type>"
#    #And I click ok button in card type window
#    Then I should see total screen
#    And I click tip as 10
#    Then I should see tip is added with menu total as "<Total>"
#    And I click the Continue button on the Total screen
#    Then I should see your order card screen
#    Then I should see tip added on order screen
#    Then I should see service charge as "<service_charge>"
#    And I click manual button on the your order screen
#    And I pass the card number as "<card_number>"
#    And I pass card name as "<card_name>"
#    And I pass expire date as "<expire_date>"
#    And I click Process button on card screen
#    And I click Ok button in receipt printer popup
#   # Then I should see signature pad screen
#    #And I click tick mark button
#   #    Then I should see the print or send receipt
##    And I click No thanks Button on the print receipt
#   #    Then I should see the print or send receipt
##    And I click No thanks Button on the print receipt
#    Then I should get back to the Table Layout tab
#    And I click Table Layout tab
    And I click power button
    Examples:
      | table_no | number_of_seats |  Menu_Item     | Modifier |  card_number      | expire_date | card_name | Total    | service_charge |
      | T14      |1                |  French Friese | Steak    |  3530111333300000 | 1224        | JCB       | $ 15.00  | $ 0.00         |

#
#  Scenario Outline: Normal check with CC payment with tips and with service charge
#    And I click new check button on the Table layout screen
#    And I select table as "<table_no>"
#    And I select the number of seats as "<number_of_seats>"
#    And I tap Continue to finish selecting the number of seats
#    And I get check number
#    And I select FOOD as category
#    And I select menu item as "<Menu_Item>"
#    And I select modifier as "<Modifier>"
#    And I click Done to get back
#    And I click Payment button in the Order Management Screen
#    And I click credit card payment on payment window
#   # Then I should see card type window
#    #And I click visa card type as "<card_type>"
#    #And I click ok button in card type window
#    Then I should see total screen
#    And I click tip as 10
#    Then I should see tip is added with menu total as "<Total>"
#    And I click the Continue button on the Total screen
#    Then I should see your order card screen
#    Then I should see tip added on order screen
#    Then I should see service charge as "<service_charge>"
#    And I click manual button on the your order screen
#    And I pass the Amex card number as "<card_number>"
#    And I pass card name as "<card_name>"
#    And I pass expire date as "<expire_date>"
#    And I click Process button on card screen
#    And I click Ok button in receipt printer popup
#  #  Then I should see signature pad screen
#   # And I click tick mark button
#   #    Then I should see the print or send receipt
##    And I click No thanks Button on the print receipt
#   #    Then I should see the print or send receipt
##    And I click No thanks Button on the print receipt
#    Then I should get back to the Table Layout tab
#    And I click power button
#    Examples:
#      | table_no | number_of_seats |  Menu_Item     | Modifier | card_number     | expire_date | card_name | Total    | service_charge |
#      | T14       |1               |  French Friese | Steak    | 371449635398431 | 1224        | Amex      | $ 15.00  | $ 0.00         |


  Scenario Outline: Normal check with HA payment
    And I click new check button on the Table layout screen
    And I select table as "<table_no>"
    And I select the number of seats as "<number_of_seats>"
    And I tap Continue to finish selecting the number of seats
    And I get check number
    And I click Add Customer Button
    And I search for "<customer_name>"
    When I click "<customer_name>" to select customer for the seat
    And I select FOOD as category
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
    And I click Ok button in receipt printer popup
   #    Then I should see the print or send receipt
#    And I click No thanks Button on the print receipt
    Then I should get back to the Table Layout tab
    And I click Table Layout tab
   # And I click power button
    #Examples:
   #   | table_no | number_of_seats | Menu_Item | Modifier   | SubTotal |  Total | customer_name |
  #    | T8       |1                |  French Friese | Steak | TL 65,00 | TL 65,00 | Auto ragav  |

 # Scenario Outline: Normal check with HA payment with tips
    And I click new check button on the Table layout screen
    And I select table as "<table_no>"
    And I select the number of seats as "<number_of_seats>"
    And I tap Continue to finish selecting the number of seats
    And I get check number
    And I click Add Customer Button
    And I search for "<customer_name>"
    When I click "<customer_name>" to select customer for the seat
    And I select FOOD as category
    And I select menu item as "<Menu_Item>"
    And I select modifier as "<Modifier>"
    And I click Done to get back
    Then I should see orderscreen with menu item prize as "<SubTotal>"
    Then I should see orderscreen with menu item Total without Discount or Tax as "<Total>"
    And I click Payment button in the Order Management Screen
    And I click house payment from the payment method popup
    Then I should see total screen
    And I click custom for tip adjustment
    Then I should see tip is added with menu total as "<Total>"
    Then I should see total amount as "<total>" on total screen
    And I click the Continue button on the Total screen
    Then I should see your order card screen
    And I click Process button on card screen
    And I click Ok button in receipt printer popup
   #    Then I should see the print or send receipt
#    And I click No thanks Button on the print receipt
    Then I should get back to the Table Layout tab
    And I click Table Layout tab
   # And I click power button
   # Examples:
    #  | table_no | number_of_seats | Menu_Item | Modifier   | SubTotal |  Total | total | customer_name |
     # | T8       |1                |  French Friese | Steak | TL 65,00 | TL 65,00 | TL 75,00 | Auto ragav |

  #Scenario Outline: Normal check with Side CC payment
    And I click new check button on the Table layout screen
    And I select table as "<table_no>"
    And I select the number of seats as "<number_of_seats>"
    And I tap Continue to finish selecting the number of seats
    And I get check number
    And I select FOOD as category
    And I select menu item as "<Menu_Item>"
    And I select modifier as "<Modifier>"
    And I click Done to get back
    And I click Payment button in the Order Management Screen
    And I click side cc button in the payment window
  #  Then I should see card type window
   # And I click visa card type as "<card_type>"
    #And I click ok button in card type window
    Then I should see total screen
    And I click the Continue button on the Total screen
    Then I should see the Payment window
    And I click Submit button on the Payment Window
   #    Then I should see the print or send receipt
#    And I click No thanks Button on the print receipt
    Then I should get back to the Table Layout tab
    And I click Table Layout tab
  #  And I click power button
   # Examples:
    #  | table_no | number_of_seats |  Menu_Item | Modifier |card_type|
    #  | T15       |1              |  French Friese | Steak | JCB     |

 # Scenario Outline: Normal check with Side CC payment with tips and without service charge
    And I click new check button on the Table layout screen
    And I select table as "<table_no>"
    And I select the number of seats as "<number_of_seats>"
    And I tap Continue to finish selecting the number of seats
    And I get check number
    And I select FOOD as category
    And I select menu item as "<Menu_Item>"
    And I select modifier as "<Modifier>"
    And I click Done to get back
    And I click Payment button in the Order Management Screen
    And I click side cc button in the payment window
   # Then I should see card type window
    #And I click visa card type as "<card_type>"
    #And I click ok button in card type window
    Then I should see total screen
    And I click tip as 10
    Then I should see tip is added with menu total as "<Total>"
    Then I should see total amount as "<total>" on total screen
    And I click the Continue button on the Total screen
    Then I should see the Payment window
    And I click Submit button on the Payment Window
   #    Then I should see the print or send receipt
#    And I click No thanks Button on the print receipt
    Then I should get back to the Table Layout tab
    And I click power button
    Examples:
      | table_no | number_of_seats | Menu_Item      | Modifier   | SubTotal |  Total  | total   | customer_name |
      | T19      |1                |  French Friese | Steak      | $ 15.00  | $ 15.00 | $ 25.00 | Auto ragav    |



  Scenario Outline: Verify whether application display Transfer server screen when user clicks the Transfer button present in the table layout screen
   # Given I'm logged in
    #And I close the order type window
#    And I click All
#    Then I should see check stats Screen
#    And I click Table Layout tab
    And I click Transfer button
    Then I should see transfer to server
    And I click cancel button on the table layout screen
    And I click QSR tab
    And I close the order type window

  # Verify whether application can allow user to select Gift card on check option screen from order Screen
    And I click Options button
    Then I should see the Check Options screen
    When I click Gift card Button
    Then I should see Gift card window
    And I click cancel button on the table layout screen
#    And I click Back button on Check Options Screen

  # Verify whether application can allow to select cancel in gift card screen
    And I click Options button
    Then I should see the Check Options screen
    When I click Gift card Button
    Then I should see Gift card window
    And I click cancel button on the table layout screen
#    Then I should see the Check Options screen
#    And I click Back button on Check Options Screen

# Verify whether application allow user to select Tax Exempt in check option from order Screen
    And I click Options button
    Then I should see the Check Options screen
    And I click Tax Exempt Button
#    Then I should see tax exempt reasons
#    And I click Back button on Tax Exempt window
#    And I click Back button on Check Options Screen

 # Verify whether application can allow user to click back button before giving tax exempt in the Tax exempt screen
    And I click Options button
    Then I should see the Check Options screen
    And I click Tax Exempt Button
#    Then I should see tax exempt reasons
#    And I click Back button on Tax Exempt window
#    And I click Back button on Check Options Screen

 # Verify whether application allow user to select open item in check option from order Screen
    And I click Options button
    Then I should see the Check Options screen
    And I click Open Item button
    Then I should see open item screen
    And I click cancel button on the table layout screen
#    And I click Back button on Check Options Screen

  # Verify whether application can allow user to click back button in Gratuity screen
    And I click Options button
    Then I should see the Check Options screen
    And I click Gratuity button
    Then I should see Add Gratuity screen
    And I click Back button on the gratuity screen
#    And I click Back button on Check Options Screen

  # Verify whether application can allow to navigate back to the check options screen from open Item when user Clicks back option from open item screen
    And I click Options button
    Then I should see the Check Options screen
    And I click Open Item button
    Then I should see open item screen
    And I click cancel button on the table layout screen
#    Then I should see the Check Options screen
#    And I click Back button on Check Options Screen

  # Verify whether application can allow user to select discount on check option screen from order Screen
    And I click Options button
    Then I should see the Check Options screen
    And I click discount on check option screen
    Then I should see Check Based Discount Screen
    And I click Back button on Tax Exempt window
#    And I click Back button on Check Options Screen

  # Verify whether application can display already created discounts in discount screen under item Discount,check discount when user clicks discount from check option
#    And I click Options button
#    Then I should see the Check Options screen
#    And I click discount on check option screen
#    Then I should see item discount
#    Then I should see Check discount
#    Then I should see open check discount
#    And I click Back button on Tax Exempt window
#    And I click Back button on Check Options Screen

 # Verify whether application can allow user to click back button in Discount screen
    And I select Discount on the Order screen
    Then I should see Check Based Discount Screen
    And I click Back button on Discount Screen
    Then I Should get back to the Order Screen


 # Scenario Outline: Verify whether application allow user to view sub total in ordering screen before adding menu item to the order screen
    Then I should see orderscreen with menu item prize as "<SubTotal>"
    And I click All
    Then I should see check stats Screen
    And I click power button

    Examples:
      |SubTotal|
      |$ 0.00 |


  Scenario Outline: Verify whether application allow user to view sub total in ordering screen after adding menu item to the order screen
    And I click new check button on the Table layout screen
    And I select table as "T8"
    And I select the number of seats as "1"
    And I tap Continue to finish selecting the number of seats
    And I get check number
    And I select FOOD as category
    And I select menu item as "<Menu_Item>"
    And I select modifier as "<Modifier>"
    And I click Done to get back
    Then I should see orderscreen with menu item prize as "<SubTotal>"
    And I click Void button on order management screen
    Then I should see All orders are voided
    And I click Done button on the Popup


  #Scenario Outline: Verify whether application allow user to view tax in ordering screen before adding menu item to the order screen for tax Exclusive item(single tax)
    Then I should see the tax amount reflected to the check as "<Tax>"
   # And I click All
    #Then I should get back to the Table Layout tab
    #And I click power button
    #Examples:
     # |Menu_Item      |Modifier    |SubTotal|Tax |
     # | French Friese | Steak      |TL 65,00 |TL 0,00|




 # Scenario Outline: Verify whether application allow user to view tax in ordering screen after adding menu item to the order screen for tax Exclusive item(single tax) Based on menu item in order screen
    Then I should see orderscreen with menu item prize as "<SubTotal2>"
    Then I should see the tax amount reflected to the check as "<Tax>"
    And I select Pasta as category
    And I select menu item as "<Menu_Item1>"
    And I select modifier as "<Modifier1>"
    And I click Done to get back
    Then I should see orderscreen with menu item prize as "<SubTotal1>"
    Then I should see the tax amount reflected to the check as "<Tax1>"
    Then I should see orderscreen with menu item Total without Discount or Tax as "<Total>"
    And I click Void button on order management screen
    Then I should see All orders are voided
    And I click Done button on the Popup

  #Scenario Outline: Verify whether application allow user to view Discount in ordering screen before adding discount to menu item in the orderScreen
#    Then I should see the Discount amount reflected to the check as "<Discount>"
    And I click All
    Then I should see check stats Screen
    And I click power button

    Examples:
      |Menu_Item      |Modifier    |SubTotal|Tax      |Menu_Item1|Modifier1    |SubTotal2|Tax    |SubTotal1   | Tax1      | Total        |Discount |
      | French Friese | Steak      |$ 15.00 |$ 0.00   | Ravioli  | Butter      |$ 0.00   |$ 0.00  |$ 14.00     |$ 1.40     | $ 15.40      |$ 0.00   |


  Scenario Outline:Verify whether application allows the user to Fire the Hold Menu Item
    And I click new check button on the Table layout screen
    And I select table as "<table_no>"
    And I select the number of seats as "<number_of_seats2>"
    And I tap Continue to finish selecting the number of seats
    And I get check number
    And I select FOOD as category
    And I select menu item as "<Menu_Item>"
    And I select modifier as "<Modifier>"
    And I click Done to get back
    And I select menu item as "<Menu_Item1>"
    And I select modifier as "<Modifier1>"
    And I click Done to get back
    And I select menu item as "<Menu_Item2>"
    And I click table number on the order screen
    And I click Options button
    Then I should see the Check Options screen
    And I click Hold to put order on hold
    And I click Done in the hold window
    When I click Back to return to Order Management Screen
    Then I should see the hold icon over the order section
    And I click menu item as "<Menu_Item>" to see Menu option screen
    And I click Fire to send menu item to kitchen
    Then I should see do you want to send hold menu items to kitchen popup message
    And I click Yes button on send to kitchen popup
    And I click menu item as "<Menu_Item1>" to see Menu option screen
    And I click Fire to send menu item to kitchen
    Then I should see do you want to send hold menu items to kitchen popup message
    And I click Yes button on send to kitchen popup
    And I click menu item as "<Menu_Item2>" to see Menu option screen
    And I click Fire to send menu item to kitchen
    Then I should see do you want to send hold menu items to kitchen popup message
    And I click Yes button on send to kitchen popup
    And I click Void button on order management screen
    Then I should see the void reason popup
    And I click void Reason on the void popup
    And I click Add Button on the void reason popup
#    Then I should see Receipt Printer popup
#    And I click Done button on the Popup
    And I closed the order type window
    And I click All
    Then I should see check stats Screen
#    And I click power button

#    Examples:
#      |order_Type| Menu_Item | Menu_Item1 | Modifier | Menu_Item2 | Modifier1 |
#      |QSR   | Garlic Bread | Tuna Tacos | 4 BBQ | Onion Rings | Croutons|

  #Scenario Outline: Verify whether application allows the user to void Menu Items without asking the Void reason
   # And I click All
    #Then I should see check stats Screen
    And I click Table Layout tab
    And I click new check button on the Table layout screen
    And I select table as "<table_no>"
    And I select the number of seats as "<number_of_seats2>"
    And I tap Continue to finish selecting the number of seats
    And I get check number
    And I select FOOD as category
    And I select menu item as "<Menu_Item3>"
    And I select modifier as "<Modifier3>"
    And I click Done to get back
    And I select menu item as "<Menu_Item2>"
    And I click seat 2 for add menu item
    And I select menu item as "<Menu_Item3>"
    And I select modifier as "<Modifier3>"
    And I click Done to get back
    And I select menu item as "<Menu_Item2>"
    And I click the split seat from Order screen
    Then I should see the Split Screen
    And I click seat one on the split screen
    And I click Pay Button in Split Screen
    Then I should see the Payment window
    And I click cash button from the payment method popup
    And I click the Exit button in the payment window
    Then I should see the Split Screen
    And I click the Back button on Split Screen
    Then I Should get back to the Order Screen
    And I click seat 2 for add menu item
    And I click Void button on order management screen
    Then I should see payment made on this check popup message
    And I click Done button on the Popup
    And I click cash button from the payment method popup
    And I click Submit button on the Payment Window
    #  Then I should see the print or send receipt
     # And I click No thanks Button on the print receipt
    Then I should get back to the Table Layout tab
   # And I click power button

   # Examples:
    #  | table_no | number_of_seats | Menu_Item | Modifier | Menu_Item1 |
     # | T14         |2              | French Friese | Steak  | Onion Rings |

  #Scenario Outline: Verify whether user can able to navigate to the split seat screen when user clicks the split seat button in order screen without ordering the placed menu items
   # And I click All
    #Then I should see check stats Screen
    And I click Table Layout tab
    And I click new check button on the Table layout screen
    And I select table as "<table_no>"
    And I select the number of seats as "<number_of_seats2>"
    And I tap Continue to finish selecting the number of seats
    And I get check number
    And I select FOOD as category
    And I select menu item as "<Menu_Item3>"
    And I select modifier as "<Modifier3>"
    And I click Done to get back
    And I click the split seat from Order screen
    Then I should see the Split Screen
    And I click the Back button on Split Screen
    And I click Void button on order management screen
    Then I should see All orders are voided
    And I click Done button on the Popup
    And I click All
    Then I should get back to the Table Layout tab
   # And I click power button

   # Examples:
    #  | table_no | number_of_seats | Menu_Item | Modifier |
     # | T14         |2              | French Friese | Steak  |



  #Scenario Outline: Verify whether user can able to navigate to the split seat screen when user clicks the split seat button in order screen after ordering menu items
   # And I click All
    #Then I should see check stats Screen
    And I click Table Layout tab
    And I click new check button on the Table layout screen
    And I select table as "<table_no>"
    And I select the number of seats as "<number_of_seats2>"
    And I tap Continue to finish selecting the number of seats
    And I get check number
    And I select FOOD as category
    And I select menu item as "<Menu_Item3>"
    And I select modifier as "<Modifier3>"
    And I click Done to get back
    And I click Order button in the order management screen
    And I click the split seat from Order screen
    Then I should see the Split Screen
    And I click the Back button on Split Screen
    And I click Void button on order management screen
    And I click void Reason on the void popup
    And I click Add Button on the void reason popup
#    Then I should see Receipt Printer popup
#    And I click Done button on the Popup
    Then I should get back to the Table Layout tab
   # And I click power button

  #  Examples:
   #   | table_no | number_of_seats | Menu_Item | Modifier |
    #  | T14      |2              | French Friese | Steak  |



 # Scenario Outline: Verify whether user can able to navigate to the split seat screen when user create the check with multiple seats and pay amount for one seat
  #  And I click All
   # Then I should see check stats Screen
    And I click Table Layout tab
    And I click new check button on the Table layout screen
    And I select table as "<table_no>"
    And I select the number of seats as "<number_of_seats2>"
    And I tap Continue to finish selecting the number of seats
    And I get check number
    And I select FOOD as category
    And I select menu item as "<Menu_Item3>"
    And I select modifier as "<Modifier3>"
    And I click Done to get back
    And I click seat 2 for add menu item

    And I select menu item as "<Menu_Item3>"
    And I select modifier as "<Modifier3>"
    And I click Done to get back
    And I click Cash button for Complete Sale
    And I click Exact button on the cash pop-up
    And I click Enter Button on the cash pop-up
    And I click table number on the Order Screen as "<table_no>"
    And I click the split seat from Order screen
    Then I should see the Split Screen
    And I click seat one on the split screen
    And I click Pay Button in Split Screen
    Then I should see the Payment window
    And I click cash button from the payment method popup
    And I click Submit button on the Payment Window
    #  Then I should see the print or send receipt
     # And I click No thanks Button on the print receipt
    Then I should get back to the Table Layout tab
  #  And I click power button
  #  Examples:
   #   | table_no | number_of_seats | Menu_Item | Modifier |
    #  | T14      |2              | French Friese | Steak  |


  #Scenario Outline: Verify whether menu items present in their repective seats when user navigate to the split seat screen before ordering menu items
   # And I click All
   # Then I should see check stats Screen
    And I click Table Layout tab
    And I click new check button on the Table layout screen
    And I select table as "<table_no>"
    And I select the number of seats as "<number_of_seats1>"
    And I tap Continue to finish selecting the number of seats
    And I get check number
    And I select FOOD as category
    And I select menu item as "<Menu_Item3>"
    And I select modifier as "<Modifier3>"
    And I click Done to get back
    And I click the split seat from Order screen
    Then I should see the Split Screen
    Then I should see "<Menu_Item3>" present in respective seat in split screen
    And I click seat one on the split screen
    And I click Pay Button in Split Screen
    Then I should see the Payment window
    And I click cash button from the payment method popup
    And I click Submit button on the Payment Window
    #  Then I should see the print or send receipt
     # And I click No thanks Button on the print receipt
    Then I should get back to the Table Layout tab
   # And I click power button
   # Examples:
    #  | table_no | number_of_seats | Menu_Item | Modifier |
     # | T14      |         1     | French Friese | Steak  |



  #Scenario Outline: Verify whether menu items present in their repective seats when user navigate to the split seat screen after odering menu items
   # And I click All
   # Then I should see check stats Screen
    And I click Table Layout tab
    And I click new check button on the Table layout screen
    And I select table as "<table_no>"
    And I select the number of seats as "<number_of_seats1>"
    And I tap Continue to finish selecting the number of seats
    And I get check number
    And I select FOOD as category
    And I select menu item as "<Menu_Item3>"
    And I select modifier as "<Modifier3>"
    And I click Done to get back
    And I click Order button in the order management screen
    And I click the split seat from Order screen
    Then I should see the Split Screen
    Then I should see "<Menu_Item3>" present in respective seat in split screen
    And I click seat one on the split screen
    And I click Pay Button in Split Screen
    Then I should see the Payment window
    And I click cash button from the payment method popup
    And I click Submit button on the Payment Window
    #  Then I should see the print or send receipt
     # And I click No thanks Button on the print receipt
    Then I should get back to the Table Layout tab
  #  And I click power button
   # Examples:
    #  | table_no | number_of_seats | Menu_Item | Modifier |
     # | T14      | 1             | French Friese | Steak  |



  #Scenario Outline: Verify whether user able to view all the seats by navigating the seats in split seat screen if more than 4 seats present
   # And I click All
   # Then I should see check stats Screen
    And I click Table Layout tab
    And I click new check button on the Table layout screen
    And I select table as "<table_no>"
    And I select the number of seats as "<number_of_seats5>"
    And I tap Continue to finish selecting the number of seats
    And I get check number
    And I select FOOD as category
    And I select menu item as "<Menu_Item3>"
    And I select modifier as "<Modifier3>"
    And I click Done to get back
    And I click seat 2 for add menu item

    And I select menu item as "<Menu_Item3>"
    And I select modifier as "<Modifier3>"
    And I click Done to get back
    And I click seat 3 for add menu item

    And I select menu item as "<Menu_Item3>"
    And I select modifier as "<Modifier3>"
    And I click Done to get back
    And I click Seat 4 for add menu item

    And I select menu item as "<Menu_Item3>"
    And I select modifier as "<Modifier3>"
    And I click Done to get back
    And I click Seat 5 for add menu item

    And I select menu item as "<Menu_Item3>"
    And I select modifier as "<Modifier3>"
    And I click Done to get back
    And I click the split seat from Order screen
    Then I should see the Split Screen
    Then I should see created seat in split seat
    And I click the Back button on Split Screen
    And I click Void button on order management screen
    Then I should see All orders are voided
    And I click Done button on the Popup
    And I click All
    Then I should see check stats Screen
    And I click Table Layout tab
   # And I click power button
  #  Examples:
   #   | table_no | number_of_seats | Menu_Item | Modifier |
    #  | T14      | 5            | French Friese | Steak  |

 # Scenario Outline: Verify whether user can able to drag the unordered menu item from one seat to another seat
   # And I click All
    #Then I should see check stats Screen
    #And I click Table Layout tab
    And I click new check button on the Table layout screen
    And I select table as "<table_no>"
    And I select the number of seats as "<number_of_seats2>"
    And I tap Continue to finish selecting the number of seats
    And I get check number
    And I select FOOD as category
    And I select menu item as "<Menu_Item3>"
    And I select modifier as "<Modifier3>"
    And I click Done to get back
    And I click seat 2 for add menu item
    And I select menu item as "<Menu_Item3>"
    And I select modifier as "<Modifier3>"
    And I click Done to get back
    And I click the split seat from Order screen
    Then I should see the Split Screen
    And I click on item
    And I click seat two on the split screen
    Then I should see selected seat item should club into seat two
    And I click the save & close button on the split screen
    Then I Should get back to the Order Screen
    And I click Cash button for Complete Sale
    And I click Exact button on the cash pop-up
    And I click Enter Button on the cash pop-up
    #  Then I should see the print or send receipt
     # And I click No thanks Button on the print receipt
    Then I should get back to the Table Layout tab
 #   And I click power button
  #  Examples:
   #   | table_no | number_of_seats | Menu_Item | Modifier |
    #  | T13      | 2            | French Friese | Steak  |



 # Scenario Outline: Verify whether user can able to drag the ordered menu item from one seat to another seat
  #  And I click All
  #  Then I should see check stats Screen
  #  And I click Table Layout tab
    And I click new check button on the Table layout screen
    And I select table as "<table_no>"
    And I select the number of seats as "<number_of_seats2>"
    And I tap Continue to finish selecting the number of seats
    And I get check number
    And I select FOOD as category
    And I select menu item as "<Menu_Item3>"
    And I select modifier as "<Modifier3>"
    And I click Done to get back
    And I click seat 2 for add menu item
    And I select menu item as "<Menu_Item>"
    And I select modifier as "<Modifier>"
    And I click Done to get back
    And I click table number on the Order Screen as "<table_no>"
    And I click Order button in the order management screen
    And I click the split seat from Order screen
    Then I should see the Split Screen
    And I click on item
    And I click seat two on the split screen
    Then I should see selected seat item should club into seat two
    And I click the save & close button on the split screen
    Then I Should get back to the Order Screen
    And I click Cash button for Complete Sale
    And I click Exact button on the cash pop-up
    And I click Enter Button on the cash pop-up
    #  Then I should see the print or send receipt
     # And I click No thanks Button on the print receipt
    Then I should get back to the Table Layout tab
  #  And I click power button
   # Examples:
   #   | table_no | number_of_seats | Menu_Item | Modifier |Menu_Item1| Modifier1 |
   #   | T13      | 2            | French Friese | Steak  | Garlic Bread | 4 BBQ  |



 # Scenario Outline: Verify whether user can able to drag paid seat menu items to unpaid seat when user create the check with multiple seats and pay amount for one seat
  #  And I click All
   # Then I should see check stats Screen
    And I click Table Layout tab
    And I click new check button on the Table layout screen
    And I select table as "<table_no1>"
    And I select the number of seats as "<number_of_seats2>"
    And I tap Continue to finish selecting the number of seats
    And I get check number
    And I select FOOD as category
    And I select menu item as "<Menu_Item3>"
    And I select modifier as "<Modifier3>"
    And I click Done to get back
    And I click seat 2 for add menu item
    And I select menu item as "<Menu_Item>"
    And I select modifier as "<Modifier>"
    And I click Done to get back
    And I click table number on the Order Screen as "<table_no1>"
    And I click Order button in the order management screen
    And I click the split seat from Order screen
    Then I should see the Split Screen
    And I click seat one on the split screen
    And I click Pay Button in Split Screen
    Then I should see the Payment window
    And I click cash button from the payment method popup
    And I click the Exit button in the payment window
    Then I should see the Split Screen
    And I click on item
    And I click seat two on the split screen
    Then I should see order cannot moved popup message
    And I click Done button on the Popup
    And I click the save & close button on the split screen
    Then I Should get back to the Order Screen
    And I click Payment button in the Order Management Screen
    And I click cash button from the payment method popup
    And I click Submit button on the Payment Window
    #  Then I should see the print or send receipt
     # And I click No thanks Button on the print receipt
    Then I should get back to the Table Layout tab
  #  And I click power button
   # Examples:
  #    | table_no | number_of_seats | Menu_Item | Modifier |Menu_Item1| Modifier1 |
   #   | T13      | 2            | French Friese | Steak  | Garlic Bread | 4 BBQ  |


#  Scenario Outline: Verify whether user can able to drag unpaid seat menu items to paid seat when user create the check with multiple seats and pay amount for one seat
  #  And I click All
  #  Then I should see check stats Screen
#    And I click Table Layout tab
    And I click new check button on the Table layout screen
    And I select table as "<table_no1>"
    And I select the number of seats as "<number_of_seats2>"
    And I tap Continue to finish selecting the number of seats
    And I get check number
    And I select FOOD as category
    And I select menu item as "<Menu_Item3>"
    And I select modifier as "<Modifier3>"
    And I click Done to get back
    And I click seat 2 for add menu item
    And I select menu item as "<Menu_Item>"
    And I select modifier as "<Modifier>"
    And I click Done to get back
    And I click table number on the Order Screen as "<table_no1>"
    And I click the split seat from Order screen
    Then I should see the Split Screen
    And I click seat one on the split screen
    And I click Pay Button in Split Screen
    Then I should see the Payment window
    And I click cash button from the payment method popup
    And I click the Exit button in the payment window
    Then I should see the Split Screen
    Then I should see seat as paid
    And I click on item as "<Menu_Item>"
    And I click seat one on the split screen
    Then I should see order cannot moved popup message
    And I click Done button on the Popup
    And I click the save & close button on the split screen
    Then I Should get back to the Order Screen
    And I click Payment button in the Order Management Screen
    And I click cash button from the payment method popup
    And I click Submit button on the Payment Window
    #  Then I should see the print or send receipt
     # And I click No thanks Button on the print receipt
    Then I should get back to the Table Layout tab
    And I click power button
   # Examples:
    #  | table_no | number_of_seats | Menu_Item | Modifier |Menu_Item1| Modifier1 |
    #  | T13      | 2             | French Friese | Steak  |Garlic Bread | 4 BBQ  |

    Examples:
      |order_Type| table_no |table_no1 |number_of_seats1| number_of_seats2 |number_of_seats5 | Menu_Item    | Menu_Item1 | Modifier | Menu_Item2 | Modifier1 | Menu_Item3  | Modifier3 |
      |QSR       |T14       |T15       |1               |2                 |5                | Garlic Bread | Tuna Tacos | 4 BBQ | Onion Rings | Croutons    |French Friese | Steak  |


  Scenario Outline: Verify whether application allow to split the check based amount discount with type before tax based on the exclusive tax menu item price present in the seat if user move the menu item from one seat to another seat

    And I click new check button on the Table layout screen
    And I select table as "<table_no>"
    And I select the number of seats as "<number_of_seats2>"
    And I tap Continue to finish selecting the number of seats
    And I get check number
    And I select Pasta as category
    And I select menu item as "<Menu_Item>"
    And I select modifier as "<Modifier>"
    And I click Done to get back
    And I select menu item as "<Menu_Item>"
    And I select modifier as "<Modifier>"
    And I click Done to get back
    And I select Discount on the Order screen
    Then I should see Check Based Discount Screen
    And I click Discount as "<Discount>"
    And I click Back button on Discount Screen
    Then I should see orderscreen with menu item prize as "<SubTotal>"
    Then I should see the tax amount reflected to the check as "<Tax>"
    Then I should see the Discount amount reflected to the check as "<txtDiscount>"
    Then I should see orderscreen with menu item Total as "<Total>"
    And I click table number on the Order Screen as "<table_no>"
    And I click the split seat from Order screen
    Then I should see the Split Screen
    And I click on item as Ravioli
    And I click seat two on the split screen
    Then I should see menu item as Ravioli added into next seat
    And I click the save & close button on the split screen
    Then I Should get back to the Order Screen
    And I click Void button on order management screen
    Then I should see All orders are voided
    And I click Done button on the Popup
    And I click All
    Then I should see check stats Screen
    #And I click Table Layout tab
 #   And I click power button

  #Scenario Outline: Verify whether application allow to split the check based amount discount with type After tax based on the exclusive tax menu item price present in the seat if user move the menu item from one seat to another seat
   # And I click All
   # Then I should see check stats Screen
    And I click Table Layout tab
    And I click new check button on the Table layout screen
    And I select table as "<table_no>"
    And I select the number of seats as "<number_of_seats2>"
    And I tap Continue to finish selecting the number of seats
    And I get check number
    And I select Menu as category
    And I select menu item as "<Menu_Item1>"
    And I select menu item as "<Menu_Item1>"
    And I select Discount on the Order screen
    Then I should see Check Based Discount Screen
    And I click Discount as "<Discount1>"
    And I click Back button on Discount Screen
    Then I should see orderscreen with menu item prize as "<SubTotal1>"
    Then I should see the tax amount reflected to the check as "<Tax1>"
    Then I should see the Discount amount reflected to the check as "<txtDiscount1>"
    Then I should see orderscreen with menu item Total as "<Total1>"
    And I click table number on the Order Screen as "<table_no>"
    And I click the split seat from Order screen
    Then I should see the Split Screen
    And I click on item as cake
    And I click seat two on the split screen
    Then I should see menu item as cake added into next seat
    And I click the save & close button on the split screen
    Then I Should get back to the Order Screen
    And I click Void button on order management screen
    Then I should see All orders are voided
    And I click Done button on the Popup
    And I click All
    Then I should see check stats Screen
    And I click Table Layout tab
   # And I click power button
  #  Examples:
   #   | table_no | number_of_seats | Menu_Item1  |Discount1            | SubTotal1    | Tax1       | txtDiscount1 |Total1       |
    #  | T12      | 2               |  cake    |CB-AfterTax-Amount1000 | TL 3.000,00 | TL 300,00 | TL 1.000,00 | TL 2.300,00 |



 # Scenario Outline: Verify whether application allow to split the check based amount discount with type before tax based on the inclusive tax menu item price present in the seat if user move the menu item from one seat to another seat
  #  And I click All
   # Then I should see check stats Screen
   # And I click Table Layout tab
    And I click new check button on the Table layout screen
    And I select table as "<table_no1>"
    And I select the number of seats as "<number_of_seats2>"
    And I tap Continue to finish selecting the number of seats
    And I get check number
    And I select Pasta as category
    And I select menu item as RavioliPesto for Item Based Inclusive Tax
    And I select modifier as "<Modifier>"
    And I click Done to get back

    And I select menu item as RavioliPesto for Item Based Inclusive Tax
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
    And I click table number on the Order Screen as "<table_no1>"
    And I click the split seat from Order screen
    Then I should see the Split Screen
    And I click on item as Ravioli Pesto
    And I click seat two on the split screen
    Then I should see menu item as Ravioli Pesto added into next seat
    And I click the save & close button on the split screen
    Then I Should get back to the Order Screen
    And I click Void button on order management screen
    Then I should see All orders are voided
    And I click Done button on the Popup
    And I click All
    Then I should see check stats Screen
   # And I click Table Layout tab
   # And I click power button
  #  Examples:
   #   | table_no | number_of_seats | Modifier2 | Tax2       | SubTotal2    | Total2       | Discount2              |txtDiscount2 |
    #  | T8       |2                | Butter   | TL 254,54 | TL 3.800,00 | TL 2.800,00 |CB-BeforeTax-Amount1000| TL 1.000,00|


  #Scenario Outline: Verify whether application allow to split the check based amount discount with type after tax based on the inclusive tax menu item price present in the seat if user move the menu item from one seat to another seat
   # And I click All
    #Then I should see check stats Screen
    #And I click Table Layout tab
    And I click new check button on the Table layout screen
    And I select table as "<table_no>"
    And I select the number of seats as "<number_of_seats2>"
    And I tap Continue to finish selecting the number of seats
    And I get check number
    And I select Pasta as category
    And I select menu item as RavioliPesto for Item Based Inclusive Tax
    And I select modifier as "<Modifier>"
    And I click Done to get back

    And I select menu item as RavioliPesto for Item Based Inclusive Tax
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
    And I click table number on the Order Screen as "<table_no>"
    And I click the split seat from Order screen
    Then I should see the Split Screen
    And I click on item as Ravioli Pesto
    And I click seat two on the split screen
    Then I should see menu item as Ravioli Pesto added into next seat
    And I click the save & close button on the split screen
    Then I Should get back to the Order Screen
    And I click Void button on order management screen
    Then I should see All orders are voided
    And I click Done button on the Popup
    And I click All
    Then I should see check stats Screen
    And I click Table Layout tab
    And I click power button
   # Examples:
   #   | table_no | number_of_seats | Modifier | Tax       | SubTotal    | Total       | Discount              |Discount1 |
   #   | T8       |2                | Butter   | TL 345,46 | TL 3.800,00 | TL 2.800,00 |CB-AfterTax-Amount1000| TL 1.000,00|

    Examples:
      | table_no |table_no1  |number_of_seats2 | Menu_Item | Modifier |Discount                | SubTotal    | Tax       | txtDiscount |Total         | Menu_Item1  |Discount1              | SubTotal1    | Tax1       | txtDiscount1 |Total1        | Tax2       | SubTotal2    | Total2       | Discount2              |txtDiscount2 |Tax3       | SubTotal3    | Total3       | Discount3              |txtDiscount3 |
      | T12      |T13        |2               |  Ravioli | Butter     |CB-BeforeTax-Amount1000 | $ 28.00     | $ 2.70    | $ 1.00      | $ 29.70      |cake         |CB-AfterTax-Amount1000 | $ 16.00      | $ 1.60     | $ 1.00       | $ 16.60      | $ 2.64     | $ 30.00      | $ 29.00      |CB-BeforeTax-Amount1000 | $ 1.00      |$ 2.73     | $ 30.00      | $ 29.00      |CB-AfterTax-Amount1000  | $ 1.00      |




  Scenario Outline:Verify whether application allow to split the check based percentage discount with type before tax based on the exclusive tax menu item price present in the seat if user move the menu item from one seat to another seat
    And I click new check button on the Table layout screen
    And I select table as "<table_no>"
    And I select the number of seats as "<number_of_seats2>"
    And I tap Continue to finish selecting the number of seats
    And I get check number
    And I select Pasta as category
    And I select menu item as "<Menu_Item>"
    And I select modifier as "<Modifier>"
    And I click Done to get back
    And I select menu item as "<Menu_Item>"
    And I select modifier as "<Modifier>"
    And I click Done to get back
    And I select Discount on the Order screen
    Then I should see Check Based Discount Screen
    And I click Discount as "<Discount>"
    And I click Back button on Discount Screen
    Then I should see orderscreen with menu item prize as "<SubTotal>"
    Then I should see the tax amount reflected to the check as "<Tax>"
    Then I should see the Discount amount reflected to the check as "<txtDiscount>"
    Then I should see orderscreen with menu item Total as "<Total>"
    And I click table number on the Order Screen as "<table_no>"
    And I click the split seat from Order screen
    Then I should see the Split Screen
    And I click on item as Ravioli
    And I click seat two on the split screen
    Then I should see menu item as Ravioli added into next seat
    And I click the save & close button on the split screen
    Then I Should get back to the Order Screen
    And I click Void button on order management screen
    Then I should see All orders are voided
    And I click Done button on the Popup
    And I click All
    Then I should see check stats Screen
    And I click Table Layout tab
   #And I click power button


  #Scenario Outline: Verify whether application allow to split the check based percentage discount with type after tax based on the exclusive tax menu item price present in the seat if user move the menu item from one seat to another seat
  #  And I click All
  #  Then I should see check stats Screen
  #  And I click Table Layout tab
    And I click new check button on the Table layout screen
    And I select table as "<table_no1>"
    And I select the number of seats as "<number_of_seats2>"
    And I tap Continue to finish selecting the number of seats
    And I get check number
    And I select Pasta as category
    And I select menu item as "<Menu_Item>"
    And I select modifier as "<Modifier>"
    And I click Done to get back
    And I select menu item as "<Menu_Item>"
    And I select modifier as "<Modifier>"
    And I click Done to get back
    And I select Discount on the Order screen
    Then I should see Check Based Discount Screen
    And I click Discount as "<Discount1>"
    And I click Back button on Discount Screen
    Then I should see orderscreen with menu item prize as "<SubTotal1>"
    Then I should see the tax amount reflected to the check as "<Tax1>"
    Then I should see the Discount amount reflected to the check as "<txtDiscount1>"
    Then I should see orderscreen with menu item Total as "<Total1>"
    And I click table number on the Order Screen as "<table_no1>"
    And I click the split seat from Order screen
    Then I should see the Split Screen
    And I click on item as Ravioli
    And I click seat two on the split screen
    Then I should see menu item as Ravioli added into next seat
    And I click the save & close button on the split screen
    Then I Should get back to the Order Screen
    And I click Void button on order management screen
    Then I should see All orders are voided
    And I click Done button on the Popup
    And I click All
    Then I should see check stats Screen
    And I click Table Layout tab
    #And I click power button
   # Examples:
    #  | table_no | number_of_seats | Menu_Item | Modifier |Discount            | SubTotal    | Tax       | Discount1 |Total       |
    #  | T12      | 2               |  Ravioli | Butter   | CB-AfterTax-Percentage10 | TL 3.800,00 | TL 380,00 | TL 380,00 | TL 3.800,00 |


  #Scenario Outline:Verify whether application allow to split the check based percentage discount with type before tax based on the inclusive tax menu item price present in the seat if user move the menu item from one seat to another seat
  #  And I click All
  #  Then I should see check stats Screen
    #  And I click Table Layout tab
    And I click new check button on the Table layout screen
    And I select table as "<table_no>"
    And I select the number of seats as "<number_of_seats2>"
    And I tap Continue to finish selecting the number of seats
    And I get check number
    And I select Pasta as category
    And I select menu item as RavioliPesto for Item Based Inclusive Tax
    And I select modifier as "<Modifier>"
    And I click Done to get back

    And I select menu item as RavioliPesto for Item Based Inclusive Tax
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
    And I click table number on the Order Screen as "<table_no>"
    And I click the split seat from Order screen
    Then I should see the Split Screen
    And I click on item as Ravioli Pesto
    And I click seat two on the split screen
    Then I should see menu item as Ravioli Pesto added into next seat
    And I click the save & close button on the split screen
    Then I Should get back to the Order Screen
    And I click Void button on order management screen
    Then I should see All orders are voided
    And I click Done button on the Popup
    And I click All
    Then I should see check stats Screen
    And I click Table Layout tab
  #  And I click power button
   # Examples:
    #  | table_no | number_of_seats | Modifier | Tax       | SubTotal    | Total       | Discount                |Discount1 |
    #  | T8       |2                | Butter   | TL 310,90 | TL 3.800,00 | TL 3.420,00 |CB-BeforeTax-Percentage10 | TL 380,00|


 # Scenario Outline: Verify whether application allow to split the check based percentage discount with type after tax based on the inclusive tax menu item price present in the seat if user move the menu item from one seat to another seat
  #  And I click All
  #  Then I should see check stats Screen
  #  And I click Table Layout tab
    And I click new check button on the Table layout screen
    And I select table as "<table_no>"
    And I select the number of seats as "<number_of_seats2>"
    And I tap Continue to finish selecting the number of seats
    And I get check number
    And I select Pasta as category
    And I select menu item as RavioliPesto for Item Based Inclusive Tax
    And I select modifier as "<Modifier>"
    And I click Done to get back

    And I select menu item as RavioliPesto for Item Based Inclusive Tax
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
    And I click table number on the Order Screen as "<table_no>"
    And I click the split seat from Order screen
    Then I should see the Split Screen
    And I click on item as Ravioli Pesto
    And I click seat two on the split screen
    Then I should see menu item as Ravioli Pesto added into next seat
    And I click the save & close button on the split screen
    Then I Should get back to the Order Screen
    And I click Void button on order management screen
    Then I should see All orders are voided
    And I click Done button on the Popup
    And I click All
    Then I should see check stats Screen
    And I click Table Layout tab
    And I click power button
   # Examples:
  #    | table_no | number_of_seats | Modifier | Tax       | SubTotal    | Total       | Discount              |Discount1 |
   #   | T8       |2                | Butter   | TL 345,46 | TL 3.800,00 | TL 3.454,54 |CB-AfterTax-Percentage10| TL 345,46|

    Examples:
      | table_no |table_no1 | number_of_seats2| Menu_Item| Modifier |Discount                   | SubTotal    | Tax       | txtDiscount |Total       |Discount1                | SubTotal1   | Tax1      | txtDiscount1 |Total1       |Tax2       | SubTotal2    | Total2       | Discount2                |txtDiscount2 | Tax3       | SubTotal3    | Total3      | Discount3              |txtDiscount3 |
      | T13      |T16       | 2               |  Ravioli | Butter   | CB-BeforeTax-Percentage10 | $ 28.00     | $ 2.52    | $ 2.80      |$ 27.72      |CB-AfterTax-Percentage10 | $ 28.00    | $ 2.80    | $ 2.80       | $ 28.00     |$ 2.45     | $ 30.00      | $ 27.00      |CB-BeforeTax-Percentage10 | $ 3.00      | $ 2.73     | $ 30.00      | $ 27.28     |CB-AfterTax-Percentage10| $ 2.72      |


  Scenario Outline: Verify whether application allow to split the check based set price discount with type before tax based on the exclusive tax menu item price present in the seat if user move the menu item from one seat to another seat

    And I click new check button on the Table layout screen
    And I select table as "<table_no>"
    And I select the number of seats as "<number_of_seats>"
    And I tap Continue to finish selecting the number of seats
    And I get check number
    And I select Menu as category
    And I select menu item as "<Menu_Item>"
    And I select menu item as "<Menu_Item>"
    And I select Discount on the Order screen
    Then I should see Check Based Discount Screen
    And I click Discount as "<Discount>"
    And I click Back button on Discount Screen
    Then I should see orderscreen with menu item prize as "<SubTotal>"
    Then I should see the tax amount reflected to the check as "<Tax>"
    Then I should see the Discount amount reflected to the check as "<txtDiscount>"
    Then I should see orderscreen with menu item Total as "<Total>"
    And I click the split seat from Order screen
    Then I should see the Split Screen
    And I click on item as cake
    And I click seat two on the split screen
    Then I should see menu item as cake added into next seat
    And I click the save & close button on the split screen
    Then I Should get back to the Order Screen
    And I click Void button on order management screen
    Then I should see All orders are voided
    And I click Done button on the Popup
    And I click All
    Then I should see check stats Screen
    And I click Table Layout tab
  #  And I click power button


  #Scenario Outline: Verify whether application allow to split the check based set price discount with type After tax based on the exclusive tax menu item price present in the seat if user move the menu item from one seat to another seat
  #  And I click All
  #  Then I should see check stats Screen
    #And I click Table Layout tab
    And I click new check button on the Table layout screen
    And I select table as "<table_no>"
    And I select the number of seats as "<number_of_seats>"
    And I tap Continue to finish selecting the number of seats
    And I get check number
    And I select Menu as category
    And I select menu item as "<Menu_Item>"
    And I select menu item as "<Menu_Item>"
    And I select Discount on the Order screen
    Then I should see Check Based Discount Screen
    And I click Discount as "<Discount1>"
    And I click Back button on Discount Screen
    Then I should see orderscreen with menu item prize as "<SubTotal1>"
    Then I should see the tax amount reflected to the check as "<Tax1>"
    Then I should see the Discount amount reflected to the check as "<txtDiscount1>"
    Then I should see orderscreen with menu item Total as "<Total1>"
    And I click the split seat from Order screen
    Then I should see the Split Screen
    And I click on item as cake
    And I click seat two on the split screen
    Then I should see menu item as cake added into next seat
    And I click the save & close button on the split screen
    Then I Should get back to the Order Screen
    And I click Void button on order management screen
    Then I should see All orders are voided
    And I click Done button on the Popup
    And I click All
    Then I should see check stats Screen
    And I click Table Layout tab
   # And I click power button
   # Examples:
    #  | table_no | number_of_seats | Menu_Item|Discount                  | SubTotal    | Tax       | Discount1   |Total       |
    #  | T17      | 2               |  cake    |CB-AfterTax-SetPrice1000 | TL 3.000,00 | TL 300,00 | TL 2.000,00 | TL 1.300,00 |


 # Scenario Outline: Verify whether application allow to split the check based set price discount with type before tax based on the inclusive tax menu item price present in the seat if user move the menu item from one seat to another seat
 #   And I click All
 #   Then I should see check stats Screen
 #   And I click Table Layout tab
    And I click new check button on the Table layout screen
    And I select table as "<table_no>"
    And I select the number of seats as "<number_of_seats>"
    And I tap Continue to finish selecting the number of seats
    And I get check number
    And I select Pasta as category
    And I select menu item as RavioliPesto for Item Based Inclusive Tax
    And I select modifier as "<Modifier1>"
    And I click Done to get back

    And I select menu item as RavioliPesto for Item Based Inclusive Tax
    And I select modifier as "<Modifier1>"
    And I click Done to get back
    And I select Discount on the Order screen
    Then I should see Check Based Discount Screen
    And I click Discount as "<Discount2>"
    And I click Back button on Discount Screen
    Then I should see orderscreen with menu item prize as "<SubTotal2>"
    Then I should see the tax amount reflected to the check as "<Tax2>"
    Then I should see the Discount amount reflected to the check as "<txtDiscount2>"
    Then I should see orderscreen with menu item Total as "<Total2>"
    And I click table number on the Order Screen as "<table_no>"
    And I click the split seat from Order screen
    Then I should see the Split Screen
    And I click on item as Ravioli Pesto
    And I click seat two on the split screen
    Then I should see menu item as Ravioli Pesto added into next seat
    And I click the save & close button on the split screen
    Then I Should get back to the Order Screen
    And I click Void button on order management screen
    Then I should see All orders are voided
    And I click Done button on the Popup
    And I click All
    Then I should see check stats Screen
    And I click Table Layout tab
 #   And I click power button
   ## Examples:
     # | table_no | number_of_seats | Modifier | Tax       | SubTotal    | Total       | Discount                |Discount1 |
     # | T8       |2                | Butter   | TL 90,90 | TL 3.800,00 | TL 1.000,00 |CB-BeforeTax-SetPrice1000| TL 2.800,00|



#  Scenario Outline: Verify whether application allow to split the check based set price discount with type before tax based on the inclusive tax menu item price present in the seat if user move the menu item from one seat to another seat
 #   And I click All
  #  Then I should see check stats Screen
  #  And I click Table Layout tab
    And I click new check button on the Table layout screen
    And I select table as "<table_no>"
    And I select the number of seats as "<number_of_seats>"
    And I tap Continue to finish selecting the number of seats
    And I get check number
    And I select Pasta as category
    And I select menu item as RavioliPesto for Item Based Inclusive Tax
    And I select modifier as "<Modifier1>"
    And I click Done to get back

    And I select menu item as RavioliPesto for Item Based Inclusive Tax
    And I select modifier as "<Modifier1>"
    And I click Done to get back
    And I select Discount on the Order screen
    Then I should see Check Based Discount Screen
    And I click Discount as "<Discount3>"
    And I click Back button on Discount Screen
    Then I should see orderscreen with menu item prize as "<SubTotal3>"
    Then I should see the tax amount reflected to the check as "<Tax3>"
    Then I should see the Discount amount reflected to the check as "<txtDiscount3>"
    Then I should see orderscreen with menu item Total as "<Total3>"
    And I click table number on the Order Screen as "<table_no>"
    And I click the split seat from Order screen
    Then I should see the Split Screen
    And I click on item as Ravioli Pesto
    And I click seat two on the split screen
    Then I should see menu item as Ravioli Pesto added into next seat
    And I click the save & close button on the split screen
    Then I Should get back to the Order Screen
    And I click Void button on order management screen
    Then I should see All orders are voided
    And I click Done button on the Popup
    And I click All
    Then I should see check stats Screen
    And I click Table Layout tab
    And I click power button
   # Examples:
    #  | table_no | number_of_seats | Modifier | Tax       | SubTotal    | Total       | Discount              |Discount1 |
    #  | T8       |2                | Butter   | TL 345,46 | TL 3.800,00 | TL 1.000,00 |CB-AfterTax-SetPrice1000| TL 2.800,00|

    Examples:
      | table_no | number_of_seats | Menu_Item|Modifier1|Discount                  | SubTotal    | Tax       | txtDiscount   |Total       |Discount1                  | SubTotal1    | Tax1       | txtDiscount1   |Total1       |Tax2       | SubTotal2    | Total2       | Discount2                |txtDiscount2 |Tax3       | SubTotal3    | Total3       | Discount3              |txtDiscount3 |
      | T17      | 2               |  cake    |Butter   |CB-BeforeTax-SetPrice1000 | $ 16.00     | $ 1.00    | $ 6.00        | $ 11.00    |CB-AfterTax-SetPrice1000   | $ 16.00      | $ 1.60     | $ 6.00         | $ 11.60     |$ 0.91     | $ 30.00      | $ 10.00      |CB-BeforeTax-SetPrice1000 | $ 20.00     |$ 2.73     | $ 30.00      | $ 10.00      |CB-AfterTax-SetPrice1000|$ 20.00      |


  Scenario Outline: verify whether application allow to split the check based free item (exclusive tax menu item) discount with type before tax based on the menu item price present in the seat if user move the menu item from one seat to another seat
    And I click new check button on the Table layout screen
    And I select table as "<table_no>"
    And I select the number of seats as "<number_of_seats>"
    And I tap Continue to finish selecting the number of seats
    Then I Should get back to the Order Screen
    And I get check number
    And I select Desserts as category
    And I select menu item as "<Menu_Item>"
    And I select menu item as "<Menu_Item>"
    And I select Discount on the Order screen
    Then I should see Check Based Discount Screen
    And I click Discount as "<Discount>"
    And I click Back button on Discount Screen
    Then I should see orderscreen with as Onion Rings EACH
    Then I should see orderscreen with menu item prize as "<SubTotal>"
    Then I should see the tax amount reflected to the check as "<Tax>"
    Then I should see orderscreen with menu item Total without Discount or Tax as "<Total>"
    And I click the split seat from Order screen
    Then I should see the Split Screen
    And I click on item as cheesecake
    And I click seat two on the split screen
    Then I should see menu item as cheese cake added into next seat
    And I click the save & close button on the split screen
    Then I Should get back to the Order Screen
    And I click Void button on order management screen
    Then I should see All orders are voided
    And I click Done button on the Popup
    And I click All
    Then I should see check stats Screen
    And I click Table Layout tab
  # And I click power button
 #  Examples:
  #   | table_no |number_of_seats|Menu_Item   |Discount              | SubTotal    | Tax      | Total     |
  #   | T19      |2              | Cheesecake | CB-BeforeTax-Free300 | TL 900,00   | TL 90,00 | TL 990,00 |

# Scenario Outline: verify whether application allow to split the check based free item (exclusive tax menu item) discount with type after tax based on the menu item price present in the seat if user move the menu item from one seat to another seat
 #  And I click All
 #  Then I should see check stats Screen
 #  And I click Table Layout tab
    And I click new check button on the Table layout screen
    And I select table as "<table_no>"
    And I select the number of seats as "<number_of_seats>"
    And I tap Continue to finish selecting the number of seats
    Then I Should get back to the Order Screen
    And I get check number
    And I select Desserts as category
    And I select menu item as "<Menu_Item>"
    And I select menu item as "<Menu_Item>"
    And I select Discount on the Order screen
    Then I should see Check Based Discount Screen
    And I click Discount as "<Discount1>"
    And I click Back button on Discount Screen
    Then I should see orderscreen with as Onion Rings EACH
    Then I should see orderscreen with menu item prize as "<SubTotal>"
    Then I should see the tax amount reflected to the check as "<Tax>"
    Then I should see orderscreen with menu item Total without Discount or Tax as "<Total>"
    And I click the split seat from Order screen
    Then I should see the Split Screen
    And I click on item as cheesecake
    And I click seat two on the split screen
    Then I should see menu item as cheese cake added into next seat
    And I click the save & close button on the split screen
    Then I Should get back to the Order Screen
    And I click Void button on order management screen
    Then I should see All orders are voided
    And I click Done button on the Popup
    And I click All
    Then I should see check stats Screen
    And I click Table Layout tab
   #And I click power button
 #  Examples:
  #   | table_no |number_of_seats|Menu_Item   |Discount1             | SubTotal    | Tax      | Total     |
  #   | T12      |2              | Cheesecake | CB-AfterTax-Free300 | TL 900,00   | TL 90,00 | TL 990,00 |


# Scenario Outline: verify whether application allow to split the check based free item (inclusive tax menu item) discount with type before tax based on the menu item price present in the seat if user move the menu item from one seat to another seat
 #  And I click All
  # Then I should see check stats Screen
   #And I click Table Layout tab
    And I click new check button on the Table layout screen
    And I select table as "<table_no>"
    And I select the number of seats as "<number_of_seats>"
    And I tap Continue to finish selecting the number of seats
    And I get check number
    And I select Pasta as category
    And I select menu item as RavioliPesto for Item Based Inclusive Tax
    And I select modifier as "<Modifier2>"
    And I click Done to get back

    And I select menu item as RavioliPesto for Item Based Inclusive Tax
    And I select modifier as "<Modifier2>"
    And I click Done to get back
    And I select Discount on the Order screen
    Then I should see Check Based Discount Screen
    And I click Discount as "<Discount>"
    And I click Back button on Discount Screen
    Then I should see orderscreen with menu item prize as "<SubTotal2>"
    Then I should see the tax amount reflected to the check as "<Tax2>"
    Then I should see orderscreen with menu item Total without Discount or Tax as "<Total2>"
    And I click table number on the Order Screen as "<table_no>"
    And I click the split seat from Order screen
    Then I should see the Split Screen
    And I click on item as Ravioli Pesto
    And I click seat two on the split screen
    Then I should see menu item as Ravioli Pesto added into next seat
    And I click the save & close button on the split screen
    Then I Should get back to the Order Screen
    And I click Void button on order management screen
    Then I should see All orders are voided
    And I click Done button on the Popup
    And I click All
    And I click Table Layout tab
 #  And I click power button
  #Examples:
  #   | table_no | number_of_seats | Modifier | Tax       | SubTotal   | Total       | Discount          |
  #   | T8       |2                | Butter   | TL 355,46 | TL 3.900,00 | TL 3.910,00 |CB-BeforeTax-Free300|



 #Scenario Outline: verify whether application allow to split the check based free item (inclusive tax menu item) discount with type after tax based on the menu item price present in the seat if user move the menu item from one seat to another seat
   #And I click All
   #Then I should see check stats Screen
   #And I click Table Layout tab
    And I click new check button on the Table layout screen
    And I select table as "<table_no>"
    And I select the number of seats as "<number_of_seats>"
    And I tap Continue to finish selecting the number of seats
    And I get check number
    And I select Pasta as category
    And I select menu item as RavioliPesto for Item Based Inclusive Tax
    And I select modifier as "<Modifier2>"
    And I click Done to get back

    And I select menu item as RavioliPesto for Item Based Inclusive Tax
    And I select modifier as "<Modifier2>"
    And I click Done to get back
    And I select Discount on the Order screen
    Then I should see Check Based Discount Screen
    And I click Discount as "<Discount1>"
    And I click Back button on Discount Screen
    Then I should see orderscreen with menu item prize as "<SubTotal2>"
    Then I should see the tax amount reflected to the check as "<Tax2>"
    Then I should see orderscreen with menu item Total without Discount or Tax as "<Total2>"
    And I click table number on the Order Screen as "<table_no>"
    And I click the split seat from Order screen
    Then I should see the Split Screen
    And I click on item as Ravioli Pesto
    And I click seat two on the split screen
    Then I should see menu item as Ravioli Pesto added into next seat
    And I click the save & close button on the split screen
    Then I Should get back to the Order Screen
    And I click Void button on order management screen
    Then I should see All orders are voided
    And I click Done button on the Popup
    And I click All
    Then I should see check stats Screen
    And I click Table Layout tab
  # And I click power button
  # Examples:
  #   | table_no | number_of_seats | Modifier | Tax       | SubTotal   | Total       | Discount          |
  #   | T8       |2                | Butter   | TL 355,46 | TL 3.900,00 | TL 3.910,00 |CB-AfterTax-Free300|



 #Scenario Outline: verify whether application allow to calculate discount for gratuity when user move to the split seat screen
  # And I click All
  # Then I should see check stats Screen
  # And I click Table Layout tab
    And I click new check button on the Table layout screen
    And I select table as "<table_no>"
    And I select the number of seats as "<number_of_seats>"
    And I tap Continue to finish selecting the number of seats
    And I get check number
    And I select Menu as category
    And I select menu item as "<Menu_Item1>"
    And I click Options button
    Then I should see the Check Options screen
    And I click Gratuity button
    Then I should see Add Gratuity screen
    And I click Gratuity Fixed button
    Then I Should get back to the Order Screen
    And I click discount on check option screen
    Then I should see Check Based Discount Screen
    And I click Discount as "<Discount>"
    And I click Back button on Discount Screen
    Then I should see orderscreen with menu item prize as "<SubTotal3>"
    Then I should see the tax amount reflected to the check as "<Tax3>"
    Then I should see the Gratuity amount reflected to the check as "<Gratuity3>"
    Then I should see orderscreen with menu item Total as "<Total3>"
    And I click the split seat from Order screen
    Then I should see the Split Screen
    And I click the save & close button on the split screen
    Then I Should get back to the Order Screen
    And I click Void button on order management screen
    Then I should see All orders are voided
    And I click Done button on the Popup
    And I click All
    Then I should see check stats Screen
    And I click Table Layout tab
    And I click power button
   # Examples:
    #  | table_no | number_of_seats | Menu_Item1 |  SubTotal   | Tax       | Gratuity   | Total       |Discount             |
    #  | T9         |1              |  Halwa    | TL 1.100,00 | TL 110,00 |  TL 110,00 | TL 1.320,00 | CB-BeforeTax-Free300 |

    Examples:
      | table_no |number_of_seats|Menu_Item   |Menu_Item1 |Discount              |Discount1             | SubTotal    | Tax      | Total     |Modifier2 | Tax2       | SubTotal2   | Total2       |SubTotal3   | Tax3       | Gratuity3   | Total3       |
      | T19      |2              | Cheesecake |Halwa      | CB-BeforeTax-Free300 |CB-AfterTax-Free300   | $ 32.00     | $ 3.20   | $ 35.20   | Butter   | $ 2.93     | $ 32.00     | $ 32.20      |$ 12.00     | $ 1.20     |  $ 1.20     | $ 14.40      |


  Scenario Outline:Verify whether application allow user to move the exclusive tax menu item from one seat to another seat along with Item based amount discount with type before tax which is assigned to that menu item
    And I click new check button on the Table layout screen
    And I select table as "<table_no>"
    And I select the number of seats as "<number_of_seats>"
    And I tap Continue to finish selecting the number of seats
    And I get check number
    And I select Pasta as category
    And I select menu item as "<Menu_Item>"
    And I select modifier as "<Modifier>"
    And I click Done to get back

    And I select menu item as "<Menu_Item>"
    And I select modifier as "<Modifier>"
    And I click Done to get back
    And I select Discount on the Order screen
    Then I should see Check Based Discount Screen
    And I click Discount as "<Discount>"
    And I click Back button on Discount Screen
    Then I should see orderscreen with menu item prize as "<SubTotal>"
    Then I should see the tax amount reflected to the check as "<Tax>"
    Then I should see the Discount amount reflected to the check as "<txtDiscount>"
    Then I should see orderscreen with menu item Total as "<Total>"
    And I click the split seat from Order screen
    Then I should see the Split Screen
    And I click on item as Ravioli
    And I click seat two on the split screen
    Then I should see menu item as Ravioli added into next seat
    And I click the save & close button on the split screen
    Then I Should get back to the Order Screen
    And I click Void button on order management screen
    Then I should see All orders are voided
    And I click Done button on the Popup
    And I click All
    Then I should see check stats Screen
   # And I click Table Layout tab
   # And I click power button


  #Scenario Outline: Verify whether application allow user to move the exclusive tax menu item from one seat to another seat along with Item based amount discount with type after tax which is assigned to that menu item
   # And I click All
   # Then I should see check stats Screen
    And I click Table Layout tab
    And I click new check button on the Table layout screen
    And I select table as "<table_no>"
    And I select the number of seats as "<number_of_seats>"
    And I tap Continue to finish selecting the number of seats
    And I get check number
    And I select Pasta as category
    And I select menu item as "<Menu_Item>"
    And I select modifier as "<Modifier>"
    And I click Done to get back
    And I select menu item as "<Menu_Item>"
    And I select modifier as "<Modifier>"
    And I click Done to get back
    And I select Discount on the Order screen
    Then I should see Check Based Discount Screen
    And I click Discount as "<Discount1>"
    And I click Back button on Discount Screen
    Then I should see orderscreen with menu item prize as "<SubTotal1>"
    Then I should see the tax amount reflected to the check as "<Tax1>"
    Then I should see the Discount amount reflected to the check as "<txtDiscount1>"
    Then I should see orderscreen with menu item Total as "<Total1>"
    And I click the split seat from Order screen
    Then I should see the Split Screen
    And I click on item as Ravioli
    And I click seat two on the split screen
    Then I should see menu item as Ravioli added into next seat
    And I click the save & close button on the split screen
    Then I Should get back to the Order Screen
    And I click Void button on order management screen
    Then I should see All orders are voided
    And I click Done button on the Popup
    And I click All
    Then I should see check stats Screen
    And I click Table Layout tab
   # And I click power button
  #  Examples:
   #   | table_no | number_of_seats |Menu_Item | Modifier  |Discount           | SubTotal    | Tax       | Discount1 |Total        |
   #   | T12      | 2               | Ravioli  | Butter    |IB-AfterTax-Amount | TL 3.800,00 | TL 380,00 | TL 20,00 | TL 4.160,00 |

   #  Scenario Outline: Verify whether application allow user to move the inclusive tax menu item from one seat to another seat along with Item based amount discount with type before tax which is assigned to that menu item
   # And I click All
   # Then I should see check stats Screen
    #And I click Table Layout tab
    And I click new check button on the Table layout screen
    And I select table as "<table_no>"
    And I select the number of seats as "<number_of_seats>"
    And I tap Continue to finish selecting the number of seats
    And I get check number
    And I select Pasta as category
    And I select menu item as RavioliPesto for Item Based Inclusive Tax
    And I select modifier as "<Modifier>"
    And I click Done to get back

    And I select menu item as RavioliPesto for Item Based Inclusive Tax
    And I select modifier as "<Modifier>"
    And I click Done to get back
    And I select Discount on the Order screen
    Then I should see Check Based Discount Screen
    And I click Discount as "<Discount>"
    And I click Back button on Discount Screen
    Then I should see orderscreen with menu item prize as "<SubTotal2>"
    Then I should see the tax amount reflected to the check as "<Tax2>"
    Then I should see the Discount amount reflected to the check as "<txtDiscount2>"
    Then I should see orderscreen with menu item Total as "<Total2>"
    And I click table number on the Order Screen as "<table_no>"
    And I click the split seat from Order screen
    Then I should see the Split Screen
    And I click on item as Ravioli Pesto
    And I click seat two on the split screen
    Then I should see menu item as Ravioli Pesto added into next seat
    And I click the save & close button on the split screen
    Then I Should get back to the Order Screen
    And I click Void button on order management screen
    Then I should see All orders are voided
    And I click Done button on the Popup
    And I click All
    Then I should see check stats Screen
    And I click Table Layout tab
  #  And I click power button
    #Examples:
    #  | table_no | number_of_seats | Modifier | Tax       | SubTotal    | Total       | Discount1 |   Discount       |
    #  | T8       |2                | Butter   | TL 343,64 | TL 3.800,00 | TL 3.780,00 |TL 20,00  |IB-BeforeTax-Amount|




 # Scenario Outline: Verify whether application allow user to move the inclusive tax menu item from one seat to another seat along with Item based amount discount with type after tax which is assigned to that menu item
  #  And I click All
  #  Then I should see check stats Screen
  #  And I click Table Layout tab
    And I click new check button on the Table layout screen
    And I select table as "<table_no>"
    And I select the number of seats as "<number_of_seats>"
    And I tap Continue to finish selecting the number of seats
    And I get check number
    And I select Pasta as category
    And I select menu item as RavioliPesto for Item Based Inclusive Tax
    And I select modifier as "<Modifier>"
    And I click Done to get back

    And I select menu item as RavioliPesto for Item Based Inclusive Tax
    And I select modifier as "<Modifier>"
    And I click Done to get back
    And I select Discount on the Order screen
    Then I should see Check Based Discount Screen
    And I click Discount as "<Discount1>"
    And I click Back button on Discount Screen
    Then I should see orderscreen with menu item prize as "<SubTotal3>"
    Then I should see the tax amount reflected to the check as "<Tax3>"
    Then I should see the Discount amount reflected to the check as "<txtDiscount3>"
    Then I should see orderscreen with menu item Total as "<Total3>"
    And I click table number on the Order Screen as "<table_no>"
    And I click the split seat from Order screen
    Then I should see the Split Screen
    And I click on item as Ravioli Pesto
    And I click seat two on the split screen
    Then I should see menu item as Ravioli Pesto added into next seat
    And I click the save & close button on the split screen
    Then I Should get back to the Order Screen
    And I click Void button on order management screen
    Then I should see All orders are voided
    And I click Done button on the Popup
    And I click All
    Then I should see check stats Screen
    And I click Table Layout tab
    And I click power button
  #  Examples:
  #    | table_no | number_of_seats | Modifier | Tax       | SubTotal    | Total       | Discount1    |Discount          |
  #    | T8       |2                | Butter   | TL 345,46 | TL 3.800,00 | TL 3.780,00 | TL 20,00 |IB-AfterTax-Amount |

    Examples:
      | table_no | number_of_seats  |Menu_Item | Modifier |Discount             |txtDiscount | SubTotal    | Tax       | Total       | Discount1         | SubTotal1   | Tax1      | txtDiscount1 |Total1       |Tax2      | SubTotal2   | Total2      | txtDiscount2 | Tax3     | SubTotal3   | Total3      | txtDiscount3  |
      | T12       |2              | Ravioli    | Butter   | IB-BeforeTax-Amount |$ 2.00      | $ 28.00     | $ 2.60    | $ 28.60     |IB-AfterTax-Amount | $ 28.00     | $ 2.80    | $ 2.00       | $ 28.80     |$ 2.55    | $ 30.00     | $ 28.00     | $ 2.00       |$ 2.73    | $ 30.00     | $ 28.00     | $ 2.00        |


  Scenario Outline:Verify whether application allow user to move the exclusive tax menu item from one seat to another seat along with Item based percentage discount with type before tax which is assigned to that menu item
    And I click new check button on the Table layout screen
    And I select table as "<table_no>"
    And I select the number of seats as "<number_of_seats>"
    And I tap Continue to finish selecting the number of seats
    And I get check number
    And I select Pasta as category
    And I select menu item as "<Menu_Item>"
    And I select modifier as "<Modifier>"
    And I click Done to get back

    And I select menu item as "<Menu_Item>"
    And I select modifier as "<Modifier>"
    And I click Done to get back
    And I select Discount on the Order screen
    Then I should see Check Based Discount Screen
    And I click Discount as "<Discount>"
    And I click Back button on Discount Screen
    Then I should see orderscreen with menu item prize as "<SubTotal>"
    Then I should see the tax amount reflected to the check as "<Tax>"
    Then I should see the Discount amount reflected to the check as "<txtDiscount>"
    Then I should see orderscreen with menu item Total as "<Total>"
    And I click the split seat from Order screen
    Then I should see the Split Screen
    And I click on item as Ravioli
    And I click seat two on the split screen
    Then I should see menu item as Ravioli added into next seat
    And I click the save & close button on the split screen
    Then I Should get back to the Order Screen
    And I click Void button on order management screen
    Then I should see All orders are voided
    And I click Done button on the Popup
    And I click All
    Then I should see check stats Screen
    And I click Table Layout tab
   # And I click power button
  #  Examples:
   #   | table_no | number_of_seats  |Menu_Item | Modifier |Discount                  |Discount1    | SubTotal    | Tax      | Total       |
   #   | T12       |2              | Ravioli    | Butter   | IB-BeforeTax-Percentage |TL 380,00  | TL 3.800,00 | TL 342,00 | TL 3.762,00 |

#  Scenario Outline:Verify whether application allow user to move the exclusive tax menu item from one seat to another seat along with Item based percentage discount with type After tax which is assigned to that menu item
 #   And I click All
 #   Then I should see check stats Screen
    And I click Table Layout tab
    And I click new check button on the Table layout screen
    And I select table as "<table_no>"
    And I select the number of seats as "<number_of_seats>"
    And I tap Continue to finish selecting the number of seats
    And I get check number
    And I select Pasta as category
    And I select menu item as "<Menu_Item>"
    And I select modifier as "<Modifier>"
    And I click Done to get back
    And I select menu item as "<Menu_Item>"
    And I select modifier as "<Modifier>"
    And I click Done to get back
    And I select Discount on the Order screen
    Then I should see Check Based Discount Screen
    And I click Discount as "<Discount1>"
    And I click Back button on Discount Screen
    Then I should see orderscreen with menu item prize as "<SubTotal1>"
    Then I should see the tax amount reflected to the check as "<Tax1>"
    Then I should see the Discount amount reflected to the check as "<txtDiscount1>"
    Then I should see orderscreen with menu item Total as "<Total1>"
    And I click the split seat from Order screen
    Then I should see the Split Screen
    And I click on item as Ravioli
    And I click seat two on the split screen
    Then I should see menu item as Ravioli added into next seat
    And I click the save & close button on the split screen
    Then I Should get back to the Order Screen
    And I click Void button on order management screen
    Then I should see All orders are voided
    And I click Done button on the Popup
    And I click All
    Then I should see check stats Screen
    And I click Table Layout tab
   # And I click power button
   # Examples:
    #  | table_no | number_of_seats  |Menu_Item | Modifier |Discount                |Discount1    | SubTotal    | Tax      | Total       |
    #  | T12       |2              | Ravioli    | Butter   | IB-AfterTax-Percentage |TL 380,00   | TL 3.800,00 | TL 380,00  |TL 3.800,00  |


 # Scenario Outline:Verify whether application allow user to move the inclusive tax menu item from one seat to another seat along with Item based percentage discount with type before tax which is assigned to that menu item
 #   And I click All
 #   Then I should see check stats Screen
  #  And I click Table Layout tab
    And I click new check button on the Table layout screen
    And I select table as "<table_no>"
    And I select the number of seats as "<number_of_seats>"
    And I tap Continue to finish selecting the number of seats
    And I get check number
    And I select Pasta as category
    And I select menu item as RavioliPesto for Item Based Inclusive Tax
    And I select modifier as "<Modifier>"
    And I click Done to get back

    And I select menu item as RavioliPesto for Item Based Inclusive Tax
    And I select modifier as "<Modifier>"
    And I click Done to get back
    And I select Discount on the Order screen
    Then I should see Check Based Discount Screen
    And I click Discount as "<Discount>"
    And I click Back button on Discount Screen
    Then I should see orderscreen with menu item prize as "<SubTotal2>"
    Then I should see the tax amount reflected to the check as "<Tax2>"
    Then I should see the Discount amount reflected to the check as "<txtDiscount2>"
    Then I should see orderscreen with menu item Total as "<Total2>"
    And I click table number on the Order Screen as "<table_no>"
    And I click the split seat from Order screen
    Then I should see the Split Screen
    And I click on item as Ravioli Pesto
    And I click seat two on the split screen
    Then I should see menu item as Ravioli Pesto added into next seat
    And I click the save & close button on the split screen
    Then I Should get back to the Order Screen
    And I click Void button on order management screen
    Then I should see All orders are voided
    And I click Done button on the Popup
    And I click All
    Then I should see check stats Screen
    And I click Table Layout tab
    #And I click power button
  #  Examples:
   #   | table_no | number_of_seats | Modifier | Tax       | SubTotal    | Total       | Discount1 |   Discount       |
   #   | T8       |2                | Butter   | TL 310,90 | TL 3.800,00 | TL 3.420,00 |TL 380,00  |IB-BeforeTax-Percentage|



 # Scenario Outline: Verify whether application allow user to move the inclusive tax menu item from one seat to another seat along with Item based percentage discount with type after tax which is assigned to that menu item
  #  And I click All
  #  Then I should see check stats Screen
  #  And I click Table Layout tab
    And I click new check button on the Table layout screen
    And I select table as "<table_no>"
    And I select the number of seats as "<number_of_seats>"
    And I tap Continue to finish selecting the number of seats
    And I get check number
    And I select Pasta as category
    And I select menu item as RavioliPesto for Item Based Inclusive Tax
    And I select modifier as "<Modifier>"
    And I click Done to get back
    And I select menu item as RavioliPesto for Item Based Inclusive Tax
    And I select modifier as "<Modifier>"
    And I click Done to get back
    And I select Discount on the Order screen
    Then I should see Check Based Discount Screen
    And I click Discount as "<Discount1>"
    And I click Back button on Discount Screen
    Then I should see orderscreen with menu item prize as "<SubTotal3>"
    Then I should see the tax amount reflected to the check as "<Tax3>"
    Then I should see the Discount amount reflected to the check as "<txtDiscount3>"
    Then I should see orderscreen with menu item Total as "<Total3>"
    And I click table number on the Order Screen as "<table_no>"
    And I click the split seat from Order screen
    Then I should see the Split Screen
    And I click on item as Ravioli Pesto
    And I click seat two on the split screen
    Then I should see menu item as Ravioli Pesto added into next seat
    And I click the save & close button on the split screen
    Then I Should get back to the Order Screen
    And I click Void button on order management screen
    Then I should see All orders are voided
    And I click Done button on the Popup
    And I click All
    Then I should see check stats Screen
    And I click Table Layout tab
    And I click power button
 #   Examples:
  #    | table_no | number_of_seats | Modifier | Tax       | SubTotal    | Total       | Discount1    |Discount          |
  #    | T8       |2                | Butter   | TL 345,46 | TL 3.800,00 | TL 3.454,54 | TL 345,46 |IB-AfterTax-Percentage |

    Examples:
      | table_no | number_of_seats  |Menu_Item | Modifier |Discount                  |txtDiscount    | SubTotal    | Tax      | Total       |Discount1                |txtDiscount1    | SubTotal1    | Tax1      | Total1       | Tax2          | SubTotal2    | Total2       | txtDiscount2 |Tax3           | SubTotal3    | Total3       | txtDiscount3    |
      | T12       |2                | Ravioli  | Butter   | IB-BeforeTax-Percentage  |$ 2.80         | $ 28.00     | $ 2.52   | $ 27.72     |IB-AfterTax-Percentage   |$ 2.80          | $ 28.00      | $ 2.80    | $ 28.00      |$ 2.45         | $ 30.00      | $ 27.00      | $ 3.00       |$ 2.73         | $ 30.00      | $ 27.28      | $ 2.72          |


  Scenario Outline: Verify whether application allow user to move the exclusive tax menu item from one seat to another seat along with Item based set price discount with type before tax which is assigned to that menu item
    And I click new check button on the Table layout screen
    And I select table as "<table_no>"
    And I select the number of seats as "<number_of_seats>"
    And I tap Continue to finish selecting the number of seats
    And I get check number
    And I select Pasta as category
    And I select menu item as "<Menu_Item>"
    And I select modifier as "<Modifier>"
    And I click Done to get back

    And I select menu item as "<Menu_Item>"
    And I select modifier as "<Modifier>"
    And I click Done to get back
    And I select Discount on the Order screen
    Then I should see Check Based Discount Screen
    And I click Discount as "<Discount>"
    And I click Back button on Discount Screen
    Then I should see orderscreen with menu item prize as "<SubTotal>"
    Then I should see the tax amount reflected to the check as "<Tax>"
    Then I should see the Discount amount reflected to the check as "<txtDiscount>"
    Then I should see orderscreen with menu item Total as "<Total>"
    And I click the split seat from Order screen
    Then I should see the Split Screen
    And I click on item as Ravioli
    And I click seat two on the split screen
    Then I should see menu item as Ravioli added into next seat
    And I click the save & close button on the split screen
    Then I Should get back to the Order Screen
    And I click Void button on order management screen
    Then I should see All orders are voided
    And I click Done button on the Popup
    And I click All
    Then I should see check stats Screen
    And I click Table Layout tab
   # And I click power button
  #  Examples:
   #   | table_no | number_of_seats  |Menu_Item | Modifier |Discount                  |Discount1    | SubTotal    | Tax       | Total       |
   #   | T12       |2              | Ravioli    | Butter   | IB-BeforeTax-SetPrice500 |TL 2.800,00  | TL 3.800,00 | TL 100,00 | TL 1.100,00 |

#  Scenario Outline: Verify whether application allow user to move the exclusive tax menu item from one seat to another seat along with Item based set price discount with type before tax which is assigned to that menu item
 #   And I click All
  #  Then I should see check stats Screen
   # And I click Table Layout tab
    And I click new check button on the Table layout screen
    And I select table as "<table_no>"
    And I select the number of seats as "<number_of_seats>"
    And I tap Continue to finish selecting the number of seats
    And I get check number
    And I select Pasta as category
    And I select menu item as "<Menu_Item>"
    And I select modifier as "<Modifier>"
    And I click Done to get back

    And I select menu item as "<Menu_Item>"
    And I select modifier as "<Modifier>"
    And I click Done to get back
    And I select Discount on the Order screen
    Then I should see Check Based Discount Screen
    And I click Discount as "<Discount1>"
    And I click Back button on Discount Screen
    Then I should see orderscreen with menu item prize as "<SubTotal1>"
    Then I should see the tax amount reflected to the check as "<Tax1>"
    Then I should see the Discount amount reflected to the check as "<txtDiscount1>"
    Then I should see orderscreen with menu item Total as "<Total1>"
    And I click the split seat from Order screen
    Then I should see the Split Screen
    And I click on item as Ravioli
    And I click seat two on the split screen
    Then I should see menu item as Ravioli added into next seat
    And I click the save & close button on the split screen
    Then I Should get back to the Order Screen
    And I click Void button on order management screen
    Then I should see All orders are voided
    And I click Done button on the Popup
    And I click All
    Then I should see check stats Screen
    And I click Table Layout tab
   # And I click power button
   # Examples:
  #    | table_no | number_of_seats  |Menu_Item | Modifier |Discount                 |Discount1    | SubTotal    | Tax       | Total       |
   #   | T12       |2               | Ravioli    | Butter   | IB-AfterTax-SetPrice500 |TL 2.800,00  | TL 3.800,00 | TL 380,00 | TL 1.380,00 |


  #Scenario Outline: Verify whether application allow user to move the inclusive tax menu item from one seat to another seat along with Item based set price discount with type before tax which is assigned to that menu item
  #  And I click All
    #Then I should see check stats Screen
    #And I click Table Layout tab
    And I click new check button on the Table layout screen
    And I select table as "<table_no>"
    And I select the number of seats as "<number_of_seats>"
    And I tap Continue to finish selecting the number of seats
    And I get check number
    And I select Pasta as category
    And I select menu item as RavioliPesto for Item Based Inclusive Tax
    And I select modifier as "<Modifier>"
    And I click Done to get back

    And I select menu item as RavioliPesto for Item Based Inclusive Tax
    And I select modifier as "<Modifier>"
    And I click Done to get back
    And I select Discount on the Order screen
    Then I should see Check Based Discount Screen
    And I click Discount as "<Discount>"
    And I click Back button on Discount Screen
    Then I should see orderscreen with menu item prize as "<SubTotal2>"
    Then I should see the tax amount reflected to the check as "<Tax2>"
    Then I should see the Discount amount reflected to the check as "<txtDiscount2>"
    Then I should see orderscreen with menu item Total as "<Total2>"
    And I click table number on the Order Screen as "<table_no>"
    And I click the split seat from Order screen
    Then I should see the Split Screen
    And I click on item as Ravioli Pesto
    And I click seat two on the split screen
    Then I should see menu item as Ravioli Pesto added into next seat
    And I click the save & close button on the split screen
    Then I Should get back to the Order Screen
    And I click Void button on order management screen
    Then I should see All orders are voided
    And I click Done button on the Popup
    And I click All
    Then I should see check stats Screen
    And I click Table Layout tab
    #And I click power button
   # Examples:
    #  | table_no | number_of_seats | Modifier | Tax       | SubTotal    | Total       | Discount1 |Discount               |
    #  | T8       |2                | Butter   | TL 90,90 | TL 3.800,00 | TL 1.000,00 | TL 2.800,00 |IB-BeforeTax-SetPrice500 |



 # Scenario Outline: Verify whether application allow user to move the inclusive tax menu item from one seat to another seat along with Item based set price discount with type before tax which is assigned to that menu item
   # And I click All
   # Then I should see check stats Screen
   # And I click Table Layout tab
    And I click new check button on the Table layout screen
    And I select table as "<table_no>"
    And I select the number of seats as "<number_of_seats>"
    And I tap Continue to finish selecting the number of seats
    And I get check number
    And I select Pasta as category
    And I select menu item as RavioliPesto for Item Based Inclusive Tax
    And I select modifier as "<Modifier>"
    And I click Done to get back

    And I select menu item as RavioliPesto for Item Based Inclusive Tax
    And I select modifier as "<Modifier>"
    And I click Done to get back
    And I select Discount on the Order screen
    Then I should see Check Based Discount Screen
    And I click Discount as "<Discount1>"
    And I click Back button on Discount Screen
    Then I should see orderscreen with menu item prize as "<SubTotal3>"
    Then I should see the tax amount reflected to the check as "<Tax3>"
    Then I should see the Discount amount reflected to the check as "<txtDiscount3>"
    Then I should see orderscreen with menu item Total as "<Total3>"
    And I click table number on the Order Screen as "<table_no>"
    And I click the split seat from Order screen
    Then I should see the Split Screen
    And I click on item as Ravioli Pesto
    And I click seat two on the split screen
    Then I should see menu item as Ravioli Pesto added into next seat
    And I click the save & close button on the split screen
    Then I Should get back to the Order Screen
    And I click Void button on order management screen
    Then I should see All orders are voided
    And I click Done button on the Popup
    And I click All
    Then I should see check stats Screen
    And I click Table Layout tab
    And I click power button
  #  Examples:
   #   | table_no | number_of_seats | Modifier | Tax       | SubTotal    | Total       | Discount1 |Discount               |
    #  | T8       |2                | Butter   | TL 345,46 | TL 3.800,00 | TL 1.000,00 | TL 2.800,00 |IB-AfterTax-SetPrice500 |

    Examples:
      | table_no | number_of_seats  |Menu_Item | Modifier |Discount                  |txtDiscount  | SubTotal    | Tax       | Total       | Discount1               |txtDiscount1 | SubTotal1   | Tax1      | Total1      | Tax2    | SubTotal2   | Total2      | txtDiscount2 | Tax3       | SubTotal3    | Total3       | txtDiscount3 |
      | T12       |2              | Ravioli    | Butter   | IB-BeforeTax-SetPrice500 |$ 26.00      | $ 28.00     | $ 0.20    | $ 2.20      | IB-AfterTax-SetPrice500 |$ 25.00      | $ 28.00     | $ 2.80    | $ 5.80      |$ 0.18   | $ 30.00     | $ 2.00      | $ 28.00      |$ 2.73      | $ 30.00      | $ 3.00       | $ 27.00      |


  Scenario Outline: Verify whether application allow user to move the exclusive tax menu item from one seat to another seat along with Item based free item(exclusive tax menu item) discount with type before tax which is assigned to that menu item
    And I click new check button on the Table layout screen
    And I select table as "<table_no>"
    And I select the number of seats as "<number_of_seats>"
    And I tap Continue to finish selecting the number of seats
    And I get check number
    And I select Pasta as category
    And I select menu item as "<Menu_Item>"
    And I select modifier as "<Modifier>"
    And I click Done to get back
    And I select menu item as "<Menu_Item>"
    And I select modifier as "<Modifier>"
    And I click Done to get back
    And I select Discount on the Order screen
    Then I should see Check Based Discount Screen
    And I click Discount as "<Discount>"
    And I click Back button on Discount Screen
    Then I should see orderscreen with as Onion Rings EACH
    Then I should see orderscreen with menu item prize as "<SubTotal>"
    Then I should see the tax amount reflected to the check as "<Tax>"
    Then I should see orderscreen with menu item Total without Discount or Tax as "<Total>"
    And I click the split seat from Order screen
    Then I should see the Split Screen
    And I click on item as Ravioli
    And I click seat two on the split screen
    Then I should see menu item as Ravioli added into next seat for Free Item
    And I click the save & close button on the split screen
    Then I Should get back to the Order Screen
    And I click Void button on order management screen
    Then I should see All orders are voided
    And I click Done button on the Popup
    And I click All
    Then I should see check stats Screen
    And I click Table Layout tab
   # And I click power button
   # Examples:
    #  | table_no | number_of_seats  |Menu_Item | Modifier |Discount                  | SubTotal    | Tax       | Total       |
    #  | T12       |2              | Ravioli    | Butter   | IB-BeforeTax-AsFreeItem  | TL 4.000,00 | TL 400,00 | TL 4.400,00 |

  #Scenario Outline: Verify whether application allow user to move the exclusive tax menu item from one seat to another seat along with Item based free item(exclusive tax menu item) discount with type after tax which is assigned to that menu item
   # And I click All
   # Then I should see check stats Screen
   # And I click Table Layout tab
    And I click new check button on the Table layout screen
    And I select table as "<table_no>"
    And I select the number of seats as "<number_of_seats>"
    And I tap Continue to finish selecting the number of seats
    And I get check number
    And I select Pasta as category
    And I select menu item as "<Menu_Item>"
    And I select modifier as "<Modifier>"
    And I click Done to get back

    And I select menu item as "<Menu_Item>"
    And I select modifier as "<Modifier>"
    And I click Done to get back
    And I select Discount on the Order screen
    Then I should see Check Based Discount Screen
    And I click Discount as "<Discount1>"
    And I click Back button on Discount Screen
    Then I should see orderscreen with as Onion Rings EACH
    Then I should see orderscreen with menu item prize as "<SubTotal>"
    Then I should see the tax amount reflected to the check as "<Tax>"
    Then I should see orderscreen with menu item Total without Discount or Tax as "<Total>"
    And I click the split seat from Order screen
    Then I should see the Split Screen
    And I click on item as Ravioli
    And I click seat two on the split screen
    Then I should see menu item as Ravioli added into next seat for Free Item
    And I click the save & close button on the split screen
    Then I Should get back to the Order Screen
    And I click Void button on order management screen
    Then I should see All orders are voided
    And I click Done button on the Popup
    And I click All
    Then I should see check stats Screen
    And I click Table Layout tab
    #And I click power button
  #  Examples:
   #   | table_no | number_of_seats  |Menu_Item | Modifier |Discount                 | SubTotal   | Tax       | Total       |
    #  | T12       |2              | Ravioli    | Butter   | IB-AfterTax-AsFreeItem |TL 4.000,00 | TL 400,00 | TL 4.400,00 |



  #Scenario Outline: Verify whether application allow user to move the inclusive tax menu item from one seat to another seat along with Item based free item(inclusive tax menu item) discount with type before tax which is assigned to that menu item
   # And I click All
    #Then I should see check stats Screen
   # And I click Table Layout tab
    And I click new check button on the Table layout screen
    And I select table as "<table_no>"
    And I select the number of seats as "<number_of_seats>"
    And I tap Continue to finish selecting the number of seats
    And I get check number
    And I select Pasta as category
    And I select menu item as RavioliPesto for Item Based Inclusive Tax
    And I select modifier as "<Modifier>"
    And I click Done to get back

    And I select menu item as RavioliPesto for Item Based Inclusive Tax
    And I select modifier as "<Modifier>"
    And I click Done to get back
    And I select Discount on the Order screen
    Then I should see Check Based Discount Screen
    And I click Discount as "<Discount2>"
    And I click Back button on Discount Screen
    Then I should see orderscreen with as Dosa EACH
    Then I should see orderscreen with menu item prize as "<SubTotal2>"
    Then I should see the tax amount reflected to the check as "<Tax2>"
    Then I should see orderscreen with menu item Total without Discount or Tax as "<Total2>"
    And I click table number on the Order Screen as "<table_no>"
    And I click the split seat from Order screen
    Then I should see the Split Screen
    And I click on item as Ravioli Pesto
    And I click seat two on the split screen
    Then I should see menu item as Ravioli Pesto added into next seat
    And I click the save & close button on the split screen
    Then I Should get back to the Order Screen
    And I click Void button on order management screen
    Then I should see All orders are voided
    And I click Done button on the Popup
    And I click All
    Then I should see check stats Screen
    And I click Table Layout tab
   # And I click power button
   # Examples:
   #   | table_no | number_of_seats | Modifier | Tax       | SubTotal    | Total        |Discount    |
   #   | T8       |2                | Butter   | TL 363,64 | TL 4.000,00 | TL 4.000,00 |IB-BF-AsFree |


 # Scenario Outline: Verify whether application allow user to move the inclusive tax menu item from one seat to another seat along with Item based free item(inclusive tax menu item) discount with type after tax which is assigned to that menu item
  #  And I click All
  #  Then I should see check stats Screen
   # And I click Table Layout tab
    And I click new check button on the Table layout screen
    And I select table as "<table_no>"
    And I select the number of seats as "<number_of_seats>"
    And I tap Continue to finish selecting the number of seats
    And I get check number
    And I select Pasta as category
    And I select menu item as RavioliPesto for Item Based Inclusive Tax
    And I select modifier as "<Modifier>"
    And I click Done to get back

    And I select menu item as RavioliPesto for Item Based Inclusive Tax
    And I select modifier as "<Modifier>"
    And I click Done to get back
    And I select Discount on the Order screen
    Then I should see Check Based Discount Screen
    And I click Discount as "<Discount3>"
    And I click Back button on Discount Screen
    Then I should see orderscreen with as Dosa EACH
    Then I should see orderscreen with menu item prize as "<SubTotal2>"
    Then I should see the tax amount reflected to the check as "<Tax2>"
    Then I should see orderscreen with menu item Total without Discount or Tax as "<Total2>"
    And I click table number on the Order Screen as "<table_no>"
    And I click the split seat from Order screen
    Then I should see the Split Screen
    And I click on item as Ravioli Pesto
    And I click seat two on the split screen
    Then I should see menu item as Ravioli Pesto added into next seat
    And I click the save & close button on the split screen
    Then I Should get back to the Order Screen
    And I click Void button on order management screen
    Then I should see All orders are voided
    And I click Done button on the Popup
    And I click All
    Then I should see check stats Screen
    And I click Table Layout tab
   # And I click power button
  #  Examples:
   #   | table_no | number_of_seats | Modifier | Tax      | SubTotal    | Total       |Discount     |
   #   | T8       |2                | Butter   |TL 363,64 | TL 4.000,00 | TL 4.000,00 |IB-BF-AsFree |


  #Scenario Outline: Verify whether application allow user to move the exclusive tax menu item from one seat to another seat along with Item based free item(inclusive tax menu item) discount with type before tax which is assigned to that menu item
   # And I click All
   # Then I should see check stats Screen
   # And I click Table Layout tab
    And I click new check button on the Table layout screen
    And I select table as "<table_no>"
    And I select the number of seats as "<number_of_seats>"
    And I tap Continue to finish selecting the number of seats
    And I get check number
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
    Then I should see orderscreen with as Dosa EACH
    Then I should see orderscreen with menu item prize as "<SubTotal3>"
    Then I should see the tax amount reflected to the check as "<Tax3>"
    Then I should see orderscreen with menu item Total without Discount or Tax as "<Total3>"
    And I click the split seat from Order screen
    Then I should see the Split Screen
    And I click on item as Ravioli
    And I click seat two on the split screen
    Then I should see menu item as Ravioli added into next seat for Free Item
    And I click the save & close button on the split screen
    Then I Should get back to the Order Screen
    And I click Void button on order management screen
    Then I should see All orders are voided
    And I click Done button on the Popup
    And I click All
    Then I should see check stats Screen
    And I click Table Layout tab
 #   And I click power button
  #  Examples:
   #   | table_no | number_of_seats  |Menu_Item | Modifier |Discount      | SubTotal   | Tax       | Total       |
   #   | T12       |2              | Ravioli    | Butter   | IB-BF-AsFree |TL 4.000,00 | TL 398,18 | TL 4.380,00 |


 #Scenario Outline: Verify whether application allow user to move the exclusive tax menu item from one seat to another seat along with Item based free item(inclusive tax menu item) discount with type after tax which is assigned to that menu item
  #  And I click All
   # Then I should see check stats Screen
   # And I click Table Layout tab
    And I click new check button on the Table layout screen
    And I select table as "<table_no>"
    And I select the number of seats as "<number_of_seats>"
    And I tap Continue to finish selecting the number of seats
    And I get check number
    And I select Pasta as category
    And I select menu item as "<Menu_Item>"
    And I select modifier as "<Modifier>"
    And I click Done to get back
    And I select menu item as "<Menu_Item>"
    And I select modifier as "<Modifier>"
    And I click Done to get back
    And I select Discount on the Order screen
    Then I should see Check Based Discount Screen
    And I click Discount as "<Discount4>"
    And I click Back button on Discount Screen
    Then I should see orderscreen with as Dosa EACH
    Then I should see orderscreen with menu item prize as "<SubTotal4>"
    Then I should see the tax amount reflected to the check as "<Tax4>"
    Then I should see orderscreen with menu item Total without Discount or Tax as "<Total4>"
    And I click the split seat from Order screen
    Then I should see the Split Screen
    And I click on item as Ravioli
    And I click seat two on the split screen
    Then I should see menu item as Ravioli added into next seat for Free Item
    And I click the save & close button on the split screen
    Then I Should get back to the Order Screen
    And I click Void button on order management screen
    Then I should see All orders are voided
    And I click Done button on the Popup
    And I click All
    Then I should see check stats Screen
    And I click Table Layout tab
    And I click power button
  #  Examples:
   #   | table_no | number_of_seats  |Menu_Item | Modifier |Discount      | SubTotal   | Tax       | Total       |
   #   | T12       |2              | Ravioli    | Butter   | IB-AF-AsFree |TL 4.000,00 | TL 398,18 | TL 4.380,00 |

    Examples:
      | table_no | number_of_seats  |Menu_Item | Modifier |Discount                  | SubTotal    | Tax       | Total       | Discount1              | Tax2       | SubTotal2    | Total2      |Discount2    | Discount3     | SubTotal3   | Tax3       | Total3       |Discount4      | SubTotal4   | Tax4       | Total4       |
      | T16       |2              | Ravioli    | Butter   | IB-BeforeTax-AsFreeItem  | $ 30.00     | $ 3.00    | $ 33.00     |IB-AfterTax-AsFreeItem  | $ 2.93     | $ 32.00      | $ 32.20     |IB-BF-AsFree |IB-BF-AsFree   | $ 30.00     | $ 3.00     | $ 33.00      |  IB-AF-AsFree | $ 31.00     | $ 3.10     | $ 34.10      |


  Scenario Outline: Verify whether application allow user to move the inclusive tax menu item from one seat to another seat along with Item based free item(exclusive tax menu item) discount with type before tax which is assigned to that menu item

    And I click new check button on the Table layout screen
    And I select table as "<table_no>"
    And I select the number of seats as "<number_of_seats>"
    And I tap Continue to finish selecting the number of seats
    And I get check number
    And I select Pasta as category
    And I select menu item as RavioliPesto for Item Based Inclusive Tax
    And I select modifier as "<Modifier>"
    And I click Done to get back
    And I select menu item as RavioliPesto for Item Based Inclusive Tax
    And I select modifier as "<Modifier>"
    And I click Done to get back
    And I select Discount on the Order screen
    Then I should see Check Based Discount Screen
    And I click Discount as "<Discount>"
    And I click Back button on Discount Screen
    Then I should see orderscreen with as Onion Rings EACH
    Then I should see orderscreen with menu item prize as "<SubTotal>"
    Then I should see the tax amount reflected to the check as "<Tax>"
    Then I should see orderscreen with menu item Total without Discount or Tax as "<Total>"
    And I click table number on the Order Screen as "<table_no>"
    And I click the split seat from Order screen
    Then I should see the Split Screen
    And I click on item as Ravioli Pesto
    And I click seat two on the split screen
    Then I should see menu item as Ravioli Pesto added into next seat
    And I click the save & close button on the split screen
    Then I Should get back to the Order Screen
    And I click Void button on order management screen
    Then I should see All orders are voided
    And I click Done button on the Popup
    And I click All
    Then I should see check stats Screen
    And I click Table Layout tab
  #  And I click power button
    #Examples:
    #  | table_no | number_of_seats | Modifier | Tax      | SubTotal    | Total       |Discount     |
    #  | T8       |2                | Butter   |TL 365,46 | TL 4.000,00 | TL 4.020,00 |IB-BeforeTax-AsFreeItem |

 # Scenario Outline: Verify whether application allow user to move the inclusive tax menu item from one seat to another seat along with Item based free item(exclusive tax menu item) discount with type after tax which is assigned to that menu item
  #  And I click All
  #  Then I should see check stats Screen
  #  And I click Table Layout tab
    And I click new check button on the Table layout screen
    And I select table as "<table_no>"
    And I select the number of seats as "<number_of_seats>"
    And I tap Continue to finish selecting the number of seats
    And I get check number
    And I select Pasta as category
    And I select menu item as RavioliPesto for Item Based Inclusive Tax
    And I select modifier as "<Modifier>"
    And I click Done to get back
    And I select menu item as RavioliPesto for Item Based Inclusive Tax
    And I select modifier as "<Modifier>"
    And I click Done to get back
    And I select Discount on the Order screen
    Then I should see Check Based Discount Screen
    And I click Discount as "<Discount1>"
    And I click Back button on Discount Screen
    Then I should see orderscreen with as Onion Rings EACH
    Then I should see orderscreen with menu item prize as "<SubTotal1>"
    Then I should see the tax amount reflected to the check as "<Tax1>"
    Then I should see orderscreen with menu item Total without Discount or Tax as "<Total1>"
    And I click table number on the Order Screen as "<table_no>"
    And I click the split seat from Order screen
    Then I should see the Split Screen
    And I click on item as Ravioli Pesto
    And I click seat two on the split screen
    Then I should see menu item as Ravioli Pesto added into next seat
    And I click the save & close button on the split screen
    Then I Should get back to the Order Screen
    And I click Void button on order management screen
    Then I should see All orders are voided
    And I click Done button on the Popup
    And I click All
    Then I should see check stats Screen
    And I click Table Layout tab
    And I click power button
 #   Examples:
  #    | table_no | number_of_seats | Modifier | Tax      | SubTotal    | Total       |Discount              |
   #   | T8       |2                | Butter   |TL 365,46 | TL 4.000,00 | TL 4.020,00 |IB-AfterTax-AsFreeItem |

    Examples:
      | table_no | number_of_seats | Modifier | Tax        | SubTotal     | Total       |Discount                | Tax1       | SubTotal1    | Total1      |Discount1              |
      | T8       |2                | Butter   | $ 2.93     | $ 32.00      | $ 32.20     |IB-BeforeTax-AsFreeItem | $ 2.93     | $ 32.00      | $ 32.20     |IB-AfterTax-AsFreeItem |


  Scenario Outline: Verify whether application calculate the gratuity based on the net sale of the seat if user move menu item from one seat to another seat

    And I click new check button on the Table layout screen
    And I select table as "<table_no>"
    And I select the number of seats as "<number_of_seats>"
    And I tap Continue to finish selecting the number of seats
    And I get check number
    And I select Pasta as category
    And I select menu item as "<Menu_Item>"
    And I select modifier as "<Modifier>"
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
    And I click the split seat from Order screen
    Then I should see the Split Screen
    And I click on item as Ravioli For Gratuity
    And I click seat two on the split screen
    Then I should see menu item as Ravioli added into next seat for gratuity
    And I click the save & close button on the split screen
    Then I Should get back to the Order Screen
    And I click Void button on order management screen
    Then I should see All orders are voided
    And I click Done button on the Popup
    And I click All
    Then I should see check stats Screen
    And I click Table Layout tab
  #  And I click power button
 #  Examples:
  #    | table_no | number_of_seats | Menu_Item |Modifier  |SubTotal    | Tax       |  Gratuity  | Total       |
  #    | T9         |2              |  Ravioli  | Butter   |TL 1.900,00 | TL 190,00 |  TL 190,00 | TL 2.280,00 |

  #Scenario Outline: Verify whether application allow move menu item from one seat to another seat along with their modifiers if user move menu item which has modifiers
  #  And I click All
  #  Then I should see check stats Screen
  #  And I click Table Layout tab
    And I click new check button on the Table layout screen
    And I select table as "<table_no>"
    And I select the number of seats as "<number_of_seats>"
    And I tap Continue to finish selecting the number of seats
    And I get check number
    And I select Pasta as category
    And I select menu item as "<Menu_Item>"
    And I select modifier as "<Modifier>"
    And I click Done to get back
    Then I should see orderscreen with menu item prize as "<SubTotal1>"
    Then I should see the tax amount reflected to the check as "<Tax1>"
    Then I should see orderscreen with menu item Total without Discount or Tax as "<Total1>"
    And I click the split seat from Order screen
    Then I should see the Split Screen
    And I click on item as Ravioli For Gratuity
    And I click seat two on the split screen
    Then I should see menu item as Ravioli added into next seat for Free Item1
    Then I should see selected Modifier as Butter
    And I click the save & close button on the split screen
    Then I Should get back to the Order Screen
    And I click Void button on order management screen
    Then I should see All orders are voided
    And I click Done button on the Popup
    And I click All
    Then I should see check stats Screen
    And I click Table Layout tab
   # And I click power button


  #  Examples:
   #   | table_no | number_of_seats|Menu_Item   | Modifier  | SubTotal   | Tax       | Total       |
   #   | T12       |2              | Ravioli    | Butter    |TL 1.900,00 | TL 190,00 | TL 2.090,00 |


  #Scenario Outline:Verify application allow to revert changes to initial stage when user clicks the Start Over button after made changed in Split seat screen
   # And I click All
   # Then I should see check stats Screen
   # And I click Table Layout tab
    And I click new check button on the Table layout screen
    And I select table as "<table_no>"
    And I select the number of seats as "<number_of_seats1>"
    And I tap Continue to finish selecting the number of seats
    And I get check number
    And I select Pasta as category
    And I select menu item as "<Menu_Item>"
    And I select modifier as "<Modifier>"
    And I click Done to get back
    Then I should see orderscreen with menu item prize as "<SubTotal1>"
    Then I should see the tax amount reflected to the check as "<Tax1>"
    Then I should see orderscreen with menu item Total without Discount or Tax as "<Total1>"
    And I click the split seat from Order screen
    Then I should see the Split Screen
    And I click Add Button to create Seat
    Then I should see created new seat
    And I click Start Over Button to come back original stage
    Then I should not see created new seat
    And I click the Back button on Split Screen
    Then I Should get back to the Order Screen
    And I click Void button on order management screen
    Then I should see All orders are voided
    And I click Done button on the Popup
    And I click All
    Then I should see check stats Screen
    And I click Table Layout tab
    And I click power button
 #   Examples:
  #    | table_no | number_of_seats|Menu_Item   | Modifier  | SubTotal   | Tax       | Total       |
  #    | T12       |1              | Ravioli    | Butter    |TL 1.900,00 | TL 190,00 | TL 2.090,00 |

    Examples:
      | table_no | number_of_seats | number_of_seats1|Menu_Item |Modifier  |SubTotal    | Tax       |  Gratuity  | Total       |  SubTotal1   | Tax1       | Total1       |
      | T9         |2              | 1               | Ravioli  | Butter   |$ 14.00     | $ 1.40    |  $ 1.40    | $ 16.80     | $ 14.00      | $ 1.40     | $ 15.40      |


  Scenario Outline: Verify whether user can revert changes when user create the check with multiple seats and done the payment for any one seat

    And I click new check button on the Table layout screen
    And I select table as "<table_no>"
    And I select the number of seats as "<number_of_seats>"
    And I tap Continue to finish selecting the number of seats
    And I get check number
    And I select FOOD as category
    And I select menu item as "<Menu_Item>"
    And I select modifier as "<Modifier>"
    And I click Done to get back
    And I click seat 2 for add menu item

    And I select menu item as "<Menu_Item>"
    And I select modifier as "<Modifier>"
    And I click Done to get back
    And I click the split seat from Order screen
    Then I should see the Split Screen
    And I click seat one on the split screen
    And I click Pay Button in Split Screen
    Then I should see the Payment window
    And I click cash button from the payment method popup
    Then I should see cash payment is added in payment window
    And I click the Exit button in the payment window
    Then I should see the Split Screen
    Then I should see seat as paid
    And I click Start Over Button to come back original stage
    And I click seat two on the split screen
    And I click Pay Button in Split Screen
    Then I should see the Payment window
    And I click cash button from the payment method popup
    And I click Submit button on the Payment Window
    #  Then I should see the print or send receipt
     # And I click No thanks Button on the print receipt
    Then I should get back to the Table Layout tab
  #  And I click power button
   # Examples:
    #  | table_no | number_of_seats|Menu_Item         | Modifier  |
    #  | T12      |2               | French Friese    | Steak     |

 # Scenario Outline: Verify whether start over button is enabled when user made changes in split screen after done the payment
 #   And I click All
 #   Then I should see check stats Screen
    And I click Table Layout tab
    And I click new check button on the Table layout screen
    And I select table as "<table_no>"
    And I select the number of seats as "<number_of_seats>"
    And I tap Continue to finish selecting the number of seats
    And I get check number
    And I select FOOD as category
    And I select menu item as "<Menu_Item>"
    And I select modifier as "<Modifier>"
    And I click Done to get back
    And I click seat 2 for add menu item

    And I select menu item as "<Menu_Item>"
    And I select modifier as "<Modifier>"
    And I click Done to get back
    And I click the split seat from Order screen
    Then I should see the Split Screen
    And I click seat one on the split screen
    And I click Pay Button in Split Screen
    Then I should see the Payment window
    And I click cash button from the payment method popup
    Then I should see cash payment is added in payment window
    And I click the Exit button in the payment window
    Then I should see the Split Screen
    Then I should see seat as paid
    And I click Add Button to create Seat
    Then I should see seat 3 is created
    And I click Start Over Button to come back original stage
    Then I should not see seat 3 is created
    And I click seat two on the split screen
    And I click Pay Button in Split Screen
    Then I should see the Payment window
    And I click cash button from the payment method popup
    And I click Submit button on the Payment Window
    #  Then I should see the print or send receipt
     # And I click No thanks Button on the print receipt
    Then I should get back to the Table Layout tab
   # And I click power button
   # Examples:
   #   | table_no | number_of_seats|Menu_Item         | Modifier  |
   #   | T12      |2               | French Friese    | Steak     |

 # Scenario Outline: verify whether application allow to do payment for empty check
 #   And I click All
 #   Then I should see check stats Screen
    And I click Table Layout tab
    And I click new check button on the Table layout screen
    And I select table as "<table_no>"
    And I select the number of seats as "<number_of_seats>"
    And I tap Continue to finish selecting the number of seats
    And I get check number
    And I select FOOD as category
    And I select menu item as "<Menu_Item>"
    And I select modifier as "<Modifier>"
    And I click Done to get back
    And I click the split seat from Order screen
    Then I should see the Split Screen
    And I click seat two on the split screen
    And I click Pay Button in Split Screen
    Then I should see empty seat cannot paid popup
    And I click Done button on the Popup
    And I click the Back button on Split Screen
    Then I Should get back to the Order Screen
    And I click Void button on order management screen
    Then I should see All orders are voided
    And I click Done button on the Popup
    And I click All
    Then I should see check stats Screen
    And I click Table Layout tab
   # And I click power button
   # Examples:
   #   | table_no | number_of_seats|Menu_Item     | Modifier  |
   #   | T12      |2               |French Friese | Steak     |

 # Scenario Outline: verify whether application navigate back to the split seat screen when user done the payment for particular seat
  #  And I click All
  #  Then I should see check stats Screen
  #  And I click Table Layout tab
    And I click new check button on the Table layout screen
    And I select table as "<table_no>"
    And I select the number of seats as "<number_of_seats1>"
    And I tap Continue to finish selecting the number of seats
    And I get check number
    And I select FOOD as category
    And I select menu item as "<Menu_Item>"
    And I select modifier as "<Modifier>"
    And I click Done to get back
    And I click Order button in the order management screen
    Then I should see Tick mark in the Menu item
    And I click the split seat from Order screen
    Then I should see the Split Screen
    And I click seat one on the split screen
    And I click Pay Button in Split Screen
    Then I should see the Payment window
    And I click cash button from the payment method popup
    Then I should see cash payment is added in payment window
    And I click the Exit button in the payment window
    Then I should see the Split Screen
    Then I should see seat as paid
    And I click the Back button on Split Screen
    Then I Should get back to the Order Screen
    And I click Payment button in the Order Management Screen
    And I click Submit button on the Payment Window
    #  Then I should see the print or send receipt
     # And I click No thanks Button on the print receipt
    Then I should get back to the Table Layout tab
   # And I click power button
   # Examples:
   #   | table_no |number_of_seats| number_of_seats1|Menu_Item     | Modifier  |
   #   | T12      |2              |1               |French Friese | Steak     |


 # Scenario Outline: verify whether application displaying the paid amount for seat in split seat screen after done the payment for particular seat
 #   And I click All
 #   Then I should see check stats Screen
    And I click Table Layout tab
    And I click new check button on the Table layout screen
    And I select table as "<table_no>"
    And I select the number of seats as "<number_of_seats1>"
    And I tap Continue to finish selecting the number of seats
    And I get check number
    And I select FOOD as category
    And I select menu item as "<Menu_Item>"
    And I select modifier as "<Modifier>"
    And I click Done to get back
    And I click Order button in the order management screen
    Then I should see Tick mark in the Menu item
    And I click the split seat from Order screen
    Then I should see the Split Screen
    And I click seat one on the split screen
    And I click Pay Button in Split Screen
    Then I should see the Payment window
    And I click cash button from the payment method popup
    Then I should see cash payment is added in payment window
    And I click the Exit button in the payment window
    Then I should see the Split Screen
    Then I should see paid amount as "<Paid_Amount>" in Split seat screen
    And I click the Back button on Split Screen
    Then I Should get back to the Order Screen
    And I click Payment button in the Order Management Screen
    And I click Submit button on the Payment Window
    #  Then I should see the print or send receipt
     # And I click No thanks Button on the print receipt
    Then I should get back to the Table Layout tab
   # And I click power button
   # Examples:
    #  | table_no | number_of_seats|Menu_Item     | Modifier  | Paid_Amount |
    #  | T12      |1               |French Friese | Steak     | TL 65,00    |


  #Scenario Outline: Verify whether application allow to do payment more than the seat total
   # And I click All
   # Then I should see check stats Screen
    And I click Table Layout tab
    And I click new check button on the Table layout screen
    And I select table as "<table_no>"
    And I select the number of seats as "<number_of_seats1>"
    And I tap Continue to finish selecting the number of seats
    And I get check number
    And I select FOOD as category
    And I select menu item as "<Menu_Item>"
    And I select modifier as "<Modifier>"
    And I click Done to get back
    And I click the split seat from Order screen
    Then I should see the Split Screen
    And I click seat one on the split screen
    And I click Pay Button in Split Screen
    Then I should see the Payment window
    And I enter huge amount than Menu item price
    And I click cash button from the payment method popup
    Then I should see change Due popup
    And I click Done button on the Popup
    Then I should see cash payment is added in payment window as "<amount>"
    And I click Submit button on the Payment Window
    #  Then I should see the print or send receipt
     # And I click No thanks Button on the print receipt
    Then I should get back to the Table Layout tab
   # And I click power button
    #Examples:
     # | table_no | number_of_seats | Menu_Item     | Modifier |amount     |
     # | T7         |1              | French Friese | Steak    |  65,00  |



  #Scenario Outline:Verify whether application allow to do partial payment for selected seat
    #And I click All
    #Then I should see check stats Screen
    And I click Table Layout tab
    And I click new check button on the Table layout screen
    And I select table as "<table_no>"
    And I select the number of seats as "<number_of_seats1>"
    And I tap Continue to finish selecting the number of seats
    And I get check number
    And I select FOOD as category
    And I select menu item as "<Menu_Item>"
    And I select modifier as "<Modifier>"
    And I click Done to get back
    And I click the split seat from Order screen
    Then I should see the Split Screen
    And I click seat one on the split screen
    And I click Pay Button in Split Screen
    Then I should see the Payment window
    And I click partial amount from the payment window
    And I click cash button from the payment method popup
    And I click Submit button on the Payment Window
    Then I should see please pay amount
    And I click Done button on the Popup
    And I click Exact button on the cash pop-up
    And I click cash button from the payment method popup
    And I click Submit button on the Payment Window
    #  Then I should see the print or send receipt
     # And I click No thanks Button on the print receipt
    Then I should get back to the Table Layout tab
   # And I click power button
   # Examples:
   #   | table_no | number_of_seats | Menu_Item     | Modifier |
   #   | T7         |1              | French Friese | Steak    |


#  Scenario Outline: Verify whether application allow to do payment for already paid seat
  #  And I click All
  #  Then I should see check stats Screen
    And I click Table Layout tab
    And I click new check button on the Table layout screen
    And I select table as "<table_no>"
    And I select the number of seats as "<number_of_seats1>"
    And I tap Continue to finish selecting the number of seats
    And I get check number
    And I select FOOD as category
    And I select menu item as "<Menu_Item>"
    And I select modifier as "<Modifier>"
    And I click Done to get back
    And I click the split seat from Order screen
    Then I should see the Split Screen
    And I click seat one on the split screen
    And I click Pay Button in Split Screen
    Then I should see the Payment window
    And I click cash button from the payment method popup
    And I click the Exit button in the payment window
    Then I should see the Split Screen
    Then I should see seat as paid
    And I click seat one on the split screen
    And I click Pay Button in Split Screen
    Then I should see No more payment needed popup
    And I click Done button on the Popup
    And I click the Back button on Split Screen
    Then I Should get back to the Order Screen
    And I click Payment button in the Order Management Screen
    And I click Submit button on the Payment Window
    #  Then I should see the print or send receipt
     # And I click No thanks Button on the print receipt
    Then I should get back to the Table Layout tab
   # And I click power button
  #  Examples:
   #   | table_no | number_of_seats | Menu_Item | Modifier |
   #   | T7         |1              | French Friese | Steak  |

  #Scenario Outline: verify whether application allow to merge all selected seats gratuity
  #  And I click All
  #  Then I should see check stats Screen
    And I click Table Layout tab
    And I click new check button on the Table layout screen
    And I select table as "<table_no>"
    And I select the number of seats as "<number_of_seats3>"
    And I tap Continue to finish selecting the number of seats
    And I get check number
    And I select FOOD as category
    And I select menu item as "<Menu_Item>"
    And I select modifier as "<Modifier>"
    And I click Done to get back
    And I click seat 2 for add menu item

    And I select menu item as "<Menu_Item>"
    And I select modifier as "<Modifier>"
    And I click Done to get back
    And I click seat 3 for add menu item

    And I select menu item as "<Menu_Item>"
    And I select modifier as "<Modifier>"
    And I click Done to get back
    And I click table number on the Order Screen as "<table_no>"
    And I click Options button
    Then I should see the Check Options screen
    And I click Gratuity button
    Then I should see Add Gratuity screen
    And I click Gratuity Fixed button
    Then I should return back to the order management screen and I should Gratuity is added
    Then I should see orderscreen with menu item prize as "<SubTotal>"
    Then I should see the Gratuity amount reflected to the check as "<Gratuity>"
    Then I should see orderscreen with menu item Total as "<Total>"
    And I click the split seat from Order screen
    Then I should see the Split Screen
    And I click seat one on the split screen
    And I click seat two on the split screen
    And I click seat three on the split screen
    And I click the Group Seats button in the Split Seat
    Then I should see selected seat item should club into one seat
    And I click the save & close button on the split screen
    Then I Should get back to the Order Screen
    And I click Void button on order management screen
    Then I should see All orders are voided
    And I click Done button on the Popup
    And I click All
    Then I should see check stats Screen
    And I click Table Layout tab
    And I click power button
  #  Examples:
   #   | table_no | number_of_seats | Menu_Item | Modifier | SubTotal   | Gratuity  | Total |
   #   | T7         |3             | French Friese | Steak  | TL 195,00 | TL 19,50  |TL 214,50 |

    Examples:
      | table_no |number_of_seats| number_of_seats1|number_of_seats3|Menu_Item     | Modifier  | Paid_Amount| amount | SubTotal   | Gratuity  | Total   |
      | T19      |2              |1               |3                |French Friese | Steak     |$ 15.00     | 15.00|$ 45.00     | $ 4.50    | $ 49.50 |


#  Scenario Outline: Verify whether the application splits the Open Check discount amount exactly once the user clicks on the Split Evenly button
#    And I click new check button on the Table layout screen
#    And I select table as "<table_no>"
#    And I select the number of seats as "<number_of_seats>"
#    And I tap Continue to finish selecting the number of seats
#    And I get check number
#    And I select Menu as category
#    And I select menu item as "<Menu_Item>"
#    And I click seat 2 for add menu item
#    And I select Menu as category
#    And I select menu item as "<Menu_Item1>"
#    And I click table number on the Order Screen as "<table_no>"
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
#    And I click the split seat from Order screen
#    Then I should see the Split Screen
#    Then I should see orderscreen with menu item prize as "<SubTotal1>" in split seat1
#    Then I should see orderscreen with menu item prize as "<SubTotal2>" in split seat2
#    And I click on item as cake on split seat screen
#    And I click seat two on the split screen
#    And I click Split Evenly Button
#    Then I should see menu items has to be sent to the kitchen
#    And I click Yes button on send to kitchen popup
#    Then I should see menu item prize split evenly
#    And I click the save & close button on the split screen
#    Then I Should get back to the Order Screen
#    And I click Void button on order management screen
#    Then I should see the void reason popup
#    And I click void Reason on the void popup
#    And I click Add Button on the void reason popup
##    Then I should see Receipt Printer popup
##    And I click Done button on the Popup
#    Then I should get back to the Table Layout tab
#    And I click power button
#    Examples:
#      | table_no | number_of_seats | Menu_Item  | Menu_Item1  |Discount1| SubTotal    | Tax       | Discount  | Total       | SubTotal1   | SubTotal2   |
#      | T8       |    2            |  cake      |   Halwa     | Before  | $ 18.00     | $ 1.44    | $ 3.60    | $ 15.84     | $ 8.00      | $ 10.00     |


  Scenario Outline: Verify whether application removes the applied check based discount when the user does Split Evenly
    And I click new check button on the Table layout screen
    And I select table as "<table_no>"
    And I select the number of seats as "<number_of_seats>"
    And I tap Continue to finish selecting the number of seats
    Then I Should get back to the Order Screen
    And I get check number
    And I select Desserts as category
    And I select menu item as "<Menu_Item>"
    And I select menu item as "<Menu_Item>"
    And I select Discount on the Order screen
    Then I should see Check Based Discount Screen
    And I click Discount as "<Discount>"
    And I click Back button on Discount Screen
    Then I should see orderscreen with as Onion Rings EACH
    Then I should see orderscreen with menu item prize as "<SubTotal>"
    Then I should see the tax amount reflected to the check as "<Tax>"
    Then I should see orderscreen with menu item Total without Discount or Tax as "<Total>"
    And I click the split seat from Order screen
    Then I should see the Split Screen
    And I click Split Evenly Button
    Then I should see menu items has to be sent to the kitchen
    And I click Yes button on send to kitchen popup
    Then I should see menu item as cheese cake added into next seat
    Then I should see applied discount as "<Discount>"
    Then I should see orderscreen with menu item prize as "<SubTotal1>" in split seat1
    Then I should see orderscreen with menu item prize as "<SubTotal2>" in split seat2
    And I click the save & close button on the split screen
    Then I Should get back to the Order Screen
    And I click Void button on order management screen
    Then I should see the void reason popup
    And I click void Reason on the void popup
    And I click Add Button on the void reason popup
#    Then I should see Receipt Printer popup
#    And I click Done button on the Popup
    Then I should get back to the Table Layout tab
   # And I click power button
    #Examples:
     # | table_no |number_of_seats|Menu_Item   |Discount              | SubTotal    | Tax      | Total     | SubTotal1  |  SubTotal2  |
      #| T12      |2              | Cheesecake | CB-BeforeTax-Free300 | TL 900,00   | TL 90,00 | TL 990,00 | TL 500,00  | TL 400,00   |

  #Scenario Outline: Verify whether the menu item quantity gets splitted evenly when the user clicks on the split evenly button from the split screen
   # And I click All
   # Then I should see check stats Screen
    And I click Table Layout tab
    And I click new check button on the Table layout screen
    And I select table as "<table_no>"
    And I select the number of seats as "<number_of_seats>"
    And I tap Continue to finish selecting the number of seats
    Then I Should get back to the Order Screen
    And I get check number
    And I select Desserts as category
    And I select menu item as "<Menu_Item>"
    And I select menu item as "<Menu_Item>"
    And I select Discount on the Order screen
    Then I should see Check Based Discount Screen
    And I click Discount as "<Discount>"
    And I click Back button on Discount Screen
    Then I should see orderscreen with as Onion Rings EACH
    Then I should see orderscreen with menu item prize as "<SubTotal>"
    Then I should see the tax amount reflected to the check as "<Tax>"
    Then I should see orderscreen with menu item Total without Discount or Tax as "<Total>"
    And I click the split seat from Order screen
    Then I should see the Split Screen
    And I click Split Evenly Button
    Then I should see menu items has to be sent to the kitchen
    And I click Yes button on send to kitchen popup
    Then I should see menu item as cheese cake added into next seat
    Then I should see applied discount as "<Discount>"
    And I click the save & close button on the split screen
    Then I Should get back to the Order Screen
    And I click Void button on order management screen
    Then I should see the void reason popup
    And I click void Reason on the void popup
    And I click Add Button on the void reason popup
#    Then I should see Receipt Printer popup
#    And I click Done button on the Popup
    Then I should get back to the Table Layout tab
    And I click power button
   # Examples:
    #  | table_no |number_of_seats|Menu_Item   |Discount              | SubTotal    | Tax      | Total     |
    #  | T13      |2              | Cheesecake | CB-BeforeTax-Free300 | TL 900,00   | TL 90,00 | TL 990,00 |

    Examples:
      | table_no |number_of_seats|Menu_Item   |Discount              | SubTotal    | Tax      | Total     | SubTotal1  |  SubTotal2  |
      | T12      |2              | Cheesecake | CB-BeforeTax-Free300 | $ 32.00     | $ 3.20   | $ 35.20   | $ 17.00    |  $ 15.00    |


  Scenario Outline: Verify whether the application allows the user to close the check before doing the payment for the seat 2
    And I click new check button on the Table layout screen
    And I select table as "<table_no>"
    And I select the number of seats as "<number_of_seats>"
    And I tap Continue to finish selecting the number of seats
    And I get check number
    And I select FOOD as category
    And I select menu item as "<Menu_Item>"
    And I select modifier as "<Modifier>"
    And I click Done to get back
    And I click seat 2 for add menu item

    And I select menu item as "<Menu_Item>"
    And I select modifier as "<Modifier>"
    And I click Done to get back
    And I click the split seat from Order screen
    Then I should see the Split Screen
    And I click seat one on the split screen
    And I click Pay Button in Split Screen
    Then I should see the Payment window
    And I enter huge amount than Menu item price
    And I click cash button from the payment method popup
    Then I should see change Due popup
    And I click Done button on the Popup
    Then I should see cash payment is added in payment window as "<amount>"
    And I click the Exit button in the payment window
    Then I Should get back to the Order Screen
    Then I should see seat as paid
    Then I should see paid amount as "<Paid_Amount>" of French Friese
    And I click the save & close button on the split screen
    Then I Should get back to the Order Screen
    And I click Payment button in the Order Management Screen
    Then I should see the Payment window
    And I click cash button from the payment method popup
    And I click Submit button on the Payment Window
    #  Then I should see the print or send receipt
     # And I click No thanks Button on the print receipt
    Then I should get back to the Table Layout tab
   # And I click power button
   # Examples:
    #  | table_no | number_of_seats | Menu_Item     | Modifier |amount     | Paid_Amount |
    #  | T7         |2              | French Friese | Steak    |  65,00    | TL 65,00    |

  #Scenario Outline: Verify whether the application allows to send the Menu Items to the Kitchen more than 1 time unless otherwise user clicks on the Resend To Kitchen
   # And I click All
   # Then I should see check stats Screen
    And I click Table Layout tab
    And I click new check button on the Table layout screen
    And I select table as "<table_no>"
    And I select the number of seats as "<number_of_seats>"
    And I tap Continue to finish selecting the number of seats
    And I get check number
    And I select FOOD as category
    And I select menu item as "<Menu_Item>"
    And I select modifier as "<Modifier>"
    And I click Done to get back
    And I click seat 2 for add menu item

    And I select menu item as "<Menu_Item>"
    And I select modifier as "<Modifier>"
    And I click Done to get back
    And I click the split seat from Order screen
    Then I should see the Split Screen
    And I click seat one on the split screen
    And I click seat two on the split screen
    And I click print All button in the split seat screen
    Then I should see item need to send to kitchen popup
    And I click Yes button on send to kitchen popup
#    Then I should see Receipt Printer popup
#    And I click Done button on the Popup
    And I click seat two on the split screen
    And I click print All button in the split seat screen
#    Then I should see Receipt Printer popup
#    And I click Done button on the Popup
    And I click the save & close button on the split screen
    Then I Should get back to the Order Screen
    And I click Void button on order management screen
    Then I should see the void reason popup
    And I click void Reason on the void popup
    And I click Add Button on the void reason popup
#    Then I should see Receipt Printer popup
#    And I click Done button on the Popup
    Then I should get back to the Table Layout tab
  #  And I click power button
 #   Examples:
  ##    | table_no | number_of_seats | Menu_Item     | Modifier |
   #   | T7         |2              | French Friese | Steak    |


#  Scenario Outline: Verify whether application displays the Ordered Free Items are UnOrdered Free Items when the user tries to Print the Seat from the Split Screen
  #  And I click All
   # Then I should see check stats Screen
    And I click Table Layout tab
    And I click new check button on the Table layout screen
    And I select table as "<table_no>"
    And I select the number of seats as "<number_of_seats1>"
    And I tap Continue to finish selecting the number of seats
    Then I Should get back to the Order Screen
    And I get check number
    And I select Desserts as category
    And I select menu item as "<Menu_Item1>"
    And I select menu item as "<Menu_Item1>"
    And I select Discount on the Order screen
    Then I should see Check Based Discount Screen
    And I click Discount as "<Discount1>"
    And I click Back button on Discount Screen
    Then I should see orderscreen with as Onion Rings EACH
    And I click Order button in the order management screen
    Then I should see Tick mark in the Menu item
    Then I should see orderscreen with menu item prize as "<SubTotal1>"
    Then I should see the tax amount reflected to the check as "<Tax1>"
    Then I should see orderscreen with menu item Total without Discount or Tax as "<Total1>"
    And I click the split seat from Order screen
    Then I should see the Split Screen
    And I click seat one on the split screen
    And I click print All button in the split seat screen
#    Then I should see Receipt Printer popup
#    And I click Done button on the Popup
    And I click the Back button on Split Screen
    Then I Should get back to the Order Screen
    And I click Void button on order management screen
    Then I should see the void reason popup
    And I click void Reason on the void popup
    And I click Add Button on the void reason popup3
#    Then I should see Receipt Printer popup
#    And I click Done button on the Popup
    Then I should get back to the Table Layout tab
    And I click power button
    #Examples:
     # | table_no |number_of_seats|Menu_Item   |Discount              | SubTotal    | Tax      | Total     |
      #| T13      |1              | Cheesecake | CB-BeforeTax-Free300 | TL 900,00   | TL 90,00 | TL 990,00 |
    Examples:
      | table_no | number_of_seats |number_of_seats1| Menu_Item     | Modifier |amount     | Paid_Amount | Menu_Item1   |Discount1              | SubTotal1    | Tax1      | Total1     |
      | T7       |2                |1               | French Friese | Steak    | 15.00  | $ 15.00     | Cheesecake   | CB-BeforeTax-Free300  | $ 32.00      | $ 3.20    | $ 35.20    |


  Scenario Outline: Verify whether the Application shows the seat total in the split screen shows less amount than  the seat's subtotal when the user does split evenly for the menu item which has priced  modifier to it
    And I click new check button on the Table layout screen
    And I select table as "<table_no>"
    And I select the number of seats as "<number_of_seats>"
    And I tap Continue to finish selecting the number of seats
    And I get check number
    And I select FOOD as category
    And I select menu item as "<Menu_Item>"
    And I select modifier as "<Modifier>"
    And I select modifier as "<Modifier1>"
    And I select modifier as "<Modifier2>"
    And I click Done to get back
    Then I should see orderscreen with menu item prize as "<SubTotal>"
    Then I should see the tax amount reflected to the check as "<Tax>"
    Then I should see orderscreen with menu item Total without Discount or Tax as "<Total>"
    And I click the split seat from Order screen
    Then I should see the Split Screen
    Then I should see subtotal as "<SubTotal>" in Split seat Screen
    Then I should see tax as "<Tax>" in Split seat Screen
    Then I should see total as "<Total>" in Split seat Screen
    And I click the save & close button on the split screen
    And I click Void button on order management screen
    Then I should see All orders are voided
    And I click Done button on the Popup
    And I click All
    Then I should see check stats Screen
    And I click Table Layout tab
    And I click power button
    Examples:
      | table_no | number_of_seats | Menu_Item     | Modifier | Modifier1 | Modifier2 | SubTotal  | Tax    | Total   |
      | T7         |1              | French Friese | Steak    | Tomato    | Turkey    | $ 71.00   | $ 4.69 | $ 75.69 |


  Scenario Outline: Verify whether application allow user to move the menu item from one seat to another seat along with Item based free item discount

    And I click new check button on the Table layout screen
    And I select table as "<table_no>"
    And I select the number of seats as "<number_of_seats>"
    And I tap Continue to finish selecting the number of seats
    And I get check number
    And I select Pasta as category
    And I select menu item as "<Menu_Item>"
    And I select modifier as "<Modifier>"
    And I click Done to get back
    And I select Discount on the Order screen
    Then I should see Check Based Discount Screen
    And I click Discount as "<Discount1>"
    And I click Back button on Discount Screen
    Then I should see orderscreen with menu item prize as "<SubTotal>"
    Then I should see the tax amount reflected to the check as "<Tax>"
    Then I should see the Discount amount reflected to the check as "<Discount>"
    Then I should see orderscreen with menu item Total as "<Total>"
    And I click the split seat from Order screen
    Then I should see the Split Screen
    And I click on item as Ravioli For Gratuity
    And I click seat two on the split screen
    Then I should see menu item as Ravioli added into next seat
    Then I should see discount as "<Discount1>" moved into next seat
    And I click the save & close button on the split screen
    Then I Should get back to the Order Screen
    And I click Void button on order management screen
    Then I should see All orders are voided
    And I click Done button on the Popup
    And I click All
    Then I should see check stats Screen
    And I click Table Layout tab
 #   And I click power button
   # Examples:
    #  | table_no | number_of_seats | Menu_Item  | Modifier | SubTotal    | Tax       | Total     | Discount    | Discount1               |
     # | T13      |2                | Ravioli    | Butter   | TL 1.900,00 | TL 190,00 | TL 690,00 | TL 1.400,00 | IB-AfterTax-SetPrice500 |

 # Scenario Outline: verify whether application allow to calculate discount for gift card amount when user move to the split seat screen
  #  And I click All
  #  Then I should see check stats Screen
  #  And I click Table Layout tab
    And I click new check button on the Table layout screen
    And I select table as "<table_no>"
    And I select the number of seats as "<number_of_seats>"
    And I tap Continue to finish selecting the number of seats
    And I get check number
    Then I Should get back to the Order Screen
    And I select Desserts as category
    And I select menu item as "<Menu_Item1>"
    And I select menu item as "<Menu_Item1>"
    And I click Options button
    And I click Gift card Button
    Then I should see Gift card window
    And I enter gift card number
    And I click charge amount field and pass the amount
    And I click Done button on the Popup
    Then I should see gift card amount add up into order screen
    And I select Discount on the Order screen
    Then I should see Check Based Discount Screen
    And I click Discount as "<Discount2>"
    And I click Back button on Discount Screen
    Then I should see orderscreen with menu item prize as "<SubTotal1>"
    Then I should see the tax amount reflected to the check as "<Tax1>"
    Then I should see orderscreen with menu item Total as "<Total1>"
    Then I should see the Discount amount reflected to the check as "<Discount3>"
    And I click the split seat from Order screen
    Then I should see the Split Screen
    And I click on item as cheesecake
    And I click seat two on the split screen
    Then I should see menu item as cheese cake added into next seat1
    And I click the save & close button on the split screen
    Then I Should get back to the Order Screen
    And I click Void button on order management screen
    Then I should see the void reason popup
    And I click void Reason on the void popup
    And I click Add Button on the void reason popup3
#    Then I should see Receipt Printer popup
#    And I click Done button on the Popup
    Then I should get back to the Table Layout tab
    And I click power button
   # Examples:
    #  | table_no |number_of_seats|Menu_Item   |Discount             | SubTotal    | Tax      | Total     | Discount |
    #  | T12      |2              | Cheesecake | IB-BeforeTax-SetPrice500 | TL 900,00   | TL 100,00 | TL 1.200,00 |TL -200.00|

    Examples:
      | table_no | number_of_seats | Menu_Item  | Modifier | SubTotal    | Tax       | Total     | Discount    | Discount1               | Menu_Item1   |Discount2                 | SubTotal1    | Tax1      | Total1     | Discount3 |
      | T13      |2                | Ravioli    | Butter   | $ 14.00     | $ 1.40    | $ 2.90    | $ 12.50     | IB-AfterTax-SetPrice500 |Cheesecake    | IB-BeforeTax-SetPrice500 | $ 130.00     | $ 0.20    | $ 102.20   | $ 28.00   |


  Scenario Outline: Verify whether application allow to close the check if user paid the total check amount by selecting a single seat
    And I click new check button on the Table layout screen
    And I select table as "<table_no>"
    And I select the number of seats as "<number_of_seats>"
    And I tap Continue to finish selecting the number of seats
    And I get check number
    And I select FOOD as category
    And I select menu item as "<Menu_Item>"
    And I select modifier as "<Modifier>"
    And I click Done to get back
    And I click seat 2 for add menu item

    And I select menu item as "<Menu_Item>"
    And I select modifier as "<Modifier>"
    And I click Done to get back
    And I click the split seat from Order screen
    Then I should see the Split Screen
    And I click seat one on the split screen
    And I click Pay Button in Split Screen
    Then I should see the Payment window
    And I click cash button from the payment method popup
    And I click Submit button on the Payment Window
    Then I should see please pay amount for One seat
    And I click Done button on the Popup
    And I click the Exit button in the payment window
    Then I should see the Split Screen
    Then I should see seat as paid
    And I click seat two on the split screen
    And I click Pay Button in Split Screen
    Then I should see the Payment window
    And I click cash button from the payment method popup
    And I click Submit button on the Payment Window
    #  Then I should see the print or send receipt
     # And I click No thanks Button on the print receipt
    Then I should get back to the Table Layout tab
 #   And I click power button
  #  Examples:
  #    | table_no | number_of_seats | Menu_Item  | Modifier |
  #    | T13      |2                | French Friese    | Steak   |

  #Scenario Outline:Application allows to Increase or Decrease the Menu item Quantity

    And I click QSR tab
    And I closed the order type window
    And I select FOOD as category
    And I select menu item as "<Menu_Item>"
    And I select modifier as "<Modifier>"
    And I click Done to get back
    Then I should see orderscreen with menu item prize as "<SubTotalQty>"
    Then I should see the tax amount reflected to the check as "<TaxQty>"
    Then I should see orderscreen with menu item Total without Discount or Tax as "<TotalQty>"
    And I change the Quantity of menu Item as "<qty>"
    Then I should see orderscreen with menu item prize as "<SubTotalQty1>"
    Then I should see the tax amount reflected to the check as "<TaxQty>"
    Then I should see orderscreen with menu item Total without Discount or Tax as "<TotalQty1>"
    And I click Void button on order management screen
    Then I should see All orders are voided
    And I click Done button on the Popup
    And I click All
    Then I should see check stats Screen
    And I click Table Layout tab
   # And I click power button

 #   Examples:
  #    | table_no | number_of_seats  | Menu_Item      | Modifier | qty | SubTotalQty |  TaxQty  |  TotalQty  | SubTotalQty1 | TotalQty1 |
   #   | T13      |2             | French Friese  | Steak    | 3    | TL 65,00   | TL 0,00  | TL 65,00   | TL 195,00    | TL 195,00 |


 # Scenario Outline: Verify whether application allow to move the gift card from one seat to another seat along with gift card amount
  #  And I click All
   # Then I should see check stats Screen
    #And I click Table Layout tab
    And I click new check button on the Table layout screen
    And I select table as "<table_no>"
    And I select the number of seats as "<number_of_seats>"
    And I tap Continue to finish selecting the number of seats
    And I get check number
    Then I Should get back to the Order Screen
    And I click Options button
    And I click Gift card Button
    Then I should see Gift card window
    And I enter gift card number
    And I click charge amount field and pass the amount
    And I click Done button on the Popup
    Then I should see gift card amount add up into order screen
    Then I should see orderscreen with menu item prize as "<SubTotal>"
    Then I should see the tax amount reflected to the check as "<Tax>"
    Then I should see orderscreen with menu item Total without Discount or Tax as "<Total>"
    And I click the split seat from Order screen
    Then I should see the Split Screen
    Then I should see Gift card amount add up into seat 1 with amount
    And I click Gift card in seat 1
    And I click seat two on the split screen
    Then I should see Gift card amount add up into seat 2 with amount
    And I click the save & close button on the split screen
    Then I Should get back to the Order Screen
    And I click Void button on order management screen
    Then I should see the void reason popup
    And I click void Reason on the void popup
    And I click Add Button on the void reason popup
#    Then I should see Receipt Printer popup
#    And I click Done button on the Popup
    Then I should get back to the Table Layout tab
    #And I click power button
   # Examples:
    #  | table_no |number_of_seats| SubTotal  | Tax    | Total     |
     # | T12      |2              | TL 100,00 |TL 0,00 | TL 100,00 |

 # Scenario Outline: Verify whether application allow to merge the gift card along with gift card amount
  #  And I click All
   # Then I should see check stats Screen
    And I click Table Layout tab
    And I click new check button on the Table layout screen
    And I select table as "<table_no>"
    And I select the number of seats as "<number_of_seats>"
    And I tap Continue to finish selecting the number of seats
    And I get check number
    Then I Should get back to the Order Screen
    And I select Desserts as category
    And I select menu item as "<Menu_Item1>"
    And I click seat 2 for add menu item
    And I select Desserts as category
    And I select menu item as "<Menu_Item1>"
    And I click Options button
    And I click Gift card Button
    Then I should see Gift card window
    And I enter gift card number
    And I click charge amount field and pass the amount
    And I click Done button on the Popup
    Then I should see gift card amount add up into order screen
    And I click the split seat from Order screen
    Then I should see the Split Screen
    And I click seat to Group into one seat
    And I click another seat for Group
    And I click the Group Seats button in the Split Seat
    Then I should see selected seat item should club into one seat
    And I click the save & close button on the split screen
    Then I Should get back to the Order Screen
    And I click Cash button for Complete Sale
    And I click Exact button on the cash pop-up
    And I click Enter Button on the cash pop-up
    #  Then I should see the print or send receipt
     # And I click No thanks Button on the print receipt
    Then I should get back to the Table Layout tab
    And I click power button
 #   Examples:
  #    | table_no |number_of_seats|Menu_Item   |
   #   | T12      |2              | Cheesecake |

    Examples:
      | table_no | number_of_seats  |Menu_Item1 | Menu_Item      | Modifier | qty | SubTotalQty |  TaxQty  |  TotalQty  | SubTotalQty1 | TotalQty1 | SubTotal  | Tax    | Total     |
      | T13      |2                 |Cheesecake | French Friese  | Steak    | 3   | $ 15.00     | $ 0.00   | $ 15.00    | $ 45.00      | $ 45.00   | $ 100.00  |$ 0.00  | $ 100.00  |



  # Scenario Outline: Verify whether application can allow user to search item with invaild menu item name in search menu Item text box
   # And I click QSR tab
   # And I click Search Button on the Order Screen
   # Then I should see search field on the Order screen
   # And I pass menu item to search and click the menu item as "<Menu_item>"
   # Then I should see no menu item found text
    #And I select FOOD as category
    #And I select menu item as "<Menu_Item1>"
    #And I click Void button on order management screen
    #Then I should see All orders are voided
    #And I click Done button on the Popup
   # And I click All
    #Then I should see check stats Screen
    #And I click Table Layout tab
    #And I click power button

  #  Examples:
   #   | Menu_item |Menu_Item1|
    #  | Parotta | Onion Rings|

  #Scenario Outline: Remove Auto Discount
    #And I select Pasta as category
    #And I select menu item as Ling Pes Shrimp for free item auto Discount
    #And I select modifier as "<Modifier>"
    #And I swipe auto discount in order screen
    #And I click delete button
    #Then I should see you cannot delete this discount popup
    #And I click Done button on the Popup
    #And I click Void button on order management screen
    #Then I should see All orders are voided
    #And I click Done button on the Popup
    #And I click All
    #Then I should see check stats Screen
    #And I click Table Layout tab
    #And I click power button

    #Examples:
     # | Modifier  | Menu_item |Menu_Item1|
      #| Penne    |  Parottas | Onion Rings|


  Scenario Outline: Create New Check

    Then User click New Check option
    And I select table as "T15"
    And I select the number of seats as "1"
    And I tap Continue to finish selecting the number of seats
#    And User verify menu screen
#  Scenario: Pay Check with fast cash button
    When User click All button
    Then User click Table Layout menu
    Then User click New Check option
    And I select table as "T14"
    And I select the number of seats as "1"
    And I tap Continue to finish selecting the number of seats
    And I select category as "FOOD"
    Then User take an order
    When User click Cash Tab on Menu Item Page
    Then User click exact option
    And User click enter button
    And I click QSR tab
    And I closed the order type window
  #  Scenario: Split Check with Split Check Option and Separate Item
    Given User select QSR mode on menu item page
    When User select DineIn mode
    And I select table as "<txtTable>"
    And I select category as "FOOD"
    And I select menu item as "SANDWICHES"
    And User click finish button
    Then I should see table layout Screen
    And I click new check button on the Table layout screen
    And I select table as "T23"
    And I select the number of seats as "1"
    And I tap Continue to finish selecting the number of seats
    When I add a new seat
#    Then User verify added new seat
    And I get check number
    And I select category as "FOOD"
    And I select menu item as "SANDWICHES"
    And User click finish button
    Then User click split button
    And User select split check option
#    And User select table which will be split in check screen
    When I click the check from the table layout
    Then I should see the Split check screen
    When User click save and close in check screen
    And I click Void button on order management screen
    And I click void Reason on the void popup
    And I click Add Button on the void reason popup
    And I click Done button on the Popup
    And I click QSR tab
    And I closed the order type window
    #  Scenario: Split Check with Split Check Option and Split By Seat
    Given User select QSR mode on menu item page
    When User select DineIn mode
    And I select table as "<txtTable>"
    And I select category as "FOOD"
    And I select menu item as "SANDWICHES"
    And User click finish button
    Then User click New Check option
    And I select table as "T23"
    And I select the number of seats as "1"
    And I tap Continue to finish selecting the number of seats
    When I add a new seat
#    Then User verify added new seat
    And I get check number
    And I select category as "FOOD"
    And I select menu item as "SANDWICHES"
    And User click finish button
    Then User click split button
    And User select split check option
#    And User select table which will be split in check screen
    When I click the check from the table layout
    Then I should see the Split check screen
    Then User click split by seat button1
    When User click Save and Close button
    And I wait sometimes
    And I click All
    And I click Check Stats tab
    And I get the next check number after done split check process
    And I click the active check on check stats
    And I click open check button
#    And I get check number
    Then User verify orders which will be split
    And I click Void button on order management screen
    And I click void Reason on the void popup
    And I click Add Button on the void reason popup
    And I click Done button on the Popup
    And I click QSR tab
    And I closed the order type window
    And I click log off "<btnLogOff>" button in order screen "click log off button"

    Examples:
      |btnVoid|btnWrong           |btnAdd|btnDone|btnQsr|btnCancel|btnContinue|btnLogOff|btnSeatOne|txtTable|
      |Void   |Wrong Item Ordered   |Add   |Done   |QSR   |Cancel   |Continue   |logOff   |1         |T16     |


  Scenario Outline: Open Cash Drawer
    And I click new check button on the Table layout screen
    And User select first table
    And I select the number of seats as "1"
    And I tap Continue to finish selecting the number of seats
    When User take an order as "SANDWICHES"
    And User click Option Tab
    Then User select cash drawer option
    And User verify be directed menu item page
    And I click Void button on order management screen
    And I click void Reason on the void popup
    And I click Add Button on the void reason popup
    And I click Done button on the Popup
    And I click power button

    Examples:
      |btnVoid|btnWrong|btnAdd|btnDone|btnPower|
      |Void |Wrong Item Ordered|Add |Done |Power button |


  Scenario: Merge Check
    And I click new check button on the Table layout screen
##    And I click the "Right" in the table layout screen1 "click right button"
    And I select table as "T7"
    And I select the number of seats as "1"
    And I tap Continue to finish selecting the number of seats
    And I get check number
    And I select FOOD as category
    And I select menu item as "Onion Rings"
    And I click Finish Order button
    Then I should get back to the Table Layout tab
    And I click new check button on the Table layout screen
    And I select second table to be merged as "T8"
    And I select the number of seats as "1"
    And I tap Continue to finish selecting the number of seats
    And I get check number1
    And I select FOOD as category
    And I select menu item as "Onion Rings"
    And I click Finish Order button
    Then I should get back to the Table Layout tab
#    And I click Merge button
    Then User click Merge button in the table layout screen
    And I click the check from the table layout for merged
    And I click the check from the table layout for merged1
    And I click Done button to merge checks
#    Then I should see the Linga Popup
    And I click Done button on the Popup
    And I click Pay Check button
    And I click the check from the table layout for merged
    And I click cash button from the payment method popup
    And I click Submit button on the Payment Window
    Then I should get back to the Table Layout tab
    #  Scenario: Merge Check without Pay
    And I click new check button on the Table layout screen
    And I select table as "T9"
    And I select the number of seats as "1"
    And I tap Continue to finish selecting the number of seats
    And I get check number
    And I select FOOD as category
    And I select menu item as "Onion Rings"
    And I click Finish Order button
    Then I should get back to the Table Layout tab
    And I click new check button on the Table layout screen
    And I select second table to be merged as "T8"
    And I select the number of seats as "1"
    And I tap Continue to finish selecting the number of seats
    And I get check number1
    And I select FOOD as category
    And I select menu item as "Onion Rings"
    And I click Finish Order button
    Then I should get back to the Table Layout tab
    Then User click Merge button in the table layout screen
    And I click the check from the table layout for merged
    And I click the check from the table layout for merged1
    And I click Done button to merge checks
#    Then I should see the Linga Popup
    And I click Done button on the Popup
    And I click Pay Check button
    And I click the check from the table layout for merged
    Then I click cash button from the payment method popup
    And I click Submit button on the Payment Window
    Then I should get back to the Table Layout tab

#     Scenario: Merge check with pay - xxxxxx
    And I click new check button on the Table layout screen
    And I select table as "T9"
    And I select the number of seats as "1"
    And I tap Continue to finish selecting the number of seats
    And I get check number
    And I select FOOD as category
    And I select menu item as "Onion Rings"
    And I click Payment button in the Order Management Screen
    And I click cash button from the payment method popup
    And I click Exit to return to Order Management Screen
    And I click Finish Order button
    Then I should get back to the Table Layout tab
    And I click new check button on the Table layout screen
    And I select second table to be merged as "T8"
    And I select the number of seats as "1"
    And I tap Continue to finish selecting the number of seats
    And I get check number1
    And I select FOOD as category
    And I select menu item as "Onion Rings"
    And I click Finish Order button
    Then I should get back to the Table Layout tab
    Then User click Merge button in the table layout screen
    And I click the check from the table layout for merged
    And I click the check from the table layout for merged1
    And I click Done button to merge checks
#    Then I should see the Linga Popup
    And I click Done button on the Popup
    And I click Pay Check button
    And I click the check from the table layout for merged
    Then I click cash button from the payment method popup
    And I click Submit button on the Payment Window
    Then I should get back to the Table Layout tab
    And I click QSR tab
    And I closed the order type window
    When User click QSR on Menu Item page
    Then User select DineIn order type
    And I select the "T18" in the Table layout screen"click t4 table"
#    And I click the "Right" in the table layout screen1 "click right button"
#    And I click the check from the table layout for merged

    And User click add seat button
    And I get check number
    When User take an order as "SANDWICHES"
    And User select first seat on menu item page
    Then User take an order
    And User click finish button
    Then User click operation button
    And User select POS option
    And I closed the order type window
    When User click QSR on Menu Item page
    When User select DineIn mode
#    And I click the "Right" in the table layout screen1 "click right button"
    And I select the "T16" in the Table layout screen1"click t4 table"
    And I get check number1
    And User click add seat button
    And User take an order
    And User select first seat on menu item page
    Then User take an order
    And User click finish button
#    And I click the "Right" in the table layout screen1 "click right button"
    Then User click Merge button in the table layout screen
     And I click the check from the table layout for merged
    And I click the check from the table layout for merged1
    And I click Done button to merge checks
#    Then I should see the Linga Popup
    And I click Done button on the Popup
    When I click Pay Check button
    And I click the check from the table layout for merged
    And I click cash button from the payment method popup
    And User click submit button
    Then I should get back to the Table Layout tab
    And I click QSR tab
    And I closed the order type window
    When User click QSR on Menu Item page
    Then User select DineIn order type
#    And I click the "Right" in the table layout screen1 "click right button"
    And I select the "T10" in the Table layout screen"click t4 table"
    And I get check number
    When User take an order as "SANDWICHES"
    And User select first seat on menu item page
    Then User take an order
    And User click finish button
    Then User click operation button
    And User select POS option
    And I closed the order type window
    When User click QSR on Menu Item page
    When User select DineIn mode
#    And I click the "Right" in the table layout screen1 "click right button"
    And I select the "T12" in the Table layout screen1"click t4 table"
    And I get check number1
    And User click add seat button
    And User take an order
    And User select first seat on menu item page
    Then User take an order
    And User click finish button
#    And I click the "Right" in the table layout screen1 "click right button"
    Then User click Merge button in the table layout screen
     And I click the check from the table layout for merged
    And I click the check from the table layout for merged1
    And I click Done button to merge checks
#    Then I should see the Linga Popup
    And I click Done button on the Popup
    When I click Pay Check button
    And I click the check from the table layout for merged
    And I click cash button from the payment method popup
    And User click submit button
    Then I should get back to the Table Layout tab
#    And I click the "Left" in the table layout screen1 "click right button"
    And I click QSR tab
    And I closed the order type window
    And I click log off button in order screen


  Scenario Outline: Merge without Discount

    When User click Bar Tab on Check Status page
    Then User click new tab on Bar tab
    And User click cancel button for customer name popup
    And I click the Exit to close the preauth window
#    And I closed the order type window
    And I click Add Customer Button
    And I search for "<customer_name>"
    When I click "<customer_name>" to select customer for the seat
    Then I should see customer as "<customer>" added on order screen
    And I get check number
    And I select Pizza as Category
    Then User select PizzaMel menu item of pizza category
    And User click finish button
    Then User click new tab on Bar tab
    When User click cancel button for customer name popup
    And I click the Exit to close the preauth window
#    Then User click cancel button
    And I click Add Customer Button
    And I search for "<customer_name1>"
    When I click "<customer_name1>" to select customer for the seat
    Then I should see customer as "<customer1>" added on order screen
    And I get check number1
    And I select Pizza as Category
    Then User select Margarita menu item of pizza category
    And User click finish button
    Then User click Merge button in the table layout screen
    And I click closed check in bar tab
    And I click clear text button
  #  And I click yes button
    And I click closed check in bar tab1
#    And I click yes button
#    And I click yes button
    And I click clear text button
##    And I click "Hide keyboard" button in the keyboard "Click Back"
    And User click merge done button
#    Then I should see the Linga Popup
    And I click Done button on the Popup
    When User click Pay Check button on the bartab
    And I click merged barTab
#    And I click yes button
  Then I should see the Payment window
    And I click cash button from the payment method popup
    And User click submit button
    Then I should get back to the Table Layout tab
    And I click QSR tab
    Then User click cancel button
    #Scenario Outline: Merge with Discount
    Given User click All button
    When User click Bar Tab on Check Status page
    Then User click new tab on Bar tab
  When User click cancel button for customer name popup
    And I click the Exit to close the preauth window

    And I click Add Customer Button
    And I search for "<customer_name>"
    When I click "<customer_name>" to select customer for the seat
    Then I should see customer as "<customer>" added on order screen
    And I get check number
    And I select FOOD as category
    Then User select Sandwiches menu item
    Then User click finish button
    Then User click new tab on Bar tab
    When User click cancel button for customer name popup
    And I click the Exit to close the preauth window
#    Then User click cancel button
    And I click Add Customer Button
    And I search for "<customer_name1>"
    When I click "<customer_name1>" to select customer for the seat
    Then I should see customer as "<customer1>" added on order screen
    And I get check number1
    And I select Pasta as category
    And I select menu item as "Ravioli"
    And I select modifier as "Butter"
    And I click Done to get back
    And I select Discount on the Order screen
    Then I should see Check Based Discount Screen
    And I click Discount as "IB-BeforeTax-SetPrice500"
    And I click Back button on Discount Screen
#    When User click Option Tab
#    Then User select tax exempt option
#    And User click merge done button
#    And I click Back button on Tax Exempt window
#    And I click Back button on Check Options Screen
    Then I should see orderscreen with menu item prize as "$ 14.00"
    Then I should see the tax amount reflected to the check as "$ 0.10"
    Then I should see the Discount amount reflected to the check as "$ 13.00"
    Then I should see orderscreen with menu item Total as "$ 1.10"
    Then User click finish button
    Then User click Merge button in the table layout screen
    And I click closed check in bar tab
    And I click clear text button
#    And I click yes button
    And I click closed check in bar tab1
  And I click Yes button on the bartab
#    And I click yes button
    And I click clear text button
#    And I click "Hide keyboard" button in the keyboard "Click Back"
    And User click merge done button
    And User confirm merge checks confirmation popup
#    Then I should see the Linga Popup
    And I click Done button on the Popup
  When User click Pay Check button on the bartab
    And I click merged barTab
#    And I click yes button
  Then I should see the Payment window
    And I click cash button from the payment method popup
    And User click submit button
    Then I should get back to the Table Layout tab
    And I click QSR tab
    Then User click cancel button
    #Scenario Outline: Merge without Discount - Cancel Button
    Given User click All button
    When User click Bar Tab on Check Status page
    Then User click new tab on Bar tab
  When User click cancel button for customer name popup
    And I click the Exit to close the preauth window
#    Then User click cancel button
    And I click Add Customer Button
    And I search for "<customer_name>"
    When I click "<customer_name>" to select customer for the seat
    Then I should see customer as "<customer>" added on order screen
    And I get check number
#    When I click the Drop down "arrow down" button in the order screen "click drop down button"
    And I select Pizza as Category
    Then User select PizzaMel menu item of pizza category
   # And User verify total price of PizzaMel menu item
    And User click finish button
    Then User click new tab on Bar tab
  When User click cancel button for customer name popup
    And I click the Exit to close the preauth window
#    Then User click cancel button
    And I click Add Customer Button
    And I search for "<customer_name1>"
    When I click "<customer_name1>" to select customer for the seat
    Then I should see customer as "<customer1>" added on order screen
    And I get check number1
    And I select Pizza as Category
    Then User select Margarita menu item of pizza category
    And User click finish button
    Then User click Merge button in the table layout screen
    And I click closed check in bar tab
    And I click clear text button
#    And I click yes button
    And I click closed check in bar tab1
#    And I click yes button
#    And I click yes button
    And I click clear text button
##    And I click "Hide keyboard" button in the keyboard "Click Back"
    And User click merge done button
#    Then I should see the Linga Popup
    And I click Done button on the Popup
  When User click Pay Check button on the bartab
    And I click merged barTab
#    And I click yes button
  Then I should see the Payment window
    And I click cash button from the payment method popup
    And User click submit button
    Then I should get back to the Table Layout tab
    And I click QSR tab
    Then User click cancel button

#    Scenario Outline: Merge with Tax Exempt
    Given User click All button
    When User click Bar Tab on Check Status page
    Then User click new tab on Bar tab
  When User click cancel button for customer name popup
    And I click the Exit to close the preauth window
#    Then User click cancel button
    And I click Add Customer Button
    And I search for "<customer_name>"
    When I click "<customer_name>" to select customer for the seat
    Then I should see customer as "<customer>" added on order screen
    And I get check number
    And I select Pizza as Category
    Then User select PizzaMel menu item of pizza category
    When User click Option Tab
    Then User select tax exempt option
#    And User select tax exempt type
#    Then I should see the tax reflected to the check
    And User click finish button
    Then User click new tab on Bar tab
  When User click cancel button for customer name popup
    And I click the Exit to close the preauth window
#    Then User click cancel button
    And I click Add Customer Button
    And I search for "<customer_name1>"
    When I click "<customer_name1>" to select customer for the seat
    Then I should see customer as "<customer1>" added on order screen
    And I get check number1
    And I select Pizza as Category
    Then User select Margarita menu item of pizza category
#    Then I should see the tax reflected to the check
    And User click finish button
    Then User click Merge button in the table layout screen
    And I click closed check in bar tab

  And I click Yes button on the bartab
    And I click clear text button
#    And I click yes button
    And I click closed check in bar tab1
#    And I click yes button
#    And I click yes button
    And I click clear text button
#    And I click "Hide keyboard" button in the keyboard "Click Back"
    And User click merge done button
#    Then I should see the Linga Popup
    And I click Done button on the Popup
    When User click Pay Check button on the bartab
    And I click merged barTab
#    And I click yes button
    Then I should see the Payment window
    And I click cash button from the payment method popup
    And User click submit button
    Then I should get back to the Table Layout tab
    And I click QSR tab
    Then User click cancel button
    #Scenario Outline: Merge with Tax Exempt and Discount
    Given User click All button
    When User click Bar Tab on Check Status page
    Then User click new tab on Bar tab
  When User click cancel button for customer name popup
    And I click the Exit to close the preauth window
#    Then User click cancel button
    And I click Add Customer Button
    And I search for "<customer_name>"
    When I click "<customer_name>" to select customer for the seat
    Then I should see customer as "<customer>" added on order screen
    And I get check number
    And I select Pizza as Category
    Then User select PizzaMel menu item of pizza category
    Then I should see the tax reflected to the check
    And User click finish button
    Then User click new tab on Bar tab
  When User click cancel button for customer name popup
    And I click the Exit to close the preauth window
#    Then User click cancel button
    And I click Add Customer Button
    And I search for "<customer_name1>"
    When I click "<customer_name1>" to select customer for the seat
    Then I should see customer as "<customer1>" added on order screen
    And I get check number1
    When User click Option Tab
    Then User select tax exempt option
    And User click merge done button
#    And I click Back button on Tax Exempt window
#    And I click Back button on Check Options Screen
    And I select Pasta as category
    And I select menu item as "Ravioli"
    And I select modifier as "Butter"
    And I click Done to get back
    And I select Discount on the Order screen
    Then I should see Check Based Discount Screen
    And I click Discount as "IB-BeforeTax-SetPrice500"
    And I click Back button on Discount Screen
#    Then I should see the tax reflected to the check
    Then User click finish button
    Then User click Merge button in the table layout screen
    And I click closed check in bar tab
    And I click clear text button
#    And I click yes button
##    And I click "Hide keyboard" button in the keyboard "Click Back"
    And I click closed check in bar tab1
    And I click Yes button on the bartab
#    And I click yes button
    And I click clear text button
#    And I click "Hide keyboard" button in the keyboard "Click Back"
    And User click merge done button
    And User confirm merge checks confirmation popup
#    Then I should see the Linga Popup
    And I click Done button on the Popup
    When User click Pay Check button on the bartab
    And I click merged barTab
#    And I click yes button
    And I click cash button from the payment method popup
    And User click submit button
    Then I should get back to the Table Layout tab
    And I click QSR tab
    Then User click cancel button

#    Scenario Outline: Merge with Tax Exempt and Fix Gratuity
    Given User click All button
    When User click Bar Tab on Check Status page
    Then User click new tab on Bar tab
  When User click cancel button for customer name popup
    And I click the Exit to close the preauth window
#    Then User click cancel button
    And I click Add Customer Button
    And I search for "<customer_name>"
    When I click "<customer_name>" to select customer for the seat
    Then I should see customer as "<customer>" added on order screen
    And I get check number
#    When I click the Drop down "arrow down" button in the order screen "click drop down button"
    And I select Pizza as Category
    Then User select PizzaMel menu item of pizza category
    Then I should see the tax reflected to the check
    And User click finish button
    Then User click new tab on Bar tab
  When User click cancel button for customer name popup
    And I click the Exit to close the preauth window
#    Then User click cancel button
    And I click Add Customer Button
    And I search for "<customer_name1>"
    When I click "<customer_name1>" to select customer for the seat
    Then I should see customer as "<customer1>" added on order screen
    And I get check number1
    And I select FOOD as category
    And I select menu item as "French Friese"
    And I select modifier as "Steak"
    And I click Done to get back
    And I click Options button
    Then I should see the Check Options screen
    And I click Gratuity button
    Then I should see Add Gratuity screen
     # Gratuity - Fixed
    And I click Gratuity Fixed button
    Then I should return back to the order management screen and I should Gratuity is added
    Then User click finish button
    Then User click Merge button in the table layout screen
    And I click closed check in bar tab
    And I click clear text button
#    And I click yes button
##    And I click "Hide keyboard" button in the keyboard "Click Back"
    And I click closed check in bar tab1
#    And I click yes button
#    And I click yes button
    And I click clear text button
#    And I click "Hide keyboard" button in the keyboard "Click Back"
    And User click merge done button
#    Then I should see the Linga Popup
    And I click Done button on the Popup
    When User click Pay Check button on the bartab
    And I click merged barTab
#    And I click yes button
  Then I should see the Payment window
    And I click cash button from the payment method popup
    And User click submit button
    Then I should get back to the Table Layout tab
    And I click QSR tab
    Then User click cancel button
     # Scenario: Merge with Tax Exempt and Varying Gratuity
    Given User click All button
    When User click Bar Tab on Check Status page
    Then User click new tab on Bar tab
  When User click cancel button for customer name popup
    And I click the Exit to close the preauth window
#    Then User click cancel button
    And I click Add Customer Button
    And I search for "<customer_name>"
    When I click "<customer_name>" to select customer for the seat
    Then I should see customer as "<customer>" added on order screen
    And I get check number
    And I select Pizza as Category
    Then User select PizzaMel menu item of pizza category
    When User click Option Tab
    Then User select tax exempt option
#    And User select tax exempt type
    And User click finish button
    Then User click new tab on Bar tab
  When User click cancel button for customer name popup
    And I click the Exit to close the preauth window
#    Then User click cancel button
    And I click Add Customer Button
    And I search for "<customer_name1>"
    When I click "<customer_name1>" to select customer for the seat
    Then I should see customer as "<customer1>" added on order screen
    And I get check number1
    And I select FOOD as category
    And I select menu item as "French Friese"
    And I select modifier as "Steak"
    And I click Done to get back
    And I click Options button
    Then I should see the Check Options screen
    And I click Gratuity button
    Then I should see Add Gratuity screen
    And I click Gratuity varying button
    Then I should see enter Percentage popup
    And I pass the value and click Apply button as "8"
    Then I should return back to the order management screen and I should Gratuity is added
    And User click finish button
    Then User click Merge button in the table layout screen
    And I click closed check in bar tab

  And I click Yes button on the bartab
    And I click clear text button
#    And I click yes button
#    And I click "Hide keyboard" button in the keyboard "Click Back"
    And I click closed check in bar tab1
#    And I click yes button
#    And I click yes button
    And I click clear text button
#    And I click "Hide keyboard" button in the keyboard "Click Back"
    And User click merge done button
#    Then I should see the Linga Popup
    And I click Done button on the Popup
    When User click Pay Check button on the bartab
    And I click merged barTab
#    And I click yes button
  Then I should see the Payment window
    And I click cash button from the payment method popup
    And User click submit button
    Then I should get back to the Table Layout tab
    And I click QSR tab
    Then I closed the order type window
#    Scenario Outline: : Merge with Fix Gratuity

    Given User click All button
    When User click Bar Tab on Check Status page
    Then User click new tab on Bar tab
  When User click cancel button for customer name popup
    And I click the Exit to close the preauth window
#    Then User click cancel button
    And I click Add Customer Button
    And I search for "<customer_name>"
    When I click "<customer_name>" to select customer for the seat
    Then I should see customer as "<customer>" added on order screen
    And I get check number
    And I select FOOD as category
    And I select menu item as "French Friese"
    And I select modifier as "Steak"
    And I click Done to get back
    And I click Options button
    Then I should see the Check Options screen
    And I click Gratuity button
    Then I should see Add Gratuity screen
     # Gratuity - Fixed
    And I click Gratuity Fixed button
    Then I should return back to the order management screen and I should Gratuity is added
    And User click finish button
    Then User click new tab on Bar tab
     When User click cancel button for customer name popup
    And I click the Exit to close the preauth window
#    Then User click cancel button
    And I click Add Customer Button
    And I search for "<customer_name1>"
    When I click "<customer_name1>" to select customer for the seat
    Then I should see customer as "<customer1>" added on order screen
    And I get check number1
    And I select FOOD as category
    And I select menu item as "French Friese"
    And I select modifier as "Steak"
    And I click Done to get back
    And I click Options button
    Then I should see the Check Options screen
    And I click Gratuity button
    Then I should see Add Gratuity screen
    # Gratuity - Fixed
    And I click Gratuity Fixed button
    Then I should return back to the order management screen and I should Gratuity is added
    Then User click finish button
    Then User click Merge button in the table layout screen
    And I click closed check in bar tab
    And I click clear text button
#    And I click yes button
##    And I click "Hide keyboard" button in the keyboard "Click Back"
    And I click closed check in bar tab1
#    And I click yes button
#    And I click yes button
    And I click clear text button
#    And I click "Hide keyboard" button in the keyboard "Click Back"
    And User click merge done button
#    Then I should see the Linga Popup
    And I click Done button on the Popup
    When User click Pay Check button on the bartab
    And I click merged barTab
  Then I should see the Payment window
#    And I click yes button
    And I click cash button from the payment method popup
    And User click submit button
    Then I should get back to the Table Layout tab
    And I click power button

    Examples:
      |customer_name|customer|customer_name1|customer1 | menu |
      |Auto ragav   |Auto r  |auto loyaltytest  |auto l  |Onion Rings|


#  Scenario Outline: Delete Seat,Add New Seat
#    #Add New Seat
#    And User select first table
#    And I select the number of seats as "1"
#    And I tap Continue to finish selecting the number of seats
#    When I click Add Button to create Seat
#    Then User verify added new seat
#    #Delete Seat
#    When User select last added seat
#    And User down arrow icon
#    And User select edit seat button
#    And User delete selected seat
#    And User click done button for delete seat
#    When User down arrow icon
#    Then User verify deleted seat
#    And I click "<btnFinish>" in the order screen for closing order "Click Finish"
#    And I click power button
#
#    Examples:
#      |btnFinish|btnPower|
#      |finish   |Power button |


#  Scenario Outline: Add Group Seat, Group Seats- Without Selecting Seats
#    #Group Seats- Without Selecting Seats
#    And User select first table
#    And I select the number of seats as "1"
#    And I tap Continue to finish selecting the number of seats
#    When User take an order as "SANDWICHES"
#    When I add a new seat
#    Then User verify added new seat
#    When User take an order as "SANDWICHES"
#    And I click the split seat from Order screen
#    Then I should see the Split Screen
#    When I click the Group Seats button in the Split Seat
#    And I should see the Select the Seats to Merge Popup message
##    Then User verify seats to merge warning popup
#    And I click Done button on the Popup
#    #Add Group Seat
#    Then I select seat one
#    When User click group seat button
#    Then User verify group seat option
#    #Pay Group Seat Order
#    When User select seat is payable
#    Then User click pay button on split seat
#    And User click exact option
#    And I click cash button from the payment method popup
#    And User click submit button
#    When User click Check Status tab
#    Then User click Closed Checks tabs
#    And User verify closed checks
#    And I click the "Power button" in the close the day screen "click Power button"
#
##    And I click QSR tab
##    And I closed the order type window
##    And I click log off "<btnLogOff>" button in order screen "click log off button"
#
#
#    Examples:
#      |btnQsr|btnCancel|btnLogOff|
#      |QSR   |Cancel|logOff      |
#


























