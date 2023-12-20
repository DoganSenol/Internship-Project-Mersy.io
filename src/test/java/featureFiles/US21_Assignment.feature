Feature:Assignments Feature on Campus

  As a student,
  I should be able to upload my homework to the  campus system.
  Thus, I would present my homework to my  teacher's evaluation faster

  Background:
    Given Navigate to Website
    And   Enter username that as "username" and password that as "password"
    When  Click login Button
    Then  Verify that student logged in

  Scenario: The student should be able under Assignment Feature, Upload Homework and verify it.
    When Student clicks on the Assignments
    And Student selects Homework and should be push Submit button and verify
    And write text and upload picture
    And click to attach_files icon
    Then save_as_draft the homework
    And verify success message
    And click to Send button verify transaction
    And verify New Submission button