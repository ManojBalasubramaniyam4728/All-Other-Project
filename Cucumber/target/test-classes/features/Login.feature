
Feature: Application login


  Scenario: Home page default Login
    Given User is on landing Page
    When user login into application with username and password
    Then Home Page is populated
    And User name is dispalyed

