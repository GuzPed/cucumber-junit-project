Feature: Google search functionality
  User story: As a user, when I am on the google search page
  I should be able whatever i want and see relevant info

  # @wip  #everytime you work on some scenario, the comp will be focused only on this one - Working In Progress
  Scenario: Search functionality result title verification
    Given User is on Google search page
    When User types apple in the google search box and clicks enter
    Then  User sees apple – Google Search is in the google title

  Scenario: Search functionality result title verification
    Given User is on Google search page
    When User types "tesla" in the google search box and clicks enter
    Then  User sees "tesla - Google Search" is in the google title
