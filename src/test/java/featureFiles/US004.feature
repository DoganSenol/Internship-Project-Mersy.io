Feature: Hamburger Menu

  As a student,
  I should be able to delete messages in Outbox from  Hamburger Menu.
  So I can edit my messages when necessary.


  Background:
    Given Navigate to Website
    And   Enter username that as "username" and password that as "password"
    When  Click login Button
    Then  Verify that student logged in

  Scenario:  The student should be able to access the outgoing list
    When  the student click on the Hamburger Menu
    And   select  Messaging
    Then  The student must have to click New Message
    Given The student must have to click Inbox
    When  The student must have to click Outbox
    Then  The student must have to click Trash
