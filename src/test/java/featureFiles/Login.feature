Feature: Login Functionality

  Scenario: Login with valid username and password
    Given Navigate to Website
    And   Enter username that as "username" and password that as "password"
    When  Click login Button
    Then  Verify that student logged in