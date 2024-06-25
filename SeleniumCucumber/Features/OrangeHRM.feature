
Feature: OrangeHRM Login

  Scenario: Logo present on OrangeHRM Home Page.
    Given I Launch chrome browser
    When I opened orangeHRM home page
    Then I verify that the log is prsent on home page
    And Close the browser