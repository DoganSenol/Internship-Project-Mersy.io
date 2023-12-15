Feature: Move to trash and delete Messaging functionality

  Background: Login with valid username and password
    Given Navigate to Website
    And   Enter username that as "username" and password that as "password"
    When  Click login Button
    Then  Verify that student logged in

  Scenario: Student messages should be moved to the trash bin
    When The student clicks on the hamburger menu -> messaging menu -> Inbox
    Then The student clicks on the move to trash button

  Scenario: Student restore the messages from the trash
    When The student clicks on the hamburger menu -> messaging menu -> Trash
    And The student restore the messages

