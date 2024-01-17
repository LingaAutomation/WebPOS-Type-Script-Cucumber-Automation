
Feature: Ask Seat Number Feature
  @AskSe
  Scenario: Verify the "Ask Seat count in Table Layout" new toggle in Pos settings under DINE IN is available
    Given I'm logged in
    And I closed the order type window
    And I click the Settings button
    And I click the POS settings from Toggle
    And I verify that ask seat count toggle is available
    And I click power button1
  @AskSe
  Scenario: Verify the "Ask Seat count in Table Layout" new toggle in Pos settings under DINE IN is Enabled
    Given I'm logged in
    And I closed the order type window
    And I click the Settings button
    And I click the POS settings from Toggle
    And I verify that ask seat count toggle is enabled
    And I verify that ask customer for Dine In is disabled

    And I click the Toggle Icon button
    And I click POS Icon from Toggle
    And I closed the order type window
    And I click All
    And I click Table Layout tab
    And I select random table on the table layout
    When I should verify the ask seat number on the table layout
    And I select the number of seats as "1"
    And I tap Continue to finish selecting the number of seats
    Then I Should get back to the Order Screen
    And I click All
    And I click power button
  @AskSe
  Scenario: Verify the order screen and click the Dine in as service type
    Given I'm logged in
    And I closed the order type window
    And I click All
    And I click Table Layout tab
    And I select random table on the table layout
    When I should verify the ask seat number on the table layout
    And I select the number of seats as "1"
    And I tap Continue to finish selecting the number of seats
    Then I Should get back to the Order Screen
    And I get check number
    And I select category as "FOOD"
    And I select menu item as "Chicken Schnitzel"
    And I click Finish Order button
    And I click Table Layout tab
    And I click power button

  @AskSe
  Scenario: Verify the order screen ALL button
    Given I'm logged in
    And I closed the order type window
    And I click All
    And I click Table Layout tab
    And I select random table on the table layout
    When I should verify the ask seat number on the table layout
    And I select the number of seats as "4"
    And I tap Continue to finish selecting the number of seats
    Then I Should get back to the Order Screen
    When I verify the seat count on the order screen
    And I click All
    And I click Table Layout tab
    And I click power button

  @AskSe
  Scenario: Verify the multi seats
    Given I'm logged in
    And I closed the order type window
    And I click All
    And I click Table Layout tab
    And I select random table on the table layout
    When I should verify the ask seat number on the table layout
    And I select the number of seats as "3"
    And I tap Continue to finish selecting the number of seats
    Then I Should get back to the Order Screen
    When I verify the seat count on the order screen
    And I get check number
    And I select category as "FOOD"
    And I select menu item as "Chicken Schnitzel"
    And I select seat two
    And I select category as "FOOD"
    And I select menu1 item as "Onion Rings"
    And I select seat three
    And I select category as "FOOD"
    And I select menu2 item as "Chicken Schnitzel"
    And I select seat one
    And I verify menu item on the order screen
    And I select seat two
    And I verify menu1 item on the order screen
    And I select seat three
    And I verify menu2 item on the order screen
    And I click Finish Order button
    And I click Table Layout tab
    And I click power button

  @AskSe
  Scenario: Verify the multi floor's
    Given I'm logged in
    And I closed the order type window
    And I click All
    And I click Table Layout tab
    And I click right symbol
    Then I should see next floor
    And I select random table on the table layout
    When I should verify the ask seat number on the table layout
    And I select the number of seats as "2"
    And I tap Continue to finish selecting the number of seats
    Then I Should get back to the Order Screen
    When I verify the seat count on the order screen
    And I get check number
    And I click Finish Order button
    And I click Table Layout tab
    And I click power button

  @AskSe
  Scenario: Verify the closed checks
    Given I'm logged in
    And I closed the order type window
    And I click All
    And I click Table Layout tab
    And I select random table on the table layout
    When I should verify the ask seat number on the table layout
    And I select the number of seats as "1"
    And I tap Continue to finish selecting the number of seats
    Then I Should get back to the Order Screen
    When I verify the seat count on the order screen
    And I get check number
    And I select category as "FOOD"
    And I select menu item as "Chicken Schnitzel"
    And I select menu item as "Onion Rings"
    And I click Payment button in the Order Management Screen
    And I click cash button from the payment method popup
    And I click Submit button on the Payment Window
    And I click Table Layout tab
    And I click Check Stats tab
    And I click Closed tab on the Check stats
    And I click the Closed check on check stats
    And I click reopen check button on the check stats screen
    And I Should get back to the Order Screen
    And I verify that service type should not changeable

    And I click Payment button in the Order Management Screen
    And I click Submit button on the Payment Window
    And I click Table Layout tab
    And I click power button

  @AskSe
  Scenario: When order screen have multiple seats but single seat only have completed the payment
    Given I'm logged in
    And I closed the order type window
    And I click All
    And I click Table Layout tab
    And I select random table on the table layout
    When I should verify the ask seat number on the table layout
    And I select the number of seats as "3"
    And I tap Continue to finish selecting the number of seats
    Then I Should get back to the Order Screen
    When I verify the seat count on the order screen
    And I get check number
    And I select seat two
    And I select category as "FOOD"
    And I select menu item as "Chicken Schnitzel"
    And I select menu1 item as "Onion Rings"
    And I should verify subtotal value as "$ 21.00"
    And I should verify tax value as "$ 0.90"
    And I should verify total value as "$ 21.90"
    And I click Payment button in the Order Management Screen
    And I click cash button from the payment method popup
    And I click Submit button on the Payment Window
    And I click Table Layout tab
    And I click Check Stats tab
    And I click Closed tab on the Check stats
    And I click the Closed check on check stats
    And I click reopen check button on the check stats screen
    And I Should get back to the Order Screen
    And I verify that service type should not changeable
    And I select seat two
    And I verify menu item on the order screen
    And I verify menu1 item on the order screen
    And I should verify subtotal value as "$ 21.00"
    And I should verify tax value as "$ 0.90"
    And I should verify total value as "$ 21.90"
    And I should verify paid amount value as "$ 21.90"
    And I select seat one
    And I select menu1 item as "Onion Rings"
    And I should verify subtotal value as "$ 9.00"
    And I should verify tax value as "$ 0.90"
    And I should verify total value as "$ 9.90"
    And I select seat three
    And I select menu2 item as "Chicken Schnitzel"
    And I should verify subtotal value as "$ 12.00"
    And I should verify tax value as "$ 1.20"
    And I should verify total value as "$ 13.20"
    And I click table number on the order screen
    And I should verify subtotal value as "$ 42.00"
    And I should verify tax value as "$ 4.20"
    And I should verify total value as "$ 46.20"
    And I should verify paid amount value as "$ 21.90"
    And I click Payment button in the Order Management Screen
    And I verify the balance Due amount same as "$ 24.30"
    And I click cash button from the payment method popup
    And I click Submit button on the Payment Window
    And I click Table Layout tab
    And I click Check Stats tab
    And I click Closed tab on the Check stats
    And I click the Closed check on check stats
    And I click reopen check button on the check stats screen
    And I Should get back to the Order Screen
    And I verify that service type should not changeable
    And I should verify subtotal value as "$ 42.00"
    And I should verify tax value as "$ 4.20"
    And I should verify total value as "$ 46.20"
    And I should verify paid amount value as "$ 46.20"
    And I click Payment button in the Order Management Screen
    And I click Submit button on the Payment Window
    And I click Table Layout tab
    And I click power button

  @AskSe
  Scenario: Table layout and service type combination
    Given I'm logged in
    And I closed the order type window
    And I click All
    And I click Table Layout tab
    And I select random table on the table layout
    When I should verify the ask seat number on the table layout
    And I select the number of seats as "2"
    And I tap Continue to finish selecting the number of seats
    Then I Should get back to the Order Screen
    When I verify the seat count on the order screen
    And I verify that service type should changeable
    And I click service type button in order screen
    And I select service type as qsr
    And I should see service type as "QSR"
    And I click log off button in order screen

  @AskSe
  Scenario: Verify the active checks
    Given I'm logged in
    And I closed the order type window
    And I click All
    And I click Table Layout tab
    And I select random table on the table layout
    When I should verify the ask seat number on the table layout
    And I select the number of seats as "2"
    And I tap Continue to finish selecting the number of seats
    Then I Should get back to the Order Screen
    When I verify the seat count on the order screen
    And I get check number
    And I select category as "FOOD"
    And I select menu item as "Chicken Schnitzel"
    And I select menu item as "Onion Rings"
    And I click Finish Order button
    And I click Table Layout tab
    And I click Check Stats tab
    And I click the active check on check stats
    And I click open check button
    Then I Should get back to the Order Screen
    When I verify the seat count on the order screen
#      And I verify that service type should changeable
    And I click service type button in order screen
    And I select service type as qsr
    And I should see service type as "QSR"
    And I click Payment button in the Order Management Screen
    And I click cash button from the payment method popup
    And I click Submit button on the Payment Window
    And I closed the order type window
    And I click All
    And I click Closed tab on the Check stats
    And I click the Closed check on check stats
    And I verify the closed check service type as "QSR"
    And I click power button
  @AskSe
  Scenario: Verify the table layout seat count's popup
    Given I'm logged in
    And I closed the order type window
    And I click All
    And I click Table Layout tab
    And I select random table on the table layout
    When I should verify the ask seat number on the table layout
    And I tap Continue to finish selecting the number of seats
#    Then I should verify enter the number of seats popup
    And I click Done button on the Popup
    And I click linga close button
    And I click power button

  @AskSe
  Scenario: Verify the table layout have 0 seat count
    Given I'm logged in
    And I closed the order type window
    And I click All
    And I click Table Layout tab
    And I select random table on the table layout
    And I select the number of seats as "0"
    And I tap Continue to finish selecting the number of seats
#    Then I should see please enter valid number popup
#    And I click Done button on the Popup
    And I click linga close button
    And I click power button

  @AskSe
  Scenario: Verify the table layout have more numbers
    Given I'm logged in
    And I closed the order type window
    And I click All
    And I click Table Layout tab
    And I select random table on the table layout
    And I select the number of seats as "0"
    And I select the number of seats as "1"
    And I select the number of seats as "2"
    And I select the number of seats as "3"
    And I select the number of seats as "4"
    And I select the number of seats as "5"
    And I select the number of seats as "6"
    And I tap Continue to finish selecting the number of seats
    Then I should see please enter valid number popup
#    And I click Done button on the Popup
    And I click linga close button
    And I click power button

