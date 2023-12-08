#
##
##Feature:Basic Validationsss
##
##
### Scenario Outline: Clock in
###    ##1.Sign in to the POS with valid credential
####    When I click the Sign In button
####    And I click the login
####    Then I should see the user login screen with title "<title>"
###
###    ##2. Choose Clock in option
###    And I click clockin Button
###    Then I should see enter Approver Pin popup
###
###
###  Examples:
###    | title      | menu |
###    | User Login | Dosa |
##  @BAsiccs12
##  Scenario: Added tip is Correct or not
##    Given I'm logged in for Phone store
##    And I closed the order type window
##    And I select category as "APPETIZERS"
##    And I select menu item as "7 UP Menuss"
##    And I click Payment button in the Order Management Screen
##    And I click side cc button in the payment window
##    Then I should see total screen
##    And I click tip as 10
##    And I get tip value from Tip screen
##    And I click the Continue button on the Total screen
##    When I verify the added tip is same in Payment screen
##    And I click Submit button in the Payment popup
##    And I closed the order type window
##    And I click log off button in order screen
##
##  Scenario: Bussiness Date Verify with Close day window Date
##    When I get he Bussiness date from the order screen
##    Given I'm logged in for Phone store
##    And I closed the order type window
##    And I click All
##    And I click Table Layout tab
##    And I click the Operation button on the Table Layout
##    And I click close day tab
##    When I verify bussiness date with close day screen
##    And I click power button
##
##  Scenario: Cashier Out From Till Management Screen
##    Given  I'm logged in for Phone store
##    And I closed the order type window
###    And I click All
###    And I click the Operation button on the check stats
###    And I click the POS settings from Toggle
###    When I verify set till button is enable
###    Then I should see successfully updated the POS settings popup
###    And I click Done button on the Popup
###    And I click the Toggle Icon button
###    And I click POS Icon from Toggle
###    And I closed the order type window
##    And I click counting machine icon
##    When I verify till is available or not if available closed the till
##    Then I should see open till management screen
##    And I click cancel button in open till popup
##    And I click reports button in the Till management screen
##    And I click cashier out button in the Till management screen
##    Then I should see do you want to print the cashier out popup
##    And I click Yes button on the popup for Hold item
##    Then I should see cashier out saved successfully popup
##    And I click Done button on the Popup
##    Then I should verify the initial Gross sale value as "0.00"
##    And I click power button
##
##  Scenario Outline: User Till
##
#
#@bassss
#Feature:Basic Validationsss
#
#
## Scenario Outline: Clock in
##    ##1.Sign in to the POS with valid credential
###    When I click the Sign In button
###    And I click the login
###    Then I should see the user login screen with title "<title>"
##
##    ##2. Choose Clock in option
#
##    And I click clockin Button
##    Then I should see enter Approver Pin popup
##
##      ##3. Enter the valid employee pin
##    Given I'm logged in from clockin button
##    Then I should see clockin successful popup
##  ##4. And enter the same which is used to clock in the PIN screen
##    Given I'm logged in for Phone store
##
##      ##Verify the start of the day(Clock in, start till(user till, Global till))
##    ##5. Navigate to the Till Management screen
##    And I closed the order type window
##    And I click counting machine icon
##    When I verify till is available or not if available closed the till
##    Then I should see open till management screen
##
##    ##6. In the Open Till screen Enter the amount by number pad or use the denomination to enter the amount should be saved in the Till (Disable mode of Global Till toggle)
##    And I select global till option in open till
##    And I press first number of the total
##    And I press second number of the total
##    And I press third number of the total
##    When I press Continue for open till
##    When I get the active till details
##    Then verify till balance same with amount given
##
##
#
##    ##7. Try to place any available menu item In any service type (Dine in/Bartab/Phone order) & complete the payment with cash type
##    And I click the Toggle Icon button
##    And I click POS Icon from Toggle
##    And I closed the order type window
##    And I click All
##    And I click Table Layout tab
##    And I select Menu For Basic validation as "APPETIZERS"
##    And I click Cash button for Complete Sale
##    And I click Exact button on the cash pop-up
##    And I get Total of menu
##    And I click Enter Button on the cash pop-up
##    And I click Table Layout tab
##    And I click QSR tab
##    And I closed the order type window
##    And I click counting machine icon
##    Then I should see active till total has changed depends on menu total
##
##    ##8. Select the active till in till management screen choose Close till option
##    And I click Active till check
##    And I click the Close Till button
##    Then I should see close till confirmation pop-up
##
##    ##9. Choose 'Yes' Do you want to Close the Till pop
##    And I click yes to open Close Till Screen
##    Then I should see that the Close Till window is displayed
##
##    ##10. Enter the amount should greater than the amount which is in Balance amount & hit continue option
##    And I enter the amount greater than balance amount
##    And I click the Continue button
##    Then I should see over shortage popup
##
##  ##11. OVER SHORTAGE pop up screen enter the valid Discrepancy Notes & choose Done
##    And I enter reason for discrepency notes
##    And I click Done button on the Popup
##    Then I should see total summary
##    And I click submit button on total summary
##
##  ##12. If Entered amount is Less than the amount which is in Balance amount & hit continue option
##    And I click Set Till button
##    Then I should see open till management screen
##    And I select global till option in open till
##    And I press first number of the total
##    And I press second number of the total
##    And I press third number of the total
##    When I press Continue for open till
##    When I get the active till details
##    Then verify till balance same with amount given
###    And I get the active till total
##
##    And I click the Toggle Icon button
##    And I click POS Icon from Toggle
##    And I closed the order type window
##    And I click All
##    And I click Table Layout tab
##    And I select Menu For Basic validation as "APPETIZERS"
##
##    And I click Cash button for Complete Sale
##    And I click Exact button on the cash pop-up
##    And I get Total of menu
##    And I click Enter Button on the cash pop-up
##    And I click Table Layout tab
##    And I click QSR tab
##    And I closed the order type window
##    And I click counting machine icon
##    Then I should see active till total has changed depends on menu total
##    And I click Active till check
##    And I click the Close Till button
##    Then I should see close till confirmation pop-up
##    And I click yes to open Close Till Screen
##    Then I should see that the Close Till window is displayed
##    And I enter the amount smaller than balance amount
##    And I click the Continue button
##    Then I should see over shortage popup
##    And I enter reason for discrepency notes
##    And I click Done button on the Popup
##    Then I should see total summary
##  ##15. And choose the Submit option Till Management - Check Summary screen will closed
##    And I click submit button on total summary
##    And I click Closed till button
##    And I get the closed till check details
##    And I click power button
##
##    Examples:
##      | Category |
##      |      |
##
##  Scenario Outline: Global Till
##    Given I'm logged in for Phone store
##    And I closed the order type window
##    And I click counting machine icon
##    When I verify till is available or not if available closed the till
#### 16. Navigate to the Till Management screen
##
###  And I click Set Till button
##
##
##  ##15. In the Open Till screen Enter the amount by number pad or use the denomination to enter the amount should be saved in the Till (Enable the  Global Till toggle)
##    Then I should see open till management screen
##    And I press first number of the total
##    And I press second number of the total
##    And I press third number of the total
##    When I press Continue for open till
##    Then verify active till as global till
##    When I get the active till details
##    Then verify till balance same with amount given
##
##    ##17. Try to place any available menu item In any service type (Dine in/Bartab/Phone order) & complete the payment with cash type
##
##    And I click the Toggle Icon button
##    And I click POS Icon from Toggle
##    And I closed the order type window
##    And I click All
##    And I click Table Layout tab
##    And I select Menu For Basic validation as "APPETIZERS"
##
##    And I click Cash button for Complete Sale
##    And I click Exact button on the cash pop-up
##    And I get Total of menu
##    And I click Enter Button on the cash pop-up
##    And I click Table Layout tab
##    And I click QSR tab
##    And I closed the order type window
##    And I click counting machine icon
##    Then I should see active till total has changed depends on menu total
##
##    ##18. Select the active till in till management screen choose Close till option
##    And I click Active till check
##    And I click the Close Till button
##    Then I should see close till confirmation pop-up
##
##   ##19. Choose 'Yes' Do you want to Close the Till pop
##    And I click yes to open Close Till Screen
##    Then I should see that the Close Till window is displayed
##
##   ##20. Enter the amount should greater than the amount which is in Balance amount & hit continue option
##    And I enter the amount greater than balance amount
##    And I click the Continue button
##    Then I should see over shortage popup
##
##  ##21. OVER SHORTAGE pop up screen enter the valid Discrepancy Notes & choose Done
##    And I enter reason for discrepency notes
##    And I click Done button on the Popup
##    Then I should see total summary
##    And I click submit button on total summary
##
##    ##22. If Entered amount is Less than the amount which is in Balance amount & hit continue option
##    And I click Set Till button
##    Then I should see open till management screen
##    And I press first number of the total
##    And I press second number of the total
##    And I press third number of the total
##    When I press Continue for open till
##    Then verify active till as global till
##    When I get the active till details
##    Then verify till balance same with amount given
###    And I get the active till total
##
##    And I click the Toggle Icon button
##    And I click POS Icon from Toggle
##    And I closed the order type window
##    And I click All
##    And I click Table Layout tab
##    And I select Menu For Basic validation as "APPETIZERS"
##
##    And I click Cash button for Complete Sale
##    And I click Exact button on the cash pop-up
##    And I get Total of menu
##    And I click Enter Button on the cash pop-up
##    And I click Table Layout tab
##    And I click QSR tab
##    And I closed the order type window
##    And I click counting machine icon
##    Then I should see active till total has changed depends on menu total
##    And I click Active till check
##    And I click the Close Till button
##    Then I should see close till confirmation pop-up
##    And I click yes to open Close Till Screen
##    Then I should see that the Close Till window is displayed
##    And I enter the amount smaller than balance amount
##    And I click the Continue button
##
##    ##23. OVER SHORTAGE pop up screen enter the valid Discrepancy Notes & choose Done
##    Then I should see over shortage popup
##    And I enter reason for discrepency notes
##    And I click Done button on the Popup
##    Then I should see total summary
##  ##25. And choose the Submit option Till Management - Check Summary screen will closed
##    And I click submit button on total summary
##    And I click Closed till button
##    And I get the closed till check details
##    And I click power button
##    Examples:
##      | title      | menu |
##      | User Login | Dosa |
##
##  @Bss
##  Scenario:Verify the Cash Discount charge for the check
##    Given I'm logged in for Phone store
##    And I closed the order type window
##    And I click All
##    And I click Table Layout tab
##    And I select Menu For Basic validation as "APPETIZERS"
###    And I select FOOD as category
###    And I select menu item as "mongo test"
##    And I get the cash option value and add with menu total
##    And I click Payment button in the Order Management Screen
##    When I get the balance Due Amount and cash option amount in payment window
##
##  ##6. Choose Payment type as "Cash"
##    And I click cash button from the payment method popup
##    Then verify the cash option in payment screen
##
##  ##7. Without choosing the submit button Select "Exit" option from payment screen
##    And I click Exit to return to Order Management Screen
##    When verify the paid Amount in Order Screen for cash option
##    When verify cash discount is display in order screen
##
##  ##8. Complete the sale with the cash payment
##    And I click Payment button in the Order Management Screen
##    And I click Submit button in the Payment popup
##    And I click Table Layout tab
##    And I click power button
##
##  Scenario: Other than Cash Payment
##    Given I'm logged in for Phone store
##    And I closed the order type window
##    And I click All
##    And I click Table Layout tab
##    And I select Menu For Basic validation as "APPETIZERS"
###    And I select FOOD as category
###    And I select menu item as "mongo test"
##    And I get the cash option value and add with menu total
##    And I click Payment button in the Order Management Screen
##    When I get the balance Due Amount and cash option amount in payment window
##
##  ##6. Choose Payment type as "Cash"
##    And I click side cc button in the payment window
##    And I click the Continue button on the Total screen
##    Then verify the cash option in payment screen
##    Then verify the card option payment screen
##
##  ##7. Without choosing the submit button Select "Exit" option from payment screen
##    And I click Exit to return to Order Management Screen
##    When verify the paid Amount in Order Screen for card option
##    When verify cash discount is display in order screen
##
##  ##8. Complete the sale with the cash payment
##    And I click Payment button in the Order Management Screen
##    And I click Submit button in the Payment popup
##    And I click Table Layout tab
##    And I click power button
##
##
##  Scenario: Item Service charge  (Item Service Charge Without Tax )
##    Given I'm logged in for Phone store
##    And I closed the order type window
##    And I click All
##    And I click Table Layout tab
##    And I select Menu For Basic validation as "APPETIZERS"
##    When i verify service charge without tax of menu
##    And I click Payment button in the Order Management Screen
##    And I click cash button from the payment method popup
##    And I click Submit button on the Payment Window
##    And I click Table Layout tab
##    And I click power button
##
##  Scenario: Item Service charge (Item Service Charge With Tax )
##    Given I'm logged in for Phone store
##    And I closed the order type window
##    And I click All
##    And I click Table Layout tab
##    And I select Menu For Basic validation as "DESSERTS"
##    When i verify service charge with tax of menu
##    And I click Payment button in the Order Management Screen
##    And I click cash button from the payment method popup
##    And I click Submit button on the Payment Window
##    And I click Table Layout tab
##    And I click power button
##
##  Scenario Outline: Manual Gratuity Fixed
##  ##Manual Gratuity Fixed
##    Given I'm logged in for Phone store
##    And I closed the order type window
##    And I click All
##    And I click Table Layout tab
##    And I select Menu For Basic validation as "DESSERTS"
##  ##4. Choose the "Option" from the POS customer button in order screen
##    And I click Options button
##    And I click Gratuity button
###  And I select fixed gratuity in add gratuity screen
##    And I click Gratuity Fixed button
##    And I verify fixed gratuity is applied
##    And I click Payment button in the Order Management Screen
##    And I click cash button from the payment method popup
##    And I click Submit button on the Payment Window
##    And I click Table Layout tab
##    And I click power button
##    Examples:
##      |cato |
##      |DESSERTS|
##
##  Scenario: Manual Gratuity Varying
##    Given I'm logged in for Phone store
##    And I closed the order type window
##    And I click All
##    And I click Table Layout tab
##    And I select Menu For Basic validation as "DESSERTS"
##  ##4. Choose the "Option" from the POS customer button in order screen
##    And I click Options button
##    And I click Gratuity button
###  And I select fixed gratuity in add gratuity screen
##    And I click Gratuity varying button
##    Then I should see enter Percentage popup
##    And I pass the value and click Apply button
##    And I verify varying gratuity is applied
##  #   And I verify fixed gratuity is applied
##    And I click Payment button in the Order Management Screen
##    And I click cash button from the payment method popup
##    And I click Submit button on the Payment Window
##    And I click Table Layout tab
##    And I click power button
##  @basic
##  Scenario: Auto Gratuity Fixed
##    Given I'm logged in for Phone store
#
##  Examples:
##    | title      | menu |
##    | User Login | Dosa |
#
#  Scenario: Cashier Out From Till Management Screen
#    Given  I'm logged in for Phone store
#    And I closed the order type window
##    And I click All
##    And I click the Operation button on the check stats
##    And I click the POS settings from Toggle
##    When I verify set till button is enable
##    Then I should see successfully updated the POS settings popup
##    And I click Done button on the Popup
##    And I click the Toggle Icon button
##    And I click POS Icon from Toggle
##    And I closed the order type window
#    And I click counting machine icon
#    When I verify till is available or not if available closed the till
#    Then I should see open till management screen
#    And I click cancel button in open till popup
#    And I click reports button in the Till management screen
#    And I click cashier out button in the Till management screen
#    Then I should see do you want to print the cashier out popup
#    And I click Yes button on the popup for Hold item
#    Then I should see cashier out saved successfully popup
#    And I click Done button on the Popup
#    Then I should verify the initial Gross sale value as "0.00"
#    And I click power button
#
#  @BAsiccs12
#  Scenario: Added tip is Correct or not
#    Given I'm logged in for Phone store
#    And I closed the order type window
#    And I select category as "APPETIZERS"
#    And I select menu item as "7 UP Menuss"
#    And I click Payment button in the Order Management Screen
#    And I click side cc button in the payment window
#    Then I should see total screen
#    And I click tip as 10
#    And I get tip value from Tip screen
#    And I click the Continue button on the Total screen
#    When I verify the added tip is same in Payment screen
#    And I click Submit button in the Payment popup
#    And I closed the order type window
#    And I click log off button in order screen
#
#  Scenario: Bussiness Date Verify with Close day window Date
#    When I get he Bussiness date from the order screen
#    Given I'm logged in for Phone store
#    And I closed the order type window
#    And I click All
#    And I click Table Layout tab
#    And I click the Operation button on the Table Layout
#    And I click close day tab
#    When I verify bussiness date with close day screen
#    And I click power button
#
#  @Basy
#  Scenario Outline: User Till
#
#    And I click clockin Button
#    Then I should see enter Approver Pin popup
#
#      ##3. Enter the valid employee pin
#    Given I'm logged in from clockin button
#    Then I should see clockin successful popup
#  ##4. And enter the same which is used to clock in the PIN screen
#    Given I'm logged in for Phone store
#
#      ##Verify the start of the day(Clock in, start till(user till, Global till))
#    ##5. Navigate to the Till Management screen
#    And I closed the order type window
#    And I click counting machine icon
#    When I verify till is available or not if available closed the till
#    Then I should see open till management screen
#
#    ##6. In the Open Till screen Enter the amount by number pad or use the denomination to enter the amount should be saved in the Till (Disable mode of Global Till toggle)
#    And I select global till option in open till
#    And I press first number of the total
#    And I press second number of the total
#    And I press third number of the total
#    When I press Continue for open till
#    When I get the active till details
#    Then verify till balance same with amount given
#
#
#    ##7. Try to place any available menu item In any service type (Dine in/Bartab/Phone order) & complete the payment with cash type
#    And I click the Toggle Icon button
#    And I click POS Icon from Toggle
#    And I closed the order type window
#    And I click All
#    And I click Table Layout tab
#    And I select Menu For Basic validation as "APPETIZERS"
#    And I click Cash button for Complete Sale
#    And I click Exact button on the cash pop-up
#    And I get Total of menu
#    And I click Enter Button on the cash pop-up
#    And I click Table Layout tab
#    And I click QSR tab
#    And I closed the order type window
#    And I click counting machine icon
#    Then I should see active till total has changed depends on menu total
#
#    ##8. Select the active till in till management screen choose Close till option
#    And I click Active till check
#    And I click the Close Till button
#    Then I should see close till confirmation pop-up
#
#    ##9. Choose 'Yes' Do you want to Close the Till pop
#    And I click yes to open Close Till Screen
#    Then I should see that the Close Till window is displayed
#
#    ##10. Enter the amount should greater than the amount which is in Balance amount & hit continue option
#    And I enter the amount greater than balance amount
#    And I click the Continue button
#    Then I should see over shortage popup
#
#  ##11. OVER SHORTAGE pop up screen enter the valid Discrepancy Notes & choose Done
#    And I enter reason for discrepency notes
#    And I click Done button on the Popup
#    Then I should see total summary
#    And I click submit button on total summary
#
#  ##12. If Entered amount is Less than the amount which is in Balance amount & hit continue option
#    And I click Set Till button
#    Then I should see open till management screen
#    And I select global till option in open till
#    And I press first number of the total
#    And I press second number of the total
#    And I press third number of the total
#    When I press Continue for open till
#    When I get the active till details
#    Then verify till balance same with amount given
##    And I get the active till total
#
#    And I click the Toggle Icon button
#    And I click POS Icon from Toggle
#    And I closed the order type window
#    And I click All
#    And I click Table Layout tab
#    And I select Menu For Basic validation as "APPETIZERS"
#
#    And I click Cash button for Complete Sale
#    And I click Exact button on the cash pop-up
#    And I get Total of menu
#    And I click Enter Button on the cash pop-up
#    And I click Table Layout tab
#    And I click QSR tab
#    And I closed the order type window
#    And I click counting machine icon
#    Then I should see active till total has changed depends on menu total
#    And I click Active till check
#    And I click the Close Till button
#    Then I should see close till confirmation pop-up
#    And I click yes to open Close Till Screen
#    Then I should see that the Close Till window is displayed
#    And I enter the amount smaller than balance amount
#    And I click the Continue button
#    Then I should see over shortage popup
#    And I enter reason for discrepency notes
#    And I click Done button on the Popup
#    Then I should see total summary
#  ##15. And choose the Submit option Till Management - Check Summary screen will closed
#    And I click submit button on total summary
#    And I click Closed till button
#    And I get the closed till check details
#    And I click power button
#
#    Examples:
#      | Category |
#      |      |
#
#  Scenario Outline: Global Till
#    Given I'm logged in for Phone store
#    And I closed the order type window
#    And I click counting machine icon
#    When I verify till is available or not if available closed the till
### 16. Navigate to the Till Management screen
#
##  And I click Set Till button
#
#
#  ##15. In the Open Till screen Enter the amount by number pad or use the denomination to enter the amount should be saved in the Till (Enable the  Global Till toggle)
#    Then I should see open till management screen
#    And I press first number of the total
#    And I press second number of the total
#    And I press third number of the total
#    When I press Continue for open till
#    Then verify active till as global till
#    When I get the active till details
#    Then verify till balance same with amount given
#
#    ##17. Try to place any available menu item In any service type (Dine in/Bartab/Phone order) & complete the payment with cash type
#
#    And I click the Toggle Icon button
#    And I click POS Icon from Toggle
#    And I closed the order type window
#    And I click All
#    And I click Table Layout tab
#    And I select Menu For Basic validation as "APPETIZERS"
#
#    And I click Cash button for Complete Sale
#    And I click Exact button on the cash pop-up
#    And I get Total of menu
#    And I click Enter Button on the cash pop-up
#    And I click Table Layout tab
#    And I click QSR tab
#    And I closed the order type window
#    And I click counting machine icon
#    Then I should see active till total has changed depends on menu total
#
#    ##18. Select the active till in till management screen choose Close till option
#    And I click Active till check
#    And I click the Close Till button
#    Then I should see close till confirmation pop-up
#
#   ##19. Choose 'Yes' Do you want to Close the Till pop
#    And I click yes to open Close Till Screen
#    Then I should see that the Close Till window is displayed
#
#   ##20. Enter the amount should greater than the amount which is in Balance amount & hit continue option
#    And I enter the amount greater than balance amount
#    And I click the Continue button
#    Then I should see over shortage popup
#
#  ##21. OVER SHORTAGE pop up screen enter the valid Discrepancy Notes & choose Done
#    And I enter reason for discrepency notes
#    And I click Done button on the Popup
#    Then I should see total summary
#    And I click submit button on total summary
#
#    ##22. If Entered amount is Less than the amount which is in Balance amount & hit continue option
#    And I click Set Till button
#    Then I should see open till management screen
#    And I press first number of the total
#    And I press second number of the total
#    And I press third number of the total
#    When I press Continue for open till
#    Then verify active till as global till
#    When I get the active till details
#    Then verify till balance same with amount given
##    And I get the active till total
#
#    And I click the Toggle Icon button
#    And I click POS Icon from Toggle
#    And I closed the order type window
#    And I click All
#    And I click Table Layout tab
#    And I select Menu For Basic validation as "APPETIZERS"
#
#    And I click Cash button for Complete Sale
#    And I click Exact button on the cash pop-up
#    And I get Total of menu
#    And I click Enter Button on the cash pop-up
#    And I click Table Layout tab
#    And I click QSR tab
#    And I closed the order type window
#    And I click counting machine icon
#    Then I should see active till total has changed depends on menu total
#    And I click Active till check
#    And I click the Close Till button
#    Then I should see close till confirmation pop-up
#    And I click yes to open Close Till Screen
#    Then I should see that the Close Till window is displayed
#    And I enter the amount smaller than balance amount
#    And I click the Continue button
#
#    ##23. OVER SHORTAGE pop up screen enter the valid Discrepancy Notes & choose Done
#    Then I should see over shortage popup
#    And I enter reason for discrepency notes
#    And I click Done button on the Popup
#    Then I should see total summary
#  ##25. And choose the Submit option Till Management - Check Summary screen will closed
#    And I click submit button on total summary
#    And I click Closed till button
#    And I get the closed till check details
#    And I click power button
#    Examples:
#      | title      | menu |
#      | User Login | Dosa |
#
#  @Bss
#  Scenario:Verify the Cash Discount charge for the check
#    Given I'm logged in for Phone store
#    And I closed the order type window
#    And I click All
#    And I click Table Layout tab
#    And I select Menu For Basic validation as "APPETIZERS"
##    And I select FOOD as category
##    And I select menu item as "mongo test"
#    And I get the cash option value and add with menu total
#    And I click Payment button in the Order Management Screen
#    When I get the balance Due Amount and cash option amount in payment window
#
#  ##6. Choose Payment type as "Cash"
#    And I click cash button from the payment method popup
#    Then verify the cash option in payment screen
#
#  ##7. Without choosing the submit button Select "Exit" option from payment screen
#    And I click Exit to return to Order Management Screen
#    When verify the paid Amount in Order Screen for cash option
#    When verify cash discount is display in order screen
#
#  ##8. Complete the sale with the cash payment
#    And I click Payment button in the Order Management Screen
#    And I click Submit button in the Payment popup
#    And I click Table Layout tab
#    And I click power button
#
#  Scenario: Other than Cash Payment
#    Given I'm logged in for Phone store
#    And I closed the order type window
#    And I click All
#    And I click Table Layout tab
#    And I select Menu For Basic validation as "APPETIZERS"
##    And I select FOOD as category
##    And I select menu item as "mongo test"
#    And I get the cash option value and add with menu total
#    And I click Payment button in the Order Management Screen
#    When I get the balance Due Amount and cash option amount in payment window
#
#  ##6. Choose Payment type as "Cash"
#    And I click side cc button in the payment window
#    And I click the Continue button on the Total screen
#    Then verify the cash option in payment screen
#    Then verify the card option payment screen
#
#  ##7. Without choosing the submit button Select "Exit" option from payment screen
#    And I click Exit to return to Order Management Screen
#    When verify the paid Amount in Order Screen for card option
#    When verify cash discount is display in order screen
#
#  ##8. Complete the sale with the cash payment
#    And I click Payment button in the Order Management Screen
#    And I click Submit button in the Payment popup
#    And I click Table Layout tab
#    And I click power button
#
#
#  Scenario: Item Service charge  (Item Service Charge Without Tax )
#    Given I'm logged in for Phone store
#    And I closed the order type window
#    And I click All
#    And I click Table Layout tab
#    And I select Menu For Basic validation as "APPETIZERS"
#    When i verify service charge without tax of menu
#    And I click Payment button in the Order Management Screen
#    And I click cash button from the payment method popup
#    And I click Submit button on the Payment Window
#    And I click Table Layout tab
#    And I click power button
#
#  Scenario: Item Service charge (Item Service Charge With Tax )
#    Given I'm logged in for Phone store
#    And I closed the order type window
#    And I click All
#    And I click Table Layout tab
#    And I select Menu For Basic validation as "DESSERTS"
#    When i verify service charge with tax of menu
#    And I click Payment button in the Order Management Screen
#    And I click cash button from the payment method popup
#    And I click Submit button on the Payment Window
#    And I click Table Layout tab
#    And I click power button
#
#  Scenario Outline: Manual Gratuity Fixed
#  ##Manual Gratuity Fixed
#    Given I'm logged in for Phone store
#    And I closed the order type window
#    And I click All
#    And I click Table Layout tab
#    And I select Menu For Basic validation as "DESSERTS"
#  ##4. Choose the "Option" from the POS customer button in order screen
#    And I click Options button
#    And I click Gratuity button
##  And I select fixed gratuity in add gratuity screen
#    And I click Gratuity Fixed button
#    And I verify fixed gratuity is applied
#    And I click Payment button in the Order Management Screen
#    And I click cash button from the payment method popup
#    And I click Submit button on the Payment Window
#    And I click Table Layout tab
#    And I click power button
#    Examples:
#      |cato |
#      |DESSERTS|
#
#  Scenario: Manual Gratuity Varying
#    Given I'm logged in for Phone store
#    And I closed the order type window
#    And I click All
#    And I click Table Layout tab
#    And I select Menu For Basic validation as "DESSERTS"
#  ##4. Choose the "Option" from the POS customer button in order screen
#    And I click Options button
#    And I click Gratuity button
##  And I select fixed gratuity in add gratuity screen
#    And I click Gratuity varying button
#    Then I should see enter Percentage popup
#    And I pass the value and click Apply button
#    And I verify varying gratuity is applied
#  #   And I verify fixed gratuity is applied
#    And I click Payment button in the Order Management Screen
#    And I click cash button from the payment method popup
#    And I click Submit button on the Payment Window
#    And I click Table Layout tab
#    And I click power button
#  @basic
#  Scenario: Auto Gratuity Fixed
#    Given I'm logged in for Phone store
#    And I closed the order type window
#    And I click All
#    And I click Table Layout tab
#    And I select Menu For Basic validation as "DESSERTS"
# ## 4. Add second seat in the respective check
#    When I verify auto gratuity is applied or not
#    And I add a new seat
#    Then I should see Add Gratuity screen
#    And I click auto Gratuity Fixed button
#    And I select Menu of Basic validation for QSR as "DESSERTS"
#    When I verify auto gratuity is applied or not
#
#  #  And I click Options button
#   # And I click Gratuity button
#   # And I click auto Gratuity varying button
#   # Then I should see enter Percentage popup
#   # And I pass the value and click Apply button
#   # And I verify varying gratuity is applied
#    And I click Payment button in the Order Management Screen
#    And I click cash button from the payment method popup
#    And I click Submit button on the Payment Window
#    And I click Table Layout tab
#    And I click power button
#
#  @basic
#  Scenario: Auto Gratuity Varying(Multiple Auto Varying/Fixed gratuity is available means From Step 6 will be applicable)
#    ##NOTE: If the store has only one Auto Varying gratuity is available means Step 5 will be applicable
#
#  ##NOTE: If the store has Multiple Auto Varying/Fixed gratuity is available means From Step 6 will be applicable
#    Given I'm logged in for Phone store
#    And I closed the order type window
#    And I click All
#    And I click Table Layout tab
#    And I select Menu For Basic validation as "DESSERTS"
# ## 4. Add second seat in the respective check
#    When I verify auto gratuity is applied or not
#    And I add a new seat
#    Then I should see Add Gratuity screen
#    And I click auto Gratuity varying button
#    Then I should see enter Percentage popup
#    And I pass the value and click Apply button
#    And I select Menu of Basic validation for QSR as "DESSERTS"
#    When I verify auto gratuity is applied or not
#
# #   And I verify varying gratuity is applied
#    And I click Payment button in the Order Management Screen
#    And I click cash button from the payment method popup
#    And I click Submit button on the Payment Window
#    And I click Table Layout tab
#    And I click power button
#
##  Scenario: Auto Gratuity Fixed (only one Auto Varying gratuity is available means Step 5 will be applicable)
##    Given I'm logged in
#
##    And I closed the order type window
##    And I click All
##    And I click Table Layout tab
##    And I select Menu For Basic validation as "DESSERTS"
## ## 4. Add second seat in the respective check
##    When I verify auto gratuity is applied or not
##    And I add a new seat
##    Then I should see Add Gratuity screen
##    And I click auto Gratuity Fixed button
##    And I select Menu of Basic validation for QSR as "DESSERTS"
##    When I verify auto gratuity is applied or not
##
##  #  And I click Options button
##   # And I click Gratuity button
##   # And I click auto Gratuity varying button
##   # Then I should see enter Percentage popup
##   # And I pass the value and click Apply button
##   # And I verify varying gratuity is applied
##    And I click Payment button in the Order Management Screen
##    And I click cash button from the payment method popup
##    And I click Submit button on the Payment Window
##    And I click Table Layout tab
##    And I click power button
##
##  @basic
##  Scenario: Auto Gratuity Varying(Multiple Auto Varying/Fixed gratuity is available means From Step 6 will be applicable)
##    ##NOTE: If the store has only one Auto Varying gratuity is available means Step 5 will be applicable
##
##  ##NOTE: If the store has Multiple Auto Varying/Fixed gratuity is available means From Step 6 will be applicable
##    Given I'm logged in for Phone store
##    And I closed the order type window
##    And I click All
##    And I click Table Layout tab
##    And I select Menu For Basic validation as "DESSERTS"
## ## 4. Add second seat in the respective check
##    When I verify auto gratuity is applied or not
##    And I add a new seat
##    Then I should see Add Gratuity screen
##    And I click auto Gratuity varying button
##    Then I should see enter Percentage popup
##    And I pass the value and click Apply button
##    And I select Menu of Basic validation for QSR as "DESSERTS"
##    When I verify auto gratuity is applied or not
##
## #   And I verify varying gratuity is applied
##    And I click Payment button in the Order Management Screen
##    And I click cash button from the payment method popup
##    And I click Submit button on the Payment Window
#
##    And I click Table Layout tab
##    And I click power button
##
###  Scenario: Auto Gratuity Fixed (only one Auto Varying gratuity is available means Step 5 will be applicable)
###    Given I'm logged in
###    And I closed the order type window
###    And I click All
###    And I click Table Layout tab
###    And I select Menu For Basic validation as "DESSERTS"
### ## 4. Add second seat in the respective check
###    When I verify auto gratuity is applied or not
###    And I add a new seat
###    When I verify auto gratuity is applied or not in seat
### #   And I verify varying gratuity is applied
###    And I click Payment button in the Order Management Screen
###    And I click cash button from the payment method popup
###    And I click Submit button on the Payment Window
###
###  @basicValidate
###  Scenario: Auto Gratuity Varying (only one Auto Varying gratuity is available means Step 5 will be applicable)
###    Given I'm logged in
###    And I closed the order type window
###    And I click All
###    And I click Table Layout tab
###    And I select Menu For Basic validation as "DESSERTS"
### ## 4. Add second seat in the respective check
###    When I verify auto gratuity is applied or not
###    And I add a new seat
###    And I select Menu of Basic validation for QSR as "DESSERTS"
###    And I add a new seat
###    Then I should see enter gratuity percentage popup
###    And I pass the value and click Apply button for auto varying gratuity
###    And I select Menu of Basic validation for QSR as "DESSERTS"
###    When I verify auto gratuity is applied or not in seat
###    And I select the table in the orderscreen
### #   And I verify varying gratuity is applied
###    And I click Payment button in the Order Management Screen
###    And I click cash button from the payment method popup
###    And I click Submit button on the Payment Window
##
###
##  @mac
##  Scenario: Card Service Charge
##    Given I'm logged in for Phone store
#
#
##
#  @mac
#  Scenario: Card Service Charge
#    Given I'm logged in for Phone store
#    And I closed the order type window
#    And I click All
#    And I click Table Layout tab
#    And I select Menu For Basic validation as "APPETIZERS"
#    And I click Payment button in the Order Management Screen
#    When I get the balance Due Amount and cash option amount in payment window
#    And I click credit card payment on payment window
#    Then I should see card type window
#    And I select the card from card type
#    And I click ok button in card type window
#    When I verify balance due amount same with amount in total screen
#    And I click the Continue button on the Total screen
#    Then I should see your order card screen
#    When I verify service charge amount in card screen
#    And I click manual button on the your order screen
#    And I pass the card number as "4111111111111111"
#    And I pass card name as "Visa"
#    And I pass expire date as "1223"
#    And I click Process button on card screen
#    And I click Ok button in receipt printer popup
#    And I click Table Layout tab
#    And I click power button
#
#  @Basy
#  Scenario: Batch process
#    #Manual Batch
#    Given I'm logged in for Phone store
#    And I closed the order type window
#    And I click All
#    And I click Table Layout tab
#    And I select Menu For Basic validation as "APPETIZERS"
#    And I click Payment button in the Order Management Screen
#    When I get the balance Due Amount and cash option amount in payment window
#    And I click mppg auth payment in the payment window
#    Then I should see total screen
##    And I click tip as 10
#    And I click the Continue button on the Total screen
#    Then I should see your order card screen
#    And I click manual button on the your order screen
#    And I pass the card number as "4111111111111111"
#    And I pass card name as "Visa"
#    And I pass expire date as "1223"
#    And I click Process button on card screen
#    And I click Ok button in receipt printer popup
#    Then I should get back to the Table Layout tab
#    And I click the Operation button on the Table Layout
#    When I click batch/Tip adjustment button
#    And I click the device drop down "Down Arrow Black" button in the batch screen "click drop down button"
#   # And I select the payment name "MPPG AUTH" in the List "select payment"
#    And I select the MPPG Payment name in the device list
#    Then I should see the list of checks in batch screen
#    And I click "Submit Batch" in the batch screen "click submit batch button"
#    Then I should see batch has been initiated popup
#    And I click Done button on the Popup
#    And I click the Toggle Icon button
#    And I click the POS settings from Toggle
#    And I click the Toggle Icon button
#    When I click batch/Tip adjustment button
#    Then I should see the list of checks in batch screen
#    Then I should see last batch started text
#    And I click power button
#
#  @Basy
#  Scenario: Verify the Tip Adjustment for Online Sale in Batch Screen
#    Given I'm logged in for Phone store
#    And I closed the order type window
#    And I click All
#    And I click Table Layout tab
#    And I select Menu For Basic validation as "APPETIZERS"
#    And I click Payment button in the Order Management Screen
#    When I get the balance Due Amount and cash option amount in payment window
#    And I click mppg auth payment in the payment window
#    Then I should see total screen
#    And I click tip as 10
#    And I click the Continue button on the Total screen
#    Then I should see your order card screen
#    And I click manual button on the your order screen
#    And I pass the card number as "4111111111111111"
#    And I pass card name as "Visa"
#    And I pass expire date as "1223"
#    And I click Process button on card screen
#    And I click Ok button in receipt printer popup
#    Then I should get back to the Table Layout tab
#    And I click the Operation button on the Table Layout
#    When I click batch/Tip adjustment button
#    And I click the device drop down "Down Arrow Black" button in the batch screen "click drop down button"
#   # And I select the payment name "MPPG AUTH" in the List "select payment"
#    And I select the MPPG Payment name in the device list
#    Then I should see the list of checks in batch screen
#    When I click the check from batch screen
#    And I hide the keyboard
#    And I change tip amount in batch screen
#    Then I should see tip Amount is applied or not
#    And I hide the keyboard
#    And I click "Submit Batch" in the batch screen "click submit batch button"
#    Then I should see batch has been initiated popup
#    And I click Done button on the Popup
# # And I click the Toggle Icon button
# # And I click the POS settings from Toggle
# # And I click the Toggle Icon button
# # When I click batch/Tip adjustment button
# # Then I should see the list of checks in batch screen
#  #Then I should see last batch started text
#    Then I have verify check in the batch screen
#  #  And I click Table Layout tab
#    And I click power button
#          ## OFFLINE SALE ##
#
##  Scenario:Offline Sale (Process Offline)
##    Given I'm logged in
#
##    And I closed the order type window
##    And I click All
##    And I click Table Layout tab
##    And I select Menu For Basic validation as "APPETIZERS"
##    And I click Payment button in the Order Management Screen
##    When I get the balance Due Amount and cash option amount in payment window
##    And I click credit card payment on payment window
##    Then I should see card type window
##    And I select the card from card type
##    And I click ok button in card type window
##    When I verify balance due amount same with amount in total screen
##    And I click the Continue button on the Total screen
##    Then I should see your order card screen
##    When I verify service charge amount in card screen
##    And I click manual button on the your order screen
##    And I pass the card number as "4111111111111111"
##    And I pass card name as "Visa"
##    And I pass expire date as "1223"
##    And I click Process button on card screen
##    And I click Ok button in receipt printer popup
##    And I click Table Layout tab
##    And I click power button
##
##  @exe
##  Scenario: Batch process
##    #Manual Batch
##    Given I'm logged in for Phone store
##    And I closed the order type window
##    And I click All
##    And I click Table Layout tab
##    And I select Menu For Basic validation as "APPETIZERS"
##    And I click Payment button in the Order Management Screen
##    When I get the balance Due Amount and cash option amount in payment window
##    And I click mppg auth payment in the payment window
##    Then I should see total screen
###    And I click tip as 10
##    And I click the Continue button on the Total screen
##    Then I should see your order card screen
##    And I click manual button on the your order screen
##    And I pass the card number as "4111111111111111"
##    And I pass card name as "Visa"
##    And I pass expire date as "1223"
##    And I click Process button on card screen
##    And I click Ok button in receipt printer popup
##    Then I should get back to the Table Layout tab
##    And I click the Operation button on the Table Layout
##    When I click batch/Tip adjustment button
##    And I click the device drop down "Down Arrow Black" button in the batch screen "click drop down button"
##   # And I select the payment name "MPPG AUTH" in the List "select payment"
##    And I select the MPPG Payment name in the device list
##    Then I should see the list of checks in batch screen
##    And I click "Submit Batch" in the batch screen "click submit batch button"
##    Then I should see batch has been initiated popup
##    And I click Done button on the Popup
##    And I click the Toggle Icon button
##    And I click the POS settings from Toggle
##    And I click the Toggle Icon button
##    When I click batch/Tip adjustment button
##    Then I should see the list of checks in batch screen
##    Then I should see last batch started text
##    And I click power button
##
##  @exe
##  Scenario: Verify the Tip Adjustment for Online Sale in Batch Screen
##    Given I'm logged in for Phone store
##    And I closed the order type window
##    And I click All
##    And I click Table Layout tab
##    And I select Menu For Basic validation as "APPETIZERS"
##    And I click Payment button in the Order Management Screen
##    When I get the balance Due Amount and cash option amount in payment window
##    And I click mppg auth payment in the payment window
##    Then I should see total screen
##    And I click tip as 10
##    And I click the Continue button on the Total screen
##    Then I should see your order card screen
##    And I click manual button on the your order screen
##    And I pass the card number as "4111111111111111"
##    And I pass card name as "Visa"
##    And I pass expire date as "1223"
##    And I click Process button on card screen
##    And I click Ok button in receipt printer popup
##    Then I should get back to the Table Layout tab
##    And I click the Operation button on the Table Layout
##    When I click batch/Tip adjustment button
##    And I click the device drop down "Down Arrow Black" button in the batch screen "click drop down button"
##   # And I select the payment name "MPPG AUTH" in the List "select payment"
##    And I select the MPPG Payment name in the device list
##    Then I should see the list of checks in batch screen
##    When I click the check from batch screen
##    And I hide the keyboard
##    And I change tip amount in batch screen
##    Then I should see tip Amount is applied or not
##    And I hide the keyboard
##    And I click "Submit Batch" in the batch screen "click submit batch button"
##    Then I should see batch has been initiated popup
##    And I click Done button on the Popup
#
## # And I click the Toggle Icon button
## # And I click the POS settings from Toggle
## # And I click the Toggle Icon button
## # When I click batch/Tip adjustment button
## # Then I should see the list of checks in batch screen
##  #Then I should see last batch started text
##    Then I have verify check in the batch screen
##  #  And I click Table Layout tab
##    And I click power button
##          ## OFFLINE SALE ##
##
###  Scenario:Offline Sale (Process Offline)
###    Given I'm logged in
###    And I closed the order type window
###    And I click All
###    And I click Table Layout tab
###    And I select Menu For Basic validation as "APPETIZERS"
###    And I click Payment button in the Order Management Screen
###    When I get the balance Due Amount and cash option amount in payment window
###    And I click mppg auth payment in the payment window
###    Then I should see total screen
###    And I click tip as 10
###    And I click the Continue button on the Total screen
###    Then I should see your order card screen
###    And I click manual button on the your order screen
###    And I pass the card number as "4111111111111111"
###    And I pass card name as "Visa"
###    And I pass expire date as "1223"
###    And I click Process button on card screen
###    ## OFFLINE POPUP ##
###    Then I should see device offline popup
###    And I click Yes button on driver is offline popup
###    And I click Ok button in receipt printer popup
###    And I click Done button on the Popup
###    Then I should get back to the Table Layout tab
###    And I click the Operation button on the Table Layout
###    When I click batch/Tip adjustment button
###    And I click the device drop down "Down Arrow Black" button in the batch screen "click drop down button"
###   # And I select the payment name "MPPG AUTH" in the List "select payment"
###    And I select the MPPG Payment name in the device list
###    Then I should see the list of checks in batch screen
###
###    And I click "Process Offline" in the batch screen "click process offline button"
###    Then I should see batch has been initiated popup
###    And I click Done button on the Popup
###    And I click the Toggle Icon button
###    And I click the POS settings from Toggle
###    And I click the Toggle Icon button
###    When I click batch/Tip adjustment button
###    Then I should see the list of checks in batch screen
###    Then I should see last batch started text
##
###  Scenario: Verify the Tip Adjustment for OFFLINE Sale in Batch Screen
###    Given I'm logged in
###    And I closed the order type window
###    And I click All
###    And I click Table Layout tab
###    And I select Menu For Basic validation as "APPETIZERS"
###    And I click Payment button in the Order Management Screen
###    When I get the balance Due Amount and cash option amount in payment window
###    And I click mppg auth payment in the payment window
###    Then I should see total screen
###    And I click tip as 10
###    And I click the Continue button on the Total screen
###    Then I should see your order card screen
###    And I click manual button on the your order screen
###    And I pass the card number as "4111111111111111"
###    And I pass card name as "Visa"
###    And I pass expire date as "1223"
###    And I click Process button on card screen
###    ## OFFLINE POPUP ##
###    Then I should see device offline popup
###    And I click Yes button on driver is offline popup
###    And I click Ok button in receipt printer popup
###    And I click Done button on the Popup
###    Then I should get back to the Table Layout tab
###    And I click the Operation button on the Table Layout
###    When I click batch/Tip adjustment button
###    And I click the device drop down "Down Arrow Black" button in the batch screen "click drop down button"
###   # And I select the payment name "MPPG AUTH" in the List "select payment"
###    And I select the MPPG Payment name in the device list
###    Then I should see the list of checks in batch screen
###    When I click the check from batch screen
###    And I hide the keyboard
###    Then I should see cannot apply tip for offline payment
###    And I click Done button on the Popup
###    And I click "Process Offline" in the batch screen "click process offline button"
###    Then I should see batch has been initiated popup
###    And I click Done button on the Popup
###    And I click the Toggle Icon button
###    And I click the POS settings from Toggle
###    And I click the Toggle Icon button
###    When I click batch/Tip adjustment button
###    Then I should see the list of checks in batch screen
###    Then I should see last batch started text
###
###  Scenario: Auto Batch
###    Given I'm logged in
###    And I closed the order type window
###    And I click All
###    And I click Table Layout tab
###    And I select Menu For Basic validation as "APPETIZERS"
###    And I click Payment button in the Order Management Screen
###    When I get the balance Due Amount and cash option amount in payment window
###    And I click mppg auth payment in the payment window
###    Then I should see total screen
###    And I click tip as 10
###    And I click the Continue button on the Total screen
###    Then I should see your order card screen
###    And I click manual button on the your order screen
###    And I pass the card number as "4111111111111111"
###    And I pass card name as "Visa"
###    And I pass expire date as "1223"
###    And I click Process button on card screen
###    And I click Ok button in receipt printer popup
###    Then I should get back to the Table Layout tab
###    And I click the Operation button on the Table Layout
###    When I click batch/Tip adjustment button
###    And I click the device drop down "Down Arrow Black" button in the batch screen "click drop down button"
###   # And I select the payment name "MPPG AUTH" in the List "select payment"
###    And I select the MPPG Payment name in the device list
###    Then I should see the list of checks in batch screen
###    When I click the check from batch screen
###    And I hide the keyboard
###    And I change tip amount in batch screen
###    Then I should see tip Amount is applied or not
###    And I hide the keyboard
###    And I click "Submit Batch" in the batch screen "click submit batch button"
###    Then I should see batch has been initiated popup
###    And I click Done button on the Popup
###    And I have verify check in the batch screen
###
##
##
##
##  Scenario: Customer
##    ## Verify the Customer attachment and search(name & phone no).
##    Given I'm logged in for Phone store
##    And I closed the order type window
##    And I click Add Customer Button
##    And I click Add new button
##    Then I should see the customer profile window
##    And I enter the customer name randomly
##    And I click log off button in order screen
##
##
##  Scenario: Orders
##     ## Verify Orders(Menu, Menu with Serving size, Menu with Modifiers, Menu with Modifiers and Prefix, Menu with Serving, Modifiers and Prefix)
##  ##  Menu   ##
##    Given I'm logged in for Phone store
##    And I closed the order type window
##    And I select Menu of Basic validation for QSR as "APPETIZERS"
##    And I click Payment button in the Order Management Screen
##    And I click cash button from the payment method popup
##    And I click Submit button in the Payment popup
##    Then I should see the order type window
##
##
## #   Scenario: Menu with serving size
##  #    Given I'm logged in for Phone store
##    And I closed the order type window
##    And I select category as "APPETIZERS"
##    And I select menu item as "BONELESS WINGS"
##    And I select modifier as "LARGE"
##    And I click Payment button in the Order Management Screen
##    And I click cash button from the payment method popup
##    And I click Submit button in the Payment popup
##    Then I should see the order type window
##
##  #Scenario: Menu with serving size
##   # Given I'm logged in for Phone store
##    And I closed the order type window
##    And I select category as "APPETIZERS"
##    And I select menu item as "FLAUTAS"
##    And I select modifier as "HOLD SAUCE"
##    And I click Done to get back
##    And I click Payment button in the Order Management Screen
##    And I click cash button from the payment method popup
##    And I click Submit button in the Payment popup
##    Then I should see the order type window
##
##
##  #Scenario:  Menu with Modifiers and Prefix
##   # Given I'm logged in for Phone store
##    And I closed the order type window
##    And I select category as "Noodles"
##    And I select menu item as "BeefNoodles"
##    And I select modifier as "Onions"
##    And I select prefix modifier
##    And I click Done to get back
##    Then I should verify prefix modifier added to the menu
##    And I click Payment button in the Order Management Screen
##    And I click cash button from the payment method popup
##    And I click Submit button in the Payment popup
##    Then I should see the order type window
##
##
##  #  Scenario:Menu with Serving, Modifiers and Prefix
##   #   Given I'm logged in for Phone store
##    And I closed the order type window
##    And I select category as "APPETIZERS"
##    And I select menu item as "Napati"
##    And I select modifier as "EACH"
##    And I select modifier as "ADD AVOCADO"
##    And I select prefix modifier
##    And I click Done to get back
##    Then I should verify prefix modifier added to the menu
##    And I click Payment button in the Order Management Screen
##    And I click cash button from the payment method popup
##    And I click Submit button in the Payment popup
##    Then I should see the order type window
##    And I closed the order type window
##    And I click log off button in order screen
##
##  @exe
##  Scenario: Verify the sale in QSR Service Type
##    Given I'm logged in for Phone store
##    And I close the order type window
##    And I tap QSR button to open the order types combo
##    And I get check number
##    And I select Menu of Basic validation for QSR as "APPETIZERS"
##    And I click Order button in the order management screen
##    And I click Payment button in the Order Management Screen
##    And I select Cash as payment method
##    And I click Submit button on the Payment Window
##    And I close the order type window
##    And I click All
##    And I click Closed tab on the Check stats
##    Then I should see closed check in closed check tab
##
##    ## Verify the sale in Dine In Service Type
##    And I click Table Layout tab
##    And I select Menu For Dine order type
##    And I click Order button in the order management screen
##    And I click Payment button in the Order Management Screen
##    And I select Cash as payment method
##    And I click Submit button on the Payment Window
##    And I click Table Layout tab
##    And I click Check Stats tab
##    And I click Closed tab on the Check stats
##    Then I should see closed check in closed check tab
##
##
##    ## Verify the sale in Service Type(For Here)
##    And I click QSR tab
##    And I select the order type FORHERE
##    And I click Done button to select the order type
##    Then I should see the customer profile window
##    And I select search
##    And I enter an existing customer's name "Aaron Pak"
##    And I select the customer for basic
##    When I click the Save button
##    Then I should see the Ordering Screen with a button with the label "For Here"
##    Then I should see customer as "Aaron P" added on order screen
##    And I get check number
##    And I select Menu of Basic validation for QSR as "APPETIZERS"
##    And I click Finish Order button
##    Then I should see the Phone Order tab
##    And I click the Closed check in new tab window
##    And I click Pay Check button
##    Then I should see the Payment window
##    And I click cash button from the payment method popup
##    And I click Submit button in the Payment popup
##    And I click Check Stats tab
##    And I click Closed tab on the Check stats
##    Then I should see closed check in closed check tab
##
##
##    ## Verify the sale in Service Type( TO GO )
##
##    And I click QSR tab
##    And I select the TOGO order type
##    And I click Done button to select the order type
##    Then I should see the customer profile window
##    And I select search
##    And I enter an existing customer's name "Aaron Pak"
##    And I select the customer for basic
##    When I click the Save button
##    Then I should see the Ordering Screen with a button with the label "To Go"
##    Then I should see customer as "Aaron P" added on order screen
##    And I get check number
##    And I select Menu of Basic validation for QSR as "APPETIZERS"
##    And I click Finish Order button
##    Then I should see the Phone Order tab
##    And I click the Closed check in new tab window
##    And I click Pay Check button
##    Then I should see the Payment window
##    And I click cash button from the payment method popup
##    And I click Submit button in the Payment popup
##    And I click Check Stats tab
##    And I click Closed tab on the Check stats
##    Then I should see closed check in closed check tab
##    And I click power button
##
##  @exe
##  Scenario: Sale In Service Types
##    ## Verify the sale in Service Type( TO GO )
##    Given I'm logged in for Phone store
##    ## Verify the sale in Service Type( Phone TO GO )
##   # And I click QSR tab
##    And I select the Phone To Go order type
##    And I click Done button to select the order type
##    Then I should see the customer profile window
##    And I select search
##    And I enter an existing customer's name "Aaron Pak"
##    And I select the customer for basic
##    When I click the Save button
##    Then I should see the Ordering Screen with a button with the label "To Go"
##    Then I should see customer as "Aaron P" added on order screen
##    And I get check number
##    And I select Menu of Basic validation for QSR as "APPETIZERS"
##    And I click Finish Order button
##    Then I should see the Phone Order tab
##    And I click the Closed check in new tab window
##    And I click Pay Check button
##    Then I should see the Payment window
##    And I click cash button from the payment method popup
##    And I click Submit button in the Payment popup
##    And I click Check Stats tab
##    And I click Closed tab on the Check stats
##    Then I should see closed check in closed check tab
##
##    # Verify the sale in Service Type(Delivery)
##    And I click QSR tab
##    And I select the DELIVERY order type
##    And I click Done button to select the order type
##    Then I should see the customer profile window
##    And I select search
##    And I enter an existing customer's name "Aaron Pak"
##    And I select the customer for basic
##    When I click the Save button
##    Then I should see customer as "Aaron P" added on order screen
##    And I get check number
##    Then I should see Delivery charge is match with Amount in order screen
##    And I select Menu of Basic validation for QSR as "APPETIZERS"
##    And I click Finish Order button
##    Then I should see the Phone Order tab
##    And I click the Closed check in new tab window
##    And I click Pay Check button
##    Then I should see the Payment window
##    And I click cash button from the payment method popup
##    And I click Exit to return to Order Management Screen
##    And I click Finish Order button
##    And I click the Closed check in new tab window
##    And I click active driver as "Trans0007 0"
##    Then I should see driver is offline popup
##    And I click Yes button on driver is offline popup
##    And I click active driver as "Trans0007 0"
##    And I click departure button
##    And I click out tab in phone order screen
##    And I click the Closed check in out tab
##    And I click Arrival button in phone order screen
##    And I click Complete tab
##    Then I should see closed check in complete tab
##
##
##    # Verify the sale in Service Type(Phone Delivery)
##    And I click QSR tab
##    And I select the Phone Delivery Service type
##    And I click Done button to select the order type
##    Then I should see the customer profile window
##    And I select search
##    And I enter an existing customer's name "Aaron Pak"
##    And I select the customer for basic
##    When I click the Save button
##
##    Then I should see customer as "Aaron P" added on order screen
##    And I get check number
##    Then I should see Delivery charge is match with Amount in order screen
##    And I select Menu of Basic validation for QSR as "APPETIZERS"
##    And I click Finish Order button
##    Then I should see the Phone Order tab
##    And I click the Closed check in new tab window
##    And I click Pay Check button
##    Then I should see the Payment window
##    And I click cash button from the payment method popup
##    And I click Exit to return to Order Management Screen
##    And I click Finish Order button
##    And I click the Closed check in new tab window
##    And I click active driver as "Trans0007 0"
##    Then I should see driver is offline popup
##    And I click Yes button on driver is offline popup
##    And I click active driver as "Trans0007 0"
##    And I click departure button
##    And I click out tab in phone order screen
##    And I click the Closed check in out tab
##    And I click Arrival button in phone order screen
##    And I click Complete tab
##    Then I should see closed check in complete tab
##    And I hide the keyboard
##
##
##  Scenario: Verify the sale in Bar Tab Service Type
##    Given I'm logged in for Phone store
##    And I closed the order type window
##    And I click All
##    And I click BarTab Layout
##    And I click New Tab in the Bar Tab Screen
##    Then I should see preauth window
##    And I click Process button on card screen
##    Then I should see no device is connected to iPad
##    And I click Done button on the Popup
##    And I click the Exit to close the preauth window
##    And I get check number
##    And I select Menu of Basic validation for QSR as "APPETIZERS"
##    And I click Finish Order button
##    Then I should see the bar tab screen
##    And I click merged barTab
##    And I click Payment button in the Order Management Screen
##    And I click cash button from the payment method popup
##    And I click Submit button on the Payment Window
##    And I click power button
##
##
##
##
##
##
##
##
#
##    And I have verify check in the batch screen
##
#
#
#
#  Scenario: Customer
#    ## Verify the Customer attachment and search(name & phone no).
#    Given I'm logged in for Phone store
#    And I closed the order type window
#    And I click Add Customer Button
#    And I click Add new button
#    Then I should see the customer profile window
#    And I enter the customer name randomly
#    And I click log off button in order screen
#
#
#  Scenario: Orders
#     ## Verify Orders(Menu, Menu with Serving size, Menu with Modifiers, Menu with Modifiers and Prefix, Menu with Serving, Modifiers and Prefix)
#  ##  Menu   ##
#    Given I'm logged in for Phone store
#    And I closed the order type window
#    And I select Menu of Basic validation for QSR as "APPETIZERS"
#    And I click Payment button in the Order Management Screen
#    And I click cash button from the payment method popup
#    And I click Submit button in the Payment popup
#    Then I should see the order type window
#
#
# #   Scenario: Menu with serving size
#  #    Given I'm logged in for Phone store
#    And I closed the order type window
#    And I select category as "APPETIZERS"
#    And I select menu item as "BONELESS WINGS"
#    And I select modifier as "LARGE"
#    And I click Payment button in the Order Management Screen
#    And I click cash button from the payment method popup
#    And I click Submit button in the Payment popup
#    Then I should see the order type window
#
#  #Scenario: Menu with serving size
#   # Given I'm logged in for Phone store
#    And I closed the order type window
#    And I select category as "APPETIZERS"
#    And I select menu item as "FLAUTAS"
#    And I select modifier as "HOLD SAUCE"
#    And I click Done to get back
#    And I click Payment button in the Order Management Screen
#    And I click cash button from the payment method popup
#    And I click Submit button in the Payment popup
#    Then I should see the order type window
#
#
#  #Scenario:  Menu with Modifiers and Prefix
#   # Given I'm logged in for Phone store
#    And I closed the order type window
#    And I select category as "Noodles"
#    And I select menu item as "BeefNoodles"
#    And I select modifier as "Onions"
#    And I select prefix modifier
#    And I click Done to get back
#    Then I should verify prefix modifier added to the menu
#    And I click Payment button in the Order Management Screen
#    And I click cash button from the payment method popup
#    And I click Submit button in the Payment popup
#    Then I should see the order type window
#
#
#  #  Scenario:Menu with Serving, Modifiers and Prefix
#   #   Given I'm logged in for Phone store
#    And I closed the order type window
#    And I select category as "APPETIZERS"
#    And I select menu item as "Napati"
#    And I select modifier as "EACH"
#    And I select modifier as "ADD AVOCADO"
#    And I select prefix modifier
#    And I click Done to get back
#    Then I should verify prefix modifier added to the menu
#    And I click Payment button in the Order Management Screen
#    And I click cash button from the payment method popup
#    And I click Submit button in the Payment popup
#    Then I should see the order type window
#    And I closed the order type window
#    And I click log off button in order screen
#  @Basy
#  Scenario: Verify the sale in QSR Service Type
#    Given I'm logged in for Phone store
#    And I close the order type window
#    And I tap QSR button to open the order types combo
#    And I get check number
#    And I select Menu of Basic validation for QSR as "APPETIZERS"
#    And I click Order button in the order management screen
#    And I click Payment button in the Order Management Screen
#    And I select Cash as payment method
#    And I click Submit button on the Payment Window
#    And I close the order type window
#    And I click All
#    And I click Closed tab on the Check stats
#    Then I should see closed check in closed check tab
#
#    ## Verify the sale in Dine In Service Type
#    And I click Table Layout tab
#    And I select Menu For Dine order type
#    And I click Order button in the order management screen
#    And I click Payment button in the Order Management Screen
#    And I select Cash as payment method
#    And I click Submit button on the Payment Window
#    And I click Table Layout tab
#    And I click Check Stats tab
#    And I click Closed tab on the Check stats
#    Then I should see closed check in closed check tab
#
#
#    ## Verify the sale in Service Type(For Here)
#    And I click QSR tab
#    And I select the order type FORHERE
#    And I click Done button to select the order type
#    Then I should see the customer profile window
#    And I select search
#    And I enter an existing customer's name "Aaron Pak"
#    And I select the customer for basic
#    When I click the Save button
#    Then I should see the Ordering Screen with a button with the label "For Here"
#    Then I should see customer as "Aaron P" added on order screen
#    And I get check number
#    And I select Menu of Basic validation for QSR as "APPETIZERS"
#    And I click Finish Order button
#    Then I should see the Phone Order tab
#    And I click the Closed check in new tab window
#    And I click Pay Check button
#    Then I should see the Payment window
#    And I click cash button from the payment method popup
#    And I click Submit button in the Payment popup
#    And I click Check Stats tab
#    And I click Closed tab on the Check stats
#    Then I should see closed check in closed check tab
#
#
#    ## Verify the sale in Service Type( TO GO )
#
#    And I click QSR tab
#    And I select the TOGO order type
#    And I click Done button to select the order type
#    Then I should see the customer profile window
#    And I select search
#    And I enter an existing customer's name "Aaron Pak"
#    And I select the customer for basic
#    When I click the Save button
#    Then I should see the Ordering Screen with a button with the label "To Go"
#    Then I should see customer as "Aaron P" added on order screen
#    And I get check number
#    And I select Menu of Basic validation for QSR as "APPETIZERS"
#    And I click Finish Order button
#    Then I should see the Phone Order tab
#    And I click the Closed check in new tab window
#    And I click Pay Check button
#    Then I should see the Payment window
#    And I click cash button from the payment method popup
#    And I click Submit button in the Payment popup
#    And I click Check Stats tab
#    And I click Closed tab on the Check stats
#    Then I should see closed check in closed check tab
#    And I click power button
#
#  @Basy
#  Scenario: Sale In Service Types
#    ## Verify the sale in Service Type( TO GO )
#    Given I'm logged in for Phone store
#    ## Verify the sale in Service Type( Phone TO GO )
#   # And I click QSR tab
#    And I select the Phone To Go order type
#    And I click Done button to select the order type
#    Then I should see the customer profile window
#    And I select search
#    And I enter an existing customer's name "Aaron Pak"
#    And I select the customer for basic
#    When I click the Save button
#    Then I should see the Ordering Screen with a button with the label "To Go"
#    Then I should see customer as "Aaron P" added on order screen
#    And I get check number
#    And I select Menu of Basic validation for QSR as "APPETIZERS"
#    And I click Finish Order button
#    Then I should see the Phone Order tab
#    And I click the Closed check in new tab window
#    And I click Pay Check button
#    Then I should see the Payment window
#    And I click cash button from the payment method popup
#    And I click Submit button in the Payment popup
#    And I click Check Stats tab
#    And I click Closed tab on the Check stats
#    Then I should see closed check in closed check tab
#
#    # Verify the sale in Service Type(Delivery)
#    And I click QSR tab
#    And I select the DELIVERY order type
#    And I click Done button to select the order type
#    Then I should see the customer profile window
#    And I select search
#    And I enter an existing customer's name "Aaron Pak"
#    And I select the customer for basic
#    When I click the Save button
#    Then I should see customer as "Aaron P" added on order screen
#    And I get check number
#    Then I should see Delivery charge is match with Amount in order screen
#    And I select Menu of Basic validation for QSR as "APPETIZERS"
#    And I click Finish Order button
#    Then I should see the Phone Order tab
#    And I click the Closed check in new tab window
#    And I click Pay Check button
#    Then I should see the Payment window
#    And I click cash button from the payment method popup
#    And I click Exit to return to Order Management Screen
#    And I click Finish Order button
#    And I click phone order tab
#    And I click the Closed check in new tab window
#    And I click active driver as "Trans0007 0"
#    Then I should see driver is offline popup
#    And I click Yes button on driver is offline popup
#    And I click active driver as "Trans0007 0"
#    And I click departure button
#    And I click out tab in phone order screen
#    And I click the Closed check in out tab
#    And I click Arrival button in phone order screen
#    And I click Complete tab
#    Then I should see closed check in complete tab
#
#
#    # Verify the sale in Service Type(Phone Delivery)
#    And I click QSR tab
#    And I select the Phone Delivery Service type
#    And I click Done button to select the order type
#    Then I should see the customer profile window
#    And I select search
#    And I enter an existing customer's name "Aaron Pak"
#    And I select the customer for basic
#    When I click the Save button
#
#    Then I should see customer as "Aaron P" added on order screen
#    And I get check number
#    Then I should see Delivery charge is match with Amount in order screen
#    And I select Menu of Basic validation for QSR as "APPETIZERS"
#    And I click Finish Order button
#    Then I should see the Phone Order tab
#    And I click the Closed check in new tab window
#    And I click Pay Check button
#    Then I should see the Payment window
#    And I click cash button from the payment method popup
#    And I click Exit to return to Order Management Screen
#    And I click Finish Order button
#    And I click phone order tab
#    And I click the Closed check in new tab window
#    And I click active driver as "Trans0007 0"
#    Then I should see driver is offline popup
#    And I click Yes button on driver is offline popup
#    And I click active driver as "Trans0007 0"
#    And I click departure button
#    And I click out tab in phone order screen
#    And I click the Closed check in out tab
#    And I click Arrival button in phone order screen
#    And I click Complete tab
#    Then I should see closed check in complete tab
#    And I hide the keyboard
#    And I click power button
#
#
#  Scenario: Verify the sale in Bar Tab Service Type
#    Given I'm logged in for Phone store
#    And I closed the order type window
#    And I click All
#    And I click BarTab Layout
#    And I click New Tab in the Bar Tab Screen
#    Then I should see preauth window
#    And I click Process button on card screen
#    Then I should see no device is connected to iPad
#    And I click Done button on the Popup
#    And I click the Exit to close the preauth window
#    And I get check number
#    And I select Menu of Basic validation for QSR as "APPETIZERS"
#    And I click Finish Order button
#    Then I should see the bar tab screen
#    And I click merged barTab
#    And I click Payment button in the Order Management Screen
#    And I click cash button from the payment method popup
#    And I click Submit button on the Payment Window
#    And I click power button
#
#  Scenario: Menu Option - Verify the Menu option for the all service type by menu level in order screen
#     ## AUTOMATIC HOLD ##
#    Given I'm logged in for Phone store
#    And I closed the order type window
##    And I select category as "BEER"
##    And I select menu item as "SPECIAL BEER"
##    And I select menu item  as "SPECIAL BEER" to see menu option window
##    And I click Hold to put order on hold
##    And I click Automatic button on Hold popup
##    And I click Done in the hold window
##    Then I should see hold Icon change to Tick Icon
##    And I click Cash button for Complete Sale
##    And I click Exact button on the cash pop-up
##    And I click Enter Button on the cash pop-up
#      ####  MANUAL HOLD  ####
##    And I closed the order type window
#    And I select category as "BEER"
#    And I select menu item as "SPECIAL BEER"
#    And I select menu item  as "SPECIAL BEER" to see menu option window
#    And I click Hold to put order on hold
#    And I click Done in the hold window
#     # When I click Back to return to Order Management Screen
#    Then I should see the hold icon over the order section
#      ####  FIRE   ###
#    And I click menu item as "SPECIAL BEER" to see Menu option screen
#    And I click Fire to send menu item to kitchen
#    Then I should see do you want to send hold menu items to kitchen popup message
#    And I click Yes button on send to kitchen popup
#      #####  VOID ITEM  #####
#    And I click menu item as "SPECIAL BEER" to see Menu option screen
#    And I click void item on Menu option
#    Then I should see the void reason popup
#    And I click void Reason on the void popup
#    And I click Add Button on the void reason popup
#    Then I should see Receipt Printer popup
#    And I click Done button on the Popup
#    And I click Void button on order management screen
#    Then I should see the void reason popup
#    And I click void Reason on the void popup
#    And I click Add Button on the void reason popup
#    Then I should see Receipt Printer popup
#    And I click Done button on the Popup
#      #####  REPEAT  #####
#    And I closed the order type window
#    And I select category as "BEER"
#    And I select menu item as "SPECIAL BEER"
#    And I select menu item  as "SPECIAL BEER" to see menu option window
#    And I click Repeat on menu option
#    Then I should see Repeated menu item as "SPECIAL BEER"
#      ##### QUANTITY  #####
#    And I click menu item as "SPECIAL BEER" to see Menu option screen
#    And I click Quantity on menu option
#    And I click "3"
#    And I click the Continue button
#    Then I should see "3" is Increased
#    And I click menu item as "SPECIAL BEER" to see Menu option screen
#    And I click Quantity on menu option
#    And I click "1"
#    And I click the Continue button
#    Then I should see "1" is Increased
#      #####  ATTACH  #####
#    And I click menu item as "SPECIAL BEER" to see Menu option screen
#    And I click Attach on menu option
#    Then I should see Add Notes popup
#    And I click Add notes reason as "Spicy"
#    And I click Add Button on the void reason popup
#    Then I should see reason as "Spicy" on the Order screen
#    And I click Void button on order management screen
#    Then I should see All orders are voided
#    And I click Done button on the Popup
#      #####  DISCOUNT  #####
#
#    And I select category as "DESSERTS"
#    And I select menu item as "CHEESECAKE"
#    And I select menu item  as "CHEESECAKE" to see menu option window
#    And I click discount on menu option
#    And I click discount as "IB-AfterTax-Amount" in discount window
#    Then I verify discount as "IB-AfterTax-Amount" is applied or not in order screen
#    And I click Void button on order management screen
#    Then I should see All orders are voided
#    And I click Done button on the Popup
#      ##### OPEN ITEM #####
#    And I select category as "BEER"
#    And I select menu item as "SPECIAL BEER"
#    And I click menu item as "SPECIAL BEER" to see Menu option screen
#    And I click Open Item button
#    Then I should see open item screen
#    And I click Coursing Name text field for Menu option
#    And I swipe to "DESSERT" as Coursing Name
#    And I pass course name as "fruits"
#    And I tap Price text field for menu option
#    And I enter the price with sale
#    And I click Continue button on the Open Item Price numbers popup
#    And I click Done button on the open item window
#    Then I should navigate to Order Management screen and see the added open item as "fruits"
#    And I click Void button on order management screen
#    Then I should see All orders are voided
#    And I click Done button on the Popup
#      ##### OPEN DISCOUNT #####
#
#    And I select category as "BEER"
#    And I select menu item as "pepesi"
#    Then I should see orderscreen with menu item prize as "$ 11.11"
#    Then I should see the tax amount reflected to the check as "$ 1.11"
#      #Then I should see the Discount amount reflected to the check as "TL 50,00"
#    Then I should see orderscreen with menu item Total as "$ 13.44"
#    And I click menu item as "pepesi" to see Menu option screen
#    And I click Quantity on menu option
#    And I click "5"
#    And I click the Continue button
#    Then I should see "5" is Increased
#    And I click menu item as "pepesi" to see Menu option screen
#    And I click Open Discount on menu option
#    Then I should see Open discount Screen
#    And I pass the amount on open discount for open item discount as discount Percentage1 for "After"
#    Then I should see discount applied on order screen
#    Then I should see orderscreen with menu item prize as "$ 55.55"
#    Then I should see the tax amount reflected to the check as "$ 5.56"
#    Then I should see the Discount amount reflected to the check as "$ 12.40"
#    Then I should see orderscreen with menu item Total as "$ 48.71"
#    And I click Void button on order management screen
#    Then I should see All orders are voided
#    And I click Done button on the Popup
#      ######  OPEN MODIFIER  ######
##  Scenario: ss
##    Given I'm logged in for Phone store
##    And I closed the order type window
#    And I select category as "APPETIZERS"
#    And I select menu item as "7 UP Menuss"
#    And I click menu item as "7 UP Menuss" to see Menu option screen
#    And I click Open Modifier on menu option
#    Then I should see Open modifier Screen
#    And I pass the Name as "fruits" and price on Open Modifier
#    Then I should see open modifier as "fruits" added on open modifiers screen
#    And I click Done button on the Popup
#    And I click Back button in the menu options window
#    Then I should see modifier as "fruits" applied on order screen
#    And I click Void button on order management screen
#    Then I should see All orders are voided
#    And I click Done button on the Popup
#      #######  CHANGE COURSING  #######
#    And I select category as "BEER"
#    And I select menu item as "pepesi"
#    And I click menu item as "pepesi" to see Menu option screen
#    And I click change coursing on menu option
#    And I swipe to "DESSERT" as Coursing Name
#    And I click Done button on the open item window
#    Then I should see coursing name as "DESSERT"
#    And I click Void button on order management screen
#    Then I should see All orders are voided
#    And I click Done button on the Popup
#    And I click log off button in order screen
#
##  Scenario: Check OPTIONS
##         #######   TAX EXEMPT  #######
##        Given I'm logged in for Phone store
##        And I closed the order type window
##    And I select category as "BEER"
##    And I select menu item as "pepesi"
##    Then I should see orderscreen with menu item prize as "$ 11.11"
##    Then I should see the tax amount reflected to the check as "$ 1.11"
##      #Then I should see the Discount amount reflected to the check as "TL 50,00"
##    Then I should see orderscreen with menu item Total as "$ 13.44"
##    And I click Options button
##    Then I should see the Check Options screen
##    And I click Tax Exempt Button
##    Then I should see tax exempt reasons
##    And I select School as reason
##    Then I should see orderscreen with menu item prize as "$ 11.11"
##    Then I should see the tax reflected to the check
##    Then I should see orderscreen with menu item Total as "$ 11.11"
##    And I click Options button
##    Then I should see the Check Options screen
##    And I click Tax Exempt Button
##    Then I should see Tax Exempt removed successfully popup
##    And I click Done button on the Popup
##    Then I should see orderscreen with menu item prize as "TL 120,00"
##    Then I should see the tax amount reflected to the check as "TL 24,01"
##    Then I should see orderscreen with menu item Total as "TL 144,00"
##    And I click Void button on order management screen
##    Then I should see All orders are voided
##    And I click Done button on the Popup
#
##  @Disc
##        ######  DISCOUNT  #######
##  Scenario: DISCOUNT
##          Given I'm logged in for Phone store
##        And I closed the order type window
##    And I select category as "FOOD"
##    And I select menu item as "mongo test"
##    And I click Options button
##    And I click discount on check option screen
##    And I click item discount from the check options
##    And I select tax as "IB-AfterTax-Amount"
##    Then I should see discount as "IB-AfterTax-Amount" applied on order screen
##    Then I verify Item discount as "IB-AfterTax-Amount" is applied or not in order screen
##    And I click Options button
##    And I click discount on check option screen
##    And I click item discount from the check options
##    And I select tax as "IB-AfterTax-Amount"
##    And I click Options button
##    And I click discount on check option screen
##    And I click check discount from the check options
##    And I select tax as "Check-Based Percentage"
##    Then I verify check discount is applied or not in order screen
##    And I click Options button
##    And I click discount on check option screen
##    And I click check discount from the check options
##    And I select tax as "Check-Based Percentage"
##    And I click Options button
##    Then I should see the Check Options screen
##    And I click discount on check option screen
##    And I select open check discount
##    Then I should see Open discount Screen
##       #   And I pass the amount on open discount for open check discount safety percentage whole value as 20 for "After"
##    And I pass the amount as "20,00" on open discount as "After"
##    Then I should see orderscreen with open check discount
##    Then I verify open check discount is applied or not in order screen
##    Then I should see orderscreen with menu item prize as "TL 50,00"
##    Then I should see the tax amount reflected to the check as "TL 0,00"
##    Then I should see the Discount amount reflected to the check as "TL 20,00"
##    Then I should see orderscreen with menu item Total as "TL 30,00"
##    And I click Options button
##    Then I should see the Check Options screen
##    And I click discount on check option screen
##    And I select open check discount
##    Then I should see Open discount Screen
##    And I click remove button
##    And I click Options button
##    Then I should see the Check Options screen
##    And I click discount on check option screen
##    And I select open check discount
##    Then I should see Open discount Screen
##    And I pass the amount as "40,00" on open discount as "After"
##    Then I should see discount exceeds the safety limit popup
##    And I click Done button on the Popup
##    And I click cancel button on the table layout screen
##    And I click Back button on Tax Exempt window
##    And I click Back button on Check Options Screen
##    And I click Void button on order management screen
##    Then I should see All orders are voided
##    And I click Done button on the Popup
##          And I click log off button in order screen
#  @Basy
#  Scenario: OPEN ITEM
#          ####### Open Item #######
#    Given I'm logged in for Phone store
#    And I closed the order type window
#    And I click Options button
#    Then I should see the Check Options screen
#    And I click Open Item button
#    Then I should see open item screen
#    And I click Coursing Name text field
#    And I swipe to "RETAIL" as Coursing Name
#    And I enter course name as "Open Item" for check based open item
#    And I tap Price text field
#    And I enter price for check based open item
#    And I get the open item value from open item window
#    And I click Continue button on the Open Item Price numbers popup
#    And I click Done button on the open item window
#    And I click Back button on Check Options Screen
#    Then I should navigate to Order Management screen and see the added open item as "Open Item"
#    Then I verify the open item value from open item window with order screen
#    And I click Void button on order management screen
#    Then I should see All orders are voided
#    And I click Done button on the Popup
#    And I click log off button in order screen
#
#
#
#
#
#
#
#
#
