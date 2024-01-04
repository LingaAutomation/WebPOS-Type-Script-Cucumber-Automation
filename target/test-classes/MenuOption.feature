@MenuOption
Feature: Menu Option In scenarios

  Background:
    Given I'm logged in
    And I closed the order type window
    And I click All
    And I click Table Layout tab


  Scenario Outline: Upcharge Reopen Check
    And I click new check button on the Table layout screen
    And I select table as "<table_no>"
    And I select the number of seats as "<number_of_seats>"
    And I tap Continue to finish selecting the number of seats
    And I get check number
    And I select FOOD as category
    And I select menu item as "<Menu_Item>"
    And I select modifier as "<Modifier>"
    And I click Done to get back
    Then I should see menu with Upcharge amount on order list as "<amount>"
    And I click Payment button in the Order Management Screen
    And I click cash button from the payment method popup
    And I click Submit button on the Payment Window
   # Then I should see the print or send receipt
   # And I click No thanks Button on the print receipt
    Then I should get back to the Table Layout tab
    And I click Check Stats tab
    And I click Closed tab on the Check stats
    And I click the Closed check on check stats
    And I click reopen check button on the check stats screen
    Then I Should get back to the Order Screen
    Then I should see menu with Upcharge amount on order list as "<amount>"
    And I click Payment button in the Order Management Screen
    And I click Submit button on the Payment Window
    # Then I should see the print or send receipt
   # And I click No thanks Button on the print receipt
    Then I should get back to the Table Layout tab
    And I click power button
    Examples:
      | table_no | number_of_seats | Menu_Item          | Modifier     | amount   |
      | T15      |1                |  Fried Crab Cakes  | White Bread  |$ 18.50   |


  Scenario Outline: Void open item - Reopen check
    And I click new check button on the Table layout screen
    And I select table as "<table_no>"
    And I select the number of seats as "<number_of_seats>"
    And I tap Continue to finish selecting the number of seats
    And I get check number
    And I click Options button
    And I click Open Item button
    Then I should see open item screen
    And I click Coursing Name text field
    And I swipe to "<course_name>" as Coursing Name
    And I enter course name as "<open_Item>"
    And I tap Price text field
    And I enter the percentage1 as "10000"
#    And I enter the price
#    And I click Continue button on the Open Item Price numbers popup
    And I select the Tax
    And I click Done button on the open item window
#    When I click Back button on Check Options Screen
    Then I should navigate to Order Management screen and see the added open item1 as "<open_Item>"
    And I click Payment button in the Order Management Screen
    And I click cash button from the payment method popup
    And I click Submit button on the Payment Window
    # Then I should see the print or send receipt
   # And I click No thanks Button on the print receipt
    Then I should get back to the Table Layout tab
    And I click Check Stats tab
    And I click Closed tab on the Check stats
    And I click the Closed check on check stats
    And I click reopen check button on the check stats screen
    Then I Should get back to the Order Screen
    And I click Void button on order management screen
    Then I should see payment made on this check popup message
    And I click Done button on the Popup
    And I click payment in the payment window
    And I click Delete button on the payment window
#    And I click Ok button in receipt printer popup
    And I click the Exit button in the payment window
    And I click Void button on order management screen
    Then I should see the void reason popup
    And I click void Reason on the void popup
    And I click Add Button on the void reason popup
#    Then I should see Receipt Printer popup
#    And I click Done button on the Popup
    Then I should get back to the Table Layout tab
    And I click power button
    Examples:
      | table_no | number_of_seats |  course_name |open_Item     |
      | T8       |1                |  DESSERT     |Tiramisu      |


  Scenario Outline: Menu Option - Hold, Fire, Repeat, Quantity, Attach, Togo, Deselected from an Item
    And I click new check button on the Table layout screen
    And I select table as "<table_no>"
    And I select the number of seats as "<number_of_seats>"
    And I tap Continue to finish selecting the number of seats
    And I select FOOD as category
    And I select menu item as "<Menu_Item>"
    And I select modifier as "<Modifier>"
    And I click Done to get back
    And I click menu item as "<Menu_Item>" to see Menu option screen
    And I click Hold to put order on hold
    And I click Done in the hold window
    Then I should see the hold icon over the order section
    And I click Cash button for Complete Sale
    And I click Exact button on the cash pop-up
    And I click Enter Button on the cash pop-up
    Then I should see do you want to send hold menu items to kitchen popup message2
    And I click Yes button on send to kitchen popup
    # Then I should see the print or send receipt
   # And I click No thanks Button on the print receipt
    Then I should get back to the Table Layout tab
  #  And I click power button
   # Examples:
    #  | table_no | number_of_seats | Menu_Item | Modifier |
     # | T7      |1              |  French Friese | Steak  |

  #Scenario Outline: Menu Option - Fire
    And I click new check button on the Table layout screen
    And I select table as "<table_no>"
    And I select the number of seats as "<number_of_seats>"
    And I tap Continue to finish selecting the number of seats
    And I select FOOD as category
    And I select menu item as "<Menu_Item>"
    And I select modifier as "<Modifier>"
    And I click Done to get back
    And I select menu item as "<Menu_Item1>"
    And I click menu item as "<Menu_Item>" to see Menu option screen
    And I click Fire to send menu item to kitchen
    Then I should see Tick mark in the Menu item
    And I click Cash button for Complete Sale
    And I click Exact button on the cash pop-up
    And I click Enter Button on the cash pop-up
    # Then I should see the print or send receipt
   # And I click No thanks Button on the print receipt
    Then I should get back to the Table Layout tab
  #  And I click power button
  #  Examples:
   #   | table_no | number_of_seats | Menu_Item | Modifier | Menu_Item1 |
    #  | T7      |1              |  French Friese| Steak  |  Onion Rings |

 # Scenario Outline: Menu Option - Repeat
    And I click new check button on the Table layout screen
    And I select table as "<table_no>"
    And I select the number of seats as "<number_of_seats>"
    And I tap Continue to finish selecting the number of seats
    And I select FOOD as category
    And I select menu item as "<Menu_Item>"
    And I select modifier as "<Modifier>"
    And I click Done to get back
    And I click menu item as "<Menu_Item>" to see Menu option screen
    And I click Repeat on menu option
    Then I should see Repeated menu item as "<Menu_Item>"
    And I click Cash button for Complete Sale
    And I click Exact button on the cash pop-up
    And I click Enter Button on the cash pop-up
    # Then I should see the print or send receipt
   # And I click No thanks Button on the print receipt
    Then I should get back to the Table Layout tab
  #  And I click power button
   # Examples:
    #  | table_no | number_of_seats | Menu_Item | Modifier |
     # | T7      |1              |  French Friese | Steak  |

 # Scenario Outline: Menu Option - Quantity
    And I click new check button on the Table layout screen
    And I select table as "<table_no>"
    And I select the number of seats as "<number_of_seats>"
    And I tap Continue to finish selecting the number of seats
    And I select FOOD as category
    And I select menu item as "<Menu_Item>"
    And I select modifier as "<Modifier>"
    And I click Done to get back
    And I click menu item as "<Menu_Item>" to see Menu option screen
    And I click Quantity on menu option
    And I click "<quantity>"
    And I click the Continue button
    Then I should see "<quantity>" is Increased
    And I click Cash button for Complete Sale
    And I click Exact button on the cash pop-up
    And I click Enter Button on the cash pop-up
    # Then I should see the print or send receipt
   # And I click No thanks Button on the print receipt
    Then I should get back to the Table Layout tab
  #  And I click power button
  #  Examples:
   #   | table_no | number_of_seats | Menu_Item | Modifier | quantity |
   #   | T7      |1              |  French Friese | Steak  | 2       |

#  Scenario Outline: Menu Option - Attach, Togo,  Deselected from an Item
    And I click new check button on the Table layout screen
    And I select table as "<table_no>"
    And I select the number of seats as "<number_of_seats>"
    And I tap Continue to finish selecting the number of seats
    And I select FOOD as category
    And I select menu item as "<Menu_Item>"
    And I select modifier as "<Modifier>"
    And I click Done to get back
    And I click menu item as "<Menu_Item>" to see Menu option screen
    And I click Attach on menu option
    Then I should see Add Notes popup
    And I click Add notes reason as "<Reason>"
    And I click Add Button on the void reason popup
    Then I should see reason as "<Reason>" on the Order screen
    And I click Cash button for Complete Sale
    And I click Exact button on the cash pop-up
    And I click Enter Button on the cash pop-up
    # Then I should see the print or send receipt
   # And I click No thanks Button on the print receipt
    Then I should get back to the Table Layout tab
  #  And I click power button
  #  Examples:
  #    | table_no | number_of_seats | Menu_Item | Modifier | Reason |
  #    | T7      |1              |  French Friese | Steak  | Spicy |

 # Scenario Outline: Menu Option - Togo,  Deselected from an Item
    And I click new check button on the Table layout screen
    And I select table as "<table_no>"
    And I select the number of seats as "<number_of_seats>"
    And I tap Continue to finish selecting the number of seats
    And I select FOOD as category
    And I select menu item as "<Menu_Item>"
    And I select modifier as "<Modifier>"
    And I click Done to get back
    And I click menu item as "<Menu_Item>" to see Menu option screen
    And I click Togo on menu option
    Then I should see menu item with Togo Logo
    And I click Cash button for Complete Sale
    And I click Exact button on the cash pop-up
    And I click Enter Button on the cash pop-up
    # Then I should see the print or send receipt
   # And I click No thanks Button on the print receipt
    Then I should get back to the Table Layout tab
    #And I click power button
    #Examples:
    #  | table_no | number_of_seats | Menu_Item | Modifier |
    #  | T7      |1              |  French Friese | Steak  |

  #Scenario Outline: Menu Options - Togo, Deselected from an Item
    And I click new check button on the Table layout screen
    And I select table as "<table_no>"
    And I select the number of seats as "<number_of_seats>"
    And I tap Continue to finish selecting the number of seats
    And I select FOOD as category
    And I select menu item as "<Menu_Item>"
    And I select modifier as "<Modifier>"
    And I click Done to get back
    And I click menu item as "<Menu_Item>" to see Menu option screen
    And I click Togo on menu option
    Then I should see menu item with Togo Logo
    And I click menu item as "<Menu_Item>" to see Menu option screen
    And I click Togo on menu option
    Then I should not see menu item with Togo Logo
    And I click Cash button for Complete Sale
    And I click Exact button on the cash pop-up
    And I click Enter Button on the cash pop-up
    # Then I should see the print or send receipt
   # And I click No thanks Button on the print receipt
    Then I should get back to the Table Layout tab
    And I click power button
    Examples:
      | table_no | number_of_seats | Menu_Item | Modifier |  Reason |  quantity |  Menu_Item1 |
      | T12      |1              |  French Friese | Steak  |  Spicy | 2         |Onion Rings |


  Scenario Outline: Menu Options - Open Discount, Remove Open Discount
    And I click new check button on the Table layout screen
    And I select table as "<table_no>"
    And I select the number of seats as "<number_of_seats>"
    And I tap Continue to finish selecting the number of seats
    And I select FOOD as category
    And I select menu item as "<Menu_Item>"
    And I select modifier as "<Modifier>"
    And I click Done to get back
    And I click menu item as "<Menu_Item>" to see Menu option screen
    And I click Open Discount on menu option
    Then I should see Open discount Screen
    And I pass the amount and reason on Open discount
    Then I should see discount applied on order screen
    And I click Cash button for Complete Sale
    And I click Exact button on the cash pop-up
    And I click Enter Button on the cash pop-up
    # Then I should see the print or send receipt
   # And I click No thanks Button on the print receipt
    Then I should get back to the Table Layout tab
  #  And I click power button
   # Examples:
    #  | table_no | number_of_seats | Menu_Item | Modifier |
    #  | T7      |1              |  French Friese | Steak  |

  #Scenario Outline: Menu Options - Remove Open Discount
    And I click new check button on the Table layout screen
    And I select table as "<table_no>"
    And I select the number of seats as "<number_of_seats>"
    And I tap Continue to finish selecting the number of seats
    And I select FOOD as category
    And I select menu item as "<Menu_Item>"
    And I select modifier as "<Modifier>"
    And I click Done to get back
    And I click menu item as "<Menu_Item>" to see Menu option screen
    And I click Open Discount on menu option
    Then I should see Open discount Screen
    And I pass the amount and reason on Open discount
    Then I should see discount applied on order screen
    Then I should verify discount value as "$ 1.00"
    And I click menu item as "<Menu_Item>" to see Menu option screen
    And I click Open Discount on menu option
    And I click Cash button for Complete Sale
    And I click Exact button on the cash pop-up
    And I click Enter Button on the cash pop-up
    # Then I should see the print or send receipt
   # And I click No thanks Button on the print receipt
    Then I should get back to the Table Layout tab
    And I click power button
    Examples:
      | table_no | number_of_seats | Menu_Item      | Modifier |
      | T11      |1                |  French Friese | Steak    |


  Scenario Outline: Menu Option - Open Modifier , Open Modifier not Apply when Sale sent to kitchecn
    And I click new check button on the Table layout screen
    And I select table as "<table_no>"
    And I select the number of seats as "<number_of_seats>"
    And I tap Continue to finish selecting the number of seats
    And I select FOOD as category
    And I select menu item as "<Menu_Item>"
    And I select modifier as "<Modifier>"
    And I click Done to get back
    And I click menu item as "<Menu_Item>" to see Menu option screen
    And I click Open Modifier on menu option
    Then I should see Open modifier Screen
    And I pass the Name as "<Modifier1>" and price on Open Modifier
    Then I should see open modifier as "<Modifier1>" added on open modifiers screen
    And I click Done button on the Open modifiers screen
    Then I should see modifier as "<Modifier1>" applied on order screen
    And I click Cash button for Complete Sale
    And I click Exact button on the cash pop-up
    And I click Enter Button on the cash pop-up
    # Then I should see the print or send receipt
   # And I click No thanks Button on the print receipt
    Then I should get back to the Table Layout tab
   # And I click power button
    #Examples:
     # | table_no | number_of_seats | Menu_Item | Modifier | Modifier1 |
     # | T7      |1              |  French Friese | Steak  | Tomato   |

  #Scenario Outline: Menu Option - Open Modifier not Apply when Sale sent to kitchecn
    And I click new check button on the Table layout screen
    And I select table as "<table_no>"
    And I select the number of seats as "<number_of_seats>"
    And I tap Continue to finish selecting the number of seats
    And I select FOOD as category
    And I select menu item as "<Menu_Item>"
    And I select modifier as "<Modifier>"
    And I click Done to get back
    And I click Order button in the order management screen
    And I click menu item as "<Menu_Item>" to see Menu option screen
    And I click Open Modifier on menu option
    Then I should see Already sent to Kitchen warning pop-up
    And I click Done button on the Popup
    And I click Cash button for Complete Sale
    And I click Exact button on the cash pop-up
    And I click Enter Button on the cash pop-up
    # Then I should see the print or send receipt
   # And I click No thanks Button on the print receipt
    Then I should get back to the Table Layout tab
    And I click power button
    Examples:
      | table_no | number_of_seats | Menu_Item | Modifier | Modifier1 |
      | T10      |1              |  French Friese | Steak  | Tomato    |


  Scenario Outline: Upcharge Items , Additional Modifiers
    And I click new check button on the Table layout screen
    And I select table as "<table_no>"
    And I select the number of seats as "<number_of_seats>"
    And I tap Continue to finish selecting the number of seats
    And I select FOOD as category
    And I select menu item as "<Menu_Item>"
    And I select modifier as "<Modifier>"
    And I click Done to get back
    Then I should see menu with Upcharge amount on order list as "<amount1>"
    And I click Void button on order management screen
    Then I should see All orders are voided
    And I click Done button on the Popup
    And I click All
    And I click Table Layout tab
   # And I click power button
    #Examples:
    #  | table_no | number_of_seats | Menu_Item | Modifier | amount |
     # | T7      |1              |  Fried Crab Cakes  | White Bread  | TL 18,00 |

  #Scenario Outline: Upcharge - Additional Modifiers
    And I click new check button on the Table layout screen
    And I select table as "<table_no>"
    And I select the number of seats as "<number_of_seats>"
    And I tap Continue to finish selecting the number of seats
    And I select FOOD as category
    And I select menu item as "<Menu_Item>"
    And I select modifier as "<Modifier>"
    And I click Done to get back
    Then I should see that OrderScreen with modifiers as "<Modifier>"
    And I select modifier1 as "<Modifier4>"
    And I select modifier as "<Modifier1>"
    And I select modifier as "<Modifier2>"
    And I select modifier as "<Modifier3>"
    And I click Done to get back
    Then I should see that OrderScreen with modifiers as "<Modifier3>"
    Then I should see menu with Upcharge amount on order list as "<amount>"
    And I click Void button on order management screen
    Then I should see All orders are voided
    And I click Done button on the Popup
    And I click All
    And I click Table Layout tab
    And I click power button
    Examples:
      | table_no | number_of_seats | Menu_Item         | Modifier     | Modifier1   | Modifier2 | Modifier3 | Modifier4   | amount    | amount1  |
      | T7       |1                |  Fried Crab Cakes |  White Bread | Wheat Bread | RYE BREAD | None      | White Bread | $ 24.50   | $ 18.50  |


  Scenario Outline: Sync icon on Order Screen, Sync icon on Order Screen, should see close the sale popup, Settings icon on Order Screen
    And I click new check button on the Table layout screen
    And I select table as "<table_no>"
    And I select the number of seats as "<number_of_seats>"
    And I tap Continue to finish selecting the number of seats
    And I click sync button on the Order screen
    And I click All
    And I click Table Layout tab
    #And I click power button
    #Examples:
    #  | table_no | number_of_seats |
    #  | T7       |1              |

  #Scenario Outline: Sync icon on Order Screen, should see close the sale popup, Settings icon on Order Screen
    And I click new check button on the Table layout screen
    And I select table as "<table_no>"
    And I select the number of seats as "<number_of_seats>"
    And I tap Continue to finish selecting the number of seats
    And I select FOOD as category
    And I select menu item as "<Menu_Item>"
    And I select modifier as "<Modifier>"
    And I click Done to get back
    And I click Order button in the order management screen
    And I click sync button on the Order screen
    Then I should see Please close the sale to sync the data popup
    And I click Done button on the Popup
    And I click Cash button for Complete Sale
    And I click Exact button on the cash pop-up
    And I click Enter Button on the cash pop-up
    # Then I should see the print or send receipt
   # And I click No thanks Button on the print receipt
    Then I should get back to the Table Layout tab
    And I click Table Layout tab
  #  And I click power button


 # Scenario Outline: Settings icon on Order Screen
    And I click new check button on the Table layout screen
    And I select table as "<table_no>"
    And I select the number of seats as "<number_of_seats>"
    And I tap Continue to finish selecting the number of seats
    And I click the Settings button
    Then I should see operation screen
    And I click POS Icon from Toggle
    And I closed the order type window
    And I click All
    And I click Table Layout tab
    And I click power button

    Examples:
      | table_no | number_of_seats | Menu_Item      | Modifier |
      | T8       |1                | French Friese  | Steak    |


  Scenario Outline: Menu Option - Open Item,  void open item - Check should void, Open Item - Void Item, Void Item After Order
    And I click new check button on the Table layout screen
    And I select table as "<table_no>"
    And I select the number of seats as "<number_of_seats>"
    And I tap Continue to finish selecting the number of seats
    Then I Should get back to the Order Screen
    And I click Options button
    And I click Open Item button
    Then I should see open item screen
    And I click Coursing Name text field
    And I swipe to "<course_name>" as Coursing Name
    And I enter course name as "<open_Item>"
    And I tap Price text field
    And I enter the price
    And I click Continue button on the Open Item Price numbers popup
    And I select the Tax
    And I click Done button on the open item window
#    When I click Back button on Check Options Screen
    Then I should navigate to Order Management screen and see the added open item1 as "<open_Item>"
    And I click Void button on order management screen
    Then I should see All orders are voided
    And I click Done button on the Popup
    And I click All
    And I click Table Layout tab
  #  And I click power button
   # Examples:
    #  | table_no | number_of_seats | course_name |open_Item |
    #  | T7     |1              | DESSERT    |Tiramisu      |

  #Scenario Outline: void open item - Check should void, Open Item - Void Item, Void Item After Order
    And I click new check button on the Table layout screen
    And I select table as "<table_no>"
    And I select the number of seats as "<number_of_seats>"
    And I tap Continue to finish selecting the number of seats
    And I click Options button
    And I click Open Item button
    Then I should see open item screen
    And I click Coursing Name text field
    And I swipe to "<course_name>" as Coursing Name
    And I enter course name as "<open_Item>"
    And I tap Price text field
    And I enter the price
    And I click Continue button on the Open Item Price numbers popup
    And I select the Tax
    And I click Done button on the open item window
#    When I click Back button on Check Options Screen
    Then I should navigate to Order Management screen and see the added open item1 as "<open_Item>"
    And I click Payment button in the Order Management Screen
    And I click cash button from the payment method popup
    And I click the Exit button in the payment window
    Then I should see Tick mark in the Menu item
    And I click Void button on order management screen
    Then I should see payment made on this check popup message
    And I click Done button on the Popup
    And I click payment in the payment window
    And I click Delete button on the payment window
#    And I click Ok button in receipt printer popup
    And I click Exit to return to Order Management Screen
    And I click Void button on order management screen
    Then I should see the void reason popup
    And I click void Reason on the void popup
    And I click Add Button on the void reason popup
#    Then I should see Receipt Printer popup
#    And I click Done button on the Popup
    Then I should get back to the Table Layout tab
  #  And I click power button
   # Examples:
    #  | table_no | number_of_seats | course_name |open_Item |
     # | T7     |1              |  DESSERT    |Tiramisu      |

#  Scenario Outline: Open Item - Void Item, Void Item After Order
    And I click new check button on the Table layout screen
    And I select table as "<table_no>"
    And I select the number of seats as "<number_of_seats>"
    And I tap Continue to finish selecting the number of seats
    And I click Options button
    And I click Open Item button
    Then I should see open item screen
    And I click Coursing Name text field
    And I swipe to "<course_name>" as Coursing Name
    And I enter course name as "<open_Item>"
    And I tap Price text field
    And I enter the price
    And I click Continue button on the Open Item Price numbers popup
    And I select the Tax
    And I click Done button on the open item window
#    When I click Back button on Check Options Screen
    Then I should navigate to Order Management screen and see the added open item1 as "<open_Item>"
    And I click Payment button in the Order Management Screen
    And I click cash button from the payment method popup
    And I click the Exit button in the payment window
    Then I should see Tick mark in the Menu item
    And I click Menu item on order screen
    And I click void item on Menu option
    Then I should see payment made on this check popup message
    And I click Done button on the Popup
    And I click payment in the payment window
    And I click Delete button on the payment window
#    And I click Ok button in receipt printer popup
    And I click the Exit button in the payment window
    And I click Void button on order management screen
    Then I should see the void reason popup
    And I click void Reason on the void popup
    And I click Add Button on the void reason popup
#    Then I should see Receipt Printer popup
#    And I click Done button on the Popup
    Then I should get back to the Table Layout tab
  #  And I click power button
   # Examples:
    #  | table_no | number_of_seats | course_name |open_Item |
     # | T7     |1              |   DESSERT    |Tiramisu      |

 # Scenario Outline: Open Item - Void Item After Order
    And I click new check button on the Table layout screen
    And I select table as "<table_no>"
    And I select the number of seats as "<number_of_seats>"
    And I tap Continue to finish selecting the number of seats
    And I click Options button
    And I click Open Item button
    Then I should see open item screen
    And I click Coursing Name text field
    And I swipe to "<course_name>" as Coursing Name
    And I enter course name as "<open_Item>"
    And I tap Price text field
    And I enter the price
    And I click Continue button on the Open Item Price numbers popup
    And I select the Tax
    And I click Done button on the open item window
#    When I click Back button on Check Options Screen
    Then I should navigate to Order Management screen and see the added open item1 as "<open_Item>"
    And I click Order button in the order management screen
    And I click Menu item on order screen
    And I click void item on Menu option
    Then I should see the void reason popup
    And I click void Reason on the void popup
    And I click Add Button on the void reason popup
#    Then I should see Receipt Printer popup
#    And I click Done button on the Popup
    And I click Payment button in the Order Management Screen
    And I click Submit button on the Payment Window
   # Then I should see the print or send receipt
    #And I click No thanks Button on the print receipt
    Then I should get back to the Table Layout tab
    And I click power button
    Examples:
      | table_no | number_of_seats | course_name | open_Item |
      | T7     |1              | DESSERT         | Tiramisu  |


  Scenario Outline: Check with open item discount as amount and safety limit in Whole Value as 20 (After Tax)
    And I click new check button on the Table layout screen
    And I select table as "<table_no>"
    And I select the number of seats as "<number_of_seats>"
    And I tap Continue to finish selecting the number of seats
    And I select Menu as category
    And I select menu item as "<Menu_Item>"
    And I click menu item as "<Menu_Item>" to see Menu option screen
    And I click Open Item button
    Then I should see open item screen
    And I click Coursing Name text field for Menu option
    And I swipe to "<course_name>" as Coursing Name
    And I pass course name as "<open_Item>"
    And I tap Price text field for menu option
    And I enter the price with sale
    And I click Continue button on the Open Item Price numbers popup
    And I click Done button on the open item window
    Then I should navigate to Order Management screen and see the added open item as "<open_Item>"
    And I click open item as "<open_Item>" to see Menu option screen
    And I click Open Discount on menu option
    Then I should see Open discount Screen
    And I pass the amount on open discount for open item discount safety percentage whole value as 20 for "<Discount11>"
    Then I should see discount applied on order screen
    Then I should see orderscreen with menu item prize as "<SubTotal>"
    Then I should see the tax amount reflected to the check as "<Tax>"
    Then I should see the Discount amount reflected to the check as "<Discount>"
    Then I should see orderscreen with menu item Total as "<Total>"
    And I click Cash button for Complete Sale
    And I click Exact button on the cash pop-up
    And I click Enter Button on the cash pop-up
    # Then I should see the print or send receipt
   # And I click No thanks Button on the print receipt
    Then I should get back to the Table Layout tab
  #  And I click power button

 # Scenario Outline: Check with open item discount as amount and safety limit in Decimal Value as 20.50(After Tax)
    And I click new check button on the Table layout screen
    And I select table as "<table_no>"
    And I select the number of seats as "<number_of_seats>"
    And I tap Continue to finish selecting the number of seats
    And I select Menu as category
    And I select menu item as "<Menu_Item>"
    And I click menu item as "<Menu_Item>" to see Menu option screen
    And I click Open Item button
    Then I should see open item screen
    And I click Coursing Name text field for Menu option
    And I swipe to "<course_name>" as Coursing Name
    And I pass course name as "<open_Item>"
    And I tap Price text field for menu option
    And I enter the price with sale
    And I click Continue button on the Open Item Price numbers popup
    And I click Done button on the open item window
    Then I should navigate to Order Management screen and see the added open item as "<open_Item>"
    And I click open item as "<open_Item>" to see Menu option screen
    And I click Open Discount on menu option
    Then I should see Open discount Screen
    And I pass the amount on open discount for open item discount safety percentage decimal value as 20.50 for "<Discount11>"
    Then I should see discount applied on order screen
    Then I should see orderscreen with menu item prize as "<SubTotal1>"
    Then I should see the tax amount reflected to the check as "<Tax1>"
    Then I should see the Discount amount reflected to the check as "<Discount1>"
    Then I should see orderscreen with menu item Total as "<Total1>"
    And I click Cash button for Complete Sale
    And I click Exact button on the cash pop-up
    And I click Enter Button on the cash pop-up
    # Then I should see the print or send receipt
   # And I click No thanks Button on the print receipt
    Then I should get back to the Table Layout tab
 #   And I click power button

 # Scenario Outline: Check with open item discount as Percentage (After Tax)
    And I click new check button on the Table layout screen
    And I select table as "<table_no>"
    And I select the number of seats as "<number_of_seats>"
    And I tap Continue to finish selecting the number of seats
    And I select Menu as category
    And I select menu item as "<Menu_Item>"
    And I click menu item as "<Menu_Item>" to see Menu option screen
    And I click Open Item button
    Then I should see open item screen
    And I click Coursing Name text field for Menu option
    And I swipe to "<course_name>" as Coursing Name
    And I pass course name as "<open_Item>"
    And I tap Price text field for menu option
    And I enter the price with sale
    And I click Continue button on the Open Item Price numbers popup
    And I click Done button on the open item window
    Then I should navigate to Order Management screen and see the added open item as "<open_Item>"
    And I click open item as "<open_Item>" to see Menu option screen
    And I click Open Discount on menu option
    Then I should see Open discount Screen
    And I pass the amount on open discount for open item discount as discount Percentage for "<Discount11>"
    Then I should see discount applied on order screen
    Then I should see orderscreen with menu item prize as "<SubTotal2>"
    Then I should see the tax amount reflected to the check as "<Tax2>"
    Then I should see the Discount amount reflected to the check as "<Discount2>"
    Then I should see orderscreen with menu item Total as "<Total2>"
    And I click Cash button for Complete Sale
    And I click Exact button on the cash pop-up
    And I click Enter Button on the cash pop-up
    # Then I should see the print or send receipt
   # And I click No thanks Button on the print receipt
    Then I should get back to the Table Layout tab
    And I click power button
    Examples:
      |table_no| number_of_seats   |Menu_Item|course_name |open_Item | SubTotal | Tax       | Discount | Total      | Discount11| SubTotal1 | Tax1       | Discount1  | Total1     |  SubTotal2  | Tax2        | Discount2  | Total2     |
      | T12     |1                 |Dosa     | SALAD      |onion     | $ 51.00  | $ 5.10    | $ 20.00  | $ 36.10    | After     | $ 51.00   | $ 5.10     | $ 20.50    | $ 35.60    | $ 51.00     | $ 5.10      | $ 0.50     | $ 55.60    |


  Scenario Outline: Check with open item discount as amount and safety limit in Decimal Value as 20.50(Before Tax)
    And I click new check button on the Table layout screen
    And I select table as "<table_no>"
    And I select the number of seats as "<number_of_seats>"
    And I tap Continue to finish selecting the number of seats
    And I select Menu as category
    And I select menu item as "<Menu_Item>"
    And I click menu item as "<Menu_Item>" to see Menu option screen
    And I click Open Item button
    Then I should see open item screen
    And I click Coursing Name text field for Menu option
    And I swipe to "<course_name>" as Coursing Name
    And I pass course name as "<open_Item>"
    And I tap Price text field for menu option
    And I enter the price with sale
    And I click Continue button on the Open Item Price numbers popup
    And I click Done button on the open item window
    Then I should navigate to Order Management screen and see the added open item as "<open_Item>"
    And I click open item as "<open_Item>" to see Menu option screen
    And I click Open Discount on menu option
    Then I should see Open discount Screen
    And I pass the amount on open discount for open item discount safety percentage decimal value as 20.50 for "<Discount11>"
    Then I should see discount applied on order screen
    Then I should see orderscreen with menu item prize as "<SubTotal>"
    Then I should see the tax amount reflected to the check as "<Tax>"
    Then I should see the Discount amount reflected to the check as "<Discount>"
    Then I should see orderscreen with menu item Total as "<Total>"
    And I click Cash button for Complete Sale
    And I click Exact button on the cash pop-up
    And I click Enter Button on the cash pop-up
    # Then I should see the print or send receipt
   # And I click No thanks Button on the print receipt
    Then I should get back to the Table Layout tab
   # And I click power button

 # Scenario Outline: Check with open item discount as amount and safety limit in Whole Value as 20(Before Tax)
    And I click new check button on the Table layout screen
    And I select table as "<table_no>"
    And I select the number of seats as "<number_of_seats>"
    And I tap Continue to finish selecting the number of seats
    And I select Menu as category
    And I select menu item as "<Menu_Item>"
    And I click menu item as "<Menu_Item>" to see Menu option screen
    And I click Open Item button
    Then I should see open item screen
    And I click Coursing Name text field for Menu option
    And I swipe to "<course_name>" as Coursing Name
    And I pass course name as "<open_Item>"
    And I tap Price text field for menu option
    And I enter the price with sale
    And I click Continue button on the Open Item Price numbers popup
    And I click Done button on the open item window
    Then I should navigate to Order Management screen and see the added open item as "<open_Item>"
    And I click open item as "<open_Item>" to see Menu option screen
    And I click Open Discount on menu option
    Then I should see Open discount Screen
    And I pass the amount on open discount for open item discount safety percentage whole value as 20 for "<Discount11>"
    Then I should see discount applied on order screen
    Then I should see orderscreen with menu item prize as "<SubTotal1>"
    Then I should see the tax amount reflected to the check as "<Tax1>"
    Then I should see the Discount amount reflected to the check as "<Discount1>"
    Then I should see orderscreen with menu item Total as "<Total1>"
    And I click Cash button for Complete Sale
    And I click Exact button on the cash pop-up
    And I click Enter Button on the cash pop-up
    # Then I should see the print or send receipt
   # And I click No thanks Button on the print receipt
    Then I should get back to the Table Layout tab
    #And I click power button

  #Scenario Outline: Check with open item discount as Percentage (Before Tax)
    And I click new check button on the Table layout screen
    And I select table as "<table_no>"
    And I select the number of seats as "<number_of_seats>"
    And I tap Continue to finish selecting the number of seats
    And I select Menu as category
    And I select menu item as "<Menu_Item>"
    And I click menu item as "<Menu_Item>" to see Menu option screen
    And I click Open Item button
    Then I should see open item screen
    And I click Coursing Name text field for Menu option
    And I swipe to "<course_name>" as Coursing Name
    And I pass course name as "<open_Item>"
    And I tap Price text field for menu option
    And I enter the price with sale
    And I click Continue button on the Open Item Price numbers popup
    And I click Done button on the open item window
    Then I should navigate to Order Management screen and see the added open item as "<open_Item>"
    And I click open item as "<open_Item>" to see Menu option screen
    And I click Open Discount on menu option
    Then I should see Open discount Screen
    And I pass the amount on open discount for open item discount as discount Percentage for "<Discount11>"
    Then I should see discount applied on order screen
    Then I should see orderscreen with menu item prize as "<SubTotal2>"
    Then I should see the tax amount reflected to the check as "<Tax2>"
    Then I should see the Discount amount reflected to the check as "<Discount2>"
    Then I should see orderscreen with menu item Total as "<Total2>"
    And I click Cash button for Complete Sale
    And I click Exact button on the cash pop-up
    And I click Enter Button on the cash pop-up
    # Then I should see the print or send receipt
   # And I click No thanks Button on the print receipt
    Then I should get back to the Table Layout tab
    And I click power button
    Examples:
      |table_no| number_of_seats |Menu_Item|course_name |open_Item | SubTotal | Tax       | Discount | Total   | Discount11 |  SubTotal1  | Tax1      | Discount1 | Total1     |SubTotal2 | Tax2        | Discount2   | Total2     |
      | T11     |1               |Dosa     |  SALAD     |onion     | $ 51.00  | $ 3.05    | $ 20.50  | $ 33.55 | Before     | $ 51.00     | $ 3.10    | $ 20.00   | $ 34.10    | $ 51.00  | $ 5.05      | $ 0.50      | $ 55.55    |


#  Scenario Outline: Check Payment through CC with discount(Open item - After tax/Before) as percentage and with tip
#    And I click new check button on the Table layout screen
#    And I select table as "<table_no>"
#    And I select the number of seats as "<number_of_seats>"
#    And I tap Continue to finish selecting the number of seats
#    And I select Menu as category
#    And I select menu item as "<Menu_Item>"
#    And I click menu item as "<Menu_Item>" to see Menu option screen
#    And I click Open Item button
#    Then I should see open item screen
#    And I click Coursing Name text field for Menu option
#    And I swipe to "<course_name>" as Coursing Name
#    And I pass course name as "<open_Item>"
#    And I tap Price text field for menu option
#    And I enter the price with sale
#    And I click Continue button on the Open Item Price numbers popup
#    And I click Done button on the open item window
#    Then I should navigate to Order Management screen and see the added open item as "<open_Item>"
#    And I click open item as "<open_Item>" to see Menu option screen
#    And I click Open Discount on menu option
#    Then I should see Open discount Screen
#    And I pass the amount on open discount for open item discount as discount Percentage for "<Discount11>"
#    Then I should see discount applied on order screen
#    Then I should see orderscreen with menu item prize as "<SubTotal>"
#    Then I should see the tax amount reflected to the check as "<Tax>"
#    Then I should see the Discount amount reflected to the check as "<Discount>"
#    Then I should see orderscreen with menu item Total as "<Total>"
#    And I click Payment button in the Order Management Screen
#    And I click credit card payment on payment window
#  #  Then I should see card type window
#   # And I click visa card type as "<card_type>"
#    #And I click ok button in card type window
#    Then I should see total screen
#    And I click custom for tip adjustment
#    Then I should see tip is added with menu total as "<Total>"
#    Then I should see total amount as "<total>" on total screen
#    And I click the Continue button on the Total screen
#    Then I should see your order card screen
#    Then I should see tip added on order screen
#    And I click manual button on the your order screen
#    And I pass the card number as "<card_number>"
#    And I pass card name as "<card_name>"
#    And I pass expire date as "<expire_date>"
#    And I click Process button on card screen
##    And I click Ok button in receipt printer popup
#   # Then I should see signature pad screen
#    #And I click tick mark button
#    # Then I should see the print or send receipt
#   # And I click No thanks Button on the print receipt
#    # Then I should see the print or send receipt
#   # And I click No thanks Button on the print receipt
#    Then I should get back to the Table Layout tab
#  #  And I click power button
#
# # Scenario Outline:  Check Payment through CC with discount(Open item - After tax/Before) as amount & safety limit as decimal value and with tip
#    And I click new check button on the Table layout screen
#    And I select table as "<table_no>"
#    And I select the number of seats as "<number_of_seats>"
#    And I tap Continue to finish selecting the number of seats
#    And I select Menu as category
#    And I select menu item as "<Menu_Item>"
#    And I click menu item as "<Menu_Item>" to see Menu option screen
#    And I click Open Item button
#    Then I should see open item screen
#    And I click Coursing Name text field for Menu option
#    And I swipe to "<course_name>" as Coursing Name
#    And I pass course name as "<open_Item>"
#    And I tap Price text field for menu option
#    And I enter the price with sale
#    And I click Continue button on the Open Item Price numbers popup
#    And I click Done button on the open item window
#    Then I should navigate to Order Management screen and see the added open item as "<open_Item>"
#    And I click open item as "<open_Item>" to see Menu option screen
#    And I click Open Discount on menu option
#    Then I should see Open discount Screen
#    And I pass the amount on open discount for open item discount safety percentage decimal value as 20.50 for "<Discount11>"
#    Then I should see discount applied on order screen
#    Then I should see orderscreen with menu item prize as "<SubTotal1>"
#    Then I should see the tax amount reflected to the check as "<Tax1>"
#    Then I should see the Discount amount reflected to the check as "<Discount1>"
#    Then I should see orderscreen with menu item Total as "<Total1>"
#    And I click Payment button in the Order Management Screen
#    And I click credit card payment on payment window
#  #  Then I should see card type window
#   # And I click visa card type as "<card_type>"
#    #And I click ok button in card type window
#    Then I should see total screen
#    And I click custom for tip adjustment
#    Then I should see tip is added with menu total as "<Total1>"
#    Then I should see total amount as "<total1>" on total screen
#    And I click the Continue button on the Total screen
#    Then I should see your order card screen
#    Then I should see tip added on order screen
#    And I click manual button on the your order screen
#    And I pass the card number as "<card_number>"
#    And I pass card name as "<card_name>"
#    And I pass expire date as "<expire_date>"
#    And I click Process button on card screen
##    And I click Ok button in receipt printer popup
#   # Then I should see signature pad screen
#   # And I click tick mark button
#    # Then I should see the print or send receipt
#   # And I click No thanks Button on the print receipt
#    # Then I should see the print or send receipt
#   # And I click No thanks Button on the print receipt
#    Then I should get back to the Table Layout tab
#   # And I click power button
#
#
#
# # Scenario Outline: Check Payment through CC with discount(Open item - After tax/Before) as amount & safety limit as non-decimal value and with tip
#    And I click new check button on the Table layout screen
#    And I select table as "<table_no>"
#    And I select the number of seats as "<number_of_seats>"
#    And I tap Continue to finish selecting the number of seats
#    And I select Menu as category
#    And I select menu item as "<Menu_Item>"
#    And I click menu item as "<Menu_Item>" to see Menu option screen
#    And I click Open Item button
#    Then I should see open item screen
#    And I click Coursing Name text field for Menu option
#    And I swipe to "<course_name>" as Coursing Name
#    And I pass course name as "<open_Item>"
#    And I tap Price text field for menu option
#    And I enter the price with sale
#    And I click Continue button on the Open Item Price numbers popup
#    And I click Done button on the open item window
#    Then I should navigate to Order Management screen and see the added open item as "<open_Item>"
#    And I click open item as "<open_Item>" to see Menu option screen
#    And I click Open Discount on menu option
#    Then I should see Open discount Screen
#    And I pass the amount on open discount for open item discount safety percentage whole value as 20 for "<Discount11>"
#    Then I should see discount applied on order screen
#    Then I should see orderscreen with menu item prize as "<SubTotal2>"
#    Then I should see the tax amount reflected to the check as "<Tax2>"
#    Then I should see the Discount amount reflected to the check as "<Discount2>"
#    Then I should see orderscreen with menu item Total as "<Total2>"
#    And I click Payment button in the Order Management Screen
#    And I click credit card payment on payment window
#    #Then I should see card type window
#   # And I click visa card type as "<card_type>"
#    #And I click ok button in card type window
#    Then I should see total screen
#    And I click custom for tip adjustment
#    Then I should see tip is added with menu total as "<Total2>"
#    Then I should see total amount as "<total2>" on total screen
#    And I click the Continue button on the Total screen
#    Then I should see your order card screen
#    Then I should see tip added on order screen
#    And I click manual button on the your order screen
#    And I pass the card number as "<card_number>"
#    And I pass card name as "<card_name>"
#    And I pass expire date as "<expire_date>"
#    And I click Process button on card screen
##    And I click Ok button in receipt printer popup
#    #Then I should see signature pad screen
#    #And I click tick mark button
#    # Then I should see the print or send receipt
#   # And I click No thanks Button on the print receipt
#    # Then I should see the print or send receipt
#   # And I click No thanks Button on the print receipt
#    Then I should get back to the Table Layout tab
#    And I click power button
#
#    Examples:
#      |table_no| number_of_seats |Menu_Item|course_name| open_Item |  SubTotal | Tax       | Discount | Total    | Discount11 |  card_number     | expire_date   | card_name | total     |  SubTotal1 | Tax1       | Discount1 | Total1 |  total1   | SubTotal2  | Tax2        | Discount2  |Total2  | total2     |
#      | T5     |1                |  Dosa   | DESSERT   |  onion    |  $ 51.00  | $ 5.10    | $ 0.50   |$ 55.60   | After      | 3530111333300000 | 1224          | JCB       | $ 65.60   |  $ 51.00   | $ 5.10     | $ 20.50   |$ 35.60 |  $ 45.60  |  $ 51.00   | $ 5.10      | $ 20.00    |$ 36.10 |  $ 46.10   |



  Scenario Outline: Check Payment through Other Payment - Check with open item discount as amount and safety limit in Whole Value as 20 (After Tax)
    And I click new check button on the Table layout screen
    And I select table as "<table_no>"
    And I select the number of seats as "<number_of_seats>"
    And I tap Continue to finish selecting the number of seats
    And I select Menu as category
    And I select menu item as "<Menu_Item>"
    And I click menu item as "<Menu_Item>" to see Menu option screen
    And I click Open Item button
    Then I should see open item screen
    And I click Coursing Name text field for Menu option
    And I swipe to "<course_name>" as Coursing Name
    And I pass course name as "<open_Item>"
    And I tap Price text field for menu option
    And I enter the price with sale
    And I click Continue button on the Open Item Price numbers popup
    And I click Done button on the open item window
    Then I should navigate to Order Management screen and see the added open item as "<open_Item>"
    And I click open item as "<open_Item>" to see Menu option screen
    And I click Open Discount on menu option
    Then I should see Open discount Screen
    And I pass the amount on open discount for open item discount safety percentage whole value as 20 for "<Discount11>"
    Then I should see discount applied on order screen
    Then I should see orderscreen with menu item prize as "<SubTotal>"
    Then I should see the tax amount reflected to the check as "<Tax>"
    Then I should see the Discount amount reflected to the check as "<Discount>"
    Then I should see orderscreen with menu item Total as "<Total>"
    And I click Payment button in the Order Management Screen
#  And I scroll the close the day "Others" "scroll close the day"
    And I click other button from the payment method popup
    And I click Submit button on the Payment Window
    # Then I should see the print or send receipt
   # And I click No thanks Button on the print receipt
    Then I should get back to the Table Layout tab
   # And I click power button

 # Scenario Outline: Check Payment through Other Payment - Check with open item discount as amount and safety limit in Decimal value as 20.50 (After Tax)
    And I click new check button on the Table layout screen
    And I select table as "<table_no>"
    And I select the number of seats as "<number_of_seats>"
    And I tap Continue to finish selecting the number of seats
    And I select Menu as category
    And I select menu item as "<Menu_Item>"
    And I click menu item as "<Menu_Item>" to see Menu option screen
    And I click Open Item button
    Then I should see open item screen
    And I click Coursing Name text field for Menu option
    And I swipe to "<course_name>" as Coursing Name
    And I pass course name as "<open_Item>"
    And I tap Price text field for menu option
    And I enter the price with sale
    And I click Continue button on the Open Item Price numbers popup
    And I click Done button on the open item window
    Then I should navigate to Order Management screen and see the added open item as "<open_Item>"
    And I click open item as "<open_Item>" to see Menu option screen
    And I click Open Discount on menu option
    Then I should see Open discount Screen
    And I pass the amount on open discount for open item discount safety percentage decimal value as 20.50 for "<Discount11>"
    Then I should see discount applied on order screen
    Then I should see orderscreen with menu item prize as "<SubTotal1>"
    Then I should see the tax amount reflected to the check as "<Tax1>"
    Then I should see the Discount amount reflected to the check as "<Discount1>"
    Then I should see orderscreen with menu item Total as "<Total1>"
    And I click Payment button in the Order Management Screen
#    And I scroll the close the day "Others" "scroll close the day"
#    And I scroll the close the day "Others" "scroll close the day"
    And I click other button from the payment method popup
    And I click Submit button on the Payment Window
    # Then I should see the print or send receipt
   # And I click No thanks Button on the print receipt
    Then I should get back to the Table Layout tab
   # And I click power button

 # Scenario Outline:Check Payment through Other Payment - Check with open item discount as Percentage (After Tax)
    And I click new check button on the Table layout screen
    And I select table as "<table_no>"
    And I select the number of seats as "<number_of_seats>"
    And I tap Continue to finish selecting the number of seats
    And I select Menu as category
    And I select menu item as "<Menu_Item>"
    And I click menu item as "<Menu_Item>" to see Menu option screen
    And I click Open Item button
    Then I should see open item screen
    And I click Coursing Name text field for Menu option
    And I swipe to "<course_name>" as Coursing Name
    And I pass course name as "<open_Item>"
    And I tap Price text field for menu option
    And I enter the price with sale
    And I click Continue button on the Open Item Price numbers popup
    And I click Done button on the open item window
    Then I should navigate to Order Management screen and see the added open item as "<open_Item>"
    And I click open item as "<open_Item>" to see Menu option screen
    And I click Open Discount on menu option
    Then I should see Open discount Screen
    And I pass the amount on open discount for open item discount as discount Percentage for "<Discount11>"
    Then I should see discount applied on order screen
    Then I should see orderscreen with menu item prize as "<SubTotal2>"
    Then I should see the tax amount reflected to the check as "<Tax2>"
    Then I should see the Discount amount reflected to the check as "<Discount2>"
    Then I should see orderscreen with menu item Total as "<Total2>"
    And I click Payment button in the Order Management Screen
#    And I scroll the close the day "Others" "scroll close the day"
    And I click other button from the payment method popup
    And I click Submit button on the Payment Window
    # Then I should see the print or send receipt
   # And I click No thanks Button on the print receipt
    Then I should get back to the Table Layout tab
    And I click power button
    Examples:
      |table_no| number_of_seats   |Menu_Item|course_name |open_Item | SubTotal | Tax       | Discount | Total      | Discount11| SubTotal1 | Tax1       | Discount1  | Total1     |  SubTotal2  | Tax2        | Discount2  | Total2     |
      | T13     |1                 |Dosa     | SALAD      |onion     | $ 51.00  | $ 5.10    | $ 20.00  | $ 36.10    | After     | $ 51.00   | $ 5.10     | $ 20.50    | $ 35.60    | $ 51.00     | $ 5.10      | $ 0.50     | $ 55.60    |



  Scenario Outline: Check Payment through Other Payment - Check with open item discount as amount and safety limit in Decimal Value as 20.50(Before Tax)
    And I click new check button on the Table layout screen
    And I select table as "<table_no>"
    And I select the number of seats as "<number_of_seats>"
    And I tap Continue to finish selecting the number of seats
    And I select Menu as category
    And I select menu item as "<Menu_Item>"
    And I click menu item as "<Menu_Item>" to see Menu option screen
    And I click Open Item button
    Then I should see open item screen
    And I click Coursing Name text field for Menu option
    And I swipe to "<course_name>" as Coursing Name
    And I pass course name as "<open_Item>"
    And I tap Price text field for menu option
    And I enter the price with sale
    And I click Continue button on the Open Item Price numbers popup
    And I click Done button on the open item window
    Then I should navigate to Order Management screen and see the added open item as "<open_Item>"
    And I click open item as "<open_Item>" to see Menu option screen
    And I click Open Discount on menu option
    Then I should see Open discount Screen
    And I pass the amount on open discount for open item discount safety percentage decimal value as 20.50 for "<Discount11>"
    Then I should see discount applied on order screen
    Then I should see orderscreen with menu item prize as "<SubTotal>"
    Then I should see the tax amount reflected to the check as "<Tax>"
    Then I should see the Discount amount reflected to the check as "<Discount>"
    Then I should see orderscreen with menu item Total as "<Total>"
    And I click Payment button in the Order Management Screen
#    And I scroll the close the day "Others" "scroll close the day"
    And I click other button from the payment method popup
    And I click Submit button on the Payment Window
    # Then I should see the print or send receipt
   # And I click No thanks Button on the print receipt
    Then I should get back to the Table Layout tab
    #And I click power button

  #Scenario Outline: Check Payment through Other Payment - Check with open item discount as amount and safety limit in Whole Value as 20(Before Tax)
    And I click new check button on the Table layout screen
    And I select table as "<table_no>"
    And I select the number of seats as "<number_of_seats>"
    And I tap Continue to finish selecting the number of seats
    And I select Menu as category
    And I select menu item as "<Menu_Item>"
    And I click menu item as "<Menu_Item>" to see Menu option screen
    And I click Open Item button
    Then I should see open item screen
    And I click Coursing Name text field for Menu option
    And I swipe to "<course_name>" as Coursing Name
    And I pass course name as "<open_Item>"
    And I tap Price text field for menu option
    And I enter the price with sale
    And I click Continue button on the Open Item Price numbers popup
    And I click Done button on the open item window
    Then I should navigate to Order Management screen and see the added open item as "<open_Item>"
    And I click open item as "<open_Item>" to see Menu option screen
    And I click Open Discount on menu option
    Then I should see Open discount Screen
    And I pass the amount on open discount for open item discount safety percentage whole value as 20 for "<Discount11>"
    Then I should see discount applied on order screen
    Then I should see orderscreen with menu item prize as "<SubTotal1>"
    Then I should see the tax amount reflected to the check as "<Tax1>"
    Then I should see the Discount amount reflected to the check as "<Discount1>"
    Then I should see orderscreen with menu item Total as "<Total1>"
    And I click Payment button in the Order Management Screen
#    And I scroll the close the day "Others" "scroll close the day"
    And I click other button from the payment method popup
    And I click Submit button on the Payment Window
    # Then I should see the print or send receipt
   # And I click No thanks Button on the print receipt
    Then I should get back to the Table Layout tab
  #  And I click power button

  #Scenario Outline: Check Payment through Other Payment - Check with open item discount as Percentage (Before Tax)
    And I click new check button on the Table layout screen
    And I select table as "<table_no>"
    And I select the number of seats as "<number_of_seats>"
    And I tap Continue to finish selecting the number of seats
    And I select Menu as category
    And I select menu item as "<Menu_Item>"
    And I click menu item as "<Menu_Item>" to see Menu option screen
    And I click Open Item button
    Then I should see open item screen
    And I click Coursing Name text field for Menu option
    And I swipe to "<course_name>" as Coursing Name
    And I pass course name as "<open_Item>"
    And I tap Price text field for menu option
    And I enter the price with sale
    And I click Continue button on the Open Item Price numbers popup
    And I click Done button on the open item window
    Then I should navigate to Order Management screen and see the added open item as "<open_Item>"
    And I click open item as "<open_Item>" to see Menu option screen
    And I click Open Discount on menu option
    Then I should see Open discount Screen
    And I pass the amount on open discount for open item discount as discount Percentage for "<Discount11>"
    Then I should see discount applied on order screen
    Then I should see orderscreen with menu item prize as "<SubTotal2>"
    Then I should see the tax amount reflected to the check as "<Tax2>"
    Then I should see the Discount amount reflected to the check as "<Discount2>"
    Then I should see orderscreen with menu item Total as "<Total2>"
    And I click Payment button in the Order Management Screen
#    And I scroll the close the day "Others" "scroll close the day"
    And I click other button from the payment method popup
    And I click Submit button on the Payment Window
    # Then I should see the print or send receipt
   # And I click No thanks Button on the print receipt
    Then I should get back to the Table Layout tab
    And I click power button
    Examples:
      |table_no| number_of_seats |Menu_Item|course_name |open_Item | SubTotal | Tax       | Discount | Total   | Discount11 |  SubTotal1  | Tax1      | Discount1 | Total1     |SubTotal2 | Tax2        | Discount2   | Total2     |
      | T8     |1                |Dosa     |  SALAD     |onion     | $ 51.00  | $ 3.05    | $ 20.50  | $ 33.55 | Before     | $ 51.00     | $ 3.10    | $ 20.00   | $ 34.10    | $ 51.00  | $ 5.05      | $ 0.50      | $ 55.55    |


  Scenario Outline: Check Payment through Side CC with discount(Open item - After tax/Before) as percentage and with tip
    And I click new check button on the Table layout screen
    And I select table as "<table_no>"
    And I select the number of seats as "<number_of_seats>"
    And I tap Continue to finish selecting the number of seats
    And I select Menu as category
    And I select menu item as "<Menu_Item>"
    And I click menu item as "<Menu_Item>" to see Menu option screen
    And I click Open Item button
    Then I should see open item screen
    And I click Coursing Name text field for Menu option
    And I swipe to "<course_name>" as Coursing Name
    And I pass course name as "<open_Item>"
    And I tap Price text field for menu option
    And I enter the price with sale
    And I click Continue button on the Open Item Price numbers popup
    And I click Done button on the open item window
    Then I should navigate to Order Management screen and see the added open item as "<open_Item>"
    And I click open item as "<open_Item>" to see Menu option screen
    And I click Open Discount on menu option
    Then I should see Open discount Screen
    And I pass the amount on open discount for open item discount as discount Percentage for "<Discount11>"
    Then I should see discount applied on order screen
    Then I should see orderscreen with menu item prize as "<SubTotal>"
    Then I should see the tax amount reflected to the check as "<Tax>"
    Then I should see the Discount amount reflected to the check as "<Discount>"
    Then I should see orderscreen with menu item Total as "<Total>"
    And I click Payment button in the Order Management Screen
    And I click side cc button in the payment window
  #  Then I should see card type window
   # And I click visa card type as "<card_type>"
    #And I click ok button in card type window
    Then I should see total screen
    And I click custom for tip adjustment
    Then I should see tip is added with menu total as "<Total>"
    Then I should see total amount as "<total>" on total screen
    And I click the Continue button on the Total screen
    Then I should see the Payment window
    And I click Submit button on the Payment Window
    # Then I should see the print or send receipt
   # And I click No thanks Button on the print receipt
    Then I should get back to the Table Layout tab
   # And I click power button

 # Scenario Outline:  Check Payment through side CC with discount(Open item - After tax/Before) as amount & safety limit as decimal value and with tip
    And I click new check button on the Table layout screen
    And I select table as "<table_no>"
    And I select the number of seats as "<number_of_seats>"
    And I tap Continue to finish selecting the number of seats
    And I select Menu as category
    And I select menu item as "<Menu_Item>"
    And I click menu item as "<Menu_Item>" to see Menu option screen
    And I click Open Item button
    Then I should see open item screen
    And I click Coursing Name text field for Menu option
    And I swipe to "<course_name>" as Coursing Name
    And I pass course name as "<open_Item>"
    And I tap Price text field for menu option
    And I enter the price with sale
    And I click Continue button on the Open Item Price numbers popup
    And I click Done button on the open item window
    Then I should navigate to Order Management screen and see the added open item as "<open_Item>"
    And I click open item as "<open_Item>" to see Menu option screen
    And I click Open Discount on menu option
    Then I should see Open discount Screen
    And I pass the amount on open discount for open item discount safety percentage decimal value as 20.50 for "<Discount11>"
    Then I should see discount applied on order screen
    Then I should see orderscreen with menu item prize as "<SubTotal1>"
    Then I should see the tax amount reflected to the check as "<Tax1>"
    Then I should see the Discount amount reflected to the check as "<Discount1>"
    Then I should see orderscreen with menu item Total as "<Total1>"
    And I click Payment button in the Order Management Screen
    And I click side cc button in the payment window
   # Then I should see card type window
    #And I click visa card type as "<card_type>"
    #And I click ok button in card type window
    Then I should see total screen
    And I click custom for tip adjustment
    Then I should see tip is added with menu total as "<Total1>"
    Then I should see total amount as "<total1>" on total screen
    And I click the Continue button on the Total screen
    Then I should see the Payment window
    And I click Submit button on the Payment Window
    # Then I should see the print or send receipt
   # And I click No thanks Button on the print receipt
    Then I should get back to the Table Layout tab
    #And I click power button


 # Scenario Outline: Check Payment through side CC with discount(Open item - After tax/Before) as amount & safety limit as non-decimal value and with tip
    And I click new check button on the Table layout screen
    And I select table as "<table_no>"
    And I select the number of seats as "<number_of_seats>"
    And I tap Continue to finish selecting the number of seats
    And I select Menu as category
    And I select menu item as "<Menu_Item>"
    And I click menu item as "<Menu_Item>" to see Menu option screen
    And I click Open Item button
    Then I should see open item screen
    And I click Coursing Name text field for Menu option
    And I swipe to "<course_name>" as Coursing Name
    And I pass course name as "<open_Item>"
    And I tap Price text field for menu option
    And I enter the price with sale
    And I click Continue button on the Open Item Price numbers popup
    And I click Done button on the open item window
    Then I should navigate to Order Management screen and see the added open item as "<open_Item>"
    And I click open item as "<open_Item>" to see Menu option screen
    And I click Open Discount on menu option
    Then I should see Open discount Screen
    And I pass the amount on open discount for open item discount safety percentage whole value as 20 for "<Discount11>"
    Then I should see discount applied on order screen
    Then I should see orderscreen with menu item prize as "<SubTotal2>"
    Then I should see the tax amount reflected to the check as "<Tax2>"
    Then I should see the Discount amount reflected to the check as "<Discount2>"
    Then I should see orderscreen with menu item Total as "<Total2>"
    And I click Payment button in the Order Management Screen
    And I click side cc button in the payment window
   # Then I should see card type window
    #And I click visa card type as "<card_type>"
    #And I click ok button in card type window
    Then I should see total screen
    And I click custom for tip adjustment
    Then I should see tip is added with menu total as "<Total2>"
    Then I should see total amount as "<total2>" on total screen
    And I click the Continue button on the Total screen
    Then I should see the Payment window
    And I click Submit button on the Payment Window
    # Then I should see the print or send receipt
   # And I click No thanks Button on the print receipt
    Then I should get back to the Table Layout tab
    And I click power button
    Examples:
      |table_no| number_of_seats |Menu_Item|course_name| open_Item |  SubTotal | Tax       | Discount | Total    | Discount11 | total     |  SubTotal1 | Tax1       | Discount1 | Total1 |  total1   | SubTotal2  | Tax2        | Discount2  |Total2  | total2     |
      | T6     |1                |  Dosa   | DESSERT   |  onion    |  $ 51.00  | $ 5.10    | $ 0.50   |$ 55.60   | After      | $ 65.60   |  $ 51.00   | $ 5.10     | $ 20.50   |$ 35.60 |  $ 45.60  |  $ 51.00   | $ 5.10      | $ 20.00    |$ 36.10 |  $ 46.10   |


#  @failed_Ragav1
#  Scenario Outline: Check Payment through NMI with discount(Open item - After tax/Before) as percentage and with tip
#    And I click new check button on the Table layout screen
#    And I select table as "<table_no>"
#    And I select the number of seats as "<number_of_seats>"
#    And I tap Continue to finish selecting the number of seats
#    And I click Add Customer Button
#    And I search for "<customer_name>"
#    When I click "<customer_name>" to select customer for the seat
#    And I select Menu as category
#    And I select menu item as "<Menu_Item>"
#    And I click menu item as "<Menu_Item>" to see Menu option screen
#    And I click Open Item button
#    Then I should see open item screen
#    And I click Coursing Name text field for Menu option
#    And I swipe to "<course_name>" as Coursing Name
#    And I pass course name as "<open_Item>"
#    And I tap Price text field for menu option
#    And I enter the price with sale
#    And I click Continue button on the Open Item Price numbers popup
#    And I click Done button on the open item window
#    Then I should navigate to Order Management screen and see the added open item as "<open_Item>"
#    And I click open item as "<open_Item>" to see Menu option screen
#    And I click Open Discount on menu option
#    Then I should see Open discount Screen
#    And I pass the amount on open discount for open item discount as discount Percentage for "<Discount11>"
#    Then I should see discount applied on order screen
#    Then I should see orderscreen with menu item prize as "<SubTotal>"
#    Then I should see the tax amount reflected to the check as "<Tax>"
#    Then I should see the Discount amount reflected to the check as "<Discount>"
#    Then I should see orderscreen with menu item Total as "<Total>"
#    And I click Payment button in the Order Management Screen
##    And I scroll the close the day "Others" "scroll close the day"
#    And I click NMI payment button in the payment window
#  #  Then I should see card type window
#   # And I click visa card type as "<card_type>"
#    #And I click ok button in card type window
#    Then I should see total screen
#    And I click custom for tip adjustment
#    Then I should see tip is added with menu total as "<Total>"
#    Then I should see total amount as "<total>" on total screen
#    And I click the Continue button on the Total screen
#    Then I should see choose card window
#    And I select credit card from choose card window
#    And I click pay button in choose card window
##    And I click Ok button in receipt printer popup
#   # Then I should see signature pad screen
#    #And I click tick mark button
#    # Then I should see the print or send receipt
#   # And I click No thanks Button on the print receipt
#    # Then I should see the print or send receipt
#   # And I click No thanks Button on the print receipt
#    Then I should get back to the Table Layout tab
#  #  And I click power button
#
# # Scenario Outline:  Check Payment through NMI with discount(Open item - After tax/Before) as amount & safety limit as decimal value and with tip
#    And I click new check button on the Table layout screen
#    And I select table as "<table_no>"
#    And I select the number of seats as "<number_of_seats>"
#    And I tap Continue to finish selecting the number of seats
#    And I click Add Customer Button
#    And I search for "<customer_name>"
#    When I click "<customer_name>" to select customer for the seat
#    And I select Menu as category
#    And I select menu item as "<Menu_Item>"
#    And I click menu item as "<Menu_Item>" to see Menu option screen
#    And I click Open Item button
#    Then I should see open item screen
#    And I click Coursing Name text field for Menu option
#    And I swipe to "<course_name>" as Coursing Name
#    And I pass course name as "<open_Item>"
#    And I tap Price text field for menu option
#    And I enter the price with sale
#    And I click Continue button on the Open Item Price numbers popup
#    And I click Done button on the open item window
#    Then I should navigate to Order Management screen and see the added open item as "<open_Item>"
#    And I click open item as "<open_Item>" to see Menu option screen
#    And I click Open Discount on menu option
#    Then I should see Open discount Screen
#    And I pass the amount on open discount for open item discount safety percentage decimal value as 20.50 for "<Discount11>"
#    Then I should see discount applied on order screen
#    Then I should see orderscreen with menu item prize as "<SubTotal1>"
#    Then I should see the tax amount reflected to the check as "<Tax1>"
#    Then I should see the Discount amount reflected to the check as "<Discount1>"
#    Then I should see orderscreen with menu item Total as "<Total1>"
#    And I click Payment button in the Order Management Screen
##     And I scroll the close the day "Others" "scroll close the day"
#    And I click NMI payment button in the payment window
#    #Then I should see card type window
#   # And I click visa card type as "<card_type>"
#    #And I click ok button in card type window
#    Then I should see total screen
#    And I click custom for tip adjustment
#    Then I should see tip is added with menu total as "<Total1>"
#    Then I should see total amount as "<total1>" on total screen
#    And I click the Continue button on the Total screen
#    Then I should see choose card window
#    And I select credit card from choose card window
#    And I click pay button in choose card window
##    And I click Ok button in receipt printer popup
#    #Then I should see signature pad screen
#    #And I click tick mark button
#    # Then I should see the print or send receipt
#   # And I click No thanks Button on the print receipt
#    # Then I should see the print or send receipt
#   # And I click No thanks Button on the print receipt
#    Then I should get back to the Table Layout tab
#   # And I click power button
#
#
#
#  #Scenario Outline: Check Payment through NMI with discount(Open item - After tax/Before) as amount & safety limit as non-decimal value and with tip
#    And I click new check button on the Table layout screen
#    And I select table as "<table_no>"
#    And I select the number of seats as "<number_of_seats>"
#    And I tap Continue to finish selecting the number of seats
#    And I click Add Customer Button
#    And I search for "<customer_name>"
#    When I click "<customer_name>" to select customer for the seat
#    And I select Menu as category
#    And I select menu item as "<Menu_Item>"
#    And I click menu item as "<Menu_Item>" to see Menu option screen
#    And I click Open Item button
#    Then I should see open item screen
#    And I click Coursing Name text field for Menu option
#    And I swipe to "<course_name>" as Coursing Name
#    And I pass course name as "<open_Item>"
#    And I tap Price text field for menu option
#    And I enter the price with sale
#    And I click Continue button on the Open Item Price numbers popup
#    And I click Done button on the open item window
#    Then I should navigate to Order Management screen and see the added open item as "<open_Item>"
#    And I click open item as "<open_Item>" to see Menu option screen
#    And I click Open Discount on menu option
#    Then I should see Open discount Screen
#    And I pass the amount on open discount for open item discount safety percentage whole value as 20 for "<Discount11>"
#    Then I should see discount applied on order screen
#    Then I should see orderscreen with menu item prize as "<SubTotal2>"
#    Then I should see the tax amount reflected to the check as "<Tax2>"
#    Then I should see the Discount amount reflected to the check as "<Discount2>"
#    Then I should see orderscreen with menu item Total as "<Total2>"
#    And I click Payment button in the Order Management Screen
##  And I scroll the close the day "Others" "scroll close the day"
#    And I click NMI payment button in the payment window
#  #  Then I should see card type window
#   # And I click visa card type as "<card_type>"
#    #And I click ok button in card type window
#    Then I should see total screen
#    And I click custom for tip adjustment
#    Then I should see tip is added with menu total as "<Total2>"
#    Then I should see total amount as "<total2>" on total screen
#    And I click the Continue button on the Total screen
#    Then I should see choose card window
#    And I select credit card from choose card window
#    And I click pay button in choose card window
##    And I click Ok button in receipt printer popup
#   # Then I should see signature pad screen
#    # And I click tick mark button
#    # Then I should see the print or send receipt
#   # And I click No thanks Button on the print receipt
#    # Then I should see the print or send receipt
#   # And I click No thanks Button on the print receipt
#    Then I should get back to the Table Layout tab
#    And I click power button
#    Examples:
#      |table_no| number_of_seats |Menu_Item|course_name| open_Item |  SubTotal | Tax       | Discount | Total    | Discount11 | total     | customer_name |  SubTotal1 | Tax1       | Discount1 | Total1 |  total1   | SubTotal2  | Tax2        | Discount2  |Total2  | total2     |
#      | T7     |1                |  Dosa   | DESSERT   |  onion    |  $ 51.00  | $ 5.10    | $ 0.50   |$ 55.60   | After      | $ 65.60   | Auto ragav    |  $ 51.00   | $ 5.10     | $ 20.50   |$ 35.60 |  $ 45.60  |  $ 51.00   | $ 5.10      | $ 20.00    |$ 36.10 |  $ 46.10   |




  Scenario Outline: Menu Option - Remove Open Modifier
    And I click new check button on the Table layout screen
    And I select table as "<table_no>"
    And I select the number of seats as "<number_of_seats>"
    And I tap Continue to finish selecting the number of seats
    And I select FOOD as category
    And I select menu item as "<Menu_Item>"
    And I select modifier as "<Modifier>"
    And I click Done to get back
    And I click menu item as "<Menu_Item>" to see Menu option screen
    And I click Open Modifier on menu option
    Then I should see Open modifier Screen
    And I pass the Name as "<Modifier1>" and price on Open Modifier
    Then I should see open modifier as "<Modifier1>" added on open modifiers screen
    And I click Done button on the Open modifiers screen
    And I swipe the modifiers for Delete in order screen
    And I click Cash button for Complete Sale
    And I click Exact button on the cash pop-up
    And I click Enter Button on the cash pop-up
#     Then I should see the print or send receipt
#    And I click No thanks Button on the print receipt
    Then I should get back to the Table Layout tab
    And I click power button
    Examples:
      | table_no | number_of_seats | Menu_Item | Modifier | Modifier1 |
      | T7      |1              |  French Friese | Steak  | Tomato   |


  Scenario Outline: Open Modifiers Tab, Delete modifier
    And I click new check button on the Table layout screen
    And I select table as "<table_no>"
    And I select the number of seats as "<number_of_seats>"
    And I tap Continue to finish selecting the number of seats
    And I select FOOD as category
    And I select menu item as "<Menu_Item>"
    And I select modifier as "<Modifier>"
    And I click Done to get back
    And I click menu item as "<Menu_Item>" to see Menu option screen
    And I click Open Modifier on menu option
    Then I should see Open modifier Screen
    And I pass the Name as "<Modifier1>" and price on Open Modifier
    Then I should see open modifier as "<Modifier1>" added on open modifiers screen
    And I swipe the modifiers for Delete in open modifiers screen
    Then I should not see open modifier as "<Modifier1>" added on open modifiers screen
    And I click cancel button on the Open modifiers screen
    And I click Cash button for Complete Sale
    And I click Exact button on the cash pop-up
    And I click Enter Button on the cash pop-up
#     Then I should see the print or send receipt
#    And I click No thanks Button on the print receipt
    Then I should get back to the Table Layout tab
    And I click power button
    Examples:
      | table_no | number_of_seats | Menu_Item | Modifier | Modifier1 |
      | T16      |1              |  Tuna Tacos | Croutons  | Tomato   |


  Scenario Outline: Application allow user to Hold automatic/Hold Manual Tab should appear ------execute Menu Option
    And I click new check button on the Table layout screen
    And I select the "T25" in the Table layout screen"click t25 table"
    And I select the number of seats as "<number_of_seats>"
    And I tap Continue to finish selecting the number of seats
    And I select category as "FOOD"
    And I select menu item as "<menu_item>"
    And I click menu item as "<menu_item>" to see Menu option screen
    When User click Hold check option
    Then User verify Hold screen
    And User verify Hold Automation and Hold Manuel options
    Then User click cancel button
    And I click the Back button on Menu option Screen
    Then I Should get back to the Order Screen
    #Application allow user to Fire ------execute take an order popup
    And I click menu item as "<menu_item>" to see Menu option screen
    When User select Fire menu option
    Then User verify be directed menu item page
    And I click Void button on order management screen
    And I click void Reason on the void popup
    And I click Add Button on the void reason popup
#    Then I should see Receipt Printer popup
#    And I click Done button on the Popup
    And I click Table Layout tab
    And I click new check button on the Table layout screen
    And I select table as "<table_no>"
    And I select the number of seats as "<number_of_seats>"
    And I tap Continue to finish selecting the number of seats
    And I select menu item as "<menu_item>"
    #Application allow user to Repeat any menu item
    And I click menu item as "<menu_item>" to see Menu option screen
    When User select Repeat menu option
    Then User verify be directed menu item page
    #Application allow user to Quantity of any menu item
    And I click menu item as "<menu_item>" to see Menu option screen
    And User click Quantity menu option
    When User enter quantity of repeat menu item
    Then User verify be directed menu item page
    Then User verify quantity of menu item
    #Application allow user to Attach any notes
    And I click menu item as "<menu_item>" to see Menu option screen
    When User click Attach menu option
    Then I should see Add Notes popup
    And I click Add notes reason as "Spicy"
    And I click Add Button on the void reason popup
    Then I should see reason as "Spicy" on the Order screen
    #Verify application allow user To Go order type option -- execute --- Then User verify menu item which has ToGo order type element inspect edilemediği için verify eklenemedi
    And I click menu item as "<menu_item>" to see Menu option screen
    When User select ToGo menu option
    Then User verify be directed menu item page
    And I click menu item as "<menu_item>" to see Menu option screen
    Then User select ToGo menu option
    #Verify application allow user To Go order type option with the same menu item
    And User verify be directed menu item page
    When User click void button
    Then User click done button on modifier
    And I click All
    And I click power button

    Examples:
      |menu_item|table_no|number_of_seats|
      |SANDWICHES| T7    |1              |
