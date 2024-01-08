Feature: Verifying Assignments' link

  As a student, I should be able to access all tasks assigned to me
  from a page.
  So that, I can be informed such tasks assigned to me; quiz, projects, surveys, etc., and I can create a work plan.

  Background:
    Given Navigate to Website
    And   Enter username that as "username" and password that as "password"
    When  Click login Button
    Then  Verify that student logged in

  @SmokeTest
  Scenario: Verify Assignments link on the home page and icons on the homework line
    When the student hovers over the Assignments menu on the homepage sees the total number of assigned tasks
    And the student clicks on the Assignments
    And selects All from the Semester dropbox
    Then the student views the list of homework items on the Assignments page

