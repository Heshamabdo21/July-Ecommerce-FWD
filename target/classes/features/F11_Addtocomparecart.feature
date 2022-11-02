@smoke12
Feature: F11_Addtocomparecart | Logged user could add different products to compare list


  Scenario: could add different products to compare list
    Given Logged user could add different products to compare cart
    When user add Frist products to compare cart
    And user add Scoend products to compare cart
    Then assert compare cart have two product

