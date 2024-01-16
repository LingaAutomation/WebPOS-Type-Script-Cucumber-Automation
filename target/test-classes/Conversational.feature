
Feature: Conversational and Serving Size Feature

  Scenario Outline: Verify when user enable the conversational option in category level it gets reflected in IPAD
    Given I'm logged in
    And I closed the order type window
    And I select Pizza as Category
    And I select menu item as "<menu>"
    Then I should see the serving size screen
    And I click Void button on order management screen
    Then I should see All orders are voided
    And I click Done button on the Popup

 # Scenario Outline: Verify when user enable the conversational option in Sub-category level it gets reflected in IPAD
  #  Given I'm logged in
   # And I closed the order type window
    And I select Breakfast as Category
    And I select menu item as "<menu1>"
    Then I should see the serving size screen
    And I select Breakfast as Category
    And I select Briyani as SubCategory
    And I select menu item as "<menu2>"
    Then I should see the serving size screen
    And I click Void button on order management screen
    Then I should see All orders are voided
    And I click Done button on the Popup


 # Scenario Outline: Verify when user enable the conversational option in Menu level it gets reflected in IPAD
  #  Given I'm logged in
   # And I closed the order type window
    And I select FOOD as category
    And I select menu item as "<menu3>"
    Then I should see the serving size cell
    Then I should see the serving size screen
    And I click Mandatory Modifier in conversational screen

    And I click Void button on order management screen
    Then I should see All orders are voided
    And I click Done button on the Popup

#  Scenario Outline: Verify whether the user can change the serving size from conversational screen
  #  Given I'm logged in
   # And I closed the order type window
    And I select Breakfast as Category
    And I select Briyani as SubCategory
    And I select menu item as "<menu2>"
    Then I should see the serving size cell
    Then I should see the serving size screen
    And I get the serving size
    And I click Void button on order management screen
    Then I should see All orders are voided
    And I click Done button on the Popup


 # Scenario Outline:  Verify whether application shows pizza slice for serving size for single menu item with single serving size
  #  Given I'm logged in
   # And I closed the order type window
    And I select Pizza as Category
    And I select menu item as "<menu4>"
    Then I should see the serving size cell

    And I click Void button on order management screen
    Then I should see All orders are voided
    And I click Done button on the Popup

 # Scenario Outline:Verify the application shows Cancel,Start Over and Done options in conversational screen in IPAD
  #  Given I'm logged in
   # And I closed the order type window
    And I select Pizza as Category
    And I select menu item as "<menu4>"
    Then I should see the serving size cell
    Then I should see cancel button is enable
    Then I should see start over button is enable
    Then I should see done button is enable
    And I click Void button on order management screen
    Then I should see All orders are voided
    And I click Done button on the Popup

  #Scenario Outline: Verify application shows included modifier in the conversational modifier screen
   #Given I'm logged in
    #And I closed the order type window
    And I select Pizza as Category
    And I select menu item as "<menu5>"
    Then I should see include modifier as "BQ Chicken" added with menu item
    Then I should see the serving size cell
    Then I should see include modifier as "BQ Chicken" in conversational modifier screen
    And I click Mandatory Modifier in conversational screen

    And I click Void button on order management screen
    Then I should see All orders are voided
    And I click Done button on the Popup

 # Scenario Outline: Verify included modifier gets removed from the order screen when user click Start over button
   # Given I'm logged in
    #And I closed the order type window
    And I select Pizza as Category
    And I select menu item as "<menu5>"
    Then I should see include modifier as "BQ Chicken" added with menu item
    Then I should see the serving size cell
    Then I should see include modifier as "BQ Chicken" in conversational modifier screen
    And I click start over button in coversational modifier screen
    Then I should not see include modifier added with menu item
    And I click Mandatory Modifier in conversational screen
    And I click Void button on order management screen
    Then I should see All orders are voided
    And I click Done button on the Popup

  #Scenario Outline:Verify when user click on included modifier application shows "NO" in front of the included modifier
  #  Given I'm logged in
   # And I closed the order type window
    And I select Pizza as Category
    And I select menu item as "<menu5>"
    Then I should see include modifier as "BQ Chicken" added with menu item
    Then I should see the serving size cell
    Then I should see include modifier as "BQ Chicken" in conversational modifier screen
    And I click include modifier in conversational screen
    Then I should see include modifier as "No BQ Chicken" added with menu item
    And I click Mandatory Modifier in conversational screen

    And I click Void button on order management screen
    Then I should see All orders are voided
    And I click Done button on the Popup

  #Scenario Outline: Verify whether application allow the user to select alternate modifier for include modifier in conventional modifier screen
   # Given I'm logged in
    #And I closed the order type window
    And I select Pizza as Category
    And I select menu item as "<menu5>"
    Then I should see include modifier as "BQ Chicken" added with menu item
    Then I should see the serving size cell
    Then I should see the serving size screen
    And I click include modifier in conversational screen
    Then I should see include modifier as "No BQ Chicken" added with menu item
    And I click alternate modifier button in conversational modifier screen
    Then I should see alternate modifier screen
    And I click modifier from alternate modifier screen
    And I click ok button in alternate modifier screen
    Then I should see include modifier as "With Cheese" in conversational modifier screen
    Then I should see include modifier as "With Cheese" added with menu item
    And I click Mandatory Modifier in conversational screen
    And I click Void button on order management screen
    Then I should see All orders are voided
    And I click Done button on the Popup


#  Scenario Outline: Verify whether application allow to revert the alternate modifier selected
#    Given I'm logged in
#    And I closed the order type window
    And I select Pizza as Category
    And I select menu item as "<menu5>"
    Then I should see include modifier as "BQ Chicken" added with menu item
    Then I should see the serving size cell
    Then I should see the serving size screen
    And I click include modifier in conversational screen
    Then I should see include modifier as "No BQ Chicken" added with menu item
    And I click alternate modifier button in conversational modifier screen
    Then I should see alternate modifier screen
    And I click modifier from alternate modifier screen
    And I click ok button in alternate modifier screen
    Then I should see include modifier as "With Cheese" in conversational modifier screen
    Then I should see include modifier as "With Cheese" added with menu item
    And I click include modifier in conversational screen
    And I click alternate modifier button in conversational modifier screen
    Then I should see alternate modifier screen
    And I click Revert button in alternate modifier screen
    Then I should see include modifier as "BQ Chicken" in conversational modifier screen
    Then I should see include modifier as "No BQ Chicken" added with menu item
    And I click Mandatory Modifier in conversational screen
    And I click Void button on order management screen
    Then I should see All orders are voided
    And I click Done button on the Popup

#  Scenario Outline: Verify application shows override prefix charges in the order screen
   # Given I'm logged in
    #And I closed the order type window
    And I select Pizza as Category
    And I select menu item as "<menu5>"
    Then I should see include modifier as "BQ Chicken" added with menu item
    Then I should see the serving size cell
    Then I should see include modifier as "BQ Chicken" in conversational modifier screen
    Then I should see include modifier as "No BQ Chicken" added with menu item
    And I click include modifier in conversational screen
    And I click prefix modifier
    Then I should see include modifier as "Extra BQ Chicken" added with menu item
    And I click Mandatory Modifier in conversational screen
    And I click Void button on order management screen
    Then I should see All orders are voided
    And I click Done button on the Popup


#  Scenario Outline: Verify application shows Mandatory modifier in the conventional modifier screen
#    Given I'm logged in
#    And I closed the order type window
    And I select Pizza as Category
    And I select menu item as "<menu5>"
    Then I should see include modifier as "BQ Chicken" added with menu item
    Then I should see include modifier as "BQ Chicken" in conversational modifier screen
    And I click Mandatory Modifier in conversational screen
#    Then I should see Mandatory Modifier in conversational screen
    And I click Void button on order management screen
    Then I should see All orders are voided
    And I click Done button on the Popup

  #Scenario Outline: Verify application shows Minimum and maximum count in the conventional screen
   # Given I'm logged in
    #And I closed the order type window
    And I select Pizza as Category
    And I select menu item as "<menu5>"
    Then I should see include modifier as "BQ Chicken" added with menu item
    Then I should see include modifier as "BQ Chicken" in conversational modifier screen
    Then I should see Mandatory Modifier in conversational screen with count of maximum and minimum
    And I click Mandatory Modifier in conversational screen
    And I click Void button on order management screen
    Then I should see All orders are voided
    And I click Done button on the Popup

  #Scenario Outline: Verify application allows the user to complete the sale without selecting the mandatory modifier
   # Given I'm logged in
    #And I closed the order type window
    And I select FOOD as category
    And I select menu item as "<menu6>"
    Then I should see include modifier as "1/2 Bbq Chicken" added with menu item
    Then I should see include modifier as "1/2 Bbq Chicken" in conversational modifier screen
    Then I should see Mandatory Modifier in conversational screen with count of maximum and minimum
    And I click Done to get back
    Then I should see you need to pick atleast 1 modifiers from this group popup
    And I click Done button on the Popup1
    And I click Mandatory Modifier in conversational screen
    And I click Void button on order management screen
    Then I should see All orders are voided
    And I click Done button on the Popup
    And I click log off button in order screen

    Examples:
      | menu          | menu1  | menu2           | menu3             |menu4       | menu5  |menu6|
      |Pizza Romano   |sappthi   | Chicken Briyani |Pizza Romano 12inch|Pizza Rucola|pizzaaa| Pizza Romano 12inch|
