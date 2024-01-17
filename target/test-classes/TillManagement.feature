
Feature: Till management operations


  Scenario Outline: Displaying the Open Till window
    Given I'm logged in
    And I close the order type window
    And I click the Settings button
    And I click till management button from the operation window
    When I verify till is available or not if available closed the till
    Then I should see the Open Till Window with title "<title>"
    And I click power button1
  #Scenario Outline: Opening a till
    Given I'm displaying Open Till window
    And I press first number of the total
    And I press second number of the total
    And I press third number of the total
    When I press Continue
    When I verify till is available or not if available closed the till
#    And I click cancel button in open till popup
#    Then I should see the active till with the Active Till list opened by user "<user_name>" and till balance of "<till_balance>"
    #And I click power button

 # Scenario Outline: Pay In
  #  Given I'm displaying Till Management screen
    And I press Pay In tab
    And I enter Paid By as "<paid_by>"
#    And I hide the keyboard
    And I enter first number of the payment
    And I enter second number of the payment
    And I enter third number of the payment
    And I click Continue
    And I should see the Reasons window with title "<title1>"
    And I select the pay in reason as Paid In
    When I click OK button to select the payment reason
#    Then I should see payment successful pop-up with the message "<txtSuccessMsg>" pay in
#    And I click Done button on the Popup
   # And I click power button
  #Scenario Outline: Pay Out
  #  Given I'm displaying Till Management screen
    And I press Pay Out tab
    And I enter Paid To as "<paid_to>"
##    And I hide the keyboard
    And I enter first number of the payment
    And I enter second number of the payment
    And I enter third number of the payment
    And I click Continue
    And I should see the Reasons window with title "<title1>"
    And I select the pay in reason as Paid Out
    When I click OK button to select the payment reason
#    Then I should see pop-up with the message "<txtSuccessMsg1>" for the pay out
#    And I click Done button on the Popup
 #   And I click power button
#  Scenario Outline: Close till
  #  Given I'm displaying Till Management screen
    And I click Till button
    When I verify till is available or not if available closed the till
    And I click the Toggle Icon button
    And I click POS Icon from Toggle
    And I closed the order type window
    And I click All
    And I click Table Layout tab
  #Scenario Outline: Till Management icon on Order Screen
    And I click new check button on the Table layout screen
    And I select table as "<table_no>"
    And I select the number of seats as "<number_of_seats>"
    And I tap Continue to finish selecting the number of seats
    When I click the Settings button
#    Then I should see operation screen
    And I click POS Icon from Toggle
    And I close the order type window
    And I click log off button in order screen

    Examples:
      | title | user_name | till_balance | paid_by | title1 | txtSuccessMsg | paid_to | txtSuccessMsg1 | Closetitle |btnCancel|btnAll | tabTableLayout|table_no | number_of_seats |
      | OPEN TILL | CIG | TL 100,00 | KamilT | Reasons | Paid In Successfully | KamilT | Paid Out Successfully | Close Till |Cancel|All|Table Layout | T23       |1              |

  @Tillmanagement01s
  Scenario Outline: Application Set Till(User/Global) -- Enable User Global
    Given I'm logged in
    And I close the order type window
    And I click the Settings button
    And I click till management button from the operation window
#    Then User select last active till if exist First
    When I verify till is available or not if available closed the till
#    And I click cancel button in open till popup
    Then User click Set Till button
    When User verify Open Till page
    Then User enter till amount
    And User verify last active till
#  Scenario: Application Set Till(User/Global) -- Disable User Global
    Then User select last active till if exist
    When User click Set Till button
    Then User close user global if enable
    When User verify Open Till page
    Then User enter till amount
    Then User verify last active till
#  Scenario: Set Till(User/Global)
    Then User select last active till if exist
    Then User click Set Till button
    When User verify Open Till page
    Then User open global till option if disable
    When User enter till amount
    And User verify last active till
#  Scenario: Paid in amount should get added to the Till with Enable Auto Global/USER Till in IPAD
    Then User select last active till if exist
    Then User click Set Till button
    When User verify Open Till page
    Then User open global till option if disable
    When User enter till amount
    Then User verify last active till
#  Scenario: Paid in amount should get added to the Till - Till Management-->Paid In
    Then User select last active till if exist
    Then User click Set Till button
    Then User open global till option if disable
    When User enter till amount
    And User verify last active till
    Then User click Pay In tab
    When User enter Paid By
    And I enter first number of the payment
    And I enter second number of the payment
#    And I enter third number of the payment
    And I click Continue
    And User select Paid Reason
    When I click OK button to select the payment reason
#    And User verify paid in successfull popup info
#  Scenario: Paid in amount should get added to the Till - Till Management --> Paid Out
    Then User click Pay Out tab
    When User enter Paid To
    Then User enter paid out amount
    When User select Paid Out Reason
#    Then User verify paid out successfull popup info
    And I click the Toggle Icon button
    And I click the POS settings from Toggle
    And I click cash drop from Till settings
    And I click the Toggle Icon button
    When User select POS Settings tab
#    Then User open ask customer name option if disable in void screen
    Then User open Enable Cash Drop option if disable
    And I click the Toggle Icon button
#  Scenario: Application should allow the user to complete a sale with cash drop
    And I click POS Icon from Toggle
    And I close the order type window
    When User take an order as "SANDWICHES"
    Then User click Cash Tab on Menu Item Page
    When User click exact option
    Then User click enter button
    And User click cash amount exceed amount popoup
    And User enter cash drop amount for Sandwiches
#    And User verify cash drop successful popup
    And User click cancel button
    When User click setting icon
    Then User verify setting options
    When User select POS Settings tab
    And I click the Toggle Icon button
    And I click POS Icon from Toggle
#    Then User close Enable Cash Drop option if enable
#    And I click the Toggle Icon button
#    When User select POS Settings tab
#    Then User close Enable Cash Drop option if enable
#    And I click the "POS" button for navigating to the pos screen "click pos button"
    And User click cancel button
    When USer click log off button

    Examples:
      | btnToggle |
      | ToggleIcon |


