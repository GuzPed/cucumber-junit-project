Feature: care options testing

  @workNow
  Scenario: hioscar.com care options web app testing
  Given user on the homepage
    When user clicks Search button
    And from Coverage year dropdown Select 2023 option
    And from Coverage access dropdown Select "Employer-provided" option
    And from Network partner dropdown Select "Oscar option"
    And from Coverage area dropdown Select "New Jersey"
    And click Continue button
    Then verify title contains “Oscar”

