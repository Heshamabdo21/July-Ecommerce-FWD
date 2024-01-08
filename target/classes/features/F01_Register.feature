@smoke12
Feature: F01_Register | users could use register functionality to open new accounts

  Scenario: user could register with valid fristname and lastname and email and password and confirmPassword
    Given user go to register page
    When user lregister with valid fristname and lastname and email and password and confirmPassword
    And user press on register button
    Then user register to the system successfully
    And user logout to login page
