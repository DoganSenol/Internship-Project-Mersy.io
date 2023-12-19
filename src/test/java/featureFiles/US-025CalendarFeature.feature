Feature:I should not be able to attend a course that has not yet started on the Calendar page

  Background:
    Given Navigate to Website
    And   Enter username that as "username" and password that as "password"
    When  Click login Button

  Scenario: As a student, I should  be able watch video on the Calendar page.
    Given As a Student  click Calendar Button
    When Student click previous button
    Then Student click on a ended course
    And Click to Recording Button