Feature: As a student, I want to be able to send messages from Hamburger Menu.

  Background:
    Given Navigate to Website
    And   Enter username that as "username" and password that as "password"
    When  Click login Button

  @RegressionTest
  Scenario: I want to be able to send messages from Hamburger Menu
    Given Student clicks on the Hamburger Menu, messaging and new message button
    When Student clicks on the receivers button and selects receivers
    Then Student student writes the subject in the subject field.
    And Student create a table
    When Student write a text in text area
    Then Student should be able to attach files to their message
    And Student should be able to send the message successfully
    And Student should be able to see a list of sent message items