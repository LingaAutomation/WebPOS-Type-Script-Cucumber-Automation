Feature: JIRAS Sceanrios

  @JIra
  Scenario: Total charge value is displayed wrong in Digital Receipt Screen, in the following scenario
    Given I'm logged in
    And I select the TOGO order type
    And I click Done button to select the order type
    Then I should see the customer profile window
    And I select search
    And I enter an existing customer's name "auto ragav"
    And I select the customer
    And I click the Save button
    Then I Should get back to the Order Screen
    Then I should see customer as "Auto r" added on order screen
    And I get check number
    And I select category as "FOOD"
    And I select menu item as "Garlic Bread"
    And I select modifier as "4 BBQ"
    And I click Done to get back
    And I get value the menu values from order screen
#    And I get order screen value the menu values from order screen
    And I click Payment button in the Order Management Screen
    And I click cash button from the payment method popup
    And I get the paid amount value in the payment window
    And I click Submit button on the Payment Window
    When I verify the Total value with digital printer screen
    And I click No thanks Button on the print receipt
    And I click QSR tab
    And I select the order type FOR HERE
    Then I should see the customer profile window
    And I select search
    And I enter an existing customer's name "auto ragav"
    And I select the customer
    And I click the Save button
    Then I Should get back to the Order Screen
    Then I should see customer as "Auto r" added on order screen
    And I get check number1
    And I select category as "FOOD"
    And I select menu item as "Garlic Bread"
    And I select modifier as "4 BBQ"
    And I click Done to get back
    And I get value the menu values from order screen1
#    And I get order screen value the menu values from order screen1
    And I click Payment button in the Order Management Screen
    And I click credit card payment on payment window
    Then I should see total screen
    And I click the Continue button on the Total screen
    And I click manual button on the your order screen
    And I pass the card number as "4111111111111111"
    And I pass card name as "VISA"
    And I pass expire date as "1224"
    And I click Process button on card screen
    And I click Ok button in receipt printer popup
    When I verify the Total value with digital printer screen1
    And I click No thanks Button on the print receipt
    And I click Check Stats tab
    And I click Closed tab on the Check stats
    And I click the Closed check on check stats
    And I click reopen check button on the check stats screen
    Then I Should get back to the Order Screen
    And I click Payment button in the Order Management Screen
    And I click Submit button on the Payment Window
    When I verify the Total value with digital printer screen2
    And I click No thanks Button on the print receipt
    And I click Check Stats tab
    And I click Closed tab on the Check stats
    And I click the Closed check on check stats1
    And I click reopen check button on the check stats screen
    Then I Should get back to the Order Screen
    And I click Payment button in the Order Management Screen
    And I click Submit button on the Payment Window
    When I verify the Total value with digital printer screen3
    And I click No thanks Button on the print receipt
    And I click power button

Scenario: In digital receipt screen the amount shows wrongly in the following scenario
  Given I'm logged in
  And I closed the order type window
  And I click Add Customer Button
  And I search for "auto loyalty"
  When I click "auto loyalty" to select customer for the seat
  And I get check number
  And I select category as "FOOD"
  And I select menu item as "mongo test"
  And I get order screen value the menu values from order screen1
  And I click Payment button in the Order Management Screen
  And I enter the payment value as "2000"
  And I click loyalty payment
  And I enter the payment value as "2500"
  And I click loyalty payment
  And I enter the payment value as "500"
  And I click loyalty payment
  And I click Submit button on the Payment Window
  When I verify the Total value with digital printer screen1
  And I click No thanks Button on the print receipt
  And I closed the order type window
  And I click log off button in order screen

  @cii
  Scenario: Customererrr
    Given I'm logged in
    And I closed the order type window
    And I click All
    And I click BarTab Layout
    And I select Menu For Basic validation2 as "Additional"
#  And I select Menu of Basic validation for QSR as "Additional"


  Scenario: In Digital receipt screen, total charge is displayed wrongly
    Given I'm logged in
    And I closed the order type window
    And I get check number
    And I select category as "FOOD"
    And I select menu item as "Onion Rings"
    And I get order screen value the menu values from order screen
    And I get the cash reward value from the order screen
    And I click Payment button in the Order Management Screen
    And I click cash button from the payment method popup
    When I verify the Change due value with Cash reward value is Same
    And I click Done button on the Popup
#    When I verify the paid amount is same with the total amount in payment window
    And I get the paid amount value in the payment window
    And I click Submit button on the Payment Window
    When I verify the Total value with digital printer screen for Cash Reward
    And I click No thanks Button on the print receipt
    And I closed the order type window
    And I click log off button in order screen



