Feature: User Verification

  @exampleTag
  Scenario: verify login
    Given user is on the login page
    When username is "username" and password is "password"
    Then "username" is logged in
    And user is "admin"


