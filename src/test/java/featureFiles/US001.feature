Feature: Login Functionality

  @SmokeTest
  Scenario: Login with valid username and password
    Given Navigate to Website
    And   Enter username that as "username" and password that as "password"
    When  Click login Button
    Then  Verify that student logged in

  @SmokeTest
  Scenario: The student is trying to log in with invalid user credentials
    When    Navigate to Website
    Then    The Student enter invalid username and password
      | userNameInput           |
      | passwordInput           |
      | loginButton             |
      | invalidUserNamePassword |
