Feature:Feature buttons on homepage

  Background: Login
    Given Navigate to Website
    And   Enter username that as "username" and password that as "password"
    When  Click login Button
    Then  Verify that student logged in

  Scenario: Click Courses Functionaluty
    When Click Coures Button
    Then Should be Welcome

  Scenario: Click Calendar
    When Click Calendar Button
    Then Should be Calendar word

  Scenario: Click Attendance
    When Click Attendance button
    Then Should be Attendance word

  Scenario: Check Assignments Button
    When  Click Assignments button
    Then Should see Assifnments

  Scenario: Check Grading Button
    When Click Grading button
    Then Should see Grading

  Scenario: Check Hamburg Button
    When Click Hamburg button
    Then Should see Messaging,Finance,Education,Video Conference,Surveyd

  Scenario: Check Chats Button
    When Click Chats button
    Then Should see Student_5_11A_Mark Zuckerberg

  Scenario: Check Messages Button
    When Click Messages button
    Then Should see Messages window

  Scenario: Check Profile Button
    When Click Profile button
    Then Shold see My Certificates,My Files,Change Password,Settings,Sign Out

