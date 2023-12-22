Feature: Upload Photo for Student Profile

  As a student,
  I should be able to upload and change my profile  photo.
  Thus, I would use the Campus application more interactively.


  Background:
    Given Navigate to Website
    And   Enter username that as "username" and password that as "password"
    When  Click login Button
    Then  Verify that student logged in

  Scenario: Accessing To Profile Settings
    When Student clicks on the Profile
    And Student selects Settings
    Then Student should be directed to the Settings section
    And click to photo
    And click to upload photo icon
    Then choose the photo jpg