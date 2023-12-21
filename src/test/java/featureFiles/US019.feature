Feature: Assignments Feature

  Background:

    Given Navigate to Website
    And   Enter username that as "username" and password that as "password"
    When  Click login Button
    Then  Verify that student logged in

  Scenario:
    When the student clicks on the assignments page->discussion
    Then the student should see and be able to click on an icon Chats
    And  the student should be able to select the person people Contacts
    Then the student should also be able to send file attachments
    When the student should not receive any success notification
    Then the student should be able to see the message with the date and time of sending






