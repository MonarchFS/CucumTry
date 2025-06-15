Feature: User Login

  Scenario: Successful Login
    Given the user is on the ecommerce login page
    When the user enter valid credentials(username: "Admin", password: "admin123")
    And and the user click on login button
    Then the user should be redirected to the my account page
    And the user should see a welcome message
