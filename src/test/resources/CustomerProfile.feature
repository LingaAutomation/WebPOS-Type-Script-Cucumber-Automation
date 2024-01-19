@MNK
Feature: Customer Profile

  Background:
    Given I'm logged in


  Scenario Outline: Customer Profile Feature File
  #Select an existing customer for a FORHERE order
#        Given I'm logged in
    And I select the order type FORHERE
    And I click Done button to select the order type
    And I click Add Customer Button
    And I search for "<Customer Name>"
    When I click "<Customer Name>" to select customer for the seat
    Then I Should get back to the Order Screen
    Then I should see the Ordering Screen with a button with the label "<label>"
    Then I should see customer as "<Customer_Name>" added on order screen
    And I click Add Customer Button
    And I click remove button
    And I click on the cross buttin in the customer profile screen


 #Select an existing customer for a To Go order
    And I click service type button in order screen
    And I select the TOGO order type
    And I click Add Customer Button
    And I search for "<Customer Name>"
    When I click "<Customer Name>" to select customer for the seat
    Then I Should get back to the Order Screen
    Then I should see the Ordering Screen with a button with the label "<label1>"
    Then I should see customer as "<Customer_Name>" added on order screen
    And I click Add Customer Button
    And I click remove button
    And I click on the cross buttin in the customer profile screen

  #Scenario Outline:Select an existing customer for a Delivery order
    And I click service type button in order screen
    And I select the DELIVERY order type
    And I search for "<Customer Name>"
    When I click "<Customer Name>" to select customer for the seat
    When I click the Save button
    Then I Should get back to the Order Screen
    Then I should see the Ordering Screen with a button with the label "<label2>"
#        Then I should see customer as "<Customer_Name>" added on order screen
    And I click Add Customer Button
    And I click remove button
    Then I should see cannot remove customer for delivery popup
    And I click Done button on the Popup
    And I click on the cross buttin in the customer profile screen
    And I click Yes button on driver is offline popup


  #Scenario Outline:Select an existing customer for a Phone To Go order
    And I click service type button in order screen
    And I select the Phone To Go order type
    And I click Add Customer Button
    And I click remove button
    And I click on the cross buttin in the customer profile screen
    And I click service type button in order screen
    And I select the Phone To Go order type
    And I click Add Customer Button
    And I search for "<Customer Name>"
    When I click "<Customer Name>" to select customer for the seat
    Then I Should get back to the Order Screen
    Then I should see the Ordering Screen with a button with the label "<label3>"
    Then I should see customer as "<Customer_Name>" added on order screen
    And I click Add Customer Button
    And I click remove button
    And I click on the cross buttin in the customer profile screen


  #Select an existing customer for a Phone Delivery order
    And I click service type button in order screen
    And I select the Phone Delivery order type
    And I search for "<Customer Name>"
    When I click "<Customer Name>" to select customer for the seat
    When I click the Save button
    Then I should see the Ordering Screen with a button with the label "<label4>"
    Then I should see customer as "<Customer_Name>" added on order screen
    And I click Add Customer Button
    And I click remove button
    Then I should see cannot remove customer for delivery popup
    And I click Done button on the Popup
    And I click on the cross buttin in the customer profile screen
    And I click Yes button on driver is offline popup
    And I click service type button in order screen
    And I select service type as qsr

 # Verify whether application display recently added customer in Walkin+/Customer profile search on IPad
    And I click Add Customer Button
    And I search for "<Customer Name>"
    When I click "<Customer Name>" to select customer for the seat
    Then I Should get back to the Order Screen
    Then I should see customer as "<Customer_Name>" added on order screen
    And I click Add Customer Button
    And I click remove button
    And I click on the cross buttin in the customer profile screen
    And I click log off button in order screen


#  Verify whether application allow to edit the newly added customer in Ipad without billing
#        And I click Add Customer Button
#        And I click Add new button
#        And I enter first name as "<customer_name1>"
#        And I enter last name as "<customer_name2>"
#        And I enter mobile number as "<number>"
#        And I enter e-mail as "<string>" in customer profile
#        And I click the Save button
#        Then I Should get back to the Order Screen
#        And I click sync button on the Order screen
#        And I click All
#        And I click power button

    Examples:
      |customer_name1|customer_name2|number    |string           | title         | Customer Name | Customer_Name |label    | label1 |  label2 | label3 | label4 |
      | auto          |number1      |9786001   |appium12@mail.com|Customer Profile | Auto ragav  |Auto r         |FORHERE | TOGO  | DELIVERY | TOGO | DELIVERY |

#  @SmokeTest

  Scenario Outline: Select an existing customer for a FORHERE order
    And I closed the order type window
    Then User click QSR on Menu Item page
    When User select ForHere order option
    And I click Add Customer Button
    And I click the search field in customer tab "1234567890" "search customer"
    And I click the customer name in the list "1234567890"
#        And I click on the save button in the customer field "Save Button Clicked"
#    And I click on the save button in the customer field "Save Button Clicked"
    And I click Finish button
    And I select order type as "QSR" in phoneorderscreen
    And I closed the order type window
    Then User click QSR on Menu Item page
    And I select the TOGO order type
    And I click Add Customer Button
    And I click the search field in customer tab "1234567890" "search customer"
    And I click the customer name in the list "1234567890"
#        And I click on the save button in the customer field "Save Button Clicked"
#    And I click the "CustomerProfile Close" in the customer profile page "click close button"
#    And I click on the save button in the customer field "Save Button Clicked"
#    And I click the "CustomerProfile Close" in the customer profile page "click close button"
#        And I click service type button in order screen
    And I click Finish button
    And I select order type as "QSR" in phoneorderscreen
    And I closed the order type window
    Then User click QSR on Menu Item page
    And I select the Phone To Go order type
    And I click Add Customer Button
    And I click the search field in customer tab "1234567890" "search customer"
    And I click the customer name in the list "1234567890"
#        And I click on the save button in the customer field "Save Button Clicked"
#    And I click on the save button in the customer field "Save Button Clicked"
#        And I click service type button in order screen
    And I click Finish button
    And I select order type as "QSR" in phoneorderscreen
    And I closed the order type window
    Then User click QSR on Menu Item page
    And I select the DELIVERY order type
    And I search for "<customer_name>"
    When I click "<customer_name>" to select customer for the seat
    When I click the Save button
#    And I click "Yes" in the close the day Popup window "click yes button"
#    And I click on the save button in the customer field "Save Button Clicked"
#    When User click "<btnDelivery>" on Menu Item page "click To Go button"
    And I click Finish button
    And I select order type as "QSR" in phoneorderscreen
    And I closed the order type window
    Then User click QSR on Menu Item page
    And I select the Phone Delivery order type
    And I search for "<customer_name>"
    When I click "<customer_name>" to select customer for the seat
    When I click the Save button
#    And I click "Yes" in the close the day Popup window "click yes button"
    And I click Finish button
    And I select order type as "QSR" in phoneorderscreen
    And I closed the order type window
    And I click log off button in order screen

    Examples:
      |btnToGo|btnDelivery|btnFinish|btnQsr|btnCancel|btnLogOff|customer_name|btnPhoneToGo|btnPhoneDelivery|
      |To Go |Delivery |finish      |QSR   |Cancel   |logOff   |thomas a       |Phone To Go |Phone Delivery  |


  Scenario Outline: Application allow user to save after entering first-last name without mobile number/E-mail
    # Application allow user to save after entering first-last name without mobile number/E-mail
    #Application allow user to save after entering first-last name and mobile number/E-mail
    #Application allow user to save after entering the first name, last name and E-mail in customer profile
    #Application allow user to save after entering the first name, last name and Mobile Phone in customer profile
    And I closed the order type window
    And I click Add Customer Button
    Then I should see the add customer screen in the window
    And I Click on the Byname Option
    And Enter some name and click on Add Customer button
    Then I should see the customer profile window
    Then User enter customer first name
    And User enter customer last name
    When User click add button for phone number
    Then User click close button for add customer mobile phone
    When User click the Save button
#    And I click the "CustomerProfile Close" in the customer profile page "click close button"
    Then User verify mobile number and email popup
    And I click Done button on the Popup
    And  User click add button for phone number
    And User enter phone number
#        And User click customer profile save button
    And User enter customer email address "<email>"
#        And I click "<Back>" button in the keyboard "Click Back"
#    When User click the Save button
    When User click the Save button
    Then User verify new customer
    And I click log off button in order screen

    Examples:
      |btnLogOff |Back          |email    |
      |logOff    |Hide keyboard |@gmail.com|


  Scenario Outline: Application is not displaying the Customer address in the drop down list it shows as empty in the following scenario
    #Application allow to remove existing customer in order screen
    And I closed the order type window
    And I click Add Customer Button
    And I search for "thomas a"
    When I click "thomas a" to select customer for the seat
    And I click Add Customer Button
    And I click remove button
    And I click on the cross buttin in the customer profile screen
    #Application is not displaying the Customer address in the drop down list it shows as empty in the following scenario
    And I click Add Customer Button
    Then I should see the add customer screen in the window
    And I Click on the Byname Option
    And Enter some name and click on Add Customer button
    Then I should see the customer profile window
    Then User click customer address dropdown list
#        And User verify empty customer address dropdown list
    And I click the "<btnClose>" in the customer profile page "click close button"
    #Application allow user able to to edit the customer
    And I click Add Customer Button
    And I search for "<customerName1>"
    When I click "<customerName1>" to select customer for the seat
    And I click the customer name on the order screen
    And I click Yes button on the popup for Hold item
    And User click selected first customer
    When User edit customer first name
    Then User verify edited customer on menu item page
    And I click log off button in order screen

    Examples:
      |btnClose                |btnLogOff|customerName1   |
      |CustomerProfile Close   |logOff   |Test Automation |


  Scenario Outline: Application allow to remove the new customer in the order screen
    And I closed the order type window
    And I click Add Customer Button
    Then I should see the add customer screen in the window
    And I Click on the Byname Option
    And Enter some name and click on Add Customer button
    Then I should see the customer profile window
    Then User enter customer first name
    And User enter customer last name
    When User click add button for phone number
    Then User click close button for add customer mobile phone
    When User click the Save button
#    And I click the "CustomerProfile Close" in the customer profile page "click close button"
    Then User verify mobile number and email popup
    And I click Done button on the Popup
    And  User click add button for phone number
    And User enter phone number
#        And User click customer profile save button
    And User enter customer email address "<email>"
#        And I click "<Back>" button in the keyboard "Click Back"
#    When User click the Save button
    When User click the Save button
    Then User verify new customer
    And I click Add Customer Button
    And I click remove button
    And I click on the cross buttin in the customer profile screen
    And User verify no customer on menu item page
    And I click log off button in order screen

    Examples:
      |email     |Back          |btnLogOff|
      |@gmail.com|Hide keyboard |logOff   |


  #(save button is not propery using accessibiblity id)
  Scenario Outline: Create House Account for New Customers ----
    And I closed the order type window
    And I click Add Customer Button
    Then I should see the add customer screen in the window
    And I Click on the Byname Option
    And Enter some name and click on Add Customer button
    Then I should see the customer profile window
    Then User enter customer first name
    And User enter customer last name
    When User click add button for phone number
    And I enter the number as "<Number>"
#    When User click the Save button
    Then I click on the save field in the phone number "Save Button Clicked"
    And User enter customer email address "<email>"
#        And I click "<Back>" button in the keyboard "Click Back"
    When User click the Save button
    Then User verify new customer for House Account
    And User click new customer which is created for House Account
    When User click Customer Plan button
    When User enter house account card number "<number>"
    Then User enter recharge amount for House Account
    And I enter the percentage in Ha screen as "<pin2>","<pin2>","<pin00>","<pin00>"
    And I click the Continue button
    And User open Limit toggle if it is closed
    And User enter limit amount for house account
    And I enter the percentage in Ha screen as "<pin2>","<pin2>","<pin00>","<pin00>"
    And I click "<btnContinue>" in the percentage apply screen "Click Continue"
    And User click the Save button for house account
    And I click Void button on order management screen
    And I click void Reason on the void popup
    And I click Add Button on the void reason popup
#        And I click the "<btnDone>" in the popup screen"click done button"
    And I closed the order type window
    #Create House Account for Existing Customers  ----
    #Recharge House Account for Existing Customers  ----
#    When I click the customer name on the order screen
#    And I enter the customer name as "<customerName>" in the notes field "Enter customer name"
#    And User enter customer name for bar tab
    And I click Add Customer Button
    And I search for "<customerName>"
    When I click "<customerName>" to select customer for the seat
    When I click the customer name on the order screen
    Then I should see the customer profile window
    When User click Customer Plan button
    Then User enter recharge amount for House Account
    And I enter the percentage in Ha screen as "<pin1>","<pin2>","<pin00>","<pin00>"
    And I click "<btnContinue>" in the percentage apply screen "Click Continue"
    When I click update button
    #And User verify recharged amount on House Account
    # Void House Account Payment Check and again Add Menu Item & Payment through House Account  ----
    And I click Void button on order management screen
    And I click void Reason on the void popup
    And I click Add Button on the void reason popup
#        And I click the "<btnDone>" in the popup screen"click done button"
    And I closed the order type window
    And I click log off button in order screen

    Examples:
      |btnUpdate|btnCustomerPlan |email|Number |Back        |number|pin1|pin00|btnContinue|pin2|btnVoid |btnWrong        |customerName|tabCustomer|btnAdd |btnDone|btnCancel|btnLogOff |
      |Update |Customer Plan  |@gmail.com|98|Hide keyboard |12  |1  |00   |Continue   |2   |Void     |Wrong Item Ordered |goknur bati  |New Customer |Add|Done |Cancel   |logOff    |


