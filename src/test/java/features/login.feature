Feature: login Functionality
  @log-01
  Scenario: login with valid credential
    Given   user open the browser
    When    user fill the email and password and click on login button
    Then    user should navigate at the homepage