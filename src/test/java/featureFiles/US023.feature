Feature:  Student can view weekly and monthly course plans on the Calendar

  Background: Login
    Given Navigate to Website
    And   Enter username that as "username" and password that as "password"
    When  Click login Button
    Then  Verify that student logged in

  Scenario: Student views the Weekly Course Plan
    When the user clicks on the Calendar tab
    Then the Weekly Course Plan tab should be displayd
    And the user should see the course statuses : Published (P), Started (S), Ended (E), Cancelled (C)

  Scenario: Student views different course plans based on the selected option
    When the user clicks on the Calendar tab
    And the user clicks on the Calendar button next to the Weekly Course Plan
    Then the user should see the options: Week, Month, Day, List