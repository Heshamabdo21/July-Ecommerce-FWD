@smoke12
Feature: F07_filter_with_colorfeature |  Logged user could filter with color

  Scenario: user could filter with color
    Given  Logged user in home page to Filter
    When user determined to Categories like Apparel > Shoes
    And Filter with blue color
    Then filtertion successfully
