@CashReward
Feature: Instant Cash Reward Feature

  Scenario: verifying cash reward name changed into cash price
    Given I'm logged in
    And I closed the order type window
    And I get check number
    And I select category as "FOOD"
    And I select menu item as "SANDWICHES"
    And I should verify subtotal value as "$ 1.00"
    When I should verify tax value as "$ 0.10"
    When I should verify total2 value as "$ 1.10"
    And I click Void button on order management screen
    Then I should see All orders are voided
    And I click Done button on the Popup
    And I click log off button in order screen

    Scenario: verifying Change due is displaying for fast cash payment.
      Given I'm logged in
      And I closed the order type window
      And I get check number
      And I select category as "FOOD"
      And I select menu item as "SANDWICHES"
      And I should verify subtotal value as "$ 1.00"
      When I should verify tax value as "$ 0.10"
      When I should verify total2 value as "$ 1.10"
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

    Scenario: verify currently showing If you pay by cash
      Given I'm logged in
      And I closed the order type window
      And I get check number
      And I select category as "FOOD"
      And I select menu item as "SANDWICHES"
      And I should verify subtotal value as "$ 1.00"
      When I should verify tax value as "$ 0.10"
      When I should verify total2 value as "$ 1.10"
#      And I should verify cash price value as "$ 0.99"
      And I verify the actual cash price with calculated cash price
      And I click Payment button in the Order Management Screen
      When I verify the total value with balance due value in the payment window
      And I click cash button from the payment method popup
      Then I should see change Due popup
      And I verify the Change due value with Cash Price value is Same
      And I click Done button on the Popup
      And I verify the cash price value with paid amount value is same
      And I click Submit button on the Payment Window
      Then I should see the print or send receipt
      And I verify the cash price value with digital receipt screen
      And I click No thanks Button on the print receipt
      And I closed the order type window
      And I click log off button in order screen

      @cashReward
      Scenario: verify Pay with CC is able to view in print
        Given I'm logged in
        And I closed the order type window
        And I get check number
        And I select category as "FOOD"
        And I select menu item as "SANDWICHES"
        And I should verify subtotal value as "$ 1.00"
        When I should verify tax value as "$ 0.10"
        When I should verify total2 value as "$ 1.10"
#        And I should verify cash price value as "$ 0.99"
        And I verify the actual cash price with calculated cash price
        And I click Payment button in the Order Management Screen
        When I verify the total value with balance due value in the payment window
        And I click credit card payment on payment window
        Then I should see tip screen
        And I select the tip from the tip screen
        And I click the Continue button on the Total screen
        Then I should see the card details entry screen
        When I verify subtotal,tax and total value with card details screen value
        When I verify the tip value with card details screen value
        When I verify the paid amount value is zero
        And I get the pay amount value from the card details screen value
#        Then I verify card reader is not connected popup or not
        And I verify the Calculation pay amount with the card details pay amount
        And I click manual button on the your order screen
        And I pass the card number as "4111111111111111"
        And I pass card name as "Visa"
        And I pass expire date as "1224"
        And I click Process button on card screen
        And I click Ok button in receipt printer popup
        Then I should see the print or send receipt
        And I verify the pay amount value with digital receipt screen
        And I click No thanks Button on the print receipt
        And I closed the order type window
        And I click log off button in order screen

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
          Then I should see change Due popup
          And I verify the Change due value with Cash Price value is Same
          And I click Done button on the Popup
          And I verify the cash price value with paid amount value is same
          And I click Submit button on the Payment Window
          Then I should see the print or send receipt
          And I verify the cash price value with digital receipt screen
          And I click No thanks Button on the print receipt
          And I closed the order type window
          And I click log off button in order screen

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
    And I verify the actual cash price with calculated cash price
    And I click Payment button in the Order Management Screen
    When I verify the total value with balance due value in the payment window
    And I click cash button from the payment method popup
    Then I should see change Due popup
    And I verify the Change due value with Cash Price value is Same
    And I click Done button on the Popup
    And I verify the cash price value with paid amount value is same
    And I click Submit button on the Payment Window
    Then I should see the print or send receipt
    And I verify the cash price value with digital receipt screen
    And I click No thanks Button on the print receipt
    And I closed the order type window
    And I click log off button in order screen

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
     Then I should see change Due popup
     And I verify the Change due value with Cash Price value is Same
     And I click Done button on the Popup
     And I verify the cash price value with paid amount value is same
     And I click Submit button on the Payment Window
     Then I should see the print or send receipt
     And I verify the cash price value with digital receipt screen
     And I click No thanks Button on the print receipt
     And I closed the order type window
     And I click log off button in order screen

  Scenario: verify cash reward with Tax exempt
    Given I'm logged in
    And I closed the order type window
    And I get check number
    And I select category as "FOOD"
    And I select menu item as "Onion Rings"
    And I click Options button
    Then I should see the Check Options screen
    And I click Tax Exempt Button
    Then I should see tax exempt reasons
    And I select School as reason
    And I should verify subtotal value as "$ 9.00"
    When I should verify tax exempt total value as "$ 9.00"
    And I verify the actual cash price with calculated cash price while tax exempt
    And I click Payment button in the Order Management Screen
    When I verify the total value with balance due value in the payment window
    And I click cash button from the payment method popup
    Then I should see change Due popup
    And I verify the Change due value with Cash Price value is Same
    And I click Done button on the Popup
    And I verify the cash price value with paid amount value is same
    And I click Submit button on the Payment Window
    Then I should see the print or send receipt
    And I verify the cash price value with digital receipt screen
    And I click No thanks Button on the print receipt
    And I closed the order type window
    And I click log off button in order screen

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
    Then I should see change Due popup
    And I verify the Change due value with Cash Price value is Same
    And I click Done button on the Popup
    And I verify the cash price value with paid amount value is same
    And I click Submit button on the Payment Window
    Then I should see the print or send receipt
    And I verify the cash price value with digital receipt screen
    And I click No thanks Button on the print receipt
    And I closed the order type window
    And I click log off button in order screen

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
    And I verify the actual cash price with calculated cash price
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
    Then I should see change Due popup
    And I verify the Change due value with Cash Price value is Same
    And I click Done button on the Popup
    And I verify the cash price value with paid amount value is same
    And I click Submit button on the Payment Window
    Then I should see the print or send receipt
    And I verify the cash price value with digital receipt screen
    And I click No thanks Button on the print receipt
    And I closed the order type window
    And I click log off button in order screen

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
    Then I should see change Due popup
    And I verify the Change due value with Cash Price value is Same
    And I click Done button on the Popup
    And I verify the cash price value with paid amount value is same
    And I click Submit button on the Payment Window
    Then I should see the print or send receipt
    And I verify the cash price value with digital receipt screen
    And I click No thanks Button on the print receipt
    And I closed the order type window
    And I click log off button in order screen

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
      And I verify the fast cash price value with digital receipt screen
      And I click No thanks Button on the print receipt
      And I closed the order type window
      And I click log off button in order screen

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
        When I should verify cash price value1 as "$ 3.33"
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
          When I should verify cash price value1 as "$ 13.00"
          And I change the Quantity of menu Item as "5"
          And I should verify subtotal value as "$ 65.00"
          When I should verify tax value as "$ 7.30"
          When I should verify service charge value as "$ 4.98"
          When I should verify total4 value as "$ 77.28"
          When I should verify cash price value1 as "$ 67.81"
          And I change the Quantity1 of menu Item as "8"
          And I should verify subtotal value as "$ 104.00"
          When I should verify tax value as "$ 16.87"
          When I should verify service charge value as "$ 7.96"
          When I should verify total4 value as "$ 128.83"
          When I should verify cash price value1 as "$ 113.05"
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
    When I should verify cash price value2 as "$ 3.33"
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
    When I should verify cash price value2 as "$ 3.58"
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
      When I should verify cash price value2 as "$ 14.04"
      And I change the Quantity of menu Item as "5"
      And I should verify subtotal value as "$ 65.00"
      When I should verify tax value as "$ 7.30"
      And I should verify gratuity value as "$ 5.20"
      When I should verify service charge value1 as "$ 4.98"
      When I should verify total5 value as "$ 82.48"
      When I should verify cash price value2 as "$ 73.01"
      And I change the Quantity1 of menu Item as "8"
      And I should verify subtotal value as "$ 104.00"
      When I should verify tax value as "$ 16.87"
      And I should verify gratuity value as "$ 8.32"
      When I should verify service charge value1 as "$ 7.96"
      When I should verify total5 value as "$ 137.15"
      When I should verify cash price value2 as "$ 121.37"
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

      @m
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
      When I should verify tax value as "$ 1.17"
      And I should verify discount value as "$ 0.32"
      When I should verify total4 value as "$ 12.85"
      And I should verify cash price value1 as "$ 11.28"
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
  @m
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
        When I should verify tax value as "$ 1.06"
        And I should verify discount value as "$ 1.37"
        When I should verify total4 value as "$ 11.69"
        And I should verify cash price value1 as "$ 10.26"
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
    When I should verify tax value as "$ 1.20"
    And I should verify discount value as "$ 2.68"
    When I should verify total4 value as "$ 10.52"
    And I should verify cash price value1 as "$ 9.23"
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

  Scenario: verify cash reward with open check Discount
    Given I'm logged in
    And I closed the order type window
    And I get check number
    And I select category as "FOOD"
    And I select menu item as "Chicken Schnitzel"
    And I click Options button
    And I click discount on check option screen
    And I select open check discount
    Then I should see Open discount Screen
    And I pass the amount as "264" on open discount as "After"
    And I should verify subtotal value as "$ 12.00"
    When I should verify tax value as "$ 1.20"
    And I should verify discount value as "$ 2.64"
    When I should verify total4 value as "$ 10.56"
    And I should verify cash price value1 as "$ 9.27"
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
    And I should verify cash price value1 as "$ 11.97"
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
    And I click Discount as "CB-AfterTax-SetPrice1000"
    And I click Back button on Discount Screen
    And I should verify subtotal value as "$ 15.00"
    When I should verify tax value as "$ 1.36"
    And I should verify discount value as "$ 5.00"
    When I should verify total4 value as "$ 10.00"
    And I should verify cash price value1 as "$ 8.77"
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
      And I should verify cash price value1 as "$ 10.49"
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

  Scenario: verify cash reward with open check Discount & Inclusive Tax
    Given I'm logged in
    And I closed the order type window
    And I get check number
    And I select category as "Pasta"
    And I select menu item as "Ravioli Pesto"
    And I select modifier as "Butter"
    And I click Done to get back
    And I click Options button
    And I click discount on check option screen
    And I select open check discount
    Then I should see Open discount Screen
    And I pass the amount as "264" on open discount as "After"
    And I should verify subtotal value as "$ 15.00"
    When I should verify tax value as "$ 1.36"
    And I should verify discount value as "$ 2.64"
    When I should verify total4 value as "$ 12.36"
    And I should verify cash price value1 as "$ 10.85"
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
  And I should verify cash price value1 as "$ 10.84"
  And I change the Quantity of menu Item as "5"
  And I should verify subtotal value as "$ 65.00"
  When I should verify tax value as "$ 6.50"
  And I should verify discount value as "$ 6.50"
  When I should verify total4 value as "$ 65.00"
  And I should verify cash price value1 as "$ 57.04"
  And I change the Quantity1 of menu Item as "8"
  And I should verify subtotal value as "$ 104.00"
  When I should verify tax value as "$ 15.60"
  And I should verify discount value as "$ 10.40"
  When I should verify total4 value as "$ 109.20"
  And I should verify cash price value1 as "$ 95.82"
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
    And I should verify cash price value1 as "$ 0.91"
    And I change the Quantity of menu Item as "5"
    And I should verify subtotal value as "$ 65.00"
    When I should verify tax value as "$ 6.50"
    And I should verify discount value as "$ 64.61"
    When I should verify total4 value as "$ 6.89"
    And I should verify cash price value1 as "$ 6.05"
    And I change the Quantity1 of menu Item as "8"
    And I should verify subtotal value as "$ 104.00"
    When I should verify tax value as "$ 15.60"
    And I should verify discount value as "$ 103.61"
    When I should verify total4 value as "$ 15.99"
    And I should verify cash price value1 as "$ 14.03"
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
      And I should verify cash price value1 as "$ 84.58"
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

  Scenario: verify cash reward with open check Discount & Quantity based Tax
    Given I'm logged in
    And I closed the order type window
    And I get check number
    And I select category as "Appetizers"
    And I select menu item as "RAPINI"
    And I change the Quantity of menu Item as "8"
    And I click Options button
    And I click discount on check option screen
    And I select open check discount
    Then I should see Open discount Screen
    And I pass the amount as "264" on open discount as "After"
    And I should verify subtotal value as "$ 104.00"
    When I should verify tax value as "$ 15.60"
    And I should verify discount value as "$ 2.64"
    When I should verify total4 value as "$ 116.96"
    And I should verify cash price value1 as "$ 102.63"
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
  @m
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
        When I should verify cash price value3 as "$ 3.00"
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
    When I should verify cash price value3 as "$ 0.38"
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
    When I should verify cash price value3 as "$ 2.64"
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

    @CashPRice
    Scenario: verifying whether pay by cash, pay by cc is displaying in print when do partial payment
      Given I'm logged in
      And I closed the order type window
      And I get check number
      And I select category as "FOOD"
      And I select menu item as "Onion Rings"
      And I should verify subtotal value as "$ 9.00"
      And I should verify tax value as "$ 0.90"
      When I should verify total2 value as "$ 9.90"
      And I verify the actual cash price with calculated cash price
      And I click Cash button for Complete Sale
      When I verify the cash price value with fast cash value
      And I enter the payment as "$ 5" in the refund window
      And I click Enter Button on the cash pop-up
      When I verify the paid amount with partial paid amount
      When I verify the partial amount is same with balance due amount on the payment screen
      When I verify the partial amount is same with cash price amount on the payment screen
      And I click credit card payment on payment window
      Then I should see tip screen
      And I select the tip from the tip screen
      And I verify balance due amount same with amount in tip screen after tip selected
      And I click the Continue button on the Total screen
      Then I should see the card details entry screen
      When I verify subtotal,tax and total value with card details screen value while cash reward is enabled
      When I verify the tip value with card details screen value
      And I get the pay amount value from the card details screen value
#        Then I verify card reader is not connected popup or not
      And I verify the Calculation pay amount with the card details pay amount while partial pay
      And I click manual button on the your order screen
      And I pass the card number as "4111111111111111"
      And I pass card name as "Visa"
      And I pass expire date as "1224"
      And I click Process button on card screen
      And I click Ok button in receipt printer popup
      Then I should see the print or send receipt
      And I verify the pay amount value with digital receipt screen while partial payment
      And I click No thanks Button on the print receipt
      And I closed the order type window
      And I click All
      And I click Check Stats tab
      And I click Closed tab on the Check stats
      Then I should see closed check in closed check tab
      And I click closed checks details icon button
      Then I should see order summary screen
      When I verify subtotal value with order summary subtotal value
      When I verify total value with order summary total value when cash reward is enabled
      When I verify tax value with order summary tax value when cash reward is enabled
      And I click back to checks button
      And I click Closed tab on the Check stats
      And I click the Closed check on check stats
      And I click reopen check button on the check stats screen
      Then I Should get back to the Order Screen
      And I verify the values after reopen the check
      And I click Payment button in the Order Management Screen
      Then I verify the paid amount with partial paid amount on the payment screen
      And I verify the no due as zero on the payment screen
      And I click paid amount on the payment screen
      And I click Delete button on the payment window
      And I click Ok button in receipt printer popup
      And I click paid amount on the payment screen
      And I click Delete button on the payment window
      And I click Ok button in receipt printer popup
      Then I should see transaction void successful popup
      And I click Done button on the Popup
      And I click Exit to return to Order Management Screen
      And I should verify subtotal value as "$ 9.00"
      And I should verify tax value as "$ 0.90"
      When I should verify total2 value as "$ 9.90"
      And I verify the actual cash price with calculated cash price
      And I click Void button on order management screen
      Then I should see the void reason popup
      And I click void Reason on the void popup
      And I click Add Button on the void reason popup
      Then I should see Receipt Printer popup
      And I click Done button on the Popup
      And I closed the order type window
      And I click log off button in order screen

  @m
  Scenario: verifying whether Gratuity, Discount pay by cash, pay by cc is displaying in print when do partial payment
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
    And I click Cash button for Complete Sale
    When I verify the cash price value with fast cash value
    And I enter the payment as "$ 5" in the refund window
    And I click Enter Button on the cash pop-up
    When I verify the paid amount with partial paid amount while gratuity
    When I verify the partial amount is same with balance due amount on the payment screen
    When I verify the partial amount is same with cash price amount on the payment screen
    And I click credit card payment on payment window
    Then I should see tip screen
    And I select the tip from the tip screen
    And I verify balance due amount same with amount in tip screen after tip selected
    And I click the Continue button on the Total screen
    Then I should see the card details entry screen
    When I verify subtotal,tax and total value with card details screen value while cash reward is enabled
    When I verify the tip value with card details screen value
    And I get the pay amount value from the card details screen value
#        Then I verify card reader is not connected popup or not
    And I verify the Calculation pay amount with the card details pay amount while partial pay
    And I click manual button on the your order screen
    And I pass the card number as "4111111111111111"
    And I pass card name as "Visa"
    And I pass expire date as "1224"
    And I click Process button on card screen
    And I click Ok button in receipt printer popup
    Then I should see the print or send receipt
    And I verify the pay amount value with digital receipt screen while partial payment
    And I click No thanks Button on the print receipt
    And I closed the order type window
    And I click All
    And I click Check Stats tab
    And I click Closed tab on the Check stats
    Then I should see closed check in closed check tab
    And I click closed checks details icon button
    Then I should see order summary screen
    When I verify subtotal value with order summary subtotal value
    When I verify total value with order summary total value when cash reward is enabled
    When I verify tax value with order summary tax value when cash reward is enabled
    When I verify gratuity value with order summary total value when cash reward is enabled
    And I click back to checks button
    And I click Closed tab on the Check stats
    And I click the Closed check on check stats
    And I click reopen check button on the check stats screen
    Then I Should get back to the Order Screen
    And I verify the values after reopen the check1
    And I click Payment button in the Order Management Screen
    Then I verify the paid amount with partial paid amount on the payment screen
    And I verify the no due as zero on the payment screen
    And I click paid amount on the payment screen
    And I click Delete button on the payment window
    And I click Ok button in receipt printer popup
    And I click paid amount on the payment screen
    And I click Delete button on the payment window
    And I click Ok button in receipt printer popup
    Then I should see transaction void successful popup
    And I click Done button on the Popup
    And I click Exit to return to Order Management Screen
    And I should verify subtotal value as "$ 9.00"
    And I should verify tax value as "$ 0.90"
    And I should verify gratuity value as "$ 0.90"
    When I should verify total4 value as "$ 10.80"
    And I should verify paid amount as "$ 0.00"
    And I verify the actual cash price with calculated cash price while gratuity
    And I click Void button on order management screen
    Then I should see the void reason popup
    And I click void Reason on the void popup
    And I click Add Button on the void reason popup
    Then I should see Receipt Printer popup
    And I click Done button on the Popup
    And I closed the order type window
    And I click log off button in order screen







