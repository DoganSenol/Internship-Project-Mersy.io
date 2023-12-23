Feature: Attendance Excuses Functionality

  Background: Login with valid username and password
    Given Navigate to Website
    And   Enter username that as "username" and password that as "password"
    When  Click login Button
    Then  Verify that student logged in

  @SmokeTest
  Scenario: The student uses the attendance system
    When  The student clicks on the Attendance Button
    And   The student clicks on the ATTENDANCE EXCUSES
    Then  The student clicks on the Add Button
    And   The student select the type of EXCUSES and the date of EXCUSES
    Then  The student and writes a message sends an EXCUSE