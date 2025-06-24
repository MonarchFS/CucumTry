Feature: Test the login functionality of OrangeHRM

  Scenario: Test the valid login
    Given user is on loginPage
    When user enters "Admin" and "admin123"
    And click on login button
    Then user should land on home page
