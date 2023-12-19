Feature: Grading Feature

  Background:

    Given Navigate to Website
    And   Enter username that as "username" and password that as "password"
    When  Click login Button
    Then  Verify that student logged in

  Scenario:
    When the evaluation page should be a link (Grading) that the student can access.
    Then the student can select Course Grade , Student Transcript,Transcript by Subject buttons

