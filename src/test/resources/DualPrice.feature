@CashRewardRegression
Feature: Instant Cash Reward Feature

  @CashReward1
  Scenario: verifying cash reward name changed into cash price
    Given I'm logged in
    And I closed the order type window
    And I get check number
    And I select category as "FOOD"
    And I select menu item as "SANDWICHES"
    And I should verify subtotal value as "$ 1.00"
    When I should verify tax value as "$ 0.00"
    When I should verify total2 value as "$ 1.00"
    And I click Void button on order management screen
    Then I should see All orders are voided
    And I click Done button on the Popup
    And I click log off button in order screen

  @CashReward1
  Scenario: verifying Change due is displaying for fast cash payment.
    Given I'm logged in
    And I closed the order type window
    And I get check number
    And I select category as "FOOD"
    And I select menu item as "SANDWICHES"
    And I should verify subtotal value as "$ 1.00"
    When I should verify tax value as "$ 0.00"
    When I should verify total2 value as "$ 1.00"
    And I verify the actual cash price with calculated cash price
    And I click Cash button for Complete Sale
    When I verify the cash price value with fast cash value
    And I click Exact button on the cash pop-up
    When I verify the fast cash value with total amount
    And I click Enter Button on the cash pop-up
    Then I should see the print or send receipt
    And I verify the fast cash price value with digital receipt screen
    And I click No thanks Button on the print receipt
    And I closed the order type window
    And I click log off button in order screen

  @CashReward123
  Scenario: verify currently showing If you pay by cash
    Given I'm logged in
    And I closed the order type window
    And I get check number
    And I select category as "FOOD"
    And I select menu item as "SANDWICHES"
    And I should verify subtotal value as "$ 1.00"
    When I should verify tax value as "$ 0.00"
    When I should verify total2 value as "$ 1.00"
#      And I should verify cash price value as "$ 0.99"
    And I verify the actual cash price with calculated cash price
    And I click Payment button in the Order Management Screen
    When I verify the total value with balance due value in the payment window
    And I click cash button from the payment method popup
#    Then I should see change Due popup
#    And I verify the Change due value with Cash Price value is Same
#    And I click Done button on the Popup
    And I verify the cash price value with paid amount value is same
    And I click Submit button on the Payment Window
    Then I should see the print or send receipt
    And I verify the cash price value with digital receipt screen
    And I click No thanks Button on the print receipt
    And I closed the order type window
    And I click log off button in order screen

#
#  Scenario: verify Pay with CC is able to view in print
#    Given I'm logged in
#    And I closed the order type window
#    And I get check number
#    And I select category as "FOOD"
#    And I select menu item as "SANDWICHES"
#    And I should verify subtotal value as "$ 1.00"
#    When I should verify tax value as "$ 0.00"
#    When I should verify total2 value as "$ 1.00"
##        And I should verify cash price value as "$ 0.99"
#    And I verify the actual cash price with calculated cash price
#    And I click Payment button in the Order Management Screen
#    When I verify the total value with balance due value in the payment window
#    And I click credit card payment on payment window
#    Then I should see tip screen
#    And I select the tip from the tip screen
#    And I click the Continue button on the Total screen
#    Then I should see the card details entry screen
#    When I verify subtotal,tax and total value with card details screen value
#    When I verify the tip value with card details screen value
#    When I verify the paid amount value is zero
#    And I get the pay amount value from the card details screen value
##        Then I verify card reader is not connected popup or not
#    And I verify the Calculation pay amount with the card details pay amount
#    And I click manual button on the your order screen
#    And I pass the card number as "4111111111111111"
#    And I pass card name as "Visa"
#    And I pass expire date as "1224"
#    And I click Process button on card screen
#    And I click Ok button in receipt printer popup
#    Then I should see the print or send receipt
#    And I verify the pay amount value with digital receipt screen
#    And I click No thanks Button on the print receipt
#    And I closed the order type window
#    And I click log off button in order screen

  @CashReward123
  Scenario: verify cash reward with Exclusive tax
    Given I'm logged in
    And I closed the order type window
    And I get check number
    And I select category as "FOOD"
    And I select menu item as "Onion Rings"
    And I should verify subtotal value as "$ 9.00"
    When I should verify tax value as "$ 0.90"
    When I should verify total2 value as "$ 9.90"
    And I verify the actual cash price with calculated cash price
    And I click Payment button in the Order Management Screen
    When I verify the total value with balance due value in the payment window
    And I click cash button from the payment method popup
#    Then I should see change Due popup
#    And I verify the Change due value with Cash Price value is Same
#    And I click Done button on the Popup
    And I verify the cash price value with paid amount value is same
    And I click Submit button on the Payment Window
    Then I should see the print or send receipt
    And I verify the cash price value with digital receipt screen
    And I click No thanks Button on the print receipt
    And I closed the order type window
    And I click log off button in order screen

  @CashReward123
  Scenario: verify cash reward with Inclusive tax
    Given I'm logged in
    And I closed the order type window
    And I get check number
    And I select category as "Pasta"
    And I select menu item as RavioliPesto for Item Based Inclusive Tax
    And I select modifier as "Butter"
    And I click Done to get back
    And I should verify subtotal value as "$ 15.00"
    When I should verify tax value as "$ 1.36"
    When I should verify total2 value as "$ 15.00"
    And I verify the actual cash price with calculated cash price with inclusive tax
    And I click Payment button in the Order Management Screen
    When I verify the total value with balance due value in the payment window
    And I click cash button from the payment method popup
#    Then I should see change Due popup
#    And I verify the Change due value with Cash Price value is Same
#    And I click Done button on the Popup
    And I verify the cash price value with paid amount value is same
    And I click Submit button on the Payment Window
    Then I should see the print or send receipt
    And I verify the cash price value with digital receipt screen
    And I click No thanks Button on the print receipt
    And I closed the order type window
    And I click log off button in order screen

  @CashReward12345
  Scenario: verify cash reward with Quantity based tax
    Given I'm logged in
    And I closed the order type window
    And I get check number
    And I select category as "Appetizers"
    And I select menu item as "RAPINI"
    Then I should see orderscreen with menu item prize as "$ 13.00"
    Then I should see the tax amount reflected to the check as "$ 0.65"
    Then I should see orderscreen with menu item Total without Discount or Tax as "$ 13.65"
    And I verify the actual cash price with calculated cash price
    And I change the Quantity of menu Item as "5"
    Then I should see orderscreen with menu item prize as "$ 65.00"
    Then I should see the tax amount reflected to the check as "$ 6.50"
    Then I should see orderscreen with menu item Total without Discount or Tax as "$ 71.50"
    And I verify the actual cash price with calculated cash price
    And I change the Quantity1 of menu Item as "8"
    Then I should see orderscreen with menu item prize as "$ 104.00"
    Then I should see the tax amount reflected to the check as "$ 15.60"
    Then I should see orderscreen with menu item Total without Discount or Tax as "$ 119.60"
    And I verify the actual cash price with calculated cash price
    And I click Payment button in the Order Management Screen
    When I verify the total value with balance due value in the payment window
    And I click cash button from the payment method popup
#    Then I should see change Due popup
#    And I verify the Change due value with Cash Price value is Same
#    And I click Done button on the Popup
    And I verify the cash price value with paid amount value is same
    And I click Submit button on the Payment Window
    Then I should see the print or send receipt
    And I verify the cash price value with digital receipt screen
    And I click No thanks Button on the print receipt
    And I closed the order type window
    And I click log off button in order screen

  @CashReward123456
  Scenario: verify cash reward with Tax exempt
    Given I'm logged in
    And I closed the order type window
    And I get check number
    And I select category as "FOOD"
    And I select menu item as "Onion Rings"
    And I click Options button
    Then I should see the Check Options screen
    And I click Tax Exempt Button
#    Then I should see tax exempt reasons
#    And I select School as reason
    And I should verify subtotal value as "$ 9.00"
    When I should verify tax exempt total value as "$ 9.00"
    And I verify the actual cash price with calculated cash price while tax exempt
    And I click Payment button in the Order Management Screen
    When I verify the total value with balance due value in the payment window
    And I click cash button from the payment method popup
#    Then I should see change Due popup
#    And I verify the Change due value with Cash Price value is Same
#    And I click Done button on the Popup
    And I verify the cash price value with paid amount value is same
    And I click Submit button on the Payment Window
    Then I should see the print or send receipt
    And I verify the cash price value with digital receipt screen
    And I click No thanks Button on the print receipt
    And I closed the order type window
    And I click log off button in order screen

  @CashReward123
  Scenario: verify cash reward with Gratuity
    Given I'm logged in
    And I closed the order type window
    And I get check number
    And I select category as "FOOD"
    And I select menu item as "Onion Rings"
    And I should verify subtotal value as "$ 9.00"
    And I should verify tax value as "$ 0.90"
    When I should verify total2 value as "$ 9.90"
    And I verify the actual cash price with calculated cash price
    And I click Options button
    Then I should see the Check Options screen
    And I click Gratuity button
    Then I should see Add Gratuity screen
    And I click Gratuity Fixed button
    And I should verify subtotal value as "$ 9.00"
    And I should verify tax value as "$ 0.90"
    And I should verify gratuity value as "$ 0.90"
    When I should verify total4 value as "$ 10.80"
    And I verify the actual cash price with calculated cash price while gratuity
    And I click Payment button in the Order Management Screen
    When I verify the total value with balance due value in the payment window
    And I click cash button from the payment method popup
#    Then I should see change Due popup
#    And I verify the Change due value with Cash Price value is Same
#    And I click Done button on the Popup
    And I verify the cash price value with paid amount value is same
    And I click Submit button on the Payment Window
    Then I should see the print or send receipt
    And I verify the cash price value with digital receipt screen
    And I click No thanks Button on the print receipt
    And I closed the order type window
    And I click log off button in order screen

  @CashReward12345
  Scenario: verify cash reward with Inclusive tax& Gratuity
    Given I'm logged in
    And I closed the order type window
    And I get check number
    And I select category as "Pasta"
    And I select menu item as RavioliPesto for Item Based Inclusive Tax
    And I select modifier as "Butter"
    And I click Done to get back
    And I should verify subtotal value as "$ 15.00"
    When I should verify tax value as "$ 1.36"
    When I should verify total2 value as "$ 15.00"
    And I verify the actual cash price with calculated cash price with inclusive tax
    And I click Options button
    Then I should see the Check Options screen
    And I click Gratuity button
    Then I should see Add Gratuity screen
    And I click Gratuity Fixed button
    And I should verify subtotal value as "$ 15.00"
    When I should verify tax value as "$ 1.36"
    And I should verify gratuity value as "$ 1.36"
    When I should verify total4 value as "$ 16.36"
    And I verify the actual cash price with calculated cash price while gratuity with inclusive tax
    And I click Payment button in the Order Management Screen
    When I verify the total value with balance due value in the payment window
    And I click cash button from the payment method popup
#    Then I should see change Due popup
#    And I verify the Change due value with Cash Price value is Same
#    And I click Done button on the Popup
    And I verify the cash price value with paid amount value is same
    And I click Submit button on the Payment Window
    Then I should see the print or send receipt
    And I verify the cash price value with digital receipt screen
    And I click No thanks Button on the print receipt
    And I closed the order type window
    And I click log off button in order screen

  @CashReward123
  Scenario: verify cash reward with Quantity based tax & Gratuity
    Given I'm logged in
    And I closed the order type window
    And I get check number
    And I select category as "Appetizers"
    And I select menu item as "RAPINI"
    And I click Options button
    Then I should see the Check Options screen
    And I click Gratuity button
    Then I should see Add Gratuity screen
    And I click Gratuity Fixed button
    Then I should see orderscreen with menu item prize as "$ 13.00"
    Then I should see the tax amount reflected to the check as "$ 0.65"
    And I should verify gratuity value as "$ 1.30"
    Then I should see orderscreen with menu item Total without Discount or Tax as "$ 14.95" while Gratuity
    And I verify the actual cash price with calculated cash price while gratuity
    And I change the Quantity of menu Item as "5"
    Then I should see orderscreen with menu item prize as "$ 65.00"
    Then I should see the tax amount reflected to the check as "$ 6.50"
    And I should verify gratuity value as "$ 6.50"
    Then I should see orderscreen with menu item Total without Discount or Tax as "$ 78.00" while Gratuity
    And I verify the actual cash price with calculated cash price while gratuity
    And I change the Quantity1 of menu Item as "8"
    Then I should see orderscreen with menu item prize as "$ 104.00"
    Then I should see the tax amount reflected to the check as "$ 15.60"
    And I should verify gratuity value as "$ 10.40"
    Then I should see orderscreen with menu item Total without Discount or Tax as "$ 130.00" while Gratuity
    And I verify the actual cash price with calculated cash price while gratuity
    And I click Payment button in the Order Management Screen
    When I verify the total value with balance due value in the payment window
    And I click cash button from the payment method popup
#    Then I should see change Due popup
#    And I verify the Change due value with Cash Price value is Same
#    And I click Done button on the Popup
    And I verify the cash price value with paid amount value is same
    And I click Submit button on the Payment Window
    Then I should see the print or send receipt
    And I verify the cash price value with digital receipt screen
    And I click No thanks Button on the print receipt
    And I closed the order type window
    And I click log off button in order screen

  @CashReward123
  Scenario: verify cash reward with Exclusive tax & service charge
    Given I'm logged in
    And I closed the order type window
    And I get check number
    And I select category as "TaXx"
    And I select menu item as "service charge menu"
    And I should verify subtotal value as "$ 2.95"
    When I should verify tax value as "$ 0.34"
    When I should verify service charge value as "$ 0.23"
    When I should verify total4 value as "$ 3.52"
#      When I should verify cash price value1 as "$ 3.09"
    And I verify the actual cash price with calculated cash price while service charge
    And I click Cash button for Complete Sale
    When I verify the cash price value with fast cash value
    And I click Exact button on the cash pop-up
    When I verify the fast cash value with total amount
    And I click Enter Button on the cash pop-up
    Then I should see the print or send receipt
    And I verify the cash price value with digital receipt screen
    And I click No thanks Button on the print receipt
    And I closed the order type window
    And I click log off button in order screen

  @CashReward123
  Scenario: verify cash reward with Inclusive tax& service charge
    Given I'm logged in
    And I closed the order type window
    And I get check number
    And I select category as "TaXx"
    And I select menu item as "service charge menu1"
    And I should verify subtotal value as "$ 3.48"
    When I should verify tax value as "$ 0.36"
    When I should verify service charge value as "$ 0.27"
    When I should verify total4 value as "$ 3.79"
    When I should verify Dual price value as "$ 3.33"
    And I click Cash button for Complete Sale
    When I verify the cash price value with fast cash value
    And I click Exact button on the cash pop-up
    When I verify the fast cash value with total amount
    And I click Enter Button on the cash pop-up
    Then I should see the print or send receipt
    And I verify the cash price value with digital receipt screen
    And I click No thanks Button on the print receipt
    And I closed the order type window
    And I click log off button in order screen

  @CashReward123
  Scenario: verify cash reward with Quantity based tax & service charge
    Given I'm logged in
    And I closed the order type window
    And I get check number
    And I select category as "TaXx"
    And I select menu item as "service menu item qty"
    And I should verify subtotal value as "$ 13.00"
    When I should verify tax value as "$ 0.81"
    When I should verify service charge value as "$ 1.00"
    When I should verify total4 value as "$ 14.81"
    When I should verify Dual price value as "$ 13.00"
    And I change the Quantity of menu Item as "5"
    And I should verify subtotal value as "$ 65.00"
    When I should verify tax value as "$ 7.30"
    When I should verify service charge value as "$ 4.98"
    When I should verify total4 value as "$ 77.28"
    When I should verify Dual price value as "$ 67.81"
    And I change the Quantity1 of menu Item as "8"
    And I should verify subtotal value as "$ 104.00"
    When I should verify tax value as "$ 16.87"
    When I should verify service charge value as "$ 7.96"
    When I should verify total4 value as "$ 128.83"
    When I should verify Dual price value as "$ 113.05"
    And I click Cash button for Complete Sale
    When I verify the cash price value with fast cash value
    And I click Exact button on the cash pop-up
    When I verify the fast cash value with total amount
    And I click Enter Button on the cash pop-up
    Then I should see the print or send receipt
    And I verify the cash price value with digital receipt screen
    And I click No thanks Button on the print receipt
    And I closed the order type window
    And I click log off button in order screen

  @CashReward123
  Scenario: verify cash reward with Exclusive tax ,Gratuity& service charge
    Given I'm logged in
    And I closed the order type window
    And I get check number
    And I select category as "TaXx"
    And I select menu item as "service charge menu"
    And I click Options button
    Then I should see the Check Options screen
    And I click Gratuity button
    Then I should see Add Gratuity screen
    And I click Gratuity varying button
    Then I should see enter Percentage popup
    And I pass the value as "8" and click Apply button
    And I should verify subtotal value as "$ 2.95"
    When I should verify tax value as "$ 0.34"
    And I should verify gratuity value as "$ 0.24"
    When I should verify service charge value1 as "$ 0.23"
    When I should verify total5 value as "$ 3.76"
    When I should verify Dual price value as "$ 3.33"
    And I click Cash button for Complete Sale
    When I verify the cash price value with fast cash value
    And I click Exact button on the cash pop-up
    When I verify the fast cash value with total amount
    And I click Enter Button on the cash pop-up
    Then I should see the print or send receipt
    And I verify the cash price value with digital receipt screen
    And I click No thanks Button on the print receipt
    And I closed the order type window
    And I click log off button in order screen

  @CashReward123
  Scenario: verify cash reward with Inclusive tax,Gratuity& service charge
    Given I'm logged in
    And I closed the order type window
    And I get check number
    And I select category as "TaXx"
    And I select menu item as "service charge menu1"
    And I click Options button
    Then I should see the Check Options screen
    And I click Gratuity button
    Then I should see Add Gratuity screen
    And I click Gratuity varying button
    Then I should see enter Percentage popup
    And I pass the value as "8" and click Apply button
    And I should verify subtotal value as "$ 3.48"
    When I should verify tax value as "$ 0.36"
    And I should verify gratuity value as "$ 0.25"
    When I should verify service charge value1 as "$ 0.27"
    When I should verify total5 value as "$ 4.04"
    When I should verify Dual price value as "$ 3.58"
    And I click Cash button for Complete Sale
    When I verify the cash price value with fast cash value
    And I click Exact button on the cash pop-up
    When I verify the fast cash value with total amount
    And I click Enter Button on the cash pop-up
    Then I should see the print or send receipt
    And I verify the fast cash price value with digital receipt screen
    And I click No thanks Button on the print receipt
    And I closed the order type window
    And I click log off button in order screen

  @CashReward123
  Scenario: verify cash reward with Quantity based tax ,Gratuity& service charge
    Given I'm logged in
    And I closed the order type window
    And I get check number
    And I select category as "TaXx"
    And I select menu item as "service menu item qty"
    And I click Options button
    Then I should see the Check Options screen
    And I click Gratuity button
    Then I should see Add Gratuity screen
    And I click Gratuity varying button
    Then I should see enter Percentage popup
    And I pass the value as "8" and click Apply button
    And I should verify subtotal value as "$ 13.00"
    When I should verify tax value as "$ 0.81"
    And I should verify gratuity value as "$ 1.04"
    When I should verify service charge value1 as "$ 1.00"
    When I should verify total5 value as "$ 15.85"
    When I should verify Dual price value as "$ 14.04"
    And I change the Quantity of menu Item as "5"
    And I should verify subtotal value as "$ 65.00"
    When I should verify tax value as "$ 7.30"
    And I should verify gratuity value as "$ 5.20"
    When I should verify service charge value1 as "$ 4.98"
    When I should verify total5 value as "$ 82.48"
    When I should verify Dual price value as "$ 73.01"
    And I change the Quantity1 of menu Item as "8"
    And I should verify subtotal value as "$ 104.00"
    When I should verify tax value as "$ 16.87"
    And I should verify gratuity value as "$ 8.32"
    When I should verify service charge value1 as "$ 7.96"
    When I should verify total5 value as "$ 137.15"
    When I should verify Dual price value as "$ 121.37"
    And I click Cash button for Complete Sale
    When I verify the cash price value with fast cash value
    And I click Exact button on the cash pop-up
    When I verify the fast cash value with total amount
    And I click Enter Button on the cash pop-up
    Then I should see the print or send receipt
    And I verify the fast cash price value with digital receipt screen
    And I click No thanks Button on the print receipt
    And I closed the order type window
    And I click log off button in order screen

  @CashReward123
  Scenario: verify cash reward with Item based Discount
    Given I'm logged in
    And I closed the order type window
    And I get check number
    And I select category as "FOOD"
    And I select menu item as "Chicken Schnitzel"
    And I select Discount on the Order screen
    Then I should see Check Based Discount Screen
    And I click Discount as "item based before"
    And I click Back button on Discount Screen
    And I should verify subtotal value as "$ 12.00"
    When I should verify tax value as "$ 0.00"
    And I should verify discount value as "$ 0.32"
    When I should verify total4 value as "$ 11.68"
    When I should verify Dual price value as "$ 10.25"
    And I click Cash button for Complete Sale
    When I verify the cash price value with fast cash value
    And I click Exact button on the cash pop-up
    When I verify the fast cash value with total amount
    And I click Enter Button on the cash pop-up
    Then I should see the print or send receipt
    And I verify the fast cash price value with digital receipt screen
    And I click No thanks Button on the print receipt
    And I closed the order type window
    And I click log off button in order screen

  @CashReward123
  Scenario: verify cash reward with check based Discount
    Given I'm logged in
    And I closed the order type window
    And I get check number
    And I select category as "FOOD"
    And I select menu item as "Chicken Schnitzel"
    And I select Discount on the Order screen
    Then I should see Check Based Discount Screen
    And I click Discount as "check based before"
    And I click Back button on Discount Screen
    And I should verify subtotal value as "$ 12.00"
    When I should verify tax value as "$ 0.00"
    And I should verify discount value as "$ 1.37"
    When I should verify total4 value as "$ 10.63"
    When I should verify Dual price value as "$ 9.33"
    And I click Cash button for Complete Sale
    When I verify the cash price value with fast cash value
    And I click Exact button on the cash pop-up
    When I verify the fast cash value with total amount
    And I click Enter Button on the cash pop-up
    Then I should see the print or send receipt
    And I verify the fast cash price value with digital receipt screen
    And I click No thanks Button on the print receipt
    And I closed the order type window
    And I click log off button in order screen

  @CashReward123
  Scenario: verify cash reward with open item Discount
    Given I'm logged in
    And I closed the order type window
    And I get check number
    And I select category as "FOOD"
    And I select menu item as "Chicken Schnitzel"
    And I click menu item as "Chicken Schnitzel" to see Menu option screen
    And I click Open Discount on menu option
    Then I should see Open discount Screen
    And I pass the amount on open discount for open item discount as discount Percentage1 for "After"
    Then I should see discount applied on order screen
    And I should verify subtotal value as "$ 12.00"
    When I should verify tax value as "$ 0.00"
    And I should verify discount value as "$ 2.68"
    When I should verify total4 value as "$ 9.32"
    When I should verify Dual price value as "$ 8.18"
    And I click Cash button for Complete Sale
    When I verify the cash price value with fast cash value
    And I click Exact button on the cash pop-up
    When I verify the fast cash value with total amount
    And I click Enter Button on the cash pop-up
    Then I should see the print or send receipt
    And I verify the fast cash price value with digital receipt screen
    And I click No thanks Button on the print receipt
    And I closed the order type window
    And I click log off button in order screen

#  Scenario: verify cash reward with open check Discount
#    Given I'm logged in
#    And I closed the order type window
#    And I get check number
#    And I select category as "FOOD"
#    And I select menu item as "Chicken Schnitzel"
#    And I click Options button
#    And I click discount on check option screen
#    And I select open check discount
#    Then I should see Open discount Screen
#    And I pass the amount as "264" on open discount as "After"
#    And I should verify subtotal value as "$ 12.00"
#    When I should verify tax value as "$ 1.20"
#    And I should verify discount value as "$ 2.64"
#    When I should verify total4 value as "$ 10.56"
#    And I should verify cash price value1 as "$ 9.27"
#    And I click Cash button for Complete Sale
#    When I verify the cash price value with fast cash value
#    And I click Exact button on the cash pop-up
#    When I verify the fast cash value with total amount
#    And I click Enter Button on the cash pop-up
#    Then I should see the print or send receipt
#    And I verify the fast cash price value with digital receipt screen1
#    And I click No thanks Button on the print receipt
#    And I closed the order type window
#    And I click log off button in order screen

  @CashReward123
  Scenario: verify cash reward with Item based Discount & Inclusive Tax
    Given I'm logged in
    And I closed the order type window
    And I get check number
    And I select category as "Pasta"
    And I select menu item as "Ravioli Pesto"
    And I select modifier as "Butter"
    And I click Done to get back
    And I select Discount on the Order screen
    Then I should see Check Based Discount Screen
    And I click Discount as "IB-AfterTax-Percentage"
    And I click Back button on Discount Screen
    And I should verify subtotal value as "$ 15.00"
    When I should verify tax value as "$ 1.36"
    And I should verify discount value as "$ 1.36"
    When I should verify total4 value as "$ 13.64"
    When I should verify Dual price value as "$ 11.97"
    And I click Cash button for Complete Sale
    When I verify the cash price value with fast cash value
    And I click Exact button on the cash pop-up
    When I verify the fast cash value with total amount
    And I click Enter Button on the cash pop-up
    Then I should see the print or send receipt
    And I verify the fast cash price value with digital receipt screen
    And I click No thanks Button on the print receipt
    And I closed the order type window
    And I click log off button in order screen

  @CashReward123
  Scenario: verify cash reward with check based Discount & Inclusive Tax
    Given I'm logged in
    And I closed the order type window
    And I get check number
    And I select category as "Pasta"
    And I select menu item as "Ravioli Pesto"
    And I select modifier as "Butter"
    And I click Done to get back
    And I select Discount on the Order screen
    Then I should see Check Based Discount Screen
    And I click Discount as "check based before"
    And I click Back button on Discount Screen
    And I should verify subtotal value as "$ 15.00"
    When I should verify tax value as "$ 1.24"
    And I should verify discount value as "$ 1.37"
    When I should verify total4 value as "$ 13.63"
    When I should verify Dual price value as "$ 11.96"
    And I click Cash button for Complete Sale
    When I verify the cash price value with fast cash value
    And I click Exact button on the cash pop-up
    When I verify the fast cash value with total amount
    And I click Enter Button on the cash pop-up
    Then I should see the print or send receipt
    And I verify the fast cash price value with digital receipt screen
    And I click No thanks Button on the print receipt
    And I closed the order type window
    And I click log off button in order screen

  @CashReward123
  Scenario: verify cash reward with open item Discount & Inclusive Tax
    Given I'm logged in
    And I closed the order type window
    And I get check number
    And I select category as "Pasta"
    And I select menu item as "Ravioli Pesto"
    And I select modifier as "Butter"
    And I click Done to get back
    And I click menu item as "Ravioli Pesto" to see Menu option screen
    And I click Open Discount on menu option
    Then I should see Open discount Screen
    And I pass the amount on open discount for open item discount as discount Percentage1 for "After"
    Then I should see discount applied on order screen
    And I should verify subtotal value as "$ 15.00"
    When I should verify tax value as "$ 1.36"
    And I should verify discount value as "$ 3.04"
    When I should verify total4 value as "$ 11.96"
    When I should verify Dual price value as "$ 10.49"
    And I click Cash button for Complete Sale
    When I verify the cash price value with fast cash value
    And I click Exact button on the cash pop-up
    When I verify the fast cash value with total amount
    And I click Enter Button on the cash pop-up
    Then I should see the print or send receipt
    And I verify the fast cash price value with digital receipt screen
    And I click No thanks Button on the print receipt
    And I closed the order type window
    And I click log off button in order screen

#
#  Scenario: verify cash reward with open check Discount & Inclusive Tax
#    Given I'm logged in
#    And I closed the order type window
#    And I get check number
#    And I select category as "Pasta"
#    And I select menu item as "Ravioli Pesto"
#    And I select modifier as "Butter"
#    And I click Done to get back
#    And I click Options button
#    And I click discount on check option screen
#    And I select open check discount
#    Then I should see Open discount Screen
#    And I pass the amount as "264" on open discount as "After"
#    And I should verify subtotal value as "$ 15.00"
#    When I should verify tax value as "$ 1.36"
#    And I should verify discount value as "$ 2.64"
#    When I should verify total4 value as "$ 12.36"
#    And I should verify cash price value1 as "$ 10.85"
#    And I click Cash button for Complete Sale
#    When I verify the cash price value with fast cash value
#    And I click Exact button on the cash pop-up
#    When I verify the fast cash value with total amount
#    And I click Enter Button on the cash pop-up
#    Then I should see the print or send receipt
#    And I verify the fast cash price value with digital receipt screen1
#    And I click No thanks Button on the print receipt
#    And I closed the order type window
#    And I click log off button in order screen

  @CashReward123
  Scenario: verify cash reward with Item based Discount & Quantity based Tax
    Given I'm logged in
    And I closed the order type window
    And I get check number
    And I select category as "Appetizers"
    And I select menu item as "RAPINI"
    And I select Discount on the Order screen
    Then I should see Check Based Discount Screen
    And I click Discount as "IB-AfterTax-Percentage"
    And I click Back button on Discount Screen
    And I should verify subtotal value as "$ 13.00"
    When I should verify tax value as "$ 0.65"
    And I should verify discount value as "$ 1.30"
    When I should verify total4 value as "$ 12.35"
    When I should verify Dual price value as "$ 10.84"
    And I change the Quantity of menu Item as "5"
    And I should verify subtotal value as "$ 65.00"
    When I should verify tax value as "$ 6.50"
    And I should verify discount value as "$ 6.50"
    When I should verify total4 value as "$ 65.00"
    When I should verify Dual price value as "$ 57.04"
    And I change the Quantity1 of menu Item as "8"
    And I should verify subtotal value as "$ 104.00"
    When I should verify tax value as "$ 15.60"
    And I should verify discount value as "$ 10.40"
    When I should verify total4 value as "$ 109.20"
    When I should verify Dual price value as "$ 95.82"
    And I click Cash button for Complete Sale
    When I verify the cash price value with fast cash value
    And I click Exact button on the cash pop-up
    When I verify the fast cash value with total amount
    And I click Enter Button on the cash pop-up
    Then I should see the print or send receipt
    And I verify the fast cash price value with digital receipt screen
    And I click No thanks Button on the print receipt
    And I closed the order type window
    And I click log off button in order screen

  @CashReward123
  Scenario: verify cash reward with check based Discount & Quantity based Tax
    Given I'm logged in
    And I closed the order type window
    And I get check number
    And I select category as "Appetizers"
    And I select menu item as "RAPINI"
    And I select Discount on the Order screen
    Then I should see Check Based Discount Screen
    And I click Discount as "CB-AfterTax-SetPrice"
    And I click Back button on Discount Screen
    And I should verify subtotal value as "$ 13.00"
    When I should verify tax value as "$ 0.65"
    And I should verify discount value as "$ 12.61"
    When I should verify total4 value as "$ 1.04"
    When I should verify Dual price value as "$ 0.91"
    And I change the Quantity of menu Item as "5"
    And I should verify subtotal value as "$ 65.00"
    When I should verify tax value as "$ 6.50"
    And I should verify discount value as "$ 64.61"
    When I should verify total4 value as "$ 6.89"
    When I should verify Dual price value as "$ 6.05"
    And I change the Quantity1 of menu Item as "8"
    And I should verify subtotal value as "$ 104.00"
    When I should verify tax value as "$ 15.60"
    And I should verify discount value as "$ 103.61"
    When I should verify total4 value as "$ 15.99"
    When I should verify Dual price value as "$ 14.03"
    And I click Cash button for Complete Sale
    When I verify the cash price value with fast cash value
    And I click Exact button on the cash pop-up
    When I verify the fast cash value with total amount
    And I click Enter Button on the cash pop-up
    Then I should see the print or send receipt
    And I verify the fast cash price value with digital receipt screen
    And I click No thanks Button on the print receipt
    And I closed the order type window
    And I click log off button in order screen

  @CashReward123
  Scenario: verify cash reward with open item Discount & Quantity based Tax
    Given I'm logged in
    And I closed the order type window
    And I get check number
    And I select category as "Appetizers"
    And I select menu item as "RAPINI"
    And I change the Quantity of menu Item as "8"
    And I click menu item as "RAPINI" to see Menu option screen
    And I click Open Discount on menu option
    Then I should see Open discount Screen
    And I pass the amount on open discount for open item discount as discount Percentage1 for "After"
    Then I should see discount applied on order screen
    And I should verify subtotal value as "$ 104.00"
    When I should verify tax value as "$ 15.60"
    And I should verify discount value as "$ 23.21"
    When I should verify total4 value as "$ 96.39"
    When I should verify Dual price value as "$ 84.58"
    And I click Cash button for Complete Sale
    When I verify the cash price value with fast cash value
    And I click Exact button on the cash pop-up
    When I verify the fast cash value with total amount
    And I click Enter Button on the cash pop-up
    Then I should see the print or send receipt
    And I verify the fast cash price value with digital receipt screen
    And I click No thanks Button on the print receipt
    And I closed the order type window
    And I click log off button in order screen


#  Scenario: verify cash reward with open check Discount & Quantity based Tax
#    Given I'm logged in
#    And I closed the order type window
#    And I get check number
#    And I select category as "Appetizers"
#    And I select menu item as "RAPINI"
#    And I change the Quantity of menu Item as "8"
#    And I click Options button
#    And I click discount on check option screen
#    And I select open check discount
#    Then I should see Open discount Screen
#    And I pass the amount as "264" on open discount as "After"
#    And I should verify subtotal value as "$ 104.00"
#    When I should verify tax value as "$ 15.60"
#    And I should verify discount value as "$ 2.64"
#    When I should verify total4 value as "$ 116.96"
#    And I should verify cash price value1 as "$ 102.63"
#    And I click Cash button for Complete Sale
#    When I verify the cash price value with fast cash value
#    And I click Exact button on the cash pop-up
#    When I verify the fast cash value with total amount
#    And I click Enter Button on the cash pop-up
#    Then I should see the print or send receipt
#    And I verify the fast cash price value with digital receipt screen1
#    And I click No thanks Button on the print receipt
#    And I closed the order type window
#    And I click log off button in order screen


  @CashReward123
  Scenario: verify cash reward with Item based Discount, tax, service charge & Gratuity
    Given I'm logged in
    And I closed the order type window
    And I get check number
    And I select category as "TaXx"
    And I select menu item as "service charge menu"
    And I select Discount on the Order screen
    Then I should see Check Based Discount Screen
    And I click Discount as "IB-AfterTax-Percentage"
    And I click Back button on Discount Screen
    And I click Options button
    Then I should see the Check Options screen
    And I click Gratuity button
    Then I should see Add Gratuity screen
    And I click Gratuity varying button
    Then I should see enter Percentage popup
    And I pass the value as "8" and click Apply button
    And I should verify subtotal value as "$ 2.95"
    When I should verify tax value as "$ 0.33"
    And I should verify discount value as "$ 0.30"
    And I should verify gratuity value1 as "$ 0.21"
    When I should verify service charge value2 as "$ 0.20"
    When I should verify total6 value as "$ 3.39"
    When I should verify Dual price value as "$ 3.00"
    And I click Cash button for Complete Sale
    When I verify the cash price value with fast cash value
    And I click Exact button on the cash pop-up
    When I verify the fast cash value with total amount
    And I click Enter Button on the cash pop-up
    Then I should see the print or send receipt
    And I verify the fast cash price value with digital receipt screen
    And I click No thanks Button on the print receipt
    And I closed the order type window
    And I click log off button in order screen

  @CashReward123
  Scenario: verify cash reward with check based Discount , tax , service charge & Gratuity
    Given I'm logged in
    And I closed the order type window
    And I get check number
    And I select category as "TaXx"
    And I select menu item as "service charge menu1"
    And I select Discount on the Order screen
    Then I should see Check Based Discount Screen
    And I click Discount as "CB-AfterTax-SetPrice"
    And I click Back button on Discount Screen
    And I click Options button
    Then I should see the Check Options screen
    And I click Gratuity button
    Then I should see Add Gratuity screen
    And I click Gratuity varying button
    Then I should see enter Percentage popup
    And I pass the value as "8" and click Apply button
    And I should verify subtotal value as "$ 3.48"
    When I should verify tax value as "$ 0.32"
    And I should verify discount value as "$ 3.09"
    And I should verify gratuity value1 as "$ 0.01"
    When I should verify service charge value2 as "$ 0.03"
    When I should verify total6 value as "$ 0.43"
    When I should verify Dual price value as "$ 0.38"
    And I click Cash button for Complete Sale
    When I verify the cash price value with fast cash value
    And I click Exact button on the cash pop-up
    When I verify the fast cash value with total amount
    And I click Enter Button on the cash pop-up
    Then I should see the print or send receipt
    And I verify the fast cash price value with digital receipt screen
    And I click No thanks Button on the print receipt
    And I closed the order type window
    And I click log off button in order screen

  @CashReward123
  Scenario: verify cash reward with open item Discount , tax , service charge & Gratuity
    Given I'm logged in
    And I closed the order type window
    And I get check number
    And I select category as "TaXx"
    And I select menu item as "service charge menu"
    And I click menu item as "service charge menu" to see Menu option screen
    And I click Open Discount on menu option
    Then I should see Open discount Screen
    And I pass the amount on open discount for open item discount as discount Percentage1 for "After"
    Then I should see discount applied on order screen
    And I click Options button
    Then I should see the Check Options screen
    And I click Gratuity button
    Then I should see Add Gratuity screen
    And I click Gratuity varying button
    Then I should see enter Percentage popup
    And I pass the value as "8" and click Apply button
    And I should verify subtotal value as "$ 2.95"
    When I should verify tax value as "$ 0.33"
    And I should verify discount value as "$ 0.66"
    And I should verify gratuity value1 as "$ 0.18"
    When I should verify service charge value2 as "$ 0.18"
    When I should verify total6 value as "$ 2.98"
    When I should verify Dual price value as "$ 2.64"
    And I click Cash button for Complete Sale
    When I verify the cash price value with fast cash value
    And I click Exact button on the cash pop-up
    When I verify the fast cash value with total amount
    And I click Enter Button on the cash pop-up
    Then I should see the print or send receipt
    And I verify the fast cash price value with digital receipt screen
    And I click No thanks Button on the print receipt
    And I closed the order type window
    And I click log off button in order screen

  @CashReward12345
  Scenario: LIN-22521 - In reopen check, dual price displaying wrongly in the following scenario
    Given I'm logged in
    And I closed the order type window
    And I click All
    And I click Table Layout tab
    And I click new check button on the Table layout screen
    And I select table as "T24"
    And I select the number of seats as "2"
    And I tap Continue to finish selecting the number of seats
    And I get check number
    And I select category as "FOOD"
    And I select menu item as "SANDWICHES"
    And I select seat two
    And I select category as "FOOD"
    And I select menu item as "SANDWICHES"
    And I click Payment button in the Order Management Screen
    And I click cash button from the payment method popup
    And I click Exit to return to Order Management Screen
    And I click table number on the Order Screen as "T24"
    And I click Payment button in the Order Management Screen
    And I click cash button from the payment method popup
    And I click Submit button on the Payment Window
    Then I should see the print or send receipt
#    And I verify the fast cash price value with digital receipt screen1
    And I click No thanks Button on the print receipt
    And I click Table Layout tab
    And I click Check Stats tab
    And I click Closed tab on the Check stats
    And I click the Closed check on check stats
    And I click reopen check button on the check stats screen
    Then I Should get back to the Order Screen
    And I click Payment button in the Order Management Screen
    And I click payment in the payment window one
    And I click Delete button on the payment window
#    Then I should see Receipt Printer popup
#    And I click Ok button in receipt printer popup
    And I click payment in the payment window two
    And I click Delete button on the payment window
#    Then I should see Receipt Printer popup
#    And I click Ok button in receipt printer popup
    And I click Exit to return to Order Management Screen
    And I click Void button on order management screen
    Then I should see the void reason popup
    And I click void Reason on the void popup
    And I click Add Button on the void reason popup
#    Then I should see Receipt Printer popup
#    And I click Done button on the Popup
#    And I click QSR tab
    And I click power button in the All Orders screen

  @CashReward123456
  Scenario: LIN-22442- Dual pricing issue in amount differs in before and after the payments
    Given I'm logged in
    And I closed the order type window
    And I get check number
    And I select category as "FOOD"
    And I select menu item as "Onion Rings"
    When I should verify subtotal value as "$ 9.00"
    When I should verify tax value as "$ 0.90"
    When I should verify total value as "$ 9.90"
    When I should verify paid amount1 as "$ 0.00"
    When I should verify Dual price value as "$ 8.69"
    And I click Order button in the order management screen
    And I click Payment button in the Order Management Screen
    When I verify the total value with balance due value in the payment window
    And I get the balance Due Amount on the payment window
    And I click side cc button in the payment window
    When I verify balance due amount same with amount in total screen
    And I click the Continue button on the Total screen
#    Then I verify the paid amount on the payment screen
    And I click Exit to return to Order Management Screen
    When I should verify subtotal value as "$ 9.00"
    When I should verify tax value as "$ 0.90"
    When I should verify total value as "$ 9.90"
    When I should verify paid amount1 as "$ 9.90"
    When I should verify Dual price value as "$ 8.69"
    And I click Payment button in the Order Management Screen
    And I click Submit button on the Payment Window
    Then I should see the print or send receipt
#    And I verify the fast cash price value with digital receipt screen1
#    And I verify the side cc value with digital receipt screen value
    And I click No thanks Button on the print receipt
    And I closed the order type window
    And I click log off button in order screen


  @CashReward123456
  Scenario: LIN-22532 - For delivery sale, it is displaying Change due when Dual Price is present.
    Given I'm logged in
    And I select the DELIVERY order types
    And I click done button in the order type window
    Then I should see the add customer screen in the window
    And I Click on the Byname Option
    And Enter some name and click on Add Customer button
    Then I should see the customer profile window
    And I select search
    And I enter an existing customer's name "Auto ragav"
    And I select the customer
    When I click the Save button
    Then I Should get back to the Order Screen
    And I get check number
    And I select category as "FOOD"
    And I select menu item as "Onion Rings"
    And I click Payment button in the Order Management Screen
    And I click cash button from the payment method popup
#    Then I should not see change Due popup
    And I click Exit to return to Order Management Screen
    And I click Finish Order button
    And I click phone order tab
    And I click the Closed check in new tab window
    And I click active driver as "Auto D"
    Then I should see driver is offline popup
    And I click Yes button on driver is offline popup
    Then I should see driver as "Auto D" is added
    And I click active driver as "Auto D"
    And I click departure button
    And I click out tab in phone order screen
    And I click the Closed check in out tab
    And I click Arrival button in phone order screen
    Then I should not see change Due popup
#    Then I should see the Phone Order tab
    And I click power button in the All Orders screen

  @CashReward123456
  Scenario: LIN-22518 - In phone order out tab fast cash screen amount displaying wrongly
    Given I'm logged in
    And I select the DELIVERY order types
    And I click done button in the order type window
    Then I should see the add customer screen in the window
    And I Click on the Byname Option
    And Enter some name and click on Add Customer button
    Then I should see the customer profile window
    And I select search
    And I enter an existing customer's name "Auto ragav"
    And I select the customer
    When I click the Save button
    Then I Should get back to the Order Screen
    And I get check number
    And I select category as "FOOD"
    And I select menu item as "Onion Rings"
    When I should verify subtotal value as "$ 9.00"
    When I should verify tax value as "$ 0.90"
    When I should verify total value as "$ 9.90"
    When I should verify paid amount1 as "$ 0.00"
    When I should verify Dual price value as "$ 18.69"
    And I click Finish Order button
    And I click phone order tab
    And I click the Closed check in new tab window
    And I click active driver as "Auto D"
    Then I should see driver is offline popup
    And I click Yes button on driver is offline popup
    Then I should see driver as "Auto D" is added
    And I click active driver as "Auto D"
    And I click departure button
    And I click out tab in phone order screen
    And I click the Closed check in out tab
    And I click Arrival button in phone order screen
#     Then I should verify the fast cash value on the phone order tab
    And I click Exact button on the cash pop-up
    And I click Enter Button on the cash pop-up
    Then I should not see change Due popup
    Then I should see the Phone Order tab
    And I click power button

  @CashReward12345
  Scenario: LIN-22513 - In POS , change due is displaying if apply gratuity
    Given I'm logged in
    And I closed the order type window
    And I get check number
    And I select category as "FOOD"
    And I select menu item as "Onion Rings"
    When I should verify subtotal value as "$ 9.00"
    When I should verify tax value as "$ 0.90"
    When I should verify total value as "$ 9.90"
    When I should verify paid amount1 as "$ 0.00"
    When I should verify Dual price value as "$ 8.69"
    And I click Payment button in the Order Management Screen
    And I click cash button from the payment method popup
    Then I should not see change Due popup
    And I click Submit button on the Payment Window
    Then I should see the print or send receipt
    And I verify the fast cash price value with digital receipt screen
    And I click No thanks Button on the print receipt
    And I closed the order type window
    And I click log off button in order screen

  @CashReward123456
  Scenario: LIN-22822 - While adding the void item Balance due displaying with below scenario
    Given I'm logged in
    And I closed the order type window
    And I get check number
    And I select category as "FOOD"
    And I select menu item as "Chicken Schnitzel"
    When I should verify subtotal value as "$ 12.00"
    When I should verify tax value as "$ 0.00"
    When I should verify total value as "$ 12.00"
    When I should verify paid amount1 as "$ 0.00"
    When I should verify Dual price value as "$ 10.53"
    And I click Order button in the order management screen
    And I click menu item as "Chicken Schnitzel" to see Menu option screen
    And I click void item on Menu option
    Then I should see the void reason popup
    And I click void Reason on the void popup
    And I click Add Button on the void reason popup
#    Then I should see Receipt Printer popup
#    And I click Done button on the Popup
#    When I should see X symbol on the order screen
    And I select menu item as "Chicken Schnitzel"
    When I should verify subtotal value as "$ 12.00"
    When I should verify tax value as "$ 0.00"
    When I should verify total value as "$ 12.00"
    When I should verify paid amount1 as "$ 0.00"
    When I should verify Dual price value as "$ 10.53"
    And I click Payment button in the Order Management Screen
#    And I verify the cash price value with cash price value in the payment window
    And I verify the total value with balance due value in the payment window
    And I click cash button from the payment method popup
#    And I verify the paid amount with cash price on the payment screen
#    And I verify the balance due amount value as "$ 0.00"
    And I click Submit button on the Payment Window
    Then I should see the print or send receipt
    And I verify the fast cash price value with digital receipt screen
    And I click No thanks Button on the print receipt
    And I closed the order type window
    And I click All
    And I click Check Stats tab
    And I click Closed tab on the Check stats
    And I click the Closed check on check stats
    And I click reopen check button on the check stats screen
    And I Should get back to the Order Screen
    When I should verify subtotal value as "$ 12.00"
    When I should verify tax value as "$ 0.00"
    When I should verify total value as "$ 12.00"
    When I should verify paid amount1 as "$ 10.53"
    When I should verify Dual price value as "$ 10.53"
    And I select category as "FOOD"
    And I select menu item as "Chicken Schnitzel"
    When I should verify subtotal value as "$ 24.00"
    When I should verify tax value as "$ 2.40"
    When I should verify total value as "$ 26.40"
    When I should verify paid amount1 as "$ 10.53"
    When I should verify cash price value as "$ 23.17"
    And I click Payment button in the Order Management Screen
#    And I verify the balance due amount value as "$ 13.20"
#    And I verify cash price value as "$ 11.58" in the payment screen
    And I click cash button from the payment method popup
#    And I verify the paid amount with cash price on the payment screen
#    And I verify the balance due amount value as "$ 0.00"
    And I click Submit button on the Payment Window
    Then I should see the print or send receipt
    And I click No thanks Button on the print receipt
    And I closed the order type window
    And I click log off button in order screen


  @Dual89
#  Scenario: LIN-22511 - When doing partial payment, Cash Price amount is getting changed
#    Given I'm logged in
#    And I closed the order type window
#    And I get check number
#    And I select category as "FOOD"
#    And I select menu item as "Chicken Schnitzel"
#    When I should verify subtotal value as "$ 12.00"
#    When I should verify tax value as "$ 1.20"
#    When I should verify total value as "$ 13.20"
#    When I should verify paid amount1 as "$ 0.00"
#    When I should verify cash price value as "$ 11.58"
#    And I click Payment button in the Order Management Screen
#    And I enter the partial amount "500" in payment window
#    And I click credit card payment on payment window
#    Then I should see tip screen
##      And I select the tip from the tip screen
#    And I click the Continue button on the Total screen
#    Then I should see the card details entry screen
#    When I verify subtotal,tax and total value with card details screen value
#    And I click manual button on the your order screen
#    And I pass the card number as "4111111111111111"
#    And I pass card name as "Visa"
#    And I pass expire date as "1224"
#    And I click Process button on card screen
#    And I click Ok button in receipt printer popup
#    Then I click Exit to return to Order Management Screen
#    When I should verify paid amount1 as "$ 5.00"
#    And I click Payment button in the Order Management Screen
#    And I enter the partial amount "500" in payment window1
#    And I click credit card payment on payment window
#    Then I should see tip screen
##      And I select the tip from the tip screen
#    And I click the Continue button on the Total screen
#    Then I should see the card details entry screen
#    When I verify subtotal,tax and total value with card details screen value
#
#    And I click manual button on the your order screen
#    And I pass the card number as "4111111111111111"
#    And I pass card name as "Visa"
#    And I pass expire date as "1224"
#    And I click Process button on card screen
#    And I click Ok button in receipt printer popup
#    Then I click Exit to return to Order Management Screen
#    When I should verify paid amount1 as "$ 10.00"
#    And I click Payment button in the Order Management Screen
#    And I get the cash price value on the payment window
#    And I click cash button from the payment method popup
#
#    And I click Submit button on the Payment Window
#    Then I should see the print or send receipt
#    When I should verify the paid all partial payment with digital Receipt Screen value
#    And I click No thanks Button on the print receipt
#    And I closed the order type window
#    And I click log off button in order screen

  @CashReward123456
  Scenario:LIN-22517-If delete the payment then change due is not displaying
    Given I'm logged in
    And I closed the order type window
    And I get check number
    And I select category as "FOOD"
    And I select menu item as "Chicken Schnitzel"
    When I should verify subtotal value as "$ 12.00"
    When I should verify tax value as "$ 0.00"
    When I should verify total value as "$ 12.00"
    When I should verify paid amount1 as "$ 0.00"
    When I should verify Dual price value as "$ 10.53"
    And I click Payment button in the Order Management Screen
#    And I enter the partial amount "500" in payment window
    And I click cash button from the payment method popup
#    And I enter the partial amount "500" in payment window
#    And I click cash button from the payment method popup
    And I click payment in the payment window
    And I click Delete button on the payment window
#    And I click Ok button in receipt printer popup
#    And I enter the partial amount "1000" in payment window
    And I click cash button from the payment method popup
#    Then I should see change Due popup
#    And I verify the Change due value in the popup is same with value as "$ 2.80"
#    And I click Done button on the Popup
#  And I verify balance due value as "$ 5.25"
    And I click Submit button on the Payment Window
    Then I should see the print or send receipt
#    When I should verify the paid all partial payment with digital Receipt Screen value
    And I click No thanks Button on the print receipt
    And I closed the order type window
    And I click log off button in order screen

    Scenario: Partial payment application displays Menu item sent to kitchen even already items are ordered
      Given I'm logged in
      And I closed the order type window
      And I get check number
      And I select category as "FOOD"
      And I select menu item as "Chicken Schnitzel"
      And I click Add Button to create Seat
      And I click Add Button to create Seat
      And I click Add Button to create Seat
      And I should verify the Auto Gratuity is opened and click on Back button
      And I click Add Button to create Seat
      And I should verify the Auto Gratuity is opened and click on Back button
      And I Click on the Seats arrow button in the order screen
      And Delete seat as "2" in the seats screen
      And I click Seat 3 for add menu item
