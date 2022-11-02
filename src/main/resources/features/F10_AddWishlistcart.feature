@smoke12
Feature: F10_AddWishlistcart | Logged user could add different products to Wishlist


  Scenario:
    Given Logged user could add different products to Wishlist cart
    When user add Frist products to Wishlist cart
    And user add Scoend products to Wishlist cart
    Then assert Wishlist cart have two product

