@Regression
Feature: Bar Tab

  Background:
    Given I'm logged in
    And I closed the order type window


  Scenario: Verify Bar Tab to Split
    Given User click setting icon
    And User verify setting options
    When User select POS Settings tab
    Then User open ask customer name option if disable in void screen
    And I click the Toggle Icon button
    And I click POS Icon from Toggle
    And User click cancel button
    When User click QSR on Menu Item page
    Then User select Bar Tab in order types
    And User enter customer name for bar tab
    And I click the Exit to close the preauth window
    When User click All button
    And I click BarTab Layout
    When User click new tab on Bar tab
#    And User enter customer name for bar tab
    And I click the Exit to close the preauth window
    And User enter customer name for bar tab
    And I select category as "FOOD"
    And I get check number
    And User take an order as "SANDWICHES"
    Then User verify be directed menu item page
    And I select menu item as "SANDWICHES"
    And User click finish button
    When User select Split option on Bar tab
    Then User select split by seat option
    And I select check from the bartab screen
#    And User select first bar tab order
    And User click Save and Close button on Split Check page
    When User click finish button
    And User verify be directed bar tab page
    And User verify All Tab option on Bar Tab
    And User verify Seated option on Bar Tab
    And User verify Check Down option on Bar Tab
    And User verify On Hold option on Bar Tab
    And User verify Expired option on Bar Tab
    When User click Transfer option on Bar tab
    Then User verify transfer screen
    Then User click cancel button
    When User click Pay Check button on the bartab
    And I select check from the bartab screen
#    And User select first bar tab order
    Then I should see the Payment window
    And I click the Exit button in the payment window
    When User click finish button
    When User click operation button
    Then User verify be directed operation page
#       And I click the Toggle Icon button
    And I click POS Icon from Toggle
    Then User click cancel button
#    When User select QSR order typ
    And I click log off button in order screen


  Scenario: Verify Merge with Discount on Bar Tab
    Given User click setting icon
    And User verify setting options
    When User select POS Settings tab
    Then User open ask customer name option if disable in void screen
    And I click the Toggle Icon button
    And I click POS Icon from Toggle
    And User click cancel button
    When User click QSR on Menu Item page
    Then User select Bar Tab in order types
    And User enter customer name for bar tab
    And I click the Exit to close the preauth window
#    And User enter customer name for bar tab
    And I get check number
    And I select category as "FOOD"
    And User take an order as "SANDWICHES"
    When User click Option Tab
    And I click discount on check option screen
#    And I select Discount on the Order screen
    Then I should see Check Based Discount Screen
    And I click Discount as "IB-AfterTax-Amount"
    And I click Back button on Discount Screen
#    And User select item based discount after tax as amount
    And I select category as "FOOD"
    And User take an order as "SANDWICHES"
    And I select menu item as "mongo test"
    #Verify Merge with Tax Exempt on Bar Tab
    When User click Option Tab
    Then User select tax exempt option
#    And User select tax exempt type
#    And User verify added tax exempt
    #Verify Merge with Gratuity on Bar Tab
    When User click Option Tab
    Then User select gratuity option
    And User select fixed gratuity option
    And User verify fixed gratuity1
    And I click Finish button
    And I click BarTab Layout
    And I click New Tab in the Bar Tab Screen

    And I click the Exit to close the preauth window
    And User enter customer name for bar tab
    And I get check number1
    And I select category as "FOOD"
    And User take an order as "SANDWICHES"
    When User click Option Tab
    And I click discount on check option screen
#    And I select Discount on the Order screen
    Then I should see Check Based Discount Screen
    And I click Discount as "IB-AfterTax-Amount"
    And I click Back button on Discount Screen

#    And User select item based discount after tax as amount
    And I select category as "FOOD"
    And User take an order as "SANDWICHES"
    And I select menu item as "mongo test"
    #Verify Merge with Tax Exempt on Bar Tab
    When User click Option Tab
    Then User select tax exempt option
#    And User select tax exempt type
#    And User verify added tax exempt
    #Verify Merge with Gratuity on Bar Tab
    When User click Option Tab
    Then User select gratuity option
    And User select fixed gratuity option
    And User verify fixed gratuity1
    And I click Finish button
#    When User click All button
    And I click BarTab Layout
    Then I click Merge button
#    When User select last bar tab check
##    Then User click yes button in Bar Tab
#    When User select first bar tab check
    And I click closed check in bar tab
    And I click Yes button on the bartab
    And I click clear text button
    And I click closed check in bar tab1
    And I click Yes button on the bartab
#    And I click "Yes" in the close the day Popup window "click yes button"
    And I click clear text button
#    And I click "Hide keyboard" button in the keyboard "Click Back"
#    And User click merge done button
    When User click merge done button
    Then User confirm merge checks confirmation popup
    And I click Done button on the Popup
    When User click Pay Check button on the bartab
    And I click merged barTab
    Then I should see the Payment window
#    When User click exact option
    Then I click cash button from the payment method popup
    And User click submit button
    And I click BarTab Layout
    And I click power button


  Scenario: Verify search option with check number on Bar Tab
        Given User click setting icon
    And User verify setting options
    When User select POS Settings tab
    Then User open ask customer name option if disable in void screen
    And I click the Toggle Icon button
    And I click POS Icon from Toggle
    And User click cancel button
    When User click QSR on Menu Item page
    Then User select Bar Tab in order types
    And User enter customer name for bar tab
    And I click the Exit to close the preauth window
#    And User enter customer name for bar tab
    When User click All button
    And I click BarTab Layout
    When User click new tab on Bar tab

    And I click the Exit to close the preauth window
    And User enter customer name for bar tab
    And I get check number
#    And User enter customer name for bar tab
    And I select category as "FOOD"
    And User take an order as "SANDWICHES"
    Then User click finish button
    And I click BarTab Layout
#    And I click closed check in bar tab
    Then I should see closed check in barTab
#    Then User click food category
#    Then User verify be directed menu item page
#    Then User click finish button
    #Verify search option with customer name on Bar Tab
#    Then User enter customer name on bar tab search textfield
    And User verify searched customer name
    #Application allow the user to change the service
#    When User click QSR on Check Status page
#    And User click cancel button
    And I click power button


  Scenario: Application display the entered name or updated name
    Given User click setting icon
    And User verify setting options
    When User select POS Settings tab
    Then User open ask customer name option if disable in void screen
    And I click the Toggle Icon button
    And I click POS Icon from Toggle
    And User click cancel button
    When User click QSR on Menu Item page
    Then User select Bar Tab in order types
    And User enter customer name for bar tab
    And I click the Exit to close the preauth window
#    And User enter customer name for bar tab
    When User click All button
    And I click BarTab Layout
    When User click new tab on Bar tab
#    And User enter customer name for bar tab
    And I click the Exit to close the preauth window
    And User enter customer name for bar tab
    And I get check number
    And I select category as "FOOD"

    And User take an order as "SANDWICHES"
    Then User click finish button
    Then I should see closed check in barTab
    And User verify searched customer name
    And I click clear text button
    And I click closed check in bar tab
#    And User verify last customer name as floating on bar tab
    And I click Add Customer Button
    And I search for "thomas a"
    When I click "thomas a" to select customer for the seat
    Then I should see customer as "thomas a" added on order screen
    Then User click finish button
    #Application display the check in green color - seated
    And User verify be directed bar tab screen
    And I click merged barTab
#    And I click clear text button
    And I click Payment button in the Order Management Screen
    And I click cash button from the payment method popup
    And User click submit button
#    Then User click finish button
#    When User select QSR order typ
#    Then User click cancel button
    And I click power button


  Scenario: Application display the check in blue color  - on hold
    Given User click setting icon
    And User verify setting options
    When User select POS Settings tab
    Then User open ask customer name option if disable in void screen
    And I click the Toggle Icon button
    And I click POS Icon from Toggle
    And User click cancel button
    When User click QSR on Menu Item page
    Then User select Bar Tab in order types
    And User enter customer name for bar tab
    And I click the Exit to close the preauth window
#    And User enter customer name for bar tab
    Then User click food category
    And I select menu item as "SANDWICHES"
    Then User click Option Tab
    And User select Hold check option
#    When User select manuel option for Hold check option
#    And I click Done button on the Hold
    And I click Done button on the Popup in void screen
    And User click option back button
    Then User verify hold menu item
    When User click finish button
    And User verify be directed bar tab screen
    #Application display the check in orange color - expired
#    And User verify expired order
    When I click QSR tab
    Then User click cancel button
    And I click log off button in order screen


  Scenario: Application can sort customer name  also bar tab check from A to Z
    Given User click setting icon
    And User verify setting options
    When User select POS Settings tab
    Then User open ask customer name option if disable in void screen
    And I click the Toggle Icon button
    And I click POS Icon from Toggle
    And User click cancel button
    When User click QSR on Menu Item page
    Then User select Bar Tab in order types
    And User enter customer name for bar tab
    And I click the Exit to close the preauth window
#    And User enter customer name for bar tab
    Then User click food category
    And I select menu item as "SANDWICHES"
    Then User click finish button
    And User verify be directed bar tab screen
    When User click sort A-Z button on bar tab
    Then User verify bar tab orders from A to Z
    #Application can sort customer name  also bar tab check from Z to A
    When User click sort Z-A button on bar tab
    Then User verify bar tab orders from Z to A
    When I click QSR tab
    Then User click cancel button
    And I click log off button in order screen


  Scenario: Application should ask customer name enable Ask customer name option
    Given User click setting icon
    And User verify setting options
    When User select POS Settings tab
    Then User open ask customer name option if disable in void screen
    And I click the Toggle Icon button
    And I click POS Icon from Toggle
    And User click cancel button
    When User click QSR on Menu Item page
    Then User select Bar Tab in order types
    And User enter customer name for bar tab
    And I click the Exit to close the preauth window
#    And User enter customer name for bar tab
    #Check with vary gratuity through Payment screen - BarTab
    When User take an order
    Then User click Option Tab
    When User select gratuity option
    Then User select varying gratuity option
    And User enter percentage of varying gratuity
    And I enter the percentage1 as "1500"
#    And I enter the percentage as "1","5",".","0"
#
    And User click apply button for varying gratuity
    And User verify varying gratuity as "$ 0.15"
    Then User click finish button
    And I click power button



  Scenario: Split without Selected Item
    Given User click setting icon
    And User verify setting options
    When User select POS Settings tab
    Then User open ask customer name option if disable in void screen
    And I click the Toggle Icon button
    And I click POS Icon from Toggle
    And User click cancel button
    When User click QSR on Menu Item page
    Then User select Bar Tab in order types
    And User enter customer name for bar tab
    And I click the Exit to close the preauth window
    And I get check number
    And I add a new seat
    And I click Seat 2 for add menu item
    When User take an order as "Burger ind"

    When User select first seat on menu item page in split screen
    Then User take an order in split screen
    Then User click finish button in split screen
    And I click split button on the bartab screen
    And I click split check button on the bartab screen
#    When User click split button in split screen
    And I click closed check in bar tab
#    When I click the active check from bar tab
    Then I should see the Split check screen
    When User click split by seat option in split screen
    Then I should see menu item are moved to split check
#    Then User verify splited checks on Split Check page
    When I click the save & close button on the split screen
    Then I Should get back to the Order Screen
    Then User click finish button in split screen
    And I click power button


  Scenario: Split Evenly
    Given User click QSR on Menu Item page in split screen
    Given User select DineIn mode in split screen
    And I select table as "T20"
    And I add a new seat
    And I get check number
    When User take an order as "SANDWICHES"
    When User select first seat on menu item page in split screen
    Then User take an order in split screen
#    Then User click finish button in split screen
    And I click the split seat from Order screen
#    When User click split button in split screen
#    And I click the check from the table layout for merged
#    When I click the active check from bar tab
    Then I should see the Split Screen
    And I click Split Evenly Button
    Then I should see Seperate Item is Disable
    Then I should see the additional seat & Item on the Split Seat
#    And User verify split evenly check total amount
    When I click the save & close button on the split screen
#    And I click Payment button in the Order Management Screen
    Then User click Cash Tab in split screen
    And User click exact option in split screen
    And User click enter button in split screen
    And I click Table Layout tab
##    And I click "OK" in the receipt printer popup in split screen "Click ok button in the popup"
    And I click power button

  Scenario: Split Item
    Given User click QSR on Menu Item page in split screen
    Given User select DineIn mode in split screen
    And I select table as "T20"
    And I add a new seat
    And I get check number
    When User take an order as "SANDWICHES"
    When User select first seat on menu item page in split screen
    Then User take an order in split screen
    Then User click finish button in split screen
    When User click split button in split screen
    And User click split by seat button in split screen
#    And I click the Split By Seat on the Pop-up
    And I click the check from the table layout screen
    Then I should see the Split Screen
#    And User select first order which is separate in split screen
    And I click on item
    And User click Seperate Item button
#    And I click Seperate item button
    And I select the number of split item "2" for Split check
    And I click the Continue button
    Then I Should see Split Evenly is Disable
    Then I should see the additional seat & Item on the Split Seat1
#    And User select separate number for item
#    And User verify separate item
    When I click the save & close button on the split screen
    Then I Should get back to the Order Screen
    Then User click Cash Tab in split screen
    And User click exact option in split screen
    And User click enter button in split screen
#    And I click "OK" in the receipt printer popup in split screen "Click ok button in the popup"
    And I click power button

  Scenario: Split without Sale
    Given User click QSR on Menu Item page in split screen
    Given User select DineIn mode in split screen
#    And User select sixth table in split screen
    And I select table as "T20"
    And I add a new seat
    When User take an order as "SANDWICHES"
    And I get check number
    When User select first seat on menu item page in split screen
    Then User take an order in split screen
    Then User click finish button in split screen
    When User click split button in split screen
    And User click split by seat button in split screen
    And I click the check from the table layout screen
    Then I should see the Split Screen
    And I click Add Button to create Seat
    Then I should see created new seat
    When I click the save & close button on the split screen
    Then I Should get back to the Order Screen
    Then User click Cash Tab in split screen
    And User click exact option in split screen
    And User click enter button in split screen
#    And I click "OK" in the receipt printer popup in split screen "Click ok button in the popup"
    And I click power button


  Scenario: Split from Order Screen
    Given User click QSR on Menu Item page in split screen
    Given User select DineIn mode in split screen
    And I select table as "T20"
    When User take an order as "SANDWICHES"
    And I click the split seat from Order screen
    And I click seat one on the split screen
#    And User select first seat
    Then User click pay button on split seat
    Then I should see the Payment window
    When I click cash button from the payment method popup
    And User click submit button in split screen
    And I click power button


#  Scenario: Pay Split Check
#    Given User click QSR on Menu Item page in split screen
#    Given User select DineIn mode in split screen
#    And I select table as "T20"
#    When User take an order as "SANDWICHES"
#    Then User click payment button in split screen
#    When User click calculator split button in split screen
#    Then User select type of split in split screen
#    And User select payment method with cash in split screen
#    Then User verify last split paid cash amount in split screen
#    And User select payment method with cash in split screen
#    And User click submit button in split screen
#    And I click power button


  Scenario: Application allows the user to navigate the split seat screen
    Given User click QSR on Menu Item page in split screen
    Given User select DineIn mode in split screen
    And I select table as "T20"
    When User take an order as "SANDWICHES"
    Then User click split button on menu item page in split screen
    And User click split check option on menu item in split screen
    And User verify split check page
    When I click the save & close button on the split screen
    Then User click Cash Tab in split screen
    And User click exact option in split screen
    And User click enter button in split screen
    And I click power button


  Scenario: Split By Seat on BarTab with Add Button
    Given User click setting icon
    And User verify setting options
    When User select POS Settings tab
    Then User open ask customer name option if disable in void screen
    And I click the Toggle Icon button
    And I click POS Icon from Toggle
    And User click cancel button
    When User click QSR on Menu Item page
    Then User select Bar Tab in order types
    And User enter customer name for bar tab
    And I click the Exit to close the preauth window
#    And User enter customer name for bar tab in split screen
    And I select Pizza as Category
    Then User select PizzaMel menu item of pizza category in split screen
    And User click order button in split screen
    Then User select Margarita menu item of pizza category in split screen
    And User click order button in split screen
    And User verify total price of Margarita menu item in split screen
    When User click split button on menu item page in split screen
    Then User click split check option on menu item in split screen
    And User click Add button for split
#    Then I should see created new seat
    When User click Save and Close button on Split Check page
    Then User click Cash Tab in split screen
    And User click exact option in split screen
    And User click enter button in split screen
    And I click power button


  Scenario: Split By Seat on BarTab with Split By Seat Button  -- SEAT DÜZENLENECEK
    Given User click setting icon
    And User verify setting options
    When User select POS Settings tab
    Then User open ask customer name option if disable in void screen
    And I click the Toggle Icon button
    And I click POS Icon from Toggle
    And User click cancel button
    When User click QSR on Menu Item page
    Then User select Bar Tab in order types
    And User enter customer name for bar tab
    And I click the Exit to close the preauth window
#    And User enter customer name for bar tab in split screen
    When I add a new seat
    When User select first seat on menu item page in split screen
###    When User click food category in split screen
    Then User take an order in split screen
    When User select second seat on menu item page in split screen
##    Then User click food category in split screen
    Then User take an order in split screen
    When User click split button on menu item page in split screen
    Then User click split by seat option on menu item page in split screen
    When User click Save and Close button on Split Check page
    Then I Should get back to the Order Screen
    Then User click Cash Tab in split screen
    And User click exact option in split screen
    And User click enter button in split screen
    And I click power button

  Scenario: Split By Seat - Separate Item on Bar Tab
    Given User click setting icon
    And User verify setting options
    When User select POS Settings tab
    Then User open ask customer name option if disable in void screen
    And I click the Toggle Icon button
    And I click POS Icon from Toggle
    And User click cancel button
    When User click QSR on Menu Item page
    Then User select Bar Tab in order types
    And User enter customer name for bar tab
    And I click the Exit to close the preauth window
#    And User enter customer name for bar tab in split screen
    When I add a new seat
    Then User select first seat on menu item page in split screen
###    When User click food category in split screen
    And User take an order in split screen
    When User select second seat on menu item page in split screen
##    Then User click food category in split screen
    And User take an order in split screen
    When User click split button on menu item page in split screen
    Then User click split by seat option on menu item page in split screen
    Then I should see the Split Screen
    And I click on item
    And User click Seperate Item button
    And I select the number of split item "2" for Split check
    And I click the Continue button
    Then I Should see Split Evenly is Disable
    Then I should see the additional seat & Item on the Split Seat1
    When I click the save & close button on the split screen
    Then I Should get back to the Order Screen
    Then User click Cash Tab in split screen
    And User click exact option in split screen
    And User click enter button in split screen
    And I click power button

  Scenario: Split By Seat - Split Evenly on Bar Tab - with Add Button
    Given User click setting icon
    And User verify setting options
    When User select POS Settings tab
    Then User open ask customer name option if disable in void screen
    And I click the Toggle Icon button
    And I click POS Icon from Toggle
    And User click cancel button
    When User click QSR on Menu Item page
    Then User select Bar Tab in order types
    And User enter customer name for bar tab
    And I click the Exit to close the preauth window
#    And User enter customer name for bar tab in split screen
##    When User click food category in split screen
    And User take an order in split screen
    When User click split button on menu item page in split screen
    Then User click split by seat option on menu item page in split screen

    Then User verify total price of splited seat
    And User click Add button for split
    And User click split evenly button
#    And I click Split Evenly Button
    Then I should see Seperate Item is Disable
    Then I should see the additional seat & Item on the Split Seat
    When I click the save & close button on the split screen
    Then I Should get back to the Order Screen
    Then User click Cash Tab in split screen
    And User click exact option in split screen
    And User click enter button in split screen
    And I click power button

  Scenario: Split By Seat - Split Evenly on Bar Tab - with More Than One Seat
    Given User click setting icon
    And User verify setting options
    When User select POS Settings tab
    Then User open ask customer name option if disable in void screen
    And I click the Toggle Icon button
    And I click POS Icon from Toggle
    And User click cancel button
    When User click QSR on Menu Item page
    Then User select Bar Tab in order types
    And User enter customer name for bar tab
    And I click the Exit to close the preauth window
#    And User enter customer name for bar tab in split screen
    When I add a new seat
    Then User select first seat on menu item page in split screen
##    When User click food category in split screen
    And User take an order in split screen
    When User select second seat on menu item page in split screen
#    Then User click food category in split screen
    And User take an order in split screen
    When User click split button on menu item page in split screen
    Then User click split by seat option on menu item page in split screen
    And User click split evenly button
    Then I should see Seperate Item is Disable
    Then I should see the additional seat & Item on the Split Seat
    When I click the save & close button on the split screen
    Then I Should get back to the Order Screen
    Then User click Cash Tab in split screen
    And User click exact option in split screen
    And User click enter button in split screen
    And I click power button

  Scenario: Split By Seat - Group Seat on Bar Tab
    Given User click setting icon
    And User verify setting options
    When User select POS Settings tab
    Then User open ask customer name option if disable in void screen
    And I click the Toggle Icon button
    And I click POS Icon from Toggle
    And User click cancel button
    When User click QSR on Menu Item page
    Then User select Bar Tab in order types
    And User enter customer name for bar tab
    And I click the Exit to close the preauth window
#    And User enter customer name for bar tab in split screen
    When I add a new seat
    Then User select first seat on menu item page in split screen
##    When User click food category in split screen
    And I click Search Button on the Order Screen
    Then I should see search field on the Order screen
    And I pass menu item to search and click the menu item as "HAMBURGER"
    Then I should see menu item added into Order list
#    Then User select Hamburger menu item in split screen
    And User click order button in split screen
    When User select second seat on menu item page in split screen
#    Then User click food category in split screen
    And I click Search Button on the Order Screen
    Then I should see search field on the Order screen
    And I pass menu item to search and click the menu item as "HAMBURGER"
    Then I should see menu item added into Order list
#    When User select Hamburger menu item in split screen
    And User click order button in split screen
    When User click split button on menu item page in split screen
    Then User click split by seat option on menu item page in split screen
    Then User select seats which are merge
#    And I click seat two on the split screen
    When User click group seat button
#    And I click the Group Seats button in the Split Seat
    Then I should see selected seat item should club into one seat
    When I click the save & close button on the split screen
    Then I Should get back to the Order Screen
    Then User click Cash Tab in split screen
    And User click exact option in split screen
    And User click enter button in split screen
    And I click power button

  @BarTab1
  Scenario: Transfer Check To Another Server
#
    Given User click setting icon
    And User verify setting options
    When User select POS Settings tab
    Then User open ask customer name option if disable in void screen
    And I click the Toggle Icon button
    And I click POS Icon from Toggle
    And User click cancel button
    When User click QSR on Menu Item page
    Then User select Bar Tab in order types
    And User enter customer name for bar tab
    And I click the Exit to close the preauth window
#    Then User click cancel button
    And I get check number
#    And I select category as "FOOD"
    And User take an order as "SANDWICHES"
    And User click finish button
    When User click new tab on Bar tab
    And I click the Exit to close the preauth window
    And User enter customer name for bar tab
#    Then User click cancel button
    And I get check number1
    And Get the Server Name from The required Table
    And I select category as "FOOD"
    Then User select Hamburger menu item
    And User click finish button
    When User click Transfer option on Bar tab
    Then User click Transfer to Server button
#    And User verify transfer to server page
    Then Select correct server from the Transfer From Table
    And Select the required check from the Checks Table for Transfer Server
    Then Select anyone server from the Transfer To Table
#    Then Select anyone Table from the Transfer To Table

    #Scenario: Transfer Item To Another Bar Tab
    Then User select Transfer Item button
    When User select Bar Tab order for transfer menu item
    Then User select menu item which is transferred
    And User select Bar Tab which menu item transferred to
#    And I click yes
    And User click transfer done button
    And I should see item transfer successful pop-up
    And I click Done button on the Popup
#    And User verify transfer success popup
    When I click Check Stats tab
    And I click the Active check on check stats11
    And I click Pay Check button
#    Then I click the active check from bar tab1
#    And I click merged barTab
    Then I should see the Payment window
    When I click cash button from the payment method popup
    Then User click submit button

#  Scenario: Transfer Check To Another Table
#    Given User click All button
    When User click Table Layout menu
    And I click new check button on the Table layout screen
    Then User select first table
#    And I select table as "<string>"
    And I select the number of seats as "1"
    And I tap Continue to finish selecting the number of seats
    And I get check number

    And I select category as "FOOD"
    Then User select any menu item
    And User click finish button
    When User click transfer button
    Then User click Transfer to Table button
    When User select table which is transfer from
    Then User select check which will be transfer
    And User select table which is transfer to
    And User click transfer done button
    And I should see transfer successful pop-up
    And I click Done button on the Popup
#    Then I should see item transfer successful pop-up

#  Scenario: Transfer with Any Type of Discount
#    Given User click All button
    When User click Bar Tab on Check Status page
    Then User click new tab on Bar tab
    And I click the Exit to close the preauth window
    Then User click cancel button for customer name popup
    And I get check number
    And I select category as "FOOD"
    Then User select Sandwiches menu item
#    When User verify discount price
    Then User click finish button

    Then User click new tab on Bar tab
    And I click the Exit to close the preauth window
    And User enter customer name for bar tab
    And I get check number1
    And I select category as "FOOD"
    And User take an order as "SANDWICHES"
    When User click Option Tab
    And I click discount on check option screen
    Then I click Discount as "IB-BeforeTax-SetPrice"
    And I click Back button on Check Options Screen2
#    When User select item discount option tab
#    Then User select item based discount before tax as set price
    And User verify item based discount before tax as set price
    And Get the Server Name from The required Table
    Then User click finish button
    When User click Transfer option on Bar tab
    Then User click Transfer to Server button
    Then Select correct server from the Transfer From Table
    And Select the required check from the Checks Table for Transfer Server
    Then Select anyone server from the Transfer To Table
#    And User verify transfer to server page
#    When User select server which transfer from
#    Then User select Bar Tab order which transfer
#    And User select server which transfer to
#    And User continue if server closed
    And I click Done button on the Popup
   And I should see transfer successful pop-up
    And I click Done button on the Popup
    Then User click Merge button in the table layout screen
    And I click closed check in bar tab
    And I click clear text button
#    And User click remove discount option
    And I click closed check in bar tab1
#    And I click clear text button
#    When User select second order which is merge
#    Then User click remove discount option
    And I click Yes button on the bartab
    And User click merge done button
    And User confirm merge checks confirmation popup
    And I click Done button on the Popup
    When User click Pay Check button on the bartab
    And I click merged barTab
    When I click cash button from the payment method popup
    Then User click submit button
    #Scenario: Transfer with Any Type of Gratuity - Fix Gratuity
    When User click Bar Tab on Check Status page
    Then User click new tab on Bar tab
    And I click the Exit to close the preauth window
    Then User click cancel button
    And I get check number
#    When User click pizza category
    And I select category as "PIZZA"
    Then User select PizzaMel menu item of pizza category
    And User verify total price of PizzaMel menu item
    And User click finish button
    Then User click new tab on Bar tab
    And I click the Exit to close the preauth window
    And User enter customer name for bar tab
    And I get check number1
    And I select category as "FOOD"
    And User take an order as "SANDWICHES"
    When User click Option Tab
    Then User select gratuity option
    And User select fixed gratuity option
    And User verify fixed gratuity option applied on Brushetta
    Then User click finish button
    When User click Transfer option on Bar tab
    Then User click Transfer to Server button
    Then Select correct server from the Transfer From Table
    And Select the required check from the Checks Table for Transfer Server
    Then Select anyone server from the Transfer To Table

    And I click Done button on the Popup
    And I should see transfer successful pop-up
    And I click Done button on the Popup

    Then User click Merge button in the table layout screen
    And I click closed check in bar tab
    And I click clear text button
#    And User click remove discount option
    And I click closed check in bar tab1
#    And I click clear text button
#    When User select second order which is merge
#    Then User click remove discount option
#    And I click Yes button on the bartab
    And User click merge done button
#    And User confirm merge checks confirmation popup
    And I click Done button on the Popup
    When User click Pay Check button on the bartab
    And I click merged barTab
    When I click cash button from the payment method popup
    Then User click submit button

    #Scenario: Transfer  Check To Another Server
    When User click Bar Tab on Check Status page
    Then User click new tab on Bar tab
    And I click the Exit to close the preauth window
    Then User click cancel button for customer name popup
    And I get check number
    And I select category as "FOOD"
    And User take an order as "SANDWICHES"
    And User click finish button
    When User click new tab on Bar tab
    And I click the Exit to close the preauth window
    Then User click cancel button for customer name popup
    And I get check number1
    And I select category as "FOOD"
    Then User select Hamburger menu item
    And User click finish button
    When User click Transfer option on Bar tab
    Then User click Transfer to Server button
    Then Select correct server from the Transfer From Table
    And Select the required check from the Checks Table for Transfer Server
    Then Select anyone server from the Transfer To Table
    And I click Done button on the Popup
    And I should see transfer successful pop-up
    And I click Done button on the Popup
    And I click power button






