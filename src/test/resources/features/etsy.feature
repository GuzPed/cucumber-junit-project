
Feature: Title Verification
  User Story: As a user, i should see "Etsy - Shop for handmade, vintage, custom, and unique gifts for
  everyone" title


  Scenario: Verify Etsy Title
    Given User is on Etsy homepage
    When User sees title is as expected Etsy - Shop for handmade, vintage, custom, and unique gifts for everyone

    Scenario: Etsy Search Functionality Title Verification
      Given User is on Etsy homepage
      When User enters Wooden Spoon in search box
      And User clicks submit button
      Then User sees Wooden Spoon in the title

Scenario:Etsy Search Functionality Title Verification
  Given User is on Etsy homepage
  When User enters "Wooden Spoon" in search box
  And User clicks submit button
  Then User sees "Wooden spoon" in the title
