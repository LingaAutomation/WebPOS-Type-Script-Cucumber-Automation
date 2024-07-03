@Transfer22
Feature: Sync Testing


  Scenario: Merge With Direct Menu
    And I move the cursor to the first
    Given I'm logged in for sync1
     And I close the order type window1
    And I click All button in order screen1
    And I click Table Layout Button1
    And I move the cursor to the second
    Given I'm logged in for sync2
    And I close the order type window2
    And I click All button in order screen2
    And I click Table Layout Button2
    And I click Check Stats tab2
    And I move the cursor to the first
    And I do merge for Sync as "CIMiniFood"
     And I click power
    And I move the cursor to the second
    And I click power1


  Scenario: Merge With Randomw Menu
    And I move the cursor to the first
    Given I'm logged in for sync1
    And I close the order type window1
    And I click All button in order screen1
    And I click Table Layout Button1
    And I move the cursor to the second
    Given I'm logged in for sync2
    And I close the order type window2
    And I click All button in order screen2
    And I click Table Layout Button2
    And I click Check Stats tab2
    And I move the cursor to the first
    And I do merge for Sync1 as "North Indian dish"
    And I click power
    And I move the cursor to the second
    And I click power1


  Scenario: Split with Direct Menu
    And I move the cursor to the first
    Given I'm logged in for sync1
    And I close the order type window1
    And I click All button in order screen1
    And I click Table Layout Button1
    And I move the cursor to the second
    Given I'm logged in for sync2
    And I close the order type window2
    And I click All button in order screen2
    And I click Table Layout Button2

    And I move the cursor to the first
#    And I do split for Sync as "CIMiniFood"
    And I do Split group for sync as "CIMiniFood"
    And I click power
    And I move the cursor to the second
    And I click power1


  Scenario: Split With Random Menu
    And I move the cursor to the first
    Given I'm logged in for sync1
    And I close the order type window1
    And I click All button in order screen1
    And I click Table Layout Button1
    And I move the cursor to the second
    Given I'm logged in for sync2
    And I close the order type window2
    And I click All button in order screen2
    And I click Table Layout Button2

    And I move the cursor to the first
#    And I do split for Sync as for Random Menu "IceCreams"
    And I do Split group for sync Random menu of "North Indian dish"
    And I click power
    And I move the cursor to the second
    And I click power1


  Scenario: LIN-22847 - Deleted seats & newly added menu items are not get updating after split
    And I move the cursor to the first
    Given I'm logged in for sync1
    And I close the order type window1
    And I click All button in order screen1
    And I click Table Layout Button1
    And I move the cursor to the second
    Given I'm logged in for sync2
    And I close the order type window2
    And I click All button in order screen2
    And I click Table Layout Button2
    And I move the cursor to the first
    When I delete the multiple seats for Sync of "North Indian dish"
    And I click power
    And I move the cursor to the second
    And I click power1


  Scenario: open the Phone order check got "You need to order before paying" popup
    And I move the cursor to the first
    Given I'm logged in for sync1
    And I close the order type window1
    And I click All button in order screen1
    And I click Table Layout Button1
    And I move the cursor to the second
    Given I'm logged in for sync2
    And I close the order type window2
    And I click All button in order screen2
    And I click Table Layout Button2
    And I move the cursor to the first
    And I click phone order tab
    When I verify should not show the you need to order before paying popup
    And I click power
    And I move the cursor to the second
    And I click power1



  Scenario: Paid amount not displaying/missing in the seat wise payment

    And I move the cursor to the first
    Given I'm logged in for sync1
    And I close the order type window1
    And I click All button in order screen1
    And I click Table Layout Button1
    And I move the cursor to the second
    Given I'm logged in for sync2
    And I close the order type window2
    And I click All button in order screen2
    And I click Table Layout Button2
    And I move the cursor to the first
    When I verify paid amount displaying seat wise "North Indian dish"
    And I click power
    And I move the cursor to the second
    And I click power1


  Scenario: Selected item not getting repeated while choose repeat option
    And I move the cursor to the first
    Given I'm logged in for sync1
    And I close the order type window1
    And I click All button in order screen1
    And I click Table Layout Button1
    And I move the cursor to the second
    Given I'm logged in for sync2
    And I close the order type window2
    And I click All button in order screen2
    And I click Table Layout Button2
    And I move the cursor to the first
    When I selected item not getting repeated while choose repeat option "North Indian dish"
    And I click power1
    And I move the cursor to the first
    And I click power

  @Transfer1
  Scenario: Transfer
    And I move the cursor to the first
    Given I'm logged in for sync1
    And I close the order type window1
    And I click All button in order screen1
    And I click Table Layout Button1
    And I move the cursor to the second
    Given I'm logged in for sync2
    And I close the order type window2
    And I click All button in order screen2
    And I click Table Layout Button2
    And I move the cursor to the first
    And I do the transfer Item for Random menu from the category "North Indian dish"
    And I click power1
    And I move the cursor to the first
    And I click power

