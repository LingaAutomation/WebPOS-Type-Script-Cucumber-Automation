
Feature: Ask Seat Number Feature



  Scenario: Verify the "Ask Seat count in Table Layout" new toggle in Pos settings under DINE IN is available
    Given I'm logged in
    And I closed the order type window
    And I click the Settings button
    And I click the POS settings from Toggle
    And I verify that ask seat count toggle is available
    And I click power button in operation

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


  Scenario: Verify the Split check
    Given I'm logged in
    And I closed the order type window
    And I click All
    And I click Table Layout tab
    And I select Menu For Dine order type as "North Indian dish" for split Check
    And I click Finish button
    And I click Check Stats tab
    Then I should see active check
##    And I hide the keyboard
    And I click Table Layout tab
#      And I select Menu For Dine order type as "Salad" for split Check
#      And I click finish button
#      And I click Check Stats tab
#      Then I should see active check
##      And I hide the keyboard
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
#    Then I should see Receipt Printer popup
#    And I click Done button on the Popup
    When I verify the check is splitted and check number is increased

      ####  PRINT ALL  ####
    And I click print All Button in the split check screen
#    Then I should see Receipt Printer popup
#    And I click Done button on the Popup

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
##    And I hide the keyboard
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
#    Then I should see Receipt Printer popup
#    And I click Done button on the Popup
    When I verify the check is splitted and check number is increased
    And I click print All Button in the split check screen
#    Then I should see Receipt Printer popup
#    And I click Done button on the Popup
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
    And I click power button in the All Orders screen



  Scenario: Verify the Split seat
    Given I'm logged in
    And I closed the order type window
    And I click All
    And I click Table Layout tab
    And I select Menu For Dine order type as "North Indian dish" for split Check
    And I click Finish button
    And I click Check Stats tab
    Then I should see active check
#    And I hide the keyboard
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
    And I click new check added on the split check screen page
    When I verify the menu is moved to the added check seat
    And I click new check added on the split check screen page

       ####  PRINT   ####
    And I click print button in the split seat screen
#  Then I should see please save all the changes to print popup
#  And I click yes to open Close Till Screen
#    Then I should see Receipt Printer popup
#    And I click Done button on the Popup
#    When I verify the check is splitted and check number is increased

      ####  PRINT ALL  ####
    And I click print All button in the split seat screen
#    Then I should see Receipt Printer popup
#    And I click Done button on the Popup

#####  SEPERATE ITEM #######

    And I click the menu on the split seat screen
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
#    And I get seat 1 prize details

#    Then I should verify menu is splitted evenly
#  And I verify seat 1 prize and seat 2 prize is same

  #########  GROUP SEATS  ###########

    And I get seat 1 prize details
    And I get seat 2 prize details
    And I get the menu item on the split seat_One
    And I get the menu item on the split seat_Two

    And I click new check added on the split check screen page
    And I click seat one on the split screen
    And I click the Group Seats button in the Split Seat
    And I verify menu item are clubbed in seat 2
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

    And I click new check added on the split check screen page
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
#    And I hide the keyboard
    And I click Table Layout tab
    And I click power button


  Scenario: Verify the transfer
    Given I'm logged in
    And I closed the order type window
    And I click All
    And I click Table Layout tab
    And I select the random table from the table layout
    And I select Menu of Basic validation for QSR as "Menu"
    And I click Finish Order button
    And I click Table Layout tab
    And User select the Transfer button
    And User verify Transfer to Server, Transfer to Table and Transfer Item are displayed
    And User select the Transfer Item Option
    When I select check for transferred
#    And I hide the keyboard
    And Select the required menu item from the Menu Item Table
    When I select check for transferred1
    And Click the Done button
    And Verify the Successful message of Transfer Item One
    And I click Done button on the Popup
    When I click transferred table after done transfer process
    Then Verify the Transferred menu item is available or not in the receiving table
    And Click the finish button
    And I click power button in the All Orders screen



  Scenario: Verify the merge
    Given I'm logged in
    And I closed the order type window
    And I click All
    And I click Table Layout tab
    And I select Menu for DineIn as "North Indian dish" for split seat order screen for merge
#    Then I should see discount as "IB-AfterTax-Amount" applied on order screen
    And I get the seat number from the check
    And I get the list of the menu from the order screen
    And I get value the menu values from order screen
    And I click Finish button
    And I click Table Layout tab
    And I select Menu for DineIn as "North Indian dish" for split seat order screen1
    And I get the seat number from the check1
    And I get the list of the menu from the order screen1
    And I get value the menu values from order screen1
    And I click Finish button
    And I click Table Layout tab
    And I click Merge button
    When I click the check from the table layout for merged
#    Then I should see on merging the particular checks popup
#    And I click yes to open Close Till Screen
    When I click the check from the table layout for merged1
#    Then I should see on merging the particular checks popup
#    And I click yes to open Close Till Screen
    And I click Done button on the pop-up to complete merging
#    Then I should see merge checks confirmation popup
#    And I click confirm button on the merge check confirmation popup
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


  Scenario: Verify the Ask seat count toggle and customer name enabled status
    Given I'm logged in
    And I closed the order type window
    And I click All
    And I click Table Layout tab
    And I select random table on the table layout
    When I should verify the ask seat number on the table layout
    And I select the number of seats as "2"
    And I tap Continue to finish selecting the number of seats
    Then I Should get back to the Order Screen
    When I verify the seat count on the order screen as "2"
    And I click All
    And I click power button in the All Orders screen


  Scenario: Disable the "Ask Seat count in Table Layout" new toggle in Pos settings under DINE IN
    Given I'm logged in
    And I closed the order type window
    And I click the Settings button
    And I click the POS settings from Toggle
    And I verify that ask seat count toggle is disabled
    And I click power button in operation


  Scenario: Verify the order screen and click the Dine in as service types
    Given I'm logged in
    And I closed the order type window
    And I tap QSR button to open the order types combo
#          And I select service type as qsr
    And I select order type as "DINE IN"
    And I select table as "T4"
    And I get check number
    And I select category as "FOOD"
    And I select menu item as "Pancake"
    And I click Finish Order button
    And I click Table Layout tab
    And I click power button in the All Orders screen

  @Askseat
  Scenario: Disable Ask Customer - Verify the order screen ALL button
    Given I'm logged in
    And I closed the order type window
    And I click All
    And I click Table Layout tab
    And I select random table on the table layout
#    And I select the number of seats as "1"
#    And I tap Continue to finish selecting the number of seats
    Then I Should get back to the Order Screen
    When I verify the seat count on the order screen as "1"
    And I click All
    And I click Table Layout tab
    And I click power button in the All Orders screen


    #need to get method details from ragav bro
  Scenario: Verify the multi seats After disabling ask Seat Count in Table Layout
    Given I'm logged in
    And I closed the order type window
    And I click All
    And I click Table Layout tab
    And I select random table on the table layout
    And I select the number of seats as "1"
    And I tap Continue to finish selecting the number of seats
    Then I Should get back to the Order Screen
    When I verify the seat count on the order screen as "1"
    And I get check number
    And I select category as "FOOD"
    And I select menu item as "Chicken Schnitzel"
    And I add a new seat
    Then I should see created new seat
    And I select seat two
    And I select category as "FOOD"
    And I select menu1 item as "Onion Rings"
    And I add a new seat
    And I select seat three
    And I select category as "FOOD"
    And I select menu two item as "Chicken Schnitzel"
    And I select seat one
    And I verify menu item on the order screen
    And I select seat two
    And I verify menu1 item on the order screen
    And I select seat three
    And I verify menu two item on the order screen
    And I click Finish Order button
    And I click Table Layout tab
    And I click power button in the All Orders screen


  Scenario: Disable Ask Customer - Verify the multi floor's
    Given I'm logged in
    And I closed the order type window
    And I click All
    And I click Table Layout tab
    And I click right symbol
    Then I should see next floor
    And I select random table on the table layout
    And I select the number of seats as "1"
    And I tap Continue to finish selecting the number of seats
    Then I Should get back to the Order Screen
    When I verify the seat count on the order screen as "1"
    And I get check number
    And I select category as "FOOD"
    And I select menu item as "Chicken Schnitzel"
    And I add a new seat
    Then I should see created new seat
    And I select seat two
    And I select category as "FOOD"
    And I select menu item as "Onion Rings"
    And I click Finish Order button
    And I click Table Layout tab
    And I click power button in the All Orders screen


  Scenario: Disable Ask Customer - Verify the closed checks
    Given I'm logged in
    And I closed the order type window
    And I click All
    And I click Table Layout tab
    And I select random table on the table layout
    And I select the number of seats as "1"
    And I tap Continue to finish selecting the number of seats
    Then I Should get back to the Order Screen
    When I verify the seat count on the order screen as "1"
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
    When I verify the seat count on the order screen as "1"
    And I click Payment button in the Order Management Screen
    And I click Submit button on the Payment Window
    And I click Table Layout tab
    And I click power button


  Scenario: Disable Ask Customer - Verify the active checks
    Given I'm logged in
    And I closed the order type window
    And I click All
    And I click Table Layout tab
    And I select random table on the table layout
    And I select the number of seats as "1"
    And I tap Continue to finish selecting the number of seats
    Then I Should get back to the Order Screen
    When I verify the seat count on the order screen as "1"
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
    When I verify the seat count on the order screen as "1"
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


  Scenario: Verify the ask Customer name toggle enabled status and ask seat count enabled status
    Given I'm logged in
    And I closed the order type window
    And I click the Settings button
    And I click the POS settings from Toggle
    And I verify that ask seat count toggle is enabled
    And I verify that ask customer for Dine In is enabled
    And I click the Toggle Icon button
    And I click POS Icon from Toggle
    And I closed the order type window
    And I click All
    And I click Table Layout tab
    And I select random table on the table layout
    When I should verify the ask seat number on the table layout
    And I select the number of seats as "1"
    And I tap Continue to finish selecting the number of seats
    And User click cancel button for customer name popup
    And I click Add Customer Button
    Then I should see the add customer screen in the window
    And I Click on the Byname Option
    And Enter some name and click on Add Customer button
#    And I click the customer name on the order screen
    Then I should see the customer profile window
    And I select search
    And I enter an existing customer's name "Auto ragav"
    And I select the customer
    When I click the Save button
    Then I Should get back to the Order Screen
    Then I should see customer as "Auto r" added on order screen
    And I get check number
    And I select category as "FOOD"
    And I select menu item as "Chicken Schnitzel"
    And I click Payment button in the Order Management Screen
    And I click cash button from the payment method popup
    And I click Submit button on the Payment Window
    And I click Table Layout tab
    And I click power button in the All Orders screen


  Scenario: Verify the QSR type
    Given I'm logged in
    And I closed the order type window
    And I click service type button in order screen
    And I select service type as qsr
#    And I should see service type as "QSR"
    And I get check number
    And I select category as "FOOD"
    And I select menu item as "Chicken Schnitzel"
    And I click Payment button in the Order Management Screen
    And I click cash button from the payment method popup
    And I click Submit button on the Payment Window
    And I closed the order type window
    And I click All
    And I click Check Stats tab
    And I click Closed tab on the Check stats
    And I should see closed check in closed check tab
    And I click power button in the All Orders screen

  @Askseat
  Scenario: Verify the To Go
    Given I'm logged in
    And I closed the order type window
    And I click service type button in order screen
    And I select order type as "TOGO"
    And I click Add Customer Button
    Then I should see the add customer screen in the window
    And I Click on the Byname Option
    And Enter some name and click on Add Customer button
    Then I should see the customer profile window
    And I select search
    And I enter an existing customer's name "Auto ragav"
    And I select the customer
    When I click the Save button
    Then I Should get back to the Order Screen
    And I should see service type as "TOGO"
    And I get check number
    And I select category as "FOOD"
    And I select menu item as "Chicken Schnitzel"
    And I click Payment button in the Order Management Screen
    And I click cash button from the payment method popup
    And I click Submit button on the Payment Window
    And I click phone order tab
    And I click Check Stats tab
    And I click Closed tab on the Check stats
    And I should see closed check in closed check tab
    And I click power button in the All Orders screen


  Scenario: Verify the For here
    Given I'm logged in
    And I closed the order type window
    And I click service type button in order screen
    And I select order type as "FORHERE"
    And I click Add Customer Button
    Then I should see the add customer screen in the window
    And I Click on the Byname Option
    And Enter some name and click on Add Customer button
    Then I should see the customer profile window
    And I select search
    And I enter an existing customer's name "Auto ragav"
    And I select the customer
    When I click the Save button
    Then I Should get back to the Order Screen
    And I should see service type as "FORHERE"
    And I get check number
    And I select category as "FOOD"
    And I select menu item as "Chicken Schnitzel"
    And I click Payment button in the Order Management Screen
    And I click cash button from the payment method popup
    And I click Submit button on the Payment Window
    And I click phone order tab
    And I click Check Stats tab
    And I click Closed tab on the Check stats
    And I should see closed check in closed check tab
    And I click power button in the All Orders screen


#  Scenario: Verify the bar tab
#    Given I'm logged in
#    And I closed the order type window
#    And I click service type button in order screen
#    And I click the "Bar Tab" service type in the order screen "Select as Bar Tab"
#    And I click the Exit to close the preauth window
#    When I verify the customer popup is displayed if it is, close it
#    And I get check number
#    And I select category as "FOOD"
#    And I select menu item as "Chicken Schnitzel"
#    And I click Payment button in the Order Management Screen
#    And I click credit card payment on payment window
#    Then I should see total screen
#    And I click the Continue button on the Total screen
#    Then I should see your order card screen
#    And I click manual button on the your order screen
#    And I pass the card number as "3530111333300000"
#    And I pass card name as "JCB"
#    And I pass expire date as "1224"
#    And I click Process button on card screen
#    And I click Ok button in receipt printer popup
#    Then I click BarTab Layout
#    And I click Check Stats tab
#    And I click Closed tab on the Check stats
#    And I should see closed check in closed check tab
#    And I click power button


  Scenario: Verify the Delivery
    Given I'm logged in
    And I closed the order type window
    And I click service type button in order screen
    And I select the DELIVERY order type
#    And I click Add Customer Button
    Then I should see the add customer screen in the window
    And I Click on the Byname Option
    And Enter some name and click on Add Customer button
    Then I should see the customer profile window
    And I select search
    And I enter an existing customer's name "Auto test"
    And I select the customer
    When I click the Save button
    Then I Should get back to the Order Screen
    And I should see service type as "DELIVERY"
    And I get check number
    And I select category as "FOOD"
    And I select menu item as "Chicken Schnitzel"
    And I click Payment button in the Order Management Screen
    And I click cash button from the payment method popup
    And I click Submit button on the Payment Window
#    Then I should see the Linga payment popup
    And I click Done button on the Popup
    And I click Exit to return to Order Management Screen
    And I click Finish Order button
    And I click phone order tab
    And I click the Closed check in new tab window
    And I click active driver as "Auto D"
    Then I should see driver is offline popup
    And I click Yes button on driver is offline popup
    And I click active driver as "Auto D" in the Phone Order Screen
    And I click departure button
    And I click out tab in phone order screen
    And I click the Closed check in out tab
    And I click Arrival button in phone order screen
    And I click Complete tab
    And I click out tab in phone order screen
    And I click Complete tab
    Then I should see closed check in complete tab
    And I click Check Stats tab
    And I click Closed tab on the Check stats
    And I should see closed check in closed check tab
    And I click power button in the All Orders screen


  Scenario: Verify the phone togo
    Given I'm logged in
    And I closed the order type window
    And I click service type button in order screen
    And I select order type as "PHONE TOGO"
    And I click Add Customer Button
    Then I should see the add customer screen in the window
    And I Click on the Byname Option
    And Enter some name and click on Add Customer button
    Then I should see the customer profile window
    And I select search
    And I enter an existing customer's name "Auto test"
    And I select the customer
    When I click the Save button
    Then I Should get back to the Order Screen
    And I should see service type as "TOGO"
    And I get check number
    And I select category as "FOOD"
    And I select menu item as "Chicken Schnitzel"
    And I click Payment button in the Order Management Screen
    And I click cash button from the payment method popup
    And I click Submit button on the Payment Window
#      Then I should see the Linga payment popup
#      And I click Done button on the Popup
#      And I click Exit to return to Order Management Screen
#      And I click Finish Order button
    And I click phone order tab
    And I click Check Stats tab
    And I click Closed tab on the Check stats
    And I should see closed check in closed check tab
    And I click power button in the All Orders screen


  Scenario: Verify the phone delivery
    Given I'm logged in
    And I closed the order type window
    And I click service type button in order screen
    And I select order type as "PHONE DELIVERY"
#    And I click Add Customer Button
    Then I should see the add customer screen in the window
    And I Click on the Byname Option
    And Enter some name and click on Add Customer button
    Then I should see the customer profile window
    And I select search
    And I enter an existing customer's name "Auto test"
    And I select the customer
    When I click the Save button
    Then I Should get back to the Order Screen
    And I should see service type as "DELIVERY"
    And I get check number
    And I select category as "FOOD"
    And I select menu item as "Chicken Schnitzel"
    And I click Payment button in the Order Management Screen
    And I click cash button from the payment method popup
    And I click Submit button on the Payment Window
#    Then I should see the Linga payment popup
    And I click Done button on the Popup
    And I click Exit to return to Order Management Screen
    And I click Finish Order button
    And I click phone order tab
    And I click the Closed check in new tab window
    And I click active driver as "Auto D"
    Then I should see driver is offline popup
    And I click Yes button on driver is offline popup
    And I click active driver as "Auto D" in the Phone Order Screen
    And I click departure button
    And I click out tab in phone order screen
    And I click the Closed check in out tab
    And I click Arrival button in phone order screen
#    And I wait 2 Mins
    And I click Complete tab
    And I click out tab in phone order screen
    And I click Complete tab
    Then I should see closed check in complete tab
    And I click Check Stats tab
    And I click Closed tab on the Check stats
    And I should see closed check in closed check tab
    And I click power button in the All Orders screen