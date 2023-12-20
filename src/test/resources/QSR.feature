@Payments1   @Payment   @VerificationForUSDStore123
Feature: QSR feature

  Background:
#    Given I go to WebPOS
    Given I'm logged in
    And I close the order type window

  @RegressionQSR3
  Scenario Outline: Service Type  in Order Screen,Seats
    And I add a new seat
    Then I should see created new seat
    Then I should see service type as "<order_type>"
    #Seats
    And I delete the seat for QSR order type
    #All Button
    And I click All
    #Check stats screen
    Then I should see check stats Screen
    #Table Layout screen
    Then I should see table layout Screen
    #Phone Order Screen
    And I click phone order tab
    Then I should see the Phone Order tab
    And I click QSR tab
    And I close the order type window
    Then I should see service type as "<order_type>"
    #Sync Button
    And I click sync button on the Order screen
    And I click log off button in order screen
    Examples:
      | order_type |
      | QSR    |

  @RegressionQSR3
  Scenario Outline: All Button - During Sale
    Then I should see service type as "<order_type>"
    And I select category as "FOOD"
    And I select menu item as "<menu_Item>"
    And I select modifier as "<modifier>"
    And I click Done to get back
    And I click All
    Then I should see close your sale
    And I click Done button on the Popup

    #Sync Button - During sale
    And I click sync button on the Order screen
    Then I should see Please close the sale to sync the data popup
    And I click Done button on the Popup
    #Till Button - During Sale
#    And I click counting machine icon
#    Then I should see close your sale
#    And I click Done button on the Popup
    #Operation Button - During sale
    And I click the Settings button
#    Then I should see close your sale
    And I should see close the sale
    And I click Done button on the Popup
    #Log off Button - During sale
    And I click log off button in order screen
    And I should see close the sale
    And I click Done button on the Popup
    #Split Screen
    Then I should see Split button is visible
    And I click Void button on order management screen
    Then I should see All orders are voided
    And I click Done button on the Popup
   # And I click log off button in order screen
   # Examples:
    #  | order_type |menu_Item | modifier |
    #  | QSR    | French Friese | Tomato  |

 # Scenario Outline: Search Button -Order screen
    Then I should see service type as "<order_type>"
    And I click Search Button on the Order Screen
  #  Then I should see search field on the Order screen
    And I pass menu item to search and click the menu item as "<Menu_item1>"
    Then I should see menu item added into Order list
    And I click Void button on order management screen
    Then I should see All orders are voided
    And I click Done button on the Popup
    And I click log off button in order screen
    #Search Category - Order Screen
   # And I click Search Button on the Order Screen
    #Then I should see search field on the Order screen
    #And I pass menu item to search and click the menu item as "<Category>"
    #And I select FOOD as category
    #And I click Void button on order management screen
    #Then I should see All orders are voided
    #And I click Done button on the Popup
    #And I click log off button in order screen
    Examples:
      | order_type |menu_Item      | modifier |Menu_item1 |
      | QSR        | French Friese | Tomato   |Onion Rings|

  @RegressionQSR3
  Scenario Outline: Discount - Order Screen,Discount for Menu Item
    Then I should see service type as "<order_type>"
    And I select Pasta as category
    And I select menu item as "<Menu_Item>"
    And I select modifier as "<Modifier>"
    And I click Done to get back
    And I select Discount on the Order screen
    #Discount for Menu Item
    Then I should see Check Based Discount Screen
    And I click Discount as "<Discount>"
    And I click Back button on Discount Screen
    Then I should see orderscreen with menu item prize as "<SubTotal>"
    Then I should see the tax amount reflected to the check as "<Tax>"
    Then I should see the Discount amount reflected to the check as "<Discount1>"
    Then I should see orderscreen with menu item Total as "<Total>"
    And I click Void button on order management screen
    Then I should see All orders are voided
    And I click Done button on the Popup
    And I click log off button in order screen
    Examples:
      |order_type |Menu_Item | Modifier |Discount            |Discount1  | SubTotal    | Tax       | Total       |
      | QSR       | Ravioli  | Butter   | IB-AfterTax-Amount |$ 1.00     | $ 14.00     | $ 1.40    | $ 14.40     |

  @RegressionQSR3
  Scenario Outline: Check with normal bill without discount/Gratuity/upcharge
    Then I should see service type as "<order_type>"
    And I get check number
    And I select Pasta as category
    And I select menu item as "<Menu_Item>"
    And I select modifier as "<Modifier>"
    And I click Done to get back
    And I click Cash button for Complete Sale
    And I click Exact button on the cash pop-up
    And I click Enter Button on the cash pop-up
    #Void check
##    Then I should see the order type window
    And I close the order type window
    And I click All
    Then I should see check stats Screen
    And I click Closed tab on the Check stats
    And I click the Closed check on check stats
    And I click reopen check button on the check stats screen
    Then I Should get back to the Order Screen
    And I click Void button on order management screen
    Then I should see payment made on this check popup message
    And I click Done button on the Popup
    And I click payment in the payment window
    And I click Delete button on the payment window
##    And I click Ok button in receipt printer popup
    And I click Exit to return to Order Management Screen
    And I click Void button on order management screen
    Then I should see the void reason popup
    And I click void Reason on the void popup
    And I click Add Button on the void reason popup
#    Then I should see Receipt Printer popup
#    And I click Done button on the Popup
    And I close the order type window



  #Scenario Outline: Check with normal bill without discount/Gratuity/upcharge - other payment
    Then I should see service type as "<order_type>"
    And I get check number
    And I select Pasta as category
    And I select menu item as "<Menu_Item>"
    And I select modifier as "<Modifier>"
    And I click Done to get back
    And I click Payment button in the Order Management Screen
    And I click other button from the payment method popup
    And I click Submit button on the Payment Window
#    Then I should see the order type window
    And I closed the order type window
    #Void check - other payment
    And I click All
    Then I should see check stats Screen
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
    And I click Exit to return to Order Management Screen
    And I click Void button on order management screen
    Then I should see the void reason popup
    And I click void Reason on the void popup
    And I click Add Button on the void reason popup
#    Then I should see Receipt Printer popup
#    And I click Done button on the Popup
    And I close the order type window
    And I click log off button in order screen
    Examples:
      | order_type  |Menu_Item | Modifier |
      | QSR         | Ravioli  | Butter   |

  @RegressionQSR
  Scenario Outline:QSR -  Check with discount(item based - Before tax) as percentage
    Then I should see service type as "<order_type>"
    And I select Pasta as category
    And I select menu item as "<Menu_Item>"
    And I select modifier as "<Modifier>"
    And I click Done to get back
    And I select Discount on the Order screen
    Then I should see Check Based Discount Screen
    And I click Discount as "<Discount>"
    And I click Back button on Discount Screen
    Then I should see orderscreen with menu item prize as "<SubTotal>"
    Then I should see the tax amount reflected to the check as "<Tax>"
    Then I should see the Discount amount reflected to the check as "<Discount1>"
    Then I should see orderscreen with menu item Total as "<Total>"
    And I click Cash button for Complete Sale
    And I click Exact button on the cash pop-up
    And I click Enter Button on the cash pop-up
#    Then I should see the order type window
    And I closed the order type window
    #Check with discount(item based - After tax) as percentage
    Then I should see service type as "<order_type>"
    And I select Pasta as category
    And I select menu item as "<Menu_Item>"
    And I select modifier as "<Modifier>"
    And I click Done to get back
    And I select Discount on the Order screen
    Then I should see Check Based Discount Screen
    And I click Discount as "<Discount11>"
    And I click Back button on Discount Screen
    Then I should see orderscreen with menu item prize as "<SubTotal>"
    Then I should see the tax amount reflected to the check as "<Tax1>"
    Then I should see the Discount amount reflected to the check as "<Discount1>"
    Then I should see orderscreen with menu item Total as "<Total1>"
    And I click Cash button for Complete Sale
    And I click Exact button on the cash pop-up
    And I click Enter Button on the cash pop-up
#    Then I should see the order type window
    And I closed the order type window

    #Check with discount(item based - After tax) as Amount 10
    Then I should see service type as "<order_type>"
    And I select Pasta as category
    And I select menu item as "<Menu_Item>"
    And I select modifier as "<Modifier>"
    And I click Done to get back
    And I select Discount on the Order screen
    Then I should see Check Based Discount Screen
    And I click Discount as "<Discount21>"
    And I click Back button on Discount Screen
    Then I should see orderscreen with menu item prize as "<SubTotal>"
    Then I should see the tax amount reflected to the check as "<Tax1>"
    Then I should see the Discount amount reflected to the check as "<Discount3>"
    Then I should see orderscreen with menu item Total as "<Total2>"
    And I click Cash button for Complete Sale
    And I click Exact button on the cash pop-up
    And I click Enter Button on the cash pop-up
#    Then I should see the order type window
    And I closed the order type window
   #Check with discount(item based - Before tax) as Amount 10
    Then I should see service type as "<order_type>"
    And I select Pasta as category
    And I select menu item as "<Menu_Item>"
    And I select modifier as "<Modifier>"
    And I click Done to get back
    And I select Discount on the Order screen
    Then I should see Check Based Discount Screen
    And I click Discount as "<Discount31>"
    And I click Back button on Discount Screen
    Then I should see orderscreen with menu item prize as "<SubTotal>"
    Then I should see the tax amount reflected to the check as "<Tax3>"
    Then I should see the Discount amount reflected to the check as "<Discount3>"
    Then I should see orderscreen with menu item Total as "<Total3>"
    And I click Cash button for Complete Sale
    And I click Exact button on the cash pop-up
    And I click Enter Button on the cash pop-up
#    Then I should see the order type window
    And I closed the order type window
    And I click log off button in order screen
    Examples:
      |order_type |Menu_Item | Modifier |Discount                |Discount1  | SubTotal    | Tax       | Total       |Discount11            |Tax1       | Total1      |Discount21          |Discount3 |Total2      |Discount31         | Tax3     | Total3       |
      | QSR       | Ravioli  | Butter   | IB-BeforeTax-Percentage|$ 1.40     | $ 14.00     | $ 1.26    | $ 13.86     |IB-AfterTax-Percentage| $ 1.40    | $ 14.00     |IB-AfterTax-Amount  |$ 1.00    |$ 14.40     |IB-BeforeTax-Amount|$ 1.30    | $ 14.30      |

  @RegressionQSR3
  Scenario Outline: Qsr - Check with discount(item based - After tax) as Set Price 500
    Then I should see service type as "<order_type>"
    And I select Pasta as category
    And I select menu item as "<Menu_Item>"
    And I select modifier as "<Modifier>"
    And I click Done to get back
    And I select Discount on the Order screen
    Then I should see Check Based Discount Screen
    And I click Discount as "<Discount>"
    And I click Back button on Discount Screen
    Then I should see orderscreen with menu item prize as "<SubTotal>"
    Then I should see the tax amount reflected to the check as "<Tax>"
    Then I should see the Discount amount reflected to the check as "<Discount1>"
    Then I should see orderscreen with menu item Total as "<Total>"
    And I click Cash button for Complete Sale
    And I click Exact button on the cash pop-up
    And I click Enter Button on the cash pop-up
#    Then I should see the order type window
    And I closed the order type window
    #Check with discount(item based - Before tax) as Set Price 500
    Then I should see service type as "<order_type>"
    And I select Pasta as category
    And I select menu item as "<Menu_Item>"
    And I select modifier as "<Modifier>"
    And I click Done to get back
    And I select Discount on the Order screen
    Then I should see Check Based Discount Screen
    And I click Discount as "<Discount21>"
    And I click Back button on Discount Screen
    Then I should see orderscreen with menu item prize as "<SubTotal>"
    Then I should see the tax amount reflected to the check as "<Tax1>"
    Then I should see the Discount amount reflected to the check as "<Discount2>"
    Then I should see orderscreen with menu item Total as "<Total1>"
    And I click Cash button for Complete Sale
    And I click Exact button on the cash pop-up
    And I click Enter Button on the cash pop-up
#    Then I should see the order type window
    And I closed the order type window
    #Check with discount(item based - Before tax) as Free Item
    Then I should see service type as "<order_type>"
    And I select Pasta as category
    And I select menu item as "<Menu_Item>"
    And I select modifier as "<Modifier>"
    And I click Done to get back
    And I select Discount on the Order screen
    Then I should see Check Based Discount Screen
    And I click Discount as "<Discount31>"
    And I click Back button on Discount Screen
    Then I should see orderscreen with as Onion Rings EACH
    Then I should see orderscreen with menu item prize as "<SubTotal1>"
    Then I should see the tax amount reflected to the check as "<Tax2>"
    Then I should see orderscreen with menu item Total without Discount or Tax as "<Total2>"
    And I click Cash button for Complete Sale
    And I click Exact button on the cash pop-up
    And I click Enter Button on the cash pop-up
#    Then I should see the order type window
    And I closed the order type window
    #Check with discount(item based - After tax) as Free Item
    Then I should see service type as "<order_type>"
    And I select Pasta as category
    And I select menu item as "<Menu_Item>"
    And I select modifier as "<Modifier>"
    And I click Done to get back
    And I select Discount on the Order screen
    Then I should see Check Based Discount Screen
    And I click Discount as "<Discount41>"
    And I click Back button on Discount Screen
    Then I should see orderscreen with as Onion Rings EACH
    Then I should see orderscreen with menu item prize as "<SubTotal1>"
    Then I should see the tax amount reflected to the check as "<Tax2>"
    Then I should see orderscreen with menu item Total without Discount or Tax as "<Total2>"
    And I click Cash button for Complete Sale
    And I click Exact button on the cash pop-up
    And I click Enter Button on the cash pop-up
#    Then I should see the order type window
    And I closed the order type window
    And I click log off button in order screen
    Examples:
      |order_type  |Menu_Item   | Modifier |Discount                 |Discount1    |Discount2    | SubTotal    | Tax       | Total       |Tax1       | Total1       |Discount21               |Discount31             |SubTotal1    | Tax2       | Total2       |Discount41             |
      | QSR        | Ravioli    | Butter   | IB-AfterTax-SetPrice500 |$ 12.50      | $ 13.00     |$ 14.00      | $ 1.40    | $ 2.90      | $ 0.10    | $ 1.10       |IB-BeforeTax-SetPrice500 |IB-BeforeTax-AsFreeItem| $ 15.00     | $ 1.50     | $ 16.50      |IB-AfterTax-AsFreeItem |

  @RegressionQSR3
  Scenario Outline: Check with discount(Check based - After tax) as Percentage-Discount - Check based
    Then I should see service type as "<order_type>"
    And I select Pasta as category
    And I select menu item as "<Menu_Item>"
    And I select modifier as "<Modifier>"
    And I click Done to get back
    And I select Pasta as category
    And I select menu item as "<Menu_Item>"
    And I select modifier as "<Modifier>"
    And I click Done to get back
    And I select Discount on the Order screen
    Then I should see Check Based Discount Screen
    And I click Discount as "<Discount>"
    And I click Back button on Discount Screen
    Then I should see orderscreen with menu item prize as "<SubTotal>"
    Then I should see the tax amount reflected to the check as "<Tax>"
    Then I should see the Discount amount reflected to the check as "<Discount1>"
    Then I should see orderscreen with menu item Total as "<Total>"
    And I click Cash button for Complete Sale
    And I click Exact button on the cash pop-up
    And I click Enter Button on the cash pop-up
#    Then I should see the order type window
    And I closed the order type window
    #Check with discount(Check based - Before tax) as Percentage
    Then I should see service type as "<order_type>"
    And I select Pasta as category
    And I select menu item as "<Menu_Item>"
    And I select modifier as "<Modifier>"
    And I click Done to get back
    And I select Pasta as category
    And I select menu item as "<Menu_Item>"
    And I select modifier as "<Modifier>"
    And I click Done to get back
    And I select Discount on the Order screen
    Then I should see Check Based Discount Screen
    And I click Discount as "<Discount2>"
    And I click Back button on Discount Screen
    Then I should see orderscreen with menu item prize as "<SubTotal>"
    Then I should see the tax amount reflected to the check as "<Tax1>"
    Then I should see the Discount amount reflected to the check as "<Discount1>"
    Then I should see orderscreen with menu item Total as "<Total1>"
    And I click Cash button for Complete Sale
    And I click Exact button on the cash pop-up
    And I click Enter Button on the cash pop-up
  #    #   Then I should see the print or send receipt
  #    #    And I click No thanks Button on the print receipt
#    Then I should see the order type window
    And I closed the order type window
    And I click log off button in order screen
    Examples:
      | order_type | Menu_Item | Modifier |Discount                 | SubTotal    | Tax       | Discount1 |Total       |Tax1    |Total1   |Discount2                |
      |QSR         | Ravioli | Butter     |CB-AfterTax-Percentage10 | $ 28.00     | $ 2.80    | $ 2.80    | $ 28.00    | $ 2.52 | $ 27.72 |CB-BeforeTax-Percentage10|

  @RegressionQSR3
  Scenario Outline:Qsr  Check with discount(Check based - After tax) as Amount
    Then I should see service type as "<order_type>"
    And I select category as "Menu"
    And I select menu item as "<Menu_Item>"
    And I select menu item as "<Menu_Item>"
    And I select Discount on the Order screen
    Then I should see Check Based Discount Screen
    And I click Discount as "<Discount>"
    And I click Back button on Discount Screen
    Then I should see orderscreen with menu item prize as "<SubTotal>"
    Then I should see the tax amount reflected to the check as "<Tax>"
    Then I should see the Discount amount reflected to the check as "<Discount1>"
    Then I should see orderscreen with menu item Total as "<Total>"
    And I click Cash button for Complete Sale
    And I click Exact button on the cash pop-up
    And I click Enter Button on the cash pop-up
#    Then I should see the order type window
    And I closed the order type window
    #Check with discount(Check based - After tax) as set price
    Then I should see service type as "<order_type>"
    And I select category as "Menu"
    And I select menu item as "<Menu_Item>"
    And I select menu item as "<Menu_Item>"
    And I select Discount on the Order screen
    Then I should see Check Based Discount Screen
    And I click Discount as "<Discount2>"
    And I click Back button on Discount Screen
    Then I should see orderscreen with menu item prize as "<SubTotal>"
    Then I should see the tax amount reflected to the check as "<Tax>"
    Then I should see the Discount amount reflected to the check as "<Discount3>"
    Then I should see orderscreen with menu item Total as "<Total1>"
    And I click Cash button for Complete Sale
    And I click Exact button on the cash pop-up
    And I click Enter Button on the cash pop-up
#    Then I should see the order type window
    And I closed the order type window
    And I click log off button in order screen

    Examples:
      | order_type | Menu_Item  |Discount               | SubTotal    | Tax       | Discount1   |Total        |Discount2               |Discount3    |Total1       |
      | QSR        |  cake      |CB-AfterTax-Amount1000 | $ 16.00     | $ 1.60    | $ 1.00      | $ 16.60     |CB-AfterTax-SetPrice1000| $ 6.00      | $ 11.60     |

  @RegressionQSR3
  Scenario Outline:Qsr Check with discount(Check based - After tax) as Free
    Then I should see service type as "<order_type>"
    And I select Desserts as category
    And I select menu item as "<Menu_Item>"
    And I select Discount on the Order screen
    Then I should see Check Based Discount Screen
    And I click Discount as "<Discount>"
    And I click Back button on Discount Screen
    Then I should see orderscreen with as Onion Rings EACH
    Then I should see orderscreen with menu item prize as "<SubTotal>"
    Then I should see the tax amount reflected to the check as "<Tax>"
    Then I should see orderscreen with menu item Total without Discount or Tax as "<Total>"
    And I click Cash button for Complete Sale
    And I click Exact button on the cash pop-up
    And I click Enter Button on the cash pop-up
#    Then I should see the order type window
    And I closed the order type window
    #Check with discount(Check based - Before tax) as Free item
    Then I should see service type as "<order_type>"
    And I select Desserts as category
    And I select menu item as "<Menu_Item>"
    And I select Discount on the Order screen
    Then I should see Check Based Discount Screen
    And I click Discount as "<Discount1>"
    And I click Back button on Discount Screen
    Then I should see orderscreen with as Onion Rings EACH
    Then I should see discount as "<Discount1>" on the order screen
    Then I should see orderscreen with menu item prize as "<SubTotal>"
    Then I should see the tax amount reflected to the check as "<Tax>"
    Then I should see orderscreen with menu item Total without Discount or Tax as "<Total>"
    And I click Cash button for Complete Sale
    And I click Exact button on the cash pop-up
    And I click Enter Button on the cash pop-up
#    Then I should see the order type window
    And I closed the order type window
    And I click log off button in order screen
    Examples:
      | order_type  |Menu_Item       |Discount             | SubTotal  | Tax      | Total     |Discount1           |
      | QSR        | Cheesecake      | CB-AfterTax-Free300 | $ 17.00   | $ 1.70   | $ 18.70   |CB-BeforeTax-Free300|

  @RegressionQSR3
  Scenario Outline:Qsr Check with discount(Check based - Before tax) as Amount
    Then I should see service type as "<order_type>"
    And I select Pasta as category
    And I select menu item as "<Menu_Item>"
    And I select modifier as "<Modifier>"
    And I click Done to get back
    And I select menu item as "<Menu_Item>"
    And I select modifier as "<Modifier>"
    And I click Done to get back
    And I select Discount on the Order screen
    Then I should see Check Based Discount Screen
    And I click Discount as "<Discount>"
    And I click Back button on Discount Screen
    Then I should see orderscreen with menu item prize as "<SubTotal>"
    Then I should see the tax amount reflected to the check as "<Tax>"
    Then I should see the Discount amount reflected to the check as "<txtDiscount>"
    Then I should see orderscreen with menu item Total as "<Total>"
    And I click Cash button for Complete Sale
    And I click Exact button on the cash pop-up
    And I click Enter Button on the cash pop-up
#    Then I should see the order type window
    And I closed the order type window
  #  And I click log off button in order screen
  #  Examples:
   #   | order_type | Menu_Item | Modifier |Discount            | SubTotal    | Tax       | Discount1 |Total       |
    #  | QSR  |  Ravioli | Butter   |CB-BeforeTax-Amount1000 | TL 3.800,00 | TL 280,00 | TL 1.000,00 | TL 3.080,00 |


 # Scenario Outline: qsr Check with discount(Check based - Before tax) as set price
    Then I should see service type as "<order_type>"
    And I select category as "Menu"
    And I select menu item as "<Menu_Item1>"
    And I select menu item as "<Menu_Item1>"
    And I select Discount on the Order screen
    Then I should see Check Based Discount Screen
    And I click Discount as "<Discount1>"
    And I click Back button on Discount Screen
    Then I should see orderscreen with menu item prize as "<SubTotal1>"
    Then I should see the tax amount reflected to the check as "<Tax1>"
    Then I should see the Discount amount reflected to the check as "<txtDiscount1>"
    Then I should see orderscreen with menu item Total as "<Total1>"
    And I click Cash button for Complete Sale
    And I click Exact button on the cash pop-up
    And I click Enter Button on the cash pop-up
#    Then I should see the order type window
    And I closed the order type window
    #Check with discount(Check based - Before tax) as Free item
    And I click log off button in order screen
  #  Examples:
   #   | order_type| Menu_Item  |Discount            | SubTotal    | Tax       | Discount1 |Total       |
    #  | QSR       |  cake    |CB-BeforeTax-SetPrice1000 | TL 1.500,00 | TL 100,00 | TL 500,00 | TL 1.100,00 |
    Examples:
      | order_type | Menu_Item | Modifier |Discount                | SubTotal    | Tax       | txtDiscount |Total        | Menu_Item1|Discount1                | SubTotal1   | Tax1      | txtDiscount1 |Total1       |
      | QSR        |  Ravioli  | Butter   |CB-BeforeTax-Amount1000 | $ 28.00     | $ 2.70    | $ 1.00      | $ 29.70     | cake      |CB-BeforeTax-SetPrice1000| $ 16.00     | $ 1.00    | $ 6.00       | $ 11.00     |

  @RegressionQSR3
  Scenario Outline: qsr - Check with open item discount as amount and safety limit in Whole Value as 20 (After Tax)
    Then I should see service type as "<order_type>"
    And I select category as "Menu"
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
    And I pass the amount on open discount for open item discount safety percentage whole value as 20 for "<Discount1>"
    Then I should see discount applied on order screen
    Then I should see orderscreen with menu item prize as "<SubTotal3>"
    Then I should see the tax amount reflected to the check as "<Tax3>"
    Then I should see the Discount amount reflected to the check as "<Discount3>"
    Then I should see orderscreen with menu item Total as "<Total3>"
    And I click Cash button for Complete Sale
    And I click Exact button on the cash pop-up
    And I click Enter Button on the cash pop-up
#    Then I should see the order type window
    And I closed the order type window
   # And I click log off button in order screen
 #   Examples:
  #    |order_type |Menu_Item|course_name |open_Item | SubTotal  | Tax      | Discount | Total | Discount1|
   #   | QSR       |Dosa     | SALAD      |onion     | TL 185,00 | TL 17,73 | TL 20,00 | TL 175,00  | After   |

  #Scenario Outline: qsr Check with open item discount as amount and safety limit in Decimal Value as 20.50(After Tax)
    Then I should see service type as "<order_type>"
    And I select category as "Menu"
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
    And I pass the amount on open discount for open item discount safety percentage decimal value as 20.50 for1 "<Discount1>"
    Then I should see discount applied on order screen
    Then I should see orderscreen with menu item prize as "<SubTotal>"
    Then I should see the tax amount reflected to the check as "<Tax>"
    Then I should see the Discount amount reflected to the check as "<Discount>"
    Then I should see orderscreen with menu item Total as "<Total>"
    And I click Cash button for Complete Sale
    And I click Exact button on the cash pop-up
    And I click Enter Button on the cash pop-up
#    Then I should see the order type window
    And I closed the order type window
    #Check with open item discount as Percentage (After Tax)
    Then I should see service type as "<order_type>"
    And I select category as "Menu"
    And I select menu item as "<Menu_Item>"
    And I click menu item as "<Menu_Item>" to see Menu option screen
    And I click Open Item button
    Then I should see open item screen
    And I click Coursing Name text field for Menu option
    And I swipe to "<course_name1>" as Coursing Name
    And I pass course name as "<open_Item>"
    And I tap Price text field for menu option
    And I enter the price with sale
    And I click Continue button on the Open Item Price numbers popup
    And I click Done button on the open item window
    Then I should navigate to Order Management screen and see the added open item as "<open_Item>"
    And I click open item as "<open_Item>" to see Menu option screen
    And I click Open Discount on menu option
    Then I should see Open discount Screen
    And I pass the amount on open discount for open item discount as discount Percentage for "<Discount1>"
    Then I should see discount applied on order screen
    Then I should see orderscreen with menu item prize as "<SubTotal>"
    Then I should see the tax amount reflected to the check as "<Tax>"
    Then I should see the Discount amount reflected to the check as "<Discount2>"
    Then I should see orderscreen with menu item Total as "<Total2>"
    And I click Cash button for Complete Sale
    And I click Exact button on the cash pop-up
    And I click Enter Button on the cash pop-up
#    Then I should see the order type window
    And I closed the order type window
    And I click log off button in order screen
    Examples:
      |order_type |Menu_Item|course_name |open_Item | SubTotal | Tax       | Discount | Total   | Discount1 |Discount2|course_name1|Total2  |SubTotal3  | Tax3      | Discount3 | Total3     |
      | QSR       |Dosa     |  SALAD     |onion     | $ 51.00  | $ 5.10    | $ 20.50  | $ 35.60 | After     |$ 0.50   |DESSERT     |$ 55.60 |$ 51.00    | $ 5.10    | $ 20.00   | $ 36.10    |

  @RegressionQSR3
  Scenario Outline: qsr Check with open item discount as amount and safety limit in Decimal Value as 20.50(Before Tax)
    Then I should see service type as "<order_type>"
    And I select category as "Menu"
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
    And I pass the amount on open discount for open item discount safety percentage decimal value as 20.50 for "<Discount1>"
    Then I should see discount applied on order screen
    Then I should see orderscreen with menu item prize as "<SubTotal>"
    Then I should see the tax amount reflected to the check as "<Tax>"
    Then I should see the Discount amount reflected to the check as "<Discount>"
    Then I should see orderscreen with menu item Total as "<Total>"
    And I click Cash button for Complete Sale
    And I click Exact button on the cash pop-up
    And I click Enter Button on the cash pop-up
#    Then I should see the order type window
    And I closed the order type window
    #Check with open item discount as amount and safety limit in Whole Value as 20(Before Tax)
    Then I should see service type as "<order_type>"
    And I select category as "Menu"
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
    And I pass the amount on open discount for open item discount safety percentage whole value as 20 for1 "<Discount1>"
    Then I should see discount applied on order screen
    Then I should see orderscreen with menu item prize as "<SubTotal>"
    Then I should see the tax amount reflected to the check as "<Tax1>"
    Then I should see the Discount amount reflected to the check as "<Discount2>"
    Then I should see orderscreen with menu item Total as "<Total1>"
    And I click Cash button for Complete Sale
    And I click Exact button on the cash pop-up
    And I click Enter Button on the cash pop-up
#    Then I should see the order type window
    And I closed the order type window
   # And I click log off button in order screen
  #  Examples:
   #   |order_type|Menu_Item|course_name |open_Item | SubTotal | Tax       | Discount | Total | Discount1 |Tax1       | Discount2 | Total1 |
    #  | QSR       |Dosa |  SALAD     |onion     | TL 185,00 | TL 15,68 | TL 20,50  | TL 172,45 | Before | TL 15,73 | TL 20,00  | TL 173,00 |

#
#  Scenario Outline: Check with open item discount as amount and safety limit in Whole Value as 20(Before Tax)
#    Then I should see service type as "<order_type>"
#   And I select category as "<Menu
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
#    And I pass the amount on open discount for open item discount safety percentage whole value as 20 for "<Discount1>"
#    Then I should see discount applied on order screen
#    Then I should see orderscreen with menu item prize as "<SubTotal>"
#    Then I should see the tax amount reflected to the check as "<Tax1>"
#    Then I should see the Discount amount reflected to the check as "<Discount2>"
#    Then I should see orderscreen with menu item Total as "<Total1>"
#    And I click Cash button for Complete Sale
#    And I click Exact button on the cash pop-up
#    And I click Enter Button on the cash pop-up
##    #   Then I should see the print or send receipt
##    #    And I click No thanks Button on the print receipt
#    And I closed the order type window
#
#    Examples:
#      |order_type |Menu_Item|course_name |open_Item | SubTotal | Tax1       | Discount2 | Total1 | Discount1 |
#      | QSR       |  Dosa   |  SALAD     |onion     | TL 185,00 | TL 15,73 | TL 20,00  | TL 173,00 | Before |

 # Scenario Outline: Qsr Check with open item discount as Percentage (Before Tax)
    Then I should see service type as "<order_type>"
    And I select category as "Menu"
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
    And I pass the amount on open discount for open item discount as discount Percentage for "<Discount1>"
    Then I should see discount applied on order screen
    Then I should see orderscreen with menu item prize as "<SubTotal3>"
    Then I should see the tax amount reflected to the check as "<Tax3>"
    Then I should see the Discount amount reflected to the check as "<Discount3>"
    Then I should see orderscreen with menu item Total as "<Total3>"
    And I click Cash button for Complete Sale
    And I click Exact button on the cash pop-up
    And I click Enter Button on the cash pop-up
#    Then I should see the order type window
    And I closed the order type window
    And I click log off button in order screen
 #   Examples:
  #    |order_type | Menu_Item  | course_name | open_Item |  SubTotal | Tax     | Discount | Total     | Discount1 |
   #   | QSR       | Dosa       | DESSERT     |  onion    | TL 185,00 | TL 15,63| TL 21,00 | TL 171,90 |  Before    |

    Examples:
      |order_type|Menu_Item|course_name |open_Item | SubTotal | Tax       | Discount | Total   | Discount1 |Tax1       | Discount2 | Total1  | SubTotal3 | Tax3     | Discount3 | Total3     |
      | QSR      |Dosa     |  SALAD     |onion     | $ 51.00  | $ 3.05    | $ 20.50  | $ 33.55 | Before    | $ 3.10    | $ 20.00   | $ 34.10 |$ 51.00    | $ 5.05   | $ 0.50    | $ 55.55    |


#  Scenario Outline: qsr Check with open Check discount as amount and safety limit in whole value (After Tax)
#    Then I should see service type as "<order_type>"
#    And I select category as "Menu"
#    And I select menu item as "<Menu_Item>"
#    And I change the Quantity of menu Item as "7"
#    And I click Options button
#    Then I should see the Check Options screen
#    And I click discount on check option screen
#    And I select open check discount
#    Then I should see Open discount Screen
#    And I pass the amount on open discount for open check discount safety percentage whole value as 20 for "<Discount1>"
#    Then I should see orderscreen with open check discount
#    Then I should see orderscreen with menu item prize as "<SubTotal>"
#    Then I should see the tax amount reflected to the check as "<Tax>"
#    Then I should see the Discount amount reflected to the check as "<Discount>"
#    Then I should see orderscreen with menu item Total as "<Total>"
#    And I click Cash button for Complete Sale
#    And I click Exact button on the cash pop-up
#    And I click Enter Button on the cash pop-up
##    Then I should see the order type window
#    And I closed the order type window
#    #Check with open Check discount as amount and safety limit in decimal precision (After Tax)
#    Then I should see service type as "<order_type>"
#    And I select category as "Menu"
#    And I select menu item as "<Menu_Item>"
#    And I change the Quantity of menu Item as "7"
#    And I click Options button
#    Then I should see the Check Options screen
#    And I click discount on check option screen
#    And I select open check discount
#    Then I should see Open discount Screen
#    And I pass the amount on open discount for open check discount safety limit percentage decimal precision as 20.50 for "<Discount1>"
#    Then I should see orderscreen with open check discount
#    Then I should see orderscreen with menu item prize as "<SubTotal>"
#    Then I should see the tax amount reflected to the check as "<Tax>"
#    Then I should see the Discount amount reflected to the check as "<Discount2>"
#    Then I should see orderscreen with menu item Total as "<Total1>"
#    And I click Cash button for Complete Sale
#    And I click Exact button on the cash pop-up
#    And I click Enter Button on the cash pop-up
##    Then I should see the order type window
#    And I closed the order type window
#    #Check with open Check discount as percentage (After Tax)
#    Then I should see service type as "<order_type>"
#    And I select category as "Menu"
#    And I select menu item as "<Menu_Item>"
#    And I change the Quantity of menu Item as "7"
#    And I click Options button
#    Then I should see the Check Options screen
#    And I click discount on check option screen
#    And I select open check discount
#    Then I should see Open discount Screen
#    And I pass the amount on open discount for open check discount percentage as 20 for "<Discount1>"
#    Then I should see orderscreen with open check discount
#    Then I should see orderscreen with menu item prize as "<SubTotal>"
#    Then I should see the tax amount reflected to the check as "<Tax>"
#    Then I should see the Discount amount reflected to the check as "<Discount3>"
#    Then I should see orderscreen with menu item Total as "<Total2>"
#    And I click Cash button for Complete Sale
#    And I click Exact button on the cash pop-up
#    And I click Enter Button on the cash pop-up
##    Then I should see the order type window
#    And I closed the order type window
#    And I click log off button in order screen
#    Examples:
#      |order_type|Menu_Item|  SubTotal | Tax       | Discount | Total   | Discount1 |Discount2 | Total1   | Discount3 | Total2  |
#      | QSR      |Halwa    |   $ 70.00 | $ 7.00    | $ 20.00  | $ 57.00 | After     | $ 20.50  | $ 56.50  | $ 14.00   | $ 63.00 |


#  Scenario Outline: qsr Check with open Check discount as amount and safety limit in decimal precision(Before Tax)
#    Then I should see service type as "<order_type>"
#    And I select category as "Menu"
#    And I select menu item as "<Menu_Item>"
#    And I change the Quantity of menu Item as "7"
#    And I click Options button
#    Then I should see the Check Options screen
#    And I click discount on check option screen
#    And I select open check discount
#    Then I should see Open discount Screen
#    And I pass the amount on open discount for open check discount safety limit percentage decimal precision as 20.50 for "<Discount1>"
#    Then I should see orderscreen with open check discount
#    Then I should see orderscreen with menu item prize as "<SubTotal>"
#    Then I should see the tax amount reflected to the check as "<Tax>"
#    Then I should see the Discount amount reflected to the check as "<Discount>"
#    Then I should see orderscreen with menu item Total as "<Total>"
#    And I click Cash button for Complete Sale
#    And I click Exact button on the cash pop-up
#    And I click Enter Button on the cash pop-up
##    Then I should see the order type window
#    And I closed the order type window
#    #Check with open Check discount as amount and safety limit in whole value (Before Tax)
#    Then I should see service type as "<order_type>"
#    And I select category as "Menu"
#    And I select menu item as "<Menu_Item>"
#    And I change the Quantity of menu Item as "7"
#    And I click Options button
#    Then I should see the Check Options screen
#    And I click discount on check option screen
#    And I select open check discount
#    Then I should see Open discount Screen
#    And I pass the amount on open discount for open check discount safety percentage whole value as 20 for "<Discount1>"
#    Then I should see orderscreen with open check discount
#    Then I should see orderscreen with menu item prize as "<SubTotal>"
#    Then I should see the tax amount reflected to the check as "<Tax1>"
#    Then I should see the Discount amount reflected to the check as "<Discount2>"
#    Then I should see orderscreen with menu item Total as "<Total1>"
#    And I click Cash button for Complete Sale
#    And I click Exact button on the cash pop-up
#    And I click Enter Button on the cash pop-up
##    Then I should see the order type window
#    And I closed the order type window
#    And I click log off button in order screen
#    Examples:
#      |order_type |Menu_Item|  SubTotal | Tax       | Discount | Total   | Discount1 | Tax1       | Discount2 | Total1  |
#      | QSR       |Halwa    |  $ 70.00  | $ 4.95    | $ 20.50  | $ 54.45 | Before    | $ 5.00     | $ 20.00   | $ 55.00 |
#
#
#  Scenario Outline: qsr Check with open Check discount as percentage (Before Tax)
#    Then I should see service type as "<order_type>"
#    And I select category as "Menu"
#    And I select menu item as "<Menu_Item>"
#    And I change the Quantity of menu Item as "7"
#    And I click Options button
#    Then I should see the Check Options screen
#    And I click discount on check option screen
#    And I select open check discount
#    Then I should see Open discount Screen
#    And I pass the amount on open discount for open check discount percentage as 20 for "<Discount1>"
#    Then I should see orderscreen with open check discount
#    Then I should see orderscreen with menu item prize as "<SubTotal>"
#    Then I should see the tax amount reflected to the check as "<Tax>"
#    Then I should see the Discount amount reflected to the check as "<Discount>"
#    Then I should see orderscreen with menu item Total as "<Total>"
#    And I click Cash button for Complete Sale
#    And I click Exact button on the cash pop-up
#    And I click Enter Button on the cash pop-up
##    Then I should see the order type window
#    And I closed the order type window
#    And I click log off button in order screen
#    Examples:
#      |order_type |Menu_Item|  SubTotal | Tax       | Discount | Total   | Discount1 |
#      |QSR        |  Halwa  |   $ 70.00 | $ 5.60    | $ 14.00  | $ 61.60 | Before    |

  @RegressionQSR3
  Scenario Outline:qsr Check with Mix&Match discount as Set Price as 600(After Tax)
    Then I should see service type as "<order_type>"
    And I select category as "Menu"
    And I select menu item as "<Menu_Item>"
    And I select menu item as "<Menu_Item>"
    And I select Discount on the Order screen
    Then I should see Check Based Discount Screen
    And I click Discount as "<Discount1>"
    And I click Back button on Discount Screen
    Then I should see orderscreen with menu item prize as "<SubTotal>"
    Then I should see the tax amount reflected to the check as "<Tax>"
    Then I should see the Discount amount reflected to the check as "<Discount>"
    Then I should see orderscreen with menu item Total as "<Total>"
    And I click Cash button for Complete Sale
    And I click Exact button on the cash pop-up
    And I click Enter Button on the cash pop-up
#    Then I should see the order type window
    And I closed the order type window
    #Check with Mix&Match discount as Set Each Item Price as 800 (After Tax)
    Then I should see service type as "<order_type>"
    And I select category as "Menu"
    And I select menu item as "<Menu_Item>"
    And I select menu item as "<Menu_Item>"
    And I select Discount on the Order screen
    Then I should see Check Based Discount Screen
    And I click Discount as "<Discount3>"
    And I click Back button on Discount Screen
    Then I should see orderscreen with menu item prize as "<SubTotal>"
    Then I should see the tax amount reflected to the check as "<Tax>"
    Then I should see the Discount amount reflected to the check as "<Discount2>"
    Then I should see orderscreen with menu item Total as "<Total1>"
    And I click Cash button for Complete Sale
    And I click Exact button on the cash pop-up
    And I click Enter Button on the cash pop-up
#    Then I should see the order type window
    And I closed the order type window
    And I click log off button in order screen
    Examples:
      |order_type |Menu_Item|  SubTotal     | Tax       | Discount | Total   | Discount1              |Discount2 | Total1  | Discount3                |
      | QSR       |  Halwa  |  $ 20.00      | $ 2.00    | $ 8.00   | $ 14.00 | CheckMixMatchSP(After) | $ 2.00   | $ 20.00 | CheckMixMatchSEIP(After) |

  @RegressionQSR3
  Scenario Outline: Qsr Check with Mix&Match discount as Set Percentage(Least Expensive)(After tax)
    Then I should see service type as "<order_type>"
    And I select Desserts as category
    And I select menu item as "<Menu_Item>"
    And I select menu item as "<Menu_Item1>"
    And I select Discount on the Order screen
    Then I should see Check Based Discount Screen
    And I click Discount as "<Discount1>"
    And I click Back button on Discount Screen
    And I compare menu price as "<price>" "<price1>" and applied "<Discount1>" on "<expensive>" menu Item
    Then I should see orderscreen with menu item prize as "<SubTotal>"
    Then I should see the tax amount reflected to the check as "<Tax>"
    Then I should see the Discount amount reflected to the check as "<Discount>"
    Then I should see orderscreen with menu item Total as "<Total>"
    And I click Cash button for Complete Sale
    And I click Exact button on the cash pop-up
    And I click Enter Button on the cash pop-up
#    Then I should see the order type window
    And I closed the order type window
    And I click log off button in order screen
    Examples:
      |order_type |Menu_Item    |Menu_Item1         |price |price1|  SubTotal    | Tax       | Discount   | Total       | Discount1                 | expensive|
      | QSR       |  Cheesecake |Pumpkin Cheese Cake|15.00 |11.00 |  $ 26.00     | $ 2.60    | $ 5.50     | $ 23.10     | CheckMixMatchSPerL(After) | Least    |

  @RegressionQSR3
  Scenario Outline: qsr Check with Mix&Match discount as Set Price as 500(Before tax)
    Then I should see service type as "<order_type>"
    And I select category as "Menu"
    And I select menu item as "<Menu_Item>"
    And I select menu item as "<Menu_Item1>"
    And I select Discount on the Order screen
    Then I should see Check Based Discount Screen
    And I click Discount as "<Discount1>"
    And I click Back button on Discount Screen
    Then I should see discount as "<Discount1>" on the order screen
    Then I should see orderscreen with menu item prize as "<SubTotal>"
    Then I should see the tax amount reflected to the check as "<Tax>"
    Then I should see the Discount amount reflected to the check as "<Discount>"
    Then I should see orderscreen with menu item Total as "<Total>"
    And I click Cash button for Complete Sale
    And I click Exact button on the cash pop-up
    And I click Enter Button on the cash pop-up
#    Then I should see the order type window
    And I closed the order type window
    #Check with Mix&Match discount as Set Each Item Price as 500(Before tax)
    Then I should see service type as "<order_type>"
    And I select category as "Menu"
    And I select menu item as "<Menu_Item>"
    And I select menu item as "<Menu_Item1>"
    And I select Discount on the Order screen
    Then I should see Check Based Discount Screen
    And I click Discount as "<Discount2>"
    And I click Back button on Discount Screen
    Then I should see discount as "<Discount2>" on the order screen
    Then I should see orderscreen with menu item prize as "<SubTotal>"
    Then I should see the tax amount reflected to the check as "<Tax1>"
    Then I should see the Discount amount reflected to the check as "<Discount12>"
    Then I should see orderscreen with menu item Total as "<Total1>"
    And I click Cash button for Complete Sale
    And I click Exact button on the cash pop-up
    And I click Enter Button on the cash pop-up
#    Then I should see the order type window
    And I closed the order type window
    And I click log off button in order screen
    Examples:
      |order_type |Menu_Item | Menu_Item1 |  SubTotal    | Tax       | Discount    | Total       | Discount1               |Discount2                 | Tax1      | Discount12   | Total1      |
      | QSR       | cake     | Halwa      |  $ 18.00     | $ 1.00    | $ 8.00      | $ 11.00     | CheckMixMatchSP(Before) |CheckMixMatchSEIP(Before) | $ 1.60    | $ 2.00      | $ 17.60     |

  @RegressionQSR3
  Scenario Outline: qsr Check with Mix&Match discount as Set Percentage Most Expensive (Before tax)
    Then I should see service type as "<order_type>"
    And I select Desserts as category
    And I select menu item as "<Menu_Item>"
    And I select menu item as "<Menu_Item1>"
    And I select Discount on the Order screen
    Then I should see Check Based Discount Screen
    And I click Discount as "<Discount1>"
    And I click Back button on Discount Screen
    And I compare menu price as "<price>" "<price1>" and applied "<Discount1>" on "<expensive>" menu Item
    Then I should see orderscreen with menu item prize as "<SubTotal>"
    Then I should see the tax amount reflected to the check as "<Tax>"
    Then I should see the Discount amount reflected to the check as "<Discount>"
    Then I should see orderscreen with menu item Total as "<Total>"
    And I click Cash button for Complete Sale
    And I click Exact button on the cash pop-up
    And I click Enter Button on the cash pop-up
#    Then I should see the order type window
    And I closed the order type window
    And I click log off button in order screen

    Examples:
      |order_type |Menu_Item    | Menu_Item1          | price |price1| SubTotal    | Tax       | Discount   | Total        | Discount1                 | expensive |
      | QSR       | Cheesecake  | Pumpkin Cheese Cake | 15.00 |11.00 |  $ 26.00    | $ 1.85    | $ 7.50     | $ 20.35      | CheckMixMatchSPerM(Befor) |Most       |

  @RegressionQSR3
  Scenario Outline: qsr Check with Mix&Match discount as Set Percentage Least Expensive (Before tax)
    Then I should see service type as "<order_type>"
    And I select Desserts as category
    And I select menu item as "<Menu_Item>"
    And I select menu item as "<Menu_Item1>"
    And I select Discount on the Order screen
    Then I should see Check Based Discount Screen
    And I click Discount as "<Discount1>"
    And I click Back button on Discount Screen
    And I compare menu price as "<price>" "<price1>" and applied "<Discount1>" on "<expensive>" menu Item
    Then I should see orderscreen with menu item prize as "<SubTotal>"
    Then I should see the tax amount reflected to the check as "<Tax>"
    Then I should see the Discount amount reflected to the check as "<Discount>"
    Then I should see orderscreen with menu item Total as "<Total>"
    And I click Cash button for Complete Sale
    And I click Exact button on the cash pop-up
    And I click Enter Button on the cash pop-up
#    Then I should see the order type window
    And I closed the order type window
    And I click log off button in order screen
    Examples:
      |order_type |Menu_Item    | Menu_Item1          | price |price1| SubTotal    | Tax       | Discount   | Total        | Discount1                 | expensive |
      | QSR       | Cheesecake  | Pumpkin Cheese Cake |15.00  |11.00 | $ 26.00     |$ 2.05     |$ 5.50      | $ 22.55      | CheckMixMatchSPerL(Befor) | Least     |

  @RegressionQSR3
  Scenario Outline: qsr Check with vary gratuity
    Then I should see service type as "<order_type>"
    And I select category as "Menu"
    And I select menu item as "<Menu_Item>"
    And I click Options button
    Then I should see the Check Options screen
    And I click Gratuity button
    Then I should see Add Gratuity screen
    And I click Gratuity varying button
    Then I should see enter Percentage popup
    And I pass the value and click Apply button as "<Percentage>"
    Then I Should get back to the Order Screen
    Then I should see orderscreen with menu item prize as "<SubTotal>"
    Then I should see the tax amount reflected to the check as "<Tax>"
    Then I should see the Gratuity amount reflected to the check as "<Gratuity>"
    Then I should see orderscreen with menu item Total as "<Total>"
    And I click Cash button for Complete Sale
    And I click Exact button on the cash pop-up
    And I click Enter Button on the cash pop-up
#    Then I should see the order type window
    And I closed the order type window
    And I click log off button in order screen
    Examples:
      |order_type| Menu_Item   | Percentage | SubTotal   |    Tax    | Gratuity     | Total   |
      | QSR      | Halwa       | 8          | $ 10.00    | $ 1.00    |  $ 0.80      | $ 11.80 |

  @RegressionQSR3
  Scenario Outline: qsr Check With Fixed Gratuity
    Then I should see service type as "<order_type>"
    And I select category as "Menu"
    And I select menu item as "<Menu_Item>"
    And I click Options button
    Then I should see the Check Options screen
    And I click Gratuity button
    Then I should see Add Gratuity screen
    And I click Gratuity Fixed button
    Then I Should get back to the Order Screen
    Then I should see orderscreen with menu item prize as "<SubTotal>"
    Then I should see the tax amount reflected to the check as "<Tax>"
    Then I should see the Gratuity amount reflected to the check as "<Gratuity>"
    Then I should see orderscreen with menu item Total as "<Total>"
    And I click Cash button for Complete Sale
    And I click Exact button on the cash pop-up
    And I click Enter Button on the cash pop-up
#    Then I should see the order type window
    And I closed the order type window
    And I click log off button in order screen
    Examples:
      | order_type | Menu_Item |  SubTotal | Tax    | Gratuity | Total   |
      | QSR        |  Halwa    | $ 10.00   | $ 1.00 |  $ 1.00  | $ 12.00 |

  @RegressionQSR3
  Scenario Outline: qsr Check With Exclusive Tax
    Then I should see service type as "<order_type>"
    And I select Pasta as category
    And I select menu item as "Ravioli"
    And I select modifier as "<Modifier>"
    And I click Done to get back
    Then I should see orderscreen with menu item prize as "<SubTotal>"
    Then I should see the tax amount reflected to the check as "<Tax>"
    Then I should see orderscreen with menu item Total without Discount or Tax as "<Total>"
    And I click Cash button for Complete Sale
    And I click Exact button on the cash pop-up
    And I click Enter Button on the cash pop-up
#    Then I should see the order type window
    And I closed the order type window
    And I click log off button in order screen
    Examples:
      | order_type | Modifier | Tax    | SubTotal | Total    |
      |QSR         | Butter   | $ 1.40 | $ 14.00  | $ 15.40  |

  @RegressionQSR3
  Scenario Outline: qsr Check with tax exempt with customer
    Then I should see service type as "<order_type>"
    And I click Add Customer Button
    And I search for "<customer_name>"
    When I click "<customer_name>" to select customer for the seat
    And I select category as "Menu"
    And I select menu item as "<Menu_Item>"
    Then I should see orderscreen with menu item prize as "<SubTotal>"
    Then I should see the tax amount reflected to the check as "<Tax>"
    Then I should see orderscreen with menu item Total without Discount or Tax as "<Total>"
    And I click Options button
    Then I should see the Check Options screen
    And I click Tax Exempt Button
#    Then I should see tax exempt reasons
#    When I select School as reason
    Then I Should get back to the Order Screen
    Then I should see orderscreen with menu item prize as "<SubTotal>"
    And I should see the tax reflected to the check
    Then I should see orderscreen with menu item Total without Tax Exempt as "<Total1>"
    And I click Cash button for Complete Sale
    And I click Exact button on the cash pop-up
    And I click Enter Button on the cash pop-up
#    Then I should see the order type window
    And I closed the order type window
  #Check with tax exempt and without customer
    Then I should see service type as "<order_type>"
    And I select category as "Menu"
    And I select menu item as "<Menu_Item>"
    Then I should see orderscreen with menu item prize as "<SubTotal>"
    Then I should see the tax amount reflected to the check as "<Tax>"
    Then I should see orderscreen with menu item Total without Discount or Tax as "<Total>"
    And I click Options button
    Then I should see the Check Options screen
    And I click Tax Exempt Button
#    Then I should see tax exempt reasons
#    When I select School as reason
    Then I Should get back to the Order Screen
    Then I should see orderscreen with menu item prize as "<SubTotal>"
    And I should see the tax reflected to the check
    Then I should see orderscreen with menu item Total without Tax Exempt as "<Total1>"
    And I click Cash button for Complete Sale
    And I click Exact button on the cash pop-up
    And I click Enter Button on the cash pop-up
#    Then I should see the order type window
    And I closed the order type window
    #Check with tax exempt and without customer through payment screen
#    Then I should see service type as "<order_type>"
#    And I select category as "Menu"
#    And I select menu item as "<Menu_Item>"
#    Then I should see orderscreen with menu item prize as "<SubTotal>"
#    Then I should see the tax amount reflected to the check as "<Tax>"
#    Then I should see orderscreen with menu item Total without Discount or Tax as "<Total>"
##    And I click Payment button in the Order Management Screen
##    And I click Tax Exempt Button from the Payment Screen
##    Then I should see tax exempt reasons
##    When I select School as reason
#    Then I Should get back to the Order Screen
#    Then I should see orderscreen with menu item prize as "<SubTotal>"
#    And I should see the tax reflected to the check
#    Then I should see orderscreen with menu item Total without Tax Exempt as "<Total1>"
#    And I click Cash button for Complete Sale
#    And I click Exact button on the cash pop-up
#    And I click Enter Button on the cash pop-up
##    Then I should see the order type window
#    And I closed the order type window
    #Check with tax exempt for pre defined customer
    Then I should see service type as "<order_type>"
    And I click Add Customer Button
    And I search for "<customer_name>"
    When I click "<customer_name>" to select customer for the seat
    And I click the customer name on the order screen
    Then I should see the customer profile window
#    And I click Add new button
#    And I select search
#    And I enter an existing customer's name "<customer_name>"
#    And I select the customer for tax exempt

    And I select tax exempt on customer profile screen
    And I click the Save button
    Then I Should get back to the Order Screen
    And I select category as "Menu"
    And I select menu item as "<Menu_Item>"
    Then I should see orderscreen with menu item prize as "<SubTotal>"
    And I should see the tax reflected to the check
    Then I should see orderscreen with menu item Total without Tax Exempt as "<Total1>"
    And I click Cash button for Complete Sale
    And I click Exact button on the cash pop-up
    And I click Enter Button on the cash pop-up
#    Then I should see the order type window
    And I closed the order type window
    And I click Add Customer Button
    And I search for "<customer_name>"
    When I click "<customer_name>" to select customer for the seat
    And I click the customer name on the order screen
    Then I should see the customer profile window
    And I remove tax exempt on customer profile screen
    And I click the Save button
    Then I Should get back to the Order Screen
    And I click log off button in order screen
    Examples:
      | order_type|customer_name| Menu_Item  |  SubTotal   | Tax       | Total       | Total1      |
      | QSR       | tax exe     | Halwa      | $ 10.00     | $ 1.00    | $ 11.00     | $ 10.00     |


#  Scenario Outline: qsr Check with vary gratuity through Payment screen
#    Then I should see service type as "<order_type>"
#    And I select category as "Menu"
#    And I select menu item as "<Menu_Item>"
#    And I click Payment button in the Order Management Screen
#    And I click add gratuity from Payment screen
#    Then I should see the Check Options screen
#    Then I should see Add Gratuity screen
#    And I click Gratuity varying button
#    Then I should see enter Percentage popup
#    And I pass the value and click Apply button
#    Then I Should get back to the Order Screen
#    Then I should see orderscreen with menu item prize as "<SubTotal>"
#    Then I should see the tax amount reflected to the check as "<Tax>"
#    Then I should see the Gratuity amount reflected to the check as "<Gratuity>"
#    Then I should see orderscreen with menu item Total as "<Total>"
#    And I click Cash button for Complete Sale
#    And I click Exact button on the cash pop-up
#    And I click Enter Button on the cash pop-up
##    Then I should see the order type window
#    And I closed the order type window
#    And I click log off button in order screen
#    Examples:
#      | order_type| Menu_Item   | SubTotal  | Tax      | Gratuity   |Total   |
#      | QSR       | Halwa       |$ 10.00    | $ 1.00   | $ 0.80     |$ 11.80 |

  @RegressionQSR3
  Scenario Outline: qsr Check With upcharge(Amount)
    Then I should see service type as "<order_type>"
    And I select category as "FOOD"
    And I select menu item as "<Menu_Item>"
    And I select modifier as "<Modifier>"
    And I click Done to get back
    Then I should see menu with Upcharge amount on order list as "<amount>"
    And I click Cash button for Complete Sale
    And I click Exact button on the cash pop-up
    And I click Enter Button on the cash pop-up
#    Then I should see the order type window
    And I closed the order type window
    And I click log off button in order screen
    Examples:
      | order_type | Menu_Item          | Modifier     | amount   |
      | QSR        |  Fried Crab Cakes  | White Bread  | $ 18.50  |

  @RegressionQSR3
  Scenario Outline: qsr check payment by HA for New created customer
    Then I should see service type as "<order_type>"
    And I click Add Customer Button
#    And I click Add new button
    And I search for "<customer_name>"
    When I click "<customer_name>" to select customer for the seat
    And I click the customer name on the order screen
    Then I should see the customer profile window
#    And I select search
#    And I enter an existing customer's name "<customer_name>"
#    And I select the customer
    And I click customer plan button
    Then I should see Account type screen
  #  And I click house account field and enter recharge amount
    And I click update button
    And I Should get back to the Order Screen
#    And I click Cash button for Complete Sale
#    And I click Exact button on the cash pop-up
#    And I click Enter Button on the cash pop-up
##   #   Then I should see the print or send receipt
#    #    And I click No thanks Button on the print receipt
##    Then I should see the order type window
#    And I closed the order type window
#    And I click Add Customer Button
#    And I search for "<customer_name>"
#    When I click "<customer_name>" to select customer for the seat
    And I select category as "FOOD"
    And I select menu item as "<Menu_Item>"
    And I select modifier as "<Modifier>"
    And I click Done to get back
    Then I should see orderscreen with menu item prize as "<SubTotal>"
    Then I should see orderscreen with menu item Total without Discount or Tax as "<Total>"
    And I click Payment button in the Order Management Screen
    And I click house payment from the payment method popup
    Then I should see total screen
    And I click the Continue button on the Total screen
    Then I should see your order card screen
    And I click Process button on card screen
##    And I click Ok button in receipt printer popup
    #   Then I should see the print or send receipt
    #    And I click No thanks Button on the print receipt
#    Then I should see the order xtype window
    And I closed the order type window
    And I click log off button in order screen
    Examples:
      | order_type | customer_name | Menu_Item      | Modifier   | SubTotal |  Total  |
      | QSR        |  Auto ragav   |  French Friese | Steak      | $ 15.00  | $ 15.00 |

  @RegressionQSR3
  Scenario Outline: qsr Void HA payment check and again add menu item & Payment through HA
    Then I should see service type as "<order_type>"
    And I click Add Customer Button
#    And I click Add new button
#    And I select search
#    And I enter an existing customer's name "<customer_name>"
#    And I select the customer
#    And I click customer plan button
    And I search for "<customer_name>"
    When I click "<customer_name>" to select customer for the seat
    And I click the customer name on the order screen
    Then I should see the customer profile window
    And I click customer plan button
    Then I should see Account type screen
#    And I click house account field and enter recharge amount
    And I click update button
    Then I Should get back to the Order Screen
#    And I click Cash button for Complete Sale
#    And I click Exact button on the cash pop-up
#    And I click Enter Button on the cash pop-up
##    Then I should see the order type window
#    And I close the order type window
#    And I click Add Customer Button
#    And I search for "<customer_name>"
#    When I click "<customer_name>" to select customer for the seat
    And I get check number
    And I select category as "FOOD"
    And I select menu item as "<Menu_Item>"
    And I select modifier as "<Modifier>"
    And I click Done to get back
    Then I should see orderscreen with menu item prize as "<SubTotal>"
    Then I should see orderscreen with menu item Total without Discount or Tax as "<Total>"
    And I click Payment button in the Order Management Screen
    And I click house payment from the payment method popup
    Then I should see total screen
    And I click the Continue button on the Total screen
    Then I should see your order card screen
    And I click Process button on card screen
#    And I click Ok button in receipt printer popup
    #   Then I should see the print or send receipt
    #    And I click No thanks Button on the print receipt
#    Then I should see the order type window
    And I closed the order type window
    And I click All
    And I click Check Stats tab
    And I click Closed tab on the Check stats
    And I click the Closed check on check stats
    And I click reopen check button on the check stats screen
    Then I Should get back to the Order Screen
    And I click Void button on order management screen
    Then I should see payment made on this check popup message for house account
    And I click Done button on the Popup
    And I click payment in the payment window
    And I click Delete button on the payment window
#    And I click Ok button in receipt printer popup
    And I click Exit to return to Order Management Screen
    And I select category as "FOOD"
    And I select menu item as "<Menu_Item>"
    And I select modifier as "<Modifier>"
    And I click Done to get back
    And I click Payment button in the Order Management Screen
    And I click house payment from the payment method popup
    Then I should see total screen
    And I click the Continue button on the Total screen
    Then I should see your order card screen
    And I click Process button on card screen
#    And I click Ok button in receipt printer popup
    #   Then I should see the print or send receipt
    #    And I click No thanks Button on the print receipt
#    Then I should see the order type window
    And I closed the order type window
    And I click log off button in order screen
    Examples:
      | order_type  | customer_name | Menu_Item     | Modifier   | SubTotal |  Total   |
      | QSR         |  Auto ragav   | French Friese | Steak      | $ 15.00  | $ 15.00  |

  @RegressionQSR3
  Scenario Outline:  qsr Check Payment through Other payment - Check with discount(item based - After tax) as amount 10, as set Price 500, as Free ,
    Then I should see service type as "<order_type>"
    And I select Pasta as category
    And I select menu item as "<Menu_Item>"
    And I select modifier as "<Modifier>"
    And I click Done to get back
    And I select Discount on the Order screen
    Then I should see Check Based Discount Screen
    And I click Discount as "<Discount11>"
    And I click Back button on Discount Screen
    Then I should see orderscreen with menu item prize as "<SubTotal1>"
    Then I should see the tax amount reflected to the check as "<Tax1>"
    Then I should see the Discount amount reflected to the check as "<Discount1>"
    Then I should see orderscreen with menu item Total as "<Total1>"
    And I click Payment button in the Order Management Screen
    And I click other button from the payment method popup
    And I click Submit button on the Payment Window
#    Then I should see the order type window
    And I closed the order type window
   # And I click log off button in order screen


  #Scenario Outline: qsr Check payment through other payment Check with discount(item based - After tax) as set Price 500
    Then I should see service type as "<order_type>"
    And I select Pasta as category
    And I select menu item as "<Menu_Item>"
    And I select modifier as "<Modifier>"
    And I click Done to get back
    And I select Discount on the Order screen
    Then I should see Check Based Discount Screen
    And I click Discount as "<Discount22>"
    And I click Back button on Discount Screen
    Then I should see orderscreen with menu item prize as "<SubTotal2>"
    Then I should see the tax amount reflected to the check as "<Tax2>"
    Then I should see the Discount amount reflected to the check as "<Discount2>"
    Then I should see orderscreen with menu item Total as "<Total2>"
    And I click Payment button in the Order Management Screen
    And I click other button from the payment method popup
    And I click Submit button on the Payment Window
#    Then I should see the order type window
    And I closed the order type window
   # And I click log off button in order screen


  #Scenario Outline: qsr Check payment through others payment Check with discount(item based - After tax) as Free
    Then I should see service type as "<order_type>"
    And I select Pasta as category
    And I select menu item as "<Menu_Item>"
    And I select modifier as "<Modifier>"
    And I click Done to get back
    And I select Discount on the Order screen
    Then I should see Check Based Discount Screen
    And I click Discount as "<Discount33>"
    And I click Back button on Discount Screen
    Then I should see orderscreen with as Onion Rings EACH
    Then I should see orderscreen with menu item prize as "<SubTotal3>"
    Then I should see the tax amount reflected to the check as "<Tax3>"
    Then I should see orderscreen with menu item Total without Discount or Tax as "<Total3>"
    And I click Payment button in the Order Management Screen
    And I click other button from the payment method popup
    And I click Submit button on the Payment Window
#    Then I should see the order type window
    And I closed the order type window
    #And I click log off button in order screen

  #Scenario Outline: qsr Check Payment through others payment - Check with discount(Item based - After tax) as Percentage
    Then I should see service type as "<order_type>"
    And I select Pasta as category
    And I select menu item as "<Menu_Item>"
    And I select modifier as "<Modifier>"
    And I click Done to get back
    And I select Discount on the Order screen
    Then I should see Check Based Discount Screen
    And I click Discount as "<Discount44>"
    And I click Back button on Discount Screen
    Then I should see orderscreen with menu item prize as "<SubTotal4>"
    Then I should see the tax amount reflected to the check as "<Tax4>"
    Then I should see the Discount amount reflected to the check as "<Discount4>"
    Then I should see orderscreen with menu item Total as "<Total4>"
    And I click Payment button in the Order Management Screen
    And I click other button from the payment method popup
    And I click Submit button on the Payment Window
#    Then I should see the order type window
    And I closed the order type window
    And I click log off button in order screen
    Examples:
      | order_type |Menu_Item | Modifier |Discount11         |Discount1 | SubTotal1   | Tax1      | Total1      |Discount22              |Discount2   | SubTotal2   | Tax2      | Total2      |Discount33              | SubTotal3   | Tax3     | Total3    |Discount44              |Discount4  | SubTotal4    | Tax4       | Total4     |
      | QSR        | Ravioli  | Butter   |IB-AfterTax-Amount |$ 1.00    | $ 14.00     | $ 1.40    | $ 14.40     |IB-AfterTax-SetPrice500 |$ 12.50     | $ 14.00     | $ 1.40    | $ 2.90      | IB-AfterTax-AsFreeItem | $ 15.00     | $ 1.50   | $ 16.50   | IB-AfterTax-Percentage |$ 1.40     | $ 14.00      | $ 1.40     | $ 14.00    |

  @RegressionQSR3
  Scenario Outline: Check Payment through others payment - Check with discount(Item based - Before tax) as Percentage, as amount 10 , as Set Price 500 , as Free
    Then I should see service type as "<order_type>"
    And I select Pasta as category
    And I select menu item as "<Menu_Item>"
    And I select modifier as "<Modifier>"
    And I click Done to get back
    And I select Discount on the Order screen
    Then I should see Check Based Discount Screen
    And I click Discount as "<Discount11>"
    And I click Back button on Discount Screen
    Then I should see orderscreen with menu item prize as "<SubTotal1>"
    Then I should see the tax amount reflected to the check as "<Tax1>"
    Then I should see the Discount amount reflected to the check as "<Discount1>"
    Then I should see orderscreen with menu item Total as "<Total1>"
    And I click Payment button in the Order Management Screen
    And I click other button from the payment method popup
    And I click Submit button on the Payment Window
#    Then I should see the order type window
    And I closed the order type window
  #  And I click log off button in order screen
   # Examples:
    #  | order_type |Menu_Item | Modifier |Discount11                | Tax1       | Total1       | SubTotal |Discount1|
     # | QSR        | Ravioli  | Butter   | IB-BeforeTax-Percentage |TL 171,00 | TL 1.881,00 | TL 1.900,00    |TL 190,00  |
#
#  Scenario Outline: Check Payment through others payment - Check with discount(Item based - Before tax) as Percentage
#    Then I should see service type as "<order_type>"
#    And I select Pasta as category
#    And I select menu item as "<Menu_Item>"
#    And I select modifier as "<Modifier>"
#    And I click Done to get back
#    And I select Discount on the Order screen
#    Then I should see Check Based Discount Screen
#    And I click Discount as "<Discount2>"
#    And I click Back button on Discount Screen
#    Then I should see orderscreen with menu item prize as "<SubTotal>"
#    Then I should see the tax amount reflected to the check as "<Tax1>"
#    Then I should see the Discount amount reflected to the check as "<Discount1>"
#    Then I should see orderscreen with menu item Total as "<Total1>"
#    And I click Payment button in the Order Management Screen
#    And I click other button from the payment method popup
#    And I click Submit button on the Payment Window
#    And I closed the order type window
#    Examples:
#      | order_type  |Menu_Item | Modifier |Discount2                |Discount1  | SubTotal    | Tax1       | Total1       |
#      | QSR       | Ravioli    | Butter   | IB-BeforeTax-Percentage |TL 190,00  | TL 1.900,00 | TL 171,00 | TL 1.881,00 |

  #Scenario Outline: qsr Check Payment through Other payment - Check with discount(item based - Before tax) as amount 10
    Then I should see service type as "<order_type>"
    And I select Pasta as category
    And I select menu item as "<Menu_Item>"
    And I select modifier as "<Modifier>"
    And I click Done to get back
    And I select Discount on the Order screen
    Then I should see Check Based Discount Screen
    And I click Discount as "<Discount22>"
    And I click Back button on Discount Screen
    Then I should see orderscreen with menu item prize as "<SubTotal2>"
    Then I should see the tax amount reflected to the check as "<Tax2>"
    Then I should see the Discount amount reflected to the check as "<Discount2>"
    Then I should see orderscreen with menu item Total as "<Total2>"
    And I click Payment button in the Order Management Screen
    And I click other button from the payment method popup
    And I click Submit button on the Payment Window
#    Then I should see the order type window
    And I closed the order type window
    #Check Payment through Other payment - Check with discount(item based - Before tax) as Set Price 500
    Then I should see service type as "<order_type>"
    And I select Pasta as category
    And I select menu item as "<Menu_Item>"
    And I select modifier as "<Modifier>"
    And I click Done to get back
    And I select Discount on the Order screen
    Then I should see Check Based Discount Screen
    And I click Discount as "<Discount33>"
    And I click Back button on Discount Screen
    Then I should see orderscreen with menu item prize as "<SubTotal2>"
    Then I should see the tax amount reflected to the check as "<Tax3>"
    Then I should see the Discount amount reflected to the check as "<Discount3>"
    Then I should see orderscreen with menu item Total as "<Total3>"
    And I click Payment button in the Order Management Screen
    And I click other button from the payment method popup
    And I click Submit button on the Payment Window
#    Then I should see the order type window
    And I closed the order type window
    #And I click log off button in order screen
   # Examples:
    #  | order_type |Menu_Item | Modifier |Discount22            |Discount2  | SubTotal2    | Tax2       | Total2       |Discount3            |Discount3  |Tax3       | Total3       |
     # | QSR        | Ravioli  | Butter   | IB-BeforeTax-Amount|TL 10,00  | TL 1.900,00 | TL 189,00 | TL 2.079,00 |IB-BeforeTax-SetPrice500 |TL 1.400,00  | TL 50,00 | TL 550,00 |
#
#  Scenario Outline: Check Payment through Other payment - Check with discount(item based - Before tax) as Set Price 500
#    Then I should see service type as "<order_type>"
#    And I select Pasta as category
#    And I select menu item as "<Menu_Item>"
#    And I select modifier as "<Modifier>"
#    And I click Done to get back
#    And I select Discount on the Order screen
#    Then I should see Check Based Discount Screen
#    And I click Discount as "<Discount2>"
#    And I click Back button on Discount Screen
#    Then I should see orderscreen with menu item prize as "<SubTotal>"
#    Then I should see the tax amount reflected to the check as "<Tax1>"
#    Then I should see the Discount amount reflected to the check as "<Discount3>"
#    Then I should see orderscreen with menu item Total as "<Total1>"
#    And I click Payment button in the Order Management Screen
#    And I click other button from the payment method popup
#    And I click Submit button on the Payment Window
#    And I closed the order type window
#    Examples:
#      |order_type  |Menu_Item | Modifier |Discount2            |Discount3  | SubTotal    | Tax1       | Total1       |
#      | QSR           | Ravioli    | Butter   | IB-BeforeTax-SetPrice500 |TL 1.400,00  | TL 1.900,00 | TL 50,00 | TL 550,00 |

  #Scenario Outline: qsr Check Payment through Other payment -  Check with discount(item based - Before tax) as Free Item
    Then I should see service type as "<order_type>"
    And I select Pasta as category
    And I select menu item as "<Menu_Item>"
    And I select modifier as "<Modifier>"
    And I click Done to get back
    And I select Discount on the Order screen
    Then I should see Check Based Discount Screen
    And I click Discount as "<Discount44>"
    And I click Back button on Discount Screen
    Then I should see orderscreen with as Onion Rings EACH
    Then I should see orderscreen with menu item prize as "<SubTotal4>"
    Then I should see the tax amount reflected to the check as "<Tax4>"
    Then I should see orderscreen with menu item Total without Discount or Tax as "<Total4>"
    And I click Payment button in the Order Management Screen
    And I click other button from the payment method popup
    And I click Submit button on the Payment Window
#    Then I should see the order type window
    And I closed the order type window
    And I click log off button in order screen
    Examples:
      | order_type  |Menu_Item | Modifier |Discount11                | Tax1     | Total1   | SubTotal1 |Discount1|Discount22            |Discount2  | SubTotal2    | Tax2       | Total2    |Discount33               |Discount3  |Tax3       | Total3       |Discount44               | SubTotal4    | Tax4       | Total4      |
      | QSR         | Ravioli  | Butter   |IB-BeforeTax-Percentage   |$ 1.26    | $ 13.86  | $ 14.00   | $ 1.40  |IB-BeforeTax-Amount   |$ 1.00     | $ 14.00      | $ 1.30     | $ 14.30   |IB-BeforeTax-SetPrice500 |$ 13.00    | $ 0.10    | $ 1.10       | IB-BeforeTax-AsFreeItem | $ 15.00      | $ 1.50     | $ 16.50     |

  @RegressionQSR3
  Scenario Outline: Check Payment through Other payment - Check with discount(check based - After tax) as percentage, as Amount,as set price, as Free
    Then I should see service type as "<order_type>"
    And I select Pasta as category
    And I select menu item as "<Menu_Item1>"
    And I select modifier as "<Modifier1>"
    And I click Done to get back
    And I select Pasta as category
    And I select menu item as "<Menu_Item1>"
    And I select modifier as "<Modifier1>"
    And I click Done to get back
    And I select Discount on the Order screen
    Then I should see Check Based Discount Screen
    And I click Discount as "<Discount11>"
    And I click Back button on Discount Screen
    Then I should see orderscreen with menu item prize as "<SubTotal1>"
    Then I should see the tax amount reflected to the check as "<Tax1>"
    Then I should see the Discount amount reflected to the check as "<Discount1>"
    Then I should see orderscreen with menu item Total as "<Total1>"
    And I click Payment button in the Order Management Screen
    And I click other button from the payment method popup
    And I click Submit button on the Payment Window
#    Then I should see the order type window
    And I closed the order type window
 #   And I click log off button in order screen
  #  Examples:
   #   | order_type| Menu_Item1 | Modifier1 |Discount11            | SubTotal1    | Tax1       | Discount1 |Total1       |
    #  | QSR        | Ravioli | Butter    |CB-AfterTax-Percentage10 | TL 3.800,00 | TL 380,00 | TL 380,00 | TL 3.800,00 |

  #Scenario Outline: qsr Check Payment through Other payment - Check with discount(check based - After tax) as Amount
    Then I should see service type as "<order_type>"
    And I select category as "Menu"
    And I select menu item as "<Menu_Item3>"
    And I select menu item as "<Menu_Item3>"
    And I select Discount on the Order screen
    Then I should see Check Based Discount Screen
    And I click Discount as "<Discount22>"
    And I click Back button on Discount Screen
    Then I should see orderscreen with menu item prize as "<SubTotal3>"
    Then I should see the tax amount reflected to the check as "<Tax3>"
    Then I should see the Discount amount reflected to the check as "<Discount2>"
    Then I should see orderscreen with menu item Total as "<Total2>"
    And I click Payment button in the Order Management Screen
    And I click other button from the payment method popup
    And I click Submit button on the Payment Window
#    Then I should see the order type window
    And I closed the order type window
    #Check Payment through Other payment - Check with discount(check based - After tax) as set price
    Then I should see service type as "<order_type>"
    And I select category as "Menu"
    And I select menu item as "<Menu_Item3>"
    And I select menu item as "<Menu_Item3>"
    And I select Discount on the Order screen
    Then I should see Check Based Discount Screen
    And I click Discount as "<Discount33>"
    And I click Back button on Discount Screen
    Then I should see orderscreen with menu item prize as "<SubTotal3>"
    Then I should see the tax amount reflected to the check as "<Tax3>"
    Then I should see the Discount amount reflected to the check as "<Discount3>"
    Then I should see orderscreen with menu item Total as "<Total3>"
    And I click Payment button in the Order Management Screen
    And I click other button from the payment method popup
    And I click Submit button on the Payment Window
#    Then I should see the order type window
    And I closed the order type window
  #  And I click log off button in order screen
  #  Examples:
   #  | order_type| Menu_Item3  |Discount22               | SubTotal3    | Tax3       | Discount2   |Total2        |Discount33               |Discount3   |Total3       |
    #  | QSR       |  cake      |CB-AfterTax-Amount1000 | TL 3.000,00 | TL 300,00 | TL 1.000,00 | TL 2.300,00 |CB-AfterTax-SetPrice1000|TL 2.000,00 | TL 1.300,00 |
#
#  Scenario Outline: Check Payment through Other payment - Check with discount(check based - After tax) as set price
#    Then I should see service type as "<order_type>"
#   And I select category as "<Menu
#    And I select menu item as "<Menu_Item>"
#    And I select menu item as "<Menu_Item>"
#    And I select Discount on the Order screen
#    Then I should see Check Based Discount Screen
#    And I click Discount as "<Discount2>"
#    And I click Back button on Discount Screen
#    Then I should see orderscreen with menu item prize as "<SubTotal>"
#    Then I should see the tax amount reflected to the check as "<Tax>"
#    Then I should see the Discount amount reflected to the check as "<Discount3>"
#    Then I should see orderscreen with menu item Total as "<Total1>"
#    And I click Payment button in the Order Management Screen
#    And I click other button from the payment method popup
#    And I click Submit button on the Payment Window
#    And I closed the order type window
#    Examples:
#      | order_type | Menu_Item  |Discount2            | SubTotal    | Tax       | Discount3 |Total1       |
#      | QSR       |  cake    |CB-AfterTax-SetPrice1000 | TL 3.000,00 | TL 300,00 | TL 1.500,00 | TL 1.800,00 |

 # Scenario Outline:  qsr Check Payment through Other payment - Check with discount(check based - After tax) as Free Item
    Then I should see service type as "<order_type>"
    And I select Desserts as category
    And I select menu item as "<Menu_Item4>"
    And I select Discount on the Order screen
    Then I should see Check Based Discount Screen
    And I click Discount as "<Discount44>"
    And I click Back button on Discount Screen
    Then I should see orderscreen with as Onion Rings EACH
    Then I should see orderscreen with menu item prize as "<SubTotal4>"
    Then I should see the tax amount reflected to the check as "<Tax4>"
    Then I should see orderscreen with menu item Total without Discount or Tax as "<Total4>"
    And I click Payment button in the Order Management Screen
    And I click other button from the payment method popup
    And I click Submit button on the Payment Window
#    Then I should see the order type window
    And I closed the order type window
    And I click log off button in order screen
    Examples:
      | order_type | Menu_Item1 | Modifier1 |Discount11               | SubTotal1   | Tax1      | Discount1 |Total1       |Menu_Item3|Discount22            | SubTotal3   | Tax3      | Discount2   |Total2       |Discount33               |Discount3   |Total3       |Menu_Item4  |Discount44            | SubTotal4    | Tax4       | Total4    |
      | QSR        |Ravioli     | Butter    |CB-AfterTax-Percentage10 | $ 28.00     | $ 2.80    | $ 2.80    | $ 28.00     | cake     |CB-AfterTax-Amount1000| $ 16.00     | $ 1.60    | $ 1.00      | $ 16.60     |CB-AfterTax-SetPrice1000 |$ 6.00      | $ 11.60     | Cheesecake | CB-AfterTax-Free300  | $ 17.00      | $ 1.70     | $ 18.70   |

  @RegressionQSR3
  Scenario Outline: qsr Check Payment through Other payment - Check with discount(check based - Before tax) as Percentage
    Then I should see service type as "<order_type>"
    And I select Pasta as category
    And I select menu item as "<Menu_Item2>"
    And I select modifier as "<Modifier2>"
    And I click Done to get back
    And I select Pasta as category
    And I select menu item as "<Menu_Item2>"
    And I select modifier as "<Modifier2>"
    And I click Done to get back
    And I select Discount on the Order screen
    Then I should see Check Based Discount Screen
    And I click Discount as "<Discount11>"
    And I click Back button on Discount Screen
    Then I should see orderscreen with menu item prize as "<SubTotal1>"
    Then I should see the tax amount reflected to the check as "<Tax1>"
    Then I should see the Discount amount reflected to the check as "<Discount1>"
    Then I should see orderscreen with menu item Total as "<Total1>"
    And I click Payment button in the Order Management Screen
    And I click other button from the payment method popup
    And I click Submit button on the Payment Window
#    Then I should see the order type window
    And I closed the order type window
    #Check Payment through Other payment - Check with discount(check based - Before tax) as Amount
    Then I should see service type as "<order_type>"
    And I select Pasta as category
    And I select menu item as "<Menu_Item2>"
    And I select modifier as "<Modifier2>"
    And I click Done to get back
    And I select menu item as "<Menu_Item2>"
    And I select modifier as "<Modifier2>"
    And I click Done to get back
    And I select Discount on the Order screen
    Then I should see Check Based Discount Screen
    And I click Discount as "<Discount22>"
    And I click Back button on Discount Screen
    Then I should see orderscreen with menu item prize as "<SubTotal1>"
    Then I should see the tax amount reflected to the check as "<Tax2>"
    Then I should see the Discount amount reflected to the check as "<Discount2>"
    Then I should see orderscreen with menu item Total as "<Total2>"
    And I click Payment button in the Order Management Screen
    And I click other button from the payment method popup
    And I click Submit button on the Payment Window
#    Then I should see the order type window
    And I closed the order type window
  #  And I click log off button in order screen
   # Examples:
    #  | order_type | Menu_Item2 | Modifier2 |Discount11            | SubTotal1    | Tax1       | Discount1 |Total1       |Discount22|Tax2       | Discount2 |Total2       |
     # | QSR        |  Ravioli | Butter   |CB-BeforeTax-Percentage10 | TL 3.800,00 | TL 342,00 | TL 380,00 | TL 3.762,00 | CB-BeforeTax-Amount1000 | TL 280,00 | TL 1.000,00 | TL 3.080,00 |
#
#  Scenario Outline: Check Payment through Other payment - Check with discount(check based - Before tax) as Amount
#    Then I should see service type as "<order_type>"
#    And I select Pasta as category
#    And I select menu item as "<Menu_Item>"
#    And I select modifier as "<Modifier>"
#    And I click Done to get back
#    And I select menu item as "<Menu_Item>"
#    And I select modifier as "<Modifier>"
#    And I click Done to get back
#    And I select Discount on the Order screen
#    Then I should see Check Based Discount Screen
#    And I click Discount as "<Discount2>"
#    And I click Back button on Discount Screen
#    Then I should see orderscreen with menu item prize as "<SubTotal>"
#    Then I should see the tax amount reflected to the check as "<Tax1>"
#    Then I should see the Discount amount reflected to the check as "<Discount3>"
#    Then I should see orderscreen with menu item Total as "<Total1>"
#    And I click Payment button in the Order Management Screen
#    And I click other button from the payment method popup
#    And I click Submit button on the Payment Window
#    And I closed the order type window
#    Examples:
#      | order_type | Menu_Item | Modifier |Discount2            | SubTotal    | Tax1       | Discount3 |Total1       |
#      | QSR        |  Ravioli | Butter   |CB-BeforeTax-Amount1000 | TL 3.800,00 | TL 280,00 | TL 1.000,00 | TL 3.080,00 |

 # Scenario Outline: qsr Check Payment through Other payment - Check with discount(check based - Before tax) as Set Price
    Then I should see service type as "<order_type>"
    And I select category as "Menu"
    And I select menu item as "<Menu_Item3>"
    And I select menu item as "<Menu_Item3>"
    And I select Discount on the Order screen
    Then I should see Check Based Discount Screen
    And I click Discount as "<Discount33>"
    And I click Back button on Discount Screen
    Then I should see orderscreen with menu item prize as "<SubTotal3>"
    Then I should see the tax amount reflected to the check as "<Tax3>"
    Then I should see the Discount amount reflected to the check as "<Discount3>"
    Then I should see orderscreen with menu item Total as "<Total3>"
    And I click Payment button in the Order Management Screen
    And I click other button from the payment method popup
    And I click Submit button on the Payment Window
#    Then I should see the order type window
    And I closed the order type window
 #   And I click log off button in order screen
  #  Examples:
   #   | order_type | Menu_Item3  |Discount33            | SubTotal3    | Tax3       | Discount3 |Total3       |
    #  | QSR        |  cake    |CB-BeforeTax-SetPrice1000 | TL 1.500,00 | TL 100,00 | TL 500,00 | TL 1.100,00 |


  #Scenario Outline:  qsr Check Payment through Other payment - Check with discount(check based - Before tax) as Free Item
    Then I should see service type as "<order_type>"
    And I select Desserts as category
    And I select menu item as "<Menu_Item4>"
    And I select Discount on the Order screen
    Then I should see Check Based Discount Screen
    And I click Discount as "<Discount44>"
    And I click Back button on Discount Screen
    Then I should see orderscreen with as Onion Rings EACH
    Then I should see discount as "<Discount44>" on the order screen
    Then I should see orderscreen with menu item prize as "<SubTotal4>"
    Then I should see the tax amount reflected to the check as "<Tax4>"
    Then I should see orderscreen with menu item Total without Discount or Tax as "<Total4>"
    And I click Payment button in the Order Management Screen
    And I click other button from the payment method popup
    And I click Submit button on the Payment Window
#    Then I should see the order type window
    And I closed the order type window
    And I click log off button in order screen
    Examples:
      | order_type |Menu_Item2 | Modifier2 |Discount11                | SubTotal1    | Tax1       | Discount1 |Total1       |Discount22               |Tax2       | Discount2 |Total2       | Menu_Item3 |Discount33               | SubTotal3   | Tax3      | Discount3 |Total3       |Menu_Item4     |Discount44             | SubTotal4    | Tax4       | Total4       |
      | QSR        | Ravioli   | Butter    |CB-BeforeTax-Percentage10 | $ 28.00      | $ 2.52     | $ 2.80    | $ 27.72     | CB-BeforeTax-Amount1000 | $ 2.70    | $ 1.00    | $ 29.70     | cake       |CB-BeforeTax-SetPrice1000| $ 16.00     | $ 1.00    | $ 6.00    | $ 11.00     | Cheesecake    |  CB-BeforeTax-Free300 | $ 17.00      | $ 1.70     | $ 18.70      |

  @RegressionQSR3
  Scenario Outline: qsr Check Payment through Other Payment - Check with open item discount as amount and safety limit in Whole Value as 20 (After Tax)
    Then I should see service type as "<order_type>"
    And I select category as "Menu"
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
    And I pass the amount on open discount for open item discount safety percentage whole value as 20 for "<Discount1>"
    Then I should see discount applied on order screen
    Then I should see orderscreen with menu item prize as "<SubTotal3>"
    Then I should see the tax amount reflected to the check as "<Tax3>"
    Then I should see the Discount amount reflected to the check as "<Discounttxt>"
    Then I should see orderscreen with menu item Total as "<Total3>"
    And I click Payment button in the Order Management Screen
    And I click other button from the payment method popup
    And I click Submit button on the Payment Window
#    Then I should see the order type window
    And I closed the order type window
  #  And I click log off button in order screen
  #  Examples:
   #   |order_type|Menu_Item|course_name |open_Item | SubTotal3 | Tax3 | Discounttxt | Total3 | Discount1|
   #   | QSR        |Dosa | SALAD |onion | TL 185,00 | TL 17,73 | TL 20,00 | TL 175,00  | After   |

  #Scenario Outline: qsr Check Payment through Other Payment - Check with open item discount as amount and safety limit in Decimal value as 20.50 (After Tax)
    Then I should see service type as "<order_type>"
    And I select category as "Menu"
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
    And I pass the amount on open discount for open item discount safety percentage decimal value as 20.50 for1 "<Discount1>"
    Then I should see discount applied on order screen
    Then I should see orderscreen with menu item prize as "<SubTotal>"
    Then I should see the tax amount reflected to the check as "<Tax>"
    Then I should see the Discount amount reflected to the check as "<Discount>"
    Then I should see orderscreen with menu item Total as "<Total>"
    And I click Payment button in the Order Management Screen
    And I click other button from the payment method popup
    And I click Submit button on the Payment Window
#    Then I should see the order type window
    And I closed the order type window
    #Check Payment through Other Payment - Check with open item discount as Percentage (After Tax)
    Then I should see service type as "<order_type>"
    And I select category as "Menu"
    And I select menu item as "<Menu_Item>"
    And I click menu item as "<Menu_Item>" to see Menu option screen
    And I click Open Item button
    Then I should see open item screen
    And I click Coursing Name text field for Menu option
    And I swipe to "<course_name1>" as Coursing Name
    And I pass course name as "<open_Item>"
    And I tap Price text field for menu option
    And I enter the price with sale
    And I click Continue button on the Open Item Price numbers popup
    And I click Done button on the open item window
    Then I should navigate to Order Management screen and see the added open item as "<open_Item>"
    And I click open item as "<open_Item>" to see Menu option screen
    And I click Open Discount on menu option
    Then I should see Open discount Screen
    And I pass the amount on open discount for open item discount as discount Percentage for "<Discount1>"
    Then I should see discount applied on order screen
    Then I should see orderscreen with menu item prize as "<SubTotal>"
    Then I should see the tax amount reflected to the check as "<Tax>"
    Then I should see the Discount amount reflected to the check as "<Discount2>"
    Then I should see orderscreen with menu item Total as "<Total1>"
    And I click Payment button in the Order Management Screen
    And I click other button from the payment method popup
    And I click Submit button on the Payment Window
#    Then I should see the order type window
    And I closed the order type window
    And I click log off button in order screen
    Examples:
      |order_type |Menu_Item|course_name |open_Item | SubTotal | Tax       | Discount | Total   | Discount1 |course_name1  |Discount2 | Total1    | SubTotal3 | Tax3     | Discounttxt | Total3     |
      | QSR       |Dosa     |  SALAD     |onion     | $ 51.00  | $ 5.10    | $ 20.50  | $ 35.60 | After     |DESSERT       |$ 0.50    | $ 55.60   |$ 51.00    | $ 5.10   | $ 20.00     | $ 36.10    |

  @RegressionQSR3
  Scenario Outline: qsr Check Payment through Other Payment - Check with open item discount as amount and safety limit in Decimal Value as 20.50(Before Tax)
    Then I should see service type as "<order_type>"
    And I select category as "Menu"
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
    And I pass the amount on open discount for open item discount safety percentage decimal value as 20.50 for "<Discount1>"
    Then I should see discount applied on order screen
    Then I should see orderscreen with menu item prize as "<SubTotal3>"
    Then I should see the tax amount reflected to the check as "<Tax3>"
    Then I should see the Discount amount reflected to the check as "<Discount3>"
    Then I should see orderscreen with menu item Total as "<Total3>"
    And I click Payment button in the Order Management Screen
    And I click other button from the payment method popup
    And I click Submit button on the Payment Window
#    Then I should see the order type window
    And I closed the order type window
  #  And I click log off button in order screen
  #  Examples:
   #   |order_type |Menu_Item|course_name |open_Item | SubTotal | Tax       | Discount | Total | Discount1 |
    #  | QSR     |Dosa |  SALAD     |onion     | TL 185,00 | TL 15,68 | TL 20,50  | TL 172,45 | Before |

  #Scenario Outline:Qsr Check Payment through Other Payment - Check with open item discount as amount and safety limit in Whole Value as 20(Before Tax)
    Then I should see service type as "<order_type>"
    And I select category as "Menu"
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
    And I pass the amount on open discount for open item discount safety percentage whole value as 20 for1 "<Discount1>"
    Then I should see discount applied on order screen
    Then I should see orderscreen with menu item prize as "<SubTotal>"
    Then I should see the tax amount reflected to the check as "<Tax>"
    Then I should see the Discount amount reflected to the check as "<Discount>"
    Then I should see orderscreen with menu item Total as "<Total>"
    And I click Payment button in the Order Management Screen
    And I click other button from the payment method popup
    And I click Submit button on the Payment Window
#    Then I should see the order type window
    And I closed the order type window
    #Check Payment through Other Payment - Check with open item discount as Percentage (Before Tax)
    Then I should see service type as "<order_type>"
    And I select category as "Menu"
    And I select menu item as "<Menu_Item>"
    And I click menu item as "<Menu_Item>" to see Menu option screen
    And I click Open Item button
    Then I should see open item screen
    And I click Coursing Name text field for Menu option
    And I swipe to "<course_name1>" as Coursing Name
    And I pass course name as "<open_Item>"
    And I tap Price text field for menu option
    And I enter the price with sale
    And I click Continue button on the Open Item Price numbers popup
    And I click Done button on the open item window
    Then I should navigate to Order Management screen and see the added open item as "<open_Item>"
    And I click open item as "<open_Item>" to see Menu option screen
    And I click Open Discount on menu option
    Then I should see Open discount Screen
    And I pass the amount on open discount for open item discount as discount Percentage for "<Discount1>"
    Then I should see discount applied on order screen
    Then I should see orderscreen with menu item prize as "<SubTotal>"
    Then I should see the tax amount reflected to the check as "<Tax1>"
    Then I should see the Discount amount reflected to the check as "<Discount2>"
    Then I should see orderscreen with menu item Total as "<Total1>"
    And I click Payment button in the Order Management Screen
    And I click other button from the payment method popup
    And I click Submit button on the Payment Window
#    Then I should see the order type window
    And I closed the order type window
    And I click log off button in order screen
    Examples:
      |order_type|Menu_Item|course_name |open_Item | SubTotal  | Tax      | Discount | Total     | Discount1 |course_name1 |Tax1       | Discount2 | Total1     |  SubTotal3 | Tax3       | Discount3 | Total3  |
      | QSR      |  Dosa   |  SALAD     |onion     | $ 51.00   |$ 3.10    | $ 20.00  |$ 34.10    | Before    |DESSERT      | $ 5.05    | $ 0.50    | $ 55.55    | $ 51.00    | $ 3.05     | $ 20.50   | $ 33.55 |


#  Scenario Outline:qsr - Check Payment through Other Payment - Check with open check discount as amount and safety limit in Whole Value as 20(After Tax)
#    Then I should see service type as "<order_type>"
#    And I select category as "Menu"
#    And I select menu item as "<Menu_Item>"
#    And I change the Quantity of menu Item as "7"
#    And I click Options button
#    Then I should see the Check Options screen
#    And I click discount on check option screen
#    And I select open check discount
#    Then I should see Open discount Screen
#    And I pass the amount on open discount for open check discount safety percentage whole value as 20 for "<Discount1>"
#    Then I should see orderscreen with open check discount
#    Then I should see orderscreen with menu item prize as "<SubTotal>"
#    Then I should see the tax amount reflected to the check as "<Tax>"
#    Then I should see the Discount amount reflected to the check as "<Discount>"
#    Then I should see orderscreen with menu item Total as "<Total>"
#    And I click Payment button in the Order Management Screen
#    And I click other button from the payment method popup
#    And I click Submit button on the Payment Window
##    Then I should see the order type window
#    And I closed the order type window
#    #Check Payment through Other payment - Check with open Check discount as amount and safety limit in decimal precision (After Tax)
#    Then I should see service type as "<order_type>"
#    And I select category as "Menu"
#    And I select menu item as "<Menu_Item>"
#    And I change the Quantity of menu Item as "7"
#    And I click Options button
#    Then I should see the Check Options screen
#    And I click discount on check option screen
#    And I select open check discount
#    Then I should see Open discount Screen
#    And I pass the amount on open discount for open check discount safety limit percentage decimal precision as 20.50 for "<Discount1>"
#    Then I should see orderscreen with open check discount
#    Then I should see orderscreen with menu item prize as "<SubTotal>"
#    Then I should see the tax amount reflected to the check as "<Tax>"
#    Then I should see the Discount amount reflected to the check as "<Discount2>"
#    Then I should see orderscreen with menu item Total as "<Total1>"
#    And I click Payment button in the Order Management Screen
#    And I click other button from the payment method popup
#    And I click Submit button on the Payment Window
##    Then I should see the order type window
#    And I closed the order type window
#    #Check Payment through Other payment - Check with open Check discount as percentage (After Tax)
#    Then I should see service type as "<order_type>"
#    And I select category as "Menu"
#    And I select menu item as "<Menu_Item>"
#    And I change the Quantity of menu Item as "7"
#    And I click Options button
#    Then I should see the Check Options screen
#    And I click discount on check option screen
#    And I select open check discount
#    Then I should see Open discount Screen
#    And I pass the amount on open discount for open check discount percentage as 20 for "<Discount1>"
#    Then I should see orderscreen with open check discount
#    Then I should see orderscreen with menu item prize as "<SubTotal>"
#    Then I should see the tax amount reflected to the check as "<Tax>"
#    Then I should see the Discount amount reflected to the check as "<Discount3>"
#    Then I should see orderscreen with menu item Total as "<Total2>"
#    And I click Payment button in the Order Management Screen
#    And I click other button from the payment method popup
#    And I click Submit button on the Payment Window
##    Then I should see the order type window
#    And I closed the order type window
#    And I click log off button in order screen
#    Examples:
#      |order_type|Menu_Item|  SubTotal | Tax       | Discount | Total   | Discount1 |Discount2 | Total1  |Discount3 | Total2  |
#      | QSR      |Halwa    |  $ 70.00  | $ 7.00    | $ 20.00  | $ 57.00 | After     | $ 20.50  | $ 56.50 |$ 14.00   | $ 63.00 |
#
#
#  Scenario Outline:qsr - Check Payment through Other payment - Check with open Check discount as amount and safety limit in decimal precision(Before Tax)
#    Then I should see service type as "<order_type>"
#    And I select category as "Menu"
#    And I select menu item as "<Menu_Item>"
#    And I change the Quantity of menu Item as "7"
#    And I click Options button
#    Then I should see the Check Options screen
#    And I click discount on check option screen
#    And I select open check discount
#    Then I should see Open discount Screen
#    And I pass the amount on open discount for open check discount safety limit percentage decimal precision as 20.50 for "<Discount1>"
#    Then I should see orderscreen with open check discount
#    Then I should see orderscreen with menu item prize as "<SubTotal3>"
#    Then I should see the tax amount reflected to the check as "<Tax3>"
#    Then I should see the Discount amount reflected to the check as "<Discount3>"
#    Then I should see orderscreen with menu item Total as "<Total3>"
#    And I click Payment button in the Order Management Screen
#    And I click other button from the payment method popup
#    And I click Submit button on the Payment Window
##    Then I should see the order type window
#    And I closed the order type window
#   # And I click log off button in order screen
#   # Examples:
#    #  |order_type |Menu_Item|  SubTotal | Tax       | Discount | Total | Discount1 |
#     # | QSR      |Halwa |   TL 1.000,00 | TL 97,95   | TL 20,50  | TL 1.077,45 | Before |
#
# # Scenario Outline: Check Payment through Other payment -  Check with open Check discount as amount and safety limit in whole value (Before Tax)
#    Then I should see service type as "<order_type>"
#    And I select category as "Menu"
#    And I select menu item as "<Menu_Item>"
#    And I change the Quantity of menu Item as "7"
#    And I click Options button
#    Then I should see the Check Options screen
#    And I click discount on check option screen
#    And I select open check discount
#    Then I should see Open discount Screen
#    And I pass the amount on open discount for open check discount safety percentage whole value as 20 for "<Discount1>"
#    Then I should see orderscreen with open check discount
#    Then I should see orderscreen with menu item prize as "<SubTotal>"
#    Then I should see the tax amount reflected to the check as "<Tax>"
#    Then I should see the Discount amount reflected to the check as "<Discount>"
#    Then I should see orderscreen with menu item Total as "<Total>"
#    And I click Payment button in the Order Management Screen
#    And I click other button from the payment method popup
#    And I click Submit button on the Payment Window
##    Then I should see the order type window
#    And I closed the order type window
#    #Check Payment through Other payment - Check with open Check discount as percentage (Before Tax)
#    Then I should see service type as "<order_type>"
#    And I select category as "Menu"
#    And I select menu item as "<Menu_Item>"
#    And I change the Quantity of menu Item as "7"
#    And I click Options button
#    Then I should see the Check Options screen
#    And I click discount on check option screen
#    And I select open check discount
#    Then I should see Open discount Screen
#    And I pass the amount on open discount for open check discount percentage as 20 for "<Discount1>"
#    Then I should see orderscreen with open check discount
#    Then I should see orderscreen with menu item prize as "<SubTotal>"
#    Then I should see the tax amount reflected to the check as "<Tax1>"
#    Then I should see the Discount amount reflected to the check as "<Discount2>"
#    Then I should see orderscreen with menu item Total as "<Total1>"
#    And I click Payment button in the Order Management Screen
#    And I click other button from the payment method popup
#    And I click Submit button on the Payment Window
##    Then I should see the order type window
#    And I closed the order type window
#    And I click log off button in order screen
#    Examples:
#      |order_type |Menu_Item|   SubTotal | Tax      | Discount | Total       | Discount1 | Tax1    | Discount2 | Total1   | SubTotal3   | Tax3     | Discount3 | Total3      |
#      | QSR       | Halwa   | $ 70.00    | $ 5.00   | $ 20.00  | $ 55.00     | Before    |$ 5.60   | $ 14.00   | $ 61.60  | $ 70.00     | $ 4.95   | $ 20.50   | $ 54.45     |

  @RegressionQSR3
  Scenario Outline:qsr - Check Payment through Other payment - Check with Mix&Match discount as Set Price(After Tax)
    Then I should see service type as "<order_type>"
    And I select category as "Menu"
    And I select menu item as "<Menu_Item>"
    And I select menu item as "<Menu_Item>"
    And I select Discount on the Order screen
    Then I should see Check Based Discount Screen
    And I click Discount as "<Discount1>"
    And I click Back button on Discount Screen
    Then I should see orderscreen with menu item prize as "<SubTotal>"
    Then I should see the tax amount reflected to the check as "<Tax>"
    Then I should see the Discount amount reflected to the check as "<Discount>"
    Then I should see orderscreen with menu item Total as "<Total>"
    And I click Payment button in the Order Management Screen
    And I click other button from the payment method popup
    And I click Submit button on the Payment Window
#    Then I should see the order type window
    And I closed the order type window
    #Check Payment through Other payment - Check with Mix&Match discount as Set Each Item Price(After Tax)
    Then I should see service type as "<order_type>"
    And I select category as "Menu"
    And I select menu item as "<Menu_Item>"
    And I select menu item as "<Menu_Item>"
    And I select Discount on the Order screen
    Then I should see Check Based Discount Screen
    And I click Discount as "<Discount3>"
    And I click Back button on Discount Screen
    Then I should see orderscreen with menu item prize as "<SubTotal>"
    Then I should see the tax amount reflected to the check as "<Tax>"
    Then I should see the Discount amount reflected to the check as "<Discount2>"
    Then I should see orderscreen with menu item Total as "<Total1>"
    And I click Payment button in the Order Management Screen
    And I click other button from the payment method popup
    And I click Submit button on the Payment Window
#    Then I should see the order type window
    And I closed the order type window
    And I click log off button in order screen
    Examples:
      |order_type|Menu_Item | SubTotal    | Tax       | Discount  | Total       | Discount1              |Discount2  | Total1      | Discount3                |
      | QSR       |  Halwa  | $ 20.00     | $ 2.00    | $ 8.00    | $ 14.00     | CheckMixMatchSP(After) |$ 2.00     | $ 20.00     | CheckMixMatchSEIP(After) |

  @RegressionQSR3
  Scenario Outline:qsr -Check Payment through Other payment - Check with Mix&Match discount as Set Percentage(Most Expensive)(After tax)
    Then I should see service type as "<order_type>"
    And I select category as "Menu"
    And I select menu item as "<Menu_Item2>"
    And I select menu item as "<Menu_Item3>"
    And I select Discount on the Order screen
    Then I should see Check Based Discount Screen
    And I click Discount as "<Discount3>"
    And I click Back button on Discount Screen
    And I compare menu price as "<Menu2>" "<Menu3>" and applied "<Discount3>" on "<expensive1>" menu Item
    Then I should see orderscreen with menu item prize as "<SubTotal2>"
    Then I should see the tax amount reflected to the check as "<Tax2>"
    Then I should see the Discount amount reflected to the check as "<Discount2>"
    Then I should see orderscreen with menu item Total as "<Total2>"
    And I click Payment button in the Order Management Screen
    And I click other button from the payment method popup
    And I click Submit button on the Payment Window
#    Then I should see the order type window
    And I closed the order type window
    #And I click log off button in order screen
   # Examples:
    #  |order_type |Menu_Item|Menu_Item1|Menu   |Menu1|  SubTotal     | Tax       | Discount | Total | Discount1 | expensive |
    #  | QSR       |  Halwa  |cake       |1.000,00 |1.500,00| TL 2.500,00 | TL 250,00   | TL 750,00  | TL 2.000,00 | CheckMixMatchSPerM(After) |Most|


  #Scenario Outline:Check Payment through Other payment - Check with Mix&Match discount as Set Percentage(Least Expensive)(After tax)
    Then I should see service type as "<order_type>"
    And I select Desserts as category
    And I select menu item as "<Menu_Item>"
    And I select menu item as "<Menu_Item1>"
    And I select Discount on the Order screen
    Then I should see Check Based Discount Screen
    And I click Discount as "<Discount1>"
    And I click Back button on Discount Screen
    And I compare menu price as "<Menu>" "<Menu1>" and applied "<Discount1>" on "<expensive>" menu Item
    Then I should see orderscreen with menu item prize as "<SubTotal>"
    Then I should see the tax amount reflected to the check as "<Tax>"
    Then I should see the Discount amount reflected to the check as "<Discount>"
    Then I should see orderscreen with menu item Total as "<Total>"
    And I click Payment button in the Order Management Screen
    And I click other button from the payment method popup
    And I click Submit button on the Payment Window
#    Then I should see the order type window
    And I closed the order type window
    And I click log off button in order screen
    Examples:
      |order_type |Menu_Item    |Menu_Item1        |Menu |Menu1|  SubTotal    | Tax       | Discount   | Total       | Discount1                   | expensive | Menu_Item2|Menu_Item3|Menu2    |Menu3   |  SubTotal2  | Tax2      | Discount2 | Total2      | Discount3                 | expensive1 |
      | QSR       |  Cheesecake |Pumpkin Cheese Cake|15.00|11.00 |$ 26.00     | $ 2.60    | $ 5.50     | $ 23.10     | CheckMixMatchSPerL(After) |Least      |Halwa     |cake       |10.00    |8.00    | $ 18.00     | $ 1.80    | $ 5.00    | $ 14.80     | CheckMixMatchSPerM(After) |Most        |

  @RegressionQSR3
  Scenario Outline:qsr - Check Payment through Other payment - Check with Mix&Match discount as Set Price as 500(Before tax)
    Then I should see service type as "<order_type>"
    And I select category as "Menu"
    And I select menu item as "<Menu_Item>"
    And I select menu item as "<Menu_Item1>"
    And I select Discount on the Order screen
    Then I should see Check Based Discount Screen
    And I click Discount as "<Discount1>"
    And I click Back button on Discount Screen
    Then I should see discount as "<Discount1>" on the order screen
    Then I should see orderscreen with menu item prize as "<SubTotal>"
    Then I should see the tax amount reflected to the check as "<Tax>"
    Then I should see the Discount amount reflected to the check as "<Discount>"
    Then I should see orderscreen with menu item Total as "<Total>"
    And I click Payment button in the Order Management Screen
    And I click other button from the payment method popup
    And I click Submit button on the Payment Window
#    Then I should see the order type window
    And I closed the order type window
    #Check Payment through Other payment - Check with Mix&Match discount as Set Each Item Price as 500(Before tax)
    Then I should see service type as "<order_type>"
    And I select category as "Menu"
    And I select menu item as "<Menu_Item>"
    And I select menu item as "<Menu_Item1>"
    And I select Discount on the Order screen
    Then I should see Check Based Discount Screen
    And I click Discount as "<Discount2>"
    And I click Back button on Discount Screen
    Then I should see discount as "<Discount2>" on the order screen
    Then I should see orderscreen with menu item prize as "<SubTotal>"
    Then I should see the tax amount reflected to the check as "<Tax1>"
    Then I should see the Discount amount reflected to the check as "<Discount12>"
    Then I should see orderscreen with menu item Total as "<Total1>"
    And I click Payment button in the Order Management Screen
    And I click other button from the payment method popup
    And I click Submit button on the Payment Window
#    Then I should see the order type window
    And I closed the order type window
    And I click log off button in order screen
    Examples:
      |order_type |Menu_Item | Menu_Item1|  SubTotal    | Tax       | Discount   | Total       | Discount1               |Discount2                 |  Tax1      | Discount12   | Total1      |
      | QSR       | cake     | Halwa     |  $ 18.00     | $ 1.00    | $ 8.00     | $ 11.00     | CheckMixMatchSP(Before) |CheckMixMatchSEIP(Before) |  $ 1.60    | $ 2.00      | $ 17.60     |

  @RegressionQSR3
  Scenario Outline:qsr -Check Payment through Other payment - Check with Mix&Match discount as Set Percentage Most Expensive (Before tax)
    Then I should see service type as "<order_type>"
    And I select category as "Menu"
    And I select menu item as "<Menu_Item2>"
    And I select menu item as "<Menu_Item3>"
    And I select Discount on the Order screen
    Then I should see Check Based Discount Screen
    And I click Discount as "<Discount11>"
    And I click Back button on Discount Screen
    And I compare menu price as "<Menu2>" "<Menu3>" and applied "<Discount11>" on "<expensive1>" menu Item
    Then I should see orderscreen with menu item prize as "<SubTotal2>"
    Then I should see the tax amount reflected to the check as "<Tax2>"
    Then I should see the Discount amount reflected to the check as "<Discount2>"
    Then I should see orderscreen with menu item Total as "<Total2>"
    And I click Payment button in the Order Management Screen
    And I click other button from the payment method popup
    And I click Submit button on the Payment Window
#    Then I should see the order type window
    And I closed the order type window
  #  And I click log off button in order screen
    #Examples:
   #   |order_type|Menu_Item | Menu_Item1  |Menu   |Menu1      |  SubTotal    | Tax       | Discount   | Total        | Discount1 | expensive |
    #  | QSR      | cake     | Halwa       |1.500,00 |1.000,00 | TL 2.500,00 | TL 175,00 | TL 750,00  | TL 1.925,00 | CheckMixMatchSPerM(Befor) |Most|


  #Scenario Outline:Check Payment through Other payment - Check with Mix&Match discount as Set Percentage Least Expensive (Before tax)
    Then I should see service type as "<order_type>"
    And I select Desserts as category
    And I select menu item as "<Menu_Item>"
    And I select menu item as "<Menu_Item1>"
    And I select Discount on the Order screen
    Then I should see Check Based Discount Screen
    And I click Discount as "<Discount1>"
    And I click Back button on Discount Screen
    And I compare menu price as "<Menu>" "<Menu1>" and applied "<Discount1>" on "<expensive>" menu Item
    Then I should see orderscreen with menu item prize as "<SubTotal>"
    Then I should see the tax amount reflected to the check as "<Tax>"
    Then I should see the Discount amount reflected to the check as "<Discount>"
    Then I should see orderscreen with menu item Total as "<Total>"
    And I click Payment button in the Order Management Screen
    And I click other button from the payment method popup
    And I click Submit button on the Payment Window
#    Then I should see the order type window
    And I closed the order type window
    And I click log off button in order screen
    Examples:
      |order_type |Menu_Item | Menu_Item1           | Menu | Menu1 |expensive| SubTotal    | Tax       | Discount   | Total        | Discount1                 |Menu_Item2 | Menu_Item3  |Menu2    |Menu3    |  SubTotal2  | Tax2      | Discount2  | Total2      | Discount11                | expensive1 |
      | QSR     | Cheesecake  | Pumpkin Cheese Cake |15.00 |11.00  |Least    | $ 26.00     | $ 2.05    | $ 5.50     | $ 22.55      | CheckMixMatchSPerL(Befor)  |cake       | Halwa       |8.00     |10.00    | $ 18.00     | $ 1.30    | $ 5.00     | $ 14.30     | CheckMixMatchSPerM(Befor) |Most        |

  @RegressionQSR3
  Scenario Outline: qsr -Check with vary gratuity - other payment
    Then I should see service type as "<order_type>"
    And I select category as "Menu"
    And I select menu item as "<Menu_Item>"
    And I click Options button
    Then I should see the Check Options screen
    And I click Gratuity button
    Then I should see Add Gratuity screen
    And I click Gratuity varying button
    Then I should see enter Percentage popup
    And I pass the value and click Apply button as "<Percentage>"
    Then I Should get back to the Order Screen
    Then I should see orderscreen with menu item prize as "<SubTotal>"
    Then I should see the tax amount reflected to the check as "<Tax>"
    Then I should see the Gratuity amount reflected to the check as "<Gratuity>"
    Then I should see orderscreen with menu item Total as "<Total>"
    And I click Payment button in the Order Management Screen
    And I click other button from the payment method popup
    And I click Submit button on the Payment Window
#    Then I should see the order type window
    And I closed the order type window
    #Check With Fixed Gratuity - other payment
    Then I should see service type as "<order_type>"
    And I select category as "Menu"
    And I select menu item as "<Menu_Item>"
    And I click Options button
    Then I should see the Check Options screen
    And I click Gratuity button
    Then I should see Add Gratuity screen
    And I click Gratuity Fixed button
    Then I Should get back to the Order Screen
    Then I should see orderscreen with menu item prize as "<SubTotal>"
    Then I should see the tax amount reflected to the check as "<Tax>"
    Then I should see the Gratuity amount reflected to the check as "<Gratuity1>"
    Then I should see orderscreen with menu item Total as "<Total1>"
    And I click Payment button in the Order Management Screen
    And I click other button from the payment method popup
    And I click Submit button on the Payment Window
#    Then I should see the order type window
    And I closed the order type window
    And I click log off button in order screen
    Examples:
      |order_type| Menu_Item   | Percentage | SubTotal   |    Tax    | Gratuity     | Total   |Gratuity1 | Total1  |
      | QSR       | Halwa       | 8         | $ 10.00    | $ 1.00    |  $ 0.80      | $ 11.80 | $ 1.00   | $ 12.00 |

  @RegressionQSR3
  Scenario Outline:Qsr- Check Payment through other payment - Check with tax exempt and with customer
    Then I should see service type as "<order_type>"
    And I click Add Customer Button
    And I search for "<customer_name>"
    When I click "<customer_name>" to select customer for the seat
    And I select category as "Menu"
    And I select menu item as "<Menu_Item>"
    Then I should see orderscreen with menu item prize as "<SubTotal>"
    Then I should see the tax amount reflected to the check as "<Tax>"
    Then I should see orderscreen with menu item Total without Discount or Tax as "<Total>"
    And I click Options button
    Then I should see the Check Options screen
    And I click Tax Exempt Button
#    Then I should see tax exempt reasons
#    When I select School as reason
    Then I Should get back to the Order Screen
    Then I should see orderscreen with menu item prize as "<SubTotal>"
    And I should see the tax reflected to the check
    Then I should see orderscreen with menu item Total without Tax Exempt as "<Total1>"
    And I click Payment button in the Order Management Screen
    And I click other button from the payment method popup
    And I click Submit button on the Payment Window
#    Then I should see the order type window
    And I closed the order type window
    #Check Payment through other payment - Check with tax exempt and without customer
    Then I should see service type as "<order_type>"
    And I select category as "Menu"
    And I select menu item as "<Menu_Item>"
    Then I should see orderscreen with menu item prize as "<SubTotal>"
    Then I should see the tax amount reflected to the check as "<Tax>"
    Then I should see orderscreen with menu item Total without Discount or Tax as "<Total>"
    And I click Options button
    Then I should see the Check Options screen
    And I click Tax Exempt Button
#    Then I should see tax exempt reasons
#    When I select School as reason
    Then I Should get back to the Order Screen
    Then I should see orderscreen with menu item prize as "<SubTotal>"
    And I should see the tax reflected to the check
    Then I should see orderscreen with menu item Total without Tax Exempt as "<Total1>"
    And I click Payment button in the Order Management Screen
    And I click other button from the payment method popup
    And I click Submit button on the Payment Window
#    Then I should see the order type window
    And I closed the order type window
    #Check Payment through other payment - Check with tax exempt and without customer through payment screen
#    Then I should see service type as "<order_type>"
#    And I select category as "Menu"
#    And I select menu item as "<Menu_Item>"
#    Then I should see orderscreen with menu item prize as "<SubTotal>"
#    Then I should see the tax amount reflected to the check as "<Tax>"
#    Then I should see orderscreen with menu item Total without Discount or Tax as "<Total>"
#    And I click Payment button in the Order Management Screen
#    And I click Tax Exempt Button from the Payment Screen
##    Then I should see tax exempt reasons
##    When I select School as reason
#    Then I Should get back to the Order Screen
#    Then I should see orderscreen with menu item prize as "<SubTotal>"
#    And I should see the tax reflected to the check
#    Then I should see orderscreen with menu item Total without Tax Exempt as "<Total1>"
#    And I click Payment button in the Order Management Screen
#    And I click other button from the payment method popup
#    And I click Submit button on the Payment Window
##    Then I should see the order type window
#    And I closed the order type window
    #Check Payment through other payment - Check with tax exempt for pre defined customer
    Then I should see service type as "<order_type>"
    And I click Add Customer Button
    And I search for "<customer_name>"
    When I click "<customer_name>" to select customer for the seat
    And I click the customer name on the order screen
    Then I should see the customer profile window
    And I select tax exempt on customer profile screen
    And I click the Save button
    Then I Should get back to the Order Screen
    And I select category as "Menu"
    And I select menu item as "<Menu_Item>"
    Then I should see orderscreen with menu item prize as "<SubTotal>"
    And I should see the tax reflected to the check
    Then I should see orderscreen with menu item Total without Tax Exempt as "<Total1>"
    And I click Payment button in the Order Management Screen
    And I click other button from the payment method popup
    And I click Submit button on the Payment Window
    #   Then I should see the print or send receipt
    #    And I click No thanks Button on the print receipt
#    Then I should see the order type window
    And I closed the order type window
    And I click Add Customer Button
    And I search for "<customer_name>"
    When I click "<customer_name>" to select customer for the seat
    And I click the customer name on the order screen
    Then I should see the customer profile window
    And I remove tax exempt on customer profile screen
    And I click the Save button
    Then I Should get back to the Order Screen
    And I click log off button in order screen
    Examples:
      |order_type| Menu_Item  |  SubTotal   | Tax       | Total       | Total1      |customer_name|
      | QSR      |Halwa       | $ 10.00     | $ 1.00    | $ 11.00     | $ 10.00     |tax exe      |


#  Scenario Outline:Qsr-Check Payment through other payment - Check with vary gratuity through Payment screen
#    Then I should see service type as "<order_type>"
#    And I select category as "Menu"
#    And I select menu item as "<Menu_Item1>"
#    And I click Payment button in the Order Management Screen
#    And I click add gratuity from Payment screen
#    Then I should see the Check Options screen
#    Then I should see Add Gratuity screen
#    And I click Gratuity varying button
#    Then I should see enter Percentage popup
#    And I pass the value and click Apply button
#    Then I Should get back to the Order Screen
#    Then I should see orderscreen with menu item prize as "<SubTotal1>"
#    Then I should see the tax amount reflected to the check as "<Tax1>"
#    Then I should see the Gratuity amount reflected to the check as "<Gratuity1>"
#    Then I should see orderscreen with menu item Total as "<Total1>"
#    And I click Payment button in the Order Management Screen
#    And I click other button from the payment method popup
#    And I click Submit button on the Payment Window
##    Then I should see the order type window
#    And I closed the order type window
#    #And I click log off button in order screen
#   # Examples:
#    #  | order_type| Menu_Item   | SubTotal  | Tax      | Gratuity   |Total |
#     # | QSR   | Halwa      |TL 1.000,00| TL 100,00 | TL 80,00 |TL 1.180,00 |

  @RegressionQSR3
  Scenario Outline: qsr Check Payment through other payment - Check With upcharge
    Then I should see service type as "<order_type>"
    And I select category as "FOOD"
    And I select menu item as "<Menu_Item>"
    And I select modifier as "<Modifier>"
    And I click Done to get back
    Then I should see menu with Upcharge amount on order list as "<amount>"
    And I click Payment button in the Order Management Screen
    And I click other button from the payment method popup
    And I click Submit button on the Payment Window
#    Then I should see the order type window
    And I closed the order type window
    And I click log off button in order screen
    Examples:
      | order_type | Menu_Item         | Modifier     | amount   |
      | QSR        | Fried Crab Cakes  | White Bread  | $ 18.50  |

  @RegressionQSR3
  Scenario Outline:qsr- Check Payment through side CC and customer & Merchant copy enabled without tips
    Then I should see service type as "<order_type>"
    And I get check number
    And I select category as "FOOD"
    And I select menu item as "<Menu_Item>"
    And I select modifier as "<Modifier>"
    And I click Done to get back
    And I click Payment button in the Order Management Screen
    And I click side cc button in the payment window
    Then I should see total screen
    And I click the Continue button on the Total screen
    Then I should see the Payment window
    And I click Submit button on the Payment Window
#    Then I should see the order type window
    And I closed the order type window
    #Void check Side CC payment without tips
    And I click All
    And I click Check Stats tab
    And I click Closed tab on the Check stats
    And I click the Closed check on check stats
    And I click reopen check button on the check stats screen
    Then I Should get back to the Order Screen
    And I click Payment button in the Order Management Screen
    And I click payment in the payment window
    And I click Delete button on the payment window
#    And I click Ok button in receipt printer popup
#    Then I should see transaction void successful popup
#    And I click Done button on the Popup
    And I click Exit to return to Order Management Screen
    And I click print button on the order screen
    And I click Done button on the Popup
    And I click Void button on order management screen
    Then I should see the void reason popup
    And I click void Reason on the void popup
    And I click Add Button on the void reason popup
#    Then I should see Receipt Printer popup
#    And I click Done button on the Popup
#    Then I should see the order type window
    And I closed the order type window
    And I click log off button in order screen
    Examples:
      | order_type|  Menu_Item | Modifier |
      | QSR      |  French Friese | Steak |

  @RegressionQSR3
  Scenario Outline: qsr Check Payment through Side CC and customer & Merchant copy enabled tips
    Then I should see service type as "<order_type>"
    And I get check number
    And I select category as "FOOD"
    And I select menu item as "<Menu_Item>"
    And I select modifier as "<Modifier>"
    And I click Done to get back
    And I click Payment button in the Order Management Screen
    And I click side cc button in the payment window
    Then I should see total screen
    And I click tip as 10
    Then I should see tip is added with menu total as "<Total>"
    Then I should see total amount as "<total>" on total screen
    And I click the Continue button on the Total screen
    Then I should see the Payment window
    And I click Submit button on the Payment Window
    And I closed the order type window
    #Void check side CC payment with tips
    And I click All
    And I click Check Stats tab
    And I click Closed tab on the Check stats
    And I click the Closed check on check stats
    And I click reopen check button on the check stats screen
    Then I Should get back to the Order Screen
    And I click Payment button in the Order Management Screen
    And I click payment in the payment window
    And I click Delete button on the payment window
#    And I click Ok button in receipt printer popup
#    Then I should see transaction void successful popup
#    And I click Done button on the Popup
    And I click Exit to return to Order Management Screen
    And I click print button on the order screen
    And I click Done button on the Popup
    And I click Void button on order management screen
    Then I should see the void reason popup
    And I click void Reason on the void popup
    And I click Add Button on the void reason popup
#    Then I should see Receipt Printer popup
#    And I click Done button on the Popup
#    Then I should see the order type window
    And I closed the order type window
    And I click log off button in order screen
    Examples:
      | order_type |  Menu_Item     | Modifier |Total    |total    |
      | QSR        |  French Friese | Steak    | $ 15.00 |$ 25.00  |

  @RegressionQSR3
  Scenario Outline: qsr Verify the check in Batch/Tip Adjustment for Check Payment through Side CC enabled with tips
    Then I should see service type as "<order_type>"
    And I select category as "FOOD"
    And I select menu item as "<Menu_Item>"
    And I select modifier as "<Modifier>"
    And I click Done to get back
    And I click Payment button in the Order Management Screen
    And I click side cc button in the payment window
    Then I should see total screen
    And I click custom for tip adjustment
    Then I should see tip is added with menu total as "<Total>"
    Then I should see total amount as "<total>" on total screen
    And I click the Continue button on the Total screen
    Then I should see the Payment window
    And I click Submit button on the Payment Window
    And I closed the order type window
    #Verify merchant copy bill printout of side CC payment with sign
    Then I should see service type as "<order_type>"
    And I select category as "FOOD"
    And I select menu item as "<Menu_Item>"
    And I select modifier as "<Modifier>"
    And I click Done to get back
    And I click Payment button in the Order Management Screen
    And I click side cc button in the payment window
    Then I should see total screen
    And I click custom for tip adjustment
    Then I should see tip is added with menu total as "<Total>"
    Then I should see total amount as "<total>" on total screen
    And I click the Continue button on the Total screen
    Then I should see the Payment window
    And I click Submit button on the Payment Window
    And I closed the order type window
    And I click log off button in order screen
    Examples:
      | order_type |  Menu_Item    | Modifier |  Total    |  total     |
      | QSR        | French Friese | Steak    |  $ 15.00  |  $ 25.00   |

  @RegressionQSR3
  Scenario Outline: qsr Check Payment through Side CC with discount(item based - After tax/Before) as percentage and with tip
    Then I should see service type as "<order_type>"
    And I select Pasta as category
    And I select menu item as "<Menu_Item>"
    And I select modifier as "<Modifier>"
    And I click Done to get back
    And I select Discount on the Order screen
    Then I should see Check Based Discount Screen
    And I click Discount as "<Discount>"
    And I click Back button on Discount Screen
    And I select Discount on the Order screen
    Then I should see Check Based Discount Screen
    And I click Discount as "<Discount1>"
    And I click Back button on Discount Screen
    Then I should see orderscreen with menu item prize as "<SubTotal>"
    Then I should see the tax amount reflected to the check as "<Tax>"
    Then I should see the Discount amount reflected to the check as "<Discounttxt>"
    Then I should see orderscreen with menu item Total as "<Total>"
    And I click Payment button in the Order Management Screen
    And I click side cc button in the payment window
    Then I should see total screen
    And I click custom for tip adjustment
    Then I should see tip is added with menu total as "<Total>"
    Then I should see total amount as "<total>" on total screen
    And I click the Continue button on the Total screen
    Then I should see the Payment window
    And I click Submit button on the Payment Window
    And I closed the order type window
   # And I click log off button in order screen

#  Scenario Outline: qsr Check Payment through side CC with discount(item based - After tax/Before) as amount and with tip
    Then I should see service type as "<order_type>"
    And I select Pasta as category
    And I select menu item as "<Menu_Item>"
    And I select modifier as "<Modifier>"
    And I click Done to get back
    And I select Discount on the Order screen
    Then I should see Check Based Discount Screen
    And I click Discount as "<Discount2>"
    And I click Back button on Discount Screen
    And I select Discount on the Order screen
    Then I should see Check Based Discount Screen
    And I click Discount as "<Discount21>"
    And I click Back button on Discount Screen
    Then I should see orderscreen with menu item prize as "<SubTotal1>"
    Then I should see the tax amount reflected to the check as "<Tax1>"
    Then I should see the Discount amount reflected to the check as "<Discounttxt2>"
    Then I should see orderscreen with menu item Total as "<Total1>"
    And I click Payment button in the Order Management Screen
    And I click side cc button in the payment window
    Then I should see total screen
    And I click custom for tip adjustment
    Then I should see tip is added with menu total as "<Total1>"
    Then I should see total amount as "<total1>" on total screen
    And I click the Continue button on the Total screen
    Then I should see the Payment window
    And I click Submit button on the Payment Window
#    Then I should see the order type window
    And I closed the order type window
  #  And I click log off button in order screen

#  Scenario Outline: qsr Check Payment through side CC with discount(item based - After tax/Before) as set price and with tip
    Then I should see service type as "<order_type>"
    And I select Pasta as category
    And I select menu item as "<Menu_Item>"
    And I select modifier as "<Modifier>"
    And I click Done to get back
    And I select Discount on the Order screen
    Then I should see Check Based Discount Screen
    And I click Discount as "<Discount3>"
    And I click Back button on Discount Screen
    And I select Discount on the Order screen
    Then I should see Check Based Discount Screen
    And I click Discount as "<Discount31>"
    And I click Back button on Discount Screen
    Then I should see orderscreen with menu item prize as "<SubTotal2>"
    Then I should see the tax amount reflected to the check as "<Tax2>"
    Then I should see the Discount amount reflected to the check as "<Discounttxt3>"
    Then I should see orderscreen with menu item Total as "<Total2>"
    And I click Payment button in the Order Management Screen
    And I click side cc button in the payment window
    Then I should see total screen
    And I click custom for tip adjustment
    Then I should see tip is added with menu total as "<Total2>"
    Then I should see total amount as "<total2>" on total screen
    And I click the Continue button on the Total screen
    Then I should see the Payment window
    And I click Submit button on the Payment Window
#    Then I should see the order type window
    And I closed the order type window
  #  And I click log off button in order screen

  #Scenario Outline: qsr Check Payment through side CC with discount(item based - After tax/Before) as Free item and with tip
    Then I should see service type as "<order_type>"
    And I select Pasta as category
    And I select menu item as "<Menu_Item>"
    And I select modifier as "<Modifier>"
    And I click Done to get back
    And I select Discount on the Order screen
    Then I should see Check Based Discount Screen
    And I click Discount as "<Discount4>"
    And I click Back button on Discount Screen
    And I select Discount on the Order screen
    Then I should see Check Based Discount Screen
    And I click Discount as "<Discount41>"
    And I click Back button on Discount Screen
    Then I should see orderscreen with as Onion Rings EACH
    Then I should see orderscreen with menu item prize as "<SubTotal4>"
    Then I should see the tax amount reflected to the check as "<Tax4>"
    Then I should see orderscreen with menu item Total without Discount or Tax as "<Total4>"
    And I click Payment button in the Order Management Screen
    And I click side cc button in the payment window
    Then I should see total screen
    And I click custom for tip adjustment
    Then I should see tip is added with menu total as "<Total4>"
    Then I should see total amount as "<total4>" on total screen
    And I click the Continue button on the Total screen
    Then I should see the Payment window
    And I click Submit button on the Payment Window
#    Then I should see the order type window
    And I closed the order type window
    And I click log off button in order screen

    Examples:
      | order_type |Menu_Item | Modifier |Discount                |  Discount1            |Discounttxt  | SubTotal    | Tax       | Total      |   total  |Discount2            |Discount21         |Discounttxt2 | SubTotal1    | Tax1       | Total1       |  total1       |Discount3            |  Discount31                  |Discounttxt3    | SubTotal2    | Tax2       | Total2      |  total2     |Discount4               |Discount41             | SubTotal4    | Tax4       | Total4       | total4        |
      | QSR        | Ravioli    | Butter   |IB-AfterTax-Percentage |IB-BeforeTax-Percentage|$ 2.66      | $ 14.00     | $ 1.13    | $ 12.47    |  $ 22.47 | IB-AfterTax-Amount |IB-BeforeTax-Amount |$ 2.00       | $ 14.00      | $ 1.20     | $ 13.20      |  $ 23.20      | IB-AfterTax-SetPrice500 |IB-BeforeTax-SetPrice500  |$ 13.00         | $ 14.00      | $ 0.10     | $ 1.10      |  $ 11.10    | IB-AfterTax-AsFreeItem |IB-BeforeTax-AsFreeItem| $ 16.00      | $ 1.60     | $ 17.60      |   $ 27.60     |

  @RegressionQSR3
  Scenario Outline: qsr Check Payment through side CC with discount(Check based - After tax/Before) as percentage and with tip
    Then I should see service type as "<order_type>"
    And I select Pasta as category
    And I select menu item as "<Menu_Item>"
    And I select modifier as "<Modifier>"
    And I click Done to get back
    And I select Pasta as category
    And I select menu item as "<Menu_Item>"
    And I select modifier as "<Modifier>"
    And I click Done to get back
    And I select Discount on the Order screen
    Then I should see Check Based Discount Screen
    And I click Discount as "<Discount>"
    And I click Back button on Discount Screen
    And I select Discount on the Order screen
    Then I should see Check Based Discount Screen
    And I click Discount as "<Discount11>"
    And I click Back button on Discount Screen
    Then I should see orderscreen with menu item prize as "<SubTotal>"
    Then I should see the tax amount reflected to the check as "<Tax>"
    Then I should see the Discount amount reflected to the check as "<Discounttxt>"
    Then I should see orderscreen with menu item Total as "<Total>"
    And I click Payment button in the Order Management Screen
    And I click side cc button in the payment window
    Then I should see total screen
    And I click custom for tip adjustment
    Then I should see tip is added with menu total as "<Total>"
    Then I should see total amount as "<total>" on total screen
    And I click the Continue button on the Total screen
    Then I should see the Payment window
    And I click Submit button on the Payment Window
#    Then I should see the order type window
    And I closed the order type window
   # And I click log off button in order screen

  #Scenario Outline: qsr Check Payment through side CC with discount(Check based - After tax/Before) as amount and with tip
    Then I should see service type as "<order_type>"
    And I select Pasta as category
    And I select menu item as "<Menu_Item>"
    And I select modifier as "<Modifier>"
    And I click Done to get back
    And I select menu item as "<Menu_Item>"
    And I select modifier as "<Modifier>"
    And I click Done to get back
    And I select Discount on the Order screen
    Then I should see Check Based Discount Screen
    And I click Discount as "<Discount2>"
    And I click Back button on Discount Screen
    And I select Discount on the Order screen
    Then I should see Check Based Discount Screen
    And I click Discount as "<Discount21>"
    And I click Back button on Discount Screen
    Then I should see orderscreen with menu item prize as "<SubTotal2>"
    Then I should see the tax amount reflected to the check as "<Tax2>"
    Then I should see the Discount amount reflected to the check as "<Discounttxt2>"
    Then I should see orderscreen with menu item Total as "<Total2>"
    And I click Payment button in the Order Management Screen
    And I click side cc button in the payment window
    Then I should see total screen
    And I click custom for tip adjustment
    Then I should see tip is added with menu total as "<Total2>"
    Then I should see total amount as "<total2>" on total screen
    And I click the Continue button on the Total screen
    Then I should see the Payment window
    And I click Submit button on the Payment Window
    #   Then I should see the print or send receipt
    #    And I click No thanks Button on the print receipt
#    Then I should see the order type window
    And I closed the order type window
 #   And I click log off button in order screen



 # Scenario Outline: qsr Check Payment through side CC with discount(Check based - After tax/Before) as set price and with tip
    Then I should see service type as "<order_type>"
    And I select category as "Menu"
    And I select menu item as "<Menu_Item1>"
    And I select menu item as "<Menu_Item1>"
    And I select Discount on the Order screen
    Then I should see Check Based Discount Screen
    And I click Discount as "<Discount3>"
    And I click Back button on Discount Screen
    And I select Discount on the Order screen
    Then I should see Check Based Discount Screen
    And I click Discount as "<Discount31>"
    And I click Back button on Discount Screen
    Then I should see orderscreen with menu item prize as "<SubTotal3>"
    Then I should see the tax amount reflected to the check as "<Tax3>"
    Then I should see the Discount amount reflected to the check as "<Discounttxt3>"
    Then I should see orderscreen with menu item Total as "<Total3>"
    And I click Payment button in the Order Management Screen
    And I click side cc button in the payment window
    Then I should see total screen
    And I click custom for tip adjustment
    Then I should see tip is added with menu total as "<Total3>"
    Then I should see total amount as "<total3>" on total screen
    And I click the Continue button on the Total screen
    Then I should see the Payment window
    And I click Submit button on the Payment Window
#    Then I should see the order type window
    And I closed the order type window
  #  And I click log off button in order screen

 # Scenario Outline: qsr Check Payment through side CC with discount(Check based - After tax/Before) as Free item and with tip
    Then I should see service type as "<order_type>"
    And I select Desserts as category
    And I select menu item as "<Menu_Item2>"
    And I select Discount on the Order screen
    Then I should see Check Based Discount Screen
    And I click Discount as "<Discount4>"
    And I click Back button on Discount Screen
    And I select Discount on the Order screen
    Then I should see Check Based Discount Screen
    And I click Discount as "<Discount41>"
    And I click Back button on Discount Screen
    Then I should see orderscreen with as Onion Rings EACH
    Then I should see orderscreen with menu item prize as "<SubTotal4>"
    Then I should see the tax amount reflected to the check as "<Tax4>"
    Then I should see orderscreen with menu item Total without Discount or Tax as "<Total4>"
    And I click Payment button in the Order Management Screen
    And I click side cc button in the payment window
    Then I should see total screen
    And I click custom for tip adjustment
    Then I should see tip is added with menu total as "<Total4>"
    Then I should see total amount as "<total4>" on total screen
    And I click the Continue button on the Total screen
    Then I should see the Payment window
    And I click Submit button on the Payment Window
#    Then I should see the order type window
    And I closed the order type window
    And I click log off button in order screen

    Examples:
      | order_type | Menu_Item | Modifier |Discount                 |Discount11                | SubTotal    | Tax       | Discounttxt|Total        | total        | Discount2             |Discount21              | SubTotal2   | Tax2     | Discounttxt2   | Total2    |  total2     |Menu_Item1 |Discount3               |Discount31                | SubTotal3    | Tax3    | Discounttxt3 |Total3    | total3    |Menu_Item2      |Discount4            |Discount41             | SubTotal4  | Tax4      | Total4     |   total4    |
      | QSR        |  Ravioli  | Butter   |CB-AfterTax-Percentage10 |CB-BeforeTax-Percentage10 | $ 28.00     | $ 2.27    | $ 5.32     | $ 24.95     | $ 34.95      |CB-AfterTax-Amount1000 |CB-BeforeTax-Amount1000 | $ 28.00     | $ 2.60   | $ 2.00         | $ 28.60   |  $ 38.60    | cake      |CB-AfterTaxSetPrice2500 |CB-BeforeTax-SetPrice1000 | $ 16.00      | $ 1.00  | $ 6.00       | $ 11.00  | $ 21.00   |Cheesecake      | CB-AfterTax-Free300 | CB-BeforeTax-Free300  | $ 17.00    | $ 1.70    | $ 18.70    | $ 28.70     |


#  Scenario Outline: qsr Check Payment through CC and customer & Merchant copy enabled without tipss
#    Then I should see service type as "<order_type>"
#    And I get check number
#    And I select category as "FOOD"
#    And I select menu item as "<Menu_Item>"
#    And I select modifier as "<Modifier>"
#    And I click Done to get back
#    And I click Payment button in the Order Management Screen
#    And I click credit card payment on payment window
#    Then I should see total screen
#    And I click the Continue button on the Total screen
#    Then I should see your order card screen
#    And I click manual button on the your order screen
#    And I pass the card number as "<card_number>"
#    And I pass card name as "<card_name>"
#    And I pass expire date as "<expire_date>"
#    And I click Process button on card screen
#    #  Then I should see the print or send receipt
#    #    And I click No thanks Button on the print receipt
##    And I click Ok button in receipt printer popup
##    Then I should see the order type window
#    And I closed the order type window
#    #Void check CC payment without tips
#    And I click All
#    And I click Check Stats tab
#    And I click Closed tab on the Check stats
#    And I click the Closed check on check stats
#    And I click reopen check button on the check stats screen
#    Then I Should get back to the Order Screen
#    And I click Payment button in the Order Management Screen
#    And I click payment in the payment window
#    And I click Delete button on the payment window
##    And I click Ok button in receipt printer popup
##    Then I should see transaction void successful popup
##    And I click Done button on the Popup
#    And I click Exit to return to Order Management Screen
#    And I click print button on the order screen
#    And I click Done button on the Popup
#    And I click Void button on order management screen
#    Then I should see the void reason popup
#    And I click void Reason on the void popup
#    And I click Add Button on the void reason popup
##    Then I should see Receipt Printer popup
##    And I click Done button on the Popup
##    Then I should see the order type window
#    And I closed the order type window
#    And I click log off button in order screen
#    Examples:
#      | order_type|  Menu_Item     | Modifier | card_number      | expire_date | card_name |
#      | QSR       |  French Friese | Steak    | 3530111333300000 | 1224        | JCB       |
#
#
#  Scenario Outline: Qsr Check Payment through CC and customer & Merchant copy enabled tips
#    Then I should see service type as "<order_type>"
#    And I get check number
#    And I select category as "FOOD"
#    And I select menu item as "<Menu_Item>"
#    And I select modifier as "<Modifier>"
#    And I click Done to get back
#    And I click Payment button in the Order Management Screen
#    And I click credit card payment on payment window
#    Then I should see total screen
#    And I click tip as 10
#    Then I should see tip is added with menu total as "<Total>"
#    And I click the Continue button on the Total screen
#    Then I should see your order card screen
#    Then I should see tip added on order screen
#    And I click manual button on the your order screen
#    And I pass the card number as "<card_number>"
#    And I pass card name as "<card_name>"
#    And I pass expire date as "<expire_date>"
#    And I click Process button on card screen
#    #    And I click No thanks Button on the print receipt
##    And I click Ok button in receipt printer popup
##    Then I should see the order type window
#    And I closed the order type window
#    #Void check CC payment with tips
#    And I click All
#    And I click Check Stats tab
#    And I click Closed tab on the Check stats
#    And I click the Closed check on check stats
#    And I click reopen check button on the check stats screen
#    Then I Should get back to the Order Screen
#    And I click Payment button in the Order Management Screen
#    And I click payment in the payment window
#    And I click Delete button on the payment window
##    And I click Ok button in receipt printer popup
##    Then I should see transaction void successful popup
##    And I click Done button on the Popup
#    And I click Exit to return to Order Management Screen
#    And I click print button on the order screen
#    And I click Done button on the Popup
#    And I click Void button on order management screen
#    Then I should see the void reason popup
#    And I click void Reason on the void popup
#    And I click Add Button on the void reason popup
##    Then I should see Receipt Printer popup
##    And I click Done button on the Popup
#    And I closed the order type window
#    And I click log off button in order screen
#    Examples:
#      | order_type |  Menu_Item     | Modifier | card_number      | expire_date | card_name | Total    |
#      | QSR        |  French Friese | Steak    | 3530111333300000 | 1224        | JCB       | $ 15.00  |
#
#
#  Scenario Outline: qsr Verify the check in Batch/Tip Adjustment for Check Payment through CC enabled with tips
#    Then I should see service type as "<order_type>"
#    And I select category as "FOOD"
#    And I select menu item as "<Menu_Item>"
#    And I select modifier as "<Modifier>"
#    And I click Done to get back
#    And I click Payment button in the Order Management Screen
#    And I click credit card payment on payment window
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
#    #   Then I should see the print or send receipt
#    #    And I click No thanks Button on the print receipt
##    And I click Ok button in receipt printer popup
##    Then I should see the order type window
#    And I closed the order type window
#    #Verify merchant copy bill printout of CC payment with sign
#    Then I should see service type as "<order_type>"
#    And I select category as "FOOD"
#    And I select menu item as "<Menu_Item>"
#    And I select modifier as "<Modifier>"
#    And I click Done to get back
#    And I click Payment button in the Order Management Screen
#    And I click credit card payment on payment window
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
#    #   Then I should see the print or send receipt
#    #    And I click No thanks Button on the print receipt
##    And I click Ok button in receipt printer popup
##    Then I should see the order type window
#    And I closed the order type window
#    And I click log off button in order screen
#    Examples:
#      | order_type |  Menu_Item    | Modifier |  Total   |  card_number      | expire_date | card_name | total    |
#      | QSR        | French Friese | Steak    | $ 15.00  | 3530111333300000  | 1224        | JCB       | $ 25.00  |
#
#
#  Scenario Outline: Qsr -Check Payment through CC with discount(item based - After tax/Before) as percentage and with tip
#    Then I should see service type as "<order_type>"
#    And I select Pasta as category
#    And I select menu item as "<Menu_Item>"
#    And I select modifier as "<Modifier>"
#    And I click Done to get back
#    And I select Discount on the Order screen
#    Then I should see Check Based Discount Screen
#    And I click Discount as "<Discount>"
#    And I click Back button on Discount Screen
#    And I select Discount on the Order screen
#    Then I should see Check Based Discount Screen
#    And I click Discount as "<Discount11>"
#    And I click Back button on Discount Screen
#    Then I should see orderscreen with menu item prize as "<SubTotal>"
#    Then I should see the tax amount reflected to the check as "<Tax>"
#    Then I should see the Discount amount reflected to the check as "<Discounttxt>"
#    Then I should see orderscreen with menu item Total as "<Total>"
#    And I click Payment button in the Order Management Screen
#    And I click credit card payment on payment window
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
#    #   Then I should see the print or send receipt
#    #    And I click No thanks Button on the print receipt
##    And I click Ok button in receipt printer popup
##    Then I should see the order type window
#    And I closed the order type window
#  #  And I click log off button in order screen
#
#
#  #Scenario Outline: Qsr -Check Payment through CC with discount(item based - After tax/Before) as amount and with tip
#    Then I should see service type as "<order_type>"
#    And I select Pasta as category
#    And I select menu item as "<Menu_Item>"
#    And I select modifier as "<Modifier>"
#    And I click Done to get back
#    And I select Discount on the Order screen
#    Then I should see Check Based Discount Screen
#    And I click Discount as "<Discount2>"
#    And I click Back button on Discount Screen
#    And I select Discount on the Order screen
#    Then I should see Check Based Discount Screen
#    And I click Discount as "<Discount21>"
#    And I click Back button on Discount Screen
#    Then I should see orderscreen with menu item prize as "<SubTotal2>"
#    Then I should see the tax amount reflected to the check as "<Tax2>"
#    Then I should see the Discount amount reflected to the check as "<Discounttxt2>"
#    Then I should see orderscreen with menu item Total as "<Total2>"
#    And I click Payment button in the Order Management Screen
#    And I click credit card payment on payment window
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
#    #   Then I should see the print or send receipt
#    #    And I click No thanks Button on the print receipt
##    And I click Ok button in receipt printer popup
##    Then I should see the order type window
#    And I closed the order type window
#  #  And I click log off button in order screen
#
#
#
# # Scenario Outline: Qsr - Check Payment through CC with discount(item based - After tax/Before) as set price and with tip
#    Then I should see service type as "<order_type>"
#    And I select Pasta as category
#    And I select menu item as "<Menu_Item>"
#    And I select modifier as "<Modifier>"
#    And I click Done to get back
#    And I select Discount on the Order screen
#    Then I should see Check Based Discount Screen
#    And I click Discount as "<Discount3>"
#    And I click Back button on Discount Screen
#    And I select Discount on the Order screen
#    Then I should see Check Based Discount Screen
#    And I click Discount as "<Discount31>"
#    And I click Back button on Discount Screen
#    Then I should see orderscreen with menu item prize as "<SubTotal3>"
#    Then I should see the tax amount reflected to the check as "<Tax3>"
#    Then I should see the Discount amount reflected to the check as "<Discounttxt3>"
#    Then I should see orderscreen with menu item Total as "<Total3>"
#    And I click Payment button in the Order Management Screen
#    And I click credit card payment on payment window
#    Then I should see total screen
#    And I click custom for tip adjustment
#    Then I should see tip is added with menu total as "<Total3>"
#    Then I should see total amount as "<total3>" on total screen
#    And I click the Continue button on the Total screen
#    Then I should see your order card screen
#    Then I should see tip added on order screen
#    And I click manual button on the your order screen
#    And I pass the card number as "<card_number>"
#    And I pass card name as "<card_name>"
#    And I pass expire date as "<expire_date>"
#    And I click Process button on card screen
#    #   Then I should see the print or send receipt
#    #    And I click No thanks Button on the print receipt
##    And I click Ok button in receipt printer popup
##    Then I should see the order type window
#    And I closed the order type window
#   # And I click log off button in order screen
#
##  Scenario Outline: Qsr - Check Payment through CC with discount(item based - After tax/Before) as Free item and with tip
#    Then I should see service type as "<order_type>"
#    And I select Pasta as category
#    And I select menu item as "<Menu_Item>"
#    And I select modifier as "<Modifier>"
#    And I click Done to get back
#    And I select Discount on the Order screen
#    Then I should see Check Based Discount Screen
#    And I click Discount as "<Discount4>"
#    And I click Back button on Discount Screen
#    And I select Discount on the Order screen
#    Then I should see Check Based Discount Screen
#    And I click Discount as "<Discount41>"
#    And I click Back button on Discount Screen
#    Then I should see orderscreen with as Onion Rings EACH
#    Then I should see orderscreen with menu item prize as "<SubTotal4>"
#    Then I should see the tax amount reflected to the check as "<Tax4>"
#    Then I should see orderscreen with menu item Total without Discount or Tax as "<Total4>"
#    And I click Payment button in the Order Management Screen
#    And I click credit card payment on payment window
#    Then I should see total screen
#    And I click custom for tip adjustment
#    Then I should see tip is added with menu total as "<Total4>"
#    Then I should see total amount as "<total4>" on total screen
#    And I click the Continue button on the Total screen
#    Then I should see your order card screen
#    Then I should see tip added on order screen
#    And I click manual button on the your order screen
#    And I pass the card number as "<card_number>"
#    And I pass card name as "<card_name>"
#    And I pass expire date as "<expire_date>"
#    And I click Process button on card screen
#    #   Then I should see the print or send receipt
#    #    And I click No thanks Button on the print receipt
##    And I click Ok button in receipt printer popup
##    Then I should see the order type window
#    And I closed the order type window
#    And I click log off button in order screen
#
#    Examples:
#      | order_type |Menu_Item   | Modifier |Discount                |Discount11              |Discounttxt  | SubTotal    | Tax       | Total       |  card_number      | expire_date | card_name | total       | Discount2            |Discount21         |Discounttxt2 | SubTotal2    | Tax2       | Total2       | card_number      | expire_date | card_name | total2       |   Discount3             |  Discount31             | Discounttxt3   |SubTotal3     | Tax3      | Total3      |  card_number     | expire_date | card_name | total3  | Discount4                | Discount41             | SubTotal4    | Tax4       | Total4       |   card_number     | expire_date   | card_name | total4       |
#      |QSR         | Ravioli    | Butter   | IB-AfterTax-Percentage |IB-BeforeTax-Percentage |$ 2.66       | $ 14.00     | $ 1.13    | $ 12.47     |  3530111333300000 | 1224        | JCB       | $ 22.47     |IB-AfterTax-Amount    |IB-BeforeTax-Amount|$ 2.00       | $ 14.00      | $ 1.20     | $ 13.20      | 3530111333300000 | 1224        | JCB       | $ 23.20      | IB-AfterTax-SetPrice500 |IB-BeforeTax-SetPrice500 |$ 13.00         | $ 14.00      | $ 0.10    | $ 1.10      | 3530111333300000 | 1224        | JCB       | $ 11.10 |IB-AfterTax-AsFreeItem    |IB-BeforeTax-AsFreeItem | $ 16.00      | $ 1.60     | $ 17.60      |  3530111333300000 | 1224          | JCB       | $ 27.60      |
#
#  @gi2
#  Scenario Outline: QSR - Check Payment through CC with discount(Check based - After tax/Before) as percentage and with tip
#    Then I should see service type as "<order_type>"
#    And I select Pasta as category
#    And I select menu item as "<Menu_Item>"
#    And I select modifier as "<Modifier>"
#    And I click Done to get back
#    And I select Pasta as category
#    And I select menu item as "<Menu_Item>"
#    And I select modifier as "<Modifier>"
#    And I click Done to get back
#    And I select Discount on the Order screen
#    Then I should see Check Based Discount Screen
#    And I click Discount as "<Discount>"
#    And I click Back button on Discount Screen
#    And I select Discount on the Order screen
#    Then I should see Check Based Discount Screen
#    And I click Discount as "<Discount11>"
#    And I click Back button on Discount Screen
#    Then I should see orderscreen with menu item prize as "<SubTotal>"
#    Then I should see the tax amount reflected to the check as "<Tax>"
#    Then I should see the Discount amount reflected to the check as "<Discounttxt>"
#    Then I should see orderscreen with menu item Total as "<Total>"
#    And I click Payment button in the Order Management Screen
#    And I click credit card payment on payment window
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
#    #   Then I should see the print or send receipt
#    #    And I click No thanks Button on the print receipt
##    And I click Ok button in receipt printer popup
##    Then I should see the order type window
#    And I closed the order type window
#   # And I click log off button in order screen
#
# # Scenario Outline: Qsr - Check Payment through CC with discount(Check based - After tax/Before) as amount and with tip
#    Then I should see service type as "<order_type>"
#    And I select Pasta as category
#    And I select menu item as "<Menu_Item>"
#    And I select modifier as "<Modifier>"
#    And I click Done to get back
#    And I select menu item as "<Menu_Item>"
#    And I select modifier as "<Modifier>"
#    And I click Done to get back
#    And I select Discount on the Order screen
#    Then I should see Check Based Discount Screen
#    And I click Discount as "<Discount2>"
#    And I click Back button on Discount Screen
#    And I select Discount on the Order screen
#    Then I should see Check Based Discount Screen
#    And I click Discount as "<Discount21>"
#    And I click Back button on Discount Screen
#    Then I should see orderscreen with menu item prize as "<SubTotal2>"
#    Then I should see the tax amount reflected to the check as "<Tax2>"
#    Then I should see the Discount amount reflected to the check as "<Discounttxt2>"
#    Then I should see orderscreen with menu item Total as "<Total2>"
#    And I click Payment button in the Order Management Screen
#    And I click credit card payment on payment window
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
#    #   Then I should see the print or send receipt
#    #    And I click No thanks Button on the print receipt
##    And I click Ok button in receipt printer popup
##    Then I should see the order type window
#    And I closed the order type window
##    And I click log off button in order screen
#
#
#
#  #Scenario Outline: qsr -Check Payment through CC with discount(Check based - After tax/Before) as set price and with tip
#    Then I should see service type as "<order_type>"
#    And I select category as "Menu"
#    And I select menu item as "<Menu_Item1>"
#    And I select menu item as "<Menu_Item1>"
#    And I select Discount on the Order screen
#    Then I should see Check Based Discount Screen
#    And I click Discount as "<Discount3>"
#    And I click Back button on Discount Screen
#    And I select Discount on the Order screen
#    Then I should see Check Based Discount Screen
#    And I click Discount as "<Discount31>"
#    And I click Back button on Discount Screen
#    Then I should see orderscreen with menu item prize as "<SubTotal3>"
#    Then I should see the tax amount reflected to the check as "<Tax3>"
#    Then I should see the Discount amount reflected to the check as "<Discounttxt3>"
#    Then I should see orderscreen with menu item Total as "<Total3>"
#    And I click Payment button in the Order Management Screen
#    And I click credit card payment on payment window
#    Then I should see total screen
#    And I click custom for tip adjustment
#    Then I should see tip is added with menu total as "<Total3>"
#    Then I should see total amount as "<total3>" on total screen
#    And I click the Continue button on the Total screen
#    Then I should see your order card screen
#    Then I should see tip added on order screen
#    And I click manual button on the your order screen
#    And I pass the card number as "<card_number>"
#    And I pass card name as "<card_name>"
#    And I pass expire date as "<expire_date>"
#    And I click Process button on card screen
##    And I click Ok button in receipt printer popup
#    #   Then I should see the print or send receipt
#    #    And I click No thanks Button on the print receipt
##    Then I should see the order type window
#    And I closed the order type window
#    #And I click log off button in order screen
#
#
#
# # Scenario Outline: qsr- Check Payment through CC with discount(Check based - After tax/Before) as Free item and with tip
#    Then I should see service type as "<order_type>"
#    And I select Desserts as category
#    And I select menu item as "<Menu_Item2>"
#    And I select Discount on the Order screen
#    Then I should see Check Based Discount Screen
#    And I click Discount as "<Discount4>"
#    And I click Back button on Discount Screen
#    And I select Discount on the Order screen
#    Then I should see Check Based Discount Screen
#    And I click Discount as "<Discount41>"
#    And I click Back button on Discount Screen
#    Then I should see orderscreen with as Onion Rings EACH
#    Then I should see orderscreen with menu item prize as "<SubTotal4>"
#    Then I should see the tax amount reflected to the check as "<Tax4>"
#    Then I should see orderscreen with menu item Total without Discount or Tax as "<Total4>"
#    And I click Payment button in the Order Management Screen
#    And I click credit card payment on payment window
#    Then I should see total screen
#    And I click custom for tip adjustment
#    Then I should see tip is added with menu total as "<Total4>"
#    Then I should see total amount as "<total4>" on total screen
#    And I click the Continue button on the Total screen
#    Then I should see your order card screen
#    Then I should see tip added on order screen
#    And I click manual button on the your order screen
#    And I pass the card number as "<card_number>"
#    And I pass card name as "<card_name>"
#    And I pass expire date as "<expire_date>"
#    And I click Process button on card screen
##    And I click Ok button in receipt printer popup
#    #   Then I should see the print or send receipt
#    #    And I click No thanks Button on the print receipt
##    Then I should see the order type window
#    And I closed the order type window
#    And I click log off button in order screen
#
#    Examples:
#      | order_type | Menu_Item | Modifier| Discount                |Discount11                | SubTotal    | Tax       | Discounttxt |Total        |  card_number     | expire_date   | card_name | total       |Discount2              |Discount21              | SubTotal2   | Tax2      | Discounttxt2| Total2      |   card_number     | expire_date | card_name | total2      | Menu_Item1|Discount3               |Discount31               | SubTotal3  | Tax3    | Discounttxt3|Total3     |  card_number     | expire_date | card_name | total3    | Menu_Item2 |Discount4           |Discount41            | SubTotal4  | Tax4    | Total4    |   card_number     | expire_date   | card_name | total4    |
#      | QSR        |  Ravioli  | Butter  |CB-AfterTax-Percentage10 |CB-BeforeTax-Percentage10 | $ 28.00     | $ 2.27    | $ 5.32      | $ 24.95     | 3530111333300000 | 1224          | JCB       | $ 34.95     |CB-AfterTax-Amount1000 |CB-BeforeTax-Amount1000 | $ 28.00     | $ 2.60    | $ 2.00      | $ 28.60     |  3530111333300000 | 1224        | JCB       | $ 38.60     |cake       |CB-AfterTaxSetPrice2500 |CB-BeforeTax-SetPrice1000| $ 16.00    |$ 1.00   | $ 6.00      |$ 11.00    | 3530111333300000 | 1224        | JCB       | $ 21.00   |Cheesecake  | CB-AfterTax-Free300| CB-BeforeTax-Free300 |$ 17.00     | $ 1.70  | $ 18.70   |  3530111333300000 | 1224          | JCB       | $ 28.70   |
#
#
#  Scenario Outline:qsr - Check Payment through CC with discount(Open item - After tax/Before) as percentage and with tip
#    Then I should see service type as "<order_type>"
#    And I select category as "Menu"
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
#    #   Then I should see the print or send receipt
#    #    And I click No thanks Button on the print receipt
##    And I click Ok button in receipt printer popup
##    Then I should see the order type window
#    And I closed the order type window
#   # And I click log off button in order screen
#
#
#
# # Scenario Outline: qsr- Check Payment through CC with discount(Open item - After tax/Before) as amount & safety limit as decimal value and with tip
#    Then I should see service type as "<order_type>"
#    And I select category as "Menu"
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
#    #   Then I should see the print or send receipt
#    #    And I click No thanks Button on the print receipt
##    And I click Ok button in receipt printer popup
##    Then I should see the order type window
#    And I closed the order type window
#  #  And I click log off button in order screen
#
#
#
#
#  #Scenario Outline: qsr- Check Payment through CC with discount(Open item - After tax/Before) as amount & safety limit as non-decimal value and with tip
#    Then I should see service type as "<order_type>"
#    And I select category as "Menu"
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
#    #   Then I should see the print or send receipt
#    #    And I click No thanks Button on the print receipt
##    And I click Ok button in receipt printer popup
##    Then I should see the order type window
#    And I closed the order type window
#    And I click log off button in order screen
#
#    Examples:
#      |order_type |Menu_Item|course_name| open_Item |  SubTotal | Tax       | Discount   | Total | Discount11 | card_number      | expire_date   | card_name | total   |SubTotal1 | Tax1       | Discount1 | Total1  |    total1 |SubTotal2  | Tax2      | Discount2  |     Total2  |  total2     |
#      |QSR        |  Dosa   | DESSERT   |  onion    |  $ 51.00  | $ 5.10    | $ 0.50     |$ 55.60| After      | 3530111333300000 | 1224          | JCB       | $ 65.60 |$ 51.00   | $ 5.10     | $ 20.50   | $ 35.60 |   $ 45.60 |$ 51.00    | $ 5.10    | $ 20.00    | $ 36.10     | $ 46.10     |
#
#
#  Scenario Outline: qsr - Check Payment through CC with discount(Open Check - After tax/Before) as percentage and with tip
#    Then I should see service type as "<order_type>"
#    And I select category as "Menu"
#    And I select menu item as "<Menu_Item>"
#    And I change the Quantity of menu Item as "7"
#    And I click Options button
#    Then I should see the Check Options screen
#    And I click discount on check option screen
#    And I select open check discount
#    Then I should see Open discount Screen
#    And I pass the amount on open discount for open check discount percentage as 20 for "<Discount11>"
#    Then I should see orderscreen with open check discount
#    Then I should see orderscreen with menu item prize as "<SubTotal>"
#    Then I should see the tax amount reflected to the check as "<Tax>"
#    Then I should see the Discount amount reflected to the check as "<Discount>"
#    Then I should see orderscreen with menu item Total as "<Total>"
#    And I click Payment button in the Order Management Screen
#    And I click credit card payment on payment window
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
#    #   Then I should see the print or send receipt
#    #    And I click No thanks Button on the print receipt
##    And I click Ok button in receipt printer popup
##    Then I should see the order type window
#    And I closed the order type window
#  #  And I click log off button in order screen
#
#
##  Scenario Outline:qsr - Check Payment through CC with discount(Open check - After tax/Before) as amount & safety limit as decimal value and with tip
#    Then I should see service type as "<order_type>"
#    And I select category as "Menu"
#    And I select menu item as "<Menu_Item>"
#    And I change the Quantity of menu Item as "7"
#    And I click Options button
#    Then I should see the Check Options screen
#    And I click discount on check option screen
#    And I select open check discount
#    Then I should see Open discount Screen
#    And I pass the amount on open discount for open check discount safety limit percentage decimal precision as 20.50 for "<Discount11>"
#    Then I should see orderscreen with open check discount
#    Then I should see orderscreen with menu item prize as "<SubTotal1>"
#    Then I should see the tax amount reflected to the check as "<Tax1>"
#    Then I should see the Discount amount reflected to the check as "<Discount1>"
#    Then I should see orderscreen with menu item Total as "<Total1>"
#    And I click Payment button in the Order Management Screen
#    And I click credit card payment on payment window
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
#    #   Then I should see the print or send receipt
#    #    And I click No thanks Button on the print receipt
##    And I click Ok button in receipt printer popup
##    Then I should see the order type window
#    And I closed the order type window
#   # And I click log off button in order screen
#
#
#
# # Scenario Outline:QSR - Check Payment through CC with discount(Open check - After tax/Before) as amount & safety limit as non-decimal value and with tip
#    Then I should see service type as "<order_type>"
#    And I select category as "Menu"
#    And I select menu item as "<Menu_Item>"
#    And I change the Quantity of menu Item as "7"
#    And I click Options button
#    Then I should see the Check Options screen
#    And I click discount on check option screen
#    And I select open check discount
#    Then I should see Open discount Screen
#    And I pass the amount on open discount for open check discount safety percentage whole value as 20 for "<Discount11>"
#    Then I should see orderscreen with open check discount
#    Then I should see orderscreen with menu item prize as "<SubTotal2>"
#    Then I should see the tax amount reflected to the check as "<Tax2>"
#    Then I should see the Discount amount reflected to the check as "<Discount2>"
#    Then I should see orderscreen with menu item Total as "<Total2>"
#    And I click Payment button in the Order Management Screen
#    And I click credit card payment on payment window
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
#    #   Then I should see the print or send receipt
#    #    And I click No thanks Button on the print receipt
##    And I click Ok button in receipt printer popup
##    Then I should see the order type window
#    And I closed the order type window
#    And I click log off button in order screen
#
#    Examples:
#      |order_type|Menu_Item|  SubTotal   | Tax         | Discount   | Total     | Discount11  |  card_number     | expire_date | card_name | total     |  SubTotal1     | Tax1         | Discount1  | Total1       | total1     | SubTotal2     | Tax2         | Discount2  | Total2       | total2       |
#      |QSR       |Halwa    |  $ 70.00    | $ 7.00      | $ 14.00    |$ 63.00    | After       | 3530111333300000 | 1224        | JCB       | $ 73.00   |   $ 70.00      | $ 7.00       | $ 20.50    | $ 56.50      | $ 66.50    |  $ 70.00      | $ 7.00       | $ 20.00    | $ 57.00      | $ 67.00      |
#
#
#  Scenario Outline: qsr -Check Payment through CC with discount(Mix&Match - After/before tax) as set price and with tip
#    Then I should see service type as "<order_type>"
#    And I select category as "Menu"
#    And I select menu item as "<Menu_Item>"
#    And I select menu item as "<Menu_Item>"
#    And I select Discount on the Order screen
#    Then I should see Check Based Discount Screen
#    And I click Discount as "<Discount1>"
#    And I click Back button on Discount Screen
#    And I select Discount on the Order screen
#    Then I should see Check Based Discount Screen
#    And I click Discount as "<Discount2>"
#    And I click Back button on Discount Screen
#    Then I should see orderscreen with menu item prize as "<SubTotal>"
#    Then I should see the tax amount reflected to the check as "<Tax>"
#    Then I should see the Discount amount reflected to the check as "<Discount>"
#    Then I should see orderscreen with menu item Total as "<Total>"
#    And I click Payment button in the Order Management Screen
#    And I click credit card payment on payment window
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
#    #   Then I should see the print or send receipt
#    #    And I click No thanks Button on the print receipt
##    And I click Ok button in receipt printer popup
##    Then I should see the order type window
#    And I closed the order type window
#    And I click log off button in order screen
#    Examples:
#      |order_type |Menu_Item|  SubTotal     | Tax        | Discount     | Total       | Discount1              |Discount2               |  card_number     | expire_date | card_name | total      |
#      | QSR       |  Halwa  |   $ 20.00     | $ 0.20     | $ 18.00      | $ 2.20      | CheckMixMatchSP(After) | CheckMixMatchSP(Before)| 3530111333300000 | 1224        | JCB       |$ 12.20     |
#
#
#  Scenario Outline: qsr- Check Payment through CC with discount(Mix&Match - After/before tax) as set each item price and with tip
#    Then I should see service type as "<order_type>"
#    And I select category as "Menu"
#    And I select menu item as "<Menu_Item>"
#    And I select menu item as "<Menu_Item>"
#    And I select Discount on the Order screen
#    Then I should see Check Based Discount Screen
#    And I click Discount as "<Discount1>"
#    And I click Back button on Discount Screen
#    And I select Discount on the Order screen
#    Then I should see Check Based Discount Screen
#    And I click Discount as "<Discount2>"
#    And I click Back button on Discount Screen
#    Then I should see orderscreen with menu item prize as "<SubTotal>"
#    Then I should see the tax amount reflected to the check as "<Tax>"
#    Then I should see the Discount amount reflected to the check as "<Discount>"
#    Then I should see orderscreen with menu item Total as "<Total>"
#    And I click Payment button in the Order Management Screen
#    And I click credit card payment on payment window
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
#    #   Then I should see the print or send receipt
#    #    And I click No thanks Button on the print receipt
##    And I click Ok button in receipt printer popup
##    Then I should see the order type window
#    And I closed the order type window
#    And I click log off button in order screen
#    Examples:
#      |order_type |Menu_Item|  SubTotal     | Tax      | Discount     | Total     | Discount1                |Discount2                |  card_number     | expire_date | card_name | total      |
#      | QSR       |  Halwa  |  $ 20.00      | $ 1.40   | $ 6.00       | $ 15.40   | CheckMixMatchSEIP(After) |CheckMixMatchSEIP(Before)| 3530111333300000 | 1224        | JCB       |$ 25.40     |
#
#
#  Scenario Outline: qsr- Check Payment through CC with discount(Mix&Match - After/before tax) as set price(Most Expensive) and with tip
#    Then I should see service type as "<order_type>"
#    And I select category as "Menu"
#    And I select menu item as "<Menu_Item>"
#    And I select menu item as "<Menu_Item1>"
#    And I select Discount on the Order screen
#    Then I should see Check Based Discount Screen
#    And I click Discount as "<Discount1>"
#    And I click Back button on Discount Screen
#    And I select Discount on the Order screen
#    Then I should see Check Based Discount Screen
#    And I click Discount as "<Discount2>"
#    And I click Back button on Discount Screen
#    And I compare menu price as "<price>" "<price1>" and applied "<Discount1>" on "<expensive>" menu Item
#    And I compare menu price as "<price>" "<price1>" and applied "<Discount2>" on "<expensive>" menu Item
#    Then I should see orderscreen with menu item prize as "<SubTotal>"
#    Then I should see the tax amount reflected to the check as "<Tax>"
#    Then I should see the Discount amount reflected to the check as "<Discount>"
#    Then I should see orderscreen with menu item Total as "<Total>"
#    And I click Payment button in the Order Management Screen
#    And I click credit card payment on payment window
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
#    #   Then I should see the print or send receipt
#    #    And I click No thanks Button on the print receipt
##    And I click Ok button in receipt printer popup
##    Then I should see the order type window
#    And I closed the order type window
#    And I click log off button in order screen
#    Examples:
#      |order_type|Menu_Item|Menu_Item1 |price    |price1  |  SubTotal      | Tax       | Discount    | Total       | Discount1                 | Discount2               |  card_number     | expire_date | card_name | total      | expensive|
#      | QSR      |  Halwa  |cake       | 10.00   |8.00    |  $ 18.00       | $ 0.80    | $ 10.00     | $ 8.80      | CheckMixMatchSPerM(After) |CheckMixMatchSPerM(Befor)| 3530111333300000 | 1224        | JCB       |$ 18.80     |Most     |
#
#  @gi2
#  Scenario Outline: qsr -Check Payment through CC with discount(Mix&Match - After/before tax) as set price(Least Expensive) and with tip
#    Then I should see service type as "<order_type>"
#    And I select Desserts as category
#    And I select menu item as "<Menu_Item>"
#    And I select menu item as "<Menu_Item1>"
#    And I select Discount on the Order screen
#    Then I should see Check Based Discount Screen
#    And I click Discount as "<Discount1>"
#    And I click Back button on Discount Screen
#    And I select Discount on the Order screen
#    Then I should see Check Based Discount Screen
#    And I click Discount as "<Discount2>"
#    And I click Back button on Discount Screen
#    And I compare menu price as "<price>" "<price1>" and applied "<Discount1>" on "<expensive>" menu Item
#    And I compare menu price as "<price>" "<price1>" and applied "<Discount2>" on "<expensive>" menu Item
#    Then I should see orderscreen with menu item prize as "<SubTotal>"
#    Then I should see the tax amount reflected to the check as "<Tax>"
#    Then I should see the Discount amount reflected to the check as "<Discount>"
#    Then I should see orderscreen with menu item Total as "<Total>"
#    And I click Payment button in the Order Management Screen
#    And I click credit card payment on payment window
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
#    #   Then I should see the print or send receipt
#    #    And I click No thanks Button on the print receipt
##    And I click Ok button in receipt printer popup
##    Then I should see the order type window
#    And I closed the order type window
#    And I click log off button in order screen
#    Examples:
#      |order_type |Menu_Item    |Menu_Item1         | price   |price1   | SubTotal    | Tax       | Discount   | Total      | Discount1                 | Discount2                 |  card_number      | expire_date | card_name | total      | expensive |
#      | QSR       |Cheesecake   |Pumpkin Cheese Cake|15.00    |11.00    | $ 26.00     | $ 1.50    | $ 11.00    |$ 16.50     | CheckMixMatchSPerL(After) | CheckMixMatchSPerL(Befor) |  3530111333300000 | 1224        | JCB       |$ 26.50     |Least      |
#
#
#  Scenario Outline: qsr- Check Payment through CC with Gratuity(Fixed) and with tips
#    Then I should see service type as "<order_type>"
#    And I select category as "Menu"
#    And I select menu item as "<Menu_Item>"
#    And I click Options button
#    Then I should see the Check Options screen
#    And I click Gratuity button
#    Then I should see Add Gratuity screen
#    And I click Gratuity Fixed button
#    Then I Should get back to the Order Screen
#    Then I should see orderscreen with menu item prize as "<SubTotal>"
#    Then I should see the tax amount reflected to the check as "<Tax>"
#    Then I should see the Gratuity amount reflected to the check as "<Gratuity>"
#    Then I should see orderscreen with menu item Total as "<Total>"
#    And I click Payment button in the Order Management Screen
#    And I click credit card payment on payment window
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
#    #   Then I should see the print or send receipt
#    #    And I click No thanks Button on the print receipt
##    And I click Ok button in receipt printer popup
##    Then I should see the order type window
#    And I closed the order type window
#    And I click log off button in order screen
#    Examples:
#      | order_type | Menu_Item |  SubTotal   | Tax       | Gratuity   | Total       |   card_number     | expire_date | card_name | total      |
#      | QSR        |  Halwa    | $ 10.00     | $ 1.00    |  $ 1.00    | $ 12.00     |  3530111333300000 | 1224        | JCB       |$ 22.00     |
#
#
#  Scenario Outline: qsr- Check Payment through CC with Gratuity(Varying) and with tips
#    Then I should see service type as "<order_type>"
#    And I select category as "Menu"
#    And I select menu item as "<Menu_Item>"
#    And I click Options button
#    Then I should see the Check Options screen
#    And I click Gratuity button
#    Then I should see Add Gratuity screen
#    And I click Gratuity varying button
#    Then I should see enter Percentage popup
#    And I pass the value and click Apply button as "<Percentage>"
#    Then I Should get back to the Order Screen
#    Then I should see orderscreen with menu item prize as "<SubTotal>"
#    Then I should see the tax amount reflected to the check as "<Tax>"
#    Then I should see the Gratuity amount reflected to the check as "<Gratuity>"
#    Then I should see orderscreen with menu item Total as "<Total>"
#    And I click Payment button in the Order Management Screen
#    And I click credit card payment on payment window
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
#    #   Then I should see the print or send receipt
#    #    And I click No thanks Button on the print receipt
##    And I click Ok button in receipt printer popup
##    Then I should see the order type window
#    And I closed the order type window
#    And I click log off button in order screen
#    Examples:
#      |order_type| Menu_Item   | Percentage | SubTotal    |    Tax    | Gratuity     | Total       |  card_number     | expire_date | card_name | total      |
#      | QSR      | Halwa       | 8          | $ 10.00     | $ 1.00    |  $ 0.80      | $ 11.80     | 3530111333300000 | 1224        | JCB       |$ 21.80     |
#
#
#  Scenario Outline: Qsr - Check Payment through CC with tax Exempt(Not select customer) and also with tip
#    Then I should see service type as "<order_type>"
#    And I select category as "Menu"
#    And I select menu item as "<Menu_Item>"
#    Then I should see orderscreen with menu item prize as "<SubTotal>"
#    Then I should see the tax amount reflected to the check as "<Tax>"
#    Then I should see orderscreen with menu item Total without Discount or Tax as "<Total>"
#    And I click Options button
#    Then I should see the Check Options screen
#    And I click Tax Exempt Button
#    Then I should see tax exempt reasons
#    When I select School as reason
#    Then I Should get back to the Order Screen
#    Then I should see orderscreen with menu item prize as "<SubTotal>"
#    And I should see the tax reflected to the check
#    Then I should see orderscreen with menu item Total without Tax Exempt as "<Total1>"
#    And I click Payment button in the Order Management Screen
#    And I click credit card payment on payment window
#    Then I should see total screen
#    And I click custom for tip adjustment
#    Then I should see tip is added with menu total as "<Total1>"
#    Then I should see total amount as "<total>" on total screen
#    And I click the Continue button on the Total screen
#    Then I should see your order card screen
#    Then I should see tip added on order screen
#    And I click manual button on the your order screen
#    And I pass the card number as "<card_number>"
#    And I pass card name as "<card_name>"
#    And I pass expire date as "<expire_date>"
#    And I click Process button on card screen
#    #   Then I should see the print or send receipt
#    #    And I click No thanks Button on the print receipt
##    And I click Ok button in receipt printer popup
##    Then I should see the order type window
#    And I closed the order type window
#    #Check Payment through CC with tax Exempt(select customer) and also with tip
#    Then I should see service type as "<order_type>"
#    And I click Add Customer Button
#    And I search for "<customer_name>"
#    When I click "<customer_name>" to select customer for the seat
#    And I select category as "Menu"
#    And I select menu item as "<Menu_Item>"
#    Then I should see orderscreen with menu item prize as "<SubTotal>"
#    Then I should see the tax amount reflected to the check as "<Tax>"
#    Then I should see orderscreen with menu item Total without Discount or Tax as "<Total>"
#    And I click Options button
#    Then I should see the Check Options screen
#    And I click Tax Exempt Button
#    Then I should see tax exempt reasons
#    When I select School as reason
#    Then I Should get back to the Order Screen
#    Then I should see orderscreen with menu item prize as "<SubTotal>"
#    And I should see the tax reflected to the check
#    Then I should see orderscreen with menu item Total without Tax Exempt as "<Total1>"
#    And I click Payment button in the Order Management Screen
#    And I click credit card payment on payment window
#    Then I should see total screen
#    And I click custom for tip adjustment
#    Then I should see tip is added with menu total as "<Total1>"
#    Then I should see total amount as "<total>" on total screen
#    And I click the Continue button on the Total screen
#    Then I should see your order card screen
#    Then I should see tip added on order screen
#    And I click manual button on the your order screen
#    And I pass the card number as "<card_number>"
#    And I pass card name as "<card_name>"
#    And I pass expire date as "<expire_date>"
#    And I click Process button on card screen
#    #   Then I should see the print or send receipt
#    #    And I click No thanks Button on the print receipt
##    And I click Ok button in receipt printer popup
##    Then I should see the order type window
#    And I closed the order type window
#    And I click log off button in order screen
#    Examples:
#      |order_type| Menu_Item  |  SubTotal   | Tax       | Total       | Total1      |  card_number     | expire_date | card_name | total      |customer_name|
#      | QSR      |Halwa       | $ 10.00     | $ 1.00    | $ 11.00     | $ 10.00     | 3530111333300000 | 1224        | JCB       |$ 20.00     |tax exe      |
#
#
#  Scenario Outline: qsr - Check Payment through CC with tax Exempt(Not select customer) in payment screen and also with tip
#    Then I should see service type as "<order_type>"
#    And I select category as "Menu"
#    And I select menu item as "<Menu_Item>"
#    Then I should see orderscreen with menu item prize as "<SubTotal>"
#    Then I should see the tax amount reflected to the check as "<Tax>"
#    Then I should see orderscreen with menu item Total without Discount or Tax as "<Total>"
#    And I click Payment button in the Order Management Screen
#    And I click Tax Exempt Button from the Payment Screen
#    Then I should see tax exempt reasons
#    When I select School as reason
#    Then I Should get back to the Order Screen
#    Then I should see orderscreen with menu item prize as "<SubTotal>"
#    And I should see the tax reflected to the check
#    Then I should see orderscreen with menu item Total without Tax Exempt as "<Total1>"
#    And I click Payment button in the Order Management Screen
#    And I click credit card payment on payment window
#    Then I should see total screen
#    And I click custom for tip adjustment
#    Then I should see tip is added with menu total as "<Total1>"
#    Then I should see total amount as "<total>" on total screen
#    And I click the Continue button on the Total screen
#    Then I should see your order card screen
#    Then I should see tip added on order screen
#    And I click manual button on the your order screen
#    And I pass the card number as "<card_number>"
#    And I pass card name as "<card_name>"
#    And I pass expire date as "<expire_date>"
#    And I click Process button on card screen
#    #   Then I should see the print or send receipt
#    #    And I click No thanks Button on the print receipt
##    And I click Ok button in receipt printer popup
##    Then I should see the order type window
#    And I closed the order type window
#    #Check Payment through CC with tax Exempt(predefined customer) and also with tip
#    Then I should see service type as "<order_type>"
#    And I click Add Customer Button
#    And I click Add new button
#    And I select search
#    And I enter an existing customer's name "<customer_name>"
#    And I select the customer for tax exempt
#    And I select tax exempt on customer profile screen
#    And I click the Save button
#    Then I Should get back to the Order Screen
#    And I select category as "Menu"
#    And I select menu item as "<Menu_Item>"
#    Then I should see orderscreen with menu item prize as "<SubTotal>"
#    And I should see the tax reflected to the check
#    Then I should see orderscreen with menu item Total without Tax Exempt as "<Total1>"
#    And I click Payment button in the Order Management Screen
#    And I click credit card payment on payment window
#    Then I should see total screen
#    And I click custom for tip adjustment
#    Then I should see tip is added with menu total as "<Total1>"
#    Then I should see total amount as "<total>" on total screen
#    And I click the Continue button on the Total screen
#    Then I should see your order card screen
#    Then I should see tip added on order screen
#    And I click manual button on the your order screen
#    And I pass the card number as "<card_number>"
#    And I pass card name as "<card_name>"
#    And I pass expire date as "<expire_date>"
#    And I click Process button on card screen
#    #   Then I should see the print or send receipt
#    #    And I click No thanks Button on the print receipt
##    And I click Ok button in receipt printer popup
##    Then I should see the order type window
#    And I closed the order type window
#    And I click Add Customer Button
#    And I click Add new button
#    And I select search
#    And I enter an existing customer's name "<customer_name>"
#    And I select the customer for tax exempt
#    And I select tax exempt on customer profile screen
#    And I click the Save button
#    Then I Should get back to the Order Screen
#    And I click Add Customer Button
#    And I click remove button
#    And I click log off button in order screen
#    Examples:
#      | order_type | Menu_Item  |  SubTotal   | Tax       | Total       | Total1      |  card_number     | expire_date | card_name | total      | customer_name  |
#      | QSR        |Halwa       | $ 10.00     | $ 1.00    | $ 11.00     | $ 10.00     | 3530111333300000 | 1224        | JCB       |$ 20.00     | tax exe        |
#
#
#  Scenario Outline: qsr Check Payment through CC with Upcharge with tip
#    Then I should see service type as "<order_type>"
#    And I select category as "FOOD"
#    And I select menu item as "<Menu_Item>"
#    And I select modifier as "<Modifier>"
#    And I click Done to get back
#    Then I should see menu with Upcharge amount on order list as "<Total>"
#    And I click Payment button in the Order Management Screen
#    And I click credit card payment on payment window
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
#    #   Then I should see the print or send receipt
#    #    And I click No thanks Button on the print receipt
##    And I click Ok button in receipt printer popup
##    Then I should see the order type window
#    And I closed the order type window
#    And I click log off button in order screen
#    Examples:
#      |order_type | Menu_Item          | Modifier     | Total   |  card_number     | expire_date | card_name | total      |
#      | QSR       |  Fried Crab Cakes  | White Bread  | $ 20.35 | 3530111333300000 | 1224        | JCB       | $ 30.35    |

    @RegressionQSR3
  Scenario Outline: qsr Modify with option
    Then I should see service type as "<order_type>"
    And I select category as "FOOD"
    And I select menu item as "<menu_Item>"
    And I select the serving size as "<Serving_Size>"
    And I select modifier as "<Modifier_1>"
    And I click Done to get back
    And I click Options button
    Then I should see the Check Options screen
    And I click Modify
    And I click modifier as "<Modifier_1>" on the order screen
    And I select modifier as "<Modifier_2>"
    When I click Done button to finish modifying
    Then I should return back to the order management screen and I should verify that the "<Modifier_1>" and "<Modifier_2>" are listed under the menu item
    And I click Void button on order management screen
    Then I should see All orders are voided
    And I click Done button on the Popup
    #Scenario Outline: Modify with option should not applicable for Already kitchen sent menu
    #And I select FOOD as category
    #And I select menu item as "<Menu_Item>"
    #And I select modifier as "<Modifier>"
    #And I click Done to get back
    #And I click Order button in the order management screen
    #And I click Options button
    #Then I should see the Check Options screen
    #And I click Modify
    #And I click Order List with Menu item as "<Menu_Item>"
    #Then I should see cannot add modifiers popup
    #And I click Done button on the Popup
    #And I click Void button on order management screen
    #Then I should see the void reason popup
    #And I click void Reason on the void popup
    #And I click Add Button on the void reason popup
    #Then I should see Receipt Printer popup
    #And I click Done button on the Popup
#    And I closed the order type window
    And I click log off button in order screen
    Examples:
      | order_type |menu_Item            | Serving_Size | Modifier_1   | Modifier_2     |
      | QSR        | Pizza Rucola 12inch | DOUBLE       | Add Steak    | Add Chicken    |

  @RegressionQSR3
  Scenario Outline: Application showing the service type in Order Screen,Verify menu categories,Verify add new seat button,When User click add new customer icon,Delete any seat,Verify select Upcharge MenuItems,Verify select Upcharge MenuItems with Modifiers,Verify Reopen Upcharge Order.

    Then I should see service type as "QSR"
#    Then User verify first service type
    And I select category as "FOOD"
    And User verify Food category menu item
    When User click add seat button
    Then User verify new seat
    #  Scenario Outline: Application
    When I click Add Customer Button
    When I click By Name Email Button
    And I click add customer button from the Add customer window
    Then I should see the customer profile window
    Then User enter customer first name
    And User enter customer last name
    And User click add button for phone number
    And User enter new customer mobile phone number
#    And User click customer profile save button
    And User click the Save button
    #Delete any seat
    And I delete the seat for QSR order type
    When User click QSR on Menu Item page
    Then User select DineIn order type
    And I select the "<txtTable>" in the Table layout screen"click t4 table"
    When I get check number
    And I select category as "FOOD"
    Then User select Sandwiches menu item
    And User take an order with upcharge menu item
    And User verify upcharge menu item
    When User select upcharge menu item with modifier
    Then User take an order upcharge menu item with modifier
    And User verify upcharge menu item with modifier
    When User click payment button
    And User select payment method with cash
    And User verify paid cash on payment page
    Then User click submit button
    And User click Check Status tab
    When User click Closed Checks tabs
    Then I should see and select the closed check as "Closed check selected"
    Then User click re-open check button
    And User verify upcharge menu item
    When User click payment button
    Then User click submit button
    And I click QSR tab

     And I closed the order type window
    And I click log off button in order screen

    Examples:
      |btnQsr|btnCancel|btnLogOff|tabCustomer|txtTable|
      |QSR   |Cancel   |logOff   |New Customer |T8    |

  @RegressionQSR3
  Scenario: Verify check options tab should open at all scenarios,Verify Finish button for order / menu item screen

    When User click QSR on Menu Item page
    Then User select DineIn order type
    And I select the "T9" in the Table layout screen"click t4 table"
    And I select category as "FOOD"
    When I select menu item as "SANDWICHES"
    Then User click Option Tab
    And User verify option page
    And User click option back button
    Then User click finish button
    And I click power button
  @RegressionQSR3
  Scenario: Check number gets changed after completing the sale in QSR Screen --verify changing check number

    When User click QSR on Menu Item page
    Then User select DineIn mode
    And I select the "T9" in the Table layout screen"click t4 table"
    When I select menu item as "SANDWICHES"
    Then User click payment button
    And User click exact option
    And USer click cash button
    When User click submit button
    And I click power button

  @RegressionQSR3
  Scenario: Menu item with - mandatory modifier
##    Given User select QSR mode on menu item page
    And I select FOOD as category
    When User select third menu item with mandatory modifier
    When User select first modifier of third menu item
    Then User click done button on modifier
    #Menu item with - only Include modifier
    When User select fourth menu item with modifier
    Then User verify order with fourth menu item with not selected modifier
    And I click Done to get back
    #Verify modifier with prefix
    And I select Pizza as Category
    When User select second pizza menu item with modifier
    And I select modifier as 12
    Then User select third modifier with prefix of second menu item of pizza
    And User verify modifier prefix
    #Menu item with - optional modifier
    And User click done button on modifier
    And I select FOOD as category
    And User select Garlic Bread menu item with mandatory modifier
    Then User select optional modifier
    And User verify optional modifier
    Then User click payment button
    And User click exact option
    And USer click cash button
    When User click submit button
    And I closed the order type window
    And I click log off button in order screen

  @RegressionQSR3
  Scenario: Verify menu item and modifier with inclusive tax,Verify menu item and modifier with exclusive tax

#    Given User select QSR mode on menu item page
    And I select category as "Pasta"
    And I select menu item as "Ravioli Pesto"
    And I select modifier as "Butter"
    And I click Done to get back
    And I should verify tax value as "$ 1.36"
#    Then User verify inclusive tax
    And I click Void button on order management screen
    Then I should see All orders are voided
    And I click Done button on the Popup
    #Verify menu item and modifier with exclusive tax
    And I select category as "Pasta"
    And I select menu item as "Ravioli"
    And I select modifier as "Butter"
    And I click Done to get back
    And I should verify tax value as "$ 1.40"
#    And User verify exclusive tax
    #Verify menu item with all mandatory modifier and prefix
    Then User click payment button
    And User click exact option
    And USer click cash button
    When User click submit button
    And I closed the order type window
    And I click log off button in order screen
  @RegressionQSR3
  Scenario: Check number gets changed after changing a service type in QSR Screen

    When User click QSR on Menu Item page
    Then User select DineIn order type
    And I select the "T9" in the Table layout screen"click t4 table"
    And User take an order
    Then User click payment button
    And User click exact option
    And USer click cash button
    When User click submit button
    And I click power button

  @RegressionQSR3
  Scenario Outline: Void before order
    When User click QSR on Menu Item page in void screen
    Then User select DineIn order type in void screen
    And User select first table in void screen
    When User select any menu item in void screen
    Then User click void button in void screen
    And User close void info popup in void screen
    And User verify voided menu item in void screen
    #void after order
    When I select menu item as "SANDWICHES"
    Then User click void button in void screen
    And User close void info popup in void screen

    And I click All
    And I click power button
#    When User select void reason in void screen
#    Then User click add void button in void screen
#    And User close printer popup in void screen
    #void checks on void tab
#    When User click Check Status tab in void screen
#    Then User click Void Checks tabs in void screen
#    And User verify last voided order in void screen
#    And I click QSR tab
#    And I closed the order type window
#    #Scenario Outline: Void
    #Void after payment
#    When User click QSR on Menu Item page in void screen
#    Then User select DineIn order type in void screen
#    And User select first table in void screen
#    When User select any menu item in void screen
#    Then User click payment button in void screen
#    And USer click cash button in void screen
#    And I click Exit to return to Order Management Screen
##    Then It should show the amount "4" value as "$ 1.10" in void screen "Verify paid amount value"
#    And I should verify total value as "$ 1.00"
#    And I click Void button on order management screen
#    Then I should see payment made on this check popup message
#    And I click Done button on the Popup in void screen
#    Then User verify last voided order in void screen
#    And I select the credit card check in the payment screen in void screen "Credit card amount clicked"
#    When I click Delete in the payment screen in void screen "Delete button clicked"
#    And I click "<btnOk>" in the receipt printer popup in void screen "Click ok button in the popup"
#    When I click Exit in the payment screen in void screen "exit button clicked"
#    And I click "<btnVoid>" in the order screen in void screen "Click void button"
#    And I click the Wrong Item Ordered "<btnWrong>" reason to void my menu item in void screen "select reason"
#    And I click "<btnAdd>" in the void screen in void screen "Click add button"
#    And I click the "<btnDone>" in the popup screen in void screen "click done button"
#    And I click power button

    Examples:
      |btnFinish|btnQsr|btnCancel|btnOk|btnVoid|btnAdd|btnDone|btnWrong|btnVoid|
      |finish   |QSR   |Cancel   |OK   |Void   |Add   |Done   |Wrong Item Ordered |Void |

#  @bugfix
  @RegressionQSR3
  Scenario: Void reopen check
    When User click QSR on Menu Item page in void screen
    Then User select DineIn order type in void screen
    And User select first table in void screen
    When I get the check no in the order screen in void screen "Get Check Number"
    When I select menu item as "SANDWICHES"
    Then User click payment button in void screen
    And USer click cash button in void screen
    And User click submit button in void screen
    When User click Check Status tab in void screen
    Then User click Closed Checks tabs in void screen
    Then I click the Closed check on check stats
    Then User click re-open check button in void screen
    When User click payment button in void screen
    Then I click payment in the payment window
    When I click Delete in the payment screen in void screen "Delete button clicked"
#    And I click "OK" in the receipt printer popup in void screen "Click ok button in the popup"
    And User click exit on payment page in void screen
    And User click void button in void screen
    Then User select void reason in void screen
    And User click add void button in void screen
#    And I click All
#    And I click "Check Stats" in the All Tab Screen in void screen1 "Click Bar Tab"
#    When User click Void Checks tabs in void screen
#    Then I click the Closed check on check stats
#    Then I should verify the checks in void screen "verify the void check"
    And I click power button

#  @1
  @RegressionQSR3
  Scenario Outline: Void Normal Check — Select from CheckStatus/Closed Check
    Given User click setting icon in void screen
    And User verify setting options in void screen
    When User select POS Settings tab in void screen
    Then User open ask customer name option if disable in void screen
    And I click the Toggle Icon button
    And I click POS Icon from Toggle
    And I closed the order type window
    When User click QSR on Menu Item page in void screen
    Then User select Bar Tab in order types in void screen
    When User enter customer name for bar tab in void screen
    And I click the Exit to close the preauth window

    Then User take an order in void screen
    When I get the check no in the order screen in void screen "Get Check Number"
    When User click Cash Tab on Menu Item Page in void screen
    Then User click exact option in void screen
    And User click enter button in void screen
    And User click Check Status tab in void screen
    Then User click Closed Checks tabs in void screen
    Then I click the Closed check on check stats
    When User click re-open check button in void screen
    Then User click payment button in void screen
    And User verify paid order for Sandwiches in void screen
    When I click Exit in the payment screen in void screen "exit button clicked"
    When User click finish button in void screen
    And I click QSR tab
    And I closed the order type window
    #Void Normal Check — Select from BarTab
    When User click QSR on Menu Item page in void screen
    Then User select Bar Tab in order types in void screen
    When User enter customer name for bar tab in void screen
    And I click the Exit to close the preauth window
    And I get check number
    Then User take an order in void screen
    When User click Cash Tab on Menu Item Page in void screen
    Then User click exact option in void screen
    And User click enter button in void screen
    And User click Check Status tab in void screen
    Then User click Closed Checks tabs in void screen
    Then I click the Closed check on check stats
    When User click re-open check button in void screen
    And I click Void button on order management screen
    Then I should see payment made on this check popup message1
    And I click Done button on the Popup
    And I click payment in the payment window
    And I click Delete button on the payment window
    And I click Exit to return to Order Management Screen
    And I click Void button on order management screen
    And I click void Reason on the void popup
    And I click Add Button on the void reason popup
    Then User click Check Status tab in void screen
    And I click power button

    Examples:
      |btnFinish|btnQsr|btnCancel|btnPayment|btnOk|btnVoid|btnWrong           |btnAdd|btnDone |tabCheckStatus|btnExit|
      |finish   |QSR   |Cancel   |Payment   |OK   |Void   |Wrong Item Ordered |Add    |Done   |Check Stats   |Exit   |

  @RegressionQSR3
  Scenario Outline: Verify Tax Exempt- From Order Screen,Application  should removed Tax Exempt and Tax should applied for that Entire Check from Order Screen,Verify Application should not allow to do Tax Exempt after Payment Done Check
    When User click QSR on Menu Item page
    Then User select DineIn order type
    And User select first table
    And I get check number
    And I select menu item as "SANDWICHES"
    Then User click Option Tab
    When User select tax exempt option
#    Then User select tax exempt type
#    And User verify added tax exempt1
#    #Application  should removed Tax Exempt and Tax should applied for that Entire Check from Payment Screen - yyy
    #Application  should removed Tax Exempt and Tax should applied for that Entire Check from Order Screen
    When User click Option Tab
    Then User select tax exempt option
#    Then I should see Tax Exempt removed successfully popup
#    And I click Done button on the Popup
    #Verify Application should not allow to do Tax Exempt after Payment Done Check - xxx
    And I click Payment button in the Order Management Screen
    When User click exact option
    Then USer click cash button
    And User click submit button
#    When User click QSR on Check Status page
#    And I closed the order type window
#    When User click All button
    And I click Check Stats tab
    Then User click Closed Checks tabs
    And I click the Closed check on check stats
    When User click re-open check button
    Then User click Option Tab
    When User select tax exempt option
#    And User select tax exempt type
#    And User verify apply tax exempt paid amount warning popup
#    And I click " Back " for closing future order "Click Back button"
#    And I click on " Back " for closing order screen popup "Click Back button"
    Then User click payment button
    And User click submit button
     And I click QSR tab
   And I closed the order type window
    And I click log off button in order screen

    Examples:
      |btnQsr|btnCancel|btnPayment|btnLogOff|
      |QSR   |Cancel   |Payment   |logOff   |

  @RegressionQSR3
  Scenario Outline: Verify Check Payment through Side CC with Tax Exempt and also with tip
#    Given User click setting icon
#    And User click POS Option
#    And User close ask customer name option if enable
#    And I click the Toggle Icon button
#    And I click POS Icon from Toggle
#    And I closed the order type window
    When User click QSR on Menu Item page
    Then User select Bar Tab in order types
    And User click cancel button for customer name popup
    And I click the Exit to close the preauth window
#    When User click food category
    Then User select Sandwiches menu item
    Then User click Option Tab
    When User select tax exempt option
#    Then User select tax exempt type
    And I should verify subtotal value as "$ 1.00"
    When User click payment button
    Then User click exact option
    And User click CC Side payment method
#    When User select tip amount which is entered
    And I click tip as 10
    And I click the Continue button on the Total screen
    Then I should see the Payment window
    And I click Submit button on the Payment Window
#    And User verify CC Side payment with Tax Exempt as select customer and with tips
#    When User click submit button
   And I click QSR tab
   And I closed the order type window
    And I click log off button in order screen

    Examples:
      |btnQsr|btnCancel|btnLogOff|
      |QSR   |Cancel   |logOff   |

  @RegressionQSR3
  Scenario Outline: Verify Check Payment through Side CC with Tax Exempt not select customer in payment screen and also with tip
    When User click QSR on Menu Item page
    Then User select Bar Tab in order types
    When User click cancel button for customer name popup
    And I click the Exit to close the preauth window
    When User click food category
    And I select menu item as "SANDWICHES"
    Then User click Option Tab
    When User select tax exempt option
#    Then User select tax exempt type
#    And User verify added tax exempt1
    When User click payment button
    Then User click exact option
    And User click CC Side payment method
    When User select tip amount which is entered
    And User click Continue button
    And User verify CC Side payment with Tax Exempt as not select customer in payment screen and with tips
    When User click submit button
   And I click QSR tab
   And I closed the order type window
    And I click log off button in order screen

    Examples:
      |btnQsr|btnCancel|btnLogOff|
      |QSR   |Cancel   |logOff   |


#  Scenario: Search Menu Item on Menu
#    When User click Option Tab
#    Then User select Search Item option
#    When User enter searched menu item
#    Then User verify searched menu item
#    And User clear the search bar
#    #Search Menu Item Not in The Menu
#    When User enter searched menu item not in the menu
#    Then User verify no searched menu item
#    And User clear the search bar
#    #Application not allow user to search the category and sub- category
#    When User enter search any category and sub category
#    Then User verify search info message
#    And I click "Hide keyboard" button in the keyboard "Click Back"
#    When USer click log off button

  @RegressionQSR3
  Scenario Outline: Settings Icon on Order Screen,Sync Icon on Order Screen,Application allow user to sync the change through order screen sync button,Add Customer' Icon,Application don't allow user to do "Log off","Operation","Till Management","Sync Icon","All" button process during a sale
    When User click setting icon
    Then User verify setting options
    And I click POS Icon from Toggle
    And I closed the order type window
    #Application allow user to sync the change through order screen sync button
#    Given User select QSR mode on menu item page
    When User click sync icon
    And I wait sometimes
    And I click All
    And User click Table Layout menu
    And I click new check button on the Table layout screen
    And I select the "T9" in the Table layout screen"click t4 table"
    And User enter number of seat
    And I click the Continue button

#    And I click the "<btnClose>" in the customer profile page "click close button"
    When User click QSR on Menu Item page
    When User click QSR on Menu Item page1
    #  Scenario Outline: Settings Icon
    Then User take an order
    When USer click log off button
    Then User verify close sale popup info
    And I click Done button on the Popup
    When I click the Settings button
    #Application don't allow user to do "Operation" button process during a sale
    Then User verify close sale popup info
     #Application don't allow user to do "Till" button process during a sale
    When User click "<btnTillMamagement>" in the order Screen "click till management button"
    Then User verify close sale popup info
    And I click Done button on the Popup
    #Application don't allow user to do "Sync" button process during a sale
    When User click sync icon
    Then User verify sync popup info
    And I click Done button on the Popup
    #Application don't allow user to do "All" button process during a sale
    When User click All button
      When I should see close your sale
    And I click Done button on the Popup
    Then User click payment button
    And User click exact option
    And USer click cash button
    When User click submit button
    And I closed the order type window
    When USer click log off button

    Examples:
      |    btnClose         |btnVoid|btnWrong   |btnAdd|btnDone|btnQsr |btnCancel|btnDinein|btnQsr|tabAll|btnDone|btnSettings|btnTillMamagement|btnContinue|
      |CustomerProfile Close|Void   |arrow down |Add   |Done   |QSR    |Cancel   |Dine In  |QSR   |All   |Done   |Settings 1  |Counting Machine|Continue   |

#  @RegressionQSR301
#  Scenario Outline: Verify tax after adding menu item,Verify multiple tax after adding menu item,Verify Subtotal before adding menu item,Verify Subtotal after adding menu item, Verify discount before adding menu item ,Verify gratuity after adding menu item in the order screen,Verify Paid Amount in order screen before doing partial payment,Verify Paid Amount in order screen after doing partial payment,Verify Paid Amount in order screen after doing Full payment
#
#    And I select menu item as "Pancake"
#    #Verify tax after adding menu item
#    Then It should show the amount "<number2>" value as "<text>" "Verify tax amount value"
#    And I click the "<item2>" from the menu item "Click item as onion rings"
#    #Verify multiple tax after adding menu item
#    Then It should show the amount "<number2>" value as "<text1>" "Verify multiple tax amount value"
#    And I click Void button on order management screen
#    And I click Done to get back
#    #Verify Subtotal before adding menu item
#    Then It should show the amount "<number1>" value as "<text2>" "Verify subtotal amount value"
#    And I select menu item as "Pancake"
#    #Verify Subtotal after adding menu item
#    Then It should show the amount "<number1>" value as "<text3>" "Verify subtotal amount value"
#    And I click Void button on order management screen
#    And I click Done to get back
#    When I click the Drop down "<btnDropDown>" button in the order screen "click drop down button"
#    And I click "<category>" in the top order screen "Select Category as CIFOOD"
#    And I click the "<item3>" from the menu item "Click item as sandwiches"
#    #Verify discount before adding menu item
#    Then It should show the amount "<number3>" value as "<text4>" "Verify discount amount value"
#    And I click option button "Option button  clicked"
#    And I click on "<btnGratuity>" for choose gratuity "Click gratuity button"
#    When I click on "<optFixedGratuity>" "Click fixed gratuity button"
#    #Verify gratuity after adding menu item in the order screen
#    Then It should show the amount "<number4>" value as "<text5>" "Verify gratuity amount value"
#    And I click Payment button in the Order Management Screen
#    Then I click cash button from the payment method popup
#    And I click Submit button on the Payment Window "click submit button"
#    And I closed the order type window
#    #Verify Paid Amount in order screen before doing partial payment
#    And I select menu item as "Pancake"
#    Then It should show the amount "<number4>" value as "<text2>" "Verify paid amount value"
#    And I click on "<btnPayment>" in the order screen for paying amount "Click on payment to pay partial amount"
#    And I enter partial payment amount "0","0","2","0"
#    Then I click cash button from the payment method popup
#    When I click on the exit button to close the Payment Popup "Exit button clicked"
#    #Verify Paid Amount in order screen after doing partial payment
#    Then It should show the amount "<number4>" value as "$ 0.20" "Verify paid amount value"
#    And I click on "<btnPayment>" in the order screen for paying amount "Click on payment to pay full amount"
#    Then I click cash button from the payment method popup
#    When I click on the exit button to close the Payment Popup "Exit button clicked"
#    #Verify Paid Amount in order screen after doing Full payment
#    Then It should show the amount "<number4>" value as "<text7>" "Verify paid amount value"
#    And I click Payment button in the Order Management Screen
#    And I select the credit card check in the payment screen "Credit card amount clicked"
#    When I click Delete in the payment screen "Delete button clicked"
#    And I click "<btnOk>" in the receipt printer popup"Click ok button in the popup"
#    And I select the credit card check in the payment screen "Credit card amount clicked"
#    When I click Delete in the payment screen "Delete button clicked"
#    And I click "<btnOk>" in the receipt printer popup"Click ok button in the popup"
#    When I click Exit in the payment screen "exit button clicked"
#    And I click Void button on order management screen
#    And I click void Reason on the void popup
#    And I click Add Button on the void reason popup
#    And I click Done to get back
#    And I closed the order type window
#    And I click log off button in order screen
#
#    Examples:
#      | text     | item    | number2 |item2       | text1 |btnVoid |number1 |text2   |text3  |number4 |number3 |btnGratuity | optFixedGratuity | text4 |text5  | text6  |text7  |btnPayment |paymentPin0 |paymentPin5 |btnCash |btnOk | btnWrong          | btnAdd | btnDone | item3          |  btnLogOff |btnDropDown|category|
#      | $ 0.31   | Pancake | 2       |Onion Rings |$ 1.21 |Void    | 1      | $ 0.00 |$ 1.00 | 4      | 3      |Gratuity    | Fixed Gratuity   |$ 1.25 |$ 0.14 |$ 1.20  |$ 1.20 |Payment    | 0          |5           |Cash    | OK   |Wrong Item Ordered | Add    | Done    | EGG SANDWICHES | logOff     |arrow down |CIFOOD  |
  @RegressionQSR3
  Scenario: Application allow user to login through operation
    Given User click setting icon
    And User verify setting options
    And I click POS Icon from Toggle
    Then User click cancel button
    When User click QSR on Menu Item page
    Then User select DineIn mode
    When User select table
    When I select menu item as "SANDWICHES"
    And I should verify total value as "$ 1.00"
    Then User click payment button
    And User select payment method with cash
    And User click submit button
    And I click QSR tab
    And I closed the order type window
    When USer click log off button

  @RegressionQSR3
  Scenario: Cash-On Empty Checks- empty
#    Given User click setting icon
#    And User verify setting options
#    When User select POS Settings tab
#    Then User close ask customer name option if enable
#    And I click the "POS" button for navigating to the pos screen "click pos button"
#    And I closed the order type window
    Given User click QSR on Menu Item page
    And User select DineIn mode
    And I select the "T16" in the Table layout screen"click t4 table"
    When User click Cash Tab
    Then User verify has no any order
    #Cash-Reopen Check/After Payment
    When I get check number
    When User take an order
    Then User click Cash Tab
    And User click exact option
    And User click enter button
    And User click Check Status tab in void screen
    Then User click Closed Checks tabs in void screen
    Then I click the Closed check on check stats
    When User click re-open check button in void screen
    And I click Payment button in the Order Management Screen
    Then User select paid order
    And I click Delete button on the payment window
#    And User click printer popup
    When User click exact option
    Then USer click cash button
    And User click submit button
    And I click QSR tab
    Then User click cancel button
    #Cash-Reopen Check/After Payment with One More Seat
    Given User click QSR on Menu Item page
    And User select DineIn mode
    And User select first table
    When User click add seat button
    And I select menu item as "SANDWICHES"
    Then User select first seat on menu item page
    And I select menu item as "SANDWICHES"
    And I click Payment button in the Order Management Screen
    Then USer click cash button
    And User click exit on payment page
    When User select second seat on menu item page
    And I select menu item as "SANDWICHES"
    And User click Cash Tab
    Then User pay order
    When I click QSR tab
    And I closed the order type window
    #Normal check with Fast cash payment
#    When User click QSR on Menu Item page
#    Then User select Bar Tab in order types
#    And I click the Exit to close the preauth window
    When User take an order
    Then User click Cash Tab on Menu Item Page
    When User click exact option
    Then User click enter button
#    And I click QSR tab
    Then User click cancel button
    #Normal check with cash payment
#    When User click QSR on Menu Item page
#    Then User select Bar Tab in order types
#    And I click the Exit to close the preauth window
    When User take an order
    And I click Payment button in the Order Management Screen
    When User click exact option
    Then USer click cash button
    And User verify cash payment for Sandwiches
    And User click submit button
#    And I click QSR tab
    Then User click cancel button
    When USer click log off button

  @RegressionQSR3
  Scenario: Normal check with Fast cash payment and Service Charge,Normal check with cash payment and Service Charge
    Given User click setting icon
    And User verify setting options
    When User select POS Settings tab
    Then User open ask customer name option if disable in void screen
    And I click the Toggle Icon button
    And I click POS Icon from Toggle
    And I closed the order type window
    When User click QSR on Menu Item page
    Then User select Bar Tab in order types
    When User click cancel button for customer name popup
    And I click the Exit to close the preauth window
    When User select drinks category
    Then User select cocktail menu item
    Then User click Cash Tab on Menu Item Page
    When User click exact option
    Then User click enter button
    And I click QSR tab
    And I closed the order type window
    #Normal check with cash payment and Service Charge
    When User click QSR on Menu Item page
    Then User select Bar Tab in order types
    When User click cancel button for customer name popup
    And I click the Exit to close the preauth window
    When User select drinks category
    Then User select cocktail menu item
    And I click Payment button in the Order Management Screen
    When User click exact option
    Then USer click cash button
    And User verify cash payment for Cocktail with service charge
    And User click submit button
    And I click QSR tab
    And I closed the order type window
    When USer click log off button

  @RegressionQSR3
  Scenario: Normal Check Cancel - Cancel “Enter Customer Name” popup todo
    Given User click setting icon
    And User verify setting options
    When User select POS Settings tab
    Then User open ask customer name option if disable in void screen
    And I click the Toggle Icon button
    And I click POS Icon from Toggle
    And I closed the order type window
    When User click QSR on Menu Item page
    Then User select Bar Tab in order types
    When User click cancel button for customer name popup
    And I click the Exit to close the preauth window
    Then User take an order
    When User click Cash Tab on Menu Item Page
    Then User click exact option
    And User click enter button
   And I click QSR tab
    # Normal Check - Enter name to “Enter Customer Name” popup
    And I closed the order type window
    When User click QSR on Menu Item page
    Then User select Bar Tab in order types
    When User enter customer name for bar tab
    And I click the Exit to close the preauth window
    Then User take an order
    When User click Cash Tab on Menu Item Page
    Then User click exact option
    And User click enter button
    And I click QSR tab
    And I closed the order type window
    When USer click log off button

  @RegressionQSR3
  Scenario: Normal check with Side CC payment
    Given User click setting icon
    And User verify setting options
    When User select POS Settings tab
    Then User open ask customer name option if disable in void screen
    And I click the Toggle Icon button
    And I click POS Icon from Toggle
    And I closed the order type window
    When User click QSR on Menu Item page
    Then User select Bar Tab in order types
    When User enter customer name for bar tab
    And I click the Exit to close the preauth window
    When User take an order
    And I click Payment button in the Order Management Screen
    When User click exact option
    Then User click CC Side payment method
    Then User select tip amount which is entered
    And User click Continue button
    When User verify Side CC payment for Sandwiches
    Then User click submit button
    When I click QSR tab
    And I closed the order type window
    #Normal check with Side CC payment with tips and without service charge
    When User click QSR on Menu Item page
    Then User select Bar Tab in order types
    When User enter customer name for bar tab
    And I click the Exit to close the preauth window
    When User take an order
    And I click Payment button in the Order Management Screen
    When User click exact option
    Then User click CC Side payment method
    Then User select tip amount which is entered
    And User click Continue button
    When User verify Side CC payment for Sandwiches with tips and without service charge
    Then User click submit button
    When I click QSR tab
    #Normal check with Side CC payment with tips and with service charge
    And I closed the order type window
    When User click QSR on Menu Item page
    Then User select Bar Tab in order types
    When User enter customer name for bar tab
    And I click the Exit to close the preauth window
    When User select drinks category

    Then User select cocktail menu item
    And I click Payment button in the Order Management Screen
    When User click exact option
    Then User click CC Side payment method
    Then User select tip amount which is entered
    And User click Continue button
    When User verify Side CC payment for cocktail with tip and service charge
    Then User click submit button
    When I click QSR tab
    And I closed the order type window
    #Normal check with Side CC payment without tips and without service charge
    When User click QSR on Menu Item page
    Then User select Bar Tab in order types
    When User enter customer name for bar tab
    And I click the Exit to close the preauth window
    When User select drinks category
    Then User select cocktail menu item
    And I click Payment button in the Order Management Screen
    When User click exact option
    Then User click CC Side payment method
    Then User click no tip button
    And User click Continue button
    When User verify Side CC payment for cocktail without tip and service charge
    Then User click submit button
    When I click QSR tab

    And I closed the order type window
    When USer click log off button


  @RegressionQSR3
  Scenario Outline: Check Discount for item based
    #Check Discount for item based
    # Application display enter the menu item discount
#    Given User select QSR mode on menu item page
    And User take an order in check status screen
    And I select Discount on the Order screen
    Then I should see Check Based Discount Screen
    And I click Discount as "Item-Based Discount"
    And I click Back button on Discount Screen
    And I should verify discount value as "$ 0.58"
#    When User select item discount option tab
#    When I click "<optItemBasedDiscount>" in the discount screen "Select ItemBasedDiscount option"
    # Remove Discount
#    When User select first ordered item
    And I select Discount on the Order screen
    Then I should see Check Based Discount Screen
    And I click Discount as "Item-Based Discount"
    And I click Back button on Discount Screen
#    When I click the "<optItemBasedDiscount>" in the discount screen "Select ItemBasedDiscount option"
#    Then User verify deleted discount
    And I should verify discount value as "$ 0.00"
    And I click Void button on order management screen
    And I click void Reason on the void popup
    And I click Add Button on the void reason popup
#    And I click Done to get back
   And I closed the order type window

    #Check Discount for check-based
#    Given User select QSR mode on menu item page
    And I select menu item as "SANDWICHES"
    And I select Discount on the Order screen
    Then I should see Check Based Discount Screen
    And I click Discount as "Check Based Free"
    And I click Back button on Discount Screen
#    And User select check based as free discount option
    And User verify applied check based free item discount
    And I click Void button on order management screen
    And I click Done button on the Popup
#    And I click void Reason on the void popup
#    And I click Add Button on the void reason popup
#    And I click Done to get back
#   And I closed the order type window
    # Open Check Discount Option with Percentage
#    Given User select QSR mode on menu item page
#    And User take an order in check status screen
#    And I select Discount on the Order screen
#    Then I should see Check Based Discount Screen
#    And I click Discount as "Check Based Amount"
#    And I click Back button on Discount Screen
#    When User select charge type as percentage
#    And User enter discount percentage
#    And User enter open discount reason
#    And User select after tax type applied time
#    Then User click apply button for open discount
#    And User verify open check discount
#    And I click Void button on order management screen
#    And I click void Reason on the void popup
#    And I click Add Button on the void reason popup
#    And I click Done to get back
#   And I closed the order type window
    #Open Check Discount Option with Amount
#    Given User select QSR mode on menu item page
#    And User take an order as "Chicken Schnitzel"
#    And I select Discount on the Order screen
#    Then I should see Check Based Discount Screen
#    And I click Discount as "Check Based Amount"
#    And I click Back button on Discount Screen
#    When User select charge type as amount
#    And User enter discount amount
#    And User enter open discount reason
#    And User select after tax type applied time
#    Then User click apply button for open discount
#    And User verify open check discount
#    And I click Void button on order management screen
#    And I click void Reason on the void popup
#    And I click Add Button on the void reason popup
#    And I click Done to get back
#   And I closed the order type window
    And I click log off button in order screen

    Examples:
      |btnVoid|     btnWrong         |btnAdd|btnCancel |btnDiscount |optItemBasedDiscount|btnLogOff|btnDone|
      |Void   |   Wrong Item Ordered |Add   |Cancel    |Discount    |Item-Based Discount |logOff   |Done   |

  @RegressionQSR3
  Scenario Outline: Check with discount(Check based - After tax) as Amount
##    Given User select QSR mode on menu item page
    And I select category as "FOOD"
    And I select menu item as "Chicken Schnitzel"
    And I selected quantity as "3"
    And I select Discount on the Order screen
    Then I should see Check Based Discount Screen
    And I click Discount as "Check Based Amount"
    And I click Back button on Discount Screen
#    Then User select check based amount discount option
    And User verify applied check based amount discount
    When User click Cash Tab
    And User click exact option
    Then User click enter button
    And I closed the order type window
#    When User click All button
#    And User click Check Status tab
#    Then User click Closed Checks tabs in check status screen
#    And User verify closed checks
#   And I click QSR tab
#   And I closed the order type window
    # Check with discount(Check based - After tax) as Percentage
##    Given User select QSR mode on menu item page
#    And User take an order as "<SANDWICHES
    And I select category as "FOOD"
    And I select menu item as "Chicken Schnitzel"
#    And I selected quantity as "3"
    And I select Discount on the Order screen
    Then I should see Check Based Discount Screen
    And I click Discount as "Check-Based Percentage"
    And I click Back button on Discount Screen
#    And User select check based percentage discount option
    And User verify applied check based percentage discount
    When User click Cash Tab
    And User click exact option
    Then User click enter button
    And I closed the order type window
#    When User click All button
#    Then User click Closed Checks tabs in check status screen
##    And User verify closed checks
#   And I click QSR tab
#   And I closed the order type window
  #Check with discount(Check based - After tax) as set price
##    Given User select QSR mode on menu item page
    And I select menu item as "Chicken Schnitzel"
    And I select Discount on the Order screen
    Then I should see Check Based Discount Screen
    And I click Discount as "CB-AfterTax-SetPrice"
    And I click Back button on Discount Screen
#    Then User select check based discount after tax as set price
    When User click Cash Tab
    And User click exact option
    Then User click enter button
    And I closed the order type window
#    When User click All button
#    And User click Check Status tab
#    Then User click Closed Checks tabs in check status screen
#    And User verify closed checks
#   And I click QSR tab
#   And I closed the order type window

#    #Check with discount(Check based - After tax) as Free
##    Given User select QSR mode on menu item page
    And I select menu item as "Chicken Schnitzel"
    And I select Discount on the Order screen
    Then I should see Check Based Discount Screen
    And I click Discount as "Check Based Free"
    And I click Back button on Discount Screen
#    And User select check based as free discount option
    And User verify applied check based free item discount
    Then I should see orderscreen with as Onion Rings EACH
    When User click Cash Tab
    And User click exact option
    Then User click enter button
    And I closed the order type window
#    When User click All button
#    And User click Check Status tab
#    Then User click Closed Checks tabs in check status screen
#    And User verify closed checks
#   And I click QSR tab
#   And I closed the order type window
 And I click log off button in order screen

    Examples:
      |btnQsr|btnCancel|btnDiscount |btnLogOff|
      |QSR   |Cancel   |Discount    |logOff   |

 #todo done
 #  @RegressionTest @SmokeTest
  @RegressionQSR3
  Scenario Outline: Check with discount(item based - After tax) as amount
    And I select menu item as "SANDWICHES"
    And I select menu item as "SANDWICHES"
    And I select Discount on the Order screen
    Then I should see Check Based Discount Screen
    And I click Discount as "IB-AfterTax-Amount"
    And I click Back button on Discount Screen
#    Then User select item based discount after tax as amount
    When User click Cash Tab
    Then User click exact option
    And User click enter button
    And I closed the order type window
 #Check with discount(item based - After tax) as Free Enable auto Discount
    And I select category as "CIFOOD"
#    When User select menu item and take an order
#    And I pass menu item to search and click the menu item as "EGG SANDWICHES"
    And I select menu item as "EGG SANDWICHES"
    And I click Order button in the order management screen
#    Then User verify auto discount amount
    And I select Discount on the Order screen
    Then I should see Check Based Discount Screen
    And I click Discount as "Free Item"
    And I click Back button on Discount Screen
#    And User select free item option
    And User verify free item
    And I click Void button on order management screen
    And I click void Reason on the void popup
    And I click Add Button on the void reason popup1
    And I closed the order type window


   # Check with discount(item based - After tax) as percentage
    And I select menu item as "SANDWICHES"
    And I select Discount on the Order screen
    Then I should see Check Based Discount Screen
    And I click Discount as "ItemBased with Percentage"
    And I click Back button on Discount Screen
#    Then User select item based percentage discount option
    When User click Cash Tab
    Then User click exact option
    And User click enter button
    And I closed the order type window

    # Check with discount(item based - After tax) as Free
    And I select menu item as "SANDWICHES"
    And I select Discount on the Order screen
    Then I should see Check Based Discount Screen
    And I click Discount as "Item-Based with Free"
    And I click Back button on Discount Screen
#    And User select item based as free discount option
    And User verify applied item based free item discount value2 as "0.00"
    Then I should see orderscreen with as Onion Rings EACH
    When User click Cash Tab
    And User click exact option
    Then User click enter button
    And I closed the order type window
    And I click log off button in order screen


    Examples:
      |btnQsr|btnCancel|btnVoid|btnWrong|btnAdd|btnCancel|btnDiscount|btnLogOff|btnDropDown|category|
      |QSR   |Cancel   |Void   |Wrong Item Ordered  |Add   |Cancel   |Discount   |logOff |arrow down |CIFOOD |


#todo Done
#  @RegressionTest @SmokeTest
  @RegressionQSR3
  Scenario Outline: Not allows to Remove the Auto Discount
#    Given User select QSR mode on menu item page
    And I select category as "CIFOOD"
#    When User select menu item and take an order
#    And I pass menu item to search and click the menu item as "EGG SANDWICHES"
    And I select menu item as "EGG SANDWICHES"
    And I click Order button in the order management screen
    And I select Discount on the Order screen
    Then I should see Check Based Discount Screen
    And I click Discount as "Free Item"
    And I click Back button on Discount Screen
#    And User select free item option
    And User verify applied item based free item discount value as "0.00"
    And I select Discount on the Order screen
    Then I should see Check Based Discount Screen
    And I click Discount as "Auto Discount"
    And I click Back button on Discount Screen

#    And User verify applied auto discount not delete
    And I click Void button on order management screen
    And I click void Reason on the void popup
    And I click Add Button on the void reason popup1
#    And I click Done to get back
    And I closed the order type window
    #Application allows to Repeat the same menu item when user click Repeat button in Menu option
    And I select category as "FOOD"
    And I select menu item as "SANDWICHES"
    And I click menu item as "SANDWICHES" to see Menu option screen
    When User click Repeat menu option
    Then User verify added first ordered item
    And I click Void button on order management screen
    And I click Done button on the Popup
    #Application allows to Increase or Decrease the Menu item Quantity
#    Given User select QSR mode on menu item page
    And I select category as "FOOD"
    And I select menu item as "SANDWICHES"
    And I click menu item as "SANDWICHES" to see Menu option screen
    When User click Quantity menu option
    Then User enter number of quantity for add
    And User verify increased number of quantity
    And I click menu item as "SANDWICHES" to see Menu option screen
    When User click Quantity menu option
    Then User enter number of quantity for decrease
    And User verify decreased number of quantity
    And I click Void button on order management screen
    And I click Done button on the Popup
#    Given User select QSR mode on menu item page
    And I click log off button in order screen

    Examples:
      |btnDone   |category1   |btnVoid|   btnWrong        | btnAdd|btnCancel|btnDiscount|optAutoDiscount|btnDropDown|category|btnLogOff|
      |Done  |FOOD   |Void   |Wrong Item Ordered |Add    |Cancel   |Discount  |Auto Discount   |arrow down |CIFOOD  |logOff   |

#todo done
#  @RegressionTest
  @RegressionQSR3
  Scenario Outline: Verify item based discount after tax
#    Given User select QSR mode on menu item page
    And I select category as "PIZZA"
    And I select menu item as "Pizza Romano"
    And I select Discount on the Order screen
    Then I should see Check Based Discount Screen
    And I click Discount as "IB-DiscountAfterTax"
    And I click Back button on Discount Screen
#    Then User select item based discount after tax
    And User verify item based discount after tax
    And I click Void button on order management screen
    And I click Done button on the Popup
    #Verify item based discount after tax attach Day Restriction
#    Given User select QSR mode on menu item page
    And I select category as "Appetizers"
    Then I select menu item as "BRUSHETTA"
    And I select Discount on the Order screen
    Then I should see Check Based Discount Screen
    And I click Discount as "After Tax Day Restriction"
    And I click Back button on Discount Screen
#    Then User select item based discount after tax day restrict
    And User verify item based discount after tax day restrict
    And I click Void button on order management screen
    Then I should see All orders are voided
    And I click Done button on the Popup

    # Verify item based discount after tax attach Role Restriction
#    Given User select QSR mode on menu item page
#    When I click the Drop down "<btnDropDown>" button in the order screen "click drop down button"
    And I select category as "PIZZA"
    And I select menu item as "Pizza Romano"
    And I select Discount on the Order screen
    Then I should see Check Based Discount Screen
    And I click Discount as "AfterTax-RoleRestriction"
    And I click Back button on Discount Screen
#    Then User select item based discount after tax role restrict

    And User verify item based discount after tax role restrict
    And I click Void button on order management screen
    Then I should see All orders are voided
    And I click Done button on the Popup
    #Verify item based discount after tax with other tax & Auto discount
#    Given User select QSR mode on menu item page
    And I select category as "PIZZA"
    And I select menu item as "Pizza Romano"
#    And User verify auto discount amount
    And I select Discount on the Order screen
    Then I should see Check Based Discount Screen
    And I click Discount as "IB-DiscountBeforeTax"
    And I click Back button on Discount Screen
#    Then User select item based discount after tax
    And User verify item based discount after tax
    And I click Void button on order management screen
    Then I should see All orders are voided
    And I click Done button on the Popup
    #Verify item based discount before tax
#    Given User select QSR mode on menu item page
    And I select category as "PIZZA"
    And I select menu item as "Pizza Romano"
    And I select Discount on the Order screen
    Then I should see Check Based Discount Screen
    And I click Discount as "IB-DiscountAfterTax"
    And I click Back button on Discount Screen
#    Then User select item based discount before tax
    And User verify item based discount before tax
    And I click Void button on order management screen
    Then I should see All orders are voided
    And I click Done button on the Popup
    #Verify item based discount before tax attach Day Restriction
#    Given User select QSR mode on menu item page
    And I select category as "Appetizers"
    Then I select menu item as "BRUSHETTA"
    And I select Discount on the Order screen
    Then I should see Check Based Discount Screen
    And I click Discount as "BeforeTaxDayRestriction"
    And I click Back button on Discount Screen
#    Then User select item based discount before tax day restrict
    And User verify item based discount before tax day restrict
    And I click Void button on order management screen
    Then I should see All orders are voided
    And I click Done button on the Popup
    #Verify item based discount before tax attach Role Restriction
#    Given User select QSR mode on menu item page
#    When I click the Drop down "<btnDropDown>" button in the order screen "click drop down button"
    And I select category as "PIZZA"
    And I select menu item as "Pizza Rucola"
    And I select Discount on the Order screen
    Then I should see Check Based Discount Screen
    And I click Discount as "BeforeTaxRoleRestriction"
    And I click Back button on Discount Screen
#    Then User select item based discount before tax role restrict
#    Given I enter the Pin number as "1","1","1","1"
#    Then I click "<btnContinue>" in the tip popup "Click Continue Button"
    And User verify item based discount before tax role restrict
    And I click Void button on order management screen
    Then I should see All orders are voided
    And I click Done button on the Popup
    #Verify item based discount before tax with other tax & Auto discount
    #Verify item based discount before tax  — with other tax & Auto discount
#    Given User select QSR mode on menu item page
#    When I click the Drop down "<btnDropDown>" button in the order screen "click drop down button"
    And I select category as "PIZZA"
    And I select menu item as "Pizza Romano"
#    And User verify auto discount amount
    And I select Discount on the Order screen
    Then I should see Check Based Discount Screen
    And I click Discount as "IB-DiscountAfterTax"
    And I click Back button on Discount Screen
#    Then User select item based discount before tax
#    And User verify item based discount before tax
    And I select Discount on the Order screen
    Then I should see Check Based Discount Screen
    And I click Discount as "AfterTax-RoleRestriction"
    And I click Back button on Discount Screen
#    Then User select item based discount after tax role restrict
#    Given I enter the Pin number as "1","1","1","1"
#    Then I click "<btnContinue>" in the tip popup "Click Continue Button"
    And User verify item based discount after tax role restrict
    And I click Void button on order management screen
    Then I should see All orders are voided
    And I click Done button on the Popup
#    #Given User select QSR mode on menu item page
    And I click log off button in order screen

    Examples:
      |btnVoid|btnDiscount|btnDropDown|category|btnContinue|btnCancel|btnLogOff|btnLogOff1|
      |Void   | Discount  |arrow down |Appetizers|Continue |Cancel   |logOff   |Log Off   |

#todo inprogress
#  @SmokeTest @RegressionTest
  @RegressionQSR3
  Scenario Outline: Verify check based discount after tax
#    Given User select QSR mode on menu item page
    And I select category as "PIZZA"
    And I select menu item as "Pizza Lasagna"
#    When User click Option Tab
    And I select Discount on the Order screen
    Then I should see Check Based Discount Screen
    And I click Discount as "CB-PercentageAfterTax"
    And I click Back button on Discount Screen
#    Then User select check based discount after tax
    And User verify check based discount after tax value as "$ 1.50"
    And I click Void button on order management screen
    Then I should see All orders are voided
    And I click Done button on the Popup
    #Verify check based discount before tax
    #Verify check based before tax discount with other tax and Auto discount
#    Given User select QSR mode on menu item page
#    And User click food category
    And I select category as "PIZZA"
    And I select menu item as "Pizza Rucola"
    And I select Discount on the Order screen
    Then I should see Check Based Discount Screen
    And I click Discount as "CheckBased-BeforeTax"
    And I click Back button on Discount Screen
    And User verify check based discount before tax
    And I click Void button on order management screen
    Then I should see All orders are voided
    And I click Done button on the Popup
    #Verify check based discount before tax attach Role Restriction
#    Given User select QSR mode on menu item page
    And I select category as "PIZZA"
    And I select menu item as "Pizza Rucola"
    And I select Discount on the Order screen
    Then I should see Check Based Discount Screen
    And I click Discount as "CB-AfterTax-RestrictRole"
    And I click Back button on Discount Screen
#    Then User select check based discount before tax role restrict
    And User verify check based discount before tax role restrict
    And I click Void button on order management screen
    Then I should see All orders are voided
    And I click Done button on the Popup
#  #  Given User select QSR mode on menu item page
    And I click log off button in order screen

    Examples:
      |btnVoid|btnLogOff|btnCancel|btnDiscount|btnDropDown|category|btnLogOff1|
      |Void   |logOff   |Cancel   |Discount   |arrow down |Appetizers |Log Off |

#todo done
#  @d1
  @RegressionQSR3
  Scenario Outline: Verify check based discount after tax with open item (amount only)
    And I select category as "FOOD"
    And I select menu item as "SANDWICHES"
    Then User click Option Tab
    When User select Open Item option
    And I click Coursing Name text field for Menu option
    And I swipe to "<course_name>" as Coursing Name
    And I pass course name as "onion"
    And I tap Price text field for menu option
    And I enter the percentage1 as "3000"
    And I click Done button on the open item window
    Then I should navigate to Order Management screen and see the added open item as "onion"
    And I select Discount on the Order screen
    Then I should see Check Based Discount Screen
    And I click Discount as "CB-AfterTax-OpenItem"
    And I click Back button on Discount Screen
#    Then User select check based discount after tax with open item
    And User verify check based discount after tax with open item
    And I click Void button on order management screen
    And I click Done button on the Popup
    # Verify check with discount as Free which has item based and before tax discount
    And I select category as "FOOD"
    And I select menu item as "SANDWICHES"
#    When User click Option Tab
    And I select Discount on the Order screen
    Then I should see Check Based Discount Screen
    And I click Discount as "IB-FreeDiscountBeforeTax"
    And I click Back button on Discount Screen

#    When User select Free discount option which has before tax
    And User verify item based free discount with before tax
    And I click Void button on order management screen
    Then I should see All orders are voided
    And I click Done button on the Popup
    # Verify check with discount as Percentage which has check based and after tax discount
    And I select category as "FOOD"
    And I select menu item as "SANDWICHES"
    And I select Discount on the Order screen
    Then I should see Check Based Discount Screen
    And I click Discount as "CB-PercentageAfterTax"
    And I click Back button on Discount Screen
#    When User select check based percentage discount option which has after tax
    Then User verify check based percentage discount value as "$ 0.10" with after tax after applied open item
    And I click Void button on order management screen
    Then I should see All orders are voided
    And I click Done button on the Popup

#    Scenario: Verify check with discount as Amount which has check based and after tax discount
    And I select category as "FOOD"
    And I select menu item as "SANDWICHES"
    And I select Discount on the Order screen
    Then I should see Check Based Discount Screen
    And I click Discount as "CheckBasedAmountAfterTax"
    And I click Back button on Discount Screen
#    When User select check based amount discount option which has after tax
    Then User verify check based amount discount with after tax value as "$ 0.58"
    And I click Void button on order management screen
    Then I should see All orders are voided
    And I click Done button on the Popup
    #Verify check with discount as set price which has check based and after tax discount
    And I select category as "FOOD"
    And I select menu item as "SANDWICHES"
    And I selected quantity as "3"
    And I select Discount on the Order screen
    Then I should see Check Based Discount Screen
    And I click Discount as "Check Based Set Price"
    And I click Back button on Discount Screen
#    When User select check based set price discount option which has after tax
    Then User verify check based set price discount with after tax value as "$ 1.42"
    And I click Void button on order management screen
    Then I should see All orders are voided
    And I click Done button on the Popup
    #Verify check with discount as Free which has check based and after tax discount
    And I select category as "FOOD"
    And I select menu item as "SANDWICHES"
    And I select Discount on the Order screen
    Then I should see Check Based Discount Screen
    And I click Discount as "Check Based Free"
    And I click Back button on Discount Screen
#    When User select check based as free discount option which has after tax
    Then User verify check based free discount with after tax value as "$ 0.00"
    Then I should see orderscreen with as Onion Rings EACH
    And I click Void button on order management screen
    Then I should see All orders are voided
    And I click Done button on the Popup
    # Verify check with discount as Percentage which has check based and before tax discount
    And I select category as "FOOD"
    And I select menu item as "SANDWICHES"
    And I select Discount on the Order screen
    Then I should see Check Based Discount Screen
    And I click Discount as "CB-PercentageBeforeTax"
    And I click Back button on Discount Screen
#    When User select check based as percentage discount option which has before tax
    Then User verify check based percentage discount with after tax value as "$ 0.10"
    And I click Void button on order management screen
    Then I should see All orders are voided
    And I click Done button on the Popup
    #Verify check with discount as Amount which has check based and before tax discount
    And I select category as "FOOD"
    And I select menu item as "SANDWICHES"
    And I select Discount on the Order screen
    Then I should see Check Based Discount Screen
    And I click Discount as "CB-Amount-BeforeTax"
    And I click Back button on Discount Screen
#    When User select check based amount discount option which has before tax
    Then User verify check based amount discount with before tax value as "$ 0.72"
    And I click Void button on order management screen
    Then I should see All orders are voided
    And I click Done button on the Popup
    #Verify check with discount as set price which has check based and before tax discount
    And I select category as "FOOD"
    And I select menu item as "Chicken Schnitzel"
    And I selected quantity as "3"
    And I select Discount on the Order screen
    Then I should see Check Based Discount Screen
    And I click Discount as "CB-SetPriceBeforeTax"
    And I click Back button on Discount Screen
#    When User select check based set price discount option which has before tax
    Then User verify check based set price discount with before tax value as "$ 31.00"
    And I click Void button on order management screen
    Then I should see All orders are voided
    And I click Done button on the Popup
    #Verify check with discount as Free which has check based and before tax discount
    And I select category as "FOOD"
    And I select menu item as "SANDWICHES"
    And I selected quantity as "3"
    And I select Discount on the Order screen
    Then I should see Check Based Discount Screen
    And I click Discount as "CB-Free-BeforeTax"
    And I click Back button on Discount Screen
#    When User select check based Free discount option which has before tax
    Then User verify check based free discount with before tax value as "$ 0.00"
    Then I should see orderscreen with as Onion Rings EACH
    And I click Void button on order management screen
    Then I should see All orders are voided
    And I click Done button on the Popup
#  #  Given User select QSR mode on menu item page
    And I click log off button in order screen

    Examples:
      |course_name|btnVoid|btnDiscount|btnLogOff|pin1|pin5|pin0|pin0|btnContinue|btnLogOff1|
      |ENTREE     |Void   |Discount   |logOff   |1   |5   |0   |0   |Continue   |Log Off   |

#todo done

#  Scenario Outline: Verify check with open check discount as amounted safety limit in decimal precision which has after tax
#    And I select category as "FOOD"
#    And I select menu item as "Chicken Schnitzel"
#    When User click Option Tab
#    And I click "<btnDiscount>" in the lower option screen"Gift Card button clicked"
#    Then User select open check discount option
#    When User select charge type as amount
#    And User enter open discount amount as decimal
#    And User enter open discount reason
#    And User select after tax for open discount type
#    And User click apply button for open discount
#    And User verify open discount with after tax for Margarita
#    When User click Cash Tab
#    Then User click exact option
#    And User click enter button
#    Then User click cancel button
#    #Verify check with open check discount as amount safety limit in whole which has after tax
#    And I select category as "FOOD"
#    And I select menu item as "Chicken Schnitzel"
#    When User click Option Tab
#    And I click "<btnDiscount>" in the lower option screen"Gift Card button clicked"
#    Then User select open check discount option
#    When User select charge type as amount
#    And User enter open discount amount as whole number
#    And User enter open discount reason
#    And User select after tax for open discount type
#    And User click apply button for open discount
#    And User verify open discount with after tax
#    When User click Cash Tab
#    Then User click exact option
#    And User click enter button
#    Then User click cancel button
#
##    Scenario: Verify check with open check discount as percentage which has after tax
#    And I select category as "FOOD"
#    And I select menu item as "Chicken Schnitzel"
#    When User click Option Tab
#    And I click "<btnDiscount>" in the lower option screen"Gift Card button clicked"
#    Then User select open check discount option
#    When User select charge type as percentage
#    And User enter open discount percentage value
#    And User enter open discount reason
#    And User select after tax for open discount type
#    And User click apply button for open discount
#    And User verify open discount as percentage value as "$ 2.40" with after tax for Margarita
#    When User click Cash Tab
#    Then User click exact option
#    And User click enter button
#    Then User click cancel button
#
##     Verify check with open check discount as amount and safety limit in decimal precious  which has before tax
#    And I select category as "FOOD"
#    And I select menu item as "Chicken Schnitzel"
#    When User click Option Tab
#    And I click "<btnDiscount>" in the lower option screen"Gift Card button clicked"
#    Then User select open check discount option
#    When User select charge type as amount
#    And User enter open discount amount as decimal
#    And User enter open discount reason
#    And User select before tax for open discount type
#    And User click apply button for open discount
#    And User verify open discount as amount value as "$ 5.08" with before tax for Margarita
#    When User click Cash Tab
#    Then User click exact option
#    And User click enter button
#    Then User click cancel button
#    # Verify check with open check discount as amount and safety limit in whole value which has before tax
#    And I select category as "FOOD"
#    And I select menu item as "Chicken Schnitzel"
#    When User click Option Tab
#    And I click "<btnDiscount>" in the lower option screen"Gift Card button clicked"
#    Then User select open check discount option
#    When User select charge type as amount
#    And User enter open discount amount as whole number
#    And User enter open discount reason
#    And User select before tax for open discount type
#    And User click apply button for open discount
#    And User verify open discount as amount with before tax value as "$ 5.00"
#    When User click Cash Tab
#    Then User click exact option
#    And User click enter button
#    Then User click cancel button
#
##    Verify check with open check discount as percentage which has before tax
#    And I select category as "FOOD"
#    And I select menu item as "Chicken Schnitzel"
#    When User click Option Tab
#    And I click "<btnDiscount>" in the lower option screen"Gift Card button clicked"
#    Then User select open check discount option
#    When User select charge type as percentage
#    And User enter open discount percentage value
#    And User enter open discount reason
#    And User select before tax for open discount type
#    And User click apply button for open discount
#    And User verify open discount as percentage with before tax value as "$ 2.40"
#    When User click Cash Tab
#    Then User click exact option
#    And User click enter button
#    Then User click cancel button
#    And I click log off button in order screen
#
#    Examples:
#      |btnCancel|btnDiscount|pin1|pin0|pin5|btnLogOff|
#      |Cancel   |Discount   |1   |0   |5   |logOff   |

#todo done
#  @SmokeTest
  @RegressionQSR3
  Scenario Outline: Verify check with fix gratuity on Bar Tab
    Given User click setting icon
    And User verify setting options
    When User select POS Settings tab
    Then User open ask customer name option if disable in void screen
    And I click the Toggle Icon button
    And I click POS Icon from Toggle
    And I closed the order type window
    When User click QSR on Menu Item page
    Then User select Bar Tab in order types
    When User enter customer name for bar tab
    And I click the Exit to close the preauth window
    And I select category as "FOOD"
    And I select menu item as "SANDWICHES"
    When User click Option Tab
    Then User select gratuity option
    When User select fixed gratuity option
    Then User verify fixed gratuity as "$ 0.10"
    When User click Cash Tab
    Then User click exact option
    And User click enter button
   And I click QSR tab
   And I closed the order type window
    # Verify check with vary gratuity on Bar Tab
    When User click QSR on Menu Item page
    Then User select Bar Tab in order types
    When User enter customer name for bar tab
    And I click the Exit to close the preauth window
    And I select category as "FOOD"
    And I select menu item as "SANDWICHES"
    When User click Option Tab
    Then User select gratuity option
    When User select varying gratuity option
#    When User select varying gratuity option
    And User enter percentage of varying gratuity
    And I enter the percentage1 as "1500"
#    And I click Done button on the open item window
    And User click apply button for varying gratuity
#    And User verify varying gratuity as "$ 0.15"
    And User verify varying gratuity as "$ 0.15"
    When User click Cash Tab
    Then User click exact option
    And User click enter button
   And I click QSR tab
   And I closed the order type window
    # Verify check with Exclusive Tax on Bar Tab  -- hot wings
    When User click QSR on Menu Item page
    Then User select Bar Tab in order types
    When User enter customer name for bar tab
    And I click the Exit to close the preauth window

    And I select category as "FOOD"
#    When User select menu item has exclusive tax
    And I select menu item as "Hot Wings"
#    And I select modifier as "EACH"
    And I select modifier as "Anchovy"
    And I click Done to get back
    Then User verify exclusive tax value as "$ 0.08" for Hot Wings
    When User click Cash Tab
    Then User click exact option
    And User click enter button
   And I click QSR tab
   And I closed the order type window
    And I click log off button in order screen

    Examples:
      |btnQsr|btnCancel|btnPos |btnExit|pin1|pin5|pin0|pinPoint|btnApply |btnContinue|btnLogOff|
      |QSR   |Cancel   |POS    |Exit   | 1  |5   |0   |.       |Apply    |Continue   |logOff   |

  @RegressionQSR3
  Scenario Outline: Verify check with tax exempt and with customer
    Given User click setting icon
    And User verify setting options
    When User select POS Settings tab
    Then User open ask customer name option if disable in void screen
    And I click the Toggle Icon button
    And I click POS Icon from Toggle
    And I closed the order type window
    When User click QSR on Menu Item page
    Then User select Bar Tab in order types
    When User enter customer name for bar tab
    And I click the Exit to close the preauth window
    And I select category as "FOOD"
    And I select menu item as "SANDWICHES"
    Then User verify tax amount value as "$ 0.00" of sandwich
    When User click Option Tab
    Then User click Tax Exempt on Check Options
#    And User select first tax exempt type
    When User click Cash Tab
    Then User click exact option
    And User click enter button
   And I click QSR tab
   And I closed the order type window
    #Verify check with tax exempt and without customer
#    When User click QSR on Menu Item page
    And I select category as "FOOD"
    And I select menu item as "SANDWICHES"
    When User click Option Tab
    Then User click Tax Exempt on Check Options
#    And User select first tax exempt type
    When User click Cash Tab
    Then User click exact option
    And User click enter button
   And I closed the order type window
    #Verify check with tax exempt and without customer through payment screen
    When User click QSR on Menu Item page
    Then User select Bar Tab in order types
    When User enter customer name for bar tab
    And I click the Exit to close the preauth window
    And I select category as "FOOD"
    And I select menu item as "SANDWICHES"
    When User click Option Tab
    Then User click Tax Exempt on Check Options
#    And User select first tax exempt type
    When User click payment button
    And User select payment method with cash
    And User verify paid cash on payment page
    And User click submit button
   And I click QSR tab
   And I closed the order type window
    And I click log off button in order screen

    Examples:
      |btnQsr|btnCancel|btnPos|btnExit|btnLogOff|
      |QSR   |Cancel   |POS   |Exit   |logOff   |

  @RegressionQSR3
  Scenario Outline: Verify check with vary gratuity through Payment screen
    And I select category as "FOOD"
    And I select menu item as "SANDWICHES"
    When User click Option Tab
    Then User select gratuity option
    When User select varying gratuity option
    And User enter percentage of varying gratuity
    And I enter the percentage1 as "1500"
#    And I click Done button on the open item window
    And User click apply button for varying gratuity
    And User verify varying gratuity as "$ 0.15"
    When User click payment button
    Then User click exact option
    And User select payment method with cash
    And User verify paid cash on payment page
    And User click submit button
   And I closed the order type window
    # Verify check with upcharge
    When User click QSR on Menu Item page
    Then User select DineIn mode
    And User select first table
    And I select category as "FOOD"
    And I select menu item as "SANDWICHES"
    When User click payment button
    Then User click gift card payment method
    Then User click no tip button
    When User click Continue button
    And I click manual button on the your order screen
    And I enter the Gift card number as "<giftCardNumber>"
    And I click Process button on card screen
#    And I click "<btnOk>" in the receipt printer popup"Click ok button in the popup"
   And I click QSR tab
   And I closed the order type window
    And I click log off button in order screen

    Examples:
      |giftCardNumber| btnProcess| btnOk|btnQsr|btnCancel|pin1|pin5|pin0|pinPoint|btnContinue|btnApply|btnManual|Back|btnLogOff|
      |12345      |Process    |OK    |QSR   |Cancel   |1   |5   |0   |.       |Continue   |Apply   |Manual   |Hide keyboard|logOff|

  @RegressionQSR3
  Scenario Outline: Verify Check Payment through CC Side with Item Based Discount - After Tax as percentage and with tip
    And I select category as "FOOD"
    And I select menu item as "Chicken Schnitzel"
    When User click Option Tab
    And I click discount on check option screen
    Then I should see Check Based Discount Screen
    And I click Discount as "IB-AfterTax-Percentage"
    And I click Back button on Discount Screen
#    Then User select item based discount after tax with percentage
    And User verify item based discount after tax with percentage value as "$ 1.20"
    When User click payment button
    Then User click exact option
    When User click CC Side payment method
    And User select tip amount which is entered
    When User click Continue button
    Then User verify item based discount after tax value as "10.80+10.00" with percentage with CC Side payment in payment screen and with tips
    When User click submit button
   And I closed the order type window

#    Verify Check Payment through CC Side with Item Based Discount - Before Tax as percentage and with tip
    And I select category as "PIZZA"
    And I select menu item as "**Margarita**"
    When User click Option Tab
    And I click discount on check option screen
    Then I should see Check Based Discount Screen
    And I click Discount as "IB-BeforeTax-Percentage"
    And I click Back button on Discount Screen
#    Then User select item based discount before tax with percentage
    And User verify item based discount before tax with percentage value as "$ 0.10" for Margarita
    When User click payment button
    Then User click exact option
    When User click CC Side payment method
    And User select tip amount which is entered
    When User click Continue button
    Then User verify item based discount before tax value as "0.99+10.00" with percentage with CC Side payment in payment screen and with tips for Margarita
    When User click submit button
    And I closed the order type window
#    Verify Check Payment through CC Side with Item Based Discount - Before Tax as amount and with tip (((item based amount discount not displayed)))
    And I select category as "PIZZA"
    And User select PizzaRomano menu item of pizza category
    When User click Option Tab
    And I click discount on check option screen
    Then I should see Check Based Discount Screen
    And I click Discount as "IB-BeforeTax-Amount"
    And I click Back button on Discount Screen
#    Then User select item based discount before tax with amount
    When User click payment button
    Then User click exact option
  Then USer click cash button in void screen
    And User click submit button
   And I closed the order type window

    # Verify Check Payment through CC Side with Item Based Discount - After Tax as amount and with tip
    And I select category as "PIZZA"
    And User select PizzaRomano menu item of pizza category
    When User click Option Tab
    And I click discount on check option screen
    Then I should see Check Based Discount Screen
    And I click Discount as "IB-DiscountAfterTax"
    And I click Back button on Discount Screen
#    Then User select item based discount after tax with amount
    And User verify item based discount after tax with amount value as "$ 1.00"
    When User click payment button
    Then User click exact option
    When User click CC Side payment method
    And User select tip amount which is entered
    When User click Continue button
    Then User verify item based discount after tax value as "18.89+10.00" with amount with CC Side payment in payment screen and with tips for Chicken Schnitzel
    When User click submit button
   And I closed the order type window
    #Verify Check Payment through CC Side  with item based discount - After Tax  as set price and with tip
    And I select category as "PIZZA"
    And User select PizzaRomano menu item of pizza category
    When User click Option Tab
    And I click discount on check option screen
    Then I should see Check Based Discount Screen
    And I click Discount as "IB-AfterTax-SetPrice"
    And I click Back button on Discount Screen
#    Then User select item based discount after tax as set price
#    And User verify item based discount after tax as set price
    When User click payment button
    Then User click exact option
    When User click CC Side payment method
    And User select tip amount which is entered
    When User click Continue button
    Then User verify CC Side payment with tips value as "3.66+10.00" and item based discount After tax as set price for Chicken Schnitzel
    When User click submit button
   And I closed the order type window

#    Scenario: Verify Check Payment through CC Side  with item based discount - Before Tax  as set price and with tip
    And I select category as "FOOD"
    And I select menu item as "Chicken Schnitzel"
    When User click Option Tab
    And I click discount on check option screen
    Then I should see Check Based Discount Screen
    And I click Discount as "IB-BeforeTax-SetPrice"
    And I click Back button on Discount Screen
#    Then User select item based discount before tax as set price
    And User verify item based discount before tax as set price value as "$ 11.53" for chicken schnitzel
    When User click payment button
    Then User click exact option
    When User click CC Side payment method
    And User select tip amount which is entered
    When User click Continue button
    Then User verify CC Side payment with tips value as "0.47+10.00" and item based discount Before tax as set price for Chicken Schnitzel
    When User click submit button
   And I closed the order type window

#  Scenario: Verify Check Payment through CC Side  with Item Based Discount After Tax as Free Item and with tip
    And I select category as "FOOD"
    And I select menu item as "Chicken Schnitzel"
    When User click Option Tab
    And I click discount on check option screen
    Then I should see Check Based Discount Screen
    And I click Discount as "IB-AfterTax-FreeItem"
    And I click Back button on Discount Screen
#    Then User select item based discount after tax as Free item
    When User click payment button
    Then User click exact option
    When User click CC Side payment method
    And User select tip amount which is entered
    When User click Continue button
    Then User verify CC Side payment with tips value as "24.00+10.00" and item based discount After tax as free item for Chicken Schnitzel
    When User click submit button
   And I closed the order type window
    #Verify Check Payment through CC Side  with Item Based Discount Before Tax as Free Item and with tip
    And I select category as "FOOD"
    And I select menu item as "Chicken Schnitzel"
    When User click Option Tab
    And I click discount on check option screen
    Then I should see Check Based Discount Screen
    And I click Discount as "IB-BeforeTax-FreeItem"
    And I click Back button on Discount Screen
#    Then User select item based discount before tax as Free item
    When User click payment button
    Then User click exact option
    When User click CC Side payment method
    And User select tip amount which is entered
    When User click Continue button
    Then User verify CC Side payment with tips value as "24.00+10.00" and item based discount Before tax as free item for Chicken Schnitzel
    When User click submit button
   And I closed the order type window
    And I click log off button in order screen

    Examples:
      |btnCancel|btnDiscount|btnCash|btnLogOff|
      |Cancel   |Discount   |Cash   |logOff   |

  @RegressionQSR3
  Scenario Outline: Verify check with tax exempt for pre defined customer
    And I select category as "FOOD"
    And I select menu item as "SANDWICHES"
    And User verify tax amount value as "$ 0.00" of sandwich
    When User click Option Tab
    Then User click Tax Exempt on Check Options
#    And User select first tax exempt type
    When User click Cash Tab
    Then User click exact option
    And User click enter button
    Then I closed the order type window
    And I click log off button in order screen
    Examples:
      |btnLogOff|
      |logOff   |

  @RegressionQSR3
  Scenario Outline: Verify Check Payment through CC Side  with Check Based Discount - After Tax as percentage and with tip# Given User click setting icon
    And I select category as "FOOD"
    And I select menu item as "SANDWICHES"
    When User click Option Tab
    And I click discount on check option screen
    Then I should see Check Based Discount Screen
    And I click Discount as "CB-PercentageAfterTax"
    And I click Back button on Discount Screen
#    Then User select check based discount after tax as percentage
    And User verify check based discount after tax as percentage value as "$ 0.10" with Sandwiches
    When User click payment button
    Then User click exact option
    When User click CC Side payment method
    And User select tip amount which is entered
    When User click Continue button
    Then User verify CC Side payment with tips value as "0.90+10.00" and check based discount after tax as percentage
    When User click submit button
   And I closed the order type window
    # Verify Check Payment through CC Side  with Check Based Discount - Before Tax as percentage and with tip
    And I select category as "FOOD"
    And I select menu item as "SANDWICHES"
    When User click Option Tab
    And I click discount on check option screen
    Then I should see Check Based Discount Screen
    And I click Discount as "CB-PercentageBeforeTax"
    And I click Back button on Discount Screen
#    Then User select check based discount before tax as percentage
    And User verify check based discount before tax as percentage value as "$ 0.10" with Sandwiches
    When User click payment button
    Then User click exact option
    When User click CC Side payment method
    And User select tip amount which is entered
    When User click Continue button
    Then User verify CC Side payment with tips value as "0.90+10.00" and check based discount before tax as percentage
    When User click submit button
   And I closed the order type window
    #Verify Check Payment through CC Side  with Check Based Discount - After Tax  as amount and with tip
    And I select category as "FOOD"
    And I select menu item as "SANDWICHES"
    When User click Option Tab
    And I click discount on check option screen
    Then I should see Check Based Discount Screen
    And I click Discount as "CheckBasedAmountAfterTax"
    And I click Back button on Discount Screen
#    Then User select check based discount after tax as amount
    And User verify check based discount after tax as amount value as "$ 0.58" with Sandwiches
    When User click payment button
    Then User click exact option
    When User click CC Side payment method
    And User select tip amount which is entered
    When User click Continue button
    Then User verify CC Side payment with tips value as "0.42+10.00" and check based discount after tax as amount
    When User click submit button
   And I closed the order type window
    # Verify Check Payment through CC Side  with Check Based Discount - Before Tax  as amount and with tip
    And I select category as "FOOD"
    And I select menu item as "SANDWICHES"
    When User click Option Tab
    And I click discount on check option screen
    Then I should see Check Based Discount Screen
    And I click Discount as "CB-AmountBeforeTax"
    And I click Back button on Discount Screen
#    Then User select check based discount before tax as amount
    And User verify check based discount before tax as amount value as "$ 0.67" with Sandwiches
    When User click payment button
    Then User click exact option
    When User click CC Side payment method
    And User select tip amount which is entered
    When User click Continue button
    Then User verify CC Side payment with tips value as "0.33+10.00" and check based discount before tax as amount
    When User click submit button
   And I closed the order type window
    #Verify Check Payment through CC Side  with Check Based Discount- After Tax as set price and with tip
    And I select category as "FOOD"
    And I select menu item as "SANDWICHES"
    When User click Option Tab
    And I click discount on check option screen
    Then I should see Check Based Discount Screen
    And I click Discount as "CB-AfterTax-SetPrice"
    And I click Back button on Discount Screen
#    Then User select check based discount after tax as set price
    And User verify check based discount after tax as set price value as "$ 0.61" with Sandwiches
    When User click payment button
    Then User click exact option
    When User click CC Side payment method
    And User select tip amount which is entered
    When User click Continue button
    Then User verify CC Side payment with tips value as "0.39+10.00" and check based discount after tax as set price
    When User click submit button
   And I closed the order type window
    # Verify Check Payment through CC Side  with Check Based Discount- Before Tax as set price and with tip
    And I select category as "FOOD"
    And I select menu item as "SANDWICHES"
    When User click Option Tab
    And I click discount on check option screen
    Then I should see Check Based Discount Screen
    And I click Discount as "CB-BeforeTax-SetPrice"
    And I click Back button on Discount Screen
#    Then User select check based discount before tax as set price
    And User verify check based discount before tax as set price value as "$ 0.17" with Sandwiches
    When User click payment button
    Then User click exact option
    When User click CC Side payment method
    And User select tip amount which is entered
    When User click Continue button
    Then User verify CC Side payment with tips value as "0.83+10.00" and check based discount before tax as set price
    When User click submit button
   And I closed the order type window

    #Verify Check Payment through CC Side  with Check Based Discount - After Tax as Free item and with tip
    And I select category as "FOOD"
    And I select menu item as "SANDWICHES"
    When User click Option Tab
    And I click discount on check option screen
    Then I should see Check Based Discount Screen
    And I click Discount as "CB-AfterTax-FreeItem"
    And I click Back button on Discount Screen
#    Then User select check based discount after tax as free item
    And User verify check based discount after tax as free item value as "$ 0.00" with Sandwiches
    When User click payment button
    Then User click exact option
    When User click CC Side payment method
    And User select tip amount which is entered
    When User click Continue button
    Then User verify CC Side payment with tips and check based discount after tax as free item1
    When User click submit button
   And I closed the order type window
    #Verify Check Payment through CC Side  with Check Based Discount - Before Tax as Free item and with tip
    And I select category as "FOOD"
    And I select menu item as "SANDWICHES"
    When User click Option Tab
    And I click discount on check option screen
    Then I should see Check Based Discount Screen
    And I click Discount as "CB-BeforeTax-FreeItem"
    And I click Back button on Discount Screen
#    Then User select check based discount before tax as free item
    And User verify check based discount before tax as free item value as "$ 0.00" with Sandwiches
    When User click payment button
    Then User click exact option
    When User click CC Side payment method
    And User select tip amount which is entered
    When User click Continue button
    Then User verify CC Side payment with tips and check based discount before tax as free item1
    When User click submit button
   And I closed the order type window
    And I click log off button in order screen

    Examples:
      |btnCancel|btnDiscount  |btnLogOff|
      |Cancel   | Discount    |logOff   |

  @RegressionQSR3
  Scenario Outline: Verify Check Payment through CC Side with Open item Discount- After Tax as percentage and with tip
    And I select category as "FOOD"
    And I select menu item as "SANDWICHES"
    When User click Option Tab
    When User select Open Item option
    And I click Coursing Name text field for Menu option
    And I swipe to "<course_name>" as Coursing Name
    And I pass course name as "onion"
    And I tap Price text field for menu option
    And I enter the percentage1 as "0108"
    And I click Done button on the open item window
    Then I should navigate to Order Management screen and see the added open item as "onion"
    When User click payment button
    Then User click exact option
    When User click CC Side payment method
    And User select tip amount which is entered
    When User click Continue button
    When User verify CC Side payment with tips value as "2.19+10.00" and open item discount after tax as percentage
#    And I wait for the "10000" "For Loading"
    When I click submit button
   And I closed the order type window
    And I click log off button in order screen
    Examples:
      |course_name|btnCancel|pin1|pin0|btnContinue|btnLogOff|
      |  ENTREE   |Cancel   |    1|0  |Continue   |logOff   |

#  @RegressionQSR3
#  Scenario Outline:Verify Check Payment through CC Side with Open Check Discount- After Tax as percentage and with tip
#    And I select category as "FOOD"
#    And I select menu item as "SANDWICHES"
#    When User click Option Tab
#    And I click "<btnDiscount>" in the lower option screen"Gift Card button clicked"
#    Then User select open check discount option
#    When User select charge type as percentage
#    And User enter open discount percentage value
#    And User enter open discount reason
#    And User select after tax for open discount type
#    And User click apply button for open discount
#    When User click payment button
#    Then User click exact option
#    When User click CC Side payment method
#    And User select tip amount which is entered
#    When User click Continue button
#    Then User verify CC Side payment with tips value as "0.90+10.00" and open check discount after tax as open discount
#    When User click submit button
#   And I closed the order type window
#
##  Scenario: Verify Check Payment through CC Side with Open Check Discount- Before Tax as percentage and with tip
#    And I select category as "FOOD"
#    And I select menu item as "SANDWICHES"
#    When User click Option Tab
#    And I click "<btnDiscount>" in the lower option screen"Gift Card button clicked"
#    Then User select open check discount option
#    When User select charge type as percentage
#    And User enter open discount percentage value
#    And User enter open discount reason
#    And User select before tax for open discount type
#    And User click apply button for open discount
#    When User click payment button
#    Then User click exact option
#    When User click CC Side payment method
#    And User select tip amount which is entered
#    When User click Continue button
#    Then User verify CC Side payment with tips value as "0.88+10.00" and open check discount before tax as open discount
#    When User click submit button
#   And I closed the order type window
#
##    Scenario: Verify Check Payment through CC Side  with Open Check Discount- After Tax as amount & safety limit as decimal value and with tip
#    And I select category as "FOOD"
#    And I select menu item as "Chicken Schnitzel"
#    When User click Option Tab
#    And I click "<btnDiscount>" in the lower option screen"Gift Card button clicked"
#    Then User select open check discount option
#    When User select charge type as amount
#    And User enter open discount amount as decimal
#    And User enter open discount reason
#    And User select after tax for open discount type
#    And User click apply button for open discount
#    When User click payment button
#    Then User click exact option
#    When User click CC Side payment method
#    And User select tip amount which is entered
#    When User click Continue button
#    Then User verify CC Side payment with tips value as "8.12+10.00" and open check discount after tax as open discount with amount and decimal value
#    When User click submit button
#   And I closed the order type window
#    #Verify Check Payment through CC Side  with Open Check Discount- Before Tax as amount & safety limit as decimal value and with tip
#    And I select category as "FOOD"
#    And I select menu item as "Chicken Schnitzel"
#    When User click Option Tab
#    And I click "<btnDiscount>" in the lower option screen"Gift Card button clicked"
#    Then User select open check discount option
#    When User select charge type as amount
#    And User enter open discount amount as decimal
#    And User enter open discount reason
#    And User select before tax for open discount type
#    And User click apply button for open discount
#    When User click payment button
#    Then User click exact option
#    When User click CC Side payment method
#    And User select tip amount which is entered
#    When User click Continue button
#    Then User verify CC Side payment with tips value as "7.61+10.00" and open check discount before tax as open discount with amount and decimal value
#    When User click submit button
#   And I closed the order type window
#
##  Scenario: Verify Check Payment through CC Side with Open Check Discount- After Tax as amount & safety limit as non-decimal value and with tip
#    And I select category as "FOOD"
#    And I select menu item as "Chicken Schnitzel"
##  And I select menu item as "Chicken Schnitzel"
#    When User click Option Tab
#    And I click "<btnDiscount>" in the lower option screen"Gift Card button clicked"
#    Then User select open check discount option
#    When User select charge type as amount
#    And User enter open check discount amount as non-decimal value
#    And I enter the percentage as "0","5","0","0"
#    And I click "<btnContinue>" in the percentage apply screen "Click Continue"
#    And User enter open discount reason
#    And User select after tax for open discount type
#    And User click apply button for open discount
#    When User click payment button
#    Then User click exact option
#    When User click CC Side payment method
#    And User select tip amount which is entered
#    When User click Continue button
#    Then User verify CC Side payment with tips value as "8.20+10.00" and open check discount after tax as open discount with amount and non-decimal value
#    When User click submit button
#   And I closed the order type window
#    # Verify Check Payment through CC Side with Open Check Discount- Before  Tax as amount & safety limit as non-decimal value and with tip
#    And I select category as "FOOD"
#    And I select menu item as "Chicken Schnitzel"
#    When User click Option Tab
#    And I click "<btnDiscount>" in the lower option screen"Gift Card button clicked"
#    Then User select open check discount option
#    When User select charge type as amount
#    And User enter open check discount amount as non-decimal value
#    And I enter the percentage as "0","5","0","0"
#    And I click "<btnContinue>" in the percentage apply screen "Click Continue"
#    And User enter open discount reason
#    And User select before tax for open discount type
#    And User click apply button for open discount
#    When User click payment button
#    Then User click exact option
#    When User click CC Side payment method
#    And User select tip amount which is entered
#    When User click Continue button
#    Then User verify CC Side payment with tips value as "7.70+10.00" and open check discount before tax as open discount with amount and non-decimal value
#    When User click submit button
#   And I closed the order type window
#    And I click log off button in order screen
#
#    Examples:
#      |btnCancel|btnDiscount|pin1|pin0|btnContinue|btnLogOff|
#      |Cancel   |Discount   |1   |0   |Continue   |logOff   |

  @RegressionQSR3
  Scenario Outline: Check through CC Side Payment with Tax Exempt After that Apply  Discount Check based - After Tax as Percentage and with Tip
    And I select category as "FOOD"
    And I select menu item as "SANDWICHES"
    Then User click Option Tab
#    And I click tip as 10
    Then User click Tax Exempt on Check Options
##    Then User select first tax exempt type
#    Then User verify tax exempt for Sandwiches
    When User click Option Tab
    And I click discount on check option screen
#    And I select Discount on the Order screen
    Then I should see Check Based Discount Screen
    And I click Discount as "CB-PercentageAfterTax"
    And I click Back button on Discount Screen
#    Then User select check based discount after tax as percentage
    When User click payment button
    Then User click exact option
    Then User click CC Side payment method
    Then User select any amount of tips
    And User click Continue button
    And User verify CC Side payment with tips value as "0.90+10.00" and item based discount after tax as percentage with tax exempt for Sandwiches
    When User click submit button
   And I closed the order type window
    # Check through CC Side Payment with Tax Exempt After that Apply  Discount Check based - Before Tax as Percentage and with Tip
    And I select category as "FOOD"
    And I select menu item as "SANDWICHES"
    Then User click Option Tab
    Then User click Tax Exempt on Check Options
#    Then User select first tax exempt type
#    Then User verify tax exempt for Sandwiches
    When User click Option Tab
    And I click discount on check option screen
#    And I select Discount on the Order screen
    Then I should see Check Based Discount Screen
    And I click Discount as "CB-PercentageBeforeTax"
    And I click Back button on Discount Screen
#    Then User select check based discount before tax as percentage
    When User click payment button
    Then User click exact option
    Then User click CC Side payment method
    Then User select any amount of tips
    And User click Continue button
    And User verify CC Side payment with tips value as "0.90+10.00" and item based discount before tax as percentage with tax exempt for Sandwiches
    When User click submit button
   And I closed the order type window

#     Check through CC Side Payment with Tax Exempt After that Apply  Discount Check based - After Tax as amount and with Tip
    And I select category as "FOOD"
    And I select menu item as "SANDWICHES"
    Then User click Option Tab
    Then User click Tax Exempt on Check Options
#    Then User select first tax exempt type
#    Then User verify tax exempt for Sandwiches
    When User click Option Tab
    And I click discount on check option screen
#    And I select Discount on the Order screen
    Then I should see Check Based Discount Screen
    And I click Discount as "CheckBasedAmountAfterTax"
    And I click Back button on Discount Screen
#    Then User select check based discount after tax as amount
    When User click payment button
    Then User click exact option
    Then User click CC Side payment method
    Then User select any amount of tips
    And User click Continue button
    And User verify CC Side payment with tips value as "0.42+10.00" and item based discount after tax as amount with tax exempt for Sandwiches
    When User click submit button
   And I closed the order type window

#     Check through CC Side Payment with Tax Exempt After that Apply  Discount Check based - Before Tax as amount and with Tip
    And I select category as "FOOD"
    And I select menu item as "SANDWICHES"
    Then User click Option Tab
    Then User click Tax Exempt on Check Options
#    Then User select first tax exempt type
#    Then User verify tax exempt for Sandwiches
    When User click Option Tab
    And I click discount on check option screen
#    And I select Discount on the Order screen
    Then I should see Check Based Discount Screen
    And I click Discount as "CB-AmountBeforeTax"
    And I click Back button on Discount Screen
#    Then User select check based discount before tax as amount
    When User click payment button
    Then User click exact option
    Then User click CC Side payment method
    Then User select any amount of tips
    And User click Continue button
    And User verify CC Side payment with tips value as "0.33+10.00" and item based discount before tax as amount with tax exempt for Sandwiches
    When User click submit button
   And I closed the order type window

#  Check through CC Side Payment with Tax Exempt After that Apply  Discount Check based - After Tax as set price and with tip
    And I select category as "FOOD"
    And I select menu item as "SANDWICHES"
    Then User click Option Tab
    Then User click Tax Exempt on Check Options
#    Then User select first tax exempt type
#    Then User verify tax exempt for Sandwiches
    When User click Option Tab
    And I click discount on check option screen
#    And I select Discount on the Order screen
    Then I should see Check Based Discount Screen
    And I click Discount as "CB-AfterTax-SetPrice"
    And I click Back button on Discount Screen
#    Then User select check based discount after tax as set price
    When User click payment button
    Then User click exact option
    Then User click CC Side payment method
    Then User select any amount of tips
    And User click Continue button
    And User verify CC Side payment with tips value as "0.39+10.00" and item based discount after tax as set price with tax exempt for Sandwiches
    When User click submit button
   And I closed the order type window
#Check through CC Side Payment with Tax Exempt After that Apply  Discount Check based - Before Tax as set price and with tip
    And I select category as "FOOD"
    And I select menu item as "SANDWICHES"
    Then User click Option Tab
    Then User click Tax Exempt on Check Options
#    Then User select first tax exempt type
#    Then User verify tax exempt for Sandwiches
    When User click Option Tab
    And I click discount on check option screen
#    And I select Discount on the Order screen
    Then I should see Check Based Discount Screen
    And I click Discount as "CB-BeforeTax-SetPrice"
    And I click Back button on Discount Screen
#    Then User select check based discount before tax as set price
    When User click payment button
    Then User click exact option
    Then User click CC Side payment method
    Then User select any amount of tips
    And User click Continue button
    And User verify CC Side payment with tips value as "0.83+10.00" and item based discount before tax as set price with tax exempt for Sandwiches
    When User click submit button
   And I closed the order type window
    And I click log off button in order screen

    Examples:
      |btnCancel|btnDiscount|btnLogOff|
      |Cancel   |Discount   |logOff   |

  @RegressionQSR3
  Scenario Outline: Discount - Item Based After Tax on BarTab and Pay with Fast Cash as Percentage
    Given User click setting icon
    And User verify setting options
    When User select POS Settings tab
    Then User open ask customer name option if disable in void screen
    And I click the Toggle Icon button
    And I click POS Icon from Toggle
    And I closed the order type window
    When User click QSR on Menu Item page
    Then User select Bar Tab in order types
    When User enter customer name for bar tab
    And I click the Exit to close the preauth window
    And I select category as "Appetizers"
    When I select menu item as "BRUSHETTA"
    When User click Option Tab
    And I click discount on check option screen
#    And I select Discount on the Order screen
    Then I should see Check Based Discount Screen
    And I click Discount as "IB-AfterTax-Percentage"
    And I click Back button on Discount Screen
#    Then User select item based discount after tax as percentage
    And User verify item based discount after tax as percentage value as "$ 0.10" for Brushetta
    When User click Cash Tab
    Then User click exact option
    And User click enter button
   And I click QSR tab
   And I closed the order type window

#  Discount - Item Based Before Tax on BarTab and Pay with Fast Cash as Percentage
    When User click QSR on Menu Item page
    Then User select Bar Tab in order types
    When User enter customer name for bar tab
    And I click the Exit to close the preauth window
    And I select category as "Appetizers"
    When I select menu item as "BRUSHETTA"
    When User click Option Tab
    And I click discount on check option screen
#    And I select Discount on the Order screen
    Then I should see Check Based Discount Screen
    And I click Discount as "IB-BeforeTax-Percentage"
    And I click Back button on Discount Screen
#    Then User select item based discount before tax tax as percentage
    And User verify item based discount before tax as percentage value as "$ 0.10" for Brushetta
    When User click Cash Tab
    Then User click exact option
    And User click enter button
   And I click QSR tab
   And I closed the order type window

# Scenario: Discount - Item Based After Tax on BarTab and pay with Fast Cash as Amount
    When User click QSR on Menu Item page
    Then User select Bar Tab in order types
    When User enter customer name for bar tab
    And I click the Exit to close the preauth window
    And I select category as "Appetizers"
    And I select menu item as "PRETZEL"
    When User click Option Tab
    And I click discount on check option screen
#    And I select Discount on the Order screen
    Then I should see Check Based Discount Screen
    And I click Discount as "IB-AfterTax-Amount"
    And I click Back button on Discount Screen
#    Then User select item based discount after tax tax as amount
    And User verify item based discount after tax as amount value as "$ 1.00" for Brushetta1
    When User click Cash Tab
    Then User click exact option
    And User click enter button
   And I click QSR tab
   And I closed the order type window
    #Discount - Item Based Before Tax on BarTab and pay with Fast Cash as Amount
    When User click QSR on Menu Item page
    Then User select Bar Tab in order types
    When User enter customer name for bar tab
    And I click the Exit to close the preauth window
    And I select category as "Appetizers"
    And I select menu item as "PRETZEL"
    When User click Option Tab
    And I click discount on check option screen
#    And I select Discount on the Order screen
    Then I should see Check Based Discount Screen
    And I click Discount as "IB-BeforeTax-Amount"
    And I click Back button on Discount Screen
#    Then User select item based discount before tax as amount
    And User verify item based discount before tax as amount value as "$ 1.00" for Brushetta1
    When User click Cash Tab
    Then User click exact option
    And User click enter button
   And I click QSR tab
   And I closed the order type window
    # Discount - Item Based on BarTab and Pay with Fast Cash as Set Price
    When User click QSR on Menu Item page
    Then User select Bar Tab in order types
    When User enter customer name for bar tab
    And I click the Exit to close the preauth window
    And I select category as "Appetizers"
    When I select menu item as "BRUSHETTA"
    When User click Option Tab
    And I click discount on check option screen
#    And I select Discount on the Order screen
    Then I should see Check Based Discount Screen
    And I click Discount as "IB-BeforeTax-SetPrice"
    And I click Back button on Discount Screen
#    Then User select item based discount before tax as set price
    And User verify item based discount before tax as set price value as "$ 0.53" for menu item1
    When User click Cash Tab
    Then User click exact option
    And User click enter button
   And I click QSR tab
   And I closed the order type window

#    Scenario: Discount - Item Based on BarTab and Pay with Fast Cash as Free
    When User click QSR on Menu Item page
    Then User select Bar Tab in order types
    When User enter customer name for bar tab
    And I click the Exit to close the preauth window
    And I select category as "Appetizers"
    When I select menu item as "BRUSHETTA"
    When User click Option Tab
    And I click discount on check option screen
#    And I select Discount on the Order screen
    Then I should see Check Based Discount Screen
    And I click Discount as "IB-AfterTax-FreeItem"
    And I click Back button on Discount Screen
#    Then User select item based discount after tax as Free item
    And User verify item based discount after tax as free item value as "$ 0.00" for Brushetta
    Then I should see orderscreen with as tuna tacos EACH
    When User click Cash Tab
    Then User click exact option
    And User click enter button
   And I click QSR tab
   And I closed the order type window
    And I click log off button in order screen
    Examples:
      |btnQsr|btnCancel|btnDiscount|btnDropDown|category |btnPos|btnExit|btnLogOff|
      |QSR   |Cancel   |Discount   |arrow down |Appetizers|POS  |Exit   |logOff   |
  @RegressionQSR3
    Scenario Outline: Discount - Item Based with Before Tax as Percentage on BarTab and Pay with Fast Cash
      Given User click setting icon
      And User verify setting options
      When User select POS Settings tab
      Then User open ask customer name option if disable in void screen
      And I click the Toggle Icon button
      And I click POS Icon from Toggle
      And I closed the order type window
      When User click QSR on Menu Item page
      Then User select Bar Tab in order types
      When User enter customer name for bar tab
    And I click the Exit to close the preauth window

    And I select category as "Appetizers"
    When I select menu item as "BRUSHETTA"
    When User click Option Tab
    And I click discount on check option screen
#    And I select Discount on the Order screen
    Then I should see Check Based Discount Screen
    And I click Discount as "IB-BeforeTax-Percentage"
      And I click Back button on Discount Screen
#    Then User select item based discount before tax as percentage
    And User verify item based discount before tax as percentage value as "$ 0.10" for Brushetta
    When User click Cash Tab
    Then User click exact option
    And User click enter button
   And I click QSR tab
   And I closed the order type window
    # Discount - Item Based with Before Tax as Amount on BarTab and Pay with Fast Cash
    When User click QSR on Menu Item page
    Then User select Bar Tab in order types
    When User enter customer name for bar tab
    And I click the Exit to close the preauth window
    And I select category as "Appetizers"
    And I select menu item as "PRETZEL"
    When User click Option Tab
    And I click discount on check option screen
#    And I select Discount on the Order screen
    Then I should see Check Based Discount Screen
    And I click Discount as "IB-BeforeTax-Amount"
      And I click Back button on Discount Screen
#    Then User select item based discount before tax as amount
    And User verify item based discount before tax as amount value as "$ 1.00" for Brushetta
    When User click Cash Tab
    Then User click exact option
    And User click enter button
   And I click QSR tab
   And I closed the order type window
    #Discount - Item Based with Before Tax as Set Price on BarTab and Pay with Fast Cash
    When User click QSR on Menu Item page
    Then User select Bar Tab in order types
    When User enter customer name for bar tab
    And I click the Exit to close the preauth window
    And I select category as "Appetizers"
    When I select menu item as "BRUSHETTA"
    When User click Option Tab
    And I click discount on check option screen
#    And I select Discount on the Order screen
    Then I should see Check Based Discount Screen
    And I click Discount as "IB-BeforeTax-SetPrice"
      And I click Back button on Discount Screen
#    Then User select item based discount before tax as set price
    And User verify item based discount before tax as set price value as "$ 0.53" for menu item1
    When User click Cash Tab
    Then User click exact option
    And User click enter button
   And I click QSR tab
   And I closed the order type window
    #Discount - Item Based with Before Tax as Free Item on BarTab and Pay with Fast Cash
    When User click QSR on Menu Item page
    Then User select Bar Tab in order types
    When User enter customer name for bar tab
    And I click the Exit to close the preauth window

    And I select category as "Appetizers"
    When I select menu item as "BRUSHETTA"

    When User click Option Tab
    And I click discount on check option screen
#    And I select Discount on the Order screen
    Then I should see Check Based Discount Screen
    And I click Discount as "IB-BeforeTax-FreeItem"
      And I click Back button on Discount Screen
#    Then User select item based discount before tax as Free item
    And User verify item based discount before tax as free item value as "$ 0.00" for Brushetta
    When User click Cash Tab
    Then User click exact option
    And User click enter button
   And I click QSR tab
   And I closed the order type window
    And I click log off button in order screen

    Examples:
      |btnQsr|btnCancel|btnDiscount|btnDropDown|category |btnPos|btnExit|btnLogOff|
      |QSR   |Cancel   |Discount   |arrow down |Appetizers|POS  |Exit   |logOff   |

  @RegressionQSR3
  Scenario Outline: Discount - Check Based with After Tax on BarTab and Pay with Fast Cash as Percentage
    Given User click setting icon
    And User verify setting options
    When User select POS Settings tab
    Then User open ask customer name option if disable in void screen
    And I click the Toggle Icon button
    And I click POS Icon from Toggle
    And I closed the order type window
    When User click QSR on Menu Item page
    Then User select Bar Tab in order types
    When User enter customer name for bar tab
    And I click the Exit to close the preauth window

    And I select category as "Appetizers"
    When I select menu item as "BRUSHETTA"

    When User click Option Tab
    And I click discount on check option screen
#    And I select Discount on the Order screen
    Then I should see Check Based Discount Screen
    And I click Discount as "CB-PercentageAfterTax"
    And I click Back button on Discount Screen
#    Then User select check based discount after tax
    And User verify check based discount after tax as percentage value as "$ 0.10" for Brushetta
    When User click Cash Tab
    Then User click exact option
    And User click enter button
   And I click QSR tab
   And I closed the order type window

#   Discount - Check Based with After Tax as Amount on BarTab and Pay with Fast Cash
    When User click QSR on Menu Item page
    Then User select Bar Tab in order types
    When User enter customer name for bar tab
    And I click the Exit to close the preauth window

    And I select category as "Appetizers"
    When I select menu item as "BRUSHETTA"
    When User click Option Tab
    And I click discount on check option screen
    Then I should see Check Based Discount Screen
    And I click Discount as "CheckBasedAmountAfterTax"
    And I click Back button on Discount Screen
#    Then User select check based discount after tax as amount
    And User verify check based discount after tax as amount value as "$ 0.58" for Brushetta
    When User click Cash Tab
    Then User click exact option
    And User click enter button
   And I click QSR tab
   And I closed the order type window
    #Discount - Check Based with After Tax as Set Price on BarTab and Pay with Fast Cash
    When User click QSR on Menu Item page
    Then User select Bar Tab in order types
    When User enter customer name for bar tab
    And I click the Exit to close the preauth window

    And I select category as "Appetizers"
    When I select menu item as "BRUSHETTA"
    When User click Option Tab
    And I click discount on check option screen
    Then I should see Check Based Discount Screen
    And I click Discount as "CB-AfterTax-SetPrice"
    And I click Back button on Discount Screen
#    Then User select check based discount after tax as set price
    And User verify check based discount after tax as set price value as "$ 0.61" for Brushetta
    When User click Cash Tab
    Then User click exact option
    And User click enter button
   And I click QSR tab
   And I closed the order type window
    #Discount - Check Based with After Tax as Free Item on BarTab and Pay with Fast Cash
    When User click QSR on Menu Item page
    Then User select Bar Tab in order types
    When User enter customer name for bar tab
    And I click the Exit to close the preauth window

    And I select category as "Appetizers"
    When I select menu item as "BRUSHETTA"
    When User click Option Tab
    And I click discount on check option screen
    Then I should see Check Based Discount Screen
    And I click Discount as "CB-AfterTax-FreeItem"
    And I click Back button on Discount Screen
#    Then User select check based discount after tax as free item
    And User verify check based discount after tax as free item value as "$ 0.00" for Brushetta
    When User click Cash Tab
    Then User click exact option
    And User click enter button
   And I click QSR tab
   And I closed the order type window
    Examples:
      |btnQsr|btnCancel|btnDropDown|category |btnExit|btnDiscount|btnLogOff|btnPos|
      |QSR   |Cancel   |arrow down |Appetizers |Exit |Discount   |logOff   |POS   |


  @RegressionQSR3
    Scenario Outline: Discount - Check Based with Before Tax as Percentage on BarTab and Pay with Fast Cash
    Given User click setting icon
    And User verify setting options
    When User select POS Settings tab
    Then User open ask customer name option if disable in void screen
    And I click the Toggle Icon button
    And I click POS Icon from Toggle
    And I closed the order type window
    When User click QSR on Menu Item page
    Then User select Bar Tab in order types
    When User enter customer name for bar tab
    And I click the Exit to close the preauth window

    And I select category as "Appetizers"
    When I select menu item as "BRUSHETTA"
    When User click Option Tab
    And I click discount on check option screen
    Then I should see Check Based Discount Screen
    And I click Discount as "CB-PercentageBeforeTax"
    And I click Back button on Discount Screen
#    Then User select check based discount before tax as percentage
    And User verify check based discount before tax as percentage value as "$ 0.10" for Brushetta
    When User click Cash Tab
    Then User click exact option
    And User click enter button
   And I click QSR tab
   And I closed the order type window
    # Discount - Check Based with Before Tax as Amount on BarTab and Pay with Fast Cash
    When User click QSR on Menu Item page
    Then User select Bar Tab in order types
    When User enter customer name for bar tab
    And I click the Exit to close the preauth window

    And I select category as "Appetizers"
    When I select menu item as "BRUSHETTA"
    When User click Option Tab
    And I click discount on check option screen
    Then I should see Check Based Discount Screen
    And I click Discount as "CB-AmountBeforeTax"
    And I click Back button on Discount Screen
#    Then User select check based discount before tax as amount
    And User verify check based discount before tax as amount value as "$ 0.67" for Brushetta
    When User click Cash Tab
    Then User click exact option
    And User click enter button
   And I click QSR tab
   And I closed the order type window

#     Discount - Check Based with Before Tax as Set Price on BarTab and Pay with Fast Cash
    When User click QSR on Menu Item page
    Then User select Bar Tab in order types
    When User enter customer name for bar tab
    And I click the Exit to close the preauth window

    And I select category as "Appetizers"
    When I select menu item as "BRUSHETTA"
    When User click Option Tab
    And I click discount on check option screen
    Then I should see Check Based Discount Screen
    And I click Discount as "CB-BeforeTax-SetPrice"
    And I click Back button on Discount Screen
#    Then User select check based discount before tax as set price
    And User verify check based discount before tax as set price value as "$ 0.17" for Brushetta
    When User click Cash Tab
    Then User click exact option
    And User click enter button
   And I click QSR tab
   And I closed the order type window
    #Discount - Check Based with Before Tax as Free Item on BarTab and Pay with Fast Cash
    When User click QSR on Menu Item page
    Then User select Bar Tab in order types
    When User enter customer name for bar tab
    And I click the Exit to close the preauth window

    And I select category as "Appetizers"
    When I select menu item as "BRUSHETTA"
    When User click Option Tab
    And I click discount on check option screen
    Then I should see Check Based Discount Screen
    And I click Discount as "CB-BeforeTax-FreeItem"
    And I click Back button on Discount Screen
    And User verify check based discount before tax as free item value as "$ 0.00" for Brushetta
    When User click Cash Tab
    Then User click exact option
    And User click enter button
   And I click QSR tab
   And I closed the order type window
    And I click log off button in order screen

    Examples:
      |btnQsr|btnCancel|btnDropDown|category |btnExit|btnDiscount|btnLogOff|btnPos|
      |QSR   |Cancel   |arrow down |Appetizers |Exit |Discount   |logOff   |POS   |

  @RegressionQSR3
  Scenario Outline: Open Item Discount with After Tax Check as Amount and Safety Limit in Decimal Precision#    Given User click setting icon
    And I select category as "Appetizers"
    When I select menu item as "BRUSHETTA"
    Then User click Option Tab
    When User select Open Item option
    And I click Coursing Name text field for Menu option
    And I swipe to "<course_name>" as Coursing Name
    And I pass course name as "onion"
    And I tap Price text field for menu option
    And I enter the percentage1 as "3104"
#    And I enter the price with sale1
#    And I click Continue button on the Open Item Price numbers popup
    And I click Done button on the open item window
    Then I should navigate to Order Management screen and see the added open item as "onion"
#    And I click discount on check option screen
    And I select Discount on the Order screen
    Then I should see Check Based Discount Screen
    And I click Discount as "CB-BeforeTax-OpenItem"
    And I click Back button on Discount Screen
    And User verify check based discount before tax value as "$ 12.55" and open item with decimal number for Brushetta
    When User click Cash Tab
    Then User click exact option
    And User click enter button
    And I closed the order type window

#     Open Item Discount with After Tax Check as Amount and Safety Limit in Whole Value
    And I select category as "Appetizers"
    When I select menu item as "BRUSHETTA"
    Then User click Option Tab
    When User select Open Item option
    And I click Coursing Name text field for Menu option
    And I swipe to "<course_name>" as Coursing Name
    And I pass course name as "onion"
    And I tap Price text field for menu option
    And I enter the percentage1 as "3100"
    And I click Done button on the open item window
    Then I should navigate to Order Management screen and see the added open item as "onion"
    And I select Discount on the Order screen
    Then I should see Check Based Discount Screen
    And I click Discount as "CB-BeforeTax-OpenItem"
    And I click Back button on Discount Screen
    And User verify check based discount before tax value as "$ 12.55" and open item with whole number for Brushetta
    When User click Cash Tab
    Then User click exact option
    And User click enter button
    And I closed the order type window

#  Scenario: Open Item Discount with After Tax Check as Percentage
    And I select category as "Appetizers"
    When I select menu item as "BRUSHETTA"
    Then User click Option Tab
    When User select Open Item option
    And I click Coursing Name text field for Menu option
    And I swipe to "<course_name>" as Coursing Name
    And I pass course name as "onion"
    And I tap Price text field for menu option
    And I enter the percentage1 as "3104"
    And I click Done button on the open item window
    Then I should navigate to Order Management screen and see the added open item as "onion"
    And I select Discount on the Order screen
    Then I should see Check Based Discount Screen
    And I click Discount as "CB-PercentageAfterTax"
    And I click Back button on Discount Screen
#    Then User select check based discount after tax
    Then It should show the amount value as "$ 3.20" "Verify discount amount value"
    When User click Cash Tab
    Then User click exact option
    And User click enter button
    And I closed the order type window

    And I select category as "Appetizers"
    When I select menu item as "BRUSHETTA"

    Then User click Option Tab
    When User select Open Item option
    And I click Coursing Name text field for Menu option
    And I swipe to "<course_name>" as Coursing Name
    And I pass course name as "onion"
    And I tap Price text field for menu option
    And I enter the percentage1 as "3104"
    And I click Done button on the open item window
    Then I should navigate to Order Management screen and see the added open item as "onion"
    And I select Discount on the Order screen
    Then I should see Check Based Discount Screen
    And I click Discount as "CB-AfterTax-OpenItem"
    And I click Back button on Discount Screen
    And User verify check based discount after tax value as "$ 13.55" and open item with decimal number for Brushetta
    When User click Cash Tab
    Then User click exact option
    And User click enter button
    And I closed the order type window

   #Open Item Discount with Before Tax Check as Amount and Safety Limit in Whole Value
    And I select category as "Appetizers"
    When I select menu item as "BRUSHETTA"
    Then User click Option Tab
    And I click Open Item button
    Then I should see open item screen
    And I click Coursing Name text field for Menu option
    And I swipe to "<course_name>" as Coursing Name
    And I pass course name as "onion"
    And I tap Price text field for menu option
    And I enter the percentage1 as "3100"
    And I click Done button on the open item window
    Then I should navigate to Order Management screen and see the added open item as "onion"
    And I select Discount on the Order screen
    Then I should see Check Based Discount Screen
    And I click Discount as "CB-AfterTax-OpenItem"
    And I click Back button on Discount Screen
    And User verify check based discount after tax value as "$ 13.55" and open item with whole number for Brushetta
    When User click Cash Tab
    Then User click exact option
    And User click enter button
    And I closed the order type window

    #Open Item Discount with Before Tax Check as Percentage
    And I select category as "Appetizers"
    When I select menu item as "BRUSHETTA"
    Then User click Option Tab
    When User select Open Item option
    And I click Coursing Name text field for Menu option
    And I swipe to "<course_name>" as Coursing Name
    And I pass course name as "onion"
    And I tap Price text field for menu option
    And I enter the percentage1 as "3104"
    And I click Done button on the open item window
    Then I should navigate to Order Management screen and see the added open item as "onion"
    And I select Discount on the Order screen
    Then I should see Check Based Discount Screen
    And I click Discount as "CB-PercentageBeforeTax"
    And I click Back button on Discount Screen
    Then It should show the amount value as "$ 3.20" "Verify discount amount value"
    When User click Cash Tab
    Then User click exact option
    And User click enter button
    And I closed the order type window
    And I click log off button in order screen

    Examples:
      |course_name|btnCancel|  btnCBDiscount      | text|btnDropDown|category|btnDiscount|pin1|pin5|pin0|btnContinue |btnDone|btnLogOff|
      |ENTREE     |Cancel   |CB-PercentageAfterTax|TL 101,50|arrow down |Appetizers |Discount|1   |5   |0   |Continue    |Done   |logOff|

  @RegressionQSR3
  Scenario: Fire Coursing with DineIn Order,Fire Coursing without Sent To Kitchen
    When User click QSR on Menu Item page
    Given User select DineIn mode
    And User select first table
    Then User click Option Tab
    And User click fire coursing option
    Then I should see the please order the menu popup
    And I click Done button on the Popup
    And I closed the order type window
#    And I click on "   Back" for closing order screen popup "Click Back button"
#    And I click on " Back " for closing order screen popup "Click Back button"
    When User select any menu item
    Then User click Option Tab
    And User click fire coursing option
    Then I should see the please send all the menu items to kitchen popup
    And I click Done button on the Popup
    And I closed the order type window
    When User click void button
    And I click Done button on the Popup
    Given User select DineIn mode
    When User select QSR order typ
    When USer click log off button

  @RegressionQSR3
  Scenario Outline: Open Gratuity Page
    When I select menu item as "SANDWICHES"
    Then User click Option Tab
      When User select gratuity option
    Then User verify gratuity page
     #Gratuity Fixed
    Then User select fixed gratuity option
    And User verify fixed gratuity as "$ 0.10"
    #Remove Gratuity
    When User click Option Tab
      When User select gratuity option
    And User select fixed gratuity option
    And User verify deleted gratuity amount
    #Gratuity Varying
    Then User click Option Tab
      When User select gratuity option
    Then User select varying gratuity option
    And User enter percentage of varying gratuity
    And I enter the percentage1 as "1500"
#    And I click "<btnContinue>" in the percentage apply screen "Click Continue"
    And User click apply button for varying gratuity
    And User verify varying gratuity as "$ 0.15"
    Then User click Option Tab
      When User select gratuity option
    Then User select varying gratuity option
    #Verify minimum value of Gratuity (Gratuity Varying)
    Then User click Option Tab
      When User select gratuity option
    Then User select varying gratuity option
    When User enter value less then minimum value of gratuity
    Then User verify minimum value of gratuity warning popup
    And I click Done button on the Popup
    And I closed the order type window
    #Verify maximum value of Gratuity (Gratuity Varying)
#      When User select gratuity option
    Then User select varying gratuity option
    When User enter value more then maximum value of gratuity
#    And I click " Back " for closing future order "Click Back button"
    Then User verify minimum value of gratuity warning popup
    And I click Done button on the Popup
    And I closed the order type window
    #Verify Fix Gratuity (gratuity percentage)
#      When User select gratuity option
    Then User select fixed gratuity option
    And User verify fixed gratuity as "$ 0.10"
    And User verify total amount with fix gratuity value
    When User click Option Tab
      When User select gratuity option
    And User select fixed gratuity option
    And User verify deleted gratuity amount
    Then User click payment button
    And User click exact option
    And USer click cash button
    When User click submit button
    And I closed the order type window
    And I click log off button in order screen

    Examples:
      |btnGratuity |pin0|pin1|pin5|btnContinue|pinpoint|btnLogOff|btnApply|
      |Gratuity    |0   |1   |5   |Continue   |.       |logOff   |Apply   |

  @RegressionQSR3
  Scenario Outline: Reduce Gratuity
    When I get check number
    When I select menu item as "SANDWICHES"
    Then User click Option Tab
      When User select gratuity option
    Then User select fixed gratuity option
    And User verify fixed gratuity as "$ 0.10"
    When User click payment button
    And User select payment method with cash
    Then User click submit button
    And I closed the order type window
    When User click All button
    And User click Closed Checks tabs
    And I click the Closed check on check stats
    And User click re-open check button
    When User click Option Tab
      When User select gratuity option
    Then User select varying gratuity option
    And User enter percentage of varying gratuity
    And I enter the percentage1 as "1500"
#    And I click "<btnContinue>" in the percentage apply screen "Click Continue"
    And User click apply button for varying gratuity
    Then User click payment button
    And User click exact option
    And USer click cash button
    When User click submit button
    And I closed the order type window
    And I click log off button in order screen

    Examples:
      |btnGratuity |pin0|pin1|pin5|btnContinue|pinpoint|btnLogOff|btnApply|
      |Gratuity    |0   |1   |5   |Continue   |.       |logOff   |Apply   |

  @RegressionQSR3
  Scenario Outline:  Verify Check Payment through CC with Gratuity(Fixed) and with tips
    Then User click food category
    When User select Sandwiches menu item
    Then User click Option Tab
    When User select gratuity option
    Then User select fixed gratuity option
    And User verify fixed gratuity as "$ 0.10"
#    And User verify total amount with fix gratuity value
    When User click payment button
    Then User click exact option
    And User click CC Side payment method
    When User select tip amount which is entered
    And User click Continue button
    And User verify CC Side payment with Gratuity(Fixed) and with tips
    When User click submit button
    And I closed the order type window
    And I click log off button in order screen

    Examples:
      |btnLogOff|
      |logOff   |
  @RegressionQSR3
  Scenario Outline: Verify Check Payment through CC with Gratuity(Varying) and with tips
    Then User click food category
    When User select Sandwiches menu item
    Then User click Option Tab
    When User select gratuity option
    Then User select varying gratuity option
    And User enter percentage of varying gratuity
    And I enter the percentage1 as "<value>"
#    And I enter the percentage as "<pin1>","<pin5>","<pinpoint>","<pin0>"
#    And I click "<btnContinue>" in the percentage apply screen "Click Continue"
    And User click apply button for varying gratuity
    And User verify varying gratuity as "$ 0.15"
    When User click payment button
    Then User click exact option
    And User click CC Side payment method
    When User select tip amount which is entered
    And User click Continue button
    And User verify CC Side payment with Gratuity(Varying) and with tips
    When User click submit button
    And I closed the order type window
    When USer click log off button

    Examples:
      |btnGratuity |pin0|pin1|pin5|btnContinue|pinpoint|btnLogOff|btnApply|value|
      |Gratuity    |0   |1   |5   |Continue   |.       |logOff   |Apply   |1500  |


  @RegressionQSR3
  Scenario Outline: Delete Modifier,Add Modifier,Cancel Modifier
   #Application should be closed modifiers screen and come back to the order screen
    When User select menu item with modifier
    And I select modifier as "<btnRomano>"
    And User click modifier cancel button
    #And User verify empty order page
    #Application should come back to the order screen and selected modifiers should be added to the menu items
    When User select menu item with modifier
    And I select modifier as "<btnRomano>"
    And I click Done to get back
    And User verify be directed menu item page
    And User verify added modifier
    # Delete Modifier
    And I click Options button
    And I click Modify
    And User select first menu item with modifier
    And I select modifier as "<Modifier>" from the modifier window
#    And User click modifier cancel button
    And User verify selected modifier on modifier page
    And I click Options button
    And I click Modify
    And User select first menu item with modifier
    #Add Modifier #Application should allow user to add modify with modifiers
    And I select modifier as "<Modifier>" from the modifier window
    And User verify selected modifier on modifier page
#    And I click Ok button on the modifier screen
    Then User verify selected modifier on menu item page
    And User verify added modifier
    And I click Void button on order management screen
    And I click Done button on the Popup
    And I click log off button in order screen

    Examples:
      |btnVoid|btnRomano |btnOption|btnModify|Modifier |btnLogOff|btnDone|
      |Void   |1/2 Romano|Option   |Modify   |Add Veggies|logOff |Done   |


  @RegressionQSR3
  Scenario Outline: Application should allow to add modifiers at its maximum qty per item,Verify delete modifiers
    When User select menu item with modifier
    Then User add modifiers over maximum count
    When User verify maximum count popup
    And User click modifier done button
    And I click Done to get back
    Then User verify be directed menu item page
    And User verify added quantity of modifier for first modifier
    And I click Void button on order management screen
    And I click Done to get back
    When User select another menu item with modifier
    Then User add second menu item modifier over maximum count
    When User verify maximum count popup
    And User click modifier done button
    And I click Done to get back
    And User verify be directed menu item page
    And User verify added quantity of modifier for second modifier
    And I click Void button on order management screen
    And I click Done button on the Popup
    #Modifier After Sent To Kitchen
    When User select menu item with modifier
    Then User add modifiers over maximum count
    And User click modifier done button
    Then User click order button
    And I click Options button
    And I click Modify
    When User select first menu item with modifier
    Then User verify ordered menu item modifier popup
    And I click Void button on order management screen
    And I click void Reason on the void popup
    And I click Add Button on the void reason popup
    And I closed the order type window
#   And I closed the order type window
    # Application should do modifier should added as per qty of item with Modifier's max level #Modifiers with Maximum Count
    When User select second menu item with modifier
    Then User add modifier over maximum count
    When User verify maximum count popup
    And User click modifier done button
    When User select another modifier for the same menu item
    Then User verify added quantity of modifier for second modifier
    And User verify maximum quantity of modifiers for first and second modifiers
    And User click modifier cancel button
    And I click log off button in order screen

    Examples:
      |btnVoid|   btnWrong         |btnAdd|btnDone|btnCancel|number1|text2|btnOption|btnModify |btnLogOff|
      |Void   |Wrong Item Ordered |Add    |Done   |Cancel   |1      |15,00 |Option  |Modify    |logOff   |







