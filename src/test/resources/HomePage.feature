Feature: Login Sauce Demo
  Background: Cart Button number is added
    Given Im in sauce demo web page

  @verifyCartButtonNumberIsAdded
  Scenario: Cart Button number is added
    Given I set the user name field with "standard_user"
    Given I set the password field with "secret_sauce"
    And I click on Login button
    When I click on sauce labs back pack add button
    Then Cart icon number should be incremented

  @lowToHighFilter
  Scenario: Cart Button number is added
    Given I set the user name field with "standard_user"
    Given I set the password field with "secret_sauce"
    And I click on Login button
    When I click on Price low to high
    Then Products should be ordered from low to high price
