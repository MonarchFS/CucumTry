Feature: Test the login functionality of OrangeHRM using Data Table

  Scenario: Test the valid login using Data Table
    Given user is on loginPage
    When user enters credentials using Data Table
    	| Admin     | admin123 |
    And click on login button
    Then user should land on home page

