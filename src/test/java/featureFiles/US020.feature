Feature: Verifying Assignments buttons

  As a student,
  There must be shortcut buttons on a randomly selected homework line from the list of duties on the Assignments
  page.
  So that I can perform my transactions faster.

  Background:
    Given Navigate to Website
    And   Enter username that as "username" and password that as "password"
    When  Click login Button
    Then  Verify that student logged in

  @SmokeTest
  Scenario: Verify icons on the homework line and homework details page
    When the student clicks on the Assignments
    And selects All from the Semester dropbox
    Then the student views the list of homework items on the Assignments page
    And confirms one of the homeworks' icons displaying information, submission, and favorite icons
    And Verify the icons are aligned to the right of each homework item
    When The student clicks on any part of one of the homeworks item in the list
    Then Verify the student is directed to the homework details page
    Then If the student initiated a discussion for the homework item confirms the discussion icon is visible in the details page
