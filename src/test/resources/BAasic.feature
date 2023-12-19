

Feature:Basic Validation

#  Scenario: Verify BO Changes
#    And Go to the BO
#    When I search the store as "TestAppiumUSD"

  @MainBAsic
  Scenario: Cashier Out From Till Management Screen
    Given I'm logged in
    And I closed the order type window
    And I click on the Settings button
    And I click on the Till Management button
    When I verify till is available or not if available closed the till
    Then I should see open till management screen
#    And I click cancel button in open till popup
    And I click reports button in the Till management screen
    And I click cashier out button in the Till management screen
    Then I should see do you want to print the cashier out popup
    And I click Yes button on the popup for Hold item
    Then I should see cashier out saved successfully popup
    And I click Done button on the Popup
#    Then I should verify the initial Gross sale value as "0,00"
    And I click power button

  @MainBAsic
  Scenario: Refund
    Given I'm logged in
    And I closed the order type window
    And I get check number
    And I select Menu of Basic validation for QSR as "Salad"
   # And I get the menu from the order screen
    And I get the total of menu item in order screen
    And I click Payment button in the Order Management Screen
    And I click cash button from the payment method popup
    And I click Submit button on the Payment Window
    And I closed the order type window
    And I click the Settings button
    And I click close day tab
    Then I should see close day screen
    And I click "//button[contains(.,'Close All Cashiers')]" in the close the day Popup window "Click Close All Cashiers"
  When I verify the cannot close the shift, store have the active checks
#    Then I should see cashier out saved successfully popup
#    And I click Done button on the Popup
    And I click "//button[contains(.,'Close The Day')]" in the close the day Popup window "Click Close The Day"
    When I click the Close the day button in the operation screen "Close The Day" "Click Close the day Button"
    And I click Yes button on the popup for Hold item
#    And I click "Yes" in the close the day Popup window "click yes button"
    When I click the "//button[contains(.,'Submit')]" in the close the day screen "click submit button"
#    And I click "No" in the close the day Popup window "click No button"
#    And I click No button on send to kitchen popup
    And I click Done button on the Popup
    And I click the Toggle Icon button
    And I click Refund button in the operation window
    When I search the closed check in refund screen
    And I verify total of menu in Refund screen amount
    And I click refund button in the refund screen
    And I verify check number in refund amount window
    And I verify check amount same with refund window amount and also defaulty check amount in number pad
   #And I click cancel button in the refund window
    When I enter the reason in the Refund window
    And I hide the keyboard
    When I enter the payment as "Cash" in the refund window
    Then I should see do you want to refund confirm popup
    And I click No button on send to kitchen popup
    When I enter the huge value than the refund value in refund window
#    And I hide the keyboard
    When I enter the payment as "Cash" in the refund window
    Then I should see the amount exceeds the paid amount popup
    And I click Done button on the Popup
    When I enter the same value of the refund value in refund window
#    And I hide the keyboard
    When I enter the payment as "Cash" in the refund window
    Then I should see do you want to refund confirm popup
    And I click Yes button on the popup for Hold item
#    And I click Ok button in receipt printer popup
    Then I should see refund success popup
    And I click Done button on the Popup
    ########    Verify the "Refund Without Receipt" option   ##########
    When I click refund without receipt button in the refund window
    Then I should verify defaulty number pad should have "0,00" on the refund window
    And I click cancel button in the refund window
    #########   8. Enter the amount to be refunded & enter the reason for refund & choose any payment  ########
    When I click refund without receipt button in the refund window
    And I enter the amount as "5430" on the refund window
    And I enter the refund reason as "Refund" on the refund window
#    And I hide the keyboard
    When I enter the payment as "Cash" in the refund window
    Then I should see do you want to refund confirm popup
    And I click Yes button on the popup for Hold item
#    And I click Ok button in receipt printer popup
    Then I should see refund success popup
    And I click Done button on the Popup
    ########   Verify the "Refund Menu items" option   #########
    And I click refund menu items button on the refund screen
    Then I should see please select the check popup
    And I click Done button on the Popup
    And I search the closed check in refund screen
    And I click refund menu items button on the refund screen
    Then I Should get back to the Order Screen
    Then I should verify the refund check number with order screen check number
    Then I should verify the button as "Refund Check"  "Refund Items" "Done" on the refund order screen
    And I select the menu in the Refund order screen
    And I click refund items on the refund order screen
#    And I verify check number in refund order screen
#    And I enter the reason in the Refund Order Screen
#    And I hide the keyboard
#    When I enter the payment as "Cash" in the refund window
#    Then I should see do you want to refund confirm popup
#    And I click Yes button on the popup for Hold item
#    And I click Ok button in receipt printer popup
#    Then I should see refund success popup
    And I click Done button on the Popup
    ########  13. Select "Refund check" option from order screen  #########
    And I click the refund check button on the refund order screen
    Then I should see check is refunded already popup
    And I click Done button on the Popup
    And I click Done button on the refund order screen
    And I search the closed check in refund screen
    And I click refund menu items button on the refund screen
    Then I Should get back to the Order Screen
    Then I should verify the refund check number with order screen check number
    Then I should verify the button as "Refund Check"  "Refund Items" "Done" on the refund order screen
#    And I click the refund check button on the refund order screen
#    And I verify check number in refund order screen
#    And I enter the reason in the Refund Order Screen
#    And I hide the keyboard
#    When I enter the payment as "Cash" in the refund window
#    Then I should see do you want to refund confirm popup
#    And I click Yes button on the popup for Hold item
#    And I click Ok button in receipt printer popup
#    Then I should see refund success popup
#    And I click Done button on the Popup
    And I click Done button on the refund order screen
    And I click power button

##Hold Due to unable to do MPPG payment
  Scenario: Verify the Tokenized credit Card number is displayed as Encrypted in the "Refund Screen"
    Given I'm logged in
    And I closed the order type window
    And I select order type as QSR in order screen
    And I select service type as "BarTab" on the order screen
#    And I click the Exit to close the preauth window
    And I click Add Customer Button
#    And I click Add new button
#    Then I should see the customer profile window
    Then I should see the add customer screen in the window
    And I Click on the Byname Option
    And Enter the new customer randomlys
    And I click the phone number field on the customer profile screen
    And I get the mobile number from the customer profile screen
    And I click the Save button
    And I get check number
    And I select category as "FOOD"
    And I select menu item as "SANDWICHES"
    And I should verify subtotal value as "$ 1.00"
    And I should verify tax value as "$ 0.10"
    And I should verify total2 value as "$ 1.16"
    And I click Payment button in the Order Management Screen
#Need to do
    When I select the MPPG Payment on the payment window
    Then I should see tip screen
    And I select the tip from the tip screen
    And I click the Continue button on the Total screen
    Then I should see the card details entry screen
    When I verify subtotal,tax and total value with card details screen value
    When I verify the tip value with card details screen value
    When I verify the paid amount value is zero
    And I get the pay amount value from the card details screen value
    Then I verify card reader is not connected popup or not
    And I verify the Calculation pay amount with the card details pay amount
    And I click manual button on the your order screen
    And I pass the Amex card number as "4111111111111111"
    And I pass card name as "Visa"
    And I pass expire date as "1224"
    And I click Process button on card screen
    Then I should see the do you want to tokenize your card popup
    And I click Yes button on the tokenize popup
    And I click Ok button in receipt printer popup
    And I click Submit button on the Payment Window
    And I click QSR tab
    And I closed the order type window
    And I click the Settings button
    And I click close day tab
    Then I should see close day screen
    And I click "Close All Cashiers" in the close the day Popup window "Click Close All Cashiers"
    When I verify the cannot close the shift, store have the active checks
#    Then I should see cashier out saved successfully popup
#    And I click Done button on the Popup
    And I click "Close The Day" in the close the day Popup window "Click Close The Day"
    When I click the Close the day button in the operation screen "Close The Day" "Click Close the day Button"
    And I click Yes button on the popup for Hold item
#    And I click "Yes" in the close the day Popup window "click yes button"
    When I click the "Submit" in the close the day screen "click submit button"
#    And I click "No" in the close the day Popup window "click No button"
#    And I click No button on send to kitchen popup
    And I click Done button on the Popup
    And I click the Toggle Icon button
    And I click Refund button in the operation window
    When I search the closed check in refund screen
    When I verify the credit card of the check from the refund screen should be encrypted
    And I click power button


  @MainBAsic
  Scenario: Global Till ( PAY IN, PAy Out )
    Given I'm logged in
    And I closed the order type window
#    And I click counting machine icon
    And I click on the Settings button
    And I click on the Till Management button
    When I verify till is available or not if available closed the till
## 16. Navigate to the Till Management screen
  ##15. In the Open Till screen Enter the amount by number pad or use the denomination to enter the amount should be saved in the Till (Enable the  Global Till toggle)
    Then I should see open till management screen
    And I press first number of the total
    And I press second number of the total
    And I press third number of the total
    When I press Continue for open till
    Then verify active till as global till
    When I get the active till details
    Then verify till balance same with amount given
    ##17. Try to place any available menu item In any service type (Dine in/Bartab/Phone order) & complete the payment with cash type
    And I click the Toggle Icon button
    And I click POS Icon from Toggle
    And I closed the order type window
    And I click All
    And I click Table Layout tab
    And I select Menu For Basic validation as "Salad"
    And I get the total of menu item in order screen
#  And I select Menu For Basic validation as "Appetizers"
    And I click Cash button for Complete Sale
    And I click Exact button on the cash pop-up
    And I get Total of menu
    And I click Enter Button on the cash pop-up
    And I click Table Layout tab
    And I click QSR tab
    And I closed the order type window
#    And I click counting machine icon
    And I click on the Settings button
    And I click on the Till Management button
    Then I should see active till total has changed depends on menu total
 ######  PAY IN  #######
    And I click pay in button in the till management screen
    And I enter Paid By as "KamilTT"
#    And I hide the keyboard
    And I enter first number of the payment
    And I enter second number of the payment
    And I enter third number of the payment
    And I get pay In value
    And I click Continue
    And I should see the Reasons window with title "Reasons"
    And I select the pay in reason as Paid In
    When I click OK button to select the payment reason
#    Then I should see payment successful pop-up with the message "Paid In Successfully" pay in
#    And I click Done button on the Popup
    And I click Till button
    Then I should see active till total has changed depends on Pay in
     ######  PAY OUT #######
    And I get the details of Active details
    When I click pay out button in the till management screen
    And I enter Paid By as "KamilTT"
#    And I hide the keyboard
    And I enter first number of the payment
    And I enter second number of the payment
    And I enter third number of the payment
    And I get pay Out value
    And I click Continue
    And I should see the Reasons window with title "Reasons"
    And I select the pay in reason as Paid Out
    When I click OK button to select the payment reason
#    Then I should see pop-up with the message "Paid Out Successfully" for the pay out
#    And I click Done button on the Popup
    And I click Till button
    Then I should see active till total has changed depends on Pay out
#    @Cashm
#    Scenario:  Cash Drop
#      Given I'm logged in
#      And I closed the order type window
#      And I click the Settings button
    And I click the Toggle Icon button
    And I click the POS settings from Toggle
    And I click cash drop from Till settings
    And I click the Toggle Icon button
    And I click till management button from the operation window
    When I click cash drop button from the till window
    And I click Till button
    When I get the details of Active details
    And I click the cash drop button and enter value for cash drop as "$ 20.76"
    And I click the Toggle Icon button
    And I click the POS settings from Toggle
    And I click cash drop from Till settings
    And I click the Toggle Icon button
    And I click till management button from the operation window
    And I click reports button in the Till management screen
#    ###########  Reports  ###############
#    Then I should verify the gross value depends on the menu item value in the reports window of Till management
    And I click cashier out button in the Till management screen
    Then I should see you have an Active till do you want to close the till popup
    And I click Yes button on the popup for Hold item
    When I verify the cash expected value and closed till
    Then I should see do you want to print the cashier out popup
    And I click Yes button on the popup for Hold item
    Then I should see cashier out saved successfully popup
    And I click Done button on the Popup
    And I click power button

  @MainBAsic
  Scenario: Verify the Pay in, Payout, Audit, Single cashier out, Close the day for the current business day(Clock in, start till(user till, Global till))
    Given I'm logged in
    And I closed the order type window
#    And I click counting machine icon
    And I click on the Settings button
    And I click on the Till Management button
    When I verify till is available or not if available closed the till
    Then I should see open till management screen
#    And I click cancel button in open till popup
    And I click reports button in the Till management screen
    When I get gross value from the reports of till management window
    And I click Till button
    Then I should see open till management screen
    #########    USER TILL   ###########
    And I select global till option in open till
    And I press first number of the total
    And I press second number of the total
    And I press third number of the total
    When I press Continue for open till
    When I get the active till details
    Then verify till balance same with amount given
    ##7. Try to place any available menu item In any service type (Dine in/Bartab/Phone order) & complete the payment with cash type
    And I click the Toggle Icon button
    And I click POS Icon from Toggle
    And I closed the order type window
    And I click All
    And I click Table Layout tab
    And I select Menu For Basic validation as "Salad"
    And I get the total of menu item in order screen
#    And I select Menu For Basic validation as "Appetizers"
    And I click Cash button for Complete Sale
    And I click Exact button on the cash pop-up
    And I get Total of menu
    And I click Enter Button on the cash pop-up
    And I click Table Layout tab
    And I click QSR tab
    And I closed the order type window
#    And I click counting machine icon
    And I click on the Settings button
    And I click on the Till Management button
    Then I should see active till total has changed depends on menu total
    ######  PAY IN  #######
    And I click pay in button in the till management screen
    And I enter Paid By as "KamilTT"
#    And I hide the keyboard
    And I enter first number of the payment
    And I enter second number of the payment
    And I enter third number of the payment
    And I get pay In value
    And I click Continue
    And I should see the Reasons window with title "Reasons"
    And I select the pay in reason as Paid In
    When I click OK button to select the payment reason
    Then I should see payment successful pop-up with the message "Paid In Successfully" pay in
    And I click Done button on the Popup
    And I click Till button
    Then I should see active till total has changed depends on Pay in
     ######  PAY OUT #######
    And I get the details of Active details
    When I click pay out button in the till management screen
    And I enter Paid By as "KamilTT"
#    And I hide the keyboard
    And I enter first number of the payment
    And I enter second number of the payment
    And I enter third number of the payment
    And I get pay Out value
    And I click Continue
    And I should see the Reasons window with title "Reasons"
    And I select the pay in reason as Paid Out
    When I click OK button to select the payment reason
    Then I should see pop-up with the message "Paid Out Successfully" for the pay out
    And I click Done button on the Popup
    And I click Till button
    Then I should see active till total has changed depends on Pay out
    And I click the Toggle Icon button
    And I click the POS settings from Toggle
    And I click cash drop from Till settings
    And I click the Toggle Icon button
    And I click till management button from the operation window
    When I click cash drop button from the till window
    And I click Till button
    When I get the details of Active details
    And I click the cash drop button and enter value for cash drop as "$ 20.76"
    And I click the Toggle Icon button
    And I click the POS settings from Toggle
    And I click cash drop from Till settings
    And I click the Toggle Icon button
    And I click till management button from the operation window
    And I click reports button in the Till management screen
#    ###########  Reports  ###############
#    Then I should verify the gross value depends on the menu item value in the reports window of Till management
    And I click cashier out button in the Till management screen
    Then I should see you have an Active till do you want to close the till popup
    And I click Yes button on the popup for Hold item
    When I verify the cash expected value and closed till
    Then I should see do you want to print the cashier out popup
    And I click Yes button on the popup for Hold item
    Then I should see cashier out saved successfully popup
    And I click Done button on the Popup
    And I click power button

  @MainBAsic
  Scenario: Added tip is Correct or not
    Given I'm logged in
    And I closed the order type window
    And I select FOOD as category
    And I select menu item as "Onion Rings"
    And I click Payment button in the Order Management Screen
    And I click side cc button in the payment window
    Then I should see total screen
    And I click tip as 10
    And I get tip value from Tip screen
    And I click the Continue button on the Total screen
    When I verify the added tip is same in Payment screen
    And I click Submit button in the Payment popup
    And I closed the order type window
    And I click log off button in order screen

  @MainBAsic
  Scenario: Bussiness Date Verify with Close day window Date
    When I get he Bussiness date from the order screen
    Given I'm logged in
    And I closed the order type window
    And I click All
    And I click Table Layout tab
    And I click the Operation button on the Table Layout
    And I click close day tab
    When I verify bussiness date with close day screen
    And I click power button

  @MainBAsic
  Scenario: Cashier OUT PULL Request
    Given Im logged in for cashier1
    And I created sale for Cashier out1 as "FOOD"
    Given Im logged in for cashier2
    And I created sale for Cashier out2 as "Salad"
    And I click power button
    Given Im logged in for cashier3
    And I created sale for Cashier out3 as "Salad"
    Given Im logged in for cashier4
    And I created sale for Cashier out4 as "Salad"
    And I click power button
    Given I'm logged in for Phone store
    And I closed the order type window
    And I click the Settings button
    And I click till management button from the operation window
    When I verify till is available or not if available closed the till
#    And I click cancel button in open till popup
    And I click reports button in the Till management screen
    And I select the cashier1 on the report screen
    And I select the cashier2 on the report screen
    And I select the cashier3 on the report screen
    And I select the cashier4 on the report screen
    And I click power button
# Need to add the GIveX and exectue this

  ## Hold Due to GiveX funtionality is not available
  Scenario: GiveX
    Given I'm logged in
    And I closed the order type window
    And I click Options button
    And I click Gift card Button
    Then I should see Gift card window
    And I click GiveX option
    Then I should see givex screen
    And I Enter the GiveX Number value as "603628237912001380863"
    Then I verify beginning balance,recurring balance for GiveX
#    And I click Done button on the Popup
    And I enter the charge amount as "12580" on the Gift card window
    And I click Done button on the Popup
    Then User verify GiveX Recharge success info popup
    And I click Done button on the Popup
    When I verify recharge givex amount is same with order screen givex amount
    And I click Cash button for Complete Sale
    And I click Exact button on the cash pop-up
    And I click Enter Button on the cash pop-up
    And I closed the order type window
    And I click log off button in order screen

  @MainBAsic
  Scenario: User Till
    Given I'm logged in
    ##5. Navigate to the Till Management screen
    And I closed the order type window
#    And I click counting machine icon
      And I click on the Settings button
      And I click on the Till Management button
    When I verify till is available or not if available closed the till
    Then I should see open till management screen
    ##6. In the Open Till screen Enter the amount by number pad or use the denomination to enter the amount should be saved in the Till (Disable mode of Global Till toggle)
    And I select global till option in open till
    And I press first number of the total
    And I press second number of the total
    And I press third number of the total
    When I press Continue for open till
    When I get the active till details
    Then verify till balance same with amount given
    ##7. Try to place any available menu item In any service type (Dine in/Bartab/Phone order) & complete the payment with cash type
    And I click the Toggle Icon button
    And I click POS Icon from Toggle
    And I closed the order type window
    And I click All
    And I click Table Layout tab
    And I select Menu For Basic validation as "Salad"
    And I click Cash button for Complete Sale
    And I click Exact button on the cash pop-up
    And I get Total of menu
    And I click Enter Button on the cash pop-up
    And I click Table Layout tab
    And I click QSR tab
    And I closed the order type window
#    And I click counting machine icon
      And I click on the Settings button
      And I click on the Till Management button
    Then I should see active till total has changed depends on menu total
    ##8. Select the active till in till management screen choose Close till option
    And I click Active till check
    And I click the Close Till button
    Then I should see close till confirmation pop-up
    ##9. Choose 'Yes' Do you want to Close the Till pop
    And I click yes to open Close Till Screen
    Then I should see that the Close Till window is displayed
    ##10. Enter the amount should greater than the amount which is in Balance amount & hit continue option
    And I enter the amount greater than balance amount
    And I click the Continue button
    Then I should see over shortage popup
  ##11. OVER SHORTAGE pop up screen enter the valid Discrepancy Notes & choose Done
    And I enter reason for discrepency notes
    And I click Done button on the Popup
    Then I should see total summary
    And I click submit button on total summary
  ##12. If Entered amount is Less than the amount which is in Balance amount & hit continue option
    And I click Set Till button
    Then I should see open till management screen
    And I select global till option in open till
    And I press first number of the total
    And I press second number of the total
    And I press third number of the total
    When I press Continue for open till
    When I get the active till details
    Then verify till balance same with amount given
#    And I get the active till total
    And I click the Toggle Icon button
    And I click POS Icon from Toggle
    And I closed the order type window
    And I click All
    And I click Table Layout tab
    And I select Menu For Basic validation as "Salad"
    And I click Cash button for Complete Sale
    And I click Exact button on the cash pop-up
    And I get Total of menu
    And I click Enter Button on the cash pop-up
    And I click Table Layout tab
    And I click QSR tab
    And I closed the order type window
#    And I click counting machine icon
      And I click on the Settings button
      And I click on the Till Management button
    Then I should see active till total has changed depends on menu total
    And I click Active till check
    And I click the Close Till button
    Then I should see close till confirmation pop-up
    And I click yes to open Close Till Screen
    Then I should see that the Close Till window is displayed
    And I enter the amount smaller than balance amount
    And I click the Continue button
    Then I should see over shortage popup
    And I enter reason for discrepency notes
    And I click Done button on the Popup
    Then I should see total summary
  ##15. And choose the Submit option Till Management - Check Summary screen will closed
    And I click submit button on total summary
    And I click Closed till button
    And I get the closed till check details
    And I click power button

  @MainBAsic
  Scenario: Global Till
    Given I'm logged in
    And I closed the order type window
#    And I click counting machine icon
    And I click on the Settings button
    And I click on the Till Management button
    When I verify till is available or not if available closed the till
## 16. Navigate to the Till Management screen
#  And I click Set Till button
  ##15. In the Open Till screen Enter the amount by number pad or use the denomination to enter the amount should be saved in the Till (Enable the  Global Till toggle)
    Then I should see open till management screen
    And I press first number of the total
    And I press second number of the total
    And I press third number of the total
    When I press Continue for open till
    Then verify active till as global till
    When I get the active till details
    Then verify till balance same with amount given
    ##17. Try to place any available menu item In any service type (Dine in/Bartab/Phone order) & complete the payment with cash type
    And I click the Toggle Icon button
    And I click POS Icon from Toggle
    And I closed the order type window
    And I click All
    And I click Table Layout tab
    And I select Menu For Basic validation as "Salad"
    And I click Cash button for Complete Sale
    And I click Exact button on the cash pop-up
    And I get Total of menu
    And I click Enter Button on the cash pop-up
    And I click Table Layout tab
    And I click QSR tab
    And I closed the order type window
#    And I click counting machine icon
    And I click on the Settings button
    And I click on the Till Management button
    Then I should see active till total has changed depends on menu total
    ##18. Select the active till in till management screen choose Close till option
    And I click Active till check
    And I click the Close Till button
    Then I should see close till confirmation pop-up
   ##19. Choose 'Yes' Do you want to Close the Till pop
    And I click yes to open Close Till Screen
    Then I should see that the Close Till window is displayed
   ##20. Enter the amount should greater than the amount which is in Balance amount & hit continue option
    And I enter the amount greater than balance amount
    And I click the Continue button
    Then I should see over shortage popup
  ##21. OVER SHORTAGE pop up screen enter the valid Discrepancy Notes & choose Done
    And I enter reason for discrepency notes
    And I click Done button on the Popup
    Then I should see total summary
    And I click submit button on total summary
    ##22. If Entered amount is Less than the amount which is in Balance amount & hit continue option
    And I click Set Till button
    Then I should see open till management screen
    And I press first number of the total
    And I press second number of the total
    And I press third number of the total
    When I press Continue for open till
    Then verify active till as global till
    When I get the active till details
    Then verify till balance same with amount given
#    And I get the active till total
    And I click the Toggle Icon button
    And I click POS Icon from Toggle
    And I closed the order type window
    And I click All
    And I click Table Layout tab
    And I select Menu For Basic validation as "Salad"
    And I click Cash button for Complete Sale
    And I click Exact button on the cash pop-up
    And I get Total of menu
    And I click Enter Button on the cash pop-up
    And I click Table Layout tab
    And I click QSR tab
    And I closed the order type window
#    And I click counting machine icon
    And I click on the Settings button
    And I click on the Till Management button
    Then I should see active till total has changed depends on menu total
    And I click Active till check
    And I click the Close Till button
    Then I should see close till confirmation pop-up
    And I click yes to open Close Till Screen
    Then I should see that the Close Till window is displayed
    And I enter the amount smaller than balance amount
    And I click the Continue button
    ##23. OVER SHORTAGE pop up screen enter the valid Discrepancy Notes & choose Done
    Then I should see over shortage popup
    And I enter reason for discrepency notes
    And I click Done button on the Popup
    Then I should see total summary
  ##25. And choose the Submit option Till Management - Check Summary screen will closed
    And I click submit button on total summary
    And I click Closed till button
    And I get the closed till check details
    And I click power button

  @MainBAsic
  Scenario:Verify the Cash Discount charge for the check
    Given I'm logged in
    And I closed the order type window
    And I click All
    And I click Table Layout tab
    And I select Menu For Basic validation as "Salad"
#    And I select FOOD as category
#    And I select menu item as "mongo test"
    And I get the cash option value and add with menu total
    And I click Payment button in the Order Management Screen
    When I get the balance Due Amount and cash option amount in payment window

  ##6. Choose Payment type as "Cash"
    And I click cash button from the payment method popup
    Then verify the cash option in payment screen

  ##7. Without choosing the submit button Select "Exit" option from payment screen
    And I click Exit to return to Order Management Screen
    When verify the paid Amount in Order Screen for cash option
    When verify cash discount is display in order screen

  ##8. Complete the sale with the cash payment
    And I click Payment button in the Order Management Screen
    And I click Submit button in the Payment popup
    And I click Table Layout tab
    And I click power button

  @MainBAsic
  Scenario: Transfer Item from one Check to another Check
    Given Login with valid pin in split screen
    And I closed the order type window
    Given User click All button in QSR
    When User click the Table Layout option
#    And User select the two Empty table and take the order
#    And I click new check button on the Table layout screen
    And I select Menu For Basic validation as "Menu"
    And I click Finish Order button
    And I click Table Layout tab
    And User select the Transfer button
    And User verify Transfer to Server, Transfer to Table and Transfer Item are displayed
    And User select the Transfer Item Option
    When I select check for transferred
#    And I hide the keyboard
#    Then Select anyone Check from the Transfer From Table
    And Select the required menu item from the Menu Item Table
#    Then Select anyone Check from the Transfer To Table
    When I select check for transferred1
    And Click the Done button
#    Then I should see the all the menu items will be transferred popup
    And Verify the Successful message of Transfer Item
    And I click Done button on the Popup
   # And Click the Transferred from table
    When I click transferred table after done transfer process
#    Then Verify the Transferred menu item is available or not in the sending table
#    And Click the finish button
#    And Click the Transferred To table
    Then Verify the Transferred menu item is available or not in the receiving table
#    Then I verify the Transferred menu item is available on the selected transferred table
    And Click the finish button
    And I click power button
#    And Close all the active checks
#
  @MainBAsic
  Scenario: Transfer To Table from one Check to another Check
    Given Login with valid pin in split screen
    And I closed the order type window
    Given User click All button in QSR
    When User click the Table Layout option
    And User select the two Empty table and take the order
    And User select the Transfer button
    And User verify Transfer to Server, Transfer to Table and Transfer Item are displayed
    And User select the Transfer to Table Option
    Then Select anyone Table from the Transfer From Table
    And Select the required check from the Checks Table
    Then Select anyone Table from the Transfer To Table
    And Click the Done button
    And Verify the Successful message of Transfer To Table
    And I click Done button on the Popup
    And Check the Transferred from table
#    Then Verify the receiving table it should contain more than one table
#    And Click the close button
    And I click power button
#    And Close all the active checks

  @MainBAsic
  Scenario: Verify the "Transfer to Server" from one check to another check
    Given I'm logged in
    And I closed the order type window
    Given User click All button in QSR
    When User click the Table Layout option
    And User select the Empty table and take the order
    And Get the Server Name from The required Table
    And User select the Transfer button
    And User verify Transfer to Server, Transfer to Table and Transfer Item are displayed
    And User select the Transfer to Server Option
    Then Select correct server from the Transfer From Table
#    And I hide the keyboard
    And Select the required check from the Checks Table for Transfer Server
    Then Select anyone server from the Transfer To Table
    And Click the Done button
    And Verify the Successful message of Transfer To Server
    And I click Done button on the Popup
    Then Verify the server name is available or not in the required table
    And I click power button
#    And Close all the active checks

  @MainBAsic
  Scenario: Other than Cash Payment
    Given I'm logged in
    And I closed the order type window
    And I click All
    And I click Table Layout tab
    And I select Menu For Basic validation as "Salad"
#    And I select FOOD as category
#    And I select menu item as "mongo test"
    And I get the cash option value and add with menu total
    And I click Payment button in the Order Management Screen
    When I get the balance Due Amount and cash option amount in payment window

  ##6. Choose Payment type as "Cash"
    And I click side cc button in the payment window
    And I click the Continue button on the Total screen
    Then verify the cash option in payment screen
    Then verify the card option payment screen

  ##7. Without choosing the submit button Select "Exit" option from payment screen
    And I click Exit to return to Order Management Screen
    When verify the paid Amount in Order Screen for card option
    When verify cash discount is display in order screen

  ##8. Complete the sale with the cash payment
    And I click Payment button in the Order Management Screen
    And I click Submit button in the Payment popup
    And I click Table Layout tab
    And I click power button

  #Clarification
  Scenario: Item Service charge  (Item Service Charge Without Tax)
    Given I'm logged in
    And I closed the order type window
    And I click All
    And I click Table Layout tab
    And I select Menu For Basic validation as "Salad"
    When i verify service charge without tax of menu
    And I click Payment button in the Order Management Screen
    And I click cash button from the payment method popup
    And I click Submit button on the Payment Window
    And I click Table Layout tab
    And I click power button

  @MainBAsic
  Scenario: Item Service charge (Item Service Charge With Tax )
    Given I'm logged in
    And I closed the order type window
    And I click All
    And I click Table Layout tab
    And I select Menu For Basic validation as "TaXx"
    When i verify service charge with tax of menu
    And I click Payment button in the Order Management Screen
    And I click cash button from the payment method popup
    And I click Submit button on the Payment Window
    And I click Table Layout tab
    And I click power button

  @MainBAsic
  Scenario:Manual Gratuity Fixed
  ##Manual Gratuity Fixed
    Given I'm logged in
    And I closed the order type window
    And I click All
    And I click Table Layout tab
    And I select Menu For Basic validation as "Salad"

  ##4. Choose the "Option" from the POS customer button in order screen
    And I click Options button
    And I click Gratuity button

#  And I select fixed gratuity in add gratuity screen
    And I click Gratuity Fixed button
    And I verify fixed gratuity is applied
    And I click Payment button in the Order Management Screen
    And I click cash button from the payment method popup
    And I click Submit button on the Payment Window
    And I click Table Layout tab
    And I click power button

  @MainBAsic
  Scenario: Manual Gratuity Varying
    Given I'm logged in
    And I closed the order type window
    And I click All
    And I click Table Layout tab
    And I select Menu For Basic validation as "Salad"

  ##4. Choose the "Option" from the POS customer button in order screen
    And I click Options button
    And I click Gratuity button

#  And I select fixed gratuity in add gratuity screen
    And I click Gratuity varying button
    Then I should see enter Percentage popup
    And I pass the value and click Apply button
    And I verify varying gratuity is applied

  #   And I verify fixed gratuity is applied
    And I click Payment button in the Order Management Screen
    And I click cash button from the payment method popup
    And I click Submit button on the Payment Window
    And I click Table Layout tab
    And I click power button

  @MainBAsic
  Scenario: Auto Gratuity Fixed
    Given I'm logged in
    And I closed the order type window
    And I click All
    And I click Table Layout tab
    And I select Menu For Basic validation as "Salad"

 ## 4. Add second seat in the respective check
    When I verify auto gratuity is applied or not
    And I add a new seat
    And I add a new seat
    Then I should see Add Gratuity screen
    And I click auto Gratuity Fixed button
    And I select Menu of Basic validation for QSR as "Salad"
    When I verify auto gratuity is applied or not
    And I click Payment button in the Order Management Screen
    And I click cash button from the payment method popup
    And I click Submit button on the Payment Window
    And I click Table Layout tab
    And I click power button

  @MainBAsic
  Scenario: Auto Gratuity Varying(Multiple Auto Varying/Fixed gratuity is available means From Step 6 will be applicable)
    ##NOTE: If the store has only one Auto Varying gratuity is available means Step 5 will be applicable

  ##NOTE: If the store has Multiple Auto Varying/Fixed gratuity is available means From Step 6 will be applicable
    Given I'm logged in
    And I closed the order type window
    And I click All
    And I click Table Layout tab
    And I select Menu For Basic validation as "Salad"

 ## 4. Add second seat in the respective check
    When I verify auto gratuity is applied or not
    And I add a new seat
    And I add a new seat
    Then I should see Add Gratuity screen

#    And I click auto Gratuity varying button
    And I select auto gratuity as "Auto Varying Gratuity"
    Then I should see enter Percentage popup
    And I pass the value and click Apply button
    And I select Menu of Basic validation for QSR as "Salad"
    When I verify auto gratuity is applied or not

 #   And I verify varying gratuity is applied
    And I click Payment button in the Order Management Screen
    And I click cash button from the payment method popup
    And I click Submit button on the Payment Window
    And I click Table Layout tab
    And I click power button

#Hold due to Credit card payment un-available
  Scenario: Card Service Charge
    Given I'm logged in
    And I closed the order type window
    And I click All
    And I click Table Layout tab
    And I select Menu For Basic validation as "Salad"
    And I click Payment button in the Order Management Screen
    When I get the balance Due Amount and cash option amount in payment window
    And I click credit card payment on payment window
    When I should not see card type screen
    And I should see tip screen
    And I click the Continue button on the Total screen
    And I click manual button on the your order screen
    And I pass the card number as "4111111111111111"
    And I pass card name as "Visa"
    And I pass expire date as "1223"
    And I click Process button on card screen
    And I click Ok button in receipt printer popup
    And I click Table Layout tab
    And I click power button

  #Hold due to Credit card payment un-available
  Scenario: Batch process
    #Manual Batch
    Given I'm logged in
    And I closed the order type window
    And I click All
    And I click Table Layout tab
    And I select Menu For Basic validation as "Salad"
    And I click Payment button in the Order Management Screen
    When I get the balance Due Amount and cash option amount in payment window
    And I click mppg auth payment in the payment window
    Then I should see tip screen
    And I select the tip from the tip screen
    And I click the Continue button on the Total screen
    Then I should see the card details entry screen
    When I verify subtotal,tax and total value with card details screen value
    When I verify the tip value with card details screen value
    When I verify the paid amount value is zero
    And I get the pay amount value from the card details screen value
    Then I verify card reader is not connected popup or not
    And I verify the Calculation pay amount with the card details pay amount
    And I click manual button on the your order screen
    And I pass the card number as "4111111111111111"
    And I pass card name as "Visa"
    And I pass expire date as "1223"
    And I click Process button on card screen
    And I click Ok button in receipt printer popup
    And I click Submit button on the Payment Window
    Then I should get back to the Table Layout tab
    And I click the Operation button on the Table Layout
    When I click batch/Tip adjustment button
    And I click the device drop down button on the batch screen
#    And I click the device drop down "Down Arrow Black" button in the batch screen "click drop down button"
   # And I select the payment name "MPPG AUTH" in the List "select payment"
    And I select the MPPG Payment name in the device list
    Then I should see the list of checks in batch screen
    And I click "Submit Batch" in the batch screen "click submit batch button"
    Then I should see batch has been initiated popup
    And I click Done button on the Popup
    When I check the all check has been batch

  #Hold due to Credit card payment un-available
  Scenario: Verify the Tip Adjustment for Online Sale in Batch Screen
    Given I'm logged in
    And I closed the order type window
    And I click All
    And I click Table Layout tab
    And I select Menu For Basic validation as "Salad"
    And I click Payment button in the Order Management Screen
    When I get the balance Due Amount and cash option amount in payment window
    ## need to implement
    And I click mppg auth payment in the payment window
    Then I should see total screen
    And I click tip as 10
    And I click the Continue button on the Total screen
    Then I should see your order card screen
    And I click manual button on the your order screen
    And I pass the card number as "4111111111111111"
    And I pass card name as "Visa"
    And I pass expire date as "1223"
    And I click Process button on card screen
    And I click Ok button in receipt printer popup
    ## need to implement
    And I click Submit button on the Payment Window
    Then I should get back to the Table Layout tab
    And I click the Operation button on the Table Layout
    When I click batch/Tip adjustment button
    And I click the device drop down "Down Arrow Black" button in the batch screen "click drop down button"
   # And I select the payment name "MPPG AUTH" in the List "select payment"
    And I select the MPPG Payment name in the device list
    Then I should see the list of checks in batch screen
    When I click the check from batch screen
#    And I hide the keyboard
    And I change tip amount in batch screen
    Then I should see tip Amount is applied or not
#    And I hide the keyboard
    And I click "Submit Batch" in the batch screen "click submit batch button"
    Then I should see batch has been initiated popup
    And I click Done button on the Popup
    And I click the Toggle Icon button
    And I click the POS settings from Toggle
    And I click the Toggle Icon button
    When I click batch/Tip adjustment button
    Then I should see the list of checks in batch screen
#    Then I should see last batch started text
#    Then I have verify check in the batch screen
  #  And I click Table Layout tab
    And I click power button

  @MainBAsic
  Scenario: Customer
    ## Verify the Customer attachment and search(name & phone no).
    Given I'm logged in
    And I closed the order type window
    And I click Add Customer Button
#    And I click Add Customer Button
#    And I click Add new button
#    Then I should see the customer profile window
    Then I should see the add customer screen in the window
    And I Click on the Byname Option
    And Enter the new customer randomlys
#    And I click the phone number field on the customer profile screen
    And I click the Save button
    Then I should see the customer profile window
    And I enter the customer name randomly
    And I click log off button in order screen

  @MainBAsic
  Scenario: Taxes
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
#    And I select category as "Appetizers"
    And I select category as "Appetizers"
    And I select menu item as "RAPINI"
    Then I should see orderscreen with menu item prize as "$ 13.00"
    Then I should see the tax amount reflected to the check as "$ 0.65"
    Then I should see orderscreen with menu item Total as "$ 13.65"
#    Then I should verify total value as "$ 15.75"
    And I change the Quantity of menu Item as "5"
    Then I should see orderscreen with menu item prize as "$ 65.00"
    Then I should see the tax amount reflected to the check as "$ 6.50"
    Then I should see orderscreen with menu item Total as "$ 71.50"
#    Then I should verify total value as "$ 82.50"
    And I change the Quantity1 of menu Item as "8"
    Then I should see orderscreen with menu item prize as "$ 104.00"
    Then I should see the tax amount reflected to the check as "$ 15.60"
    Then I should see orderscreen with menu item Total as "$ 119.60"
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
#    And I select Pasta as category
    And I select category as "Pasta"
    And I select menu item as RavioliPesto for Item Based Inclusive Tax
    And I select modifier as "Butter"
    And I click Done to get back
    Then I should see orderscreen with menu item prize as "$ 15.00"
    Then I should see the tax amount reflected to the check as "$ 1.36"
    Then I should see orderscreen with menu item Total as "$ 15.00"
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
    Then I should see the tax amount reflected to the check as "$ 96.57"
    Then I should see orderscreen with menu item Total as "$ 1,196.57"
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
    Then I should see orderscreen with menu item Total as "$ 1,305.35"
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
    Then I should see orderscreen with menu item Total as "$ 4.44"
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
    Then I should see orderscreen with menu item Total as "$ 88.00"
    And I click Void button on order management screen
    Then I should see All orders are voided
    And I click Done button on the Popup
    And I click All
    Then I should get back to the Table Layout tab
    And I click power button


  @MainBAsic
  Scenario: Orders
     ## Verify Orders(Menu, Menu with Serving size, Menu with Modifiers, Menu with Modifiers and Prefix, Menu with Serving, Modifiers and Prefix)
  ##  Menu   ##
    Given I'm logged in
    And I closed the order type window
    And I select Menu of Basic validation for QSR as "Salad"
    And I click Payment button in the Order Management Screen
    And I click cash button from the payment method popup
    And I click Submit button in the Payment popup
    Then I should see the order type window
 #   Scenario: Menu with serving size
  #    Given I'm logged in
    And I closed the order type window
    And I select Breakfast as Category
    And I select menu item as "sappthi"
    And I select modifier as "EACH"
    And I select modifier as "None"
    And I click Done to get back
    And I click Payment button in the Order Management Screen
    And I click cash button from the payment method popup
    And I click Submit button in the Payment popup
    Then I should see the order type window
  #Scenario: Menu with serving size
   # Given I'm logged in
    And I closed the order type window
    And I select FOOD as category
    And I select menu item as "Tuna Tacos"
    And I select modifier as "Croutons"
    And I click Done to get back
    And I click Payment button in the Order Management Screen
    And I click cash button from the payment method popup
    And I click Submit button in the Payment popup
    Then I should see the order type window
#  Scenario:  Menu with Modifiers and Prefix
#    Given I'm logged in
    And I closed the order type window
    And I select FOOD as category
    And I select menu item as "B.I. Wings"
    And I select modifier as "Spinach"
    And I select prefix modifier
    And I click Done to get back
    Then I should verify prefix modifier added to the menu
    And I click Payment button in the Order Management Screen
    And I click cash button from the payment method popup
    And I click Submit button in the Payment popup
    Then I should see the order type window
  #  Scenario:Menu with Serving, Modifiers and Prefix
   #   Given I'm logged in
    And I closed the order type window
    And I select FOOD as category
    And I select menu item as "Pizza Rucola 12inch"
    And I select modifier as "EACH"
    And I select modifier as "Smoked Salmon"
    And I select prefix modifier
    And I click Done to get back
    Then I should verify prefix modifier added to the menu
    And I click Payment button in the Order Management Screen
    And I click cash button from the payment method popup
    And I click Submit button in the Payment popup
    Then I should see the order type window
    And I close the order type window
    And I click log off button in order screen

  @MainBAsic
  Scenario: Verify the sale in QSR Service Type
    Given I'm logged in
    And I close the order type window
    And I tap QSR button to open the order types combo
    And I get check number
    And I select Menu of Basic validation for QSR as "Salad"
    And I click Order button in the order management screen
    And I click Payment button in the Order Management Screen
    And I select Cash as payment method
    And I click Submit button on the Payment Window
    And I close the order type window
    And I click All
    And I click Closed tab on the Check stats
    Then I should see closed check in closed check tab
    ## Verify the sale in Dine In Service Type
    And I click Table Layout tab
    And I select Menu For Dine order type as "Salad"
    And I click Order button in the order management screen
    And I click Payment button in the Order Management Screen
    And I select Cash as payment method
    And I click Submit button on the Payment Window
    And I click Table Layout tab
    And I click Check Stats tab
    And I click Closed tab on the Check stats
    Then I should see closed check in closed check tab
    ## Verify the sale in Service Type(For Here)
    And I click QSR tab
    And I select the order type FORHERE
#    And I click Done button to select the order type
#    Then I should see the customer profile window
#    And I select search
#    And I enter an existing customer's name "Auto ragav"
#    And I select the customer
#    When I click the Save button
    Then I should see the Ordering Screen with a button with the label "For Here"
#    Then I should see customer as "Auto r" added on order screen
    And I get check number
    And I select Menu of Basic validation for QSR as "Salad"
    And I click Finish Order button
    Then I should see the Phone Order tab
    And I click the Closed check in new tab window
    And I click Pay Check button
    Then I should see the Payment window
    And I click cash button from the payment method popup
    And I click Submit button in the Payment popup
    And I click Check Stats tab
    And I click Closed tab on the Check stats
    Then I should see closed check in closed check tab
    ## Verify the sale in Service Type( TO GO )
    And I click QSR tab
    And I select the TOGO order type
    And I click Done button to select the order type
    And I click Add Customer Button
    Then I should see the add customer screen in the window
    And I Click on the Byname Option
    And Enter some name and click on Add Customer button
    Then I should see the customer profile window
    And I select search
    And I enter an existing customer's name "Auto ragav"
    And I select the customer
    When I click the Save button
    Then I should see the Ordering Screen with a button with the label "To Go"
    Then I should see customer as "Auto r" added on order screen
    And I get check number
    And I select Menu of Basic validation for QSR as "Salad"
    And I click Finish Order button
    Then I should see the Phone Order tab
    And I click the Closed check in new tab window
    And I click Pay Check button
    Then I should see the Payment window
    And I click cash button from the payment method popup
    And I click Submit button in the Payment popup
    And I click Check Stats tab
    And I click Closed tab on the Check stats
    Then I should see closed check in closed check tab
    And I click power button

  @MainBAsic
  Scenario: Sale In Service Types
    ## Verify the sale in Service Type( TO GO )
    Given I'm logged in
    ## Verify the sale in Service Type( Phone TO GO )
   # And I click QSR tab
    And I select the Phone To Go order type
    And I click Done button to select the order type
    And I click Add Customer Button
    Then I should see the add customer screen in the window
    And I Click on the Byname Option
    And Enter some name and click on Add Customer button
    Then I should see the customer profile window
    And I select search
    And I enter an existing customer's name "Auto ragav"
    And I select the customer
    When I click the Save button
    Then I should see the Ordering Screen with a button with the label "To Go"
    Then I should see customer as "Auto r" added on order screen
    And I get check number
    And I select Menu of Basic validation for QSR as "Salad"
    And I click Finish Order button
    Then I should see the Phone Order tab
    And I click the Closed check in new tab window
    And I click Pay Check button
    Then I should see the Payment window
    And I click cash button from the payment method popup
    And I click Submit button in the Payment popup
    And I click Check Stats tab
    And I click Closed tab on the Check stats
    Then I should see closed check in closed check tab
#    Scenario: Verify the sale in Service Type(Delivery)
#    Given I'm logged in
#    And I close the order type window
    And I click QSR tab
    And I select the DELIVERY order type
    And I click done button in the order type window
    Then I should see the add customer screen in the window
    And I Click on the Byname Option
    And Enter some name and click on Add Customer button
    Then I should see the customer profile window
    And I select search
    And I enter an existing customer's name "auto loyalty"
    And I select the customer for loyalty
    When I click the Save button
    Then I should see customer as "auto l" added on order screen
    And I get check number
    Then I should see Delivery charge is match with Amount in order screen
    And I select Menu of Basic validation for QSR as "Salad"
    And I click Finish Order button
    Then I should see the Phone Order tab
    And I click the Closed check in new tab window
    And I click Pay Check button
    Then I should see the Payment window
    And I click cash button from the payment method popup
    And I click Exit to return to Order Management Screen
    And I click Finish Order button
    And I click the Closed check in new tab window
    And I click active driver as "Auto D"
    Then I should see driver is offline popup
    And I click Yes button on driver is offline popup
    And I click active driver as "Auto D"
    And I click departure button
    And I click out tab in phone order screen
    And I click the Closed check in out tab
    And I click Arrival button in phone order screen
    And I click Complete tab
    Then I should see closed check in complete tab
    # Verify the sale in Service Type(Phone Delivery)
    And I click QSR tab
    And I select the Phone Delivery Service type
    And I click Done button to select the order type
    Then I should see the add customer screen in the window
    And I Click on the Byname Option
    And Enter some name and click on Add Customer button
    Then I should see the customer profile window
    And I select search
    And I enter an existing customer's name "auto loyalty"
    And I select the customer for basic
    When I click the Save button
    Then I should see customer as "auto l" added on order screen
    And I get check number
    Then I should see Delivery charge is match with Amount in order screen
    And I select Menu of Basic validation for QSR as "Salad"
    And I click Finish Order button
    Then I should see the Phone Order tab
    And I click the Closed check in new tab window
    And I click Pay Check button
    Then I should see the Payment window
    And I click cash button from the payment method popup
    And I click Exit to return to Order Management Screen
    And I click Finish Order button
    And I click the Closed check in new tab window
    And I click active driver as "Auto D"
    Then I should see driver is offline popup
    And I click Yes button on driver is offline popup
    And I click active driver as "Auto D"
    And I click departure button
    And I click out tab in phone order screen
    And I click the Closed check in out tab
    And I click Arrival button in phone order screen
    And I click Complete tab
    Then I should see closed check in complete tab
#    And I hide the keyboard
    And I click power button


  @MainBAsic
  Scenario: UpCharge (Verify the Upcharge for the check)
    Given I'm logged in
    And I closed the order type window
    And I click All
    And I click Table Layout tab
    And I click new check button on the Table layout screen
    And I select table as "T25"
    And I select the number of seats as "1"
    And I tap Continue to finish selecting the number of seats
    And I get check number
    And I select upcharge as Category
    And I select menu item as "Jelabi"
    Then I should verify subtotal value as "$ 2.58"
    Then I should verify tax value as "$ 0.26"
    Then I should verify total value as "$ 2.84"
    And I get Total of menu while cash discount applied
    And I click Cash button for Complete Sale
    When I verify total Menu same with Fast cash total when Cash discount applied
    And I click Exact button on the cash pop-up
    And I click Enter Button on the cash pop-up
    And I click Table Layout tab
    And I click Check Stats tab
    And I click Closed tab on the Check stats
    Then I should see closed check in closed check tab
    And I click closed checks details icon button
    Then I should see order summary screen
    When I verify subtotal value with order summary subtotal value
    And I click power button in the All Orders screen

  @MainBAsic
  Scenario: Upcharge (Role restriction)
    Given I'm logged in for BarTab for basic validation
    And I click New Tab in the Bar Tab Screen
    And I click the Exit to close the preauth window
    And I select upcharge as Category
    And I select menu item as "Bubble Gum"
    Then I should verify subtotal value as "$ 5.72"
    Then I should verify tax value as "$ 0.57"
    Then I should verify total value as "$ 6.29"
    And I get Total of menu while cash discount applied
    And I click Cash button for Complete Sale
    When I verify total Menu same with Fast cash total when Cash discount applied
    And I click Exact button on the cash pop-up
    And I click Enter Button on the cash pop-up
    And I click Table Layout tab
    And I click power button in the All Orders screen
    Given I'm logged in
    And I closed the order type window
    And I click All
    And I click Table Layout tab
    And I click new check button on the Table layout screen
    And I select table as "T25"
    And I select the number of seats as "1"
    And I tap Continue to finish selecting the number of seats
    And I get check number
    And I select upcharge as Category
    And I select menu item as "Bubble Gum"
    Then I should verify subtotal value as "$ 5.55"
    Then I should verify tax value as "$ 0.56"
    Then I should verify total value as "$ 6.11"
    And I get Total of menu while cash discount applied
    And I click Cash button for Complete Sale
    When I verify total Menu same with Fast cash total when Cash discount applied
    And I click Exact button on the cash pop-up
    And I click Enter Button on the cash pop-up
    And I click Table Layout tab
    And I click Check Stats tab
    And I click Closed tab on the Check stats
    Then I should see closed check in closed check tab
    And I click closed checks details icon button
    Then I should see order summary screen
    When I verify subtotal value with order summary subtotal value
    And I click power button in the All Orders screen

  @MainBAsic
  Scenario: Verify the sale in Bar Tab Service Type
    Given I'm logged in
    And I closed the order type window
#    Given I'm logged in for Phone store
#    And I closed the order type window
    And I click All
    And I click BarTab Layout
    And I click New Tab in the Bar Tab Screen
#    Then I should see preauth window
#    And I click Process button on card screen
#    Then I should see no device is connected to iPad
#    And I click Done button on the Popup
    And I click the Exit to close the preauth window
    And I get check number
    And I select Menu of Basic validation for QSR as "Salad"
    And I click Finish Order button
    Then I should see the bar tab screen
    And I click merged barTab
    And I click Payment button in the Order Management Screen
    And I click cash button from the payment method popup
    And I click Submit button on the Payment Window
    And I click power button in the All Orders screen

  @MainBAsic
  Scenario: Menu Option - Verify the Menu option for the all service type by menu level in order screen
     ## AUTOMATIC HOLD ##
    Given I'm logged in
    And I closed the order type window
#      Given I'm logged in for Phone store
#      And I closed the order type window
    And I select FOOD as category
#    And I select menu item as "Onion Rings"
#    And I select menu item  as "Onion Rings" to see menu option window
#    And I click Hold to put order on hold
#    And I click Automatic button on Hold popup
#    And I click Done in the hold window
#    Then I should see hold Icon change to Tick Icon
#    And I click Cash button for Complete Sale
#    And I click Exact button on the cash pop-up
#    And I click Enter Button on the cash pop-up
#      ####  MANUAL HOLD  ####
#    And I closed the order type window
#    And I select FOOD as category
    And I select menu item as "Onion Rings"
#    And I select menu item  as "Onion Rings" to see menu option window
#    And I click Hold to put order on hold
#    And I click Done in the hold window
#     # When I click Back to return to Order Management Screen
#    Then I should see the hold icon over the order section
      ####  FIRE   ###
    And I click menu item as "Onion Rings" to see Menu option screen
    And I click Fire to send menu item to kitchen
#    Then I should see do you want to send hold menu items to kitchen popup message
#    And I click Yes button on send to kitchen popup
      #####  VOID ITEM  #####
    And I click menu item as "Onion Rings" to see Menu option screen
    And I click void item on Menu option
    Then I should see the void reason popup
    And I click void Reason on the void popup
    And I click Add Button on the void reason popup
#    Then I should see Receipt Printer popup
#    And I click Done button on the Popup
    And I click Void button on order management screen
    Then I should see the void reason popup
    And I click void Reason on the void popup
    And I click Add Button on the void reason popup
#    Then I should see Receipt Printer popup
#    And I click Done button on the Popup
      #####  REPEAT  #####
    And I closed the order type window
    And I select FOOD as category
    And I select menu item as "mongo test"
    And I click menu item as "mongo test" to see Menu option screen
    And I click Repeat on menu option
    Then I should see Repeated menu item as "mongo test"
      ##### QUANTITY  #####
    And I click menu item as "mongo test" to see Menu option screen
    And I click Quantity on menu option
    And I click "3"
    And I click the Continue button
    Then I should see "3" is Increased
    And I click menu item as "mongo test" to see Menu option screen
    And I click Quantity on menu option
    And I click "1"
    And I click the Continue button
    Then I should see "1" is Increased
      #####  ATTACH  #####
    And I click menu item as "mongo test" to see Menu option screen
    And I click Attach on menu option
    Then I should see Add Notes popup
    And I click Add notes reason as "Spicy"
    And I click Add Button on the void reason popup
    Then I should see reason as "Spicy" on the Order screen
    And I click Void button on order management screen
    Then I should see All orders are voided
    And I click Done button on the Popup
      #####  DISCOUNT  #####
  #    And I closed the order type window
    And I select FOOD as category
    And I select menu item as "mongo test"
    And I click menu item as "mongo test" to see Menu option screen
    And I click discount on menu option
    And I click discount as "IB-AfterTax-Amount" in discount window
    Then I verify discount as "IB-AfterTax-Amount" is applied or not in order screen
    And I click Void button on order management screen
    Then I should see All orders are voided
    And I click Done button on the Popup
      ##### OPEN ITEM #####
    And I select menu item as "mongo test"
    And I click menu item as "mongo test" to see Menu option screen
    And I click Open Item button
    Then I should see open item screen
    And I click Coursing Name text field for Menu option
    And I swipe to "DESSERT" as Coursing Name
    And I pass course name as "fruits"
    And I tap Price text field for menu option
    And I enter the price with sale
    And I click Continue button on the Open Item Price numbers popup
    And I click Done button on the open item window
    Then I should navigate to Order Management screen and see the added open item as "fruits"
    And I click Void button on order management screen
    Then I should see All orders are voided
    And I click Done button on the Popup
      ##### OPEN DISCOUNT #####
    And I select menu item as "mongo test"
    Then I should see orderscreen with menu item prize as "$ 10.00"
    Then I should see the tax amount reflected to the check as "$ 1.20"
      #Then I should see the Discount amount reflected to the check as "TL 50,00"
    Then I should see orderscreen with menu item Total as "$ 11.20"
    And I click menu item as "mongo test" to see Menu option screen
    And I click Quantity on menu option
    And I click "2"
    And I click the Continue button
    Then I should see "2" is Increased
    And I click menu item as "mongo test" to see Menu option screen
    And I click Open Discount on menu option
    Then I should see Open discount Screen
    And I pass the amount on open discount for open item discount as discount Percentage1 for "After"
    Then I should see discount applied on order screen
    Then I should see orderscreen with menu item prize as "$ 20.00"
    Then I should see the tax amount reflected to the check as "$ 2.40"
    Then I should see the Discount amount reflected to the check as "$ 4.46"
    Then I should see orderscreen with menu item Total as "$ 17.94"
    And I click Void button on order management screen
    Then I should see All orders are voided
    And I click Done button on the Popup
      ######  OPEN MODIFIER  ######
    And I select menu item as "mongo test"
    And I click menu item as "mongo test" to see Menu option screen
    And I click Open Modifier on menu option
    Then I should see Open modifier Screen
    And I pass the Name as "fruits" and price on Open Modifier
    Then I should see open modifier as "fruits" added on open modifiers screen
    And I click Done button on the Popup
#    And I click Back button in the menu options window
    Then I should see modifier as "fruits" applied on order screen
    And I click Void button on order management screen
    Then I should see All orders are voided
    And I click Done button on the Popup
      #######  CHANGE COURSING  #######
    And I select menu item as "mongo test"
    And I click menu item as "mongo test" to see Menu option screen
    And I click change coursing on menu option
    And I swipe to "DESSERT" as Coursing Name
    And I click Done button on the open item window
    Then I should see coursing name as "DESSERT"
    And I click Void button on order management screen
    Then I should see All orders are voided
    And I click Done button on the Popup
    And I click log off button in order screen

  @MainBAsic
  Scenario: Check OPTIONS
         #######   TAX EXEMPT  #######

    Given I'm logged in
    And I closed the order type window

#        Given I'm logged in for Phone store
#        And I closed the order type window

    And I select FOOD as category
    And I select menu item as "Chicken Schnitzel"
    Then I should see orderscreen with menu item prize as "$ 12.00"
    Then I should see the tax amount reflected to the check as "$ 1.20"
    Then I should see orderscreen with menu item Total as "$ 13.20"
    And I click Options button
    Then I should see the Check Options screen
    And I click Tax Exempt Button
#    Then I should see tax exempt reasons
#    And I select School as reason
    Then I should see orderscreen with menu item prize as "$ 12.00"
    Then I should see the tax reflected to the check
    Then I should see orderscreen with menu item Total as "$ 12.00"
    And I click Options button
    Then I should see the Check Options screen
    And I click Tax Exempt Button
#    Then I should see Tax Exempt removed successfully popup
#    And I click Done button on the Popup
    Then I should see orderscreen with menu item prize as "$ 12.00"
    Then I should see the tax amount reflected to the check as "$ 1.20"
    Then I should see orderscreen with menu item Total as "$ 13.20"
    And I click Void button on order management screen
    Then I should see All orders are voided
    And I click Done button on the Popup
        ######  DISCOUNT  #######

    And I select FOOD as category
    And I select menu item as "mongo test"
    And I click Options button
    And I click discount on check option screen
    And I click item discount from the check options
    And I select tax as "IB-AfterTax-Amount"
    Then I should see discount as "IB-AfterTax-Amount" applied on order screen
    Then I verify Item discount is applied or not in order screen
    And I click Options button
    And I click discount on check option screen
    And I click item discount from the check options
    And I select tax as "IB-AfterTax-Amount"
    And I click Options button
    And I click discount on check option screen
    And I click check discount from the check options
    And I select tax as "Check-Based Percentage"
    Then I verify check discount is applied or not in order screen
    And I click Options button
    And I click discount on check option screen
    And I click check discount from the check options
    And I select tax as "Check-Based Percentage"
#    And I click Options button
#    Then I should see the Check Options screen
#    And I click discount on check option screen
#    And I select open check discount
#    Then I should see Open discount Screen
#       #   And I pass the amount on open discount for open check discount safety percentage whole value as 20 for "After"
#    And I pass the amount as "2.21" on open discount as "After"
#    Then I should see orderscreen with open check discount
#    Then I verify open check discount is applied or not in order screen
#    Then I should see orderscreen with menu item prize as "$ 10.00"
#    Then I should see the tax amount reflected to the check as "$ 1.20"
#    Then I should see the Discount amount reflected to the check as "$ 2.21"
#    Then I should see orderscreen with menu item Total as "$ 8.99"
#    And I click Options button
#    Then I should see the Check Options screen
#    And I click discount on check option screen
#    And I select open check discount
#    Then I should see Open discount Screen
#    And I click remove button
#    And I click Options button
#    Then I should see the Check Options screen
#    And I click discount on check option screen
#    And I select open check discount
#    Then I should see Open discount Screen
#    And I pass the amount as "40,00" on open discount as "After"
#    Then I should see discount exceeds the safety limit popup
#    And I click Done button on the Popup
#    And I click cancel button on the table layout screen
#    And I click Back button on Tax Exempt window
#    And I click Back button on Check Options Screen
#    And I click Void button on order management screen
#    Then I should see All orders are voided
#    And I click Done button on the Popup
       #   And I click log off button in order screen

          #Scenario: OPEN ITEM
          ####### Open Item #######
#            Given I'm logged in for Phone store
#            And I closed the order type window
    And I click Options button
    Then I should see the Check Options screen
    And I click Open Item button
    Then I should see open item screen
    And I click Coursing Name text field
    And I swipe to "Retails" as Coursing Name
    And I enter course name as "Open Item" for check based open item
    And I tap Price text field
    And I enter price for check based open item
    And I get the open item value from open item window
    And I click Continue button on the Open Item Price numbers popup
    And I click Done button on the open item window
#    And I click Back button on Check Options Screen
    Then I should navigate to Order Management screen and see the added open item as "Open Item"
    Then I verify the open item value from open item window with order screen
    And I click Void button on order management screen
    Then I should see All orders are voided
    And I click Done button on the Popup
    And I click log off button in order screen
  ###########   Gift Card  ##############

  @MainBAsic
  Scenario: Gift
    Given I'm logged in
    And I close the order type window
    And I click Options button
    And I click Gift card Button
    Then I should see Gift card window
    And I enter gift card number
    And I click charge amount field and pass the amount
    And I click Done button on the Popup
    Then I should see gift card amount add up into order screen
    And I click Cash button for Complete Sale
    And I click Exact button on the cash pop-up
    And I click Enter Button on the cash pop-up
    And I closed the order type window
    And I click Options button
    And I click Gift card Button
    Then I should see Gift card window
    And I enter gift card number
#    And I click charge amount field in Gift card window
    Then I verify beginning balance,recurring balance
    When I click Suspend account button in the gift card window
    Then I should see gift card inactivated successfully popup
    And I click Done button on the Popup
    And I click Done if its selectable
    And I click Active account button in the gift card window
    Then I should see gift card activated successfully popup
    And I click Done button on the Popup
    When I enter the charge amount as "124530" on the Gift card window
    And I click Done button on the Popup
    And I click Payment button in the Order Management Screen
    And I click Gift card payment in payment window
    Then I should see total screen
    And I click the Continue button on the Total screen
    Then I should see your order card screen
    And I click manual button on the your order screen
    And I pass the card number as "1111"
    And I pass card name as "Gift Card"
    And I pass expire date as "1224"
    And I click Process button on card screen
#    And I click Ok button in receipt printer popup
    And I closed the order type window
    And I click log off button in order screen

    ######## GIVE-X ###########

  @MainBAsic
  Scenario: 86 list
    Given I'm logged in
    And I closed the order type window
    And I select category as "Applicable time period"
    And I select menu item as "Pasta applicable time"
    Then I should see quantity is not enough popup
    And I click Done button on the Popup
    And I click the Settings button
    And I click 86List button in the operation window
    Then I should see 86 list window
    And I click on the search field "Chicken Rice" for searching the menu item "search menu item"
#    And I hide the keyboard
    And I click the quantity txt field in the eighty six list popup "click qty txt field"
    And I enter the quantity value as "0","0","0","8"
    Then I click "Continue" in the Quantity popup "Click Continue Button"
    And I click the Toggle Icon button
    And I click POS Icon from Toggle
    And I closed the order type window
    And I click All
    And I click Table Layout tab
    And I click new check button on the Table layout screen
    And I select table as "T18"
    And I select the number of seats as "1"
    And I tap Continue to finish selecting the number of seats
    Then I Should get back to the Order Screen
    When I get the check no in the order screen "Get Check Number"
    And I select category as "Ultimate Lunch"
    And I click "Chicken Rice" from the menu item "Click item as veg biriyani"
    Then I should verify the quantity "7" is displayed in the order screen is decreased after order with menu as "Chicken Rice"
   #####  REPEAT 86 LIST MENU  #####
    And I click menu item as "Chicken Rice" to see Menu option screen
    And I click Repeat on menu option
    Then I should see Repeated menu item as "Chicken Rice"
    Then I should verify the quantity "6" is displayed in the order screen is decreased after order with menu as "Chicken Rice"
#####  QUANTITY 86 LIST MENU  #####
    And I click menu item as "Chicken Rice" to see Menu option screen
    And I click Quantity on menu option
    And I click "3"
    And I click the Continue button
    Then I should see "3" is Increased
    Then I should verify the quantity "4" is displayed in the order screen is decreased after order with menu as "Chicken Rice"
    And I click menu item as "Chicken Rice" to see Menu option screen
    And I click Quantity on menu option
    And I click "9"
    And I click the Continue button
    Then I should see quantity is not enough popup
    And I click Done button on the Popup
    And I click Back button in the menu options window
    And I click Finish Order button
    And I click power button
#    And I click 86List button in the login screen
#    Then  I should verify the "86 List" in the eighty six list popup "verify the 86 list popup"
#    And I click on the search field "Chicken Rice" for searching the menu item "search menu item "
#    And I click "Hide keyboard" button in the keyboard "Click Back"
#    Then I should verify 86 list menu as "Chicken Rice" with quantity as "4"
#    And I click "X" in the eighty six list popup "click close button"
#    Given I'm logged in
#    And I closed the order type window
#    And I click All
#    And I click Table Layout tab
#    And I select table as "T18"
#    Then I Should get back to the Order Screen
#    And I click Void button on order management screen
#    Then I should see the void reason popup
#    And I click void Reason on the void popup
#    And I click Add Button on the void reason popup
#    Then I should see Receipt Printer popup
#    And I click Done button on the Popup
#    And I click power button

  @MainBAsic
  Scenario: Merge With Check Based Amount (Verify the Merge option from Table layout screen )
    Given I'm logged in
    And I closed the order type window
    And I click All
    And I click Table Layout tab
    And I select Menu for DineIn as "North Indian dish" for split seat order screen for merge
    And I select Discount on the Order screen
    Then I should see Check Based Discount Screen
    #And I click Discount as "IB-AfterTax-Amount"
    And I click Discount as "Check Based Amount"
    And I click Back button on Discount Screen
#    Then I should see discount as "IB-AfterTax-Amount" applied on order screen
    And I get the seat number from the check
    And I get the list of the menu from the order screen
    And I get value the menu values from order screen
    And I click Finish button
    And I click Table Layout tab
    And I select Menu for DineIn as "North Indian dish" for split seat order screen1
    And I select Discount on the Order screen
    Then I should see Check Based Discount Screen
    #And I click Discount as "IB-AfterTax-Amount"
    And I click Discount as "Check Based Amount"
    And I click Back button on Discount Screen
#    Then I should see discount as "IB-AfterTax-Amount" applied on order screen
    And I get the seat number from the check1
    And I get the list of the menu from the order screen1
    And I get value the menu values from order screen1
    And I click Finish button
    And I click Table Layout tab
    And I click Merge button
    When I click the check from the table layout for merged
    Then I should see on merging the particular checks popup
    And I click yes to open Close Till Screen
    When I click the check from the table layout for merged1
    Then I should see on merging the particular checks popup
    And I click yes to open Close Till Screen
    And I click Done button on the pop-up to complete merging
    Then I should see merge checks confirmation popup
    And I click confirm button on the merge check confirmation popup
    Then I should see the merged popup after merge
    And I click Done button on the Popup
    When I click the check from the table layout for merged
    Then I Should get back to the Order Screen
    And I verify check number from the order screen
    When I verify the seat number from the order screen
    And I select seat one
    When I verify the seat 1 order screen menu with 1st check menu
    And I select seat two
    When I verify the seat 2 order screen menu with 2nd check menu
#      When I verify the menu after merge done
    And I click table number on the order screen
  #When I verify the menu prize after merge done
    When I verify the menu prize after merge done for check based amount
    And I click Cash button for Complete Sale
    And I click Exact button on the cash pop-up
    And I click Enter Button on the cash pop-up
    And I click Table Layout tab
    And I click power button in the All Orders screen

  @MainBAsic
  Scenario: Merge with Item Based Amount (Verify the Merge option from Table layout screen )
    Given I'm logged in
    And I closed the order type window
    And I click All
    And I click Table Layout tab
    And I select Menu for DineIn as "North Indian dish" for split seat order screen for merge
    And I select Discount on the Order screen
    Then I should see Check Based Discount Screen
    And I click Discount as "IB-AfterTax-Amount"
    #  And I click Discount as "Check Based Amount"
    And I click Back button on Discount Screen
#    Then I should see discount as "IB-AfterTax-Amount" applied on order screen
    And I get the seat number from the check
    And I get the list of the menu from the order screen
    And I get value the menu values from order screen
    And I click Finish button
    And I click Table Layout tab
    And I select Menu for DineIn as "North Indian dish" for split seat order screen1
    And I select Discount on the Order screen
    Then I should see Check Based Discount Screen
    And I click Discount as "IB-AfterTax-Amount"
   #   And I click Discount as "Check Based Amount"
    And I click Back button on Discount Screen
#    Then I should see discount as "IB-AfterTax-Amount" applied on order screen
    And I get the seat number from the check1
    And I get the list of the menu from the order screen1
    And I get value the menu values from order screen1
    And I click Finish button
    And I click Table Layout tab
    And I click Merge button
    When I click the check from the table layout for merged
    Then I should see on merging the particular checks popup
    And I click yes to open Close Till Screen
    When I click the check from the table layout for merged1
    Then I should see on merging the particular checks popup
    And I click yes to open Close Till Screen
    And I click Done button on the pop-up to complete merging
    Then I should see merge checks confirmation popup
    And I click confirm button on the merge check confirmation popup
    Then I should see the merged popup after merge
    And I click Done button on the Popup
    When I click the check from the table layout for merged
    Then I Should get back to the Order Screen
    And I verify check number from the order screen
    When I verify the seat number from the order screen
    And I select seat one
    When I verify the seat 1 order screen menu with 1st check menu
    And I select seat two
    When I verify the seat 2 order screen menu with 2nd check menu
#      When I verify the menu after merge done
    And I click table number on the order screen
    When I verify the menu prize after merge done
#      When I verify the menu prize after merge done for check based amount
    And I click Cash button for Complete Sale
    And I click Exact button on the cash pop-up
    And I click Enter Button on the cash pop-up
    And I click Table Layout tab
    And I click power button in the All Orders screen

  @MainBAsic
  Scenario: Verify the Merge option from Bar Tab screen
    Given I'm logged in
    And I closed the order type window
    And I click All
    And I click BarTab Layout
    And I click NewTab from BarTab Layout
#    And I click "Exit" in the preauth popup "click Exit Button"
#    And I select Menu For Bartab order type as "IceCreams" for split Check
    And I select Menu For Bartab order type as "North Indian dish" for merge Check
    And I get the seat number from the check
    And I get the list of the menu from the order screen
    And I get value the menu values from order screen
    And I click Finish button
    And I click BarTab Layout
    And I click NewTab from BarTab Layout
#    And I click "Exit" in the preauth popup "click Exit Button"
    And I select Menu For Bartab order type as "North Indian dish" for merge Check1
    And I get the seat number from the check1
    And I get the list of the menu from the order screen1
    And I get value the menu values from order screen1
    And I click Finish button
    And I click BarTab Layout
    And I click Merge button
    When I click the check from the bartab screen for merge
#    And I hide the keyboard
    When I click the check from the bartab screen1 for merge
#    And I hide the keyboard
    And I click Done button to merge checks
    Then I should see the merged popup after merge
    And I click Done button on the Popup
#    And I click clear text button
    When I click the check from the bartab screen
    Then I Should get back to the Order Screen
    And I verify check number from the order screen
    When I verify the seat number from the order screen
    And I select seat one
    When I verify the seat 1 order screen menu with 1st check menu
    And I select seat two
    When I verify the seat 2 order screen menu with 2nd check menu
#      When I verify the menu after merge done
    And I click table number on the order screen
    When I verify the menu prize after merge done for bartab only
    And I click Cash button for Complete Sale
    And I click Exact button on the cash pop-up
    And I click Enter Button on the cash pop-up
    And I click BarTab Layout
    And I click power button in the All Orders screen



  Scenario: Split Check from Table layout
     ####  Split Check from Table layout/bar tab Screen  ####
    Given I'm logged in
    And I closed the order type window
    And I click All
    And I click Table Layout tab
    And I select Menu For Dine order type as "North Indian dish" for split Check
    And I click Finish button
    And I click Check Stats tab
    Then I should see active check
    And I hide the keyboard
    And I click Table Layout tab
#      And I select Menu For Dine order type as "Salad" for split Check
#      And I click finish button
#      And I click Check Stats tab
#      Then I should see active check
#      And I hide the keyboard
#      And I click Table Layout tab
    And I click the Split Button from the Table Layout Screen
    And I click split check button
    When I click the check from the table layout
    Then I should see the Split check screen
    When I verify the Active check with split check

      ##### ADD ######
    And I click Add Button on the split check screen
    Then I should see new check added on the split check screen
    And I click the menu on the split check screen
    And I click new check added on the split check screen
    When I verify the menu is moved to the added check seat
    And I click new check added on the split check screen

       ####  PRINT   ####
    And I click print button in the split check screen
    Then I should see please save all the changes to print popup
    And I click yes to open Close Till Screen
    Then I should see Receipt Printer popup
    And I click Done button on the Popup
    When I verify the check is splitted and check number is increased

      ####  PRINT ALL  ####
    And I click print All Button in the split check screen
    Then I should see Receipt Printer popup
    And I click Done button on the Popup

      ##### Separate Item  #####
    And I click the menu on the split check screen
    And I click Seperate item button
    And I select the number of split item "2" for Split check
    And I click the Continue button
    Then I should see menu has separated as "2"
    And I click the save & close button on the split screen
    Then I Should get back to the Order Screen
    When I verify primary check is opened after split check is done
    And I click Cash button for Complete Sale
    And I click Exact button on the cash pop-up
    And I click Enter Button on the cash pop-up
    And I click Table Layout tab
    And I click Check Stats tab
    When I verify the splitted check is available in active checks tab
#      And I click power button

    #######  SPLIT BY SEAT  ########

    And I click Table Layout tab
    And I select Menu For Dine order type as "North Indian dish" for split Check
    And I click Finish button
    And I click Check Stats tab
    Then I should see active check
    And I hide the keyboard
    And I click Table Layout tab
    And I click the Split Button from the Table Layout Screen
    And I click split check button
    When I click the check from the table layout
    Then I should see the Split check screen
    When I verify the Active check with split check
    Then I should see seat available in the split check
    And I click split by seat in the split check screen
    Then I should see new check added on the split check screen
    And I click the menu on the split check screen
    And I click new check added on the split check screen
    When I verify the menu is moved to the added check seat
    And I click new check added on the split check screen

       ####  PRINT   ####
    And I click print button in the split check screen
    Then I should see please save all the changes to print popup
    And I click yes to open Close Till Screen
    Then I should see Receipt Printer popup
    And I click Done button on the Popup
    When I verify the check is splitted and check number is increased
    And I click print All Button in the split check screen
    Then I should see Receipt Printer popup
    And I click Done button on the Popup
    And I click the menu on the split check screen
    And I click Seperate item button
    And I select the number of split item "2" for Split check
    And I click the Continue button
    Then I should see menu has separated as "2"
    And I click the save & close button on the split screen
    Then I Should get back to the Order Screen
    When I verify primary check is opened after split check is done
    And I click Cash button for Complete Sale
    And I click Exact button on the cash pop-up
    And I click Enter Button on the cash pop-up
    And I click Table Layout tab
    And I click Check Stats tab
    When I verify the splitted check is available in active checks tab
    And I click power button


  @Merge09
  Scenario: Split Check By BarTab Screen
  #######  Split Check By BarTab Screen  #######
    Given I'm logged in
    And I closed the order type window
    And I click All
    And I click BarTab Layout
    And I click NewTab from BarTab Layout
    And I click "Exit" in the preauth popup "click Exit Button"
    And I click add button to create seat in order screen
    And I click seat 1 for add menu item
    And I select Menu For Bartab order type as "North Indian dish" for split Check
    And I click Finish button
    And I click Check Stats tab
    Then I should see active check
    And I hide the keyboard
    And I click BarTab Layout
    And I click split button on the bartab screen
    And I click split check button
    When I click the check from the bartab screen
    Then I should see the Split check screen
    When I verify the Active check with split check

 ##### ADD ######
    And I click Add Button on the split check screen
    Then I should see new check added on the split check screen
    And I click the menu on the split check screen
    And I click new check added on the split check screen
    When I verify the menu is moved to the added check seat
    And I click new check added on the split check screen

       ####  PRINT   ####
    And I click print button in the split check screen
    Then I should see please save all the changes to print popup
    And I click yes to open Close Till Screen
    Then I should see Receipt Printer popup
    And I click Done button on the Popup
    When I verify the check is splitted and check number is increased

      ####  PRINT ALL  ####
    And I click print All Button in the split check screen
    Then I should see Receipt Printer popup
    And I click Done button on the Popup

      ##### Separate Item  #####
    And I click the menu on the split check screen
    And I click Seperate item button
    And I select the number of split item "2" for Split check
    And I click the Continue button
    Then I should see menu has separated as "2"
    And I click the save & close button on the split screen
    Then I Should get back to the Order Screen
    When I verify primary check is opened after split check is done
    And I click Cash button for Complete Sale
    And I click Exact button on the cash pop-up
    And I click Enter Button on the cash pop-up
    And I click BarTab Layout
    And I click Check Stats tab
    When I verify the splitted check is available in active checks tab
#      And I click power button

    #######  SPLIT BY SEAT  ########

    And I click BarTab Layout
    And I click NewTab from BarTab Layout
    And I click "Exit" in the preauth popup "click Exit Button"
    And I click add button to create seat in order screen
    And I click seat 1 for add menu item
    And I select Menu For Bartab order type as "North Indian dish" for split Check
    And I click Finish button
    And I click Check Stats tab
    Then I should see active check
    And I hide the keyboard
    And I click BarTab Layout
    And I click split button on the bartab screen
    And I click split check button
    When I click the check from the bartab screen
    Then I should see the Split check screen
    When I verify the Active check with split check
    Then I should see seat available in the split check1
    And I click split by seat in the split check screen
    Then I should see new check added on the split check screen
    And I click the menu on the split check screen
    And I click new check added on the split check screen
    When I verify the menu is moved to the added check seat
    And I click new check added on the split check screen

       ####  PRINT   ####
    And I click print button in the split check screen
    Then I should see please save all the changes to print popup
    And I click yes to open Close Till Screen
    Then I should see Receipt Printer popup
    And I click Done button on the Popup
    When I verify the check is splitted and check number is increased
    And I click print All Button in the split check screen
    Then I should see Receipt Printer popup
    And I click Done button on the Popup
    And I click the menu on the split check screen
    And I click Seperate item button
    And I select the number of split item "2" for Split check
    And I click the Continue button
    Then I should see menu has separated as "2"
    And I click the save & close button on the split screen
    Then I Should get back to the Order Screen
    When I verify primary check is opened after split check is done
    And I click Cash button for Complete Sale
    And I click Exact button on the cash pop-up
    And I click Enter Button on the cash pop-up
#    And I click BarTab Layout
    And I click Check Stats tab
    When I verify the splitted check is available in active checks tab
    And I click power button


  Scenario: Split Check From Order Screen (Table Layout)
    Given I'm logged in
    And I closed the order type window
    And I click All
    And I click Table Layout tab
    And I select Menu for DineIn as "North Indian dish" for split check order screen
    And I click the split check from Order screen
    Then I should see menu items has to be sent to the kitchen
    And I click Yes button on send to kitchen popup
    Then I should see the Split check screen
    When I verify the Active check with split check
 ##### ADD ######
    And I click Add Button on the split check screen
    Then I should see new check added on the split check screen
    And I click the menu on the split check screen
    And I click new check added on the split check screen
    When I verify the menu is moved to the added check seat
    And I click new check added on the split check screen

       ####  PRINT   ####
    And I click print button in the split check screen
    Then I should see please save all the changes to print popup
    And I click yes to open Close Till Screen
    Then I should see Receipt Printer popup
    And I click Done button on the Popup
    When I verify the check is splitted and check number is increased

      ####  PRINT ALL  ####
    And I click print All Button in the split check screen
    Then I should see Receipt Printer popup
    And I click Done button on the Popup

      ##### Separate Item  #####
    And I click the menu on the split check screen
    And I click Seperate item button
    And I select the number of split item "2" for Split check
    And I click the Continue button
    Then I should see menu has separated as "2"
    And I click the save & close button on the split screen
    Then I Should get back to the Order Screen
    When I verify primary check is opened after split check is done
    And I click Cash button for Complete Sale
    And I click Exact button on the cash pop-up
    And I click Enter Button on the cash pop-up
    And I click Table Layout tab
    And I click Check Stats tab
    When I verify the splitted check is available in active checks tab

  ###########  SPLIT BY SEAT #########
    And I click Table Layout tab
    And I select Menu for DineIn as "North Indian dish" for split check order screen
    And I click the split check from Order screen
    Then I should see menu items has to be sent to the kitchen
    And I click Yes button on send to kitchen popup
    Then I should see the Split check screen
    When I verify the Active check with split check
    Then I should see seat available in the split check
    And I click split by seat in the split check screen
    Then I should see new check added on the split check screen
    And I click the menu on the split check screen
    And I click new check added on the split check screen
    When I verify the menu is moved to the added check seat
    And I click new check added on the split check screen

       ####  PRINT   ####
    And I click print button in the split check screen
    Then I should see please save all the changes to print popup
    And I click yes to open Close Till Screen
    Then I should see Receipt Printer popup
    And I click Done button on the Popup
    When I verify the check is splitted and check number is increased
    And I click print All Button in the split check screen
    Then I should see Receipt Printer popup
    And I click Done button on the Popup
    And I click the menu on the split check screen
    And I click Seperate item button
    And I select the number of split item "2" for Split check
    And I click the Continue button
    Then I should see menu has separated as "2"
    And I click the save & close button on the split screen
    Then I Should get back to the Order Screen
    When I verify primary check is opened after split check is done
    And I click Cash button for Complete Sale
    And I click Exact button on the cash pop-up
    And I click Enter Button on the cash pop-up
    And I click Table Layout tab
    And I click Check Stats tab
    When I verify the splitted check is available in active checks tab
    And I click power button

  @Merge09
  Scenario: Split Check From Order Screen (Bartab Layout)
    Given I'm logged in
    And I closed the order type window
    And I click All
    And I click BarTab Layout
    And I click NewTab from BarTab Layout
    And I click "Exit" in the preauth popup "click Exit Button"
    And I click add button to create seat in order screen
    And I click seat 1 for add menu item
    And I select Menu For Bartab order type as "North Indian dish" for split Check
    And I click the split check from Order screen
    Then I should see menu items has to be sent to the kitchen
    And I click Yes button on send to kitchen popup
    Then I should see the Split check screen
    When I verify the Active check with split check

    ##### ADD ######
    And I click Add Button on the split check screen
    Then I should see new check added on the split check screen
    And I click the menu on the split check screen
    And I click new check added on the split check screen
    When I verify the menu is moved to the added check seat
    And I click new check added on the split check screen

       ####  PRINT   ####
    And I click print button in the split check screen
    Then I should see please save all the changes to print popup
    And I click yes to open Close Till Screen
    Then I should see Receipt Printer popup
    And I click Done button on the Popup
    When I verify the check is splitted and check number is increased

      ####  PRINT ALL  ####
    And I click print All Button in the split check screen
    Then I should see Receipt Printer popup
    And I click Done button on the Popup

      ##### Separate Item  #####
    And I click the menu on the split check screen
    And I click Seperate item button
    And I select the number of split item "2" for Split check
    And I click the Continue button
    Then I should see menu has separated as "2"
    And I click the save & close button on the split screen
    Then I Should get back to the Order Screen
    When I verify primary check is opened after split check is done
    And I click Cash button for Complete Sale
    And I click Exact button on the cash pop-up
    And I click Enter Button on the cash pop-up
    And I click Table Layout tab
    And I click Check Stats tab
    When I verify the splitted check is available in active checks tab

  ###########  SPLIT BY SEAT #########
    And I click BarTab Layout
    And I click NewTab from BarTab Layout
    And I click "Exit" in the preauth popup "click Exit Button"
    And I click add button to create seat in order screen
    And I click seat 1 for add menu item
    And I select Menu For Bartab order type as "North Indian dish" for split Check
    And I click the split check from Order screen
    Then I should see menu items has to be sent to the kitchen
    And I click Yes button on send to kitchen popup
    Then I should see the Split check screen
    When I verify the Active check with split check
    Then I should see seat available in the split check1
    And I click split by seat in the split check screen
    Then I should see new check added on the split check screen
    And I click the menu on the split check screen
    And I click new check added on the split check screen
    When I verify the menu is moved to the added check seat
    And I click new check added on the split check screen

       ####  PRINT   ####
    And I click print button in the split check screen
    Then I should see please save all the changes to print popup
    And I click yes to open Close Till Screen
    Then I should see Receipt Printer popup
    And I click Done button on the Popup
    When I verify the check is splitted and check number is increased
    And I click print All Button in the split check screen
    Then I should see Receipt Printer popup
    And I click Done button on the Popup
    And I click the menu on the split check screen
    And I click Seperate item button
    And I select the number of split item "2" for Split check
    And I click the Continue button
    Then I should see menu has separated as "2"
    And I click the save & close button on the split screen
    Then I Should get back to the Order Screen
    When I verify primary check is opened after split check is done
    And I click Cash button for Complete Sale
    And I click Exact button on the cash pop-up
    And I click Enter Button on the cash pop-up
    And I click Table Layout tab
    And I click Check Stats tab
    When I verify the splitted check is available in active checks tab
    And I click power button

  @Merge
  Scenario: Split Seat from Table layout/bar tab Screen
    Given I'm logged in
    And I closed the order type window
    And I click All
    And I click Table Layout tab
    And I select Menu For Dine order type as "North Indian dish" for split seat
    And I click Finish button
    And I click Check Stats tab
    Then I should see active check
    And I hide the keyboard
    And I click Table Layout tab
    And I click the Split Button from the Table Layout Screen
    And I click the Split By Seat on the Pop-up
    When I click the check from the table layout
    Then I should see the Split Screen
    When I verify the split seat is avilable in split seat screen

      ##### ADD ######
    And I click Add Button to create Seat
    Then I should see created new seat
    And I click the menu on the split check screen
    And I click new check added on the split check screen
    When I verify the menu is moved to the added check seat
    And I click new check added on the split check screen

       ####  PRINT   ####
    And I click print button in the split seat screen
#  Then I should see please save all the changes to print popup
#  And I click yes to open Close Till Screen
    Then I should see Receipt Printer popup
    And I click Done button on the Popup
    When I verify the check is splitted and check number is increased

      ####  PRINT ALL  ####
    And I click print All button in the split seat screen
    Then I should see Receipt Printer popup
    And I click Done button on the Popup

#####  SEPERATE ITEM #######

    And I click the menu on the split check screen
    And I click Seperate item button
    And I select the number of split item "2" for Split check
    And I click the Continue button
    Then I should see menu has separated as "2"
    And I click the save & close button on the split screen
    Then I Should get back to the Order Screen
#  And I select Menu of Basic validation for QSR as "Appetizers"
#  And I verify split seat prize with order screen prize
    And I click Finish button
    And I click Table Layout tab
    And I click the Split Button from the Table Layout Screen
    And I click the Split By Seat on the Pop-up
    When I click the check from the table layout
    Then I should see the Split Screen
    When I verify the split seat is avilable in split seat screen


  ######  SPLIT EVENLY  ###########
    And I click Split Evenly Button
    Then I should see Seperate Item is Disable
    And I get seat 1 prize details
    Then I should verify menu is splitted evenly
#  And I verify seat 1 prize and seat 2 prize is same

  #########  GROUP SEATS  ###########

    And I get seat 1 prize details
    And I get seat 2 prize details
    And I click new check added on the split check screen
    And I click seat one on the split screen
    And I click the Group Seats button in the Split Seat
    When I verify all menu is club into single seat after click group seat
    And I get menu details from the group seat 2
    And I verify prize details after group seats done
    And I click the save & close button on the split screen
    Then I Should get back to the Order Screen
    And I click Seat 2 for add menu item
#  And I select Menu of Basic validation for QSR as "Appetizers"
    When I verify split seat menu with order screen menu
    And I verify split seat prize with order screen prize
    And I click Finish button
    And I click Table Layout tab
    And I click the Split Button from the Table Layout Screen
    And I click the Split By Seat on the Pop-up
    When I click the check from the table layout
    Then I should see the Split Screen
    When I verify the split seat is avilable in split seat screen

  ##########  PAY  ############

    And I click new check added on the split check screen
    And I click Pay Button in Split Screen
    Then I should see the Payment window
    And I click cash button from the payment method popup
    And I click Exit to return to Order Management Screen
    When I verify seat as paid
    And I click Split Evenly Button
    Then I should see cannot split as payments popup
    And I click Done button on the Popup
    And I click the menu on the split seat screen
    And I click seat one on the split screen
    Then I should see order cannot moved popup message1
    And I click the save & close button on the split screen
    And I click Finish button
    And I click Check Stats tab
    Then I should see active check
    And I hide the keyboard
    And I click Table Layout tab
    And I click power button

  @Merge09
  Scenario: Split Seat from bar tab Screen
    Given I'm logged in
    And I closed the order type window
    And I click All
    And I click BarTab Layout
    And I click NewTab from BarTab Layout
    And I click "Exit" in the preauth popup "click Exit Button"
#    And I click add button to create seat in order screen
#    And I click seat 1 for add menu item
    And I select Menu For Bartab order type as "North Indian dish" for split Check
    And I click Finish button
    And I click Check Stats tab
    Then I should see active check
    And I hide the keyboard
    And I click BarTab Layout
    And I click split button on the bartab screen
#    And I click split check button

#    Then I should see the Split check screen
#    When I verify the Active check with split check

#    And I click the Split Button from the Table Layout Screen
    And I click the Split By Seat on the Pop-up
    When I click the check from the bartab screen
    Then I should see the Split Screen
    When I verify the split seat is avilable in split seat screen

      ##### ADD ######
    And I click Add Button to create Seat
    Then I should see created new seat
    And I click the menu on the split check screen
    And I click new check added on the split check screen
    When I verify the menu is moved to the added check seat
    And I click new check added on the split check screen

       ####  PRINT   ####
    And I click print button in the split seat screen
#  Then I should see please save all the changes to print popup
#  And I click yes to open Close Till Screen
    Then I should see Receipt Printer popup
    And I click Done button on the Popup
    When I verify the check is splitted and check number is increased

      ####  PRINT ALL  ####
    And I click print All button in the split seat screen
    Then I should see Receipt Printer popup
    And I click Done button on the Popup

#####  SEPERATE ITEM #######

    And I click the menu on the split check screen
    And I click Seperate item button
    And I select the number of split item "2" for Split check
    And I click the Continue button
    Then I should see menu has separated as "2"
    And I click the save & close button on the split screen
    Then I Should get back to the Order Screen
#  And I select Menu of Basic validation for QSR as "Appetizers"
#  And I verify split seat prize with order screen prize
    And I click Finish button
    And I click BarTab Layout
#    And I click the Split Button from the Table Layout Screen
    And I click split button on the bartab screen
    And I click the Split By Seat on the Pop-up
    When I click the check from the bartab screen
    Then I should see the Split Screen
    When I verify the split seat is avilable in split seat screen


  ######  SPLIT EVENLY  ###########
    And I click Split Evenly Button
    Then I should see Seperate Item is Disable
    And I get seat 1 prize details
    Then I should verify menu is splitted evenly
#    And I verify seat 1 prize and seat 2 prize is same

  #########  GROUP SEATS  ###########

    And I get seat 1 prize details
    And I get seat 2 prize details
    And I click new check added on the split check screen
    And I click seat one on the split screen
    And I click the Group Seats button in the Split Seat
    When I verify all menu is club into single seat after click group seat
    And I get menu details from the group seat 2
    And I verify prize details after group seats done
    And I click the save & close button on the split screen
    Then I Should get back to the Order Screen
    And I click Seat 2 for add menu item
#  And I select Menu of Basic validation for QSR as "Appetizers"
    When I verify split seat menu with order screen menu
    And I verify split seat prize with order screen prize
    And I click Finish button
    And I click BarTab Layout
#    And I click the Split Button from the Table Layout Screen
    And I click split button on the bartab screen
    And I click the Split By Seat on the Pop-up
    When I click the check from the bartab screen
    Then I should see the Split Screen
    When I verify the split seat is avilable in split seat screen

  ##########  PAY  ############

    And I click new check added on the split check screen
    And I click Pay Button in Split Screen
    Then I should see the Payment window
    And I click cash button from the payment method popup
    And I click Exit to return to Order Management Screen
    When I verify seat as paid
    And I click Split Evenly Button
    Then I should see cannot split as payments popup
    And I click Done button on the Popup
    And I click the menu on the split seat screen
    And I click seat one on the split screen
    Then I should see order cannot moved popup message1
    And I click the save & close button on the split screen
    And I click Finish button
    And I click Check Stats tab
    Then I should see active check
    And I hide the keyboard
    And I click BarTab Layout
    And I click power button

  @bsci
  Scenario: Split Seat from Order Screen
    Given I'm logged in
    And I closed the order type window
    And I click All
    And I click Table Layout tab
#  And I click new check button on the Table layout screen
#  And I select table as "T19"
#  And I select the number of seats as "1"
#  And I tap Continue to finish selecting the number of seats
    And I select Menu for DineIn as "North Indian dish" for split seat order screen
    And I click the split seat from Order screen
    Then I should see the Split Screen
    When I verify the split seat is avilable in split seat screen

      ##### ADD ######
    And I click Add Button to create Seat
    Then I should see created new seat
    And I click the menu on the split check screen
    And I click new check added on the split check screen
    When I verify the menu is moved to the added check seat
    And I click new check added on the split check screen

       ####  PRINT   ####
    And I click print button in the split seat screen
#  Then I should see please save all the changes to print popup
#  And I click yes to open Close Till Screen
    Then I should see item need to send to kitchen popup
    And I click yes to open Close Till Screen
    Then I should see Receipt Printer popup
    And I click Done button on the Popup
    When I verify the check is splitted and check number is increased

      ####  PRINT ALL  ####
    And I click print All button in the split seat screen
    Then I should see item need to send to kitchen popup
    And I click yes to open Close Till Screen
    Then I should see Receipt Printer popup
    And I click Done button on the Popup

#####  SEPERATE ITEM #######

    And I click the menu on the split check screen
    And I click Seperate item button
    And I select the number of split item "2" for Split check
    And I click the Continue button
    Then I should see menu has separated as "2"
    And I click the save & close button on the split screen
    Then I Should get back to the Order Screen
    And I click the split seat from Order screen

    Then I should see the Split Screen
    When I verify the split seat is avilable in split seat screen


  ######  SPLIT EVENLY  ###########
    And I click Split Evenly Button
    Then I should see Seperate Item is Disable
    And I get seat 1 prize details
    Then I should verify menu is splitted evenly
  #  And I verify seat 1 prize and seat 2 prize is same

  #########  GROUP SEATS  ###########

    And I get seat 1 prize details
    And I get seat 2 prize details
    And I click new check added on the split check screen
    And I click seat one on the split screen
    And I click the Group Seats button in the Split Seat
    When I verify all menu is club into single seat after click group seat
    And I get menu details from the group seat 2
    And I verify prize details after group seats done
    And I click the save & close button on the split screen
    Then I Should get back to the Order Screen
    And I click Seat 2 for add menu item
#  And I select Menu of Basic validation for QSR as "Appetizers"
    When I verify split seat menu with order screen menu
    And I verify split seat prize with order screen prize
#    And I click Finish button
#    And I click Table Layout tab
#    And I click the Split Button from the Table Layout Screen
#    And I click the Split By Seat on the Pop-up
#    When I click the check from the table layout
    And I click the split seat from Order screen
    Then I should see the Split Screen
    When I verify the split seat is avilable in split seat screen

  ##########  PAY  ############

    And I click new check added on the split check screen
    And I click Pay Button in Split Screen
    Then I should see the Payment window
    And I click cash button from the payment method popup
    And I click Exit to return to Order Management Screen
    When I verify seat as paid
    And I click Split Evenly Button
    Then I should see cannot split as payments popup
    And I click Done button on the Popup
    And I click the menu on the split seat screen
    And I click seat one on the split screen
    Then I should see order cannot moved popup message1
    And I click Done button on the Popup
    And I click the save & close button on the split screen
    And I click Finish button
    And I click Check Stats tab
    Then I should see active check
    And I hide the keyboard
    And I click Table Layout tab
    And I click power button in the All Orders screen



  @MainBAsic
  Scenario: Price Level ( Customer Mapped in membership by BO level )
    Given I'm logged in
    And I closed the order type window
    And I click All
    And I click Table Layout tab
    And I click new check button on the Table layout screen
    And I select table as "T22"
    And I select the number of seats as "1"
    And I tap Continue to finish selecting the number of seats
    And I select category as "Menu"
    And I select menu item as "lattoos"
    When I should verify subtotal value as "$ 5.15"
    And I click Void button on order management screen
    Then I should see All orders are voided
    And I click Done button on the Popup
    And I click Add Customer Button
    Then I should see the add customer screen in the window
    And I Click on the Byname Option
    And Enter some name and click on Add Customer button
    Then I should see the customer profile window
    And I select search
    And I enter an existing customer's name "auto membership"
    And I select the customer
    When I click the Save button
    Then I Should get back to the Order Screen
    Then I should see customer as "auto m" added on order screen
    And I get check number
    And I select category as "Menu"
    And I select menu item as "lattoos"
    When I should verify subtotal value as "$ 7.51"
    And I should verify tax value as "$ 0.75"
    And I click Payment button in the Order Management Screen
    And I verify subtotal value with cash value in payemnt screen
    And I click cash button from the payment method popup
    And I click Submit button in the Payment popup
    And I click Check Stats tab
    And I click Closed tab on the Check stats
    Then I should see closed check in closed check tab
    And I click closed checks details icon button
    Then I should see order summary screen
    When I verify subtotal value with order summary subtotal value
    And I click power button in the All Orders screen

  @MainBAsic
  Scenario: Customer Mapped in membership by iPad level
    Given I'm logged in
    And I closed the order type window
    And I click All
    And I click Table Layout tab
    And I click new check button on the Table layout screen
    And I select table as "T22"
    And I select the number of seats as "1"
    And I tap Continue to finish selecting the number of seats
    And I click Add Customer Button
    Then I should see the add customer screen in the window
    And I Click on the Byname Option
    And Enter some name and click on Add Customer button
    Then I should see the customer profile window
    And I select search
    And I enter an existing customer's name "auto membership1"
    And I select the customer
    When I click the Save button
#     And I select search
    Then I should see customer as "auto m" added on order screen
    And I get check number
    And I select category as "Menu"
    And I select menu item as "lattoos"
    When I should verify subtotal value as "$ 7.51"
    And I should verify tax value as "$ 0.75"
    And I click Payment button in the Order Management Screen
    And I verify subtotal value with cash value in payemnt screen
    And I click cash button from the payment method popup
    And I click Submit button in the Payment popup
    And I click Check Stats tab
    And I click Closed tab on the Check stats
    Then I should see closed check in closed check tab
    And I click closed checks details icon button
    Then I should see order summary screen
    When I verify subtotal value with order summary subtotal value
    And I click power button in the All Orders screen

  @MainBAsic
  Scenario: Display group Price Level
    Given I'm logged in
    And I closed the order type window
    And I click All
    And I click Table Layout tab
    And I click new check button on the Table layout screen
    And I select table as "T22"
    And I select the number of seats as "1"
    And I tap Continue to finish selecting the number of seats
    And I get check number
    And I select category as "Membership"
    And I select menu item as "lattoos"
    When I should verify subtotal value as "$ 7.51"
    And I should verify tax value as "$ 0.75"
    And I click Payment button in the Order Management Screen
    And I verify subtotal value with cash value in payemnt screen
    And I click cash button from the payment method popup
    And I click Submit button in the Payment popup
    And I click Check Stats tab
    And I click Closed tab on the Check stats
    Then I should see closed check in closed check tab
    And I click closed checks details icon button
    Then I should see order summary screen
    When I verify subtotal value with order summary subtotal value
    And I click power button in the All Orders screen

  @MainBAsic
  Scenario: Reopen the closed checks and validate the tax, total, Subtotal
    Given I'm logged in
    And I closed the order type window
    And I click All
    And I click Table Layout tab
    And I click new check button on the Table layout screen
    And I select table as "T19"
    And I select the number of seats as "1"
    And I tap Continue to finish selecting the number of seats
    And I get check number
    And I select FOOD as category
    And I select menu item as "mongo test"
    And I get value the menu values from order screen
    And I click Cash button for Complete Sale
    And I click Exact button on the cash pop-up
    And I click Enter Button on the cash pop-up
    And I click Table Layout tab
    And I click Check Stats tab
    And I click Closed tab on the Check stats
    And I click the Closed check on check stats
    And I click reopen check button on the check stats screen
    Then I Should get back to the Order Screen
    When I validate the menu values in the order screen
    And I click Payment button in the Order Management Screen
    And I click submit button
    And I click Table Layout tab
    And I click power button in the All Orders screen

  @MainBAsic
    Scenario: When applying 2 different fixed gratuity for 3 seat it taking only one fixed gratuity
      Given I'm logged in
      And I closed the order type window
      And I click All
      And I click Table Layout tab
      And I select the random table from the table layout
      And I select category as "FOOD"
      And I select menu item as "Chicken Schnitzel"
      And I should verify subtotal value as "$ 12.00"
      And I should verify tax value as "$ 1.20"
      And I should verify total value as "$ 13.20"
      ### Second Seat Creation ###
      And I click add button to create seat in order screen
      And I select category as "FOOD"
      And I select menu item as "Chicken Schnitzel"
      And I should verify subtotal value as "$ 12.00"
      And I should verify tax value as "$ 1.20"
      And I should verify total value as "$ 13.20"
            ### Third Seat Creation ###
      And I click add button to create seat in order screen
      Then I should see Add Gratuity screen
      And I select auto gratuity as "Fixxy1"
      When I click table number on the order screen
      Then I should verify the gratuity value after add auto gratuity value as "8"
      And I select seat as "3" on the order screen
      And I select category as "FOOD"
      And I select menu item as "Chicken Schnitzel"
      And I should verify subtotal value as "$ 12.00"
      And I should verify tax value as "$ 1.20"
      And I should verify gratuity value as "$ 0.96"
      And I should verify cash option value as "$ 14.16" with Gratuity
      ###  Four Seat Creation ###
      And I click add button to create seat in order screen
      And I select category as "FOOD"
      And I select menu item as "Chicken Schnitzel"
      Then I should verify the gratuity value after add auto gratuity value as "12"
      And I should verify subtotal value as "$ 12.00"
      And I should verify tax value as "$ 1.20"
      And I should verify gratuity value as "$ 1.44"
      And I should verify cash option value as "$ 14.64" with Gratuity
      And I click Void button on order management screen
      Then I should see All orders are voided
      And I click Done button on the Popup
      And I click All
      And I click power button in the All Orders screen

  @MainBAsic
  Scenario: LIN-22163 - Gratuity value is mismatching, when applying auto gratuity
    Given I'm logged in
    And I closed the order type window
    And I click All
    And I click Table Layout tab
    And I click new check button on the Table layout screen
    And I select table as "T18"
    And I select the number of seats as "1"
    And I click the Continue button
    And I get check number
    And I select category as "FOOD"
    And I select menu item as "Onion Rings"

 ## 4. Add second seat in the respective check
    When I verify auto gratuity is applied or not
    And I add a new seat
    And I add a new seat
    Then I should see Add Gratuity screen
#    And I click auto Gratuity varying button
    And I select auto gratuity as "Auto vary Gratuity"
    Then I should see enter Percentage popup
    And I pass the value and click Apply button
    And I select Menu of Basic validation for QSR as "Salad"
    When I verify auto gratuity is applied or not

 #   And I verify varying gratuity is applied
    And I click Payment button in the Order Management Screen
    And I click cash button from the payment method popup
    And I click Submit button on the Payment Window
    And I click Table Layout tab
    And I click power button in the All Orders screen

  @MainBAsic
Scenario: LIN - 22195 - Application crash : When we delete the repeat order item
  Given I'm logged in
  And I closed the order type window
    And I click Add Customer Button
    Then I should see the add customer screen in the window
    And I Click on the Byname Option
    And Enter some name and click on Add Customer button
    Then I should see the customer profile window
    And I select search
    And I enter an existing customer's name "Auto test"
    And I select the customer
    When I click the Save button
  And I get check number
  And I select category as "FOOD"
  And I select menu item as "Onion Rings"
  And I select menu item as "Pancake"
  And I get the menu from the order screen
  And I should verify subtotal value as "$ 10.00"
  And I should verify tax value as "$ 1.21"
  And I should verify total2 value as "$ 11.66"
  And I should verify paid amount0 as "$ 0.00"
    And I should verify cash price value as "$ 11.10"
  And I click Cash button for Complete Sale
  And I click Exact button on the cash pop-up
  And I click Enter Button on the cash pop-up
  And I closed the order type window
    And I click Add Customer Button
    Then I should see the add customer screen in the window
    And I Click on the Byname Option
    And Enter some name and click on Add Customer button
    Then I should see the customer profile window
    And I select search
    And I enter an existing customer's name "Auto test"
    And I select the customer
      And I wait sometimes
  And I verify the customer previous order menu with order menu
  And I select the previous order on customer profile screen
  And I click repeat Order button on the customer profile window
  And I wait sometimes
  Then I Should get back to the Order Screen
  And I delete the menu item in the order screen
  And I should verify subtotal value as "$ 9.00"
  And I should verify tax value as "$ 0.90"
  And I should verify total2 value as "$ 9.90"
  And I should verify paid amount as "$ 0.00"
  And I click Payment button in the Order Management Screen
  And I click cash button from the payment method popup
  And I click Submit button on the Payment Window
  And I closed the order type window
  And I click log off button in order screen


  @MainBAsic
  Scenario: LIN-22594 - Gratuity amounts disappears from the check in the following scenario
    Given I'm logged in
    And I closed the order type window
    And I click All
    And I click Table Layout tab
    And I click new check button on the Table layout screen
    And I select table as "T19"
    And I select the number of seats as "1"
    And I click the Continue button
    And I get check number
    And I select category as "TaXx"
    And I select menu item as "service charge menu"
    And I add a new seat
    And I add a new seat
    Then I should see Add Gratuity screen
#    And I click auto Gratuity varying button
    And I select auto gratuity as "Auto vary Gratuity"
    Then I should see enter Percentage popup
    And I pass the value and click Apply button
    Then I should verify subtotal value as "$ 2.95"
    Then I should verify tax value as "$ 0.34"
    Then I should verify gratuity value as "$ 0.24"
    Then I should verify service charge value1 as "$ 0.23"
    Then I should verify total5 value as "$ 3.95"
    Then I should verify paid amount1 as "$ 0.00"
    And I should verify cash price value2 as "$ 3.76"
   And I click Payment button in the Order Management Screen
    And I click cash button from the payment method popup
    And I click Submit button on the Payment Window
#    And I should see the print or send receipt
#    And I click No thanks Button on the print receipt
    And I click Table Layout tab
    And I click Check Stats tab
    And I click Closed tab on the Check stats
    And I click the Closed check on check stats
    And I click reopen check button on the check stats screen
    Then I Should get back to the Order Screen
    When I verify auto gratuity is applied
    Then I should verify subtotal value as "$ 2.95"
    Then I should verify tax value as "$ 0.34"
    Then I should verify gratuity value as "$ 0.24"
    And I should verify discount value1 as "$ 0.19"
    Then I should verify service charge value2 as "$ 0.23"
    Then I should verify total6 value as "$ 3.76"
    Then I should verify paid amount1 as "$ 3.76"
    And I should verify cash price value2 as "$ 3.76"
    And I click Payment button in the Order Management Screen
    And I click Submit button on the Payment Window
    And I click Table Layout tab
    And I click power button in the All Orders screen

  @Cryptos
  Scenario: LIN - 21416 - The Already Tokenized Credit card number is allowed to save once again while manually tokenize the credit card in customer profile screen
    Given I'm logged in
    And I closed the order type window
    And I select order type as QSR in order screen
    And I select service type as "Bar Tab" on the order screen
    And I click the Exit to close the preauth window
    And I click Add Customer Button
    And I click Add new button
    Then I should see the customer profile window
    And Enter the new customer randomlys
    And I click the phone number field on the customer profile screen
    And I get the mobile number from the customer profile screen
    And I click the Save button
    And I get check number
    And I select category as "FOOD"
    And I select menu item as "SANDWICHES"
    And I should verify subtotal value as "$ 1.00"
    And I should verify tax value as "$ 0.10"
    And I should verify total2 value as "$ 1.16"
    And I click Payment button in the Order Management Screen
    When I select the MPPG Payment on the payment window
    Then I should see tip screen
    And I select the tip from the tip screen
    And I click the Continue button on the Total screen
    Then I should see the card details entry screen
    When I verify subtotal,tax and total value with card details screen value
    When I verify the tip value with card details screen value
    When I verify the paid amount value is zero
    And I get the pay amount value from the card details screen value
    Then I verify card reader is not connected popup or not
    And I verify the Calculation pay amount with the card details pay amount
    And I click manual button on the your order screen
    And I pass the Amex card number as "4111111111111111"
    And I pass card name as "Visa"
    And I pass expire date as "1224"
    And I click Process button on card screen
    Then I should see the do you want to tokenize your card popup
    And I click Yes button on the tokenize popup
    And I click Ok button in receipt printer popup
    And I click Submit button on the Payment Window
    And I click QSR tab
    And I closed the order type window
    And I get check number
    And I click Add Customer Button
    And I search the existing customer on the order screen
    And I click the customer name on the order screen
    Then I should see the customer profile window
    And I verify the applied existing customer name and phone number
    And I get the credit card number from the customer
    And I verify the encrypted credit card number with new credit card number
    And I click add button of the credit card to the customer
    Then I should see add card popup
    When I have entered the card number as "3530111333300000" and expiry date "1224" on the add card popup
    And I hide the keyboard
    And I click process token button
    And I verify the newly added credit card number with customer
    And I click the Save button
    And I click All
    And I click power button

  @Cryptos
  Scenario: Verify the Tokenized credit Card number is displayed as Encrypted in the "Choose Card Pop-up"
    Given I'm logged in
    And I closed the order type window
    And I select order type as QSR in order screen
    And I select service type as "Bar Tab" on the order screen
    And I click the Exit to close the preauth window
    And I click Add Customer Button
    And I click Add new button
    Then I should see the customer profile window
    And Enter the new customer randomlys
    And I click the phone number field on the customer profile screen
    And I get the mobile number from the customer profile screen
    And I click the Save button
    And I get check number
    And I select category as "FOOD"
    And I select menu item as "SANDWICHES"
    And I should verify subtotal value as "$ 1.00"
    And I should verify tax value as "$ 0.10"
    And I should verify total2 value as "$ 1.16"
    And I click Payment button in the Order Management Screen
    When I select the MPPG Payment on the payment window
    Then I should see tip screen
    And I select the tip from the tip screen
    And I click the Continue button on the Total screen
    Then I should see the card details entry screen
    When I verify subtotal,tax and total value with card details screen value
    When I verify the tip value with card details screen value
    When I verify the paid amount value is zero
    And I get the pay amount value from the card details screen value
    Then I verify card reader is not connected popup or not
    And I verify the Calculation pay amount with the card details pay amount
    And I click manual button on the your order screen
    And I pass the Amex card number as "4111111111111111"
    And I pass card name as "Visa"
    And I pass expire date as "1224"
    And I click Process button on card screen
    Then I should see the do you want to tokenize your card popup
    And I click Yes button on the tokenize popup
    And I click Ok button in receipt printer popup
    And I click Submit button on the Payment Window
    And I click QSR tab
    And I closed the order type window
    And I select order type as QSR in order screen
    And I select service type as "Bar Tab" on the order screen
    And I click the Exit to close the preauth window
    And I get check number
    And I click Add Customer Button
    And I search the existing customer on the order screen
    And I select category as "FOOD"
    And I select menu item as "SANDWICHES"
    And I should verify subtotal value as "$ 1.00"
    And I should verify tax value as "$ 0.10"
    And I should verify total value as "$ 1.10"
    And I click Order button in the order management screen
    And I click print button on the order screen
    Then I should see Receipt Printer popup
    And I click Done button on the Popup
    And I click Options button
    Then I should see the Check Options screen
    And I click print button on the order screen
    Then I should see Receipt Printer popup
    And I click Done button on the Popup
    And I click Payment button in the Order Management Screen
    When I select the MPPG Payment on the payment window
    Then I should see tip screen
    And I select the tip from the tip screen
    And I click the Continue button on the Total screen
    Then I should see choose card window
    When I verify the credit card number on the choose card window should be encrypted
    And I select credit card from choose card window
    And I click pay button in choose card window
    And I click Ok button in receipt printer popup
    And I click Submit button on the Payment Window
    And I click power button

  @Cryptos
  Scenario: Verify the Tokenized credit Card number is displayed as Encrypted in the "Batch Screen"
    Given I'm logged in
    And I closed the order type window
    And I select order type as QSR in order screen
    And I select service type as "Bar Tab" on the order screen
    And I click the Exit to close the preauth window
    And I click Add Customer Button
    And I click Add new button
    Then I should see the customer profile window
    And Enter the new customer randomlys
    And I click the phone number field on the customer profile screen
    And I get the mobile number from the customer profile screen
    And I click the Save button
    And I get check number
    And I select category as "FOOD"
    And I select menu item as "SANDWICHES"
    And I should verify subtotal value as "$ 1.00"
    And I should verify tax value as "$ 0.10"
    And I should verify total2 value as "$ 1.16"
    And I click Payment button in the Order Management Screen
    When I select the MPPG Payment on the payment window
    Then I should see tip screen
    And I select the tip from the tip screen
    And I click the Continue button on the Total screen
    Then I should see the card details entry screen
    When I verify subtotal,tax and total value with card details screen value
    When I verify the tip value with card details screen value
    When I verify the paid amount value is zero
    And I get the pay amount value from the card details screen value
    Then I verify card reader is not connected popup or not
    And I verify the Calculation pay amount with the card details pay amount
    And I click manual button on the your order screen
    And I pass the Amex card number as "4111111111111111"
    And I pass card name as "Visa"
    And I pass expire date as "1224"
    And I click Process button on card screen
    Then I should see the do you want to tokenize your card popup
    And I click Yes button on the tokenize popup
    And I click Ok button in receipt printer popup
    And I click Submit button on the Payment Window
    And I click QSR tab
    And I closed the order type window
    And I click the Settings button
    And I click batch/Tip adjustment button
    And I click the device drop down "Down Arrow Black" button in the batch screen "click drop down button"
    And I select the MPPG Payment name in the device list
    Then I should see the list of checks in batch screen
    And I search the closed check in the Batch screen field
    And I hide the keyboard
    When I verify the credit card of the check from the batch screen should be encrypted
    And I click power button

  @MainBAsic
    Scenario: LIN-22815 - Allow to save more that 140 characters in customer notes after alert message in customer profile.
      Given I'm logged in
    And I click Add Customer Button
    Then I should see the add customer screen in the window
    And I Click on the Byname Option
    And Enter some name and click on Add Customer button
    Then I should see the customer profile window
    And I select search
    And I enter an existing customer's name "pink flower"
    And I select the customer
      And I wait sometimes
      And I enter the above 150 words on the customer notes
#      And I hide the keyboard
      And I click the Save button
     And I Should get back to the Order Screen
    And I click the customer name on the order screen
    Then I should see the customer profile window
    When I verify the customer details in the customer profile
    And I click the Save button
    And I Should get back to the Order Screen
    And I click Add Customer Button
    And I click remove button
    And I click log off button in order screen

    @nkl
    Scenario: LIN-22431 - In batch screen when the Apply Total Toggle is enabled Tip is accepting for the lesser amount than check total.
      Given I'm logged in
      And I closed the order type window
      And I click All
      And I click Table Layout tab
      And I select Menu For Basic validation as "Salad"
      And I click Payment button in the Order Management Screen
      When I get the balance Due Amount and cash option amount in payment window
      And I click mppg auth payment in the payment window
      Then I should see tip screen
      And I select the tip from the tip screen
      And I click the Continue button on the Total screen
      Then I should see the card details entry screen
      When I verify subtotal,tax and total value with card details screen value
      When I verify the tip value with card details screen value
      When I verify the paid amount value is zero
      And I get the pay amount value from the card details screen value
      Then I verify card reader is not connected popup or not
      And I verify the Calculation pay amount with the card details pay amount
      And I click manual button on the your order screen
      And I pass the card number as "4111111111111111"
      And I pass card name as "Visa"
      And I pass expire date as "1223"
      And I click Process button on card screen
      And I click Ok button in receipt printer popup
      And I click Submit button on the Payment Window
      Then I should get back to the Table Layout tab
      And I click the Operation button on the Table Layout
      When I click batch/Tip adjustment button
      And I click the device drop down button on the batch screen
#    And I click the device drop down "Down Arrow Black" button in the batch screen "click drop down button"
   # And I select the payment name "MPPG AUTH" in the List "select payment"
      And I select the MPPG Payment name in the device list
      Then I should see the list of checks in batch screen
      And I enable the apply total in the batch screen
      And I search the closed check in the Batch screen field
      And I hide the keyboard
      When I verify the credit card of the check from the batch screen should be encrypted
      And I click the check from batch screen1
      And I change tip amount in batch screen1
      Then I should see invalid tip amount popup
      And I click Done button on the Popup
      And I click power button

  @MainBAsic
Scenario: Application gets crashed when scroll the category/service type/suggestive search
  Given I'm logged in
  And I closed the order type window
#  And I select category as "Uzumaki"
  And I click All
  And I click BarTab Layout
  And I click New Tab in the Bar Tab Screen
#  And I click the Exit to close the preauth window
    And I click Add Customer Button
    Then I should see the add customer screen in the window
    And I Click on the Byname Option
    And Enter some name and click on Add Customer button
    Then I should see the customer profile window
    And I select search
    And I enter an existing customer's name "loyalty test1"
    And I select the customer
    When I click the Save button
  And I wait sometimes
  And I click Finish button
  And I click QSR tab
  And I closed the order type window
  And I select uzumaki category
  And I click log off button in order screen




















