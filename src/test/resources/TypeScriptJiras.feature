Feature: Type Script Jiras

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
And I click Done button on the open item window
And Verify if tax "0.20" "0.05623" is calculated properly and calculate round-off
And Verify if the total amount is calculated correctly
And Verify if the balance due amount is calculated correctly
And Verify if the balance due amount is displayed correctly after payment
And I click log off button in order screen

@30
Scenario: TS-30 -> Application shows "Negative balance due" because of Tax Mismatch
And I have selected category arrow
And Select the category "Salads"
And Select the menu item "Bell pepper Salad"
And I selected the modifier "Bell pepper Green"
And I click Done button on the open item window
And I selected quantity as "5"
And I selected order button
And I click Discount as "7% Discount"
And I selected cancel button
And I selected menu options
And I selected void button in menu options
And I selected void quantity as "2"
And Select the Void item reason as "Server Error"
And Verify if exclusive tax menu "0.10000" exclusive tax modifier "0.10000" and percentage discount "0.0700" are calculated properly normal menu

@37
Scenario: TS-37 -> Application stays in transfer screen in transfer item
And Select the All option
And Select table layout option
And I selected new check button
And I selected the table1
And I selected seat number
And I get check number
And I get table number
And I have selected category arrow
And Select the category "FOOD ITEMS"
And Select the menu item "testing menu33"
And I selected the modifier "Bbq"
And I click Done button on the open item window
And I click Discount as "20% Discount"
And I selected cancel button
And Verify if tax "0.20" "0.05623" is calculated properly and calculate round-off
And User click finish button in split screen
And I Selected QSR in table layout screen
And I have closed the order type window
And User click QSR on Menu Item page in split screen
And User select DineIn mode in split screen
And I selected the table2
And I get table number2
And I get check number2
And I have selected category arrow
And Select the category "FOOD ITEMS"
And Select the menu item "testing menu33"
And I selected the modifier "Bbq"
And I click Done button on the open item window
And User click finish button in split screen
And I selected the transfer button
And I selected the transfer item tab
And I now entered the check number in the transfer from table
Then I selected the menu item in the table
And I now entered the check number in the transfer to table
And I click Done button on the open item window
And I select Yes option in the confirmation window
And I click Done button on the transfer success window
And I click Check Stats tab
And I should see active check in active check tab
And I click open check button on the check stats screen
#      And Verify if the total amount is calculated correctly
And Verify if the balance due amount is calculated correctly
And Verify if the balance due value is displayed correctly after payment split merge
And I click log off button in order screen

@40
Scenario: TS-40 -> After clicking on Print all in the split by check screen the start over and Add seats buttons are getting grayed out.
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
And I selected Print All Button
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

@43
Scenario: TS-43 -> Application shows "Balance due" while making payment for the Transferred item check
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
#    And Select the menu item with check tax
And Verify if the CheckTax is calculated correctly and calculate round-off
#      And Verify if the total value is calculated correctly
#      And Verify if the balance due value is calculated correctly
#      And Verify if the balance due value is displayed correctly after payment
#      And I click log off button in order screen
And User click finish button in split screen
And I Selected QSR in table layout screen
And I have closed the order type window
And User click QSR on Menu Item page in split screen
And User select DineIn mode in split screen
And I selected the table2
And I get table number2
And I get check number2
And I have selected category arrow
And Select the category "FOOD ITEMS"
And Select the menu item "testing menu13"
And Verify if the CheckTax is calculated correctly and calculate round-off
And User click finish button in split screen
And I selected the transfer button
And I selected the transfer item tab
And I now entered the check number in the transfer from table
Then I selected the menu item in the table
And I now entered the check number in the transfer to table
And I click Done button on the open item window
And I select Yes option in the confirmation window
And I click Done button on the transfer success window
And I click Check Stats tab
And I should see active check in active check tab
And I click open check button on the check stats screen
#      And Verify if the total amount is calculated correctly
And Verify if the balance due value is calculated correctly
And Verify if the balance due value is displayed correctly after payment split merge
And I click log off button in order screen

@47
Scenario: TS-47 -> If doing fire coursing after void any menu item in order screen send to kitchen popup is displaying
And I have selected category arrow
And Select the category "DRINKS"
And Select the menu item "blue lagoon"
And Verify if exclusive tax "0.10255" is calculated properly and calculate roundoff
And I have selected category arrow
And Select the category "chicken"
And Select the sub category "Rolls"
And Select the menu item "chicken roll"
And Verify if exclusive taxes "0.10255" and "0.06220" are calculated properly and calculate roundoff
And I selected order button
And I selected menu options2
And I selected void button in menu options
And Select the Void item reason as "Server Error"
And Verify if exclusive tax "0.10255" is calculated properly and calculate roundoff
And Selected Options button
And I selected fire coursing button
And I selected the coursing as "BEVERAGE"
And I selected cancel button2
And I selected cancel button
And Verify if exclusive tax "0.10255" is calculated properly and calculate roundoff
And Verify if the balance due value is calculated correctly
And Verify if the balance due amount is displayed correctly after payment
And I click log off button in order screen

@50
Scenario: TS-50 -> Application shows "ERROR TypeError: Cannot read properties of undefined (reading 'paymentType')" in console while doing payment for the seat through split screen
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
And I get table number
And User click finish button in split screen
And I selected the split button in table layout
And I selected the split option as Split Seat in table layout
And I selected the check to be splitted
And I selected Add button
And I selected the menu1
And I transferred the menu to new check
And I check if exc tax "0.06220" is calculated properly for first check
And I check if exc tax "0.10255" is calculated properly for second check
And I select seat 2
And I get the total amount for seat 2
And I selected pay check option
And I verify if the balance due is calculated correctly for the check seat 2
And Verify if the balance due amount is displayed correctly after payment seat 1
And I click Done button on the open item window
And I click Exit button on the open item window
And I select seat 1
And I get the total amount for seat 1
And I selected pay check option
And I verify if the balance due is calculated correctly for the check seat 1
And Verify if the balance due value is displayed correctly after payment split merge
And I click log off button in order screen

@54
Scenario: TS-54 -> Application shows balance due while paying the check with cash payment after doing split check
And I get check number
And I have selected category arrow
And Select the category "Sparklers"
And Select the sub category "Basic"
And Select the menu item "Minty orange"
And Verify If Inclusive Tax "0.13450" and tax on item service charge "0.12000" Is Calculated Properly when item service charge "0.13467"
And Verify If item service charge "0.13467" Is Calculated Properly
And Select the menu item "Minty orange"
And Verify If Inclusive Tax "0.13450" and tax on item service charge "0.12000" Is Calculated Properly when item service charge "0.13467" qty 2
And I selected order button
And User click QSR on Menu Item page in split screen
And User select DineIn mode in split screen
And I selected the table
And I selected the split button
And I selected the split option as Split Check
And I selected Add button
And I selected the menu1
And I transferred the menu to new check
And I select seat 1
And I get the total amount for seat 1
Then User click save and close in split screen
And User click finish button in split screen
And I selected pay check option2
And I selected the check to be splitted
And I verify if the balance due is calculated correctly for the check seat 1
And Verify if the balance due value is displayed correctly after payment split merge
And I click log off button in order screen

@63
Scenario: TS-63 -> Application shows Balance due while making payment with cash for the delivery check
And I get check number
And I have selected category arrow
And Select the category "Sparklers"
And Select the sub category "Basic"
And Select the menu item "Minty orange"
And Verify If Inclusive Tax "0.13450" and tax on item service charge "0.12000" Is Calculated Properly when item service charge "0.13467"
And Verify If item service charge "0.13467" Is Calculated Properly
And I get the total amount
And I selected order button
And User click QSR on Menu Item page in split screen
And User select Delivery mode in split screen
And I select By Name tab in customer screen
And I enter the customer name "shaun" in search field
And I selected the first customer displayed
Then User click save button in customer screen
Then User click finish button in split screen
And I selected name option
And I selected the check option
Then I should see the check in phone order tab
And I selected the driver
And I selected the driver icon
And I select the depart button
And I select the out button
Then I should see the check in phone order tab
And I selected pay check option2
And I verify if the balance due is calculated correctly for the check seat 1
And I selected cash payment
And I Select submit button
And I click Done button on the open item window
And I click Exit button on the open item window
Then User click finish button in split screen
And I select the out button
Then I should see the check in phone order tab
And I selected arrival option
And I Selected QSR in table layout screen
And I have closed the order type window
And I click log off button in order screen

@66
Scenario: TS-66 -> Application shows Balance due while making the payment after Transferring the Table
And I get check number
And I have selected category arrow
And Select the category "Sparklers"
And Select the sub category "Basic"
And Select the menu item "Minty orange"
And Verify If Inclusive Tax "0.13450" and tax on item service charge "0.12000" Is Calculated Properly when item service charge "0.13467"
And Verify If item service charge "0.13467" Is Calculated Properly
And Select the menu item "Minty orange"
And Verify If Inclusive Tax "0.13450" and tax on item service charge "0.12000" Is Calculated Properly when item service charge "0.13467" qty 2
And I selected order button
And User click QSR on Menu Item page in split screen
And User select DineIn mode in split screen
And I selected the table
And I get table number
Then User click finish button in split screen
And I Selected QSR in table layout screen
And I have closed the order type window
And User click QSR on Menu Item page in split screen
And User select DineIn mode in split screen
And I selected the table2
And I get table number2
And I get check number2
And I have selected category arrow
And Select the category "Sparklers"
And Select the sub category "Basic"
And Select the menu item "Minty orange"
And User click finish button in split screen
And I selected the transfer button
And I selected the transfer to table tab
And I now entered the table number in the transfer from table
Then I selected the check number in the table
And I now entered the table number in the transfer to table
And I click Done button on the open item window
And I click Done button on the transfer success window
And I click Check Stats tab
And I should see active check in active check tab
And I click open check button on the check stats screen
#      And Verify if the total amount is calculated correctly
And Verify if the balance due amount is calculated correctly
And Verify if the balance due value is displayed correctly after payment split merge
And I click log off button in order screen

@78
Scenario: TS-78 -> While open the active checks of bartab & phone order checks & choose finish it's not navigate to Check status Instead of navigating to it's service type page
And I get check number2
And I have selected category arrow
And Select the category "chicken"
And Select the sub category "Rolls"
And Select the menu item "chicken roll"
And Verify if exclusive tax "0.06220" is calculated properly and calculate roundoff
And I selected order button
And User click QSR on Menu Item page in split screen
And User select Bar Tab in order types
And User click finish button in split screen
Then I should see active check in active check tab
And I click open check button on the check stats screen
And Verify if exclusive tax "0.06220" is calculated properly and calculate roundoff
And Verify if the balance due value is calculated correctly
And Verify if the balance due value is displayed correctly after payment split merge
And I click log off button in order screen

Scenario: TS-88 -> Applying the open item discount for two items in same check one of the discount not displaying in Discount report
And I have selected category arrow
And Select the category "FOOD ITEMS"
And Select the menu item "testing menu15"
And I selected menu options
And I selected Open Discount
And I tapped the amount field
And I entered the discount amount as "0" "5" "5" "0"
And I selected the Continue button
And I tapped reason and entered the reason
     #And I click "Hide keyboard" button in the keyboard "Click Back"
And I selected the apply button
And I have selected category arrow
And Select the category "FOOD ITEMS"
And Select the menu item "testing menu15"
And I selected menu options2
And I selected Open Discount
And I tapped the amount field
And I entered the discount amount as "0" "5" "0" "0"
And I selected the Continue button
And I tapped reason and entered the reason
     #And I click "Hide keyboard" button in the keyboard "Click Back"
And I selected the apply button
And Verify If Tax Is Calculated Properly And Calculate RoundOff for Open Discount "14.55" Exclusive "0.10255" Amount BT
And Verify if the total amount is calculated correctly for exclusive open discount
And Verify if the balance due amount is displayed correctly
And Verify if the balance due amount is displayed correctly after the payment
And I click log off button in order screen

@129
Scenario: TS-129 -> When merge the check dine in and bar tab its not allowing to merge
And I get check number
And I have selected category arrow
And Select the category "chicken"
And Select the sub category "Rolls"
And Select the menu item "chicken roll"
And Verify if exclusive tax "0.06220" is calculated properly and calculate roundoff
And I selected order button
And User click QSR on Menu Item page in split screen
And User select DineIn mode in split screen
And I selected the table1
And I get table number
And User click finish button in split screen
And User select Bar Tab
And I selected new check button in bar tab
And I have selected category arrow
And Select the category "chicken"
And Select the sub category "Rolls"
And Select the menu item "chicken roll"
And Verify if exclusive tax "0.06220" is calculated properly and calculate roundoff
And I selected order button
And User click finish button in split screen
And Select table layout option
And I now merge the check1
And Select bar tab option
#       And I now merge the check2

@41
Scenario:  TS-41 -> Unable to change the QSR service type any delivery service type
And I get check number
And I have selected category arrow
And Select the category "Sparklers"
And Select the sub category "Basic"
And Select the menu item "Minty orange"
And Verify If Inclusive Tax "0.13450" and tax on item service charge "0.12000" Is Calculated Properly when item service charge "0.13467"
And Verify If item service charge "0.13467" Is Calculated Properly
And I get the total amount
And I selected order button
And I select add customer button
And I select By Name tab in customer screen
And I enter the customer name "shaun" in search field
And I selected the first customer displayed
And User click QSR on Menu Item page in split screen
And User select Delivery mode in split screen
Then User click save button in customer screen
And I click log off button in order screen

@38
Scenario: TS-38 -> Allowing to do Service Exempt For the paid check, in payment screen Change Due and No Due is showing in Negative value
And I get check number
And I have selected category arrow
And Select the category "Shakes"
And Select the sub category "Can"
And Select the menu item "Cranberry"
And Verify If Tax "0.1200" and tax on item service charge "0.15980" Is Calculated Properly when item service charge "0.07654"
And Verify If item service charge "0.07654" Is Calculated Properly
And Verify if the balance due value is calculated correctly when item service charge is present
And I selected cash payment
And I click Exit button on the open item window
And Selected Options button
And I select service exempt button
And I click Done button on the open item window
And Verify if the ExcTax "0.12000" is calculated correctly
And I Selected the payment button
And Verify if the balance due value is displayed correctly after payment already made
And I click log off button in order screen

@122
Scenario: TS-122 -> Paid Sale displaying as Unpaid check in Phone order sales
And I get check number
And I have selected category arrow
And Select the category "FOOD ITEMS"
And Select the menu item "testing menu10"
     #And Apply the item discount "20% Discount"
And I click Discount as "20% Discount"
And I selected cancel button
And Verify if tax "0.20" "0.0622" is calculated properly and calculate round-off
And User click QSR on Menu Item page in split screen
And User select Phone Delivery mode in split screen
And I select By Name tab in customer screen
And I enter the customer name "shaun" in search field
And I selected the first customer displayed
Then User click save button in customer screen
Then User click finish button in split screen
And I selected name option
And I selected the check option
Then I should see the check in phone order tab
And I selected the edit button in phone order
And I Selected the payment button
And I selected cash payment
And I click Exit button on the open item window
Then User click finish button in split screen
And I selected name option
And I selected the check option
Then I should see the check in phone order tab
And I verified if pay status is paid
And I selected the driver
And I selected the driver icon
And I select the depart button
And I select the out button
Then I should see the check in phone order tab
And I selected pay check option2
And I Select submit button
And I click Done button on the open item window
And I click Exit button on the open item window
Then User click finish button in split screen
And I select the out button
Then I should see the check in phone order tab
And I selected arrival option
And I Selected QSR in table layout screen
And I have closed the order type window
And I click log off button in order screen

@21
Scenario: TS-21 -> In open item check tax is getting mismatched when repeat the order
And Selected Options button
And Selected Open item option
And Selected Coursing name field
And I swipe to "RETAIL" Coursing Name2
And I entered course name
And I selected the Price text field
And I entered the price for the open item
And I selected the Continue button
And I selected the Tax
And I selected the exclusive tax
And I click Done button on the open item window
And Verify if exclusive tax menu "0.10255" check tax "0.12444" are calculated properly
#    And I selected the back button
And I selected menu options
And I selected repeat order
And Verify if exclusive tax menu "0.10255" check tax "0.12444" are calculated properly multiple menu
And Verify if the balance due value is calculated correctly
And Verify if the balance due value is displayed correctly after payment
And I click log off button in order screen

@59
Scenario: TS-59 -> Allowing to add/Edit Store credit to the customer profile from order screen in Web POS without clicking on Save
And I get check number
And I have selected category arrow
And Select the category "Sparklers"
And Select the sub category "Basic"
And Select the menu item "Minty orange"
And Verify If Inclusive Tax "0.13450" and tax on item service charge "0.12000" Is Calculated Properly when item service charge "0.13467"
And Verify If item service charge "0.13467" Is Calculated Properly
And I get the total amount
And I selected order button
And I select add customer button
And I select By Name tab in customer screen
And I enter the customer name "shaun" in search field
And I selected the first customer displayed
And I selected the customer in the qsr screen
And I get the store credit balance amount
And I selected add credit option
And I entered the discount amount as "0" "5" "0" "0"
And I selected add credit button
And I closed the customer window
And I selected the customer in the qsr screen
And I verify if the balance is not updated without saving
And I closed the customer window
And Verify If Inclusive Tax "0.13450" and tax on item service charge "0.12000" Is Calculated Properly when item service charge "0.13467"
And Verify If item service charge "0.13467" Is Calculated Properly
And Verify if the balance due value is calculated correctly when item service charge is present
And Verify if the balance due value is displayed correctly after payment
And I click log off button in order screen

@130
Scenario: TS-130 - Deleting the Special combo menu item Warning message display
And I get check number
And I have selected category arrow
And Select the category "chicken"
And Select the menu item "Pizza Combo"
And Select the menu item "testing menu25"
And I selected cancel button
And I removed the menu item
And I click log off button in order screen

Scenario: TS-160 - Unbale to change to delivery service type with already attached Customer order
And I get check number
And I have selected category arrow
And Select the category "Sparklers"
And Select the sub category "Basic"
And Select the menu item "Minty orange"
And Verify If Inclusive Tax "0.13450" and tax on item service charge "0.12000" Is Calculated Properly when item service charge "0.13467"
And Verify If item service charge "0.13467" Is Calculated Properly
And I get the total amount
And I selected order button
And I select add customer button
And I select By Name tab in customer screen
And I enter the customer name "shaun" in search field
And I selected the first customer displayed
And User click QSR on Menu Item page in split screen
And User select Delivery mode in split screen
Then User click save button in customer screen
And I click log off button in order screen

@158
Scenario: TS-158 - Open item discount not removed while user deselect the applied open item discount
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
And I selected menu options
And I selected Open Discount
And Verify if the ExcTax "0.10255" is calculated correctly
And I Selected payment button
And I click log off button in order screen

@151
Scenario: TS-151 - Table layout>>While enter more than 100 numbers in seat count popup, it's not showing any warning message
And Select the All option
And Select table layout option
And I selected new check button
And I selected the table1
And I selected seat number as 100
And I click Done button on the open item window
And I selected seat number
And I get check number
And I get table number
And I have selected category arrow
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
And I click log off button in order screen

@144
Scenario: TS-144 - Text needs to be updated for the "Open item" as "Select a Coursing"
And Selected Options button
And Selected Open item option
And I entered course name
And I selected the Price text field
And I entered the price
And I selected the Continue button
And I selected the Tax
And I selected the Exclusive Tax
And I click Done button on the open item window
And Verify if the error message is displayed correctly when coursing is not entered
And I click Done button on the open item window second time
And I selected cancel button
And I click log off button in order screen

@149
Scenario: TS-149 - Modify option not displaying for the Other service type>> When Bartab has Any time preauth setting
And I get check number
And I have selected category arrow
And Select the category "chicken"
And Select the sub category "Rolls"
And Select the menu item "chicken roll"
And Verify if exclusive tax "0.06220" is calculated properly and calculate roundoff
And I selected order button
And User click QSR on Menu Item page in split screen
And User select Bar Tab in order types
And Select the exit button
And Select the anytime pre auth button
And Select the exit button
And User click QSR on Menu Item page in split screen
And User select QSR in order types
And Select the modify button on order screen
And Verify if exclusive tax "0.06220" is calculated properly and calculate roundoff
And Verify if the total value is calculated correctly
And Verify if the balance due value is calculated correctly
And Verify if the balance due value is displayed correctly after payment
And I click log off button in order screen

@133
Scenario: TS-133 - HA card number not displaying in card screen page
And I have selected category arrow
And Select the category "chicken"
And Select the sub category "Rolls"
And Select the menu item "chicken roll"
And Verify if exclusive tax "0.06220" is calculated properly and calculate roundoff
And I selected order button
And I select add customer button
And I select By Name tab in customer screen
And I enter the customer name "shaun" in search field
And I selected the first customer displayed
And I Selected the payment button
And I selected "House Account" payment
And I verify if the house account is displayed as "77777" in card screen
And I select process button
And I have closed the order type window
And I click log off button in order screen

@157
Scenario: TS-157 - POS allow to complete the payment with Multi cash - even if it's disabled in Admin level
And I have selected category arrow
And Select the category "chicken"
And Select the sub category "Rolls"
And Select the menu item "chicken roll"
And Verify if exclusive tax "0.06220" is calculated properly and calculate roundoff
And I selected order button
And I Selected the payment button
And I entered the partial amount as "2" "0" "0" "0"
And I selected "Cash" payment
And I selected "Pay" payment
And I Selected submit button
And I click log off button in order screen

@159
Scenario: TS-159 - Cancel button not displaying in till management screen
And I selected the POS operations button
And Selected Till Management option
  And I selected cancel button
  And I selected the operations window
