@smoke12
Feature: F12CreatesuccessfulOrder | Create successful Order


  Scenario: User Can Create Syccessful Order
    Given User Go to Shopping cart
    When user Complete Data to create order
    #And user add Scoend products to compare cart
    Then assert user created order successful

