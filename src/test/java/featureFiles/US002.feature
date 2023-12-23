Feature: Home Page Functionality

  Background:

    Given Navigate to Website
    And   Enter username that as "username" and password that as "password"
    When  Click login Button
    Then  Verify that student logged in

  @RegressionTest
  Scenario:
    When User must click on the logo
    Then should be able to get to the main page of the course
    And get general information
