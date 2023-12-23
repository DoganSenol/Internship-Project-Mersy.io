Feature: Assignments Functionality

  Background:Login with valid username and password
    Given Navigate to Website
    And   Enter username that as "username" and password that as "password"
    When  Click login Button
    Then  Verify that student logged in

  @RegressionTest
  Scenario: The Student is resetting the settings under the Assignments tab
    When  The student clicks on Assignments Button
    Then  The student reset the settings

  @RegressionTest
  Scenario: The Student uses the Courses filter
    And   The student should be able to filter courses from the Courses tab

  @RegressionTest
  Scenario: The student should be able to filter courses from the Status tab
    Then  The student should be able to filter courses from the Status tab

  @RegressionTest
    Scenario: The student should be able to filter courses from the Semester tab
    And   The student should be able to filter courses from the Semester tab

  @RegressionTest
  Scenario: The student should be able to filter courses from the Show By tab
    And   The student should be able to filter courses from the Show By tab