@smoke12
Feature: F03_RestPassword | users could use Rest password functionality

  Scenario: users could use Rest password with vaild email
    Given user go to Rest page
    When user rest with valid email
    And user press on Recover button
    Then user rest password successfully
