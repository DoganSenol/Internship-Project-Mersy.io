Feature: Theme Options for Student Profile

  As a student,
  I want to use at least three different color options on my profile.
  So that I can have experienced a more personal user experience.

  Background:
    Given Navigate to Website
    And   Enter username that as "username" and password that as "password"
    When  Click login Button
    Then  Verify that student logged in

  @SmokeTest
  Scenario: Accessing Profile Settings
    When the student clicks on the Profile
    And selects Settings
    Then the student should be directed to the Settings section
    When the student clicks Default Theme dropbox and verifies that there are more than three themes
    And the student selects one of the themes clicks on the save button and verifies theme of the page
    Then a success message should appear confirming the process
