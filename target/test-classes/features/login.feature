@smoke @Regression @login
Feature: Library app login feature
  User Story:
  As a user, I should be able to login with correct credentials to different accounts and dashboard should be displayed.
  Accounts are: librarian, student, admin

  Background:
    #for the scearious in the feature file, user is expected to be on login page
    Given user is on the library login page
  #same as @BeforeMethod in TestNG


  @smoke @librarian @employee
  Scenario: Login as a librarian
    When user enters librarian username
    And user enters librarian password
    Then user should see dashboard
@student @db
    Scenario: Login as a Student
      When user enters student username
      And user enters student password
      Then user should see dashboard
@admin @employee @smoke
  Scenario: Login as an Admin
    When user enters Admin username
    And user enters Admin password
    Then user should see dashboard