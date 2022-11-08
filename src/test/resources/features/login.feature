Feature: Login
  As a user
  I want to login
  So i can view dashboard

  Scenario: Login with url and body
    Given I set url
    When I request login
    Then I will get 200

  Scenario: Login with url and valid body password is wrong
    Given I set url
    When I request login with wrong password
    Then I will get status code 400

  Scenario: Login with url and valid body
    Given I set url
    When I request login with valid body
    Then I will get status code 400