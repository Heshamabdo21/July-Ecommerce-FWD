@smoke12
Feature: F02_Search | users will be able to search for products with different parameters

  Scenario: user could login with valid email and password
    Given user go to login page before sreach
    When user login  before search with valid email and password
    Then user login to the system successfully before search

  Scenario: user could search for product using fullname
    Given user clicks on search field
    When user search with name of product
    Then user could find relative results
