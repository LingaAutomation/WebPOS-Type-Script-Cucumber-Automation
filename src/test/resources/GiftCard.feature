
Feature: Gift Card

  Background:
    Given I'm logged in
    Then I closed the order type window




@GiftCard
  Scenario: Verify gift card tab should open along with Give X
    Given User select QSR mode on menu item page
    When User select DineIn mode
    And I select the "T15" in the Table layout screen"click t5 table"
    And User click Option Tab
    When User click Gift Card tab
    Then User verify Gift Card screen
    And User verify GivX tab is disable
    When User enter gift card number for gift card option
    And User open Activate Account toggle if disable
    And I click Done button on the Popup
#    And I click Done button on the Popup
    Then user verify the enter the charge amount

    Then User enter gift card charge amount
    And User click gift card cancel button
#    And User click option back button
    And User click food category
    #Application should takes to the Order screen when click Gift Card Cancel button -
    And User verify be directed menu item page
    #Recurring Balance should be added from the Begining Balance with the Entered amount  --execute xxxxxxxx,
    # Application should takes to the Order screen, do payment and close check
    And User click Option Tab
    When User click Gift Card tab
    When User enter gift card number for gift card option
    Then User enter gift card charge amount
    And I click Done button on the Popup
    #Application should takes to the Order screen do payment and Close check
    And User click food category
    And User take an order
    When User click payment button
    Then USer click cash button
    And User click submit button
    When I click QSR tab
    And User click cancel button
    And I click log off button in order screen



  @Regression
  Scenario: In Check stats, check should be added in Void Checks and amount should be show as 0.00/Gift Card-Void Recharge
    Given User select QSR mode on menu item page
    Given User select DineIn mode
    And I select the "T12" in the Table layout screen"click t5 table"
    And User take an order
    Then User click Option Tab
    When User click Gift Card tab
    Then User verify Gift Card screen
   # Then User verify Gift Card screen
    When User enter gift card number for gift card option
    Then User enter gift card charge amount
    And I click Done button on the Popup
    When User click void button
    Then User select void reason
    And User click add void button
##    And User click receipt printer button for void check
    And I should get back to the Table Layout tab
    And I select table as "T16"
    And I select the number of seats as "1"
    And I tap Continue to finish selecting the number of seats
    And User take an order
    And I get check number
    When User click payment button
    When User click gift card payment method
    And I click the Continue button on the Total screen
    Then User click manuel button
    When User enter gift card number
    Then User click process
#    And User click receipt printer button
    When User click Check Status tab
    Then User click Closed Checks tabs
    Then I click the Closed check on check stats
    When User click re-open check button
    #Gift Card on Payment Screen- Void check  --execute
    When User click payment button
    When User select paid order
    Then User click delete button

#    And User click receipt printer button
    Then USer click cash button
    Then User click submit button
    When I click QSR tab
    And User click cancel button
    And I click log off button in order screen


  @Regression
  Scenario: Gift Card-Void Recharge after Redeemed
    When User click QSR on Menu Item page
    Then User select DineIn order type
    And I select the "T20" in the Table layout screen"click t5 table"
    When User click Option Tab
    Then User click Gift Card tab
    And User verify Gift Card screen
    When User enter gift card number for gift card option
    Then User enter gift card charge amount
    And I click Done button on the Popup
    When User click All button
    Then User click Table Layout menu
    And User click New Check option
    And I select the "T25" in the Table layout screen"click t5 table"
    And I select the number of seats as "1"
    And I tap Continue to finish selecting the number of seats
    And I get check number
    When User take an order
    Then User click payment button
    When User click gift card payment method
    Then I click the Continue button on the Total screen
    And User click manuel button
    When User enter gift card number
    #Verify Gift Card- Redeem-Partial Payment
    Then User click clear button on gift card payment option
    Then i should verify the deleted card number
    When User enter gift card number
    Then User click process
#    And User click receipt printer button
    When User click Table Layout menu
    Then I click the check from the table layout screen
    When User click void button
    Then User select void reason
    And User click add void button
    And I click Done button on the Popup
    When I click QSR tab
    And User click cancel button
    And I click log off button in order screen



  @Regression
  Scenario: Check should be added in Void Checks and amount should be shown / Gift Card-Void Recharge
    Given User select QSR mode on menu item page
    Given User select DineIn mode
    And I select the "T22" in the Table layout screen"click t22 table"
    And User take an order
    When I get check number
    Then User click Option Tab
    When User click Gift Card tab
    Then User verify Gift Card screen
    When User enter gift card number for gift card option
    Then User enter gift card charge amount
    And I click Done button on the Popup
    When User click payment button
    And USer click cash button
    And User click submit button
    When User click Check Status tab
    Then User click Closed Checks tabs
    Then I click the Closed check on check stats
    And I click reopen check button on the check stats screen
    And User click payment button
    Then User select paid order
    And User click delete button
#    And User click receipt printer button

    And User click exit on payment page
    When User click void button
    Then User select void reason
    And User click add void button
    And I click Done button on the Popup
    When I click QSR tab
    And User click cancel button
    And I click log off button in order screen


#  @Regression
#  Scenario: Verify Application Should Be Recharge with GiveX Card
#    When User click QSR on Menu Item page
#    Then User select DineIn order type
#    And I select the "T25" in the Table layout screen"click t5 table"
#    When User click Option Tab
#    Then User click Gift Card tab
#    And User verify Gift Card screen
#    When User select GiveX option
#    Then User enter GiveX card number
#    And I click Done button on the Popup
#    And I click Done button on the Popup
#    Then User enter GiveX charge amount
#    And User verify recurring balance for GiveX Card
#    #Verify Recurring Balance and Beginning Balance with Entered Amount of Give X Card
#    And I click Done button on the Popup
#    And I click the "Done" button in the popup screen "click done button"
#    When I get check number
#    When User click Option Tab
#    Then User click Gift Card tab
#    And User verify Gift Card screen
#    When User select GiveX option
#    Then User enter GiveX card number
#    When User verify recurring balance for GiveX Card after recharge
#    Then User verify previous beginning balance for GiveX Card
#    And User enter GiveX recharge amount
#    And User verify new recurring balance of GiveX Card after recharge
#    And I click Done button on the Popup
#    And I click Done button on the Popup
#    Then User verify GiveX recharge amount on menu item page
#    When User click Cash Tab on Menu Item Page
#    Then User click exact option
#    And User click enter button
#    When I click QSR tab
#    And User click cancel button
#    When User click food category
#    And I click the "Onion Rings" from the menu item "Click item as onion rings"
#    And User click payment button
#    #And I scroll the payment to pay "Scroll payments"
#    Then User select GiveX payment method
#    And User select tip amount which is entered
#    And User click Continue button
#    When User enter GiveX card number on payment page
#    Then User click process
##    And User click receipt printer button
#    And I click on "Cancel" for closing order screen popup "Click cancel button"
#    When I click "All" in the order screen "Click All button"
#    When User click Check Status tab
#    Then User click Closed Checks tabs
#    Then I click the Closed check on check stats
#    Then I should verify the checks "verify the void check"
#    When User select last closed order detail icon
#    And User verify GiveX charge amount
#    When I click QSR tab
#    And User click cancel button
#    And I click log off button in order screen


#  Scenario: Verify Enter Charge Amount warning popup
#    When User click QSR on Menu Item page
#    Then User select DineIn order type
#    And I select the "T21" in the Table layout screen"click t21 table"
#    When User click Option Tab
#    Then User click Gift Card tab
#    And User verify Gift Card screen
#    When User select GiveX option
#    Then User enter GiveX card number
#    And I click Done button on the Popup
#    Then user verify the enter the charge amount
#    #Verify GiveX Recharge Amount
#    Then User enter GiveX charge amount
#    And I click Done button on the Popup
#    And I click Done button on the Popup
#    When User click Cash Tab on Menu Item Page
#    Then User click exact option
#    And User click enter button
#    And I click the "Power button" in the close the day screen "click Power button"
#
#
#  Scenario: Verify Void Action for GiveX Card
#    When User click QSR on Menu Item page
#    Then User select DineIn order type
#    And I select the "T20" in the Table layout screen"click t5 table"
#    When User click Option Tab
#    Then User click Gift Card tab
#    And User verify Gift Card screen
#    When User select GiveX option
#    Then User enter GiveX card number
#    Then User enter GiveX charge amount
#    #Verify Cancel Button After Entering the GiveX Card Number
#    When User click gift card cancel button
#    Then User click Gift Card tab
#    And User verify Gift Card screen
#    When User select GiveX option
#    Then User enter GiveX card number
#    Then User enter GiveX charge amount
#    And I click Done button on the Popup
#    And I click the "Done" in the popup screen"click done button"
#    When User click Cash Tab on Menu Item Page
#    Then User click exact option
#    And User click enter button
#    When I click QSR tab
#    And User click cancel button
#    When User click food category
#    When I get check number
#    And I click "Onion Rings" from the menu item "Click item as chappathi"
#    When User click payment button
#  #  And I scroll the payment to pay "Scroll payments"
#    Then User select GiveX payment method
#    And I select "10.00" option in the apply tip popup "Tip Amount TL 10.00 is selected"
#    Then I click the Continue button on the Total screen
#    When User enter GiveX card number on payment page
#    Then User click process
##    And User click receipt printer button
#    And User click cancel button
#    And I click All
#    When User click Check Status tab
#    Then User click Closed Checks tabs
#    Then I click the Closed check on check stats
#    Then User click re-open check button
#    #Verify Void the Check After Deleted the Payment on Give X Card Option
#    When User click payment button
#    Then User verify GiveX payment method and sandwiches total price for Void action
#    When User click submit button
#    And User click cancel button
#    And I click log off button in order screen
#
#
#  Scenario: Verify Application GiveX- Redeem-Forced Redemption
#    When User click QSR on Menu Item page
#    Then User select DineIn order type
#    And I select the "T20" in the Table layout screen"click t5 table"
#    When User click Option Tab
#    Then User click Gift Card tab
#    And User verify Gift Card screen
#    When User select GiveX option
#    Then User enter GiveX card number
#    Then User enter GiveX charge amount
#    And I click Done button on the Popup
#    And I click Done button on the Popup
#    When User click Cash Tab on Menu Item Page
#    Then User click exact option
#    And User click enter button
#    When I click QSR tab
#    And User click cancel button
#    When User click food category
#    And I click "Onion Rings" from the menu item "Click item as Cheesecake"
#    When User click payment button
#  #  And I scroll the payment to pay "Scroll payments"
#    Then User select GiveX payment method
#    And User click Continue button
#    When User enter GiveX card number on payment page
#    Then User click Forced Redemption button
#    And User click process
##    And User click receipt printer button
#    And User click cancel button
#    And I click log off button in order screen
#
#
##todo done
#  Scenario: Gift card tab should open along with Give X - Phone Order
#    Given User select QSR mode on menu item page
#    When User select Phone ToGo order type
#    And I click the search field in customer tab "1234567890" "search customer"
#    And I click the customer name in the list "select customer"
#    And I click on the save button in the customer field "Save Button Clicked"
#    And User verify Phone To Go order type
#  #  When User click All button
#  #  Then User click Table Layout menu
#  #  When User click New Check option
#  #  And I select the "T19" in the Table layout screen"click t5 table"
#  #  And I click "1" in the order screen for placing the menu item"click seat one"
#  #  And I click the Continue button on the Total screen
#    When User take an order
#    Then User click Option Tab
#    When User click Gift Card check option
#    And User verify Gift Card screen
#    And User verify Give X option
#    #Application should throw pop-up "Enter the Charge Amount" - Phone Order
#    When User enter gift card number for gift card option
#    And I click Done button on the Popup
#    Then User verify missing charge amount warning popup
#    When User enter gift card charge amount
#    And I click Done button on the Popup
#    When User click payment button
#    Then USer click cash button
#    And User click submit button
#    And I click the "Power button" in the close the day screen "click Power button"
#
#

#  @gift
  @GiftCard
  Scenario: Gift Card - Void Recharge - Check should be added in Void Checks and amount should be shown - Phone Order xxxxx
    Given User select QSR mode on menu item page
    When User select Phone ToGo order type
    And I click the search field in customer tab "1234567890" "search customer"
    And I click the customer name in the list "select customer"
    And I click on the save button in the customer field "Save Button Clicked"
    And User verify Phone To Go order type
  #  When User click All button
  #  Then User click Table Layout menu
  #  When User click New Check option
  #  And I select the "T19" in the Table layout screen"click t5 table"
  #  And I click "1" in the order screen for placing the menu item"click seat one"
  #  And I click the Continue button on the Total screen
  #  And User verify Dine In order type
    When User take an order
    Then User click Option Tab
    When User click Gift Card check option
    And User verify Gift Card screen
    And User verify Give X option
    When User enter gift card number for gift card option
    When User enter gift card charge amount
    And I click Done button on the Popup
    When User click payment button
    When USer click cash button
    Then User select paid order
    When User click delete button
#    And User click receipt printer button
    Then User click exit on payment page
    When User click void button
    Then User select void reason for gift card
    And User click add void button
    And I click the "Done" in the popup screen"click done button"
    And I click the "Power button" in the close the day screen "click Power button"


#  @gift#todo Done
  Scenario: Gift Card Void Check - Reopen Closed check from check stats and void the check after deleting payment
    Given User select QSR mode on menu item page
    When User select Phone ToGo order type
    And I click the search field in customer tab "1234567890" "search customer"
    And I click the customer name in the list "select customer"
    And I click on the save button in the customer field "Save Button Clicked"
    And User verify Phone To Go order type
  #  When User click All button
  #  Then User click Table Layout menu
  #  When User click New Check option
  #  And I select the "T18" in the Table layout screen"click t5 table"
  #  And I click "1" in the order screen for placing the menu item"click seat one"
  #  And I click the Continue button on the Total screen
  #  And User verify Dine In order type
    When User take an order
    Then User click Option Tab
    When User click Gift Card check option
    And User verify Gift Card screen
    And User verify Give X option
    When User enter gift card number for gift card option
    When User enter gift card charge amount
    And I click Done button on the Popup
    When User click payment button
    Then USer click cash button
    And User click submit button
    When I click QSR tab
    And User click cancel button
    And I click log off button in order screen



#  @gift
  Scenario: Gift Card - Recuring Balance should be added from the Begining Balance with the Entered amount with Phone Order
    Given User select QSR mode on menu item page
    When User select Phone ToGo order type
    And I click the search field in customer tab "1234567890" "search customer"
    And I click the customer name in the list "select customer"
    And I click on the save button in the customer field "Save Button Clicked"
    And User verify Phone To Go order type
    Then User click Option Tab
    When User click Gift Card check option
    When User enter gift card number for gift card option
    Then User enter gift card charge amount
    And I click Done button on the Popup
    When User click payment button
    When USer click cash button
    Then User click submit button
    When I click QSR tab
    And User click cancel button
    When User click Option Tab
    Then User click Gift Card check option
    When User enter gift card number for gift card option
    And User click cancel button
    And User click option back button
    And I click log off button in order screen


#  @gift

  Scenario: Gift Card-Void Recharge - In Check stats, Check should be added in Void Checks and amount should be show as 0.00
    Given User select QSR mode on menu item page
    When User select Phone ToGo order type
    And I click the search field in customer tab "1234567890" "search customer"
    And I click the customer name in the list "select customer"
    And I click on the save button in the customer field "Save Button Clicked"
    And User verify Phone To Go order type
    When User take an order
    When I get check number
    Then User click Option Tab
    When User click Gift Card check option
    And User verify Gift Card screen
    And User verify Give X option
    When User enter gift card number for gift card option
    Then User enter gift card charge amount
    And I click Done button on the Popup
    When User click payment button
    When USer click cash button
    Then User select paid order
    When User click delete button
#    And User click receipt printer button
    Then User click exit on payment page
    When User click void button
    Then User select void reason for gift card
    And User click add void button
    And I click the "Done" in the popup screen"click done button"
    Then User click Check Status tab
    When User click Void Checks tabs
    Then I click the Closed check on check stats
    And I click the "Power button" in the close the day screen "click Power button"


#todo done
#  @gift
  Scenario: Gift Card- Redeem - Paid amount should be detected from that gift card - With Tip
    Given User select QSR mode on menu item page
    When User select Phone ToGo order type
    And I click the search field in customer tab "1234567890" "search customer"
    And I click the customer name in the list "select customer"
    And I click on the save button in the customer field "Save Button Clicked"
    And User verify Phone To Go order type
    When User take an order
    Then User click payment button
    When User select payment method with gift card
    And I select "10.00" option in the apply tip popup "Tip Amount TL 10.00 is selected"
    And I click the Continue button on the Total screen
    Then User click manuel button
    When User enter gift card number
    Then User click process
#    And User click receipt printer button
    And I click the "Power button" in the close the day screen "click Power button"


#todo done
  Scenario: Gift Card- Redeem - Paid amount should be detected from that gift card - Without Tip
    Given User select QSR mode on menu item page
    When User select Phone ToGo order type
    And I click the search field in customer tab "1234567890" "search customer"
    And I click the customer name in the list "select customer"
    And I click on the save button in the customer field "Save Button Clicked"
    And User verify Phone To Go order type
    When User take an order
    Then User click payment button
    When User select payment method with gift card
    Then User click no tip button
    And User click Continue button
    Then User click manuel button
    When User enter gift card number
    Then User click process
#    And User click receipt printer button
    And I click the "Power button" in the close the day screen "click Power button"


  @85
  Scenario: Gift Card- Redeem - Paid amount should be detected from that gift card - With Tip and Partial Payment
    Given User select QSR mode on menu item page
    When User select Phone ToGo order type
    And I click the search field in customer tab "1234567890" "search customer"
    And I click the customer name in the list "select customer"
    And I click on the save button in the customer field "Save Button Clicked"
    And User verify Phone To Go order type
    When User take an order
    Then User click payment button
    And I enter partial payment amount "0","0","2","0"
    When User select payment method with gift card
    And I select "10.00" option in the apply tip popup "Tip Amount TL 10.00 is selected"
    And I click the Continue button on the Total screen
    Then User click manuel button
    When User enter gift card number
    Then User click process
#    And User click receipt printer button
    Then User verify first paid amount with gift card and tip
    Then USer click cash button
    And User click submit button
    And I click the "Power button" in the close the day screen "click Power button"


  Scenario: Gift Card- Redeem - Paid amount should be detected from that gift card - Without Tip and Partial Payment
    Given User select QSR mode on menu item page
    When User select Phone ToGo order type
    And I click the search field in customer tab "1234567890" "search customer"
    And I click the customer name in the list "select customer"
    And I click on the save button in the customer field "Save Button Clicked"
    And User verify Phone To Go order type
    When User take an order
    Then User click payment button
    And I enter partial payment amount "0","0","2","0"
    When User select payment method with gift card
    Then User click no tip button
    And I click the Continue button on the Total screen
    Then User click manuel button
    When User enter gift card number
    And User click process
#    And User click receipt printer button
    Then User verify first paid amount with gift card and tip1
    Then USer click cash button
    And User click submit button
    When I click QSR tab
    And User click cancel button
    And I click log off button in order screen


#  @new
#todo done
  Scenario: Gift Card- Void Item,Gift Card- Void Check,Gift Card- Void
    Given User select QSR mode on menu item page
    When User select DineIn mode
    And I select the "T23" in the Table layout screen"click t4 table"
    When User select first seat on menu item page
    When I get check number
    When I click the Drop down "arrow down" button in the order screen "click drop down button"
    And I click "Appetizers" in the top order screen "Select Category as CIMiniFood"
    When User select Brushetta menu item
    Then User click order button
    When User click payment button
    Then User select payment method with gift card
    When User click no tip button
    Then User click Continue button
    When User click manuel button
    Then User enter gift card number
    And User click process
#    And User click receipt printer button
    When User click Check Status tab
    Then User click Closed Checks tabs
    Then I click the Closed check on check stats
    When User click re-open check button
    And I click "Payment" in the order screen for void the credit card amount"Click payment button"
    And I select the credit card check in the payment screen "Credit card amount clicked"
    When I click Delete in the payment screen "Delete button clicked"
    And I click "OK" in the receipt printer popup"Click ok button in the popup"
    When I click Exit in the payment screen "exit button clicked"
    And I click "Void" in the order screen "Click void button"
    And I click the Wrong Item Ordered "Wrong Item Ordered" reason to void my menu item "select reason"
    And I click "Add" in the void screen"Click add button"
    And I click the "Done" in the popup screen"click done button"
    And I click the "Power button" in the close the day screen "click Power button"


#  @new
  #todo
  Scenario: Gift Card-Void Recharge After Redeemed
    Given User select QSR mode on menu item page
    When User select DineIn mode
    And I select the "T14" in the Table layout screen"click t4 table"
    Then User click Option Tab
    When User click Gift Card tab
    Then User verify Gift Card screen
    When User enter gift card number for gift card option
    Then User enter gift card charge amount
    And I click Done button on the Popup
    When User click payment button
    Then User select payment method with gift card
    And User click no tip button
    And User click Continue button
    When User click manuel button
    Then User enter gift card number
    And User click process
#    And User click receipt printer button
    When User click Table Layout menu
    Then User click New Check option
    And I select the "T15" in the Table layout screen"click t4 table"
    And I select the number of seats as "1"
    And I tap Continue to finish selecting the number of seats
    When User take an order
    When I get check number
    Then User click payment button
    When User select payment method with gift card
    Then User click no tip button
    And User click Continue button
    When User click manuel button
    Then User enter gift card number
    And User click process
#    And User click receipt printer button
    When User click Check Status tab
    Then User click Closed Checks tabs
    Then I click the Closed check on check stats
    Then User click re-open check button
    When User click payment button
    Then User verify paid order with gift card
    And User click submit button
    When I click QSR tab
    And User click cancel button
    And I click log off button in order screen


#todo Done
#  @new
  Scenario: GivX Payment - Application should throw pop-up "Enter the Charge Amount"
    Given User select QSR mode on menu item page
    When User select DineIn mode
    And I select the "T14" in the Table layout screen"click t4 table"
    When User select first seat on menu item page
    Then User take an order
    Then User click Option Tab
    When User click Gift Card tab
    Then User verify Gift Card screen
    When User select GiveX option
    Then User verify GivX Card screen
    Then User enter GiveX card number
    #GivX-Activate Account
    When User enter GiveX charge amount
    And I click Done button on the Popup
    Then User verify GiveX Recharge success info popup
    And I click Done button on the Popup
    When User click payment button
    Then USer click cash button
    And User click submit button
    When I click QSR tab
    And User click cancel button
    And I click log off button in order screen


#todo done
#  @new
  Scenario: Give X-Recharge - Cancel
    Given User select QSR mode on menu item page
    When User select DineIn mode
    And I click the "Right" in the table layout screen "click right button"
    And I select the "T15" in the Table layout screen"click t4 table"
    When User select first seat on menu item page
    Then User take an order
    Then User click Option Tab
    When User click Gift Card tab
    Then User verify Gift Card screen
    When User select GiveX option
    Then User verify GivX Card screen
    Then User enter GiveX card number
    When User enter GiveX charge amount
    Then User click GiveX cancel button
    And User verify be directed to Check Option page
    #Give X Tab - Recuring Balance should be added from the Begining Balance with the Entered amount
    When User click Gift Card tab
    Then User verify Gift Card screen
    When User select GiveX option
    Then User verify GivX Card screen
    Then User enter GiveX card number
    When User enter GiveX charge amount
    And User click cancel button
    And User click option back button
    When User click payment button
    Then USer click cash button
    And User click submit button
    When I click QSR tab
    And User click cancel button
    And I click log off button in order screen


#todo
  Scenario: Application should takes to the Order screen with GiveX Card
    Given User select QSR mode on menu item page
    When User select DineIn mode
    And I select the "T14" in the Table layout screen"click t14 table"
    When User select first seat on menu item page
    Then User take an order
    Then User click Option Tab
    When User click Gift Card tab
    Then User verify Gift Card screen
    When User select GiveX option
    Then User verify GivX Card screen
    Then User enter GiveX card number
    And I click Done button on the Popup
    When User enter GiveX charge amount
    Then User click gift card cancel button
    #Give X-Void Recharge - Application throws Pop-up should come as "Can't void, GiveX gift Card Present in this check" - xxxx
    When User click Gift Card tab
    Then User verify Gift Card screen
    When User select GiveX option
    Then User verify GivX Card screen
    Then User enter GiveX card number
    And I click Done button on the Popup
    When User enter GiveX charge amount
    And I click Done button on the Popup
    And I click Done button on the Popup
#    Then I should see recharge successful popup
    When User take an order
    When I get check number
    Then User click payment button
    And USer click cash button
    And User click submit button
    When User click Check Status tab
    Then User click Closed Checks tabs
    Then I click the Closed check on check stats
    And User click re-open check button
    Then User click payment button
    Then User select paid order
    And User click delete button
#    And User click receipt printer button
    And User click exit on payment page
    When User click void button
    And I click Done button on the Popup
    Then User click payment button
    And USer click cash button
    And User click submit button
    And I click the "Power button" in the close the day screen "click Power button"


#todo done
  Scenario Outline: Give X-Void Recharge - "Void and Select Void Reason" - Application throws Pop-up should come as "Can't void, GiveX gift Card Present in this check" - xxxx
    Given User select QSR mode on menu item page
    When User select DineIn mode
    And I select the "T11" in the Table layout screen"click t4 table"
    When User select first seat on menu item page
    When I click the Drop down "arrow down" button in the order screen "click drop down button"
    And I click "CIFOOD" in the top order screen "Select Category as CIMiniFood"
    And I click "Mutton" from the menu item "Click item as MiniIdly"
    Then User click Option Tab
    When User click Gift Card tab
    Then User verify Gift Card screen
    When User select GiveX option
    Then User verify GivX Card screen
    Then User enter GiveX card number
    When User enter GiveX charge amount
    And I click Done button on the Popup
    And I click Done button on the Popup
    Then User click void button
    Then user verify the popup "<btnPopup>" "verify the popup"
    And I click Done button on the Popup
    And I click Cash button for Complete Sale
    Then User click exact option
    And User click enter button
    And I click the "Power button" in the close the day screen "click Power button"

    Examples:
      |btnPopup|
      |Cannot void, GiveX or Factor4 or ValuTec gift card present in this check.|


#todo done
  Scenario: Give X- Payment - Entire amount should be detected from Give X card - xxx
    Given User select QSR mode on menu item page
    When User select DineIn mode
    And I select the "T11" in the Table layout screen"click t11 table"
    When User click add new seat button on menu item
    Then User verify added new seat
    When User select first seat on menu item page
    When I click the Drop down "arrow down" button in the order screen "click drop down button"
    And I click "CIFOOD" in the top order screen "Select Category as CIMiniFood"
    And I click "Mutton" from the menu item "Click item as MiniIdly"
    When User click payment button
  #  And I scroll the payment to pay "Scroll payments"
    Then User select GiveX payment method
    And User select tip amount which is entered
    And User click Continue button
    And I click on the card number text field "enter card number"
    And I enter the GiveX Number as "603628237912001380863" "enter card number"
    And I click "Hide keyboard" button in the keyboard "Click Back"
    And I click "Process" in the Give-X Card popup "Click Process button"
    Then I click "OK" in the order screen "Click OK button"
    And I click the "Power button" in the close the day screen "click Power button"
