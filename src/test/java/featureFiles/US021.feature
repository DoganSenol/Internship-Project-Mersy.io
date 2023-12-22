Feature: Upload a homework in the Assignments

  As a student,
  I should be able to upload my homework to the
  campus system.
  So that, I would present my homework to my
  teacher's evaluation faster.

  Background:
    Given Navigate to Website
    And   Enter username that as "username" and password that as "password"
    When  Click login Button
    Then  Verify that student logged in

  Scenario: Verify icons on the homework line and homework details page
    When the student clicks on the Assignments
    And selects All from the Semester dropbox
    Then the student views the list of homework items on the Assignments page
    And confirms submit icons on the page are visible
    Then the student clicks on the submit icon of one of the homeworks
    And accesses to text editor page
    And verifies Submit button is not selectable till the student clicks on the Save as Draft button
    And should write into the text editor
    And paste a text
    And create picture or table in the text editor
    And should attach file in the text editor
    And clicks on the Save as Draft button
    #Then a success message should appear confirming the process
    And clicks on the submit button
    And clicks on the Yes button for submission
    #Then a success message should appear confirming the process
    When The student clicks on any part of one of the homeworks item in the list
    #Then Verify the student is directed to the homework details page
    And the student verifies new submission button