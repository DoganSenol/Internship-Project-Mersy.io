Feature: Deleting Messages from Outbox

  As a student,
  I want to delete messages in the Outbox from the Hamburger Menu,
  So that I can delete my messages when necessary.

  Background:
    Given Navigate to Website
    And   Enter username that as "username" and password that as "password"
    When  Click login Button
    Then  Verify that student logged in

  Scenario: Access Outbox from Hamburger Menu
    When the student clicks on the Hamburger Menu
    And selects Messaging > Outbox
    Then the student should be directed to the Outbox page
    When the student selects the message clicks the move to trash button and confirms
    Then a success message should appear confirming the process