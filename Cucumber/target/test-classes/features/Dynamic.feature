
Feature: Application login with diffrent users


  Scenario: Home page default Login with user1
    Given User is on landing Page
    When user login into application with "Manoj" username and password"Password@123"
    Then Home Page is populated
    And User name"Manoj" is dispalyed

Scenario: Home page default Login with user2
    Given User is on landing Page
    When user login into application with "Sanjay" username and password"Password@123"
    Then Home Page is populated
    And User name"Sanjay" is dispalyed