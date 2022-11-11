Feature: User should be able to login with valid credentials

  Background:
    Given user is on the login page of the web table app

  Scenario: Login scenatio with 1 param
    When user enters user name "Test"
    And user enters password "Tester"
    And user clicks the login button
    Then user should see url contains orders


  Scenario: Login scenario with 2 params
    When user enters user name "Test" password "Tester" and logins
    Then user should see url contains orders

  Scenario: Login scenario with data table
    When user enters below credentials
      | username     | Test   |
      | password     | Tester |
    Then user should see url contains orders