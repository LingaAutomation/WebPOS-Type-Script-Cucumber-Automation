@Payments1  @Regressionp          @VerificationForUSDStore123
Feature:Tax in Scenarios

#  Background:
#    Given I'm logged in
#    And I closed the order type window
#    And I click All
#    And I click Table Layout tab


  Scenario Outline: Item Based and Check based Taxes

      #####   Item based tax (amount)  #####
    Given I'm logged in
    And I close the order type window
    And I click All
    And I click Table Layout tab
    And I click new check button on the Table layout screen
    And I select table as "T10"
    And I select the number of seats as "1"
    And I tap Continue to finish selecting the number of seats
    And I get check number
    And I select category as "Menu"
    And I select menu item as "Burger"
    Then I should verify subtotal value as "$ 7.58"
    Then I should verify tax value as "$ 1.78"
    Then I should verify total value as "$ 9.36"
    And I click Cash button for Complete Sale
    And I click Exact button on the cash pop-up
    And I click Enter Button on the cash pop-up

#########   Default tax  #########
    And I click Table Layout tab
    And I click new check button on the Table layout screen
    And I select table as "T10"
    And I select the number of seats as "1"
    And I tap Continue to finish selecting the number of seats
    And I get check number
    And I select category as "Menu"
    And I select menu item as "Default Menu"
    Then I should verify subtotal value as "$ 4.88"
    Then I should verify tax value as "$ 0.37"
    Then I should verify total value as "$ 5.25"
    And I click Cash button for Complete Sale
    And I click Exact button on the cash pop-up
    And I click Enter Button on the cash pop-up
    And I click Table Layout tab

#########  Quantity based tax  ########
    And I click new check button on the Table layout screen
    And I select table as "T7"
    And I select the number of seats as "1"
    And I tap Continue to finish selecting the number of seats
    And I select category as "Appetizers"
    And I select menu item as "RAPINI"
    Then I should see orderscreen with menu item prize as "$ 13.00"
    Then I should see the tax amount reflected to the check as "$ 0.65"
    Then I should see orderscreen with menu item Total without Discount or Tax as "$ 13.65"
#    Then I should verify total value as "$ 15.75"
    And I change the Quantity of menu Item as "5"
    Then I should see orderscreen with menu item prize as "$ 65.00"
    Then I should see the tax amount reflected to the check as "$ 6.50"
    Then I should see orderscreen with menu item Total without Discount or Tax as "$ 71.50"
#    Then I should verify total value as "$ 82.50"
    And I change the Quantity of menu Item as "8"
    Then I should see orderscreen with menu item prize as "$ 104.00"
    Then I should see the tax amount reflected to the check as "$ 15.60"
    Then I should see orderscreen with menu item Total without Discount or Tax as "$ 119.60"
#    Then I should verify total value as "$ 138.00"
    And I click Cash button for Complete Sale
    And I click Exact button on the cash pop-up
    And I click Enter Button on the cash pop-up
    And I click Table Layout tab

    #########  Inclusive tax  ########
    And I click new check button on the Table layout screen
    And I select table as "T8"
    And I select the number of seats as "1"
    And I tap Continue to finish selecting the number of seats
    And I select category as "Pasta"
#    And I select category as "Pasta"
    And I select menu item as RavioliPesto for Item Based Inclusive Tax
    And I select modifier as "Butter"
    And I click Done to get back
    Then I should see orderscreen with menu item prize as "$ 15.00"
    Then I should see the tax amount reflected to the check as "$ 1.36"
    Then I should see orderscreen with menu item Total without Discount or Tax as "$ 15.00"
#    Then I should verify total value as "$ 15.00"
    And I click Cash button for Complete Sale
    And I click Exact button on the cash pop-up
    And I click Enter Button on the cash pop-up
    And I click Table Layout tab

    #########  Check tax(Enable Apply on subtotal)  ##########
    And I click new check button on the Table layout screen
    And I select table as "T9"
    And I select the number of seats as "1"
    And I tap Continue to finish selecting the number of seats
    And I select category as "Arab Biriyani"
    And I select menu item as "sambar"
    And I change the Quantity of menu Item1 as "11"
    Then I should see orderscreen with menu item prize as "$ 1,100.00"
    Then I should see the tax amount reflected to the check as "$ 0.00"
    Then I should see orderscreen with menu item Total without Discount or Tax as "$ 1,100.00"
#    Then I should verify total value as "$ 1,196.57"
    And I click Cash button for Complete Sale
    And I click Exact button on the cash pop-up
    And I click Enter Button on the cash pop-up
    And I click Table Layout tab

    #############   Check tax(Without enable Apply on subtotal)  ##############
    And I click new check button on the Table layout screen
    And I select table as "T10"
    And I select the number of seats as "1"
    And I tap Continue to finish selecting the number of seats
    And I select category as "Arab Biriyani"
    And I select menu item as "sambar"
    And I change the Quantity of menu Item1 as "12"
#    And I select Desserts as category
#    And I select menu item as "Cheesecake"
    Then I should see orderscreen with menu item prize as "$ 1,200.00"
    Then I should see the tax amount reflected to the check as "$ 105.35"
    Then I should see orderscreen with menu item Total without Discount or Tax as "$ 1,305.35"
#    Then I should verify total value as "$ 1,305.35"
    And I click Cash button for Complete Sale
    And I click Exact button on the cash pop-up
    And I click Enter Button on the cash pop-up
    And I click Table Layout tab

    #######  Tax on item tax  #######
    And I click new check button on the Table layout screen
    And I select table as "T11"
    And I select the number of seats as "1"
    And I tap Continue to finish selecting the number of seats
    And I select category as "Pasta"
    And I select menu item as Ling Meatballs for Tax on Item Tax
    And I select modifier as "Butter"
    And I click Done to get back
    Then I should see orderscreen with menu item prize as "$ 4.00"
    Then I should see the tax amount reflected to the check as "$ 0.44"
    Then I should see orderscreen with menu item Total without Discount or Tax as "$ 4.44"
    And I click Cash button for Complete Sale
    And I click Exact button on the cash pop-up
    And I click Enter Button on the cash pop-up
    And I click Table Layout tab

#  Scenario Outline: Tax on check Tax
    And I click new check button on the Table layout screen
    And I select table as "T8"
    And I select the number of seats as "1"
    And I tap Continue to finish selecting the number of seats
    And I select category as "Menu"
    And I select menu item as "Halwa"
    And I change the Quantity of menu Item as "8"
    Then I should see orderscreen with menu item prize as "$ 80.00"
    Then I should see the tax amount reflected to the check as "$ 8.00"
    Then I should see orderscreen with menu item Total without Discount or Tax as "$ 88.00"
    And I click Void button on order management screen
    Then I should see All orders are voided
    And I click Done button on the Popup
    And I click All
    Then I should get back to the Table Layout tab
    And I click power button
#    Examples:
#
#     | Tax | SubTotal | Total |
#      |TL 1.600,00 | TL 8.000,00 | TL 9.600,00 |


    Examples:
      | btnAll | TaxQty1 | SubTotalQty1 | TotalQty1 | TaxQty5   | SubTotalQty5 | TotalQty5 |TaxQty8  | TotalQty8 | SubTotalQty8 |
      |All     |$ 1.50   | $ 15.00      | $ 16.50   | $ 7.50    | $ 75.00      | $ 82.50   | $ 12.00 | $ 132.00  | $ 120.00     |


  Scenario Outline: Item Based Inclusive Tax
    Given I'm logged in
    And I closed the order type window
#    And I tap QSR button to open the order types combo
#    And I click on the "QSR" Service type in the dropdown
    And I select category as "FOOD"
    And I select menu item as "SANDWICHES"
    Then User verify added inclusive tax rate
    #Item based Exclusive Tax
    Then User verify added exclusive tax rate
    #Quantity Based Tax
    And I click Add Customer Button
    And I search for "thomas a"
    When I click "thomas a" to select customer for the seat
    Then User verify added quantity tax rate
    And I click on the Order Button
    And I click Void button on order management screen
    Then I should see the void reason popup
    And I click void Reason on the void popup
    And I click Add Button on the void reason popup
    And I closed the order type window
    #Verify the menu item which has Tax as a Default Tax
    When User click pizza category
    Then User select PizzaMel menu item of pizza category
    And I click Done button on the Popup
    And User verify default tax on PizzaMel
    When User click void button
    And I click Done button on the Popup
    #Verify menu item which has Quantity Based Tax
    And I select category as "FOOD"
    And I select menu item as "Onion Rings"
    And User verify quantity based tax on OnionRings
    When User click void button
    Then I should see All orders are voided
    And I click Done button on the Popup
    # Verify menu item which has Inclusive Tax
    When User click pizza category
    And I select menu item as "Cheese Pizza"

    And I click "New York" in the Modifier page1 "click modifier"
    And I click Done button on the Popup
    And User verify inclusive tax on Cheese Pizza
    When User click void button
    Then I should see All orders are voided
    And I click Done button on the Popup
     #Verify menu item which has check based without subtotal tax
    When User click pizza category
    Then User select PizzaMel menu item of pizza category
    And I click Done button on the Popup
    And User verify check based tax without subtotal on Margarita
    When User click void button
    Then I should see All orders are voided
    And I click Done button on the Popup
    #Verify menu item which has Check Based with subtotal tax
    When User click pizza category
    And I select menu item as "Pizza Rucola"
    And I click Done button on the Popup
    And User verify check based tax with subtotal on PizzaTomBasil
    When User click void button
    Then I should see All orders are voided
    And I click Done button on the Popup
    #Verify tax on item tax for inclusive tax
    When User click pizza category
    And I select menu item as "California Pizza"
    And User verify tax on item tax for inclusive tax on PizzaTomBasil
    When User click void button
    Then I should see All orders are voided
    And I click Done button on the Popup
    #Verify tax on item tax for default tax
    When User click pizza category
    And I select menu item as "Neapolitan Pizza"
    And User verify tax on item tax for inclusive tax on NeapolitanPizza
    When User click void button
    Then I should see All orders are voided
    And I click Done button on the Popup
    #Check with Exclusive Tax on Bar Tab
    And I click the Settings button
    And User click POS Option
    Then User open ask customer name option if disable in void screen
    And I click the Toggle Icon button
    And I click POS Icon from Toggle
    And User click cancel button
    And I click All
    And I click BarTab Layout
    And I click New Tab in the Bar Tab Screen
    And I click the Exit to close the preauth window
    And User enter customer name for bar tab

    And I select category as "CIFOOD"
    And I select menu item as "Bacon Omelet Senior"
    And I click Done button on the Popup
    When User verify exclusive tax amount for Bacon Omelet Senior
    And I click Cash button for Complete Sale
    And I click Exact button on the cash pop-up
    And I click Enter Button on the cash pop-up
#    And I closed the order type window
    #Check with Inclusive Tax on Bar Tab
#    And I click All
#    And I click BarTab Layout
    And I click New Tab in the Bar Tab Screen
    And I click the Exit to close the preauth window
    And User enter customer name for bar tab
    And I select category as "FOOD"
    And I select menu item as "MANTI"
    And I click Done button on the Popup
    When User verify inclusive tax amount for Mantı
    And I click Cash button for Complete Sale
    And I click Exact button on the cash pop-up
    And I click Enter Button on the cash pop-up
#    And I closed the order type window
    And I click power button

    Examples:
      |btnVoid|        btnWrong   |btnAdd|btnDone|btnDropDown|category|category1|btnModifier|
      |Void   |Wrong Item Ordered |Add   |Done   |arrow down |CIFOOD  |FOOD     |New York   |

