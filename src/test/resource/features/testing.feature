Feature: Test login functionality

  Scenario: check login is successfull with valid credential
    Given browser is open
    And user is on login page
    When user enter username and password
    And user clicks on login
    Then user is navigated to the home page
