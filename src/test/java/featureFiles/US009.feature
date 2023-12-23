Feature:As a student, I should be able to pay by going to Finance from the Finance menu

  Background:
    Given Navigate to Website
    And   Enter username that as "username" and password that as "password"
    When  Click login Button

  @RegressionTest
    Scenario: I should be able to pay by going to Finance from the Finance menu
      Given Student clicks on the finance section of the hamburger menu.
      When Student clicks on the section to make the payment.
      Then Student sees the payment options by clicking on the stripe section
      And Student clicks on the desired payment option and enters the information.
      And Student must successfully complete the payment process