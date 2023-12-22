Feature: Payment Balance Update

  Background: Login
    Given Navigate to Website
    And   Enter username that as "username" and password that as "password"
    When  Click login Button
    Then  Verify that student logged in

  Scenario: Verify balance update after making payment

    When Click Hamburg button
    And selects Finance > My Finance
    And Click the eye
    And Click the stripeRadio > Click Pay > Click Amount
    Given Click card input text and enter card number
    Then Should see paymentSuccessfully

