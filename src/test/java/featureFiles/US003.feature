Feature:Feature buttons on homepage

  Background: Login
    Given Navigate to Website
    And   Enter username that as "username" and password that as "password"
    When  Click login Button
    Then  Verify that student logged in

  @RegressionTest
  Scenario: Click Courses Functionaluty
    When Click Coures Button
    Then Should be Welcome

  @RegressionTest
  Scenario: Click Calendar
    When Click Calendar Button
    Then Should be Calendar word
  @RegressionTest
  Scenario: Click Attendance
    When Click Attendance button
    Then Should be Attendance word

  @RegressionTest
  Scenario: Check Assignments Button
    When  Click Assignments button
    Then Should see Assifnments

  @RegressionTest
  Scenario: Check Grading Button
    When Click Grading button
    Then Should see Grading

  @RegressionTest
  Scenario: Check Hamburg Button
    When Click Hamburg button
    Then Should see Messaging,Finance,Education,Video Conference,Surveyd

  @RegressionTest
  Scenario: Check Chats Button
    When Click Chats button
    Then Should see Student_5_11A_Mark Zuckerberg

  @RegressionTest
  Scenario: Check Messages Button
    When Click Messages button
    Then Should see Messages window

  @RegressionTest
  Scenario: Check Profile Button
    When Click Profile button
    Then Shold see My Certificates,My Files,Change Password,Settings,Sign Out

