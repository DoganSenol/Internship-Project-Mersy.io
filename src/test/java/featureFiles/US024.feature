Feature:I should not be able to attend a course that has not yet started on the Calendar page

  Background:
    Given Navigate to Website
    And   Enter username that as "username" and password that as "password"
    When  Click login Button

  Scenario: As a student, I should not be able to attend a course that has not yet started on the Calendar page.
    Given Student click Calendar button
    When Student click an any course and verify course information
    Then Student click on a course that is not published and verify
    And Student click on a published course and verify