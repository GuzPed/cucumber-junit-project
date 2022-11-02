Feature: Wikipedia Search Functionality and Verification

  Background:
    Given User is on Wikipedia home page


  Scenario: Wikipedia Search Functionality Title Verification
    When User types Steve Jobs in the wiki search box
    And User clicks wiki search button
    Then User sees Steve Jobs is in the wiki title

  Scenario: Wikipedia Search Functionality Title Verification
    When User types "Steve Jobs" in the wiki search box
    And User clicks wiki search button
    Then User sees "Steve Jobs" is in the wiki title

@ScenarioOutlinePractice
  Scenario Outline: Wikipedia Search Functionality Header Verification
    When User types "<searchValue>" in the wiki search box
    And User clicks wiki search button
    Then User sees "<expectedTitle>" is in the main header
    Examples:
      | searchValue | expectedTitle |
      | Steve Jobs  | Steve Jobs    |
      | Shakira     | Shakira       |

  Scenario:
  When User types Steve Jobs in the wiki search box
  And User clicks wiki search button
  Then User sees Steve Jobs is in the image header



