Feature: Assignments Functionality

  Background:Login with valid username and password
    Given Navigate to Website
    And   Enter username that as "username" and password that as "password"
    When  Click login Button
    Then  Verify that student logged in

  Scenario: The Student is resetting the settings under the Assignments tab
    When  The student clicks on Assignments Button
    Then  The student reset the settings

  Scenario: The Student uses the Courses filter
    And   The student should be able to filter courses from the Courses tab

  Scenario: The student should be able to filter courses from the Status tab
    Then  The student should be able to filter courses from the Status tab

    Scenario: The student should be able to filter courses from the Semester tab
    And   The student should be able to filter courses from the Semester tab

  Scenario: The student should be able to filter courses from the Show By tab
    And   The student should be able to filter courses from the Show By tab