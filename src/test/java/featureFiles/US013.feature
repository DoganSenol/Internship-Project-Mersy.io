Feature: Attendance Excuses Functionality

  Background: Login with valid username and password
    Given Navigate to Website
    And   Enter username that as "username" and password that as "password"
    When  Click login Button
    Then  Verify that student logged in

  Scenario: The student uses the attendance system
    When  The student clicks on the Attendance Button