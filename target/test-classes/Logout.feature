Feature: Login Sauce Demo
  Background: User logout into Sauce Demo page
    Given Im in sauce demo web page

  @verifyLogoutTest
  Scenario: Logout of Sauce Demo
    Given I set the user name field with "standard_user"
    Given I set the password field with "secret_sauce"
    And I click on Login button
    When I click on sidebar button and logout link
    Then The login page should be displayed
