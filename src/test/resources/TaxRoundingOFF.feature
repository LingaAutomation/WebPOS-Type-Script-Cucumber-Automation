@TaxRoundOffTypeScriptWebPOS
Feature: TaxRoundOff
  Background:
#    Given I am logging in new
    And I enter the pin in the pin screen
    And I have closed the order type window

@basicTaxScenarios
  Scenario: Check tax and RoundOff value for menu item with quantity tax
    And I have selected category arrow
    And Select the category "FOOD ITEMS"
    And Select the menu item "testing menu7"
    And Check the amount of menu item "30.00"
    And Verify if menu price and subtotal are equal
    And Verify if tax is calculated as per the quantity "1"
    And I have selected category arrow
    And Select the category "FOOD ITEMS"
    And Select the menu item "testing menu7"
    And Verify if tax is calculated as per quantity2 "3"
    And I have selected category arrow
    And Select the category "FOOD ITEMS"
    And Select the menu item "testing menu7"
    And Verify if tax is calculated as per the quantity3 "5"
    And I have closed the order type window
    And I click log off button in order screen
    #And Verify if tax amount is correct for the changing quantity

  @basicTaxScenarios
  Scenario: Check tax and RoundOff value for menu item with inclusive tax
    And I have selected category arrow
    And Select the category "FOOD ITEMS"
    And Select the menu item "testing menu8"
    And Verify if the tax "12" is calculated correctly
    And Verify if the total is calculated correctly
    And Verify if the balance due is calculated correctly
    And Verify if the balance due is displayed correctly after payment
    And I click log off button in order screen

  @basicTaxScenarios
  Scenario: Check tax and RoundOff value for menu item with exclusive tax
    And I have selected category arrow
    And Select the category "FOOD ITEMS"
    And Select the menu item "testing menu9"
    And Verify if the ExcTax "0.10255" is calculated correctly
    And Verify if the total value is calculated correctly
    And Verify if the balance due value is calculated correctly
    And Verify if the balance due value is displayed correctly after payment
    And I click log off button in order screen

  @basicTaxScenarios
  Scenario: Check tax and RoundOff value for menu item when item discount is applied (exclusive)
    And I have selected category arrow
    And Select the category "FOOD ITEMS"
    And Select the menu item "testing menu10"
#    And Apply the item discount "20% Discount"
    And I click Discount as "20% Discount"
    And I selected cancel button
    And Verify if tax "0.20" "0.0622" is calculated properly and calculate round-off
    And Verify if the total amount is calculated correctly
    And Verify if the balance due amount is calculated correctly
    And Verify if the balance due amount is displayed correctly after payment
    And I click log off button in order screen

  @basicTaxScenarios
  Scenario: Check tax and RoundOff value for menu item when item discount is applied (inclusive)
    And I have selected category arrow
    And Select the category "FOOD ITEMS"
#    And Select the menu item with inclusive tax with discount
    And Select the menu item "testing menu11"
#    And Apply the item discount2 "30% Discount"
    And I click Discount as "30% Discount"
    And I selected cancel button
    And Verify if tax "0.30" "14.77" is calculated correctly and calculate round-off
    And Verify if the total amount is displayed correctly
    And Verify if the balance due amount is displayed correctly
    And Verify if the balance due amount is displayed correctly after the payment
    And I click log off button in order screen

  @basicTaxScenarios
  Scenario: Check RoundOff value for open item (exclusive)
    And Selected Options button
    And Selected Open item option
    And Selected Coursing name field
    And I swipe to "DESSERT" Coursing Name
    And I entered course name
    And I selected the Price text field
    And I entered the price
    And I selected the Continue button
    And I selected the Tax
    And I selected the Exclusive Tax
    And I click Done button on the open item window
#    And I selected the back button
    And Verify if tax and round-off are calculated properly for exclusive
    And Verify if the balance due value is calculated correctly
    And Verify if the balance due value is displayed correctly after payment
    #And I click Void button on order management screen
    #Then I should see All orders are voided
    #And I click Done button on the Popup
    And I click log off button in order screen

  @basicTaxScenarios
  Scenario: Check RoundOff value for open item (inclusive)
    And Selected Options button
    And Selected Open item option
    And Selected Coursing name field
    And I swipe to "BEVERAGE" Coursing Name
    And I entered course name
    And I selected the Price text field
    And I entered the price
    And I selected the Continue button
    And I selected the Tax
    And I selected the Inclusive Tax
    And I click Done button on the open item window
#    And I selected the back button
    And Verify if tax and round-off are calculated properly for inclusive
    And Verify if the balance due value is calculated correctly
    And Verify if the balance due value is displayed correctly after payment
    #And I click Void button on order management screen
    #Then I should see All orders are voided
    #And I click Done button on the Popup
    And I click log off button in order screen

  @basicTaxScenarios
  Scenario: Check RoundOff value for menu item (check tax)
    And I have selected category arrow
    And Select the category "FOOD ITEMS"
    And Select the menu item "testing menu13"
#    And Select the menu item with check tax
    And Verify if the CheckTax is calculated correctly and calculate round-off
    And Verify if the total value is calculated correctly
    And Verify if the balance due value is calculated correctly
    And Verify if the balance due value is displayed correctly after payment
    And I click log off button in order screen

  @basicTaxScenarios
  Scenario: Check RoundOff value for open item (check tax)
    And Selected Options button
    And Selected Open item option
    And Selected Coursing name field
    And I swipe to "RETAIL" Coursing Name2
    And I entered course name
    And I selected the Price text field
    And I entered the price for the open item
    And I selected the Continue button
    And I selected the Tax
    And I click Done button on the open item window
#    And I selected the back button
    And Verify if the CheckTax is calculated correctly and calculate round-off
    And Verify if the balance due value is calculated correctly
    And Verify if the balance due value is displayed correctly after payment
    #And I click Void button on order management screen
    #Then I should see All orders are voided
    #And I click Done button on the Popup
    And I click log off button in order screen

  @basicTaxScenarios
  Scenario: Check RoundOff value for menu item with both inclusive and exclusive tax
    And I have selected category arrow
    And Select the category "FOOD ITEMS"
    And Select the menu item "testing menu14"
    And Verify if both the taxes exc "0.10255" and inc "12.12" are calculated correctly and calculate round-off
#    And Verify if exclusive tax "0.10255" and inclusive tax "12.12" are calculated properly and calculate roundoff
    And Verify if the total value is calculated correctly for both inclusive and exclusive tax
    And Verify if the balance due value is calculated correctly
    And Verify if the balance due value is displayed correctly after payment
    And I click log off button in order screen

#  Scenario: Check RoundOff value for OPEN item with both inclusive and exclusive tax
#    And Selected Options button
#    And Selected Open item option
#    And Selected Coursing name field
#    And I swipe to "Apetizer" Coursing Name
#    And I entered course name as "Nuttela Shake"
#    And I selected the Price text field
#    And I entered the price for the open item
#    And I selected the Continue button
#    And I selected the Tax
#    And I selected the exclusive tax
#    And I clicked the exclusive tax
#    And I selected the inclusive tax
#    And I click Done button on the open item window
#    And I selected the back button
#    And I click Void button on order management screen
#    Then I should see All orders are voided
#    And I click Done button on the Popup
#    And I click log off button in order screen

  @basicTaxScenarios
  Scenario: Check RoundOff value for menu item with both inclusive and exclusive tax with discount
    And I have selected category arrow
    And Select the category "FOOD ITEMS"
    And Select the menu item "testing menu14"
#    And Apply the item discount "22% Discount"
    And I click Discount as "22% Discount"
    And I selected cancel button
    And Verify if tax is calculated properly and calculated roundOff Inc And Exc
    And Verify if the total value is calculated correctly for both inclusive and exclusive tax with discount
    And Verify if the balance due amount is displayed correctly
    And Verify if the balance due amount is displayed correctly after the payment
    And I click log off button in order screen

  @basicTaxScenarios
  Scenario: Check RoundOff value for menu item with exclusive tax with discount amount
    And I have selected category arrow
    And Select the category "FOOD ITEMS"
    And Select the menu item "testing menu10"
#    And Apply the item discount "23$ discount"
    And I click Discount as "23$ discount"
    And I selected cancel button
    And Verify if tax "0.0622" is calculated properly and calculate roundOff for amount discount "23.66"
    And Verify if the total amount is calculated correctly
    And Verify if the balance due amount is displayed correctly
    And Verify if the balance due amount is displayed correctly after the payment
    And I click log off button in order screen

  @basicTaxScenarios
  Scenario: Check RoundOff value for menu item with inclusive tax with discount amount
    And I have selected category arrow
    And Select the category "FOOD ITEMS"
    And Select the menu item "testing menu11"
#    And Apply the item discount2 "32$ discount"
    And I click Discount as "32$ discount"
    And I selected cancel button
    And Verify if tax "14.77" is calculated properly and calculate roundOff for amount discount Inclusive "32.33"
    And Verify if the balance due amount is displayed correctly
    And Verify if the balance due amount is displayed correctly after the payment
    And I click log off button in order screen

  @basicTaxScenarios
  Scenario: Check RoundOff value for menu item with exclusive tax with set price
    And I have selected category arrow
    And Select the category "FOOD ITEMS"
    And Select the menu item "testing menu10"
#    And Select the menu item with exclusive tax with discount
#    And Apply the item discount "set price discount"
    And I click Discount as "set price discount"
    And I selected cancel button
    And Verify if tax is calculated properly and calculate roundOff for set price discount Exclusive
    And Verify if the balance due amount is displayed correctly
    And Verify if the balance due amount is displayed correctly after the payment
    And I click log off button in order screen

  @basicTaxScenarios
  Scenario: Check RoundOff value for menu item with inclusive tax with set price
    And I have selected category arrow
    And Select the category "FOOD ITEMS"
    And Select the menu item "testing menu11"
    And I click Discount as "set price discount"
    And I selected cancel button
    And Verify if tax is calculated properly and calculate roundOff for set price discount Inclusive
    And Verify if the balance due amount is displayed correctly
    And Verify if the balance due amount is displayed correctly after the payment
    And I click log off button in order screen

  @basicTaxScenarios
  Scenario: Check RoundOff value for menu item with exclusive tax with check discount
    And I have selected category arrow
    And Select the category "FOOD ITEMS"
    And Select the menu item "pizza supreme"
    And Select the menu item "pizza dominator"
#    And Apply the check discount "check discount 24%"
    And I click Discount as "check discount 24%"
    And I selected cancel button
    And Verify if tax is calculated properly "0.24" "0.10255" "0.0622" and calculate roundOff for check discount exclusive
    And Verify if the balance due amount is displayed correctly
    And Verify if the balance due amount is displayed correctly after the payment
    And I click log off button in order screen

  @basicTaxScenarios
  Scenario: Check RoundOff value for menu item with inclusive tax with check discount
    And I have selected category arrow
    And Select the category "FOOD ITEMS"
    And Select the menu item "chicken farmhouse pizza"
    And Select the menu item "cheesy pasta pizza"
    And I click Discount as "check discount 24%"
    And I selected cancel button
    And Verify if tax "0.24" is calculated properly and calculate roundOff for check discount "16.12" inclusive
    And Verify if the balance due amount is displayed correctly
    And Verify if the balance due amount is displayed correctly after the payment
    And I click log off button in order screen

  @basicTaxScenarios
  Scenario: Check RoundOff value for menu item with exclusive tax with open item discount
    And I have selected category arrow
    And Select the category "FOOD ITEMS"
    And Select the menu item "testing menu15"
    And I selected menu options
    And I selected Open Discount
    And I tapped the percentage field
    And I entered the discount percentage
    And I selected the Continue button
    And I tapped reason and entered the reason
#    And I click "Hide keyboard" button in the keyboard "Click Back"
    And I selected the apply button
    And Verify If Tax "0.1345" Is Calculated Properly And Calculate RoundOff for Open Discount "0.10255" Exclusive
    And Verify if the total amount is calculated correctly for exclusive open discount
    And Verify if the balance due amount is displayed correctly
    And Verify if the balance due amount is displayed correctly after the payment
    And I click log off button in order screen

  @basicTaxScenarios
  Scenario: Check RoundOff value for menu item with inclusive tax with open item discount
    And I have selected category arrow
    And Select the category "FOOD ITEMS"
    And Select the menu item "testing menu16"
    And I selected menu options
    And I selected Open Discount
    And I tapped the percentage field
    And I entered the discount percentage
    And I selected the Continue button
    And I tapped reason and entered the reason
#    And I click "Hide keyboard" button in the keyboard "Click Back"
    And I selected the apply button
    And Verify If Tax Is Calculated Properly And Calculate RoundOff for Open Discount Inclusive
    And Verify if the balance due amount is displayed correctly
    And Verify if the balance due amount is displayed correctly after the payment
    And I click log off button in order screen

  @basicTaxScenarios
  Scenario: Check RoundOff value for menu item with exclusive tax with item discount after tax
    And I have selected category arrow
    And Select the category "FOOD ITEMS"
    And Select the menu item "testing menu17"
    And I selected quantity as "2"
    And I click Discount as "45% Discount"
    And I selected cancel button
    And Verify If Tax "0.10255" and discount "0.4567" Is Calculated Properly And Calculate RoundOff for item discount after tax Exclusive
    And Verify if the balance due amount is displayed correctly
    And Verify if the balance due amount is displayed correctly after the payment
    And I click log off button in order screen

  @basicTaxScenarios
  Scenario: Check RoundOff value for menu item with inclusive tax with item discount after tax
    And I have selected category arrow
    And Select the category "FOOD ITEMS"
    And Select the menu item "testing menu18"
    And I selected quantity as "4"
    And I click Discount as "45% Discount"
    And I selected cancel button
    And Verify If Tax "17.62" and discount "0.4567" Is Calculated Properly And Calculate RoundOff for item discount after tax Inclusive
    And Verify if the balance due amount is displayed correctly
    And Verify if the balance due amount is displayed correctly after the payment
    And I click log off button in order screen

  @basicTaxScenarios
  Scenario: Check RoundOff value for menu item with tax on item tax Exclusive
    And I have selected category arrow
    And Select the category "FOOD ITEMS"
    And Select the menu item "testing menu19"
    And Verify If Tax "0.1598" and tax on item tax "0.1367" Is Calculated Properly And Calculate RoundOff for item discount after tax Exclusive
    And Verify if the balance due value is calculated correctly
    And Verify if the balance due value is displayed correctly after payment
    And I click log off button in order screen
    #roundoff issue is there in above scenario

  @basicTaxScenarios
  Scenario: Check RoundOff value for menu item with tax on item tax Inclusive
    And I have selected category arrow
    And Select the category "FOOD ITEMS"
    And Select the menu item "testing menu20"
#    And I selected the menu item with inclusive tax and tax on item tax
    And Verify If Tax "17.666" and tax on item tax "0.28555" Is Calculated Properly And Calculate RoundOff for item discount after tax Inclusive
    And Verify if the balance due value is calculated correctly
    And Verify if the balance due value is displayed correctly after payment
    And I click log off button in order screen

    #NOTIMPLEMENTEDINWEBPOS
#  Scenario:  Check RoundOff value for menu item with tax on check tax
#    And I have selected category arrow
#    And Select the category "Food items"
#    And I selected the menu item with check tax and tax on check tax
#    And I selected quantity as "2"
#    And Verify If Tax "0.11898" and tax on item tax "0.01234" Is Calculated Properly And Calculate RoundOff for item discount after tax Exclusive
#    And I click log off button in order screen

#
#  Scenario: Check RoundOff value for exclusive for reopened check
#    And I have selected category arrow
#    And Select the category Food items
#    And Select the menu item with exclusive tax
#    And Verify if the ExcTax is calculated correctly
#    And Verify if the total value is calculated correctly
#    And Verify if the balance due value is calculated correctly
#    And Verify if the balance due value is displayed correctly after payment
#    And Select the All option

  @basicTaxScenarios
  Scenario:  Check RoundOff value for menu item with exclusive tax and mix and match discount
    And I have selected category arrow
    And Select the category "IceCreams"
#    And Select the category "IceCreams"
    And Select the menu item "testing menu22"
    And I click Discount as "Mix ad Match1"
    And I selected cancel button
    And Verify If Tax "0.10255" Is Calculated Properly And Calculate RoundOff for item discount after tax Exclusive
    And Verify if the balance due amount is displayed correctly
    And Verify if the balance due amount is displayed correctly after the payment
    And I click log off button in order screen

  @basicTaxScenarios
  Scenario:  Check RoundOff value for menu item with inclusive tax and mix and match discount
    And I have selected category arrow
    And Select the category "IceCreams"
    And Select the menu item "testing menu23"
    And I selected quantity as "2"
    And I click Discount as "Mix and Match2"
    And I selected cancel button
    And Verify If Tax "16.12" and discount "13.24" Is Calculated Properly And Calculate RoundOff for item discount before tax Inclusive
    And Verify if the balance due amount is displayed correctly
    And Verify if the balance due amount is displayed correctly after the payment
    And I click log off button in order screen

  @basicTaxScenarios
  Scenario:  Check RoundOff value for menu item with exclusive tax, inclusive tax modifier and mix and match discount Percentage
    And I have selected category arrow
    And Select the category "IceCreams"
    And Select the menu item "testing menu24"
    And I selected the modifier "Sambar"
    And I selected the modifier "Sambar"
    And I selected the prefix "Meals"
#    And I selected the modifier with prefix
    And I click Discount as "Mix and Match3"
    And I selected cancel button
    And Verify If Exc Tax "0.0622" and inclusive modifier tax "0.13450" are Calculated Properly And Calculate RoundOff for item discount after tax Exclusive
    And Verify if the balance due amount is displayed correctly
    And Verify if the balance due amount is displayed correctly after the payment
    And I click log off button in order screen

#  Scenario: Check RoundOff value for open item with check tax
#    And

  @basicTaxScenarios
  Scenario:  Check RoundOff value for menu item with exclusive tax and free item discount
    And I have selected category arrow
    And Select the category "PIZZA"
    And Select the menu item "PEPPERONI PIZZA"
    And I selected the serving size as "MEDIUM"
#   And I click Done button on the open item window
    And I click Discount as "free item disc"
    And I selected cancel button
    And Verify if exclusive tax "0.05623" is calculated properly and calculate roundoff
    And Verify if the total value is calculated correctly exc when free item amount is "1"
    And Verify if the balance due value is calculated correctly
    And Verify if the balance due value is displayed correctly after payment
    And I click log off button in order screen

  @basicTaxScenarios
  Scenario:  Check RoundOff value for menu item with inclusive tax and free item discount
    And I have selected category arrow
    And Select the category "PIZZA"
    And Select the menu item "Jalapeno Chicken Pizza"
#    And I selected the serving size as "SMALL"
    And I selected the serving size as "SMALL" conversational
#    And I click Done button on the open item window
    And I click Discount as "free item disc"
    And I selected cancel button
    And Verify if inclusive tax "14.14" is calculated properly and calculate roundoff
    And Verify if the total value is calculated correctly inc when free item amount is "1"
    And Verify if the balance due value is calculated correctly
    And Verify if the balance due value is displayed correctly after payment
    And I click log off button in order screen

  @basicTaxScenarios
  Scenario:  Check RoundOff value for menu item with both exclusive and inclusive tax with free item discount
    And I have selected category arrow
    And Select the category "PIZZA"
    And Select the menu item "Chicken Overload Pizza"
    And I click Discount as "free item disc"
    And I selected cancel button
    And Verify if exclusive tax "0.05623" and inclusive tax "14.14" are calculated properly and calculate roundoff
    And Verify if the total value is calculated correctly exc "0.05623" and inc when free item amount is "1"
    And Verify if the balance due value is calculated correctly
    And Verify if the balance due value is displayed correctly after payment
    And I click log off button in order screen

#  Scenario:  Check RoundOff value for menu item after reopening check
#    And Select the All option
#    And I select Closed checks tab
#    And I selected the check number "33-001"
#    And I selected Re-Open Check option
#    And I voided the menu item

  @basicTaxScenarios
  Scenario:  Check RoundOff value for menu item with exclusive tax when tax is exempted
    And I have selected category arrow
    And Select the category "FOOD ITEMS"
    And Select the menu item "testing menu9"
    And Verify if the ExcTax "0.10255" is calculated correctly
    And Verify if the total value is calculated correctly
    And Selected Options button
#    And User select tax exempt option
    And Select tax exempt option
#    And Select the Tax exempt option as "School"
#    And I click Back button on Tax Exempt window
#    And I selected the back button
    And I verfiy if the tax amount is exempted
    And Verify if the balance due value is calculated correctly tax exempt
    And Verify if the balance due value is displayed correctly after payment
    And I click log off button in order screen

  @basicTaxScenarios
  Scenario:  Check RoundOff value for menu item with inclusive tax when tax is exempted
    And I have selected category arrow
    And Select the category "FOOD ITEMS"
    And Select the menu item "testing menu8"
    And Verify if the tax "12" is calculated correctly
    And Selected Options button
    And Select tax exempt option
#    And Select the Tax exempt option as "School"
    And I verfiy if the tax amount is exempted inclusive
    And Verify if the balance due value is calculated correctly tax exempt
    And Verify if the balance due value is displayed correctly after payment
    And I click log off button in order screen

  @basicTaxScenarios
  Scenario: Check RoundOff value for menu item with both inclusive and exclusive tax when tax is exempted
    And I have selected category arrow
    And Select the category "FOOD ITEMS"
    And Select the menu item "testing menu14"
    And Verify if both the taxes are calculated correctly and calculate round-off
    And Selected Options button
    And Select tax exempt option
#    And Select the Tax exempt option as "School"
    And I verfiy if the tax amount is exempted both exclusive and inclusive
    And Verify if the balance due value is calculated correctly tax exempt
    And Verify if the balance due value is displayed correctly after payment
    And I click log off button in order screen

#  Scenario:  Check RoundOff value for menu item with exclusive tax when tax is exempted

  @basicTaxScenarios
  Scenario:  Check RoundOff value for menu item after reopening check and adding new menu item Exc
    And I get check number
    And I have selected category arrow
    And Select the category "FOOD ITEMS"
    And Select the menu item "testing menu9"
    And Verify if the ExcTax "0.10255" is calculated correctly
    And Verify if the total value is calculated correctly
    And Verify if the balance due value is calculated correctly
    And Verify if the balance due value is displayed correctly after payment
    And Select the All option
#    And I click Check Stats tab
    And I click Closed tab on the Check stats
    Then I should see closed check in closed check tab
    And I click reopen check button on the check stats screen
    And I have selected category arrow
    And Select the category "FOOD ITEMS"
    And Select the menu item "testing menu9"
    And Verify if the ExcTax is calculated correctly Reopen "0.10255"
    And Verify If The Total Value Is Calculated Correctly Reopen Exc
    And Verify if the balance due value is calculated correctly After Reopen Exc
    And Verify if the balance due value is displayed correctly after payment
    And I click log off button in order screen
#Found a issue i roundoff need to confirm and raise

  @basicTaxScenarios
  Scenario:  Check RoundOff value for menu item after reopening check and adding new menu item Inc
    And I get check number
    And I have selected category arrow
    And Select the category "FOOD ITEMS"
    And Select the menu item "testing menu8"
    And Verify if the tax "12" is calculated correctly
    And Verify if the total is calculated correctly
    And Verify if the balance due is calculated correctly
    And Verify if the balance due is displayed correctly after payment
    And Select the All option
#    And I click Check Stats tab
    And I click Closed tab on the Check stats
    Then I should see closed check in closed check tab
    And I click reopen check button on the check stats screen
    And I have selected category arrow
    And Select the category "FOOD ITEMS"
    And Select the menu item "testing menu8"
    And Verify if the IncTax is calculated correctly Reopen "12"
    And Verify If The Total Value Is Calculated Correctly Reopen Inc
    And Verify if the balance due value is calculated correctly After Reopen Exc
    And Verify if the balance due value is displayed correctly after payment
    And I click log off button in order screen

  @basicTaxScenarios
  Scenario:  Check RoundOff value for menu item after reopening check and submitting
    And I get check number
    And I have selected category arrow
    And Select the category "FOOD ITEMS"
    And Select the menu item "testing menu9"
#    And Select the menu item with exclusive tax
    And Verify if the ExcTax "0.10255" is calculated correctly
    And Verify if the total value is calculated correctly
    And Verify if the balance due value is calculated correctly
    And Verify if the balance due value is displayed correctly after payment
    And Select the All option
#    And I click Check Stats tab
    And I click Closed tab on the Check stats
    Then I should see closed check in closed check tab
    And I click reopen check button on the check stats screen
    And I Selected payment button
    And I click log off button in order screen

#  @settwo
   @basicTaxScenarios
  Scenario:  Check RoundOff value for menu item after reopening check and voiding
    And I get check number
     And I have selected category arrow
     And Select the category "FOOD ITEMS"
     And Select the menu item "testing menu8"
    And Verify if the tax "12" is calculated correctly
    And Verify if the total is calculated correctly
    And Verify if the balance due is calculated correctly
    And Verify if the balance due is displayed correctly after payment
    And Select the All option
#    And I click Check Stats tab
    And I click Closed tab on the Check stats
    Then I should see closed check in closed check tab
    And I click reopen check button on the check stats screen
    And I deleted the payment
    And I selected void button
    And Select the Void reason as "Server Error"
    And I click log off button in order screen

  @basicTaxScenarios
  Scenario: Check tax and RoundOff value for menu item with quantity tax along with rounding off
    And I have selected category arrow
    And Select the category "chicken"
    And Select the sub category "dry chicken"
    And Select the menu item "Chilli Chicken Dry"
#    And Check the amount of menu item "25.77"
#    And Verify if menu price and subtotal are equal
    And Verify if tax is calculated as per the quantity "1" and tax "0.04567"
    And I have selected category arrow
    And Select the category "chicken"
    And Select the sub category "dry chicken"
    And Select the menu item "Chilli Chicken Dry"
#    And Verify if menu price and subtotal are equal
    And I selected quantity as "3"
    And Verify if tax is calculated as per the quantity "3" and tax "0.06789"
    And I have selected category arrow
    And Select the category "chicken"
    And Select the sub category "dry chicken"
    And Select the menu item "Chilli Chicken Dry"
#    And Verify if menu price and subtotal are equal
    And I selected quantity as "5"
    And Verify if tax is calculated as per the quantity "5" and tax "0.08901"
    And I click log off button in order screen
#    And Verify if tax amount is correct for the changing quantity

#  Scenario:  Check RoundOff value for menu item with modifier tax (exc) after reopening check and voiding
#    And I have selected category arrow
#    And Select the category Mojitos

#  @settwo
  @basicTaxScenarios
  Scenario: Verify tax and round off for exclusive menu item and inclusive tax modifier
    And I have selected category arrow
    And Select the category "IceCreams"
    And Select the menu item "testing menu24"
    And I selected the modifier "Sambar"
    And I selected the modifier "Sambar"
    And I selected the prefix "Meals"
    And I click Discount as "Mix and Match3"
    And I selected cancel button
    And Verify If Exc Tax "0.0622" and inclusive modifier tax "0.13450" are Calculated Properly And Calculate RoundOff for item discount after tax Exclusive
    And Verify if the balance due amount is displayed correctly
    And Verify if the balance due amount is displayed correctly after the payment
    And I click log off button in order screen
#  Scenario: Check RoundOff value for open item with check tax

#  @settwo
  @basicTaxScenarios1
  Scenario: Verify tax and round off after reopening check and deleting discount
    And I get check number
    And I have selected category arrow
    And Select the category "FOOD ITEMS"
    And Select the menu item "testing menu10"
    And I click Discount as "20% Discount"
    And I selected cancel button
    And Verify if tax "0.20" "0.0622" is calculated properly and calculate round-off
    And Verify if the total amount is calculated correctly
    And Verify if the balance due amount is calculated correctly
    And Verify if the balance due amount is displayed correctly after payment
    And Select the All option
#    And I click Check Stats tab
    And I click Closed tab on the Check stats
    Then I should see closed check in closed check tab
    And I click reopen check button on the check stats screen
    And Remove the item discount "20% Discount"
    #Reapplying to remove the discount
    And Verify if tax "0.0622" is calculated properly after removing discount and calculate round-off
    And Verify if the total value is calculated correctly
    And Verify if the balance due value is calculated correctly after removing discount
    And Verify if the balance due value is displayed correctly after payment
    And I click log off button in order screen

#    Scenario: Verify adding item discount for menu item (exc tax) including modifiers
#      And I have selected category arrow
#      And Select the category as "Mojitos"
#      And Select the sub category as "Fruit"
#      And I selected the menu item "Litchi Mojito"

#  @settwo

  @basicTaxScenarios1
  Scenario: Verify tax and round off after reopening check and deleting discount inclusive
    And I get check number
    And I have selected category arrow
    And Select the category "FOOD ITEMS"
    And Select the menu item "testing menu11"
    And I click Discount as "30% Discount"
    And I selected cancel button
    And Verify if tax "0.30" "14.77" is calculated correctly and calculate round-off
    And Verify if the total amount is displayed correctly
    And Verify if the balance due amount is displayed correctly
    And Verify if the balance due amount is displayed correctly after the payment
    And Select the All option
    And I click Check Stats tab
    And I click Closed tab on the Check stats
    Then I should see closed check in closed check tab
    And I click reopen check button on the check stats screen
    And Remove the item discount "30% Discount"
    And I selected cancel button
    #Reapplying to remove the discount
    And Verify if inclusive tax "14.77" is calculated properly and calculate roundoff
#    And Verify if tax is calculated correctly and calculate round-off
    And Verify if the total amount is displayed correctly
    And Verify if the balance due amount is displayed correctly
    And Verify if the balance due amount is displayed correctly after the payment
    And I click log off button in order screen

#  @setthree
  @basicTaxScenarios1
  Scenario: Verify tax and round off for exclusive menu item and alternate modifier
    And I get check number
    And I have selected category arrow
    And Select the category "IceCreams"
    And Select the menu item "testing menu25"
    And I selected the modifier "CHEESE"
    And I selected Alternate modifier button
    And I selected the alternate modifier "Avocado"
    And I selected OK button
    And Verify if the ExcTax "0.10255" is calculated correctly
    And Verify if the total value is calculated correctly
    And Verify if the balance due value is calculated correctly
    And Verify if the balance due value is displayed correctly after payment
    And I click log off button in order screen

#  @setthree
  @basicTaxScenarios1
  Scenario: Verify tax and round off for exclusive menu item and alternate modifier (with prefix)
    And I get check number
    And I have selected category arrow
    And Select the category "IceCreams"
    And Select the menu item "testing menu26"
    And I selected the modifier "Brinjal"
    And I selected Alternate modifier button
    And I selected the alternate modifier "CHEESE"
    And I selected the Prefix "double"
    And I selected OK button
    And Verify If Exc Tax "0.10255" and inclusive modifier tax "0.08655" are Calculated Properly And Calculate RoundOff for item discount after tax Exclusive
    And Verify if the balance due value is calculated correctly
    And Verify if the balance due value is displayed correctly after payment
    And I click log off button in order screen

#  @setthree
  @basicTaxScenarios1
  Scenario: Verify tax and round off for inclusive menu item and alternate modifier (with prefix)
    And I get check number
    And I have selected category arrow
    And Select the category "chicken"
    And Select the sub category "gravies"
    And Select the menu item "pepper chicken"
    And I selected the modifier "half"
    And I selected Alternate modifier button
    And I selected the alternate modifier "sprinkled cheese"
    And I selected the Prefix "Extra"
    And I selected OK button
    And Verify If Inc Tax "0.1612" and exclusive modifier tax "0.10255" are Calculated Properly And Calculate RoundOff for item discount after tax Exclusive
    And Verify if the balance due value is calculated correctly
    And Verify if the balance due value is displayed correctly after payment
    And I click log off button in order screen

#    Scenario: Verify after ordering and then voiding a menu item
#      And I get check number
#      And I have selected category arrow
#      And Select the category as "chicken"
#      And Select the sub category as "gravies"
#      And I selected the menu item "pepper chicken"
#      And I do repeat order for the menu item

#  @setthree
  @basicTaxScenarios1
  Scenario: Verify tax and round off for exclusive menu item after doing split by seat
    And I get check number
    And I have selected category arrow
    And Select the category "chicken"
    And Select the sub category "Rolls"
    And Select the menu item "chicken roll"
    And Verify if exclusive tax "0.06220" is calculated properly and calculate roundoff
    And I have selected category arrow
    And Select the category "DRINKS"
    And Select the menu item "blue lagoon"
    And Verify if exclusive taxes "0.06220" and "0.10255" are calculated properly and calculate roundoff
    And I selected order button
    And User click QSR on Menu Item page in split screen
    And User select DineIn mode in split screen
    And I selected the table
    And I selected the split button
    And I selected the split option as Split Check
    And Verify if exclusive taxes "0.10255" and "0.06220" are calculated properly in split screen
    And I selected Add button
    And I selected the menu1
    And I transferred the menu to new check
    And I check if exc tax "0.06220" is calculated properly for first check
    And I check if exc tax "0.10255" is calculated properly for second check
    And I select Print button
    #Above step is to make check number visible
    And I get check1 number
    And I get check2 number
    Then User click save and close in split screen
    And I check if exc tax "0.06220" is calculated properly in menu screen after split
    Then User click finish button in split screen
    And I click Check Stats tab
    And I click Active tab on the Check stats
    Then I should see active check2 in active check tab
    And I click open check button on the check stats screen
    And I check if exc tax "0.10255" is calculated properly in menu screen after split
    And Verify if the balance due value is calculated correctly
    And Verify if the balance due value is displayed correctly after payment split merge
    And I click log off button in order screen

#  @setthree
  @basicTaxScenarios2
  Scenario: Verify tax and round off for inclusive menu item after doing split by seat
    And I get check number
    And I have selected category arrow
    And Select the category "chicken"
    And Select the sub category "Rolls"
    And Select the menu item "Mutton roll"
    And Verify if inclusive tax "8.789" is calculated properly and calculate roundoff
    And I have selected category arrow
    And Select the category "DRINKS"
    And Select the menu item "Mint Lime"
    And Verify if inclusive taxes "13.789" and "8.789" are calculated properly and calculate roundoff
    And I selected order button
    And User click QSR on Menu Item page in split screen
    And User select DineIn mode in split screen
    And I selected the table
    And I selected the split button
    And I selected the split option as Split Check
    And Verify if inclusive taxes "8.789" and "13.789" are calculated properly and calculate roundoff
    And I selected Add button
    And I selected the menu1
    And I transferred the menu to new check
    And I check if inc tax "8.789" is calculated properly for first check
    And I check if inc tax "13.789" is calculated properly for second check
    And I select Print button
    #Above step is to make check number visible
    And I get check1 number
    And I get check2 number
    Then User click save and close in split screen
    And I check if inc tax "8.789" is calculated properly in menu screen after split
    Then User click finish button in split screen
    And I click Check Stats tab
    And I click Active tab on the Check stats
    Then I should see active check2 in active check tab
    And I click open check button on the check stats screen
    And I check if inc tax "13.789" is calculated properly in menu screen after split
    And Verify if the balance due value is calculated correctly
    And Verify if the balance due value is displayed correctly after payment split merge
    And I click log off button in order screen
#  @setthree

  @basicTaxScenarios
  Scenario: Check tax and RoundOff value for menu item with inclusive tax 2
    And I have selected category arrow
    And Select the category "FOOD ITEMS"
    And Select the menu item "testing menu31"
    And Verify if the tax is calculated correctly "8.789" and "13.789" inclusive
    And Verify if the total is calculated correctly
    And Verify if the balance due is calculated correctly
    And Verify if the balance due is displayed correctly after payment
    And I click log off button in order screen

#  @setthree
  @basicTaxScenarios
  Scenario:  Check tax and RoundOff value after adding multiple menu items with exclusive tax and voiding one menu item
    And I get check number
    And I have selected category arrow
    And Select the category "FOOD ITEMS"
    And Select the menu item "testing menu10"
    And I have selected category arrow
    And Select the category "FOOD ITEMS"
    And Select the menu item "testing menu10"
#    And I click Done button on the open item window//
    And Verify if exclusive tax "0.0622" and "0.0622" are calculated properly and calculate roundoff
    #above case will fail due to 0.01 mismatch so ot comparing//
    And I selected order button
    And I selected menu options
    And I selected void button in menu options
    And Select the Void item reason as "Server Error"
    And Verify if exclusive tax "0.0622" is calculated properly and calculate roundoff
    And Verify if the total value is calculated correctly
    And Verify if the balance due value is calculated correctly
    And Verify if the balance due value is displayed correctly after payment
    And I click log off button in order screen

#  @setthree
  @basicTaxScenarios
  Scenario:  Check tax and RoundOff value after adding multiple menu items with inclusive tax and voiding one menu item
    And I get check number
    And I have selected category arrow
    And Select the category "FOOD ITEMS"
    And Select the menu item "testing menu8"
    And I have selected category arrow
    And Select the category "FOOD ITEMS"
    And Select the menu item "testing menu8"
#    And I click Done button on the open item window//
    And Verify if inclusive tax "12" and "12" are calculated properly and calculate roundoff
    #above case will fail due to 0.01 mismatch so ot comparing//
    And I selected order button
    And I selected menu options
#    And I selected void button
    And I selected void button in menu options
    And Select the Void item reason as "Server Error"
    And Verify if inclusive tax "12" is calculated properly and calculate roundoff
    And Verify if the total is calculated correctly
    And Verify if the balance due is calculated correctly
    And Verify if the balance due is displayed correctly after payment
    And I click log off button in order screen

#  Scenario: Verify tax and round off for exclusive menu item after doing merge seats
#    And I get check number
#    And I have selected category arrow
#    And Select the category as "chicken"
#    And Select the sub category as "Shawarma"
#    And I selected the menu item "cheesy shawarma"
#    And Verify if exclusive tax "0.23765" is calculated properly and calculate roundoff
#    And User click QSR on Menu Item page in split screen
#    And User select DineIn mode in split screen
#    And I selected the table1
#    Then User click finish button in split screen
#    And I selected the table2
#    And I selected seat number
#    And I have selected category arrow
#    And Select the category as "FOOD"
#    And I selected the menu item "double patty burger"
#    And Verify if exclusive tax "0.10255" is calculated properly and calculate roundoff
#    Then User click finish button in split screen
#    And I selected Merge button
#    And I selected the table1 order
#    And I selected the table2 order
#    And I click Done button on the open item window
#    And I click Done button on the open item window
#    And I selected the table with merged checks
#    And Verify if exclusive taxes "0.10255" and "0.23765" are calculated properly and calculate roundoff
#    And Verify if the balance due value is calculated correctly
#    And Verify if the balance due value is displayed correctly after payment split merge
#    And I click log off button in order screen

#  @setthree

  @basicTaxScenarios
  Scenario: Verify tax and round off for exclusive menu item after doing merge seats
    And Select the All option
    And Select table layout option
    And I selected new check button
    And I selected the table1
    And I selected seat number
    And I get check number
    And I get table number
    And I have selected category arrow
    And Select the category "chicken"
    And Select the sub category "Shawarma"
    And Select the menu item "cheesy shawarma"
    And Verify if exclusive tax "0.23765" is calculated properly and calculate roundoff
    Then User click finish button in split screen
    And I selected new check button
    And I selected the table2
    And I selected seat number
    And I get table number2
    And I get check number2
    And I have selected category arrow
    And Select the category "FOOD"
    And Select the menu item "double patty burger"
    And Verify if exclusive tax "0.10255" is calculated properly and calculate roundoff
    Then User click finish button in split screen
    And I now merge the check1
    And I now merge the check2
    And I click Done button on the open item window
    And I click Done button on the open item window second time
    And I selected the table with merged checks
    And Verify if exclusive taxes "0.23765" and "0.10255" are calculated properly and calculate roundoff
    And Verify if the balance due value is calculated correctly
    And Verify if the balance due value is displayed correctly after payment split merge
    And I click log off button in order screen

#  @setthree

  @basicTaxScenarios
  Scenario: Verify tax and round off for exclusive menu item after doing merge seats applying check discount
    And Select the All option
    And Select table layout option
    And I selected new check button
    And I selected the table1
    And I selected seat number
    And I get check number
    And I get table number
    And I have selected category arrow
    And Select the category "Arab Biriyani"
    And Select the menu item "testing menu32"
    And I click Discount as "check 20"
    And I selected cancel button
    And Verify if tax is calculated properly and calculate roundOff for check discount "0.20" exclusive "0.10255"
#    And Verify if exclusive tax "0.23765" is calculated properly and calculate roundoff
    Then User click finish button in split screen
    And I selected new check button
    And I selected the table2
    And I selected seat number
    And I get table number2
    And I get check number2
    And I have selected category arrow
    And Select the category "Arab Biriyani"
    And Select the menu item "testing menu32"
    And I click Discount as "check 20"
    And I selected cancel button
    And Verify if tax is calculated properly and calculate roundOff for check discount "0.20" exclusive "0.10255"
    Then User click finish button in split screen
    And I now merge the check1 with discount
    And I now merge the check2 with discount
    And I click Done button on the open item window
    And I click Confirm button
    And I click Done button on the open item window second time
    And I selected the table with merged checks
    And Verify if tax is calculated properly and calculate roundOff for check discount "0.20" exclusive "0.10255" and "0.10255"
    And Verify if the balance due amount is displayed correctly
    And Verify if the balance due value is displayed correctly after payment split merge
    And I click log off button in order screen

#  @setthree
  @basicTaxScenarios
  Scenario: Verify tax and round off for exclusive and check tax menu item after doing merge seats
    And Select the All option
    And Select table layout option
    And I selected new check button
    And I selected the table1
    And I selected seat number
    And I get check number
    And I get table number
    And I have selected category arrow
    And Select the category "FOOD ITEMS"
    And Select the menu item "testing menu13"
    And Verify if the CheckTax "0.12444" is calculated correctly and calculate round-off
    Then User click finish button in split screen
    And I selected new check button
    And I selected the table2
    And I selected seat number
    And I get table number2
    And I get check number2
    And I have selected category arrow
    And Select the category "FOOD ITEMS"
    And Select the menu item "testing menu13"
    And Verify if the CheckTax "0.12444" is calculated correctly and calculate round-off
    Then User click finish button in split screen
    And I now merge the check1
    And I now merge the check2
    And I click Done button on the open item window
    And I click Done button on the open item window second time
    And I selected the table with merged checks
    And Verify if the CheckTax "0.12444" is calculated correctly and calculate round-off multiple menu
    And Verify if the balance due value is calculated correctly
    And Verify if the balance due value is displayed correctly after payment split merge
    And I click log off button in order screen

#  @setthree
  @basicTaxScenarios
  Scenario: Verify tax and round off for exclusive menu item applying 100% discount
    And I get check number
    And I have selected category arrow
    And Select the category "FOOD ITEMS"
    And Select the menu item "testing menu9"
    And I click Discount as "100% disc"
    And I selected cancel button
    And Verify if the tax is calculated correctly after 100% discount
    And Verify if the total is calculated correctly after 100% discount
    And Verify if the balance due value is calculated correctly after 100% discount
    And I click log off button in order screen

#  @setthree
  @basicTaxScenarios
  Scenario: Verify tax and round off for inclusive menu item applying 100% discount
    And I get check number
    And I have selected category arrow
    And Select the category "FOOD ITEMS"
    And Select the menu item "testing menu8"
    And I click Discount as "100% disc"
    And I selected cancel button
    And Verify if the tax is calculated correctly after 100% discount
    And Verify if the total is calculated correctly after 100% discount
    And Verify if the balance due value is calculated correctly after 100% discount
    And I click log off button in order screen

  @basicTaxScenarios
#  @setthree
  Scenario: Verify tax and round off for both exclusive and inclusive tax menu item applying 100% discount
    And I get check number
    And I have selected category arrow
    And Select the category "FOOD ITEMS"
    And Select the menu item "testing menu14"
    And I click Discount as "100% disc"
    And I selected cancel button
    And Verify if the tax is calculated correctly after 100% discount
    And Verify if the total is calculated correctly after 100% discount
    And Verify if the balance due value is calculated correctly after 100% discount
    And I click log off button in order screen

#  @setthree
  @basicTaxScenarios
  Scenario: Verify tax and roundoff after doing repeat order inclusive
    And I have selected category arrow
    And Select the category "FOOD ITEMS"
    And Select the menu item "testing menu8"
    And I selected menu options
    And I selected repeat order
    And Verify if the IncTax is calculated correctly Reopen "12"
    And Verify If The Total Value Is Calculated Correctly Reopen Inc
#    And Verify if the total is calculated correctly
    And Verify if the balance due is calculated correctly
    And Verify if the balance due is displayed correctly after payment
    And I click log off button in order screen

#  @setthree
  @basicTaxScenarios
  Scenario: Verify tax and roundoff after doing repeat order exclusive
    And I have selected category arrow
    And Select the category "FOOD ITEMS"
    And Select the menu item "testing menu9"
    And I selected menu options
    And I selected repeat order
    And Verify if the ExcTax is calculated correctly Reopen "0.10255"
    And Verify If The Total Value Is Calculated Correctly Reopen Exc
#    And Verify if the total is calculated correctly
    And Verify if the balance due is calculated correctly
    And Verify if the balance due is displayed correctly after payment
    And I click log off button in order screen

#    Scenario: Verify tax and roundoff for same menu item in multiple seats
#      And I have selected category arrow
#      And Select the category Food items
#      And Select the menu item with exclusive tax

#  @setthree
  @basicTaxScenarios
  Scenario: Verify tax and roundoff after placing menu items with check discount and reopen to void some menu items
#      And I added a new seat
    And I get check number
    And I have selected category arrow
    And Select the category "FOOD ITEMS"
    And Select the menu item "pizza supreme"
    And Select the menu item "pizza dominator"
    And I selected menu options
    And I selected repeat order
    And I selected menu options2
    And I selected repeat order
    And I click Discount as "check discount 24%"
    And I selected cancel button
    And Verify if tax is calculated properly "0.24" "0.10255" "0.0622" and calculate roundOff for check discount exclusive repeat order
    And Verify if the balance due amount is displayed correctly
    And Verify if the balance due amount is displayed correctly after the payment
    And Select the All option
    And I click Check Stats tab
    And I click Closed tab on the Check stats
    Then I should see closed check in closed check tab
    And I click reopen check button on the check stats screen
    And I deleted the payment
    And I selected menu options
    And I selected void button in menu options
    And Select the Void item reason as "Server Error"
    And I selected menu options2 discount
    And I selected void button in menu options
    And Select the Void item reason as "Server Error"
    And Verify if tax is calculated properly "0.24" "0.10255" "0.0622" and calculate roundOff for check discount exclusive
    And Verify if the balance due amount is displayed correctly
    And Verify if the balance due amount is displayed correctly after the payment
    And I click log off button in order screen

#  @setthree
  @basicTaxScenarios
  Scenario: Verify tax and roundoff after placing menu items with check discount then reopen to void some menu items and again reopen to void the check
    And I get check number
    And I have selected category arrow
    And Select the category "FOOD ITEMS"
    And Select the menu item "pizza supreme"
    And Select the menu item "pizza dominator"
    And I selected menu options
    And I selected repeat order
    And I selected menu options2
    And I selected repeat order
    And I click Discount as "check discount 24%"
    And I selected cancel button
    And Verify if tax is calculated properly "0.24" "0.10255" "0.0622" and calculate roundOff for check discount exclusive repeat order
    And Verify if the balance due amount is displayed correctly
    And Verify if the balance due amount is displayed correctly after the payment
    And Select the All option
    And I click Check Stats tab
    And I click Closed tab on the Check stats
    Then I should see closed check in closed check tab
    And I click reopen check button on the check stats screen
    And I deleted the payment
    And I selected menu options
    And I selected void button in menu options
    And Select the Void item reason as "Server Error"
    And I selected menu options2 discount
    And I selected void button in menu options
    And Select the Void item reason as "Server Error"
    And Verify if tax is calculated properly "0.24" "0.10255" "0.0622" and calculate roundOff for check discount exclusive
    And Verify if the balance due amount is displayed correctly
    And Verify if the balance due amount is displayed correctly after the payment
    And Select the All option
    And I click Check Stats tab
    And I click Closed tab on the Check stats
    Then I should see closed check in closed check tab
    And I click reopen check button on the check stats screen
    And I deleted the payment
    And I selected void button
    And Select the Void reason as "Mistake"
    And I click log off button in order screen

#  @setthree
  @basicTaxScenarios
  Scenario: Verify tax and roundoff after placing menu items with exclusive tax and item service charge
    And I get check number
    And I have selected category arrow
    And Select the category "Shakes"
    And Select the sub category "Can"
    And Select the menu item "Cranberry"
    And Verify If Tax "0.1200" and tax on item service charge "0.15980" Is Calculated Properly when item service charge "0.07654"
    And Verify If item service charge "0.07654" Is Calculated Properly
    And Verify if the balance due value is calculated correctly when item service charge is present
    And Verify if the balance due value is displayed correctly after payment
    And I click log off button in order screen

#  @setfour
  @basicTaxScenarios
  Scenario: Verify tax and roundoff after placing menu items with inclusive tax and item service charge
    And I get check number
    And I have selected category arrow
    And Select the category "Sparklers"
    And Select the sub category "Basic"
    And Select the menu item "Minty orange"
    And Verify If Inclusive Tax "0.13450" and tax on item service charge "0.12000" Is Calculated Properly when item service charge "0.13467"
    And Verify If item service charge "0.13467" Is Calculated Properly
    And Verify if the balance due value is calculated correctly when item service charge is present
    And Verify if the balance due value is displayed correctly after payment
    And I click log off button in order screen

#    Scenario: Verify tax and roundoff after placing exclusive menu item with exclusive tax modifier when open item discount is applied
#      An

#  @setfour
  @basicTaxScenarios
  Scenario: Check RoundOff value for menu item with exclusive tax with open item discount (amount BT)
    And I have selected category arrow
    And Select the category "FOOD ITEMS"
    And Select the menu item "testing menu15"
    And I selected menu options
    And I selected Open Discount
    And I tapped the amount field
    And I entered the discount amount
    And I selected the Continue button
    And I tapped reason and entered the reason
#    And I click "Hide keyboard" button in the keyboard "Click Back"
    And I selected the apply button
    And Verify If Tax Is Calculated Properly And Calculate RoundOff for Open Discount "14.55" Exclusive "0.10255" Amount BT
    And Verify if the total amount is calculated correctly for exclusive open discount
    And Verify if the balance due amount is displayed correctly
    And Verify if the balance due amount is displayed correctly after the payment
    And I click log off button in order screen

#  @setfour
  @basicTaxScenarios
  Scenario: Check RoundOff value for menu item with inclusive tax with open item discount (amount BT)
    And I have selected category arrow
    And Select the category "FOOD ITEMS"
    And Select the menu item "testing menu16"
    And I selected menu options
    And I selected Open Discount
    And I tapped the amount field
    And I entered the discount amount
    And I selected the Continue button
    And I tapped reason and entered the reason
#    And I click "Hide keyboard" button in the keyboard "Click Back"
    And I selected the apply button
    And Verify If Tax Is Calculated Properly And Calculate RoundOff for Open Discount "14.55" Inclusive "0.17620" Amount BT
    And Verify if the balance due amount is displayed correctly
    And Verify if the balance due amount is displayed correctly after the payment
    And I click log off button in order screen

#  @setfour
  @basicTaxScenarios
  Scenario: Check RoundOff value for menu item with exclusive tax with open item discount (percentage AT)
    And I have selected category arrow
    And Select the category "FOOD ITEMS"
    And Select the menu item "testing menu15"
    And I selected menu options
    And I selected Open Discount
    And I tapped the percentage field
    And I entered the discount percentage
    And I selected the Continue button
    And I tapped reason and entered the reason
#    And I click "Hide keyboard" button in the keyboard "Click Back"
    And I selected After Tax option
    And I selected the apply button
    And Verify If Tax "0.10255" and discount "0.1345" Is Calculated Properly And Calculate RoundOff for open item discount after tax Exclusive
    And Verify if the total amount is calculated correctly for exclusive open discount
    And Verify if the balance due amount is displayed correctly
    And Verify if the balance due amount is displayed correctly after the payment
    And I click log off button in order screen

#  @setfour
  @basicTaxScenarios
  Scenario: Check RoundOff value for menu item with inclusive tax with open item discount (percentage AT)
    And I have selected category arrow
    And Select the category "FOOD ITEMS"
    And Select the menu item "testing menu16"
    And I selected menu options
    And I selected Open Discount
    And I tapped the percentage field
    And I entered the discount percentage
    And I selected the Continue button
    And I tapped reason and entered the reason
#    And I click "Hide keyboard" button in the keyboard "Click Back"
    And I selected After Tax option
    And I selected the apply button
    And Verify If Tax "0.17620" and discount "0.1345" Is Calculated Properly And Calculate RoundOff for open item discount after tax Inclusive
    And Verify if the balance due amount is displayed correctly
    And Verify if the balance due amount is displayed correctly after the payment
    And I click log off button in order screen

    #NOTIMPLEMENTEDINWEBPOS
#  Scenario: Check RoundOff value for menu item with exclusive tax with open check discount (percentage BT)
#    And I have selected category arrow
#    And Select the category "Food items"
#    And Select the menu item with exclusive tax for open discount
##    And Do exclusive tax calculation "0.10255"
##    And Do total calculation "0.10255"
#    And Select the option button
#    And Select the discount button
#    And Select the open check discount button
#    And I selected Open Discount
#    And I tapped the amount field open check discount
#    And I entered the discount amount
#    And I selected the Continue button
#    And I tapped reason and entered the reason open check discount
#    And I click "Hide keyboard" button in the keyboard "Click Back"
#    And I selected the apply button
#    And Verify If Tax Is Calculated Properly And Calculate RoundOff for Open Discount "14.55" Exclusive "0.10255" Amount BT
#    And Verify if the total amount is calculated correctly for exclusive open discount
#    And Verify if the balance due amount is displayed correctly
#    And Verify if the balance due amount is displayed correctly after the payment
#    And I click log off button in order screen

   #NOTIMPLEMENTEDINWEBPOS
#  Scenario: Check RoundOff value for menu item with inclusive tax with open check discount (percentage BT)
#    And I have selected category arrow
#    And Select the category "Food items"
#    And Select the menu item with inclusive tax for open discount
##    And Do inclusive tax calculation "0.17620"
##    And Do total calculation inclusive "0.17620"
#    And Select the option button
#    And Select the discount button
#    And Select the open check discount button
#    And I selected Open Discount
#    And I tapped the amount field open check discount
#    And I entered the discount amount
#    And I selected the Continue button
#    And I tapped reason and entered the reason open check discount
#    And I click "Hide keyboard" button in the keyboard "Click Back"
#    And I selected the apply button
#    And Verify If Tax Is Calculated Properly And Calculate RoundOff for Open Discount "14.55" Inclusive "0.17620" Amount BT
#    And Verify if the balance due amount is displayed correctly
#    And Verify if the balance due amount is displayed correctly after the payment
#    And I click log off button in order screen

#  @setfour
  @basicTaxScenarios
  Scenario: Check RoundOff value for menu item (exclusive tax) along with modifier (exclusive tax) applying open item discount (amount BT)
    And I have selected category arrow
#    And Select the category Food items
    And Select the category "FOOD ITEMS"
    And Select the menu item "testing menu33"
    And I selected the modifier "Bbq"
#    And I click Done button on the open item window
    And I selected menu options
    And I selected Open Discount
    And I tapped the amount field
    And I entered the discount amount
    And I selected the Continue button
    And I tapped reason and entered the reason
#    And I click "Hide keyboard" button in the keyboard "Click Back"
    And I selected the apply button
    And Verify if exclusive tax menu "0.05623" exclusive tax modifier "0.10255" and discount "14.55" are calculated properly
    And Verify if the balance due amount is displayed correctly
    And Verify if the balance due amount is displayed correctly after the payment
    And I click log off button in order screen

#  @setfour
  @basicTaxScenarios
  Scenario: Check RoundOff value for menu item (inclusive tax) along with modifier (inclusive tax) applying open item discount (amount BT)
    And I have selected category arrow
    And Select the category "Chinese"
    And Select the sub category "NoTVeg"
    And Select the menu item "testing menu34"
    And I selected the modifier2 "CHEESE"
#    And I click Done button on the open item window
    And I selected menu options
    And I selected Open Discount
    And I tapped the amount field
    And I entered the discount amount
    And I selected the Continue button
    And I tapped reason and entered the reason
#    And I click "Hide keyboard" button in the keyboard "Click Back"
    And I selected the apply button
    And Verify if inclusive tax menu "0.35000" inclusive tax modifier "0.08655" and discount "14.55" are calculated properly
    And Verify if the balance due amount is displayed correctly
    And Verify if the balance due amount is displayed correctly after the payment
    And I click log off button in order screen

   #NOTIMPLEMENTEDINWEBPOS
  @basicTaxScenarios
  Scenario: Check RoundOff value for menu item (exclusive tax) along with modifier (exclusive tax) applying open item discount (amount BT) with include additional modifiers toggle disabled
    And I have selected category arrow
    And Select the category "FOOD ITEMS"
    And Select the menu item "testing menu33"
    And I selected the modifier "Bbq"
    #And I click Done button on the open item window
    And I selected menu options
    And I selected Open Discount
    And I tapped the amount field
    And I entered the discount amount
    And I selected the Continue button
    And I tapped reason and entered the reason
#    And I click "Hide keyboard" button in the keyboard "Click Back"
    And I selected the apply button
    And Verify if exclusive tax menu "0.05623" exclusive tax modifier "0.10255" and discount amount "14.55" are calculated properly toggle disabled
    And Verify if the balance due amount is displayed correctly
    And Verify if the balance due amount is displayed correctly after the payment
    And I click log off button in order screen

    #NOTIMPLEMENTEDINWEBPOS
  @aa989
  Scenario: Check RoundOff value for menu item (inclusive tax) along with modifier (inclusive tax) applying open item discount (amount BT) with include additional modifiers toggle disabled
    And I have selected category arrow
    And Select the category "Chinese"
    And Select the sub category ""NoTVeg"
    And Select the menu item "testing menu34"
    And I selected the modifier "CHEESE"
    And I click Done button on the open item window
#    And I click Done button on the open item window
    And I selected menu options
    And I selected Open Discount
    And I tapped the amount field
    And I entered the discount amount
    And I selected the Continue button
    And I tapped reason and entered the reason
    And I click "Hide keyboard" button in the keyboard "Click Back"
    And I selected the apply button
    And Verify if inclusive tax menu "0.35000" inclusive tax modifier "0.08655" and discount amount "14.55" are calculated properly toggle disabled
    And Verify if the balance due amount is displayed correctly
    And Verify if the balance due amount is displayed correctly after the payment
    And I click log off button in order screen


  @basicTaxScenarios
  Scenario: Check RoundOff value for menu item ($0) along with modifier (exclusive tax)
    And I have selected category arrow
    And Select the category "Drink"
    And Select the menu item "testing menu35"
    And I selected the modifier2 "Modifier1"
#    And I click Done button on the open item window
    And Verify If Inc Tax "0" and exclusive modifier tax "0.07000" are Calculated Properly And Calculate RoundOff for item discount after tax Exclusive
    And Verify if the balance due value is calculated correctly
    And Verify if the balance due value is displayed correctly after payment
    And I click log off button in order screen

    @basicTaxScenarios
  Scenario: LIN-21678 - Combo - Unable to get menu items (Exclusive)
    And I have selected category arrow
    And Select the category "COMBO"
    And Select the menu item "Pizza Combo"
    And Select the combo menu item "testing menu12"
    And Select the combo menu item "testing menu17"
    And I click Done button on the open item window
    And Verify if exclusive taxes "0.12000" and "0.10255" are calculated properly and calculate roundoff when combo discount "0.1222" is applied
    And I selected order button
    And Verify if the balance due amount is displayed correctly
    And Verify if the balance due value is displayed correctly after payment
    And I click log off button in order screen

  @basicTaxScenarios
  Scenario: LIN-21678 - Combo - Unable to get menu items (Inclusive)
    And I have selected category arrow
    And Select the category "COMBO"
    And Select the menu item "Pasta Combo"
    And Select the combo menu item "testing menu18"
    And Select the combo menu item "testing menu11"
    And I click Done button on the open item window
    And I click Done button on the open item window
    And Verify if inclusive taxes "0.17620" and "0.14770" are calculated properly and calculate roundoff when combo discount "0.3232" is applied
    And I selected order button
    And Verify if the balance due amount is displayed correctly
    And Verify if the balance due amount is displayed correctly after the payment
    And I click log off button in order screen

#  Scenario: Check RoundOff value for menu item with exclusive tax with check discount
#    And I have selected category arrow
#    And Select the category Food items
#    And I selected the menu item "Pizza Supreme"
#    And I select modifier as "inclusiveModi2"
#    And I click Done to get back
#    And I selected the menu item "Pizza Dominator"
#    And Select the menu items with exclusive tax with check discount
#    And Apply the check discount "check discount 24%"
#    And Verify if tax is calculated properly "0.24" "0.10255" "0.0622" and calculate roundOff for check discount exclusive
#    And Verify if exclusive tax menu "0.10255" "0.0622" exclusive tax modifier "0.10255" and discount "7.50" are calculated properly
#    And Verify if the balance due amount is displayed correctly
#    And Verify if the balance due amount is displayed correctly after the payment
#    And I click log off button in order screen

 #NOTIMPLEMENTEDINWEBPOS
#  Scenario: Check RoundOff value for menu item (exclusive tax) when check discount (before tax) and open check discount (after tax) are applied.
#    And I have selected category arrow
#    And Select the category "COMBO"
#    And Select the menu item "testing menu9"
#    And Apply the check discount "Disc 7.50"
#    And Verify if tax is calculated properly "7.50" "0.10255" and calculate roundOff for check discount exclusive amount
#    And Select the option button
#    And Select the discount button
#    And Select the open check discount button
#    And I selected Open Discount
#    And I tapped the amount field open check discount
#    And I entered the discount amount
#    And I selected the Continue button
#    And I tapped reason and entered the reason open check discount
#    And I click "Hide keyboard" button in the keyboard "Click Back"
#    And I selected After Tax option
#    And I selected the apply button
#    And Verify If Tax Is Calculated Properly And Calculate RoundOff for Open Discount "7.50" Exclusive "0.10255" Amount BT
#  #And Verify If Tax Is Calculated Properly And Calculate RoundOff for Open Discount "14.55" when check discount "7.50" BT is applied already Exclusive "0.10255" Amount BT
#    And Verify if the balance due amount is displayed correctly
#    And Verify if the balance due amount is displayed correctly after the payment
#    And I click log off button in order screen

  @basicTaxScenarios
  Scenario: LIN-21716 Total amount shows wrong when user apply combo discount exclusive
    And I have selected category arrow
    And Select the category "COMBO"
    And Select the menu item "Food Item Combo"
    And Select the combo menu item "menu 10.10"
    And Select the combo menu item "menu 20"
    And Select the combo menu item "menu 30"
    And Select the combo menu item "menu 40"
    And I click Done button on the open item window
    And Verify if exclusive tax menu "0.10110" and combo discount set price "29" are calculated properly
    And Verify if the balance due amount is displayed correctly
    And Verify if the balance due amount is displayed correctly after the payment
    And I click log off button in order screen

  @basicTaxScenarios
  Scenario: LIN-21716 Total amount shows wrong when user apply combo discount inclusive
    And I have selected category arrow
    And Select the category "COMBO"
    And Select the menu item "Drink Item Combo"
    And Select the combo menu item "drink 10"
    And Select the combo menu item "drink 20"
    And Select the combo menu item "drink 30"
    And Select the combo menu item "drink 40"
    And I click Done button on the open item window
    And Verify if inclusive tax menu "0.11110" and combo discount set price "29" are calculated properly
    And Verify if the balance due amount is displayed correctly
    And Verify if the balance due amount is displayed correctly after the payment
    And I click log off button in order screen

  @basicTaxScenarios3
  Scenario: Tax roundoff with exclusive menu item when multiple item discounts are applied (percentage - before tax)
    And I have selected category arrow
    And Select the category "FOOD ITEMS"
    And Select the menu item "testing menu9"
    And I click Discount as "20% Discount"
    And I selected cancel button
    And I click Discount as "30% Discount"
    And I selected cancel button
    And Verify if exclusive tax "0.10255" is calculated properly when item discounts "0.20" and "0.30" are applied and calculate round-off
    And Verify if the balance due amount is displayed correctly
    And Verify if the balance due amount is displayed correctly after the payment
    And I click log off button in order screen

  @basicTaxScenarios3
  Scenario: Tax roundoff with exclusive menu item when multiple item discounts are applied (amount - before tax)
    And I have selected category arrow
    And Select the category "FOOD ITEMS"
    And Select the menu item "testing menu9"
    And I click Discount as "8$ d"
    And I selected cancel button
    And I click Discount as "12$ d"
    And I selected cancel button
    And Verify if exclusive tax "0.10255" is calculated properly when item discounts amount "8.00" and "12.00" are applied and calculate round-off
    And Verify if the balance due amount is displayed correctly
    And Verify if the balance due amount is displayed correctly after the payment
    And I click log off button in order screen

  @basicTaxScenarios3
  Scenario: Tax roundoff with exclusive menu item when multiple item discounts are applied (percentage - after tax)
    And I have selected category arrow
    And Select the category "FOOD ITEMS"
    And Select the menu item "testing menu9"
    And I click Discount as "20% AT"
    And I selected cancel button
    And I click Discount as "30% AT"
    And I selected cancel button
    And Verify if exclusive tax "0.10255" is calculated properly when item discounts "0.20" and "0.30" are applied and calculate round-off after tax
    And Verify if the balance due amount is displayed correctly
    And Verify if the balance due amount is displayed correctly after the payment
    And I click log off button in order screen

  @basicTaxScenarios3
  Scenario: Tax roundoff with exclusive menu item when multiple item discounts are applied (amount - after tax)
    And I have selected category arrow
    And Select the category "DRINKS"
    And Select the menu item "testing menu36"
    And I click Discount as "11$ AT"
    And I selected cancel button
    And I click Discount as "14$ AT"
    And I selected cancel button
    And Verify if exclusive tax "0.17174" is calculated properly when item discounts amount after tax "11.00" and "14.00" are applied and calculate round-off
    And Verify if the balance due amount is displayed correctly
    And Verify if the balance due amount is displayed correctly after the payment
    And I click log off button in order screen

  @basicTaxScenarios3
  Scenario: Tax roundoff with exclusive menu item when multiple check discounts are applied
    And I have selected category arrow
    And Select the category "DRINKS"
    And Select the menu item "testing menu37"
    And I click Discount as "check 20%"
    And I selected cancel button
    And I click Discount as "check 30%"
    And I selected cancel button
    And Verify if exclusive tax "0.17174" is calculated properly when check discounts "0.20" and "0.30" are applied and calculate round-off
    And Verify if the balance due amount is displayed correctly
    And Verify if the balance due amount is displayed correctly after the payment
    And I click log off button in order screen

  @basicTaxScenarios3
  Scenario: Tax roundoff with exclusive menu item when multiple check discounts are applied amount
    And I have selected category arrow
    And Select the category "DRINKS"
    And Select the menu item "testing menu37"
    And I click Discount as "check 38.38$"
    And I selected cancel button
    And I click Discount as "check 18.18$"
    And I selected cancel button
    And Verify if exclusive tax "0.17174" is calculated properly when item discounts amount "38.38" and "18.18" are applied and calculate round-off
    And Verify if the balance due amount is displayed correctly
    And Verify if the balance due amount is displayed correctly after the payment
    And I click log off button in order screen

  @basicTaxScenarios3
  Scenario: Tax roundoff with exclusive menu item when multiple check discounts are applied percentage AT
    And I have selected category arrow
    And Select the category "DRINKS"
    And Select the menu item "testing menu37"
    And I click Discount as "27.27% check AT"
    And I selected cancel button
    And I click Discount as "22.22% check AT"
    And I selected cancel button
    And Verify if exclusive tax "0.17174" is calculated properly when item discounts "0.2727" and "0.2222" are applied and calculate round-off after tax
    And Verify if the balance due amount is displayed correctly
    And Verify if the balance due amount is displayed correctly after the payment
    And I click log off button in order screen

  @basicTaxScenarios3
  Scenario: Tax roundoff with exclusive menu item when multiple check discounts are applied amount AT
    And I have selected category arrow
    And Select the category "DRINKS"
    And Select the menu item "Butter Fruit"
    And I click Discount as "8.8$ check AT"
    And I selected cancel button
    And I click Discount as "4.4$ check AT"
    And I selected cancel button
    And Verify if exclusive tax "0.17174" is calculated properly when item discounts amount after tax "8.80" and "4.40" are applied and calculate round-off
    And Verify if the balance due amount is displayed correctly
    And Verify if the balance due amount is displayed correctly after the payment
    And I click log off button in order screen

  @basicTaxScenarios3
  Scenario: Tax roundoff with exclusive menu item when multiple mix and match discounts are applied set price BT
    And I have selected category arrow
    And Select the category "DRINKS"
    And Select the menu item "Butter Fruit"
    And I click Discount as "mix and 1"
    And I selected cancel button
    And I click Discount as "mix and 2"
    And I selected cancel button
    And Verify exc tax "0.17174" when multiple mix and match discounts set price are applied "120.00" and "100.00"
    And Verify if the balance due amount is displayed correctly
    And Verify if the balance due amount is displayed correctly after the payment
    And I click log off button in order screen

  @basicTaxScenarios3
  Scenario: Tax roundoff with exclusive menu item when multiple mix and match discounts are applied set price AT
    And I have selected category arrow
    And Select the category "DRINKS"
    And Select the menu item "Butter Fruit"
    And I click Discount as "Mix1 AT"
    And I selected cancel button
    And I click Discount as "Mix2 AT"
    And I selected cancel button
    And Verify exc tax "0.17174" when multiple mix and match discounts set price after tax are applied "120.00" and "100.00"
    And Verify if the balance due amount is displayed correctly
    And Verify if the balance due amount is displayed correctly after the payment
    And I click log off button in order screen

  @basicTaxScenarios3
  Scenario: Tax roundoff with inclusive menu item when multiple mix and match discounts are applied set price BT
    And I have selected category arrow
    And Select the category "DRINKS"
    And Select the menu item "Dragon Fruit"
    And I click Discount as "mix and 1"
    And I selected cancel button
    And I click Discount as "mix and 2"
    And I selected cancel button
    And Verify inc tax "0.14140" when multiple mix and match discounts set price are applied "120.00" and "100.00"
    And Verify if the balance due amount is displayed correctly
    And Verify if the balance due amount is displayed correctly after the payment
    And I click log off button in order screen

  @basicTaxScenarios3
  Scenario: Tax roundoff with inclusive menu item when multiple mix and match discounts are applied set price AT
    And I have selected category arrow
    And Select the category "DRINKS"
    And Select the menu item "Dragon Fruit"
    And I click Discount as "Mix1 AT"
    And I selected cancel button
    And I click Discount as "Mix2 AT"
    And I selected cancel button
    And Verify inc tax "0.14140" when multiple mix and match discounts set price are applied after tax "120.00" and "100.00"
    And Verify if the balance due amount is displayed correctly
    And Verify if the balance due amount is displayed correctly after the payment
    And I click log off button in order screen

  @basicTaxScenarios3
  Scenario: Tax roundoff with exclusive menu item when multiple mix and match discounts are applied percentage BT
    And I have selected category arrow
    And Select the category "DRINKS"
    And Select the menu item "Butter Fruit"
    And I click Discount as "Mix 10.12%"
    And I selected cancel button
    And I click Discount as "Mix 6.34%"
    And I selected cancel button
    And Verify exc tax "0.17174" when multiple mix and match discounts percentage are applied "10.12" and "6.34"
    And Verify if the balance due amount is displayed correctly
    And Verify if the balance due amount is displayed correctly after the payment
    And I click log off button in order screen

  @basicTaxScenarios3
  Scenario: Tax roundoff with exclusive menu item when multiple mix and match discounts are applied percentage AT
    And I have selected category arrow
    And Select the category "DRINKS"
    And Select the menu item "Butter Fruit"
    And I click Discount as "Mix 13.11% AT"
    And I selected cancel button
    And I click Discount as "Mix 21.11% AT"
    And I selected cancel button
    And Verify exc tax "0.17174" when multiple mix and match discounts percentage are applied AT "13.11" and "21.11"
    And Verify if the balance due amount is displayed correctly
    And Verify if the balance due amount is displayed correctly after the payment
    And I click log off button in order screen

  @basicTaxScenarios
  Scenario: Verify if modifier price is displayed correctly if menu quantity is increased (set tiered price present for modifier).
    And I have selected category arrow
    And Select the category "Tiered Price"
    And Select the menu item "Tiered menu1"
    And I selected the modifier2 "Lettuce Veg"
    And I verify if the modifier price "0.00" is correct for the first modifier
#    And Verify If Exc Tax "0.10000" and inclusive modifier tax "0.10000" are Calculated Properly And Calculate RoundOff for item discount after tax Exclusive
    And Verify if the ExcTax "0.10000" is calculated correctly
    And I selected the modifier2 "Lettuce Veg"
    And I verify if the modifier price "2.00" is correct for the second modifier
    And I reduced one quantity of the modifier
    And I verify if the modifier price "0.00" is correct for the first modifier
    And I click Done button on the open item window
    And I selected quantity as "2"
    And I verify if the modifier price "0.00" is correct for the first modifier
    And I selected quantity as "9"
    And I verify if the modifier price "0.00" is correct for the first modifier
    And I selected quantity as "2"
    And I verify if the modifier price "0.00" is correct for the first modifier
    And Verify If Exc Tax "0.10000" and inclusive modifier tax "0.10000" are Calculated Properly And Calculate RoundOff for item discount after tax Exclusive
    And Verify if the balance due value is calculated correctly
    And Verify if the balance due value is displayed correctly after payment
    And I click log off button in order screen

  @basicTaxScenarios
  Scenario: Verify if modifier price is displayed correctly if modifier quantity is increased (set tiered price -> First 2 modifiers -> 2$ ALL).
    And I have selected category arrow
    And Select the category "Tiered Price"
    And Select the menu item "Tiered Price2"
    And Verify if the ExcTax "0.10000" is calculated correctly
    And I selected the modifier "Lettuce Veg"
    And I verify if the modifier price "2.00" is correct for the first modifier
    And I selected the modifier "Lettuce Veg"
    And I verify if the modifier price "2.00" is correct for the second modifier
    And I click Done button on the open item window
    And Verify If Exc Tax "0.10000" and inclusive modifier tax "0.10000" are Calculated Properly And Calculate RoundOff for item discount after tax Exclusive
    And Verify if the balance due value is calculated correctly
    And Verify if the balance due value is displayed correctly after payment
    And I click log off button in order screen

    #NOTIMPLEMENTEDINWEBPOS
#  Scenario: Check RoundOff value for menu item (exclusive tax) when check discount 50% (before tax) and open check discount 100% (before tax) are applied.
#    And I have selected category arrow
#    And Select the category as "Tiered Price"
#    And I selected the menu item "Tiered menu1"
#    And Verify if the ExcTax "0.10000" is calculated correctly
#    And I selected the modifier "Lettuce Veg"
#    And I click Done button on the open item window
#    And Apply the check discount "50% CD"
#    And Verify if tax is calculated properly and calculate roundOff for check discount "0.50" exclusive "0.1"
#    And Select the option button
#    And Select the discount button
#    And Select the open check discount button
#    And I selected Open Discount
#    And I tapped the percentage field open check
#    And I entered the discount percentage as 100
#    And I selected the Continue button
#    And I tapped reason and entered the reason open check discount
#    And I click "Hide keyboard" button in the keyboard "Click Back"
#    And I selected the apply button
#    And Verify if tax is calculated properly and calculate roundOff for check discount "1.00" exclusive "0.10"
#    And Verify if the discount is calculated correctly after 100 percent discount is applied
#    #And Verify If Tax Is Calculated Properly And Calculate RoundOff for Open Discount "14.55" when check discount "7.50" BT is applied already Exclusive "0.10255" Amount BT
#    And Verify if the balance due amount is displayed correctly
#    And Verify if the balance due amount is displayed correctly after the payment
#    And I click log off button in order screen

  @basicTaxScenarios
  Scenario: Check RoundOff value for menu item (exclusive tax) when check discount 50% (before tax) and open item discount 100% (before tax) are applied.
    And I have selected category arrow
    And Select the category "IceCreams"
    And Select the menu item "Choco Dip"
    And Verify if the ExcTax "0.10000" is calculated correctly
     #And I selected the modifier "Lettuce Veg"
     #And I click Done button on the open item window
    And I click Discount as "50% CD"
    And I selected cancel button
    And Verify if tax is calculated properly and calculate roundOff for check discount "0.50" exclusive "0.1"
    And I selected menu options
    And I selected Open Discount
    And I tapped the percentage field
    And I entered the discount percentage as 100
    And I selected the Continue button
    And I tapped reason and entered the reason
#    And I click "Hide keyboard" button in the keyboard "Click Back"
    And I selected the apply button
    And Verify if tax is calculated properly and calculate roundOff for check discount "1.00" exclusive "0.10"
    And Verify if the discount is calculated correctly after 100 percent discount is applied
        #And Verify If Tax Is Calculated Properly And Calculate RoundOff for Open Discount "14.55" when check discount "7.50" BT is applied already Exclusive "0.10255" Amount BT
    And Verify if the balance due amount is displayed correctly
    And Verify if the balance due amount is displayed correctly after the payment
    And I click log off button in order screen

    #NOTIMPLEMENTEDINWEBPOS
#  Scenario: Check RoundOff value for menu item (exclusive tax) when item discount 50% (before tax) and open check discount 100% (before tax) are applied.
#    And I have selected category arrow
#    And Select the category as "Tiered Price"
#    And I selected the menu item "Tiered menu1"
#    And Verify if the ExcTax "0.10000" is calculated correctly
#    And I selected the modifier "Lettuce Veg"
#    And I click Done button on the open item window
#    And Apply the item discount "50% ID"
#    And Verify if tax is calculated properly and calculate roundOff for check discount "0.50" exclusive "0.1"
#    And Select the option button
#    And Select the discount button
#    And Select the open check discount button
#    And I selected Open Discount
#    And I tapped the percentage field open check
#    And I entered the discount percentage as 100
#    And I selected the Continue button
#    And I tapped reason and entered the reason open check discount
#    And I click "Hide keyboard" button in the keyboard "Click Back"
#    And I selected the apply button
#    And Verify if tax is calculated properly and calculate roundOff for check discount "1.00" exclusive "0.10"
#    And Verify if the discount is calculated correctly after 100 percent discount is applied
#  #And Verify If Tax Is Calculated Properly And Calculate RoundOff for Open Discount "14.55" when check discount "7.50" BT is applied already Exclusive "0.10255" Amount BT
#    And Verify if the balance due amount is displayed correctly
#    And Verify if the balance due amount is displayed correctly after the payment
#    And I click log off button in order screen

    #NOTIMPLEMENTEDINWEBPOS
#  Scenario: Check RoundOff value for menu item (exclusive tax) when open item discount 50% (before tax) and open check discount 100% (before tax) are applied.
#    And I have selected category arrow
#    And Select the category as "IceCreams"
#    And I selected the menu item "Choco Dip"
#    And Verify if the ExcTax "0.10000" is calculated correctly
#    And I selected menu options
#    And I selected Open Discount
#    And I tapped the percentage field
#    And I entered the discount percentage as "5" "0" "0" "0"
#    And I selected the Continue button
#    And I tapped reason and entered the reason
#    And I click "Hide keyboard" button in the keyboard "Click Back"
#    And I selected the apply button
#    And Verify if tax is calculated properly and calculate roundOff for check discount "0.50" exclusive "0.1"
#    And Select the option button
#    And Select the discount button
#    And Select the open check discount button
#    And I selected Open Discount
#    And I tapped the percentage field open check
#    And I entered the discount percentage as 100
#    And I selected the Continue button
#    And I tapped reason and entered the reason open check discount
#    And I click "Hide keyboard" button in the keyboard "Click Back"
#    And I selected the apply button
#    And Verify if tax is calculated properly and calculate roundOff for check discount "1.00" exclusive "0.10"
#    And Verify if the discount is calculated correctly after 100 percent discount is applied
#      #And Verify If Tax Is Calculated Properly And Calculate RoundOff for Open Discount "14.55" when check discount "7.50" BT is applied already Exclusive "0.10255" Amount BT
#    And Verify if the balance due amount is displayed correctly
#    And Verify if the balance due amount is displayed correctly after the payment
#    And I click log off button in order screen

  @basicTaxScenarios
  Scenario: Check RoundOff value for menu item (exclusive tax) when check discount 100% (before tax) and item discount 50% (before tax) are applied.
    And I have selected category arrow
    And Select the category "IceCreams"
    And Select the menu item "Choco Dip"
    And Verify if the ExcTax "0.10000" is calculated correctly
    And I click Discount as "100% CD"
    And I selected cancel button
    And Verify if tax is calculated properly and calculate roundOff for check discount "1.0" exclusive "0.1"
    And I click Discount as "50% ID"
    And I selected cancel button
    And Verify if the discount is calculated correctly after 100 percent discount is applied
    And Verify if the balance due amount is displayed correctly
    And Verify if the balance due amount is displayed correctly after the payment done
    And I click log off button in order screen

  @basicTaxScenarios
  Scenario: Check RoundOff value for menu item (exclusive tax) when mix and match discount 50% (before tax) and mix & match discount 100% (before tax) are applied.
    And I have selected category arrow
    And Select the category "IceCreams"
    And Select the menu item "Choco Dip"
    And Verify if the ExcTax "0.10000" is calculated correctly
    And I click Discount as "Mix 50%"
    And I selected cancel button
    And Verify if tax is calculated properly and calculate roundOff for check discount "0.50" exclusive "0.10"
    And I click Discount as "Mix 100%"
    And I selected cancel button
    And Verify if tax is calculated properly and calculate roundOff for check discount "1.00" exclusive "0.10"
    And Verify if the discount is calculated correctly after 100 percent discount is applied
    And Verify if the balance due amount is displayed correctly
    And Verify if the balance due amount is displayed correctly after the payment done
    And I click log off button in order screen

  @basicTaxScenarios
  Scenario: Check RoundOff value for menu item (exclusive tax) when item discount 50% (before tax) and item discount 100% (before tax) are applied.
    And I have selected category arrow
    And Select the category "IceCreams"
    And Select the menu item "Choco Dip"
    And Verify if the ExcTax "0.10000" is calculated correctly
    And I click Discount as "50% ID"
    And I selected cancel button
    And Verify if tax is calculated properly and calculate roundOff for check discount "0.50" exclusive "0.10"
    And I click Discount as "100% ID"
    And I selected cancel button
    And Verify if tax is calculated properly and calculate roundOff for check discount "1.00" exclusive "0.10"
    And Verify if the discount is calculated correctly after 100 percent discount is applied
    And Verify if the balance due amount is displayed correctly
    And Verify if the balance due amount is displayed correctly after the payment done
    And I click log off button in order screen

  @basicTaxScenarios
  Scenario: Check RoundOff value for menu item (exclusive tax) when check discount 50% (before tax) and check discount 100% (before tax) are applied.
    And I have selected category arrow
    And Select the category "IceCreams"
    And Select the menu item "Choco Dip"
    And Verify if the ExcTax "0.10000" is calculated correctly
    And I click Discount as "50% CD"
    And I selected cancel button
    And Verify if tax is calculated properly and calculate roundOff for check discount "0.50" exclusive "0.10"
    And I click Discount as "100% CD"
    And I selected cancel button
    And Verify if tax is calculated properly and calculate roundOff for check discount "1.00" exclusive "0.10"
    And Verify if the discount is calculated correctly after 100 percent discount is applied
    And Verify if the balance due amount is displayed correctly
    And Verify if the balance due amount is displayed correctly after the payment done
    And I click log off button in order screen

    #NOTIMPLEMENTEDINWEBPOS
#  Scenario: Select the prefix of the modifier after applying open discount -> LIN-22629
#    And I have selected category arrow
#    And Select the category "IceCreams"
#    And Select the menu item "Pista IceCream"
##    And I selected the modifier "Choco strings"
#    And I click Done button on the open item window
#    And Select the option button
#    And Select the discount button
#    And Select the open check discount button
#    And I selected Open Discount
#    And I tapped the amount field open check discount
#    And I entered the discount amount
#    And I selected the Continue button
#    And I tapped reason and entered the reason open check discount
##    And I click "Hide keyboard" button in the keyboard "Click Back"
#    And I selected the apply button
#    And Verify If Tax Is Calculated Properly And Calculate RoundOff for Open Discount "14.55" Exclusive "0.08888" Amount BT
#    And Select the category as "IceCreams"
#    And I selected the menu item "Pista IceCream"
#    And I selected the modifier "Choco strings"
#    And I selected the modifier "EXTRA"
#    And I click Done button on the open item window
##    And Verify If Tax Is Calculated Properly And Calculate RoundOff for Open Discount "14.55" Exclusive "0.08888" Amount BT
#    And Verify if the balance due amount is displayed correctly
#    And Verify if the balance due amount is displayed correctly after the payment
#    And I click log off button in order screen

  @basicTaxScenarios
  Scenario: Unable to apply Open Item Discount when multiple seats are there and check level view is selected -> LIN-22629
    And I have selected category arrow
    And Select the category "IceCreams"
    And Select the menu item "Pista IceCream"
    #And I selected the modifier "Choco strings"
    And I click Done button on the open item window
    And I selected menu options
    And I selected Open Discount
    And I tapped the percentage field
    And I entered the discount percentage
    And I selected the Continue button
    And I tapped reason and entered the reason
#    And I click "Hide keyboard" button in the keyboard "Click Back"
    And I selected the apply button
    And Verify If Tax "0.1345" Is Calculated Properly And Calculate RoundOff for Open Discount "0.08888" Exclusive
    And I added another seat
    And I have selected category arrow
    And Select the category "IceCreams"
    And Select the menu item "Pista IceCream"
#    And I selected the modifier "Choco strings"
    And I click Done button on the open item window
    And I selected the QSR button
    And I selected menu options2 discount
    And I selected Open Discount
    And I tapped the percentage field
    And I entered the discount percentage
    And I selected the Continue button
    And I tapped reason and entered the reason
#    And I click "Hide keyboard" button in the keyboard "Click Back"
    And I selected the apply button
    And Verify If Tax "0.1345" Is Calculated Properly And Calculate RoundOff for Open Discount "0.08888" Exclusive
    And Verify if the balance due amount is displayed correctly
    And Verify if the balance due amount is displayed correctly after the payment
    And I click log off button in order screen

#  Scenario: Application shows "You need to at least pick 1 modifier" error in the following scenario -> LIN-22412
#    And I have selected category arrow
#    And Select the category as "IceCreams"
#    And I selected the menu item "Gud Bud"
#    And I selected the modifier "CHEESE"
#    And I reduced one quantity of the modifier

  @basicTaxScenarios
  Scenario: Check Tax is calculated wrongly when menu is placed along with modifiers and if discount is applied -> LIN-22203
    And I have selected category arrow
    And Select the category "IceCreams"
    And Select the menu item "Tuity fruity"
    And Check the amount of menu item "300.00"
    And I selected the modifier2 "Mango Pulp"
    And I click Discount as "20% Item Discount"
    And I selected cancel button
#    And Verify if exclusive tax menu "0.05555" exclusive tax modifier "0.07777" and discount "0.20" are calculated properly
    And Verify if exclusive tax menu "0.05555" exclusive tax modifier "0.07777" check tax "0.12444" and discount "0.20" are calculated properly
    And Verify if the balance due amount is displayed correctly
    And Verify if the balance due amount is displayed correctly after the payment
    And I click log off button in order screen

    @cod
  Scenario: Combo discount is not working when we have menu item with mandatory modifier in the match -> LIN-22328
    And I have selected category arrow
      And Select the category "COMBO"
      And Select the menu item "Ice Cream Combo"
    And Select the combo menu item "Orange Blast"
    And I selected the modifier2 "Orange Pulp"
    And I click Done button on the open item window
    And I click Done button on the open item window
    And Verify if exclusive tax menu "0.05555" exclusive tax modifier "0.02121" and percentage discount "0.3333" are calculated properly
    And Verify if the balance due amount is displayed correctly
    And Verify if the balance due amount is displayed correctly after the payment
    And I click log off button in order screen

#  Scenario: Tax RoundOff for Display group exclusive tax menu item
#    And I have selected category arrow
#    And Select the category as "COMBO"
#    And I selected the menu item ""

#  Scenario: Prefixes displaying even the modifier got removed when the menu item enabled the conversational toggle. -> LIN-22207
#    And I have selected category arrow
#    And Select the category as "IceCreams"
#    And I selected the menu item "Mango Delight"
#    And I selected the modifier "Pineapple Pulp"
#    And I reduced one quantity of the modifier


#  Scenario: Application shows "You need to at least pick 1 modifier" error in the following scenario -> LIN-22412
#    And I have selected category arrow
#    And Select the category as "PIZZA"
#    And I selected the menu item "PEPPERONI PIZZA"
#    And I selected the modifier "CHEESE"
#    And I reduced one quantity of the modifier


#  Scenario: If Modifier has No default Price amount - but as per the Set tiered price Modifier amount not getting updated -> LIN-22380
#    And I have selected category arrow
#    And Select the category as "Tiered Price"
#    And I selected the menu item "Chicken Teriyaki Sub"
#    And Verify if the ExcTax "0.10000" is calculated correctly
#    And I selected the modifier "Lettuce Veg"
#    And I verify if the modifier price "2.00" is correct for the first modifier
#    And I selected the modifier "Lettuce Veg"
#    And I verify if the modifier price "2.00" is correct for the second modifier
#    And I click Done button on the open item window
#    And Verify If Exc Tax "0.10000" and inclusive modifier tax "0.10000" are Calculated Properly And Calculate RoundOff for item discount after tax Exclusive
#    And Verify if the balance due value is calculated correctly
#    And Verify if the balance due value is displayed correctly after payment
#    And I click log off button in order screen

  @SOB
  Scenario: TS-10 -> Check tax missing while user click start over in the modifier selection screen
    And I have selected category arrow
    And Select the category "IceCreams"
    And Select the menu item "Pan IceCream"
    And Verify if the CheckTax is calculated correctly and calculate round-off
    And I click Start Over button on the open item window
#    And Select the menu item with check tax
    And I click Done button on the open item window
    And Verify if the CheckTax is calculated correctly and calculate round-off
    And Verify if the total value is calculated correctly
    And Verify if the balance due value is calculated correctly
    And Verify if the balance due value is displayed correctly after payment
    And I click log off button in order screen

@dddr
    Scenario: TS-11 -> Open Discount not shows while reopening the check & hence shows Balance due
      And I get check number
      And I have selected category arrow
      And Select the category "FOOD ITEMS"
      And Select the menu item "testing menu15"
      And I selected menu options
      And I selected Open Discount
      And I tapped the percentage field
      And I entered the discount percentage
      And I selected the Continue button
      And I tapped reason and entered the reason
#    And I click "Hide keyboard" button in the keyboard "Click Back"
      And I selected the apply button
      And Verify If Tax "0.1345" Is Calculated Properly And Calculate RoundOff for Open Discount "0.10255" Exclusive
      And Verify if the total amount is calculated correctly for exclusive open discount
      And Verify if the balance due amount is displayed correctly
      And Verify if the balance due amount is displayed correctly after the payment
      And Select the All option
#    And I click Check Stats tab
      And I click Closed tab on the Check stats
      Then I should see closed check in closed check tab
      And I click reopen check button on the check stats screen
      And Verify If Tax "0.1345" Is Calculated Properly And Calculate RoundOff for Open Discount "0.10255" Exclusive
      And Verify if the total amount is calculated correctly for exclusive open discount
      And Verify if the balance due amount is displayed correctly reopen payment done already
      And I Selected submit button
      And I click log off button in order screen

  @tic1
  Scenario: TS-12 -> Unable to change the serving size after place menu item, its added new on the selection
    And I have selected category arrow
    And Select the category "PIZZA"
    And Select the menu item "PEPPERONI PIZZA"
    And I selected the serving size as "MEDIUM"
#    And I selected the modifier2 "CHEESE"
#    And I selected the modifier2 "GREEN PEPPER"
    And I click Done button on the open item window
    And I selected menu options
    And I selected the back button
    And I selected the serving size as "SMALL"
    And I click Done button on the open item window
#    And I selected cancel button
    And Verify if exclusive tax "0.05623" is calculated properly and calculate roundoff
    And Verify if the total value is calculated correctly
    And Verify if the balance due value is calculated correctly
    And Verify if the balance due value is displayed correctly after payment
    And I click log off button in order screen

@tic
  Scenario: TS-4 -> Unable to apply the item discount for special menu item
    And I have selected category arrow
    And Select the category "PIZZA"
    And Select the menu item "Special Combo Menu"
    And Select the menu item "pizza supreme"
    And Select the menu item "pizza dominator"
#    And Apply the check discount "check discount 24%"
    And I click Discount as "20% Discount"
    And I selected cancel button
    And Verify if tax "0.20" "0.0622" is calculated properly and calculate round-off
    And Verify if the total amount is calculated correctly
    And Verify if the balance due amount is calculated correctly
    And Verify if the balance due amount is displayed correctly after payment
    And I click log off button in order screen

  @disc20
  Scenario: TS-14 -> Unable to add discount again while void the menu item partially
    And I have selected category arrow
    And Select the category "FOOD ITEMS"
    And Select the menu item "testing menu33"
    And I selected the modifier "Bbq"
    And I click Done button on the open item window
    And I selected quantity as "5"
    And I click Discount as "20% Discount"
    And I selected cancel button
    And I selected order button
    And I selected menu options
    And I selected void button in menu options
    And I selected void quantity as "2"
    And Select the Void item reason as "Server Error"
    And Verify if tax "0.20" "0.05623" is calculated properly and calculate round-off
    And I click Discount as "20% Discount"
    And I selected cancel button
    And I click Discount as "20% Discount"
    And I selected cancel button
    And Verify if tax "0.20" "0.05623" is calculated properly and calculate round-off
    And Verify if the total amount is calculated correctly
    And Verify if the balance due amount is calculated correctly
    And Verify if the balance due amount is displayed correctly after payment
    And I click log off button in order screen

    @13
  Scenario: TS-13 -> Modifier quantity shows wrong in voided menu item
    And I have selected category arrow
    And Select the category "FOOD ITEMS"
    And Select the menu item "testing menu33"
    And I selected the modifier "Bbq"
    And I click Done button on the open item window
    And I selected quantity as "5"
    And I selected order button
    And I click Discount as "20% Discount"
    And I selected cancel button
    And I selected menu options
    And I selected void button in menu options
    And I selected void quantity as "2"
    And Select the Void item reason as "Server Error"
    And Verify if the modifier voided quantity "2" is displayed correctly
    And Verify if tax "0.20" "0.05623" is calculated properly and calculate round-off
    And Verify if the total amount is calculated correctly
    And Verify if the balance due amount is calculated correctly
    And Verify if the balance due amount is displayed correctly after payment
    And I click log off button in order screen

      @22
  Scenario: TS-22 -> Tax value & Total is display wrongly when Apply check tax (Apply on subtotal) with Inclusive tax
    And I have selected category arrow
    And Select the category "IceCreams"
    And Select the menu item "Rajbhog"
    And Check the amount of menu item "520.00"
    And I selected the modifier2 "CHEESE"
#    And Verify if exclusive tax menu "0.05555" exclusive tax modifier "0.07777" and discount "0.20" are calculated properly
    And Verify if exclusive tax menu "0.10255" inclusive tax modifier "0.08655" check tax "0.12444" are calculated properly
    And Verify if the balance due amount is displayed correctly
    And Verify if the balance due amount is displayed correctly after the payment
    And I click log off button in order screen

    @25
  Scenario: TS-30 -> Application shows "Negative balance due" because of Tax Mismatch
    And I have selected category arrow
    And Select the category "FOOD ITEMS"
    And Select the menu item "testing menu33"
    And I selected the modifier "Bbq"
    And I click Done button on the open item window
    And I selected quantity as "5"
    And I selected order button
    And I click Discount as "20% Discount"
    And I selected cancel button
    And I selected menu options
    And I selected void button in menu options
    And I selected void quantity as "2"
    And Select the Void item reason as "Server Error"

    @97
  Scenario: TS-97 -> Unable to Create Open modifier, Open Discount for the open menu item
    And Selected Options button
    And Selected Open item option
    And Selected Coursing name field
    And I swipe to "DESSERT" Coursing Name
    And I entered course name
    And I selected the Price text field
    And I entered the price
    And I selected the Continue button
    And I selected the Tax
    And I selected the Exclusive Tax
    And I click Done button on the open item window
    And I selected menu options
    And I selected Open Discount
    And I tapped the percentage field
    And I entered the discount percentage
    And I selected the Continue button
    And I tapped reason and entered the reason
    #And I click "Hide keyboard" button in the keyboard "Click Back"
    And I selected the apply button
    And Verify If Tax "0.1345" Is Calculated Properly And Calculate RoundOff for Open Discount "0.10255" Exclusive
    And Verify if the total amount is calculated correctly for exclusive open discount
    And Verify if the balance due amount is displayed correctly
    And Verify if the balance due amount is displayed correctly after the payment
    And I click log off button in order screen

      @71
  Scenario: TS-71 -> If trying to Increase the quantity for the menu item with Mandatory modifier group, allowing to increase the quantity for modifier more than menu quantity
    And I have selected category arrow
    And Select the category "FOOD ITEMS"
    And Select the menu item "testing menu33"
    And I selected the modifier "Bbq"
    And I click Done button on the open item window
    And I selected quantity as "5"
    And I selected menu options
    And I selected the back button
    #And I verify if the modifier price "2.00" is correct for the second modifier
    And I reduced one quantity of the modifier conversational
    And I selected the modifier "Bbq"