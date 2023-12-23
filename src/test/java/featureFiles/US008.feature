Feature: Payment via Finance Section

  As a student,
  I want to make payments by accessing Finance from the Hamburger menu.
  So that I can conveniently manage my online payments.

  Background:
    Given Navigate to Website
    And   Enter username that as "username" and password that as "password"
    When  Click login Button
    Then  Verify that student logged in

  @SmokeTest
  Scenario: Perform Safe Payment Process
    When the student clicks on the Hamburger Menu
    And selects Finance > My Finance
    Then the student should be directed to the My Finance section
    Given The student must have fee for payment
    When the student clicks one of the elements of the Students Fees table
    Then the student should be directed to the Student Fee section
    When the student selects provider for payment process
    And the student selects pay type, amount and completes payment process by entering credit card information
    Then a success message should appear confirming the process