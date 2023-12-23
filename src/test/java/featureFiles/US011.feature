Feature: Payment Functionality


  Background:
    Given Navigate to Website
    And   Enter username that as "username" and password that as "password"
    When  Click login Button
    Then  Verify that student logged in

  @RegressionTest
  Scenario: The student must pay the remaining installments from the student payment section securely
    When The student click on the Hamburger Menu
    Then The student click on the Finance -> My Finance
    And  The student should see the Students Fees text
    Then The student click on the  Balance Link
    And  The student should see the Student Fee text
    When The student clicks on the Stripe for the payment process
    And The student selects the payment method, enters the amount, inputs their credit card information, and completes the payment
    Then The student should see the Success Message