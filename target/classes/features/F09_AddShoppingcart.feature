@smoke12
Feature: F09_AddShoppingcart |  Logged user could add different products to Shopping cart

  Scenario:
    Given Logged user could add different products to Shopping cart
    When user add Frist products to Shopping cart
    And assert shopping cart have Frist product
    Then user add Scoend products to Shopping cart
    And assert shopping cart have Scoend product

