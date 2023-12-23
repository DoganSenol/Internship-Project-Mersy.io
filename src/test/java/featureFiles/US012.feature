Feature: Payment via Finance Section

  As a student,
  I want to make payments by accessing Finance from the Hamburger menu.
  So that I can conveniently manage my online payments.

  Background:
    Given Navigate to Website
    And   Enter username that as "username" and password that as "password"
    When  Click login Button
    Then  Verify that student logged in

  Scenario: Perform Safe Payment Process
    When the student clicks on the Hamburger Menu
    And selects Finance > My Finance
    Then the student should be directed to the My Finance section
    Given The student must have fee for payment
    When the student clicks three dots icon for report
    And clicks on the excel report
    And clicks on the pdf report

